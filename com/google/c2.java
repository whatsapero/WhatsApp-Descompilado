package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class c2 implements d9 {
    private d9[] a;
    private Map b;

    public void a() {
        int i = bm.a;
        if (this.a != null) {
            d9[] d9VarArr = this.a;
            int length = d9VarArr.length;
            int i2 = 0;
            while (i2 < length) {
                d9VarArr[i2].a();
                i2++;
                if (i != 0) {
                    return;
                }
            }
        }
    }

    private cu a(W w) {
        if (this.a != null) {
            d9[] d9VarArr = this.a;
            int length = d9VarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return d9VarArr[i].a(w, this.b);
                } catch (gC e) {
                    i++;
                    if (bm.a != 0) {
                        break;
                    }
                }
            }
        }
        throw gv.a();
    }

    public cu a(W w, Map map) {
        a(map);
        return a(w);
    }

    public cu b(W w) {
        if (this.a == null) {
            a(null);
        }
        return a(w);
    }

    public void a(Map map) {
        Object obj;
        Collection collection;
        Object obj2 = null;
        int i = bm.a;
        this.b = map;
        if (map == null || !map.containsKey(fm.TRY_HARDER)) {
            obj = null;
        } else {
            obj = 1;
        }
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(fm.POSSIBLE_FORMATS);
        }
        Collection arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(R.UPC_A) || collection.contains(R.UPC_E) || collection.contains(R.EAN_13) || collection.contains(R.EAN_8) || collection.contains(R.CODABAR) || collection.contains(R.CODE_39) || collection.contains(R.CODE_93) || collection.contains(R.CODE_128) || collection.contains(R.ITF) || collection.contains(R.RSS_14) || collection.contains(R.RSS_EXPANDED)) {
                obj2 = 1;
            }
            if (obj2 != null && obj == null) {
                arrayList.add(new c9(map));
            }
            if (collection.contains(R.QR_CODE)) {
                arrayList.add(new cB());
            }
            if (collection.contains(R.DATA_MATRIX)) {
                arrayList.add(new gs());
            }
            if (collection.contains(R.AZTEC)) {
                arrayList.add(new D());
            }
            if (collection.contains(R.PDF_417)) {
                arrayList.add(new c0());
            }
            if (collection.contains(R.MAXICODE)) {
                arrayList.add(new bb());
            }
            if (!(obj2 == null || obj == null)) {
                arrayList.add(new c9(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (obj == null) {
                arrayList.add(new c9(map));
            }
            arrayList.add(new cB());
            arrayList.add(new gs());
            arrayList.add(new D());
            arrayList.add(new c0());
            arrayList.add(new bb());
            if (obj != null) {
                arrayList.add(new c9(map));
            }
        }
        this.a = (d9[]) arrayList.toArray(new d9[arrayList.size()]);
        if (gC.a) {
            bm.a = i + 1;
        }
    }
}
