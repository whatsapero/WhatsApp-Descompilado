package com.whatsapp;

import android.os.CountDownTimer;
import android.text.format.DateUtils;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class p1 extends CountDownTimer {
    private static final String[] z;
    final VerifySms a;

    static {
        String[] strArr = new String[3];
        String str = "8Sk3!8Si1!?_j0c>B";
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
                        i3 = 75;
                        break;
                    case ay.f /*1*/:
                        i3 = 54;
                        break;
                    case ay.n /*2*/:
                        i3 = 7;
                        break;
                    case ay.p /*3*/:
                        i3 = 85;
                        break;
                    default:
                        i3 = 12;
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
                    str = "=Su<j2Ej&#?_j0c>B'";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "=Su<j2Ej&#?_j0c>B*3e%Wk";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onFinish() {
        Log.i(z[2] + VerifySms.C());
        if (VerifySms.C() == 1) {
            if ("".equals(VerifyNumber.k)) {
                this.a.b(z[0]);
            }
            VerifySms.g(this.a);
            if (App.az == 0) {
                return;
            }
        }
        VerifySms.w(this.a);
        Log.i(z[1]);
        if (this.a.m || this.a.isFinishing()) {
            this.a.a();
        }
    }

    public void onTick(long j) {
        VerifySms.b(this.a, (VerifySms.i(this.a) + VerifySms.J()) - j);
        VerifySms.n(this.a).setProgress((int) ((((double) VerifySms.f(this.a)) * 100.0d) / ((double) VerifySms.k(this.a))));
        VerifySms.d(j);
        VerifySms.h(this.a).setText(DateUtils.formatElapsedTime((VerifySms.k(this.a) - VerifySms.f(this.a)) / 1000));
    }

    p1(VerifySms verifySms, long j, long j2) {
        this.a = verifySms;
        super(j, j2);
    }
}
