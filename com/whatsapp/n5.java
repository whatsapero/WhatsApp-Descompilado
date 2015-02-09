package com.whatsapp;

import android.support.v4.view.ViewPager.SimpleOnPageChangeListener;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.MenuItem;

class n5 extends SimpleOnPageChangeListener {
    final HomeActivity a;

    public void onPageSelected(int i) {
        super.onPageSelected(i);
        if (HomeActivity.a(this.a) != null) {
            MenuItem findItem = HomeActivity.a(this.a).findItem(R.id.menuitem_search);
            if (findItem != null && findItem.isActionViewExpanded()) {
                findItem.collapseActionView();
            }
        }
        HomeActivity.b(this.a, i);
        HomeActivity.c(this.a);
        this.a.supportInvalidateOptionsMenu();
        if (HomeActivity.b(this.a) == 0) {
            a5n.c().b();
        }
    }

    n5(HomeActivity homeActivity) {
        this.a = homeActivity;
    }
}
