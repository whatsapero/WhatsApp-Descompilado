package com.whatsapp;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class mn extends m8 {
    final byte[] R;
    final ViewSharedContactActivity S;

    mn(ViewSharedContactActivity viewSharedContactActivity, g9 g9Var, String str, int i, String str2, byte[] bArr) {
        this.S = viewSharedContactActivity;
        this.R = bArr;
        super(g9Var, str, i, str2);
    }

    public InputStream c(boolean z) {
        return new ByteArrayInputStream(this.R);
    }
}
