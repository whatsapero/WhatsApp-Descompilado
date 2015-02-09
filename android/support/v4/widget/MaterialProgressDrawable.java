package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.annotation.IntDef;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

class MaterialProgressDrawable extends Drawable implements Animatable {
    private static final Interpolator EASE_INTERPOLATOR;
    private static final Interpolator END_CURVE_INTERPOLATOR;
    private static final Interpolator LINEAR_INTERPOLATOR;
    private static final Interpolator START_CURVE_INTERPOLATOR;
    private final int[] COLORS;
    private Animation mAnimation;
    private final ArrayList mAnimators;
    private final Callback mCallback;
    boolean mFinishing;
    private double mHeight;
    private View mParent;
    private Resources mResources;
    private final Ring mRing;
    private float mRotation;
    private float mRotationCount;
    private double mWidth;

    class AnonymousClass_1 extends Animation {
        final MaterialProgressDrawable this$0;
        final Ring val$ring;

        AnonymousClass_1(MaterialProgressDrawable materialProgressDrawable, Ring ring) {
            this.this$0 = materialProgressDrawable;
            this.val$ring = ring;
        }

        public void applyTransformation(float f, Transformation transformation) {
            if (this.this$0.mFinishing) {
                MaterialProgressDrawable.access$200(this.this$0, f, this.val$ring);
                if (SlidingPaneLayout.a == 0) {
                    return;
                }
            }
            float toRadians = (float) Math.toRadians(((double) this.val$ring.getStrokeWidth()) / (6.283185307179586d * this.val$ring.getCenterRadius()));
            float startingEndTrim = this.val$ring.getStartingEndTrim();
            float startingStartTrim = this.val$ring.getStartingStartTrim();
            float startingRotation = this.val$ring.getStartingRotation();
            this.val$ring.setEndTrim(((0.8f - toRadians) * MaterialProgressDrawable.access$300().getInterpolation(f)) + startingEndTrim);
            this.val$ring.setStartTrim((MaterialProgressDrawable.access$400().getInterpolation(f) * 0.8f) + startingStartTrim);
            this.val$ring.setRotation((0.25f * f) + startingRotation);
            this.this$0.setRotation((144.0f * f) + (720.0f * (MaterialProgressDrawable.access$500(this.this$0) / 5.0f)));
        }
    }

    class AnonymousClass_2 implements AnimationListener {
        final MaterialProgressDrawable this$0;
        final Ring val$ring;

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
            this.val$ring.storeOriginals();
            this.val$ring.goToNextColor();
            this.val$ring.setStartTrim(this.val$ring.getEndTrim());
            if (this.this$0.mFinishing) {
                this.this$0.mFinishing = false;
                animation.setDuration(1333);
                this.val$ring.setShowArrow(false);
                if (SlidingPaneLayout.a == 0) {
                    return;
                }
            }
            MaterialProgressDrawable.access$502(this.this$0, (MaterialProgressDrawable.access$500(this.this$0) + 1.0f) % 5.0f);
        }

        public void onAnimationStart(Animation animation) {
            MaterialProgressDrawable.access$502(this.this$0, 0.0f);
        }

