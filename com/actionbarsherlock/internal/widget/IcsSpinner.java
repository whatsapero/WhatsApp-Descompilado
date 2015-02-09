package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.actionbarsherlock.R;

public class IcsSpinner extends IcsAbsSpinner implements OnClickListener {
    private boolean mDisableChildrenWhenDisabled;
    int mDropDownWidth;
    private int mGravity;
    private SpinnerPopup mPopup;
    private DropDownAdapter mTempAdapter;
    private Rect mTempRect;

    class DropDownAdapter implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter mAdapter;
        private ListAdapter mListAdapter;

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.mAdapter != null) {
                this.mAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }

        public int getViewTypeCount() {
            return 1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.mListAdapter;
            return listAdapter != null ? listAdapter.isEnabled(i) : true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.mAdapter != null) {
                this.mAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public long getItemId(int i) {
            return this.mAdapter == null ? -1 : this.mAdapter.getItemId(i);
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.mListAdapter;
            return listAdapter != null ? listAdapter.areAllItemsEnabled() : true;
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean hasStableIds() {
            return this.mAdapter != null && this.mAdapter.hasStableIds();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            return this.mAdapter == null ? null : this.mAdapter.getDropDownView(i, view, viewGroup);
        }

        public DropDownAdapter(SpinnerAdapter spinnerAdapter) {
            this.mAdapter = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.mListAdapter = (ListAdapter) spinnerAdapter;
            }
        }

        public Object getItem(int i) {
            return this.mAdapter == null ? null : this.mAdapter.getItem(i);
        }

        public int getCount() {
            return this.mAdapter == null ? 0 : this.mAdapter.getCount();
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }
    }

    interface SpinnerPopup {
        void dismiss();

        boolean isShowing();

        void setAdapter(ListAdapter listAdapter);

        void setPromptText(CharSequence charSequence);

        void show();
    }

    class DropdownPopup extends IcsListPopupWindow implements SpinnerPopup {
        private ListAdapter mAdapter;
        private CharSequence mHintText;
        final IcsSpinner this$0;

        class AnonymousClass_1 implements OnItemClickListener {
            final DropdownPopup this$1;
            final IcsSpinner val$this$0;

            AnonymousClass_1(DropdownPopup dropdownPopup, IcsSpinner icsSpinner) {
                this.this$1 = dropdownPopup;
                this.val$this$0 = icsSpinner;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.this$1.this$0.setSelection(i);
                this.this$1.dismiss();
            }
        }

        public void setPromptText(CharSequence charSequence) {
            this.mHintText = charSequence;
        }

        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.mAdapter = listAdapter;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void show() {
            /*
            r7_this = this;
            r1 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
            r0 = r7.this$0;
            r2 = r0.getPaddingLeft();
            r0 = r7.this$0;
            r0 = r0.mDropDownWidth;
            r3 = -2;
            if (r0 != r3) goto L_0x0036;
        L_0x000f:
            r0 = r7.this$0;
            r3 = r0.getWidth();
            r0 = r7.this$0;
            r4 = r0.getPaddingRight();
            r5 = r7.this$0;
            r0 = r7.mAdapter;
            r0 = (android.widget.SpinnerAdapter) r0;
            r6 = r7.this$0;
            r6 = r6.getBackground();
            r0 = r5.measureContentWidth(r0, r6);
            r3 = r3 - r2;
            r3 = r3 - r4;
            r0 = java.lang.Math.max(r0, r3);
            r7.setContentWidth(r0);
            if (r1 == 0) goto L_0x0057;
        L_0x0036:
            r0 = r7.this$0;
            r0 = r0.mDropDownWidth;
            r3 = -1;
            if (r0 != r3) goto L_0x0050;
        L_0x003d:
            r0 = r7.this$0;
            r0 = r0.getWidth();
            r3 = r7.this$0;
            r3 = r3.getPaddingRight();
            r0 = r0 - r2;
            r0 = r0 - r3;
            r7.setContentWidth(r0);
            if (r1 == 0) goto L_0x0057;
        L_0x0050:
            r0 = r7.this$0;
            r0 = r0.mDropDownWidth;
            r7.setContentWidth(r0);
        L_0x0057:
            r0 = r7.this$0;
            r1 = r0.getBackground();
            r0 = 0;
            if (r1 == 0) goto L_0x0072;
        L_0x0060:
            r0 = r7.this$0;
            r0 = com.actionbarsherlock.internal.widget.IcsSpinner.access$000(r0);
            r1.getPadding(r0);
            r0 = r7.this$0;
            r0 = com.actionbarsherlock.internal.widget.IcsSpinner.access$000(r0);
            r0 = r0.left;
            r0 = -r0;
        L_0x0072:
            r0 = r0 + r2;
            r7.setHorizontalOffset(r0);
            r0 = 2;
            r7.setInputMethodMode(r0);
            super.show();
            r0 = r7.getListView();
            r1 = 1;
            r0.setChoiceMode(r1);
            r0 = r7.this$0;
            r1 = r7.this$0;
            r1 = r1.getSelectedItemPosition();
            r0.setSelection(r1);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsSpinner.DropdownPopup.show():void");
        }

        public DropdownPopup(IcsSpinner icsSpinner, Context context, AttributeSet attributeSet, int i) {
            this.this$0 = icsSpinner;
            super(context, attributeSet, 0, i);
            setAnchorView(icsSpinner);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new AnonymousClass_1(this, icsSpinner));
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mPopup != null && this.mPopup.isShowing()) {
            this.mPopup.dismiss();
        }
    }

    private View makeAndAddView(int i) {
        View view;
        if (!this.mDataChanged) {
            view = this.mRecycler.get(i);
            if (view != null) {
                setUpChild(view);
                return view;
            }
        }
        view = this.mAdapter.getView(i, null, this);
        setUpChild(view);
        return view;
    }

    public void setEnabled(boolean z) {
        boolean z2 = AbsActionBarView.b;
        super.setEnabled(z);
        if (this.mDisableChildrenWhenDisabled) {
            int childCount = getChildCount();
            int i = 0;
            while (i < childCount) {
                getChildAt(i).setEnabled(z);
                i++;
                if (z2) {
                    return;
                }
            }
        }
    }

    static Rect access$000(IcsSpinner icsSpinner) {
        return icsSpinner.mTempRect;
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            performClick = true;
            if (!this.mPopup.isShowing()) {
                this.mPopup.show();
            }
        }
        return performClick;
    }

    int measureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        boolean z = AbsActionBarView.b;
        if (spinnerAdapter == null) {
            return 0;
        }
        int itemViewType;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i = 0;
        max = 0;
        while (max2 < min) {
            View view2;
            itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != max) {
                view2 = null;
            } else {
                itemViewType = max;
                view2 = view;
            }
            View view3 = spinnerAdapter.getView(max2, view2, this);
            if (view3.getLayoutParams() == null) {
                view3.setLayoutParams(new LayoutParams(-2, -2));
            }
            view3.measure(makeMeasureSpec, makeMeasureSpec2);
            max = Math.max(i, view3.getMeasuredWidth());
            int i2 = max2 + 1;
            if (z) {
                itemViewType = max;
                break;
            }
            max2 = i2;
            i = max;
            view = view3;
            max = itemViewType;
        }
        itemViewType = i;
        if (drawable == null) {
            return itemViewType;
        }
        drawable.getPadding(this.mTempRect);
        return itemViewType + (this.mTempRect.left + this.mTempRect.right);
    }

    public IcsSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionDropDownStyle);
    }

    private void setUpChild(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, 0, layoutParams);
        view.setSelected(hasFocus());
        if (this.mDisableChildrenWhenDisabled) {
            view.setEnabled(isEnabled());
        }
        view.measure(ViewGroup.getChildMeasureSpec(this.mWidthMeasureSpec, this.mSpinnerPadding.left + this.mSpinnerPadding.right, layoutParams.width), ViewGroup.getChildMeasureSpec(this.mHeightMeasureSpec, this.mSpinnerPadding.top + this.mSpinnerPadding.bottom, layoutParams.height));
        int measuredHeight = this.mSpinnerPadding.top + ((((getMeasuredHeight() - this.mSpinnerPadding.bottom) - this.mSpinnerPadding.top) - view.getMeasuredHeight()) / 2);
        view.layout(0, measuredHeight, view.getMeasuredWidth() + 0, view.getMeasuredHeight() + measuredHeight);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.mInLayout = true;
        layout(0, false);
        this.mInLayout = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void layout(int r8, boolean r9) {
        /*
        r7_this = this;
        r6 = 0;
        r0 = r7.mSpinnerPadding;
        r1 = r0.left;
        r0 = r7.getRight();
        r2 = r7.getLeft();
        r0 = r0 - r2;
        r2 = r7.mSpinnerPadding;
        r2 = r2.left;
        r0 = r0 - r2;
        r2 = r7.mSpinnerPadding;
        r2 = r2.right;
        r2 = r0 - r2;
        r0 = r7.mDataChanged;
        if (r0 == 0) goto L_0x0020;
    L_0x001d:
        r7.handleDataChanged();
    L_0x0020:
        r0 = r7.mItemCount;
        if (r0 != 0) goto L_0x0028;
    L_0x0024:
        r7.resetList();
    L_0x0027:
        return;
    L_0x0028:
        r0 = r7.mNextSelectedPosition;
        if (r0 < 0) goto L_0x0031;
    L_0x002c:
        r0 = r7.mNextSelectedPosition;
        r7.setSelectedPositionInt(r0);
    L_0x0031:
        r7.recycleAllViews();
        r7.removeAllViewsInLayout();
        r0 = r7.mSelectedPosition;
        r7.mFirstPosition = r0;
        r0 = r7.mSelectedPosition;
        r3 = r7.makeAndAddView(r0);
        r4 = r3.getMeasuredWidth();
        r0 = r7.mGravity;
        r0 = r0 & 7;
        switch(r0) {
            case 1: goto L_0x0065;
            case 5: goto L_0x006f;
            default: goto L_0x004c;
        };
    L_0x004c:
        r0 = r1;
    L_0x004d:
        r3.offsetLeftAndRight(r0);
        r0 = r7.mRecycler;
        r0.clear();
        r7.invalidate();
        r7.checkSelectionChanged();
        r7.mDataChanged = r6;
        r7.mNeedSync = r6;
        r0 = r7.mSelectedPosition;
        r7.setNextSelectedPositionInt(r0);
        goto L_0x0027;
    L_0x0065:
        r0 = r2 / 2;
        r0 = r0 + r1;
        r5 = r4 / 2;
        r0 = r0 - r5;
        r5 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        if (r5 == 0) goto L_0x004d;
    L_0x006f:
        r0 = r1 + r2;
        r0 = r0 - r4;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.IcsSpinner.layout(int, boolean):void");
    }

    public IcsSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTempRect = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SherlockSpinner, i, 0);
        SpinnerPopup dropdownPopup = new DropdownPopup(this, context, attributeSet, i);
        this.mDropDownWidth = obtainStyledAttributes.getLayoutDimension(R.styleable.SherlockSpinner_android_dropDownWidth, -2);
        dropdownPopup.setBackgroundDrawable(obtainStyledAttributes.getDrawable(R.styleable.SherlockSpinner_android_popupBackground));
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.SherlockSpinner_android_dropDownVerticalOffset, 0);
        if (dimensionPixelOffset != 0) {
            dropdownPopup.setVerticalOffset(dimensionPixelOffset);
        }
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.SherlockSpinner_android_dropDownHorizontalOffset, 0);
        if (dimensionPixelOffset != 0) {
            dropdownPopup.setHorizontalOffset(dimensionPixelOffset);
        }
        this.mPopup = dropdownPopup;
        this.mGravity = obtainStyledAttributes.getInt(R.styleable.SherlockSpinner_android_gravity, 17);
        this.mPopup.setPromptText(obtainStyledAttributes.getString(R.styleable.SherlockSpinner_android_prompt));
        this.mDisableChildrenWhenDisabled = true;
        obtainStyledAttributes.recycle();
        if (this.mTempAdapter != null) {
            this.mPopup.setAdapter(this.mTempAdapter);
            this.mTempAdapter = null;
        }
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        super.setAdapter(spinnerAdapter);
        if (this.mPopup != null) {
            this.mPopup.setAdapter(new DropDownAdapter(spinnerAdapter));
            if (!AbsActionBarView.b) {
                return;
            }
        }
        this.mTempAdapter = new DropDownAdapter(spinnerAdapter);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mPopup != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), measureContentWidth(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        setSelection(i);
        dialogInterface.dismiss();
    }

    public int getBaseline() {
        View view = null;
        if (getChildCount() > 0) {
            view = getChildAt(0);
        } else if (this.mAdapter != null && this.mAdapter.getCount() > 0) {
            view = makeAndAddView(0);
            this.mRecycler.put(0, view);
            removeAllViewsInLayout();
        }
        if (view == null) {
            return -1;
        }
        int baseline = view.getBaseline();
        return baseline >= 0 ? view.getTop() + baseline : -1;
    }
}
