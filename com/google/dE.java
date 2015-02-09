package com.google;

import java.util.Arrays;
import java.util.List;

public final class de {
    private static final de a;
    private List b;
    private List c;
    private List d;
    private List e;
    private List f;

    static List c(de deVar) {
        return deVar.b;
    }

    static {
        a = a().c();
    }

    static List c(de deVar, List list) {
        deVar.f = list;
        return list;
    }

    static List b(de deVar) {
        return deVar.e;
    }

    de(du duVar) {
        this();
    }

    private de() {
    }

    public int hashCode() {
        return Arrays.hashCode(e());
    }

    static List e(de deVar) {
        return deVar.c;
    }

    static List d(de deVar) {
        return deVar.d;
    }

    static List b(de deVar, List list) {
        deVar.c = list;
        return list;
    }

    static List d(de deVar, List list) {
        deVar.b = list;
        return list;
    }

    public List d() {
        return this.f;
    }

    public int b(int i) {
        boolean z = dy.b;
        int i2 = 0;
        for (g2 g2Var : this.c) {
            int d = bF.d(i, g2Var) + i2;
            if (z) {
                return d;
            }
            i2 = d;
        }
        return i2;
    }

    private Object[] e() {
        return new Object[]{this.b, this.d, this.e, this.c, this.f};
    }

    public int a(int i) {
        int f;
        boolean z = dy.b;
        int i2 = 0;
        for (Long l : this.b) {
            f = bF.f(i, l.longValue()) + i2;
            if (z) {
                break;
            }
            i2 = f;
        }
        f = i2;
        i2 = f;
        for (Integer num : this.d) {
            f = bF.e(i, num.intValue()) + i2;
            if (z) {
                break;
            }
            i2 = f;
        }
        f = i2;
        i2 = f;
        for (Long l2 : this.e) {
            f = bF.e(i, l2.longValue()) + i2;
            if (z) {
                break;
            }
            i2 = f;
        }
        f = i2;
        i2 = f;
        for (g2 g2Var : this.c) {
            f = bF.b(i, g2Var) + i2;
            if (z) {
                break;
            }
            i2 = f;
        }
        f = i2;
        i2 = f;
        for (a1 a1Var : this.f) {
            f = bF.e(i, a1Var) + i2;
            if (z) {
                return f;
            }
            i2 = f;
        }
        return i2;
    }

    static List a(de deVar, List list) {
        deVar.e = list;
        return list;
    }

    public void a(int i, bF bFVar) {
        boolean z = dy.b;
        for (Long l : this.b) {
            bFVar.a(i, l.longValue());
            if (z) {
                break;
            }
        }
        for (Integer num : this.d) {
            bFVar.f(i, num.intValue());
            if (z) {
                break;
            }
        }
        for (Long l2 : this.e) {
            bFVar.b(i, l2.longValue());
            if (z) {
                break;
            }
        }
        for (g2 g2Var : this.c) {
            bFVar.a(i, g2Var);
            if (z) {
                break;
            }
        }
        for (a1 a1Var : this.f) {
            bFVar.c(i, a1Var);
            if (z) {
                return;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return !(obj instanceof de) ? false : Arrays.equals(e(), ((de) obj).e());
    }

    static List a(de deVar) {
        return deVar.f;
    }

    public List g() {
        return this.c;
    }

    public List c() {
        return this.e;
    }

    public List b() {
        return this.b;
    }

    static List e(de deVar, List list) {
        deVar.d = list;
        return list;
    }

    public static eH a() {
        return eH.a();
    }

    public void b(int i, bF bFVar) {
        boolean z = dy.b;
        for (g2 g2Var : this.c) {
            bFVar.c(i, g2Var);
            if (z) {
                return;
            }
        }
    }

    public List f() {
        return this.d;
    }
}
