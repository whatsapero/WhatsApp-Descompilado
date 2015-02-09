package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup.LayoutParams;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class IcsAbsSpinner extends IcsAdapterView {
    private static final boolean IS_HONEYCOMB;
    SpinnerAdapter mAdapter;
    boolean mBlockLayoutRequests;
    private DataSetObserver mDataSetObserver;
    int mHeightMeasureSpec;
    final RecycleBin mRecycler;
    int mSelectionBottomPadding;
    int mSelectionLeftPadding;
    int mSelectionRightPadding;
    int mSelectionTopPadding;
    final Rect mSpinnerPadding;
    int mWidthMeasureSpec;

    class RecycleBin {
        private final SparseArray mScrapHeap;
        final IcsAbsSpinner this$0;

        void clear() {
            boolean z = AbsActionBarView.b;
            SparseArray sparseArray = this.mScrapHeap;
            int size = sparseArray.size();
            int i = 0;
            while (i < size) {
                View view = (View) sparseArray.valueAt(i);
                if (view != null) {
                    IcsAbsSpinner.access$100(this.this$0, view, true);
                }
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
            sparseArray.clear();
        }

        RecycleBin(IcsAbsSpinner icsAbsSpinner) {
            this.this$0 = icsAbsSpinner;
            this.mScrapHeap = new SparseArray();
        }

        View get(int i) {
            View view = (View) this.mScrapHeap.get(i);
            if (view != null) {
                this.mScrapHeap.delete(i);
            }
            return view;
        }

        public void put(int i, View view) {
            this.mScrapHeap.put(i, view);
        }
    }

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        private static final String[] z;
        int position;
        long selectedId;

        static {
            String[] strArr = new String[3];
            String str = "$\u0001P~\u0018g\u0006Pv4`O";
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
                            i3 = 4;
                            break;
                        case ay.f /*1*/:
                            i3 = 114;
                            break;
                        case ay.n /*2*/:
                            i3 = 53;
                            break;
                        case ay.p /*3*/:
                            i3 = 18;
                            break;
                        default:
                            i3 = 125;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        i = 2;
                        strArr2 = strArr3;
                        str = "E\u0010FA\rm\u001c[w\u000f*!Td\u0018`!As\ta\t";
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        z = strArr3;
                        CREATOR = new Creator() {
                            public SavedState createFromParcel(Parcel parcel) {
                                return new SavedState(parcel, null);
                            }

                            public Object[] newArray(int i) {
                                return newArray(i);
                            }

                            public SavedState[] newArray(int i) {
                                return new SavedState[i];
                            }

                            public Object createFromParcel(Parcel parcel) {
                                return createFromParcel(parcel);
                            }
                        };
                    default:
                        strArr2[i] = str;
                        str = "$\u0002Za\u0014p\u001bZ|@";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.selectedId = parcel.readLong();
            this.position = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.selectedId);
            parcel.writeInt(this.position);
        }

        public String toString() {
            return z[2] + Integer.toHexString(System.identityHashCode(this)) + z[0] + this.selectedId + z[1] + this.position + "}";
        }

        SavedState(Parcel parcel, AnonymousClass_1 anonymousClass_1) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public IcsAbsSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSelectionLeftPadding = 0;
        this.mSelectionTopPadding = 0;
        this.mSelectionRightPadding = 0;
        this.mSelectionBottomPadding = 0;
        this.mSpinnerPadding = new Rect();
        this.mRecycler = new RecycleBin(this);
        initAbsSpinner();
    }

    void resetList() {
        this.mDataChanged = false;
        this.mNeedSync = false;
        removeAllViewsInLayout();
        this.mOldSelectedPosition = -1;
        this.mOldSelectedRowId = Long.MIN_VALUE;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        invalidate();
    }

    static {
        IS_HONEYCOMB = VERSION.SDK_INT >= 11;
    }

    public void setSelection(int i) {
        setNextSelectedPositionInt(i);
        requestLayout();
        invalidate();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r10, int r11) {
        /*
        r9_this = this;
        r5 = 1;
        r4 = 0;
        r6 = android.view.View.MeasureSpec.getMode(r10);
        r0 = r9.getPaddingLeft();
        r1 = r9.getPaddingTop();
        r2 = r9.getPaddingRight();
        r3 = r9.getPaddingBottom();
        r7 = r9.mSpinnerPadding;
        r8 = r9.mSelectionLeftPadding;
        if (r0 <= r8) goto L_0x00e1;
    L_0x001c:
        r7.left = r0;
        r7 = r9.mSpinnerPadding;
        r0 = r9.mSelectionTopPadding;
        if (r1 <= r0) goto L_0x00e5;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r7.top = r0;
        r1 = r9.mSpinnerPadding;
        r0 = r9.mSelectionRightPadding;
        if (r2 <= r0) goto L_0x00e9;
    L_0x002d:
        r0 = r2;
    L_0x002e:
        r1.right = r0;
        r1 = r9.mSpinnerPadding;
        r0 = r9.mSelectionBottomPadding;
        if (r3 <= r0) goto L_0x00ed;
    L_0x0036:
        r0 = r3;
    L_0x0037:
        r1.bottom = r0;
        r0 = r9.mDataChanged;
        if (r0 == 0) goto L_0x0040;
    L_0x003d:
        r9.handleDataChanged();
    L_0x0040:
        r1 = r9.getSelectedItemPosition();
        if (r1 < 0) goto L_0x00f1;
    L_0x0046:
        r0 = r9.mAdapter;
        if (r0 == 0) goto L_0x00f1;
    L_0x004a:
        r0 = r9.mAdapter;
        r0 = r0.getCount();
        if (r1 >= r0) goto L_0x00f1;
    L_0x0052:
        r0 = r9.mRecycler;
        r0 = r0.get(r1);
        if (r0 != 0) goto L_0x0061;
    L_0x005a:
        r0 = r9.mAdapter;
        r2 = 0;
        r0 = r0.getView(r1, r2, r9);
    L_0x0061:
        if (r0 == 0) goto L_0x0068;
    L_0x0063:
        r2 = r9.mRecycler;
        r2.put(r1, r0);
    L_0x0068:
        if (r0 == 0) goto L_0x00f1;
    L_0x006a:
        r1 = r0.getLayoutParams();
        if (r1 != 0) goto L_0x007b;
    L_0x0070:
        r9.mBlockLayoutRequests = r5;
        r1 = r9.generateDefaultLayoutParams();
        r0.setLayoutParams(r1);
        r9.mBlockLayoutRequests = r4;
    L_0x007b:
        r9.measureChild(r0, r10, r11);
        r1 = r9.getChildHeight(r0);
        r2 = r9.mSpinnerPadding;
        r2 = r2.top;
        r1 = r1 + r2;
        r2 = r9.mSpinnerPadding;
        r2 = r2.bottom;
        r1 = r1 + r2;
        r0 = r9.getChildWidth(r0);
        r2 = r9.mSpinnerPadding;
        r2 = r2.left;
        r0 = r0 + r2;
        r2 = r9.mSpinnerPadding;
        r2 = r2.right;
        r0 = r0 + r2;
        r2 = r4;
    L_0x009b:
        if (r2 == 0) goto L_0x00b1;
    L_0x009d:
        r1 = r9.mSpinnerPadding;
        r1 = r1.top;
        r2 = r9.mSpinnerPadding;
        r2 = r2.bottom;
        r1 = r1 + r2;
        if (r6 != 0) goto L_0x00b1;
    L_0x00a8:
        r0 = r9.mSpinnerPadding;
        r0 = r0.left;
        r2 = r9.mSpinnerPadding;
        r2 = r2.right;
        r0 = r0 + r2;
    L_0x00b1:
        r2 = r9.getSuggestedMinimumHeight();
        r2 = java.lang.Math.max(r1, r2);
        r1 = r9.getSuggestedMinimumWidth();
        r3 = java.lang.Math.max(r0, r1);
        r0 = IS_HONEYCOMB;
        if (r0 == 0) goto L_0x00d1;
    L_0x00c5:
        r0 = resolveSizeAndState(r2, r11, r4);
        r1 = resolveSizeAndState(r3, r10, r4);
        r4 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        if (r4 == 0) goto L_0x00d9;
    L_0x00d1:
        r0 = resolveSize(r2, r11);
        r1 = resolveSize(r3, r10);
    L_0x00d9:
        r9.setMeasuredDimension(r1, r0);
        r9.mHeightMeasureSpec = r11;
        r9.mWidthMeasureSpec = r10;
        return;
    L_0x00e1:
        r0 = r9.mSelectionLeftPadding;
        goto L_0x001c;
    L_0x00e5:
        r0 = r9.mSelectionTopPadding;
        goto L_0x0025;
    L_0x00e9:
        r0 = r9.mSelectionRightPadding;
        goto L_0x002e;
    L_0x00ed:
        r0 = r9.mSelectionBottomPadding;
        goto L_0x0037;
    L_0x00f1:
        r2 = r5;
        r0 = r4;
        r1 = r4;
        goto L_0x009b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsAbsSpinner.onMeasure(int, int):void");
    }

    int getChildWidth(View view) {
        return view.getMeasuredWidth();
    }

    public IcsAbsSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Adapter getAdapter() {
        return getAdapter();
    }

    public void requestLayout() {
        if (!this.mBlockLayoutRequests) {
            super.requestLayout();
        }
    }

    static void access$100(IcsAbsSpinner icsAbsSpinner, View view, boolean z) {
        icsAbsSpinner.removeDetachedView(view, z);
    }

    public View getSelectedView() {
        return (this.mItemCount <= 0 || this.mSelectedPosition < 0) ? null : getChildAt(this.mSelectedPosition - this.mFirstPosition);
    }

    void recycleAllViews() {
        boolean z = AbsActionBarView.b;
        int childCount = getChildCount();
        RecycleBin recycleBin = this.mRecycler;
        int i = this.mFirstPosition;
        int i2 = 0;
        while (i2 < childCount) {
            recycleBin.put(i + i2, getChildAt(i2));
            i2++;
            if (z) {
                return;
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.selectedId >= 0) {
            this.mDataChanged = true;
            this.mNeedSync = true;
            this.mSyncRowId = savedState.selectedId;
            this.mSyncPosition = savedState.position;
            this.mSyncMode = 0;
            requestLayout();
        }
    }

    int getChildHeight(View view) {
        return view.getMeasuredHeight();
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    private void initAbsSpinner() {
        setFocusable(true);
        setWillNotDraw(false);
    }

    public SpinnerAdapter getAdapter() {
        return this.mAdapter;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAdapter(android.widget.SpinnerAdapter r5) {
        /*
        r4_this = this;
        r0 = -1;
        r1 = r4.mAdapter;
        if (r1 == 0) goto L_0x000f;
    L_0x0005:
        r1 = r4.mAdapter;
        r2 = r4.mDataSetObserver;
        r1.unregisterDataSetObserver(r2);
        r4.resetList();
    L_0x000f:
        r4.mAdapter = r5;
        r4.mOldSelectedPosition = r0;
        r2 = -9223372036854775808;
        r4.mOldSelectedRowId = r2;
        r1 = r4.mAdapter;
        if (r1 == 0) goto L_0x004e;
    L_0x001b:
        r1 = r4.mItemCount;
        r4.mOldItemCount = r1;
        r1 = r4.mAdapter;
        r1 = r1.getCount();
        r4.mItemCount = r1;
        r4.checkFocus();
        r1 = new com.actionbarsherlock.internal.widget.IcsAdapterView$AdapterDataSetObserver;
        r1.<init>(r4);
        r4.mDataSetObserver = r1;
        r1 = r4.mAdapter;
        r2 = r4.mDataSetObserver;
        r1.registerDataSetObserver(r2);
        r1 = r4.mItemCount;
        if (r1 <= 0) goto L_0x003d;
    L_0x003c:
        r0 = 0;
    L_0x003d:
        r4.setSelectedPositionInt(r0);
        r4.setNextSelectedPositionInt(r0);
        r0 = r4.mItemCount;
        if (r0 != 0) goto L_0x004a;
    L_0x0047:
        r4.checkSelectionChanged();
    L_0x004a:
        r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        if (r0 == 0) goto L_0x0057;
    L_0x004e:
        r4.checkFocus();
        r4.resetList();
        r4.checkSelectionChanged();
    L_0x0057:
        r4.requestLayout();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsAbsSpinner.setAdapter(android.widget.SpinnerAdapter):void");
    }

    public IcsAbsSpinner(Context context) {
        super(context);
        this.mSelectionLeftPadding = 0;
        this.mSelectionTopPadding = 0;
        this.mSelectionRightPadding = 0;
        this.mSelectionBottomPadding = 0;
        this.mSpinnerPadding = new Rect();
        this.mRecycler = new RecycleBin(this);
        initAbsSpinner();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
        r6_this = this;
        r0 = super.onSaveInstanceState();
        r1 = new com.actionbarsherlock.internal.widget.IcsAbsSpinner$SavedState;
        r1.<init>(r0);
        r2 = r6.getSelectedItemId();
        r1.selectedId = r2;
        r2 = r1.selectedId;
        r4 = 0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 < 0) goto L_0x0021;
    L_0x0017:
        r0 = r6.getSelectedItemPosition();
        r1.position = r0;
        r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        if (r0 == 0) goto L_0x0024;
    L_0x0021:
        r0 = -1;
        r1.position = r0;
    L_0x0024:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsAbsSpinner.onSaveInstanceState():android.os.Parcelable");
    }

    public int getCount() {
        return this.mItemCount;
    }
}
