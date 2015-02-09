package com.tonicartos.widget.stickygridheaders;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class o extends BaseSavedState {
    public static final Creator CREATOR;
    private static final String[] z;
    boolean a;

    public String toString() {
        return z[0] + Integer.toHexString(System.identityHashCode(this)) + z[1] + this.a + "}";
    }

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
        r2 = "\u001a}]vt0NF|{\u0001lUqz;zsgv-_]phgZUcz-Z@tk,r";
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
        if (r7 > r8) goto L_0x0036;
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
        r0 = "ihFpW,hPpm:Z@||\"p\t";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        r0 = new com.tonicartos.widget.stickygridheaders.k;
        r0.<init>();
        CREATOR = r0;
        return;
    L_0x0036:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0047;
            case 1: goto L_0x004a;
            case 2: goto L_0x004d;
            case 3: goto L_0x0050;
            default: goto L_0x003d;
        };
    L_0x003d:
        r2 = 31;
    L_0x003f:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0047:
        r2 = 73;
        goto L_0x003f;
    L_0x004a:
        r2 = 9;
        goto L_0x003f;
    L_0x004d:
        r2 = 52;
        goto L_0x003f;
    L_0x0050:
        r2 = 21;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonicartos.widget.stickygridheaders.o.<clinit>():void");
    }

    o(Parcel parcel, r rVar) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        super.writeToParcel(parcel, i);
        if (this.a) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
    }

    public o(Parcelable parcelable) {
        super(parcelable);
    }

    private o(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() != null;
    }
}
