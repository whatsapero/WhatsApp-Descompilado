package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class UpdatedOurAppReceiver extends BroadcastReceiver {
    private static final String z;

    static {
        char[] toCharArray = "<b1O\f,v:[\n(b%\\\u001d*w<X\u001d;='K\u001b,{#K".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 73;
                    break;
                case ay.f /*1*/:
                    i2 = 18;
                    break;
                case ay.n /*2*/:
                    i2 = 85;
                    break;
                case ay.p /*3*/:
                    i2 = 46;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onReceive(Context context, Intent intent) {
        Log.i(z);
        UpdatedAnyAppReceiver.a();
    }
}
