package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Interpolator;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener;
import com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineHorizontalScrollView;
import com.actionbarsherlock.internal.widget.IcsAdapterView.OnItemSelectedListener;
import com.actionbarsherlock.internal.widget.ScrollingTabContainerView.TabView;

public class ScrollingTabContainerView extends NineHorizontalScrollView implements OnItemSelectedListener {
    private static final Interpolator sAlphaInterpolator;
    private static final String[] z;
    private boolean mAllowCollapse;
    private int mContentHeight;
    private LayoutInflater mInflater;
    int mMaxTabWidth;
    private int mSelectedTabIndex;
    private TabClickListener mTabClickListener;
    private IcsLinearLayout mTabLayout;
    Runnable mTabSelector;
    private IcsSpinner mTabSpinner;
    protected final VisibilityAnimListener mVisAnimListener;
    protected Animator mVisibilityAnim;

    class AnonymousClass_1 implements Runnable {
        final ScrollingTabContainerView this$0;
        final View val$tabView;

        AnonymousClass_1(ScrollingTabContainerView scrollingTabContainerView, View view) {
            this.this$0 = scrollingTabContainerView;
            this.val$tabView = view;
        }

        public void run() {
            this.this$0.smoothScrollTo(this.val$tabView.getLeft() - ((this.this$0.getWidth() - this.val$tabView.getWidth()) / 2), 0);
            this.this$0.mTabSelector = null;
        }
    }

