package com.whatsapp.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class al extends OutputStream {
    private static final String z;
    final File a;
    boolean b;
    final FileOutputStream c;
    final File d;

    static {
        char[] toCharArray = "#\u00185+\u0014\u0017\u00147/W\u0000%6n\\\u0004\u00185+^".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 101;
                    break;
                case ay.f /*1*/:
                    i2 = 113;
                    break;
                case ay.n /*2*/:
                    i2 = 89;
                    break;
                case ay.p /*3*/:
                    i2 = 78;
                    break;
                default:
                    i2 = 58;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public al(c cVar, File file, boolean z) {
        FileInputStream fileInputStream;
        IOException iOException;
        Throwable th;
        this.b = false;
        this.a = cVar.e();
        this.d = file;
        this.c = new FileOutputStream(this.a);
        if (z && this.d.exists()) {
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(this.d);
                try {
                    at.a(fileInputStream.getChannel(), this.c.getChannel());
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                } catch (FileNotFoundException e) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (FileNotFoundException e2) {
                            throw e2;
                        }
                    }
                } catch (IOException e3) {
                    IOException iOException2 = e3;
                    fileInputStream2 = fileInputStream;
                    iOException = iOException2;
                    try {
                        this.c.close();
                        throw iOException;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (FileNotFoundException e22) {
                                throw e22;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    fileInputStream2 = fileInputStream;
                    th = th4;
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    throw th;
                }
            } catch (FileNotFoundException e4) {
                fileInputStream = null;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e5) {
                iOException = e5;
                this.c.close();
                throw iOException;
            }
        }
    }

    public void write(byte[] bArr) {
        this.c.write(bArr);
    }

    public al(c cVar, File file) {
        this(cVar, file, false);
    }

    public synchronized void close() {
        if (!this.b) {
            this.b = true;
            this.c.close();
            this.d.delete();
            if (!this.a.renameTo(this.d)) {
                throw new IOException(z);
            }
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        this.c.write(bArr, i, i2);
    }

    public void flush() {
        this.c.flush();
    }

    public void write(int i) {
        this.c.write(i);
    }
}
