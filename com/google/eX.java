package com.google;

import java.io.InputStream;

class ex extends InputStream {
    private f9 a;
    final gn b;
    private int c;
    private int d;
    private int e;
    private gX f;
    private int g;

    public long skip(long j) {
        if (j < 0) {
            try {
                throw new IndexOutOfBoundsException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return (long) a(null, 0, (int) j);
    }

    public int read() {
        try {
            b();
            if (this.f == null) {
                return -1;
            }
            gX gXVar = this.f;
            int i = this.d;
            this.d = i + 1;
            return gXVar.b(i) & 255;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public int available() {
        return this.b.e() - (this.g + this.d);
    }

    public ex(gn gnVar) {
        this.b = gnVar;
        a();
    }

    private void a() {
        this.a = new f9(this.b, null);
        this.f = this.a.b();
        this.c = this.f.e();
        this.d = 0;
        this.g = 0;
    }

    private int a(byte[] bArr, int i, int i2) {
        boolean z = dy.b;
        int i3 = i2;
        int i4 = i;
        while (i3 > 0) {
            try {
                b();
                if (this.f != null) {
                    int min = Math.min(this.c - this.d, i3);
                    if (bArr != null) {
                        this.f.a(bArr, this.d, i4, min);
                        i4 += min;
                    }
                    this.d += min;
                    i3 -= min;
                    if (z) {
                        break;
                    }
                } else if (i3 == i2) {
                    return -1;
                }
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        return i2 - i3;
    }

    public synchronized void reset() {
        a();
        a(null, 0, this.e);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r2_this = this;
        r0 = r2.f;	 Catch:{ NullPointerException -> 0x0037 }
        if (r0 == 0) goto L_0x0036;
    L_0x0004:
        r0 = r2.d;	 Catch:{ NullPointerException -> 0x0039 }
        r1 = r2.c;	 Catch:{ NullPointerException -> 0x0039 }
        if (r0 != r1) goto L_0x0036;
    L_0x000a:
        r0 = r2.g;	 Catch:{ NullPointerException -> 0x003b }
        r1 = r2.c;	 Catch:{ NullPointerException -> 0x003b }
        r0 = r0 + r1;
        r2.g = r0;	 Catch:{ NullPointerException -> 0x003b }
        r0 = 0;
        r2.d = r0;	 Catch:{ NullPointerException -> 0x003b }
        r0 = r2.a;	 Catch:{ NullPointerException -> 0x003b }
        r0 = r0.hasNext();	 Catch:{ NullPointerException -> 0x003b }
        if (r0 == 0) goto L_0x0030;
    L_0x001c:
        r0 = r2.a;	 Catch:{ NullPointerException -> 0x003d }
        r0 = r0.b();	 Catch:{ NullPointerException -> 0x003d }
        r2.f = r0;	 Catch:{ NullPointerException -> 0x003d }
        r0 = r2.f;	 Catch:{ NullPointerException -> 0x003d }
        r0 = r0.e();	 Catch:{ NullPointerException -> 0x003d }
        r2.c = r0;	 Catch:{ NullPointerException -> 0x003d }
        r0 = com.google.dy.b;	 Catch:{ NullPointerException -> 0x003d }
        if (r0 == 0) goto L_0x0036;
    L_0x0030:
        r0 = 0;
        r2.f = r0;	 Catch:{ NullPointerException -> 0x003d }
        r0 = 0;
        r2.c = r0;	 Catch:{ NullPointerException -> 0x003d }
    L_0x0036:
        return;
    L_0x0037:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0039 }
    L_0x0039:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003b }
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ex.b():void");
    }

    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        try {
            if (i >= 0 && i2 >= 0) {
                if (i2 <= bArr.length - i) {
                    return a(bArr, i, i2);
                }
            }
            throw new IndexOutOfBoundsException();
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public boolean markSupported() {
        return true;
    }

    public void mark(int i) {
        this.e = this.g + this.d;
    }
}
