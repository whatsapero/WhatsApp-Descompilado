package com.whatsapp.messaging;

import com.whatsapp.protocol.b;
import com.whatsapp.protocol.ba;
import com.whatsapp.protocol.c5;
import com.whatsapp.protocol.e;
import com.whatsapp.protocol.m;
import com.whatsapp.protocol.r;

public class az {
    b a;
    String b;
    m c;
    e d;
    ba e;
    int f;
    int g;
    c5 h;
    String i;
    String j;
    String k;
    r l;

    public az(String str, String str2) {
        this.i = str;
        this.j = str2;
    }

    public az(String str, String str2, r rVar) {
        this(str, str2);
        this.l = rVar;
    }

    public az(String str, String str2, String str3, m mVar, int i) {
        this(str, str2);
        this.b = str3;
        this.c = mVar;
        this.f = i;
    }

    public az(String str, String str2, e eVar) {
        this(str, str2);
        this.d = eVar;
    }

    public az(String str, String str2, int i, c5 c5Var) {
        this(str, str2);
        this.g = i;
        this.h = c5Var;
    }

    public az(String str, String str2, String str3) {
        this(str, str2);
        this.b = str3;
    }

    public az(String str, String str2, ba baVar) {
        this(str, str2);
        this.e = baVar;
    }

    public az(String str, String str2, b bVar) {
        this(str, str2);
        this.a = bVar;
    }

    public az(String str, String str2, String str3, m mVar) {
        this(str, str2);
        this.k = str3;
        this.c = mVar;
    }
}
