package com.google;

public final class ce extends bT {
    private static final int[] b;
    private static final char[] c;
    private static final int e;
    private static final String z;
    private final StringBuilder d;
    private final int[] f;

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
        r2 = "x\u0014=N7}\u00138E:\tgL9F\u000ebG4I\u0003iB3L\u0018t].W\u001dsX%Z\u0012\b!]'g\u000e*\u001ca+A%";
        r0 = -1;
    L_0x0004:
        r2 = r2.toCharArray();
        r3 = r2.length;
        r4 = r3;
        r5 = r1;
        r3 = r2;
    L_0x000c:
        if (r4 > r5) goto L_0x0021;
    L_0x000e:
        r2 = new java.lang.String;
        r2.<init>(r3);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x003d;
            default: goto L_0x001a;
        };
    L_0x001a:
        z = r2;
        r0 = "x\u0014=N7}\u00138E:\tgL9F\u000ebG4I\u0003iB3L\u0018t].W\u001dsX%Z\u0012\b!]'g\u000e*\u001ca+A%";
        r2 = r0;
        r0 = r1;
        goto L_0x0004;
    L_0x0021:
        r6 = r3[r5];
        r2 = r5 % 5;
        switch(r2) {
            case 0: goto L_0x0031;
            case 1: goto L_0x0034;
            case 2: goto L_0x0037;
            case 3: goto L_0x003a;
            default: goto L_0x0028;
        };
    L_0x0028:
        r2 = 3;
    L_0x0029:
        r2 = r2 ^ r6;
        r2 = (char) r2;
        r3[r5] = r2;
        r2 = r5 + 1;
        r5 = r2;
        goto L_0x000c;
    L_0x0031:
        r2 = 72;
        goto L_0x0029;
    L_0x0034:
        r2 = 37;
        goto L_0x0029;
    L_0x0037:
        r2 = 15;
        goto L_0x0029;
    L_0x003a:
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        goto L_0x0029;
    L_0x003d:
        r0 = r2.toCharArray();
        c = r0;
        r0 = 48;
        r0 = new int[r0];
        r0 = new int[]{276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        b = r0;
        r0 = b;
        r1 = 47;
        r0 = r0[r1];
        e = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ce.<clinit>():void");
    }

    private static void a(CharSequence charSequence) {
        int length = charSequence.length();
        a(charSequence, length - 2, 20);
        a(charSequence, length - 1, 15);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(int[] r8) {
        /*
        r3 = 0;
        r5 = com.google.bT.a;
        r6 = r8.length;
        r2 = r8.length;
        r1 = r3;
        r0 = r3;
    L_0x0007:
        if (r1 >= r2) goto L_0x0010;
    L_0x0009:
        r4 = r8[r1];
        r0 = r0 + r4;
        r1 = r1 + 1;
        if (r5 == 0) goto L_0x0007;
    L_0x0010:
        r4 = r3;
        r1 = r3;
    L_0x0012:
        if (r4 >= r6) goto L_0x0027;
    L_0x0014:
        r2 = r8[r4];
        r2 = (float) r2;
        r7 = 1091567616; // 0x41100000 float:9.0 double:5.39306059E-315;
        r2 = r2 * r7;
        r7 = (float) r0;
        r2 = r2 / r7;
        r7 = java.lang.Math.round(r2);
        r2 = 1;
        if (r7 < r2) goto L_0x0026;
    L_0x0023:
        r2 = 4;
        if (r7 <= r2) goto L_0x0028;
    L_0x0026:
        r1 = -1;
    L_0x0027:
        return r1;
    L_0x0028:
        r2 = r4 & 1;
        if (r2 != 0) goto L_0x0039;
    L_0x002c:
        r2 = r3;
    L_0x002d:
        if (r2 >= r7) goto L_0x0037;
    L_0x002f:
        r1 = r1 << 1;
        r1 = r1 | 1;
        r2 = r2 + 1;
        if (r5 == 0) goto L_0x002d;
    L_0x0037:
        if (r5 == 0) goto L_0x003a;
    L_0x0039:
        r1 = r1 << r7;
    L_0x003a:
        r2 = r4 + 1;
        if (r5 != 0) goto L_0x0027;
    L_0x003e:
        r4 = r2;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ce.a(int[]):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] a(com.google.da r14) {
        /*
        r13_this = this;
        r12 = 2;
        r3 = 1;
        r4 = 0;
        r6 = com.google.bT.a;
        r7 = r14.d();
        r0 = r14.a(r4);
        r1 = r13.f;
        java.util.Arrays.fill(r1, r4);
        r8 = r13.f;
        r9 = r8.length;
        r5 = r0;
        r2 = r4;
        r1 = r0;
        r0 = r4;
    L_0x0019:
        if (r5 >= r7) goto L_0x005f;
    L_0x001b:
        r10 = r14.c(r5);
        r10 = r10 ^ r2;
        if (r10 == 0) goto L_0x002a;
    L_0x0022:
        r10 = r8[r0];
        r10 = r10 + 1;
        r8[r0] = r10;
        if (r6 == 0) goto L_0x005b;
    L_0x002a:
        r10 = r9 + -1;
        if (r0 != r10) goto L_0x0054;
    L_0x002e:
        r10 = a(r8);
        r11 = e;
        if (r10 != r11) goto L_0x003d;
    L_0x0036:
        r0 = new int[r12];
        r0[r4] = r1;
        r0[r3] = r5;
        return r0;
    L_0x003d:
        r10 = r8[r4];
        r11 = r8[r3];
        r10 = r10 + r11;
        r1 = r1 + r10;
        r10 = r9 + -2;
        java.lang.System.arraycopy(r8, r12, r8, r4, r10);
        r10 = r9 + -2;
        r8[r10] = r4;
        r10 = r9 + -1;
        r8[r10] = r4;
        r0 = r0 + -1;
        if (r6 == 0) goto L_0x0056;
    L_0x0054:
        r0 = r0 + 1;
    L_0x0056:
        r8[r0] = r3;
        if (r2 != 0) goto L_0x0064;
    L_0x005a:
        r2 = r3;
    L_0x005b:
        r5 = r5 + 1;
        if (r6 == 0) goto L_0x0019;
    L_0x005f:
        r0 = com.google.gv.a();
        throw r0;
    L_0x0064:
        r2 = r4;
        goto L_0x005b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ce.a(com.google.da):int[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.cu a(int r13, com.google.da r14, java.util.Map r15) {
        /*
        r12_this = this;
        r4 = com.google.bT.a;
        r5 = r12.a(r14);
        r0 = 1;
        r0 = r5[r0];
        r0 = r14.a(r0);
        r6 = r14.d();
        r7 = r12.f;
        r1 = 0;
        java.util.Arrays.fill(r7, r1);
        r8 = r12.d;
        r1 = 0;
        r8.setLength(r1);
    L_0x001d:
        b(r14, r0, r7);
        r1 = a(r7);
        if (r1 >= 0) goto L_0x002b;
    L_0x0026:
        r0 = com.google.gv.a();
        throw r0;
    L_0x002b:
        r3 = a(r1);
        r8.append(r3);
        r9 = r7.length;
        r1 = 0;
        r2 = r1;
        r1 = r0;
    L_0x0036:
        if (r2 >= r9) goto L_0x003f;
    L_0x0038:
        r10 = r7[r2];
        r1 = r1 + r10;
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x0036;
    L_0x003f:
        r1 = r14.a(r1);
        r2 = 42;
        if (r3 != r2) goto L_0x00b7;
    L_0x0047:
        r2 = r8.length();
        r2 = r2 + -1;
        r8.deleteCharAt(r2);
        r3 = 0;
        r9 = r7.length;
        r2 = 0;
        r11 = r2;
        r2 = r3;
        r3 = r11;
    L_0x0056:
        if (r3 >= r9) goto L_0x005f;
    L_0x0058:
        r10 = r7[r3];
        r2 = r2 + r10;
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x0056;
    L_0x005f:
        if (r1 == r6) goto L_0x0067;
    L_0x0061:
        r1 = r14.c(r1);
        if (r1 != 0) goto L_0x006c;
    L_0x0067:
        r0 = com.google.gv.a();
        throw r0;
    L_0x006c:
        r1 = r8.length();
        r3 = 2;
        if (r1 >= r3) goto L_0x0078;
    L_0x0073:
        r0 = com.google.gv.a();
        throw r0;
    L_0x0078:
        a(r8);
        r1 = r8.length();
        r1 = r1 + -2;
        r8.setLength(r1);
        r1 = b(r8);
        r3 = 1;
        r3 = r5[r3];
        r4 = 0;
        r4 = r5[r4];
        r3 = r3 + r4;
        r3 = (float) r3;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 / r4;
        r0 = (float) r0;
        r2 = (float) r2;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r4;
        r0 = r0 + r2;
        r2 = new com.google.cu;
        r4 = 0;
        r5 = 2;
        r5 = new com.google.bm[r5];
        r6 = 0;
        r7 = new com.google.bm;
        r8 = (float) r13;
        r7.<init>(r3, r8);
        r5[r6] = r7;
        r3 = 1;
        r6 = new com.google.bm;
        r7 = (float) r13;
        r6.<init>(r0, r7);
        r5[r3] = r6;
        r0 = com.google.R.CODE_93;
        r2.<init>(r1, r4, r5, r0);
        return r2;
    L_0x00b7:
        r0 = r1;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ce.a(int, com.google.da, java.util.Map):com.google.cu");
    }

    private static char a(int i) {
        int i2 = bT.a;
        int i3 = 0;
        while (i3 < b.length) {
            if (b[i3] != i) {
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            return c[i3];
        }
        throw gv.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(java.lang.CharSequence r10) {
        /*
        r1 = 0;
        r9 = 90;
        r8 = 65;
        r3 = com.google.bT.a;
        r4 = r10.length();
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r2 = r1;
    L_0x0011:
        if (r2 >= r4) goto L_0x0040;
    L_0x0013:
        r6 = r10.charAt(r2);
        r0 = 97;
        if (r6 < r0) goto L_0x0094;
    L_0x001b:
        r0 = 100;
        if (r6 > r0) goto L_0x0094;
    L_0x001f:
        r0 = r4 + -1;
        if (r2 < r0) goto L_0x0028;
    L_0x0023:
        r0 = com.google.ga.a();
        throw r0;
    L_0x0028:
        r0 = r2 + 1;
        r7 = r10.charAt(r0);
        switch(r6) {
            case 97: goto L_0x0053;
            case 98: goto L_0x0061;
            case 99: goto L_0x007e;
            case 100: goto L_0x0045;
            default: goto L_0x0031;
        };
    L_0x0031:
        r0 = r1;
    L_0x0032:
        r5.append(r0);
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x003c;
    L_0x0039:
        r5.append(r6);
    L_0x003c:
        r2 = r0 + 1;
        if (r3 == 0) goto L_0x0011;
    L_0x0040:
        r0 = r5.toString();
        return r0;
    L_0x0045:
        if (r7 < r8) goto L_0x004e;
    L_0x0047:
        if (r7 > r9) goto L_0x004e;
    L_0x0049:
        r0 = r7 + 32;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0032;
    L_0x004e:
        r0 = com.google.ga.a();
        throw r0;
    L_0x0053:
        if (r7 < r8) goto L_0x005c;
    L_0x0055:
        if (r7 > r9) goto L_0x005c;
    L_0x0057:
        r0 = r7 + -64;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0032;
    L_0x005c:
        r0 = com.google.ga.a();
        throw r0;
    L_0x0061:
        if (r7 < r8) goto L_0x006c;
    L_0x0063:
        r0 = 69;
        if (r7 > r0) goto L_0x006c;
    L_0x0067:
        r0 = r7 + -38;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0032;
    L_0x006c:
        r0 = 70;
        if (r7 < r0) goto L_0x0079;
    L_0x0070:
        r0 = 87;
        if (r7 > r0) goto L_0x0079;
    L_0x0074:
        r0 = r7 + -11;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0032;
    L_0x0079:
        r0 = com.google.ga.a();
        throw r0;
    L_0x007e:
        if (r7 < r8) goto L_0x0089;
    L_0x0080:
        r0 = 79;
        if (r7 > r0) goto L_0x0089;
    L_0x0084:
        r0 = r7 + -32;
        r0 = (char) r0;
        if (r3 == 0) goto L_0x0032;
    L_0x0089:
        if (r7 != r9) goto L_0x008f;
    L_0x008b:
        r0 = 58;
        if (r3 == 0) goto L_0x0032;
    L_0x008f:
        r0 = com.google.ga.a();
        throw r0;
    L_0x0094:
        r0 = r2;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ce.b(java.lang.CharSequence):java.lang.String");
    }

    public ce() {
        this.d = new StringBuilder(20);
        this.f = new int[6];
    }

    private static void a(CharSequence charSequence, int i, int i2) {
        int i3 = bT.a;
        int i4 = i - 1;
        int i5 = 0;
        int i6 = 1;
        while (i4 >= 0) {
            i5 += z.indexOf(charSequence.charAt(i4)) * i6;
            i6++;
            if (i6 > i2) {
                i6 = 1;
            }
            i4--;
            if (i3 != 0) {
                break;
            }
        }
        if (charSequence.charAt(i) != c[i5 % 47]) {
            throw gp.a();
        }
    }
}
