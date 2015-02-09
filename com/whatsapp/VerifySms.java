package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.CountDownTimer;
import android.telephony.ServiceState;
import android.telephony.SmsManager;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.bm;
import com.whatsapp.util.g;
import java.util.Random;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class VerifySms extends VerifyNumber {
    private static int B;
    private static int C;
    private static boolean E;
    private static String F;
    private static int K;
    private static BroadcastReceiver M;
    private static short P;
    private static BroadcastReceiver Q;
    private static long R;
    private static String X;
    private static int Y;
    private static String ad;
    private static long ae;
    private static final int af;
    private static CountDownTimer ah;
    private static BroadcastReceiver ai;
    private static String aj;
    private static final String[] bb;
    private EditText A;
    private TextView D;
    private View G;
    private Button H;
    private View I;
    BroadcastReceiver J;
    private String L;
    private boolean N;
    private long O;
    private CountDownTimer S;
    boolean T;
    private long U;
    private CountDownTimer V;
    BroadcastReceiver W;
    ProgressDialog Z;
    private long aa;
    private String ab;
    private String ac;
    private String ag;
    BroadcastReceiver r;
    private TextView s;
    private int t;
    private long u;
    private final r4 v;
    private boolean w;
    private int x;
    private ProgressBar y;
    private boolean z;

    private void m() {
        this.x = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onNewIntent(android.content.Intent r5) {
        /*
        r4_this = this;
        r0 = com.whatsapp.App.az;
        r1 = bb;
        r2 = 40;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        super.onNewIntent(r5);
        r1 = r4.a(r5);
        if (r1 == 0) goto L_0x003e;
    L_0x0014:
        r2 = r4.w;	 Catch:{ ActivityNotFoundException -> 0x003a }
        if (r2 == 0) goto L_0x001d;
    L_0x0018:
        r4.h(r1);	 Catch:{ ActivityNotFoundException -> 0x003c }
        if (r0 == 0) goto L_0x0039;
    L_0x001d:
        r0 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x003c }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x003c }
        r2 = bb;	 Catch:{ ActivityNotFoundException -> 0x003c }
        r3 = 42;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x003c }
        r0 = r0.append(r2);	 Catch:{ ActivityNotFoundException -> 0x003c }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x003c }
        r0 = r0.toString();	 Catch:{ ActivityNotFoundException -> 0x003c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x003c }
        r4.L = r1;	 Catch:{ ActivityNotFoundException -> 0x003c }
    L_0x0039:
        return;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r1 = bb;
        r2 = 41;
        r1 = r1[r2];
        r2 = 0;
        r1 = r5.getIntExtra(r1, r2);
        switch(r1) {
            case 4: goto L_0x006f;
            case 7: goto L_0x0069;
            case 21: goto L_0x0075;
            case 23: goto L_0x007c;
            default: goto L_0x004c;
        };
    L_0x004c:
        r0 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x0067 }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x0067 }
        r2 = bb;	 Catch:{ ActivityNotFoundException -> 0x0067 }
        r3 = 43;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x0067 }
        r0 = r0.append(r2);	 Catch:{ ActivityNotFoundException -> 0x0067 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x0067 }
        r0 = r0.toString();	 Catch:{ ActivityNotFoundException -> 0x0067 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x0067 }
        goto L_0x0039;
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r2 = 7;
        r4.showDialog(r2);	 Catch:{ ActivityNotFoundException -> 0x0084 }
        if (r0 == 0) goto L_0x0039;
    L_0x006f:
        r2 = 4;
        r4.showDialog(r2);	 Catch:{ ActivityNotFoundException -> 0x0086 }
        if (r0 == 0) goto L_0x0039;
    L_0x0075:
        r2 = 21;
        r4.showDialog(r2);	 Catch:{ ActivityNotFoundException -> 0x0088 }
        if (r0 == 0) goto L_0x0039;
    L_0x007c:
        r2 = 23;
        r4.showDialog(r2);	 Catch:{ ActivityNotFoundException -> 0x0067 }
        if (r0 == 0) goto L_0x0039;
    L_0x0083:
        goto L_0x004c;
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0067 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.onNewIntent(android.content.Intent):void");
    }

    private String u() {
        SharedPreferences preferences = getPreferences(0);
        try {
            return (this.ab.equals(preferences.getString(bb[63], null)) && this.ag.equals(preferences.getString(bb[61], null))) ? preferences.getString(bb[62], null) : null;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void n() {
        this.z = true;
        CharSequence a = b7.a(a(this.ab, this.ag));
        CharSequence string = getString(R.string.register_user_is_banned_top);
        CharSequence string2 = getString(R.string.register_user_is_banned_bottom);
        ((TextView) findViewById(R.id.description_2_top)).setText(string);
        ((TextView) findViewById(R.id.verify_sms_phone_number_2)).setText(a);
        ((TextView) findViewById(R.id.description_2_bottom)).setText(string2);
        this.H.setVisibility(8);
        findViewById(R.id.sms_pane_failed_layout).setVisibility(0);
        findViewById(R.id.verify_sms_pane_trying_layout).setVisibility(8);
        findViewById(R.id.verify_sms_voice_layout).setVisibility(0);
        findViewById(R.id.verify_sms_voice_header).setVisibility(8);
        findViewById(R.id.sms_pane_call_layout).setVisibility(8);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            if (App.G == 3 && i == 84) {
                g.a((Activity) this, false);
                return true;
            }
            try {
                return super.onKeyDown(i, keyEvent);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    private void e(long j) {
        long j2;
        if (j == 0) {
            j2 = 0;
        } else {
            j2 = System.currentTimeMillis() - j;
        }
        long j3 = R - j2;
        if (ah != null) {
            j3 = ae;
            ah.cancel();
            ah = null;
        }
        try {
            ah = new p1(this, j3, 1000).start();
            if (j == 0) {
                a(System.currentTimeMillis());
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void E() {
        v();
        this.U = (long) af;
        this.D.setText(getString(R.string.verify_sms_try, new Object[]{Integer.valueOf(2), Integer.valueOf(2)}) + " ");
        q();
    }

    static int a(int i) {
        Y = i;
        return i;
    }

    static long k(VerifySms verifySms) {
        return verifySms.O;
    }

    private void I() {
        Editor edit = getPreferences(0).edit();
        try {
            edit.remove(bb[85]);
            edit.remove(bb[87]);
            edit.remove(bb[84]);
            if (!edit.commit()) {
                Log.w(bb[86]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void a(VerifySms verifySms, boolean z) {
        verifySms.a(z);
    }

    static long p(VerifySms verifySms) {
        return verifySms.u;
    }

    static void a(VerifySms verifySms, long j) {
        verifySms.c(j);
    }

    static void c(VerifySms verifySms, String str) {
        verifySms.d(str);
    }

    public void onEvent(ju juVar) {
        z();
    }

    protected void a(ServiceState serviceState) {
        try {
            int i;
            View findViewById = findViewById(R.id.roaming_warning);
            if (this.n) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static String a(VerifySms verifySms, String str) {
        verifySms.ac = str;
        return str;
    }

    static void b(VerifySms verifySms) {
        verifySms.p();
    }

    static void v(VerifySms verifySms) {
        verifySms.F();
    }

    static String d(VerifySms verifySms, String str) {
        verifySms.ag = str;
        return str;
    }

    static void q(VerifySms verifySms) {
        verifySms.w();
    }

    private void y() {
        ((TextView) findViewById(R.id.verify_sms_phone_number)).setText(a(this.ab, this.ag));
        this.H.setVisibility(8);
        findViewById(R.id.sms_pane_failed_layout).setVisibility(8);
        findViewById(R.id.verify_sms_voice_layout).setVisibility(8);
        findViewById(R.id.verify_sms_pane_trying_layout).setVisibility(0);
    }

    static String A(VerifySms verifySms) {
        return verifySms.ab;
    }

    static int i() {
        int i = B - 1;
        B = i;
        return i;
    }

    private void A() {
        try {
            if (this.z) {
                super.c(bb[88]);
                try {
                    if (App.az == 0) {
                        return;
                    }
                }
            }
            super.c(this.ac);
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static void c(VerifySms verifySms, long j) {
        verifySms.b(j);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, (int) R.string.register_contact_support).setIcon((int) R.drawable.ic_menu_help);
        if (App.aa == 3) {
            menu.add(0, 2, 0, bb[73]);
        }
        return super.onCreateOptionsMenu(menu);
    }

    static String c(VerifySms verifySms) {
        return verifySms.u();
    }

    private long c() {
        return getPreferences(0).getLong(bb[66], 0);
    }

    static long i(VerifySms verifySms) {
        return verifySms.U;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l() {
        /*
        r6_this = this;
        r5 = 2131625056; // 0x7f0e0460 float:1.887731E38 double:1.05316271E-314;
        r4 = 0;
        r3 = 2131428023; // 0x7f0b02b7 float:1.8477679E38 double:1.0530653627E-314;
        r0 = com.whatsapp.App.az;
        r1 = Y;	 Catch:{ ActivityNotFoundException -> 0x00ae }
        switch(r1) {
            case 3: goto L_0x005c;
            case 4: goto L_0x000e;
            case 5: goto L_0x000e;
            case 6: goto L_0x000e;
            case 7: goto L_0x000e;
            case 8: goto L_0x000e;
            case 9: goto L_0x000e;
            case 10: goto L_0x002a;
            case 11: goto L_0x0076;
            case 12: goto L_0x0097;
            case 13: goto L_0x0043;
            default: goto L_0x000e;
        };
    L_0x000e:
        r0 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x00b6 }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x00b6 }
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x00b6 }
        r2 = 93;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x00b6 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x00b6 }
        r1 = Y;	 Catch:{ ActivityNotFoundException -> 0x00b6 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x00b6 }
        r0 = r0.toString();	 Catch:{ ActivityNotFoundException -> 0x00b6 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ActivityNotFoundException -> 0x00b6 }
    L_0x002a:
        r0 = r6.findViewById(r3);
        r0.setVisibility(r4);
        r0 = r6.H;
        r1 = r6.getString(r5);
        r0.setText(r1);
        r0 = bb;
        r1 = 94;
        r0 = r0[r1];
        r6.ac = r0;
    L_0x0042:
        return;
    L_0x0043:
        r1 = 2131428023; // 0x7f0b02b7 float:1.8477679E38 double:1.0530653627E-314;
        r1 = r6.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x00b0 }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x00b0 }
        r1 = r6.H;	 Catch:{ ActivityNotFoundException -> 0x00b0 }
        r2 = 2131625056; // 0x7f0e0460 float:1.887731E38 double:1.05316271E-314;
        r2 = r6.getString(r2);	 Catch:{ ActivityNotFoundException -> 0x00b0 }
        r1.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x00b0 }
        if (r0 == 0) goto L_0x0042;
    L_0x005c:
        r1 = 2131428023; // 0x7f0b02b7 float:1.8477679E38 double:1.0530653627E-314;
        r1 = r6.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x00b2 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x00b2 }
        r1 = r6.H;	 Catch:{ ActivityNotFoundException -> 0x00b2 }
        r2 = 2131625056; // 0x7f0e0460 float:1.887731E38 double:1.05316271E-314;
        r2 = r6.getString(r2);	 Catch:{ ActivityNotFoundException -> 0x00b2 }
        r1.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x00b2 }
        if (r0 == 0) goto L_0x0042;
    L_0x0076:
        r1 = 2131428023; // 0x7f0b02b7 float:1.8477679E38 double:1.0530653627E-314;
        r1 = r6.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x00b4 }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x00b4 }
        r1 = r6.H;	 Catch:{ ActivityNotFoundException -> 0x00b4 }
        r2 = 2131624799; // 0x7f0e035f float:1.8876788E38 double:1.053162583E-314;
        r2 = r6.getString(r2);	 Catch:{ ActivityNotFoundException -> 0x00b4 }
        r1.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x00b4 }
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x00b4 }
        r2 = 95;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x00b4 }
        r6.ac = r1;	 Catch:{ ActivityNotFoundException -> 0x00b4 }
        if (r0 == 0) goto L_0x0042;
    L_0x0097:
        r1 = 2131428023; // 0x7f0b02b7 float:1.8477679E38 double:1.0530653627E-314;
        r1 = r6.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x00b6 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x00b6 }
        r1 = r6.H;	 Catch:{ ActivityNotFoundException -> 0x00b6 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x00b6 }
        if (r0 == 0) goto L_0x0042;
    L_0x00ac:
        goto L_0x000e;
    L_0x00ae:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00b0 }
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00b2 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.l():void");
    }

    static int c(int i) {
        C = i;
        return i;
    }

    static int d(VerifySms verifySms) {
        return verifySms.r();
    }

    private void a(SmsManager smsManager, String str) {
        this.D.setText(getString(R.string.verify_sms_try, new Object[]{Integer.valueOf(1), Integer.valueOf(2)}) + " ");
        Y = 1;
        b();
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(bb[36]), 0);
        try {
            smsManager.sendDataMessage(ad, null, P, str.getBytes(), broadcast, null);
            Log.i(bb[35] + System.currentTimeMillis());
        } catch (Exception e) {
            Log.i(bb[37]);
            b(bb[34]);
            E();
        }
    }

    static int b(int i) {
        K = i;
        return i;
    }

    private int r() {
        double random = Math.random();
        int i = this.x;
        this.x = i + 1;
        return (int) (random * ((Math.pow(2.0d, (double) i) - 1.0d) * 4000.0d));
    }

    protected void onDestroy() {
        try {
            Log.i(bb[44]);
            App.a3.listen(this.o, 0);
            this.T = true;
            k();
            if (ah != null) {
                ah.cancel();
                ah = null;
            }
            try {
                if (this.V != null) {
                    this.V.cancel();
                    this.V = null;
                }
                try {
                    if (this.S != null) {
                        this.S.cancel();
                        this.S = null;
                    }
                    de.greenrobot.event.g.b().d(this);
                    super.onDestroy();
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    static String a(VerifySms verifySms) {
        return verifySms.ag;
    }

    static TextView h(VerifySms verifySms) {
        return verifySms.s;
    }

    private void s() {
        try {
            if (M != null) {
                unregisterReceiver(M);
                M = null;
            }
            try {
                if (ai != null) {
                    unregisterReceiver(ai);
                    ai = null;
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static EditText e(VerifySms verifySms) {
        return verifySms.A;
    }

    static int D() {
        return K;
    }

    private void b() {
        e(0);
    }

    private void h(String str) {
        int i = App.az;
        try {
            try {
                switch (Y) {
                    case ay.f /*1*/:
                        break;
                    case ay.n /*2*/:
                    case aV.r /*5*/:
                        Log.i(bb[45] + Y);
                        d(str);
                        a5w.a(new uc(this), new String[]{str, bb[50]});
                        if (i == 0) {
                            return;
                        }
                        break;
                    case ay.p /*3*/:
                    case a6.h /*10*/:
                    case a6.e /*11*/:
                    case a6.z /*13*/:
                        break;
                    default:
                        return;
                }
                try {
                    if (findViewById(R.id.code_input_blocked).getVisibility() != 0) {
                        Log.i(bb[47] + Y);
                        this.A.setText(str);
                        if (i == 0) {
                            return;
                        }
                    }
                    Log.i(bb[48]);
                    a(str);
                    if (i == 0) {
                        return;
                    }
                } catch (ActivityNotFoundException e) {
                    throw e;
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
                Log.i(bb[46] + Y);
                d(str);
                a5w.a(new uc(this), new String[]{str, bb[49]});
            } catch (ActivityNotFoundException e22) {
                throw e22;
            }
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    static void l(VerifySms verifySms) {
        verifySms.H();
    }

    private void a(long j) {
        Editor edit = getPreferences(0).edit();
        try {
            edit.putLong(bb[64], System.currentTimeMillis());
            if (!edit.commit()) {
                Log.w(bb[65]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        try {
            if (E && menu.findItem(1) == null) {
                menu.add(0, 1, 0, (int) R.string.verify_voice_enter_code).setIcon((int) R.drawable.input_code);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void p() {
        if (Q == null) {
            IntentFilter intentFilter = new IntentFilter(bb[39]);
            intentFilter.setPriority(Integer.MAX_VALUE);
            registerReceiver(this.r, intentFilter);
            Q = this.r;
        }
    }

    static void j(VerifySms verifySms) {
        verifySms.v();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j() {
        /*
        r6_this = this;
        r1 = com.whatsapp.App.az;
        r0 = bb;
        r2 = 82;
        r0 = r0[r2];
        r0 = r6.getSystemService(r0);
        r0 = (android.view.inputmethod.InputMethodManager) r0;
        r2 = 0;
        r3 = 0;
        r0.toggleSoftInput(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x008e }
        r0 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x008e }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x008e }
        r2 = bb;	 Catch:{ ActivityNotFoundException -> 0x008e }
        r3 = 79;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x008e }
        r2 = r0.append(r2);	 Catch:{ ActivityNotFoundException -> 0x008e }
        r0 = com.whatsapp.a54.h();	 Catch:{ ActivityNotFoundException -> 0x008e }
        if (r0 != 0) goto L_0x002e;
    L_0x0028:
        r0 = com.whatsapp.a54.c();	 Catch:{ ActivityNotFoundException -> 0x0090 }
        if (r0 == 0) goto L_0x0092;
    L_0x002e:
        r0 = aj;	 Catch:{ ActivityNotFoundException -> 0x0090 }
    L_0x0030:
        r0 = r2.append(r0);
        r2 = bb;
        r3 = 78;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.toString();
        r2 = android.telephony.SmsManager.getDefault();
        r3 = r6.ab;	 Catch:{ ActivityNotFoundException -> 0x00ea }
        r4 = r6.ag;	 Catch:{ ActivityNotFoundException -> 0x00ea }
        r3 = r6.b(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x00ea }
        ad = r3;	 Catch:{ ActivityNotFoundException -> 0x00ea }
        r3 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x00ea }
        r3.<init>();	 Catch:{ ActivityNotFoundException -> 0x00ea }
        r4 = bb;	 Catch:{ ActivityNotFoundException -> 0x00ea }
        r5 = 81;
        r4 = r4[r5];	 Catch:{ ActivityNotFoundException -> 0x00ea }
        r3 = r3.append(r4);	 Catch:{ ActivityNotFoundException -> 0x00ea }
        r4 = ad;	 Catch:{ ActivityNotFoundException -> 0x00ea }
        r3 = r3.append(r4);	 Catch:{ ActivityNotFoundException -> 0x00ea }
        r3 = r3.toString();	 Catch:{ ActivityNotFoundException -> 0x00ea }
        com.whatsapp.util.Log.i(r3);	 Catch:{ ActivityNotFoundException -> 0x00ea }
        r3 = Y;	 Catch:{ ActivityNotFoundException -> 0x00ea }
        switch(r3) {
            case 0: goto L_0x0095;
            case 5: goto L_0x00d8;
            default: goto L_0x0071;
        };
    L_0x0071:
        r0 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        r2 = 80;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        r1 = Y;	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        r0 = r0.toString();	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ActivityNotFoundException -> 0x00f8 }
    L_0x008d:
        return;
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        throw r0;
    L_0x0092:
        r0 = F;
        goto L_0x0030;
    L_0x0095:
        r4 = 0;
        r6.aa = r4;	 Catch:{ ActivityNotFoundException -> 0x00ec }
        r4 = 0;
        r6.U = r4;	 Catch:{ ActivityNotFoundException -> 0x00ec }
        r3 = r6.b();	 Catch:{ ActivityNotFoundException -> 0x00ec }
        if (r3 == 0) goto L_0x00b3;
    L_0x00a3:
        r3 = X;	 Catch:{ ActivityNotFoundException -> 0x00ee }
        if (r3 == 0) goto L_0x00b3;
    L_0x00a7:
        r3 = af;	 Catch:{ ActivityNotFoundException -> 0x00f0 }
        r3 = r3 * 2;
        r4 = (long) r3;	 Catch:{ ActivityNotFoundException -> 0x00f0 }
        r6.O = r4;	 Catch:{ ActivityNotFoundException -> 0x00f0 }
        r6.a(r2, r0);	 Catch:{ ActivityNotFoundException -> 0x00f0 }
        if (r1 == 0) goto L_0x008d;
    L_0x00b3:
        r0 = r6.f();	 Catch:{ ActivityNotFoundException -> 0x00f2 }
        if (r0 == 0) goto L_0x00ca;
    L_0x00b9:
        r0 = r6.D;	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        r2 = "";
        r0.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        r0 = af;	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        r2 = (long) r0;	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        r6.O = r2;	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        r6.q();	 Catch:{ ActivityNotFoundException -> 0x00f4 }
        if (r1 == 0) goto L_0x008d;
    L_0x00ca:
        r0 = bb;	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r2 = 83;
        r0 = r0[r2];	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        r6.F();	 Catch:{ ActivityNotFoundException -> 0x00f6 }
        if (r1 == 0) goto L_0x008d;
    L_0x00d8:
        r0 = r6.D;	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        r2 = "";
        r0.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        r0 = af;	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        r2 = (long) r0;	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        r6.O = r2;	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        r6.q();	 Catch:{ ActivityNotFoundException -> 0x00f8 }
        if (r1 == 0) goto L_0x008d;
    L_0x00e9:
        goto L_0x0071;
    L_0x00ea:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00ec }
    L_0x00ec:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00ee }
    L_0x00ee:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00f0 }
    L_0x00f0:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00f2 }
    L_0x00f2:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00f4 }
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00f6 }
    L_0x00f6:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00f8 }
    L_0x00f8:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.j():void");
    }

    static r4 r(VerifySms verifySms) {
        return verifySms.v;
    }

    private void v() {
        try {
            if (ah != null) {
                ah.cancel();
                ah = null;
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static long b(VerifySms verifySms, long j) {
        verifySms.aa = j;
        return j;
    }

    static long d(long j) {
        ae = j;
        return j;
    }

    static void t(VerifySms verifySms) {
        verifySms.x();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void F() {
        /*
        r4_this = this;
        r3 = 1;
        r0 = 0;
        Y = r0;
        r4.x();
        r0 = bb;
        r1 = 74;
        r0 = r0[r1];
        r4.ac = r0;
        r0 = r4.v;
        r0.removeMessages(r3);
        r0 = r4.j;
        if (r0 != 0) goto L_0x002f;
    L_0x0018:
        com.whatsapp.App.d(r4, r3);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.RegisterPhone.class;
        r0.<init>(r4, r1);
        r1 = bb;
        r2 = 75;
        r1 = r1[r2];
        r0.putExtra(r1, r3);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x003d;
    L_0x002f:
        r0 = 3;
        com.whatsapp.App.d(r4, r0);
        com.whatsapp.ChangeNumber.a(r4);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.ChangeNumber.class;
        r0.<init>(r4, r1);
    L_0x003d:
        r4.startActivity(r0);
        r4.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.F():void");
    }

    private void a(String str) {
        Editor edit = getPreferences(0).edit();
        try {
            edit.putString(bb[7], str);
            edit.putString(bb[5], this.ab);
            edit.putString(bb[4], this.ag);
            if (!edit.commit()) {
                Log.w(bb[6]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void H() {
        CharSequence a = a(this.ab, this.ag);
        CharSequence string = getString(R.string.verify_voice_description_top);
        CharSequence string2 = getString(R.string.verify_voice_description_bottom, new Object[]{getString(R.string.verify_voice_call_button), Integer.valueOf(K)});
        ((TextView) findViewById(R.id.description_2_top)).setText(string);
        ((TextView) findViewById(R.id.verify_sms_phone_number_2)).setText(a);
        ((TextView) findViewById(R.id.description_2_bottom)).setText(string2);
        this.H.setVisibility(0);
        findViewById(R.id.sms_pane_failed_layout).setVisibility(0);
        findViewById(R.id.verify_sms_voice_header).setVisibility(0);
        findViewById(R.id.verify_sms_pane_trying_layout).setVisibility(8);
        findViewById(R.id.verify_sms_voice_layout).setVisibility(0);
        findViewById(R.id.sms_pane_call_layout).setVisibility(0);
        l();
    }

    static void g(VerifySms verifySms) {
        verifySms.E();
    }

    static int C() {
        return Y;
    }

    private void x() {
        Editor edit = getPreferences(0).edit();
        try {
            edit.putInt(bb[76], Y);
            if (!edit.commit()) {
                Log.w(bb[77]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static long J() {
        return R;
    }

    static String B() {
        return ad;
    }

    static void o(VerifySms verifySms) {
        verifySms.l();
    }

    private void q() {
        Log.i(bb[92]);
        s();
        X = null;
        App.a(App.p, d(X));
        a5w.a(new ws(this), new String[0]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
        r8_this = this;
        r7 = 32;
        r5 = 1;
        r0 = 0;
        r1 = com.whatsapp.App.az;
        r2 = bb;
        r3 = 27;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        super.onCreate(r9);
        r2 = de.greenrobot.event.g.b();
        r2.a(r8);
        r2 = 2130903211; // 0x7f0300ab float:1.7413234E38 double:1.052806071E-314;
        r8.setContentView(r2);
        r2 = r8.getIntent();
        r3 = bb;
        r4 = 21;
        r3 = r3[r4];
        r4 = r2.getScheme();
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0074;
    L_0x0033:
        r3 = com.whatsapp.App.e(r8);
        if (r3 != r5) goto L_0x0050;
    L_0x0039:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.RegisterPhone.class;
        r0.<init>(r8, r1);
        r1 = bb;
        r2 = 31;
        r1 = r1[r2];
        r0.putExtra(r1, r5);
        r8.startActivity(r0);
        r8.finish();
    L_0x004f:
        return;
    L_0x0050:
        r2 = r8.a(r2);	 Catch:{ ActivityNotFoundException -> 0x00a6 }
        r8.L = r2;	 Catch:{ ActivityNotFoundException -> 0x00a6 }
        r2 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x00a6 }
        r2.<init>();	 Catch:{ ActivityNotFoundException -> 0x00a6 }
        r3 = bb;	 Catch:{ ActivityNotFoundException -> 0x00a6 }
        r4 = 30;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x00a6 }
        r2 = r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x00a6 }
        r3 = r8.L;	 Catch:{ ActivityNotFoundException -> 0x00a6 }
        r2 = r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x00a6 }
        r2 = r2.toString();	 Catch:{ ActivityNotFoundException -> 0x00a6 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ ActivityNotFoundException -> 0x00a6 }
        if (r1 == 0) goto L_0x0077;
    L_0x0074:
        r2 = 0;
        r8.L = r2;	 Catch:{ ActivityNotFoundException -> 0x00a6 }
    L_0x0077:
        r2 = com.whatsapp.App.e(r8);
        r3 = 4;
        if (r2 == r3) goto L_0x00a8;
    L_0x007e:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r3 = 33;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r8, r1);
        r8.startActivity(r0);
        r8.finish();
        goto L_0x004f;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r2 = 0;
        r8.z = r2;	 Catch:{ ActivityNotFoundException -> 0x015c }
        r8.o();	 Catch:{ ActivityNotFoundException -> 0x015c }
        r2 = r8.getIntent();	 Catch:{ ActivityNotFoundException -> 0x015c }
        r2 = r2.getExtras();	 Catch:{ ActivityNotFoundException -> 0x015c }
        if (r2 == 0) goto L_0x0120;
    L_0x00b8:
        r2 = r8.getIntent();	 Catch:{ ActivityNotFoundException -> 0x015e }
        r3 = bb;	 Catch:{ ActivityNotFoundException -> 0x015e }
        r4 = 25;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x015e }
        r4 = r8.n;	 Catch:{ ActivityNotFoundException -> 0x015e }
        r2 = r2.getBooleanExtra(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x015e }
        if (r2 != 0) goto L_0x00ce;
    L_0x00ca:
        r2 = r8.n;	 Catch:{ ActivityNotFoundException -> 0x0160 }
        if (r2 == 0) goto L_0x00e2;
    L_0x00ce:
        r2 = bb;	 Catch:{ ActivityNotFoundException -> 0x0160 }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x0160 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ ActivityNotFoundException -> 0x0160 }
        r2 = 2131428009; // 0x7f0b02a9 float:1.847765E38 double:1.053065356E-314;
        r2 = r8.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x0160 }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ ActivityNotFoundException -> 0x0160 }
    L_0x00e2:
        r2 = r8.getIntent();	 Catch:{ ActivityNotFoundException -> 0x0162 }
        r3 = bb;	 Catch:{ ActivityNotFoundException -> 0x0162 }
        r4 = 22;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x0162 }
        r4 = 0;
        r2 = r2.getBooleanExtra(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x0162 }
        if (r2 == 0) goto L_0x00f6;
    L_0x00f3:
        r2 = 1;
        r8.j = r2;	 Catch:{ ActivityNotFoundException -> 0x0162 }
    L_0x00f6:
        r2 = r8.getIntent();	 Catch:{ ActivityNotFoundException -> 0x0164 }
        r3 = bb;	 Catch:{ ActivityNotFoundException -> 0x0164 }
        r4 = 29;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x0164 }
        r4 = 0;
        r2 = r2.getBooleanExtra(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x0164 }
        if (r2 == 0) goto L_0x0120;
    L_0x0107:
        r2 = bb;	 Catch:{ ActivityNotFoundException -> 0x0164 }
        r3 = 26;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x0164 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ ActivityNotFoundException -> 0x0164 }
        r2 = 5;
        Y = r2;	 Catch:{ ActivityNotFoundException -> 0x0164 }
        r8.x();	 Catch:{ ActivityNotFoundException -> 0x0164 }
        r2 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x0164 }
        r3 = com.whatsapp.VerifySms.class;
        r2.<init>(r8, r3);	 Catch:{ ActivityNotFoundException -> 0x0164 }
        r8.setIntent(r2);	 Catch:{ ActivityNotFoundException -> 0x0164 }
    L_0x0120:
        r2 = bb;
        r3 = 28;
        r2 = r2[r3];
        r2 = r8.getSharedPreferences(r2, r0);
        r3 = bb;	 Catch:{ ActivityNotFoundException -> 0x0166 }
        r4 = 19;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x0166 }
        r4 = 0;
        r3 = r2.getString(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x0166 }
        r8.ab = r3;	 Catch:{ ActivityNotFoundException -> 0x0166 }
        r3 = bb;	 Catch:{ ActivityNotFoundException -> 0x0166 }
        r4 = 24;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x0166 }
        r4 = 0;
        r2 = r2.getString(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x0166 }
        r8.ag = r2;	 Catch:{ ActivityNotFoundException -> 0x0166 }
        r2 = r8.ab;	 Catch:{ ActivityNotFoundException -> 0x0166 }
        if (r2 == 0) goto L_0x014c;
    L_0x0148:
        r2 = r8.ag;	 Catch:{ ActivityNotFoundException -> 0x015a }
        if (r2 != 0) goto L_0x0168;
    L_0x014c:
        r0 = bb;	 Catch:{ ActivityNotFoundException -> 0x015a }
        r1 = 23;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x015a }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x015a }
        r8.F();	 Catch:{ ActivityNotFoundException -> 0x015a }
        goto L_0x004f;
    L_0x015a:
        r0 = move-exception;
        throw r0;
    L_0x015c:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x015e }
    L_0x015e:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0160 }
    L_0x0160:
        r0 = move-exception;
        throw r0;
    L_0x0162:
        r0 = move-exception;
        throw r0;
    L_0x0164:
        r0 = move-exception;
        throw r0;
    L_0x0166:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x015a }
    L_0x0168:
        r2 = r8.b();	 Catch:{ ActivityNotFoundException -> 0x02a1 }
        if (r2 == 0) goto L_0x01c5;
    L_0x016e:
        r2 = F;	 Catch:{ ActivityNotFoundException -> 0x02a1 }
        r2 = r2.length();	 Catch:{ ActivityNotFoundException -> 0x02a1 }
        if (r2 != 0) goto L_0x01c5;
    L_0x0176:
        r2 = bb;
        r3 = 18;
        r2 = r2[r3];
        r3 = r2.length();
        r4 = new java.util.Random;
        r4.<init>();
    L_0x0185:
        if (r0 >= r7) goto L_0x01c5;
    L_0x0187:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = F;
        r5 = r5.append(r6);
        r6 = r4.nextInt(r3);
        r6 = r2.charAt(r6);
        r5 = r5.append(r6);
        r5 = r5.toString();
        F = r5;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = aj;
        r5 = r5.append(r6);
        r6 = r4.nextInt(r3);
        r6 = r2.charAt(r6);
        r5 = r5.append(r6);
        r5 = r5.toString();
        aj = r5;
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0185;
    L_0x01c5:
        r0 = com.whatsapp.App.a3;
        r1 = r8.o;
        r2 = 1535; // 0x5ff float:2.151E-42 double:7.584E-321;
        r0.listen(r1, r2);
        r0 = 2131427464; // 0x7f0b0088 float:1.8476545E38 double:1.0530650866E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.ProgressBar) r0;
        r8.y = r0;
        r0 = 2131428012; // 0x7f0b02ac float:1.8477656E38 double:1.0530653573E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r8.D = r0;
        r0 = 2131428013; // 0x7f0b02ad float:1.8477658E38 double:1.053065358E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r8.s = r0;
        r0 = 2131428025; // 0x7f0b02b9 float:1.8477683E38 double:1.0530653637E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.EditText) r0;
        r8.A = r0;
        r0 = r8.A;
        r1 = new com.whatsapp.asz;
        r1.<init>(r8);
        r0.addTextChangedListener(r1);
        r0 = r8.A;
        r1 = "";
        r0.setText(r1);
        r0 = 2131427973; // 0x7f0b0285 float:1.8477577E38 double:1.053065338E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r8.H = r0;
        r0 = r8.H;
        r1 = new com.whatsapp.tg;
        r1.<init>(r8);
        r0.setOnClickListener(r1);
        r0 = 2131428011; // 0x7f0b02ab float:1.8477654E38 double:1.053065357E-314;
        r0 = r8.findViewById(r0);
        r8.G = r0;
        r0 = 2131428021; // 0x7f0b02b5 float:1.8477675E38 double:1.053065362E-314;
        r0 = r8.findViewById(r0);
        r8.I = r0;
        r0 = new com.whatsapp.jb;
        r0.<init>(r8);
        r1 = r8.G;
        r1.setOnClickListener(r0);
        r1 = r8.I;
        r1.setOnClickListener(r0);
        r0 = 2131428028; // 0x7f0b02bc float:1.8477689E38 double:1.053065365E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = new com.whatsapp.util.bd;
        r2 = r8.getResources();
        r3 = 2130839066; // 0x7f02061a float:1.7283132E38 double:1.0527743793E-314;
        r2 = r2.getDrawable(r3);
        r1.<init>(r2);
        r0.setImageDrawable(r1);
        r8.y();
        r8.h();
        r8.z();
        r0 = r8.u();
        if (r0 == 0) goto L_0x004f;
    L_0x026c:
        r1 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x029f }
        r1.<init>();	 Catch:{ ActivityNotFoundException -> 0x029f }
        r2 = bb;	 Catch:{ ActivityNotFoundException -> 0x029f }
        r3 = 20;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x029f }
        r1 = r1.append(r2);	 Catch:{ ActivityNotFoundException -> 0x029f }
        r1 = r1.append(r0);	 Catch:{ ActivityNotFoundException -> 0x029f }
        r1 = r1.toString();	 Catch:{ ActivityNotFoundException -> 0x029f }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ActivityNotFoundException -> 0x029f }
        r1 = new com.whatsapp.uc;	 Catch:{ ActivityNotFoundException -> 0x029f }
        r1.<init>(r8);	 Catch:{ ActivityNotFoundException -> 0x029f }
        r2 = 2;
        r2 = new java.lang.String[r2];	 Catch:{ ActivityNotFoundException -> 0x029f }
        r3 = 0;
        r2[r3] = r0;	 Catch:{ ActivityNotFoundException -> 0x029f }
        r0 = 1;
        r3 = bb;	 Catch:{ ActivityNotFoundException -> 0x029f }
        r4 = 32;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x029f }
        r2[r0] = r3;	 Catch:{ ActivityNotFoundException -> 0x029f }
        com.whatsapp.a5w.a(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x029f }
        goto L_0x004f;
    L_0x029f:
        r0 = move-exception;
        throw r0;
    L_0x02a1:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.onCreate(android.os.Bundle):void");
    }

    private void h() {
        if (b()) {
            registerReceiver(this.J, new IntentFilter(bb[2]));
            M = this.J;
            IntentFilter intentFilter = new IntentFilter(bb[1]);
            intentFilter.addDataScheme(bb[3]);
            intentFilter.addDataAuthority("*", Short.toString(P));
            registerReceiver(this.W, intentFilter);
            ai = this.W;
        }
    }

    static void y(VerifySms verifySms) {
        verifySms.I();
    }

    private void f() {
        try {
            startActivity(new Intent(bb[69], Uri.parse(new StringBuilder(bb[68]).append('?').append(bb[70]).append(bb[67]).append('&').append(bb[71]).append(azl.b()).append('&').append(bb[72]).append(azl.a()).toString())));
        } catch (ActivityNotFoundException e) {
            App.b((Context) this, (int) R.string.activity_not_found, 0);
        }
    }

    private void z() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService(bb[56])).getActiveNetworkInfo();
        try {
            int i;
            Log.i(bb[55] + activeNetworkInfo);
            App.C();
            if (activeNetworkInfo == null) {
                i = -1;
            } else {
                i = activeNetworkInfo.getType();
            }
            try {
                if (i != this.t) {
                    try {
                        Log.i(bb[60] + this.t + bb[58] + i);
                        this.t = i;
                        if (this.t != -1 && this.v.hasMessages(1)) {
                            Log.i(bb[59]);
                            this.v.removeMessages(1);
                            m();
                            String u = u();
                            try {
                                if (u != null) {
                                    this.v.sendMessage(this.v.obtainMessage(1, u));
                                    if (App.az == 0) {
                                        return;
                                    }
                                }
                                Log.e(bb[57]);
                            } catch (ActivityNotFoundException e) {
                                throw e;
                            }
                        }
                    } catch (ActivityNotFoundException e2) {
                        throw e2;
                    }
                }
            } catch (ActivityNotFoundException e22) {
                throw e22;
            }
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    protected Dialog onCreateDialog(int i) {
        Dialog progressDialog;
        switch (i) {
            case aj.i /*4*/:
                return new Builder(this).setTitle(R.string.alert).setMessage(R.string.register_sms_mexico).setNeutralButton(R.string.ok, new ld(this)).create();
            case a8.s /*7*/:
                try {
                    return new Builder(this).setTitle(R.string.alert).setMessage(R.string.register_sms_radio_off).setNeutralButton(R.string.ok, new eu(this)).create();
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            case a6.D /*9*/:
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.register_connecting));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                this.Z = progressDialog;
                return progressDialog;
            case vk.SherlockTheme_selectableItemBackground /*21*/:
                return new Builder(this).setMessage(getString(R.string.register_check_connectivity, new Object[]{getString(R.string.connectivity_self_help_instructions)})).setNeutralButton(R.string.ok, new ug(this)).create();
            case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                Y = 0;
                x();
                App.d((Context) this, 1);
                return a_3.e(this);
            case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.register_voice_verifying));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                this.Z = progressDialog;
                return progressDialog;
            case vk.SherlockTheme_textAppearanceSmall /*25*/:
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.register_voice_request_message));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                this.Z = progressDialog;
                return progressDialog;
            case vk.SherlockTheme_textColorPrimary /*26*/:
            case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
            case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                return new Builder(this).setMessage(R.string.register_unrecoverable_error).setPositiveButton(R.string.register_contact_support, new q2(this, i)).setNeutralButton(R.string.cancel, new ru(this, i)).create();
            case vk.SherlockTheme_spinnerItemStyle /*29*/:
            case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                return new Builder(this).setMessage(getString(R.string.register_server_voice_too_many_tries)).setPositiveButton(R.string.register_contact_support, new at0(this, i)).setNeutralButton(R.string.cancel, new k(this, i)).create();
            case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                return new Builder(this).setMessage(getString(R.string.register_voice_input_error_maximum)).setPositiveButton(R.string.register_contact_support, new ks(this, i)).setNeutralButton(R.string.cancel, new a_a(this, i)).create();
            case vk.SherlockTheme_searchDropdownBackground /*32*/:
                View editText = new EditText(this);
                InputFilter[] inputFilterArr = new InputFilter[]{new LengthFilter(K)};
                editText.setInputType(2);
                editText.setFilters(inputFilterArr);
                editText.setGravity(17);
                return new Builder(this).setTitle(R.string.register_voice_input_title).setMessage(getString(R.string.register_voice_input_message, new Object[]{Integer.valueOf(K)})).setView(editText).setPositiveButton(R.string.ok, new am0(this, editText)).setNegativeButton(R.string.cancel, new _b(this)).create();
            case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                return new Builder(this).setMessage(getString(R.string.register_voice_input_error_length_error, new Object[]{Integer.valueOf(K)})).setNeutralButton(R.string.ok, new wy(this)).create();
            case vk.SherlockTheme_searchViewGoIcon /*34*/:
                return new Builder(this).setMessage(R.string.register_verify_again).setNeutralButton(R.string.ok, new a5z(this)).create();
            case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                return new Builder(this).setMessage(getString(R.string.register_voice_request_error_maximum_with_time, new Object[]{bm.g(this, this.u)})).setPositiveButton(R.string.register_learn_more, new akm(this, i)).setNeutralButton(R.string.cancel, new av_(this, i)).create();
            case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                return new Builder(this).setMessage(getString(R.string.register_voice_input_error_maximum_with_time, new Object[]{bm.g(this, this.u)})).setPositiveButton(R.string.register_learn_more, new lx(this, i)).setNeutralButton(R.string.cancel, new y(this, i)).create();
            case 500:
                progressDialog = super.onCreateDialog(i);
                if (progressDialog == null) {
                    return progressDialog;
                }
                try {
                    if (!this.N) {
                        return progressDialog;
                    }
                    progressDialog.setCancelable(false);
                    progressDialog.setOnDismissListener(new asu(this));
                    return progressDialog;
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
            default:
                return super.onCreateDialog(i);
        }
    }

    private void w() {
        try {
            if (Q != null) {
                unregisterReceiver(Q);
                Q = null;
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void s(VerifySms verifySms) {
        verifySms.b();
    }

    public void onPause() {
        super.onPause();
        Log.i(bb[91] + Y);
        Editor edit = getPreferences(0).edit();
        try {
            edit.putInt(bb[89], Y);
            if (!edit.commit()) {
                Log.w(bb[90]);
            }
            App.a(App.p, d(X));
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public VerifySms() {
        this.ac = bb[16];
        this.z = false;
        this.u = 0;
        this.V = null;
        this.T = false;
        this.v = new r4(this, null);
        this.J = new BroadcastReceiver() {
            private static final String[] z;
            final VerifySms a;

            static {
                String[] strArr = new String[15];
                String str = "0\f9\u0018\\?\u001a&\u0002\u00155\f%\u0005\u00174\f(\u0014S0\f9^S(\u001d.\u001fN";
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
                                i3 = 70;
                                break;
                            case ay.f /*1*/:
                                i3 = 105;
                                break;
                            case ay.n /*2*/:
                                i3 = 75;
                                break;
                            case ay.p /*3*/:
                                i3 = 113;
                                break;
                            default:
                                i3 = 58;
                                break;
                        }
                        cArr[i2] = (char) (i3 ^ c);
                    }
                    str = new String(cArr).intern();
                    switch (obj) {
                        case PBE.MD5 /*0*/:
                            strArr2[i] = str;
                            str = "0\f9\u0018\\?\u001a&\u0002\u0015+\f3\u0018Y)";
                            i = 2;
                            strArr2 = strArr3;
                            obj = 1;
                            break;
                        case ay.f /*1*/:
                            strArr2[i] = str;
                            str = "0\f9\u0018\\?\u001a&\u0002\u00155\f%\u0005\u00174\f(\u0014S0\f9^^#\u001a?\u0003U?\f/";
                            i = 3;
                            strArr2 = strArr3;
                            obj = 2;
                            break;
                        case ay.n /*2*/:
                            strArr2[i] = str;
                            str = "#\u001b9\u001eH\u0005\u0006/\u0014";
                            i = 4;
                            strArr2 = strArr3;
                            obj = 3;
                            break;
                        case ay.p /*3*/:
                            strArr2[i] = str;
                            i = 5;
                            strArr2 = strArr3;
                            str = "m\\y";
                            obj = 4;
                            break;
                        case aj.i /*4*/:
                            strArr2[i] = str;
                            i = 6;
                            str = "m\\y@";
                            obj = 5;
                            strArr2 = strArr3;
                            break;
                        case aV.r /*5*/:
                            strArr2[i] = str;
                            i = 7;
                            str = "0\f9\u0018\\?\u001a&\u0002\u00153\u00078\u0014T2";
                            obj = 6;
                            strArr2 = strArr3;
                            break;
                        case aV.i /*6*/:
                            strArr2[i] = str;
                            i = 8;
                            str = "0\f9\u0018\\?\u001a&\u0002\u0015)\u001c?\\U D8\u0014H0\u0000(\u0014";
                            obj = 7;
                            strArr2 = strArr3;
                            break;
                        case a8.s /*7*/:
                            strArr2[i] = str;
                            i = 9;
                            str = "0\f9\u0018\\?\u001a&\u0002\u00154\b/\u0018Uk\u0006-\u0017";
                            obj = 8;
                            strArr2 = strArr3;
                            break;
                        case a8.n /*8*/:
                            strArr2[i] = str;
                            i = 10;
                            str = "5\f'\u0017\u00175\f%\u0015\u00175\f%\u0015\u0017 \b\"\u001dO4\f";
                            obj = 9;
                            strArr2 = strArr3;
                            break;
                        case a6.D /*9*/:
                            strArr2[i] = str;
                            i = 11;
                            str = "0\f9\u0018\\?\u001a&\u0002\u00155\f%\u0005\u00174\f(\u0014S0\f9^_4\u001b$\u0003\u001a";
                            obj = 10;
                            strArr2 = strArr3;
                            break;
                        case a6.h /*10*/:
                            strArr2[i] = str;
                            i = 12;
                            str = "5\f'\u0017\u00175\f%\u0015\u0017)\u001c?\\U D8\u0014H0\u0000(\u0014";
                            obj = 11;
                            strArr2 = strArr3;
                            break;
                        case a6.e /*11*/:
                            strArr2[i] = str;
                            i = 13;
                            str = "0\f9\u0018\\?\u001a&\u0002\u0015)\u001c?\\U D(\u0003_\"\u0000?\u0002";
                            obj = 12;
                            strArr2 = strArr3;
                            break;
                        case a6.s /*12*/:
                            strArr2[i] = str;
                            i = 14;
                            str = "5\f'\u0017\u00175\f%\u0015\u0017)\u001c?\\U D(\u0003_\"\u0000?\u0002";
                            obj = 13;
                            strArr2 = strArr3;
                            break;
                        case a6.z /*13*/:
                            strArr2[i] = str;
                            z = strArr3;
                        default:
                            strArr2[i] = str;
                            str = "0\f9\u0018\\?\u001a&\u0002\u00155\f%\u0005\u00174\f(\u0014S0\f9^H#\u001a>\u001dNf";
                            i = 1;
                            strArr2 = strArr3;
                            obj = null;
                            break;
                    }
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onReceive(android.content.Context r10, android.content.Intent r11) {
                /*
                r9_this = this;
                r8 = 6;
                r7 = 4;
                r5 = 0;
                r6 = 7;
                r0 = com.whatsapp.App.az;
                r1 = z;
                r1 = r1[r5];
                com.whatsapp.util.Log.i(r1);
                r1 = r9.a;
                r1 = r1.T;
                if (r1 != 0) goto L_0x0079;
            L_0x0013:
                r1 = r9.getResultCode();
                r2 = new java.lang.StringBuilder;
                r2.<init>();
                r3 = z;
                r4 = 1;
                r3 = r3[r4];
                r2 = r2.append(r3);
                r2 = r2.append(r1);
                r2 = r2.toString();
                com.whatsapp.util.Log.i(r2);
                r2 = -1;
                if (r1 == r2) goto L_0x0077;
            L_0x0033:
                r2 = z;
                r2 = r2[r7];
                r2 = r11.getIntExtra(r2, r5);
                r3 = new java.lang.StringBuilder;
                r3.<init>();
                r4 = z;
                r5 = 11;
                r4 = r4[r5];
                r3 = r3.append(r4);
                r3 = r3.append(r2);
                r3 = r3.toString();
                com.whatsapp.util.Log.i(r3);
                r3 = r9.a;
                com.whatsapp.VerifySms.j(r3);
                switch(r1) {
                    case 2: goto L_0x009d;
                    case 3: goto L_0x005d;
                    case 4: goto L_0x0082;
                    default: goto L_0x005d;
                };
            L_0x005d:
                switch(r2) {
                    case 16: goto L_0x00b6;
                    case 98: goto L_0x00d1;
                    default: goto L_0x0060;
                };
            L_0x0060:
                r1 = z;
                r1 = r1[r6];
                com.whatsapp.util.Log.w(r1);
                r1 = r9.a;
                r2 = z;
                r3 = 10;
                r2 = r2[r3];
                r1.b(r2);
                r1 = r9.a;
                com.whatsapp.VerifySms.g(r1);
            L_0x0077:
                if (r0 == 0) goto L_0x0081;
            L_0x0079:
                r0 = z;
                r1 = 3;
                r0 = r0[r1];
                com.whatsapp.util.Log.i(r0);
            L_0x0081:
                return;
            L_0x0082:
                r1 = z;
                r3 = 8;
                r1 = r1[r3];
                com.whatsapp.util.Log.i(r1);
                r1 = r9.a;
                r3 = z;
                r4 = 12;
                r3 = r3[r4];
                r1.b(r3);
                r1 = r9.a;
                com.whatsapp.VerifySms.g(r1);
                if (r0 == 0) goto L_0x0077;
            L_0x009d:
                r1 = z;
                r3 = 9;
                r1 = r1[r3];
                com.whatsapp.util.Log.i(r1);
                com.whatsapp.VerifySms.a(r6);
                r1 = r9.a;
                com.whatsapp.VerifySms.t(r1);
                r1 = r9.a;
                r1.c(r6);
                if (r0 == 0) goto L_0x0077;
            L_0x00b5:
                goto L_0x005d;
            L_0x00b6:
                r1 = z;
                r2 = 13;
                r1 = r1[r2];
                com.whatsapp.util.Log.i(r1);
                r1 = r9.a;
                r2 = z;
                r3 = 14;
                r2 = r2[r3];
                r1.b(r2);
                r1 = r9.a;
                com.whatsapp.VerifySms.g(r1);
                if (r0 == 0) goto L_0x0077;
            L_0x00d1:
                r1 = com.whatsapp.VerifySms.B();
                r2 = z;
                r3 = 5;
                r2 = r2[r3];
                r1 = r1.startsWith(r2);
                if (r1 == 0) goto L_0x0060;
            L_0x00e0:
                r1 = com.whatsapp.VerifySms.B();
                r2 = z;
                r2 = r2[r8];
                r1 = r1.startsWith(r2);
                if (r1 != 0) goto L_0x0060;
            L_0x00ee:
                r1 = z;
                r2 = 2;
                r1 = r1[r2];
                com.whatsapp.util.Log.i(r1);
                com.whatsapp.VerifySms.a(r8);
                r1 = r9.a;
                com.whatsapp.VerifySms.t(r1);
                r1 = r9.a;
                r1.c(r7);
                if (r0 == 0) goto L_0x0077;
            L_0x0105:
                goto L_0x0060;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.AnonymousClass_1.onReceive(android.content.Context, android.content.Intent):void");
            }

            {
                this.a = r1;
            }
        };
        this.r = new BroadcastReceiver() {
            private static final String[] z;
            private boolean a;
            final VerifySms b;

            static {
                String[] strArr = new String[25];
                String str = "5\u0003\u000e-";
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
                                i3 = 69;
                                break;
                            case ay.f /*1*/:
                                i3 = 103;
                                break;
                            case ay.n /*2*/:
                                i3 = 123;
                                break;
                            case ay.p /*3*/:
                                i3 = 94;
                                break;
                            default:
                                i3 = 27;
                                break;
                        }
                        cArr[i2] = (char) (i3 ^ c);
                    }
                    str = new String(cArr).intern();
                    switch (obj) {
                        case PBE.MD5 /*0*/:
                            strArr2[i] = str;
                            str = "3\u0002\t7}<\u0014\u0016-47\u0002\u0018;r3\u0002\u001fsi \u0004\u001e7m \u0015T.\u007f0\u0014V0n)\u000b";
                            i = 2;
                            strArr2 = strArr3;
                            obj = 1;
                            break;
                        case ay.f /*1*/:
                            strArr2[i] = str;
                            str = "3\u0002\t7}<\u0014\u0016-4!\u000e\b.w$\u001e4,r\"\u000e\u0015?o,\t\u001c\u001f\u007f!\u0015\u001e-he";
                            i = 3;
                            strArr2 = strArr3;
                            obj = 2;
                            break;
                        case ay.n /*2*/:
                            strArr2[i] = str;
                            str = "3\u0002\t7}<\u0014\u0016-47\u0002\u0018;r3\u0002\u001fsi \u0004\u001e7m \u0015T3~6\u0014\u001a9~h\t\u000e2w";
                            i = 4;
                            strArr2 = strArr3;
                            obj = 3;
                            break;
                        case ay.p /*3*/:
                            strArr2[i] = str;
                            i = 5;
                            strArr2 = strArr3;
                            str = "3\u0002\t7}<\u0014\u0016-47\u0002\u0018;r3\u0002\u001fsi \u0004\u001e7m \u0015T?w7\u0002\u001a:be\u0015\u001e=~,\u0011\u001e:";
                            obj = 4;
                            break;
                        case aj.i /*4*/:
                            strArr2[i] = str;
                            i = 6;
                            str = "3\u0002\t7}<\u0014\u0016-47\u0002\u0018;r3\u0002\u001fsi \u0004\u001e7m \u0015T<n+\u0003\u0017;6+\u0012\u00172";
                            obj = 5;
                            strArr2 = strArr3;
                            break;
                        case aV.r /*5*/:
                            strArr2[i] = str;
                            i = 7;
                            str = "3\u0002\t7}<\u0014\u0016-4\"\u0002\u000f\u000eh \u0012\u001f1H0\u0005\u0011;x1G";
                            obj = 6;
                            strArr2 = strArr3;
                            break;
                        case aV.i /*6*/:
                            strArr2[i] = str;
                            i = 8;
                            str = "3\u0002\t7}<\u0014\u0016-4\"\u0002\u000f\u0013~6\u0014\u001a9~\u0007\b\u001f';";
                            obj = 7;
                            strArr2 = strArr3;
                            break;
                        case a8.s /*7*/:
                            strArr2[i] = str;
                            i = 9;
                            str = "3\u0002\t7}<\u0014\u0016-47\u0002\u0018;r3\u0002\u001fsi \u0004\u001e7m \u0015T.\u007f0\u0014V2~+\u0000\u000f64";
                            obj = 8;
                            strArr2 = strArr3;
                            break;
                        case a8.n /*8*/:
                            strArr2[i] = str;
                            i = 10;
                            str = "3\u0002\t7}<\u0014\u0016-47\u0002\u0018;r3\u0002\u001fsi \u0004\u001e7m \u0015T*~=\u0013T7u1\u0002\u0015*";
                            obj = 9;
                            strArr2 = strArr3;
                            break;
                        case a6.D /*9*/:
                            strArr2[i] = str;
                            i = 11;
                            str = "3\u0002\t7}<\u0014\u0016-4 \n\u001a7w\u0003\u0015\u00143;";
                            obj = 10;
                            strArr2 = strArr3;
                            break;
                        case a6.h /*10*/:
                            strArr2[i] = str;
                            i = 12;
                            str = "3\u0002\t7}<\u0014\u0016-41\u0002\u0003*4*\u0012\u000fst#J\u0016;v*\u0015\u0002~";
                            obj = 11;
                            strArr2 = strArr3;
                            break;
                        case a6.e /*11*/:
                            strArr2[i] = str;
                            i = 13;
                            str = "3\u0002\t7}<\u0014\u0016-47\u0002\u0018;r3\u0002\u001fsi \u0004\u001e7m \u0015T:~6\u0013\t1b \u0003";
                            obj = 12;
                            strArr2 = strArr3;
                            break;
                        case a6.s /*12*/:
                            strArr2[i] = str;
                            i = 14;
                            str = "6\u0002\t(~7J\b;u!J\u00167h(\u0006\u000f=sh\u0002\u0016.o<";
                            obj = 13;
                            strArr2 = strArr3;
                            break;
                        case a6.z /*13*/:
                            strArr2[i] = str;
                            i = 15;
                            str = "3\u0002\t7}<\u0014\u0016-4\"\u0002\u000f\r~7\u0011\u0012=~\u0006\u0002\u0015*~7&\u001f:i \u0014\b~";
                            obj = 14;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                            strArr2[i] = str;
                            i = 16;
                            str = "3\u0002\t7}<\u0014\u0016-41\u0002\u0003*67\u0002\u0018;r3\u0002\tqu*\u0013$-v68\r;i,\u0001\u0012=z1\u000e\u00140";
                            obj = 15;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_actionModeBackground /*15*/:
                            strArr2[i] = str;
                            i = 17;
                            str = "3\u0002\t7}<\u0014\u0016-41\u0002\u0003*67\u0002\u0018;r3\u0002\tq~7\u0015\u0014,;";
                            obj = 16;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                            strArr2[i] = str;
                            i = 18;
                            str = "$\u0012\u000f1";
                            obj = 17;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                            strArr2[i] = str;
                            i = 19;
                            str = "3\u0002\t7}<\u0014\u0016-41\u0002\u0003*67\u0002\u0018;r3\u0002\tq";
                            obj = 18;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                            strArr2[i] = str;
                            i = 20;
                            str = "3\u0002\t7}<\u0014\u0016-";
                            obj = 19;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                            strArr2[i] = str;
                            i = 21;
                            str = "\u0012\u000f\u001a*h\u0004\u0017\u000b~x*\u0003\u001e~";
                            obj = 20;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_buttonStyleSmall /*20*/:
                            strArr2[i] = str;
                            i = 22;
                            str = "3\u0002\t7}<\u0014\u0016-41\u0002\u0003*67\u0002\u0018;r3\u0002\tqu*J\u00181\u007f ";
                            obj = 21;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_selectableItemBackground /*21*/:
                            strArr2[i] = str;
                            i = 23;
                            str = "3\u0002\t7}<\u0014\u0016-4 \n\u001a7w\u0007\b\u001f';";
                            obj = 22;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_windowContentOverlay /*22*/:
                            strArr2[i] = str;
                            i = 24;
                            str = "3\u0002\t7}<\u0014\u0016-4\"\u0002\u000f\u0011i,\u0000\u00120z1\u000e\u00159Z!\u0003\t;h6G";
                            obj = 23;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                            strArr2[i] = str;
                            z = strArr3;
                        default:
                            strArr2[i] = str;
                            str = "3\u0002\t7}<\u0014\u0016-4!\u000e\b.w$\u001e6;h6\u0006\u001c;Y*\u0003\u0002~";
                            i = 1;
                            strArr2 = strArr3;
                            obj = null;
                            break;
                    }
                }
            }

            {
                this.b = r1;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onReceive(android.content.Context r11, android.content.Intent r12) {
                /*
                r10_this = this;
                r5 = 0;
                r3 = -1;
                r1 = 0;
                r8 = com.whatsapp.App.az;
                r0 = z;	 Catch:{ OutOfMemoryError -> 0x001b }
                r2 = 10;
                r0 = r0[r2];	 Catch:{ OutOfMemoryError -> 0x001b }
                com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x001b }
                r0 = r10.a;	 Catch:{ OutOfMemoryError -> 0x001b }
                if (r0 == 0) goto L_0x001d;
            L_0x0012:
                r0 = z;	 Catch:{ OutOfMemoryError -> 0x001b }
                r1 = 5;
                r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x001b }
                com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x001b }
            L_0x001a:
                return;
            L_0x001b:
                r0 = move-exception;
                throw r0;
            L_0x001d:
                r0 = r10.b;
                r0 = r0.T;
                if (r0 != 0) goto L_0x0224;
            L_0x0023:
                r0 = r12.getExtras();
                if (r0 == 0) goto L_0x021a;
            L_0x0029:
                r2 = z;
                r2 = r2[r1];
                r0 = r0.get(r2);
                r0 = (java.lang.Object[]) r0;
                r0 = (java.lang.Object[]) r0;
                if (r0 == 0) goto L_0x0210;
            L_0x0037:
                r2 = new java.lang.StringBuilder;
                r2.<init>();
                r4 = z;
                r6 = 9;
                r4 = r4[r6];
                r2 = r2.append(r4);
                r4 = r0.length;
                r2 = r2.append(r4);
                r2 = r2.toString();
                com.whatsapp.util.Log.i(r2);
                r2 = r1;
            L_0x0053:
                r1 = r0.length;
                if (r2 >= r1) goto L_0x020e;
            L_0x0056:
                r1 = r0[r2];	 Catch:{ OutOfMemoryError -> 0x0231 }
                r1 = (byte[]) r1;	 Catch:{ OutOfMemoryError -> 0x0231 }
                r1 = (byte[]) r1;	 Catch:{ OutOfMemoryError -> 0x0231 }
                r1 = android.telephony.SmsMessage.createFromPdu(r1);	 Catch:{ OutOfMemoryError -> 0x0231 }
                r7 = r1;
            L_0x0061:
                if (r7 == 0) goto L_0x0292;
            L_0x0063:
                r4 = r7.getMessageBody();	 Catch:{ NullPointerException -> 0x0253 }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x028d }
                r1.<init>();	 Catch:{ NullPointerException -> 0x028d }
                r6 = z;	 Catch:{ NullPointerException -> 0x028d }
                r9 = 8;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r4);	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x028d }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x028d }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x028d }
                r1.<init>();	 Catch:{ NullPointerException -> 0x028d }
                r6 = z;	 Catch:{ NullPointerException -> 0x028d }
                r9 = 1;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r6 = r7.getDisplayMessageBody();	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x028d }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x028d }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x028d }
                r1.<init>();	 Catch:{ NullPointerException -> 0x028d }
                r6 = z;	 Catch:{ NullPointerException -> 0x028d }
                r9 = 3;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r6 = r7.getDisplayOriginatingAddress();	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x028d }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x028d }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x028d }
                r1.<init>();	 Catch:{ NullPointerException -> 0x028d }
                r6 = z;	 Catch:{ NullPointerException -> 0x028d }
                r9 = 23;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r6 = r7.getEmailBody();	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x028d }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x028d }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x028d }
                r1.<init>();	 Catch:{ NullPointerException -> 0x028d }
                r6 = z;	 Catch:{ NullPointerException -> 0x028d }
                r9 = 11;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r6 = r7.getEmailFrom();	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x028d }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x028d }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x028d }
                r1.<init>();	 Catch:{ NullPointerException -> 0x028d }
                r6 = z;	 Catch:{ NullPointerException -> 0x028d }
                r9 = 24;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r6 = r7.getOriginatingAddress();	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x028d }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x028d }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x028d }
                r1.<init>();	 Catch:{ NullPointerException -> 0x028d }
                r6 = z;	 Catch:{ NullPointerException -> 0x028d }
                r9 = 7;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r6 = r7.getPseudoSubject();	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x028d }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x028d }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x028d }
                r1.<init>();	 Catch:{ NullPointerException -> 0x028d }
                r6 = z;	 Catch:{ NullPointerException -> 0x028d }
                r9 = 15;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r6 = r7.getServiceCenterAddress();	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x028d }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x028d }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x028d }
                r6 = r4;
            L_0x0151:
                if (r7 == 0) goto L_0x0202;
            L_0x0153:
                if (r6 == 0) goto L_0x0202;
            L_0x0155:
                r1 = new java.lang.StringBuilder;
                r1.<init>();
                r4 = z;
                r7 = 19;
                r4 = r4[r7];
                r1 = r1.append(r4);
                r1 = r1.append(r6);
                r1 = r1.toString();
                com.whatsapp.util.Log.i(r1);
                r1 = z;
                r4 = 21;
                r1 = r1[r4];
                r7 = r6.indexOf(r1);
                if (r7 < 0) goto L_0x01f7;
            L_0x017b:
                r4 = "";
                r1 = r1.length();	 Catch:{ Exception -> 0x0261 }
                r1 = r1 + r7;
            L_0x0182:
                r7 = r6.length();	 Catch:{ Exception -> 0x0261 }
                if (r1 >= r7) goto L_0x01af;
            L_0x0188:
                r7 = r6.charAt(r1);	 Catch:{ Exception -> 0x0261 }
                r9 = java.lang.Character.isDigit(r7);	 Catch:{ Exception -> 0x0261 }
                if (r9 == 0) goto L_0x01a5;
            L_0x0192:
                r9 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0261 }
                r9.<init>();	 Catch:{ Exception -> 0x0261 }
                r9 = r9.append(r4);	 Catch:{ Exception -> 0x0261 }
                r9 = r9.append(r7);	 Catch:{ Exception -> 0x0261 }
                r4 = r9.toString();	 Catch:{ Exception -> 0x0261 }
                if (r8 == 0) goto L_0x01ab;
            L_0x01a5:
                r9 = 45;
                if (r7 == r9) goto L_0x01ab;
            L_0x01a9:
                if (r8 == 0) goto L_0x01af;
            L_0x01ab:
                r1 = r1 + 1;
                if (r8 == 0) goto L_0x0182;
            L_0x01af:
                r1 = r4.length();	 Catch:{ Exception -> 0x0261 }
                if (r1 <= 0) goto L_0x0280;
            L_0x01b5:
                r1 = java.lang.Integer.parseInt(r4);	 Catch:{ Exception -> 0x0261 }
            L_0x01b9:
                if (r1 == r3) goto L_0x01e1;
            L_0x01bb:
                r1 = 1;
                r10.a = r1;	 Catch:{ OutOfMemoryError -> 0x0283 }
                r10.abortBroadcast();	 Catch:{ OutOfMemoryError -> 0x0283 }
                r1 = r10.b;	 Catch:{ OutOfMemoryError -> 0x0283 }
                com.whatsapp.VerifySms.c(r1, r4);	 Catch:{ OutOfMemoryError -> 0x0283 }
                r1 = new com.whatsapp.uc;	 Catch:{ OutOfMemoryError -> 0x0283 }
                r6 = r10.b;	 Catch:{ OutOfMemoryError -> 0x0283 }
                r1.<init>(r6);	 Catch:{ OutOfMemoryError -> 0x0283 }
                r6 = 2;
                r6 = new java.lang.String[r6];	 Catch:{ OutOfMemoryError -> 0x0283 }
                r7 = 0;
                r6[r7] = r4;	 Catch:{ OutOfMemoryError -> 0x0283 }
                r4 = 1;
                r7 = z;	 Catch:{ OutOfMemoryError -> 0x0283 }
                r9 = 18;
                r7 = r7[r9];	 Catch:{ OutOfMemoryError -> 0x0283 }
                r6[r4] = r7;	 Catch:{ OutOfMemoryError -> 0x0283 }
                com.whatsapp.a5w.a(r1, r6);	 Catch:{ OutOfMemoryError -> 0x0283 }
                if (r8 == 0) goto L_0x01f5;
            L_0x01e1:
                r1 = z;	 Catch:{ OutOfMemoryError -> 0x0283 }
                r4 = 22;
                r1 = r1[r4];	 Catch:{ OutOfMemoryError -> 0x0283 }
                com.whatsapp.util.Log.w(r1);	 Catch:{ OutOfMemoryError -> 0x0283 }
                r1 = r10.b;	 Catch:{ OutOfMemoryError -> 0x0283 }
                r4 = z;	 Catch:{ OutOfMemoryError -> 0x0283 }
                r6 = 14;
                r4 = r4[r6];	 Catch:{ OutOfMemoryError -> 0x0283 }
                r1.b(r4);	 Catch:{ OutOfMemoryError -> 0x0283 }
            L_0x01f5:
                if (r8 == 0) goto L_0x0200;
            L_0x01f7:
                r1 = z;	 Catch:{ OutOfMemoryError -> 0x0285 }
                r4 = 16;
                r1 = r1[r4];	 Catch:{ OutOfMemoryError -> 0x0285 }
                com.whatsapp.util.Log.w(r1);	 Catch:{ OutOfMemoryError -> 0x0285 }
            L_0x0200:
                if (r8 == 0) goto L_0x020a;
            L_0x0202:
                r1 = z;	 Catch:{ OutOfMemoryError -> 0x0287 }
                r4 = 4;
                r1 = r1[r4];	 Catch:{ OutOfMemoryError -> 0x0287 }
                com.whatsapp.util.Log.i(r1);	 Catch:{ OutOfMemoryError -> 0x0287 }
            L_0x020a:
                r1 = r2 + 1;
                if (r8 == 0) goto L_0x028f;
            L_0x020e:
                if (r8 == 0) goto L_0x0218;
            L_0x0210:
                r0 = z;	 Catch:{ OutOfMemoryError -> 0x0289 }
                r1 = 2;
                r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x0289 }
                com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x0289 }
            L_0x0218:
                if (r8 == 0) goto L_0x0222;
            L_0x021a:
                r0 = z;	 Catch:{ OutOfMemoryError -> 0x028b }
                r1 = 6;
                r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x028b }
                com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x028b }
            L_0x0222:
                if (r8 == 0) goto L_0x001a;
            L_0x0224:
                r0 = z;	 Catch:{ OutOfMemoryError -> 0x022f }
                r1 = 13;
                r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x022f }
                com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x022f }
                goto L_0x001a;
            L_0x022f:
                r0 = move-exception;
                throw r0;
            L_0x0231:
                r1 = move-exception;
                r4 = new java.lang.StringBuilder;
                r4.<init>();
                r6 = z;
                r7 = 12;
                r6 = r6[r7];
                r4 = r4.append(r6);
                r1 = r1.toString();
                r1 = r4.append(r1);
                r1 = r1.toString();
                com.whatsapp.util.Log.e(r1);
                r7 = r5;
                goto L_0x0061;
            L_0x0253:
                r1 = move-exception;
                r4 = r5;
            L_0x0255:
                r6 = z;
                r9 = 20;
                r6 = r6[r9];
                com.whatsapp.util.Log.b(r6, r1);
                r6 = r4;
                goto L_0x0151;
            L_0x0261:
                r1 = move-exception;
                r6 = new java.lang.StringBuilder;
                r6.<init>();
                r7 = z;
                r9 = 17;
                r7 = r7[r9];
                r6 = r6.append(r7);
                r1 = r1.toString();
                r1 = r6.append(r1);
                r1 = r1.toString();
                com.whatsapp.util.Log.w(r1);
            L_0x0280:
                r1 = r3;
                goto L_0x01b9;
            L_0x0283:
                r0 = move-exception;
                throw r0;
            L_0x0285:
                r0 = move-exception;
                throw r0;
            L_0x0287:
                r0 = move-exception;
                throw r0;
            L_0x0289:
                r0 = move-exception;
                throw r0;
            L_0x028b:
                r0 = move-exception;
                throw r0;
            L_0x028d:
                r1 = move-exception;
                goto L_0x0255;
            L_0x028f:
                r2 = r1;
                goto L_0x0053;
            L_0x0292:
                r6 = r5;
                goto L_0x0151;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.AnonymousClass_2.onReceive(android.content.Context, android.content.Intent):void");
            }
        };
        this.W = new BroadcastReceiver() {
            private static final String[] z;
            final VerifySms a;

            static {
                String[] strArr = new String[31];
                String str = "\u007f\u001a0Q";
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
                                i3 = 84;
                                break;
                            case ay.f /*1*/:
                                i3 = 47;
                                break;
                            case ay.n /*2*/:
                                i3 = 2;
                                break;
                            case ay.p /*3*/:
                                i3 = 96;
                                break;
                            default:
                                i3 = 31;
                                break;
                        }
                        cArr[i2] = (char) (i3 ^ c);
                    }
                    str = new String(cArr).intern();
                    switch (obj) {
                        case PBE.MD5 /*0*/:
                            strArr2[i] = str;
                            str = "\"Jp\ty-\\o\u001301Bc\ts\u0012]m\r?";
                            i = 2;
                            strArr2 = strArr3;
                            obj = 1;
                            break;
                        case ay.f /*1*/:
                            strArr2[i] = str;
                            str = "\"Jp\ty-\\o\u00130&Ja\u0005v\"JfMm1Lg\ti1]-\u0002j:Kn\u00052:Zn\f";
                            i = 3;
                            strArr2 = strArr3;
                            obj = 2;
                            break;
                        case ay.n /*2*/:
                            strArr2[i] = str;
                            str = "\"Jp\ty-\\o\u00130&Ja\u0005v\"JfMm1Lg\ti1]-\u0004z'[p\u000ff1K";
                            i = 4;
                            strArr2 = strArr3;
                            obj = 3;
                            break;
                        case ay.p /*3*/:
                            strArr2[i] = str;
                            i = 5;
                            strArr2 = strArr3;
                            str = "\"Jp\ty-\\o\u00130&Ja\u0005v\"JfMm1Lg\ti1]-\rv'\\k\u000exyLj\u0001s8Jl\u0007z";
                            obj = 4;
                            break;
                        case aj.i /*4*/:
                            strArr2[i] = str;
                            i = 6;
                            str = "\"Jp\ty-\\o\u001303Jv/m=Hk\u000e~ Fl\u0007^0Kp\u0005l'\u000f";
                            obj = 5;
                            strArr2 = strArr3;
                            break;
                        case aV.r /*5*/:
                            strArr2[i] = str;
                            i = 7;
                            str = "$Kw\u0013";
                            obj = 6;
                            strArr2 = strArr3;
                            break;
                        case aV.i /*6*/:
                            strArr2[i] = str;
                            i = 8;
                            str = "\"Jp\ty-\\o\u00130&Ja\u0005v\"JfMm1Lg\ti1]-\u0016z&Fd\tz0";
                            obj = 7;
                            strArr2 = strArr3;
                            break;
                        case a8.s /*7*/:
                            strArr2[i] = str;
                            i = 9;
                            str = "\"Jp\ty-\\o\u00130&Ja\u0005v\"JfMm1Lg\ti1]\"";
                            obj = 8;
                            strArr2 = strArr3;
                            break;
                        case a8.n /*8*/:
                            strArr2[i] = str;
                            i = 10;
                            str = "\"Jp\ty-\\o\u00130;ZvMp2\u0002o\u0005r;]{@";
                            obj = 9;
                            strArr2 = strArr3;
                            break;
                        case a6.D /*9*/:
                            strArr2[i] = str;
                            i = 11;
                            str = "\"Jp\ty-\\o\u001300Fq\u0010s5VO\u0005l'Ne\u0005];K{@";
                            obj = 10;
                            strArr2 = strArr3;
                            break;
                        case a6.h /*10*/:
                            strArr2[i] = str;
                            i = 12;
                            str = "\"Jp\ty-\\o\u001303Jv0l1Zf\u000fL!Mh\u0005| \u000f";
                            obj = 11;
                            strArr2 = strArr3;
                            break;
                        case a6.e /*11*/:
                            strArr2[i] = str;
                            i = 13;
                            str = "5Zv\u000f";
                            obj = 12;
                            strArr2 = strArr3;
                            break;
                        case a6.s /*12*/:
                            strArr2[i] = str;
                            i = 14;
                            str = "\"Jp\ty-\\o\u001301Bc\ts\u0016@f\u0019?";
                            obj = 13;
                            strArr2 = strArr3;
                            break;
                        case a6.z /*13*/:
                            strArr2[i] = str;
                            i = 15;
                            str = "\"Jp\ty-\\o\u00130&Ja\u0005v\"JfMm1Lg\ti1]-\rv'Bc\u0014|<\u0000q\bp&[\"";
                            obj = 14;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                            strArr2[i] = str;
                            i = 16;
                            str = "\"Jp\ty-\\o\u001303Jv3z&Yk\u0003z\u0017Jl\u0014z&nf\u0004m1\\q@";
                            obj = 15;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_actionModeBackground /*15*/:
                            strArr2[i] = str;
                            i = 17;
                            str = "\"Jp\ty-\\o\u0013";
                            obj = 16;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                            strArr2[i] = str;
                            i = 18;
                            str = "\"Jp\ty-\\o\u00130&Ja\u0005v\"JfMm1Lg\ti1]-\u0010{!\\/\fz:Hv\b0";
                            obj = 17;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                            strArr2[i] = str;
                            i = 19;
                            str = "\"Jp\ty-\\o\u001300Fq\u0010s5VM\u0012v3Fl\u0001k=Ae!{0]g\u0013lt";
                            obj = 18;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                            strArr2[i] = str;
                            i = 20;
                            str = "\"Jp\ty-\\o\u00130&Ja\u0005v\"JfMm1Lg\ti1]\"";
                            obj = 19;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                            strArr2[i] = str;
                            i = 21;
                            str = "\"Jp\ty-\\o\u00130&Ja\u0005v\"JfMm1Lg\ti1]-\u0004~ N-\tq Jl\u0014";
                            obj = 20;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_buttonStyleSmall /*20*/:
                            strArr2[i] = str;
                            i = 22;
                            str = "\u0010Jq\u0014v:@\"\tq7@p\u0012z7[m";
                            obj = 21;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_selectableItemBackground /*21*/:
                            strArr2[i] = str;
                            i = 23;
                            str = "\"Jp\ty-\\o\u001303Jv3z&Yk\u0003z\u0017Jl\u0014z&{k\rz'[c\rot";
                            obj = 22;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_windowContentOverlay /*22*/:
                            strArr2[i] = str;
                            i = 24;
                            str = "\u0010Jq\u0014v:@\"\tq7@p\u0012z7[m";
                            obj = 23;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                            strArr2[i] = str;
                            i = 25;
                            str = "\"Jp\ty-\\o\u00130&Ja\u0005v\"JfMm1Lg\ti1]-\rz'\\c\u0007zyAw\fs";
                            obj = 24;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                            strArr2[i] = str;
                            i = 26;
                            str = "\"Jp\ty-\\o\u00130&Ja\u0005v\"JfMm1Lg\ti1]-\rv'Bc\u0014|<\u0000t\u0001s!J\"\u000ej9Mg\u0012\"";
                            obj = 25;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_textAppearanceSmall /*25*/:
                            strArr2[i] = str;
                            i = 27;
                            str = "t]g\u0003z=Yg\u0004\"";
                            obj = 26;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_textColorPrimary /*26*/:
                            strArr2[i] = str;
                            i = 28;
                            str = "\u007f\u001a0";
                            obj = 27;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                            strArr2[i] = str;
                            i = 29;
                            str = "'Jn\u00062'Jl\u000429Fq\r~ LjMo<@l\u0005";
                            obj = 28;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                            strArr2[i] = str;
                            i = 30;
                            str = "\"Jp\ty-\\o\u001303Jv-z'\\c\u0007z\u0016@f\u0019?";
                            obj = 29;
                            strArr2 = strArr3;
                            break;
                        case vk.SherlockTheme_spinnerItemStyle /*29*/:
                            strArr2[i] = str;
                            z = strArr3;
                        default:
                            strArr2[i] = str;
                            str = "'Jn\u00062'Jl\u000429Fq\r~ LjMo<@l\u0005";
                            i = 1;
                            strArr2 = strArr3;
                            obj = null;
                            break;
                    }
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onReceive(android.content.Context r13, android.content.Intent r14) {
                /*
                r12_this = this;
                r8 = com.whatsapp.App.az;
                r0 = z;
                r1 = 21;
                r0 = r0[r1];
                com.whatsapp.util.Log.i(r0);
                r0 = r12.a;
                r0 = r0.T;
                if (r0 != 0) goto L_0x02fe;
            L_0x0011:
                r0 = r14.getExtras();
                if (r0 == 0) goto L_0x02f4;
            L_0x0017:
                r1 = z;
                r2 = 7;
                r1 = r1[r2];
                r0 = r0.get(r1);
                r0 = (java.lang.Object[]) r0;
                r0 = (java.lang.Object[]) r0;
                r1 = new java.lang.StringBuilder;
                r1.<init>();
                r2 = z;
                r3 = 18;
                r2 = r2[r3];
                r1 = r1.append(r2);
                r2 = r0.length;
                r1 = r1.append(r2);
                r1 = r1.toString();
                com.whatsapp.util.Log.i(r1);
                r4 = "";
                r3 = "";
                r2 = 0;
                r1 = 0;
                r5 = r4;
                r4 = r3;
                r3 = r2;
                r2 = r1;
            L_0x0049:
                r1 = r0.length;
                if (r2 >= r1) goto L_0x01b5;
            L_0x004c:
                r6 = 0;
                r1 = r0[r2];	 Catch:{ OutOfMemoryError -> 0x0307 }
                r1 = (byte[]) r1;	 Catch:{ OutOfMemoryError -> 0x0307 }
                r1 = (byte[]) r1;	 Catch:{ OutOfMemoryError -> 0x0307 }
                r1 = android.telephony.SmsMessage.createFromPdu(r1);	 Catch:{ OutOfMemoryError -> 0x0307 }
                if (r2 != 0) goto L_0x005a;
            L_0x0059:
                r3 = r1;
            L_0x005a:
                r7 = r1;
            L_0x005b:
                if (r7 == 0) goto L_0x01b1;
            L_0x005d:
                r1 = "";
                r9 = r7.getUserData();	 Catch:{ NullPointerException -> 0x0329 }
                if (r9 == 0) goto L_0x0096;
            L_0x0065:
                r6 = 0;
            L_0x0066:
                r10 = r9.length;	 Catch:{ NullPointerException -> 0x0329 }
                if (r6 >= r10) goto L_0x0085;
            L_0x0069:
                r10 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0329 }
                r10.<init>();	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r10.append(r1);	 Catch:{ NullPointerException -> 0x0329 }
                r10 = r9[r6];	 Catch:{ NullPointerException -> 0x0329 }
                r10 = (char) r10;	 Catch:{ NullPointerException -> 0x0329 }
                r10 = java.lang.Character.toString(r10);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r10);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0329 }
                r6 = r6 + 1;
                if (r8 == 0) goto L_0x0066;
            L_0x0085:
                r6 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0329 }
                r6.<init>();	 Catch:{ NullPointerException -> 0x0329 }
                r6 = r6.append(r5);	 Catch:{ NullPointerException -> 0x0329 }
                r6 = r6.append(r1);	 Catch:{ NullPointerException -> 0x0329 }
                r5 = r6.toString();	 Catch:{ NullPointerException -> 0x0329 }
            L_0x0096:
                r6 = r7.getDisplayMessageBody();	 Catch:{ NullPointerException -> 0x0329 }
                if (r6 == 0) goto L_0x00ad;
            L_0x009c:
                r9 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0329 }
                r9.<init>();	 Catch:{ NullPointerException -> 0x0329 }
                r9 = r9.append(r4);	 Catch:{ NullPointerException -> 0x0329 }
                r9 = r9.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r4 = r9.toString();	 Catch:{ NullPointerException -> 0x0329 }
            L_0x00ad:
                r9 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0329 }
                r9.<init>();	 Catch:{ NullPointerException -> 0x0329 }
                r10 = z;	 Catch:{ NullPointerException -> 0x0329 }
                r11 = 30;
                r10 = r10[r11];	 Catch:{ NullPointerException -> 0x0329 }
                r9 = r9.append(r10);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r9.append(r1);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0329 }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0329 }
                r1.<init>();	 Catch:{ NullPointerException -> 0x0329 }
                r9 = z;	 Catch:{ NullPointerException -> 0x0329 }
                r10 = 11;
                r9 = r9[r10];	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r9);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0329 }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0329 }
                r1.<init>();	 Catch:{ NullPointerException -> 0x0329 }
                r6 = z;	 Catch:{ NullPointerException -> 0x0329 }
                r9 = 19;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r6 = r7.getDisplayOriginatingAddress();	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0329 }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0329 }
                r1.<init>();	 Catch:{ NullPointerException -> 0x0329 }
                r6 = z;	 Catch:{ NullPointerException -> 0x0329 }
                r9 = 14;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r6 = r7.getEmailBody();	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0329 }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0329 }
                r1.<init>();	 Catch:{ NullPointerException -> 0x0329 }
                r6 = z;	 Catch:{ NullPointerException -> 0x0329 }
                r9 = 2;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r6 = r7.getEmailFrom();	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0329 }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0329 }
                r1.<init>();	 Catch:{ NullPointerException -> 0x0329 }
                r6 = z;	 Catch:{ NullPointerException -> 0x0329 }
                r9 = 6;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r6 = r7.getOriginatingAddress();	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0329 }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0329 }
                r1.<init>();	 Catch:{ NullPointerException -> 0x0329 }
                r6 = z;	 Catch:{ NullPointerException -> 0x0329 }
                r9 = 12;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r6 = r7.getPseudoSubject();	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0329 }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0329 }
                r1.<init>();	 Catch:{ NullPointerException -> 0x0329 }
                r6 = z;	 Catch:{ NullPointerException -> 0x0329 }
                r9 = 23;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r10 = r7.getTimestampMillis();	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r10);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0329 }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0329 }
                r1.<init>();	 Catch:{ NullPointerException -> 0x0329 }
                r6 = z;	 Catch:{ NullPointerException -> 0x0329 }
                r9 = 16;
                r6 = r6[r9];	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r6 = r7.getServiceCenterAddress();	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.append(r6);	 Catch:{ NullPointerException -> 0x0329 }
                r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0329 }
                com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0329 }
            L_0x01b1:
                r1 = r2 + 1;
                if (r8 == 0) goto L_0x03b5;
            L_0x01b5:
                r0 = r5.length();	 Catch:{ OutOfMemoryError -> 0x0335 }
                if (r0 > 0) goto L_0x01c1;
            L_0x01bb:
                r0 = r4.length();	 Catch:{ OutOfMemoryError -> 0x0337 }
                if (r0 <= 0) goto L_0x039c;
            L_0x01c1:
                r0 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x0339 }
                r0.<init>();	 Catch:{ OutOfMemoryError -> 0x0339 }
                r1 = z;	 Catch:{ OutOfMemoryError -> 0x0339 }
                r2 = 20;
                r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x0339 }
                r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x0339 }
                r0 = r0.append(r5);	 Catch:{ OutOfMemoryError -> 0x0339 }
                r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x0339 }
                com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x0339 }
                r0 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x0339 }
                r0.<init>();	 Catch:{ OutOfMemoryError -> 0x0339 }
                r1 = z;	 Catch:{ OutOfMemoryError -> 0x0339 }
                r2 = 9;
                r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x0339 }
                r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x0339 }
                r0 = r0.append(r4);	 Catch:{ OutOfMemoryError -> 0x0339 }
                r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x0339 }
                com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x0339 }
                r0 = com.whatsapp.VerifySms.G();	 Catch:{ OutOfMemoryError -> 0x0339 }
                r0 = r5.contains(r0);	 Catch:{ OutOfMemoryError -> 0x0339 }
                if (r0 != 0) goto L_0x0209;
            L_0x01ff:
                r0 = com.whatsapp.VerifySms.G();	 Catch:{ OutOfMemoryError -> 0x0339 }
                r0 = r4.contains(r0);	 Catch:{ OutOfMemoryError -> 0x0339 }
                if (r0 == 0) goto L_0x0347;
            L_0x0209:
                r0 = r12.a;
                r1 = r12.a;
                r1 = com.whatsapp.VerifySms.A(r1);
                r2 = r12.a;
                r2 = com.whatsapp.VerifySms.a(r2);
                r1 = r0.b(r1, r2);
                r2 = r3.getOriginatingAddress();
                r0 = r12.a;	 Catch:{ OutOfMemoryError -> 0x033b }
                com.whatsapp.VerifySms.j(r0);	 Catch:{ OutOfMemoryError -> 0x033b }
                if (r1 == 0) goto L_0x0236;
            L_0x0226:
                if (r2 == 0) goto L_0x0236;
            L_0x0228:
                r0 = r1.length();	 Catch:{ OutOfMemoryError -> 0x033f }
                r3 = 6;
                if (r0 < r3) goto L_0x0236;
            L_0x022f:
                r0 = r2.length();	 Catch:{ OutOfMemoryError -> 0x0341 }
                r3 = 6;
                if (r0 >= r3) goto L_0x0261;
            L_0x0236:
                r0 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x0343 }
                r0.<init>();	 Catch:{ OutOfMemoryError -> 0x0343 }
                r3 = z;	 Catch:{ OutOfMemoryError -> 0x0343 }
                r4 = 15;
                r3 = r3[r4];	 Catch:{ OutOfMemoryError -> 0x0343 }
                r0 = r0.append(r3);	 Catch:{ OutOfMemoryError -> 0x0343 }
                r0 = r0.append(r2);	 Catch:{ OutOfMemoryError -> 0x0343 }
                r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x0343 }
                com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x0343 }
                r0 = r12.a;	 Catch:{ OutOfMemoryError -> 0x0343 }
                r3 = z;	 Catch:{ OutOfMemoryError -> 0x0343 }
                r4 = 1;
                r3 = r3[r4];	 Catch:{ OutOfMemoryError -> 0x0343 }
                r0.b(r3);	 Catch:{ OutOfMemoryError -> 0x0343 }
                r0 = r12.a;	 Catch:{ OutOfMemoryError -> 0x0343 }
                com.whatsapp.VerifySms.g(r0);	 Catch:{ OutOfMemoryError -> 0x0343 }
                if (r8 == 0) goto L_0x02f2;
            L_0x0261:
                r0 = r1.length();	 Catch:{ OutOfMemoryError -> 0x0343 }
                r0 = r0 + -6;
                r3 = r1.length();	 Catch:{ OutOfMemoryError -> 0x0343 }
                r0 = r1.substring(r0, r3);	 Catch:{ OutOfMemoryError -> 0x0343 }
                r3 = r2.length();	 Catch:{ OutOfMemoryError -> 0x0343 }
                r3 = r3 + -6;
                r4 = r2.length();	 Catch:{ OutOfMemoryError -> 0x0343 }
                r3 = r2.substring(r3, r4);	 Catch:{ OutOfMemoryError -> 0x0343 }
                r0 = r0.equals(r3);	 Catch:{ OutOfMemoryError -> 0x0343 }
                if (r0 == 0) goto L_0x02ba;
            L_0x0283:
                r0 = z;
                r3 = 8;
                r0 = r0[r3];
                com.whatsapp.util.Log.i(r0);
                r0 = com.whatsapp.App.p;
                r0 = com.whatsapp.App.b(r0);
                r0 = com.whatsapp.VerifyNumber.a(r0);
                r3 = com.whatsapp.App.aa;
                r4 = 3;
                if (r3 == r4) goto L_0x029f;
            L_0x029b:
                r0 = com.whatsapp.a54.d(r0);
            L_0x029f:
                r3 = new com.whatsapp.uc;	 Catch:{ OutOfMemoryError -> 0x0345 }
                r4 = r12.a;	 Catch:{ OutOfMemoryError -> 0x0345 }
                r3.<init>(r4);	 Catch:{ OutOfMemoryError -> 0x0345 }
                r4 = 2;
                r4 = new java.lang.String[r4];	 Catch:{ OutOfMemoryError -> 0x0345 }
                r5 = 0;
                r4[r5] = r0;	 Catch:{ OutOfMemoryError -> 0x0345 }
                r0 = 1;
                r5 = z;	 Catch:{ OutOfMemoryError -> 0x0345 }
                r6 = 13;
                r5 = r5[r6];	 Catch:{ OutOfMemoryError -> 0x0345 }
                r4[r0] = r5;	 Catch:{ OutOfMemoryError -> 0x0345 }
                com.whatsapp.a5w.a(r3, r4);	 Catch:{ OutOfMemoryError -> 0x0345 }
                if (r8 == 0) goto L_0x02f2;
            L_0x02ba:
                r0 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x0345 }
                r0.<init>();	 Catch:{ OutOfMemoryError -> 0x0345 }
                r3 = z;	 Catch:{ OutOfMemoryError -> 0x0345 }
                r4 = 26;
                r3 = r3[r4];	 Catch:{ OutOfMemoryError -> 0x0345 }
                r0 = r0.append(r3);	 Catch:{ OutOfMemoryError -> 0x0345 }
                r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x0345 }
                r1 = z;	 Catch:{ OutOfMemoryError -> 0x0345 }
                r3 = 27;
                r1 = r1[r3];	 Catch:{ OutOfMemoryError -> 0x0345 }
                r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x0345 }
                r0 = r0.append(r2);	 Catch:{ OutOfMemoryError -> 0x0345 }
                r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x0345 }
                com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x0345 }
                r0 = r12.a;	 Catch:{ OutOfMemoryError -> 0x0345 }
                r1 = z;	 Catch:{ OutOfMemoryError -> 0x0345 }
                r2 = 29;
                r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x0345 }
                r0.b(r1);	 Catch:{ OutOfMemoryError -> 0x0345 }
                r0 = r12.a;	 Catch:{ OutOfMemoryError -> 0x0345 }
                com.whatsapp.VerifySms.g(r0);	 Catch:{ OutOfMemoryError -> 0x0345 }
            L_0x02f2:
                if (r8 == 0) goto L_0x02fc;
            L_0x02f4:
                r0 = z;	 Catch:{ OutOfMemoryError -> 0x03b1 }
                r1 = 3;
                r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x03b1 }
                com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x03b1 }
            L_0x02fc:
                if (r8 == 0) goto L_0x0306;
            L_0x02fe:
                r0 = z;	 Catch:{ OutOfMemoryError -> 0x03b3 }
                r1 = 4;
                r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x03b3 }
                com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x03b3 }
            L_0x0306:
                return;
            L_0x0307:
                r1 = move-exception;
                r7 = new java.lang.StringBuilder;
                r7.<init>();
                r9 = z;
                r10 = 10;
                r9 = r9[r10];
                r7 = r7.append(r9);
                r1 = r1.toString();
                r1 = r7.append(r1);
                r1 = r1.toString();
                com.whatsapp.util.Log.e(r1);
                r7 = r6;
                goto L_0x005b;
            L_0x0329:
                r1 = move-exception;
                r6 = z;
                r7 = 17;
                r6 = r6[r7];
                com.whatsapp.util.Log.b(r6, r1);
                goto L_0x01b1;
            L_0x0335:
                r0 = move-exception;
                throw r0;	 Catch:{ OutOfMemoryError -> 0x0337 }
            L_0x0337:
                r0 = move-exception;
                throw r0;	 Catch:{ OutOfMemoryError -> 0x0339 }
            L_0x0339:
                r0 = move-exception;
                throw r0;
            L_0x033b:
                r0 = move-exception;
                throw r0;	 Catch:{ OutOfMemoryError -> 0x033d }
            L_0x033d:
                r0 = move-exception;
                throw r0;	 Catch:{ OutOfMemoryError -> 0x033f }
            L_0x033f:
                r0 = move-exception;
                throw r0;	 Catch:{ OutOfMemoryError -> 0x0341 }
            L_0x0341:
                r0 = move-exception;
                throw r0;	 Catch:{ OutOfMemoryError -> 0x0343 }
            L_0x0343:
                r0 = move-exception;
                throw r0;
            L_0x0345:
                r0 = move-exception;
                throw r0;
            L_0x0347:
                r0 = z;	 Catch:{ OutOfMemoryError -> 0x03a9 }
                r1 = 22;
                r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x03a9 }
                r0 = r5.contains(r0);	 Catch:{ OutOfMemoryError -> 0x03a9 }
                if (r0 != 0) goto L_0x035f;
            L_0x0353:
                r0 = z;	 Catch:{ OutOfMemoryError -> 0x03ab }
                r1 = 24;
                r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x03ab }
                r0 = r4.contains(r0);	 Catch:{ OutOfMemoryError -> 0x03ab }
                if (r0 == 0) goto L_0x0392;
            L_0x035f:
                r0 = com.whatsapp.VerifySms.B();	 Catch:{ OutOfMemoryError -> 0x03ad }
                r1 = z;	 Catch:{ OutOfMemoryError -> 0x03ad }
                r2 = 28;
                r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x03ad }
                r0 = r0.startsWith(r1);	 Catch:{ OutOfMemoryError -> 0x03ad }
                if (r0 == 0) goto L_0x0392;
            L_0x036f:
                r0 = com.whatsapp.VerifySms.B();	 Catch:{ OutOfMemoryError -> 0x03af }
                r1 = z;	 Catch:{ OutOfMemoryError -> 0x03af }
                r2 = 0;
                r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x03af }
                r0 = r0.startsWith(r1);	 Catch:{ OutOfMemoryError -> 0x03af }
                if (r0 != 0) goto L_0x0392;
            L_0x037e:
                r0 = r12.a;	 Catch:{ OutOfMemoryError -> 0x03af }
                com.whatsapp.VerifySms.j(r0);	 Catch:{ OutOfMemoryError -> 0x03af }
                r0 = 6;
                com.whatsapp.VerifySms.a(r0);	 Catch:{ OutOfMemoryError -> 0x03af }
                r0 = r12.a;	 Catch:{ OutOfMemoryError -> 0x03af }
                com.whatsapp.VerifySms.t(r0);	 Catch:{ OutOfMemoryError -> 0x03af }
                r0 = r12.a;	 Catch:{ OutOfMemoryError -> 0x03af }
                r1 = 4;
                r0.c(r1);	 Catch:{ OutOfMemoryError -> 0x03af }
            L_0x0392:
                r0 = z;	 Catch:{ OutOfMemoryError -> 0x03a7 }
                r1 = 5;
                r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x03a7 }
                com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x03a7 }
                if (r8 == 0) goto L_0x02f2;
            L_0x039c:
                r0 = z;	 Catch:{ OutOfMemoryError -> 0x03a7 }
                r1 = 25;
                r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x03a7 }
                com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x03a7 }
                goto L_0x02f2;
            L_0x03a7:
                r0 = move-exception;
                throw r0;
            L_0x03a9:
                r0 = move-exception;
                throw r0;	 Catch:{ OutOfMemoryError -> 0x03ab }
            L_0x03ab:
                r0 = move-exception;
                throw r0;	 Catch:{ OutOfMemoryError -> 0x03ad }
            L_0x03ad:
                r0 = move-exception;
                throw r0;	 Catch:{ OutOfMemoryError -> 0x03af }
            L_0x03af:
                r0 = move-exception;
                throw r0;
            L_0x03b1:
                r0 = move-exception;
                throw r0;
            L_0x03b3:
                r0 = move-exception;
                throw r0;
            L_0x03b5:
                r2 = r1;
                goto L_0x0049;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.AnonymousClass_3.onReceive(android.content.Context, android.content.Intent):void");
            }

            {
                this.a = r1;
            }
        };
        this.t = -2;
    }

    static void m(VerifySms verifySms) {
        verifySms.f();
    }

    public void onBackPressed() {
    }

    private void k() {
        try {
            if (M != null) {
                unregisterReceiver(M);
                M = null;
            }
            try {
                w();
                if (ai != null) {
                    unregisterReceiver(ai);
                    ai = null;
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static ProgressBar n(VerifySms verifySms) {
        return verifySms.y;
    }

    static boolean b(VerifySms verifySms, boolean z) {
        verifySms.N = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
        r9_this = this;
        r8 = 1;
        r1 = 0;
        r0 = com.whatsapp.App.az;
        super.onResume();
        r1 = r9.getPreferences(r1);
        r2 = bb;	 Catch:{ ActivityNotFoundException -> 0x0045 }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x0045 }
        r3 = 0;
        r1 = r1.getInt(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0045 }
        Y = r1;	 Catch:{ ActivityNotFoundException -> 0x0045 }
        r1 = com.whatsapp.App.p;	 Catch:{ ActivityNotFoundException -> 0x0045 }
        r1 = com.whatsapp.App.b(r1);	 Catch:{ ActivityNotFoundException -> 0x0045 }
        r1 = a(r1);	 Catch:{ ActivityNotFoundException -> 0x0045 }
        X = r1;	 Catch:{ ActivityNotFoundException -> 0x0045 }
        r1 = com.whatsapp.App.h(r9);	 Catch:{ ActivityNotFoundException -> 0x0045 }
        C = r1;	 Catch:{ ActivityNotFoundException -> 0x0045 }
        r1 = com.whatsapp.App.q(r9);	 Catch:{ ActivityNotFoundException -> 0x0045 }
        K = r1;	 Catch:{ ActivityNotFoundException -> 0x0045 }
        r1 = r9.ab;	 Catch:{ ActivityNotFoundException -> 0x0045 }
        if (r1 == 0) goto L_0x0038;
    L_0x0034:
        r1 = r9.ag;	 Catch:{ ActivityNotFoundException -> 0x0047 }
        if (r1 != 0) goto L_0x0049;
    L_0x0038:
        r0 = bb;	 Catch:{ ActivityNotFoundException -> 0x0047 }
        r1 = 14;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x0047 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x0047 }
        r9.F();	 Catch:{ ActivityNotFoundException -> 0x0047 }
    L_0x0044:
        return;
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        r1 = 4;
        com.whatsapp.App.d(r9, r1);	 Catch:{ ActivityNotFoundException -> 0x00c3 }
        r1 = r9.f();	 Catch:{ ActivityNotFoundException -> 0x00c3 }
        if (r1 != 0) goto L_0x0066;
    L_0x0053:
        r1 = Y;	 Catch:{ ActivityNotFoundException -> 0x00c5 }
        if (r1 != 0) goto L_0x0066;
    L_0x0057:
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x00c5 }
        r2 = 15;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x00c5 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ActivityNotFoundException -> 0x00c5 }
        r1 = 3;
        Y = r1;	 Catch:{ ActivityNotFoundException -> 0x00c5 }
        r9.x();	 Catch:{ ActivityNotFoundException -> 0x00c5 }
    L_0x0066:
        r1 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x013f }
        r1.<init>();	 Catch:{ ActivityNotFoundException -> 0x013f }
        r2 = bb;	 Catch:{ ActivityNotFoundException -> 0x013f }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x013f }
        r1 = r1.append(r2);	 Catch:{ ActivityNotFoundException -> 0x013f }
        r2 = Y;	 Catch:{ ActivityNotFoundException -> 0x013f }
        r1 = r1.append(r2);	 Catch:{ ActivityNotFoundException -> 0x013f }
        r1 = r1.toString();	 Catch:{ ActivityNotFoundException -> 0x013f }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ActivityNotFoundException -> 0x013f }
        r1 = Y;	 Catch:{ ActivityNotFoundException -> 0x013f }
        switch(r1) {
            case 0: goto L_0x00d1;
            case 1: goto L_0x00c7;
            case 2: goto L_0x00de;
            case 3: goto L_0x00d9;
            case 4: goto L_0x012a;
            case 5: goto L_0x00d1;
            case 6: goto L_0x0124;
            case 7: goto L_0x011e;
            case 8: goto L_0x0131;
            case 9: goto L_0x0087;
            case 10: goto L_0x00d9;
            case 11: goto L_0x00d9;
            case 12: goto L_0x0138;
            case 13: goto L_0x00d9;
            default: goto L_0x0087;
        };
    L_0x0087:
        r0 = bb;	 Catch:{ ActivityNotFoundException -> 0x0153 }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x0153 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x0153 }
    L_0x0090:
        r0 = android.support.v4.app.NotificationManagerCompat.from(r9);	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r1 = 1;
        r0.cancel(r1);	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r0 = r9.L;	 Catch:{ ActivityNotFoundException -> 0x0155 }
        if (r0 == 0) goto L_0x00c0;
    L_0x009c:
        r0 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r1 = r9.L;	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r0 = r0.toString();	 Catch:{ ActivityNotFoundException -> 0x0155 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r0 = r9.L;	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r9.h(r0);	 Catch:{ ActivityNotFoundException -> 0x0155 }
        r0 = 0;
        r9.L = r0;	 Catch:{ ActivityNotFoundException -> 0x0155 }
    L_0x00c0:
        r9.w = r8;
        goto L_0x0044;
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;
    L_0x00c7:
        r1 = ah;	 Catch:{ ActivityNotFoundException -> 0x0141 }
        if (r1 != 0) goto L_0x0090;
    L_0x00cb:
        r1 = 5;
        Y = r1;	 Catch:{ ActivityNotFoundException -> 0x0141 }
        r9.x();	 Catch:{ ActivityNotFoundException -> 0x0141 }
    L_0x00d1:
        r9.y();	 Catch:{ ActivityNotFoundException -> 0x0143 }
        r9.j();	 Catch:{ ActivityNotFoundException -> 0x0143 }
        if (r0 == 0) goto L_0x0090;
    L_0x00d9:
        r9.H();	 Catch:{ ActivityNotFoundException -> 0x0145 }
        if (r0 == 0) goto L_0x0090;
    L_0x00de:
        r1 = ah;	 Catch:{ ActivityNotFoundException -> 0x0145 }
        if (r1 != 0) goto L_0x0090;
    L_0x00e2:
        r2 = r9.c();
        r4 = java.lang.System.currentTimeMillis();
        r1 = af;	 Catch:{ ActivityNotFoundException -> 0x0147 }
        r6 = (long) r1;
        r4 = r4 - r2;
        r4 = r6 - r4;
        r6 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 < 0) goto L_0x0110;
    L_0x00f6:
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x0149 }
        r4 = 8;
        r1 = r1[r4];	 Catch:{ ActivityNotFoundException -> 0x0149 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ActivityNotFoundException -> 0x0149 }
        r1 = af;	 Catch:{ ActivityNotFoundException -> 0x0149 }
        r4 = (long) r1;	 Catch:{ ActivityNotFoundException -> 0x0149 }
        r9.O = r4;	 Catch:{ ActivityNotFoundException -> 0x0149 }
        r1 = r9.D;	 Catch:{ ActivityNotFoundException -> 0x0149 }
        r4 = "";
        r1.setText(r4);	 Catch:{ ActivityNotFoundException -> 0x0149 }
        r9.e(r2);	 Catch:{ ActivityNotFoundException -> 0x0149 }
        if (r0 == 0) goto L_0x011c;
    L_0x0110:
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x0149 }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0149 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ActivityNotFoundException -> 0x0149 }
        r9.t();	 Catch:{ ActivityNotFoundException -> 0x0149 }
    L_0x011c:
        if (r0 == 0) goto L_0x0090;
    L_0x011e:
        r1 = 7;
        r9.showDialog(r1);	 Catch:{ ActivityNotFoundException -> 0x014b }
        if (r0 == 0) goto L_0x0090;
    L_0x0124:
        r1 = 4;
        r9.showDialog(r1);	 Catch:{ ActivityNotFoundException -> 0x014d }
        if (r0 == 0) goto L_0x0090;
    L_0x012a:
        r1 = 21;
        r9.showDialog(r1);	 Catch:{ ActivityNotFoundException -> 0x014f }
        if (r0 == 0) goto L_0x0090;
    L_0x0131:
        r1 = 23;
        r9.showDialog(r1);	 Catch:{ ActivityNotFoundException -> 0x0151 }
        if (r0 == 0) goto L_0x0090;
    L_0x0138:
        r9.n();	 Catch:{ ActivityNotFoundException -> 0x0153 }
        if (r0 == 0) goto L_0x0090;
    L_0x013d:
        goto L_0x0087;
    L_0x013f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0141 }
    L_0x0141:
        r0 = move-exception;
        throw r0;
    L_0x0143:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0145 }
    L_0x0145:
        r0 = move-exception;
        throw r0;
    L_0x0147:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0149 }
    L_0x0149:
        r0 = move-exception;
        throw r0;
    L_0x014b:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x014d }
    L_0x014d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x014f }
    L_0x014f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0151 }
    L_0x0151:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0153 }
    L_0x0153:
        r0 = move-exception;
        throw r0;
    L_0x0155:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.onResume():void");
    }

    static void w(VerifySms verifySms) {
        verifySms.t();
    }

    private boolean i(String str) {
        int i = App.az;
        if (str == null) {
            return false;
        }
        try {
            if (str.length() != K) {
                return false;
            }
            int i2 = 0;
            while (i2 < str.length()) {
                try {
                    if (Character.isDigit(str.charAt(i2))) {
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    return false;
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    private void e() {
        a(0);
    }

    static int d() {
        return B;
    }

    private void t() {
        try {
            v();
            Y = 13;
            x();
            e();
            if ("".equals(k)) {
                b(bb[0]);
            }
            H();
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void b(long j) {
        try {
            if (this.S != null) {
                this.S.cancel();
                this.S = null;
            }
            this.H.setEnabled(false);
            this.S = new afp(this, j, 1000).start();
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void x(VerifySms verifySms) {
        verifySms.m();
    }

    static {
        String[] strArr = new String[96];
        String str = "\u0000\"-\u0007\b\u0001j,\u0014\u0003\u0017j+\u0018\u0000\u0016(*\u0005";
        boolean z = true;
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
                        i3 = 115;
                        break;
                    case ay.f /*1*/:
                        i3 = 71;
                        break;
                    case ay.n /*2*/:
                        i3 = 95;
                        break;
                    case ay.p /*3*/:
                        i3 = 113;
                        break;
                    default:
                        i3 = 109;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q\"  \u0018\f4#'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0000*,";
                    z = true;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0002\u0000\u0000\u0018/\u0019\u0002\u001d\"\u0000\u001f\u0018\u001e%:\u0003";
                    z = true;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0002\u0000\u0000\u0018<\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0000&)\u0014\t\u0010(;\u0014B\u0000&)\u0014B\u0010(2\u001c\u0004\u0007g9\u0010\u0004\u001f\";";
                    z = true;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0002\u0000\u0000\u0018<\u001e\t\u0016";
                    z = true;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0001\",\u0004\u0000\u0016h(\u0010\u0004\u0007.1\u0016B\u0000\"-\u0007\b\u0001h-\u0014\u001e\u0006*:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0001\",\u0004\u0000\u0016h(\u0010\u0004\u0007.1\u0016B\u0000\"-\u0007\b\u0001h+\u0018\u0000\u0016#r\u001e\u0018\u0007j>\u001d\u001f\u0016&;\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0001\",\u0004\u0000\u0016h,\u0012\u0005\u0016*:^\u000e\u001c#:Q";
                    z = true;
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    strArr2 = strArr3;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0001\",\u0004\u0000\u0016g";
                    z = true;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0001\",\u0004\u0000\u0016h*\u001f\u0006\u001d((\u001f@\u00003>\u0005\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0007\b\u0001.9\u0018\u000e\u001236\u001e\u0003,4+\u0010\u0019\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0001\",\u0004\u0000\u0016h<\u0012M\u001c5\u007f\u001f\u0018\u001eg6\u0002M\u001e.,\u0002\u0004\u001d sQ\u000f\u001c21\u0012\bS30Q\u001f\u0016 /\u0019\u0002\u001d\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0010&1\u001f\u0002\u0007j,\u001c\u001e^ 0\\\u001b\u001c.<\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0005\"-\u0018\u000b\nj,\u001c\u001e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u00105:\u0010\u0019\u0016h;\u0018\u001e\u0003+>\b@\u0001(>\u001c\u0004\u001d ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "CvmBYFqhIT\u0012%<\u0015\b\u0015 7\u0018\u0007\u0018+2\u001f\u0002\u00036-\u0002\u0019\u00061(\t\u0014\t\u0006\u001d2)6\u0001\u00189$9\f\u0013<#<\u0017\u000e#>'\u0012\t&5*\u001d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0010$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u00105:\u0010\u0019\u0016h,\u0010\u001b\u0016#<\u001e\t\u0016g";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0004/>\u0005\u001e\u00127/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0012\u0005\u0012)8\u0014\u0003\u0006*=\u0014\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u00105:\u0010\u0019\u0016h<\u0012M\u001c5\u007f\u001f\u0018\u001eg6\u0002M\u001e.,\u0002\u0004\u001d sQ\u000f\u001c21\u0012\bS30Q\u001f\u0016 /\u0019\u0002\u001d\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0003/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0003\u0002\u0012*6\u001f\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u00105:\u0010\u0019\u0016h,\u0002\b\u001d#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u00105:\u0010\u0019\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037\u0000\u0001\u001f\u0016!:\u0003\b\u001d$:\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0002\b\u00011:\u0003\u001e\u0016);";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u00105:\u0010\u0019\u0016h<\u001e\t\u0016g";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q#\b\u0014.,\u0005\b\u0001\u00177\u001e\u0003\u0016i+\u0010\u001d\u0003\";.\u001e\u001e4\u0000\u001d\u0004\u001d,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0001\"+\u0003\u0004\u0016#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u000450\u001f\n^4+\u0010\u0019\u0016g=\u001e\u0018\u001d$:Q\u0019\u001cg2\u0010\u0004\u001dg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0000\"3\u0017@\u0000\"1\u0015@\u0000\"1\u0015@\u0015&6\u001d\u0018\u0001\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0010/>\u001d\u0001\u0016)8\u0014B\u0000\"1\u0005M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q\"  \u0018\f4#'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0010/>\u001d\u0001\u0016)8\u0014B\u0015&6\u001d\b\u0017j8\u001e@\u0007(r\u001f\b\u000b3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "DtkAY";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u0012);\u0003\u0002\u001a#q\u0001\u001f\u001c16\u0015\b\u0001i\u000b\u0014\u0001\u001677\u001e\u0003\ni\f<>,\u0015\u001a2(:\u0011\u001a5";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u001a)+\u0014\u0003\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q\u0007\b\u0001.9\b\u0003\u0006*=\u0014\u001f]#6\u0010\u0001\u001c ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u001a)+\u0014\u0003\u0007h;\u0014\u000b\u00165r\u0012\u0002\u0017\"p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u001a)+\u0014\u0003\u0007h*\u001f\u0006\u001d((\u001fM";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0017\",\u0005\u001f\u001c>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0005\"-\u0018\u000b\u001a$>\u0005\u0004\u001c)3\u0018\u0003\u0018h,\u001c\u001e\\4+\u0010\u0019\u0016g";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0005\"-\u0018\u000b\u001a$>\u0005\u0004\u001c)3\u0018\u0003\u0018h,\u0014\u0001\u0015h,\u0005\f\u0007\"\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0005\"-\u0018\u000b\u001a$>\u0005\u0004\u001c)3\u0018\u0003\u0018h)\u001e\u0004\u0010\"p\u0002\u0019\u00123:Q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0005\"-\u0018\u000b\u001a$>\u0005\u0004\u001c)3\u0018\u0003\u0018h)\u001e\u0004\u0010\"p\u0012\u0002\u0017\"r\u0014\u0003\u00075&\\\u000f\u001f(<\u001a\b\u0017j-\u0014\u0019\u0001>r\u001d\f\u0007\"-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u0007&/\u0001\b\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0007&/\u0001\b\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u0004/>\u0005\u001e\u00127/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0010(;\u0014\u000b\u0001(2\u0007\b\u0001.9\u0018\u000e\u001236\u001e\u0003\u001f.1\u001aB\u0010(;\u0014B";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0005\"-\u0018\u000b\u001a\";^\u000e\u001b&1\u0016\b\u001d22\u0013\b\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0005\"-\u0018\u000b\u001a\";^\u000e\u001b&1\u0016\b\u001d22\u0013\b\u0001h2\u0002\n\u000030\u0003\b\u0017%p\u0019\b\u0012++\u0019\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u001d\"+\u0006\u0002\u0001,p\u0010\u000e\u0007.)\u0014M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0010(1\u001f\b\u001036\u0007\u0004\u0007>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u001d\"+\u0006\u0002\u0001,p\u0002\u001a\u001a3<\u0019B\u001d(r\u0002\f\u0005\";\\\u000e\u001c#:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "S):\u0006P";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u001d\"+\u0006\u0002\u0001,p\u0002\u001a\u001a3<\u0019B\u001b&,\\\u001f\u00163-\b@\u0003\"1\u0015\u0004\u001d ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u001d\"+\u0006\u0002\u0001,p\u0002\u001a\u001a3<\u0019M\u001c+;L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0002\u0000\u0000\u0018/\u0019\u0002\u001d\"\u0000\u001f\u0018\u001e%:\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0002\u0000\u0000\u0018<\u001e\t\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0002\u0000\u0000\u0018<\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0002\u0000\u0000\u0018,\u0005\f\u00013\u0000\u0005\u0004\u001e\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0010(*\u001f\u0019\u0017((\u001f\u0019\u001a*:\u0003B\u0010(2\u001c\u0004\u0007g9\u0010\u0004\u001f\";";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0002\u0000\u0000\u0018,\u0005\f\u00013\u0000\u0005\u0004\u001e\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0012);\u0003\u0002\u001a#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u001b3+\u0001\u001eIhp\u0006\u001a\u0004i(\u0019\f\u00074>\u0001\u001d]$0\u001cB\u0015&.^\u0001\u001a)4^\u001b\u001656\u0017\u0004\u0010&+\u0018\u0002\u001di/\u0019\u001d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 69;
                    str = "\u0012);\u0003\u0002\u001a#q\u0018\u0003\u0007\"1\u0005C\u0012$+\u0018\u0002\u001di\t8($";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 70;
                    str = "\u0003+>\u0005\u000b\u001c52L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u001f$b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 72;
                    str = "\u001f b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 73;
                    str = "!\",\u0014\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 74;
                    str = "\u0005\"-\u0018\u000b\nj,\u001c\u001e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 75;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q#\b\u0014.,\u0005\b\u0001\u00177\u001e\u0003\u0016i<\u001d\b\u00125\u0000\u0001\u0005\u001c):.\u0003\u0006*=\u0014\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 76;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0007\b\u0001.9\u0018\u000e\u001236\u001e\u0003,4+\u0010\u0019\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 77;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0000&)\u0014\u001e\u0007&+\u0014B\u0010(2\u001c\u0004\u0007g9\u0010\u0004\u001f\";";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 78;
                    str = "S\u00107\u0010\u0019\u0000\u0006/\u0001M\u001a)+\u0014\u001f\u001d&3Q\u0018\u0000\"\u007f\\M\u0000&9\u0014M\u0007(\u007f\u0015\u0004\u0000$>\u0003\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 79;
                    str = "$/>\u0005\u001e27/Q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 80;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0006)4\u001f\u0002\u0004)r\u0002\u0019\u00123:Q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 81;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0000\"1\u0015B";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 82;
                    str = "\u001a)/\u0004\u0019,*:\u0005\u0005\u001c#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 83;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u001d22\u0013\b\u0001h6\u001f@\u000450\u001f\n^4+\u0010\u0019\u0016g=\u001e\u0018\u001d$:Q\u0019\u001cg-\u0014\n\u0003/0\u001f\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 84;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0002\u0000\u0000\u0018/\u0019\u0002\u001d\"\u0000\u001f\u0018\u001e%:\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 85;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0002\u0000\u0000\u0018<\u001e\t\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 86;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0000&)\u0014\t\u0010(;\u0014B\u0010+:\u0010\u001f\\$0\u001c\u0000\u001a3\u007f\u0017\f\u001a+:\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 87;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0002\u0000\u0000\u0018<\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u0005\"-\u0018\u000b\nj)\u001e\u0004\u0010\"k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 89;
                    str = "\u0010(2_\u001a\u001b&+\u0002\f\u00037q'\b\u0001.9\b>\u001e4q\u0007\b\u0001.9\u0018\u000e\u001236\u001e\u0003,4+\u0010\u0019\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0003&*\u0002\b\\$0\u001c\u0000\u001a3\u007f\u0017\f\u001a+:\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 91;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0003&*\u0002\bS";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 92;
                    str = "\u0005\"-\u0018\u000b\n42\u0002B\u0001\".\u0004\b\u00003r\u0002\u0000\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 93;
                    str = "\u0005\"-\u0018\u000b\n10\u0018\u000e\u0016h*\u001f\u0006\u001d((\u001f@\u00003>\u0005\bS";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 94;
                    str = "\u0005\"-\u0018\u000b\nj)\u001e\u0004\u0010\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 95;
                    str = "\u0005\"-\u0018\u000b\nj)\u001e\u0004\u0010\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    bb = strArr3;
                    try {
                        int i4;
                        if (App.aa == 3) {
                            i4 = 20000;
                        } else {
                            i4 = 300000;
                        }
                        af = i4;
                        B = 10;
                        Y = 0;
                        K = 6;
                        C = 6;
                        ah = null;
                        R = (long) af;
                        ae = 0;
                        M = null;
                        Q = null;
                        ai = null;
                        ad = null;
                        F = "";
                        aj = "";
                        X = null;
                        E = false;
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    }
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0012);\u0003\u0002\u001a#q\u0018\u0003\u0007\"1\u0005C\u0012$+\u0018\u0002\u001di\u001b092\u0018\f<>,\u0015\u001a2(:\u0011\u001a5";
                    z = false;
                    break;
            }
        }
    }

    static String G() {
        return F;
    }

    private String a(Intent intent) {
        if (!bb[51].equals(intent.getScheme())) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        try {
            if (!"r".equals(data.getHost())) {
                return null;
            }
            String queryParameter = data.getQueryParameter("c");
            Log.i(bb[52] + queryParameter);
            return queryParameter;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static long d(VerifySms verifySms, long j) {
        verifySms.u = j;
        return j;
    }

    static void u(VerifySms verifySms) {
        verifySms.n();
    }

    static boolean b(VerifySms verifySms, String str) {
        return verifySms.i(str);
    }

    static long f(VerifySms verifySms) {
        return verifySms.aa;
    }

    static boolean b(boolean z) {
        E = z;
        return z;
    }

    private void c(long j) {
        try {
            if (this.V != null) {
                this.V.cancel();
                this.V = null;
            }
            this.A.setEnabled(false);
            View findViewById = findViewById(R.id.code_input_blocked);
            findViewById.setVisibility(0);
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar_code_input_blocked);
            progressBar.setVisibility(0);
            this.V = new a3b(this, j, 1000, progressBar, j, findViewById).start();
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case PBE.MD5 /*0*/:
                    A();
                    return true;
                case ay.f /*1*/:
                    showDialog(32);
                    return true;
                case ay.n /*2*/:
                    App.i((Context) this);
                    finish();
                    return true;
                default:
                    return false;
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void o() {
        try {
            try {
                if (bb[38].equals(App.a3.getNetworkOperator())) {
                    P = (short) 0;
                    if (App.az == 0) {
                        return;
                    }
                }
                P = (short) (new Random().nextInt(100) + 16000);
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    private void d(String str) {
        a(str);
        m();
    }

    static Button z(VerifySms verifySms) {
        return verifySms.H;
    }

    private void a(boolean r6) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r5_this = this;
        r0 = 1;
        r1 = 0;
        r2 = com.whatsapp.App.az;
        r3 = r5.ab;
        r4 = r5.ag;
        com.whatsapp.App.a(r5, r3, r4);
        Y = r1;
        r5.x();
        r3 = r5.j;
        if (r3 == 0) goto L_0x0080;
    L_0x0014:
        r3 = bb;
        r4 = 53;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r3 = com.whatsapp.App.d(r5);
        r4 = com.whatsapp.App.p;	 Catch:{ ActivityNotFoundException -> 0x003a }
        r4 = com.whatsapp.App.a(r4);	 Catch:{ ActivityNotFoundException -> 0x003a }
        r3.jabber_id = r4;	 Catch:{ ActivityNotFoundException -> 0x003a }
        r4 = r3.jabber_id;	 Catch:{ ActivityNotFoundException -> 0x003a }
        if (r4 == 0) goto L_0x003c;
    L_0x002d:
        com.whatsapp.util.Log.b(r0);	 Catch:{ ActivityNotFoundException -> 0x003e }
        r0 = com.whatsapp.App.b(r3);	 Catch:{ ActivityNotFoundException -> 0x003e }
        if (r0 != 0) goto L_0x0040;	 Catch:{ ActivityNotFoundException -> 0x003e }
    L_0x0036:
        r5.finish();	 Catch:{ ActivityNotFoundException -> 0x003e }
    L_0x0039:
        return;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r0 = r1;
        goto L_0x002d;
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        com.whatsapp.App.an = r3;
        r0 = com.whatsapp.App.aJ;
        r0 = r0.e();
        if (r0 != 0) goto L_0x0060;
    L_0x004a:
        r1 = com.whatsapp.App.aJ;	 Catch:{ ActivityNotFoundException -> 0x00bd }
        r1 = r1.i();	 Catch:{ ActivityNotFoundException -> 0x00bd }
        if (r1 == 0) goto L_0x0060;	 Catch:{ ActivityNotFoundException -> 0x00bd }
    L_0x0052:
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x00bd }
        r3 = 54;	 Catch:{ ActivityNotFoundException -> 0x00bd }
        r1 = r1[r3];	 Catch:{ ActivityNotFoundException -> 0x00bd }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ActivityNotFoundException -> 0x00bd }
        r1 = com.whatsapp.App.aJ;	 Catch:{ ActivityNotFoundException -> 0x00bd }
        r1.j();	 Catch:{ ActivityNotFoundException -> 0x00bd }
    L_0x0060:
        r1 = r5.getApplication();	 Catch:{ ActivityNotFoundException -> 0x00bf }
        com.whatsapp.App.l(r1);	 Catch:{ ActivityNotFoundException -> 0x00bf }
        com.whatsapp.App.n();	 Catch:{ ActivityNotFoundException -> 0x00bf }
        r1 = com.whatsapp.App.p;	 Catch:{ ActivityNotFoundException -> 0x00bf }
        com.whatsapp.messaging.MessageService.a(r1);	 Catch:{ ActivityNotFoundException -> 0x00bf }
        if (r0 != 0) goto L_0x0079;	 Catch:{ ActivityNotFoundException -> 0x00bf }
    L_0x0071:
        com.whatsapp.App.D();	 Catch:{ ActivityNotFoundException -> 0x00bf }
        r0 = com.whatsapp.App.p;	 Catch:{ ActivityNotFoundException -> 0x00bf }
        r0.O();	 Catch:{ ActivityNotFoundException -> 0x00bf }
    L_0x0079:
        r0 = 3;
        com.whatsapp.App.d(r5, r0);
        com.whatsapp.ChangeNumber.b(r5);
    L_0x0080:
        r0 = r5.v;	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        r1 = 1;	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        r0.removeMessages(r1);	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        r5.I();	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        if (r6 == 0) goto L_0x0094;
    L_0x008b:
        r0 = r5.m;	 Catch:{ ActivityNotFoundException -> 0x00c3 }
        if (r0 == 0) goto L_0x0094;
    L_0x008f:
        r5.g();	 Catch:{ ActivityNotFoundException -> 0x00c5 }
        if (r2 == 0) goto L_0x00b8;	 Catch:{ ActivityNotFoundException -> 0x00c5 }
    L_0x0094:
        r0 = r5.j;	 Catch:{ ActivityNotFoundException -> 0x00c5 }
        if (r0 == 0) goto L_0x00aa;
    L_0x0098:
        com.whatsapp.App.aJ();
        com.whatsapp.a54.b();
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r5, r1);
        r5.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x00c7 }
        if (r2 == 0) goto L_0x00b8;	 Catch:{ ActivityNotFoundException -> 0x00c7 }
    L_0x00aa:
        r0 = 2;	 Catch:{ ActivityNotFoundException -> 0x00c7 }
        com.whatsapp.App.d(r5, r0);	 Catch:{ ActivityNotFoundException -> 0x00c7 }
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x00c7 }
        r1 = com.whatsapp.RegisterName.class;	 Catch:{ ActivityNotFoundException -> 0x00c7 }
        r0.<init>(r5, r1);	 Catch:{ ActivityNotFoundException -> 0x00c7 }
        r5.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x00c7 }
    L_0x00b8:
        r5.finish();
        goto L_0x0039;
    L_0x00bd:
        r0 = move-exception;
        throw r0;
    L_0x00bf:
        r0 = move-exception;
        throw r0;
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;
    L_0x00c7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.a(boolean):void");
    }
}
