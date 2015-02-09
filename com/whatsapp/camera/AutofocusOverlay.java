package com.whatsapp.camera;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.actionbarsherlock.R;

public class AutofocusOverlay extends View {
    private Paint a;
    private Runnable b;
    private Boolean c;
    private RectF d;

    public AutofocusOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint(1);
        this.b = new v(this);
    }

    public AutofocusOverlay(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new v(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
        r4_this = this;
        r0 = com.whatsapp.camera.CameraActivity.l;
        r1 = r4.a;
        r2 = r4.getContext();
        r2 = r2.getResources();
        r3 = 2131361811; // 0x7f0a0013 float:1.8343385E38 double:1.0530326497E-314;
        r2 = r2.getDimension(r3);
        r1.setStrokeWidth(r2);
        r1 = r4.a;
        r2 = android.graphics.Paint.Style.STROKE;
        r1.setStyle(r2);
        r1 = r4.c;
        if (r1 != 0) goto L_0x0029;
    L_0x0021:
        r1 = r4.a;
        r2 = -1;
        r1.setColor(r2);
        if (r0 == 0) goto L_0x0040;
    L_0x0029:
        r1 = r4.c;
        r2 = java.lang.Boolean.TRUE;
        if (r1 != r2) goto L_0x0039;
    L_0x002f:
        r1 = r4.a;
        r2 = -16711936; // 0xffffffffff00ff00 float:-1.7146522E38 double:NaN;
        r1.setColor(r2);
        if (r0 == 0) goto L_0x0040;
    L_0x0039:
        r0 = r4.a;
        r1 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r0.setColor(r1);
    L_0x0040:
        r0 = r4.d;
        r1 = r4.a;
        r5.drawRect(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.AutofocusOverlay.onDraw(android.graphics.Canvas):void");
    }

    public void a(float f, float f2) {
        float dimension = getContext().getResources().getDimension(R.dimen.autofocus_box_size);
        this.d = new RectF(f - (dimension / 2.0f), f2 - (dimension / 2.0f), (dimension / 2.0f) + f, (dimension / 2.0f) + f2);
        this.c = null;
        setVisibility(0);
        invalidate();
        removeCallbacks(this.b);
    }

    public void a(boolean z) {
        this.c = Boolean.valueOf(z);
        invalidate();
        postDelayed(this.b, 1000);
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint(1);
        this.b = new v(this);
    }
}
