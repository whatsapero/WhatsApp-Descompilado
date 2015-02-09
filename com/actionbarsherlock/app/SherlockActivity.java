package com.actionbarsherlock.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
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
import com.actionbarsherlock.view.MenuInflater;

public abstract class SherlockActivity extends Activity implements OnCreatePanelMenuListener, OnPreparePanelListener, OnMenuItemSelectedListener, OnActionModeStartedListener, OnActionModeFinishedListener {
    public static boolean a;
    private ActionBarSherlock mSherlock;

    public void openOptionsMenu() {
        if (!getSherlock().dispatchOpenOptionsMenu()) {
            super.openOptionsMenu();
        }
    }

    protected void onDestroy() {
        getSherlock().dispatchDestroy();
        super.onDestroy();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        return getSherlock().dispatchCreateOptionsMenu(menu);
    }

    protected final ActionBarSherlock getSherlock() {
        if (this.mSherlock == null) {
            this.mSherlock = ActionBarSherlock.wrap(this, 1);
        }
        return this.mSherlock;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return getSherlock().dispatchKeyEvent(keyEvent) ? true : super.dispatchKeyEvent(keyEvent);
    }

    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        getSherlock().dispatchTitleChanged(charSequence, i);
        super.onTitleChanged(charSequence, i);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        getSherlock().setContentView(view, layoutParams);
    }

    public boolean onPrepareOptionsMenu(com.actionbarsherlock.view.Menu menu) {
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return getSherlock().dispatchOptionsItemSelected(menuItem);
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuItem) {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getSherlock().dispatchConfigurationChanged(configuration);
    }

    public void onActionModeStarted(ActionMode actionMode) {
    }

    public void setContentView(int i) {
        getSherlock().setContentView(i);
    }

    public ActionBar getSupportActionBar() {
        return getSherlock().getActionBar();
    }

    public void onPanelClosed(int i, Menu menu) {
        getSherlock().dispatchPanelClosed(i, menu);
        super.onPanelClosed(i, menu);
    }

    protected void onPause() {
        getSherlock().dispatchPause();
        super.onPause();
    }

    public ActionMode startActionMode(Callback callback) {
        return getSherlock().startActionMode(callback);
    }

    protected void onPostResume() {
        super.onPostResume();
        getSherlock().dispatchPostResume();
    }

    public boolean onPreparePanel(int i, View view, com.actionbarsherlock.view.Menu menu) {
        return i == 0 ? onPrepareOptionsMenu(menu) : false;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        return getSherlock().dispatchPrepareOptionsMenu(menu);
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
        getSherlock().setProgressBarIndeterminateVisibility(z);
    }

    public void invalidateOptionsMenu() {
        getSherlock().dispatchInvalidateOptionsMenu();
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        getSherlock().addContentView(view, layoutParams);
    }

    public void requestWindowFeature(long j) {
        getSherlock().requestFeature((int) j);
    }

    protected void onStop() {
        getSherlock().dispatchStop();
        super.onStop();
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        getSherlock().dispatchRestoreInstanceState(bundle);
    }

    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
        return true;
    }

    public boolean onCreatePanelMenu(int i, com.actionbarsherlock.view.Menu menu) {
        return i == 0 ? onCreateOptionsMenu(menu) : false;
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        return getSherlock().dispatchMenuOpened(i, menu) ? true : super.onMenuOpened(i, menu);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getSherlock().dispatchSaveInstanceState(bundle);
    }

    public boolean onMenuItemSelected(int i, com.actionbarsherlock.view.MenuItem menuItem) {
        return i == 0 ? onOptionsItemSelected(menuItem) : false;
    }

    protected void onPostCreate(Bundle bundle) {
        getSherlock().dispatchPostCreate(bundle);
        super.onPostCreate(bundle);
    }

    public void onActionModeFinished(ActionMode actionMode) {
    }

    public void closeOptionsMenu() {
        if (!getSherlock().dispatchCloseOptionsMenu()) {
            super.closeOptionsMenu();
        }
    }

    public void setContentView(View view) {
        getSherlock().setContentView(view);
    }

    public MenuInflater getSupportMenuInflater() {
        return getSherlock().getMenuInflater();
    }
}
