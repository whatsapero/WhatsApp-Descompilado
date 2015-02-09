package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class fj extends Thread {
    private static final String[] z;
    final j_ a;

    static {
        String[] strArr = new String[12];
        String str = "\u0002$\u001aUW\u0000?\u001f^K\u0017\"\u001aUI\u0001(\u000bU\u0017\u00068\u0010";
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
                        i3 = 116;
                        break;
                    case ay.f /*1*/:
                        i3 = 77;
                        break;
                    case ay.n /*2*/:
                        i3 = 126;
                        break;
                    case ay.p /*3*/:
                        i3 = 48;
                        break;
                    default:
                        i3 = 56;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0002$\u001aUW\u0000?\u001f^K\u0017\"\u001aUI\u0001(\u000bU\u0017\u0017\"\u000eI";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0002$\u001aUW\u0000?\u001f^K\u0017\"\u001aUI\u0001(\u000bU\u0017\u0004?\u0011S]\u0007>^";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0002$\u001aUW\u0000?\u001f^K\u0017\"\u001aUI\u0001(\u000bU\u0017\u0003$\u0012\\\u0018\u0003,\u0017D";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0002$\u001aUW\u0000?\u001f^K\u0017\"\u001aUI\u0001(\u000bU\u0017\u0000?\u0017]";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0002$\u001aUW\u0000?\u001f^K\u0017\"\u001aUI\u0001(\u000bU\u0017\u0017\"\u000eI";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0002$\u001aUW\u0000?\u001f^K\u0017\"\u001aUI\u0001(\u000bU\u0017!#\u001fRT\u0011m\n_\u0018\u0017?\u001bQL\u0011m\u001dBY\u0007%^YVT;\u0017T]\u001bm\rUV\u0000$\u0010UTT+\u0017\\]";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0002$\u001aUW\u0000?\u001f^K\u0017\"\u001aUI\u0001(\u000bU\u0017\u0012$\u0012UV\u001b9\u0018_M\u001a)";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ":\"^CH\u0015.\u001b";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0002$\u001aUW\u0000?\u001f^K\u0017\"\u001aUI\u0001(\u000bU\u0017\u0016,\u001a\u0010N\u001d)\u001b_";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0002$\u001aUW\u0000?\u001f^K\u0017\"\u001aUI\u0001(\u000bU\u0017\u0017\"\u000b\\\\T#\u0011D\u0018\u0013(\n\u0010N\u001d)\u001b_\u0018\u0000%\u000b]Z";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0002$\u001aUW\u0000?\u001f^K\u0017\"\u001aUI\u0001(\u000bU\u0017\u001d\"\u001bH[\u0011=\nYW\u001a";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r16_this = this;
        r11 = com.whatsapp.App.az;
        r2 = z;	 Catch:{ InterruptedException -> 0x0261 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ InterruptedException -> 0x0261 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ InterruptedException -> 0x0261 }
    L_0x000a:
        r0 = r16;
        r2 = r0.a;	 Catch:{ InterruptedException -> 0x0261 }
        r2 = com.whatsapp.j_.a(r2);	 Catch:{ InterruptedException -> 0x0261 }
        r2 = r2.size();	 Catch:{ InterruptedException -> 0x0261 }
        if (r2 != 0) goto L_0x0035;
    L_0x0018:
        r2 = z;	 Catch:{ InterruptedException -> 0x0261 }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ InterruptedException -> 0x0261 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ InterruptedException -> 0x0261 }
        r0 = r16;
        r2 = r0.a;	 Catch:{ InterruptedException -> 0x0261 }
        r3 = com.whatsapp.j_.a(r2);	 Catch:{ InterruptedException -> 0x0261 }
        monitor-enter(r3);	 Catch:{ InterruptedException -> 0x0261 }
        r0 = r16;
        r2 = r0.a;	 Catch:{ all -> 0x025e }
        r2 = com.whatsapp.j_.a(r2);	 Catch:{ all -> 0x025e }
        r2.wait();	 Catch:{ all -> 0x025e }
        monitor-exit(r3);	 Catch:{ all -> 0x025e }
    L_0x0035:
        r0 = r16;
        r2 = r0.a;	 Catch:{ InterruptedException -> 0x0261 }
        r2 = com.whatsapp.j_.a(r2);	 Catch:{ InterruptedException -> 0x0261 }
        r2 = r2.size();	 Catch:{ InterruptedException -> 0x0261 }
        if (r2 == 0) goto L_0x0257;
    L_0x0043:
        r0 = r16;
        r2 = r0.a;	 Catch:{ InterruptedException -> 0x0261 }
        r3 = com.whatsapp.j_.a(r2);	 Catch:{ InterruptedException -> 0x0261 }
        monitor-enter(r3);	 Catch:{ InterruptedException -> 0x0261 }
        r0 = r16;
        r2 = r0.a;	 Catch:{ all -> 0x029a }
        r2 = com.whatsapp.j_.a(r2);	 Catch:{ all -> 0x029a }
        r4 = 0;
        r2 = r2.remove(r4);	 Catch:{ all -> 0x029a }
        r2 = (com.whatsapp.protocol.b) r2;	 Catch:{ all -> 0x029a }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x029a }
        r4.<init>();	 Catch:{ all -> 0x029a }
        r5 = z;	 Catch:{ all -> 0x029a }
        r6 = 3;
        r5 = r5[r6];	 Catch:{ all -> 0x029a }
        r4 = r4.append(r5);	 Catch:{ all -> 0x029a }
        r5 = r2.e;	 Catch:{ all -> 0x029a }
        r5 = r5.a;	 Catch:{ all -> 0x029a }
        r4 = r4.append(r5);	 Catch:{ all -> 0x029a }
        r4 = r4.toString();	 Catch:{ all -> 0x029a }
        com.whatsapp.util.Log.i(r4);	 Catch:{ all -> 0x029a }
        monitor-exit(r3);	 Catch:{ all -> 0x029a }
        r3 = r2.A;	 Catch:{ InterruptedException -> 0x0261 }
        r0 = r3;
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ InterruptedException -> 0x0261 }
        r10 = r0;
        r3 = com.whatsapp.App.p;	 Catch:{ InterruptedException -> 0x0261 }
        r4 = r10.file;	 Catch:{ InterruptedException -> 0x0261 }
        r5 = r2.j;	 Catch:{ InterruptedException -> 0x0261 }
        r6 = r2.w;	 Catch:{ InterruptedException -> 0x0261 }
        r7 = 1;
        r5 = com.whatsapp.util.f.a(r3, r4, r5, r6, r7);	 Catch:{ InterruptedException -> 0x0261 }
        r3 = new com.whatsapp.id;	 Catch:{ InterruptedException -> 0x0261 }
        r4 = r10.file;	 Catch:{ InterruptedException -> 0x0261 }
        r6 = r10.trimFrom;	 Catch:{ InterruptedException -> 0x0261 }
        r8 = r10.trimTo;	 Catch:{ InterruptedException -> 0x0261 }
        r3.<init>(r4, r5, r6, r8);	 Catch:{ InterruptedException -> 0x0261 }
        r10.transcoder = r3;	 Catch:{ InterruptedException -> 0x0261 }
        r3 = r10.transcoder;	 Catch:{ InterruptedException -> 0x0261 }
        r4 = new com.whatsapp.ix;	 Catch:{ InterruptedException -> 0x0261 }
        r0 = r16;
        r4.<init>(r0, r2, r10);	 Catch:{ InterruptedException -> 0x0261 }
        r3.a(r4);	 Catch:{ InterruptedException -> 0x0261 }
        r4 = 0;
        r3 = com.whatsapp.App.aj;	 Catch:{ Exception -> 0x029d }
        r3.createNewFile();	 Catch:{ Exception -> 0x029d }
        r3 = com.whatsapp.App.aj;	 Catch:{ Exception -> 0x029d }
        r3 = r3.getAbsolutePath();	 Catch:{ Exception -> 0x029d }
        com.whatsapp.VideoFrameConverter.setLogFilePath(r3);	 Catch:{ Exception -> 0x029d }
    L_0x00b4:
        r0 = r16;
        r3 = r0.a;	 Catch:{ Exception -> 0x02a8 }
        r3 = com.whatsapp.j_.b(r3);	 Catch:{ Exception -> 0x02a8 }
        if (r3 == 0) goto L_0x00c9;
    L_0x00be:
        r0 = r16;
        r3 = r0.a;	 Catch:{ Exception -> 0x02a8 }
        r3 = com.whatsapp.j_.b(r3);	 Catch:{ Exception -> 0x02a8 }
        r3.acquire();	 Catch:{ Exception -> 0x02a8 }
    L_0x00c9:
        r3 = r10.file;	 Catch:{ a6 -> 0x019d, FileNotFoundException -> 0x02aa, IOException -> 0x02fb }
        r3 = com.whatsapp.id.c(r3);	 Catch:{ a6 -> 0x019d, FileNotFoundException -> 0x02aa, IOException -> 0x02fb }
        if (r3 == 0) goto L_0x0159;
    L_0x00d1:
        r7 = new com.whatsapp.util.bj;	 Catch:{ a6 -> 0x019d, FileNotFoundException -> 0x02aa, IOException -> 0x02fb }
        r3 = r10.file;	 Catch:{ a6 -> 0x019d, FileNotFoundException -> 0x02aa, IOException -> 0x02fb }
        r7.<init>(r3);	 Catch:{ a6 -> 0x019d, FileNotFoundException -> 0x02aa, IOException -> 0x02fb }
        r8 = r7.e();	 Catch:{ a6 -> 0x019d, FileNotFoundException -> 0x02aa, IOException -> 0x02fb }
        r9 = r7.d();	 Catch:{ a6 -> 0x019d, FileNotFoundException -> 0x02aa, IOException -> 0x02fb }
        if (r8 < r9) goto L_0x00e9;
    L_0x00e2:
        r6 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        r3 = r9 * r6;
        r3 = r3 / r8;
        if (r11 == 0) goto L_0x00ee;
    L_0x00e9:
        r3 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        r6 = r8 * r3;
        r6 = r6 / r9;
    L_0x00ee:
        r8 = r10.trimFrom;	 Catch:{ Exception -> 0x02eb }
        r12 = 0;
        r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r8 < 0) goto L_0x0130;
    L_0x00f6:
        r8 = r10.trimTo;	 Catch:{ Exception -> 0x02eb }
        r12 = 0;
        r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r8 <= 0) goto L_0x0130;
    L_0x00fe:
        r8 = r7.f();	 Catch:{ Exception -> 0x02ed }
        if (r8 != 0) goto L_0x011b;
    L_0x0104:
        r8 = r10.file;	 Catch:{ Exception -> 0x02ef }
        r8 = com.whatsapp.id.b(r8);	 Catch:{ Exception -> 0x02ef }
        if (r8 == 0) goto L_0x011b;
    L_0x010c:
        r8 = z;	 Catch:{ Exception -> 0x02f1 }
        r9 = 5;
        r8 = r8[r9];	 Catch:{ Exception -> 0x02f1 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ Exception -> 0x02f1 }
        r8 = r10.transcoder;	 Catch:{ Exception -> 0x02f1 }
        r8.f();	 Catch:{ Exception -> 0x02f1 }
        if (r11 == 0) goto L_0x0157;
    L_0x011b:
        r8 = r10.transcoder;	 Catch:{ Exception -> 0x02f3 }
        r12 = r10.trimTo;	 Catch:{ Exception -> 0x02f3 }
        r14 = r10.trimFrom;	 Catch:{ Exception -> 0x02f3 }
        r12 = r12 - r14;
        r9 = com.whatsapp.util.f.a(r6, r3, r12);	 Catch:{ Exception -> 0x02f3 }
        r8.a(r9);	 Catch:{ Exception -> 0x02f3 }
        r8 = r10.transcoder;	 Catch:{ Exception -> 0x02f3 }
        r8.g();	 Catch:{ Exception -> 0x02f3 }
        if (r11 == 0) goto L_0x0157;
    L_0x0130:
        r8 = r7.f();	 Catch:{ Exception -> 0x02f5 }
        if (r8 != 0) goto L_0x0145;
    L_0x0136:
        r8 = z;	 Catch:{ Exception -> 0x02f7 }
        r9 = 2;
        r8 = r8[r9];	 Catch:{ Exception -> 0x02f7 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ Exception -> 0x02f7 }
        r8 = r10.file;	 Catch:{ Exception -> 0x02f7 }
        com.whatsapp.util.f.a(r8, r5);	 Catch:{ Exception -> 0x02f7 }
        if (r11 == 0) goto L_0x0157;
    L_0x0145:
        r8 = r10.transcoder;	 Catch:{ Exception -> 0x02f9 }
        r12 = r7.c();	 Catch:{ Exception -> 0x02f9 }
        r3 = com.whatsapp.util.f.a(r6, r3, r12);	 Catch:{ Exception -> 0x02f9 }
        r8.a(r3);	 Catch:{ Exception -> 0x02f9 }
        r3 = r10.transcoder;	 Catch:{ Exception -> 0x02f9 }
        r3.g();	 Catch:{ Exception -> 0x02f9 }
    L_0x0157:
        if (r11 == 0) goto L_0x03a3;
    L_0x0159:
        r6 = r10.trimFrom;	 Catch:{ Exception -> 0x0363 }
        r8 = 0;
        r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r3 < 0) goto L_0x0170;
    L_0x0161:
        r6 = r10.trimTo;	 Catch:{ Exception -> 0x0365 }
        r8 = 0;
        r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r3 <= 0) goto L_0x0170;
    L_0x0169:
        r3 = r10.transcoder;	 Catch:{ Exception -> 0x0367 }
        r3.f();	 Catch:{ Exception -> 0x0367 }
        if (r11 == 0) goto L_0x03a3;
    L_0x0170:
        r3 = r10.file;	 Catch:{ Exception -> 0x0369 }
        r6 = r3.length();	 Catch:{ Exception -> 0x0369 }
        r6 = (double) r6;	 Catch:{ Exception -> 0x0369 }
        r3 = com.whatsapp.ge.k;	 Catch:{ Exception -> 0x0369 }
        r8 = (long) r3;
        r12 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r8 = r8 * r12;
        r8 = (double) r8;
        r12 = 4609434218613702656; // 0x3ff8000000000000 float:0.0 double:1.5;
        r8 = r8 * r12;
        r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r3 >= 0) goto L_0x0195;
    L_0x0186:
        r3 = z;	 Catch:{ Exception -> 0x036b }
        r6 = 6;
        r3 = r3[r6];	 Catch:{ Exception -> 0x036b }
        com.whatsapp.util.Log.i(r3);	 Catch:{ Exception -> 0x036b }
        r3 = r10.file;	 Catch:{ Exception -> 0x036b }
        com.whatsapp.util.f.a(r3, r5);	 Catch:{ Exception -> 0x036b }
        if (r11 == 0) goto L_0x03a3;
    L_0x0195:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ Exception -> 0x019b }
        r3.<init>();	 Catch:{ Exception -> 0x019b }
        throw r3;	 Catch:{ Exception -> 0x019b }
    L_0x019b:
        r3 = move-exception;
        throw r3;	 Catch:{ a6 -> 0x019d, FileNotFoundException -> 0x02aa, IOException -> 0x02fb }
    L_0x019d:
        r3 = move-exception;
        r3 = z;	 Catch:{ all -> 0x036d }
        r6 = 10;
        r3 = r3[r6];	 Catch:{ all -> 0x036d }
        com.whatsapp.util.Log.e(r3);	 Catch:{ all -> 0x036d }
        r3 = 0;
        com.whatsapp.VideoFrameConverter.setLogFilePath(r3);	 Catch:{ InterruptedException -> 0x0261 }
        r0 = r16;
        r3 = r0.a;	 Catch:{ InterruptedException -> 0x0261 }
        r3 = com.whatsapp.j_.b(r3);	 Catch:{ InterruptedException -> 0x0261 }
        if (r3 == 0) goto L_0x01ce;
    L_0x01b5:
        r0 = r16;
        r3 = r0.a;	 Catch:{ Exception -> 0x03ec }
        r3 = com.whatsapp.j_.b(r3);	 Catch:{ Exception -> 0x03ec }
        r3 = r3.isHeld();	 Catch:{ Exception -> 0x03ec }
        if (r3 == 0) goto L_0x01ce;
    L_0x01c3:
        r0 = r16;
        r3 = r0.a;	 Catch:{ Exception -> 0x03ec }
        r3 = com.whatsapp.j_.b(r3);	 Catch:{ Exception -> 0x03ec }
        r3.release();	 Catch:{ Exception -> 0x03ec }
    L_0x01ce:
        r3 = com.whatsapp.App.aj;	 Catch:{ Exception -> 0x03ee }
        r3 = r3.exists();	 Catch:{ Exception -> 0x03ee }
        if (r3 == 0) goto L_0x040e;
    L_0x01d6:
        r3 = com.whatsapp.App.aj;	 Catch:{ Exception -> 0x03ee }
        r3.delete();	 Catch:{ Exception -> 0x03ee }
        r3 = r4;
    L_0x01dc:
        if (r3 == 0) goto L_0x023f;
    L_0x01de:
        r10.file = r5;	 Catch:{ Exception -> 0x0404 }
        r3 = 1;
        r10.transcoded = r3;	 Catch:{ Exception -> 0x0404 }
        r3 = r10.file;	 Catch:{ Exception -> 0x0404 }
        r4 = r3.length();	 Catch:{ Exception -> 0x0404 }
        r10.fileSize = r4;	 Catch:{ Exception -> 0x0404 }
        r3 = r10.file;	 Catch:{ Exception -> 0x0404 }
        r3 = r3.getName();	 Catch:{ Exception -> 0x0404 }
        r2.H = r3;	 Catch:{ Exception -> 0x0404 }
        r4 = r10.fileSize;	 Catch:{ Exception -> 0x0404 }
        r2.k = r4;	 Catch:{ Exception -> 0x0404 }
        r3 = r10.file;	 Catch:{ Exception -> 0x0404 }
        r3 = com.whatsapp.util.f.b(r3);	 Catch:{ Exception -> 0x0404 }
        r2.p = r3;	 Catch:{ Exception -> 0x0404 }
        r4 = r10.trimFrom;	 Catch:{ Exception -> 0x0404 }
        r6 = 0;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 <= 0) goto L_0x0224;
    L_0x0207:
        com.whatsapp.util.bo.a(r2);	 Catch:{ InterruptedException -> 0x0261 }
        r3 = r10.file;	 Catch:{ InterruptedException -> 0x0261 }
        r3 = r3.getAbsolutePath();	 Catch:{ InterruptedException -> 0x0261 }
        r3 = com.whatsapp.util.f.a(r3);	 Catch:{ InterruptedException -> 0x0261 }
        if (r3 == 0) goto L_0x021b;
    L_0x0216:
        r2.b(r3);	 Catch:{ Exception -> 0x0406 }
        if (r11 == 0) goto L_0x0224;
    L_0x021b:
        r3 = z;	 Catch:{ Exception -> 0x0408 }
        r4 = 11;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0408 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ Exception -> 0x0408 }
    L_0x0224:
        r3 = com.whatsapp.App.aJ;	 Catch:{ Exception -> 0x040a }
        r4 = 1;
        r5 = -1;
        r3.a(r2, r4, r5);	 Catch:{ Exception -> 0x040a }
        r0 = r16;
        r3 = r0.a;	 Catch:{ Exception -> 0x040a }
        r3 = com.whatsapp.j_.c(r3);	 Catch:{ Exception -> 0x040a }
        r4 = new com.whatsapp.ot;	 Catch:{ Exception -> 0x040a }
        r0 = r16;
        r4.<init>(r0, r2);	 Catch:{ Exception -> 0x040a }
        r3.post(r4);	 Catch:{ Exception -> 0x040a }
        if (r11 == 0) goto L_0x0257;
    L_0x023f:
        r3 = 0;
        r10.transferring = r3;	 Catch:{ Exception -> 0x040a }
        r3 = 0;
        r2.a = r3;	 Catch:{ Exception -> 0x040a }
        r3 = r10.transcoder;	 Catch:{ Exception -> 0x040a }
        r3 = r3.c();	 Catch:{ Exception -> 0x040a }
        if (r3 == 0) goto L_0x0250;
    L_0x024d:
        r3 = 0;
        r10.autodownloadRetryEnabled = r3;	 Catch:{ Exception -> 0x040c }
    L_0x0250:
        r3 = com.whatsapp.App.aJ;	 Catch:{ InterruptedException -> 0x0261 }
        r4 = 1;
        r5 = -1;
        r3.a(r2, r4, r5);	 Catch:{ InterruptedException -> 0x0261 }
    L_0x0257:
        r2 = java.lang.Thread.interrupted();	 Catch:{ InterruptedException -> 0x0261 }
        if (r2 == 0) goto L_0x000a;
    L_0x025d:
        return;
    L_0x025e:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x025e }
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x0261:
        r2 = move-exception;
        r0 = r16;
        r2 = r0.a;
        r3 = com.whatsapp.j_.a(r2);
        monitor-enter(r3);
    L_0x026b:
        r0 = r16;
        r2 = r0.a;	 Catch:{ all -> 0x0297 }
        r2 = com.whatsapp.j_.a(r2);	 Catch:{ all -> 0x0297 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0297 }
        if (r2 != 0) goto L_0x0295;
    L_0x0279:
        r0 = r16;
        r2 = r0.a;	 Catch:{ all -> 0x0297 }
        r2 = com.whatsapp.j_.a(r2);	 Catch:{ all -> 0x0297 }
        r4 = 0;
        r2 = r2.remove(r4);	 Catch:{ all -> 0x0297 }
        r2 = (com.whatsapp.protocol.b) r2;	 Catch:{ all -> 0x0297 }
        r2 = r2.A;	 Catch:{ all -> 0x0297 }
        r2 = (com.whatsapp.MediaData) r2;	 Catch:{ all -> 0x0297 }
        r4 = 0;
        r2.transferring = r4;	 Catch:{ all -> 0x0297 }
        r4 = 0;
        r2.progress = r4;	 Catch:{ all -> 0x0297 }
        if (r11 == 0) goto L_0x026b;
    L_0x0295:
        monitor-exit(r3);	 Catch:{ all -> 0x0297 }
        goto L_0x025d;
    L_0x0297:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0297 }
        throw r2;
    L_0x029a:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x029a }
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x029d:
        r3 = move-exception;
        r6 = z;	 Catch:{ InterruptedException -> 0x0261 }
        r7 = 7;
        r6 = r6[r7];	 Catch:{ InterruptedException -> 0x0261 }
        com.whatsapp.util.Log.b(r6, r3);	 Catch:{ InterruptedException -> 0x0261 }
        goto L_0x00b4;
    L_0x02a8:
        r3 = move-exception;
        throw r3;	 Catch:{ a6 -> 0x019d, FileNotFoundException -> 0x02aa, IOException -> 0x02fb }
    L_0x02aa:
        r3 = move-exception;
        r6 = z;	 Catch:{ all -> 0x036d }
        r7 = 8;
        r6 = r6[r7];	 Catch:{ all -> 0x036d }
        com.whatsapp.util.Log.b(r6, r3);	 Catch:{ all -> 0x036d }
        r3 = 0;
        com.whatsapp.VideoFrameConverter.setLogFilePath(r3);	 Catch:{ InterruptedException -> 0x0261 }
        r0 = r16;
        r3 = r0.a;	 Catch:{ InterruptedException -> 0x0261 }
        r3 = com.whatsapp.j_.b(r3);	 Catch:{ InterruptedException -> 0x0261 }
        if (r3 == 0) goto L_0x02db;
    L_0x02c2:
        r0 = r16;
        r3 = r0.a;	 Catch:{ Exception -> 0x03f0 }
        r3 = com.whatsapp.j_.b(r3);	 Catch:{ Exception -> 0x03f0 }
        r3 = r3.isHeld();	 Catch:{ Exception -> 0x03f0 }
        if (r3 == 0) goto L_0x02db;
    L_0x02d0:
        r0 = r16;
        r3 = r0.a;	 Catch:{ Exception -> 0x03f0 }
        r3 = com.whatsapp.j_.b(r3);	 Catch:{ Exception -> 0x03f0 }
        r3.release();	 Catch:{ Exception -> 0x03f0 }
    L_0x02db:
        r3 = com.whatsapp.App.aj;	 Catch:{ Exception -> 0x03f2 }
        r3 = r3.exists();	 Catch:{ Exception -> 0x03f2 }
        if (r3 == 0) goto L_0x040e;
    L_0x02e3:
        r3 = com.whatsapp.App.aj;	 Catch:{ Exception -> 0x03f2 }
        r3.delete();	 Catch:{ Exception -> 0x03f2 }
        r3 = r4;
        goto L_0x01dc;
    L_0x02eb:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x02ed }
    L_0x02ed:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x02ef }
    L_0x02ef:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x02f1 }
    L_0x02f1:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x02f3 }
    L_0x02f3:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x02f5 }
    L_0x02f5:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x02f7 }
    L_0x02f7:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x02f9 }
    L_0x02f9:
        r3 = move-exception;
        throw r3;	 Catch:{ a6 -> 0x019d, FileNotFoundException -> 0x02aa, IOException -> 0x02fb }
    L_0x02fb:
        r3 = move-exception;
        r6 = z;	 Catch:{ Exception -> 0x03f4 }
        r7 = 1;
        r6 = r6[r7];	 Catch:{ Exception -> 0x03f4 }
        com.whatsapp.util.Log.b(r6, r3);	 Catch:{ Exception -> 0x03f4 }
        r6 = r3.getMessage();	 Catch:{ Exception -> 0x03f4 }
        if (r6 == 0) goto L_0x032c;
    L_0x030a:
        r3 = r3.getMessage();	 Catch:{ Exception -> 0x03f4 }
        r6 = z;	 Catch:{ Exception -> 0x03f4 }
        r7 = 9;
        r6 = r6[r7];	 Catch:{ Exception -> 0x03f4 }
        r3 = r3.contains(r6);	 Catch:{ Exception -> 0x03f4 }
        if (r3 == 0) goto L_0x032c;
    L_0x031a:
        r0 = r16;
        r3 = r0.a;	 Catch:{ Exception -> 0x03f6 }
        r3 = com.whatsapp.j_.c(r3);	 Catch:{ Exception -> 0x03f6 }
        r6 = new com.whatsapp.anw;	 Catch:{ Exception -> 0x03f6 }
        r0 = r16;
        r6.<init>(r0);	 Catch:{ Exception -> 0x03f6 }
        r3.post(r6);	 Catch:{ Exception -> 0x03f6 }
    L_0x032c:
        r3 = 0;
        com.whatsapp.VideoFrameConverter.setLogFilePath(r3);	 Catch:{ Exception -> 0x03f8 }
        r0 = r16;
        r3 = r0.a;	 Catch:{ Exception -> 0x03f8 }
        r3 = com.whatsapp.j_.b(r3);	 Catch:{ Exception -> 0x03f8 }
        if (r3 == 0) goto L_0x0353;
    L_0x033a:
        r0 = r16;
        r3 = r0.a;	 Catch:{ Exception -> 0x03f8 }
        r3 = com.whatsapp.j_.b(r3);	 Catch:{ Exception -> 0x03f8 }
        r3 = r3.isHeld();	 Catch:{ Exception -> 0x03f8 }
        if (r3 == 0) goto L_0x0353;
    L_0x0348:
        r0 = r16;
        r3 = r0.a;	 Catch:{ Exception -> 0x03fa }
        r3 = com.whatsapp.j_.b(r3);	 Catch:{ Exception -> 0x03fa }
        r3.release();	 Catch:{ Exception -> 0x03fa }
    L_0x0353:
        r3 = com.whatsapp.App.aj;	 Catch:{ Exception -> 0x03fc }
        r3 = r3.exists();	 Catch:{ Exception -> 0x03fc }
        if (r3 == 0) goto L_0x040e;
    L_0x035b:
        r3 = com.whatsapp.App.aj;	 Catch:{ Exception -> 0x03fc }
        r3.delete();	 Catch:{ Exception -> 0x03fc }
        r3 = r4;
        goto L_0x01dc;
    L_0x0363:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0365 }
    L_0x0365:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0367 }
    L_0x0367:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0369 }
    L_0x0369:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x036b }
    L_0x036b:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x019b }
    L_0x036d:
        r2 = move-exception;
        r3 = 0;
        com.whatsapp.VideoFrameConverter.setLogFilePath(r3);	 Catch:{ Exception -> 0x03fe }
        r0 = r16;
        r3 = r0.a;	 Catch:{ Exception -> 0x03fe }
        r3 = com.whatsapp.j_.b(r3);	 Catch:{ Exception -> 0x03fe }
        if (r3 == 0) goto L_0x0395;
    L_0x037c:
        r0 = r16;
        r3 = r0.a;	 Catch:{ Exception -> 0x03fe }
        r3 = com.whatsapp.j_.b(r3);	 Catch:{ Exception -> 0x03fe }
        r3 = r3.isHeld();	 Catch:{ Exception -> 0x03fe }
        if (r3 == 0) goto L_0x0395;
    L_0x038a:
        r0 = r16;
        r3 = r0.a;	 Catch:{ Exception -> 0x0400 }
        r3 = com.whatsapp.j_.b(r3);	 Catch:{ Exception -> 0x0400 }
        r3.release();	 Catch:{ Exception -> 0x0400 }
    L_0x0395:
        r3 = com.whatsapp.App.aj;	 Catch:{ Exception -> 0x0402 }
        r3 = r3.exists();	 Catch:{ Exception -> 0x0402 }
        if (r3 == 0) goto L_0x03a2;
    L_0x039d:
        r3 = com.whatsapp.App.aj;	 Catch:{ Exception -> 0x0402 }
        r3.delete();	 Catch:{ Exception -> 0x0402 }
    L_0x03a2:
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x03a3:
        r3 = r10.transcoder;	 Catch:{ Exception -> 0x03e4 }
        r3 = r3.c();	 Catch:{ Exception -> 0x03e4 }
        if (r3 != 0) goto L_0x03e6;
    L_0x03ab:
        r3 = 1;
    L_0x03ac:
        r4 = 0;
        com.whatsapp.VideoFrameConverter.setLogFilePath(r4);	 Catch:{ Exception -> 0x03e8 }
        r0 = r16;
        r4 = r0.a;	 Catch:{ Exception -> 0x03e8 }
        r4 = com.whatsapp.j_.b(r4);	 Catch:{ Exception -> 0x03e8 }
        if (r4 == 0) goto L_0x03d3;
    L_0x03ba:
        r0 = r16;
        r4 = r0.a;	 Catch:{ Exception -> 0x03e8 }
        r4 = com.whatsapp.j_.b(r4);	 Catch:{ Exception -> 0x03e8 }
        r4 = r4.isHeld();	 Catch:{ Exception -> 0x03e8 }
        if (r4 == 0) goto L_0x03d3;
    L_0x03c8:
        r0 = r16;
        r4 = r0.a;	 Catch:{ Exception -> 0x03ea }
        r4 = com.whatsapp.j_.b(r4);	 Catch:{ Exception -> 0x03ea }
        r4.release();	 Catch:{ Exception -> 0x03ea }
    L_0x03d3:
        r4 = com.whatsapp.App.aj;	 Catch:{ Exception -> 0x03e2 }
        r4 = r4.exists();	 Catch:{ Exception -> 0x03e2 }
        if (r4 == 0) goto L_0x01dc;
    L_0x03db:
        r4 = com.whatsapp.App.aj;	 Catch:{ Exception -> 0x03e2 }
        r4.delete();	 Catch:{ Exception -> 0x03e2 }
        goto L_0x01dc;
    L_0x03e2:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x03e4:
        r3 = move-exception;
        throw r3;	 Catch:{ a6 -> 0x019d, FileNotFoundException -> 0x02aa, IOException -> 0x02fb }
    L_0x03e6:
        r3 = 0;
        goto L_0x03ac;
    L_0x03e8:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x03ea }
    L_0x03ea:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x03ec:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x03ee:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x03f0:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x03f2:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x03f4:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x03f6 }
    L_0x03f6:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x036d }
    L_0x03f8:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x03fa }
    L_0x03fa:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x03fc:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x03fe:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0400 }
    L_0x0400:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x0402:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x0404:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x0406:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0408 }
    L_0x0408:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x040a:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x040c }
    L_0x040c:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0261 }
    L_0x040e:
        r3 = r4;
        goto L_0x01dc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fj.run():void");
    }

    fj(j_ j_Var) {
        this.a = j_Var;
    }
}
