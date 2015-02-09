package com.whatsapp.gallerypicker;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.a5;
import java.util.ArrayList;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class av implements OnClickListener {
    private static final String[] z;
    final ImagePreview a;

    static {
        String[] strArr = new String[4];
        String str = "/vwg\u0010#y";
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
                        i3 = 76;
                        break;
                    case ay.f /*1*/:
                        i3 = 23;
                        break;
                    case ay.n /*2*/:
                        i3 = 7;
                        break;
                    case ay.p /*3*/:
                        i3 = 19;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "/vwg\u0010#y";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = ">xsr\r%xi";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "-yca\u0016%s)z\u00178rigW)osa\u0018bDSA<\rZ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        int i = ImagePreview.y;
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        Iterator it = ImagePreview.q(this.a).iterator();
        while (it.hasNext()) {
            Object obj = (Uri) it.next();
            Integer num = (Integer) ImagePreview.j(this.a).get(obj);
            String str = (String) ImagePreview.b(this.a).get(obj);
            if (ImagePreview.c(this.a).containsKey(obj)) {
                obj = (Uri) ImagePreview.c(this.a).get(obj);
            }
            if (obj.getQueryParameter(z[2]) != null) {
                obj = obj.buildUpon().query(null).build();
            }
            if (num != null) {
                obj = obj.buildUpon().appendQueryParameter(z[3], num.toString()).build();
            }
            if (str != null) {
                obj = obj.buildUpon().appendQueryParameter(z[0], a5.a(str)).build();
            }
            arrayList.add(obj);
            if (i != 0) {
                break;
            }
        }
        intent.putParcelableArrayListExtra(z[1], arrayList);
        this.a.setResult(-1, intent);
        ImagePreview.h(this.a);
        this.a.finish();
    }

    av(ImagePreview imagePreview) {
        this.a = imagePreview;
    }
}
