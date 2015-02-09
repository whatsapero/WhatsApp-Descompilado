package com.whatsapp;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.TextView.BufferType;

public class CondensedTextView extends TextView {
    private TextPaint a;
    private float b;

    public void setText(CharSequence charSequence, BufferType bufferType) {
        super.setText(charSequence, bufferType);
        a(charSequence.toString());
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            a(getText().toString());
        }
    }

    public CondensedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 0.8f;
    }

    public CondensedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0.8f;
    }

    private void a(String str) {
        int i = App.az;
        if (this.a == null || this.a.getTextSize() != getPaint().getTextSize()) {
            this.a = new TextPaint(getPaint());
            this.a.setTextScaleX(1.0f);
        }
        float measureText = this.a.measureText(str);
        if (measureText > 0.0f) {
            int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            if (measuredWidth > 0) {
                measureText = ((float) measuredWidth) / measureText;
                if (measureText < 1.0f) {
                    float max = Math.max(this.b, measureText);
                    setTextScaleX(max);
                    measureText = getPaint().measureText(str);
                    while (measureText > ((float) measuredWidth) && max > this.b) {
                        max *= 0.99f;
                        setTextScaleX(max);
                        measureText = getPaint().measureText(str);
                        if (i != 0) {
                            break;
                        }
                    }
                    setSingleLine(true);
                    setHorizontallyScrolling(false);
                    if (i == 0) {
                        return;
                    }
                }
                if (getTextScaleX() != 1.0f) {
                    setTextScaleX(1.0f);
                }
            }
        }
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.a.setTextSize(getPaint().getTextSize());
        a(getText().toString());
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        a(getText().toString());
    }

    public CondensedTextView(Context context) {
        super(context);
        this.b = 0.8f;
    }
}
