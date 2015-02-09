package com.whatsapp.protocol;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public abstract class cf {
    private static final String[] z;
    private String a;
    c8 b;
    private String c;
    cw d;
    private String e;
    private String f;
    private String g;
    j h;
    byte[] i;
    private String j;
    bp k;

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "\u001aj.\u0004_";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r6 = r2.length;
        r7 = r6;
        r8 = r1;
        r6 = r2;
    L_0x0012:
        if (r7 > r8) goto L_0x002f;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "&P\u001eH\u000b&ZHJ\u000b ]\u0003\t\u0014*J\u001c@\t(";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x002f:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0046;
            case 3: goto L_0x0049;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 79;
        goto L_0x0038;
    L_0x0043:
        r2 = 62;
        goto L_0x0038;
    L_0x0046:
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        goto L_0x0038;
    L_0x0049:
        r2 = 41;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.cf.<clinit>():void");
    }

    abstract void a(boolean z);

    public cw b() {
        return this.d;
    }

    private byte[] a() {
        if (this.i != null) {
            return this.i;
        }
        if (this.e == null && this.j == null && this.g == null && this.f == null && this.a == null && this.c == null) {
            return new byte[0];
        }
        ByteArrayOutputStream c0Var = new c0();
        a(c0Var, this.e);
        c0Var.write(0);
        a(c0Var, this.j);
        c0Var.write(0);
        a(c0Var, this.g);
        c0Var.write(0);
        a(c0Var, this.f);
        c0Var.write(0);
        a(c0Var, this.a);
        c0Var.write(0);
        a(c0Var, this.c);
        b(c0Var.toByteArray());
        return this.i;
    }

    public void a(j jVar) {
        this.h = jVar;
    }

    public void e(String str) {
        this.f = str;
    }

    protected byte[] a(byte[] bArr) {
        Object bytes = this.h.h.getBytes();
        Object c = c();
        Object a = a();
        int length = ((bArr.length + bytes.length) + c.length) + a.length;
        Object obj = new Object[(length + 4)];
        System.arraycopy(bytes, 0, obj, 4, bytes.length);
        int length2 = bytes.length + 4;
        System.arraycopy(bArr, 0, obj, length2, bArr.length);
        length2 += bArr.length;
        System.arraycopy(c, 0, obj, length2, c.length);
        length2 += c.length;
        if (a.length > 0) {
            System.arraycopy(a, 0, obj, length2, a.length);
        }
        this.h.d.a(obj, 4, length);
        System.arraycopy(this.h.d.b(), 0, obj, 0, 4);
        return obj;
    }

    public void b(String str) {
        this.c = str;
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (str != null) {
            try {
                byteArrayOutputStream.write(str.getBytes(z[0]));
            } catch (IOException e) {
            }
        }
    }

    public void b(byte[] bArr) {
        this.i = bArr;
    }

    public void d(String str) {
        this.g = str;
    }

    public c8 d() {
        return this.b;
    }

    public void f(String str) {
        this.j = str;
    }

    public void c(String str) {
        this.e = str;
    }

    public cf(bp bpVar, c8 c8Var, cw cwVar) {
        this.b = c8Var;
        this.d = cwVar;
        this.k = bpVar;
    }

    private byte[] c() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis < 1000000000) {
            return String.valueOf(currentTimeMillis + 10000000000L).substring(1).getBytes();
        }
        if (currentTimeMillis < 10000000000L) {
            return Long.toString(currentTimeMillis).getBytes();
        }
        throw new IOException(z[1]);
    }

    public void a(String str) {
        this.a = str;
    }
}
