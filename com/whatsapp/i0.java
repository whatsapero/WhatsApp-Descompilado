package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class i0 implements OnClickListener {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "\u00103-".toCharArray();
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
                    i2 = 90;
                    break;
                case ay.n /*2*/:
                    i2 = 73;
                    break;
                case ay.p /*3*/:
                    i2 = 119;
                    break;
                default:
                    i2 = 26;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    i0(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(View view) {
        if (App.t()) {
            Intent intent = new Intent(this.a, GroupChatRecentLocationsActivity.class);
            intent.putExtra(z, GroupChatInfo.b(this.a));
            this.a.startActivity(intent);
            if (App.az == 0) {
                return;
            }
        }
        App.b(this.a, (int) R.string.google_maps_not_available, 0);
    }
}
