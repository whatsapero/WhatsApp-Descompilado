package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.actionbarsherlock.R;
import com.actionbarsherlock.internal.ResourcesCompat;
import com.actionbarsherlock.internal.view.View_HasStateListenerSupport;
import com.actionbarsherlock.internal.view.View_OnAttachStateChangeListener;
import com.actionbarsherlock.internal.view.menu.ActionMenuView.ActionMenuChildView;
import com.actionbarsherlock.internal.view.menu.MenuBuilder.ItemInvoker;
import com.actionbarsherlock.internal.view.menu.MenuView.ItemView;
import com.actionbarsherlock.internal.widget.CapitalizingButton;
import java.util.HashSet;
import java.util.Set;

public class ActionMenuItemView extends LinearLayout implements ItemView, OnClickListener, OnLongClickListener, ActionMenuChildView, View_HasStateListenerSupport {
    private boolean mAllowTextWithIcon;
    private boolean mExpandedFormat;
    private ImageButton mImageButton;
    private MenuItemImpl mItemData;
    private ItemInvoker mItemInvoker;
    private final Set mListeners;
    private int mMinWidth;
    private CapitalizingButton mTextButton;
    private CharSequence mTitle;

    protected void onDetachedFromWindow() {
        int i = MenuBuilder.a;
        super.onDetachedFromWindow();
        for (View_OnAttachStateChangeListener view_OnAttachStateChangeListener : this.mListeners) {
            view_OnAttachStateChangeListener.onViewDetachedFromWindow(this);
            if (i != 0) {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setIcon(android.graphics.drawable.Drawable r3) {
        /*
        r2_this = this;
        r0 = r2.mImageButton;
        r0.setImageDrawable(r3);
        if (r3 == 0) goto L_0x0011;
    L_0x0007:
        r0 = r2.mImageButton;
        r1 = 0;
        r0.setVisibility(r1);
        r0 = com.actionbarsherlock.internal.view.menu.MenuBuilder.a;
        if (r0 == 0) goto L_0x0018;
    L_0x0011:
        r0 = r2.mImageButton;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0018:
        r2.updateTextButtonVisibility();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.ActionMenuItemView.setIcon(android.graphics.drawable.Drawable):void");
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.mImageButton.setEnabled(z);
        this.mTextButton.setEnabled(z);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public boolean prefersCondensedTitle() {
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onLongClick(android.view.View r11) {
        /*
        r10_this = this;
        r1 = 1;
        r0 = 0;
        r2 = r10.hasText();
        if (r2 == 0) goto L_0x0009;
    L_0x0008:
        return r0;
    L_0x0009:
        r2 = 2;
        r2 = new int[r2];
        r3 = new android.graphics.Rect;
        r3.<init>();
        r10.getLocationOnScreen(r2);
        r10.getWindowVisibleDisplayFrame(r3);
        r4 = r10.getContext();
        r5 = r10.getWidth();
        r6 = r10.getHeight();
        r7 = r2[r1];
        r8 = r6 / 2;
        r7 = r7 + r8;
        r8 = r4.getResources();
        r8 = r8.getDisplayMetrics();
        r8 = r8.widthPixels;
        r9 = r10.mItemData;
        r9 = r9.getTitle();
        r4 = android.widget.Toast.makeText(r4, r9, r0);
        r3 = r3.height();
        if (r7 >= r3) goto L_0x0052;
    L_0x0042:
        r3 = 53;
        r2 = r2[r0];
        r2 = r8 - r2;
        r5 = r5 / 2;
        r2 = r2 - r5;
        r4.setGravity(r3, r2, r6);
        r2 = com.actionbarsherlock.internal.view.menu.MenuBuilder.a;
        if (r2 == 0) goto L_0x0057;
    L_0x0052:
        r2 = 81;
        r4.setGravity(r2, r0, r6);
    L_0x0057:
        r4.show();
        r0 = r1;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.ActionMenuItemView.onLongClick(android.view.View):boolean");
    }

    public boolean hasText() {
        return this.mTextButton.getVisibility() != 8;
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 14) {
            super.onPopulateAccessibilityEvent(accessibilityEvent);
        }
        CharSequence contentDescription = getContentDescription();
        if (!TextUtils.isEmpty(contentDescription)) {
            accessibilityEvent.getText().add(contentDescription);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, this.mMinWidth);
        } else {
            size = this.mMinWidth;
        }
        if (mode != 1073741824 && this.mMinWidth > 0 && measuredWidth < size) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return VERSION.SDK_INT >= 14 ? onHoverEvent(motionEvent) : false;
    }

    public void initialize(MenuItemImpl menuItemImpl, int i) {
        this.mItemData = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitleForItemView(this));
        setId(menuItemImpl.getItemId());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setEnabled(menuItemImpl.isEnabled());
    }

    public void setItemInvoker(ItemInvoker itemInvoker) {
        this.mItemInvoker = itemInvoker;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.mListeners = new HashSet();
        this.mAllowTextWithIcon = ResourcesCompat.getResources_getBoolean(context, R.bool.abs__config_allowActionMenuItemTextWithIcon);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SherlockActionMenuItemView, 0, 0);
        this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SherlockActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
    }

    public void removeOnAttachStateChangeListener(View_OnAttachStateChangeListener view_OnAttachStateChangeListener) {
        this.mListeners.remove(view_OnAttachStateChangeListener);
    }

    public MenuItemImpl getItemData() {
        return this.mItemData;
    }

    public boolean needsDividerBefore() {
        return hasText() && this.mItemData.getIcon() == null;
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        this.mTextButton.setTextCompat(this.mTitle);
        setContentDescription(this.mTitle);
        updateTextButtonVisibility();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public boolean needsDividerAfter() {
        return hasText();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addOnAttachStateChangeListener(View_OnAttachStateChangeListener view_OnAttachStateChangeListener) {
        this.mListeners.add(view_OnAttachStateChangeListener);
    }

    protected void onAttachedToWindow() {
        int i = MenuBuilder.a;
        super.onAttachedToWindow();
        for (View_OnAttachStateChangeListener view_OnAttachStateChangeListener : this.mListeners) {
            view_OnAttachStateChangeListener.onViewAttachedToWindow(this);
            if (i != 0) {
                return;
            }
        }
    }

    private void updateTextButtonVisibility() {
        int i = 1;
        int i2 = 0;
        int i3 = !TextUtils.isEmpty(this.mTextButton.getText()) ? 1 : 0;
        if (!(this.mImageButton.getDrawable() == null || (this.mItemData.showsTextAsAction() && (this.mAllowTextWithIcon || this.mExpandedFormat)))) {
            i = 0;
        }
        i3 &= i;
        CapitalizingButton capitalizingButton = this.mTextButton;
        if (i3 == 0) {
            i2 = 8;
        }
        capitalizingButton.setVisibility(i2);
    }

    public void onClick(View view) {
        if (this.mItemInvoker != null) {
            this.mItemInvoker.invokeItem(this.mItemData);
        }
    }

    public void onFinishInflate() {
        this.mImageButton = (ImageButton) findViewById(R.id.abs__imageButton);
        this.mTextButton = (CapitalizingButton) findViewById(R.id.abs__textButton);
        this.mImageButton.setOnClickListener(this);
        this.mTextButton.setOnClickListener(this);
        this.mImageButton.setOnLongClickListener(this);
        setOnClickListener(this);
        setOnLongClickListener(this);
    }
}
