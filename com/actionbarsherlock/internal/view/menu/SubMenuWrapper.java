package com.actionbarsherlock.internal.view.menu;

import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

public class SubMenuWrapper extends MenuWrapper implements SubMenu {
    private MenuItem mItem;
    private final android.view.SubMenu mNativeSubMenu;

    public void clearHeader() {
        this.mNativeSubMenu.clearHeader();
    }

    public SubMenuWrapper(android.view.SubMenu subMenu) {
        super(subMenu);
        this.mItem = null;
        this.mNativeSubMenu = subMenu;
    }

    public MenuItem getItem() {
        if (this.mItem == null) {
            this.mItem = new MenuItemWrapper(this.mNativeSubMenu.getItem());
        }
        return this.mItem;
    }
}
