package com.whatsapp;

import android.widget.BaseAdapter;
import android.widget.ListView;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.bm;
import com.whatsapp.util.bo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;

public class MessageDetailsActivity extends DialogToastActivity {
    public static String j;
    public static String n;
    private static final String[] z;
    private ArrayList k;
    private final Runnable l;
    private ListView m;
    private final fk o;
    private b p;
    private long q;
    private final fc r;
    private final anq s;
    private ConversationRow t;
    private BaseAdapter u;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
        r13_this = this;
        r9 = -2;
        r3 = 1;
        r12 = 0;
        r1 = 0;
        r6 = com.whatsapp.App.az;
        r0 = z;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r4 = 9;
        r13.requestWindowFeature(r4);
        super.onCreate(r14);
        r0 = r13.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r3);
        r0 = 2130903171; // 0x7f030083 float:1.7413152E38 double:1.0528060514E-314;
        r13.setContentView(r0);
        r0 = r13.getSupportActionBar();
        r2 = r13.getResources();
        r4 = 2130837618; // 0x7f020072 float:1.7280195E38 double:1.052773664E-314;
        r2 = r2.getDrawable(r4);
        r2 = r2.mutate();
        r0.setBackgroundDrawable(r2);
        r0.setDisplayShowHomeEnabled(r1);
        r0 = r13.getIntent();
        if (r0 != 0) goto L_0x0045;
    L_0x0041:
        r13.finish();
    L_0x0044:
        return;
    L_0x0045:
        r4 = com.whatsapp.App.aJ;
        r5 = new com.whatsapp.protocol.m;
        r7 = n;
        r7 = r0.getStringExtra(r7);
        r8 = j;
        r0 = r0.getStringExtra(r8);
        r5.<init>(r7, r3, r0);
        r0 = r4.b(r5);
        r13.p = r0;
        r0 = r13.p;
        if (r0 != 0) goto L_0x0066;
    L_0x0062:
        r13.finish();
        goto L_0x0044;
    L_0x0066:
        r13.b();
        r0 = 16908298; // 0x102000a float:2.3877257E-38 double:8.353809E-317;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.ListView) r0;
        r13.m = r0;
        r0 = r13.p;
        r0 = com.whatsapp.Conversation.a(r13, r0);
        r13.t = r0;
        r0 = r13.t;
        r0.setOnLongClickListener(r12);
        r0 = r13.getLayoutInflater();
        r4 = 2130903172; // 0x7f030084 float:1.7413154E38 double:1.052806052E-314;
        r0 = r0.inflate(r4, r12, r1);
        r0 = (android.view.ViewGroup) r0;
        r4 = 2131427532; // 0x7f0b00cc float:1.8476683E38 double:1.05306512E-314;
        r4 = r0.findViewById(r4);
        r4 = (android.view.ViewGroup) r4;
        r5 = r13.t;
        r4.addView(r5, r9, r9);
        r5 = r13.getWindowManager();
        r5 = r5.getDefaultDisplay();
        r5 = r5.getWidth();
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7);
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r1);
        r4.measure(r5, r7);
        r5 = r13.getWindowManager();
        r5 = r5.getDefaultDisplay();
        r5 = r5.getHeight();
        r5 = r5 / 2;
        r7 = r4.getMeasuredHeight();
        if (r7 <= r5) goto L_0x0178;
    L_0x00c9:
        if (r3 == 0) goto L_0x00d9;
    L_0x00cb:
        r7 = r13.m;
        r7 = r7.getViewTreeObserver();
        r8 = new com.whatsapp.jp;
        r8.<init>(r13);
        r7.addOnGlobalLayoutListener(r8);
    L_0x00d9:
        r7 = r13.m;
        r7.addHeaderView(r0, r12, r1);
        r7 = new android.widget.ImageView;
        r7.<init>(r13);
        r8 = 2130838347; // 0x7f02034b float:1.7281674E38 double:1.052774024E-314;
        r7.setImageResource(r8);
        r8 = android.widget.ImageView.ScaleType.FIT_XY;
        r7.setScaleType(r8);
        r8 = r13.m;
        r8.addHeaderView(r7, r12, r1);
        r7 = new android.view.View;
        r7.<init>(r13);
        r8 = new android.widget.AbsListView$LayoutParams;
        r9 = -1;
        r10 = r13.getResources();
        r11 = 2131361814; // 0x7f0a0016 float:1.834339E38 double:1.053032651E-314;
        r10 = r10.getDimensionPixelSize(r11);
        r8.<init>(r9, r10);
        r7.setLayoutParams(r8);
        r8 = r13.m;
        r8.addFooterView(r7, r12, r1);
        r1 = r13.p;
        r1 = r1.e;
        r1 = r1.c;
        r1 = com.whatsapp.bd.b(r1);
        if (r1 != 0) goto L_0x0129;
    L_0x011d:
        r1 = r13.p;
        r1 = r1.e;
        r1 = r1.c;
        r1 = com.whatsapp.m8.b(r1);
        if (r1 == 0) goto L_0x0132;
    L_0x0129:
        r1 = new com.whatsapp.asj;
        r1.<init>(r13);
        r13.u = r1;
        if (r6 == 0) goto L_0x0139;
    L_0x0132:
        r1 = new com.whatsapp.avb;
        r1.<init>(r13, r12);
        r13.u = r1;
    L_0x0139:
        r1 = r13.m;
        r7 = r13.u;
        r1.setAdapter(r7);
        r1 = com.whatsapp.wallpaper.p.f(r13);
        if (r1 == 0) goto L_0x0150;
    L_0x0146:
        r7 = new com.whatsapp.a3c;
        r7.<init>(r13, r1, r0);
        r0.setBackgroundDrawable(r7);
        if (r6 == 0) goto L_0x0156;
    L_0x0150:
        r1 = 2131296282; // 0x7f09001a float:1.8210476E38 double:1.053000274E-314;
        r0.setBackgroundResource(r1);
    L_0x0156:
        r6 = r13.m;
        r0 = new com.whatsapp.u6;
        r1 = r13;
        r0.<init>(r1, r2, r3, r4, r5);
        r6.setOnScrollListener(r0);
        r0 = com.whatsapp.App.aJ;
        r1 = r13.r;
        r0.b(r1);
        r0 = r13.s;
        com.whatsapp.App.b(r0);
        r0 = r13.p;
        r0 = r0.e;
        r0 = r0.c;
        com.whatsapp.util.bo.c(r0);
        goto L_0x0044;
    L_0x0178:
        r3 = r1;
        goto L_0x00c9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MessageDetailsActivity.onCreate(android.os.Bundle):void");
    }

    private void a() {
        App.p.U().removeCallbacks(this.l);
        if (this.q != Long.MAX_VALUE) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.q;
            if (j < 3600000) {
                App.p.U().postDelayed(this.l, (((this.q + ((j / 60000) * 60000)) + 60000) - currentTimeMillis) + 1000);
                if (App.az == 0) {
                    return;
                }
            }
            if (j < 86400000) {
                App.p.U().postDelayed(this.l, (((((j / 3600000) * 3600000) + this.q) + 3600000) - currentTimeMillis) + 1000);
            }
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
        r7 = 72;
        r8 = 38;
        r9 = 20;
        r1 = -1;
        r2 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r0 = "\"-Ug>(-Bq+.!Jgp+-U`- 1";
        r4 = r2;
        r5 = r3;
        r6 = r3;
        r3 = r0;
        r0 = r1;
    L_0x0012:
        r3 = r3.toCharArray();
        r10 = r3.length;
        r11 = r10;
        r12 = r2;
        r10 = r3;
    L_0x001a:
        if (r11 > r12) goto L_0x0054;
    L_0x001c:
        r3 = new java.lang.String;
        r3.<init>(r10);
        r3 = r3.intern();
        switch(r0) {
            case 0: goto L_0x0032;
            default: goto L_0x0028;
        };
    L_0x0028:
        r5[r4] = r3;
        r3 = 1;
        r0 = "\"-Ug>(-Bq+.!Jgp,:Cu+*";
        r4 = r3;
        r5 = r6;
        r3 = r0;
        r0 = r2;
        goto L_0x0012;
    L_0x0032:
        r5[r4] = r3;
        z = r6;
        r0 = "$-_K6+";
    L_0x0038:
        r0 = r0.toCharArray();
        r3 = r0.length;
        r4 = r3;
        r5 = r2;
        r3 = r0;
    L_0x0040:
        if (r4 > r5) goto L_0x006e;
    L_0x0042:
        r0 = new java.lang.String;
        r0.<init>(r3);
        r0 = r0.intern();
        switch(r1) {
            case 0: goto L_0x0088;
            default: goto L_0x004e;
        };
    L_0x004e:
        j = r0;
        r0 = "$-_K-*%I`:\u0010\"Op";
        r1 = r2;
        goto L_0x0038;
    L_0x0054:
        r13 = r10[r12];
        r3 = r12 % 5;
        switch(r3) {
            case 0: goto L_0x0065;
            case 1: goto L_0x0068;
            case 2: goto L_0x006a;
            case 3: goto L_0x006c;
            default: goto L_0x005b;
        };
    L_0x005b:
        r3 = 95;
    L_0x005d:
        r3 = r3 ^ r13;
        r3 = (char) r3;
        r10[r12] = r3;
        r3 = r12 + 1;
        r12 = r3;
        goto L_0x001a;
    L_0x0065:
        r3 = 79;
        goto L_0x005d;
    L_0x0068:
        r3 = r7;
        goto L_0x005d;
    L_0x006a:
        r3 = r8;
        goto L_0x005d;
    L_0x006c:
        r3 = r9;
        goto L_0x005d;
    L_0x006e:
        r6 = r3[r5];
        r0 = r5 % 5;
        switch(r0) {
            case 0: goto L_0x007f;
            case 1: goto L_0x0082;
            case 2: goto L_0x0084;
            case 3: goto L_0x0086;
            default: goto L_0x0075;
        };
    L_0x0075:
        r0 = 95;
    L_0x0077:
        r0 = r0 ^ r6;
        r0 = (char) r0;
        r3[r5] = r0;
        r0 = r5 + 1;
        r5 = r0;
        goto L_0x0040;
    L_0x007f:
        r0 = 79;
        goto L_0x0077;
    L_0x0082:
        r0 = r7;
        goto L_0x0077;
    L_0x0084:
        r0 = r8;
        goto L_0x0077;
    L_0x0086:
        r0 = r9;
        goto L_0x0077;
    L_0x0088:
        n = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MessageDetailsActivity.<clinit>():void");
    }

    public void onDestroy() {
        Log.i(z[0]);
        super.onDestroy();
        this.o.a();
        App.p.U().removeCallbacks(this.l);
        App.aJ.a(this.r);
        App.a(this.s);
        bo.a(this.p.e.c);
    }

    static b d(MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.p;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    static void g(MessageDetailsActivity messageDetailsActivity) {
        messageDetailsActivity.a();
    }

    static ConversationRow f(MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.t;
    }

    static ListView b(MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.m;
    }

    static BaseAdapter e(MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.u;
    }

    static CharSequence a(MessageDetailsActivity messageDetailsActivity, long j) {
        return messageDetailsActivity.a(j);
    }

    private boolean a(String str) {
        int i = App.az;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (!str.equals(((xx) it.next()).a)) {
                if (i != 0) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    private void b() {
        int i;
        int i2;
        int i3 = App.az;
        this.k.clear();
        this.q = Long.MAX_VALUE;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (Entry entry : App.aJ.c(this.p.e).a.entrySet()) {
            pj pjVar = (pj) entry.getValue();
            this.k.add(new xx((String) entry.getKey(), pjVar));
            long a = pjVar.a(5);
            long a2 = pjVar.a(13);
            long a3 = pjVar.a(8);
            if (a != 0) {
                this.q = Math.min(this.q, a);
                i = i6 + 1;
            } else {
                i = i6;
            }
            if (a2 != 0) {
                this.q = Math.min(this.q, a2);
                i2 = i4 + 1;
            } else {
                i2 = i4;
            }
            if (a3 != 0) {
                this.q = Math.min(this.q, a3);
                i6 = i5 + 1;
            } else {
                i6 = i5;
            }
            if (i3 != 0) {
                break;
            }
            i4 = i2;
            i5 = i6;
            i6 = i;
        }
        i = i6;
        i2 = i4;
        i6 = i5;
        if (bd.b(this.p.e.c) || m8.b(this.p.e.c)) {
            if (i6 < this.p.y && this.p.j == 2 && this.p.w == 1) {
                this.k.add(new xj(this.p.y - i6, 8));
            }
            if (i2 < this.p.y) {
                this.k.add(new xj(this.p.y - i2, 13));
            }
            if (i < this.p.y) {
                this.k.add(new xj(this.p.y - i, 5));
            }
        }
        Collections.sort(this.k, new any(this));
        if (this.u != null) {
            this.u.notifyDataSetChanged();
        }
        a();
    }

    static boolean a(MessageDetailsActivity messageDetailsActivity, String str) {
        return messageDetailsActivity.a(str);
    }

    static fk a(MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.o;
    }

    private CharSequence a(long j) {
        return bm.a(getBaseContext(), App.c(j));
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

    static ArrayList h(MessageDetailsActivity messageDetailsActivity) {
        return messageDetailsActivity.k;
    }

    public MessageDetailsActivity() {
        this.o = new fk();
        this.k = new ArrayList();
        this.r = new gm(this);
        this.s = new c7(this);
        this.l = new zf(this);
    }

    static void c(MessageDetailsActivity messageDetailsActivity) {
        messageDetailsActivity.b();
    }
}
