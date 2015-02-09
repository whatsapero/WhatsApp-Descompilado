package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class c9 extends bT {
    private final bT[] b;

    public cu a(int i, da daVar, Map map) {
        bT[] bTVarArr = this.b;
        int length = bTVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                return bTVarArr[i2].a(i, daVar, map);
            } catch (gC e) {
                i2++;
                if (bT.a != 0) {
                    break;
                }
            }
        }
        throw gv.a();
    }

    public void a() {
        int i = bT.a;
        bT[] bTVarArr = this.b;
        int length = bTVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            bTVarArr[i2].a();
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public c9(Map map) {
        boolean z;
        Collection collection = map == null ? null : (Collection) map.get(fm.POSSIBLE_FORMATS);
        if (map == null || map.get(fm.ASSUME_CODE_39_CHECK_DIGIT) == null) {
            z = false;
        } else {
            z = true;
        }
        Collection arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(R.EAN_13) || collection.contains(R.UPC_A) || collection.contains(R.EAN_8) || collection.contains(R.UPC_E)) {
                arrayList.add(new cZ(map));
            }
            if (collection.contains(R.CODE_39)) {
                arrayList.add(new cW(z));
            }
            if (collection.contains(R.CODE_93)) {
                arrayList.add(new ce());
            }
            if (collection.contains(R.CODE_128)) {
                arrayList.add(new b7());
            }
            if (collection.contains(R.ITF)) {
                arrayList.add(new cD());
            }
            if (collection.contains(R.CODABAR)) {
                arrayList.add(new bG());
            }
            if (collection.contains(R.RSS_14)) {
                arrayList.add(new c3());
            }
            if (collection.contains(R.RSS_EXPANDED)) {
                arrayList.add(new cm());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new cZ(map));
            arrayList.add(new cW());
            arrayList.add(new bG());
            arrayList.add(new ce());
            arrayList.add(new b7());
            arrayList.add(new cD());
            arrayList.add(new c3());
            arrayList.add(new cm());
        }
        this.b = (bT[]) arrayList.toArray(new bT[arrayList.size()]);
    }
}
