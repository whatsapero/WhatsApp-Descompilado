package com.whatsapp;

import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.util.undobar.a;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class qm implements a {
    private static final String z;
    final anj a;

    static {
        char[] toCharArray = "k[w".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 1;
                    break;
                case ay.f /*1*/:
                    i2 = 50;
                    break;
                case ay.n /*2*/:
                    i2 = 19;
                    break;
                case ay.p /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 82;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    qm(anj com_whatsapp_anj) {
        this.a = com_whatsapp_anj;
    }

    public void b(Parcelable parcelable) {
        if (parcelable != null) {
            String string = ((Bundle) parcelable).getString(z);
            ConversationsFragment.b(this.a.a.a, string);
            App.aJ.b(string, false);
        }
    }
}
