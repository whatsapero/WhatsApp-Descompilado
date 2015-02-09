package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.Button;

public class CapitalizingButton extends Button {
    private static final boolean IS_GINGERBREAD;
    private static final int[] R_styleable_Button;
    private static final boolean SANS_ICE_CREAM;
    private boolean mAllCaps;

    public CapitalizingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R_styleable_Button);
        this.mAllCaps = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    static {
        boolean z;
        if (VERSION.SDK_INT < 14) {
            z = true;
        } else {
            z = false;
        }
        SANS_ICE_CREAM = z;
        IS_GINGERBREAD = VERSION.SDK_INT >= 9;
        R_styleable_Button = new int[]{16843660};
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextCompat(java.lang.CharSequence r4) {
        /*
        r3_this = this;
        r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r1 = SANS_ICE_CREAM;	 Catch:{ NoSuchFieldError -> 0x001e }
        if (r1 == 0) goto L_0x003f;
    L_0x0006:
        r1 = r3.mAllCaps;	 Catch:{ NoSuchFieldError -> 0x001e }
        if (r1 == 0) goto L_0x003f;
    L_0x000a:
        if (r4 == 0) goto L_0x003f;
    L_0x000c:
        r1 = IS_GINGERBREAD;	 Catch:{ NoSuchFieldError -> 0x0022 }
        if (r1 == 0) goto L_0x0032;
    L_0x0010:
        r1 = r4.toString();	 Catch:{ NoSuchFieldError -> 0x0024 }
        r2 = java.util.Locale.ROOT;	 Catch:{ NoSuchFieldError -> 0x0024 }
        r1 = r1.toUpperCase(r2);	 Catch:{ NoSuchFieldError -> 0x0024 }
        r3.setText(r1);	 Catch:{ NoSuchFieldError -> 0x0024 }
    L_0x001d:
        return;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchFieldError -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchFieldError -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r1 = move-exception;
        r1 = r4.toString();	 Catch:{ NoSuchFieldError -> 0x0045 }
        r1 = r1.toUpperCase();	 Catch:{ NoSuchFieldError -> 0x0045 }
        r3.setText(r1);	 Catch:{ NoSuchFieldError -> 0x0045 }
        if (r0 == 0) goto L_0x001d;
    L_0x0032:
        r1 = r4.toString();	 Catch:{ NoSuchFieldError -> 0x0043 }
        r1 = r1.toUpperCase();	 Catch:{ NoSuchFieldError -> 0x0043 }
        r3.setText(r1);	 Catch:{ NoSuchFieldError -> 0x0043 }
        if (r0 == 0) goto L_0x001d;
    L_0x003f:
        r3.setText(r4);	 Catch:{ NoSuchFieldError -> 0x0043 }
        goto L_0x001d;
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchFieldError -> 0x0043 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.CapitalizingButton.setTextCompat(java.lang.CharSequence):void");
    }
}
