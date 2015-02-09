package com.whatsapp.wallpaper;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import com.whatsapp.App;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class k implements OnClickListener {
    private static final String[] z;
    final WallpaperPicker a;

    static {
        String[] strArr = new String[5];
        String str = ")pVELg2M[\u0006;2ME\u0012:rEOI8 OD\u001bfjDJ\u0002;|\\[X?|@G\u0006)mIY";
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
                        i3 = 72;
                        break;
                    case ay.f /*1*/:
                        i3 = 29;
                        break;
                    case ay.n /*2*/:
                        i3 = 44;
                        break;
                    case ay.p /*3*/:
                        i3 = 43;
                        break;
                    default:
                        i3 = 118;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = " iX[\u0005r2\u0003\\\u0001?3[C\u0017<nM[\u0006f~CFY)sHY\u0019!y\u0003|\u001e)i_j\u00068JMG\u001a8|\\N\u0004f|\\@";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "!s__\u0017$qsE\u0019&BAJ\u0004#xXt\u00178m_";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ")sHY\u0019!y\u0002B\u0018<xB_X)~XB\u0019&3zb3\u001f";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "%|^@\u0013<'\u0003\u0004\u0012-iMB\u001a;\"EOK+rA\u0005\u0001 |XX\u00178m\u0002\\\u0017$q\\J\u0006-o";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Uri uri = null;
        if (App.G == 2) {
            uri = Uri.parse(z[0]);
        } else if (App.G == 0) {
            uri = Uri.parse(z[1]);
        } else {
            try {
                int i2 = Secure.getInt(App.e, z[3]);
                uri = Uri.parse(z[2]);
                if (i2 != 1) {
                    this.a.removeDialog(1);
                    this.a.showDialog(2);
                    return;
                }
            } catch (SettingNotFoundException e) {
            }
        }
        this.a.startActivity(new Intent(z[4], uri));
        this.a.removeDialog(1);
        this.a.finish();
    }

    k(WallpaperPicker wallpaperPicker) {
        this.a = wallpaperPicker;
    }
}
