package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;

class a_r implements OnClickListener {
    final BroadcastDetails a;
    final ArrayList b;

    a_r(BroadcastDetails broadcastDetails, ArrayList arrayList) {
        this.a = broadcastDetails;
        this.b = arrayList;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i < this.b.size()) {
            BroadcastDetails.a(this.a, BroadcastDetails.c(this.a), ((Integer) this.b.get(i)).intValue());
        }
        this.a.removeDialog(3);
    }
}
