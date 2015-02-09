package com.google;

public final class bw {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    public static bw a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return b(f, f2, f3, f4, f5, f6, f7, f8).a();
    }

    public static bw b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new bw(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f10 * f11) - (f9 * f13)) / f15;
        return new bw((f3 - f) + (f16 * f3), (f7 - f) + (f17 * f7), f, (f16 * f4) + (f4 - f2), (f17 * f8) + (f8 - f2), f2, f16, f17, 1.0f);
    }

    public static bw a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return b(f9, f10, f11, f12, f13, f14, f15, f16).a(a(f, f2, f3, f4, f5, f6, f7, f8));
    }

    bw a() {
        boolean z = da.b;
        bw bwVar = new bw((this.e * this.f) - (this.a * this.g), (this.a * this.d) - (this.b * this.f), (this.b * this.g) - (this.e * this.d), (this.c * this.g) - (this.h * this.f), (this.i * this.f) - (this.c * this.d), (this.h * this.d) - (this.i * this.g), (this.h * this.a) - (this.c * this.e), (this.c * this.b) - (this.i * this.a), (this.i * this.e) - (this.h * this.b));
        if (gC.a) {
            da.b = !z;
        }
        return bwVar;
    }

    public void a(float[] fArr) {
        boolean z = da.b;
        int length = fArr.length;
        float f = this.i;
        float f2 = this.h;
        float f3 = this.c;
        float f4 = this.b;
        float f5 = this.e;
        float f6 = this.a;
        float f7 = this.d;
        float f8 = this.g;
        float f9 = this.f;
        int i = 0;
        while (i < length) {
            float f10 = fArr[i];
            float f11 = fArr[i + 1];
            float f12 = ((f3 * f10) + (f6 * f11)) + f9;
            fArr[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr[i + 1] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
            i += 2;
            if (z) {
                return;
            }
        }
    }

    private bw(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.i = f;
        this.h = f4;
        this.c = f7;
        this.b = f2;
        this.e = f5;
        this.a = f8;
        this.d = f3;
        this.g = f6;
        this.f = f9;
    }

    bw a(bw bwVar) {
        boolean z = da.b;
        bw bwVar2 = new bw(((this.i * bwVar.i) + (this.b * bwVar.h)) + (this.d * bwVar.c), ((this.i * bwVar.b) + (this.b * bwVar.e)) + (this.d * bwVar.a), ((this.i * bwVar.d) + (this.b * bwVar.g)) + (this.d * bwVar.f), ((this.h * bwVar.i) + (this.e * bwVar.h)) + (this.g * bwVar.c), ((this.h * bwVar.b) + (this.e * bwVar.e)) + (this.g * bwVar.a), ((this.h * bwVar.d) + (this.e * bwVar.g)) + (this.g * bwVar.f), ((this.c * bwVar.i) + (this.a * bwVar.h)) + (this.f * bwVar.c), ((this.c * bwVar.b) + (this.a * bwVar.e)) + (this.f * bwVar.a), ((this.c * bwVar.d) + (this.a * bwVar.g)) + (this.f * bwVar.f));
        if (z) {
            gC.a = !gC.a;
        }
        return bwVar2;
    }
}
