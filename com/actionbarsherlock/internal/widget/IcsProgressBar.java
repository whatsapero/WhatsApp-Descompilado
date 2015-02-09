package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewDebug.ExportedProperty;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.RemoteViews.RemoteView;
import com.actionbarsherlock.app.SherlockActivity;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

@RemoteView
public class IcsProgressBar extends View {
    private static final boolean IS_HONEYCOMB;
    private static final int[] ProgressBar;
    private static final String z;
    private AccessibilityEventSender mAccessibilityEventSender;
    private AccessibilityManager mAccessibilityManager;
    private AlphaAnimation mAnimation;
    private int mAnimationResolution;
    private int mBehavior;
    private Drawable mCurrentDrawable;
    private int mDuration;
    private boolean mInDrawing;
    private boolean mIndeterminate;
    private Drawable mIndeterminateDrawable;
    private int mIndeterminateRealLeft;
    private int mIndeterminateRealTop;
    private Interpolator mInterpolator;
    private long mLastDrawTime;
    private int mMax;
    int mMaxHeight;
    int mMaxWidth;
    int mMinHeight;
    int mMinWidth;
    private boolean mNoInvalidate;
    private boolean mOnlyIndeterminate;
    private int mProgress;
    private Drawable mProgressDrawable;
    private RefreshProgressRunnable mRefreshProgressRunnable;
    Bitmap mSampleTile;
    private int mSecondaryProgress;
    private boolean mShouldStartAnimationDrawable;
    private Transformation mTransformation;
    private long mUiThreadId;

    class AccessibilityEventSender implements Runnable {
        final IcsProgressBar this$0;

        private AccessibilityEventSender(IcsProgressBar icsProgressBar) {
            this.this$0 = icsProgressBar;
        }

        AccessibilityEventSender(IcsProgressBar icsProgressBar, AnonymousClass_1 anonymousClass_1) {
            this(icsProgressBar);
        }

        public void run() {
            this.this$0.sendAccessibilityEvent(4);
        }
    }

    class RefreshProgressRunnable implements Runnable {
        private boolean mFromUser;
        private int mId;
        private int mProgress;
        final IcsProgressBar this$0;

        RefreshProgressRunnable(IcsProgressBar icsProgressBar, int i, int i2, boolean z) {
            this.this$0 = icsProgressBar;
            this.mId = i;
            this.mProgress = i2;
            this.mFromUser = z;
        }

        public void setup(int i, int i2, boolean z) {
            this.mId = i;
            this.mProgress = i2;
            this.mFromUser = z;
        }

        public void run() {
            IcsProgressBar.access$000(this.this$0, this.mId, this.mProgress, this.mFromUser, true);
            IcsProgressBar.access$102(this.this$0, this);
        }
    }

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        int progress;
        int secondaryProgress;

        SavedState(Parcel parcel, AnonymousClass_1 anonymousClass_1) {
            this(parcel);
        }

