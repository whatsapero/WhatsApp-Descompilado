package com.actionbarsherlock.view;

public interface Menu {
    MenuItem add(int i, int i2, int i3, int i4);

    MenuItem add(int i, int i2, int i3, CharSequence charSequence);

    MenuItem add(CharSequence charSequence);

    SubMenu addSubMenu(int i, int i2, int i3, int i4);

    SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence);

    void clear();

    MenuItem findItem(int i);

    boolean hasVisibleItems();

    void setGroupCheckable(int i, boolean z, boolean z2);

    void setGroupVisible(int i, boolean z);

    int size();
}
