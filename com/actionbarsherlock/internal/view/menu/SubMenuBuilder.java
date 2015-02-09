package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import com.actionbarsherlock.internal.view.menu.MenuBuilder.Callback;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

public class SubMenuBuilder extends MenuBuilder implements SubMenu {
    private MenuItemImpl mItem;
    private MenuBuilder mParentMenu;

    public MenuItem getItem() {
        return this.mItem;
    }

    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    boolean dispatchMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        return super.dispatchMenuItemSelected(menuBuilder, menuItem) || this.mParentMenu.dispatchMenuItemSelected(menuBuilder, menuItem);
    }

    public void setCallback(Callback callback) {
        this.mParentMenu.setCallback(callback);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    public void setQwertyMode(boolean z) {
        this.mParentMenu.setQwertyMode(z);
    }

    public boolean expandItemActionView(MenuItemImpl menuItemImpl) {
        return this.mParentMenu.expandItemActionView(menuItemImpl);
    }

    public boolean collapseItemActionView(MenuItemImpl menuItemImpl) {
        return this.mParentMenu.collapseItemActionView(menuItemImpl);
    }

    public SubMenuBuilder(Context context, MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        super(context);
        this.mParentMenu = menuBuilder;
        this.mItem = menuItemImpl;
    }

    public MenuBuilder getRootMenu() {
        return this.mParentMenu;
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    public String getActionViewStatesKey() {
        int itemId;
        if (this.mItem != null) {
            itemId = this.mItem.getItemId();
        } else {
            itemId = 0;
        }
        return itemId == 0 ? null : super.getActionViewStatesKey() + ":" + itemId;
    }
}
