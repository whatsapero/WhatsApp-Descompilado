package com.whatsapp;

import android.os.Build.VERSION;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class n1 implements Runnable {
    private static final String[] z;
    final dz a;

    static {
        String[] strArr = new String[3];
        String str = "s35\u001d_k3(\u001b\u0015v(=\fNs35\u001d_k3(\u001b\u0015v75\u000e";
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
                        i3 = 5;
                        break;
                    case ay.f /*1*/:
                        i3 = 92;
                        break;
                    case ay.n /*2*/:
                        i3 = 92;
                        break;
                    case ay.p /*3*/:
                        i3 = 126;
                        break;
                    default:
                        i3 = 58;
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
                    str = "s35\u001d_k3(\u001b\u0015v(=\fNs35\u001d_k3(\u001b\u0015v(=\fNc=5\u0012_a";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "s35\u001d_k3(\u001b\u0015v(=\fNs35\u001d_k3(\u001b\u0015v(=\fN";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    n1(dz dzVar) {
        this.a = dzVar;
    }

    public void run() {
        try {
            dz.a(this.a, System.currentTimeMillis());
            try {
                if (dz.b(this.a) != null) {
                    Log.i(z[1]);
                    if (VERSION.SDK_INT >= 16) {
                        dz.g().setVolume(dz.f(this.a), 0.0f, 0.0f);
                    }
                    try {
                        dz.b(this.a).e();
                        dz.i(this.a).sendEmptyMessage(0);
                        return;
                    } catch (Throwable e) {
                        Log.b(z[2], e);
                        this.a.b(false);
                        dz.j(this.a).a(R.string.error_setup_recorder);
                        if (App.az == 0) {
                            return;
                        }
                    }
                }
                Log.i(z[0]);
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e22) {
            throw e22;
        } catch (Exception e222) {
            throw e222;
        }
    }
}
