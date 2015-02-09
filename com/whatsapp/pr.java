package com.whatsapp;

import android.view.View.OnLongClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class pr implements OnLongClickListener {
    private static final String z;
    final Conversation a;

    static {
        char[] toCharArray = "\u0017\u007f\u001f\u0019C\u001ft".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 122;
                    break;
                case ay.f /*1*/:
                    i2 = 16;
                    break;
                case ay.n /*2*/:
                    i2 = 106;
                    break;
                case ay.p /*3*/:
                    i2 = 119;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    pr(Conversation conversation) {
        this.a = conversation;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onLongClick(android.view.View r3) {
        /*
        r2_this = this;
        r0 = r2.a;
        r0 = com.whatsapp.Conversation.o(r0);
        r0.dismiss();
        r0 = android.os.Environment.getExternalStorageState();
        r1 = z;
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0020;
    L_0x0015:
        r0 = r2.a;
        r1 = 15;
        r0.showDialog(r1);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x002a;
    L_0x0020:
        r0 = 21;
        r1 = r2.a;
        com.whatsapp.util.f.a(r0, r1);
        r0 = 0;
        com.whatsapp.Conversation.T = r0;
    L_0x002a:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.pr.onLongClick(android.view.View):boolean");
    }
}
