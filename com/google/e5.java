package com.google;

import java.io.Externalizable;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class e5 implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean a;
    private String b;
    private boolean c;
    private boolean d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private String j;
    private List k;

    public e5 a(boolean z) {
        this.c = true;
        this.d = z;
        return this;
    }

    public boolean n() {
        return this.i;
    }

    public static el h() {
        return new el();
    }

    public e5 c(String str) {
        this.i = true;
        this.e = str;
        return this;
    }

    public e5 e(String str) {
        this.a = true;
        this.b = str;
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.e5 a(com.google.e5 r5) {
        /*
        r4_this = this;
        r1 = com.google.c8.b;
        r0 = r5.d();	 Catch:{ NullPointerException -> 0x0050 }
        if (r0 == 0) goto L_0x000f;
    L_0x0008:
        r0 = r5.j();	 Catch:{ NullPointerException -> 0x0050 }
        r4.b(r0);	 Catch:{ NullPointerException -> 0x0050 }
    L_0x000f:
        r0 = r5.l();	 Catch:{ NullPointerException -> 0x0052 }
        if (r0 == 0) goto L_0x001c;
    L_0x0015:
        r0 = r5.a();	 Catch:{ NullPointerException -> 0x0052 }
        r4.a(r0);	 Catch:{ NullPointerException -> 0x0052 }
    L_0x001c:
        r2 = r5.f();
        r0 = 0;
    L_0x0021:
        if (r0 >= r2) goto L_0x002e;
    L_0x0023:
        r3 = r5.a(r0);
        r4.d(r3);
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0021;
    L_0x002e:
        r0 = r5.n();	 Catch:{ NullPointerException -> 0x0054 }
        if (r0 == 0) goto L_0x003b;
    L_0x0034:
        r0 = r5.e();	 Catch:{ NullPointerException -> 0x0054 }
        r4.c(r0);	 Catch:{ NullPointerException -> 0x0054 }
    L_0x003b:
        r0 = r5.m();	 Catch:{ NullPointerException -> 0x0056 }
        if (r0 == 0) goto L_0x0048;
    L_0x0041:
        r0 = r5.i();	 Catch:{ NullPointerException -> 0x0056 }
        r4.e(r0);	 Catch:{ NullPointerException -> 0x0056 }
    L_0x0048:
        r0 = r5.g();
        r4.a(r0);
        return r4;
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.e5.a(com.google.e5):com.google.e5");
    }

    public String j() {
        return this.f;
    }

    public boolean b() {
        return this.c;
    }

    public e5() {
        this.f = "";
        this.j = "";
        this.k = new ArrayList();
        this.e = "";
        this.d = false;
        this.b = "";
    }

    public boolean g() {
        return this.d;
    }

    public e5 d(String str) {
        if (str == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.k.add(str);
        return this;
    }

    public e5 c() {
        this.i = false;
        this.e = "";
        return this;
    }

    public String e() {
        return this.e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void readExternal(java.io.ObjectInput r6) {
        /*
        r5_this = this;
        r1 = com.google.c8.b;
        r0 = r6.readUTF();
        r5.b(r0);
        r0 = r6.readUTF();
        r5.a(r0);
        r2 = r6.readInt();
        r0 = 0;
    L_0x0015:
        if (r0 >= r2) goto L_0x0024;
    L_0x0017:
        r3 = r5.k;
        r4 = r6.readUTF();
        r3.add(r4);
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0015;
    L_0x0024:
        r0 = r6.readBoolean();	 Catch:{ NullPointerException -> 0x0046 }
        if (r0 == 0) goto L_0x0031;
    L_0x002a:
        r0 = r6.readUTF();	 Catch:{ NullPointerException -> 0x0046 }
        r5.c(r0);	 Catch:{ NullPointerException -> 0x0046 }
    L_0x0031:
        r0 = r6.readBoolean();	 Catch:{ NullPointerException -> 0x0048 }
        if (r0 == 0) goto L_0x003e;
    L_0x0037:
        r0 = r6.readUTF();	 Catch:{ NullPointerException -> 0x0048 }
        r5.e(r0);	 Catch:{ NullPointerException -> 0x0048 }
    L_0x003e:
        r0 = r6.readBoolean();
        r5.a(r0);
        return;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.e5.readExternal(java.io.ObjectInput):void");
    }

    public String a() {
        return this.j;
    }

    public e5 b(String str) {
        this.h = true;
        this.f = str;
        return this;
    }

    public boolean l() {
        return this.g;
    }

    public e5 a(String str) {
        this.g = true;
        this.j = str;
        return this;
    }

    public boolean d() {
        return this.h;
    }

    public int f() {
        return this.k.size();
    }

    public String a(int i) {
        return (String) this.k.get(i);
    }

    public boolean m() {
        return this.a;
    }

    public void writeExternal(ObjectOutput objectOutput) {
        int i = c8.b;
        objectOutput.writeUTF(this.f);
        objectOutput.writeUTF(this.j);
        int f = f();
        objectOutput.writeInt(f);
        int i2 = 0;
        while (i2 < f) {
            objectOutput.writeUTF((String) this.k.get(i2));
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            }
        }
        try {
            break;
            objectOutput.writeBoolean(this.i);
            if (this.i) {
                objectOutput.writeUTF(this.e);
            }
            try {
                objectOutput.writeBoolean(this.a);
                if (this.a) {
                    objectOutput.writeUTF(this.b);
                }
                objectOutput.writeBoolean(this.d);
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public List k() {
        return this.k;
    }

    public String i() {
        return this.b;
    }
}
