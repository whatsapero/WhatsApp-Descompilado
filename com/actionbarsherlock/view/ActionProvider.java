package com.actionbarsherlock.view;

import android.view.View;

public abstract class ActionProvider {
    private SubUiVisibilityListener mSubUiVisibilityListener;

    public interface SubUiVisibilityListener {
        void onSubUiVisibilityChanged(boolean z);
    }

    public abstract View onCreateActionView();

    public void onPrepareSubMenu(SubMenu subMenu) {
    }

    public void setSubUiVisibilityListener(SubUiVisibilityListener subUiVisibilityListener) {
        this.mSubUiVisibilityListener = subUiVisibilityListener;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public void subUiVisibilityChanged(boolean z) {
        if (this.mSubUiVisibilityListener != null) {
            this.mSubUiVisibilityListener.onSubUiVisibilityChanged(z);
        }
    }
}
