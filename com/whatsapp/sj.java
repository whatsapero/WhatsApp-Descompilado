package com.whatsapp;

import android.content.Context;
import android.widget.BaseAdapter;

public class sj extends BaseAdapter {
    final LocationPicker a;

    public int getCount() {
        return LocationPicker.p(this.a) == null ? 0 : LocationPicker.p(this.a).size();
    }

    public sj(LocationPicker locationPicker, Context context) {
        this.a = locationPicker;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
        r8_this = this;
        r7 = 0;
        r4 = com.whatsapp.App.az;
        if (r10 != 0) goto L_0x0013;
    L_0x0005:
        r0 = r8.a;
        r0 = r0.getLayoutInflater();
        r1 = 2130903162; // 0x7f03007a float:1.7413134E38 double:1.052806047E-314;
        r2 = 0;
        r10 = com.whatsapp.b7.a(r0, r1, r2);
    L_0x0013:
        r0 = 2131427881; // 0x7f0b0229 float:1.847739E38 double:1.0530652926E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131427882; // 0x7f0b022a float:1.8477393E38 double:1.053065293E-314;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 2131427880; // 0x7f0b0228 float:1.8477389E38 double:1.053065292E-314;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r3 = r8.a;
        r3 = com.whatsapp.LocationPicker.p(r3);
        r3 = r3.get(r9);
        r3 = (com.whatsapp.PlaceInfo) r3;
        r5 = r3.name;
        r0.setText(r5);
        r5 = r3.vicinity;
        if (r5 == 0) goto L_0x005b;
    L_0x0043:
        r5 = "";
        r6 = r3.vicinity;
        r5 = r5.equals(r6);
        if (r5 != 0) goto L_0x005b;
    L_0x004d:
        r1.setVisibility(r7);
        r5 = r3.vicinity;
        r1.setText(r5);
        r5 = 1;
        r1.setSingleLine(r5);
        if (r4 == 0) goto L_0x0060;
    L_0x005b:
        r5 = 8;
        r1.setVisibility(r5);
    L_0x0060:
        r1 = r8.a;
        r1 = com.whatsapp.LocationPicker.d(r1);
        if (r3 != r1) goto L_0x0070;
    L_0x0068:
        r1 = 2130838934; // 0x7f020596 float:1.7282864E38 double:1.052774314E-314;
        r0.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r1, r7);
        if (r4 == 0) goto L_0x0073;
    L_0x0070:
        r0.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r7, r7);
    L_0x0073:
        r0 = r3.icon;
        if (r0 == 0) goto L_0x0091;
    L_0x0077:
        r0 = new java.io.File;
        r1 = r3.icon;
        r0.<init>(r1);
        r0 = r0.getName();
        r1 = r8.a;
        r1 = com.whatsapp.LocationPicker.j(r1);
        r3 = r3.icon;
        r5 = r8.a;
        r1.a(r3, r0, r5, r2);
        if (r4 == 0) goto L_0x0094;
    L_0x0091:
        r2.setImageResource(r7);
    L_0x0094:
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.sj.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public Object getItem(int i) {
        return (LocationPicker.p(this.a) == null || i >= LocationPicker.p(this.a).size()) ? null : LocationPicker.p(this.a).get(i);
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public long getItemId(int i) {
        return 0;
    }
}
