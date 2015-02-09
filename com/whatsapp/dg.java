package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class dg implements OnClickListener {
    final SetStatus a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(3);
        SetStatus.q.clear();
        SetStatus.d(this.a);
        this.a.s.notifyDataSetChanged();
    }

    dg(SetStatus setStatus) {
        this.a = setStatus;
    }
}
