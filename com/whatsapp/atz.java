package com.whatsapp;

import android.content.Context;
import android.database.AbstractCursor;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class atz extends AbstractCursor {
    private static final String[] b;
    private final Context a;

    public String[] getColumnNames() {
        return b;
    }

    public boolean isNull(int i) {
        return false;
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
        r2 = "\u001b\u0000<";
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
        if (r7 > r8) goto L_0x002a;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x0047;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "\u001f\b5z";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x003b;
            case 1: goto L_0x003e;
            case 2: goto L_0x0041;
            case 3: goto L_0x0044;
            default: goto L_0x0031;
        };
    L_0x0031:
        r2 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
    L_0x0033:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x003b:
        r2 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        goto L_0x0033;
    L_0x003e:
        r2 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        goto L_0x0033;
    L_0x0041:
        r2 = 88;
        goto L_0x0033;
    L_0x0044:
        r2 = 31;
        goto L_0x0033;
    L_0x0047:
        r4[r3] = r2;
        b = r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.atz.<clinit>():void");
    }

    public double getDouble(int i) {
        return 0.0d;
    }

    public float getFloat(int i) {
        return 0.0f;
    }

    public long getLong(int i) {
        return 0;
    }

    public int getCount() {
        return v.a();
    }

    public int getInt(int i) {
        return 0;
    }

    public String getString(int i) {
        ArrayList b;
        int position;
        switch (i) {
            case PBE.MD5 /*0*/:
                b = v.b();
                position = getPosition();
                if (b.size() > position) {
                    return (String) b.get(position);
                }
                break;
            case ay.f /*1*/:
                break;
        }
        b = v.b();
        position = getPosition();
        if (b.size() > position) {
            return App.P.a((String) b.get(position)).a(this.a);
        }
        return "";
    }

    public short getShort(int i) {
        return (short) 0;
    }

    public atz(Context context) {
        this.a = context;
    }
}
