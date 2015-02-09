package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class aX {
    public static int a;
    private final eX b;
    private final C c;

    public aX(C c) {
        this.c = c;
        this.b = new eX(c);
    }

    public gq a() {
        bm bmVar;
        bm bmVar2;
        int i = a;
        bm[] a = this.b.a();
        bm bmVar3 = a[0];
        bm bmVar4 = a[1];
        bm bmVar5 = a[2];
        bm bmVar6 = a[3];
        List arrayList = new ArrayList(4);
        arrayList.add(a(bmVar3, bmVar4));
        arrayList.add(a(bmVar3, bmVar5));
        arrayList.add(a(bmVar4, bmVar6));
        arrayList.add(a(bmVar5, bmVar6));
        Collections.sort(arrayList, new ch(null));
        eP ePVar = (eP) arrayList.get(0);
        eP ePVar2 = (eP) arrayList.get(1);
        Map hashMap = new HashMap();
        a(hashMap, ePVar.a());
        a(hashMap, ePVar.b());
        a(hashMap, ePVar2.a());
        a(hashMap, ePVar2.b());
        bm bmVar7 = null;
        bm bmVar8 = null;
        bm bmVar9 = null;
        for (Entry entry : hashMap.entrySet()) {
            bmVar = (bm) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                if (i != 0) {
                    boolean z;
                    if (gC.a) {
                        z = false;
                    } else {
                        z = true;
                    }
                    gC.a = z;
                    bmVar7 = bmVar;
                } else {
                    bmVar2 = bmVar9;
                    bmVar9 = bmVar8;
                    if (i == 0) {
                        break;
                    }
                    bmVar7 = bmVar;
                    bmVar8 = bmVar9;
                    bmVar9 = bmVar2;
                }
            }
            if (bmVar8 == null) {
                if (i == 0) {
                    bmVar2 = bmVar9;
                    bmVar9 = bmVar;
                    bmVar = bmVar7;
                    if (i == 0) {
                        break;
                    }
                    bmVar7 = bmVar;
                    bmVar8 = bmVar9;
                    bmVar9 = bmVar2;
                } else {
                    bmVar8 = bmVar;
                }
            }
            bmVar2 = bmVar;
            bmVar9 = bmVar8;
            bmVar = bmVar7;
            if (i == 0) {
                break;
            }
            bmVar7 = bmVar;
            bmVar8 = bmVar9;
            bmVar9 = bmVar2;
        }
        bmVar2 = bmVar9;
        bmVar = bmVar7;
        bmVar9 = bmVar8;
        if (bmVar9 == null || bmVar == null || bmVar2 == null) {
            throw gv.a();
        }
        bm a2;
        C a3;
        bm[] bmVarArr = new bm[]{bmVar9, bmVar, bmVar2};
        bm.a(bmVarArr);
        bmVar9 = bmVarArr[0];
        bmVar = bmVarArr[1];
        bmVar7 = bmVarArr[2];
        bmVar8 = (hashMap.containsKey(bmVar3) || i != 0) ? (hashMap.containsKey(bmVar4) || i != 0) ? (hashMap.containsKey(bmVar5) || i != 0) ? bmVar6 : bmVar5 : bmVar4 : bmVar3;
        int c = a(bmVar7, bmVar8).c();
        int c2 = a(bmVar9, bmVar8).c();
        if ((c & 1) == 1) {
            c++;
        }
        c += 2;
        if ((c2 & 1) == 1) {
            c2++;
        }
        int i2 = c2 + 2;
        if (c * 4 >= i2 * 7 || i2 * 4 >= c * 7) {
            a2 = a(bmVar, bmVar9, bmVar7, bmVar8, c, i2);
            if (a2 == null) {
                a2 = bmVar8;
            }
            int c3 = a(bmVar7, a2).c();
            int c4 = a(bmVar9, a2).c();
            if ((c3 & 1) == 1) {
                c3++;
            }
            if ((c4 & 1) == 1) {
                c4++;
            }
            a3 = a(this.c, bmVar7, bmVar, bmVar9, a2, c3, c4);
            if (i != 0) {
                i2 = c4;
                c = c3;
            }
            return new gq(a3, new bm[]{bmVar7, bmVar, bmVar9, a2});
        }
        bmVar6 = a(bmVar, bmVar9, bmVar7, bmVar8, Math.min(i2, c));
        if (bmVar6 == null) {
            bmVar6 = bmVar8;
        }
        int max = Math.max(a(bmVar7, bmVar6).c(), a(bmVar9, bmVar6).c()) + 1;
        if ((max & 1) == 1) {
            max++;
        }
        a3 = a(this.c, bmVar7, bmVar, bmVar9, bmVar6, max, max);
        a2 = bmVar6;
        return new gq(a3, new bm[]{bmVar7, bmVar, bmVar9, a2});
    }

    private bm a(bm bmVar, bm bmVar2, bm bmVar3, bm bmVar4, int i, int i2) {
        float b = ((float) b(bmVar, bmVar2)) / ((float) i);
        int b2 = b(bmVar3, bmVar4);
        bm bmVar5 = new bm((((bmVar4.a() - bmVar3.a()) / ((float) b2)) * b) + bmVar4.a(), (b * ((bmVar4.b() - bmVar3.b()) / ((float) b2))) + bmVar4.b());
        float b3 = ((float) b(bmVar, bmVar3)) / ((float) i2);
        int b4 = b(bmVar2, bmVar4);
        bm bmVar6 = new bm((((bmVar4.a() - bmVar2.a()) / ((float) b4)) * b3) + bmVar4.a(), (b3 * ((bmVar4.b() - bmVar2.b()) / ((float) b4))) + bmVar4.b());
        if (!a(bmVar5)) {
            return a(bmVar6) ? bmVar6 : null;
        } else {
            if (a(bmVar6)) {
                return Math.abs(i - a(bmVar3, bmVar5).c()) + Math.abs(i2 - a(bmVar2, bmVar5).c()) <= Math.abs(i - a(bmVar3, bmVar6).c()) + Math.abs(i2 - a(bmVar2, bmVar6).c()) ? bmVar5 : bmVar6;
            } else {
                return bmVar5;
            }
        }
    }

    private eP a(bm bmVar, bm bmVar2) {
        Object obj;
        int i;
        int i2;
        int i3;
        int i4 = a;
        int a = (int) bmVar.a();
        int b = (int) bmVar.b();
        int a2 = (int) bmVar2.a();
        int b2 = (int) bmVar2.b();
        if (Math.abs(b2 - b) > Math.abs(a2 - a)) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            int i5 = b2;
            b2 = a2;
            a2 = i5;
            int i6 = b;
            b = a;
            a = i6;
        }
        int abs = Math.abs(b2 - b);
        int abs2 = Math.abs(a2 - a);
        int i7 = (-abs) / 2;
        int i8 = a < a2 ? 1 : -1;
        if (b < b2) {
            i = 1;
        } else {
            i = -1;
        }
        int i9 = 0;
        C c = this.c;
        if (obj != null) {
            i2 = a;
        } else {
            i2 = b;
        }
        if (obj != null) {
            i3 = b;
        } else {
            i3 = a;
        }
        boolean a3 = c.a(i2, i3);
        i3 = a;
        int i10 = i7;
        while (b != b2) {
            C c2 = this.c;
            if (obj != null) {
                i7 = i3;
            } else {
                i7 = b;
            }
            if (obj != null) {
                a = b;
            } else {
                a = i3;
            }
            boolean a4 = c2.a(i7, a);
            if (a4 != a3) {
                a3 = a4;
                a = i9 + 1;
            } else {
                a = i9;
            }
            i9 = i10 + abs2;
            if (i9 > 0) {
                if (i3 == a2 && i4 == 0) {
                    a2 = a;
                    break;
                }
                i3 += i8;
                i9 -= abs;
            }
            b += i;
            if (i4 != 0) {
                a2 = a;
                break;
            }
            i10 = i9;
            i9 = a;
        }
        a2 = i9;
        return new eP(bmVar, bmVar2, a2, null);
    }

    private bm a(bm bmVar, bm bmVar2, bm bmVar3, bm bmVar4, int i) {
        float b = ((float) b(bmVar, bmVar2)) / ((float) i);
        int b2 = b(bmVar3, bmVar4);
        bm bmVar5 = new bm((((bmVar4.a() - bmVar3.a()) / ((float) b2)) * b) + bmVar4.a(), (b * ((bmVar4.b() - bmVar3.b()) / ((float) b2))) + bmVar4.b());
        float b3 = ((float) b(bmVar, bmVar3)) / ((float) i);
        int b4 = b(bmVar2, bmVar4);
        bm bmVar6 = new bm((((bmVar4.a() - bmVar2.a()) / ((float) b4)) * b3) + bmVar4.a(), (b3 * ((bmVar4.b() - bmVar2.b()) / ((float) b4))) + bmVar4.b());
        return !a(bmVar5) ? a(bmVar6) ? bmVar6 : null : (!a(bmVar6) || Math.abs(a(bmVar3, bmVar5).c() - a(bmVar2, bmVar5).c()) <= Math.abs(a(bmVar3, bmVar6).c() - a(bmVar2, bmVar6).c())) ? bmVar5 : bmVar6;
    }

    private boolean a(bm bmVar) {
        return bmVar.a() >= 0.0f && bmVar.a() < ((float) this.c.b()) && bmVar.b() > 0.0f && bmVar.b() < ((float) this.c.f());
    }

    private static C a(C c, bm bmVar, bm bmVar2, bm bmVar3, bm bmVar4, int i, int i2) {
        return dE.a().a(c, i, i2, 0.5f, 0.5f, ((float) i) - 0.5f, 0.5f, ((float) i) - 0.5f, ((float) i2) - 0.5f, 0.5f, ((float) i2) - 0.5f, bmVar.a(), bmVar.b(), bmVar4.a(), bmVar4.b(), bmVar3.a(), bmVar3.b(), bmVar2.a(), bmVar2.b());
    }

    private static int b(bm bmVar, bm bmVar2) {
        return z.a(bm.a(bmVar, bmVar2));
    }

    private static void a(Map map, bm bmVar) {
        int i;
        Integer num = (Integer) map.get(bmVar);
        if (num == null) {
            i = 1;
        } else {
            i = num.intValue() + 1;
        }
        map.put(bmVar, Integer.valueOf(i));
    }
}
