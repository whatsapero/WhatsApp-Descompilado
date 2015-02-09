package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.fieldstats.au;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.a5;
import java.util.Collection;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ProfileInfoActivity extends DialogToastActivity implements anq {
    private static final String[] z;
    private m8 j;
    private TextView k;
    private Runnable l;
    private Bitmap m;
    private boolean n;
    private View o;
    private Handler p;
    private ImageView q;

    static {
        String[] strArr = new String[7];
        String str = "w6\\1'k!Z9(hkW2=s6\\.";
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
                        i3 = 7;
                        break;
                    case ay.f /*1*/:
                        i3 = 68;
                        break;
                    case ay.n /*2*/:
                        i3 = 51;
                        break;
                    case ay.p /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 78;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "f&\\%:n*Tw*r!\u0013#!'*R#'q!\u0013;'e6R%'b7\u0013:'t7Z9)";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "f*W%!n \u001d> s!]#`f'G>!ijr\u0003\u001aF\u0007{\b\nF\u0010r";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "w6\\1'k!Z9(hkP%+f0V";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "w6\\1'k!Z9(hkP%+f0Vx hi^2";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "n7l%+t!G";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "d+]!+u7R#'h*@w,h1]4+'0\\w#f-]";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static boolean b(ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity.n;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i(z[4]);
        if (WhatsAppLibLoader.a(null)) {
            setContentView(R.layout.profile_info);
            ak4.a(au.PROFILE);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            this.j = App.P.d();
            if (this.j == null) {
                Log.i(z[5]);
                App.v(z[1]);
                startActivity(new Intent(this, Main.class));
                finish();
                return;
            }
            this.k = (TextView) findViewById(R.id.registration_name);
            this.k.setText(a5.d(App.p((Context) this), this));
            findViewById(R.id.change_registration_name_btn).setOnClickListener(new xl(this));
            this.q = (ImageView) findViewById(R.id.photo_btn);
            this.q.setOnClickListener(new y0(this));
            findViewById(R.id.change_photo_btn).setOnClickListener(new xv(this));
            this.o = findViewById(R.id.change_photo_progress);
            b();
            App.b((anq) this);
            if (z[3].equals(getIntent().getAction())) {
                zv.a(getIntent(), this.j, this, 13, this);
                return;
            }
            return;
        }
        Log.i(z[2]);
        finish();
    }

    static TextView a(ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity.k;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = App.az;
        switch (i) {
            case a6.s /*12*/:
                if (i2 == -1) {
                    if (intent != null && intent.getBooleanExtra(z[6], false)) {
                        this.o.setVisibility(0);
                        zv.a(this.j, (Activity) this);
                        if (i3 == 0) {
                            return;
                        }
                    }
                    zv.a(intent, this.j, this, 13, this);
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
            if (zv.b(this.j, this)) {
                this.o.setVisibility(0);
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

    public void c(String str) {
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(z[0]);
        if (this.j != null) {
            App.a((anq) this);
        }
        if (this.p != null) {
            this.p.removeCallbacks(this.l);
        }
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

    public void a() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r10_this = this;
        r9 = 4;
        r8 = 1;
        r5 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r10.o;
        r2 = 8;
        r0.setVisibility(r2);
        r0 = r10.getResources();
        r2 = 2131361870; // 0x7f0a004e float:1.8343505E38 double:1.053032679E-314;
        r2 = r0.getDimensionPixelSize(r2);
        r0 = r10.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r0 = r0.getWidth();
        r3 = r10.getWindowManager();
        r3 = r3.getDefaultDisplay();
        r3 = r3.getHeight();
        r0 = java.lang.Math.min(r0, r3);
        r3 = 1086324736; // 0x40c00000 float:6.0 double:5.367157323E-315;
        r4 = (float) r2;
        r3 = r3 * r4;
        r0 = (float) r0;
        r3 = r3 / r0;
        r0 = r10.j;
        r0 = r0.e;
        r0 = com.whatsapp.a89.a(r0);
        if (r0 == 0) goto L_0x0061;
    L_0x0043:
        r0 = r10.q;
        r0.setEnabled(r5);
        r0 = r10.o;
        r0.setVisibility(r5);
        r0 = r10.m;
        if (r0 != 0) goto L_0x0059;
    L_0x0051:
        r0 = android.graphics.Bitmap.Config.ALPHA_8;
        r0 = android.graphics.Bitmap.createBitmap(r2, r2, r0);
        r10.m = r0;
    L_0x0059:
        r0 = r10.m;
        r10.n = r5;
    L_0x005d:
        r10.a(r0);
        return;
    L_0x0061:
        r0 = r10.q;
        r0.setEnabled(r8);
        r0 = r10.o;
        r0.setVisibility(r9);
        r0 = r10.j;
        r0 = r0.a(r2, r3, r5);
        if (r0 != 0) goto L_0x00b8;
    L_0x0073:
        r0 = r10.j;
        r0 = r0.A;
        if (r0 != 0) goto L_0x00a8;
    L_0x0079:
        r0 = r10.j;
        r0 = r0.M;
        if (r0 != 0) goto L_0x00a8;
    L_0x007f:
        r0 = r10.o;
        r0.setVisibility(r5);
        r0 = r10.p;
        if (r0 != 0) goto L_0x0096;
    L_0x0088:
        r0 = new android.os.Handler;
        r0.<init>();
        r10.p = r0;
        r0 = new com.whatsapp.xm;
        r0.<init>(r10);
        r10.l = r0;
    L_0x0096:
        r0 = r10.p;
        r4 = r10.l;
        r0.removeCallbacks(r4);
        r0 = r10.p;
        r4 = r10.l;
        r6 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.postDelayed(r4, r6);
        if (r1 == 0) goto L_0x00ad;
    L_0x00a8:
        r0 = r10.o;
        r0.setVisibility(r9);
    L_0x00ad:
        r0 = 2130838869; // 0x7f020555 float:1.7282732E38 double:1.052774282E-314;
        r0 = com.whatsapp.m8.a(r0, r2, r3);
        r10.n = r5;
        if (r1 == 0) goto L_0x005d;
    L_0x00b8:
        r10.n = r8;
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ProfileInfoActivity.b():void");
    }

    private void a(Bitmap bitmap) {
        this.q.setImageBitmap(bitmap);
    }

    public void a(Collection collection) {
    }

    static m8 c(ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity.j;
    }

    public void b(String str) {
    }

    public void d(String str) {
        if (this.j != null && str.equals(this.j.e)) {
            this.j = App.P.d();
            b();
        }
    }

    static View d(ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity.o;
    }

    public void a(String str) {
    }
}
