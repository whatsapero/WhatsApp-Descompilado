package com.whatsapp;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.cn;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a88 extends ArrayAdapter {
    private static final String[] z;
    final am a;

    static {
        String[] strArr = new String[4];
        String str = "<~";
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
                        i3 = 16;
                        break;
                    case ay.f /*1*/:
                        i3 = 94;
                        break;
                    case ay.n /*2*/:
                        i3 = 114;
                        break;
                    case ay.p /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 71;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "5oV;i!8";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "<~";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "5oV;i!8";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int getViewTypeCount() {
        return 1;
    }

    public cn a(int i) {
        return (cn) this.a.i.get(i);
    }

    public a88(am amVar, Context context, List list) {
        this.a = amVar;
        super(context, R.layout.participant_list_row, list);
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public Object getItem(int i) {
        return a(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
        r18_this = this;
        r10 = com.whatsapp.App.az;
        if (r20 != 0) goto L_0x001c;
    L_0x0004:
        r0 = r18;
        r2 = r0.a;
        r2 = com.whatsapp.am.a(r2);
        r2 = r2.getLayoutInflater();
        r3 = 2130903186; // 0x7f030092 float:1.7413183E38 double:1.052806059E-314;
        r4 = 0;
        r0 = r21;
        r2 = com.whatsapp.b7.a(r2, r3, r0, r4);
        if (r10 == 0) goto L_0x01b2;
    L_0x001c:
        r2 = 2130839096; // 0x7f020638 float:1.7283193E38 double:1.052774394E-314;
        r0 = r20;
        r0.setBackgroundResource(r2);
        r2 = 1;
        r0 = r20;
        r0.setSelected(r2);
        r2 = 2131427637; // 0x7f0b0135 float:1.8476896E38 double:1.053065172E-314;
        r0 = r20;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = 2131427535; // 0x7f0b00cf float:1.847669E38 double:1.0530651216E-314;
        r0 = r20;
        r3 = r0.findViewById(r3);
        r9 = r3;
        r9 = (android.widget.TextView) r9;
        r3 = 2131427819; // 0x7f0b01eb float:1.8477265E38 double:1.053065262E-314;
        r0 = r20;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.ImageView) r3;
        r11 = r18.a(r19);
        r4 = com.whatsapp.App.P;
        r5 = r11.h;
        r4 = r4.a(r5);
        r0 = r18;
        r5 = r0.a;
        r5 = r5.f;
        r5 = r5.contains(r11);
        if (r5 == 0) goto L_0x006e;
    L_0x0064:
        r5 = -3151373; // 0xffffffffffcfe9f3 float:NaN double:NaN;
        r0 = r20;
        r0.setBackgroundColor(r5);
        if (r10 == 0) goto L_0x0074;
    L_0x006e:
        r5 = 0;
        r0 = r20;
        r0.setBackgroundResource(r5);
    L_0x0074:
        r0 = r20;
        r0.setTag(r11);
        r5 = r18.getContext();
        r5 = r4.a(r5);
        r2.setText(r5);
        r0 = r18;
        r2 = r0.a;
        r2 = com.whatsapp.am.h(r2);
        r2.b(r4, r3);
        r2 = java.lang.System.currentTimeMillis();
        r4 = r11.d;
        r2 = r2 - r4;
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x00ae;
    L_0x009d:
        r0 = r18;
        r2 = r0.a;
        r2 = com.whatsapp.am.a(r2);
        r3 = 2131624485; // 0x7f0e0225 float:1.8876151E38 double:1.053162428E-314;
        r2 = r2.getString(r3);
        if (r10 == 0) goto L_0x00c0;
    L_0x00ae:
        r2 = r11.d;
        r4 = java.lang.System.currentTimeMillis();
        r6 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r8 = 0;
        r2 = android.text.format.DateUtils.getRelativeTimeSpanString(r2, r4, r6, r8);
        r2 = r2.toString();
    L_0x00c0:
        r3 = r11.g;
        if (r3 == 0) goto L_0x00f9;
    L_0x00c4:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r18;
        r3 = r0.a;
        r3 = com.whatsapp.am.a(r3);
        r4 = 2131624482; // 0x7f0e0222 float:1.8876145E38 double:1.0531624264E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = r11.g;
        r7 = java.lang.Integer.valueOf(r7);
        r5[r6] = r7;
        r3 = r3.getString(r4, r5);
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x00f9:
        r3 = r11.i;
        r4 = (double) r3;
        r6 = 4601724776627584746; // 0x3fdc9c4da9003eea float:-2.847628E-14 double:0.44704;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 <= 0) goto L_0x01ae;
    L_0x0105:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = java.util.Locale.US;
        r4 = java.util.Locale.getDefault();
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x016c;
    L_0x0127:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r0 = r18;
        r3 = r0.a;
        r3 = com.whatsapp.am.a(r3);
        r4 = 2131624490; // 0x7f0e022a float:1.8876161E38 double:1.0531624303E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = z;
        r8 = 1;
        r7 = r7[r8];
        r8 = 1;
        r8 = new java.lang.Object[r8];
        r12 = 0;
        r13 = r11.i;
        r14 = (double) r13;
        r16 = 4612219559875242487; // 0x4001e540cc78e9f7 float:-6.5251292E7 double:2.23694;
        r14 = r14 * r16;
        r13 = java.lang.Double.valueOf(r14);
        r8[r12] = r13;
        r7 = java.lang.String.format(r7, r8);
        r5[r6] = r7;
        r3 = r3.getString(r4, r5);
        r2 = r2.append(r3);
        r2 = r2.toString();
        if (r10 == 0) goto L_0x01ae;
    L_0x016c:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r0 = r18;
        r3 = r0.a;
        r3 = com.whatsapp.am.a(r3);
        r4 = 2131624489; // 0x7f0e0229 float:1.887616E38 double:1.05316243E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = z;
        r8 = 2;
        r7 = r7[r8];
        r8 = 1;
        r8 = new java.lang.Object[r8];
        r10 = 0;
        r11 = r11.i;
        r12 = (double) r11;
        r14 = 4615288898129284301; // 0x400ccccccccccccd float:-1.07374184E8 double:3.6;
        r12 = r12 * r14;
        r11 = java.lang.Double.valueOf(r12);
        r8[r10] = r11;
        r7 = java.lang.String.format(r7, r8);
        r5[r6] = r7;
        r3 = r3.getString(r4, r5);
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x01ae:
        r9.setText(r2);
        return r20;
    L_0x01b2:
        r20 = r2;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a88.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getCount() {
        return this.a.i.size();
    }
}
