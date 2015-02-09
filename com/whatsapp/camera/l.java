package com.whatsapp.camera;

import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.view.View;
import com.whatsapp.App;
import com.whatsapp.ge;
import com.whatsapp.util.ar;
import com.whatsapp.wallpaper.CropImage;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class l extends ar {
    private static final String[] z;
    final Uri b;
    final CameraActivity c;

    static {
        String[] strArr = new String[11];
        String str = "j\u0018,\u0012\u001ep%6\u0016,|\u001e\u0010\u000b&l";
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
                        i3 = 9;
                        break;
                    case ay.f /*1*/:
                        i3 = 106;
                        break;
                    case ay.n /*2*/:
                        i3 = 67;
                        break;
                    case ay.p /*3*/:
                        i3 = 98;
                        break;
                    default:
                        i3 = 92;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "o\u0006\"\u0016(l\u0004\u0011\r(h\u001e*\r2";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "{\u00057\u0003(`\u0005-";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "f\u001f7\u0012)}";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "j\u000b.\u0007.h";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "d\u000b;!.f\u001a";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "o\u0006*\u0012\u0014";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "`\u0004*\u00165h\u0006\u0011\u0007?}";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    str = "z\t\"\u000e9\\\u001a\n\u0004\u0012l\u000f'\u00078";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = "f\u001f7\u0012)},,\u00101h\u001e";
                    obj = 9;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "o\u0006*\u0012qa";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(View view) {
        Intent intent = new Intent(this.c, CropImage.class);
        intent.putExtra(z[9], false);
        intent.putExtra(z[0], false);
        intent.putExtra(z[2], false);
        intent.putExtra(z[6], ge.h);
        intent.putExtra(z[4], Uri.fromFile(App.t(z[5])));
        intent.putExtra(z[10], CompressFormat.JPEG.toString());
        intent.setData(this.b);
        if (CameraActivity.c(this.c) != null) {
            intent.putExtra(z[8], CameraActivity.c(this.c));
        }
        if (CameraActivity.i(this.c) != 0) {
            intent.putExtra(z[3], CameraActivity.i(this.c));
        }
        if (this.b.getQueryParameter(z[1]) != null) {
            intent.putExtra(z[7], true);
        }
        this.c.startActivityForResult(intent, 1);
    }

    l(CameraActivity cameraActivity, Uri uri) {
        this.c = cameraActivity;
        this.b = uri;
    }
}
