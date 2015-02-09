package com.google;

public final class b_ {
    private final br a;

    private int[] a(aZ aZVar, aZ aZVar2, int[] iArr) {
        int i = br.d;
        int a = aZVar2.a();
        int[] iArr2 = new int[a];
        int i2 = 1;
        while (i2 <= a) {
            iArr2[a - i2] = this.a.b(i2, aZVar2.b(i2));
            i2++;
            if (i != 0) {
                break;
            }
        }
        aZ aZVar3 = new aZ(this.a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        i2 = 0;
        while (i2 < length) {
            int b = this.a.b(iArr[i2]);
            iArr3[i2] = this.a.b(this.a.c(0, aZVar.c(b)), this.a.b(aZVar3.c(b)));
            i2++;
            if (i != 0) {
                break;
            }
        }
        return iArr3;
    }

    private int[] a(aZ aZVar) {
        int i = br.d;
        int a = aZVar.a();
        int[] iArr = new int[a];
        int i2 = 0;
        int i3 = 1;
        while (i3 < this.a.b() && i2 < a) {
            if (aZVar.c(i3) == 0) {
                iArr[i2] = this.a.b(i3);
                i2++;
            }
            i3++;
            if (i != 0) {
                break;
            }
        }
        if (i2 == a) {
            return iArr;
        }
        throw gp.a();
    }

    public int a(int[] iArr, int i, int[] iArr2) {
        aZ c;
        aZ aZVar;
        int i2 = 0;
        int i3 = br.d;
        aZ aZVar2 = new aZ(this.a, iArr);
        int[] iArr3 = new int[i];
        int i4 = i;
        int i5 = 0;
        while (i4 > 0) {
            int c2 = aZVar2.c(this.a.a(i4));
            iArr3[i - i4] = c2;
            if (c2 != 0) {
                c2 = 1;
            } else {
                c2 = i5;
            }
            i5 = i4 - 1;
            int[] a;
            int[] a2;
            if (i3 != 0) {
                boolean z;
                if (gC.a) {
                    z = false;
                } else {
                    z = true;
                }
                gC.a = z;
                i5 = c2;
                if (i5 == 0) {
                    return 0;
                }
                c = this.a.c();
                if (iArr2 != null) {
                    i4 = iArr2.length;
                    aZVar = c;
                    i5 = 0;
                    while (i5 < i4) {
                        int a3 = this.a.a((iArr.length - 1) - iArr2[i5]);
                        aZVar = aZVar.c(new aZ(this.a, new int[]{this.a.c(0, a3), 1}));
                        i5++;
                        if (i3 != 0) {
                            break;
                        }
                    }
                }
                aZ[] a4 = a(this.a.a(i, 1), new aZ(this.a, iArr3), i);
                aZVar = a4[0];
                c = a4[1];
                a = a(aZVar);
                a2 = a(c, aZVar, a);
                while (i2 < a.length) {
                    c2 = (iArr.length - 1) - this.a.c(a[i2]);
                    if (c2 < 0) {
                        iArr[c2] = this.a.c(iArr[c2], a2[i2]);
                        i2++;
                        if (i3 != 0) {
                            break;
                        }
                    }
                    throw gp.a();
                }
                return a.length;
            }
            i4 = i5;
            i5 = c2;
        }
        if (i5 == 0) {
            return 0;
        }
        c = this.a.c();
        if (iArr2 != null) {
            i4 = iArr2.length;
            aZVar = c;
            i5 = 0;
            while (i5 < i4) {
                int a32 = this.a.a((iArr.length - 1) - iArr2[i5]);
                aZVar = aZVar.c(new aZ(this.a, new int[]{this.a.c(0, a32), 1}));
                i5++;
                if (i3 != 0) {
                    break;
                }
            }
        }
        aZ[] a42 = a(this.a.a(i, 1), new aZ(this.a, iArr3), i);
        aZVar = a42[0];
        c = a42[1];
        a = a(aZVar);
        a2 = a(c, aZVar, a);
        while (i2 < a.length) {
            c2 = (iArr.length - 1) - this.a.c(a[i2]);
            if (c2 < 0) {
                iArr[c2] = this.a.c(iArr[c2], a2[i2]);
                i2++;
                if (i3 != 0) {
                    break;
                    return a.length;
                }
            }
            throw gp.a();
        }
        return a.length;
    }

    private aZ[] a(aZ aZVar, aZ aZVar2, int i) {
        aZ a;
        int i2 = br.d;
        if (aZVar.a() >= aZVar2.a()) {
            aZ aZVar3 = aZVar2;
            aZVar2 = aZVar;
            aZVar = aZVar3;
        }
        aZ a2 = this.a.a();
        aZ c = this.a.c();
        while (aZVar.a() >= i / 2) {
            if (aZVar.c()) {
                throw gp.a();
            }
            a = this.a.a();
            int b = this.a.b(aZVar.b(aZVar.a()));
            while (aZVar2.a() >= aZVar.a() && !aZVar2.c()) {
                int a3 = aZVar2.a() - aZVar.a();
                int b2 = this.a.b(aZVar2.b(aZVar2.a()), b);
                a = a.b(this.a.a(a3, b2));
                aZVar2 = aZVar2.a(aZVar.a(a3, b2));
                if (i2 != 0) {
                    break;
                }
            }
            aZ aZVar4 = a;
            a = aZVar2;
            a2 = aZVar4.c(c).a(a2).b();
            if (i2 != 0) {
                break;
            }
            aZVar2 = aZVar;
            aZVar = a;
            aZVar3 = c;
            c = a2;
            a2 = aZVar3;
        }
        a2 = c;
        a = aZVar;
        int b3 = a2.b(0);
        if (b3 == 0) {
            throw gp.a();
        }
        b3 = this.a.b(b3);
        a2 = a2.a(b3);
        c = a.a(b3);
        return new aZ[]{a2, c};
    }

    public b_() {
        this.a = br.e;
    }
}
