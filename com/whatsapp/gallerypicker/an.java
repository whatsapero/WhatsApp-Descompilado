package com.whatsapp.gallerypicker;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.tonicartos.widget.stickygridheaders.a;

public class an extends BaseAdapter implements a {
    final ImageGallery a;
    private Drawable b;
    int c;

    public int a() {
        return ImageGallery.f(this.a).size();
    }

    public an(ImageGallery imageGallery) {
        this.a = imageGallery;
        this.c = 0;
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public int getCount() {
        return ImageGallery.b(this.a);
    }

    static Drawable a(an anVar) {
        return anVar.b;
    }

    public View a(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view != null) {
            view = (ViewGroup) view;
            textView = (TextView) view.getChildAt(0);
        } else {
            View view2 = (ViewGroup) this.a.getLayoutInflater().inflate(R.layout.media_gallery_section_row, null, true);
            view2.setClickable(false);
            textView = (TextView) view2.findViewById(R.id.media_section);
            view = view2;
        }
        textView.setText(((a5) ImageGallery.f(this.a).get(i)).toString());
        return view;
    }

    static Drawable a(an anVar, Drawable drawable) {
        anVar.b = drawable;
        return drawable;
    }

    public int a(int i) {
        return ((a5) ImageGallery.f(this.a).get(i)).a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
        r5_this = this;
        r0 = r5.a;
        r0 = com.whatsapp.gallerypicker.ImageGallery.k(r0);
        r2 = r0.a(r6);
        if (r7 != 0) goto L_0x006f;
    L_0x000c:
        r0 = r5.c;
        r0 = r0 + 1;
        r5.c = r0;
        r0 = new com.whatsapp.gallerypicker.ImageGallery$ImageAdapter$1;
        r1 = r5.a;
        r0.<init>(r5, r1, r2);
    L_0x0019:
        r0 = (android.widget.ImageView) r0;
        r1 = android.widget.ImageView.ScaleType.CENTER_CROP;
        r0.setScaleType(r1);
        r1 = r5.a;
        r3 = com.whatsapp.gallerypicker.ImageGallery.i(r1);
        r1 = r0.getTag();
        r1 = (com.whatsapp.gallerypicker.y) r1;
        r3.a(r1);
        if (r2 == 0) goto L_0x005c;
    L_0x0031:
        r1 = new com.whatsapp.gallerypicker.w;
        r1.<init>(r5, r0, r2);
        r0.setTag(r1);
        r3 = new com.whatsapp.gallerypicker.bg;
        r3.<init>(r5, r0, r1, r2);
        r4 = r5.a;
        r4 = com.whatsapp.gallerypicker.ImageGallery.i(r4);
        r4.a(r1, r3);
        r1 = r5.a;
        r1 = com.whatsapp.gallerypicker.ImageGallery.a(r1);
        r2 = r2.a();
        r1 = r1.contains(r2);
        r0.setSelected(r1);
        r1 = com.whatsapp.gallerypicker.ImagePreview.y;
        if (r1 == 0) goto L_0x006e;
    L_0x005c:
        r1 = android.widget.ImageView.ScaleType.CENTER;
        r0.setScaleType(r1);
        r1 = r5.a;
        r1 = com.whatsapp.gallerypicker.ImageGallery.e(r1);
        r0.setBackgroundColor(r1);
        r1 = 0;
        r0.setImageDrawable(r1);
    L_0x006e:
        return r0;
    L_0x006f:
        r0 = r7;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.an.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
