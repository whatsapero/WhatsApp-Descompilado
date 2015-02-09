package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class MinimumHeightImageButton extends ImageButton {
    static int a;
    private static final String z;
    private Context b;

    protected void onMeasure(int i, int i2) {
        float intrinsicHeight = ((float) getDrawable().getIntrinsicHeight()) + am1.a().y;
        int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) + am1.a().y);
        if (intrinsicHeight < ((float) a)) {
            intrinsicHeight = (float) a;
        }
        setMeasuredDimension(intrinsicWidth, (int) intrinsicHeight);
    }

    public MinimumHeightImageButton(Context context, AttributeSet attributeSet) {
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

    static {
        char[] toCharArray = "^Ik_\bB".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 54;
                    break;
                case ay.f /*1*/:
                    i2 = 44;
                    break;
                case ay.n /*2*/:
                    i2 = 2;
                    break;
                case ay.p /*3*/:
                    i2 = 56;
                    break;
                default:
                    i2 = 96;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        a = 0;
    }
}
