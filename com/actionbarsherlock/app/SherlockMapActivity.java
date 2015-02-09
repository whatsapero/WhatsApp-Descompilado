package com.actionbarsherlock.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.ActionBarSherlock.OnActionModeFinishedListener;
import com.actionbarsherlock.ActionBarSherlock.OnActionModeStartedListener;
import com.actionbarsherlock.ActionBarSherlock.OnCreatePanelMenuListener;
import com.actionbarsherlock.ActionBarSherlock.OnMenuItemSelectedListener;
import com.actionbarsherlock.ActionBarSherlock.OnPreparePanelListener;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.maps.MapActivity;

public abstract class SherlockMapActivity extends MapActivity implements OnCreatePanelMenuListener, OnPreparePanelListener, OnMenuItemSelectedListener, OnActionModeStartedListener, OnActionModeFinishedListener {
    private ActionBarSherlock mSherlock;

    public void onPanelClosed(int i, Menu menu) {
        getSherlock().dispatchPanelClosed(i, menu);
        super.onPanelClosed(i, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public boolean onPreparePanel(int i, View view, com.actionbarsherlock.view.Menu menu) {
        return i == 0 ? onPrepareOptionsMenu(menu) : false;
    }

    protected void onPostCreate(Bundle bundle) {
        getSherlock().dispatchPostCreate(bundle);
        super.onPostCreate(bundle);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        getSherlock().addContentView(view, layoutParams);
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        return getSherlock().dispatchMenuOpened(i, menu) ? true : super.onMenuOpened(i, menu);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        getSherlock().setContentView(view, layoutParams);
    }

    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
        return true;
    }

    public void setContentView(int i) {
        getSherlock().setContentView(i);
    }

    protected void onDestroy() {
        getSherlock().dispatchDestroy();
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getSherlock().dispatchConfigurationChanged(configuration);
    }

    protected void onPause() {
        getSherlock().dispatchPause();
        super.onPause();
    }

    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        return getSherlock().dispatchOptionsItemSelected(menuItem);
    }

    public void onActionModeFinished(ActionMode actionMode) {
    }

    public void closeOptionsMenu() {
        if (!getSherlock().dispatchCloseOptionsMenu()) {
            super.closeOptionsMenu();
        }
    }

    public ActionBar getSupportActionBar() {
        return getSherlock().getActionBar();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return i == 0 ? onOptionsItemSelected(menuItem) : false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return getSherlock().dispatchKeyEvent(keyEvent) ? true : super.dispatchKeyEvent(keyEvent);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getSherlock().dispatchSaveInstanceState(bundle);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        return getSherlock().dispatchCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(com.actionbarsherlock.view.Menu menu) {
        return true;
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        getSherlock().dispatchTitleChanged(charSequence, i);
        super.onTitleChanged(charSequence, i);
    }

    protected void onPostResume() {
        super.onPostResume();
        getSherlock().dispatchPostResume();
    }

    public void invalidateOptionsMenu() {
        getSherlock().dispatchInvalidateOptionsMenu();
    }

    public boolean onCreatePanelMenu(int i, com.actionbarsherlock.view.Menu menu) {
        return i == 0 ? onCreateOptionsMenu(menu) : false;
    }

    public void onActionModeStarted(ActionMode actionMode) {
    }

    public void openOptionsMenu() {
        if (!getSherlock().dispatchOpenOptionsMenu()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(View view) {
        getSherlock().setContentView(view);
    }

    protected final ActionBarSherlock getSherlock() {
        if (this.mSherlock == null) {
            this.mSherlock = ActionBarSherlock.wrap(this, 1);
        }
        return this.mSherlock;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        return getSherlock().dispatchPrepareOptionsMenu(menu);
    }

    protected void onStop() {
        getSherlock().dispatchStop();
        super.onStop();
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        getSherlock().dispatchRestoreInstanceState(bundle);
    }
}
