package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class jz extends Button {
    public jz(Context context) {
        this(context, null);
    }

    public jz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    private int b(int i, int i2, int i3) {
        switch (i) {
            case PBE.MD5 /*0*/:
                return i2;
            case ay.f /*1*/:
                return i3;
            default:
                throw new IllegalStateException("Unknown color scheme: " + i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.content.res.Resources r4, int r5, int r6) {
        /*
        r3_this = this;
        r1 = com.google.android.gms.internal.qw.a;
        switch(r5) {
            case 0: goto L_0x0020;
            case 1: goto L_0x0020;
            case 2: goto L_0x002a;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x001e }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x001e }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x001e }
        r2 = "Unknown button size: ";
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x001e }
        r1 = r1.append(r5);	 Catch:{ IllegalStateException -> 0x001e }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x001e }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x001e }
        throw r0;	 Catch:{ IllegalStateException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r0 = com.google.android.gms.e.common_signin_btn_text_dark;
        r2 = com.google.android.gms.e.common_signin_btn_text_light;
        r0 = r3.b(r6, r0, r2);
        if (r1 == 0) goto L_0x0034;
    L_0x002a:
        r0 = com.google.android.gms.e.common_signin_btn_icon_dark;
        r2 = com.google.android.gms.e.common_signin_btn_icon_light;
        r0 = r3.b(r6, r0, r2);
        if (r1 != 0) goto L_0x0005;
    L_0x0034:
        r1 = -1;
        if (r0 != r1) goto L_0x0041;
    L_0x0037:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x003f }
        r1 = "Could not find background resource!";
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x003f }
        throw r0;	 Catch:{ IllegalStateException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;
    L_0x0041:
        r0 = r4.getDrawable(r0);
        r3.setBackgroundDrawable(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jz.b(android.content.res.Resources, int, int):void");
    }

    private void c(Resources resources) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        float f = resources.getDisplayMetrics().density;
        setMinHeight((int) ((f * 48.0f) + 0.5f));
        setMinWidth((int) ((f * 48.0f) + 0.5f));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(android.content.res.Resources r4, int r5, int r6) {
        /*
        r3_this = this;
        r0 = com.google.android.gms.internal.qw.a;
        r1 = com.google.android.gms.b.common_signin_btn_text_dark;
        r2 = com.google.android.gms.b.common_signin_btn_text_light;
        r1 = r3.b(r6, r1, r2);
        r1 = r4.getColorStateList(r1);	 Catch:{ IllegalStateException -> 0x004c }
        r3.setTextColor(r1);	 Catch:{ IllegalStateException -> 0x004c }
        switch(r5) {
            case 0: goto L_0x002f;
            case 1: goto L_0x003a;
            case 2: goto L_0x0045;
            default: goto L_0x0014;
        };
    L_0x0014:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x002d }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x002d }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x002d }
        r2 = "Unknown button size: ";
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x002d }
        r1 = r1.append(r5);	 Catch:{ IllegalStateException -> 0x002d }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x002d }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x002d }
        throw r0;	 Catch:{ IllegalStateException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r1 = com.google.android.gms.c.common_signin_button_text;	 Catch:{ IllegalStateException -> 0x004e }
        r1 = r4.getString(r1);	 Catch:{ IllegalStateException -> 0x004e }
        r3.setText(r1);	 Catch:{ IllegalStateException -> 0x004e }
        if (r0 == 0) goto L_0x004b;
    L_0x003a:
        r1 = com.google.android.gms.c.common_signin_button_text_long;	 Catch:{ IllegalStateException -> 0x0050 }
        r1 = r4.getString(r1);	 Catch:{ IllegalStateException -> 0x0050 }
        r3.setText(r1);	 Catch:{ IllegalStateException -> 0x0050 }
        if (r0 == 0) goto L_0x004b;
    L_0x0045:
        r1 = 0;
        r3.setText(r1);	 Catch:{ IllegalStateException -> 0x002d }
        if (r0 != 0) goto L_0x0014;
    L_0x004b:
        return;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002d }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jz.c(android.content.res.Resources, int, int):void");
    }

    public void a(Resources resources, int i, int i2) {
        boolean z = i >= 0 && i < 3;
        try {
            jx.a(z, "Unknown button size %d", new Object[]{Integer.valueOf(i)});
            z = i2 >= 0 && i2 < 2;
            jx.a(z, "Unknown color scheme %s", new Object[]{Integer.valueOf(i2)});
            c(resources);
            b(resources, i, i2);
            c(resources, i, i2);
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }
}
