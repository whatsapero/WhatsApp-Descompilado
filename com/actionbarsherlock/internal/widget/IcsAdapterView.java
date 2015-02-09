package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.CapturedViewProperty;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.widget.Adapter;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public abstract class IcsAdapterView extends ViewGroup {
    private static final String[] z;
    boolean mBlockLayoutRequests;
    boolean mDataChanged;
    private boolean mDesiredFocusableInTouchModeState;
    private boolean mDesiredFocusableState;
    private View mEmptyView;
    @ExportedProperty(category = "scrolling")
    int mFirstPosition;
    boolean mInLayout;
    @ExportedProperty(category = "list")
    int mItemCount;
    private int mLayoutHeight;
    boolean mNeedSync;
    @ExportedProperty(category = "list")
    int mNextSelectedPosition;
    long mNextSelectedRowId;
    int mOldItemCount;
    int mOldSelectedPosition;
    long mOldSelectedRowId;
    OnItemSelectedListener mOnItemSelectedListener;
    @ExportedProperty(category = "list")
    int mSelectedPosition;
    long mSelectedRowId;
    private SelectionNotifier mSelectionNotifier;
    int mSpecificTop;
    long mSyncHeight;
    int mSyncMode;
    int mSyncPosition;
    long mSyncRowId;

    public interface OnItemSelectedListener {
        void onItemSelected(IcsAdapterView icsAdapterView, View view, int i, long j);

        void onNothingSelected(IcsAdapterView icsAdapterView);
    }

    class AdapterDataSetObserver extends DataSetObserver {
        private Parcelable mInstanceState;
        final IcsAdapterView this$0;

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged() {
            /*
            r2_this = this;
            r0 = r2.this$0;
            r1 = 1;
            r0.mDataChanged = r1;
            r0 = r2.this$0;
            r1 = r2.this$0;
            r1 = r1.mItemCount;
            r0.mOldItemCount = r1;
            r0 = r2.this$0;
            r1 = r2.this$0;
            r1 = r1.getAdapter();
            r1 = r1.getCount();
            r0.mItemCount = r1;
            r0 = r2.this$0;
            r0 = r0.getAdapter();
            r0 = r0.hasStableIds();
            if (r0 == 0) goto L_0x0045;
        L_0x0027:
            r0 = r2.mInstanceState;
            if (r0 == 0) goto L_0x0045;
        L_0x002b:
            r0 = r2.this$0;
            r0 = r0.mOldItemCount;
            if (r0 != 0) goto L_0x0045;
        L_0x0031:
            r0 = r2.this$0;
            r0 = r0.mItemCount;
            if (r0 <= 0) goto L_0x0045;
        L_0x0037:
            r0 = r2.this$0;
            r1 = r2.mInstanceState;
            com.actionbarsherlock.internal.widget.IcsAdapterView.access$000(r0, r1);
            r0 = 0;
            r2.mInstanceState = r0;
            r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
            if (r0 == 0) goto L_0x004a;
        L_0x0045:
            r0 = r2.this$0;
            r0.rememberSyncState();
        L_0x004a:
            r0 = r2.this$0;
            r0.checkFocus();
            r0 = r2.this$0;
            r0.requestLayout();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsAdapterView.AdapterDataSetObserver.onChanged():void");
        }

        AdapterDataSetObserver(IcsAdapterView icsAdapterView) {
            this.this$0 = icsAdapterView;
            this.mInstanceState = null;
        }

        public void onInvalidated() {
            this.this$0.mDataChanged = true;
            if (this.this$0.getAdapter().hasStableIds()) {
                this.mInstanceState = IcsAdapterView.access$100(this.this$0);
            }
            this.this$0.mOldItemCount = this.this$0.mItemCount;
            this.this$0.mItemCount = 0;
            this.this$0.mSelectedPosition = -1;
            this.this$0.mSelectedRowId = Long.MIN_VALUE;
            this.this$0.mNextSelectedPosition = -1;
            this.this$0.mNextSelectedRowId = Long.MIN_VALUE;
            this.this$0.mNeedSync = false;
            this.this$0.checkFocus();
            this.this$0.requestLayout();
        }
    }

    class SelectionNotifier implements Runnable {
        final IcsAdapterView this$0;

        public void run() {
            if (this.this$0.mDataChanged) {
                if (this.this$0.getAdapter() != null) {
                    this.this$0.post(this);
                    if (!AbsActionBarView.b) {
                        return;
                    }
                }
                return;
            }
            IcsAdapterView.access$200(this.this$0);
        }

        SelectionNotifier(IcsAdapterView icsAdapterView, AnonymousClass_1 anonymousClass_1) {
            this(icsAdapterView);
        }

        private SelectionNotifier(IcsAdapterView icsAdapterView) {
            this.this$0 = icsAdapterView;
        }
    }

    static {
        String[] strArr = new String[8];
        String str = "\u0004D,s[\u0000W`s[\u0000Wd\u0005[\u000bTa\u0005[\u0016\u0000&JFES=UB\nR<@VEI&\u0005s\u0001A8QW\u0017v!@E";
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
                        i3 = 32;
                        break;
                    case ay.n /*2*/:
                        i3 = 72;
                        break;
                    case ay.p /*3*/:
                        i3 = 37;
                        break;
                    default:
                        i3 = 50;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0017E%JD\u0000v!@EMv!@EL\u0000!V\u0012\u000bO<\u0005A\u0010P8J@\u0011E,\u0005[\u000b\u0000\tAS\u0015T-Wd\fE?";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "!O&\u0002FEC)I^ES-Q}\u000bc$LQ\u000el!VF\u0000N-W\u0012\u0003O:\u0005S\u000b\u0000\tAS\u0015T-Wd\fE?\u000b\u0012<O=\u0005B\u0017O*DP\tYhRS\u000bThVW\u0011o&lF\u0000M\u000bI[\u0006K\u0004LA\u0011E&@@EI&VF\u0000A,";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0017E%JD\u0000v!@E$T`L\\\u0011\thLAEN'Q\u0012\u0016U8U]\u0017T-A\u0012\fNhdV\u0004P<@@3I-R";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0004D,s[\u0000W`s[\u0000Wd\u0005[\u000bTd\u0005~\u0004Y'PF5A:D_\u0016\thLAEN'Q\u0012\u0016U8U]\u0017T-A\u0012\fNhdV\u0004P<@@3I-R";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0017E%JD\u0000a$Id\fE?V\u001aL\u0000!V\u0012\u000bO<\u0005A\u0010P8J@\u0011E,\u0005[\u000b\u0000\tAS\u0015T-Wd\fE?";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0004D,s[\u0000W`s[\u0000Wa\u0005[\u0016\u0000&JFES=UB\nR<@VEI&\u0005s\u0001A8QW\u0017v!@E";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0004D,s[\u0000W`s[\u0000Wd\u0005~\u0004Y'PF5A:D_\u0016\thLAEN'Q\u0012\u0016U8U]\u0017T-A\u0012\fNhdV\u0004P<@@3I-R";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public abstract Adapter getAdapter();

    public abstract View getSelectedView();

    public void addView(View view) {
        throw new UnsupportedOperationException(z[7]);
    }

    public void removeViewAt(int i) {
        throw new UnsupportedOperationException(z[4]);
    }

    public boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (!super.onRequestSendAccessibilityEvent(view, accessibilityEvent)) {
            return false;
        }
        AccessibilityRecord obtain = AccessibilityEvent.obtain();
        onInitializeAccessibilityEvent(obtain);
        view.dispatchPopulateAccessibilityEvent(obtain);
        accessibilityEvent.appendRecord(obtain);
        return true;
    }

    boolean isInFilterMode() {
        return false;
    }

    public void addView(View view, int i) {
        throw new UnsupportedOperationException(z[0]);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        throw new RuntimeException(z[3]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateEmptyStatus(boolean r9) {
        /*
        r8_this = this;
        r6 = 0;
        r7 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r0 = r8.isInFilterMode();
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        r9 = r6;
    L_0x000a:
        if (r9 == 0) goto L_0x003c;
    L_0x000c:
        r0 = r8.mEmptyView;	 Catch:{ UnsupportedOperationException -> 0x004b }
        if (r0 == 0) goto L_0x001d;
    L_0x0010:
        r0 = r8.mEmptyView;	 Catch:{ UnsupportedOperationException -> 0x004d }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ UnsupportedOperationException -> 0x004d }
        r0 = 8;
        r8.setVisibility(r0);	 Catch:{ UnsupportedOperationException -> 0x004d }
        if (r7 == 0) goto L_0x0021;
    L_0x001d:
        r0 = 0;
        r8.setVisibility(r0);	 Catch:{ UnsupportedOperationException -> 0x004d }
    L_0x0021:
        r0 = r8.mDataChanged;	 Catch:{ UnsupportedOperationException -> 0x004f }
        if (r0 == 0) goto L_0x004a;
    L_0x0025:
        r1 = 0;
        r2 = r8.getLeft();	 Catch:{ UnsupportedOperationException -> 0x0051 }
        r3 = r8.getTop();	 Catch:{ UnsupportedOperationException -> 0x0051 }
        r4 = r8.getRight();	 Catch:{ UnsupportedOperationException -> 0x0051 }
        r5 = r8.getBottom();	 Catch:{ UnsupportedOperationException -> 0x0051 }
        r0 = r8;
        r0.onLayout(r1, r2, r3, r4, r5);	 Catch:{ UnsupportedOperationException -> 0x0051 }
        if (r7 == 0) goto L_0x004a;
    L_0x003c:
        r0 = r8.mEmptyView;	 Catch:{ UnsupportedOperationException -> 0x0053 }
        if (r0 == 0) goto L_0x0047;
    L_0x0040:
        r0 = r8.mEmptyView;	 Catch:{ UnsupportedOperationException -> 0x0053 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ UnsupportedOperationException -> 0x0053 }
    L_0x0047:
        r8.setVisibility(r6);
    L_0x004a:
        return;
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsAdapterView.updateEmptyStatus(boolean):void");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setScrollable(isScrollableForAccessibility());
        View selectedView = getSelectedView();
        if (selectedView != null) {
            try {
                accessibilityNodeInfo.setEnabled(selectedView.isEnabled());
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void selectionChanged() {
        /*
        r2_this = this;
        r0 = r2.mOnItemSelectedListener;	 Catch:{ UnsupportedOperationException -> 0x003a }
        if (r0 == 0) goto L_0x0024;
    L_0x0004:
        r0 = r2.mInLayout;	 Catch:{ UnsupportedOperationException -> 0x003c }
        if (r0 != 0) goto L_0x000c;
    L_0x0008:
        r0 = r2.mBlockLayoutRequests;	 Catch:{ UnsupportedOperationException -> 0x003e }
        if (r0 == 0) goto L_0x0021;
    L_0x000c:
        r0 = r2.mSelectionNotifier;	 Catch:{ UnsupportedOperationException -> 0x0040 }
        if (r0 != 0) goto L_0x0018;
    L_0x0010:
        r0 = new com.actionbarsherlock.internal.widget.IcsAdapterView$SelectionNotifier;	 Catch:{ UnsupportedOperationException -> 0x0040 }
        r1 = 0;
        r0.<init>(r2, r1);	 Catch:{ UnsupportedOperationException -> 0x0040 }
        r2.mSelectionNotifier = r0;	 Catch:{ UnsupportedOperationException -> 0x0040 }
    L_0x0018:
        r0 = r2.mSelectionNotifier;	 Catch:{ UnsupportedOperationException -> 0x0042 }
        r2.post(r0);	 Catch:{ UnsupportedOperationException -> 0x0042 }
        r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;	 Catch:{ UnsupportedOperationException -> 0x0042 }
        if (r0 == 0) goto L_0x0024;
    L_0x0021:
        r2.fireOnSelected();	 Catch:{ UnsupportedOperationException -> 0x0042 }
    L_0x0024:
        r0 = r2.mSelectedPosition;	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r1 = -1;
        if (r0 == r1) goto L_0x0039;
    L_0x0029:
        r0 = r2.isShown();	 Catch:{ UnsupportedOperationException -> 0x0046 }
        if (r0 == 0) goto L_0x0039;
    L_0x002f:
        r0 = r2.isInTouchMode();	 Catch:{ UnsupportedOperationException -> 0x0048 }
        if (r0 != 0) goto L_0x0039;
    L_0x0035:
        r0 = 4;
        r2.sendAccessibilityEvent(r0);	 Catch:{ UnsupportedOperationException -> 0x0048 }
    L_0x0039:
        return;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsAdapterView.selectionChanged():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFocusableInTouchMode(boolean r5) {
        /*
        r4_this = this;
        r1 = 0;
        r2 = 1;
        r0 = r4.getAdapter();
        if (r0 == 0) goto L_0x000e;
    L_0x0008:
        r0 = r0.getCount();	 Catch:{ UnsupportedOperationException -> 0x0024 }
        if (r0 != 0) goto L_0x0026;
    L_0x000e:
        r0 = r2;
    L_0x000f:
        r4.mDesiredFocusableInTouchModeState = r5;	 Catch:{ UnsupportedOperationException -> 0x0028 }
        if (r5 == 0) goto L_0x0016;
    L_0x0013:
        r3 = 1;
        r4.mDesiredFocusableState = r3;	 Catch:{ UnsupportedOperationException -> 0x0028 }
    L_0x0016:
        if (r5 == 0) goto L_0x002c;
    L_0x0018:
        if (r0 == 0) goto L_0x0020;
    L_0x001a:
        r0 = r4.isInFilterMode();	 Catch:{ UnsupportedOperationException -> 0x002a }
        if (r0 == 0) goto L_0x002c;
    L_0x0020:
        super.setFocusableInTouchMode(r2);
        return;
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = r1;
        goto L_0x000f;
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r2 = r1;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsAdapterView.setFocusableInTouchMode(boolean):void");
    }

    public void removeView(View view) {
        throw new UnsupportedOperationException(z[2]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFocusable(boolean r5) {
        /*
        r4_this = this;
        r2 = 1;
        r1 = 0;
        r0 = r4.getAdapter();
        if (r0 == 0) goto L_0x000e;
    L_0x0008:
        r0 = r0.getCount();	 Catch:{ UnsupportedOperationException -> 0x0024 }
        if (r0 != 0) goto L_0x0026;
    L_0x000e:
        r0 = r2;
    L_0x000f:
        r4.mDesiredFocusableState = r5;	 Catch:{ UnsupportedOperationException -> 0x0028 }
        if (r5 != 0) goto L_0x0016;
    L_0x0013:
        r3 = 0;
        r4.mDesiredFocusableInTouchModeState = r3;	 Catch:{ UnsupportedOperationException -> 0x0028 }
    L_0x0016:
        if (r5 == 0) goto L_0x002c;
    L_0x0018:
        if (r0 == 0) goto L_0x0020;
    L_0x001a:
        r0 = r4.isInFilterMode();	 Catch:{ UnsupportedOperationException -> 0x002a }
        if (r0 == 0) goto L_0x002c;
    L_0x0020:
        super.setFocusable(r2);
        return;
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = r1;
        goto L_0x000f;
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r2 = r1;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsAdapterView.setFocusable(boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void rememberSyncState() {
        /*
        r6_this = this;
        r5 = 1;
        r4 = 0;
        r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r1 = r6.getChildCount();	 Catch:{ UnsupportedOperationException -> 0x0064 }
        if (r1 <= 0) goto L_0x0063;
    L_0x000a:
        r1 = 1;
        r6.mNeedSync = r1;	 Catch:{ UnsupportedOperationException -> 0x0064 }
        r1 = r6.mLayoutHeight;	 Catch:{ UnsupportedOperationException -> 0x0064 }
        r2 = (long) r1;	 Catch:{ UnsupportedOperationException -> 0x0064 }
        r6.mSyncHeight = r2;	 Catch:{ UnsupportedOperationException -> 0x0064 }
        r1 = r6.mSelectedPosition;	 Catch:{ UnsupportedOperationException -> 0x0064 }
        if (r1 < 0) goto L_0x0033;
    L_0x0016:
        r1 = r6.mSelectedPosition;
        r2 = r6.mFirstPosition;
        r1 = r1 - r2;
        r1 = r6.getChildAt(r1);
        r2 = r6.mNextSelectedRowId;	 Catch:{ UnsupportedOperationException -> 0x0066 }
        r6.mSyncRowId = r2;	 Catch:{ UnsupportedOperationException -> 0x0066 }
        r2 = r6.mNextSelectedPosition;	 Catch:{ UnsupportedOperationException -> 0x0066 }
        r6.mSyncPosition = r2;	 Catch:{ UnsupportedOperationException -> 0x0066 }
        if (r1 == 0) goto L_0x002f;
    L_0x0029:
        r1 = r1.getTop();	 Catch:{ UnsupportedOperationException -> 0x0066 }
        r6.mSpecificTop = r1;	 Catch:{ UnsupportedOperationException -> 0x0066 }
    L_0x002f:
        r6.mSyncMode = r4;
        if (r0 == 0) goto L_0x0063;
    L_0x0033:
        r1 = r6.getChildAt(r4);
        r2 = r6.getAdapter();
        r3 = r6.mFirstPosition;	 Catch:{ UnsupportedOperationException -> 0x0068 }
        if (r3 < 0) goto L_0x0051;
    L_0x003f:
        r3 = r6.mFirstPosition;	 Catch:{ UnsupportedOperationException -> 0x006a }
        r4 = r2.getCount();	 Catch:{ UnsupportedOperationException -> 0x006a }
        if (r3 >= r4) goto L_0x0051;
    L_0x0047:
        r3 = r6.mFirstPosition;	 Catch:{ UnsupportedOperationException -> 0x006c }
        r2 = r2.getItemId(r3);	 Catch:{ UnsupportedOperationException -> 0x006c }
        r6.mSyncRowId = r2;	 Catch:{ UnsupportedOperationException -> 0x006c }
        if (r0 == 0) goto L_0x0055;
    L_0x0051:
        r2 = -1;
        r6.mSyncRowId = r2;	 Catch:{ UnsupportedOperationException -> 0x006c }
    L_0x0055:
        r0 = r6.mFirstPosition;	 Catch:{ UnsupportedOperationException -> 0x006e }
        r6.mSyncPosition = r0;	 Catch:{ UnsupportedOperationException -> 0x006e }
        if (r1 == 0) goto L_0x0061;
    L_0x005b:
        r0 = r1.getTop();	 Catch:{ UnsupportedOperationException -> 0x006e }
        r6.mSpecificTop = r0;	 Catch:{ UnsupportedOperationException -> 0x006e }
    L_0x0061:
        r6.mSyncMode = r5;
    L_0x0063:
        return;
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        throw r0;
    L_0x006e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsAdapterView.rememberSyncState():void");
    }

    @CapturedViewProperty
    public long getSelectedItemId() {
        return this.mNextSelectedRowId;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mLayoutHeight = getHeight();
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.mOnItemSelectedListener = onItemSelectedListener;
    }

    static Parcelable access$100(IcsAdapterView icsAdapterView) {
        return icsAdapterView.onSaveInstanceState();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mSelectionNotifier);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        throw new UnsupportedOperationException(z[5]);
    }

    int lookForSelectablePosition(int i, boolean z) {
        return i;
    }

    public int getFirstVisiblePosition() {
        return this.mFirstPosition;
    }

    public void addView(View view, LayoutParams layoutParams) {
        throw new UnsupportedOperationException(z[1]);
    }

    void checkSelectionChanged() {
        try {
            if (this.mSelectedPosition == this.mOldSelectedPosition) {
                try {
                    if (this.mSelectedRowId == this.mOldSelectedRowId) {
                        return;
                    }
                }
            }
            selectionChanged();
            this.mOldSelectedPosition = this.mSelectedPosition;
            this.mOldSelectedRowId = this.mSelectedRowId;
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setScrollable(isScrollableForAccessibility());
        View selectedView = getSelectedView();
        if (selectedView != null) {
            try {
                accessibilityEvent.setEnabled(selectedView.isEnabled());
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
        accessibilityEvent.setCurrentItemIndex(getSelectedItemPosition());
        accessibilityEvent.setFromIndex(getFirstVisiblePosition());
        accessibilityEvent.setToIndex(getLastVisiblePosition());
        accessibilityEvent.setItemCount(getCount());
    }

    private boolean isScrollableForAccessibility() {
        Adapter adapter = getAdapter();
        try {
            if (adapter == null) {
                return false;
            }
            int count = adapter.getCount();
            if (count <= 0) {
                return false;
            }
            try {
                if (getFirstVisiblePosition() <= 0) {
                    if (getLastVisiblePosition() >= count - 1) {
                        return false;
                    }
                }
                return true;
            } catch (UnsupportedOperationException e) {
                throw e;
            } catch (UnsupportedOperationException e2) {
                throw e2;
            }
        }
    }

    private void fireOnSelected() {
        try {
            if (this.mOnItemSelectedListener != null) {
                int selectedItemPosition = getSelectedItemPosition();
                try {
                    if (selectedItemPosition >= 0) {
                        View selectedView = getSelectedView();
                        this.mOnItemSelectedListener.onItemSelected(this, selectedView, selectedItemPosition, getAdapter().getItemId(selectedItemPosition));
                        if (!AbsActionBarView.b) {
                            return;
                        }
                    }
                    this.mOnItemSelectedListener.onNothingSelected(this);
                } catch (UnsupportedOperationException e) {
                    throw e;
                }
            }
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        View selectedView = getSelectedView();
        if (selectedView != null) {
            try {
                if (selectedView.getVisibility() == 0) {
                    if (selectedView.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                        return true;
                    }
                }
            } catch (UnsupportedOperationException e) {
                throw e;
            } catch (UnsupportedOperationException e2) {
                throw e2;
            }
        }
        try {
            return false;
        }
    }

    void setSelectedPositionInt(int i) {
        this.mSelectedPosition = i;
        this.mSelectedRowId = getItemIdAtPosition(i);
    }

    int findSyncPosition() {
        boolean z = AbsActionBarView.b;
        int i = this.mItemCount;
        if (i == 0) {
            return -1;
        }
        long j = this.mSyncRowId;
        int i2 = this.mSyncPosition;
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        int min = Math.min(i - 1, Math.max(0, i2));
        long uptimeMillis = SystemClock.uptimeMillis() + 100;
        Object obj = null;
        Adapter adapter = getAdapter();
        if (adapter == null) {
            return -1;
        }
        int i3 = min;
        int i4 = min;
        while (SystemClock.uptimeMillis() <= uptimeMillis) {
            if (adapter.getItemId(i4) != j) {
                Object obj2;
                Object obj3;
                if (min == i - 1) {
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                if (i3 == 0) {
                    obj3 = 1;
                } else {
                    obj3 = null;
                }
                if (obj2 != null && obj3 != null && !z) {
                    break;
                }
                if (obj3 != null || (r0 != null && obj2 == null)) {
                    min++;
                    obj = null;
                    if (z) {
                        i4 = min;
                    } else {
                        i4 = min;
                    }
                }
                if (obj2 != null || (r0 == null && obj3 == null)) {
                    i3--;
                    obj = 1;
                    if (z) {
                        break;
                    }
                    i4 = i3;
                }
            } else {
                return i4;
            }
        }
        return -1;
    }

    @CapturedViewProperty
    public int getCount() {
        return this.mItemCount;
    }

    void handleDataChanged() {
        boolean z = false;
        int i = this.mItemCount;
        if (i > 0) {
            try {
                int findSyncPosition;
                boolean z2;
                if (this.mNeedSync) {
                    this.mNeedSync = false;
                    findSyncPosition = findSyncPosition();
                    if (findSyncPosition >= 0 && lookForSelectablePosition(findSyncPosition, true) == findSyncPosition) {
                        setNextSelectedPositionInt(findSyncPosition);
                        z2 = true;
                        if (!z2) {
                            findSyncPosition = getSelectedItemPosition();
                            if (findSyncPosition >= i) {
                                findSyncPosition = i - 1;
                            }
                            if (findSyncPosition < 0) {
                                findSyncPosition = 0;
                            }
                            i = lookForSelectablePosition(findSyncPosition, true);
                            if (i >= 0) {
                                findSyncPosition = lookForSelectablePosition(findSyncPosition, false);
                            } else {
                                findSyncPosition = i;
                            }
                            if (findSyncPosition >= 0) {
                                setNextSelectedPositionInt(findSyncPosition);
                                checkSelectionChanged();
                                z = true;
                            }
                        }
                        z = z2;
                    }
                }
                z2 = false;
                if (z2) {
                    findSyncPosition = getSelectedItemPosition();
                    if (findSyncPosition >= i) {
                        findSyncPosition = i - 1;
                    }
                    if (findSyncPosition < 0) {
                        findSyncPosition = 0;
                    }
                    i = lookForSelectablePosition(findSyncPosition, true);
                    if (i >= 0) {
                        findSyncPosition = i;
                    } else {
                        findSyncPosition = lookForSelectablePosition(findSyncPosition, false);
                    }
                    if (findSyncPosition >= 0) {
                        setNextSelectedPositionInt(findSyncPosition);
                        checkSelectionChanged();
                        z = true;
                    }
                }
                z = z2;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
        if (!z) {
            try {
                this.mSelectedPosition = -1;
                this.mSelectedRowId = Long.MIN_VALUE;
                this.mNextSelectedPosition = -1;
                this.mNextSelectedRowId = Long.MIN_VALUE;
                this.mNeedSync = false;
                checkSelectionChanged();
            } catch (UnsupportedOperationException e2) {
                throw e2;
            }
        }
    }

    public IcsAdapterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFirstPosition = 0;
        this.mSyncRowId = Long.MIN_VALUE;
        this.mNeedSync = false;
        this.mInLayout = false;
        this.mNextSelectedPosition = -1;
        this.mNextSelectedRowId = Long.MIN_VALUE;
        this.mSelectedPosition = -1;
        this.mSelectedRowId = Long.MIN_VALUE;
        this.mOldSelectedPosition = -1;
        this.mOldSelectedRowId = Long.MIN_VALUE;
        this.mBlockLayoutRequests = false;
    }

    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void removeAllViews() {
        throw new UnsupportedOperationException(z[6]);
    }

    static void access$200(IcsAdapterView icsAdapterView) {
        icsAdapterView.fireOnSelected();
    }

    public long getItemIdAtPosition(int i) {
        Adapter adapter = getAdapter();
        return (adapter == null || i < 0) ? Long.MIN_VALUE : adapter.getItemId(i);
    }

    public int getLastVisiblePosition() {
        return (this.mFirstPosition + getChildCount()) - 1;
    }

    public IcsAdapterView(Context context) {
        super(context);
        this.mFirstPosition = 0;
        this.mSyncRowId = Long.MIN_VALUE;
        this.mNeedSync = false;
        this.mInLayout = false;
        this.mNextSelectedPosition = -1;
        this.mNextSelectedRowId = Long.MIN_VALUE;
        this.mSelectedPosition = -1;
        this.mSelectedRowId = Long.MIN_VALUE;
        this.mOldSelectedPosition = -1;
        this.mOldSelectedRowId = Long.MIN_VALUE;
        this.mBlockLayoutRequests = false;
    }

    static void access$000(IcsAdapterView icsAdapterView, Parcelable parcelable) {
        icsAdapterView.onRestoreInstanceState(parcelable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void checkFocus() {
        /*
        r5_this = this;
        r2 = 1;
        r1 = 0;
        r4 = r5.getAdapter();
        if (r4 == 0) goto L_0x000e;
    L_0x0008:
        r0 = r4.getCount();	 Catch:{ UnsupportedOperationException -> 0x003d }
        if (r0 != 0) goto L_0x003f;
    L_0x000e:
        r0 = r2;
    L_0x000f:
        if (r0 == 0) goto L_0x0017;
    L_0x0011:
        r0 = r5.isInFilterMode();	 Catch:{ UnsupportedOperationException -> 0x0041 }
        if (r0 == 0) goto L_0x0043;
    L_0x0017:
        r0 = r2;
    L_0x0018:
        if (r0 == 0) goto L_0x0047;
    L_0x001a:
        r3 = r5.mDesiredFocusableInTouchModeState;	 Catch:{ UnsupportedOperationException -> 0x0045 }
        if (r3 == 0) goto L_0x0047;
    L_0x001e:
        r3 = r2;
    L_0x001f:
        super.setFocusableInTouchMode(r3);	 Catch:{ UnsupportedOperationException -> 0x0049 }
        if (r0 == 0) goto L_0x004d;
    L_0x0024:
        r0 = r5.mDesiredFocusableState;	 Catch:{ UnsupportedOperationException -> 0x004b }
        if (r0 == 0) goto L_0x004d;
    L_0x0028:
        r0 = r2;
    L_0x0029:
        super.setFocusable(r0);	 Catch:{ UnsupportedOperationException -> 0x004f }
        r0 = r5.mEmptyView;	 Catch:{ UnsupportedOperationException -> 0x004f }
        if (r0 == 0) goto L_0x003c;
    L_0x0030:
        if (r4 == 0) goto L_0x0038;
    L_0x0032:
        r0 = r4.isEmpty();	 Catch:{ UnsupportedOperationException -> 0x0053 }
        if (r0 == 0) goto L_0x0039;
    L_0x0038:
        r1 = r2;
    L_0x0039:
        r5.updateEmptyStatus(r1);
    L_0x003c:
        return;
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r0 = r1;
        goto L_0x000f;
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = r1;
        goto L_0x0018;
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r3 = r1;
        goto L_0x001f;
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;
    L_0x004d:
        r0 = r1;
        goto L_0x0029;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsAdapterView.checkFocus():void");
    }

    protected boolean canAnimate() {
        try {
            if (super.canAnimate()) {
                if (this.mItemCount > 0) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    @CapturedViewProperty
    public int getSelectedItemPosition() {
        return this.mNextSelectedPosition;
    }

    public IcsAdapterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFirstPosition = 0;
        this.mSyncRowId = Long.MIN_VALUE;
        this.mNeedSync = false;
        this.mInLayout = false;
        this.mNextSelectedPosition = -1;
        this.mNextSelectedRowId = Long.MIN_VALUE;
        this.mSelectedPosition = -1;
        this.mSelectedRowId = Long.MIN_VALUE;
        this.mOldSelectedPosition = -1;
        this.mOldSelectedRowId = Long.MIN_VALUE;
        this.mBlockLayoutRequests = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void setNextSelectedPositionInt(int r3) {
        /*
        r2_this = this;
        r2.mNextSelectedPosition = r3;	 Catch:{ UnsupportedOperationException -> 0x0019 }
        r0 = r2.getItemIdAtPosition(r3);	 Catch:{ UnsupportedOperationException -> 0x0019 }
        r2.mNextSelectedRowId = r0;	 Catch:{ UnsupportedOperationException -> 0x0019 }
        r0 = r2.mNeedSync;	 Catch:{ UnsupportedOperationException -> 0x0019 }
        if (r0 == 0) goto L_0x0018;
    L_0x000c:
        r0 = r2.mSyncMode;	 Catch:{ UnsupportedOperationException -> 0x001b }
        if (r0 != 0) goto L_0x0018;
    L_0x0010:
        if (r3 < 0) goto L_0x0018;
    L_0x0012:
        r2.mSyncPosition = r3;	 Catch:{ UnsupportedOperationException -> 0x001d }
        r0 = r2.mNextSelectedRowId;	 Catch:{ UnsupportedOperationException -> 0x001d }
        r2.mSyncRowId = r0;	 Catch:{ UnsupportedOperationException -> 0x001d }
    L_0x0018:
        return;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsAdapterView.setNextSelectedPositionInt(int):void");
    }
}
