package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.fieldstats.au;
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

public class DeleteAccount extends DialogToastActivity {
    private static String k;
    private static String n;
    private static final String[] z;
    EditText j;
    private cd l;
    private int m;
    EditText o;
    private cs p;
    private int q;
    EditText r;
    private Handler s;
    private TextWatcher t;
    private TextWatcher u;
    private String v;
    boolean w;

    protected void onDestroy() {
        Log.i(z[17]);
        this.s.removeMessages(4);
        super.onDestroy();
    }

    private void c(String str) {
        try {
            Log.i(z[7] + str + z[3] + ats.b(str));
        } catch (IOException e) {
            Log.e(z[4] + str + z[1] + e.toString());
        }
        try {
            if (this.u != null) {
                this.o.removeTextChangedListener(this.u);
            }
            this.u = new a5_(ats.b(str));
            this.o.addTextChangedListener(this.u);
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable e3) {
            Log.b(z[5], e3);
        } catch (Throwable e32) {
            Log.b(z[6] + str + z[2], e32);
        }
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

    static String a() {
        return k;
    }

    public void onPause() {
        super.onPause();
        this.m = RegisterPhone.a(this.o);
        this.q = RegisterPhone.a(this.j);
        Log.i(z[8]);
    }

    static void a(DeleteAccount deleteAccount, String str) {
        deleteAccount.c(str);
    }

    protected void onCreate(Bundle bundle) {
        Log.i(z[12]);
        super.onCreate(bundle);
        ak4.a(au.DELETE_ACCOUNT);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(b7.a(getLayoutInflater(), R.layout.delete_account, null, false, new int[]{2131427580}));
        this.j = (EditText) findViewById(R.id.registration_cc);
        this.r = (EditText) findViewById(R.id.registration_country);
        this.o = (EditText) findViewById(R.id.registration_phone);
        ((TextView) findViewById(R.id.register_phone_country)).setText(getString(R.string.register_phone_country).toUpperCase());
        ((TextView) findViewById(R.id.register_phone_country_code)).setText(getString(R.string.register_phone_country_code).toUpperCase());
        ((TextView) findViewById(R.id.delete_account_instructions)).setText(getString(R.string.delete_account_instructions, new Object[]{getString(R.string.settings_delete_account)}));
        this.j.setFilters(new InputFilter[]{new LengthFilter(3)});
        this.o.setFilters(new InputFilter[]{new LengthFilter(17)});
        String networkCountryIso = App.a3.getNetworkCountryIso();
        if (networkCountryIso != null) {
            try {
                k = ats.e(networkCountryIso);
            } catch (IOException e) {
                Log.e(z[13]);
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        this.t = new nh(this);
        this.j.addTextChangedListener(this.t);
        this.r.setOnClickListener(new at2(this));
        this.o.requestFocus();
        this.m = RegisterPhone.a(this.o);
        this.q = RegisterPhone.a(this.j);
        findViewById(R.id.delete_account_change_number_option).setOnClickListener(new yj(this));
        try {
            ((Button) findViewById(R.id.registration_submit)).setOnClickListener(new o7(this));
            if (k != null) {
                this.j.setText(k);
            }
            String toString = this.r.getText().toString();
            if (toString != null) {
                try {
                    if (toString.length() > 0) {
                        try {
                            Log.i(z[11] + toString + z[14] + ats.b(toString));
                        } catch (Throwable e3) {
                            Log.b(z[15] + toString + z[16], e3);
                        }
                        c(toString);
                    }
                } catch (IOException e4) {
                    throw e4;
                } catch (NullPointerException e22) {
                    throw e22;
                }
            }
            int i = ac.e;
            if (i == -1) {
                i = ac.b();
            }
            if (i != 0) {
                try {
                    findViewById(R.id.delete_account_paid_warning).setVisibility(0);
                } catch (IOException e42) {
                    throw e42;
                }
            }
        } catch (IOException e422) {
            throw e422;
        }
    }

    static String a(String str) {
        k = str;
        return str;
    }

    static String a(DeleteAccount deleteAccount) {
        return deleteAccount.v;
    }

    public void onResume() {
        try {
            super.onResume();
            if (k != null) {
                this.j.setText(k);
            }
            try {
                if (this.v != null) {
                    this.r.setText(this.v);
                }
                RegisterPhone.b(this.j, this.q);
                RegisterPhone.b(this.o, this.m);
                Log.i(z[0]);
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    static cs b(DeleteAccount deleteAccount) {
        return deleteAccount.p;
    }

    static String b() {
        return n;
    }

    static Handler e(DeleteAccount deleteAccount) {
        return deleteAccount.s;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 == -1) {
            try {
                k = intent.getStringExtra(z[9]);
                this.v = intent.getStringExtra(z[10]);
                this.j.setText(k);
                this.r.setText(this.v);
                c(this.v);
                if (this.m == -1) {
                    this.m = Integer.MAX_VALUE;
                }
                this.q = -1;
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.j.addTextChangedListener(this.t);
    }

    static TextWatcher c(DeleteAccount deleteAccount) {
        return deleteAccount.t;
    }

    static String b(String str) {
        n = str;
        return str;
    }

    static cd d(DeleteAccount deleteAccount) {
        return deleteAccount.l;
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case ay.f /*1*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.register_connecting));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case 109:
                return new Builder(this).setMessage(R.string.register_try_again_later).setPositiveButton(R.string.check_system_status, new hy(this)).setNeutralButton(R.string.cancel, new nj(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    public DeleteAccount() {
        this.w = false;
        this.s = new atv(this);
        this.p = new wa(this);
        this.l = new ou(this);
    }

    static {
        String[] strArr = new String[18];
        String str = ";\u0003j\u000e\r:Kg\b\u001a0\u0013h\u001fV/\u000ei\u0005\u001cp\u0014c\u0018\f2\u0003";
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
                        i3 = 95;
                        break;
                    case ay.f /*1*/:
                        i3 = 102;
                        break;
                    case ay.n /*2*/:
                        i3 = 6;
                        break;
                    case ay.p /*3*/:
                        i3 = 107;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u007f\u0005g\u001e\n:\u0002&\n\u0017\u007f/I.\u0001<\u0003v\u001f\u00100\b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u007f\u001a&";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ";\u0003j\u000e\r:Kg\b\u001a0\u0013h\u001fV<\ts\u0005\r-\u001f<K";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ";\u0003j\u000e\r:Kg\b\u001a0\u0013h\u001fV9\tt\u0006\u0018+\u0012c\u0019T:\u001ee\u000e\t+\u000fi\u0005";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    str = ";\u0003j\u000e\r:Kg\b\u001a0\u0013h\u001fV<\ts\u0005\r-\u001f<";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = ";\u0003j\u000e\r:Kg\b\u001a0\u0013h\u001fV<\ts\u0005\r-\u001f<";
                    obj = 6;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ";\u0003j\u000e\r:Kg\b\u001a0\u0013h\u001fV/\u0007s\u0018\u001c\u007f";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "<\u0005";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "<\ts\u0005\r-\u001fY\u0005\u00182\u0003";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ";\u0003j\u000e\r:Kg\b\u001a0\u0013h\u001fV<\ts\u0005\r-\u001f<";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ";\u0003j\u000e\r:Kg\b\u001a0\u0013h\u001fV<\u0014c\n\r:";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ";\u0003j\u000e\r:Kg\b\u001a0\u0013h\u001fV6\u0015iD\u001a0\u0002cK\u001f>\u000fj\u000e\u001d\u007f\u0012iK\u001e:\u0012&\b\u0016;\u0003&\r\u000b0\u000b&(\u0016*\br\u0019\u0000\u000f\u000ei\u0005\u001c\u0016\b`\u0004";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u007f\u001a&";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ";\u0003j\u000e\r:Kg\b\u001a0\u0013h\u001fV<\ts\u0005\r-\u001f<";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u007f\u0000g\u0002\u0015:\u0002&(\u0016*\br\u0019\u0000\u000f\u000ei\u0005\u001c\u0016\b`\u0004W3\ti\u0000\f/%i\u001e\u0017+\u0014\u007f*\u001b=\u0014D\u00127>\u000bcCP";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = ";\u0003j\u000e\r:Kg\b\u001a0\u0013h\u001fV;\u0003u\u001f\u000b0\u001f";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    z = strArr3;
                    k = null;
                    n = null;
                default:
                    strArr2[i] = str;
                    str = "9\u0007o\u0007\u001c;Fr\u0004Y3\ti\u0000\f/%i\u001e\u0017+\u0014\u007f*\u001b=\u0014D\u00127>\u000bcK\u001f-\tkK:0\u0013h\u001f\u000b&6n\u0004\u0017:/h\r\u0016\u007f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
