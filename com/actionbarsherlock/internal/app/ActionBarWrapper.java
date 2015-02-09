package com.actionbarsherlock.internal.app;

import android.app.ActionBar.OnMenuVisibilityListener;
import android.app.ActionBar.OnNavigationListener;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.LayoutParams;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockActivity;
import java.util.HashSet;
import java.util.Set;

public class ActionBarWrapper extends ActionBar implements OnNavigationListener, OnMenuVisibilityListener {
    private final android.app.ActionBar mActionBar;
    private final Activity mActivity;
    private FragmentTransaction mFragmentTransaction;
    private Set mMenuVisibilityListeners;
    private ActionBar.OnNavigationListener mNavigationListener;

    public class TabWrapper extends Tab implements TabListener {
        private ActionBar.TabListener mListener;
        final android.app.ActionBar.Tab mNativeTab;
        final ActionBarWrapper this$0;

        public TabWrapper(ActionBarWrapper actionBarWrapper, android.app.ActionBar.Tab tab) {
            this.this$0 = actionBarWrapper;
            this.mNativeTab = tab;
            this.mNativeTab.setTag(this);
        }

        public void select() {
            this.mNativeTab.select();
        }

        public CharSequence getText() {
            return this.mNativeTab.getText();
        }

        public void onTabUnselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction) {
            if (this.mListener != null) {
                FragmentTransaction fragmentTransaction2 = null;
                if (ActionBarWrapper.access$000(this.this$0) instanceof FragmentActivity) {
                    fragmentTransaction2 = ((FragmentActivity) ActionBarWrapper.access$000(this.this$0)).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
                    ActionBarWrapper.access$102(this.this$0, fragmentTransaction2);
                }
                this.mListener.onTabUnselected(this, fragmentTransaction2);
            }
        }

