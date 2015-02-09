package com.actionbarsherlock.internal;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import android.view.ActionMode.Callback;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.ActionBarSherlock.Implementation;
import com.actionbarsherlock.ActionBarSherlock.OnActionModeFinishedListener;
import com.actionbarsherlock.ActionBarSherlock.OnActionModeStartedListener;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.internal.app.ActionBarWrapper;
import com.actionbarsherlock.internal.view.menu.MenuWrapper;
import com.actionbarsherlock.view.ActionMode;

@Implementation(api = 14)
public class ActionBarSherlockNative extends ActionBarSherlock {
    private ActionBarWrapper mActionBar;
    private ActionModeWrapper mActionMode;
    private MenuWrapper mMenu;

    class ActionModeCallbackWrapper implements Callback {
        private final ActionMode.Callback mCallback;
        final ActionBarSherlockNative this$0;

        public boolean onActionItemClicked(android.view.ActionMode actionMode, MenuItem menuItem) {
            return this.mCallback.onActionItemClicked(ActionBarSherlockNative.access$000(this.this$0), ActionBarSherlockNative.access$000(this.this$0).getMenu().findItem(menuItem));
        }

        public boolean onPrepareActionMode(android.view.ActionMode actionMode, Menu menu) {
            return this.mCallback.onPrepareActionMode(ActionBarSherlockNative.access$000(this.this$0), ActionBarSherlockNative.access$000(this.this$0).getMenu());
        }

        public boolean onCreateActionMode(android.view.ActionMode actionMode, Menu menu) {
            ActionBarSherlockNative.access$002(this.this$0, new ActionModeWrapper(this.this$0, actionMode));
            return this.mCallback.onCreateActionMode(ActionBarSherlockNative.access$000(this.this$0), ActionBarSherlockNative.access$000(this.this$0).getMenu());
        }

        public void onDestroyActionMode(android.view.ActionMode actionMode) {
            this.mCallback.onDestroyActionMode(ActionBarSherlockNative.access$000(this.this$0));
            if (ActionBarSherlockNative.access$100(this.this$0) instanceof OnActionModeFinishedListener) {
                ((OnActionModeFinishedListener) ActionBarSherlockNative.access$200(this.this$0)).onActionModeFinished(ActionBarSherlockNative.access$000(this.this$0));
            }
        }

        public ActionModeCallbackWrapper(ActionBarSherlockNative actionBarSherlockNative, ActionMode.Callback callback) {
            this.this$0 = actionBarSherlockNative;
            this.mCallback = callback;
        }
    }

    class ActionModeWrapper extends ActionMode {
        private final android.view.ActionMode mActionMode;
        private MenuWrapper mMenu;
        final ActionBarSherlockNative this$0;

        public void setCustomView(View view) {
            this.mActionMode.setCustomView(view);
        }

        public com.actionbarsherlock.view.Menu getMenu() {
            return getMenu();
        }

        public MenuWrapper getMenu() {
            if (this.mMenu == null) {
                this.mMenu = new MenuWrapper(this.mActionMode.getMenu());
            }
            return this.mMenu;
        }

        public void invalidate() {
            this.mActionMode.invalidate();
        }

        public void setTitle(CharSequence charSequence) {
            this.mActionMode.setTitle(charSequence);
        }

        public void finish() {
            this.mActionMode.finish();
        }

        ActionModeWrapper(ActionBarSherlockNative actionBarSherlockNative, android.view.ActionMode actionMode) {
            this.this$0 = actionBarSherlockNative;
            this.mMenu = null;
            this.mActionMode = actionMode;
        }
    }

    public boolean dispatchCreateOptionsMenu(Menu menu) {
        if (this.mMenu == null || menu != this.mMenu.unwrap()) {
            this.mMenu = new MenuWrapper(menu);
        }
        return callbackCreateOptionsMenu(this.mMenu);
    }

    protected Context getThemedContext() {
        Context context = this.mActivity;
        TypedValue typedValue = new TypedValue();
        this.mActivity.getTheme().resolveAttribute(16843671, typedValue, true);
        return typedValue.resourceId != 0 ? new ContextThemeWrapper(context, typedValue.resourceId) : context;
    }

    static Activity access$200(ActionBarSherlockNative actionBarSherlockNative) {
        return actionBarSherlockNative.mActivity;
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        this.mActivity.getWindow().setContentView(view, layoutParams);
        initActionBar();
    }

    static Activity access$100(ActionBarSherlockNative actionBarSherlockNative) {
        return actionBarSherlockNative.mActivity;
    }

    public boolean dispatchPrepareOptionsMenu(Menu menu) {
        return callbackPrepareOptionsMenu(this.mMenu);
    }

    public boolean requestFeature(int i) {
        return this.mActivity.getWindow().requestFeature(i);
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        Callback actionModeCallbackWrapper;
        if (this.mActionMode != null) {
            this.mActionMode.finish();
        }
        if (callback != null) {
            actionModeCallbackWrapper = new ActionModeCallbackWrapper(this, callback);
        } else {
            actionModeCallbackWrapper = null;
        }
        if (this.mActivity.startActionMode(actionModeCallbackWrapper) == null) {
            this.mActionMode = null;
        }
        if ((this.mActivity instanceof OnActionModeStartedListener) && this.mActionMode != null) {
            ((OnActionModeStartedListener) this.mActivity).onActionModeStarted(this.mActionMode);
        }
        return this.mActionMode;
    }

    private void initActionBar() {
        if (this.mActionBar == null && this.mActivity.getActionBar() != null) {
            this.mActionBar = new ActionBarWrapper(this.mActivity);
        }
    }

    static ActionModeWrapper access$002(ActionBarSherlockNative actionBarSherlockNative, ActionModeWrapper actionModeWrapper) {
        actionBarSherlockNative.mActionMode = actionModeWrapper;
        return actionModeWrapper;
    }

    public ActionBarSherlockNative(Activity activity, int i) {
        super(activity, i);
    }

    public ActionBar getActionBar() {
        initActionBar();
        return this.mActionBar;
    }

    public void setContentView(int i) {
        this.mActivity.getWindow().setContentView(i);
        initActionBar();
    }

    public void setProgressBarIndeterminateVisibility(boolean z) {
        this.mActivity.setProgressBarIndeterminateVisibility(z);
    }

    static ActionModeWrapper access$000(ActionBarSherlockNative actionBarSherlockNative) {
        return actionBarSherlockNative.mActionMode;
    }

    public void dispatchInvalidateOptionsMenu() {
        this.mActivity.getWindow().invalidatePanelMenu(0);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        this.mActivity.getWindow().addContentView(view, layoutParams);
        initActionBar();
    }

    public boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        return callbackOptionsItemSelected(this.mMenu.findItem(menuItem));
    }
}
