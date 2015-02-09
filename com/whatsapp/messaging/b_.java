package com.whatsapp.messaging;

import android.content.Context;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class b_ {
    private static final String[] z;
    private final Context a;

    static {
        String[] strArr = new String[8];
        String str = "\nw\u0000XC";
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
                        i3 = 73;
                        break;
                    case ay.f /*1*/:
                        i3 = 59;
                        break;
                    case ay.n /*2*/:
                        i3 = 69;
                        break;
                    case ay.p /*3*/:
                        i3 = 25;
                        break;
                    default:
                        i3 = 17;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "/Y,ib";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "1V5i>:^7ox*^j\u007fp%W'xr\"\u0014)vp-}$u}+Z&rb";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "/Y,ib";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "/Y,ib";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "/Y,ib";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "/Y,ib";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "1V5i>:^7ox*^j\u007fp%W'xr\"\u00146xg,}$u}+Z&rb";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a(ArrayList arrayList) {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(this.a.openFileOutput(z[7], 0)));
        objectOutputStream.writeObject(arrayList);
        objectOutputStream.close();
    }

    public b_(Context context) {
        this.a = context;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList a() {
        /*
        r6_this = this;
        r2 = com.whatsapp.messaging.au.a;
        r0 = r6.a;
        r1 = z;
        r3 = 5;
        r1 = r1[r3];
        r0 = r0.openFileInput(r1);
        r1 = new java.io.ObjectInputStream;
        r3 = new java.io.BufferedInputStream;
        r3.<init>(r0);
        r1.<init>(r3);
        r0 = r1.readObject();
        r0 = (java.util.ArrayList) r0;
        r1.close();
        r3 = new java.util.HashSet;
        r3.<init>();
        r4 = r0.iterator();
    L_0x0029:
        r1 = r4.hasNext();
        if (r1 == 0) goto L_0x0040;
    L_0x002f:
        r1 = r4.next();
        r1 = (com.whatsapp.util.dns.DnsCacheEntrySerializable) r1;
        r5 = r1.isExpired();
        if (r5 == 0) goto L_0x003e;
    L_0x003b:
        r3.add(r1);
    L_0x003e:
        if (r2 == 0) goto L_0x0029;
    L_0x0040:
        r1 = r3.isEmpty();
        if (r1 != 0) goto L_0x005e;
    L_0x0046:
        r0.removeAll(r3);
        r1 = r0.isEmpty();
        if (r1 == 0) goto L_0x005b;
    L_0x004f:
        r1 = r6.a;
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r1.deleteFile(r3);
        if (r2 == 0) goto L_0x005e;
    L_0x005b:
        r6.a(r0);
    L_0x005e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.b_.a():java.util.ArrayList");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList a(java.lang.String[] r7) {
        /*
        r6_this = this;
        r5 = 1;
        r1 = 0;
        r2 = com.whatsapp.messaging.au.a;
        if (r7 != 0) goto L_0x0032;
    L_0x0006:
        r0 = new java.io.File;	 Catch:{ IOException -> 0x0021 }
        r1 = r6.a;	 Catch:{ IOException -> 0x0021 }
        r1 = r1.getFilesDir();	 Catch:{ IOException -> 0x0021 }
        r2 = z;	 Catch:{ IOException -> 0x0021 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0021 }
        r0.<init>(r1, r2);	 Catch:{ IOException -> 0x0021 }
        r0 = r0.canRead();	 Catch:{ IOException -> 0x0021 }
        if (r0 == 0) goto L_0x002c;
    L_0x001c:
        r0 = r6.a();	 Catch:{ IOException -> 0x0023, ClassNotFoundException -> 0x007c }
    L_0x0020:
        return r0;
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r0 = move-exception;
    L_0x0024:
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
    L_0x002c:
        r0 = new java.util.ArrayList;
        r0.<init>();
        goto L_0x0020;
    L_0x0032:
        r0 = r7.length;	 Catch:{ IOException -> 0x0055 }
        if (r0 != r5) goto L_0x0057;
    L_0x0035:
        r0 = 0;
        r0 = r7[r0];	 Catch:{ IOException -> 0x0055 }
        r3 = z;	 Catch:{ IOException -> 0x0055 }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0055 }
        r0 = r0.equalsIgnoreCase(r3);	 Catch:{ IOException -> 0x0055 }
        if (r0 == 0) goto L_0x0057;
    L_0x0043:
        r0 = r6.a;	 Catch:{ IOException -> 0x0053 }
        r1 = z;	 Catch:{ IOException -> 0x0053 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0053 }
        r0.deleteFile(r1);	 Catch:{ IOException -> 0x0053 }
        r0 = new java.util.ArrayList;	 Catch:{ IOException -> 0x0053 }
        r0.<init>();	 Catch:{ IOException -> 0x0053 }
        goto L_0x0020;
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0053 }
    L_0x0057:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r3 = r7.length;
    L_0x005d:
        if (r1 >= r3) goto L_0x006b;
    L_0x005f:
        r4 = r7[r1];
        r4 = com.whatsapp.util.dns.DnsCacheEntrySerializable.parseFallbackIpString(r4);
        if (r4 != 0) goto L_0x0078;
    L_0x0067:
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x005d;
    L_0x006b:
        r6.a(r0);	 Catch:{ IOException -> 0x006f }
        goto L_0x0020;
    L_0x006f:
        r1 = move-exception;
        r2 = z;
        r2 = r2[r5];
        com.whatsapp.util.Log.b(r2, r1);
        goto L_0x0020;
    L_0x0078:
        r0.add(r4);
        goto L_0x0067;
    L_0x007c:
        r0 = move-exception;
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.b_.a(java.lang.String[]):java.util.ArrayList");
    }
}
