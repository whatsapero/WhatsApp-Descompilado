package com.whatsapp.util;

import android.view.View;
import android.view.ViewParent;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class x implements Runnable {
    private static final String[] z;
    final String a;
    final ae b;
    final View[] c;

    static {
        String[] strArr = new String[7];
        String str = "Jb\u0018#\u0004_d\u0004\"\tkd\u0004!\u0014\u0011v\u0004#\u0003su\u000383Le\u0003.\u0006Jy\u0002#\u0014\u001ed\u0005(\u0015[0\u0004>GJu\u00159]\u001e";
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
                        i3 = 62;
                        break;
                    case ay.f /*1*/:
                        i3 = 16;
                        break;
                    case ay.n /*2*/:
                        i3 = 109;
                        break;
                    case ay.p /*3*/:
                        i3 = 77;
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
                    str = "\u007fs\u0019$\bPR\f?$Q~\u0019(\u001fJF\u0004(\u0010";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "Jb\u0018#\u0004_d\u0004\"\tkd\u0004!\u0014\u0011v\u0004#\u0003su\u000383Le\u0003.\u0006Jy\u0002#\u0014\u001ed\u0005(\u0015[0\u0004>GP\u007fM9\u0002FdWm";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "ju\u001591Wu\u001a";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Jb\u0018#\u0004_d\u0004\"\tkd\u0004!\u0014\u001ed\b5\u0013\u00040";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "ry\u001e9*[~\u0018\u0004\u0013[}";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Jb\u0018#\u0004_d\u0004\"\tkd\u0004!\u0014\u0011v\u0004#\u0003su\u000383Le\u0003.\u0006Jy\u0002#\u0014\u001ec\u0006$\u0017Nu\tm\u0013[h\u0019wG";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    x(ae aeVar, View[] viewArr, String str) {
        this.b = aeVar;
        this.c = viewArr;
        this.a = str;
    }

    private boolean a(View view, String str) {
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return false;
            }
            if (parent.getClass().toString().contains(str)) {
                return true;
            }
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r7_this = this;
        r5 = 1;
        r6 = 0;
        r0 = r7.c;
        r1 = r0[r6];
        r0 = r1 instanceof android.widget.TextView;
        if (r0 == 0) goto L_0x0079;
    L_0x000a:
        r0 = r1;
        r0 = (android.widget.TextView) r0;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 5;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r0.getText();
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r1 = r1.getRootView();
        r2 = r7.a;
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r2 = r2.equalsIgnoreCase(r3);
        if (r2 == 0) goto L_0x007a;
    L_0x003b:
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r2 = r7.a(r0, r2);
        if (r2 != 0) goto L_0x007a;
    L_0x0046:
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r2 = r7.a(r0, r2);
        if (r2 != 0) goto L_0x007a;
    L_0x0051:
        r2 = com.whatsapp.util.g.f();
        r2 = r2.contains(r1);
        if (r2 != 0) goto L_0x007a;
    L_0x005b:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r5];
        r1 = r1.append(r2);
        r0 = r0.getText();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        com.whatsapp.util.g.b = r5;
    L_0x0079:
        return;
    L_0x007a:
        r2 = r0.getText();
        r2 = r2.toString();
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 == 0) goto L_0x00a5;
    L_0x0088:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 3;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.append(r2);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r3 = com.whatsapp.util.Log.e;
        if (r3 == 0) goto L_0x00bf;
    L_0x00a5:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r4 = r4[r6];
        r3 = r3.append(r4);
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        com.whatsapp.util.g.b = r6;
    L_0x00bf:
        r2 = com.whatsapp.util.g.f();
        r2.add(r1);
        r2 = r0.getViewTreeObserver();
        r3 = new com.whatsapp.util.bh;
        r3.<init>(r7, r1, r0);
        r2.addOnGlobalLayoutListener(r3);
        goto L_0x0079;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.x.run():void");
    }
}
