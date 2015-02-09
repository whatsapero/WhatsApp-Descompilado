package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Messenger;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.b;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class SetStatus extends DialogToastActivity implements anq {
    static int j;
    private static SetStatus l;
    static int n;
    static int p;
    static ArrayList q;
    private static final String[] z;
    private String k;
    private View m;
    TextView o;
    private final Handler r;
    tb s;
    private final Handler t;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
        r6_this = this;
        r1 = com.whatsapp.App.az;
        r2 = new java.io.ObjectOutputStream;	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        r0 = com.whatsapp.App.p;	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        r3 = z;	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        r4 = 0;
        r0 = r0.openFileOutput(r3, r4);	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        r2.<init>(r0);	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        r3 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        r3.<init>();	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        r0 = q;	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        r4 = r0.iterator();	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
    L_0x001e:
        r0 = r4.hasNext();	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        if (r0 == 0) goto L_0x0035;
    L_0x0024:
        r0 = r4.next();	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        r0 = (java.lang.String) r0;	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        r0 = r3.append(r0);	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        r5 = "\n";
        r0.append(r5);	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        if (r1 == 0) goto L_0x001e;
    L_0x0035:
        r0 = r3.length();	 Catch:{ FileNotFoundException -> 0x0050, IOException -> 0x0057 }
        r1 = 1;
        if (r0 <= r1) goto L_0x0045;
    L_0x003c:
        r0 = r3.length();	 Catch:{ FileNotFoundException -> 0x0050, IOException -> 0x0057 }
        r0 = r0 + -1;
        r3.deleteCharAt(r0);	 Catch:{ FileNotFoundException -> 0x0050, IOException -> 0x0057 }
    L_0x0045:
        r0 = r3.toString();	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        r2.writeObject(r0);	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
        r2.close();	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
    L_0x004f:
        return;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0052, IOException -> 0x0057 }
    L_0x0052:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x004f;
    L_0x0057:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SetStatus.g():void");
    }

    static void a(SetStatus setStatus) {
        setStatus.i();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean f() {
        /*
        r8_this = this;
        r1 = 0;
        r2 = com.whatsapp.App.az;
        r0 = new java.io.File;	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r3 = r8.getFilesDir();	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r4 = z;	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r0.<init>(r3, r4);	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r0 = r0.exists();	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        if (r0 == 0) goto L_0x005d;
    L_0x0017:
        r3 = new java.io.ObjectInputStream;	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r0 = z;	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r4 = 5;
        r0 = r0[r4];	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r0 = r8.openFileInput(r0);	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r3.<init>(r0);	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r0 = r3.readObject();	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r0 = (java.lang.String) r0;	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r4 = new java.util.ArrayList;	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r4.<init>();	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        q = r4;	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r4 = "\n";
        r4 = r0.split(r4);	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r5 = r4.length;	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r0 = r1;
    L_0x003a:
        if (r0 >= r5) goto L_0x004d;
    L_0x003c:
        r6 = r4[r0];	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r7 = r6.length();	 Catch:{ ClassNotFoundException -> 0x0052, IOException -> 0x005f }
        if (r7 <= 0) goto L_0x0049;
    L_0x0044:
        r7 = q;	 Catch:{ ClassNotFoundException -> 0x0052, IOException -> 0x005f }
        r7.add(r6);	 Catch:{ ClassNotFoundException -> 0x0052, IOException -> 0x005f }
    L_0x0049:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x003a;
    L_0x004d:
        r3.close();	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
        r0 = 1;
    L_0x0051:
        return r0;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x005f }
    L_0x0054:
        r0 = move-exception;
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        com.whatsapp.util.Log.c(r2, r0);
    L_0x005d:
        r0 = r1;
        goto L_0x0051;
    L_0x005f:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SetStatus.f():boolean");
    }

    static void d(SetStatus setStatus) {
        setStatus.g();
    }

    public void b(String str) {
    }

    public void a(String str) {
        runOnUiThread(new s9(this, str));
    }

    public void c(String str) {
    }

    public void e(String str) {
        showDialog(2);
        this.k = str;
        if (!App.a(str, new pb(this), new ln(this), new r6(this))) {
            h();
        }
        this.r.sendEmptyMessageDelayed(0, 32000);
    }

    public SetStatus() {
        this.k = null;
        this.r = new iu(this);
        this.t = new Handler(new lk(this));
    }

    public void a() {
    }

    private void h() {
        this.r.removeMessages(0);
        this.r.sendEmptyMessage(0);
    }

    static void b(SetStatus setStatus) {
        setStatus.h();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, (int) R.string.delete_all).setIcon((int) R.drawable.ic_menu_delete);
        return true;
    }

    private void i() {
        al.a(App.p, b.STATUS_UPDATE_C, Integer.valueOf(1));
        this.r.removeMessages(0);
        if (this.k != null) {
            App.as = this.k;
            this.k = null;
            this.r.sendEmptyMessage(1);
            if (App.az == 0) {
                return;
            }
        }
        Log.e(z[1]);
    }

    static {
        String[] strArr = new String[8];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "P\u000f9JDP";
        int i2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 35;
                        break;
                    case ay.f /*1*/:
                        i4 = 123;
                        break;
                    case ay.n /*2*/:
                        i4 = 88;
                        break;
                    case ay.p /*3*/:
                        i4 = 62;
                        break;
                    default:
                        i4 = 49;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "P\u000f9JDP";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "c\bvIYB\u000f+_ASU6[E";
                    i = 3;
                    strArr2 = strArr3;
                    i2 = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "P\u000f9JDPT;LTB\u000f=";
                    i2 = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "P\u000f9JDP";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "P\u000f9JDP";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "@\t=_EFT+JPW\u000e+\u0011BF\t1_]J\u00019JXL\u0015\u0007[CQ\u0014*";
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    p = -1;
                    l = null;
                    n = 0;
                    j = 2;
                default:
                    strArr2[i] = str;
                    str = "P\u001e,MEB\u000f-M\u001eP\u000f9JDP\u000e(ZPW\u001e<\u0011EF\u0016(MEB\u000f-M\u0011J\bxPDO\u0017";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 1, 0, getString(R.string.delete_status));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
        r4_this = this;
        super.onCreate(r5);
        r0 = z;
        r1 = 4;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r4.getSupportActionBar();
        r1 = 1;
        r0.setDisplayHomeAsUpEnabled(r1);
        r0 = 2130903200; // 0x7f0300a0 float:1.7413211E38 double:1.0528060657E-314;
        r4.setContentView(r0);
        r0 = com.whatsapp.fieldstats.au.STATUS_VIEWS;
        com.whatsapp.ak4.a(r0);
        r0 = 2131427986; // 0x7f0b0292 float:1.8477604E38 double:1.0530653445E-314;
        r0 = r4.findViewById(r0);
        r4.m = r0;
        r0 = com.whatsapp.App.aY;
        if (r0 != 0) goto L_0x0032;
    L_0x002b:
        r4.b();
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x003c;
    L_0x0032:
        r0 = r4.m;
        r1 = new com.whatsapp.ako;
        r1.<init>(r4);
        r0.setOnClickListener(r1);
    L_0x003c:
        r0 = 2131427616; // 0x7f0b0120 float:1.8476853E38 double:1.0530651617E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r4.o = r0;
        r0 = r4.o;
        r1 = com.whatsapp.App.as;
        r2 = r4.getBaseContext();
        r1 = com.whatsapp.util.a5.d(r1, r2);
        r0.setText(r1);
        r0 = r4.f();
        if (r0 != 0) goto L_0x0062;
    L_0x005c:
        r0 = r4.c();
        q = r0;
    L_0x0062:
        r0 = 2131427990; // 0x7f0b0296 float:1.8477612E38 double:1.0530653464E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.ListView) r0;
        r1 = 2131427991; // 0x7f0b0297 float:1.8477614E38 double:1.053065347E-314;
        r1 = r4.findViewById(r1);
        r0.setEmptyView(r1);
        r1 = new com.whatsapp.tb;
        r2 = 2131427992; // 0x7f0b0298 float:1.8477616E38 double:1.0530653474E-314;
        r3 = q;
        r1.<init>(r4, r4, r2, r3);
        r4.s = r1;
        r1 = r4.s;
        r0.setAdapter(r1);
        r1 = new com.whatsapp.g2;
        r1.<init>(r4);
        r0.setOnItemClickListener(r1);
        r4.registerForContextMenu(r0);
        com.whatsapp.App.b(r4);
        r0 = 2131427613; // 0x7f0b011d float:1.8476847E38 double:1.05306516E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.am1.b(r0);
        r0 = 2131427988; // 0x7f0b0294 float:1.8477608E38 double:1.0530653455E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.am1.b(r0);
        l = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SetStatus.onCreate(android.os.Bundle):void");
    }

    public void b() {
        findViewById(R.id.progressbar_small).setVisibility(0);
        findViewById(R.id.round_more_btn).setVisibility(8);
        App.a(App.af() + z[3], 0, new Messenger(this.t));
    }

    public void a(Collection collection) {
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            String stringExtra = intent.getStringExtra(z[2]);
            if (i == n) {
                q.add(0, stringExtra);
                e(stringExtra);
                return;
            }
            if (p >= 0) {
                q.remove(p);
                q.add(p, stringExtra);
            }
            if (i == j) {
                e(stringExtra);
            }
        }
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                return ProgressDialog.show(this, getString(R.string.status_update_dialog_title), getString(R.string.status_update_dialog_message), true, false);
            case ay.f /*1*/:
                return ProgressDialog.show(this, getString(R.string.status_retrieve_dialog_title), getString(R.string.status_retrieve_dialog_message), true, false);
            case ay.n /*2*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.status_update_dialog_title));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case ay.p /*3*/:
                return new Builder(this).setMessage(R.string.delete_all_confirm).setPositiveButton(R.string.delete_all, new dg(this)).setNegativeButton(R.string.cancel, null).create();
            case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                return new kc(this, R.string.add_status, App.as, new yt(this), 139, 0, R.string.no_empty_status);
            default:
                return super.onCreateDialog(i);
        }
    }

    static View c(SetStatus setStatus) {
        return setStatus.m;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case PBE.MD5 /*0*/:
                if (q.size() == 0) {
                    a(R.string.no_statuses_to_delete);
                    if (App.az == 0) {
                        return true;
                    }
                }
                showDialog(3);
                return true;
            case 16908332:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public ArrayList c() {
        int i = App.az;
        ArrayList arrayList = new ArrayList();
        TypedArray obtainTypedArray = getResources().obtainTypedArray(R.array.default_statuses);
        int i2 = 0;
        while (i2 < obtainTypedArray.length()) {
            arrayList.add(obtainTypedArray.getString(i2));
            i2++;
            if (i != 0) {
                break;
            }
        }
        return arrayList;
    }

    protected void onDestroy() {
        super.onDestroy();
        App.a((anq) this);
        if (l == this) {
            l = null;
        }
    }

    public boolean onContextItemSelected(android.view.MenuItem menuItem) {
        AdapterContextMenuInfo adapterContextMenuInfo = (AdapterContextMenuInfo) menuItem.getMenuInfo();
        switch (menuItem.getItemId()) {
            case ay.f /*1*/:
                q.remove(adapterContextMenuInfo.position);
                p = -1;
                this.s.notifyDataSetChanged();
                g();
                break;
        }
        return true;
    }

    public void d(String str) {
    }
}
