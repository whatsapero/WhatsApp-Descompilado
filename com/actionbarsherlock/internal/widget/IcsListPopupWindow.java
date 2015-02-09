package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.actionbarsherlock.R;

public class IcsListPopupWindow {
    private ListAdapter mAdapter;
    private Context mContext;
    private View mDropDownAnchorView;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    private DropDownListView mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private Handler mHandler;
    private final ListSelectorHider mHideSelector;
    private OnItemClickListener mItemClickListener;
    private OnItemSelectedListener mItemSelectedListener;
    private int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private PopupWindow mPopup;
    private int mPromptPosition;
    private View mPromptView;
    private final ResizePopupRunnable mResizePopupRunnable;
    private final PopupScrollListener mScrollListener;
    private Rect mTempRect;
    private final PopupTouchInterceptor mTouchInterceptor;

    class DropDownListView extends ListView {
        private boolean mHijackFocus;
        private boolean mListSelectionHidden;

        public boolean isFocused() {
            return this.mHijackFocus || super.isFocused();
        }

        public boolean isInTouchMode() {
            return (this.mHijackFocus && this.mListSelectionHidden) || super.isInTouchMode();
        }

        static boolean access$502(DropDownListView dropDownListView, boolean z) {
            dropDownListView.mListSelectionHidden = z;
            return z;
        }

        public boolean hasFocus() {
            return this.mHijackFocus || super.hasFocus();
        }

        public DropDownListView(Context context, boolean z) {
            super(context, null, R.attr.dropDownListViewStyle);
            this.mHijackFocus = z;
            setCacheColorHint(0);
        }

        public boolean hasWindowFocus() {
            return this.mHijackFocus || super.hasWindowFocus();
        }
    }

    class ListSelectorHider implements Runnable {
        final IcsListPopupWindow this$0;

        private ListSelectorHider(IcsListPopupWindow icsListPopupWindow) {
            this.this$0 = icsListPopupWindow;
        }

        public void run() {
            this.this$0.clearListSelection();
        }

        ListSelectorHider(IcsListPopupWindow icsListPopupWindow, AnonymousClass_1 anonymousClass_1) {
            this(icsListPopupWindow);
        }
    }

    class PopupDataSetObserver extends DataSetObserver {
        final IcsListPopupWindow this$0;

        PopupDataSetObserver(IcsListPopupWindow icsListPopupWindow, AnonymousClass_1 anonymousClass_1) {
            this(icsListPopupWindow);
        }

        public void onInvalidated() {
            this.this$0.dismiss();
        }

        public void onChanged() {
            if (this.this$0.isShowing()) {
                this.this$0.show();
            }
        }

        private PopupDataSetObserver(IcsListPopupWindow icsListPopupWindow) {
            this.this$0 = icsListPopupWindow;
        }
    }

    class PopupScrollListener implements OnScrollListener {
        final IcsListPopupWindow this$0;

        PopupScrollListener(IcsListPopupWindow icsListPopupWindow, AnonymousClass_1 anonymousClass_1) {
            this(icsListPopupWindow);
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !IcsListPopupWindow.access$1100(this.this$0) && IcsListPopupWindow.access$800(this.this$0).getContentView() != null) {
                IcsListPopupWindow.access$1000(this.this$0).removeCallbacks(IcsListPopupWindow.access$900(this.this$0));
                IcsListPopupWindow.access$900(this.this$0).run();
            }
        }

