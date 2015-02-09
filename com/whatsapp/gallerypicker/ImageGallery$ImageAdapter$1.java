package com.whatsapp.gallerypicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;
import com.actionbarsherlock.R;

class ImageGallery$ImageAdapter$1 extends ImageView {
    final an a;
    private Paint b;
    final aw c;
    private Rect d;

    ImageGallery$ImageAdapter$1(an anVar, Context context, aw awVar) {
        this.a = anVar;
        this.c = awVar;
        super(context);
        this.d = new Rect();
    }

    public void onDraw(Canvas canvas) {
        int i = ImagePreview.y;
        super.onDraw(canvas);
        if (this.c != null && ao.a(this.c)) {
            if (this.b == null) {
                this.b = new Paint();
                this.b.setAntiAlias(true);
                this.b.setColor(-1442840576);
            }
            int height = getHeight();
            int i2 = height / 7;
            int i3 = 0;
            while (i3 < height) {
                canvas.drawRect((float) (i2 / 4), (float) ((i2 / 4) + i3), (float) ((i2 * 3) / 4), (float) (((i2 * 3) / 4) + i3), this.b);
                int i4 = i3 + i2;
                if (i != 0) {
                    break;
                }
                i3 = i4;
            }
        }
        if (isSelected()) {
            if (an.a(this.a) == null) {
                an.a(this.a, getResources().getDrawable(R.drawable.grid_selected));
            }
            an.a(this.a).getPadding(this.d);
            an.a(this.a).setBounds(-this.d.left, -this.d.top, getWidth() + this.d.right, getHeight() + this.d.bottom);
            an.a(this.a).draw(canvas);
        }
    }

    protected void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }
}
