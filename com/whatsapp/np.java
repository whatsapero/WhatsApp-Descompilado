package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class np implements OnClickListener {
    private static final String z;
    final ChangeNumberOverview a;

    static {
        char[] toCharArray = "[X\u00017G]^\u00154B]B\u000f/EJF\t<W\u0017^\u0005!T".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 96;
                    break;
                case ay.p /*3*/:
                    i2 = 89;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    np(ChangeNumberOverview changeNumberOverview) {
        this.a = changeNumberOverview;
    }

    public void onClick(View view) {
        Log.i(z);
        this.a.startActivity(new Intent(this.a, ChangeNumber.class));
        this.a.finish();
    }
}
