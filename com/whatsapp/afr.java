package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.contact.c;
import com.whatsapp.contact.i;
import com.whatsapp.contact.k;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class afr extends AsyncTask {
    private static final String[] z;
    final ContactPickerHelp a;

    static {
        String[] strArr = new String[4];
        String str = "oQ'OloJ!^a|\u0011:Bco\u0011/Zd`[-\u0014nnM=ZyyMi";
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
                        i3 = 12;
                        break;
                    case ay.f /*1*/:
                        i3 = 62;
                        break;
                    case ay.n /*2*/:
                        i3 = 73;
                        break;
                    case ay.p /*3*/:
                        i3 = 59;
                        break;
                    default:
                        i3 = 13;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "oQ'OloJ!^a|\u0011:Bco\u0011/Zd`[-\u0014nnM=ZyyMi";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "oQ'OloJ!^a|\u0011:Bco\u0011:Nno[:H\"o\\:OlxK:\u001b";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "oQ'OloJ!^a|\u0011:Bco\u0011/Zd`[-\u0014nnM=ZyyMi";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected k a(Void[] voidArr) {
        return i.d(this.a.getApplicationContext(), c.INTERACTIVE_FULL);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.contact.k r7) {
        /*
        r6_this = this;
        r5 = 2;
        r4 = 1;
        r0 = com.whatsapp.App.az;
        r1 = r6.a;
        r1.removeDialog(r5);
        r1 = com.whatsapp.r.a;
        r2 = r7.ordinal();
        r1 = r1[r2];
        switch(r1) {
            case 1: goto L_0x0015;
            case 2: goto L_0x0053;
            case 3: goto L_0x0096;
            case 4: goto L_0x0096;
            case 5: goto L_0x00dd;
            default: goto L_0x0014;
        };
    L_0x0014:
        return;
    L_0x0015:
        r1 = com.whatsapp.App.a0;
        r1.b(r4);
        r1 = com.whatsapp.App.p;
        r2 = java.lang.System.currentTimeMillis();
        r1.d(r2);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r6.a;
        r2 = r2.l;
        r2 = r2.isChecked();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r6.a;
        r2 = 2131624154; // 0x7f0e00da float:1.887548E38 double:1.0531622643E-314;
        r3 = new com.whatsapp.ua;
        r3.<init>(r6);
        r1.a(r2, r3);
        if (r0 == 0) goto L_0x0014;
    L_0x0053:
        r1 = r6.a;
        r1.m = r4;
        r1 = r6.a;
        r1 = r1.l;
        r1.toggle();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r6.a;
        r2 = r2.l;
        r2 = r2.isChecked();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r6.a;
        r2 = r6.a;
        r2 = r2.l;
        r2 = r2.isChecked();
        com.whatsapp.App.b(r1, r2);
        r1 = r6.a;
        r2 = 2131624089; // 0x7f0e0099 float:1.8875348E38 double:1.053162232E-314;
        r1.a(r2);
        if (r0 == 0) goto L_0x0014;
    L_0x0096:
        r1 = com.whatsapp.App.a0;
        r1.a(r4);
        r1 = r6.a;
        r1.m = r4;
        r1 = r6.a;
        r1 = r1.l;
        r1.toggle();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = r6.a;
        r2 = r2.l;
        r2 = r2.isChecked();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r6.a;
        r2 = r6.a;
        r2 = r2.l;
        r2 = r2.isChecked();
        com.whatsapp.App.b(r1, r2);
        r1 = r6.a;
        r2 = 2131624088; // 0x7f0e0098 float:1.8875346E38 double:1.0531622317E-314;
        r1.a(r2);
        if (r0 == 0) goto L_0x0014;
    L_0x00dd:
        r0 = r6.a;
        r0.m = r4;
        r0 = r6.a;
        r0 = r0.l;
        r0.toggle();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r1 = r1[r5];
        r0 = r0.append(r1);
        r1 = r6.a;
        r1 = r1.l;
        r1 = r1.isChecked();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r6.a;
        r1 = r6.a;
        r1 = r1.l;
        r1 = r1.isChecked();
        com.whatsapp.App.b(r0, r1);
        r0 = r6.a;
        r1 = 2131624090; // 0x7f0e009a float:1.887535E38 double:1.0531622327E-314;
        r0.a(r1);
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.afr.a(com.whatsapp.contact.k):void");
    }

    afr(ContactPickerHelp contactPickerHelp, v7 v7Var) {
        this(contactPickerHelp);
    }

    protected void onPostExecute(Object obj) {
        a((k) obj);
    }

    private afr(ContactPickerHelp contactPickerHelp) {
        this.a = contactPickerHelp;
    }

    protected void onPreExecute() {
        this.a.showDialog(2);
    }
}
