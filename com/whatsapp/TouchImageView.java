package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.actionbarsherlock.R;
import com.whatsapp.wallpaper.ImageViewTouchBase;

public class TouchImageView extends ImageViewTouchBase {
    private static float A;
    public static int s;
    public static float u;
    public static Paint y;
    boolean B;
    boolean n;
    int o;
    private Handler p;
    boolean q;
    boolean r;
    am1 t;
    private long v;
    protected boolean w;
    public float x;
    boolean z;

    public void setImageBitmap(Bitmap bitmap) {
        this.n = false;
        super.setImageBitmap(bitmap);
    }

    public void a(float f, float f2, float f3) {
        super.a(f, f2, f3);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.d.c() == null) {
        }
    }

    public void b(float f, float f2) {
        super.b(f, f2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    static long a(TouchImageView touchImageView) {
        return touchImageView.v;
    }

    public TouchImageView(Context context) {
        super(context);
        this.n = false;
        this.o = 0;
        this.r = true;
        this.B = false;
        this.q = false;
        this.z = true;
        this.p = new a_m(this);
        this.x = 1.0f;
        this.t = am1.a();
        setRecycler(new avy(this));
    }

    static {
        A = 3.0f;
        s = 0;
        u = -1.0f;
        y = new Paint();
        y.setColor(-16777216);
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = false;
        this.o = 0;
        this.r = true;
        this.B = false;
        this.q = false;
        this.z = true;
        this.p = new a_m(this);
        this.x = 1.0f;
        this.t = am1.a();
        setRecycler(new ft(this));
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.B) {
            Paint paint = new Paint();
            paint.setDither(true);
            Bitmap bitmap = ((BitmapDrawable) getResources().getDrawable(R.drawable.mviewer_videoplay)).getBitmap();
            Matrix matrix = new Matrix(getImageMatrix());
            if (this.d.c() != null) {
                float[] fArr = new float[]{(float) (this.d.e() / 2), (float) (this.d.b() / 2)};
                matrix.mapPoints(fArr);
                canvas.drawBitmap(bitmap, (((float) getPaddingLeft()) + fArr[0]) - ((float) (bitmap.getWidth() / 2)), (float) ((getHeight() / 2) - (bitmap.getHeight() / 2)), paint);
            }
        }
        if (this.w && !this.n) {
            Rect rect = new Rect(getWidth() - this.t.w, 0, getWidth(), getHeight());
            Rect rect2 = new Rect(getWidth() - this.t.w, 0, getWidth(), getHeight());
            canvas.drawRect(rect, y);
            canvas.drawRect(rect2, y);
        }
    }
}
