package defpackage;

public class p {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public String a() {
        return a(this.a);
    }

    public String c() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a != null && this.a.length() > 0) {
            stringBuilder.append(a(this.a)).append('\n');
        }
        Object obj = null;
        if (this.b != null && this.b.length() > 0) {
            stringBuilder.append(this.b);
            obj = 1;
        }
        if (this.c != null && this.c.length() > 0) {
            if (obj != null) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(this.c);
            obj = 1;
        }
        if (this.d != null && this.d.length() > 0) {
            if (obj != null) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(this.d);
            obj = 1;
        }
        if (this.e != null && this.e.length() > 0) {
            if (obj != null) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(this.e);
        }
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r7) {
        /*
        r6 = 92;
        r1 = defpackage.o.a;
        r2 = new java.lang.StringBuffer;
        r2.<init>();
        r0 = 0;
    L_0x000a:
        r3 = r7.length();
        if (r0 >= r3) goto L_0x004a;
    L_0x0010:
        r3 = r7.charAt(r0);
        if (r3 != r6) goto L_0x0043;
    L_0x0016:
        r4 = r7.length();
        r4 = r4 + -3;
        if (r0 >= r4) goto L_0x0043;
    L_0x001e:
        r4 = r0 + 1;
        r4 = r7.charAt(r4);
        r5 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        if (r4 != r5) goto L_0x0046;
    L_0x0028:
        r4 = r0 + 2;
        r4 = r7.charAt(r4);
        if (r4 != r6) goto L_0x0046;
    L_0x0030:
        r4 = r0 + 3;
        r4 = r7.charAt(r4);
        r5 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        if (r4 != r5) goto L_0x0046;
    L_0x003a:
        r4 = 10;
        r2.append(r4);
        r0 = r0 + 3;
        if (r1 == 0) goto L_0x0046;
    L_0x0043:
        r2.append(r3);
    L_0x0046:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x000a;
    L_0x004a:
        r0 = r2.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p.a(java.lang.String):java.lang.String");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a(this.a)).append(" ").append(this.b).append(" ").append(this.c).append(" ").append(this.d).append(" ").append(this.e);
        return stringBuilder.toString();
    }

    public String b() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a != null) {
            stringBuilder.append(this.a);
        }
        stringBuilder.append(";");
        if (this.b != null) {
            stringBuilder.append(this.b);
        }
        stringBuilder.append(";");
        if (this.c != null) {
            stringBuilder.append(this.c);
        }
        stringBuilder.append(";");
        if (this.d != null) {
            stringBuilder.append(this.d);
        }
        stringBuilder.append(";");
        if (this.e != null) {
            stringBuilder.append(this.e);
        }
        return stringBuilder.toString();
    }
}
