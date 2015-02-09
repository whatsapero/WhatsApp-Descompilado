package com.whatsapp.qrcode;

import android.hardware.Camera.PreviewCallback;
import android.os.Handler;
import android.os.HandlerThread;
import android.widget.TextView;
import com.google.c2;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.a12;
import com.whatsapp.a5y;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class QrCodeActivity extends DialogToastActivity {
    public static boolean t;
    private static final String[] z;
    private boolean j;
    private Runnable k;
    private a5y l;
    private boolean m;
    private QrCodeView n;
    private PreviewCallback o;
    private c2 p;
    private HandlerThread q;
    private String r;
    private Handler s;
    private TextView u;
    private String v;

    static {
        String[] strArr = new String[7];
        String str = "sA`zNoD`xU=\u001a(7\n\u007f\u0017?$\nh\u0019xqXaPguN<F\u007fd\u0014,Hb(\u0015)Ha`\u0004";
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
                        i3 = 79;
                        break;
                    case ay.f /*1*/:
                        i3 = 39;
                        break;
                    case ay.n /*2*/:
                        i3 = 15;
                        break;
                    case ay.p /*3*/:
                        i3 = 20;
                        break;
                    default:
                        i3 = 58;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ",Hb:M'F{g[?WPdH*Ajf_!Djg";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = ">UPq^:Dn`S I";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = ">UnwN&Qf`C`D}q[;B";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ">UnwN&Qf`C`CjgN=Hv";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ">UnwN&Qf`C`UjgO#S/";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u001eUKqY Cj";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onDestroy() {
        Log.i(z[5]);
        super.onDestroy();
        this.q.quit();
        a12.a(this.l);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r9) {
        /*
        r8_this = this;
        r7 = 2131427967; // 0x7f0b027f float:1.8477565E38 double:1.053065335E-314;
        r6 = 2131427966; // 0x7f0b027e float:1.8477563E38 double:1.0530653346E-314;
        r5 = 8;
        r3 = 1;
        r4 = 0;
        super.onCreate(r9);
        r0 = z;
        r1 = 4;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = 5;
        r8.requestWindowFeature(r0);
        r0 = r8.getWindow();
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0.addFlags(r1);
        r0 = r8.getLayoutInflater();
        r1 = 2130903192; // 0x7f030098 float:1.7413195E38 double:1.052806062E-314;
        r2 = 0;
        r0 = com.whatsapp.b7.a(r0, r1, r2, r4);
        r0 = (android.view.ViewGroup) r0;
        r8.setContentView(r0);
        r0 = r8.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r3);
        r8.setSupportProgressBarIndeterminateVisibility(r4);
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = com.google.R.QR_CODE;
        r1.add(r2);
        r2 = com.google.fm.POSSIBLE_FORMATS;
        r0.put(r2, r1);
        r0 = new android.os.HandlerThread;
        r1 = z;
        r1 = r1[r3];
        r0.<init>(r1);
        r8.q = r0;
        r0 = r8.q;
        r0.start();
        r0 = new android.os.Handler;
        r1 = r8.q;
        r1 = r1.getLooper();
        r0.<init>(r1);
        r8.s = r0;
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        r0 = r8.getSharedPreferences(r0, r4);
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r0 = r0.getBoolean(r1, r3);
        r8.j = r0;
        r0 = 2131427554; // 0x7f0b00e2 float:1.8476728E38 double:1.053065131E-314;
        r0 = r8.findViewById(r0);
        r0 = (com.whatsapp.qrcode.QrCodeView) r0;
        r8.n = r0;
        r0 = r8.n;
        r1 = new com.whatsapp.qrcode.e;
        r1.<init>(r8);
        r0.setCameraCallback(r1);
        r0 = 2131427965; // 0x7f0b027d float:1.8477561E38 double:1.053065334E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r8.u = r0;
        r0 = r8.u;
        r1 = 2131624699; // 0x7f0e02fb float:1.8876585E38 double:1.0531625336E-314;
        r2 = new java.lang.Object[r3];
        r3 = z;
        r3 = r3[r4];
        r2[r4] = r3;
        r1 = r8.getString(r1, r2);
        r1 = android.text.Html.fromHtml(r1);
        r0.setText(r1);
        r0 = 2131427569; // 0x7f0b00f1 float:1.8476758E38 double:1.0530651384E-314;
        r0 = r8.findViewById(r0);
        r1 = new com.whatsapp.qrcode.k;
        r1.<init>(r8);
        r0.setOnClickListener(r1);
        r0 = r8.j;
        if (r0 == 0) goto L_0x00ea;
    L_0x00ce:
        r0 = 2131427968; // 0x7f0b0280 float:1.8477567E38 double:1.0530653356E-314;
        r0 = r8.findViewById(r0);
        r0.setVisibility(r4);
        r0 = r8.findViewById(r6);
        r0.setVisibility(r4);
        r0 = r8.findViewById(r7);
        r0.setVisibility(r5);
        r0 = t;
        if (r0 == 0) goto L_0x0102;
    L_0x00ea:
        r0 = 2131427968; // 0x7f0b0280 float:1.8477567E38 double:1.0530653356E-314;
        r0 = r8.findViewById(r0);
        r0.setVisibility(r5);
        r0 = r8.findViewById(r6);
        r0.setVisibility(r5);
        r0 = r8.findViewById(r7);
        r0.setVisibility(r4);
    L_0x0102:
        r0 = r8.l;
        com.whatsapp.a12.b(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.QrCodeActivity.onCreate(android.os.Bundle):void");
    }

    static boolean b(QrCodeActivity qrCodeActivity, boolean z) {
        qrCodeActivity.j = z;
        return z;
    }

    private void a() {
        runOnUiThread(new b(this));
    }

    static boolean d(QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.m;
    }

    static String f(QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.r;
    }

    static void a(QrCodeActivity qrCodeActivity, byte[] bArr) {
        qrCodeActivity.a(bArr);
    }

    static boolean a(QrCodeActivity qrCodeActivity, boolean z) {
        qrCodeActivity.m = z;
        return z;
    }

    static PreviewCallback e(QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.o;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(byte[] r12) {
        /*
        r11_this = this;
        r8 = 0;
        r10 = t;
        r9 = 0;
        r0 = r11.n;
        r1 = r0.d();
        r0 = r1.width;
        r2 = r1.height;
        r0 = java.lang.Math.min(r0, r2);
        r0 = r0 * 3;
        r6 = r0 / 4;
        r0 = r11.u;
        r0 = r0.getHeight();
        r0 = (float) r0;
        r2 = r11.n;
        r2 = r2.getHeight();
        r2 = (float) r2;
        r0 = r0 / r2;
        r2 = r1.width;
        r3 = r1.width;
        r3 = (float) r3;
        r0 = r0 * r3;
        r0 = (int) r0;
        r0 = r0 + r2;
        r0 = r0 - r6;
        r0 = r0 / 2;
        r2 = r1.width;
        r2 = r2 - r6;
        r4 = java.lang.Math.min(r0, r2);
        r0 = r1.height;
        r0 = r0 - r6;
        r5 = r0 / 2;
        r0 = new com.google.bL;
        r2 = r1.width;
        r3 = r1.height;
        r1 = r12;
        r7 = r6;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        if (r0 == 0) goto L_0x00df;
    L_0x0049:
        r1 = new com.google.W;
        r2 = new com.google.gm;
        r2.<init>(r0);
        r1.<init>(r2);
        r0 = r11.p;	 Catch:{ gC -> 0x00c8, all -> 0x00d0 }
        r0 = r0.b(r1);	 Catch:{ gC -> 0x00c8, all -> 0x00d0 }
        r1 = r11.p;
        r1.a();
    L_0x005e:
        if (r0 == 0) goto L_0x00c4;
    L_0x0060:
        r1 = r0.c();
        r2 = new java.lang.StringBuilder;	 Catch:{ gC -> 0x00d7 }
        r2.<init>();	 Catch:{ gC -> 0x00d7 }
        r3 = z;	 Catch:{ gC -> 0x00d7 }
        r4 = 6;
        r3 = r3[r4];	 Catch:{ gC -> 0x00d7 }
        r2 = r2.append(r3);	 Catch:{ gC -> 0x00d7 }
        r2 = r2.append(r1);	 Catch:{ gC -> 0x00d7 }
        r2 = r2.toString();	 Catch:{ gC -> 0x00d7 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ gC -> 0x00d7 }
        if (r1 == 0) goto L_0x00bf;
    L_0x007f:
        r2 = r11.v;	 Catch:{ gC -> 0x00d7 }
        r2 = r1.equals(r2);	 Catch:{ gC -> 0x00d7 }
        if (r2 != 0) goto L_0x00bf;
    L_0x0087:
        r11.v = r1;
        r0 = r0.c();
        r0 = com.whatsapp.App.z(r0);
        if (r0 != 0) goto L_0x00a8;
    L_0x0093:
        r1 = 2131624463; // 0x7f0e020f float:1.8876106E38 double:1.053162417E-314;
        r2 = 0;
        com.whatsapp.App.b(r11, r1, r2);	 Catch:{ gC -> 0x00d9 }
        r1 = r11.n;	 Catch:{ gC -> 0x00d9 }
        r2 = new com.whatsapp.qrcode.q;	 Catch:{ gC -> 0x00d9 }
        r2.<init>(r11);	 Catch:{ gC -> 0x00d9 }
        r4 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r1.postDelayed(r2, r4);	 Catch:{ gC -> 0x00d9 }
        if (r10 == 0) goto L_0x00bd;
    L_0x00a8:
        r1 = new com.whatsapp.qrcode.o;	 Catch:{ gC -> 0x00d9 }
        r1.<init>(r11);	 Catch:{ gC -> 0x00d9 }
        r11.runOnUiThread(r1);	 Catch:{ gC -> 0x00d9 }
        r0 = r0.d;	 Catch:{ gC -> 0x00d9 }
        r11.r = r0;	 Catch:{ gC -> 0x00d9 }
        r0 = r11.n;	 Catch:{ gC -> 0x00d9 }
        r1 = r11.k;	 Catch:{ gC -> 0x00d9 }
        r2 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r0.postDelayed(r1, r2);	 Catch:{ gC -> 0x00d9 }
    L_0x00bd:
        if (r10 == 0) goto L_0x00c2;
    L_0x00bf:
        r11.a();	 Catch:{ gC -> 0x00db }
    L_0x00c2:
        if (r10 == 0) goto L_0x00c7;
    L_0x00c4:
        r11.a();	 Catch:{ gC -> 0x00dd }
    L_0x00c7:
        return;
    L_0x00c8:
        r0 = move-exception;
        r0 = r11.p;
        r0.a();
        r0 = r9;
        goto L_0x005e;
    L_0x00d0:
        r0 = move-exception;
        r1 = r11.p;
        r1.a();
        throw r0;
    L_0x00d7:
        r0 = move-exception;
        throw r0;
    L_0x00d9:
        r0 = move-exception;
        throw r0;
    L_0x00db:
        r0 = move-exception;
        throw r0;
    L_0x00dd:
        r0 = move-exception;
        throw r0;
    L_0x00df:
        r0 = r9;
        goto L_0x005e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.QrCodeActivity.a(byte[]):void");
    }

    static String a(QrCodeActivity qrCodeActivity, String str) {
        qrCodeActivity.v = str;
        return str;
    }

    static boolean b(QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.j;
    }

    public QrCodeActivity() {
        this.p = new c2();
        this.j = true;
        this.k = new l(this);
        this.l = new j(this);
        this.o = new a(this);
    }

    static void c(QrCodeActivity qrCodeActivity) {
        qrCodeActivity.a();
    }

    static QrCodeView a(QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.n;
    }

    static Handler g(QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.s;
    }
}
