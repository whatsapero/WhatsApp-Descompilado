package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class CircularProgressBar extends ProgressBar {
    private static final String[] z;
    private boolean a;
    private float b;
    private int c;
    private String d;
    private float e;
    private Paint f;
    private int g;
    private RectF h;
    private int i;

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "{q:>h{u&$#%|=*-|";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r6 = r2.length;
        r7 = r6;
        r8 = r1;
        r6 = r2;
    L_0x0012:
        if (r7 > r8) goto L_0x002f;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "\u007fy:)*\u007f";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x002f:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0046;
            case 3: goto L_0x0049;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 69;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 8;
        goto L_0x0038;
    L_0x0043:
        r2 = 16;
        goto L_0x0038;
    L_0x0046:
        r2 = 84;
        goto L_0x0038;
    L_0x0049:
        r2 = 77;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.CircularProgressBar.<clinit>():void");
    }

    private float a(double d) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService(z[1])).getDefaultDisplay().getMetrics(displayMetrics);
        return ((float) d) * displayMetrics.density;
    }

    protected void onDraw(Canvas canvas) {
        if (isIndeterminate()) {
            super.onDraw(canvas);
            if (App.az == 0) {
                return;
            }
        }
        this.f.setAntiAlias(true);
        this.f.setStyle(Style.STROKE);
        this.f.setStrokeWidth(this.b / ((float) this.g));
        this.f.setColor(this.i);
        canvas.drawArc(this.h, ((((float) getProgress()) * 360.0f) / ((float) getMax())) + 270.0f, 360.0f - ((((float) getProgress()) * 360.0f) / ((float) getMax())), false, this.f);
        this.f.setStrokeWidth(this.f.getStrokeWidth());
        this.f.setColor(this.c);
        canvas.drawArc(this.h, -90.0f, (((float) getProgress()) * 360.0f) / ((float) getMax()), false, this.f);
        if (this.a) {
            this.f.setColor(this.i);
            this.f.setStyle(Style.FILL);
            float progress = ((float) getProgress()) * ((float) (6.283185307179586d / ((double) getMax())));
            canvas.drawCircle((float) (((double) this.h.centerX()) + (((double) this.b) * Math.sin((double) progress))), (float) (((double) this.h.centerY()) - (((double) this.b) * Math.cos((double) progress))), 10.0f, this.f);
        }
        if (this.d != null) {
            this.f.setColor(-9408400);
            this.f.setTextSize(this.e);
            this.f.setTextAlign(Align.CENTER);
            this.f.setTypeface(Typeface.create(z[0], 0));
            Rect rect = new Rect();
            this.f.getTextBounds(this.d, 0, this.d.length(), rect);
            this.f.setStyle(Style.FILL);
            canvas.drawText(this.d, 0, this.d.length(), this.h.centerX(), this.h.centerY() + (((float) rect.height()) * 0.5f), this.f);
        }
    }

    public void setKnobEnabled(boolean z) {
        this.a = z;
    }

    public void setCenterText(String str) {
        this.d = str;
        this.e = a(30.0d);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new RectF();
        this.f = new Paint();
        this.c = -13388315;
        this.i = -1711276033;
        this.d = null;
        this.g = 5;
        this.a = false;
    }

    public CircularProgressBar(Context context) {
        super(context);
        this.h = new RectF();
        this.f = new Paint();
        this.c = -13388315;
        this.i = -1711276033;
        this.d = null;
        this.g = 5;
        this.a = false;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        this.b = ((float) Math.min((i - paddingLeft) - paddingRight, (i2 - getPaddingTop()) - getPaddingBottom())) / 2.0f;
        this.b -= 0.3f * this.b;
        this.h.set(((float) (i / 2)) - this.b, ((float) (i2 / 2)) - this.b, ((float) (i / 2)) + this.b, ((float) (i2 / 2)) + this.b);
    }

    public void setProgressBarBackgroundColor(int i) {
        this.i = i;
    }

    public void setProgressBarColor(int i) {
        this.c = i;
    }

    public void setPaintStrokeFactor(int i) {
        this.g = i;
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new RectF();
        this.f = new Paint();
        this.c = -13388315;
        this.i = -1711276033;
        this.d = null;
        this.g = 5;
        this.a = false;
    }
}
