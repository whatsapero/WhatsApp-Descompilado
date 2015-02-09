package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.au;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class MultipleContactPicker extends DialogToastListActivity implements anq {
    private static final String[] z;
    private View i;
    private int j;
    private ImageButton k;
    private final TextWatcher l;
    private ArrayList m;
    private EditText n;
    private fk o;
    private oe p;
    private boolean q;
    private int r;
    private boolean s;
    private ArrayList t;
    private Set u;
    private InputMethodManager v;

    static {
        String[] strArr = new String[10];
        String str = "\u001fI)#S\u0018I!";
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
                        i3 = 108;
                        break;
                    case ay.f /*1*/:
                        i3 = 44;
                        break;
                    case ay.n /*2*/:
                        i3 = 69;
                        break;
                    case ay.p /*3*/:
                        i3 = 70;
                        break;
                    default:
                        i3 = 48;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0000M<)E\u0018s,(V\u0000M1#B";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0005B53D3A 2X\u0003H";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0018E1*U";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0000E(/D3[$4^\u0005B\"\u0019B\t_*3B\u000fI\u001a5D\u001e";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0001Y)2Y\u001c@ %_\u0002X$%D\u001cE&-U\u001e\u0003&4U\rX ";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0002Ch+Q\u0018O-#C";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0002Ch+Q\u0018O-#C";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0001Y)2Y\u001c@ %_\u0002X$%D\u001cE&-U\u001e\u0003!#C\u0018^*?";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0000E(/D";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public MultipleContactPicker() {
        this.s = true;
        this.t = new ArrayList();
        this.m = new ArrayList();
        this.u = new HashSet();
        this.o = new fk();
        this.l = new dh(this);
    }

    public void d(String str) {
        if (!bd.b(str)) {
            m8 a = App.P.a(str);
            if (a != null) {
                try {
                    if (m8.a(this.t, new atd(a))) {
                        this.p.notifyDataSetChanged();
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
    }

    public void a() {
        d();
        this.p.notifyDataSetChanged();
    }

    public void onPause() {
        super.onPause();
        App.a((anq) this);
    }

    protected Dialog onCreateDialog(int i) {
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
        int i = App.az;
        Log.i(z[6]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        setContentView(getLayoutInflater().inflate(R.layout.multiple_contact_picker, null, false));
        this.r = getIntent().getIntExtra(z[1], -1);
        this.j = getIntent().getIntExtra(z[5], R.string.groupchat_reach_limit);
        setTitle(getIntent().getStringExtra(z[4]));
        View listView = getListView();
        try {
            if (VERSION.SDK_INT >= 11) {
                listView.setFastScrollAlwaysVisible(true);
                listView.setScrollBarStyle(33554432);
            }
            this.i = ((LayoutInflater) getBaseContext().getSystemService(z[2])).inflate(R.layout.multiple_contact_picker_search, listView, false);
            listView.addHeaderView(this.i);
            this.n = (EditText) this.i.findViewById(R.id.search_et);
            this.n.addTextChangedListener(this.l);
            b7.a(this.n);
            this.k = (ImageButton) this.i.findViewById(R.id.clear_search_btn);
            this.k.setOnClickListener(new oi(this));
            this.v = (InputMethodManager) getSystemService(z[3]);
            d();
            this.u = new HashSet();
            Object stringExtra = getIntent().getStringExtra(z[0]);
            if (!TextUtils.isEmpty(stringExtra)) {
                Object[] split = stringExtra.split(",");
                Iterator it = this.t.iterator();
                while (it.hasNext()) {
                    m8 m8Var = (m8) it.next();
                    try {
                        if (au.a(split, m8Var.e)) {
                            m8Var.k = true;
                            this.u.add(m8Var.e);
                            continue;
                        }
                        if (i != 0) {
                            break;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            try {
                listView.setEmptyView(findViewById(R.id.contacts_empty));
                listView.setFastScrollEnabled(true);
                listView.setScrollbarFadingEnabled(true);
                if (VERSION.SDK_INT < 11) {
                    listView.setSelector(R.drawable.selector_orange_gradient);
                }
                b(this.u.size());
                this.p = new oe(this, this, R.layout.multiple_contact_picker_row, this.m);
                setListAdapter(this.p);
                bp.a(this, getSupportActionBar(), getString(R.string.done), new da(this));
                findViewById(R.id.button_tell_a_friend).setOnClickListener(new v0(this));
                registerForContextMenu(listView);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    static EditText c(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.n;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
        r8_this = this;
        r2 = com.whatsapp.App.az;
        r3 = r8.t;
        monitor-enter(r3);
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x00af }
        r1.<init>();	 Catch:{ all -> 0x00af }
        r0 = r8.t;	 Catch:{ all -> 0x00af }
        r4 = r0.iterator();	 Catch:{ all -> 0x00af }
    L_0x0010:
        r0 = r4.hasNext();	 Catch:{ all -> 0x00af }
        if (r0 == 0) goto L_0x0027;
    L_0x0016:
        r0 = r4.next();	 Catch:{ all -> 0x00af }
        r0 = (com.whatsapp.m8) r0;	 Catch:{ all -> 0x00af }
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        r5 = r0.k;	 Catch:{ IllegalArgumentException -> 0x00ab }
        if (r5 == 0) goto L_0x0025;
    L_0x0022:
        r1.add(r0);	 Catch:{ IllegalArgumentException -> 0x00ad }
    L_0x0025:
        if (r2 == 0) goto L_0x0010;
    L_0x0027:
        r0 = r8.t;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r0.clear();	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r0 = com.whatsapp.App.P;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r4 = r8.t;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r0.d(r4);	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r0 = r8.t;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r4 = 20;
        if (r0 >= r4) goto L_0x004d;
    L_0x003d:
        r0 = r8.i;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r4 = 2131427916; // 0x7f0b024c float:1.8477462E38 double:1.05306531E-314;
        r0 = r0.findViewById(r4);	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x00b2 }
        if (r2 == 0) goto L_0x005a;
    L_0x004d:
        r0 = r8.i;	 Catch:{ IllegalArgumentException -> 0x00b4 }
        r4 = 2131427916; // 0x7f0b024c float:1.8477462E38 double:1.05306531E-314;
        r0 = r0.findViewById(r4);	 Catch:{ IllegalArgumentException -> 0x00b4 }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x00b4 }
    L_0x005a:
        r4 = new com.whatsapp.kf;	 Catch:{ all -> 0x00af }
        r0 = r8.getApplicationContext();	 Catch:{ all -> 0x00af }
        r4.<init>(r0);	 Catch:{ all -> 0x00af }
        r5 = r1.iterator();	 Catch:{ all -> 0x00af }
    L_0x0067:
        r0 = r5.hasNext();	 Catch:{ all -> 0x00af }
        if (r0 == 0) goto L_0x0098;
    L_0x006d:
        r0 = r5.next();	 Catch:{ all -> 0x00af }
        r0 = (com.whatsapp.m8) r0;	 Catch:{ all -> 0x00af }
        r1 = r8.t;	 Catch:{ all -> 0x00af }
        r6 = r1.iterator();	 Catch:{ all -> 0x00af }
    L_0x0079:
        r1 = r6.hasNext();	 Catch:{ all -> 0x00af }
        if (r1 == 0) goto L_0x0096;
    L_0x007f:
        r1 = r6.next();	 Catch:{ all -> 0x00af }
        r1 = (com.whatsapp.m8) r1;	 Catch:{ all -> 0x00af }
        if (r0 == 0) goto L_0x0094;
    L_0x0087:
        if (r1 == 0) goto L_0x0094;
    L_0x0089:
        r7 = r4.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        if (r7 != 0) goto L_0x0094;
    L_0x008f:
        r7 = 1;
        r1.k = r7;	 Catch:{ IllegalArgumentException -> 0x00b8 }
        if (r2 == 0) goto L_0x0079;
    L_0x0094:
        if (r2 == 0) goto L_0x0079;
    L_0x0096:
        if (r2 == 0) goto L_0x0067;
    L_0x0098:
        r0 = r8.t;	 Catch:{ all -> 0x00af }
        r1 = new com.whatsapp.kf;	 Catch:{ all -> 0x00af }
        r2 = r8.getApplicationContext();	 Catch:{ all -> 0x00af }
        r1.<init>(r2);	 Catch:{ all -> 0x00af }
        java.util.Collections.sort(r0, r1);	 Catch:{ all -> 0x00af }
        r8.b();	 Catch:{ all -> 0x00af }
        monitor-exit(r3);	 Catch:{ all -> 0x00af }
        return;
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00af }
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00af }
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b8 }
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00af }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MultipleContactPicker.d():void");
    }

    public void onDestroy() {
        Log.i(z[9]);
        super.onDestroy();
        this.t.clear();
        this.m.clear();
        this.o.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(java.lang.String r9) {
        /*
        r8_this = this;
        r1 = com.whatsapp.App.az;
        r2 = r8.m;
        monitor-enter(r2);
        r0 = r8.m;	 Catch:{ all -> 0x0082 }
        r0.clear();	 Catch:{ all -> 0x0082 }
        r3 = r9.toLowerCase();	 Catch:{ all -> 0x0082 }
        r0 = r8.t;	 Catch:{ all -> 0x0082 }
        r4 = r0.iterator();	 Catch:{ all -> 0x0082 }
    L_0x0014:
        r0 = r4.hasNext();	 Catch:{ all -> 0x0082 }
        if (r0 == 0) goto L_0x0052;
    L_0x001a:
        r0 = r4.next();	 Catch:{ all -> 0x0082 }
        r0 = (com.whatsapp.m8) r0;	 Catch:{ all -> 0x0082 }
        r5 = r0.h;	 Catch:{ all -> 0x0082 }
        if (r5 == 0) goto L_0x0050;
    L_0x0024:
        r5 = r0.a(r8);	 Catch:{ all -> 0x0082 }
        r5 = r5.toLowerCase();	 Catch:{ all -> 0x0082 }
        r6 = r5.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x007e }
        if (r6 != 0) goto L_0x004b;
    L_0x0032:
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007e }
        r6.<init>();	 Catch:{ IllegalArgumentException -> 0x007e }
        r7 = " ";
        r6 = r6.append(r7);	 Catch:{ IllegalArgumentException -> 0x007e }
        r6 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x007e }
        r6 = r6.toString();	 Catch:{ IllegalArgumentException -> 0x007e }
        r5 = r5.contains(r6);	 Catch:{ IllegalArgumentException -> 0x007e }
        if (r5 == 0) goto L_0x0050;
    L_0x004b:
        r5 = r8.m;	 Catch:{ IllegalArgumentException -> 0x0080 }
        r5.add(r0);	 Catch:{ IllegalArgumentException -> 0x0080 }
    L_0x0050:
        if (r1 == 0) goto L_0x0014;
    L_0x0052:
        r0 = r8.m;	 Catch:{ all -> 0x0082 }
        r0 = r0.size();	 Catch:{ all -> 0x0082 }
        if (r0 != 0) goto L_0x0069;
    L_0x005a:
        r0 = new com.whatsapp.m8;	 Catch:{ all -> 0x0082 }
        r1 = z;	 Catch:{ all -> 0x0082 }
        r3 = 7;
        r1 = r1[r3];	 Catch:{ all -> 0x0082 }
        r0.<init>(r1);	 Catch:{ all -> 0x0082 }
        r1 = r8.m;	 Catch:{ all -> 0x0082 }
        r1.add(r0);	 Catch:{ all -> 0x0082 }
    L_0x0069:
        monitor-exit(r2);	 Catch:{ all -> 0x0082 }
        r0 = r8.m;
        r1 = new com.whatsapp.kf;
        r2 = r8.getApplicationContext();
        r1.<init>(r2);
        java.util.Collections.sort(r0, r1);
        r0 = r8.p;
        r0.notifyDataSetChanged();
        return;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0082 }
    L_0x0082:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0082 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MultipleContactPicker.e(java.lang.String):void");
    }

    static int a(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.r;
    }

    static ArrayList i(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.t;
    }

    public void a(String str) {
        m8 a = App.P.a(str);
        if (a != null) {
            try {
                if (m8.a(this.t, new aty(a))) {
                    this.p.notifyDataSetChanged();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    static boolean d(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.s;
    }

    static Set f(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.u;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onContextItemSelected(android.view.MenuItem r3) {
        /*
        r2_this = this;
        r0 = r3.getMenuInfo();
        r0 = (android.widget.AdapterView.AdapterContextMenuInfo) r0;
        r1 = r2.getListView();
        r0 = r0.position;
        r0 = r1.getItemAtPosition(r0);
        r0 = (com.whatsapp.m8) r0;
        r1 = r3.getItemId();	 Catch:{ IllegalArgumentException -> 0x003d }
        switch(r1) {
            case 0: goto L_0x001e;
            default: goto L_0x0019;
        };
    L_0x0019:
        r0 = super.onContextItemSelected(r3);
    L_0x001d:
        return r0;
    L_0x001e:
        r1 = com.whatsapp.App.a();	 Catch:{ IllegalArgumentException -> 0x003f }
        if (r1 != 0) goto L_0x002e;
    L_0x0024:
        r1 = 2131624620; // 0x7f0e02ac float:1.8876425E38 double:1.0531624946E-314;
        r2.a(r1);	 Catch:{ IllegalArgumentException -> 0x003f }
        r1 = com.whatsapp.App.az;	 Catch:{ IllegalArgumentException -> 0x003f }
        if (r1 == 0) goto L_0x003b;
    L_0x002e:
        r1 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r2.showDialog(r1);
        r1 = new com.whatsapp.a_p;
        r1.<init>(r2, r0);
        com.whatsapp.util.br.a(r1);
    L_0x003b:
        r0 = 1;
        goto L_0x001d;
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MultipleContactPicker.onContextItemSelected(android.view.MenuItem):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r4_this = this;
        r1 = com.whatsapp.App.az;
        r0 = r4.m;	 Catch:{ IllegalArgumentException -> 0x002e }
        if (r0 == 0) goto L_0x000b;
    L_0x0006:
        r0 = r4.m;	 Catch:{ IllegalArgumentException -> 0x002e }
        r0.clear();	 Catch:{ IllegalArgumentException -> 0x002e }
    L_0x000b:
        r0 = r4.t;
        r2 = r0.iterator();
    L_0x0011:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0024;
    L_0x0017:
        r0 = r2.next();
        r0 = (com.whatsapp.m8) r0;
        r3 = r4.m;
        r3.add(r0);
        if (r1 == 0) goto L_0x0011;
    L_0x0024:
        r0 = r4.p;	 Catch:{ IllegalArgumentException -> 0x0030 }
        if (r0 == 0) goto L_0x002d;
    L_0x0028:
        r0 = r4.p;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r0.notifyDataSetChanged();	 Catch:{ IllegalArgumentException -> 0x0030 }
    L_0x002d:
        return;
    L_0x002e:
        r0 = move-exception;
        throw r0;
    L_0x0030:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MultipleContactPicker.b():void");
    }

    public void onBackPressed() {
        try {
            if (this.q) {
                b();
                this.q = false;
                this.n.setText("");
                try {
                    if (App.az == 0) {
                        return;
                    }
                }
            }
            super.onBackPressed();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static boolean a(MultipleContactPicker multipleContactPicker, boolean z) {
        multipleContactPicker.q = z;
        return z;
    }

    public boolean onSearchRequested() {
        try {
            if (!this.q) {
                if (this.t.size() > 0) {
                    findViewById(R.id.search_view).setVisibility(0);
                    this.v.toggleSoftInput(0, 0);
                    this.n.requestFocus();
                    this.n.setText("");
                    getListView().post(new f8(this));
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void a(Collection collection) {
        this.p.notifyDataSetChanged();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case 16908332:
                    finish();
                    break;
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static boolean a(m8 m8Var) {
        return b(m8Var);
    }

    static int e(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.j;
    }

    static void h(MultipleContactPicker multipleContactPicker) {
        multipleContactPicker.b();
    }

    static ImageButton b(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.k;
    }

    public void b(String str) {
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        m8 m8Var = (m8) getListView().getItemAtPosition(((AdapterContextMenuInfo) contextMenuInfo).position);
        if (m8Var != null) {
            try {
                if (!b(m8Var)) {
                    try {
                        if (App.c(m8Var.e)) {
                            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
                            contextMenu.add(0, 0, 0, String.format(getString(R.string.block_list_menu_unblock), new Object[]{m8Var.N}));
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    public void onResume() {
        super.onResume();
        App.b((anq) this);
        this.p.notifyDataSetChanged();
    }

    static fk g(MultipleContactPicker multipleContactPicker) {
        return multipleContactPicker.o;
    }

    private void b(int i) {
        getSupportActionBar().setSubtitle(String.format(App.aX.a(R.plurals.n_contacts_selected, i), new Object[]{Integer.valueOf(i)}));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    static void a(MultipleContactPicker multipleContactPicker, int i) {
        multipleContactPicker.b(i);
    }

    public void c(String str) {
        m8 a = App.P.a(str);
        if (a != null) {
            try {
                if (m8.a(this.t, new atw(a))) {
                    this.p.notifyDataSetChanged();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    private static boolean b(m8 m8Var) {
        return z[8].equals(m8Var.e);
    }

    static void a(MultipleContactPicker multipleContactPicker, String str) {
        multipleContactPicker.e(str);
    }
}
