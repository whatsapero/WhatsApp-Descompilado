package com.actionbarsherlock.internal.view.menu;

import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;
import java.util.WeakHashMap;

public class MenuWrapper implements Menu {
    private final WeakHashMap mNativeMap;
    private final android.view.Menu mNativeMenu;

    public android.view.Menu unwrap() {
        return this.mNativeMenu;
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return addInternal(this.mNativeMenu.add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addInternal(this.mNativeMenu.addSubMenu(i, i2, i3, i4));
    }

    public MenuWrapper(android.view.Menu menu) {
        this.mNativeMap = new WeakHashMap();
        this.mNativeMenu = menu;
    }

    public MenuItem findItem(int i) {
        return findItem(this.mNativeMenu.findItem(i));
    }

    public MenuItem findItem(android.view.MenuItem menuItem) {
        if (menuItem == null) {
            return null;
        }
        MenuItem menuItem2 = (MenuItem) this.mNativeMap.get(menuItem);
        return menuItem2 == null ? addInternal(menuItem) : menuItem2;
    }

    private SubMenu addInternal(android.view.SubMenu subMenu) {
        SubMenu subMenuWrapper = new SubMenuWrapper(subMenu);
        this.mNativeMap.put(subMenu.getItem(), subMenuWrapper.getItem());
        return subMenuWrapper;
    }

    private MenuItem addInternal(android.view.MenuItem menuItem) {
        MenuItem menuItemWrapper = new MenuItemWrapper(menuItem);
        this.mNativeMap.put(menuItem, menuItemWrapper);
        return menuItemWrapper;
    }

    public boolean hasVisibleItems() {
        return this.mNativeMenu.hasVisibleItems();
    }

    public MenuItem add(CharSequence charSequence) {
        return addInternal(this.mNativeMenu.add(charSequence));
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.mNativeMenu.setGroupCheckable(i, z, z2);
    }

    public int size() {
        return this.mNativeMenu.size();
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return addInternal(this.mNativeMenu.addSubMenu(i, i2, i3, charSequence));
    }

    public void clear() {
        this.mNativeMap.clear();
        this.mNativeMenu.clear();
    }

    public void setGroupVisible(int i, boolean z) {
        this.mNativeMenu.setGroupVisible(i, z);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return addInternal(this.mNativeMenu.add(i, i2, i3, i4));
    }
}
