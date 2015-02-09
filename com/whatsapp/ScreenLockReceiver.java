package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import de.greenrobot.event.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class ScreenLockReceiver extends BroadcastReceiver {
    private static final String[] z;
    private boolean a;

    static {
        String[] strArr = new String[8];
        String str = "\u0019\u0018DRu\u0011\u0012\u000eIt\f\u0013NT4\u0019\u0015TIu\u0016XscH=3n\u007fU6";
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
                        i3 = 120;
                        break;
                    case ay.f /*1*/:
                        i3 = 118;
                        break;
                    case ay.n /*2*/:
                        i3 = 32;
                        break;
                    case ay.p /*3*/:
                        i3 = 32;
                        break;
                    default:
                        i3 = 26;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0019\u0006P\u000fi\u001b\u0004EEtW\u0019FF";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0019\u0018DRu\u0011\u0012\u000eIt\f\u0013NT4\u0019\u0015TIu\u0016XscH=3n\u007fU>0";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "+\u0015RE\u007f\u0016:OCq*\u0013CEs\u000e\u0013R[v\u0017\u0015KE~E";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0019\u0018DRu\u0011\u0012\u000eIt\f\u0013NT4\u0019\u0015TIu\u0016XscH=3n\u007fU6";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\b\u0019WEh";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0019\u0018DRu\u0011\u0012\u000eIt\f\u0013NT4\u0019\u0015TIu\u0016XscH=3n\u007fU>0";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0019\u0006P\u000fi\u001b\u0004EEtW\u0019N";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        return z[4] + this.a + '}';
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
        r5_this = this;
        r4 = 1;
        r3 = 0;
        r0 = r5.a;
        r1 = r7.getAction();
        r2 = z;
        r2 = r2[r3];
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x001f;
    L_0x0012:
        r1 = z;
        r1 = r1[r4];
        com.whatsapp.util.Log.i(r1);
        r5.a = r3;
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0038;
    L_0x001f:
        r1 = r7.getAction();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0038;
    L_0x002e:
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r5.a = r4;
    L_0x0038:
        r1 = r5.a;
        if (r1 == r0) goto L_0x004a;
    L_0x003c:
        r0 = de.greenrobot.event.g.b();
        r1 = new com.whatsapp.bz;
        r2 = r5.a;
        r1.<init>(r2);
        r0.c(r1);
    L_0x004a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ScreenLockReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public void a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(z[7]);
        intentFilter.addAction(z[5]);
        context.registerReceiver(this, intentFilter);
        this.a = !((PowerManager) context.getSystemService(z[6])).isScreenOn();
        g.b().c(new bz(this.a));
    }
}
