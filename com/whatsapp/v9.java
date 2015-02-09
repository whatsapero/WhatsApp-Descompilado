package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.actionbarsherlock.R;

class v9 extends AsyncTask {
    final CallLogActivity a;

    public Void a(Void[] voidArr) {
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.mid_avatar_size);
        Bitmap a = CallLogActivity.c(this.a).a(dimensionPixelSize, this.a.getResources().getDimension(R.dimen.mid_avatar_radius), false);
        if (a == null) {
            a = CallLogActivity.c(this.a).j();
            if (a != null) {
                a = Bitmap.createScaledBitmap(a, dimensionPixelSize, dimensionPixelSize, true);
            }
        }
        if (!(a == null || isCancelled())) {
            this.a.runOnUiThread(new th(this, a));
        }
        return null;
    }

    v9(CallLogActivity callLogActivity) {
        this.a = callLogActivity;
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
