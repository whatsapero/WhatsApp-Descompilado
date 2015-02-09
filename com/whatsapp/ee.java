package com.whatsapp;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ee extends PopupWindow {
    private static final String[] z;
    private OnGlobalLayoutListener a;
    private ImageButton b;
    private View c;
    private ImageButton d;
    private c_ e;
    private tf f;
    private ViewGroup g;
    private Activity h;

    static {
        String[] strArr = new String[9];
        String str = "D@P";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 100;
                        break;
                    case ay.f /*1*/:
                        i3 = 57;
                        break;
                    case ay.n /*2*/:
                        i3 = 106;
                        break;
                    case ay.p /*3*/:
                        i3 = 61;
                        break;
                    default:
                        i3 = 50;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0007V\u0004KW\u0016J\u000bI[\u000bW\u000fP]\u000eP\u001aRB\u0011I\u001dT\\\u0000V\u001d\u0012A\fV\u001d\u001dS\u0006V\u001cX\b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0001T\u0005W[;I\u0005MG\u0014f\u0006\\\\\u0000J\t\\B\u0001f\u0002X[\u0003Q\u001e";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0007V\u0007\u0013E\fX\u001eNS\u0014I5M@\u0001_\u000fOW\nZ\u000fN";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0001T\u0005W[;I\u0005MG\u0014f\u0002X[\u0003Q\u001e";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0001T\u0005W[;I\u0005MG\u0014f\u0006\\\\\u0000J\t\\B\u0001f\u0002X[\u0003Q\u001e";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0007V\u0007\u0013E\fX\u001eNS\u0014I5M@\u0001_\u000fOW\nZ\u000fN";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0001T\u0005W[;I\u0005MG\u0014f\u0002X[\u0003Q\u001e";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "DQP";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void b() {
        am1 a = am1.a();
        View relativeLayout = new RelativeLayout(this.h);
        b7.a(this.h.getLayoutInflater(), R.layout.emoji_picker_horizontal, relativeLayout, true);
        this.g = (ViewGroup) relativeLayout.findViewById(R.id.emoji_view);
        this.g.getLayoutParams().height = -1;
        this.g.setVisibility(0);
        this.g.findViewById(R.id.emoji_group_layout).setPadding(0, 0, 0, 0);
        this.g.findViewById(R.id.emoji_group_layout).setBackgroundColor(this.h.getResources().getColor(R.color.emoji_popup_header));
        this.g.findViewById(R.id.emoji_icons_layout).setPadding(0, 0, 0, 0);
        this.g.findViewById(R.id.emoji_icons_layout).setBackgroundColor(this.h.getResources().getColor(R.color.emoji_popup_body));
        setContentView(relativeLayout);
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new BitmapDrawable());
        setTouchInterceptor(new ox(this));
        setTouchable(true);
        setFocusable(false);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        this.e = new c_(this.h, this.g);
        this.e.a(this.h.getWindowManager().getDefaultDisplay().getWidth() / a.B);
        this.e.a(true);
        this.e.a(this.f);
    }

    public void a(tf tfVar) {
        this.f = tfVar;
        if (this.e != null) {
            this.e.a(tfVar);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r11, android.widget.ImageButton r12, android.widget.ImageButton r13, boolean r14) {
        /*
        r10_this = this;
        r3 = com.whatsapp.App.az;
        r0 = r10.e;
        if (r0 != 0) goto L_0x0009;
    L_0x0006:
        r10.b();
    L_0x0009:
        r0 = r10.c;
        if (r0 == 0) goto L_0x0018;
    L_0x000d:
        r0 = r10.c;
        r0 = r0.getViewTreeObserver();
        r1 = r10.a;
        r0.removeGlobalOnLayoutListener(r1);
    L_0x0018:
        r10.c = r11;
        r10.b = r12;
        r10.d = r13;
        if (r14 == 0) goto L_0x002a;
    L_0x0020:
        r0 = r10.b;
        r1 = 2130838736; // 0x7f0204d0 float:1.7282463E38 double:1.0527742163E-314;
        r0.setImageResource(r1);
        if (r3 == 0) goto L_0x0032;
    L_0x002a:
        r0 = r10.b;
        r1 = 2130838733; // 0x7f0204cd float:1.7282457E38 double:1.052774215E-314;
        r0.setImageResource(r1);
    L_0x0032:
        r4 = com.whatsapp.am1.a();
        r0 = 0;
        r5 = r11.getHeight();
        r1 = 2;
        r1 = new int[r1];
        r11.getLocationOnScreen(r1);
        r2 = 1;
        r1 = r1[r2];
        r1 = r1 + r5;
        r0 = r0 + r1;
        r1 = r10.h;
        r1 = r1.getWindowManager();
        r6 = r1.getDefaultDisplay();
        r7 = r6.getWidth();
        r1 = r6.getHeight();
        r1 = r1 - r0;
        r1 = (float) r1;
        r2 = 1124073472; // 0x43000000 float:128.0 double:5.55366086E-315;
        r8 = r4.g;
        r2 = r2 * r8;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 >= 0) goto L_0x00de;
    L_0x0063:
        r1 = 1;
        r2 = r1;
    L_0x0065:
        if (r2 == 0) goto L_0x007d;
    L_0x0067:
        r1 = 1131413504; // 0x43700000 float:240.0 double:5.589925436E-315;
        r8 = r4.g;
        r1 = r1 * r8;
        r8 = r6.getHeight();
        r8 = (float) r8;
        r1 = java.lang.Math.min(r1, r8);
        r1 = (int) r1;
        r10.setHeight(r1);
        r5 = r5 + r1;
        r0 = r0 - r5;
        if (r3 == 0) goto L_0x0088;
    L_0x007d:
        r1 = r6.getHeight();
        r1 = r1 - r0;
        r10.setHeight(r1);
        r10.a(r1);
    L_0x0088:
        r9 = r1;
        r1 = r0;
        r0 = r9;
        r10.setWidth(r7);
        r3 = r10.c;
        r3 = r3.getViewTreeObserver();
        if (r3 == 0) goto L_0x009b;
    L_0x0096:
        r5 = r10.a;
        r3.addOnGlobalLayoutListener(r5);
    L_0x009b:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = z;
        r6 = 2;
        r5 = r5[r6];
        r3 = r3.append(r5);
        r2 = r3.append(r2);
        r3 = z;
        r5 = 0;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r3 = z;
        r5 = 1;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = 51;
        r2 = 0;
        r10.showAtLocation(r11, r0, r2, r1);
        r0 = r10.e;
        r1 = r4.B;
        r1 = r7 / r1;
        r0.a(r1);
        return;
    L_0x00de:
        r1 = 0;
        r2 = r1;
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ee.a(android.view.View, android.widget.ImageButton, android.widget.ImageButton, boolean):void");
    }

    static View a(ee eeVar) {
        return eeVar.c;
    }

    static ImageButton b(ee eeVar) {
        return eeVar.b;
    }

    private void a(int i) {
        String str;
        if (this.h.getResources().getConfiguration().orientation == 2) {
            str = z[3];
        } else {
            str = z[5];
        }
        App.p.getSharedPreferences(z[4], 0).edit().putInt(str, i).commit();
    }

    public void dismiss() {
        if (this.c != null) {
            this.c.getViewTreeObserver().removeGlobalOnLayoutListener(this.a);
        }
        if (this.b != null) {
            this.b.setImageResource(R.drawable.emoji_btn);
        }
        super.dismiss();
    }

    public int a() {
        String str;
        if (this.h.getResources().getConfiguration().orientation == 2) {
            str = z[6];
        } else {
            str = z[8];
        }
        return App.p.getSharedPreferences(z[7], 0).getInt(str, 0);
    }

    static void a(ee eeVar, int i) {
        eeVar.a(i);
    }

    static Activity d(ee eeVar) {
        return eeVar.h;
    }

    public ee(Activity activity) {
        super(activity);
        this.a = new h6(this);
        this.h = activity;
    }

    static ImageButton c(ee eeVar) {
        return eeVar.d;
    }

    public void a(Configuration configuration) {
        if (this.e != null) {
            am1 a = am1.a();
            this.e.a(this.h.getWindowManager().getDefaultDisplay().getWidth() / a.B);
        }
    }
}
