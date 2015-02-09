package com.actionbarsherlock.internal.view.menu;

import android.graphics.drawable.Drawable;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import com.actionbarsherlock.internal.view.ActionProviderWrapper;
import com.actionbarsherlock.internal.widget.CollapsibleActionViewWrapper;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.CollapsibleActionView;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnActionExpandListener;
import com.actionbarsherlock.view.SubMenu;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class MenuItemWrapper implements MenuItem, OnMenuItemClickListener {
    private static final String z;
    private OnActionExpandListener mActionExpandListener;
    private MenuItem.OnMenuItemClickListener mMenuItemClickListener;
    private android.view.MenuItem.OnActionExpandListener mNativeActionExpandListener;
    private final android.view.MenuItem mNativeItem;
    private SubMenu mSubMenu;

    static {
        char[] toCharArray = "0\u001d Hf\u0002\u000baUs\t\u001aaQb\u0002\u0002a[w\t\u0001.L6\u0005\naVc\u000b\u0003o".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 103;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 65;
                    break;
                case ay.p /*3*/:
                    i2 = 56;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean hasSubMenu() {
        return this.mNativeItem.hasSubMenu();
    }

    public MenuItem setActionView(View view) {
        if (view != null) {
            try {
                if (view instanceof CollapsibleActionView) {
                    view = new CollapsibleActionViewWrapper(view);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        this.mNativeItem.setActionView(view);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mMenuItemClickListener = onMenuItemClickListener;
        this.mNativeItem.setOnMenuItemClickListener(this);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.mNativeItem.setTitleCondensed(charSequence);
        return this;
    }

    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        try {
            return this.mMenuItemClickListener != null ? this.mMenuItemClickListener.onMenuItemClick(this) : false;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public MenuItem setChecked(boolean z) {
        this.mNativeItem.setChecked(z);
        return this;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        this.mNativeItem.setActionProvider(new ActionProviderWrapper(actionProvider));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.mNativeItem.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.mNativeItem.setIcon(drawable);
        return this;
    }

    public boolean expandActionView() {
        return this.mNativeItem.expandActionView();
    }

    public boolean collapseActionView() {
        return this.mNativeItem.collapseActionView();
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        try {
            this.mActionExpandListener = onActionExpandListener;
            if (this.mNativeActionExpandListener == null) {
                this.mNativeActionExpandListener = new android.view.MenuItem.OnActionExpandListener() {
                    final MenuItemWrapper this$0;

                    public boolean onMenuItemActionExpand(android.view.MenuItem menuItem) {
                        return MenuItemWrapper.access$000(this.this$0) != null ? MenuItemWrapper.access$000(this.this$0).onMenuItemActionExpand(this.this$0) : false;
                    }

                    public boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
                        return MenuItemWrapper.access$000(this.this$0) != null ? MenuItemWrapper.access$000(this.this$0).onMenuItemActionCollapse(this.this$0) : false;
                    }

                    {
                        this.this$0 = r1;
                    }
                };
                this.mNativeItem.setOnActionExpandListener(this.mNativeActionExpandListener);
            }
            return this;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public int getGroupId() {
        return this.mNativeItem.getGroupId();
    }

    public MenuItem setCheckable(boolean z) {
        this.mNativeItem.setCheckable(z);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.mNativeItem.setTitle(i);
        return this;
    }

    public boolean isActionViewExpanded() {
        return this.mNativeItem.isActionViewExpanded();
    }

    public ActionProvider getActionProvider() {
        android.view.ActionProvider actionProvider = this.mNativeItem.getActionProvider();
        if (actionProvider != null) {
            try {
                if (actionProvider instanceof ActionProviderWrapper) {
                    return ((ActionProviderWrapper) actionProvider).unwrap();
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return null;
    }

    public MenuItem setActionView(int i) {
        this.mNativeItem.setActionView(i);
        if (i != 0) {
            View actionView = this.mNativeItem.getActionView();
            try {
                if (actionView instanceof CollapsibleActionView) {
                    this.mNativeItem.setActionView(new CollapsibleActionViewWrapper(actionView));
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return this;
    }

    public int getItemId() {
        return this.mNativeItem.getItemId();
    }

    public Drawable getIcon() {
        return this.mNativeItem.getIcon();
    }

    public MenuItem setEnabled(boolean z) {
        this.mNativeItem.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.mNativeItem.setIcon(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.mNativeItem.setTitle(charSequence);
        return this;
    }

    static OnActionExpandListener access$000(MenuItemWrapper menuItemWrapper) {
        return menuItemWrapper.mActionExpandListener;
    }

    public MenuItem setNumericShortcut(char c) {
        this.mNativeItem.setNumericShortcut(c);
        return this;
    }

    public View getActionView() {
        View actionView = this.mNativeItem.getActionView();
        try {
            if (actionView instanceof CollapsibleActionViewWrapper) {
                actionView = ((CollapsibleActionViewWrapper) actionView).unwrap();
            }
            return actionView;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public MenuItemWrapper(android.view.MenuItem menuItem) {
        this.mSubMenu = null;
        this.mMenuItemClickListener = null;
        this.mActionExpandListener = null;
        this.mNativeActionExpandListener = null;
        if (menuItem == null) {
            throw new IllegalStateException(z);
        }
        this.mNativeItem = menuItem;
    }

    public MenuItem setVisible(boolean z) {
        this.mNativeItem.setVisible(z);
        return this;
    }

    public SubMenu getSubMenu() {
        try {
            if (hasSubMenu()) {
                if (this.mSubMenu == null) {
                    this.mSubMenu = new SubMenuWrapper(this.mNativeItem.getSubMenu());
                }
            }
            return this.mSubMenu;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void setShowAsAction(int i) {
        this.mNativeItem.setShowAsAction(i);
    }

    public boolean isVisible() {
        return this.mNativeItem.isVisible();
    }
}