    class TabAdapter extends BaseAdapter {
        final ScrollingTabContainerView this$0;

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
            /*
            r3_this = this;
            if (r5 != 0) goto L_0x0020;
        L_0x0002:
            r1 = r3.this$0;
            r0 = r3.getItem(r4);
            r0 = (com.actionbarsherlock.app.ActionBar.Tab) r0;
            r2 = 1;
            r1 = com.actionbarsherlock.internal.widget.ScrollingTabContainerView.access$300(r1, r0, r2);
            r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
            if (r0 == 0) goto L_0x001f;
        L_0x0013:
            r0 = r1;
            r0 = (com.actionbarsherlock.internal.widget.ScrollingTabContainerView.TabView) r0;
            r2 = r3.getItem(r4);
            r2 = (com.actionbarsherlock.app.ActionBar.Tab) r2;
            r0.bindTab(r2);
        L_0x001f:
            return r1;
        L_0x0020:
            r1 = r5;
            goto L_0x0013;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ScrollingTabContainerView.TabAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        public int getCount() {
            return ScrollingTabContainerView.access$200(this.this$0).getChildCount();
        }

        public Object getItem(int i) {
            return ((TabView) ScrollingTabContainerView.access$200(this.this$0).getChildAt(i)).getTab();
        }

        private TabAdapter(ScrollingTabContainerView scrollingTabContainerView) {
            this.this$0 = scrollingTabContainerView;
        }

        TabAdapter(ScrollingTabContainerView scrollingTabContainerView, AnonymousClass_1 anonymousClass_1) {
            this(scrollingTabContainerView);
        }

        public long getItemId(int i) {
            return (long) i;
        }
    }

    class TabClickListener implements OnClickListener {
        final ScrollingTabContainerView this$0;

        public void onClick(View view) {
            boolean z = AbsActionBarView.b;
            ((TabView) view).getTab().select();
            int childCount = ScrollingTabContainerView.access$200(this.this$0).getChildCount();
            int i = 0;
            while (i < childCount) {
                boolean z2;
                View childAt = ScrollingTabContainerView.access$200(this.this$0).getChildAt(i);
                if (childAt == view) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                childAt.setSelected(z2);
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            }
        }

        private TabClickListener(ScrollingTabContainerView scrollingTabContainerView) {
            this.this$0 = scrollingTabContainerView;
        }

        TabClickListener(ScrollingTabContainerView scrollingTabContainerView, AnonymousClass_1 anonymousClass_1) {
            this(scrollingTabContainerView);
        }
    }

    public class TabView extends LinearLayout {
        private View mCustomView;
        private ImageView mIconView;
        private ScrollingTabContainerView mParent;
        private Tab mTab;
        private CapitalizingTextView mTextView;

        public TabView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.mParent.mMaxTabWidth > 0 && getMeasuredWidth() > this.mParent.mMaxTabWidth) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(this.mParent.mMaxTabWidth, 1073741824), i2);
            }
        }

        public Tab getTab() {
            return this.mTab;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void update() {
            /*
            r11_this = this;
            r10 = 16;
            r9 = 0;
            r8 = 8;
            r7 = -2;
            r6 = 0;
            r1 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
            r2 = r11.mTab;
            r3 = r2.getCustomView();
            if (r3 == 0) goto L_0x003c;
        L_0x0011:
            r0 = r3.getParent();
            if (r0 == r11) goto L_0x0021;
        L_0x0017:
            if (r0 == 0) goto L_0x001e;
        L_0x0019:
            r0 = (android.view.ViewGroup) r0;
            r0.removeView(r3);
        L_0x001e:
            r11.addView(r3);
        L_0x0021:
            r11.mCustomView = r3;
            r0 = r11.mTextView;
            if (r0 == 0) goto L_0x002c;
        L_0x0027:
            r0 = r11.mTextView;
            r0.setVisibility(r8);
        L_0x002c:
            r0 = r11.mIconView;
            if (r0 == 0) goto L_0x003a;
        L_0x0030:
            r0 = r11.mIconView;
            r0.setVisibility(r8);
            r0 = r11.mIconView;
            r0.setImageDrawable(r6);
        L_0x003a:
            if (r1 == 0) goto L_0x00d3;
        L_0x003c:
            r0 = r11.mCustomView;
            if (r0 == 0) goto L_0x0047;
        L_0x0040:
            r0 = r11.mCustomView;
            r11.removeView(r0);
            r11.mCustomView = r6;
        L_0x0047:
            r0 = r2.getIcon();
            r3 = r2.getText();
            if (r0 == 0) goto L_0x0079;
        L_0x0051:
            r4 = r11.mIconView;
            if (r4 != 0) goto L_0x006d;
        L_0x0055:
            r4 = new android.widget.ImageView;
            r5 = r11.getContext();
            r4.<init>(r5);
            r5 = new android.widget.LinearLayout$LayoutParams;
            r5.<init>(r7, r7);
            r5.gravity = r10;
            r4.setLayoutParams(r5);
            r11.addView(r4, r9);
            r11.mIconView = r4;
        L_0x006d:
            r4 = r11.mIconView;
            r4.setImageDrawable(r0);
            r0 = r11.mIconView;
            r0.setVisibility(r9);
            if (r1 == 0) goto L_0x0087;
        L_0x0079:
            r0 = r11.mIconView;
            if (r0 == 0) goto L_0x0087;
        L_0x007d:
            r0 = r11.mIconView;
            r0.setVisibility(r8);
            r0 = r11.mIconView;
            r0.setImageDrawable(r6);
        L_0x0087:
            if (r3 == 0) goto L_0x00b8;
        L_0x0089:
            r0 = r11.mTextView;
            if (r0 != 0) goto L_0x00ac;
        L_0x008d:
            r0 = new com.actionbarsherlock.internal.widget.CapitalizingTextView;
            r4 = r11.getContext();
            r5 = com.actionbarsherlock.R.attr.actionBarTabTextStyle;
            r0.<init>(r4, r6, r5);
            r4 = android.text.TextUtils.TruncateAt.END;
            r0.setEllipsize(r4);
            r4 = new android.widget.LinearLayout$LayoutParams;
            r4.<init>(r7, r7);
            r4.gravity = r10;
            r0.setLayoutParams(r4);
            r11.addView(r0);
            r11.mTextView = r0;
        L_0x00ac:
            r0 = r11.mTextView;
            r0.setTextCompat(r3);
            r0 = r11.mTextView;
            r0.setVisibility(r9);
            if (r1 == 0) goto L_0x00c6;
        L_0x00b8:
            r0 = r11.mTextView;
            if (r0 == 0) goto L_0x00c6;
        L_0x00bc:
            r0 = r11.mTextView;
            r0.setVisibility(r8);
            r0 = r11.mTextView;
            r0.setText(r6);
        L_0x00c6:
            r0 = r11.mIconView;
            if (r0 == 0) goto L_0x00d3;
        L_0x00ca:
            r0 = r11.mIconView;
            r1 = r2.getContentDescription();
            r0.setContentDescription(r1);
        L_0x00d3:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ScrollingTabContainerView.TabView.update():void");
        }

        public void init(ScrollingTabContainerView scrollingTabContainerView, Tab tab, boolean z) {
            this.mParent = scrollingTabContainerView;
            this.mTab = tab;
            if (z) {
                setGravity(19);
            }
            update();
        }

        public void bindTab(Tab tab) {
            this.mTab = tab;
            update();
        }
    }

    public class VisibilityAnimListener implements AnimatorListener {
        private boolean mCanceled;
        private int mFinalVisibility;
        final ScrollingTabContainerView this$0;

        public void onAnimationRepeat(Animator animator) {
        }

        protected VisibilityAnimListener(ScrollingTabContainerView scrollingTabContainerView) {
            this.this$0 = scrollingTabContainerView;
            this.mCanceled = false;
        }

        public com.actionbarsherlock.internal.widget.ScrollingTabContainerView.VisibilityAnimListener withFinalVisibility(int i) {
            this.mFinalVisibility = i;
            return this;
        }

        public void onAnimationCancel(Animator animator) {
            this.mCanceled = true;
        }

        public void onAnimationStart(Animator animator) {
            this.this$0.setVisibility(0);
            this.this$0.mVisibilityAnim = animator;
            this.mCanceled = false;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.mCanceled) {
                this.this$0.mVisibilityAnim = null;
                this.this$0.setVisibility(this.mFinalVisibility);
            }
        }
    }

    public void updateTab(int i) {
        ((TabView) this.mTabLayout.getChildAt(i)).update();
        if (this.mTabSpinner != null) {
            ((TabAdapter) this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    private void performCollapse() {
        if (!isCollapsed()) {
            if (this.mTabSpinner == null) {
                this.mTabSpinner = createSpinner();
            }
            removeView(this.mTabLayout);
            addView(this.mTabSpinner, new LayoutParams(-2, -1));
            if (this.mTabSpinner.getAdapter() == null) {
                this.mTabSpinner.setAdapter(new TabAdapter(this, null));
            }
            if (this.mTabSelector != null) {
                removeCallbacks(this.mTabSelector);
                this.mTabSelector = null;
            }
            this.mTabSpinner.setSelection(this.mSelectedTabIndex);
        }
    }

    public void onItemSelected(IcsAdapterView icsAdapterView, View view, int i, long j) {
        ((TabView) view).getTab().select();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, R.styleable.SherlockActionBar, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(R.styleable.SherlockActionBar_height, 0));
        obtainStyledAttributes.recycle();
    }

    private boolean isCollapsed() {
        return this.mTabSpinner != null && this.mTabSpinner.getParent() == this;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mTabSelector != null) {
            removeCallbacks(this.mTabSelector);
        }
    }

    static IcsLinearLayout access$200(ScrollingTabContainerView scrollingTabContainerView) {
        return scrollingTabContainerView.mTabLayout;
    }

    public void setAllowCollapse(boolean z) {
        this.mAllowCollapse = z;
    }

    public void addTab(Tab tab, boolean z) {
        View createTabView = createTabView(tab, false);
        this.mTabLayout.addView(createTabView, new LinearLayout.LayoutParams(0, -1, 1.0f));
        if (this.mTabSpinner != null) {
            ((TabAdapter) this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            createTabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    private boolean performExpand() {
        if (isCollapsed()) {
            removeView(this.mTabSpinner);
            addView(this.mTabLayout, new LayoutParams(-2, -1));
            setTabSelected(this.mTabSpinner.getSelectedItemPosition());
        }
        return false;
    }

    public void animateToTab(int i) {
        View childAt = this.mTabLayout.getChildAt(i);
        if (this.mTabSelector != null) {
            removeCallbacks(this.mTabSelector);
        }
        this.mTabSelector = new AnonymousClass_1(this, childAt);
        post(this.mTabSelector);
    }

    public void animateToVisibility(int i) {
        ObjectAnimator ofFloat;
        if (this.mVisibilityAnim != null) {
            this.mVisibilityAnim.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(this, z[0], new float[]{1.0f});
            ofFloat.setDuration(200);
            ofFloat.setInterpolator(sAlphaInterpolator);
            ofFloat.addListener(this.mVisAnimListener.withFinalVisibility(i));
            ofFloat.start();
            if (!AbsActionBarView.b) {
                return;
            }
        }
        ofFloat = ObjectAnimator.ofFloat(this, z[1], new float[]{0.0f});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(sAlphaInterpolator);
        ofFloat.addListener(this.mVisAnimListener.withFinalVisibility(i));
        ofFloat.start();
    }

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
        r2 = "UDi\u001d\"";
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
        if (r7 > r8) goto L_0x0036;
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
        r0 = "UDi\u001d\"";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        r0 = new android.view.animation.DecelerateInterpolator;
        r0.<init>();
        sAlphaInterpolator = r0;
        return;
    L_0x0036:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0047;
            case 1: goto L_0x004a;
            case 2: goto L_0x004d;
            case 3: goto L_0x0050;
            default: goto L_0x003d;
        };
    L_0x003d:
        r2 = 67;
    L_0x003f:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0047:
        r2 = 52;
        goto L_0x003f;
    L_0x004a:
        r2 = 40;
        goto L_0x003f;
    L_0x004d:
        r2 = 25;
        goto L_0x003f;
    L_0x0050:
        r2 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ScrollingTabContainerView.<clinit>():void");
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    public void onNothingSelected(IcsAdapterView icsAdapterView) {
    }

    public void setTabSelected(int i) {
        boolean z = AbsActionBarView.b;
        this.mSelectedTabIndex = i;
        int childCount = this.mTabLayout.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            boolean z2;
            View childAt = this.mTabLayout.getChildAt(i2);
            if (i2 == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            childAt.setSelected(z2);
            if (z2) {
                animateToTab(i);
            }
            int i3 = i2 + 1;
            if (!z) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
        r8_this = this;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = 1;
        r2 = 0;
        r3 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r4 = android.view.View.MeasureSpec.getMode(r9);
        if (r4 != r7) goto L_0x007d;
    L_0x000c:
        r0 = r1;
    L_0x000d:
        r8.setFillViewport(r0);
        r5 = r8.mTabLayout;
        r5 = r5.getChildCount();
        if (r5 <= r1) goto L_0x0039;
    L_0x0018:
        if (r4 == r7) goto L_0x001e;
    L_0x001a:
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r4 != r6) goto L_0x0039;
    L_0x001e:
        r4 = 2;
        if (r5 <= r4) goto L_0x002f;
    L_0x0021:
        r4 = android.view.View.MeasureSpec.getSize(r9);
        r4 = (float) r4;
        r5 = 1053609165; // 0x3ecccccd float:0.4 double:5.205520926E-315;
        r4 = r4 * r5;
        r4 = (int) r4;
        r8.mMaxTabWidth = r4;
        if (r3 == 0) goto L_0x003c;
    L_0x002f:
        r4 = android.view.View.MeasureSpec.getSize(r9);
        r4 = r4 / 2;
        r8.mMaxTabWidth = r4;
        if (r3 == 0) goto L_0x003c;
    L_0x0039:
        r4 = -1;
        r8.mMaxTabWidth = r4;
    L_0x003c:
        r4 = r8.mContentHeight;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r7);
        if (r0 != 0) goto L_0x007f;
    L_0x0044:
        r5 = r8.mAllowCollapse;
        if (r5 == 0) goto L_0x007f;
    L_0x0048:
        if (r1 == 0) goto L_0x0065;
    L_0x004a:
        r1 = r8.mTabLayout;
        r1.measure(r2, r4);
        r1 = r8.mTabLayout;
        r1 = r1.getMeasuredWidth();
        r2 = android.view.View.MeasureSpec.getSize(r9);
        if (r1 <= r2) goto L_0x0060;
    L_0x005b:
        r8.performCollapse();
        if (r3 == 0) goto L_0x0068;
    L_0x0060:
        r8.performExpand();
        if (r3 == 0) goto L_0x0068;
    L_0x0065:
        r8.performExpand();
    L_0x0068:
        r1 = r8.getMeasuredWidth();
        super.onMeasure(r9, r4);
        r2 = r8.getMeasuredWidth();
        if (r0 == 0) goto L_0x007c;
    L_0x0075:
        if (r1 == r2) goto L_0x007c;
    L_0x0077:
        r0 = r8.mSelectedTabIndex;
        r8.setTabSelected(r0);
    L_0x007c:
        return;
    L_0x007d:
        r0 = r2;
        goto L_0x000d;
    L_0x007f:
        r1 = r2;
        goto L_0x0048;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ScrollingTabContainerView.onMeasure(int, int):void");
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        this.mVisAnimListener = new VisibilityAnimListener(this);
        setHorizontalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, R.styleable.SherlockActionBar, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(R.styleable.SherlockActionBar_height, 0));
        obtainStyledAttributes.recycle();
        this.mInflater = LayoutInflater.from(context);
        this.mTabLayout = createTabLayout();
        addView(this.mTabLayout, new LayoutParams(-2, -1));
    }

    private IcsLinearLayout createTabLayout() {
        IcsLinearLayout icsLinearLayout = (IcsLinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.abs__action_bar_tab_bar_view, null);
        icsLinearLayout.setMeasureWithLargestChildEnabled(true);
        icsLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        return icsLinearLayout;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.actionbarsherlock.internal.widget.ScrollingTabContainerView.TabView createTabView(com.actionbarsherlock.app.ActionBar.Tab r6, boolean r7) {
        /*
        r5_this = this;
        r4 = 0;
        r0 = r5.mInflater;
        r1 = com.actionbarsherlock.R.layout.abs__action_bar_tab;
        r0 = r0.inflate(r1, r4);
        r0 = (com.actionbarsherlock.internal.widget.ScrollingTabContainerView.TabView) r0;
        r0.init(r5, r6, r7);
        if (r7 == 0) goto L_0x0022;
    L_0x0010:
        r0.setBackgroundDrawable(r4);
        r1 = new android.widget.AbsListView$LayoutParams;
        r2 = -1;
        r3 = r5.mContentHeight;
        r1.<init>(r2, r3);
        r0.setLayoutParams(r1);
        r1 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        if (r1 == 0) goto L_0x0036;
    L_0x0022:
        r1 = 1;
        r0.setFocusable(r1);
        r1 = r5.mTabClickListener;
        if (r1 != 0) goto L_0x0031;
    L_0x002a:
        r1 = new com.actionbarsherlock.internal.widget.ScrollingTabContainerView$TabClickListener;
        r1.<init>(r5, r4);
        r5.mTabClickListener = r1;
    L_0x0031:
        r1 = r5.mTabClickListener;
        r0.setOnClickListener(r1);
    L_0x0036:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ScrollingTabContainerView.createTabView(com.actionbarsherlock.app.ActionBar$Tab, boolean):com.actionbarsherlock.internal.widget.ScrollingTabContainerView$TabView");
    }

    static TabView access$300(ScrollingTabContainerView scrollingTabContainerView, Tab tab, boolean z) {
        return scrollingTabContainerView.createTabView(tab, z);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mTabSelector != null) {
            post(this.mTabSelector);
        }
    }

    private IcsSpinner createSpinner() {
        IcsSpinner icsSpinner = new IcsSpinner(getContext(), null, R.attr.actionDropDownStyle);
        icsSpinner.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        icsSpinner.setOnItemSelectedListener(this);
        return icsSpinner;
    }
}
