package com;

import com.whatsapp.DialogToastActivity;
import java.security.Provider;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class a extends Provider {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "&5QSx\u0010\u0002SHn\u001a=\u001cuB4abtD2";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 117;
                        break;
                    case ay.f /*1*/:
                        i3 = 80;
                        break;
                    case ay.n /*2*/:
                        i3 = 50;
                        break;
                    case ay.p /*3*/:
                        i3 = 38;
                        break;
                    default:
                        i3 = 10;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "4p~Od\u0000(\u001fUz\u00103[@c\u0016p@Gd\u0011?_\u0006d\u0000=PCxU @I|\u001c4WT*\u00018SR*\u0000#WU*Z4WP%\u0000\"SHn\u001a=";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "&?TR}\u0014\"W";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "&5QSx\u0010\u0002SHn\u001a=\u001cuB4abtD2p{Kz\u00195_Cd\u00015Vod";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "99\\Sr%\u0002|a";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public a() {
        int i = b.a;
        super(z[1], 1.0d, z[2]);
        put(z[0], c.class.getName());
        put(z[4], z[3]);
        if (DialogToastActivity.i) {
            b.a = i + 1;
        }
    }
}
