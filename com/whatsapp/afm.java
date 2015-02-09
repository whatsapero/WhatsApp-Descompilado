package com.whatsapp;

import java.util.Comparator;

class afm implements Comparator {
    final atb a;

    public int a(PlaceInfo placeInfo, PlaceInfo placeInfo2) {
        return placeInfo.dist < placeInfo2.dist ? -1 : 1;
    }

    afm(atb com_whatsapp_atb) {
        this.a = com_whatsapp_atb;
    }

    public int compare(Object obj, Object obj2) {
        return a((PlaceInfo) obj, (PlaceInfo) obj2);
    }
}
