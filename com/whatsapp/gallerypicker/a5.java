package com.whatsapp.gallerypicker;

import com.actionbarsherlock.R;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class a5 extends GregorianCalendar {
    int a;
    private int b;
    final ImageGallery c;

    public a5(ImageGallery imageGallery, int i, Calendar calendar) {
        this.c = imageGallery;
        this.b = i;
        setTime(calendar.getTime());
    }

    public String toString() {
        switch (this.b) {
            case ay.f /*1*/:
                return this.c.getString(R.string.recent);
            case ay.n /*2*/:
                return this.c.getString(R.string.week);
            case ay.p /*3*/:
                return this.c.getString(R.string.month);
            case aj.i /*4*/:
                return ImageGallery.b().format(getTime());
            default:
                return Integer.toString(get(1));
        }
    }
}
