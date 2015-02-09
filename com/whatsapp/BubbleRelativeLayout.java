package com.whatsapp;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class BubbleRelativeLayout extends RelativeLayout {
    private static final Drawable b;
    private static final Drawable c;
    private static final Drawable e;
    static Paint l;
    private static final Drawable m;
    private static int o;
    private static final Drawable q;
    private static final String[] z;
    int a;
    public int d;
    boolean f;
    Rect g;
    b h;
    int i;
    int j;
    boolean k;
    boolean n;
    int p;
    int r;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onDraw(android.graphics.Canvas r12) {
        /*
        r11_this = this;
        r5 = com.whatsapp.App.az;
        r1 = 0;
        r0 = r11.isSelected();	 Catch:{ OutOfMemoryError -> 0x0149 }
        if (r0 != 0) goto L_0x0015;
    L_0x0009:
        r0 = r11.isPressed();	 Catch:{ OutOfMemoryError -> 0x0149 }
        if (r0 != 0) goto L_0x0015;
    L_0x000f:
        r0 = r11.isFocused();	 Catch:{ OutOfMemoryError -> 0x014b }
        if (r0 == 0) goto L_0x014f;
    L_0x0015:
        r0 = 1;
        r2 = r0;
    L_0x0017:
        r6 = com.whatsapp.am1.a();
        r0 = r11.h;	 Catch:{ OutOfMemoryError -> 0x0153 }
        r0 = r0.a;	 Catch:{ OutOfMemoryError -> 0x0153 }
        r3 = -1;
        if (r0 == r3) goto L_0x00f4;
    L_0x0022:
        r0 = r11.h;	 Catch:{ OutOfMemoryError -> 0x0153 }
        r0 = r0.a;	 Catch:{ OutOfMemoryError -> 0x0153 }
        r3 = 6;
        if (r0 != r3) goto L_0x0031;
    L_0x0029:
        r0 = r11.h;	 Catch:{ OutOfMemoryError -> 0x0155 }
        r0 = r0.j;	 Catch:{ OutOfMemoryError -> 0x0155 }
        r3 = 8;
        if (r0 != r3) goto L_0x00f4;
    L_0x0031:
        r0 = r11.a();
        r1 = (int) r0;
        r0 = r11.h;	 Catch:{ OutOfMemoryError -> 0x0157 }
        r0 = r0.e;	 Catch:{ OutOfMemoryError -> 0x0157 }
        r0 = r0.b;	 Catch:{ OutOfMemoryError -> 0x0157 }
        if (r0 == 0) goto L_0x019c;
    L_0x003e:
        r0 = r11.f;	 Catch:{ OutOfMemoryError -> 0x0157 }
        if (r0 == 0) goto L_0x0058;
    L_0x0042:
        r0 = r11.g;	 Catch:{ OutOfMemoryError -> 0x0159 }
        r3 = 0;
        r4 = r11.r;	 Catch:{ OutOfMemoryError -> 0x0159 }
        r7 = r6.k;	 Catch:{ OutOfMemoryError -> 0x0159 }
        r4 = r4 - r7;
        r7 = r11.getWidth();	 Catch:{ OutOfMemoryError -> 0x0159 }
        r8 = r11.j;	 Catch:{ OutOfMemoryError -> 0x0159 }
        r9 = r6.v;	 Catch:{ OutOfMemoryError -> 0x0159 }
        r8 = r8 + r9;
        r0.set(r3, r4, r7, r8);	 Catch:{ OutOfMemoryError -> 0x0159 }
        if (r5 == 0) goto L_0x00b1;
    L_0x0058:
        r0 = r11.h;	 Catch:{ OutOfMemoryError -> 0x015b }
        r0 = r0.j;	 Catch:{ OutOfMemoryError -> 0x015b }
        if (r0 == 0) goto L_0x0089;
    L_0x005e:
        r4 = r11.g;	 Catch:{ OutOfMemoryError -> 0x015d }
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x015d }
        if (r0 == 0) goto L_0x0161;
    L_0x0066:
        r0 = r11.getWidth();	 Catch:{ OutOfMemoryError -> 0x015f }
        r0 = r0 - r1;
        r3 = r6.m;	 Catch:{ OutOfMemoryError -> 0x015f }
        r0 = r0 - r3;
        r3 = r0;
    L_0x006f:
        r0 = r11.r;	 Catch:{ OutOfMemoryError -> 0x0165 }
        r7 = r6.k;	 Catch:{ OutOfMemoryError -> 0x0165 }
        r7 = r0 - r7;
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x0165 }
        if (r0 == 0) goto L_0x0167;
    L_0x007b:
        r0 = r11.getWidth();	 Catch:{ OutOfMemoryError -> 0x0165 }
    L_0x007f:
        r8 = r11.j;	 Catch:{ OutOfMemoryError -> 0x016c }
        r9 = r6.v;	 Catch:{ OutOfMemoryError -> 0x016c }
        r8 = r8 + r9;
        r4.set(r3, r7, r0, r8);	 Catch:{ OutOfMemoryError -> 0x016c }
        if (r5 == 0) goto L_0x00b1;
    L_0x0089:
        r4 = r11.g;	 Catch:{ OutOfMemoryError -> 0x016c }
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x016c }
        if (r0 == 0) goto L_0x0170;
    L_0x0091:
        r0 = r11.getWidth();	 Catch:{ OutOfMemoryError -> 0x016e }
        r0 = r0 - r1;
        r3 = r0;
    L_0x0097:
        r0 = r11.r;	 Catch:{ OutOfMemoryError -> 0x0174 }
        r7 = r6.h;	 Catch:{ OutOfMemoryError -> 0x0174 }
        r7 = r0 - r7;
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x0174 }
        if (r0 == 0) goto L_0x0176;
    L_0x00a3:
        r0 = r11.getWidth();	 Catch:{ OutOfMemoryError -> 0x0174 }
    L_0x00a7:
        r8 = r11.getHeight();
        r9 = r6.h;
        r8 = r8 - r9;
        r4.set(r3, r7, r0, r8);
    L_0x00b1:
        r0 = r11.f;	 Catch:{ OutOfMemoryError -> 0x0179 }
        if (r0 == 0) goto L_0x00ca;
    L_0x00b5:
        r0 = com.whatsapp.App.p;	 Catch:{ OutOfMemoryError -> 0x0179 }
        r0 = r0.getApplicationContext();	 Catch:{ OutOfMemoryError -> 0x0179 }
        r3 = r0.getResources();	 Catch:{ OutOfMemoryError -> 0x0179 }
        if (r2 == 0) goto L_0x02fc;
    L_0x00c1:
        r0 = 2130837661; // 0x7f02009d float:1.7280282E38 double:1.052773685E-314;
    L_0x00c4:
        r0 = r3.getDrawable(r0);	 Catch:{ OutOfMemoryError -> 0x017d }
        if (r5 == 0) goto L_0x00e1;
    L_0x00ca:
        if (r2 == 0) goto L_0x00df;
    L_0x00cc:
        r0 = com.whatsapp.App.p;	 Catch:{ OutOfMemoryError -> 0x017d }
        r0 = r0.getApplicationContext();	 Catch:{ OutOfMemoryError -> 0x017d }
        r0 = r0.getResources();	 Catch:{ OutOfMemoryError -> 0x017d }
        r3 = 2130837675; // 0x7f0200ab float:1.728031E38 double:1.052773692E-314;
        r0 = r0.getDrawable(r3);	 Catch:{ OutOfMemoryError -> 0x017d }
        if (r5 == 0) goto L_0x00e1;
    L_0x00df:
        r0 = b;	 Catch:{ OutOfMemoryError -> 0x017d }
    L_0x00e1:
        if (r0 == 0) goto L_0x00f4;
    L_0x00e3:
        r3 = new com.whatsapp.util.bd;	 Catch:{ OutOfMemoryError -> 0x017d }
        r3.<init>(r0);	 Catch:{ OutOfMemoryError -> 0x017d }
        r0 = 1;
        r3.setDither(r0);	 Catch:{ OutOfMemoryError -> 0x017d }
        r0 = r11.g;	 Catch:{ OutOfMemoryError -> 0x017d }
        r3.setBounds(r0);	 Catch:{ OutOfMemoryError -> 0x017d }
        r3.draw(r12);	 Catch:{ OutOfMemoryError -> 0x017d }
    L_0x00f4:
        super.onDraw(r12);	 Catch:{ OutOfMemoryError -> 0x045a }
        r0 = r11.h;	 Catch:{ OutOfMemoryError -> 0x045a }
        r0 = r0.a;	 Catch:{ OutOfMemoryError -> 0x045a }
        r2 = -1;
        if (r0 == r2) goto L_0x0148;
    L_0x00fe:
        r0 = r11.h;	 Catch:{ OutOfMemoryError -> 0x045c }
        r0 = r0.e;	 Catch:{ OutOfMemoryError -> 0x045c }
        r0 = r0.b;	 Catch:{ OutOfMemoryError -> 0x045c }
        if (r0 != 0) goto L_0x0148;
    L_0x0106:
        r0 = r11.k;	 Catch:{ OutOfMemoryError -> 0x045c }
        if (r0 == 0) goto L_0x0148;
    L_0x010a:
        r0 = r11.getContext();
        r0 = r0.getResources();
        r0 = r0.getDisplayMetrics();
        r0 = r0.widthPixels;
        r2 = r11.h;	 Catch:{ OutOfMemoryError -> 0x045e }
        r2 = r2.j;	 Catch:{ OutOfMemoryError -> 0x045e }
        if (r2 != 0) goto L_0x0148;
    L_0x011e:
        r2 = r11.d;	 Catch:{ OutOfMemoryError -> 0x0460 }
        r3 = -1;
        if (r2 == r3) goto L_0x0148;
    L_0x0123:
        r2 = r11.d;	 Catch:{ OutOfMemoryError -> 0x0460 }
        r3 = 1;
        if (r2 == r3) goto L_0x0148;
    L_0x0128:
        r1 = (float) r1;
        r2 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r3 = r1 * r2;
        r1 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x0462 }
        if (r1 == 0) goto L_0x0464;
    L_0x0133:
        r1 = r6.D;	 Catch:{ OutOfMemoryError -> 0x0462 }
    L_0x0135:
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x046b }
        if (r4 == 0) goto L_0x046d;
    L_0x013d:
        r0 = r6.D;	 Catch:{ OutOfMemoryError -> 0x046b }
        r3 = r3 + r0;
    L_0x0140:
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = l;
        r0 = r12;
        r0.drawLine(r1, r2, r3, r4, r5);
    L_0x0148:
        return;
    L_0x0149:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x014b }
    L_0x014b:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x014d }
    L_0x014d:
        r0 = move-exception;
        throw r0;
    L_0x014f:
        r0 = 0;
        r2 = r0;
        goto L_0x0017;
    L_0x0153:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0155 }
    L_0x0155:
        r0 = move-exception;
        throw r0;
    L_0x0157:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0159 }
    L_0x0159:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x015b }
    L_0x015b:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x015d }
    L_0x015d:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x015f }
    L_0x015f:
        r0 = move-exception;
        throw r0;
    L_0x0161:
        r0 = 0;
        r3 = r0;
        goto L_0x006f;
    L_0x0165:
        r0 = move-exception;
        throw r0;
    L_0x0167:
        r0 = r6.m;
        r0 = r0 + r1;
        goto L_0x007f;
    L_0x016c:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x016e }
    L_0x016e:
        r0 = move-exception;
        throw r0;
    L_0x0170:
        r0 = 0;
        r3 = r0;
        goto L_0x0097;
    L_0x0174:
        r0 = move-exception;
        throw r0;
    L_0x0176:
        r0 = r1;
        goto L_0x00a7;
    L_0x0179:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x017b }
    L_0x017b:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x017d }
    L_0x017d:
        r0 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x0301 }
        r3.<init>();	 Catch:{ OutOfMemoryError -> 0x0301 }
        r4 = z;	 Catch:{ OutOfMemoryError -> 0x0301 }
        r7 = 0;
        r4 = r4[r7];	 Catch:{ OutOfMemoryError -> 0x0301 }
        r3 = r3.append(r4);	 Catch:{ OutOfMemoryError -> 0x0301 }
        r0 = r3.append(r0);	 Catch:{ OutOfMemoryError -> 0x0301 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x0301 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ OutOfMemoryError -> 0x0301 }
        com.whatsapp.util.f.a();	 Catch:{ OutOfMemoryError -> 0x0301 }
        if (r5 == 0) goto L_0x00f4;
    L_0x019c:
        r0 = r11.d;	 Catch:{ OutOfMemoryError -> 0x0301 }
        r3 = -1;
        if (r0 == r3) goto L_0x0235;
    L_0x01a1:
        r0 = com.whatsapp.Conversation.t;	 Catch:{ OutOfMemoryError -> 0x0303 }
        r3 = r11.h;	 Catch:{ OutOfMemoryError -> 0x0303 }
        r3 = r3.e;	 Catch:{ OutOfMemoryError -> 0x0303 }
        r0 = r0.containsKey(r3);	 Catch:{ OutOfMemoryError -> 0x0303 }
        if (r0 == 0) goto L_0x0232;
    L_0x01ad:
        r0 = com.whatsapp.Conversation.al;
        r0 = r0.getWidth();
        r3 = o;
        r3 = r0 - r3;
        r0 = com.whatsapp.Conversation.t;
        r4 = r11.h;
        r4 = r4.e;
        r0 = r0.get(r4);
        r0 = (com.whatsapp.w_) r0;
        r4 = com.whatsapp.w_.a(r0);
        if (r4 <= r3) goto L_0x01cc;
    L_0x01c9:
        if (r5 == 0) goto L_0x0474;
    L_0x01cb:
        r1 = r3;
    L_0x01cc:
        r3 = com.whatsapp.w_.a(r0);	 Catch:{ OutOfMemoryError -> 0x0305 }
        if (r3 >= r1) goto L_0x022c;
    L_0x01d2:
        r3 = 0;
        r4 = com.whatsapp.w_.a(r0);
        if (r4 < r1) goto L_0x01df;
    L_0x01d9:
        r1 = com.whatsapp.w_.a(r0);
        if (r5 == 0) goto L_0x0477;
    L_0x01df:
        r0.a(r1);
        r3 = 1;
        r10 = r3;
        r3 = r1;
        r1 = r10;
    L_0x01e6:
        if (r1 == 0) goto L_0x022a;
    L_0x01e8:
        r4 = r0.d;
        r1 = r11.getContext();
        r1 = r1 instanceof com.whatsapp.Conversation;
        if (r1 == 0) goto L_0x022a;
    L_0x01f2:
        r1 = r11.getContext();
        r1 = (com.whatsapp.Conversation) r1;
        r7 = r1.bd;	 Catch:{ OutOfMemoryError -> 0x0307 }
        if (r7 == 0) goto L_0x022a;
    L_0x01fc:
        if (r4 == 0) goto L_0x0212;
    L_0x01fe:
        r4.a(r3);
        r7 = r1.bd;
        r8 = r4.a;
        r7 = r7.findViewWithTag(r8);
        if (r7 == 0) goto L_0x020e;
    L_0x020b:
        r7.invalidate();	 Catch:{ OutOfMemoryError -> 0x0309 }
    L_0x020e:
        r4 = r4.d;
        if (r5 == 0) goto L_0x01fc;
    L_0x0212:
        r4 = r0.c;
    L_0x0214:
        if (r4 == 0) goto L_0x022a;
    L_0x0216:
        r4.a(r3);
        r7 = r1.bd;
        r8 = r4.a;
        r7 = r7.findViewWithTag(r8);
        if (r7 == 0) goto L_0x0226;
    L_0x0223:
        r7.invalidate();	 Catch:{ OutOfMemoryError -> 0x030b }
    L_0x0226:
        r4 = r4.c;
        if (r5 == 0) goto L_0x0214;
    L_0x022a:
        if (r5 == 0) goto L_0x0474;
    L_0x022c:
        r1 = com.whatsapp.w_.a(r0);
    L_0x0230:
        if (r5 == 0) goto L_0x0235;
    L_0x0232:
        r0 = -1;
        r11.d = r0;	 Catch:{ OutOfMemoryError -> 0x030d }
    L_0x0235:
        r0 = r11.h;	 Catch:{ OutOfMemoryError -> 0x030f }
        r0 = r0.j;	 Catch:{ OutOfMemoryError -> 0x030f }
        if (r0 == 0) goto L_0x0267;
    L_0x023b:
        r0 = r11.h;	 Catch:{ OutOfMemoryError -> 0x030f }
        r0 = r0.j;	 Catch:{ OutOfMemoryError -> 0x030f }
        r3 = 8;
        if (r0 == r3) goto L_0x0267;
    L_0x0243:
        r4 = r11.g;	 Catch:{ OutOfMemoryError -> 0x0311 }
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x0311 }
        if (r0 == 0) goto L_0x0315;
    L_0x024b:
        r0 = 0;
        r3 = r0;
    L_0x024d:
        r0 = r11.r;	 Catch:{ OutOfMemoryError -> 0x0320 }
        r7 = r6.k;	 Catch:{ OutOfMemoryError -> 0x0320 }
        r7 = r0 - r7;
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x0320 }
        if (r0 == 0) goto L_0x0322;
    L_0x0259:
        r0 = r6.m;	 Catch:{ OutOfMemoryError -> 0x0320 }
        r0 = r1 - r0;
    L_0x025d:
        r8 = r11.j;	 Catch:{ OutOfMemoryError -> 0x0328 }
        r9 = r6.v;	 Catch:{ OutOfMemoryError -> 0x0328 }
        r8 = r8 + r9;
        r4.set(r3, r7, r0, r8);	 Catch:{ OutOfMemoryError -> 0x0328 }
        if (r5 == 0) goto L_0x02d0;
    L_0x0267:
        r0 = r11.d;	 Catch:{ OutOfMemoryError -> 0x0328 }
        r3 = -1;
        if (r0 != r3) goto L_0x028f;
    L_0x026c:
        r4 = r11.g;	 Catch:{ OutOfMemoryError -> 0x032a }
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x032a }
        if (r0 == 0) goto L_0x032e;
    L_0x0274:
        r0 = 0;
        r3 = r0;
    L_0x0276:
        r0 = r11.r;	 Catch:{ OutOfMemoryError -> 0x0336 }
        r7 = r6.h;	 Catch:{ OutOfMemoryError -> 0x0336 }
        r7 = r0 - r7;
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x0336 }
        if (r0 == 0) goto L_0x0338;
    L_0x0282:
        r0 = r1;
    L_0x0283:
        r8 = r11.getHeight();	 Catch:{ OutOfMemoryError -> 0x033e }
        r9 = r6.h;	 Catch:{ OutOfMemoryError -> 0x033e }
        r8 = r8 - r9;
        r4.set(r3, r7, r0, r8);	 Catch:{ OutOfMemoryError -> 0x033e }
        if (r5 == 0) goto L_0x02d0;
    L_0x028f:
        r0 = r11.d;	 Catch:{ OutOfMemoryError -> 0x033e }
        switch(r0) {
            case 1: goto L_0x0344;
            case 2: goto L_0x0366;
            case 3: goto L_0x0383;
            default: goto L_0x0294;
        };
    L_0x0294:
        r4 = r11.g;	 Catch:{ OutOfMemoryError -> 0x03d5 }
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x03d5 }
        if (r0 == 0) goto L_0x03d9;
    L_0x029c:
        r0 = 0;
        r3 = r0;
    L_0x029e:
        r0 = r11.r;	 Catch:{ OutOfMemoryError -> 0x03e1 }
        r5 = r6.h;	 Catch:{ OutOfMemoryError -> 0x03e1 }
        r5 = r0 - r5;
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x03e1 }
        if (r0 == 0) goto L_0x03e3;
    L_0x02aa:
        r0 = r1;
    L_0x02ab:
        r7 = r11.getHeight();
        r8 = r6.h;
        r7 = r7 - r8;
        r4.set(r3, r5, r0, r7);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r3 = r11.d;
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x02d0:
        r3 = 0;
        r0 = r11.d;	 Catch:{ OutOfMemoryError -> 0x03fc }
        switch(r0) {
            case 1: goto L_0x03e9;
            case 2: goto L_0x0404;
            case 3: goto L_0x041d;
            default: goto L_0x02d6;
        };
    L_0x02d6:
        if (r2 == 0) goto L_0x0436;
    L_0x02d8:
        r0 = r11.getContext();	 Catch:{ OutOfMemoryError -> 0x043a }
        r0 = r0.getResources();	 Catch:{ OutOfMemoryError -> 0x043a }
        r2 = 2130837663; // 0x7f02009f float:1.7280286E38 double:1.052773686E-314;
        r0 = r0.getDrawable(r2);	 Catch:{ OutOfMemoryError -> 0x043a }
    L_0x02e7:
        if (r0 == 0) goto L_0x00f4;
    L_0x02e9:
        r2 = new com.whatsapp.util.bd;
        r2.<init>(r0);
        r0 = r11.g;
        r2.setBounds(r0);
        r0 = 1;
        r2.setDither(r0);
        r2.draw(r12);
        goto L_0x00f4;
    L_0x02fc:
        r0 = 2130837660; // 0x7f02009c float:1.728028E38 double:1.0527736847E-314;
        goto L_0x00c4;
    L_0x0301:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0303 }
    L_0x0303:
        r0 = move-exception;
        throw r0;
    L_0x0305:
        r0 = move-exception;
        throw r0;
    L_0x0307:
        r0 = move-exception;
        throw r0;
    L_0x0309:
        r0 = move-exception;
        throw r0;
    L_0x030b:
        r0 = move-exception;
        throw r0;
    L_0x030d:
        r0 = move-exception;
        throw r0;
    L_0x030f:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0311 }
    L_0x0311:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0313 }
    L_0x0313:
        r0 = move-exception;
        throw r0;
    L_0x0315:
        r0 = r11.getWidth();
        r0 = r0 - r1;
        r3 = r6.m;
        r0 = r0 + r3;
        r3 = r0;
        goto L_0x024d;
    L_0x0320:
        r0 = move-exception;
        throw r0;
    L_0x0322:
        r0 = r11.getWidth();
        goto L_0x025d;
    L_0x0328:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x032a }
    L_0x032a:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x032c }
    L_0x032c:
        r0 = move-exception;
        throw r0;
    L_0x032e:
        r0 = r11.getWidth();
        r0 = r0 - r1;
        r3 = r0;
        goto L_0x0276;
    L_0x0336:
        r0 = move-exception;
        throw r0;
    L_0x0338:
        r0 = r11.getWidth();
        goto L_0x0283;
    L_0x033e:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0340 }
    L_0x0340:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0342 }
    L_0x0342:
        r0 = move-exception;
        throw r0;
    L_0x0344:
        r4 = r11.g;	 Catch:{ OutOfMemoryError -> 0x0340 }
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x0340 }
        if (r0 == 0) goto L_0x03a3;
    L_0x034c:
        r0 = 0;
        r3 = r0;
    L_0x034e:
        r0 = r11.r;	 Catch:{ OutOfMemoryError -> 0x03aa }
        r7 = r6.h;	 Catch:{ OutOfMemoryError -> 0x03aa }
        r7 = r0 - r7;
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x03aa }
        if (r0 == 0) goto L_0x03ac;
    L_0x035a:
        r0 = r1;
    L_0x035b:
        r8 = r11.getHeight();	 Catch:{ OutOfMemoryError -> 0x03b1 }
        r8 = r8 + 1;
        r4.set(r3, r7, r0, r8);	 Catch:{ OutOfMemoryError -> 0x03b1 }
        if (r5 == 0) goto L_0x02d0;
    L_0x0366:
        r4 = r11.g;	 Catch:{ OutOfMemoryError -> 0x03b1 }
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x03b1 }
        if (r0 == 0) goto L_0x03b5;
    L_0x036e:
        r0 = 0;
        r3 = r0;
    L_0x0370:
        r7 = -1;
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x03bc }
        if (r0 == 0) goto L_0x03be;
    L_0x0377:
        r0 = r1;
    L_0x0378:
        r8 = r11.getHeight();	 Catch:{ OutOfMemoryError -> 0x03c3 }
        r8 = r8 + 1;
        r4.set(r3, r7, r0, r8);	 Catch:{ OutOfMemoryError -> 0x03c3 }
        if (r5 == 0) goto L_0x02d0;
    L_0x0383:
        r4 = r11.g;	 Catch:{ OutOfMemoryError -> 0x03c3 }
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x03c3 }
        if (r0 == 0) goto L_0x03c7;
    L_0x038b:
        r0 = 0;
        r3 = r0;
    L_0x038d:
        r7 = -1;
        r0 = com.whatsapp.App.as();	 Catch:{ OutOfMemoryError -> 0x03ce }
        if (r0 == 0) goto L_0x03d0;
    L_0x0394:
        r0 = r1;
    L_0x0395:
        r8 = r11.getHeight();	 Catch:{ OutOfMemoryError -> 0x03d5 }
        r9 = r6.h;	 Catch:{ OutOfMemoryError -> 0x03d5 }
        r8 = r8 - r9;
        r4.set(r3, r7, r0, r8);	 Catch:{ OutOfMemoryError -> 0x03d5 }
        if (r5 == 0) goto L_0x02d0;
    L_0x03a1:
        goto L_0x0294;
    L_0x03a3:
        r0 = r11.getWidth();
        r0 = r0 - r1;
        r3 = r0;
        goto L_0x034e;
    L_0x03aa:
        r0 = move-exception;
        throw r0;
    L_0x03ac:
        r0 = r11.getWidth();
        goto L_0x035b;
    L_0x03b1:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x03b3 }
    L_0x03b3:
        r0 = move-exception;
        throw r0;
    L_0x03b5:
        r0 = r11.getWidth();
        r0 = r0 - r1;
        r3 = r0;
        goto L_0x0370;
    L_0x03bc:
        r0 = move-exception;
        throw r0;
    L_0x03be:
        r0 = r11.getWidth();
        goto L_0x0378;
    L_0x03c3:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x03c5 }
    L_0x03c5:
        r0 = move-exception;
        throw r0;
    L_0x03c7:
        r0 = r11.getWidth();
        r0 = r0 - r1;
        r3 = r0;
        goto L_0x038d;
    L_0x03ce:
        r0 = move-exception;
        throw r0;
    L_0x03d0:
        r0 = r11.getWidth();
        goto L_0x0395;
    L_0x03d5:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x03d7 }
    L_0x03d7:
        r0 = move-exception;
        throw r0;
    L_0x03d9:
        r0 = r11.getWidth();
        r0 = r0 - r1;
        r3 = r0;
        goto L_0x029e;
    L_0x03e1:
        r0 = move-exception;
        throw r0;
    L_0x03e3:
        r0 = r11.getWidth();
        goto L_0x02ab;
    L_0x03e9:
        if (r2 == 0) goto L_0x0400;
    L_0x03eb:
        r0 = r11.getContext();	 Catch:{ OutOfMemoryError -> 0x03fe }
        r0 = r0.getResources();	 Catch:{ OutOfMemoryError -> 0x03fe }
        r2 = 2130837666; // 0x7f0200a2 float:1.7280293E38 double:1.0527736876E-314;
        r0 = r0.getDrawable(r2);	 Catch:{ OutOfMemoryError -> 0x03fe }
        goto L_0x02e7;
    L_0x03fc:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x03fe }
    L_0x03fe:
        r0 = move-exception;
        throw r0;
    L_0x0400:
        r0 = c;
        goto L_0x02e7;
    L_0x0404:
        if (r2 == 0) goto L_0x0419;
    L_0x0406:
        r0 = r11.getContext();	 Catch:{ OutOfMemoryError -> 0x0417 }
        r0 = r0.getResources();	 Catch:{ OutOfMemoryError -> 0x0417 }
        r2 = 2130837665; // 0x7f0200a1 float:1.728029E38 double:1.052773687E-314;
        r0 = r0.getDrawable(r2);	 Catch:{ OutOfMemoryError -> 0x0417 }
        goto L_0x02e7;
    L_0x0417:
        r0 = move-exception;
        throw r0;
    L_0x0419:
        r0 = e;
        goto L_0x02e7;
    L_0x041d:
        if (r2 == 0) goto L_0x0432;
    L_0x041f:
        r0 = r11.getContext();	 Catch:{ OutOfMemoryError -> 0x0430 }
        r0 = r0.getResources();	 Catch:{ OutOfMemoryError -> 0x0430 }
        r2 = 2130837664; // 0x7f0200a0 float:1.7280288E38 double:1.0527736866E-314;
        r0 = r0.getDrawable(r2);	 Catch:{ OutOfMemoryError -> 0x0430 }
        goto L_0x02e7;
    L_0x0430:
        r0 = move-exception;
        throw r0;
    L_0x0432:
        r0 = m;
        goto L_0x02e7;
    L_0x0436:
        r0 = q;	 Catch:{ OutOfMemoryError -> 0x043a }
        goto L_0x02e7;
    L_0x043a:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 1;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r3;
        com.whatsapp.util.f.a();
        goto L_0x02e7;
    L_0x045a:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x045c }
    L_0x045c:
        r0 = move-exception;
        throw r0;
    L_0x045e:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0460 }
    L_0x0460:
        r0 = move-exception;
        throw r0;
    L_0x0462:
        r0 = move-exception;
        throw r0;
    L_0x0464:
        r1 = (float) r0;
        r2 = r6.D;
        r1 = r1 - r2;
        r1 = r1 - r3;
        goto L_0x0135;
    L_0x046b:
        r0 = move-exception;
        throw r0;
    L_0x046d:
        r0 = (float) r0;
        r3 = r6.D;
        r3 = r0 - r3;
        goto L_0x0140;
    L_0x0474:
        r1 = r3;
        goto L_0x0230;
    L_0x0477:
        r10 = r3;
        r3 = r1;
        r1 = r10;
        goto L_0x01e6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.BubbleRelativeLayout.onDraw(android.graphics.Canvas):void");
    }

    static {
        String[] strArr = new String[3];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "\u0002m\tH\u001f\u0005G\u0019u\u001f\u0001a\u0004_\u0007O\u007f\u0019O\u0016\u000eG\t_\u0011\u0002t\u000e\u0005";
        int i2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 96;
                        break;
                    case ay.f /*1*/:
                        i4 = 24;
                        break;
                    case ay.n /*2*/:
                        i4 = 107;
                        break;
                    case ay.p /*3*/:
                        i4 = 42;
                        break;
                    default:
                        i4 = 115;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0002m\tH\u001f\u00057\u0019O\u0010\u00148\u0005E\u0007@q\u0005C\u0007\ty\u001fO\u0017@a\u000e^]Z";
                    i2 = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    o = -1;
                    b = App.p.getApplicationContext().getResources().getDrawable(R.drawable.balloon_outgoing_normal);
                    c = App.p.getApplicationContext().getResources().getDrawable(R.drawable.balloon_incoming_top);
                    e = App.p.getApplicationContext().getResources().getDrawable(R.drawable.balloon_incoming_mid);
                    m = App.p.getApplicationContext().getResources().getDrawable(R.drawable.balloon_incoming_bot);
                    q = App.p.getApplicationContext().getResources().getDrawable(R.drawable.balloon_incoming_normal);
                default:
                    strArr2[i] = str;
                    str = "\u0002m\tH\u001f\u0005G\u0019u\u001f\u0001a\u0004_\u0007O\u007f\u0019K\n?z\u001eH\u0011\f}";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    protected float a() {
        am1 a = am1.a();
        this.i = 0;
        ViewGroup viewGroup = (ViewGroup) getChildAt(1);
        this.r = viewGroup.getTop();
        this.j = viewGroup.getBottom();
        this.k = bd.b(this.h.e.c);
        if (!this.k || this.h.e.b) {
            this.i = viewGroup.getMeasuredWidth();
            return (((float) this.i) + a.t) + a.p;
        }
        View childAt = viewGroup.getChildAt(0);
        this.a = childAt.getMeasuredHeight();
        switch (viewGroup.getId()) {
            case R.id.text_layout:
                this.p = childAt.getMeasuredWidth();
                return (((float) viewGroup.getMeasuredWidth()) + a.t) + a.p;
            default:
                this.i = viewGroup.getMeasuredWidth() + this.i;
                return (((float) this.i) + a.t) + a.p;
        }
    }

    public BubbleRelativeLayout(Context context, b bVar) {
        super(context);
        this.n = false;
        this.g = new Rect();
        this.d = -1;
        this.h = bVar;
        if (l == null) {
            l = new Paint();
            l.setColor(285212672);
            l.setStrokeWidth(am1.a().e);
        }
        if (o == -1) {
            o = (int) getResources().getDimension(R.dimen.conversation_collapsed_row_margin_right);
        }
    }
}
