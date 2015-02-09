package android.support.v4.widget;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ViewDragHelper {
    private static final Interpolator sInterpolator;
    private static final String[] z;
    private int mActivePointerId;
    private final Callback mCallback;
    private View mCapturedView;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private ScrollerCompat mScroller;
    private final Runnable mSetIdleRunnable;
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;

    public abstract class Callback {
        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public abstract boolean tryCaptureView(View view, int i);

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onViewCaptured(View view, int i) {
        }

        public void onViewReleased(View view, float f, float f2) {
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return 0;
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return 0;
        }
    }

    private ViewDragHelper(Context context, ViewGroup viewGroup, Callback callback) {
        this.mActivePointerId = -1;
        this.mSetIdleRunnable = new Runnable() {
            final ViewDragHelper this$0;

            public void run() {
                this.this$0.setDragState(0);
            }

            {
                this.this$0 = r1;
            }
        };
        if (viewGroup == null) {
            throw new IllegalArgumentException(z[1]);
        } else if (callback == null) {
            try {
                throw new IllegalArgumentException(z[2]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else {
            this.mParentView = viewGroup;
            this.mCallback = callback;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.mEdgeSize = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
            this.mMaxVelocity = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.mMinVelocity = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.mScroller = ScrollerCompat.create(context, sInterpolator);
        }
    }

    static {
        String[] strArr = new String[4];
        String str = "t\u0005\u000b=\u0014CD\u00166\u000fC\b\u0000\u0010\u001aG\u0010\u0010!\u001eS2\f6\fv\u0010E<\u000eC\u0017\f7\u001e\u0017\u000b\u0003s\u001a\u0017\u0007\u0004?\u0017\u0017\u0010\ns8V\b\t1\u001aT\u000fF<\u0015a\r\u0000$)R\b\u00002\bR\u0000";
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
                        i3 = 55;
                        break;
                    case ay.f /*1*/:
                        i3 = 100;
                        break;
                    case ay.n /*2*/:
                        i3 = 101;
                        break;
                    case ay.p /*3*/:
                        i3 = 83;
                        break;
                    default:
                        i3 = 123;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "t\u0005\t?\u0019V\u0007\u000es\u0016V\u001dE=\u0014CD\u00076[Y\u0011\t?";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "T\u0005\u0015'\u000eE\u0001&;\u0012[\u00003:\u001e@^E#\u001aE\u0005\b6\u000fR\u0016E>\u000eD\u0010E1\u001e\u0017\u0005E7\u001eD\u0007\u0000=\u001fV\n\u0011s\u0014QD\u0011;\u001e\u00172\f6\fs\u0016\u000443R\b\u00156\t\u0010\u0017E'\tV\u0007\u000e6\u001f\u0017\u0014\u0004!\u001eY\u0010E%\u0012R\u0013E{";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    sInterpolator = new Interpolator() {
                        public float getInterpolation(float f) {
                            float f2 = f - 1.0f;
                            return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
                        }
                    };
                default:
                    strArr2[i] = str;
                    str = "g\u0005\u00176\u0015CD\u0013:\u001e@D\b2\u0002\u0017\n\n'[U\u0001E=\u000e[\b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    boolean tryCaptureViewForDrag(View view, int i) {
        try {
            if (view == this.mCapturedView) {
                if (this.mActivePointerId == i) {
                    return true;
                }
            }
            try {
                if (view != null) {
                    try {
                        if (this.mCallback.tryCaptureView(view, i)) {
                            this.mActivePointerId = i;
                            captureChildView(view, i);
                            return true;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                return false;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public int getEdgeSize() {
        return this.mEdgeSize;
    }

    private boolean checkTouchSlop(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        try {
            boolean z = this.mCallback.getViewHorizontalDragRange(view) > 0;
            try {
                boolean z2;
                if (this.mCallback.getViewVerticalDragRange(view) > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    try {
                        return (f * f) + (f2 * f2) > ((float) (this.mTouchSlop * this.mTouchSlop));
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } else if (z) {
                    try {
                        return Math.abs(f) > ((float) this.mTouchSlop);
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    try {
                        return Math.abs(f2) > ((float) this.mTouchSlop);
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    void setDragState(int i) {
        try {
            try {
                if (this.mDragState != i) {
                    this.mDragState = i;
                    this.mCallback.onViewDragStateChanged(i);
                    if (this.mDragState == 0) {
                        this.mCapturedView = null;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int computeAxisDuration(int r5, int r6, int r7) {
        /*
        r4_this = this;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r5 != 0) goto L_0x0006;
    L_0x0004:
        r0 = 0;
    L_0x0005:
        return r0;
    L_0x0006:
        r0 = r4.mParentView;
        r0 = r0.getWidth();
        r1 = r0 / 2;
        r2 = java.lang.Math.abs(r5);
        r2 = (float) r2;
        r0 = (float) r0;
        r0 = r2 / r0;
        r0 = java.lang.Math.min(r3, r0);
        r2 = (float) r1;
        r1 = (float) r1;
        r0 = r4.distanceInfluenceForSnapDuration(r0);
        r0 = r0 * r1;
        r0 = r0 + r2;
        r1 = java.lang.Math.abs(r6);
        if (r1 <= 0) goto L_0x003b;
    L_0x0028:
        r2 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r1 = (float) r1;
        r0 = r0 / r1;
        r0 = java.lang.Math.abs(r0);
        r0 = r0 * r2;
        r0 = java.lang.Math.round(r0);
        r0 = r0 * 4;
        r1 = android.support.v4.widget.SlidingPaneLayout.a;
        if (r1 == 0) goto L_0x0047;
    L_0x003b:
        r0 = java.lang.Math.abs(r5);
        r0 = (float) r0;
        r1 = (float) r7;
        r0 = r0 / r1;
        r0 = r0 + r3;
        r1 = 1132462080; // 0x43800000 float:256.0 double:5.59510609E-315;
        r0 = r0 * r1;
        r0 = (int) r0;
    L_0x0047:
        r1 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        r0 = java.lang.Math.min(r0, r1);
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ViewDragHelper.computeAxisDuration(int, int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean checkNewEdgeDrag(float r5, float r6, int r7, int r8) {
        /*
        r4_this = this;
        r0 = 0;
        r1 = java.lang.Math.abs(r5);
        r2 = java.lang.Math.abs(r6);
        r3 = r4.mInitialEdgesTouched;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r3 = r3[r7];	 Catch:{ IllegalArgumentException -> 0x0032 }
        r3 = r3 & r8;
        if (r3 != r8) goto L_0x0031;
    L_0x0010:
        r3 = r4.mTrackingEdges;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3 = r3 & r8;
        if (r3 == 0) goto L_0x0031;
    L_0x0015:
        r3 = r4.mEdgeDragsLocked;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r3 = r3[r7];	 Catch:{ IllegalArgumentException -> 0x0036 }
        r3 = r3 & r8;
        if (r3 == r8) goto L_0x0031;
    L_0x001c:
        r3 = r4.mEdgeDragsInProgress;	 Catch:{ IllegalArgumentException -> 0x0038 }
        r3 = r3[r7];	 Catch:{ IllegalArgumentException -> 0x0038 }
        r3 = r3 & r8;
        if (r3 == r8) goto L_0x0031;
    L_0x0023:
        r3 = r4.mTouchSlop;	 Catch:{ IllegalArgumentException -> 0x003a }
        r3 = (float) r3;
        r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r3 > 0) goto L_0x003e;
    L_0x002a:
        r3 = r4.mTouchSlop;	 Catch:{ IllegalArgumentException -> 0x003c }
        r3 = (float) r3;
        r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r3 > 0) goto L_0x003e;
    L_0x0031:
        return r0;
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r2 = r2 * r3;
        r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x0057;
    L_0x0045:
        r2 = r4.mCallback;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r2 = r2.onEdgeLock(r8);	 Catch:{ IllegalArgumentException -> 0x0055 }
        if (r2 == 0) goto L_0x0057;
    L_0x004d:
        r1 = r4.mEdgeDragsLocked;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r2 = r1[r7];	 Catch:{ IllegalArgumentException -> 0x0055 }
        r2 = r2 | r8;
        r1[r7] = r2;	 Catch:{ IllegalArgumentException -> 0x0055 }
        goto L_0x0031;
    L_0x0055:
        r0 = move-exception;
        throw r0;
    L_0x0057:
        r2 = r4.mEdgeDragsInProgress;	 Catch:{ IllegalArgumentException -> 0x0067 }
        r2 = r2[r7];	 Catch:{ IllegalArgumentException -> 0x0067 }
        r2 = r2 & r8;
        if (r2 != 0) goto L_0x0031;
    L_0x005e:
        r2 = r4.mTouchSlop;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r2 = (float) r2;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 <= 0) goto L_0x0031;
    L_0x0065:
        r0 = 1;
        goto L_0x0031;
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ViewDragHelper.checkNewEdgeDrag(float, float, int, int):boolean");
    }

    private boolean forceSettleCapturedViewAt(int i, int i2, int i3, int i4) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            try {
                this.mScroller.abortAnimation();
                setDragState(0);
                return false;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.mScroller.startScroll(left, top, i5, i6, computeSettleDuration(this.mCapturedView, i5, i6, i3, i4));
        setDragState(2);
        return true;
    }

    private void dragTo(int i, int i2, int i3, int i4) {
        int clampViewPositionHorizontal;
        int clampViewPositionVertical;
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        if (i3 != 0) {
            clampViewPositionHorizontal = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, i, i3);
            this.mCapturedView.offsetLeftAndRight(clampViewPositionHorizontal - left);
        } else {
            clampViewPositionHorizontal = i;
        }
        if (i4 != 0) {
            clampViewPositionVertical = this.mCallback.clampViewPositionVertical(this.mCapturedView, i2, i4);
            this.mCapturedView.offsetTopAndBottom(clampViewPositionVertical - top);
        } else {
            clampViewPositionVertical = i2;
        }
        if (i3 != 0 || i4 != 0) {
            this.mCallback.onViewPositionChanged(this.mCapturedView, clampViewPositionHorizontal, clampViewPositionVertical, clampViewPositionHorizontal - left, clampViewPositionVertical - top);
        }
    }

    public boolean checkTouchSlop(int i, int i2) {
        try {
            if (!isPointerDown(i2)) {
                return false;
            }
            boolean z;
            boolean z2;
            if ((i & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            float f = this.mLastMotionX[i2] - this.mInitialMotionX[i2];
            float f2 = this.mLastMotionY[i2] - this.mInitialMotionY[i2];
            if (z && z2) {
                try {
                    return (f * f) + (f2 * f2) > ((float) (this.mTouchSlop * this.mTouchSlop));
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } else if (z) {
                try {
                    return Math.abs(f) > ((float) this.mTouchSlop);
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } else if (!z2) {
                return false;
            } else {
                try {
                    return Math.abs(f2) > ((float) this.mTouchSlop);
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public static ViewDragHelper create(ViewGroup viewGroup, Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    public void setEdgeTrackingEnabled(int i) {
        this.mTrackingEdges = i;
    }

    public boolean smoothSlideViewTo(View view, int i, int i2) {
        this.mCapturedView = view;
        this.mActivePointerId = -1;
        boolean forceSettleCapturedViewAt = forceSettleCapturedViewAt(i, i2, 0, 0);
        try {
            if (!forceSettleCapturedViewAt) {
                if (this.mDragState == 0) {
                    if (this.mCapturedView != null) {
                        this.mCapturedView = null;
                    }
                }
            }
            return forceSettleCapturedViewAt;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private void releaseViewForPointerUp() {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
        dispatchViewReleased(clampMag(VelocityTrackerCompat.getXVelocity(this.mVelocityTracker, this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), clampMag(VelocityTrackerCompat.getYVelocity(this.mVelocityTracker, this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
    }

    private void reportNewEdgeDrags(float f, float f2, int i) {
        int i2 = 1;
        if (!checkNewEdgeDrag(f, f2, i, 1)) {
            i2 = 0;
        }
        if (checkNewEdgeDrag(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (checkNewEdgeDrag(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (checkNewEdgeDrag(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            try {
                int[] iArr = this.mEdgeDragsInProgress;
                iArr[i] = iArr[i] | i2;
                this.mCallback.onEdgeDragStarted(i2, i);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public int getViewDragState() {
        return this.mDragState;
    }

    private void clearMotionHistory(int i) {
        try {
            if (this.mInitialMotionX != null) {
                this.mInitialMotionX[i] = 0.0f;
                this.mInitialMotionY[i] = 0.0f;
                this.mLastMotionX[i] = 0.0f;
                this.mLastMotionY[i] = 0.0f;
                this.mInitialEdgesTouched[i] = 0;
                this.mEdgeDragsInProgress[i] = 0;
                this.mEdgeDragsLocked[i] = 0;
                this.mPointersDown &= (1 << i) ^ -1;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void setMinVelocity(float f) {
        this.mMinVelocity = f;
    }

    private void ensureMotionHistorySizeForId(int i) {
        try {
            if (this.mInitialMotionX == null || this.mInitialMotionX.length <= i) {
                Object obj = new Object[(i + 1)];
                Object obj2 = new Object[(i + 1)];
                Object obj3 = new Object[(i + 1)];
                Object obj4 = new Object[(i + 1)];
                Object obj5 = new Object[(i + 1)];
                Object obj6 = new Object[(i + 1)];
                Object obj7 = new Object[(i + 1)];
                try {
                    if (this.mInitialMotionX != null) {
                        System.arraycopy(this.mInitialMotionX, 0, obj, 0, this.mInitialMotionX.length);
                        System.arraycopy(this.mInitialMotionY, 0, obj2, 0, this.mInitialMotionY.length);
                        System.arraycopy(this.mLastMotionX, 0, obj3, 0, this.mLastMotionX.length);
                        System.arraycopy(this.mLastMotionY, 0, obj4, 0, this.mLastMotionY.length);
                        System.arraycopy(this.mInitialEdgesTouched, 0, obj5, 0, this.mInitialEdgesTouched.length);
                        System.arraycopy(this.mEdgeDragsInProgress, 0, obj6, 0, this.mEdgeDragsInProgress.length);
                        System.arraycopy(this.mEdgeDragsLocked, 0, obj7, 0, this.mEdgeDragsLocked.length);
                    }
                    this.mInitialMotionX = obj;
                    this.mInitialMotionY = obj2;
                    this.mLastMotionX = obj3;
                    this.mLastMotionY = obj4;
                    this.mInitialEdgesTouched = obj5;
                    this.mEdgeDragsInProgress = obj6;
                    this.mEdgeDragsLocked = obj7;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static ViewDragHelper create(ViewGroup viewGroup, float f, Callback callback) {
        ViewDragHelper create = create(viewGroup, callback);
        create.mTouchSlop = (int) (((float) create.mTouchSlop) * (1.0f / f));
        return create;
    }

    public View getCapturedView() {
        return this.mCapturedView;
    }

    private float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    private float clampMag(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            return f <= 0.0f ? -f3 : f3;
        } else {
            return f;
        }
    }

    public boolean settleCapturedViewAt(int i, int i2) {
        try {
            if (this.mReleaseInProgress) {
                return forceSettleCapturedViewAt(i, i2, (int) VelocityTrackerCompat.getXVelocity(this.mVelocityTracker, this.mActivePointerId), (int) VelocityTrackerCompat.getYVelocity(this.mVelocityTracker, this.mActivePointerId));
            }
            throw new IllegalStateException(z[0]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void clearMotionHistory() {
        try {
            if (this.mInitialMotionX != null) {
                Arrays.fill(this.mInitialMotionX, 0.0f);
                Arrays.fill(this.mInitialMotionY, 0.0f);
                Arrays.fill(this.mLastMotionX, 0.0f);
                Arrays.fill(this.mLastMotionY, 0.0f);
                Arrays.fill(this.mInitialEdgesTouched, 0);
                Arrays.fill(this.mEdgeDragsInProgress, 0);
                Arrays.fill(this.mEdgeDragsLocked, 0);
                this.mPointersDown = 0;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private int computeSettleDuration(View view, int i, int i2, int i3, int i4) {
        float f;
        int clampMag = clampMag(i3, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int clampMag2 = clampMag(i4, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(clampMag);
        int abs4 = Math.abs(clampMag2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        float f2 = clampMag != 0 ? ((float) abs3) / ((float) i5) : ((float) abs) / ((float) i6);
        if (clampMag2 != 0) {
            f = ((float) abs4) / ((float) i5);
        } else {
            f = ((float) abs2) / ((float) i6);
        }
        return (int) ((f2 * ((float) computeAxisDuration(i, clampMag, this.mCallback.getViewHorizontalDragRange(view)))) + (f * ((float) computeAxisDuration(i2, clampMag2, this.mCallback.getViewVerticalDragRange(view)))));
    }

    public void cancel() {
        try {
            this.mActivePointerId = -1;
            clearMotionHistory();
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean isCapturedViewUnder(int i, int i2) {
        return isViewUnder(this.mCapturedView, i, i2);
    }

    public void captureChildView(View view, int i) {
        try {
            if (view.getParent() != this.mParentView) {
                throw new IllegalArgumentException(z[3] + this.mParentView + ")");
            }
            this.mCapturedView = view;
            this.mActivePointerId = i;
            this.mCallback.onViewCaptured(view, i);
            setDragState(1);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean isPointerDown(int i) {
        try {
            return (this.mPointersDown & (1 << i)) != 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void dispatchViewReleased(float f, float f2) {
        try {
            this.mReleaseInProgress = true;
            this.mCallback.onViewReleased(this.mCapturedView, f, f2);
            this.mReleaseInProgress = false;
            if (this.mDragState == 1) {
                setDragState(0);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private int getEdgesTouched(int i, int i2) {
        int i3 = 0;
        if (i < this.mParentView.getLeft() + this.mEdgeSize) {
            i3 = 1;
        }
        if (i2 < this.mParentView.getTop() + this.mEdgeSize) {
            i3 |= 4;
        }
        if (i > this.mParentView.getRight() - this.mEdgeSize) {
            i3 |= 2;
        }
        return i2 > this.mParentView.getBottom() - this.mEdgeSize ? i3 | 8 : i3;
    }

    public boolean checkTouchSlop(int i) {
        int i2 = SlidingPaneLayout.a;
        int length = this.mInitialMotionX.length;
        int i3 = 0;
        while (i3 < length) {
            try {
                if (checkTouchSlop(i, i3)) {
                    return true;
                }
                i3++;
                if (i2 != 0) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isViewUnder(android.view.View r3, int r4, int r5) {
        /*
        r2_this = this;
        r0 = 0;
        if (r3 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r3.getLeft();	 Catch:{ IllegalArgumentException -> 0x001e }
        if (r4 < r1) goto L_0x0003;
    L_0x000a:
        r1 = r3.getRight();	 Catch:{ IllegalArgumentException -> 0x0020 }
        if (r4 >= r1) goto L_0x0003;
    L_0x0010:
        r1 = r3.getTop();	 Catch:{ IllegalArgumentException -> 0x0022 }
        if (r5 < r1) goto L_0x0003;
    L_0x0016:
        r1 = r3.getBottom();	 Catch:{ IllegalArgumentException -> 0x0024 }
        if (r5 >= r1) goto L_0x0003;
    L_0x001c:
        r0 = 1;
        goto L_0x0003;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ViewDragHelper.isViewUnder(android.view.View, int, int):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View findTopChildUnder(int r5, int r6) {
        /*
        r4_this = this;
        r2 = android.support.v4.widget.SlidingPaneLayout.a;
        r0 = r4.mParentView;
        r0 = r0.getChildCount();
        r0 = r0 + -1;
        r1 = r0;
    L_0x000b:
        if (r1 < 0) goto L_0x003e;
    L_0x000d:
        r0 = r4.mParentView;
        r3 = r4.mCallback;
        r3 = r3.getOrderedChildIndex(r1);
        r0 = r0.getChildAt(r3);
        r3 = r0.getLeft();	 Catch:{ IllegalArgumentException -> 0x0032 }
        if (r5 < r3) goto L_0x003a;
    L_0x001f:
        r3 = r0.getRight();	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r5 >= r3) goto L_0x003a;
    L_0x0025:
        r3 = r0.getTop();	 Catch:{ IllegalArgumentException -> 0x0036 }
        if (r6 < r3) goto L_0x003a;
    L_0x002b:
        r3 = r0.getBottom();	 Catch:{ IllegalArgumentException -> 0x0038 }
        if (r6 >= r3) goto L_0x003a;
    L_0x0031:
        return r0;
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r0 = r1 + -1;
        if (r2 == 0) goto L_0x0040;
    L_0x003e:
        r0 = 0;
        goto L_0x0031;
    L_0x0040:
        r1 = r0;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ViewDragHelper.findTopChildUnder(int, int):android.view.View");
    }

    private int clampMag(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            return i <= 0 ? -i3 : i3;
        } else {
            return i;
        }
    }

    private void saveInitialMotion(float f, float f2, int i) {
        ensureMotionHistorySizeForId(i);
        float[] fArr = this.mInitialMotionX;
        this.mLastMotionX[i] = f;
        fArr[i] = f;
        fArr = this.mInitialMotionY;
        this.mLastMotionY[i] = f2;
        fArr[i] = f2;
        this.mInitialEdgesTouched[i] = getEdgesTouched((int) f, (int) f2);
        this.mPointersDown |= 1 << i;
    }

    public int getTouchSlop() {
        return this.mTouchSlop;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldInterceptTouchEvent(android.view.MotionEvent r17) {
        /*
        r16_this = this;
        r3 = android.support.v4.widget.SlidingPaneLayout.a;
        r1 = android.support.v4.view.MotionEventCompat.getActionMasked(r17);
        r4 = android.support.v4.view.MotionEventCompat.getActionIndex(r17);
        if (r1 != 0) goto L_0x000f;
    L_0x000c:
        r16.cancel();	 Catch:{ IllegalArgumentException -> 0x0032 }
    L_0x000f:
        r0 = r16;
        r2 = r0.mVelocityTracker;	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r2 != 0) goto L_0x001d;
    L_0x0015:
        r2 = android.view.VelocityTracker.obtain();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r0 = r16;
        r0.mVelocityTracker = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x001d:
        r0 = r16;
        r2 = r0.mVelocityTracker;
        r0 = r17;
        r2.addMovement(r0);
        switch(r1) {
            case 0: goto L_0x0036;
            case 1: goto L_0x017e;
            case 2: goto L_0x00d3;
            case 3: goto L_0x017e;
            case 4: goto L_0x0029;
            case 5: goto L_0x007f;
            case 6: goto L_0x0171;
            default: goto L_0x0029;
        };
    L_0x0029:
        r0 = r16;
        r1 = r0.mDragState;	 Catch:{ IllegalArgumentException -> 0x01a0 }
        r2 = 1;
        if (r1 != r2) goto L_0x01a2;
    L_0x0030:
        r1 = 1;
    L_0x0031:
        return r1;
    L_0x0032:
        r1 = move-exception;
        throw r1;
    L_0x0034:
        r1 = move-exception;
        throw r1;
    L_0x0036:
        r1 = r17.getX();
        r2 = r17.getY();
        r5 = 0;
        r0 = r17;
        r5 = android.support.v4.view.MotionEventCompat.getPointerId(r0, r5);
        r0 = r16;
        r0.saveInitialMotion(r1, r2, r5);
        r1 = (int) r1;
        r2 = (int) r2;
        r0 = r16;
        r1 = r0.findTopChildUnder(r1, r2);
        r0 = r16;
        r2 = r0.mCapturedView;	 Catch:{ IllegalArgumentException -> 0x0185 }
        if (r1 != r2) goto L_0x0064;
    L_0x0058:
        r0 = r16;
        r2 = r0.mDragState;	 Catch:{ IllegalArgumentException -> 0x0187 }
        r6 = 2;
        if (r2 != r6) goto L_0x0064;
    L_0x005f:
        r0 = r16;
        r0.tryCaptureViewForDrag(r1, r5);	 Catch:{ IllegalArgumentException -> 0x0187 }
    L_0x0064:
        r0 = r16;
        r1 = r0.mInitialEdgesTouched;
        r1 = r1[r5];
        r0 = r16;
        r2 = r0.mTrackingEdges;	 Catch:{ IllegalArgumentException -> 0x0189 }
        r2 = r2 & r1;
        if (r2 == 0) goto L_0x0029;
    L_0x0071:
        r0 = r16;
        r2 = r0.mCallback;	 Catch:{ IllegalArgumentException -> 0x0189 }
        r0 = r16;
        r6 = r0.mTrackingEdges;	 Catch:{ IllegalArgumentException -> 0x0189 }
        r1 = r1 & r6;
        r2.onEdgeTouched(r1, r5);	 Catch:{ IllegalArgumentException -> 0x0189 }
        if (r3 == 0) goto L_0x0029;
    L_0x007f:
        r0 = r17;
        r1 = android.support.v4.view.MotionEventCompat.getPointerId(r0, r4);
        r0 = r17;
        r2 = android.support.v4.view.MotionEventCompat.getX(r0, r4);
        r0 = r17;
        r5 = android.support.v4.view.MotionEventCompat.getY(r0, r4);
        r0 = r16;
        r0.saveInitialMotion(r2, r5, r1);
        r0 = r16;
        r6 = r0.mDragState;
        if (r6 != 0) goto L_0x00b7;
    L_0x009c:
        r0 = r16;
        r6 = r0.mInitialEdgesTouched;
        r6 = r6[r1];
        r0 = r16;
        r7 = r0.mTrackingEdges;	 Catch:{ IllegalArgumentException -> 0x018b }
        r7 = r7 & r6;
        if (r7 == 0) goto L_0x00b5;
    L_0x00a9:
        r0 = r16;
        r7 = r0.mCallback;	 Catch:{ IllegalArgumentException -> 0x018b }
        r0 = r16;
        r8 = r0.mTrackingEdges;	 Catch:{ IllegalArgumentException -> 0x018b }
        r6 = r6 & r8;
        r7.onEdgeTouched(r6, r1);	 Catch:{ IllegalArgumentException -> 0x018b }
    L_0x00b5:
        if (r3 == 0) goto L_0x0029;
    L_0x00b7:
        r0 = r16;
        r6 = r0.mDragState;	 Catch:{ IllegalArgumentException -> 0x018d }
        r7 = 2;
        if (r6 != r7) goto L_0x0029;
    L_0x00be:
        r2 = (int) r2;
        r5 = (int) r5;
        r0 = r16;
        r2 = r0.findTopChildUnder(r2, r5);
        r0 = r16;
        r5 = r0.mCapturedView;	 Catch:{ IllegalArgumentException -> 0x018f }
        if (r2 != r5) goto L_0x00d1;
    L_0x00cc:
        r0 = r16;
        r0.tryCaptureViewForDrag(r2, r1);	 Catch:{ IllegalArgumentException -> 0x018f }
    L_0x00d1:
        if (r3 == 0) goto L_0x0029;
    L_0x00d3:
        r5 = android.support.v4.view.MotionEventCompat.getPointerCount(r17);
        r1 = 0;
        r2 = r1;
    L_0x00d9:
        if (r2 >= r5) goto L_0x016c;
    L_0x00db:
        r0 = r17;
        r6 = android.support.v4.view.MotionEventCompat.getPointerId(r0, r2);
        r0 = r17;
        r1 = android.support.v4.view.MotionEventCompat.getX(r0, r2);
        r0 = r17;
        r7 = android.support.v4.view.MotionEventCompat.getY(r0, r2);
        r0 = r16;
        r8 = r0.mInitialMotionX;
        r8 = r8[r6];
        r8 = r1 - r8;
        r0 = r16;
        r9 = r0.mInitialMotionY;
        r9 = r9[r6];
        r9 = r7 - r9;
        r1 = (int) r1;
        r7 = (int) r7;
        r0 = r16;
        r7 = r0.findTopChildUnder(r1, r7);
        if (r7 == 0) goto L_0x0193;
    L_0x0107:
        r0 = r16;
        r1 = r0.checkTouchSlop(r7, r8, r9);	 Catch:{ IllegalArgumentException -> 0x0191 }
        if (r1 == 0) goto L_0x0193;
    L_0x010f:
        r1 = 1;
    L_0x0110:
        if (r1 == 0) goto L_0x014e;
    L_0x0112:
        r10 = r7.getLeft();
        r11 = (int) r8;
        r11 = r11 + r10;
        r0 = r16;
        r12 = r0.mCallback;
        r13 = (int) r8;
        r11 = r12.clampViewPositionHorizontal(r7, r11, r13);
        r12 = r7.getTop();
        r13 = (int) r9;
        r13 = r13 + r12;
        r0 = r16;
        r14 = r0.mCallback;
        r15 = (int) r9;
        r13 = r14.clampViewPositionVertical(r7, r13, r15);
        r0 = r16;
        r14 = r0.mCallback;
        r14 = r14.getViewHorizontalDragRange(r7);
        r0 = r16;
        r15 = r0.mCallback;
        r15 = r15.getViewVerticalDragRange(r7);
        if (r14 == 0) goto L_0x0146;
    L_0x0142:
        if (r14 <= 0) goto L_0x014e;
    L_0x0144:
        if (r11 != r10) goto L_0x014e;
    L_0x0146:
        if (r15 == 0) goto L_0x016c;
    L_0x0148:
        if (r15 <= 0) goto L_0x014e;
    L_0x014a:
        if (r13 != r12) goto L_0x014e;
    L_0x014c:
        if (r3 == 0) goto L_0x016c;
    L_0x014e:
        r0 = r16;
        r0.reportNewEdgeDrags(r8, r9, r6);	 Catch:{ IllegalArgumentException -> 0x0196 }
        r0 = r16;
        r8 = r0.mDragState;	 Catch:{ IllegalArgumentException -> 0x0196 }
        r9 = 1;
        if (r8 != r9) goto L_0x015c;
    L_0x015a:
        if (r3 == 0) goto L_0x016c;
    L_0x015c:
        if (r1 == 0) goto L_0x0168;
    L_0x015e:
        r0 = r16;
        r1 = r0.tryCaptureViewForDrag(r7, r6);	 Catch:{ IllegalArgumentException -> 0x019c }
        if (r1 == 0) goto L_0x0168;
    L_0x0166:
        if (r3 == 0) goto L_0x016c;
    L_0x0168:
        r1 = r2 + 1;
        if (r3 == 0) goto L_0x01a5;
    L_0x016c:
        r16.saveLastMotion(r17);
        if (r3 == 0) goto L_0x0029;
    L_0x0171:
        r0 = r17;
        r1 = android.support.v4.view.MotionEventCompat.getPointerId(r0, r4);
        r0 = r16;
        r0.clearMotionHistory(r1);	 Catch:{ IllegalArgumentException -> 0x0183 }
        if (r3 == 0) goto L_0x0029;
    L_0x017e:
        r16.cancel();	 Catch:{ IllegalArgumentException -> 0x0183 }
        goto L_0x0029;
    L_0x0183:
        r1 = move-exception;
        throw r1;
    L_0x0185:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0187 }
    L_0x0187:
        r1 = move-exception;
        throw r1;
    L_0x0189:
        r1 = move-exception;
        throw r1;
    L_0x018b:
        r1 = move-exception;
        throw r1;
    L_0x018d:
        r1 = move-exception;
        throw r1;
    L_0x018f:
        r1 = move-exception;
        throw r1;
    L_0x0191:
        r1 = move-exception;
        throw r1;
    L_0x0193:
        r1 = 0;
        goto L_0x0110;
    L_0x0196:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0198 }
    L_0x0198:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x019a }
    L_0x019a:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x019c }
    L_0x019c:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x019e }
    L_0x019e:
        r1 = move-exception;
        throw r1;
    L_0x01a0:
        r1 = move-exception;
        throw r1;
    L_0x01a2:
        r1 = 0;
        goto L_0x0031;
    L_0x01a5:
        r2 = r1;
        goto L_0x00d9;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ViewDragHelper.shouldInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void abort() {
        cancel();
        if (this.mDragState == 2) {
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            this.mScroller.abortAnimation();
            int currX2 = this.mScroller.getCurrX();
            int currY2 = this.mScroller.getCurrY();
            this.mCallback.onViewPositionChanged(this.mCapturedView, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        setDragState(0);
    }

    private void saveLastMotion(MotionEvent motionEvent) {
        int i = SlidingPaneLayout.a;
        int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
        int i2 = 0;
        while (i2 < pointerCount) {
            int pointerId = MotionEventCompat.getPointerId(motionEvent, i2);
            float x = MotionEventCompat.getX(motionEvent, i2);
            float y = MotionEventCompat.getY(motionEvent, i2);
            this.mLastMotionX[pointerId] = x;
            this.mLastMotionY[pointerId] = y;
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void processTouchEvent(android.view.MotionEvent r14) {
        /*
        r13_this = this;
        r2 = -1;
        r0 = 0;
        r12 = 1;
        r3 = android.support.v4.widget.SlidingPaneLayout.a;
        r1 = android.support.v4.view.MotionEventCompat.getActionMasked(r14);
        r4 = android.support.v4.view.MotionEventCompat.getActionIndex(r14);
        if (r1 != 0) goto L_0x0012;
    L_0x000f:
        r13.cancel();	 Catch:{ IllegalArgumentException -> 0x0025 }
    L_0x0012:
        r5 = r13.mVelocityTracker;	 Catch:{ IllegalArgumentException -> 0x0027 }
        if (r5 != 0) goto L_0x001c;
    L_0x0016:
        r5 = android.view.VelocityTracker.obtain();	 Catch:{ IllegalArgumentException -> 0x0027 }
        r13.mVelocityTracker = r5;	 Catch:{ IllegalArgumentException -> 0x0027 }
    L_0x001c:
        r5 = r13.mVelocityTracker;
        r5.addMovement(r14);
        switch(r1) {
            case 0: goto L_0x0029;
            case 1: goto L_0x0159;
            case 2: goto L_0x0092;
            case 3: goto L_0x0165;
            case 4: goto L_0x0024;
            case 5: goto L_0x0054;
            case 6: goto L_0x010f;
            default: goto L_0x0024;
        };
    L_0x0024:
        return;
    L_0x0025:
        r0 = move-exception;
        throw r0;
    L_0x0027:
        r0 = move-exception;
        throw r0;
    L_0x0029:
        r1 = r14.getX();
        r5 = r14.getY();
        r6 = android.support.v4.view.MotionEventCompat.getPointerId(r14, r0);
        r7 = (int) r1;
        r8 = (int) r5;
        r7 = r13.findTopChildUnder(r7, r8);
        r13.saveInitialMotion(r1, r5, r6);
        r13.tryCaptureViewForDrag(r7, r6);
        r1 = r13.mInitialEdgesTouched;
        r1 = r1[r6];
        r5 = r13.mTrackingEdges;	 Catch:{ IllegalArgumentException -> 0x0173 }
        r5 = r5 & r1;
        if (r5 == 0) goto L_0x0024;
    L_0x004a:
        r5 = r13.mCallback;	 Catch:{ IllegalArgumentException -> 0x0173 }
        r7 = r13.mTrackingEdges;	 Catch:{ IllegalArgumentException -> 0x0173 }
        r1 = r1 & r7;
        r5.onEdgeTouched(r1, r6);	 Catch:{ IllegalArgumentException -> 0x0173 }
        if (r3 == 0) goto L_0x0024;
    L_0x0054:
        r1 = android.support.v4.view.MotionEventCompat.getPointerId(r14, r4);
        r5 = android.support.v4.view.MotionEventCompat.getX(r14, r4);
        r6 = android.support.v4.view.MotionEventCompat.getY(r14, r4);
        r13.saveInitialMotion(r5, r6, r1);
        r7 = r13.mDragState;
        if (r7 != 0) goto L_0x0083;
    L_0x0067:
        r7 = (int) r5;
        r8 = (int) r6;
        r7 = r13.findTopChildUnder(r7, r8);
        r13.tryCaptureViewForDrag(r7, r1);
        r7 = r13.mInitialEdgesTouched;
        r7 = r7[r1];
        r8 = r13.mTrackingEdges;	 Catch:{ IllegalArgumentException -> 0x0175 }
        r8 = r8 & r7;
        if (r8 == 0) goto L_0x0081;
    L_0x0079:
        r8 = r13.mCallback;	 Catch:{ IllegalArgumentException -> 0x0175 }
        r9 = r13.mTrackingEdges;	 Catch:{ IllegalArgumentException -> 0x0175 }
        r7 = r7 & r9;
        r8.onEdgeTouched(r7, r1);	 Catch:{ IllegalArgumentException -> 0x0175 }
    L_0x0081:
        if (r3 == 0) goto L_0x0024;
    L_0x0083:
        r5 = (int) r5;
        r6 = (int) r6;
        r5 = r13.isCapturedViewUnder(r5, r6);	 Catch:{ IllegalArgumentException -> 0x0177 }
        if (r5 == 0) goto L_0x0024;
    L_0x008b:
        r5 = r13.mCapturedView;	 Catch:{ IllegalArgumentException -> 0x0179 }
        r13.tryCaptureViewForDrag(r5, r1);	 Catch:{ IllegalArgumentException -> 0x0179 }
        if (r3 == 0) goto L_0x0024;
    L_0x0092:
        r1 = r13.mDragState;	 Catch:{ IllegalArgumentException -> 0x0179 }
        if (r1 != r12) goto L_0x00ca;
    L_0x0096:
        r1 = r13.mActivePointerId;
        r1 = android.support.v4.view.MotionEventCompat.findPointerIndex(r14, r1);
        r5 = android.support.v4.view.MotionEventCompat.getX(r14, r1);
        r1 = android.support.v4.view.MotionEventCompat.getY(r14, r1);
        r6 = r13.mLastMotionX;
        r7 = r13.mActivePointerId;
        r6 = r6[r7];
        r5 = r5 - r6;
        r5 = (int) r5;
        r6 = r13.mLastMotionY;
        r7 = r13.mActivePointerId;
        r6 = r6[r7];
        r1 = r1 - r6;
        r1 = (int) r1;
        r6 = r13.mCapturedView;
        r6 = r6.getLeft();
        r6 = r6 + r5;
        r7 = r13.mCapturedView;
        r7 = r7.getTop();
        r7 = r7 + r1;
        r13.dragTo(r6, r7, r5, r1);
        r13.saveLastMotion(r14);
        if (r3 == 0) goto L_0x0024;
    L_0x00ca:
        r5 = android.support.v4.view.MotionEventCompat.getPointerCount(r14);
        r1 = r0;
    L_0x00cf:
        if (r1 >= r5) goto L_0x010a;
    L_0x00d1:
        r6 = android.support.v4.view.MotionEventCompat.getPointerId(r14, r1);
        r7 = android.support.v4.view.MotionEventCompat.getX(r14, r1);
        r8 = android.support.v4.view.MotionEventCompat.getY(r14, r1);
        r9 = r13.mInitialMotionX;
        r9 = r9[r6];
        r9 = r7 - r9;
        r10 = r13.mInitialMotionY;
        r10 = r10[r6];
        r10 = r8 - r10;
        r13.reportNewEdgeDrags(r9, r10, r6);	 Catch:{ IllegalArgumentException -> 0x017b }
        r11 = r13.mDragState;	 Catch:{ IllegalArgumentException -> 0x017b }
        if (r11 != r12) goto L_0x00f2;
    L_0x00f0:
        if (r3 == 0) goto L_0x010a;
    L_0x00f2:
        r7 = (int) r7;
        r8 = (int) r8;
        r7 = r13.findTopChildUnder(r7, r8);
        r8 = r13.checkTouchSlop(r7, r9, r10);	 Catch:{ IllegalArgumentException -> 0x017d }
        if (r8 == 0) goto L_0x0106;
    L_0x00fe:
        r6 = r13.tryCaptureViewForDrag(r7, r6);	 Catch:{ IllegalArgumentException -> 0x017f }
        if (r6 == 0) goto L_0x0106;
    L_0x0104:
        if (r3 == 0) goto L_0x010a;
    L_0x0106:
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x00cf;
    L_0x010a:
        r13.saveLastMotion(r14);
        if (r3 == 0) goto L_0x0024;
    L_0x010f:
        r4 = android.support.v4.view.MotionEventCompat.getPointerId(r14, r4);
        r1 = r13.mDragState;	 Catch:{ IllegalArgumentException -> 0x0183 }
        if (r1 != r12) goto L_0x0154;
    L_0x0117:
        r1 = r13.mActivePointerId;	 Catch:{ IllegalArgumentException -> 0x0183 }
        if (r4 != r1) goto L_0x0154;
    L_0x011b:
        r5 = android.support.v4.view.MotionEventCompat.getPointerCount(r14);
        r1 = r0;
        r0 = r2;
    L_0x0121:
        if (r1 >= r5) goto L_0x014f;
    L_0x0123:
        r6 = android.support.v4.view.MotionEventCompat.getPointerId(r14, r1);
        r7 = r13.mActivePointerId;	 Catch:{ IllegalArgumentException -> 0x0185 }
        if (r6 != r7) goto L_0x012d;
    L_0x012b:
        if (r3 == 0) goto L_0x014b;
    L_0x012d:
        r7 = android.support.v4.view.MotionEventCompat.getX(r14, r1);
        r8 = android.support.v4.view.MotionEventCompat.getY(r14, r1);
        r7 = (int) r7;
        r8 = (int) r8;
        r7 = r13.findTopChildUnder(r7, r8);	 Catch:{ IllegalArgumentException -> 0x0187 }
        r8 = r13.mCapturedView;	 Catch:{ IllegalArgumentException -> 0x0187 }
        if (r7 != r8) goto L_0x014b;
    L_0x013f:
        r7 = r13.mCapturedView;	 Catch:{ IllegalArgumentException -> 0x0187 }
        r6 = r13.tryCaptureViewForDrag(r7, r6);	 Catch:{ IllegalArgumentException -> 0x0187 }
        if (r6 == 0) goto L_0x014b;
    L_0x0147:
        r0 = r13.mActivePointerId;
        if (r3 == 0) goto L_0x014f;
    L_0x014b:
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0121;
    L_0x014f:
        if (r0 != r2) goto L_0x0154;
    L_0x0151:
        r13.releaseViewForPointerUp();	 Catch:{ IllegalArgumentException -> 0x0189 }
    L_0x0154:
        r13.clearMotionHistory(r4);	 Catch:{ IllegalArgumentException -> 0x018b }
        if (r3 == 0) goto L_0x0024;
    L_0x0159:
        r0 = r13.mDragState;	 Catch:{ IllegalArgumentException -> 0x018d }
        if (r0 != r12) goto L_0x0160;
    L_0x015d:
        r13.releaseViewForPointerUp();	 Catch:{ IllegalArgumentException -> 0x018d }
    L_0x0160:
        r13.cancel();	 Catch:{ IllegalArgumentException -> 0x018f }
        if (r3 == 0) goto L_0x0024;
    L_0x0165:
        r0 = r13.mDragState;	 Catch:{ IllegalArgumentException -> 0x0191 }
        if (r0 != r12) goto L_0x016e;
    L_0x0169:
        r0 = 0;
        r1 = 0;
        r13.dispatchViewReleased(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0191 }
    L_0x016e:
        r13.cancel();
        goto L_0x0024;
    L_0x0173:
        r0 = move-exception;
        throw r0;
    L_0x0175:
        r0 = move-exception;
        throw r0;
    L_0x0177:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0179 }
    L_0x0179:
        r0 = move-exception;
        throw r0;
    L_0x017b:
        r0 = move-exception;
        throw r0;
    L_0x017d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x017f }
    L_0x017f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0181 }
    L_0x0181:
        r0 = move-exception;
        throw r0;
    L_0x0183:
        r0 = move-exception;
        throw r0;
    L_0x0185:
        r0 = move-exception;
        throw r0;
    L_0x0187:
        r0 = move-exception;
        throw r0;
    L_0x0189:
        r0 = move-exception;
        throw r0;
    L_0x018b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x018d }
    L_0x018d:
        r0 = move-exception;
        throw r0;
    L_0x018f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0191 }
    L_0x0191:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ViewDragHelper.processTouchEvent(android.view.MotionEvent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean continueSettling(boolean r10) {
        /*
        r9_this = this;
        r8 = 2;
        r6 = 0;
        r0 = r9.mDragState;
        if (r0 != r8) goto L_0x006c;
    L_0x0006:
        r0 = r9.mScroller;
        r7 = r0.computeScrollOffset();
        r0 = r9.mScroller;
        r2 = r0.getCurrX();
        r0 = r9.mScroller;
        r3 = r0.getCurrY();
        r0 = r9.mCapturedView;
        r0 = r0.getLeft();
        r4 = r2 - r0;
        r0 = r9.mCapturedView;
        r0 = r0.getTop();
        r5 = r3 - r0;
        if (r4 == 0) goto L_0x002f;
    L_0x002a:
        r0 = r9.mCapturedView;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r0.offsetLeftAndRight(r4);	 Catch:{ IllegalArgumentException -> 0x0072 }
    L_0x002f:
        if (r5 == 0) goto L_0x0036;
    L_0x0031:
        r0 = r9.mCapturedView;	 Catch:{ IllegalArgumentException -> 0x0074 }
        r0.offsetTopAndBottom(r5);	 Catch:{ IllegalArgumentException -> 0x0074 }
    L_0x0036:
        if (r4 != 0) goto L_0x003a;
    L_0x0038:
        if (r5 == 0) goto L_0x0041;
    L_0x003a:
        r0 = r9.mCallback;	 Catch:{ IllegalArgumentException -> 0x0076 }
        r1 = r9.mCapturedView;	 Catch:{ IllegalArgumentException -> 0x0076 }
        r0.onViewPositionChanged(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0076 }
    L_0x0041:
        if (r7 == 0) goto L_0x0080;
    L_0x0043:
        r0 = r9.mScroller;	 Catch:{ IllegalArgumentException -> 0x0078 }
        r0 = r0.getFinalX();	 Catch:{ IllegalArgumentException -> 0x0078 }
        if (r2 != r0) goto L_0x0080;
    L_0x004b:
        r0 = r9.mScroller;	 Catch:{ IllegalArgumentException -> 0x0078 }
        r0 = r0.getFinalY();	 Catch:{ IllegalArgumentException -> 0x0078 }
        if (r3 != r0) goto L_0x0080;
    L_0x0053:
        r0 = r9.mScroller;
        r0.abortAnimation();
        r0 = r6;
    L_0x0059:
        if (r0 != 0) goto L_0x006c;
    L_0x005b:
        if (r10 == 0) goto L_0x0068;
    L_0x005d:
        r0 = r9.mParentView;	 Catch:{ IllegalArgumentException -> 0x007a }
        r1 = r9.mSetIdleRunnable;	 Catch:{ IllegalArgumentException -> 0x007a }
        r0.post(r1);	 Catch:{ IllegalArgumentException -> 0x007a }
        r0 = android.support.v4.widget.SlidingPaneLayout.a;	 Catch:{ IllegalArgumentException -> 0x007a }
        if (r0 == 0) goto L_0x006c;
    L_0x0068:
        r0 = 0;
        r9.setDragState(r0);	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x006c:
        r0 = r9.mDragState;	 Catch:{ IllegalArgumentException -> 0x007c }
        if (r0 != r8) goto L_0x007e;
    L_0x0070:
        r0 = 1;
    L_0x0071:
        return r0;
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r0 = move-exception;
        throw r0;
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        r0 = move-exception;
        throw r0;
    L_0x007e:
        r0 = r6;
        goto L_0x0071;
    L_0x0080:
        r0 = r7;
        goto L_0x0059;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ViewDragHelper.continueSettling(boolean):boolean");
    }
}
