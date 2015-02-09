package com.google;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class dy extends dP implements eb {
    public static boolean b;
    private int c;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d() {
        /*
        r8_this = this;
        r4 = b;
        r0 = r8.c;
        r1 = -1;
        if (r0 == r1) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = 0;
        r1 = r8.c();
        r1 = r1.d();
        r5 = r1.f();
        r1 = r8.a();
        r1 = r1.entrySet();
        r6 = r1.iterator();
        r3 = r0;
    L_0x0022:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x007c;
    L_0x0028:
        r0 = r6.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (com.google.dW) r1;
        r2 = r0.getValue();
        if (r5 == 0) goto L_0x005c;
    L_0x003a:
        r0 = r1.n();
        if (r0 == 0) goto L_0x005c;
    L_0x0040:
        r0 = r1.k();
        r7 = com.google.dH.MESSAGE;
        if (r0 != r7) goto L_0x005c;
    L_0x0048:
        r0 = r1.a();
        if (r0 != 0) goto L_0x005c;
    L_0x004e:
        r7 = r1.e();
        r0 = r2;
        r0 = (com.google.eb) r0;
        r0 = com.google.bF.b(r7, r0);
        r3 = r3 + r0;
        if (r4 == 0) goto L_0x007a;
    L_0x005c:
        r0 = com.google.co.a(r1, r2);
        r0 = r0 + r3;
    L_0x0061:
        if (r4 == 0) goto L_0x0078;
    L_0x0063:
        r1 = r8.b();
        if (r5 == 0) goto L_0x0070;
    L_0x0069:
        r2 = r1.g();
        r0 = r0 + r2;
        if (r4 == 0) goto L_0x0075;
    L_0x0070:
        r1 = r1.d();
        r0 = r0 + r1;
    L_0x0075:
        r8.c = r0;
        goto L_0x0007;
    L_0x0078:
        r3 = r0;
        goto L_0x0022;
    L_0x007a:
        r0 = r3;
        goto L_0x0061;
    L_0x007c:
        r0 = r3;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dy.d():int");
    }

    public void a(bF bFVar) {
        boolean z = b;
        boolean f = c().d().f();
        for (Entry entry : a().entrySet()) {
            eY eYVar = (dW) entry.getKey();
            Object value = entry.getValue();
            if (f && eYVar.n() && eYVar.k() == dH.MESSAGE && !eYVar.a()) {
                bFVar.f(eYVar.e(), (eb) value);
                if (!z) {
                    continue;
                    if (z) {
                        break;
                    }
                }
            }
            co.a(eYVar, value, bFVar);
            continue;
            if (z) {
                break;
            }
        }
        eS b = b();
        if (f) {
            b.b(bFVar);
            if (!z) {
                return;
            }
        }
        b.a(bFVar);
    }

    protected int a(int i, Map map) {
        boolean z = b;
        for (Entry entry : map.entrySet()) {
            dW dWVar = (dW) entry.getKey();
            Object value = entry.getValue();
            int e = (i * 37) + dWVar.e();
            if (dWVar.k() != dH.ENUM) {
                e = (e * 53) + value.hashCode();
                if (!z) {
                    i = e;
                    continue;
                    if (z) {
                        break;
                    }
                }
            }
            int i2 = e;
            if (dWVar.a()) {
                i2 = (i2 * 53) + a((List) value);
                if (!z) {
                    i = i2;
                    continue;
                    if (z) {
                        break;
                    }
                }
            }
            i = (i2 * 53) + a((bZ) value);
            continue;
            if (z) {
                break;
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        if (c() != ebVar.c()) {
            return false;
        }
        return a().equals(ebVar.a()) && b().equals(ebVar.b());
    }

    protected static int a(bZ bZVar) {
        return bZVar.getNumber();
    }

    public dy() {
        this.c = -1;
    }

    protected static int a(List list) {
        boolean z = b;
        int i = 1;
        for (bZ bZVar : list) {
            int a = a(bZVar) + (i * 31);
            if (z) {
                return a;
            }
            i = a;
        }
        return i;
    }

    public int hashCode() {
        return (a(c().hashCode() + 779, a()) * 29) + b().hashCode();
    }

    a2 a() {
        return aI.b(this);
    }

    public final String toString() {
        return fY.a((eE) this);
    }

    public boolean a() {
        boolean z = b;
        for (dW dWVar : c().e()) {
            if (!dWVar.m() || a(dWVar)) {
                if (z) {
                    break;
                }
            }
            return false;
        }
        for (Entry entry : a().entrySet()) {
            dW dWVar2 = (dW) entry.getKey();
            if (dWVar2.f() == f0.MESSAGE) {
                if (dWVar2.a()) {
                    for (eb ebVar : (List) entry.getValue()) {
                        if (ebVar.a()) {
                            if (z) {
                                break;
                            }
                        }
                        return false;
                    }
                    if (!z) {
                        continue;
                    }
                }
                if (!((eb) entry.getValue()).a()) {
                    return false;
                }
            }
            if (z) {
                break;
            }
        }
        return true;
    }
}
