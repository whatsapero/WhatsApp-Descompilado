package com.whatsapp;

public class vt {
    public final String[] a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String[] h;
    public final int[] i;
    public final String[] j;
    public final String[] k;
    public final int[] l;

    public int b() {
        int i = App.az;
        try {
            if (this.i != null) {
                if (this.i.length != 0) {
                    int i2 = this.i[0];
                    int i3 = 1;
                    while (i3 < this.i.length) {
                        try {
                            if (this.i[i3] < i2) {
                                i2 = this.i[i3];
                            }
                            i3++;
                            if (i != 0) {
                                return i2;
                            }
                        }
                    }
                    return i2;
                }
            }
            return 5;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    vt(String[] strArr, z7 z7Var) {
        this(strArr);
    }

    public int a() {
        int i = App.az;
        try {
            if (this.i != null) {
                if (this.i.length != 0) {
                    int i2 = this.i[0];
                    int i3 = 1;
                    while (i3 < this.i.length) {
                        try {
                            if (this.i[i3] > i2) {
                                i2 = this.i[i3];
                            }
                            i3++;
                            if (i != 0) {
                                return i2;
                            }
                        }
                    }
                    return i2;
                }
            }
            return 14;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private vt(java.lang.String[] r10) {
        /*
        r9_this = this;
        r2 = 1;
        r1 = 0;
        r0 = 0;
        r9.<init>();
        r3 = r10.length;
        r4 = 12;
        if (r3 >= r4) goto L_0x0011;
    L_0x000b:
        r0 = new java.lang.IllegalArgumentException;
        r0.<init>();
        throw r0;
    L_0x0011:
        r3 = r10[r1];
        r4 = r10[r2];
        r5 = 2;
        r5 = r10[r5];
        r6 = 3;
        r6 = r10[r6];
        r7 = 4;
        r7 = r10[r7];
        r8 = 5;
        r8 = r10[r8];
        if (r4 == 0) goto L_0x0025;
    L_0x0023:
        if (r5 != 0) goto L_0x002d;
    L_0x0025:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x002b }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;
    L_0x002d:
        r9.b = r4;	 Catch:{ IllegalArgumentException -> 0x00cb }
        r9.f = r3;	 Catch:{ IllegalArgumentException -> 0x00cb }
        r3 = java.lang.Integer.parseInt(r5);	 Catch:{ IllegalArgumentException -> 0x00cb }
        r9.c = r3;	 Catch:{ IllegalArgumentException -> 0x00cb }
        if (r6 == 0) goto L_0x00cf;
    L_0x0039:
        r3 = r6.trim();	 Catch:{ IllegalArgumentException -> 0x00cd }
        r3 = r3.length();	 Catch:{ IllegalArgumentException -> 0x00cd }
        if (r3 <= 0) goto L_0x00cf;
    L_0x0043:
        r3 = com.whatsapp.ats.h(r6);	 Catch:{ IllegalArgumentException -> 0x00cd }
    L_0x0047:
        r9.l = r3;	 Catch:{ IllegalArgumentException -> 0x00d2 }
        if (r7 == 0) goto L_0x00d6;
    L_0x004b:
        r3 = r7.trim();	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r3 = r3.length();	 Catch:{ IllegalArgumentException -> 0x00d4 }
        if (r3 <= 0) goto L_0x00d6;
    L_0x0055:
        r3 = com.whatsapp.ats.h(r7);	 Catch:{ IllegalArgumentException -> 0x00d4 }
    L_0x0059:
        r9.i = r3;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        if (r8 == 0) goto L_0x00dc;
    L_0x005d:
        r3 = r8.trim();	 Catch:{ IllegalArgumentException -> 0x00da }
        r3 = r3.length();	 Catch:{ IllegalArgumentException -> 0x00da }
        if (r3 <= 0) goto L_0x00dc;
    L_0x0067:
        r3 = ",";
        r3 = android.text.TextUtils.split(r8, r3);	 Catch:{ IllegalArgumentException -> 0x00da }
    L_0x006d:
        r9.h = r3;	 Catch:{ IllegalArgumentException -> 0x00de }
        r3 = 7;
        r3 = r10[r3];	 Catch:{ IllegalArgumentException -> 0x00de }
        r3 = r3.length();	 Catch:{ IllegalArgumentException -> 0x00de }
        if (r3 > 0) goto L_0x008c;
    L_0x0078:
        r3 = 8;
        r3 = r10[r3];	 Catch:{ IllegalArgumentException -> 0x00e0 }
        r3 = r3.length();	 Catch:{ IllegalArgumentException -> 0x00e0 }
        if (r3 > 0) goto L_0x008c;
    L_0x0082:
        r3 = 9;
        r3 = r10[r3];	 Catch:{ IllegalArgumentException -> 0x00e2 }
        r3 = r3.length();	 Catch:{ IllegalArgumentException -> 0x00e2 }
        if (r3 <= 0) goto L_0x008d;
    L_0x008c:
        r1 = r2;
    L_0x008d:
        r9.g = r1;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r1 = r9.g;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        if (r1 == 0) goto L_0x00e6;
    L_0x0093:
        r1 = 7;
        r1 = r10[r1];	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r2 = ";";
        r1 = android.text.TextUtils.split(r1, r2);	 Catch:{ IllegalArgumentException -> 0x00e4 }
    L_0x009c:
        r9.j = r1;	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r1 = r9.g;	 Catch:{ IllegalArgumentException -> 0x00e8 }
        if (r1 == 0) goto L_0x00ea;
    L_0x00a2:
        r1 = 8;
        r1 = r10[r1];	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r2 = ";";
        r1 = android.text.TextUtils.split(r1, r2);	 Catch:{ IllegalArgumentException -> 0x00e8 }
    L_0x00ac:
        r9.a = r1;	 Catch:{ IllegalArgumentException -> 0x00ec }
        r1 = r9.g;	 Catch:{ IllegalArgumentException -> 0x00ec }
        if (r1 == 0) goto L_0x00bc;
    L_0x00b2:
        r0 = 9;
        r0 = r10[r0];	 Catch:{ IllegalArgumentException -> 0x00ec }
        r1 = ";";
        r0 = android.text.TextUtils.split(r0, r1);	 Catch:{ IllegalArgumentException -> 0x00ec }
    L_0x00bc:
        r9.k = r0;
        r0 = 10;
        r0 = r10[r0];
        r9.e = r0;
        r0 = 11;
        r0 = r10[r0];
        r9.d = r0;
        return;
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;
    L_0x00cf:
        r3 = r0;
        goto L_0x0047;
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;
    L_0x00d6:
        r3 = r0;
        goto L_0x0059;
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00da }
    L_0x00da:
        r0 = move-exception;
        throw r0;
    L_0x00dc:
        r3 = r0;
        goto L_0x006d;
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;
    L_0x00e4:
        r0 = move-exception;
        throw r0;
    L_0x00e6:
        r1 = r0;
        goto L_0x009c;
    L_0x00e8:
        r0 = move-exception;
        throw r0;
    L_0x00ea:
        r1 = r0;
        goto L_0x00ac;
    L_0x00ec:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.vt.<init>(java.lang.String[]):void");
    }

    public String a(String str) {
        int i = App.az;
        int i2 = 0;
        while (i2 < str.length()) {
            try {
                if (this.h != null) {
                    int i3 = 0;
                    Object obj = null;
                    while (i3 < this.h.length && r3 == null) {
                        try {
                            if (this.h[i3].charAt(0) == str.charAt(i2)) {
                                obj = 1;
                            }
                            i3++;
                            if (i != 0) {
                                break;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    if (obj != null) {
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    try {
                        str = str.substring(i2);
                        break;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                break;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        return str;
    }

    public int a(int i) {
        int i2 = App.az;
        try {
            if (i < b()) {
                return -1;
            }
            try {
                if (i > a()) {
                    return 1;
                }
                try {
                    if (this.i == null) {
                        return 0;
                    }
                    if (this.i.length == 0) {
                        return 0;
                    }
                    int i3 = 0;
                    while (i3 < this.i.length) {
                        try {
                            if (this.i[i3] != i) {
                                i3++;
                                if (i2 != 0) {
                                    break;
                                }
                            }
                            return 0;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    return 1;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }
}
