package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.NotificationManagerCompat;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import com.actionbarsherlock.R;
import com.google.c5;
import com.google.c8;
import com.google.ft;
import com.whatsapp.util.Log;
import com.whatsapp.util.a0;
import java.util.Random;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class VerifyNumber extends UserFeedbackActivity {
    protected static String k;
    private static final String[] z;
    boolean j;
    private String l;
    boolean m;
    boolean n;
    PhoneStateListener o;
    int p;
    private int q;

    protected void d(int i) {
        Log.i(z[13]);
        long currentTimeMillis = System.currentTimeMillis();
        CharSequence string = getString(R.string.sms_notification_headline_unverified);
        CharSequence string2 = getString(R.string.sms_notification_title_unverified);
        CharSequence string3 = getString(R.string.sms_notification_message_unverified);
        Notification notification = new Notification(R.drawable.notifybar, string, currentTimeMillis);
        notification.defaults = 3;
        notification.flags = 16;
        Context applicationContext = getApplicationContext();
        Intent intent = new Intent(applicationContext, getClass());
        if (i != -1) {
            intent.putExtra(z[14], i);
        }
        intent.addFlags(536870912);
        notification.setLatestEventInfo(applicationContext, string2, string3, PendingIntent.getActivity(applicationContext, 0, intent, 268435456));
        NotificationManagerCompat.from(this).notify(1, notification);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.p = App.a3.getPhoneType();
        Log.i(z[11] + this.p);
    }

    static String d(String str) {
        int i = App.az;
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            stringBuilder.append((char) (str.charAt(i2) ^ 18));
            int i3 = 1;
            while (i3 < 6) {
                stringBuilder.append((char) ((new Random().nextInt(10) + 48) ^ 18));
                i3++;
                if (i != 0) {
                    break;
                }
            }
            i2++;
            if (i != 0) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    protected void c(String str) {
        e(str);
    }

    protected void a() {
        d(-1);
    }

    public VerifyNumber() {
        this.n = false;
        this.m = false;
        this.j = false;
        this.l = null;
        this.q = -1;
        this.o = new c9(this);
    }

    String b(String str, String str2) {
        Log.i(z[4] + App.a3.getNetworkType());
        String networkOperator = App.a3.getNetworkOperator();
        String networkOperatorName = App.a3.getNetworkOperatorName();
        NetworkInfo activeNetworkInfo = App.ah.getActiveNetworkInfo();
        Log.i(z[7] + networkOperatorName + z[5] + networkOperator);
        Log.i(z[6] + getResources().getConfiguration().mcc + " " + getResources().getConfiguration().mnc);
        Log.i(z[8] + App.a3.getSimOperator());
        return (ats.a(str, networkOperator) || ats.b(str, networkOperatorName) || ats.a(str, activeNetworkInfo)) ? str2 : "+" + str + str2;
    }

    static String c() {
        try {
            return App.a3.getLine1Number();
        } catch (Exception e) {
            Log.w(z[12] + e.toString());
            return null;
        }
    }

    static String a(String str, String str2) {
        if (str == null || str2 == null) {
            try {
                Log.e(z[1]);
                return null;
            } catch (Exception e) {
                throw e;
            }
        }
        String str3 = "+" + str + " " + str2;
        c8 a = c8.a();
        try {
            ft c = a.c(str2, ats.c(str));
            return c != null ? a.a(c, c5.INTERNATIONAL) : str3;
        } catch (Throwable e2) {
            Log.b(z[2], e2);
            return str3;
        } catch (Throwable e22) {
            Log.b(z[0], e22);
            return str3;
        }
    }

    static de a(Context context, String str, String str2, String str3, String str4) {
        fz a = fz.a(context, str2);
        a0 a2 = a0.a(App.a3.getNetworkOperator());
        a0 a3 = a0.a(App.a3.getSimOperator());
        return fm.a(str, str + str2, str2, a2, a3, str3, str4, a.toString());
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 109:
                return new Builder(this).setMessage(R.string.register_try_again_later).setPositiveButton(R.string.check_system_status, new vx(this)).setNeutralButton(R.string.cancel, new am4(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    protected void b(String str) {
        k = str;
        App.e((Context) this, str);
    }

    public void e(int i) {
        if (!(this.m || isFinishing())) {
            showDialog(i);
            if (App.az == 0) {
                return;
            }
        }
        this.q = i;
    }

    protected void a(ServiceState serviceState) {
    }

    public void onPause() {
        this.m = true;
        super.onPause();
        App.e((Context) this, k);
    }

    public void f(int i) {
        if (!(this.m || isFinishing())) {
            a(i);
            if (App.az == 0) {
                return;
            }
        }
        this.l = getString(i);
    }

    public void onResume() {
        this.m = false;
        super.onResume();
        k = App.r((Context) this);
        if (this.l != null) {
            f(this.l);
        }
        if (this.q != -1) {
            showDialog(this.q);
        }
        this.l = null;
        this.q = -1;
    }

    static String a(String str) {
        int i = App.az;
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            stringBuilder.append((char) (str.charAt(i2) ^ 18));
            i2 += 6;
            if (i != 0) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    static {
        String[] strArr = new String[15];
        String str = "\b>S\u001e$\u00075T\u001a \u001b)\u000e\u0011-\f6@\u00036\u001b)\f\u001e,\u0017/\f\u0012:\u001d>Q\u0003+\u00115";
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
                        i3 = 126;
                        break;
                    case ay.f /*1*/:
                        i3 = 91;
                        break;
                    case ay.n /*2*/:
                        i3 = 33;
                        break;
                    case ay.p /*3*/:
                        i3 = 119;
                        break;
                    default:
                        i3 = 66;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\b>S\u001e$\u00075T\u001a \u001b)\u000e\u0011-\f6@\u00036\u001b)\f\u0012:\u001d>Q\u0003+\u00115";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\b>S\u001e$\u00075T\u001a \u001b)\u000e\u0019-\n2G\u000em\b>S\u001e$\u0017>E";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\b>S\u001e$\u00075T\u001a \u001b)\u000e\u0019'\n,N\u0005)Q";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Q8N\u0013'C";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\b>S\u001e$\u00075T\u001a \u001b)\u000e\u0014-\u0010=H\u0010b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\b>S\u001e$\u00075T\u001a \u001b)\u000e\u0019'\n,N\u0005)Q5@\u001a'C";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\b>S\u001e$\u00075T\u001a \u001b)\u000e\u0004+\u00134QW";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\r>M\u0011o\r>O\u0013o\u0014:H\u001b \f4J\u0012,";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\r>M\u0011o\r>O\u0013o\u001d?L\u0016";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\b>S\u001e$\u00075T\u001a \u001b)\u000e\u0007*\u00115D(6\u0007+DW";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\b>S\u001e$\u00075T\u001a \u001b)\u000e\u0010'\n+I\u0018,\u001b5O\u0002/\u001c>SX'\f)N\u0005b";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\b>S\u001e$\u00075T\u001a \u001b)\u000e\u0019-\n2G\u000em\u000b5W\u00120\u0017=H\u0012&";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u001d4LY5\u0016:U\u0004#\u000e+\u000f\u0001'\f2G\u000e,\u000b6C\u00120P?H\u0016.\u0011<";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    z = strArr3;
                    k = "";
                default:
                    strArr2[i] = str;
                    str = "\b>S\u001e$\u00075T\u001a \u001b)\u000e\u00070\u001b/U\u000e2\f2O\u0003m\u001d8\f\u00180S+I\u00197\u0013vH\u0004o\u0010.M\u001b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected boolean b() {
        boolean z;
        if (a54.z() != null || a54.p() || ((App.aa != 3 && a54.B()) || !a54.a(getApplication()) || a54.c(getApplication()) == null)) {
            k = z[9];
            if (App.az != 0) {
                z = false;
            } else {
                z = false;
                return f() && z;
            }
        } else {
            z = true;
        }
        if (this.p == 2) {
            k = z[10];
            z = false;
        }
        if (!f()) {
        }
    }

    protected void c(int i) {
        if (this.m || isFinishing()) {
            d(i);
            if (App.az == 0) {
                return;
            }
        }
        showDialog(i);
    }

    public void g(String str) {
        if (!(this.m || isFinishing())) {
            super.f(str);
            if (App.az == 0) {
                return;
            }
        }
        this.l = str;
    }

    protected boolean f() {
        return App.a3.getNetworkType() != 11;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void g() {
        /*
        r8_this = this;
        r7 = 3;
        r0 = z;
        r0 = r0[r7];
        com.whatsapp.util.Log.i(r0);
        r0 = java.lang.System.currentTimeMillis();
        r2 = 2131624918; // 0x7f0e03d6 float:1.887703E38 double:1.053162642E-314;
        r2 = r8.getString(r2);
        r3 = 2131624922; // 0x7f0e03da float:1.8877037E38 double:1.053162644E-314;
        r3 = r8.getString(r3);
        r4 = 2131624920; // 0x7f0e03d8 float:1.8877033E38 double:1.053162643E-314;
        r4 = r8.getString(r4);
        r5 = new android.app.Notification;
        r6 = 2130838997; // 0x7f0205d5 float:1.7282992E38 double:1.052774345E-314;
        r5.<init>(r6, r2, r0);
        r5.defaults = r7;
        r0 = 16;
        r5.flags = r0;
        r1 = r8.getApplicationContext();
        r0 = r8.j;
        if (r0 == 0) goto L_0x0042;
    L_0x0037:
        r0 = new android.content.Intent;
        r2 = com.whatsapp.Main.class;
        r0.<init>(r1, r2);
        r2 = com.whatsapp.App.az;
        if (r2 == 0) goto L_0x004d;
    L_0x0042:
        r0 = new android.content.Intent;
        r2 = com.whatsapp.RegisterName.class;
        r0.<init>(r1, r2);
        r2 = 2;
        com.whatsapp.App.d(r8, r2);
    L_0x004d:
        r2 = 0;
        r6 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = android.app.PendingIntent.getActivity(r1, r2, r0, r6);
        r5.setLatestEventInfo(r1, r3, r4, r0);
        r0 = android.support.v4.app.NotificationManagerCompat.from(r8);
        r1 = 1;
        r0.notify(r1, r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifyNumber.g():void");
    }
}
