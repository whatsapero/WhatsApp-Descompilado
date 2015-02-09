package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.whatsapp.util.a5;
import java.util.List;

class a85 extends ArrayAdapter {
    final ListChatInfo a;
    public LayoutInflater b;

    public int getCount() {
        return ListChatInfo.e(this.a).size();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
        r6_this = this;
        r2 = 0;
        r4 = com.whatsapp.App.az;
        if (r8 != 0) goto L_0x0016;
    L_0x0005:
        r0 = r6.getItemViewType(r7);
        if (r0 != 0) goto L_0x0091;
    L_0x000b:
        r0 = 2130903148; // 0x7f03006c float:1.7413106E38 double:1.05280604E-314;
    L_0x000e:
        r1 = r6.b;
        r0 = com.whatsapp.b7.a(r1, r0, r9, r2);
        if (r4 == 0) goto L_0x0098;
    L_0x0016:
        r0 = 2130839096; // 0x7f020638 float:1.7283193E38 double:1.052774394E-314;
        r8.setBackgroundResource(r0);
    L_0x001c:
        r0 = 2130839003; // 0x7f0205db float:1.7283004E38 double:1.052774348E-314;
        r8.setBackgroundResource(r0);
        r0 = 2131427543; // 0x7f0b00d7 float:1.8476705E38 double:1.0530651256E-314;
        r0 = r8.findViewById(r0);
        r0.setVisibility(r2);
        r0 = 2131427637; // 0x7f0b0135 float:1.8476896E38 double:1.053065172E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131427535; // 0x7f0b00cf float:1.847669E38 double:1.0530651216E-314;
        r1 = r8.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 2131427819; // 0x7f0b01eb float:1.8477265E38 double:1.053065262E-314;
        r2 = r8.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        com.whatsapp.am1.b(r1);
        r3 = r6.getItem(r7);
        r3 = (com.whatsapp.m8) r3;
        r8.setTag(r3);
        r5 = r6.getContext();
        r5 = r3.a(r5);
        r0.setText(r5);
        r0 = r6.a;
        r0 = com.whatsapp.ListChatInfo.a(r0);
        r0.b(r3, r2);
        r0 = r3.h();
        if (r0 == 0) goto L_0x008b;
    L_0x006d:
        r0 = r3.t;
        if (r0 == 0) goto L_0x0096;
    L_0x0071:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = "~";
        r0 = r0.append(r2);
        r2 = r3.t;
        r0 = r0.append(r2);
        r0 = r0.toString();
    L_0x0086:
        r6.a(r1, r0);
        if (r4 == 0) goto L_0x0090;
    L_0x008b:
        r0 = r3.b;
        r6.a(r1, r0);
    L_0x0090:
        return r8;
    L_0x0091:
        r0 = 2130903149; // 0x7f03006d float:1.7413108E38 double:1.0528060405E-314;
        goto L_0x000e;
    L_0x0096:
        r0 = 0;
        goto L_0x0086;
    L_0x0098:
        r8 = r0;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a85.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 2;
    }

    public int getItemViewType(int i) {
        return ((m8) getItem(i)).h() ? 1 : 0;
    }

    private void a(TextView textView, String str) {
        textView.setText(a5.b(str, this.a.getBaseContext(), textView.getPaint()));
    }

    public a85(ListChatInfo listChatInfo, Context context, int i, List list) {
        this.a = listChatInfo;
        super(context, i, list);
        this.b = LayoutInflater.from(context);
    }
}
