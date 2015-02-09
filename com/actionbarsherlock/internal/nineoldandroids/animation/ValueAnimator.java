package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.os.Handler;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener;
import java.util.ArrayList;
import java.util.HashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ValueAnimator extends Animator {
    private static ThreadLocal sAnimationHandler;
    private static final ThreadLocal sAnimations;
    private static final Interpolator sDefaultInterpolator;
    private static final ThreadLocal sDelayedAnims;
    private static final ThreadLocal sEndingAnims;
    private static long sFrameDelay;
    private static final ThreadLocal sPendingAnimations;
    private static final ThreadLocal sReadyAnims;
    private static final String[] z;
    private float mCurrentFraction;
    private int mCurrentIteration;
    private long mDelayStartTime;
    private long mDuration;
    boolean mInitialized;
    private Interpolator mInterpolator;
    private boolean mPlayingBackwards;
    int mPlayingState;
    private int mRepeatCount;
    private int mRepeatMode;
    private boolean mRunning;
    long mSeekTime;
    private long mStartDelay;
    long mStartTime;
    private boolean mStarted;
    private boolean mStartedDelay;
    private ArrayList mUpdateListeners;
    PropertyValuesHolder[] mValues;
    HashMap mValuesMap;

    class AnimationHandler extends Handler {
        private AnimationHandler() {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r15) {
            /*
            r14_this = this;
            r7 = com.actionbarsherlock.internal.nineoldandroids.animation.Animator.a;
            r3 = 1;
            r0 = com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.access$000();
            r0 = r0.get();
            r0 = (java.util.ArrayList) r0;
            r1 = com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.access$100();
            r1 = r1.get();
            r1 = (java.util.ArrayList) r1;
            r2 = r15.what;
            switch(r2) {
                case 0: goto L_0x001d;
                case 1: goto L_0x0138;
                default: goto L_0x001c;
            };
        L_0x001c:
            return;
        L_0x001d:
            r2 = com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.access$200();
            r2 = r2.get();
            r2 = (java.util.ArrayList) r2;
            r4 = r0.size();
            if (r4 > 0) goto L_0x0033;
        L_0x002d:
            r4 = r1.size();
            if (r4 <= 0) goto L_0x0135;
        L_0x0033:
            r3 = 0;
            r5 = r3;
        L_0x0035:
            r3 = r2.size();
            if (r3 <= 0) goto L_0x006a;
        L_0x003b:
            r3 = r2.clone();
            r3 = (java.util.ArrayList) r3;
            r2.clear();
            r8 = r3.size();
            r4 = 0;
            r6 = r4;
        L_0x004a:
            if (r6 >= r8) goto L_0x0068;
        L_0x004c:
            r4 = r3.get(r6);
            r4 = (com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator) r4;
            r10 = com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.access$300(r4);
            r12 = 0;
            r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
            if (r9 != 0) goto L_0x0061;
        L_0x005c:
            com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.access$400(r4);
            if (r7 == 0) goto L_0x0064;
        L_0x0061:
            r1.add(r4);
        L_0x0064:
            r4 = r6 + 1;
            if (r7 == 0) goto L_0x0132;
        L_0x0068:
            if (r7 == 0) goto L_0x0035;
        L_0x006a:
            r8 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            r2 = com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.access$500();
            r2 = r2.get();
            r2 = (java.util.ArrayList) r2;
            r3 = com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.access$600();
            r3 = r3.get();
            r3 = (java.util.ArrayList) r3;
            r10 = r1.size();
            r4 = 0;
            r6 = r4;
        L_0x0088:
            if (r6 >= r10) goto L_0x009d;
        L_0x008a:
            r4 = r1.get(r6);
            r4 = (com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator) r4;
            r11 = com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.access$700(r4, r8);
            if (r11 == 0) goto L_0x0099;
        L_0x0096:
            r2.add(r4);
        L_0x0099:
            r4 = r6 + 1;
            if (r7 == 0) goto L_0x012f;
        L_0x009d:
            r10 = r2.size();
            if (r10 <= 0) goto L_0x00be;
        L_0x00a3:
            r4 = 0;
            r6 = r4;
        L_0x00a5:
            if (r6 >= r10) goto L_0x00bb;
        L_0x00a7:
            r4 = r2.get(r6);
            r4 = (com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator) r4;
            com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.access$400(r4);
            r11 = 1;
            com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.access$802(r4, r11);
            r1.remove(r4);
            r4 = r6 + 1;
            if (r7 == 0) goto L_0x012c;
        L_0x00bb:
            r2.clear();
        L_0x00be:
            r6 = r0.size();
            r4 = 0;
        L_0x00c3:
            if (r4 >= r6) goto L_0x00e6;
        L_0x00c5:
            r2 = r0.get(r4);
            r2 = (com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator) r2;
            r10 = r2.animationFrame(r8);
            if (r10 == 0) goto L_0x00d4;
        L_0x00d1:
            r3.add(r2);
        L_0x00d4:
            r10 = r0.size();
            if (r10 != r6) goto L_0x00de;
        L_0x00da:
            r4 = r4 + 1;
            if (r7 == 0) goto L_0x00e3;
        L_0x00de:
            r6 = r6 + -1;
            r3.remove(r2);
        L_0x00e3:
            r2 = r6;
            if (r7 == 0) goto L_0x012a;
        L_0x00e6:
            r2 = r3.size();
            if (r2 <= 0) goto L_0x0104;
        L_0x00ec:
            r2 = 0;
            r4 = r2;
        L_0x00ee:
            r2 = r3.size();
            if (r4 >= r2) goto L_0x0101;
        L_0x00f4:
            r2 = r3.get(r4);
            r2 = (com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator) r2;
            com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.access$900(r2);
            r2 = r4 + 1;
            if (r7 == 0) goto L_0x0128;
        L_0x0101:
            r3.clear();
        L_0x0104:
            if (r5 == 0) goto L_0x001c;
        L_0x0106:
            r0 = r0.isEmpty();
            if (r0 == 0) goto L_0x0112;
        L_0x010c:
            r0 = r1.isEmpty();
            if (r0 != 0) goto L_0x001c;
        L_0x0112:
            r0 = 1;
            r2 = 0;
            r4 = com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.access$1000();
            r6 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            r6 = r6 - r8;
            r4 = r4 - r6;
            r2 = java.lang.Math.max(r2, r4);
            r14.sendEmptyMessageDelayed(r0, r2);
            goto L_0x001c;
        L_0x0128:
            r4 = r2;
            goto L_0x00ee;
        L_0x012a:
            r6 = r2;
            goto L_0x00c3;
        L_0x012c:
            r6 = r4;
            goto L_0x00a5;
        L_0x012f:
            r6 = r4;
            goto L_0x0088;
        L_0x0132:
            r6 = r4;
            goto L_0x004a;
        L_0x0135:
            r5 = r3;
            goto L_0x0035;
        L_0x0138:
            r5 = r3;
            goto L_0x006a;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.AnimationHandler.handleMessage(android.os.Message):void");
        }

        AnimationHandler(AnonymousClass_1 anonymousClass_1) {
            this();
        }
    }

    public interface AnimatorUpdateListener {
        void onAnimationUpdate(ValueAnimator valueAnimator);
    }

    static ThreadLocal access$100() {
        return sDelayedAnims;
    }

    static ThreadLocal access$600() {
        return sEndingAnims;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void end() {
        /*
        r3_this = this;
        r1 = com.actionbarsherlock.internal.nineoldandroids.animation.Animator.a;
        r0 = sAnimations;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r0 = r0.get();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r0 = (java.util.ArrayList) r0;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r0 = r0.contains(r3);	 Catch:{ IllegalArgumentException -> 0x0047 }
        if (r0 != 0) goto L_0x0026;
    L_0x0010:
        r0 = sPendingAnimations;	 Catch:{ IllegalArgumentException -> 0x0049 }
        r0 = r0.get();	 Catch:{ IllegalArgumentException -> 0x0049 }
        r0 = (java.util.ArrayList) r0;	 Catch:{ IllegalArgumentException -> 0x0049 }
        r0 = r0.contains(r3);	 Catch:{ IllegalArgumentException -> 0x0049 }
        if (r0 != 0) goto L_0x0026;
    L_0x001e:
        r0 = 0;
        r3.mStartedDelay = r0;	 Catch:{ IllegalArgumentException -> 0x004b }
        r3.startAnimation();	 Catch:{ IllegalArgumentException -> 0x004b }
        if (r1 == 0) goto L_0x002d;
    L_0x0026:
        r0 = r3.mInitialized;	 Catch:{ IllegalArgumentException -> 0x004d }
        if (r0 != 0) goto L_0x002d;
    L_0x002a:
        r3.initAnimation();	 Catch:{ IllegalArgumentException -> 0x004d }
    L_0x002d:
        r0 = r3.mRepeatCount;	 Catch:{ IllegalArgumentException -> 0x004f }
        if (r0 <= 0) goto L_0x003e;
    L_0x0031:
        r0 = r3.mRepeatCount;	 Catch:{ IllegalArgumentException -> 0x0051 }
        r0 = r0 & 1;
        r2 = 1;
        if (r0 != r2) goto L_0x003e;
    L_0x0038:
        r0 = 0;
        r3.animateValue(r0);	 Catch:{ IllegalArgumentException -> 0x0053 }
        if (r1 == 0) goto L_0x0043;
    L_0x003e:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3.animateValue(r0);	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x0043:
        r3.endAnimation();
        return;
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.end():void");
    }

    static ThreadLocal access$000() {
        return sAnimations;
    }

    static ThreadLocal access$500() {
        return sReadyAnims;
    }

    public void setInterpolator(Interpolator interpolator) {
        try {
            if (interpolator != null) {
                this.mInterpolator = interpolator;
                if (!Animator.a) {
                    return;
                }
            }
            this.mInterpolator = new LinearInterpolator();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static void access$900(ValueAnimator valueAnimator) {
        valueAnimator.endAnimation();
    }

    public String toString() {
        int i = 0;
        boolean z = Animator.a;
        String str = z[0] + Integer.toHexString(hashCode());
        if (this.mValues != null) {
            while (i < this.mValues.length) {
                str = str + z[1] + this.mValues[i].toString();
                i++;
                if (z) {
                    break;
                }
            }
        }
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean animationFrame(long r14) {
        /*
        r13_this = this;
        r8 = 0;
        r4 = 1;
        r3 = 0;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = com.actionbarsherlock.internal.nineoldandroids.animation.Animator.a;
        r0 = r13.mPlayingState;	 Catch:{ IllegalArgumentException -> 0x0029 }
        if (r0 != 0) goto L_0x0023;
    L_0x000c:
        r0 = 1;
        r13.mPlayingState = r0;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = r13.mSeekTime;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r0 >= 0) goto L_0x0019;
    L_0x0015:
        r13.mStartTime = r14;	 Catch:{ IllegalArgumentException -> 0x002d }
        if (r6 == 0) goto L_0x0023;
    L_0x0019:
        r0 = r13.mSeekTime;	 Catch:{ IllegalArgumentException -> 0x002d }
        r0 = r14 - r0;
        r13.mStartTime = r0;	 Catch:{ IllegalArgumentException -> 0x002d }
        r0 = -1;
        r13.mSeekTime = r0;	 Catch:{ IllegalArgumentException -> 0x002d }
    L_0x0023:
        r0 = r13.mPlayingState;	 Catch:{ IllegalArgumentException -> 0x0095 }
        switch(r0) {
            case 1: goto L_0x002f;
            case 2: goto L_0x002f;
            default: goto L_0x0028;
        };
    L_0x0028:
        return r3;
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = r13.mDuration;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x0099;
    L_0x0035:
        r0 = r13.mStartTime;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r0 = r14 - r0;
        r0 = (float) r0;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r8 = r13.mDuration;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r1 = (float) r8;
        r0 = r0 / r1;
        r1 = r0;
    L_0x003f:
        r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r0 < 0) goto L_0x008b;
    L_0x0043:
        r0 = r13.mCurrentIteration;	 Catch:{ IllegalArgumentException -> 0x009b }
        r5 = r13.mRepeatCount;	 Catch:{ IllegalArgumentException -> 0x009b }
        if (r0 < r5) goto L_0x004e;
    L_0x0049:
        r0 = r13.mRepeatCount;	 Catch:{ IllegalArgumentException -> 0x009d }
        r5 = -1;
        if (r0 != r5) goto L_0x0086;
    L_0x004e:
        r0 = r13.mListeners;	 Catch:{ IllegalArgumentException -> 0x009d }
        if (r0 == 0) goto L_0x006a;
    L_0x0052:
        r0 = r13.mListeners;
        r7 = r0.size();
        r5 = r3;
    L_0x0059:
        if (r5 >= r7) goto L_0x006a;
    L_0x005b:
        r0 = r13.mListeners;
        r0 = r0.get(r5);
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener) r0;
        r0.onAnimationRepeat(r13);
        r0 = r5 + 1;
        if (r6 == 0) goto L_0x00a5;
    L_0x006a:
        r0 = r13.mRepeatMode;	 Catch:{ IllegalArgumentException -> 0x009f }
        r5 = 2;
        if (r0 != r5) goto L_0x0076;
    L_0x006f:
        r0 = r13.mPlayingBackwards;	 Catch:{ IllegalArgumentException -> 0x00a1 }
        if (r0 == 0) goto L_0x00a3;
    L_0x0073:
        r0 = r3;
    L_0x0074:
        r13.mPlayingBackwards = r0;
    L_0x0076:
        r0 = r13.mCurrentIteration;
        r5 = (int) r1;
        r0 = r0 + r5;
        r13.mCurrentIteration = r0;
        r1 = r1 % r2;
        r8 = r13.mStartTime;
        r10 = r13.mDuration;
        r8 = r8 + r10;
        r13.mStartTime = r8;
        if (r6 == 0) goto L_0x008b;
    L_0x0086:
        r1 = java.lang.Math.min(r1, r2);
        r3 = r4;
    L_0x008b:
        r0 = r13.mPlayingBackwards;
        if (r0 == 0) goto L_0x0091;
    L_0x008f:
        r1 = r2 - r1;
    L_0x0091:
        r13.animateValue(r1);
        goto L_0x0028;
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0097 }
    L_0x0097:
        r0 = move-exception;
        throw r0;
    L_0x0099:
        r1 = r2;
        goto L_0x003f;
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;
    L_0x00a3:
        r0 = r4;
        goto L_0x0074;
    L_0x00a5:
        r5 = r0;
        goto L_0x0059;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.animationFrame(long):boolean");
    }

    public long getCurrentPlayTime() {
        try {
            if (this.mInitialized) {
                if (this.mPlayingState != 0) {
                    try {
                        return AnimationUtils.currentAnimationTimeMillis() - this.mStartTime;
                    }
                }
            }
            return 0;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static boolean access$802(ValueAnimator valueAnimator, boolean z) {
        valueAnimator.mRunning = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFloatValues(float[] r5) {
        /*
        r4_this = this;
        r3 = 0;
        if (r5 == 0) goto L_0x0006;
    L_0x0003:
        r0 = r5.length;	 Catch:{ IllegalArgumentException -> 0x0007 }
        if (r0 != 0) goto L_0x0009;
    L_0x0006:
        return;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        r0 = r4.mValues;	 Catch:{ IllegalArgumentException -> 0x002f }
        if (r0 == 0) goto L_0x0012;
    L_0x000d:
        r0 = r4.mValues;	 Catch:{ IllegalArgumentException -> 0x0031 }
        r0 = r0.length;	 Catch:{ IllegalArgumentException -> 0x0031 }
        if (r0 != 0) goto L_0x0025;
    L_0x0012:
        r0 = 1;
        r0 = new com.actionbarsherlock.internal.nineoldandroids.animation.PropertyValuesHolder[r0];	 Catch:{ IllegalArgumentException -> 0x0031 }
        r1 = 0;
        r2 = "";
        r2 = com.actionbarsherlock.internal.nineoldandroids.animation.PropertyValuesHolder.ofFloat(r2, r5);	 Catch:{ IllegalArgumentException -> 0x0031 }
        r0[r1] = r2;	 Catch:{ IllegalArgumentException -> 0x0031 }
        r4.setValues(r0);	 Catch:{ IllegalArgumentException -> 0x0031 }
        r0 = com.actionbarsherlock.internal.nineoldandroids.animation.Animator.a;	 Catch:{ IllegalArgumentException -> 0x0031 }
        if (r0 == 0) goto L_0x002c;
    L_0x0025:
        r0 = r4.mValues;
        r0 = r0[r3];
        r0.setFloatValues(r5);
    L_0x002c:
        r4.mInitialized = r3;
        goto L_0x0006;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.setFloatValues(float[]):void");
    }

    static long access$300(ValueAnimator valueAnimator) {
        return valueAnimator.mStartDelay;
    }

    static void access$400(ValueAnimator valueAnimator) {
        valueAnimator.startAnimation();
    }

    void initAnimation() {
        boolean z = Animator.a;
        if (!this.mInitialized) {
            int length = this.mValues.length;
            int i = 0;
            while (i < length) {
                this.mValues[i].init();
                i++;
                if (z) {
                    break;
                }
            }
            this.mInitialized = true;
        }
    }

    public Object clone() {
        return clone();
    }

    static long access$1000() {
        return sFrameDelay;
    }

    public void start() {
        start(false);
    }

    public ValueAnimator() {
        boolean z = false;
        boolean z2 = Animator.a;
        this.mSeekTime = -1;
        this.mPlayingBackwards = false;
        this.mCurrentIteration = 0;
        this.mCurrentFraction = 0.0f;
        this.mStartedDelay = false;
        this.mPlayingState = 0;
        this.mRunning = false;
        this.mStarted = false;
        this.mInitialized = false;
        this.mDuration = 300;
        this.mStartDelay = 0;
        this.mRepeatCount = 0;
        this.mRepeatMode = 1;
        this.mInterpolator = sDefaultInterpolator;
        this.mUpdateListeners = null;
        if (SherlockActivity.a) {
            if (!z2) {
                z = true;
            }
            Animator.a = z;
        }
    }

    static boolean access$700(ValueAnimator valueAnimator, long j) {
        return valueAnimator.delayedAnimationFrame(j);
    }

    private void endAnimation() {
        boolean z = Animator.a;
        try {
            ((ArrayList) sAnimations.get()).remove(this);
            ((ArrayList) sPendingAnimations.get()).remove(this);
            ((ArrayList) sDelayedAnims.get()).remove(this);
            this.mPlayingState = 0;
            if (this.mRunning && this.mListeners != null) {
                ArrayList arrayList = (ArrayList) this.mListeners.clone();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    ((AnimatorListener) arrayList.get(i)).onAnimationEnd(this);
                    int i2 = i + 1;
                    if (z) {
                        break;
                    }
                    i = i2;
                }
            }
            this.mRunning = false;
            this.mStarted = false;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean delayedAnimationFrame(long r8) {
        /*
        r7_this = this;
        r0 = 1;
        r1 = r7.mStartedDelay;	 Catch:{ IllegalArgumentException -> 0x0023 }
        if (r1 != 0) goto L_0x000e;
    L_0x0005:
        r1 = 1;
        r7.mStartedDelay = r1;	 Catch:{ IllegalArgumentException -> 0x0023 }
        r7.mDelayStartTime = r8;	 Catch:{ IllegalArgumentException -> 0x0023 }
        r1 = com.actionbarsherlock.internal.nineoldandroids.animation.Animator.a;	 Catch:{ IllegalArgumentException -> 0x0023 }
        if (r1 == 0) goto L_0x0027;
    L_0x000e:
        r2 = r7.mDelayStartTime;
        r2 = r8 - r2;
        r4 = r7.mStartDelay;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x0027;
    L_0x0018:
        r4 = r7.mStartDelay;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r2 = r2 - r4;
        r2 = r8 - r2;
        r7.mStartTime = r2;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r1 = 1;
        r7.mPlayingState = r1;	 Catch:{ IllegalArgumentException -> 0x0025 }
    L_0x0022:
        return r0;
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        r0 = move-exception;
        throw r0;
    L_0x0027:
        r0 = 0;
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.delayedAnimationFrame(long):boolean");
    }

    private void startAnimation() {
        boolean z = Animator.a;
        try {
            initAnimation();
            ((ArrayList) sAnimations.get()).add(this);
            if (this.mStartDelay > 0 && this.mListeners != null) {
                ArrayList arrayList = (ArrayList) this.mListeners.clone();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    ((AnimatorListener) arrayList.get(i)).onAnimationStart(this);
                    int i2 = i + 1;
                    if (!z) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void setCurrentPlayTime(long j) {
        initAnimation();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        try {
            if (this.mPlayingState != 1) {
                this.mSeekTime = j;
                this.mPlayingState = 2;
            }
            this.mStartTime = currentAnimationTimeMillis - j;
            animationFrame(currentAnimationTimeMillis);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public ValueAnimator setDuration(long j) {
        if (j < 0) {
            try {
                throw new IllegalArgumentException(z[3] + j);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.mDuration = j;
        return this;
    }

    private void start(boolean z) {
        boolean z2 = Animator.a;
        try {
            if (Looper.myLooper() == null) {
                throw new AndroidRuntimeException(z[2]);
            }
            try {
                this.mPlayingBackwards = z;
                this.mCurrentIteration = 0;
                this.mPlayingState = 0;
                this.mStarted = true;
                this.mStartedDelay = false;
                ((ArrayList) sPendingAnimations.get()).add(this);
                if (this.mStartDelay == 0) {
                    setCurrentPlayTime(getCurrentPlayTime());
                    this.mPlayingState = 0;
                    this.mRunning = true;
                    if (this.mListeners != null) {
                        ArrayList arrayList = (ArrayList) this.mListeners.clone();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            ((AnimatorListener) arrayList.get(i)).onAnimationStart(this);
                            int i2 = i + 1;
                            if (z2) {
                                break;
                            }
                            i = i2;
                        }
                    }
                }
                AnimationHandler animationHandler = (AnimationHandler) sAnimationHandler.get();
                if (animationHandler == null) {
                    animationHandler = new AnimationHandler(null);
                    sAnimationHandler.set(animationHandler);
                }
                animationHandler.sendEmptyMessage(0);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void setValues(PropertyValuesHolder[] propertyValuesHolderArr) {
        boolean z = Animator.a;
        int length = propertyValuesHolderArr.length;
        this.mValues = propertyValuesHolderArr;
        this.mValuesMap = new HashMap(length);
        int i = 0;
        while (i < length) {
            PropertyValuesHolder propertyValuesHolder = propertyValuesHolderArr[i];
            this.mValuesMap.put(propertyValuesHolder.getPropertyName(), propertyValuesHolder);
            i++;
            if (z) {
                break;
            }
        }
        this.mInitialized = false;
    }

    public boolean isRunning() {
        try {
            if (this.mPlayingState == 1) {
                return true;
            }
            try {
                return this.mRunning;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    void animateValue(float f) {
        boolean z = Animator.a;
        float interpolation = this.mInterpolator.getInterpolation(f);
        this.mCurrentFraction = interpolation;
        int length = this.mValues.length;
        int i = 0;
        while (i < length) {
            this.mValues[i].calculateValue(interpolation);
            i++;
            if (z) {
                break;
            }
        }
        if (this.mUpdateListeners != null) {
            int size = this.mUpdateListeners.size();
            i = 0;
            while (i < size) {
                ((AnimatorUpdateListener) this.mUpdateListeners.get(i)).onAnimationUpdate(this);
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
        r3_this = this;
        r1 = com.actionbarsherlock.internal.nineoldandroids.animation.Animator.a;
        r0 = r3.mPlayingState;	 Catch:{ IllegalArgumentException -> 0x004b }
        if (r0 != 0) goto L_0x0022;
    L_0x0006:
        r0 = sPendingAnimations;	 Catch:{ IllegalArgumentException -> 0x004d }
        r0 = r0.get();	 Catch:{ IllegalArgumentException -> 0x004d }
        r0 = (java.util.ArrayList) r0;	 Catch:{ IllegalArgumentException -> 0x004d }
        r0 = r0.contains(r3);	 Catch:{ IllegalArgumentException -> 0x004d }
        if (r0 != 0) goto L_0x0022;
    L_0x0014:
        r0 = sDelayedAnims;	 Catch:{ IllegalArgumentException -> 0x004f }
        r0 = r0.get();	 Catch:{ IllegalArgumentException -> 0x004f }
        r0 = (java.util.ArrayList) r0;	 Catch:{ IllegalArgumentException -> 0x004f }
        r0 = r0.contains(r3);	 Catch:{ IllegalArgumentException -> 0x004f }
        if (r0 == 0) goto L_0x004a;
    L_0x0022:
        r0 = r3.mRunning;	 Catch:{ IllegalArgumentException -> 0x0051 }
        if (r0 == 0) goto L_0x0047;
    L_0x0026:
        r0 = r3.mListeners;	 Catch:{ IllegalArgumentException -> 0x0051 }
        if (r0 == 0) goto L_0x0047;
    L_0x002a:
        r0 = r3.mListeners;
        r0 = r0.clone();
        r0 = (java.util.ArrayList) r0;
        r2 = r0.iterator();
    L_0x0036:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0047;
    L_0x003c:
        r0 = r2.next();
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener) r0;
        r0.onAnimationCancel(r3);
        if (r1 == 0) goto L_0x0036;
    L_0x0047:
        r3.endAnimation();
    L_0x004a:
        return;
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.cancel():void");
    }

    public ValueAnimator clone() {
        int i = 0;
        boolean z = Animator.a;
        ValueAnimator valueAnimator = (ValueAnimator) super.clone();
        if (this.mUpdateListeners != null) {
            ArrayList arrayList = this.mUpdateListeners;
            valueAnimator.mUpdateListeners = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                valueAnimator.mUpdateListeners.add(arrayList.get(i2));
                i2++;
                if (z) {
                    break;
                }
            }
        }
        valueAnimator.mSeekTime = -1;
        valueAnimator.mPlayingBackwards = false;
        valueAnimator.mCurrentIteration = 0;
        valueAnimator.mInitialized = false;
        valueAnimator.mPlayingState = 0;
        valueAnimator.mStartedDelay = false;
        PropertyValuesHolder[] propertyValuesHolderArr = this.mValues;
        if (propertyValuesHolderArr != null) {
            int length = propertyValuesHolderArr.length;
            valueAnimator.mValues = new PropertyValuesHolder[length];
            valueAnimator.mValuesMap = new HashMap(length);
            while (i < length) {
                PropertyValuesHolder clone = propertyValuesHolderArr[i].clone();
                valueAnimator.mValues[i] = clone;
                valueAnimator.mValuesMap.put(clone.getPropertyName(), clone);
                i++;
                if (z) {
                    break;
                }
            }
        }
        return valueAnimator;
    }

    public static ValueAnimator ofFloat(float[] fArr) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(fArr);
        return valueAnimator;
    }

    static {
        String[] strArr = new String[4];
        String str = "3^|g~$Qy\u007fz\u0011PbR";
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
                        i3 = 101;
                        break;
                    case ay.f /*1*/:
                        i3 = 63;
                        break;
                    case ay.n /*2*/:
                        i3 = 16;
                        break;
                    case ay.p /*3*/:
                        i3 = 18;
                        break;
                    default:
                        i3 = 27;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "$Qy\u007fz\u0011Pba;\b^i2t\u000bSi2y\u0000\u001fbguEP~2W\nP`wiEKx`~\u0004[c";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "$Qy\u007fz\u0011Pba;\u0006^~|t\u0011\u001fxsm\u0000\u001f~w|\u0004Kyd~E[e`z\u0011V\u007f|!E";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    sAnimationHandler = new ThreadLocal();
                    sAnimations = new ThreadLocal() {
                        protected Object initialValue() {
                            return initialValue();
                        }

                        protected ArrayList initialValue() {
                            return new ArrayList();
                        }
                    };
                    sPendingAnimations = new ThreadLocal() {
                        protected ArrayList initialValue() {
                            return new ArrayList();
                        }

                        protected Object initialValue() {
                            return initialValue();
                        }
                    };
                    sDelayedAnims = new ThreadLocal() {
                        protected Object initialValue() {
                            return initialValue();
                        }

                        protected ArrayList initialValue() {
                            return new ArrayList();
                        }
                    };
                    sEndingAnims = new ThreadLocal() {
                        protected Object initialValue() {
                            return initialValue();
                        }

                        protected ArrayList initialValue() {
                            return new ArrayList();
                        }
                    };
                    sReadyAnims = new ThreadLocal() {
                        protected ArrayList initialValue() {
                            return new ArrayList();
                        }

                        protected Object initialValue() {
                            return initialValue();
                        }
                    };
                    sDefaultInterpolator = new AccelerateDecelerateInterpolator();
                    sFrameDelay = 10;
                default:
                    strArr2[i] = str;
                    str = "o\u001f02;";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Animator clone() {
        return clone();
    }

    public void setStartDelay(long j) {
        this.mStartDelay = j;
    }

    static ThreadLocal access$200() {
        return sPendingAnimations;
    }
}
