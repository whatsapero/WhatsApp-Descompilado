package com.whatsapp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.SoundPool;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import android.widget.Toast;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class dz {
    private static int a;
    private static SoundPool f;
    private static int l;
    private static int n;
    private static Boolean q;
    private static final String[] z;
    private WakeLock b;
    private Activity c;
    private int d;
    private ho e;
    private OnAudioFocusChangeListener g;
    private int h;
    private TextView i;
    private Toast j;
    private long k;
    private ant m;
    private int o;
    private Runnable p;
    private float r;
    private long s;
    private avr t;
    private Handler u;
    private String v;

    static {
        String[] strArr = new String[19];
        String str = "\fi\n\u0016M";
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
                        i3 = 109;
                        break;
                    case ay.f /*1*/:
                        i3 = 28;
                        break;
                    case ay.n /*2*/:
                        i3 = 110;
                        break;
                    case ay.p /*3*/:
                        i3 = 127;
                        break;
                    default:
                        i3 = 34;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u001bs\u0007\u001cG\u0003s\u001a\u001a\r\u001eh\u0001\u000fT\u0002u\r\u001aL\u0002h\u000b_F\u0018n\u000f\u000bK\u0002rT";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u001bs\u0007\u001cG\u0003s\u001a\u001a\r\u001eh\u0001\u000fT\u0002u\r\u001aL\u0002h\u000b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u001bs\u0007\u001cG\u0003s\u001a\u001a\r\u001eh\u0001\u000fT\u0002u\r\u001aL\u0002h\u000bPP\bp\u000b\u001eQ\b";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001bs\u0007\u001cG\u0003s\u001a\u001a\r\u001eh\u0001\u000fT\u0002u\r\u001aL\u0002h\u000b_";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0005}\u001e\u000bK\u000eC\b\u001aG\t~\u000f\u001cI2y\u0000\u001e@\u0001y\n";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001bs\u0007\u001cG\u0003s\u001a\u001a\r\u001eh\u0001\u000fT\u0002u\r\u001aL\u0002h\u000bPQ\u0019s\u001e_";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001bs\u0007\u001cG\u0003s\u001a\u001a\r\u001eh\u0001\u000fT\u0002u\r\u001aL\u0002h\u000bPQ\u0019s\u001e_";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001bu\f\rC\u0019s\u001c";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u001bs\u0007\u001cG\u0003s\u001a\u001a";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001ds\u0019\u001aP";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0000s\u001b\u0011V\bx";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001bu\f\rC\u0019s\u001c";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u001bs\u0007\u001cG\u0003s\u001a\u001a\r\u001eh\u000f\rV\u001bs\u0007\u001cG\u0003s\u001a\u001a\r\u0004r\u001e\rM\nn\u000b\fQ";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u001bs\u0007\u001cG\u0003s\u001a\u001a\r\u001eh\u000f\rV\u001bs\u0007\u001cG\u0003s\u001a\u001a";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u001bs\u0007\u001cG\u0003s\u001a\u001a\r\u001eh\u000f\rV\u001bs\u0007\u001cG\u0003s\u001a\u001a";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\fi\n\u0016MBs\t\u0018\u0019M\u007f\u0001\u001bG\u000eoS\u0010R\u0018o";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0005}\u001e\u000bK\u000eC\b\u001aG\t~\u000f\u001cI2y\u0000\u001e@\u0001y\n";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\fi\n\u0016M";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void b(boolean r1) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: com.whatsapp.dz.b(boolean):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:113)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:223)
	at jadx.core.ProcessClass.process(ProcessClass.java:20)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
Caused by: java.lang.NullPointerException
*/
        /*
        r0_this = this;
        r9 = com.whatsapp.App.az;
        r12.f();
        r0 = r12.m;
        if (r0 == 0) goto L_0x000d;
        r0 = r12.v;
        if (r0 != 0) goto L_0x0012;
        return;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r13);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r12.v;
        com.whatsapp.App.h(r0);
        r0 = r12.c;
        r1 = 2131427657; // 0x7f0b0149 float:1.8476936E38 double:1.053065182E-314;
        r0 = r0.findViewById(r1);
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r12.c;
        r1 = 2131427690; // 0x7f0b016a float:1.8477003E38 double:1.053065198E-314;
        r10 = r0.findViewById(r1);
        r0 = 8;
        r10.setVisibility(r0);
        r0 = new android.view.animation.TranslateAnimation;
        r1 = 1;
        r2 = 0;
        r3 = 1;
        r4 = com.whatsapp.App.as();
        if (r4 == 0) goto L_0x0299;
        r4 = 1;
        r4 = (float) r4;
        r5 = 1;
        r6 = 0;
        r7 = 1;
        r8 = 0;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r2 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r0.setDuration(r2);
        r10.startAnimation(r0);
        r0 = r12.c;
        r1 = 2131427683; // 0x7f0b0163 float:1.847699E38 double:1.053065195E-314;
        r10 = r0.findViewById(r1);
        r0 = new android.view.animation.TranslateAnimation;
        r1 = 1;
        r2 = com.whatsapp.App.as();
        if (r2 == 0) goto L_0x029e;
        r2 = -1;
        r2 = (float) r2;
        r3 = 1;
        r4 = 0;
        r5 = 1;
        r6 = 0;
        r7 = 1;
        r8 = 0;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r2 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r0.setDuration(r2);
        r10.startAnimation(r0);
        r0 = r12.c;
        r1 = 2131427692; // 0x7f0b016c float:1.8477007E38 double:1.053065199E-314;
        r0 = r0.findViewById(r1);
        r0.clearAnimation();
        r0 = (android.widget.ImageView) r0;
        r0 = r0.getDrawable();
        r1 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0.setAlpha(r1);
        r0 = r12.c;
        r1 = 2131427696; // 0x7f0b0170 float:1.8477016E38 double:1.053065201E-314;
        r0 = r0.findViewById(r1);
        r0.clearAnimation();
        r0 = java.lang.System.currentTimeMillis();
        r2 = r12.k;
        r10 = r0 - r2;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r10);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r13 != 0) goto L_0x00dc;
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x00dc;
        r12.c();
        r0 = r12.m;
        r7 = r0.b();
        r0 = r12.m;
        r0.f();
        r0 = r12.m;
        r0.a();
        r0 = 0;
        r12.m = r0;
        r0 = r12.c;
        r1 = -1;
        r0.setRequestedOrientation(r1);
        r12.d();
        r0 = r12.b;
        r0 = r0.isHeld();
        if (r0 == 0) goto L_0x0105;
        r0 = r12.b;
        r0.release();
        r0 = r12.c;
        r0 = r0.getContentResolver();
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r0 = android.provider.Settings.System.getInt(r0, r1);
        if (r0 == 0) goto L_0x0129;
        r0 = r12.c;
        r1 = z;
        r2 = 9;
        r1 = r1[r2];
        r0 = r0.getSystemService(r1);
        r0 = (android.os.Vibrator) r0;
        r2 = 75;
        r0.vibrate(r2);
        if (r13 == 0) goto L_0x0259;
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x017f;
        r0 = 50;
        java.lang.Thread.sleep(r0);
        r0 = f;
        r1 = l;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 0;
        r5 = 0;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.play(r1, r2, r3, r4, r5, r6);
        r0 = r12.c;
        r1 = com.whatsapp.fieldstats.at.SENT;
        r2 = r7.length();
        com.whatsapp.ak4.a(r0, r1, r2);
        r0 = 0;
        r12.o = r0;
        r0 = r12.t;
        if (r0 == 0) goto L_0x016f;
        r0 = r12.t;
        r0 = r0.g();
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r10 / r2;
        r1 = (int) r2;
        r0.p = r1;
        r0 = r12.t;
        r1 = 1;
        r0.b(r1);
        r0 = 0;
        r12.t = r0;
        if (r9 == 0) goto L_0x0280;
        r0 = com.whatsapp.App.p;
        r1 = r12.v;
        r3 = 2;
        r4 = 1;
        r5 = 1;
        r2 = r7;
        com.whatsapp.util.f.a(r0, r1, r2, r3, r4, r5);
        r7.delete();
        if (r9 == 0) goto L_0x0280;
        r0 = r12.t;
        if (r0 == 0) goto L_0x018c;
        r0 = r12.t;
        r1 = 0;
        r0.b(r1);
        r0 = 0;
        r12.t = r0;
        r0 = f;
        r1 = a;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 0;
        r5 = 0;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.play(r1, r2, r3, r4, r5, r6);
        r0 = r12.c;
        r1 = com.whatsapp.fieldstats.at.TOO_SHORT;
        r2 = r7.length();
        com.whatsapp.ak4.a(r0, r1, r2);
        r7.delete();
        r0 = new android.widget.TextView;
        r1 = r12.c;
        r0.<init>(r1);
        r1 = r12.o;
        r1 = r1 + 1;
        r12.o = r1;
        r1 = 2131624024; // 0x7f0e0058 float:1.8875216E38 double:1.0531622E-314;
        r0.setText(r1);
        r1 = -1;
        r0.setTextColor(r1);
        r1 = new com.whatsapp.util.bd;
        r2 = r12.c;
        r2 = r2.getResources();
        r3 = 2130839037; // 0x7f0205fd float:1.7283073E38 double:1.052774365E-314;
        r2 = r2.getDrawable(r3);
        r1.<init>(r2);
        r0.setBackgroundDrawable(r1);
        r1 = 2;
        r1 = new int[r1];
        r2 = r12.c;
        r3 = 2131427685; // 0x7f0b0165 float:1.8476993E38 double:1.053065196E-314;
        r2 = r2.findViewById(r3);
        r2.getLocationOnScreen(r1);
        r3 = r12.c;
        r3 = r3.getWindow();
        r3 = r3.getDecorView();
        r3 = r3.getHeight();
        r4 = 1;
        r4 = r1[r4];
        r3 = r3 - r4;
        r4 = java.lang.System.currentTimeMillis();
        r10 = r12.s;
        r4 = r4 - r10;
        r10 = 3500; // 0xdac float:4.905E-42 double:1.729E-320;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 <= 0) goto L_0x0257;
        r4 = java.lang.System.currentTimeMillis();
        r12.s = r4;
        r4 = new android.widget.Toast;
        r5 = r12.c;
        r5 = r5.getApplicationContext();
        r4.<init>(r5);
        r12.j = r4;
        r4 = com.whatsapp.App.as();
        if (r4 == 0) goto L_0x023d;
        r4 = r12.c;
        r4 = r4.getWindow();
        r4 = r4.getDecorView();
        r4 = r4.getWidth();
        r5 = 0;
        r5 = r1[r5];
        r4 = r4 - r5;
        r2 = r2.getWidth();
        r2 = r4 - r2;
        r4 = r12.j;
        r5 = 85;
        r4.setGravity(r5, r2, r3);
        if (r9 == 0) goto L_0x0247;
        r2 = 0;
        r1 = r1[r2];
        r2 = r12.j;
        r4 = 83;
        r2.setGravity(r4, r1, r3);
        r1 = r12.j;
        r2 = 1;
        r1.setDuration(r2);
        r1 = r12.j;
        r1.setView(r0);
        r0 = r12.j;
        r0.show();
        if (r9 == 0) goto L_0x0280;
        r0 = r12.t;
        if (r0 == 0) goto L_0x0266;
        r0 = r12.t;
        r1 = 0;
        r0.b(r1);
        r0 = 0;
        r12.t = r0;
        if (r7 == 0) goto L_0x0280;
        r0 = r7.length();
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x027d;
        r0 = r12.c;
        r1 = com.whatsapp.fieldstats.at.CANCELLED;
        r2 = r7.length();
        com.whatsapp.ak4.a(r0, r1, r2);
        r7.delete();
        r0 = r12.d;
        if (r0 == 0) goto L_0x000d;
        r0 = r12.d;
        r1 = r12.i;
        r2 = new com.whatsapp.pc;
        r2.<init>(r12, r0);
        r4 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r1.postDelayed(r2, r4);
        r0 = 0;
        r12.d = r0;
        goto L_0x000d;
        r0 = move-exception;
        throw r0;
        r4 = -1;
        goto L_0x0058;
        r0 = move-exception;
        throw r0;
        r2 = 1;
        goto L_0x007b;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        if (r13 == 0) goto L_0x02b8;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r1 < 0) goto L_0x02b8;
        r1 = z;
        r2 = 7;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        if (r9 == 0) goto L_0x00e7;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x00e7;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x00ec;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x0129;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0136;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        goto L_0x017a;
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        goto L_0x017a;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dz.b(boolean):void");
    }

    public dz(Activity activity, ho hoVar) {
        int i;
        this.u = new hp(this);
        this.p = new n1(this);
        this.c = activity;
        this.e = hoVar;
        this.i = (TextView) this.c.findViewById(R.id.voice_note_info);
        this.b = ((PowerManager) activity.getSystemService(z[11])).newWakeLock(6, z[10]);
        if (f == null) {
            f = new SoundPool(1, 1, 0);
            n = f.load(App.p, R.raw.voice_note_start, 0);
            l = f.load(App.p, R.raw.voice_note_stop, 0);
            a = f.load(App.p, R.raw.voice_note_error, 0);
        }
        TextView textView = (TextView) this.c.findViewById(R.id.entry);
        View findViewById = this.c.findViewById(R.id.voice_note_btn);
        TextView textView2 = (TextView) this.c.findViewById(R.id.voice_note_slide_to_cancel);
        float f = am1.a().g;
        float f2 = am1.a().g;
        if (f >= 2.0f) {
            i = 40;
        } else {
            i = 16;
        }
        int i2 = (int) (((float) i) * f2);
        findViewById.setOnTouchListener(new z_(this, textView, textView2, i2, findViewById));
        View findViewById2 = this.c.findViewById(R.id.voice_note_slide_to_cancel_scroller);
        findViewById2.getViewTreeObserver().addOnPreDrawListener(new asb(this, findViewById2, i2, textView2));
        ((ViewGroup) this.c.findViewById(R.id.voice_recorder_decor)).addView(new VoiceNoteRecordingUi$4(this, this.c), -1, -1);
    }

    static avr e(dz dzVar) {
        return dzVar.t;
    }

    public boolean i() {
        return this.m != null;
    }

    static avr a(dz dzVar, avr com_whatsapp_avr) {
        dzVar.t = com_whatsapp_avr;
        return com_whatsapp_avr;
    }

    static String a(dz dzVar) {
        return dzVar.v;
    }

    public void a() {
    }

    public void a(int i) {
        this.d = i;
    }

    static int f(dz dzVar) {
        return dzVar.h;
    }

    public static Animation a(boolean z) {
        Animation alphaAnimation;
        Animation animationSet = new AnimationSet(true);
        if (z) {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        } else {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        alphaAnimation.setDuration(150);
        animationSet.addAnimation(alphaAnimation);
        if (z) {
            alphaAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        } else {
            alphaAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        }
        alphaAnimation.setDuration(150);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(150);
        return animationSet;
    }

    static long g(dz dzVar) {
        return dzVar.k;
    }

    static float a(dz dzVar, float f) {
        dzVar.r = f;
        return f;
    }

    static Activity d(dz dzVar) {
        return dzVar.c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
        r10_this = this;
        r0 = com.whatsapp.App.az;
        r1 = com.whatsapp.Voip.f();	 Catch:{ SettingNotFoundException -> 0x0012 }
        if (r1 == 0) goto L_0x0014;
    L_0x0008:
        r0 = r10.c;	 Catch:{ SettingNotFoundException -> 0x0012 }
        r1 = 2131624299; // 0x7f0e016b float:1.8875774E38 double:1.053162336E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ SettingNotFoundException -> 0x0012 }
    L_0x0011:
        return;
    L_0x0012:
        r0 = move-exception;
        throw r0;
    L_0x0014:
        r1 = z;
        r2 = 15;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = android.os.Environment.getExternalStorageState();
        r2 = z;	 Catch:{ SettingNotFoundException -> 0x0035 }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ SettingNotFoundException -> 0x0035 }
        r1 = r1.equals(r2);	 Catch:{ SettingNotFoundException -> 0x0035 }
        if (r1 != 0) goto L_0x0037;
    L_0x002d:
        r0 = r10.c;	 Catch:{ SettingNotFoundException -> 0x0035 }
        r1 = 15;
        r0.showDialog(r1);	 Catch:{ SettingNotFoundException -> 0x0035 }
        goto L_0x0011;
    L_0x0035:
        r0 = move-exception;
        throw r0;
    L_0x0037:
        r2 = com.whatsapp.App.aP();	 Catch:{ SettingNotFoundException -> 0x004f }
        r1 = com.whatsapp.ge.k;	 Catch:{ SettingNotFoundException -> 0x004f }
        r1 = r1 * 1024;
        r1 = r1 * 1024;
        r4 = (long) r1;	 Catch:{ SettingNotFoundException -> 0x004f }
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x0051;
    L_0x0046:
        r0 = r10.e;	 Catch:{ SettingNotFoundException -> 0x004f }
        r1 = 2131624285; // 0x7f0e015d float:1.8875745E38 double:1.053162329E-314;
        r0.a(r1);	 Catch:{ SettingNotFoundException -> 0x004f }
        goto L_0x0011;
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r1 = r10.v;	 Catch:{ SettingNotFoundException -> 0x0061 }
        r1 = com.whatsapp.App.c(r1);	 Catch:{ SettingNotFoundException -> 0x0061 }
        if (r1 == 0) goto L_0x0063;
    L_0x0059:
        r0 = r10.c;	 Catch:{ SettingNotFoundException -> 0x0061 }
        r1 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r0.showDialog(r1);	 Catch:{ SettingNotFoundException -> 0x0061 }
        goto L_0x0011;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r1 = r10.m;	 Catch:{ SettingNotFoundException -> 0x0071 }
        if (r1 == 0) goto L_0x0073;
    L_0x0067:
        r0 = z;	 Catch:{ SettingNotFoundException -> 0x0071 }
        r1 = 14;
        r0 = r0[r1];	 Catch:{ SettingNotFoundException -> 0x0071 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SettingNotFoundException -> 0x0071 }
        goto L_0x0011;
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        com.whatsapp.cb.j();
        r1 = r10.c;
        r1 = r1.getWindowManager();
        r1 = r1.getDefaultDisplay();
        r1 = r1.getOrientation();
        r2 = r10.c;	 Catch:{ SettingNotFoundException -> 0x0248 }
        r2 = r2.getResources();	 Catch:{ SettingNotFoundException -> 0x0248 }
        r2 = r2.getConfiguration();	 Catch:{ SettingNotFoundException -> 0x0248 }
        r2 = r2.orientation;	 Catch:{ SettingNotFoundException -> 0x0248 }
        switch(r2) {
            case 1: goto L_0x021a;
            case 2: goto L_0x0230;
            default: goto L_0x0093;
        };
    L_0x0093:
        r0 = r10.b;
        r0.acquire();
        r10.e();
        r10.f();
        r0 = r10.c;	 Catch:{ SettingNotFoundException -> 0x0256 }
        r0 = r0.getContentResolver();	 Catch:{ SettingNotFoundException -> 0x0256 }
        r1 = z;	 Catch:{ SettingNotFoundException -> 0x0256 }
        r2 = 18;
        r1 = r1[r2];	 Catch:{ SettingNotFoundException -> 0x0256 }
        r0 = android.provider.Settings.System.getInt(r0, r1);	 Catch:{ SettingNotFoundException -> 0x0256 }
        if (r0 == 0) goto L_0x00c3;
    L_0x00b0:
        r0 = r10.c;	 Catch:{ SettingNotFoundException -> 0x0256 }
        r1 = z;	 Catch:{ SettingNotFoundException -> 0x0256 }
        r2 = 13;
        r1 = r1[r2];	 Catch:{ SettingNotFoundException -> 0x0256 }
        r0 = r0.getSystemService(r1);	 Catch:{ SettingNotFoundException -> 0x0256 }
        r0 = (android.os.Vibrator) r0;	 Catch:{ SettingNotFoundException -> 0x0256 }
        r2 = 75;
        r0.vibrate(r2);	 Catch:{ SettingNotFoundException -> 0x0256 }
    L_0x00c3:
        r0 = f;
        r1 = n;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 0;
        r5 = 0;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r0.play(r1, r2, r3, r4, r5, r6);
        r10.h = r0;
        r0 = r10.i;
        r2 = 0;
        r1 = android.text.format.DateUtils.formatElapsedTime(r2);
        r0.setText(r1);
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r10.r = r0;
        r0 = r10.c;
        r1 = 2131427692; // 0x7f0b016c float:1.8477007E38 double:1.053065199E-314;
        r0 = r0.findViewById(r1);
        r1 = 0;
        r0.setVisibility(r1);
        r1 = new android.view.animation.AlphaAnimation;
        r2 = 0;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1.<init>(r2, r3);
        r2 = new com.whatsapp.tl;
        r2.<init>(r10);
        r1.setInterpolator(r2);
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r1.setDuration(r2);
        r2 = 2;
        r1.setRepeatMode(r2);
        r2 = -1;
        r1.setRepeatCount(r2);
        r0.startAnimation(r1);
        r9 = new android.view.animation.AnimationSet;
        r0 = 1;
        r9.<init>(r0);
        r0 = new android.view.animation.TranslateAnimation;	 Catch:{ SettingNotFoundException -> 0x0262 }
        r1 = 1;
        r2 = com.whatsapp.App.as();	 Catch:{ SettingNotFoundException -> 0x0262 }
        if (r2 == 0) goto L_0x0264;
    L_0x0120:
        r2 = 2;
    L_0x0121:
        r2 = (float) r2;
        r3 = 1;
        r4 = com.whatsapp.App.as();
        if (r4 == 0) goto L_0x0267;
    L_0x0129:
        r4 = -1;
    L_0x012a:
        r4 = (float) r4;
        r5 = 1;
        r6 = 0;
        r7 = 1;
        r8 = 0;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r2 = 1600; // 0x640 float:2.242E-42 double:7.905E-321;
        r0.setDuration(r2);
        r1 = -1;
        r0.setRepeatCount(r1);
        r1 = new android.view.animation.AlphaAnimation;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 0;
        r1.<init>(r2, r3);
        r2 = 1600; // 0x640 float:2.242E-42 double:7.905E-321;
        r1.setDuration(r2);
        r2 = -1;
        r1.setRepeatCount(r2);
        r9.addAnimation(r0);
        r9.addAnimation(r1);
        r0 = 1600; // 0x640 float:2.242E-42 double:7.905E-321;
        r9.setDuration(r0);
        r0 = -1;
        r9.setRepeatCount(r0);
        r0 = new android.view.animation.DecelerateInterpolator;
        r0.<init>();
        r9.setInterpolator(r0);
        r0 = r10.c;
        r1 = 2131427696; // 0x7f0b0170 float:1.8477016E38 double:1.053065201E-314;
        r0 = r0.findViewById(r1);
        r0.startAnimation(r9);
        r0 = r10.c;
        r1 = 2131427690; // 0x7f0b016a float:1.8477003E38 double:1.053065198E-314;
        r9 = r0.findViewById(r1);
        r0 = 0;
        r9.setVisibility(r0);	 Catch:{ SettingNotFoundException -> 0x026a }
        r0 = 1;
        r9.setClickable(r0);	 Catch:{ SettingNotFoundException -> 0x026a }
        r0 = new android.view.animation.TranslateAnimation;	 Catch:{ SettingNotFoundException -> 0x026a }
        r1 = 1;
        r2 = com.whatsapp.App.as();	 Catch:{ SettingNotFoundException -> 0x026a }
        if (r2 == 0) goto L_0x026c;
    L_0x0189:
        r2 = 1;
    L_0x018a:
        r2 = (float) r2;
        r3 = 1;
        r4 = 0;
        r5 = 1;
        r6 = 0;
        r7 = 1;
        r8 = 0;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r2 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r0.setDuration(r2);
        r9.startAnimation(r0);
        r0 = r10.c;
        r1 = 2131427683; // 0x7f0b0163 float:1.847699E38 double:1.053065195E-314;
        r0 = r0.findViewById(r1);
        r1 = new android.view.animation.AlphaAnimation;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 0;
        r1.<init>(r2, r3);
        r2 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r1.setDuration(r2);
        r2 = 1;
        r1.setFillAfter(r2);
        r0.startAnimation(r1);
        r0 = r10.c;
        r1 = 2131427657; // 0x7f0b0149 float:1.8476936E38 double:1.053065182E-314;
        r0 = r0.findViewById(r1);
        r1 = 0;
        r0.setVisibility(r1);
        r0 = 2;
        r0 = com.whatsapp.util.f.b(r0);
        r1 = 2;
        r2 = 1;
        r3 = 1;
        r0 = com.whatsapp.App.a(r0, r1, r2, r3);
        r1 = q;	 Catch:{ SettingNotFoundException -> 0x026f }
        if (r1 != 0) goto L_0x01df;
    L_0x01d6:
        r1 = java.lang.Boolean.FALSE;	 Catch:{ SettingNotFoundException -> 0x026f }
        q = r1;	 Catch:{ SettingNotFoundException -> 0x026f }
        r1 = com.whatsapp.App.aa;	 Catch:{ SettingNotFoundException -> 0x026f }
        r2 = 3;
        if (r1 != r2) goto L_0x01df;
    L_0x01df:
        r1 = r0.getAbsolutePath();	 Catch:{ SettingNotFoundException -> 0x0271 }
        r0 = q;	 Catch:{ SettingNotFoundException -> 0x0271 }
        r0 = r0.booleanValue();	 Catch:{ SettingNotFoundException -> 0x0271 }
        if (r0 == 0) goto L_0x0273;
    L_0x01eb:
        r0 = z;	 Catch:{ SettingNotFoundException -> 0x0271 }
        r2 = 17;
        r0 = r0[r2];	 Catch:{ SettingNotFoundException -> 0x0271 }
    L_0x01f1:
        r0 = com.whatsapp.ant.a(r1, r0);
        r10.m = r0;
        r0 = java.lang.System.currentTimeMillis();
        r10.k = r0;
        r0 = r10.m;	 Catch:{ Exception -> 0x0277 }
        r0.d();	 Catch:{ Exception -> 0x0277 }
    L_0x0202:
        r0 = r10.i;	 Catch:{ SettingNotFoundException -> 0x0286 }
        r1 = r10.p;	 Catch:{ SettingNotFoundException -> 0x0286 }
        r0.removeCallbacks(r1);	 Catch:{ SettingNotFoundException -> 0x0286 }
        r2 = r10.i;	 Catch:{ SettingNotFoundException -> 0x0286 }
        r3 = r10.p;	 Catch:{ SettingNotFoundException -> 0x0286 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ SettingNotFoundException -> 0x0286 }
        r1 = 16;
        if (r0 < r1) goto L_0x0288;
    L_0x0213:
        r0 = 340; // 0x154 float:4.76E-43 double:1.68E-321;
    L_0x0215:
        r2.postDelayed(r3, r0);
        goto L_0x0011;
    L_0x021a:
        if (r1 == 0) goto L_0x021f;
    L_0x021c:
        r2 = 1;
        if (r1 != r2) goto L_0x0227;
    L_0x021f:
        r2 = r10.c;	 Catch:{ SettingNotFoundException -> 0x024c }
        r3 = 1;
        r2.setRequestedOrientation(r3);	 Catch:{ SettingNotFoundException -> 0x024c }
        if (r0 == 0) goto L_0x0093;
    L_0x0227:
        r2 = r10.c;	 Catch:{ SettingNotFoundException -> 0x024e }
        r3 = 9;
        r2.setRequestedOrientation(r3);	 Catch:{ SettingNotFoundException -> 0x024e }
        if (r0 == 0) goto L_0x0093;
    L_0x0230:
        if (r1 == 0) goto L_0x0235;
    L_0x0232:
        r2 = 1;
        if (r1 != r2) goto L_0x023d;
    L_0x0235:
        r1 = r10.c;	 Catch:{ SettingNotFoundException -> 0x0254 }
        r2 = 0;
        r1.setRequestedOrientation(r2);	 Catch:{ SettingNotFoundException -> 0x0254 }
        if (r0 == 0) goto L_0x0093;
    L_0x023d:
        r0 = r10.c;	 Catch:{ SettingNotFoundException -> 0x0246 }
        r1 = 8;
        r0.setRequestedOrientation(r1);	 Catch:{ SettingNotFoundException -> 0x0246 }
        goto L_0x0093;
    L_0x0246:
        r0 = move-exception;
        throw r0;
    L_0x0248:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x024a }
    L_0x024a:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x024c }
    L_0x024c:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x024e }
    L_0x024e:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x0250 }
    L_0x0250:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x0252 }
    L_0x0252:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x0254 }
    L_0x0254:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x0246 }
    L_0x0256:
        r0 = move-exception;
        r1 = z;
        r2 = 16;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x00c3;
    L_0x0262:
        r0 = move-exception;
        throw r0;
    L_0x0264:
        r2 = -2;
        goto L_0x0121;
    L_0x0267:
        r4 = 1;
        goto L_0x012a;
    L_0x026a:
        r0 = move-exception;
        throw r0;
    L_0x026c:
        r2 = -1;
        goto L_0x018a;
    L_0x026f:
        r0 = move-exception;
        throw r0;
    L_0x0271:
        r0 = move-exception;
        throw r0;
    L_0x0273:
        r0 = "";
        goto L_0x01f1;
    L_0x0277:
        r0 = move-exception;
        r0 = 0;
        r10.b(r0);
        r0 = r10.e;
        r1 = 2131624294; // 0x7f0e0166 float:1.8875764E38 double:1.0531623335E-314;
        r0.a(r1);
        goto L_0x0202;
    L_0x0286:
        r0 = move-exception;
        throw r0;
    L_0x0288:
        r0 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        goto L_0x0215;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dz.h():void");
    }

    static long a(dz dzVar, long j) {
        dzVar.k = j;
        return j;
    }

    static Handler i(dz dzVar) {
        return dzVar.u;
    }

    @TargetApi(8)
    private OnAudioFocusChangeListener b() {
        if (this.g == null) {
            this.g = new afs(this);
        }
        return this.g;
    }

    public void f() {
        if (this.j != null) {
            this.j.cancel();
            this.j = null;
        }
    }

    static float c(dz dzVar) {
        return dzVar.r;
    }

    public void a(String str) {
        this.v = str;
    }

    static ho j(dz dzVar) {
        return dzVar.e;
    }

    static TextView h(dz dzVar) {
        return dzVar.i;
    }

    static ant b(dz dzVar) {
        return dzVar.m;
    }

    private void c() {
        this.c.findViewById(R.id.voice_note_pulse).setVisibility(4);
        View findViewById = this.c.findViewById(R.id.voice_cancel_trashcan);
        findViewById.setVisibility(0);
        Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(200);
        translateAnimation.setStartOffset(600);
        translateAnimation.setFillBefore(true);
        findViewById.startAnimation(translateAnimation);
        View findViewById2 = this.c.findViewById(R.id.voice_cancel_animation);
        findViewById2.setVisibility(0);
        Animation animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new DecelerateInterpolator(1.1f));
        translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -3.0f);
        translateAnimation.setDuration(600);
        translateAnimation.setRepeatMode(2);
        translateAnimation.setRepeatCount(1);
        Animation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(600);
        Animation scaleAnimation = new ScaleAnimation(1.0f, 0.9f, 1.0f, 0.95f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(1200);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation);
        View findViewById3 = this.c.findViewById(R.id.voice_cancel_trashcan_lid);
        Animation animationSet2 = new AnimationSet(true);
        translateAnimation = new TranslateAnimation(1, 0.0f, 1, -0.3f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(150);
        translateAnimation.setStartOffset(700);
        translateAnimation.setFillAfter(true);
        rotateAnimation = new RotateAnimation(0.0f, -60.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(150);
        rotateAnimation.setStartOffset(700);
        rotateAnimation.setFillAfter(true);
        animationSet2.addAnimation(rotateAnimation);
        animationSet2.addAnimation(translateAnimation);
        animationSet2.setFillAfter(true);
        findViewById3.startAnimation(animationSet2);
        View findViewById4 = this.c.findViewById(R.id.emoji_picker_btn);
        if (findViewById4 != null) {
            findViewById4.setVisibility(4);
        }
        findViewById2.startAnimation(animationSet);
        animationSet.setAnimationListener(new rc(this, findViewById2, findViewById3, findViewById));
    }

    static SoundPool g() {
        return f;
    }

    private void d() {
        if (VERSION.SDK_INT > 7) {
            ((AudioManager) this.c.getSystemService(z[1])).abandonAudioFocus(b());
        }
    }

    private void e() {
        if (VERSION.SDK_INT > 7) {
            ((AudioManager) this.c.getSystemService(z[0])).requestAudioFocus(b(), 3, 2);
        }
    }
}
