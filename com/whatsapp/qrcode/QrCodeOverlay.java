package com.whatsapp.qrcode;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.actionbarsherlock.R;
import com.whatsapp.DialogToastActivity;

public class QrCodeOverlay extends View {
    private h a;
    private Paint b;
    float c;
    float d;

    public QrCodeOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Paint(1);
        this.c = 0.0f;
        this.d = 0.01f;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    protected void onVisibilityChanged(View view, int i) {
        if (getVisibility() == 0) {
            if (getAnimation() == null && this.a != null) {
                startAnimation(this.a);
                if (!QrCodeActivity.t) {
                    return;
                }
            }
            return;
        }
        clearAnimation();
    }

    public void onDraw(Canvas canvas) {
        boolean z = QrCodeActivity.t;
        int width = getWidth();
        int height = getHeight();
        int min = (Math.min(width, height) * 3) / 4;
        int i = (width - min) / 2;
        int i2 = (height - min) / 2;
        int i3 = i + min;
        int i4 = i2 + min;
        this.b.setARGB(125, 50, 50, 50);
        this.b.setStyle(Style.FILL);
        canvas.drawRect(0.0f, 0.0f, (float) width, (float) i2, this.b);
        canvas.drawRect(0.0f, (float) i2, (float) i, (float) i4, this.b);
        canvas.drawRect((float) i3, (float) i2, (float) width, (float) i4, this.b);
        canvas.drawRect(0.0f, (float) i4, (float) width, (float) height, this.b);
        float dimension = getContext().getResources().getDimension(R.dimen.autofocus_stroke_size);
        this.b.setStrokeWidth(dimension);
        this.b.setStyle(Style.STROKE);
        this.b.setColor(872415231);
        canvas.drawRect((float) i, (float) i2, (float) i3, (float) i4, this.b);
        canvas.drawLine((float) ((i + i3) / 2), (float) (i2 - (min / 12)), (float) ((i + i3) / 2), (float) ((min / 12) + i2), this.b);
        canvas.drawLine((float) ((i + i3) / 2), (float) (i4 - (min / 12)), (float) ((i + i3) / 2), (float) ((min / 12) + i4), this.b);
        canvas.drawLine((float) (i - (min / 12)), (float) ((i2 + i4) / 2), (float) ((min / 12) + i), (float) ((i2 + i4) / 2), this.b);
        canvas.drawLine((float) (i3 - (min / 12)), (float) ((i2 + i4) / 2), (float) ((min / 12) + i3), (float) ((i2 + i4) / 2), this.b);
        this.b.setStyle(Style.STROKE);
        this.b.setColor(-2147418368);
        this.b.setStrokeWidth(2.0f * dimension);
        int i5 = (int) (((float) i2) + (2.0f * dimension));
        int i6 = (int) (((float) i4) - (2.0f * dimension));
        if (this.c > 1.0f || this.c < 0.0f) {
            this.d = -this.d;
        }
        this.c += this.d;
        canvas.drawLine((float) i, ((float) i5) + (((float) (i6 - i5)) * this.c), (float) i3, ((float) i5) + (((float) (i6 - i5)) * this.c), this.b);
        if (z) {
            DialogToastActivity.i = !DialogToastActivity.i;
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a = new h(this, null);
        this.a.setDuration(2000);
        this.a.setRepeatCount(-1);
        this.a.setRepeatMode(2);
        startAnimation(this.a);
    }

    public QrCodeOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Paint(1);
        this.c = 0.0f;
        this.d = 0.01f;
    }

    public QrCodeOverlay(Context context) {
        super(context);
        this.b = new Paint(1);
        this.c = 0.0f;
        this.d = 0.01f;
    }
}
