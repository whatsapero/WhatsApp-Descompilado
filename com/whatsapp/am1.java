package com.whatsapp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class am1 {
    private static am1 A;
    private static Boolean E;
    private static Typeface H;
    private static final String[] I;
    private static Typeface n;
    private static Typeface r;
    private static Typeface z;
    public final int B;
    public final float C;
    public final float D;
    public final int F;
    public final int G;
    public final int a;
    public final int b;
    public final float c;
    public final int d;
    public final float e;
    public final int f;
    public final float g;
    public final int h;
    public final float i;
    public final float j;
    public final int k;
    public final int l;
    public final int m;
    public final float o;
    public final float p;
    public final int q;
    public final int s;
    public final float t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final float y;

    public float a(float f) {
        try {
            if (this.g >= 1.5f) {
                return 0.55f * f;
            }
            try {
                if (this.g >= 1.0f) {
                    return f * 0.56f;
                }
                try {
                    return this.g >= 0.75f ? 0.54f * f : f * 0.56f;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.widget.EditText r4) {
        /*
        r3_this = this;
        r0 = com.whatsapp.App.az;
        r1 = r3.g;	 Catch:{ IllegalStateException -> 0x0023 }
        r2 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 < 0) goto L_0x0010;
    L_0x000a:
        r1 = 6;
        r4.setMaxLines(r1);	 Catch:{ IllegalStateException -> 0x0025 }
        if (r0 == 0) goto L_0x0022;
    L_0x0010:
        r1 = r3.g;	 Catch:{ IllegalStateException -> 0x0027 }
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 < 0) goto L_0x001e;
    L_0x0018:
        r1 = 5;
        r4.setMaxLines(r1);	 Catch:{ IllegalStateException -> 0x0029 }
        if (r0 == 0) goto L_0x0022;
    L_0x001e:
        r0 = 4;
        r4.setMaxLines(r0);	 Catch:{ IllegalStateException -> 0x0029 }
    L_0x0022:
        return;
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.am1.a(android.widget.EditText):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.widget.TextView r6) {
        /*
        r0 = 1;
        r1 = 0;
        r2 = com.whatsapp.App.az;
        r3 = E;	 Catch:{ IllegalStateException -> 0x0067 }
        if (r3 != 0) goto L_0x000b;
    L_0x0008:
        d();	 Catch:{ IllegalStateException -> 0x0067 }
    L_0x000b:
        r3 = E;	 Catch:{ IllegalStateException -> 0x0069 }
        r3 = r3.booleanValue();	 Catch:{ IllegalStateException -> 0x0069 }
        if (r3 == 0) goto L_0x0043;
    L_0x0013:
        r3 = r;	 Catch:{ IllegalStateException -> 0x006b }
        if (r3 != 0) goto L_0x003c;
    L_0x0017:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x006d }
        r4 = 21;
        if (r3 < r4) goto L_0x002b;
    L_0x001d:
        r3 = I;	 Catch:{ IllegalStateException -> 0x006f }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x006f }
        r4 = 0;
        r3 = android.graphics.Typeface.create(r3, r4);	 Catch:{ IllegalStateException -> 0x006f }
        r = r3;	 Catch:{ IllegalStateException -> 0x006f }
        if (r2 == 0) goto L_0x003c;
    L_0x002b:
        r3 = com.whatsapp.App.p;	 Catch:{ IllegalStateException -> 0x006f }
        r3 = r3.getAssets();	 Catch:{ IllegalStateException -> 0x006f }
        r4 = I;	 Catch:{ IllegalStateException -> 0x006f }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x006f }
        r3 = android.graphics.Typeface.createFromAsset(r3, r4);	 Catch:{ IllegalStateException -> 0x006f }
        r = r3;	 Catch:{ IllegalStateException -> 0x006f }
    L_0x003c:
        r3 = r;	 Catch:{ IllegalStateException -> 0x0071 }
        r6.setTypeface(r3);	 Catch:{ IllegalStateException -> 0x0071 }
        if (r2 == 0) goto L_0x0066;
    L_0x0043:
        r2 = z;	 Catch:{ IllegalStateException -> 0x0073 }
        if (r2 != 0) goto L_0x0050;
    L_0x0047:
        r2 = android.graphics.Typeface.DEFAULT;	 Catch:{ IllegalStateException -> 0x0073 }
        r3 = 1;
        r2 = android.graphics.Typeface.create(r2, r3);	 Catch:{ IllegalStateException -> 0x0073 }
        z = r2;	 Catch:{ IllegalStateException -> 0x0073 }
    L_0x0050:
        r2 = z;	 Catch:{ IllegalStateException -> 0x0075 }
        r6.setTypeface(r2);	 Catch:{ IllegalStateException -> 0x0075 }
        r2 = r6.getPaint();	 Catch:{ IllegalStateException -> 0x0075 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0075 }
        r3 = r3.getStyle();	 Catch:{ IllegalStateException -> 0x0075 }
        r3 = r3 & 1;
        if (r3 != 0) goto L_0x0077;
    L_0x0063:
        r2.setFakeBoldText(r0);
    L_0x0066:
        return;
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = r1;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.am1.a(android.widget.TextView):void");
    }

    public int b() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            ((WindowManager) App.p.getSystemService(I[1])).getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.densityDpi >= 320) {
                return (int) (displayMetrics.density * 25.0f);
            }
            try {
                if (displayMetrics.densityDpi >= 240) {
                    return 38;
                }
                try {
                    return displayMetrics.densityDpi >= 160 ? 25 : 19;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static {
        String[] strArr = new String[7];
        String str = "/U|&\f\r&\rt";
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
                        i3 = 110;
                        break;
                    case ay.f /*1*/:
                        i3 = 23;
                        break;
                    case ay.n /*2*/:
                        i3 = 63;
                        break;
                    case ay.p /*3*/:
                        i3 = 71;
                        break;
                    default:
                        i3 = 110;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u001dvQ4C\u001drM.\bCzZ#\u0007\u001bz";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\bxQ3\u001dAEP%\u0001\u001ax\u0012\n\u000b\n~J*@\u001acY";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u001dt^+\u000b\u001c7L/\u0001\u001b{[g\u0001\u0000{Fg\f\u000b7V)\u0007\u001a~^+\u0007\u0014r[g\u0001\u0000tZ";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\bxQ3\u001dAEP%\u0001\u001ax\u0012\u000b\u0007\t\u007fKi\u001a\u001aq";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001dvQ4C\u001drM.\bC{V \u0006\u001a";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    I = strArr3;
                    A = null;
                    E = null;
                    H = null;
                    r = null;
                    n = null;
                    z = null;
                default:
                    strArr2[i] = str;
                    str = "\u0019~Q#\u0001\u0019";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.widget.TextView r5) {
        /*
        r4 = 0;
        r0 = com.whatsapp.App.az;
        r1 = E;	 Catch:{ IllegalStateException -> 0x005a }
        if (r1 != 0) goto L_0x000a;
    L_0x0007:
        d();	 Catch:{ IllegalStateException -> 0x005a }
    L_0x000a:
        r1 = E;	 Catch:{ IllegalStateException -> 0x005c }
        r1 = r1.booleanValue();	 Catch:{ IllegalStateException -> 0x005c }
        if (r1 == 0) goto L_0x0042;
    L_0x0012:
        r1 = H;	 Catch:{ IllegalStateException -> 0x005e }
        if (r1 != 0) goto L_0x003b;
    L_0x0016:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0060 }
        r2 = 21;
        if (r1 < r2) goto L_0x002a;
    L_0x001c:
        r1 = I;	 Catch:{ IllegalStateException -> 0x0062 }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0062 }
        r2 = 0;
        r1 = android.graphics.Typeface.create(r1, r2);	 Catch:{ IllegalStateException -> 0x0062 }
        H = r1;	 Catch:{ IllegalStateException -> 0x0062 }
        if (r0 == 0) goto L_0x003b;
    L_0x002a:
        r1 = com.whatsapp.App.p;	 Catch:{ IllegalStateException -> 0x0062 }
        r1 = r1.getAssets();	 Catch:{ IllegalStateException -> 0x0062 }
        r2 = I;	 Catch:{ IllegalStateException -> 0x0062 }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0062 }
        r1 = android.graphics.Typeface.createFromAsset(r1, r2);	 Catch:{ IllegalStateException -> 0x0062 }
        H = r1;	 Catch:{ IllegalStateException -> 0x0062 }
    L_0x003b:
        r1 = H;	 Catch:{ IllegalStateException -> 0x0064 }
        r5.setTypeface(r1);	 Catch:{ IllegalStateException -> 0x0064 }
        if (r0 == 0) goto L_0x0059;
    L_0x0042:
        r0 = n;	 Catch:{ IllegalStateException -> 0x0066 }
        if (r0 != 0) goto L_0x004d;
    L_0x0046:
        r0 = 0;
        r0 = android.graphics.Typeface.defaultFromStyle(r0);	 Catch:{ IllegalStateException -> 0x0066 }
        n = r0;	 Catch:{ IllegalStateException -> 0x0066 }
    L_0x004d:
        r0 = n;
        r5.setTypeface(r0);
        r0 = r5.getPaint();
        r0.setFakeBoldText(r4);
    L_0x0059:
        return;
    L_0x005a:
        r0 = move-exception;
        throw r0;
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.am1.b(android.widget.TextView):void");
    }

    public float b(float f) {
        try {
            if (this.g >= 1.5f) {
                return f * 0.59f;
            }
            try {
                if (this.g >= 1.0f) {
                    return f * 0.6f;
                }
                try {
                    return this.g >= 0.75f ? f * 0.6f : f;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private am1(Context context) {
        float f;
        this.F = Color.argb(255, 163, 213, 252);
        this.g = context.getResources().getDisplayMetrics().density;
        this.j = this.g * 3.3333333f;
        this.h = (int) (this.g * 2.6666667f);
        this.k = (int) ((1.2f * this.g) + 0.5f);
        this.v = (int) ((this.g * 2.0f) + 0.5f);
        this.m = 0;
        this.p = this.g * 2.0f;
        this.t = 8.666667f * this.g;
        this.B = (int) (43.333332f * this.g);
        this.f = (int) (43.333332f * this.g);
        this.G = (int) (12.0f * this.g);
        this.s = (int) (this.g * 2.0f);
        this.b = (int) (12.0f * this.g);
        if (this.g >= 1.5f) {
            f = 52.0f;
        } else {
            f = 42.0f;
        }
        this.C = f;
        this.y = (float) ((int) (4.0f * this.g));
        this.D = 15.333333f * this.g;
        this.i = 11.333333f * this.g;
        this.e = 1.0f * this.g;
        this.u = (int) (26.666666f * this.g);
        this.c = this.g * 2.0f;
        this.q = (int) (83.333336f * this.g);
        this.l = (int) (this.g * 1.3333334f);
        this.o = this.g * 3.3333333f;
        this.x = (int) (66.666664f * this.g);
        this.a = (int) (this.g * 2.6666667f);
        this.d = (int) (this.g * 1.3333334f);
        this.w = (int) (4.0f * this.g);
    }

    public boolean c() {
        try {
            if (this.g > 0.75f) {
                if (this.g < 1.5f) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d() {
        /*
        r0 = 1;
        r1 = 0;
        r3 = com.whatsapp.App.az;
        r2 = new android.text.TextPaint;
        r2.<init>();
        r4 = 1101004800; // 0x41a00000 float:20.0 double:5.439686476E-315;
        r2.setTextSize(r4);
        r4 = android.graphics.Typeface.DEFAULT;
        r2.setTypeface(r4);
        r4 = I;
        r4 = r4[r1];
        r4 = r2.measureText(r4);
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0052 }
        r5 = 21;
        if (r2 < r5) goto L_0x002a;
    L_0x0021:
        r2 = 1;
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ IllegalStateException -> 0x0054 }
        E = r2;	 Catch:{ IllegalStateException -> 0x0054 }
        if (r3 == 0) goto L_0x004b;
    L_0x002a:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0056 }
        r5 = 14;
        if (r2 < r5) goto L_0x003f;
    L_0x0030:
        r2 = 1121058816; // 0x42d20000 float:105.0 double:5.53876648E-315;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x005a;
    L_0x0036:
        r2 = r0;
    L_0x0037:
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ IllegalStateException -> 0x005c }
        E = r2;	 Catch:{ IllegalStateException -> 0x005c }
        if (r3 == 0) goto L_0x004b;
    L_0x003f:
        r2 = 1120534528; // 0x42ca0000 float:101.0 double:5.536176153E-315;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x0060;
    L_0x0045:
        r0 = java.lang.Boolean.valueOf(r0);
        E = r0;
    L_0x004b:
        r0 = E;
        r0 = r0.booleanValue();
        return r0;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r2 = r1;
        goto L_0x0037;
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        r0 = r1;
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.am1.d():boolean");
    }

    public float c(float f) {
        try {
            if (this.g >= 1.5f) {
                return f * 0.78f;
            }
            try {
                if (this.g >= 1.0f) {
                    return f * 0.8f;
                }
                try {
                    return this.g >= 0.75f ? f * 0.8f : f;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public static am1 a() {
        return A;
    }

    public static void a(Context context) {
        try {
            if (A != null) {
                throw new IllegalStateException(I[4]);
            }
            A = new am1(context);
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
