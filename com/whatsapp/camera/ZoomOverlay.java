package com.whatsapp.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.actionbarsherlock.R;
import com.whatsapp.DialogToastActivity;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ZoomOverlay extends View {
    private static final String[] z;
    private RectF a;
    private Runnable b;
    private Paint c;
    private TextPaint d;
    private float e;
    private float f;

    static {
        String[] strArr = new String[3];
        String str = "#\u0003#\u0003#";
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
                        i3 = 91;
                        break;
                    case ay.f /*1*/:
                        i3 = 51;
                        break;
                    case ay.n /*2*/:
                        i3 = 19;
                        break;
                    case ay.p /*3*/:
                        i3 = 45;
                        break;
                    default:
                        i3 = 19;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "#\u0003#\u0003#";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "~\u001d\"K";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        int i = CameraActivity.l;
        this.c.setStrokeWidth(getContext().getResources().getDimension(R.dimen.autofocus_stroke_size));
        this.c.setStyle(Style.STROKE);
        this.c.setColor(-1711276033);
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        float min = ((float) Math.min(width, height)) * 0.9f;
        this.a.set(((float) width) - min, ((float) height) - min, ((float) width) + min, ((float) height) + min);
        canvas.drawOval(this.a, this.c);
        float dimension = getResources().getDimension(R.dimen.abs__action_bar_title_text_size);
        this.d.setTextSize(dimension);
        this.d.setColor(-1711276033);
        this.d.setTextAlign(Align.CENTER);
        this.d.setFakeBoldText(true);
        canvas.drawText("x" + String.format(z[1], new Object[]{Float.valueOf(this.e)}), (float) width, (dimension / 2.0f) + ((float) height), this.d);
        dimension = this.d.measureText(z[0]);
        this.a.set(((float) width) - dimension, ((float) height) - dimension, ((float) width) + dimension, ((float) height) + dimension);
        canvas.drawOval(this.a, this.c);
        dimension *= this.f;
        if (dimension <= min) {
            min = dimension;
        }
        this.c.setColor(-13388315);
        this.a.set(((float) width) - min, ((float) height) - min, ((float) width) + min, min + ((float) height));
        canvas.drawOval(this.a, this.c);
        if (i != 0) {
            DialogToastActivity.i = !DialogToastActivity.i;
        }
    }

    public ZoomOverlay(Context context) {
        super(context);
        this.a = new RectF();
        this.c = new Paint(1);
        this.d = new TextPaint(1);
        this.b = new an(this);
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new RectF();
        this.c = new Paint(1);
        this.d = new TextPaint(1);
        this.b = new an(this);
    }

    public float a() {
        return (((float) Math.min(getWidth() / 2, getHeight() / 2)) * 0.9f) / this.d.measureText(z[2]);
    }

    public void a(float f, float f2) {
        this.f = f;
        this.e = f2;
        invalidate();
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new RectF();
        this.c = new Paint(1);
        this.d = new TextPaint(1);
        this.b = new an(this);
    }

    public void b() {
        invalidate();
        postDelayed(this.b, 300);
    }

    public void a(float f) {
        setVisibility(0);
        this.f = f;
        invalidate();
        removeCallbacks(this.b);
    }
}
