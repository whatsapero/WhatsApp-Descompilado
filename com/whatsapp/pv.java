package com.whatsapp;

import com.whatsapp.protocol.cz;
import org.whispersystems.libaxolotl.aE;

final class pv implements Runnable {
    private final byte[] a;
    private final cz[] b;
    private final int c;
    final asv d;
    private final cz e;

    pv(asv com_whatsapp_asv, int i, byte[] bArr, cz[] czVarArr, cz czVar) {
        this.d = com_whatsapp_asv;
        this.c = i;
        this.a = bArr;
        this.b = czVarArr;
        this.e = czVar;
    }

    public void run() {
        App.a(this.a, aE.a(this.c), (byte) 5, this.b, this.e);
        if (this.d.b != null) {
            App.a(this.d.b);
        }
    }
}
