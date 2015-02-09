package com.whatsapp;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.util.FloatingChildLayout;
import com.whatsapp.util.Log;
import java.util.Collection;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class QuickContactActivity extends DialogToastFragmentActivity implements anq {
    private static final String[] z;
    private ImageView f;
    private FloatingChildLayout g;
    private TextView h;
    private m8 i;

    static {
        String[] strArr = new String[3];
        String str = " w}i/2mz~%2v}d\">-wx!0vq";
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
                        i3 = 81;
                        break;
                    case ay.f /*1*/:
                        i3 = 2;
                        break;
                    case ay.n /*2*/:
                        i3 = 20;
                        break;
                    case ay.p /*3*/:
                        i3 = 10;
                        break;
                    default:
                        i3 = 68;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = " w}i/2mz~%2v}d\">-po7%p{s";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ";kp";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public void a() {
    }

    private void b(boolean z) {
        getSupportLoaderManager().destroyLoader(0);
        if (z) {
            this.g.f();
            if (!this.g.a(new fq(this))) {
                finish();
            }
            if (App.az == 0) {
                return;
            }
        }
        finish();
    }

    public void a(Collection collection) {
    }

    public void onBackPressed() {
        b(true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r11) {
        /*
        r10_this = this;
        r9 = 2131427682; // 0x7f0b0162 float:1.8476987E38 double:1.0530651943E-314;
        r8 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r7 = 2131427970; // 0x7f0b0282 float:1.8477571E38 double:1.0530653366E-314;
        r6 = 0;
        r5 = 8;
        r1 = com.whatsapp.App.az;
        super.onCreate(r11);
        r0 = z;
        r0 = r0[r6];
        com.whatsapp.util.Log.i(r0);
        r2 = r10.getIntent();
        r0 = com.whatsapp.App.P;
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        r3 = r2.getStringExtra(r3);
        r0 = r0.a(r3);
        r10.i = r0;
        r0 = r10.getWindow();
        r0.setFlags(r8, r8);
        r0 = 2130903193; // 0x7f030099 float:1.7413197E38 double:1.0528060623E-314;
        r10.setContentView(r0);
        r0 = 2131427969; // 0x7f0b0281 float:1.847757E38 double:1.053065336E-314;
        r0 = r10.findViewById(r0);
        r0 = (com.whatsapp.util.FloatingChildLayout) r0;
        r10.g = r0;
        r0 = r10.g;
        r3 = new com.whatsapp.pq;
        r3.<init>(r10);
        r0.setOnOutsideTouchListener(r3);
        r0 = r2.getSourceBounds();
        if (r0 == 0) goto L_0x0059;
    L_0x0054:
        r2 = r10.g;
        r2.setChildTargetScreen(r0);
    L_0x0059:
        r0 = 2131427637; // 0x7f0b0135 float:1.8476896E38 double:1.053065172E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r10.h = r0;
        r0 = r10.h;
        r2 = r10.i;
        r2 = r2.a(r10);
        r3 = r10.h;
        r3 = r3.getPaint();
        r2 = com.whatsapp.util.a5.b(r2, r10, r3);
        r0.setText(r2);
        r0 = r10.i;
        r0 = r0.q;
        if (r0 != 0) goto L_0x008f;
    L_0x007f:
        r0 = r10.i;
        r0 = r0.w();
        if (r0 != 0) goto L_0x008f;
    L_0x0087:
        r0 = r10.i;
        r0 = r0.l();
        if (r0 == 0) goto L_0x009f;
    L_0x008f:
        r0 = r10.findViewById(r9);
        r0.setVisibility(r6);
        r0 = r10.findViewById(r7);
        r0.setVisibility(r5);
        if (r1 == 0) goto L_0x00ad;
    L_0x009f:
        r0 = r10.findViewById(r9);
        r0.setVisibility(r5);
        r0 = r10.findViewById(r7);
        r0.setVisibility(r6);
    L_0x00ad:
        r0 = 2131427676; // 0x7f0b015c float:1.8476975E38 double:1.0530651913E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r10.f = r0;
        r10.b();
        r0 = r10.i;
        r0 = r0.q;
        if (r0 == 0) goto L_0x00c9;
    L_0x00c1:
        r0 = r10.i;
        r0 = r0.l();
        if (r0 == 0) goto L_0x00d1;
    L_0x00c9:
        r0 = r10.i;
        r0 = r0.w();
        if (r0 == 0) goto L_0x00db;
    L_0x00d1:
        r0 = r10.f;
        r2 = new com.whatsapp.o4;
        r2.<init>(r10);
        r0.setOnClickListener(r2);
    L_0x00db:
        r0 = 2131427971; // 0x7f0b0283 float:1.8477573E38 double:1.053065337E-314;
        r0 = r10.findViewById(r0);
        r2 = new com.whatsapp.yu;
        r2.<init>(r10);
        r0.setOnClickListener(r2);
        r0 = 2131427973; // 0x7f0b0285 float:1.8477577E38 double:1.053065338E-314;
        r0 = r10.findViewById(r0);
        r2 = r10.i;
        r2 = r2.w();
        if (r2 != 0) goto L_0x0101;
    L_0x00f9:
        r2 = r10.i;
        r2 = r2.l();
        if (r2 == 0) goto L_0x0110;
    L_0x0101:
        r0.setVisibility(r5);
        r2 = 2131427972; // 0x7f0b0284 float:1.8477575E38 double:1.0530653376E-314;
        r2 = r10.findViewById(r2);
        r2.setVisibility(r5);
        if (r1 == 0) goto L_0x0118;
    L_0x0110:
        r1 = new com.whatsapp.afb;
        r1.<init>(r10);
        r0.setOnClickListener(r1);
    L_0x0118:
        r0 = 2131427974; // 0x7f0b0286 float:1.847758E38 double:1.0530653385E-314;
        r0 = r10.findViewById(r0);
        r1 = new com.whatsapp.ci;
        r1.<init>(r10);
        r0.setOnClickListener(r1);
        r0 = r10.findViewById(r7);
        r1 = new com.whatsapp.amc;
        r1.<init>(r10);
        r0.setOnClickListener(r1);
        r0 = r10.g;
        r1 = new com.whatsapp.a8h;
        r1.<init>(r10);
        com.whatsapp.util.FloatingChildLayout.a(r0, r1);
        com.whatsapp.App.b(r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.QuickContactActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(z[2]);
        App.a((anq) this);
    }

    private void b() {
        int i = App.az;
        Bitmap a = this.i.a(getResources().getDimensionPixelSize(R.dimen.quick_contact_profile_photo_size), 0.0f, false);
        if (a != null) {
            this.f.setImageBitmap(a);
            if (i == 0) {
                return;
            }
        }
        if (this.i.w()) {
            this.f.setImageResource(R.drawable.ic_pic_group_xlarge);
            if (i == 0) {
                return;
            }
        }
        if (this.i.l()) {
            this.f.setImageResource(R.drawable.ic_pic_broadcast_xlarge);
            if (i == 0) {
                return;
            }
        }
        this.f.setImageResource(R.drawable.ic_pic_contact_xlarge);
    }

    static m8 b(QuickContactActivity quickContactActivity) {
        return quickContactActivity.i;
    }

    public void d(String str) {
        b();
    }

    static void a(QuickContactActivity quickContactActivity, boolean z) {
        quickContactActivity.b(z);
    }

    public void c(String str) {
    }

    static void a(QuickContactActivity quickContactActivity) {
        quickContactActivity.d();
    }

    static FloatingChildLayout c(QuickContactActivity quickContactActivity) {
        return quickContactActivity.g;
    }

    private void d() {
        if (this.g.b()) {
            b(true);
        }
    }

    public void a(String str) {
    }

    public void b(String str) {
    }
}
