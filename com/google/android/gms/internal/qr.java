package com.google.android.gms.internal;

import java.lang.reflect.Array;
import org.whispersystems.libaxolotl.a6;

public class qr {
    protected final Class ayX;
    protected final boolean ayY;
    public final int tag;
    protected final int type;

    int B(Object obj) {
        try {
            return this.ayY ? C(obj) : D(obj);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected int C(Object obj) {
        int i = 0;
        boolean z = qw.a;
        int length = Array.getLength(obj);
        int i2 = 0;
        while (i2 < length) {
            if (Array.get(obj, i2) != null) {
                i += D(Array.get(obj, i2));
            }
            i2++;
            if (z) {
                break;
            }
        }
        return i;
    }

    protected int D(Object obj) {
        int hl = qz.hl(this.tag);
        switch (this.type) {
            case a6.h /*10*/:
                return qp.b(hl, (qw) obj);
            case a6.e /*11*/:
                return qp.c(hl, (qw) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.type);
        }
    }

    void a(Object obj, qp qpVar) {
        try {
            if (this.ayY) {
                c(obj, qpVar);
                try {
                    if (!qw.a) {
                        return;
                    }
                }
            }
            b(obj, qpVar);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void b(java.lang.Object r5, com.google.android.gms.internal.qp r6) {
        /*
        r4_this = this;
        r2 = com.google.android.gms.internal.qw.a;
        r1 = r4.tag;	 Catch:{ IOException -> 0x0029 }
        r6.hd(r1);	 Catch:{ IOException -> 0x0029 }
        r1 = r4.type;	 Catch:{ IOException -> 0x0029 }
        switch(r1) {
            case 10: goto L_0x0030;
            case 11: goto L_0x0043;
            default: goto L_0x000c;
        };
    L_0x000c:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x0027 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0027 }
        r2.<init>();	 Catch:{ IOException -> 0x0027 }
        r3 = "Unknown type ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0027 }
        r3 = r4.type;	 Catch:{ IOException -> 0x0027 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0027 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0027 }
        r1.<init>(r2);	 Catch:{ IOException -> 0x0027 }
        throw r1;	 Catch:{ IOException -> 0x0027 }
    L_0x0027:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0029 }
    L_0x0029:
        r1 = move-exception;
        r2 = new java.lang.IllegalStateException;
        r2.<init>(r1);
        throw r2;
    L_0x0030:
        r0 = r5;
        r0 = (com.google.android.gms.internal.qw) r0;	 Catch:{ IOException -> 0x0029 }
        r1 = r0;
        r3 = r4.tag;	 Catch:{ IOException -> 0x0029 }
        r3 = com.google.android.gms.internal.qz.hl(r3);	 Catch:{ IOException -> 0x0029 }
        r6.b(r1);	 Catch:{ IOException -> 0x0029 }
        r1 = 4;
        r6.x(r3, r1);	 Catch:{ IOException -> 0x0029 }
        if (r2 == 0) goto L_0x004a;
    L_0x0043:
        r5 = (com.google.android.gms.internal.qw) r5;	 Catch:{ IOException -> 0x0029 }
        r6.c(r5);	 Catch:{ IOException -> 0x0027 }
        if (r2 != 0) goto L_0x000c;
    L_0x004a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.qr.b(java.lang.Object, com.google.android.gms.internal.qp):void");
    }

    protected void c(Object obj, qp qpVar) {
        boolean z = qw.a;
        int length = Array.getLength(obj);
        int i = 0;
        while (i < length) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                try {
                    b(obj2, qpVar);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            i++;
            if (z) {
                return;
            }
        }
    }
}
