package com.whatsapp.protocol;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class bo extends OutputStream {
    OutputStream a;
    c0 b;
    bx c;

    public int a(InputStream inputStream, int i) {
        if (this.a == null) {
            return this.b.a(inputStream, i);
        }
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr, 0, i);
        if (read <= 0) {
            return read;
        }
        this.a.write(bArr, 0, read);
        return read;
    }

    public boolean b() {
        return this.a != null;
    }

    public bo(bx bxVar) {
        this.b = new cu(this);
        this.c = bxVar;
    }

    public void d() {
        try {
            c();
        } catch (IOException e) {
        }
        this.a = null;
        this.b.reset();
    }

    public byte[] a() {
        return this.b.a();
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.a != null) {
            this.a.write(bArr, i, i2);
            if (!n) {
                return;
            }
        }
        this.b.write(bArr, i, i2);
    }

    public void write(int i) {
        if (this.a != null) {
            this.a.write(i);
            if (!n) {
                return;
            }
        }
        this.b.write(i);
    }

    public void e() {
        if (this.a == null) {
            this.a = this.c.a(this.b);
        }
    }

    public int f() {
        return this.b.b();
    }

    public void flush() {
        if (this.a != null) {
            this.a.flush();
            if (!n) {
                return;
            }
        }
        this.b.flush();
    }

    public void write(byte[] bArr) {
        if (this.a != null) {
            this.a.write(bArr);
            if (!n) {
                return;
            }
        }
        this.b.write(bArr);
    }

    public void c() {
        if (this.a != null) {
            this.a.close();
            this.a = null;
        }
    }

    public void close() {
        if (this.a != null) {
            this.a.close();
            if (!n) {
                return;
            }
        }
        this.b.close();
    }

    public void a(bx bxVar) {
        this.c = bxVar;
    }
}
