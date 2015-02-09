package com.google.android.gms.maps.internal;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class a {
    public static Boolean a(byte b) {
        switch (b) {
            case PBE.MD5 /*0*/:
                return Boolean.FALSE;
            case ay.f /*1*/:
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    public static byte c(Boolean bool) {
        return bool != null ? bool.booleanValue() ? (byte) 1 : (byte) 0 : (byte) -1;
    }
}
