package com.actionbarsherlock.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentTransaction;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewDebug.IntToString;
import android.view.ViewGroup.MarginLayoutParams;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;

public abstract class ActionBar {

    public class LayoutParams extends MarginLayoutParams {
        private static final int[] ATTRS;
        @ExportedProperty(mapping = {@IntToString(from = -1, to = "NONE"), @IntToString(from = 0, to = "NONE"), @IntToString(from = 48, to = "TOP"), @IntToString(from = 80, to = "BOTTOM"), @IntToString(from = 3, to = "LEFT"), @IntToString(from = 5, to = "RIGHT"), @IntToString(from = 16, to = "CENTER_VERTICAL"), @IntToString(from = 112, to = "FILL_VERTICAL"), @IntToString(from = 1, to = "CENTER_HORIZONTAL"), @IntToString(from = 7, to = "FILL_HORIZONTAL"), @IntToString(from = 17, to = "CENTER"), @IntToString(from = 119, to = "FILL")})
        public int gravity;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            boolean z = false;
            int i = SherlockListActivity.a;
            super(context, attributeSet);
            this.gravity = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
            this.gravity = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
            if (i != 0) {
                if (!SherlockActivity.a) {
                    z = true;
                }
                SherlockActivity.a = z;
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = -1;
            this.gravity = 19;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.gravity = -1;
            this.gravity = i3;
        }

        public LayoutParams(int i) {
            this(-2, -1, i);
        }

        static {
            ATTRS = new int[]{16842931};
        }
    }

    public interface OnMenuVisibilityListener {
        void onMenuVisibilityChanged(boolean z);
    }

    public interface OnNavigationListener {
        boolean onNavigationItemSelected(int i, long j);
    }

    public abstract class Tab {
        public abstract CharSequence getContentDescription();

        public abstract View getCustomView();

        public abstract Drawable getIcon();

        public abstract int getPosition();

        public abstract CharSequence getText();

        public abstract void select();

        public abstract com.actionbarsherlock.app.ActionBar.Tab setIcon(int i);

        public abstract com.actionbarsherlock.app.ActionBar.Tab setTabListener(TabListener tabListener);
    }

    public interface TabListener {
        void onTabReselected(Tab tab, FragmentTransaction fragmentTransaction);

        void onTabSelected(Tab tab, FragmentTransaction fragmentTransaction);

        void onTabUnselected(Tab tab, FragmentTransaction fragmentTransaction);
    }

    public abstract void addOnMenuVisibilityListener(OnMenuVisibilityListener onMenuVisibilityListener);

    public abstract void addTab(Tab tab);

    public Context getThemedContext() {
        return null;
    }

    public abstract void hide();

    public abstract Tab newTab();

    public abstract void removeOnMenuVisibilityListener(OnMenuVisibilityListener onMenuVisibilityListener);

    public abstract void setBackgroundDrawable(Drawable drawable);

    public abstract void setCustomView(View view);

    public abstract void setCustomView(View view, LayoutParams layoutParams);

    public abstract void setDisplayHomeAsUpEnabled(boolean z);

    public abstract void setDisplayOptions(int i);

    public abstract void setDisplayShowCustomEnabled(boolean z);

    public abstract void setDisplayShowHomeEnabled(boolean z);

    public abstract void setDisplayShowTitleEnabled(boolean z);

    public abstract void setIcon(int i);

    public abstract void setIcon(Drawable drawable);

    public abstract void setNavigationMode(int i);

    public abstract void setSelectedNavigationItem(int i);

    public abstract void setSubtitle(int i);

    public abstract void setSubtitle(CharSequence charSequence);

    public abstract void setTitle(int i);

    public abstract void setTitle(CharSequence charSequence);

    public abstract void show();
}
