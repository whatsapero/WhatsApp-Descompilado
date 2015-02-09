package com.whatsapp.protocol;

import java.io.EOFException;
import java.io.InputStream;

public class cv extends InputStream {
    InputStream a;

    public int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public void close() {
        this.a.close();
    }

    public int available() {
        return this.a.available();
    }

    public long skip(long j) {
        return this.a.skip(j);
    }

    public int read(byte[] bArr) {
        int read = this.a.read(bArr);
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public int read() {
        int read = this.a.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public synchronized void mark(int i) {
        this.a.mark(i);
    }

    public cv(InputStream inputStream) {
        this.a = inputStream;
    }

    public boolean markSupported() {
        return this.a.markSupported();
    }

    public synchronized void reset() {
        this.a.reset();
    }
}
