package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.widget.EditText;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.fieldstats.e;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class DescribeProblemActivity extends DialogToastActivity {
    private static final String[] z;
    private cv j;
    private Uri[] k;
    private e l;
    private EditText m;
    private String n;
    private String o;
    private ro p;

    class AnonymousClass_3 extends ThumbnailButton {
        final DescribeProblemActivity k;

        AnonymousClass_3(DescribeProblemActivity describeProblemActivity, Context context) {
            this.k = describeProblemActivity;
            super(context);
        }

        public void onDraw(Canvas canvas) {
            if (!(isSelected() || isPressed())) {
                canvas.drawColor(getResources().getColor(R.color.gray_activity));
            }
            super.onDraw(canvas);
        }

        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            setMeasuredDimension(getMeasuredWidth(), (getMeasuredWidth() * 4) / 3);
        }
    }

    static {
        String[] strArr = new String[15];
        String str = "\u0017w+\u0006\"\u0001}:\t7\u001e=;\u00177\u0012f=";
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
                        i3 = 115;
                        break;
                    case ay.f /*1*/:
                        i3 = 18;
                        break;
                    case ay.n /*2*/:
                        i3 = 88;
                        break;
                    case ay.p /*3*/:
                        i3 = 101;
                        break;
                    default:
                        i3 = 82;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0000q*\u00007\u001da0\n&\u0000";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0010}5K%\u001bs,\u00163\u0003bv!7\u0000q*\f0\u0016B*\n0\u001fw5$1\u0007{.\f&\n<>\u0017=\u001e";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0010}5K%\u001bs,\u00163\u0003bv!7\u0000q*\f0\u0016B*\n0\u001fw5$1\u0007{.\f&\n<,\u001c\"\u0016";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0017w+\u0006\"\u0001}:J6\u0016a,\u0017=\n";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0017w+\u0006\"\u0001}:J!\u0010`=\u0000<\u0000z7\u0011}\u001d}u\f<\u0003g,H!\u0007`=\u0004?S";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0017w+\u0006\"\u0001}:J!\u0010`=\u0000<\u0000z7\u0011}\u001d}u\f<\u0003g,H!\u0007`=\u0004?S";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0017w+\u0006\"\u0001}:J!\u0010`=\u0000<\u0000z7\u0011}\u001d},H3\u001d?1\b3\u0014wx";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0017w+\u0006\"\u0001}:J!\u0010`=\u0000<\u0000z7\u0011}\u001d}u\f<\u0003g,H!\u0007`=\u0004?S";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0017w+\u0006\"\u0001}:J!\u0010`=\u0000<\u0000z7\u0011}S";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0017w+\u0006\"\u0001}:J \u0016a-\b7";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u001aa\u0007\u00177\u0000w,";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0017w+\u0006\"\u0001}:J\"\u0012g+\u0000";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0000q*\u00007\u001da0\n&\u0000";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0010}5K%\u001bs,\u00163\u0003bv!7\u0000q*\f0\u0016B*\n0\u001fw5$1\u0007{.\f&\n<+\u0000 \u0005w*\u0016&\u0012f-\u0016";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static cv c(DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.b();
    }

    static ro a(DescribeProblemActivity describeProblemActivity, ro roVar) {
        describeProblemActivity.p = roVar;
        return roVar;
    }

    static String a(DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.o;
    }

    static e f(DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.l;
    }

    public void onResume() {
        super.onResume();
        Log.i(z[11]);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray(z[14], this.k);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
        r12_this = this;
        r11 = 3;
        r3 = 0;
        r2 = 1;
        r5 = com.whatsapp.App.az;
        r0 = z;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r13);
        r0 = r12.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r2);
        r0 = r12.getSupportActionBar();
        r0.setDisplayShowCustomEnabled(r2);
        r0 = 2130903135; // 0x7f03005f float:1.741308E38 double:1.0528060336E-314;
        r12.setContentView(r0);
        r0 = 2131427768; // 0x7f0b01b8 float:1.8477162E38 double:1.053065237E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.EditText) r0;
        r12.m = r0;
        r0 = r12.m;
        com.whatsapp.b7.a(r0);
        r0 = 2131427769; // 0x7f0b01b9 float:1.8477164E38 double:1.0530652373E-314;
        r0 = r12.findViewById(r0);
        r1 = new com.whatsapp.ub;
        r1.<init>(r12);
        r0.setOnClickListener(r1);
        r0 = r12.getIntent();
        r1 = z;
        r1 = r1[r11];
        r1 = r0.getStringExtra(r1);
        r12.o = r1;
        r1 = z;
        r1 = r1[r2];
        r1 = r0.getStringExtra(r1);
        r12.n = r1;
        r1 = z;
        r4 = 4;
        r1 = r1[r4];
        r0 = r0.getIntExtra(r1, r3);
        if (r0 != r2) goto L_0x0071;
    L_0x0065:
        r0 = r12.getSupportActionBar();
        r1 = 2131624238; // 0x7f0e012e float:1.887565E38 double:1.053162306E-314;
        r0.setTitle(r1);
        if (r5 == 0) goto L_0x007b;
    L_0x0071:
        r0 = r12.getSupportActionBar();
        r1 = 2131624237; // 0x7f0e012d float:1.8875648E38 double:1.0531623053E-314;
        r0.setTitle(r1);
    L_0x007b:
        r0 = r12.getSupportActionBar();
        r1 = 2131624609; // 0x7f0e02a1 float:1.8876403E38 double:1.053162489E-314;
        r1 = r12.getString(r1);
        r4 = new com.whatsapp._d;
        r4.<init>(r12);
        com.whatsapp.bp.a(r12, r0, r1, r4);
        r0 = 2131427770; // 0x7f0b01ba float:1.8477166E38 double:1.0530652377E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.am1.b(r0);
        r0 = 2131427771; // 0x7f0b01bb float:1.8477168E38 double:1.053065238E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.LinearLayout) r0;
        r0.removeAllViews();
        r1 = r12.getResources();
        r4 = 2131361864; // 0x7f0a0048 float:1.8343492E38 double:1.053032676E-314;
        r6 = r1.getDimensionPixelSize(r4);
        r1 = r6 / 4;
        if (r1 != 0) goto L_0x00b6;
    L_0x00b5:
        r1 = r2;
    L_0x00b6:
        r4 = r3;
    L_0x00b7:
        if (r4 >= r11) goto L_0x00fc;
    L_0x00b9:
        r7 = new com.whatsapp.DescribeProblemActivity$3;
        r7.<init>(r12, r12);
        r7.c = r2;
        r8 = (float) r1;
        r7.setBorderSize(r8);
        r8 = r12.getResources();
        r9 = 2131296296; // 0x7f090028 float:1.8210505E38 double:1.053000281E-314;
        r8 = r8.getColor(r9);
        r7.setBorderColor(r8);
        r8 = android.widget.ImageView.ScaleType.CENTER;
        r7.setScaleType(r8);
        r8 = 2130838805; // 0x7f020515 float:1.7282603E38 double:1.0527742504E-314;
        r7.setImageResource(r8);
        r8 = new com.whatsapp.m;
        r8.<init>(r12, r4);
        r7.setOnClickListener(r8);
        r8 = new android.widget.LinearLayout$LayoutParams;
        r9 = -2;
        r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r8.<init>(r3, r9, r10);
        r8.bottomMargin = r6;
        r8.rightMargin = r6;
        r8.topMargin = r6;
        r8.leftMargin = r6;
        r0.addView(r7, r8);
        r4 = r4 + 1;
        if (r5 == 0) goto L_0x00b7;
    L_0x00fc:
        if (r13 == 0) goto L_0x011a;
    L_0x00fe:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        r2 = r13.getParcelableArray(r0);
        r1 = r3;
    L_0x0108:
        r0 = r2.length;
        if (r1 >= r0) goto L_0x011a;
    L_0x010b:
        r0 = r2[r1];
        if (r0 == 0) goto L_0x0116;
    L_0x010f:
        r0 = r2[r1];
        r0 = (android.net.Uri) r0;
        r12.a(r1, r0);
    L_0x0116:
        r0 = r1 + 1;
        if (r5 == 0) goto L_0x0122;
    L_0x011a:
        r0 = new com.whatsapp.fieldstats.e;
        r0.<init>();
        r12.l = r0;
        return;
    L_0x0122:
        r1 = r0;
        goto L_0x0108;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DescribeProblemActivity.onCreate(android.os.Bundle):void");
    }

    private cv b() {
        if (this.j != null && this.j.getStatus() == Status.RUNNING) {
            this.j.cancel(false);
        }
        this.j = new cv(this);
        return this.j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r8, android.net.Uri r9) {
        /*
        r7_this = this;
        r6 = 10;
        r5 = 2131624280; // 0x7f0e0158 float:1.8875735E38 double:1.0531623266E-314;
        r2 = com.whatsapp.App.az;
        r0 = r7.k;
        r0[r8] = r9;
        r0 = 2131427771; // 0x7f0b01bb float:1.8477168E38 double:1.053065238E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.LinearLayout) r0;
        r0 = r0.getChildAt(r8);
        r0 = (android.widget.ImageView) r0;
        r0 = (android.widget.ImageView) r0;
        if (r9 == 0) goto L_0x0108;
    L_0x001e:
        r1 = com.whatsapp.App.e;	 Catch:{ IOException -> 0x0116 }
        r1 = r1.openInputStream(r9);	 Catch:{ IOException -> 0x0116 }
        if (r1 == 0) goto L_0x00e7;
    L_0x0026:
        r3 = new android.graphics.BitmapFactory$Options;	 Catch:{ IOException -> 0x0116 }
        r3.<init>();	 Catch:{ IOException -> 0x0116 }
        r4 = 1;
        r3.inJustDecodeBounds = r4;	 Catch:{ IOException -> 0x0114 }
        r4 = 0;
        android.graphics.BitmapFactory.decodeStream(r1, r4, r3);	 Catch:{ IOException -> 0x0114 }
        r1.close();	 Catch:{ IOException -> 0x0114 }
        r1 = r3.outWidth;	 Catch:{ IOException -> 0x0114 }
        if (r1 <= 0) goto L_0x00c5;
    L_0x0039:
        r1 = r3.outHeight;	 Catch:{ IOException -> 0x0114 }
        if (r1 <= 0) goto L_0x00c5;
    L_0x003d:
        r1 = 0;
        r3.inJustDecodeBounds = r1;	 Catch:{ IOException -> 0x0116 }
        r1 = 1;
        r3.inSampleSize = r1;	 Catch:{ IOException -> 0x0116 }
        r1 = r7.getWindowManager();	 Catch:{ IOException -> 0x0116 }
        r1 = r1.getDefaultDisplay();	 Catch:{ IOException -> 0x0116 }
        r1 = r1.getWidth();	 Catch:{ IOException -> 0x0116 }
        r1 = r1 / 3;
    L_0x0051:
        r4 = r3.outWidth;	 Catch:{ IOException -> 0x0116 }
        if (r1 >= r4) goto L_0x005f;
    L_0x0055:
        r1 = r1 * 2;
        r4 = r3.inSampleSize;	 Catch:{ IOException -> 0x0116 }
        r4 = r4 * 2;
        r3.inSampleSize = r4;	 Catch:{ IOException -> 0x0116 }
        if (r2 == 0) goto L_0x0051;
    L_0x005f:
        r1 = com.whatsapp.App.e;	 Catch:{ IOException -> 0x0116 }
        r1 = r1.openInputStream(r9);	 Catch:{ IOException -> 0x0116 }
        if (r1 == 0) goto L_0x00a4;
    L_0x0067:
        r4 = 1;
        r3.inDither = r4;	 Catch:{ IOException -> 0x0133 }
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0133 }
        if (r4 < r6) goto L_0x0071;
    L_0x006e:
        r4 = 1;
        r3.inPreferQualityOverSpeed = r4;	 Catch:{ IOException -> 0x0135 }
    L_0x0071:
        r4 = 0;
        r1 = android.graphics.BitmapFactory.decodeStream(r1, r4, r3);	 Catch:{ IOException -> 0x0116 }
        if (r1 == 0) goto L_0x0082;
    L_0x0078:
        r3 = android.widget.ImageView.ScaleType.CENTER_CROP;	 Catch:{ IOException -> 0x0137 }
        r0.setScaleType(r3);	 Catch:{ IOException -> 0x0137 }
        r0.setImageBitmap(r1);	 Catch:{ IOException -> 0x0137 }
        if (r2 == 0) goto L_0x00a2;
    L_0x0082:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0139 }
        r1.<init>();	 Catch:{ IOException -> 0x0139 }
        r3 = z;	 Catch:{ IOException -> 0x0139 }
        r4 = 9;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0139 }
        r1 = r1.append(r3);	 Catch:{ IOException -> 0x0139 }
        r1 = r1.append(r9);	 Catch:{ IOException -> 0x0139 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0139 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IOException -> 0x0139 }
        r1 = 2131624280; // 0x7f0e0158 float:1.8875735E38 double:1.0531623266E-314;
        r7.a(r1);	 Catch:{ IOException -> 0x0139 }
    L_0x00a2:
        if (r2 == 0) goto L_0x00c3;
    L_0x00a4:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x013b }
        r1.<init>();	 Catch:{ IOException -> 0x013b }
        r3 = z;	 Catch:{ IOException -> 0x013b }
        r4 = 7;
        r3 = r3[r4];	 Catch:{ IOException -> 0x013b }
        r1 = r1.append(r3);	 Catch:{ IOException -> 0x013b }
        r1 = r1.append(r9);	 Catch:{ IOException -> 0x013b }
        r1 = r1.toString();	 Catch:{ IOException -> 0x013b }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IOException -> 0x013b }
        r1 = 2131624280; // 0x7f0e0158 float:1.8875735E38 double:1.0531623266E-314;
        r7.a(r1);	 Catch:{ IOException -> 0x013b }
    L_0x00c3:
        if (r2 == 0) goto L_0x00e5;
    L_0x00c5:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x013d }
        r1.<init>();	 Catch:{ IOException -> 0x013d }
        r3 = z;	 Catch:{ IOException -> 0x013d }
        r4 = 8;
        r3 = r3[r4];	 Catch:{ IOException -> 0x013d }
        r1 = r1.append(r3);	 Catch:{ IOException -> 0x013d }
        r1 = r1.append(r9);	 Catch:{ IOException -> 0x013d }
        r1 = r1.toString();	 Catch:{ IOException -> 0x013d }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IOException -> 0x013d }
        r1 = 2131624279; // 0x7f0e0157 float:1.8875733E38 double:1.053162326E-314;
        r7.a(r1);	 Catch:{ IOException -> 0x013d }
    L_0x00e5:
        if (r2 == 0) goto L_0x0106;
    L_0x00e7:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x013f }
        r1.<init>();	 Catch:{ IOException -> 0x013f }
        r3 = z;	 Catch:{ IOException -> 0x013f }
        r4 = 6;
        r3 = r3[r4];	 Catch:{ IOException -> 0x013f }
        r1 = r1.append(r3);	 Catch:{ IOException -> 0x013f }
        r1 = r1.append(r9);	 Catch:{ IOException -> 0x013f }
        r1 = r1.toString();	 Catch:{ IOException -> 0x013f }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IOException -> 0x013f }
        r1 = 2131624280; // 0x7f0e0158 float:1.8875735E38 double:1.0531623266E-314;
        r7.a(r1);	 Catch:{ IOException -> 0x013f }
    L_0x0106:
        if (r2 == 0) goto L_0x0113;
    L_0x0108:
        r1 = android.widget.ImageView.ScaleType.CENTER;	 Catch:{ IOException -> 0x0141 }
        r0.setScaleType(r1);	 Catch:{ IOException -> 0x0141 }
        r1 = 2130838805; // 0x7f020515 float:1.7282603E38 double:1.0527742504E-314;
        r0.setImageResource(r1);	 Catch:{ IOException -> 0x0141 }
    L_0x0113:
        return;
    L_0x0114:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0116 }
    L_0x0116:
        r1 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r4 = r4[r6];
        r3 = r3.append(r4);
        r3 = r3.append(r9);
        r3 = r3.toString();
        com.whatsapp.util.Log.b(r3, r1);
        r7.a(r5);
        goto L_0x0106;
    L_0x0133:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0135 }
    L_0x0135:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0116 }
    L_0x0137:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0139 }
    L_0x0139:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0116 }
    L_0x013b:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0116 }
    L_0x013d:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0116 }
    L_0x013f:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0116 }
    L_0x0141:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DescribeProblemActivity.a(int, android.net.Uri):void");
    }

    static ro g(DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.a();
    }

    public void onPause() {
        super.onPause();
        Log.i(z[13]);
    }

    private ro a() {
        if (this.p != null && this.p.getStatus() == Status.RUNNING) {
            this.p.cancel(false);
        }
        this.p = new ro(this);
        return this.p;
    }

    static EditText b(DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.m;
    }

    static cv a(DescribeProblemActivity describeProblemActivity, cv cvVar) {
        describeProblemActivity.j = cvVar;
        return cvVar;
    }

    static String d(DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.n;
    }

    public DescribeProblemActivity() {
        this.k = new Uri[3];
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.p != null) {
            this.p.cancel(false);
        }
        if (this.j != null) {
            this.j.cancel(false);
        }
        Log.i(z[5]);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = App.az;
        if (i2 == -1 && i >= 1 && i < 4) {
            if (intent.getBooleanExtra(z[12], false)) {
                a(i - 1, null);
                if (i3 == 0) {
                    return;
                }
            }
            if (intent.getData() != null) {
                a(i - 1, intent.getData());
                if (i3 == 0) {
                    return;
                }
            }
            a(R.string.error_load_image);
        }
    }

    protected Dialog onCreateDialog(int i) {
        Dialog progressDialog;
        switch (i) {
            case ay.f /*1*/:
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.register_preparing));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case ay.n /*2*/:
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.searching));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            default:
                return super.onCreateDialog(i);
        }
    }

    static Uri[] e(DescribeProblemActivity describeProblemActivity) {
        return describeProblemActivity.k;
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
}
