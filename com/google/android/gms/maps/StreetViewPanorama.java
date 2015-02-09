package com.google.android.gms.maps;

import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;

public class StreetViewPanorama {
    private final IStreetViewPanoramaDelegate alg;

    protected StreetViewPanorama(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.alg = (IStreetViewPanoramaDelegate) jx.i(iStreetViewPanoramaDelegate);
    }
}
