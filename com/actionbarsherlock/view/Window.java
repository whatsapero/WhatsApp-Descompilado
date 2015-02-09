package com.actionbarsherlock.view;

public abstract class Window extends android.view.Window {

    public interface Callback {
        boolean onMenuItemSelected(int i, MenuItem menuItem);
    }
}
