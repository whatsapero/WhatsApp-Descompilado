package com.actionbarsherlock.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Watson;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.ActionBarSherlock.OnActionModeFinishedListener;
import com.actionbarsherlock.ActionBarSherlock.OnActionModeStartedListener;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;

public class SherlockFragmentActivity extends Watson implements OnActionModeStartedListener, OnActionModeFinishedListener {
    private boolean mIgnoreNativeCreate;
    private boolean mIgnoreNativePrepare;
    private boolean mIgnoreNativeSelected;
    private ActionBarSherlock mSherlock;

    protected void onPause() {
        getSherlock().dispatchPause();
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }

    public void requestWindowFeature(long j) {
        getSherlock().requestFeature((int) j);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public void closeOptionsMenu() {
        if (!getSherlock().dispatchCloseOptionsMenu()) {
            super.closeOptionsMenu();
        }
    }

    public ActionMode startActionMode(Callback callback) {
        return getSherlock().startActionMode(callback);
    }

    protected void onPostCreate(Bundle bundle) {
        getSherlock().dispatchPostCreate(bundle);
        super.onPostCreate(bundle);
    }

    public SherlockFragmentActivity() {
        int i = SherlockListActivity.a;
        this.mIgnoreNativeCreate = false;
        this.mIgnoreNativePrepare = false;
        this.mIgnoreNativeSelected = false;
        if (SherlockActivity.a) {
            SherlockListActivity.a = i + 1;
        }
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
        getSherlock().setProgressBarIndeterminateVisibility(z);
    }

    public void invalidateOptionsMenu() {
        getSherlock().dispatchInvalidateOptionsMenu();
    }

    public final boolean onPreparePanel(int i, View view, android.view.Menu menu) {
        if (i != 0 || this.mIgnoreNativePrepare) {
            return super.onPreparePanel(i, view, menu);
        }
        this.mIgnoreNativePrepare = true;
        boolean dispatchPrepareOptionsMenu = getSherlock().dispatchPrepareOptionsMenu(menu);
        this.mIgnoreNativePrepare = false;
        return dispatchPrepareOptionsMenu;
    }

    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        return true;
    }

    public ActionBar getSupportActionBar() {
        return getSherlock().getActionBar();
    }

    public final boolean onMenuOpened(int i, android.view.Menu menu) {
        return getSherlock().dispatchMenuOpened(i, menu) ? true : super.onMenuOpened(i, menu);
    }

    public void setContentView(int i) {
        getSherlock().setContentView(i);
    }

    public MenuInflater getSupportMenuInflater() {
        return getSherlock().getMenuInflater();
    }

    protected void onStop() {
        getSherlock().dispatchStop();
        super.onStop();
    }

    protected void onPostResume() {
        super.onPostResume();
        getSherlock().dispatchPostResume();
    }

    public final boolean onPrepareOptionsMenu(android.view.Menu menu) {
        return true;
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        getSherlock().dispatchTitleChanged(charSequence, i);
        super.onTitleChanged(charSequence, i);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        getSherlock().setContentView(view, layoutParams);
    }

    public void onActionModeStarted(ActionMode actionMode) {
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        getSherlock().addContentView(view, layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getSherlock().dispatchConfigurationChanged(configuration);
    }

    protected final ActionBarSherlock getSherlock() {
        if (this.mSherlock == null) {
            this.mSherlock = ActionBarSherlock.wrap(this, 1);
        }
        return this.mSherlock;
    }

    public void onPanelClosed(int i, android.view.Menu menu) {
        getSherlock().dispatchPanelClosed(i, menu);
        super.onPanelClosed(i, menu);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getSherlock().dispatchSaveInstanceState(bundle);
    }

    public void onActionModeFinished(ActionMode actionMode) {
    }

    public void setContentView(View view) {
        getSherlock().setContentView(view);
    }

    protected void onDestroy() {
        getSherlock().dispatchDestroy();
        super.onDestroy();
    }

    public void openOptionsMenu() {
        if (!getSherlock().dispatchOpenOptionsMenu()) {
            super.openOptionsMenu();
        }
    }

    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (i != 0 || this.mIgnoreNativeSelected) {
            return super.onMenuItemSelected(i, menuItem);
        }
        this.mIgnoreNativeSelected = true;
        boolean dispatchOptionsItemSelected = getSherlock().dispatchOptionsItemSelected(menuItem);
        this.mIgnoreNativeSelected = false;
        return dispatchOptionsItemSelected;
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        getSherlock().dispatchRestoreInstanceState(bundle);
    }

    public final boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        if (i != 0 || this.mIgnoreNativeCreate) {
            return super.onCreatePanelMenu(i, menu);
        }
        this.mIgnoreNativeCreate = true;
        boolean dispatchCreateOptionsMenu = getSherlock().dispatchCreateOptionsMenu(menu);
        this.mIgnoreNativeCreate = false;
        return dispatchCreateOptionsMenu;
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuItem) {
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return getSherlock().dispatchKeyEvent(keyEvent) ? true : super.dispatchKeyEvent(keyEvent);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }
}
