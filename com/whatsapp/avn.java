package com.whatsapp;

import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import com.whatsapp.messaging.r;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class avn implements r {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "0Ma\u0007t4M]\u000fx1[c\u0005x";
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
                        i3 = 66;
                        break;
                    case ay.f /*1*/:
                        i3 = 40;
                        break;
                    case ay.n /*2*/:
                        i3 = 2;
                        break;
                    case ay.p /*3*/:
                        i3 = 98;
                        break;
                    default:
                        i3 = 29;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "'Pv\u0010|\u001dZg\u0001x+^g=p'[q\u0003z'";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "'Pv\u0010|\u001dZg\u0001x+^g=p'[q\u0003z'wm\u0000w";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "-JhBt,\bA\u0003q.\bO\u0007n1Ie\u0007=+[\"\fr6\bR\u0003o!Mn\u0003\u007f.M";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(Message message) {
        Intent intent = new Intent(z[0], null, App.p, VoiceService.class);
        if (message.obj != null) {
            try {
                Parcelable parcelable = (Parcelable) message.obj;
                message.obj = null;
                intent.putExtra(z[3], parcelable);
            } catch (ClassCastException e) {
                throw new RuntimeException(z[1]);
            }
        }
        intent.putExtra(z[2], message);
        App.p.startService(intent);
    }

    avn() {
    }
}
