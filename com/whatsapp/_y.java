package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class _y implements OnItemClickListener {
    final BlockList a;

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.openContextMenu(view);
    }

    _y(BlockList blockList) {
        this.a = blockList;
    }
}
