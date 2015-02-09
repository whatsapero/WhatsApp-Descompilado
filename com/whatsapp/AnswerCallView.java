package com.whatsapp;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.actionbarsherlock.R;

public class AnswerCallView extends View {
    private static final int[] f;
    private static final boolean i;
    private Drawable a;
    private boolean b;
    private float c;
    private cc d;
    private Drawable e;
    private int g;
    private float h;
    private Paint j;
    private Path k;
    private boolean l;
    private a86 m;
    private float n;
    private Drawable o;
    private Drawable p;
    private Path q;
    private Path r;
    private int s;

    static {
        boolean z;
        if (VERSION.SDK_INT >= 8) {
            z = true;
        } else {
            z = false;
        }
        i = z;
        f = new int[]{0, 70, 130};
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(8)
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
        r4_this = this;
        r2 = 0;
        r1 = 1;
        r3 = com.whatsapp.App.az;
        r0 = i;
        if (r0 == 0) goto L_0x000e;
    L_0x0008:
        r0 = r5.getActionMasked();
        if (r3 == 0) goto L_0x0012;
    L_0x000e:
        r0 = r5.getAction();
    L_0x0012:
        switch(r0) {
            case 0: goto L_0x0023;
            case 1: goto L_0x0030;
            case 2: goto L_0x002b;
            case 3: goto L_0x0038;
            case 4: goto L_0x0015;
            case 5: goto L_0x0023;
            case 6: goto L_0x0030;
            default: goto L_0x0015;
        };
    L_0x0015:
        r0 = r2;
    L_0x0016:
        r4.invalidate();
        if (r0 != 0) goto L_0x0021;
    L_0x001b:
        r0 = super.onTouchEvent(r5);
        if (r0 == 0) goto L_0x0022;
    L_0x0021:
        r2 = r1;
    L_0x0022:
        return r2;
    L_0x0023:
        r4.a(r5);
        r4.c(r5);
        if (r3 == 0) goto L_0x0040;
    L_0x002b:
        r4.c(r5);
        if (r3 == 0) goto L_0x0040;
    L_0x0030:
        r4.c(r5);
        r4.d(r5);
        if (r3 == 0) goto L_0x0040;
    L_0x0038:
        r4.c(r5);
        r4.b(r5);
        r0 = r1;
        goto L_0x0016;
    L_0x0040:
        r0 = r1;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AnswerCallView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    protected void onVisibilityChanged(View view, int i) {
        if (getVisibility() == 0) {
            if (getAnimation() == null && this.d != null) {
                startAnimation(this.d);
                if (App.az == 0) {
                    return;
                }
            }
            return;
        }
        clearAnimation();
    }

    public void setAnswerCallListener(a86 com_whatsapp_a86) {
        this.m = com_whatsapp_a86;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int height = getHeight();
        this.k.rewind();
        this.k.moveTo(0.0f, 0.0f);
        this.k.lineTo((float) (height / 4), 0.0f);
        this.k.lineTo((float) (height / 2), (float) (height / 2));
        this.k.lineTo((float) (height / 4), (float) height);
        this.k.lineTo(0.0f, (float) height);
        this.k.lineTo((float) (height / 4), (float) (height / 2));
        this.k.close();
        this.k.setFillType(FillType.WINDING);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.view.MotionEvent r5) {
        /*
        r4_this = this;
        r3 = 1;
        r0 = i;
        if (r0 == 0) goto L_0x0011;
    L_0x0005:
        r0 = r5.getActionIndex();
        r0 = r5.getX(r0);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0015;
    L_0x0011:
        r0 = r5.getX();
    L_0x0015:
        r1 = 0;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x0029;
    L_0x001a:
        r1 = r4.getHeight();
        r1 = r1 * 5;
        r1 = r1 / 4;
        r1 = (float) r1;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 >= 0) goto L_0x0029;
    L_0x0027:
        r4.l = r3;
    L_0x0029:
        r1 = r4.getWidth();
        r1 = (float) r1;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 >= 0) goto L_0x0046;
    L_0x0032:
        r1 = r4.getWidth();
        r2 = r4.getHeight();
        r2 = r2 * 5;
        r2 = r2 / 4;
        r1 = r1 - r2;
        r1 = (float) r1;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x0046;
    L_0x0044:
        r4.b = r3;
    L_0x0046:
        r4.c = r0;
        r4.h = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AnswerCallView.a(android.view.MotionEvent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(android.view.MotionEvent r3) {
        /*
        r2_this = this;
        r0 = i;
        if (r0 == 0) goto L_0x0010;
    L_0x0004:
        r0 = r3.getActionIndex();
        r0 = r3.getX(r0);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0014;
    L_0x0010:
        r0 = r3.getX();
    L_0x0014:
        r2.h = r0;
        r2.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AnswerCallView.c(android.view.MotionEvent):void");
    }

    static float a(AnswerCallView answerCallView, float f) {
        answerCallView.n = f;
        return f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r14) {
        /*
        r13_this = this;
        r1 = 0;
        r12 = -13355980; // 0xffffffffff343434 float:-2.395321E38 double:NaN;
        r11 = 0;
        r4 = com.whatsapp.App.az;
        super.onDraw(r14);
        r0 = -14869219; // 0xffffffffff1d1d1d float:-2.0883996E38 double:NaN;
        r14.drawColor(r0);
        r5 = r13.getWidth();
        r6 = r13.getHeight();
        r0 = r13.l;
        if (r0 == 0) goto L_0x01bb;
    L_0x001c:
        r0 = r13.h;
        r2 = r13.c;
        r0 = r0 - r2;
        r0 = (int) r0;
        r2 = r5 - r6;
        r0 = java.lang.Math.min(r0, r2);
    L_0x0028:
        r2 = r13.b;
        if (r2 == 0) goto L_0x01b8;
    L_0x002c:
        r2 = r13.c;
        r3 = r13.h;
        r2 = r2 - r3;
        r2 = (int) r2;
        r3 = r5 - r6;
        r2 = java.lang.Math.min(r2, r3);
    L_0x0038:
        r3 = r13.b;
        if (r3 != 0) goto L_0x009b;
    L_0x003c:
        r3 = r13.l;
        if (r3 != 0) goto L_0x009b;
    L_0x0040:
        r14.save();
        r3 = r6 / 4;
        r3 = r6 - r3;
        r3 = (float) r3;
        r7 = r13.n;
        r8 = r6 * 5;
        r8 = r8 / 2;
        r8 = r5 - r8;
        r8 = (float) r8;
        r7 = r7 * r8;
        r3 = r3 + r7;
        r14.translate(r3, r11);
    L_0x0056:
        r3 = f;
        r3 = r3.length;
        if (r1 >= r3) goto L_0x0091;
    L_0x005b:
        r3 = r13.j;
        r3.setColor(r12);
        r3 = f;
        r3 = r3[r1];
        r3 = 255 - r3;
        r7 = r13.n;
        r8 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 <= 0) goto L_0x0079;
    L_0x006f:
        r3 = r3 * 5;
        r3 = (float) r3;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r8 = r13.n;
        r7 = r7 - r8;
        r3 = r3 * r7;
        r3 = (int) r3;
    L_0x0079:
        r7 = r13.j;
        r7.setAlpha(r3);
        r3 = r13.k;
        r7 = r13.j;
        r14.drawPath(r3, r7);
        r3 = r6 * -2;
        r3 = r3 / 5;
        r3 = (float) r3;
        r14.translate(r3, r11);
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x0056;
    L_0x0091:
        r14.restore();
        r1 = r13.j;
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r1.setAlpha(r3);
    L_0x009b:
        r1 = r13.b;
        if (r1 != 0) goto L_0x0124;
    L_0x009f:
        r1 = r13.s;
        if (r1 == r0) goto L_0x00e4;
    L_0x00a3:
        r13.s = r0;
        r1 = r13.q;
        r1.rewind();
        r1 = r13.q;
        r1.moveTo(r11, r11);
        r1 = r13.q;
        r3 = r6 + r0;
        r3 = (float) r3;
        r1.lineTo(r3, r11);
        r1 = r13.q;
        r3 = r6 / 4;
        r3 = r3 + r6;
        r3 = r3 + r0;
        r3 = (float) r3;
        r7 = r6 / 2;
        r7 = (float) r7;
        r1.lineTo(r3, r7);
        r1 = r13.q;
        r3 = r6 + r0;
        r3 = (float) r3;
        r7 = (float) r6;
        r1.lineTo(r3, r7);
        r1 = r13.q;
        r3 = (float) r6;
        r1.lineTo(r11, r3);
        r1 = r13.q;
        r1.lineTo(r11, r11);
        r1 = r13.q;
        r1.close();
        r1 = r13.q;
        r3 = android.graphics.Path.FillType.WINDING;
        r1.setFillType(r3);
    L_0x00e4:
        r1 = r13.l;
        if (r1 == 0) goto L_0x00f4;
    L_0x00e8:
        r1 = r13.j;
        r3 = -9647782; // 0xffffffffff6cc95a float:-3.1474328E38 double:NaN;
        r1.setColor(r3);
        r1 = r13.e;
        if (r4 == 0) goto L_0x00fb;
    L_0x00f4:
        r1 = r13.j;
        r1.setColor(r12);
        r1 = r13.o;
    L_0x00fb:
        r3 = r13.j;
        r7 = android.graphics.Paint.Style.FILL;
        r3.setStyle(r7);
        r3 = r13.q;
        r7 = r13.j;
        r14.drawPath(r3, r7);
        r3 = r1.getIntrinsicHeight();
        r7 = r1.getIntrinsicWidth();
        r8 = r6 - r7;
        r8 = r8 / 2;
        r9 = r6 - r3;
        r9 = r9 / 2;
        r10 = r8 + r0;
        r7 = r7 + r8;
        r0 = r0 + r7;
        r3 = r3 + r9;
        r1.setBounds(r10, r9, r0, r3);
        r1.draw(r14);
    L_0x0124:
        r0 = r13.l;
        if (r0 != 0) goto L_0x01b7;
    L_0x0128:
        r0 = r13.g;
        if (r0 == r2) goto L_0x0174;
    L_0x012c:
        r0 = r13.r;
        r0.rewind();
        r0 = r13.r;
        r1 = (float) r5;
        r0.moveTo(r1, r11);
        r0 = r13.r;
        r1 = r5 - r6;
        r1 = r1 - r2;
        r1 = (float) r1;
        r0.lineTo(r1, r11);
        r0 = r13.r;
        r1 = r5 - r6;
        r3 = r6 / 4;
        r1 = r1 - r3;
        r1 = r1 - r2;
        r1 = (float) r1;
        r3 = r6 / 2;
        r3 = (float) r3;
        r0.lineTo(r1, r3);
        r0 = r13.r;
        r1 = r5 - r6;
        r1 = r1 - r2;
        r1 = (float) r1;
        r3 = (float) r6;
        r0.lineTo(r1, r3);
        r0 = r13.r;
        r1 = (float) r5;
        r3 = (float) r6;
        r0.lineTo(r1, r3);
        r0 = r13.r;
        r1 = (float) r5;
        r0.lineTo(r1, r11);
        r0 = r13.r;
        r0.close();
        r0 = r13.r;
        r1 = android.graphics.Path.FillType.WINDING;
        r0.setFillType(r1);
        r13.g = r2;
    L_0x0174:
        r0 = r13.b;
        if (r0 == 0) goto L_0x0184;
    L_0x0178:
        r0 = r13.j;
        r1 = -115666; // 0xfffffffffffe3c2e float:NaN double:NaN;
        r0.setColor(r1);
        r0 = r13.a;
        if (r4 == 0) goto L_0x018b;
    L_0x0184:
        r0 = r13.j;
        r0.setColor(r12);
        r0 = r13.p;
    L_0x018b:
        r1 = r13.j;
        r3 = android.graphics.Paint.Style.FILL;
        r1.setStyle(r3);
        r1 = r13.r;
        r3 = r13.j;
        r14.drawPath(r1, r3);
        r1 = r0.getIntrinsicHeight();
        r3 = r0.getIntrinsicWidth();
        r4 = r6 + r3;
        r4 = r4 / 2;
        r4 = r5 - r4;
        r5 = r6 - r1;
        r5 = r5 / 2;
        r6 = r4 - r2;
        r3 = r3 + r4;
        r2 = r3 - r2;
        r1 = r1 + r5;
        r0.setBounds(r6, r5, r2, r1);
        r0.draw(r14);
    L_0x01b7:
        return;
    L_0x01b8:
        r2 = r1;
        goto L_0x0038;
    L_0x01bb:
        r0 = r1;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AnswerCallView.onDraw(android.graphics.Canvas):void");
    }

    private void b(MotionEvent motionEvent) {
        this.l = false;
        this.b = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(android.view.MotionEvent r5) {
        /*
        r4_this = this;
        r3 = 0;
        r1 = com.whatsapp.App.az;
        r0 = i;
        if (r0 == 0) goto L_0x0011;
    L_0x0007:
        r0 = r5.getActionIndex();
        r0 = r5.getX(r0);
        if (r1 == 0) goto L_0x0015;
    L_0x0011:
        r0 = r5.getX();
    L_0x0015:
        r2 = r4.l;
        if (r2 == 0) goto L_0x002f;
    L_0x0019:
        r2 = r4.getWidth();
        r2 = r2 / 2;
        r2 = (float) r2;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x002f;
    L_0x0024:
        r2 = r4.m;
        if (r2 == 0) goto L_0x0054;
    L_0x0028:
        r2 = r4.m;
        r2.a();
        if (r1 == 0) goto L_0x0054;
    L_0x002f:
        r2 = r4.b;
        if (r2 == 0) goto L_0x0049;
    L_0x0033:
        r2 = r4.getWidth();
        r2 = r2 / 2;
        r2 = (float) r2;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x0049;
    L_0x003e:
        r0 = r4.m;
        if (r0 == 0) goto L_0x0054;
    L_0x0042:
        r0 = r4.m;
        r0.b();
        if (r1 == 0) goto L_0x0054;
    L_0x0049:
        r0 = r4.m;
        if (r0 == 0) goto L_0x0054;
    L_0x004d:
        r0 = r4.m;
        r1 = r4.l;
        r0.a(r1);
    L_0x0054:
        r4.l = r3;
        r4.b = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AnswerCallView.d(android.view.MotionEvent):void");
    }

    public AnswerCallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new Paint(1);
        this.q = new Path();
        this.r = new Path();
        this.k = new Path();
        this.s = -1;
        this.g = -1;
        this.o = context.getResources().getDrawable(R.drawable.ic_call_answer_normal);
        this.e = context.getResources().getDrawable(R.drawable.ic_call_answer_activated);
        this.p = context.getResources().getDrawable(R.drawable.ic_call_decline_normal);
        this.a = context.getResources().getDrawable(R.drawable.ic_call_decline_activated);
    }

    public AnswerCallView(Context context) {
        this(context, null);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = new cc(this, null);
        this.d.setDuration(800);
        this.d.setRepeatCount(-1);
        this.d.setInterpolator(new DecelerateInterpolator());
        startAnimation(this.d);
    }
}
