package com.whatsapp;

import com.actionbarsherlock.widget.SearchView.OnCloseListener;

class e3 implements OnCloseListener {
    final WebImagePicker a;

    e3(WebImagePicker webImagePicker) {
        this.a = webImagePicker;
    }

    public boolean onClose() {
        return true;
    }
}
