package com.actionbarsherlock.internal.view;

import android.content.Context;
import android.view.View;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.internal.view.menu.MenuBuilder.Callback;
import com.actionbarsherlock.internal.widget.ActionBarContextView;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import java.lang.ref.WeakReference;

public class StandaloneActionMode extends ActionMode implements Callback {
    public static int b;
    private ActionMode.Callback mCallback;
    private Context mContext;
    private ActionBarContextView mContextView;
    private WeakReference mCustomView;
    private boolean mFinished;
    private boolean mFocusable;
    private MenuBuilder mMenu;

    public Menu getMenu() {
        return this.mMenu;
    }

    public void setCustomView(View view) {
        int i = b;
        this.mContextView.setCustomView(view);
        this.mCustomView = view != null ? new WeakReference(view) : null;
        if (SherlockActivity.a) {
            b = i + 1;
        }
    }

    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.mCallback.onActionItemClicked(this, menuItem);
    }

    public StandaloneActionMode(Context context, ActionBarContextView actionBarContextView, ActionMode.Callback callback, boolean z) {
        boolean z2 = true;
        int i = b;
        this.mContext = context;
        this.mContextView = actionBarContextView;
        this.mCallback = callback;
        this.mMenu = new MenuBuilder(context).setDefaultShowAsAction(1);
        this.mMenu.setCallback(this);
        this.mFocusable = z;
        if (i != 0) {
            if (SherlockActivity.a) {
                z2 = false;
            }
            SherlockActivity.a = z2;
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.mContextView.setTitle(charSequence);
    }

    public void invalidate() {
        this.mCallback.onPrepareActionMode(this, this.mMenu);
    }

    public void onMenuModeChange(MenuBuilder menuBuilder) {
        invalidate();
        this.mContextView.showOverflowMenu();
    }

    public void finish() {
        if (!this.mFinished) {
            this.mFinished = true;
            this.mContextView.sendAccessibilityEvent(32);
            this.mCallback.onDestroyActionMode(this);
        }
    }
}
