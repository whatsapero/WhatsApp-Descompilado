package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.lang.reflect.Advice;
import org.aspectj.lang.reflect.AdviceKind;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.AjTypeSystem;
import org.aspectj.lang.reflect.PointcutExpression;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class AdviceImpl implements Advice {
    private static final String AJC_INTERNAL = "org.aspectj.runtime.internal";
    private final Method adviceMethod;
    private AjType[] exceptionTypes;
    private Type[] genericParameterTypes;
    private boolean hasExtraParam;
    private final AdviceKind kind;
    private AjType[] parameterTypes;
    private PointcutExpression pointcutExpression;

    static /* synthetic */ class AnonymousClass_1 {
        static final /* synthetic */ int[] $SwitchMap$org$aspectj$lang$reflect$AdviceKind;

        static {
            $SwitchMap$org$aspectj$lang$reflect$AdviceKind = new int[AdviceKind.values().length];
            try {
                $SwitchMap$org$aspectj$lang$reflect$AdviceKind[AdviceKind.AFTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$org$aspectj$lang$reflect$AdviceKind[AdviceKind.AFTER_RETURNING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$org$aspectj$lang$reflect$AdviceKind[AdviceKind.AFTER_THROWING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$org$aspectj$lang$reflect$AdviceKind[AdviceKind.AROUND.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$org$aspectj$lang$reflect$AdviceKind[AdviceKind.BEFORE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    protected AdviceImpl(Method method, String pointcut, AdviceKind type) {
        this.hasExtraParam = false;
        this.kind = type;
        this.adviceMethod = method;
        this.pointcutExpression = new PointcutExpressionImpl(pointcut);
    }

    protected AdviceImpl(Method method, String pointcut, AdviceKind type, String extraParamName) {
        this(method, pointcut, type);
        this.hasExtraParam = true;
    }

    public AjType getDeclaringType() {
        return AjTypeSystem.getAjType(this.adviceMethod.getDeclaringClass());
    }

    public Type[] getGenericParameterTypes() {
        if (this.genericParameterTypes == null) {
            Type[] genTypes = this.adviceMethod.getGenericParameterTypes();
            int syntheticCount = 0;
            for (Type t : genTypes) {
                if ((t instanceof Class) && ((Class) t).getPackage().getName().equals(AJC_INTERNAL)) {
                    syntheticCount++;
                }
            }
            this.genericParameterTypes = new Type[(genTypes.length - syntheticCount)];
            for (int i = 0; i < this.genericParameterTypes.length; i++) {
                if (genTypes[i] instanceof Class) {
                    this.genericParameterTypes[i] = AjTypeSystem.getAjType((Class) genTypes[i]);
                } else {
                    this.genericParameterTypes[i] = genTypes[i];
                }
            }
        }
        return this.genericParameterTypes;
    }

    public AjType<?>[] getParameterTypes() {
        if (this.parameterTypes == null) {
            Class<?>[] ptypes = this.adviceMethod.getParameterTypes();
            int syntheticCount = 0;
            for (Class<?> c : ptypes) {
                if (c.getPackage().getName().equals(AJC_INTERNAL)) {
                    syntheticCount++;
                }
            }
            this.parameterTypes = new AjType[(ptypes.length - syntheticCount)];
            for (int i = 0; i < this.parameterTypes.length; i++) {
                this.parameterTypes[i] = AjTypeSystem.getAjType(ptypes[i]);
            }
        }
        return this.parameterTypes;
    }

    public AjType<?>[] getExceptionTypes() {
        if (this.exceptionTypes == null) {
            Class<?>[] exTypes = this.adviceMethod.getExceptionTypes();
            this.exceptionTypes = new AjType[exTypes.length];
            for (int i = 0; i < exTypes.length; i++) {
                this.exceptionTypes[i] = AjTypeSystem.getAjType(exTypes[i]);
            }
        }
        return this.exceptionTypes;
    }

    public AdviceKind getKind() {
        return this.kind;
    }

    public String getName() {
        String adviceName = this.adviceMethod.getName();
        if (!adviceName.startsWith("ajc$")) {
            return adviceName;
        }
        AdviceName name = (AdviceName) this.adviceMethod.getAnnotation(AdviceName.class);
        return name != null ? name.value() : "";
    }

    public PointcutExpression getPointcutExpression() {
        return this.pointcutExpression;
    }

    public String toString() {
        int i;
        StringBuffer sb = new StringBuffer();
        if (getName().length() > 0) {
            sb.append("@AdviceName(\"");
            sb.append(getName());
            sb.append("\") ");
        }
        if (getKind() == AdviceKind.AROUND) {
            sb.append(this.adviceMethod.getGenericReturnType().toString());
            sb.append(" ");
        }
        switch (AnonymousClass_1.$SwitchMap$org$aspectj$lang$reflect$AdviceKind[getKind().ordinal()]) {
            case ay.f /*1*/:
                sb.append("after(");
                break;
            case ay.n /*2*/:
                sb.append("after(");
                break;
            case ay.p /*3*/:
                sb.append("after(");
                break;
            case aj.i /*4*/:
                sb.append("around(");
                break;
            case aV.r /*5*/:
                sb.append("before(");
                break;
        }
        AjType<?>[] ptypes = getParameterTypes();
        int len = ptypes.length;
        if (this.hasExtraParam) {
            len--;
        }
        for (i = 0; i < len; i++) {
            sb.append(ptypes[i].getName());
            if (i + 1 < len) {
                sb.append(",");
            }
        }
        sb.append(") ");
        switch (AnonymousClass_1.$SwitchMap$org$aspectj$lang$reflect$AdviceKind[getKind().ordinal()]) {
            case ay.n /*2*/:
                sb.append("returning");
                if (this.hasExtraParam) {
                    sb.append("(");
                    sb.append(ptypes[len - 1].getName());
                    sb.append(") ");
                    break;
                }
                break;
            case ay.p /*3*/:
                break;
        }
        sb.append("throwing");
        if (this.hasExtraParam) {
            sb.append("(");
            sb.append(ptypes[len - 1].getName());
            sb.append(") ");
        }
        AjType<?>[] exTypes = getExceptionTypes();
        if (exTypes.length > 0) {
            sb.append("throws ");
            for (i = 0; i < exTypes.length; i++) {
                sb.append(exTypes[i].getName());
                if (i + 1 < exTypes.length) {
                    sb.append(",");
                }
            }
            sb.append(" ");
        }
        sb.append(": ");
        sb.append(getPointcutExpression().asString());
        return sb.toString();
    }
}
