package com.whatsapp;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.ContentProducer;

class em implements ContentProducer {
    final va a;
    final String b;
    final String c;

    public void writeTo(OutputStream outputStream) {
        int i = App.az;
        byte[] bArr = new byte[this.a.e];
        va.a(outputStream, this.c);
        InputStream b = this.a.d.b();
        b.skip((long) this.a.b);
        int i2 = this.a.b + 0;
        int read;
        do {
            read = b.read(bArr, 0, this.a.e);
            if (read >= 0) {
                i2 += read;
                outputStream.write(bArr, 0, read);
                outputStream.flush();
                if (this.a.a != null) {
                    this.a.a.a(i2);
                }
            }
            if (Thread.currentThread().isInterrupted()) {
                Thread.currentThread().interrupt();
                b.close();
                outputStream.close();
                if (i == 0) {
                    break;
                }
            }
        } while (read >= 0);
        if (!Thread.currentThread().isInterrupted()) {
            b.close();
            va.a(outputStream, this.b);
        }
    }

    em(va vaVar, String str, String str2) {
        this.a = vaVar;
        this.c = str;
        this.b = str2;
    }
}
