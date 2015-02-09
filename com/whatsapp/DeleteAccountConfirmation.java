package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.KeyEvent;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.notification.q;
import com.whatsapp.util.Log;
import com.whatsapp.util.br;
import com.whatsapp.util.g;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class DeleteAccountConfirmation extends SherlockActivity {
    private static DeleteAccountConfirmation b;
    private static final String[] z;
    private Handler c;

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case ay.f /*1*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.delete_account_processing));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case ay.n /*2*/:
                return new Builder(this).setMessage(getString(R.string.register_check_connectivity, new Object[]{getString(R.string.connectivity_self_help_instructions)})).setNeutralButton(R.string.ok, new ka(this)).create();
            case ay.p /*3*/:
                return new Builder(this).setMessage(R.string.delete_account_failed).setNeutralButton(R.string.ok, new hl(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    static Handler a(DeleteAccountConfirmation deleteAccountConfirmation) {
        return deleteAccountConfirmation.c;
    }

    static void d() {
        if (!App.p.getSharedPreferences(z[7], 0).edit().clear().commit()) {
            Log.e(z[6]);
        }
        if (!App.p.getSharedPreferences(z[8], 0).edit().clear().commit()) {
            Log.e(z[9]);
        }
    }

    protected void onResume() {
        super.onResume();
        b = this;
        int e = App.e((Context) this);
        if (e != 3 && e != 6) {
            Log.e(z[11] + e);
            startActivity(new Intent(this, Main.class));
            finish();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i(z[12]);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(b7.a(getLayoutInflater(), R.layout.delete_account_confirmation, null, false));
        findViewById(R.id.delete_submit).setOnClickListener(new wd(this));
        int i = ac.e;
        if (i == -1) {
            i = ac.b();
        }
        if (i != 0) {
            findViewById(R.id.delete_account_paid_warning).setVisibility(0);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (App.G != 3 || i != 84) {
            return super.onKeyDown(i, keyEvent);
        }
        g.a((Activity) this, false);
        return true;
    }

    public static void b() {
        int i = App.az;
        App.d(App.p, 6);
        if (b != null) {
            b.c.removeMessages(0);
        }
        q.c().a();
        File filesDir = App.p.getFilesDir();
        String[] fileList = App.p.fileList();
        int length = fileList.length;
        int i2 = 0;
        while (i2 < length) {
            String str = fileList[i2];
            i2++;
            if (i != 0) {
                break;
            }
        }
        l7.d(filesDir);
        br.a(new o9());
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(App.p);
        if (!defaultSharedPreferences.edit().clear().commit()) {
            Log.e(z[3]);
        }
        PreferenceManager.setDefaultValues(App.p, R.xml.preferences, true);
        App.d(App.p, 6);
        if (!defaultSharedPreferences.edit().putString(z[0], z[4]).commit()) {
            Log.e(z[1]);
        }
        d();
        App.aY = false;
        App.a0();
        String externalStorageState = Environment.getExternalStorageState();
        Log.i(z[2] + externalStorageState);
        if (externalStorageState.equals(z[5])) {
            App.aJ.d();
        }
        App.i();
        a5w.a(new qi(), new Void[0]);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.c.removeMessages(0);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            default:
                return false;
        }
    }

    static void c() {
        a();
    }

    private static void a() {
        App.an = null;
        new File(App.p.getFilesDir(), z[10]).delete();
        a54.E();
        App.f(App.p, null);
        App.d(App.p, 0);
        App.aJ.L();
        App.P.k();
        App.S = false;
        a54.b();
    }

    protected void onPause() {
        super.onPause();
        b = null;
    }

    static DeleteAccountConfirmation e() {
        return b;
    }

    public DeleteAccountConfirmation() {
        this.c = new asd(this);
    }

    static {
        String[] strArr = new String[13];
        String str = "&sz]>?x";
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
                        i3 = 80;
                        break;
                    case ay.f /*1*/:
                        i3 = 22;
                        break;
                    case ay.n /*2*/:
                        i3 = 8;
                        break;
                    case ay.p /*3*/:
                        i3 = 46;
                        break;
                    default:
                        i3 = 87;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "4sdK#5wkM#3yfH>\"{'K/$sz@6<{mJ>1;{Z6$s(";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "4sdK#5wkM#3yfH>\"{'M;5wf['\u007fudK6\"6nO><sl";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "b89\u001fye&=";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "=y}@#5r";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "4sdK#5wkM#3yfH>\"{'\\27f`A959kA:=\u007f|\u000e11\u007fdK3";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0002soG$$sz~??xm";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    str = "\u0006szG1)Ee]";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "4sdK#5wkM#3yfH>\"{'X2\"\u007fnW$=e'M8={aZw6waB24";
                    obj = 8;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "=s";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "4sdK#5wkM#3yfH>\"{'Y%?xo\u0003$$w|Kw2y}@456|Aw=wa@w";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "4sdK#5wkM8%x|M8>pa\\:\u007fuzK6$s";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = null;
                default:
                    strArr2[i] = str;
                    str = "4sdK#5wkM#3yfH>\"{'M;5wf['\u007femZ!5d{G8>6nO><sl";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
