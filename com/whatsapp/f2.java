package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Environment;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class f2 implements OnClickListener {
    private static final String[] z;
    final ata a;

    static {
        String[] strArr = new String[3];
        String str = "Uvv\bD]}";
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
                        i3 = 56;
                        break;
                    case ay.f /*1*/:
                        i3 = 25;
                        break;
                    case ay.n /*2*/:
                        i3 = 3;
                        break;
                    case ay.p /*3*/:
                        i3 = 102;
                        break;
                    default:
                        i3 = 48;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "N|q\u000fVAtp\u0001CLvq\u0003\u001f\\pb\n__6n\u0003TQx`\u0007B\\wl\u0012VWlm\u0002QKrq\u0003DJ`,\u0003HL|q\bQTjw\u0007D]$";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Uvv\bD]}\\\u0014_";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ata.b(this.a).removeDialog(102);
        String externalStorageState = Environment.getExternalStorageState();
        if (!(externalStorageState.equals(z[0]) || externalStorageState.equals(z[1]))) {
            Log.v(z[2] + Environment.getExternalStorageState());
            ata.b(this.a).showDialog(102);
            if (App.az == 0) {
                return;
            }
        }
        this.a.b();
    }

    f2(ata com_whatsapp_ata) {
        this.a = com_whatsapp_ata;
    }
}
