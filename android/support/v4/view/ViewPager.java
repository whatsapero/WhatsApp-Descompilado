package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.ViewPager.LayoutParams;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.whatsapp.vk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ViewPager extends ViewGroup {
    private static final Comparator COMPARATOR;
    private static final int[] LAYOUT_ATTRS;
    public static boolean a;
    private static final Interpolator sInterpolator;
    private static final ViewPositionComparator sPositionComparator;
    private static final String[] z;
    private int mActivePointerId;
    private PagerAdapter mAdapter;
    private OnAdapterChangeListener mAdapterChangeListener;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    private int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private final ArrayList mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffectCompat mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private OnPageChangeListener mOnPageChangeListener;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffectCompat mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private Method mSetChildrenDrawingOrderEnabled;
    private final ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    interface Decor {
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    interface OnAdapterChangeListener {
        void onAdapterChanged(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    class ItemInfo {
        Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;

        ItemInfo() {
        }
    }

    public class LayoutParams extends android.view.ViewGroup.LayoutParams {
        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;

        public LayoutParams() {
            super(-1, -1);
            this.widthFactor = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.widthFactor = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.access$400());
            this.gravity = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        final ViewPager this$0;

        private boolean canScroll() {
            return ViewPager.access$200(this.this$0) != null && ViewPager.access$200(this.this$0).getCount() > 1;
        }

        MyAccessibilityDelegate(ViewPager viewPager) {
            this.this$0 = viewPager;
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            switch (i) {
                case 4096:
                    if (!this.this$0.canScrollHorizontally(1)) {
                        return false;
                    }
                    this.this$0.setCurrentItem(ViewPager.access$300(this.this$0) + 1);
                    return true;
                case 8192:
                    if (!this.this$0.canScrollHorizontally(-1)) {
                        return false;
                    }
                    this.this$0.setCurrentItem(ViewPager.access$300(this.this$0) - 1);
                    return true;
                default:
                    return false;
            }
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AccessibilityRecordCompat obtain = AccessibilityRecordCompat.obtain();
            obtain.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.access$200(this.this$0) != null) {
                obtain.setItemCount(ViewPager.access$200(this.this$0).getCount());
                obtain.setFromIndex(ViewPager.access$300(this.this$0));
                obtain.setToIndex(ViewPager.access$300(this.this$0));
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(canScroll());
            if (this.this$0.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (this.this$0.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }
    }

    public interface PageTransformer {
        void transformPage(View view, float f);
    }

    class PagerObserver extends DataSetObserver {
        final ViewPager this$0;

        private PagerObserver(ViewPager viewPager) {
            this.this$0 = viewPager;
        }

        public void onChanged() {
            this.this$0.dataSetChanged();
        }

        PagerObserver(ViewPager viewPager, AnonymousClass_1 anonymousClass_1) {
            this(viewPager);
        }

        public void onInvalidated() {
            this.this$0.dataSetChanged();
        }
    }

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        private static final String[] z;
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        public String toString() {
            return z[1] + Integer.toHexString(System.identityHashCode(this)) + z[0] + this.position + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        static {
            /* JADX: method processing error */
/*
            Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
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
            r2 = "96Bl\u0002m/BqV";
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
            if (r7 > r8) goto L_0x003a;
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
            r0 = "_4Lx\u0006|(YO\n~#_18x0H{8m'Yz\u0010";
            r3 = r2;
            r4 = r5;
            r2 = r0;
            r0 = r1;
            goto L_0x000a;
        L_0x002a:
            r4[r3] = r2;
            z = r5;
            r0 = new android.support.v4.view.ViewPager$SavedState$1;
            r0.<init>();
            r0 = android.support.v4.os.ParcelableCompat.newCreator(r0);
            CREATOR = r0;
            return;
        L_0x003a:
            r9 = r6[r8];
            r2 = r8 % 5;
            switch(r2) {
                case 0: goto L_0x004b;
                case 1: goto L_0x004e;
                case 2: goto L_0x0051;
                case 3: goto L_0x0054;
                default: goto L_0x0041;
            };
        L_0x0041:
            r2 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        L_0x0043:
            r2 = r2 ^ r9;
            r2 = (char) r2;
            r6[r8] = r2;
            r2 = r8 + 1;
            r8 = r2;
            goto L_0x0012;
        L_0x004b:
            r2 = 25;
            goto L_0x0043;
        L_0x004e:
            r2 = 70;
            goto L_0x0043;
        L_0x0051:
            r2 = 45;
            goto L_0x0043;
        L_0x0054:
            r2 = 31;
            goto L_0x0043;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.SavedState.<clinit>():void");
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i);
        }
    }

    public class SimpleOnPageChangeListener implements OnPageChangeListener {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageSelected(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    class ViewPositionComparator implements Comparator {
        public int compare(Object obj, Object obj2) {
            return compare((View) obj, (View) obj2);
        }

        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.isDecor != layoutParams2.isDecor) {
                return layoutParams.isDecor ? 1 : -1;
            } else {
                return layoutParams.position - layoutParams2.position;
            }
        }

        ViewPositionComparator() {
        }
    }

    void setChildrenDrawingOrderEnabledCompat(boolean r1) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: android.support.v4.view.ViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void
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
	at jadx.core.dex.trycatch.TryCatchBlock.removeWholeBlock(TryCatchBlock.java:76)
	at jadx.core.dex.trycatch.TryCatchBlock.removeHandler(TryCatchBlock.java:60)
	at jadx.core.dex.nodes.MethodNode.initTryCatches(MethodNode.java:286)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 8 more
*/
        /*
        r0_this = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 7;
        if (r0 < r1) goto L_0x002e;
        r0 = r5.mSetChildrenDrawingOrderEnabled;
        if (r0 != 0) goto L_0x001f;
        r0 = android.view.ViewGroup.class;
        r1 = z;
        r2 = 15;
        r1 = r1[r2];
        r2 = 1;
        r2 = new java.lang.Class[r2];
        r3 = 0;
        r4 = java.lang.Boolean.TYPE;
        r2[r3] = r4;
        r0 = r0.getDeclaredMethod(r1, r2);
        r5.mSetChildrenDrawingOrderEnabled = r0;
        r0 = r5.mSetChildrenDrawingOrderEnabled;
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r3 = java.lang.Boolean.valueOf(r6);
        r1[r2] = r3;
        r0.invoke(r5, r1);
        return;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        r1 = z;
        r2 = 17;
        r1 = r1[r2];
        r2 = z;
        r3 = 18;
        r2 = r2[r3];
        android.util.Log.e(r1, r2, r0);
        goto L_0x001f;
        r0 = move-exception;
        r1 = z;
        r2 = 14;
        r1 = r1[r2];
        r2 = z;
        r3 = 16;
        r2 = r2[r3];
        android.util.Log.e(r1, r2, r0);
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void smoothScrollTo(int r10, int r11, int r12) {
        /*
        r9_this = this;
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r9.getChildCount();	 Catch:{ NotFoundException -> 0x000d }
        if (r0 != 0) goto L_0x000f;
    L_0x0008:
        r0 = 0;
        r9.setScrollingCacheEnabled(r0);	 Catch:{ NotFoundException -> 0x000d }
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r1 = r9.getScrollX();
        r2 = r9.getScrollY();
        r3 = r10 - r1;
        r4 = r11 - r2;
        if (r3 != 0) goto L_0x002d;
    L_0x001d:
        if (r4 != 0) goto L_0x002d;
    L_0x001f:
        r0 = 0;
        r9.completeScroll(r0);	 Catch:{ NotFoundException -> 0x002b }
        r9.populate();	 Catch:{ NotFoundException -> 0x002b }
        r0 = 0;
        r9.setScrollState(r0);	 Catch:{ NotFoundException -> 0x002b }
        goto L_0x000c;
    L_0x002b:
        r0 = move-exception;
        throw r0;
    L_0x002d:
        r0 = 1;
        r9.setScrollingCacheEnabled(r0);
        r0 = 2;
        r9.setScrollState(r0);
        r5 = r9.getClientWidth();
        r0 = r5 / 2;
        r6 = java.lang.Math.abs(r3);
        r6 = (float) r6;
        r6 = r6 * r8;
        r7 = (float) r5;
        r6 = r6 / r7;
        r6 = java.lang.Math.min(r8, r6);
        r7 = (float) r0;
        r0 = (float) r0;
        r6 = r9.distanceInfluenceForSnapDuration(r6);
        r0 = r0 * r6;
        r0 = r0 + r7;
        r6 = java.lang.Math.abs(r12);
        if (r6 <= 0) goto L_0x0068;
    L_0x0055:
        r7 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r6 = (float) r6;
        r0 = r0 / r6;
        r0 = java.lang.Math.abs(r0);
        r0 = r0 * r7;
        r0 = java.lang.Math.round(r0);
        r0 = r0 * 4;
        r6 = a;
        if (r6 == 0) goto L_0x0082;
    L_0x0068:
        r0 = (float) r5;
        r5 = r9.mAdapter;
        r6 = r9.mCurItem;
        r5 = r5.getPageWidth(r6);
        r0 = r0 * r5;
        r5 = java.lang.Math.abs(r3);
        r5 = (float) r5;
        r6 = r9.mPageMargin;
        r6 = (float) r6;
        r0 = r0 + r6;
        r0 = r5 / r0;
        r0 = r0 + r8;
        r5 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r0 = r0 * r5;
        r0 = (int) r0;
    L_0x0082:
        r5 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        r5 = java.lang.Math.min(r0, r5);
        r0 = r9.mScroller;
        r0.startScroll(r1, r2, r3, r4, r5);
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r9);
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.smoothScrollTo(int, int, int):void");
    }

    static void access$000(ViewPager viewPager, int i) {
        viewPager.setScrollState(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onPageScrolled(int r13, float r14, int r15) {
        /*
        r12_this = this;
        r3 = 0;
        r5 = a;
        r0 = r12.mDecorChildCount;
        if (r0 <= 0) goto L_0x0032;
    L_0x0007:
        r6 = r12.getScrollX();
        r1 = r12.getPaddingLeft();
        r2 = r12.getPaddingRight();
        r7 = r12.getWidth();
        r8 = r12.getChildCount();
        r4 = r3;
    L_0x001c:
        if (r4 >= r8) goto L_0x0032;
    L_0x001e:
        r9 = r12.getChildAt(r4);
        r0 = r9.getLayoutParams();
        r0 = (android.support.v4.view.ViewPager.LayoutParams) r0;
        r10 = r0.isDecor;	 Catch:{ NotFoundException -> 0x0069 }
        if (r10 != 0) goto L_0x006b;
    L_0x002c:
        r0 = r2;
        r2 = r1;
    L_0x002e:
        r1 = r4 + 1;
        if (r5 == 0) goto L_0x00c0;
    L_0x0032:
        r0 = r12.mOnPageChangeListener;	 Catch:{ NotFoundException -> 0x00a6 }
        if (r0 == 0) goto L_0x003b;
    L_0x0036:
        r0 = r12.mOnPageChangeListener;	 Catch:{ NotFoundException -> 0x00a6 }
        r0.onPageScrolled(r13, r14, r15);	 Catch:{ NotFoundException -> 0x00a6 }
    L_0x003b:
        r0 = r12.mInternalPageChangeListener;	 Catch:{ NotFoundException -> 0x00a8 }
        if (r0 == 0) goto L_0x0044;
    L_0x003f:
        r0 = r12.mInternalPageChangeListener;	 Catch:{ NotFoundException -> 0x00a8 }
        r0.onPageScrolled(r13, r14, r15);	 Catch:{ NotFoundException -> 0x00a8 }
    L_0x0044:
        r0 = r12.mPageTransformer;
        if (r0 == 0) goto L_0x0065;
    L_0x0048:
        r2 = r12.getScrollX();
        r4 = r12.getChildCount();
        r1 = r3;
    L_0x0051:
        if (r1 >= r4) goto L_0x0065;
    L_0x0053:
        r3 = r12.getChildAt(r1);
        r0 = r3.getLayoutParams();
        r0 = (android.support.v4.view.ViewPager.LayoutParams) r0;
        r0 = r0.isDecor;	 Catch:{ NotFoundException -> 0x00aa }
        if (r0 == 0) goto L_0x00ac;
    L_0x0061:
        r0 = r1 + 1;
        if (r5 == 0) goto L_0x00be;
    L_0x0065:
        r0 = 1;
        r12.mCalledSuper = r0;
        return;
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r0 = r0.gravity;
        r0 = r0 & 7;
        switch(r0) {
            case 1: goto L_0x00cc;
            case 2: goto L_0x0072;
            case 3: goto L_0x0074;
            case 4: goto L_0x0072;
            case 5: goto L_0x00ce;
            default: goto L_0x0072;
        };
    L_0x0072:
        if (r5 == 0) goto L_0x00c9;
    L_0x0074:
        r0 = r9.getWidth();
        r0 = r0 + r1;
        if (r5 == 0) goto L_0x00c5;
    L_0x007b:
        r1 = r9.getMeasuredWidth();
        r1 = r7 - r1;
        r1 = r1 / 2;
        r1 = java.lang.Math.max(r1, r0);
        if (r5 == 0) goto L_0x00c5;
    L_0x0089:
        r1 = r7 - r2;
        r10 = r9.getMeasuredWidth();
        r1 = r1 - r10;
        r10 = r9.getMeasuredWidth();
        r2 = r2 + r10;
        r11 = r2;
        r2 = r0;
        r0 = r11;
    L_0x0098:
        r1 = r1 + r6;
        r10 = r9.getLeft();
        r1 = r1 - r10;
        if (r1 == 0) goto L_0x002e;
    L_0x00a0:
        r9.offsetLeftAndRight(r1);	 Catch:{ NotFoundException -> 0x00a4 }
        goto L_0x002e;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r0 = move-exception;
        throw r0;
    L_0x00aa:
        r0 = move-exception;
        throw r0;
    L_0x00ac:
        r0 = r3.getLeft();
        r0 = r0 - r2;
        r0 = (float) r0;
        r6 = r12.getClientWidth();
        r6 = (float) r6;
        r0 = r0 / r6;
        r6 = r12.mPageTransformer;
        r6.transformPage(r3, r0);
        goto L_0x0061;
    L_0x00be:
        r1 = r0;
        goto L_0x0051;
    L_0x00c0:
        r4 = r1;
        r1 = r2;
        r2 = r0;
        goto L_0x001c;
    L_0x00c5:
        r11 = r2;
        r2 = r0;
        r0 = r11;
        goto L_0x0098;
    L_0x00c9:
        r0 = r2;
        r2 = r1;
        goto L_0x0098;
    L_0x00cc:
        r0 = r1;
        goto L_0x007b;
    L_0x00ce:
        r0 = r1;
        goto L_0x0089;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onPageScrolled(int, float, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
        r7_this = this;
        r2 = 1;
        super.draw(r8);
        r0 = 0;
        r1 = android.support.v4.view.ViewCompat.getOverScrollMode(r7);
        if (r1 == 0) goto L_0x0019;
    L_0x000b:
        if (r1 != r2) goto L_0x00a0;
    L_0x000d:
        r1 = r7.mAdapter;	 Catch:{ NotFoundException -> 0x00b0 }
        if (r1 == 0) goto L_0x00a0;
    L_0x0011:
        r1 = r7.mAdapter;	 Catch:{ NotFoundException -> 0x00b2 }
        r1 = r1.getCount();	 Catch:{ NotFoundException -> 0x00b2 }
        if (r1 <= r2) goto L_0x00a0;
    L_0x0019:
        r1 = r7.mLeftEdge;	 Catch:{ NotFoundException -> 0x00b2 }
        r1 = r1.isFinished();	 Catch:{ NotFoundException -> 0x00b2 }
        if (r1 != 0) goto L_0x0059;
    L_0x0021:
        r1 = r8.save();
        r2 = r7.getHeight();
        r3 = r7.getPaddingTop();
        r2 = r2 - r3;
        r3 = r7.getPaddingBottom();
        r2 = r2 - r3;
        r3 = r7.getWidth();
        r4 = 1132920832; // 0x43870000 float:270.0 double:5.597372625E-315;
        r8.rotate(r4);
        r4 = -r2;
        r5 = r7.getPaddingTop();
        r4 = r4 + r5;
        r4 = (float) r4;
        r5 = r7.mFirstOffset;
        r6 = (float) r3;
        r5 = r5 * r6;
        r8.translate(r4, r5);
        r4 = r7.mLeftEdge;
        r4.setSize(r2, r3);
        r2 = r7.mLeftEdge;
        r2 = r2.draw(r8);
        r0 = r0 | r2;
        r8.restoreToCount(r1);
    L_0x0059:
        r1 = r7.mRightEdge;
        r1 = r1.isFinished();
        if (r1 != 0) goto L_0x00aa;
    L_0x0061:
        r1 = r8.save();
        r2 = r7.getWidth();
        r3 = r7.getHeight();
        r4 = r7.getPaddingTop();
        r3 = r3 - r4;
        r4 = r7.getPaddingBottom();
        r3 = r3 - r4;
        r4 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r8.rotate(r4);
        r4 = r7.getPaddingTop();
        r4 = -r4;
        r4 = (float) r4;
        r5 = r7.mLastOffset;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = r5 + r6;
        r5 = -r5;
        r6 = (float) r2;
        r5 = r5 * r6;
        r8.translate(r4, r5);
        r4 = r7.mRightEdge;
        r4.setSize(r3, r2);
        r2 = r7.mRightEdge;
        r2 = r2.draw(r8);
        r0 = r0 | r2;
        r8.restoreToCount(r1);	 Catch:{ NotFoundException -> 0x00b4 }
        r1 = a;	 Catch:{ NotFoundException -> 0x00b4 }
        if (r1 == 0) goto L_0x00aa;
    L_0x00a0:
        r1 = r7.mLeftEdge;	 Catch:{ NotFoundException -> 0x00b4 }
        r1.finish();	 Catch:{ NotFoundException -> 0x00b4 }
        r1 = r7.mRightEdge;	 Catch:{ NotFoundException -> 0x00b4 }
        r1.finish();	 Catch:{ NotFoundException -> 0x00b4 }
    L_0x00aa:
        if (r0 == 0) goto L_0x00af;
    L_0x00ac:
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r7);	 Catch:{ NotFoundException -> 0x00b6 }
    L_0x00af:
        return;
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00b2 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;
    L_0x00b4:
        r0 = move-exception;
        throw r0;
    L_0x00b6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.draw(android.graphics.Canvas):void");
    }

    private boolean pageScrolled(int i) {
        try {
            if (this.mItems.size() == 0) {
                this.mCalledSuper = false;
                onPageScrolled(0, 0.0f, 0);
                if (this.mCalledSuper) {
                    return false;
                }
                throw new IllegalStateException(z[1]);
            }
            ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            int clientWidth = getClientWidth();
            int i2 = this.mPageMargin + clientWidth;
            float f = ((float) this.mPageMargin) / ((float) clientWidth);
            int i3 = infoForCurrentScrollPosition.position;
            float f2 = ((((float) i) / ((float) clientWidth)) - infoForCurrentScrollPosition.offset) / (infoForCurrentScrollPosition.widthFactor + f);
            clientWidth = (int) (((float) i2) * f2);
            try {
                this.mCalledSuper = false;
                onPageScrolled(i3, f2, clientWidth);
                if (this.mCalledSuper) {
                    return true;
                }
                throw new IllegalStateException(z[0]);
            } catch (NotFoundException e) {
                throw e;
            }
        } catch (NotFoundException e2) {
            throw e2;
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        try {
            if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mActivePointerId) {
                if (actionIndex == 0) {
                    actionIndex = 1;
                } else {
                    actionIndex = 0;
                }
                try {
                    this.mLastMotionX = MotionEventCompat.getX(motionEvent, actionIndex);
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    if (this.mVelocityTracker != null) {
                        this.mVelocityTracker.clear();
                    }
                } catch (NotFoundException e) {
                    throw e;
                }
            }
        } catch (NotFoundException e2) {
            throw e2;
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    ItemInfo infoForPosition(int i) {
        boolean z = a;
        int i2 = 0;
        while (i2 < this.mItems.size()) {
            ItemInfo itemInfo = (ItemInfo) this.mItems.get(i2);
            try {
                if (itemInfo.position == i) {
                    return itemInfo;
                }
                int i3 = i2 + 1;
                if (z) {
                    break;
                }
                i2 = i3;
            } catch (NotFoundException e) {
                throw e;
            }
        }
        return null;
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3 = -1;
        boolean z = a;
        int childCount = getChildCount();
        if ((i & 2) == 0 || z) {
            i2 = childCount - 1;
            childCount = -1;
        } else {
            i3 = 1;
            i2 = 0;
        }
        while (i2 != childCount) {
            try {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    ItemInfo infoForChild = infoForChild(childAt);
                    if (infoForChild != null) {
                        if (infoForChild.position == this.mCurItem) {
                            if (childAt.requestFocus(i, rect)) {
                                try {
                                    return true;
                                }
                            }
                        }
                    }
                }
                i2 += i3;
                if (z) {
                    break;
                }
            } catch (NotFoundException e) {
                throw e;
            } catch (NotFoundException e2) {
                throw e2;
            }
        }
        return false;
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        try {
            try {
                int i4;
                float f2;
                if (Math.abs(i3) > this.mFlingDistance) {
                    if (Math.abs(i2) > this.mMinimumVelocity) {
                        int i5 = i2 > 0 ? i : i + 1;
                        if (!a) {
                            i4 = i5;
                            if (this.mItems.size() > 0) {
                                return i4;
                            }
                            return Math.max(((ItemInfo) this.mItems.get(0)).position, Math.min(i4, ((ItemInfo) this.mItems.get(this.mItems.size() - 1)).position));
                        }
                    }
                }
                if (i >= this.mCurItem) {
                    f2 = 0.4f;
                } else {
                    f2 = 0.6f;
                }
                i4 = (int) (f2 + (((float) i) + f));
                if (this.mItems.size() > 0) {
                    return i4;
                }
                return Math.max(((ItemInfo) this.mItems.get(0)).position, Math.min(i4, ((ItemInfo) this.mItems.get(this.mItems.size() - 1)).position));
            } catch (NotFoundException e) {
                throw e;
            } catch (NotFoundException e2) {
                throw e2;
            }
        } catch (NotFoundException e22) {
            throw e22;
        } catch (NotFoundException e222) {
            try {
                throw e222;
            } catch (NotFoundException e2222) {
                throw e2222;
            }
        }
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        boolean z = a;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            int i3 = 0;
            while (i3 < getChildCount()) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    ItemInfo infoForChild = infoForChild(childAt);
                    if (infoForChild != null) {
                        try {
                            if (infoForChild.position == this.mCurItem) {
                                childAt.addFocusables(arrayList, i, i2);
                            }
                        } catch (NotFoundException e) {
                            throw e;
                        }
                    }
                }
                i3++;
                if (z) {
                    break;
                }
            }
        }
        try {
            if (descendantFocusability == 262144) {
                if (size != arrayList.size()) {
                    return;
                }
            }
            if (isFocusable()) {
                if ((i2 & 1) == 1) {
                    try {
                        if (isInTouchMode()) {
                            if (!isFocusableInTouchMode()) {
                                return;
                            }
                        }
                    } catch (NotFoundException e2) {
                        throw e2;
                    } catch (NotFoundException e22) {
                        throw e22;
                    }
                }
                if (arrayList != null) {
                    try {
                        arrayList.add(this);
                    } catch (NotFoundException e222) {
                        throw e222;
                    }
                }
            }
        } catch (NotFoundException e2222) {
            throw e2222;
        } catch (NotFoundException e22222) {
            throw e22222;
        }
    }

    protected int getChildDrawingOrder(int i, int i2) {
        try {
            if (this.mDrawingOrder == 2) {
                i2 = (i - 1) - i2;
            }
            return ((LayoutParams) ((View) this.mDrawingOrderedChildren.get(i2)).getLayoutParams()).childIndex;
        } catch (NotFoundException e) {
            throw e;
        }
    }

    private void setScrollState(int i) {
        try {
            if (this.mScrollState != i) {
                try {
                    this.mScrollState = i;
                    if (this.mPageTransformer != null) {
                        boolean z;
                        if (i != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        enableLayers(z);
                    }
                    try {
                        if (this.mOnPageChangeListener != null) {
                            this.mOnPageChangeListener.onPageScrollStateChanged(i);
                        }
                    } catch (NotFoundException e) {
                        throw e;
                    }
                } catch (NotFoundException e2) {
                    throw e2;
                } catch (NotFoundException e22) {
                    throw e22;
                }
            }
        } catch (NotFoundException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onDraw(android.graphics.Canvas r19) {
        /*
        r18_this = this;
        r6 = a;
        super.onDraw(r19);	 Catch:{ NotFoundException -> 0x00d5 }
        r0 = r18;
        r1 = r0.mPageMargin;	 Catch:{ NotFoundException -> 0x00d5 }
        if (r1 <= 0) goto L_0x00d4;
    L_0x000b:
        r0 = r18;
        r1 = r0.mMarginDrawable;	 Catch:{ NotFoundException -> 0x00d7 }
        if (r1 == 0) goto L_0x00d4;
    L_0x0011:
        r0 = r18;
        r1 = r0.mItems;	 Catch:{ NotFoundException -> 0x00d9 }
        r1 = r1.size();	 Catch:{ NotFoundException -> 0x00d9 }
        if (r1 <= 0) goto L_0x00d4;
    L_0x001b:
        r0 = r18;
        r1 = r0.mAdapter;	 Catch:{ NotFoundException -> 0x00d9 }
        if (r1 == 0) goto L_0x00d4;
    L_0x0021:
        r7 = r18.getScrollX();
        r8 = r18.getWidth();
        r0 = r18;
        r1 = r0.mPageMargin;
        r1 = (float) r1;
        r2 = (float) r8;
        r9 = r1 / r2;
        r5 = 0;
        r0 = r18;
        r1 = r0.mItems;
        r2 = 0;
        r1 = r1.get(r2);
        r1 = (android.support.v4.view.ViewPager.ItemInfo) r1;
        r4 = r1.offset;
        r0 = r18;
        r2 = r0.mItems;
        r10 = r2.size();
        r3 = r1.position;
        r0 = r18;
        r2 = r0.mItems;
        r11 = r10 + -1;
        r2 = r2.get(r11);
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;
        r11 = r2.position;
        r2 = r5;
        r5 = r3;
        r3 = r4;
    L_0x005a:
        if (r5 >= r11) goto L_0x00d4;
    L_0x005c:
        r4 = r1.position;
        if (r5 <= r4) goto L_0x0070;
    L_0x0060:
        if (r2 >= r10) goto L_0x0070;
    L_0x0062:
        r0 = r18;
        r1 = r0.mItems;
        r2 = r2 + 1;
        r1 = r1.get(r2);
        r1 = (android.support.v4.view.ViewPager.ItemInfo) r1;
        if (r6 == 0) goto L_0x005c;
    L_0x0070:
        r4 = r1.position;
        if (r5 != r4) goto L_0x0083;
    L_0x0074:
        r3 = r1.offset;
        r4 = r1.widthFactor;
        r3 = r3 + r4;
        r4 = (float) r8;
        r4 = r4 * r3;
        r3 = r1.offset;
        r12 = r1.widthFactor;
        r3 = r3 + r12;
        r3 = r3 + r9;
        if (r6 == 0) goto L_0x00e1;
    L_0x0083:
        r0 = r18;
        r4 = r0.mAdapter;
        r12 = r4.getPageWidth(r5);
        r4 = r3 + r12;
        r13 = (float) r8;
        r4 = r4 * r13;
        r12 = r12 + r9;
        r3 = r3 + r12;
        r17 = r4;
        r4 = r3;
        r3 = r17;
    L_0x0096:
        r0 = r18;
        r12 = r0.mPageMargin;	 Catch:{ NotFoundException -> 0x00db }
        r12 = (float) r12;	 Catch:{ NotFoundException -> 0x00db }
        r12 = r12 + r3;
        r13 = (float) r7;	 Catch:{ NotFoundException -> 0x00db }
        r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1));
        if (r12 <= 0) goto L_0x00c7;
    L_0x00a1:
        r0 = r18;
        r12 = r0.mMarginDrawable;	 Catch:{ NotFoundException -> 0x00db }
        r13 = (int) r3;	 Catch:{ NotFoundException -> 0x00db }
        r0 = r18;
        r14 = r0.mTopPageBounds;	 Catch:{ NotFoundException -> 0x00db }
        r0 = r18;
        r15 = r0.mPageMargin;	 Catch:{ NotFoundException -> 0x00db }
        r15 = (float) r15;	 Catch:{ NotFoundException -> 0x00db }
        r15 = r15 + r3;
        r16 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r15 = r15 + r16;
        r15 = (int) r15;	 Catch:{ NotFoundException -> 0x00db }
        r0 = r18;
        r0 = r0.mBottomPageBounds;	 Catch:{ NotFoundException -> 0x00db }
        r16 = r0;
        r12.setBounds(r13, r14, r15, r16);	 Catch:{ NotFoundException -> 0x00db }
        r0 = r18;
        r12 = r0.mMarginDrawable;	 Catch:{ NotFoundException -> 0x00db }
        r0 = r19;
        r12.draw(r0);	 Catch:{ NotFoundException -> 0x00db }
    L_0x00c7:
        r12 = r7 + r8;
        r12 = (float) r12;
        r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1));
        if (r3 <= 0) goto L_0x00d0;
    L_0x00ce:
        if (r6 == 0) goto L_0x00d4;
    L_0x00d0:
        r3 = r5 + 1;
        if (r6 == 0) goto L_0x00dd;
    L_0x00d4:
        return;
    L_0x00d5:
        r1 = move-exception;
        throw r1;	 Catch:{ NotFoundException -> 0x00d7 }
    L_0x00d7:
        r1 = move-exception;
        throw r1;	 Catch:{ NotFoundException -> 0x00d9 }
    L_0x00d9:
        r1 = move-exception;
        throw r1;
    L_0x00db:
        r1 = move-exception;
        throw r1;
    L_0x00dd:
        r5 = r3;
        r3 = r4;
        goto L_0x005a;
    L_0x00e1:
        r17 = r4;
        r4 = r3;
        r3 = r17;
        goto L_0x0096;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        float paddingLeft;
        if (i2 > 0) {
            try {
                if (!this.mItems.isEmpty()) {
                    paddingLeft = (float) (((i - getPaddingLeft()) - getPaddingRight()) + i3);
                    int scrollX = (int) (paddingLeft * (((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))));
                    scrollTo(scrollX, getScrollY());
                    if (!this.mScroller.isFinished()) {
                        this.mScroller.startScroll(scrollX, 0, (int) (infoForPosition(this.mCurItem).offset * ((float) i)), 0, this.mScroller.getDuration() - this.mScroller.timePassed());
                    }
                    if (!a) {
                        return;
                    }
                }
            } catch (NotFoundException e) {
                throw e;
            }
        }
        ItemInfo infoForPosition = infoForPosition(this.mCurItem);
        if (infoForPosition != null) {
            try {
                paddingLeft = Math.min(infoForPosition.offset, this.mLastOffset);
            } catch (NotFoundException e2) {
                throw e2;
            }
        }
        paddingLeft = 0.0f;
        int paddingLeft2 = (int) (paddingLeft * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
        try {
            if (paddingLeft2 != getScrollX()) {
                completeScroll(false);
                scrollTo(paddingLeft2, getScrollY());
            }
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = true;
        try {
            if (this.mAdapter == null) {
                return false;
            }
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            if (i < 0) {
                try {
                    if (scrollX <= ((int) (((float) clientWidth) * this.mFirstOffset))) {
                        z = false;
                    }
                    return z;
                } catch (NotFoundException e) {
                    throw e;
                }
            } else if (i <= 0) {
                return false;
            } else {
                try {
                    if (scrollX >= ((int) (((float) clientWidth) * this.mLastOffset))) {
                        z = false;
                    }
                    return z;
                } catch (NotFoundException e2) {
                    throw e2;
                }
            }
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAdapter(android.support.v4.view.PagerAdapter r7) {
        /*
        r6_this = this;
        r2 = 0;
        r3 = a;
        r0 = r6.mAdapter;
        if (r0 == 0) goto L_0x0043;
    L_0x0007:
        r0 = r6.mAdapter;
        r1 = r6.mObserver;
        r0.unregisterDataSetObserver(r1);
        r0 = r6.mAdapter;
        r0.startUpdate(r6);
        r1 = r2;
    L_0x0014:
        r0 = r6.mItems;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x0031;
    L_0x001c:
        r0 = r6.mItems;
        r0 = r0.get(r1);
        r0 = (android.support.v4.view.ViewPager.ItemInfo) r0;
        r4 = r6.mAdapter;
        r5 = r0.position;
        r0 = r0.object;
        r4.destroyItem(r6, r5, r0);
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x00b5;
    L_0x0031:
        r0 = r6.mAdapter;
        r0.finishUpdate(r6);
        r0 = r6.mItems;
        r0.clear();
        r6.removeNonDecorViews();
        r6.mCurItem = r2;
        r6.scrollTo(r2, r2);
    L_0x0043:
        r0 = r6.mAdapter;
        r6.mAdapter = r7;	 Catch:{ NotFoundException -> 0x00a5 }
        r1 = 0;
        r6.mExpectedAdapterCount = r1;	 Catch:{ NotFoundException -> 0x00a5 }
        r1 = r6.mAdapter;	 Catch:{ NotFoundException -> 0x00a5 }
        if (r1 == 0) goto L_0x0099;
    L_0x004e:
        r1 = r6.mObserver;	 Catch:{ NotFoundException -> 0x00a7 }
        if (r1 != 0) goto L_0x005a;
    L_0x0052:
        r1 = new android.support.v4.view.ViewPager$PagerObserver;	 Catch:{ NotFoundException -> 0x00a7 }
        r4 = 0;
        r1.<init>(r6, r4);	 Catch:{ NotFoundException -> 0x00a7 }
        r6.mObserver = r1;	 Catch:{ NotFoundException -> 0x00a7 }
    L_0x005a:
        r1 = r6.mAdapter;
        r4 = r6.mObserver;
        r1.registerDataSetObserver(r4);
        r6.mPopulatePending = r2;
        r1 = r6.mFirstLayout;
        r2 = 1;
        r6.mFirstLayout = r2;	 Catch:{ NotFoundException -> 0x00a9 }
        r2 = r6.mAdapter;	 Catch:{ NotFoundException -> 0x00a9 }
        r2 = r2.getCount();	 Catch:{ NotFoundException -> 0x00a9 }
        r6.mExpectedAdapterCount = r2;	 Catch:{ NotFoundException -> 0x00a9 }
        r2 = r6.mRestoredCurItem;	 Catch:{ NotFoundException -> 0x00a9 }
        if (r2 < 0) goto L_0x008f;
    L_0x0074:
        r2 = r6.mAdapter;	 Catch:{ NotFoundException -> 0x00ab }
        r4 = r6.mRestoredAdapterState;	 Catch:{ NotFoundException -> 0x00ab }
        r5 = r6.mRestoredClassLoader;	 Catch:{ NotFoundException -> 0x00ab }
        r2.restoreState(r4, r5);	 Catch:{ NotFoundException -> 0x00ab }
        r2 = r6.mRestoredCurItem;	 Catch:{ NotFoundException -> 0x00ab }
        r4 = 0;
        r5 = 1;
        r6.setCurrentItemInternal(r2, r4, r5);	 Catch:{ NotFoundException -> 0x00ab }
        r2 = -1;
        r6.mRestoredCurItem = r2;	 Catch:{ NotFoundException -> 0x00ab }
        r2 = 0;
        r6.mRestoredAdapterState = r2;	 Catch:{ NotFoundException -> 0x00ab }
        r2 = 0;
        r6.mRestoredClassLoader = r2;	 Catch:{ NotFoundException -> 0x00ab }
        if (r3 == 0) goto L_0x0099;
    L_0x008f:
        if (r1 != 0) goto L_0x0096;
    L_0x0091:
        r6.populate();	 Catch:{ NotFoundException -> 0x00af }
        if (r3 == 0) goto L_0x0099;
    L_0x0096:
        r6.requestLayout();	 Catch:{ NotFoundException -> 0x00af }
    L_0x0099:
        r1 = r6.mAdapterChangeListener;	 Catch:{ NotFoundException -> 0x00b1 }
        if (r1 == 0) goto L_0x00a4;
    L_0x009d:
        if (r0 == r7) goto L_0x00a4;
    L_0x009f:
        r1 = r6.mAdapterChangeListener;	 Catch:{ NotFoundException -> 0x00b3 }
        r1.onAdapterChanged(r0, r7);	 Catch:{ NotFoundException -> 0x00b3 }
    L_0x00a4:
        return;
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;
    L_0x00b5:
        r1 = r0;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.setAdapter(android.support.v4.view.PagerAdapter):void");
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        int max;
        ItemInfo infoForPosition = infoForPosition(i);
        if (infoForPosition != null) {
            max = (int) (Math.max(this.mFirstOffset, Math.min(infoForPosition.offset, this.mLastOffset)) * ((float) getClientWidth()));
        } else {
            max = 0;
        }
        try {
            if (z) {
                try {
                    smoothScrollTo(max, 0, i2);
                    if (z2) {
                        if (this.mOnPageChangeListener != null) {
                            this.mOnPageChangeListener.onPageSelected(i);
                        }
                    }
                    if (z2) {
                        try {
                            if (this.mInternalPageChangeListener != null) {
                                this.mInternalPageChangeListener.onPageSelected(i);
                                if (!a) {
                                    return;
                                }
                            }
                            return;
                        } catch (NotFoundException e) {
                            throw e;
                        } catch (NotFoundException e2) {
                            try {
                                throw e2;
                            } catch (NotFoundException e22) {
                                throw e22;
                            }
                        }
                    } else {
                        return;
                    }
                } catch (NotFoundException e222) {
                    throw e222;
                } catch (NotFoundException e2222) {
                    throw e2222;
                }
            }
            if (z2) {
                if (this.mOnPageChangeListener != null) {
                    this.mOnPageChangeListener.onPageSelected(i);
                }
            }
            if (z2) {
                try {
                    if (this.mInternalPageChangeListener != null) {
                        this.mInternalPageChangeListener.onPageSelected(i);
                    }
                } catch (NotFoundException e22222) {
                    throw e22222;
                }
            }
            completeScroll(false);
            scrollTo(max, 0);
            pageScrolled(max);
        } catch (NotFoundException e222222) {
            throw e222222;
        }
    }

    static PagerAdapter access$200(ViewPager viewPager) {
        return viewPager.mAdapter;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void calculatePageOffsets(android.support.v4.view.ViewPager.ItemInfo r13, int r14, android.support.v4.view.ViewPager.ItemInfo r15) {
        /*
        r12_this = this;
        r6 = a;
        r0 = r12.mAdapter;
        r7 = r0.getCount();
        r0 = r12.getClientWidth();
        if (r0 <= 0) goto L_0x0167;
    L_0x000e:
        r1 = r12.mPageMargin;	 Catch:{ NotFoundException -> 0x0165 }
        r1 = (float) r1;
        r0 = (float) r0;
        r0 = r1 / r0;
        r5 = r0;
    L_0x0015:
        if (r15 == 0) goto L_0x00c7;
    L_0x0017:
        r4 = r15.position;
        r0 = r13.position;
        if (r4 >= r0) goto L_0x0077;
    L_0x001d:
        r1 = 0;
        r0 = r15.offset;
        r2 = r15.widthFactor;
        r0 = r0 + r2;
        r3 = r0 + r5;
        r2 = r4 + 1;
    L_0x0027:
        r0 = r13.position;
        if (r2 > r0) goto L_0x0075;
    L_0x002b:
        r0 = r12.mItems;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x0075;
    L_0x0033:
        r0 = r12.mItems;
        r0 = r0.get(r1);
        r0 = (android.support.v4.view.ViewPager.ItemInfo) r0;
    L_0x003b:
        r8 = r0.position;
        if (r2 <= r8) goto L_0x0055;
    L_0x003f:
        r8 = r12.mItems;
        r8 = r8.size();
        r8 = r8 + -1;
        if (r1 >= r8) goto L_0x0055;
    L_0x0049:
        r1 = r1 + 1;
        r0 = r12.mItems;
        r0 = r0.get(r1);
        r0 = (android.support.v4.view.ViewPager.ItemInfo) r0;
        if (r6 == 0) goto L_0x003b;
    L_0x0055:
        r10 = r2;
        r2 = r0;
        r0 = r10;
        r11 = r3;
        r3 = r1;
        r1 = r11;
    L_0x005b:
        r8 = r2.position;
        if (r0 >= r8) goto L_0x006b;
    L_0x005f:
        r8 = r12.mAdapter;
        r8 = r8.getPageWidth(r0);
        r8 = r8 + r5;
        r1 = r1 + r8;
        r0 = r0 + 1;
        if (r6 == 0) goto L_0x005b;
    L_0x006b:
        r2.offset = r1;
        r2 = r2.widthFactor;
        r2 = r2 + r5;
        r1 = r1 + r2;
        r2 = r0 + 1;
        if (r6 == 0) goto L_0x0199;
    L_0x0075:
        if (r6 == 0) goto L_0x00c7;
    L_0x0077:
        r0 = r13.position;	 Catch:{ NotFoundException -> 0x016b }
        if (r4 <= r0) goto L_0x00c7;
    L_0x007b:
        r0 = r12.mItems;
        r0 = r0.size();
        r1 = r0 + -1;
        r3 = r15.offset;
        r2 = r4 + -1;
    L_0x0087:
        r0 = r13.position;
        if (r2 < r0) goto L_0x00c7;
    L_0x008b:
        if (r1 < 0) goto L_0x00c7;
    L_0x008d:
        r0 = r12.mItems;
        r0 = r0.get(r1);
        r0 = (android.support.v4.view.ViewPager.ItemInfo) r0;
    L_0x0095:
        r4 = r0.position;
        if (r2 >= r4) goto L_0x00a7;
    L_0x0099:
        if (r1 <= 0) goto L_0x00a7;
    L_0x009b:
        r1 = r1 + -1;
        r0 = r12.mItems;
        r0 = r0.get(r1);
        r0 = (android.support.v4.view.ViewPager.ItemInfo) r0;
        if (r6 == 0) goto L_0x0095;
    L_0x00a7:
        r10 = r2;
        r2 = r0;
        r0 = r10;
        r11 = r3;
        r3 = r1;
        r1 = r11;
    L_0x00ad:
        r4 = r2.position;
        if (r0 <= r4) goto L_0x00bd;
    L_0x00b1:
        r4 = r12.mAdapter;
        r4 = r4.getPageWidth(r0);
        r4 = r4 + r5;
        r1 = r1 - r4;
        r0 = r0 + -1;
        if (r6 == 0) goto L_0x00ad;
    L_0x00bd:
        r4 = r2.widthFactor;
        r4 = r4 + r5;
        r1 = r1 - r4;
        r2.offset = r1;
        r2 = r0 + -1;
        if (r6 == 0) goto L_0x0194;
    L_0x00c7:
        r0 = r12.mItems;
        r8 = r0.size();
        r2 = r13.offset;
        r0 = r13.position;
        r1 = r0 + -1;
        r0 = r13.position;	 Catch:{ NotFoundException -> 0x016d }
        if (r0 != 0) goto L_0x016f;
    L_0x00d7:
        r0 = r13.offset;	 Catch:{ NotFoundException -> 0x016d }
    L_0x00d9:
        r12.mFirstOffset = r0;	 Catch:{ NotFoundException -> 0x0174 }
        r0 = r13.position;	 Catch:{ NotFoundException -> 0x0174 }
        r3 = r7 + -1;
        if (r0 != r3) goto L_0x0176;
    L_0x00e1:
        r0 = r13.offset;	 Catch:{ NotFoundException -> 0x0174 }
        r3 = r13.widthFactor;	 Catch:{ NotFoundException -> 0x0174 }
        r0 = r0 + r3;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r0 - r3;
    L_0x00e9:
        r12.mLastOffset = r0;
        r0 = r14 + -1;
        r4 = r0;
    L_0x00ee:
        if (r4 < 0) goto L_0x011d;
    L_0x00f0:
        r0 = r12.mItems;
        r0 = r0.get(r4);
        r0 = (android.support.v4.view.ViewPager.ItemInfo) r0;
        r3 = r2;
    L_0x00f9:
        r2 = r0.position;
        if (r1 <= r2) goto L_0x0190;
    L_0x00fd:
        r9 = r12.mAdapter;
        r2 = r1 + -1;
        r1 = r9.getPageWidth(r1);
        r1 = r1 + r5;
        r1 = r3 - r1;
        if (r6 == 0) goto L_0x018c;
    L_0x010a:
        r3 = r0.widthFactor;
        r3 = r3 + r5;
        r3 = r1 - r3;
        r0.offset = r3;	 Catch:{ NotFoundException -> 0x017b }
        r0 = r0.position;	 Catch:{ NotFoundException -> 0x017b }
        if (r0 != 0) goto L_0x0117;
    L_0x0115:
        r12.mFirstOffset = r3;	 Catch:{ NotFoundException -> 0x017b }
    L_0x0117:
        r0 = r4 + -1;
        r1 = r2 + -1;
        if (r6 == 0) goto L_0x0188;
    L_0x011d:
        r0 = r13.offset;
        r1 = r13.widthFactor;
        r0 = r0 + r1;
        r2 = r0 + r5;
        r0 = r13.position;
        r1 = r0 + 1;
        r0 = r14 + 1;
        r4 = r0;
    L_0x012b:
        if (r4 >= r8) goto L_0x0161;
    L_0x012d:
        r0 = r12.mItems;
        r0 = r0.get(r4);
        r0 = (android.support.v4.view.ViewPager.ItemInfo) r0;
        r3 = r2;
    L_0x0136:
        r2 = r0.position;
        if (r1 >= r2) goto L_0x0185;
    L_0x013a:
        r9 = r12.mAdapter;
        r2 = r1 + 1;
        r1 = r9.getPageWidth(r1);
        r1 = r1 + r5;
        r1 = r1 + r3;
        if (r6 == 0) goto L_0x0182;
    L_0x0146:
        r3 = r0.position;	 Catch:{ NotFoundException -> 0x017d }
        r9 = r7 + -1;
        if (r3 != r9) goto L_0x0154;
    L_0x014c:
        r3 = r0.widthFactor;	 Catch:{ NotFoundException -> 0x017d }
        r3 = r3 + r1;
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = r3 - r9;
        r12.mLastOffset = r3;	 Catch:{ NotFoundException -> 0x017d }
    L_0x0154:
        r0.offset = r1;
        r0 = r0.widthFactor;
        r0 = r0 + r5;
        r3 = r1 + r0;
        r0 = r4 + 1;
        r1 = r2 + 1;
        if (r6 == 0) goto L_0x017f;
    L_0x0161:
        r0 = 0;
        r12.mNeedCalculatePageOffsets = r0;
        return;
    L_0x0165:
        r0 = move-exception;
        throw r0;
    L_0x0167:
        r0 = 0;
        r5 = r0;
        goto L_0x0015;
    L_0x016b:
        r0 = move-exception;
        throw r0;
    L_0x016d:
        r0 = move-exception;
        throw r0;
    L_0x016f:
        r0 = -8388609; // 0xffffffffff7fffff float:-3.4028235E38 double:NaN;
        goto L_0x00d9;
    L_0x0174:
        r0 = move-exception;
        throw r0;
    L_0x0176:
        r0 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        goto L_0x00e9;
    L_0x017b:
        r0 = move-exception;
        throw r0;
    L_0x017d:
        r0 = move-exception;
        throw r0;
    L_0x017f:
        r4 = r0;
        r2 = r3;
        goto L_0x012b;
    L_0x0182:
        r3 = r1;
        r1 = r2;
        goto L_0x0136;
    L_0x0185:
        r2 = r1;
        r1 = r3;
        goto L_0x0146;
    L_0x0188:
        r4 = r0;
        r2 = r3;
        goto L_0x00ee;
    L_0x018c:
        r3 = r1;
        r1 = r2;
        goto L_0x00f9;
    L_0x0190:
        r2 = r1;
        r1 = r3;
        goto L_0x010a;
    L_0x0194:
        r10 = r1;
        r1 = r3;
        r3 = r10;
        goto L_0x0087;
    L_0x0199:
        r10 = r1;
        r1 = r3;
        r3 = r10;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.calculatePageOffsets(android.support.v4.view.ViewPager$ItemInfo, int, android.support.v4.view.ViewPager$ItemInfo):void");
    }

    void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        try {
            this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
            this.mMinimumVelocity = (int) (400.0f * f);
            this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            this.mLeftEdge = new EdgeEffectCompat(context);
            this.mRightEdge = new EdgeEffectCompat(context);
            this.mFlingDistance = (int) (25.0f * f);
            this.mCloseEnough = (int) (2.0f * f);
            this.mDefaultGutterSize = (int) (16.0f * f);
            ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate(this));
            if (ViewCompat.getImportantForAccessibility(this) == 0) {
                ViewCompat.setImportantForAccessibility(this, 1);
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean canScroll(android.view.View r12, boolean r13, int r14, int r15, int r16) {
        /*
        r11_this = this;
        r8 = a;
        r0 = r12 instanceof android.view.ViewGroup;
        if (r0 == 0) goto L_0x0067;
    L_0x0006:
        r6 = r12;
        r6 = (android.view.ViewGroup) r6;
        r9 = r12.getScrollX();
        r10 = r12.getScrollY();
        r0 = r6.getChildCount();
        r0 = r0 + -1;
        r7 = r0;
    L_0x0018:
        if (r7 < 0) goto L_0x0067;
    L_0x001a:
        r1 = r6.getChildAt(r7);
        r0 = r15 + r9;
        r2 = r1.getLeft();	 Catch:{ NotFoundException -> 0x0059 }
        if (r0 < r2) goto L_0x0063;
    L_0x0026:
        r0 = r15 + r9;
        r2 = r1.getRight();	 Catch:{ NotFoundException -> 0x005b }
        if (r0 >= r2) goto L_0x0063;
    L_0x002e:
        r0 = r16 + r10;
        r2 = r1.getTop();	 Catch:{ NotFoundException -> 0x005d }
        if (r0 < r2) goto L_0x0063;
    L_0x0036:
        r0 = r16 + r10;
        r2 = r1.getBottom();	 Catch:{ NotFoundException -> 0x005f }
        if (r0 >= r2) goto L_0x0063;
    L_0x003e:
        r2 = 1;
        r0 = r15 + r9;
        r3 = r1.getLeft();	 Catch:{ NotFoundException -> 0x0061 }
        r4 = r0 - r3;
        r0 = r16 + r10;
        r3 = r1.getTop();	 Catch:{ NotFoundException -> 0x0061 }
        r5 = r0 - r3;
        r0 = r11;
        r3 = r14;
        r0 = r0.canScroll(r1, r2, r3, r4, r5);	 Catch:{ NotFoundException -> 0x0061 }
        if (r0 == 0) goto L_0x0063;
    L_0x0057:
        r0 = 1;
    L_0x0058:
        return r0;
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r0 = r7 + -1;
        if (r8 == 0) goto L_0x0076;
    L_0x0067:
        if (r13 == 0) goto L_0x0074;
    L_0x0069:
        r0 = -r14;
        r0 = android.support.v4.view.ViewCompat.canScrollHorizontally(r12, r0);	 Catch:{ NotFoundException -> 0x0072 }
        if (r0 == 0) goto L_0x0074;
    L_0x0070:
        r0 = 1;
        goto L_0x0058;
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = 0;
        goto L_0x0058;
    L_0x0076:
        r7 = r0;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.canScroll(android.view.View, boolean, int, int, int):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
        r18_this = this;
        r10 = a;
        r11 = r18.getChildCount();
        r12 = r22 - r20;
        r13 = r23 - r21;
        r2 = r18.getPaddingLeft();
        r3 = r18.getPaddingTop();
        r6 = r18.getPaddingRight();
        r4 = r18.getPaddingBottom();
        r14 = r18.getScrollX();
        r5 = 0;
        r1 = 0;
        r9 = r1;
    L_0x0021:
        if (r9 >= r11) goto L_0x0167;
    L_0x0023:
        r0 = r18;
        r15 = r0.getChildAt(r9);
        r1 = r15.getVisibility();
        r7 = 8;
        if (r1 == r7) goto L_0x0162;
    L_0x0031:
        r1 = r15.getLayoutParams();
        r1 = (android.support.v4.view.ViewPager.LayoutParams) r1;
        r7 = r1.isDecor;
        if (r7 == 0) goto L_0x0162;
    L_0x003b:
        r7 = r1.gravity;
        r7 = r7 & 7;
        r1 = r1.gravity;
        r16 = r1 & 112;
        switch(r7) {
            case 1: goto L_0x015c;
            case 2: goto L_0x0046;
            case 3: goto L_0x0048;
            case 4: goto L_0x0046;
            case 5: goto L_0x015f;
            default: goto L_0x0046;
        };
    L_0x0046:
        if (r10 == 0) goto L_0x0158;
    L_0x0048:
        r1 = r15.getMeasuredWidth();
        r1 = r1 + r2;
        if (r10 == 0) goto L_0x0154;
    L_0x004f:
        r2 = r15.getMeasuredWidth();
        r2 = r12 - r2;
        r2 = r2 / 2;
        r2 = java.lang.Math.max(r2, r1);
        if (r10 == 0) goto L_0x0154;
    L_0x005d:
        r2 = r12 - r6;
        r7 = r15.getMeasuredWidth();
        r2 = r2 - r7;
        r7 = r15.getMeasuredWidth();
        r6 = r6 + r7;
        r8 = r2;
        r7 = r1;
    L_0x006b:
        switch(r16) {
            case 16: goto L_0x014e;
            case 48: goto L_0x0070;
            case 80: goto L_0x0151;
            default: goto L_0x006e;
        };
    L_0x006e:
        if (r10 == 0) goto L_0x014a;
    L_0x0070:
        r1 = r15.getMeasuredHeight();
        r1 = r1 + r3;
        if (r10 == 0) goto L_0x0146;
    L_0x0077:
        r2 = r15.getMeasuredHeight();
        r2 = r13 - r2;
        r2 = r2 / 2;
        r3 = java.lang.Math.max(r2, r1);
        if (r10 == 0) goto L_0x0146;
    L_0x0085:
        r2 = r13 - r4;
        r3 = r15.getMeasuredHeight();
        r3 = r2 - r3;
        r2 = r15.getMeasuredHeight();
        r2 = r2 + r4;
        r17 = r2;
        r2 = r1;
        r1 = r17;
    L_0x0097:
        r4 = r8 + r14;
        r8 = r15.getMeasuredWidth();
        r8 = r8 + r4;
        r16 = r15.getMeasuredHeight();
        r16 = r16 + r3;
        r0 = r16;
        r15.layout(r4, r3, r8, r0);
        r5 = r5 + 1;
        r4 = r1;
        r3 = r2;
        r2 = r6;
        r1 = r5;
        r5 = r7;
    L_0x00b0:
        r6 = r9 + 1;
        if (r10 == 0) goto L_0x0140;
    L_0x00b4:
        r17 = r1;
        r1 = r2;
        r2 = r17;
    L_0x00b9:
        r6 = r12 - r5;
        r7 = r6 - r1;
        r1 = 0;
        r6 = r1;
    L_0x00bf:
        if (r6 >= r11) goto L_0x0116;
    L_0x00c1:
        r0 = r18;
        r8 = r0.getChildAt(r6);
        r1 = r8.getVisibility();
        r9 = 8;
        if (r1 == r9) goto L_0x0112;
    L_0x00cf:
        r1 = r8.getLayoutParams();
        r1 = (android.support.v4.view.ViewPager.LayoutParams) r1;
        r9 = r1.isDecor;
        if (r9 != 0) goto L_0x0112;
    L_0x00d9:
        r0 = r18;
        r9 = r0.infoForChild(r8);
        if (r9 == 0) goto L_0x0112;
    L_0x00e1:
        r12 = (float) r7;
        r9 = r9.offset;
        r9 = r9 * r12;
        r9 = (int) r9;
        r9 = r9 + r5;
        r12 = r1.needsMeasure;
        if (r12 == 0) goto L_0x0105;
    L_0x00eb:
        r12 = 0;
        r1.needsMeasure = r12;
        r12 = (float) r7;
        r1 = r1.widthFactor;
        r1 = r1 * r12;
        r1 = (int) r1;
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r12);
        r12 = r13 - r3;
        r12 = r12 - r4;
        r14 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r14);
        r8.measure(r1, r12);
    L_0x0105:
        r1 = r8.getMeasuredWidth();
        r1 = r1 + r9;
        r12 = r8.getMeasuredHeight();
        r12 = r12 + r3;
        r8.layout(r9, r3, r1, r12);
    L_0x0112:
        r1 = r6 + 1;
        if (r10 == 0) goto L_0x013e;
    L_0x0116:
        r0 = r18;
        r0.mTopPageBounds = r3;	 Catch:{ NotFoundException -> 0x013c }
        r1 = r13 - r4;
        r0 = r18;
        r0.mBottomPageBounds = r1;	 Catch:{ NotFoundException -> 0x013c }
        r0 = r18;
        r0.mDecorChildCount = r2;	 Catch:{ NotFoundException -> 0x013c }
        r0 = r18;
        r1 = r0.mFirstLayout;	 Catch:{ NotFoundException -> 0x013c }
        if (r1 == 0) goto L_0x0136;
    L_0x012a:
        r0 = r18;
        r1 = r0.mCurItem;	 Catch:{ NotFoundException -> 0x013c }
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r0 = r18;
        r0.scrollToItem(r1, r2, r3, r4);	 Catch:{ NotFoundException -> 0x013c }
    L_0x0136:
        r1 = 0;
        r0 = r18;
        r0.mFirstLayout = r1;
        return;
    L_0x013c:
        r1 = move-exception;
        throw r1;
    L_0x013e:
        r6 = r1;
        goto L_0x00bf;
    L_0x0140:
        r9 = r6;
        r6 = r2;
        r2 = r5;
        r5 = r1;
        goto L_0x0021;
    L_0x0146:
        r2 = r1;
        r1 = r4;
        goto L_0x0097;
    L_0x014a:
        r1 = r4;
        r2 = r3;
        goto L_0x0097;
    L_0x014e:
        r1 = r3;
        goto L_0x0077;
    L_0x0151:
        r1 = r3;
        goto L_0x0085;
    L_0x0154:
        r8 = r2;
        r7 = r1;
        goto L_0x006b;
    L_0x0158:
        r8 = r2;
        r7 = r2;
        goto L_0x006b;
    L_0x015c:
        r1 = r2;
        goto L_0x004f;
    L_0x015f:
        r1 = r2;
        goto L_0x005d;
    L_0x0162:
        r1 = r5;
        r5 = r2;
        r2 = r6;
        goto L_0x00b0;
    L_0x0167:
        r1 = r6;
        r17 = r5;
        r5 = r2;
        r2 = r17;
        goto L_0x00b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    public ViewPager(Context context) {
        super(context);
        this.mItems = new ArrayList();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() {
            final ViewPager this$0;

            public void run() {
                ViewPager.access$000(this.this$0, 0);
                this.this$0.populate();
            }

            {
                this.this$0 = r1;
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r16, int r17) {
        /*
        r15_this = this;
        r10 = a;
        r1 = 0;
        r0 = r16;
        r1 = getDefaultSize(r1, r0);
        r2 = 0;
        r0 = r17;
        r2 = getDefaultSize(r2, r0);
        r15.setMeasuredDimension(r1, r2);
        r1 = r15.getMeasuredWidth();
        r2 = r1 / 10;
        r3 = r15.mDefaultGutterSize;
        r2 = java.lang.Math.min(r2, r3);
        r15.mGutterSize = r2;
        r2 = r15.getPaddingLeft();
        r1 = r1 - r2;
        r2 = r15.getPaddingRight();
        r5 = r1 - r2;
        r1 = r15.getMeasuredHeight();
        r2 = r15.getPaddingTop();
        r1 = r1 - r2;
        r2 = r15.getPaddingBottom();
        r7 = r1 - r2;
        r11 = r15.getChildCount();
        r1 = 0;
        r9 = r1;
    L_0x0041:
        if (r9 >= r11) goto L_0x00bd;
    L_0x0043:
        r12 = r15.getChildAt(r9);
        r1 = r12.getVisibility();
        r2 = 8;
        if (r1 == r2) goto L_0x00b9;
    L_0x004f:
        r1 = r12.getLayoutParams();
        r1 = (android.support.v4.view.ViewPager.LayoutParams) r1;
        if (r1 == 0) goto L_0x00b9;
    L_0x0057:
        r2 = r1.isDecor;	 Catch:{ NotFoundException -> 0x010b }
        if (r2 == 0) goto L_0x00b9;
    L_0x005b:
        r2 = r1.gravity;
        r6 = r2 & 7;
        r2 = r1.gravity;
        r2 = r2 & 112;
        r4 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r8 = 48;
        if (r2 == r8) goto L_0x006f;
    L_0x006b:
        r8 = 80;
        if (r2 != r8) goto L_0x010d;
    L_0x006f:
        r2 = 1;
    L_0x0070:
        r8 = 3;
        if (r6 == r8) goto L_0x0076;
    L_0x0073:
        r8 = 5;
        if (r6 != r8) goto L_0x0110;
    L_0x0076:
        r6 = 1;
        r8 = r6;
    L_0x0078:
        if (r2 == 0) goto L_0x007e;
    L_0x007a:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r10 == 0) goto L_0x0082;
    L_0x007e:
        if (r8 == 0) goto L_0x0082;
    L_0x0080:
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x0082:
        r6 = r1.width;
        r13 = -2;
        if (r6 == r13) goto L_0x0120;
    L_0x0087:
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = r1.width;
        r13 = -1;
        if (r4 == r13) goto L_0x011d;
    L_0x008e:
        r4 = r1.width;
    L_0x0090:
        r13 = r1.height;
        r14 = -2;
        if (r13 == r14) goto L_0x011b;
    L_0x0095:
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r13 = r1.height;
        r14 = -1;
        if (r13 == r14) goto L_0x011b;
    L_0x009c:
        r1 = r1.height;
    L_0x009e:
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6);
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r3);
        r12.measure(r4, r1);
        if (r2 == 0) goto L_0x00b2;
    L_0x00ab:
        r1 = r12.getMeasuredHeight();
        r7 = r7 - r1;
        if (r10 == 0) goto L_0x00b9;
    L_0x00b2:
        if (r8 == 0) goto L_0x00b9;
    L_0x00b4:
        r1 = r12.getMeasuredWidth();
        r5 = r5 - r1;
    L_0x00b9:
        r1 = r9 + 1;
        if (r10 == 0) goto L_0x0118;
    L_0x00bd:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1);
        r15.mChildWidthMeasureSpec = r1;
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1);
        r15.mChildHeightMeasureSpec = r1;
        r1 = 1;
        r15.mInLayout = r1;
        r15.populate();
        r1 = 0;
        r15.mInLayout = r1;
        r3 = r15.getChildCount();
        r1 = 0;
        r2 = r1;
    L_0x00dc:
        if (r2 >= r3) goto L_0x010a;
    L_0x00de:
        r4 = r15.getChildAt(r2);
        r1 = r4.getVisibility();
        r6 = 8;
        if (r1 == r6) goto L_0x0106;
    L_0x00ea:
        r1 = r4.getLayoutParams();
        r1 = (android.support.v4.view.ViewPager.LayoutParams) r1;
        if (r1 == 0) goto L_0x00f6;
    L_0x00f2:
        r6 = r1.isDecor;	 Catch:{ NotFoundException -> 0x0114 }
        if (r6 != 0) goto L_0x0106;
    L_0x00f6:
        r6 = (float) r5;
        r1 = r1.widthFactor;
        r1 = r1 * r6;
        r1 = (int) r1;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6);
        r6 = r15.mChildHeightMeasureSpec;
        r4.measure(r1, r6);
    L_0x0106:
        r1 = r2 + 1;
        if (r10 == 0) goto L_0x0116;
    L_0x010a:
        return;
    L_0x010b:
        r1 = move-exception;
        throw r1;
    L_0x010d:
        r2 = 0;
        goto L_0x0070;
    L_0x0110:
        r6 = 0;
        r8 = r6;
        goto L_0x0078;
    L_0x0114:
        r1 = move-exception;
        throw r1;
    L_0x0116:
        r2 = r1;
        goto L_0x00dc;
    L_0x0118:
        r9 = r1;
        goto L_0x0041;
    L_0x011b:
        r1 = r7;
        goto L_0x009e;
    L_0x011d:
        r4 = r5;
        goto L_0x0090;
    L_0x0120:
        r6 = r4;
        r4 = r5;
        goto L_0x0090;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onMeasure(int, int):void");
    }

    float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void sortChildDrawingOrder() {
        /*
        r5_this = this;
        r1 = a;
        r0 = r5.mDrawingOrder;	 Catch:{ NotFoundException -> 0x0034 }
        if (r0 == 0) goto L_0x0033;
    L_0x0006:
        r0 = r5.mDrawingOrderedChildren;	 Catch:{ NotFoundException -> 0x0036 }
        if (r0 != 0) goto L_0x0013;
    L_0x000a:
        r0 = new java.util.ArrayList;	 Catch:{ NotFoundException -> 0x0038 }
        r0.<init>();	 Catch:{ NotFoundException -> 0x0038 }
        r5.mDrawingOrderedChildren = r0;	 Catch:{ NotFoundException -> 0x0038 }
        if (r1 == 0) goto L_0x0018;
    L_0x0013:
        r0 = r5.mDrawingOrderedChildren;	 Catch:{ NotFoundException -> 0x0038 }
        r0.clear();	 Catch:{ NotFoundException -> 0x0038 }
    L_0x0018:
        r2 = r5.getChildCount();
        r0 = 0;
    L_0x001d:
        if (r0 >= r2) goto L_0x002c;
    L_0x001f:
        r3 = r5.getChildAt(r0);
        r4 = r5.mDrawingOrderedChildren;
        r4.add(r3);
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x001d;
    L_0x002c:
        r0 = r5.mDrawingOrderedChildren;
        r1 = sPositionComparator;
        java.util.Collections.sort(r0, r1);
    L_0x0033:
        return;
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.sortChildDrawingOrder():void");
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        super.onDetachedFromWindow();
    }

    private void enableLayers(boolean z) {
        boolean z2 = a;
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2;
            if (z) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            ViewCompat.setLayerType(getChildAt(i), i2, null);
            i2 = i + 1;
            if (!z2) {
                i = i2;
            } else {
                return;
            }
        }
    }

    static int access$300(ViewPager viewPager) {
        return viewPager.mCurItem;
    }

    public void computeScroll() {
        try {
            if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
                completeScroll(true);
                return;
            }
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                try {
                    scrollTo(currX, currY);
                    if (!pageScrolled(currX)) {
                        this.mScroller.abortAnimation();
                        scrollTo(0, currY);
                    }
                } catch (NotFoundException e) {
                    throw e;
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    public void setCurrentItem(int i) {
        try {
            boolean z;
            this.mPopulatePending = false;
            if (this.mFirstLayout) {
                z = false;
            } else {
                z = true;
            }
            setCurrentItemInternal(i, z, false);
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void populate(int r19) {
        /*
        r18_this = this;
        r11 = a;
        r3 = 0;
        r2 = 2;
        r0 = r18;
        r4 = r0.mCurItem;	 Catch:{ NotFoundException -> 0x0032 }
        r0 = r19;
        if (r4 == r0) goto L_0x03d4;
    L_0x000c:
        r0 = r18;
        r2 = r0.mCurItem;	 Catch:{ NotFoundException -> 0x0032 }
        r0 = r19;
        if (r2 >= r0) goto L_0x0036;
    L_0x0014:
        r2 = 66;
    L_0x0016:
        r0 = r18;
        r3 = r0.mCurItem;
        r0 = r18;
        r3 = r0.infoForPosition(r3);
        r0 = r19;
        r1 = r18;
        r1.mCurItem = r0;
        r9 = r2;
        r10 = r3;
    L_0x0028:
        r0 = r18;
        r2 = r0.mAdapter;	 Catch:{ NotFoundException -> 0x0039 }
        if (r2 != 0) goto L_0x003b;
    L_0x002e:
        r18.sortChildDrawingOrder();	 Catch:{ NotFoundException -> 0x0039 }
    L_0x0031:
        return;
    L_0x0032:
        r2 = move-exception;
        throw r2;	 Catch:{ NotFoundException -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        throw r2;
    L_0x0036:
        r2 = 17;
        goto L_0x0016;
    L_0x0039:
        r2 = move-exception;
        throw r2;
    L_0x003b:
        r0 = r18;
        r2 = r0.mPopulatePending;	 Catch:{ NotFoundException -> 0x0045 }
        if (r2 == 0) goto L_0x0047;
    L_0x0041:
        r18.sortChildDrawingOrder();	 Catch:{ NotFoundException -> 0x0045 }
        goto L_0x0031;
    L_0x0045:
        r2 = move-exception;
        throw r2;
    L_0x0047:
        r2 = r18.getWindowToken();	 Catch:{ NotFoundException -> 0x00eb }
        if (r2 == 0) goto L_0x0031;
    L_0x004d:
        r0 = r18;
        r2 = r0.mAdapter;
        r0 = r18;
        r2.startUpdate(r0);
        r0 = r18;
        r2 = r0.mOffscreenPageLimit;
        r3 = 0;
        r0 = r18;
        r4 = r0.mCurItem;
        r4 = r4 - r2;
        r12 = java.lang.Math.max(r3, r4);
        r0 = r18;
        r3 = r0.mAdapter;
        r13 = r3.getCount();
        r3 = r13 + -1;
        r0 = r18;
        r4 = r0.mCurItem;
        r2 = r2 + r4;
        r14 = java.lang.Math.min(r3, r2);
        r0 = r18;
        r2 = r0.mExpectedAdapterCount;
        if (r13 == r2) goto L_0x00f7;
    L_0x007d:
        r2 = r18.getResources();	 Catch:{ NotFoundException -> 0x00ed }
        r3 = r18.getId();	 Catch:{ NotFoundException -> 0x00ed }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x00ed }
    L_0x0089:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 6;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r18;
        r5 = r0.mExpectedAdapterCount;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 9;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r13);
        r5 = z;
        r6 = 7;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = z;
        r5 = 8;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r18.getClass();
        r2 = r2.append(r4);
        r4 = z;
        r5 = 5;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r0 = r18;
        r4 = r0.mAdapter;
        r4 = r4.getClass();
        r2 = r2.append(r4);
        r2 = r2.toString();
        r3.<init>(r2);
        throw r3;
    L_0x00eb:
        r2 = move-exception;
        throw r2;
    L_0x00ed:
        r2 = move-exception;
        r2 = r18.getId();
        r2 = java.lang.Integer.toHexString(r2);
        goto L_0x0089;
    L_0x00f7:
        r4 = 0;
        r2 = 0;
        r3 = r2;
    L_0x00fa:
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.size();
        if (r3 >= r2) goto L_0x03d1;
    L_0x0104:
        r0 = r18;
        r2 = r0.mItems;
        r2 = r2.get(r3);
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;
        r5 = r2.position;	 Catch:{ NotFoundException -> 0x032d }
        r0 = r18;
        r6 = r0.mCurItem;	 Catch:{ NotFoundException -> 0x032d }
        if (r5 < r6) goto L_0x032f;
    L_0x0116:
        r5 = r2.position;	 Catch:{ NotFoundException -> 0x032d }
        r0 = r18;
        r6 = r0.mCurItem;	 Catch:{ NotFoundException -> 0x032d }
        if (r5 != r6) goto L_0x03d1;
    L_0x011e:
        if (r2 != 0) goto L_0x03ce;
    L_0x0120:
        if (r13 <= 0) goto L_0x03ce;
    L_0x0122:
        r0 = r18;
        r2 = r0.mCurItem;
        r0 = r18;
        r2 = r0.addNewItem(r2, r3);
        r8 = r2;
    L_0x012d:
        if (r8 == 0) goto L_0x0294;
    L_0x012f:
        r7 = 0;
        r6 = r3 + -1;
        if (r6 < 0) goto L_0x0336;
    L_0x0134:
        r0 = r18;
        r2 = r0.mItems;	 Catch:{ NotFoundException -> 0x0334 }
        r2 = r2.get(r6);	 Catch:{ NotFoundException -> 0x0334 }
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;	 Catch:{ NotFoundException -> 0x0334 }
    L_0x013e:
        r15 = r18.getClientWidth();
        if (r15 > 0) goto L_0x0339;
    L_0x0144:
        r4 = 0;
    L_0x0145:
        r0 = r18;
        r5 = r0.mCurItem;
        r5 = r5 + -1;
        r17 = r5;
        r5 = r2;
        r2 = r3;
        r3 = r7;
        r7 = r17;
    L_0x0152:
        if (r7 < 0) goto L_0x01df;
    L_0x0154:
        r16 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r16 < 0) goto L_0x03c7;
    L_0x0158:
        if (r7 >= r12) goto L_0x03c7;
    L_0x015a:
        if (r5 != 0) goto L_0x015e;
    L_0x015c:
        if (r11 == 0) goto L_0x01df;
    L_0x015e:
        r0 = r5.position;	 Catch:{ NotFoundException -> 0x034b }
        r16 = r0;
        r0 = r16;
        if (r7 != r0) goto L_0x03bf;
    L_0x0166:
        r0 = r5.scrolling;	 Catch:{ NotFoundException -> 0x034d }
        r16 = r0;
        if (r16 != 0) goto L_0x03bf;
    L_0x016c:
        r0 = r18;
        r0 = r0.mItems;	 Catch:{ NotFoundException -> 0x034f }
        r16 = r0;
        r0 = r16;
        r0.remove(r6);	 Catch:{ NotFoundException -> 0x034f }
        r0 = r18;
        r0 = r0.mAdapter;	 Catch:{ NotFoundException -> 0x034f }
        r16 = r0;
        r5 = r5.object;	 Catch:{ NotFoundException -> 0x034f }
        r0 = r16;
        r1 = r18;
        r0.destroyItem(r1, r7, r5);	 Catch:{ NotFoundException -> 0x034f }
        r5 = r6 + -1;
        r6 = r2 + -1;
        if (r5 < 0) goto L_0x0351;
    L_0x018c:
        r0 = r18;
        r2 = r0.mItems;	 Catch:{ NotFoundException -> 0x034f }
        r2 = r2.get(r5);	 Catch:{ NotFoundException -> 0x034f }
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;	 Catch:{ NotFoundException -> 0x034f }
    L_0x0196:
        if (r11 == 0) goto L_0x03b7;
    L_0x0198:
        r17 = r2;
        r2 = r5;
        r5 = r17;
    L_0x019d:
        if (r5 == 0) goto L_0x03b0;
    L_0x019f:
        r0 = r5.position;	 Catch:{ NotFoundException -> 0x0354 }
        r16 = r0;
        r0 = r16;
        if (r7 != r0) goto L_0x03b0;
    L_0x01a7:
        r5 = r5.widthFactor;
        r5 = r5 + r3;
        r3 = r2 + -1;
        if (r3 < 0) goto L_0x0358;
    L_0x01ae:
        r0 = r18;
        r2 = r0.mItems;	 Catch:{ NotFoundException -> 0x0356 }
        r2 = r2.get(r3);	 Catch:{ NotFoundException -> 0x0356 }
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;	 Catch:{ NotFoundException -> 0x0356 }
    L_0x01b8:
        if (r11 == 0) goto L_0x03a7;
    L_0x01ba:
        r2 = r5;
    L_0x01bb:
        r5 = r3 + 1;
        r0 = r18;
        r5 = r0.addNewItem(r7, r5);
        r5 = r5.widthFactor;
        r5 = r5 + r2;
        r6 = r6 + 1;
        if (r3 < 0) goto L_0x035d;
    L_0x01ca:
        r0 = r18;
        r2 = r0.mItems;	 Catch:{ NotFoundException -> 0x035b }
        r2 = r2.get(r3);	 Catch:{ NotFoundException -> 0x035b }
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;	 Catch:{ NotFoundException -> 0x035b }
    L_0x01d4:
        r17 = r2;
        r2 = r6;
        r6 = r5;
        r5 = r3;
        r3 = r17;
    L_0x01db:
        r7 = r7 + -1;
        if (r11 == 0) goto L_0x039f;
    L_0x01df:
        r3 = r2;
        r6 = r8.widthFactor;
        r7 = r3 + 1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x028f;
    L_0x01ea:
        r0 = r18;
        r2 = r0.mItems;	 Catch:{ NotFoundException -> 0x0360 }
        r2 = r2.size();	 Catch:{ NotFoundException -> 0x0360 }
        if (r7 >= r2) goto L_0x0362;
    L_0x01f4:
        r0 = r18;
        r2 = r0.mItems;	 Catch:{ NotFoundException -> 0x0360 }
        r2 = r2.get(r7);	 Catch:{ NotFoundException -> 0x0360 }
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;	 Catch:{ NotFoundException -> 0x0360 }
    L_0x01fe:
        if (r15 > 0) goto L_0x0365;
    L_0x0200:
        r4 = 0;
    L_0x0201:
        r0 = r18;
        r5 = r0.mCurItem;
        r5 = r5 + 1;
        r17 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r17;
    L_0x020d:
        if (r7 >= r13) goto L_0x028f;
    L_0x020f:
        r12 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));
        if (r12 < 0) goto L_0x0249;
    L_0x0213:
        if (r7 <= r14) goto L_0x0249;
    L_0x0215:
        if (r2 != 0) goto L_0x0219;
    L_0x0217:
        if (r11 == 0) goto L_0x028f;
    L_0x0219:
        r12 = r2.position;	 Catch:{ NotFoundException -> 0x0371 }
        if (r7 != r12) goto L_0x028b;
    L_0x021d:
        r12 = r2.scrolling;	 Catch:{ NotFoundException -> 0x0373 }
        if (r12 != 0) goto L_0x028b;
    L_0x0221:
        r0 = r18;
        r12 = r0.mItems;	 Catch:{ NotFoundException -> 0x0375 }
        r12.remove(r6);	 Catch:{ NotFoundException -> 0x0375 }
        r0 = r18;
        r12 = r0.mAdapter;	 Catch:{ NotFoundException -> 0x0375 }
        r2 = r2.object;	 Catch:{ NotFoundException -> 0x0375 }
        r0 = r18;
        r12.destroyItem(r0, r7, r2);	 Catch:{ NotFoundException -> 0x0375 }
        r0 = r18;
        r2 = r0.mItems;	 Catch:{ NotFoundException -> 0x0375 }
        r2 = r2.size();	 Catch:{ NotFoundException -> 0x0375 }
        if (r6 >= r2) goto L_0x0377;
    L_0x023d:
        r0 = r18;
        r2 = r0.mItems;	 Catch:{ NotFoundException -> 0x0375 }
        r2 = r2.get(r6);	 Catch:{ NotFoundException -> 0x0375 }
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;	 Catch:{ NotFoundException -> 0x0375 }
    L_0x0247:
        if (r11 == 0) goto L_0x028b;
    L_0x0249:
        if (r2 == 0) goto L_0x026a;
    L_0x024b:
        r12 = r2.position;	 Catch:{ NotFoundException -> 0x037a }
        if (r7 != r12) goto L_0x026a;
    L_0x024f:
        r2 = r2.widthFactor;
        r5 = r5 + r2;
        r6 = r6 + 1;
        r0 = r18;
        r2 = r0.mItems;	 Catch:{ NotFoundException -> 0x037c }
        r2 = r2.size();	 Catch:{ NotFoundException -> 0x037c }
        if (r6 >= r2) goto L_0x037e;
    L_0x025e:
        r0 = r18;
        r2 = r0.mItems;	 Catch:{ NotFoundException -> 0x037c }
        r2 = r2.get(r6);	 Catch:{ NotFoundException -> 0x037c }
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;	 Catch:{ NotFoundException -> 0x037c }
    L_0x0268:
        if (r11 == 0) goto L_0x028b;
    L_0x026a:
        r2 = r5;
        r5 = r6;
        r0 = r18;
        r12 = r0.addNewItem(r7, r5);
        r6 = r5 + 1;
        r5 = r12.widthFactor;
        r5 = r5 + r2;
        r0 = r18;
        r2 = r0.mItems;	 Catch:{ NotFoundException -> 0x0381 }
        r2 = r2.size();	 Catch:{ NotFoundException -> 0x0381 }
        if (r6 >= r2) goto L_0x0383;
    L_0x0281:
        r0 = r18;
        r2 = r0.mItems;	 Catch:{ NotFoundException -> 0x0381 }
        r2 = r2.get(r6);	 Catch:{ NotFoundException -> 0x0381 }
        r2 = (android.support.v4.view.ViewPager.ItemInfo) r2;	 Catch:{ NotFoundException -> 0x0381 }
    L_0x028b:
        r7 = r7 + 1;
        if (r11 == 0) goto L_0x020d;
    L_0x028f:
        r0 = r18;
        r0.calculatePageOffsets(r8, r3, r10);
    L_0x0294:
        r0 = r18;
        r3 = r0.mAdapter;	 Catch:{ NotFoundException -> 0x0386 }
        r0 = r18;
        r4 = r0.mCurItem;	 Catch:{ NotFoundException -> 0x0386 }
        if (r8 == 0) goto L_0x0388;
    L_0x029e:
        r2 = r8.object;	 Catch:{ NotFoundException -> 0x0386 }
    L_0x02a0:
        r0 = r18;
        r3.setPrimaryItem(r0, r4, r2);
        r0 = r18;
        r2 = r0.mAdapter;
        r0 = r18;
        r2.finishUpdate(r0);
        r4 = r18.getChildCount();
        r2 = 0;
        r3 = r2;
    L_0x02b4:
        if (r3 >= r4) goto L_0x02e3;
    L_0x02b6:
        r0 = r18;
        r5 = r0.getChildAt(r3);
        r2 = r5.getLayoutParams();
        r2 = (android.support.v4.view.ViewPager.LayoutParams) r2;
        r2.childIndex = r3;	 Catch:{ NotFoundException -> 0x038b }
        r6 = r2.isDecor;	 Catch:{ NotFoundException -> 0x038b }
        if (r6 != 0) goto L_0x02df;
    L_0x02c8:
        r6 = r2.widthFactor;	 Catch:{ NotFoundException -> 0x038b }
        r7 = 0;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 != 0) goto L_0x02df;
    L_0x02cf:
        r0 = r18;
        r5 = r0.infoForChild(r5);
        if (r5 == 0) goto L_0x02df;
    L_0x02d7:
        r6 = r5.widthFactor;	 Catch:{ NotFoundException -> 0x038d }
        r2.widthFactor = r6;	 Catch:{ NotFoundException -> 0x038d }
        r5 = r5.position;	 Catch:{ NotFoundException -> 0x038d }
        r2.position = r5;	 Catch:{ NotFoundException -> 0x038d }
    L_0x02df:
        r2 = r3 + 1;
        if (r11 == 0) goto L_0x039c;
    L_0x02e3:
        r18.sortChildDrawingOrder();
        r2 = r18.hasFocus();
        if (r2 == 0) goto L_0x0031;
    L_0x02ec:
        r2 = r18.findFocus();
        if (r2 == 0) goto L_0x0391;
    L_0x02f2:
        r0 = r18;
        r2 = r0.infoForAnyChild(r2);	 Catch:{ NotFoundException -> 0x038f }
    L_0x02f8:
        if (r2 == 0) goto L_0x0302;
    L_0x02fa:
        r2 = r2.position;	 Catch:{ NotFoundException -> 0x0394 }
        r0 = r18;
        r3 = r0.mCurItem;	 Catch:{ NotFoundException -> 0x0394 }
        if (r2 == r3) goto L_0x0031;
    L_0x0302:
        r2 = 0;
    L_0x0303:
        r3 = r18.getChildCount();
        if (r2 >= r3) goto L_0x0031;
    L_0x0309:
        r0 = r18;
        r3 = r0.getChildAt(r2);
        r0 = r18;
        r4 = r0.infoForChild(r3);
        if (r4 == 0) goto L_0x0327;
    L_0x0317:
        r4 = r4.position;	 Catch:{ NotFoundException -> 0x0396 }
        r0 = r18;
        r5 = r0.mCurItem;	 Catch:{ NotFoundException -> 0x0396 }
        if (r4 != r5) goto L_0x0327;
    L_0x031f:
        r3 = r3.requestFocus(r9);	 Catch:{ NotFoundException -> 0x0398 }
        if (r3 == 0) goto L_0x0327;
    L_0x0325:
        if (r11 == 0) goto L_0x0031;
    L_0x0327:
        r2 = r2 + 1;
        if (r11 == 0) goto L_0x0303;
    L_0x032b:
        goto L_0x0031;
    L_0x032d:
        r2 = move-exception;
        throw r2;
    L_0x032f:
        r2 = r3 + 1;
        r3 = r2;
        goto L_0x00fa;
    L_0x0334:
        r2 = move-exception;
        throw r2;
    L_0x0336:
        r2 = 0;
        goto L_0x013e;
    L_0x0339:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r8.widthFactor;
        r4 = r4 - r5;
        r5 = r18.getPaddingLeft();
        r5 = (float) r5;
        r0 = (float) r15;
        r16 = r0;
        r5 = r5 / r16;
        r4 = r4 + r5;
        goto L_0x0145;
    L_0x034b:
        r2 = move-exception;
        throw r2;	 Catch:{ NotFoundException -> 0x034d }
    L_0x034d:
        r2 = move-exception;
        throw r2;	 Catch:{ NotFoundException -> 0x034f }
    L_0x034f:
        r2 = move-exception;
        throw r2;
    L_0x0351:
        r2 = 0;
        goto L_0x0196;
    L_0x0354:
        r2 = move-exception;
        throw r2;
    L_0x0356:
        r2 = move-exception;
        throw r2;
    L_0x0358:
        r2 = 0;
        goto L_0x01b8;
    L_0x035b:
        r2 = move-exception;
        throw r2;
    L_0x035d:
        r2 = 0;
        goto L_0x01d4;
    L_0x0360:
        r2 = move-exception;
        throw r2;
    L_0x0362:
        r2 = 0;
        goto L_0x01fe;
    L_0x0365:
        r4 = r18.getPaddingRight();
        r4 = (float) r4;
        r5 = (float) r15;
        r4 = r4 / r5;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = r4 + r5;
        goto L_0x0201;
    L_0x0371:
        r2 = move-exception;
        throw r2;	 Catch:{ NotFoundException -> 0x0373 }
    L_0x0373:
        r2 = move-exception;
        throw r2;	 Catch:{ NotFoundException -> 0x0375 }
    L_0x0375:
        r2 = move-exception;
        throw r2;
    L_0x0377:
        r2 = 0;
        goto L_0x0247;
    L_0x037a:
        r2 = move-exception;
        throw r2;
    L_0x037c:
        r2 = move-exception;
        throw r2;
    L_0x037e:
        r2 = 0;
        goto L_0x0268;
    L_0x0381:
        r2 = move-exception;
        throw r2;
    L_0x0383:
        r2 = 0;
        goto L_0x028b;
    L_0x0386:
        r2 = move-exception;
        throw r2;
    L_0x0388:
        r2 = 0;
        goto L_0x02a0;
    L_0x038b:
        r2 = move-exception;
        throw r2;
    L_0x038d:
        r2 = move-exception;
        throw r2;
    L_0x038f:
        r2 = move-exception;
        throw r2;
    L_0x0391:
        r2 = 0;
        goto L_0x02f8;
    L_0x0394:
        r2 = move-exception;
        throw r2;
    L_0x0396:
        r2 = move-exception;
        throw r2;	 Catch:{ NotFoundException -> 0x0398 }
    L_0x0398:
        r2 = move-exception;
        throw r2;	 Catch:{ NotFoundException -> 0x039a }
    L_0x039a:
        r2 = move-exception;
        throw r2;
    L_0x039c:
        r3 = r2;
        goto L_0x02b4;
    L_0x039f:
        r17 = r3;
        r3 = r6;
        r6 = r5;
        r5 = r17;
        goto L_0x0152;
    L_0x03a7:
        r17 = r2;
        r2 = r6;
        r6 = r5;
        r5 = r3;
        r3 = r17;
        goto L_0x01db;
    L_0x03b0:
        r17 = r2;
        r2 = r3;
        r3 = r17;
        goto L_0x01bb;
    L_0x03b7:
        r17 = r2;
        r2 = r6;
        r6 = r3;
        r3 = r17;
        goto L_0x01db;
    L_0x03bf:
        r17 = r5;
        r5 = r6;
        r6 = r3;
        r3 = r17;
        goto L_0x01db;
    L_0x03c7:
        r17 = r6;
        r6 = r2;
        r2 = r17;
        goto L_0x019d;
    L_0x03ce:
        r8 = r2;
        goto L_0x012d;
    L_0x03d1:
        r2 = r4;
        goto L_0x011e;
    L_0x03d4:
        r9 = r2;
        r10 = r3;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.populate(int):void");
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            super.onSizeChanged(i, i2, i3, i4);
            if (i != i3) {
                recomputeScrollPosition(i, i3, this.mPageMargin, this.mPageMargin);
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[19];
        String str = "\\\tO'6V4|4>_\u000bz\"qW\u000e{f?\\\u0013?%0_\u000b?5$C\u0002m%=R\u0014lf8^\u0017s#<V\tk'%Z\bq";
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
                        i4 = 51;
                        break;
                    case ay.f /*1*/:
                        i4 = 103;
                        break;
                    case ay.n /*2*/:
                        i4 = 31;
                        break;
                    case ay.p /*3*/:
                        i4 = 70;
                        break;
                    default:
                        i4 = 81;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0013\u0013p)q@\n~*=\bG{#7R\u0012s28]\u0000?2>\u0013";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "a\u0002n34@\u0013z\"q\\\u0001y52A\u0002z(qC\u0006x#q_\u000er/%\u0013";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "e\u000ez1\u0001R\u0000z4";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u00137m)3_\u0002r'%Z\u0004?'5R\u0017k##\tG";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "g\u000fzf0C\u0017s/2R\u0013v)?\u0014\u0014?\u00160T\u0002m\u00075R\u0017k##\u0013\u0004w'?T\u0002{f%[\u0002?'5R\u0017k##\u0014\u0014?%>]\u0013z(%@Gh/%[\bj2qP\u0006s*8]\u0000?\u00160T\u0002m\u00075R\u0017k##\u0010\tp28U\u001e['%R4z2\u0012[\u0006q!4WF?\u0003)C\u0002|24WG~\"0C\u0013z4qZ\u0013z+qP\bj(%\tG";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u00137~!4AGv\"k\u0013";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u00137~!4AG|*0@\u0014%f";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u001fGy)$]\u0003%f";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "p\u0006q(>GG~\"5\u0013\u0017~!4AG{#2\\\u0015?08V\u0010?\"$A\u000eq!q_\u0006f)$G";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u0013Z!f";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "e\u000ez1\u0001R\u0000z4";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "R\u0015m)&`\u0004m)=_Gk48V\u0003?2>\u0013\u0001v(5\u0013\u0001p%$@G}'\"V\u0003?)?\u0013\tp(|P\u000fv*5\u0013\u0004j4#V\tkf7\\\u0004j54WGi/4DG";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "e\u000ez1\u0001R\u0000z4";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "@\u0002k\u00059Z\u000b{44]#m'&Z\tx\t#W\u0002m\u0003?R\u0005s#5";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "v\u0015m)#\u0013\u0004w'?T\u000eq!qP\u000fv*5A\u0002qf5A\u0006h/?TGp45V\u0015";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "e\u000ez1\u0001R\u0000z4";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "p\u0006qa%\u0013\u0001v(5\u0013\u0014z2\u0012[\u000es\"#V\t[40D\u000eq!\u001eA\u0003z4\u0014]\u0006}*4W";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    LAYOUT_ATTRS = new int[]{16842931};
                    COMPARATOR = new Comparator() {
                        public int compare(Object obj, Object obj2) {
                            return compare((ItemInfo) obj, (ItemInfo) obj2);
                        }

                        public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
                            return itemInfo.position - itemInfo2.position;
                        }
                    };
                    sInterpolator = new Interpolator() {
                        public float getInterpolation(float f) {
                            float f2 = f - 1.0f;
                            return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
                        }
                    };
                    sPositionComparator = new ViewPositionComparator();
                default:
                    strArr2[i2] = str;
                    str = "\\\tO'6V4|4>_\u000bz\"qW\u000e{f?\\\u0013?%0_\u000b?5$C\u0002m%=R\u0014lf8^\u0017s#<V\tk'%Z\bq";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    private boolean performDrag(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean z3 = false;
        float f3 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = ((float) getScrollX()) + f3;
        int clientWidth = getClientWidth();
        float f4 = ((float) clientWidth) * this.mFirstOffset;
        float f5 = ((float) clientWidth) * this.mLastOffset;
        ItemInfo itemInfo = (ItemInfo) this.mItems.get(0);
        ItemInfo itemInfo2 = (ItemInfo) this.mItems.get(this.mItems.size() - 1);
        if (itemInfo.position != 0) {
            f4 = itemInfo.offset * ((float) clientWidth);
            z = false;
        } else {
            z = true;
        }
        if (itemInfo2.position != this.mAdapter.getCount() - 1) {
            f2 = itemInfo2.offset * ((float) clientWidth);
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                z3 = this.mLeftEdge.onPull(Math.abs(f4 - scrollX) / ((float) clientWidth));
            }
            try {
            } catch (NotFoundException e) {
                throw e;
            } catch (NotFoundException e2) {
                throw e2;
            }
            if (a) {
                z = z3;
            } else {
                z = z3;
                this.mLastMotionX += f4 - ((float) ((int) f4));
                scrollTo((int) f4, getScrollY());
                pageScrolled((int) f4);
                return z;
            }
        }
        f4 = scrollX;
        z = false;
        if (f4 > f2) {
            if (z2) {
                z = this.mRightEdge.onPull(Math.abs(f4 - f2) / ((float) clientWidth));
            }
            f4 = f2;
        }
        this.mLastMotionX += f4 - ((float) ((int) f4));
        scrollTo((int) f4, getScrollY());
        pageScrolled((int) f4);
        return z;
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        Rect rect2;
        boolean z = a;
        if (rect == null) {
            rect2 = new Rect();
        } else {
            rect2 = rect;
        }
        if (view == null) {
            try {
                rect2.set(0, 0, 0, 0);
                return rect2;
            } catch (NotFoundException e) {
                throw e;
            }
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
            if (z) {
                break;
            }
        }
        return rect2;
    }

    private void setScrollingCacheEnabled(boolean z) {
        try {
            if (this.mScrollingCacheEnabled != z) {
                this.mScrollingCacheEnabled = z;
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    boolean pageLeft() {
        try {
            if (this.mCurItem <= 0) {
                return false;
            }
            setCurrentItem(this.mCurItem - 1, true);
            return true;
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        boolean z = a;
        boolean z2 = false;
        try {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            switch (keyEvent.getKeyCode()) {
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    z2 = arrowScroll(17);
                    if (!z) {
                        return z2;
                    }
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    break;
                default:
                    return false;
            }
            z2 = arrowScroll(66);
            if (!z) {
                return z2;
            }
            try {
                if (VERSION.SDK_INT < 11) {
                    return z2;
                }
                if (KeyEventCompat.hasNoModifiers(keyEvent)) {
                    z2 = arrowScroll(2);
                    if (!z) {
                        return z2;
                    }
                }
                try {
                    return KeyEventCompat.hasModifiers(keyEvent, 1) ? arrowScroll(1) : z2;
                } catch (NotFoundException e) {
                    throw e;
                }
            } catch (NotFoundException e2) {
                throw e2;
            }
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    boolean pageRight() {
        try {
            if (this.mAdapter != null) {
                if (this.mCurItem < this.mAdapter.getCount() - 1) {
                    setCurrentItem(this.mCurItem + 1, true);
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    private void removeNonDecorViews() {
        boolean z = a;
        int i = 0;
        while (i < getChildCount()) {
            try {
                if (!((LayoutParams) getChildAt(i).getLayoutParams()).isDecor) {
                    removeViewAt(i);
                    i--;
                }
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            } catch (NotFoundException e) {
                throw e;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        try {
            savedState.position = this.mCurItem;
            if (this.mAdapter != null) {
                savedState.adapterState = this.mAdapter.saveState();
            }
            return savedState;
        } catch (NotFoundException e) {
            throw e;
        }
    }

    void dataSetChanged() {
        boolean z = a;
        int count = this.mAdapter.getCount();
        try {
            boolean z2;
            boolean z3;
            int i;
            boolean z4;
            int i2;
            ItemInfo itemInfo;
            int itemPosition;
            boolean z5;
            int i3;
            boolean z6;
            int i4;
            boolean z7;
            int i5;
            LayoutParams layoutParams;
            this.mExpectedAdapterCount = count;
            if (this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1) {
                if (this.mItems.size() < count) {
                    z2 = true;
                    z3 = false;
                    i = this.mCurItem;
                    z4 = z2;
                    i2 = 0;
                    while (i2 < this.mItems.size()) {
                        itemInfo = (ItemInfo) this.mItems.get(i2);
                        itemPosition = this.mAdapter.getItemPosition(itemInfo.object);
                        if (itemPosition == -1 || z) {
                            if (itemPosition != -2) {
                                try {
                                    this.mItems.remove(i2);
                                    i2--;
                                    if (!z3) {
                                        this.mAdapter.startUpdate((ViewGroup) this);
                                        z3 = true;
                                    }
                                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
                                    if (this.mCurItem == itemInfo.position) {
                                        i = Math.max(0, Math.min(this.mCurItem, count - 1));
                                        if (z) {
                                            z4 = true;
                                            z5 = z3;
                                            i3 = i2;
                                            i2 = i;
                                            z6 = z5;
                                        }
                                    }
                                    i4 = i2;
                                    z7 = z3;
                                    i3 = i;
                                    z6 = true;
                                } catch (NotFoundException e) {
                                    throw e;
                                }
                            }
                            i5 = i2;
                            i2 = i;
                            z6 = z3;
                            i3 = i5;
                            try {
                                if (itemInfo.position == itemPosition) {
                                    if (itemInfo.position == this.mCurItem) {
                                        i2 = itemPosition;
                                    }
                                    itemInfo.position = itemPosition;
                                    i4 = i3;
                                    i3 = i2;
                                    z7 = z6;
                                    z6 = true;
                                } else {
                                    i4 = i3;
                                    i3 = i2;
                                    z7 = z6;
                                    z6 = z4;
                                }
                            } catch (NotFoundException e2) {
                                throw e2;
                            }
                        }
                        i4 = i2;
                        z7 = z3;
                        i3 = i;
                        z6 = z4;
                        i4++;
                        if (z) {
                            break;
                        }
                        z4 = z6;
                        i = i3;
                        z3 = z7;
                        i2 = i4;
                    }
                    z7 = z3;
                    i3 = i;
                    z6 = z4;
                    if (z7) {
                        try {
                            this.mAdapter.finishUpdate((ViewGroup) this);
                        } catch (NotFoundException e22) {
                            throw e22;
                        }
                    }
                    Collections.sort(this.mItems, COMPARATOR);
                    if (!z6) {
                        i = getChildCount();
                        i2 = 0;
                        while (i2 < i) {
                            layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
                            try {
                                if (!layoutParams.isDecor) {
                                    layoutParams.widthFactor = 0.0f;
                                }
                                i4 = i2 + 1;
                                if (z) {
                                    break;
                                }
                                i2 = i4;
                            } catch (NotFoundException e222) {
                                throw e222;
                            }
                        }
                        setCurrentItemInternal(i3, false, true);
                        requestLayout();
                    }
                }
            }
            z2 = false;
            z3 = false;
            i = this.mCurItem;
            z4 = z2;
            i2 = 0;
            while (i2 < this.mItems.size()) {
                itemInfo = (ItemInfo) this.mItems.get(i2);
                itemPosition = this.mAdapter.getItemPosition(itemInfo.object);
                if (itemPosition == -1) {
                }
                if (itemPosition != -2) {
                    i5 = i2;
                    i2 = i;
                    z6 = z3;
                    i3 = i5;
                } else {
                    this.mItems.remove(i2);
                    i2--;
                    if (z3) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
                    if (this.mCurItem == itemInfo.position) {
                        i = Math.max(0, Math.min(this.mCurItem, count - 1));
                        if (z) {
                            z4 = true;
                            z5 = z3;
                            i3 = i2;
                            i2 = i;
                            z6 = z5;
                        }
                    }
                    i4 = i2;
                    z7 = z3;
                    i3 = i;
                    z6 = true;
                    i4++;
                    if (z) {
                        z4 = z6;
                        i = i3;
                        z3 = z7;
                        i2 = i4;
                    } else {
                        break;
                        if (z7) {
                            this.mAdapter.finishUpdate((ViewGroup) this);
                        }
                        Collections.sort(this.mItems, COMPARATOR);
                        if (!z6) {
                            i = getChildCount();
                            i2 = 0;
                            while (i2 < i) {
                                layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
                                if (layoutParams.isDecor) {
                                    layoutParams.widthFactor = 0.0f;
                                }
                                i4 = i2 + 1;
                                if (z) {
                                    break;
                                    setCurrentItemInternal(i3, false, true);
                                    requestLayout();
                                }
                                i2 = i4;
                            }
                            setCurrentItemInternal(i3, false, true);
                            requestLayout();
                        }
                    }
                }
                if (itemInfo.position == itemPosition) {
                    i4 = i3;
                    i3 = i2;
                    z7 = z6;
                    z6 = z4;
                } else {
                    if (itemInfo.position == this.mCurItem) {
                        i2 = itemPosition;
                    }
                    itemInfo.position = itemPosition;
                    i4 = i3;
                    i3 = i2;
                    z7 = z6;
                    z6 = true;
                }
                i4++;
                if (z) {
                    break;
                    if (z7) {
                        this.mAdapter.finishUpdate((ViewGroup) this);
                    }
                    Collections.sort(this.mItems, COMPARATOR);
                    if (!z6) {
                        i = getChildCount();
                        i2 = 0;
                        while (i2 < i) {
                            layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
                            if (layoutParams.isDecor) {
                                layoutParams.widthFactor = 0.0f;
                            }
                            i4 = i2 + 1;
                            if (z) {
                                break;
                                setCurrentItemInternal(i3, false, true);
                                requestLayout();
                            }
                            i2 = i4;
                        }
                        setCurrentItemInternal(i3, false, true);
                        requestLayout();
                    }
                }
                z4 = z6;
                i = i3;
                z3 = z7;
                i2 = i4;
            }
            z7 = z3;
            i3 = i;
            z6 = z4;
            if (z7) {
                this.mAdapter.finishUpdate((ViewGroup) this);
            }
            Collections.sort(this.mItems, COMPARATOR);
            if (!z6) {
                i = getChildCount();
                i2 = 0;
                while (i2 < i) {
                    layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
                    if (layoutParams.isDecor) {
                        layoutParams.widthFactor = 0.0f;
                    }
                    i4 = i2 + 1;
                    if (z) {
                        i2 = i4;
                    } else {
                        break;
                        setCurrentItemInternal(i3, false, true);
                        requestLayout();
                    }
                }
                setCurrentItemInternal(i3, false, true);
                requestLayout();
            }
        } catch (NotFoundException e2222) {
            throw e2222;
        } catch (NotFoundException e22222) {
            throw e22222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    android.support.v4.view.ViewPager.ItemInfo addNewItem(int r3, int r4) {
        /*
        r2_this = this;
        r0 = new android.support.v4.view.ViewPager$ItemInfo;
        r0.<init>();
        r0.position = r3;	 Catch:{ NotFoundException -> 0x0030 }
        r1 = r2.mAdapter;	 Catch:{ NotFoundException -> 0x0030 }
        r1 = r1.instantiateItem(r2, r3);	 Catch:{ NotFoundException -> 0x0030 }
        r0.object = r1;	 Catch:{ NotFoundException -> 0x0030 }
        r1 = r2.mAdapter;	 Catch:{ NotFoundException -> 0x0030 }
        r1 = r1.getPageWidth(r3);	 Catch:{ NotFoundException -> 0x0030 }
        r0.widthFactor = r1;	 Catch:{ NotFoundException -> 0x0030 }
        if (r4 < 0) goto L_0x0021;
    L_0x0019:
        r1 = r2.mItems;	 Catch:{ NotFoundException -> 0x0032 }
        r1 = r1.size();	 Catch:{ NotFoundException -> 0x0032 }
        if (r4 < r1) goto L_0x002a;
    L_0x0021:
        r1 = r2.mItems;	 Catch:{ NotFoundException -> 0x0034 }
        r1.add(r0);	 Catch:{ NotFoundException -> 0x0034 }
        r1 = a;	 Catch:{ NotFoundException -> 0x0034 }
        if (r1 == 0) goto L_0x002f;
    L_0x002a:
        r1 = r2.mItems;	 Catch:{ NotFoundException -> 0x0034 }
        r1.add(r4, r0);	 Catch:{ NotFoundException -> 0x0034 }
    L_0x002f:
        return r0;
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.addNewItem(int, int):android.support.v4.view.ViewPager$ItemInfo");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r15) {
        /*
        r14_this = this;
        r3 = -1;
        r13 = 0;
        r0 = 1;
        r6 = 0;
        r7 = a;
        r1 = r15.getAction();
        r1 = r1 & 255;
        r2 = 3;
        if (r1 == r2) goto L_0x0011;
    L_0x000f:
        if (r1 != r0) goto L_0x002a;
    L_0x0011:
        r0 = 0;
        r14.mIsBeingDragged = r0;	 Catch:{ NotFoundException -> 0x0028 }
        r0 = 0;
        r14.mIsUnableToDrag = r0;	 Catch:{ NotFoundException -> 0x0028 }
        r0 = -1;
        r14.mActivePointerId = r0;	 Catch:{ NotFoundException -> 0x0028 }
        r0 = r14.mVelocityTracker;	 Catch:{ NotFoundException -> 0x0028 }
        if (r0 == 0) goto L_0x0026;
    L_0x001e:
        r0 = r14.mVelocityTracker;	 Catch:{ NotFoundException -> 0x0028 }
        r0.recycle();	 Catch:{ NotFoundException -> 0x0028 }
        r0 = 0;
        r14.mVelocityTracker = r0;	 Catch:{ NotFoundException -> 0x0028 }
    L_0x0026:
        r0 = r6;
    L_0x0027:
        return r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        if (r1 == 0) goto L_0x003a;
    L_0x002c:
        r2 = r14.mIsBeingDragged;	 Catch:{ NotFoundException -> 0x0036 }
        if (r2 != 0) goto L_0x0027;
    L_0x0030:
        r0 = r14.mIsUnableToDrag;	 Catch:{ NotFoundException -> 0x0038 }
        if (r0 == 0) goto L_0x003a;
    L_0x0034:
        r0 = r6;
        goto L_0x0027;
    L_0x0036:
        r0 = move-exception;
        throw r0;
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        switch(r1) {
            case 0: goto L_0x00dc;
            case 2: goto L_0x004f;
            case 6: goto L_0x0136;
            default: goto L_0x003d;
        };
    L_0x003d:
        r0 = r14.mVelocityTracker;	 Catch:{ NotFoundException -> 0x015b }
        if (r0 != 0) goto L_0x0047;
    L_0x0041:
        r0 = android.view.VelocityTracker.obtain();	 Catch:{ NotFoundException -> 0x015b }
        r14.mVelocityTracker = r0;	 Catch:{ NotFoundException -> 0x015b }
    L_0x0047:
        r0 = r14.mVelocityTracker;
        r0.addMovement(r15);
        r0 = r14.mIsBeingDragged;
        goto L_0x0027;
    L_0x004f:
        r0 = r14.mActivePointerId;
        if (r0 != r3) goto L_0x0055;
    L_0x0053:
        if (r7 == 0) goto L_0x003d;
    L_0x0055:
        r0 = android.support.v4.view.MotionEventCompat.findPointerIndex(r15, r0);
        r8 = android.support.v4.view.MotionEventCompat.getX(r15, r0);
        r1 = r14.mLastMotionX;
        r9 = r8 - r1;
        r10 = java.lang.Math.abs(r9);
        r11 = android.support.v4.view.MotionEventCompat.getY(r15, r0);
        r0 = r14.mInitialMotionY;
        r0 = r11 - r0;
        r12 = java.lang.Math.abs(r0);
        r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1));
        if (r0 == 0) goto L_0x0096;
    L_0x0075:
        r0 = r14.mLastMotionX;	 Catch:{ NotFoundException -> 0x0092 }
        r0 = r14.isGutterDrag(r0, r9);	 Catch:{ NotFoundException -> 0x0092 }
        if (r0 != 0) goto L_0x0096;
    L_0x007d:
        r2 = 0;
        r3 = (int) r9;
        r4 = (int) r8;
        r5 = (int) r11;
        r0 = r14;
        r1 = r14;
        r0 = r0.canScroll(r1, r2, r3, r4, r5);	 Catch:{ NotFoundException -> 0x0094 }
        if (r0 == 0) goto L_0x0096;
    L_0x0089:
        r14.mLastMotionX = r8;	 Catch:{ NotFoundException -> 0x0094 }
        r14.mLastMotionY = r11;	 Catch:{ NotFoundException -> 0x0094 }
        r0 = 1;
        r14.mIsUnableToDrag = r0;	 Catch:{ NotFoundException -> 0x0094 }
        r0 = r6;
        goto L_0x0027;
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r0 = r14.mTouchSlop;	 Catch:{ NotFoundException -> 0x013d }
        r0 = (float) r0;
        r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x00c3;
    L_0x009d:
        r0 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0 = r0 * r10;
        r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1));
        if (r0 <= 0) goto L_0x00c3;
    L_0x00a4:
        r0 = 1;
        r14.mIsBeingDragged = r0;	 Catch:{ NotFoundException -> 0x0141 }
        r0 = 1;
        r14.requestParentDisallowInterceptTouchEvent(r0);	 Catch:{ NotFoundException -> 0x0141 }
        r0 = 1;
        r14.setScrollState(r0);	 Catch:{ NotFoundException -> 0x0141 }
        r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1));
        if (r0 <= 0) goto L_0x0143;
    L_0x00b3:
        r0 = r14.mInitialMotionX;	 Catch:{ NotFoundException -> 0x0141 }
        r1 = r14.mTouchSlop;	 Catch:{ NotFoundException -> 0x0141 }
        r1 = (float) r1;
        r0 = r0 + r1;
    L_0x00b9:
        r14.mLastMotionX = r0;	 Catch:{ NotFoundException -> 0x014b }
        r14.mLastMotionY = r11;	 Catch:{ NotFoundException -> 0x014b }
        r0 = 1;
        r14.setScrollingCacheEnabled(r0);	 Catch:{ NotFoundException -> 0x014b }
        if (r7 == 0) goto L_0x00cd;
    L_0x00c3:
        r0 = r14.mTouchSlop;	 Catch:{ NotFoundException -> 0x014d }
        r0 = (float) r0;	 Catch:{ NotFoundException -> 0x014d }
        r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x00cd;
    L_0x00ca:
        r0 = 1;
        r14.mIsUnableToDrag = r0;	 Catch:{ NotFoundException -> 0x014d }
    L_0x00cd:
        r0 = r14.mIsBeingDragged;	 Catch:{ NotFoundException -> 0x014f }
        if (r0 == 0) goto L_0x003d;
    L_0x00d1:
        r0 = r14.performDrag(r8);	 Catch:{ NotFoundException -> 0x0151 }
        if (r0 == 0) goto L_0x003d;
    L_0x00d7:
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r14);	 Catch:{ NotFoundException -> 0x0153 }
        if (r7 == 0) goto L_0x003d;
    L_0x00dc:
        r0 = r15.getX();	 Catch:{ NotFoundException -> 0x0155 }
        r14.mInitialMotionX = r0;	 Catch:{ NotFoundException -> 0x0155 }
        r14.mLastMotionX = r0;	 Catch:{ NotFoundException -> 0x0155 }
        r0 = r15.getY();	 Catch:{ NotFoundException -> 0x0155 }
        r14.mInitialMotionY = r0;	 Catch:{ NotFoundException -> 0x0155 }
        r14.mLastMotionY = r0;	 Catch:{ NotFoundException -> 0x0155 }
        r0 = 0;
        r0 = android.support.v4.view.MotionEventCompat.getPointerId(r15, r0);	 Catch:{ NotFoundException -> 0x0155 }
        r14.mActivePointerId = r0;	 Catch:{ NotFoundException -> 0x0155 }
        r0 = 0;
        r14.mIsUnableToDrag = r0;	 Catch:{ NotFoundException -> 0x0155 }
        r0 = r14.mScroller;	 Catch:{ NotFoundException -> 0x0155 }
        r0.computeScrollOffset();	 Catch:{ NotFoundException -> 0x0155 }
        r0 = r14.mScrollState;	 Catch:{ NotFoundException -> 0x0155 }
        r1 = 2;
        if (r0 != r1) goto L_0x012d;
    L_0x0100:
        r0 = r14.mScroller;	 Catch:{ NotFoundException -> 0x0157 }
        r0 = r0.getFinalX();	 Catch:{ NotFoundException -> 0x0157 }
        r1 = r14.mScroller;	 Catch:{ NotFoundException -> 0x0157 }
        r1 = r1.getCurrX();	 Catch:{ NotFoundException -> 0x0157 }
        r0 = r0 - r1;
        r0 = java.lang.Math.abs(r0);	 Catch:{ NotFoundException -> 0x0157 }
        r1 = r14.mCloseEnough;	 Catch:{ NotFoundException -> 0x0157 }
        if (r0 <= r1) goto L_0x012d;
    L_0x0115:
        r0 = r14.mScroller;	 Catch:{ NotFoundException -> 0x0159 }
        r0.abortAnimation();	 Catch:{ NotFoundException -> 0x0159 }
        r0 = 0;
        r14.mPopulatePending = r0;	 Catch:{ NotFoundException -> 0x0159 }
        r14.populate();	 Catch:{ NotFoundException -> 0x0159 }
        r0 = 1;
        r14.mIsBeingDragged = r0;	 Catch:{ NotFoundException -> 0x0159 }
        r0 = 1;
        r14.requestParentDisallowInterceptTouchEvent(r0);	 Catch:{ NotFoundException -> 0x0159 }
        r0 = 1;
        r14.setScrollState(r0);	 Catch:{ NotFoundException -> 0x0159 }
        if (r7 == 0) goto L_0x003d;
    L_0x012d:
        r0 = 0;
        r14.completeScroll(r0);	 Catch:{ NotFoundException -> 0x013b }
        r0 = 0;
        r14.mIsBeingDragged = r0;	 Catch:{ NotFoundException -> 0x013b }
        if (r7 == 0) goto L_0x003d;
    L_0x0136:
        r14.onSecondaryPointerUp(r15);	 Catch:{ NotFoundException -> 0x013b }
        goto L_0x003d;
    L_0x013b:
        r0 = move-exception;
        throw r0;
    L_0x013d:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x013f }
    L_0x013f:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0141 }
    L_0x0141:
        r0 = move-exception;
        throw r0;
    L_0x0143:
        r0 = r14.mInitialMotionX;
        r1 = r14.mTouchSlop;
        r1 = (float) r1;
        r0 = r0 - r1;
        goto L_0x00b9;
    L_0x014b:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x014d }
    L_0x014d:
        r0 = move-exception;
        throw r0;
    L_0x014f:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0151 }
    L_0x0151:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0153 }
    L_0x0153:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0155 }
    L_0x0155:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0157 }
    L_0x0157:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0159 }
    L_0x0159:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x013b }
    L_0x015b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isGutterDrag(float r4, float r5) {
        /*
        r3_this = this;
        r2 = 0;
        r0 = r3.mGutterSize;	 Catch:{ NotFoundException -> 0x001e }
        r0 = (float) r0;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x000c;
    L_0x0008:
        r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r0 > 0) goto L_0x001c;
    L_0x000c:
        r0 = r3.getWidth();	 Catch:{ NotFoundException -> 0x0022 }
        r1 = r3.mGutterSize;	 Catch:{ NotFoundException -> 0x0022 }
        r0 = r0 - r1;
        r0 = (float) r0;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0026;
    L_0x0018:
        r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x0026;
    L_0x001c:
        r0 = 1;
    L_0x001d:
        return r0;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = 0;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.isGutterDrag(float, float):boolean");
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() {
            final ViewPager this$0;

            public void run() {
                ViewPager.access$000(this.this$0, 0);
                this.this$0.populate();
            }

            {
                this.this$0 = r1;
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    void populate() {
        populate(this.mCurItem);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void setCurrentItemInternal(int r7, boolean r8, boolean r9, int r10) {
        /*
        r6_this = this;
        r4 = 1;
        r2 = 0;
        r5 = a;
        r0 = r6.mAdapter;	 Catch:{ NotFoundException -> 0x0015 }
        if (r0 == 0) goto L_0x0010;
    L_0x0008:
        r0 = r6.mAdapter;	 Catch:{ NotFoundException -> 0x0017 }
        r0 = r0.getCount();	 Catch:{ NotFoundException -> 0x0017 }
        if (r0 > 0) goto L_0x0019;
    L_0x0010:
        r0 = 0;
        r6.setScrollingCacheEnabled(r0);	 Catch:{ NotFoundException -> 0x0017 }
    L_0x0014:
        return;
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        if (r9 != 0) goto L_0x0030;
    L_0x001b:
        r0 = r6.mCurItem;	 Catch:{ NotFoundException -> 0x002e }
        if (r0 != r7) goto L_0x0030;
    L_0x001f:
        r0 = r6.mItems;	 Catch:{ NotFoundException -> 0x002c }
        r0 = r0.size();	 Catch:{ NotFoundException -> 0x002c }
        if (r0 == 0) goto L_0x0030;
    L_0x0027:
        r0 = 0;
        r6.setScrollingCacheEnabled(r0);	 Catch:{ NotFoundException -> 0x002c }
        goto L_0x0014;
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x002c }
    L_0x0030:
        if (r7 >= 0) goto L_0x00ae;
    L_0x0032:
        if (r5 == 0) goto L_0x00ac;
    L_0x0034:
        r0 = r2;
    L_0x0035:
        r1 = r6.mAdapter;	 Catch:{ NotFoundException -> 0x009a }
        r1 = r1.getCount();	 Catch:{ NotFoundException -> 0x009a }
        if (r0 < r1) goto L_0x00aa;
    L_0x003d:
        r0 = r6.mAdapter;
        r0 = r0.getCount();
        r0 = r0 + -1;
        r1 = r0;
    L_0x0046:
        r0 = r6.mOffscreenPageLimit;
        r3 = r6.mCurItem;	 Catch:{ NotFoundException -> 0x009c }
        r3 = r3 + r0;
        if (r1 > r3) goto L_0x0053;
    L_0x004d:
        r3 = r6.mCurItem;	 Catch:{ NotFoundException -> 0x009c }
        r0 = r3 - r0;
        if (r1 >= r0) goto L_0x006a;
    L_0x0053:
        r3 = r2;
    L_0x0054:
        r0 = r6.mItems;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x006a;
    L_0x005c:
        r0 = r6.mItems;
        r0 = r0.get(r3);
        r0 = (android.support.v4.view.ViewPager.ItemInfo) r0;
        r0.scrolling = r4;
        r0 = r3 + 1;
        if (r5 == 0) goto L_0x00a8;
    L_0x006a:
        r0 = r6.mCurItem;	 Catch:{ NotFoundException -> 0x009e }
        if (r0 == r1) goto L_0x006f;
    L_0x006e:
        r2 = r4;
    L_0x006f:
        r0 = r6.mFirstLayout;	 Catch:{ NotFoundException -> 0x00a0 }
        if (r0 == 0) goto L_0x0090;
    L_0x0073:
        r6.mCurItem = r1;	 Catch:{ NotFoundException -> 0x00a2 }
        if (r2 == 0) goto L_0x0080;
    L_0x0077:
        r0 = r6.mOnPageChangeListener;	 Catch:{ NotFoundException -> 0x00a4 }
        if (r0 == 0) goto L_0x0080;
    L_0x007b:
        r0 = r6.mOnPageChangeListener;	 Catch:{ NotFoundException -> 0x00a4 }
        r0.onPageSelected(r1);	 Catch:{ NotFoundException -> 0x00a4 }
    L_0x0080:
        if (r2 == 0) goto L_0x008b;
    L_0x0082:
        r0 = r6.mInternalPageChangeListener;	 Catch:{ NotFoundException -> 0x00a6 }
        if (r0 == 0) goto L_0x008b;
    L_0x0086:
        r0 = r6.mInternalPageChangeListener;	 Catch:{ NotFoundException -> 0x00a6 }
        r0.onPageSelected(r1);	 Catch:{ NotFoundException -> 0x00a6 }
    L_0x008b:
        r6.requestLayout();	 Catch:{ NotFoundException -> 0x0098 }
        if (r5 == 0) goto L_0x0014;
    L_0x0090:
        r6.populate(r1);	 Catch:{ NotFoundException -> 0x0098 }
        r6.scrollToItem(r1, r8, r10, r2);	 Catch:{ NotFoundException -> 0x0098 }
        goto L_0x0014;
    L_0x0098:
        r0 = move-exception;
        throw r0;
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r0 = move-exception;
        throw r0;
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x00a4 }
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r3 = r0;
        goto L_0x0054;
    L_0x00aa:
        r1 = r0;
        goto L_0x0046;
    L_0x00ac:
        r1 = r2;
        goto L_0x0046;
    L_0x00ae:
        r0 = r7;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.setCurrentItemInternal(int, boolean, boolean, int):void");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean z = a;
        try {
            if (accessibilityEvent.getEventType() == 4096) {
                return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            }
            int childCount = getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    ItemInfo infoForChild = infoForChild(childAt);
                    if (infoForChild != null) {
                        try {
                            if (infoForChild.position == this.mCurItem) {
                                if (childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                                    return true;
                                }
                            }
                        } catch (NotFoundException e) {
                            throw e;
                        } catch (NotFoundException e2) {
                            throw e2;
                        }
                    }
                }
                i++;
                if (z) {
                    return false;
                }
            }
            return false;
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null) {
            try {
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            } catch (NotFoundException e) {
                throw e;
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                try {
                    super.onRestoreInstanceState(savedState.getSuperState());
                    if (this.mAdapter != null) {
                        this.mAdapter.restoreState(savedState.adapterState, savedState.loader);
                        setCurrentItemInternal(savedState.position, false, true);
                        if (!a) {
                            return;
                        }
                    }
                    this.mRestoredCurItem = savedState.position;
                    this.mRestoredAdapterState = savedState.adapterState;
                    this.mRestoredClassLoader = savedState.loader;
                    return;
                } catch (NotFoundException e) {
                    throw e;
                } catch (NotFoundException e2) {
                    throw e2;
                }
            }
            super.onRestoreInstanceState(parcelable);
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    private void completeScroll(boolean z) {
        boolean z2 = a;
        try {
            boolean z3;
            int scrollX;
            if (this.mScrollState == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                setScrollingCacheEnabled(false);
                this.mScroller.abortAnimation();
                scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    try {
                        scrollTo(currX, currY);
                    } catch (NotFoundException e) {
                        throw e;
                    }
                }
            }
            this.mPopulatePending = false;
            scrollX = 0;
            boolean z4 = z3;
            while (scrollX < this.mItems.size()) {
                ItemInfo itemInfo = (ItemInfo) this.mItems.get(scrollX);
                if (itemInfo.scrolling) {
                    itemInfo.scrolling = false;
                    z4 = true;
                }
                int i = scrollX + 1;
                if (z2) {
                    break;
                }
                scrollX = i;
            }
            if (z4) {
                try {
                    if (z) {
                        ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
                        if (!z2) {
                            return;
                        }
                    }
                    this.mEndScrollRunnable.run();
                } catch (NotFoundException e2) {
                    throw e2;
                }
            }
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    public void addTouchables(ArrayList arrayList) {
        boolean z = a;
        int i = 0;
        while (i < getChildCount()) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                ItemInfo infoForChild = infoForChild(childAt);
                if (infoForChild != null) {
                    try {
                        if (infoForChild.position == this.mCurItem) {
                            childAt.addTouchables(arrayList);
                        }
                    } catch (NotFoundException e) {
                        throw e;
                    }
                }
            }
            i++;
            if (z) {
                return;
            }
        }
    }

    private void endDrag() {
        try {
            this.mIsBeingDragged = false;
            this.mIsUnableToDrag = false;
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(z[4], z[3] + i + z[2] + 1);
            i = 1;
        }
        try {
            if (i != this.mOffscreenPageLimit) {
                this.mOffscreenPageLimit = i;
                populate();
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean arrowScroll(int r12) {
        /*
        r11_this = this;
        r4 = 0;
        r10 = 66;
        r9 = 17;
        r3 = 1;
        r2 = 0;
        r6 = a;
        r5 = r11.findFocus();
        if (r5 != r11) goto L_0x007d;
    L_0x000f:
        r0 = r4;
    L_0x0010:
        r1 = android.view.FocusFinder.getInstance();
        r4 = r1.findNextFocus(r11, r0, r12);
        if (r4 == 0) goto L_0x00f9;
    L_0x001a:
        if (r4 == r0) goto L_0x00f9;
    L_0x001c:
        if (r12 != r9) goto L_0x00f6;
    L_0x001e:
        r1 = r11.mTempRect;
        r1 = r11.getChildRectInPagerCoordinates(r1, r4);
        r1 = r1.left;
        r2 = r11.mTempRect;
        r2 = r11.getChildRectInPagerCoordinates(r2, r0);
        r2 = r2.left;
        if (r0 == 0) goto L_0x0038;
    L_0x0030:
        if (r1 < r2) goto L_0x0038;
    L_0x0032:
        r1 = r11.pageLeft();
        if (r6 == 0) goto L_0x003c;
    L_0x0038:
        r1 = r4.requestFocus();
    L_0x003c:
        if (r6 == 0) goto L_0x00f3;
    L_0x003e:
        if (r12 != r10) goto L_0x00f1;
    L_0x0040:
        r1 = r11.mTempRect;
        r1 = r11.getChildRectInPagerCoordinates(r1, r4);
        r1 = r1.left;
        r2 = r11.mTempRect;
        r2 = r11.getChildRectInPagerCoordinates(r2, r0);
        r2 = r2.left;
        if (r0 == 0) goto L_0x005a;
    L_0x0052:
        if (r1 > r2) goto L_0x005a;
    L_0x0054:
        r0 = r11.pageRight();
        if (r6 == 0) goto L_0x005e;
    L_0x005a:
        r0 = r4.requestFocus();
    L_0x005e:
        if (r6 == 0) goto L_0x0073;
    L_0x0060:
        if (r12 == r9) goto L_0x0064;
    L_0x0062:
        if (r12 != r3) goto L_0x006a;
    L_0x0064:
        r0 = r11.pageLeft();
        if (r6 == 0) goto L_0x0073;
    L_0x006a:
        if (r12 == r10) goto L_0x006f;
    L_0x006c:
        r1 = 2;
        if (r12 != r1) goto L_0x0073;
    L_0x006f:
        r0 = r11.pageRight();
    L_0x0073:
        if (r0 == 0) goto L_0x007c;
    L_0x0075:
        r1 = android.view.SoundEffectConstants.getContantForFocusDirection(r12);	 Catch:{ NotFoundException -> 0x00ef }
        r11.playSoundEffect(r1);	 Catch:{ NotFoundException -> 0x00ef }
    L_0x007c:
        return r0;
    L_0x007d:
        if (r5 == 0) goto L_0x00fc;
    L_0x007f:
        r0 = r5.getParent();
        r1 = r2;
    L_0x0084:
        r7 = r0 instanceof android.view.ViewGroup;
        if (r7 == 0) goto L_0x0093;
    L_0x0088:
        if (r0 != r11) goto L_0x008d;
    L_0x008a:
        if (r6 == 0) goto L_0x00ff;
    L_0x008c:
        r1 = r3;
    L_0x008d:
        r0 = r0.getParent();
        if (r6 == 0) goto L_0x0084;
    L_0x0093:
        if (r1 != 0) goto L_0x00fc;
    L_0x0095:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r5.getClass();
        r0 = r0.getSimpleName();
        r1.append(r0);
        r0 = r5.getParent();
    L_0x00a9:
        r5 = r0 instanceof android.view.ViewGroup;
        if (r5 == 0) goto L_0x00c8;
    L_0x00ad:
        r5 = z;
        r7 = 11;
        r5 = r5[r7];
        r5 = r1.append(r5);
        r7 = r0.getClass();
        r7 = r7.getSimpleName();
        r5.append(r7);
        r0 = r0.getParent();
        if (r6 == 0) goto L_0x00a9;
    L_0x00c8:
        r0 = z;
        r5 = 12;
        r0 = r0[r5];
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r7 = z;
        r8 = 13;
        r7 = r7[r8];
        r5 = r5.append(r7);
        r1 = r1.toString();
        r1 = r5.append(r1);
        r1 = r1.toString();
        android.util.Log.e(r0, r1);
        r0 = r4;
        goto L_0x0010;
    L_0x00ef:
        r0 = move-exception;
        throw r0;
    L_0x00f1:
        r0 = r1;
        goto L_0x0073;
    L_0x00f3:
        r0 = r1;
        goto L_0x0073;
    L_0x00f6:
        r1 = r2;
        goto L_0x003e;
    L_0x00f9:
        r0 = r2;
        goto L_0x0060;
    L_0x00fc:
        r0 = r5;
        goto L_0x0010;
    L_0x00ff:
        r1 = r3;
        goto L_0x0093;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.arrowScroll(int):boolean");
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
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    private ItemInfo infoForCurrentScrollPosition() {
        boolean z = a;
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            try {
                float scrollX = ((float) getScrollX()) / ((float) clientWidth);
            } catch (NotFoundException e) {
                throw e;
            }
        }
        scrollX = 0.0f;
        if (clientWidth > 0) {
            try {
                float f = ((float) this.mPageMargin) / ((float) clientWidth);
            } catch (NotFoundException e2) {
                throw e2;
            }
        }
        f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        ItemInfo itemInfo = null;
        while (i2 < this.mItems.size()) {
            ItemInfo itemInfo2;
            int i3;
            ItemInfo itemInfo3;
            int i4;
            float f4;
            ItemInfo itemInfo4 = (ItemInfo) this.mItems.get(i2);
            if (obj == null) {
                try {
                } catch (NotFoundException e22) {
                    throw e22;
                }
                if (itemInfo4.position != i + 1) {
                    itemInfo4 = this.mTempItem;
                    itemInfo4.offset = (f2 + f3) + f;
                    itemInfo4.position = i + 1;
                    itemInfo4.widthFactor = this.mAdapter.getPageWidth(itemInfo4.position);
                    itemInfo2 = itemInfo4;
                    i3 = i2 - 1;
                    itemInfo3 = itemInfo2;
                    f2 = itemInfo3.offset;
                    f3 = (itemInfo3.widthFactor + f2) + f;
                    if (obj != null && scrollX < f2) {
                        return itemInfo;
                    }
                    if (scrollX >= f3) {
                        return itemInfo3;
                    }
                    try {
                        if (i3 == this.mItems.size() - 1) {
                            return itemInfo3;
                        }
                        i4 = itemInfo3.position;
                        f4 = itemInfo3.widthFactor;
                        i3++;
                        if (!z) {
                            return itemInfo3;
                        }
                        f3 = f2;
                        i = i4;
                        obj = null;
                        f2 = f4;
                        itemInfo = itemInfo3;
                        i2 = i3;
                    } catch (NotFoundException e222) {
                        throw e222;
                    }
                }
            }
            itemInfo2 = itemInfo4;
            i3 = i2;
            itemInfo3 = itemInfo2;
            f2 = itemInfo3.offset;
            f3 = (itemInfo3.widthFactor + f2) + f;
            if (obj != null) {
            }
            if (scrollX >= f3) {
                return itemInfo3;
            }
            if (i3 == this.mItems.size() - 1) {
                return itemInfo3;
            }
            i4 = itemInfo3.position;
            f4 = itemInfo3.widthFactor;
            i3++;
            if (!z) {
                return itemInfo3;
            }
            f3 = f2;
            i = i4;
            obj = null;
            f2 = f4;
            itemInfo = itemInfo3;
            i2 = i3;
        }
        return itemInfo;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPageTransformer(boolean r5, android.support.v4.view.ViewPager.PageTransformer r6) {
        /*
        r4_this = this;
        r1 = 1;
        r2 = 0;
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NotFoundException -> 0x002c }
        r3 = 11;
        if (r0 < r3) goto L_0x002b;
    L_0x0008:
        if (r6 == 0) goto L_0x0030;
    L_0x000a:
        r0 = r1;
    L_0x000b:
        r3 = r4.mPageTransformer;	 Catch:{ NotFoundException -> 0x0032 }
        if (r3 == 0) goto L_0x0034;
    L_0x000f:
        r3 = r1;
    L_0x0010:
        if (r0 == r3) goto L_0x0013;
    L_0x0012:
        r2 = r1;
    L_0x0013:
        r4.mPageTransformer = r6;	 Catch:{ NotFoundException -> 0x0036 }
        r4.setChildrenDrawingOrderEnabledCompat(r0);	 Catch:{ NotFoundException -> 0x0036 }
        if (r0 == 0) goto L_0x0023;
    L_0x001a:
        if (r5 == 0) goto L_0x001d;
    L_0x001c:
        r1 = 2;
    L_0x001d:
        r4.mDrawingOrder = r1;	 Catch:{ NotFoundException -> 0x003a }
        r0 = a;	 Catch:{ NotFoundException -> 0x003a }
        if (r0 == 0) goto L_0x0026;
    L_0x0023:
        r0 = 0;
        r4.mDrawingOrder = r0;	 Catch:{ NotFoundException -> 0x003a }
    L_0x0026:
        if (r2 == 0) goto L_0x002b;
    L_0x0028:
        r4.populate();	 Catch:{ NotFoundException -> 0x003c }
    L_0x002b:
        return;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;
    L_0x0030:
        r0 = r2;
        goto L_0x000b;
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r3 = r2;
        goto L_0x0010;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.setPageTransformer(boolean, android.support.v4.view.ViewPager$PageTransformer):void");
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    void setOnAdapterChangeListener(OnAdapterChangeListener onAdapterChangeListener) {
        this.mAdapterChangeListener = onAdapterChangeListener;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    android.support.v4.view.ViewPager.ItemInfo infoForAnyChild(android.view.View r4) {
        /*
        r3_this = this;
        r1 = a;
    L_0x0002:
        r0 = r4.getParent();
        if (r0 == r3) goto L_0x001d;
    L_0x0008:
        if (r0 == 0) goto L_0x000e;
    L_0x000a:
        r2 = r0 instanceof android.view.View;	 Catch:{ NotFoundException -> 0x0010 }
        if (r2 != 0) goto L_0x0012;
    L_0x000e:
        r0 = 0;
    L_0x000f:
        return r0;
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r0 = (android.view.View) r0;
        if (r1 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r3.infoForChild(r0);
        goto L_0x000f;
    L_0x001b:
        r4 = r0;
        goto L_0x0002;
    L_0x001d:
        r0 = r4;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.infoForAnyChild(android.view.View):android.support.v4.view.ViewPager$ItemInfo");
    }

    ItemInfo infoForChild(View view) {
        boolean z = a;
        int i = 0;
        while (i < this.mItems.size()) {
            ItemInfo itemInfo = (ItemInfo) this.mItems.get(i);
            try {
                if (this.mAdapter.isViewFromObject(view, itemInfo.object)) {
                    return itemInfo;
                }
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            } catch (NotFoundException e) {
                throw e;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
        r9_this = this;
        r8 = -1;
        r1 = 0;
        r2 = 1;
        r3 = a;
        r0 = r9.mFakeDragging;	 Catch:{ NotFoundException -> 0x000b }
        if (r0 == 0) goto L_0x000d;
    L_0x0009:
        r1 = r2;
    L_0x000a:
        return r1;
    L_0x000b:
        r0 = move-exception;
        throw r0;
    L_0x000d:
        r0 = r10.getAction();	 Catch:{ NotFoundException -> 0x0044 }
        if (r0 != 0) goto L_0x0019;
    L_0x0013:
        r0 = r10.getEdgeFlags();	 Catch:{ NotFoundException -> 0x0046 }
        if (r0 != 0) goto L_0x000a;
    L_0x0019:
        r0 = r9.mAdapter;	 Catch:{ NotFoundException -> 0x0048 }
        if (r0 == 0) goto L_0x000a;
    L_0x001d:
        r0 = r9.mAdapter;	 Catch:{ NotFoundException -> 0x004a }
        r0 = r0.getCount();	 Catch:{ NotFoundException -> 0x004a }
        if (r0 == 0) goto L_0x000a;
    L_0x0025:
        r0 = r9.mVelocityTracker;	 Catch:{ NotFoundException -> 0x004c }
        if (r0 != 0) goto L_0x002f;
    L_0x0029:
        r0 = android.view.VelocityTracker.obtain();	 Catch:{ NotFoundException -> 0x004c }
        r9.mVelocityTracker = r0;	 Catch:{ NotFoundException -> 0x004c }
    L_0x002f:
        r0 = r9.mVelocityTracker;
        r0.addMovement(r10);
        r0 = r10.getAction();
        r0 = r0 & 255;
        switch(r0) {
            case 0: goto L_0x004e;
            case 1: goto L_0x0198;
            case 2: goto L_0x0072;
            case 3: goto L_0x0196;
            case 4: goto L_0x003d;
            case 5: goto L_0x0194;
            case 6: goto L_0x0166;
            default: goto L_0x003d;
        };
    L_0x003d:
        if (r1 == 0) goto L_0x0042;
    L_0x003f:
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r9);	 Catch:{ NotFoundException -> 0x018f }
    L_0x0042:
        r1 = r2;
        goto L_0x000a;
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r0 = r9.mScroller;	 Catch:{ NotFoundException -> 0x0179 }
        r0.abortAnimation();	 Catch:{ NotFoundException -> 0x0179 }
        r0 = 0;
        r9.mPopulatePending = r0;	 Catch:{ NotFoundException -> 0x0179 }
        r9.populate();	 Catch:{ NotFoundException -> 0x0179 }
        r0 = r10.getX();	 Catch:{ NotFoundException -> 0x0179 }
        r9.mInitialMotionX = r0;	 Catch:{ NotFoundException -> 0x0179 }
        r9.mLastMotionX = r0;	 Catch:{ NotFoundException -> 0x0179 }
        r0 = r10.getY();	 Catch:{ NotFoundException -> 0x0179 }
        r9.mInitialMotionY = r0;	 Catch:{ NotFoundException -> 0x0179 }
        r9.mLastMotionY = r0;	 Catch:{ NotFoundException -> 0x0179 }
        r0 = 0;
        r0 = android.support.v4.view.MotionEventCompat.getPointerId(r10, r0);	 Catch:{ NotFoundException -> 0x0179 }
        r9.mActivePointerId = r0;	 Catch:{ NotFoundException -> 0x0179 }
        if (r3 == 0) goto L_0x003d;
    L_0x0072:
        r0 = r9.mIsBeingDragged;	 Catch:{ NotFoundException -> 0x0179 }
        if (r0 != 0) goto L_0x00c9;
    L_0x0076:
        r0 = r9.mActivePointerId;
        r0 = android.support.v4.view.MotionEventCompat.findPointerIndex(r10, r0);
        r4 = android.support.v4.view.MotionEventCompat.getX(r10, r0);
        r5 = r9.mLastMotionX;
        r5 = r4 - r5;
        r5 = java.lang.Math.abs(r5);
        r6 = android.support.v4.view.MotionEventCompat.getY(r10, r0);
        r0 = r9.mLastMotionY;
        r0 = r6 - r0;
        r0 = java.lang.Math.abs(r0);
        r7 = r9.mTouchSlop;	 Catch:{ NotFoundException -> 0x017b }
        r7 = (float) r7;
        r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r7 <= 0) goto L_0x00c9;
    L_0x009b:
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x00c9;
    L_0x009f:
        r0 = 1;
        r9.mIsBeingDragged = r0;	 Catch:{ NotFoundException -> 0x017f }
        r0 = 1;
        r9.requestParentDisallowInterceptTouchEvent(r0);	 Catch:{ NotFoundException -> 0x017f }
        r0 = r9.mInitialMotionX;	 Catch:{ NotFoundException -> 0x017f }
        r0 = r4 - r0;
        r4 = 0;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0181;
    L_0x00af:
        r0 = r9.mInitialMotionX;	 Catch:{ NotFoundException -> 0x017f }
        r4 = r9.mTouchSlop;	 Catch:{ NotFoundException -> 0x017f }
        r4 = (float) r4;
        r0 = r0 + r4;
    L_0x00b5:
        r9.mLastMotionX = r0;
        r9.mLastMotionY = r6;
        r9.setScrollState(r2);
        r9.setScrollingCacheEnabled(r2);
        r0 = r9.getParent();
        if (r0 == 0) goto L_0x00c9;
    L_0x00c5:
        r4 = 1;
        r0.requestDisallowInterceptTouchEvent(r4);	 Catch:{ NotFoundException -> 0x0189 }
    L_0x00c9:
        r0 = r9.mIsBeingDragged;
        if (r0 == 0) goto L_0x003d;
    L_0x00cd:
        r0 = r9.mActivePointerId;
        r0 = android.support.v4.view.MotionEventCompat.findPointerIndex(r10, r0);
        r0 = android.support.v4.view.MotionEventCompat.getX(r10, r0);
        r0 = r9.performDrag(r0);
        r0 = r0 | r1;
        if (r3 == 0) goto L_0x0191;
    L_0x00de:
        r4 = r9.mIsBeingDragged;	 Catch:{ NotFoundException -> 0x018b }
        if (r4 == 0) goto L_0x0191;
    L_0x00e2:
        r0 = r9.mVelocityTracker;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = r9.mMaximumVelocity;
        r5 = (float) r5;
        r0.computeCurrentVelocity(r4, r5);
        r4 = r9.mActivePointerId;
        r0 = android.support.v4.view.VelocityTrackerCompat.getXVelocity(r0, r4);
        r0 = (int) r0;
        r9.mPopulatePending = r2;
        r4 = r9.getClientWidth();
        r5 = r9.getScrollX();
        r6 = r9.infoForCurrentScrollPosition();
        r7 = r6.position;
        r5 = (float) r5;
        r4 = (float) r4;
        r4 = r5 / r4;
        r5 = r6.offset;
        r4 = r4 - r5;
        r5 = r6.widthFactor;
        r4 = r4 / r5;
        r5 = r9.mActivePointerId;
        r5 = android.support.v4.view.MotionEventCompat.findPointerIndex(r10, r5);
        r5 = android.support.v4.view.MotionEventCompat.getX(r10, r5);
        r6 = r9.mInitialMotionX;
        r5 = r5 - r6;
        r5 = (int) r5;
        r4 = r9.determineTargetPage(r7, r4, r0, r5);
        r9.setCurrentItemInternal(r4, r2, r2, r0);
        r9.mActivePointerId = r8;
        r9.endDrag();
        r0 = r9.mLeftEdge;
        r0 = r0.onRelease();
        r4 = r9.mRightEdge;
        r4 = r4.onRelease();
        r0 = r0 | r4;
        if (r3 == 0) goto L_0x0191;
    L_0x0136:
        r4 = r9.mIsBeingDragged;	 Catch:{ NotFoundException -> 0x018d }
        if (r4 == 0) goto L_0x0191;
    L_0x013a:
        r0 = r9.mCurItem;
        r9.scrollToItem(r0, r2, r1, r1);
        r9.mActivePointerId = r8;
        r9.endDrag();
        r0 = r9.mLeftEdge;
        r0 = r0.onRelease();
        r1 = r9.mRightEdge;
        r1 = r1.onRelease();
        r0 = r0 | r1;
        if (r3 == 0) goto L_0x0191;
    L_0x0153:
        r1 = android.support.v4.view.MotionEventCompat.getActionIndex(r10);
        r4 = android.support.v4.view.MotionEventCompat.getX(r10, r1);
        r9.mLastMotionX = r4;	 Catch:{ NotFoundException -> 0x0177 }
        r1 = android.support.v4.view.MotionEventCompat.getPointerId(r10, r1);	 Catch:{ NotFoundException -> 0x0177 }
        r9.mActivePointerId = r1;	 Catch:{ NotFoundException -> 0x0177 }
        if (r3 == 0) goto L_0x0191;
    L_0x0165:
        r1 = r0;
    L_0x0166:
        r9.onSecondaryPointerUp(r10);	 Catch:{ NotFoundException -> 0x0177 }
        r0 = r9.mActivePointerId;	 Catch:{ NotFoundException -> 0x0177 }
        r0 = android.support.v4.view.MotionEventCompat.findPointerIndex(r10, r0);	 Catch:{ NotFoundException -> 0x0177 }
        r0 = android.support.v4.view.MotionEventCompat.getX(r10, r0);	 Catch:{ NotFoundException -> 0x0177 }
        r9.mLastMotionX = r0;	 Catch:{ NotFoundException -> 0x0177 }
        goto L_0x003d;
    L_0x0177:
        r0 = move-exception;
        throw r0;
    L_0x0179:
        r0 = move-exception;
        throw r0;
    L_0x017b:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x017d }
    L_0x017d:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x017f }
    L_0x017f:
        r0 = move-exception;
        throw r0;
    L_0x0181:
        r0 = r9.mInitialMotionX;
        r4 = r9.mTouchSlop;
        r4 = (float) r4;
        r0 = r0 - r4;
        goto L_0x00b5;
    L_0x0189:
        r0 = move-exception;
        throw r0;
    L_0x018b:
        r0 = move-exception;
        throw r0;
    L_0x018d:
        r0 = move-exception;
        throw r0;
    L_0x018f:
        r0 = move-exception;
        throw r0;
    L_0x0191:
        r1 = r0;
        goto L_0x003d;
    L_0x0194:
        r0 = r1;
        goto L_0x0153;
    L_0x0196:
        r0 = r1;
        goto L_0x0136;
    L_0x0198:
        r0 = r1;
        goto L_0x00de;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            if (!super.dispatchKeyEvent(keyEvent)) {
                if (!executeKeyEvent(keyEvent)) {
                    try {
                        return false;
                    }
                }
            }
            return true;
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            try {
                parent.requestDisallowInterceptTouchEvent(z);
            } catch (NotFoundException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addView(android.view.View r5, int r6, android.view.ViewGroup.LayoutParams r7) {
        /*
        r4_this = this;
        r0 = r4.checkLayoutParams(r7);
        if (r0 != 0) goto L_0x0040;
    L_0x0006:
        r1 = r4.generateLayoutParams(r7);
    L_0x000a:
        r0 = r1;
        r0 = (android.support.v4.view.ViewPager.LayoutParams) r0;
        r2 = r0.isDecor;	 Catch:{ NotFoundException -> 0x002c }
        r3 = r5 instanceof android.support.v4.view.ViewPager.Decor;	 Catch:{ NotFoundException -> 0x002c }
        r2 = r2 | r3;
        r0.isDecor = r2;	 Catch:{ NotFoundException -> 0x002c }
        r2 = r4.mInLayout;	 Catch:{ NotFoundException -> 0x002c }
        if (r2 == 0) goto L_0x003a;
    L_0x0018:
        if (r0 == 0) goto L_0x0030;
    L_0x001a:
        r2 = r0.isDecor;	 Catch:{ NotFoundException -> 0x002a }
        if (r2 == 0) goto L_0x0030;
    L_0x001e:
        r0 = new java.lang.IllegalStateException;	 Catch:{ NotFoundException -> 0x002a }
        r1 = z;	 Catch:{ NotFoundException -> 0x002a }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ NotFoundException -> 0x002a }
        r0.<init>(r1);	 Catch:{ NotFoundException -> 0x002a }
        throw r0;	 Catch:{ NotFoundException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x002a }
    L_0x0030:
        r2 = 1;
        r0.needsMeasure = r2;	 Catch:{ NotFoundException -> 0x003e }
        r4.addViewInLayout(r5, r6, r1);	 Catch:{ NotFoundException -> 0x003e }
        r0 = a;	 Catch:{ NotFoundException -> 0x003e }
        if (r0 == 0) goto L_0x003d;
    L_0x003a:
        super.addView(r5, r6, r1);	 Catch:{ NotFoundException -> 0x003e }
    L_0x003d:
        return;
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r1 = r7;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.addView(android.view.View, int, android.view.ViewGroup$LayoutParams):void");
    }

    protected boolean verifyDrawable(Drawable drawable) {
        try {
            if (!super.verifyDrawable(drawable)) {
                if (drawable != this.mMarginDrawable) {
                    try {
                        return false;
                    }
                }
            }
            return true;
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void removeView(View view) {
        try {
            if (this.mInLayout) {
                removeViewInLayout(view);
                try {
                    if (!a) {
                        return;
                    }
                }
            }
            super.removeView(view);
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    static int[] access$400() {
        return LAYOUT_ATTRS;
    }
}
