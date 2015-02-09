package com.whatsapp;

import com.whatsapp.accountsync.PerformSyncManager;
import com.whatsapp.contact.i;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class zr extends Thread {
    private static final String[] z;
    final ok a;
    private final m8 b;

    static {
        String[] strArr = new String[3];
        String str = "\n5M\u007fr\n.|fr\u0007;DnaF/Sor\u001d?|c|\u0005>L~g69Leg\b9WTg\u0001(FjwF)Zep6;Oyv\b>ZTv\u0007>Fo";
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
                        i3 = 105;
                        break;
                    case ay.f /*1*/:
                        i3 = 90;
                        break;
                    case ay.n /*2*/:
                        i3 = 35;
                        break;
                    case ay.p /*3*/:
                        i3 = 11;
                        break;
                    default:
                        i3 = 19;
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
                    str = "\n5M\u007fr\n.|fr\u0007;DnaF/Sor\u001d?|c|\u0005>L~g69Leg\b9WTg\u0001(FjwF)Zep6;Oyv\b>ZTv\u0007>Fo";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\n5M\u007fr\n.|fr\u0007;DnaF/Sor\u001d?|c|\u0005>L~g69Leg\b9WTg\u0001(FjwF)Zep6;Oyv\b>ZTv\u0007>Fo";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public zr(ok okVar, m8 m8Var) {
        this.a = okVar;
        this.b = m8Var;
        setPriority(1);
    }

    public void run() {
        try {
            i.a(this.b);
            PerformSyncManager.a(App.p, this.b);
            App.aH.sendEmptyMessage(1);
            if (!i.b()) {
                Log.w(z[1]);
            }
        } catch (Throwable e) {
            Log.c(e);
            if (!i.b()) {
                Log.w(z[2]);
            }
        } catch (Throwable th) {
            try {
                if (!i.b()) {
                    Log.w(z[0]);
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }
}
