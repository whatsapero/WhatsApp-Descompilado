package com.whatsapp.gallerypicker;

import android.database.ContentObserver;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class bt implements v {
    private static final String[] z;
    private long[] a;
    private int b;
    private final PriorityQueue c;
    private int d;
    private int[] e;
    private final v[] f;

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
        r2 = "\u000byR\u0018\u0000Dp\u0007\u001eAEqBLMJn\u0007\u0005S\u000b";
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
        r0 = "BxC\tX\u000b";
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
        r2 = 32;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 43;
        goto L_0x0038;
    L_0x0043:
        r2 = 22;
        goto L_0x0038;
    L_0x0046:
        r2 = 39;
        goto L_0x0038;
    L_0x0049:
        r2 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.bt.<clinit>():void");
    }

    public HashMap c() {
        int i = ImagePreview.y;
        HashMap hashMap = new HashMap();
        v[] vVarArr = this.f;
        int length = vVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            hashMap.putAll(vVarArr[i2].c());
            i2++;
            if (i != 0) {
                break;
            }
        }
        return hashMap;
    }

    public void b(ContentObserver contentObserver) {
        int i = ImagePreview.y;
        v[] vVarArr = this.f;
        int length = vVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            vVarArr[i2].b(contentObserver);
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public bt(v[] vVarArr, int i) {
        Comparator aeVar;
        int i2 = ImagePreview.y;
        this.f = (v[]) vVarArr.clone();
        if (i == 1) {
            aeVar = new ae(null);
        } else {
            aeVar = new ad(null);
        }
        this.c = new PriorityQueue(4, aeVar);
        this.a = new long[16];
        this.d = 0;
        this.e = new int[this.f.length];
        this.b = -1;
        this.c.clear();
        int length = this.f.length;
        int i3 = 0;
        while (i3 < length) {
            b5 b5Var = new b5(this.f[i3], i3);
            try {
                if (b5Var.a()) {
                    this.c.add(b5Var);
                }
                i3++;
                if (i2 != 0) {
                    return;
                }
            } catch (IndexOutOfBoundsException e) {
                throw e;
            }
        }
    }

    public void e() {
        int i = ImagePreview.y;
        int i2 = 0;
        int length = this.f.length;
        while (i2 < length) {
            this.f[i2].e();
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public int b() {
        int i = 0;
        int i2 = ImagePreview.y;
        v[] vVarArr = this.f;
        int length = vVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            i += vVarArr[i3].b();
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        return i;
    }

    public aw a(int i) {
        int i2 = 0;
        int i3 = ImagePreview.y;
        try {
            if (i >= 0) {
                if (i <= b()) {
                    b5 a;
                    Arrays.fill(this.e, 0);
                    int i4 = this.d;
                    int i5 = 0;
                    while (i5 < i4) {
                        long j = this.a[i5];
                        int i6 = (int) (-1 & j);
                        int i7 = (int) (j >> 32);
                        if (i2 + i6 <= i) {
                            i2 += i6;
                            int[] iArr = this.e;
                            iArr[i7] = i6 + iArr[i7];
                            i5++;
                            if (i3 != 0) {
                                break;
                            }
                        }
                        return this.f[i7].a((i - i2) + this.e[i7]);
                    }
                    while (true) {
                        a = a();
                        if (a == null) {
                            return null;
                        }
                        if (i2 == i) {
                            break;
                        }
                        try {
                            if (a.a()) {
                                this.c.add(a);
                            }
                            i2++;
                        } catch (IndexOutOfBoundsException e) {
                            throw e;
                        }
                    }
                    aw awVar = a.b;
                    try {
                        if (!a.a()) {
                            return awVar;
                        }
                        this.c.add(a);
                        return awVar;
                    } catch (IndexOutOfBoundsException e2) {
                        throw e2;
                    }
                }
            }
            throw new IndexOutOfBoundsException(z[1] + i + z[0] + b());
        } catch (IndexOutOfBoundsException e22) {
            throw e22;
        }
    }

    public void a(ContentObserver contentObserver) {
        int i = ImagePreview.y;
        v[] vVarArr = this.f;
        int length = vVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            vVarArr[i2].a(contentObserver);
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    public boolean a() {
        int i = ImagePreview.y;
        v[] vVarArr = this.f;
        int length = vVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                if (vVarArr[i2].a()) {
                    i2++;
                    if (i != 0) {
                        break;
                    }
                }
                return false;
            } catch (IndexOutOfBoundsException e) {
                throw e;
            }
        }
        return true;
    }

    private b5 a() {
        b5 b5Var = (b5) this.c.poll();
        if (b5Var == null) {
            return null;
        }
        try {
            if (b5Var.d == this.b) {
                int i = this.d - 1;
                long[] jArr = this.a;
                jArr[i] = jArr[i] + 1;
                if (ImagePreview.y == 0) {
                    return b5Var;
                }
            }
            this.b = b5Var.d;
            if (this.a.length == this.d) {
                Object obj = new Object[(this.d * 2)];
                System.arraycopy(this.a, 0, obj, 0, this.d);
                this.a = obj;
            }
            long[] jArr2 = this.a;
            int i2 = this.d;
            this.d = i2 + 1;
            jArr2[i2] = (((long) this.b) << 32) | 1;
            return b5Var;
        } catch (IndexOutOfBoundsException e) {
            throw e;
        }
    }

    public void d() {
        int i = ImagePreview.y;
        v[] vVarArr = this.f;
        int length = vVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            vVarArr[i2].d();
            i2++;
            if (i != 0) {
                return;
            }
        }
    }
}
