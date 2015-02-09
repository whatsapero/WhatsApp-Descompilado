package com.whatsapp.wallpaper;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class f {
    private Bitmap a;
    private Matrix b;

    public void a(Bitmap bitmap) {
        this.a = bitmap;
    }

    public Matrix d() {
        Matrix matrix = new Matrix();
        if (this.b != null) {
            matrix.preTranslate((float) (-(this.a.getWidth() / 2)), (float) (-(this.a.getHeight() / 2)));
            matrix.postConcat(this.b);
            matrix.postTranslate((float) (e() / 2), (float) (b() / 2));
        }
        return matrix;
    }

    public int e() {
        return a() ? this.a.getHeight() : this.a.getWidth();
    }

    public boolean a() {
        if (this.b == null) {
            return false;
        }
        float[] fArr = new float[]{0.0f, 1.0f};
        this.b.mapVectors(fArr);
        return fArr[0] != 0.0f;
    }

    public f(Bitmap bitmap) {
        this.a = bitmap;
    }

    public void a(Matrix matrix) {
        this.b = matrix;
    }

    public Bitmap c() {
        return this.a;
    }

    public Matrix f() {
        return this.b;
    }

    public int b() {
        return a() ? this.a.getWidth() : this.a.getHeight();
    }
}
