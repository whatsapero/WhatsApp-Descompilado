package com.whatsapp;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import com.whatsapp.protocol.cn;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class LocationSharingService extends Service implements LocationListener {
    private static Location e;
    private static final String[] z;
    private Location a;
    private WakeLock b;
    private b8 c;
    private Runnable d;
    private Handler f;

    static {
        String[] strArr = new String[12];
        String str = "\u0018LffW\u0013B\u007f;A\u000bS%\u001bH\u001aQn\u0004O\u0018B\u007f!O\u0015pn:V\u0012@nfs/l[";
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
                        i3 = 123;
                        break;
                    case ay.f /*1*/:
                        i3 = 35;
                        break;
                    case ay.n /*2*/:
                        i3 = 11;
                        break;
                    case ay.p /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 32;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u001fVy)T\u0012Le";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0017Lh)T\u0012Le;H\u001aQb&G\bFy>I\u0018F$;T\u0014S";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0017Lh)T\u0012Le;H\u001aQb&G\bFy>I\u0018F$;T\u001aQ\u007fhL\u001aP\u007fr\u0000";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0017Lh)T\u0012Le;H\u001aQb&G\bFy>I\u0018F$,E\bWy'Y";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0017Lh)T\u0012Le;H\u001aQb&G\bFy>I\u0018F$'N\u0017Lh)T\u0012Le+H\u001aMl-D[";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u000bL|-R";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0017Lh)T\u0012Le;H\u001aQb&G\bFy>I\u0018F$+R\u001eB\u007f-\u000f\u000bN";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "(Kj:E7Lh)T\u0012Le\u001bE\tUb+E";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0017Lh)T\u0012Le;H\u001aQb&G\bFy>I\u0018F$/P\b\fn:R\u0014Q+";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0017Lh)T\u0012Le;H\u001aQb&G\bFy>I\u0018F$+R\u001eB\u007f-";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0017Lh)T\u0012Le;H\u001aQb&G\bFy>I\u0018F$;T\u001aQ\u007fhD\u000eQj<I\u0014M1";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public LocationSharingService() {
        this.f = new Handler();
        this.d = new hr(this);
    }

    public void onCreate() {
        Log.i(z[11]);
        try {
            PowerManager powerManager = (PowerManager) getSystemService(z[7]);
            if (powerManager != null) {
                try {
                    if (this.b == null) {
                        this.b = powerManager.newWakeLock(1, z[9]);
                    }
                    try {
                        if (!(this.b == null || this.b.isHeld())) {
                            this.b.acquire();
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                } catch (RuntimeException e22) {
                    throw e22;
                } catch (RuntimeException e222) {
                    throw e222;
                }
            }
        } catch (Throwable e3) {
            Log.b(z[8], e3);
        }
        this.f.postDelayed(this.d, 40000);
        this.c = new b8(this);
        try {
            this.c.a(1000, 0.0f, this);
        } catch (IllegalArgumentException e4) {
            Log.w(z[10] + e4.toString());
        }
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public void onDestroy() {
        try {
            Log.i(z[5]);
            this.f.removeCallbacks(this.d);
            this.c.a((LocationListener) this);
            try {
                if (this.b == null) {
                    return;
                }
                if (this.b.isHeld()) {
                    this.b.release();
                    this.b = null;
                }
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    private void a(Location location) {
        e = location;
        cn cnVar = new cn();
        try {
            cnVar.b = ((double) Math.round(location.getLatitude() * 1000000.0d)) / 1000000.0d;
            cnVar.e = ((double) Math.round(location.getLongitude() * 1000000.0d)) / 1000000.0d;
            if (location.hasAccuracy()) {
                cnVar.g = (int) location.getAccuracy();
            }
            try {
                if (location.hasSpeed()) {
                    cnVar.i = ((float) ((int) (location.getSpeed() * 100.0f))) / 100.0f;
                }
                try {
                    if (location.hasBearing()) {
                        cnVar.f = (int) location.getBearing();
                    }
                    try {
                        cnVar.d = location.getTime();
                        if (cnVar.d > System.currentTimeMillis()) {
                            cnVar.d = System.currentTimeMillis();
                        }
                        App.a(cnVar);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (RuntimeException e22) {
                throw e22;
            }
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    public void onProviderDisabled(String str) {
    }

    private static boolean a(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        try {
            if (location2.getTime() + 120000 < location.getTime()) {
                return true;
            }
            try {
                if (location2.getAccuracy() > location.getAccuracy()) {
                    return true;
                }
                try {
                    if (TextUtils.equals(location2.getProvider(), location.getProvider())) {
                        if (location2.distanceTo(location) > Math.max(10.0f, location.getAccuracy())) {
                            return true;
                        }
                    }
                    return false;
                } catch (RuntimeException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (RuntimeException e22) {
                throw e22;
            }
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    public void onProviderEnabled(String str) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r10, int r11, int r12) {
        /*
        r9_this = this;
        r0 = 40000; // 0x9c40 float:5.6052E-41 double:1.97626E-319;
        r5 = 2;
        r8 = 1;
        r2 = r9.f;	 Catch:{ RuntimeException -> 0x00ac }
        r3 = r9.d;	 Catch:{ RuntimeException -> 0x00ac }
        r2.removeCallbacks(r3);	 Catch:{ RuntimeException -> 0x00ac }
        if (r10 == 0) goto L_0x002c;
    L_0x000e:
        r2 = r10.getAction();	 Catch:{ RuntimeException -> 0x00ae }
        r3 = z;	 Catch:{ RuntimeException -> 0x00ae }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x00ae }
        r2 = r2.equals(r3);	 Catch:{ RuntimeException -> 0x00ae }
        if (r2 == 0) goto L_0x002c;
    L_0x001d:
        r2 = z;	 Catch:{ RuntimeException -> 0x00ae }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x00ae }
        com.whatsapp.util.Log.i(r2);	 Catch:{ RuntimeException -> 0x00ae }
        r9.stopSelf();	 Catch:{ RuntimeException -> 0x00ae }
        r2 = com.whatsapp.App.az;	 Catch:{ RuntimeException -> 0x00ae }
        if (r2 == 0) goto L_0x00ab;
    L_0x002c:
        if (r10 == 0) goto L_0x0036;
    L_0x002e:
        r2 = z;
        r2 = r2[r5];
        r0 = r10.getLongExtra(r2, r0);
    L_0x0036:
        r2 = r9.f;	 Catch:{ RuntimeException -> 0x00b0 }
        r3 = r9.d;	 Catch:{ RuntimeException -> 0x00b0 }
        r2.postDelayed(r3, r0);	 Catch:{ RuntimeException -> 0x00b0 }
        r2 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00b0 }
        r2.<init>();	 Catch:{ RuntimeException -> 0x00b0 }
        r3 = z;	 Catch:{ RuntimeException -> 0x00b0 }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x00b0 }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x00b0 }
        r0 = r2.append(r0);	 Catch:{ RuntimeException -> 0x00b0 }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x00b0 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x00b0 }
        r0 = e;	 Catch:{ RuntimeException -> 0x00b0 }
        if (r0 == 0) goto L_0x006c;
    L_0x005a:
        r0 = e;	 Catch:{ RuntimeException -> 0x00b0 }
        r0 = r0.getTime();	 Catch:{ RuntimeException -> 0x00b0 }
        r2 = 120000; // 0x1d4c0 float:1.68156E-40 double:5.9288E-319;
        r0 = r0 + r2;
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ RuntimeException -> 0x00b0 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x00ab;
    L_0x006c:
        r0 = r9.c;
        r1 = r0.a(r8);
        r0 = r9.c;
        r0 = r0.a(r5);
        if (r1 != 0) goto L_0x00b2;
    L_0x007a:
        if (r0 == 0) goto L_0x008d;
    L_0x007c:
        r2 = r0.getTime();	 Catch:{ RuntimeException -> 0x00c7 }
        r4 = 7200000; // 0x6ddd00 float:1.0089349E-38 double:3.5572727E-317;
        r2 = r2 + r4;
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ RuntimeException -> 0x00c7 }
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x008d;
    L_0x008c:
        r0 = 0;
    L_0x008d:
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00c9 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x00c9 }
        r2 = z;	 Catch:{ RuntimeException -> 0x00c9 }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x00c9 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x00c9 }
        r1 = r1.append(r0);	 Catch:{ RuntimeException -> 0x00c9 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x00c9 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x00c9 }
        if (r0 == 0) goto L_0x00ab;
    L_0x00a8:
        r9.a(r0);	 Catch:{ RuntimeException -> 0x00c9 }
    L_0x00ab:
        return r8;
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00ae }
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        if (r0 != 0) goto L_0x00b6;
    L_0x00b4:
        r0 = r1;
        goto L_0x007a;
    L_0x00b6:
        r2 = r1.getTime();
        r4 = r0.getTime();
        r6 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r4 = r4 - r6;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x007a;
    L_0x00c5:
        r0 = r1;
        goto L_0x007a;
    L_0x00c7:
        r0 = move-exception;
        throw r0;
    L_0x00c9:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.LocationSharingService.onStartCommand(android.content.Intent, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLocationChanged(android.location.Location r5) {
        /*
        r4_this = this;
        r0 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0054 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x0054 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0054 }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0054 }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0054 }
        r0 = r0.append(r5);	 Catch:{ RuntimeException -> 0x0054 }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x0054 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0054 }
        r0 = e;	 Catch:{ RuntimeException -> 0x0054 }
        r0 = a(r5, r0);	 Catch:{ RuntimeException -> 0x0054 }
        if (r0 == 0) goto L_0x002a;
    L_0x0021:
        r4.a(r5);	 Catch:{ RuntimeException -> 0x0056 }
        r4.a = r5;	 Catch:{ RuntimeException -> 0x0056 }
        r0 = com.whatsapp.App.az;	 Catch:{ RuntimeException -> 0x0056 }
        if (r0 == 0) goto L_0x0053;
    L_0x002a:
        r0 = r5.getAccuracy();	 Catch:{ RuntimeException -> 0x0058 }
        r1 = 1117782016; // 0x42a00000 float:80.0 double:5.522576936E-315;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 >= 0) goto L_0x0036;
    L_0x0034:
        r4.a = r5;	 Catch:{ RuntimeException -> 0x0058 }
    L_0x0036:
        r0 = r4.a;	 Catch:{ RuntimeException -> 0x005a }
        if (r0 == 0) goto L_0x0053;
    L_0x003a:
        r0 = e;	 Catch:{ RuntimeException -> 0x005c }
        r0 = r0.getTime();	 Catch:{ RuntimeException -> 0x005c }
        r2 = 40000; // 0x9c40 float:5.6052E-41 double:1.97626E-319;
        r0 = r0 + r2;
        r2 = r4.a;	 Catch:{ RuntimeException -> 0x005c }
        r2 = r2.getTime();	 Catch:{ RuntimeException -> 0x005c }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x0053;
    L_0x004e:
        r0 = r4.a;	 Catch:{ RuntimeException -> 0x005c }
        r4.a(r0);	 Catch:{ RuntimeException -> 0x005c }
    L_0x0053:
        return;
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.LocationSharingService.onLocationChanged(android.location.Location):void");
    }

    public IBinder onBind(Intent intent) {
        return null;
    }
}
