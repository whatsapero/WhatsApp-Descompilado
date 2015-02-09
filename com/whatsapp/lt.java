package com.whatsapp;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import org.whispersystems.libaxolotl.ay;

abstract class lt extends k4 {
    private static final String[] z;
    Runnable c;
    private Activity d;
    private final int[] e;
    private ImageView[] f;
    private final Handler g;
    private int h;

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "\u0014@6EV";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r6 = r2.length;
        r7 = r6;
        r8 = r1;
        r6 = r2;
    L_0x0012:
        if (r7 > r8) goto L_0x002f;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "\u0014@6EV";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x002f:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0046;
            case 3: goto L_0x0049;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 51;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        goto L_0x0038;
    L_0x0043:
        r2 = 52;
        goto L_0x0038;
    L_0x0046:
        r2 = 87;
        goto L_0x0038;
    L_0x0049:
        r2 = 49;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lt.<clinit>():void");
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public lt(Activity activity) {
        super(activity, R.layout.backup_restore);
        this.g = new Handler();
        this.h = 0;
        this.e = new int[]{2131427516, 2131427517, 2131427518, 2131427519, 2131427520};
        this.c = new tq(this);
        this.d = activity;
    }

    static Handler b(lt ltVar) {
        return ltVar.g;
    }

    static int[] a(lt ltVar) {
        return ltVar.e;
    }

