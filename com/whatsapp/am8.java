package com.whatsapp;

import android.os.AsyncTask;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class am8 extends AsyncTask {
    private static final String[] z;
    final l7 a;
    final ArrayList b;

    static {
        String[] strArr = new String[4];
        String str = "p\\`Q;wZ\u007f@\u0017wR\u007fU";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 3;
                        break;
                    case ay.f /*1*/:
                        i3 = 51;
                        break;
                    case ay.n /*2*/:
                        i3 = 18;
                        break;
                    case ay.p /*3*/:
                        i3 = 37;
                        break;
                    default:
                        i3 = 100;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "hVkz\u0016f^}Q\u0001\\Y{AY<";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "`[sQ;oZaQ";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "n@uV\u0010lAw\n\nfVvP\u0014gRf@\u0017lAfQ\rnVaQ\u0005nC\u007f@\u0017pRu@\u0017,W}K\u0001";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.Void a(java.lang.Void[] r11) {
        /*
        r10_this = this;
        r2 = 0;
        r3 = com.whatsapp.m3.d;
        r0 = r10.a;
        r4 = com.whatsapp.l7.f(r0);
        monitor-enter(r4);
        r0 = r10.a;	 Catch:{ SQLiteException -> 0x0073, all -> 0x0086 }
        r0 = com.whatsapp.l7.f(r0);	 Catch:{ SQLiteException -> 0x0073, all -> 0x0086 }
        r1 = r0.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0073, all -> 0x0086 }
        r1.beginTransaction();	 Catch:{ SQLiteException -> 0x009a }
        r0 = r10.b;	 Catch:{ SQLiteException -> 0x009a }
        r5 = r0.iterator();	 Catch:{ SQLiteException -> 0x009a }
    L_0x001d:
        r0 = r5.hasNext();	 Catch:{ SQLiteException -> 0x009a }
        if (r0 == 0) goto L_0x0056;
    L_0x0023:
        r0 = r5.next();	 Catch:{ SQLiteException -> 0x009a }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ SQLiteException -> 0x009a }
        r6 = new android.content.ContentValues;	 Catch:{ SQLiteException -> 0x009a }
        r7 = 1;
        r6.<init>(r7);	 Catch:{ SQLiteException -> 0x009a }
        r7 = z;	 Catch:{ SQLiteException -> 0x009a }
        r8 = 0;
        r7 = r7[r8];	 Catch:{ SQLiteException -> 0x009a }
        r8 = r0.D;	 Catch:{ SQLiteException -> 0x009a }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ SQLiteException -> 0x009a }
        r6.put(r7, r8);	 Catch:{ SQLiteException -> 0x009a }
        r7 = 1;
        r7 = new java.lang.String[r7];	 Catch:{ SQLiteException -> 0x009a }
        r8 = 0;
        r0 = r0.e;	 Catch:{ SQLiteException -> 0x009a }
        r0 = r0.c;	 Catch:{ SQLiteException -> 0x009a }
        r7[r8] = r0;	 Catch:{ SQLiteException -> 0x009a }
        r0 = z;	 Catch:{ SQLiteException -> 0x009a }
        r8 = 3;
        r0 = r0[r8];	 Catch:{ SQLiteException -> 0x009a }
        r8 = z;	 Catch:{ SQLiteException -> 0x009a }
        r9 = 2;
        r8 = r8[r9];	 Catch:{ SQLiteException -> 0x009a }
        r1.update(r0, r6, r8, r7);	 Catch:{ SQLiteException -> 0x009a }
        if (r3 == 0) goto L_0x001d;
    L_0x0056:
        r1.setTransactionSuccessful();	 Catch:{ SQLiteException -> 0x009a }
        if (r1 == 0) goto L_0x0064;
    L_0x005b:
        r0 = r1.inTransaction();	 Catch:{ SQLiteException -> 0x006e }
        if (r0 == 0) goto L_0x0064;
    L_0x0061:
        r1.endTransaction();	 Catch:{ SQLiteException -> 0x006e }
    L_0x0064:
        r0 = z;	 Catch:{ all -> 0x0070 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ all -> 0x0070 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x0070 }
        monitor-exit(r4);	 Catch:{ all -> 0x0070 }
        return r2;
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0070 }
        throw r0;
    L_0x0073:
        r0 = move-exception;
        r1 = r2;
    L_0x0075:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0098 }
        if (r1 == 0) goto L_0x0064;
    L_0x007a:
        r0 = r1.inTransaction();	 Catch:{ SQLiteException -> 0x0084 }
        if (r0 == 0) goto L_0x0064;
    L_0x0080:
        r1.endTransaction();	 Catch:{ SQLiteException -> 0x0084 }
        goto L_0x0064;
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0070 }
    L_0x0086:
        r0 = move-exception;
        r1 = r2;
    L_0x0088:
        if (r1 == 0) goto L_0x0093;
    L_0x008a:
        r2 = r1.inTransaction();	 Catch:{ SQLiteException -> 0x0094 }
        if (r2 == 0) goto L_0x0093;
    L_0x0090:
        r1.endTransaction();	 Catch:{ SQLiteException -> 0x0096 }
    L_0x0093:
        throw r0;	 Catch:{ all -> 0x0070 }
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0070 }
    L_0x0098:
        r0 = move-exception;
        goto L_0x0088;
    L_0x009a:
        r0 = move-exception;
        goto L_0x0075;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.am8.a(java.lang.Void[]):java.lang.Void");
    }

    am8(l7 l7Var, ArrayList arrayList) {
        this.a = l7Var;
        this.b = arrayList;
    }
}
