package com.whatsapp;

import com.whatsapp.protocol.b;
import com.whatsapp.util.au;

class g5 extends fc {
    final BroadcastDetails a;

    g5(BroadcastDetails broadcastDetails) {
        this.a = broadcastDetails;
    }

    public void b(b bVar, int i) {
        if (bVar != null && bVar.e.a.equals(BroadcastDetails.e(this.a).e.a) && au.a(BroadcastDetails.d(this.a), bVar.e.c) && bVar.e.b) {
            BroadcastDetails.a(this.a).notifyDataSetChanged();
        }
    }
}
