package org.aspectj.internal.lang.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.StringTokenizer;
import org.aspectj.lang.reflect.AjTypeSystem;

public class StringToType {

    static class AnonymousClass_1 implements ParameterizedType {
        final /* synthetic */ Class val$baseClass;
        final /* synthetic */ Type[] val$typeParams;

        AnonymousClass_1(Type[] typeArr, Class cls) {
            this.val$typeParams = typeArr;
            this.val$baseClass = cls;
        }

        public Type[] getActualTypeArguments() {
            return this.val$typeParams;
        }

        public Type getRawType() {
            return this.val$baseClass;
        }

        public Type getOwnerType() {
            return this.val$baseClass.getEnclosingClass();
        }
    }

    public static Type[] commaSeparatedListToTypeArray(String typeNames, Class classScope) throws ClassNotFoundException {
        StringTokenizer strTok = new StringTokenizer(typeNames, ",");
        Type[] ret = new Type[strTok.countTokens()];
        int index = 0;
        while (strTok.hasMoreTokens()) {
            int index2 = index + 1;
            ret[index] = stringToType(strTok.nextToken().trim(), classScope);
            index = index2;
        }
        return ret;
    }

    public static Type stringToType(String typeName, Class classScope) throws ClassNotFoundException {
        try {
            return typeName.indexOf("<") == -1 ? AjTypeSystem.getAjType(Class.forName(typeName, false, classScope.getClassLoader())) : makeParameterizedType(typeName, classScope);
        } catch (ClassNotFoundException e) {
            TypeVariable[] tVars = classScope.getTypeParameters();
            for (int i = 0; i < tVars.length; i++) {
                if (tVars[i].getName().equals(typeName)) {
                    return tVars[i];
                }
            }
            throw new ClassNotFoundException(typeName);
        }
    }

    private static Type makeParameterizedType(String typeName, Class classScope) throws ClassNotFoundException {
        int paramStart = typeName.indexOf(60);
        return new AnonymousClass_1(commaSeparatedListToTypeArray(typeName.substring(paramStart + 1, typeName.lastIndexOf(62)), classScope), Class.forName(typeName.substring(0, paramStart), false, classScope.getClassLoader()));
    }
}
