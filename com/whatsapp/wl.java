package com.whatsapp;

import android.support.v4.app.FragmentTransaction;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;

class wl implements TabListener {
    private int a;
    final ContactPicker b;

    public void onTabReselected(Tab tab, FragmentTransaction fragmentTransaction) {
    }

    public void onTabSelected(Tab tab, FragmentTransaction fragmentTransaction) {
        if (ContactPicker.t(this.b) != null) {
            ContactPicker.t(this.b).setCurrentItem(this.a);
        }
    }

    public void onTabUnselected(Tab tab, FragmentTransaction fragmentTransaction) {
    }

    public wl(ContactPicker contactPicker, int i) {
        this.b = contactPicker;
        this.a = i;
    }
}
