package com.whatsapp;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class r1 implements OnCheckedChangeListener {
    private static final String[] z;
    final ContactPickerHelp a;

    static {
        String[] strArr = new String[3];
        String str = "qr\u001c\u00148qi\u001a\u00055b2\u0011\u0002vqq\u001b\u00032wy]";
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
                        i3 = 18;
                        break;
                    case ay.f /*1*/:
                        i3 = 29;
                        break;
                    case ay.n /*2*/:
                        i3 = 114;
                        break;
                    case ay.p /*3*/:
                        i3 = 96;
                        break;
                    default:
                        i3 = 89;
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
                    str = "gs\u0011\b<qv\u0017\u0004";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "qu\u0017\u00032wy";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.a.m) {
            this.a.m = false;
            if (App.az == 0) {
                return;
            }
        }
        Log.i(z[0] + (z ? z[1] : z[2]));
        App.b(this.a, this.a.l.isChecked());
        a5w.a(new afr(this.a, null), new Void[0]);
    }

    r1(ContactPickerHelp contactPickerHelp) {
        this.a = contactPickerHelp;
    }
}
