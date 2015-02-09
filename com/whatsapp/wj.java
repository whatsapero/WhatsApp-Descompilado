package com.whatsapp;

import android.content.SharedPreferences.Editor;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class wj extends ContentObserver {
    private static int a;
    private static boolean b;
    private static int c;
    private static final String[] z;
    private final Runnable d;
    private final Handler e;
    private final Runnable f;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c(boolean r5) {
        /*
        r4_this = this;
        monitor-enter(r4);
        if (r5 == 0) goto L_0x001d;
    L_0x0003:
        r0 = a;	 Catch:{ all -> 0x003c }
        if (r0 != 0) goto L_0x0013;
    L_0x0007:
        r0 = 1;
        b = r0;	 Catch:{ all -> 0x003c }
        r0 = com.whatsapp.App.p;	 Catch:{ all -> 0x003c }
        r0 = r0.getContentResolver();	 Catch:{ all -> 0x003c }
        r0.unregisterContentObserver(r4);	 Catch:{ all -> 0x003c }
    L_0x0013:
        r0 = a;	 Catch:{ all -> 0x003c }
        r0 = r0 + 1;
        a = r0;	 Catch:{ all -> 0x003c }
        r0 = com.whatsapp.App.az;	 Catch:{ all -> 0x003c }
        if (r0 == 0) goto L_0x003a;
    L_0x001d:
        r0 = a;	 Catch:{ all -> 0x003c }
        r0 = r0 + -1;
        a = r0;	 Catch:{ all -> 0x003c }
        r0 = a;	 Catch:{ all -> 0x003c }
        if (r0 != 0) goto L_0x003a;
    L_0x0027:
        r0 = 0;
        b = r0;	 Catch:{ all -> 0x003c }
        r0 = com.whatsapp.App.p;	 Catch:{ all -> 0x003c }
        r0 = r0.U();	 Catch:{ all -> 0x003c }
        r1 = new com.whatsapp.bx;	 Catch:{ all -> 0x003c }
        r1.<init>(r4);	 Catch:{ all -> 0x003c }
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r0.postDelayed(r1, r2);	 Catch:{ all -> 0x003c }
    L_0x003a:
        monitor-exit(r4);
        return;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wj.c(boolean):void");
    }

    public void onChange(boolean z) {
        if (App.an == null) {
            return;
        }
        if (b) {
            Log.i(z[0]);
        } else {
            b();
        }
    }

    public int a() {
        if (c == -1) {
            c = App.p.getSharedPreferences(z[7], 0).getInt(z[8], 0);
        }
        return c;
    }

    static void b(wj wjVar) {
        wjVar.b();
    }

    static {
        String[] strArr = new String[14];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "G\u001b\u0014\u0002tG\u0000U\u0019wW\u0011\b\u0000pV[\t\u001d|T[\u0012\u0019y@#\u0012\u001fyA5\u0019\u0015zQ\u001a\u000e%lJ\u0017";
        int i2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 36;
                        break;
                    case ay.f /*1*/:
                        i4 = 116;
                        break;
                    case ay.n /*2*/:
                        i4 = 122;
                        break;
                    case ay.p /*3*/:
                        i4 = 118;
                        break;
                    default:
                        i4 = 21;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "G\u001b\u0017XbL\u0015\u000e\u0005tT\u0004%\u0006gA\u0012\u001f\u0004pJ\u0017\u001f\u0005";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "T\u0006\u001f\u0010f\u000b\u0007\u0003\u0018vQ\u0004\u001e\u0017aAT";
                    i = 3;
                    strArr2 = strArr3;
                    i2 = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0004\u0012\u001b\u001fyA\u0010";
                    i2 = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "W\r\u0014\u0015JJ\u0011\u001f\u0012p@";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "W\r\u0014\u0015";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "G\u001b\u0017XbL\u0015\u000e\u0005tT\u0004%\u0006gA\u0012\u001f\u0004pJ\u0017\u001f\u0005";
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "G\u001b\u0014\u0002tG\u0000%\u0000pV\u0007\u0013\u0019{";
                    i2 = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "G\u001b\u0014\u0002tG\u0000U\u0019wW\u0011\b\u0000pV[\t\u0013aR\u0011\b\u0005|K\u001a\t\u0003x\u000b\u0012\u001b\u001fyA\u0010";
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "G\u001b\u0014\u0002tG\u0000U\u0019wW\u0011\b\u0000pV[\t\u0013aR\u0011\b\u0005|K\u001aG";
                    i2 = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "G\u001b\u0014\u0002tG\u0000%\u0000pV\u0007\u0013\u0019{";
                    i2 = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0004\\\n\u0004pRI";
                    i2 = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "G\u001b\u0017XbL\u0015\u000e\u0005tT\u0004%\u0006gA\u0012\u001f\u0004pJ\u0017\u001f\u0005";
                    i2 = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = -1;
                default:
                    strArr2[i] = str;
                    str = "W\r\u0014\u0015JJ\u0011\u001f\u0012p@";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    static Runnable a(wj wjVar) {
        return wjVar.f;
    }

    public void a(int i) {
        int a = a();
        Log.i(z[10] + i + z[12] + a + ")");
        if (a != i) {
            c = i;
            Editor edit = App.p.getSharedPreferences(z[13], 0).edit();
            edit.putInt(z[11], i);
            if (!edit.commit()) {
                Log.e(z[9]);
            }
        }
    }

    public void a(boolean z) {
        a(z, false);
    }

    public void b(boolean z) {
        a(z, true);
    }

    private synchronized void b() {
        this.e.removeCallbacks(this.d);
        this.e.post(this.d);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r7, boolean r8) {
        /*
        r6_this = this;
        r2 = 2;
        r1 = 1;
        r0 = 0;
        r3 = com.whatsapp.App.az;
        r4 = z;
        r4 = r4[r2];
        r5 = com.whatsapp.App.p;
        r4 = r5.getSharedPreferences(r4, r0);
        if (r4 == 0) goto L_0x0027;
    L_0x0011:
        r5 = z;
        r5 = r5[r1];
        r5 = r4.getInt(r5, r0);
        if (r8 == 0) goto L_0x0021;
    L_0x001b:
        switch(r5) {
            case 0: goto L_0x0027;
            case 1: goto L_0x002a;
            case 2: goto L_0x0028;
            default: goto L_0x001e;
        };
    L_0x001e:
        r0 = r1;
    L_0x001f:
        if (r3 == 0) goto L_0x0030;
    L_0x0021:
        if (r7 == 0) goto L_0x0025;
    L_0x0023:
        if (r3 == 0) goto L_0x0066;
    L_0x0025:
        if (r5 != r1) goto L_0x002f;
    L_0x0027:
        return;
    L_0x0028:
        if (r3 == 0) goto L_0x001f;
    L_0x002a:
        if (r7 == 0) goto L_0x0027;
    L_0x002c:
        if (r3 == 0) goto L_0x001f;
    L_0x002e:
        goto L_0x0027;
    L_0x002f:
        r0 = r2;
    L_0x0030:
        r1 = r4.edit();
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r1 = r1.putInt(r2, r0);
        r1 = r1.commit();
        if (r1 != 0) goto L_0x0027;
    L_0x0043:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0027;
    L_0x0066:
        r0 = r1;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wj.a(boolean, boolean):void");
    }

    public wj() {
        super(null);
        this.f = new l(this);
        this.d = new atr(this);
        HandlerThread handlerThread = new HandlerThread(z[6], 10);
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
    }
}
