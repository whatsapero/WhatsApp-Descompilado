package com.whatsapp;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class tb extends ArrayAdapter {
    private static final String z;
    private ArrayList a;
    final SetStatus b;

    static {
        char[] toCharArray = "?\n6,\u0015'4&-\u0006?\n;&\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 83;
                    break;
                case ay.f /*1*/:
                    i2 = 107;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 67;
                    break;
                default:
                    i2 = 96;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public tb(SetStatus setStatus, Context context, int i, ArrayList arrayList) {
        this.b = setStatus;
        super(context, i, arrayList);
        this.a = arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
        r6_this = this;
        if (r8 != 0) goto L_0x0014;
    L_0x0002:
        r0 = r6.b;
        r1 = z;
        r0 = r0.getSystemService(r1);
        r0 = (android.view.LayoutInflater) r0;
        r1 = 2130903201; // 0x7f0300a1 float:1.7413213E38 double:1.052806066E-314;
        r2 = 0;
        r8 = com.whatsapp.b7.a(r0, r1, r2);
    L_0x0014:
        r0 = r6.a;
        r0 = r0.get(r7);
        r0 = (java.lang.String) r0;
        if (r0 == 0) goto L_0x0056;
    L_0x001e:
        r1 = 2131427992; // 0x7f0b0298 float:1.8477616E38 double:1.0530653474E-314;
        r1 = r8.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        if (r1 == 0) goto L_0x0056;
    L_0x0029:
        r2 = com.whatsapp.App.as;
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0044;
    L_0x0031:
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r3 = 51;
        r4 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r5 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r2 = android.graphics.Color.argb(r2, r3, r4, r5);
        r1.setTextColor(r2);
        r2 = com.whatsapp.App.az;
        if (r2 == 0) goto L_0x0049;
    L_0x0044:
        r2 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1.setTextColor(r2);
    L_0x0049:
        r2 = r6.b;
        r2 = r2.getBaseContext();
        r0 = com.whatsapp.util.a5.d(r0, r2);
        r1.setText(r0);
    L_0x0056:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.tb.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
