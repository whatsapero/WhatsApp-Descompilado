package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.ay;

final class ali extends Handler {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u001eSJ%!\u0018U^&$\u0018I\u0004//\u001cWD,i\u001bZB'";
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
                        i3 = 125;
                        break;
                    case ay.f /*1*/:
                        i3 = 59;
                        break;
                    case ay.n /*2*/:
                        i3 = 43;
                        break;
                    case ay.p /*3*/:
                        i3 = 75;
                        break;
                    default:
                        i3 = 70;
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
                    str = "\u001eSJ%!\u0018U^&$\u0018I\u0004//\u001cWD,i\u000eNH(#\u000eH";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u001eSJ%!\u0018U^&$\u0018I\u0004//\u001cWD,i\u000eZF.";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void handleMessage(Message message) {
        int i = App.az;
        long e = ChangeNumber.e(App.p);
        switch (message.what) {
            case aV.r /*5*/:
                Log.w(z[1]);
                App.a(App.y(), App.p.getString(R.string.change_number_same_number));
                ChangeNumber.a(App.p);
                if (i == 0) {
                    return;
                }
                break;
            case aV.i /*6*/:
                break;
            case a8.s /*7*/:
                break;
            default:
                return;
        }
        Log.e(z[0]);
        App.a(App.y(), App.p.getString(R.string.change_number_generic_fail_message));
        ac.a(e, ac.c, true);
        ChangeNumber.a(App.p);
        if (i == 0) {
            return;
        }
        Log.i(z[2]);
        App.a(App.y(), App.p.getString(R.string.change_number_success, new Object[]{ChangeNumber.h(), VerifySms.a(App.an.cc, App.an.number)}));
    }

    ali() {
    }
}
