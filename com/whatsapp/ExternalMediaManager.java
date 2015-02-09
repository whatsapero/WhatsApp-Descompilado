package com.whatsapp;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.os.IBinder;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ExternalMediaManager extends Service {
    private static final String[] z;

    public class ExternalMediaStateReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            context.startService(intent.setClass(context, ExternalMediaManager.class));
        }
    }

    static {
        String[] strArr = new String[5];
        String str = "\u0004\u001b[0\u0016\u000f\u0002C\n\t\u0004\u0007F4K\u0000\u0015N<\b\u0000\u0001C0";
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
                        i3 = 97;
                        break;
                    case ay.f /*1*/:
                        i3 = 99;
                        break;
                    case ay.n /*2*/:
                        i3 = 47;
                        break;
                    case ay.p /*3*/:
                        i3 = 85;
                        break;
                    default:
                        i3 = 100;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\f\fZ;\u0010\u0004\u0007p'\u000b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0004\u001b[0\u0016\u000f\u0002C\n\t\u0004\u0007F4K\u0013\u0006N1I\u000e\rC,";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0004\u001b[0\u0016\u000f\u0002C\n\t\u0004\u0007F4K\u0014\rN#\u0005\b\u000fN7\b\u0004C";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\f\fZ;\u0010\u0004\u0007";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private synchronized void b() {
        if (App.aF || !App.d) {
            App.aF = false;
            App.d = true;
            Log.i(z[3]);
            App.x((Context) this);
        }
    }

    private synchronized void c() {
        if (App.aF || App.d) {
            App.aF = false;
            App.d = false;
            Log.i(z[0]);
            App.x((Context) this);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r6, int r7, int r8) {
        /*
        r5_this = this;
        r4 = 2;
        r0 = com.whatsapp.App.az;
        r1 = android.os.Environment.getExternalStorageState();
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r2 = r1.equals(r2);
        if (r2 == 0) goto L_0x001a;
    L_0x0012:
        r5.c();
        com.whatsapp.util.f.b();
        if (r0 == 0) goto L_0x002f;
    L_0x001a:
        r2 = z;
        r2 = r2[r4];
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x002c;
    L_0x0024:
        r5.b();
        com.whatsapp.util.f.b();
        if (r0 == 0) goto L_0x002f;
    L_0x002c:
        r5.a();
    L_0x002f:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ExternalMediaManager.onStartCommand(android.content.Intent, int, int):int");
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    private synchronized void a() {
        if (!App.aF) {
            App.aF = true;
            App.d = true;
            Log.i(z[4] + Environment.getExternalStorageState());
        }
    }
}
