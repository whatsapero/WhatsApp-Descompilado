package com.whatsapp.wallpaper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class CropImageView extends ImageViewTouchBase {
    ArrayList n;
    e o;
    float p;
    boolean q;
    int r;
    boolean s;
    float t;

    private void b(e eVar) {
        Rect rect = eVar.m;
        float width = (float) getWidth();
        float max = Math.max(1.0f, Math.min((width / ((float) rect.width())) * 0.6f, (((float) getHeight()) / ((float) rect.height())) * 0.6f) * c());
        if (((double) (Math.abs(max - c()) / max)) > 0.1d) {
            float[] fArr = new float[]{eVar.h.centerX(), eVar.h.centerY()};
            getImageMatrix().mapPoints(fArr);
            a(max, fArr[0], fArr[1], 300.0f, new l(this, eVar));
        }
    }

    public void clearFocus() {
        int i = ImageViewTouchBase.e;
        int i2 = 0;
        while (i2 < this.n.size()) {
            e eVar = (e) this.n.get(i2);
            eVar.a(false);
            eVar.c();
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    protected void b(float f, float f2) {
        int i = ImageViewTouchBase.e;
        super.b(f, f2);
        int i2 = 0;
        while (i2 < this.n.size()) {
            e eVar = (e) this.n.get(i2);
            eVar.d.postTranslate(f, f2);
            eVar.c();
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new ArrayList();
        this.o = null;
        this.s = false;
    }

    public void b() {
        this.n.clear();
        super.b();
    }

    private void a(MotionEvent motionEvent) {
        int i = ImageViewTouchBase.e;
        clearFocus();
        int i2 = 0;
        while (i2 < this.n.size()) {
            e eVar = (e) this.n.get(i2);
            if (eVar.b(motionEvent.getX(), motionEvent.getY()) != 1) {
                if (!eVar.b()) {
                    eVar.a(true);
                    eVar.c();
                    if (i == 0) {
                        break;
                    }
                }
                break;
            }
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        int i = ImageViewTouchBase.e;
        if (!this.s) {
            super.onDraw(canvas);
        }
        int i2 = 0;
        while (i2 < this.n.size()) {
            ((e) this.n.get(i2)).a(canvas);
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    protected void a(float f, float f2, float f3) {
        int i = ImageViewTouchBase.e;
        super.a(f, f2, f3);
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.d.set(getImageMatrix());
            eVar.c();
            if (i != 0) {
                return;
            }
        }
    }

    private void a(e eVar) {
        Rect rect = eVar.m;
        int max = Math.max(0, getLeft() - rect.left);
        int min = Math.min(0, getRight() - rect.right);
        int max2 = Math.max(0, getTop() - rect.top);
        int min2 = Math.min(0, getBottom() - rect.bottom);
        if (max == 0) {
            max = min;
        }
        if (max2 == 0) {
            max2 = min2;
        }
        if (max != 0 || max2 != 0) {
            a((float) max, (float) max2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        r8_this = this;
        r3 = 0;
        r4 = 1;
        r5 = com.whatsapp.wallpaper.ImageViewTouchBase.e;
        r0 = r8.getContext();
        r0 = (com.whatsapp.wallpaper.CropImage) r0;
        r1 = r0.r;
        if (r1 == 0) goto L_0x000f;
    L_0x000e:
        return r3;
    L_0x000f:
        r1 = r9.getAction();
        switch(r1) {
            case 0: goto L_0x001f;
            case 1: goto L_0x0064;
            case 2: goto L_0x0092;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r9.getAction();
        switch(r0) {
            case 1: goto L_0x00c1;
            case 2: goto L_0x00c6;
            case 3: goto L_0x00c1;
            default: goto L_0x001d;
        };
    L_0x001d:
        r3 = r4;
        goto L_0x000e;
    L_0x001f:
        r2 = r3;
    L_0x0020:
        r1 = r8.n;
        r1 = r1.size();
        if (r2 >= r1) goto L_0x0062;
    L_0x0028:
        r1 = r8.n;
        r1 = r1.get(r2);
        r1 = (com.whatsapp.wallpaper.e) r1;
        r6 = r9.getX();
        r7 = r9.getY();
        r6 = r1.b(r6, r7);
        if (r6 == r4) goto L_0x005e;
    L_0x003e:
        r8.r = r6;
        r8.o = r1;
        r1 = r9.getX();
        r8.p = r1;
        r1 = r9.getY();
        r8.t = r1;
        r7 = r8.o;
        r1 = 32;
        if (r6 != r1) goto L_0x00be;
    L_0x0054:
        r1 = com.whatsapp.wallpaper.c.Move;
    L_0x0056:
        r7.a(r1);
        r8.a(r9);
        if (r5 == 0) goto L_0x0062;
    L_0x005e:
        r1 = r2 + 1;
        if (r5 == 0) goto L_0x00d5;
    L_0x0062:
        if (r5 == 0) goto L_0x0016;
    L_0x0064:
        r1 = r8.o;
        if (r1 == 0) goto L_0x008d;
    L_0x0068:
        r1 = r8.o;
        r0.h = r1;
        r0 = r8.o;
        r0 = r0.b();
        if (r0 == 0) goto L_0x0081;
    L_0x0074:
        r0 = r8.o;
        r0.a(r3);
        r0 = r8.o;
        r0.c();
        r8.invalidate();
    L_0x0081:
        r0 = r8.o;
        r8.b(r0);
        r0 = r8.o;
        r1 = com.whatsapp.wallpaper.c.None;
        r0.a(r1);
    L_0x008d:
        r0 = 0;
        r8.o = r0;
        if (r5 == 0) goto L_0x0016;
    L_0x0092:
        r0 = r8.o;
        if (r0 == 0) goto L_0x0016;
    L_0x0096:
        r0 = r8.o;
        r1 = r8.r;
        r2 = r9.getX();
        r3 = r8.p;
        r2 = r2 - r3;
        r3 = r9.getY();
        r6 = r8.t;
        r3 = r3 - r6;
        r0.a(r1, r2, r3);
        r0 = r9.getX();
        r8.p = r0;
        r0 = r9.getY();
        r8.t = r0;
        r0 = r8.o;
        r8.a(r0);
        goto L_0x0016;
    L_0x00be:
        r1 = com.whatsapp.wallpaper.c.Grow;
        goto L_0x0056;
    L_0x00c1:
        r8.a(r4, r4);
        if (r5 == 0) goto L_0x001d;
    L_0x00c6:
        r0 = r8.c();
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 != 0) goto L_0x001d;
    L_0x00d0:
        r8.a(r4, r4);
        goto L_0x001d;
    L_0x00d5:
        r2 = r1;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.CropImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void c(e eVar) {
        this.n.add(eVar);
        invalidate();
    }

    static void a(CropImageView cropImageView, e eVar) {
        cropImageView.a(eVar);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = ImageViewTouchBase.e;
        super.onLayout(z, i, i2, i3, i4);
        if (this.d.c() != null) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                eVar.d.set(getImageMatrix());
                eVar.c();
                if (eVar.f) {
                    b(eVar);
                    continue;
                }
                if (i5 != 0) {
                    return;
                }
            }
        }
    }
}
