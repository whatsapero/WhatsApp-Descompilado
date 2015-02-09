package com.google;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class dt implements Externalizable {
    private static final long serialVersionUID = 1;
    private String a;
    private String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private String f;

    public dt a(String str) {
        this.c = true;
        this.a = str;
        return this;
    }

    public String b() {
        return this.b;
    }

    public boolean a() {
        return this.e;
    }

    public boolean c() {
        return this.d;
    }

    public String d() {
        return this.a;
    }

    public String g() {
        return this.f;
    }

    public dt a(dt dtVar) {
        if (dtVar.e()) {
            a(dtVar.d());
        }
        if (dtVar.c()) {
            c(dtVar.b());
        }
        if (dtVar.a()) {
            b(dtVar.g());
        }
        return this;
    }

    public boolean b(dt dtVar) {
        return this.a.equals(dtVar.a) && this.b.equals(dtVar.b) && this.f.equals(dtVar.f);
    }

    public void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            a(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            c(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            b(objectInput.readUTF());
        }
    }

    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.c);
        if (this.c) {
            objectOutput.writeUTF(this.a);
        }
        objectOutput.writeBoolean(this.d);
        if (this.d) {
            objectOutput.writeUTF(this.b);
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            objectOutput.writeUTF(this.f);
        }
    }

    public boolean e() {
        return this.c;
    }

    public dt() {
        this.a = "";
        this.b = "";
        this.f = "";
    }

    public static d8 f() {
        return new d8();
    }

    public dt b(String str) {
        this.e = true;
        this.f = str;
        return this;
    }

    public dt c(String str) {
        this.d = true;
        this.b = str;
        return this;
    }
}
