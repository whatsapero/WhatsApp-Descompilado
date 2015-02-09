package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.internal.view.menu.MenuPresenter.Callback;
import com.actionbarsherlock.internal.view.menu.MenuView.ItemView;
import java.util.ArrayList;

public abstract class BaseMenuPresenter implements MenuPresenter {
    private static final boolean IS_HONEYCOMB;
    private Callback mCallback;
    protected Context mContext;
    private int mId;
    protected LayoutInflater mInflater;
    private int mItemLayoutRes;
    protected MenuBuilder mMenu;
    private int mMenuLayoutRes;
    protected MenuView mMenuView;
    protected Context mSystemContext;
    protected LayoutInflater mSystemInflater;

    public abstract void bindItemView(MenuItemImpl menuItemImpl, ItemView itemView);

    public void updateMenuView(boolean z) {
        int i = MenuBuilder.a;
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup != null) {
            int i2;
            int i3;
            if (this.mMenu != null) {
                this.mMenu.flagActionItems();
                ArrayList visibleItems = this.mMenu.getVisibleItems();
                int size = visibleItems.size();
                int i4 = 0;
                i2 = 0;
                while (i4 < size) {
                    MenuItemImpl menuItemImpl = (MenuItemImpl) visibleItems.get(i4);
                    if (shouldIncludeItem(i2, menuItemImpl)) {
                        int childCount;
                        if (ActionBarSherlock.isRtl) {
                            childCount = (viewGroup.getChildCount() - i2) - 1;
                        } else {
                            childCount = i2;
                        }
                        View childAt = viewGroup.getChildAt(childCount);
                        MenuItemImpl itemData = childAt instanceof ItemView ? ((ItemView) childAt).getItemData() : null;
                        View itemView = getItemView(menuItemImpl, childAt, viewGroup);
                        if (menuItemImpl != itemData) {
                            itemView.setPressed(false);
                            if (IS_HONEYCOMB) {
                                itemView.jumpDrawablesToCurrentState();
                            }
                        }
                        if (itemView != childAt) {
                            if (ActionBarSherlock.isRtl) {
                                i3 = 0;
                            } else {
                                i3 = i2;
                            }
                            addItemView(itemView, i3);
                        }
                        i2++;
                    }
                    i3 = i4 + 1;
                    if (i != 0) {
                        break;
                    }
                    i4 = i3;
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (ActionBarSherlock.isRtl) {
                    i3 = 0;
                } else {
                    i3 = i2;
                }
                if (!filterLeftoverView(viewGroup, i3)) {
                    i2++;
                    if (i != 0) {
                        return;
                    }
                }
            }
        }
    }

    public boolean shouldIncludeItem(int i, MenuItemImpl menuItemImpl) {
        return true;
    }

    protected boolean filterLeftoverView(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public BaseMenuPresenter(Context context, int i, int i2) {
        this.mSystemContext = context;
        this.mSystemInflater = LayoutInflater.from(context);
        this.mMenuLayoutRes = i;
        this.mItemLayoutRes = i2;
    }

    protected void addItemView(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.mMenuView).addView(view, i);
    }

    public void setId(int i) {
        this.mId = i;
    }

    public ItemView createItemView(ViewGroup viewGroup) {
        return (ItemView) this.mSystemInflater.inflate(this.mItemLayoutRes, viewGroup, false);
    }

    public boolean flagActionItems() {
        return false;
    }

    static {
        IS_HONEYCOMB = VERSION.SDK_INT >= 11;
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            this.mMenuView = (MenuView) this.mSystemInflater.inflate(this.mMenuLayoutRes, viewGroup, false);
            this.mMenuView.initialize(this.mMenu);
            updateMenuView(true);
        }
        return this.mMenuView;
    }

    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(this.mContext);
        this.mMenu = menuBuilder;
    }

    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (this.mCallback != null) {
            this.mCallback.onCloseMenu(menuBuilder, z);
        }
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public View getItemView(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        ItemView itemView;
        if (view instanceof ItemView) {
            ItemView itemView2 = (ItemView) view;
            if (MenuBuilder.a == 0) {
                itemView = itemView2;
                bindItemView(menuItemImpl, itemView);
                return (View) itemView;
            }
        }
        itemView = createItemView(viewGroup);
        bindItemView(menuItemImpl, itemView);
        return (View) itemView;
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return this.mCallback != null ? this.mCallback.onOpenSubMenu(subMenuBuilder) : false;
    }
}
