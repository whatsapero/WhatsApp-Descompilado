package com.actionbarsherlock.app;

import android.app.ListActivity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.ActionBarSherlock.OnActionModeFinishedListener;
import com.actionbarsherlock.ActionBarSherlock.OnActionModeStartedListener;
import com.actionbarsherlock.ActionBarSherlock.OnCreatePanelMenuListener;
import com.actionbarsherlock.ActionBarSherlock.OnMenuItemSelectedListener;
import com.actionbarsherlock.ActionBarSherlock.OnPreparePanelListener;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public abstract class SherlockListActivity extends ListActivity implements OnCreatePanelMenuListener, OnPreparePanelListener, OnMenuItemSelectedListener, OnActionModeStartedListener, OnActionModeFinishedListener {
    public static int a;
    private ActionBarSherlock mSherlock;

    public void onActionModeFinished(ActionMode actionMode) {
    }

    public void invalidateOptionsMenu() {
        getSherlock().dispatchInvalidateOptionsMenu();
    }

    public void requestWindowFeature(long j) {
        getSherlock().requestFeature((int) j);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }

    protected void onDestroy() {
        getSherlock().dispatchDestroy();
        super.onDestroy();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return getSherlock().dispatchKeyEvent(keyEvent) ? true : super.dispatchKeyEvent(keyEvent);
    }

    public final boolean onMenuOpened(int i, android.view.Menu menu) {
        return getSherlock().dispatchMenuOpened(i, menu) ? true : super.onMenuOpened(i, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void closeOptionsMenu() {
        if (!getSherlock().dispatchCloseOptionsMenu()) {
            super.closeOptionsMenu();
        }
    }

    protected void onPostResume() {
        super.onPostResume();
        getSherlock().dispatchPostResume();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getSherlock().dispatchConfigurationChanged(configuration);
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        getSherlock().dispatchRestoreInstanceState(bundle);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        getSherlock().setContentView(view, layoutParams);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return i == 0 ? onOptionsItemSelected(menuItem) : false;
    }

    public ActionMode startActionMode(Callback callback) {
        return getSherlock().startActionMode(callback);
    }

    public void setContentView(int i) {
        getSherlock().setContentView(i);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? onPrepareOptionsMenu(menu) : false;
    }

    protected void onStop() {
        getSherlock().dispatchStop();
        super.onStop();
    }

    public void onPanelClosed(int i, android.view.Menu menu) {
        getSherlock().dispatchPanelClosed(i, menu);
        super.onPanelClosed(i, menu);
    }

    protected void onPostCreate(Bundle bundle) {
        getSherlock().dispatchPostCreate(bundle);
        super.onPostCreate(bundle);
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
        getSherlock().setProgressBarIndeterminateVisibility(z);
    }

    public void openOptionsMenu() {
        if (!getSherlock().dispatchOpenOptionsMenu()) {
            super.openOptionsMenu();
        }
    }

    public void onActionModeStarted(ActionMode actionMode) {
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getSherlock().dispatchSaveInstanceState(bundle);
    }

    public void setContentView(View view) {
        getSherlock().setContentView(view);
    }

    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        return getSherlock().dispatchOptionsItemSelected(menuItem);
    }

    public final boolean onPrepareOptionsMenu(android.view.Menu menu) {
        return getSherlock().dispatchPrepareOptionsMenu(menu);
    }

    public ActionBar getSupportActionBar() {
        return getSherlock().getActionBar();
    }

    protected void onPause() {
        getSherlock().dispatchPause();
        super.onPause();
    }

    protected final ActionBarSherlock getSherlock() {
        if (this.mSherlock == null) {
            this.mSherlock = ActionBarSherlock.wrap(this, 1);
        }
        return this.mSherlock;
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? onCreateOptionsMenu(menu) : false;
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        getSherlock().dispatchTitleChanged(charSequence, i);
        super.onTitleChanged(charSequence, i);
    }

    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        return getSherlock().dispatchCreateOptionsMenu(menu);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        getSherlock().addContentView(view, layoutParams);
    }
}
