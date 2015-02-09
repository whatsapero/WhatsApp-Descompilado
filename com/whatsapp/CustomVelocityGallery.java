package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Gallery;

public class CustomVelocityGallery extends Gallery {
    private a5u a;

    public CustomVelocityGallery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setVelocityTransformer(a5u com_whatsapp_a5u) {
        this.a = com_whatsapp_a5u;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.a != null) {
            f = this.a.a(f);
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }
}
