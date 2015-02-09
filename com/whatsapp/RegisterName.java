package com.whatsapp;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.provider.ContactsContract.Profile;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import java.util.Collection;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class RegisterName extends VerifyMessageStoreActivity implements anq {
    private static final String[] A;
    private static long o;
    private static k5 v;
    private Handler k;
    private ImageView l;
    private TextView m;
    private View n;
    private View p;
    private lt q;
    private OnTouchListener r;
    private a11 s;
    private m8 t;
    private EditText u;
    private Bitmap w;
    private Handler x;
    private lv y;
    private tf z;

    private void m() {
        Log.i(A[43]);
        String a = a5.a(((EditText) findViewById(R.id.registration_name)).getText().toString().trim());
        if (a.length() == 0) {
            Log.w(A[42]);
            App.b((Context) this, (int) R.string.register_failure_noname, 0);
            if (App.az == 0) {
                return;
            }
        }
        if (v == null || k5.c(v)) {
            ((App) getApplication()).x(a);
            App.d(a);
            App.d((Context) this, false);
            v = new k5(this, this.x);
            if (App.at()) {
                showDialog(0);
            }
            if (((CheckBox) findViewById(R.id.cbx_app_shortcut)).isChecked()) {
                a((Context) this, getString(R.string.app_name));
            }
            if (this.p != null) {
                this.p.setVisibility(8);
            }
            f();
            this.k.sendEmptyMessageDelayed(0, o);
        }
    }

    static lv b(RegisterName registerName) {
        return registerName.y;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(A[41]);
        App.a(true, false);
        App.a((anq) this);
    }

    public void a(String str) {
    }

    public void c(String str) {
    }

    public void a() {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case PBE.MD5 /*0*/:
                e(A[40]);
                return true;
            case ay.f /*1*/:
                App.i((Context) this);
                finish();
                return true;
            default:
                return false;
        }
    }

    static k5 a(k5 k5Var) {
        v = k5Var;
        return k5Var;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.y != null) {
            this.y.a();
            this.y.b();
            n();
        }
        if (this.q != null) {
            this.q.a();
        }
        this.s.a(configuration);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r5, java.lang.String r6, int r7) {
        /*
        if (r7 != 0) goto L_0x0024;
    L_0x0002:
        r0 = new android.content.Intent;
        r0.<init>();
        r1 = A;
        r2 = 20;
        r1 = r1[r2];
        r2 = A;
        r3 = 22;
        r2 = r2[r3];
        r0.setClassName(r1, r2);
        r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0.addFlags(r1);
        r1 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        r0.addFlags(r1);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0028;
    L_0x0024:
        r0 = i();
    L_0x0028:
        r1 = new android.content.Intent;
        r1.<init>();
        r2 = A;	 Catch:{ URISyntaxException -> 0x0056 }
        r3 = 23;
        r2 = r2[r3];	 Catch:{ URISyntaxException -> 0x0056 }
        r3 = 0;
        r0 = r0.toUri(r3);	 Catch:{ URISyntaxException -> 0x0056 }
        r3 = 0;
        r0 = android.content.Intent.parseUri(r0, r3);	 Catch:{ URISyntaxException -> 0x0056 }
        r1.putExtra(r2, r0);	 Catch:{ URISyntaxException -> 0x0056 }
    L_0x0040:
        r0 = A;
        r2 = 24;
        r0 = r0[r2];
        r1.putExtra(r0, r6);
        r0 = A;
        r2 = 25;
        r0 = r0[r2];
        r1.setAction(r0);
        r5.sendBroadcast(r1);
        return;
    L_0x0056:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = A;
        r4 = 21;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r0.getMessage();
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterName.a(android.content.Context, java.lang.String, int):void");
    }

    static void i(RegisterName registerName) {
        registerName.g();
    }

    public void d(String str) {
        if (this.t != null && str.equals(this.t.e)) {
            j();
        }
    }

    private String p() {
        Exception e;
        String string;
        AccountManager accountManager;
        Account[] accounts;
        int length;
        int i;
        Account account;
        String str = null;
        int i2 = App.az;
        if (VERSION.SDK_INT >= 14) {
            Cursor query;
            try {
                query = getContentResolver().query(Profile.CONTENT_URI, new String[]{A[39]}, null, null, null);
            } catch (Exception e2) {
                throw e2;
            } catch (Exception e3) {
                e2 = e3;
            }
            if (query != null) {
                if (query.moveToFirst()) {
                    string = query.getString(0);
                } else {
                    string = null;
                }
                try {
                    query.close();
                } catch (Exception e4) {
                    str = string;
                    e2 = e4;
                    Log.e(A[38] + e2.toString());
                    string = str;
                    if (string == null) {
                        accountManager = AccountManager.get(App.p.getApplicationContext());
                        if (accountManager != null) {
                            accounts = accountManager.getAccounts();
                            if (accounts != null) {
                                length = accounts.length;
                                i = 0;
                                while (i < length) {
                                    account = accounts[i];
                                    try {
                                        if (account.type.equals(A[37])) {
                                            if (account.name.contains("@")) {
                                                string = account.name.substring(0, account.name.indexOf("@")).replace('.', ' ');
                                                if (i2 == 0) {
                                                    break;
                                                }
                                            }
                                            string = account.name.replace('.', ' ');
                                            if (i2 == 0) {
                                                break;
                                            }
                                        }
                                        i++;
                                        if (i2 != 0) {
                                            break;
                                        }
                                    } catch (Exception e22) {
                                        throw e22;
                                    }
                                }
                            }
                        }
                    }
                    return string;
                }
                if (string == null) {
                    accountManager = AccountManager.get(App.p.getApplicationContext());
                    if (accountManager != null) {
                        accounts = accountManager.getAccounts();
                        if (accounts != null) {
                            length = accounts.length;
                            i = 0;
                            while (i < length) {
                                account = accounts[i];
                                if (account.type.equals(A[37])) {
                                    if (account.name.contains("@")) {
                                        string = account.name.substring(0, account.name.indexOf("@")).replace('.', ' ');
                                        if (i2 == 0) {
                                            break;
                                        }
                                    }
                                    string = account.name.replace('.', ' ');
                                    if (i2 == 0) {
                                        break;
                                    }
                                }
                                i++;
                                if (i2 != 0) {
                                    break;
                                }
                            }
                        }
                    }
                }
                return string;
            }
        }
        string = null;
        if (string == null) {
            accountManager = AccountManager.get(App.p.getApplicationContext());
            if (accountManager != null) {
                accounts = accountManager.getAccounts();
                if (accounts != null) {
                    length = accounts.length;
                    i = 0;
                    while (i < length) {
                        account = accounts[i];
                        if (account.type.equals(A[37])) {
                            if (account.name.contains("@")) {
                                string = account.name.substring(0, account.name.indexOf("@")).replace('.', ' ');
                                if (i2 == 0) {
                                    break;
                                }
                            }
                            string = account.name.replace('.', ' ');
                            if (i2 == 0) {
                                break;
                            }
                        }
                        i++;
                        if (i2 != 0) {
                            break;
                        }
                    }
                }
            }
        }
        return string;
    }

    protected void a(boolean z) {
        super.a(z);
        if (this.q != null && z) {
            this.q.a(1);
        }
    }

    private void g() {
        Editor edit = getSharedPreferences(A[17], 0).edit();
        edit.remove(A[16]);
        if (!edit.commit()) {
            Log.w(A[15]);
        }
    }

    static void f(RegisterName registerName) {
        registerName.n();
    }

    static a11 h(RegisterName registerName) {
        return registerName.s;
    }

    public RegisterName() {
        this.x = new dr(this);
        this.k = new a_d(this);
        this.z = new xu(this);
        this.r = new a5q(this);
    }

    public void a(Collection collection) {
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                Log.i(A[7]);
                Dialog l = l();
                if (v != null) {
                    return l;
                }
                Log.w(A[10]);
                new Handler().postDelayed(new o_(this), 3);
                return l;
            case ay.f /*1*/:
                Log.w(A[11]);
                return new Builder(this).setTitle(R.string.initialization_fail_title).setMessage(getString(R.string.initialization_fail_message, new Object[]{getString(R.string.connectivity_self_help_instructions)})).setPositiveButton(R.string.initialization_fail_retry, new in(this)).create();
            case 103:
                Log.i(A[9]);
                return k();
            case 109:
                Log.w(A[8]);
                return new Builder(this).setMessage(R.string.register_try_again_later).setPositiveButton(R.string.check_system_status, new hw(this)).setNeutralButton(R.string.cancel, new xb(this)).setOnCancelListener(new w6(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    static Handler g(RegisterName registerName) {
        return registerName.k;
    }

    static m8 c(RegisterName registerName) {
        return registerName.t;
    }

    private long h() {
        return getSharedPreferences(A[1], 0).getLong(A[0], -1);
    }

    static EditText a(RegisterName registerName) {
        return registerName.u;
    }

    static void k(RegisterName registerName) {
        registerName.m();
    }

    static TextView d(RegisterName registerName) {
        return registerName.m;
    }

    private void f() {
        Editor edit = getSharedPreferences(A[13], 0).edit();
        edit.putLong(A[14], System.currentTimeMillis());
        if (!edit.commit()) {
            Log.w(A[12]);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void d() {
        /*
        r7_this = this;
        r6 = 2;
        r5 = 1;
        r4 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r7.getIntent();
        r0 = r0.getExtras();
        if (r0 == 0) goto L_0x0023;
    L_0x000f:
        r0 = r7.getIntent();
        r2 = A;
        r3 = 52;
        r2 = r2[r3];
        r0 = r0.getBooleanExtra(r2, r4);
        if (r0 == 0) goto L_0x0023;
    L_0x001f:
        r0 = com.whatsapp.App.an;
        if (r1 == 0) goto L_0x0027;
    L_0x0023:
        r0 = com.whatsapp.App.d(r7);
    L_0x0027:
        r2 = com.whatsapp.App.p;
        r2 = com.whatsapp.App.a(r2);
        r0.jabber_id = r2;
        r2 = r0.jabber_id;
        if (r2 != 0) goto L_0x004d;
    L_0x0033:
        r0 = A;
        r1 = 53;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        com.whatsapp.App.d(r7, r5);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.RegisterPhone.class;
        r0.<init>(r7, r1);
        r7.startActivity(r0);
        r7.finish();
    L_0x004c:
        return;
    L_0x004d:
        r2 = com.whatsapp.App.b(r0);
        if (r2 != 0) goto L_0x0057;
    L_0x0053:
        r7.finish();
        goto L_0x004c;
    L_0x0057:
        com.whatsapp.App.an = r0;
        com.whatsapp.ProfilePhotoReminder.m = r5;
        r0 = A;
        r2 = 49;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        com.whatsapp.App.a7 = r4;
        r0 = r7.getApplication();
        com.whatsapp.App.l(r0);
        com.whatsapp.App.n();
        r0 = com.whatsapp.App.p;
        com.whatsapp.messaging.MessageService.a(r0);
        r0 = A;
        r2 = 51;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        com.whatsapp.App.an();
        r0 = com.whatsapp.App.P;
        r0 = r0.d();
        r7.t = r0;
        r0 = r7.t;
        r0 = r0.e;
        com.whatsapp.App.a(r0, r4, r6);
        r7.j();
        r0 = r7.n;
        r0.setVisibility(r4);
        r0 = r7.q;
        if (r0 == 0) goto L_0x004c;
    L_0x009c:
        r0 = com.whatsapp.App.aJ;
        r0 = r0.o();
        if (r0 == 0) goto L_0x00b4;
    L_0x00a4:
        r0 = A;
        r2 = 50;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r7.q;
        r0.a(r6);
        if (r1 == 0) goto L_0x004c;
    L_0x00b4:
        r0 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r7.removeDialog(r0);
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterName.d():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r10) {
        /*
        r9_this = this;
        r8 = 25;
        r7 = 2;
        r4 = 8;
        r6 = 0;
        r5 = 1;
        r1 = com.whatsapp.App.az;
        r0 = A;
        r2 = 36;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r10);
        r0 = r9.getSupportActionBar();
        r0.setDisplayShowCustomEnabled(r5);
        r0 = 2130903195; // 0x7f03009b float:1.7413201E38 double:1.0528060633E-314;
        r9.setContentView(r0);
        r0 = com.whatsapp.App.e(r9);
        if (r0 == r7) goto L_0x004d;
    L_0x0028:
        r2 = 3;
        if (r0 != r2) goto L_0x0036;
    L_0x002b:
        r0 = A;
        r2 = 27;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        if (r1 == 0) goto L_0x003f;
    L_0x0036:
        r0 = A;
        r1 = 29;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x003f:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r9, r1);
        r9.startActivity(r0);
        r9.finish();
    L_0x004c:
        return;
    L_0x004d:
        r0 = com.whatsapp.App.p;
        r0 = com.whatsapp.App.a(r0);
        if (r0 != 0) goto L_0x006f;
    L_0x0055:
        r0 = A;
        r1 = 32;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        com.whatsapp.App.d(r9, r5);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.RegisterPhone.class;
        r0.<init>(r9, r1);
        r9.startActivity(r0);
        r9.finish();
        goto L_0x004c;
    L_0x006f:
        r0 = r9.getSupportActionBar();
        r2 = 2131624609; // 0x7f0e02a1 float:1.8876403E38 double:1.053162489E-314;
        r2 = r9.getString(r2);
        r3 = new com.whatsapp.fi;
        r3.<init>(r9);
        com.whatsapp.bp.a(r9, r0, r2, r3);
        r0 = com.whatsapp.App.G;
        if (r0 == 0) goto L_0x0094;
    L_0x0086:
        r0 = android.os.Build.MANUFACTURER;
        r2 = A;
        r3 = 26;
        r2 = r2[r3];
        r0 = r0.startsWith(r2);
        if (r0 == 0) goto L_0x00c0;
    L_0x0094:
        r0 = 2131427962; // 0x7f0b027a float:1.8477555E38 double:1.0530653326E-314;
        r0 = r9.findViewById(r0);
        r0.setVisibility(r4);
        r0 = 2131427964; // 0x7f0b027c float:1.847756E38 double:1.0530653336E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.CheckBox) r0;
        r0.setChecked(r6);
        r0 = 2131427632; // 0x7f0b0130 float:1.8476886E38 double:1.0530651696E-314;
        r0 = r9.findViewById(r0);
        r0.setVisibility(r4);
        r0 = 2131427635; // 0x7f0b0133 float:1.8476892E38 double:1.053065171E-314;
        r0 = r9.findViewById(r0);
        r0.setVisibility(r4);
        if (r1 == 0) goto L_0x00db;
    L_0x00c0:
        r0 = 2131427964; // 0x7f0b027c float:1.847756E38 double:1.0530653336E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.CheckBox) r0;
        r0.setChecked(r5);
        r0 = 2131427962; // 0x7f0b027a float:1.8477555E38 double:1.0530653326E-314;
        r0 = r9.findViewById(r0);
        r2 = new com.whatsapp.anl;
        r2.<init>(r9);
        r0.setOnClickListener(r2);
    L_0x00db:
        r0 = 2131427961; // 0x7f0b0279 float:1.8477553E38 double:1.053065332E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r9.m = r0;
        r0 = r9.m;
        r2 = java.lang.Integer.toString(r8);
        r0.setText(r2);
        r0 = 2131427776; // 0x7f0b01c0 float:1.8477178E38 double:1.0530652407E-314;
        r0 = r9.findViewById(r0);
        r2 = new com.whatsapp.s_;
        r2.<init>(r9);
        r0.setOnClickListener(r2);
        r0 = new com.whatsapp.a11;
        r0.<init>(r9);
        r9.s = r0;
        r0 = r9.s;
        r2 = r9.z;
        r0.a(r2);
        r0 = 2131427927; // 0x7f0b0257 float:1.8477484E38 double:1.0530653153E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r9.l = r0;
        r0 = r9.l;
        r2 = new com.whatsapp.a1o;
        r2.<init>(r9);
        r0.setOnClickListener(r2);
        r0 = 2131427666; // 0x7f0b0152 float:1.8476955E38 double:1.0530651864E-314;
        r0 = r9.findViewById(r0);
        r9.n = r0;
        r0 = v;
        if (r0 == 0) goto L_0x013e;
    L_0x012e:
        r0 = com.whatsapp.App.P;
        r0 = r0.d();
        r9.t = r0;
        r9.j();
        r9.showDialog(r6);
        if (r1 == 0) goto L_0x01a1;
    L_0x013e:
        r0 = com.whatsapp.App.aJ;
        r0 = r0.i();
        if (r0 != 0) goto L_0x0188;
    L_0x0146:
        r0 = android.os.Environment.getExternalStorageState();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = A;
        r4 = 28;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = A;
        r3 = 33;
        r2 = r2[r3];
        r2 = r0.equals(r2);
        if (r2 != 0) goto L_0x0183;
    L_0x0170:
        r2 = A;
        r3 = 31;
        r2 = r2[r3];
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0183;
    L_0x017c:
        r0 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r9.showDialog(r0);
        if (r1 == 0) goto L_0x0186;
    L_0x0183:
        r9.e();
    L_0x0186:
        if (r1 == 0) goto L_0x01a1;
    L_0x0188:
        r0 = A;
        r2 = 34;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.aJ;
        r0.j();
        com.whatsapp.App.D();
        r0 = com.whatsapp.App.p;
        r0.O();
        r9.d();
    L_0x01a1:
        r0 = 2131427958; // 0x7f0b0276 float:1.8477547E38 double:1.0530653306E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.EditText) r0;
        r9.u = r0;
        r0 = r9.u;
        com.whatsapp.b7.a(r0);
        r0 = r9.u;
        r2 = new com.whatsapp.nx;
        r2.<init>(r9);
        r0.addTextChangedListener(r2);
        r0 = r9.u;
        r2 = new android.text.InputFilter[r5];
        r3 = new android.text.InputFilter$LengthFilter;
        r3.<init>(r8);
        r2[r6] = r3;
        r0.setFilters(r2);
        r0 = r9.p();
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x01e3;
    L_0x01d3:
        r2 = r9.u;
        r2.setText(r0);
        r0 = r9.u;
        r2 = r9.u;
        r2 = r2.length();
        r0.setSelection(r2);
    L_0x01e3:
        r0 = com.whatsapp.App.p;
        r0 = r0.x();
        if (r0 == 0) goto L_0x01fb;
    L_0x01eb:
        r0 = A;
        r2 = 35;
        r0 = r0[r2];
        com.whatsapp.util.Log.w(r0);
        r0 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        com.whatsapp.Conversations.a(r9, r0);
        if (r1 == 0) goto L_0x020f;
    L_0x01fb:
        r0 = com.whatsapp.App.ax();
        if (r0 == 0) goto L_0x020f;
    L_0x0201:
        r0 = A;
        r1 = 30;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r0 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        com.whatsapp.Conversations.a(r9, r0);
    L_0x020f:
        com.whatsapp.App.d(r9, r7);
        com.whatsapp.App.b(r9);
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterName.onCreate(android.os.Bundle):void");
    }

    static View j(RegisterName registerName) {
        return registerName.p;
    }

    static k5 o() {
        return v;
    }

    static OnTouchListener e(RegisterName registerName) {
        return registerName.r;
    }

    private void n() {
        long h = h();
        if (h > 0 && System.currentTimeMillis() - h > o && this.p != null) {
            this.p.setVisibility(0);
        }
    }

    public void b(String str) {
    }

    public static void a(Context context, String str) {
        Parcelable i = i();
        Intent intent = new Intent();
        intent.putExtra(A[4], i);
        intent.putExtra(A[2], false);
        intent.putExtra(A[3], str);
        intent.putExtra(A[6], ShortcutIconResource.fromContext(context, R.drawable.icon));
        intent.setAction(A[5]);
        context.sendBroadcast(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = App.az;
        switch (i) {
            case a6.s /*12*/:
                if (i2 == -1) {
                    if (intent != null && intent.getBooleanExtra(A[48], false)) {
                        zv.a(this.t, (Activity) this);
                        j();
                        if (i3 == 0) {
                            return;
                        }
                    }
                    zv.a(intent, this.t, this, 13, this);
                    if (i3 == 0) {
                        return;
                    }
                }
                return;
                break;
            case a6.z /*13*/:
                break;
            default:
                return;
        }
        zv.b().delete();
        if (i2 == -1) {
            if (zv.b(this.t, this)) {
                j();
                if (i3 == 0) {
                    return;
                }
            }
            return;
        }
        if (i2 == 0 && intent != null) {
            zv.a(intent, (ho) this);
        }
    }

    private Dialog k() {
        this.q = new ls(this, this);
        this.q.setCancelable(false);
        return this.q;
    }

    static View a(RegisterName registerName, View view) {
        registerName.p = view;
        return view;
    }

    private void j() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.registration_profile_photo_size);
        float dimension = getResources().getDimension(R.dimen.registration_profile_photo_radius);
        Bitmap bitmap = null;
        if (this.t == null || a89.a(this.t.e)) {
            this.l.setEnabled(false);
            this.n.setVisibility(0);
            if (this.w == null) {
                this.w = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Config.ALPHA_8);
            }
            bitmap = this.w;
        } else {
            this.l.setEnabled(true);
            this.n.setVisibility(8);
            if (this.t.a().exists()) {
                bitmap = this.t.a(dimensionPixelSize, dimension, false);
            }
            if (bitmap == null) {
                bitmap = m8.a((int) R.drawable.avatar_contact, dimensionPixelSize, dimension);
            }
        }
        a(bitmap);
    }

    private void a(Bitmap bitmap) {
        this.l.setImageBitmap(bitmap);
    }

    private Dialog l() {
        this.y = new lv(this);
        this.y.setCancelable(false);
        return this.y;
    }

    static {
        String[] strArr = new String[54];
        String str = "9f1^\u00002h(\u0003\u0016*yr\u0002\u0012=`/\u0004\u0012(g=\u001d\u0012t`2\u0019\u00033h0\u0019\r?{\u0003\u0003\u0003;{(/\u00033d9";
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
                        i3 = 90;
                        break;
                    case ay.f /*1*/:
                        i3 = 9;
                        break;
                    case ay.n /*2*/:
                        i3 = 92;
                        break;
                    case ay.p /*3*/:
                        i3 = 112;
                        break;
                    default:
                        i3 = 119;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ">|,\u001c\u001e9h(\u0015";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = ";g8\u0002\u00183mr\u0019\u0019.l2\u0004Y?q(\u0002\u0016tz4\u001f\u0005.j)\u0004Y\u0014H\u00115";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ";g8\u0002\u00183mr\u0019\u0019.l2\u0004Y?q(\u0002\u0016tz4\u001f\u0005.j)\u0004Y\u0013G\b59\u000e";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "9f1^\u00164m.\u001f\u001e>'0\u0011\u00024j4\u0015\u0005th?\u0004\u001e5gr99\t]\u001d<;\u0005Z\u0014?%\u000eJ\t$";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ";g8\u0002\u00183mr\u0019\u0019.l2\u0004Y?q(\u0002\u0016tz4\u001f\u0005.j)\u0004Y\u0013J\u0013>(\bL\u000f?\"\bJ\u0019";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0014\u001e;e3\u0017X3g5\u0004\u0007(f;\u0002\u0012)z";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0014\u001e;e3\u0017X9h2\u0004Z9f2\u001e\u00129}";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0014\u001e;e3\u0017X(l/\u0004\u0018(l";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0014\u001e;e3\u0017X3g5\u0004\u0007(f;\u0002\u0012)zs\u0019\u00193}q\u001e\u00026es\u0002\u00127f*\u0015";
                    obj = 9;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0014\u001e;e3\u0017X<h5\u001c\u0012>$2\u0015\u0003";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0003\u0012.`2\u0019\u00033h0\u0019\r?{(\u0019\u001a?&9\u0002\u00055{";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "9f1^\u00002h(\u0003\u0016*y\u0003\u0000\u0005?o9\u0002\u00124j9\u0003";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "9f1^\u00002h(\u0003\u0016*yr\u0002\u0012=`/\u0004\u0012(g=\u001d\u0012t`2\u0019\u00033h0\u0019\r?{\u0003\u0003\u0003;{(/\u00033d9";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0013\u001b?h.\u0004\u001e4`(\u0019\u00166`&\u0015\u0005.`1\u0015X?{.\u001f\u0005";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "9f1^\u00002h(\u0003\u0016*yr\u0002\u0012=`/\u0004\u0012(g=\u001d\u0012t`2\u0019\u00033h0\u0019\r?{\u0003\u0003\u0003;{(/\u00033d9";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "9f1^\u00002h(\u0003\u0016*y\u0003\u0000\u0005?o9\u0002\u00124j9\u0003";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0002\u0012)|1\u0015";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0002\u0012)|1\u0015W(l;P\u0001?{5\u0016\u001e?mgP\u0012\"y0\u0019\u00143}0\tW>`/\u0000\u001b;p|\u0013\u00184}5\u001e\u0002?)/\u0013\u0005?l2";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "9f1^\u00002h(\u0003\u0016*y";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "9h2\u001e\u0018.),\u0011\u0005)l|\u0003\u001f5{(\u0013\u0002.))\u0002\u001ez";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "9f1^\u00002h(\u0003\u0016*yr=\u00163g";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = ";g8\u0002\u00183mr\u0019\u0019.l2\u0004Y?q(\u0002\u0016tz4\u001f\u0005.j)\u0004Y\u0013G\b59\u000e";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = ";g8\u0002\u00183mr\u0019\u0019.l2\u0004Y?q(\u0002\u0016tz4\u001f\u0005.j)\u0004Y\u0014H\u00115";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "9f1^\u00164m.\u001f\u001e>'0\u0011\u00024j4\u0015\u0005th?\u0004\u001e5gr%9\u0013G\u000f$6\u0016E\u0003#?\u0015[\b3\"\u000e";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\tf2\t";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0013\u0005?h(\u0015X(l;\u0019\u0004.{=\u0004\u001e5g|\u0011\u001b(l=\u0014\u000ez\u007f9\u0002\u001e<`9\u0014W8f)\u001e\u0014?)(\u001fW7h5\u001e";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0013\u001b3j7\u0015\u0013uz8\u0013\u0016(m/\u0004\u0016.l|";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0013\u0005?h(\u0015X8h8]\u0004.h(\u0015W8f)\u001e\u0014?)(\u001fW7h5\u001e";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0003\u0000wl$\u0000\u001e(l8";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "7f)\u001e\u0003?m\u0003\u0002\u0018";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0013\u0005?h(\u0015X7`/\u0003\u001e4nq\u0000\u0016(h1\u0003W8f)\u001e\u0014?)(\u001fW(l;\u0000\u001f5g9";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "7f)\u001e\u0003?m";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u001d\u0004=z(\u001f\u0005?&4\u0015\u00166}4\t";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0013\u001b5j7]\u0000(f2\u0017";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0013\u0005?h(\u0015";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "9f1^\u00105f;\u001c\u0012";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0017\u0012.d9\u001e\u00167l|";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = ">`/\u0000\u001b;p\u0003\u001e\u00167l";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "(l;\u0019\u0004.l.]\u0019;d9";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0014\u0012)}.\u001f\u000e";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u001e\u0018wy)\u0003\u001f4h1\u0015";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0003\u0003;{(";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = ";g8\u0002\u00183mr\u0019\u0019.l2\u0004Y;j(\u0019\u00184'\u00111>\u0014";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "9f1^\u00002h(\u0003\u0016*y";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = ";g8\u0002\u00183mr\u0019\u0019.l2\u0004Y9h(\u0015\u00105{%^;\u001b\\\u00123?\u001f[";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "9f1^\u00002h(\u0003\u0016*yr=\u00163g";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "3z\u0003\u0002\u0012)l(";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0003\u0012.V8\u0019\u0005.p";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u0002\u0012)}3\u0002\u0012>`=\u001c\u0018=&?\u001f\u0019={=\u0004\u0004";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "(l;\u001e\u00167ls\u001d\u0004=z(\u001f\u0005?\u007f9\u0002\u001e<`9\u0014X={3\u0005\u0007\u0005z%\u001e\u0014\u0005{9\u0001\u00023{9\u0014";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = ">l>\u0005\u0010";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "(l;\u0019\u0004.l.\u001e\u00167ls\u001d\u0012)z=\u0017\u0012)}3\u0002\u0012,l.\u0019\u00113l8_\u001a3z/\u0019\u0019=$,\u0011\u0005;d/P\u00155|2\u0013\u0012z}3P\u0005?n,\u0018\u00184l";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    A = strArr3;
                    o = 600000;
                    v = null;
                default:
                    strArr2[i] = str;
                    str = "9f1^\u00002h(\u0003\u0016*y\u0003\u0000\u0005?o9\u0002\u00124j9\u0003";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onResume() {
        Log.i(A[18]);
        super.onResume();
        b(true);
        if (v != null) {
            showDialog(0);
            v.a(this.x);
            n();
        }
        if (App.e((Context) this) == 3 && this.y == null) {
            showDialog(0);
            Log.i(A[19]);
        }
    }

    public static Intent i() {
        Intent intent = new Intent();
        intent.setClassName(A[45], A[47]);
        intent.setAction(A[44]);
        intent.addCategory(A[46]);
        intent.addFlags(268435456);
        intent.addFlags(2097152);
        return intent;
    }

    public void onPause() {
        super.onPause();
        if (v != null) {
            v.a();
        }
    }
}
