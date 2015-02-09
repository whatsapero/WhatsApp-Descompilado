package com.whatsapp.util;

import android.app.Activity;
import android.view.LayoutInflater.Factory;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class ae implements Factory {
    private static final String[] z;
    final Activity a;

    static {
        String[] strArr = new String[5];
        String str = "@m`i_}mo";
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
                        i3 = 20;
                        break;
                    case ay.f /*1*/:
                        i3 = 8;
                        break;
                    case ay.n /*2*/:
                        i3 = 24;
                        break;
                    case ay.p /*3*/:
                        i3 = 29;
                        break;
                    default:
                        i3 = 9;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "`zmsju|qrgA|qqz4nqsmYmvh]f}v~h`awsz4av{eu|}=llk}m}}gv";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "wgu3hzljr`p&qs}qzv|e:\u007fqynq|6Y`udwz]}|tx";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "wgu3hzljr`p&qs}qzv|e:~qx~:e}s|:A{rgYmvh@`muK`q\u007f";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "wgu3hzljr`p&qs}qzv|e:~qx~:e}s|:I{i`{fUxgaAlxdBa}j";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ae(Activity activity) {
        this.a = activity;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(java.lang.String r6, android.content.Context r7, android.util.AttributeSet r8) {
        /*
        r5_this = this;
        r0 = 0;
        r1 = z;	 Catch:{ InflateException -> 0x004f }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ InflateException -> 0x004f }
        r1 = r6.equalsIgnoreCase(r1);	 Catch:{ InflateException -> 0x004f }
        if (r1 != 0) goto L_0x002d;
    L_0x000c:
        r1 = z;	 Catch:{ InflateException -> 0x004f }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ InflateException -> 0x004f }
        r1 = r6.endsWith(r1);	 Catch:{ InflateException -> 0x004f }
        if (r1 != 0) goto L_0x002d;
    L_0x0017:
        r1 = z;	 Catch:{ InflateException -> 0x0051 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ InflateException -> 0x0051 }
        r1 = r6.equalsIgnoreCase(r1);	 Catch:{ InflateException -> 0x0051 }
        if (r1 != 0) goto L_0x002d;
    L_0x0022:
        r1 = z;	 Catch:{ InflateException -> 0x0053 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ InflateException -> 0x0053 }
        r1 = r6.equalsIgnoreCase(r1);	 Catch:{ InflateException -> 0x0053 }
        if (r1 == 0) goto L_0x004e;
    L_0x002d:
        r1 = r5.a;	 Catch:{ InflateException -> 0x0062, ClassNotFoundException -> 0x0064 }
        r1 = r1.getLayoutInflater();	 Catch:{ InflateException -> 0x0062, ClassNotFoundException -> 0x0064 }
        r2 = 1;
        r2 = new android.view.View[r2];	 Catch:{ InflateException -> 0x0062, ClassNotFoundException -> 0x0064 }
        r3 = 0;
        r4 = 0;
        r4 = r1.createView(r6, r4, r8);	 Catch:{ InflateException -> 0x0055, ClassNotFoundException -> 0x0064 }
        r2[r3] = r4;	 Catch:{ InflateException -> 0x0055, ClassNotFoundException -> 0x0064 }
    L_0x003e:
        r1 = new android.os.Handler;	 Catch:{ InflateException -> 0x0062, ClassNotFoundException -> 0x0064 }
        r1.<init>();	 Catch:{ InflateException -> 0x0062, ClassNotFoundException -> 0x0064 }
        r3 = new com.whatsapp.util.x;	 Catch:{ InflateException -> 0x0062, ClassNotFoundException -> 0x0064 }
        r3.<init>(r5, r2, r6);	 Catch:{ InflateException -> 0x0062, ClassNotFoundException -> 0x0064 }
        r1.post(r3);	 Catch:{ InflateException -> 0x0062, ClassNotFoundException -> 0x0064 }
        r1 = 0;
        r0 = r2[r1];	 Catch:{ InflateException -> 0x0062, ClassNotFoundException -> 0x0064 }
    L_0x004e:
        return r0;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r3 = move-exception;
        r3 = z;	 Catch:{ InflateException -> 0x0062, ClassNotFoundException -> 0x0064 }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ InflateException -> 0x0062, ClassNotFoundException -> 0x0064 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ InflateException -> 0x0062, ClassNotFoundException -> 0x0064 }
        com.whatsapp.util.g.a(r6, r8, r1, r2);	 Catch:{ InflateException -> 0x0062, ClassNotFoundException -> 0x0064 }
        goto L_0x003e;
    L_0x0062:
        r1 = move-exception;
        goto L_0x004e;
    L_0x0064:
        r1 = move-exception;
        goto L_0x004e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ae.onCreateView(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }
}
