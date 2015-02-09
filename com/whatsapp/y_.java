package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.actionbarsherlock.R;

class y_ extends AsyncTask {
    final VoipActivity a;
    final int b;

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void onPostExecute(Object obj) {
        a((Bitmap) obj);
    }

    y_(VoipActivity voipActivity, int i) {
        this.a = voipActivity;
        this.b = i;
    }

    protected void a(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.a.findViewById(R.id.profile_picture);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            if (App.az == 0) {
                return;
            }
        }
        imageView.setImageResource(R.drawable.ic_pic_contact_xlarge);
    }

    protected Bitmap a(Void[] voidArr) {
        m8 d = App.P.d(VoipActivity.c(this.a));
        return d == null ? null : d.a(this.b, 0.0f, false);
    }
}
