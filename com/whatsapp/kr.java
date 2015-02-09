package com.whatsapp;

import java.util.Comparator;

final class kr implements Comparator {
    kr() {
    }

    public int compare(Object obj, Object obj2) {
        return a((az8) obj, (az8) obj2);
    }

    public int a(az8 com_whatsapp_az8, az8 com_whatsapp_az82) {
        if (com_whatsapp_az8.a.equals(bd.g())) {
            return -1;
        }
        if (com_whatsapp_az82.a.equals(bd.g())) {
            return 1;
        }
        long j = com_whatsapp_az8.b;
        long j2 = com_whatsapp_az82.b;
        if (j == j2) {
            return com_whatsapp_az8.a.compareTo(com_whatsapp_az82.a);
        }
        return j < j2 ? 1 : -1;
    }
}
