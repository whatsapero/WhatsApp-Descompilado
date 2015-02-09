package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class pa implements OnScrollListener {
    final ContactInfo a;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ContactInfo.a(this.a);
    }

    pa(ContactInfo contactInfo) {
        this.a = contactInfo;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
