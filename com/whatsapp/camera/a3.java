package com.whatsapp.camera;

import android.net.Uri;
import android.os.AsyncTask;
import com.whatsapp.util.Log;
import com.whatsapp.util.bx;
import com.whatsapp.util.f;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a3 extends AsyncTask {
    private static final String z;
    final Uri a;
    final m b;

    static {
        char[] toCharArray = "q7\"L%s7,]>d?;Pxw$=F%(v".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 86;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    a3(m mVar, Uri uri) {
        this.b = mVar;
        this.a = uri;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.lang.Throwable r5) {
        /*
        r4_this = this;
        r0 = com.whatsapp.camera.CameraActivity.l;
        r1 = r4.b;	 Catch:{ SecurityException -> 0x006d }
        r1 = r1.c;	 Catch:{ SecurityException -> 0x006d }
        r2 = 2131427577; // 0x7f0b00f9 float:1.8476774E38 double:1.0530651424E-314;
        r1 = r1.findViewById(r2);	 Catch:{ SecurityException -> 0x006d }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ SecurityException -> 0x006d }
        r1 = r5 instanceof java.io.FileNotFoundException;	 Catch:{ SecurityException -> 0x006d }
        if (r1 == 0) goto L_0x0023;
    L_0x0016:
        r1 = r4.b;	 Catch:{ SecurityException -> 0x006f }
        r1 = r1.c;	 Catch:{ SecurityException -> 0x006f }
        r2 = 2131624052; // 0x7f0e0074 float:1.8875273E38 double:1.053162214E-314;
        r3 = 1;
        com.whatsapp.App.b(r1, r2, r3);	 Catch:{ SecurityException -> 0x006f }
        if (r0 == 0) goto L_0x0065;
    L_0x0023:
        r1 = r5 instanceof java.lang.OutOfMemoryError;	 Catch:{ SecurityException -> 0x0071 }
        if (r1 == 0) goto L_0x0034;
    L_0x0027:
        r1 = r4.b;	 Catch:{ SecurityException -> 0x0073 }
        r1 = r1.c;	 Catch:{ SecurityException -> 0x0073 }
        r2 = 2131624052; // 0x7f0e0074 float:1.8875273E38 double:1.053162214E-314;
        r3 = 1;
        com.whatsapp.App.b(r1, r2, r3);	 Catch:{ SecurityException -> 0x0073 }
        if (r0 == 0) goto L_0x0065;
    L_0x0034:
        r1 = r5 instanceof java.io.IOException;	 Catch:{ SecurityException -> 0x0075 }
        if (r1 == 0) goto L_0x0045;
    L_0x0038:
        r1 = r4.b;	 Catch:{ SecurityException -> 0x0077 }
        r1 = r1.c;	 Catch:{ SecurityException -> 0x0077 }
        r2 = 2131624052; // 0x7f0e0074 float:1.8875273E38 double:1.053162214E-314;
        r3 = 1;
        com.whatsapp.App.b(r1, r2, r3);	 Catch:{ SecurityException -> 0x0077 }
        if (r0 == 0) goto L_0x0065;
    L_0x0045:
        r1 = r5 instanceof com.whatsapp.util.bx;	 Catch:{ SecurityException -> 0x0079 }
        if (r1 == 0) goto L_0x0056;
    L_0x0049:
        r1 = r4.b;	 Catch:{ SecurityException -> 0x007b }
        r1 = r1.c;	 Catch:{ SecurityException -> 0x007b }
        r2 = 2131624052; // 0x7f0e0074 float:1.8875273E38 double:1.053162214E-314;
        r3 = 1;
        com.whatsapp.App.b(r1, r2, r3);	 Catch:{ SecurityException -> 0x007b }
        if (r0 == 0) goto L_0x0065;
    L_0x0056:
        r0 = r5 instanceof java.lang.SecurityException;	 Catch:{ SecurityException -> 0x007d }
        if (r0 == 0) goto L_0x0065;
    L_0x005a:
        r0 = r4.b;	 Catch:{ SecurityException -> 0x007d }
        r0 = r0.c;	 Catch:{ SecurityException -> 0x007d }
        r1 = 2131624611; // 0x7f0e02a3 float:1.8876407E38 double:1.05316249E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ SecurityException -> 0x007d }
    L_0x0065:
        r0 = r4.b;
        r0 = r0.c;
        r0.finish();
        return;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.a3.a(java.lang.Throwable):void");
    }

    protected void onPostExecute(Object obj) {
        a((Throwable) obj);
    }

    protected Throwable a(Void[] voidArr) {
        Throwable e;
        try {
            f.a(this.b.c, CameraActivity.w(this.b.c).e, this.a);
            return null;
        } catch (OutOfMemoryError e2) {
            e = e2;
            Log.e(z + e.getMessage());
            return e;
        } catch (IOException e3) {
            e = e3;
            Log.e(z + e.getMessage());
            return e;
        } catch (bx e4) {
            e = e4;
            Log.e(z + e.getMessage());
            return e;
        } catch (SecurityException e5) {
            e = e5;
            Log.e(z + e.getMessage());
            return e;
        }
    }
}
