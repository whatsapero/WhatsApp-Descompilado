package com.whatsapp;

import android.app.Activity;
import android.location.Location;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.View;
import android.widget.ListView;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.cn;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class am {
    private static final String z;
    private View a;
    private final fc b;
    private Handler c;
    private String d;
    private Runnable e;
    protected ArrayList f;
    private int g;
    private Activity h;
    protected ArrayList i;
    private a3y j;
    private ListView k;
    private final anq l;
    private long m;
    private fk n;
    private a88 o;

    static {
        char[] toCharArray = "=A\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 87;
                    break;
                case ay.f /*1*/:
                    i2 = 40;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 99;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public abstract void a(cn cnVar, boolean z);

    public abstract void d();

    public abstract Location f();

    static a88 f(am amVar) {
        return amVar.o;
    }

    static Handler e(am amVar) {
        return amVar.c;
    }

    static fk h(am amVar) {
        return amVar.n;
    }

    static long c(am amVar) {
        return amVar.m;
    }

    private void e() {
        this.h.runOnUiThread(new po(this));
    }

    public void a(Activity activity) {
        this.h = activity;
        this.d = activity.getIntent().getStringExtra(z);
        this.i = lh.b.c(this.d);
        this.k = (ListView) activity.findViewById(16908298);
        this.k.setOnItemClickListener(new bs(this));
        this.a = activity.findViewById(R.id.list_holder);
        this.a.setVisibility(8);
        this.o = new a88(this, activity, this.i);
        this.k.setAdapter(this.o);
        a();
        lh.b.a(this.j);
        App.aJ.b(this.b);
        App.b(this.l);
    }

    public void h() {
        this.f.clear();
        this.o.notifyDataSetChanged();
    }

    static String g(am amVar) {
        return amVar.d;
    }

    static Activity a(am amVar) {
        return amVar.h;
    }

    static long a(am amVar, long j) {
        amVar.m = j;
        return j;
    }

    static Runnable d(am amVar) {
        return amVar.e;
    }

    static boolean b(am amVar) {
        return amVar.a();
    }

    static void i(am amVar) {
        amVar.e();
    }

    public void a(ArrayList arrayList) {
        this.f = arrayList;
        this.o.notifyDataSetChanged();
        int indexOf = this.i.indexOf(this.f.get(0));
        if (VERSION.SDK_INT >= 8) {
            this.k.smoothScrollToPosition(indexOf);
            if (App.az == 0) {
                return;
            }
        }
        this.k.setSelection(indexOf);
    }

    public void b() {
        this.c.removeCallbacks(this.e);
        App.a(new vr(this.d));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a() {
        /*
        r4_this = this;
        r0 = 0;
        r1 = r4.h;
        r1 = r1.getResources();
        r2 = 2131361852; // 0x7f0a003c float:1.8343468E38 double:1.05303267E-314;
        r1 = r1.getDimension(r2);
        r2 = r4.h;
        r2 = r2.getResources();
        r2 = r2.getDisplayMetrics();
        r2 = r2.density;
        r1 = r1 + r2;
        r2 = r4.h;
        r2 = r2.getResources();
        r3 = 2131361861; // 0x7f0a0045 float:1.8343486E38 double:1.0530326744E-314;
        r2 = r2.getDimension(r3);
        r3 = r4.i;
        r3 = r3.size();
        r3 = (float) r3;
        r1 = r1 * r3;
        r1 = java.lang.Math.min(r1, r2);
        r1 = (int) r1;
        r2 = r4.g;
        if (r1 == r2) goto L_0x0059;
    L_0x0039:
        r4.g = r1;
        if (r1 != 0) goto L_0x0048;
    L_0x003d:
        r2 = r4.a;
        r3 = 8;
        r2.setVisibility(r3);
        r2 = com.whatsapp.App.az;
        if (r2 == 0) goto L_0x0058;
    L_0x0048:
        r2 = r4.a;
        r2.setVisibility(r0);
        r0 = r4.a;
        r2 = new android.widget.LinearLayout$LayoutParams;
        r3 = -1;
        r2.<init>(r3, r1);
        r0.setLayoutParams(r2);
    L_0x0058:
        r0 = 1;
    L_0x0059:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.am.a():boolean");
    }

    public am() {
        this.n = new fk();
        this.f = new ArrayList();
        this.c = new Handler();
        this.m = 30000;
        this.j = new az3(this);
        this.e = new dj(this);
        this.b = new gk(this);
        this.l = new r7(this);
    }

    public void c() {
        alq com_whatsapp_alr = new alr(this, this.d, true);
        this.c.removeCallbacks(this.e);
        this.c.postDelayed(this.e, this.m);
        App.a(com_whatsapp_alr);
        e();
    }

    public void g() {
        this.n.a();
        lh.b.b(this.j);
        App.aJ.a(this.b);
        App.a(this.l);
    }
}