    public void a() {
        if (this.d.getResources().getConfiguration().orientation == 1) {
            findViewById(R.id.header).setVisibility(0);
            findViewById(R.id.filler).setVisibility(0);
            if (App.az == 0) {
                return;
            }
        }
        findViewById(R.id.header).setVisibility(8);
        findViewById(R.id.filler).setVisibility(8);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            onSaveInstanceState.putInt(z[0], this.h);
        }
        return onSaveInstanceState;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r8) {
        /*
        r7_this = this;
        r6 = 2131427522; // 0x7f0b00c2 float:1.8476663E38 double:1.053065115E-314;
        r5 = 2131427513; // 0x7f0b00b9 float:1.8476644E38 double:1.053065111E-314;
        r4 = 8;
        r3 = 1;
        r0 = 0;
        super.onCreate(r8);
        r1 = 2131427525; // 0x7f0b00c5 float:1.8476669E38 double:1.0530651167E-314;
        r1 = r7.findViewById(r1);
        r2 = new com.whatsapp.a8w;
        r2.<init>(r7);
        r1.setOnClickListener(r2);
        r1 = 2131427526; // 0x7f0b00c6 float:1.847667E38 double:1.053065117E-314;
        r1 = r7.findViewById(r1);
        r2 = new com.whatsapp.al0;
        r2.<init>(r7);
        r1.setOnClickListener(r2);
        r1 = 2131427527; // 0x7f0b00c7 float:1.8476673E38 double:1.0530651177E-314;
        r1 = r7.findViewById(r1);
        r2 = new com.whatsapp.afu;
        r2.<init>(r7);
        r1.setOnClickListener(r2);
        r1 = r7.d;
        r1 = r1.getResources();
        r1 = r1.getConfiguration();
        r1 = r1.orientation;
        if (r1 != r3) goto L_0x005a;
    L_0x0048:
        r1 = r7.findViewById(r5);
        r1.setVisibility(r0);
        r1 = r7.findViewById(r6);
        r1.setVisibility(r0);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0068;
    L_0x005a:
        r1 = r7.findViewById(r5);
        r1.setVisibility(r4);
        r1 = r7.findViewById(r6);
        r1.setVisibility(r4);
    L_0x0068:
        if (r8 != 0) goto L_0x0076;
    L_0x006a:
        r7.a(r0);
        r0 = r7.getWindow();
        r1 = 3;
        r0.setSoftInputMode(r1);
        return;
    L_0x0076:
        r0 = z;
        r0 = r0[r3];
        r0 = r8.getInt(r0);
        goto L_0x006a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lt.onCreate(android.os.Bundle):void");
    }

    static ImageView[] d(lt ltVar) {
        return ltVar.f;
    }

    protected void a(int i) {
        int i2;
        am1 a;
        View findViewById;
        Animation translateAnimation;
        int i3 = App.az;
        this.h = i;
        switch (i) {
            case ay.f /*1*/:
                Animation translateAnimation2;
                AlphaAnimation[] alphaAnimationArr;
                this.f = new ImageView[this.e.length];
                int i4 = 0;
                while (i4 < this.e.length) {
                    this.f[i4] = (ImageView) findViewById(this.e[i4]);
                    this.f[i4].setVisibility(0);
                    this.f[i4].setImageDrawable(this.d.getResources().getDrawable(R.drawable.dot_dark).mutate());
                    i2 = i4 + 1;
                    if (i3 != 0) {
                        findViewById(R.id.phone).setVisibility(0);
                        findViewById(R.id.restore_backup).setVisibility(8);
                        findViewById(R.id.do_not_restore_backup).setVisibility(8);
                        findViewById(R.id.restore_progress).setVisibility(0);
                        a = am1.a();
                        findViewById = findViewById(R.id.phone);
                        translateAnimation2 = new TranslateAnimation(-50.0f * a.g, 0.0f, 0.0f, 0.0f);
                        translateAnimation2.setDuration(200);
                        findViewById.startAnimation(translateAnimation2);
                        findViewById = findViewById(R.id.sdcard);
                        translateAnimation2 = new TranslateAnimation(a.g * 50.0f, 0.0f, 0.0f, 0.0f);
                        translateAnimation2.setDuration(200);
                        findViewById.startAnimation(translateAnimation2);
                        this.g.removeCallbacks(this.c);
                        this.g.postDelayed(this.c, 500);
                        if (null == null) {
                            alphaAnimationArr = new AlphaAnimation[this.e.length];
                            i2 = 0;
                            while (i2 < this.f.length) {
                                alphaAnimationArr[i2] = new AlphaAnimation(1.0f, 0.0f);
                                alphaAnimationArr[i2].setDuration(50);
                                alphaAnimationArr[i2].setFillAfter(true);
                                this.f[i2].startAnimation(alphaAnimationArr[i2]);
                                i2++;
                                if (i3 != 0) {
                                }
                            }
                        }
                        ((TextView) findViewById(R.id.message_backup_found_heading)).setText("");
                        ((TextView) findViewById(R.id.message_backup_found_question)).setText("");
                        if (i3 == 0) {
                            return;
                        }
                    }
                    i4 = i2;
                }
                findViewById(R.id.phone).setVisibility(0);
                findViewById(R.id.restore_backup).setVisibility(8);
                findViewById(R.id.do_not_restore_backup).setVisibility(8);
                findViewById(R.id.restore_progress).setVisibility(0);
                a = am1.a();
                findViewById = findViewById(R.id.phone);
                translateAnimation2 = new TranslateAnimation(-50.0f * a.g, 0.0f, 0.0f, 0.0f);
                translateAnimation2.setDuration(200);
                findViewById.startAnimation(translateAnimation2);
                findViewById = findViewById(R.id.sdcard);
                translateAnimation2 = new TranslateAnimation(a.g * 50.0f, 0.0f, 0.0f, 0.0f);
                translateAnimation2.setDuration(200);
                findViewById.startAnimation(translateAnimation2);
                this.g.removeCallbacks(this.c);
                this.g.postDelayed(this.c, 500);
                if (null == null) {
                    alphaAnimationArr = new AlphaAnimation[this.e.length];
                    i2 = 0;
                    while (i2 < this.f.length) {
                        alphaAnimationArr[i2] = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimationArr[i2].setDuration(50);
                        alphaAnimationArr[i2].setFillAfter(true);
                        this.f[i2].startAnimation(alphaAnimationArr[i2]);
                        i2++;
                        if (i3 != 0) {
                        }
                    }
                }
                ((TextView) findViewById(R.id.message_backup_found_heading)).setText("");
                ((TextView) findViewById(R.id.message_backup_found_question)).setText("");
                if (i3 == 0) {
                    return;
                }
                break;
            case ay.n /*2*/:
                break;
            default:
                return;
        }
        i2 = 0;
        while (i2 < this.e.length) {
            findViewById(this.e[i2]).setVisibility(8);
            i2++;
            if (i3 != 0) {
                a = am1.a();
                findViewById = findViewById(R.id.phone);
                translateAnimation = new TranslateAnimation(50.0f * a.g, 0.0f, 0.0f, 0.0f);
                translateAnimation.setDuration(200);
                findViewById.startAnimation(translateAnimation);
                findViewById = findViewById(R.id.sdcard);
                translateAnimation = new AnimationSet(true);
                translateAnimation.addAnimation(new TranslateAnimation(a.g * -50.0f, 0.0f, 0.0f, 0.0f));
                translateAnimation.addAnimation(new AlphaAnimation(1.0f, 0.0f));
                translateAnimation.setDuration(200);
                findViewById.startAnimation(translateAnimation);
                findViewById(R.id.sdcard).setVisibility(8);
                findViewById(R.id.phone).setVisibility(0);
                findViewById(R.id.restore_backup).setVisibility(8);
                findViewById(R.id.do_not_restore_backup).setVisibility(8);
                findViewById(R.id.restore_progress).setVisibility(8);
                findViewById(R.id.restore_done).setVisibility(0);
                ((TextView) findViewById(R.id.message_backup_found_heading)).setText(R.string.register_congratulations);
                ((TextView) findViewById(R.id.message_backup_found_question)).setText(App.aX.a(R.plurals.register_messages_restored, App.aJ.o(), new Object[]{Integer.valueOf(App.aJ.o())}));
            }
        }
        a = am1.a();
        findViewById = findViewById(R.id.phone);
        translateAnimation = new TranslateAnimation(50.0f * a.g, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(200);
        findViewById.startAnimation(translateAnimation);
        findViewById = findViewById(R.id.sdcard);
        translateAnimation = new AnimationSet(true);
        translateAnimation.addAnimation(new TranslateAnimation(a.g * -50.0f, 0.0f, 0.0f, 0.0f));
        translateAnimation.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        translateAnimation.setDuration(200);
        findViewById.startAnimation(translateAnimation);
        findViewById(R.id.sdcard).setVisibility(8);
        findViewById(R.id.phone).setVisibility(0);
        findViewById(R.id.restore_backup).setVisibility(8);
        findViewById(R.id.do_not_restore_backup).setVisibility(8);
        findViewById(R.id.restore_progress).setVisibility(8);
        findViewById(R.id.restore_done).setVisibility(0);
        ((TextView) findViewById(R.id.message_backup_found_heading)).setText(R.string.register_congratulations);
        ((TextView) findViewById(R.id.message_backup_found_question)).setText(App.aX.a(R.plurals.register_messages_restored, App.aJ.o(), new Object[]{Integer.valueOf(App.aJ.o())}));
    }

    static int c(lt ltVar) {
        return ltVar.h;
    }
}
