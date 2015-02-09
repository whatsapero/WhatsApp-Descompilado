package com.whatsapp.util;

import com.whatsapp.App;
import com.whatsapp.MediaData;

final class aw implements Runnable {
    final String a;
    final byte[] b;
    final String c;
    final MediaData d;

    aw(String str, byte[] bArr, MediaData mediaData, String str2) {
        this.c = str;
        this.b = bArr;
        this.d = mediaData;
        this.a = str2;
    }

    public void run() {
        App.a(this.c, this.b, this.d, (byte) 1, 0, this.a, null);
    }
}
