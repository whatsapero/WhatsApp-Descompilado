package com.whatsapp.util;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class ab extends Thread {
    private static final String[] z;
    final bo a;

    static {
        String[] strArr = new String[10];
        String str = "\\ni,>\u0019nW)0\u0018n`d";
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
                        i3 = 124;
                        break;
                    case ay.f /*1*/:
                        i3 = 26;
                        break;
                    case ay.n /*2*/:
                        i3 = 8;
                        break;
                    case ay.p /*3*/:
                        i3 = 94;
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
                    str = "\\yg+7\b ";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0011\u007f{-8\u001b\u007f|6,\u0011x{*1\u000e\u007fi:v\u001f{k6<\\ri,=\\ia$<F";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "3ha;7\b{|76\u0012";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\\r2";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0011\u007f{-8\u001b\u007f|6,\u0011x{*1\u000e\u007fi:v\u001f{k6<\\ig8-\\ia$<F";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\\yg+7\b ";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    str = "\u0011\u007f{-8\u001b\u007f|6,\u0011x{*1\u000e\u007fi:v\u0018\u007fk1=\u0019:n75\u0019ia$<F";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "\\ii3)\u0010\u007f2";
                    obj = 8;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\\m2";
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
        r15 = 3;
        r10 = 0;
        r14 = 1;
        r11 = com.whatsapp.util.Log.e;
    L_0x0005:
        r0 = r16;
        r2 = r0.a;	 Catch:{ InterruptedException -> 0x015a }
        r2 = com.whatsapp.util.bo.e(r2);	 Catch:{ InterruptedException -> 0x015a }
        r2 = com.whatsapp.util.a8.a(r2);	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.size();	 Catch:{ InterruptedException -> 0x015a }
        if (r2 != 0) goto L_0x0034;
    L_0x0017:
        r0 = r16;
        r2 = r0.a;	 Catch:{ InterruptedException -> 0x015a }
        r2 = com.whatsapp.util.bo.e(r2);	 Catch:{ InterruptedException -> 0x015a }
        r3 = com.whatsapp.util.a8.a(r2);	 Catch:{ InterruptedException -> 0x015a }
        monitor-enter(r3);	 Catch:{ InterruptedException -> 0x015a }
        r0 = r16;
        r2 = r0.a;	 Catch:{ all -> 0x0157 }
        r2 = com.whatsapp.util.bo.e(r2);	 Catch:{ all -> 0x0157 }
        r2 = com.whatsapp.util.a8.a(r2);	 Catch:{ all -> 0x0157 }
        r2.wait();	 Catch:{ all -> 0x0157 }
        monitor-exit(r3);	 Catch:{ all -> 0x0157 }
    L_0x0034:
        r0 = r16;
        r2 = r0.a;	 Catch:{ InterruptedException -> 0x015a }
        r2 = com.whatsapp.util.bo.e(r2);	 Catch:{ InterruptedException -> 0x015a }
        r2 = com.whatsapp.util.a8.a(r2);	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.size();	 Catch:{ InterruptedException -> 0x015a }
        if (r2 == 0) goto L_0x0150;
    L_0x0046:
        r0 = r16;
        r2 = r0.a;	 Catch:{ InterruptedException -> 0x015a }
        r2 = com.whatsapp.util.bo.e(r2);	 Catch:{ InterruptedException -> 0x015a }
        r3 = com.whatsapp.util.a8.a(r2);	 Catch:{ InterruptedException -> 0x015a }
        monitor-enter(r3);	 Catch:{ InterruptedException -> 0x015a }
        r0 = r16;
        r2 = r0.a;	 Catch:{ all -> 0x015c }
        r2 = com.whatsapp.util.bo.e(r2);	 Catch:{ all -> 0x015c }
        r2 = com.whatsapp.util.a8.a(r2);	 Catch:{ all -> 0x015c }
        r2 = r2.pop();	 Catch:{ all -> 0x015c }
        r0 = r2;
        r0 = (com.whatsapp.util.av) r0;	 Catch:{ all -> 0x015c }
        r9 = r0;
        monitor-exit(r3);	 Catch:{ all -> 0x015c }
    L_0x0068:
        r2 = com.whatsapp.util.bo.a();	 Catch:{ InterruptedException -> 0x015a }
        if (r2 == 0) goto L_0x0075;
    L_0x006e:
        r2 = 50;
        java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x015a }
        if (r11 == 0) goto L_0x0068;
    L_0x0075:
        r4 = 0;
        r2 = r9.d;	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.getTag();	 Catch:{ InterruptedException -> 0x015a }
        r3 = r9.c;	 Catch:{ InterruptedException -> 0x015a }
        r3 = r3.e;	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.equals(r3);	 Catch:{ InterruptedException -> 0x015a }
        if (r2 == 0) goto L_0x011f;
    L_0x0086:
        r2 = r9.c;	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.A;	 Catch:{ InterruptedException -> 0x015a }
        r0 = r2;
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ InterruptedException -> 0x015a }
        r3 = r0;
        if (r3 == 0) goto L_0x011f;
    L_0x0090:
        r2 = r3.file;	 Catch:{ OutOfMemoryError -> 0x015f }
        if (r2 == 0) goto L_0x011f;
    L_0x0094:
        r2 = r3.file;	 Catch:{ OutOfMemoryError -> 0x0161 }
        r2 = r2.exists();	 Catch:{ OutOfMemoryError -> 0x0161 }
        if (r2 == 0) goto L_0x011f;
    L_0x009c:
        r2 = r9.c;	 Catch:{ OutOfMemoryError -> 0x0163 }
        r2 = r2.j;	 Catch:{ OutOfMemoryError -> 0x0163 }
        if (r2 != r14) goto L_0x02ad;
    L_0x00a2:
        r6 = new android.graphics.BitmapFactory$Options;	 Catch:{ InterruptedException -> 0x015a }
        r6.<init>();	 Catch:{ InterruptedException -> 0x015a }
        r2 = 1;
        r6.inJustDecodeBounds = r2;	 Catch:{ InterruptedException -> 0x015a }
        r2 = r3.file;	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.getAbsolutePath();	 Catch:{ InterruptedException -> 0x015a }
        android.graphics.BitmapFactory.decodeFile(r2, r6);	 Catch:{ InterruptedException -> 0x015a }
        r2 = r9.b;	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.a();	 Catch:{ InterruptedException -> 0x015a }
        r2 = (float) r2;	 Catch:{ InterruptedException -> 0x015a }
        r4 = com.whatsapp.am1.a();	 Catch:{ InterruptedException -> 0x015a }
        r4 = r4.g;	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2 / r4;
        r4 = (int) r2;	 Catch:{ InterruptedException -> 0x015a }
        r2 = 1;
        r6.inSampleSize = r2;	 Catch:{ InterruptedException -> 0x015a }
        r2 = r6.outWidth;	 Catch:{ InterruptedException -> 0x015a }
    L_0x00c7:
        r5 = r2 / 2;
        if (r5 < r4) goto L_0x00d5;
    L_0x00cb:
        r2 = r2 / 2;
        r5 = r6.inSampleSize;	 Catch:{ InterruptedException -> 0x015a }
        r5 = r5 * 2;
        r6.inSampleSize = r5;	 Catch:{ InterruptedException -> 0x015a }
        if (r11 == 0) goto L_0x00c7;
    L_0x00d5:
        r2 = 0;
        r6.inJustDecodeBounds = r2;	 Catch:{ InterruptedException -> 0x015a }
        r2 = 1;
        r6.inInputShareable = r2;	 Catch:{ InterruptedException -> 0x015a }
        r2 = 1;
        r6.inPurgeable = r2;	 Catch:{ InterruptedException -> 0x015a }
        r2 = r6.outWidth;	 Catch:{ InterruptedException -> 0x015a }
        r5 = r6.outHeight;	 Catch:{ InterruptedException -> 0x015a }
        r7 = r3.file;	 Catch:{ OutOfMemoryError -> 0x0165 }
        r7 = r7.getAbsolutePath();	 Catch:{ OutOfMemoryError -> 0x0165 }
        r2 = android.graphics.BitmapFactory.decodeFile(r7, r6);	 Catch:{ OutOfMemoryError -> 0x0165 }
    L_0x00ec:
        if (r2 == 0) goto L_0x011e;
    L_0x00ee:
        r4 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x02aa }
        r3 = r3.file;	 Catch:{ IOException -> 0x02aa }
        r3 = r3.getAbsolutePath();	 Catch:{ IOException -> 0x02aa }
        r4.<init>(r3);	 Catch:{ IOException -> 0x02aa }
        r3 = z;	 Catch:{ IOException -> 0x02aa }
        r5 = 4;
        r3 = r3[r5];	 Catch:{ IOException -> 0x02aa }
        r5 = 1;
        r3 = r4.getAttributeInt(r3, r5);	 Catch:{ IOException -> 0x02aa }
        r7 = com.whatsapp.util.f.a(r3);	 Catch:{ IOException -> 0x02aa }
        if (r7 == 0) goto L_0x011e;
    L_0x0109:
        r3 = 0;
        r4 = 0;
        r5 = r2.getWidth();	 Catch:{ IOException -> 0x02aa }
        r6 = r2.getHeight();	 Catch:{ IOException -> 0x02aa }
        r8 = 1;
        r3 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ IOException -> 0x02aa }
        if (r2 == r3) goto L_0x011d;
    L_0x011a:
        r2.recycle();	 Catch:{ OutOfMemoryError -> 0x02a8 }
    L_0x011d:
        r2 = r3;
    L_0x011e:
        r4 = r2;
    L_0x011f:
        if (r4 == 0) goto L_0x0150;
    L_0x0121:
        r2 = r9.d;	 Catch:{ OutOfMemoryError -> 0x02bf }
        r2 = r2.getTag();	 Catch:{ OutOfMemoryError -> 0x02bf }
        r3 = r9.c;	 Catch:{ OutOfMemoryError -> 0x02bf }
        r3 = r3.e;	 Catch:{ OutOfMemoryError -> 0x02bf }
        r2 = r2.equals(r3);	 Catch:{ OutOfMemoryError -> 0x02bf }
        if (r2 == 0) goto L_0x014d;
    L_0x0131:
        r2 = new com.whatsapp.util.bb;	 Catch:{ InterruptedException -> 0x015a }
        r0 = r16;
        r3 = r0.a;	 Catch:{ InterruptedException -> 0x015a }
        r5 = r9.d;	 Catch:{ InterruptedException -> 0x015a }
        r6 = r9.c;	 Catch:{ InterruptedException -> 0x015a }
        r7 = r9.b;	 Catch:{ InterruptedException -> 0x015a }
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ InterruptedException -> 0x015a }
        r0 = r16;
        r3 = r0.a;	 Catch:{ OutOfMemoryError -> 0x02c1 }
        r3 = com.whatsapp.util.bo.d(r3);	 Catch:{ OutOfMemoryError -> 0x02c1 }
        r3.post(r2);	 Catch:{ OutOfMemoryError -> 0x02c1 }
        if (r11 == 0) goto L_0x0150;
    L_0x014d:
        r4.recycle();	 Catch:{ OutOfMemoryError -> 0x02c1 }
    L_0x0150:
        r2 = java.lang.Thread.interrupted();	 Catch:{ InterruptedException -> 0x015a }
        if (r2 == 0) goto L_0x0005;
    L_0x0156:
        return;
    L_0x0157:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0157 }
        throw r2;	 Catch:{ InterruptedException -> 0x015a }
    L_0x015a:
        r2 = move-exception;
        goto L_0x0156;
    L_0x015c:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x015c }
        throw r2;	 Catch:{ InterruptedException -> 0x015a }
    L_0x015f:
        r2 = move-exception;
        throw r2;	 Catch:{ OutOfMemoryError -> 0x0161 }
    L_0x0161:
        r2 = move-exception;
        throw r2;	 Catch:{ OutOfMemoryError -> 0x0163 }
    L_0x0163:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x015a }
    L_0x0165:
        r7 = move-exception;
        r7 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x015a }
        r7.<init>();	 Catch:{ InterruptedException -> 0x015a }
        r8 = z;	 Catch:{ InterruptedException -> 0x015a }
        r12 = 8;
        r8 = r8[r12];	 Catch:{ InterruptedException -> 0x015a }
        r7 = r7.append(r8);	 Catch:{ InterruptedException -> 0x015a }
        r8 = r3.file;	 Catch:{ InterruptedException -> 0x015a }
        r12 = r8.length();	 Catch:{ InterruptedException -> 0x015a }
        r7 = r7.append(r12);	 Catch:{ InterruptedException -> 0x015a }
        r8 = z;	 Catch:{ InterruptedException -> 0x015a }
        r12 = 1;
        r8 = r8[r12];	 Catch:{ InterruptedException -> 0x015a }
        r7 = r7.append(r8);	 Catch:{ InterruptedException -> 0x015a }
        r2 = r7.append(r2);	 Catch:{ InterruptedException -> 0x015a }
        r7 = z;	 Catch:{ InterruptedException -> 0x015a }
        r8 = 5;
        r7 = r7[r8];	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.append(r7);	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.append(r5);	 Catch:{ InterruptedException -> 0x015a }
        r5 = z;	 Catch:{ InterruptedException -> 0x015a }
        r7 = 0;
        r5 = r5[r7];	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.append(r5);	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.append(r4);	 Catch:{ InterruptedException -> 0x015a }
        r4 = z;	 Catch:{ InterruptedException -> 0x015a }
        r5 = 9;
        r4 = r4[r5];	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.append(r4);	 Catch:{ InterruptedException -> 0x015a }
        r4 = r6.inSampleSize;	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.append(r4);	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.toString();	 Catch:{ InterruptedException -> 0x015a }
        com.whatsapp.util.Log.e(r2);	 Catch:{ InterruptedException -> 0x015a }
        r2 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x015a }
        r2.<init>();	 Catch:{ InterruptedException -> 0x015a }
        r4 = z;	 Catch:{ InterruptedException -> 0x015a }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.append(r4);	 Catch:{ InterruptedException -> 0x015a }
        r0 = r16;
        r4 = r0.a;	 Catch:{ InterruptedException -> 0x015a }
        r4 = com.whatsapp.util.bo.b(r4);	 Catch:{ InterruptedException -> 0x015a }
        r4 = r4.size();	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.append(r4);	 Catch:{ InterruptedException -> 0x015a }
        r4 = z;	 Catch:{ InterruptedException -> 0x015a }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.append(r4);	 Catch:{ InterruptedException -> 0x015a }
        r0 = r16;
        r4 = r0.a;	 Catch:{ InterruptedException -> 0x015a }
        r4 = com.whatsapp.util.bo.c(r4);	 Catch:{ InterruptedException -> 0x015a }
        r4 = r4.size();	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.append(r4);	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.toString();	 Catch:{ InterruptedException -> 0x015a }
        com.whatsapp.util.Log.e(r2);	 Catch:{ InterruptedException -> 0x015a }
        r0 = r16;
        r2 = r0.a;	 Catch:{ InterruptedException -> 0x015a }
        r2 = com.whatsapp.util.bo.a(r2);	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.values();	 Catch:{ InterruptedException -> 0x015a }
        r7 = r2.iterator();	 Catch:{ InterruptedException -> 0x015a }
        r4 = r10;
        r5 = r10;
    L_0x020d:
        r2 = r7.hasNext();	 Catch:{ InterruptedException -> 0x015a }
        if (r2 == 0) goto L_0x02cb;
    L_0x0213:
        r2 = r7.next();	 Catch:{ InterruptedException -> 0x015a }
        r2 = (java.lang.ref.SoftReference) r2;	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.get();	 Catch:{ InterruptedException -> 0x015a }
        r2 = (android.graphics.Bitmap) r2;	 Catch:{ InterruptedException -> 0x015a }
        if (r2 == 0) goto L_0x02c7;
    L_0x0221:
        r8 = r2.isRecycled();	 Catch:{ OutOfMemoryError -> 0x02a6 }
        if (r8 != 0) goto L_0x02c7;
    L_0x0227:
        r4 = r4 + 1;
        r2 = com.whatsapp.util.b0.a(r2);	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2 / 1024;
        r5 = r5 + r2;
        r2 = r4;
        r4 = r5;
    L_0x0232:
        if (r11 == 0) goto L_0x02c3;
    L_0x0234:
        r5 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x015a }
        r5.<init>();	 Catch:{ InterruptedException -> 0x015a }
        r7 = z;	 Catch:{ InterruptedException -> 0x015a }
        r8 = 6;
        r7 = r7[r8];	 Catch:{ InterruptedException -> 0x015a }
        r5 = r5.append(r7);	 Catch:{ InterruptedException -> 0x015a }
        r4 = r5.append(r4);	 Catch:{ InterruptedException -> 0x015a }
        r5 = z;	 Catch:{ InterruptedException -> 0x015a }
        r7 = 7;
        r5 = r5[r7];	 Catch:{ InterruptedException -> 0x015a }
        r4 = r4.append(r5);	 Catch:{ InterruptedException -> 0x015a }
        r0 = r16;
        r5 = r0.a;	 Catch:{ InterruptedException -> 0x015a }
        r5 = com.whatsapp.util.bo.a(r5);	 Catch:{ InterruptedException -> 0x015a }
        r5 = r5.size();	 Catch:{ InterruptedException -> 0x015a }
        r4 = r4.append(r5);	 Catch:{ InterruptedException -> 0x015a }
        r5 = " ";
        r4 = r4.append(r5);	 Catch:{ InterruptedException -> 0x015a }
        r2 = r4.append(r2);	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.toString();	 Catch:{ InterruptedException -> 0x015a }
        com.whatsapp.util.Log.e(r2);	 Catch:{ InterruptedException -> 0x015a }
        com.whatsapp.App.a5();	 Catch:{ InterruptedException -> 0x015a }
        r0 = r16;
        r2 = r0.a;	 Catch:{ InterruptedException -> 0x015a }
        r2 = com.whatsapp.util.bo.b(r2);	 Catch:{ InterruptedException -> 0x015a }
        r2.evictAll();	 Catch:{ InterruptedException -> 0x015a }
        r0 = r16;
        r2 = r0.a;	 Catch:{ InterruptedException -> 0x015a }
        r2 = com.whatsapp.util.bo.c(r2);	 Catch:{ InterruptedException -> 0x015a }
        r2.clear();	 Catch:{ InterruptedException -> 0x015a }
        r0 = r16;
        r2 = r0.a;	 Catch:{ InterruptedException -> 0x015a }
        r2 = com.whatsapp.util.bo.a(r2);	 Catch:{ InterruptedException -> 0x015a }
        r2.clear();	 Catch:{ InterruptedException -> 0x015a }
        java.lang.System.gc();	 Catch:{ InterruptedException -> 0x015a }
        com.whatsapp.App.a5();	 Catch:{ InterruptedException -> 0x015a }
        r2 = r3.file;	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.getAbsolutePath();	 Catch:{ InterruptedException -> 0x015a }
        r2 = android.graphics.BitmapFactory.decodeFile(r2, r6);	 Catch:{ InterruptedException -> 0x015a }
        goto L_0x00ec;
    L_0x02a6:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x015a }
    L_0x02a8:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x02aa }
    L_0x02aa:
        r3 = move-exception;
        goto L_0x011e;
    L_0x02ad:
        r2 = r9.c;	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.j;	 Catch:{ InterruptedException -> 0x015a }
        if (r2 != r15) goto L_0x011f;
    L_0x02b3:
        r2 = r3.file;	 Catch:{ InterruptedException -> 0x015a }
        r2 = r2.getAbsolutePath();	 Catch:{ InterruptedException -> 0x015a }
        r4 = com.whatsapp.util.f.b(r2);	 Catch:{ InterruptedException -> 0x015a }
        goto L_0x011f;
    L_0x02bf:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x015a }
    L_0x02c1:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x015a }
    L_0x02c3:
        r5 = r4;
        r4 = r2;
        goto L_0x020d;
    L_0x02c7:
        r2 = r4;
        r4 = r5;
        goto L_0x0232;
    L_0x02cb:
        r2 = r4;
        r4 = r5;
        goto L_0x0234;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ab.run():void");
    }

    ab(bo boVar) {
        this.a = boVar;
    }
}
