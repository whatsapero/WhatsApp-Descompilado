package com.whatsapp;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class MediaProvider extends ContentProvider {
    public static final Uri a;
    private static final UriMatcher b;
    private static final String[] z;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 20;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 40;
                    break;
                case ay.p /*3*/:
                    i2 = 9;
                    break;
                default:
                    i2 = 93;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 93);
        }
        return toCharArray;
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
        r5 = 3;
        r4 = 2;
        r3 = 1;
        r2 = 0;
        r1 = -1;
        r0 = 7;
        r6 = new java.lang.String[r0];
        r0 = "v\u001aKb8`&L";
        r7 = r2;
        r8 = r6;
        r9 = r6;
        r6 = r0;
        r0 = r1;
    L_0x000f:
        r6 = z(r6);
        r6 = z(r6);
        switch(r0) {
            case 0: goto L_0x0023;
            case 1: goto L_0x002c;
            case 2: goto L_0x0035;
            case 3: goto L_0x003f;
            case 4: goto L_0x0047;
            case 5: goto L_0x004f;
            default: goto L_0x001a;
        };
    L_0x001a:
        r8[r7] = r6;
        r0 = "A\u0001Cg2c\u0001\b\\\u000f]O";
        r6 = r0;
        r7 = r3;
        r8 = r9;
        r0 = r2;
        goto L_0x000f;
    L_0x0023:
        r8[r7] = r6;
        r0 = "}\u0001Ke(p\n";
        r6 = r0;
        r7 = r4;
        r8 = r9;
        r0 = r3;
        goto L_0x000f;
    L_0x002c:
        r8[r7] = r6;
        r0 = "b\u0006Ll2";
        r6 = r0;
        r7 = r5;
        r8 = r9;
        r0 = r4;
        goto L_0x000f;
    L_0x0035:
        r8[r7] = r6;
        r6 = 4;
        r0 = "b\u0001L'<z\u000bZf4pAK|/g\u0000Z'9}\u001d\u0007\u007f3pAKf0:\u0018@h)g\u000eXysd\u001dG\u007f4p\nZ'0q\u000bAhs}\u001bMd.";
        r7 = r6;
        r8 = r9;
        r6 = r0;
        r0 = r5;
        goto L_0x000f;
    L_0x003f:
        r8[r7] = r6;
        r7 = 5;
        r6 = "b\u0001L'<z\u000bZf4pAK|/g\u0000Z'9}\u001d\u0007\u007f3pAKf0:\u0018@h)g\u000eXysd\u001dG\u007f4p\nZ'0q\u000bAhsv\u001aKb8`\u001c";
        r0 = 4;
        r8 = r9;
        goto L_0x000f;
    L_0x0047:
        r8[r7] = r6;
        r7 = 6;
        r6 = "A\u0001Cg2c\u0001\b\\\u000f]O";
        r0 = 5;
        r8 = r9;
        goto L_0x000f;
    L_0x004f:
        r8[r7] = r6;
        z = r9;
        r0 = "w\u0000F}8z\u001b\u0012&rw\u0000E'*|\u000e\\z<d\u001f\u0006y/{\u0019Am8fAEl9}\u000e";
        r0 = z(r0);
        r0 = z(r0);
        r0 = android.net.Uri.parse(r0);
        a = r0;
        r0 = new android.content.UriMatcher;
        r0.<init>(r1);
        b = r0;
        r5 = b;
        r0 = "w\u0000E'*|\u000e\\z<d\u001f\u0006y/{\u0019Am8fAEl9}\u000e";
        r6 = r5;
        r5 = r0;
        r0 = r1;
    L_0x0071:
        r5 = z(r5);
        r7 = z(r5);
        switch(r0) {
            case 0: goto L_0x0096;
            default: goto L_0x007c;
        };
    L_0x007c:
        r0 = "v\u001aKb8`\u001c";
        r5 = r0;
        r0 = r1;
    L_0x0080:
        r5 = z(r5);
        r5 = z(r5);
        switch(r0) {
            case 0: goto L_0x009b;
            default: goto L_0x008b;
        };
    L_0x008b:
        r6.addURI(r7, r5, r3);
        r5 = b;
        r0 = "w\u0000E'*|\u000e\\z<d\u001f\u0006y/{\u0019Am8fAEl9}\u000e";
        r6 = r5;
        r5 = r0;
        r0 = r2;
        goto L_0x0071;
    L_0x0096:
        r0 = "}\u001bMd.";
        r5 = r0;
        r0 = r2;
        goto L_0x0080;
    L_0x009b:
        r6.addURI(r7, r5, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaProvider.<clinit>():void");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public boolean onCreate() {
        return true;
    }

    public String getType(Uri uri) {
        try {
            switch (b.match(uri)) {
                case ay.f /*1*/:
                    return z[5];
                case ay.n /*2*/:
                    return z[4];
                default:
                    throw new IllegalArgumentException(z[6] + uri);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        byte b = (byte) 3;
        try {
            switch (b.match(uri)) {
                case ay.f /*1*/:
                    return new atz(getContext());
                case ay.n /*2*/:
                    String queryParameter = uri.getQueryParameter(z[0]);
                    try {
                        if (!z[3].equals(uri.getQueryParameter(z[2]))) {
                            b = (byte) 1;
                        }
                        return new a1w(queryParameter, App.aJ.a(queryParameter, b));
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                default:
                    throw new IllegalArgumentException(z[1] + uri);
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
        throw e2;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
