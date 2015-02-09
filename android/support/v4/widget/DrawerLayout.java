package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewGroupCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.DrawerLayout.LayoutParams;
import android.support.v4.widget.ViewDragHelper.Callback;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.whatsapp.vk;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class DrawerLayout extends ViewGroup implements DrawerLayoutImpl {
    private static final boolean CAN_HIDE_DESCENDANTS;
    static final DrawerLayoutCompatImpl IMPL;
    private static final int[] LAYOUT_ATTRS;
    private static final String[] z;
    private final ChildAccessibilityDelegate mChildAccessibilityDelegate;
    private boolean mChildrenCanceledTouch;
    private boolean mDisallowInterceptRequested;
    private boolean mDrawStatusBarBackground;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
    private final ViewDragCallback mLeftCallback;
    private final ViewDragHelper mLeftDragger;
    private DrawerListener mListener;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mMinDrawerMargin;
    private final ViewDragCallback mRightCallback;
    private final ViewDragHelper mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowLeft;
    private Drawable mShadowRight;
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;

    class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final Rect mTmpRect;
        final DrawerLayout this$0;

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View access$300 = DrawerLayout.access$300(this.this$0);
            if (access$300 != null) {
                CharSequence drawerTitle = this.this$0.getDrawerTitle(this.this$0.getDrawerViewAbsoluteGravity(access$300));
                if (drawerTitle != null) {
                    text.add(drawerTitle);
                }
            }
            return true;
        }

        private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.mTmpRect;
            accessibilityNodeInfoCompat2.getBoundsInParent(rect);
            accessibilityNodeInfoCompat.setBoundsInParent(rect);
            accessibilityNodeInfoCompat2.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompat2.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompat2.getPackageName());
            accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompat2.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompat2.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompat2.isEnabled());
            accessibilityNodeInfoCompat.setClickable(accessibilityNodeInfoCompat2.isClickable());
            accessibilityNodeInfoCompat.setFocusable(accessibilityNodeInfoCompat2.isFocusable());
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompat2.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompat2.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompat2.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(accessibilityNodeInfoCompat2.isLongClickable());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompat2.getActions());
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onInitializeAccessibilityNodeInfo(android.view.View r4, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat r5) {
            /*
            r3_this = this;
            r0 = android.support.v4.widget.DrawerLayout.access$200();
            if (r0 == 0) goto L_0x000d;
        L_0x0006:
            super.onInitializeAccessibilityNodeInfo(r4, r5);
            r0 = android.support.v4.widget.SlidingPaneLayout.a;
            if (r0 == 0) goto L_0x002f;
        L_0x000d:
            r1 = android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.obtain(r5);
            super.onInitializeAccessibilityNodeInfo(r4, r1);
            r5.setSource(r4);
            r0 = android.support.v4.view.ViewCompat.getParentForAccessibility(r4);
            r2 = r0 instanceof android.view.View;
            if (r2 == 0) goto L_0x0024;
        L_0x001f:
            r0 = (android.view.View) r0;
            r5.setParent(r0);
        L_0x0024:
            r3.copyNodeInfoNoChildren(r5, r1);
            r1.recycle();
            r4 = (android.view.ViewGroup) r4;
            r3.addChildrenForAccessibility(r5, r4);
        L_0x002f:
            r0 = android.support.v4.widget.DrawerLayout.class;
            r0 = r0.getName();
            r5.setClassName(r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.AccessibilityDelegate.onInitializeAccessibilityNodeInfo(android.view.View, android.support.v4.view.accessibility.AccessibilityNodeInfoCompat):void");
        }

        private void addChildrenForAccessibility(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ViewGroup viewGroup) {
            int i = SlidingPaneLayout.a;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = viewGroup.getChildAt(i2);
                if (DrawerLayout.access$400(childAt)) {
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
                i2++;
                if (i != 0) {
                    return;
                }
            }
        }

        AccessibilityDelegate(DrawerLayout drawerLayout) {
            this.this$0 = drawerLayout;
            this.mTmpRect = new Rect();
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return (DrawerLayout.access$200() || DrawerLayout.access$400(view)) ? super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : false;
        }
    }

    final class ChildAccessibilityDelegate extends AccessibilityDelegateCompat {
        final DrawerLayout this$0;

        ChildAccessibilityDelegate(DrawerLayout drawerLayout) {
            this.this$0 = drawerLayout;
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (!DrawerLayout.access$400(view)) {
                accessibilityNodeInfoCompat.setParent(null);
            }
        }
    }

    interface DrawerLayoutCompatImpl {
        void applyMarginInsets(MarginLayoutParams marginLayoutParams, Object obj, int i);

        void configureApplyInsets(View view);

        void dispatchChildInsets(View view, Object obj, int i);

        int getTopInset(Object obj);
    }

    class DrawerLayoutCompatImplApi21 implements DrawerLayoutCompatImpl {
        public void applyMarginInsets(MarginLayoutParams marginLayoutParams, Object obj, int i) {
            DrawerLayoutCompatApi21.applyMarginInsets(marginLayoutParams, obj, i);
        }

        DrawerLayoutCompatImplApi21() {
        }

        public int getTopInset(Object obj) {
            return DrawerLayoutCompatApi21.getTopInset(obj);
        }

        public void configureApplyInsets(View view) {
            DrawerLayoutCompatApi21.configureApplyInsets(view);
        }

        public void dispatchChildInsets(View view, Object obj, int i) {
            DrawerLayoutCompatApi21.dispatchChildInsets(view, obj, i);
        }
    }

    class DrawerLayoutCompatImplBase implements DrawerLayoutCompatImpl {
        public void dispatchChildInsets(View view, Object obj, int i) {
        }

        public void configureApplyInsets(View view) {
        }

        public void applyMarginInsets(MarginLayoutParams marginLayoutParams, Object obj, int i) {
        }

        public int getTopInset(Object obj) {
            return 0;
        }

        DrawerLayoutCompatImplBase() {
        }
    }

    public interface DrawerListener {
        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f);

        void onDrawerStateChanged(int i);
    }

    public class LayoutParams extends MarginLayoutParams {
        public int gravity;
        boolean isPeeking;
        boolean knownOpen;
        float onScreen;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.access$100());
            this.gravity = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(android.support.v4.widget.DrawerLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = 0;
        }
    }

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        int lockModeLeft;
        int lockModeRight;
        int openDrawerGravity;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.openDrawerGravity = 0;
            this.lockModeLeft = 0;
            this.lockModeRight = 0;
            this.openDrawerGravity = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.openDrawerGravity);
        }

        static {
            CREATOR = new Creator() {
                public android.support.v4.widget.DrawerLayout.SavedState createFromParcel(Parcel parcel) {
                    return new android.support.v4.widget.DrawerLayout.SavedState(parcel);
                }

                public Object createFromParcel(Parcel parcel) {
                    return createFromParcel(parcel);
                }

                public android.support.v4.widget.DrawerLayout.SavedState[] newArray(int i) {
                    return new android.support.v4.widget.DrawerLayout.SavedState[i];
                }

                public Object[] newArray(int i) {
                    return newArray(i);
                }
            };
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.openDrawerGravity = 0;
            this.lockModeLeft = 0;
            this.lockModeRight = 0;
        }
    }

    class ViewDragCallback extends Callback {
        private final int mAbsGravity;
        private ViewDragHelper mDragger;
        private final Runnable mPeekRunnable;
        final DrawerLayout this$0;

        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onEdgeDragStarted(int r3, int r4) {
            /*
            r2_this = this;
            r0 = r3 & 1;
            r1 = 1;
            if (r0 != r1) goto L_0x0010;
        L_0x0005:
            r0 = r2.this$0;
            r1 = 3;
            r0 = r0.findDrawerWithGravity(r1);
            r1 = android.support.v4.widget.SlidingPaneLayout.a;
            if (r1 == 0) goto L_0x0017;
        L_0x0010:
            r0 = r2.this$0;
            r1 = 5;
            r0 = r0.findDrawerWithGravity(r1);
        L_0x0017:
            if (r0 == 0) goto L_0x0026;
        L_0x0019:
            r1 = r2.this$0;
            r1 = r1.getDrawerLockMode(r0);
            if (r1 != 0) goto L_0x0026;
        L_0x0021:
            r1 = r2.mDragger;
            r1.captureChildView(r0, r4);
        L_0x0026:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.ViewDragCallback.onEdgeDragStarted(int, int):void");
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (this.this$0.checkDrawerViewAbsoluteGravity(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = this.this$0.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        static void access$000(ViewDragCallback viewDragCallback) {
            viewDragCallback.peekDrawer();
        }

        public void onEdgeTouched(int i, int i2) {
            this.this$0.postDelayed(this.mPeekRunnable, 160);
        }

        public ViewDragCallback(DrawerLayout drawerLayout, int i) {
            this.this$0 = drawerLayout;
            this.mPeekRunnable = new Runnable() {
                final ViewDragCallback this$1;

                public void run() {
                    ViewDragCallback.access$000(this.this$1);
                }

                {
                    this.this$1 = r1;
                }
            };
            this.mAbsGravity = i;
        }

        private void closeOtherDrawer() {
            int i = 3;
            if (this.mAbsGravity == 3) {
                i = 5;
            }
            View findDrawerWithGravity = this.this$0.findDrawerWithGravity(i);
            if (findDrawerWithGravity != null) {
                this.this$0.closeDrawer(findDrawerWithGravity);
            }
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void removeCallbacks() {
            this.this$0.removeCallbacks(this.mPeekRunnable);
        }

        public void setDragger(ViewDragHelper viewDragHelper) {
            this.mDragger = viewDragHelper;
        }

        public boolean tryCaptureView(View view, int i) {
            return this.this$0.isDrawerView(view) && this.this$0.checkDrawerViewAbsoluteGravity(view, this.mAbsGravity) && this.this$0.getDrawerLockMode(view) == 0;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onViewReleased(android.view.View r7, float r8, float r9) {
            /*
            r6_this = this;
            r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
            r4 = 0;
            r0 = r6.this$0;
            r1 = r0.getDrawerViewOffset(r7);
            r2 = r7.getWidth();
            r0 = r6.this$0;
            r3 = 3;
            r0 = r0.checkDrawerViewAbsoluteGravity(r7, r3);
            if (r0 == 0) goto L_0x0027;
        L_0x0016:
            r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
            if (r0 > 0) goto L_0x0022;
        L_0x001a:
            r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
            if (r0 != 0) goto L_0x0049;
        L_0x001e:
            r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
            if (r0 <= 0) goto L_0x0049;
        L_0x0022:
            r0 = 0;
        L_0x0023:
            r3 = android.support.v4.widget.SlidingPaneLayout.a;
            if (r3 == 0) goto L_0x003a;
        L_0x0027:
            r0 = r6.this$0;
            r0 = r0.getWidth();
            r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
            if (r3 < 0) goto L_0x0039;
        L_0x0031:
            r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
            if (r3 != 0) goto L_0x003a;
        L_0x0035:
            r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
            if (r1 <= 0) goto L_0x003a;
        L_0x0039:
            r0 = r0 - r2;
        L_0x003a:
            r1 = r6.mDragger;
            r2 = r7.getTop();
            r1.settleCapturedViewAt(r0, r2);
            r0 = r6.this$0;
            r0.invalidate();
            return;
        L_0x0049:
            r0 = -r2;
            goto L_0x0023;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.ViewDragCallback.onViewReleased(android.view.View, float, float):void");
        }

        public void onViewDragStateChanged(int i) {
            this.this$0.updateDrawerState(this.mAbsGravity, i, this.mDragger.getCapturedView());
        }

        public void onViewCaptured(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).isPeeking = false;
            closeOtherDrawer();
        }

        public int getViewHorizontalDragRange(View view) {
            return this.this$0.isDrawerView(view) ? view.getWidth() : 0;
        }

        private void peekDrawer() {
            boolean z;
            View view;
            int i;
            int i2 = 0;
            int edgeSize = this.mDragger.getEdgeSize();
            if (this.mAbsGravity == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                View findDrawerWithGravity = this.this$0.findDrawerWithGravity(3);
                if (findDrawerWithGravity != null) {
                    i2 = -findDrawerWithGravity.getWidth();
                }
                i2 += edgeSize;
                if (SlidingPaneLayout.a == 0) {
                    view = findDrawerWithGravity;
                    i = i2;
                    if (view == null) {
                    }
                    if (((!z && view.getLeft() < i) || (!z && view.getLeft() > i)) && this.this$0.getDrawerLockMode(view) == 0) {
                        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                        this.mDragger.smoothSlideViewTo(view, i, view.getTop());
                        layoutParams.isPeeking = true;
                        this.this$0.invalidate();
                        closeOtherDrawer();
                        this.this$0.cancelChildViewTouch();
                        return;
                    }
                    return;
                }
            }
            i2 = this.this$0.getWidth() - edgeSize;
            view = this.this$0.findDrawerWithGravity(5);
            i = i2;
            if (view == null) {
                if (!z) {
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onViewPositionChanged(android.view.View r4, int r5, int r6, int r7, int r8) {
            /*
            r3_this = this;
            r1 = r4.getWidth();
            r0 = r3.this$0;
            r2 = 3;
            r0 = r0.checkDrawerViewAbsoluteGravity(r4, r2);
            if (r0 == 0) goto L_0x0016;
        L_0x000d:
            r0 = r1 + r5;
            r0 = (float) r0;
            r2 = (float) r1;
            r0 = r0 / r2;
            r2 = android.support.v4.widget.SlidingPaneLayout.a;
            if (r2 == 0) goto L_0x0020;
        L_0x0016:
            r0 = r3.this$0;
            r0 = r0.getWidth();
            r0 = r0 - r5;
            r0 = (float) r0;
            r1 = (float) r1;
            r0 = r0 / r1;
        L_0x0020:
            r1 = r3.this$0;
            r1.setDrawerViewOffset(r4, r0);
            r1 = 0;
            r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
            if (r0 != 0) goto L_0x0034;
        L_0x002a:
            r0 = 4;
        L_0x002b:
            r4.setVisibility(r0);
            r0 = r3.this$0;
            r0.invalidate();
            return;
        L_0x0034:
            r0 = 0;
            goto L_0x002b;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.ViewDragCallback.onViewPositionChanged(android.view.View, int, int, int, int):void");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
        r8_this = this;
        r1 = 1;
        r0 = 0;
        r3 = android.support.v4.widget.SlidingPaneLayout.a;
        r2 = android.support.v4.view.MotionEventCompat.getActionMasked(r9);
        r4 = r8.mLeftDragger;
        r4 = r4.shouldInterceptTouchEvent(r9);
        r5 = r8.mRightDragger;
        r5 = r5.shouldInterceptTouchEvent(r9);
        r4 = r4 | r5;
        switch(r2) {
            case 0: goto L_0x0029;
            case 1: goto L_0x0083;
            case 2: goto L_0x0085;
            case 3: goto L_0x0083;
            default: goto L_0x0018;
        };
    L_0x0018:
        r2 = r0;
    L_0x0019:
        if (r4 != 0) goto L_0x0027;
    L_0x001b:
        if (r2 != 0) goto L_0x0027;
    L_0x001d:
        r2 = r8.hasPeekingDrawer();	 Catch:{ IllegalArgumentException -> 0x007d }
        if (r2 != 0) goto L_0x0027;
    L_0x0023:
        r2 = r8.mChildrenCanceledTouch;	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r2 == 0) goto L_0x0028;
    L_0x0027:
        r0 = r1;
    L_0x0028:
        return r0;
    L_0x0029:
        r2 = r9.getX();
        r5 = r9.getY();
        r8.mInitialMotionX = r2;
        r8.mInitialMotionY = r5;
        r6 = r8.mScrimOpacity;
        r7 = 0;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 <= 0) goto L_0x0081;
    L_0x003c:
        r6 = r8.mLeftDragger;
        r2 = (int) r2;
        r5 = (int) r5;
        r2 = r6.findTopChildUnder(r2, r5);
        if (r2 == 0) goto L_0x0081;
    L_0x0046:
        r2 = r8.isContentView(r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r2 == 0) goto L_0x0081;
    L_0x004c:
        r2 = r1;
    L_0x004d:
        r5 = 0;
        r8.mDisallowInterceptRequested = r5;	 Catch:{ IllegalArgumentException -> 0x0079 }
        r5 = 0;
        r8.mChildrenCanceledTouch = r5;	 Catch:{ IllegalArgumentException -> 0x0079 }
        if (r3 == 0) goto L_0x0019;
    L_0x0055:
        r5 = r8.mLeftDragger;	 Catch:{ IllegalArgumentException -> 0x007b }
        r6 = 3;
        r5 = r5.checkTouchSlop(r6);	 Catch:{ IllegalArgumentException -> 0x007b }
        if (r5 == 0) goto L_0x0019;
    L_0x005e:
        r5 = r8.mLeftCallback;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5.removeCallbacks();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5 = r8.mRightCallback;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5.removeCallbacks();	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r3 == 0) goto L_0x0019;
    L_0x006a:
        r3 = 1;
        r8.closeDrawers(r3);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r3 = 0;
        r8.mDisallowInterceptRequested = r3;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r3 = 0;
        r8.mChildrenCanceledTouch = r3;	 Catch:{ IllegalArgumentException -> 0x0075 }
        goto L_0x0019;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        r2 = r0;
        goto L_0x004d;
    L_0x0083:
        r2 = r0;
        goto L_0x006a;
    L_0x0085:
        r2 = r0;
        goto L_0x0055;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    View findOpenDrawer() {
        int i = SlidingPaneLayout.a;
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            try {
                if (((LayoutParams) childAt.getLayoutParams()).knownOpen) {
                    return childAt;
                }
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return null;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    static String gravityToString(int i) {
        if ((i & 3) == 3) {
            try {
                return z[1];
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if ((i & 5) != 5) {
            return Integer.toHexString(i);
        } else {
            try {
                return z[0];
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    int getDrawerViewAbsoluteGravity(View view) {
        return GravityCompat.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(this));
    }

    public int getDrawerLockMode(View view) {
        int drawerViewAbsoluteGravity = getDrawerViewAbsoluteGravity(view);
        if (drawerViewAbsoluteGravity == 3) {
            try {
                return this.mLockModeLeft;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (drawerViewAbsoluteGravity != 5) {
            return 0;
        } else {
            try {
                return this.mLockModeRight;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null) {
                int topInset = IMPL.getTopInset(this.mLastInsets);
                if (topInset > 0) {
                    try {
                        this.mStatusBarBackground.setBounds(0, 0, getWidth(), topInset);
                        this.mStatusBarBackground.draw(canvas);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        try {
            if (layoutParams instanceof LayoutParams) {
                if (super.checkLayoutParams(layoutParams)) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    float getDrawerViewOffset(View view) {
        return ((LayoutParams) view.getLayoutParams()).onScreen;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void closeDrawer(android.view.View r5) {
        /*
        r4_this = this;
        r1 = android.support.v4.widget.SlidingPaneLayout.a;
        r0 = r4.isDrawerView(r5);	 Catch:{ IllegalArgumentException -> 0x002f }
        if (r0 != 0) goto L_0x0031;
    L_0x0008:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x002f }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x002f }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x002f }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x002f }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x002f }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x002f }
        r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x002f }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x002f }
        r3 = 16;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x002f }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x002f }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x002f }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x002f }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002f }
    L_0x002f:
        r0 = move-exception;
        throw r0;
    L_0x0031:
        r0 = r4.mFirstLayout;
        if (r0 == 0) goto L_0x0043;
    L_0x0035:
        r0 = r5.getLayoutParams();
        r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0;
        r2 = 0;
        r0.onScreen = r2;	 Catch:{ IllegalArgumentException -> 0x006b }
        r2 = 0;
        r0.knownOpen = r2;	 Catch:{ IllegalArgumentException -> 0x006b }
        if (r1 == 0) goto L_0x0067;
    L_0x0043:
        r0 = 3;
        r0 = r4.checkDrawerViewAbsoluteGravity(r5, r0);	 Catch:{ IllegalArgumentException -> 0x006d }
        if (r0 == 0) goto L_0x005a;
    L_0x004a:
        r0 = r4.mLeftDragger;	 Catch:{ IllegalArgumentException -> 0x006f }
        r2 = r5.getWidth();	 Catch:{ IllegalArgumentException -> 0x006f }
        r2 = -r2;
        r3 = r5.getTop();	 Catch:{ IllegalArgumentException -> 0x006f }
        r0.smoothSlideViewTo(r5, r2, r3);	 Catch:{ IllegalArgumentException -> 0x006f }
        if (r1 == 0) goto L_0x0067;
    L_0x005a:
        r0 = r4.mRightDragger;	 Catch:{ IllegalArgumentException -> 0x006f }
        r1 = r4.getWidth();	 Catch:{ IllegalArgumentException -> 0x006f }
        r2 = r5.getTop();	 Catch:{ IllegalArgumentException -> 0x006f }
        r0.smoothSlideViewTo(r5, r1, r2);	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x0067:
        r4.invalidate();
        return;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.closeDrawer(android.view.View):void");
    }

    void cancelChildViewTouch() {
        int i = 0;
        int i2 = SlidingPaneLayout.a;
        if (!this.mChildrenCanceledTouch) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            while (i < childCount) {
                getChildAt(i).dispatchTouchEvent(obtain);
                i++;
                if (i2 != 0) {
                    break;
                }
            }
            obtain.recycle();
            this.mChildrenCanceledTouch = true;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r14, int r15) {
        /*
        r13_this = this;
        r5 = android.support.v4.widget.SlidingPaneLayout.a;
        r3 = android.view.View.MeasureSpec.getMode(r14);
        r2 = android.view.View.MeasureSpec.getMode(r15);
        r1 = android.view.View.MeasureSpec.getSize(r14);
        r0 = android.view.View.MeasureSpec.getSize(r15);
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r3 != r4) goto L_0x001a;
    L_0x0016:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r2 == r4) goto L_0x0049;
    L_0x001a:
        r4 = r13.isInEditMode();	 Catch:{ IllegalArgumentException -> 0x0047 }
        if (r4 == 0) goto L_0x003a;
    L_0x0020:
        r4 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r3 != r4) goto L_0x0028;
    L_0x0024:
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r5 == 0) goto L_0x002c;
    L_0x0028:
        if (r3 != 0) goto L_0x002c;
    L_0x002a:
        r1 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
    L_0x002c:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r2 != r3) goto L_0x0034;
    L_0x0030:
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r5 == 0) goto L_0x0049;
    L_0x0034:
        if (r2 != 0) goto L_0x0049;
    L_0x0036:
        r0 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r5 == 0) goto L_0x0049;
    L_0x003a:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0045 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        r3 = r0;
        r4 = r1;
        r13.setMeasuredDimension(r4, r3);	 Catch:{ IllegalArgumentException -> 0x0116 }
        r0 = r13.mLastInsets;	 Catch:{ IllegalArgumentException -> 0x0116 }
        if (r0 == 0) goto L_0x011a;
    L_0x0052:
        r0 = android.support.v4.view.ViewCompat.getFitsSystemWindows(r13);	 Catch:{ IllegalArgumentException -> 0x0118 }
        if (r0 == 0) goto L_0x011a;
    L_0x0058:
        r0 = 1;
        r1 = r0;
    L_0x005a:
        r6 = android.support.v4.view.ViewCompat.getLayoutDirection(r13);
        r7 = 0;
        r8 = r13.getChildCount();
        r0 = 0;
        r2 = r0;
    L_0x0065:
        if (r2 >= r8) goto L_0x0189;
    L_0x0067:
        r9 = r13.getChildAt(r2);
        r0 = r9.getVisibility();	 Catch:{ IllegalArgumentException -> 0x011e }
        r10 = 8;
        if (r0 != r10) goto L_0x0075;
    L_0x0073:
        if (r5 == 0) goto L_0x0185;
    L_0x0075:
        r0 = r9.getLayoutParams();
        r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0;
        if (r1 == 0) goto L_0x0099;
    L_0x007d:
        r10 = r0.gravity;
        r10 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r10, r6);
        r11 = android.support.v4.view.ViewCompat.getFitsSystemWindows(r9);	 Catch:{ IllegalArgumentException -> 0x0120 }
        if (r11 == 0) goto L_0x0092;
    L_0x0089:
        r11 = IMPL;	 Catch:{ IllegalArgumentException -> 0x0122 }
        r12 = r13.mLastInsets;	 Catch:{ IllegalArgumentException -> 0x0122 }
        r11.dispatchChildInsets(r9, r12, r10);	 Catch:{ IllegalArgumentException -> 0x0122 }
        if (r5 == 0) goto L_0x0099;
    L_0x0092:
        r11 = IMPL;	 Catch:{ IllegalArgumentException -> 0x0122 }
        r12 = r13.mLastInsets;	 Catch:{ IllegalArgumentException -> 0x0122 }
        r11.applyMarginInsets(r0, r12, r10);	 Catch:{ IllegalArgumentException -> 0x0122 }
    L_0x0099:
        r10 = r13.isContentView(r9);
        if (r10 == 0) goto L_0x00be;
    L_0x009f:
        r10 = r0.leftMargin;
        r10 = r4 - r10;
        r11 = r0.rightMargin;
        r10 = r10 - r11;
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11);
        r11 = r0.topMargin;
        r11 = r3 - r11;
        r12 = r0.bottomMargin;
        r11 = r11 - r12;
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12);
        r9.measure(r10, r11);	 Catch:{ IllegalArgumentException -> 0x0124 }
        if (r5 == 0) goto L_0x0185;
    L_0x00be:
        r10 = r13.isDrawerView(r9);	 Catch:{ IllegalArgumentException -> 0x0124 }
        if (r10 == 0) goto L_0x0144;
    L_0x00c4:
        r10 = r13.getDrawerViewAbsoluteGravity(r9);
        r10 = r10 & 7;
        r11 = r7 & r10;
        if (r11 == 0) goto L_0x0126;
    L_0x00ce:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0114 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0114 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0114 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0114 }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0114 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0114 }
        r2 = gravityToString(r10);	 Catch:{ IllegalArgumentException -> 0x0114 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0114 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0114 }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0114 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0114 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0114 }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0114 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0114 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0114 }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0114 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0114 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0114 }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0114 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0114 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0114 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0114 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0114 }
    L_0x0114:
        r0 = move-exception;
        throw r0;
    L_0x0116:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0118 }
    L_0x0118:
        r0 = move-exception;
        throw r0;
    L_0x011a:
        r0 = 0;
        r1 = r0;
        goto L_0x005a;
    L_0x011e:
        r0 = move-exception;
        throw r0;
    L_0x0120:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0122 }
    L_0x0122:
        r0 = move-exception;
        throw r0;
    L_0x0124:
        r0 = move-exception;
        throw r0;
    L_0x0126:
        r10 = r13.mMinDrawerMargin;
        r11 = r0.leftMargin;
        r10 = r10 + r11;
        r11 = r0.rightMargin;
        r10 = r10 + r11;
        r11 = r0.width;
        r10 = getChildMeasureSpec(r14, r10, r11);
        r11 = r0.topMargin;
        r12 = r0.bottomMargin;
        r11 = r11 + r12;
        r0 = r0.height;
        r0 = getChildMeasureSpec(r15, r11, r0);
        r9.measure(r10, r0);	 Catch:{ IllegalArgumentException -> 0x0183 }
        if (r5 == 0) goto L_0x0185;
    L_0x0144:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0183 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0183 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0183 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0183 }
        r4 = 12;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0183 }
        r1 = r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x0183 }
        r1 = r1.append(r9);	 Catch:{ IllegalArgumentException -> 0x0183 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0183 }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0183 }
        r1 = r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x0183 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0183 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0183 }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0183 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0183 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0183 }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0183 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0183 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0183 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0183 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0183 }
    L_0x0183:
        r0 = move-exception;
        throw r0;
    L_0x0185:
        r0 = r2 + 1;
        if (r5 == 0) goto L_0x018a;
    L_0x0189:
        return;
    L_0x018a:
        r2 = r0;
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onMeasure(int, int):void");
    }

    boolean isContentView(View view) {
        try {
            return ((LayoutParams) view.getLayoutParams()).gravity == 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        View findOpenDrawer = findOpenDrawer();
        if (findOpenDrawer != null) {
            try {
                savedState.openDrawerGravity = ((LayoutParams) findOpenDrawer.getLayoutParams()).gravity;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        savedState.lockModeLeft = this.mLockModeLeft;
        savedState.lockModeRight = this.mLockModeRight;
        return savedState;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View findVisibleDrawer = findVisibleDrawer();
        if (findVisibleDrawer != null) {
            try {
                if (getDrawerLockMode(findVisibleDrawer) == 0) {
                    closeDrawers();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return findVisibleDrawer != null;
    }

    boolean checkDrawerViewAbsoluteGravity(View view, int i) {
        return (getDrawerViewAbsoluteGravity(view) & i) == i;
    }

    @Nullable
    public CharSequence getDrawerTitle(int i) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        if (absoluteGravity == 3) {
            try {
                return this.mTitleLeft;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (absoluteGravity != 5) {
            return null;
        } else {
            try {
                return this.mTitleRight;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        try {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            try {
                return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static View access$300(DrawerLayout drawerLayout) {
        return drawerLayout.findVisibleDrawer();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    public void requestLayout() {
        try {
            if (!this.mInLayout) {
                super.requestLayout();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void closeDrawers(boolean r11) {
        /*
        r10_this = this;
        r3 = 0;
        r4 = android.support.v4.widget.SlidingPaneLayout.a;
        r5 = r10.getChildCount();
        r2 = r3;
        r1 = r3;
    L_0x0009:
        if (r2 >= r5) goto L_0x0051;
    L_0x000b:
        r6 = r10.getChildAt(r2);
        r0 = r6.getLayoutParams();
        r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0;
        r7 = r10.isDrawerView(r6);	 Catch:{ IllegalArgumentException -> 0x0061 }
        if (r7 == 0) goto L_0x004d;
    L_0x001b:
        if (r11 == 0) goto L_0x0023;
    L_0x001d:
        r7 = r0.isPeeking;	 Catch:{ IllegalArgumentException -> 0x0065 }
        if (r7 != 0) goto L_0x0023;
    L_0x0021:
        if (r4 == 0) goto L_0x004d;
    L_0x0023:
        r7 = r6.getWidth();
        r8 = 3;
        r8 = r10.checkDrawerViewAbsoluteGravity(r6, r8);
        if (r8 == 0) goto L_0x003c;
    L_0x002e:
        r8 = r10.mLeftDragger;
        r7 = -r7;
        r9 = r6.getTop();
        r7 = r8.smoothSlideViewTo(r6, r7, r9);
        r1 = r1 | r7;
        if (r4 == 0) goto L_0x004b;
    L_0x003c:
        r7 = r10.mRightDragger;
        r8 = r10.getWidth();
        r9 = r6.getTop();
        r6 = r7.smoothSlideViewTo(r6, r8, r9);
        r1 = r1 | r6;
    L_0x004b:
        r0.isPeeking = r3;
    L_0x004d:
        r0 = r2 + 1;
        if (r4 == 0) goto L_0x0069;
    L_0x0051:
        r0 = r10.mLeftCallback;	 Catch:{ IllegalArgumentException -> 0x0067 }
        r0.removeCallbacks();	 Catch:{ IllegalArgumentException -> 0x0067 }
        r0 = r10.mRightCallback;	 Catch:{ IllegalArgumentException -> 0x0067 }
        r0.removeCallbacks();	 Catch:{ IllegalArgumentException -> 0x0067 }
        if (r1 == 0) goto L_0x0060;
    L_0x005d:
        r10.invalidate();	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x0060:
        return;
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r2 = r0;
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.closeDrawers(boolean):void");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        try {
            super.requestDisallowInterceptTouchEvent(z);
            this.mDisallowInterceptRequested = z;
            if (z) {
                closeDrawers(true);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private boolean hasVisibleDrawer() {
        try {
            return findVisibleDrawer() != null;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
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
        r11_this = this;
        r6 = android.support.v4.widget.SlidingPaneLayout.a;
        r4 = r11.getHeight();
        r5 = r11.isContentView(r13);
        r1 = 0;
        r0 = r11.getWidth();
        r7 = r12.save();
        if (r5 == 0) goto L_0x0064;
    L_0x0015:
        r8 = r11.getChildCount();
        r2 = 0;
        r3 = r2;
        r10 = r0;
        r0 = r1;
        r1 = r10;
    L_0x001e:
        if (r3 >= r8) goto L_0x0151;
    L_0x0020:
        r9 = r11.getChildAt(r3);
        if (r9 == r13) goto L_0x014c;
    L_0x0026:
        r2 = r9.getVisibility();	 Catch:{ IllegalArgumentException -> 0x0132 }
        if (r2 != 0) goto L_0x014c;
    L_0x002c:
        r2 = hasOpaqueBackground(r9);	 Catch:{ IllegalArgumentException -> 0x0134 }
        if (r2 == 0) goto L_0x014c;
    L_0x0032:
        r2 = r11.isDrawerView(r9);	 Catch:{ IllegalArgumentException -> 0x0136 }
        if (r2 == 0) goto L_0x014c;
    L_0x0038:
        r2 = r9.getHeight();	 Catch:{ IllegalArgumentException -> 0x0138 }
        if (r2 >= r4) goto L_0x0040;
    L_0x003e:
        if (r6 == 0) goto L_0x014c;
    L_0x0040:
        r2 = 3;
        r2 = r11.checkDrawerViewAbsoluteGravity(r9, r2);	 Catch:{ IllegalArgumentException -> 0x013a }
        if (r2 == 0) goto L_0x0050;
    L_0x0047:
        r2 = r9.getRight();
        if (r2 <= r0) goto L_0x004e;
    L_0x004d:
        r0 = r2;
    L_0x004e:
        if (r6 == 0) goto L_0x014c;
    L_0x0050:
        r2 = r9.getLeft();
        if (r2 >= r1) goto L_0x014c;
    L_0x0056:
        r1 = r0;
        r0 = r2;
    L_0x0058:
        r2 = r3 + 1;
        if (r6 == 0) goto L_0x0146;
    L_0x005c:
        r2 = 0;
        r3 = r11.getHeight();
        r12.clipRect(r1, r2, r0, r3);
    L_0x0064:
        r8 = super.drawChild(r12, r13, r14);
        r12.restoreToCount(r7);	 Catch:{ IllegalArgumentException -> 0x013c }
        r2 = r11.mScrimOpacity;	 Catch:{ IllegalArgumentException -> 0x013c }
        r3 = 0;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 <= 0) goto L_0x009e;
    L_0x0072:
        if (r5 == 0) goto L_0x009e;
    L_0x0074:
        r2 = r11.mScrimColor;
        r3 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r2 = r2 & r3;
        r2 = r2 >>> 24;
        r2 = (float) r2;
        r3 = r11.mScrimOpacity;
        r2 = r2 * r3;
        r2 = (int) r2;
        r2 = r2 << 24;
        r3 = r11.mScrimColor;
        r4 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r3 = r3 & r4;
        r2 = r2 | r3;
        r3 = r11.mScrimPaint;	 Catch:{ IllegalArgumentException -> 0x013e }
        r3.setColor(r2);	 Catch:{ IllegalArgumentException -> 0x013e }
        r1 = (float) r1;	 Catch:{ IllegalArgumentException -> 0x013e }
        r2 = 0;	 Catch:{ IllegalArgumentException -> 0x013e }
        r3 = (float) r0;	 Catch:{ IllegalArgumentException -> 0x013e }
        r0 = r11.getHeight();	 Catch:{ IllegalArgumentException -> 0x013e }
        r4 = (float) r0;	 Catch:{ IllegalArgumentException -> 0x013e }
        r5 = r11.mScrimPaint;	 Catch:{ IllegalArgumentException -> 0x013e }
        r0 = r12;	 Catch:{ IllegalArgumentException -> 0x013e }
        r0.drawRect(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x013e }
        if (r6 == 0) goto L_0x0131;
    L_0x009e:
        r0 = r11.mShadowLeft;	 Catch:{ IllegalArgumentException -> 0x0140 }
        if (r0 == 0) goto L_0x00e6;	 Catch:{ IllegalArgumentException -> 0x0140 }
    L_0x00a2:
        r0 = 3;	 Catch:{ IllegalArgumentException -> 0x0140 }
        r0 = r11.checkDrawerViewAbsoluteGravity(r13, r0);	 Catch:{ IllegalArgumentException -> 0x0140 }
        if (r0 == 0) goto L_0x00e6;
    L_0x00a9:
        r0 = r11.mShadowLeft;
        r0 = r0.getIntrinsicWidth();
        r1 = r13.getRight();
        r2 = r11.mLeftDragger;
        r2 = r2.getEdgeSize();
        r3 = 0;
        r4 = (float) r1;
        r2 = (float) r2;
        r2 = r4 / r2;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = java.lang.Math.min(r2, r4);
        r2 = java.lang.Math.max(r3, r2);
        r3 = r11.mShadowLeft;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r4 = r13.getTop();	 Catch:{ IllegalArgumentException -> 0x0142 }
        r0 = r0 + r1;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r5 = r13.getBottom();	 Catch:{ IllegalArgumentException -> 0x0142 }
        r3.setBounds(r1, r4, r0, r5);	 Catch:{ IllegalArgumentException -> 0x0142 }
        r0 = r11.mShadowLeft;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r1 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r1 = r1 * r2;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r1 = (int) r1;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r0.setAlpha(r1);	 Catch:{ IllegalArgumentException -> 0x0142 }
        r0 = r11.mShadowLeft;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r0.draw(r12);	 Catch:{ IllegalArgumentException -> 0x0142 }
        if (r6 == 0) goto L_0x0131;
    L_0x00e6:
        r0 = r11.mShadowRight;	 Catch:{ IllegalArgumentException -> 0x0144 }
        if (r0 == 0) goto L_0x0131;	 Catch:{ IllegalArgumentException -> 0x0144 }
    L_0x00ea:
        r0 = 5;	 Catch:{ IllegalArgumentException -> 0x0144 }
        r0 = r11.checkDrawerViewAbsoluteGravity(r13, r0);	 Catch:{ IllegalArgumentException -> 0x0144 }
        if (r0 == 0) goto L_0x0131;
    L_0x00f1:
        r0 = r11.mShadowRight;
        r0 = r0.getIntrinsicWidth();
        r1 = r13.getLeft();
        r2 = r11.getWidth();
        r2 = r2 - r1;
        r3 = r11.mRightDragger;
        r3 = r3.getEdgeSize();
        r4 = 0;
        r2 = (float) r2;
        r3 = (float) r3;
        r2 = r2 / r3;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = java.lang.Math.min(r2, r3);
        r2 = java.lang.Math.max(r4, r2);
        r3 = r11.mShadowRight;
        r0 = r1 - r0;
        r4 = r13.getTop();
        r5 = r13.getBottom();
        r3.setBounds(r0, r4, r1, r5);
        r0 = r11.mShadowRight;
        r1 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r1 = r1 * r2;
        r1 = (int) r1;
        r0.setAlpha(r1);
        r0 = r11.mShadowRight;
        r0.draw(r12);
    L_0x0131:
        return r8;
    L_0x0132:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0134 }
    L_0x0134:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0136 }
    L_0x0136:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0138 }
    L_0x0138:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x013a }
    L_0x013a:
        r0 = move-exception;
        throw r0;
    L_0x013c:
        r0 = move-exception;
        throw r0;
    L_0x013e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0140 }
    L_0x0140:
        r0 = move-exception;
        throw r0;
    L_0x0142:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0144 }
    L_0x0144:
        r0 = move-exception;
        throw r0;
    L_0x0146:
        r3 = r2;
        r10 = r0;
        r0 = r1;
        r1 = r10;
        goto L_0x001e;
    L_0x014c:
        r10 = r1;
        r1 = r0;
        r0 = r10;
        goto L_0x0058;
    L_0x0151:
        r10 = r1;
        r1 = r0;
        r0 = r10;
        goto L_0x005c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.openDrawerGravity != 0) {
            View findDrawerWithGravity = findDrawerWithGravity(savedState.openDrawerGravity);
            if (findDrawerWithGravity != null) {
                try {
                    openDrawer(findDrawerWithGravity);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
        setDrawerLockMode(savedState.lockModeLeft, 3);
        setDrawerLockMode(savedState.lockModeRight, 5);
    }

    public void closeDrawers() {
        closeDrawers(false);
    }

    void dispatchOnDrawerOpened(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        try {
            if (!layoutParams.knownOpen) {
                layoutParams.knownOpen = true;
                if (this.mListener != null) {
                    this.mListener.onDrawerOpened(view);
                }
                updateChildrenImportantForAccessibility(view, true);
                view.requestFocus();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
        /*
        r1_this = this;
        super.addView(r2, r3, r4);
        r0 = r1.findOpenDrawer();
        if (r0 != 0) goto L_0x000f;
    L_0x0009:
        r0 = r1.isDrawerView(r2);	 Catch:{ IllegalArgumentException -> 0x0025 }
        if (r0 == 0) goto L_0x0017;
    L_0x000f:
        r0 = 4;
        android.support.v4.view.ViewCompat.setImportantForAccessibility(r2, r0);	 Catch:{ IllegalArgumentException -> 0x0027 }
        r0 = android.support.v4.widget.SlidingPaneLayout.a;	 Catch:{ IllegalArgumentException -> 0x0027 }
        if (r0 == 0) goto L_0x001b;
    L_0x0017:
        r0 = 1;
        android.support.v4.view.ViewCompat.setImportantForAccessibility(r2, r0);	 Catch:{ IllegalArgumentException -> 0x0027 }
    L_0x001b:
        r0 = CAN_HIDE_DESCENDANTS;	 Catch:{ IllegalArgumentException -> 0x0029 }
        if (r0 != 0) goto L_0x0024;
    L_0x001f:
        r0 = r1.mChildAccessibilityDelegate;	 Catch:{ IllegalArgumentException -> 0x0029 }
        android.support.v4.view.ViewCompat.setAccessibilityDelegate(r2, r0);	 Catch:{ IllegalArgumentException -> 0x0029 }
    L_0x0024:
        return;
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;
    L_0x0029:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.addView(android.view.View, int, android.view.ViewGroup$LayoutParams):void");
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = SlidingPaneLayout.a;
        super(context, attributeSet, i);
        this.mChildAccessibilityDelegate = new ChildAccessibilityDelegate(this);
        this.mScrimColor = -1728053248;
        this.mScrimPaint = new Paint();
        this.mFirstLayout = true;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int) ((64.0f * f) + 0.5f);
        f *= 400.0f;
        try {
            this.mLeftCallback = new ViewDragCallback(this, 3);
            this.mRightCallback = new ViewDragCallback(this, 5);
            this.mLeftDragger = ViewDragHelper.create(this, 1.0f, this.mLeftCallback);
            this.mLeftDragger.setEdgeTrackingEnabled(1);
            this.mLeftDragger.setMinVelocity(f);
            this.mLeftCallback.setDragger(this.mLeftDragger);
            this.mRightDragger = ViewDragHelper.create(this, 1.0f, this.mRightCallback);
            this.mRightDragger.setEdgeTrackingEnabled(2);
            this.mRightDragger.setMinVelocity(f);
            this.mRightCallback.setDragger(this.mRightDragger);
            setFocusableInTouchMode(true);
            ViewCompat.setImportantForAccessibility(this, 1);
            ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate(this));
            ViewGroupCompat.setMotionEventSplittingEnabled(this, false);
            if (ViewCompat.getFitsSystemWindows(this)) {
                IMPL.configureApplyInsets(this);
            }
            if (i2 != 0) {
                Fragment.a++;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void updateDrawerState(int r6, int r7, android.view.View r8) {
        /*
        r5_this = this;
        r1 = 2;
        r0 = 1;
        r2 = android.support.v4.widget.SlidingPaneLayout.a;
        r3 = r5.mLeftDragger;
        r3 = r3.getViewDragState();
        r4 = r5.mRightDragger;
        r4 = r4.getViewDragState();
        if (r3 == r0) goto L_0x0014;
    L_0x0012:
        if (r4 != r0) goto L_0x0016;
    L_0x0014:
        if (r2 == 0) goto L_0x0059;
    L_0x0016:
        if (r3 == r1) goto L_0x001a;
    L_0x0018:
        if (r4 != r1) goto L_0x001c;
    L_0x001a:
        if (r2 == 0) goto L_0x001e;
    L_0x001c:
        r0 = 0;
        r1 = r0;
    L_0x001e:
        if (r8 == 0) goto L_0x003f;
    L_0x0020:
        if (r7 != 0) goto L_0x003f;
    L_0x0022:
        r0 = r8.getLayoutParams();
        r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0;
        r3 = r0.onScreen;	 Catch:{ IllegalArgumentException -> 0x004f }
        r4 = 0;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 != 0) goto L_0x0034;
    L_0x002f:
        r5.dispatchOnDrawerClosed(r8);	 Catch:{ IllegalArgumentException -> 0x0051 }
        if (r2 == 0) goto L_0x003f;
    L_0x0034:
        r0 = r0.onScreen;	 Catch:{ IllegalArgumentException -> 0x0053 }
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x003f;
    L_0x003c:
        r5.dispatchOnDrawerOpened(r8);	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x003f:
        r0 = r5.mDrawerState;	 Catch:{ IllegalArgumentException -> 0x0055 }
        if (r1 == r0) goto L_0x004e;
    L_0x0043:
        r5.mDrawerState = r1;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r0 = r5.mListener;	 Catch:{ IllegalArgumentException -> 0x0057 }
        if (r0 == 0) goto L_0x004e;
    L_0x0049:
        r0 = r5.mListener;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r0.onDrawerStateChanged(r1);	 Catch:{ IllegalArgumentException -> 0x0057 }
    L_0x004e:
        return;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        r1 = r0;
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.updateDrawerState(int, int, android.view.View):void");
    }

    View findDrawerWithGravity(int i) {
        int i2 = SlidingPaneLayout.a;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this)) & 7;
        int childCount = getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            if ((getDrawerViewAbsoluteGravity(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
            int i4 = i3 + 1;
            if (i2 != 0) {
                break;
            }
            i3 = i4;
        }
        return null;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
        /*
        r15_this = this;
        r6 = android.support.v4.widget.SlidingPaneLayout.a;
        r0 = 1;
        r15.mInLayout = r0;
        r7 = r19 - r17;
        r8 = r15.getChildCount();
        r0 = 0;
        r5 = r0;
    L_0x000d:
        if (r5 >= r8) goto L_0x00d4;
    L_0x000f:
        r9 = r15.getChildAt(r5);
        r0 = r9.getVisibility();	 Catch:{ IllegalArgumentException -> 0x00db }
        r1 = 8;
        if (r0 != r1) goto L_0x001d;
    L_0x001b:
        if (r6 == 0) goto L_0x00d0;
    L_0x001d:
        r0 = r9.getLayoutParams();
        r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0;
        r1 = r15.isContentView(r9);	 Catch:{ IllegalArgumentException -> 0x00dd }
        if (r1 == 0) goto L_0x0040;
    L_0x0029:
        r1 = r0.leftMargin;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r2 = r0.topMargin;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r3 = r0.leftMargin;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r4 = r9.getMeasuredWidth();	 Catch:{ IllegalArgumentException -> 0x00dd }
        r3 = r3 + r4;
        r4 = r0.topMargin;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r10 = r9.getMeasuredHeight();	 Catch:{ IllegalArgumentException -> 0x00dd }
        r4 = r4 + r10;
        r9.layout(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x00dd }
        if (r6 == 0) goto L_0x00d0;
    L_0x0040:
        r10 = r9.getMeasuredWidth();
        r11 = r9.getMeasuredHeight();
        r1 = 3;
        r1 = r15.checkDrawerViewAbsoluteGravity(r9, r1);
        if (r1 == 0) goto L_0x005d;
    L_0x004f:
        r1 = -r10;
        r2 = (float) r10;
        r3 = r0.onScreen;
        r2 = r2 * r3;
        r2 = (int) r2;
        r2 = r2 + r1;
        r1 = r10 + r2;
        r1 = (float) r1;
        r3 = (float) r10;
        r1 = r1 / r3;
        if (r6 == 0) goto L_0x00f2;
    L_0x005d:
        r1 = (float) r10;
        r2 = r0.onScreen;
        r1 = r1 * r2;
        r1 = (int) r1;
        r2 = r7 - r1;
        r1 = r7 - r2;
        r1 = (float) r1;
        r3 = (float) r10;
        r1 = r1 / r3;
        r3 = r1;
        r4 = r2;
    L_0x006b:
        r1 = r0.onScreen;	 Catch:{ IllegalArgumentException -> 0x00df }
        r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
        if (r1 == 0) goto L_0x00e1;
    L_0x0071:
        r1 = 1;
    L_0x0072:
        r2 = r0.gravity;
        r2 = r2 & 112;
        switch(r2) {
            case 16: goto L_0x009a;
            case 80: goto L_0x0085;
            default: goto L_0x0079;
        };
    L_0x0079:
        r2 = r0.topMargin;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r12 = r4 + r10;
        r13 = r0.topMargin;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r13 = r13 + r11;
        r9.layout(r4, r2, r12, r13);	 Catch:{ IllegalArgumentException -> 0x00e3 }
        if (r6 == 0) goto L_0x00ba;
    L_0x0085:
        r2 = r20 - r18;
        r12 = r0.bottomMargin;
        r12 = r2 - r12;
        r13 = r9.getMeasuredHeight();
        r12 = r12 - r13;
        r13 = r4 + r10;
        r14 = r0.bottomMargin;
        r2 = r2 - r14;
        r9.layout(r4, r12, r13, r2);
        if (r6 == 0) goto L_0x00ba;
    L_0x009a:
        r12 = r20 - r18;
        r2 = r12 - r11;
        r2 = r2 / 2;
        r13 = r0.topMargin;
        if (r2 >= r13) goto L_0x00a8;
    L_0x00a4:
        r2 = r0.topMargin;
        if (r6 == 0) goto L_0x00b5;
    L_0x00a8:
        r13 = r2 + r11;
        r14 = r0.bottomMargin;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r14 = r12 - r14;
        if (r13 <= r14) goto L_0x00b5;
    L_0x00b0:
        r2 = r0.bottomMargin;
        r2 = r12 - r2;
        r2 = r2 - r11;
    L_0x00b5:
        r10 = r10 + r4;
        r11 = r11 + r2;
        r9.layout(r4, r2, r10, r11);
    L_0x00ba:
        if (r1 == 0) goto L_0x00bf;
    L_0x00bc:
        r15.setDrawerViewOffset(r9, r3);	 Catch:{ IllegalArgumentException -> 0x00e7 }
    L_0x00bf:
        r0 = r0.onScreen;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r1 = 0;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x00eb;
    L_0x00c6:
        r0 = 0;
    L_0x00c7:
        r1 = r9.getVisibility();	 Catch:{ IllegalArgumentException -> 0x00ed }
        if (r1 == r0) goto L_0x00d0;
    L_0x00cd:
        r9.setVisibility(r0);	 Catch:{ IllegalArgumentException -> 0x00ed }
    L_0x00d0:
        r0 = r5 + 1;
        if (r6 == 0) goto L_0x00ef;
    L_0x00d4:
        r0 = 0;
        r15.mInLayout = r0;
        r0 = 0;
        r15.mFirstLayout = r0;
        return;
    L_0x00db:
        r0 = move-exception;
        throw r0;
    L_0x00dd:
        r0 = move-exception;
        throw r0;
    L_0x00df:
        r0 = move-exception;
        throw r0;
    L_0x00e1:
        r1 = 0;
        goto L_0x0072;
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        throw r0;
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r0 = 4;
        goto L_0x00c7;
    L_0x00ed:
        r0 = move-exception;
        throw r0;
    L_0x00ef:
        r5 = r0;
        goto L_0x000d;
    L_0x00f2:
        r3 = r1;
        r4 = r2;
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        r8_this = this;
        r1 = 1;
        r0 = 0;
        r2 = android.support.v4.widget.SlidingPaneLayout.a;
        r3 = r8.mLeftDragger;
        r3.processTouchEvent(r9);
        r3 = r8.mRightDragger;
        r3.processTouchEvent(r9);
        r3 = r9.getAction();
        r3 = r3 & 255;
        switch(r3) {
            case 0: goto L_0x0018;
            case 1: goto L_0x002a;
            case 2: goto L_0x0017;
            case 3: goto L_0x006e;
            default: goto L_0x0017;
        };
    L_0x0017:
        return r1;
    L_0x0018:
        r3 = r9.getX();
        r4 = r9.getY();
        r8.mInitialMotionX = r3;
        r8.mInitialMotionY = r4;
        r8.mDisallowInterceptRequested = r0;
        r8.mChildrenCanceledTouch = r0;
        if (r2 == 0) goto L_0x0017;
    L_0x002a:
        r3 = r9.getX();
        r4 = r9.getY();
        r5 = r8.mLeftDragger;
        r6 = (int) r3;
        r7 = (int) r4;
        r5 = r5.findTopChildUnder(r6, r7);
        if (r5 == 0) goto L_0x007f;
    L_0x003c:
        r5 = r8.isContentView(r5);	 Catch:{ IllegalArgumentException -> 0x007b }
        if (r5 == 0) goto L_0x007f;
    L_0x0042:
        r5 = r8.mInitialMotionX;
        r3 = r3 - r5;
        r5 = r8.mInitialMotionY;
        r4 = r4 - r5;
        r5 = r8.mLeftDragger;
        r5 = r5.getTouchSlop();
        r3 = r3 * r3;
        r4 = r4 * r4;
        r3 = r3 + r4;
        r4 = r5 * r5;
        r4 = (float) r4;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 >= 0) goto L_0x007f;
    L_0x0058:
        r3 = r8.findOpenDrawer();
        if (r3 == 0) goto L_0x007f;
    L_0x005e:
        r3 = r8.getDrawerLockMode(r3);	 Catch:{ IllegalArgumentException -> 0x007d }
        r4 = 2;
        if (r3 != r4) goto L_0x0066;
    L_0x0065:
        r0 = r1;
    L_0x0066:
        r8.closeDrawers(r0);	 Catch:{ IllegalArgumentException -> 0x0079 }
        r0 = 0;
        r8.mDisallowInterceptRequested = r0;	 Catch:{ IllegalArgumentException -> 0x0079 }
        if (r2 == 0) goto L_0x0017;
    L_0x006e:
        r0 = 1;
        r8.closeDrawers(r0);	 Catch:{ IllegalArgumentException -> 0x0079 }
        r0 = 0;
        r8.mDisallowInterceptRequested = r0;	 Catch:{ IllegalArgumentException -> 0x0079 }
        r0 = 0;
        r8.mChildrenCanceledTouch = r0;	 Catch:{ IllegalArgumentException -> 0x0079 }
        goto L_0x0017;
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r0 = r1;
        goto L_0x0066;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    static boolean access$200() {
        return CAN_HIDE_DESCENDANTS;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openDrawer(android.view.View r5) {
        /*
        r4_this = this;
        r1 = android.support.v4.widget.SlidingPaneLayout.a;
        r0 = r4.isDrawerView(r5);	 Catch:{ IllegalArgumentException -> 0x002d }
        if (r0 != 0) goto L_0x002f;
    L_0x0008:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x002d }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x002d }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x002d }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x002d }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x002d }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x002d }
        r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x002d }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x002d }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x002d }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x002d }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x002d }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x002d }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = r4.mFirstLayout;
        if (r0 == 0) goto L_0x0046;
    L_0x0033:
        r0 = r5.getLayoutParams();
        r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.onScreen = r2;	 Catch:{ IllegalArgumentException -> 0x006f }
        r2 = 1;
        r0.knownOpen = r2;	 Catch:{ IllegalArgumentException -> 0x006f }
        r0 = 1;
        r4.updateChildrenImportantForAccessibility(r5, r0);	 Catch:{ IllegalArgumentException -> 0x006f }
        if (r1 == 0) goto L_0x006b;
    L_0x0046:
        r0 = 3;
        r0 = r4.checkDrawerViewAbsoluteGravity(r5, r0);	 Catch:{ IllegalArgumentException -> 0x0071 }
        if (r0 == 0) goto L_0x0059;
    L_0x004d:
        r0 = r4.mLeftDragger;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = 0;
        r3 = r5.getTop();	 Catch:{ IllegalArgumentException -> 0x0073 }
        r0.smoothSlideViewTo(r5, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0073 }
        if (r1 == 0) goto L_0x006b;
    L_0x0059:
        r0 = r4.mRightDragger;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r1 = r4.getWidth();	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r5.getWidth();	 Catch:{ IllegalArgumentException -> 0x0073 }
        r1 = r1 - r2;
        r2 = r5.getTop();	 Catch:{ IllegalArgumentException -> 0x0073 }
        r0.smoothSlideViewTo(r5, r1, r2);	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x006b:
        r4.invalidate();
        return;
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.openDrawer(android.view.View):void");
    }

    void dispatchOnDrawerSlide(View view, float f) {
        try {
            if (this.mListener != null) {
                this.mListener.onDrawerSlide(view, f);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void setChildInsets(Object obj, boolean z) {
        try {
            boolean z2;
            this.mLastInsets = obj;
            this.mDrawStatusBarBackground = z;
            if (!z) {
                if (getBackground() == null) {
                    z2 = true;
                    setWillNotDraw(z2);
                    requestLayout();
                }
            }
            z2 = false;
            setWillNotDraw(z2);
            requestLayout();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static {
        boolean z = true;
        String[] strArr = new String[18];
        String str = "ezp\u0012Y";
        boolean z2 = true;
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
                        i3 = 51;
                        break;
                    case ay.n /*2*/:
                        i3 = 55;
                        break;
                    case ay.p /*3*/:
                        i3 = 90;
                        break;
                    default:
                        i3 = 13;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z2) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0017ZDzcXG\u0017;-D_^>dYT\u0017>\u007fVDR(";
                    i = 2;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "aZR--";
                    i = 3;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "sAV-hE\u007fV#bBG\u00177xDG\u00178h\u0017^R;~BAR>-@ZC2-zVV)xEVd*hT\u001dr\u0002Ltg{\u0003#";
                    z2 = true;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0017QB.-C[^)-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0017R[(hVWNzeV@\u0017;-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "sAV-hE\u007fV#bBG";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0017WX?~\u0017]X.-_RA?-V\u0013A;a^W\u00176lN\\B.RPAV,dCJ\u0017w-ZFD.-UV\u0017\u001d\u007fVE^.t\u0019\u007fr\u001cY\u001b\u0013";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "t[^6i\u0017WE;zRA\u00172lD\u0013V8~X_B.h\u0017TE;{^GNz";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0017RCzdYWR\"-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "SAV-hE\u0013A3h@\u0013V6bYT\u0017.eVG\u0017?iPV";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "t[^6i\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    str = "pAV,dCJ\u0019\bDp{czbE\u0013p(lAZC##y|h\u001d_ve~\u000eT";
                    z2 = true;
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    strArr2 = strArr3;
                    str = "aZR--";
                    z2 = true;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0017ZDzcXG\u0017;-SAV-hE";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0017ZDzcXG\u0017;-D_^>dYT\u0017>\u007fVDR(";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "aZR--";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        LAYOUT_ATTRS = new int[]{16842931};
                        if (VERSION.SDK_INT < 19) {
                            z = false;
                        }
                        CAN_HIDE_DESCENDANTS = z;
                        if (VERSION.SDK_INT >= 21) {
                            try {
                                IMPL = new DrawerLayoutCompatImplApi21();
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        IMPL = new DrawerLayoutCompatImplBase();
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                default:
                    strArr2[i] = str;
                    str = "{vq\u000e";
                    i = 1;
                    strArr2 = strArr3;
                    z2 = false;
                    break;
            }
        }
    }

    public void computeScroll() {
        float max;
        int i = SlidingPaneLayout.a;
        int childCount = getChildCount();
        float f = 0.0f;
        int i2 = 0;
        while (i2 < childCount) {
            max = Math.max(f, ((LayoutParams) getChildAt(i2).getLayoutParams()).onScreen);
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
                f = max;
            }
            break;
        }
        max = f;
        try {
            break;
            this.mScrimOpacity = max;
            if ((this.mLeftDragger.continueSettling(true) | this.mRightDragger.continueSettling(true)) != 0) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    void dispatchOnDrawerClosed(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        try {
            if (layoutParams.knownOpen) {
                layoutParams.knownOpen = false;
                if (this.mListener != null) {
                    this.mListener.onDrawerClosed(view);
                }
                updateChildrenImportantForAccessibility(view, false);
                if (hasWindowFocus()) {
                    View rootView = getRootView();
                    if (rootView != null) {
                        try {
                            rootView.sendAccessibilityEvent(32);
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateChildrenImportantForAccessibility(android.view.View r6, boolean r7) {
        /*
        r5_this = this;
        r1 = android.support.v4.widget.SlidingPaneLayout.a;
        r2 = r5.getChildCount();
        r0 = 0;
    L_0x0007:
        if (r0 >= r2) goto L_0x0027;
    L_0x0009:
        r3 = r5.getChildAt(r0);
        if (r7 != 0) goto L_0x0015;
    L_0x000f:
        r4 = r5.isDrawerView(r3);	 Catch:{ IllegalArgumentException -> 0x0028 }
        if (r4 == 0) goto L_0x0019;
    L_0x0015:
        if (r7 == 0) goto L_0x001f;
    L_0x0017:
        if (r3 != r6) goto L_0x001f;
    L_0x0019:
        r4 = 1;
        android.support.v4.view.ViewCompat.setImportantForAccessibility(r3, r4);	 Catch:{ IllegalArgumentException -> 0x002e }
        if (r1 == 0) goto L_0x0023;
    L_0x001f:
        r4 = 4;
        android.support.v4.view.ViewCompat.setImportantForAccessibility(r3, r4);	 Catch:{ IllegalArgumentException -> 0x002e }
    L_0x0023:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0007;
    L_0x0027:
        return;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.updateChildrenImportantForAccessibility(android.view.View, boolean):void");
    }

    public boolean isDrawerVisible(View view) {
        try {
            if (isDrawerView(view)) {
                try {
                    return ((LayoutParams) view.getLayoutParams()).onScreen > 0.0f;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            throw new IllegalArgumentException(z[14] + view + z[15]);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDrawerLockMode(int r5, int r6) {
        /*
        r4_this = this;
        r3 = 3;
        r1 = android.support.v4.widget.SlidingPaneLayout.a;
        r0 = android.support.v4.view.ViewCompat.getLayoutDirection(r4);
        r2 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r6, r0);
        if (r2 != r3) goto L_0x0011;
    L_0x000d:
        r4.mLockModeLeft = r5;	 Catch:{ IllegalArgumentException -> 0x0023 }
        if (r1 == 0) goto L_0x0016;
    L_0x0011:
        r0 = 5;
        if (r2 != r0) goto L_0x0016;
    L_0x0014:
        r4.mLockModeRight = r5;	 Catch:{ IllegalArgumentException -> 0x0025 }
    L_0x0016:
        if (r5 == 0) goto L_0x001f;
    L_0x0018:
        if (r2 != r3) goto L_0x0029;
    L_0x001a:
        r0 = r4.mLeftDragger;	 Catch:{ IllegalArgumentException -> 0x0027 }
    L_0x001c:
        r0.cancel();
    L_0x001f:
        switch(r5) {
            case 1: goto L_0x0037;
            case 2: goto L_0x002c;
            default: goto L_0x0022;
        };
    L_0x0022:
        return;
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        throw r0;
    L_0x0027:
        r0 = move-exception;
        throw r0;
    L_0x0029:
        r0 = r4.mRightDragger;
        goto L_0x001c;
    L_0x002c:
        r0 = r4.findDrawerWithGravity(r2);
        if (r0 == 0) goto L_0x0022;
    L_0x0032:
        r4.openDrawer(r0);	 Catch:{ IllegalArgumentException -> 0x0043 }
        if (r1 == 0) goto L_0x0022;
    L_0x0037:
        r0 = r4.findDrawerWithGravity(r2);
        if (r0 == 0) goto L_0x0022;
    L_0x003d:
        r4.closeDrawer(r0);	 Catch:{ IllegalArgumentException -> 0x0041 }
        goto L_0x0022;
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.setDrawerLockMode(int, int):void");
    }

    private static boolean hasOpaqueBackground(View view) {
        Drawable background = view.getBackground();
        if (background == null) {
            return false;
        }
        try {
            return background.getOpacity() == -1;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static int[] access$100() {
        return LAYOUT_ATTRS;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            try {
                if (hasVisibleDrawer()) {
                    KeyEventCompat.startTracking(keyEvent);
                    return true;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    private boolean hasPeekingDrawer() {
        int i = SlidingPaneLayout.a;
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            try {
                if (((LayoutParams) getChildAt(i2).getLayoutParams()).isPeeking) {
                    return true;
                }
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return false;
    }

    private View findVisibleDrawer() {
        int i = SlidingPaneLayout.a;
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            try {
                View childAt = getChildAt(i2);
                if (isDrawerView(childAt)) {
                    if (isDrawerVisible(childAt)) {
                        try {
                            return childAt;
                        }
                    }
                }
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return null;
    }

    boolean isDrawerView(View view) {
        return (GravityCompat.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(view)) & 7) != 0;
    }

    void setDrawerViewOffset(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        try {
            if (f != layoutParams.onScreen) {
                layoutParams.onScreen = f;
                dispatchOnDrawerSlide(view, f);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static boolean access$400(View view) {
        return includeChildForAccessibility(view);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static boolean includeChildForAccessibility(View view) {
        try {
            if (ViewCompat.getImportantForAccessibility(view) != 4) {
                if (ViewCompat.getImportantForAccessibility(view) != 2) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
