package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnActionExpandListener;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;
import com.actionbarsherlock.view.SubMenu;

public class ActionMenuItem implements MenuItem {
    private OnMenuItemClickListener mClickListener;
    private Context mContext;
    private int mFlags;
    private final int mGroup;
    private Drawable mIconDrawable;
    private final int mId;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;

    public int getItemId() {
        return this.mId;
    }

    public MenuItem setEnabled(boolean z) {
        try {
            this.mFlags = (z ? 16 : 0) | (this.mFlags & -17);
            return this;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mClickListener = onMenuItemClickListener;
        return this;
    }

    public Drawable getIcon() {
        return this.mIconDrawable;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public MenuItem setChecked(boolean z) {
        try {
            int i;
            int i2 = this.mFlags & -3;
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            this.mFlags = i | i2;
            return this;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public View getActionView() {
        return null;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.mIconDrawable = drawable;
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public boolean hasSubMenu() {
        return false;
    }

    public MenuItem setNumericShortcut(char c) {
        this.mShortcutNumericChar = c;
        return this;
    }

    public ActionProvider getActionProvider() {
        return null;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        return this;
    }

    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.mShortcutAlphabeticChar = c;
        return this;
    }

    public MenuItem setTitle(int i) {
        this.mTitle = this.mContext.getResources().getString(i);
        return this;
    }

    public int getGroupId() {
        return this.mGroup;
    }

    public MenuItem setVisible(boolean z) {
        try {
            int i;
            int i2 = this.mFlags & 8;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            this.mFlags = i | i2;
            return this;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public ActionMenuItem(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.mFlags = 16;
        this.mContext = context;
        this.mId = i2;
        this.mGroup = i;
        this.mOrdering = i4;
        this.mTitle = charSequence;
    }

    public MenuItem setIcon(int i) {
        this.mIconDrawable = this.mContext.getResources().getDrawable(i);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.mTitleCondensed = charSequence;
        return this;
    }

    public boolean expandActionView() {
        return false;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        return this;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public boolean isVisible() {
        try {
            return (this.mFlags & 8) == 0;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public MenuItem setCheckable(boolean z) {
        try {
            int i;
            int i2 = this.mFlags & -2;
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            this.mFlags = i | i2;
            return this;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }
}
