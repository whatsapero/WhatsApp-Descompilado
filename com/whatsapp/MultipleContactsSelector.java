package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class MultipleContactsSelector extends DialogToastActivity {
    private static final String[] z;
    private ImageButton j;
    protected ArrayList k;
    private fk l;
    final TextWatcher m;
    private f6 n;
    private ArrayList o;
    OnItemClickListener p;
    protected TextView q;
    protected AutoCompleteTextView r;

    static {
        String[] strArr = new String[4];
        String str = "vf\\<";
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
                        i3 = 28;
                        break;
                    case ay.f /*1*/:
                        i3 = 15;
                        break;
                    case ay.n /*2*/:
                        i3 = 56;
                        break;
                    case ay.p /*3*/:
                        i3 = 79;
                        break;
                    default:
                        i3 = 61;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "qzT;Tlc],Rr{Y,Io|]#X\u007f{W=\u0012\u007f}].Iy";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "qzT;Tlc],Rr{Y,Io|]#X\u007f{W=\u0012xjK;Osv";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "vf\\<";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected abstract String a();

    protected abstract String b();

    protected abstract int e();

    protected abstract int f();

    protected abstract int g();

    protected abstract void h();

    protected abstract int j();

    static f6 b(MultipleContactsSelector multipleContactsSelector) {
        return multipleContactsSelector.n;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                break;
        }
        return true;
    }

    public MultipleContactsSelector() {
        this.o = new ArrayList();
        this.k = new ArrayList();
        this.n = new f6(this, null);
        this.l = new fk();
        this.p = new je(this);
        this.m = new a5d(this);
    }

    protected void a(ListView listView) {
    }

    protected String k() {
        int i = App.az;
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            m8 m8Var = (m8) it.next();
            if (stringBuilder.length() != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(m8Var.e);
            if (i != 0) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    protected void d() {
        int i = App.az;
        if (this.k.size() == 0) {
            this.q.setText("");
            if (i == 0) {
                return;
            }
        }
        if (f() > 0) {
            this.q.setText(Integer.toString(this.k.size()) + "/" + f());
            if (i == 0) {
                return;
            }
        }
        this.q.setText(Integer.toString(this.k.size()));
    }

    static fk c(MultipleContactsSelector multipleContactsSelector) {
        return multipleContactsSelector.l;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case ay.f /*1*/:
                if (i2 == -1) {
                    String stringExtra = intent.getStringExtra(z[0]);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        b(stringExtra);
                    }
                    if (App.az != 0) {
                        break;
                    }
                    return;
                }
                return;
        }
        super.onActivityResult(i, i2, intent);
    }

    static boolean a(MultipleContactsSelector multipleContactsSelector, String str) {
        return multipleContactsSelector.a(str);
    }

    public void onDestroy() {
        Log.i(z[3]);
        super.onDestroy();
        this.l.a();
    }

    private ArrayList i() {
        ArrayList arrayList = new ArrayList();
        App.P.d(arrayList);
        Collections.sort(arrayList, new kf(getApplicationContext()));
        return arrayList;
    }

    protected void b(String str) {
        int i = App.az;
        this.k.clear();
        String[] split = str.split(",");
        int length = split.length;
        int i2 = 0;
        while (i2 < length) {
            this.k.add(App.P.a(split[i2]));
            i2++;
            if (i != 0) {
                break;
            }
        }
        this.r.setText("");
        this.n.notifyDataSetChanged();
        d();
    }

    private boolean a(String str) {
        int i = App.az;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (!str.equals(((m8) it.next()).e)) {
                if (i != 0) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[2]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setTitle(b());
        setContentView(R.layout.multiple_contact_selector);
        ((TextView) findViewById(R.id.contacts_title)).setText(a());
        this.q = (TextView) findViewById(R.id.contacts_counter);
        this.j = (ImageButton) findViewById(R.id.add_contact_btn);
        this.j.setOnClickListener(new ald(this));
        this.o = i();
        ListAdapter com_whatsapp_a3s = new a3s(this);
        this.r = (AutoCompleteTextView) findViewById(R.id.autocomplete_contact_name);
        this.r.setAdapter(com_whatsapp_a3s);
        this.r.setOnItemClickListener(this.p);
        this.r.setThreshold(1);
        b7.a(this.r);
        ListView listView = (ListView) findViewById(16908298);
        a(listView);
        listView.setAdapter(this.n);
        bp.a(this, getSupportActionBar(), getString(e()).toUpperCase(), new gi(this));
        d();
        this.r.addTextChangedListener(this.m);
        String stringExtra = getIntent().getStringExtra(z[1]);
        if (!TextUtils.isEmpty(stringExtra)) {
            b(stringExtra);
        }
    }

    static ArrayList a(MultipleContactsSelector multipleContactsSelector) {
        return multipleContactsSelector.o;
    }
}
