package com.whatsapp;

import android.view.View;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnActionExpandListener;

class ha implements OnActionExpandListener {
    final HomeActivity a;
    final View b;

    ha(HomeActivity homeActivity, View view) {
        this.a = homeActivity;
        this.b = view;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        HomeActivity.a(this.a).setGroupVisible(1, false);
        HomeActivity.a(this.a).setGroupVisible(2, false);
        HomeActivity.a(this.a).setGroupVisible(3, false);
        HomeActivity.a(this.a).setGroupVisible(4, false);
        return true;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        a_7.a(this.b, "", true);
        this.a.supportInvalidateOptionsMenu();
        return true;
    }
}
