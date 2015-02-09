package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.d.a;
import java.net.URLEncoder;
import org.whispersystems.libaxolotl.a6;

class dm {
    private static bz a(bz bzVar) {
        try {
            return new bz(di.u(dg(di.j((a) bzVar.getObject()))), bzVar.pX());
        } catch (Throwable e) {
            bh.b("Escape URI: unsupported encoding", e);
            return bzVar;
        }
    }

    private static bz a(bz bzVar, int i) {
        if (q((a) bzVar.getObject())) {
            switch (i) {
                case a6.s /*12*/:
                    return a(bzVar);
                default:
                    bh.T("Unsupported Value Escaping: " + i);
                    return bzVar;
            }
        }
        bh.T("Escaping can only be applied to strings.");
        return bzVar;
    }

    static bz a(bz bzVar, int[] iArr) {
        int i = DataLayer.a;
        int length = iArr.length;
        int i2 = 0;
        bz bzVar2 = bzVar;
        while (i2 < length) {
            bzVar2 = a(bzVar2, iArr[i2]);
            i2++;
            if (i != 0) {
                break;
            }
        }
        return bzVar2;
    }

    static String dg(String str) {
        return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }

    private static boolean q(a aVar) {
        return di.o(aVar) instanceof String;
    }
}
