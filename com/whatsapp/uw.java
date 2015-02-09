package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class uw {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u0001 \u001fr\u001a\u00157\u0016q1\u0014\r\u0017q!\u00183";
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
                        i3 = 113;
                        break;
                    case ay.f /*1*/:
                        i3 = 82;
                        break;
                    case ay.n /*2*/:
                        i3 = 122;
                        break;
                    case ay.p /*3*/:
                        i3 = 20;
                        break;
                    default:
                        i3 = 69;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0012=\u0017:2\u00193\u000eg$\u0001\"%d7\u00144\u001ff \u001f1\u001fg";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0015;\u001bx*\u0016}\u001eq)\u0014&\u001f4+\u001er\u0017q6\u00023\u001dq6";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Dialog a(android.app.Activity r11, java.util.Collection r12, java.lang.String r13, int r14, com.whatsapp.ams r15) {
        /*
        r10 = 2;
        r6 = 0;
        r3 = 0;
        r5 = 1;
        r7 = com.whatsapp.App.az;
        if (r12 == 0) goto L_0x000e;
    L_0x0008:
        r0 = r12.isEmpty();
        if (r0 == 0) goto L_0x0016;
    L_0x000e:
        r0 = z;
        r0 = r0[r5];
        com.whatsapp.util.Log.e(r0);
    L_0x0015:
        return r6;
    L_0x0016:
        r0 = com.whatsapp.App.P;
        r2 = r0.a(r13);
        r0 = r12.size();
        if (r0 != r5) goto L_0x0078;
    L_0x0022:
        r0 = r12.iterator();
        r0 = r0.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r1 = r0.e;
        r1 = r1.b;
        if (r1 == 0) goto L_0x003f;
    L_0x0032:
        r1 = r11.getResources();
        r4 = 2131624228; // 0x7f0e0124 float:1.887563E38 double:1.053162301E-314;
        r1 = r1.getString(r4);
        if (r7 == 0) goto L_0x0169;
    L_0x003f:
        r1 = "";
        r4 = r2.w();
        if (r4 == 0) goto L_0x0166;
    L_0x0047:
        r4 = r0.F;
        if (r4 == 0) goto L_0x0163;
    L_0x004b:
        r4 = com.whatsapp.App.P;
        r0 = r0.F;
        r0 = r4.a(r0);
        if (r0 == 0) goto L_0x0160;
    L_0x0055:
        r0 = r0.a(r11);
    L_0x0059:
        if (r7 == 0) goto L_0x0067;
    L_0x005b:
        if (r2 == 0) goto L_0x0067;
    L_0x005d:
        r1 = r2.a(r11);
        if (r1 == 0) goto L_0x0067;
    L_0x0063:
        r0 = r2.a(r11);
    L_0x0067:
        r1 = r11.getResources();
        r2 = 2131624227; // 0x7f0e0123 float:1.8875628E38 double:1.0531623004E-314;
        r4 = new java.lang.Object[r5];
        r4[r3] = r0;
        r0 = r1.getString(r2, r4);
    L_0x0076:
        if (r7 == 0) goto L_0x015d;
    L_0x0078:
        r0 = com.whatsapp.App.aX;
        r1 = 2131558412; // 0x7f0d000c float:1.874214E38 double:1.0531297835E-314;
        r2 = r12.size();
        r0 = r0.a(r1, r2);
        r1 = new java.lang.Object[r5];
        r2 = r12.size();
        r2 = java.lang.Integer.valueOf(r2);
        r1[r3] = r2;
        r0 = java.lang.String.format(r0, r1);
        r2 = r0;
    L_0x0096:
        r4 = r12.iterator();
        r1 = r3;
    L_0x009b:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x015a;
    L_0x00a1:
        r0 = r4.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r8 = r0.j;
        if (r8 == r5) goto L_0x00b8;
    L_0x00ab:
        r8 = r0.j;
        r9 = 3;
        if (r8 == r9) goto L_0x00b8;
    L_0x00b0:
        r8 = r0.j;
        if (r8 != r10) goto L_0x0157;
    L_0x00b4:
        r8 = r0.w;
        if (r8 == r5) goto L_0x0157;
    L_0x00b8:
        r8 = r0.A;
        if (r8 == 0) goto L_0x0157;
    L_0x00bc:
        r0 = r0.A;
        r0 = (com.whatsapp.MediaData) r0;
        r8 = r0.file;
        if (r8 == 0) goto L_0x0157;
    L_0x00c4:
        r0 = r0.file;
        r0 = r0.exists();
        if (r0 == 0) goto L_0x0157;
    L_0x00cc:
        if (r7 == 0) goto L_0x0154;
    L_0x00ce:
        r0 = r5;
    L_0x00cf:
        if (r7 == 0) goto L_0x0151;
    L_0x00d1:
        r8 = new android.app.AlertDialog$Builder;
        r8.<init>(r11);
        if (r0 == 0) goto L_0x0112;
    L_0x00d8:
        r0 = r11.getLayoutInflater();
        r1 = 2130903134; // 0x7f03005e float:1.7413077E38 double:1.052806033E-314;
        r9 = com.whatsapp.b7.a(r0, r1, r6, r3);
        r0 = 2131427767; // 0x7f0b01b7 float:1.847716E38 double:1.0530652363E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.CheckBox) r0;
        r1 = com.whatsapp.App.p;
        r4 = z;
        r4 = r4[r10];
        r1 = r1.getSharedPreferences(r4, r3);
        r4 = z;
        r4 = r4[r3];
        r4 = r1.getBoolean(r4, r5);
        r0.setChecked(r4);
        r1 = 2131427766; // 0x7f0b01b6 float:1.8477158E38 double:1.053065236E-314;
        r1 = r9.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r1.setText(r2);
        r8.setView(r9);
        if (r7 == 0) goto L_0x014f;
    L_0x0112:
        r0 = r11.getBaseContext();
        r0 = com.whatsapp.util.a5.d(r2, r0);
        r8.setMessage(r0);
        r4 = r3;
        r3 = r6;
    L_0x011f:
        r8 = r8.setCancelable(r5);
        r9 = 2131624204; // 0x7f0e010c float:1.8875581E38 double:1.053162289E-314;
        r0 = new com.whatsapp.ak8;
        r1 = r11;
        r2 = r14;
        r5 = r13;
        r6 = r12;
        r7 = r15;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r0 = r8.setPositiveButton(r9, r0);
        r1 = 2131624059; // 0x7f0e007b float:1.8875287E38 double:1.0531622174E-314;
        r2 = new com.whatsapp.a1z;
        r2.<init>(r11, r14);
        r0 = r0.setNegativeButton(r1, r2);
        r1 = new com.whatsapp.l0;
        r1.<init>(r11, r14);
        r0 = r0.setOnCancelListener(r1);
        r6 = r0.create();
        goto L_0x0015;
    L_0x014f:
        r3 = r0;
        goto L_0x011f;
    L_0x0151:
        r1 = r0;
        goto L_0x009b;
    L_0x0154:
        r0 = r5;
        goto L_0x00d1;
    L_0x0157:
        r0 = r1;
        goto L_0x00cf;
    L_0x015a:
        r0 = r1;
        goto L_0x00d1;
    L_0x015d:
        r2 = r0;
        goto L_0x0096;
    L_0x0160:
        r0 = r1;
        goto L_0x0059;
    L_0x0163:
        r0 = r1;
        goto L_0x0067;
    L_0x0166:
        r0 = r1;
        goto L_0x005b;
    L_0x0169:
        r0 = r1;
        goto L_0x0076;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.uw.a(android.app.Activity, java.util.Collection, java.lang.String, int, com.whatsapp.ams):android.app.Dialog");
    }
}
