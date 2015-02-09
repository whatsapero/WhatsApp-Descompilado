package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.Collection;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ProfilePhotoReminder extends DialogToastActivity implements anq {
    public static boolean m;
    private static final String[] z;
    private a11 j;
    private Bitmap k;
    private m8 l;
    private TextView n;
    private Runnable o;
    private tf p;
    private ImageView q;
    private Handler r;
    private EditText s;
    private View t;

    static {
        String[] strArr = new String[7];
        String str = "I\u001e2'%U\t-)#M\u0003/$!P\u00029$>\u0016\u000f/$-M\tr/#\u0014\u00018";
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
                        i3 = 57;
                        break;
                    case ay.f /*1*/:
                        i3 = 108;
                        break;
                    case ay.n /*2*/:
                        i3 = 93;
                        break;
                    case ay.p /*3*/:
                        i3 = 65;
                        break;
                    default:
                        i3 = 76;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "I\u001e2'%U\t-)#M\u0003/$!P\u00029$>\u0016\u001f*l)A\u001c43)]";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "I\u001e2'%U\t-)#M\u0003/$!P\u00029$>\u0016\u000f/$-M\t";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "Z\u000337)K\u001f<5%V\u0002.a.V\u00193\")\u0019\u00182a!X\u00053";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "P\u001f\u00023)J\t)";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "I\u001e2'%U\t-)#M\u0003/$!P\u00029$>\u0016\b828K\u0003$";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "I\u001e2'%U\t-)#M\u0003/$!P\u00029$>\u0016\u000f1./RA*3#W\u000b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(Collection collection) {
    }

    static TextView e(ProfilePhotoReminder profilePhotoReminder) {
        return profilePhotoReminder.n;
    }

    public void a() {
    }

    static EditText d(ProfilePhotoReminder profilePhotoReminder) {
        return profilePhotoReminder.s;
    }

    static View b(ProfilePhotoReminder profilePhotoReminder) {
        return profilePhotoReminder.t;
    }

    static a11 c(ProfilePhotoReminder profilePhotoReminder) {
        return profilePhotoReminder.j;
    }

    private void a(Bitmap bitmap) {
        this.q.setImageBitmap(bitmap);
    }

    static m8 a(ProfilePhotoReminder profilePhotoReminder) {
        return profilePhotoReminder.l;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(z[6]);
        if (this.l != null) {
            App.a((anq) this);
        }
        if (this.r != null) {
            this.r.removeCallbacks(this.o);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r7_this = this;
        r6 = 4;
        r4 = 0;
        r0 = r7.t;
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r7.getResources();
        r1 = 2131361876; // 0x7f0a0054 float:1.8343517E38 double:1.053032682E-314;
        r1 = r0.getDimensionPixelSize(r1);
        r0 = r7.getResources();
        r2 = 2131361875; // 0x7f0a0053 float:1.8343515E38 double:1.0530326813E-314;
        r2 = r0.getDimension(r2);
        r0 = r7.l;
        r0 = r0.e;
        r0 = com.whatsapp.a89.a(r0);
        if (r0 == 0) goto L_0x0045;
    L_0x0029:
        r0 = r7.q;
        r0.setEnabled(r4);
        r0 = r7.t;
        r0.setVisibility(r4);
        r0 = r7.k;
        if (r0 != 0) goto L_0x003f;
    L_0x0037:
        r0 = android.graphics.Bitmap.Config.ALPHA_8;
        r0 = android.graphics.Bitmap.createBitmap(r1, r1, r0);
        r7.k = r0;
    L_0x003f:
        r0 = r7.k;
    L_0x0041:
        r7.a(r0);
        return;
    L_0x0045:
        r0 = r7.q;
        r3 = 1;
        r0.setEnabled(r3);
        r0 = r7.t;
        r0.setVisibility(r6);
        r0 = r7.l;
        r0 = r0.a(r1, r2, r4);
        if (r0 != 0) goto L_0x0041;
    L_0x0058:
        r0 = r7.l;
        r0 = r0.A;
        if (r0 != 0) goto L_0x008f;
    L_0x005e:
        r0 = r7.l;
        r0 = r0.M;
        if (r0 != 0) goto L_0x008f;
    L_0x0064:
        r0 = r7.t;
        r0.setVisibility(r4);
        r0 = r7.r;
        if (r0 != 0) goto L_0x007b;
    L_0x006d:
        r0 = new android.os.Handler;
        r0.<init>();
        r7.r = r0;
        r0 = new com.whatsapp.sa;
        r0.<init>(r7);
        r7.o = r0;
    L_0x007b:
        r0 = r7.r;
        r3 = r7.o;
        r0.removeCallbacks(r3);
        r0 = r7.r;
        r3 = r7.o;
        r4 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.postDelayed(r3, r4);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0094;
    L_0x008f:
        r0 = r7.t;
        r0.setVisibility(r6);
    L_0x0094:
        r0 = 2130837650; // 0x7f020092 float:1.728026E38 double:1.0527736797E-314;
        r0 = com.whatsapp.m8.a(r0, r1, r2);
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ProfilePhotoReminder.b():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
        r6_this = this;
        r5 = 25;
        r4 = 0;
        r3 = 1;
        r0 = z;
        r1 = 3;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r7);
        r0 = r6.getSupportActionBar();
        r0.setDisplayShowCustomEnabled(r3);
        r0 = 2130903191; // 0x7f030097 float:1.7413193E38 double:1.0528060613E-314;
        r6.setContentView(r0);
        r0 = com.whatsapp.App.P;
        r0 = r0.d();
        r6.l = r0;
        r0 = r6.l;
        if (r0 != 0) goto L_0x0045;
    L_0x0028:
        r0 = z;
        r0 = r0[r4];
        com.whatsapp.util.Log.i(r0);
        r0 = z;
        r1 = 4;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r6.finish();
    L_0x0044:
        return;
    L_0x0045:
        r0 = 2131427961; // 0x7f0b0279 float:1.8477553E38 double:1.053065332E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r6.n = r0;
        r0 = r6.n;
        r1 = java.lang.Integer.toString(r5);
        r0.setText(r1);
        r0 = 2131427776; // 0x7f0b01c0 float:1.8477178E38 double:1.0530652407E-314;
        r0 = r6.findViewById(r0);
        r1 = new com.whatsapp.ip;
        r1.<init>(r6);
        r0.setOnClickListener(r1);
        r0 = new com.whatsapp.a11;
        r0.<init>(r6);
        r6.j = r0;
        r0 = r6.j;
        r1 = r6.p;
        r0.a(r1);
        r0 = 2131427927; // 0x7f0b0257 float:1.8477484E38 double:1.0530653153E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r6.q = r0;
        r0 = new com.whatsapp.pd;
        r0.<init>(r6);
        r1 = r6.q;
        r1.setOnClickListener(r0);
        r0 = r6.getSupportActionBar();
        r1 = 2131624609; // 0x7f0e02a1 float:1.8876403E38 double:1.053162489E-314;
        r1 = r6.getString(r1);
        r2 = new com.whatsapp.aj;
        r2.<init>(r6);
        com.whatsapp.bp.a(r6, r0, r1, r2);
        r0 = 2131427666; // 0x7f0b0152 float:1.8476955E38 double:1.0530651864E-314;
        r0 = r6.findViewById(r0);
        r6.t = r0;
        r6.b();
        r0 = 2131427958; // 0x7f0b0276 float:1.8477547E38 double:1.0530653306E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.EditText) r0;
        r6.s = r0;
        r0 = r6.s;
        r1 = new com.whatsapp.a__;
        r1.<init>(r6);
        r0.addTextChangedListener(r1);
        r0 = r6.s;
        r1 = new android.text.InputFilter[r3];
        r2 = new android.text.InputFilter$LengthFilter;
        r2.<init>(r5);
        r1[r4] = r2;
        r0.setFilters(r1);
        r0 = com.whatsapp.App.p(r6);
        r1 = r6.s;
        r1.setText(r0);
        r1 = r6.s;
        com.whatsapp.b7.a(r1, r0);
        r0 = r6.s;
        r1 = r6.s;
        r1 = r1.length();
        r0.setSelection(r1);
        r0 = com.whatsapp.App.p;
        r0 = r0.x();
        if (r0 == 0) goto L_0x00fe;
    L_0x00ee:
        r0 = z;
        r0 = r0[r3];
        com.whatsapp.util.Log.w(r0);
        r0 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        com.whatsapp.Conversations.a(r6, r0);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0111;
    L_0x00fe:
        r0 = com.whatsapp.App.ax();
        if (r0 == 0) goto L_0x0111;
    L_0x0104:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r0 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        com.whatsapp.Conversations.a(r6, r0);
    L_0x0111:
        com.whatsapp.App.b(r6);
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ProfilePhotoReminder.onCreate(android.os.Bundle):void");
    }

    public void c(String str) {
    }

    public void b(String str) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.j.a(configuration);
    }

    public ProfilePhotoReminder() {
        this.p = new g0(this);
    }

    public void a(String str) {
    }

    public void d(String str) {
        if (this.l != null && str.equals(this.l.e)) {
            this.l = App.P.d();
            b();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = App.az;
        switch (i) {
            case a6.s /*12*/:
                if (i2 == -1) {
                    if (intent != null && intent.getBooleanExtra(z[5], false)) {
                        this.t.setVisibility(0);
                        zv.a(this.l, (Activity) this);
                        if (i3 == 0) {
                            return;
                        }
                    }
                    zv.a(intent, this.l, this, 13, this);
                    if (i3 == 0) {
                        return;
                    }
                }
                return;
                break;
            case a6.z /*13*/:
                break;
            default:
                return;
        }
        zv.b().delete();
        if (i2 == -1) {
            if (zv.b(this.l, this)) {
                this.t.setVisibility(0);
                if (i3 == 0) {
                    return;
                }
            }
            return;
        }
        if (i2 == 0 && intent != null) {
            zv.a(intent, (ho) this);
        }
    }
}
