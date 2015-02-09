package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.widget.EditText;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.App.Me;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.protocol.cd;
import com.whatsapp.protocol.cs;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ChangeNumber extends EnterPhoneNumber {
    private static String A;
    public static Runnable B;
    public static cd C;
    private static String E;
    private static String G;
    private static Handler H;
    private static final String[] M;
    private afi D;
    private Runnable F;
    private cd I;
    private cs J;
    private Runnable K;
    private Handler L;

    static Handler c() {
        return H;
    }

    public static void b(Context context) {
        App.i();
        App.ai();
        bd.a(true);
        m8 d = App.P.d();
        d.v();
        d.a(0, 0);
        App.aY = false;
        MessageService.a(context, true);
    }

    protected void onDestroy() {
        Log.i(M[25]);
        super.onDestroy();
    }

    static afi a(ChangeNumber changeNumber) {
        return changeNumber.D;
    }

    static String b() {
        return A;
    }

    static void e(ChangeNumber changeNumber) {
        changeNumber.i();
    }

    public static long e(Context context) {
        return context.getSharedPreferences(M[31], 0).getLong(M[32], -1);
    }

    public static void a(Context context, String str, String str2) {
        Editor edit = context.getSharedPreferences(M[10], 0).edit();
        try {
            edit.putString(M[11], str + " " + str2);
            if (!edit.commit()) {
                Log.e(M[12]);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static Handler c(ChangeNumber changeNumber) {
        return changeNumber.L;
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        G = bundle.getString(M[9]);
        A = bundle.getString(M[6]);
        u = bundle.getString(M[7]);
        x = bundle.getString(M[8]);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case 16908332:
                    finish();
                    return true;
                default:
                    return false;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public ChangeNumber() {
        this.K = new akr(this);
        this.F = new j7(this);
        this.L = new a8d(this);
        this.J = new rl(this);
        this.I = new ei(this);
    }

    static void a(ChangeNumber changeNumber, String str, afi com_whatsapp_afi) {
        changeNumber.a(str, com_whatsapp_afi);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
        r3_this = this;
        super.onPause();
        r0 = M;
        r1 = 22;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r3.D;
        r1 = r3.D;
        r1 = r1.c;
        r1 = com.whatsapp.RegisterPhone.a(r1);
        r0.d = r1;
        r0 = r3.D;
        r1 = r3.D;
        r1 = r1.e;
        r1 = com.whatsapp.RegisterPhone.a(r1);
        r0.h = r1;
        r0 = r3.r;
        r1 = r3.r;
        r1 = r1.c;
        r1 = com.whatsapp.RegisterPhone.a(r1);
        r0.d = r1;
        r0 = r3.r;
        r1 = r3.r;
        r1 = r1.e;
        r1 = com.whatsapp.RegisterPhone.a(r1);
        r0.h = r1;
        r0 = c(r3);
        r1 = r3.z;	 Catch:{ NullPointerException -> 0x0055 }
        if (r1 == 0) goto L_0x004f;
    L_0x0044:
        r1 = u;	 Catch:{ NullPointerException -> 0x0057 }
        r2 = x;	 Catch:{ NullPointerException -> 0x0057 }
        a(r3, r1, r2);	 Catch:{ NullPointerException -> 0x0057 }
        r1 = com.whatsapp.App.az;	 Catch:{ NullPointerException -> 0x0057 }
        if (r1 == 0) goto L_0x0054;
    L_0x004f:
        if (r0 == 0) goto L_0x0054;
    L_0x0051:
        d(r3);	 Catch:{ NullPointerException -> 0x0059 }
    L_0x0054:
        return;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ChangeNumber.onPause():void");
    }

    public static void a(Context context) {
        Editor edit = context.getSharedPreferences(M[34], 0).edit();
        try {
            edit.remove(M[35]);
            if (!edit.commit()) {
                Log.e(M[33]);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static void a(Context context, long j) {
        Editor edit = context.getSharedPreferences(M[37], 0).edit();
        try {
            edit.putLong(M[38], j);
            if (!edit.commit()) {
                Log.e(M[36]);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static boolean a(ChangeNumber changeNumber, String str, String str2, afi com_whatsapp_afi) {
        return changeNumber.a(str, str2, com_whatsapp_afi);
    }

    public static boolean g() {
        try {
            return App.aq() != null;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case ay.f /*1*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.register_connecting));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case ay.n /*2*/:
                return new Builder(this).setMessage(R.string.change_number_new_country_code_suggestion).setNeutralButton(R.string.btn_continue, new nm(this)).create();
            case 109:
                return new Builder(this).setMessage(R.string.register_try_again_later).setPositiveButton(R.string.check_system_status, new k2(this)).setNeutralButton(R.string.cancel, new akc(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    private void i() {
        t = null;
        s = 0;
        a(false);
        App.a(App.p, d(t));
        String k = App.k(u + x);
        byte[] g = a54.g(k);
        if (g == null) {
            g = a54.e();
            a54.c(g, k);
        }
        a(App.p, ac.c);
        a5w.a(new vo(this, this.K, this.F), new Object[]{u.getBytes(), x.getBytes(), g});
    }

    private void a(String str, afi com_whatsapp_afi) {
        try {
            Log.i(M[40] + str + M[43] + ats.b(str));
        } catch (IOException e) {
            Log.e(M[44] + str + M[42] + e.toString());
        }
        try {
            if (com_whatsapp_afi.b != null) {
                com_whatsapp_afi.c.removeTextChangedListener(com_whatsapp_afi.b);
            }
            com_whatsapp_afi.b = new a5_(ats.b(str));
            com_whatsapp_afi.c.addTextChangedListener(com_whatsapp_afi.b);
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable e3) {
            Log.b(M[39], e3);
        } catch (Throwable e32) {
            Log.b(M[41] + str + M[45], e32);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r7, java.lang.String r8, com.whatsapp.afi r9) {
        /*
        r6_this = this;
        r0 = 1;
        r1 = 0;
        r2 = com.whatsapp.App.az;
        r3 = com.whatsapp.RegisterPhone.a(r7, r8);
        switch(r3) {
            case 1: goto L_0x004e;
            case 2: goto L_0x00f0;
            case 3: goto L_0x00ed;
            case 4: goto L_0x00eb;
            case 5: goto L_0x00e9;
            case 6: goto L_0x00e7;
            case 7: goto L_0x00e5;
            default: goto L_0x000b;
        };
    L_0x000b:
        if (r1 == 0) goto L_0x004d;
    L_0x000d:
        r2 = java.lang.Integer.parseInt(r7);
        r0 = M;
        r3 = 28;
        r0 = r0[r3];
        r3 = "";
        r0 = r8.replaceAll(r0, r3);
        r0 = com.whatsapp.ats.a(r2, r0);	 Catch:{ IOException -> 0x00d6 }
    L_0x0021:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = M;
        r4 = 27;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r7);
        r3 = M;
        r4 = 29;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        u = r7;
        x = r0;
    L_0x004d:
        return r1;
    L_0x004e:
        if (r2 == 0) goto L_0x00e2;
    L_0x0050:
        r1 = 2131624718; // 0x7f0e030e float:1.8876624E38 double:1.053162543E-314;
        r6.a(r1);	 Catch:{ IOException -> 0x00ca }
        r1 = r9.e;	 Catch:{ IOException -> 0x00ca }
        r1.requestFocus();	 Catch:{ IOException -> 0x00ca }
        if (r2 == 0) goto L_0x00e2;
    L_0x005d:
        r1 = 2131624719; // 0x7f0e030f float:1.8876626E38 double:1.0531625435E-314;
        r6.a(r1);	 Catch:{ IOException -> 0x00cc }
        r1 = r9.e;	 Catch:{ IOException -> 0x00cc }
        r3 = "";
        r1.setText(r3);	 Catch:{ IOException -> 0x00cc }
        r1 = r9.e;	 Catch:{ IOException -> 0x00cc }
        r1.requestFocus();	 Catch:{ IOException -> 0x00cc }
        if (r2 == 0) goto L_0x00e2;
    L_0x0071:
        r1 = 2131624731; // 0x7f0e031b float:1.887665E38 double:1.0531625494E-314;
        r6.a(r1);	 Catch:{ IOException -> 0x00ce }
        r1 = r9.c;	 Catch:{ IOException -> 0x00ce }
        r1.requestFocus();	 Catch:{ IOException -> 0x00ce }
        if (r2 == 0) goto L_0x00e2;
    L_0x007e:
        r1 = 2131624723; // 0x7f0e0313 float:1.8876634E38 double:1.0531625455E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IOException -> 0x00d0 }
        r4 = 0;
        r5 = r9.a;	 Catch:{ IOException -> 0x00d0 }
        r3[r4] = r5;	 Catch:{ IOException -> 0x00d0 }
        r1 = r6.getString(r1, r3);	 Catch:{ IOException -> 0x00d0 }
        r6.f(r1);	 Catch:{ IOException -> 0x00d0 }
        r1 = r9.c;	 Catch:{ IOException -> 0x00d0 }
        r1.requestFocus();	 Catch:{ IOException -> 0x00d0 }
        if (r2 == 0) goto L_0x00e2;
    L_0x0097:
        r1 = 2131624722; // 0x7f0e0312 float:1.8876632E38 double:1.053162545E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IOException -> 0x00d2 }
        r4 = 0;
        r5 = r9.a;	 Catch:{ IOException -> 0x00d2 }
        r3[r4] = r5;	 Catch:{ IOException -> 0x00d2 }
        r1 = r6.getString(r1, r3);	 Catch:{ IOException -> 0x00d2 }
        r6.f(r1);	 Catch:{ IOException -> 0x00d2 }
        r1 = r9.c;	 Catch:{ IOException -> 0x00d2 }
        r1.requestFocus();	 Catch:{ IOException -> 0x00d2 }
        if (r2 == 0) goto L_0x00e2;
    L_0x00b0:
        r1 = 2131624721; // 0x7f0e0311 float:1.887663E38 double:1.0531625445E-314;
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ IOException -> 0x00d4 }
        r3 = 0;
        r4 = r9.a;	 Catch:{ IOException -> 0x00d4 }
        r2[r3] = r4;	 Catch:{ IOException -> 0x00d4 }
        r1 = r6.getString(r1, r2);	 Catch:{ IOException -> 0x00d4 }
        r6.f(r1);	 Catch:{ IOException -> 0x00d4 }
        r1 = r9.c;	 Catch:{ IOException -> 0x00d4 }
        r1.requestFocus();	 Catch:{ IOException -> 0x00d4 }
        r1 = r0;
        goto L_0x000b;
    L_0x00ca:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00cc }
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00ce }
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d2 }
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;
    L_0x00d6:
        r2 = move-exception;
        r3 = M;
        r4 = 30;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x0021;
    L_0x00e2:
        r1 = r0;
        goto L_0x000b;
    L_0x00e5:
        r0 = r1;
        goto L_0x00b0;
    L_0x00e7:
        r0 = r1;
        goto L_0x0097;
    L_0x00e9:
        r0 = r1;
        goto L_0x007e;
    L_0x00eb:
        r0 = r1;
        goto L_0x0071;
    L_0x00ed:
        r0 = r1;
        goto L_0x005d;
    L_0x00f0:
        r0 = r1;
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ChangeNumber.a(java.lang.String, java.lang.String, com.whatsapp.afi):boolean");
    }

    public static void d(Context context) {
        Editor edit = context.getSharedPreferences(M[14], 0).edit();
        try {
            edit.remove(M[15]);
            if (!edit.commit()) {
                Log.e(M[13]);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static cs b(ChangeNumber changeNumber) {
        return changeNumber.J;
    }

    static String e(String str) {
        G = str;
        return str;
    }

    static cd d(ChangeNumber changeNumber) {
        return changeNumber.I;
    }

    public static void a(Activity activity) {
        Log.i(M[24]);
        Me aq = App.aq();
        try {
            if (App.b(aq)) {
                App.an = aq;
                try {
                    a54.a(a54.e(aq.jabber_id), aq.jabber_id);
                    a54.m();
                    App.ao();
                    a(App.p);
                    if (App.aJ.i()) {
                        Log.i(M[23]);
                        App.aJ.j();
                        App.l(App.p);
                        MessageService.a(App.p);
                        App.D();
                        App.p.O();
                        if (App.az == 0) {
                            return;
                        }
                    }
                    MessageService.a(App.p);
                    return;
                } catch (NullPointerException e) {
                    throw e;
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
            activity.finish();
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    static String b(String str) {
        A = str;
        return str;
    }

    static String c(String str) {
        E = str;
        return str;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(M[18], G);
        bundle.putCharSequence(M[19], A);
        bundle.putCharSequence(M[21], u);
        bundle.putCharSequence(M[20], x);
    }

    protected void onCreate(Bundle bundle) {
        Log.i(M[0]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        setContentView(b7.a(getLayoutInflater(), R.layout.change_number, null, false, new int[]{2131427580, 2131427584}));
        this.D = new afi();
        this.r = new afi();
        this.D.e = (EditText) findViewById(R.id.registration_cc);
        this.r.e = (EditText) findViewById(R.id.registration_new_cc);
        this.D.c = (EditText) findViewById(R.id.registration_phone);
        this.r.c = (EditText) findViewById(R.id.registration_new_phone);
        this.D.e.setFilters(new InputFilter[]{new LengthFilter(3)});
        this.D.c.setFilters(new InputFilter[]{new LengthFilter(17)});
        String networkCountryIso = App.a3.getNetworkCountryIso();
        if (networkCountryIso != null) {
            try {
                G = ats.e(networkCountryIso);
            } catch (IOException e) {
                Log.e(M[5]);
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        try {
            this.D.e.addTextChangedListener(new anv(this, this.D));
            this.r.e.addTextChangedListener(new anv(this, this.r));
            this.D.c.requestFocus();
            this.D.d = RegisterPhone.a(this.D.c);
            this.D.h = RegisterPhone.a(this.D.e);
            this.r.d = RegisterPhone.a(this.r.c);
            this.r.h = RegisterPhone.a(this.r.e);
            bp.a(this, getSupportActionBar(), getString(R.string.done).toUpperCase(), new qz(this));
            if (G != null) {
                this.D.e.setText(G);
                this.r.e.setText(G);
            }
            String str = this.D.a;
            if (str != null) {
                try {
                    if (str.length() > 0) {
                        try {
                            Log.i(M[2] + str + M[1] + ats.b(str));
                        } catch (Throwable e3) {
                            Log.b(M[3] + str + M[4], e3);
                        }
                        a(str, this.D);
                        a(str, this.r);
                    }
                } catch (IOException e4) {
                    throw e4;
                } catch (NullPointerException e22) {
                    throw e22;
                }
            }
            try {
                boolean z;
                if (c((Context) this) != null) {
                    z = true;
                } else {
                    z = false;
                }
                this.z = z;
                this.v = c();
            } catch (IOException e42) {
                throw e42;
            }
        } catch (IOException e422) {
            throw e422;
        }
    }

    static {
        String[] strArr = new String[46];
        String str = "\tsz\"t\u000fun!q\u000fi4/a\u000fzo)";
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
                        i3 = 106;
                        break;
                    case ay.f /*1*/:
                        i3 = 27;
                        break;
                    case ay.n /*2*/:
                        i3 = 27;
                        break;
                    case ay.p /*3*/:
                        i3 = 76;
                        break;
                    default:
                        i3 = 19;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\tsz\"t\u000fun!q\u000fi4/|\u001fuo>jP";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\tsz\"t\u000fun!q\u000fi4/|\u001fuo>jP";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "J}z%\u007f\u000f\u007f;\u000f|\u001fuo>j:st\"v#u}#=\u0006tt'f\u001aXt9}\u001eib\rq\biY5]\u000bv~d:";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\tsz\"t\u000fun!q\u000fi4%`\u00054x#w\u000f;}-z\u0006~\u007flg\u0005;|)gJxt(vJ}i#~JXt9}\u001eib\u001c{\u0005u~\u0005}\ft";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001ast\"v5un!q\u000fi";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0019Xt9}\u001eib\u000f|\u000e~";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0019Ks#}\u000fUn!q\u000fi";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\ttn\"g\u0018bD/|\u000e~";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\ttvbd\u0002zo?r\u001akD<a\u000f}~>v\u0004x~?";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\tsz\"t\u000fDu9~\b~i\u0013}\u000flD\"f\u0007y~>L\bzu\"v\u000e";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\tsz\"t\u000fun!q\u000fi4.<\u0019~ocu\u000brw)w";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\tsz\"t\u000fun!q\u000fi4.<\u0018~v#e\u000f4}-z\u0006~\u007f";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\ttvbd\u0002zo?r\u001akD<a\u000f}~>v\u0004x~?";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\tsz\"t\u000fDu9~\b~i\u0013}\u000flD\"f\u0007y~>L\bzu\"v\u000e";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\ttvbd\u0002zo?r\u001akD<a\u000f}~>v\u0004x~?";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\tsz\"t\u000fDu9~\b~i\u0013}\u000flD\"f\u0007y~>L\bzu\"v\u000e";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\ttn\"g\u0018bD/|\u000e~";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    str = "\u001ast\"v5un!q\u000fi";
                    obj = 18;
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    strArr2 = strArr3;
                    str = "\u0019Ks#}\u000fUn!q\u000fi";
                    obj = 19;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0019Xt9}\u001eib\u000f|\u000e~";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\tsz\"t\u000fun!q\u000fi4<r\u001fh~";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\tsz\"t\u000fun!q\u000fi4>v\u001c~i8<\u0007h|?g\u0005i~(qEs~-\u007f\u001esb";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\tsz\"t\u000fun!q\u000fi4>v\u001c~i8>\u001et6#\u007f\u000e";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\tsz\"t\u000fun!q\u000fi4<{\u0005u~c|\u0004_~?g\u0018tbd:";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\tsz\"t\u000fun!q\u000fi4<{\u0005u~ca\u000fhn!v";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    str = "\tsz\"t\u000fun!q\u000fi4/pW";
                    obj = 26;
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    strArr2 = strArr3;
                    str = "6_";
                    obj = 27;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "Eun!q\u000fi&";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\tsz\"t\u000fun!q\u000fi4/pJ}z%\u007f\u000f\u007f;8a\u0003vW)r\u000eru+I\u000fitlu\u0018tvlP\u0005nu8a\u0013Ks#}\u000fRu*|";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\ttvbd\u0002zo?r\u001akD<a\u000f}~>v\u0004x~?";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\tsz\"t\u000fDu9~\b~i\u0013|\u0006\u007fD)k\u001ari-g\u0003tu";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\tsz\"t\u000fun!q\u000fi4(v\u0006~o)|\u0006\u007f~4c\u0003iz8z\u0005u4*r\u0003w~(";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\ttvbd\u0002zo?r\u001akD<a\u000f}~>v\u0004x~?";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\tsz\"t\u000fDu9~\b~i\u0013|\u0006\u007fD)k\u001ari-g\u0003tu";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\tsz\"t\u000fun!q\u000fi4?v\u001etw(v\u0012kr>r\u001ert\"<\fzr v\u000e";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\ttvbd\u0002zo?r\u001akD<a\u000f}~>v\u0004x~?";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\tsz\"t\u000fDu9~\b~i\u0013|\u0006\u007fD)k\u001ari-g\u0003tu";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\tsz\"t\u000fun!q\u000fi4*|\u0018vz8g\u000fi6)k\t~k8z\u0005u";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\tsz\"t\u000fun!q\u000fi4/|\u001fuo>jP";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\tsz\"t\u000fun!q\u000fi4/|\u001fuo>jP";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\fzr v\u000e;o#3\u0006tt'f\u001aXt9}\u001eib\rq\biY5]\u000bv~lu\u0018tvlP\u0005nu8a\u0013Ks#}\u000fRu*|J";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "Jg;";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\tsz\"t\u000fun!q\u000fi4/|\u001fuo>jP;";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "Jxz9`\u000f\u007f;-}JRT\tk\t~k8z\u0005u";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    M = strArr3;
                    G = null;
                    A = null;
                    E = null;
                    H = new ali();
                    B = new an1();
                    C = new yv();
                default:
                    strArr2[i] = str;
                    str = "Jg;";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void b(boolean z) {
        try {
            App.a((Context) this, u, x);
            if (z) {
                if (this.m) {
                    g();
                }
            }
            Me d = App.d((Context) this);
            try {
                boolean z2;
                d.jabber_id = App.a(App.p);
                if (d.jabber_id != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                try {
                    Log.b(z2);
                    if (App.b(d)) {
                        App.an = d;
                        App.l(getApplication());
                        App.n();
                        MessageService.a(App.p);
                        App.aJ();
                        App.d((Context) this, 3);
                        a54.b();
                        b((Context) this);
                        finish();
                        return;
                    }
                    finish();
                } catch (NullPointerException e) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                throw e2;
            }
        } catch (NullPointerException e22) {
            throw e22;
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    static String h() {
        return E;
    }

    public void onResume() {
        try {
            super.onResume();
            if (G != null) {
                this.D.e.setText(G);
            }
            RegisterPhone.b(this.D.e, this.D.h);
            RegisterPhone.b(this.D.c, this.D.d);
            RegisterPhone.b(this.r.e, this.r.h);
            RegisterPhone.b(this.r.c, this.r.d);
            Log.i(M[26]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static String a() {
        return G;
    }

    public static String c(Context context) {
        return context.getSharedPreferences(M[16], 0).getString(M[17], null);
    }
}
