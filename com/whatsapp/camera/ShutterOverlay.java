package com.whatsapp.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.actionbarsherlock.R;

public class ShutterOverlay extends View {
    private Paint a;
    private boolean b;

    public void setOn() {
        this.b = true;
        invalidate();
        postDelayed(new a8(this), 50);
    }

    public ShutterOverlay(Context context) {
        super(context);
        this.a = new Paint(1);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint(1);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint(1);
    }

    public void onDraw(Canvas canvas) {
        if (this.b) {
            this.a.setStrokeWidth(getContext().getResources().getDimension(R.dimen.autofocus_stroke_size) * 8.0f);
            this.a.setStyle(Style.STROKE);
            this.a.setColor(-1);
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.a);
        }
    }

    static boolean a(ShutterOverlay shutterOverlay, boolean z) {
        shutterOverlay.b = z;
        return z;
    }
}
