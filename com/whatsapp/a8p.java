package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;

class a8p implements OnClickListener {
    final MediaGallery a;

    public void onClick(View view) {
        b bVar = (b) view.getTag(R.id.message);
        if (MediaGallery.e(this.a) != null) {
            MediaGallery.a(this.a, bVar, view);
            if (MediaGallery.n(this.a).isEmpty()) {
                MediaGallery.e(this.a).finish();
                if (App.az == 0) {
                    return;
                }
            }
            return;
        }
        this.a.startActivity(MediaView.a(bVar, MediaGallery.j(this.a), this.a, view));
        if (bVar.j == 1 && MediaView.f()) {
            this.a.overridePendingTransition(0, 0);
        }
    }

    a8p(MediaGallery mediaGallery) {
        this.a = mediaGallery;
    }
}
