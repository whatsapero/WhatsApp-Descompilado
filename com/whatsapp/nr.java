package com.whatsapp;

import android.content.Context;
import android.widget.BaseAdapter;

public class nr extends BaseAdapter {
    final LocationPicker2 a;

    public Object getItem(int i) {
        return (LocationPicker2.s(this.a) == null || i >= LocationPicker2.s(this.a).size()) ? null : LocationPicker2.s(this.a).get(i);
    }

    public int getCount() {
        return LocationPicker2.s(this.a) == null ? 0 : LocationPicker2.s(this.a).size();
    }

    public long getItemId(int i) {
        return 0;
    }

    public nr(LocationPicker2 locationPicker2, Context context) {
        this.a = locationPicker2;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
        r9_this = this;
        r8 = 0;
        r7 = 0;
        r4 = com.whatsapp.App.az;
        if (r11 != 0) goto L_0x0015;
    L_0x0006:
        r0 = r9.a;
        r0 = r0.getLayoutInflater();
        r1 = 2130903162; // 0x7f03007a float:1.7413134E38 double:1.052806047E-314;
        r0 = com.whatsapp.b7.a(r0, r1, r8);
        if (r4 == 0) goto L_0x009f;
    L_0x0015:
        r0 = 2131427881; // 0x7f0b0229 float:1.847739E38 double:1.0530652926E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131427882; // 0x7f0b022a float:1.8477393E38 double:1.053065293E-314;
        r1 = r11.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 2131427880; // 0x7f0b0228 float:1.8477389E38 double:1.053065292E-314;
        r2 = r11.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r3 = r9.a;
        r3 = com.whatsapp.LocationPicker2.s(r3);
        r3 = r3.get(r10);
        r3 = (com.whatsapp.PlaceInfo) r3;
        r5 = r3.name;
        r0.setText(r5);
        r5 = r3.vicinity;
        r5 = android.text.TextUtils.isEmpty(r5);
        if (r5 != 0) goto L_0x0057;
    L_0x0049:
        r1.setVisibility(r7);
        r5 = r3.vicinity;
        r1.setText(r5);
        r5 = 1;
        r1.setSingleLine(r5);
        if (r4 == 0) goto L_0x005c;
    L_0x0057:
        r5 = 8;
        r1.setVisibility(r5);
    L_0x005c:
        r1 = r9.a;
        r1 = com.whatsapp.LocationPicker2.i(r1);
        if (r3 != r1) goto L_0x007a;
    L_0x0064:
        r1 = new android.graphics.drawable.BitmapDrawable;
        r5 = r9.a;
        r5 = r5.getResources();
        r6 = r9.a;
        r6 = com.whatsapp.LocationPicker2.z(r6);
        r1.<init>(r5, r6);
        r0.setCompoundDrawablesWithIntrinsicBounds(r8, r8, r1, r8);
        if (r4 == 0) goto L_0x007d;
    L_0x007a:
        r0.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r7, r7);
    L_0x007d:
        r0 = r3.icon;
        if (r0 == 0) goto L_0x009b;
    L_0x0081:
        r0 = new java.io.File;
        r1 = r3.icon;
        r0.<init>(r1);
        r0 = r0.getName();
        r1 = r9.a;
        r1 = com.whatsapp.LocationPicker2.h(r1);
        r3 = r3.icon;
        r5 = r9.a;
        r1.a(r3, r0, r5, r2);
        if (r4 == 0) goto L_0x009e;
    L_0x009b:
        r2.setImageDrawable(r8);
    L_0x009e:
        return r11;
    L_0x009f:
        r11 = r0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.nr.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
