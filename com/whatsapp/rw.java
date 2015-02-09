package com.whatsapp;

import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class rw implements OnClickListener {
    private static final String z;
    final Conversation a;

    static {
        char[] toCharArray = "$tIS8,\u007f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 73;
                    break;
                case ay.f /*1*/:
                    i2 = 27;
                    break;
                case ay.n /*2*/:
                    i2 = 60;
                    break;
                case ay.p /*3*/:
                    i2 = 61;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    rw(Conversation conversation) {
        this.a = conversation;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r9) {
        /*
        r8_this = this;
        r7 = 1;
        r6 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r8.a;
        r0 = com.whatsapp.Conversation.o(r0);
        r0.dismiss();
        r0 = android.os.Environment.getExternalStorageState();
        r2 = z;
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0022;
    L_0x0019:
        r0 = r8.a;
        r2 = 15;
        r0.showDialog(r2);
        if (r1 == 0) goto L_0x0063;
    L_0x0022:
        r0 = r8.a;
        r0 = r0.r;
        r0 = r0.w();
        if (r0 == 0) goto L_0x0045;
    L_0x002c:
        r0 = r8.a;
        r2 = 2131624364; // 0x7f0e01ac float:1.8875906E38 double:1.053162368E-314;
        r3 = new java.lang.Object[r7];
        r4 = r8.a;
        r4 = r4.r;
        r5 = r8.a;
        r4 = r4.a(r5);
        r3[r6] = r4;
        r0 = r0.getString(r2, r3);
        if (r1 == 0) goto L_0x005c;
    L_0x0045:
        r0 = r8.a;
        r1 = 2131624827; // 0x7f0e037b float:1.8876845E38 double:1.053162597E-314;
        r2 = new java.lang.Object[r7];
        r3 = r8.a;
        r3 = r3.r;
        r4 = r8.a;
        r3 = r3.a(r4);
        r2[r6] = r3;
        r0 = r0.getString(r1, r2);
    L_0x005c:
        r1 = r8.a;
        com.whatsapp.util.f.a(r1, r0);
        com.whatsapp.Conversation.T = r6;
    L_0x0063:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.rw.onClick(android.view.View):void");
    }
}
