package com.whatsapp.util;

import java.io.File;
import java.io.FileInputStream;

public abstract class b6 extends FileInputStream {
    private long a;

    public abstract boolean a();

    public int read(byte[] bArr, int i, int i2) {
        int i3 = Log.e;
        while (true) {
            try {
                if (getChannel().size() >= this.a + ((long) i2) || !a()) {
                    int read = super.read(bArr, i, i2);
                    if (i3 == 0) {
                        break;
                    }
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    return 0;
                }
            } catch (InterruptedException e2) {
                throw e2;
            }
        }
        if (read < 0) {
            return read;
        }
        try {
            this.a += (long) read;
            return read;
        } catch (InterruptedException e22) {
            throw e22;
        }
    }

    public b6(File file) {
        super(file);
    }
}
