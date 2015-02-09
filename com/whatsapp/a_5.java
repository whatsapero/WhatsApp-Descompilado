package com.whatsapp;

import com.whatsapp.protocol.cz;
import org.whispersystems.libaxolotl.aE;

final class a_5 implements Runnable {
    private final int a;
    private final cz[] b;
    private final byte[] c;
    final oz d;
    private final cz e;

    public void run() {
        App.a(this.c, aE.a(this.a), (byte) 5, this.b, this.e);
    }

    a_5(oz ozVar, byte[] bArr, int i, cz[] czVarArr, cz czVar) {
        this.d = ozVar;
        this.c = bArr;
        this.a = i;
        this.b = czVarArr;
        this.e = czVar;
    }
}
