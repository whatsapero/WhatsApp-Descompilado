package com.google.android.gms.maps;

import android.os.Parcel;

public class b {
    static void a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        boolean z = false;
        boolean z2 = MapView.a;
        int H = com.google.android.gms.common.internal.safeparcel.b.H(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, googleMapOptions.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, googleMapOptions.nD());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, googleMapOptions.nE());
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 4, googleMapOptions.getMapType());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, googleMapOptions.getCamera(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, googleMapOptions.nF());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, googleMapOptions.nG());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, googleMapOptions.nH());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, googleMapOptions.nI());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, googleMapOptions.nJ());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, googleMapOptions.nK());
        com.google.android.gms.common.internal.safeparcel.b.H(parcel, H);
        if (GoogleMap.a) {
            if (!z2) {
                z = true;
            }
            MapView.a = z;
        }
    }
}
