package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class gu implements OnClickListener {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "Qa\u0006".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 59;
                    break;
                case ay.f /*1*/:
                    i2 = 8;
                    break;
                case ay.n /*2*/:
                    i2 = 98;
                    break;
                case ay.p /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 20;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    gu(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(View view) {
        Class cls = null;
        if (App.H()) {
            cls = GroupChatLiveLocationsActivity2.class;
        } else if (App.t()) {
            cls = GroupChatLiveLocationsActivity.class;
        } else if (App.ag()) {
            cls = GroupChatLiveLocationsActivity.class;
        }
        if (cls != null) {
            Intent intent = new Intent(this.a, cls);
            intent.putExtra(z, GroupChatInfo.b(this.a));
            this.a.startActivity(intent);
        }
    }
}
