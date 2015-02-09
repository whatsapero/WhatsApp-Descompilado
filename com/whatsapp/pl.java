package com.whatsapp;

import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class pl implements OnClickListener {
    private static final String[] z;
    final Advanced a;

    static {
        String[] strArr = new String[6];
        String str = "Itxd'A\u007f";
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
                        i3 = 36;
                        break;
                    case ay.f /*1*/:
                        i3 = 27;
                        break;
                    case ay.n /*2*/:
                        i3 = 13;
                        break;
                    case ay.p /*3*/:
                        i3 = 10;
                        break;
                    default:
                        i3 = 83;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "Ssl~ Ek}$?K|";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "Ssl~ Ek}$?K|";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "w_-i2V\u007f-d<P;l|2Mwlh?A4\u007fo2@b";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Gt}ssHtj*'K;^NsGz\u007fn";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "htjy";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r7) {
        /*
        r6_this = this;
        r1 = 0;
        r0 = z;
        r2 = 5;
        r0 = r0[r2];
        com.whatsapp.App.v(r0);
        r0 = android.os.Environment.getExternalStorageState();
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0070;
    L_0x0018:
        r0 = new java.io.File;
        r2 = r6.a;
        r2 = r2.getFilesDir();
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        r0.<init>(r2, r3);
        r3 = new java.io.File;
        r2 = z;
        r4 = 3;
        r2 = r2[r4];
        r3.<init>(r0, r2);
        r0 = com.whatsapp.App.ao;	 Catch:{ IOException -> 0x0079 }
        r0 = r0.exists();	 Catch:{ IOException -> 0x0079 }
        if (r0 != 0) goto L_0x003f;
    L_0x003a:
        r0 = com.whatsapp.App.ao;	 Catch:{ IOException -> 0x0079 }
        r0.mkdirs();	 Catch:{ IOException -> 0x0079 }
    L_0x003f:
        r0 = new java.io.File;
        r2 = com.whatsapp.App.ao;
        r4 = z;
        r5 = 2;
        r4 = r4[r5];
        r0.<init>(r2, r4);
        r2 = new com.whatsapp.util.al;	 Catch:{ all -> 0x007f }
        r4 = com.whatsapp.App.aB;	 Catch:{ all -> 0x007f }
        r2.<init>(r4, r0);	 Catch:{ all -> 0x007f }
        r2 = java.nio.channels.Channels.newChannel(r2);	 Catch:{ all -> 0x007f }
        r0 = new java.io.FileInputStream;	 Catch:{ all -> 0x0092 }
        r0.<init>(r3);	 Catch:{ all -> 0x0092 }
        r1 = r0.getChannel();	 Catch:{ all -> 0x0092 }
        com.whatsapp.util.at.a(r1, r2);	 Catch:{ all -> 0x0092 }
        if (r1 == 0) goto L_0x0067;
    L_0x0064:
        r1.close();	 Catch:{ IOException -> 0x007d }
    L_0x0067:
        if (r2 == 0) goto L_0x006c;
    L_0x0069:
        r2.close();	 Catch:{ IOException -> 0x007b }
    L_0x006c:
        r0 = com.whatsapp.App.az;	 Catch:{ IOException -> 0x0090 }
        if (r0 == 0) goto L_0x0078;
    L_0x0070:
        r0 = z;	 Catch:{ IOException -> 0x0090 }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0090 }
        com.whatsapp.App.v(r0);	 Catch:{ IOException -> 0x0090 }
    L_0x0078:
        return;
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        goto L_0x006c;
    L_0x007f:
        r0 = move-exception;
        r2 = r1;
    L_0x0081:
        if (r1 == 0) goto L_0x0086;
    L_0x0083:
        r1.close();	 Catch:{ IOException -> 0x008c }
    L_0x0086:
        if (r2 == 0) goto L_0x008b;
    L_0x0088:
        r2.close();	 Catch:{ IOException -> 0x008e }
    L_0x008b:
        throw r0;	 Catch:{ IOException -> 0x007d }
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x007d }
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x007d }
    L_0x0090:
        r0 = move-exception;
        throw r0;
    L_0x0092:
        r0 = move-exception;
        goto L_0x0081;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.pl.onClick(android.view.View):void");
    }

    pl(Advanced advanced) {
        this.a = advanced;
    }
}
