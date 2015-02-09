package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.ImageView.ScaleType;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ab extends AsyncTask {
    private static final String[] z;
    final ThumbImageView a;
    final int b;
    final Uri c;

    static {
        String[] strArr = new String[4];
        String str = "_\u0003I<UF\u001cM-YS\u0019\u0007(UB\u001bZ2";
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
                        i3 = 54;
                        break;
                    case ay.f /*1*/:
                        i3 = 110;
                        break;
                    case ay.n /*2*/:
                        i3 = 40;
                        break;
                    case ay.p /*3*/:
                        i3 = 91;
                        break;
                    default:
                        i3 = 48;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "_\u0003I<UF\u001cM-YS\u0019\u0007(UB\u001bZ2";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "_\u0003I<UF\u001cM-YS\u0019\u0007(UB\u001bZ2";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "_\u0003I<UF\u001cM-YS\u0019\u0007(UB\u001bZ2";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onPostExecute(Object obj) {
        a((Bitmap) obj);
    }

    protected void a(Bitmap bitmap) {
        if (bitmap != null) {
            this.a.setScaleType(ScaleType.CENTER_CROP);
            this.a.setBackgroundResource(0);
            this.a.setImageBitmap(bitmap);
            if (ImagePreview.y == 0) {
                return;
            }
        }
        this.a.setScaleType(ScaleType.CENTER);
        this.a.setBackgroundResource(R.color.gallery_cell);
        this.a.setImageResource(R.drawable.ic_missing_thumbnail_picture);
    }

    ab(ThumbImageView thumbImageView, Uri uri, int i) {
        this.a = thumbImageView;
        this.c = uri;
        this.b = i;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.graphics.Bitmap a(java.lang.Void[] r4) {
        /*
        r3_this = this;
        r0 = r3.c;	 Catch:{ FileNotFoundException -> 0x0014, OutOfMemoryError -> 0x001f, IOException -> 0x0029, bx -> 0x0033 }
        r1 = r3.b;	 Catch:{ FileNotFoundException -> 0x0014, OutOfMemoryError -> 0x001f, IOException -> 0x0029, bx -> 0x0033 }
        r2 = r3.b;	 Catch:{ FileNotFoundException -> 0x0014, OutOfMemoryError -> 0x001f, IOException -> 0x0029, bx -> 0x0033 }
        r0 = com.whatsapp.util.f.a(r0, r1, r2);	 Catch:{ FileNotFoundException -> 0x0014, OutOfMemoryError -> 0x001f, IOException -> 0x0029, bx -> 0x0033 }
        r1 = r3.a;	 Catch:{ FileNotFoundException -> 0x0014, OutOfMemoryError -> 0x001f, IOException -> 0x0029, bx -> 0x0033 }
        r1 = com.whatsapp.gallerypicker.ImagePreview.ThumbImageView.a(r1);	 Catch:{ FileNotFoundException -> 0x0014, OutOfMemoryError -> 0x001f, IOException -> 0x0029, bx -> 0x0033 }
        com.whatsapp.util.f.a(r1, r0);	 Catch:{ FileNotFoundException -> 0x0014, OutOfMemoryError -> 0x001f, IOException -> 0x0029, bx -> 0x0033 }
    L_0x0013:
        return r0;
    L_0x0014:
        r0 = move-exception;
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
    L_0x001d:
        r0 = 0;
        goto L_0x0013;
    L_0x001f:
        r0 = move-exception;
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x001d;
    L_0x0029:
        r0 = move-exception;
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x001d;
    L_0x0033:
        r0 = move-exception;
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ab.a(java.lang.Void[]):android.graphics.Bitmap");
    }
}
