package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.internal.ld;
import com.google.android.gms.internal.lf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class v implements c {
    private static final String ara;
    private final Executor arb;
    private a arc;
    private int ard;
    private final Context mContext;
    private ld wb;

    class AnonymousClass_1 implements Runnable {
        final List are;
        final long arf;
        final v arg;

        AnonymousClass_1(v vVar, List list, long j) {
            this.arg = vVar;
            this.are = list;
            this.arf = j;
        }

        public void run() {
            v.a(this.arg, this.are, this.arf);
        }
    }

    class AnonymousClass_2 implements Runnable {
        final v arg;
        final com.google.android.gms.tagmanager.DataLayer.c.a arh;

        AnonymousClass_2(v vVar, com.google.android.gms.tagmanager.DataLayer.c.a aVar) {
            this.arg = vVar;
            this.arh = aVar;
        }

        public void run() {
            this.arh.h(v.a(this.arg));
        }
    }

    class a extends SQLiteOpenHelper {
        final v arg;

        a(v vVar, Context context, String str) {
            this.arg = vVar;
            super(context, str, null, 1);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(android.database.sqlite.SQLiteDatabase r7) {
            /*
            r6_this = this;
            r1 = com.google.android.gms.tagmanager.DataLayer.a;
            r0 = "SELECT * FROM datalayer WHERE 0";
            r2 = 0;
            r2 = r7.rawQuery(r0, r2);
            r3 = new java.util.HashSet;
            r3.<init>();
            r4 = r2.getColumnNames();	 Catch:{ all -> 0x004c }
            r0 = 0;
        L_0x0013:
            r5 = r4.length;	 Catch:{ all -> 0x004c }
            if (r0 >= r5) goto L_0x001f;
        L_0x0016:
            r5 = r4[r0];	 Catch:{ all -> 0x004c }
            r3.add(r5);	 Catch:{ all -> 0x004c }
            r0 = r0 + 1;
            if (r1 == 0) goto L_0x0013;
        L_0x001f:
            r2.close();
            r0 = "key";
            r0 = r3.remove(r0);	 Catch:{ SQLiteException -> 0x0051 }
            if (r0 == 0) goto L_0x0042;
        L_0x002a:
            r0 = "value";
            r0 = r3.remove(r0);	 Catch:{ SQLiteException -> 0x0053 }
            if (r0 == 0) goto L_0x0042;
        L_0x0032:
            r0 = "ID";
            r0 = r3.remove(r0);	 Catch:{ SQLiteException -> 0x0055 }
            if (r0 == 0) goto L_0x0042;
        L_0x003a:
            r0 = "expires";
            r0 = r3.remove(r0);	 Catch:{ SQLiteException -> 0x004a }
            if (r0 != 0) goto L_0x0057;
        L_0x0042:
            r0 = new android.database.sqlite.SQLiteException;	 Catch:{ SQLiteException -> 0x004a }
            r1 = "Database column missing";
            r0.<init>(r1);	 Catch:{ SQLiteException -> 0x004a }
            throw r0;	 Catch:{ SQLiteException -> 0x004a }
        L_0x004a:
            r0 = move-exception;
            throw r0;
        L_0x004c:
            r0 = move-exception;
            r2.close();
            throw r0;
        L_0x0051:
            r0 = move-exception;
            throw r0;	 Catch:{ SQLiteException -> 0x0053 }
        L_0x0053:
            r0 = move-exception;
            throw r0;	 Catch:{ SQLiteException -> 0x0055 }
        L_0x0055:
            r0 = move-exception;
            throw r0;	 Catch:{ SQLiteException -> 0x004a }
        L_0x0057:
            r0 = r3.isEmpty();	 Catch:{ SQLiteException -> 0x0065 }
            if (r0 != 0) goto L_0x0067;
        L_0x005d:
            r0 = new android.database.sqlite.SQLiteException;	 Catch:{ SQLiteException -> 0x0065 }
            r1 = "Database has extra columns";
            r0.<init>(r1);	 Catch:{ SQLiteException -> 0x0065 }
            throw r0;	 Catch:{ SQLiteException -> 0x0065 }
        L_0x0065:
            r0 = move-exception;
            throw r0;
        L_0x0067:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.v.a.a(android.database.sqlite.SQLiteDatabase):void");
        }

        private boolean a(String str, SQLiteDatabase sQLiteDatabase) {
            Cursor cursor;
            Throwable th;
            Cursor cursor2 = null;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                try {
                    boolean moveToFirst = query.moveToFirst();
                    if (query == null) {
                        return moveToFirst;
                    }
                    try {
                        query.close();
                        return moveToFirst;
                    } catch (SQLiteException e) {
                        throw e;
                    }
                } catch (SQLiteException e2) {
                    cursor = query;
                    try {
                        bh.W("Error querying for table " + str);
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (SQLiteException e3) {
                                throw e3;
                            }
                        }
                        return false;
                    } catch (Throwable th2) {
                        cursor2 = cursor;
                        th = th2;
                        if (cursor2 != null) {
                            try {
                                cursor2.close();
                            } catch (SQLiteException e32) {
                                throw e32;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor2 = query;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                cursor = null;
                bh.W("Error querying for table " + str);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        }

        public SQLiteDatabase getWritableDatabase() {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = super.getWritableDatabase();
            } catch (SQLiteException e) {
                v.b(this.arg).getDatabasePath("google_tagmanager.db").delete();
            }
            return sQLiteDatabase == null ? super.getWritableDatabase() : sQLiteDatabase;
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            ak.ag(sQLiteDatabase.getPath());
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (VERSION.SDK_INT < 15) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
                try {
                    rawQuery.moveToFirst();
                } finally {
                    rawQuery.close();
                }
            }
            try {
                if (!a("datalayer", sQLiteDatabase)) {
                    sQLiteDatabase.execSQL(v.pD());
                    if (DataLayer.a == 0) {
                        return;
                    }
                }
                a(sQLiteDatabase);
            } catch (SQLiteException e) {
                throw e;
            } catch (SQLiteException e2) {
                throw e2;
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    class b {
        final String KP;
        final byte[] arj;

        b(String str, byte[] bArr) {
            this.KP = str;
            this.arj = bArr;
        }

        public String toString() {
            return "KeyAndSerialized: key = " + this.KP + " serialized hash = " + Arrays.hashCode(this.arj);
        }
    }

    static {
        ara = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[]{"datalayer", "ID", "key", "value", "expires"});
    }

    public v(Context context) {
        this(context, lf.if(), "google_tagmanager.db", 2000, Executors.newSingleThreadExecutor());
    }

    v(Context context, ld ldVar, String str, int i, Executor executor) {
        this.mContext = context;
        this.wb = ldVar;
        this.ard = i;
        this.arb = executor;
        this.arc = new a(this, this.mContext, str);
    }

    static List a(v vVar) {
        return vVar.pz();
    }

    static void a(v vVar, List list, long j) {
        vVar.b(list, j);
    }

    private SQLiteDatabase al(String str) {
        try {
            return this.arc.getWritableDatabase();
        } catch (SQLiteException e) {
            bh.W(str);
            return null;
        }
    }

    static Context b(v vVar) {
        return vVar.mContext;
    }

    private synchronized void b(List list, long j) {
        try {
            long currentTimeMillis = this.wb.currentTimeMillis();
            x(currentTimeMillis);
            fI(list.size());
            c(list, currentTimeMillis + j);
            pC();
        } catch (Throwable th) {
        }
    }

    private void c(List list, long j) {
        int i = DataLayer.a;
        SQLiteDatabase al = al("Error opening database for writeEntryToDatabase.");
        if (al != null) {
            for (b bVar : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("expires", Long.valueOf(j));
                contentValues.put("key", bVar.KP);
                contentValues.put("value", bVar.arj);
                al.insert("datalayer", null, contentValues);
                if (i != 0) {
                    return;
                }
            }
        }
    }

    private void fI(int i) {
        int pB = (pB() - this.ard) + i;
        if (pB > 0) {
            List fJ = fJ(pB);
            bh.U("DataLayer store full, deleting " + fJ.size() + " entries to make room.");
            h((String[]) fJ.toArray(new String[0]));
        }
    }

    private List fJ(int i) {
        Cursor query;
        Throwable th;
        List arrayList = new ArrayList();
        if (i <= 0) {
            try {
                bh.W("Invalid maxEntries specified. Skipping.");
                return arrayList;
            } catch (SQLiteException e) {
                SQLiteException e2;
                throw e2;
            }
        }
        SQLiteDatabase al = al("Error opening database for peekEntryIds.");
        if (al == null) {
            return arrayList;
        }
        try {
            query = al.query("datalayer", new String[]{"ID"}, null, null, null, null, String.format("%s ASC", new Object[]{"ID"}), Integer.toString(i));
            try {
                if (query.moveToFirst()) {
                    do {
                        arrayList.add(String.valueOf(query.getLong(0)));
                    } while (query.moveToNext());
                }
                if (query != null) {
                    try {
                        query.close();
                    } catch (SQLiteException e22) {
                        throw e22;
                    }
                }
            } catch (SQLiteException e222) {
                throw e222;
            } catch (SQLiteException e3) {
                e222 = e3;
            }
        } catch (SQLiteException e4) {
            e222 = e4;
            query = null;
            try {
                bh.W("Error in peekEntries fetching entryIds: " + e222.getMessage());
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (query != null) {
                    try {
                        query.close();
                    } catch (SQLiteException e2222) {
                        throw e2222;
                    }
                }
                throw th;
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
        return arrayList;
    }

    private void h(String[] strArr) {
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    SQLiteDatabase al = al("Error opening database for deleteEntries.");
                    if (al != null) {
                        try {
                            al.delete("datalayer", String.format("%s in (%s)", new Object[]{"ID", TextUtils.join(",", Collections.nCopies(strArr.length, "?"))}), strArr);
                        } catch (SQLiteException e) {
                            bh.W("Error deleting entries " + Arrays.toString(strArr));
                        }
                    }
                }
            } catch (SQLiteException e2) {
                throw e2;
            } catch (SQLiteException e22) {
                throw e22;
            }
        }
    }

    private List i(List list) {
        int i = DataLayer.a;
        List arrayList = new ArrayList();
        for (b bVar : list) {
            arrayList.add(new a(bVar.KP, j(bVar.arj)));
            if (i != 0) {
                break;
            }
        }
        return arrayList;
    }

    private java.lang.Object j(byte[] r6) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
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
        r5_this = this;
        r0 = 0;
        r2 = new java.io.ByteArrayInputStream;
        r2.<init>(r6);
        r1 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x001c, ClassNotFoundException -> 0x002b, all -> 0x003a }
        r1.<init>(r2);	 Catch:{ IOException -> 0x001c, ClassNotFoundException -> 0x002b, all -> 0x003a }
        r0 = r1.readObject();	 Catch:{ IOException -> 0x004f, ClassNotFoundException -> 0x004d, all -> 0x004b }
        if (r1 == 0) goto L_0x0014;
    L_0x0011:
        r1.close();	 Catch:{ IOException -> 0x0018 }
    L_0x0014:
        r2.close();	 Catch:{ IOException -> 0x001a }
    L_0x0017:
        return r0;	 Catch:{ IOException -> 0x001a }
    L_0x0018:
        r1 = move-exception;	 Catch:{ IOException -> 0x001a }
        throw r1;	 Catch:{ IOException -> 0x001a }
    L_0x001a:
        r1 = move-exception;
        goto L_0x0017;
    L_0x001c:
        r1 = move-exception;
        r1 = r0;
    L_0x001e:
        if (r1 == 0) goto L_0x0023;
    L_0x0020:
        r1.close();	 Catch:{ IOException -> 0x0029 }
    L_0x0023:
        r2.close();	 Catch:{ IOException -> 0x0027 }
        goto L_0x0017;	 Catch:{ IOException -> 0x0027 }
    L_0x0027:
        r1 = move-exception;	 Catch:{ IOException -> 0x0027 }
        goto L_0x0017;	 Catch:{ IOException -> 0x0027 }
    L_0x0029:
        r1 = move-exception;	 Catch:{ IOException -> 0x0027 }
        throw r1;	 Catch:{ IOException -> 0x0027 }
    L_0x002b:
        r1 = move-exception;
        r1 = r0;
    L_0x002d:
        if (r1 == 0) goto L_0x0032;
    L_0x002f:
        r1.close();	 Catch:{ IOException -> 0x0038 }
    L_0x0032:
        r2.close();	 Catch:{ IOException -> 0x0036 }
        goto L_0x0017;	 Catch:{ IOException -> 0x0036 }
    L_0x0036:
        r1 = move-exception;	 Catch:{ IOException -> 0x0036 }
        goto L_0x0017;	 Catch:{ IOException -> 0x0036 }
    L_0x0038:
        r1 = move-exception;	 Catch:{ IOException -> 0x0036 }
        throw r1;	 Catch:{ IOException -> 0x0036 }
    L_0x003a:
        r1 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
    L_0x003e:
        if (r1 == 0) goto L_0x0043;
    L_0x0040:
        r1.close();	 Catch:{ IOException -> 0x0047 }
    L_0x0043:
        r2.close();	 Catch:{ IOException -> 0x0049 }
    L_0x0046:
        throw r0;
    L_0x0047:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0049 }
    L_0x0049:
        r1 = move-exception;
        goto L_0x0046;
    L_0x004b:
        r0 = move-exception;
        goto L_0x003e;
    L_0x004d:
        r3 = move-exception;
        goto L_0x002d;
    L_0x004f:
        r3 = move-exception;
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.v.j(byte[]):java.lang.Object");
    }

    private List j(List list) {
        int i = DataLayer.a;
        List arrayList = new ArrayList();
        for (a aVar : list) {
            arrayList.add(new b(aVar.KP, m(aVar.wF)));
            if (i != 0) {
                break;
            }
        }
        return arrayList;
    }

    private byte[] m(java.lang.Object r6) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
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
        r5_this = this;
        r0 = 0;
        r2 = new java.io.ByteArrayOutputStream;
        r2.<init>();
        r1 = new java.io.ObjectOutputStream;	 Catch:{ IOException -> 0x001f, all -> 0x002e }
        r1.<init>(r2);	 Catch:{ IOException -> 0x001f, all -> 0x002e }
        r1.writeObject(r6);	 Catch:{ IOException -> 0x0041, all -> 0x003f }
        r0 = r2.toByteArray();	 Catch:{ IOException -> 0x0041, all -> 0x003f }
        if (r1 == 0) goto L_0x0017;
    L_0x0014:
        r1.close();	 Catch:{ IOException -> 0x001b }
    L_0x0017:
        r2.close();	 Catch:{ IOException -> 0x001d }
    L_0x001a:
        return r0;	 Catch:{ IOException -> 0x001d }
    L_0x001b:
        r1 = move-exception;	 Catch:{ IOException -> 0x001d }
        throw r1;	 Catch:{ IOException -> 0x001d }
    L_0x001d:
        r1 = move-exception;
        goto L_0x001a;
    L_0x001f:
        r1 = move-exception;
        r1 = r0;
    L_0x0021:
        if (r1 == 0) goto L_0x0026;
    L_0x0023:
        r1.close();	 Catch:{ IOException -> 0x002c }
    L_0x0026:
        r2.close();	 Catch:{ IOException -> 0x002a }
        goto L_0x001a;	 Catch:{ IOException -> 0x002a }
    L_0x002a:
        r1 = move-exception;	 Catch:{ IOException -> 0x002a }
        goto L_0x001a;	 Catch:{ IOException -> 0x002a }
    L_0x002c:
        r1 = move-exception;	 Catch:{ IOException -> 0x002a }
        throw r1;	 Catch:{ IOException -> 0x002a }
    L_0x002e:
        r1 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
    L_0x0032:
        if (r1 == 0) goto L_0x0037;
    L_0x0034:
        r1.close();	 Catch:{ IOException -> 0x003b }
    L_0x0037:
        r2.close();	 Catch:{ IOException -> 0x003d }
    L_0x003a:
        throw r0;
    L_0x003b:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x003d }
    L_0x003d:
        r1 = move-exception;
        goto L_0x003a;
    L_0x003f:
        r0 = move-exception;
        goto L_0x0032;
    L_0x0041:
        r3 = move-exception;
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.v.m(java.lang.Object):byte[]");
    }

    private List pA() {
        int i = DataLayer.a;
        SQLiteDatabase al = al("Error opening database for loadSerialized.");
        List arrayList = new ArrayList();
        if (al == null) {
            return arrayList;
        }
        Cursor query = al.query("datalayer", new String[]{"key", "value"}, null, null, null, null, "ID", null);
        do {
            try {
                if (!query.moveToNext()) {
                    break;
                }
                arrayList.add(new b(query.getString(0), query.getBlob(1)));
            } catch (Throwable th) {
                query.close();
            }
        } while (i == 0);
        query.close();
        return arrayList;
    }

    private int pB() {
        Cursor cursor = null;
        int i = 0;
        SQLiteDatabase al = al("Error opening database for getNumStoredEntries.");
        if (al != null) {
            try {
                cursor = al.rawQuery("SELECT COUNT(*) from datalayer", null);
                if (cursor.moveToFirst()) {
                    i = (int) cursor.getLong(0);
                }
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (SQLiteException e) {
                        throw e;
                    }
                }
            } catch (SQLiteException e2) {
                bh.W("Error getting numStoredEntries");
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (SQLiteException e3) {
                        throw e3;
                    }
                }
            }
        }
        return i;
    }

    private void pC() {
        try {
            this.arc.close();
        } catch (SQLiteException e) {
        }
    }

    static String pD() {
        return ara;
    }

    private List pz() {
        try {
            x(this.wb.currentTimeMillis());
            List i = i(pA());
            return i;
        } finally {
            pC();
        }
    }

    private void x(long j) {
        SQLiteDatabase al = al("Error opening database for deleteOlderThan.");
        if (al != null) {
            try {
                bh.V("Deleted " + al.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)}) + " expired items");
            } catch (SQLiteException e) {
                bh.W("Error deleting old entries.");
            }
        }
    }

    public void a(com.google.android.gms.tagmanager.DataLayer.c.a aVar) {
        this.arb.execute(new AnonymousClass_2(this, aVar));
    }

    public void a(List list, long j) {
        this.arb.execute(new AnonymousClass_1(this, j(list), j));
    }
}
