package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.whatsapp.protocol.b;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class oh implements OnItemClickListener {
    private static final String z;
    final Broadcasts a;

    static {
        char[] toCharArray = "A\u0007".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 40;
                    break;
                case ay.f /*1*/:
                    i2 = 99;
                    break;
                case ay.n /*2*/:
                    i2 = 86;
                    break;
                case ay.p /*3*/:
                    i2 = 94;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    oh(Broadcasts broadcasts) {
        this.a = broadcasts;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        b bVar = (b) view.getTag();
        Intent intent = new Intent(this.a, BroadcastDetails.class);
        intent.putExtra(z, bVar.e.a);
        this.a.startActivity(intent);
    }
}
