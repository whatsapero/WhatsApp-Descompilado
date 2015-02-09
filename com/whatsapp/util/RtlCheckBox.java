package com.whatsapp.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.whatsapp.App;

public class RtlCheckBox extends CheckBox {
    private Drawable a;
    private int b;
    private int c;

    public RtlCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public int getCompoundPaddingRight() {
        if (App.as()) {
            return super.getCompoundPaddingRight();
        }
        int paddingRight = super.getPaddingRight();
        Drawable drawable = this.a;
        return drawable != null ? paddingRight + Math.max(this.c, drawable.getIntrinsicWidth()) : paddingRight;
    }

    public void setButtonDrawable(Drawable drawable) {
        if (App.as()) {
            super.setButtonDrawable(drawable);
            if (Log.e == 0) {
                return;
            }
        }
        this.a = drawable;
        super.setButtonDrawable(new l(this, this.a, 0));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onDraw(android.graphics.Canvas r6) {
        /*
        r5_this = this;
        super.onDraw(r6);
        r0 = com.whatsapp.App.as();
        if (r0 != 0) goto L_0x0030;
    L_0x0009:
        r1 = r5.a;
        if (r1 == 0) goto L_0x0030;
    L_0x000d:
        r0 = r5.getGravity();
        r2 = r0 & 112;
        r3 = r1.getIntrinsicHeight();
        r4 = r1.getIntrinsicWidth();
        r0 = 0;
        switch(r2) {
            case 16: goto L_0x003a;
            case 80: goto L_0x0031;
            default: goto L_0x001f;
        };
    L_0x001f:
        r2 = r0 + r3;
        r3 = r5.getWidth();
        r3 = r3 - r4;
        r4 = r5.getWidth();
        r1.setBounds(r3, r0, r4, r2);
        r1.draw(r6);
    L_0x0030:
        return;
    L_0x0031:
        r0 = r5.getHeight();
        r0 = r0 - r3;
        r2 = com.whatsapp.util.Log.e;
        if (r2 == 0) goto L_0x001f;
    L_0x003a:
        r0 = r5.getHeight();
        r0 = r0 - r3;
        r0 = r0 / 2;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.RtlCheckBox.onDraw(android.graphics.Canvas):void");
    }

    public int getCompoundPaddingLeft() {
        return App.as() ? super.getCompoundPaddingLeft() : super.getPaddingLeft();
    }

    public RtlCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public RtlCheckBox(Context context) {
        this(context, null);
    }

    private void a() {
        if (!App.as()) {
            setBackgroundDrawable(null);
            this.c = getPaddingLeft();
            this.b = getPaddingRight();
            int min = Math.min(this.c, this.b);
            setPadding(min, getPaddingTop(), min, getPaddingBottom());
        }
    }
}
