package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.g.a;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.jy;
import com.google.android.gms.internal.jz;

public final class SignInButton extends FrameLayout implements OnClickListener {
    private View Jk;
    private OnClickListener Jl;
    private int mColor;
    private int mSize;

    public SignInButton(Context context) {
        this(context, null);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Jl = null;
        setStyle(0, 0);
    }

    private void G(Context context) {
        try {
            if (this.Jk != null) {
                removeView(this.Jk);
            }
            try {
                this.Jk = jy.b(context, this.mSize, this.mColor);
            } catch (a e) {
                Log.w("SignInButton", "Sign in button not found, using placeholder instead");
                this.Jk = a(context, this.mSize, this.mColor);
            }
            addView(this.Jk);
            this.Jk.setEnabled(isEnabled());
            this.Jk.setOnClickListener(this);
        } catch (a e2) {
            throw e2;
        }
    }

    private static Button a(Context context, int i, int i2) {
        Button jzVar = new jz(context);
        jzVar.a(context.getResources(), i, i2);
        return jzVar;
    }

    public void onClick(View view) {
        if (this.Jl != null && view == this.Jk) {
            this.Jl.onClick(this);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.Jk.setEnabled(z);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.Jl = onClickListener;
        if (this.Jk != null) {
            this.Jk.setOnClickListener(this);
        }
    }

    public void setStyle(int i, int i2) {
        int i3 = GooglePlayServicesUtil.a;
        boolean z = i >= 0 && i < 3;
        jx.a(z, "Unknown button size %d", new Object[]{Integer.valueOf(i)});
        z = i2 >= 0 && i2 < 2;
        jx.a(z, "Unknown color scheme %s", new Object[]{Integer.valueOf(i2)});
        this.mSize = i;
        this.mColor = i2;
        G(getContext());
        if (i3 != 0) {
            jx.a++;
        }
    }
}
