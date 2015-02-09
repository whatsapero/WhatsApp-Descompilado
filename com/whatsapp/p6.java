package com.whatsapp;

import android.os.AsyncTask;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import java.util.ArrayList;

public class p6 extends AsyncTask {
    private ArrayList a;
    final MediaView b;

    protected Integer a(Void[] voidArr) {
        int i = App.az;
        Integer valueOf = Integer.valueOf(0);
        this.a = App.aJ.a(MediaView.o(this.b), new lg(this));
        Integer num = valueOf;
        int i2 = 0;
        while (i2 < this.a.size()) {
            if (((b) this.a.get(i2)).e.equals(MediaView.f(this.b))) {
                num = Integer.valueOf((this.a.size() - i2) - 1);
                if (i == 0) {
                    break;
                }
            }
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        return num;
    }

    public p6(MediaView mediaView) {
        this.b = mediaView;
    }

    protected void a(Integer num) {
        MediaView.a(this.b, this.a);
        MediaView.f(this.b, num.intValue());
        if (MediaView.u(this.b).size() > 0) {
            MediaView.h(this.b).notifyDataSetChanged();
            MediaView.e(this.b).setCurrentItem(MediaView.j(this.b), false);
            this.b.getSupportActionBar().setDisplayShowTitleEnabled(true);
            this.b.getSupportActionBar().setTitle(this.b.getString(R.string.media_view_x_of_y, new Object[]{Integer.valueOf(MediaView.j(this.b) + 1), Integer.valueOf(MediaView.u(this.b).size())}));
            this.b.invalidateOptionsMenu();
        }
        this.b.setSupportProgressBarIndeterminateVisibility(false);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    public void a() {
        cancel(true);
    }

    protected void onPostExecute(Object obj) {
        a((Integer) obj);
    }
}
