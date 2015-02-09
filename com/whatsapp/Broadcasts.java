package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class Broadcasts extends DialogToastListActivity {
    private static final String[] z;
    private e i;
    private final anq j;
    private final fc k;
    private final fk l;

    static {
        String[] strArr = new String[4];
        String str = "WXn\u001e`VKr\u000bw\u001aNd\fpGEx";
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
                        i3 = 53;
                        break;
                    case ay.f /*1*/:
                        i3 = 42;
                        break;
                    case ay.n /*2*/:
                        i3 = 1;
                        break;
                    case ay.p /*3*/:
                        i3 = 127;
                        break;
                    default:
                        i3 = 4;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "WXn\u001e`VKr\u000bw\u0015Hn\njVO!\u000bk\u0015G`\u0016j";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "WXn\u001e`VKr\u000bw\u001aIs\u001aeAO.\u0011k\u0018GdRkG\u0007l\fcF^n\ra\u0018Nc";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "WXn\u001e`VKr\u000bw\u001aIs\u001aeAO";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static e a(Broadcasts broadcasts) {
        return broadcasts.i;
    }

    public void onDestroy() {
        Log.i(z[0]);
        super.onDestroy();
        this.l.a();
        App.aJ.a(this.k);
        App.a(this.j);
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[1]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        App.aJ.b(this.k);
        App.b(this.j);
        if (App.an != null && App.aJ.e() && App.e((Context) this) == 3) {
            boolean z;
            setContentView(R.layout.broadcasts);
            this.i = new e(this);
            View listView = getListView();
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
            listView.setAdapter(this.i);
            listView.setOnItemClickListener(new oh(this));
            registerForContextMenu(listView);
            return;
        }
        Log.i(z[3]);
        App.v(z[2]);
        startActivity(new Intent(this, Main.class));
        finish();
    }

    public Broadcasts() {
        this.l = new fk();
        this.k = new gl(this);
        this.j = new as1(this);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case ay.f /*1*/:
                App.a((b) ((AdapterContextMenuInfo) menuItem.getMenuInfo()).targetView.getTag(), false);
                return true;
            default:
                return super.onContextItemSelected(menuItem);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            default:
                return false;
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 1, 0, getString(R.string.delete));
    }
}
