package com.whatsapp;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class e extends CursorAdapter {
    private static final String[] z;
    final Broadcasts a;

    static {
        String[] strArr = new String[4];
        String str = "N>m\u0017fO-q\u0002";
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
                        i3 = 44;
                        break;
                    case ay.f /*1*/:
                        i3 = 76;
                        break;
                    case ay.n /*2*/:
                        i3 = 2;
                        break;
                    case ay.p /*3*/:
                        i3 = 118;
                        break;
                    default:
                        i3 = 2;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0000l";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0000l";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "N>m\u0017fO-q\u0002q\u0003.k\u0018fZ%g\u0001-^)o\u0019vI\u0013p\u0013qC9p\u0015g\f\"w\u001an";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a() {
        changeCursor(App.aJ.u());
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return b7.a(this.a.getLayoutInflater(), R.layout.conversations_row, viewGroup, false);
    }

    public e(Broadcasts broadcasts) {
        this.a = broadcasts;
        super(broadcasts, App.aJ.u());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bindView(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
        /*
        r17_this = this;
        r8 = com.whatsapp.App.az;
        r2 = com.whatsapp.App.aJ;
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        r0 = r20;
        r5 = r2.a(r0, r3);
        r0 = r18;
        r0.setTag(r5);
        r2 = 2131427748; // 0x7f0b01a4 float:1.847712E38 double:1.053065227E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = "";
        r4 = r5.j;
        switch(r4) {
            case 0: goto L_0x0285;
            case 1: goto L_0x028b;
            case 2: goto L_0x0298;
            case 3: goto L_0x02a5;
            case 4: goto L_0x02bf;
            case 5: goto L_0x02b2;
            default: goto L_0x0026;
        };
    L_0x0026:
        r0 = r17;
        r4 = r0.a;
        r4 = r4.getBaseContext();
        r3 = com.whatsapp.util.a5.c(r3, r4);
        r2.setText(r3);
        r2 = 2131427745; // 0x7f0b01a1 float:1.8477115E38 double:1.0530652254E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r3 = 8;
        r2.setVisibility(r3);
        r2 = 2131427744; // 0x7f0b01a0 float:1.8477113E38 double:1.053065225E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r0 = r17;
        r4 = r0.a;
        r6 = com.whatsapp.App.f(r5);
        r4 = com.whatsapp.util.bm.h(r4, r6);
        r3 = r3.append(r4);
        r4 = " ";
        r3 = r3.append(r4);
        r3 = r3.toString();
        r2.setText(r3);
        r2 = r5.F;
        if (r2 == 0) goto L_0x0080;
    L_0x0076:
        r2 = r5.F;
        r3 = ",";
        r2 = r2.split(r3);
        if (r8 == 0) goto L_0x008b;
    L_0x0080:
        r2 = 0;
        r2 = new java.lang.String[r2];
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        com.whatsapp.util.Log.e(r3);
    L_0x008b:
        r3 = r2;
        r4 = 0;
        r6 = r3.length;
        r2 = 0;
        r16 = r2;
        r2 = r4;
        r4 = r16;
    L_0x0094:
        if (r4 >= r6) goto L_0x00b9;
    L_0x0096:
        r7 = r3[r4];
        r9 = com.whatsapp.App.aJ;
        r10 = new com.whatsapp.protocol.m;
        r11 = 1;
        r12 = r5.e;
        r12 = r12.a;
        r10.<init>(r7, r11, r12);
        r7 = r9.b(r10);
        if (r7 == 0) goto L_0x00b5;
    L_0x00aa:
        r7 = r7.a;
        r9 = 5;
        r7 = com.whatsapp.protocol.f.a(r7, r9);
        if (r7 < 0) goto L_0x00b5;
    L_0x00b3:
        r2 = r2 + 1;
    L_0x00b5:
        r4 = r4 + 1;
        if (r8 == 0) goto L_0x0094;
    L_0x00b9:
        r4 = r2;
        r2 = 2131427534; // 0x7f0b00ce float:1.8476687E38 double:1.053065121E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r6 = new com.whatsapp.zo;
        r0 = r17;
        r7 = r0.a;
        r9 = r5.y;
        if (r9 != 0) goto L_0x02cc;
    L_0x00cf:
        r5 = r3.length;
    L_0x00d0:
        r6.<init>(r7, r4, r5);
        r2.setImageDrawable(r6);
        r0 = r17;
        r2 = r0.a;
        r2 = r2.getWindow();
        r2 = r2.getDecorView();
        r2 = r2.getWidth();
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4);
        r4 = -2;
        r5 = 0;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5);
        r0 = r18;
        r0.measure(r2, r4);
        r2 = 2131427742; // 0x7f0b019e float:1.8477109E38 double:1.053065224E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r4 = r2.getMeasuredWidth();
        r5 = r2.getPaddingRight();
        r4 = r4 - r5;
        r2 = r2.getPaddingLeft();
        r9 = r4 + r2;
        r10 = new java.util.ArrayList;
        r10.<init>();
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = new java.util.ArrayList;
        r5.<init>();
        r6 = r3.length;
        r2 = 0;
    L_0x0120:
        if (r2 >= r6) goto L_0x0163;
    L_0x0122:
        r7 = r3[r2];
        r11 = com.whatsapp.App.P;
        r7 = r11.a(r7);
        r5.add(r7);
        r11 = r7.h;
        if (r11 != 0) goto L_0x013a;
    L_0x0131:
        r11 = r7.a();
        r4.add(r11);
        if (r8 == 0) goto L_0x015f;
    L_0x013a:
        r11 = r7.Q;
        r11 = android.text.TextUtils.isEmpty(r11);
        if (r11 != 0) goto L_0x0149;
    L_0x0142:
        r11 = r7.Q;
        r10.add(r11);
        if (r8 == 0) goto L_0x015f;
    L_0x0149:
        r11 = r7.N;
        r11 = android.text.TextUtils.isEmpty(r11);
        if (r11 != 0) goto L_0x0158;
    L_0x0151:
        r11 = r7.N;
        r10.add(r11);
        if (r8 == 0) goto L_0x015f;
    L_0x0158:
        r7 = r7.a();
        r4.add(r7);
    L_0x015f:
        r2 = r2 + 1;
        if (r8 == 0) goto L_0x0120;
    L_0x0163:
        java.util.Collections.sort(r10);
        java.util.Collections.sort(r4);
        r10.addAll(r4);
        r2 = 2131427743; // 0x7f0b019f float:1.847711E38 double:1.0530652244E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r5 = "";
        r4 = 0;
        r3 = "";
        r11 = r10.iterator();
        r6 = r4;
        r4 = r5;
        r5 = r3;
    L_0x0183:
        r3 = r11.hasNext();
        if (r3 == 0) goto L_0x0273;
    L_0x0189:
        r3 = r11.next();
        r3 = (java.lang.String) r3;
        r7 = r2.getPaint();
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r12 = r12.append(r4);
        r13 = z;
        r14 = 3;
        r13 = r13[r14];
        r12 = r12.append(r13);
        r12 = r12.append(r3);
        r12 = r12.toString();
        r12 = r7.measureText(r12);
        r7 = r4.length();
        if (r7 == 0) goto L_0x01e4;
    L_0x01b7:
        r7 = r10.size();
        r7 = r7 - r6;
        r13 = com.whatsapp.App.aX;
        r14 = 2131558406; // 0x7f0d0006 float:1.8742127E38 double:1.0531297805E-314;
        r13 = r13.a(r14, r7);
        r14 = 2;
        r14 = new java.lang.Object[r14];
        r15 = 0;
        r14[r15] = r4;
        r15 = 1;
        r7 = java.lang.Integer.valueOf(r7);
        r14[r15] = r7;
        r7 = java.lang.String.format(r13, r14);
        r13 = r2.getPaint();
        r13 = r13.measureText(r7);
        r14 = (float) r9;
        r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1));
        if (r13 >= 0) goto L_0x01e4;
    L_0x01e3:
        r5 = r7;
    L_0x01e4:
        r7 = (float) r9;
        r7 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1));
        if (r7 <= 0) goto L_0x0242;
    L_0x01e9:
        r4 = r4.length();
        if (r4 != 0) goto L_0x0219;
    L_0x01ef:
        r4 = r10.size();
        r7 = 1;
        if (r4 != r7) goto L_0x01f8;
    L_0x01f6:
        if (r8 == 0) goto L_0x02d0;
    L_0x01f8:
        r4 = com.whatsapp.App.aX;
        r7 = 2131558405; // 0x7f0d0005 float:1.8742125E38 double:1.05312978E-314;
        r12 = r10.size();
        r4 = r4.a(r7, r12);
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r12 = 0;
        r13 = r10.size();
        r13 = java.lang.Integer.valueOf(r13);
        r7[r12] = r13;
        r4 = java.lang.String.format(r4, r7);
        if (r8 == 0) goto L_0x0273;
    L_0x0219:
        r4 = r5.length();
        if (r4 <= 0) goto L_0x0221;
    L_0x021f:
        if (r8 == 0) goto L_0x02d5;
    L_0x0221:
        r4 = com.whatsapp.App.aX;
        r7 = 2131558405; // 0x7f0d0005 float:1.8742125E38 double:1.05312978E-314;
        r12 = r10.size();
        r4 = r4.a(r7, r12);
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r12 = 0;
        r13 = r10.size();
        r13 = java.lang.Integer.valueOf(r13);
        r7[r12] = r13;
        r4 = java.lang.String.format(r4, r7);
        if (r8 == 0) goto L_0x0273;
    L_0x0242:
        r7 = r4.length();
        if (r7 <= 0) goto L_0x025e;
    L_0x0248:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r4 = r7.append(r4);
        r7 = z;
        r12 = 2;
        r7 = r7[r12];
        r4 = r4.append(r7);
        r4 = r4.toString();
    L_0x025e:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r4 = r7.append(r4);
        r3 = r4.append(r3);
        r4 = r3.toString();
        r3 = r6 + 1;
        if (r8 == 0) goto L_0x02d2;
    L_0x0273:
        r2.setText(r4);
        r2 = 2131427752; // 0x7f0b01a8 float:1.847713E38 double:1.053065229E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r3 = 8;
        r2.setVisibility(r3);
        return;
    L_0x0285:
        r3 = r5.f();
        if (r8 == 0) goto L_0x0026;
    L_0x028b:
        r0 = r17;
        r3 = r0.a;
        r4 = 2131624187; // 0x7f0e00fb float:1.8875547E38 double:1.0531622806E-314;
        r3 = r3.getString(r4);
        if (r8 == 0) goto L_0x0026;
    L_0x0298:
        r0 = r17;
        r3 = r0.a;
        r4 = 2131624181; // 0x7f0e00f5 float:1.8875534E38 double:1.0531622777E-314;
        r3 = r3.getString(r4);
        if (r8 == 0) goto L_0x0026;
    L_0x02a5:
        r0 = r17;
        r3 = r0.a;
        r4 = 2131624190; // 0x7f0e00fe float:1.8875553E38 double:1.053162282E-314;
        r3 = r3.getString(r4);
        if (r8 == 0) goto L_0x0026;
    L_0x02b2:
        r0 = r17;
        r3 = r0.a;
        r4 = 2131624188; // 0x7f0e00fc float:1.8875549E38 double:1.053162281E-314;
        r3 = r3.getString(r4);
        if (r8 == 0) goto L_0x0026;
    L_0x02bf:
        r0 = r17;
        r3 = r0.a;
        r4 = 2131624186; // 0x7f0e00fa float:1.8875545E38 double:1.05316228E-314;
        r3 = r3.getString(r4);
        goto L_0x0026;
    L_0x02cc:
        r5 = r5.y;
        goto L_0x00d0;
    L_0x02d0:
        r4 = r3;
        goto L_0x0273;
    L_0x02d2:
        r6 = r3;
        goto L_0x0183;
    L_0x02d5:
        r4 = r5;
        goto L_0x0273;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.e.bindView(android.view.View, android.content.Context, android.database.Cursor):void");
    }
}
