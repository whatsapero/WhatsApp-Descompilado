package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.br;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;

public class BlockList extends DialogToastListActivity implements anq {
    private static final String[] z;
    ArrayList i;
    bk j;
    private fk k;
    public boolean l;

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "6;hB\"\u000b4hO=54s";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r6 = r2.length;
        r7 = r6;
        r8 = r1;
        r6 = r2;
    L_0x0012:
        if (r7 > r8) goto L_0x002f;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "6;hB\"13XM '#";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x002f:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0046;
            case 3: goto L_0x0048;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 73;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 84;
        goto L_0x0038;
    L_0x0043:
        r2 = 87;
        goto L_0x0038;
    L_0x0046:
        r2 = 7;
        goto L_0x0038;
    L_0x0048:
        r2 = 33;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.BlockList.<clinit>():void");
    }

    public void a() {
        d();
    }

    public void b(String str) {
    }

    private void b() {
        int i = App.az;
        this.i.clear();
        Enumeration keys = App.at.keys();
        while (keys.hasMoreElements()) {
            try {
                String str = (String) keys.nextElement();
                m8 a = App.P.a(str);
                if (a != null) {
                    this.i.add(a);
                    if (i == 0) {
                    }
                }
                this.i.add(new m8(str));
            } catch (NoSuchElementException e) {
                throw e;
            } catch (NoSuchElementException e2) {
                throw e2;
            } catch (NoSuchElementException e3) {
                if (i != 0) {
                    break;
                }
            }
        }
        Collections.sort(this.i, new kf(getApplicationContext()));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, (int) R.string.menuitem_add).setIcon((int) R.drawable.ic_action_add_person).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case 107:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.register_wait_message));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            default:
                return super.onCreateDialog(i);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.block_list);
        b();
        this.j = new bk(this, this, R.layout.contact_picker_row, this.i);
        setListAdapter(this.j);
        getListView().setEmptyView(findViewById(R.id.block_list_empty));
        registerForContextMenu(getListView());
        getListView().setOnItemClickListener(new _y(this));
        App.b((anq) this);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            if (i2 == -1 && i == 3) {
                try {
                    if (!App.a()) {
                        App.b(getBaseContext(), (int) R.string.no_network_cannot_block, 0);
                        if (App.az == 0) {
                            return;
                        }
                    }
                    showDialog(107);
                    this.l = true;
                    br.a(new a1q(this, intent));
                } catch (NoSuchElementException e) {
                    throw e;
                } catch (NoSuchElementException e2) {
                    throw e2;
                }
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.k.a();
        App.a((anq) this);
    }

    public void c(String str) {
    }

    public void a(String str) {
        d();
    }

    public void d(String str) {
        d();
    }

    public void a(Collection collection) {
        d();
    }

    public BlockList() {
        this.i = new ArrayList();
        this.l = false;
        this.k = new fk();
    }

    public void onPause() {
        super.onPause();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        m8 m8Var = (m8) getListView().getItemAtPosition(((AdapterContextMenuInfo) contextMenuInfo).position);
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 0, 0, String.format(getString(R.string.block_list_menu_unblock), new Object[]{m8Var.a((Context) this)}));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = App.az;
        switch (menuItem.getItemId()) {
            case PBE.MD5 /*0*/:
                Intent intent = new Intent(this, ContactPicker.class);
                StringBuilder stringBuilder = new StringBuilder();
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    stringBuilder.append(((m8) it.next()).e).append(",");
                    if (i != 0) {
                        intent.putExtra(z[0], true);
                        intent.putExtra(z[1], stringBuilder.toString());
                        startActivityForResult(intent, 3);
                        break;
                    }
                }
                intent.putExtra(z[0], true);
                intent.putExtra(z[1], stringBuilder.toString());
                startActivityForResult(intent, 3);
            case 16908332:
                finish();
                break;
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onContextItemSelected(android.view.MenuItem r5) {
        /*
        r4_this = this;
        r0 = r5.getMenuInfo();
        r0 = (android.widget.AdapterView.AdapterContextMenuInfo) r0;
        r1 = r4.getListView();
        r0 = r0.position;
        r0 = r1.getItemAtPosition(r0);
        r0 = (com.whatsapp.m8) r0;
        r1 = r5.getItemId();	 Catch:{ NoSuchElementException -> 0x0045 }
        switch(r1) {
            case 0: goto L_0x001e;
            default: goto L_0x0019;
        };
    L_0x0019:
        r0 = super.onContextItemSelected(r5);
    L_0x001d:
        return r0;
    L_0x001e:
        r1 = com.whatsapp.App.a();	 Catch:{ NoSuchElementException -> 0x0047 }
        if (r1 != 0) goto L_0x0033;
    L_0x0024:
        r1 = r4.getBaseContext();	 Catch:{ NoSuchElementException -> 0x0049 }
        r2 = 2131624620; // 0x7f0e02ac float:1.8876425E38 double:1.0531624946E-314;
        r3 = 0;
        com.whatsapp.App.b(r1, r2, r3);	 Catch:{ NoSuchElementException -> 0x0049 }
        r1 = com.whatsapp.App.az;	 Catch:{ NoSuchElementException -> 0x0049 }
        if (r1 == 0) goto L_0x0043;
    L_0x0033:
        r1 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r4.showDialog(r1);	 Catch:{ NoSuchElementException -> 0x0049 }
        r1 = 0;
        r4.l = r1;	 Catch:{ NoSuchElementException -> 0x0049 }
        r1 = new com.whatsapp.rp;	 Catch:{ NoSuchElementException -> 0x0049 }
        r1.<init>(r4, r0);	 Catch:{ NoSuchElementException -> 0x0049 }
        com.whatsapp.util.br.a(r1);	 Catch:{ NoSuchElementException -> 0x0049 }
    L_0x0043:
        r0 = 1;
        goto L_0x001d;
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchElementException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchElementException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.BlockList.onContextItemSelected(android.view.MenuItem):boolean");
    }

    private void d() {
        b();
        this.j.notifyDataSetChanged();
    }

    public void onResume() {
        super.onResume();
    }

    static fk a(BlockList blockList) {
        return blockList.k;
    }
}
