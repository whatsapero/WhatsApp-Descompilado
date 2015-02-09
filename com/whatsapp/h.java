package com.whatsapp;

import android.os.AsyncTask;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class h extends AsyncTask {
    private static final String[] z;
    final SettingsChat a;

    static {
        String[] strArr = new String[7];
        String str = "HV=c:UT:81ZP\"b#\u0014^:p O\\;r|^A;x!\u001b";
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
                        i3 = 59;
                        break;
                    case ay.f /*1*/:
                        i3 = 51;
                        break;
                    case ay.n /*2*/:
                        i3 = 73;
                        break;
                    case ay.p /*3*/:
                        i3 = 23;
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
                    str = "YR*|&KW+";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "V\\<y'^W";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "V\\<y'^W\u0016e<";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "HV=c:UT:81ZP\"b#\u0014U(~?^Wfz:H@ y4\u0016\\;:>R@$v'X[";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "HV=c:UT:81ZP\"b#\u0014U(~?^Wfy&W_";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "K\\>r!";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private h(SettingsChat settingsChat) {
        this.a = settingsChat;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.lang.Boolean r6) {
        /*
        r5_this = this;
        r1 = 2131624548; // 0x7f0e0264 float:1.8876279E38 double:1.053162459E-314;
        r2 = com.whatsapp.App.az;
        r0 = r5.a;
        r3 = 8;
        r0.removeDialog(r3);
        com.whatsapp.Conversation.C();
        if (r6 != 0) goto L_0x0042;
    L_0x0011:
        com.whatsapp.a54.b();
        r0 = com.whatsapp.a54.j();
        r3 = com.whatsapp.a54.b(r0);
        if (r3 == 0) goto L_0x0033;
    L_0x001e:
        com.whatsapp.App.a(r3, r0);
        r0 = r5.a;
        r3 = 2131624549; // 0x7f0e0265 float:1.887628E38 double:1.0531624595E-314;
        r0.a(r3);
        r0 = z;
        r3 = 5;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        if (r2 == 0) goto L_0x0040;
    L_0x0033:
        r0 = r5.a;
        r0.a(r1);
        r0 = z;
        r3 = 6;
        r0 = r0[r3];
        com.whatsapp.util.Log.w(r0);
    L_0x0040:
        if (r2 == 0) goto L_0x0078;
    L_0x0042:
        r0 = r6.booleanValue();
        if (r0 == 0) goto L_0x004f;
    L_0x0048:
        r0 = r5.a;
        com.whatsapp.SettingsChat.b(r0);
        if (r2 == 0) goto L_0x0078;
    L_0x004f:
        r3 = android.os.Environment.getExternalStorageState();
        r0 = z;
        r4 = 4;
        r0 = r0[r4];
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0063;
    L_0x005e:
        r0 = 2131624555; // 0x7f0e026b float:1.8876293E38 double:1.0531624625E-314;
        if (r2 == 0) goto L_0x0073;
    L_0x0063:
        r0 = z;
        r4 = 3;
        r0 = r0[r4];
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0070;
    L_0x006e:
        if (r2 == 0) goto L_0x0079;
    L_0x0070:
        r0 = 2131624554; // 0x7f0e026a float:1.887629E38 double:1.053162462E-314;
    L_0x0073:
        r1 = r5.a;
        r1.a(r0);
    L_0x0078:
        return;
    L_0x0079:
        r0 = r1;
        goto L_0x0073;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.h.a(java.lang.Boolean):void");
    }

    protected Boolean a(Void[] voidArr) {
        Boolean a;
        Exception e;
        Boolean valueOf = Boolean.valueOf(false);
        WakeLock newWakeLock = ((PowerManager) this.a.getSystemService(z[1])).newWakeLock(1, z[2]);
        try {
            newWakeLock.acquire();
            long currentTimeMillis = System.currentTimeMillis();
            a = App.aJ.a(false, false);
            try {
                currentTimeMillis = 3000 - (System.currentTimeMillis() - currentTimeMillis);
                if (currentTimeMillis > 0) {
                    try {
                        Thread.sleep(currentTimeMillis);
                    } catch (InterruptedException e2) {
                    }
                }
                try {
                    if (newWakeLock.isHeld()) {
                        newWakeLock.release();
                    }
                } catch (InterruptedException e3) {
                    throw e3;
                }
            } catch (Exception e4) {
                e = e4;
                try {
                    Log.e(z[0] + e.toString());
                    if (newWakeLock.isHeld()) {
                        newWakeLock.release();
                    }
                } catch (Throwable th) {
                    try {
                        if (newWakeLock.isHeld()) {
                            newWakeLock.release();
                        }
                    } catch (InterruptedException e32) {
                        throw e32;
                    }
                }
                return a;
            }
        } catch (Exception e5) {
            Exception exception = e5;
            a = valueOf;
            e = exception;
            Log.e(z[0] + e.toString());
            if (newWakeLock.isHeld()) {
                newWakeLock.release();
            }
            return a;
        }
        return a;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    h(SettingsChat settingsChat, sd sdVar) {
        this(settingsChat);
    }

    protected void onPreExecute() {
        this.a.showDialog(8);
    }

    protected void onPostExecute(Object obj) {
        a((Boolean) obj);
    }
}
