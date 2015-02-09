package com.whatsapp;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.PowerManager;
import de.greenrobot.event.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class BatteryReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[6];
        String str = "!\"r\u0002L)(8\u0019M4)x\u0004\r!/b\u0019L.bT1w\u0014\tD)|\u0003\u0004W>d\u0005\b";
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
                        i3 = 64;
                        break;
                    case ay.f /*1*/:
                        i3 = 76;
                        break;
                    case ay.n /*2*/:
                        i3 = 22;
                        break;
                    case ay.p /*3*/:
                        i3 = 112;
                        break;
                    default:
                        i3 = 35;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0015\"s\bS%/b\u0015G`-u\u0004J/\",P";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "0#a\u0015Q";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "!\"r\u0002L)(8\u0019M4)x\u0004\r!/b\u0019L.bT1w\u0014\tD)|\u0003\u0004W>d\u0005\b";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "!\"r\u0002L)(8\u001fPn-u\u0004J/\"8 l\u0017\tD/p\u0001\u001aS/n\u000f\bS/`\b\rX7f\u0004";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "!\"r\u0002L)(8\u001fPn-u\u0004J/\"8 l\u0017\tD/p\u0001\u001aS/n\u000f\bS/`\b\rX7f\u0004";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
        r7_this = this;
        r2 = 1;
        r0 = 0;
        r3 = com.whatsapp.App.az;
        r4 = r9.getAction();
        r1 = -1;
        r5 = r4.hashCode();	 Catch:{ IllegalArgumentException -> 0x0050 }
        switch(r5) {
            case -1538406691: goto L_0x0036;
            case 1779291251: goto L_0x0061;
            default: goto L_0x0010;
        };
    L_0x0010:
        r0 = r1;
    L_0x0011:
        switch(r0) {
            case 0: goto L_0x0054;
            case 1: goto L_0x0059;
            default: goto L_0x0014;
        };
    L_0x0014:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0034 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r9.getAction();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0034 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r6 = 0;
        r5 = r5[r6];	 Catch:{ IllegalArgumentException -> 0x0050 }
        r5 = r4.equals(r5);	 Catch:{ IllegalArgumentException -> 0x0050 }
        if (r5 == 0) goto L_0x0010;
    L_0x0041:
        if (r3 == 0) goto L_0x0011;
    L_0x0043:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0052 }
        r5 = 1;
        r1 = r1[r5];	 Catch:{ IllegalArgumentException -> 0x0052 }
        r1 = r4.equals(r1);	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r1 == 0) goto L_0x0011;
    L_0x004e:
        r0 = r2;
        goto L_0x0011;
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r7.a(r9);	 Catch:{ IllegalArgumentException -> 0x005f }
        if (r3 == 0) goto L_0x005e;
    L_0x0059:
        r7.b(r8);	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r3 != 0) goto L_0x0014;
    L_0x005e:
        return;
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0061:
        r0 = r1;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.BatteryReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    @TargetApi(21)
    private void b(Context context) {
        g.b().c(new ky(((PowerManager) context.getSystemService(z[3])).isPowerSaveMode()));
    }

    BatteryReceiver() {
    }

    private void a(Intent intent) {
        g.b().c(new nd(intent));
    }

    public void a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        try {
            intentFilter.addAction(z[4]);
            if (VERSION.SDK_INT >= 21) {
                intentFilter.addAction(z[5]);
            }
            try {
                context.registerReceiver(this, intentFilter);
                if (VERSION.SDK_INT >= 21) {
                    b(context);
                    if (App.az == 0) {
                        return;
                    }
                }
                g.b().c(new ky(false));
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }
}
