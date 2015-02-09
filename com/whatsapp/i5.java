package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class i5 implements OnClickListener {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "CvB".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 41;
                    break;
                case ay.f /*1*/:
                    i2 = 31;
                    break;
                case ay.n /*2*/:
                    i2 = 38;
                    break;
                case ay.p /*3*/:
                    i2 = 61;
                    break;
                default:
                    i2 = 42;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    i5(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.a, GroupChatRecentLocationsActivity.class);
        intent.putExtra(z, GroupChatInfo.b(this.a));
        this.a.startActivity(intent);
    }
}
