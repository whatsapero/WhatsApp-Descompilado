package com.whatsapp.gallerypicker;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import java.util.ArrayList;

class b_ extends BaseAdapter {
    private View a;
    final GalleryPicker b;
    LayoutInflater c;
    ArrayList d;

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public boolean hasStableIds() {
        return true;
    }

    public void b() {
        this.d.clear();
        this.a = null;
    }

    public int getCount() {
        return this.d.size();
    }

    b_(GalleryPicker galleryPicker, LayoutInflater layoutInflater) {
        this.b = galleryPicker;
        this.d = new ArrayList();
        this.c = layoutInflater;
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public void a() {
        notifyDataSetChanged();
    }

    public int getViewTypeCount() {
        return 2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
        r8_this = this;
        r5 = com.whatsapp.gallerypicker.ImagePreview.y;
        r0 = r8.d;
        r0 = r0.get(r9);
        r0 = (com.whatsapp.gallerypicker.at) r0;
        if (r9 != 0) goto L_0x0013;
    L_0x000c:
        r1 = r8.a;
        if (r1 == 0) goto L_0x0013;
    L_0x0010:
        r10 = r8.a;
    L_0x0012:
        return r10;
    L_0x0013:
        if (r10 != 0) goto L_0x0025;
    L_0x0015:
        r1 = r8.c;
        r2 = 2130903146; // 0x7f03006a float:1.7413102E38 double:1.052806039E-314;
        r3 = 0;
        r1 = r1.inflate(r2, r3);
        if (r9 != 0) goto L_0x00b1;
    L_0x0021:
        r8.a = r1;
        if (r5 == 0) goto L_0x00b1;
    L_0x0025:
        r1 = 2131427571; // 0x7f0b00f3 float:1.8476762E38 double:1.0530651394E-314;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 2131427816; // 0x7f0b01e8 float:1.8477259E38 double:1.0530652605E-314;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r3 = 2131427550; // 0x7f0b00de float:1.847672E38 double:1.053065129E-314;
        r3 = r10.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r4 = 2131427729; // 0x7f0b0191 float:1.8477082E38 double:1.0530652175E-314;
        r4 = r10.findViewById(r4);
        r4 = (android.widget.ImageView) r4;
        r6 = r0.f;
        r6 = java.lang.Integer.toString(r6);
        r3.setText(r6);
        r3 = r0.b;
        r6 = 6;
        if (r3 != r6) goto L_0x006c;
    L_0x0057:
        r3 = r0.d;
        r6 = r8.b;
        r6 = r6.getBaseContext();
        r7 = r1.getPaint();
        r3 = com.whatsapp.util.a5.b(r3, r6, r7);
        r1.setText(r3);
        if (r5 == 0) goto L_0x0071;
    L_0x006c:
        r3 = r0.d;
        r1.setText(r3);
    L_0x0071:
        r1 = r0.c();
        r2.setImageResource(r1);
        r1 = r4.getTag();
        r1 = (com.whatsapp.gallerypicker.y) r1;
        if (r1 == 0) goto L_0x008e;
    L_0x0080:
        r2 = r1.b();
        r3 = r0.d();
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0012;
    L_0x008e:
        r2 = r8.b;
        r2 = com.whatsapp.gallerypicker.GalleryPicker.g(r2);
        r2.a(r1);
        r1 = r0.c;
        r2 = new com.whatsapp.gallerypicker.aa;
        r2.<init>(r8, r4, r1, r0);
        r0 = new com.whatsapp.gallerypicker.b7;
        r0.<init>(r8, r4, r2, r1);
        r4.setTag(r2);
        r1 = r8.b;
        r1 = com.whatsapp.gallerypicker.GalleryPicker.g(r1);
        r1.a(r2, r0);
        goto L_0x0012;
    L_0x00b1:
        r10 = r1;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.b_.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public void a(at atVar) {
        this.d.add(atVar);
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