        public void onTabReselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction) {
            if (this.mListener != null) {
                FragmentTransaction fragmentTransaction2 = null;
                if (ActionBarWrapper.access$000(this.this$0) instanceof FragmentActivity) {
                    fragmentTransaction2 = ((FragmentActivity) ActionBarWrapper.access$000(this.this$0)).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
                }
                this.mListener.onTabReselected(this, fragmentTransaction2);
                if (fragmentTransaction2 != null && !fragmentTransaction2.isEmpty()) {
                    fragmentTransaction2.commit();
                }
            }
        }

        public int getPosition() {
            return this.mNativeTab.getPosition();
        }

        public View getCustomView() {
            return this.mNativeTab.getCustomView();
        }

        public CharSequence getContentDescription() {
            return this.mNativeTab.getContentDescription();
        }

        public void onTabSelected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction) {
            if (this.mListener != null) {
                if (ActionBarWrapper.access$100(this.this$0) == null && (ActionBarWrapper.access$000(this.this$0) instanceof FragmentActivity)) {
                    ActionBarWrapper.access$102(this.this$0, ((FragmentActivity) ActionBarWrapper.access$000(this.this$0)).getSupportFragmentManager().beginTransaction().disallowAddToBackStack());
                }
                this.mListener.onTabSelected(this, ActionBarWrapper.access$100(this.this$0));
                if (ActionBarWrapper.access$100(this.this$0) != null) {
                    if (!ActionBarWrapper.access$100(this.this$0).isEmpty()) {
                        ActionBarWrapper.access$100(this.this$0).commit();
                    }
                    ActionBarWrapper.access$102(this.this$0, null);
                }
            }
        }

        public Tab setIcon(int i) {
            this.mNativeTab.setIcon(i);
            return this;
        }

        public Drawable getIcon() {
            return this.mNativeTab.getIcon();
        }

        public Tab setTabListener(ActionBar.TabListener tabListener) {
            TabListener tabListener2;
            android.app.ActionBar.Tab tab = this.mNativeTab;
            if (tabListener != null) {
                tabListener2 = this;
            } else {
                tabListener2 = null;
            }
            tab.setTabListener(tabListener2);
            this.mListener = tabListener;
            return this;
        }
    }

    public Context getThemedContext() {
        return this.mActionBar.getThemedContext();
    }

    public void setDisplayOptions(int i) {
        this.mActionBar.setDisplayOptions(i);
    }

    public void setIcon(int i) {
        this.mActionBar.setIcon(i);
    }

    public void setTitle(int i) {
        this.mActionBar.setTitle(i);
    }

    public void setSubtitle(int i) {
        this.mActionBar.setSubtitle(i);
    }

    public void setIcon(Drawable drawable) {
        this.mActionBar.setIcon(drawable);
    }

    public void setDisplayHomeAsUpEnabled(boolean z) {
        this.mActionBar.setDisplayHomeAsUpEnabled(z);
    }

    static FragmentTransaction access$102(ActionBarWrapper actionBarWrapper, FragmentTransaction fragmentTransaction) {
        actionBarWrapper.mFragmentTransaction = fragmentTransaction;
        return fragmentTransaction;
    }

    public void setTitle(CharSequence charSequence) {
        this.mActionBar.setTitle(charSequence);
    }

    public Tab newTab() {
        return new TabWrapper(this, this.mActionBar.newTab());
    }

    public boolean onNavigationItemSelected(int i, long j) {
        return this.mNavigationListener.onNavigationItemSelected(i, j);
    }

    public void onMenuVisibilityChanged(boolean z) {
        int i = ActionBarImpl.a;
        for (ActionBar.OnMenuVisibilityListener onMenuVisibilityListener : this.mMenuVisibilityListeners) {
            onMenuVisibilityListener.onMenuVisibilityChanged(z);
            if (i != 0) {
                return;
            }
        }
    }

    public void setCustomView(View view, LayoutParams layoutParams) {
        int i = ActionBarImpl.a;
        android.app.ActionBar.LayoutParams layoutParams2 = new android.app.ActionBar.LayoutParams(layoutParams);
        layoutParams2.gravity = layoutParams.gravity;
        layoutParams2.bottomMargin = layoutParams.bottomMargin;
        layoutParams2.topMargin = layoutParams.topMargin;
        layoutParams2.leftMargin = layoutParams.leftMargin;
        layoutParams2.rightMargin = layoutParams.rightMargin;
        this.mActionBar.setCustomView(view, layoutParams2);
        if (SherlockActivity.a) {
            ActionBarImpl.a = i + 1;
        }
    }

    public void setSelectedNavigationItem(int i) {
        this.mActionBar.setSelectedNavigationItem(i);
    }

    public void setDisplayShowCustomEnabled(boolean z) {
        this.mActionBar.setDisplayShowCustomEnabled(z);
    }

    public void addTab(Tab tab) {
        this.mActionBar.addTab(((TabWrapper) tab).mNativeTab);
    }

    static Activity access$000(ActionBarWrapper actionBarWrapper) {
        return actionBarWrapper.mActivity;
    }

    static FragmentTransaction access$100(ActionBarWrapper actionBarWrapper) {
        return actionBarWrapper.mFragmentTransaction;
    }

    public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this.mMenuVisibilityListeners.add(onMenuVisibilityListener);
    }

    public void setDisplayShowHomeEnabled(boolean z) {
        this.mActionBar.setDisplayShowHomeEnabled(z);
    }

    public ActionBarWrapper(Activity activity) {
        this.mMenuVisibilityListeners = new HashSet(1);
        this.mActivity = activity;
        this.mActionBar = activity.getActionBar();
        if (this.mActionBar != null) {
            this.mActionBar.addOnMenuVisibilityListener(this);
        }
    }

    public void show() {
        this.mActionBar.show();
    }

    public void setDisplayShowTitleEnabled(boolean z) {
        this.mActionBar.setDisplayShowTitleEnabled(z);
    }

    public void hide() {
        this.mActionBar.hide();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.mActionBar.setBackgroundDrawable(drawable);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mActionBar.setSubtitle(charSequence);
    }

    public void setCustomView(View view) {
        this.mActionBar.setCustomView(view);
    }

    public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onMenuVisibilityListener) {
        this.mMenuVisibilityListeners.remove(onMenuVisibilityListener);
    }

    public void setNavigationMode(int i) {
        this.mActionBar.setNavigationMode(i);
    }
}