        static {
            CREATOR = new Creator() {
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }

                public Object createFromParcel(Parcel parcel) {
                    return createFromParcel(parcel);
                }

                public Object[] newArray(int i) {
                    return newArray(i);
                }
            };
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.progress);
            parcel.writeInt(this.secondaryProgress);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.progress = parcel.readInt();
            this.secondaryProgress = parcel.readInt();
        }
    }

    synchronized void setProgress(int i, boolean z) {
        if (!this.mIndeterminate) {
            int i2;
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            if (i2 > this.mMax) {
                i2 = this.mMax;
            }
            if (i2 != this.mProgress) {
                this.mProgress = i2;
                refreshProgress(16908301, this.mProgress, z);
            }
        }
    }

    protected synchronized void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            Drawable drawable = this.mCurrentDrawable;
            if (drawable != null) {
                canvas.save();
                canvas.translate((float) (getPaddingLeft() + this.mIndeterminateRealLeft), (float) (getPaddingTop() + this.mIndeterminateRealTop));
                long drawingTime = getDrawingTime();
                if (this.mAnimation != null) {
                    this.mAnimation.getTransformation(drawingTime, this.mTransformation);
                    float alpha = this.mTransformation.getAlpha();
                    this.mInDrawing = true;
                    drawable.setLevel((int) (alpha * 10000.0f));
                    this.mInDrawing = false;
                    if (SystemClock.uptimeMillis() - this.mLastDrawTime >= ((long) this.mAnimationResolution)) {
                        this.mLastDrawTime = SystemClock.uptimeMillis();
                        postInvalidateDelayed((long) this.mAnimationResolution);
                    }
                }
                drawable.draw(canvas);
                canvas.restore();
                if (this.mShouldStartAnimationDrawable && (drawable instanceof Animatable)) {
                    ((Animatable) drawable).start();
                    this.mShouldStartAnimationDrawable = false;
                }
            }
        } catch (Throwable th) {
        }
    }

    void stopAnimation() {
        this.mAnimation = null;
        this.mTransformation = null;
        if (this.mIndeterminateDrawable instanceof Animatable) {
            ((Animatable) this.mIndeterminateDrawable).stop();
            this.mShouldStartAnimationDrawable = false;
        }
        postInvalidate();
    }

    private Drawable tileify(Drawable drawable, boolean z) {
        int i = 0;
        boolean z2 = AbsActionBarView.b;
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            int i2 = 0;
            while (i2 < numberOfLayers) {
                boolean z3;
                int id = layerDrawable.getId(i2);
                Drawable drawable2 = layerDrawable.getDrawable(i2);
                if (id == 16908301 || id == 16908303) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                drawableArr[i2] = tileify(drawable2, z3);
                id = i2 + 1;
                if (z2) {
                    break;
                }
                i2 = id;
            }
            Drawable layerDrawable2 = new LayerDrawable(drawableArr);
            while (i < numberOfLayers) {
                layerDrawable2.setId(i, layerDrawable.getId(i));
                i++;
                if (z2) {
                    return layerDrawable2;
                }
            }
            return layerDrawable2;
        } else if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        } else {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (this.mSampleTile == null) {
                this.mSampleTile = bitmap;
            }
            Drawable shapeDrawable = new ShapeDrawable(getDrawableShape());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.progress = this.mProgress;
        savedState.secondaryProgress = this.mSecondaryProgress;
        return savedState;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected synchronized void onMeasure(int r5, int r6) {
        /*
        r4_this = this;
        r0 = 0;
        monitor-enter(r4);
        r2 = r4.mCurrentDrawable;	 Catch:{ all -> 0x005f }
        if (r2 == 0) goto L_0x0062;
    L_0x0006:
        r0 = r4.mMinWidth;	 Catch:{ all -> 0x005f }
        r1 = r4.mMaxWidth;	 Catch:{ all -> 0x005f }
        r3 = r2.getIntrinsicWidth();	 Catch:{ all -> 0x005f }
        r1 = java.lang.Math.min(r1, r3);	 Catch:{ all -> 0x005f }
        r1 = java.lang.Math.max(r0, r1);	 Catch:{ all -> 0x005f }
        r0 = r4.mMinHeight;	 Catch:{ all -> 0x005f }
        r3 = r4.mMaxHeight;	 Catch:{ all -> 0x005f }
        r2 = r2.getIntrinsicHeight();	 Catch:{ all -> 0x005f }
        r2 = java.lang.Math.min(r3, r2);	 Catch:{ all -> 0x005f }
        r0 = java.lang.Math.max(r0, r2);	 Catch:{ all -> 0x005f }
    L_0x0026:
        r4.updateDrawableState();	 Catch:{ all -> 0x005f }
        r2 = r4.getPaddingLeft();	 Catch:{ all -> 0x005f }
        r3 = r4.getPaddingRight();	 Catch:{ all -> 0x005f }
        r2 = r2 + r3;
        r1 = r1 + r2;
        r2 = r4.getPaddingTop();	 Catch:{ all -> 0x005f }
        r3 = r4.getPaddingBottom();	 Catch:{ all -> 0x005f }
        r2 = r2 + r3;
        r0 = r0 + r2;
        r2 = IS_HONEYCOMB;	 Catch:{ all -> 0x005f }
        if (r2 == 0) goto L_0x0052;
    L_0x0041:
        r2 = 0;
        r2 = android.view.View.resolveSizeAndState(r1, r5, r2);	 Catch:{ all -> 0x005f }
        r3 = 0;
        r3 = android.view.View.resolveSizeAndState(r0, r6, r3);	 Catch:{ all -> 0x005f }
        r4.setMeasuredDimension(r2, r3);	 Catch:{ all -> 0x005f }
        r2 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;	 Catch:{ all -> 0x005f }
        if (r2 == 0) goto L_0x005d;
    L_0x0052:
        r1 = android.view.View.resolveSize(r1, r5);	 Catch:{ all -> 0x005f }
        r0 = android.view.View.resolveSize(r0, r6);	 Catch:{ all -> 0x005f }
        r4.setMeasuredDimension(r1, r0);	 Catch:{ all -> 0x005f }
    L_0x005d:
        monitor-exit(r4);
        return;
    L_0x005f:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0062:
        r1 = r0;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsProgressBar.onMeasure(int, int):void");
    }

    public IcsProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        boolean z2 = false;
        boolean z3 = AbsActionBarView.b;
        super(context, attributeSet, i);
        this.mUiThreadId = Thread.currentThread().getId();
        initProgressBar();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ProgressBar, i, i2);
        this.mNoInvalidate = true;
        Drawable drawable = obtainStyledAttributes.getDrawable(8);
        if (drawable != null) {
            setProgressDrawable(tileify(drawable, false));
        }
        this.mDuration = obtainStyledAttributes.getInt(9, this.mDuration);
        this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(11, this.mMinWidth);
        this.mMaxWidth = obtainStyledAttributes.getDimensionPixelSize(0, this.mMaxWidth);
        this.mMinHeight = obtainStyledAttributes.getDimensionPixelSize(12, this.mMinHeight);
        this.mMaxHeight = obtainStyledAttributes.getDimensionPixelSize(1, this.mMaxHeight);
        this.mBehavior = obtainStyledAttributes.getInt(10, this.mBehavior);
        int resourceId = obtainStyledAttributes.getResourceId(13, 17432587);
        if (resourceId > 0) {
            setInterpolator(context, resourceId);
        }
        setMax(obtainStyledAttributes.getInt(2, this.mMax));
        setProgress(obtainStyledAttributes.getInt(3, this.mProgress));
        setSecondaryProgress(obtainStyledAttributes.getInt(4, this.mSecondaryProgress));
        drawable = obtainStyledAttributes.getDrawable(7);
        if (drawable != null) {
            setIndeterminateDrawable(tileifyIndeterminate(drawable));
        }
        this.mOnlyIndeterminate = obtainStyledAttributes.getBoolean(6, this.mOnlyIndeterminate);
        this.mNoInvalidate = false;
        if (this.mOnlyIndeterminate || obtainStyledAttributes.getBoolean(5, this.mIndeterminate)) {
            z = true;
        } else {
            z = false;
        }
        setIndeterminate(z);
        this.mAnimationResolution = obtainStyledAttributes.getInteger(14, 200);
        obtainStyledAttributes.recycle();
        this.mAccessibilityManager = (AccessibilityManager) context.getSystemService(z);
        if (z3) {
            if (!SherlockActivity.a) {
                z2 = true;
            }
            SherlockActivity.a = z2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void scheduleAccessibilityEventSender() {
        /*
        r4_this = this;
        r0 = r4.mAccessibilityEventSender;
        if (r0 != 0) goto L_0x0010;
    L_0x0004:
        r0 = new com.actionbarsherlock.internal.widget.IcsProgressBar$AccessibilityEventSender;
        r1 = 0;
        r0.<init>(r4, r1);
        r4.mAccessibilityEventSender = r0;
        r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        if (r0 == 0) goto L_0x0015;
    L_0x0010:
        r0 = r4.mAccessibilityEventSender;
        r4.removeCallbacks(r0);
    L_0x0015:
        r0 = r4.mAccessibilityEventSender;
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r4.postDelayed(r0, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsProgressBar.scheduleAccessibilityEventSender():void");
    }

    static RefreshProgressRunnable access$102(IcsProgressBar icsProgressBar, RefreshProgressRunnable refreshProgressRunnable) {
        icsProgressBar.mRefreshProgressRunnable = refreshProgressRunnable;
        return refreshProgressRunnable;
    }

    public void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            if (this.mIndeterminate) {
                if (i == 8 || i == 4) {
                    stopAnimation();
                    if (!AbsActionBarView.b) {
                        return;
                    }
                }
                startAnimation();
            }
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        updateDrawableBounds(i, i2);
    }

    public IcsProgressBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void refreshProgress(int r7, int r8, boolean r9) {
        /*
        r6_this = this;
        monitor-enter(r6);
        r1 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;	 Catch:{ all -> 0x002f }
        r2 = r6.mUiThreadId;	 Catch:{ all -> 0x002f }
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x002f }
        r4 = r0.getId();	 Catch:{ all -> 0x002f }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x0017;
    L_0x0011:
        r0 = 1;
        r6.doRefreshProgress(r7, r8, r9, r0);	 Catch:{ all -> 0x002f }
        if (r1 == 0) goto L_0x002d;
    L_0x0017:
        r0 = r6.mRefreshProgressRunnable;	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x0025;
    L_0x001b:
        r0 = r6.mRefreshProgressRunnable;	 Catch:{ all -> 0x002f }
        r2 = 0;
        r6.mRefreshProgressRunnable = r2;	 Catch:{ all -> 0x002f }
        r0.setup(r7, r8, r9);	 Catch:{ all -> 0x002f }
        if (r1 == 0) goto L_0x002a;
    L_0x0025:
        r0 = new com.actionbarsherlock.internal.widget.IcsProgressBar$RefreshProgressRunnable;	 Catch:{ all -> 0x002f }
        r0.<init>(r6, r7, r8, r9);	 Catch:{ all -> 0x002f }
    L_0x002a:
        r6.post(r0);	 Catch:{ all -> 0x002f }
    L_0x002d:
        monitor-exit(r6);
        return;
    L_0x002f:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsProgressBar.refreshProgress(int, int, boolean):void");
    }

    public IcsProgressBar(Context context) {
        this(context, null);
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.mProgressDrawable || drawable == this.mIndeterminateDrawable || super.verifyDrawable(drawable);
    }

    public IcsProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842871);
    }

    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.mIndeterminate) {
            if (i == 8 || i == 4) {
                stopAnimation();
                if (!AbsActionBarView.b) {
                    return;
                }
            }
            startAnimation();
        }
    }

    @ExportedProperty(category = "progress")
    public synchronized boolean isIndeterminate() {
        return this.mIndeterminate;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (!this.mInDrawing) {
            if (verifyDrawable(drawable)) {
                Rect bounds = drawable.getBounds();
                int scrollX = getScrollX() + getPaddingLeft();
                int scrollY = getScrollY() + getPaddingTop();
                invalidate(bounds.left + scrollX, bounds.top + scrollY, scrollX + bounds.right, bounds.bottom + scrollY);
                if (!AbsActionBarView.b) {
                    return;
                }
            }
            super.invalidateDrawable(drawable);
        }
    }

    protected void onDetachedFromWindow() {
        if (this.mIndeterminate) {
            stopAnimation();
        }
        if (this.mRefreshProgressRunnable != null) {
            removeCallbacks(this.mRefreshProgressRunnable);
        }
        if (this.mAccessibilityEventSender != null) {
            removeCallbacks(this.mAccessibilityEventSender);
        }
        super.onDetachedFromWindow();
    }

    public void setInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    private void updateDrawableBounds(int i, int i2) {
        int i3;
        int paddingRight = (i - getPaddingRight()) - getPaddingLeft();
        int paddingBottom = (i2 - getPaddingBottom()) - getPaddingTop();
        if (this.mIndeterminateDrawable != null) {
            int i4;
            if (this.mOnlyIndeterminate && !(this.mIndeterminateDrawable instanceof AnimationDrawable)) {
                float intrinsicWidth = ((float) this.mIndeterminateDrawable.getIntrinsicWidth()) / ((float) this.mIndeterminateDrawable.getIntrinsicHeight());
                float f = ((float) i) / ((float) i2);
                if (intrinsicWidth != f) {
                    if (f > intrinsicWidth) {
                        i4 = (int) (((float) i2) * intrinsicWidth);
                        paddingRight = (i - i4) / 2;
                        i4 += paddingRight;
                        if (!AbsActionBarView.b) {
                            i3 = i4;
                            i4 = 0;
                            this.mIndeterminateDrawable.setBounds(0, 0, i3 - paddingRight, paddingBottom - i4);
                            this.mIndeterminateRealLeft = paddingRight;
                            this.mIndeterminateRealTop = i4;
                        }
                    } else {
                        i4 = paddingRight;
                        paddingRight = 0;
                    }
                    i3 = (int) (((float) i) * (1.0f / intrinsicWidth));
                    paddingBottom = (i2 - i3) / 2;
                    int i5 = paddingBottom;
                    paddingBottom = i3 + paddingBottom;
                    i3 = i4;
                    i4 = i5;
                    this.mIndeterminateDrawable.setBounds(0, 0, i3 - paddingRight, paddingBottom - i4);
                    this.mIndeterminateRealLeft = paddingRight;
                    this.mIndeterminateRealTop = i4;
                }
            }
            i4 = 0;
            i3 = paddingRight;
            paddingRight = 0;
            this.mIndeterminateDrawable.setBounds(0, 0, i3 - paddingRight, paddingBottom - i4);
            this.mIndeterminateRealLeft = paddingRight;
            this.mIndeterminateRealTop = i4;
        } else {
            i3 = paddingRight;
        }
        if (this.mProgressDrawable != null) {
            this.mProgressDrawable.setBounds(0, 0, i3, paddingBottom);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(this.mMax);
        accessibilityEvent.setCurrentItemIndex(this.mProgress);
    }

    public void setInterpolator(Context context, int i) {
        setInterpolator(AnimationUtils.loadInterpolator(context, i));
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        updateDrawableState();
    }

    public synchronized void setSecondaryProgress(int i) {
        int i2 = 0;
        synchronized (this) {
            if (!this.mIndeterminate) {
                if (i >= 0) {
                    i2 = i;
                }
                if (i2 > this.mMax) {
                    i2 = this.mMax;
                }
                if (i2 != this.mSecondaryProgress) {
                    this.mSecondaryProgress = i2;
                    refreshProgress(16908303, this.mSecondaryProgress, false);
                }
            }
        }
    }

    public synchronized void setProgress(int i) {
        setProgress(i, false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setProgressDrawable(android.graphics.drawable.Drawable r5) {
        /*
        r4_this = this;
        r1 = 0;
        r0 = r4.mProgressDrawable;
        if (r0 == 0) goto L_0x0014;
    L_0x0005:
        r0 = r4.mProgressDrawable;
        if (r5 == r0) goto L_0x0014;
    L_0x0009:
        r0 = r4.mProgressDrawable;
        r2 = 0;
        r0.setCallback(r2);
        r0 = 1;
        r2 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        if (r2 == 0) goto L_0x0015;
    L_0x0014:
        r0 = r1;
    L_0x0015:
        if (r5 == 0) goto L_0x0027;
    L_0x0017:
        r5.setCallback(r4);
        r2 = r5.getMinimumHeight();
        r3 = r4.mMaxHeight;
        if (r3 >= r2) goto L_0x0027;
    L_0x0022:
        r4.mMaxHeight = r2;
        r4.requestLayout();
    L_0x0027:
        r4.mProgressDrawable = r5;
        r2 = r4.mIndeterminate;
        if (r2 != 0) goto L_0x0032;
    L_0x002d:
        r4.mCurrentDrawable = r5;
        r4.postInvalidate();
    L_0x0032:
        if (r0 == 0) goto L_0x0052;
    L_0x0034:
        r0 = r4.getWidth();
        r2 = r4.getHeight();
        r4.updateDrawableBounds(r0, r2);
        r4.updateDrawableState();
        r0 = 16908301; // 0x102000d float:2.3877265E-38 double:8.3538107E-317;
        r2 = r4.mProgress;
        r4.doRefreshProgress(r0, r2, r1, r1);
        r0 = 16908303; // 0x102000f float:2.387727E-38 double:8.3538116E-317;
        r2 = r4.mSecondaryProgress;
        r4.doRefreshProgress(r0, r2, r1, r1);
    L_0x0052:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsProgressBar.setProgressDrawable(android.graphics.drawable.Drawable):void");
    }

    private void updateDrawableState() {
        int[] drawableState = getDrawableState();
        if (this.mProgressDrawable != null && this.mProgressDrawable.isStateful()) {
            this.mProgressDrawable.setState(drawableState);
        }
        if (this.mIndeterminateDrawable != null && this.mIndeterminateDrawable.isStateful()) {
            this.mIndeterminateDrawable.setState(drawableState);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void startAnimation() {
        /*
        r4_this = this;
        r0 = r4.getVisibility();
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = r4.mIndeterminateDrawable;
        r0 = r0 instanceof android.graphics.drawable.Animatable;
        if (r0 == 0) goto L_0x0017;
    L_0x000d:
        r0 = 1;
        r4.mShouldStartAnimationDrawable = r0;
        r0 = 0;
        r4.mAnimation = r0;
        r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        if (r0 == 0) goto L_0x0056;
    L_0x0017:
        r0 = r4.mInterpolator;
        if (r0 != 0) goto L_0x0022;
    L_0x001b:
        r0 = new android.view.animation.LinearInterpolator;
        r0.<init>();
        r4.mInterpolator = r0;
    L_0x0022:
        r0 = new android.view.animation.Transformation;
        r0.<init>();
        r4.mTransformation = r0;
        r0 = new android.view.animation.AlphaAnimation;
        r1 = 0;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.<init>(r1, r2);
        r4.mAnimation = r0;
        r0 = r4.mAnimation;
        r1 = r4.mBehavior;
        r0.setRepeatMode(r1);
        r0 = r4.mAnimation;
        r1 = -1;
        r0.setRepeatCount(r1);
        r0 = r4.mAnimation;
        r1 = r4.mDuration;
        r2 = (long) r1;
        r0.setDuration(r2);
        r0 = r4.mAnimation;
        r1 = r4.mInterpolator;
        r0.setInterpolator(r1);
        r0 = r4.mAnimation;
        r2 = -1;
        r0.setStartTime(r2);
    L_0x0056:
        r4.postInvalidate();
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsProgressBar.startAnimation():void");
    }

    Shape getDrawableShape() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    @ExportedProperty(category = "progress")
    public synchronized int getProgress() {
        return this.mIndeterminate ? 0 : this.mProgress;
    }

    public void postInvalidate() {
        if (!this.mNoInvalidate) {
            super.postInvalidate();
        }
    }

    static void access$000(IcsProgressBar icsProgressBar, int i, int i2, boolean z, boolean z2) {
        icsProgressBar.doRefreshProgress(i, i2, z, z2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setIndeterminate(boolean r2) {
        /*
        r1_this = this;
        monitor-enter(r1);
        r0 = r1.mOnlyIndeterminate;	 Catch:{ all -> 0x0025 }
        if (r0 == 0) goto L_0x0009;
    L_0x0005:
        r0 = r1.mIndeterminate;	 Catch:{ all -> 0x0025 }
        if (r0 != 0) goto L_0x0023;
    L_0x0009:
        r0 = r1.mIndeterminate;	 Catch:{ all -> 0x0025 }
        if (r2 == r0) goto L_0x0023;
    L_0x000d:
        r1.mIndeterminate = r2;	 Catch:{ all -> 0x0025 }
        if (r2 == 0) goto L_0x001c;
    L_0x0011:
        r0 = r1.mIndeterminateDrawable;	 Catch:{ all -> 0x0025 }
        r1.mCurrentDrawable = r0;	 Catch:{ all -> 0x0025 }
        r1.startAnimation();	 Catch:{ all -> 0x0025 }
        r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;	 Catch:{ all -> 0x0025 }
        if (r0 == 0) goto L_0x0023;
    L_0x001c:
        r0 = r1.mProgressDrawable;	 Catch:{ all -> 0x0025 }
        r1.mCurrentDrawable = r0;	 Catch:{ all -> 0x0025 }
        r1.stopAnimation();	 Catch:{ all -> 0x0025 }
    L_0x0023:
        monitor-exit(r1);
        return;
    L_0x0025:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsProgressBar.setIndeterminate(boolean):void");
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.mProgressDrawable != null) {
            this.mProgressDrawable.jumpToCurrentState();
        }
        if (this.mIndeterminateDrawable != null) {
            this.mIndeterminateDrawable.jumpToCurrentState();
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mIndeterminate) {
            startAnimation();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void doRefreshProgress(int r6, int r7, boolean r8, boolean r9) {
        /*
        r5_this = this;
        monitor-enter(r5);
        r1 = r5.mMax;	 Catch:{ all -> 0x003d }
        if (r1 <= 0) goto L_0x003a;
    L_0x0005:
        r1 = (float) r7;	 Catch:{ all -> 0x003d }
        r2 = r5.mMax;	 Catch:{ all -> 0x003d }
        r2 = (float) r2;	 Catch:{ all -> 0x003d }
        r1 = r1 / r2;
        r3 = r1;
    L_0x000b:
        r2 = r5.mCurrentDrawable;	 Catch:{ all -> 0x003d }
        if (r2 == 0) goto L_0x002b;
    L_0x000f:
        r1 = 0;
        r4 = r2 instanceof android.graphics.drawable.LayerDrawable;	 Catch:{ all -> 0x003d }
        if (r4 == 0) goto L_0x001c;
    L_0x0014:
        r0 = r2;
        r0 = (android.graphics.drawable.LayerDrawable) r0;	 Catch:{ all -> 0x003d }
        r1 = r0;
        r1 = r1.findDrawableByLayerId(r6);	 Catch:{ all -> 0x003d }
    L_0x001c:
        r4 = 1176256512; // 0x461c4000 float:10000.0 double:5.811479333E-315;
        r4 = r4 * r3;
        r4 = (int) r4;	 Catch:{ all -> 0x003d }
        if (r1 == 0) goto L_0x0024;
    L_0x0023:
        r2 = r1;
    L_0x0024:
        r2.setLevel(r4);	 Catch:{ all -> 0x003d }
        r1 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;	 Catch:{ all -> 0x003d }
        if (r1 == 0) goto L_0x002e;
    L_0x002b:
        r5.invalidate();	 Catch:{ all -> 0x003d }
    L_0x002e:
        if (r9 == 0) goto L_0x0038;
    L_0x0030:
        r1 = 16908301; // 0x102000d float:2.3877265E-38 double:8.3538107E-317;
        if (r6 != r1) goto L_0x0038;
    L_0x0035:
        r5.onProgressRefresh(r3, r8);	 Catch:{ all -> 0x003d }
    L_0x0038:
        monitor-exit(r5);
        return;
    L_0x003a:
        r1 = 0;
        r3 = r1;
        goto L_0x000b;
    L_0x003d:
        r1 = move-exception;
        monitor-exit(r5);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsProgressBar.doRefreshProgress(int, int, boolean, boolean):void");
    }

    public synchronized void setMax(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i != this.mMax) {
            this.mMax = i;
            postInvalidate();
            if (this.mProgress > i) {
                this.mProgress = i;
            }
            refreshProgress(16908301, this.mProgress, false);
        }
    }

    private Drawable tileifyIndeterminate(Drawable drawable) {
        boolean z = AbsActionBarView.b;
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        Drawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        int i = 0;
        while (i < numberOfFrames) {
            Drawable tileify = tileify(animationDrawable.getFrame(i), true);
            tileify.setLevel(10000);
            animationDrawable2.addFrame(tileify, animationDrawable.getDuration(i));
            i++;
            if (z) {
                break;
            }
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    void onProgressRefresh(float f, boolean z) {
        if (this.mAccessibilityManager.isEnabled()) {
            scheduleAccessibilityEventSender();
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.mIndeterminateDrawable = drawable;
        if (this.mIndeterminate) {
            this.mCurrentDrawable = drawable;
            postInvalidate();
        }
    }

    private void initProgressBar() {
        this.mMax = 100;
        this.mProgress = 0;
        this.mSecondaryProgress = 0;
        this.mIndeterminate = false;
        this.mOnlyIndeterminate = false;
        this.mDuration = 4000;
        this.mBehavior = 1;
        this.mMinWidth = 24;
        this.mMaxWidth = 48;
        this.mMinHeight = 24;
        this.mMaxHeight = 48;
    }

    static {
        boolean z;
        char[] toCharArray = "ml\u001f%,\u007ff\u001e)3e{\u0005".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 12;
                    break;
                case ay.f /*1*/:
                    i2 = 15;
                    break;
                case ay.n /*2*/:
                    i2 = 124;
                    break;
                case ay.p /*3*/:
                    i2 = 64;
                    break;
                default:
                    i2 = 95;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        if (VERSION.SDK_INT >= 11) {
            z = true;
        } else {
            z = false;
        }
        IS_HONEYCOMB = z;
        ProgressBar = new int[]{16843039, 16843040, 16843062, 16843063, 16843064, 16843065, 16843066, 16843067, 16843068, 16843069, 16843070, 16843071, 16843072, 16843073, 16843546};
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setProgress(savedState.progress);
        setSecondaryProgress(savedState.secondaryProgress);
    }
}
