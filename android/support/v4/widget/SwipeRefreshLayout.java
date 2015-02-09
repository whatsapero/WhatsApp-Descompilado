package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.app.Fragment;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class SwipeRefreshLayout extends ViewGroup {
    private static final int[] LAYOUT_ATTRS;
    private static final String LOG_TAG;
    private static final String[] z;
    private int mActivePointerId;
    private Animation mAlphaMaxAnimation;
    private Animation mAlphaStartAnimation;
    private final Animation mAnimateToCorrectPosition;
    private final Animation mAnimateToStartPosition;
    private int mCircleHeight;
    private CircleImageView mCircleView;
    private int mCircleViewIndex;
    private int mCircleWidth;
    private int mCurrentTargetOffsetTop;
    private final DecelerateInterpolator mDecelerateInterpolator;
    protected int mFrom;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    private OnRefreshListener mListener;
    private int mMediumAnimationDuration;
    private boolean mNotify;
    private boolean mOriginalOffsetCalculated;
    protected int mOriginalOffsetTop;
    private MaterialProgressDrawable mProgress;
    private AnimationListener mRefreshListener;
    private boolean mRefreshing;
    private boolean mReturningToStart;
    private boolean mScale;
    private Animation mScaleDownAnimation;
    private Animation mScaleDownToStartAnimation;
    private float mSpinnerFinalOffset;
    private float mStartingScale;
    private View mTarget;
    private float mTotalDragDistance;
    private int mTouchSlop;
    private boolean mUsingCustomStart;

    class AnonymousClass_4 extends Animation {
        final SwipeRefreshLayout this$0;
        final int val$endingAlpha;
        final int val$startingAlpha;

        AnonymousClass_4(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
            this.this$0 = swipeRefreshLayout;
            this.val$startingAlpha = i;
            this.val$endingAlpha = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.access$100(this.this$0).setAlpha((int) (((float) this.val$startingAlpha) + (((float) (this.val$endingAlpha - this.val$startingAlpha)) * f)));
        }
    }

    public interface OnRefreshListener {
        void onRefresh();
    }

    private void createProgressView() {
        this.mCircleView = new CircleImageView(getContext(), -328966, 20.0f);
        this.mProgress = new MaterialProgressDrawable(getContext(), this);
        this.mProgress.setBackgroundColor(-328966);
        this.mCircleView.setImageDrawable(this.mProgress);
        this.mCircleView.setVisibility(8);
        addView(this.mCircleView);
    }

    private void setAnimationProgress(float f) {
        if (isAlphaUsedForScale()) {
            setColorViewAlpha((int) (255.0f * f));
            if (SlidingPaneLayout.a == 0) {
                return;
            }
        }
        ViewCompat.setScaleX(this.mCircleView, f);
        ViewCompat.setScaleY(this.mCircleView, f);
    }

    static float access$1200(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mSpinnerFinalOffset;
    }

    static void access$1300(SwipeRefreshLayout swipeRefreshLayout, float f) {
        swipeRefreshLayout.moveToStart(f);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                actionIndex = 1;
            } else {
                actionIndex = 0;
            }
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
        }
    }

    static boolean access$600(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mScale;
    }

    private Animation startAlphaAnimation(int i, int i2) {
        if (this.mScale && isAlphaUsedForScale()) {
            return null;
        }
        Animation anonymousClass_4 = new AnonymousClass_4(this, i, i2);
        anonymousClass_4.setDuration(300);
        this.mCircleView.setAnimationListener(null);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(anonymousClass_4);
        return anonymousClass_4;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.mTarget == null) {
                ensureTarget();
            }
            if (this.mTarget != null) {
                View view = this.mTarget;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                measuredHeight = this.mCircleView.getMeasuredWidth();
                this.mCircleView.layout((measuredWidth / 2) - (measuredHeight / 2), this.mCurrentTargetOffsetTop, (measuredWidth / 2) + (measuredHeight / 2), this.mCurrentTargetOffsetTop + this.mCircleView.getMeasuredHeight());
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = SlidingPaneLayout.a;
        super.onMeasure(i, i2);
        if (this.mTarget == null) {
            ensureTarget();
        }
        if (this.mTarget != null) {
            int i4;
            this.mTarget.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.mCircleView.measure(MeasureSpec.makeMeasureSpec(this.mCircleWidth, 1073741824), MeasureSpec.makeMeasureSpec(this.mCircleHeight, 1073741824));
            if (!(this.mUsingCustomStart || this.mOriginalOffsetCalculated)) {
                this.mOriginalOffsetCalculated = true;
                i4 = -this.mCircleView.getMeasuredHeight();
                this.mOriginalOffsetTop = i4;
                this.mCurrentTargetOffsetTop = i4;
            }
            this.mCircleViewIndex = -1;
            i4 = 0;
            while (i4 < getChildCount()) {
                if (getChildAt(i4) == this.mCircleView) {
                    this.mCircleViewIndex = i4;
                    if (i3 == 0) {
                        return;
                    }
                }
                i4++;
                if (i3 != 0) {
                    return;
                }
            }
        }
    }

    static boolean access$000(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mRefreshing;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
        r7_this = this;
        r6 = 1;
        r5 = -1;
        r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r0 = 0;
        r1 = android.support.v4.widget.SlidingPaneLayout.a;
        r7.ensureTarget();
        r2 = android.support.v4.view.MotionEventCompat.getActionMasked(r8);
        r3 = r7.mReturningToStart;
        if (r3 == 0) goto L_0x0016;
    L_0x0012:
        if (r2 != 0) goto L_0x0016;
    L_0x0014:
        r7.mReturningToStart = r0;
    L_0x0016:
        r3 = r7.isEnabled();
        if (r3 == 0) goto L_0x002a;
    L_0x001c:
        r3 = r7.mReturningToStart;
        if (r3 != 0) goto L_0x002a;
    L_0x0020:
        r3 = r7.canChildScrollUp();
        if (r3 != 0) goto L_0x002a;
    L_0x0026:
        r3 = r7.mRefreshing;
        if (r3 == 0) goto L_0x002b;
    L_0x002a:
        return r0;
    L_0x002b:
        switch(r2) {
            case 0: goto L_0x0031;
            case 1: goto L_0x0087;
            case 2: goto L_0x0051;
            case 3: goto L_0x0087;
            case 4: goto L_0x002e;
            case 5: goto L_0x002e;
            case 6: goto L_0x0082;
            default: goto L_0x002e;
        };
    L_0x002e:
        r0 = r7.mIsBeingDragged;
        goto L_0x002a;
    L_0x0031:
        r2 = r7.mOriginalOffsetTop;
        r3 = r7.mCircleView;
        r3 = r3.getTop();
        r2 = r2 - r3;
        r7.setTargetOffsetTopAndBottom(r2, r6);
        r2 = android.support.v4.view.MotionEventCompat.getPointerId(r8, r0);
        r7.mActivePointerId = r2;
        r7.mIsBeingDragged = r0;
        r2 = r7.mActivePointerId;
        r2 = r7.getMotionEventY(r8, r2);
        r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r3 == 0) goto L_0x002a;
    L_0x004f:
        r7.mInitialMotionY = r2;
    L_0x0051:
        r2 = r7.mActivePointerId;
        if (r2 != r5) goto L_0x005f;
    L_0x0055:
        r1 = LOG_TAG;
        r2 = z;
        r2 = r2[r0];
        android.util.Log.e(r1, r2);
        goto L_0x002a;
    L_0x005f:
        r2 = r7.mActivePointerId;
        r2 = r7.getMotionEventY(r8, r2);
        r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r3 == 0) goto L_0x002a;
    L_0x0069:
        r3 = r7.mInitialMotionY;
        r2 = r2 - r3;
        r3 = r7.mTouchSlop;
        r3 = (float) r3;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 <= 0) goto L_0x002e;
    L_0x0073:
        r2 = r7.mIsBeingDragged;
        if (r2 != 0) goto L_0x002e;
    L_0x0077:
        r7.mIsBeingDragged = r6;
        r2 = r7.mProgress;
        r3 = 76;
        r2.setAlpha(r3);
        if (r1 == 0) goto L_0x002e;
    L_0x0082:
        r7.onSecondaryPointerUp(r8);
        if (r1 == 0) goto L_0x002e;
    L_0x0087:
        r7.mIsBeingDragged = r0;
        r7.mActivePointerId = r5;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    private boolean isAnimationRunning(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    static int access$802(SwipeRefreshLayout swipeRefreshLayout, int i) {
        swipeRefreshLayout.mCurrentTargetOffsetTop = i;
        return i;
    }

    private void ensureTarget() {
        int i = SlidingPaneLayout.a;
        if (this.mTarget == null) {
            int i2 = 0;
            while (i2 < getChildCount()) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.mCircleView)) {
                    this.mTarget = childAt;
                    if (i == 0) {
                        return;
                    }
                }
                i2++;
                if (i != 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void startScaleDownReturnToStartAnimation(int r5, android.view.animation.Animation.AnimationListener r6) {
        /*
        r4_this = this;
        r4.mFrom = r5;
        r0 = r4.isAlphaUsedForScale();
        if (r0 == 0) goto L_0x0015;
    L_0x0008:
        r0 = r4.mProgress;
        r0 = r0.getAlpha();
        r0 = (float) r0;
        r4.mStartingScale = r0;
        r0 = android.support.v4.widget.SlidingPaneLayout.a;
        if (r0 == 0) goto L_0x001d;
    L_0x0015:
        r0 = r4.mCircleView;
        r0 = android.support.v4.view.ViewCompat.getScaleX(r0);
        r4.mStartingScale = r0;
    L_0x001d:
        r0 = new android.support.v4.widget.SwipeRefreshLayout$8;
        r0.<init>(r4);
        r4.mScaleDownToStartAnimation = r0;
        r0 = r4.mScaleDownToStartAnimation;
        r2 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r0.setDuration(r2);
        if (r6 == 0) goto L_0x0032;
    L_0x002d:
        r0 = r4.mCircleView;
        r0.setAnimationListener(r6);
    L_0x0032:
        r0 = r4.mCircleView;
        r0.clearAnimation();
        r0 = r4.mCircleView;
        r1 = r4.mScaleDownToStartAnimation;
        r0.startAnimation(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SwipeRefreshLayout.startScaleDownReturnToStartAnimation(int, android.view.animation.Animation$AnimationListener):void");
    }

    static boolean access$1100(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mUsingCustomStart;
    }

    static boolean access$200(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mNotify;
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private float getMotionEventY(MotionEvent motionEvent, int i) {
        int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
        return findPointerIndex < 0 ? -1.0f : MotionEventCompat.getY(motionEvent, findPointerIndex);
    }

    static void access$900(SwipeRefreshLayout swipeRefreshLayout, int i, boolean z) {
        swipeRefreshLayout.setTargetOffsetTopAndBottom(i, z);
    }

    private void animateOffsetToCorrectPosition(int i, AnimationListener animationListener) {
        this.mFrom = i;
        this.mAnimateToCorrectPosition.reset();
        this.mAnimateToCorrectPosition.setDuration(200);
        this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
    }

    static OnRefreshListener access$300(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mListener;
    }

    static void access$700(SwipeRefreshLayout swipeRefreshLayout, float f) {
        swipeRefreshLayout.setAnimationProgress(f);
    }

    static void access$1000(SwipeRefreshLayout swipeRefreshLayout, AnimationListener animationListener) {
        swipeRefreshLayout.startScaleDownAnimation(animationListener);
    }

    static void access$500(SwipeRefreshLayout swipeRefreshLayout, int i) {
        swipeRefreshLayout.setColorViewAlpha(i);
    }

    public boolean canChildScrollUp() {
        boolean z = true;
        if (VERSION.SDK_INT >= 14) {
            return ViewCompat.canScrollVertically(this.mTarget, -1);
        }
        if (this.mTarget instanceof AbsListView) {
            AbsListView absListView = (AbsListView) this.mTarget;
            return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
        } else {
            if (this.mTarget.getScrollY() <= 0) {
                z = false;
            }
            return z;
        }
    }

    static MaterialProgressDrawable access$100(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mProgress;
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.mCircleViewIndex < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return this.mCircleViewIndex;
        }
        return i2 >= this.mCircleViewIndex ? i2 + 1 : i2;
    }

    private void moveToStart(float f) {
        setTargetOffsetTopAndBottom((this.mFrom + ((int) (((float) (this.mOriginalOffsetTop - this.mFrom)) * f))) - this.mCircleView.getTop(), false);
    }

    static {
        String[] strArr = new String[3];
        String str = "c\u001b\u001c\u0013Ng !|A{9'eJ\u0004\u0011\u001eVaPT\nF{\u0004\u0010\u0007](PT\u0000RyAT\t]/E\u0017\u001cZyAT\u0018\\fJ\u0000\rA/M\u0010F";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 36;
                        break;
                    case ay.f /*1*/:
                        i4 = 116;
                        break;
                    case ay.n /*2*/:
                        i4 = 104;
                        break;
                    case ay.p /*3*/:
                        i4 = 51;
                        break;
                    default:
                        i4 = 15;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    strArr2 = strArr3;
                    str = "c\u001b\u001c\u0013Ng !|A{9'eJ\u0004\u0011\u001eVaPT\nF{\u0004\u001c\tEj\u0004\u0015\u0006\u0013fJ\u0002\t_f@T\tP{M\u0002\r\u0013\u007fK\u001d\u0006GjVT\u0001W!";
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    LOG_TAG = SwipeRefreshLayout.class.getSimpleName();
                    LAYOUT_ATTRS = new int[]{16842766};
                default:
                    strArr2[i2] = str;
                    str = "c\u001b\u001c\u0013Ng !|A{!8\u0013jR\u0011\u0006G/F\u0001\u001c\u0013kK\u001aOG/L\u0015\u001eV/E\u001aHRlP\u001d\u001eV/T\u001b\u0001]{A\u0006HZk\n";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private void setTargetOffsetTopAndBottom(int i, boolean z) {
        this.mCircleView.bringToFront();
        this.mCircleView.offsetTopAndBottom(i);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
        if (z && VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    private void setColorViewAlpha(int i) {
        this.mCircleView.getBackground().setAlpha(i);
        this.mProgress.setAlpha(i);
    }

    private void startProgressAlphaMaxAnimation() {
        this.mAlphaMaxAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 255);
    }

    private void startProgressAlphaStartAnimation() {
        this.mAlphaStartAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 76);
    }

    static CircleImageView access$400(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mCircleView;
    }

    private void setRefreshing(boolean z, boolean z2) {
        if (this.mRefreshing != z) {
            this.mNotify = z2;
            ensureTarget();
            this.mRefreshing = z;
            if (this.mRefreshing) {
                animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
                if (SlidingPaneLayout.a == 0) {
                    return;
                }
            }
            startScaleDownAnimation(this.mRefreshListener);
        }
    }

    private void startScaleDownAnimation(AnimationListener animationListener) {
        this.mScaleDownAnimation = new Animation() {
            final SwipeRefreshLayout this$0;

            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.access$700(this.this$0, 1.0f - f);
            }

            {
                this.this$0 = r1;
            }
        };
        this.mScaleDownAnimation.setDuration(150);
        this.mCircleView.setAnimationListener(animationListener);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownAnimation);
    }

    private boolean isAlphaUsedForScale() {
        return VERSION.SDK_INT < 11;
    }

    static int access$800(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mCurrentTargetOffsetTop;
    }

    static float access$1400(SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mStartingScale;
    }

    private void animateOffsetToStartPosition(int i, AnimationListener animationListener) {
        if (this.mScale) {
            startScaleDownReturnToStartAnimation(i, animationListener);
            if (SlidingPaneLayout.a == 0) {
                return;
            }
        }
        this.mFrom = i;
        this.mAnimateToStartPosition.reset();
        this.mAnimateToStartPosition.setDuration(200);
        this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToStartPosition);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        int i = SlidingPaneLayout.a;
        super(context, attributeSet);
        this.mRefreshing = false;
        this.mTotalDragDistance = -1.0f;
        this.mOriginalOffsetCalculated = false;
        this.mActivePointerId = -1;
        this.mCircleViewIndex = -1;
        this.mRefreshListener = new AnimationListener() {
            final SwipeRefreshLayout this$0;

            public void onAnimationRepeat(Animation animation) {
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onAnimationEnd(android.view.animation.Animation r5) {
                /*
                r4_this = this;
                r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
                r0 = android.support.v4.widget.SlidingPaneLayout.a;
                r1 = r4.this$0;
                r1 = android.support.v4.widget.SwipeRefreshLayout.access$000(r1);
                if (r1 == 0) goto L_0x0039;
            L_0x000c:
                r1 = r4.this$0;
                r1 = android.support.v4.widget.SwipeRefreshLayout.access$100(r1);
                r1.setAlpha(r3);
                r1 = r4.this$0;
                r1 = android.support.v4.widget.SwipeRefreshLayout.access$100(r1);
                r1.start();
                r1 = r4.this$0;
                r1 = android.support.v4.widget.SwipeRefreshLayout.access$200(r1);
                if (r1 == 0) goto L_0x0073;
            L_0x0026:
                r1 = r4.this$0;
                r1 = android.support.v4.widget.SwipeRefreshLayout.access$300(r1);
                if (r1 == 0) goto L_0x0073;
            L_0x002e:
                r1 = r4.this$0;
                r1 = android.support.v4.widget.SwipeRefreshLayout.access$300(r1);
                r1.onRefresh();
                if (r0 == 0) goto L_0x0073;
            L_0x0039:
                r1 = r4.this$0;
                r1 = android.support.v4.widget.SwipeRefreshLayout.access$100(r1);
                r1.stop();
                r1 = r4.this$0;
                r1 = android.support.v4.widget.SwipeRefreshLayout.access$400(r1);
                r2 = 8;
                r1.setVisibility(r2);
                r1 = r4.this$0;
                android.support.v4.widget.SwipeRefreshLayout.access$500(r1, r3);
                r1 = r4.this$0;
                r1 = android.support.v4.widget.SwipeRefreshLayout.access$600(r1);
                if (r1 == 0) goto L_0x0062;
            L_0x005a:
                r1 = r4.this$0;
                r2 = 0;
                android.support.v4.widget.SwipeRefreshLayout.access$700(r1, r2);
                if (r0 == 0) goto L_0x0073;
            L_0x0062:
                r0 = r4.this$0;
                r1 = r4.this$0;
                r1 = r1.mOriginalOffsetTop;
                r2 = r4.this$0;
                r2 = android.support.v4.widget.SwipeRefreshLayout.access$800(r2);
                r1 = r1 - r2;
                r2 = 1;
                android.support.v4.widget.SwipeRefreshLayout.access$900(r0, r1, r2);
            L_0x0073:
                r0 = r4.this$0;
                r1 = r4.this$0;
                r1 = android.support.v4.widget.SwipeRefreshLayout.access$400(r1);
                r1 = r1.getTop();
                android.support.v4.widget.SwipeRefreshLayout.access$802(r0, r1);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SwipeRefreshLayout.AnonymousClass_1.onAnimationEnd(android.view.animation.Animation):void");
            }

            public void onAnimationStart(Animation animation) {
            }

            {
                this.this$0 = r1;
            }
        };
        this.mAnimateToCorrectPosition = new Animation() {
            final SwipeRefreshLayout this$0;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void applyTransformation(float r4, android.view.animation.Transformation r5) {
                /*
                r3_this = this;
                r0 = r3.this$0;
                r0 = android.support.v4.widget.SwipeRefreshLayout.access$1100(r0);
                if (r0 != 0) goto L_0x001d;
            L_0x0008:
                r0 = r3.this$0;
                r0 = android.support.v4.widget.SwipeRefreshLayout.access$1200(r0);
                r1 = r3.this$0;
                r1 = r1.mOriginalOffsetTop;
                r1 = java.lang.Math.abs(r1);
                r1 = (float) r1;
                r0 = r0 - r1;
                r0 = (int) r0;
                r1 = android.support.v4.widget.SlidingPaneLayout.a;
                if (r1 == 0) goto L_0x0024;
            L_0x001d:
                r0 = r3.this$0;
                r0 = android.support.v4.widget.SwipeRefreshLayout.access$1200(r0);
                r0 = (int) r0;
            L_0x0024:
                r1 = r3.this$0;
                r1 = r1.mFrom;
                r2 = r3.this$0;
                r2 = r2.mFrom;
                r0 = r0 - r2;
                r0 = (float) r0;
                r0 = r0 * r4;
                r0 = (int) r0;
                r0 = r0 + r1;
                r1 = r3.this$0;
                r1 = android.support.v4.widget.SwipeRefreshLayout.access$400(r1);
                r1 = r1.getTop();
                r0 = r0 - r1;
                r1 = r3.this$0;
                r2 = 0;
                android.support.v4.widget.SwipeRefreshLayout.access$900(r1, r0, r2);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SwipeRefreshLayout.AnonymousClass_6.applyTransformation(float, android.view.animation.Transformation):void");
            }

            {
                this.this$0 = r1;
            }
        };
        this.mAnimateToStartPosition = new Animation() {
            final SwipeRefreshLayout this$0;

            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.access$1300(this.this$0, f);
            }

            {
                this.this$0 = r1;
            }
        };
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMediumAnimationDuration = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.mDecelerateInterpolator = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mCircleWidth = (int) (displayMetrics.density * 40.0f);
        this.mCircleHeight = (int) (displayMetrics.density * 40.0f);
        createProgressView();
        ViewCompat.setChildrenDrawingOrderEnabled(this, true);
        this.mSpinnerFinalOffset = displayMetrics.density * 64.0f;
        this.mTotalDragDistance = this.mSpinnerFinalOffset;
        if (Fragment.a != 0) {
            SlidingPaneLayout.a = i + 1;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
        r12_this = this;
        r1 = android.support.v4.widget.SlidingPaneLayout.a;
        r2 = android.support.v4.view.MotionEventCompat.getActionMasked(r13);
        r0 = r12.mReturningToStart;
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        if (r2 != 0) goto L_0x000f;
    L_0x000c:
        r0 = 0;
        r12.mReturningToStart = r0;
    L_0x000f:
        r0 = r12.isEnabled();
        if (r0 == 0) goto L_0x001f;
    L_0x0015:
        r0 = r12.mReturningToStart;
        if (r0 != 0) goto L_0x001f;
    L_0x0019:
        r0 = r12.canChildScrollUp();
        if (r0 == 0) goto L_0x0021;
    L_0x001f:
        r0 = 0;
    L_0x0020:
        return r0;
    L_0x0021:
        switch(r2) {
            case 0: goto L_0x0026;
            case 1: goto L_0x0168;
            case 2: goto L_0x0032;
            case 3: goto L_0x0168;
            case 4: goto L_0x0024;
            case 5: goto L_0x0157;
            case 6: goto L_0x0163;
            default: goto L_0x0024;
        };
    L_0x0024:
        r0 = 1;
        goto L_0x0020;
    L_0x0026:
        r0 = 0;
        r0 = android.support.v4.view.MotionEventCompat.getPointerId(r13, r0);
        r12.mActivePointerId = r0;
        r0 = 0;
        r12.mIsBeingDragged = r0;
        if (r1 == 0) goto L_0x0024;
    L_0x0032:
        r0 = r12.mActivePointerId;
        r0 = android.support.v4.view.MotionEventCompat.findPointerIndex(r13, r0);
        if (r0 >= 0) goto L_0x0046;
    L_0x003a:
        r0 = LOG_TAG;
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        android.util.Log.e(r0, r1);
        r0 = 0;
        goto L_0x0020;
    L_0x0046:
        r0 = android.support.v4.view.MotionEventCompat.getY(r13, r0);
        r3 = r12.mInitialMotionY;
        r0 = r0 - r3;
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r3 = r3 * r0;
        r0 = r12.mIsBeingDragged;
        if (r0 == 0) goto L_0x0024;
    L_0x0054:
        r0 = r12.mProgress;
        r4 = 1;
        r0.showArrow(r4);
        r0 = r12.mTotalDragDistance;
        r0 = r3 / r0;
        r4 = 0;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 >= 0) goto L_0x0065;
    L_0x0063:
        r0 = 0;
        goto L_0x0020;
    L_0x0065:
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = java.lang.Math.abs(r0);
        r4 = java.lang.Math.min(r4, r0);
        r6 = (double) r4;
        r8 = 4600877379321698714; // 0x3fd999999999999a float:-1.5881868E-23 double:0.4;
        r6 = r6 - r8;
        r8 = 0;
        r6 = java.lang.Math.max(r6, r8);
        r0 = (float) r6;
        r5 = 1084227584; // 0x40a00000 float:5.0 double:5.356796015E-315;
        r0 = r0 * r5;
        r5 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r5 = r0 / r5;
        r0 = java.lang.Math.abs(r3);
        r6 = r12.mTotalDragDistance;
        r6 = r0 - r6;
        r0 = r12.mUsingCustomStart;
        if (r0 == 0) goto L_0x017d;
    L_0x0090:
        r0 = r12.mSpinnerFinalOffset;
        r7 = r12.mOriginalOffsetTop;
        r7 = (float) r7;
        r0 = r0 - r7;
    L_0x0096:
        r7 = 0;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = r8 * r0;
        r6 = java.lang.Math.min(r6, r8);
        r6 = r6 / r0;
        r6 = java.lang.Math.max(r7, r6);
        r7 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r7 = r6 / r7;
        r8 = (double) r7;
        r7 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r6 = r6 / r7;
        r6 = (double) r6;
        r10 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r6 = java.lang.Math.pow(r6, r10);
        r6 = r8 - r6;
        r6 = (float) r6;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r6 * r7;
        r7 = r0 * r6;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = r7 * r8;
        r8 = r12.mOriginalOffsetTop;
        r0 = r0 * r4;
        r0 = r0 + r7;
        r0 = (int) r0;
        r0 = r0 + r8;
        r4 = r12.mCircleView;
        r4 = r4.getVisibility();
        if (r4 == 0) goto L_0x00d1;
    L_0x00cb:
        r4 = r12.mCircleView;
        r7 = 0;
        r4.setVisibility(r7);
    L_0x00d1:
        r4 = r12.mScale;
        if (r4 != 0) goto L_0x00e3;
    L_0x00d5:
        r4 = r12.mCircleView;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        android.support.v4.view.ViewCompat.setScaleX(r4, r7);
        r4 = r12.mCircleView;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        android.support.v4.view.ViewCompat.setScaleY(r4, r7);
    L_0x00e3:
        r4 = r12.mTotalDragDistance;
        r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r4 >= 0) goto L_0x0126;
    L_0x00e9:
        r4 = r12.mScale;
        if (r4 == 0) goto L_0x00f3;
    L_0x00ed:
        r4 = r12.mTotalDragDistance;
        r3 = r3 / r4;
        r12.setAnimationProgress(r3);
    L_0x00f3:
        r3 = r12.mProgress;
        r3 = r3.getAlpha();
        r4 = 76;
        if (r3 <= r4) goto L_0x0108;
    L_0x00fd:
        r3 = r12.mAlphaStartAnimation;
        r3 = r12.isAnimationRunning(r3);
        if (r3 != 0) goto L_0x0108;
    L_0x0105:
        r12.startProgressAlphaStartAnimation();
    L_0x0108:
        r3 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
        r3 = r3 * r5;
        r4 = r12.mProgress;
        r7 = 0;
        r8 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
        r3 = java.lang.Math.min(r8, r3);
        r4.setStartEndTrim(r7, r3);
        r3 = r12.mProgress;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = java.lang.Math.min(r4, r5);
        r3.setArrowScale(r4);
        if (r1 == 0) goto L_0x013b;
    L_0x0126:
        r3 = r12.mProgress;
        r3 = r3.getAlpha();
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r3 >= r4) goto L_0x013b;
    L_0x0130:
        r3 = r12.mAlphaMaxAnimation;
        r3 = r12.isAnimationRunning(r3);
        if (r3 != 0) goto L_0x013b;
    L_0x0138:
        r12.startProgressAlphaMaxAnimation();
    L_0x013b:
        r3 = -1098907648; // 0xffffffffbe800000 float:-0.25 double:NaN;
        r4 = 1053609165; // 0x3ecccccd float:0.4 double:5.205520926E-315;
        r4 = r4 * r5;
        r3 = r3 + r4;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = r4 * r6;
        r3 = r3 + r4;
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r3 = r3 * r4;
        r4 = r12.mProgress;
        r4.setProgressRotation(r3);
        r3 = r12.mCurrentTargetOffsetTop;
        r0 = r0 - r3;
        r3 = 1;
        r12.setTargetOffsetTopAndBottom(r0, r3);
        if (r1 == 0) goto L_0x0024;
    L_0x0157:
        r0 = android.support.v4.view.MotionEventCompat.getActionIndex(r13);
        r0 = android.support.v4.view.MotionEventCompat.getPointerId(r13, r0);
        r12.mActivePointerId = r0;
        if (r1 == 0) goto L_0x0024;
    L_0x0163:
        r12.onSecondaryPointerUp(r13);
        if (r1 == 0) goto L_0x0024;
    L_0x0168:
        r0 = r12.mActivePointerId;
        r3 = -1;
        if (r0 != r3) goto L_0x0181;
    L_0x016d:
        r0 = 1;
        if (r2 != r0) goto L_0x017a;
    L_0x0170:
        r0 = LOG_TAG;
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        android.util.Log.e(r0, r1);
    L_0x017a:
        r0 = 0;
        goto L_0x0020;
    L_0x017d:
        r0 = r12.mSpinnerFinalOffset;
        goto L_0x0096;
    L_0x0181:
        r0 = r12.mActivePointerId;
        r0 = android.support.v4.view.MotionEventCompat.findPointerIndex(r13, r0);
        r0 = android.support.v4.view.MotionEventCompat.getY(r13, r0);
        r2 = r12.mInitialMotionY;
        r0 = r0 - r2;
        r2 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 * r2;
        r2 = 0;
        r12.mIsBeingDragged = r2;
        r2 = r12.mTotalDragDistance;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x01a1;
    L_0x019a:
        r0 = 1;
        r2 = 1;
        r12.setRefreshing(r0, r2);
        if (r1 == 0) goto L_0x01c0;
    L_0x01a1:
        r0 = 0;
        r12.mRefreshing = r0;
        r0 = r12.mProgress;
        r1 = 0;
        r2 = 0;
        r0.setStartEndTrim(r1, r2);
        r0 = 0;
        r1 = r12.mScale;
        if (r1 != 0) goto L_0x01b5;
    L_0x01b0:
        r0 = new android.support.v4.widget.SwipeRefreshLayout$5;
        r0.<init>(r12);
    L_0x01b5:
        r1 = r12.mCurrentTargetOffsetTop;
        r12.animateOffsetToStartPosition(r1, r0);
        r0 = r12.mProgress;
        r1 = 0;
        r0.showArrow(r1);
    L_0x01c0:
        r0 = -1;
        r12.mActivePointerId = r0;
        r0 = 0;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SwipeRefreshLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
