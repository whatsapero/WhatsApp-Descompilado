package com.whatsapp;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class a extends ArrayAdapter {
    private static final String[] z;
    private final String a;
    private final String b;

    static {
        String[] strArr = new String[5];
        String str = "\u007f\u0016kH\u0012g({I\u0001\u007f\u0016fB\u0015";
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
                        i3 = 19;
                        break;
                    case ay.f /*1*/:
                        i3 = 119;
                        break;
                    case ay.n /*2*/:
                        i3 = 18;
                        break;
                    case ay.p /*3*/:
                        i3 = 39;
                        break;
                    default:
                        i3 = 103;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u007f\u0016kH\u0012g({I\u0001\u007f\u0016fB\u0015";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "9]8D\bf\u0019fU\u001ep\u0018vBHg\u0012jS\u0011z\u0012e\u0007\u000e`W|R\u000b\u007fV";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "9]8D\bf\u0019fU\u001e<\u001bs^\bf\u00032N\u00143\u0019gK\u000b2";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "9]8D\bf\u0019fU\u001e<\u0003w_\u0013e\u001ewPGz\u00042I\u0012\u007f\u001b3";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
        r9_this = this;
        r8 = 0;
        r7 = 2131427754; // 0x7f0b01aa float:1.8477133E38 double:1.05306523E-314;
        r6 = 0;
        r5 = 1;
        r3 = com.whatsapp.App.az;
        r0 = super.getCount();
        if (r0 != 0) goto L_0x003f;
    L_0x000e:
        if (r11 == 0) goto L_0x001b;
    L_0x0010:
        if (r11 == 0) goto L_0x003e;
    L_0x0012:
        r0 = 2131427643; // 0x7f0b013b float:1.8476908E38 double:1.053065175E-314;
        r0 = r11.findViewById(r0);
        if (r0 != 0) goto L_0x003e;
    L_0x001b:
        r0 = r9.getContext();
        r1 = z;
        r1 = r1[r6];
        r11 = new android.widget.LinearLayout;
        r11.<init>(r0);
        r0 = r0.getSystemService(r1);
        r0 = (android.view.LayoutInflater) r0;
        r1 = 2130903178; // 0x7f03008a float:1.7413167E38 double:1.052806055E-314;
        com.whatsapp.b7.a(r0, r1, r11, r5);
        r0 = 2131427915; // 0x7f0b024b float:1.847746E38 double:1.0530653094E-314;
        r0 = r11.findViewById(r0);
        r0.setClickable(r5);
    L_0x003e:
        return r11;
    L_0x003f:
        r0 = r9.getItem(r10);
        r0 = (com.whatsapp.a5g) r0;
        if (r11 == 0) goto L_0x004f;
    L_0x0047:
        if (r11 == 0) goto L_0x006b;
    L_0x0049:
        r1 = r11.findViewById(r7);
        if (r1 != 0) goto L_0x006b;
    L_0x004f:
        r1 = r9.getContext();
        r2 = z;
        r4 = 2;
        r4 = r2[r4];
        r2 = new android.widget.LinearLayout;
        r2.<init>(r1);
        r1 = r1.getSystemService(r4);
        r1 = (android.view.LayoutInflater) r1;
        r4 = 2130903130; // 0x7f03005a float:1.741307E38 double:1.052806031E-314;
        com.whatsapp.b7.a(r1, r4, r2, r5);
        if (r3 == 0) goto L_0x012b;
    L_0x006b:
        r11 = (android.widget.LinearLayout) r11;
    L_0x006d:
        if (r11 != 0) goto L_0x0077;
    L_0x006f:
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        com.whatsapp.util.Log.w(r1);
    L_0x0077:
        r1 = r11.findViewById(r7);
        r1 = (android.widget.TextView) r1;
        if (r1 != 0) goto L_0x0086;
    L_0x007f:
        r2 = z;
        r2 = r2[r5];
        com.whatsapp.util.Log.w(r2);
    L_0x0086:
        r2 = r0.c;
        r1.setText(r2);
        r2 = 2131427755; // 0x7f0b01ab float:1.8477135E38 double:1.0530652303E-314;
        r2 = r11.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r4 = r0.c;
        r5 = r0.a;
        r4 = android.text.TextUtils.equals(r4, r5);
        if (r4 != 0) goto L_0x00a8;
    L_0x009e:
        r4 = r0.a;
        r2.setText(r4);
        r2.setVisibility(r6);
        if (r3 == 0) goto L_0x00b0;
    L_0x00a8:
        r4 = 8;
        r2.setVisibility(r4);
        r2.setText(r8);
    L_0x00b0:
        com.whatsapp.am1.a(r1);
        r2 = 2131427756; // 0x7f0b01ac float:1.8477137E38 double:1.053065231E-314;
        r2 = r11.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        if (r2 != 0) goto L_0x00c6;
    L_0x00be:
        r4 = z;
        r5 = 3;
        r4 = r4[r5];
        com.whatsapp.util.Log.w(r4);
    L_0x00c6:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "+";
        r4 = r4.append(r5);
        r5 = r0.b;
        r4 = r4.append(r5);
        r4 = r4.toString();
        r2.setText(r4);
        r2 = 2131427757; // 0x7f0b01ad float:1.847714E38 double:1.0530652313E-314;
        r2 = r11.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r4 = r0.d;
        r5 = r9.b;
        r4 = android.text.TextUtils.equals(r4, r5);
        if (r4 != 0) goto L_0x00fb;
    L_0x00f1:
        r0 = r0.c;
        r4 = r9.a;
        r0 = android.text.TextUtils.equals(r0, r4);
        if (r0 == 0) goto L_0x0121;
    L_0x00fb:
        r0 = r9.getContext();
        r0 = r0.getResources();
        r4 = 2131296300; // 0x7f09002c float:1.8210513E38 double:1.053000283E-314;
        r0 = r0.getColor(r4);
        r1.setTextColor(r0);
        r0 = r9.getContext();
        r0 = r0.getResources();
        r4 = 2130837818; // 0x7f02013a float:1.72806E38 double:1.0527737627E-314;
        r0 = r0.getDrawable(r4);
        r2.setBackgroundDrawable(r0);
        if (r3 == 0) goto L_0x003e;
    L_0x0121:
        r0 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1.setTextColor(r0);
        r2.setBackgroundDrawable(r8);
        goto L_0x003e;
    L_0x012b:
        r11 = r2;
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public a(Context context, int i, List list, String str, String str2) {
        super(context, i, list);
        this.b = str;
        this.a = str2;
    }

    public int getCount() {
        return Math.max(1, super.getCount());
    }
}
