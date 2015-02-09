package com.whatsapp;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public class mh extends FilterOutputStream {
    final int a;

    public void write(int i) {
        d7.a(1, this.a);
        this.out.write(i);
    }

    public mh(OutputStream outputStream, int i) {
        super(outputStream);
        this.a = i;
    }

    public void write(byte[] bArr) {
        d7.a((long) bArr.length, this.a);
        this.out.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) {
        d7.a((long) i2, this.a);
        this.out.write(bArr, i, i2);
    }
}
