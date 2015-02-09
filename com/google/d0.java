package com.google;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class d0 extends dy implements Serializable {
    protected static boolean d = false;
    private static final long serialVersionUID = 1;
    private static final String[] z;

    protected abstract cj a(b1 b1Var);

    protected abstract er b();

    static {
        int i;
        int i2;
        String[] strArr = new String[7];
        char[] toCharArray = "Z\u0011\u0002\u0016n|\u0000\t\u0017<p\u0011\u001f\u0000}z\u0011L\u0010p|\u0007\u001fS>".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 116;
                    break;
                case ay.n /*2*/:
                    i2 = 108;
                    break;
                case ay.p /*3*/:
                    i2 = 115;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "?T\u0001\u001aon\u001d\u0002\u0014<p\u0011\u0018\u001bsyTN".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 116;
                    break;
                case ay.n /*2*/:
                    i2 = 108;
                    break;
                case ay.p /*3*/:
                    i2 = 115;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "?Z".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 116;
                    break;
                case ay.n /*2*/:
                    i2 = 108;
                    break;
                case ay.p /*3*/:
                    i2 = 115;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "I\u001c\u0005\u0000<t\u0007L\u0000im\u0004\u0003\u0000yyT\u0018\u001c<\u007f\u0011L\u001cjx\u0006\u001e\u001axy\u0011\u0002S~dT\u001f\u0006~~\u0018\r\u0000ox\u0007B".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 116;
                    break;
                case ay.n /*2*/:
                    i2 = 108;
                    break;
                case ay.p /*3*/:
                    i2 = 115;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "I\u001c\u0005\u0000<t\u0007L\u0000im\u0004\u0003\u0000yyT\u0018\u001c<\u007f\u0011L\u001cjx\u0006\u001e\u001axy\u0011\u0002S~dT\u001f\u0006~~\u0018\r\u0000ox\u0007B".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 116;
                    break;
                case ay.n /*2*/:
                    i2 = 108;
                    break;
                case ay.p /*3*/:
                    i2 = 115;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "^\u001b\u0019\u001fxsS\u0018Sin\u0011L9}k\u0015L\u0001y{\u0018\t\u0010ht\u001b\u0002ShrT\u0005\u001elq\u0011\u0001\u0016riT\u001c\u0001si\u001b\u000f\u001cp=\u0019\t\u0000o|\u0013\tSnx\u0012\u0000\u0016\u007fi\u001d\u0003\u001d2".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 116;
                    break;
                case ay.n /*2*/:
                    i2 = 108;
                    break;
                case ay.p /*3*/:
                    i2 = 115;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "H\u001a\t\u000blx\u0017\u0018\u0016x=\u0011\u0014\u0010ym\u0000\u0005\u001cr=\u0000\u0004\u0001sj\u001aL\u0011e=\u0013\t\u001dyo\u0015\u0018\u0016x=\u0015\u000f\u0010yn\u0007\u0003\u0001<p\u0011\u0018\u001bsyZ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 116;
                    break;
                case ay.n /*2*/:
                    i2 = 108;
                    break;
                case ay.p /*3*/:
                    i2 = 115;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        z = strArr;
        d = false;
    }

    public Object b(dW dWVar) {
        return er.a(b(), dWVar).c(this);
    }

    protected void c() {
    }

    protected d0() {
    }

    public M c() {
        return er.a(b());
    }

    public static V a(Class cls, eb ebVar) {
        return new V(null, cls, ebVar, null);
    }

    private static Object b(Method method, Object obj, Object[] objArr) {
        Throwable e;
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable e2) {
            throw new RuntimeException(z[5], e2);
        } catch (InvocationTargetException e3) {
            e2 = e3.getCause();
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            } else if (e2 instanceof Error) {
                throw ((Error) e2);
            } else {
                throw new RuntimeException(z[6], e2);
            }
        } catch (IllegalAccessException e4) {
            throw e4;
        } catch (IllegalAccessException e42) {
            throw e42;
        }
    }

    public Object a(dW dWVar, int i) {
        return er.a(b(), dWVar).a(this, i);
    }

    public int a(dW dWVar) {
        return er.a(b(), dWVar).b(this);
    }

    public eS b() {
        throw new UnsupportedOperationException(z[4]);
    }

    static Object a(Method method, Object obj, Object[] objArr) {
        return b(method, obj, objArr);
    }

    protected d0(ax axVar) {
    }

    public static V a(eb ebVar, int i, Class cls, eb ebVar2) {
        return new V(new T(ebVar, i), cls, ebVar2, null);
    }

    static Method b(Class cls, String str, Class[] clsArr) {
        return a(cls, str, clsArr);
    }

    public boolean a(dW dWVar) {
        return er.a(b(), dWVar).a(this);
    }

    private Map d() {
        boolean z = dy.b;
        Map treeMap = new TreeMap();
        for (dW dWVar : er.a(b()).e()) {
            if (dWVar.a()) {
                List list = (List) b(dWVar);
                try {
                    if (!list.isEmpty()) {
                        treeMap.put(dWVar, list);
                    }
                } catch (UnsupportedOperationException e) {
                    throw e;
                }
                if (!z) {
                    continue;
                    if (z) {
                        break;
                    }
                }
            }
            try {
                if (a(dWVar)) {
                    treeMap.put(dWVar, b(dWVar));
                    continue;
                } else {
                    continue;
                }
            } catch (UnsupportedOperationException e2) {
                throw e2;
            }
            if (z) {
                break;
            }
        }
        return treeMap;
    }

    protected Object writeReplace() {
        return new cv(this);
    }

    protected boolean a(I i, ej ejVar, aC aCVar, int i2) {
        return ejVar.a(i2, i);
    }

    private static Method a(Class cls, String str, Class[] clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable e) {
            throw new RuntimeException(z[0] + cls.getName() + z[1] + str + z[2], e);
        }
    }

    public boolean a() {
        boolean z = dy.b;
        for (dW dWVar : c().e()) {
            try {
                try {
                    if (dWVar.m()) {
                        if (!a(dWVar)) {
                            return false;
                        }
                    }
                    try {
                        if (dWVar.f() == f0.MESSAGE) {
                            if (dWVar.a()) {
                                for (eb ebVar : (List) b(dWVar)) {
                                    try {
                                        if (ebVar.a()) {
                                            if (z) {
                                                break;
                                            }
                                        }
                                        return false;
                                    } catch (UnsupportedOperationException e) {
                                        throw e;
                                    }
                                }
                                if (!z) {
                                    continue;
                                }
                            }
                            try {
                                if (!a(dWVar)) {
                                    continue;
                                } else if (!((eb) b(dWVar)).a()) {
                                    return false;
                                }
                            } catch (UnsupportedOperationException e2) {
                                throw e2;
                            } catch (UnsupportedOperationException e22) {
                                throw e22;
                            }
                        }
                        if (z) {
                            break;
                        }
                    } catch (UnsupportedOperationException e222) {
                        throw e222;
                    }
                } catch (UnsupportedOperationException e2222) {
                    throw e2222;
                } catch (UnsupportedOperationException e22222) {
                    throw e22222;
                }
            }
        }
        return true;
    }

    public eR c() {
        throw new UnsupportedOperationException(z[3]);
    }

    public Map a() {
        return Collections.unmodifiableMap(d());
    }

    static void a() {
        d = true;
    }

    static Map a(d0 d0Var) {
        return d0Var.d();
    }
}
