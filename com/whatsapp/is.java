package com.whatsapp;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class is extends PagerAdapter {
    private static final String z;
    private b a;
    final MediaView b;

    static {
        char[] toCharArray = "ho\";0sc#%~ld5&0k~/3%`C27<*".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 5;
                    break;
                case ay.f /*1*/:
                    i2 = 10;
                    break;
                case ay.n /*2*/:
                    i2 = 70;
                    break;
                case ay.p /*3*/:
                    i2 = 82;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public int getCount() {
        return MediaView.u(this.b).size();
    }

    public Parcelable saveState() {
        return null;
    }

    public is(MediaView mediaView, b bVar) {
        this.b = mediaView;
        this.a = bVar;
    }

    public void finishUpdate(View view) {
        if (this.a != null) {
            MediaView.a(this.b, this.a, 0);
            this.a = null;
        }
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void startUpdate(View view) {
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public CharSequence getPageTitle(int i) {
        return "";
    }

    public int getItemPosition(Object obj) {
        int i = App.az;
        m mVar = (m) ((View) obj).getTag();
        if (mVar == null) {
            return -2;
        }
        int i2 = -1;
        int i3 = 0;
        while (i3 < MediaView.u(this.b).size()) {
            if (mVar.equals(((b) MediaView.u(this.b).get(i3)).e)) {
                if (i == 0) {
                    i2 = i3;
                    break;
                }
                i2 = i3;
            }
            int i4 = i3 + 1;
            if (i != 0) {
                break;
            }
            i3 = i4;
        }
        return i2 < 0 ? -2 : (MediaView.u(this.b).size() - 1) - i2;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        b i2 = MediaView.i(this.b, i);
        Log.i(z + i2.e.a);
        View c = MediaView.c(this.b, i2);
        c.setTag(i2.e);
        viewGroup.addView(c, 0);
        return c;
    }
}