        private PopupScrollListener(IcsListPopupWindow icsListPopupWindow) {
            this.this$0 = icsListPopupWindow;
        }
    }

    class PopupTouchInterceptor implements OnTouchListener {
        final IcsListPopupWindow this$0;

        private PopupTouchInterceptor(IcsListPopupWindow icsListPopupWindow) {
            this.this$0 = icsListPopupWindow;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
            /*
            r6_this = this;
            r0 = r8.getAction();
            r1 = r8.getX();
            r1 = (int) r1;
            r2 = r8.getY();
            r2 = (int) r2;
            if (r0 != 0) goto L_0x0055;
        L_0x0010:
            r3 = r6.this$0;
            r3 = com.actionbarsherlock.internal.widget.IcsListPopupWindow.access$800(r3);
            if (r3 == 0) goto L_0x0055;
        L_0x0018:
            r3 = r6.this$0;
            r3 = com.actionbarsherlock.internal.widget.IcsListPopupWindow.access$800(r3);
            r3 = r3.isShowing();
            if (r3 == 0) goto L_0x0055;
        L_0x0024:
            if (r1 < 0) goto L_0x0055;
        L_0x0026:
            r3 = r6.this$0;
            r3 = com.actionbarsherlock.internal.widget.IcsListPopupWindow.access$800(r3);
            r3 = r3.getWidth();
            if (r1 >= r3) goto L_0x0055;
        L_0x0032:
            if (r2 < 0) goto L_0x0055;
        L_0x0034:
            r1 = r6.this$0;
            r1 = com.actionbarsherlock.internal.widget.IcsListPopupWindow.access$800(r1);
            r1 = r1.getHeight();
            if (r2 >= r1) goto L_0x0055;
        L_0x0040:
            r1 = r6.this$0;
            r1 = com.actionbarsherlock.internal.widget.IcsListPopupWindow.access$1000(r1);
            r2 = r6.this$0;
            r2 = com.actionbarsherlock.internal.widget.IcsListPopupWindow.access$900(r2);
            r4 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
            r1.postDelayed(r2, r4);
            r1 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
            if (r1 == 0) goto L_0x0067;
        L_0x0055:
            r1 = 1;
            if (r0 != r1) goto L_0x0067;
        L_0x0058:
            r0 = r6.this$0;
            r0 = com.actionbarsherlock.internal.widget.IcsListPopupWindow.access$1000(r0);
            r1 = r6.this$0;
            r1 = com.actionbarsherlock.internal.widget.IcsListPopupWindow.access$900(r1);
            r0.removeCallbacks(r1);
        L_0x0067:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsListPopupWindow.PopupTouchInterceptor.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }

        PopupTouchInterceptor(IcsListPopupWindow icsListPopupWindow, AnonymousClass_1 anonymousClass_1) {
            this(icsListPopupWindow);
        }
    }

    class ResizePopupRunnable implements Runnable {
        final IcsListPopupWindow this$0;

        public void run() {
            if (IcsListPopupWindow.access$600(this.this$0) != null && IcsListPopupWindow.access$600(this.this$0).getCount() > IcsListPopupWindow.access$600(this.this$0).getChildCount() && IcsListPopupWindow.access$600(this.this$0).getChildCount() <= IcsListPopupWindow.access$700(this.this$0)) {
                IcsListPopupWindow.access$800(this.this$0).setInputMethodMode(2);
                this.this$0.show();
            }
        }

        private ResizePopupRunnable(IcsListPopupWindow icsListPopupWindow) {
            this.this$0 = icsListPopupWindow;
        }

        ResizePopupRunnable(IcsListPopupWindow icsListPopupWindow, AnonymousClass_1 anonymousClass_1) {
            this(icsListPopupWindow);
        }
    }

    static int access$700(IcsListPopupWindow icsListPopupWindow) {
        return icsListPopupWindow.mListItemExpandMaximum;
    }

    public void setPromptPosition(int i) {
        this.mPromptPosition = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void show() {
        /*
        r11_this = this;
        r10 = 1;
        r9 = -2;
        r1 = 0;
        r6 = -1;
        r8 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r7 = r11.buildDropDown();
        r0 = r11.isInputMethodNotNeeded();
        r2 = r11.mPopup;
        r2 = r2.isShowing();
        if (r2 == 0) goto L_0x00e9;
    L_0x0016:
        r2 = r11.mDropDownWidth;
        if (r2 != r6) goto L_0x001c;
    L_0x001a:
        if (r8 == 0) goto L_0x00e6;
    L_0x001c:
        r2 = r11.mDropDownWidth;
        if (r2 != r9) goto L_0x0028;
    L_0x0020:
        r2 = r11.mDropDownAnchorView;
        r4 = r2.getWidth();
        if (r8 == 0) goto L_0x002a;
    L_0x0028:
        r4 = r11.mDropDownWidth;
    L_0x002a:
        r2 = r11.mDropDownHeight;
        if (r2 != r6) goto L_0x004b;
    L_0x002e:
        if (r0 == 0) goto L_0x00d9;
    L_0x0030:
        r5 = r7;
    L_0x0031:
        if (r0 == 0) goto L_0x003f;
    L_0x0033:
        r2 = r11.mPopup;
        r0 = r11.mDropDownWidth;
        if (r0 != r6) goto L_0x00dc;
    L_0x0039:
        r0 = r6;
    L_0x003a:
        r2.setWindowLayoutMode(r0, r1);
        if (r8 == 0) goto L_0x0053;
    L_0x003f:
        r0 = r11.mPopup;
        r2 = r11.mDropDownWidth;
        if (r2 != r6) goto L_0x0046;
    L_0x0045:
        r1 = r6;
    L_0x0046:
        r0.setWindowLayoutMode(r1, r6);
        if (r8 == 0) goto L_0x0053;
    L_0x004b:
        r0 = r11.mDropDownHeight;
        if (r0 != r9) goto L_0x0051;
    L_0x004f:
        if (r8 == 0) goto L_0x00e3;
    L_0x0051:
        r5 = r11.mDropDownHeight;
    L_0x0053:
        r0 = r11.mPopup;
        r0.setOutsideTouchable(r10);
        r0 = r11.mPopup;
        r1 = r11.mDropDownAnchorView;
        r2 = r11.mDropDownHorizontalOffset;
        r3 = r11.mDropDownVerticalOffset;
        r0.update(r1, r2, r3, r4, r5);
        if (r8 == 0) goto L_0x00d8;
    L_0x0065:
        r0 = r11.mDropDownWidth;
        if (r0 != r6) goto L_0x006c;
    L_0x0069:
        if (r8 == 0) goto L_0x00e1;
    L_0x006b:
        r4 = r6;
    L_0x006c:
        r0 = r11.mDropDownWidth;
        if (r0 != r9) goto L_0x007d;
    L_0x0070:
        r0 = r11.mPopup;
        r1 = r11.mDropDownAnchorView;
        r1 = r1.getWidth();
        r0.setWidth(r1);
        if (r8 == 0) goto L_0x0084;
    L_0x007d:
        r0 = r11.mPopup;
        r1 = r11.mDropDownWidth;
        r0.setWidth(r1);
    L_0x0084:
        r0 = r11.mDropDownHeight;
        if (r0 != r6) goto L_0x008b;
    L_0x0088:
        if (r8 == 0) goto L_0x00df;
    L_0x008a:
        r5 = r6;
    L_0x008b:
        r0 = r11.mDropDownHeight;
        if (r0 != r9) goto L_0x0096;
    L_0x008f:
        r0 = r11.mPopup;
        r0.setHeight(r7);
        if (r8 == 0) goto L_0x009d;
    L_0x0096:
        r0 = r11.mPopup;
        r1 = r11.mDropDownHeight;
        r0.setHeight(r1);
    L_0x009d:
        r0 = r11.mPopup;
        r0.setWindowLayoutMode(r4, r5);
        r0 = r11.mPopup;
        r0.setOutsideTouchable(r10);
        r0 = r11.mPopup;
        r1 = r11.mTouchInterceptor;
        r0.setTouchInterceptor(r1);
        r0 = r11.mPopup;
        r1 = r11.mDropDownAnchorView;
        r2 = r11.mDropDownHorizontalOffset;
        r3 = r11.mDropDownVerticalOffset;
        r0.showAsDropDown(r1, r2, r3);
        r0 = r11.mDropDownList;
        r0.setSelection(r6);
        r0 = r11.mModal;
        if (r0 == 0) goto L_0x00ca;
    L_0x00c2:
        r0 = r11.mDropDownList;
        r0 = r0.isInTouchMode();
        if (r0 == 0) goto L_0x00cd;
    L_0x00ca:
        r11.clearListSelection();
    L_0x00cd:
        r0 = r11.mModal;
        if (r0 != 0) goto L_0x00d8;
    L_0x00d1:
        r0 = r11.mHandler;
        r1 = r11.mHideSelector;
        r0.post(r1);
    L_0x00d8:
        return;
    L_0x00d9:
        r5 = r6;
        goto L_0x0031;
    L_0x00dc:
        r0 = r1;
        goto L_0x003a;
    L_0x00df:
        r5 = r6;
        goto L_0x009d;
    L_0x00e1:
        r4 = r6;
        goto L_0x0084;
    L_0x00e3:
        r5 = r7;
        goto L_0x0053;
    L_0x00e6:
        r4 = r6;
        goto L_0x002a;
    L_0x00e9:
        r5 = r1;
        r4 = r1;
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsListPopupWindow.show():void");
    }

    public IcsListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this.mDropDownHeight = -2;
        this.mDropDownWidth = -2;
        this.mListItemExpandMaximum = Integer.MAX_VALUE;
        this.mPromptPosition = 0;
        this.mResizePopupRunnable = new ResizePopupRunnable(this, null);
        this.mTouchInterceptor = new PopupTouchInterceptor(this, null);
        this.mScrollListener = new PopupScrollListener(this, null);
        this.mHideSelector = new ListSelectorHider(this, null);
        this.mHandler = new Handler();
        this.mTempRect = new Rect();
        this.mContext = context;
        this.mPopup = new PopupWindow(context, attributeSet, i);
        this.mPopup.setInputMethodMode(1);
    }

    public void setAnchorView(View view) {
        this.mDropDownAnchorView = view;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mItemClickListener = onItemClickListener;
    }

    public boolean isShowing() {
        return this.mPopup.isShowing();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAdapter(android.widget.ListAdapter r3) {
        /*
        r2_this = this;
        r0 = r2.mObserver;
        if (r0 != 0) goto L_0x0010;
    L_0x0004:
        r0 = new com.actionbarsherlock.internal.widget.IcsListPopupWindow$PopupDataSetObserver;
        r1 = 0;
        r0.<init>(r2, r1);
        r2.mObserver = r0;
        r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        if (r0 == 0) goto L_0x001b;
    L_0x0010:
        r0 = r2.mAdapter;
        if (r0 == 0) goto L_0x001b;
    L_0x0014:
        r0 = r2.mAdapter;
        r1 = r2.mObserver;
        r0.unregisterDataSetObserver(r1);
    L_0x001b:
        r2.mAdapter = r3;
        r0 = r2.mAdapter;
        if (r0 == 0) goto L_0x0026;
    L_0x0021:
        r0 = r2.mObserver;
        r3.registerDataSetObserver(r0);
    L_0x0026:
        r0 = r2.mDropDownList;
        if (r0 == 0) goto L_0x0031;
    L_0x002a:
        r0 = r2.mDropDownList;
        r1 = r2.mAdapter;
        r0.setAdapter(r1);
    L_0x0031:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsListPopupWindow.setAdapter(android.widget.ListAdapter):void");
    }

    public void setVerticalOffset(int i) {
        this.mDropDownVerticalOffset = i;
        this.mDropDownVerticalOffsetSet = true;
    }

    static DropDownListView access$600(IcsListPopupWindow icsListPopupWindow) {
        return icsListPopupWindow.mDropDownList;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mPopup.setOnDismissListener(onDismissListener);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void measureScrapChild(android.view.View r5, int r6, int r7) {
        /*
        r4_this = this;
        r3 = 0;
        r0 = r5.getLayoutParams();
        r0 = (android.widget.AbsListView.LayoutParams) r0;
        if (r0 != 0) goto L_0x0013;
    L_0x0009:
        r0 = new android.widget.AbsListView$LayoutParams;
        r1 = -1;
        r2 = -2;
        r0.<init>(r1, r2, r3);
        r5.setLayoutParams(r0);
    L_0x0013:
        r1 = r4.mDropDownList;
        r1 = r1.getPaddingLeft();
        r2 = r4.mDropDownList;
        r2 = r2.getPaddingRight();
        r1 = r1 + r2;
        r2 = r0.width;
        r1 = android.view.ViewGroup.getChildMeasureSpec(r7, r1, r2);
        r0 = r0.height;
        if (r0 <= 0) goto L_0x0034;
    L_0x002a:
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2);
        r2 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        if (r2 == 0) goto L_0x0038;
    L_0x0034:
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3);
    L_0x0038:
        r5.measure(r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsListPopupWindow.measureScrapChild(android.view.View, int, int):void");
    }

    public IcsListPopupWindow(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    static PopupWindow access$800(IcsListPopupWindow icsListPopupWindow) {
        return icsListPopupWindow.mPopup;
    }

    static boolean access$1100(IcsListPopupWindow icsListPopupWindow) {
        return icsListPopupWindow.isInputMethodNotNeeded();
    }

    public ListView getListView() {
        return this.mDropDownList;
    }

    static ResizePopupRunnable access$900(IcsListPopupWindow icsListPopupWindow) {
        return icsListPopupWindow.mResizePopupRunnable;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int buildDropDown() {
        /*
        r9_this = this;
        r3 = -1;
        r2 = 1;
        r1 = 0;
        r5 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r0 = r9.mDropDownList;
        if (r0 != 0) goto L_0x0116;
    L_0x0009:
        r6 = r9.mContext;
        r4 = new com.actionbarsherlock.internal.widget.IcsListPopupWindow$DropDownListView;
        r0 = r9.mModal;
        if (r0 != 0) goto L_0x00e9;
    L_0x0011:
        r0 = r2;
    L_0x0012:
        r4.<init>(r6, r0);
        r9.mDropDownList = r4;
        r0 = r9.mDropDownListHighlight;
        if (r0 == 0) goto L_0x0022;
    L_0x001b:
        r0 = r9.mDropDownList;
        r4 = r9.mDropDownListHighlight;
        r0.setSelector(r4);
    L_0x0022:
        r0 = r9.mDropDownList;
        r4 = r9.mAdapter;
        r0.setAdapter(r4);
        r0 = r9.mDropDownList;
        r4 = r9.mItemClickListener;
        r0.setOnItemClickListener(r4);
        r0 = r9.mDropDownList;
        r0.setFocusable(r2);
        r0 = r9.mDropDownList;
        r0.setFocusableInTouchMode(r2);
        r0 = r9.mDropDownList;
        r4 = new com.actionbarsherlock.internal.widget.IcsListPopupWindow$1;
        r4.<init>(r9);
        r0.setOnItemSelectedListener(r4);
        r0 = r9.mDropDownList;
        r4 = r9.mScrollListener;
        r0.setOnScrollListener(r4);
        r0 = r9.mItemSelectedListener;
        if (r0 == 0) goto L_0x0056;
    L_0x004f:
        r0 = r9.mDropDownList;
        r4 = r9.mItemSelectedListener;
        r0.setOnItemSelectedListener(r4);
    L_0x0056:
        r0 = r9.mDropDownList;
        r7 = r9.mPromptView;
        if (r7 == 0) goto L_0x0112;
    L_0x005c:
        r4 = new android.widget.LinearLayout;
        r4.<init>(r6);
        r4.setOrientation(r2);
        r6 = new android.widget.LinearLayout$LayoutParams;
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6.<init>(r3, r1, r8);
        r8 = r9.mPromptPosition;
        switch(r8) {
            case 0: goto L_0x00f4;
            case 1: goto L_0x00ec;
            default: goto L_0x0070;
        };
    L_0x0070:
        r0 = r9.mDropDownWidth;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6);
        r7.measure(r0, r1);
        r0 = r7.getLayoutParams();
        r0 = (android.widget.LinearLayout.LayoutParams) r0;
        r6 = r7.getMeasuredHeight();
        r7 = r0.topMargin;
        r6 = r6 + r7;
        r0 = r0.bottomMargin;
        r0 = r0 + r6;
    L_0x008b:
        r6 = r9.mPopup;
        r6.setContentView(r4);
        if (r5 == 0) goto L_0x0110;
    L_0x0092:
        r4 = r0;
    L_0x0093:
        r0 = r9.mPopup;
        r0 = r0.getContentView();
        r0 = (android.view.ViewGroup) r0;
        r5 = r9.mPromptView;
        if (r5 == 0) goto L_0x010e;
    L_0x009f:
        r0 = r5.getLayoutParams();
        r0 = (android.widget.LinearLayout.LayoutParams) r0;
        r4 = r5.getMeasuredHeight();
        r5 = r0.topMargin;
        r4 = r4 + r5;
        r0 = r0.bottomMargin;
        r0 = r0 + r4;
        r6 = r0;
    L_0x00b0:
        r0 = r9.mPopup;
        r0 = r0.getBackground();
        if (r0 == 0) goto L_0x010c;
    L_0x00b8:
        r4 = r9.mTempRect;
        r0.getPadding(r4);
        r0 = r9.mTempRect;
        r0 = r0.top;
        r4 = r9.mTempRect;
        r4 = r4.bottom;
        r0 = r0 + r4;
        r4 = r9.mDropDownVerticalOffsetSet;
        if (r4 != 0) goto L_0x00d1;
    L_0x00ca:
        r4 = r9.mTempRect;
        r4 = r4.top;
        r4 = -r4;
        r9.mDropDownVerticalOffset = r4;
    L_0x00d1:
        r7 = r0;
    L_0x00d2:
        r0 = r9.mPopup;
        r0 = r0.getInputMethodMode();
        r4 = 2;
        if (r0 != r4) goto L_0x00fc;
    L_0x00db:
        r0 = r9.mDropDownAnchorView;
        r4 = r9.mDropDownVerticalOffset;
        r0 = r9.getMaxAvailableHeight(r0, r4, r2);
        r2 = r9.mDropDownHeight;
        if (r2 != r3) goto L_0x00fe;
    L_0x00e7:
        r0 = r0 + r7;
    L_0x00e8:
        return r0;
    L_0x00e9:
        r0 = r1;
        goto L_0x0012;
    L_0x00ec:
        r4.addView(r0, r6);
        r4.addView(r7);
        if (r5 == 0) goto L_0x0070;
    L_0x00f4:
        r4.addView(r7);
        r4.addView(r0, r6);
        goto L_0x0070;
    L_0x00fc:
        r2 = r1;
        goto L_0x00db;
    L_0x00fe:
        r4 = r0 - r6;
        r0 = r9;
        r2 = r1;
        r5 = r3;
        r0 = r0.measureHeightOfChildren(r1, r2, r3, r4, r5);
        if (r0 <= 0) goto L_0x010a;
    L_0x0109:
        r6 = r6 + r7;
    L_0x010a:
        r0 = r0 + r6;
        goto L_0x00e8;
    L_0x010c:
        r7 = r1;
        goto L_0x00d2;
    L_0x010e:
        r6 = r4;
        goto L_0x00b0;
    L_0x0110:
        r6 = r0;
        goto L_0x00b0;
    L_0x0112:
        r4 = r0;
        r0 = r1;
        goto L_0x008b;
    L_0x0116:
        r4 = r1;
        goto L_0x0093;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsListPopupWindow.buildDropDown():int");
    }

    public void dismiss() {
        this.mPopup.dismiss();
        if (this.mPromptView != null) {
            ViewParent parent = this.mPromptView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mPromptView);
            }
        }
        this.mPopup.setContentView(null);
        this.mDropDownList = null;
        this.mHandler.removeCallbacks(this.mResizePopupRunnable);
    }

    private boolean isInputMethodNotNeeded() {
        return this.mPopup.getInputMethodMode() == 2;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.mPopup.setBackgroundDrawable(drawable);
    }

    private int measureHeightOfChildren(int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        boolean z = AbsActionBarView.b;
        ListAdapter listAdapter = this.mAdapter;
        if (listAdapter == null) {
            return this.mDropDownList.getListPaddingTop() + this.mDropDownList.getListPaddingBottom();
        }
        int i7;
        int listPaddingTop = this.mDropDownList.getListPaddingTop() + this.mDropDownList.getListPaddingBottom();
        if (this.mDropDownList.getDividerHeight() <= 0 || this.mDropDownList.getDivider() == null) {
            i7 = 0;
        } else {
            i7 = this.mDropDownList.getDividerHeight();
        }
        if (i3 == -1) {
            i3 = listAdapter.getCount() - 1;
        }
        while (i2 <= i3) {
            View view = this.mAdapter.getView(i2, null, this.mDropDownList);
            if (this.mDropDownList.getCacheColorHint() != 0) {
                view.setDrawingCacheBackgroundColor(this.mDropDownList.getCacheColorHint());
            }
            measureScrapChild(view, i2, i);
            if (i2 > 0) {
                listPaddingTop += i7;
            }
            listPaddingTop += view.getMeasuredHeight();
            if (listPaddingTop < i4) {
                if (i5 >= 0 && i2 >= i5) {
                    i6 = listPaddingTop;
                }
                i2++;
                if (z) {
                    break;
                }
            }
            return (i5 < 0 || i2 <= i5 || i6 <= 0 || listPaddingTop == i4) ? i4 : i6;
        }
        return listPaddingTop;
    }

    public void setContentWidth(int i) {
        Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            this.mDropDownWidth = (this.mTempRect.left + this.mTempRect.right) + i;
            if (!AbsActionBarView.b) {
                return;
            }
        }
        this.mDropDownWidth = i;
    }

    public void clearListSelection() {
        DropDownListView dropDownListView = this.mDropDownList;
        if (dropDownListView != null) {
            DropDownListView.access$502(dropDownListView, true);
            dropDownListView.requestLayout();
        }
    }

    public void setHorizontalOffset(int i) {
        this.mDropDownHorizontalOffset = i;
    }

    public void setModal(boolean z) {
        this.mModal = true;
        this.mPopup.setFocusable(z);
    }

    public void setInputMethodMode(int i) {
        this.mPopup.setInputMethodMode(i);
    }

    static Handler access$1000(IcsListPopupWindow icsListPopupWindow) {
        return icsListPopupWindow.mHandler;
    }

    private int getMaxAvailableHeight(View view, int i, boolean z) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = rect.bottom;
        if (z) {
            i2 = view.getContext().getResources().getDisplayMetrics().heightPixels;
        }
        i2 = Math.max((i2 - (iArr[1] + view.getHeight())) - i, (iArr[1] - rect.top) + i);
        if (this.mPopup.getBackground() == null) {
            return i2;
        }
        this.mPopup.getBackground().getPadding(this.mTempRect);
        return i2 - (this.mTempRect.top + this.mTempRect.bottom);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IcsListPopupWindow(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
        /*
        r2_this = this;
        r0 = -2;
        r1 = 0;
        r2.<init>();
        r2.mDropDownHeight = r0;
        r2.mDropDownWidth = r0;
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r2.mListItemExpandMaximum = r0;
        r0 = 0;
        r2.mPromptPosition = r0;
        r0 = new com.actionbarsherlock.internal.widget.IcsListPopupWindow$ResizePopupRunnable;
        r0.<init>(r2, r1);
        r2.mResizePopupRunnable = r0;
        r0 = new com.actionbarsherlock.internal.widget.IcsListPopupWindow$PopupTouchInterceptor;
        r0.<init>(r2, r1);
        r2.mTouchInterceptor = r0;
        r0 = new com.actionbarsherlock.internal.widget.IcsListPopupWindow$PopupScrollListener;
        r0.<init>(r2, r1);
        r2.mScrollListener = r0;
        r0 = new com.actionbarsherlock.internal.widget.IcsListPopupWindow$ListSelectorHider;
        r0.<init>(r2, r1);
        r2.mHideSelector = r0;
        r0 = new android.os.Handler;
        r0.<init>();
        r2.mHandler = r0;
        r0 = new android.graphics.Rect;
        r0.<init>();
        r2.mTempRect = r0;
        r2.mContext = r3;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 >= r1) goto L_0x0053;
    L_0x0043:
        r0 = new android.view.ContextThemeWrapper;
        r0.<init>(r3, r6);
        r1 = new android.widget.PopupWindow;
        r1.<init>(r0, r4, r5);
        r2.mPopup = r1;
        r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        if (r0 == 0) goto L_0x005a;
    L_0x0053:
        r0 = new android.widget.PopupWindow;
        r0.<init>(r3, r4, r5, r6);
        r2.mPopup = r0;
    L_0x005a:
        r0 = r2.mPopup;
        r1 = 1;
        r0.setInputMethodMode(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsListPopupWindow.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
