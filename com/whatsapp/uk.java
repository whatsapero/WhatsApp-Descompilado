package com.whatsapp;

import android.content.Context;
import com.whatsapp.protocol.b;

final class uk extends us {
    final PlaceInfo n;

    uk(Context context, b bVar, PlaceInfo placeInfo) {
        this.n = placeInfo;
        super(context, bVar);
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    public Boolean a(Void[] voidArr) {
        if (!this.n.hasDetails && this.n.address == null) {
            this.n.downloadDetails();
            this.b.t = this.n.url;
            if (this.n.address != null) {
                StringBuilder stringBuilder = new StringBuilder();
                b bVar = this.b;
                bVar.H = stringBuilder.append(bVar.H).append("\n").append(this.n.address).toString();
            }
        }
        return super.a(voidArr);
    }
}
