package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockListFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.ar;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class CallsFragment extends SherlockListFragment implements bt {
    private static final String[] z;
    private m2 b;
    private ArrayList c;
    private final anq d;
    private final s4 e;
    private final ArrayList f;
    private final Runnable g;
    ar h;
    private CharSequence i;
    private final asm j;
    private fk k;
    private a_j l;

    public class ClearCallLogDialogFragment extends DialogFragment {
        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(R.string.clear_call_log_ask).setPositiveButton(R.string.ok, new xn(this)).setNeutralButton(R.string.cancel, null).create();
        }
    }

    static {
        String[] strArr = new String[4];
        String str = "\"b\u001a\u0005`ng\u0013\u001ag3l\u000f";
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
                        i3 = 65;
                        break;
                    case ay.f /*1*/:
                        i3 = 3;
                        break;
                    case ay.n /*2*/:
                        i3 = 118;
                        break;
                    case ay.p /*3*/:
                        i3 = 105;
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
                    str = "5q\u000fIg.#\u0005\u001dr3wV\u0006f5d\u0019\u0000}&#\u0015\b\u007f-#\u0010\u001b|,#\u0017\ng(u\u0013Ie.j\u0006Ip o\u001a";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\"b\u001a\u0005C(`\u001d\fa";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\"l\u0018\u001dr\"w";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a() {
        App.p.U().removeCallbacks(this.g);
        if (!this.f.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            long b = currentTimeMillis - ((lz) this.f.get(0)).b();
            if (b < 3600000) {
                App.p.U().postDelayed(this.g, (((((lz) this.f.get(0)).b() + ((b / 60000) * 60000)) + 60000) - currentTimeMillis) + 1000);
                if (App.az == 0) {
                    return;
                }
            }
            if (b < 86400000) {
                App.p.U().postDelayed(this.g, (((((lz) this.f.get(0)).b() + ((b / 3600000) * 3600000)) + 3600000) - currentTimeMillis) + 1000);
            }
        }
    }

    static ArrayList h(CallsFragment callsFragment) {
        return callsFragment.c;
    }

    public CallsFragment() {
        this.k = new fk();
        this.f = new ArrayList();
        this.c = new ArrayList();
        this.d = new co(this);
        this.e = new a1x(this);
        this.j = new a38(this);
        this.g = new asi(this);
        this.h = new q_(this);
    }

    static fk d(CallsFragment callsFragment) {
        return callsFragment.k;
    }

    static m2 c(CallsFragment callsFragment) {
        return callsFragment.b;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    static CharSequence b(CallsFragment callsFragment) {
        return callsFragment.i;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.calls, viewGroup, false);
    }

    public void onActivityCreated(Bundle bundle) {
        boolean z;
        super.onActivityCreated(bundle);
        setHasOptionsMenu(true);
        ListView listView = getListView();
        if (VERSION.SDK_INT < 11) {
            z = true;
        } else {
            z = false;
        }
        listView.setFastScrollEnabled(z);
        if (VERSION.SDK_INT < 11) {
            listView.setSelector(R.drawable.selector_orange_gradient);
        }
        listView.setScrollbarFadingEnabled(true);
        listView.setOnItemClickListener(new alw(this));
        this.b = new m2(this, null);
        setListAdapter(this.b);
        App.b(this.d);
        App.a(this.e);
        App.a(this.j);
        getView().findViewById(R.id.button_tell_a_friend).setOnClickListener(new qf(this));
        b();
    }

    static ArrayList g(CallsFragment callsFragment) {
        return callsFragment.f;
    }

    public void onDestroy() {
        Log.i(z[0]);
        super.onDestroy();
        App.a(this.d);
        App.b(this.e);
        App.b(this.j);
        this.k.a();
        App.p.U().removeCallbacks(this.g);
    }

    static void f(CallsFragment callsFragment) {
        callsFragment.c();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menuitem_clear_call_log:
                new ClearCallLogDialogFragment().show(getFragmentManager(), null);
                return true;
            case R.id.menuitem_new_call:
                if (Voip.f()) {
                    Log.w(z[2]);
                    App.b(getActivity(), (int) R.string.error_call_disabled_during_call, 0);
                    if (App.az == 0) {
                        return true;
                    }
                }
                Intent intent = new Intent(getActivity(), ContactPicker.class);
                intent.putExtra(z[3], true);
                startActivityForResult(intent, 105);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    static ArrayList a(CallsFragment callsFragment, ArrayList arrayList) {
        callsFragment.c = arrayList;
        return arrayList;
    }

    static void a(CallsFragment callsFragment) {
        callsFragment.b();
    }

    public void a(CharSequence charSequence) {
        this.i = charSequence;
        this.b.getFilter().filter(charSequence);
    }

    private void b() {
        if (this.l != null) {
            this.l.cancel(true);
        }
        this.l = new a_j(this, null);
        a5w.a(this.l, new Void[0]);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 105:
                if (i2 == -1) {
                    App.b(App.P.a(intent.getStringExtra(z[1])), getActivity());
                }
            default:
        }
    }

    private void c() {
        int i = App.az;
        if (this.f.isEmpty()) {
            if (App.P.c() > 0) {
                getView().findViewById(R.id.calls_search_empty).setVisibility(8);
                getView().findViewById(R.id.calls_empty_no_calls).setVisibility(0);
                getView().findViewById(R.id.calls_empty_no_contacts).setVisibility(8);
                if (i == 0) {
                    return;
                }
            }
            getView().findViewById(R.id.calls_search_empty).setVisibility(8);
            getView().findViewById(R.id.calls_empty_no_calls).setVisibility(8);
            getView().findViewById(R.id.calls_empty_no_contacts).setVisibility(0);
            if (i == 0) {
                return;
            }
        }
        if (!TextUtils.isEmpty(this.i)) {
            getView().findViewById(R.id.calls_search_empty).setVisibility(0);
            getView().findViewById(R.id.calls_empty_no_calls).setVisibility(8);
            getView().findViewById(R.id.calls_empty_no_contacts).setVisibility(8);
        }
    }

    static void e(CallsFragment callsFragment) {
        callsFragment.a();
    }

    static CharSequence a(CallsFragment callsFragment, CharSequence charSequence) {
        callsFragment.i = charSequence;
        return charSequence;
    }
}
