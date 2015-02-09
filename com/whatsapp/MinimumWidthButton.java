package com.whatsapp;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.Button;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class MinimumWidthButton extends Button {
    static int a;
    private static final String z;
    private Context b;

    public MinimumWidthButton(Context context, AttributeSet attributeSet) {
        int i = App.az;
        super(context, attributeSet);
        this.b = context;
        int i2 = 0;
        while (i2 < attributeSet.getAttributeCount()) {
            if (attributeSet.getAttributeName(i2).equals(z)) {
                String attributeValue = attributeSet.getAttributeValue(i2);
                a = (int) (((float) Integer.parseInt(attributeValue.substring(0, attributeValue.indexOf(".")))) * am1.a().g);
                if (i == 0) {
                    return;
                }
            }
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        float f;
        int i3 = 0;
        int i4 = App.az;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(R.dimen.conversation_text_size));
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        float f2 = 0.0f;
        float[] fArr = new float[getText().length()];
        textPaint.getTextWidths(getText(), 0, getText().length(), fArr);
        while (i3 < fArr.length) {
            f2 += fArr[i3];
            i3++;
            if (i4 != 0) {
                break;
            }
        }
        f2 += am1.a().C;
        i3 = a > getSuggestedMinimumWidth() ? a : getSuggestedMinimumWidth();
        i4 = resolveSize(getSuggestedMinimumHeight(), i2);
        if (((float) i3) > f2) {
            f = (float) i3;
        } else {
            f = f2;
        }
        setMeasuredDimension((int) f, i4);
    }

    static {
        char[] toCharArray = "+\r1A6".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 92;
                    break;
                case ay.f /*1*/:
                    i2 = 100;
                    break;
                case ay.n /*2*/:
                    i2 = 85;
                    break;
                case ay.p /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 94;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        a = 0;
    }
}
