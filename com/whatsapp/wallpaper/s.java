package com.whatsapp.wallpaper;

import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Debug;
import android.widget.ImageView;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class s extends AsyncTask {
    private static final String[] z;
    Options a;
    final WallpaperPicker b;

    static {
        String[] strArr = new String[6];
        String str = "MI<\\fYR\u0006^";
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
                        i3 = 58;
                        break;
                    case ay.f /*1*/:
                        i3 = 57;
                        break;
                    case ay.n /*2*/:
                        i3 = 99;
                        break;
                    case ay.p /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = 15;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "YV\u000e\u0002xRX\u0017_nJIM[nVU\u0013M\u007f_K";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "MI<\\fYR\u0006^PUV\u000e\u0001a[M\nZj\u001aQ\u0006M\u007f\u001aJ\nVj\u001a";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u001aR!";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "YV\u000e\u0002xRX\u0017_nJIM[nVU\u0013M\u007f_K";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "MI<\\fYR\u0006^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    void a() {
        this.a.requestCancelDecode();
        super.cancel(true);
    }

    protected Bitmap a(Integer[] numArr) {
        try {
            if (isCancelled()) {
                return null;
            }
            try {
                return BitmapFactory.decodeResource(this.b.j.getResourcesForApplication(z[5]), ((Integer) WallpaperPicker.c(this.b).get(numArr[0].intValue())).intValue(), this.a);
            } catch (OutOfMemoryError e) {
                this.a.inSampleSize = 3;
                Log.e(z[0] + e.toString());
                try {
                    return BitmapFactory.decodeResource(this.b.j.getResourcesForApplication(z[2]), ((Integer) WallpaperPicker.c(this.b).get(numArr[0].intValue())).intValue(), this.a);
                } catch (OutOfMemoryError e2) {
                    Log.e(z[3] + (Debug.getNativeHeapAllocatedSize() / 1024) + z[4]);
                    return null;
                } catch (NameNotFoundException e3) {
                    return null;
                }
            } catch (NameNotFoundException e4) {
                Log.e(z[1] + e4.toString());
                return null;
            }
        } catch (OutOfMemoryError e5) {
            throw e5;
        }
    }

    s(WallpaperPicker wallpaperPicker) {
        this.b = wallpaperPicker;
        this.a = new Options();
        this.a.inDither = false;
        this.a.inPreferredConfig = Config.ARGB_8888;
        this.a.inSampleSize = 2;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Integer[]) objArr);
    }

    protected void a(Bitmap bitmap) {
        if (bitmap != null) {
            if (!(isCancelled() || this.a.mCancel)) {
                if (WallpaperPicker.a(this.b) != null) {
                    WallpaperPicker.a(this.b).recycle();
                }
                ImageView d = WallpaperPicker.d(this.b);
                d.setImageBitmap(bitmap);
                WallpaperPicker.a(this.b, bitmap);
                Drawable drawable = d.getDrawable();
                drawable.setFilterBitmap(true);
                drawable.setDither(true);
                d.postInvalidate();
                WallpaperPicker.a(this.b, null);
                if (ImageViewTouchBase.e == 0) {
                    return;
                }
            }
            bitmap.recycle();
        }
    }

    protected void onPostExecute(Object obj) {
        a((Bitmap) obj);
    }
}
