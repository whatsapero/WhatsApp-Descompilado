package com.whatsapp;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Display;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.widget.SearchView;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.bw;
import java.io.File;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class WebImagePicker extends DialogToastListActivity {
    private static final String[] z;
    private ds i;
    private tp j;
    private am1 k;
    private ym l;
    private OnClickListener m;
    private Uri n;
    private final File o;
    private SearchView p;
    private bw q;
    private int r;
    private ArrayList s;
    private int t;

    class AnonymousClass_2 extends SearchView {
        final WebImagePicker b;

        AnonymousClass_2(WebImagePicker webImagePicker, Context context) {
            this.b = webImagePicker;
            super(context);
        }

        public boolean isIconified() {
            return false;
        }
    }

    static {
        String[] strArr = new String[10];
        String str = "^WV_:HUQE2H@W^xJSZU2EmP_6E]S";
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
                        i3 = 41;
                        break;
                    case ay.f /*1*/:
                        i3 = 50;
                        break;
                    case ay.n /*2*/:
                        i3 = 52;
                        break;
                    case ay.p /*3*/:
                        i3 = 54;
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
                    str = "^WV_:HUQE2H@W^xJSZU2Em][6NWkR8^\\XY6Mm@W$B";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "D]AX#LVkD8";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "XGQD.";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "^WV_:HUQE2H@W^xJ@QW#L";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "FG@F\"]";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "D]AX#LV";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "@\\DC#v_QB?FV";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "}ZA[5Z";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "^WV_:HUQE2H@W^xMWGB%FK";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String b;
        Log.i(z[5]);
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        supportActionBar.setDisplayShowTitleEnabled(false);
        supportActionBar.setIcon((int) R.drawable.icon);
        supportActionBar.setDisplayShowCustomEnabled(true);
        this.k = am1.a();
        this.o.mkdirs();
        this.q = new bw(R.drawable.ic_menu_block, R.drawable.picture_loading, 72, this.o);
        ds.a();
        setContentView(R.layout.web_image_picker);
        CharSequence stringExtra = getIntent().getStringExtra(z[4]);
        if (stringExtra != null) {
            b = a5.b(stringExtra);
        } else {
            CharSequence charSequence = stringExtra;
        }
        OnClickListener eqVar = new eq(this);
        this.p = new AnonymousClass_2(this, getSupportActionBar().getThemedContext());
        this.p.setQueryHint(getString(R.string.search_hint));
        this.p.setSubmitButtonEnabled(true);
        this.p.setIconified(false);
        this.p.setOnCloseListener(new e3(this));
        this.p.setQuery(b, false);
        this.p.setOnSearchClickListener(eqVar);
        getSupportActionBar().setCustomView(this.p);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.n = (Uri) extras.getParcelable(z[6]);
        }
        ListView listView = getListView();
        listView.requestFocus();
        listView.setClickable(false);
        listView.setBackgroundDrawable(null);
        listView.setDividerHeight(0);
        this.l = new ym(this, this);
        setListAdapter(this.l);
        this.m = new avh(this);
        this.p.findViewById(R.id.abs__search_go_btn).setOnClickListener(new af4(this));
        ((TextView) this.p.findViewById(R.id.abs__search_src_text)).setOnEditorActionListener(new a8s(this));
        b();
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals(z[7]) || externalStorageState.equals(z[3])) {
            if (TextUtils.isEmpty(b)) {
                new Handler().postDelayed(new bl(this), 200);
                if (App.az == 0) {
                    return;
                }
            }
            ym.a(this.l, b);
            return;
        }
        Toast.makeText(getApplicationContext(), App.aT() ? R.string.need_sd_card : R.string.need_sd_card_shared_storage, 1).show();
        finish();
    }

    private void b() {
        this.t = (this.k.q + (this.k.l * 2)) + ((int) this.k.o);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        this.r = defaultDisplay.getWidth() / this.t;
        this.t = (defaultDisplay.getWidth() / this.r) - ((int) this.k.o);
        this.q.a();
        this.q = new bw(R.drawable.ic_menu_block, R.drawable.picture_loading, this.t, this.o);
    }

    static OnClickListener d(WebImagePicker webImagePicker) {
        return webImagePicker.m;
    }

    static ds e(WebImagePicker webImagePicker) {
        return webImagePicker.i;
    }

    private void a() {
        String toString = this.p.getQuery().toString();
        if (TextUtils.isEmpty(toString)) {
            Toast.makeText(getApplicationContext(), getString(R.string.photo_nothing_to_search), 0).show();
            if (App.az == 0) {
                return;
            }
        }
        ((InputMethodManager) App.p.getSystemService(z[8])).hideSoftInputFromWindow(this.p.getWindowToken(), 0);
        ym.a(this.l, toString);
    }

    static int j(WebImagePicker webImagePicker) {
        return webImagePicker.t;
    }

    static tp i(WebImagePicker webImagePicker) {
        return webImagePicker.j;
    }

    static bw h(WebImagePicker webImagePicker) {
        return webImagePicker.q;
    }

    static Uri g(WebImagePicker webImagePicker) {
        return webImagePicker.n;
    }

    public WebImagePicker() {
        this.s = new ArrayList();
        this.i = new ds("");
        this.r = 4;
        this.o = new File(App.p.getCacheDir(), z[9]);
    }

    static SearchView a(WebImagePicker webImagePicker) {
        return webImagePicker.p;
    }

    static void a(WebImagePicker webImagePicker, d6 d6Var) {
        webImagePicker.a(d6Var);
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

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
        this.l.notifyDataSetChanged();
    }

    static int b(WebImagePicker webImagePicker) {
        return webImagePicker.r;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(z[1]);
        this.s.clear();
        this.q.a();
        this.q.b();
        if (this.j != null) {
            this.j.cancel(true);
            Log.i(z[2]);
            if (tp.a(this.j) != null) {
                Log.i(z[0]);
                tp.a(this.j).dismiss();
                tp.a(this.j, null);
            }
            this.j = null;
        }
        ym.a(this.l);
    }

    static ds a(WebImagePicker webImagePicker, ds dsVar) {
        webImagePicker.i = dsVar;
        return dsVar;
    }

    static tp a(WebImagePicker webImagePicker, tp tpVar) {
        webImagePicker.j = tpVar;
        return tpVar;
    }

    static am1 k(WebImagePicker webImagePicker) {
        return webImagePicker.k;
    }

    private void a(d6 d6Var) {
        if (this.j != null) {
            this.j.cancel(true);
        }
        this.j = new tp(this, d6Var);
        a5w.a(this.j, new Void[0]);
    }

    static void l(WebImagePicker webImagePicker) {
        webImagePicker.a();
    }

    static File f(WebImagePicker webImagePicker) {
        return webImagePicker.o;
    }

    static ArrayList c(WebImagePicker webImagePicker) {
        return webImagePicker.s;
    }

    static bw a(WebImagePicker webImagePicker, bw bwVar) {
        webImagePicker.q = bwVar;
        return bwVar;
    }
}
