package com.whatsapp;

import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnActionExpandListener;

class yi implements OnActionExpandListener {
    final ContactPicker a;

    yi(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        ContactPicker.a(this.a, "");
        ContactPicker.r(this.a);
        ContactPicker.a(this.a);
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }
}
