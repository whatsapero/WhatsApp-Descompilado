package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import com.actionbarsherlock.R;
import com.actionbarsherlock.internal.ResourcesCompat;
import com.actionbarsherlock.internal.view.View_HasStateListenerSupport;
import com.actionbarsherlock.internal.view.View_OnAttachStateChangeListener;
import com.actionbarsherlock.internal.view.menu.ActionMenuView.ActionMenuChildView;
import com.actionbarsherlock.internal.view.menu.MenuPresenter.Callback;
import com.actionbarsherlock.internal.view.menu.MenuView.ItemView;
import com.actionbarsherlock.view.ActionProvider.SubUiVisibilityListener;
import com.actionbarsherlock.view.MenuItem;
import java.util.HashSet;
import java.util.Set;

public class ActionMenuPresenter extends BaseMenuPresenter implements SubUiVisibilityListener {
    private final SparseBooleanArray mActionButtonGroups;
    private ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    int mOpenSubMenuId;
    private View mOverflowButton;
    private OverflowPopup mOverflowPopup;
    final PopupPresenterCallback mPopupPresenterCallback;
    private OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private View mScrapActionButtonView;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    class ActionButtonSubmenu extends MenuPopupHelper {
        final ActionMenuPresenter this$0;

        public void onDismiss() {
            super.onDismiss();
            ActionMenuPresenter.access$302(this.this$0, null);
            this.this$0.mOpenSubMenuId = 0;
        }

        public ActionButtonSubmenu(ActionMenuPresenter actionMenuPresenter, Context context, SubMenuBuilder subMenuBuilder) {
            int i = 0;
            int i2 = MenuBuilder.a;
            this.this$0 = actionMenuPresenter;
            super(context, subMenuBuilder);
            if (!((MenuItemImpl) subMenuBuilder.getItem()).isActionButton()) {
                setAnchorView(ActionMenuPresenter.access$200(actionMenuPresenter) == null ? (View) actionMenuPresenter.mMenuView : ActionMenuPresenter.access$200(actionMenuPresenter));
            }
            setCallback(actionMenuPresenter.mPopupPresenterCallback);
            int size = subMenuBuilder.size();
            boolean z = false;
            while (i < size) {
                MenuItem item = subMenuBuilder.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    if (i2 == 0) {
                        break;
                    }
                }
                i++;
                if (i2 != 0) {
                    break;
                }
            }
            setForceShowIcon(z);
        }
    }

    class HasPermanentMenuKey {
        public static boolean get(Context context) {
            return ViewConfiguration.get(context).hasPermanentMenuKey();
        }
    }

    class OpenOverflowRunnable implements Runnable {
        private OverflowPopup mPopup;
        final ActionMenuPresenter this$0;

        public void run() {
            this.this$0.mMenu.changeMenuMode();
            View view = (View) this.this$0.mMenuView;
            if (!(view == null || view.getWindowToken() == null || !this.mPopup.tryShow())) {
                ActionMenuPresenter.access$102(this.this$0, this.mPopup);
            }
            ActionMenuPresenter.access$402(this.this$0, null);
        }

        public OpenOverflowRunnable(ActionMenuPresenter actionMenuPresenter, OverflowPopup overflowPopup) {
            this.this$0 = actionMenuPresenter;
            this.mPopup = overflowPopup;
        }
    }

    class OverflowMenuButton extends ImageButton implements ActionMenuChildView, View_HasStateListenerSupport {
        private final Set mListeners;
        final ActionMenuPresenter this$0;

        protected void onDetachedFromWindow() {
            int i = MenuBuilder.a;
            super.onDetachedFromWindow();
            for (View_OnAttachStateChangeListener view_OnAttachStateChangeListener : this.mListeners) {
                view_OnAttachStateChangeListener.onViewDetachedFromWindow(this);
                if (i != 0) {
                    break;
                }
            }
            if (ActionMenuPresenter.access$100(this.this$0) != null) {
                ActionMenuPresenter.access$100(this.this$0).dismiss();
            }
        }

        public void removeOnAttachStateChangeListener(View_OnAttachStateChangeListener view_OnAttachStateChangeListener) {
            this.mListeners.remove(view_OnAttachStateChangeListener);
        }

        public boolean needsDividerBefore() {
            return false;
        }

        public boolean needsDividerAfter() {
            return false;
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

        public void addOnAttachStateChangeListener(View_OnAttachStateChangeListener view_OnAttachStateChangeListener) {
            this.mListeners.add(view_OnAttachStateChangeListener);
        }

        public boolean performClick() {
            if (!super.performClick()) {
                playSoundEffect(0);
                this.this$0.showOverflowMenu();
            }
            return true;
        }

        public OverflowMenuButton(ActionMenuPresenter actionMenuPresenter, Context context) {
            this.this$0 = actionMenuPresenter;
            super(context, null, R.attr.actionOverflowButtonStyle);
            this.mListeners = new HashSet();
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
        }
    }

    class OverflowPopup extends MenuPopupHelper {
        final ActionMenuPresenter this$0;

        public OverflowPopup(ActionMenuPresenter actionMenuPresenter, Context context, MenuBuilder menuBuilder, View view, boolean z) {
            this.this$0 = actionMenuPresenter;
            super(context, menuBuilder, view, z);
            setCallback(actionMenuPresenter.mPopupPresenterCallback);
        }

        public void onDismiss() {
            super.onDismiss();
            this.this$0.mMenu.close();
            ActionMenuPresenter.access$102(this.this$0, null);
        }
    }

    class PopupPresenterCallback implements Callback {
        final ActionMenuPresenter this$0;

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            if (menuBuilder instanceof SubMenuBuilder) {
                ((SubMenuBuilder) menuBuilder).getRootMenu().close(false);
            }
        }

        private PopupPresenterCallback(ActionMenuPresenter actionMenuPresenter) {
            this.this$0 = actionMenuPresenter;
        }

        PopupPresenterCallback(ActionMenuPresenter actionMenuPresenter, AnonymousClass_1 anonymousClass_1) {
            this(actionMenuPresenter);
        }

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            if (menuBuilder != null) {
                this.this$0.mOpenSubMenuId = ((SubMenuBuilder) menuBuilder).getItem().getItemId();
            }
            return false;
        }
    }

    public boolean isOverflowMenuShowing() {
        return this.mOverflowPopup != null && this.mOverflowPopup.isShowing();
    }

    public boolean shouldIncludeItem(int i, MenuItemImpl menuItemImpl) {
        return menuItemImpl.isActionButton();
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abs__action_menu_layout, R.layout.abs__action_menu_item_layout);
        this.mActionButtonGroups = new SparseBooleanArray();
        this.mPopupPresenterCallback = new PopupPresenterCallback(this, null);
    }

    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    private View findViewForItem(MenuItem menuItem) {
        int i = MenuBuilder.a;
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof ItemView) && ((ItemView) childAt).getItemData() == menuItem) {
                return childAt;
            }
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        return null;
    }

    static OverflowPopup access$100(ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mOverflowPopup;
    }

    public void setItemLimit(int i) {
        this.mMaxItems = i;
        this.mMaxItemsSet = true;
    }

    public void setWidthLimit(int i, boolean z) {
        this.mWidthLimit = i;
        this.mStrictWidthLimit = z;
        this.mWidthLimitSet = true;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.mExpandedActionViewsExclusive = z;
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        dismissPopupMenus();
        super.onCloseMenu(menuBuilder, z);
    }

    static View access$200(ActionMenuPresenter actionMenuPresenter) {
        return actionMenuPresenter.mOverflowButton;
    }

    static OverflowPopup access$102(ActionMenuPresenter actionMenuPresenter, OverflowPopup overflowPopup) {
        actionMenuPresenter.mOverflowPopup = overflowPopup;
        return overflowPopup;
    }

    public View getItemView(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        int i;
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.hasCollapsibleActionView()) {
            if (!(view instanceof ActionMenuItemView)) {
                view = null;
            }
            actionView = super.getItemView(menuItemImpl, view, viewGroup);
        }
        if (menuItemImpl.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public boolean filterLeftoverView(ViewGroup viewGroup, int i) {
        return viewGroup.getChildAt(i) == this.mOverflowButton ? false : super.filterLeftoverView(viewGroup, i);
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        int i = MenuBuilder.a;
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        while (subMenuBuilder2.getParentMenu() != this.mMenu) {
            subMenuBuilder2 = (SubMenuBuilder) subMenuBuilder2.getParentMenu();
            if (i != 0) {
                break;
            }
        }
        View findViewForItem = findViewForItem(subMenuBuilder2.getItem());
        if (findViewForItem == null) {
            if (this.mOverflowButton == null) {
                return false;
            }
            findViewForItem = this.mOverflowButton;
        }
        this.mOpenSubMenuId = subMenuBuilder.getItem().getItemId();
        this.mActionButtonPopup = new ActionButtonSubmenu(this, this.mContext, subMenuBuilder);
        this.mActionButtonPopup.setAnchorView(findViewForItem);
        this.mActionButtonPopup.show();
        super.onSubMenuSelected(subMenuBuilder);
        return true;
    }

    public void bindItemView(MenuItemImpl menuItemImpl, ItemView itemView) {
        itemView.initialize(menuItemImpl, 0);
        ((ActionMenuItemView) itemView).setItemInvoker((ActionMenuView) this.mMenuView);
    }

    static ActionButtonSubmenu access$302(ActionMenuPresenter actionMenuPresenter, ActionButtonSubmenu actionButtonSubmenu) {
        actionMenuPresenter.mActionButtonPopup = actionButtonSubmenu;
        return actionButtonSubmenu;
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        MenuView menuView = super.getMenuView(viewGroup);
        ((ActionMenuView) menuView).setPresenter(this);
        return menuView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateMenuView(boolean r8) {
        /*
        r7_this = this;
        r1 = 1;
        r2 = 0;
        r4 = com.actionbarsherlock.internal.view.menu.MenuBuilder.a;
        super.updateMenuView(r8);
        r0 = r7.mMenu;
        if (r0 == 0) goto L_0x002b;
    L_0x000b:
        r0 = r7.mMenu;
        r5 = r0.getActionItems();
        r6 = r5.size();
        r3 = r2;
    L_0x0016:
        if (r3 >= r6) goto L_0x002b;
    L_0x0018:
        r0 = r5.get(r3);
        r0 = (com.actionbarsherlock.internal.view.menu.MenuItemImpl) r0;
        r0 = r0.getActionProvider();
        if (r0 == 0) goto L_0x0027;
    L_0x0024:
        r0.setSubUiVisibilityListener(r7);
    L_0x0027:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x00bc;
    L_0x002b:
        r0 = r7.mMenu;
        if (r0 == 0) goto L_0x00b4;
    L_0x002f:
        r0 = r7.mMenu;
        r0 = r0.getNonActionItems();
    L_0x0035:
        r3 = r7.mReserveOverflow;
        if (r3 == 0) goto L_0x00ba;
    L_0x0039:
        if (r0 == 0) goto L_0x00ba;
    L_0x003b:
        r3 = r0.size();
        if (r3 != r1) goto L_0x0050;
    L_0x0041:
        r0 = r0.get(r2);
        r0 = (com.actionbarsherlock.internal.view.menu.MenuItemImpl) r0;
        r0 = r0.isActionViewExpanded();
        if (r0 != 0) goto L_0x00b6;
    L_0x004d:
        r0 = r1;
    L_0x004e:
        if (r4 == 0) goto L_0x0053;
    L_0x0050:
        if (r3 <= 0) goto L_0x00b8;
    L_0x0052:
        r0 = r1;
    L_0x0053:
        if (r0 == 0) goto L_0x0093;
    L_0x0055:
        r0 = r7.mOverflowButton;
        if (r0 != 0) goto L_0x0062;
    L_0x0059:
        r0 = new com.actionbarsherlock.internal.view.menu.ActionMenuPresenter$OverflowMenuButton;
        r1 = r7.mSystemContext;
        r0.<init>(r7, r1);
        r7.mOverflowButton = r0;
    L_0x0062:
        r0 = r7.mOverflowButton;
        r0 = r0.getParent();
        r0 = (android.view.ViewGroup) r0;
        r1 = r7.mMenuView;
        if (r0 == r1) goto L_0x0091;
    L_0x006e:
        if (r0 == 0) goto L_0x0075;
    L_0x0070:
        r1 = r7.mOverflowButton;
        r0.removeView(r1);
    L_0x0075:
        r0 = r7.mMenuView;
        r0 = (com.actionbarsherlock.internal.view.menu.ActionMenuView) r0;
        r1 = com.actionbarsherlock.ActionBarSherlock.isRtl;
        if (r1 == 0) goto L_0x0088;
    L_0x007d:
        r1 = r7.mOverflowButton;
        r3 = r0.generateOverflowButtonLayoutParams();
        r0.addView(r1, r2, r3);
        if (r4 == 0) goto L_0x0091;
    L_0x0088:
        r1 = r7.mOverflowButton;
        r2 = r0.generateOverflowButtonLayoutParams();
        r0.addView(r1, r2);
    L_0x0091:
        if (r4 == 0) goto L_0x00aa;
    L_0x0093:
        r0 = r7.mOverflowButton;
        if (r0 == 0) goto L_0x00aa;
    L_0x0097:
        r0 = r7.mOverflowButton;
        r0 = r0.getParent();
        r1 = r7.mMenuView;
        if (r0 != r1) goto L_0x00aa;
    L_0x00a1:
        r0 = r7.mMenuView;
        r0 = (android.view.ViewGroup) r0;
        r1 = r7.mOverflowButton;
        r0.removeView(r1);
    L_0x00aa:
        r0 = r7.mMenuView;
        r0 = (com.actionbarsherlock.internal.view.menu.ActionMenuView) r0;
        r1 = r7.mReserveOverflow;
        r0.setOverflowReserved(r1);
        return;
    L_0x00b4:
        r0 = 0;
        goto L_0x0035;
    L_0x00b6:
        r0 = r2;
        goto L_0x004e;
    L_0x00b8:
        r0 = r2;
        goto L_0x0053;
    L_0x00ba:
        r0 = r2;
        goto L_0x0053;
    L_0x00bc:
        r3 = r0;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.ActionMenuPresenter.updateMenuView(boolean):void");
    }

    public static boolean reserveOverflow(Context context) {
        return VERSION.SDK_INT < 14 ? VERSION.SDK_INT >= 11 : !HasPermanentMenuKey.get(context);
    }

    static OpenOverflowRunnable access$402(ActionMenuPresenter actionMenuPresenter, OpenOverflowRunnable openOverflowRunnable) {
        actionMenuPresenter.mPostedOpenRunnable = openOverflowRunnable;
        return openOverflowRunnable;
    }

    public boolean dismissPopupMenus() {
        return hideOverflowMenu() | hideSubMenus();
    }

    public void setReserveOverflow(boolean z) {
        this.mReserveOverflow = z;
        this.mReserveOverflowSet = true;
    }

    public boolean hideOverflowMenu() {
        if (this.mPostedOpenRunnable == null || this.mMenuView == null) {
            MenuPopupHelper menuPopupHelper = this.mOverflowPopup;
            if (menuPopupHelper == null) {
                return false;
            }
            menuPopupHelper.dismiss();
            return true;
        }
        ((View) this.mMenuView).removeCallbacks(this.mPostedOpenRunnable);
        this.mPostedOpenRunnable = null;
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.mMaxItemsSet) {
            this.mMaxItems = ResourcesCompat.getResources_getInteger(this.mContext, R.integer.abs__max_action_buttons);
            if (this.mMenu != null) {
                this.mMenu.onItemsChanged(true);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initForMenu(android.content.Context r7, com.actionbarsherlock.internal.view.menu.MenuBuilder r8) {
        /*
        r6_this = this;
        r5 = 0;
        r4 = 0;
        super.initForMenu(r7, r8);
        r1 = r7.getResources();
        r0 = r6.mReserveOverflowSet;
        if (r0 != 0) goto L_0x0015;
    L_0x000d:
        r0 = r6.mContext;
        r0 = reserveOverflow(r0);
        r6.mReserveOverflow = r0;
    L_0x0015:
        r0 = r6.mWidthLimitSet;
        if (r0 != 0) goto L_0x0023;
    L_0x0019:
        r0 = r1.getDisplayMetrics();
        r0 = r0.widthPixels;
        r0 = r0 / 2;
        r6.mWidthLimit = r0;
    L_0x0023:
        r0 = r6.mMaxItemsSet;
        if (r0 != 0) goto L_0x002f;
    L_0x0027:
        r0 = com.actionbarsherlock.R.integer.abs__max_action_buttons;
        r0 = com.actionbarsherlock.internal.ResourcesCompat.getResources_getInteger(r7, r0);
        r6.mMaxItems = r0;
    L_0x002f:
        r0 = r6.mWidthLimit;
        r2 = r6.mReserveOverflow;
        if (r2 == 0) goto L_0x0056;
    L_0x0035:
        r2 = r6.mOverflowButton;
        if (r2 != 0) goto L_0x004b;
    L_0x0039:
        r2 = new com.actionbarsherlock.internal.view.menu.ActionMenuPresenter$OverflowMenuButton;
        r3 = r6.mSystemContext;
        r2.<init>(r6, r3);
        r6.mOverflowButton = r2;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4);
        r3 = r6.mOverflowButton;
        r3.measure(r2, r2);
    L_0x004b:
        r2 = r6.mOverflowButton;
        r2 = r2.getMeasuredWidth();
        r0 = r0 - r2;
        r2 = com.actionbarsherlock.internal.view.menu.MenuBuilder.a;
        if (r2 == 0) goto L_0x0058;
    L_0x0056:
        r6.mOverflowButton = r5;
    L_0x0058:
        r6.mActionItemWidthLimit = r0;
        r0 = 1113587712; // 0x42600000 float:56.0 double:5.50185432E-315;
        r1 = r1.getDisplayMetrics();
        r1 = r1.density;
        r0 = r0 * r1;
        r0 = (int) r0;
        r6.mMinCellSize = r0;
        r6.mScrapActionButtonView = r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.ActionMenuPresenter.initForMenu(android.content.Context, com.actionbarsherlock.internal.view.menu.MenuBuilder):void");
    }

    public void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
            if (MenuBuilder.a == 0) {
                return;
            }
        }
        this.mMenu.close(false);
    }

    public boolean showOverflowMenu() {
        if (!this.mReserveOverflow || isOverflowMenuShowing() || this.mMenu == null || this.mMenuView == null || this.mPostedOpenRunnable != null || this.mMenu.getNonActionItems().isEmpty()) {
            return false;
        }
        this.mPostedOpenRunnable = new OpenOverflowRunnable(this, new OverflowPopup(this, this.mContext, this.mMenu, this.mOverflowButton, true));
        ((View) this.mMenuView).post(this.mPostedOpenRunnable);
        super.onSubMenuSelected(null);
        return true;
    }

    public boolean hideSubMenus() {
        if (this.mActionButtonPopup == null) {
            return false;
        }
        this.mActionButtonPopup.dismiss();
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean flagActionItems() {
        /*
        r22_this = this;
        r14 = com.actionbarsherlock.internal.view.menu.MenuBuilder.a;
        r0 = r22;
        r2 = r0.mMenu;
        r15 = r2.getVisibleItems();
        r16 = r15.size();
        r0 = r22;
        r8 = r0.mMaxItems;
        r0 = r22;
        r10 = r0.mActionItemWidthLimit;
        r2 = 0;
        r3 = 0;
        r17 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3);
        r0 = r22;
        r2 = r0.mMenuView;
        r2 = (android.view.ViewGroup) r2;
        r4 = 0;
        r6 = 0;
        r9 = 0;
        r7 = 0;
        r3 = 0;
        r11 = r3;
    L_0x0028:
        r0 = r16;
        if (r11 >= r0) goto L_0x0209;
    L_0x002c:
        r3 = r15.get(r11);
        r3 = (com.actionbarsherlock.internal.view.menu.MenuItemImpl) r3;
        r5 = r3.requiresActionButton();
        if (r5 == 0) goto L_0x0044;
    L_0x0038:
        r5 = r4 + 1;
        if (r14 == 0) goto L_0x0201;
    L_0x003c:
        r4 = com.actionbarsherlock.app.SherlockActivity.a;
        if (r4 == 0) goto L_0x01b4;
    L_0x0040:
        r4 = 0;
    L_0x0041:
        com.actionbarsherlock.app.SherlockActivity.a = r4;
        r4 = r5;
    L_0x0044:
        r5 = r3.requestsActionButton();
        if (r5 == 0) goto L_0x01fe;
    L_0x004a:
        r5 = r6 + 1;
        if (r14 == 0) goto L_0x01fa;
    L_0x004e:
        r6 = 1;
        r21 = r6;
        r6 = r4;
        r4 = r21;
    L_0x0054:
        r0 = r22;
        r7 = r0.mExpandedActionViewsExclusive;
        if (r7 == 0) goto L_0x01f7;
    L_0x005a:
        r3 = r3.isActionViewExpanded();
        if (r3 == 0) goto L_0x01f7;
    L_0x0060:
        r8 = 0;
        r3 = r8;
    L_0x0062:
        r7 = r11 + 1;
        if (r14 == 0) goto L_0x01f0;
    L_0x0066:
        r0 = r22;
        r7 = r0.mReserveOverflow;
        if (r7 == 0) goto L_0x0074;
    L_0x006c:
        if (r4 != 0) goto L_0x0072;
    L_0x006e:
        r4 = r6 + r5;
        if (r4 <= r3) goto L_0x0074;
    L_0x0072:
        r3 = r3 + -1;
    L_0x0074:
        r6 = r3 - r6;
        r0 = r22;
        r0 = r0.mActionButtonGroups;
        r18 = r0;
        r18.clear();
        r4 = 0;
        r3 = 0;
        r0 = r22;
        r5 = r0.mStrictWidthLimit;
        if (r5 == 0) goto L_0x01ed;
    L_0x0087:
        r0 = r22;
        r3 = r0.mMinCellSize;
        r3 = r10 / r3;
        r0 = r22;
        r4 = r0.mMinCellSize;
        r4 = r10 % r4;
        r0 = r22;
        r5 = r0.mMinCellSize;
        r4 = r4 / r3;
        r4 = r4 + r5;
        r5 = r4;
    L_0x009a:
        r4 = 0;
        r13 = r4;
        r7 = r9;
        r8 = r10;
        r4 = r3;
        r10 = r6;
    L_0x00a0:
        r0 = r16;
        if (r13 >= r0) goto L_0x01b2;
    L_0x00a4:
        r3 = r15.get(r13);
        r3 = (com.actionbarsherlock.internal.view.menu.MenuItemImpl) r3;
        r6 = r3.requiresActionButton();
        if (r6 == 0) goto L_0x01e9;
    L_0x00b0:
        r0 = r22;
        r6 = r0.mScrapActionButtonView;
        r0 = r22;
        r6 = r0.getItemView(r3, r6, r2);
        r0 = r22;
        r9 = r0.mScrapActionButtonView;
        if (r9 != 0) goto L_0x00c4;
    L_0x00c0:
        r0 = r22;
        r0.mScrapActionButtonView = r6;
    L_0x00c4:
        r0 = r22;
        r9 = r0.mStrictWidthLimit;
        if (r9 == 0) goto L_0x00d4;
    L_0x00ca:
        r9 = 0;
        r0 = r17;
        r9 = com.actionbarsherlock.internal.view.menu.ActionMenuView.measureChildForCells(r6, r5, r4, r0, r9);
        r4 = r4 - r9;
        if (r14 == 0) goto L_0x00db;
    L_0x00d4:
        r0 = r17;
        r1 = r17;
        r6.measure(r0, r1);
    L_0x00db:
        r6 = r6.getMeasuredWidth();
        r8 = r8 - r6;
        if (r7 != 0) goto L_0x01e6;
    L_0x00e2:
        r7 = r3.getGroupId();
        if (r7 == 0) goto L_0x00ee;
    L_0x00e8:
        r9 = 1;
        r0 = r18;
        r0.put(r7, r9);
    L_0x00ee:
        r7 = 1;
        r3.setIsActionButton(r7);
        if (r14 == 0) goto L_0x01e4;
    L_0x00f4:
        r7 = r8;
    L_0x00f5:
        r8 = r3.requestsActionButton();
        if (r8 == 0) goto L_0x01e1;
    L_0x00fb:
        r19 = r3.getGroupId();
        r11 = r18.get(r19);
        if (r10 > 0) goto L_0x0107;
    L_0x0105:
        if (r11 == 0) goto L_0x01b7;
    L_0x0107:
        if (r7 <= 0) goto L_0x01b7;
    L_0x0109:
        r0 = r22;
        r8 = r0.mStrictWidthLimit;
        if (r8 == 0) goto L_0x0111;
    L_0x010f:
        if (r4 <= 0) goto L_0x01b7;
    L_0x0111:
        r8 = 1;
    L_0x0112:
        if (r8 == 0) goto L_0x01dc;
    L_0x0114:
        r0 = r22;
        r9 = r0.mScrapActionButtonView;
        r0 = r22;
        r12 = r0.getItemView(r3, r9, r2);
        r0 = r22;
        r9 = r0.mScrapActionButtonView;
        if (r9 != 0) goto L_0x0128;
    L_0x0124:
        r0 = r22;
        r0.mScrapActionButtonView = r12;
    L_0x0128:
        r0 = r22;
        r9 = r0.mStrictWidthLimit;
        if (r9 == 0) goto L_0x01d5;
    L_0x012e:
        r9 = 0;
        r0 = r17;
        r20 = com.actionbarsherlock.internal.view.menu.ActionMenuView.measureChildForCells(r12, r5, r4, r0, r9);
        r9 = r4 - r20;
        if (r20 != 0) goto L_0x01d2;
    L_0x0139:
        r4 = 0;
    L_0x013a:
        if (r14 == 0) goto L_0x0145;
    L_0x013c:
        r8 = r9;
    L_0x013d:
        r0 = r17;
        r1 = r17;
        r12.measure(r0, r1);
        r9 = r8;
    L_0x0145:
        r8 = r12.getMeasuredWidth();
        r7 = r7 - r8;
        if (r6 != 0) goto L_0x014d;
    L_0x014c:
        r6 = r8;
    L_0x014d:
        r0 = r22;
        r8 = r0.mStrictWidthLimit;
        if (r8 == 0) goto L_0x01d0;
    L_0x0153:
        if (r7 < 0) goto L_0x01ba;
    L_0x0155:
        r8 = 1;
    L_0x0156:
        r8 = r8 & r4;
        if (r14 == 0) goto L_0x01c8;
    L_0x0159:
        r4 = r7 + r6;
        if (r4 <= 0) goto L_0x01bc;
    L_0x015d:
        r4 = 1;
    L_0x015e:
        r8 = r8 & r4;
        r12 = r8;
        r8 = r6;
        r21 = r9;
        r9 = r7;
        r7 = r21;
    L_0x0166:
        if (r12 == 0) goto L_0x0174;
    L_0x0168:
        if (r19 == 0) goto L_0x0174;
    L_0x016a:
        r4 = 1;
        r0 = r18;
        r1 = r19;
        r0.put(r1, r4);
        if (r14 == 0) goto L_0x01a2;
    L_0x0174:
        if (r11 == 0) goto L_0x01a2;
    L_0x0176:
        r4 = 0;
        r0 = r18;
        r1 = r19;
        r0.put(r1, r4);
        r4 = 0;
        r11 = r4;
        r6 = r10;
    L_0x0181:
        if (r11 >= r13) goto L_0x01c6;
    L_0x0183:
        r4 = r15.get(r11);
        r4 = (com.actionbarsherlock.internal.view.menu.MenuItemImpl) r4;
        r10 = r4.getGroupId();
        r0 = r19;
        if (r10 != r0) goto L_0x019d;
    L_0x0191:
        r10 = r4.isActionButton();
        if (r10 == 0) goto L_0x0199;
    L_0x0197:
        r6 = r6 + 1;
    L_0x0199:
        r10 = 0;
        r4.setIsActionButton(r10);
    L_0x019d:
        r10 = r6;
        r4 = r11 + 1;
        if (r14 == 0) goto L_0x01c3;
    L_0x01a2:
        r4 = r10;
    L_0x01a3:
        if (r12 == 0) goto L_0x01a7;
    L_0x01a5:
        r4 = r4 + -1;
    L_0x01a7:
        r3.setIsActionButton(r12);
        r6 = r8;
        r3 = r4;
        r8 = r9;
        r4 = r7;
    L_0x01ae:
        r7 = r13 + 1;
        if (r14 == 0) goto L_0x01be;
    L_0x01b2:
        r2 = 1;
        return r2;
    L_0x01b4:
        r4 = 1;
        goto L_0x0041;
    L_0x01b7:
        r8 = 0;
        goto L_0x0112;
    L_0x01ba:
        r8 = 0;
        goto L_0x0156;
    L_0x01bc:
        r4 = 0;
        goto L_0x015e;
    L_0x01be:
        r13 = r7;
        r10 = r3;
        r7 = r6;
        goto L_0x00a0;
    L_0x01c3:
        r11 = r4;
        r6 = r10;
        goto L_0x0181;
    L_0x01c6:
        r4 = r6;
        goto L_0x01a3;
    L_0x01c8:
        r12 = r8;
        r8 = r6;
        r21 = r9;
        r9 = r7;
        r7 = r21;
        goto L_0x0166;
    L_0x01d0:
        r8 = r4;
        goto L_0x0159;
    L_0x01d2:
        r4 = r8;
        goto L_0x013a;
    L_0x01d5:
        r21 = r8;
        r8 = r4;
        r4 = r21;
        goto L_0x013d;
    L_0x01dc:
        r12 = r8;
        r9 = r7;
        r8 = r6;
        r7 = r4;
        goto L_0x0166;
    L_0x01e1:
        r8 = r7;
        r3 = r10;
        goto L_0x01ae;
    L_0x01e4:
        r3 = r10;
        goto L_0x01ae;
    L_0x01e6:
        r6 = r7;
        goto L_0x00e2;
    L_0x01e9:
        r6 = r7;
        r7 = r8;
        goto L_0x00f5;
    L_0x01ed:
        r5 = r4;
        goto L_0x009a;
    L_0x01f0:
        r11 = r7;
        r8 = r3;
        r7 = r4;
        r4 = r6;
        r6 = r5;
        goto L_0x0028;
    L_0x01f7:
        r3 = r8;
        goto L_0x0062;
    L_0x01fa:
        r6 = r4;
        r4 = r7;
        goto L_0x0054;
    L_0x01fe:
        r5 = r6;
        goto L_0x004e;
    L_0x0201:
        r4 = r7;
        r21 = r6;
        r6 = r5;
        r5 = r21;
        goto L_0x0054;
    L_0x0209:
        r5 = r6;
        r3 = r8;
        r6 = r4;
        r4 = r7;
        goto L_0x0066;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.ActionMenuPresenter.flagActionItems():boolean");
    }
}
