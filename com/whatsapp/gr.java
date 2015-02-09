package com.whatsapp;

import android.os.AsyncTask;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import android.widget.ScrollView;
import com.actionbarsherlock.R;
import com.whatsapp.contact.e;
import com.whatsapp.contact.m;
import com.whatsapp.contact.o;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Set;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class gr extends AsyncTask {
    private static final String z;
    final ContactPickerHelp a;

    static {
        char[] toCharArray = "8\u0005gH@8\u001eaYM+EzTN,\u0003gJH(\u0003kPDt\tkOU:\u001e|O\u0001".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 91;
                    break;
                case ay.f /*1*/:
                    i2 = 106;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 60;
                    break;
                default:
                    i2 = 33;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected Set a(Void[] voidArr) {
        return e.b(m.INVISIBLE_ONLY);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Set set) {
        this.a.removeDialog(1);
        if (set != null) {
            if (!set.isEmpty()) {
                this.a.findViewById(R.id.use_all_contacts_checkbox_layout).setVisibility(0);
                Log.i(z + this.a.l.isChecked());
                this.a.findViewById(R.id.div).setVisibility(0);
                this.a.findViewById(R.id.div2).setVisibility(0);
            }
            this.a.k.setVisibility(0);
            this.a.k.setText(this.a.getString(R.string.contacts_help_diagnostics_result_count, new Object[]{Integer.valueOf(set.size())}));
            this.a.getListView().setVisibility(0);
            this.a.i.clear();
            this.a.i.addAll(set);
            Collections.sort(this.a.i, new o());
            this.a.j.notifyDataSetChanged();
            ListView listView = this.a.getListView();
            LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = (int) (((float) set.size()) * this.a.getResources().getDimension(R.dimen.contactpicker_help_row_height));
            listView.setLayoutParams(layoutParams);
            if (!set.isEmpty()) {
                ((ScrollView) this.a.findViewById(R.id.scroll_view)).post(new r_(this));
            }
            if (App.az == 0) {
                return;
            }
        }
        this.a.a(R.string.contacts_help_diagnostics_error);
    }

    protected void onPreExecute() {
        this.a.showDialog(1);
        this.a.k.setVisibility(4);
        this.a.getListView().setVisibility(4);
        this.a.findViewById(R.id.use_all_contacts_checkbox_layout).setVisibility(8);
        this.a.findViewById(R.id.div).setVisibility(8);
        this.a.findViewById(R.id.div2).setVisibility(8);
    }

    gr(ContactPickerHelp contactPickerHelp, v7 v7Var) {
        this(contactPickerHelp);
    }

    private gr(ContactPickerHelp contactPickerHelp) {
        this.a = contactPickerHelp;
    }

    protected void onPostExecute(Object obj) {
        a((Set) obj);
    }
}
