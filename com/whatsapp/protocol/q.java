package com.whatsapp.protocol;

import java.io.Writer;

public final class q implements c8 {
    private final cw a;
    private final c8 b;
    private final String c;
    private final Writer d;

    public String a() {
        return this.b.a();
    }

    public void c() {
        this.b.c();
    }

    public void a(bx bxVar) {
        this.b.a(bxVar);
    }

    public bi b() {
        bi b = this.b.b();
        try {
            this.d.write(this.c);
            this.a.a(b);
        } catch (Throwable th) {
        }
        return b;
    }

    public q(c8 c8Var, Writer writer, String str) {
        this.b = c8Var;
        this.d = writer;
        this.a = new cr(this.d);
        this.c = str;
    }

    public void d() {
        this.b.d();
    }
}
