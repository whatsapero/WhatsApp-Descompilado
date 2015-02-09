package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class fs implements OnClickListener {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "(\t\u0014".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 66;
                    break;
                case ay.f /*1*/:
                    i2 = 96;
                    break;
                case ay.n /*2*/:
                    i2 = 112;
                    break;
                case ay.p /*3*/:
                    i2 = 88;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        int i = App.az;
        if (!bd.f(GroupChatInfo.b(this.a))) {
            this.a.f(this.a.getString(R.string.failed_update_photo_not_authorized));
            if (i == 0) {
                return;
            }
        }
        if (GroupChatInfo.d(this.a).B) {
            Intent intent = new Intent(this.a, ViewProfilePhoto.class);
            intent.putExtra(z, GroupChatInfo.d(this.a).e);
            this.a.startActivityForResult(intent, 14);
            if (i == 0) {
                return;
            }
        }
        zv.a(GroupChatInfo.d(this.a), this.a, 12);
    }

    fs(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
