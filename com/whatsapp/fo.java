package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class fo implements OnItemClickListener {
    final ContactInfo a;

    fo(ContactInfo contactInfo) {
        this.a = contactInfo;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = i - 1;
        if (i2 >= 0 && i2 < ContactInfo.c(this.a).getCount()) {
            this.a.startActivity(Conversation.a(ContactInfo.c(this.a).a(i2)));
        }
    }
}
