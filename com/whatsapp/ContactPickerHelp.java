package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ContactPickerHelp extends DialogToastListActivity {
    private static final String z;
    List i;
    ak2 j;
    TextView k;
    CheckBox l;
    boolean m;

    static {
        char[] toCharArray = ",g*?5,|,.8?''91.|!".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 79;
                    break;
                case ay.f /*1*/:
                    i2 = 8;
                    break;
                case ay.n /*2*/:
                    i2 = 68;
                    break;
                case ay.p /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected Dialog onCreateDialog(int i) {
        Dialog progressDialog;
        switch (i) {
            case ay.f /*1*/:
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.register_preparing));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case ay.n /*2*/:
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.register_wait_message));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case ay.p /*3*/:
                return new Builder(this).setMessage(R.string.contacts_help_contacts_updated).setCancelable(false).setNeutralButton(R.string.ok, new oo(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    public void onCreate(Bundle bundle) {
        Log.i(z);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.contact_picker_help);
        ((Button) findViewById(R.id.count_invisible_button)).setOnClickListener(new v7(this));
        this.k = (TextView) findViewById(R.id.invisible_count);
        this.i = new ArrayList();
        this.j = new ak2(this, R.layout.contact_picker_help_row, this.i);
        getListView().setAdapter(this.j);
        this.k.setVisibility(4);
        getListView().setVisibility(8);
        this.l = (CheckBox) findViewById(R.id.use_all_contacts_cb);
        this.l.setChecked(App.n((Context) this));
        this.l.setOnCheckedChangeListener(new r1(this));
        findViewById(R.id.use_all_contacts_checkbox_layout).setOnClickListener(new g4(this));
        ((ScrollView) findViewById(R.id.scroll_view)).post(new qs(this));
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
}
