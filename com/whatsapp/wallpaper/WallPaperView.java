package com.whatsapp.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class WallPaperView extends ImageView {
    private static final String[] z;
    private boolean a;
    private Rect b;
    private Bitmap c;
    private r d;

    static {
        String[] strArr = new String[4];
        String str = "z,\u001b";
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
                        i3 = 90;
                        break;
                    case ay.f /*1*/:
                        i3 = 80;
                        break;
                    case ay.n /*2*/:
                        i3 = 59;
                        break;
                    case ay.p /*3*/:
                        i3 = 49;
                        break;
                    default:
                        i3 = 108;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "(5_C\r-pXY\r47^UV";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "(5_C\r-j";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "z,\u001b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a() {
        this.a = false;
        setImageDrawable(null);
        if (this.c != null) {
            this.c.recycle();
        }
        this.c = null;
        invalidate();
    }

    public void setOnSizeChangedListener(r rVar) {
        this.d = rVar;
    }

    protected boolean setFrame(int i, int i2, int i3, int i4) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            float max = Math.max(((float) (i3 - i)) / ((float) drawable.getIntrinsicWidth()), ((float) (i4 - i2)) / ((float) drawable.getIntrinsicHeight()));
            imageMatrix.setScale(max, max, 0.0f, 0.0f);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public WallPaperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ScaleType.MATRIX);
    }

    protected void onDraw(Canvas canvas) {
        int i = 1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.b == null) {
            Log.i(z[3] + measuredWidth + z[0] + measuredHeight);
            this.b = new Rect(0, 0, measuredWidth, measuredHeight);
            if (ImageViewTouchBase.e != 0) {
                int i2 = 1;
            }
            super.onDraw(canvas);
            if ((i == 0 || this.a) && measuredHeight > 0 && measuredWidth > 0) {
                if (this.d != null) {
                    this.d.a(measuredWidth, measuredHeight);
                }
                if (this.c != null) {
                    this.a = false;
                }
            }
            return;
        }
        boolean z = false;
        if (this.b.width() == measuredWidth && this.b.height() == measuredHeight) {
            i = i2;
        } else {
            this.b.set(0, 0, measuredWidth, measuredHeight);
            Log.i(z[2] + measuredWidth + z[1] + measuredHeight);
        }
        super.onDraw(canvas);
        if (i == 0) {
        }
        if (this.d != null) {
            this.d.a(measuredWidth, measuredHeight);
        }
        if (this.c != null) {
            this.a = false;
        }
    }

    public void setDrawable(Drawable drawable) {
        this.a = true;
        this.c = ((BitmapDrawable) drawable).getBitmap();
        setImageBitmap(this.c);
        invalidate();
    }
}
