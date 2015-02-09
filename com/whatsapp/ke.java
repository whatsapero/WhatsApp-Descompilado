package com.whatsapp;

import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnActionExpandListener;

class ke implements OnActionExpandListener {
    final Conversations a;

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        Conversations.b(this.a).a("");
        return true;
    }

    ke(Conversations conversations) {
        this.a = conversations;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }
}
