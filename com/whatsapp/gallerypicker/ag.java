package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;

public class ag extends aq {
    public static final Uri i;
    static final String[] j;
    private static final String z;

    public void b(ContentObserver contentObserver) {
        if (this.e != null) {
            this.e.unregisterContentObserver(contentObserver);
        }
    }

    public ag(ContentResolver contentResolver, int i, String str) {
        super(contentResolver, i, i, str);
    }

    public HashMap c() {
        return new HashMap();
    }

    protected Cursor c() {
        return this.b.query(this.d.buildUpon().appendQueryParameter(z, this.f).build(), j, null, null, a());
    }

    protected aw a(Cursor cursor) {
        return new e(this, this.b, cursor.getString(1), cursor.getLong(2));
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
        r6 = 3;
        r5 = 2;
        r4 = 1;
        r1 = -1;
        r2 = 0;
        r0 = "0|!J\u0018&@&";
        r3 = r0;
        r0 = r1;
    L_0x0009:
        r3 = r3.toCharArray();
        r7 = r3.length;
        r8 = r7;
        r9 = r2;
        r7 = r3;
    L_0x0011:
        if (r8 > r9) goto L_0x006f;
    L_0x0013:
        r3 = new java.lang.String;
        r3.<init>(r7);
        r3 = r3.intern();
        switch(r0) {
            case 0: goto L_0x0026;
            default: goto L_0x001f;
        };
    L_0x001f:
        z = r3;
        r0 = "1f,U\u0018<}x\u000eR1f/\u000f\n:h6R\u001c\"ylQ\u000f=\u007f+E\u0018 '/D\u0019;hmH\t7d1";
        r3 = r0;
        r0 = r2;
        goto L_0x0009;
    L_0x0026:
        r0 = android.net.Uri.parse(r3);
        i = r0;
        r0 = 5;
        r3 = new java.lang.String[r0];
        r0 = "\r`&";
        r7 = r3;
        r8 = r3;
        r3 = r2;
    L_0x0034:
        r0 = r0.toCharArray();
        r9 = r0.length;
        r10 = r9;
        r11 = r2;
        r9 = r0;
    L_0x003c:
        if (r10 > r11) goto L_0x0052;
    L_0x003e:
        r0 = new java.lang.String;
        r0.<init>(r9);
        r0 = r0.intern();
        switch(r1) {
            case 0: goto L_0x008c;
            case 1: goto L_0x0094;
            case 2: goto L_0x009c;
            case 3: goto L_0x00a5;
            default: goto L_0x004a;
        };
    L_0x004a:
        r7[r3] = r0;
        r0 = "\rm#U\u001c";
        r1 = r2;
        r3 = r4;
        r7 = r8;
        goto L_0x0034;
    L_0x0052:
        r12 = r9[r11];
        r0 = r11 % 5;
        switch(r0) {
            case 0: goto L_0x0063;
            case 1: goto L_0x0066;
            case 2: goto L_0x0069;
            case 3: goto L_0x006c;
            default: goto L_0x0059;
        };
    L_0x0059:
        r0 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
    L_0x005b:
        r0 = r0 ^ r12;
        r0 = (char) r0;
        r9[r11] = r0;
        r0 = r11 + 1;
        r11 = r0;
        goto L_0x003c;
    L_0x0063:
        r0 = 82;
        goto L_0x005b;
    L_0x0066:
        r0 = 9;
        goto L_0x005b;
    L_0x0069:
        r0 = 66;
        goto L_0x005b;
    L_0x006c:
        r0 = 33;
        goto L_0x005b;
    L_0x006f:
        r10 = r7[r9];
        r3 = r9 % 5;
        switch(r3) {
            case 0: goto L_0x0080;
            case 1: goto L_0x0083;
            case 2: goto L_0x0086;
            case 3: goto L_0x0089;
            default: goto L_0x0076;
        };
    L_0x0076:
        r3 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
    L_0x0078:
        r3 = r3 ^ r10;
        r3 = (char) r3;
        r7[r9] = r3;
        r3 = r9 + 1;
        r9 = r3;
        goto L_0x0011;
    L_0x0080:
        r3 = 82;
        goto L_0x0078;
    L_0x0083:
        r3 = 9;
        goto L_0x0078;
    L_0x0086:
        r3 = 66;
        goto L_0x0078;
    L_0x0089:
        r3 = 33;
        goto L_0x0078;
    L_0x008c:
        r7[r3] = r0;
        r0 = "6h6D\t3b'O";
        r1 = r4;
        r3 = r5;
        r7 = r8;
        goto L_0x0034;
    L_0x0094:
        r7[r3] = r0;
        r0 = "&`6M\u0018";
        r1 = r5;
        r3 = r6;
        r7 = r8;
        goto L_0x0034;
    L_0x009c:
        r7[r3] = r0;
        r1 = 4;
        r0 = "?`/D\"&p2D";
        r3 = r1;
        r7 = r8;
        r1 = r6;
        goto L_0x0034;
    L_0x00a5:
        r7[r3] = r0;
        j = r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ag.<clinit>():void");
    }

    public void a(ContentObserver contentObserver) {
        if (this.e != null) {
            this.e.registerContentObserver(contentObserver);
        }
    }

    public void d() {
        b();
    }
}
