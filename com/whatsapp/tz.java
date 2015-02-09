package com.whatsapp;

import android.os.AsyncTask;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class tz extends AsyncTask {
    private static final String[] z;
    rk a;
    final avq b;

    static {
        String[] strArr = new String[5];
        String str = ";rn\u0006x#gf\u0000x28z\u001d|&vx\np;vm\n6v";
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
                        i3 = 86;
                        break;
                    case ay.f /*1*/:
                        i3 = 23;
                        break;
                    case ay.n /*2*/:
                        i3 = 10;
                        break;
                    case ay.p /*3*/:
                        i3 = 111;
                        break;
                    default:
                        i3 = 25;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ";rn\u0006x#gf\u0000x28z\u001d|&vx\np;vm\n6v";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = ";rn\u0006x#gf\u0000x28z\u001d|&vx\np;vm\n6v";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ";rn\u0006x#gf\u0000x28z\u001d|&vx\np;vm\n6v";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0018x*\u001ci7to";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    tz(avq com_whatsapp_avq) {
        this.b = com_whatsapp_avq;
        this.a = rk.SUCCESS;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    public void a(String str) {
        if (str == null) {
            try {
                this.b.a(this.a != rk.SUCCESS ? this.a : rk.FAILED_GENERIC);
                return;
            } catch (SecurityException e) {
                throw e;
            }
        }
        avq.a(this.b, str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.String a(java.lang.Void[] r5) {
        /*
        r4_this = this;
        r1 = 1;
        r0 = r4.b;	 Catch:{ IOException -> 0x0090 }
        r0 = r0.k;	 Catch:{ IOException -> 0x0090 }
        r0 = r0.j;	 Catch:{ IOException -> 0x0090 }
        if (r0 != r1) goto L_0x0083;
    L_0x0009:
        r0 = r4.b;	 Catch:{ IOException -> 0x0090 }
        r0 = com.whatsapp.avq.c(r0);	 Catch:{ IOException -> 0x0090 }
        r0 = r0.file;	 Catch:{ IOException -> 0x0090 }
        if (r0 != 0) goto L_0x0083;
    L_0x0013:
        r0 = r4.b;
        r0 = r0.k;
        r0 = r0.H;
        r0 = android.net.Uri.parse(r0);
        r1 = com.whatsapp.avq.h();	 Catch:{ IOException -> 0x0095, bx -> 0x00db, OutOfMemoryError -> 0x00fe, SecurityException -> 0x0122 }
        monitor-enter(r1);	 Catch:{ IOException -> 0x0095, bx -> 0x00db, OutOfMemoryError -> 0x00fe, SecurityException -> 0x0122 }
        r2 = com.whatsapp.App.p;	 Catch:{ all -> 0x0092 }
        r3 = r4.b;	 Catch:{ all -> 0x0092 }
        r3 = com.whatsapp.avq.c(r3);	 Catch:{ all -> 0x0092 }
        r0 = com.whatsapp.util.f.a(r2, r0, r3);	 Catch:{ all -> 0x0092 }
        r2 = r4.b;	 Catch:{ all -> 0x0092 }
        r2 = r2.k;	 Catch:{ all -> 0x0092 }
        r2.b(r0);	 Catch:{ all -> 0x0092 }
        r0 = r4.b;	 Catch:{ all -> 0x0092 }
        r0 = r0.k;	 Catch:{ all -> 0x0092 }
        r2 = r4.b;	 Catch:{ all -> 0x0092 }
        r2 = com.whatsapp.avq.c(r2);	 Catch:{ all -> 0x0092 }
        r2 = r2.file;	 Catch:{ all -> 0x0092 }
        r2 = r2.getName();	 Catch:{ all -> 0x0092 }
        r0.H = r2;	 Catch:{ all -> 0x0092 }
        r0 = r4.b;	 Catch:{ all -> 0x0092 }
        r0 = r0.k;	 Catch:{ all -> 0x0092 }
        r2 = r4.b;	 Catch:{ all -> 0x0092 }
        r2 = com.whatsapp.avq.c(r2);	 Catch:{ all -> 0x0092 }
        r2 = r2.file;	 Catch:{ all -> 0x0092 }
        r2 = r2.length();	 Catch:{ all -> 0x0092 }
        r0.k = r2;	 Catch:{ all -> 0x0092 }
        r0 = r4.b;	 Catch:{ all -> 0x0092 }
        r0 = com.whatsapp.avq.c(r0);	 Catch:{ all -> 0x0092 }
        r2 = r4.b;	 Catch:{ all -> 0x0092 }
        r2 = r2.k;	 Catch:{ all -> 0x0092 }
        r2 = r2.k;	 Catch:{ all -> 0x0092 }
        r0.fileSize = r2;	 Catch:{ all -> 0x0092 }
        monitor-exit(r1);	 Catch:{ all -> 0x0092 }
        r0 = r4.b;	 Catch:{ IOException -> 0x0095, bx -> 0x00db, OutOfMemoryError -> 0x00fe, SecurityException -> 0x0122 }
        r0 = r0.k;	 Catch:{ IOException -> 0x0095, bx -> 0x00db, OutOfMemoryError -> 0x00fe, SecurityException -> 0x0122 }
        com.whatsapp.util.bo.a(r0);	 Catch:{ IOException -> 0x0095, bx -> 0x00db, OutOfMemoryError -> 0x00fe, SecurityException -> 0x0122 }
        r0 = r4.b;	 Catch:{ IOException -> 0x0095, bx -> 0x00db, OutOfMemoryError -> 0x00fe, SecurityException -> 0x0122 }
        r0 = com.whatsapp.avq.c(r0);	 Catch:{ IOException -> 0x0095, bx -> 0x00db, OutOfMemoryError -> 0x00fe, SecurityException -> 0x0122 }
        r1 = 1;
        r0.autodownloadRetryEnabled = r1;	 Catch:{ IOException -> 0x0095, bx -> 0x00db, OutOfMemoryError -> 0x00fe, SecurityException -> 0x0122 }
        r0 = com.whatsapp.App.aJ;	 Catch:{ IOException -> 0x0095, bx -> 0x00db, OutOfMemoryError -> 0x00fe, SecurityException -> 0x0122 }
        r1 = r4.b;	 Catch:{ IOException -> 0x0095, bx -> 0x00db, OutOfMemoryError -> 0x00fe, SecurityException -> 0x0122 }
        r1 = r1.k;	 Catch:{ IOException -> 0x0095, bx -> 0x00db, OutOfMemoryError -> 0x00fe, SecurityException -> 0x0122 }
        r2 = 1;
        r3 = -1;
        r0.a(r1, r2, r3);	 Catch:{ IOException -> 0x0095, bx -> 0x00db, OutOfMemoryError -> 0x00fe, SecurityException -> 0x0122 }
    L_0x0083:
        r0 = r4.a;	 Catch:{ IOException -> 0x0146 }
        r1 = com.whatsapp.rk.SUCCESS;	 Catch:{ IOException -> 0x0146 }
        if (r0 != r1) goto L_0x0148;
    L_0x0089:
        r0 = r4.b;	 Catch:{ IOException -> 0x0146 }
        r0 = r0.f();	 Catch:{ IOException -> 0x0146 }
    L_0x008f:
        return r0;
    L_0x0090:
        r0 = move-exception;
        throw r0;
    L_0x0092:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0092 }
        throw r0;	 Catch:{ IOException -> 0x0095, bx -> 0x00db, OutOfMemoryError -> 0x00fe, SecurityException -> 0x0122 }
    L_0x0095:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00d7 }
        r1.<init>();	 Catch:{ IOException -> 0x00d7 }
        r2 = z;	 Catch:{ IOException -> 0x00d7 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00d7 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x00d7 }
        r2 = r0.toString();	 Catch:{ IOException -> 0x00d7 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x00d7 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x00d7 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IOException -> 0x00d7 }
        r1 = r0.getMessage();	 Catch:{ IOException -> 0x00d7 }
        if (r1 == 0) goto L_0x00d0;
    L_0x00b9:
        r0 = r0.getMessage();	 Catch:{ IOException -> 0x00d9 }
        r1 = z;	 Catch:{ IOException -> 0x00d9 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IOException -> 0x00d9 }
        r0 = r0.contains(r1);	 Catch:{ IOException -> 0x00d9 }
        if (r0 == 0) goto L_0x00d0;
    L_0x00c8:
        r0 = com.whatsapp.rk.FAILED_INSUFFICIENT_SPACE;	 Catch:{ IOException -> 0x00d5 }
        r4.a = r0;	 Catch:{ IOException -> 0x00d5 }
        r0 = com.whatsapp.App.az;	 Catch:{ IOException -> 0x00d5 }
        if (r0 == 0) goto L_0x0083;
    L_0x00d0:
        r0 = com.whatsapp.rk.FAILED_IO;	 Catch:{ IOException -> 0x00d5 }
        r4.a = r0;	 Catch:{ IOException -> 0x00d5 }
        goto L_0x0083;
    L_0x00d5:
        r0 = move-exception;
        throw r0;
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d9 }
    L_0x00d9:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d5 }
    L_0x00db:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = com.whatsapp.rk.FAILED_BAD_MEDIA;
        r4.a = r0;
        goto L_0x0083;
    L_0x00fe:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = com.whatsapp.rk.FAILED_OOM;
        r4.a = r0;
        goto L_0x0083;
    L_0x0122:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = com.whatsapp.rk.FAILED_NO_PERMISSIONS;
        r4.a = r0;
        goto L_0x0083;
    L_0x0146:
        r0 = move-exception;
        throw r0;
    L_0x0148:
        r0 = 0;
        goto L_0x008f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.tz.a(java.lang.Void[]):java.lang.String");
    }

    public void onPostExecute(Object obj) {
        a((String) obj);
    }
}
