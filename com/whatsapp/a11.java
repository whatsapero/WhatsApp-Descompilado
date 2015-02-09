package com.whatsapp;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.actionbarsherlock.R;

public class a11 extends PopupWindow {
    private c_ a;
    private OnDismissListener b;
    private boolean c;
    private boolean d;
    private ViewGroup e;
    private View f;
    private tf g;
    private Activity h;

    public void a(Configuration configuration) {
    }

    public void a(OnDismissListener onDismissListener) {
        this.b = onDismissListener;
        setOnDismissListener(onDismissListener);
    }

    static View a(a11 com_whatsapp_a11) {
        return com_whatsapp_a11.f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r14) {
        /*
        r13_this = this;
        r12 = -1;
        r9 = 1139802112; // 0x43f00000 float:480.0 double:5.631370666E-315;
        r3 = 1;
        r4 = 0;
        r5 = com.whatsapp.App.az;
        r13.f = r14;
        r6 = com.whatsapp.am1.a();
        r0 = -1056964608; // 0xffffffffc1000000 float:-8.0 double:NaN;
        r1 = r6.g;
        r0 = r0 * r1;
        r1 = (int) r0;
        r0 = r14.getHeight();
        r2 = 2;
        r7 = new int[r2];
        r14.getLocationOnScreen(r7);
        r2 = r7[r3];
        r0 = r0 + r2;
        r0 = r0 + r1;
        r2 = r13.h;
        r2 = r2.getWindowManager();
        r8 = r2.getDefaultDisplay();
        r2 = r8.getHeight();
        r2 = r2 * 2;
        r2 = r2 / 3;
        if (r0 <= r2) goto L_0x003f;
    L_0x0035:
        r0 = r7[r3];
        r2 = r1 * 2;
        r0 = r0 + r2;
        r13.setHeight(r0);
        if (r5 == 0) goto L_0x0043;
    L_0x003f:
        r0 = -2;
        r13.setHeight(r0);
    L_0x0043:
        r0 = r8.getWidth();
        r0 = (float) r0;
        r2 = r6.g;
        r2 = r2 * r9;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0058;
    L_0x004f:
        r0 = r6.g;
        r0 = r0 * r9;
        r0 = (int) r0;
        r13.setWidth(r0);
        if (r5 == 0) goto L_0x005b;
    L_0x0058:
        r13.setWidth(r12);
    L_0x005b:
        r0 = r8.getWidth();
        r0 = (float) r0;
        r2 = r6.g;
        r2 = r2 * r9;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0139;
    L_0x0067:
        r0 = r6.g;
        r0 = r0 * r9;
        r0 = (int) r0;
    L_0x006b:
        r2 = r6.G;
        r0 = r0 - r2;
        r2 = r6.s;
        r0 = r0 - r2;
        r2 = android.view.ViewConfiguration.getScrollBarSize();
        r0 = r0 - r2;
        r2 = r6.B;
        r9 = r0 / r2;
        r0 = r13.b;
        r13.setOnDismissListener(r0);
        r13.showAsDropDown(r14, r4, r1);
        r10 = r13.isAboveAnchor();
        r0 = r13.d;
        if (r10 == r0) goto L_0x0106;
    L_0x008a:
        r0 = r13.getContentView();
        r0 = (android.widget.RelativeLayout) r0;
        r0.removeAllViews();
        if (r10 == 0) goto L_0x00b8;
    L_0x0095:
        r1 = r13.h;
        r1 = r1.getLayoutInflater();
        r2 = 2130903140; // 0x7f030064 float:1.741309E38 double:1.052806036E-314;
        r1.inflate(r2, r0, r3);
        r1 = com.whatsapp.App.as();
        if (r1 == 0) goto L_0x013f;
    L_0x00a7:
        r1 = r6.G;
    L_0x00a9:
        r11 = r6.b;
        r2 = com.whatsapp.App.as();
        if (r2 == 0) goto L_0x0143;
    L_0x00b1:
        r2 = r6.s;
    L_0x00b3:
        r0.setPadding(r1, r11, r2, r4);
        if (r5 == 0) goto L_0x00d9;
    L_0x00b8:
        r1 = r13.h;
        r1 = r1.getLayoutInflater();
        r2 = 2130903139; // 0x7f030063 float:1.7413088E38 double:1.0528060356E-314;
        r1.inflate(r2, r0, r3);
        r1 = com.whatsapp.App.as();
        if (r1 == 0) goto L_0x0147;
    L_0x00ca:
        r1 = r6.G;
    L_0x00cc:
        r2 = com.whatsapp.App.as();
        if (r2 == 0) goto L_0x014a;
    L_0x00d2:
        r2 = r6.s;
    L_0x00d4:
        r5 = r6.b;
        r0.setPadding(r1, r4, r2, r5);
    L_0x00d9:
        com.whatsapp.b7.a(r0);
        r1 = 2131427779; // 0x7f0b01c3 float:1.8477184E38 double:1.053065242E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.view.ViewGroup) r0;
        r13.e = r0;
        r0 = r13.e;
        r0 = r0.getLayoutParams();
        r0.height = r12;
        r0 = r13.e;
        r0.setVisibility(r4);
        r0 = new com.whatsapp.c_;
        r1 = r13.h;
        r2 = r13.e;
        r0.<init>(r1, r2);
        r13.a = r0;
        r0 = r13.a;
        r1 = r13.g;
        r0.a(r1);
    L_0x0106:
        r0 = r7[r4];
        r1 = r8.getWidth();
        r1 = r1 / 2;
        if (r0 < r1) goto L_0x014d;
    L_0x0110:
        r0 = r3;
    L_0x0111:
        r1 = r13.c;
        if (r0 != r1) goto L_0x0119;
    L_0x0115:
        r1 = r13.d;
        if (r10 == r1) goto L_0x012f;
    L_0x0119:
        r1 = r13.h;
        r2 = r1.getResources();
        if (r10 == 0) goto L_0x014f;
    L_0x0121:
        r1 = 2130838739; // 0x7f0204d3 float:1.7282469E38 double:1.052774218E-314;
    L_0x0124:
        r1 = r2.getDrawable(r1);
        r3 = r13.a;
        if (r0 == 0) goto L_0x0153;
    L_0x012c:
        r3.a(r1);
    L_0x012f:
        r13.d = r10;
        r13.c = r0;
        r0 = r13.a;
        r0.a(r9);
        return;
    L_0x0139:
        r0 = r8.getWidth();
        goto L_0x006b;
    L_0x013f:
        r1 = r6.s;
        goto L_0x00a9;
    L_0x0143:
        r2 = r6.G;
        goto L_0x00b3;
    L_0x0147:
        r1 = r6.s;
        goto L_0x00cc;
    L_0x014a:
        r2 = r6.G;
        goto L_0x00d4;
    L_0x014d:
        r0 = r4;
        goto L_0x0111;
    L_0x014f:
        r1 = 2130838738; // 0x7f0204d2 float:1.7282467E38 double:1.0527742173E-314;
        goto L_0x0124;
    L_0x0153:
        r2 = new com.whatsapp.util.b3;
        r2.<init>(r1);
        r1 = r2;
        goto L_0x012c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a11.a(android.view.View):void");
    }

    public void a(tf tfVar) {
        this.g = tfVar;
        this.a.a(tfVar);
    }

    public a11(Activity activity) {
        int i;
        int i2;
        super(activity);
        this.c = true;
        this.b = new am5(this);
        this.h = activity;
        am1 a = am1.a();
        View emojiPopupWindow$2 = new EmojiPopupWindow$2(this, activity);
        b7.a(activity.getLayoutInflater(), R.layout.emoji_picker_horizontal, emojiPopupWindow$2, true);
        this.e = (ViewGroup) emojiPopupWindow$2.findViewById(R.id.emoji_view);
        this.e.getLayoutParams().height = -1;
        this.e.setVisibility(0);
        setContentView(emojiPopupWindow$2);
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new BitmapDrawable());
        setTouchInterceptor(new _a(this));
        setOnDismissListener(this.b);
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        this.a = new c_(activity, this.e);
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        if (((float) defaultDisplay.getWidth()) > a.g * 480.0f) {
            i = (int) (a.g * 480.0f);
        } else {
            i = defaultDisplay.getWidth();
        }
        int scrollBarSize = (((i - a.G) - a.s) - ViewConfiguration.getScrollBarSize()) / a.B;
        if (App.as()) {
            i = a.G;
        } else {
            i = a.s;
        }
        if (App.as()) {
            i2 = a.s;
        } else {
            i2 = a.G;
        }
        emojiPopupWindow$2.setPadding(i, 0, i2, a.b);
        this.a.a(scrollBarSize);
    }

    static Activity b(a11 com_whatsapp_a11) {
        return com_whatsapp_a11.h;
    }
}
