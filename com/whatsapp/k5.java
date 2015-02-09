package com.whatsapp;

import android.os.Handler;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class k5 extends Thread {
    private static final String[] z;
    private int a;
    final RegisterName b;
    private boolean c;
    private boolean d;
    private Handler e;

    static {
        String[] strArr = new String[23];
        String str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u000b;\"\u0013p\u001c!(\u0000n\u001d %\nu\u000b'>";
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
                        i3 = 77;
                        break;
                    case ay.f /*1*/:
                        i3 = 102;
                        break;
                    case ay.n /*2*/:
                        i3 = 28;
                        break;
                    case ay.p /*3*/:
                        i3 = 120;
                        break;
                    default:
                        i3 = 83;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u000b*#\u0005C\u0019??\u0003}\u001c*\u0012\u0003r\u001c6)";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u000b*#\u0005C\u0019??\u0003}\u001c*\u0012\u0003r\u001c6)";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u000b*#\u0005C\u0019??\u0003}\u001c*\u0012\u0003r\u001c6)";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u000b*#\u0005C\u0019??\u0003}\u001c*\u0012\u0003r\u001c6)";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u001e:#Ix\u0017=(";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u001e:#Ix\u0017=(";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u0011=$\u0012u\u0019?$\u001cy\n|>\u001fr\u001b|)\tr\u001ds?\u0003o\r?9[";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u001e:#Ix\u0017=(";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u001b<#\u0012}\u001b'>I\u007f\u0017&#\u0012<";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u000b*#\u00053\u001c6!\u0007e\u001d7";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u001e:#Ix\u0017=(";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u000b*#\u0005C\u0019??\u0003}\u001c*\u0012\u0015h\u0019!9\u0003x";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u000b*#\u0005C\u0019??\u0003}\u001c*\u0012\u0003r\u001c6)";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u000b69\u0005s\u0016=(\u0005h\u0011<#I}\u001b'$\u0010y";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u001e:#Ix\u0017=(";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u001e:#Ix\u0017=(";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "mN";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u000b*#\u0005C\u0019??\u0003}\u001c*\u0012\u0003r\u001c6)";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u001e:#Ix\u0017=(";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u000b*#\u0005C\u0019??\u0003}\u001c*\u0012\u0003r\u001c6)";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u001d!?\tn";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "?\u0003{\u0011 9\u0003n\u00162 \u00033\u001f6#Iy\n!\"\u0014";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a() {
        if (this.e != null) {
            this.e.removeMessages(0);
            this.e = null;
        }
    }

    static boolean c(k5 k5Var) {
        return k5Var.d;
    }

    public void a(Handler handler) {
        if (this.d) {
            handler.sendEmptyMessage(0);
        }
        this.e = handler;
    }

    static int a(k5 k5Var) {
        return k5Var.a;
    }

    public k5(RegisterName registerName, Handler handler) {
        this.b = registerName;
        this.d = false;
        this.c = false;
        this.a = 0;
        this.e = handler;
        start();
    }

    static boolean b(k5 k5Var) {
        return k5Var.c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r9_this = this;
        r1 = 0;
        r3 = 1;
        r4 = com.whatsapp.App.az;
        r0 = com.whatsapp.contact.i.a();	 Catch:{ Exception -> 0x00bd, InterruptedException -> 0x00bf }
        if (r0 != 0) goto L_0x0013;
    L_0x000a:
        r0 = z;	 Catch:{ Exception -> 0x00bd, InterruptedException -> 0x00bf }
        r2 = 13;
        r0 = r0[r2];	 Catch:{ Exception -> 0x00bd, InterruptedException -> 0x00bf }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x00bd, InterruptedException -> 0x00bf }
    L_0x0013:
        r0 = com.whatsapp.App.P;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r5 = r0.l();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = 1001; // 0x3e9 float:1.403E-42 double:4.946E-321;
        r0 = com.whatsapp.contact.m.BOTH;	 Catch:{ Exception -> 0x00e7, InterruptedException -> 0x00bf }
        r0 = com.whatsapp.contact.e.a(r0);	 Catch:{ Exception -> 0x00e7, InterruptedException -> 0x00bf }
        r0 = r0.intValue();	 Catch:{ Exception -> 0x00e7, InterruptedException -> 0x00bf }
        r2 = r0;
    L_0x0026:
        r6 = r9.b;	 Catch:{ Exception -> 0x0124, InterruptedException -> 0x00bf }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r2 > r0) goto L_0x014d;
    L_0x002c:
        r0 = r3;
    L_0x002d:
        com.whatsapp.App.b(r6, r0);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0.<init>();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r6 = z;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r7 = 10;
        r6 = r6[r7];	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = r0.append(r6);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = r0.append(r2);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = z;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r6 = 18;
        r2 = r2[r6];	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = r0.append(r2);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = r9.b;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = com.whatsapp.App.n(r2);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = r0.append(r2);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = ")";
        r0 = r0.append(r2);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = r0.toString();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = r9.b;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = r0.getApplicationContext();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        com.whatsapp.contact.i.b(r0);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = r9.b;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = r0.getApplicationContext();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = com.whatsapp.contact.c.REGISTRATION_FULL;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = com.whatsapp.contact.i.c(r0, r2);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2.<init>();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r6 = z;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r7 = 8;
        r6 = r6[r7];	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = r2.append(r6);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = r2.append(r0);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = r2.toString();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = com.whatsapp.contact.k.NETWORK_UNAVAILABLE;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        if (r0 != r2) goto L_0x0152;
    L_0x0097:
        r0 = 1;
        r9.a = r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r9.d = r3;
        r0 = z;
        r2 = 6;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r9.e;
        if (r0 == 0) goto L_0x00ad;
    L_0x00a8:
        r0 = r9.e;
        r0.sendEmptyMessage(r1);
    L_0x00ad:
        r0 = com.whatsapp.contact.i.b();	 Catch:{ Exception -> 0x0150 }
        if (r0 != 0) goto L_0x00bc;
    L_0x00b3:
        r0 = z;	 Catch:{ Exception -> 0x0150 }
        r1 = 19;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0150 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x0150 }
    L_0x00bc:
        return;
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
    L_0x00bf:
        r0 = move-exception;
        r0 = 1;
        r9.d = r0;	 Catch:{ Exception -> 0x02df }
        r0 = z;	 Catch:{ Exception -> 0x02df }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ Exception -> 0x02df }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x02df }
        r0 = r9.e;	 Catch:{ Exception -> 0x02df }
        if (r0 == 0) goto L_0x00d6;
    L_0x00d0:
        r0 = r9.e;	 Catch:{ Exception -> 0x02df }
        r1 = 0;
        r0.sendEmptyMessage(r1);	 Catch:{ Exception -> 0x02df }
    L_0x00d6:
        r0 = com.whatsapp.contact.i.b();	 Catch:{ Exception -> 0x00e5 }
        if (r0 != 0) goto L_0x00bc;
    L_0x00dc:
        r0 = z;	 Catch:{ Exception -> 0x00e5 }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ Exception -> 0x00e5 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x00e5 }
        goto L_0x00bc;
    L_0x00e5:
        r0 = move-exception;
        throw r0;
    L_0x00e7:
        r0 = move-exception;
        r6 = z;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r7 = 22;
        r6 = r6[r7];	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        com.whatsapp.util.Log.b(r6, r0);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        goto L_0x0026;
    L_0x00f3:
        r0 = move-exception;
        r2 = 3;
        r9.a = r2;	 Catch:{ all -> 0x0126 }
        r2 = z;	 Catch:{ all -> 0x0126 }
        r4 = 1;
        r2 = r2[r4];	 Catch:{ all -> 0x0126 }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ all -> 0x0126 }
        r9.d = r3;
        r0 = z;
        r2 = 20;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r9.e;
        if (r0 == 0) goto L_0x0113;
    L_0x010e:
        r0 = r9.e;
        r0.sendEmptyMessage(r1);
    L_0x0113:
        r0 = com.whatsapp.contact.i.b();	 Catch:{ Exception -> 0x0122 }
        if (r0 != 0) goto L_0x00bc;
    L_0x0119:
        r0 = z;	 Catch:{ Exception -> 0x0122 }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0122 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x0122 }
        goto L_0x00bc;
    L_0x0122:
        r0 = move-exception;
        throw r0;
    L_0x0124:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
    L_0x0126:
        r0 = move-exception;
        r1 = 1;
        r9.d = r1;	 Catch:{ Exception -> 0x02e1 }
        r1 = z;	 Catch:{ Exception -> 0x02e1 }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ Exception -> 0x02e1 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x02e1 }
        r1 = r9.e;	 Catch:{ Exception -> 0x02e1 }
        if (r1 == 0) goto L_0x013d;
    L_0x0137:
        r1 = r9.e;	 Catch:{ Exception -> 0x02e1 }
        r2 = 0;
        r1.sendEmptyMessage(r2);	 Catch:{ Exception -> 0x02e1 }
    L_0x013d:
        r1 = com.whatsapp.contact.i.b();	 Catch:{ Exception -> 0x02e3 }
        if (r1 != 0) goto L_0x014c;
    L_0x0143:
        r1 = z;	 Catch:{ Exception -> 0x02e3 }
        r2 = 21;
        r1 = r1[r2];	 Catch:{ Exception -> 0x02e3 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ Exception -> 0x02e3 }
    L_0x014c:
        throw r0;
    L_0x014d:
        r0 = r1;
        goto L_0x002d;
    L_0x0150:
        r0 = move-exception;
        throw r0;
    L_0x0152:
        r2 = com.whatsapp.contact.k.FAILED;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        if (r0 != r2) goto L_0x017f;
    L_0x0156:
        r0 = 3;
        r9.a = r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r9.d = r3;
        r0 = z;
        r2 = 9;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r9.e;
        if (r0 == 0) goto L_0x016d;
    L_0x0168:
        r0 = r9.e;
        r0.sendEmptyMessage(r1);
    L_0x016d:
        r0 = com.whatsapp.contact.i.b();	 Catch:{ Exception -> 0x017d }
        if (r0 != 0) goto L_0x00bc;
    L_0x0173:
        r0 = z;	 Catch:{ Exception -> 0x017d }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ Exception -> 0x017d }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x017d }
        goto L_0x00bc;
    L_0x017d:
        r0 = move-exception;
        throw r0;
    L_0x017f:
        r2 = com.whatsapp.contact.k.DELAYED;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        if (r0 != r2) goto L_0x01b5;
    L_0x0183:
        r0 = z;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = 11;
        r0 = r0[r2];	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = 3;
        r9.a = r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r9.d = r3;
        r0 = z;
        r2 = 16;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r9.e;
        if (r0 == 0) goto L_0x01a3;
    L_0x019e:
        r0 = r9.e;
        r0.sendEmptyMessage(r1);
    L_0x01a3:
        r0 = com.whatsapp.contact.i.b();	 Catch:{ Exception -> 0x01b3 }
        if (r0 != 0) goto L_0x00bc;
    L_0x01a9:
        r0 = z;	 Catch:{ Exception -> 0x01b3 }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ Exception -> 0x01b3 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x01b3 }
        goto L_0x00bc;
    L_0x01b3:
        r0 = move-exception;
        throw r0;
    L_0x01b5:
        r2 = com.whatsapp.contact.k.USER_IS_EXPIRED;	 Catch:{ Exception -> 0x02ca, InterruptedException -> 0x00bf }
        if (r0 == r2) goto L_0x01cd;
    L_0x01b9:
        r2 = com.whatsapp.App.a0;	 Catch:{ Exception -> 0x02ca, InterruptedException -> 0x00bf }
        r6 = 1;
        r2.b(r6);	 Catch:{ Exception -> 0x02ca, InterruptedException -> 0x00bf }
        r2 = com.whatsapp.App.p;	 Catch:{ Exception -> 0x02ca, InterruptedException -> 0x00bf }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x02ca, InterruptedException -> 0x00bf }
        r2.d(r6);	 Catch:{ Exception -> 0x02ca, InterruptedException -> 0x00bf }
        r2 = r9.b;	 Catch:{ Exception -> 0x02ca, InterruptedException -> 0x00bf }
        com.whatsapp.accountsync.PerformSyncManager.c(r2);	 Catch:{ Exception -> 0x02ca, InterruptedException -> 0x00bf }
    L_0x01cd:
        r2 = z;	 Catch:{ Exception -> 0x02cc, InterruptedException -> 0x00bf }
        r6 = 15;
        r2 = r2[r6];	 Catch:{ Exception -> 0x02cc, InterruptedException -> 0x00bf }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x02cc, InterruptedException -> 0x00bf }
        r2 = 1;
        com.whatsapp.App.d(r2);	 Catch:{ Exception -> 0x02cc, InterruptedException -> 0x00bf }
        r2 = com.whatsapp.contact.k.USER_IS_EXPIRED;	 Catch:{ Exception -> 0x02cc, InterruptedException -> 0x00bf }
        if (r0 == r2) goto L_0x01e3;
    L_0x01de:
        r2 = r9.b;	 Catch:{ Exception -> 0x02cc, InterruptedException -> 0x00bf }
        com.whatsapp.accountsync.PerformSyncManager.a(r2);	 Catch:{ Exception -> 0x02cc, InterruptedException -> 0x00bf }
    L_0x01e3:
        r2 = com.whatsapp.contact.k.USER_IS_EXPIRED;	 Catch:{ Exception -> 0x02ce, InterruptedException -> 0x00bf }
        if (r0 != r2) goto L_0x02d0;
    L_0x01e7:
        r0 = r3;
    L_0x01e8:
        r2 = new com.whatsapp.ak5;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2.<init>(r9, r0);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r6 = 1;
        r2.setPriority(r6);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2.start();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2.join();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = z;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r6 = 0;
        r2 = r2[r6];	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = com.whatsapp.App.p;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r6 = 1;
        com.whatsapp.App.a(r2, r6);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        if (r0 != 0) goto L_0x029b;
    L_0x0207:
        com.whatsapp.App.ae();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        com.whatsapp.App.aw();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = com.whatsapp.App.P;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = r0.f();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r6 = r0.iterator();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = r1;
    L_0x0218:
        r0 = r6.hasNext();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        if (r0 == 0) goto L_0x0239;
    L_0x021e:
        r0 = r6.next();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = (com.whatsapp.m8) r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r7 = r0.q;	 Catch:{ Exception -> 0x02d3, InterruptedException -> 0x00bf }
        if (r7 == 0) goto L_0x02e8;
    L_0x0228:
        r0 = r0.e;	 Catch:{ Exception -> 0x02d3, InterruptedException -> 0x00bf }
        r7 = 0;
        r8 = 2;
        com.whatsapp.App.a(r0, r7, r8);	 Catch:{ Exception -> 0x02d3, InterruptedException -> 0x00bf }
        r0 = r2 + 1;
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        if (r0 <= r2) goto L_0x0237;
    L_0x0235:
        if (r4 == 0) goto L_0x0239;
    L_0x0237:
        if (r4 == 0) goto L_0x02e5;
    L_0x0239:
        r0 = com.whatsapp.App.P;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = r0.h();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = r0.iterator();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
    L_0x0243:
        r0 = r2.hasNext();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        if (r0 == 0) goto L_0x025e;
    L_0x0249:
        r0 = r2.next();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = (com.whatsapp.m8) r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r6 = r0.b();	 Catch:{ Exception -> 0x02d9, InterruptedException -> 0x00bf }
        if (r6 != 0) goto L_0x025c;
    L_0x0255:
        r0 = r0.e;	 Catch:{ Exception -> 0x02d9, InterruptedException -> 0x00bf }
        r6 = 0;
        r7 = 2;
        com.whatsapp.App.a(r0, r6, r7);	 Catch:{ Exception -> 0x02d9, InterruptedException -> 0x00bf }
    L_0x025c:
        if (r4 == 0) goto L_0x0243;
    L_0x025e:
        r0 = r9.b;	 Catch:{ Exception -> 0x02db, InterruptedException -> 0x00bf }
        r0 = com.whatsapp.RegisterName.c(r0);	 Catch:{ Exception -> 0x02db, InterruptedException -> 0x00bf }
        r0 = r0.M;	 Catch:{ Exception -> 0x02db, InterruptedException -> 0x00bf }
        if (r0 != 0) goto L_0x0275;
    L_0x0268:
        r0 = r9.b;	 Catch:{ Exception -> 0x02db, InterruptedException -> 0x00bf }
        r0 = com.whatsapp.RegisterName.c(r0);	 Catch:{ Exception -> 0x02db, InterruptedException -> 0x00bf }
        r0 = r0.e;	 Catch:{ Exception -> 0x02db, InterruptedException -> 0x00bf }
        r2 = 0;
        r6 = 1;
        com.whatsapp.App.a(r0, r2, r6);	 Catch:{ Exception -> 0x02db, InterruptedException -> 0x00bf }
    L_0x0275:
        r0 = r1;
    L_0x0276:
        r2 = com.whatsapp.App.N;	 Catch:{ Exception -> 0x02dd, InterruptedException -> 0x00bf }
        r2 = r2.a();	 Catch:{ Exception -> 0x02dd, InterruptedException -> 0x00bf }
        if (r2 != 0) goto L_0x0290;
    L_0x027e:
        r2 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        if (r0 >= r2) goto L_0x0290;
    L_0x0282:
        r0 = r0 + 200;
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        java.lang.Thread.sleep(r6);	 Catch:{ InterruptedException -> 0x028a, Exception -> 0x00f3 }
        goto L_0x0276;
    L_0x028a:
        r2 = move-exception;
        r2.printStackTrace();	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        if (r4 == 0) goto L_0x0276;
    L_0x0290:
        r0 = com.whatsapp.App.a0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0.a(r5);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = com.whatsapp.App.aH;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = 1;
        r0.sendEmptyMessage(r2);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
    L_0x029b:
        r0 = 1;
        r9.c = r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r0 = r9.b;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r2 = 3;
        com.whatsapp.App.d(r0, r2);	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
        r9.d = r3;
        r0 = z;
        r2 = 7;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r9.e;
        if (r0 == 0) goto L_0x02b7;
    L_0x02b2:
        r0 = r9.e;
        r0.sendEmptyMessage(r1);
    L_0x02b7:
        r0 = com.whatsapp.contact.i.b();	 Catch:{ Exception -> 0x02c8 }
        if (r0 != 0) goto L_0x00bc;
    L_0x02bd:
        r0 = z;	 Catch:{ Exception -> 0x02c8 }
        r1 = 14;
        r0 = r0[r1];	 Catch:{ Exception -> 0x02c8 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x02c8 }
        goto L_0x00bc;
    L_0x02c8:
        r0 = move-exception;
        throw r0;
    L_0x02ca:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
    L_0x02cc:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
    L_0x02ce:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
    L_0x02d0:
        r0 = r1;
        goto L_0x01e8;
    L_0x02d3:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x02d5, InterruptedException -> 0x00bf }
    L_0x02d5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x02d7, InterruptedException -> 0x00bf }
    L_0x02d7:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
    L_0x02d9:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
    L_0x02db:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
    L_0x02dd:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00bf, Exception -> 0x00f3 }
    L_0x02df:
        r0 = move-exception;
        throw r0;
    L_0x02e1:
        r0 = move-exception;
        throw r0;
    L_0x02e3:
        r0 = move-exception;
        throw r0;
    L_0x02e5:
        r2 = r0;
        goto L_0x0218;
    L_0x02e8:
        r0 = r2;
        goto L_0x0237;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.k5.run():void");
    }
}
