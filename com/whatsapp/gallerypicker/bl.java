package com.whatsapp.gallerypicker;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class bl implements OnTouchListener {
    final ThumbImageView a;
    final ImagePreview b;

    bl(ThumbImageView thumbImageView, ImagePreview imagePreview) {
        this.a = thumbImageView;
        this.b = imagePreview;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case PBE.MD5 /*0*/:
                ImagePreview.a(this.a.A, this.a);
                ImagePreview.a(this.a.A, ThumbImageView.a(this.a));
                ImagePreview.t(this.a.A).setImageDrawable(this.a.getDrawable());
                ImagePreview.t(this.a.A).setMaxWidth(this.a.getWidth());
                ImagePreview.t(this.a.A).setMaxHeight(this.a.getHeight());
                ImagePreview.t(this.a.A).setLayoutParams(new LayoutParams(this.a.getWidth(), this.a.getHeight()));
                ImagePreview.b(this.a.A, motionEvent.getY());
                ImagePreview.a(this.a.A, motionEvent.getX());
                ImagePreview.m(this.a.A).invalidate();
                if (ImagePreview.a(this.a.A) >= 0) {
                    View childAt = ImagePreview.p(this.a.A).getChildAt(ImagePreview.a(this.a.A));
                    if (childAt != ImagePreview.m(this.a.A)) {
                        childAt.setSelected(false);
                    }
                }
                ImagePreview.v(this.a.A).removeCallbacks(ImagePreview.s(this.a.A));
                ImagePreview.v(this.a.A).postDelayed(ImagePreview.s(this.a.A), 100);
                ImagePreview.f(this.a.A).setBackgroundColor(0);
                ImagePreview.k(this.a.A).setTextColor(0);
                ImagePreview.r(this.a.A).setAlpha(0);
                ImagePreview.n(this.a.A).setVisibility(0);
                ImagePreview.g(this.a.A).getLocationOnScreen(ImagePreview.d(this.a.A));
                int i = ImagePreview.d(this.a.A)[0];
                int i2 = ImagePreview.d(this.a.A)[1];
                ImagePreview.m(this.a.A).getLocationOnScreen(ImagePreview.d(this.a.A));
                ImagePreview.g(this.a.A).setPadding(ImagePreview.d(this.a.A)[0] - i, ImagePreview.d(this.a.A)[1] - i2, 0, 0);
                ImagePreview.f(this.a.A).setPadding(0, 0, 0, ImagePreview.n(this.a.A).getHeight() - ImagePreview.l(this.a.A).getHeight());
                ImagePreview.k(this.a.A).getLocationOnScreen(ImagePreview.d(this.a.A));
                break;
            case ay.f /*1*/:
            case ay.p /*3*/:
                ImagePreview.v(this.a.A).removeCallbacks(ImagePreview.s(this.a.A));
                break;
        }
        return false;
    }
}
