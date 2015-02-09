package com.whatsapp.util.undobar;

import android.app.Activity;
import android.os.Parcelable;
import com.whatsapp.DialogToastActivity;

public class d {
    private Parcelable a;
    private c b;
    private CharSequence c;
    private long d;
    private final Activity e;
    private int f;
    private a g;

    public d a(int i) {
        this.c = this.e.getText(i);
        return this;
    }

    public d a(a aVar) {
        this.g = aVar;
        return this;
    }

    public UndoBarController a(boolean z) {
        boolean z2 = false;
        int i = UndoBarController.f;
        if (this.g == null && this.b == null) {
            this.b = UndoBarController.q;
        }
        if (this.b == null) {
            this.b = UndoBarController.j;
        }
        if (this.c == null) {
            this.c = "";
        }
        if (this.d > 0) {
            this.b.d = this.d;
        }
        UndoBarController a = UndoBarController.a(this.e, this.c, this.g, this.a, !z, this.b, this.f);
        if (i != 0) {
            if (!DialogToastActivity.i) {
                z2 = true;
            }
            DialogToastActivity.i = z2;
        }
        return a;
    }

    public d a(Parcelable parcelable) {
        this.a = parcelable;
        return this;
    }

    public d(Activity activity) {
        this.f = -1;
        this.e = activity;
    }

    public UndoBarController a() {
        return a(true);
    }
}
