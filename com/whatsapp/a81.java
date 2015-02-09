package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import defpackage.m;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a81 implements OnClickListener {
    private static final String[] z;
    final ViewSharedContactActivity a;

    static {
        String[] strArr = new String[3];
        String str = "\u0017R2)?HJ68%";
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
                        i3 = 103;
                        break;
                    case ay.f /*1*/:
                        i3 = 62;
                        break;
                    case ay.n /*2*/:
                        i3 = 83;
                        break;
                    case ay.p /*3*/:
                        i3 = 64;
                        break;
                    default:
                        i3 = 81;
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
                    str = "\u0006P72>\u000eZ})?\u0013[=4\u007f\u0002F'20I{\u001e\u0001\u0018+";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0006P72>\u000eZ})?\u0013[=4\u007f\u0006]')>\t\u0010\u0000\u0005\u001f#";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        if (ViewSharedContactActivity.b(this.a)) {
            ViewSharedContactActivity.a(this.a, view);
            return;
        }
        String str = ((m) view.getTag()).d;
        Intent intent = new Intent(z[1]);
        intent.setType(z[0]);
        intent.putExtra(z[2], new String[]{str});
        this.a.startActivity(intent);
    }

    a81(ViewSharedContactActivity viewSharedContactActivity) {
        this.a = viewSharedContactActivity;
    }
}
