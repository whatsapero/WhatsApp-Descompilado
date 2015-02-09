package com.whatsapp;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.actionbarsherlock.R;

public class fk {
    private final float a;
    private s7 b;
    private final int c;
    private i2 d;

    private void a(m8 m8Var, ImageView imageView) {
        synchronized (s7.a(this.b)) {
            this.b.a(imageView);
        }
        t6 t6Var = new t6(m8Var, imageView);
        synchronized (s7.a(this.b)) {
            s7.a(this.b).add(0, t6Var);
            s7.a(this.b).notifyAll();
        }
        if (this.d == null) {
            this.d = new i2(this);
            this.d.setPriority(4);
            this.d.start();
        }
    }

    public void a() {
        if (this.d != null) {
            this.d.interrupt();
            this.d = null;
        }
    }

    public fk(int i, float f) {
        this.d = null;
        this.b = new s7(null);
        this.c = i;
        this.a = f;
    }

    static int b(fk fkVar) {
        return fkVar.c;
    }

    public void b(m8 m8Var, ImageView imageView) {
        String c = m8Var.c(this.c, this.a);
        if (c == null) {
            imageView.setImageBitmap(m8Var.j());
            return;
        }
        boolean equals = c.equals(imageView.getTag());
        imageView.setTag(c);
        Bitmap bitmap = (Bitmap) App.R.get(c);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        if (!equals) {
            imageView.setImageBitmap(m8Var.j());
        }
        if (m8Var.B) {
            a(m8Var, imageView);
        }
    }

    static float a(fk fkVar) {
        return fkVar.a;
    }

    static s7 c(fk fkVar) {
        return fkVar.b;
    }

    public fk() {
        this(App.p.getResources().getDimensionPixelSize(R.dimen.small_avatar_size), (float) App.p.getResources().getDimensionPixelSize(R.dimen.small_avatar_radius));
    }
}
