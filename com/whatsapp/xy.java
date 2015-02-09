package com.whatsapp;

import android.content.Context;
import android.widget.BaseAdapter;

class xy extends BaseAdapter {
    private int a;
    final c_ b;
    private Context c;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
        r8_this = this;
        r7 = 0;
        r1 = 0;
        r3 = com.whatsapp.App.az;
        if (r10 == 0) goto L_0x0015;
    L_0x0006:
        r0 = r10;
        r0 = (android.widget.LinearLayout) r0;
        r0 = r0.getChildCount();
        r2 = r8.b;
        r2 = com.whatsapp.c_.i(r2);
        if (r0 == r2) goto L_0x00a9;
    L_0x0015:
        r10 = new com.whatsapp.EmojiPicker$EmojiAdapter$1;
        r0 = r8.b;
        r0 = com.whatsapp.c_.b(r0);
        r10.<init>(r8, r0);
        r0 = r1;
    L_0x0021:
        r2 = r8.b;
        r2 = com.whatsapp.c_.i(r2);
        if (r0 >= r2) goto L_0x004d;
    L_0x0029:
        r2 = new com.whatsapp.EmojiPicker$EmojiImageView;
        r4 = r8.b;
        r5 = r8.c;
        r2.<init>(r4, r5);
        r4 = new android.widget.LinearLayout$LayoutParams;
        r5 = r8.b;
        r5 = com.whatsapp.c_.d(r5);
        r6 = r8.b;
        r6 = com.whatsapp.c_.j(r6);
        r4.<init>(r5, r6);
        r2.setLayoutParams(r4);
        r10.addView(r2);
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0021;
    L_0x004d:
        r2 = r1;
    L_0x004e:
        r0 = r8.b;
        r0 = com.whatsapp.c_.i(r0);
        if (r2 >= r0) goto L_0x00a5;
    L_0x0056:
        r0 = r10.getChildAt(r2);
        r0 = (com.whatsapp.EmojiPicker$EmojiImageView) r0;
        r4 = r8.b;
        r4 = com.whatsapp.c_.i(r4);
        r4 = r4 * r9;
        r4 = r4 + r2;
        r5 = com.whatsapp.c_.c();
        r6 = r8.a;
        r5 = r5[r6];
        r5 = r5.a();
        if (r4 >= r5) goto L_0x0098;
    L_0x0072:
        r5 = com.whatsapp.c_.c();
        r6 = r8.a;
        r5 = r5[r6];
        r4 = r5.a(r4);
        r0.setEmojiCode(r4);
        r4 = new com.whatsapp.j1;
        r4.<init>(r7);
        r0.setBackgroundDrawable(r4);
        r4 = 1;
        r0.setClickable(r4);
        r4 = r8.b;
        r4 = com.whatsapp.c_.h(r4);
        r0.setOnClickListener(r4);
        if (r3 == 0) goto L_0x00a1;
    L_0x0098:
        r0.setEmojiCode(r1);
        r0.setBackgroundDrawable(r7);
        r0.setClickable(r1);
    L_0x00a1:
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x00ac;
    L_0x00a5:
        r10.setClickable(r1);
        return r10;
    L_0x00a9:
        r10 = (android.widget.LinearLayout) r10;
        goto L_0x004d;
    L_0x00ac:
        r2 = r0;
        goto L_0x004e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xy.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public long getItemId(int i) {
        return 0;
    }

    public Object getItem(int i) {
        return null;
    }

    public int getCount() {
        return c_.i(this.b) == 0 ? 0 : ((c_.c()[this.a].a() + c_.i(this.b)) - 1) / c_.i(this.b);
    }

    public xy(c_ c_Var, Context context, int i) {
        this.b = c_Var;
        this.c = context;
        this.a = i;
    }
}
