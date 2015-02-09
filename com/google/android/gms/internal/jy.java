package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.g;
import com.google.android.gms.dynamic.g.a;

public final class jy extends g {
    private static final jy Nt;

    static {
        Nt = new jy();
    }

    private jy() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View b(Context context, int i, int i2) {
        return Nt.c(context, i, i2);
    }

    private View c(Context context, int i, int i2) {
        try {
            return (View) e.f(((ju) L(context)).a(e.k(context), i, i2));
        } catch (Throwable e) {
            throw new a("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    public ju S(IBinder iBinder) {
        return ju.a.R(iBinder);
    }

    public Object d(IBinder iBinder) {
        return S(iBinder);
    }
}
