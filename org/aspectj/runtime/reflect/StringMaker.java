package org.aspectj.runtime.reflect;

import java.lang.reflect.Modifier;

class StringMaker {
    static StringMaker longStringMaker;
    static StringMaker middleStringMaker;
    static StringMaker shortStringMaker;
    int cacheOffset;
    boolean includeArgs;
    boolean includeEnclosingPoint;
    boolean includeJoinPointTypeName;
    boolean includeModifiers;
    boolean includeThrows;
    boolean shortKindName;
    boolean shortPrimaryTypeNames;
    boolean shortTypeNames;

    StringMaker() {
        this.shortTypeNames = true;
        this.includeArgs = true;
        this.includeThrows = false;
        this.includeModifiers = false;
        this.shortPrimaryTypeNames = false;
        this.includeJoinPointTypeName = true;
        this.includeEnclosingPoint = true;
        this.shortKindName = true;
    }

    static {
        shortStringMaker = new StringMaker();
        shortStringMaker.shortTypeNames = true;
        shortStringMaker.includeArgs = false;
        shortStringMaker.includeThrows = false;
        shortStringMaker.includeModifiers = false;
        shortStringMaker.shortPrimaryTypeNames = true;
        shortStringMaker.includeJoinPointTypeName = false;
        shortStringMaker.includeEnclosingPoint = false;
        shortStringMaker.cacheOffset = 0;
        middleStringMaker = new StringMaker();
        middleStringMaker.shortTypeNames = true;
        middleStringMaker.includeArgs = true;
        middleStringMaker.includeThrows = false;
        middleStringMaker.includeModifiers = false;
        middleStringMaker.shortPrimaryTypeNames = false;
        shortStringMaker.cacheOffset = 1;
        longStringMaker = new StringMaker();
        longStringMaker.shortTypeNames = false;
        longStringMaker.includeArgs = true;
        longStringMaker.includeThrows = false;
        longStringMaker.includeModifiers = true;
        longStringMaker.shortPrimaryTypeNames = false;
        longStringMaker.shortKindName = false;
        longStringMaker.cacheOffset = 2;
    }

    String makeKindName(String name) {
        int dash = name.lastIndexOf(45);
        return dash == -1 ? name : name.substring(dash + 1);
    }

    String makeModifiersString(int modifiers) {
        if (!this.includeModifiers) {
            return "";
        }
        String str = Modifier.toString(modifiers);
        return str.length() == 0 ? "" : new StringBuffer().append(str).append(" ").toString();
    }

    String stripPackageName(String name) {
        int dot = name.lastIndexOf(46);
        return dot == -1 ? name : name.substring(dot + 1);
    }

    String makeTypeName(Class type, String typeName, boolean shortName) {
        if (type == null) {
            return "ANONYMOUS";
        }
        if (!type.isArray()) {
            return shortName ? stripPackageName(typeName).replace('$', '.') : typeName.replace('$', '.');
        } else {
            Class componentType = type.getComponentType();
            return new StringBuffer().append(makeTypeName(componentType, componentType.getName(), shortName)).append("[]").toString();
        }
    }

    public String makeTypeName(Class type) {
        return makeTypeName(type, type.getName(), this.shortTypeNames);
    }

    public String makePrimaryTypeName(Class type, String typeName) {
        return makeTypeName(type, typeName, this.shortPrimaryTypeNames);
    }

    public void addTypeNames(StringBuffer buf, Class[] types) {
        for (int i = 0; i < types.length; i++) {
            if (i > 0) {
                buf.append(", ");
            }
            buf.append(makeTypeName(types[i]));
        }
    }

    public void addSignature(StringBuffer buf, Class[] types) {
        if (types != null) {
            if (this.includeArgs) {
                buf.append("(");
                addTypeNames(buf, types);
                buf.append(")");
            } else if (types.length == 0) {
                buf.append("()");
            } else {
                buf.append("(..)");
            }
        }
    }

    public void addThrows(StringBuffer buf, Class[] types) {
        if (this.includeThrows && types != null && types.length != 0) {
            buf.append(" throws ");
            addTypeNames(buf, types);
        }
    }
}
