package com.whatsapp;

import android.widget.AdapterView.OnItemClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class nn implements OnItemClickListener {
    private static final String[] z;
    final ConversationsFragment a;

    static {
        String[] strArr = new String[8];
        String str = "E\u0017H\u000fNT\u000bG\rBI\u0016UVHJ\u0011E\u0012\u0004H\rJ\u0015\u0004V\u0017UY";
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
                        i3 = 38;
                        break;
                    case ay.f /*1*/:
                        i3 = 120;
                        break;
                    case ay.n /*2*/:
                        i3 = 38;
                        break;
                    case ay.p /*3*/:
                        i3 = 121;
                        break;
                    default:
                        i3 = 43;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "E\u0017H\u000fNT\u000bG\rBI\u0016UVHJ\u0011E\u0012\u0004H\u0017RYXG\u0015CYAO\u001c\u0007Y]O\u001dQD";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "A\nI\f[y\u0016I\rBE\u001df\rNK\b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "D\nI\u0018OE\u0019U\r";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "a\nI\f[E\u0010G\r\u000bh\u0017R\u0010HCYf\rNK\b";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\nXJ\u0010XRE";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "E\u0017H\u000fNT\u000bG\rBI\u0016UVHJ\u0011E\u0012\u0004L\u0011BY";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0006\bI\n\u0016";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    nn(ConversationsFragment conversationsFragment) {
        this.a = conversationsFragment;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView r11, android.view.View r12, int r13, long r14) {
        /*
        r10_this = this;
        r9 = 2131624584; // 0x7f0e0288 float:1.8876352E38 double:1.053162477E-314;
        r8 = 2;
        r7 = 0;
        r2 = com.whatsapp.App.az;
        r0 = r12.getTag();
        r0 = (com.whatsapp._f) r0;
        if (r0 != 0) goto L_0x0028;
    L_0x000f:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r1 = r1[r7];
        r0 = r0.append(r1);
        r0 = r0.append(r13);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
    L_0x0027:
        return;
    L_0x0028:
        r3 = r0.g;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = z;
        r5 = 7;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r1 = r1.append(r3);
        r4 = z;
        r5 = 1;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r1 = r1.append(r13);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r10.a;
        r1 = com.whatsapp.ConversationsFragment.i(r1);
        r1 = r1.get(r13);
        r1 = (java.lang.String) r1;
        r4 = r3.equals(r1);
        if (r4 != 0) goto L_0x0087;
    L_0x0062:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r5 = r5[r8];
        r4 = r4.append(r5);
        r3 = r4.append(r3);
        r4 = z;
        r5 = 6;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.append(r1);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
    L_0x0087:
        r3 = com.whatsapp.v.b(r1);
        r0 = r0.c;
        r0 = r0.getVisibility();
        if (r0 == 0) goto L_0x0027;
    L_0x0093:
        r0 = z;
        r4 = 3;
        r0 = r0[r4];
        r0 = r1.contains(r0);
        if (r0 != 0) goto L_0x00a9;
    L_0x009e:
        r0 = z;
        r4 = 5;
        r0 = r0[r4];
        r0 = r1.contains(r0);
        if (r0 == 0) goto L_0x00d7;
    L_0x00a9:
        r0 = com.whatsapp.App.aJ;
        r0 = r0.B(r1);
        if (r0 == 0) goto L_0x00b7;
    L_0x00b1:
        r4 = r0.k;
        r0 = (int) r4;
        r4 = -2;
        if (r0 != r4) goto L_0x0027;
    L_0x00b7:
        r0 = com.whatsapp.App.a();
        if (r0 == 0) goto L_0x00ca;
    L_0x00bd:
        com.whatsapp.bd.f();
        r0 = new com.whatsapp.z5;
        r0.<init>(r10);
        com.whatsapp.util.br.a(r0);
        if (r2 == 0) goto L_0x00d5;
    L_0x00ca:
        r0 = r10.a;
        r0 = r0.getActivity();
        com.whatsapp.App.b(r0, r9, r7);
        if (r2 != 0) goto L_0x0027;
    L_0x00d5:
        if (r2 == 0) goto L_0x0027;
    L_0x00d7:
        r0 = com.whatsapp.m8.e(r1);
        if (r0 == 0) goto L_0x0111;
    L_0x00dd:
        r0 = com.whatsapp.App.a();
        if (r0 == 0) goto L_0x0106;
    L_0x00e3:
        r0 = com.whatsapp.App.aJ;
        r4 = r0.B(r1);
        if (r4 == 0) goto L_0x0027;
    L_0x00eb:
        r5 = com.whatsapp.App.aJ;
        r6 = r4.f();
        r0 = r4.A;
        r0 = (java.util.Vector) r0;
        r0 = com.whatsapp.bd.a(r1, r6, r0, r8);
        r5.f(r0);
        r0 = new com.whatsapp.z1;
        r0.<init>(r10, r1, r4);
        com.whatsapp.util.br.a(r0);
        if (r2 == 0) goto L_0x0027;
    L_0x0106:
        r0 = r10.a;
        r0 = r0.getActivity();
        com.whatsapp.App.b(r0, r9, r7);
        if (r2 == 0) goto L_0x0027;
    L_0x0111:
        r0 = z;
        r4 = 4;
        r0 = r0[r4];
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0130;
    L_0x011c:
        r0 = r10.a;
        r1 = new android.content.Intent;
        r4 = r10.a;
        r4 = r4.getActivity();
        r5 = com.whatsapp.Broadcasts.class;
        r1.<init>(r4, r5);
        r0.startActivity(r1);
        if (r2 == 0) goto L_0x0027;
    L_0x0130:
        r0 = r3.b();
        if (r0 != 0) goto L_0x0027;
    L_0x0136:
        r0 = r10.a;
        r1 = com.whatsapp.Conversation.a(r3);
        r0.startActivity(r1);
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.nn.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
