package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.HashMap;

public final class DataHolder implements SafeParcelable {
    public static final f CREATOR;
    private static final a Ll;
    private final int CK;
    private final int Iv;
    private final String[] Ld;
    Bundle Le;
    private final CursorWindow[] Lf;
    private final Bundle Lg;
    int[] Lh;
    int Li;
    private Object Lj;
    private boolean Lk;
    boolean mClosed;

    public class a {
        public static boolean a;
        private final String[] Ld;
        private final ArrayList Lm;
        private final String Ln;
        private final HashMap Lo;
        private boolean Lp;
        private String Lq;

        private a(String[] strArr, String str) {
            this.Ld = (String[]) jx.i(strArr);
            this.Lm = new ArrayList();
            this.Ln = str;
            this.Lo = new HashMap();
            this.Lp = false;
            this.Lq = null;
        }

        a(String[] strArr, String str, AnonymousClass_1 anonymousClass_1) {
            this(strArr, str);
        }
    }

    final class AnonymousClass_1 extends a {
        AnonymousClass_1(String[] strArr, String str) {
            super(strArr, str, null);
        }
    }

    public class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    static {
        CREATOR = new f();
        Ll = new AnonymousClass_1(new String[0], null);
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.mClosed = false;
        this.Lk = true;
        this.CK = i;
        this.Ld = strArr;
        this.Lf = cursorWindowArr;
        this.Iv = i2;
        this.Lg = bundle;
    }

    public void close() {
        boolean z = a.a;
        synchronized (this) {
            if (!this.mClosed) {
                this.mClosed = true;
                int i = 0;
                while (i < this.Lf.length) {
                    this.Lf[i].close();
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void finalize() {
        /*
        r4_this = this;
        r0 = r4.Lk;	 Catch:{ b -> 0x004f }
        if (r0 == 0) goto L_0x004b;
    L_0x0004:
        r0 = r4.Lf;	 Catch:{ b -> 0x004f }
        r0 = r0.length;	 Catch:{ b -> 0x004f }
        if (r0 <= 0) goto L_0x004b;
    L_0x0009:
        r0 = r4.isClosed();	 Catch:{ b -> 0x0051 }
        if (r0 != 0) goto L_0x004b;
    L_0x000f:
        r0 = r4.Lj;	 Catch:{ b -> 0x0053 }
        if (r0 != 0) goto L_0x005c;
    L_0x0013:
        r0 = new java.lang.StringBuilder;	 Catch:{ b -> 0x0055 }
        r0.<init>();	 Catch:{ b -> 0x0055 }
        r1 = "internal object: ";
        r0 = r0.append(r1);	 Catch:{ b -> 0x0055 }
        r1 = r4.toString();	 Catch:{ b -> 0x0055 }
        r0 = r0.append(r1);	 Catch:{ b -> 0x0055 }
        r0 = r0.toString();	 Catch:{ b -> 0x0055 }
    L_0x002a:
        r1 = "DataBuffer";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0057 }
        r2.<init>();	 Catch:{ all -> 0x0057 }
        r3 = "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (";
        r2 = r2.append(r3);	 Catch:{ all -> 0x0057 }
        r0 = r2.append(r0);	 Catch:{ all -> 0x0057 }
        r2 = ")";
        r0 = r0.append(r2);	 Catch:{ all -> 0x0057 }
        r0 = r0.toString();	 Catch:{ all -> 0x0057 }
        android.util.Log.e(r1, r0);	 Catch:{ all -> 0x0057 }
        r4.close();	 Catch:{ all -> 0x0057 }
    L_0x004b:
        super.finalize();
        return;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        super.finalize();
        throw r0;
    L_0x005c:
        r0 = r4.Lj;	 Catch:{ all -> 0x0057 }
        r0 = r0.toString();	 Catch:{ all -> 0x0057 }
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.finalize():void");
    }

    public Bundle gV() {
        return this.Lg;
    }

    public void gX() {
        int i = 0;
        boolean z = a.a;
        this.Le = new Bundle();
        int i2 = 0;
        while (i2 < this.Ld.length) {
            this.Le.putInt(this.Ld[i2], i2);
            i2++;
            if (z) {
                break;
            }
        }
        this.Lh = new int[this.Lf.length];
        i2 = 0;
        while (i < this.Lf.length) {
            this.Lh[i] = i2;
            i2 += this.Lf[i].getNumRows() - (i2 - this.Lf[i].getStartPosition());
            i++;
            if (z) {
                break;
            }
        }
        this.Li = i2;
    }

    String[] gY() {
        return this.Ld;
    }

    CursorWindow[] gZ() {
        return this.Lf;
    }

    public int getStatusCode() {
        return this.Iv;
    }

    int getVersionCode() {
        return this.CK;
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mClosed;
        }
        return z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