        AnonymousClass_2(MaterialProgressDrawable materialProgressDrawable, Ring ring) {
            this.this$0 = materialProgressDrawable;
            this.val$ring = ring;
        }
    }

    class EndCurveInterpolator extends AccelerateDecelerateInterpolator {
        public float getInterpolation(float f) {
            return super.getInterpolation(Math.max(0.0f, (f - 0.5f) * 2.0f));
        }

        EndCurveInterpolator(AnonymousClass_1 anonymousClass_1) {
            this();
        }

        private EndCurveInterpolator() {
        }
    }

    @IntDef({0, 1})
    @Retention(RetentionPolicy.CLASS)
    public @interface ProgressDrawableSize {
    }

    class Ring {
        private int mAlpha;
        private Path mArrow;
        private int mArrowHeight;
        private final Paint mArrowPaint;
        private float mArrowScale;
        private int mArrowWidth;
        private int mBackgroundColor;
        private final Callback mCallback;
        private final Paint mCirclePaint;
        private int mColorIndex;
        private int[] mColors;
        private float mEndTrim;
        private final Paint mPaint;
        private double mRingCenterRadius;
        private float mRotation;
        private boolean mShowArrow;
        private float mStartTrim;
        private float mStartingEndTrim;
        private float mStartingRotation;
        private float mStartingStartTrim;
        private float mStrokeInset;
        private float mStrokeWidth;
        private final RectF mTempBounds;

        public float getStrokeWidth() {
            return this.mStrokeWidth;
        }

        public void resetOriginals() {
            this.mStartingStartTrim = 0.0f;
            this.mStartingEndTrim = 0.0f;
            this.mStartingRotation = 0.0f;
            setStartTrim(0.0f);
            setEndTrim(0.0f);
            setRotation(0.0f);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void setInsets(int r8, int r9) {
            /*
            r7_this = this;
            r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            r0 = java.lang.Math.min(r8, r9);
            r1 = (float) r0;
            r2 = r7.mRingCenterRadius;
            r4 = 0;
            r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r0 <= 0) goto L_0x0014;
        L_0x000f:
            r0 = 0;
            r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
            if (r0 >= 0) goto L_0x0021;
        L_0x0014:
            r0 = r7.mStrokeWidth;
            r0 = r0 / r6;
            r2 = (double) r0;
            r2 = java.lang.Math.ceil(r2);
            r0 = (float) r2;
            r2 = android.support.v4.widget.SlidingPaneLayout.a;
            if (r2 == 0) goto L_0x0028;
        L_0x0021:
            r0 = r1 / r6;
            r0 = (double) r0;
            r2 = r7.mRingCenterRadius;
            r0 = r0 - r2;
            r0 = (float) r0;
        L_0x0028:
            r7.mStrokeInset = r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.MaterialProgressDrawable.Ring.setInsets(int, int):void");
        }

        public void setColors(@NonNull int[] iArr) {
            this.mColors = iArr;
            setColorIndex(0);
        }

        public void setArrowScale(float f) {
            if (f != this.mArrowScale) {
                this.mArrowScale = f;
                invalidateSelf();
            }
        }

        public int getAlpha() {
            return this.mAlpha;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void drawTriangle(android.graphics.Canvas r11, float r12, float r13, android.graphics.Rect r14) {
            /*
            r10_this = this;
            r8 = 0;
            r6 = 0;
            r0 = r10.mShowArrow;
            if (r0 == 0) goto L_0x0099;
        L_0x0007:
            r0 = r10.mArrow;
            if (r0 != 0) goto L_0x001d;
        L_0x000b:
            r0 = new android.graphics.Path;
            r0.<init>();
            r10.mArrow = r0;
            r0 = r10.mArrow;
            r1 = android.graphics.Path.FillType.EVEN_ODD;
            r0.setFillType(r1);
            r0 = android.support.v4.widget.SlidingPaneLayout.a;
            if (r0 == 0) goto L_0x0022;
        L_0x001d:
            r0 = r10.mArrow;
            r0.reset();
        L_0x0022:
            r0 = r10.mStrokeInset;
            r0 = (int) r0;
            r0 = r0 / 2;
            r0 = (float) r0;
            r1 = r10.mArrowScale;
            r0 = r0 * r1;
            r2 = r10.mRingCenterRadius;
            r4 = java.lang.Math.cos(r8);
            r2 = r2 * r4;
            r1 = r14.exactCenterX();
            r4 = (double) r1;
            r2 = r2 + r4;
            r1 = (float) r2;
            r2 = r10.mRingCenterRadius;
            r4 = java.lang.Math.sin(r8);
            r2 = r2 * r4;
            r4 = r14.exactCenterY();
            r4 = (double) r4;
            r2 = r2 + r4;
            r2 = (float) r2;
            r3 = r10.mArrow;
            r3.moveTo(r6, r6);
            r3 = r10.mArrow;
            r4 = r10.mArrowWidth;
            r4 = (float) r4;
            r5 = r10.mArrowScale;
            r4 = r4 * r5;
            r3.lineTo(r4, r6);
            r3 = r10.mArrow;
            r4 = r10.mArrowWidth;
            r4 = (float) r4;
            r5 = r10.mArrowScale;
            r4 = r4 * r5;
            r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            r4 = r4 / r5;
            r5 = r10.mArrowHeight;
            r5 = (float) r5;
            r6 = r10.mArrowScale;
            r5 = r5 * r6;
            r3.lineTo(r4, r5);
            r3 = r10.mArrow;
            r0 = r1 - r0;
            r3.offset(r0, r2);
            r0 = r10.mArrow;
            r0.close();
            r0 = r10.mArrowPaint;
            r1 = r10.mColors;
            r2 = r10.mColorIndex;
            r1 = r1[r2];
            r0.setColor(r1);
            r0 = r12 + r13;
            r1 = 1084227584; // 0x40a00000 float:5.0 double:5.356796015E-315;
            r0 = r0 - r1;
            r1 = r14.exactCenterX();
            r2 = r14.exactCenterY();
            r11.rotate(r0, r1, r2);
            r0 = r10.mArrow;
            r1 = r10.mArrowPaint;
            r11.drawPath(r0, r1);
        L_0x0099:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.MaterialProgressDrawable.Ring.drawTriangle(android.graphics.Canvas, float, float, android.graphics.Rect):void");
        }

        public float getStartTrim() {
            return this.mStartTrim;
        }

        public void storeOriginals() {
            this.mStartingStartTrim = this.mStartTrim;
            this.mStartingEndTrim = this.mEndTrim;
            this.mStartingRotation = this.mRotation;
        }

        public void setCenterRadius(double d) {
            this.mRingCenterRadius = d;
        }

        public void setShowArrow(boolean z) {
            if (this.mShowArrow != z) {
                this.mShowArrow = z;
                invalidateSelf();
            }
        }

        public void setStartTrim(float f) {
            this.mStartTrim = f;
            invalidateSelf();
        }

        public void setEndTrim(float f) {
            this.mEndTrim = f;
            invalidateSelf();
        }

        public void setRotation(float f) {
            this.mRotation = f;
            invalidateSelf();
        }

        public void setArrowDimensions(float f, float f2) {
            this.mArrowWidth = (int) f;
            this.mArrowHeight = (int) f2;
        }

        private void invalidateSelf() {
            this.mCallback.invalidateDrawable(null);
        }

        public float getEndTrim() {
            return this.mEndTrim;
        }

        public float getStartingRotation() {
            return this.mStartingRotation;
        }

        public Ring(Callback callback) {
            this.mTempBounds = new RectF();
            this.mPaint = new Paint();
            this.mArrowPaint = new Paint();
            this.mStartTrim = 0.0f;
            this.mEndTrim = 0.0f;
            this.mRotation = 0.0f;
            this.mStrokeWidth = 5.0f;
            this.mStrokeInset = 2.5f;
            this.mCirclePaint = new Paint();
            this.mCallback = callback;
            this.mPaint.setStrokeCap(Cap.SQUARE);
            this.mPaint.setAntiAlias(true);
            this.mPaint.setStyle(Style.STROKE);
            this.mArrowPaint.setStyle(Style.FILL);
            this.mArrowPaint.setAntiAlias(true);
        }

        public double getCenterRadius() {
            return this.mRingCenterRadius;
        }

        public void draw(Canvas canvas, Rect rect) {
            RectF rectF = this.mTempBounds;
            rectF.set(rect);
            rectF.inset(this.mStrokeInset, this.mStrokeInset);
            float f = (this.mStartTrim + this.mRotation) * 360.0f;
            float f2 = ((this.mEndTrim + this.mRotation) * 360.0f) - f;
            this.mPaint.setColor(this.mColors[this.mColorIndex]);
            canvas.drawArc(rectF, f, f2, false, this.mPaint);
            drawTriangle(canvas, f, f2, rect);
            if (this.mAlpha < 255) {
                this.mCirclePaint.setColor(this.mBackgroundColor);
                this.mCirclePaint.setAlpha(255 - this.mAlpha);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float) (rect.width() / 2), this.mCirclePaint);
            }
        }

        public void setStrokeWidth(float f) {
            this.mStrokeWidth = f;
            this.mPaint.setStrokeWidth(f);
            invalidateSelf();
        }

        public float getStartingEndTrim() {
            return this.mStartingEndTrim;
        }

        public float getStartingStartTrim() {
            return this.mStartingStartTrim;
        }

        public void setAlpha(int i) {
            this.mAlpha = i;
        }

        public void setColorIndex(int i) {
            this.mColorIndex = i;
        }

        public void setBackgroundColor(int i) {
            this.mBackgroundColor = i;
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.mPaint.setColorFilter(colorFilter);
            invalidateSelf();
        }

        public void goToNextColor() {
            this.mColorIndex = (this.mColorIndex + 1) % this.mColors.length;
        }
    }

    class StartCurveInterpolator extends AccelerateDecelerateInterpolator {
        public float getInterpolation(float f) {
            return super.getInterpolation(Math.min(1.0f, 2.0f * f));
        }

        StartCurveInterpolator(AnonymousClass_1 anonymousClass_1) {
            this();
        }

        private StartCurveInterpolator() {
        }
    }

    private void setupAnimators() {
        Ring ring = this.mRing;
        Animation anonymousClass_1 = new AnonymousClass_1(this, ring);
        anonymousClass_1.setRepeatCount(-1);
        anonymousClass_1.setRepeatMode(1);
        anonymousClass_1.setInterpolator(LINEAR_INTERPOLATOR);
        anonymousClass_1.setAnimationListener(new AnonymousClass_2(this, ring));
        this.mAnimation = anonymousClass_1;
    }

    public void setStartEndTrim(float f, float f2) {
        this.mRing.setStartTrim(f);
        this.mRing.setEndTrim(f2);
    }

    public void stop() {
        this.mParent.clearAnimation();
        setRotation(0.0f);
        this.mRing.setShowArrow(false);
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
    }

    public int getIntrinsicWidth() {
        return (int) this.mWidth;
    }

    public void showArrow(boolean z) {
        this.mRing.setShowArrow(z);
    }

    static float access$500(MaterialProgressDrawable materialProgressDrawable) {
        return materialProgressDrawable.mRotationCount;
    }

    public void setAlpha(int i) {
        this.mRing.setAlpha(i);
    }

    public void setProgressRotation(float f) {
        this.mRing.setRotation(f);
    }

    public void setArrowScale(float f) {
        this.mRing.setArrowScale(f);
    }

    static {
        LINEAR_INTERPOLATOR = new LinearInterpolator();
        END_CURVE_INTERPOLATOR = new EndCurveInterpolator(null);
        START_CURVE_INTERPOLATOR = new StartCurveInterpolator(null);
        EASE_INTERPOLATOR = new AccelerateDecelerateInterpolator();
    }

    static Interpolator access$300() {
        return START_CURVE_INTERPOLATOR;
    }

    static float access$502(MaterialProgressDrawable materialProgressDrawable, float f) {
        materialProgressDrawable.mRotationCount = f;
        return f;
    }

    public int getIntrinsicHeight() {
        return (int) this.mHeight;
    }

    public void updateSizes(@ProgressDrawableSize int i) {
        if (i == 0) {
            setSizeParameters(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
            if (SlidingPaneLayout.a == 0) {
                return;
            }
        }
        setSizeParameters(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
    }

    public int getOpacity() {
        return -3;
    }

    static void access$200(MaterialProgressDrawable materialProgressDrawable, float f, Ring ring) {
        materialProgressDrawable.applyFinishTranslation(f, ring);
    }

    public void setBackgroundColor(int i) {
        this.mRing.setBackgroundColor(i);
    }

    private void applyFinishTranslation(float f, Ring ring) {
        float floor = (float) (Math.floor((double) (ring.getStartingRotation() / 0.8f)) + 1.0d);
        ring.setStartTrim(ring.getStartingStartTrim() + ((ring.getStartingEndTrim() - ring.getStartingStartTrim()) * f));
        ring.setRotation(((floor - ring.getStartingRotation()) * f) + ring.getStartingRotation());
    }

    void setRotation(float f) {
        this.mRotation = f;
        invalidateSelf();
    }

    public void start() {
        this.mAnimation.reset();
        this.mRing.storeOriginals();
        if (this.mRing.getEndTrim() != this.mRing.getStartTrim()) {
            this.mFinishing = true;
            this.mAnimation.setDuration(666);
            this.mParent.startAnimation(this.mAnimation);
            if (SlidingPaneLayout.a == 0) {
                return;
            }
        }
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
        this.mAnimation.setDuration(1333);
        this.mParent.startAnimation(this.mAnimation);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mRing.setColorFilter(colorFilter);
    }

    public MaterialProgressDrawable(Context context, View view) {
        this.COLORS = new int[]{-16777216};
        this.mAnimators = new ArrayList();
        this.mCallback = new Callback() {
            final MaterialProgressDrawable this$0;

            public void invalidateDrawable(Drawable drawable) {
                this.this$0.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                this.this$0.scheduleSelf(runnable, j);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                this.this$0.unscheduleSelf(runnable);
            }

            {
                this.this$0 = r1;
            }
        };
        this.mParent = view;
        this.mResources = context.getResources();
        this.mRing = new Ring(this.mCallback);
        this.mRing.setColors(this.COLORS);
        updateSizes(1);
        setupAnimators();
    }

    public int getAlpha() {
        return this.mRing.getAlpha();
    }

    static Interpolator access$400() {
        return END_CURVE_INTERPOLATOR;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
        this.mRing.draw(canvas, bounds);
        canvas.restoreToCount(save);
    }

    public boolean isRunning() {
        int i = SlidingPaneLayout.a;
        ArrayList arrayList = this.mAnimators;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Animation animation = (Animation) arrayList.get(i2);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        return false;
    }

    private void setSizeParameters(double d, double d2, double d3, double d4, float f, float f2) {
        Ring ring = this.mRing;
        float f3 = this.mResources.getDisplayMetrics().density;
        this.mWidth = ((double) f3) * d;
        this.mHeight = ((double) f3) * d2;
        ring.setStrokeWidth(((float) d4) * f3);
        ring.setCenterRadius(((double) f3) * d3);
        ring.setColorIndex(0);
        ring.setArrowDimensions(f * f3, f3 * f2);
        ring.setInsets((int) this.mWidth, (int) this.mHeight);
    }
}
