package com.whatsapp.protocol;

class an extends w {
    final j a;
    final String b;
    final cs c;
    final cd d;
    final t e;

    public void a(int i) {
        if (this.d != null) {
            this.d.a(i);
        }
    }

    an(j jVar, cs csVar, String str, cd cdVar, t tVar) {
        this.a = jVar;
        this.c = csVar;
        this.b = str;
        this.d = cdVar;
        this.e = tVar;
    }

    public void a(Exception exception) {
        if (this.e != null) {
            this.e.a(exception);
        }
    }

    public void a(bi biVar, String str) {
        if (this.c != null) {
            this.c.a(this.b);
        }
    }
}
