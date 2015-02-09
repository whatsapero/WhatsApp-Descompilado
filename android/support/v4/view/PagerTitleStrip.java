package android.support.v4.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class PagerTitleStrip extends ViewGroup implements Decor {
    private static final int[] ATTRS;
    private static final PagerTitleStripImpl IMPL;
    private static final int[] TEXT_ATTRS;
    private static final String[] z;
    TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    private float mLastKnownPositionOffset;
    TextView mNextText;
    private int mNonPrimaryAlpha;
    private final PageListener mPageListener;
    ViewPager mPager;
    TextView mPrevText;
    private int mScaledTextSpacing;
    int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private WeakReference mWatchingAdapter;

    class PageListener extends DataSetObserver implements OnPageChangeListener, OnAdapterChangeListener {
        private int mScrollState;
        final PagerTitleStrip this$0;

        private PageListener(PagerTitleStrip pagerTitleStrip) {
            this.this$0 = pagerTitleStrip;
        }

        PageListener(PagerTitleStrip pagerTitleStrip, AnonymousClass_1 anonymousClass_1) {
            this(pagerTitleStrip);
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            this.this$0.updateTextPositions(i, f, false);
        }

        public void onChanged() {
            float f = 0.0f;
            this.this$0.updateText(this.this$0.mPager.getCurrentItem(), this.this$0.mPager.getAdapter());
            if (PagerTitleStrip.access$100(this.this$0) >= 0.0f) {
                f = PagerTitleStrip.access$100(this.this$0);
            }
            this.this$0.updateTextPositions(this.this$0.mPager.getCurrentItem(), f, true);
        }

        public void onAdapterChanged(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            this.this$0.updateAdapter(pagerAdapter, pagerAdapter2);
        }

        public void onPageSelected(int i) {
            float f = 0.0f;
            if (this.mScrollState == 0) {
                this.this$0.updateText(this.this$0.mPager.getCurrentItem(), this.this$0.mPager.getAdapter());
                if (PagerTitleStrip.access$100(this.this$0) >= 0.0f) {
                    f = PagerTitleStrip.access$100(this.this$0);
                }
                this.this$0.updateTextPositions(this.this$0.mPager.getCurrentItem(), f, true);
            }
        }

        public void onPageScrollStateChanged(int i) {
            this.mScrollState = i;
        }
    }

    interface PagerTitleStripImpl {
        void setSingleLineAllCaps(TextView textView);
    }

    class PagerTitleStripImplBase implements PagerTitleStripImpl {
        PagerTitleStripImplBase() {
        }

        public void setSingleLineAllCaps(TextView textView) {
            textView.setSingleLine();
        }
    }

    class PagerTitleStripImplIcs implements PagerTitleStripImpl {
        PagerTitleStripImplIcs() {
        }

        public void setSingleLineAllCaps(TextView textView) {
            PagerTitleStripIcs.setSingleLineAllCaps(textView);
        }
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
        r4 = 1;
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "\u001b~Y\u0006<\u001fvJ\u000f+\u0018kL\n>krK\u0010:k}[C/k{W\u0011+(k\u001e\u0000&\"sZC!-?_C\u0018\"zI3/,zLM";
        r0 = -1;
        r5 = r3;
        r6 = r3;
        r3 = r1;
    L_0x000b:
        r2 = r2.toCharArray();
        r7 = r2.length;
        r8 = r7;
        r9 = r1;
        r7 = r2;
    L_0x0013:
        if (r8 > r9) goto L_0x004f;
    L_0x0015:
        r2 = new java.lang.String;
        r2.<init>(r7);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0021;
        };
    L_0x0021:
        r5[r3] = r2;
        r0 = "\u0006jM\u0017n&z_\u0010;9z\u001e\u0014'?w\u001e\u0002 kzF\u0002-??I\n*?w";
        r2 = r0;
        r3 = r4;
        r5 = r6;
        r0 = r1;
        goto L_0x000b;
    L_0x002a:
        r5[r3] = r2;
        z = r6;
        r0 = 4;
        r0 = new int[r0];	 Catch:{ IllegalStateException -> 0x006c }
        r0 = new int[]{16842804, 16842901, 16842904, 16842927};	 Catch:{ IllegalStateException -> 0x006c }
        ATTRS = r0;	 Catch:{ IllegalStateException -> 0x006c }
        r0 = 1;	 Catch:{ IllegalStateException -> 0x006c }
        r0 = new int[r0];	 Catch:{ IllegalStateException -> 0x006c }
        r1 = 0;	 Catch:{ IllegalStateException -> 0x006c }
        r2 = 16843660; // 0x101038c float:2.3696103E-38 double:8.321874E-317;	 Catch:{ IllegalStateException -> 0x006c }
        r0[r1] = r2;	 Catch:{ IllegalStateException -> 0x006c }
        TEXT_ATTRS = r0;	 Catch:{ IllegalStateException -> 0x006c }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x006c }
        r1 = 14;	 Catch:{ IllegalStateException -> 0x006c }
        if (r0 < r1) goto L_0x006e;	 Catch:{ IllegalStateException -> 0x006c }
    L_0x0047:
        r0 = new android.support.v4.view.PagerTitleStrip$PagerTitleStripImplIcs;	 Catch:{ IllegalStateException -> 0x006c }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x006c }
        IMPL = r0;	 Catch:{ IllegalStateException -> 0x006c }
    L_0x004e:
        return;
    L_0x004f:
        r10 = r7[r9];
        r2 = r9 % 5;
        switch(r2) {
            case 0: goto L_0x0060;
            case 1: goto L_0x0063;
            case 2: goto L_0x0066;
            case 3: goto L_0x0069;
            default: goto L_0x0056;
        };
    L_0x0056:
        r2 = 78;
    L_0x0058:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0013;
    L_0x0060:
        r2 = 75;
        goto L_0x0058;
    L_0x0063:
        r2 = 31;
        goto L_0x0058;
    L_0x0066:
        r2 = 62;
        goto L_0x0058;
    L_0x0069:
        r2 = 99;
        goto L_0x0058;
    L_0x006c:
        r0 = move-exception;
        throw r0;
    L_0x006e:
        r0 = new android.support.v4.view.PagerTitleStrip$PagerTitleStripImplBase;
        r0.<init>();
        IMPL = r0;
        goto L_0x004e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.PagerTitleStrip.<clinit>():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PagerTitleStrip(android.content.Context r9, android.util.AttributeSet r10) {
        /*
        r8_this = this;
        r7 = 2;
        r1 = 1;
        r0 = 0;
        r3 = android.support.v4.view.ViewPager.a;
        r8.<init>(r9, r10);
        r2 = -1;
        r8.mLastKnownCurrentPage = r2;
        r2 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r8.mLastKnownPositionOffset = r2;
        r2 = new android.support.v4.view.PagerTitleStrip$PageListener;
        r4 = 0;
        r2.<init>(r8, r4);
        r8.mPageListener = r2;
        r2 = new android.widget.TextView;
        r2.<init>(r9);
        r8.mPrevText = r2;
        r8.addView(r2);
        r2 = new android.widget.TextView;
        r2.<init>(r9);
        r8.mCurrText = r2;
        r8.addView(r2);
        r2 = new android.widget.TextView;
        r2.<init>(r9);
        r8.mNextText = r2;
        r8.addView(r2);
        r2 = ATTRS;
        r2 = r9.obtainStyledAttributes(r10, r2);
        r4 = r2.getResourceId(r0, r0);
        if (r4 == 0) goto L_0x0050;
    L_0x0041:
        r5 = r8.mPrevText;	 Catch:{ IllegalStateException -> 0x00f1 }
        r5.setTextAppearance(r9, r4);	 Catch:{ IllegalStateException -> 0x00f1 }
        r5 = r8.mCurrText;	 Catch:{ IllegalStateException -> 0x00f1 }
        r5.setTextAppearance(r9, r4);	 Catch:{ IllegalStateException -> 0x00f1 }
        r5 = r8.mNextText;	 Catch:{ IllegalStateException -> 0x00f1 }
        r5.setTextAppearance(r9, r4);	 Catch:{ IllegalStateException -> 0x00f1 }
    L_0x0050:
        r5 = r2.getDimensionPixelSize(r1, r0);
        if (r5 == 0) goto L_0x005b;
    L_0x0056:
        r6 = 0;
        r5 = (float) r5;
        r8.setTextSize(r6, r5);	 Catch:{ IllegalStateException -> 0x00f3 }
    L_0x005b:
        r5 = r2.hasValue(r7);
        if (r5 == 0) goto L_0x0074;
    L_0x0061:
        r5 = r2.getColor(r7, r0);
        r6 = r8.mPrevText;
        r6.setTextColor(r5);
        r6 = r8.mCurrText;
        r6.setTextColor(r5);
        r6 = r8.mNextText;
        r6.setTextColor(r5);
    L_0x0074:
        r5 = 3;
        r6 = 80;
        r5 = r2.getInteger(r5, r6);
        r8.mGravity = r5;
        r2.recycle();
        r2 = r8.mCurrText;
        r2 = r2.getTextColors();
        r2 = r2.getDefaultColor();
        r8.mTextColor = r2;
        r2 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        r8.setNonPrimaryAlpha(r2);
        r2 = r8.mPrevText;
        r5 = android.text.TextUtils.TruncateAt.END;
        r2.setEllipsize(r5);
        r2 = r8.mCurrText;
        r5 = android.text.TextUtils.TruncateAt.END;
        r2.setEllipsize(r5);
        r2 = r8.mNextText;
        r5 = android.text.TextUtils.TruncateAt.END;
        r2.setEllipsize(r5);
        if (r4 == 0) goto L_0x00fd;
    L_0x00a9:
        r2 = TEXT_ATTRS;
        r4 = r9.obtainStyledAttributes(r4, r2);
        r2 = r4.getBoolean(r0, r0);
        r4.recycle();
    L_0x00b6:
        if (r2 == 0) goto L_0x00c9;
    L_0x00b8:
        r2 = r8.mPrevText;	 Catch:{ IllegalStateException -> 0x00f5 }
        setSingleLineAllCaps(r2);	 Catch:{ IllegalStateException -> 0x00f5 }
        r2 = r8.mCurrText;	 Catch:{ IllegalStateException -> 0x00f5 }
        setSingleLineAllCaps(r2);	 Catch:{ IllegalStateException -> 0x00f5 }
        r2 = r8.mNextText;	 Catch:{ IllegalStateException -> 0x00f5 }
        setSingleLineAllCaps(r2);	 Catch:{ IllegalStateException -> 0x00f5 }
        if (r3 == 0) goto L_0x00d8;
    L_0x00c9:
        r2 = r8.mPrevText;	 Catch:{ IllegalStateException -> 0x00f5 }
        r2.setSingleLine();	 Catch:{ IllegalStateException -> 0x00f5 }
        r2 = r8.mCurrText;	 Catch:{ IllegalStateException -> 0x00f5 }
        r2.setSingleLine();	 Catch:{ IllegalStateException -> 0x00f5 }
        r2 = r8.mNextText;	 Catch:{ IllegalStateException -> 0x00f5 }
        r2.setSingleLine();	 Catch:{ IllegalStateException -> 0x00f5 }
    L_0x00d8:
        r2 = r9.getResources();
        r2 = r2.getDisplayMetrics();
        r2 = r2.density;
        r4 = 1098907648; // 0x41800000 float:16.0 double:5.42932517E-315;
        r2 = r2 * r4;
        r2 = (int) r2;
        r8.mScaledTextSpacing = r2;	 Catch:{ IllegalStateException -> 0x00f7 }
        r2 = android.support.v4.app.Fragment.a;	 Catch:{ IllegalStateException -> 0x00f7 }
        if (r2 == 0) goto L_0x00f0;
    L_0x00ec:
        if (r3 == 0) goto L_0x00fb;
    L_0x00ee:
        android.support.v4.view.ViewPager.a = r0;
    L_0x00f0:
        return;
    L_0x00f1:
        r0 = move-exception;
        throw r0;
    L_0x00f3:
        r0 = move-exception;
        throw r0;
    L_0x00f5:
        r0 = move-exception;
        throw r0;
    L_0x00f7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00f9 }
    L_0x00f9:
        r0 = move-exception;
        throw r0;
    L_0x00fb:
        r0 = r1;
        goto L_0x00ee;
    L_0x00fd:
        r2 = r0;
        goto L_0x00b6;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.PagerTitleStrip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void setTextSize(int i, float f) {
        this.mPrevText.setTextSize(i, f);
        this.mCurrText.setTextSize(i, f);
        this.mNextText.setTextSize(i, f);
    }

    public int getTextSpacing() {
        return this.mScaledTextSpacing;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void updateTextPositions(int r21, float r22, boolean r23) {
        /*
        r20_this = this;
        r5 = android.support.v4.view.ViewPager.a;
        r0 = r20;
        r2 = r0.mLastKnownCurrentPage;	 Catch:{ IllegalStateException -> 0x0026 }
        r0 = r21;
        if (r0 == r2) goto L_0x001b;
    L_0x000a:
        r0 = r20;
        r2 = r0.mPager;	 Catch:{ IllegalStateException -> 0x0028 }
        r2 = r2.getAdapter();	 Catch:{ IllegalStateException -> 0x0028 }
        r0 = r20;
        r1 = r21;
        r0.updateText(r1, r2);	 Catch:{ IllegalStateException -> 0x0028 }
        if (r5 == 0) goto L_0x002e;
    L_0x001b:
        if (r23 != 0) goto L_0x002e;
    L_0x001d:
        r0 = r20;
        r2 = r0.mLastKnownPositionOffset;	 Catch:{ IllegalStateException -> 0x002c }
        r2 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x002e;
    L_0x0025:
        return;
    L_0x0026:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0028 }
    L_0x0028:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x002a }
    L_0x002a:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x002c }
    L_0x002c:
        r2 = move-exception;
        throw r2;
    L_0x002e:
        r2 = 1;
        r0 = r20;
        r0.mUpdatingPositions = r2;
        r0 = r20;
        r2 = r0.mPrevText;
        r6 = r2.getMeasuredWidth();
        r0 = r20;
        r2 = r0.mCurrText;
        r3 = r2.getMeasuredWidth();
        r0 = r20;
        r2 = r0.mNextText;
        r7 = r2.getMeasuredWidth();
        r2 = r3 / 2;
        r8 = r20.getWidth();
        r9 = r20.getHeight();
        r10 = r20.getPaddingLeft();
        r11 = r20.getPaddingRight();
        r12 = r20.getPaddingTop();
        r13 = r20.getPaddingBottom();
        r4 = r10 + r2;
        r14 = r11 + r2;
        r2 = r8 - r4;
        r4 = r2 - r14;
        r2 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r2 = r2 + r22;
        r15 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r15 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1));
        if (r15 <= 0) goto L_0x007a;
    L_0x0077:
        r15 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = r2 - r15;
    L_0x007a:
        r14 = r8 - r14;
        r4 = (float) r4;
        r2 = r2 * r4;
        r2 = (int) r2;
        r2 = r14 - r2;
        r4 = r3 / 2;
        r14 = r2 - r4;
        r15 = r14 + r3;
        r0 = r20;
        r2 = r0.mPrevText;
        r2 = r2.getBaseline();
        r0 = r20;
        r3 = r0.mCurrText;
        r3 = r3.getBaseline();
        r0 = r20;
        r4 = r0.mNextText;
        r4 = r4.getBaseline();
        r16 = java.lang.Math.max(r2, r3);
        r0 = r16;
        r16 = java.lang.Math.max(r0, r4);
        r17 = r16 - r2;
        r18 = r16 - r3;
        r16 = r16 - r4;
        r0 = r20;
        r2 = r0.mPrevText;
        r2 = r2.getMeasuredHeight();
        r2 = r2 + r17;
        r0 = r20;
        r3 = r0.mCurrText;
        r3 = r3.getMeasuredHeight();
        r3 = r3 + r18;
        r0 = r20;
        r4 = r0.mNextText;
        r4 = r4.getMeasuredHeight();
        r4 = r4 + r16;
        r2 = java.lang.Math.max(r2, r3);
        r19 = java.lang.Math.max(r2, r4);
        r0 = r20;
        r2 = r0.mGravity;
        r2 = r2 & 112;
        switch(r2) {
            case 16: goto L_0x00e6;
            case 80: goto L_0x00f5;
            default: goto L_0x00de;
        };
    L_0x00de:
        r4 = r12 + r17;
        r3 = r12 + r18;
        r2 = r12 + r16;
        if (r5 == 0) goto L_0x00ff;
    L_0x00e6:
        r2 = r9 - r12;
        r2 = r2 - r13;
        r2 = r2 - r19;
        r2 = r2 / 2;
        r4 = r2 + r17;
        r3 = r2 + r18;
        r2 = r2 + r16;
        if (r5 == 0) goto L_0x00ff;
    L_0x00f5:
        r2 = r9 - r13;
        r2 = r2 - r19;
        r4 = r2 + r17;
        r3 = r2 + r18;
        r2 = r2 + r16;
    L_0x00ff:
        r0 = r20;
        r5 = r0.mCurrText;
        r0 = r20;
        r9 = r0.mCurrText;
        r9 = r9.getMeasuredHeight();
        r9 = r9 + r3;
        r5.layout(r14, r3, r15, r9);
        r0 = r20;
        r3 = r0.mScaledTextSpacing;
        r3 = r14 - r3;
        r3 = r3 - r6;
        r3 = java.lang.Math.min(r10, r3);
        r0 = r20;
        r5 = r0.mPrevText;
        r6 = r6 + r3;
        r0 = r20;
        r9 = r0.mPrevText;
        r9 = r9.getMeasuredHeight();
        r9 = r9 + r4;
        r5.layout(r3, r4, r6, r9);
        r3 = r8 - r11;
        r3 = r3 - r7;
        r0 = r20;
        r4 = r0.mScaledTextSpacing;
        r4 = r4 + r15;
        r3 = java.lang.Math.max(r3, r4);
        r0 = r20;
        r4 = r0.mNextText;
        r5 = r3 + r7;
        r0 = r20;
        r6 = r0.mNextText;
        r6 = r6.getMeasuredHeight();
        r6 = r6 + r2;
        r4.layout(r3, r2, r5, r6);
        r0 = r22;
        r1 = r20;
        r1.mLastKnownPositionOffset = r0;
        r2 = 0;
        r0 = r20;
        r0.mUpdatingPositions = r2;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.PagerTitleStrip.updateTextPositions(int, float, boolean):void");
    }

    void updateText(int i, PagerAdapter pagerAdapter) {
        CharSequence charSequence;
        CharSequence charSequence2 = null;
        if (pagerAdapter != null) {
            try {
                int count = pagerAdapter.getCount();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        count = 0;
        this.mUpdatingText = true;
        if (i < 1 || pagerAdapter == null) {
            charSequence = null;
        } else {
            charSequence = pagerAdapter.getPageTitle(i - 1);
        }
        try {
            this.mPrevText.setText(charSequence);
            TextView textView = this.mCurrText;
            if (pagerAdapter == null || i >= count) {
                charSequence = null;
            } else {
                charSequence = pagerAdapter.getPageTitle(i);
            }
            textView.setText(charSequence);
            if (i + 1 < count && pagerAdapter != null) {
                charSequence2 = pagerAdapter.getPageTitle(i + 1);
            }
            this.mNextText.setText(charSequence2);
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            count = MeasureSpec.makeMeasureSpec((int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f), Integer.MIN_VALUE);
            height = MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
            try {
                this.mPrevText.measure(count, height);
                this.mCurrText.measure(count, height);
                this.mNextText.measure(count, height);
                this.mLastKnownCurrentPage = i;
                if (!this.mUpdatingPositions) {
                    updateTextPositions(i, this.mLastKnownPositionOffset, false);
                }
                this.mUpdatingText = false;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            if (this.mPager != null) {
                updateAdapter(this.mPager.getAdapter(), null);
                this.mPager.setInternalPageChangeListener(null);
                this.mPager.setOnAdapterChangeListener(null);
                this.mPager = null;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    int getMinHeight() {
        Drawable background = getBackground();
        return background != null ? background.getIntrinsicHeight() : 0;
    }

    static float access$100(PagerTitleStrip pagerTitleStrip) {
        return pagerTitleStrip.mLastKnownPositionOffset;
    }

    public void setNonPrimaryAlpha(float f) {
        this.mNonPrimaryAlpha = ((int) (255.0f * f)) & 255;
        int i = (this.mNonPrimaryAlpha << 24) | (this.mTextColor & 16777215);
        this.mPrevText.setTextColor(i);
        this.mNextText.setTextColor(i);
    }

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            try {
                throw new IllegalStateException(z[1]);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        mode = getMinHeight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i3 = size2 - paddingTop;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec((int) (((float) size) * 0.8f), Integer.MIN_VALUE);
        i3 = MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        try {
            this.mPrevText.measure(makeMeasureSpec, i3);
            this.mCurrText.measure(makeMeasureSpec, i3);
            this.mNextText.measure(makeMeasureSpec, i3);
            if (mode2 == 1073741824) {
                setMeasuredDimension(size, size2);
                if (!ViewPager.a) {
                    return;
                }
            }
            setMeasuredDimension(size, Math.max(mode, this.mCurrText.getMeasuredHeight() + paddingTop));
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        try {
            if (parent instanceof ViewPager) {
                ViewPager viewPager = (ViewPager) parent;
                PagerAdapter adapter = viewPager.getAdapter();
                try {
                    PagerAdapter pagerAdapter;
                    viewPager.setInternalPageChangeListener(this.mPageListener);
                    viewPager.setOnAdapterChangeListener(this.mPageListener);
                    this.mPager = viewPager;
                    if (this.mWatchingAdapter != null) {
                        pagerAdapter = (PagerAdapter) this.mWatchingAdapter.get();
                    } else {
                        pagerAdapter = null;
                    }
                    updateAdapter(pagerAdapter, adapter);
                    return;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            throw new IllegalStateException(z[0]);
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void setTextSpacing(int i) {
        this.mScaledTextSpacing = i;
        requestLayout();
    }

    void updateAdapter(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            try {
                pagerAdapter.unregisterDataSetObserver(this.mPageListener);
                this.mWatchingAdapter = null;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        if (pagerAdapter2 != null) {
            try {
                pagerAdapter2.registerDataSetObserver(this.mPageListener);
                this.mWatchingAdapter = new WeakReference(pagerAdapter2);
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        try {
            if (this.mPager != null) {
                this.mLastKnownCurrentPage = -1;
                this.mLastKnownPositionOffset = -1.0f;
                updateText(this.mPager.getCurrentItem(), pagerAdapter2);
                requestLayout();
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = 0.0f;
        try {
            if (this.mPager != null) {
                if (this.mLastKnownPositionOffset >= 0.0f) {
                    f = this.mLastKnownPositionOffset;
                }
                updateTextPositions(this.mLastKnownCurrentPage, f, true);
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void requestLayout() {
        try {
            if (!this.mUpdatingText) {
                super.requestLayout();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        IMPL.setSingleLineAllCaps(textView);
    }
}
