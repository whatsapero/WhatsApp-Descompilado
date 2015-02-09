package com.whatsapp;

import android.content.ContentValues;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.contact.ContactProvider;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class fb implements OnClickListener {
    private static final String[] z;
    final Advanced a;

    static {
        String[] strArr = new String[4];
        String str = " 1L}*\u0005#]o";
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
                        i3 = 100;
                        break;
                    case ay.f /*1*/:
                        i3 = 80;
                        break;
                    case ay.n /*2*/:
                        i3 = 56;
                        break;
                    case ay.p /*3*/:
                        i3 = 28;
                        break;
                    default:
                        i3 = 72;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u00061[w=\u0014p\\~;";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u00131\u0016x*";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u00141Lt";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        App.v(z[2]);
        try {
            App.aJ.a(false, false, false);
            Conversation.C();
            ContentValues contentValues = new ContentValues();
            contentValues.put(z[1], new File(new File(App.ao, z[0]), z[3]).getAbsolutePath());
            this.a.getContentResolver().insert(ContactProvider.f, contentValues);
        } catch (Exception e) {
        }
    }

    fb(Advanced advanced) {
        this.a = advanced;
    }
}
