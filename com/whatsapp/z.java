package com.whatsapp;

import android.view.View;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class z implements Runnable {
    private static final String[] z;
    final String a;
    final boolean b;
    final ConversationsFragment c;

    static {
        String[] strArr = new String[3];
        String str = "\u0018BQUu\t^^Wy\u0014CL\fb\u001eKMFc\u0013\u0017\u001fM\u007f[[VFg[KPQ0";
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
                        i3 = 123;
                        break;
                    case ay.f /*1*/:
                        i3 = 45;
                        break;
                    case ay.n /*2*/:
                        i3 = 63;
                        break;
                    case ay.p /*3*/:
                        i3 = 35;
                        break;
                    default:
                        i3 = 16;
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
                    str = "\u0018BQUu\t^^Wy\u0014CL\fw\tBJS?\u000fBXD|\u001ejMLe\u000b}MLw\tHLPr\u001a_\u0010\u0019";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "[\u0005";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        int i = App.az;
        Log.i(z[2] + this.a);
        View a = ConversationsFragment.a(this.c, this.a);
        if (a != null) {
            if (this.b) {
                a.findViewById(R.id.progressbar_small).setVisibility(0);
                if (i == 0) {
                    return;
                }
            }
            a.findViewById(R.id.progressbar_small).setVisibility(8);
            if (i == 0) {
                return;
            }
        }
        Log.w(z[0] + this.a + " " + ConversationsFragment.c(this.c).getFirstVisiblePosition() + "-" + ConversationsFragment.c(this.c).getLastVisiblePosition() + z[1] + ConversationsFragment.c(this.c).getCount() + ")");
    }

    z(ConversationsFragment conversationsFragment, String str, boolean z) {
        this.c = conversationsFragment;
        this.a = str;
        this.b = z;
    }
}
