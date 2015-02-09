package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.a5;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class an_ implements OnClickListener {
    private static final String[] z;
    final VideoPreviewActivity a;

    static {
        String[] strArr = new String[4];
        String str = "TOe+/FTg#";
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
                        i3 = 32;
                        break;
                    case ay.f /*1*/:
                        i3 = 38;
                        break;
                    case ay.n /*2*/:
                        i3 = 8;
                        break;
                    case ay.p /*3*/:
                        i3 = 78;
                        break;
                    default:
                        i3 = 112;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "FOd+/PG|&";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "CGx:\u0019OH";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "TOe+/TI";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        VideoPreviewActivity.h(this.a).d();
        Intent intent = new Intent();
        if (VideoPreviewActivity.n(this.a) - VideoPreviewActivity.c(this.a) < 1000) {
            VideoPreviewActivity.b(this.a, Math.min(VideoPreviewActivity.c(this.a) + 1000, VideoPreviewActivity.i(this.a).c()));
            VideoPreviewActivity.a(this.a, Math.max(0, VideoPreviewActivity.n(this.a) - 1000));
        }
        if (VideoPreviewActivity.c(this.a) - 200 > 0 || VideoPreviewActivity.n(this.a) + 200 < VideoPreviewActivity.i(this.a).c()) {
            intent.putExtra(z[0], VideoPreviewActivity.c(this.a));
            intent.putExtra(z[1], VideoPreviewActivity.n(this.a));
        }
        intent.putExtra(z[2], VideoPreviewActivity.m(this.a).getAbsolutePath());
        intent.putExtra(z[3], a5.a(VideoPreviewActivity.l(this.a).getText().toString()));
        this.a.setResult(-1, intent);
        this.a.finish();
    }

    an_(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }
}
