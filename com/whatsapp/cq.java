package com.whatsapp;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.whatsapp.util.Log;
import com.whatsapp.util.br;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class cq implements LocationListener {
    private static final String z;
    final b8 a;
    final avu b;

    static {
        char[] toCharArray = "\u0003@\u0017}I\u0001[\u000bv\u0015\u001e]\u0007yN\u001b]\n7Y\u001aS\n\u007f_\u0016\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 50;
                    break;
                case ay.n /*2*/:
                    i2 = 100;
                    break;
                case ay.p /*3*/:
                    i2 = 24;
                    break;
                default:
                    i2 = 58;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public void onProviderEnabled(String str) {
    }

    cq(avu com_whatsapp_avu, b8 b8Var) {
        this.b = com_whatsapp_avu;
        this.a = b8Var;
    }

    public void onProviderDisabled(String str) {
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            Log.i(z + location.getTime() + " " + location.getAccuracy());
            br.a(new ql(this.b, location));
            this.a.a((LocationListener) this);
        }
    }
}
