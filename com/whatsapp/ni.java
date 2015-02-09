package com.whatsapp;

import com.actionbarsherlock.R;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class ni extends GregorianCalendar {
    private int a;
    final MediaGallery b;

    public String toString() {
        switch (this.a) {
            case ay.f /*1*/:
                return this.b.getString(R.string.recent);
            case ay.n /*2*/:
                return this.b.getString(R.string.week);
            case ay.p /*3*/:
                return this.b.getString(R.string.month);
            case aj.i /*4*/:
                return MediaGallery.e().format(getTime());
            default:
                return Integer.toString(get(1));
        }
    }

    public ni(MediaGallery mediaGallery, int i, Calendar calendar) {
        this.b = mediaGallery;
        this.a = i;
        setTime(calendar.getTime());
    }
}
