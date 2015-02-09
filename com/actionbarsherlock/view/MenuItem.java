package com.actionbarsherlock.view;

import android.graphics.drawable.Drawable;
import android.view.View;

public interface MenuItem {

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    boolean collapseActionView();

    boolean expandActionView();

    ActionProvider getActionProvider();

    View getActionView();

    int getGroupId();

    Drawable getIcon();

    int getItemId();

    SubMenu getSubMenu();

    boolean hasSubMenu();

    boolean isActionViewExpanded();

    boolean isVisible();

    MenuItem setActionProvider(ActionProvider actionProvider);

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c);

    MenuItem setCheckable(boolean z);

    MenuItem setChecked(boolean z);

    MenuItem setEnabled(boolean z);

    MenuItem setIcon(int i);

    MenuItem setIcon(Drawable drawable);

    MenuItem setNumericShortcut(char c);

    MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener);

    MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener);

    void setShowAsAction(int i);

    MenuItem setTitle(int i);

    MenuItem setTitle(CharSequence charSequence);

    MenuItem setTitleCondensed(CharSequence charSequence);

    MenuItem setVisible(boolean z);
}
