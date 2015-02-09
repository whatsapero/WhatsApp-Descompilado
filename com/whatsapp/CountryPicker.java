package com.whatsapp;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockListActivity;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class CountryPicker extends SherlockListActivity {
    public static final String f;
    public static final String g;
    private static final String[] z;
    private ImageButton b;
    private TextWatcher c;
    private a d;
    private EditText e;

    static ImageButton a(CountryPicker countryPicker) {
        return countryPicker.b;
    }

    public void onBackPressed() {
        try {
            if (!TextUtils.isEmpty(this.e.getText())) {
                this.e.setText("");
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

    static EditText b(CountryPicker countryPicker) {
        return countryPicker.e;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            if (menuItem.getItemId() != 16908332) {
                return false;
            }
            finish();
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

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
        r8 = 32;
        r9 = 12;
        r3 = 1;
        r1 = -1;
        r2 = 0;
        r0 = 3;
        r4 = new java.lang.String[r0];
        r0 = "X3UbMI%PeZP9R#VU?RiXO9\u0000~\\X9Iz\\_|iC|C?E|MR3N,_I3M,zT)NxKB\fHcW^\u0015NjV";
        r5 = r2;
        r6 = r4;
        r7 = r4;
        r4 = r0;
        r0 = r1;
    L_0x0011:
        r4 = r4.toCharArray();
        r10 = r4.length;
        r11 = r10;
        r12 = r2;
        r10 = r4;
    L_0x0019:
        if (r11 > r12) goto L_0x0083;
    L_0x001b:
        r4 = new java.lang.String;
        r4.<init>(r10);
        r4 = r4.intern();
        switch(r0) {
            case 0: goto L_0x0030;
            case 1: goto L_0x003a;
            default: goto L_0x0027;
        };
    L_0x0027:
        r6[r5] = r4;
        r0 = "X3UbMI%PeZP9R#ZI9Ax\\";
        r4 = r0;
        r5 = r3;
        r6 = r7;
        r0 = r2;
        goto L_0x0011;
    L_0x0030:
        r6[r5] = r4;
        r4 = 2;
        r0 = "X3UbMI%PeZP9R#]^/T~VB";
        r5 = r4;
        r6 = r7;
        r4 = r0;
        r0 = r3;
        goto L_0x0011;
    L_0x003a:
        r6[r5] = r4;
        z = r7;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = com.whatsapp.CountryPicker.class;
        r3 = r3.getName();
        r3 = r0.append(r3);
        r0 = "\u0015\u0019xXkz\u0003cClu\brUfr\u000fo";
    L_0x004f:
        r0 = r0.toCharArray();
        r4 = r0.length;
        r5 = r4;
        r6 = r2;
        r4 = r0;
    L_0x0057:
        if (r5 > r6) goto L_0x009e;
    L_0x0059:
        r0 = new java.lang.String;
        r0.<init>(r4);
        r0 = r0.intern();
        switch(r1) {
            case 0: goto L_0x00b9;
            default: goto L_0x0065;
        };
    L_0x0065:
        r0 = r3.append(r0);
        r0 = r0.toString();
        g = r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = com.whatsapp.CountryPicker.class;
        r1 = r1.getName();
        r1 = r0.append(r1);
        r0 = "\u0015\u0019xXkz\u0003cClu\brUf\u007f\u0015s\\uz\u0005\u007fBxv\u0019";
        r3 = r1;
        r1 = r2;
        goto L_0x004f;
    L_0x0083:
        r13 = r10[r12];
        r4 = r12 % 5;
        switch(r4) {
            case 0: goto L_0x0094;
            case 1: goto L_0x0097;
            case 2: goto L_0x009a;
            case 3: goto L_0x009c;
            default: goto L_0x008a;
        };
    L_0x008a:
        r4 = 57;
    L_0x008c:
        r4 = r4 ^ r13;
        r4 = (char) r4;
        r10[r12] = r4;
        r4 = r12 + 1;
        r12 = r4;
        goto L_0x0019;
    L_0x0094:
        r4 = 59;
        goto L_0x008c;
    L_0x0097:
        r4 = 92;
        goto L_0x008c;
    L_0x009a:
        r4 = r8;
        goto L_0x008c;
    L_0x009c:
        r4 = r9;
        goto L_0x008c;
    L_0x009e:
        r7 = r4[r6];
        r0 = r6 % 5;
        switch(r0) {
            case 0: goto L_0x00af;
            case 1: goto L_0x00b2;
            case 2: goto L_0x00b5;
            case 3: goto L_0x00b7;
            default: goto L_0x00a5;
        };
    L_0x00a5:
        r0 = 57;
    L_0x00a7:
        r0 = r0 ^ r7;
        r0 = (char) r0;
        r4[r6] = r0;
        r0 = r6 + 1;
        r6 = r0;
        goto L_0x0057;
    L_0x00af:
        r0 = 59;
        goto L_0x00a7;
    L_0x00b2:
        r0 = 92;
        goto L_0x00a7;
    L_0x00b5:
        r0 = r8;
        goto L_0x00a7;
    L_0x00b7:
        r0 = r9;
        goto L_0x00a7;
    L_0x00b9:
        r0 = r3.append(r0);
        r0 = r0.toString();
        f = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.CountryPicker.<clinit>():void");
    }

    protected void onDestroy() {
        Log.i(z[2]);
        this.e.removeTextChangedListener(this.c);
        super.onDestroy();
    }

    public CountryPicker() {
        this.c = new b2(this);
    }

    public void onCreate(Bundle bundle) {
        int i = App.az;
        Log.i(z[1]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.country_picker);
        Object arrayList = new ArrayList();
        try {
            Iterator it = ats.a().iterator();
            while (it.hasNext()) {
                vt vtVar = (vt) it.next();
                arrayList.add(new a5g(vtVar.b, String.valueOf(vtVar.c), vtVar.f, vtVar.d));
                if (i != 0) {
                    break;
                }
            }
        } catch (IOException e) {
            Log.e(z[0]);
            arrayList.clear();
        }
        ViewGroup listView = getListView();
        View inflate = getLayoutInflater().inflate(R.layout.multiple_contact_picker_search, listView, false);
        try {
            listView.addHeaderView(inflate);
            this.e = (EditText) inflate.findViewById(R.id.search_et);
            this.e.addTextChangedListener(this.c);
            b7.a(this.e);
            this.b = (ImageButton) inflate.findViewById(R.id.clear_search_btn);
            this.b.setOnClickListener(new _k(this));
            this.d = new a(this, R.layout.country_picker_row, arrayList, getIntent().getStringExtra(g), getIntent().getStringExtra(f));
            setListAdapter(this.d);
            listView.setOnItemClickListener(new ann(this));
            listView.setFastScrollEnabled(true);
            listView.setScrollbarFadingEnabled(true);
            if (VERSION.SDK_INT >= 11) {
                listView.setFastScrollAlwaysVisible(true);
                listView.setScrollBarStyle(33554432);
                if (i == 0) {
                    return;
                }
            }
            listView.setSelector(R.drawable.selector_orange_gradient);
        } catch (IOException e2) {
            throw e2;
        } catch (IOException e22) {
            throw e22;
        }
    }

    static a c(CountryPicker countryPicker) {
        return countryPicker.d;
    }
}
