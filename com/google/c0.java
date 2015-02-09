package com.google;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class c0 implements d9, fh {
    private static int a(bm[] bmVarArr) {
        return Math.min(Math.min(a(bmVarArr[0], bmVarArr[4]), (a(bmVarArr[6], bmVarArr[2]) * 17) / 18), Math.min(a(bmVarArr[1], bmVarArr[5]), (a(bmVarArr[7], bmVarArr[3]) * 17) / 18));
    }

    public cu a(W w, Map map) {
        boolean z = false;
        boolean z2 = bQ.c;
        cu[] a = a(w, map, false);
        if (a == null || a.length == 0 || a[0] == null) {
            throw gv.a();
        }
        cu cuVar = a[0];
        if (z2) {
            if (!gC.a) {
                z = true;
            }
            gC.a = z;
        }
        return cuVar;
    }

    public void a() {
    }

    private static int a(bm bmVar, bm bmVar2) {
        return (bmVar == null || bmVar2 == null) ? Integer.MAX_VALUE : (int) Math.abs(bmVar.a() - bmVar2.a());
    }

    private static cu[] a(W w, Map map, boolean z) {
        boolean z2 = bQ.c;
        List arrayList = new ArrayList();
        e4 a = a.a(w, map, z);
        for (bm[] bmVarArr : a.b()) {
            gd a2 = fZ.a(a.a(), bmVarArr[4], bmVarArr[5], bmVarArr[6], bmVarArr[7], a(bmVarArr), b(bmVarArr));
            cu cuVar = new cu(a2.e(), a2.a(), bmVarArr, R.PDF_417);
            cuVar.a(bU.ERROR_CORRECTION_LEVEL, a2.c());
            bf bfVar = (bf) a2.b();
            if (bfVar != null) {
                cuVar.a(bU.PDF417_EXTRA_METADATA, bfVar);
            }
            arrayList.add(cuVar);
            if (z2) {
                break;
            }
        }
        return (cu[]) arrayList.toArray(new cu[arrayList.size()]);
    }

    private static int b(bm bmVar, bm bmVar2) {
        return (bmVar == null || bmVar2 == null) ? 0 : (int) Math.abs(bmVar.a() - bmVar2.a());
    }

    private static int b(bm[] bmVarArr) {
        return Math.max(Math.max(b(bmVarArr[0], bmVarArr[4]), (b(bmVarArr[6], bmVarArr[2]) * 17) / 18), Math.max(b(bmVarArr[1], bmVarArr[5]), (b(bmVarArr[7], bmVarArr[3]) * 17) / 18));
    }
}
