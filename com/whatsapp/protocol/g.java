package com.whatsapp.protocol;

import java.io.Writer;

public final class g implements cw {
    private final cw a;
    private final cw b;
    private final Writer c;
    private final String d;

    public void a(bx bxVar) {
        this.b.a(bxVar);
    }

    public g(cw cwVar, Writer writer, String str) {
        this.b = cwVar;
        this.c = writer;
        this.a = new cr(this.c);
        this.d = str;
    }

    public void a(bi biVar) {
        this.b.a(biVar);
        try {
            this.c.write(this.d);
            this.a.a(biVar);
        } catch (Throwable th) {
        }
    }

    public void a() {
        this.b.a();
        this.c.write(this.d);
        this.a.a();
    }

    public void a(String str, String str2) {
        this.b.a(str, str2);
        this.c.write(this.d);
        this.a.a(str, str2);
    }

    public void a(bi biVar, boolean z) {
        this.b.a(biVar, z);
        try {
            this.c.write(this.d);
            this.a.a(biVar);
        } catch (Throwable th) {
        }
    }

    public void a(bi biVar, int i) {
        this.b.a(biVar, i);
        try {
            this.c.write(this.d);
            this.a.a(biVar);
        } catch (Throwable th) {
        }
    }
}
