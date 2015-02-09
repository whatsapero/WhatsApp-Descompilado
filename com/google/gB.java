package com.google;

import java.io.Serializable;
import java.util.Comparator;

final class gb implements Comparator, Serializable {
    gb(dc dcVar) {
        this();
    }

    public int compare(Object obj, Object obj2) {
        return a((cu) obj, (cu) obj2);
    }

    public int a(cu cuVar, cu cuVar2) {
        boolean z = cK.d;
        int intValue = ((Integer) cuVar.e().get(bU.STRUCTURED_APPEND_SEQUENCE)).intValue();
        int intValue2 = ((Integer) cuVar2.e().get(bU.STRUCTURED_APPEND_SEQUENCE)).intValue();
        if (intValue < intValue2) {
            return -1;
        }
        if (intValue > intValue2) {
            return 1;
        }
        if (z) {
            gC.a = !gC.a;
        }
        return 0;
    }

    private gb() {
    }
}
