package com.whatsapp;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.actionbarsherlock.R;
import com.whatsapp.fieldstats.al;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.f;
import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;
import com.whatsapp.util.aq;
import com.whatsapp.util.at;
import com.whatsapp.util.bp;
import com.whatsapp.util.c;
import com.whatsapp.util.u;
import com.whatsapp.util.y;
import java.io.File;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class l7 {
    private static final String G;
    private static final String M;
    private static final String P;
    private static final File Q;
    private static final String[] U;
    private static final String c;
    private static final String j;
    private SQLiteStatement A;
    private final File B;
    private final List C;
    private final a1t D;
    private SQLiteStatement E;
    private SQLiteStatement F;
    private final File H;
    private SQLiteStatement I;
    private final Context J;
    private final a10 K;
    private boolean L;
    private SQLiteStatement N;
    private boolean O;
    private HashMap R;
    private final u S;
    private SQLiteStatement T;
    private SQLiteStatement a;
    private final ConcurrentHashMap b;
    private final u d;
    private final Hashtable e;
    private final File f;
    private boolean g;
    private SQLiteStatement h;
    private final wv i;
    private SQLiteStatement k;
    private SQLiteStatement l;
    private final File m;
    private final File n;
    @SuppressLint({"HandlerLeak"})
    private final Handler o;
    private int p;
    @SuppressLint({"HandlerLeak"})
    private final Handler q;
    private boolean r;
    private final File s;
    private SQLiteStatement t;
    private final File u;
    private SQLiteStatement v;
    @SuppressLint({"HandlerLeak"})
    private final Handler w;
    private final File x;
    private final o8 y;
    private final File z;

    public boolean t(String str) {
        boolean z = true;
        String[] strArr = new String[]{str};
        synchronized (this.i) {
            Cursor rawQuery = this.i.getReadableDatabase().rawQuery(U[391], strArr);
            if (rawQuery != null) {
                try {
                    if (rawQuery.getCount() != 1) {
                        z = false;
                    }
                    rawQuery.close();
                    return z;
                } catch (IllegalStateException e) {
                    throw e;
                } catch (Throwable th) {
                    rawQuery.close();
                }
            } else {
                return false;
            }
        }
    }

    public b b(String str, int i) {
        b bVar = null;
        if (str != null && i >= 0) {
            Cursor rawQuery;
            String str2 = U[128] + i;
            String[] strArr = new String[]{str};
            synchronized (this.i) {
                rawQuery = this.i.getReadableDatabase().rawQuery(str2, strArr);
            }
            if (rawQuery == null) {
                try {
                    Log.i(U[129] + str + " " + i);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            if (rawQuery.moveToLast()) {
                bVar = a(rawQuery, str);
            } else {
                Log.w(U[130] + str + " " + i);
            }
            rawQuery.close();
        }
        return bVar;
    }

    private void a(FileChannel fileChannel, WritableByteChannel writableByteChannel, int i, int i2) {
        int i3 = m3.d;
        long j = 0;
        long j2 = 0;
        while (j < fileChannel.size()) {
            long transferTo = j2 + fileChannel.transferTo(j, Math.min(131072, fileChannel.size() - j), writableByteChannel);
            try {
                if (this.i.a != null && i2 > 0) {
                    this.i.a.a(transferTo, fileChannel.size(), i, i2);
                }
                j += 131072;
                if (i3 == 0) {
                    j2 = transferTo;
                } else {
                    return;
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        try {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File v(java.lang.String r8) {
        /*
        r7_this = this;
        r1 = 0;
        r3 = com.whatsapp.m3.d;
        r4 = r7.i;
        monitor-enter(r4);
        r0 = r7.i;	 Catch:{ all -> 0x0073 }
        com.whatsapp.wv.a(r0);	 Catch:{ all -> 0x0073 }
        r0 = r7.i;	 Catch:{ all -> 0x0073 }
        r0 = r0.getReadableDatabase();	 Catch:{ all -> 0x0073 }
        r2 = U;	 Catch:{ all -> 0x0073 }
        r5 = 483; // 0x1e3 float:6.77E-43 double:2.386E-321;
        r2 = r2[r5];	 Catch:{ all -> 0x0073 }
        r5 = 1;
        r5 = new java.lang.String[r5];	 Catch:{ all -> 0x0073 }
        r6 = 0;
        r5[r6] = r8;	 Catch:{ all -> 0x0073 }
        r5 = r0.rawQuery(r2, r5);	 Catch:{ all -> 0x0073 }
        if (r5 == 0) goto L_0x0087;
    L_0x0023:
        r0 = r5.moveToNext();	 Catch:{ IOException -> 0x0060 }
        if (r0 == 0) goto L_0x0090;
    L_0x0029:
        r0 = 0;
        r0 = r5.getBlob(r0);	 Catch:{ SQLiteDiskIOException -> 0x0062 }
        if (r0 == 0) goto L_0x0085;
    L_0x0030:
        r2 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x00cd, ClassNotFoundException -> 0x00c8, all -> 0x00b3 }
        r6 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x00cd, ClassNotFoundException -> 0x00c8, all -> 0x00b3 }
        r6.<init>(r0);	 Catch:{ IOException -> 0x00cd, ClassNotFoundException -> 0x00c8, all -> 0x00b3 }
        r2.<init>(r6);	 Catch:{ IOException -> 0x00cd, ClassNotFoundException -> 0x00c8, all -> 0x00b3 }
        r0 = r2.readObject();	 Catch:{ IOException -> 0x007c, ClassNotFoundException -> 0x00cb }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IOException -> 0x007c, ClassNotFoundException -> 0x00cb }
        if (r0 == 0) goto L_0x00a1;
    L_0x0042:
        r6 = r0.transferred;	 Catch:{ IOException -> 0x0076, ClassNotFoundException -> 0x00cb }
        if (r6 == 0) goto L_0x00a1;
    L_0x0046:
        r6 = r0.file;	 Catch:{ IOException -> 0x0078, ClassNotFoundException -> 0x00cb }
        if (r6 == 0) goto L_0x00a1;
    L_0x004a:
        r6 = r0.file;	 Catch:{ IOException -> 0x007a, ClassNotFoundException -> 0x00cb }
        r6 = r6.exists();	 Catch:{ IOException -> 0x007a, ClassNotFoundException -> 0x00cb }
        if (r6 == 0) goto L_0x00a1;
    L_0x0052:
        r0 = r0.file;	 Catch:{ IOException -> 0x007c, ClassNotFoundException -> 0x00cb }
        if (r2 == 0) goto L_0x0059;
    L_0x0056:
        r2.close();	 Catch:{ IOException -> 0x009a, ClassNotFoundException -> 0x0098 }
    L_0x0059:
        if (r5 == 0) goto L_0x005e;
    L_0x005b:
        r5.close();	 Catch:{ IOException -> 0x009f }
    L_0x005e:
        monitor-exit(r4);	 Catch:{ all -> 0x0073 }
    L_0x005f:
        return r0;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        r1 = com.whatsapp.App.p;	 Catch:{ all -> 0x006c }
        r2 = 2131624284; // 0x7f0e015c float:1.8875743E38 double:1.0531623286E-314;
        com.whatsapp.util.aq.a(r1, r2);	 Catch:{ all -> 0x006c }
        throw r0;	 Catch:{ all -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        if (r5 == 0) goto L_0x0072;
    L_0x006f:
        r5.close();	 Catch:{ IOException -> 0x00c4 }
    L_0x0072:
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0073 }
        throw r0;
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0078, ClassNotFoundException -> 0x00cb }
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x007a, ClassNotFoundException -> 0x00cb }
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x007c, ClassNotFoundException -> 0x00cb }
    L_0x007c:
        r0 = move-exception;
    L_0x007d:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x00c6 }
        if (r2 == 0) goto L_0x0085;
    L_0x0082:
        r2.close();	 Catch:{ IOException -> 0x00ae }
    L_0x0085:
        if (r3 == 0) goto L_0x0023;
    L_0x0087:
        r0 = U;	 Catch:{ SQLiteDiskIOException -> 0x0062 }
        r2 = 484; // 0x1e4 float:6.78E-43 double:2.39E-321;
        r0 = r0[r2];	 Catch:{ SQLiteDiskIOException -> 0x0062 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SQLiteDiskIOException -> 0x0062 }
    L_0x0090:
        if (r5 == 0) goto L_0x0095;
    L_0x0092:
        r5.close();	 Catch:{ IOException -> 0x00c2 }
    L_0x0095:
        monitor-exit(r4);	 Catch:{ all -> 0x0073 }
        r0 = r1;
        goto L_0x005f;
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0062 }
    L_0x009a:
        r1 = move-exception;
        com.whatsapp.util.Log.c(r1);	 Catch:{ SQLiteDiskIOException -> 0x0062 }
        goto L_0x0059;
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x00a1:
        if (r2 == 0) goto L_0x0085;
    L_0x00a3:
        r2.close();	 Catch:{ IOException -> 0x00a7, ClassNotFoundException -> 0x00ac }
        goto L_0x0085;
    L_0x00a7:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ SQLiteDiskIOException -> 0x0062 }
        goto L_0x0085;
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0062 }
    L_0x00ae:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ SQLiteDiskIOException -> 0x0062 }
        goto L_0x0085;
    L_0x00b3:
        r0 = move-exception;
        r2 = r1;
    L_0x00b5:
        if (r2 == 0) goto L_0x00ba;
    L_0x00b7:
        r2.close();	 Catch:{ IOException -> 0x00bd, ClassNotFoundException -> 0x00bb }
    L_0x00ba:
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0062 }
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0062 }
    L_0x00bd:
        r1 = move-exception;
        com.whatsapp.util.Log.c(r1);	 Catch:{ SQLiteDiskIOException -> 0x0062 }
        goto L_0x00ba;
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x00c6:
        r0 = move-exception;
        goto L_0x00b5;
    L_0x00c8:
        r0 = move-exception;
        r2 = r1;
        goto L_0x007d;
    L_0x00cb:
        r0 = move-exception;
        goto L_0x007d;
    L_0x00cd:
        r0 = move-exception;
        r2 = r1;
        goto L_0x007d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.v(java.lang.String):java.io.File");
    }

    public void g() {
        synchronized (this.i) {
            this.g = false;
            this.O = false;
            this.r = false;
            this.b.clear();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList c(boolean r13) {
        /*
        r12_this = this;
        r1 = com.whatsapp.m3.d;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r4 = java.lang.System.currentTimeMillis();
        r6 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r4 = r4 - r6;
        r0 = r12.i;
        r0 = r0.getReadableDatabase();
        r3 = G;
        r6 = 2;
        r6 = new java.lang.String[r6];
        r7 = 0;
        r8 = 4;
        r8 = java.lang.String.valueOf(r8);
        r6[r7] = r8;
        r7 = 1;
        r4 = java.lang.String.valueOf(r4);
        r6[r7] = r4;
        r3 = r0.rawQuery(r3, r6);
        if (r3 == 0) goto L_0x00a7;
    L_0x002f:
        r0 = U;
        r4 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r0 = r0[r4];
        r4 = r3.getColumnIndex(r0);
    L_0x0039:
        r0 = r3.moveToNext();	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r0 == 0) goto L_0x00a4;
    L_0x003f:
        r0 = r3.getString(r4);	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r0 != 0) goto L_0x0050;
    L_0x0045:
        r5 = U;	 Catch:{ IllegalStateException -> 0x00d0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = 95;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x00d0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        com.whatsapp.util.Log.w(r5);	 Catch:{ IllegalStateException -> 0x00d0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r1 == 0) goto L_0x0039;
    L_0x0050:
        r5 = r12.a(r3, r0);	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r5.j;	 Catch:{ IllegalStateException -> 0x035a, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        switch(r0) {
            case 1: goto L_0x02d8;
            case 2: goto L_0x0125;
            case 3: goto L_0x01f9;
            case 4: goto L_0x0059;
            case 5: goto L_0x00f5;
            case 6: goto L_0x0059;
            case 7: goto L_0x0338;
            case 8: goto L_0x0318;
            default: goto L_0x0059;
        };
    L_0x0059:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.e;	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.a;	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = " ";
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.j;	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r5.a;	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = 7;
        if (r0 != r6) goto L_0x0094;
    L_0x0088:
        r0 = r5.e;	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.c;	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = "-";
        r0 = r0.contains(r6);	 Catch:{ IllegalStateException -> 0x03a2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r0 != 0) goto L_0x0099;
    L_0x0094:
        r2.add(r5);	 Catch:{ IllegalStateException -> 0x03a4, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r1 == 0) goto L_0x00a2;
    L_0x0099:
        r0 = U;	 Catch:{ IllegalStateException -> 0x03a6, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r5 = 97;
        r0 = r0[r5];	 Catch:{ IllegalStateException -> 0x03a6, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x03a6, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x00a2:
        if (r1 == 0) goto L_0x0039;
    L_0x00a4:
        r3.close();
    L_0x00a7:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = U;
        r3 = 89;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r2.size();
        r0 = r0.append(r1);
        r1 = " ";
        r0 = r0.append(r1);
        r0 = r0.append(r13);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return r2;
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x00d2:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x036a }
        r1.<init>();	 Catch:{ all -> 0x036a }
        r4 = U;	 Catch:{ all -> 0x036a }
        r5 = 96;
        r4 = r4[r5];	 Catch:{ all -> 0x036a }
        r1 = r1.append(r4);	 Catch:{ all -> 0x036a }
        r0 = r0.toString();	 Catch:{ all -> 0x036a }
        r0 = r1.append(r0);	 Catch:{ all -> 0x036a }
        r0 = r0.toString();	 Catch:{ all -> 0x036a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x036a }
        r3.close();
        goto L_0x00a7;
    L_0x00f5:
        r6 = r5.K;	 Catch:{ IllegalStateException -> 0x035a, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r8 = 0;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 != 0) goto L_0x0059;
    L_0x00fd:
        r6 = r5.G;	 Catch:{ IllegalStateException -> 0x035c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r8 = 0;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 != 0) goto L_0x0059;
    L_0x0105:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x035e, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x035e, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x035e, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = 98;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x035e, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x035e, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.e;	 Catch:{ IllegalStateException -> 0x035e, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.a;	 Catch:{ IllegalStateException -> 0x035e, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x035e, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x035e, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x035e, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r1 == 0) goto L_0x0039;
    L_0x0125:
        if (r13 != 0) goto L_0x01b7;
    L_0x0127:
        r0 = r5.a;	 Catch:{ IllegalStateException -> 0x036f, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = 2;
        r0 = com.whatsapp.protocol.f.a(r0, r6);	 Catch:{ IllegalStateException -> 0x036f, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r0 >= 0) goto L_0x0170;
    L_0x0130:
        r0 = r5.w;	 Catch:{ IllegalStateException -> 0x0371, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = 1;
        if (r0 == r6) goto L_0x0170;
    L_0x0135:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0373, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0373, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x0373, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = 92;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x0373, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0373, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.e;	 Catch:{ IllegalStateException -> 0x0373, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.a;	 Catch:{ IllegalStateException -> 0x0373, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0373, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = " ";
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0373, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.j;	 Catch:{ IllegalStateException -> 0x0373, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0373, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = " ";
        r6 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0373, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r5.A;	 Catch:{ IllegalStateException -> 0x0373, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r0 == 0) goto L_0x037e;
    L_0x0162:
        r0 = 1;
    L_0x0163:
        r0 = r6.append(r0);	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r1 == 0) goto L_0x0039;
    L_0x0170:
        r0 = r5.w;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = 1;
        if (r0 != r6) goto L_0x0059;
    L_0x0175:
        r0 = r5.A;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r0 == 0) goto L_0x01b5;
    L_0x017b:
        r0 = r0.autodownloadRetryEnabled;	 Catch:{ IllegalStateException -> 0x0381, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r0 != 0) goto L_0x01b5;
    L_0x017f:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = 93;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.e;	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.a;	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = " ";
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.j;	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = 87;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r1 == 0) goto L_0x0039;
    L_0x01b5:
        if (r1 == 0) goto L_0x0059;
    L_0x01b7:
        r0 = r5.A;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r0 == 0) goto L_0x01f7;
    L_0x01bd:
        r0 = r0.autodownloadRetryEnabled;	 Catch:{ IllegalStateException -> 0x0385, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r0 != 0) goto L_0x01f7;
    L_0x01c1:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.e;	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.a;	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = " ";
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.j;	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r1 == 0) goto L_0x0039;
    L_0x01f7:
        if (r1 == 0) goto L_0x0059;
    L_0x01f9:
        if (r13 != 0) goto L_0x023f;
    L_0x01fb:
        r0 = r5.a;	 Catch:{ IllegalStateException -> 0x0389, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = 2;
        r0 = com.whatsapp.protocol.f.a(r0, r6);	 Catch:{ IllegalStateException -> 0x0389, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r0 >= 0) goto L_0x0059;
    L_0x0204:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x038b, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x038b, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x038b, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = 94;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x038b, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x038b, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.e;	 Catch:{ IllegalStateException -> 0x038b, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.a;	 Catch:{ IllegalStateException -> 0x038b, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x038b, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = " ";
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x038b, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.j;	 Catch:{ IllegalStateException -> 0x038b, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x038b, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = " ";
        r6 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x038b, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r5.A;	 Catch:{ IllegalStateException -> 0x038b, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r0 == 0) goto L_0x038f;
    L_0x0231:
        r0 = 1;
    L_0x0232:
        r0 = r6.append(r0);	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r1 == 0) goto L_0x0039;
    L_0x023f:
        r0 = r5.A;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r0 == 0) goto L_0x027f;
    L_0x0245:
        r6 = r0.autodownloadRetryEnabled;	 Catch:{ IllegalStateException -> 0x0392, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r6 != 0) goto L_0x027f;
    L_0x0249:
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = U;	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r8 = 100;
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = r5.e;	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = r7.a;	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = " ";
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = r5.j;	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = U;	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r8 = 99;
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r1 == 0) goto L_0x0039;
    L_0x027f:
        r6 = r0.transcoded;	 Catch:{ IllegalStateException -> 0x0396, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r6 != 0) goto L_0x02d6;
    L_0x0283:
        r6 = r5.k;	 Catch:{ IllegalStateException -> 0x0396, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r8 = com.whatsapp.ge.k;	 Catch:{ IllegalStateException -> 0x0396, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r8 = (long) r8;
        r10 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r8 = r8 * r10;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 > 0) goto L_0x02a0;
    L_0x0290:
        r6 = r0.trimFrom;	 Catch:{ IllegalStateException -> 0x0398, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r8 = 0;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 > 0) goto L_0x02a0;
    L_0x0298:
        r6 = r0.trimTo;	 Catch:{ IllegalStateException -> 0x039a, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r8 = 0;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x02d6;
    L_0x02a0:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = 88;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.e;	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.a;	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = " ";
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.j;	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = 86;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r1 == 0) goto L_0x0039;
    L_0x02d6:
        if (r1 == 0) goto L_0x0059;
    L_0x02d8:
        r0 = r5.A;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r0 == 0) goto L_0x0059;
    L_0x02de:
        r0 = r0.autodownloadRetryEnabled;	 Catch:{ IllegalStateException -> 0x039e, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r0 != 0) goto L_0x0059;
    L_0x02e2:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = 91;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.e;	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.a;	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = " ";
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.j;	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = 90;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r1 == 0) goto L_0x0039;
    L_0x0318:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.e;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.a;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r1 == 0) goto L_0x0039;
    L_0x0338:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r7 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r5.e;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r6 = r6.a;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.append(r6);	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        if (r1 == 0) goto L_0x0039;
    L_0x0358:
        goto L_0x0059;
    L_0x035a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x035c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x035c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x035e, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x035e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x0360:
        r0 = move-exception;
        r12.L();	 Catch:{ all -> 0x036a }
        r1 = new java.lang.AssertionError;	 Catch:{ all -> 0x036a }
        r1.<init>(r0);	 Catch:{ all -> 0x036a }
        throw r1;	 Catch:{ all -> 0x036a }
    L_0x036a:
        r0 = move-exception;
        r3.close();
        throw r0;
    L_0x036f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0371, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x0371:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0373, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x0373:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0375, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x0375:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x0377:
        r0 = move-exception;
        r1 = com.whatsapp.App.p;	 Catch:{ all -> 0x036a }
        com.whatsapp.util.aq.a(r1);	 Catch:{ all -> 0x036a }
        throw r0;	 Catch:{ all -> 0x036a }
    L_0x037e:
        r0 = 0;
        goto L_0x0163;
    L_0x0381:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0383, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x0383:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x0385:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0387, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x0387:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x0389:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x038b, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x038b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x038d, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x038d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x038f:
        r0 = 0;
        goto L_0x0232;
    L_0x0392:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0394, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x0394:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x0396:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0398, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x0398:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x039a, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x039a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x039c, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x039c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x039e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x03a0, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x03a0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x03a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x03a4, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x03a4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x03a6, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
    L_0x03a6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d2, SQLiteDatabaseCorruptException -> 0x0360, SQLiteFullException -> 0x0377 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.c(boolean):java.util.ArrayList");
    }

    public Collection m() {
        int i = m3.d;
        Collection hashSet = new HashSet();
        long currentTimeMillis = System.currentTimeMillis() - 86400000;
        Cursor rawQuery = this.i.getReadableDatabase().rawQuery(c, new String[]{String.valueOf(14), String.valueOf(currentTimeMillis)});
        if (rawQuery != null) {
            do {
                try {
                    if (!rawQuery.moveToNext()) {
                        break;
                    }
                    hashSet.add(rawQuery.getString(0));
                } catch (Throwable th) {
                    rawQuery.close();
                }
            } while (i == 0);
            rawQuery.close();
        }
        return hashSet;
    }

    private long b(String str) {
        long j = 1;
        String[] strArr = new String[]{str};
        synchronized (this.i) {
            Cursor rawQuery;
            try {
                rawQuery = this.i.getReadableDatabase().rawQuery(U[367], strArr);
                if (rawQuery != null) {
                    Log.i(U[368] + rawQuery.getCount());
                    if (rawQuery.moveToNext()) {
                        j = rawQuery.getLong(0);
                    }
                    rawQuery.close();
                }
            } catch (Throwable th) {
            }
        }
        return j;
    }

    public boolean z(String str) {
        return this.b.containsKey(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.whatsapp.ec b(com.whatsapp.protocol.b r23, int r24) {
        /*
        r22_this = this;
        r12 = com.whatsapp.m3.d;
        r7 = 0;
        r6 = 0;
        r10 = 0;
        r0 = r23;
        r4 = r0.e;
        r13 = r4.c;
        r9 = 0;
        r5 = 0;
        r4 = com.whatsapp.bd.b(r13);
        if (r4 == 0) goto L_0x003f;
    L_0x0013:
        r0 = r23;
        r8 = r0.F;	 Catch:{ SQLiteException -> 0x0248 }
        if (r8 != 0) goto L_0x003f;
    L_0x0019:
        r0 = r23;
        r8 = r0.e;	 Catch:{ SQLiteException -> 0x024a }
        r8 = r8.b;	 Catch:{ SQLiteException -> 0x024a }
        if (r8 != 0) goto L_0x003f;
    L_0x0021:
        r8 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x024c }
        r8.<init>();	 Catch:{ SQLiteException -> 0x024c }
        r11 = U;	 Catch:{ SQLiteException -> 0x024c }
        r14 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        r11 = r11[r14];	 Catch:{ SQLiteException -> 0x024c }
        r8 = r8.append(r11);	 Catch:{ SQLiteException -> 0x024c }
        r11 = com.whatsapp.util.Log.a(r23);	 Catch:{ SQLiteException -> 0x024c }
        r8 = r8.append(r11);	 Catch:{ SQLiteException -> 0x024c }
        r8 = r8.toString();	 Catch:{ SQLiteException -> 0x024c }
        com.whatsapp.util.Log.e(r8);	 Catch:{ SQLiteException -> 0x024c }
    L_0x003f:
        if (r4 == 0) goto L_0x0053;
    L_0x0041:
        r0 = r23;
        r4 = r0.e;	 Catch:{ SQLiteException -> 0x024e }
        r4 = r4.c;	 Catch:{ SQLiteException -> 0x024e }
        r4 = com.whatsapp.bd.i(r4);	 Catch:{ SQLiteException -> 0x024e }
        r4 = r4.f();	 Catch:{ SQLiteException -> 0x024e }
        r0 = r23;
        r0.m = r4;	 Catch:{ SQLiteException -> 0x024e }
    L_0x0053:
        r0 = r22;
        r14 = r0.i;
        monitor-enter(r14);
        r8 = 0;
        r0 = r22;
        r4 = r0.i;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r5 = r4.getWritableDatabase();	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r22.z();	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r16 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r5.beginTransaction();	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r18 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r16 = r18 - r16;
        r18 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1));
        if (r4 <= 0) goto L_0x0098;
    L_0x0078:
        r4 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x0250 }
        r4.<init>();	 Catch:{ SQLiteException -> 0x0250 }
        r11 = U;	 Catch:{ SQLiteException -> 0x0250 }
        r15 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r11 = r11[r15];	 Catch:{ SQLiteException -> 0x0250 }
        r4 = r4.append(r11);	 Catch:{ SQLiteException -> 0x0250 }
        r18 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r16 = r16 / r18;
        r0 = r16;
        r4 = r4.append(r0);	 Catch:{ SQLiteException -> 0x0250 }
        r4 = r4.toString();	 Catch:{ SQLiteException -> 0x0250 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ SQLiteException -> 0x0250 }
    L_0x0098:
        r0 = r23;
        r4 = r0.j;	 Catch:{ SQLiteException -> 0x0267 }
        r11 = 1;
        if (r4 == r11) goto L_0x00ad;
    L_0x009f:
        r0 = r23;
        r4 = r0.j;	 Catch:{ SQLiteException -> 0x0267 }
        r11 = 2;
        if (r4 == r11) goto L_0x00ad;
    L_0x00a6:
        r0 = r23;
        r4 = r0.j;	 Catch:{ SQLiteException -> 0x0269 }
        r11 = 3;
        if (r4 != r11) goto L_0x02b2;
    L_0x00ad:
        r4 = 1;
    L_0x00ae:
        r0 = r23;
        r11 = r0.e;	 Catch:{ SQLiteException -> 0x02b5 }
        r11 = r11.b;	 Catch:{ SQLiteException -> 0x02b5 }
        if (r11 == 0) goto L_0x0145;
    L_0x00b6:
        if (r4 == 0) goto L_0x0145;
    L_0x00b8:
        r0 = r23;
        r4 = r0.A;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r4 = (com.whatsapp.MediaData) r4;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r11 = r4.file;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r11 = com.whatsapp.yf.a(r11);	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        if (r11 == 0) goto L_0x0145;
    L_0x00c6:
        r11 = 0;
        r15 = r4.forward;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        if (r15 == 0) goto L_0x00ce;
    L_0x00cb:
        r11 = 1;
        if (r12 == 0) goto L_0x00e5;
    L_0x00ce:
        r0 = r23;
        r15 = r0.e;	 Catch:{ SQLiteException -> 0x02d8 }
        r15 = r15.c;	 Catch:{ SQLiteException -> 0x02d8 }
        r15 = com.whatsapp.m8.d(r15);	 Catch:{ SQLiteException -> 0x02d8 }
        if (r15 == 0) goto L_0x00e5;
    L_0x00da:
        r0 = r23;
        r11 = r0.F;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r15 = ",";
        r11 = r11.split(r15);	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r11 = r11.length;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
    L_0x00e5:
        if (r11 <= 0) goto L_0x0145;
    L_0x00e7:
        r15 = r4.file;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r15 = r15.getAbsolutePath();	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r0 = r22;
        r15 = r0.k(r15);	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        if (r15 != 0) goto L_0x0121;
    L_0x00f5:
        r0 = r22;
        r0 = r0.l;	 Catch:{ SQLiteException -> 0x02e7 }
        r16 = r0;
        r17 = 1;
        r0 = r4.file;	 Catch:{ SQLiteException -> 0x02e7 }
        r18 = r0;
        r18 = r18.getAbsolutePath();	 Catch:{ SQLiteException -> 0x02e7 }
        r16.bindString(r17, r18);	 Catch:{ SQLiteException -> 0x02e7 }
        r0 = r22;
        r0 = r0.l;	 Catch:{ SQLiteException -> 0x02e7 }
        r16 = r0;
        r17 = 2;
        r0 = (long) r11;	 Catch:{ SQLiteException -> 0x02e7 }
        r18 = r0;
        r16.bindLong(r17, r18);	 Catch:{ SQLiteException -> 0x02e7 }
        r0 = r22;
        r0 = r0.l;	 Catch:{ SQLiteException -> 0x02e7 }
        r16 = r0;
        r16.execute();	 Catch:{ SQLiteException -> 0x02e7 }
        if (r12 == 0) goto L_0x0145;
    L_0x0121:
        r0 = r22;
        r0 = r0.v;	 Catch:{ SQLiteException -> 0x02e9 }
        r16 = r0;
        r17 = 1;
        r11 = r11 + r15;
        r0 = (long) r11;	 Catch:{ SQLiteException -> 0x02e9 }
        r18 = r0;
        r16.bindLong(r17, r18);	 Catch:{ SQLiteException -> 0x02e9 }
        r0 = r22;
        r11 = r0.v;	 Catch:{ SQLiteException -> 0x02e9 }
        r15 = 2;
        r4 = r4.file;	 Catch:{ SQLiteException -> 0x02e9 }
        r4 = r4.getAbsolutePath();	 Catch:{ SQLiteException -> 0x02e9 }
        r11.bindString(r15, r4);	 Catch:{ SQLiteException -> 0x02e9 }
        r0 = r22;
        r4 = r0.v;	 Catch:{ SQLiteException -> 0x02e9 }
        r4.execute();	 Catch:{ SQLiteException -> 0x02e9 }
    L_0x0145:
        r0 = r23;
        r4 = r0.e;	 Catch:{ SQLiteException -> 0x02f0 }
        r4 = r4.c;	 Catch:{ SQLiteException -> 0x02f0 }
        r4 = com.whatsapp.m8.d(r4);	 Catch:{ SQLiteException -> 0x02f0 }
        if (r4 == 0) goto L_0x01ca;
    L_0x0151:
        r0 = r23;
        r4 = r0.e;	 Catch:{ SQLiteException -> 0x02f0 }
        r4 = r4.b;	 Catch:{ SQLiteException -> 0x02f0 }
        if (r4 == 0) goto L_0x01ca;
    L_0x0159:
        r0 = r23;
        r4 = r0.a;	 Catch:{ SQLiteException -> 0x02f2 }
        if (r4 == 0) goto L_0x0166;
    L_0x015f:
        r0 = r23;
        r4 = r0.a;	 Catch:{ SQLiteException -> 0x02f4 }
        r11 = 2;
        if (r4 != r11) goto L_0x01ca;
    L_0x0166:
        r4 = 1;
        r0 = r23;
        r0.l = r4;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r0 = r23;
        r4 = r0.F;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r11 = ",";
        r11 = r4.split(r11);	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r15 = r11.length;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r4 = 0;
    L_0x0177:
        if (r4 >= r15) goto L_0x01ca;
    L_0x0179:
        r16 = r11[r4];	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r17 = new com.whatsapp.protocol.b;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r0 = r17;
        r1 = r23;
        r0.<init>(r1);	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r18 = new com.whatsapp.protocol.m;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r19 = 1;
        r0 = r23;
        r0 = r0.e;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r20 = r0;
        r0 = r20;
        r0 = r0.a;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r20 = r0;
        r0 = r18;
        r1 = r16;
        r2 = r19;
        r3 = r20;
        r0.<init>(r1, r2, r3);	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r0 = r18;
        r1 = r17;
        r1.e = r0;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r0 = r22;
        r1 = r17;
        r18 = r0.b(r1);	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r0 = r22;
        r0 = r0.b;	 Catch:{ SQLiteException -> 0x02f8 }
        r20 = r0;
        r0 = r20;
        r1 = r16;
        r16 = r0.containsKey(r1);	 Catch:{ SQLiteException -> 0x02f8 }
        if (r16 == 0) goto L_0x01c6;
    L_0x01bd:
        r0 = r22;
        r1 = r17;
        r2 = r18;
        r0.a(r5, r1, r2);	 Catch:{ SQLiteException -> 0x02f8 }
    L_0x01c6:
        r4 = r4 + 1;
        if (r12 == 0) goto L_0x0177;
    L_0x01ca:
        r16 = r22.b(r23);	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r18 = -1;
        r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1));
        if (r4 != 0) goto L_0x01df;
    L_0x01d4:
        r4 = U;	 Catch:{ SQLiteException -> 0x02fa }
        r11 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        r4 = r4[r11];	 Catch:{ SQLiteException -> 0x02fa }
        com.whatsapp.util.Log.e(r4);	 Catch:{ SQLiteException -> 0x02fa }
        if (r12 == 0) goto L_0x03d3;
    L_0x01df:
        r0 = r23;
        r4 = r0.j;	 Catch:{ SQLiteException -> 0x02fc }
        r11 = 8;
        if (r4 == r11) goto L_0x0206;
    L_0x01e7:
        r0 = r22;
        r4 = r0.b;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r4 = r4.get(r13);	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r4 = (com.whatsapp.sf) r4;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        if (r4 == 0) goto L_0x01fa;
    L_0x01f3:
        r11 = com.whatsapp.sf.g(r4);	 Catch:{ SQLiteException -> 0x02fe }
        if (r11 == 0) goto L_0x01fa;
    L_0x01f9:
        r6 = 1;
    L_0x01fa:
        if (r4 != 0) goto L_0x01fd;
    L_0x01fc:
        r7 = 1;
    L_0x01fd:
        r0 = r22;
        r1 = r23;
        r2 = r16;
        r0.a(r5, r1, r2);	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
    L_0x0206:
        r0 = r22;
        r1 = r23;
        r0.a(r5, r1);	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r5.setTransactionSuccessful();	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r0 = r22;
        r4 = r0.S;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r0 = r23;
        r11 = r0.e;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r0 = r23;
        r4.put(r11, r0);	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
        r4 = 1;
    L_0x021e:
        if (r5 == 0) goto L_0x03cc;
    L_0x0220:
        r9 = r5.inTransaction();	 Catch:{ SQLiteException -> 0x0300 }
        if (r9 == 0) goto L_0x03cc;
    L_0x0226:
        r5.endTransaction();	 Catch:{ SQLiteException -> 0x0304 }
        r5 = r4;
        r4 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r10;
    L_0x022e:
        if (r4 == 0) goto L_0x0395;
    L_0x0230:
        if (r24 <= 0) goto L_0x0395;
    L_0x0232:
        r0 = r22;
        r4 = r0.i;	 Catch:{ all -> 0x02d5 }
        r4.close();	 Catch:{ all -> 0x02d5 }
        r22.y();	 Catch:{ all -> 0x02d5 }
        r4 = r24 + -1;
        r0 = r22;
        r1 = r23;
        r4 = r0.b(r1, r4);	 Catch:{ all -> 0x02d5 }
        monitor-exit(r14);	 Catch:{ all -> 0x02d5 }
    L_0x0247:
        return r4;
    L_0x0248:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x024a }
    L_0x024a:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x024c }
    L_0x024c:
        r4 = move-exception;
        throw r4;
    L_0x024e:
        r4 = move-exception;
        throw r4;
    L_0x0250:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
    L_0x0252:
        r4 = move-exception;
        com.whatsapp.util.Log.c(r4);	 Catch:{ all -> 0x02c8 }
        if (r5 == 0) goto L_0x03c5;
    L_0x0258:
        r4 = r5.inTransaction();	 Catch:{ IOException -> 0x0313 }
        if (r4 == 0) goto L_0x03c5;
    L_0x025e:
        r5.endTransaction();	 Catch:{ SQLiteException -> 0x0315 }
        r4 = r8;
        r5 = r9;
        r8 = r7;
        r7 = r6;
        r6 = r10;
        goto L_0x022e;
    L_0x0267:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0269 }
    L_0x0269:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x026b }
    L_0x026b:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
    L_0x026d:
        r4 = move-exception;
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02c8 }
        r10.<init>();	 Catch:{ all -> 0x02c8 }
        r11 = U;	 Catch:{ all -> 0x02c8 }
        r12 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        r11 = r11[r12];	 Catch:{ all -> 0x02c8 }
        r10 = r10.append(r11);	 Catch:{ all -> 0x02c8 }
        r0 = r23;
        r11 = r0.e;	 Catch:{ all -> 0x02c8 }
        r11 = r11.a;	 Catch:{ all -> 0x02c8 }
        r10 = r10.append(r11);	 Catch:{ all -> 0x02c8 }
        r11 = " ";
        r10 = r10.append(r11);	 Catch:{ all -> 0x02c8 }
        r4 = r4.toString();	 Catch:{ all -> 0x02c8 }
        r4 = r10.append(r4);	 Catch:{ all -> 0x02c8 }
        r4 = r4.toString();	 Catch:{ all -> 0x02c8 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ all -> 0x02c8 }
        r4 = 1;
        if (r5 == 0) goto L_0x03bb;
    L_0x029f:
        r10 = r5.inTransaction();	 Catch:{ SQLiteException -> 0x0324 }
        if (r10 == 0) goto L_0x03bb;
    L_0x02a5:
        r5.endTransaction();	 Catch:{ SQLiteException -> 0x0328 }
        r5 = r9;
        r21 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r4;
        r4 = r21;
        goto L_0x022e;
    L_0x02b2:
        r4 = 0;
        goto L_0x00ae;
    L_0x02b5:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
    L_0x02b7:
        r4 = move-exception;
        if (r24 != 0) goto L_0x0337;
    L_0x02ba:
        com.whatsapp.util.Log.c(r4);	 Catch:{ SQLiteException -> 0x02c6 }
        r6 = com.whatsapp.App.p;	 Catch:{ SQLiteException -> 0x02c6 }
        r7 = 2131624284; // 0x7f0e015c float:1.8875743E38 double:1.0531623286E-314;
        com.whatsapp.util.aq.a(r6, r7);	 Catch:{ SQLiteException -> 0x02c6 }
        throw r4;	 Catch:{ SQLiteException -> 0x02c6 }
    L_0x02c6:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x02c8 }
    L_0x02c8:
        r4 = move-exception;
        if (r5 == 0) goto L_0x02d4;
    L_0x02cb:
        r6 = r5.inTransaction();	 Catch:{ SQLiteException -> 0x0382 }
        if (r6 == 0) goto L_0x02d4;
    L_0x02d1:
        r5.endTransaction();	 Catch:{ SQLiteException -> 0x0386 }
    L_0x02d4:
        throw r4;	 Catch:{ all -> 0x02d5 }
    L_0x02d5:
        r4 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x02d5 }
        throw r4;
    L_0x02d8:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
    L_0x02da:
        r4 = move-exception;
        com.whatsapp.util.Log.c(r4);	 Catch:{ all -> 0x02c8 }
        r22.L();	 Catch:{ all -> 0x02c8 }
        r6 = new java.lang.AssertionError;	 Catch:{ all -> 0x02c8 }
        r6.<init>(r4);	 Catch:{ all -> 0x02c8 }
        throw r6;	 Catch:{ all -> 0x02c8 }
    L_0x02e7:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x02e9 }
    L_0x02e9:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
    L_0x02eb:
        r4 = move-exception;
    L_0x02ec:
        com.whatsapp.util.Log.c(r4);	 Catch:{ all -> 0x02c8 }
        throw r4;	 Catch:{ all -> 0x02c8 }
    L_0x02f0:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x02f2 }
    L_0x02f2:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x02f4 }
    L_0x02f4:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
    L_0x02f6:
        r4 = move-exception;
        goto L_0x02ec;
    L_0x02f8:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
    L_0x02fa:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x02fc }
    L_0x02fc:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
    L_0x02fe:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0252, SQLiteConstraintException -> 0x026d, SQLiteDiskIOException -> 0x02b7, SQLiteDatabaseCorruptException -> 0x02da, RuntimeException -> 0x02eb, Error -> 0x02f6 }
    L_0x0300:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0302 }
    L_0x0302:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x02d5 }
    L_0x0304:
        r4 = move-exception;
        r5 = U;	 Catch:{ SQLiteException -> 0x0311 }
        r6 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r5 = r5[r6];	 Catch:{ SQLiteException -> 0x0311 }
        com.whatsapp.util.Log.b(r5, r4);	 Catch:{ SQLiteException -> 0x0311 }
        throw r4;	 Catch:{ SQLiteException -> 0x030f }
    L_0x030f:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x02d5 }
    L_0x0311:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x030f }
    L_0x0313:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x02d5 }
    L_0x0315:
        r4 = move-exception;
        r5 = U;	 Catch:{ SQLiteException -> 0x0322 }
        r6 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r5 = r5[r6];	 Catch:{ SQLiteException -> 0x0322 }
        com.whatsapp.util.Log.b(r5, r4);	 Catch:{ SQLiteException -> 0x0322 }
        throw r4;	 Catch:{ SQLiteException -> 0x0320 }
    L_0x0320:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x02d5 }
    L_0x0322:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0320 }
    L_0x0324:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0326 }
    L_0x0326:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x02d5 }
    L_0x0328:
        r4 = move-exception;
        r5 = U;	 Catch:{ SQLiteException -> 0x0335 }
        r6 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        r5 = r5[r6];	 Catch:{ SQLiteException -> 0x0335 }
        com.whatsapp.util.Log.b(r5, r4);	 Catch:{ SQLiteException -> 0x0335 }
        throw r4;	 Catch:{ SQLiteException -> 0x0333 }
    L_0x0333:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x02d5 }
    L_0x0335:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0333 }
    L_0x0337:
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02c8 }
        r8.<init>();	 Catch:{ all -> 0x02c8 }
        r11 = U;	 Catch:{ all -> 0x02c8 }
        r12 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r11 = r11[r12];	 Catch:{ all -> 0x02c8 }
        r8 = r8.append(r11);	 Catch:{ all -> 0x02c8 }
        r4 = r4.toString();	 Catch:{ all -> 0x02c8 }
        r4 = r8.append(r4);	 Catch:{ all -> 0x02c8 }
        r4 = r4.toString();	 Catch:{ all -> 0x02c8 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ all -> 0x02c8 }
        r4 = 1;
        if (r5 == 0) goto L_0x03b5;
    L_0x0358:
        r8 = r5.inTransaction();	 Catch:{ SQLiteException -> 0x0367 }
        if (r8 == 0) goto L_0x03b5;
    L_0x035e:
        r5.endTransaction();	 Catch:{ SQLiteException -> 0x036b }
        r5 = r9;
        r8 = r7;
        r7 = r6;
        r6 = r10;
        goto L_0x022e;
    L_0x0367:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0369 }
    L_0x0369:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x02d5 }
    L_0x036b:
        r5 = move-exception;
        r8 = U;	 Catch:{ SQLiteException -> 0x037a }
        r11 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        r8 = r8[r11];	 Catch:{ SQLiteException -> 0x037a }
        com.whatsapp.util.Log.b(r8, r5);	 Catch:{ SQLiteException -> 0x037a }
        if (r24 != 0) goto L_0x037c;
    L_0x0377:
        throw r5;	 Catch:{ SQLiteException -> 0x0378 }
    L_0x0378:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x02d5 }
    L_0x037a:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0378 }
    L_0x037c:
        r5 = r9;
        r8 = r7;
        r7 = r6;
        r6 = r10;
        goto L_0x022e;
    L_0x0382:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0384 }
    L_0x0384:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x02d5 }
    L_0x0386:
        r4 = move-exception;
        r5 = U;	 Catch:{ SQLiteException -> 0x0393 }
        r6 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r5 = r5[r6];	 Catch:{ SQLiteException -> 0x0393 }
        com.whatsapp.util.Log.b(r5, r4);	 Catch:{ SQLiteException -> 0x0393 }
        throw r4;	 Catch:{ SQLiteException -> 0x0391 }
    L_0x0391:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x02d5 }
    L_0x0393:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0391 }
    L_0x0395:
        monitor-exit(r14);	 Catch:{ all -> 0x02d5 }
        r0 = r23;
        r4 = r0.r;
        if (r4 == 0) goto L_0x03ab;
    L_0x039c:
        r0 = r22;
        r9 = r0.C;
        monitor-enter(r9);
        r0 = r22;
        r4 = r0.C;	 Catch:{ all -> 0x03b2 }
        r0 = r23;
        r4.add(r0);	 Catch:{ all -> 0x03b2 }
        monitor-exit(r9);	 Catch:{ all -> 0x03b2 }
    L_0x03ab:
        r4 = new com.whatsapp.ec;
        r4.<init>(r5, r8, r7, r6);
        goto L_0x0247;
    L_0x03b2:
        r4 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x03b2 }
        throw r4;
    L_0x03b5:
        r5 = r9;
        r8 = r7;
        r7 = r6;
        r6 = r10;
        goto L_0x022e;
    L_0x03bb:
        r5 = r9;
        r21 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r4;
        r4 = r21;
        goto L_0x022e;
    L_0x03c5:
        r4 = r8;
        r5 = r9;
        r8 = r7;
        r7 = r6;
        r6 = r10;
        goto L_0x022e;
    L_0x03cc:
        r5 = r4;
        r4 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r10;
        goto L_0x022e;
    L_0x03d3:
        r4 = r9;
        goto L_0x021e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.b(com.whatsapp.protocol.b, int):com.whatsapp.ec");
    }

    public void F() {
        synchronized (this.C) {
            this.C.clear();
        }
    }

    private boolean a(Collection collection, int i, String str) {
        switch (i) {
            case ay.f /*1*/:
                try {
                    collection.removeAll(Arrays.asList(TextUtils.split(str, ",")));
                    return true;
                } catch (IllegalStateException e) {
                    throw e;
                }
            case ay.n /*2*/:
                collection.addAll(Arrays.asList(TextUtils.split(str, ",")));
                return true;
            case ay.p /*3*/:
                String[] split = TextUtils.split(str, ",");
                try {
                    if (split.length != 2) {
                        return false;
                    }
                    collection.remove(split[1]);
                    collection.add(split[0]);
                    return true;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            default:
                return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList a(long r8, int r10) {
        /*
        r7_this = this;
        r2 = com.whatsapp.m3.d;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r0 = r7.i;
        r0 = r0.getReadableDatabase();
        r3 = U;
        r4 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        r3 = r3[r4];
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = java.lang.Long.toString(r8);
        r4[r5] = r6;
        r3 = r0.rawQuery(r3, r4);
        r0 = U;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        r4 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        r0 = r0[r4];	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        r4 = r3.getColumnIndex(r0);	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        if (r3 == 0) goto L_0x00d9;
    L_0x002d:
        r0 = r3.moveToNext();	 Catch:{ IllegalStateException -> 0x0090, SQLiteDiskIOException -> 0x00ba }
        if (r0 == 0) goto L_0x006b;
    L_0x0033:
        r0 = r3.getString(r4);	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        if (r0 != 0) goto L_0x0044;
    L_0x0039:
        r5 = U;	 Catch:{ IllegalStateException -> 0x00b8, SQLiteDiskIOException -> 0x00ba }
        r6 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x00b8, SQLiteDiskIOException -> 0x00ba }
        com.whatsapp.util.Log.w(r5);	 Catch:{ IllegalStateException -> 0x00b8, SQLiteDiskIOException -> 0x00ba }
        if (r2 == 0) goto L_0x002d;
    L_0x0044:
        r5 = r7.a(r3, r0);	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        r0 = r5.A;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        if (r0 == 0) goto L_0x005f;
    L_0x004c:
        r0 = r5.A;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        r6 = r0.transferred;	 Catch:{ IllegalStateException -> 0x00cb, SQLiteDiskIOException -> 0x00ba }
        if (r6 != 0) goto L_0x005f;
    L_0x0054:
        r6 = r0.transferring;	 Catch:{ IllegalStateException -> 0x00cb, SQLiteDiskIOException -> 0x00ba }
        if (r6 != 0) goto L_0x005f;
    L_0x0058:
        r0 = r0.autodownloadRetryEnabled;	 Catch:{ IllegalStateException -> 0x00cd, SQLiteDiskIOException -> 0x00ba }
        if (r0 == 0) goto L_0x005f;
    L_0x005c:
        r1.add(r5);	 Catch:{ IllegalStateException -> 0x00cf, SQLiteDiskIOException -> 0x00ba }
    L_0x005f:
        if (r10 < 0) goto L_0x0069;
    L_0x0061:
        r0 = r1.size();	 Catch:{ IllegalStateException -> 0x00d1, SQLiteDiskIOException -> 0x00ba }
        if (r0 < r10) goto L_0x0069;
    L_0x0067:
        if (r2 == 0) goto L_0x006b;
    L_0x0069:
        if (r2 == 0) goto L_0x002d;
    L_0x006b:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        r2 = U;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        r4 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        r2 = r1.size();	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
        if (r3 == 0) goto L_0x008e;
    L_0x008b:
        r3.close();	 Catch:{ IllegalStateException -> 0x00d7 }
    L_0x008e:
        r0 = r1;
    L_0x008f:
        return r0;
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
    L_0x0092:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c4 }
        r2.<init>();	 Catch:{ all -> 0x00c4 }
        r4 = U;	 Catch:{ all -> 0x00c4 }
        r5 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x00c4 }
        r2 = r2.append(r4);	 Catch:{ all -> 0x00c4 }
        r0 = r0.toString();	 Catch:{ all -> 0x00c4 }
        r0 = r2.append(r0);	 Catch:{ all -> 0x00c4 }
        r0 = r0.toString();	 Catch:{ all -> 0x00c4 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x00c4 }
        if (r3 == 0) goto L_0x00b6;
    L_0x00b3:
        r3.close();
    L_0x00b6:
        r0 = r1;
        goto L_0x008f;
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        r1 = com.whatsapp.App.p;	 Catch:{ all -> 0x00c4 }
        r2 = 2131624284; // 0x7f0e015c float:1.8875743E38 double:1.0531623286E-314;
        com.whatsapp.util.aq.a(r1, r2);	 Catch:{ all -> 0x00c4 }
        throw r0;	 Catch:{ all -> 0x00c4 }
    L_0x00c4:
        r0 = move-exception;
        if (r3 == 0) goto L_0x00ca;
    L_0x00c7:
        r3.close();	 Catch:{ IllegalStateException -> 0x00e1 }
    L_0x00ca:
        throw r0;
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00cd, SQLiteDiskIOException -> 0x00ba }
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00cf, SQLiteDiskIOException -> 0x00ba }
    L_0x00cf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
    L_0x00d1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d3, SQLiteDiskIOException -> 0x00ba }
    L_0x00d3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d5, SQLiteDiskIOException -> 0x00ba }
    L_0x00d5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDiskIOException -> 0x00ba }
    L_0x00d7:
        r0 = move-exception;
        throw r0;
    L_0x00d9:
        if (r3 == 0) goto L_0x00b6;
    L_0x00db:
        r3.close();	 Catch:{ IllegalStateException -> 0x00df }
        goto L_0x00b6;
    L_0x00df:
        r0 = move-exception;
        throw r0;
    L_0x00e1:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(long, int):java.util.ArrayList");
    }

    public void a(String str, boolean z, boolean z2) {
        sf sfVar = (sf) this.b.get(str);
        if (sfVar == null) {
            try {
                Log.w(U[354] + str + " " + z);
                return;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        try {
            if (sf.g(sfVar) == z) {
                Log.w(U[353] + str + " " + z);
                return;
            }
            try {
                sf.a(sfVar, z);
                this.y.a(str, true);
                r();
                this.K.b.post(new aka(this, z, str));
                if (z2) {
                    App.a(z ? 3 : 4, str);
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long e(com.whatsapp.protocol.b r11) {
        /*
        r10_this = this;
        r1 = 1;
        r2 = 0;
        r4 = 1;
        if (r11 != 0) goto L_0x0008;
    L_0x0006:
        r0 = r4;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = 3;
        r3 = new java.lang.String[r0];	 Catch:{ IllegalStateException -> 0x0065 }
        r0 = 0;
        r6 = r11.e;	 Catch:{ IllegalStateException -> 0x0065 }
        r6 = r6.c;	 Catch:{ IllegalStateException -> 0x0065 }
        r3[r0] = r6;	 Catch:{ IllegalStateException -> 0x0065 }
        r0 = r11.e;	 Catch:{ IllegalStateException -> 0x0065 }
        r0 = r0.b;	 Catch:{ IllegalStateException -> 0x0065 }
        if (r0 == 0) goto L_0x0067;
    L_0x0018:
        r0 = r1;
    L_0x0019:
        r0 = java.lang.String.valueOf(r0);
        r3[r1] = r0;
        r0 = 2;
        r6 = r11.e;
        r6 = r6.a;
        r3[r0] = r6;
        r6 = r10.i;
        monitor-enter(r6);
        r0 = r10.i;	 Catch:{ all -> 0x0062 }
        r0 = r0.getReadableDatabase();	 Catch:{ all -> 0x0062 }
        r7 = U;	 Catch:{ all -> 0x0062 }
        r8 = 285; // 0x11d float:4.0E-43 double:1.41E-321;
        r7 = r7[r8];	 Catch:{ all -> 0x0062 }
        r3 = r0.rawQuery(r7, r3);	 Catch:{ all -> 0x0062 }
        if (r3 == 0) goto L_0x0072;
    L_0x003b:
        r0 = r3.moveToLast();	 Catch:{ all -> 0x006b }
        if (r0 == 0) goto L_0x004f;
    L_0x0041:
        r0 = 0;
        r4 = r3.getLong(r0);	 Catch:{ all -> 0x006b }
        r8 = 0;
        r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r0 < 0) goto L_0x0069;
    L_0x004c:
        com.whatsapp.util.Log.b(r1);	 Catch:{ all -> 0x006b }
    L_0x004f:
        r0 = r4;
        r3.close();	 Catch:{ all -> 0x0062 }
        r2 = com.whatsapp.m3.d;	 Catch:{ IllegalStateException -> 0x0070 }
        if (r2 == 0) goto L_0x0060;
    L_0x0057:
        r2 = U;	 Catch:{ IllegalStateException -> 0x0070 }
        r3 = 284; // 0x11c float:3.98E-43 double:1.403E-321;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0070 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x0070 }
    L_0x0060:
        monitor-exit(r6);	 Catch:{ all -> 0x0062 }
        goto L_0x0007;
    L_0x0062:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0062 }
        throw r0;
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = r2;
        goto L_0x0019;
    L_0x0069:
        r1 = r2;
        goto L_0x004c;
    L_0x006b:
        r0 = move-exception;
        r3.close();	 Catch:{ all -> 0x0062 }
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x0072:
        r0 = r4;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.e(com.whatsapp.protocol.b):long");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean d(boolean r9) {
        /*
        r8_this = this;
        r3 = 0;
        r0 = 0;
        r1 = U;	 Catch:{ Exception -> 0x001d }
        r2 = 397; // 0x18d float:5.56E-43 double:1.96E-321;
        r1 = r1[r2];	 Catch:{ Exception -> 0x001d }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x001d }
        r1 = com.whatsapp.App.aF;	 Catch:{ Exception -> 0x001d }
        if (r1 != 0) goto L_0x0013;
    L_0x000f:
        r1 = com.whatsapp.App.d;	 Catch:{ Exception -> 0x001d }
        if (r1 == 0) goto L_0x0021;
    L_0x0013:
        r1 = U;	 Catch:{ Exception -> 0x001f }
        r2 = 396; // 0x18c float:5.55E-43 double:1.956E-321;
        r1 = r1[r2];	 Catch:{ Exception -> 0x001f }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x001f }
    L_0x001c:
        return r0;
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;
    L_0x0021:
        r6 = new com.whatsapp.util.y;
        r1 = U;
        r2 = 393; // 0x189 float:5.51E-43 double:1.94E-321;
        r1 = r1[r2];
        r6.<init>(r1);
        r1 = r8.s;
        r1 = r1.getParentFile();
        r2 = r1.exists();	 Catch:{ Exception -> 0x01a0 }
        if (r2 != 0) goto L_0x0047;
    L_0x0038:
        r2 = U;	 Catch:{ Exception -> 0x01a0 }
        r4 = 395; // 0x18b float:5.54E-43 double:1.95E-321;
        r2 = r2[r4];	 Catch:{ Exception -> 0x01a0 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x01a0 }
        r1.mkdirs();	 Catch:{ Exception -> 0x01a0 }
        r1.mkdir();	 Catch:{ Exception -> 0x01a0 }
    L_0x0047:
        r1 = r8.u;
        r8.g(r1);
        r1 = r8.m;
        r8.g(r1);
        r1 = r8.B;
        r8.g(r1);
        r1 = r8.x;
        r8.g(r1);
        r1 = r8.z;
        r8.g(r1);
        r1 = r8.f;
        r8.g(r1);
        r1 = r8.n;
        r8.g(r1);
        r1 = r8.s;
        r8.g(r1);
        r7 = r8.i;
        monitor-enter(r7);
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01a2 }
        r1.<init>();	 Catch:{ Exception -> 0x01a2 }
        r2 = U;	 Catch:{ Exception -> 0x01a2 }
        r4 = 398; // 0x18e float:5.58E-43 double:1.966E-321;
        r2 = r2[r4];	 Catch:{ Exception -> 0x01a2 }
        r1 = r1.append(r2);	 Catch:{ Exception -> 0x01a2 }
        r2 = Q;	 Catch:{ Exception -> 0x01a2 }
        r4 = r2.length();	 Catch:{ Exception -> 0x01a2 }
        r1 = r1.append(r4);	 Catch:{ Exception -> 0x01a2 }
        r1 = r1.toString();	 Catch:{ Exception -> 0x01a2 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x01a2 }
        if (r9 == 0) goto L_0x01cf;
    L_0x0094:
        r1 = com.whatsapp.util.t.a();	 Catch:{ Exception -> 0x01a2 }
        r1 = r1.b();	 Catch:{ Exception -> 0x01a2 }
        if (r1 == 0) goto L_0x01cf;
    L_0x009e:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01a4 }
        r1.<init>();	 Catch:{ all -> 0x01a4 }
        r2 = U;	 Catch:{ all -> 0x01a4 }
        r4 = 399; // 0x18f float:5.59E-43 double:1.97E-321;
        r2 = r2[r4];	 Catch:{ all -> 0x01a4 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x01a4 }
        r2 = r8.s;	 Catch:{ all -> 0x01a4 }
        r2 = r2.getName();	 Catch:{ all -> 0x01a4 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x01a4 }
        r1 = r1.toString();	 Catch:{ all -> 0x01a4 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ all -> 0x01a4 }
        r2 = new com.whatsapp.util.al;	 Catch:{ all -> 0x01a4 }
        r1 = com.whatsapp.App.aB;	 Catch:{ all -> 0x01a4 }
        r4 = r8.s;	 Catch:{ all -> 0x01a4 }
        r2.<init>(r1, r4);	 Catch:{ all -> 0x01a4 }
        r1 = new java.io.FileInputStream;	 Catch:{ all -> 0x021d }
        r4 = Q;	 Catch:{ all -> 0x021d }
        r1.<init>(r4);	 Catch:{ all -> 0x021d }
        r5 = com.whatsapp.a54.G();	 Catch:{ Exception -> 0x01b4 }
        com.whatsapp.a54.a(r2, r5);	 Catch:{ all -> 0x0221 }
        r0 = com.whatsapp.util.t.a();	 Catch:{ all -> 0x0221 }
        r3 = com.whatsapp.util.a4.CRYPT8;	 Catch:{ all -> 0x0221 }
        r4 = r5.c;	 Catch:{ all -> 0x0221 }
        r5 = r5.b;	 Catch:{ all -> 0x0221 }
        r5 = r5.e;	 Catch:{ all -> 0x0221 }
        r0.a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0221 }
    L_0x00e4:
        if (r1 == 0) goto L_0x00e9;
    L_0x00e6:
        r1.close();	 Catch:{ Exception -> 0x020f }
    L_0x00e9:
        if (r2 == 0) goto L_0x00ee;
    L_0x00eb:
        r2.close();	 Catch:{ Exception -> 0x0211 }
    L_0x00ee:
        monitor-exit(r7);	 Catch:{ all -> 0x01b1 }
        r0 = r8.u;	 Catch:{ Exception -> 0x0217 }
        r1 = 7;
        r2 = "";
        com.whatsapp.util.at.b(r0, r1, r2);	 Catch:{ Exception -> 0x0217 }
        r0 = r8.m;	 Catch:{ Exception -> 0x0217 }
        r1 = 7;
        r2 = "";
        com.whatsapp.util.at.b(r0, r1, r2);	 Catch:{ Exception -> 0x0217 }
        r0 = r8.B;	 Catch:{ Exception -> 0x0217 }
        r1 = 7;
        r2 = "";
        com.whatsapp.util.at.b(r0, r1, r2);	 Catch:{ Exception -> 0x0217 }
        r0 = r8.x;	 Catch:{ Exception -> 0x0217 }
        r1 = 7;
        r2 = "";
        com.whatsapp.util.at.b(r0, r1, r2);	 Catch:{ Exception -> 0x0217 }
        r0 = r8.z;	 Catch:{ Exception -> 0x0217 }
        r1 = 7;
        r2 = "";
        com.whatsapp.util.at.b(r0, r1, r2);	 Catch:{ Exception -> 0x0217 }
        r0 = r8.f;	 Catch:{ Exception -> 0x0217 }
        r1 = 7;
        r2 = "";
        com.whatsapp.util.at.b(r0, r1, r2);	 Catch:{ Exception -> 0x0217 }
        r0 = r8.n;	 Catch:{ Exception -> 0x0217 }
        r1 = 7;
        r2 = "";
        com.whatsapp.util.at.b(r0, r1, r2);	 Catch:{ Exception -> 0x0217 }
        r0 = r8.s;	 Catch:{ Exception -> 0x0217 }
        r1 = 7;
        r2 = "";
        com.whatsapp.util.at.b(r0, r1, r2);	 Catch:{ Exception -> 0x0217 }
        r0 = r8.H;	 Catch:{ Exception -> 0x0217 }
        r1 = 7;
        r2 = "";
        com.whatsapp.util.at.b(r0, r1, r2);	 Catch:{ Exception -> 0x0217 }
        r0 = com.whatsapp.util.t.a();	 Catch:{ Exception -> 0x0217 }
        r0 = r0.b();	 Catch:{ Exception -> 0x0217 }
        if (r0 == 0) goto L_0x017b;
    L_0x0141:
        r0 = r8.H;	 Catch:{ Exception -> 0x0219 }
        r0 = r0.exists();	 Catch:{ Exception -> 0x0219 }
        if (r0 == 0) goto L_0x017b;
    L_0x0149:
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x021b }
        r2 = r8.H;	 Catch:{ Exception -> 0x021b }
        r2 = r2.lastModified();	 Catch:{ Exception -> 0x021b }
        r0 = r0 - r2;
        r2 = 604800000; // 0x240c8400 float:3.046947E-17 double:2.988109026E-315;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x017b;
    L_0x015b:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021b }
        r0.<init>();	 Catch:{ Exception -> 0x021b }
        r1 = U;	 Catch:{ Exception -> 0x021b }
        r2 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r1 = r1[r2];	 Catch:{ Exception -> 0x021b }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x021b }
        r1 = r8.H;	 Catch:{ Exception -> 0x021b }
        r1 = r1.delete();	 Catch:{ Exception -> 0x021b }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x021b }
        r0 = r0.toString();	 Catch:{ Exception -> 0x021b }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x021b }
    L_0x017b:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = U;
        r2 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r2 = r6.c();
        r1 = java.lang.Long.valueOf(r2);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = 1;
        goto L_0x001c;
    L_0x01a0:
        r0 = move-exception;
        throw r0;
    L_0x01a2:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x01a4 }
    L_0x01a4:
        r0 = move-exception;
        r1 = r3;
    L_0x01a6:
        if (r1 == 0) goto L_0x01ab;
    L_0x01a8:
        r1.close();	 Catch:{ Exception -> 0x0213 }
    L_0x01ab:
        if (r3 == 0) goto L_0x01b0;
    L_0x01ad:
        r3.close();	 Catch:{ Exception -> 0x0215 }
    L_0x01b0:
        throw r0;	 Catch:{ all -> 0x01b1 }
    L_0x01b1:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x01b1 }
        throw r0;
    L_0x01b4:
        r3 = move-exception;
        r4 = U;	 Catch:{ all -> 0x0221 }
        r5 = 394; // 0x18a float:5.52E-43 double:1.947E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x0221 }
        com.whatsapp.util.Log.c(r4, r3);	 Catch:{ all -> 0x0221 }
        if (r1 == 0) goto L_0x01c3;
    L_0x01c0:
        r1.close();	 Catch:{ Exception -> 0x01cb }
    L_0x01c3:
        if (r2 == 0) goto L_0x01c8;
    L_0x01c5:
        r2.close();	 Catch:{ Exception -> 0x01cd }
    L_0x01c8:
        monitor-exit(r7);	 Catch:{ all -> 0x01b1 }
        goto L_0x001c;
    L_0x01cb:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x01b1 }
    L_0x01cd:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x01b1 }
    L_0x01cf:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01a4 }
        r0.<init>();	 Catch:{ all -> 0x01a4 }
        r1 = U;	 Catch:{ all -> 0x01a4 }
        r2 = 392; // 0x188 float:5.5E-43 double:1.937E-321;
        r1 = r1[r2];	 Catch:{ all -> 0x01a4 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x01a4 }
        r1 = r8.H;	 Catch:{ all -> 0x01a4 }
        r1 = r1.getName();	 Catch:{ all -> 0x01a4 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x01a4 }
        r0 = r0.toString();	 Catch:{ all -> 0x01a4 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x01a4 }
        r2 = new com.whatsapp.util.al;	 Catch:{ all -> 0x01a4 }
        r0 = com.whatsapp.App.aB;	 Catch:{ all -> 0x01a4 }
        r1 = r8.H;	 Catch:{ all -> 0x01a4 }
        r2.<init>(r0, r1);	 Catch:{ all -> 0x01a4 }
        r1 = new java.io.FileInputStream;	 Catch:{ all -> 0x0224 }
        r0 = Q;	 Catch:{ all -> 0x0224 }
        r1.<init>(r0);	 Catch:{ all -> 0x0224 }
        r0 = r1.getChannel();	 Catch:{ all -> 0x020c }
        r3 = java.nio.channels.Channels.newChannel(r2);	 Catch:{ all -> 0x020c }
        com.whatsapp.util.at.a(r0, r3);	 Catch:{ all -> 0x020c }
        goto L_0x00e4;
    L_0x020c:
        r0 = move-exception;
        r3 = r2;
        goto L_0x01a6;
    L_0x020f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x01b1 }
    L_0x0211:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x01b1 }
    L_0x0213:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x01b1 }
    L_0x0215:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x01b1 }
    L_0x0217:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0219 }
    L_0x0219:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x021b }
    L_0x021b:
        r0 = move-exception;
        throw r0;
    L_0x021d:
        r0 = move-exception;
        r1 = r3;
        r3 = r2;
        goto L_0x01a6;
    L_0x0221:
        r0 = move-exception;
        r3 = r2;
        goto L_0x01a6;
    L_0x0224:
        r0 = move-exception;
        r1 = r3;
        r3 = r2;
        goto L_0x01a6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.d(boolean):boolean");
    }

    private int k(String str) {
        int i = 0;
        synchronized (this.i) {
            try {
                Cursor rawQuery = this.i.getReadableDatabase().rawQuery(U[74], new String[]{str});
                if (rawQuery != null) {
                    try {
                        if (rawQuery.moveToNext()) {
                            i = rawQuery.getInt(0);
                        }
                    } catch (SQLiteDiskIOException e) {
                        throw e;
                    } catch (SQLiteDiskIOException e2) {
                        try {
                            aq.a(App.p, (int) R.string.error_msgstore_db_diskio);
                            throw e2;
                        } catch (Throwable th) {
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                        }
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLiteDiskIOException e22) {
                throw e22;
            } catch (SQLiteDiskIOException e222) {
                throw e222;
            } catch (Throwable th2) {
            }
        }
        return i;
    }

    public int y(String str) {
        sf sfVar = (sf) this.b.get(str);
        return sfVar == null ? 0 : sf.e(sfVar);
    }

    public void a(String str, String str2, long j) {
        Log.i(U[389] + str + U[390] + j);
        r();
        o3 o3Var = new o3(null);
        o3Var.c = str;
        o3Var.a = str2;
        o3Var.b = Long.valueOf(j);
        Message.obtain(this.K.b, 10, 0, 0, o3Var).sendToTarget();
    }

    public void d() {
        at.b(this.u, -1, "");
        at.b(this.m, -1, "");
        at.b(this.B, -1, "");
        at.b(this.x, -1, "");
        at.b(this.z, -1, "");
        at.b(this.f, -1, "");
        at.b(this.n, -1, "");
        at.b(this.s, -1, "");
        at.b(this.H, -1, "");
    }

    public static Long C() {
        File file = Q;
        return file.exists() ? Long.valueOf(file.length()) : null;
    }

    public ArrayList a(String str, c4 c4Var) {
        return a(str, -1, c4Var);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k() {
        /*
        r11_this = this;
        r2 = 0;
        r1 = 0;
        r0 = 1;
        r4 = com.whatsapp.m3.d;
        r3 = U;
        r5 = 431; // 0x1af float:6.04E-43 double:2.13E-321;
        r3 = r3[r5];
        com.whatsapp.util.Log.i(r3);
        r5 = new com.whatsapp.util.y;
        r3 = U;
        r6 = 434; // 0x1b2 float:6.08E-43 double:2.144E-321;
        r3 = r3[r6];
        r5.<init>(r3);
        r3 = Q;	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b5, SQLiteException -> 0x01af, all -> 0x01a7 }
        r3 = r3.getAbsolutePath();	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b5, SQLiteException -> 0x01af, all -> 0x01a7 }
        r6 = 0;
        r7 = 16;
        r3 = android.database.sqlite.SQLiteDatabase.openDatabase(r3, r6, r7);	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b5, SQLiteException -> 0x01af, all -> 0x01a7 }
        r2 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
        r6 = 432; // 0x1b0 float:6.05E-43 double:2.134E-321;
        r2 = r2[r6];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
        r6 = 0;
        r6 = r3.rawQuery(r2, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
        if (r6 == 0) goto L_0x01be;
    L_0x0033:
        r2 = new java.lang.StringBuilder;	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015b }
        r2.<init>();	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015b }
        r7 = U;	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015b }
        r8 = 438; // 0x1b6 float:6.14E-43 double:2.164E-321;
        r7 = r7[r8];	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015b }
        r2 = r2.append(r7);	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015b }
        r7 = r6.getCount();	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015b }
        r2 = r2.append(r7);	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015b }
        r2 = r2.toString();	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015b }
        com.whatsapp.util.Log.i(r2);	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015b }
        r2 = r6.moveToNext();	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015b }
        if (r2 == 0) goto L_0x0121;
    L_0x0057:
        r2 = 0;
        r2 = r6.getInt(r2);	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015b }
        r11.p = r2;	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015b }
        r2 = r11.p;	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015b }
        if (r2 <= 0) goto L_0x0068;
    L_0x0062:
        r2 = r11.p;	 Catch:{ SQLiteFullException -> 0x00b0, SQLiteException -> 0x015b }
        r2 = r2 + -1;
        r11.p = r2;	 Catch:{ SQLiteFullException -> 0x00b0, SQLiteException -> 0x015b }
    L_0x0068:
        r2 = new java.lang.StringBuilder;	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
        r2.<init>();	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
        r7 = U;	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
        r8 = 435; // 0x1b3 float:6.1E-43 double:2.15E-321;
        r7 = r7[r8];	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
        r2 = r2.append(r7);	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
        r7 = r11.p;	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
        r2 = r2.append(r7);	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
        r7 = U;	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
        r8 = 437; // 0x1b5 float:6.12E-43 double:2.16E-321;
        r7 = r7[r8];	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
        r2 = r2.append(r7);	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
        r8 = r5.c();	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
        r2 = r2.append(r8);	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
        r2 = r2.toString();	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
        com.whatsapp.util.Log.i(r2);	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
        r6.close();	 Catch:{ SQLiteFullException -> 0x00ef }
        r2 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x00ef }
        if (r2 == 0) goto L_0x00a2;
    L_0x009f:
        r3.close();	 Catch:{ SQLiteFullException -> 0x00ef }
    L_0x00a2:
        if (r3 == 0) goto L_0x00ad;
    L_0x00a4:
        r1 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x011d }
        if (r1 == 0) goto L_0x00ad;
    L_0x00aa:
        r3.close();	 Catch:{ SQLiteFullException -> 0x011f }
    L_0x00ad:
        return r0;
    L_0x00ae:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteFullException -> 0x00b0, SQLiteException -> 0x015b }
    L_0x00b0:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015b }
    L_0x00b2:
        r2 = move-exception;
        r5 = com.whatsapp.App.p;	 Catch:{ all -> 0x00b9 }
        com.whatsapp.util.aq.a(r5);	 Catch:{ all -> 0x00b9 }
        throw r2;	 Catch:{ all -> 0x00b9 }
    L_0x00b9:
        r2 = move-exception;
        r6.close();	 Catch:{ SQLiteFullException -> 0x018a }
        r5 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x018a }
        if (r5 == 0) goto L_0x00c6;
    L_0x00c3:
        r3.close();	 Catch:{ SQLiteFullException -> 0x018a }
    L_0x00c6:
        throw r2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
    L_0x00c7:
        r2 = move-exception;
        r2 = r3;
    L_0x00c9:
        r3 = U;	 Catch:{ all -> 0x01ab }
        r4 = 436; // 0x1b4 float:6.11E-43 double:2.154E-321;
        r3 = r3[r4];	 Catch:{ all -> 0x01ab }
        com.whatsapp.util.Log.w(r3);	 Catch:{ all -> 0x01ab }
        if (r2 == 0) goto L_0x00dd;
    L_0x00d4:
        r3 = r2.isOpen();	 Catch:{ SQLiteFullException -> 0x018e }
        if (r3 == 0) goto L_0x00dd;
    L_0x00da:
        r2.close();	 Catch:{ SQLiteFullException -> 0x0190 }
    L_0x00dd:
        if (r0 == 0) goto L_0x00ed;
    L_0x00df:
        r0 = U;	 Catch:{ SQLiteFullException -> 0x01a5 }
        r2 = 433; // 0x1b1 float:6.07E-43 double:2.14E-321;
        r0 = r0[r2];	 Catch:{ SQLiteFullException -> 0x01a5 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SQLiteFullException -> 0x01a5 }
        r0 = Q;	 Catch:{ SQLiteFullException -> 0x01a5 }
        r0.delete();	 Catch:{ SQLiteFullException -> 0x01a5 }
    L_0x00ed:
        r0 = r1;
        goto L_0x00ad;
    L_0x00ef:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
    L_0x00f1:
        r2 = move-exception;
    L_0x00f2:
        r5 = r2.toString();	 Catch:{ all -> 0x0110 }
        r6 = U;	 Catch:{ all -> 0x0110 }
        r7 = 441; // 0x1b9 float:6.18E-43 double:2.18E-321;
        r6 = r6[r7];	 Catch:{ all -> 0x0110 }
        r5 = r5.contains(r6);	 Catch:{ all -> 0x0110 }
        if (r5 == 0) goto L_0x010d;
    L_0x0102:
        r5 = U;	 Catch:{ all -> 0x0110 }
        r6 = 439; // 0x1b7 float:6.15E-43 double:2.17E-321;
        r5 = r5[r6];	 Catch:{ all -> 0x0110 }
        com.whatsapp.util.Log.w(r5);	 Catch:{ all -> 0x0110 }
        if (r4 == 0) goto L_0x0192;
    L_0x010d:
        throw r2;	 Catch:{ SQLiteFullException -> 0x010e }
    L_0x010e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0110 }
    L_0x0110:
        r0 = move-exception;
    L_0x0111:
        if (r3 == 0) goto L_0x011c;
    L_0x0113:
        r1 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x01a3 }
        if (r1 == 0) goto L_0x011c;
    L_0x0119:
        r3.close();	 Catch:{ SQLiteFullException -> 0x01a3 }
    L_0x011c:
        throw r0;
    L_0x011d:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteFullException -> 0x011f }
    L_0x011f:
        r0 = move-exception;
        throw r0;
    L_0x0121:
        r6.close();	 Catch:{ SQLiteFullException -> 0x0159 }
        r2 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x0159 }
        if (r2 == 0) goto L_0x01be;
    L_0x012a:
        r3.close();	 Catch:{ SQLiteFullException -> 0x0159 }
        r2 = r1;
    L_0x012e:
        r6 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
        r6.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
        r7 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
        r8 = 430; // 0x1ae float:6.03E-43 double:2.124E-321;
        r7 = r7[r8];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
        r6 = r6.append(r7);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
        r8 = r5.c();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
        r5 = r6.append(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
        r5 = r5.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
        com.whatsapp.util.Log.i(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
        if (r3 == 0) goto L_0x01b8;
    L_0x014e:
        r0 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x018c }
        if (r0 == 0) goto L_0x01b8;
    L_0x0154:
        r3.close();	 Catch:{ SQLiteFullException -> 0x018c }
        r0 = r2;
        goto L_0x00dd;
    L_0x0159:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
    L_0x015b:
        r2 = move-exception;
        r7 = r2.toString();	 Catch:{ all -> 0x00b9 }
        r8 = U;	 Catch:{ all -> 0x00b9 }
        r9 = 440; // 0x1b8 float:6.17E-43 double:2.174E-321;
        r8 = r8[r9];	 Catch:{ all -> 0x00b9 }
        r7 = r7.contains(r8);	 Catch:{ all -> 0x00b9 }
        if (r7 == 0) goto L_0x0177;
    L_0x016c:
        r7 = U;	 Catch:{ all -> 0x00b9 }
        r8 = 429; // 0x1ad float:6.01E-43 double:2.12E-321;
        r7 = r7[r8];	 Catch:{ all -> 0x00b9 }
        com.whatsapp.util.Log.w(r7);	 Catch:{ all -> 0x00b9 }
        if (r4 == 0) goto L_0x017a;
    L_0x0177:
        throw r2;	 Catch:{ SQLiteFullException -> 0x0178 }
    L_0x0178:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00b9 }
    L_0x017a:
        r6.close();	 Catch:{ SQLiteFullException -> 0x0188 }
        r2 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x0188 }
        if (r2 == 0) goto L_0x01bb;
    L_0x0183:
        r3.close();	 Catch:{ SQLiteFullException -> 0x0188 }
        r2 = r0;
        goto L_0x012e;
    L_0x0188:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
    L_0x018a:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7, SQLiteException -> 0x00f1 }
    L_0x018c:
        r0 = move-exception;
        throw r0;
    L_0x018e:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteFullException -> 0x0190 }
    L_0x0190:
        r0 = move-exception;
        throw r0;
    L_0x0192:
        if (r3 == 0) goto L_0x00dd;
    L_0x0194:
        r2 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x01a1 }
        if (r2 == 0) goto L_0x00dd;
    L_0x019a:
        r3.close();	 Catch:{ SQLiteFullException -> 0x019f }
        goto L_0x00dd;
    L_0x019f:
        r0 = move-exception;
        throw r0;
    L_0x01a1:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteFullException -> 0x019f }
    L_0x01a3:
        r0 = move-exception;
        throw r0;
    L_0x01a5:
        r0 = move-exception;
        throw r0;
    L_0x01a7:
        r0 = move-exception;
        r3 = r2;
        goto L_0x0111;
    L_0x01ab:
        r0 = move-exception;
        r3 = r2;
        goto L_0x0111;
    L_0x01af:
        r3 = move-exception;
        r10 = r3;
        r3 = r2;
        r2 = r10;
        goto L_0x00f2;
    L_0x01b5:
        r3 = move-exception;
        goto L_0x00c9;
    L_0x01b8:
        r0 = r2;
        goto L_0x00dd;
    L_0x01bb:
        r2 = r0;
        goto L_0x012e;
    L_0x01be:
        r2 = r1;
        goto L_0x012e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.k():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g(com.whatsapp.protocol.b r5) {
        /*
        r4_this = this;
        r0 = 0;
        r2 = java.lang.Boolean.valueOf(r0);
        r1 = 0;
        r3 = r4.i;
        monitor-enter(r3);
        r0 = r4.i;	 Catch:{ IOException -> 0x003d }
        r1 = r0.getWritableDatabase();	 Catch:{ IOException -> 0x003d }
        r4.z();	 Catch:{ IOException -> 0x003d }
        r0 = r4.E;	 Catch:{ IOException -> 0x003d }
        r1.beginTransaction();	 Catch:{ IOException -> 0x003d }
        a(r5, r0);	 Catch:{ IOException -> 0x003d }
        r0.execute();	 Catch:{ IOException -> 0x003d }
        r1.setTransactionSuccessful();	 Catch:{ IOException -> 0x003d }
        r0 = 1;
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ IOException -> 0x003d }
        if (r1 == 0) goto L_0x0030;
    L_0x0027:
        r2 = r1.inTransaction();	 Catch:{ IOException -> 0x0036 }
        if (r2 == 0) goto L_0x0030;
    L_0x002d:
        r1.endTransaction();	 Catch:{ IOException -> 0x0038 }
    L_0x0030:
        monitor-exit(r3);	 Catch:{ all -> 0x003a }
        r0 = r0.booleanValue();
        return r0;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x003a }
        throw r0;
    L_0x003d:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0050 }
        if (r1 == 0) goto L_0x0061;
    L_0x0043:
        r0 = r1.inTransaction();	 Catch:{ IOException -> 0x004e }
        if (r0 == 0) goto L_0x0061;
    L_0x0049:
        r1.endTransaction();	 Catch:{ IOException -> 0x004e }
        r0 = r2;
        goto L_0x0030;
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003a }
    L_0x0050:
        r0 = move-exception;
        if (r1 == 0) goto L_0x005c;
    L_0x0053:
        r2 = r1.inTransaction();	 Catch:{ IOException -> 0x005d }
        if (r2 == 0) goto L_0x005c;
    L_0x0059:
        r1.endTransaction();	 Catch:{ IOException -> 0x005f }
    L_0x005c:
        throw r0;	 Catch:{ all -> 0x003a }
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003a }
    L_0x0061:
        r0 = r2;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.g(com.whatsapp.protocol.b):boolean");
    }

    public boolean c(File file) {
        boolean z = false;
        try {
            if (file.exists()) {
                SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 16);
                String stringForQuery = DatabaseUtils.stringForQuery(openDatabase, U[362], null);
                openDatabase.close();
                z = U[363].equalsIgnoreCase(stringForQuery);
            }
        } catch (Exception e) {
            Log.e(U[364] + e.toString());
        }
        return z;
    }

    static o8 j(l7 l7Var) {
        return l7Var.y;
    }

    public ArrayList a(String str, int i, c4 c4Var) {
        int i2 = m3.d;
        Log.i(U[636] + str + U[638] + i);
        y yVar = new y();
        yVar.a(U[635] + str);
        ArrayList arrayList = new ArrayList();
        synchronized (this.i) {
            try {
                Cursor rawQuery = this.i.getReadableDatabase().rawQuery(U[639], new String[]{str});
                try {
                    if (rawQuery != null) {
                        do {
                            if (!rawQuery.moveToNext()) {
                                break;
                            }
                            if (c4Var != null) {
                                if (c4Var.a()) {
                                    break;
                                }
                            }
                            b a = a(rawQuery, str);
                            if (a.A != null) {
                                MediaData mediaData = (MediaData) a.A;
                                try {
                                    if (a.e.b || mediaData.transferred) {
                                        if (mediaData.file != null) {
                                            try {
                                                if (new File(Uri.fromFile(mediaData.file).getPath()).exists()) {
                                                    arrayList.add(a);
                                                    if (i >= 0) {
                                                        if (arrayList.size() >= i && i2 == 0) {
                                                            break;
                                                        }
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            } catch (SQLiteDiskIOException e) {
                                                throw e;
                                            } catch (SQLiteDiskIOException e2) {
                                                try {
                                                    throw e2;
                                                } catch (SQLiteDiskIOException e22) {
                                                    try {
                                                        throw e22;
                                                    } catch (SQLiteDiskIOException e222) {
                                                        throw e222;
                                                    }
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                } catch (SQLiteDiskIOException e2222) {
                                    throw e2222;
                                } catch (SQLiteDiskIOException e22222) {
                                    throw e22222;
                                }
                            }
                        } while (i2 == 0);
                        Log.e(U[637]);
                    } else {
                        Log.e(U[637]);
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } catch (SQLiteDiskIOException e222222) {
                    throw e222222;
                } catch (SQLiteDiskIOException e2222222) {
                    throw e2222222;
                } catch (SQLiteDiskIOException e22222222) {
                    try {
                        aq.a(App.p, (int) R.string.error_msgstore_db_diskio);
                        throw e22222222;
                    } catch (Throwable th) {
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                    }
                }
            } catch (SQLiteDiskIOException e222222222) {
                throw e222222222;
            } catch (SQLiteDiskIOException e2222222222) {
                throw e2222222222;
            } catch (Throwable th2) {
            }
        }
        yVar.c();
        Log.i(U[640] + arrayList.size());
        return arrayList;
    }

    public boolean q(String str) {
        sf sfVar = (sf) this.b.get(str);
        if (sfVar != null) {
            try {
                if (sf.g(sfVar)) {
                    return true;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return false;
    }

    public Cursor m(String str) {
        Cursor rawQuery;
        Log.i(U[41] + str);
        synchronized (this.i) {
            rawQuery = this.i.getReadableDatabase().rawQuery(U[42], new String[]{str});
        }
        return rawQuery;
    }

    private void r() {
        synchronized (this.K) {
            if (this.L) {
                return;
            }
            this.K.start();
            Log.i(U[372]);
            this.L = true;
        }
    }

    public boolean o(String str) {
        return r(str);
    }

    public int w() {
        return b(true).size();
    }

    private void a() {
        SQLiteDatabase sQLiteDatabase = null;
        synchronized (this.i) {
            try {
                sQLiteDatabase = this.i.getWritableDatabase();
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL(U[344]);
                sQLiteDatabase.execSQL(U[341]);
                sQLiteDatabase.execSQL(U[345]);
                sQLiteDatabase.delete(U[342], null, null);
                sQLiteDatabase.delete(U[343], null, null);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
        c.a(yf.a());
    }

    private boolean q() {
        boolean z;
        synchronized (this.i) {
            try {
                if (k()) {
                    if (f()) {
                        z = true;
                    }
                }
                z = false;
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
        return z;
    }

    static Handler a(l7 l7Var) {
        return l7Var.q;
    }

    public void l(String str) {
        sf sfVar = (sf) this.b.get(str);
        if (sfVar != null) {
            try {
                sf.c(sfVar, 1);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    private void J() {
        Log.i(U[350]);
        y yVar = new y();
        yVar.a(U[348]);
        try {
            this.i.getWritableDatabase().execSQL(U[351]);
        } catch (Exception e) {
            Log.e(U[352] + e.toString());
        }
        Log.i(U[349] + yVar.c());
    }

    public Map n(String str) {
        int i = m3.d;
        Map concurrentHashMap = new ConcurrentHashMap();
        synchronized (this.i) {
            Cursor rawQuery = this.i.getReadableDatabase().rawQuery(U[190], new String[]{str});
            if (rawQuery != null) {
                do {
                    try {
                        if (rawQuery.moveToNext()) {
                            String str2;
                            boolean z;
                            boolean z2;
                            CharSequence string = rawQuery.getString(0);
                            if (TextUtils.isEmpty(string)) {
                                str2 = App.P.d().e;
                            } else {
                                CharSequence charSequence = string;
                            }
                            if (rawQuery.getInt(1) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (rawQuery.getInt(2) == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            l6 l6Var = new l6(str2, z, z2);
                            concurrentHashMap.put(l6Var.d, l6Var);
                        }
                        break;
                    } catch (IllegalStateException e) {
                        throw e;
                    } catch (Throwable th) {
                        rawQuery.close();
                    }
                } while (i == 0);
                break;
                rawQuery.close();
            }
        }
        return concurrentHashMap;
    }

    static File K() {
        return Q;
    }

    public void a(boolean z) {
        int i = m3.d;
        Log.i(U[277] + z);
        for (sf sfVar : this.b.values()) {
            sf.a(sfVar, z);
            if (i != 0) {
                break;
            }
        }
        this.w.post(new a57(this, z));
        r();
        this.K.b.post(new sh(this, z));
    }

    public Cursor a(String str, byte b) {
        Cursor rawQuery;
        synchronized (this.i) {
            rawQuery = this.i.getReadableDatabase().rawQuery(U[489], new String[]{Byte.toString(b), str});
        }
        return rawQuery;
    }

    public l7(Context context) {
        boolean z = false;
        int i = m3.d;
        this.O = false;
        this.g = false;
        this.r = false;
        this.K = new a10(this, U[248]);
        this.L = false;
        this.D = new a1t(null);
        this.y = new o8();
        this.b = new ConcurrentHashMap();
        this.S = new u(250);
        this.d = new u(250);
        this.q = new pi(this);
        this.w = new z2(this);
        this.o = new ave(this);
        File file = new File(App.ao, U[242]);
        try {
            this.u = new File(file, U[241]);
            this.m = new File(file, U[240]);
            this.B = new File(file, U[247]);
            this.x = new File(file, U[249]);
            this.z = new File(file, U[245]);
            this.f = new File(file, U[250]);
            this.n = new File(file, U[244]);
            this.s = new File(file, U[246]);
            this.H = new File(file, U[243]);
            this.J = context;
            this.i = new wv(context);
            this.R = new HashMap();
            this.C = new ArrayList();
            this.e = new Hashtable();
            if (i != 0) {
                if (!DialogToastActivity.i) {
                    z = true;
                }
                DialogToastActivity.i = z;
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long c(java.lang.String r13, int r14) {
        /*
        r12_this = this;
        r2 = 1;
        r5 = com.whatsapp.m3.d;
        r0 = r12.b;
        r0 = r0.get(r13);
        r0 = (com.whatsapp.sf) r0;
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        r0 = r2;
    L_0x000f:
        return r0;
    L_0x0010:
        r6 = r12.i;
        monitor-enter(r6);
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b6 }
        r1.<init>();	 Catch:{ all -> 0x00b6 }
        r4 = U;	 Catch:{ all -> 0x00b6 }
        r7 = 648; // 0x288 float:9.08E-43 double:3.2E-321;
        r4 = r4[r7];	 Catch:{ all -> 0x00b6 }
        r4 = r1.append(r4);	 Catch:{ all -> 0x00b6 }
        r8 = com.whatsapp.sf.i(r0);	 Catch:{ all -> 0x00b6 }
        r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r1 != 0) goto L_0x00ac;
    L_0x002a:
        r1 = "";
    L_0x002c:
        r1 = r4.append(r1);	 Catch:{ all -> 0x00b6 }
        r4 = U;	 Catch:{ all -> 0x00b6 }
        r7 = 645; // 0x285 float:9.04E-43 double:3.187E-321;
        r4 = r4[r7];	 Catch:{ all -> 0x00b6 }
        r1 = r1.append(r4);	 Catch:{ all -> 0x00b6 }
        r1 = r1.append(r14);	 Catch:{ all -> 0x00b6 }
        r7 = r1.toString();	 Catch:{ all -> 0x00b6 }
        r1 = 2;
        r4 = new java.lang.String[r1];	 Catch:{ all -> 0x00b6 }
        r1 = 0;
        r4[r1] = r13;	 Catch:{ all -> 0x00b6 }
        r1 = 1;
        r8 = com.whatsapp.sf.i(r0);	 Catch:{ all -> 0x00b6 }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x00b6 }
        r4[r1] = r8;	 Catch:{ all -> 0x00b6 }
        r1 = 1;
        r1 = new java.lang.String[r1];	 Catch:{ all -> 0x00b6 }
        r8 = 0;
        r1[r8] = r13;	 Catch:{ all -> 0x00b6 }
        r8 = r12.i;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b4 }
        r8 = r8.getReadableDatabase();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b4 }
        r10 = com.whatsapp.sf.i(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b4 }
        r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x00b9;
    L_0x0067:
        r1 = r8.rawQuery(r7, r1);	 Catch:{ all -> 0x00b6 }
        if (r1 == 0) goto L_0x009c;
    L_0x006d:
        r2 = r1.moveToLast();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bb }
        if (r2 == 0) goto L_0x007d;
    L_0x0073:
        r2 = 0;
        r2 = r1.getLong(r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bb }
        com.whatsapp.sf.c(r0, r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bb }
        if (r5 == 0) goto L_0x0097;
    L_0x007d:
        r2 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bd }
        r2.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bd }
        r3 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bd }
        r4 = 646; // 0x286 float:9.05E-43 double:3.19E-321;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bd }
        r2 = r2.append(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bd }
        r2 = r2.append(r13);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bd }
        r2 = r2.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bd }
        com.whatsapp.util.Log.w(r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bd }
    L_0x0097:
        r1.close();	 Catch:{ all -> 0x00b6 }
        if (r5 == 0) goto L_0x00a5;
    L_0x009c:
        r1 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00ce }
        r2 = 647; // 0x287 float:9.07E-43 double:3.197E-321;
        r1 = r1[r2];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00ce }
        com.whatsapp.util.Log.e(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00ce }
    L_0x00a5:
        monitor-exit(r6);	 Catch:{ all -> 0x00b6 }
        r0 = com.whatsapp.sf.i(r0);
        goto L_0x000f;
    L_0x00ac:
        r1 = U;	 Catch:{ all -> 0x00b6 }
        r7 = 644; // 0x284 float:9.02E-43 double:3.18E-321;
        r1 = r1[r7];	 Catch:{ all -> 0x00b6 }
        goto L_0x002c;
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x00b6 }
        throw r0;
    L_0x00b9:
        r1 = r4;
        goto L_0x0067;
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        r12.L();	 Catch:{ all -> 0x00c9 }
        r2 = new java.lang.AssertionError;	 Catch:{ all -> 0x00c9 }
        r2.<init>(r0);	 Catch:{ all -> 0x00c9 }
        throw r2;	 Catch:{ all -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        r1.close();	 Catch:{ all -> 0x00b6 }
        throw r0;	 Catch:{ all -> 0x00b6 }
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00b6 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.c(java.lang.String, int):long");
    }

    public void b(String str, boolean z) {
        a(str, z, true);
    }

    public ArrayList G() {
        int i = m3.d;
        ArrayList arrayList = new ArrayList();
        try {
            if (ge.p > 0 && ge.p <= System.currentTimeMillis()) {
                Cursor rawQuery = this.i.getReadableDatabase().rawQuery(U[70], new String[]{String.valueOf(ge.p)});
                if (rawQuery != null) {
                    int columnIndex = rawQuery.getColumnIndex(U[68]);
                    int columnIndex2 = rawQuery.getColumnIndex(U[69]);
                    while (rawQuery.moveToNext()) {
                        try {
                            String string = rawQuery.getString(columnIndex);
                            if (string == null) {
                                Log.w(U[71]);
                                if (i == 0) {
                                    continue;
                                }
                            }
                            if (App.E(string) || i != 0) {
                                arrayList.add(new h1(a(rawQuery, string), rawQuery.getLong(columnIndex2)));
                                if (i != 0) {
                                    break;
                                }
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        } catch (SQLiteDatabaseCorruptException e2) {
                            L();
                            throw new AssertionError(e2);
                        } catch (SQLiteFullException e3) {
                            aq.a(App.p);
                            throw e3;
                        } catch (IllegalStateException e4) {
                            throw e4;
                        } catch (IllegalStateException e42) {
                            Log.i(U[72] + e42.toString());
                            rawQuery.close();
                        } catch (Throwable th) {
                            rawQuery.close();
                        }
                    }
                    rawQuery.close();
                }
                Log.i(U[73] + arrayList.size());
            }
            return arrayList;
        } catch (IllegalStateException e5) {
            throw e5;
        } catch (IllegalStateException e52) {
            throw e52;
        }
    }

    static void a(l7 l7Var, b bVar, long j) {
        l7Var.a(bVar, j);
    }

    public Cursor a(String str, int i, mi miVar) {
        sf sfVar = (sf) this.b.get(str);
        try {
            long j;
            StringBuilder append;
            String str2;
            String toString;
            String[] strArr;
            String[] strArr2;
            SQLiteDatabase readableDatabase;
            Cursor nfVar;
            if (sfVar == null) {
                if (m3.d == 0) {
                    j = 1;
                    append = new StringBuilder().append(U[641]);
                    if (j != 1) {
                        str2 = "";
                    } else {
                        str2 = U[643];
                    }
                    toString = append.append(str2).append(U[642]).toString();
                    strArr = new String[]{str, String.valueOf(j)};
                    strArr2 = new String[]{str};
                    synchronized (this.i) {
                        readableDatabase = this.i.getReadableDatabase();
                        if (j != 1) {
                            strArr2 = strArr;
                        }
                        nfVar = new nf(readableDatabase.rawQuery(toString, strArr2), miVar);
                    }
                    return nfVar;
                }
            }
            if (sf.i(sfVar) == 1) {
                sf.c(sfVar, c(str, i));
            }
            j = sf.i(sfVar);
            try {
                append = new StringBuilder().append(U[641]);
                if (j != 1) {
                    str2 = U[643];
                } else {
                    str2 = "";
                }
                toString = append.append(str2).append(U[642]).toString();
                strArr = new String[]{str, String.valueOf(j)};
                strArr2 = new String[]{str};
                synchronized (this.i) {
                    readableDatabase = this.i.getReadableDatabase();
                    if (j != 1) {
                        strArr2 = strArr;
                    }
                    nfVar = new nf(readableDatabase.rawQuery(toString, strArr2), miVar);
                }
                return nfVar;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void a(String str, String str2) {
        Log.i(U[77] + str);
        r();
        o3 o3Var = new o3(null);
        o3Var.c = str;
        o3Var.a = str2;
        Message.obtain(this.K.b, 10, 0, 0, o3Var).sendToTarget();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r7, com.whatsapp.protocol.b r8) {
        /*
        r6_this = this;
        r3 = 1;
        r1 = com.whatsapp.m3.d;
        r0 = r6.e;
        r0 = r0.get(r8);
        r0 = (long[]) r0;
        if (r0 == 0) goto L_0x0014;
    L_0x000d:
        r2 = 1;
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x007d }
        r0[r2] = r4;	 Catch:{ IllegalStateException -> 0x007d }
    L_0x0014:
        r0 = U;
        r2 = 444; // 0x1bc float:6.22E-43 double:2.194E-321;
        r0 = r0[r2];
        r6.w(r0);
        r0 = r6.b(r8, r3);
        r2 = r0.b;	 Catch:{ IllegalStateException -> 0x007f }
        if (r2 == 0) goto L_0x0060;
    L_0x0025:
        r2 = r6.e;	 Catch:{ IllegalStateException -> 0x0081 }
        r2.remove(r8);	 Catch:{ IllegalStateException -> 0x0081 }
        r2 = U;	 Catch:{ IllegalStateException -> 0x0081 }
        r3 = 443; // 0x1bb float:6.21E-43 double:2.19E-321;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0081 }
        r6.w(r2);	 Catch:{ IllegalStateException -> 0x0081 }
        r2 = r0.c;	 Catch:{ IllegalStateException -> 0x0081 }
        if (r2 == 0) goto L_0x0044;
    L_0x0037:
        r2 = r6.q;	 Catch:{ IllegalStateException -> 0x0083 }
        r3 = 4;
        r4 = 0;
        r2 = android.os.Message.obtain(r2, r3, r7, r4, r8);	 Catch:{ IllegalStateException -> 0x0083 }
        r2.sendToTarget();	 Catch:{ IllegalStateException -> 0x0083 }
        if (r1 == 0) goto L_0x007c;
    L_0x0044:
        r2 = r6.q;	 Catch:{ IllegalStateException -> 0x0085 }
        r3 = 5;
        r4 = 0;
        r2 = android.os.Message.obtain(r2, r3, r7, r4, r8);	 Catch:{ IllegalStateException -> 0x0085 }
        r2.sendToTarget();	 Catch:{ IllegalStateException -> 0x0085 }
        r2 = r0.a;	 Catch:{ IllegalStateException -> 0x0085 }
        if (r2 == 0) goto L_0x007c;
    L_0x0053:
        r2 = r6.q;	 Catch:{ IllegalStateException -> 0x0087 }
        r3 = 6;
        r4 = 0;
        r2 = android.os.Message.obtain(r2, r3, r7, r4, r8);	 Catch:{ IllegalStateException -> 0x0087 }
        r2.sendToTarget();	 Catch:{ IllegalStateException -> 0x0087 }
        if (r1 == 0) goto L_0x007c;
    L_0x0060:
        r0 = r0.d;	 Catch:{ IllegalStateException -> 0x0089 }
        if (r0 == 0) goto L_0x007c;
    L_0x0064:
        r0 = r6.e;	 Catch:{ IllegalStateException -> 0x0089 }
        r0.remove(r8);	 Catch:{ IllegalStateException -> 0x0089 }
        r0 = U;	 Catch:{ IllegalStateException -> 0x0089 }
        r1 = 442; // 0x1ba float:6.2E-43 double:2.184E-321;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0089 }
        r6.w(r0);	 Catch:{ IllegalStateException -> 0x0089 }
        r0 = r6.q;	 Catch:{ IllegalStateException -> 0x0089 }
        r1 = 3;
        r0 = android.os.Message.obtain(r0, r1, r8);	 Catch:{ IllegalStateException -> 0x0089 }
        r0.sendToTarget();	 Catch:{ IllegalStateException -> 0x0089 }
    L_0x007c:
        return;
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0089 }
    L_0x0089:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(int, com.whatsapp.protocol.b):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(com.whatsapp.protocol.b r7) {
        /*
        r6_this = this;
        r2 = r6.i;
        monitor-enter(r2);
        r6.z();	 Catch:{ all -> 0x0053 }
        r0 = r7.a;	 Catch:{ all -> 0x0053 }
        r1 = 9;
        if (r0 == r1) goto L_0x0022;
    L_0x000c:
        r0 = r7.a;	 Catch:{ IllegalStateException -> 0x004d }
        r1 = 10;
        if (r0 == r1) goto L_0x0022;
    L_0x0012:
        r0 = r7.a;	 Catch:{ IllegalStateException -> 0x004d }
        r1 = 11;
        if (r0 == r1) goto L_0x0022;
    L_0x0018:
        r0 = r7.a;	 Catch:{ IllegalStateException -> 0x004f }
        r1 = 12;
        if (r0 == r1) goto L_0x0022;
    L_0x001e:
        r0 = r7.a;	 Catch:{ IllegalStateException -> 0x0051 }
        if (r0 != 0) goto L_0x004b;
    L_0x0022:
        r3 = r6.T;	 Catch:{ all -> 0x0053 }
        r0 = 1;
        r1 = r7.a;	 Catch:{ IllegalStateException -> 0x0056 }
        r4 = (long) r1;	 Catch:{ IllegalStateException -> 0x0056 }
        r3.bindLong(r0, r4);	 Catch:{ IllegalStateException -> 0x0056 }
        r0 = 2;
        r1 = r7.e;	 Catch:{ IllegalStateException -> 0x0056 }
        r1 = r1.c;	 Catch:{ IllegalStateException -> 0x0056 }
        r3.bindString(r0, r1);	 Catch:{ IllegalStateException -> 0x0056 }
        r4 = 3;
        r0 = r7.e;	 Catch:{ IllegalStateException -> 0x0056 }
        r0 = r0.b;	 Catch:{ IllegalStateException -> 0x0056 }
        if (r0 == 0) goto L_0x0058;
    L_0x003a:
        r0 = 1;
    L_0x003c:
        r3.bindLong(r4, r0);	 Catch:{ all -> 0x0053 }
        r0 = 4;
        r1 = r7.e;	 Catch:{ all -> 0x0053 }
        r1 = r1.a;	 Catch:{ all -> 0x0053 }
        r3.bindString(r0, r1);	 Catch:{ all -> 0x0053 }
        r0 = com.whatsapp.m3.d;	 Catch:{ all -> 0x0053 }
        if (r0 == 0) goto L_0x005b;
    L_0x004b:
        monitor-exit(r2);	 Catch:{ all -> 0x0053 }
    L_0x004c:
        return;
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0053 }
        throw r0;
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0053 }
    L_0x0058:
        r0 = 0;
        goto L_0x003c;
    L_0x005b:
        r3.execute();	 Catch:{ all -> 0x0053 }
        monitor-exit(r2);	 Catch:{ all -> 0x0053 }
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.h(com.whatsapp.protocol.b):void");
    }

    public void a(int i, byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        this.R.put(new _o(str, bArr2), new sb(i, bArr, bArr3));
    }

    public void a(String str, b bVar) {
        try {
            Object obj;
            StringBuilder append = new StringBuilder().append(U[22]).append(str).append("/");
            if (bVar != null) {
                obj = bVar.e;
            } else {
                obj = null;
            }
            Log.i(append.append(obj).toString());
            r();
            sf sfVar = (sf) this.b.get(str);
            if (sfVar != null) {
                long b;
                long e = e(bVar);
                long a = sf.a(sfVar);
                if (e == 1) {
                    try {
                        b = sf.b(sfVar);
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
                b = e;
                if (a < b) {
                    try {
                        this.K.b.post(new c2(this, str, b));
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                }
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    private static void b(b bVar, SQLiteStatement sQLiteStatement) {
        sQLiteStatement.bindLong(1, (long) bVar.a);
        sQLiteStatement.bindLong(2, 2);
        a(bVar, sQLiteStatement, 4, 3);
        sQLiteStatement.bindLong(5, bVar.D);
        wv.a(6, bVar.t, sQLiteStatement);
        wv.a(7, bVar.s, sQLiteStatement);
        sQLiteStatement.bindLong(8, (long) bVar.j);
        sQLiteStatement.bindLong(9, bVar.k);
        wv.a(10, bVar.H, sQLiteStatement);
        wv.a(11, bVar.v, sQLiteStatement);
        wv.a(12, bVar.z, sQLiteStatement);
        sQLiteStatement.bindLong(13, (long) bVar.p);
        sQLiteStatement.bindLong(14, (long) bVar.w);
        sQLiteStatement.bindDouble(15, bVar.K);
        sQLiteStatement.bindDouble(16, bVar.G);
        wv.a(17, bVar.A, sQLiteStatement);
        sQLiteStatement.bindString(18, bVar.e.a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.database.sqlite.SQLiteDatabase r13, com.whatsapp.protocol.b r14) {
        /*
        r12_this = this;
        r2 = com.whatsapp.m3.d;
        r0 = r14.a;	 Catch:{ IllegalStateException -> 0x001c }
        r1 = 6;
        if (r0 != r1) goto L_0x001b;
    L_0x0007:
        r0 = r14.e;	 Catch:{ IllegalStateException -> 0x001c }
        r0 = r0.b;	 Catch:{ IllegalStateException -> 0x001c }
        if (r0 == 0) goto L_0x001b;
    L_0x000d:
        r0 = com.whatsapp.App.P;
        r1 = r14.F;
        r3 = r0.h(r1);
        r0 = r14.k;	 Catch:{ IllegalStateException -> 0x061f }
        r0 = (int) r0;
        switch(r0) {
            case 2: goto L_0x04c0;
            case 3: goto L_0x04c0;
            case 4: goto L_0x001e;
            case 5: goto L_0x01f8;
            case 6: goto L_0x001b;
            case 7: goto L_0x01f8;
            case 8: goto L_0x001b;
            case 9: goto L_0x05aa;
            case 10: goto L_0x03d6;
            case 11: goto L_0x001b;
            case 12: goto L_0x00e9;
            case 13: goto L_0x028c;
            case 14: goto L_0x028c;
            case 15: goto L_0x034b;
            case 16: goto L_0x034b;
            case 17: goto L_0x0535;
            default: goto L_0x001b;
        };
    L_0x001b:
        return;
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        if (r3 == 0) goto L_0x0623;
    L_0x0020:
        r0 = "";
    L_0x0022:
        r1 = new android.content.ContentValues;
        r4 = 3;
        r1.<init>(r4);
        r4 = U;
        r5 = 542; // 0x21e float:7.6E-43 double:2.68E-321;
        r4 = r4[r5];
        r5 = r14.e;
        r5 = r5.c;
        r1.put(r4, r5);
        r4 = U;
        r5 = 550; // 0x226 float:7.71E-43 double:2.717E-321;
        r4 = r4[r5];
        r1.put(r4, r0);
        r4 = U;
        r5 = 547; // 0x223 float:7.67E-43 double:2.703E-321;
        r4 = r4[r5];
        r5 = 0;
        r5 = java.lang.Boolean.valueOf(r5);
        r1.put(r4, r5);
        r4 = 2;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = r14.e;
        r6 = r6.c;
        r4[r5] = r6;
        r5 = 1;
        r4[r5] = r0;
        r0 = r14.e;
        r0 = r0.c;
        r0 = r12.b(r13, r0);
        r5 = U;	 Catch:{ IllegalStateException -> 0x0627 }
        r6 = 490; // 0x1ea float:6.87E-43 double:2.42E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x0627 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x0627 }
        r7 = 521; // 0x209 float:7.3E-43 double:2.574E-321;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x0627 }
        r4 = r13.update(r5, r1, r6, r4);	 Catch:{ IllegalStateException -> 0x0627 }
        if (r4 != 0) goto L_0x007d;
    L_0x0073:
        r4 = U;	 Catch:{ IllegalStateException -> 0x0627 }
        r5 = 527; // 0x20f float:7.38E-43 double:2.604E-321;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0627 }
        r5 = 0;
        r13.insert(r4, r5, r1);	 Catch:{ IllegalStateException -> 0x0627 }
    L_0x007d:
        r1 = r14.e;
        r1 = r1.c;
        r1 = r12.b(r13, r1);
        r4 = android.text.TextUtils.equals(r0, r1);
        if (r4 != 0) goto L_0x001b;
    L_0x008b:
        r4 = new android.content.ContentValues;
        r5 = 6;
        r4.<init>(r5);
        r5 = U;
        r6 = 544; // 0x220 float:7.62E-43 double:2.69E-321;
        r5 = r5[r6];
        r6 = java.lang.System.currentTimeMillis();
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 / r8;
        r6 = java.lang.Long.valueOf(r6);
        r4.put(r5, r6);
        r5 = U;
        r6 = 558; // 0x22e float:7.82E-43 double:2.757E-321;
        r5 = r5[r6];
        r6 = r14.e;
        r6 = r6.c;
        r4.put(r5, r6);
        r5 = U;
        r6 = 570; // 0x23a float:7.99E-43 double:2.816E-321;
        r5 = r5[r6];
        r6 = r14.F;
        r4.put(r5, r6);
        r5 = U;
        r6 = 538; // 0x21a float:7.54E-43 double:2.66E-321;
        r5 = r5[r6];
        r6 = 1;
        r6 = java.lang.Integer.valueOf(r6);
        r4.put(r5, r6);
        r5 = U;
        r6 = 522; // 0x20a float:7.31E-43 double:2.58E-321;
        r5 = r5[r6];
        r4.put(r5, r0);
        r0 = U;
        r5 = 502; // 0x1f6 float:7.03E-43 double:2.48E-321;
        r0 = r0[r5];
        r4.put(r0, r1);
        r0 = U;
        r1 = 493; // 0x1ed float:6.91E-43 double:2.436E-321;
        r0 = r0[r1];
        r1 = 0;
        r13.insert(r0, r1, r4);
        if (r2 == 0) goto L_0x001b;
    L_0x00e9:
        r0 = r14.A;
        r0 = (java.util.Vector) r0;
        r1 = r14.e;
        r1 = r1.c;
        r1 = r12.b(r13, r1);
        r4 = new java.util.HashSet;
        r4.<init>();
        r5 = r0.iterator();
    L_0x00fe:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0188;
    L_0x0104:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r6 = com.whatsapp.App.P;	 Catch:{ IllegalStateException -> 0x0629 }
        r6 = r6.h(r0);	 Catch:{ IllegalStateException -> 0x0629 }
        if (r6 == 0) goto L_0x0114;
    L_0x0112:
        r0 = "";
    L_0x0114:
        r6 = new android.content.ContentValues;
        r7 = 3;
        r6.<init>(r7);
        r7 = U;
        r8 = 537; // 0x219 float:7.52E-43 double:2.653E-321;
        r7 = r7[r8];
        r8 = r14.e;
        r8 = r8.c;
        r6.put(r7, r8);
        r7 = U;
        r8 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r7 = r7[r8];
        r6.put(r7, r0);
        r7 = U;
        r8 = 562; // 0x232 float:7.88E-43 double:2.777E-321;
        r7 = r7[r8];
        r8 = 0;
        r8 = java.lang.Boolean.valueOf(r8);
        r6.put(r7, r8);
        r7 = U;
        r8 = 552; // 0x228 float:7.74E-43 double:2.727E-321;
        r7 = r7[r8];
        r8 = r14.e;
        r8 = r8.c;
        r8 = com.whatsapp.bd.c(r8, r0);
        r8 = java.lang.Boolean.valueOf(r8);
        r6.put(r7, r8);
        r7 = 2;
        r7 = new java.lang.String[r7];
        r8 = 0;
        r9 = r14.e;
        r9 = r9.c;
        r7[r8] = r9;
        r8 = 1;
        r7[r8] = r0;
        r8 = U;
        r9 = 497; // 0x1f1 float:6.96E-43 double:2.456E-321;
        r8 = r8[r9];
        r9 = U;
        r10 = 566; // 0x236 float:7.93E-43 double:2.796E-321;
        r9 = r9[r10];
        r7 = r13.update(r8, r6, r9, r7);
        if (r7 != 0) goto L_0x0186;
    L_0x0172:
        r7 = U;
        r8 = 534; // 0x216 float:7.48E-43 double:2.64E-321;
        r7 = r7[r8];
        r8 = 0;
        r6 = r13.insert(r7, r8, r6);
        r8 = 0;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 < 0) goto L_0x0186;
    L_0x0183:
        r4.add(r0);	 Catch:{ IllegalStateException -> 0x062b }
    L_0x0186:
        if (r2 == 0) goto L_0x00fe;
    L_0x0188:
        r0 = r14.e;
        r0 = r0.c;
        r0 = r12.b(r13, r0);
        r5 = android.text.TextUtils.equals(r1, r0);
        if (r5 != 0) goto L_0x001b;
    L_0x0196:
        r5 = ",";
        r4 = android.text.TextUtils.join(r5, r4);
        r5 = new android.content.ContentValues;
        r6 = 6;
        r5.<init>(r6);
        r6 = U;	 Catch:{ IllegalStateException -> 0x062d }
        r7 = 523; // 0x20b float:7.33E-43 double:2.584E-321;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x062d }
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x062d }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 / r10;
        r7 = java.lang.Long.valueOf(r8);	 Catch:{ IllegalStateException -> 0x062d }
        r5.put(r6, r7);	 Catch:{ IllegalStateException -> 0x062d }
        r6 = U;	 Catch:{ IllegalStateException -> 0x062d }
        r7 = 573; // 0x23d float:8.03E-43 double:2.83E-321;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x062d }
        r7 = r14.e;	 Catch:{ IllegalStateException -> 0x062d }
        r7 = r7.c;	 Catch:{ IllegalStateException -> 0x062d }
        r5.put(r6, r7);	 Catch:{ IllegalStateException -> 0x062d }
        r6 = U;	 Catch:{ IllegalStateException -> 0x062d }
        r7 = 551; // 0x227 float:7.72E-43 double:2.72E-321;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x062d }
        r5.put(r6, r4);	 Catch:{ IllegalStateException -> 0x062d }
        r4 = U;	 Catch:{ IllegalStateException -> 0x062d }
        r6 = 539; // 0x21b float:7.55E-43 double:2.663E-321;
        r4 = r4[r6];	 Catch:{ IllegalStateException -> 0x062d }
        r6 = 1;
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IllegalStateException -> 0x062d }
        r5.put(r4, r6);	 Catch:{ IllegalStateException -> 0x062d }
        r4 = U;	 Catch:{ IllegalStateException -> 0x062d }
        r6 = 494; // 0x1ee float:6.92E-43 double:2.44E-321;
        r4 = r4[r6];	 Catch:{ IllegalStateException -> 0x062d }
        r5.put(r4, r1);	 Catch:{ IllegalStateException -> 0x062d }
        r1 = U;	 Catch:{ IllegalStateException -> 0x062d }
        r4 = 540; // 0x21c float:7.57E-43 double:2.67E-321;
        r1 = r1[r4];	 Catch:{ IllegalStateException -> 0x062d }
        r5.put(r1, r0);	 Catch:{ IllegalStateException -> 0x062d }
        r0 = U;	 Catch:{ IllegalStateException -> 0x062d }
        r1 = 535; // 0x217 float:7.5E-43 double:2.643E-321;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x062d }
        r1 = 0;
        r13.insert(r0, r1, r5);	 Catch:{ IllegalStateException -> 0x062d }
        if (r2 == 0) goto L_0x001b;
    L_0x01f8:
        r0 = 2;
        r1 = new java.lang.String[r0];	 Catch:{ IllegalStateException -> 0x062f }
        r0 = 0;
        r4 = r14.e;	 Catch:{ IllegalStateException -> 0x062f }
        r4 = r4.c;	 Catch:{ IllegalStateException -> 0x062f }
        r1[r0] = r4;	 Catch:{ IllegalStateException -> 0x062f }
        r4 = 1;
        if (r3 == 0) goto L_0x0631;
    L_0x0205:
        r0 = "";
    L_0x0207:
        r1[r4] = r0;
        r0 = r14.e;
        r0 = r0.c;
        r0 = r12.b(r13, r0);
        r4 = U;
        r5 = 546; // 0x222 float:7.65E-43 double:2.7E-321;
        r4 = r4[r5];
        r5 = U;
        r6 = 560; // 0x230 float:7.85E-43 double:2.767E-321;
        r5 = r5[r6];
        r13.delete(r4, r5, r1);
        r1 = r14.e;
        r1 = r1.c;
        r1 = r12.b(r13, r1);
        r4 = android.text.TextUtils.equals(r0, r1);
        if (r4 != 0) goto L_0x001b;
    L_0x022e:
        r4 = new android.content.ContentValues;
        r5 = 6;
        r4.<init>(r5);
        r5 = U;
        r6 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r5 = r5[r6];
        r6 = java.lang.System.currentTimeMillis();
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 / r8;
        r6 = java.lang.Long.valueOf(r6);
        r4.put(r5, r6);
        r5 = U;
        r6 = 536; // 0x218 float:7.51E-43 double:2.65E-321;
        r5 = r5[r6];
        r6 = r14.e;
        r6 = r6.c;
        r4.put(r5, r6);
        r5 = U;
        r6 = 507; // 0x1fb float:7.1E-43 double:2.505E-321;
        r5 = r5[r6];
        r6 = r14.F;
        r4.put(r5, r6);
        r5 = U;
        r6 = 554; // 0x22a float:7.76E-43 double:2.737E-321;
        r5 = r5[r6];
        r6 = 2;
        r6 = java.lang.Integer.valueOf(r6);
        r4.put(r5, r6);
        r5 = U;
        r6 = 499; // 0x1f3 float:6.99E-43 double:2.465E-321;
        r5 = r5[r6];
        r4.put(r5, r0);
        r0 = U;
        r5 = 567; // 0x237 float:7.95E-43 double:2.8E-321;
        r0 = r0[r5];
        r4.put(r0, r1);
        r0 = U;
        r1 = 524; // 0x20c float:7.34E-43 double:2.59E-321;
        r0 = r0[r1];
        r1 = 0;
        r13.insert(r0, r1, r4);
        if (r2 == 0) goto L_0x001b;
    L_0x028c:
        r0 = r14.A;
        r0 = (java.util.Vector) r0;
        r1 = r14.e;
        r1 = r1.c;
        r4 = r12.b(r13, r1);
        r5 = new java.util.HashSet;
        r5.<init>();
        r6 = r0.iterator();
    L_0x02a1:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x02db;
    L_0x02a7:
        r0 = r6.next();
        r0 = (java.lang.String) r0;
        r1 = com.whatsapp.App.P;
        r1 = r1.h(r0);
        r7 = 2;
        r7 = new java.lang.String[r7];	 Catch:{ IllegalStateException -> 0x0635 }
        r8 = 0;
        r9 = r14.e;	 Catch:{ IllegalStateException -> 0x0635 }
        r9 = r9.c;	 Catch:{ IllegalStateException -> 0x0635 }
        r7[r8] = r9;	 Catch:{ IllegalStateException -> 0x0635 }
        r8 = 1;
        if (r1 == 0) goto L_0x0637;
    L_0x02c0:
        r1 = "";
    L_0x02c2:
        r7[r8] = r1;
        r1 = U;
        r8 = 531; // 0x213 float:7.44E-43 double:2.623E-321;
        r1 = r1[r8];
        r8 = U;
        r9 = 515; // 0x203 float:7.22E-43 double:2.544E-321;
        r8 = r8[r9];
        r1 = r13.delete(r1, r8, r7);
        if (r1 <= 0) goto L_0x02d9;
    L_0x02d6:
        r5.add(r0);	 Catch:{ IllegalStateException -> 0x063a }
    L_0x02d9:
        if (r2 == 0) goto L_0x02a1;
    L_0x02db:
        r0 = r14.e;
        r0 = r0.c;
        r0 = r12.b(r13, r0);
        r1 = android.text.TextUtils.equals(r4, r0);
        if (r1 != 0) goto L_0x001b;
    L_0x02e9:
        r1 = ",";
        r1 = android.text.TextUtils.join(r1, r5);
        r5 = new android.content.ContentValues;
        r6 = 6;
        r5.<init>(r6);
        r6 = U;
        r7 = 508; // 0x1fc float:7.12E-43 double:2.51E-321;
        r6 = r6[r7];
        r8 = java.lang.System.currentTimeMillis();
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 / r10;
        r7 = java.lang.Long.valueOf(r8);
        r5.put(r6, r7);
        r6 = U;
        r7 = 495; // 0x1ef float:6.94E-43 double:2.446E-321;
        r6 = r6[r7];
        r7 = r14.e;
        r7 = r7.c;
        r5.put(r6, r7);
        r6 = U;
        r7 = 504; // 0x1f8 float:7.06E-43 double:2.49E-321;
        r6 = r6[r7];
        r5.put(r6, r1);
        r1 = U;
        r6 = 555; // 0x22b float:7.78E-43 double:2.74E-321;
        r1 = r1[r6];
        r6 = 2;
        r6 = java.lang.Integer.valueOf(r6);
        r5.put(r1, r6);
        r1 = U;
        r6 = 556; // 0x22c float:7.79E-43 double:2.747E-321;
        r1 = r1[r6];
        r5.put(r1, r4);
        r1 = U;
        r4 = 541; // 0x21d float:7.58E-43 double:2.673E-321;
        r1 = r1[r4];
        r5.put(r1, r0);
        r0 = U;
        r1 = 506; // 0x1fa float:7.09E-43 double:2.5E-321;
        r0 = r0[r1];
        r1 = 0;
        r13.insert(r0, r1, r5);
        if (r2 == 0) goto L_0x001b;
    L_0x034b:
        r0 = r14.A;
        r0 = (java.util.Vector) r0;
        r4 = r0.iterator();
    L_0x0353:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x03d4;
    L_0x0359:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r1 = com.whatsapp.App.P;
        r1 = r1.h(r0);
        if (r1 == 0) goto L_0x0369;
    L_0x0367:
        r0 = "";
    L_0x0369:
        r5 = new android.content.ContentValues;
        r1 = 3;
        r5.<init>(r1);
        r1 = U;	 Catch:{ IllegalStateException -> 0x063e }
        r6 = 561; // 0x231 float:7.86E-43 double:2.77E-321;
        r1 = r1[r6];	 Catch:{ IllegalStateException -> 0x063e }
        r6 = r14.e;	 Catch:{ IllegalStateException -> 0x063e }
        r6 = r6.c;	 Catch:{ IllegalStateException -> 0x063e }
        r5.put(r1, r6);	 Catch:{ IllegalStateException -> 0x063e }
        r1 = U;	 Catch:{ IllegalStateException -> 0x063e }
        r6 = 571; // 0x23b float:8.0E-43 double:2.82E-321;
        r1 = r1[r6];	 Catch:{ IllegalStateException -> 0x063e }
        r5.put(r1, r0);	 Catch:{ IllegalStateException -> 0x063e }
        r1 = U;	 Catch:{ IllegalStateException -> 0x063e }
        r6 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r1 = r1[r6];	 Catch:{ IllegalStateException -> 0x063e }
        r6 = 0;
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ IllegalStateException -> 0x063e }
        r5.put(r1, r6);	 Catch:{ IllegalStateException -> 0x063e }
        r1 = U;	 Catch:{ IllegalStateException -> 0x063e }
        r6 = 572; // 0x23c float:8.02E-43 double:2.826E-321;
        r6 = r1[r6];	 Catch:{ IllegalStateException -> 0x063e }
        r8 = r14.k;	 Catch:{ IllegalStateException -> 0x063e }
        r10 = 15;
        r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r1 != 0) goto L_0x0640;
    L_0x03a1:
        r1 = 1;
    L_0x03a2:
        r1 = java.lang.Boolean.valueOf(r1);
        r5.put(r6, r1);
        r1 = 2;
        r1 = new java.lang.String[r1];
        r6 = 0;
        r7 = r14.e;
        r7 = r7.c;
        r1[r6] = r7;
        r6 = 1;
        r1[r6] = r0;
        r0 = U;	 Catch:{ IllegalStateException -> 0x0643 }
        r6 = 505; // 0x1f9 float:7.08E-43 double:2.495E-321;
        r0 = r0[r6];	 Catch:{ IllegalStateException -> 0x0643 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x0643 }
        r7 = 568; // 0x238 float:7.96E-43 double:2.806E-321;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x0643 }
        r0 = r13.update(r0, r5, r6, r1);	 Catch:{ IllegalStateException -> 0x0643 }
        if (r0 != 0) goto L_0x03d2;
    L_0x03c8:
        r0 = U;	 Catch:{ IllegalStateException -> 0x0643 }
        r1 = 532; // 0x214 float:7.45E-43 double:2.63E-321;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0643 }
        r1 = 0;
        r13.insert(r0, r1, r5);	 Catch:{ IllegalStateException -> 0x0643 }
    L_0x03d2:
        if (r2 == 0) goto L_0x0353;
    L_0x03d4:
        if (r2 == 0) goto L_0x001b;
    L_0x03d6:
        r1 = new android.content.ContentValues;
        r0 = 3;
        r1.<init>(r0);
        r0 = U;	 Catch:{ IllegalStateException -> 0x0645 }
        r4 = 525; // 0x20d float:7.36E-43 double:2.594E-321;
        r0 = r0[r4];	 Catch:{ IllegalStateException -> 0x0645 }
        r4 = r14.e;	 Catch:{ IllegalStateException -> 0x0645 }
        r4 = r4.c;	 Catch:{ IllegalStateException -> 0x0645 }
        r1.put(r0, r4);	 Catch:{ IllegalStateException -> 0x0645 }
        r0 = U;	 Catch:{ IllegalStateException -> 0x0645 }
        r4 = 491; // 0x1eb float:6.88E-43 double:2.426E-321;
        r0 = r0[r4];	 Catch:{ IllegalStateException -> 0x0645 }
        r4 = r14.A;	 Catch:{ IllegalStateException -> 0x0645 }
        r4 = r4.toString();	 Catch:{ IllegalStateException -> 0x0645 }
        r1.put(r0, r4);	 Catch:{ IllegalStateException -> 0x0645 }
        r0 = U;	 Catch:{ IllegalStateException -> 0x0645 }
        r4 = 557; // 0x22d float:7.8E-43 double:2.75E-321;
        r0 = r0[r4];	 Catch:{ IllegalStateException -> 0x0645 }
        r4 = 0;
        r4 = java.lang.Boolean.valueOf(r4);	 Catch:{ IllegalStateException -> 0x0645 }
        r1.put(r0, r4);	 Catch:{ IllegalStateException -> 0x0645 }
        r0 = 2;
        r4 = new java.lang.String[r0];	 Catch:{ IllegalStateException -> 0x0645 }
        r0 = 0;
        r5 = r14.e;	 Catch:{ IllegalStateException -> 0x0645 }
        r5 = r5.c;	 Catch:{ IllegalStateException -> 0x0645 }
        r4[r0] = r5;	 Catch:{ IllegalStateException -> 0x0645 }
        r5 = 1;
        if (r3 == 0) goto L_0x0647;
    L_0x0413:
        r0 = "";
    L_0x0415:
        r4[r5] = r0;
        r0 = r14.e;
        r0 = r0.c;
        r0 = r12.b(r13, r0);
        r3 = U;	 Catch:{ IllegalStateException -> 0x064b }
        r5 = 563; // 0x233 float:7.89E-43 double:2.78E-321;
        r3 = r3[r5];	 Catch:{ IllegalStateException -> 0x064b }
        r5 = U;	 Catch:{ IllegalStateException -> 0x064b }
        r6 = 501; // 0x1f5 float:7.02E-43 double:2.475E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x064b }
        r3 = r13.update(r3, r1, r5, r4);	 Catch:{ IllegalStateException -> 0x064b }
        if (r3 != 0) goto L_0x043b;
    L_0x0431:
        r3 = U;	 Catch:{ IllegalStateException -> 0x064b }
        r4 = 518; // 0x206 float:7.26E-43 double:2.56E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x064b }
        r4 = 0;
        r13.insert(r3, r4, r1);	 Catch:{ IllegalStateException -> 0x064b }
    L_0x043b:
        r1 = r14.e;
        r1 = r1.c;
        r1 = r12.b(r13, r1);
        r3 = android.text.TextUtils.equals(r0, r1);
        if (r3 != 0) goto L_0x001b;
    L_0x0449:
        r3 = new android.content.ContentValues;
        r4 = 6;
        r3.<init>(r4);
        r4 = U;
        r5 = 503; // 0x1f7 float:7.05E-43 double:2.485E-321;
        r4 = r4[r5];
        r6 = java.lang.System.currentTimeMillis();
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 / r8;
        r5 = java.lang.Long.valueOf(r6);
        r3.put(r4, r5);
        r4 = U;
        r5 = 496; // 0x1f0 float:6.95E-43 double:2.45E-321;
        r4 = r4[r5];
        r5 = r14.e;
        r5 = r5.c;
        r3.put(r4, r5);
        r4 = U;
        r5 = 549; // 0x225 float:7.7E-43 double:2.71E-321;
        r4 = r4[r5];
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = r14.F;
        r5 = r5.append(r6);
        r6 = 44;
        r5 = r5.append(r6);
        r6 = r14.A;
        r5 = r5.append(r6);
        r5 = r5.toString();
        r3.put(r4, r5);
        r4 = U;
        r5 = 514; // 0x202 float:7.2E-43 double:2.54E-321;
        r4 = r4[r5];
        r5 = 3;
        r5 = java.lang.Integer.valueOf(r5);
        r3.put(r4, r5);
        r4 = U;
        r5 = 516; // 0x204 float:7.23E-43 double:2.55E-321;
        r4 = r4[r5];
        r3.put(r4, r0);
        r0 = U;
        r4 = 574; // 0x23e float:8.04E-43 double:2.836E-321;
        r0 = r0[r4];
        r3.put(r0, r1);
        r0 = U;
        r1 = 559; // 0x22f float:7.83E-43 double:2.76E-321;
        r0 = r0[r1];
        r1 = 0;
        r13.insert(r0, r1, r3);
        if (r2 == 0) goto L_0x001b;
    L_0x04c0:
        r0 = r14.A;
        r0 = (java.util.Vector) r0;
        r1 = r0.iterator();
    L_0x04c8:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0533;
    L_0x04ce:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r3 = com.whatsapp.App.P;
        r3 = r3.h(r0);
        if (r3 == 0) goto L_0x04de;
    L_0x04dc:
        r0 = "";
    L_0x04de:
        r3 = new android.content.ContentValues;
        r4 = 3;
        r3.<init>(r4);
        r4 = U;
        r5 = 526; // 0x20e float:7.37E-43 double:2.6E-321;
        r4 = r4[r5];
        r5 = r14.e;
        r5 = r5.c;
        r3.put(r4, r5);
        r4 = U;
        r5 = 569; // 0x239 float:7.97E-43 double:2.81E-321;
        r4 = r4[r5];
        r3.put(r4, r0);
        r4 = U;
        r5 = 529; // 0x211 float:7.41E-43 double:2.614E-321;
        r4 = r4[r5];
        r5 = 1;
        r5 = java.lang.Boolean.valueOf(r5);
        r3.put(r4, r5);
        r4 = 2;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = r14.e;
        r6 = r6.c;
        r4[r5] = r6;
        r5 = 1;
        r4[r5] = r0;
        r0 = U;	 Catch:{ IllegalStateException -> 0x064f }
        r5 = 513; // 0x201 float:7.19E-43 double:2.535E-321;
        r0 = r0[r5];	 Catch:{ IllegalStateException -> 0x064f }
        r5 = U;	 Catch:{ IllegalStateException -> 0x064f }
        r6 = 533; // 0x215 float:7.47E-43 double:2.633E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x064f }
        r0 = r13.update(r0, r3, r5, r4);	 Catch:{ IllegalStateException -> 0x064f }
        if (r0 != 0) goto L_0x0531;
    L_0x0527:
        r0 = U;	 Catch:{ IllegalStateException -> 0x064f }
        r4 = 564; // 0x234 float:7.9E-43 double:2.787E-321;
        r0 = r0[r4];	 Catch:{ IllegalStateException -> 0x064f }
        r4 = 0;
        r13.insert(r0, r4, r3);	 Catch:{ IllegalStateException -> 0x064f }
    L_0x0531:
        if (r2 == 0) goto L_0x04c8;
    L_0x0533:
        if (r2 == 0) goto L_0x001b;
    L_0x0535:
        r0 = 2;
        r0 = new java.lang.String[r0];
        r1 = 0;
        r3 = r14.e;
        r3 = r3.c;
        r0[r1] = r3;
        r1 = 1;
        r3 = "";
        r0[r1] = r3;
        r1 = U;
        r3 = 492; // 0x1ec float:6.9E-43 double:2.43E-321;
        r1 = r1[r3];
        r3 = U;
        r4 = 509; // 0x1fd float:7.13E-43 double:2.515E-321;
        r3 = r3[r4];
        r13.delete(r1, r3, r0);
        r0 = new android.content.ContentValues;
        r1 = 3;
        r0.<init>(r1);
        r1 = U;
        r3 = 545; // 0x221 float:7.64E-43 double:2.693E-321;
        r1 = r1[r3];
        r3 = r14.e;
        r3 = r3.c;
        r0.put(r1, r3);
        r1 = U;
        r3 = 511; // 0x1ff float:7.16E-43 double:2.525E-321;
        r1 = r1[r3];
        r3 = 0;
        r3 = java.lang.Boolean.valueOf(r3);
        r0.put(r1, r3);
        r1 = U;
        r3 = 543; // 0x21f float:7.61E-43 double:2.683E-321;
        r1 = r1[r3];
        r3 = 0;
        r3 = java.lang.Boolean.valueOf(r3);
        r0.put(r1, r3);
        r1 = 1;
        r1 = new java.lang.String[r1];
        r3 = 0;
        r4 = r14.e;
        r4 = r4.c;
        r1[r3] = r4;
        r3 = U;	 Catch:{ IllegalStateException -> 0x0651 }
        r4 = 517; // 0x205 float:7.24E-43 double:2.554E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0651 }
        r4 = U;	 Catch:{ IllegalStateException -> 0x0651 }
        r5 = 528; // 0x210 float:7.4E-43 double:2.61E-321;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0651 }
        r1 = r13.update(r3, r0, r4, r1);	 Catch:{ IllegalStateException -> 0x0651 }
        if (r1 != 0) goto L_0x001b;
    L_0x059e:
        r1 = U;	 Catch:{ IllegalStateException -> 0x0651 }
        r3 = 498; // 0x1f2 float:6.98E-43 double:2.46E-321;
        r1 = r1[r3];	 Catch:{ IllegalStateException -> 0x0651 }
        r3 = 0;
        r13.insert(r1, r3, r0);	 Catch:{ IllegalStateException -> 0x0651 }
        if (r2 == 0) goto L_0x001b;
    L_0x05aa:
        r0 = r14.A;
        r0 = (java.util.Vector) r0;
        r1 = r0.iterator();
    L_0x05b2:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x001b;
    L_0x05b8:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r3 = com.whatsapp.App.P;
        r3 = r3.h(r0);
        if (r3 == 0) goto L_0x05c8;
    L_0x05c6:
        r0 = "";
    L_0x05c8:
        r3 = new android.content.ContentValues;
        r4 = 3;
        r3.<init>(r4);
        r4 = U;
        r5 = 553; // 0x229 float:7.75E-43 double:2.73E-321;
        r4 = r4[r5];
        r5 = r14.e;
        r5 = r5.c;
        r3.put(r4, r5);
        r4 = U;
        r5 = 565; // 0x235 float:7.92E-43 double:2.79E-321;
        r4 = r4[r5];
        r3.put(r4, r0);
        r4 = U;
        r5 = 548; // 0x224 float:7.68E-43 double:2.707E-321;
        r4 = r4[r5];
        r5 = 0;
        r5 = java.lang.Boolean.valueOf(r5);
        r3.put(r4, r5);
        r4 = 2;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = r14.e;
        r6 = r6.c;
        r4[r5] = r6;
        r5 = 1;
        r4[r5] = r0;
        r0 = U;	 Catch:{ IllegalStateException -> 0x0655 }
        r5 = 530; // 0x212 float:7.43E-43 double:2.62E-321;
        r0 = r0[r5];	 Catch:{ IllegalStateException -> 0x0655 }
        r5 = U;	 Catch:{ IllegalStateException -> 0x0655 }
        r6 = 510; // 0x1fe float:7.15E-43 double:2.52E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x0655 }
        r0 = r13.update(r0, r3, r5, r4);	 Catch:{ IllegalStateException -> 0x0655 }
        if (r0 != 0) goto L_0x061b;
    L_0x0611:
        r0 = U;	 Catch:{ IllegalStateException -> 0x0655 }
        r4 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r0 = r0[r4];	 Catch:{ IllegalStateException -> 0x0655 }
        r4 = 0;
        r13.insert(r0, r4, r3);	 Catch:{ IllegalStateException -> 0x0655 }
    L_0x061b:
        if (r2 == 0) goto L_0x05b2;
    L_0x061d:
        goto L_0x001b;
    L_0x061f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0621 }
    L_0x0621:
        r0 = move-exception;
        throw r0;
    L_0x0623:
        r0 = r14.F;
        goto L_0x0022;
    L_0x0627:
        r0 = move-exception;
        throw r0;
    L_0x0629:
        r0 = move-exception;
        throw r0;
    L_0x062b:
        r0 = move-exception;
        throw r0;
    L_0x062d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x062f }
    L_0x062f:
        r0 = move-exception;
        throw r0;
    L_0x0631:
        r0 = r14.F;
        goto L_0x0207;
    L_0x0635:
        r0 = move-exception;
        throw r0;
    L_0x0637:
        r1 = r0;
        goto L_0x02c2;
    L_0x063a:
        r0 = move-exception;
        throw r0;
    L_0x063c:
        r0 = move-exception;
        throw r0;
    L_0x063e:
        r0 = move-exception;
        throw r0;
    L_0x0640:
        r1 = 0;
        goto L_0x03a2;
    L_0x0643:
        r0 = move-exception;
        throw r0;
    L_0x0645:
        r0 = move-exception;
        throw r0;
    L_0x0647:
        r0 = r14.F;
        goto L_0x0415;
    L_0x064b:
        r0 = move-exception;
        throw r0;
    L_0x064d:
        r0 = move-exception;
        throw r0;
    L_0x064f:
        r0 = move-exception;
        throw r0;
    L_0x0651:
        r0 = move-exception;
        throw r0;
    L_0x0653:
        r0 = move-exception;
        throw r0;
    L_0x0655:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(android.database.sqlite.SQLiteDatabase, com.whatsapp.protocol.b):void");
    }

    static HashMap d(l7 l7Var) {
        return l7Var.R;
    }

    public void a(b bVar, boolean z, int i) {
        try {
            if (z) {
                r();
                Message.obtain(this.K.b, 2, i, 0, bVar).sendToTarget();
                if (m3.d == 0) {
                    return;
                }
            }
            this.D.b(bVar, i);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private String b(SQLiteDatabase sQLiteDatabase, String str) {
        return cs.a(a(sQLiteDatabase, str));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(com.whatsapp.protocol.b r6) {
        /*
        r5_this = this;
        r4 = 1;
        r0 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x00c5 }
        r0.<init>();	 Catch:{ InterruptedException -> 0x00c5 }
        r1 = U;	 Catch:{ InterruptedException -> 0x00c5 }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ InterruptedException -> 0x00c5 }
        r1 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00c5 }
        r0 = r6.e;	 Catch:{ InterruptedException -> 0x00c5 }
        r0 = r0.b;	 Catch:{ InterruptedException -> 0x00c5 }
        if (r0 == 0) goto L_0x00c7;
    L_0x0016:
        r0 = U;	 Catch:{ InterruptedException -> 0x00c5 }
        r2 = 18;
        r0 = r0[r2];	 Catch:{ InterruptedException -> 0x00c5 }
    L_0x001c:
        r0 = r1.append(r0);	 Catch:{ InterruptedException -> 0x00cf }
        r1 = r6.e;	 Catch:{ InterruptedException -> 0x00cf }
        r1 = r1.c;	 Catch:{ InterruptedException -> 0x00cf }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00cf }
        r1 = " ";
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00cf }
        r1 = r6.e;	 Catch:{ InterruptedException -> 0x00cf }
        r1 = r1.a;	 Catch:{ InterruptedException -> 0x00cf }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00cf }
        r1 = " ";
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00cf }
        r1 = r6.j;	 Catch:{ InterruptedException -> 0x00cf }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00cf }
        r0 = r0.toString();	 Catch:{ InterruptedException -> 0x00cf }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x00cf }
        r0 = r6.e;	 Catch:{ InterruptedException -> 0x00cf }
        r0 = r0.b;	 Catch:{ InterruptedException -> 0x00cf }
        if (r0 == 0) goto L_0x0078;
    L_0x004f:
        r0 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x00cf }
        r0.<init>();	 Catch:{ InterruptedException -> 0x00cf }
        r1 = com.whatsapp.App.af();	 Catch:{ InterruptedException -> 0x00cf }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00cf }
        r1 = U;	 Catch:{ InterruptedException -> 0x00cf }
        r2 = 19;
        r1 = r1[r2];	 Catch:{ InterruptedException -> 0x00cf }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00cf }
        r0 = r0.toString();	 Catch:{ InterruptedException -> 0x00cf }
        r1 = r6.e;	 Catch:{ InterruptedException -> 0x00cf }
        r1 = r1.c;	 Catch:{ InterruptedException -> 0x00cf }
        r0 = r0.equals(r1);	 Catch:{ InterruptedException -> 0x00cf }
        if (r0 == 0) goto L_0x0078;
    L_0x0074:
        r0 = 13;
        r6.a = r0;
    L_0x0078:
        r5.r();
        r0 = android.os.Looper.myLooper();
        r1 = android.os.Looper.getMainLooper();
        if (r0 == r1) goto L_0x00a3;
    L_0x0085:
        r0 = new java.util.concurrent.CountDownLatch;
        r0.<init>(r4);
        r1 = com.whatsapp.App.p;
        r1 = r1.U();
        r2 = new com.whatsapp.jy;
        r2.<init>(r5, r6, r0);
        r1.post(r2);
        r2 = 5;
        r1 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x00d1 }
        r0.await(r2, r1);	 Catch:{ InterruptedException -> 0x00d1 }
    L_0x009f:
        r0 = com.whatsapp.m3.d;	 Catch:{ InterruptedException -> 0x00d6 }
        if (r0 == 0) goto L_0x00a8;
    L_0x00a3:
        r0 = r5.D;	 Catch:{ InterruptedException -> 0x00d6 }
        r0.a(r6);	 Catch:{ InterruptedException -> 0x00d6 }
    L_0x00a8:
        r0 = 2;
        r0 = new long[r0];
        r1 = 0;
        r2 = java.lang.System.currentTimeMillis();
        r0[r1] = r2;
        r2 = -1;
        r0[r4] = r2;
        r1 = r5.e;
        r1.put(r6, r0);
        r0 = U;
        r1 = 21;
        r0 = r0[r1];
        r5.w(r0);
        return;
    L_0x00c5:
        r0 = move-exception;
        throw r0;
    L_0x00c7:
        r0 = U;
        r2 = 20;
        r0 = r0[r2];
        goto L_0x001c;
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        goto L_0x009f;
    L_0x00d6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.d(com.whatsapp.protocol.b):void");
    }

    public Runnable a(Runnable runnable, Runnable runnable2) {
        return new ic(this, runnable2, runnable);
    }

    public void f(b bVar) {
        c(bVar, -1);
    }

    static void a(l7 l7Var, b bVar, String str, int i, long j) {
        l7Var.a(bVar, str, i, j);
    }

    public void a(fc fcVar) {
        this.D.unregisterObserver(fcVar);
    }

    public List a(String str, m mVar) {
        int i = m3.d;
        if (mVar == null) {
            try {
                long p = p(str);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        p = e(b(mVar));
        if (p == 1) {
            try {
                Log.i(U[85] + mVar);
                return null;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        String str2 = U[84];
        String[] strArr = new String[]{str, String.valueOf(p)};
        synchronized (this.i) {
            Cursor rawQuery = this.i.getReadableDatabase().rawQuery(str2, strArr);
        }
        if (rawQuery == null) {
            try {
                Log.i(U[83] + mVar);
                return null;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
        List arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            b a = a(rawQuery, str);
            if (a != null) {
                try {
                    arrayList.add(a);
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
            if (i != 0) {
                break;
            }
        }
        rawQuery.close();
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.gy c(com.whatsapp.protocol.m r9) {
        /*
        r8_this = this;
        r3 = com.whatsapp.m3.d;
        r4 = r8.i;
        monitor-enter(r4);
        r0 = r8.d;	 Catch:{ all -> 0x00b6 }
        r0 = r0.get(r9);	 Catch:{ all -> 0x00b6 }
        r0 = (com.whatsapp.gy) r0;	 Catch:{ all -> 0x00b6 }
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r4);	 Catch:{ all -> 0x00b6 }
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = r9.c;	 Catch:{ all -> 0x00b6 }
        r0 = com.whatsapp.bd.b(r0);	 Catch:{ all -> 0x00b6 }
        if (r0 == 0) goto L_0x0038;
    L_0x0019:
        r0 = 2;
        r0 = new java.lang.String[r0];	 Catch:{ all -> 0x00b6 }
        r1 = 0;
        r2 = r9.c;	 Catch:{ all -> 0x00b6 }
        r0[r1] = r2;	 Catch:{ all -> 0x00b6 }
        r1 = 1;
        r2 = r9.a;	 Catch:{ all -> 0x00b6 }
        r0[r1] = r2;	 Catch:{ all -> 0x00b6 }
        r1 = r8.i;	 Catch:{ all -> 0x00b6 }
        r1 = r1.getReadableDatabase();	 Catch:{ all -> 0x00b6 }
        r2 = U;	 Catch:{ all -> 0x00b6 }
        r5 = 76;
        r2 = r2[r5];	 Catch:{ all -> 0x00b6 }
        r0 = r1.rawQuery(r2, r0);	 Catch:{ all -> 0x00b6 }
        if (r3 == 0) goto L_0x00c0;
    L_0x0038:
        r0 = r9.c;	 Catch:{ IllegalStateException -> 0x00b9 }
        r0 = com.whatsapp.m8.d(r0);	 Catch:{ IllegalStateException -> 0x00b9 }
        if (r0 == 0) goto L_0x0056;
    L_0x0040:
        r0 = 1;
        r0 = new java.lang.String[r0];	 Catch:{ all -> 0x00b6 }
        r1 = 0;
        r2 = r9.a;	 Catch:{ all -> 0x00b6 }
        r0[r1] = r2;	 Catch:{ all -> 0x00b6 }
        r1 = r8.i;	 Catch:{ all -> 0x00b6 }
        r1 = r1.getReadableDatabase();	 Catch:{ all -> 0x00b6 }
        r2 = M;	 Catch:{ all -> 0x00b6 }
        r0 = r1.rawQuery(r2, r0);	 Catch:{ all -> 0x00b6 }
        if (r3 == 0) goto L_0x00c0;
    L_0x0056:
        r0 = 2;
        r0 = new java.lang.String[r0];	 Catch:{ all -> 0x00b6 }
        r1 = 0;
        r2 = r9.c;	 Catch:{ all -> 0x00b6 }
        r0[r1] = r2;	 Catch:{ all -> 0x00b6 }
        r1 = 1;
        r2 = r9.a;	 Catch:{ all -> 0x00b6 }
        r0[r1] = r2;	 Catch:{ all -> 0x00b6 }
        r1 = r8.i;	 Catch:{ all -> 0x00b6 }
        r1 = r1.getReadableDatabase();	 Catch:{ all -> 0x00b6 }
        r2 = U;	 Catch:{ all -> 0x00b6 }
        r5 = 75;
        r2 = r2[r5];	 Catch:{ all -> 0x00b6 }
        r0 = r1.rawQuery(r2, r0);	 Catch:{ all -> 0x00b6 }
        r2 = r0;
    L_0x0074:
        r0 = new com.whatsapp.gy;	 Catch:{ all -> 0x00b6 }
        r0.<init>();	 Catch:{ all -> 0x00b6 }
        if (r2 == 0) goto L_0x00ae;
    L_0x007b:
        r1 = r2.moveToNext();	 Catch:{ all -> 0x00bb }
        if (r1 == 0) goto L_0x00ab;
    L_0x0081:
        r1 = 0;
        r1 = r2.getString(r1);	 Catch:{ all -> 0x00bb }
        if (r1 != 0) goto L_0x008a;
    L_0x0088:
        r1 = "";
    L_0x008a:
        r5 = new com.whatsapp.pj;	 Catch:{ all -> 0x00bb }
        r5.<init>();	 Catch:{ all -> 0x00bb }
        r6 = 1;
        r6 = r2.getLong(r6);	 Catch:{ all -> 0x00bb }
        r5.b = r6;	 Catch:{ all -> 0x00bb }
        r6 = 2;
        r6 = r2.getLong(r6);	 Catch:{ all -> 0x00bb }
        r5.a = r6;	 Catch:{ all -> 0x00bb }
        r6 = 3;
        r6 = r2.getLong(r6);	 Catch:{ all -> 0x00bb }
        r5.d = r6;	 Catch:{ all -> 0x00bb }
        r6 = r0.a;	 Catch:{ all -> 0x00bb }
        r6.put(r1, r5);	 Catch:{ all -> 0x00bb }
        if (r3 == 0) goto L_0x007b;
    L_0x00ab:
        r2.close();	 Catch:{ all -> 0x00b6 }
    L_0x00ae:
        r1 = r8.d;	 Catch:{ all -> 0x00b6 }
        r1.put(r9, r0);	 Catch:{ all -> 0x00b6 }
        monitor-exit(r4);	 Catch:{ all -> 0x00b6 }
        goto L_0x0010;
    L_0x00b6:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00b6 }
        throw r0;
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00b6 }
    L_0x00bb:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x00b6 }
        throw r0;	 Catch:{ all -> 0x00b6 }
    L_0x00c0:
        r2 = r0;
        goto L_0x0074;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.c(com.whatsapp.protocol.m):com.whatsapp.gy");
    }

    public void b() {
        Log.i(U[30]);
        r();
        Message.obtain(this.K.b, 7).sendToTarget();
    }

    public boolean p() {
        return c(Q);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean f() {
        /*
        r6_this = this;
        r0 = 0;
        r1 = U;
        r2 = 416; // 0x1a0 float:5.83E-43 double:2.055E-321;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r2 = new com.whatsapp.util.y;
        r1 = U;
        r3 = 421; // 0x1a5 float:5.9E-43 double:2.08E-321;
        r1 = r1[r3];
        r2.<init>(r1);
        r1 = Q;	 Catch:{ SQLiteDatabaseCorruptException -> 0x006b, SQLiteFullException -> 0x009f, SQLiteException -> 0x00bf, all -> 0x0110 }
        r1 = r1.getAbsolutePath();	 Catch:{ SQLiteDatabaseCorruptException -> 0x006b, SQLiteFullException -> 0x009f, SQLiteException -> 0x00bf, all -> 0x0110 }
        r3 = 0;
        r4 = 16;
        r1 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r3, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x006b, SQLiteFullException -> 0x009f, SQLiteException -> 0x00bf, all -> 0x0110 }
        r0 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011e, SQLiteFullException -> 0x011c, SQLiteException -> 0x011a }
        r3 = 415; // 0x19f float:5.82E-43 double:2.05E-321;
        r0 = r0[r3];	 Catch:{ SQLiteDatabaseCorruptException -> 0x011e, SQLiteFullException -> 0x011c, SQLiteException -> 0x011a }
        r1.beginTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x011e, SQLiteFullException -> 0x011c, SQLiteException -> 0x011a }
        r1.execSQL(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011e, SQLiteFullException -> 0x011c, SQLiteException -> 0x011a }
        r1.setTransactionSuccessful();	 Catch:{ SQLiteDatabaseCorruptException -> 0x011e, SQLiteFullException -> 0x011c, SQLiteException -> 0x011a }
        r0 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011e, SQLiteFullException -> 0x011c, SQLiteException -> 0x011a }
        r0.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x011e, SQLiteFullException -> 0x011c, SQLiteException -> 0x011a }
        r3 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011e, SQLiteFullException -> 0x011c, SQLiteException -> 0x011a }
        r4 = 417; // 0x1a1 float:5.84E-43 double:2.06E-321;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x011e, SQLiteFullException -> 0x011c, SQLiteException -> 0x011a }
        r0 = r0.append(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011e, SQLiteFullException -> 0x011c, SQLiteException -> 0x011a }
        r2 = r2.c();	 Catch:{ SQLiteDatabaseCorruptException -> 0x011e, SQLiteFullException -> 0x011c, SQLiteException -> 0x011a }
        r0 = r0.append(r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011e, SQLiteFullException -> 0x011c, SQLiteException -> 0x011a }
        r0 = r0.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x011e, SQLiteFullException -> 0x011c, SQLiteException -> 0x011a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011e, SQLiteFullException -> 0x011c, SQLiteException -> 0x011a }
        r0 = 1;
        if (r1 == 0) goto L_0x0064;
    L_0x0052:
        r2 = r1.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0065 }
        if (r2 == 0) goto L_0x005b;
    L_0x0058:
        r1.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0067 }
    L_0x005b:
        r2 = r1.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0069 }
        if (r2 == 0) goto L_0x0064;
    L_0x0061:
        r1.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0069 }
    L_0x0064:
        return r0;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r1 = move-exception;
    L_0x006c:
        r1 = U;	 Catch:{ all -> 0x0115 }
        r2 = 418; // 0x1a2 float:5.86E-43 double:2.065E-321;
        r1 = r1[r2];	 Catch:{ all -> 0x0115 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ all -> 0x0115 }
        if (r0 == 0) goto L_0x0089;
    L_0x0077:
        r1 = r0.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0099 }
        if (r1 == 0) goto L_0x0080;
    L_0x007d:
        r0.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x009b }
    L_0x0080:
        r1 = r0.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x009d }
        if (r1 == 0) goto L_0x0089;
    L_0x0086:
        r0.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x009d }
    L_0x0089:
        r0 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010e }
        r1 = 422; // 0x1a6 float:5.91E-43 double:2.085E-321;
        r0 = r0[r1];	 Catch:{ SQLiteDatabaseCorruptException -> 0x010e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010e }
        r0 = Q;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010e }
        r0.delete();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010e }
        r0 = 0;
        goto L_0x0064;
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        throw r0;
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x00a3:
        r2 = com.whatsapp.App.p;	 Catch:{ all -> 0x00a9 }
        com.whatsapp.util.aq.a(r2);	 Catch:{ all -> 0x00a9 }
        throw r0;	 Catch:{ all -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
    L_0x00aa:
        if (r1 == 0) goto L_0x00be;
    L_0x00ac:
        r2 = r1.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        if (r2 == 0) goto L_0x00b5;
    L_0x00b2:
        r1.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
    L_0x00b5:
        r2 = r1.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010c }
        if (r2 == 0) goto L_0x00be;
    L_0x00bb:
        r1.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010c }
    L_0x00be:
        throw r0;
    L_0x00bf:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x00c3:
        r2 = r0.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0104 }
        r3 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0104 }
        r4 = 419; // 0x1a3 float:5.87E-43 double:2.07E-321;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0104 }
        r2 = r2.contains(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0104 }
        if (r2 == 0) goto L_0x00e5;
    L_0x00d3:
        r2 = com.whatsapp.App.p;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0104 }
        r3 = com.whatsapp.App.p;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0104 }
        r4 = 2131624295; // 0x7f0e0167 float:1.8875766E38 double:1.053162334E-314;
        r3 = r3.getString(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0104 }
        com.whatsapp.util.aq.a(r2, r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0104 }
        r2 = com.whatsapp.m3.d;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0104 }
        if (r2 == 0) goto L_0x0103;
    L_0x00e5:
        r2 = r0.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0106 }
        r3 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0106 }
        r4 = 420; // 0x1a4 float:5.89E-43 double:2.075E-321;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0106 }
        r2 = r2.contains(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0106 }
        if (r2 == 0) goto L_0x0103;
    L_0x00f5:
        r2 = com.whatsapp.App.p;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0108 }
        r3 = com.whatsapp.App.p;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0108 }
        r4 = 2131624296; // 0x7f0e0168 float:1.8875768E38 double:1.0531623345E-314;
        r3 = r3.getString(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0108 }
        com.whatsapp.util.aq.a(r2, r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0108 }
    L_0x0103:
        throw r0;	 Catch:{ all -> 0x00a9 }
    L_0x0104:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0106 }
    L_0x0106:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0108 }
    L_0x0108:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00a9 }
    L_0x010a:
        r0 = move-exception;
        throw r0;
    L_0x010c:
        r0 = move-exception;
        throw r0;
    L_0x010e:
        r0 = move-exception;
        throw r0;
    L_0x0110:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x00aa;
    L_0x0115:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x00aa;
    L_0x011a:
        r0 = move-exception;
        goto L_0x00c3;
    L_0x011c:
        r0 = move-exception;
        goto L_0x00a3;
    L_0x011e:
        r0 = move-exception;
        r0 = r1;
        goto L_0x006c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.f():boolean");
    }

    static boolean b(l7 l7Var, String str) {
        return l7Var.a(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(java.io.File r9) {
        /*
        r3 = 0;
        r0 = 1;
        r1 = 0;
        r5 = -1;
        r2 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        r2.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        r4 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        r6 = 290; // 0x122 float:4.06E-43 double:1.433E-321;
        r4 = r4[r6];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        r2 = r2.append(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        r4 = com.whatsapp.App.p;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        r6 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        r7 = 287; // 0x11f float:4.02E-43 double:1.42E-321;
        r6 = r6[r7];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        r4 = r4.getDatabasePath(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        r2 = r2.append(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        r2 = r2.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        r2 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        r4 = 289; // 0x121 float:4.05E-43 double:1.43E-321;
        r2 = r2[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        b(r9, r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        r2 = r9.exists();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        if (r2 != 0) goto L_0x0045;
    L_0x0039:
        r0 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        r2 = 288; // 0x120 float:4.04E-43 double:1.423E-321;
        r0 = r0[r2];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
    L_0x0042:
        return r1;
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r2 = r9.getAbsolutePath();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0083, SQLiteException -> 0x0098 }
        r4 = 0;
        r6 = 16;
        r3 = android.database.sqlite.SQLiteDatabase.openDatabase(r2, r4, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0083, SQLiteException -> 0x0098 }
        r4 = r3.getVersion();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0083, SQLiteException -> 0x00de }
        r2 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0083, SQLiteException -> 0x00e2 }
        r2.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0083, SQLiteException -> 0x00e2 }
        r6 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0083, SQLiteException -> 0x00e2 }
        r7 = 291; // 0x123 float:4.08E-43 double:1.44E-321;
        r6 = r6[r7];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0083, SQLiteException -> 0x00e2 }
        r2 = r2.append(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0083, SQLiteException -> 0x00e2 }
        r2 = r2.append(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0083, SQLiteException -> 0x00e2 }
        r2 = r2.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0083, SQLiteException -> 0x00e2 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0083, SQLiteException -> 0x00e2 }
        if (r3 == 0) goto L_0x0079;
    L_0x0070:
        r2 = r3.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0081 }
        if (r2 == 0) goto L_0x0079;
    L_0x0076:
        r3.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0081 }
    L_0x0079:
        if (r3 == 0) goto L_0x00d9;
    L_0x007b:
        if (r4 <= 0) goto L_0x00d9;
    L_0x007d:
        if (r4 > r0) goto L_0x00d9;
    L_0x007f:
        r1 = r0;
        goto L_0x0042;
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r2 = move-exception;
        com.whatsapp.util.Log.c(r2);	 Catch:{ all -> 0x00ca }
        if (r3 == 0) goto L_0x00eb;
    L_0x0089:
        r2 = r3.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0094 }
        if (r2 == 0) goto L_0x00eb;
    L_0x008f:
        r3.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0096 }
        r4 = r5;
        goto L_0x0079;
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;
    L_0x0098:
        r2 = move-exception;
        r4 = r3;
        r3 = r5;
    L_0x009b:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00db }
        r5.<init>();	 Catch:{ all -> 0x00db }
        r6 = U;	 Catch:{ all -> 0x00db }
        r7 = 286; // 0x11e float:4.01E-43 double:1.413E-321;
        r6 = r6[r7];	 Catch:{ all -> 0x00db }
        r5 = r5.append(r6);	 Catch:{ all -> 0x00db }
        r2 = r2.toString();	 Catch:{ all -> 0x00db }
        r2 = r5.append(r2);	 Catch:{ all -> 0x00db }
        r2 = r2.toString();	 Catch:{ all -> 0x00db }
        com.whatsapp.util.Log.w(r2);	 Catch:{ all -> 0x00db }
        if (r4 == 0) goto L_0x00e7;
    L_0x00bb:
        r2 = r4.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c8 }
        if (r2 == 0) goto L_0x00e7;
    L_0x00c1:
        r4.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c8 }
        r8 = r3;
        r3 = r4;
        r4 = r8;
        goto L_0x0079;
    L_0x00c8:
        r0 = move-exception;
        throw r0;
    L_0x00ca:
        r0 = move-exception;
    L_0x00cb:
        if (r3 == 0) goto L_0x00d6;
    L_0x00cd:
        r1 = r3.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00d7 }
        if (r1 == 0) goto L_0x00d6;
    L_0x00d3:
        r3.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00d7 }
    L_0x00d6:
        throw r0;
    L_0x00d7:
        r0 = move-exception;
        throw r0;
    L_0x00d9:
        r0 = r1;
        goto L_0x007f;
    L_0x00db:
        r0 = move-exception;
        r3 = r4;
        goto L_0x00cb;
    L_0x00de:
        r2 = move-exception;
        r4 = r3;
        r3 = r5;
        goto L_0x009b;
    L_0x00e2:
        r2 = move-exception;
        r8 = r4;
        r4 = r3;
        r3 = r8;
        goto L_0x009b;
    L_0x00e7:
        r8 = r3;
        r3 = r4;
        r4 = r8;
        goto L_0x0079;
    L_0x00eb:
        r4 = r5;
        goto L_0x0079;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.b(java.io.File):boolean");
    }

    public boolean i() {
        Log.i(U[610]);
        synchronized (this.i) {
            if (!this.r) {
                File file = new File(Q.getParent(), Q.getName() + U[611]);
                if (file.exists()) {
                    App.d(App.w.getRunningAppProcesses());
                }
                Log.i(U[608] + file.delete());
                Log.i(U[609] + new File(Q.getParent(), Q.getName() + U[606]).delete());
                try {
                    if (b(Q)) {
                        if (q()) {
                            z();
                            this.r = true;
                        }
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    throw e;
                } catch (SQLiteDatabaseCorruptException e2) {
                    Log.e(U[607] + e2.toString());
                    L();
                }
            }
        }
        return this.r;
    }

    static void i(l7 l7Var) {
        l7Var.a();
    }

    public void b(Collection collection) {
        Log.i(U[445] + collection.size());
        r();
        this.K.b.post(new cz(this, collection));
    }

    private void a(String str, boolean z) {
        int i = m3.d;
        synchronized (this.i) {
            try {
                Cursor rawQuery = this.i.getReadableDatabase().rawQuery(U[575], new String[]{str});
                if (rawQuery != null) {
                    do {
                        try {
                            if (!rawQuery.moveToNext()) {
                                break;
                            }
                            b(a(rawQuery, str), z);
                        } catch (SQLiteDiskIOException e) {
                            throw e;
                        } catch (SQLiteDiskIOException e2) {
                            try {
                                aq.a(App.p, (int) R.string.error_msgstore_db_diskio);
                                throw e2;
                            } catch (Throwable th) {
                                if (rawQuery != null) {
                                    rawQuery.close();
                                }
                            }
                        }
                    } while (i == 0);
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLiteDiskIOException e22) {
                throw e22;
            } catch (SQLiteDiskIOException e222) {
                throw e222;
            } catch (Throwable th2) {
            }
        }
    }

    public b B(String str) {
        if (str == null) {
            try {
                Log.e(U[584]);
                return null;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        sf sfVar = (sf) this.b.get(str);
        if (sfVar == null) {
            try {
                Log.w(U[585] + str);
                return null;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        try {
            if (sf.f(sfVar) != null) {
                return sf.f(sfVar);
            }
            sf.a(sfVar, j(str));
            return sf.f(sfVar);
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList a(int r9, int r10, com.whatsapp.c4 r11) {
        /*
        r8_this = this;
        r0 = com.whatsapp.m3.d;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = 2;
        r2 = new java.lang.String[r2];
        r3 = 0;
        r4 = java.lang.Integer.toString(r9);
        r2[r3] = r4;
        r3 = 1;
        r4 = java.lang.Integer.toString(r10);
        r2[r3] = r4;
        r3 = r8.i;
        monitor-enter(r3);
        r4 = r8.i;	 Catch:{ all -> 0x009e }
        r4 = r4.getReadableDatabase();	 Catch:{ all -> 0x009e }
        r5 = U;	 Catch:{ all -> 0x009e }
        r6 = 80;
        r5 = r5[r6];	 Catch:{ all -> 0x009e }
        r2 = r4.rawQuery(r5, r2);	 Catch:{ all -> 0x009e }
        if (r2 == 0) goto L_0x0064;
    L_0x002d:
        r4 = U;	 Catch:{ all -> 0x009e }
        r5 = 81;
        r4 = r4[r5];	 Catch:{ all -> 0x009e }
        r4 = r2.getColumnIndex(r4);	 Catch:{ all -> 0x009e }
    L_0x0037:
        r5 = r2.moveToNext();	 Catch:{ SQLiteDiskIOException -> 0x008f }
        if (r5 == 0) goto L_0x005f;
    L_0x003d:
        if (r11 == 0) goto L_0x0045;
    L_0x003f:
        r5 = r11.a();	 Catch:{ SQLiteDiskIOException -> 0x008d }
        if (r5 != 0) goto L_0x005f;
    L_0x0045:
        r5 = r2.getString(r4);	 Catch:{ SQLiteDiskIOException -> 0x008f }
        if (r5 != 0) goto L_0x0056;
    L_0x004b:
        r6 = U;	 Catch:{ SQLiteDiskIOException -> 0x00a1 }
        r7 = 78;
        r6 = r6[r7];	 Catch:{ SQLiteDiskIOException -> 0x00a1 }
        com.whatsapp.util.Log.w(r6);	 Catch:{ SQLiteDiskIOException -> 0x00a1 }
        if (r0 == 0) goto L_0x0037;
    L_0x0056:
        r5 = r8.a(r2, r5);	 Catch:{ SQLiteDiskIOException -> 0x008f }
        r1.add(r5);	 Catch:{ SQLiteDiskIOException -> 0x008f }
        if (r0 == 0) goto L_0x0037;
    L_0x005f:
        r2.close();	 Catch:{ all -> 0x009e }
        if (r0 == 0) goto L_0x006d;
    L_0x0064:
        r0 = U;	 Catch:{ SQLiteDiskIOException -> 0x00a3 }
        r2 = 82;
        r0 = r0[r2];	 Catch:{ SQLiteDiskIOException -> 0x00a3 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SQLiteDiskIOException -> 0x00a3 }
    L_0x006d:
        monitor-exit(r3);	 Catch:{ all -> 0x009e }
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = U;
        r3 = 79;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r1.size();
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return r1;
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        r1 = com.whatsapp.App.p;	 Catch:{ all -> 0x0099 }
        r4 = 2131624284; // 0x7f0e015c float:1.8875743E38 double:1.0531623286E-314;
        com.whatsapp.util.aq.a(r1, r4);	 Catch:{ all -> 0x0099 }
        throw r0;	 Catch:{ all -> 0x0099 }
    L_0x0099:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x009e }
        throw r0;	 Catch:{ all -> 0x009e }
    L_0x009e:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x009e }
        throw r0;
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x008f }
    L_0x00a3:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x009e }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(int, int, com.whatsapp.c4):java.util.ArrayList");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r9, java.lang.String r10, java.lang.Long r11) {
        /*
        r8_this = this;
        r1 = 0;
        r2 = r8.i;
        monitor-enter(r2);
        r0 = r8.i;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r1 = r0.getWritableDatabase();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r1.beginTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r0 = new android.content.ContentValues;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r3 = 3;
        r0.<init>(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        if (r11 == 0) goto L_0x001e;
    L_0x0015:
        r3 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0083, RuntimeException -> 0x00a4, Error -> 0x00af }
        r4 = 27;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0083, RuntimeException -> 0x00a4, Error -> 0x00af }
        r0.put(r3, r11);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0083, RuntimeException -> 0x00a4, Error -> 0x00af }
    L_0x001e:
        r3 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r4 = 24;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r0.put(r3, r10);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r4 = 0;
        r3[r4] = r9;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r4 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r5 = 29;
        r4 = r4[r5];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r5 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r6 = 25;
        r5 = r5[r6];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r3 = r1.update(r4, r0, r5, r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        if (r3 != 0) goto L_0x0073;
    L_0x003f:
        r3 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r4 = 23;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r0.put(r3, r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r3 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r4 = 26;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r4 = 0;
        r4 = r1.insert(r3, r4, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        r6 = -1;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 != 0) goto L_0x0073;
    L_0x0059:
        r0 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a2, RuntimeException -> 0x00a4, Error -> 0x00af }
        r0.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a2, RuntimeException -> 0x00a4, Error -> 0x00af }
        r3 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a2, RuntimeException -> 0x00a4, Error -> 0x00af }
        r4 = 28;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a2, RuntimeException -> 0x00a4, Error -> 0x00af }
        r0 = r0.append(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a2, RuntimeException -> 0x00a4, Error -> 0x00af }
        r0 = r0.append(r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a2, RuntimeException -> 0x00a4, Error -> 0x00af }
        r0 = r0.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a2, RuntimeException -> 0x00a4, Error -> 0x00af }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a2, RuntimeException -> 0x00a4, Error -> 0x00af }
    L_0x0073:
        r1.setTransactionSuccessful();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
        if (r1 == 0) goto L_0x0081;
    L_0x0078:
        r0 = r1.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a9 }
        if (r0 == 0) goto L_0x0081;
    L_0x007e:
        r1.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a9 }
    L_0x0081:
        monitor-exit(r2);	 Catch:{ all -> 0x009f }
        return;
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
    L_0x0085:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0092 }
        r8.L();	 Catch:{ all -> 0x0092 }
        r3 = new java.lang.AssertionError;	 Catch:{ all -> 0x0092 }
        r3.<init>(r0);	 Catch:{ all -> 0x0092 }
        throw r3;	 Catch:{ all -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        if (r1 == 0) goto L_0x009e;
    L_0x0095:
        r3 = r1.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00ab }
        if (r3 == 0) goto L_0x009e;
    L_0x009b:
        r1.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00ad }
    L_0x009e:
        throw r0;	 Catch:{ all -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x009f }
        throw r0;
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0085, RuntimeException -> 0x00a4, Error -> 0x00af }
    L_0x00a4:
        r0 = move-exception;
    L_0x00a5:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0092 }
        throw r0;	 Catch:{ all -> 0x0092 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x009f }
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x009f }
    L_0x00af:
        r0 = move-exception;
        goto L_0x00a5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(java.lang.String, java.lang.String, java.lang.Long):void");
    }

    public void B() {
        synchronized (this.i) {
            long currentTimeMillis = (System.currentTimeMillis() - 172800000) / 1000;
            this.i.getWritableDatabase().delete(U[487], U[488], new String[]{String.valueOf(currentTimeMillis)});
        }
    }

    private ArrayList b(boolean z) {
        if (z) {
            ArrayList a = at.a(this.H, -1, new String[]{U[624], U[621]});
            a.addAll(at.a(this.H, 7, new String[]{U[619], U[617], U[618], U[623], U[615], U[620]}));
            return at.a(a);
        }
        return at.a(this.H, 7, new String[]{U[612], U[616], U[626], U[614], U[627], U[625], U[622], U[613]});
    }

    public boolean d(String str, String str2) {
        String[] strArr = new String[]{str};
        SQLiteDatabase sQLiteDatabase = null;
        synchronized (this.i) {
            try {
                sQLiteDatabase = this.i.getWritableDatabase();
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL(U[45], strArr);
                sQLiteDatabase.execSQL(U[43], strArr);
                sQLiteDatabase.execSQL(U[48], strArr);
                this.b.remove(str);
                ContentValues contentValues = new ContentValues(1);
                contentValues.put(U[46], str2);
                sQLiteDatabase.update(U[44], contentValues, U[47], strArr);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
            } catch (Throwable th) {
            }
        }
        return true;
    }

    public void e(b bVar, int i) {
        d(bVar);
        a(i, bVar);
    }

    public ArrayList g(String str) {
        int i = m3.d;
        ArrayList arrayList = new ArrayList();
        synchronized (this.i) {
            Calendar.getInstance().add(5, -1);
            Cursor rawQuery = this.i.getReadableDatabase().rawQuery(U[224], new String[]{str, Long.toString(r3.getTimeInMillis())});
            if (rawQuery != null) {
                do {
                    try {
                        if (!rawQuery.moveToNext()) {
                            break;
                        }
                        arrayList.add(a(rawQuery, str));
                    } catch (SQLiteDiskIOException e) {
                        aq.a(App.p, (int) R.string.error_msgstore_db_diskio);
                        throw e;
                    } catch (Throwable th) {
                        rawQuery.close();
                    }
                } while (i == 0);
                Log.i(U[222] + arrayList.size());
                rawQuery.close();
            } else {
                Log.e(U[223]);
            }
        }
        return arrayList;
    }

    public void c(b bVar, int i) {
        d(bVar);
        Message.obtain(this.K.b, 1, i, 0, bVar).sendToTarget();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.whatsapp.protocol.m r11, java.lang.String r12, int r13, long r14) {
        /*
        r10_this = this;
        r8 = 1;
        r4 = -1;
        r0 = 0;
        r1 = r11.b;	 Catch:{ IllegalStateException -> 0x0030 }
        if (r1 != 0) goto L_0x0032;
    L_0x0007:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0030 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0030 }
        r2 = U;	 Catch:{ IllegalStateException -> 0x0030 }
        r3 = 407; // 0x197 float:5.7E-43 double:2.01E-321;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0030 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0030 }
        r2 = r11.c;	 Catch:{ IllegalStateException -> 0x0030 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0030 }
        r2 = " ";
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0030 }
        r2 = r11.a;	 Catch:{ IllegalStateException -> 0x0030 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0030 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0030 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IllegalStateException -> 0x0030 }
    L_0x002f:
        return r0;
    L_0x0030:
        r0 = move-exception;
        throw r0;
    L_0x0032:
        r3 = r10.b(r11);
        if (r3 != 0) goto L_0x0055;
    L_0x0038:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0053 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0053 }
        r2 = U;	 Catch:{ IllegalStateException -> 0x0053 }
        r3 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0053 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0053 }
        r1 = r1.append(r11);	 Catch:{ IllegalStateException -> 0x0053 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0053 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalStateException -> 0x0053 }
        goto L_0x002f;
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r1 = r3.a;	 Catch:{ IllegalStateException -> 0x0075 }
        r2 = 6;
        if (r1 != r2) goto L_0x0077;
    L_0x005a:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0075 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0075 }
        r2 = U;	 Catch:{ IllegalStateException -> 0x0075 }
        r3 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0075 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0075 }
        r1 = r1.append(r11);	 Catch:{ IllegalStateException -> 0x0075 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0075 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalStateException -> 0x0075 }
        goto L_0x002f;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r10.r();
        r1 = r3.e;
        r1 = r1.c;
        r1 = com.whatsapp.m8.d(r1);
        if (r1 == 0) goto L_0x0109;
    L_0x0084:
        r1 = new com.whatsapp.protocol.m;
        r2 = r3.e;
        r2 = r2.a;
        r1.<init>(r12, r8, r2);
        r1 = r10.b(r1);
        if (r1 != 0) goto L_0x00bb;
    L_0x0093:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00b9 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x00b9 }
        r2 = U;	 Catch:{ IllegalStateException -> 0x00b9 }
        r3 = 402; // 0x192 float:5.63E-43 double:1.986E-321;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x00b9 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00b9 }
        r1 = r1.append(r11);	 Catch:{ IllegalStateException -> 0x00b9 }
        r2 = " ";
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00b9 }
        r1 = r1.append(r12);	 Catch:{ IllegalStateException -> 0x00b9 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x00b9 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalStateException -> 0x00b9 }
        goto L_0x002f;
    L_0x00b9:
        r0 = move-exception;
        throw r0;
    L_0x00bb:
        r2 = r1.a;	 Catch:{ IllegalStateException -> 0x00fd }
        r2 = com.whatsapp.protocol.f.a(r2, r13);	 Catch:{ IllegalStateException -> 0x00fd }
        if (r2 < 0) goto L_0x00ff;
    L_0x00c3:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00fd }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x00fd }
        r2 = U;	 Catch:{ IllegalStateException -> 0x00fd }
        r4 = 409; // 0x199 float:5.73E-43 double:2.02E-321;
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x00fd }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00fd }
        r1 = r1.append(r11);	 Catch:{ IllegalStateException -> 0x00fd }
        r2 = U;	 Catch:{ IllegalStateException -> 0x00fd }
        r4 = 410; // 0x19a float:5.75E-43 double:2.026E-321;
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x00fd }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00fd }
        r2 = r3.a;	 Catch:{ IllegalStateException -> 0x00fd }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00fd }
        r2 = U;	 Catch:{ IllegalStateException -> 0x00fd }
        r3 = 408; // 0x198 float:5.72E-43 double:2.016E-321;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x00fd }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00fd }
        r1 = r1.append(r13);	 Catch:{ IllegalStateException -> 0x00fd }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x00fd }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalStateException -> 0x00fd }
        goto L_0x002f;
    L_0x00fd:
        r0 = move-exception;
        throw r0;
    L_0x00ff:
        r1.a = r13;	 Catch:{ IllegalStateException -> 0x0157 }
        r2 = -1;
        r10.d(r1, r2);	 Catch:{ IllegalStateException -> 0x0157 }
        r1 = com.whatsapp.m3.d;	 Catch:{ IllegalStateException -> 0x0157 }
        if (r1 == 0) goto L_0x0160;
    L_0x0109:
        r1 = r3.e;	 Catch:{ IllegalStateException -> 0x0159 }
        r1 = r1.c;	 Catch:{ IllegalStateException -> 0x0159 }
        r1 = com.whatsapp.bd.b(r1);	 Catch:{ IllegalStateException -> 0x0159 }
        if (r1 != 0) goto L_0x0160;
    L_0x0113:
        r1 = r3.a;	 Catch:{ IllegalStateException -> 0x0155 }
        r1 = com.whatsapp.protocol.f.a(r1, r13);	 Catch:{ IllegalStateException -> 0x0155 }
        if (r1 < 0) goto L_0x015b;
    L_0x011b:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0155 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0155 }
        r2 = U;	 Catch:{ IllegalStateException -> 0x0155 }
        r4 = 405; // 0x195 float:5.68E-43 double:2.0E-321;
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x0155 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0155 }
        r1 = r1.append(r11);	 Catch:{ IllegalStateException -> 0x0155 }
        r2 = U;	 Catch:{ IllegalStateException -> 0x0155 }
        r4 = 406; // 0x196 float:5.69E-43 double:2.006E-321;
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x0155 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0155 }
        r2 = r3.a;	 Catch:{ IllegalStateException -> 0x0155 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0155 }
        r2 = U;	 Catch:{ IllegalStateException -> 0x0155 }
        r3 = 411; // 0x19b float:5.76E-43 double:2.03E-321;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0155 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0155 }
        r1 = r1.append(r13);	 Catch:{ IllegalStateException -> 0x0155 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0155 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalStateException -> 0x0155 }
        goto L_0x002f;
    L_0x0155:
        r0 = move-exception;
        throw r0;
    L_0x0157:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0159 }
    L_0x0159:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0155 }
    L_0x015b:
        r3.a = r13;
        r10.d(r3, r4);
    L_0x0160:
        r0 = r10.K;
        r0 = r0.b;
        r1 = new com.whatsapp.i;
        r2 = r10;
        r4 = r12;
        r5 = r13;
        r6 = r14;
        r1.<init>(r2, r3, r4, r5, r6);
        r0.post(r1);
        r0 = r8;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(com.whatsapp.protocol.m, java.lang.String, int, long):boolean");
    }

    public void a(String str, long j) {
        Log.i(U[121] + str + " " + j);
        r();
        sf sfVar = (sf) this.b.get(str);
        if (sfVar == null) {
            try {
                Log.w(U[122] + str);
                return;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        try {
            if (j > sf.h(sfVar)) {
                this.K.b.post(new et(this, j, str, sfVar));
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public List a(m mVar, int i) {
        List list = null;
        int i2 = m3.d;
        if (e(b(mVar)) == 1) {
            try {
                Log.i(U[370] + mVar);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        String str = U[369] + i;
        String[] strArr = new String[]{mVar.c, String.valueOf(r2)};
        synchronized (this.i) {
            Cursor rawQuery = this.i.getReadableDatabase().rawQuery(str, strArr);
        }
        if (rawQuery != null) {
            list = new LinkedList();
            while (rawQuery.moveToNext()) {
                b a = a(rawQuery, mVar.c);
                if (a != null) {
                    try {
                        list.addFirst(a);
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
                if (i2 != 0) {
                    break;
                }
            }
            rawQuery.close();
        } else {
            Log.i(U[371] + mVar);
        }
        return list;
    }

    public void a(String str, l6 l6Var) {
        Log.i(U[65] + str + " " + l6Var);
        this.K.b.post(new af7(this, str, l6Var));
    }

    private void a(long j) {
        int i = m3.d;
        try {
            if (App.B() < j) {
                this.J.startActivity(new Intent(this.J, InsufficientStorageSpaceActivity.class).setFlags(268435456).putExtra(U[485], j));
            }
            while (App.B() < j) {
                try {
                    try {
                        Thread.sleep(200);
                    } catch (Throwable e) {
                        Log.b(U[486], e);
                        if (i != 0) {
                            return;
                        }
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (InterruptedException e3) {
            throw e3;
        }
    }

    public Map b(String str, String str2) {
        int i = m3.d;
        Log.a(U[32], null, new Object[]{str, str2});
        Map hashMap = new HashMap();
        if (e(b(new m(str, true, str2))) == 1) {
            try {
                Log.a(U[33], null, new Object[]{str, str2});
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        Cursor rawQuery = this.i.getReadableDatabase().rawQuery(U[31], new String[]{str, String.valueOf(e(b(new m(str, true, str2))))});
        if (rawQuery != null) {
            do {
                try {
                    if (!rawQuery.moveToNext()) {
                        break;
                    }
                    pj pjVar = new pj();
                    String string = rawQuery.getString(0);
                    pjVar.c = rawQuery.getLong(1);
                    pjVar.b = rawQuery.getLong(2);
                    pjVar.a = rawQuery.getLong(3);
                    pjVar.d = rawQuery.getLong(4);
                    hashMap.put(string, pjVar);
                } catch (Throwable th) {
                    rawQuery.close();
                }
            } while (i == 0);
            rawQuery.close();
        }
        return hashMap;
    }

    public void c(b bVar) {
        Message.obtain(this.K.b, 11, -1, 0, bVar).sendToTarget();
    }

    public long v() {
        int i = m3.d;
        String externalStorageState = Environment.getExternalStorageState();
        try {
            long lastModified;
            if (!externalStorageState.equals(U[329])) {
                if (!externalStorageState.equals(U[328])) {
                    Log.i(U[327] + externalStorageState);
                    return -1;
                }
            }
            ArrayList D = D();
            int size = D.size() - 1;
            long j = -1;
            while (size >= 0) {
                File file = (File) D.get(size);
                if (file.length() > 0) {
                    Log.i(U[330] + file.getName() + U[326] + file.length());
                    lastModified = file.lastModified();
                    if (i == 0) {
                        break;
                    }
                }
                lastModified = j;
                int i2 = size - 1;
                if (i != 0) {
                    break;
                }
                size = i2;
                j = lastModified;
            }
            lastModified = j;
            try {
                return lastModified == -1 ? 0 : lastModified;
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static ConcurrentHashMap e(l7 l7Var) {
        return l7Var.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean r(java.lang.String r13) {
        /*
        r12_this = this;
        r11 = 14;
        r0 = 1;
        r1 = 0;
        r3 = com.whatsapp.m3.d;
        r2 = new android.content.ContentValues;
        r2.<init>();
        r4 = U;
        r5 = 283; // 0x11b float:3.97E-43 double:1.4E-321;
        r4 = r4[r5];
        r5 = java.lang.Integer.valueOf(r1);
        r2.put(r4, r5);
        r4 = r12.i;
        monitor-enter(r4);
        r5 = r12.i;	 Catch:{ all -> 0x0092 }
        r5 = r5.getWritableDatabase();	 Catch:{ all -> 0x0092 }
        r6 = U;	 Catch:{ all -> 0x0092 }
        r7 = 281; // 0x119 float:3.94E-43 double:1.39E-321;
        r6 = r6[r7];	 Catch:{ all -> 0x0092 }
        r7 = U;	 Catch:{ all -> 0x0092 }
        r8 = 282; // 0x11a float:3.95E-43 double:1.393E-321;
        r7 = r7[r8];	 Catch:{ all -> 0x0092 }
        r8 = 2;
        r8 = new java.lang.String[r8];	 Catch:{ all -> 0x0092 }
        r9 = 0;
        r8[r9] = r13;	 Catch:{ all -> 0x0092 }
        r9 = 1;
        r10 = 14;
        r10 = java.lang.String.valueOf(r10);	 Catch:{ all -> 0x0092 }
        r8[r9] = r10;	 Catch:{ all -> 0x0092 }
        r2 = r5.update(r6, r2, r7, r8);	 Catch:{ all -> 0x0092 }
        if (r2 <= 0) goto L_0x008a;
    L_0x0042:
        r2 = r0;
    L_0x0043:
        if (r2 == 0) goto L_0x0088;
    L_0x0045:
        r0 = r12.S;	 Catch:{ all -> 0x0092 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0092 }
        r5 = r0.iterator();	 Catch:{ all -> 0x0092 }
    L_0x004f:
        r0 = r5.hasNext();	 Catch:{ all -> 0x0092 }
        if (r0 == 0) goto L_0x0088;
    L_0x0055:
        r0 = r5.next();	 Catch:{ all -> 0x0092 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0092 }
        r1 = r0.getKey();	 Catch:{ IllegalStateException -> 0x008c }
        r1 = (com.whatsapp.protocol.m) r1;	 Catch:{ IllegalStateException -> 0x008c }
        r1 = r1.b;	 Catch:{ IllegalStateException -> 0x008c }
        if (r1 == 0) goto L_0x0086;
    L_0x0065:
        r1 = r0.getKey();	 Catch:{ IllegalStateException -> 0x008c }
        r1 = (com.whatsapp.protocol.m) r1;	 Catch:{ IllegalStateException -> 0x008c }
        r1 = r1.c;	 Catch:{ IllegalStateException -> 0x008c }
        r1 = android.text.TextUtils.equals(r1, r13);	 Catch:{ IllegalStateException -> 0x008c }
        if (r1 == 0) goto L_0x0086;
    L_0x0073:
        r1 = r0.getValue();	 Catch:{ IllegalStateException -> 0x008e }
        r1 = (com.whatsapp.protocol.b) r1;	 Catch:{ IllegalStateException -> 0x008e }
        r1 = r1.a;	 Catch:{ IllegalStateException -> 0x008e }
        if (r1 != r11) goto L_0x0086;
    L_0x007d:
        r0 = r0.getValue();	 Catch:{ IllegalStateException -> 0x0090 }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ IllegalStateException -> 0x0090 }
        r1 = 0;
        r0.a = r1;	 Catch:{ IllegalStateException -> 0x0090 }
    L_0x0086:
        if (r3 == 0) goto L_0x004f;
    L_0x0088:
        monitor-exit(r4);	 Catch:{ all -> 0x0092 }
        return r2;
    L_0x008a:
        r2 = r1;
        goto L_0x0043;
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008e }
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0092 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.r(java.lang.String):boolean");
    }

    static Handler b(l7 l7Var) {
        return l7Var.o;
    }

    public ArrayList e(String str) {
        return a(str, -1, null);
    }

    public boolean a(m mVar, int i, long j) {
        try {
            if (mVar.b) {
                b b = b(mVar);
                if (b == null) {
                    try {
                        Log.w(U[633] + mVar);
                        return false;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                try {
                    if (f.a(b.a, 4) >= 0) {
                        Log.w(U[632] + mVar + U[628] + b.a + U[631] + 4);
                        return false;
                    }
                    b.a = 4;
                    b.y = i;
                    long currentTimeMillis = System.currentTimeMillis() - b.D;
                    Log.i(U[634] + currentTimeMillis + U[630] + mVar.a);
                    ak4.a(b, currentTimeMillis);
                    d(b, -1);
                    r();
                    this.K.b.post(new f3(this, b, j));
                    return true;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            Log.e(U[629] + mVar.c + " " + mVar.a);
            return false;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static void a(File file, String str) {
        b(file, str);
    }

    private boolean f(File file) {
        try {
            System.loadLibrary(U[600]);
            File file2 = new File(App.p.getFilesDir(), U[597]);
            try {
                if (file.exists()) {
                    try {
                        if (VERSION.SDK_INT >= 9) {
                            a(2 * file.length());
                        }
                        file2.delete();
                        Log.i(U[591] + file.getAbsolutePath() + U[593] + file2.getAbsolutePath() + ")");
                        if (SqliteShell.dump(file.getAbsolutePath(), file2.getAbsolutePath()) != 0) {
                            Log.e(U[586]);
                            return false;
                        }
                        Log.i(U[602]);
                        File file3 = new File(file.getAbsolutePath() + U[589]);
                        file3.delete();
                        Log.i(U[592] + file3.getAbsolutePath() + U[605] + file2.getAbsolutePath() + ")");
                        int restore = SqliteShell.restore(file3.getAbsolutePath(), file2.getAbsolutePath());
                        long length = file2.length();
                        file2.delete();
                        if (restore != 0) {
                            Log.e(U[587]);
                            return false;
                        }
                        Log.i(U[598]);
                        SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file3.getAbsolutePath(), null, 16);
                        openDatabase.setVersion(1);
                        openDatabase.close();
                        long a = (long) a(file);
                        long a2 = (long) a(file3);
                        Log.i(U[603] + file.getAbsolutePath() + U[604] + a);
                        Log.i(U[590] + file2.getAbsolutePath() + U[595] + length);
                        Log.i(U[601] + file3.getAbsolutePath() + U[599] + a2);
                        if (a < 0 || a2 < 0) {
                            return false;
                        }
                        return (a == 0 || ((double) a2) / ((double) a) >= 0.3d) ? file3.renameTo(file) : false;
                    } catch (UnsatisfiedLinkError e) {
                        throw e;
                    } catch (UnsatisfiedLinkError e2) {
                        throw e2;
                    } catch (Throwable e3) {
                        Log.b(U[594] + file.getAbsolutePath(), e3);
                        return false;
                    }
                }
                Log.e(U[588]);
                return false;
            } catch (UnsatisfiedLinkError e4) {
                throw e4;
            }
        } catch (UnsatisfiedLinkError e5) {
            Log.e(U[596]);
            return false;
        }
    }

    public String t() {
        return bp.a(this.K);
    }

    private static int c() {
        return new Random().nextInt(999999) + 1;
    }

    private void w(String str) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.whatsapp.protocol.b r11, boolean r12) {
        /*
        r10_this = this;
        r4 = 2;
        r1 = 1;
        r3 = com.whatsapp.m3.d;
        r0 = r11.A;
        r0 = (com.whatsapp.MediaData) r0;
        if (r0 == 0) goto L_0x004b;
    L_0x000a:
        r2 = r0.file;	 Catch:{ UnsupportedOperationException -> 0x004c }
        if (r2 == 0) goto L_0x004b;
    L_0x000e:
        r2 = r0.file;	 Catch:{ UnsupportedOperationException -> 0x004e }
        r2 = com.whatsapp.yf.a(r2);	 Catch:{ UnsupportedOperationException -> 0x004e }
        if (r2 == 0) goto L_0x004b;
    L_0x0016:
        r2 = r11.j;	 Catch:{ UnsupportedOperationException -> 0x0050 }
        if (r2 != r4) goto L_0x001f;
    L_0x001a:
        r2 = r11.w;	 Catch:{ UnsupportedOperationException -> 0x0052 }
        if (r2 != r1) goto L_0x001f;
    L_0x001e:
        r12 = r1;
    L_0x001f:
        r2 = r0.file;
        r2 = r2.getAbsolutePath();
        r4 = r10.k(r2);
        if (r4 != 0) goto L_0x0062;
    L_0x002b:
        if (r12 == 0) goto L_0x0062;
    L_0x002d:
        r2 = r0.file;	 Catch:{ IllegalStateException -> 0x0054 }
        r2.delete();	 Catch:{ IllegalStateException -> 0x0054 }
        r2 = com.whatsapp.App.e;	 Catch:{ UnsupportedOperationException -> 0x0056, IllegalArgumentException -> 0x0098 }
        r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;	 Catch:{ UnsupportedOperationException -> 0x0056, IllegalArgumentException -> 0x0098 }
        r6 = U;	 Catch:{ UnsupportedOperationException -> 0x0056, IllegalArgumentException -> 0x0098 }
        r7 = 481; // 0x1e1 float:6.74E-43 double:2.376E-321;
        r6 = r6[r7];	 Catch:{ UnsupportedOperationException -> 0x0056, IllegalArgumentException -> 0x0098 }
        r7 = 1;
        r7 = new java.lang.String[r7];	 Catch:{ UnsupportedOperationException -> 0x0056, IllegalArgumentException -> 0x0098 }
        r8 = 0;
        r9 = r0.file;	 Catch:{ UnsupportedOperationException -> 0x0056, IllegalArgumentException -> 0x0098 }
        r9 = r9.getAbsolutePath();	 Catch:{ UnsupportedOperationException -> 0x0056, IllegalArgumentException -> 0x0098 }
        r7[r8] = r9;	 Catch:{ UnsupportedOperationException -> 0x0056, IllegalArgumentException -> 0x0098 }
        r2.delete(r5, r6, r7);	 Catch:{ UnsupportedOperationException -> 0x0056, IllegalArgumentException -> 0x0098 }
    L_0x004b:
        return;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r2 = move-exception;
    L_0x0057:
        r5 = U;	 Catch:{ UnsupportedOperationException -> 0x0094 }
        r6 = 482; // 0x1e2 float:6.75E-43 double:2.38E-321;
        r5 = r5[r6];	 Catch:{ UnsupportedOperationException -> 0x0094 }
        com.whatsapp.util.Log.b(r5, r2);	 Catch:{ UnsupportedOperationException -> 0x0094 }
        if (r3 == 0) goto L_0x004b;
    L_0x0062:
        if (r4 != r1) goto L_0x0077;
    L_0x0064:
        r1 = r10.h;	 Catch:{ UnsupportedOperationException -> 0x0092 }
        r2 = 1;
        r5 = r0.file;	 Catch:{ UnsupportedOperationException -> 0x0092 }
        r5 = r5.getAbsolutePath();	 Catch:{ UnsupportedOperationException -> 0x0092 }
        r1.bindString(r2, r5);	 Catch:{ UnsupportedOperationException -> 0x0092 }
        r1 = r10.h;	 Catch:{ UnsupportedOperationException -> 0x0092 }
        r1.execute();	 Catch:{ UnsupportedOperationException -> 0x0092 }
        if (r3 == 0) goto L_0x004b;
    L_0x0077:
        r1 = r10.v;	 Catch:{ UnsupportedOperationException -> 0x0092 }
        r2 = 1;
        r3 = r4 + -1;
        r4 = (long) r3;	 Catch:{ UnsupportedOperationException -> 0x0092 }
        r1.bindLong(r2, r4);	 Catch:{ UnsupportedOperationException -> 0x0092 }
        r1 = r10.v;	 Catch:{ UnsupportedOperationException -> 0x0092 }
        r2 = 2;
        r0 = r0.file;	 Catch:{ UnsupportedOperationException -> 0x0092 }
        r0 = r0.getAbsolutePath();	 Catch:{ UnsupportedOperationException -> 0x0092 }
        r1.bindString(r2, r0);	 Catch:{ UnsupportedOperationException -> 0x0092 }
        r0 = r10.v;	 Catch:{ UnsupportedOperationException -> 0x0092 }
        r0.execute();	 Catch:{ UnsupportedOperationException -> 0x0092 }
        goto L_0x004b;
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0092 }
    L_0x0098:
        r2 = move-exception;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.b(com.whatsapp.protocol.b, boolean):void");
    }

    private ArrayList D() {
        return b(false);
    }

    static void h(l7 l7Var) {
        l7Var.A();
    }

    public void c(String str, String str2) {
        Log.i(U[305] + str + " " + str2);
        this.K.b.post(new fa(this, str, str2));
    }

    static Handler c(l7 l7Var) {
        return l7Var.w;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.whatsapp.protocol.b r7, android.database.sqlite.SQLiteStatement r8, int r9, int r10) {
        /*
        r2 = 1;
        r1 = 0;
        r0 = r7.j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0055 }
        if (r0 == r2) goto L_0x0015;
    L_0x0006:
        r0 = r7.j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0055 }
        r2 = 5;
        if (r0 == r2) goto L_0x0015;
    L_0x000b:
        r0 = r7.j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0057 }
        r2 = 3;
        if (r0 == r2) goto L_0x0015;
    L_0x0010:
        r0 = r7.j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0059 }
        r2 = 2;
        if (r0 != r2) goto L_0x0049;
    L_0x0015:
        r0 = r7.O;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005b }
        if (r0 != 0) goto L_0x00c3;
    L_0x0019:
        r0 = r7.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005b }
        if (r0 == 0) goto L_0x00c3;
    L_0x001f:
        r0 = r7.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005d, StringIndexOutOfBoundsException -> 0x00cd, IllegalArgumentException -> 0x00cb }
        r0 = r0.length();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005d, StringIndexOutOfBoundsException -> 0x00cd, IllegalArgumentException -> 0x00cb }
        if (r0 == 0) goto L_0x0032;
    L_0x0029:
        r0 = r7.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005d, StringIndexOutOfBoundsException -> 0x00cd, IllegalArgumentException -> 0x00cb }
        r2 = 0;
        r1 = android.backport.util.Base64.decode(r0, r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005d, StringIndexOutOfBoundsException -> 0x00cd, IllegalArgumentException -> 0x00cb }
    L_0x0032:
        r0 = 0;
        r0 = (java.lang.String) r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005d, StringIndexOutOfBoundsException -> 0x00cd, IllegalArgumentException -> 0x00cb }
        r7.b(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005d, StringIndexOutOfBoundsException -> 0x00cd, IllegalArgumentException -> 0x00cb }
        r7.b(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005d, StringIndexOutOfBoundsException -> 0x00cd, IllegalArgumentException -> 0x00cb }
        r0 = 1;
        r7.O = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005d, StringIndexOutOfBoundsException -> 0x00cd, IllegalArgumentException -> 0x00cb }
    L_0x003e:
        com.whatsapp.wv.a(r9, r1, r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c9 }
        r0 = 0;
        com.whatsapp.wv.a(r10, r0, r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c9 }
        r0 = com.whatsapp.m3.d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c9 }
        if (r0 == 0) goto L_0x0054;
    L_0x0049:
        r0 = r7.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c9 }
        com.whatsapp.wv.a(r10, r0, r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c9 }
        r0 = 0;
        com.whatsapp.wv.a(r9, r0, r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c9 }
    L_0x0054:
        return;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r0 = move-exception;
    L_0x005e:
        r2 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00bf }
        r2.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00bf }
        r3 = U;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00bf }
        r4 = 358; // 0x166 float:5.02E-43 double:1.77E-321;
        r3 = r3[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00bf }
        r3 = r7.O;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00bf }
        r2 = r2.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00bf }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00bf }
        r2 = r7.O;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00bf }
        if (r2 != 0) goto L_0x00b5;
    L_0x007e:
        r2 = r7.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
        if (r2 == 0) goto L_0x00b5;
    L_0x0084:
        r2 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
        r2.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
        r3 = U;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
        r4 = 360; // 0x168 float:5.04E-43 double:1.78E-321;
        r3 = r3[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
        r2 = r2.append(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
        r3 = r7.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
        r4 = 0;
        r5 = 100;
        r6 = r7.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
        r6 = r6.length();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
        r5 = java.lang.Math.min(r5, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
        r3 = r3.substring(r4, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
        r2 = r2.append(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
        r2 = r2.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
    L_0x00b5:
        r2 = U;
        r3 = 359; // 0x167 float:5.03E-43 double:1.774E-321;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        goto L_0x003e;
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;
    L_0x00c3:
        r1 = r7.c();
        goto L_0x003e;
    L_0x00c9:
        r0 = move-exception;
        throw r0;
    L_0x00cb:
        r0 = move-exception;
        goto L_0x005e;
    L_0x00cd:
        r0 = move-exception;
        goto L_0x005e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(com.whatsapp.protocol.b, android.database.sqlite.SQLiteStatement, int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.m r12) {
        /*
        r11_this = this;
        r6 = 14;
        r0 = 1;
        r1 = 0;
        r3 = com.whatsapp.m3.d;
        r4 = new android.content.ContentValues;
        r4.<init>();
        r2 = U;
        r5 = 278; // 0x116 float:3.9E-43 double:1.374E-321;
        r2 = r2[r5];
        r5 = java.lang.Integer.valueOf(r6);
        r4.put(r2, r5);
        r5 = r11.i;
        monitor-enter(r5);
        r2 = r11.i;	 Catch:{ all -> 0x0086 }
        r6 = r2.getWritableDatabase();	 Catch:{ all -> 0x0086 }
        r2 = U;	 Catch:{ all -> 0x0086 }
        r7 = 279; // 0x117 float:3.91E-43 double:1.38E-321;
        r7 = r2[r7];	 Catch:{ all -> 0x0086 }
        r2 = U;	 Catch:{ all -> 0x0086 }
        r8 = 280; // 0x118 float:3.92E-43 double:1.383E-321;
        r8 = r2[r8];	 Catch:{ all -> 0x0086 }
        r2 = 3;
        r9 = new java.lang.String[r2];	 Catch:{ all -> 0x0086 }
        r2 = 0;
        r10 = r12.c;	 Catch:{ all -> 0x0086 }
        r9[r2] = r10;	 Catch:{ all -> 0x0086 }
        r10 = 1;
        r2 = r12.b;	 Catch:{ all -> 0x0086 }
        if (r2 == 0) goto L_0x0081;
    L_0x003a:
        r2 = "1";
    L_0x003c:
        r9[r10] = r2;	 Catch:{ IllegalStateException -> 0x0084 }
        r2 = 2;
        r10 = r12.a;	 Catch:{ IllegalStateException -> 0x0084 }
        r9[r2] = r10;	 Catch:{ IllegalStateException -> 0x0084 }
        r2 = r6.update(r7, r4, r8, r9);	 Catch:{ IllegalStateException -> 0x0084 }
        if (r2 <= 0) goto L_0x0089;
    L_0x0049:
        if (r0 == 0) goto L_0x007f;
    L_0x004b:
        r0 = r11.S;	 Catch:{ all -> 0x0086 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0086 }
        r2 = r0.iterator();	 Catch:{ all -> 0x0086 }
    L_0x0055:
        r0 = r2.hasNext();	 Catch:{ all -> 0x0086 }
        if (r0 == 0) goto L_0x007f;
    L_0x005b:
        r0 = r2.next();	 Catch:{ all -> 0x0086 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0086 }
        r1 = r0.getKey();	 Catch:{ IllegalStateException -> 0x008b }
        if (r1 == 0) goto L_0x007d;
    L_0x0067:
        r1 = r0.getKey();	 Catch:{ IllegalStateException -> 0x008b }
        r1 = (com.whatsapp.protocol.m) r1;	 Catch:{ IllegalStateException -> 0x008b }
        r1 = r1.equals(r12);	 Catch:{ IllegalStateException -> 0x008b }
        if (r1 == 0) goto L_0x007d;
    L_0x0073:
        r0 = r0.getValue();	 Catch:{ IllegalStateException -> 0x008d }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ IllegalStateException -> 0x008d }
        r1 = 14;
        r0.a = r1;	 Catch:{ IllegalStateException -> 0x008d }
    L_0x007d:
        if (r3 == 0) goto L_0x0055;
    L_0x007f:
        monitor-exit(r5);	 Catch:{ all -> 0x0086 }
        return;
    L_0x0081:
        r2 = "0";
        goto L_0x003c;
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0086 }
        throw r0;
    L_0x0089:
        r0 = r1;
        goto L_0x0049;
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0086 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(com.whatsapp.protocol.m):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.b r11, long r12) {
        /*
        r10_this = this;
        r1 = com.whatsapp.m3.d;
        r4 = r10.i;
        monitor-enter(r4);
        r10.z();	 Catch:{ all -> 0x0101 }
        r0 = r11.e;	 Catch:{ all -> 0x0101 }
        r0 = r0.c;	 Catch:{ all -> 0x0101 }
        r0 = com.whatsapp.m8.d(r0);	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x0042;
    L_0x0012:
        r0 = r10.N;	 Catch:{ all -> 0x0101 }
        r2 = 1;
        r3 = r11.a;	 Catch:{ IllegalStateException -> 0x00ff }
        r6 = (long) r3;	 Catch:{ IllegalStateException -> 0x00ff }
        r0.bindLong(r2, r6);	 Catch:{ IllegalStateException -> 0x00ff }
        r2 = 2;
        r0.bindLong(r2, r12);	 Catch:{ IllegalStateException -> 0x00ff }
        r2 = 3;
        r3 = r11.y;	 Catch:{ IllegalStateException -> 0x00ff }
        r6 = (long) r3;	 Catch:{ IllegalStateException -> 0x00ff }
        r0.bindLong(r2, r6);	 Catch:{ IllegalStateException -> 0x00ff }
        r2 = 4;
        r6 = r11.D;	 Catch:{ IllegalStateException -> 0x00ff }
        r0.bindLong(r2, r6);	 Catch:{ IllegalStateException -> 0x00ff }
        r5 = 5;
        r2 = r11.e;	 Catch:{ IllegalStateException -> 0x00ff }
        r2 = r2.b;	 Catch:{ IllegalStateException -> 0x00ff }
        if (r2 == 0) goto L_0x0104;
    L_0x0033:
        r2 = 1;
    L_0x0035:
        r0.bindLong(r5, r2);	 Catch:{ all -> 0x0101 }
        r2 = 6;
        r3 = r11.e;	 Catch:{ all -> 0x0101 }
        r3 = r3.a;	 Catch:{ all -> 0x0101 }
        r0.bindString(r2, r3);	 Catch:{ all -> 0x0101 }
        if (r1 == 0) goto L_0x0072;
    L_0x0042:
        r0 = r10.k;	 Catch:{ all -> 0x0101 }
        r2 = 1;
        r3 = r11.a;	 Catch:{ IllegalStateException -> 0x0108 }
        r6 = (long) r3;	 Catch:{ IllegalStateException -> 0x0108 }
        r0.bindLong(r2, r6);	 Catch:{ IllegalStateException -> 0x0108 }
        r2 = 2;
        r0.bindLong(r2, r12);	 Catch:{ IllegalStateException -> 0x0108 }
        r2 = 3;
        r3 = r11.y;	 Catch:{ IllegalStateException -> 0x0108 }
        r6 = (long) r3;	 Catch:{ IllegalStateException -> 0x0108 }
        r0.bindLong(r2, r6);	 Catch:{ IllegalStateException -> 0x0108 }
        r2 = 4;
        r3 = r11.e;	 Catch:{ IllegalStateException -> 0x0108 }
        r3 = r3.c;	 Catch:{ IllegalStateException -> 0x0108 }
        r0.bindString(r2, r3);	 Catch:{ IllegalStateException -> 0x0108 }
        r5 = 5;
        r2 = r11.e;	 Catch:{ IllegalStateException -> 0x0108 }
        r2 = r2.b;	 Catch:{ IllegalStateException -> 0x0108 }
        if (r2 == 0) goto L_0x010a;
    L_0x0065:
        r2 = 1;
    L_0x0067:
        r0.bindLong(r5, r2);	 Catch:{ all -> 0x0101 }
        r2 = 6;
        r3 = r11.e;	 Catch:{ all -> 0x0101 }
        r3 = r3.a;	 Catch:{ all -> 0x0101 }
        r0.bindString(r2, r3);	 Catch:{ all -> 0x0101 }
    L_0x0072:
        r0.execute();	 Catch:{ all -> 0x0101 }
        r0 = r11.e;	 Catch:{ all -> 0x0101 }
        r0 = r0.c;	 Catch:{ all -> 0x0101 }
        r0 = com.whatsapp.m8.d(r0);	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x00fd;
    L_0x007f:
        r0 = r10.S;	 Catch:{ all -> 0x0101 }
        r0 = r0.values();	 Catch:{ all -> 0x0101 }
        r2 = r0.iterator();	 Catch:{ all -> 0x0101 }
    L_0x0089:
        r0 = r2.hasNext();	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x00bb;
    L_0x008f:
        r0 = r2.next();	 Catch:{ all -> 0x0101 }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ all -> 0x0101 }
        r3 = r0.l;	 Catch:{ IllegalStateException -> 0x010e }
        if (r3 == 0) goto L_0x00b9;
    L_0x0099:
        r6 = r0.D;	 Catch:{ IllegalStateException -> 0x010e }
        r8 = r11.D;	 Catch:{ IllegalStateException -> 0x010e }
        r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r3 != 0) goto L_0x00b9;
    L_0x00a1:
        r3 = r0.e;	 Catch:{ IllegalStateException -> 0x0110 }
        r3 = r3.b;	 Catch:{ IllegalStateException -> 0x0110 }
        if (r3 == 0) goto L_0x00b9;
    L_0x00a7:
        r3 = r0.e;	 Catch:{ IllegalStateException -> 0x0112 }
        r3 = r3.a;	 Catch:{ IllegalStateException -> 0x0112 }
        r5 = r11.e;	 Catch:{ IllegalStateException -> 0x0112 }
        r5 = r5.a;	 Catch:{ IllegalStateException -> 0x0112 }
        r3 = r3.equals(r5);	 Catch:{ IllegalStateException -> 0x0112 }
        if (r3 == 0) goto L_0x00b9;
    L_0x00b5:
        r3 = r11.a;	 Catch:{ IllegalStateException -> 0x0114 }
        r0.a = r3;	 Catch:{ IllegalStateException -> 0x0114 }
    L_0x00b9:
        if (r1 == 0) goto L_0x0089;
    L_0x00bb:
        r0 = r10.b;	 Catch:{ all -> 0x0101 }
        r0 = r0.values();	 Catch:{ all -> 0x0101 }
        r2 = r0.iterator();	 Catch:{ all -> 0x0101 }
    L_0x00c5:
        r0 = r2.hasNext();	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x00fd;
    L_0x00cb:
        r0 = r2.next();	 Catch:{ all -> 0x0101 }
        r0 = (com.whatsapp.sf) r0;	 Catch:{ all -> 0x0101 }
        r0 = com.whatsapp.sf.f(r0);	 Catch:{ all -> 0x0101 }
        if (r0 == 0) goto L_0x00fb;
    L_0x00d7:
        r3 = r0.l;	 Catch:{ IllegalStateException -> 0x0116 }
        if (r3 == 0) goto L_0x00fb;
    L_0x00db:
        r6 = r0.D;	 Catch:{ IllegalStateException -> 0x0118 }
        r8 = r11.D;	 Catch:{ IllegalStateException -> 0x0118 }
        r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r3 != 0) goto L_0x00fb;
    L_0x00e3:
        r3 = r0.e;	 Catch:{ IllegalStateException -> 0x011a }
        r3 = r3.b;	 Catch:{ IllegalStateException -> 0x011a }
        if (r3 == 0) goto L_0x00fb;
    L_0x00e9:
        r3 = r0.e;	 Catch:{ IllegalStateException -> 0x011c }
        r3 = r3.a;	 Catch:{ IllegalStateException -> 0x011c }
        r5 = r11.e;	 Catch:{ IllegalStateException -> 0x011c }
        r5 = r5.a;	 Catch:{ IllegalStateException -> 0x011c }
        r3 = r3.equals(r5);	 Catch:{ IllegalStateException -> 0x011c }
        if (r3 == 0) goto L_0x00fb;
    L_0x00f7:
        r3 = r11.a;	 Catch:{ IllegalStateException -> 0x011e }
        r0.a = r3;	 Catch:{ IllegalStateException -> 0x011e }
    L_0x00fb:
        if (r1 == 0) goto L_0x00c5;
    L_0x00fd:
        monitor-exit(r4);	 Catch:{ all -> 0x0101 }
        return;
    L_0x00ff:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0101 }
    L_0x0101:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0101 }
        throw r0;
    L_0x0104:
        r2 = 0;
        goto L_0x0035;
    L_0x0108:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0101 }
    L_0x010a:
        r2 = 0;
        goto L_0x0067;
    L_0x010e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0110 }
    L_0x0110:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0112 }
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0114 }
    L_0x0114:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0101 }
    L_0x0116:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0118 }
    L_0x0118:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x011a }
    L_0x011a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x011c }
    L_0x011c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x011e }
    L_0x011e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0101 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(com.whatsapp.protocol.b, long):void");
    }

    private SQLiteStatement a(SQLiteStatement sQLiteStatement, String str) {
        if (sQLiteStatement != null) {
            try {
                sQLiteStatement.close();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return this.i.getWritableDatabase().compileStatement(str);
    }

    public List h() {
        List arrayList;
        synchronized (this.C) {
            arrayList = new ArrayList(this.C);
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(com.whatsapp.protocol.b r19, boolean r20) {
        /*
        r18_this = this;
        r4 = 0;
        r5 = 0;
        r0 = r19;
        r2 = r0.e;
        r8 = r2.c;
        r3 = 0;
        r0 = r18;
        r9 = r0.i;
        monitor-enter(r9);
        r0 = r18;
        r2 = r0.S;	 Catch:{ all -> 0x0173 }
        r0 = r19;
        r6 = r0.e;	 Catch:{ all -> 0x0173 }
        r2.remove(r6);	 Catch:{ all -> 0x0173 }
        r0 = r18;
        r2 = r0.i;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r4 = r2.getWritableDatabase();	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r18.z();	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r4.beginTransaction();	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r0 = r18;
        r2 = r0.F;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r6 = 1;
        r2.bindString(r6, r8);	 Catch:{ SQLiteDoneException -> 0x0163, RuntimeException -> 0x0180, Error -> 0x0192 }
        r10 = 2;
        r0 = r19;
        r6 = r0.e;	 Catch:{ SQLiteDoneException -> 0x0163, RuntimeException -> 0x0180, Error -> 0x0192 }
        r6 = r6.b;	 Catch:{ SQLiteDoneException -> 0x0163, RuntimeException -> 0x0180, Error -> 0x0192 }
        if (r6 == 0) goto L_0x0176;
    L_0x0038:
        r6 = 1;
    L_0x003a:
        r2.bindLong(r10, r6);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r6 = 3;
        r0 = r19;
        r7 = r0.e;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = r7.a;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r2.bindString(r6, r7);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r6 = r2.simpleQueryForLong();	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r0 = r19;
        r2 = r0.j;	 Catch:{ SQLiteDoneException -> 0x017a, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = 1;
        if (r2 == r7) goto L_0x0064;
    L_0x0056:
        r0 = r19;
        r2 = r0.j;	 Catch:{ SQLiteDoneException -> 0x017a, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = 2;
        if (r2 == r7) goto L_0x0064;
    L_0x005d:
        r0 = r19;
        r2 = r0.j;	 Catch:{ SQLiteDoneException -> 0x017c, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = 3;
        if (r2 != r7) goto L_0x0067;
    L_0x0064:
        r18.b(r19, r20);	 Catch:{ SQLiteDoneException -> 0x017e, RuntimeException -> 0x0180, Error -> 0x0192 }
    L_0x0067:
        r0 = r18;
        r2 = r0.a;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = 1;
        r10 = r6.longValue();	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r2.bindLong(r7, r10);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r2.execute();	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r0 = r18;
        r2 = r0.b;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r2 = r2.get(r8);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r2 = (com.whatsapp.sf) r2;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        if (r2 == 0) goto L_0x0155;
    L_0x0082:
        r3 = c();	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r10 = com.whatsapp.sf.b(r2);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r12 = r6.longValue();	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r7 != 0) goto L_0x0194;
    L_0x0092:
        r0 = r18;
        r10 = r0.b(r8);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = new android.content.ContentValues;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r12 = 2;
        r7.<init>(r12);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r12 = U;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r13 = 53;
        r12 = r12[r13];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r13 = java.lang.Long.valueOf(r10);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7.put(r12, r13);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r12 = U;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r13 = 55;
        r12 = r12[r13];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r13 = java.lang.Integer.valueOf(r3);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7.put(r12, r13);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r12 = 1;
        r12 = new java.lang.String[r12];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r13 = 0;
        r12[r13] = r8;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r13 = U;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r14 = 59;
        r13 = r13[r14];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r14 = U;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r15 = 50;
        r14 = r14[r15];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r13 = r4.update(r13, r7, r14, r12);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        if (r13 != 0) goto L_0x0104;
    L_0x00d0:
        r13 = U;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r14 = 57;
        r13 = r13[r14];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7.put(r13, r8);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r13 = U;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r14 = 60;
        r13 = r13[r14];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r14 = 0;
        r14 = r4.insert(r13, r14, r7);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r16 = -1;
        r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
        if (r7 != 0) goto L_0x0104;
    L_0x00ea:
        r7 = new java.lang.StringBuilder;	 Catch:{ SQLiteDoneException -> 0x0190, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7.<init>();	 Catch:{ SQLiteDoneException -> 0x0190, RuntimeException -> 0x0180, Error -> 0x0192 }
        r13 = U;	 Catch:{ SQLiteDoneException -> 0x0190, RuntimeException -> 0x0180, Error -> 0x0192 }
        r14 = 52;
        r13 = r13[r14];	 Catch:{ SQLiteDoneException -> 0x0190, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = r7.append(r13);	 Catch:{ SQLiteDoneException -> 0x0190, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = r7.append(r8);	 Catch:{ SQLiteDoneException -> 0x0190, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = r7.toString();	 Catch:{ SQLiteDoneException -> 0x0190, RuntimeException -> 0x0180, Error -> 0x0192 }
        com.whatsapp.util.Log.e(r7);	 Catch:{ SQLiteDoneException -> 0x0190, RuntimeException -> 0x0180, Error -> 0x0192 }
    L_0x0104:
        r14 = 1;
        r7 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1));
        if (r7 == 0) goto L_0x013b;
    L_0x010a:
        r0 = r18;
        r5 = r0.j(r8);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        if (r5 == 0) goto L_0x013b;
    L_0x0112:
        r14 = r5.D;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        com.whatsapp.sf.b(r2, r14);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = new android.content.ContentValues;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r8 = 1;
        r7.<init>(r8);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r8 = U;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r13 = 54;
        r8 = r8[r13];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r14 = r5.D;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r13 = java.lang.Long.valueOf(r14);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7.put(r8, r13);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r8 = U;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r13 = 61;
        r8 = r8[r13];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r13 = U;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r14 = 56;
        r13 = r13[r14];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r4.update(r8, r7, r13, r12);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
    L_0x013b:
        com.whatsapp.sf.d(r2, r10);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        com.whatsapp.sf.a(r2, r5);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
    L_0x0141:
        r10 = com.whatsapp.sf.d(r2);	 Catch:{ SQLiteDoneException -> 0x01f7, RuntimeException -> 0x0180, Error -> 0x0192 }
        r6 = r6.longValue();	 Catch:{ SQLiteDoneException -> 0x01f7, RuntimeException -> 0x0180, Error -> 0x0192 }
        r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r5 != 0) goto L_0x0152;
    L_0x014d:
        r6 = 1;
        com.whatsapp.sf.f(r2, r6);	 Catch:{ SQLiteDoneException -> 0x01f7, RuntimeException -> 0x0180, Error -> 0x0192 }
    L_0x0152:
        com.whatsapp.sf.a(r2, r3);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
    L_0x0155:
        r4.setTransactionSuccessful();	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r2 = r4.inTransaction();	 Catch:{ all -> 0x0173 }
        if (r2 == 0) goto L_0x0161;
    L_0x015e:
        r4.endTransaction();	 Catch:{ all -> 0x0173 }
    L_0x0161:
        monitor-exit(r9);	 Catch:{ all -> 0x0173 }
        return r3;
    L_0x0163:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
    L_0x0165:
        r2 = move-exception;
        com.whatsapp.util.Log.c(r2);	 Catch:{ all -> 0x0185 }
        r2 = r4.inTransaction();	 Catch:{ all -> 0x0173 }
        if (r2 == 0) goto L_0x0161;
    L_0x016f:
        r4.endTransaction();	 Catch:{ all -> 0x0173 }
        goto L_0x0161;
    L_0x0173:
        r2 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0173 }
        throw r2;
    L_0x0176:
        r6 = 0;
        goto L_0x003a;
    L_0x017a:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDoneException -> 0x017c, RuntimeException -> 0x0180, Error -> 0x0192 }
    L_0x017c:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDoneException -> 0x017e, RuntimeException -> 0x0180, Error -> 0x0192 }
    L_0x017e:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
    L_0x0180:
        r2 = move-exception;
    L_0x0181:
        com.whatsapp.util.Log.c(r2);	 Catch:{ all -> 0x0185 }
        throw r2;	 Catch:{ all -> 0x0185 }
    L_0x0185:
        r2 = move-exception;
        r3 = r4.inTransaction();	 Catch:{ SQLiteDoneException -> 0x01f9 }
        if (r3 == 0) goto L_0x018f;
    L_0x018c:
        r4.endTransaction();	 Catch:{ SQLiteDoneException -> 0x01f9 }
    L_0x018f:
        throw r2;	 Catch:{ all -> 0x0173 }
    L_0x0190:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
    L_0x0192:
        r2 = move-exception;
        goto L_0x0181;
    L_0x0194:
        r5 = new android.content.ContentValues;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = 2;
        r5.<init>(r7);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = U;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r10 = 62;
        r7 = r7[r10];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r10 = java.lang.Integer.valueOf(r3);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r5.put(r7, r10);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = 1;
        r7 = new java.lang.String[r7];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r10 = 0;
        r7[r10] = r8;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r10 = U;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r11 = 63;
        r10 = r10[r11];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r11 = U;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r12 = 64;
        r11 = r11[r12];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = r4.update(r10, r5, r11, r7);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        if (r7 != 0) goto L_0x0141;
    L_0x01bf:
        r7 = U;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r10 = 51;
        r7 = r7[r10];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r5.put(r7, r8);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = U;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r10 = 49;
        r7 = r7[r10];	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r10 = 0;
        r10 = r4.insert(r7, r10, r5);	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
        r12 = -1;
        r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r5 != 0) goto L_0x0141;
    L_0x01d9:
        r5 = new java.lang.StringBuilder;	 Catch:{ SQLiteDoneException -> 0x01f5, RuntimeException -> 0x0180, Error -> 0x0192 }
        r5.<init>();	 Catch:{ SQLiteDoneException -> 0x01f5, RuntimeException -> 0x0180, Error -> 0x0192 }
        r7 = U;	 Catch:{ SQLiteDoneException -> 0x01f5, RuntimeException -> 0x0180, Error -> 0x0192 }
        r10 = 58;
        r7 = r7[r10];	 Catch:{ SQLiteDoneException -> 0x01f5, RuntimeException -> 0x0180, Error -> 0x0192 }
        r5 = r5.append(r7);	 Catch:{ SQLiteDoneException -> 0x01f5, RuntimeException -> 0x0180, Error -> 0x0192 }
        r5 = r5.append(r8);	 Catch:{ SQLiteDoneException -> 0x01f5, RuntimeException -> 0x0180, Error -> 0x0192 }
        r5 = r5.toString();	 Catch:{ SQLiteDoneException -> 0x01f5, RuntimeException -> 0x0180, Error -> 0x0192 }
        com.whatsapp.util.Log.e(r5);	 Catch:{ SQLiteDoneException -> 0x01f5, RuntimeException -> 0x0180, Error -> 0x0192 }
        goto L_0x0141;
    L_0x01f5:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
    L_0x01f7:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDoneException -> 0x0165, RuntimeException -> 0x0180, Error -> 0x0192 }
    L_0x01f9:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0173 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(com.whatsapp.protocol.b, boolean):int");
    }

    public void a(Collection collection, boolean z) {
        Log.i(U[235] + collection.size());
        r();
        this.K.b.post(new al7(this, collection, z));
    }

    public Boolean a(boolean z, boolean z2) {
        return a(z, true, z2);
    }

    public Cursor u() {
        Cursor rawQuery;
        String[] strArr = new String[]{U[66]};
        synchronized (this.i) {
            rawQuery = this.i.getReadableDatabase().rawQuery(U[67], strArr);
        }
        return rawQuery;
    }

    private void z() {
        try {
            if (!this.O) {
                synchronized (this.i) {
                    if (this.O) {
                        return;
                    }
                    Log.i(U[132]);
                    this.A = this.i.getWritableDatabase().compileStatement(U[137]);
                    this.I = this.i.getWritableDatabase().compileStatement(U[133]);
                    this.k = this.i.getWritableDatabase().compileStatement(U[134]);
                    this.N = this.i.getWritableDatabase().compileStatement(U[139]);
                    this.T = this.i.getWritableDatabase().compileStatement(U[135]);
                    this.E = this.i.getWritableDatabase().compileStatement(U[140]);
                    this.t = this.i.getWritableDatabase().compileStatement(j);
                    this.a = this.i.getWritableDatabase().compileStatement(U[143]);
                    this.F = this.i.getReadableDatabase().compileStatement(U[141]);
                    this.l = this.i.getReadableDatabase().compileStatement(U[136]);
                    this.v = this.i.getReadableDatabase().compileStatement(U[142]);
                    this.h = this.i.getReadableDatabase().compileStatement(U[138]);
                    this.O = true;
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.LinkedList a(long r10, com.whatsapp.c4 r12) {
        /*
        r9_this = this;
        r0 = com.whatsapp.m3.d;
        r1 = new java.util.LinkedList;
        r1.<init>();
        r2 = r9.i;
        monitor-enter(r2);
        r3 = r9.i;	 Catch:{ all -> 0x0092 }
        r3 = r3.getReadableDatabase();	 Catch:{ all -> 0x0092 }
        r4 = U;	 Catch:{ all -> 0x0092 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ all -> 0x0092 }
        r5 = 1;
        r5 = new java.lang.String[r5];	 Catch:{ all -> 0x0092 }
        r6 = 0;
        r7 = java.lang.Long.toString(r10);	 Catch:{ all -> 0x0092 }
        r5[r6] = r7;	 Catch:{ all -> 0x0092 }
        r3 = r3.rawQuery(r4, r5);	 Catch:{ all -> 0x0092 }
        if (r3 == 0) goto L_0x005a;
    L_0x0025:
        r4 = U;	 Catch:{ all -> 0x0092 }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ all -> 0x0092 }
        r4 = r3.getColumnIndex(r4);	 Catch:{ all -> 0x0092 }
    L_0x002e:
        r5 = r3.moveToNext();	 Catch:{ SQLiteDiskIOException -> 0x0083 }
        if (r5 == 0) goto L_0x0055;
    L_0x0034:
        if (r12 == 0) goto L_0x003c;
    L_0x0036:
        r5 = r12.a();	 Catch:{ SQLiteDiskIOException -> 0x0081 }
        if (r5 != 0) goto L_0x0055;
    L_0x003c:
        r5 = r3.getString(r4);	 Catch:{ SQLiteDiskIOException -> 0x0083 }
        if (r5 != 0) goto L_0x004c;
    L_0x0042:
        r6 = U;	 Catch:{ SQLiteDiskIOException -> 0x0095 }
        r7 = 4;
        r6 = r6[r7];	 Catch:{ SQLiteDiskIOException -> 0x0095 }
        com.whatsapp.util.Log.w(r6);	 Catch:{ SQLiteDiskIOException -> 0x0095 }
        if (r0 == 0) goto L_0x002e;
    L_0x004c:
        r5 = r9.a(r3, r5);	 Catch:{ SQLiteDiskIOException -> 0x0083 }
        r1.add(r5);	 Catch:{ SQLiteDiskIOException -> 0x0083 }
        if (r0 == 0) goto L_0x002e;
    L_0x0055:
        r3.close();	 Catch:{ all -> 0x0092 }
        if (r0 == 0) goto L_0x0062;
    L_0x005a:
        r0 = U;	 Catch:{ SQLiteDiskIOException -> 0x0097 }
        r3 = 0;
        r0 = r0[r3];	 Catch:{ SQLiteDiskIOException -> 0x0097 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SQLiteDiskIOException -> 0x0097 }
    L_0x0062:
        monitor-exit(r2);	 Catch:{ all -> 0x0092 }
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = U;
        r3 = 3;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r1.size();
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return r1;
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        r1 = com.whatsapp.App.p;	 Catch:{ all -> 0x008d }
        r4 = 2131624284; // 0x7f0e015c float:1.8875743E38 double:1.0531623286E-314;
        com.whatsapp.util.aq.a(r1, r4);	 Catch:{ all -> 0x008d }
        throw r0;	 Catch:{ all -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        r3.close();	 Catch:{ all -> 0x0092 }
        throw r0;	 Catch:{ all -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0092 }
        throw r0;
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0083 }
    L_0x0097:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0092 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(long, com.whatsapp.c4):java.util.LinkedList");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void I() {
        /*
        r13_this = this;
        r12 = 5;
        r11 = 4;
        r10 = 0;
        r2 = 0;
        r4 = com.whatsapp.m3.d;
        r0 = U;
        r1 = 7;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r5 = new java.util.HashMap;
        r5.<init>();
        r6 = r13.i;
        monitor-enter(r6);
        r0 = r13.i;	 Catch:{ all -> 0x0153 }
        r0 = r0.getReadableDatabase();	 Catch:{ all -> 0x0153 }
        r1 = U;	 Catch:{ all -> 0x0153 }
        r3 = 6;
        r1 = r1[r3];	 Catch:{ all -> 0x0153 }
        r3 = 0;
        r7 = r0.rawQuery(r1, r3);	 Catch:{ all -> 0x0153 }
        if (r7 == 0) goto L_0x00b8;
    L_0x0028:
        r0 = r7.moveToNext();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        if (r0 == 0) goto L_0x00b3;
    L_0x002e:
        r0 = 0;
        r1 = r7.getString(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        r0 = r5.get(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        r0 = (java.util.HashSet) r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        if (r0 != 0) goto L_0x01ef;
    L_0x003b:
        r0 = new java.util.HashSet;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        r0.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        r5.put(r1, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        r3 = r0;
    L_0x0044:
        r0 = 2;
        r8 = r7.getInt(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        r0 = 9;
        if (r8 != r0) goto L_0x006e;
    L_0x004d:
        r0 = 4;
        r0 = r7.getBlob(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        if (r0 == 0) goto L_0x006c;
    L_0x0054:
        r1 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x01e8, ClassNotFoundException -> 0x0156, all -> 0x0168 }
        r9 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x01e8, ClassNotFoundException -> 0x0156, all -> 0x0168 }
        r9.<init>(r0);	 Catch:{ IOException -> 0x01e8, ClassNotFoundException -> 0x0156, all -> 0x0168 }
        r1.<init>(r9);	 Catch:{ IOException -> 0x01e8, ClassNotFoundException -> 0x0156, all -> 0x0168 }
        r0 = r1.readObject();	 Catch:{ IOException -> 0x01ec, ClassNotFoundException -> 0x01e5 }
        r0 = (java.util.Vector) r0;	 Catch:{ IOException -> 0x01ec, ClassNotFoundException -> 0x01e5 }
        r3.addAll(r0);	 Catch:{ IOException -> 0x01ec, ClassNotFoundException -> 0x01e5 }
        if (r1 == 0) goto L_0x006c;
    L_0x0069:
        r1.close();	 Catch:{ IOException -> 0x013e }
    L_0x006c:
        if (r4 == 0) goto L_0x00b1;
    L_0x006e:
        r0 = 3;
        r0 = r7.getString(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        if (r0 == 0) goto L_0x00b1;
    L_0x0075:
        if (r8 != r11) goto L_0x007c;
    L_0x0077:
        r3.add(r0);	 Catch:{ IOException -> 0x0176 }
        if (r4 == 0) goto L_0x00b1;
    L_0x007c:
        if (r8 != r12) goto L_0x0083;
    L_0x007e:
        r3.remove(r0);	 Catch:{ IOException -> 0x017a }
        if (r4 == 0) goto L_0x00b1;
    L_0x0083:
        r1 = 7;
        if (r8 != r1) goto L_0x008b;
    L_0x0086:
        r3.remove(r0);	 Catch:{ IOException -> 0x017e }
        if (r4 == 0) goto L_0x00b1;
    L_0x008b:
        r1 = 10;
        if (r8 != r1) goto L_0x00b1;
    L_0x008f:
        r3.remove(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        r0 = 4;
        r0 = r7.getBlob(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        if (r0 == 0) goto L_0x00b1;
    L_0x0099:
        r1 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x01dd, ClassNotFoundException -> 0x0188, all -> 0x019a }
        r8 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x01dd, ClassNotFoundException -> 0x0188, all -> 0x019a }
        r8.<init>(r0);	 Catch:{ IOException -> 0x01dd, ClassNotFoundException -> 0x0188, all -> 0x019a }
        r1.<init>(r8);	 Catch:{ IOException -> 0x01dd, ClassNotFoundException -> 0x0188, all -> 0x019a }
        r0 = r1.readObject();	 Catch:{ IOException -> 0x01e0, ClassNotFoundException -> 0x01db }
        r0 = (java.lang.String) r0;	 Catch:{ IOException -> 0x01e0, ClassNotFoundException -> 0x01db }
        r3.add(r0);	 Catch:{ IOException -> 0x01e0, ClassNotFoundException -> 0x01db }
        if (r1 == 0) goto L_0x00b1;
    L_0x00ae:
        r1.close();	 Catch:{ IOException -> 0x0182 }
    L_0x00b1:
        if (r4 == 0) goto L_0x0028;
    L_0x00b3:
        r7.close();	 Catch:{ all -> 0x0153 }
        if (r4 == 0) goto L_0x00c0;
    L_0x00b8:
        r0 = U;	 Catch:{ IOException -> 0x01a8 }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ IOException -> 0x01a8 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x01a8 }
    L_0x00c0:
        monitor-exit(r6);	 Catch:{ all -> 0x0153 }
        r1 = new java.util.ArrayList;
        r1.<init>();
        r0 = r5.keySet();
        r3 = r0.iterator();
    L_0x00ce:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x00ff;
    L_0x00d4:
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        r6 = new com.whatsapp.cs;
        r6.<init>(r0);
        r0 = r5.get(r0);
        r0 = (java.util.HashSet) r0;
        r7 = r0.iterator();
    L_0x00e9:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x00fa;
    L_0x00ef:
        r0 = r7.next();
        r0 = (java.lang.String) r0;
        r6.a(r0, r10, r10);
        if (r4 == 0) goto L_0x00e9;
    L_0x00fa:
        r1.add(r6);
        if (r4 == 0) goto L_0x00ce;
    L_0x00ff:
        r13.a(r1);
        r3 = r13.i;
        monitor-enter(r3);
        r0 = U;	 Catch:{ all -> 0x01d0 }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ all -> 0x01d0 }
        r1 = r13.i;	 Catch:{ SQLiteDiskIOException -> 0x01ac }
        r1 = r1.getReadableDatabase();	 Catch:{ SQLiteDiskIOException -> 0x01ac }
        r4 = 0;
        r2 = r1.rawQuery(r0, r4);	 Catch:{ SQLiteDiskIOException -> 0x01ac }
        if (r2 == 0) goto L_0x0139;
    L_0x0118:
        r0 = r2.moveToNext();	 Catch:{ IOException -> 0x01aa }
        if (r0 == 0) goto L_0x0139;
    L_0x011e:
        r0 = 0;
        r4 = r2.getString(r0);	 Catch:{ SQLiteDiskIOException -> 0x01ac }
        r0 = 1;
        r5 = r2.getString(r0);	 Catch:{ SQLiteDiskIOException -> 0x01ac }
        r0 = 0;
        r6 = 2;
        r6 = r2.isNull(r6);	 Catch:{ SQLiteDiskIOException -> 0x01ac }
        if (r6 != 0) goto L_0x0136;
    L_0x0131:
        r0 = 2;
        r0 = r2.getLong(r0);	 Catch:{ SQLiteDiskIOException -> 0x01ac }
    L_0x0136:
        com.whatsapp.v.a(r4, r5, r0);	 Catch:{ SQLiteDiskIOException -> 0x01ac }
    L_0x0139:
        r2.close();	 Catch:{ all -> 0x01d0 }
    L_0x013c:
        monitor-exit(r3);	 Catch:{ all -> 0x01d0 }
        return;
    L_0x013e:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        goto L_0x006c;
    L_0x0144:
        r0 = move-exception;
        r13.L();	 Catch:{ all -> 0x014e }
        r1 = new java.lang.AssertionError;	 Catch:{ all -> 0x014e }
        r1.<init>(r0);	 Catch:{ all -> 0x014e }
        throw r1;	 Catch:{ all -> 0x014e }
    L_0x014e:
        r0 = move-exception;
        r7.close();	 Catch:{ all -> 0x0153 }
        throw r0;	 Catch:{ all -> 0x0153 }
    L_0x0153:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0153 }
        throw r0;
    L_0x0156:
        r0 = move-exception;
        r1 = r2;
    L_0x0158:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x01e2 }
        if (r1 == 0) goto L_0x006c;
    L_0x015d:
        r1.close();	 Catch:{ IOException -> 0x0162 }
        goto L_0x006c;
    L_0x0162:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        goto L_0x006c;
    L_0x0168:
        r0 = move-exception;
    L_0x0169:
        if (r2 == 0) goto L_0x016e;
    L_0x016b:
        r2.close();	 Catch:{ IOException -> 0x0171, ClassNotFoundException -> 0x016f }
    L_0x016e:
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
    L_0x016f:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
    L_0x0171:
        r1 = move-exception;
        com.whatsapp.util.Log.c(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        goto L_0x016e;
    L_0x0176:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0178 }
    L_0x0178:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x017a }
    L_0x017a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x017c }
    L_0x017c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x017e }
    L_0x017e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0180 }
    L_0x0180:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
    L_0x0182:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        goto L_0x00b1;
    L_0x0188:
        r0 = move-exception;
        r1 = r2;
    L_0x018a:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x01d8 }
        if (r1 == 0) goto L_0x00b1;
    L_0x018f:
        r1.close();	 Catch:{ IOException -> 0x0194 }
        goto L_0x00b1;
    L_0x0194:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        goto L_0x00b1;
    L_0x019a:
        r0 = move-exception;
    L_0x019b:
        if (r2 == 0) goto L_0x01a0;
    L_0x019d:
        r2.close();	 Catch:{ IOException -> 0x01a3, ClassNotFoundException -> 0x01a1 }
    L_0x01a0:
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
    L_0x01a1:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
    L_0x01a3:
        r1 = move-exception;
        com.whatsapp.util.Log.c(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0144 }
        goto L_0x01a0;
    L_0x01a8:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0153 }
    L_0x01aa:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x01ac }
    L_0x01ac:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01d3 }
        r1.<init>();	 Catch:{ all -> 0x01d3 }
        r4 = U;	 Catch:{ all -> 0x01d3 }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ all -> 0x01d3 }
        r1 = r1.append(r4);	 Catch:{ all -> 0x01d3 }
        r0 = r0.toString();	 Catch:{ all -> 0x01d3 }
        r0 = r1.append(r0);	 Catch:{ all -> 0x01d3 }
        r0 = r0.toString();	 Catch:{ all -> 0x01d3 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x01d3 }
        r2.close();	 Catch:{ all -> 0x01d0 }
        goto L_0x013c;
    L_0x01d0:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x01d0 }
        throw r0;
    L_0x01d3:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x01d0 }
        throw r0;	 Catch:{ all -> 0x01d0 }
    L_0x01d8:
        r0 = move-exception;
        r2 = r1;
        goto L_0x019b;
    L_0x01db:
        r0 = move-exception;
        goto L_0x018a;
    L_0x01dd:
        r0 = move-exception;
        r1 = r2;
        goto L_0x018a;
    L_0x01e0:
        r0 = move-exception;
        goto L_0x018a;
    L_0x01e2:
        r0 = move-exception;
        r2 = r1;
        goto L_0x0169;
    L_0x01e5:
        r0 = move-exception;
        goto L_0x0158;
    L_0x01e8:
        r0 = move-exception;
        r1 = r2;
        goto L_0x0158;
    L_0x01ec:
        r0 = move-exception;
        goto L_0x0158;
    L_0x01ef:
        r3 = r0;
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.I():void");
    }

    public void j() {
        try {
            Log.i(U[251]);
            if (this.r) {
                try {
                    M();
                } catch (Throwable e) {
                    Log.b(U[252], e);
                    this.i.close();
                    y();
                    M();
                }
                bd.c();
                r();
            }
            App.S = true;
        } catch (SQLiteDatabaseCorruptException e2) {
            throw e2;
        }
    }

    private Set a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        int i = m3.d;
        Collection a = a(sQLiteDatabase, str);
        try {
            if (TextUtils.equals(cs.a(a), str2)) {
                return a;
            }
            Cursor query = sQLiteDatabase.query(U[37], new String[]{U[39], U[40], U[34], U[35]}, U[38], new String[]{str}, null, null, U[36]);
            do {
                try {
                    if (!query.moveToNext()) {
                        break;
                    }
                    String string = query.getString(0);
                    int i2 = query.getInt(1);
                    CharSequence string2 = query.getString(2);
                    if (TextUtils.equals(query.getString(3), str2)) {
                        query.close();
                        return a;
                    } else if (!a(a, i2, string)) {
                        query.close();
                        return null;
                    } else if (TextUtils.equals(string2, str2) || TextUtils.equals(cs.a(a), str2)) {
                        query.close();
                        return a;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (Throwable th) {
                    query.close();
                }
            } while (i == 0);
            query.close();
            return null;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.jn a(java.lang.String r13, com.whatsapp.protocol.b r14, boolean r15, java.lang.String r16, int r17, com.whatsapp.mi r18) {
        /*
        r12_this = this;
        r6 = com.whatsapp.m3.d;
        r4 = r12.e(r14);
        r2 = 1;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x0019;
    L_0x000c:
        r2 = U;	 Catch:{ IllegalStateException -> 0x0017 }
        r3 = 474; // 0x1da float:6.64E-43 double:2.34E-321;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0017 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x0017 }
        r2 = 0;
    L_0x0016:
        return r2;
    L_0x0017:
        r2 = move-exception;
        throw r2;
    L_0x0019:
        r2 = "'";
        r3 = U;
        r7 = 458; // 0x1ca float:6.42E-43 double:2.263E-321;
        r3 = r3[r7];
        r0 = r16;
        r2 = r0.replace(r2, r3);
        r3 = "%";
        r7 = U;
        r8 = 471; // 0x1d7 float:6.6E-43 double:2.327E-321;
        r7 = r7[r8];
        r2 = r2.replace(r3, r7);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r7 = U;
        r8 = 468; // 0x1d4 float:6.56E-43 double:2.31E-321;
        r7 = r7[r8];
        r3 = r3.append(r7);
        r3 = r3.append(r2);
        r7 = U;
        r8 = 475; // 0x1db float:6.66E-43 double:2.347E-321;
        r7 = r7[r8];
        r3 = r3.append(r7);
        r7 = 0;
        r3 = r3.append(r7);
        r7 = U;
        r8 = 465; // 0x1d1 float:6.52E-43 double:2.297E-321;
        r7 = r7[r8];
        r3 = r3.append(r7);
        r3 = r3.toString();
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = U;
        r9 = 459; // 0x1cb float:6.43E-43 double:2.27E-321;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r7 = r7.append(r2);
        r8 = U;
        r9 = 446; // 0x1be float:6.25E-43 double:2.204E-321;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r8 = 5;
        r7 = r7.append(r8);
        r8 = U;
        r9 = 447; // 0x1bf float:6.26E-43 double:2.21E-321;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r7 = r7.toString();
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = U;
        r10 = 448; // 0x1c0 float:6.28E-43 double:2.213E-321;
        r9 = r9[r10];
        r8 = r8.append(r9);
        r2 = r8.append(r2);
        r8 = U;
        r9 = 454; // 0x1c6 float:6.36E-43 double:2.243E-321;
        r8 = r8[r9];
        r2 = r2.append(r8);
        r8 = 0;
        r2 = r2.append(r8);
        r8 = U;
        r9 = 455; // 0x1c7 float:6.38E-43 double:2.25E-321;
        r8 = r8[r9];
        r2 = r2.append(r8);
        r2.toString();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r8 = U;
        r9 = 461; // 0x1cd float:6.46E-43 double:2.28E-321;
        r8 = r8[r9];
        r2 = r2.append(r8);
        r2 = r2.append(r3);
        r3 = U;
        r8 = 479; // 0x1df float:6.71E-43 double:2.367E-321;
        r3 = r3[r8];
        r2 = r2.append(r3);
        r2 = r2.append(r7);
        r3 = ")";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r7 = U;
        r8 = 450; // 0x1c2 float:6.3E-43 double:2.223E-321;
        r7 = r7[r8];
        r3 = r3.append(r7);
        r2 = r3.append(r2);
        r2 = r2.toString();
        if (r15 == 0) goto L_0x0141;
    L_0x0106:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = U;
        r7 = 478; // 0x1de float:6.7E-43 double:2.36E-321;
        r3 = r3[r7];
        r2 = r2.append(r3);
        r2 = r2.append(r4);
        r3 = U;
        r7 = 453; // 0x1c5 float:6.35E-43 double:2.24E-321;
        r3 = r3[r7];
        r2 = r2.append(r3);
        r3 = U;
        r7 = 451; // 0x1c3 float:6.32E-43 double:2.23E-321;
        r3 = r3[r7];
        r2 = r2.append(r3);
        r3 = U;
        r7 = 456; // 0x1c8 float:6.39E-43 double:2.253E-321;
        r3 = r3[r7];
        r2 = r2.append(r3);
        r2 = r2.toString();
        if (r6 == 0) goto L_0x017a;
    L_0x0141:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = U;
        r7 = 464; // 0x1d0 float:6.5E-43 double:2.29E-321;
        r3 = r3[r7];
        r2 = r2.append(r3);
        r2 = r2.append(r4);
        r3 = U;
        r4 = 462; // 0x1ce float:6.47E-43 double:2.283E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = U;
        r4 = 466; // 0x1d2 float:6.53E-43 double:2.3E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = U;
        r4 = 452; // 0x1c4 float:6.33E-43 double:2.233E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x017a:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = U;
        r4 = 467; // 0x1d3 float:6.54E-43 double:2.307E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r4 = r2.toString();
        r7 = r12.i;
        monitor-enter(r7);
        r2 = -1;
        r5 = 1;
        r5 = new java.lang.String[r5];	 Catch:{ all -> 0x01e9 }
        r8 = 0;
        r5[r8] = r13;	 Catch:{ all -> 0x01e9 }
        r8 = r12.i;	 Catch:{ all -> 0x01e9 }
        r8 = r8.getReadableDatabase();	 Catch:{ all -> 0x01e9 }
        r4 = r8.rawQuery(r4, r5);	 Catch:{ all -> 0x01e9 }
        if (r4 == 0) goto L_0x01d5;
    L_0x01a8:
        r5 = r4.moveToNext();	 Catch:{ all -> 0x01ee }
        if (r5 == 0) goto L_0x01b6;
    L_0x01ae:
        r2 = 22;
        r2 = r4.getLong(r2);	 Catch:{ all -> 0x01ee }
        if (r6 == 0) goto L_0x01d0;
    L_0x01b6:
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x01ec }
        r5.<init>();	 Catch:{ IllegalStateException -> 0x01ec }
        r8 = U;	 Catch:{ IllegalStateException -> 0x01ec }
        r9 = 477; // 0x1dd float:6.68E-43 double:2.357E-321;
        r8 = r8[r9];	 Catch:{ IllegalStateException -> 0x01ec }
        r5 = r5.append(r8);	 Catch:{ IllegalStateException -> 0x01ec }
        r5 = r5.append(r13);	 Catch:{ IllegalStateException -> 0x01ec }
        r5 = r5.toString();	 Catch:{ IllegalStateException -> 0x01ec }
        com.whatsapp.util.Log.i(r5);	 Catch:{ IllegalStateException -> 0x01ec }
    L_0x01d0:
        r4.close();	 Catch:{ all -> 0x01e9 }
        if (r6 == 0) goto L_0x033b;
    L_0x01d5:
        r4 = U;	 Catch:{ IllegalStateException -> 0x01f3 }
        r5 = 470; // 0x1d6 float:6.59E-43 double:2.32E-321;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x01f3 }
        com.whatsapp.util.Log.e(r4);	 Catch:{ IllegalStateException -> 0x01f3 }
        r4 = r2;
    L_0x01df:
        r2 = 0;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x01f5;
    L_0x01e5:
        r2 = 0;
        monitor-exit(r7);	 Catch:{ all -> 0x01e9 }
        goto L_0x0016;
    L_0x01e9:
        r2 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x01e9 }
        throw r2;
    L_0x01ec:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x01ee }
    L_0x01ee:
        r2 = move-exception;
        r4.close();	 Catch:{ all -> 0x01e9 }
        throw r2;	 Catch:{ all -> 0x01e9 }
    L_0x01f3:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x01e9 }
    L_0x01f5:
        r2 = r12.b;	 Catch:{ all -> 0x01e9 }
        r2 = r2.get(r13);	 Catch:{ all -> 0x01e9 }
        r2 = (com.whatsapp.sf) r2;	 Catch:{ all -> 0x01e9 }
        if (r2 != 0) goto L_0x021d;
    L_0x01ff:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01e9 }
        r2.<init>();	 Catch:{ all -> 0x01e9 }
        r3 = U;	 Catch:{ all -> 0x01e9 }
        r4 = 463; // 0x1cf float:6.49E-43 double:2.288E-321;
        r3 = r3[r4];	 Catch:{ all -> 0x01e9 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x01e9 }
        r2 = r2.append(r13);	 Catch:{ all -> 0x01e9 }
        r2 = r2.toString();	 Catch:{ all -> 0x01e9 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ all -> 0x01e9 }
        r2 = 0;
        monitor-exit(r7);	 Catch:{ all -> 0x01e9 }
        goto L_0x0016;
    L_0x021d:
        r8 = com.whatsapp.sf.i(r2);	 Catch:{ IllegalStateException -> 0x032c }
        r10 = 1;
        r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r3 != 0) goto L_0x0230;
    L_0x0227:
        r0 = r17;
        r8 = r12.c(r13, r0);	 Catch:{ IllegalStateException -> 0x032c }
        com.whatsapp.sf.c(r2, r8);	 Catch:{ IllegalStateException -> 0x032c }
    L_0x0230:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01e9 }
        r3.<init>();	 Catch:{ all -> 0x01e9 }
        r8 = U;	 Catch:{ all -> 0x01e9 }
        r9 = 460; // 0x1cc float:6.45E-43 double:2.273E-321;
        r8 = r8[r9];	 Catch:{ all -> 0x01e9 }
        r3 = r3.append(r8);	 Catch:{ all -> 0x01e9 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x01e9 }
        r8 = U;	 Catch:{ all -> 0x01e9 }
        r9 = 457; // 0x1c9 float:6.4E-43 double:2.26E-321;
        r8 = r8[r9];	 Catch:{ all -> 0x01e9 }
        r3 = r3.append(r8);	 Catch:{ all -> 0x01e9 }
        r8 = com.whatsapp.sf.i(r2);	 Catch:{ all -> 0x01e9 }
        r8 = java.lang.Long.toString(r8);	 Catch:{ all -> 0x01e9 }
        r3 = r3.append(r8);	 Catch:{ all -> 0x01e9 }
        r3 = r3.toString();	 Catch:{ all -> 0x01e9 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ all -> 0x01e9 }
        r3 = new com.whatsapp.jn;	 Catch:{ all -> 0x01e9 }
        r3.<init>();	 Catch:{ all -> 0x01e9 }
        r8 = com.whatsapp.sf.i(r2);	 Catch:{ IllegalStateException -> 0x032e }
        r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r8 >= 0) goto L_0x027b;
    L_0x026d:
        com.whatsapp.sf.c(r2, r4);	 Catch:{ IllegalStateException -> 0x032e }
        r8 = 0;
        r0 = r17;
        r1 = r18;
        r8 = r12.a(r13, r0, r8, r1);	 Catch:{ IllegalStateException -> 0x032e }
        r3.a = r8;	 Catch:{ IllegalStateException -> 0x032e }
    L_0x027b:
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01e9 }
        r8.<init>();	 Catch:{ all -> 0x01e9 }
        r9 = U;	 Catch:{ all -> 0x01e9 }
        r10 = 476; // 0x1dc float:6.67E-43 double:2.35E-321;
        r9 = r9[r10];	 Catch:{ all -> 0x01e9 }
        r8 = r8.append(r9);	 Catch:{ all -> 0x01e9 }
        r8 = r8.append(r4);	 Catch:{ all -> 0x01e9 }
        r9 = U;	 Catch:{ all -> 0x01e9 }
        r10 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r9 = r9[r10];	 Catch:{ all -> 0x01e9 }
        r8 = r8.append(r9);	 Catch:{ all -> 0x01e9 }
        r10 = com.whatsapp.sf.i(r2);	 Catch:{ all -> 0x01e9 }
        r9 = java.lang.Long.toString(r10);	 Catch:{ all -> 0x01e9 }
        r8 = r8.append(r9);	 Catch:{ all -> 0x01e9 }
        r8 = r8.toString();	 Catch:{ all -> 0x01e9 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ all -> 0x01e9 }
        r8 = 3;
        r8 = new java.lang.String[r8];	 Catch:{ all -> 0x01e9 }
        r9 = 0;
        r8[r9] = r13;	 Catch:{ all -> 0x01e9 }
        r9 = 1;
        r10 = com.whatsapp.sf.i(r2);	 Catch:{ all -> 0x01e9 }
        r2 = java.lang.Long.toString(r10);	 Catch:{ all -> 0x01e9 }
        r8[r9] = r2;	 Catch:{ all -> 0x01e9 }
        r2 = 2;
        r4 = java.lang.Long.toString(r4);	 Catch:{ all -> 0x01e9 }
        r8[r2] = r4;	 Catch:{ all -> 0x01e9 }
        r2 = r12.i;	 Catch:{ all -> 0x01e9 }
        r2 = r2.getReadableDatabase();	 Catch:{ all -> 0x01e9 }
        r4 = U;	 Catch:{ all -> 0x01e9 }
        r5 = 449; // 0x1c1 float:6.29E-43 double:2.22E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x01e9 }
        r4 = r2.rawQuery(r4, r8);	 Catch:{ all -> 0x01e9 }
        if (r4 == 0) goto L_0x031f;
    L_0x02d5:
        r2 = r4.moveToNext();	 Catch:{ IllegalStateException -> 0x0330 }
        if (r2 == 0) goto L_0x0300;
    L_0x02db:
        r2 = 0;
        r2 = r4.getInt(r2);	 Catch:{ IllegalStateException -> 0x0330 }
        r3.b = r2;	 Catch:{ IllegalStateException -> 0x0330 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0330 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0330 }
        r5 = U;	 Catch:{ IllegalStateException -> 0x0330 }
        r8 = 469; // 0x1d5 float:6.57E-43 double:2.317E-321;
        r5 = r5[r8];	 Catch:{ IllegalStateException -> 0x0330 }
        r2 = r2.append(r5);	 Catch:{ IllegalStateException -> 0x0330 }
        r5 = r3.b;	 Catch:{ IllegalStateException -> 0x0330 }
        r2 = r2.append(r5);	 Catch:{ IllegalStateException -> 0x0330 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0330 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0330 }
        if (r6 == 0) goto L_0x031a;
    L_0x0300:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0332 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0332 }
        r5 = U;	 Catch:{ IllegalStateException -> 0x0332 }
        r8 = 473; // 0x1d9 float:6.63E-43 double:2.337E-321;
        r5 = r5[r8];	 Catch:{ IllegalStateException -> 0x0332 }
        r2 = r2.append(r5);	 Catch:{ IllegalStateException -> 0x0332 }
        r2 = r2.append(r13);	 Catch:{ IllegalStateException -> 0x0332 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0332 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0332 }
    L_0x031a:
        r4.close();	 Catch:{ all -> 0x01e9 }
        if (r6 == 0) goto L_0x0328;
    L_0x031f:
        r2 = U;	 Catch:{ IllegalStateException -> 0x0339 }
        r4 = 472; // 0x1d8 float:6.61E-43 double:2.33E-321;
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x0339 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x0339 }
    L_0x0328:
        monitor-exit(r7);	 Catch:{ all -> 0x01e9 }
        r2 = r3;
        goto L_0x0016;
    L_0x032c:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x01e9 }
    L_0x032e:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x01e9 }
    L_0x0330:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0332 }
    L_0x0332:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0334 }
    L_0x0334:
        r2 = move-exception;
        r4.close();	 Catch:{ all -> 0x01e9 }
        throw r2;	 Catch:{ all -> 0x01e9 }
    L_0x0339:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x01e9 }
    L_0x033b:
        r4 = r2;
        goto L_0x01df;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(java.lang.String, com.whatsapp.protocol.b, boolean, java.lang.String, int, com.whatsapp.mi):com.whatsapp.jn");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.b r11, java.lang.String r12, int r13, long r14) {
        /*
        r10_this = this;
        r1 = com.whatsapp.m3.d;
        r0 = r11.e;	 Catch:{ IllegalStateException -> 0x0031 }
        r0 = r0.b;	 Catch:{ IllegalStateException -> 0x0031 }
        if (r0 != 0) goto L_0x0033;
    L_0x0008:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x0031 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0031 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0031 }
        r2 = U;	 Catch:{ IllegalStateException -> 0x0031 }
        r3 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0031 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0031 }
        r2 = r11.e;	 Catch:{ IllegalStateException -> 0x0031 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0031 }
        r2 = " ";
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0031 }
        r1 = r1.append(r12);	 Catch:{ IllegalStateException -> 0x0031 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0031 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0031 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;
    L_0x0033:
        r2 = r10.i;
        monitor-enter(r2);
        r10.z();	 Catch:{ all -> 0x008f }
        r0 = 0;
        r3 = r11.e;	 Catch:{ all -> 0x008f }
        r3 = r3.c;	 Catch:{ all -> 0x008f }
        r3 = com.whatsapp.bd.b(r3);	 Catch:{ all -> 0x008f }
        if (r3 == 0) goto L_0x015a;
    L_0x0044:
        r3 = r11.e;	 Catch:{ all -> 0x008f }
        r3 = r10.c(r3);	 Catch:{ all -> 0x008f }
        r3.a(r12, r13, r14);	 Catch:{ all -> 0x008f }
        r4 = new android.content.ContentValues;	 Catch:{ all -> 0x008f }
        r5 = 1;
        r4.<init>(r5);	 Catch:{ all -> 0x008f }
        switch(r13) {
            case 5: goto L_0x0092;
            case 8: goto L_0x00b0;
            case 13: goto L_0x00a1;
            default: goto L_0x0056;
        };
    L_0x0056:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x008d }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x008d }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x008d }
        r3 = U;	 Catch:{ IllegalStateException -> 0x008d }
        r4 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x008d }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x008d }
        r1 = r1.append(r13);	 Catch:{ IllegalStateException -> 0x008d }
        r3 = U;	 Catch:{ IllegalStateException -> 0x008d }
        r4 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x008d }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x008d }
        r3 = r11.e;	 Catch:{ IllegalStateException -> 0x008d }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x008d }
        r3 = " ";
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x008d }
        r1 = r1.append(r12);	 Catch:{ IllegalStateException -> 0x008d }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x008d }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x008d }
        throw r0;	 Catch:{ IllegalStateException -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x008f }
        throw r0;
    L_0x0092:
        r5 = U;	 Catch:{ IllegalStateException -> 0x01af }
        r6 = 205; // 0xcd float:2.87E-43 double:1.013E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x01af }
        r6 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x01af }
        r4.put(r5, r6);	 Catch:{ IllegalStateException -> 0x01af }
        if (r1 == 0) goto L_0x00bf;
    L_0x00a1:
        r5 = U;	 Catch:{ IllegalStateException -> 0x01b1 }
        r6 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x01b1 }
        r6 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x01b1 }
        r4.put(r5, r6);	 Catch:{ IllegalStateException -> 0x01b1 }
        if (r1 == 0) goto L_0x00bf;
    L_0x00b0:
        r5 = U;	 Catch:{ IllegalStateException -> 0x01b3 }
        r6 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x01b3 }
        r6 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x01b3 }
        r4.put(r5, r6);	 Catch:{ IllegalStateException -> 0x01b3 }
        if (r1 != 0) goto L_0x0056;
    L_0x00bf:
        r5 = 3;
        r5 = new java.lang.String[r5];	 Catch:{ all -> 0x008f }
        r6 = 0;
        r7 = r11.e;	 Catch:{ all -> 0x008f }
        r7 = r7.c;	 Catch:{ all -> 0x008f }
        r5[r6] = r7;	 Catch:{ all -> 0x008f }
        r6 = 1;
        r7 = r11.e;	 Catch:{ all -> 0x008f }
        r7 = r7.a;	 Catch:{ all -> 0x008f }
        r5[r6] = r7;	 Catch:{ all -> 0x008f }
        r6 = 2;
        r5[r6] = r12;	 Catch:{ all -> 0x008f }
        r6 = r10.i;	 Catch:{ all -> 0x008f }
        r6 = r6.getWritableDatabase();	 Catch:{ all -> 0x008f }
        r7 = U;	 Catch:{ all -> 0x008f }
        r8 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r7 = r7[r8];	 Catch:{ all -> 0x008f }
        r8 = U;	 Catch:{ all -> 0x008f }
        r9 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r8 = r8[r9];	 Catch:{ all -> 0x008f }
        r5 = r6.update(r7, r4, r8, r5);	 Catch:{ all -> 0x008f }
        if (r5 != 0) goto L_0x014b;
    L_0x00eb:
        r5 = U;	 Catch:{ all -> 0x008f }
        r6 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r5 = r5[r6];	 Catch:{ all -> 0x008f }
        r6 = r11.e;	 Catch:{ all -> 0x008f }
        r6 = r6.c;	 Catch:{ all -> 0x008f }
        r4.put(r5, r6);	 Catch:{ all -> 0x008f }
        r5 = U;	 Catch:{ all -> 0x008f }
        r6 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        r5 = r5[r6];	 Catch:{ all -> 0x008f }
        r6 = r11.e;	 Catch:{ all -> 0x008f }
        r6 = r6.a;	 Catch:{ all -> 0x008f }
        r4.put(r5, r6);	 Catch:{ all -> 0x008f }
        r5 = U;	 Catch:{ all -> 0x008f }
        r6 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        r5 = r5[r6];	 Catch:{ all -> 0x008f }
        r4.put(r5, r12);	 Catch:{ all -> 0x008f }
        r5 = r10.i;	 Catch:{ all -> 0x008f }
        r5 = r5.getWritableDatabase();	 Catch:{ all -> 0x008f }
        r6 = U;	 Catch:{ all -> 0x008f }
        r7 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r6 = r6[r7];	 Catch:{ all -> 0x008f }
        r7 = 0;
        r4 = r5.insert(r6, r7, r4);	 Catch:{ all -> 0x008f }
        r6 = -1;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 != 0) goto L_0x014b;
    L_0x0125:
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x01b5 }
        r4.<init>();	 Catch:{ IllegalStateException -> 0x01b5 }
        r5 = U;	 Catch:{ IllegalStateException -> 0x01b5 }
        r6 = 213; // 0xd5 float:2.98E-43 double:1.05E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x01b5 }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x01b5 }
        r5 = r11.e;	 Catch:{ IllegalStateException -> 0x01b5 }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x01b5 }
        r5 = " ";
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x01b5 }
        r4 = r4.append(r12);	 Catch:{ IllegalStateException -> 0x01b5 }
        r4 = r4.toString();	 Catch:{ IllegalStateException -> 0x01b5 }
        com.whatsapp.util.Log.e(r4);	 Catch:{ IllegalStateException -> 0x01b5 }
    L_0x014b:
        r4 = r11.y;	 Catch:{ all -> 0x008f }
        r3 = r3.a(r4);	 Catch:{ all -> 0x008f }
        r4 = r11.a;	 Catch:{ all -> 0x008f }
        if (r3 == r4) goto L_0x0158;
    L_0x0155:
        r11.a = r3;	 Catch:{ all -> 0x008f }
        r0 = 1;
    L_0x0158:
        if (r1 == 0) goto L_0x026c;
    L_0x015a:
        r3 = r11.e;	 Catch:{ IllegalStateException -> 0x01b7 }
        r3 = r3.c;	 Catch:{ IllegalStateException -> 0x01b7 }
        r3 = com.whatsapp.m8.d(r3);	 Catch:{ IllegalStateException -> 0x01b7 }
        if (r3 == 0) goto L_0x026b;
    L_0x0164:
        r3 = r11.e;	 Catch:{ all -> 0x008f }
        r3 = r10.c(r3);	 Catch:{ all -> 0x008f }
        r3.a(r12, r13, r14);	 Catch:{ all -> 0x008f }
        r3 = new android.content.ContentValues;	 Catch:{ all -> 0x008f }
        r4 = 2;
        r3.<init>(r4);	 Catch:{ all -> 0x008f }
        switch(r13) {
            case 5: goto L_0x01b9;
            case 8: goto L_0x01d7;
            case 13: goto L_0x01c8;
            default: goto L_0x0176;
        };
    L_0x0176:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x01ad }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x01ad }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x01ad }
        r3 = U;	 Catch:{ IllegalStateException -> 0x01ad }
        r4 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x01ad }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x01ad }
        r1 = r1.append(r13);	 Catch:{ IllegalStateException -> 0x01ad }
        r3 = U;	 Catch:{ IllegalStateException -> 0x01ad }
        r4 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x01ad }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x01ad }
        r3 = r11.e;	 Catch:{ IllegalStateException -> 0x01ad }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x01ad }
        r3 = " ";
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x01ad }
        r1 = r1.append(r12);	 Catch:{ IllegalStateException -> 0x01ad }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x01ad }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x01ad }
        throw r0;	 Catch:{ IllegalStateException -> 0x01ad }
    L_0x01ad:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008f }
    L_0x01af:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01b1 }
    L_0x01b1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01b3 }
    L_0x01b3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008d }
    L_0x01b5:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008f }
    L_0x01b7:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008f }
    L_0x01b9:
        r4 = U;	 Catch:{ IllegalStateException -> 0x02b7 }
        r5 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x02b7 }
        r5 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x02b7 }
        r3.put(r4, r5);	 Catch:{ IllegalStateException -> 0x02b7 }
        if (r1 == 0) goto L_0x01e6;
    L_0x01c8:
        r4 = U;	 Catch:{ IllegalStateException -> 0x02b9 }
        r5 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x02b9 }
        r5 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x02b9 }
        r3.put(r4, r5);	 Catch:{ IllegalStateException -> 0x02b9 }
        if (r1 == 0) goto L_0x01e6;
    L_0x01d7:
        r4 = U;	 Catch:{ IllegalStateException -> 0x02bb }
        r5 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x02bb }
        r5 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x02bb }
        r3.put(r4, r5);	 Catch:{ IllegalStateException -> 0x02bb }
        if (r1 != 0) goto L_0x0176;
    L_0x01e6:
        r4 = U;	 Catch:{ all -> 0x008f }
        r5 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x008f }
        r5 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x008f }
        r3.put(r4, r5);	 Catch:{ all -> 0x008f }
        r4 = 3;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x008f }
        r5 = 0;
        r4[r5] = r12;	 Catch:{ all -> 0x008f }
        r5 = 1;
        r6 = 1;
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x008f }
        r4[r5] = r6;	 Catch:{ all -> 0x008f }
        r5 = 2;
        r6 = r11.e;	 Catch:{ all -> 0x008f }
        r6 = r6.a;	 Catch:{ all -> 0x008f }
        r4[r5] = r6;	 Catch:{ all -> 0x008f }
        r5 = r10.i;	 Catch:{ all -> 0x008f }
        r5 = r5.getWritableDatabase();	 Catch:{ all -> 0x008f }
        r6 = U;	 Catch:{ all -> 0x008f }
        r7 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;
        r6 = r6[r7];	 Catch:{ all -> 0x008f }
        r7 = U;	 Catch:{ all -> 0x008f }
        r8 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        r7 = r7[r8];	 Catch:{ all -> 0x008f }
        r3 = r5.update(r6, r3, r7, r4);	 Catch:{ all -> 0x008f }
        r4 = 1;
        if (r3 == r4) goto L_0x0247;
    L_0x0221:
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x02bd }
        r3.<init>();	 Catch:{ IllegalStateException -> 0x02bd }
        r4 = U;	 Catch:{ IllegalStateException -> 0x02bd }
        r5 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x02bd }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x02bd }
        r4 = r11.e;	 Catch:{ IllegalStateException -> 0x02bd }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x02bd }
        r4 = " ";
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x02bd }
        r3 = r3.append(r12);	 Catch:{ IllegalStateException -> 0x02bd }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x02bd }
        com.whatsapp.util.Log.e(r3);	 Catch:{ IllegalStateException -> 0x02bd }
    L_0x0247:
        r3 = r10.d;	 Catch:{ all -> 0x008f }
        r4 = new com.whatsapp.protocol.m;	 Catch:{ all -> 0x008f }
        r5 = 1;
        r6 = r11.e;	 Catch:{ all -> 0x008f }
        r6 = r6.a;	 Catch:{ all -> 0x008f }
        r4.<init>(r12, r5, r6);	 Catch:{ all -> 0x008f }
        r3.remove(r4);	 Catch:{ all -> 0x008f }
        r3 = r11.e;	 Catch:{ all -> 0x008f }
        r3 = r10.c(r3);	 Catch:{ all -> 0x008f }
        r4 = r11.y;	 Catch:{ all -> 0x008f }
        r3 = r3.a(r4);	 Catch:{ all -> 0x008f }
        r4 = r11.a;	 Catch:{ all -> 0x008f }
        if (r3 == r4) goto L_0x0269;
    L_0x0266:
        r11.a = r3;	 Catch:{ all -> 0x008f }
        r0 = 1;
    L_0x0269:
        if (r1 == 0) goto L_0x026c;
    L_0x026b:
        r0 = 1;
    L_0x026c:
        if (r0 == 0) goto L_0x0378;
    L_0x026e:
        r0 = r10.d;	 Catch:{ all -> 0x008f }
        r3 = r11.e;	 Catch:{ all -> 0x008f }
        r0.remove(r3);	 Catch:{ all -> 0x008f }
        r0 = new android.content.ContentValues;	 Catch:{ all -> 0x008f }
        r3 = 2;
        r0.<init>(r3);	 Catch:{ all -> 0x008f }
        switch(r13) {
            case 5: goto L_0x02bf;
            case 8: goto L_0x02dd;
            case 13: goto L_0x02ce;
            default: goto L_0x027e;
        };
    L_0x027e:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x02b5 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x02b5 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x02b5 }
        r3 = U;	 Catch:{ IllegalStateException -> 0x02b5 }
        r4 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x02b5 }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x02b5 }
        r1 = r1.append(r13);	 Catch:{ IllegalStateException -> 0x02b5 }
        r3 = U;	 Catch:{ IllegalStateException -> 0x02b5 }
        r4 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x02b5 }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x02b5 }
        r3 = r11.e;	 Catch:{ IllegalStateException -> 0x02b5 }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x02b5 }
        r3 = " ";
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x02b5 }
        r1 = r1.append(r12);	 Catch:{ IllegalStateException -> 0x02b5 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x02b5 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x02b5 }
        throw r0;	 Catch:{ IllegalStateException -> 0x02b5 }
    L_0x02b5:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008f }
    L_0x02b7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02b9 }
    L_0x02b9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02bb }
    L_0x02bb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01ad }
    L_0x02bd:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008f }
    L_0x02bf:
        r3 = U;	 Catch:{ IllegalStateException -> 0x0387 }
        r4 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0387 }
        r4 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x0387 }
        r0.put(r3, r4);	 Catch:{ IllegalStateException -> 0x0387 }
        if (r1 == 0) goto L_0x02ec;
    L_0x02ce:
        r3 = U;	 Catch:{ IllegalStateException -> 0x0389 }
        r4 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0389 }
        r4 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x0389 }
        r0.put(r3, r4);	 Catch:{ IllegalStateException -> 0x0389 }
        if (r1 == 0) goto L_0x02ec;
    L_0x02dd:
        r3 = U;	 Catch:{ IllegalStateException -> 0x038b }
        r4 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x038b }
        r4 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x038b }
        r0.put(r3, r4);	 Catch:{ IllegalStateException -> 0x038b }
        if (r1 != 0) goto L_0x027e;
    L_0x02ec:
        r3 = U;	 Catch:{ all -> 0x008f }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r3 = r3[r4];	 Catch:{ all -> 0x008f }
        r4 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x008f }
        r0.put(r3, r4);	 Catch:{ all -> 0x008f }
        r3 = 3;
        r3 = new java.lang.String[r3];	 Catch:{ all -> 0x008f }
        r4 = 0;
        r5 = r11.e;	 Catch:{ all -> 0x008f }
        r5 = r5.c;	 Catch:{ all -> 0x008f }
        r3[r4] = r5;	 Catch:{ all -> 0x008f }
        r4 = 1;
        r5 = 1;
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x008f }
        r3[r4] = r5;	 Catch:{ all -> 0x008f }
        r4 = 2;
        r5 = r11.e;	 Catch:{ all -> 0x008f }
        r5 = r5.a;	 Catch:{ all -> 0x008f }
        r3[r4] = r5;	 Catch:{ all -> 0x008f }
        r4 = r10.i;	 Catch:{ all -> 0x008f }
        r4 = r4.getWritableDatabase();	 Catch:{ all -> 0x008f }
        r5 = U;	 Catch:{ all -> 0x008f }
        r6 = 207; // 0xcf float:2.9E-43 double:1.023E-321;
        r5 = r5[r6];	 Catch:{ all -> 0x008f }
        r6 = U;	 Catch:{ all -> 0x008f }
        r7 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r6 = r6[r7];	 Catch:{ all -> 0x008f }
        r0 = r4.update(r5, r0, r6, r3);	 Catch:{ all -> 0x008f }
        r3 = 1;
        if (r0 == r3) goto L_0x0351;
    L_0x032b:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x038d }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x038d }
        r3 = U;	 Catch:{ IllegalStateException -> 0x038d }
        r4 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x038d }
        r0 = r0.append(r3);	 Catch:{ IllegalStateException -> 0x038d }
        r3 = r11.e;	 Catch:{ IllegalStateException -> 0x038d }
        r0 = r0.append(r3);	 Catch:{ IllegalStateException -> 0x038d }
        r3 = " ";
        r0 = r0.append(r3);	 Catch:{ IllegalStateException -> 0x038d }
        r0 = r0.append(r12);	 Catch:{ IllegalStateException -> 0x038d }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x038d }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x038d }
    L_0x0351:
        r0 = r11.e;	 Catch:{ IllegalStateException -> 0x038f }
        r0 = r0.c;	 Catch:{ IllegalStateException -> 0x038f }
        r0 = com.whatsapp.m8.d(r0);	 Catch:{ IllegalStateException -> 0x038f }
        if (r0 != 0) goto L_0x0365;
    L_0x035b:
        r0 = r11.e;	 Catch:{ IllegalStateException -> 0x038f }
        r0 = r0.c;	 Catch:{ IllegalStateException -> 0x038f }
        r0 = com.whatsapp.bd.b(r0);	 Catch:{ IllegalStateException -> 0x038f }
        if (r0 == 0) goto L_0x036a;
    L_0x0365:
        r0 = r11.e;	 Catch:{ IllegalStateException -> 0x0391 }
        com.whatsapp.App.a(r0, r13);	 Catch:{ IllegalStateException -> 0x0391 }
    L_0x036a:
        r0 = r10.w;	 Catch:{ IllegalStateException -> 0x0393 }
        r3 = 2;
        r4 = -1;
        r5 = 0;
        r0 = android.os.Message.obtain(r0, r3, r4, r5, r11);	 Catch:{ IllegalStateException -> 0x0393 }
        r0.sendToTarget();	 Catch:{ IllegalStateException -> 0x0393 }
        if (r1 == 0) goto L_0x0385;
    L_0x0378:
        r0 = r10.w;	 Catch:{ IllegalStateException -> 0x0393 }
        r1 = 11;
        r3 = -1;
        r4 = 0;
        r0 = android.os.Message.obtain(r0, r1, r3, r4, r11);	 Catch:{ IllegalStateException -> 0x0393 }
        r0.sendToTarget();	 Catch:{ IllegalStateException -> 0x0393 }
    L_0x0385:
        monitor-exit(r2);	 Catch:{ all -> 0x008f }
        return;
    L_0x0387:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0389 }
    L_0x0389:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x038b }
    L_0x038b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02b5 }
    L_0x038d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008f }
    L_0x038f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0391 }
    L_0x0391:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008f }
    L_0x0393:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008f }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(com.whatsapp.protocol.b, java.lang.String, int, long):void");
    }

    public int a(java.lang.Runnable r10) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
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
        r9_this = this;
        r8 = -1;
        r7 = 1;
        r6 = 0;
        r1 = com.whatsapp.m3.d;
        r0 = r9.H;
        r2 = 7;
        r3 = new java.lang.String[r7];
        r4 = U;
        r5 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r4 = r4[r5];
        r3[r6] = r4;
        r2 = com.whatsapp.util.at.a(r0, r2, r3);
        r0 = r9.H;
        r3 = new java.lang.String[r7];
        r4 = U;
        r5 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r4 = r4[r5];
        r3[r6] = r4;
        r0 = com.whatsapp.util.at.a(r0, r8, r3);
        r2.addAll(r0);
        r0 = r9.H;
        r3 = new java.lang.String[r7];
        r4 = U;
        r5 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r4 = r4[r5];
        r3[r6] = r4;
        r0 = com.whatsapp.util.at.a(r0, r8, r3);
        r2.addAll(r0);
        r3 = new java.util.HashSet;
        r3.<init>();
        r4 = r2.iterator();
    L_0x0045:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0086;
    L_0x004b:
        r0 = r4.next();
        r0 = (java.io.File) r0;
        r5 = com.whatsapp.a54.a(r0);
        if (r5 == 0) goto L_0x007b;
    L_0x0057:
        r0 = r0.getName();
        r6 = U;
        r7 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r6 = r6[r7];
        r0 = r0.endsWith(r6);
        r6 = r5.b;
        r7 = r5.a;
        r0 = com.whatsapp.a54.a(r6, r7, r0);
        r6 = new com.whatsapp.l9;
        r7 = r5.c;
        r5 = r5.d;
        r6.<init>(r7, r5, r0);
        r3.add(r6);	 Catch:{ IllegalStateException -> 0x00e8 }
        if (r1 == 0) goto L_0x0084;	 Catch:{ IllegalStateException -> 0x00e8 }
    L_0x007b:
        r0 = U;	 Catch:{ IllegalStateException -> 0x00e8 }
        r5 = 116; // 0x74 float:1.63E-43 double:5.73E-322;	 Catch:{ IllegalStateException -> 0x00e8 }
        r0 = r0[r5];	 Catch:{ IllegalStateException -> 0x00e8 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x00e8 }
    L_0x0084:
        if (r1 == 0) goto L_0x0045;
    L_0x0086:
        r4 = r3.size();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = U;
        r6 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r5 = r5[r6];
        r0 = r0.append(r5);
        r0 = r0.append(r4);
        r5 = U;
        r6 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r5 = r5[r6];
        r0 = r0.append(r5);
        r2 = r2.size();
        r0 = r0.append(r2);
        r2 = ")";
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r9.R;
        r0.clear();
        r2 = r3.iterator();
    L_0x00c5:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00e7;
    L_0x00cb:
        r0 = r2.next();
        r0 = (com.whatsapp.l9) r0;
        r3 = com.whatsapp.l9.b(r0);
        r5 = com.whatsapp.l9.a(r0);
        r0 = com.whatsapp.l9.c(r0);
        r6 = new com.whatsapp.a3m;
        r6.<init>(r9, r4, r10);
        com.whatsapp.App.a(r3, r5, r0, r6);
        if (r1 == 0) goto L_0x00c5;
    L_0x00e7:
        return r4;
    L_0x00e8:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(java.lang.Runnable):int");
    }

    private Set a(SQLiteDatabase sQLiteDatabase, String str) {
        int i = m3.d;
        Set hashSet = new HashSet();
        Cursor query = sQLiteDatabase.query(U[229], new String[]{U[227]}, U[228], new String[]{str}, null, null, null);
        do {
            try {
                if (!query.moveToNext()) {
                    break;
                }
                CharSequence string = query.getString(0);
                try {
                    if (TextUtils.isEmpty(string)) {
                        hashSet.add(App.P.d().e);
                        if (i == 0) {
                            continue;
                        }
                    }
                    hashSet.add(string);
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                query.close();
            }
        } while (i == 0);
        query.close();
        return hashSet;
    }

    public boolean s() {
        Log.i(U[123]);
        synchronized (this.i) {
            this.i.getWritableDatabase();
            z();
            this.r = true;
        }
        return true;
    }

    public Set e(String str, String str2) {
        Set a;
        synchronized (this.i) {
            a = a(this.i.getWritableDatabase(), str, str2);
        }
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(java.io.File r5) {
        /*
        r4_this = this;
        r0 = r5.exists();	 Catch:{ IllegalStateException -> 0x006f }
        if (r0 == 0) goto L_0x006e;
    L_0x0006:
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x0071 }
        r2 = r5.lastModified();	 Catch:{ IllegalStateException -> 0x0071 }
        r0 = r0 - r2;
        r2 = 604800000; // 0x240c8400 float:3.046947E-17 double:2.988109026E-315;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 < 0) goto L_0x0069;
    L_0x0016:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0073 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0073 }
        r1 = U;	 Catch:{ IllegalStateException -> 0x0073 }
        r2 = 366; // 0x16e float:5.13E-43 double:1.81E-321;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0073 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0073 }
        r1 = new java.util.Date;	 Catch:{ IllegalStateException -> 0x0073 }
        r2 = r5.lastModified();	 Catch:{ IllegalStateException -> 0x0073 }
        r1.<init>(r2);	 Catch:{ IllegalStateException -> 0x0073 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0073 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0073 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0073 }
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0073 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0073 }
        r1 = U;	 Catch:{ IllegalStateException -> 0x0073 }
        r2 = 365; // 0x16d float:5.11E-43 double:1.803E-321;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0073 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0073 }
        r1 = r5.getName();	 Catch:{ IllegalStateException -> 0x0073 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0073 }
        r1 = " ";
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0073 }
        r1 = r5.delete();	 Catch:{ IllegalStateException -> 0x0073 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0073 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0073 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0073 }
        r0 = com.whatsapp.m3.d;	 Catch:{ IllegalStateException -> 0x0073 }
        if (r0 == 0) goto L_0x006e;
    L_0x0069:
        r0 = "";
        com.whatsapp.util.at.a(r5, r0);	 Catch:{ IllegalStateException -> 0x0073 }
    L_0x006e:
        return;
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.g(java.io.File):void");
    }

    public void b(fc fcVar) {
        this.D.registerObserver(fcVar);
    }

    private b j(String str) {
        b bVar = null;
        String[] strArr = new String[]{str};
        synchronized (this.i) {
            Cursor rawQuery;
            try {
                rawQuery = this.i.getReadableDatabase().rawQuery(U[125], strArr);
                if (rawQuery != null) {
                    if (rawQuery.moveToNext()) {
                        bVar = a(rawQuery, str);
                    } else {
                        Log.w(U[126] + str);
                    }
                    rawQuery.close();
                } else {
                    Log.e(U[124]);
                }
            } catch (Throwable th) {
            }
        }
        return bVar;
    }

    private boolean a(String str) {
        a(str, false);
        String[] strArr = new String[]{str};
        SQLiteDatabase sQLiteDatabase = null;
        synchronized (this.i) {
            try {
                sQLiteDatabase = this.i.getWritableDatabase();
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL(U[178], strArr);
                sQLiteDatabase.execSQL(U[177], strArr);
                sQLiteDatabase.execSQL(U[175], strArr);
                this.b.remove(str);
                sQLiteDatabase.delete(U[179], U[176], strArr);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
            } catch (Throwable th) {
            }
        }
        return true;
    }

    public l8 x(String str) {
        Log.i(U[112] + str);
        l8 l8Var = new l8();
        try {
            if (str != null) {
                if (!"".equals(str)) {
                    String[] strArr = new String[]{str};
                    String str2 = U[113];
                    synchronized (this.i) {
                        Cursor rawQuery;
                        try {
                            rawQuery = this.i.getReadableDatabase().rawQuery(str2, strArr);
                            if (rawQuery != null) {
                                try {
                                    if (rawQuery.moveToNext()) {
                                        String string = rawQuery.getString(0);
                                        Long l = null;
                                        if (!rawQuery.isNull(1)) {
                                            l = Long.valueOf(rawQuery.getLong(1));
                                        }
                                        l8Var.b = string;
                                        l8Var.a = l;
                                    }
                                } catch (SQLiteDiskIOException e) {
                                    throw e;
                                } catch (SQLiteDiskIOException e2) {
                                    Log.e(U[111] + e2.toString());
                                    if (rawQuery != null) {
                                        rawQuery.close();
                                    }
                                }
                            }
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                        } catch (SQLiteDiskIOException e3) {
                            throw e3;
                        } catch (SQLiteDiskIOException e32) {
                            throw e32;
                        } catch (Throwable th) {
                        }
                    }
                    return l8Var;
                }
            }
            Log.e(U[110] + str);
            return l8Var;
        } catch (SQLiteDiskIOException e322) {
            throw e322;
        } catch (SQLiteDiskIOException e3222) {
            throw e3222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList H() {
        /*
        r8_this = this;
        r0 = com.whatsapp.m3.d;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = r8.i;
        r2 = r2.getReadableDatabase();
        r3 = U;
        r4 = 308; // 0x134 float:4.32E-43 double:1.52E-321;
        r3 = r3[r4];
        r4 = 0;
        r2 = r2.rawQuery(r3, r4);
        if (r2 == 0) goto L_0x0071;
    L_0x001a:
        r3 = U;
        r4 = 310; // 0x136 float:4.34E-43 double:1.53E-321;
        r3 = r3[r4];
        r3 = r2.getColumnIndex(r3);
    L_0x0024:
        r4 = r2.moveToNext();	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        if (r4 == 0) goto L_0x006e;
    L_0x002a:
        r4 = r2.getString(r3);	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        if (r4 != 0) goto L_0x003b;
    L_0x0030:
        r5 = U;	 Catch:{ IllegalStateException -> 0x0090, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        r6 = 306; // 0x132 float:4.29E-43 double:1.51E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x0090, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        com.whatsapp.util.Log.w(r5);	 Catch:{ IllegalStateException -> 0x0090, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        if (r0 == 0) goto L_0x0024;
    L_0x003b:
        r4 = r8.a(r2, r4);	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        r5.<init>();	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        r6 = U;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        r7 = 311; // 0x137 float:4.36E-43 double:1.537E-321;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        r5 = r5.append(r6);	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        r6 = r4.e;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        r6 = r6.a;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        r5 = r5.append(r6);	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        r6 = " ";
        r5 = r5.append(r6);	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        r6 = r4.j;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        r5 = r5.append(r6);	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        r5 = r5.toString();	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        com.whatsapp.util.Log.i(r5);	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        r1.add(r4);	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
        if (r0 == 0) goto L_0x0024;
    L_0x006e:
        r2.close();
    L_0x0071:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = U;
        r3 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r1.size();
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return r1;
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0092, SQLiteDatabaseCorruptException -> 0x00b5, SQLiteFullException -> 0x00c4 }
    L_0x0092:
        r0 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00bf }
        r3.<init>();	 Catch:{ all -> 0x00bf }
        r4 = U;	 Catch:{ all -> 0x00bf }
        r5 = 309; // 0x135 float:4.33E-43 double:1.527E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x00bf }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00bf }
        r0 = r0.toString();	 Catch:{ all -> 0x00bf }
        r0 = r3.append(r0);	 Catch:{ all -> 0x00bf }
        r0 = r0.toString();	 Catch:{ all -> 0x00bf }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x00bf }
        r2.close();
        goto L_0x0071;
    L_0x00b5:
        r0 = move-exception;
        r8.L();	 Catch:{ all -> 0x00bf }
        r1 = new java.lang.AssertionError;	 Catch:{ all -> 0x00bf }
        r1.<init>(r0);	 Catch:{ all -> 0x00bf }
        throw r1;	 Catch:{ all -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        r2.close();
        throw r0;
    L_0x00c4:
        r0 = move-exception;
        r1 = com.whatsapp.App.p;	 Catch:{ all -> 0x00bf }
        com.whatsapp.util.aq.a(r1);	 Catch:{ all -> 0x00bf }
        throw r0;	 Catch:{ all -> 0x00bf }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.H():java.util.ArrayList");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A(java.lang.String r10) {
        /*
        r9_this = this;
        r1 = 0;
        r2 = 0;
        r8 = 1;
        r9.a(r10, r2);
        r0 = new java.lang.Object[r8];
        r0[r2] = r10;
        r2 = r9.i;
        monitor-enter(r2);
        r3 = r9.i;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r1 = r3.getWritableDatabase();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r1.beginTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r3 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = 374; // 0x176 float:5.24E-43 double:1.85E-321;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r1.execSQL(r3, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r3 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = 383; // 0x17f float:5.37E-43 double:1.89E-321;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r1.execSQL(r3, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r0 = new android.content.ContentValues;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r3 = 2;
        r0.<init>(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r3 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = 375; // 0x177 float:5.25E-43 double:1.853E-321;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = 1;
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r0.put(r3, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r3 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = 379; // 0x17b float:5.31E-43 double:1.873E-321;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = 1;
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r0.put(r3, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r3 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = 373; // 0x175 float:5.23E-43 double:1.843E-321;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = 1;
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r0.put(r3, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r3 = c();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r5 = 380; // 0x17c float:5.32E-43 double:1.877E-321;
        r4 = r4[r5];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r5 = java.lang.Integer.valueOf(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r0.put(r4, r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r5 = 0;
        r4[r5] = r10;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r5 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r6 = 376; // 0x178 float:5.27E-43 double:1.86E-321;
        r5 = r5[r6];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r6 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r7 = 382; // 0x17e float:5.35E-43 double:1.887E-321;
        r6 = r6[r7];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = r1.update(r5, r0, r6, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        if (r4 != 0) goto L_0x00b5;
    L_0x0081:
        r4 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r5 = 377; // 0x179 float:5.28E-43 double:1.863E-321;
        r4 = r4[r5];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r0.put(r4, r10);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r5 = 381; // 0x17d float:5.34E-43 double:1.88E-321;
        r4 = r4[r5];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r5 = 0;
        r4 = r1.insert(r4, r5, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r6 = -1;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 != 0) goto L_0x00b5;
    L_0x009b:
        r0 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00f9, RuntimeException -> 0x011c, Error -> 0x0125 }
        r0.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00f9, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00f9, RuntimeException -> 0x011c, Error -> 0x0125 }
        r5 = 378; // 0x17a float:5.3E-43 double:1.87E-321;
        r4 = r4[r5];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00f9, RuntimeException -> 0x011c, Error -> 0x0125 }
        r0 = r0.append(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00f9, RuntimeException -> 0x011c, Error -> 0x0125 }
        r0 = r0.append(r10);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00f9, RuntimeException -> 0x011c, Error -> 0x0125 }
        r0 = r0.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00f9, RuntimeException -> 0x011c, Error -> 0x0125 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00f9, RuntimeException -> 0x011c, Error -> 0x0125 }
    L_0x00b5:
        r0 = r9.b;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r0 = r0.get(r10);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r0 = (com.whatsapp.sf) r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        if (r0 != 0) goto L_0x00c9;
    L_0x00bf:
        r0 = new com.whatsapp.sf;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r0.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = r9.b;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4.put(r10, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
    L_0x00c9:
        r4 = 1;
        com.whatsapp.sf.d(r0, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = 0;
        com.whatsapp.sf.a(r0, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = 1;
        com.whatsapp.sf.a(r0, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = 1;
        com.whatsapp.sf.e(r0, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = 1;
        com.whatsapp.sf.c(r0, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r4 = 1;
        com.whatsapp.sf.f(r0, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        com.whatsapp.sf.a(r0, r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        r1.setTransactionSuccessful();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
        if (r1 == 0) goto L_0x00f7;
    L_0x00ee:
        r0 = r1.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0118 }
        if (r0 == 0) goto L_0x00f7;
    L_0x00f4:
        r1.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a }
    L_0x00f7:
        monitor-exit(r2);	 Catch:{ all -> 0x0115 }
        return r8;
    L_0x00f9:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00fb, RuntimeException -> 0x011c, Error -> 0x0125 }
    L_0x00fb:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0108 }
        r9.L();	 Catch:{ all -> 0x0108 }
        r3 = new java.lang.AssertionError;	 Catch:{ all -> 0x0108 }
        r3.<init>(r0);	 Catch:{ all -> 0x0108 }
        throw r3;	 Catch:{ all -> 0x0108 }
    L_0x0108:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0114;
    L_0x010b:
        r3 = r1.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0121 }
        if (r3 == 0) goto L_0x0114;
    L_0x0111:
        r1.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0123 }
    L_0x0114:
        throw r0;	 Catch:{ all -> 0x0115 }
    L_0x0115:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0115 }
        throw r0;
    L_0x0118:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a }
    L_0x011a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0115 }
    L_0x011c:
        r0 = move-exception;
    L_0x011d:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0108 }
        throw r0;	 Catch:{ all -> 0x0108 }
    L_0x0121:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0123 }
    L_0x0123:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0115 }
    L_0x0125:
        r0 = move-exception;
        goto L_0x011d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.A(java.lang.String):boolean");
    }

    public b d(String str) {
        ArrayList a = a(str, 1);
        try {
            return a.isEmpty() ? null : (b) a.get(0);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList c(java.lang.String r31, boolean r32) {
        /*
        r30_this = this;
        r18 = com.whatsapp.m3.d;
        if (r31 == 0) goto L_0x000e;
    L_0x0004:
        r4 = "";
        r0 = r31;
        r4 = r0.equals(r4);	 Catch:{ IOException -> 0x0016 }
        if (r4 == 0) goto L_0x0018;
    L_0x000e:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x0014 }
        r4.<init>();	 Catch:{ IOException -> 0x0014 }
        throw r4;	 Catch:{ IOException -> 0x0014 }
    L_0x0014:
        r4 = move-exception;
        throw r4;
    L_0x0016:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0014 }
    L_0x0018:
        r19 = new com.whatsapp.util.y;
        r19.<init>();
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = U;
        r6 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r31;
        r4 = r4.append(r0);
        r4 = r4.toString();
        r0 = r19;
        r0.a(r4);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = com.whatsapp.App.p;
        r6 = 2131624263; // 0x7f0e0147 float:1.88757E38 double:1.053162318E-314;
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r9 = com.whatsapp.App.P;
        r0 = r31;
        r9 = r9.a(r0);
        r10 = com.whatsapp.App.p;
        r9 = r9.a(r10);
        r7[r8] = r9;
        r5 = r5.getString(r6, r7);
        r6 = U;
        r7 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r6 = r6[r7];
        r7 = "";
        r5 = r5.replaceAll(r6, r7);
        r4 = r4.append(r5);
        r5 = U;
        r6 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = r4.toString();
        r4 = com.whatsapp.App.t(r5);
        r4.createNewFile();	 Catch:{ IOException -> 0x02f8 }
        r17 = r4;
    L_0x0084:
        r4 = r17.exists();	 Catch:{ IOException -> 0x0305 }
        if (r4 == 0) goto L_0x008d;
    L_0x008a:
        r17.delete();	 Catch:{ IOException -> 0x0305 }
    L_0x008d:
        r5 = 0;
        r6 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0307, Exception -> 0x0313 }
        r0 = r17;
        r6.<init>(r0);	 Catch:{ FileNotFoundException -> 0x0307, Exception -> 0x0313 }
        r4 = new java.io.OutputStreamWriter;	 Catch:{ FileNotFoundException -> 0x0307, Exception -> 0x0313 }
        r7 = U;	 Catch:{ FileNotFoundException -> 0x0307, Exception -> 0x0313 }
        r8 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r7 = r7[r8];	 Catch:{ FileNotFoundException -> 0x0307, Exception -> 0x0313 }
        r4.<init>(r6, r7);	 Catch:{ FileNotFoundException -> 0x0307, Exception -> 0x0313 }
        r5 = r4;
    L_0x00a1:
        r20 = com.whatsapp.bd.b(r31);
        r8 = new java.util.ArrayList;
        r8.<init>();
        r9 = 0;
        r12 = 0;
        if (r32 == 0) goto L_0x0319;
    L_0x00af:
        r4 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r6 = r4;
    L_0x00b2:
        r0 = r30;
        r0 = r0.i;
        r21 = r0;
        monitor-enter(r21);
        r10 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r0 = r30;
        r4 = r0.i;	 Catch:{ all -> 0x0321 }
        r4 = r4.getReadableDatabase();	 Catch:{ all -> 0x0321 }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0321 }
        r7.<init>();	 Catch:{ all -> 0x0321 }
        r14 = U;	 Catch:{ all -> 0x0321 }
        r15 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r14 = r14[r15];	 Catch:{ all -> 0x0321 }
        r7 = r7.append(r14);	 Catch:{ all -> 0x0321 }
        r7 = r7.append(r6);	 Catch:{ all -> 0x0321 }
        r7 = r7.toString();	 Catch:{ all -> 0x0321 }
        r14 = 1;
        r14 = new java.lang.String[r14];	 Catch:{ all -> 0x0321 }
        r15 = 0;
        r14[r15] = r31;	 Catch:{ all -> 0x0321 }
        r22 = r4.rawQuery(r7, r14);	 Catch:{ all -> 0x0321 }
        if (r22 == 0) goto L_0x05ac;
    L_0x00e9:
        r4 = r22.moveToNext();	 Catch:{ IOException -> 0x031f }
        if (r4 == 0) goto L_0x05a9;
    L_0x00ef:
        r4 = 0;
        r14 = 0;
    L_0x00f2:
        r0 = r30;
        r1 = r22;
        r2 = r31;
        r23 = r0.a(r1, r2);	 Catch:{ SQLiteException -> 0x033a }
        if (r23 != 0) goto L_0x0100;
    L_0x00fe:
        if (r18 == 0) goto L_0x0151;
    L_0x0100:
        r16 = r4 + 1;
        r24 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r14 = r14 + r24;
        r7 = 0;
        r0 = r23;
        r4 = r0.j;	 Catch:{ IOException -> 0x0336 }
        switch(r4) {
            case 1: goto L_0x0324;
            case 2: goto L_0x0324;
            case 3: goto L_0x0324;
            case 4: goto L_0x035f;
            default: goto L_0x010e;
        };
    L_0x010e:
        r4 = r23.e();	 Catch:{ SQLiteException -> 0x033a }
        if (r4 == 0) goto L_0x011e;
    L_0x0114:
        r4 = r23.c();	 Catch:{ SQLiteException -> 0x033a }
        r4 = r4.length;	 Catch:{ SQLiteException -> 0x033a }
        r0 = (long) r4;
        r24 = r0;
        r14 = r14 + r24;
    L_0x011e:
        if (r7 == 0) goto L_0x012c;
    L_0x0120:
        r4 = r7.exists();	 Catch:{ IOException -> 0x0407 }
        if (r4 == 0) goto L_0x012c;
    L_0x0126:
        r24 = r7.length();	 Catch:{ SQLiteException -> 0x033a }
        r14 = r14 + r24;
    L_0x012c:
        r0 = r16;
        if (r0 >= r6) goto L_0x0157;
    L_0x0130:
        r24 = 15000000; // 0xe4e1c0 float:2.1019477E-38 double:7.4109847E-317;
        r4 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1));
        if (r4 >= 0) goto L_0x0157;
    L_0x0137:
        r4 = 22;
        r0 = r22;
        r10 = r0.getLong(r4);	 Catch:{ SQLiteException -> 0x033a }
        if (r7 == 0) goto L_0x05a5;
    L_0x0141:
        r4 = r7.exists();	 Catch:{ IOException -> 0x0409 }
        if (r4 == 0) goto L_0x05a5;
    L_0x0147:
        r4 = 0;
        r7 = android.net.Uri.fromFile(r7);	 Catch:{ IOException -> 0x040b }
        r8.add(r4, r7);	 Catch:{ IOException -> 0x040b }
        r4 = r16;
    L_0x0151:
        r7 = r22.moveToNext();	 Catch:{ SQLiteException -> 0x033a }
        if (r7 != 0) goto L_0x00f2;
    L_0x0157:
        r6 = r10;
        r22.close();	 Catch:{ all -> 0x0321 }
    L_0x015b:
        if (r18 == 0) goto L_0x0160;
    L_0x015d:
        r22.close();	 Catch:{ IOException -> 0x040d }
    L_0x0160:
        r0 = r30;
        r4 = r0.i;	 Catch:{ all -> 0x0321 }
        r4 = r4.getReadableDatabase();	 Catch:{ all -> 0x0321 }
        r10 = U;	 Catch:{ all -> 0x0321 }
        r11 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r10 = r10[r11];	 Catch:{ all -> 0x0321 }
        r11 = 2;
        r11 = new java.lang.String[r11];	 Catch:{ all -> 0x0321 }
        r14 = 0;
        r11[r14] = r31;	 Catch:{ all -> 0x0321 }
        r14 = 1;
        r6 = java.lang.Long.toString(r6);	 Catch:{ all -> 0x0321 }
        r11[r14] = r6;	 Catch:{ all -> 0x0321 }
        r10 = r4.rawQuery(r10, r11);	 Catch:{ all -> 0x0321 }
        if (r10 == 0) goto L_0x02a5;
    L_0x0181:
        r4 = r10.moveToFirst();	 Catch:{ IOException -> 0x040f }
        if (r4 == 0) goto L_0x02a2;
    L_0x0187:
        r11 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x05a1 }
        r11.<init>();	 Catch:{ SQLiteException -> 0x05a1 }
        r6 = r12;
    L_0x018d:
        r0 = r30;
        r1 = r31;
        r12 = r0.a(r10, r1);	 Catch:{ SQLiteException -> 0x0423 }
        if (r12 != 0) goto L_0x0199;
    L_0x0197:
        if (r18 == 0) goto L_0x0296;
    L_0x0199:
        r9 = r9 + 1;
        r4 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x0411 }
        r4 = r4.getApplicationContext();	 Catch:{ IOException -> 0x0411 }
        r14 = com.whatsapp.App.f(r12);	 Catch:{ IOException -> 0x0411 }
        r4 = com.whatsapp.util.bm.l(r4, r14);	 Catch:{ IOException -> 0x0411 }
        r11.append(r4);	 Catch:{ IOException -> 0x0411 }
        r4 = U;	 Catch:{ IOException -> 0x0411 }
        r13 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r4 = r4[r13];	 Catch:{ IOException -> 0x0411 }
        r11.append(r4);	 Catch:{ IOException -> 0x0411 }
        r4 = r12.j;	 Catch:{ IOException -> 0x0411 }
        if (r4 != 0) goto L_0x01be;
    L_0x01b9:
        r4 = r12.a;	 Catch:{ IOException -> 0x0413 }
        r13 = 6;
        if (r4 == r13) goto L_0x0234;
    L_0x01be:
        r4 = r12.e;	 Catch:{ IOException -> 0x0415 }
        r4 = r4.b;	 Catch:{ IOException -> 0x0415 }
        if (r4 == 0) goto L_0x01d3;
    L_0x01c4:
        r4 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x0417 }
        r4 = r4.getApplicationContext();	 Catch:{ IOException -> 0x0417 }
        r4 = com.whatsapp.App.p(r4);	 Catch:{ IOException -> 0x0417 }
        r11.append(r4);	 Catch:{ IOException -> 0x0417 }
        if (r18 == 0) goto L_0x022b;
    L_0x01d3:
        if (r20 == 0) goto L_0x0218;
    L_0x01d5:
        r4 = r12.F;	 Catch:{ IOException -> 0x041b }
        if (r4 == 0) goto L_0x01ec;
    L_0x01d9:
        r4 = com.whatsapp.App.P;	 Catch:{ IOException -> 0x041d }
        r13 = r12.F;	 Catch:{ IOException -> 0x041d }
        r4 = r4.a(r13);	 Catch:{ IOException -> 0x041d }
        r13 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x041d }
        r4 = r4.a(r13);	 Catch:{ IOException -> 0x041d }
        r11.append(r4);	 Catch:{ IOException -> 0x041d }
        if (r18 == 0) goto L_0x022b;
    L_0x01ec:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x041f }
        r4.<init>();	 Catch:{ IOException -> 0x041f }
        r13 = U;	 Catch:{ IOException -> 0x041f }
        r14 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r13 = r13[r14];	 Catch:{ IOException -> 0x041f }
        r4 = r4.append(r13);	 Catch:{ IOException -> 0x041f }
        r13 = com.whatsapp.util.Log.a(r12);	 Catch:{ IOException -> 0x041f }
        r4 = r4.append(r13);	 Catch:{ IOException -> 0x041f }
        r4 = r4.toString();	 Catch:{ IOException -> 0x041f }
        com.whatsapp.util.Log.e(r4);	 Catch:{ IOException -> 0x041f }
        r4 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x041f }
        r13 = 2131625039; // 0x7f0e044f float:1.8877275E38 double:1.0531627016E-314;
        r4 = r4.getString(r13);	 Catch:{ IOException -> 0x041f }
        r11.append(r4);	 Catch:{ IOException -> 0x041f }
        if (r18 == 0) goto L_0x022b;
    L_0x0218:
        r4 = com.whatsapp.App.P;	 Catch:{ IOException -> 0x0421 }
        r13 = r12.e;	 Catch:{ IOException -> 0x0421 }
        r13 = r13.c;	 Catch:{ IOException -> 0x0421 }
        r4 = r4.a(r13);	 Catch:{ IOException -> 0x0421 }
        r13 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x0421 }
        r4 = r4.a(r13);	 Catch:{ IOException -> 0x0421 }
        r11.append(r4);	 Catch:{ IOException -> 0x0421 }
    L_0x022b:
        r4 = U;	 Catch:{ SQLiteException -> 0x0423 }
        r13 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r4 = r4[r13];	 Catch:{ SQLiteException -> 0x0423 }
        r11.append(r4);	 Catch:{ SQLiteException -> 0x0423 }
    L_0x0234:
        r4 = r12.j;	 Catch:{ IOException -> 0x0550 }
        switch(r4) {
            case 1: goto L_0x0448;
            case 2: goto L_0x0448;
            case 3: goto L_0x0448;
            case 4: goto L_0x04b2;
            case 5: goto L_0x04e8;
            default: goto L_0x0239;
        };
    L_0x0239:
        r4 = r12.j;	 Catch:{ IOException -> 0x0583 }
        if (r4 == 0) goto L_0x0259;
    L_0x023d:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0585 }
        r4.<init>();	 Catch:{ IOException -> 0x0585 }
        r13 = U;	 Catch:{ IOException -> 0x0585 }
        r14 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r13 = r13[r14];	 Catch:{ IOException -> 0x0585 }
        r4 = r4.append(r13);	 Catch:{ IOException -> 0x0585 }
        r13 = r12.j;	 Catch:{ IOException -> 0x0585 }
        r4 = r4.append(r13);	 Catch:{ IOException -> 0x0585 }
        r4 = r4.toString();	 Catch:{ IOException -> 0x0585 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ IOException -> 0x0585 }
    L_0x0259:
        r4 = r12.a;	 Catch:{ IOException -> 0x0587 }
        r13 = 6;
        if (r4 != r13) goto L_0x0267;
    L_0x025e:
        r4 = com.whatsapp.ConversationRowDivider.c(r12);	 Catch:{ IOException -> 0x0587 }
        r11.append(r4);	 Catch:{ IOException -> 0x0587 }
        if (r18 == 0) goto L_0x026e;
    L_0x0267:
        r4 = r12.f();	 Catch:{ IOException -> 0x0589 }
        r11.append(r4);	 Catch:{ IOException -> 0x0589 }
    L_0x026e:
        r4 = r11.length();	 Catch:{ SQLiteException -> 0x058b }
        if (r4 <= 0) goto L_0x0296;
    L_0x0274:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x058d }
        r4.<init>();	 Catch:{ IOException -> 0x058d }
        r12 = r11.toString();	 Catch:{ IOException -> 0x058d }
        r4 = r4.append(r12);	 Catch:{ IOException -> 0x058d }
        r12 = "\n";
        r4 = r4.append(r12);	 Catch:{ IOException -> 0x058d }
        r4 = r4.toString();	 Catch:{ IOException -> 0x058d }
        r5.write(r4);	 Catch:{ IOException -> 0x058d }
    L_0x028e:
        r4 = 0;
        r12 = r11.length();	 Catch:{ SQLiteException -> 0x0423 }
        r11.delete(r4, r12);	 Catch:{ SQLiteException -> 0x0423 }
    L_0x0296:
        r4 = r10.moveToNext();	 Catch:{ SQLiteException -> 0x0423 }
        if (r4 != 0) goto L_0x018d;
    L_0x029c:
        r10.close();	 Catch:{ all -> 0x0321 }
        r12 = r6;
    L_0x02a0:
        if (r18 == 0) goto L_0x02a5;
    L_0x02a2:
        r10.close();	 Catch:{ IOException -> 0x0599 }
    L_0x02a5:
        monitor-exit(r21);	 Catch:{ all -> 0x0321 }
        r5.flush();	 Catch:{ IOException -> 0x059b }
        r5.close();	 Catch:{ IOException -> 0x059b }
    L_0x02ac:
        r4 = r17.length();
        r4 = r4 + r12;
        r6 = android.net.Uri.fromFile(r17);
        r7 = 0;
        r8.add(r7, r6);
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = U;
        r10 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r7 = r7[r10];
        r6 = r6.append(r7);
        r6 = r6.append(r9);
        r7 = U;
        r9 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r7 = r7[r9];
        r6 = r6.append(r7);
        r7 = r8.size();
        r6 = r6.append(r7);
        r7 = U;
        r9 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r7 = r7[r9];
        r6 = r6.append(r7);
        r4 = r6.append(r4);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r19.c();
        r4 = r8;
    L_0x02f7:
        return r4;
    L_0x02f8:
        r4 = move-exception;
        r4 = com.whatsapp.util.a5.b(r5);
        r4 = com.whatsapp.App.t(r4);
        r17 = r4;
        goto L_0x0084;
    L_0x0305:
        r4 = move-exception;
        throw r4;
    L_0x0307:
        r4 = move-exception;
        r4 = U;
        r5 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r4 = r4[r5];
        com.whatsapp.util.Log.e(r4);
        r4 = 0;
        goto L_0x02f7;
    L_0x0313:
        r4 = move-exception;
        com.whatsapp.util.Log.c(r4);
        goto L_0x00a1;
    L_0x0319:
        r4 = 40000; // 0x9c40 float:5.6052E-41 double:1.97626E-319;
        r6 = r4;
        goto L_0x00b2;
    L_0x031f:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0321 }
    L_0x0321:
        r4 = move-exception;
        monitor-exit(r21);	 Catch:{ all -> 0x0321 }
        throw r4;
    L_0x0324:
        if (r32 == 0) goto L_0x011e;
    L_0x0326:
        r0 = r23;
        r4 = r0.A;	 Catch:{ IOException -> 0x0338 }
        if (r4 == 0) goto L_0x011e;
    L_0x032c:
        r0 = r23;
        r4 = r0.A;	 Catch:{ SQLiteException -> 0x033a }
        r4 = (com.whatsapp.MediaData) r4;	 Catch:{ SQLiteException -> 0x033a }
        r7 = r4.file;	 Catch:{ SQLiteException -> 0x033a }
        goto L_0x011e;
    L_0x0336:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0338 }
    L_0x0338:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x033a }
    L_0x033a:
        r4 = move-exception;
        r6 = r10;
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03da }
        r10.<init>();	 Catch:{ all -> 0x03da }
        r11 = U;	 Catch:{ all -> 0x03da }
        r14 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r11 = r11[r14];	 Catch:{ all -> 0x03da }
        r10 = r10.append(r11);	 Catch:{ all -> 0x03da }
        r4 = r4.toString();	 Catch:{ all -> 0x03da }
        r4 = r10.append(r4);	 Catch:{ all -> 0x03da }
        r4 = r4.toString();	 Catch:{ all -> 0x03da }
        com.whatsapp.util.Log.e(r4);	 Catch:{ all -> 0x03da }
        r22.close();	 Catch:{ all -> 0x0321 }
        goto L_0x015b;
    L_0x035f:
        r24 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x03d8 }
        r24.<init>();	 Catch:{ IOException -> 0x03d8 }
        r0 = r23;
        r4 = r0.H;	 Catch:{ IOException -> 0x03d8 }
        if (r4 != 0) goto L_0x03df;
    L_0x036a:
        r4 = "";
    L_0x036c:
        r0 = r24;
        r4 = r0.append(r4);	 Catch:{ SQLiteException -> 0x033a }
        r24 = U;	 Catch:{ SQLiteException -> 0x033a }
        r25 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r24 = r24[r25];	 Catch:{ SQLiteException -> 0x033a }
        r0 = r24;
        r4 = r4.append(r0);	 Catch:{ SQLiteException -> 0x033a }
        r4 = r4.toString();	 Catch:{ SQLiteException -> 0x033a }
        r4 = com.whatsapp.App.t(r4);	 Catch:{ SQLiteException -> 0x033a }
        r24 = r4.exists();	 Catch:{ IOException -> 0x03f5 }
        if (r24 == 0) goto L_0x03a0;
    L_0x038c:
        r24 = r4.lastModified();	 Catch:{ IOException -> 0x03f5 }
        r26 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x03f5 }
        r28 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r26 = r26 - r28;
        r24 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1));
        if (r24 >= 0) goto L_0x03a0;
    L_0x039d:
        r4.delete();	 Catch:{ IOException -> 0x03f7 }
    L_0x03a0:
        r24 = r4.exists();	 Catch:{ SQLiteException -> 0x033a }
        if (r24 != 0) goto L_0x011e;
    L_0x03a6:
        r24 = new java.io.OutputStreamWriter;	 Catch:{ IOException -> 0x03f9 }
        r25 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x03f9 }
        r0 = r25;
        r0.<init>(r4);	 Catch:{ IOException -> 0x03f9 }
        r26 = U;	 Catch:{ IOException -> 0x03f9 }
        r27 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r26 = r26[r27];	 Catch:{ IOException -> 0x03f9 }
        r24.<init>(r25, r26);	 Catch:{ IOException -> 0x03f9 }
        r23 = r23.f();	 Catch:{ IOException -> 0x03f9 }
        r0 = r24;
        r1 = r23;
        r0.write(r1);	 Catch:{ IOException -> 0x03f9 }
        r24.flush();	 Catch:{ IOException -> 0x03f9 }
        r24.close();	 Catch:{ IOException -> 0x03f9 }
        r23 = android.net.Uri.fromFile(r4);	 Catch:{ IOException -> 0x03f9 }
        r0 = r23;
        r23 = r8.contains(r0);	 Catch:{ IOException -> 0x03f9 }
        if (r23 != 0) goto L_0x0405;
    L_0x03d5:
        r7 = r4;
        goto L_0x011e;
    L_0x03d8:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x033a }
    L_0x03da:
        r4 = move-exception;
        r22.close();	 Catch:{ all -> 0x0321 }
        throw r4;	 Catch:{ all -> 0x0321 }
    L_0x03df:
        r0 = r23;
        r4 = r0.H;	 Catch:{ SQLiteException -> 0x033a }
        r25 = U;	 Catch:{ SQLiteException -> 0x033a }
        r26 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r25 = r25[r26];	 Catch:{ SQLiteException -> 0x033a }
        r26 = "";
        r0 = r25;
        r1 = r26;
        r4 = r4.replaceAll(r0, r1);	 Catch:{ SQLiteException -> 0x033a }
        goto L_0x036c;
    L_0x03f5:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03f7 }
    L_0x03f7:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x033a }
    L_0x03f9:
        r4 = move-exception;
        r23 = U;	 Catch:{ SQLiteException -> 0x033a }
        r24 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r23 = r23[r24];	 Catch:{ SQLiteException -> 0x033a }
        r0 = r23;
        com.whatsapp.util.Log.b(r0, r4);	 Catch:{ SQLiteException -> 0x033a }
    L_0x0405:
        r4 = r7;
        goto L_0x03d5;
    L_0x0407:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x033a }
    L_0x0409:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x040b }
    L_0x040b:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x033a }
    L_0x040d:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0321 }
    L_0x040f:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0321 }
    L_0x0411:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0413 }
    L_0x0413:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0415 }
    L_0x0415:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0417 }
    L_0x0417:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0419 }
    L_0x0419:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x041b }
    L_0x041b:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x041d }
    L_0x041d:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x041f }
    L_0x041f:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0421 }
    L_0x0421:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0423 }
    L_0x0423:
        r4 = move-exception;
    L_0x0424:
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0554 }
        r11.<init>();	 Catch:{ all -> 0x0554 }
        r12 = U;	 Catch:{ all -> 0x0554 }
        r13 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r12 = r12[r13];	 Catch:{ all -> 0x0554 }
        r11 = r11.append(r12);	 Catch:{ all -> 0x0554 }
        r4 = r4.toString();	 Catch:{ all -> 0x0554 }
        r4 = r11.append(r4);	 Catch:{ all -> 0x0554 }
        r4 = r4.toString();	 Catch:{ all -> 0x0554 }
        com.whatsapp.util.Log.e(r4);	 Catch:{ all -> 0x0554 }
        r10.close();	 Catch:{ all -> 0x0321 }
        r12 = r6;
        goto L_0x02a0;
    L_0x0448:
        if (r32 == 0) goto L_0x04a4;
    L_0x044a:
        r4 = r12.A;	 Catch:{ IOException -> 0x0552 }
        if (r4 == 0) goto L_0x0496;
    L_0x044e:
        r4 = r12.A;	 Catch:{ SQLiteException -> 0x0423 }
        r4 = (com.whatsapp.MediaData) r4;	 Catch:{ SQLiteException -> 0x0423 }
        r4 = r4.file;	 Catch:{ SQLiteException -> 0x0423 }
        if (r4 == 0) goto L_0x0488;
    L_0x0456:
        r13 = r4.exists();	 Catch:{ IOException -> 0x0559 }
        if (r13 == 0) goto L_0x0488;
    L_0x045c:
        r14 = r4.length();	 Catch:{ SQLiteException -> 0x0423 }
        r6 = r6 + r14;
        r13 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x055b }
        r14 = 2131624264; // 0x7f0e0148 float:1.8875703E38 double:1.0531623187E-314;
        r15 = 1;
        r15 = new java.lang.Object[r15];	 Catch:{ IOException -> 0x055b }
        r16 = 0;
        r4 = r4.getName();	 Catch:{ IOException -> 0x055b }
        r15[r16] = r4;	 Catch:{ IOException -> 0x055b }
        r4 = r13.getString(r14, r15);	 Catch:{ IOException -> 0x055b }
        r11.append(r4);	 Catch:{ IOException -> 0x055b }
        r4 = r12.v;	 Catch:{ IOException -> 0x055b }
        if (r4 == 0) goto L_0x0494;
    L_0x047c:
        r4 = "\n";
        r11.append(r4);	 Catch:{ IOException -> 0x055b }
        r4 = r12.v;	 Catch:{ IOException -> 0x055b }
        r11.append(r4);	 Catch:{ IOException -> 0x055b }
        if (r18 == 0) goto L_0x0494;
    L_0x0488:
        r4 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x055d }
        r13 = 2131624266; // 0x7f0e014a float:1.8875707E38 double:1.0531623197E-314;
        r4 = r4.getString(r13);	 Catch:{ IOException -> 0x055d }
        r11.append(r4);	 Catch:{ IOException -> 0x055d }
    L_0x0494:
        if (r18 == 0) goto L_0x026e;
    L_0x0496:
        r4 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x055f }
        r13 = 2131624266; // 0x7f0e014a float:1.8875707E38 double:1.0531623197E-314;
        r4 = r4.getString(r13);	 Catch:{ IOException -> 0x055f }
        r11.append(r4);	 Catch:{ IOException -> 0x055f }
        if (r18 == 0) goto L_0x026e;
    L_0x04a4:
        r4 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x0561 }
        r13 = 2131624266; // 0x7f0e014a float:1.8875707E38 double:1.0531623197E-314;
        r4 = r4.getString(r13);	 Catch:{ IOException -> 0x0561 }
        r11.append(r4);	 Catch:{ IOException -> 0x0561 }
        if (r18 == 0) goto L_0x026e;
    L_0x04b2:
        r13 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x0563 }
        r14 = 2131624264; // 0x7f0e0148 float:1.8875703E38 double:1.0531623187E-314;
        r4 = 1;
        r15 = new java.lang.Object[r4];	 Catch:{ IOException -> 0x0563 }
        r16 = 0;
        r22 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0563 }
        r22.<init>();	 Catch:{ IOException -> 0x0563 }
        r4 = r12.H;	 Catch:{ IOException -> 0x0563 }
        if (r4 != 0) goto L_0x0567;
    L_0x04c5:
        r4 = "";
    L_0x04c7:
        r0 = r22;
        r4 = r0.append(r4);	 Catch:{ IOException -> 0x057b }
        r22 = U;	 Catch:{ IOException -> 0x057b }
        r23 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r22 = r22[r23];	 Catch:{ IOException -> 0x057b }
        r0 = r22;
        r4 = r4.append(r0);	 Catch:{ IOException -> 0x057b }
        r4 = r4.toString();	 Catch:{ IOException -> 0x057b }
        r15[r16] = r4;	 Catch:{ IOException -> 0x057b }
        r4 = r13.getString(r14, r15);	 Catch:{ IOException -> 0x057b }
        r11.append(r4);	 Catch:{ IOException -> 0x057b }
        if (r18 == 0) goto L_0x026e;
    L_0x04e8:
        r4 = r12.H;	 Catch:{ IOException -> 0x057b }
        if (r4 == 0) goto L_0x04f6;
    L_0x04ec:
        r4 = r12.H;	 Catch:{ IOException -> 0x057d }
        r11.append(r4);	 Catch:{ IOException -> 0x057d }
        r4 = "\n";
        r11.append(r4);	 Catch:{ IOException -> 0x057d }
    L_0x04f6:
        r4 = r12.t;	 Catch:{ IOException -> 0x057f }
        if (r4 == 0) goto L_0x0501;
    L_0x04fa:
        r4 = r12.t;	 Catch:{ IOException -> 0x057f }
        r11.append(r4);	 Catch:{ IOException -> 0x057f }
        if (r18 == 0) goto L_0x026e;
    L_0x0501:
        r4 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x0581 }
        r13 = 2131624265; // 0x7f0e0149 float:1.8875705E38 double:1.053162319E-314;
        r14 = 1;
        r14 = new java.lang.Object[r14];	 Catch:{ IOException -> 0x0581 }
        r15 = 0;
        r16 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0581 }
        r16.<init>();	 Catch:{ IOException -> 0x0581 }
        r22 = U;	 Catch:{ IOException -> 0x0581 }
        r23 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r22 = r22[r23];	 Catch:{ IOException -> 0x0581 }
        r0 = r16;
        r1 = r22;
        r16 = r0.append(r1);	 Catch:{ IOException -> 0x0581 }
        r0 = r12.K;	 Catch:{ IOException -> 0x0581 }
        r22 = r0;
        r0 = r16;
        r1 = r22;
        r16 = r0.append(r1);	 Catch:{ IOException -> 0x0581 }
        r22 = ",";
        r0 = r16;
        r1 = r22;
        r16 = r0.append(r1);	 Catch:{ IOException -> 0x0581 }
        r0 = r12.G;	 Catch:{ IOException -> 0x0581 }
        r22 = r0;
        r0 = r16;
        r1 = r22;
        r16 = r0.append(r1);	 Catch:{ IOException -> 0x0581 }
        r16 = r16.toString();	 Catch:{ IOException -> 0x0581 }
        r14[r15] = r16;	 Catch:{ IOException -> 0x0581 }
        r4 = r4.getString(r13, r14);	 Catch:{ IOException -> 0x0581 }
        r11.append(r4);	 Catch:{ IOException -> 0x0581 }
        if (r18 == 0) goto L_0x026e;
    L_0x054e:
        goto L_0x0239;
    L_0x0550:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0552 }
    L_0x0552:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0423 }
    L_0x0554:
        r4 = move-exception;
        r10.close();	 Catch:{ all -> 0x0321 }
        throw r4;	 Catch:{ all -> 0x0321 }
    L_0x0559:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0423 }
    L_0x055b:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x055d }
    L_0x055d:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0423 }
    L_0x055f:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0561 }
    L_0x0561:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0563 }
    L_0x0563:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0565 }
    L_0x0565:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0423 }
    L_0x0567:
        r4 = r12.H;	 Catch:{ SQLiteException -> 0x0423 }
        r23 = U;	 Catch:{ SQLiteException -> 0x0423 }
        r24 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r23 = r23[r24];	 Catch:{ SQLiteException -> 0x0423 }
        r24 = "";
        r0 = r23;
        r1 = r24;
        r4 = r4.replaceAll(r0, r1);	 Catch:{ SQLiteException -> 0x0423 }
        goto L_0x04c7;
    L_0x057b:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x057d }
    L_0x057d:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0423 }
    L_0x057f:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0581 }
    L_0x0581:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0583 }
    L_0x0583:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0585 }
    L_0x0585:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0423 }
    L_0x0587:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0589 }
    L_0x0589:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0423 }
    L_0x058b:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0423 }
    L_0x058d:
        r4 = move-exception;
        r12 = U;	 Catch:{ SQLiteException -> 0x0423 }
        r13 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r12 = r12[r13];	 Catch:{ SQLiteException -> 0x0423 }
        com.whatsapp.util.Log.b(r12, r4);	 Catch:{ SQLiteException -> 0x0423 }
        goto L_0x028e;
    L_0x0599:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0321 }
    L_0x059b:
        r4 = move-exception;
        com.whatsapp.util.Log.c(r4);
        goto L_0x02ac;
    L_0x05a1:
        r4 = move-exception;
        r6 = r12;
        goto L_0x0424;
    L_0x05a5:
        r4 = r16;
        goto L_0x0151;
    L_0x05a9:
        r6 = r10;
        goto L_0x015d;
    L_0x05ac:
        r6 = r10;
        goto L_0x0160;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.c(java.lang.String, boolean):java.util.ArrayList");
    }

    static boolean a(l7 l7Var, String str) {
        return l7Var.A(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.whatsapp.protocol.b r13, int r14) {
        /*
        r12_this = this;
        r0 = 0;
        r6 = 1;
        r4 = com.whatsapp.m3.d;
        r2 = java.lang.Boolean.valueOf(r0);
        r1 = 0;
        r5 = r12.i;
        monitor-enter(r5);
        r3 = r12.i;	 Catch:{ IOException -> 0x00a1 }
        r1 = r3.getWritableDatabase();	 Catch:{ IOException -> 0x00a1 }
        r12.z();	 Catch:{ SQLiteConstraintException -> 0x0099 }
        r1.beginTransaction();	 Catch:{ SQLiteConstraintException -> 0x0099 }
        r3 = r13.e;	 Catch:{ SQLiteConstraintException -> 0x0099 }
        r3 = r3.b;	 Catch:{ SQLiteConstraintException -> 0x0099 }
        if (r3 == 0) goto L_0x0071;
    L_0x001e:
        r3 = r13.l;	 Catch:{ SQLiteConstraintException -> 0x0099 }
        if (r3 == 0) goto L_0x0071;
    L_0x0022:
        r3 = r13.e;	 Catch:{ SQLiteConstraintException -> 0x009b }
        r3 = r3.c;	 Catch:{ SQLiteConstraintException -> 0x009b }
        r3 = com.whatsapp.m8.b(r3);	 Catch:{ SQLiteConstraintException -> 0x009b }
        if (r3 == 0) goto L_0x0071;
    L_0x002c:
        r3 = 4;
        if (r14 == r3) goto L_0x0031;
    L_0x002f:
        if (r14 != r6) goto L_0x006a;
    L_0x0031:
        r3 = r13.F;	 Catch:{ IOException -> 0x00a1 }
        r6 = ",";
        r6 = r3.split(r6);	 Catch:{ IOException -> 0x00a1 }
        r7 = r6.length;	 Catch:{ IOException -> 0x00a1 }
        r3 = r0;
    L_0x003b:
        if (r3 >= r7) goto L_0x0063;
    L_0x003d:
        r0 = r6[r3];	 Catch:{ IOException -> 0x00a1 }
        r8 = new com.whatsapp.protocol.b;	 Catch:{ SQLiteConstraintException -> 0x00b4 }
        r8.<init>(r13);	 Catch:{ SQLiteConstraintException -> 0x00b4 }
        r9 = new com.whatsapp.protocol.m;	 Catch:{ SQLiteConstraintException -> 0x00b4 }
        r10 = 1;
        r11 = r13.e;	 Catch:{ SQLiteConstraintException -> 0x00b4 }
        r11 = r11.a;	 Catch:{ SQLiteConstraintException -> 0x00b4 }
        r9.<init>(r0, r10, r11);	 Catch:{ SQLiteConstraintException -> 0x00b4 }
        r8.e = r9;	 Catch:{ SQLiteConstraintException -> 0x00b4 }
        r10 = r12.b(r8);	 Catch:{ SQLiteConstraintException -> 0x00b4 }
        r9 = r12.b;	 Catch:{ SQLiteConstraintException -> 0x00b2 }
        r0 = r9.containsKey(r0);	 Catch:{ SQLiteConstraintException -> 0x00b2 }
        if (r0 == 0) goto L_0x005f;
    L_0x005c:
        r12.a(r1, r8, r10);	 Catch:{ SQLiteConstraintException -> 0x00b2 }
    L_0x005f:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x00db;
    L_0x0063:
        r0 = r12.E;	 Catch:{ IOException -> 0x00a1 }
        a(r13, r0);	 Catch:{ IOException -> 0x00a1 }
        if (r4 == 0) goto L_0x0076;
    L_0x006a:
        r0 = r12.t;	 Catch:{ IOException -> 0x00a1 }
        b(r13, r0);	 Catch:{ IOException -> 0x00a1 }
        if (r4 == 0) goto L_0x0076;
    L_0x0071:
        r0 = r12.E;	 Catch:{ IOException -> 0x00a1 }
        a(r13, r0);	 Catch:{ IOException -> 0x00a1 }
    L_0x0076:
        r0.execute();	 Catch:{ IOException -> 0x00a1 }
        r1.setTransactionSuccessful();	 Catch:{ IOException -> 0x00a1 }
        r0 = r12.S;	 Catch:{ IOException -> 0x00a1 }
        r3 = r13.e;	 Catch:{ IOException -> 0x00a1 }
        r0.put(r3, r13);	 Catch:{ IOException -> 0x00a1 }
        r0 = 1;
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ IOException -> 0x00a1 }
        if (r1 == 0) goto L_0x0093;
    L_0x008a:
        r2 = r1.inTransaction();	 Catch:{ SQLiteConstraintException -> 0x00cf }
        if (r2 == 0) goto L_0x0093;
    L_0x0090:
        r1.endTransaction();	 Catch:{ SQLiteConstraintException -> 0x00d1 }
    L_0x0093:
        monitor-exit(r5);	 Catch:{ all -> 0x00cc }
        r0 = r0.booleanValue();
        return r0;
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x00bf }
        if (r1 == 0) goto L_0x00d9;
    L_0x00a7:
        r0 = r1.inTransaction();	 Catch:{ SQLiteConstraintException -> 0x00d3 }
        if (r0 == 0) goto L_0x00d9;
    L_0x00ad:
        r1.endTransaction();	 Catch:{ SQLiteConstraintException -> 0x00d3 }
        r0 = r2;
        goto L_0x0093;
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        r8 = U;	 Catch:{ IOException -> 0x00a1 }
        r9 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r8 = r8[r9];	 Catch:{ IOException -> 0x00a1 }
        com.whatsapp.util.Log.a(r8, r0);	 Catch:{ IOException -> 0x00a1 }
        goto L_0x005f;
    L_0x00bf:
        r0 = move-exception;
        if (r1 == 0) goto L_0x00cb;
    L_0x00c2:
        r2 = r1.inTransaction();	 Catch:{ SQLiteConstraintException -> 0x00d5 }
        if (r2 == 0) goto L_0x00cb;
    L_0x00c8:
        r1.endTransaction();	 Catch:{ SQLiteConstraintException -> 0x00d7 }
    L_0x00cb:
        throw r0;	 Catch:{ all -> 0x00cc }
    L_0x00cc:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x00cc }
        throw r0;
    L_0x00cf:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x00d1 }
    L_0x00d1:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00cc }
    L_0x00d3:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00cc }
    L_0x00d5:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x00d7 }
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00cc }
    L_0x00d9:
        r0 = r2;
        goto L_0x0093;
    L_0x00db:
        r3 = r0;
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(com.whatsapp.protocol.b, int):boolean");
    }

    public void d(b bVar, int i) {
        this.D.b(bVar, i);
        this.y.c(bVar.e.c);
    }

    private static void a(b bVar, SQLiteStatement sQLiteStatement) {
        long j = 0;
        try {
            long j2;
            sQLiteStatement.bindLong(1, (long) bVar.a);
            if (bVar.l) {
                j2 = 2;
            } else {
                j2 = 0;
            }
            try {
                sQLiteStatement.bindLong(2, j2);
                a(bVar, sQLiteStatement, 4, 3);
                sQLiteStatement.bindLong(5, bVar.D);
                wv.a(6, bVar.t, sQLiteStatement);
                wv.a(7, bVar.s, sQLiteStatement);
                sQLiteStatement.bindLong(8, (long) bVar.j);
                sQLiteStatement.bindLong(9, bVar.k);
                wv.a(10, bVar.H, sQLiteStatement);
                wv.a(11, bVar.v, sQLiteStatement);
                wv.a(12, bVar.z, sQLiteStatement);
                sQLiteStatement.bindLong(13, (long) bVar.p);
                sQLiteStatement.bindLong(14, (long) bVar.w);
                sQLiteStatement.bindDouble(15, bVar.K);
                sQLiteStatement.bindDouble(16, bVar.G);
                wv.a(17, bVar.A, sQLiteStatement);
                sQLiteStatement.bindString(18, bVar.e.c);
                if (bVar.e.b) {
                    j = 1;
                }
                sQLiteStatement.bindLong(19, j);
                sQLiteStatement.bindString(20, bVar.e.a);
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static void a(l7 l7Var, int i, b bVar) {
        l7Var.a(i, bVar);
    }

    public Cursor a(String str, int i, b bVar, mi miVar) {
        sf sfVar = (sf) this.b.get(str);
        if (sfVar != null) {
            try {
                if (sf.i(sfVar) == 1) {
                    sf.c(sfVar, e(bVar));
                }
                sf.c(sfVar, c(str, i));
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return a(str, i, miVar);
    }

    public boolean n() {
        boolean z;
        synchronized (this.C) {
            z = this.C.size() > 0;
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.ed a(boolean r6, com.whatsapp.b3 r7) {
        /*
        r5_this = this;
        r1 = 0;
        r2 = com.whatsapp.ed.FAILED;
        r3 = r5.i;
        monitor-enter(r3);
        r0 = r5.i;	 Catch:{ all -> 0x0055 }
        r0.a(r7);	 Catch:{ all -> 0x0055 }
        r0 = U;	 Catch:{ all -> 0x0055 }
        r4 = 355; // 0x163 float:4.97E-43 double:1.754E-321;
        r0 = r0[r4];	 Catch:{ all -> 0x0055 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x0055 }
        r0 = r5.r;	 Catch:{ all -> 0x0055 }
        if (r0 != 0) goto L_0x0064;
    L_0x0018:
        if (r6 == 0) goto L_0x0058;
    L_0x001a:
        r0 = r5.w();	 Catch:{ IllegalStateException -> 0x0053 }
    L_0x001e:
        if (r6 == 0) goto L_0x0025;
    L_0x0020:
        r1 = r0 * 100;
        r0 = r0 + 1;
        r1 = r1 / r0;
    L_0x0025:
        if (r6 == 0) goto L_0x0062;
    L_0x0027:
        r0 = r5.a(r1);	 Catch:{ IllegalStateException -> 0x005c }
        if (r0 == 0) goto L_0x0062;
    L_0x002d:
        r0 = r5.q();	 Catch:{ IllegalStateException -> 0x005e }
        if (r0 == 0) goto L_0x0062;
    L_0x0033:
        r5.z();	 Catch:{ all -> 0x0055 }
        r0 = r5.i;	 Catch:{ all -> 0x0055 }
        com.whatsapp.wv.c(r0);	 Catch:{ all -> 0x0055 }
        r0 = r5.i;	 Catch:{ all -> 0x0055 }
        com.whatsapp.wv.b(r0);	 Catch:{ all -> 0x0055 }
        r0 = com.whatsapp.ed.SUCCESS_RESTORED;	 Catch:{ all -> 0x0055 }
        r1 = 1;
        r5.r = r1;	 Catch:{ IllegalStateException -> 0x0060 }
        r1 = com.whatsapp.m3.d;	 Catch:{ IllegalStateException -> 0x0060 }
        if (r1 == 0) goto L_0x0051;
    L_0x0049:
        r1 = r5.s();	 Catch:{ IllegalStateException -> 0x0060 }
        if (r1 == 0) goto L_0x0051;
    L_0x004f:
        r0 = com.whatsapp.ed.SUCCESS_CREATED;	 Catch:{ all -> 0x0055 }
    L_0x0051:
        monitor-exit(r3);	 Catch:{ all -> 0x0055 }
        return r0;
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0055 }
        throw r0;
    L_0x0058:
        r0 = r1;
        goto L_0x001e;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x0062:
        r0 = r2;
        goto L_0x0049;
    L_0x0064:
        r0 = r2;
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(boolean, com.whatsapp.b3):com.whatsapp.ed");
    }

    private static void b(File file, String str) {
        int i = m3.d;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            try {
                if (listFiles.length > 0) {
                    int length = listFiles.length;
                    int i2 = 0;
                    while (i2 < length) {
                        File file2 = listFiles[i2];
                        Log.i(str + file2.getName() + " " + file2.length());
                        i2++;
                        if (i != 0) {
                            return;
                        }
                    }
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.protocol.b b(com.whatsapp.protocol.m r10) {
        /*
        r9_this = this;
        r2 = 1;
        r3 = 0;
        if (r10 != 0) goto L_0x0006;
    L_0x0004:
        r0 = 0;
    L_0x0005:
        return r0;
    L_0x0006:
        r4 = r9.i;
        monitor-enter(r4);
        r0 = r9.S;	 Catch:{ all -> 0x0015 }
        r0 = r0.get(r10);	 Catch:{ all -> 0x0015 }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ all -> 0x0015 }
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        monitor-exit(r4);	 Catch:{ all -> 0x0015 }
        goto L_0x0005;
    L_0x0015:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0015 }
        throw r0;
    L_0x0018:
        r1 = com.whatsapp.t7.a(r10);	 Catch:{ all -> 0x0015 }
        if (r1 == 0) goto L_0x0021;
    L_0x001e:
        monitor-exit(r4);	 Catch:{ all -> 0x0015 }
        r0 = r1;
        goto L_0x0005;
    L_0x0021:
        r0 = r9.b;	 Catch:{ all -> 0x0015 }
        r5 = r10.c;	 Catch:{ all -> 0x0015 }
        r0 = r0.get(r5);	 Catch:{ all -> 0x0015 }
        r0 = (com.whatsapp.sf) r0;	 Catch:{ all -> 0x0015 }
        if (r0 == 0) goto L_0x0049;
    L_0x002d:
        r5 = com.whatsapp.sf.f(r0);	 Catch:{ IllegalStateException -> 0x0045 }
        if (r5 == 0) goto L_0x0049;
    L_0x0033:
        r5 = com.whatsapp.sf.f(r0);	 Catch:{ IllegalStateException -> 0x0047 }
        r5 = r5.e;	 Catch:{ IllegalStateException -> 0x0047 }
        r5 = r10.equals(r5);	 Catch:{ IllegalStateException -> 0x0047 }
        if (r5 == 0) goto L_0x0049;
    L_0x003f:
        r0 = com.whatsapp.sf.f(r0);	 Catch:{ all -> 0x0015 }
        monitor-exit(r4);	 Catch:{ all -> 0x0015 }
        goto L_0x0005;
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x0049:
        r0 = r9.i;	 Catch:{ IllegalStateException -> 0x009c }
        r5 = r0.getReadableDatabase();	 Catch:{ IllegalStateException -> 0x009c }
        r0 = U;	 Catch:{ IllegalStateException -> 0x009c }
        r6 = 346; // 0x15a float:4.85E-43 double:1.71E-321;
        r6 = r0[r6];	 Catch:{ IllegalStateException -> 0x009c }
        r0 = 3;
        r7 = new java.lang.String[r0];	 Catch:{ IllegalStateException -> 0x009c }
        r0 = 0;
        r8 = r10.c;	 Catch:{ IllegalStateException -> 0x009c }
        r7[r0] = r8;	 Catch:{ IllegalStateException -> 0x009c }
        r8 = 1;
        r0 = r10.b;	 Catch:{ IllegalStateException -> 0x009c }
        if (r0 == 0) goto L_0x009e;
    L_0x0062:
        r0 = r2;
    L_0x0063:
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0015 }
        r7[r8] = r0;	 Catch:{ all -> 0x0015 }
        r0 = 2;
        r2 = r10.a;	 Catch:{ all -> 0x0015 }
        r7[r0] = r2;	 Catch:{ all -> 0x0015 }
        r2 = r5.rawQuery(r6, r7);	 Catch:{ all -> 0x0015 }
        if (r2 == 0) goto L_0x00ab;
    L_0x0074:
        r0 = r2.moveToLast();	 Catch:{ all -> 0x00a0 }
        if (r0 == 0) goto L_0x00a9;
    L_0x007a:
        r0 = r10.c;	 Catch:{ all -> 0x00a0 }
        r0 = r9.a(r2, r0);	 Catch:{ all -> 0x00a0 }
    L_0x0080:
        r2.close();	 Catch:{ all -> 0x0015 }
        r1 = com.whatsapp.m3.d;	 Catch:{ IllegalStateException -> 0x00a5 }
        if (r1 == 0) goto L_0x0090;
    L_0x0087:
        r1 = U;	 Catch:{ IllegalStateException -> 0x00a5 }
        r2 = 347; // 0x15b float:4.86E-43 double:1.714E-321;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00a5 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IllegalStateException -> 0x00a5 }
    L_0x0090:
        if (r0 == 0) goto L_0x0099;
    L_0x0092:
        r1 = r9.S;	 Catch:{ IllegalStateException -> 0x00a7 }
        r2 = r0.e;	 Catch:{ IllegalStateException -> 0x00a7 }
        r1.put(r2, r0);	 Catch:{ IllegalStateException -> 0x00a7 }
    L_0x0099:
        monitor-exit(r4);	 Catch:{ all -> 0x0015 }
        goto L_0x0005;
    L_0x009c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x009e:
        r0 = r3;
        goto L_0x0063;
    L_0x00a0:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x0015 }
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x00a9:
        r0 = r1;
        goto L_0x0080;
    L_0x00ab:
        r0 = r1;
        goto L_0x0087;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.b(com.whatsapp.protocol.m):com.whatsapp.protocol.b");
    }

    public boolean s(String str) {
        try {
            return a(str, 1, null).size() > 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static boolean e(File file) {
        return b(file);
    }

    public void E() {
        Log.i(U[144]);
        synchronized (this.i) {
            this.i.getWritableDatabase().execSQL(U[145]);
        }
    }

    public long i(String str) {
        sf sfVar = (sf) this.b.get(str);
        return sfVar == null ? 0 : sf.c(sfVar);
    }

    public com.whatsapp.protocol.b a(android.database.Cursor r11, java.lang.String r12) {
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
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
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
        r10_this = this;
        r9 = 3;
        r8 = 2;
        r4 = 0;
        r1 = 0;
        r3 = 1;
        r5 = com.whatsapp.m3.d;
        if (r11 == 0) goto L_0x000b;
    L_0x0009:
        if (r12 != 0) goto L_0x000d;
    L_0x000b:
        r0 = r1;
    L_0x000c:
        return r0;
    L_0x000d:
        r6 = r10.i;
        monitor-enter(r6);
        r0 = 1;
        r2 = r11.getString(r0);	 Catch:{ all -> 0x0042 }
        if (r2 == 0) goto L_0x0023;
    L_0x0017:
        r0 = U;	 Catch:{ IOException -> 0x0040 }
        r7 = 357; // 0x165 float:5.0E-43 double:1.764E-321;	 Catch:{ IOException -> 0x0040 }
        r0 = r0[r7];	 Catch:{ IOException -> 0x0040 }
        r0 = r2.equals(r0);	 Catch:{ IOException -> 0x0040 }
        if (r0 == 0) goto L_0x0045;
    L_0x0023:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0042 }
        r0.<init>();	 Catch:{ all -> 0x0042 }
        r2 = U;	 Catch:{ all -> 0x0042 }
        r3 = 356; // 0x164 float:4.99E-43 double:1.76E-321;	 Catch:{ all -> 0x0042 }
        r2 = r2[r3];	 Catch:{ all -> 0x0042 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0042 }
        r0 = r0.append(r12);	 Catch:{ all -> 0x0042 }
        r0 = r0.toString();	 Catch:{ all -> 0x0042 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x0042 }
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        r0 = r1;	 Catch:{ all -> 0x0042 }
        goto L_0x000c;	 Catch:{ all -> 0x0042 }
    L_0x0040:
        r0 = move-exception;	 Catch:{ all -> 0x0042 }
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x0042:
        r0 = move-exception;	 Catch:{ all -> 0x0042 }
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        throw r0;
    L_0x0045:
        r0 = 0;
        r0 = r11.getInt(r0);	 Catch:{ IOException -> 0x005e }
        if (r0 != r3) goto L_0x0060;
    L_0x004c:
        r0 = r3;
    L_0x004d:
        r7 = new com.whatsapp.protocol.m;	 Catch:{ all -> 0x0042 }
        r7.<init>(r12, r0, r2);	 Catch:{ all -> 0x0042 }
        r0 = r10.S;	 Catch:{ all -> 0x0042 }
        r0 = r0.get(r7);	 Catch:{ all -> 0x0042 }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x0062;	 Catch:{ all -> 0x0042 }
    L_0x005c:
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        goto L_0x000c;	 Catch:{ all -> 0x0042 }
    L_0x005e:
        r0 = move-exception;	 Catch:{ all -> 0x0042 }
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x0060:
        r0 = r4;	 Catch:{ all -> 0x0042 }
        goto L_0x004d;	 Catch:{ all -> 0x0042 }
    L_0x0062:
        r0 = com.whatsapp.t7.a(r7);	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x006a;	 Catch:{ all -> 0x0042 }
    L_0x0068:
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        goto L_0x000c;	 Catch:{ all -> 0x0042 }
    L_0x006a:
        r0 = r10.b;	 Catch:{ all -> 0x0042 }
        r2 = r7.c;	 Catch:{ all -> 0x0042 }
        r0 = r0.get(r2);	 Catch:{ all -> 0x0042 }
        r0 = (com.whatsapp.sf) r0;	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x0093;
    L_0x0076:
        r2 = com.whatsapp.sf.f(r0);	 Catch:{ IOException -> 0x008f }
        if (r2 == 0) goto L_0x0093;
    L_0x007c:
        r2 = com.whatsapp.sf.f(r0);	 Catch:{ IOException -> 0x0091 }
        r2 = r2.e;	 Catch:{ IOException -> 0x0091 }
        r2 = r7.equals(r2);	 Catch:{ IOException -> 0x0091 }
        if (r2 == 0) goto L_0x0093;
    L_0x0088:
        r0 = com.whatsapp.sf.f(r0);	 Catch:{ all -> 0x0042 }
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        goto L_0x000c;
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x0093:
        r2 = new com.whatsapp.protocol.b;	 Catch:{ all -> 0x0042 }
        r2.<init>(r7);	 Catch:{ all -> 0x0042 }
        r0 = 8;
        r0 = r11.getInt(r0);	 Catch:{ IOException -> 0x0184 }
        r0 = (byte) r0;	 Catch:{ IOException -> 0x0184 }
        r2.j = r0;	 Catch:{ IOException -> 0x0184 }
        r0 = r2.j;	 Catch:{ IOException -> 0x0184 }
        if (r0 == r3) goto L_0x00b2;	 Catch:{ IOException -> 0x0184 }
    L_0x00a5:
        r0 = r2.j;	 Catch:{ IOException -> 0x0184 }
        r7 = 5;
        if (r0 == r7) goto L_0x00b2;
    L_0x00aa:
        r0 = r2.j;	 Catch:{ IOException -> 0x0186 }
        if (r0 == r9) goto L_0x00b2;
    L_0x00ae:
        r0 = r2.j;	 Catch:{ IOException -> 0x0188 }
        if (r0 != r8) goto L_0x018e;
    L_0x00b2:
        r0 = 19;
        r0 = r11.getBlob(r0);	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x00c2;
    L_0x00ba:
        r2.b(r0);	 Catch:{ IOException -> 0x018a }
        r0 = 1;	 Catch:{ IOException -> 0x018a }
        r2.O = r0;	 Catch:{ IOException -> 0x018a }
        if (r5 == 0) goto L_0x00ca;
    L_0x00c2:
        r0 = 4;
        r0 = r11.getString(r0);	 Catch:{ IOException -> 0x018c }
        r2.b(r0);	 Catch:{ IOException -> 0x018c }
    L_0x00ca:
        r0 = r2.O;	 Catch:{ IOException -> 0x0198 }
        if (r0 != 0) goto L_0x00d9;	 Catch:{ IOException -> 0x0198 }
    L_0x00ce:
        r0 = r2.f();	 Catch:{ IOException -> 0x0198 }
        if (r0 != 0) goto L_0x00d9;
    L_0x00d4:
        r0 = "";	 Catch:{ IOException -> 0x019a }
        r2.b(r0);	 Catch:{ IOException -> 0x019a }
    L_0x00d9:
        r0 = 3;
        r0 = r11.getInt(r0);	 Catch:{ IOException -> 0x019c }
        if (r0 != r8) goto L_0x019e;
    L_0x00e0:
        r0 = r3;
    L_0x00e1:
        r2.l = r0;	 Catch:{ all -> 0x0042 }
        r0 = 2;	 Catch:{ all -> 0x0042 }
        r0 = r11.getInt(r0);	 Catch:{ all -> 0x0042 }
        r2.a = r0;	 Catch:{ all -> 0x0042 }
        r0 = 5;	 Catch:{ all -> 0x0042 }
        r8 = r11.getLong(r0);	 Catch:{ all -> 0x0042 }
        r2.D = r8;	 Catch:{ all -> 0x0042 }
        r0 = 6;	 Catch:{ all -> 0x0042 }
        r0 = r11.getString(r0);	 Catch:{ all -> 0x0042 }
        r2.t = r0;	 Catch:{ all -> 0x0042 }
        r0 = 7;	 Catch:{ all -> 0x0042 }
        r0 = r11.getString(r0);	 Catch:{ all -> 0x0042 }
        r2.s = r0;	 Catch:{ all -> 0x0042 }
        r0 = 9;	 Catch:{ all -> 0x0042 }
        r8 = r11.getLong(r0);	 Catch:{ all -> 0x0042 }
        r2.k = r8;	 Catch:{ all -> 0x0042 }
        r0 = 10;	 Catch:{ all -> 0x0042 }
        r0 = r11.getString(r0);	 Catch:{ all -> 0x0042 }
        r2.H = r0;	 Catch:{ all -> 0x0042 }
        r0 = 11;	 Catch:{ all -> 0x0042 }
        r0 = r11.getString(r0);	 Catch:{ all -> 0x0042 }
        r2.v = r0;	 Catch:{ all -> 0x0042 }
        r0 = 12;	 Catch:{ all -> 0x0042 }
        r0 = r11.getString(r0);	 Catch:{ all -> 0x0042 }
        r2.z = r0;	 Catch:{ all -> 0x0042 }
        r0 = 13;	 Catch:{ all -> 0x0042 }
        r0 = r11.getInt(r0);	 Catch:{ all -> 0x0042 }
        r2.p = r0;	 Catch:{ all -> 0x0042 }
        r0 = 14;	 Catch:{ all -> 0x0042 }
        r0 = r11.getInt(r0);	 Catch:{ all -> 0x0042 }
        r2.w = r0;	 Catch:{ all -> 0x0042 }
        r0 = 15;	 Catch:{ all -> 0x0042 }
        r8 = r11.getDouble(r0);	 Catch:{ all -> 0x0042 }
        r2.K = r8;	 Catch:{ all -> 0x0042 }
        r0 = 16;	 Catch:{ all -> 0x0042 }
        r8 = r11.getDouble(r0);	 Catch:{ all -> 0x0042 }
        r2.G = r8;	 Catch:{ all -> 0x0042 }
        r0 = 18;	 Catch:{ all -> 0x0042 }
        r0 = r11.getString(r0);	 Catch:{ all -> 0x0042 }
        r2.F = r0;	 Catch:{ all -> 0x0042 }
        r0 = 20;	 Catch:{ all -> 0x0042 }
        r0 = r11.getInt(r0);	 Catch:{ all -> 0x0042 }
        r2.y = r0;	 Catch:{ all -> 0x0042 }
        r0 = 21;	 Catch:{ all -> 0x0042 }
        r0 = r11.getString(r0);	 Catch:{ all -> 0x0042 }
        r2.m = r0;	 Catch:{ all -> 0x0042 }
        r0 = 17;	 Catch:{ all -> 0x0042 }
        r0 = r11.getBlob(r0);	 Catch:{ all -> 0x0042 }
        if (r0 != 0) goto L_0x0164;
    L_0x015f:
        r3 = 0;
        r2.A = r3;	 Catch:{ IOException -> 0x01a1 }
        if (r5 == 0) goto L_0x0179;
    L_0x0164:
        r3 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x01da, ClassNotFoundException -> 0x01a8 }
        r4 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x01da, ClassNotFoundException -> 0x01a8 }
        r4.<init>(r0);	 Catch:{ IOException -> 0x01da, ClassNotFoundException -> 0x01a8 }
        r3.<init>(r4);	 Catch:{ IOException -> 0x01da, ClassNotFoundException -> 0x01a8 }
        r0 = r3.readObject();	 Catch:{ IOException -> 0x01dc, ClassNotFoundException -> 0x01d7, all -> 0x01d4 }
        r2.A = r0;	 Catch:{ IOException -> 0x01dc, ClassNotFoundException -> 0x01d7, all -> 0x01d4 }
        if (r3 == 0) goto L_0x0179;
    L_0x0176:
        r3.close();	 Catch:{ IOException -> 0x01a3 }
    L_0x0179:
        r0 = r10.S;	 Catch:{ all -> 0x0042 }
        r1 = r2.e;	 Catch:{ all -> 0x0042 }
        r0.put(r1, r2);	 Catch:{ all -> 0x0042 }
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        r0 = r2;
        goto L_0x000c;
    L_0x0184:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0186 }
    L_0x0186:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0188 }
    L_0x0188:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x018a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x018c }
    L_0x018c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x018e:
        r0 = 4;	 Catch:{ all -> 0x0042 }
        r0 = r11.getString(r0);	 Catch:{ all -> 0x0042 }
        r2.b(r0);	 Catch:{ all -> 0x0042 }
        goto L_0x00ca;
    L_0x0198:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x019a }
    L_0x019a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x019c:
        r0 = move-exception;	 Catch:{ all -> 0x0042 }
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x019e:
        r0 = r4;	 Catch:{ all -> 0x0042 }
        goto L_0x00e1;	 Catch:{ all -> 0x0042 }
    L_0x01a1:
        r0 = move-exception;	 Catch:{ all -> 0x0042 }
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x01a3:
        r0 = move-exception;	 Catch:{ all -> 0x0042 }
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0042 }
        goto L_0x0179;
    L_0x01a8:
        r0 = move-exception;
    L_0x01a9:
        com.whatsapp.util.Log.c(r0);	 Catch:{ IOException -> 0x01c2 }
        r0 = r2.j;	 Catch:{ IOException -> 0x01c2 }
        if (r0 == 0) goto L_0x01b7;	 Catch:{ IOException -> 0x01c2 }
    L_0x01b0:
        r0 = new com.whatsapp.MediaData;	 Catch:{ IOException -> 0x01c2 }
        r0.<init>();	 Catch:{ IOException -> 0x01c2 }
        r2.A = r0;	 Catch:{ IOException -> 0x01c2 }
    L_0x01b7:
        if (r1 == 0) goto L_0x0179;
    L_0x01b9:
        r1.close();	 Catch:{ IOException -> 0x01bd, ClassNotFoundException -> 0x01cb }
        goto L_0x0179;
    L_0x01bd:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0042 }
        goto L_0x0179;
    L_0x01c2:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x01c4 }
    L_0x01c4:
        r0 = move-exception;
    L_0x01c5:
        if (r1 == 0) goto L_0x01ca;
    L_0x01c7:
        r1.close();	 Catch:{ IOException -> 0x01cf, ClassNotFoundException -> 0x01cd }
    L_0x01ca:
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x01cb:
        r0 = move-exception;	 Catch:{ all -> 0x0042 }
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x01cd:
        r0 = move-exception;	 Catch:{ all -> 0x0042 }
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x01cf:
        r1 = move-exception;	 Catch:{ all -> 0x0042 }
        com.whatsapp.util.Log.c(r1);	 Catch:{ all -> 0x0042 }
        goto L_0x01ca;
    L_0x01d4:
        r0 = move-exception;
        r1 = r3;
        goto L_0x01c5;
    L_0x01d7:
        r0 = move-exception;
        r1 = r3;
        goto L_0x01a9;
    L_0x01da:
        r0 = move-exception;
        goto L_0x01a9;
    L_0x01dc:
        r0 = move-exception;
        r1 = r3;
        goto L_0x01a9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(android.database.Cursor, java.lang.String):com.whatsapp.protocol.b");
    }

    public Boolean a(boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        if (a54.I()) {
            synchronized (this.i) {
                try {
                    b(Q, U[423]);
                    wv.c(this.i);
                    wv.b(this.i);
                    this.i.close();
                    b(Q, U[424]);
                    if (z3) {
                        boolean p = p();
                        if (!p && this.J.getSharedPreferences(U[425], 0).getBoolean(U[428], false)) {
                            f(Q);
                        }
                        al.a(App.p, com.whatsapp.fieldstats.y.DATABASE_INTEGRITY_CHECK_RESULT, Boolean.valueOf(p));
                    }
                    try {
                        z4 = d(z2);
                        if (z) {
                            J();
                        }
                    } catch (Exception e) {
                        throw e;
                    } catch (Exception e2) {
                        Log.w(U[426] + e2.toString());
                    }
                    this.i.getWritableDatabase();
                    y();
                } catch (Exception e22) {
                    throw e22;
                } catch (Throwable th) {
                }
            }
            return Boolean.valueOf(z4);
        }
        try {
            Log.i(U[427]);
            return null;
        } catch (Exception e222) {
            throw e222;
        }
    }

    public void a(b bVar) {
        a(bVar, true, -1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.database.sqlite.SQLiteDatabase r16, com.whatsapp.protocol.b r17, long r18) {
        /*
        r15_this = this;
        r6 = com.whatsapp.m3.d;
        r0 = r17;
        r2 = r0.e;
        r7 = r2.c;
        r8 = new android.content.ContentValues;
        r2 = 2;
        r8.<init>(r2);
        r2 = U;	 Catch:{ IllegalStateException -> 0x0250 }
        r3 = 315; // 0x13b float:4.41E-43 double:1.556E-321;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0250 }
        r3 = java.lang.Long.valueOf(r18);	 Catch:{ IllegalStateException -> 0x0250 }
        r8.put(r2, r3);	 Catch:{ IllegalStateException -> 0x0250 }
        r0 = r17;
        r2 = r0.a;	 Catch:{ IllegalStateException -> 0x0250 }
        r3 = 13;
        if (r2 != r3) goto L_0x0030;
    L_0x0023:
        r2 = U;	 Catch:{ IllegalStateException -> 0x0250 }
        r3 = 318; // 0x13e float:4.46E-43 double:1.57E-321;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0250 }
        r3 = java.lang.Long.valueOf(r18);	 Catch:{ IllegalStateException -> 0x0250 }
        r8.put(r2, r3);	 Catch:{ IllegalStateException -> 0x0250 }
    L_0x0030:
        r2 = r15.b;
        r2 = r2.get(r7);
        r2 = (com.whatsapp.sf) r2;
        if (r2 == 0) goto L_0x0044;
    L_0x003a:
        r4 = com.whatsapp.sf.h(r2);	 Catch:{ IllegalStateException -> 0x0252 }
        r10 = 0;
        r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r3 != 0) goto L_0x0055;
    L_0x0044:
        r3 = U;	 Catch:{ IllegalStateException -> 0x0252 }
        r4 = 320; // 0x140 float:4.48E-43 double:1.58E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0252 }
        r4 = 1;
        r4 = r18 - r4;
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ IllegalStateException -> 0x0252 }
        r8.put(r3, r4);	 Catch:{ IllegalStateException -> 0x0252 }
    L_0x0055:
        r0 = r17;
        r3 = r0.a;	 Catch:{ IllegalStateException -> 0x0254 }
        r4 = 6;
        if (r3 != r4) goto L_0x00a7;
    L_0x005c:
        r0 = r17;
        r4 = r0.k;	 Catch:{ IllegalStateException -> 0x0256 }
        r10 = 9;
        r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r3 == 0) goto L_0x0070;
    L_0x0066:
        r0 = r17;
        r4 = r0.k;	 Catch:{ IllegalStateException -> 0x0258 }
        r10 = 11;
        r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r3 != 0) goto L_0x0090;
    L_0x0070:
        r3 = U;	 Catch:{ IllegalStateException -> 0x025a }
        r4 = 316; // 0x13c float:4.43E-43 double:1.56E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x025a }
        r4 = r17.f();	 Catch:{ IllegalStateException -> 0x025a }
        r8.put(r3, r4);	 Catch:{ IllegalStateException -> 0x025a }
        r3 = U;	 Catch:{ IllegalStateException -> 0x025a }
        r4 = 324; // 0x144 float:4.54E-43 double:1.6E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x025a }
        r0 = r17;
        r4 = r0.D;	 Catch:{ IllegalStateException -> 0x025a }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ IllegalStateException -> 0x025a }
        r8.put(r3, r4);	 Catch:{ IllegalStateException -> 0x025a }
        if (r6 == 0) goto L_0x00a7;
    L_0x0090:
        r0 = r17;
        r4 = r0.k;	 Catch:{ IllegalStateException -> 0x025c }
        r10 = 1;
        r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r3 != 0) goto L_0x00a7;
    L_0x009a:
        r3 = U;	 Catch:{ IllegalStateException -> 0x025c }
        r4 = 319; // 0x13f float:4.47E-43 double:1.576E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x025c }
        r4 = r17.f();	 Catch:{ IllegalStateException -> 0x025c }
        r8.put(r3, r4);	 Catch:{ IllegalStateException -> 0x025c }
    L_0x00a7:
        r0 = r17;
        r3 = r0.l;	 Catch:{ IllegalStateException -> 0x025e }
        if (r3 == 0) goto L_0x0264;
    L_0x00ad:
        r0 = r17;
        r3 = r0.e;	 Catch:{ IllegalStateException -> 0x0260 }
        r3 = r3.b;	 Catch:{ IllegalStateException -> 0x0260 }
        if (r3 == 0) goto L_0x0264;
    L_0x00b5:
        r0 = r17;
        r3 = r0.e;	 Catch:{ IllegalStateException -> 0x0262 }
        r3 = r3.c;	 Catch:{ IllegalStateException -> 0x0262 }
        r3 = com.whatsapp.m8.b(r3);	 Catch:{ IllegalStateException -> 0x0262 }
        if (r3 != 0) goto L_0x0264;
    L_0x00c1:
        r3 = 1;
        r4 = r3;
    L_0x00c3:
        if (r2 == 0) goto L_0x00df;
    L_0x00c5:
        r3 = com.whatsapp.sf.g(r2);	 Catch:{ IllegalStateException -> 0x0268 }
        if (r3 == 0) goto L_0x00df;
    L_0x00cb:
        if (r4 != 0) goto L_0x00df;
    L_0x00cd:
        r3 = 0;
        com.whatsapp.sf.a(r2, r3);	 Catch:{ IllegalStateException -> 0x026a }
        r3 = U;	 Catch:{ IllegalStateException -> 0x026a }
        r5 = 321; // 0x141 float:4.5E-43 double:1.586E-321;
        r3 = r3[r5];	 Catch:{ IllegalStateException -> 0x026a }
        r5 = 0;
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ IllegalStateException -> 0x026a }
        r8.put(r3, r5);	 Catch:{ IllegalStateException -> 0x026a }
    L_0x00df:
        r5 = 1;
        r0 = r17;
        r3 = r0.a;	 Catch:{ IllegalStateException -> 0x026c }
        r9 = 6;
        if (r3 != r9) goto L_0x0294;
    L_0x00e7:
        r0 = r17;
        r10 = r0.k;	 Catch:{ IllegalStateException -> 0x026e }
        r12 = 11;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 == 0) goto L_0x0294;
    L_0x00f1:
        r0 = r17;
        r10 = r0.k;	 Catch:{ IllegalStateException -> 0x0270 }
        r12 = 2;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 == 0) goto L_0x0294;
    L_0x00fb:
        r0 = r17;
        r10 = r0.k;	 Catch:{ IllegalStateException -> 0x0272 }
        r12 = 3;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 == 0) goto L_0x0294;
    L_0x0105:
        r0 = r17;
        r10 = r0.k;	 Catch:{ IllegalStateException -> 0x0274 }
        r12 = 9;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 == 0) goto L_0x0294;
    L_0x010f:
        r0 = r17;
        r10 = r0.k;	 Catch:{ IllegalStateException -> 0x0276 }
        r12 = 1;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 == 0) goto L_0x0294;
    L_0x0119:
        r0 = r17;
        r10 = r0.k;	 Catch:{ IllegalStateException -> 0x0278 }
        r12 = 12;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 == 0) goto L_0x012d;
    L_0x0123:
        r0 = r17;
        r10 = r0.k;	 Catch:{ IllegalStateException -> 0x0278 }
        r12 = 14;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 != 0) goto L_0x0291;
    L_0x012d:
        r0 = r17;
        r3 = r0.A;
        r3 = (java.util.Vector) r3;
        r9 = com.whatsapp.App.P;
        r9 = r9.d();
        r9 = r9.e;
        r3 = r3.contains(r9);
        if (r3 != 0) goto L_0x028e;
    L_0x0141:
        r3 = 0;
    L_0x0142:
        if (r6 == 0) goto L_0x016d;
    L_0x0144:
        r0 = r17;
        r10 = r0.k;	 Catch:{ IllegalStateException -> 0x027a }
        r12 = 4;
        r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r5 == 0) goto L_0x0158;
    L_0x014e:
        r0 = r17;
        r10 = r0.k;	 Catch:{ IllegalStateException -> 0x027c }
        r12 = 7;
        r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r5 != 0) goto L_0x0167;
    L_0x0158:
        r5 = com.whatsapp.App.P;	 Catch:{ IllegalStateException -> 0x027c }
        r0 = r17;
        r9 = r0.F;	 Catch:{ IllegalStateException -> 0x027c }
        r5 = r5.h(r9);	 Catch:{ IllegalStateException -> 0x027c }
        if (r5 != 0) goto L_0x016d;
    L_0x0164:
        r3 = 0;
        if (r6 == 0) goto L_0x016d;
    L_0x0167:
        r3 = 0;
        if (r6 == 0) goto L_0x016d;
    L_0x016a:
        if (r4 == 0) goto L_0x016d;
    L_0x016c:
        r3 = 0;
    L_0x016d:
        r4 = com.whatsapp.App.aa;	 Catch:{ IllegalStateException -> 0x027e }
        r5 = 3;
        if (r4 != r5) goto L_0x0195;
    L_0x0172:
        r0 = r17;
        r4 = r0.e;	 Catch:{ IllegalStateException -> 0x0280 }
        r4 = r4.b;	 Catch:{ IllegalStateException -> 0x0280 }
        if (r4 != 0) goto L_0x0195;
    L_0x017a:
        r0 = r17;
        r4 = r0.e;	 Catch:{ IllegalStateException -> 0x0282 }
        r4 = r4.c;	 Catch:{ IllegalStateException -> 0x0282 }
        r4 = com.whatsapp.bd.b(r4);	 Catch:{ IllegalStateException -> 0x0282 }
        if (r4 == 0) goto L_0x0195;
    L_0x0186:
        r4 = com.whatsapp.App.p;	 Catch:{ IllegalStateException -> 0x0282 }
        r0 = r17;
        r5 = r0.e;	 Catch:{ IllegalStateException -> 0x0282 }
        r5 = r5.c;	 Catch:{ IllegalStateException -> 0x0282 }
        r4 = com.whatsapp.notification.t.b(r4, r5);	 Catch:{ IllegalStateException -> 0x0282 }
        if (r4 != 0) goto L_0x0195;
    L_0x0194:
        r3 = 0;
    L_0x0195:
        if (r3 == 0) goto L_0x01a8;
    L_0x0197:
        r4 = U;	 Catch:{ IllegalStateException -> 0x0284 }
        r5 = 322; // 0x142 float:4.51E-43 double:1.59E-321;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0284 }
        r0 = r17;
        r10 = r0.D;	 Catch:{ IllegalStateException -> 0x0284 }
        r5 = java.lang.Long.valueOf(r10);	 Catch:{ IllegalStateException -> 0x0284 }
        r8.put(r4, r5);	 Catch:{ IllegalStateException -> 0x0284 }
    L_0x01a8:
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r4[r5] = r7;
        r5 = U;
        r6 = 325; // 0x145 float:4.55E-43 double:1.606E-321;
        r5 = r5[r6];
        r6 = U;
        r9 = 317; // 0x13d float:4.44E-43 double:1.566E-321;
        r6 = r6[r9];
        r0 = r16;
        r4 = r0.update(r5, r8, r6, r4);
        if (r4 != 0) goto L_0x01f8;
    L_0x01c2:
        r4 = U;
        r5 = 314; // 0x13a float:4.4E-43 double:1.55E-321;
        r4 = r4[r5];
        r8.put(r4, r7);
        r4 = U;
        r5 = 323; // 0x143 float:4.53E-43 double:1.596E-321;
        r4 = r4[r5];
        r5 = 0;
        r0 = r16;
        r4 = r0.insert(r4, r5, r8);
        r8 = -1;
        r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r4 != 0) goto L_0x01f8;
    L_0x01de:
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0286 }
        r4.<init>();	 Catch:{ IllegalStateException -> 0x0286 }
        r5 = U;	 Catch:{ IllegalStateException -> 0x0286 }
        r6 = 312; // 0x138 float:4.37E-43 double:1.54E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x0286 }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x0286 }
        r4 = r4.append(r7);	 Catch:{ IllegalStateException -> 0x0286 }
        r4 = r4.toString();	 Catch:{ IllegalStateException -> 0x0286 }
        com.whatsapp.util.Log.e(r4);	 Catch:{ IllegalStateException -> 0x0286 }
    L_0x01f8:
        if (r2 != 0) goto L_0x021e;
    L_0x01fa:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = U;
        r5 = 313; // 0x139 float:4.39E-43 double:1.546E-321;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.append(r7);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = new com.whatsapp.sf;
        r2.<init>();
        r4 = r15.b;
        r4.put(r7, r2);
    L_0x021e:
        if (r3 == 0) goto L_0x0227;
    L_0x0220:
        r0 = r17;
        r4 = r0.D;	 Catch:{ IllegalStateException -> 0x0288 }
        com.whatsapp.sf.b(r2, r4);	 Catch:{ IllegalStateException -> 0x0288 }
    L_0x0227:
        r0 = r17;
        com.whatsapp.sf.a(r2, r0);	 Catch:{ IllegalStateException -> 0x028a }
        r0 = r18;
        com.whatsapp.sf.d(r2, r0);	 Catch:{ IllegalStateException -> 0x028a }
        r0 = r17;
        r3 = r0.a;	 Catch:{ IllegalStateException -> 0x028a }
        r4 = 13;
        if (r3 != r4) goto L_0x023e;
    L_0x0239:
        r0 = r18;
        com.whatsapp.sf.a(r2, r0);	 Catch:{ IllegalStateException -> 0x028a }
    L_0x023e:
        r4 = com.whatsapp.sf.h(r2);	 Catch:{ IllegalStateException -> 0x028c }
        r6 = 0;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x024f;
    L_0x0248:
        r4 = 1;
        r4 = r18 - r4;
        com.whatsapp.sf.e(r2, r4);	 Catch:{ IllegalStateException -> 0x028c }
    L_0x024f:
        return;
    L_0x0250:
        r2 = move-exception;
        throw r2;
    L_0x0252:
        r2 = move-exception;
        throw r2;
    L_0x0254:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0256 }
    L_0x0256:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0258 }
    L_0x0258:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x025a }
    L_0x025a:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x025c }
    L_0x025c:
        r2 = move-exception;
        throw r2;
    L_0x025e:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0260 }
    L_0x0260:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0262 }
    L_0x0262:
        r2 = move-exception;
        throw r2;
    L_0x0264:
        r3 = 0;
        r4 = r3;
        goto L_0x00c3;
    L_0x0268:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x026a }
    L_0x026a:
        r2 = move-exception;
        throw r2;
    L_0x026c:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x026e }
    L_0x026e:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0270 }
    L_0x0270:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0272 }
    L_0x0272:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0274 }
    L_0x0274:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0276 }
    L_0x0276:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0278 }
    L_0x0278:
        r2 = move-exception;
        throw r2;
    L_0x027a:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x027c }
    L_0x027c:
        r2 = move-exception;
        throw r2;
    L_0x027e:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0280 }
    L_0x0280:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0282 }
    L_0x0282:
        r2 = move-exception;
        throw r2;
    L_0x0284:
        r2 = move-exception;
        throw r2;
    L_0x0286:
        r2 = move-exception;
        throw r2;
    L_0x0288:
        r2 = move-exception;
        throw r2;
    L_0x028a:
        r2 = move-exception;
        throw r2;
    L_0x028c:
        r2 = move-exception;
        throw r2;
    L_0x028e:
        r3 = r5;
        goto L_0x0142;
    L_0x0291:
        r3 = r5;
        goto L_0x0144;
    L_0x0294:
        r3 = r5;
        goto L_0x016a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(android.database.sqlite.SQLiteDatabase, com.whatsapp.protocol.b, long):void");
    }

    public void x() {
        Log.i(U[414]);
        r();
        Message.obtain(this.K.b, 8).sendToTarget();
    }

    public void a(ase com_whatsapp_ase) {
        try {
            this.y.registerObserver(com_whatsapp_ase);
        } catch (IllegalStateException e) {
        }
    }

    public void a(Collection collection) {
        int i = m3.d;
        Log.i(U[576] + Arrays.deepToString(Collections.list(Collections.enumeration(collection)).toArray()));
        synchronized (this.i) {
            try {
                SQLiteDatabase writableDatabase = this.i.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (cs csVar : collection) {
                        writableDatabase.delete(U[579], U[581], new String[]{csVar.c()});
                        for (l6 l6Var : csVar.b()) {
                            String str;
                            int i2;
                            ContentValues contentValues = new ContentValues(4);
                            contentValues.put(U[580], csVar.c());
                            String str2 = U[577];
                            if (l6Var.a()) {
                                str = "";
                            } else {
                                str = l6Var.d;
                            }
                            contentValues.put(str2, str);
                            contentValues.put(U[583], Integer.valueOf(l6Var.c ? 1 : 0));
                            str = U[578];
                            if (l6Var.a) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            contentValues.put(str, Integer.valueOf(i2));
                            writableDatabase.insert(U[582], null, contentValues);
                            if (i != 0) {
                                break;
                                continue;
                            }
                        }
                        if (i != 0) {
                            break;
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (writableDatabase.inTransaction()) {
                        writableDatabase.endTransaction();
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                } catch (IllegalStateException e22) {
                    throw e22;
                } catch (Throwable th) {
                    if (writableDatabase.inTransaction()) {
                        writableDatabase.endTransaction();
                    }
                }
            } catch (IllegalStateException e222) {
                throw e222;
            } catch (Throwable th2) {
            }
        }
    }

    static void a(l7 l7Var, String str, String str2, Long l) {
        l7Var.a(str, str2, l);
    }

    public void L() {
        synchronized (this.i) {
            this.i.close();
            g();
            Log.i(U[361] + Q.delete());
        }
    }

    private int a(File file) {
        SQLiteDatabase openDatabase;
        Throwable e;
        Throwable th;
        int i = -1;
        Cursor cursor = null;
        try {
            openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 16);
            try {
                cursor = openDatabase.rawQuery(U[412], null);
                if (cursor == null) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e2) {
                            throw e2;
                        }
                    }
                    if (openDatabase != null) {
                        try {
                            openDatabase.close();
                        } catch (Exception e22) {
                            throw e22;
                        }
                    }
                } else if (cursor.moveToNext()) {
                    i = cursor.getInt(0) - 1;
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e222) {
                            throw e222;
                        }
                    }
                    if (openDatabase != null) {
                        try {
                            openDatabase.close();
                        } catch (Exception e2222) {
                            throw e2222;
                        }
                    }
                } else {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e22222) {
                            throw e22222;
                        }
                    }
                    if (openDatabase != null) {
                        try {
                            openDatabase.close();
                        } catch (Exception e222222) {
                            throw e222222;
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
                try {
                    Log.b(U[413] + file.getAbsolutePath(), e);
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e2222222) {
                            throw e2222222;
                        }
                    }
                    if (openDatabase != null) {
                        try {
                            openDatabase.close();
                        } catch (Exception e22222222) {
                            throw e22222222;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e222222222) {
                            throw e222222222;
                        }
                    }
                    if (openDatabase != null) {
                        try {
                            openDatabase.close();
                        } catch (Exception e2222222222) {
                            throw e2222222222;
                        }
                    }
                    throw th;
                }
                return i;
            }
        } catch (Exception e4) {
            e = e4;
            openDatabase = null;
            Log.b(U[413] + file.getAbsolutePath(), e);
            if (cursor != null) {
                cursor.close();
            }
            if (openDatabase != null) {
                openDatabase.close();
            }
            return i;
        } catch (Throwable th3) {
            th = th3;
            openDatabase = null;
            if (cursor != null) {
                cursor.close();
            }
            if (openDatabase != null) {
                openDatabase.close();
            }
            throw th;
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.whatsapp.protocol.b i(com.whatsapp.protocol.b r7) {
        /*
        r6_this = this;
        r0 = r7.e;	 Catch:{ IllegalStateException -> 0x0062 }
        r0 = r0.b;	 Catch:{ IllegalStateException -> 0x0062 }
        if (r0 != 0) goto L_0x0076;
    L_0x0006:
        r0 = r7.t;	 Catch:{ IllegalStateException -> 0x0064 }
        if (r0 == 0) goto L_0x0076;
    L_0x000a:
        r0 = r7.j;	 Catch:{ IllegalStateException -> 0x0066 }
        r1 = 1;
        if (r0 == r1) goto L_0x0019;
    L_0x000f:
        r0 = r7.j;	 Catch:{ IllegalStateException -> 0x0068 }
        r1 = 2;
        if (r0 == r1) goto L_0x0019;
    L_0x0014:
        r0 = r7.j;	 Catch:{ IllegalStateException -> 0x0068 }
        r1 = 3;
        if (r0 != r1) goto L_0x0076;
    L_0x0019:
        r0 = r7.e;
        r1 = r6.b(r0);
        if (r1 == 0) goto L_0x0076;
    L_0x0021:
        r2 = r1.D;	 Catch:{ IllegalStateException -> 0x006a }
        r4 = r7.D;	 Catch:{ IllegalStateException -> 0x006a }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x0076;
    L_0x0029:
        r2 = r1.M;	 Catch:{ IllegalStateException -> 0x006c }
        r4 = r7.D;	 Catch:{ IllegalStateException -> 0x006c }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x0076;
    L_0x0031:
        r0 = r7.t;	 Catch:{ IllegalStateException -> 0x006e }
        r2 = r1.t;	 Catch:{ IllegalStateException -> 0x006e }
        r0 = r0.equals(r2);	 Catch:{ IllegalStateException -> 0x006e }
        if (r0 != 0) goto L_0x0076;
    L_0x003b:
        r0 = r7.t;	 Catch:{ IllegalStateException -> 0x0070 }
        r1.t = r0;	 Catch:{ IllegalStateException -> 0x0070 }
        r2 = r7.D;	 Catch:{ IllegalStateException -> 0x0070 }
        r1.M = r2;	 Catch:{ IllegalStateException -> 0x0070 }
        r0 = r1.a;	 Catch:{ IllegalStateException -> 0x0070 }
        r2 = 11;
        if (r0 == r2) goto L_0x004f;
    L_0x0049:
        r0 = r1.a;	 Catch:{ IllegalStateException -> 0x0072 }
        r2 = 12;
        if (r0 != r2) goto L_0x0052;
    L_0x004f:
        r0 = 0;
        r1.a = r0;	 Catch:{ IllegalStateException -> 0x0072 }
    L_0x0052:
        r0 = -1;
        r6.a(r1, r0);
        r0 = r7.A;
        r0 = (com.whatsapp.MediaData) r0;
        if (r0 == 0) goto L_0x0076;
    L_0x005c:
        r0 = r0.transferred;	 Catch:{ IllegalStateException -> 0x0074 }
        if (r0 != 0) goto L_0x0076;
    L_0x0060:
        r0 = r1;
    L_0x0061:
        return r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0064 }
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0068 }
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r0 = 0;
        goto L_0x0061;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.i(com.whatsapp.protocol.b):com.whatsapp.protocol.b");
    }

    static boolean a(l7 l7Var, b bVar, int i) {
        return l7Var.a(bVar, i);
    }

    private long b(b bVar) {
        long j = 0;
        SQLiteStatement sQLiteStatement = this.A;
        try {
            long j2;
            sQLiteStatement.bindString(1, bVar.e.c);
            if (bVar.e.b) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            try {
                sQLiteStatement.bindLong(2, j2);
                sQLiteStatement.bindString(3, bVar.e.a);
                sQLiteStatement.bindLong(4, (long) bVar.a);
                if (bVar.l) {
                    j = 2;
                }
                sQLiteStatement.bindLong(5, j);
                a(bVar, sQLiteStatement, 22, 6);
                sQLiteStatement.bindLong(7, bVar.D);
                wv.a(8, bVar.t, sQLiteStatement);
                wv.a(9, bVar.s, sQLiteStatement);
                sQLiteStatement.bindLong(10, (long) bVar.j);
                sQLiteStatement.bindLong(11, bVar.k);
                wv.a(12, bVar.H, sQLiteStatement);
                wv.a(13, bVar.v, sQLiteStatement);
                wv.a(14, bVar.z, sQLiteStatement);
                sQLiteStatement.bindLong(15, (long) bVar.p);
                sQLiteStatement.bindLong(16, (long) bVar.w);
                sQLiteStatement.bindDouble(17, bVar.K);
                sQLiteStatement.bindDouble(18, bVar.G);
                wv.a(19, bVar.A, sQLiteStatement);
                wv.a(20, bVar.F, sQLiteStatement);
                sQLiteStatement.bindLong(21, System.currentTimeMillis());
                wv.a(23, bVar.m, sQLiteStatement);
                return sQLiteStatement.executeInsert();
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void f(String str) {
        Log.i(U[131] + str);
        r();
        Message.obtain(this.K.b, 6, str).sendToTarget();
    }

    public boolean e() {
        return this.r;
    }

    static {
        String[] strArr = new String[649];
        String str = "E\"\b\u0011;G#\nM\"A\"\u001c\u0007+K0\u0003\u000e<\u00075\rM,]#\u001c\r=\b8\u001cB!]=\u0003";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 40;
                        break;
                    case ay.f /*1*/:
                        i4 = 81;
                        break;
                    case ay.n /*2*/:
                        i4 = 111;
                        break;
                    case ay.p /*3*/:
                        i4 = 98;
                        break;
                    default:
                        i4 = 79;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006";
                    i = 1;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "E\"\b\u0011;G#\nM\"A\"\u001c\u0007+K0\u0003\u000e<\u0007\"\u0006\u0018*\u0012";
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "E\"\b\u0011;G#\nM,I=\u0003\u0011`B8\u000bB&[q\u0001\u0017#Dp";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "E\"\b\u0011;G#\nM?G!\u001a\u000e.\\4(\u0010 ]!\u001c/*[\"\u000e\u0005*[~\u000b\u0000`K$\u001d\u0011 Zq\u0006\u0011oF$\u0003\u000e";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "{\u0014#'\f|q\u0004\u00076w#\n\u000f \\40\b&L}O\u0016&E4\u001c\u0016.E!CB\"M5\u0006\u0003\u0010[8\u0015\u0007c\b#\n\u000f \\40\u0010*[>\u001a\u0010,M}O\u0016']<\r=&E0\b\u0007on\u0003 /oE4\u001c\u0011.O4\u001cB\u0018`\u0014='o\b\"\u001b\u0003;]\"RToi\u001f+B\"M5\u0006\u0003\u0010[8\u0015\u0007oa\u001fOJ{\u0004qZNo\u001f}O[c\b`_K";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "E\"\b\u0011;G#\nM?G!\u001a\u000e.\\4(\u0010 ]!\u001c/*[\"\u000e\u0005*[";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "E\"\b\u0011;G#\nM?G!\u001a\u000e.\\4(\u0010 ]!\u001c/*[\"\u000e\u0005*[~\n\u0010=G#O";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "{\u0014#'\f|q\u0004\u00076w#\n\u000f \\40\b&L}O\u0011:J;\n\u0001;\u0004q\f\u0010*I%\u0006\r!\b\u0017=-\u0002\b2\u0007\u0003;w=\u0006\u0011;\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&Lq#+\u0004mqHG\u000fJ#\u0000\u0003+K0\u001c\u0016h";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u00072\u0000\u0017!\\q";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\b;\u0006\u0006r";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\b5\n\u000e;I\u000e\u000e\u0001r";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "\b00\u0001r";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "\b5\n\u000e;I\u000e\u0002\u0016r";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\b8\u000b_";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "\b<\u001b_";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "E\"\b\u0011;G#\nM.L5@";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "[4\u0001\u0006o";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "h\"A\u0015'I%\u001c\u0003?X\u007f\u0001\u0007;";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "Z4\f\u0014o";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "E\"\b\u0011;G#\nM.L5\u0002\u0007<[0\b\u0007`E%";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "E\"\b\u0011;G#\nM<M%\f\n.\\#\n\u0003+\u0007";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "[$\r\b*K%";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006r\u0017";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "K9\u000e\u0016\u0010D8\u001c\u0016";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "K#\n\u0003;A>\u0001";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "E\"\b\u0011;G#\nM.L5\u0002\u0011(\u00072\u0007\u0003;D8\u001c\u0016`A?\u001c\u0007=\\~\t\u0003&D4\u000bB(A5R";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "K9\u000e\u0016\u0010D8\u001c\u0016";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "E\"\b\u0011;G#\nM,D4\u000e\u0010.D=\u0002\u0011([";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "{\u0014#'\f|q\u0004\u00076w8\u000bNoZ4\f\u0007&X%0\u0011*Z'\n\u0010\u0010\\8\u0002\u0007<\\0\u0002\u0012c\b#\n\u0001*A!\u001b=+M'\u0006\u0001*w%\u0006\u000f*[%\u000e\u000f?\u0004q\u001d\u0007.L\u000e\u000b\u00079A2\n=;A<\n\u0011;I<\u001fNoX=\u000e\u001b*L\u000e\u000b\u00079A2\n=;A<\n\u0011;I<\u001fB\tz\u001e\"B\"M\"\u001c\u0003(M\"O5\u0007m\u0003*B$M(0\u0010*E>\u001b\u0007\u0010B8\u000b_p\b\u0010!&oC4\u0016=)Z>\u0002=\"Ml^B\u000ef\u0015O=&LoPB";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "E\"\b\u0011;G#\nM(M%@\u0010*K4\u0006\u0012;[~\u0001\u00078M#OG<\bt\u001c";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "E\"\b\u0011;G#\nM(M%@\u0010*K4\u0006\u0012;[~\u0001\u00078M#O\f \b8\u000bB)G#OG<\bt\u001c";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "G=\u000b=?@0\u001c\n";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "F4\u0018=?@0\u001c\n";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "\\8\u0002\u0007<\\0\u0002\u0012ol\u0014<!";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c='A\"\u001b\r=Q";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "O;\u0006\u0006o\u0015qP";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "B8\u000b";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    str = "I2\u001b\u000b F";
                    i = 39;
                    i2 = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    strArr2 = strArr3;
                    str = "E\"\b\u0011;G#\nM(M%\"\u0007+A0\"\u0007<[0\b\u0007<k$\u001d\u0011 Zk";
                    i = 40;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9C=&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmqO\u000f*L8\u000e=8I\u000e\u001b\u001b?Mq\u0006\fo\u0000v]Eo\u0004qHSh\b}OE|\u000fqFB\u000ef\u0015OJ Z8\b\u000b!\b\u0018<B\u0001}\u001d#B\u0000zq\u0000\u0010&O8\u0001Cr\u0019xO#\u0001lq\u0004\u00076w#\n\u000f \\40\b&LlPB\u0000z\u0015*0oj\bO=&Lq+'\u001ck";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "l\u0014#'\u001bmq)0\u0000eq\u001d\u0007,M8\u001f\u0016<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlP";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "l\u0014#'\u001bmq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlP";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "O;\u0006\u0006";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "O;\u0006\u0006r\u0017";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "l\u0014#'\u001bmq)0\u0000eq\f\n.\\\u000e\u0003\u000b<\\q8*\nz\u0014O\t*Q\u000e\u001d\u0007\"G%\n=%A5R]";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "K9\u000e\u0016\u0010D8\u001c\u0016";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006r\u0017";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "E\"\b\u0011;G#\nM+M=\n\u0016*E\"\bM,@0\u001b\u000e&[%@\u000b![4\u001d\u0016`N0\u0006\u000e*Lq\b\u000b+\u0015";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "E4\u001c\u0011.O40\u0016.J=\n=&L";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "[>\u001d\u0016\u0010\\8\u0002\u0007<\\0\u0002\u0012";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "E>\u000b=;I6";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006r\u0017";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "E\"\b\u0011;G#\nM+M=\n\u0016*E\"\bM,@0\u001b\u000e&[%@\u000b![4\u001d\u0016`N0\u0006\u000e*Lq\b\u000b+\u0015";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "K9\u000e\u0016\u0010D8\u001c\u0016";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "K9\u000e\u0016\u0010D8\u001c\u0016";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "K9\u000e\u0016\u0010D8\u001c\u0016";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "E>\u000b=;I6";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "K9\u000e\u0016\u0010D8\u001c\u0016";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006r\u0017";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*o#\u0000\u0017?x0\u001d\u0016&K8\u001f\u0003!\\\"@";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "J#\u0000\u0003+K0\u001c\u0016";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9C=&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlPB\u000ef\u0015O\u000f*L8\u000e=8I\u000e\u001b\u001b?MmWB\u0000z\u0015*0oj\bO=&Lq+'\u001ck";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "E4\u001c\u0011.O4\u001c=$M(0\u0010*E>\u001b\u0007\u0010B8\u000b";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "E4\u001c\u0011.O4\u001c=\u0010A5";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9CB\"M\"\u001c\u0003(M\"A=&Lq.1oE4\u001c\u0011.O4\u001c=\u0010A5CB\"M\"\u001c\u0003(M\"A\t*Q\u000e\u001d\u0007\"G%\n=%A5O#\u001c\b<\n\u0011<I6\n\u0011\u0010C4\u0016==M<\u0000\u0016*w;\u0006\u0006on\u0003 /oE4\u001c\u0011.O4\u001cN,@0\u001b=#A\"\u001bB\u0018`\u0014='oE4\u001c\u0011.O4\u001cL$M(0\u0010*E>\u001b\u0007\u0010B8\u000b_,@0\u001b=#A\"\u001bL$M(0\u0010*E>\u001b\u0007\u0010B8\u000bB\u000ef\u0015O\u000f*[\"\u000e\u0005*[\u007f\u0004\u00076w7\u001d\r\"w<\n_\u007f\b\u0010!&oK9\u000e\u0016\u0010D8\u001c\u0016aD0\u001c\u0016\u0010Z4\u000e\u0006\u0010E4\u001c\u0011.O40\u0016.J=\n=&LoR\u000f*[\"\u000e\u0005*[\u007f0\u000b+\b\u0010!&oK9\u000e\u0016\u0010D8\u001c\u0016aD0\u001c\u0016\u0010Z4\u000e\u0006\u0010Z4\f\u0007&X%0\u0011*F%0\u000f*[\"\u000e\u0005*w%\u000e\u0000#M\u000e\u0006\u0006sE4\u001c\u0011.O4\u001cL\u0010A5O#\u0001lq\f\n.\\\u000e\u0003\u000b<\\\u007f\u0003\u0003<\\\u000e\u001d\u0007.L\u000e\u001d\u0007,M8\u001f\u0016\u0010[4\u0001\u0016\u0010E4\u001c\u0011.O40\u0016.J=\n=&Lo_B\u000ef\u0015O\u000f*[\"\u000e\u0005*[\u007f\u0002\u0007+A00\u0015.w%\u0016\u0012*\u0014iO#\u0001lq\u0002\u0007<[0\b\u0007<\u0006%\u0006\u000f*[%\u000e\u000f?\u0016nO-\u001dl\u0014=B\rqq\u0002\u0007<[0\b\u0007<\u0006\u000e\u0006\u0006ol\u0014<!od\u0018\"+\u001b\be_[y";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;E4\u001c\u0011.O4\u001d\u0007.L#\n\u0001*A!\u001b\u0011`B8\u000bB&[q\u0001\u0017#Dp";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i2] = str;
                    i2 = 72;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;E4\u001c\u0011.O4\u001d\u0007.L#\n\u0001*A!\u001b\u0011`a=\u0003\u0007(I=<\u0016.\\4*\u001a,M!\u001b\u000b Fq";
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i2] = str;
                    i2 = 73;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;E4\u001c\u0011.O4\u001d\u0007.L#\n\u0001*A!\u001b\u0011o";
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = "{\u0014#'\f|q\u001d\u0007)w2\u0000\u0017!\\q)0\u0000eq\u0002\u0007+A00\u0010*N\"O5\u0007m\u0003*B?I%\u0007_p";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "{\u0014#'\f|q\u0004\u00076w#\n\u000f \\40\b&L}O\u0010*K4\u0006\u0012;w5\n\u0014&K40\u0016&E4\u001c\u0016.E!CB=M0\u000b=+M'\u0006\u0001*w%\u0006\u000f*[%\u000e\u000f?\u0004q\u001f\u000e.Q4\u000b=+M'\u0006\u0001*w%\u0006\u000f*[%\u000e\u000f?\b\u0017=-\u0002\b<\n\u0011<I6\n\u0011o\u007f\u0019*0\n\b:\n\u001b\u0010Z4\u0002\r;M\u000e\u0005\u000b+\u0015nO#\u0001lq\u0004\u00076w8\u000b_p";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = "{\u0014#'\f|q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=M2\n\u000b?\\\u000e\u000b\u00079A2\n=;A<\n\u0011;I<\u001fNoZ4\u000e\u0006\u0010L4\u0019\u000b,M\u000e\u001b\u000b\"M\"\u001b\u0003\"X}O\u0012#I(\n\u0006\u0010L4\u0019\u000b,M\u000e\u001b\u000b\"M\"\u001b\u0003\"Xq)0\u0000eq\u001d\u0007,M8\u001f\u0016<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlPB\u000ef\u0015O\t*Q\u000e\u0006\u0006r\u0017";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*O#\u0000\u0017?K9\u000e\u0016<]3\u0005\u0007,\\~";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i2] = str;
                    i2 = 78;
                    str = "E\"\b\u0011;G#\nM,I=\u0003\u0011`B8\u000bB&[q\u0001\u0017#Dp";
                    i = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i2] = str;
                    str = "E\"\b\u0011;G#\nM,I=\u0003\u0011`[8\u0015\u0007u";
                    i = 78;
                    i2 = 79;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i2] = str;
                    i2 = 80;
                    strArr2 = strArr3;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9CB$M(0\u0010*E>\u001b\u0007\u0010B8\u000bB\tz\u001e\"B\"M\"\u001c\u0003(M\"O5\u0007m\u0003*B\"M5\u0006\u0003\u0010_00\u00166X4RZog\u0003+'\u001d\b\u00136B\u0010A5O&\n{\u0012O.\u0006e\u0018;Bp\u0004n";
                    i = 79;
                    break;
                case 79:
                    strArr2[i2] = str;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006";
                    i = 80;
                    i2 = 81;
                    strArr2 = strArr3;
                    break;
                case 80:
                    strArr2[i2] = str;
                    i2 = 82;
                    strArr2 = strArr3;
                    str = "E\"\b\u0011;G#\nM,I=\u0003\u0011`L3@\u0001:Z\"\u0000\u0010oA\"O\f:D=";
                    i = 81;
                    break;
                case 81:
                    strArr2[i2] = str;
                    i2 = 83;
                    str = "E\"\b\u0011;G#\nM(M%@\f*_4\u001dB!Gq\u0001\u00078M#O\u000f*[\"\u000e\u0005*[q\t\r=\b";
                    i = 82;
                    strArr2 = strArr3;
                    break;
                case 82:
                    strArr2[i2] = str;
                    i2 = 84;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9C=&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlPB\u000ef\u0015O\u000f*L8\u000e=8I\u000e\u001b\u001b?MmWB\u000ef\u0015O=&LoPB\u0000z\u0015*0oj\bO=&Lq.1\f";
                    i = 83;
                    strArr2 = strArr3;
                    break;
                case 83:
                    strArr2[i2] = str;
                    i2 = 85;
                    str = "E\"\b\u0011;G#\nM(M%@\f*_4\u001dB!Gq\u0006\u0006oN>\u001dB";
                    i = 84;
                    strArr2 = strArr3;
                    break;
                case 84:
                    strArr2[i2] = str;
                    i2 = 86;
                    str = "\b?\n\u0007+\b%\u001d\u0003![2\u0000\u0006*";
                    i = 85;
                    strArr2 = strArr3;
                    break;
                case 85:
                    strArr2[i2] = str;
                    i2 = 87;
                    str = "\b0\u001a\u0016 Z4\u001b\u00106\b5\u0006\u0011.J=\n\u0006";
                    i = 86;
                    strArr2 = strArr3;
                    break;
                case 86:
                    strArr2[i2] = str;
                    i2 = 88;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\u0007\"\u0004\u000b?\b";
                    i = 87;
                    strArr2 = strArr3;
                    break;
                case 87:
                    strArr2[i2] = str;
                    i2 = 89;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\b";
                    i = 88;
                    strArr2 = strArr3;
                    break;
                case 88:
                    strArr2[i2] = str;
                    i2 = 90;
                    str = "\b0\u001a\u0016 Z4\u001b\u00106\b5\u0006\u0011.J=\n\u0006";
                    i = 89;
                    strArr2 = strArr3;
                    break;
                case 89:
                    strArr2[i2] = str;
                    i2 = 91;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\u0007\"\u0004\u000b?\b";
                    i = 90;
                    strArr2 = strArr3;
                    break;
                case 90:
                    strArr2[i2] = str;
                    i2 = 92;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\u0007\"\u0004\u000b?\b";
                    i = 91;
                    strArr2 = strArr3;
                    break;
                case 91:
                    strArr2[i2] = str;
                    i2 = 93;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\u0007\"\u0004\u000b?\b";
                    i = 92;
                    strArr2 = strArr3;
                    break;
                case 92:
                    strArr2[i2] = str;
                    i2 = 94;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\u0007\"\u0004\u000b?\b";
                    i = 93;
                    strArr2 = strArr3;
                    break;
                case 93:
                    strArr2[i2] = str;
                    i2 = 95;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\u0007;\u0006\u0006oA\"O\f:D=N";
                    i = 94;
                    strArr2 = strArr3;
                    break;
                case 94:
                    strArr2[i2] = str;
                    i2 = 96;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\u0007\u0018\u0003\u000e*O0\u00031;I%\n'7K4\u001f\u0016&G?O";
                    i = 95;
                    strArr2 = strArr3;
                    break;
                case 95:
                    strArr2[i2] = str;
                    i2 = 97;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\u0007\"\u0004\u000b?\u00076\u001d\r:X|\r\r:F2\nO\"[6";
                    i = 96;
                    strArr2 = strArr3;
                    break;
                case 96:
                    strArr2[i2] = str;
                    i2 = 98;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\u0007\"\u0004\u000b?\u0007=\u0000\u0001.\\8\u0000\fo";
                    i = 97;
                    strArr2 = strArr3;
                    break;
                case 97:
                    strArr2[i2] = str;
                    i2 = 99;
                    str = "\b0\u001a\u0016 Z4\u001b\u00106\b5\u0006\u0011.J=\n\u0006";
                    i = 98;
                    strArr2 = strArr3;
                    break;
                case 98:
                    strArr2[i2] = str;
                    i2 = 100;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\u0007\"\u0004\u000b?\b";
                    i = 99;
                    strArr2 = strArr3;
                    break;
                case 99:
                    strArr2[i2] = str;
                    i2 = 101;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\u00070\u000b\u0006o";
                    i = 100;
                    strArr2 = strArr3;
                    break;
                case 100:
                    strArr2[i2] = str;
                    i2 = 102;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006";
                    i = 101;
                    strArr2 = strArr3;
                    break;
                case 101:
                    strArr2[i2] = str;
                    i2 = 103;
                    str = "\b0\u001a\u0016 Z4\u001b\u00106\b5\u0006\u0011.J=\n\u0006";
                    i = 102;
                    strArr2 = strArr3;
                    break;
                case 102:
                    strArr2[i2] = str;
                    i2 = 104;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\u0007\"\u0004\u000b?\b";
                    i = 103;
                    strArr2 = strArr3;
                    break;
                case 103:
                    strArr2[i2] = str;
                    i2 = 105;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\u0007\"\u0004\u000b?\u00072\u000e\u000e#\b";
                    i = 104;
                    strArr2 = strArr3;
                    break;
                case 104:
                    strArr2[i2] = str;
                    i2 = 106;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;\u0007\"\u0004\u000b?\u0007\"\u0016\u0011;M<O";
                    i = 105;
                    strArr2 = strArr3;
                    break;
                case 105:
                    strArr2[i2] = str;
                    i2 = 107;
                    str = "{\u0014#'\f|q0\u000b+\b\u0017=-\u0002\b<\n\u0011<I6\n\u0011o\u007f\u0019*0\n\b:\n\u001b\u0010Z4\u0002\r;M\u000e\u0005\u000b+\u0015nO#\u0001lq\u0002\u0007+A00\u0015.w%\u0016\u0012*\u0014iO-\u001dl\u0014=B\rqq0\u000b+\b\u0010<!od\u0018\"+\u001b\b`";
                    i = 106;
                    strArr2 = strArr3;
                    break;
                case 106:
                    strArr2[i2] = str;
                    i2 = 108;
                    str = "E\"\b\u0011;G#\nM(M%\t\u000b=[%\u001d\u0007)\u00072\u001a\u0010<G#O\u000b<\b?\u001a\u000e#";
                    i = 107;
                    strArr2 = strArr3;
                    break;
                case 107:
                    strArr2[i2] = str;
                    i2 = 109;
                    str = "E\"\b\u0011;G#\nM(M%\t\u000b=[%\u001d\u0007)\b2\u000e\fh\\q\b\u0007;\b'\u000e\u000e:Mq\t\r=\b";
                    i = 108;
                    strArr2 = strArr3;
                    break;
                case 108:
                    strArr2[i2] = str;
                    i2 = 110;
                    str = "E\"\b\u0011;G#\nM(M%\b\u0010 ]!\u0006\f)G~\b\u000b+\u00078\u0001\u0014.D8\u000bB";
                    i = 109;
                    strArr2 = strArr3;
                    break;
                case 109:
                    strArr2[i2] = str;
                    i2 = 111;
                    str = "E\"\b\u0011;G#\nM(Z>\u001a\u0012&F7\u0000M*Z#\u0000\u0010o";
                    i = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i2] = str;
                    i2 = 112;
                    str = "E\"\b\u0011;G#\nM(M%\b\u0010 ]!\u0006\f)G~\b\u000b+\b";
                    i = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i2] = str;
                    i2 = 113;
                    str = "{\u0014#'\f|q\u001c\u0017-B4\f\u0016c\b2\u001d\u0007.\\8\u0000\fon\u0003 /oK9\u000e\u0016\u0010D8\u001c\u0016o\u007f\u0019*0\n\b:\n\u001b\u0010Z4\u0002\r;M\u000e\u0005\u000b+\u0015n";
                    i = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i2] = str;
                    i2 = 114;
                    str = "\by\r\u0003,C$\u001f\u0011r";
                    i = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i2] = str;
                    i2 = 115;
                    str = "\u00062\u001d\u001b?\\g";
                    i = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i2] = str;
                    i2 = 116;
                    str = "E\"\b\u0011;G#\nM(M%\u0004\u00076[7\u0000\u0010-I2\u0004\u0017?[~\u0001\rbK8\u001f\n*Z~\u001c\t&X";
                    i = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i2] = str;
                    i2 = 117;
                    str = "\u00062\u001d\u001b?\\g";
                    i = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i2] = str;
                    i2 = 118;
                    str = "E\"\b\u0011;G#\nM(M%\u0004\u00076[~\u001c\u000b5Mq";
                    i = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i2] = str;
                    i2 = 119;
                    str = "\u00062\u001d\u001b?\\f";
                    i = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i2] = str;
                    i2 = 120;
                    str = "\u00062\u001d\u001b?\\i";
                    i = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i2] = str;
                    i2 = 121;
                    str = "E\"\b\u0011;G#\nM<M%\f\n.\\#\n\u0003+Z4\f\u0007&X%\u001c\u0011*F%@";
                    i = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i2] = str;
                    i2 = 122;
                    str = "E\"\b\u0011;G#\nM<M%\f\n.\\#\n\u0003+Z4\f\u0007&X%\u001c\u0011*F%@\f \b2\u0007\u0003;\b7\u0000\u0010o";
                    i = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i2] = str;
                    i2 = 123;
                    str = "E\"\b\u0011;G#\nM<M%\u001a\u0012";
                    i = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i2] = str;
                    i2 = 124;
                    str = "E\"\b\u0011;G#\nM#I\"\u001bM+J~\f\u0017=[>\u001dB&[q\u0001\u0017#D";
                    i = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i2] = str;
                    i2 = 125;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9O$\u001dg\u001cO\u000f*[\"\u000e\u0005*[}\f\n.\\\u000e\u0003\u000b<\\q8*\nz\u0014O\u000f*[\"\u000e\u0005*[\u007f\u0004\u00076w#\n\u000f \\40\b&Ll\f\n.\\\u000e\u0003\u000b<\\\u007f\u0004\u00076w#\n\u000f \\40\b&Lq.,\u000b\b<\n\u0011<I6\n=;I3\u0003\u0007\u0010A5R\u000f*[\"\u000e\u0005*[\u007f0\u000b+\b\u0010!&oK9\u000e\u0016\u0010D8\u001c\u0016aC4\u0016==M<\u0000\u0016*w;\u0006\u0006r\u0017";
                    i = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i2] = str;
                    i2 = 126;
                    str = "E\"\b\u0011;G#\nM#I\"\u001bM+Jq\u0001\roE4\u001c\u0011.O4O\u0004 Zq";
                    i = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i2] = str;
                    i2 = 127;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*E4\u001c\u0011.O4\u0006\f-I2\u0004\u0005=G$\u0001\u0006oL$\u001f\u000e&K0\u001b\u0007";
                    i = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i2] = str;
                    i2 = 128;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9C=&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlPBoi\u001f+B\"M5\u0006\u0003\u0010_00\u00166X4SZog\u0003+'\u001d\b\u00136B\u0010A5O&\n{\u0012O.\u0006e\u0018;B";
                    i = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i2] = str;
                    i2 = 129;
                    str = "E\"\b\u0011;G#\nM(M%@\f;@q\u0001\roE4\u001c\u0011.O4UB";
                    i = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i2] = str;
                    i2 = 130;
                    str = "E\"\b\u0011;G#\nM(M%@\f;@q\f\u0003!\u000f%O\u0005*\\q\u0002\u0007<[0\b\u0007u\b";
                    i = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i2] = str;
                    i2 = 131;
                    str = "E\"\b\u0011;G#\nM+M=\n\u0016*E\"\b\u0011`B8\u000bB";
                    i = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i2] = str;
                    i2 = 132;
                    str = "E\"\b\u0011;G#\nM?Z4\u001f\u0003=M\"\u001b\u0003;M<\n\f;[";
                    i = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i2] = str;
                    i2 = 133;
                    str = "}\u0001+#\u001bmq\u0002\u0007<[0\b\u0007<\b\u0002*6o[%\u000e\u0016:[lPNo[4\u0001\u0006\u0010\\8\u0002\u0007<\\0\u0002\u0012r\u0017}O\u0010*K8\u001f\u000b*F%0\u0001 ]?\u001b_p\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4R]o\u007f\u0019*0\n\b:\n\u001b\u0010Z4\u0002\r;M\u000e\u0005\u000b+\u0015nO#\u0001lq\u0004\u00076w7\u001d\r\"w<\n_p\b\u0010!&oC4\u0016=&LlP";
                    i = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i2] = str;
                    i2 = 134;
                    str = "}\u0001+#\u001bmq\u0002\u0007<[0\b\u0007<\b\u0002*6o[%\u000e\u0016:[lPNoZ4\f\u0007&X%0\u0011*Z'\n\u0010\u0010\\8\u0002\u0007<\\0\u0002\u0012r\u0017}O\u0010*K8\u001f\u000b*F%0\u0001 ]?\u001b_p\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlPB\u000ef\u0015O\t*Q\u000e\t\u0010 E\u000e\u0002\u0007r\u0017q.,\u000b\b:\n\u001b\u0010A5R]";
                    i = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i2] = str;
                    i2 = 135;
                    str = "}\u0001+#\u001bmq\u0002\u0007<[0\b\u0007<\b\u0002*6o[%\u000e\u0016:[lPB\u0018`\u0014='oC4\u0016==M<\u0000\u0016*w;\u0006\u0006r\u0017q.,\u000b\b:\n\u001b\u0010N#\u0000\u000f\u0010E4R]oi\u001f+B$M(0\u000b+\u0015n";
                    i = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i2] = str;
                    i2 = 136;
                    str = "a\u001f<'\u001d|q&,\u001bgq\u0002\u0007+A00\u0010*N\"OJ?I%\u0007NoZ4\t=,G$\u0001\u0016f\b\u0007..\u001am\u0002OJp\u0004qPK";
                    i = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i2] = str;
                    i2 = 137;
                    str = "a\u001f<'\u001d|q&,\u001bgq\u0002\u0007<[0\b\u0007<\u0000:\n\u001b\u0010Z4\u0002\r;M\u000e\u0005\u000b+\u0004q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=M2\n\u000b9M50\u0016&E4\u001c\u0016.E!CB<M?\u000b=;A<\n\u0011;I<\u001fNoZ4\f\u0007&X%0\u0011*Z'\n\u0010\u0010\\8\u0002\u0007<\\0\u0002\u0012c\b#\n\u0001*A!\u001b=+M'\u0006\u0001*w%\u0006\u000f*[%\u000e\u000f?\u0004q\u001d\u00038w5\u000e\u0016.\u0004q\u001f\u0003=\\8\f\u000b?I?\u001b='I\"\u0007Ko~\u0010#7\n{qG]c\bnCBp\u0004qPNo\u0017}O]c\bnCBp\u0004qPNo\u0017}O]c\bnCBp\u0004qPNo\u0017}O]c\bnCBp\u0004qPNo\u0017}O]c\b|^No\u0005`CBb\u0019}O]c\bnF";
                    i = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i2] = str;
                    i2 = 138;
                    str = "l\u0014#'\u001bmq)0\u0000eq\u0002\u0007+A00\u0010*N\"O5\u0007m\u0003*B?I%\u0007_p";
                    i = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i2] = str;
                    i2 = 139;
                    str = "}\u0001+#\u001bmq\u0002\u0007<[0\b\u0007<\b\u0002*6o[%\u000e\u0016:[lPNoZ4\f\u0007&X%0\u0011*Z'\n\u0010\u0010\\8\u0002\u0007<\\0\u0002\u0012r\u0017}O\u0010*K8\u001f\u000b*F%0\u0001 ]?\u001b_p\b\u0006''\u001dmq\u001b\u000b\"M\"\u001b\u0003\"XlPB\u000ef\u0015O\t*Q\u000e\t\u0010 E\u000e\u0002\u0007r\u0017q.,\u000b\b:\n\u001b\u0010A5R]";
                    i = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i2] = str;
                    i2 = 140;
                    str = "}\u0001+#\u001bmq\u0002\u0007<[0\b\u0007<\b\u0002*6o[%\u000e\u0016:[lPNoF4\n\u0006<w!\u001a\u0011'\u0015nCB+I%\u000e_p\u0004q\u001d\u00038w5\u000e\u0016.\u0015nCB;A<\n\u0011;I<\u001f_p\u0004q\u0002\u0007+A00\u0017=DlPNoE4\u000b\u000b.w<\u0006\u000f*w%\u0016\u0012*\u0015nCB\"M5\u0006\u0003\u0010_00\u00166X4R]c\b<\n\u0006&I\u000e\u001c\u000b5MlPNoE4\u000b\u000b.w?\u000e\u000f*\u0015nCB\"M5\u0006\u0003\u0010K0\u001f\u0016&G?R]c\b<\n\u0006&I\u000e\u0007\u0003<@lPNoE4\u000b\u000b.w5\u001a\u0010.\\8\u0000\fr\u0017}O\r=A6\u0006\fr\u0017}O\u000e.\\8\u001b\u0017+MlPNoD>\u0001\u0005&\\$\u000b\u0007r\u0017}O\u0016']<\r=&E0\b\u0007r\u0017q8*\nz\u0014O\t*Q\u000e\u001d\u0007\"G%\n=%A5R]oi\u001f+B$M(0\u0004=G<0\u000f*\u0015nO#\u0001lq\u0004\u00076w8\u000b_p";
                    i = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i2] = str;
                    i2 = 141;
                    str = "{\u0014#'\f|q0\u000b+\b\u0017=-\u0002\b<\n\u0011<I6\n\u0011o\u007f\u0019*0\n\b:\n\u001b\u0010Z4\u0002\r;M\u000e\u0005\u000b+\u0015nO#\u0001lq\u0004\u00076w7\u001d\r\"w<\n_p\b\u0010!&oC4\u0016=&LlP";
                    i = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i2] = str;
                    i2 = 142;
                    str = "}\u0001+#\u001bmq\u0002\u0007+A00\u0010*N\"O1\n|q\u001d\u0007)w2\u0000\u0017!\\lPB\u0018`\u0014='oX0\u001b\nr\u0017";
                    i = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i2] = str;
                    i2 = 143;
                    str = "l\u0014#'\u001bmq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq0\u000b+\u0015n";
                    i = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i2] = str;
                    i2 = 144;
                    str = "E\"\b\u0011;G#\nM,D4\u000e\u0010,I=\u0003\u000e O~";
                    i = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i2] = str;
                    i2 = 145;
                    str = "l\u0014#'\u001bmq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0002\u0007+A00\u0015.w%\u0016\u0012*\u0015i";
                    i = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i2] = str;
                    i2 = 146;
                    str = "\u0006%\u0017\u0016";
                    i = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i2] = str;
                    i2 = 147;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9C=&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlPB\u000ef\u0015O\u000f*L8\u000e=8I\u000e\u001b\u001b?MmWB\u0000z\u0015*0oj\bO=&Lq+'\u001ckq#+\u0002a\u0005O";
                    i = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i2] = str;
                    i2 = 148;
                    str = "D>\u000e\u0006)G#\n\u000f.A=@\u0014,I#\u000bO\"[6\u001cM8Z8\u001b\u0007bN0\u0006\u000e*L";
                    i = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i2] = str;
                    i2 = 149;
                    str = "\u0007%\u0000\u0016.Dq\u000e\u0016;I2\u0007B)A=\nX";
                    i = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i2] = str;
                    i2 = 150;
                    str = "E\"\b\u0011;G#\nM#G0\u000b\u0004 Z4\u0002\u0003&D~";
                    i = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i2] = str;
                    i2 = 151;
                    str = "E\"\b\u0011;G#\nM#G0\u000b\u0004 Z4\u0002\u0003&Dq\f\u0003!F>\u001bB,Z4\u000e\u0016*\b0\u001b\u0016.K9\u0002\u0007!\\q\t\u000b#M";
                    i = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i2] = str;
                    i2 = 152;
                    str = "D>\u000e\u0006)G#\n\u000f.A=@\u0007=Z>\u001dB";
                    i = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i2] = str;
                    i2 = 153;
                    str = "@%\u001b\u0012<\u0012~@\u000f.X\"A\u0005 G6\u0003\u0007aK>\u0002MpYl";
                    i = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i2] = str;
                    i2 = 154;
                    str = "D>\u000e\u0006)G#\n\u000f.A=@\u00167\\|\u0002\u0011([~\u0018\u0010&\\4B\u0004.A=\n\u0006";
                    i = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i2] = str;
                    i2 = 155;
                    str = "snU>`\u0002sS\\3t)_Rbt)^$\u0012";
                    i = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i2] = str;
                    i2 = 156;
                    str = "snU>`\u0002sS\\3u";
                    i = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i2] = str;
                    i2 = 157;
                    str = "}\u0005)Ow";
                    i = 156;
                    strArr2 = strArr3;
                    break;
                case 156:
                    strArr2[i2] = str;
                    i2 = 158;
                    str = "\u0012q";
                    i = 157;
                    strArr2 = strArr3;
                    break;
                case 157:
                    strArr2[i2] = str;
                    i2 = 159;
                    str = "\u0006'\f\u0004";
                    i = 158;
                    strArr2 = strArr3;
                    break;
                case 158:
                    strArr2[i2] = str;
                    i2 = 160;
                    str = "snU>`\u0002sS\\3t)_Rbt)^$\u0012";
                    i = 159;
                    strArr2 = strArr3;
                    break;
                case 159:
                    strArr2[i2] = str;
                    i2 = 161;
                    str = "D>\u000e\u0006)G#\n\u000f.A=@\u0016 \\0\u0003B,G$\u0001\u0016u";
                    i = 160;
                    strArr2 = strArr3;
                    break;
                case 160:
                    strArr2[i2] = str;
                    i2 = 162;
                    str = "\u0007%\u0000\u0016.Dq\u001c\u000b5Mk";
                    i = 161;
                    strArr2 = strArr3;
                    break;
                case 161:
                    strArr2[i2] = str;
                    i2 = 163;
                    str = "D>\u000e\u0006)G#\n\u000f.A=@\u00166X4@\u0017!C?\u0000\u0015!\u0012q";
                    i = 162;
                    strArr2 = strArr3;
                    break;
                case 162:
                    strArr2[i2] = str;
                    i2 = 164;
                    str = "}\u0005)Ow";
                    i = 163;
                    strArr2 = strArr3;
                    break;
                case 163:
                    strArr2[i2] = str;
                    i2 = 165;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9C=&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlPB\u000ef\u0015O=&LoR]oi\u001f+B\"M5\u0006\u0003\u0010_00\u00166X4SZog\u0003+'\u001d\b\u00136B\u0010A5O#\u001ck";
                    i = 164;
                    strArr2 = strArr3;
                    break;
                case 164:
                    strArr2[i2] = str;
                    i2 = 166;
                    str = "\b|O";
                    i = 165;
                    strArr2 = strArr3;
                    break;
                case 165:
                    strArr2[i2] = str;
                    i2 = 167;
                    str = "D>\u000e\u0006)G#\n\u000f.A=@\u0007=Z>\u001dB";
                    i = 166;
                    strArr2 = strArr3;
                    break;
                case 166:
                    strArr2[i2] = str;
                    i2 = 168;
                    str = "E\"\b\u0011;G#\nM*E0\u0006\u000e\u0010K>\u0001\u0014*Z\"\u000e\u0016&G?@\u000f&[\"\u0006\f(w#\u0002\u0016\u0010[#\fX";
                    i = 167;
                    strArr2 = strArr3;
                    break;
                case 167:
                    strArr2[i2] = str;
                    i2 = 169;
                    str = "\u0006'\f\u0004";
                    i = 168;
                    strArr2 = strArr3;
                    break;
                case 168:
                    strArr2[i2] = str;
                    i2 = 170;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*\u0007?\u0000\u0011:K9\u0002\u0007<[0\b\u0007u\b";
                    i = 169;
                    strArr2 = strArr3;
                    break;
                case 169:
                    strArr2[i2] = str;
                    i2 = 171;
                    str = "\b2\u001a\u0010=M?\u001bX";
                    i = 170;
                    strArr2 = strArr3;
                    break;
                case 170:
                    strArr2[i2] = str;
                    i2 = 172;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*\u0007\"\u001b\u0003;]\"\u000b\r8F6\u001d\u0003+MkO";
                    i = 171;
                    strArr2 = strArr3;
                    break;
                case 171:
                    strArr2[i2] = str;
                    i2 = 173;
                    str = "\b?\n\u0015u";
                    i = 172;
                    strArr2 = strArr3;
                    break;
                case 172:
                    strArr2[i2] = str;
                    i2 = 174;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*\u0007#\n\u0001*A!\u001bM<M#\u0019\u0007=\u00075\n\u000e.Qq";
                    i = 173;
                    strArr2 = strArr3;
                    break;
                case 173:
                    strArr2[i2] = str;
                    i2 = 175;
                    str = "l\u0014#'\u001bmq)0\u0000eq\f\n.\\\u000e\u0003\u000b<\\q8*\nz\u0014O\t*Q\u000e\u001d\u0007\"G%\n=%A5R]";
                    i = 174;
                    strArr2 = strArr3;
                    break;
                case 174:
                    strArr2[i2] = str;
                    i2 = 176;
                    str = "O;\u0006\u0006r\u0017";
                    i = 175;
                    strArr2 = strArr3;
                    break;
                case 175:
                    strArr2[i2] = str;
                    i2 = 177;
                    str = "l\u0014#'\u001bmq)0\u0000eq\u001d\u0007,M8\u001f\u0016<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlP";
                    i = 176;
                    strArr2 = strArr3;
                    break;
                case 176:
                    strArr2[i2] = str;
                    i2 = 178;
                    str = "l\u0014#'\u001bmq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlP";
                    i = 177;
                    strArr2 = strArr3;
                    break;
                case 177:
                    strArr2[i2] = str;
                    i2 = 179;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 178;
                    strArr2 = strArr3;
                    break;
                case 178:
                    strArr2[i2] = str;
                    i2 = 180;
                    str = "E\"\b\u0011;G#\nM*F5O\u0016=I?\u001c\u0003,\\8\u0000\fo";
                    i = 179;
                    strArr2 = strArr3;
                    break;
                case 179:
                    strArr2[i2] = str;
                    i2 = 181;
                    str = "E\"\b\u0011;G#\nM.L5\u0002\u0011(\u0007&\u0006\u000e#\b#\n\u0016=Qq";
                    i = 180;
                    strArr2 = strArr3;
                    break;
                case 180:
                    strArr2[i2] = str;
                    i2 = 182;
                    str = "E\"\b\u0011;G#\nM*F5O\u0016=I?\u001c\u0003,\\8\u0000\fo";
                    i = 181;
                    strArr2 = strArr3;
                    break;
                case 181:
                    strArr2[i2] = str;
                    i2 = 183;
                    str = "E\"\b\u0011;G#\nM*F5O\u0016=I?\u001c\u0003,\\8\u0000\fo";
                    i = 182;
                    strArr2 = strArr3;
                    break;
                case 182:
                    strArr2[i2] = str;
                    i2 = 184;
                    str = "E\"\b\u0011;G#\nM*F5O\u0016=I?\u001c\u0003,\\8\u0000\fo";
                    i = 183;
                    strArr2 = strArr3;
                    break;
                case 183:
                    strArr2[i2] = str;
                    i2 = 185;
                    str = "E\"\b\u0011;G#\nM*F5O\u0016=I?\u001c\u0003,\\8\u0000\fo";
                    i = 184;
                    strArr2 = strArr3;
                    break;
                case 184:
                    strArr2[i2] = str;
                    i2 = 186;
                    str = "E\"\b\u0011;G#\nM.L5\u0002\u0011(\u00073\u000e\u0001$O#\u0000\u0017!L~\u001b\u0010.F\"\u000e\u0001;A>\u0001O+M=\u000e\u001b*Lq";
                    i = 185;
                    strArr2 = strArr3;
                    break;
                case 185:
                    strArr2[i2] = str;
                    i2 = 187;
                    str = "E\"\b\u0011;G#\nM.L5\u0002\u0011(\b7\u000e\u000b#M5O\u0016 \b8\u0001\u0011*Z%N";
                    i = 186;
                    strArr2 = strArr3;
                    break;
                case 186:
                    strArr2[i2] = str;
                    i2 = 188;
                    str = "E\"\b\u0011;G#\nM.L5\u0002\u0011(\u00074\u001d\u0010 Z~\b\u0010 ]!@\u0010*E>\u001b\u0007\u0010Z4\u001c\r:Z2\nB&[q\u0001\u0017#DpO";
                    i = 187;
                    strArr2 = strArr3;
                    break;
                case 187:
                    strArr2[i2] = str;
                    i2 = 189;
                    str = "E\"\b\u0011;G#\nM.L5\u0002\u0011(\b5\u001a\u0012#A2\u000e\u0016*\b";
                    i = 188;
                    strArr2 = strArr3;
                    break;
                case 188:
                    strArr2[i2] = str;
                    i2 = 190;
                    str = "{\u0014#'\f|q\u0005\u000b+\u0004q\u000e\u0006\"A?CB?M?\u000b\u000b!Oq)0\u0000eq\b\u0010 ]!0\u0012.Z%\u0006\u0001&X0\u0001\u0016<\b\u0006''\u001dmq\b\b&LlP";
                    i = 189;
                    strArr2 = strArr3;
                    break;
                case 189:
                    strArr2[i2] = str;
                    i2 = 191;
                    str = "C4\u0016=&L";
                    i = 190;
                    strArr2 = strArr3;
                    break;
                case 190:
                    strArr2[i2] = str;
                    i2 = 192;
                    str = "\b7\u0000\u0010oE4\u001c\u0011.O4O";
                    i = 191;
                    strArr2 = strArr3;
                    break;
                case 191:
                    strArr2[i2] = str;
                    i2 = 193;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006r\u0017q.,\u000b\b:\n\u001b\u0010N#\u0000\u000f\u0010E4R]oi\u001f+B$M(0\u000b+\u0015n";
                    i = 192;
                    strArr2 = strArr3;
                    break;
                case 192:
                    strArr2[i2] = str;
                    i2 = 194;
                    str = "E4\u001c\u0011.O4\u001c";
                    i = 193;
                    strArr2 = strArr3;
                    break;
                case 193:
                    strArr2[i2] = str;
                    i2 = 195;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006";
                    i = 194;
                    strArr2 = strArr3;
                    break;
                case 194:
                    strArr2[i2] = str;
                    i2 = 196;
                    str = "}?\n\u001a?M2\u001b\u0007+\b\"\u001b\u0003;]\"O";
                    i = 195;
                    strArr2 = strArr3;
                    break;
                case 195:
                    strArr2[i2] = str;
                    i2 = 197;
                    str = "Z4\u000e\u0006\u0010L4\u0019\u000b,M\u000e\u001b\u000b\"M\"\u001b\u0003\"X";
                    i = 196;
                    strArr2 = strArr3;
                    break;
                case 196:
                    strArr2[i2] = str;
                    i2 = 198;
                    str = "}?\n\u001a?M2\u001b\u0007+\b\"\u001b\u0003;]\"O";
                    i = 197;
                    strArr2 = strArr3;
                    break;
                case 197:
                    strArr2[i2] = str;
                    i2 = 199;
                    str = "Z4\u0002\r;M\u000e\u001d\u0007<G$\u001d\u0001*";
                    i = 198;
                    strArr2 = strArr3;
                    break;
                case 198:
                    strArr2[i2] = str;
                    i2 = 200;
                    str = "[%\u000e\u0016:[";
                    i = 199;
                    strArr2 = strArr3;
                    break;
                case 199:
                    strArr2[i2] = str;
                    i2 = 201;
                    str = "Z4\f\u0007&X%0\u0006*^8\f\u0007\u0010\\8\u0002\u0007<\\0\u0002\u0012";
                    i = 200;
                    strArr2 = strArr3;
                    break;
                case 200:
                    strArr2[i2] = str;
                    i2 = 202;
                    str = "Z4\u000e\u0006\u0010L4\u0019\u000b,M\u000e\u001b\u000b\"M\"\u001b\u0003\"X";
                    i = 201;
                    strArr2 = strArr3;
                    break;
                case 201:
                    strArr2[i2] = str;
                    i2 = 203;
                    str = "}?\n\u001a?M2\u001b\u0007+\b\"\u001b\u0003;]\"O";
                    i = 202;
                    strArr2 = strArr3;
                    break;
                case 202:
                    strArr2[i2] = str;
                    i2 = 204;
                    str = "X=\u000e\u001b*L\u000e\u000b\u00079A2\n=;A<\n\u0011;I<\u001f";
                    i = 203;
                    strArr2 = strArr3;
                    break;
                case 203:
                    strArr2[i2] = str;
                    i2 = 205;
                    str = "Z4\f\u0007&X%0\u0006*^8\f\u0007\u0010\\8\u0002\u0007<\\0\u0002\u0012";
                    i = 204;
                    strArr2 = strArr3;
                    break;
                case 204:
                    strArr2[i2] = str;
                    i2 = 206;
                    str = "Z4\u000e\u0006\u0010L4\u0019\u000b,M\u000e\u001b\u000b\"M\"\u001b\u0003\"X";
                    i = 205;
                    strArr2 = strArr3;
                    break;
                case 205:
                    strArr2[i2] = str;
                    i2 = 207;
                    str = "E4\u001c\u0011.O4\u001c";
                    i = 206;
                    strArr2 = strArr3;
                    break;
                case 206:
                    strArr2[i2] = str;
                    i2 = 208;
                    str = "\b7\u0000\u0010oE4\u001c\u0011.O4O";
                    i = 207;
                    strArr2 = strArr3;
                    break;
                case 207:
                    strArr2[i2] = str;
                    i2 = 209;
                    str = "[%\u000e\u0016:[";
                    i = 208;
                    strArr2 = strArr3;
                    break;
                case 208:
                    strArr2[i2] = str;
                    i2 = 210;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006r\u0017q.,\u000b\b:\n\u001b\u0010A5R]oi\u001f+B=M<\u0000\u0016*w#\n\u0011 ]#\f\u0007r\u0017";
                    i = 209;
                    strArr2 = strArr3;
                    break;
                case 209:
                    strArr2[i2] = str;
                    i2 = 211;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*E4\u001c\u0011.O4\u001b\u0003=O4\u001b\u0011;I%\u001a\u0011&F3\u000e\u0001$O#\u0000\u0017!L~\u001a\u0012+I%\nM)I8\u0003\u0007+\b";
                    i = 210;
                    strArr2 = strArr3;
                    break;
                case 210:
                    strArr2[i2] = str;
                    i2 = 212;
                    str = "e4\u001c\u0011.O4O\f \\q\t\u0010 Eq\u0002\u0007o";
                    i = 211;
                    strArr2 = strArr3;
                    break;
                case 211:
                    strArr2[i2] = str;
                    i2 = 213;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*E4\u001c\u0011.O4\u001b\u0003=O4\u001b\u0011;I%\u001a\u0011&F3\u000e\u0001$O#\u0000\u0017!L~\u0006\f<M#\u001bM)I8\u0003\u0007+\b";
                    i = 212;
                    strArr2 = strArr3;
                    break;
                case 212:
                    strArr2[i2] = str;
                    i2 = 214;
                    str = "Z4\f\u0007&X%0\u0006*^8\f\u0007\u0010\\8\u0002\u0007<\\0\u0002\u0012";
                    i = 213;
                    strArr2 = strArr3;
                    break;
                case 213:
                    strArr2[i2] = str;
                    i2 = 215;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006r\u0017q.,\u000b\b:\n\u001b\u0010N#\u0000\u000f\u0010E4R]oi\u001f+B$M(0\u000b+\u0015n";
                    i = 214;
                    strArr2 = strArr3;
                    break;
                case 214:
                    strArr2[i2] = str;
                    i2 = 216;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*E4\u001c\u0011.O4\u001b\u0003=O4\u001b\u0011;I%\u001a\u0011&F3\u000e\u0001$O#\u0000\u0017!L~\u001a\u0012+I%\nM)I8\u0003\u0007+\b";
                    i = 215;
                    strArr2 = strArr3;
                    break;
                case 215:
                    strArr2[i2] = str;
                    i2 = 217;
                    str = "Z4\f\u0007&X%\u001c";
                    i = 216;
                    strArr2 = strArr3;
                    break;
                case 216:
                    strArr2[i2] = str;
                    i2 = 218;
                    str = "Z4\f\u0007&X%\u001c";
                    i = 217;
                    strArr2 = strArr3;
                    break;
                case 217:
                    strArr2[i2] = str;
                    i2 = 219;
                    str = "X=\u000e\u001b*L\u000e\u000b\u00079A2\n=;A<\n\u0011;I<\u001f";
                    i = 218;
                    strArr2 = strArr3;
                    break;
                case 218:
                    strArr2[i2] = str;
                    i2 = 220;
                    str = "\b7\u0000\u0010oE4\u001c\u0011.O4O";
                    i = 219;
                    strArr2 = strArr3;
                    break;
                case 219:
                    strArr2[i2] = str;
                    i2 = 221;
                    str = "X=\u000e\u001b*L\u000e\u000b\u00079A2\n=;A<\n\u0011;I<\u001f";
                    i = 220;
                    strArr2 = strArr3;
                    break;
                case 220:
                    strArr2[i2] = str;
                    i2 = 222;
                    str = "E\"\b\u0011;G#\nM(M%(\u0010 ]!#\r,I%\u0006\r!e4\u001c\u0011.O4\u001cM<A+\nX";
                    i = 221;
                    strArr2 = strArr3;
                    break;
                case 221:
                    strArr2[i2] = str;
                    i2 = 223;
                    str = "E\"\b\u0011;G#\nM(M%(\u0010 ]!#\r,I%\u0006\r!e4\u001c\u0011.O4\u001cM+J~\f\u0017=[>\u001dB&[q\u0001\u0017#D";
                    i = 222;
                    strArr2 = strArr3;
                    break;
                case 222:
                    strArr2[i2] = str;
                    i2 = 224;
                    str = "{\u0014#'\f|q\fL$M(0\u0004=G<0\u000f*\u0004q\fL$M(0\u000b+\u0004q\fL<\\0\u001b\u0017<\u0004q\fL!M4\u000b\u0011\u0010X$\u001c\nc\b2A\u0006.\\0CB,\u0006%\u0006\u000f*[%\u000e\u000f?\u0004q\fL\"M5\u0006\u0003\u0010]#\u0003NoK\u007f\u0002\u0007+A00\u000f&E40\u00166X4CB,\u0006<\n\u0006&I\u000e\u0018\u0003\u0010\\(\u001f\u0007c\b2A\u000f*L8\u000e=<A+\nNoK\u007f\u0002\u0007+A00\f.E4CB,\u0006<\n\u0006&I\u000e\f\u0003?\\8\u0000\fc\b2A\u000f*L8\u000e='I\"\u0007NoK\u007f\u0002\u0007+A00\u0006:Z0\u001b\u000b F}O\u0001aG#\u0006\u0005&F}O\u0001aD0\u001b\u000b;]5\nNoK\u007f\u0003\r!O8\u001b\u0017+M}O\u0001a\\9\u001a\u000f-w8\u0002\u0003(M}O\u0001aZ4\u0002\r;M\u000e\u001d\u0007<G$\u001d\u0001*\u0004q\fL=I&0\u0006.\\0CB,\u0006#\n\u0001&X8\n\f;w2\u0000\u0017!\\}OB,\u0006\u000e\u0006\u0006on\u0003 /oE4\u001c\u0011.O4\u001cB,\b\u0018!,\nzq%-\u0006fqGB\u001cm\u001d*!\u001b\b#\n\u000f \\40\u0010*[>\u001a\u0010,M}\u0002\u00037\u0000\u000e\u0006\u0006f\b\u0010<B\"I)\u0006\u0006on\u0003 /oE4\u001c\u0011.O4\u001cBo\u007f\u0019*0\n\b:\n\u001b\u0010Z4\u0002\r;M\u000e\u0005\u000b+\u0015nO#\u0001lq\u0004\u00076w7\u001d\r\"w<\n_\u007f\b\u0010!&o\\8\u0002\u0007<\\0\u0002\u0012q\u0017q.,\u000b\b<\n\u0006&I\u000e\u0018\u0003\u0010\\(\u001f\u0007r\u001dq(0\u0000}\u0001O \u0016\b#\n\u000f \\40\u0010*[>\u001a\u0010,MqFB-\b\u001e!B,\u0006#\n\u000f \\40\u0010*[>\u001a\u0010,Ml\rL=M<\u0000\u0016*w#\n\u0011 ]#\f\u0007oi\u001f+B,\u0006\u000e\u0006\u0006rJ\u007f\u0002\u00037A5O-\u001dl\u0014=B\rqq0\u000b+\b\u0015*1\f";
                    i = 223;
                    strArr2 = strArr3;
                    break;
                case 223:
                    strArr2[i2] = str;
                    i2 = 225;
                    str = "E\"\b\u0011;G#\nM(M%\u0003\u0003<\\<\n\u0011<I6\n\u0011)G#\u0001\r;A7\u0006\u0001.\\8\u0000\f`a=\u0003\u0007(I=<\u0016.\\4*\u001a,M!\u001b\u000b Fq";
                    i = 224;
                    strArr2 = strArr3;
                    break;
                case 224:
                    strArr2[i2] = str;
                    i2 = 226;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9C=&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlPB\u000ef\u0015O\u000f*L8\u000e=8I\u000e\u001b\u001b?MmWB\u000ef\u0015OJ$M(0\u0004=G<0\u000f*\u0015aO-\u001d\by\u001c\u0016.\\$\u001c_y\b\u0010!&oE4\u000b\u000b.w\"\u0006\u0018*\u0015`FB\u0000zqG\u0011;I%\u001a\u0011r\u001eq.,\u000b\b<\n\u0006&I\u000e\u001c\u000b5Ml[B\u000ef\u0015O\u000f*L8\u000e=+]#\u000e\u0016&G?RSf\b\u001e=Bg[%\u000e\u0016:[lYB\u000ef\u0015O\u000f*L8\u000e=<A+\n_~\u001aq.,\u000b\b<\n\u0006&I\u000e\u000b\u0017=I%\u0006\r!\u0015`FKog\u0003+'\u001d\b\u00136B\u0010A5O&\n{\u0012O.\u0006e\u0018;B";
                    i = 225;
                    strArr2 = strArr3;
                    break;
                case 225:
                    strArr2[i2] = str;
                    i2 = 227;
                    str = "B8\u000b";
                    i = 226;
                    strArr2 = strArr3;
                    break;
                case 226:
                    strArr2[i2] = str;
                    i2 = 228;
                    str = "O;\u0006\u0006r\u0017";
                    i = 227;
                    strArr2 = strArr3;
                    break;
                case 227:
                    strArr2[i2] = str;
                    i2 = 229;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 228;
                    strArr2 = strArr3;
                    break;
                case 228:
                    strArr2[i2] = str;
                    i2 = 230;
                    str = "E\"\b\u0011;G#\nM(M%=\u0007;Z(.\u0017;G5\u0000\u0015!D>\u000e\u0006\u0002M\"\u001c\u0003(M\"@+#D4\b\u0003#{%\u000e\u0016*m)\f\u0007?\\8\u0000\fo";
                    i = 229;
                    strArr2 = strArr3;
                    break;
                case 229:
                    strArr2[i2] = str;
                    i2 = 231;
                    str = "E\"\b\u0011;G#\nM(M%=\u0007;Z(.\u0017;G5\u0000\u0015!D>\u000e\u0006\u0002M\"\u001c\u0003(M\"@\u0011&R4U";
                    i = 230;
                    strArr2 = strArr3;
                    break;
                case 230:
                    strArr2[i2] = str;
                    i2 = 232;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9CB$M(0\u0010*E>\u001b\u0007\u0010B8\u000bN\u0010A5O$\u001dg\u001cO\u000f*[\"\u000e\u0005*[q8*\nz\u0014OB\"M5\u0006\u0003\u0010_00\u00166X4O\u000b!\byHPh\b}OE~\u000fqCBh\u001bvOKoi\u001f+B$M(0\u0004=G<0\u000f*\u0015aO#\u0001lq\u001b\u000b\"M\"\u001b\u0003\"XoPB\u0000z\u0015*0oj\bO=&Lq.1\f";
                    i = 231;
                    strArr2 = strArr3;
                    break;
                case 231:
                    strArr2[i2] = str;
                    i2 = 233;
                    str = "E\"\b\u0011;G#\nM(M%=\u0007;Z(.\u0017;G5\u0000\u0015!D>\u000e\u0006\u0002M\"\u001c\u0003(M\"@\b&Lq\u0006\u0011oF$\u0003\u000en";
                    i = 232;
                    strArr2 = strArr3;
                    break;
                case 232:
                    strArr2[i2] = str;
                    i2 = 234;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006";
                    i = 233;
                    strArr2 = strArr3;
                    break;
                case 233:
                    strArr2[i2] = str;
                    i2 = 235;
                    str = "E\"\b\u0011;G#\nM+M=\n\u0016*E4\u001c\u0011.O4\u001cB";
                    i = 234;
                    strArr2 = strArr3;
                    break;
                case 234:
                    strArr2[i2] = str;
                    i2 = 236;
                    str = "l\u0014#'\u001bmq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq0\u000b+\tl^";
                    i = 235;
                    strArr2 = strArr3;
                    break;
                case 235:
                    strArr2[i2] = str;
                    i2 = 237;
                    str = "E4\u000b\u000b.w#\n\u0004<";
                    i = 236;
                    strArr2 = strArr3;
                    break;
                case 236:
                    strArr2[i2] = str;
                    i2 = 238;
                    str = "}\u0001+#\u001bmq\f\n.\\\u000e\u0003\u000b<\\q<'\u001b\b<\n\u0011<I6\n=;I3\u0003\u0007\u0010A5RSc\b<\u0000\u0006\u0010\\0\b_\u007f";
                    i = 237;
                    strArr2 = strArr3;
                    break;
                case 237:
                    strArr2[i2] = str;
                    i2 = 239;
                    str = "Z4\f\u0007&X%\u001c";
                    i = 238;
                    strArr2 = strArr3;
                    break;
                case 238:
                    strArr2[i2] = str;
                    i2 = 240;
                    str = "E\"\b\u0011;G#\nL+J\u007f\f\u00106X%]";
                    i = 239;
                    strArr2 = strArr3;
                    break;
                case 239:
                    strArr2[i2] = str;
                    i2 = 241;
                    str = "E\"\b\u0011;G#\nL+J\u007f\f\u00106X%";
                    i = 240;
                    strArr2 = strArr3;
                    break;
                case 240:
                    strArr2[i2] = str;
                    i2 = 242;
                    str = "l0\u001b\u0003-I\"\n\u0011";
                    i = 241;
                    strArr2 = strArr3;
                    break;
                case 241:
                    strArr2[i2] = str;
                    i2 = 243;
                    str = "E\"\b\u0011;G#\nL+J";
                    i = 242;
                    strArr2 = strArr3;
                    break;
                case 242:
                    strArr2[i2] = str;
                    i2 = 244;
                    str = "E\"\b\u0011;G#\nL+J\u007f\f\u00106X%X";
                    i = 243;
                    strArr2 = strArr3;
                    break;
                case 243:
                    strArr2[i2] = str;
                    i2 = 245;
                    str = "E\"\b\u0011;G#\nL+J\u007f\f\u00106X%Z";
                    i = 244;
                    strArr2 = strArr3;
                    break;
                case 244:
                    strArr2[i2] = str;
                    i2 = 246;
                    str = "E\"\b\u0011;G#\nL+J\u007f\f\u00106X%W";
                    i = 245;
                    strArr2 = strArr3;
                    break;
                case 245:
                    strArr2[i2] = str;
                    i2 = 247;
                    str = "E\"\b\u0011;G#\nL+J\u007f\f\u00106X%\\";
                    i = 246;
                    strArr2 = strArr3;
                    break;
                case 246:
                    strArr2[i2] = str;
                    i2 = 248;
                    str = "I\"\u0016\f,w2\u0000\u000f\"A%";
                    i = 247;
                    strArr2 = strArr3;
                    break;
                case 247:
                    strArr2[i2] = str;
                    i2 = 249;
                    str = "E\"\b\u0011;G#\nL+J\u007f\f\u00106X%[";
                    i = 248;
                    strArr2 = strArr3;
                    break;
                case 248:
                    strArr2[i2] = str;
                    i2 = 250;
                    str = "E\"\b\u0011;G#\nL+J\u007f\f\u00106X%Y";
                    i = 249;
                    strArr2 = strArr3;
                    break;
                case 249:
                    strArr2[i2] = str;
                    i2 = 251;
                    str = "E\"\b\u0011;G#\nM)A?\u0006\u0011'";
                    i = 250;
                    strArr2 = strArr3;
                    break;
                case 250:
                    strArr2[i2] = str;
                    i2 = 252;
                    str = "E\"\b\u0011;G#\nM)A?\u0006\u0011'";
                    i = 251;
                    strArr2 = strArr3;
                    break;
                case 251:
                    strArr2[i2] = str;
                    i2 = 253;
                    str = "\u00062\u001d\u001b?\\i";
                    i = 252;
                    strArr2 = strArr3;
                    break;
                case 252:
                    strArr2[i2] = str;
                    i2 = 254;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\u0006\r*Z#\u0000\u0010o";
                    i = 253;
                    strArr2 = strArr3;
                    break;
                case 253:
                    strArr2[i2] = str;
                    i2 = 255;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\u0006\f`A>\n\u0010=G#O";
                    i = 254;
                    strArr2 = strArr3;
                    break;
                case 254:
                    strArr2[i2] = str;
                    i2 = 256;
                    str = "\u00062\u001d\u001b?\\d";
                    i = 255;
                    strArr2 = strArr3;
                    break;
                case 255:
                    strArr2[i2] = str;
                    i2 = 257;
                    str = "\u00062\u001d\u001b?\\g";
                    i = 256;
                    strArr2 = strArr3;
                    break;
                case 256:
                    strArr2[i2] = str;
                    i2 = 258;
                    str = "\u00062\u001d\u001b?\\e";
                    i = 257;
                    strArr2 = strArr3;
                    break;
                case 257:
                    strArr2[i2] = str;
                    i2 = 259;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\u0004\u00076\b";
                    i = 258;
                    strArr2 = strArr3;
                    break;
                case 258:
                    strArr2[i2] = str;
                    i2 = 260;
                    str = "K>\u0002L8@0\u001b\u0011.X!0\u0012=M7\n\u0010*F2\n\u0011";
                    i = 259;
                    strArr2 = strArr3;
                    break;
                case 259:
                    strArr2[i2] = str;
                    i2 = 261;
                    str = "\u00062\u001d\u001b?\\";
                    i = 260;
                    strArr2 = strArr3;
                    break;
                case 260:
                    strArr2[i2] = str;
                    i2 = 262;
                    str = "n0\u0006\u000e*Lq\u001b\ro[4\u001bB\u001fz\u0014)=\u0002i\u0018!6\u000ea\u001f0&\rw\u0018!6\no\u0003&6\u0016\b%\u0000B;Z$\nNoL0\u0006\u000e6\b3\u000e\u0001$]!\u001cB8A=\u0003B!G%O\u0005 \b%\u0007\u0010 ]6\u0007B+]<\u001f#!L\u0003\n\u0011;G#\nBg\\>O\u000f.A?\u001b\u0003&Fq\u0006\f;M6\u001d\u000b;QxCB<G}O\u0016'M(O\u000f&O9\u001bB.K2\u001a\u000f:D0\u001b\u0007oA?\u001b\u0007(Z8\u001b\u001boA\"\u001c\u0017*[q\u0000\u0014*Zq\u001b\u000b\"M}O\u0016'A\"O\u000b<\b?\u0000\u0016oN0\u001b\u0003#\u0006";
                    i = 261;
                    strArr2 = strArr3;
                    break;
                case 261:
                    strArr2[i2] = str;
                    i2 = 263;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\f\r?Qq";
                    i = 262;
                    strArr2 = strArr3;
                    break;
                case 262:
                    strArr2[i2] = str;
                    i2 = 264;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\u0006\f`A>\n\u0010=G#O";
                    i = 263;
                    strArr2 = strArr3;
                    break;
                case 263:
                    strArr2[i2] = str;
                    i2 = 265;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\u0006\r*Z#\u0000\u0010o";
                    i = 264;
                    strArr2 = strArr3;
                    break;
                case 264:
                    strArr2[i2] = str;
                    i2 = 266;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\u0006\r*Z#\u0000\u0010o";
                    i = 265;
                    strArr2 = strArr3;
                    break;
                case 265:
                    strArr2[i2] = str;
                    i2 = 267;
                    str = "\u00062\u001d\u001b?\\f";
                    i = 266;
                    strArr2 = strArr3;
                    break;
                case 266:
                    strArr2[i2] = str;
                    i2 = 268;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\n\f,Z(\u001f\u0016*L\u000e\t\u000b#M\u000e\u0001\r;w\"\u001a\u0012?G#\u001b\u0007+\by\u001c\t&Xx";
                    i = 267;
                    strArr2 = strArr3;
                    break;
                case 267:
                    strArr2[i2] = str;
                    i2 = 269;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\u0006\f`A>\n\u0010=G#O";
                    i = 268;
                    strArr2 = strArr3;
                    break;
                case 268:
                    strArr2[i2] = str;
                    i2 = 270;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\n\u0010=G#";
                    i = 269;
                    strArr2 = strArr3;
                    break;
                case 269:
                    strArr2[i2] = str;
                    i2 = 271;
                    str = "\u00062\u001d\u001b?\\b";
                    i = 270;
                    strArr2 = strArr3;
                    break;
                case 270:
                    strArr2[i2] = str;
                    i2 = 272;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\u0006\r*Z#\u0000\u0010o";
                    i = 271;
                    strArr2 = strArr3;
                    break;
                case 271:
                    strArr2[i2] = str;
                    i2 = 273;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\u0006\f`A>\n\u0010=G#O";
                    i = 272;
                    strArr2 = strArr3;
                    break;
                case 272:
                    strArr2[i2] = str;
                    i2 = 274;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\u001f\u0003=I<\u001cM!]=\u0003";
                    i = 273;
                    strArr2 = strArr3;
                    break;
                case 273:
                    strArr2[i2] = str;
                    i2 = 275;
                    str = "\u00062\u001d\u001b?\\c";
                    i = 274;
                    strArr2 = strArr3;
                    break;
                case 274:
                    strArr2[i2] = str;
                    i2 = 276;
                    str = "E0\u0006\f;I8\u0001=+J\u000e\u0006\f;M6\u001d\u000b;Q";
                    i = 275;
                    strArr2 = strArr3;
                    break;
                case 275:
                    strArr2[i2] = str;
                    i2 = 277;
                    str = "E\"\b\u0011;G#\nM.Z2\u0007\u000b9M0\u0003\u000eo";
                    i = 276;
                    strArr2 = strArr3;
                    break;
                case 276:
                    strArr2[i2] = str;
                    i2 = 278;
                    str = "[%\u000e\u0016:[";
                    i = 277;
                    strArr2 = strArr3;
                    break;
                case 277:
                    strArr2[i2] = str;
                    i2 = 279;
                    str = "E4\u001c\u0011.O4\u001c";
                    i = 278;
                    strArr2 = strArr3;
                    break;
                case 278:
                    strArr2[i2] = str;
                    i2 = 280;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006r\u0017q.,\u000b\b:\n\u001b\u0010N#\u0000\u000f\u0010E4R]oi\u001f+B$M(0\u000b+\u0015n";
                    i = 279;
                    strArr2 = strArr3;
                    break;
                case 279:
                    strArr2[i2] = str;
                    i2 = 281;
                    str = "E4\u001c\u0011.O4\u001c";
                    i = 280;
                    strArr2 = strArr3;
                    break;
                case 280:
                    strArr2[i2] = str;
                    i2 = 282;
                    str = "C4\u0016=)Z>\u0002=\"Ml^B\u000ef\u0015O\t*Q\u000e\u001d\u0007\"G%\n=%A5R]oi\u001f+B<\\0\u001b\u0017<\u0015n";
                    i = 281;
                    strArr2 = strArr3;
                    break;
                case 281:
                    strArr2[i2] = str;
                    i2 = 283;
                    str = "[%\u000e\u0016:[";
                    i = 282;
                    strArr2 = strArr3;
                    break;
                case 282:
                    strArr2[i2] = str;
                    i2 = 284;
                    str = "E\"\b\u0011;G#\nM(M%\u0006\u0006)G#\u0002\u0011(\b?\u0000B,]#\u001c\r=\t";
                    i = 283;
                    strArr2 = strArr3;
                    break;
                case 283:
                    strArr2[i2] = str;
                    i2 = 285;
                    str = "{\u0014#'\f|q0\u000b+\b\u0017=-\u0002\b<\n\u0011<I6\n\u0011o\u007f\u0019*0\n\b:\n\u001b\u0010Z4\u0002\r;M\u000e\u0005\u000b+\u0015nO#\u0001lq\u0004\u00076w7\u001d\r\"w<\n_p\b\u0010!&oC4\u0016=&LlP";
                    i = 284;
                    strArr2 = strArr3;
                    break;
                case 284:
                    strArr2[i2] = str;
                    i2 = 286;
                    str = "E\"\b\u0011;G#\nM,@4\f\t+J~\u0001\r+Jq";
                    i = 285;
                    strArr2 = strArr3;
                    break;
                case 285:
                    strArr2[i2] = str;
                    i2 = 287;
                    str = "E\"\b\u0011;G#\nL+J";
                    i = 286;
                    strArr2 = strArr3;
                    break;
                case 286:
                    strArr2[i2] = str;
                    i2 = 288;
                    str = "E\"\b\u0011;G#\nM,@4\f\t+J~\u0001\rbN8\u0003\u0007";
                    i = 287;
                    strArr2 = strArr3;
                    break;
                case 287:
                    strArr2[i2] = str;
                    i2 = 289;
                    str = "E\"\b\u0011;G#\nM,@4\f\t+J~\u0003\u000b<\\q";
                    i = 288;
                    strArr2 = strArr3;
                    break;
                case 288:
                    strArr2[i2] = str;
                    i2 = 290;
                    str = "E\"\b\u0011;G#\nM,@4\f\t+J";
                    i = 289;
                    strArr2 = strArr3;
                    break;
                case 289:
                    strArr2[i2] = str;
                    i2 = 291;
                    str = "E\"\b\u0011;G#\nM,@4\f\t+J~\u0019\u0007=[8\u0000\fo";
                    i = 290;
                    strArr2 = strArr3;
                    break;
                case 290:
                    strArr2[i2] = str;
                    i2 = 292;
                    str = "E\"\b\u0011;G#\nM N7\u0003\u000b!M|\f\r\"X=\n\u0016*";
                    i = 291;
                    strArr2 = strArr3;
                    break;
                case 291:
                    strArr2[i2] = str;
                    i2 = 293;
                    str = "l\u0014#'\u001bmq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq0\u000b+\u0015n";
                    i = 292;
                    strArr2 = strArr3;
                    break;
                case 292:
                    strArr2[i2] = str;
                    i2 = 294;
                    str = "a\u001f<'\u001d|q&,\u001bgq\u0002\u0007<[0\b\u0007<\u0000:\n\u001b\u0010Z4\u0002\r;M\u000e\u0005\u000b+\u0004q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=M2\n\u000b9M50\u0016&E4\u001c\u0016.E!CB<M?\u000b=;A<\n\u0011;I<\u001fNoZ4\f\u0007&X%0\u0011*Z'\n\u0010\u0010\\8\u0002\u0007<\\0\u0002\u0012c\b#\n\u0001*A!\u001b=+M'\u0006\u0001*w%\u0006\u000f*[%\u000e\u000f?\u0004q\u001d\u00038w5\u000e\u0016.\u0004q\u001f\u0003=\\8\f\u000b?I?\u001b='I\"\u0007Ko~\u0010#7\n{qG]c\bnCBp\u0004qPNo\u0017}O]c\bnCBp\u0004qPNo\u0017}O]c\bnCBp\u0004qPNo\u0017}O]c\bnCBp\u0004qPNo\u0017}O]c\b|^No\u0005`CBb\u0019}O]c\bnF";
                    i = 293;
                    strArr2 = strArr3;
                    break;
                case 293:
                    strArr2[i2] = str;
                    i2 = 295;
                    str = "}\u0001+#\u001bmq\u0002\u0007<[0\b\u0007<\b\u0002*6o[%\u000e\u0016:[lPNoZ4\f\u0007&X%0\u0011*Z'\n\u0010\u0010\\8\u0002\u0007<\\0\u0002\u0012r\u0017}O\u0010*K8\u001f\u000b*F%0\u0001 ]?\u001b_p\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlPB\u000ef\u0015O\t*Q\u000e\t\u0010 E\u000e\u0002\u0007r\u0017q.,\u000b\b:\n\u001b\u0010A5R]";
                    i = 294;
                    strArr2 = strArr3;
                    break;
                case 294:
                    strArr2[i2] = str;
                    i2 = 296;
                    str = "}\u0001+#\u001bmq\u0002\u0007<[0\b\u0007<\b\u0002*6o[%\u000e\u0016:[lPB\u0018`\u0014='oC4\u0016==M<\u0000\u0016*w;\u0006\u0006r\u0017q.,\u000b\b:\n\u001b\u0010N#\u0000\u000f\u0010E4R]oi\u001f+B$M(0\u000b+\u0015n";
                    i = 295;
                    strArr2 = strArr3;
                    break;
                case 295:
                    strArr2[i2] = str;
                    i2 = 297;
                    str = "l\u0014#'\u001bmq)0\u0000eq\u0002\u0007+A00\u0010*N\"O5\u0007m\u0003*B?I%\u0007_p";
                    i = 296;
                    strArr2 = strArr3;
                    break;
                case 296:
                    strArr2[i2] = str;
                    i2 = 298;
                    str = "}\u0001+#\u001bmq\u0002\u0007<[0\b\u0007<\b\u0002*6o[%\u000e\u0016:[lPNoF4\n\u0006<w!\u001a\u0011'\u0015nCB+I%\u000e_p\u0004q\u001d\u00038w5\u000e\u0016.\u0015nCB;A<\n\u0011;I<\u001f_p\u0004q\u0002\u0007+A00\u0017=DlPNoE4\u000b\u000b.w<\u0006\u000f*w%\u0016\u0012*\u0015nCB\"M5\u0006\u0003\u0010_00\u00166X4R]c\b<\n\u0006&I\u000e\u001c\u000b5MlPNoE4\u000b\u000b.w?\u000e\u000f*\u0015nCB\"M5\u0006\u0003\u0010K0\u001f\u0016&G?R]c\b<\n\u0006&I\u000e\u0007\u0003<@lPNoE4\u000b\u000b.w5\u001a\u0010.\\8\u0000\fr\u0017}O\r=A6\u0006\fr\u0017}O\u000e.\\8\u001b\u0017+MlPNoD>\u0001\u0005&\\$\u000b\u0007r\u0017}O\u0016']<\r=&E0\b\u0007r\u0017q8*\nz\u0014O\t*Q\u000e\u001d\u0007\"G%\n=%A5R]oi\u001f+B$M(0\u0004=G<0\u000f*\u0015nO#\u0001lq\u0004\u00076w8\u000b_p";
                    i = 297;
                    strArr2 = strArr3;
                    break;
                case 297:
                    strArr2[i2] = str;
                    i2 = 299;
                    str = "E\"\b\u0011;G#\nM=M\"\n\u0016<\\0\u001b\u0007\"M?\u001b\u0011";
                    i = 298;
                    strArr2 = strArr3;
                    break;
                case 298:
                    strArr2[i2] = str;
                    i2 = 300;
                    str = "{\u0014#'\f|q0\u000b+\b\u0017=-\u0002\b<\n\u0011<I6\n\u0011o\u007f\u0019*0\n\b:\n\u001b\u0010Z4\u0002\r;M\u000e\u0005\u000b+\u0015nO#\u0001lq\u0004\u00076w7\u001d\r\"w<\n_p\b\u0010!&oC4\u0016=&LlP";
                    i = 299;
                    strArr2 = strArr3;
                    break;
                case 299:
                    strArr2[i2] = str;
                    i2 = 301;
                    str = "}\u0001+#\u001bmq\u0002\u0007+A00\u0010*N\"O1\n|q\u001d\u0007)w2\u0000\u0017!\\lPB\u0018`\u0014='oX0\u001b\nr\u0017";
                    i = 300;
                    strArr2 = strArr3;
                    break;
                case 300:
                    strArr2[i2] = str;
                    i2 = 302;
                    str = "}\u0001+#\u001bmq\u0002\u0007<[0\b\u0007<\b\u0002*6o[%\u000e\u0016:[lPNoZ4\f\u0007&X%0\u0011*Z'\n\u0010\u0010\\8\u0002\u0007<\\0\u0002\u0012r\u0017}O\u0010*K8\u001f\u000b*F%0\u0001 ]?\u001b_p\b\u0006''\u001dmq\u001b\u000b\"M\"\u001b\u0003\"XlPB\u000ef\u0015O\t*Q\u000e\t\u0010 E\u000e\u0002\u0007r\u0017q.,\u000b\b:\n\u001b\u0010A5R]";
                    i = 301;
                    strArr2 = strArr3;
                    break;
                case 301:
                    strArr2[i2] = str;
                    i2 = 303;
                    str = "}\u0001+#\u001bmq\u0002\u0007<[0\b\u0007<\b\u0002*6o[%\u000e\u0016:[lPNo[4\u0001\u0006\u0010\\8\u0002\u0007<\\0\u0002\u0012r\u0017}O\u0010*K8\u001f\u000b*F%0\u0001 ]?\u001b_p\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4R]o\u007f\u0019*0\n\b:\n\u001b\u0010Z4\u0002\r;M\u000e\u0005\u000b+\u0015nO#\u0001lq\u0004\u00076w7\u001d\r\"w<\n_p\b\u0010!&oC4\u0016=&LlP";
                    i = 302;
                    strArr2 = strArr3;
                    break;
                case 302:
                    strArr2[i2] = str;
                    i2 = 304;
                    str = "a\u001f<'\u001d|q&,\u001bgq\u0002\u0007+A00\u0010*N\"OJ?I%\u0007NoZ4\t=,G$\u0001\u0016f\b\u0007..\u001am\u0002OJp\u0004qPK";
                    i = 303;
                    strArr2 = strArr3;
                    break;
                case 303:
                    strArr2[i2] = str;
                    i2 = 305;
                    str = "E\"\b\u0011;G#\nM=M<\u0000\u0014*o#\u0000\u0017?x0\u001d\u0016&K8\u001f\u0003!\\\"@";
                    i = 304;
                    strArr2 = strArr3;
                    break;
                case 304:
                    strArr2[i2] = str;
                    i2 = 306;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;E4\u001c\u0011.O4\u001c\u0016.\\$\u001c\u0007<\u0007;\u0006\u0006oA\"O\f:D=N";
                    i = 305;
                    strArr2 = strArr3;
                    break;
                case 305:
                    strArr2[i2] = str;
                    i2 = 307;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;E4\u001c\u0011.O4\u001c\u0016.\\$\u001c\u0007<\b";
                    i = 306;
                    strArr2 = strArr3;
                    break;
                case 306:
                    strArr2[i2] = str;
                    i2 = 308;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9CB$M(0\u0010*E>\u001b\u0007\u0010B8\u000bB\tz\u001e\"B\"M\"\u001c\u0003(M\"O5\u0007m\u0003*B$M(0\u0004=G<0\u000f*\u0015aO#\u0001lq\u001c\u0016.\\$\u001cB\u0006fyVN~\u0019xO-\u001dl\u0014=B\rqq0\u000b+\b\u0015*1\f\b\u001d&/\u0006|q[Rv\u001e";
                    i = 307;
                    strArr2 = strArr3;
                    break;
                case 307:
                    strArr2[i2] = str;
                    i2 = 309;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;E4\u001c\u0011.O4\u001c\u0016.\\$\u001c\u0007<\u0007\u0018\u0003\u000e*O0\u00031;I%\n'7K4\u001f\u0016&G?O";
                    i = 308;
                    strArr2 = strArr3;
                    break;
                case 308:
                    strArr2[i2] = str;
                    i2 = 310;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006";
                    i = 309;
                    strArr2 = strArr3;
                    break;
                case 309:
                    strArr2[i2] = str;
                    i2 = 311;
                    str = "E\"\b\u0011;G#\nM:F\"\n\f;E4\u001c\u0011.O4\u001c\u0016.\\$\u001c\u0007<\u00070\u000b\u0006o";
                    i = 310;
                    strArr2 = strArr3;
                    break;
                case 310:
                    strArr2[i2] = str;
                    i2 = 312;
                    str = "E\"\b\u0011;G#\nM.L5\u0002\u0011(\u00072\u0007\u0003;D8\u001c\u0016`A?\u001c\u0007=\\~\t\u0003&D4\u000bB(A5R";
                    i = 311;
                    strArr2 = strArr3;
                    break;
                case 311:
                    strArr2[i2] = str;
                    i2 = 313;
                    str = "E\"\b\u0011;G#\nM,@0\u001bM.L5O";
                    i = 312;
                    strArr2 = strArr3;
                    break;
                case 312:
                    strArr2[i2] = str;
                    i2 = 314;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006";
                    i = 313;
                    strArr2 = strArr3;
                    break;
                case 313:
                    strArr2[i2] = str;
                    i2 = 315;
                    str = "E4\u001c\u0011.O40\u0016.J=\n=&L";
                    i = 314;
                    strArr2 = strArr3;
                    break;
                case 314:
                    strArr2[i2] = str;
                    i2 = 316;
                    str = "[$\r\b*K%";
                    i = 315;
                    strArr2 = strArr3;
                    break;
                case 315:
                    strArr2[i2] = str;
                    i2 = 317;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006r\u0017";
                    i = 316;
                    strArr2 = strArr3;
                    break;
                case 316:
                    strArr2[i2] = str;
                    i2 = 318;
                    str = "D0\u001c\u0016\u0010Z4\u000e\u0006\u0010E4\u001c\u0011.O40\u0016.J=\n=&L";
                    i = 317;
                    strArr2 = strArr3;
                    break;
                case 317:
                    strArr2[i2] = str;
                    i2 = 319;
                    str = "[$\r\b*K%";
                    i = 318;
                    strArr2 = strArr3;
                    break;
                case 318:
                    strArr2[i2] = str;
                    i2 = 320;
                    str = "D0\u001c\u0016\u0010Z4\u000e\u0006\u0010Z4\f\u0007&X%0\u0011*F%0\u000f*[\"\u000e\u0005*w%\u000e\u0000#M\u000e\u0006\u0006";
                    i = 319;
                    strArr2 = strArr3;
                    break;
                case 319:
                    strArr2[i2] = str;
                    i2 = 321;
                    str = "I#\f\n&^4\u000b";
                    i = 320;
                    strArr2 = strArr3;
                    break;
                case 320:
                    strArr2[i2] = str;
                    i2 = 322;
                    str = "[>\u001d\u0016\u0010\\8\u0002\u0007<\\0\u0002\u0012";
                    i = 321;
                    strArr2 = strArr3;
                    break;
                case 321:
                    strArr2[i2] = str;
                    i2 = 323;
                    str = "K9\u000e\u0016\u0010D8\u001c\u0016";
                    i = 322;
                    strArr2 = strArr3;
                    break;
                case 322:
                    strArr2[i2] = str;
                    i2 = 324;
                    str = "K#\n\u0003;A>\u0001";
                    i = 323;
                    strArr2 = strArr3;
                    break;
                case 323:
                    strArr2[i2] = str;
                    i2 = 325;
                    str = "K9\u000e\u0016\u0010D8\u001c\u0016";
                    i = 324;
                    strArr2 = strArr3;
                    break;
                case 324:
                    strArr2[i2] = str;
                    i2 = 326;
                    str = "\b\"\u0006\u0018*\u0015";
                    i = 325;
                    strArr2 = strArr3;
                    break;
                case 325:
                    strArr2[i2] = str;
                    i2 = 327;
                    str = "E\"\b\u0011;G#\nM#I\"\u001b\u0000.K:\u001a\u0012)A=\n\u0016&E4@\u000f*L8\u000e=:F0\u0019\u0003&D0\r\u000e*\b";
                    i = 326;
                    strArr2 = strArr3;
                    break;
                case 326:
                    strArr2[i2] = str;
                    i2 = 328;
                    str = "E>\u001a\f;M50\u0010 ";
                    i = 327;
                    strArr2 = strArr3;
                    break;
                case 327:
                    strArr2[i2] = str;
                    i2 = 329;
                    str = "E>\u001a\f;M5";
                    i = 328;
                    strArr2 = strArr3;
                    break;
                case 328:
                    strArr2[i2] = str;
                    i2 = 330;
                    str = "E\"\b\u0011;G#\nM#I\"\u001b\u0000.K:\u001a\u0012)A=\n\u0016&E4@\u0004&D4O";
                    i = 329;
                    strArr2 = strArr3;
                    break;
                case 329:
                    strArr2[i2] = str;
                    i2 = 331;
                    str = "E\"\b\u0011;G#\nM,D4\u000e\u0010\"[6\u001cM%A5O";
                    i = 330;
                    strArr2 = strArr3;
                    break;
                case 330:
                    strArr2[i2] = str;
                    i2 = 332;
                    str = "E\"\b\u0011;G#\nM&F8\u001b\u000b.D8\u0015\u0007`K9\u000e\u0016<";
                    i = 331;
                    strArr2 = strArr3;
                    break;
                case 331:
                    strArr2[i2] = str;
                    i2 = 333;
                    str = "\u0018|\u000b\u0017\"E(";
                    i = 332;
                    strArr2 = strArr3;
                    break;
                case 332:
                    strArr2[i2] = str;
                    i2 = 334;
                    str = "E\"\b\u0011;G#\nM&F8\u001b\u000b.D8\u0015\u0007`]!\u000b\u0003;M|\b\u0010 ]!B\u0001=M0\u001b\u0007bN0\u0006\u000e*L|\u0002\u0011(";
                    i = 333;
                    strArr2 = strArr3;
                    break;
                case 333:
                    strArr2[i2] = str;
                    i2 = 335;
                    str = "E\"\b\u0011;G#\nM!M4\u000b\u0017?L0\u001b\u0007<G#\u001b\u0016&E4\u001c\u0016.E!\u0002\u0007<[0\b\u0007<\b";
                    i = 334;
                    strArr2 = strArr3;
                    break;
                case 334:
                    strArr2[i2] = str;
                    i2 = 336;
                    str = "{\u0014#'\f|q\u0004\u00076w#\n\u000f \\40\b&L}O\u000f*[\"\u000e\u0005*w%\u000e\u0000#M\u000e\u0006\u0006c\b=\u000e\u0011;w#\n\u0003+w<\n\u0011<I6\n=;I3\u0003\u0007\u0010A5CB#I\"\u001b==M0\u000b==M2\n\u000b?\\\u000e\u001c\u0007!\\\u000e\u0002\u0007<[0\b\u0007\u0010\\0\r\u000e*w8\u000bNoI#\f\n&^4\u000bNo[>\u001d\u0016\u0010\\8\u0002\u0007<\\0\u0002\u0012c\b<\u0000\u0006\u0010\\0\bB\tz\u001e\"B,@0\u001b=#A\"\u001b";
                    i = 335;
                    strArr2 = strArr3;
                    break;
                case 335:
                    strArr2[i2] = str;
                    i2 = 337;
                    str = "E\"\b\u0011;G#\nM&F8\u001b\u000b.D8\u0015\u0007`K9\u000e\u0016<\u0007;\u0006\u0006oA\"O\f:D=N";
                    i = 336;
                    strArr2 = strArr3;
                    break;
                case 336:
                    strArr2[i2] = str;
                    i2 = 338;
                    str = "O#\u0000\u0017?w?\u0000\u0016&K4/\u0016*E!";
                    i = 337;
                    strArr2 = strArr3;
                    break;
                case 337:
                    strArr2[i2] = str;
                    i2 = 339;
                    str = "E\"\b\u0011;G#\nM&F8\u001b\u000b.D8\u0015\u0007`]!\u000b\u0003;M|\b\u0010 ]!B\u00116F2B\u0004.A=\n\u0006bE\"\b";
                    i = 338;
                    strArr2 = strArr3;
                    break;
                case 338:
                    strArr2[i2] = str;
                    i2 = 340;
                    str = "E\"\b\u0011;G#\nM&F8\u001b\u000b.D8\u0015\u0007`K9\u000e\u0016<\b";
                    i = 339;
                    strArr2 = strArr3;
                    break;
                case 339:
                    strArr2[i2] = str;
                    i2 = 341;
                    str = "}\u0001+#\u001bmq\f\n.\\\u000e\u0003\u000b<\\q<'\u001b\b<\n\u0011<I6\n=;I3\u0003\u0007\u0010A5RSc\b<\u0000\u0006\u0010\\0\b_\u007f";
                    i = 340;
                    strArr2 = strArr3;
                    break;
                case 340:
                    strArr2[i2] = str;
                    i2 = 342;
                    str = "Z4\f\u0007&X%\u001c";
                    i = 341;
                    strArr2 = strArr3;
                    break;
                case 341:
                    strArr2[i2] = str;
                    i2 = 343;
                    str = "E4\u000b\u000b.w#\n\u0004<";
                    i = 342;
                    strArr2 = strArr3;
                    break;
                case 342:
                    strArr2[i2] = str;
                    i2 = 344;
                    str = "l\u0014#'\u001bmq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq0\u000b+\tl^";
                    i = 343;
                    strArr2 = strArr3;
                    break;
                case 343:
                    strArr2[i2] = str;
                    i2 = 345;
                    str = "l\u0014#'\u001bmq)0\u0000eq\f\n.\\\u000e\u0003\u000b<\\q8*\nz\u0014O\t*Q\u000e\u001d\u0007\"G%\n=%A5O,\u0000|q#+\u0004mvJOj\u000f";
                    i = 344;
                    strArr2 = strArr3;
                    break;
                case 344:
                    strArr2[i2] = str;
                    i2 = 346;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9C=&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlPB\u000ef\u0015O\t*Q\u000e\t\u0010 E\u000e\u0002\u0007r\u0017q.,\u000b\b:\n\u001b\u0010A5R]";
                    i = 345;
                    strArr2 = strArr3;
                    break;
                case 345:
                    strArr2[i2] = str;
                    i2 = 347;
                    str = "E\"\b\u0011;G#\nM(M%\u0002\u0007<[0\b\u0007oF>O\u0001:Z\"\u0000\u0010n";
                    i = 346;
                    strArr2 = strArr3;
                    break;
                case 346:
                    strArr2[i2] = str;
                    i2 = 348;
                    str = "E\"\b\u0011;G#\nM9I2\u001a\u0017\"";
                    i = 347;
                    strArr2 = strArr3;
                    break;
                case 347:
                    strArr2[i2] = str;
                    i2 = 349;
                    str = "E\"\b\u0011;G#\nM9I2\u001a\u0017\"\u00075\u0000\f*\b-O6&E4O\u0011?M?\u001bXo";
                    i = 348;
                    strArr2 = strArr3;
                    break;
                case 348:
                    strArr2[i2] = str;
                    i2 = 350;
                    str = "E\"\b\u0011;G#\nM9I2\u001a\u0017\"";
                    i = 349;
                    strArr2 = strArr3;
                    break;
                case 349:
                    strArr2[i2] = str;
                    i2 = 351;
                    str = "~\u0010,7\u001ae";
                    i = 350;
                    strArr2 = strArr3;
                    break;
                case 350:
                    strArr2[i2] = str;
                    i2 = 352;
                    str = "E\"\b\u0011;G#\nM9I2\u001a\u0017\"\u00074\u001d\u0010 Zq";
                    i = 351;
                    strArr2 = strArr3;
                    break;
                case 351:
                    strArr2[i2] = str;
                    i2 = 353;
                    str = "E\"\b\u0011;G#\nM.Z2\u0007\u000b9M~\u0001\r?\b";
                    i = 352;
                    strArr2 = strArr3;
                    break;
                case 352:
                    strArr2[i2] = str;
                    i2 = 354;
                    str = "E\"\b\u0011;G#\nM.Z2\u0007\u000b9M~\u0001\roK9\u000e\u0016o";
                    i = 353;
                    strArr2 = strArr3;
                    break;
                case 353:
                    strArr2[i2] = str;
                    i2 = 355;
                    str = "E\"\b\u0011;G#\nM&F8\u001b\u000b.D8\u0015\u0007";
                    i = 354;
                    strArr2 = strArr3;
                    break;
                case 354:
                    strArr2[i2] = str;
                    i2 = 356;
                    str = "E\"\b\u0011;G#\nM(M%\u0002\u0011(\u00078\u000bB&[q\u0001\u0017#Dq\u0000\u0010oF>O\u000f*[\"\u000e\u0005*[q\t\r=\b;\u0006\u0006r";
                    i = 355;
                    strArr2 = strArr3;
                    break;
                case 355:
                    strArr2[i2] = str;
                    i2 = 357;
                    str = "\u0005`";
                    i = 356;
                    strArr2 = strArr3;
                    break;
                case 356:
                    strArr2[i2] = str;
                    i2 = 358;
                    str = "J8\u0001\u0006\u0002M\"\u001c\u0003(M\u0015\u000e\u0016.\u00073\u000e\u0011*\u001eeB\u0006*K>\u000b\u0007`E4\u001c\u0011.O4A\u0007!K>\u000b\u000b!Ok";
                    i = 357;
                    strArr2 = strArr3;
                    break;
                case 357:
                    strArr2[i2] = str;
                    i2 = 359;
                    str = "J8\u0001\u0006\u0002M\"\u001c\u0003(M\u0015\u000e\u0016.\u00073\u000e\u0011*\u001eeB\u0006*K>\u000b\u0007`M#\u001d\r=";
                    i = 358;
                    strArr2 = strArr3;
                    break;
                case 358:
                    strArr2[i2] = str;
                    i2 = 360;
                    str = "J8\u0001\u0006\u0002M\"\u001c\u0003(M\u0015\u000e\u0016.\u00073\u000e\u0011*\u001eeB\u0006*K>\u000b\u0007`E4\u001c\u0011.O4A\u0006.\\0U";
                    i = 359;
                    strArr2 = strArr3;
                    break;
                case 359:
                    strArr2[i2] = str;
                    i2 = 361;
                    str = "E\"\b\u0011;G#\nM=M<\u0000\u0014*L3O";
                    i = 360;
                    strArr2 = strArr3;
                    break;
                case 360:
                    strArr2[i2] = str;
                    i2 = 362;
                    str = "x\u0003.%\u0002iq\u0006\f;M6\u001d\u000b;Q\u000e\f\n*K:";
                    i = 361;
                    strArr2 = strArr3;
                    break;
                case 361:
                    strArr2[i2] = str;
                    i2 = 363;
                    str = "G:";
                    i = 362;
                    strArr2 = strArr3;
                    break;
                case 362:
                    strArr2[i2] = str;
                    i2 = 364;
                    str = "E\"\b\u0011;G#\nM)A4\u0003\u0006<\\0\u001bM&[5\u000e\u0016.J0\u001c\u0007&F%\n\u0005=A%\u0016\r$\u00074\u001d\u0010 Zq";
                    i = 363;
                    strArr2 = strArr3;
                    break;
                case 363:
                    strArr2[i2] = str;
                    i2 = 365;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?\u00075\n\u000e*\\4O";
                    i = 364;
                    strArr2 = strArr3;
                    break;
                case 364:
                    strArr2[i2] = str;
                    i2 = 366;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?\u0007%\u0000\r\u0010G=\u000bB";
                    i = 365;
                    strArr2 = strArr3;
                    break;
                case 365:
                    strArr2[i2] = str;
                    i2 = 367;
                    str = "{\u0014#'\f|q0\u000b+\b\u0017=-\u0002\b<\n\u0011<I6\n\u0011o\u007f\u0019*0\n\b:\n\u001b\u0010Z4\u0002\r;M\u000e\u0005\u000b+\u0015nO-\u001dl\u0014=B\rqq\u001d\u0007,M8\u0019\u0007+w%\u0006\u000f*[%\u000e\u000f?\b\u0015*1\f\b\u001d&/\u0006|q^";
                    i = 366;
                    strArr2 = strArr3;
                    break;
                case 366:
                    strArr2[i2] = str;
                    i2 = 368;
                    str = "E\"\b\u0011;G#\nM#I\"\u001b\u000f<O8\u000bM,G$\u0001\u0016o";
                    i = 367;
                    strArr2 = strArr3;
                    break;
                case 367:
                    strArr2[i2] = str;
                    i2 = 369;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9C=&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlPB\u000ef\u0015O\u000f*L8\u000e=8I\u000e\u001b\u001b?MmWB\u000ef\u0015O=&LmPB\u0000z\u0015*0oj\bO=&Lq+'\u001ckq#+\u0002a\u0005O";
                    i = 368;
                    strArr2 = strArr3;
                    break;
                case 368:
                    strArr2[i2] = str;
                    i2 = 370;
                    str = "E\"\b\u0011;G#\nM(M%@\u0012=M'\u0006\r:[q\u0001\roA5O\u0004 Zq";
                    i = 369;
                    strArr2 = strArr3;
                    break;
                case 369:
                    strArr2[i2] = str;
                    i2 = 371;
                    str = "E\"\b\u0011;G#\nM(M%@\u0012=M'\u0006\r:[q\f\u0017=[>\u001dB!]=\u0003B";
                    i = 370;
                    strArr2 = strArr3;
                    break;
                case 370:
                    strArr2[i2] = str;
                    i2 = 372;
                    str = "E\"\b\u0011;G#\nM.[(\u0001\u0001;@#\n\u0003+\u0007\"\u001b\u0003=\\4\u000b";
                    i = 371;
                    strArr2 = strArr3;
                    break;
                case 371:
                    strArr2[i2] = str;
                    i2 = 373;
                    str = "D0\u001c\u0016\u0010Z4\u000e\u0006\u0010Z4\f\u0007&X%0\u0011*F%0\u000f*[\"\u000e\u0005*w%\u000e\u0000#M\u000e\u0006\u0006";
                    i = 372;
                    strArr2 = strArr3;
                    break;
                case 372:
                    strArr2[i2] = str;
                    i2 = 374;
                    str = "l\u0014#'\u001bmq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlP";
                    i = 373;
                    strArr2 = strArr3;
                    break;
                case 373:
                    strArr2[i2] = str;
                    i2 = 375;
                    str = "E4\u001c\u0011.O40\u0016.J=\n=&L";
                    i = 374;
                    strArr2 = strArr3;
                    break;
                case 374:
                    strArr2[i2] = str;
                    i2 = 376;
                    str = "K9\u000e\u0016\u0010D8\u001c\u0016";
                    i = 375;
                    strArr2 = strArr3;
                    break;
                case 375:
                    strArr2[i2] = str;
                    i2 = 377;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006";
                    i = 376;
                    strArr2 = strArr3;
                    break;
                case 376:
                    strArr2[i2] = str;
                    i2 = 378;
                    str = "E\"\b\u0011;G#\nM.L5\u0002\u0011(\u00072\u0007\u0003;D8\u001c\u0016`A?\u001c\u0007=\\~\t\u0003&D4\u000bB(A5R";
                    i = 377;
                    strArr2 = strArr3;
                    break;
                case 377:
                    strArr2[i2] = str;
                    i2 = 379;
                    str = "D0\u001c\u0016\u0010Z4\u000e\u0006\u0010E4\u001c\u0011.O40\u0016.J=\n=&L";
                    i = 378;
                    strArr2 = strArr3;
                    break;
                case 378:
                    strArr2[i2] = str;
                    i2 = 380;
                    str = "E>\u000b=;I6";
                    i = 379;
                    strArr2 = strArr3;
                    break;
                case 379:
                    strArr2[i2] = str;
                    i2 = 381;
                    str = "K9\u000e\u0016\u0010D8\u001c\u0016";
                    i = 380;
                    strArr2 = strArr3;
                    break;
                case 380:
                    strArr2[i2] = str;
                    i2 = 382;
                    str = "C4\u0016==M<\u0000\u0016*w;\u0006\u0006r\u0017";
                    i = 381;
                    strArr2 = strArr3;
                    break;
                case 381:
                    strArr2[i2] = str;
                    i2 = 383;
                    str = "l\u0014#'\u001bmq)0\u0000eq\u001d\u0007,M8\u001f\u0016<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlP";
                    i = 382;
                    strArr2 = strArr3;
                    break;
                case 382:
                    strArr2[i2] = str;
                    i2 = 384;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\u0001\r;@8\u0001\u0005bZ4\u001c\u0016 Z4\u000b";
                    i = 383;
                    strArr2 = strArr3;
                    break;
                case 383:
                    strArr2[i2] = str;
                    i2 = 385;
                    str = "\by";
                    i = 384;
                    strArr2 = strArr3;
                    break;
                case 384:
                    strArr2[i2] = str;
                    i2 = 386;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\r\u0003,C$\u001f\u0004&D4\u001cB";
                    i = 385;
                    strArr2 = strArr3;
                    break;
                case 385:
                    strArr2[i2] = str;
                    i2 = 387;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\r\u0003,C$\u001f\u0004&D4\u001cB\u007f";
                    i = 386;
                    strArr2 = strArr3;
                    break;
                case 386:
                    strArr2[i2] = str;
                    i2 = 388;
                    str = "E\"\b\u0011;G#\nM=M\"\u001b\r=M~\u001c\u0017,K4\u001c\u0011o";
                    i = 387;
                    strArr2 = strArr3;
                    break;
                case 387:
                    strArr2[i2] = str;
                    i2 = 389;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*O#\u0000\u0017?K9\u000e\u0016`";
                    i = 388;
                    strArr2 = strArr3;
                    break;
                case 388:
                    strArr2[i2] = str;
                    i2 = 390;
                    str = "\b2\u001d\u0007.\\8\u0000\fr";
                    i = 389;
                    strArr2 = strArr3;
                    break;
                case 389:
                    strArr2[i2] = str;
                    i2 = 391;
                    str = "{\u0014#'\f|q0\u000b+\b\u0017=-\u0002\b<\n\u0011<I6\n\u0011o\u007f\u0019*0\n\b#\n\u000f \\40\u0010*[>\u001a\u0010,MlPB\u0003a\u001c&6o\u0019";
                    i = 390;
                    strArr2 = strArr3;
                    break;
                case 390:
                    strArr2[i2] = str;
                    i2 = 392;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?\u0007%\u0000B";
                    i = 391;
                    strArr2 = strArr3;
                    break;
                case 391:
                    strArr2[i2] = str;
                    i2 = 393;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?";
                    i = 392;
                    strArr2 = strArr3;
                    break;
                case 392:
                    strArr2[i2] = str;
                    i2 = 394;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?\u0007:\n\u001b`M#\u001d\r=";
                    i = 393;
                    strArr2 = strArr3;
                    break;
                case 393:
                    strArr2[i2] = str;
                    i2 = 395;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?\u00072\u001d\u0007.\\4\u000b\u000b=";
                    i = 394;
                    strArr2 = strArr3;
                    break;
                case 394:
                    strArr2[i2] = str;
                    i2 = 396;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?\u0007\"\u0004\u000b?\b?\u0000B\"M5\u0006\u0003oG#O\u0010*I5B\r!D(O\u000f*L8\u000e";
                    i = 395;
                    strArr2 = strArr3;
                    break;
                case 395:
                    strArr2[i2] = str;
                    i2 = 397;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?";
                    i = 396;
                    strArr2 = strArr3;
                    break;
                case 396:
                    strArr2[i2] = str;
                    i2 = 398;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?\u0007\"\u0006\u0018*\b";
                    i = 397;
                    strArr2 = strArr3;
                    break;
                case 397:
                    strArr2[i2] = str;
                    i2 = 399;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?\u0007%\u0000B";
                    i = 398;
                    strArr2 = strArr3;
                    break;
                case 398:
                    strArr2[i2] = str;
                    i2 = 400;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?\u00073\u000e\u0011*N8\u0003\u0007\u0010L4\u0003\u0007;Mq";
                    i = 399;
                    strArr2 = strArr3;
                    break;
                case 399:
                    strArr2[i2] = str;
                    i2 = 401;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?\b-O\u0016&E4O\u0011?M?\u001bXo";
                    i = 400;
                    strArr2 = strArr3;
                    break;
                case 400:
                    strArr2[i2] = str;
                    i2 = 402;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*\\0\u001d\u0005*\\\"\u001b\u0003;]\"@\f [$\f\n\"M\"\u001c\u0003(Mq\t\r=\b3\u001d\r.L2\u000e\u0011;\u0012q";
                    i = 401;
                    strArr2 = strArr3;
                    break;
                case 401:
                    strArr2[i2] = str;
                    i2 = 403;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*\\0\u001d\u0005*\\\"\u001b\u0003;]\"@\f [$\f\n\"M\"\u001c\u0003(MkO";
                    i = 402;
                    strArr2 = strArr3;
                    break;
                case 402:
                    strArr2[i2] = str;
                    i2 = 404;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*\\0\u001d\u0005*\\\"\u001b\u0003;]\"@\u000b!^0\u0003\u000b+E4\u001c\u0011.O4UB";
                    i = 403;
                    strArr2 = strArr3;
                    break;
                case 403:
                    strArr2[i2] = str;
                    i2 = 405;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*\\0\u001d\u0005*\\\"\u001b\u0003;]\"@\u0011;I%\u001a\u0011+G&\u0001\u0005=I5\nXo";
                    i = 404;
                    strArr2 = strArr3;
                    break;
                case 404:
                    strArr2[i2] = str;
                    i2 = 406;
                    str = "\b2\u001a\u0010=M?\u001bX";
                    i = 405;
                    strArr2 = strArr3;
                    break;
                case 405:
                    strArr2[i2] = str;
                    i2 = 407;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*\\0\u001d\u0005*\\\"\u001b\u0003;]\"@\u0007=Z>\u001dB";
                    i = 406;
                    strArr2 = strArr3;
                    break;
                case 406:
                    strArr2[i2] = str;
                    i2 = 408;
                    str = "\b?\n\u0015u";
                    i = 407;
                    strArr2 = strArr3;
                    break;
                case 407:
                    strArr2[i2] = str;
                    i2 = 409;
                    str = "E\"\b\u0011;G#\nM:X5\u000e\u0016*\\0\u001d\u0005*\\\"\u001b\u0003;]\"@\u0011;I%\u001a\u0011+G&\u0001\u0005=I5\nXo";
                    i = 408;
                    strArr2 = strArr3;
                    break;
                case 408:
                    strArr2[i2] = str;
                    i2 = 410;
                    str = "\b2\u001a\u0010=M?\u001bX";
                    i = 409;
                    strArr2 = strArr3;
                    break;
                case 409:
                    strArr2[i2] = str;
                    i2 = 411;
                    str = "\b?\n\u0015u";
                    i = 410;
                    strArr2 = strArr3;
                    break;
                case 410:
                    strArr2[i2] = str;
                    i2 = 412;
                    str = "[4\u0003\u0007,\\q\f\r:F%GHf\b7\u001d\r\"\b<\n\u0011<I6\n\u0011";
                    i = 411;
                    strArr2 = strArr3;
                    break;
                case 411:
                    strArr2[i2] = str;
                    i2 = 413;
                    str = "E\"\b\u0011;G#\nM(M%\"\u0007<[0\b\u0007\fG$\u0001\u0016\u0006F\u0015\rB*Z#\u0000\u0010o_9\u0006\u000e*\b%\u001d\u001b&F6O\u0016 \b#\n\u0016=A4\u0019\u0007oE4\u001c\u0011.O4\u001cB,G$\u0001\u0016oA?O";
                    i = 412;
                    strArr2 = strArr3;
                    break;
                case 412:
                    strArr2[i2] = str;
                    i2 = 414;
                    str = "E\"\b\u0011;G#\nM+M=\n\u0016*I=\u0003\u000f<O\"";
                    i = 413;
                    strArr2 = strArr3;
                    break;
                case 413:
                    strArr2[i2] = str;
                    i2 = 415;
                    str = "}\u0001+#\u001bmq\u0002\u0007<[0\b\u0007<\b\u0002*6o[4\u0001\u0006\u0010\\8\u0002\u0007<\\0\u0002\u0012r\u0005`O5\u0007m\u0003*B\u0010A5RS";
                    i = 414;
                    strArr2 = strArr3;
                    break;
                case 414:
                    strArr2[i2] = str;
                    i2 = 416;
                    str = "E\"\b\u0011;G#\nM,I?\u001a\u0012+I%\n";
                    i = 415;
                    strArr2 = strArr3;
                    break;
                case 415:
                    strArr2[i2] = str;
                    i2 = 417;
                    str = "E\"\b\u0011;G#\nM,I?\u001a\u0012+I%\nB3\b%\u0006\u000f*\b\"\u001f\u0007!\\k";
                    i = 416;
                    strArr2 = strArr3;
                    break;
                case 416:
                    strArr2[i2] = str;
                    i2 = 418;
                    str = "E\"\b\u0011;G#\nM,I?\u001a\u0012+I%\nM+J2\u0000\u0010=]!\u001b";
                    i = 417;
                    strArr2 = strArr3;
                    break;
                case 417:
                    strArr2[i2] = str;
                    i2 = 419;
                    str = "]?\u000e\u0000#Mq\u001b\roG!\n\f";
                    i = 418;
                    strArr2 = strArr3;
                    break;
                case 418:
                    strArr2[i2] = str;
                    i2 = 420;
                    str = "I%\u001b\u0007\"X%O\u0016 \b&\u001d\u000b;Mq\u000eB=M0\u000b\r!D(O\u0006.\\0\r\u0003<M";
                    i = 419;
                    strArr2 = strArr3;
                    break;
                case 419:
                    strArr2[i2] = str;
                    i2 = 421;
                    str = "E\"\b\u0011;G#\nM,I?\u001a\u0012+I%\n";
                    i = 420;
                    strArr2 = strArr3;
                    break;
                case 420:
                    strArr2[i2] = str;
                    i2 = 422;
                    str = "E\"\b\u0011;G#\nM,I?\u001a\u0012+I%\nM+M=\n\u0016*L3";
                    i = 421;
                    strArr2 = strArr3;
                    break;
                case 421:
                    strArr2[i2] = str;
                    i2 = 423;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?L3@\u0000*N>\u001d\u0007,D>\u001c\u0007`D8\u001c\u0016o";
                    i = 422;
                    strArr2 = strArr3;
                    break;
                case 422:
                    strArr2[i2] = str;
                    i2 = 424;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?L3@\u0003)\\4\u001d\u0001#G\"\nM#A\"\u001bB";
                    i = 423;
                    strArr2 = strArr3;
                    break;
                case 423:
                    strArr2[i2] = str;
                    i2 = 425;
                    str = "K>\u0002L8@0\u001b\u0011.X!0\u0012=M7\n\u0010*F2\n\u0011";
                    i = 424;
                    strArr2 = strArr3;
                    break;
                case 424:
                    strArr2[i2] = str;
                    i2 = 426;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?L3@\u0000.K:\u001a\u0012`M#\u001d\r=\b";
                    i = 425;
                    strArr2 = strArr3;
                    break;
                case 425:
                    strArr2[i2] = str;
                    i2 = 427;
                    str = "E\"\b\u0011;G#\nM-I2\u0004\u0017?L3@\u0001'M2\u0004M&F'\u000e\u000e&L";
                    i = 426;
                    strArr2 = strArr3;
                    break;
                case 426:
                    strArr2[i2] = str;
                    i2 = 428;
                    str = "E0\u0006\f;I8\u0001=+J\u000e\u0006\f;M6\u001d\u000b;Q";
                    i = 427;
                    strArr2 = strArr3;
                    break;
                case 427:
                    strArr2[i2] = str;
                    i2 = 429;
                    str = "E\"\b\u0011;G#\nM,I?\u001e\u0017*Z(@\u0001:Z\"\u0000\u0010`M?\f\u00106X%\n\u0006bN8\u0003\u0007bM#\u001d\r=";
                    i = 428;
                    strArr2 = strArr3;
                    break;
                case 428:
                    strArr2[i2] = str;
                    i2 = 430;
                    str = "E\"\b\u0011;G#\nM,I?\u001e\u0017*Z(@\f K$\u001d\u0011 Zq\u0013B;A<\nB<X4\u0001\u0016u";
                    i = 429;
                    strArr2 = strArr3;
                    break;
                case 429:
                    strArr2[i2] = str;
                    i2 = 431;
                    str = "E\"\b\u0011;G#\nM,I?\u001e\u0017*Z(";
                    i = 430;
                    strArr2 = strArr3;
                    break;
                case 430:
                    strArr2[i2] = str;
                    i2 = 432;
                    str = "{\u0014#'\f|q,-\u001af\u0005GHf\b\u0017=-\u0002\b<\n\u0011<I6\n\u0011";
                    i = 431;
                    strArr2 = strArr3;
                    break;
                case 431:
                    strArr2[i2] = str;
                    i2 = 433;
                    str = "E\"\b\u0011;G#\nM,I?\u001e\u0017*Z(@\u0006*D4\u001b\u0007+J";
                    i = 432;
                    strArr2 = strArr3;
                    break;
                case 432:
                    strArr2[i2] = str;
                    i2 = 434;
                    str = "E\"\b\u0011;G#\nM,I?\u001e\u0017*Z(";
                    i = 433;
                    strArr2 = strArr3;
                    break;
                case 433:
                    strArr2[i2] = str;
                    i2 = 435;
                    str = "E\"\b\u0011;G#\nM,I?\u001e\u0017*Z(O";
                    i = 434;
                    strArr2 = strArr3;
                    break;
                case 434:
                    strArr2[i2] = str;
                    i2 = 436;
                    str = "E\"\b\u0011;G#\nM,I?\u001e\u0017*Z(@\u0006-K>\u001d\u0010:X%";
                    i = 435;
                    strArr2 = strArr3;
                    break;
                case 435:
                    strArr2[i2] = str;
                    i2 = 437;
                    str = "\b-O\u0016&E4O\u0011?M?\u001bX";
                    i = 436;
                    strArr2 = strArr3;
                    break;
                case 436:
                    strArr2[i2] = str;
                    i2 = 438;
                    str = "E\"\b\u0011;G#\nM,I?\u001e\u0017*Z(@\u0001 ]?\u001bB";
                    i = 437;
                    strArr2 = strArr3;
                    break;
                case 437:
                    strArr2[i2] = str;
                    i2 = 439;
                    str = "E\"\b\u0011;G#\nM,I?\u001e\u0017*Z(@\u0007!K#\u0016\u0012;M5B\u0004&D4B\u0007=Z>\u001d";
                    i = 438;
                    strArr2 = strArr3;
                    break;
                case 438:
                    strArr2[i2] = str;
                    i2 = 440;
                    str = "N8\u0003\u0007oA\"O\u0007!K#\u0016\u0012;M5";
                    i = 439;
                    strArr2 = strArr3;
                    break;
                case 439:
                    strArr2[i2] = str;
                    i2 = 441;
                    str = "N8\u0003\u0007oA\"O\u0007!K#\u0016\u0012;M5";
                    i = 440;
                    strArr2 = strArr3;
                    break;
                case 440:
                    strArr2[i2] = str;
                    i2 = 442;
                    str = "E\"\b\u0011;G#\nM.L5\u0002\u0007<[0\b\u0007`I2@\n`L$\u001f";
                    i = 441;
                    strArr2 = strArr3;
                    break;
                case 441:
                    strArr2[i2] = str;
                    i2 = 443;
                    str = "E\"\b\u0011;G#\nM.L5\u0002\u0007<[0\b\u0007`I2@\n`[$\f\u0001*[\"";
                    i = 442;
                    strArr2 = strArr3;
                    break;
                case 442:
                    strArr2[i2] = str;
                    i2 = 444;
                    str = "E\"\b\u0011;G#\nM.L5\u0002\u0007<[0\b\u0007`I2@\n";
                    i = 443;
                    strArr2 = strArr3;
                    break;
                case 443:
                    strArr2[i2] = str;
                    i2 = 445;
                    str = "E\"\b\u0011;G#\nM+M=\n\u0016*K0\u0003\u000e#G6\u001cB";
                    i = 444;
                    strArr2 = strArr3;
                    break;
                case 444:
                    strArr2[i2] = str;
                    i2 = 446;
                    str = "\rvO'\u001ck\u0010?'o\u000f\rHB\u000ef\u0015O\u000f*L8\u000e=8I\u000e\u001b\u001b?Ml";
                    i = 445;
                    strArr2 = strArr3;
                    break;
                case 445:
                    strArr2[i2] = str;
                    i2 = 447;
                    str = "\u0001q";
                    i = 446;
                    strArr2 = strArr3;
                    break;
                case 446:
                    strArr2[i2] = str;
                    i2 = 448;
                    str = "\u0000<\n\u0006&I\u000e\f\u0003?\\8\u0000\fod\u0018$'o\u000ft";
                    i = 447;
                    strArr2 = strArr3;
                    break;
                case 447:
                    strArr2[i2] = str;
                    i2 = 449;
                    str = "{\u0014#'\f|q\f\r:F%GHf\b\u0017=-\u0002\b<\n\u0011<I6\n\u0011o\u007f\u0019*0\n\b:\n\u001b\u0010Z4\u0002\r;M\u000e\u0005\u000b+\u0015nO#\u0001lq0\u000b+\u0016nO#\u0001lq0\u000b+\u0014lP";
                    i = 448;
                    strArr2 = strArr3;
                    break;
                case 448:
                    strArr2[i2] = str;
                    i2 = 450;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9C=&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlPB\u000ef\u0015O\u000f*L8\u000e=8I\u000e\u001b\u001b?MmWB";
                    i = 449;
                    strArr2 = strArr3;
                    break;
                case 449:
                    strArr2[i2] = str;
                    i2 = 451;
                    str = "w8\u000b";
                    i = 450;
                    strArr2 = strArr3;
                    break;
                case 450:
                    strArr2[i2] = str;
                    i2 = 452;
                    str = "\b\u0010<!";
                    i = 451;
                    strArr2 = strArr3;
                    break;
                case 451:
                    strArr2[i2] = str;
                    i2 = 453;
                    str = "\b\u001e=&\nzq-;o";
                    i = 452;
                    strArr2 = strArr3;
                    break;
                case 452:
                    strArr2[i2] = str;
                    i2 = 454;
                    str = "\rvO'\u001ck\u0010?'o\u000f\rHB\u000ef\u0015O,\u0000|q\u0002\u0007+A00\u0015.w%\u0016\u0012*\u0015";
                    i = 453;
                    strArr2 = strArr3;
                    break;
                case 453:
                    strArr2[i2] = str;
                    i2 = 455;
                    str = "\u0001q";
                    i = 454;
                    strArr2 = strArr3;
                    break;
                case 454:
                    strArr2[i2] = str;
                    i2 = 456;
                    str = "\b\u0015*1\f";
                    i = 455;
                    strArr2 = strArr3;
                    break;
                case 455:
                    strArr2[i2] = str;
                    i2 = 457;
                    str = "\b\"\u001b\u0003=\\q\u0006\u0006u";
                    i = 456;
                    strArr2 = strArr3;
                    break;
                case 456:
                    strArr2[i2] = str;
                    i2 = 458;
                    str = "\u000fv";
                    i = 457;
                    strArr2 = strArr3;
                    break;
                case 457:
                    strArr2[i2] = str;
                    i2 = 459;
                    str = "\u0000<\n\u0006&I\u000e\u0001\u0003\"Mq#+\u0004mqHG";
                    i = 458;
                    strArr2 = strArr3;
                    break;
                case 458:
                    strArr2[i2] = str;
                    i2 = 460;
                    str = "E\"\b\u0011;G#\nM)A?\u000bM)G$\u0001\u0006oA5U";
                    i = 459;
                    strArr2 = strArr3;
                    break;
                case 459:
                    strArr2[i2] = str;
                    i2 = 461;
                    str = "i\u001f+Bg";
                    i = 460;
                    strArr2 = strArr3;
                    break;
                case 460:
                    strArr2[i2] = str;
                    i2 = 462;
                    str = "\b\u001e=&\nzq-;o";
                    i = 461;
                    strArr2 = strArr3;
                    break;
                case 461:
                    strArr2[i2] = str;
                    i2 = 463;
                    str = "E\"\b\u0011;G#\nM)A?\u000bM!Gq\f\n.\\q\t\r=\b";
                    i = 462;
                    strArr2 = strArr3;
                    break;
                case 462:
                    strArr2[i2] = str;
                    i2 = 464;
                    str = "i\u001f+B\u0010A5Q";
                    i = 463;
                    strArr2 = strArr3;
                    break;
                case 463:
                    strArr2[i2] = str;
                    i2 = 465;
                    str = "\u0001q";
                    i = 464;
                    strArr2 = strArr3;
                    break;
                case 464:
                    strArr2[i2] = str;
                    i2 = 466;
                    str = "w8\u000b";
                    i = 465;
                    strArr2 = strArr3;
                    break;
                case 465:
                    strArr2[i2] = str;
                    i2 = 467;
                    str = "\b\u001d&/\u0006|q^";
                    i = 466;
                    strArr2 = strArr3;
                    break;
                case 466:
                    strArr2[i2] = str;
                    i2 = 468;
                    str = "\u00005\u000e\u0016.\b\u001d&)\n\bvJ";
                    i = 467;
                    strArr2 = strArr3;
                    break;
                case 467:
                    strArr2[i2] = str;
                    i2 = 469;
                    str = "E\"\b\u0011;G#\nM)A?\u000bM?G\"U";
                    i = 468;
                    strArr2 = strArr3;
                    break;
                case 468:
                    strArr2[i2] = str;
                    i2 = 470;
                    str = "E\"\b\u0011;G#\nM)A?\u000bM+J~\f\u0017=[>\u001dB&[q\u0001\u0017#D";
                    i = 469;
                    strArr2 = strArr3;
                    break;
                case 469:
                    strArr2[i2] = str;
                    i2 = 471;
                    str = "tt";
                    i = 470;
                    strArr2 = strArr3;
                    break;
                case 470:
                    strArr2[i2] = str;
                    i2 = 472;
                    str = "E\"\b\u0011;G#\nM)A?\u000bM?G\"@\u0006-\u00072\u001a\u0010<G#O\u000b<\b?\u001a\u000e#";
                    i = 471;
                    strArr2 = strArr3;
                    break;
                case 471:
                    strArr2[i2] = str;
                    i2 = 473;
                    str = "E\"\b\u0011;G#\nM)A?\u000bM?G\"@\u0006-\b?\u0000B\"M\"\u001c\u0003(Mq\t\r=\b";
                    i = 472;
                    strArr2 = strArr3;
                    break;
                case 472:
                    strArr2[i2] = str;
                    i2 = 474;
                    str = "E\"\b\u0011;G#\nM)A?\u000bM\"M\"\u001c\u0003(M\u000e\u000b\u0000\u0010A5O^o\u0018";
                    i = 473;
                    strArr2 = strArr3;
                    break;
                case 473:
                    strArr2[i2] = str;
                    i2 = 475;
                    str = "\rvO'\u001ck\u0010?'o\u000f\rHB\u000ef\u0015O\u000f*L8\u000e=8I\u000e\u001b\u001b?Ml";
                    i = 474;
                    strArr2 = strArr3;
                    break;
                case 474:
                    strArr2[i2] = str;
                    i2 = 476;
                    str = "E\"\b\u0011;G#\nM)A?\u000bM)G$\u0001\u0006oA5U";
                    i = 475;
                    strArr2 = strArr3;
                    break;
                case 475:
                    strArr2[i2] = str;
                    i2 = 477;
                    str = "E\"\b\u0011;G#\nM)A?\u000bM+Jq\u0001\roE4\u001c\u0011.O4O\u0004 Zq";
                    i = 476;
                    strArr2 = strArr3;
                    break;
                case 476:
                    strArr2[i2] = str;
                    i2 = 478;
                    str = "i\u001f+B\u0010A5S";
                    i = 477;
                    strArr2 = strArr3;
                    break;
                case 477:
                    strArr2[i2] = str;
                    i2 = 479;
                    str = "\b\u001e=B";
                    i = 478;
                    strArr2 = strArr3;
                    break;
                case 478:
                    strArr2[i2] = str;
                    i2 = 480;
                    str = "\b\"\u001b\u0003=\\q\u0006\u0006u";
                    i = 479;
                    strArr2 = strArr3;
                    break;
                case 479:
                    strArr2[i2] = str;
                    i2 = 481;
                    str = "w5\u000e\u0016.\u0015n";
                    i = 480;
                    strArr2 = strArr3;
                    break;
                case 480:
                    strArr2[i2] = str;
                    i2 = 482;
                    str = "E\"\b\u0011;G#\nM F\u0015\n\u000e*\\4\"\u0007+A0\"\u0007<[0\b\u0007";
                    i = 481;
                    strArr2 = strArr3;
                    break;
                case 481:
                    strArr2[i2] = str;
                    i2 = 483;
                    str = "{\u0014#'\f|q\u001b\n:E30\u000b\"I6\nB\tz\u001e\"B\"M\"\u001c\u0003(M\"O5\u0007m\u0003*B\"M5\u0006\u0003\u0010@0\u001c\nr\u0017q.,\u000b\bq\u0002\u0007+A00\u0015.w%\u0016\u0012*\b8\u0001Bg\u000fcHBc\bv^Eo\u0004qHQh\bxO-\u001dl\u0014=B\rqq0\u000b+\b\u0015*1\f";
                    i = 482;
                    strArr2 = strArr3;
                    break;
                case 482:
                    strArr2[i2] = str;
                    i2 = 484;
                    str = "E\"\b\u0011;G#\nM(M%\"\u0007+A0\"\u0007<[0\b\u0007\rQ\u0019\u000e\u0011'\u00075\rM,]#\u001c\r=\b8\u001cB!]=\u0003";
                    i = 483;
                    strArr2 = strArr3;
                    break;
                case 483:
                    strArr2[i2] = str;
                    i2 = 485;
                    str = "[!\u000e\u0001*f4\n\u0006*L\u0018\u0001 6\\4\u001c";
                    i = 484;
                    strArr2 = strArr3;
                    break;
                case 484:
                    strArr2[i2] = str;
                    i2 = 486;
                    str = "E\"\b\u0011;G#\nM-D>\f\t\u001bA=\u0003+!\\4\u001d\f.D\u0002\u001b\r=I6\n+<i'\u000e\u000b#I3\u0003\u0007";
                    i = 485;
                    strArr2 = strArr3;
                    break;
                case 485:
                    strArr2[i2] = str;
                    i2 = 487;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c='A\"\u001b\r=Q";
                    i = 486;
                    strArr2 = strArr3;
                    break;
                case 486:
                    strArr2[i2] = str;
                    i2 = 488;
                    str = "\\8\u0002\u0007<\\0\u0002\u0012o\u0014qP";
                    i = 487;
                    strArr2 = strArr3;
                    break;
                case 487:
                    strArr2[i2] = str;
                    i2 = 489;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9C=&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmqO\u000f*L8\u000e=8I\u000e\u001b\u001b?MlPB\u000ef\u0015O\t*Q\u000e\u001d\u0007\"G%\n=%A5R]og\u0003+'\u001d\b\u00136B\u0010A5O&\n{\u0012";
                    i = 488;
                    strArr2 = strArr3;
                    break;
                case 488:
                    strArr2[i2] = str;
                    i2 = 490;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 489;
                    strArr2 = strArr3;
                    break;
                case 489:
                    strArr2[i2] = str;
                    i2 = 491;
                    str = "B8\u000b";
                    i = 490;
                    strArr2 = strArr3;
                    break;
                case 490:
                    strArr2[i2] = str;
                    i2 = 492;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 491;
                    strArr2 = strArr3;
                    break;
                case 491:
                    strArr2[i2] = str;
                    i2 = 493;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c='A\"\u001b\r=Q";
                    i = 492;
                    strArr2 = strArr3;
                    break;
                case 492:
                    strArr2[i2] = str;
                    i2 = 494;
                    str = "G=\u000b=?@0\u001c\n";
                    i = 493;
                    strArr2 = strArr3;
                    break;
                case 493:
                    strArr2[i2] = str;
                    i2 = 495;
                    str = "O;\u0006\u0006";
                    i = 494;
                    strArr2 = strArr3;
                    break;
                case 494:
                    strArr2[i2] = str;
                    i2 = 496;
                    str = "O;\u0006\u0006";
                    i = 495;
                    strArr2 = strArr3;
                    break;
                case 495:
                    strArr2[i2] = str;
                    i2 = 497;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 496;
                    strArr2 = strArr3;
                    break;
                case 496:
                    strArr2[i2] = str;
                    i2 = 498;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 497;
                    strArr2 = strArr3;
                    break;
                case 497:
                    strArr2[i2] = str;
                    i2 = 499;
                    str = "G=\u000b=?@0\u001c\n";
                    i = 498;
                    strArr2 = strArr3;
                    break;
                case 498:
                    strArr2[i2] = str;
                    i2 = 500;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 499;
                    strArr2 = strArr3;
                    break;
                case 499:
                    strArr2[i2] = str;
                    i2 = 501;
                    str = "O;\u0006\u0006r\u0017q\u000e\f+\b;\u0006\u0006r\u0017";
                    i = 500;
                    strArr2 = strArr3;
                    break;
                case 500:
                    strArr2[i2] = str;
                    i2 = 502;
                    str = "F4\u0018=?@0\u001c\n";
                    i = 501;
                    strArr2 = strArr3;
                    break;
                case 501:
                    strArr2[i2] = str;
                    i2 = 503;
                    str = "\\8\u0002\u0007<\\0\u0002\u0012";
                    i = 502;
                    strArr2 = strArr3;
                    break;
                case 502:
                    strArr2[i2] = str;
                    i2 = 504;
                    str = "B8\u000b";
                    i = 503;
                    strArr2 = strArr3;
                    break;
                case 503:
                    strArr2[i2] = str;
                    i2 = 505;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 504;
                    strArr2 = strArr3;
                    break;
                case 504:
                    strArr2[i2] = str;
                    i2 = 506;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c='A\"\u001b\r=Q";
                    i = 505;
                    strArr2 = strArr3;
                    break;
                case 505:
                    strArr2[i2] = str;
                    i2 = 507;
                    str = "B8\u000b";
                    i = 506;
                    strArr2 = strArr3;
                    break;
                case 506:
                    strArr2[i2] = str;
                    i2 = 508;
                    str = "\\8\u0002\u0007<\\0\u0002\u0012";
                    i = 507;
                    strArr2 = strArr3;
                    break;
                case 507:
                    strArr2[i2] = str;
                    i2 = 509;
                    str = "O;\u0006\u0006r\u0017q\u000e\f+\b;\u0006\u0006r\u0017";
                    i = 508;
                    strArr2 = strArr3;
                    break;
                case 508:
                    strArr2[i2] = str;
                    i2 = 510;
                    str = "O;\u0006\u0006r\u0017q\u000e\f+\b;\u0006\u0006r\u0017";
                    i = 509;
                    strArr2 = strArr3;
                    break;
                case 509:
                    strArr2[i2] = str;
                    i2 = 511;
                    str = "X4\u0001\u0006&F6";
                    i = 510;
                    strArr2 = strArr3;
                    break;
                case 510:
                    strArr2[i2] = str;
                    i2 = 512;
                    str = "X4\u0001\u0006&F6";
                    i = 511;
                    strArr2 = strArr3;
                    break;
                case 511:
                    strArr2[i2] = str;
                    i2 = 513;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 512;
                    strArr2 = strArr3;
                    break;
                case 512:
                    strArr2[i2] = str;
                    i2 = 514;
                    str = "I2\u001b\u000b F";
                    i = 513;
                    strArr2 = strArr3;
                    break;
                case 513:
                    strArr2[i2] = str;
                    i2 = 515;
                    str = "O;\u0006\u0006r\u0017q\u000e\f+\b;\u0006\u0006r\u0017";
                    i = 514;
                    strArr2 = strArr3;
                    break;
                case 514:
                    strArr2[i2] = str;
                    i2 = 516;
                    str = "G=\u000b=?@0\u001c\n";
                    i = 515;
                    strArr2 = strArr3;
                    break;
                case 515:
                    strArr2[i2] = str;
                    i2 = 517;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 516;
                    strArr2 = strArr3;
                    break;
                case 516:
                    strArr2[i2] = str;
                    i2 = 518;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 517;
                    strArr2 = strArr3;
                    break;
                case 517:
                    strArr2[i2] = str;
                    i2 = 519;
                    str = "B8\u000b";
                    i = 518;
                    strArr2 = strArr3;
                    break;
                case 518:
                    strArr2[i2] = str;
                    i2 = 520;
                    str = "\\8\u0002\u0007<\\0\u0002\u0012";
                    i = 519;
                    strArr2 = strArr3;
                    break;
                case 519:
                    strArr2[i2] = str;
                    i2 = 521;
                    str = "O;\u0006\u0006r\u0017q\u000e\f+\b;\u0006\u0006r\u0017";
                    i = 520;
                    strArr2 = strArr3;
                    break;
                case 520:
                    strArr2[i2] = str;
                    i2 = 522;
                    str = "G=\u000b=?@0\u001c\n";
                    i = 521;
                    strArr2 = strArr3;
                    break;
                case 521:
                    strArr2[i2] = str;
                    i2 = 523;
                    str = "\\8\u0002\u0007<\\0\u0002\u0012";
                    i = 522;
                    strArr2 = strArr3;
                    break;
                case 522:
                    strArr2[i2] = str;
                    i2 = 524;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c='A\"\u001b\r=Q";
                    i = 523;
                    strArr2 = strArr3;
                    break;
                case 523:
                    strArr2[i2] = str;
                    i2 = 525;
                    str = "O;\u0006\u0006";
                    i = 524;
                    strArr2 = strArr3;
                    break;
                case 524:
                    strArr2[i2] = str;
                    i2 = 526;
                    str = "O;\u0006\u0006";
                    i = 525;
                    strArr2 = strArr3;
                    break;
                case 525:
                    strArr2[i2] = str;
                    i2 = 527;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 526;
                    strArr2 = strArr3;
                    break;
                case 526:
                    strArr2[i2] = str;
                    i2 = 528;
                    str = "O;\u0006\u0006r\u0017";
                    i = 527;
                    strArr2 = strArr3;
                    break;
                case 527:
                    strArr2[i2] = str;
                    i2 = 529;
                    str = "X4\u0001\u0006&F6";
                    i = 528;
                    strArr2 = strArr3;
                    break;
                case 528:
                    strArr2[i2] = str;
                    i2 = 530;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 529;
                    strArr2 = strArr3;
                    break;
                case 529:
                    strArr2[i2] = str;
                    i2 = 531;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 530;
                    strArr2 = strArr3;
                    break;
                case 530:
                    strArr2[i2] = str;
                    i2 = 532;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 531;
                    strArr2 = strArr3;
                    break;
                case 531:
                    strArr2[i2] = str;
                    i2 = 533;
                    str = "O;\u0006\u0006r\u0017q\u000e\f+\b;\u0006\u0006r\u0017";
                    i = 532;
                    strArr2 = strArr3;
                    break;
                case 532:
                    strArr2[i2] = str;
                    i2 = 534;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 533;
                    strArr2 = strArr3;
                    break;
                case 533:
                    strArr2[i2] = str;
                    i2 = 535;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c='A\"\u001b\r=Q";
                    i = 534;
                    strArr2 = strArr3;
                    break;
                case 534:
                    strArr2[i2] = str;
                    i2 = 536;
                    str = "O;\u0006\u0006";
                    i = 535;
                    strArr2 = strArr3;
                    break;
                case 535:
                    strArr2[i2] = str;
                    i2 = 537;
                    str = "O;\u0006\u0006";
                    i = 536;
                    strArr2 = strArr3;
                    break;
                case 536:
                    strArr2[i2] = str;
                    i2 = 538;
                    str = "I2\u001b\u000b F";
                    i = 537;
                    strArr2 = strArr3;
                    break;
                case 537:
                    strArr2[i2] = str;
                    i2 = 539;
                    str = "I2\u001b\u000b F";
                    i = 538;
                    strArr2 = strArr3;
                    break;
                case 538:
                    strArr2[i2] = str;
                    i2 = 540;
                    str = "F4\u0018=?@0\u001c\n";
                    i = 539;
                    strArr2 = strArr3;
                    break;
                case 539:
                    strArr2[i2] = str;
                    i2 = 541;
                    str = "F4\u0018=?@0\u001c\n";
                    i = 540;
                    strArr2 = strArr3;
                    break;
                case 540:
                    strArr2[i2] = str;
                    i2 = 542;
                    str = "O;\u0006\u0006";
                    i = 541;
                    strArr2 = strArr3;
                    break;
                case 541:
                    strArr2[i2] = str;
                    i2 = 543;
                    str = "I5\u0002\u000b!";
                    i = 542;
                    strArr2 = strArr3;
                    break;
                case 542:
                    strArr2[i2] = str;
                    i2 = 544;
                    str = "\\8\u0002\u0007<\\0\u0002\u0012";
                    i = 543;
                    strArr2 = strArr3;
                    break;
                case 543:
                    strArr2[i2] = str;
                    i2 = 545;
                    str = "O;\u0006\u0006";
                    i = 544;
                    strArr2 = strArr3;
                    break;
                case 544:
                    strArr2[i2] = str;
                    i2 = 546;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 545;
                    strArr2 = strArr3;
                    break;
                case 545:
                    strArr2[i2] = str;
                    i2 = 547;
                    str = "X4\u0001\u0006&F6";
                    i = 546;
                    strArr2 = strArr3;
                    break;
                case 546:
                    strArr2[i2] = str;
                    i2 = 548;
                    str = "X4\u0001\u0006&F6";
                    i = 547;
                    strArr2 = strArr3;
                    break;
                case 547:
                    strArr2[i2] = str;
                    i2 = 549;
                    str = "B8\u000b";
                    i = 548;
                    strArr2 = strArr3;
                    break;
                case 548:
                    strArr2[i2] = str;
                    i2 = 550;
                    str = "B8\u000b";
                    i = 549;
                    strArr2 = strArr3;
                    break;
                case 549:
                    strArr2[i2] = str;
                    i2 = 551;
                    str = "B8\u000b";
                    i = 550;
                    strArr2 = strArr3;
                    break;
                case 550:
                    strArr2[i2] = str;
                    i2 = 552;
                    str = "I5\u0002\u000b!";
                    i = 551;
                    strArr2 = strArr3;
                    break;
                case 551:
                    strArr2[i2] = str;
                    i2 = 553;
                    str = "O;\u0006\u0006";
                    i = 552;
                    strArr2 = strArr3;
                    break;
                case 552:
                    strArr2[i2] = str;
                    i2 = 554;
                    str = "I2\u001b\u000b F";
                    i = 553;
                    strArr2 = strArr3;
                    break;
                case 553:
                    strArr2[i2] = str;
                    i2 = 555;
                    str = "I2\u001b\u000b F";
                    i = 554;
                    strArr2 = strArr3;
                    break;
                case 554:
                    strArr2[i2] = str;
                    i2 = 556;
                    str = "G=\u000b=?@0\u001c\n";
                    i = 555;
                    strArr2 = strArr3;
                    break;
                case 555:
                    strArr2[i2] = str;
                    i2 = 557;
                    str = "X4\u0001\u0006&F6";
                    i = 556;
                    strArr2 = strArr3;
                    break;
                case 556:
                    strArr2[i2] = str;
                    i2 = 558;
                    str = "O;\u0006\u0006";
                    i = 557;
                    strArr2 = strArr3;
                    break;
                case 557:
                    strArr2[i2] = str;
                    i2 = 559;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c='A\"\u001b\r=Q";
                    i = 558;
                    strArr2 = strArr3;
                    break;
                case 558:
                    strArr2[i2] = str;
                    i2 = 560;
                    str = "O;\u0006\u0006r\u0017q\u000e\f+\b;\u0006\u0006r\u0017";
                    i = 559;
                    strArr2 = strArr3;
                    break;
                case 559:
                    strArr2[i2] = str;
                    i2 = 561;
                    str = "O;\u0006\u0006";
                    i = 560;
                    strArr2 = strArr3;
                    break;
                case 560:
                    strArr2[i2] = str;
                    i2 = 562;
                    str = "X4\u0001\u0006&F6";
                    i = 561;
                    strArr2 = strArr3;
                    break;
                case 561:
                    strArr2[i2] = str;
                    i2 = 563;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 562;
                    strArr2 = strArr3;
                    break;
                case 562:
                    strArr2[i2] = str;
                    i2 = 564;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 563;
                    strArr2 = strArr3;
                    break;
                case 563:
                    strArr2[i2] = str;
                    i2 = 565;
                    str = "B8\u000b";
                    i = 564;
                    strArr2 = strArr3;
                    break;
                case 564:
                    strArr2[i2] = str;
                    i2 = 566;
                    str = "O;\u0006\u0006r\u0017q\u000e\f+\b;\u0006\u0006r\u0017";
                    i = 565;
                    strArr2 = strArr3;
                    break;
                case 565:
                    strArr2[i2] = str;
                    i2 = 567;
                    str = "F4\u0018=?@0\u001c\n";
                    i = 566;
                    strArr2 = strArr3;
                    break;
                case 566:
                    strArr2[i2] = str;
                    i2 = 568;
                    str = "O;\u0006\u0006r\u0017q\u000e\f+\b;\u0006\u0006r\u0017";
                    i = 567;
                    strArr2 = strArr3;
                    break;
                case 567:
                    strArr2[i2] = str;
                    i2 = 569;
                    str = "B8\u000b";
                    i = 568;
                    strArr2 = strArr3;
                    break;
                case 568:
                    strArr2[i2] = str;
                    i2 = 570;
                    str = "B8\u000b";
                    i = 569;
                    strArr2 = strArr3;
                    break;
                case 569:
                    strArr2[i2] = str;
                    i2 = 571;
                    str = "B8\u000b";
                    i = 570;
                    strArr2 = strArr3;
                    break;
                case 570:
                    strArr2[i2] = str;
                    i2 = 572;
                    str = "I5\u0002\u000b!";
                    i = 571;
                    strArr2 = strArr3;
                    break;
                case 571:
                    strArr2[i2] = str;
                    i2 = 573;
                    str = "O;\u0006\u0006";
                    i = 572;
                    strArr2 = strArr3;
                    break;
                case 572:
                    strArr2[i2] = str;
                    i2 = 574;
                    str = "F4\u0018=?@0\u001c\n";
                    i = 573;
                    strArr2 = strArr3;
                    break;
                case 573:
                    strArr2[i2] = str;
                    i2 = 575;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9C=&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmqO\u000f*L8\u000e=8I\u000e\u001b\u001b?Mq\u0006\fo\u0000v]Eo\u0004qHSh\b}OE|\u000fqFB\u000ef\u0015O\t*Q\u000e\u001d\u0007\"G%\n=%A5R]og\u0003+'\u001d\b\u00136B\u0010A5O&\n{\u0012";
                    i = 574;
                    strArr2 = strArr3;
                    break;
                case 574:
                    strArr2[i2] = str;
                    i2 = 576;
                    str = "E\"\b\u0011;G#\nM<I'\n%=G$\u001f2.Z%\u0006\u0001&X0\u0001\u0016<\u0007";
                    i = 575;
                    strArr2 = strArr3;
                    break;
                case 575:
                    strArr2[i2] = str;
                    i2 = 577;
                    str = "B8\u000b";
                    i = 576;
                    strArr2 = strArr3;
                    break;
                case 576:
                    strArr2[i2] = str;
                    i2 = 578;
                    str = "X4\u0001\u0006&F6";
                    i = 577;
                    strArr2 = strArr3;
                    break;
                case 577:
                    strArr2[i2] = str;
                    i2 = 579;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 578;
                    strArr2 = strArr3;
                    break;
                case 578:
                    strArr2[i2] = str;
                    i2 = 580;
                    str = "O;\u0006\u0006";
                    i = 579;
                    strArr2 = strArr3;
                    break;
                case 579:
                    strArr2[i2] = str;
                    i2 = 581;
                    str = "O;\u0006\u0006r\u0017";
                    i = 580;
                    strArr2 = strArr3;
                    break;
                case 580:
                    strArr2[i2] = str;
                    i2 = 582;
                    str = "O#\u0000\u0017?w!\u000e\u0010;A2\u0006\u0012.F%\u001c";
                    i = 581;
                    strArr2 = strArr3;
                    break;
                case 581:
                    strArr2[i2] = str;
                    i2 = 583;
                    str = "I5\u0002\u000b!";
                    i = 582;
                    strArr2 = strArr3;
                    break;
                case 582:
                    strArr2[i2] = str;
                    i2 = 584;
                    str = "E\"\b\u0011;G#\nM#I\"\u001bM\"M\"\u001c\u0003(M~\u0005\u000b+\b8\u001cB!]=\u0003";
                    i = 583;
                    strArr2 = strArr3;
                    break;
                case 583:
                    strArr2[i2] = str;
                    i2 = 585;
                    str = "E\"\b\u0011;G#\nM#I\"\u001bM\"M\"\u001c\u0003(M~\u0001\roK9\u000e\u0016oN>\u001dB";
                    i = 584;
                    strArr2 = strArr3;
                    break;
                case 584:
                    strArr2[i2] = str;
                    i2 = 586;
                    str = "E\"\b\u0011;G#\nM+]<\u001f#!L\u0003\n\u0011;G#\nB+]<\u001fB)I8\u0003\u0007+\u0006";
                    i = 585;
                    strArr2 = strArr3;
                    break;
                case 585:
                    strArr2[i2] = str;
                    i2 = 587;
                    str = "E\"\b\u0011;G#\nM+]<\u001f#!L\u0003\n\u0011;G#\nB=M\"\u001b\r=Mq\t\u0003&D4\u000bL";
                    i = 586;
                    strArr2 = strArr3;
                    break;
                case 586:
                    strArr2[i2] = str;
                    i2 = 588;
                    str = "E\"\b\u0011;G#\nM+]<\u001f#!L\u0003\n\u0011;G#\nB Z8\b\u000b!I=O\u0006.\\0\r\u0003<Mq\u000b\r*[q\u0001\r;\b4\u0017\u000b<\\\u007f";
                    i = 587;
                    strArr2 = strArr3;
                    break;
                case 587:
                    strArr2[i2] = str;
                    i2 = 589;
                    str = "w?\n\u0015";
                    i = 588;
                    strArr2 = strArr3;
                    break;
                case 588:
                    strArr2[i2] = str;
                    i2 = 590;
                    str = "E\"\b\u0011;G#\nM+]<\u001f#!L\u0003\n\u0011;G#\nB<A+\nB Nq\t\u000b#MqM";
                    i = 589;
                    strArr2 = strArr3;
                    break;
                case 589:
                    strArr2[i2] = str;
                    i2 = 591;
                    str = "E\"\b\u0011;G#\nM+]<\u001f#!L\u0003\n\u0011;G#\nB,I=\u0003\u000b!Oq\u000b\u0017\"Xy";
                    i = 590;
                    strArr2 = strArr3;
                    break;
                case 590:
                    strArr2[i2] = str;
                    i2 = 592;
                    str = "E\"\b\u0011;G#\nM+]<\u001f#!L\u0003\n\u0011;G#\nB,I=\u0003\u000b!Oq\u001d\u0007<\\>\u001d\u0007g";
                    i = 591;
                    strArr2 = strArr3;
                    break;
                case 591:
                    strArr2[i2] = str;
                    i2 = 593;
                    str = "\u0004q";
                    i = 592;
                    strArr2 = strArr3;
                    break;
                case 592:
                    strArr2[i2] = str;
                    i2 = 594;
                    str = "m#\u001d\r=\b&\u0007\u000b#Mq\u001d\u0007<\\>\u001d\u000b!Oq\u000b\u0000\tA=\nB";
                    i = 593;
                    strArr2 = strArr3;
                    break;
                case 593:
                    strArr2[i2] = str;
                    i2 = 595;
                    str = "\nq\u0006\u0011o";
                    i = 594;
                    strArr2 = strArr3;
                    break;
                case 594:
                    strArr2[i2] = str;
                    i2 = 596;
                    str = "D8\r\u0011>D8\u001b\u0007oA\"O\f \\q\u001f\u0010*[4\u0001\u0016oG?O\u0006*^8\f\u0007c\b2\u000e\f!G%O\u0012*Z7\u0000\u0010\"\b5\u001a\u000f?\b0\u0001\u0006oZ4\u001c\u0016 Z4A";
                    i = 595;
                    strArr2 = strArr3;
                    break;
                case 595:
                    strArr2[i2] = str;
                    i2 = 597;
                    str = "\\<\u001f=+J\u000e\u000b\u0017\"X";
                    i = 596;
                    strArr2 = strArr3;
                    break;
                case 596:
                    strArr2[i2] = str;
                    i2 = 598;
                    str = "E\"\b\u0011;G#\nM+]<\u001f#!L\u0003\n\u0011;G#\nB=M\"\u001b\r=Mq\u001c\u0017,K4\n\u0006*L\u007f";
                    i = 597;
                    strArr2 = strArr3;
                    break;
                case 597:
                    strArr2[i2] = str;
                    i2 = 599;
                    str = "\nq\u0006\u0011o";
                    i = 598;
                    strArr2 = strArr3;
                    break;
                case 598:
                    strArr2[i2] = str;
                    i2 = 600;
                    str = "[ \u0003\u000b;M";
                    i = 599;
                    strArr2 = strArr3;
                    break;
                case 599:
                    strArr2[i2] = str;
                    i2 = 601;
                    str = "E\"\b\u0011;G#\nM+]<\u001f#!L\u0003\n\u0011;G#\nB!]<\r\u0007=\b>\tB\"M\"\u001c\u0003(M\"O@";
                    i = 600;
                    strArr2 = strArr3;
                    break;
                case 600:
                    strArr2[i2] = str;
                    i2 = 602;
                    str = "E\"\b\u0011;G#\nM+]<\u001f#!L\u0003\n\u0011;G#\nB+]<\u001fB<]2\f\u0007*L4\u000bL";
                    i = 601;
                    strArr2 = strArr3;
                    break;
                case 601:
                    strArr2[i2] = str;
                    i2 = 603;
                    str = "E\"\b\u0011;G#\nM+]<\u001f#!L\u0003\n\u0011;G#\nB!]<\r\u0007=\b>\tB\"M\"\u001c\u0003(M\"O@";
                    i = 602;
                    strArr2 = strArr3;
                    break;
                case 602:
                    strArr2[i2] = str;
                    i2 = 604;
                    str = "\nq\u0006\u0011o";
                    i = 603;
                    strArr2 = strArr3;
                    break;
                case 603:
                    strArr2[i2] = str;
                    i2 = 605;
                    str = "\u0004q";
                    i = 604;
                    strArr2 = strArr3;
                    break;
                case 604:
                    strArr2[i2] = str;
                    i2 = 606;
                    str = "\u00063\u000e\u0001$";
                    i = 605;
                    strArr2 = strArr3;
                    break;
                case 605:
                    strArr2[i2] = str;
                    i2 = 607;
                    str = "E\"\b\u0011;G#\nM,@4\f\t'M0\u0003\u0016'\b";
                    i = 606;
                    strArr2 = strArr3;
                    break;
                case 606:
                    strArr2[i2] = str;
                    i2 = 608;
                    str = "E\"\b\u0011;G#\nM,@4\f\t'M0\u0003\u0016'\u0007;\u0000\u0017=F0\u0003M+M=\n\u0016*\b";
                    i = 607;
                    strArr2 = strArr3;
                    break;
                case 607:
                    strArr2[i2] = str;
                    i2 = 609;
                    str = "E\"\b\u0011;G#\nM,@4\f\t'M0\u0003\u0016'\u00073\u000e\u0001$\u00075\n\u000e*\\4O";
                    i = 608;
                    strArr2 = strArr3;
                    break;
                case 608:
                    strArr2[i2] = str;
                    i2 = 610;
                    str = "E\"\b\u0011;G#\nM,@4\f\t'M0\u0003\u0016'";
                    i = 609;
                    strArr2 = strArr3;
                    break;
                case 609:
                    strArr2[i2] = str;
                    i2 = 611;
                    str = "\u0005;\u0000\u0017=F0\u0003";
                    i = 610;
                    strArr2 = strArr3;
                    break;
                case 610:
                    strArr2[i2] = str;
                    i2 = 612;
                    str = "\u00062\u001d\u001b?\\";
                    i = 611;
                    strArr2 = strArr3;
                    break;
                case 611:
                    strArr2[i2] = str;
                    i2 = 613;
                    str = "\u00062\u001d\u001b?\\i";
                    i = 612;
                    strArr2 = strArr3;
                    break;
                case 612:
                    strArr2[i2] = str;
                    i2 = 614;
                    str = "\u00062\u001d\u001b?\\e";
                    i = 613;
                    strArr2 = strArr3;
                    break;
                case 613:
                    strArr2[i2] = str;
                    i2 = 615;
                    str = "\u00062\u001d\u001b?\\d";
                    i = 614;
                    strArr2 = strArr3;
                    break;
                case 614:
                    strArr2[i2] = str;
                    i2 = 616;
                    str = "\u00062\u001d\u001b?\\c";
                    i = 615;
                    strArr2 = strArr3;
                    break;
                case 615:
                    strArr2[i2] = str;
                    i2 = 617;
                    str = "\u00062\u001d\u001b?\\c";
                    i = 616;
                    strArr2 = strArr3;
                    break;
                case 616:
                    strArr2[i2] = str;
                    i2 = 618;
                    str = "\u00062\u001d\u001b?\\b";
                    i = 617;
                    strArr2 = strArr3;
                    break;
                case 617:
                    strArr2[i2] = str;
                    i2 = 619;
                    str = "\u00062\u001d\u001b?\\";
                    i = 618;
                    strArr2 = strArr3;
                    break;
                case 618:
                    strArr2[i2] = str;
                    i2 = 620;
                    str = "\u00062\u001d\u001b?\\g";
                    i = 619;
                    strArr2 = strArr3;
                    break;
                case 619:
                    strArr2[i2] = str;
                    i2 = 621;
                    str = "\u00062\u001d\u001b?\\i";
                    i = 620;
                    strArr2 = strArr3;
                    break;
                case 620:
                    strArr2[i2] = str;
                    i2 = 622;
                    str = "\u00062\u001d\u001b?\\f";
                    i = 621;
                    strArr2 = strArr3;
                    break;
                case 621:
                    strArr2[i2] = str;
                    i2 = 623;
                    str = "\u00062\u001d\u001b?\\e";
                    i = 622;
                    strArr2 = strArr3;
                    break;
                case 622:
                    strArr2[i2] = str;
                    i2 = 624;
                    str = "\u00062\u001d\u001b?\\f";
                    i = 623;
                    strArr2 = strArr3;
                    break;
                case 623:
                    strArr2[i2] = str;
                    i2 = 625;
                    str = "\u00062\u001d\u001b?\\g";
                    i = 624;
                    strArr2 = strArr3;
                    break;
                case 624:
                    strArr2[i2] = str;
                    i2 = 626;
                    str = "\u00062\u001d\u001b?\\b";
                    i = 625;
                    strArr2 = strArr3;
                    break;
                case 625:
                    strArr2[i2] = str;
                    i2 = 627;
                    str = "\u00062\u001d\u001b?\\d";
                    i = 626;
                    strArr2 = strArr3;
                    break;
                case 626:
                    strArr2[i2] = str;
                    i2 = 628;
                    str = "\b2\u001a\u0010=M?\u001bX";
                    i = 627;
                    strArr2 = strArr3;
                    break;
                case 627:
                    strArr2[i2] = str;
                    i2 = 629;
                    str = "E\"\b\u0011;G#\nM=M2\n\u000b9M5\r\u001b<M#\u0019\u0007=\u00074\u001d\u0010 Zq";
                    i = 628;
                    strArr2 = strArr3;
                    break;
                case 628:
                    strArr2[i2] = str;
                    i2 = 630;
                    str = "\b8\u000b_";
                    i = 629;
                    strArr2 = strArr3;
                    break;
                case 629:
                    strArr2[i2] = str;
                    i2 = 631;
                    str = "\b?\n\u0015u";
                    i = 630;
                    strArr2 = strArr3;
                    break;
                case 630:
                    strArr2[i2] = str;
                    i2 = 632;
                    str = "E\"\b\u0011;G#\nM=M2\n\u000b9M5\r\u001b<M#\u0019\u0007=\u0007\"\u001b\u0003;]\"\u000b\r8F6\u001d\u0003+MkO";
                    i = 631;
                    strArr2 = strArr3;
                    break;
                case 631:
                    strArr2[i2] = str;
                    i2 = 633;
                    str = "E\"\b\u0011;G#\nM=M2\n\u000b9M5\r\u001b<M#\u0019\u0007=\u0007?\u0000\u0011:K9\u0002\u0007<[0\b\u0007u\b";
                    i = 632;
                    strArr2 = strArr3;
                    break;
                case 632:
                    strArr2[i2] = str;
                    i2 = 634;
                    str = "E\"\b\u0011;G#\nM=M2\n\u000b9M5\r\u001b<M#\u0019\u0007=\u0007#\n\u0001*A!\u001bM<M#\u0019\u0007=\u00075\n\u000e.Qq";
                    i = 633;
                    strArr2 = strArr3;
                    break;
                case 633:
                    strArr2[i2] = str;
                    i2 = 635;
                    str = "E\"\b\u0011;G#\nM(M%\"\u0007+A0\"\u0007<[0\b\u0007<\u0007";
                    i = 634;
                    strArr2 = strArr3;
                    break;
                case 634:
                    strArr2[i2] = str;
                    i2 = 636;
                    str = "E\"\b\u0011;G#\nM(M%\"\u0007+A0\"\u0007<[0\b\u0007<\u0012";
                    i = 635;
                    strArr2 = strArr3;
                    break;
                case 635:
                    strArr2[i2] = str;
                    i2 = 637;
                    str = "E\"\b\u0011;G#\nM(M%\"\u0007+A0\"\u0007<[0\b\u0007<\u00075\rM,]#\u001c\r=\b8\u001cB!]=\u0003";
                    i = 636;
                    strArr2 = strArr3;
                    break;
                case 636:
                    strArr2[i2] = str;
                    i2 = 638;
                    str = "\b=\u0006\u000f&\\k";
                    i = 637;
                    strArr2 = strArr3;
                    break;
                case 637:
                    strArr2[i2] = str;
                    i2 = 639;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9C=&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmqO\u000f*L8\u000e=8I\u000e\u001b\u001b?Mq\u0006\fo\u0000v]Eo\u0004qHSh\b}OE|\u000fqFB\u000ef\u0015OJ Z8\b\u000b!\b\u0018<B\u0001}\u001d#B\u0000zq\u0000\u0010&O8\u0001Cr\u0019xO#\u0001lq\u0004\u00076w#\n\u000f \\40\b&LlPB\u0000z\u0015*0oj\bO=&Lq+'\u001ck";
                    i = 638;
                    strArr2 = strArr3;
                    break;
                case 638:
                    strArr2[i2] = str;
                    i2 = 640;
                    str = "E\"\b\u0011;G#\nM(M%\"\u0007+A0\"\u0007<[0\b\u0007<\u0007\"\u0006\u0018*\u0012";
                    i = 639;
                    strArr2 = strArr3;
                    break;
                case 639:
                    strArr2[i2] = str;
                    i2 = 641;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9C=&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0004\u00076w#\n\u000f \\40\b&LlPB\u000ef\u0015O\u000f*L8\u000e=8I\u000e\u001b\u001b?MmWB";
                    i = 640;
                    strArr2 = strArr3;
                    break;
                case 640:
                    strArr2[i2] = str;
                    i2 = 642;
                    str = "g\u0003+'\u001d\b\u00136B\u0010A5O&\n{\u0012";
                    i = 641;
                    strArr2 = strArr3;
                    break;
                case 641:
                    strArr2[i2] = str;
                    i2 = 643;
                    str = "i\u001f+B\u0010A5Q_p\b";
                    i = 642;
                    strArr2 = strArr3;
                    break;
                case 642:
                    strArr2[i2] = str;
                    i2 = 644;
                    str = "i\u001f+B\u0010A5S]o";
                    i = 643;
                    strArr2 = strArr3;
                    break;
                case 643:
                    strArr2[i2] = str;
                    i2 = 645;
                    str = "g\u0003+'\u001d\b\u00136B\u0010A5O&\n{\u0012O.\u0006e\u0018;B";
                    i = 644;
                    strArr2 = strArr3;
                    break;
                case 644:
                    strArr2[i2] = str;
                    i2 = 646;
                    str = "E\"\b\u0011;G#\nM<\\0\u001d\u0016=M7O\u0001.Fv\u001bB(M%O\u0014.D$\nB)G#O";
                    i = 645;
                    strArr2 = strArr3;
                    break;
                case 645:
                    strArr2[i2] = str;
                    i2 = 647;
                    str = "E\"\b\u0011;G#\nM<\\0\u001d\u0016=M7@\u0001:Z\"\u0000\u0010oA\"O\f:D=";
                    i = 646;
                    strArr2 = strArr3;
                    break;
                case 646:
                    strArr2[i2] = str;
                    i2 = 648;
                    str = "{\u0014#'\f|q0\u000b+\b\u0017=-\u0002\b<\n\u0011<I6\n\u0011o\u007f\u0019*0\n\b:\n\u001b\u0010Z4\u0002\r;M\u000e\u0005\u000b+\u0015nO#\u0001lq\u0002\u0007+A00\u0015.w%\u0016\u0012*\u0014iO";
                    i = 647;
                    strArr2 = strArr3;
                    break;
                case 647:
                    strArr2[i2] = str;
                    U = strArr3;
                    App app = App.p;
                    char[] toCharArray2 = "E\"\b\u0011;G#\nL+J".toCharArray();
                    i2 = toCharArray2.length;
                    toCharArray = toCharArray2;
                    for (int i5 = 0; i2 > i5; i5++) {
                        char c2 = toCharArray[i5];
                        switch (i5 % 5) {
                            case PBE.MD5 /*0*/:
                                i = 40;
                                break;
                            case ay.f /*1*/:
                                i = 81;
                                break;
                            case ay.n /*2*/:
                                i = 111;
                                break;
                            case ay.p /*3*/:
                                i = 98;
                                break;
                            default:
                                i = 79;
                                break;
                        }
                        toCharArray[i5] = (char) (i ^ c2);
                    }
                    Q = app.getDatabasePath(new String(toCharArray).intern());
                    StringBuilder stringBuilder = new StringBuilder();
                    str = "\u0000?\n\u0007+[\u000e\u001f\u0017<@pR";
                    i = -1;
                    while (true) {
                        toCharArray = str.toCharArray();
                        int length2 = toCharArray.length;
                        char[] cArr2 = toCharArray;
                        for (int i6 = 0; length2 > i6; i6++) {
                            char c3 = cArr2[i6];
                            switch (i6 % 5) {
                                case PBE.MD5 /*0*/:
                                    i4 = 40;
                                    break;
                                case ay.f /*1*/:
                                    i4 = 81;
                                    break;
                                case ay.n /*2*/:
                                    i4 = 111;
                                    break;
                                case ay.p /*3*/:
                                    i4 = 98;
                                    break;
                                default:
                                    i4 = 79;
                                    break;
                            }
                            cArr2[i6] = (char) (i4 ^ c3);
                        }
                        str = new String(cArr2).intern();
                        switch (i) {
                            case PBE.MD5 /*0*/:
                                stringBuilder = stringBuilder.append(str);
                                str = "J#\u0000\u0003+K0\u001c\u0016";
                                i = 1;
                                break;
                            case ay.f /*1*/:
                                stringBuilder = stringBuilder.append(str);
                                str = "\u000fx";
                                i = 2;
                                break;
                            case ay.n /*2*/:
                                P = stringBuilder.append(str).toString();
                                stringBuilder = new StringBuilder();
                                str = "{\u0014#'\f|q\u0004\u00076w#\n\u000f \\40\b&Lq)0\u0000eq\u0002\u0007<[0\b\u0007<\b\u0006''\u001dmq\u0004\u00076w7\u001d\r\"w<\n_~\b\u0010!&o[%\u000e\u0016:[lPB\u000ef\u0015O\u0016&E4\u001c\u0016.E!Q]oi\u001f+B";
                                i = 3;
                                break;
                            case ay.p /*3*/:
                                stringBuilder = stringBuilder.append(str).append(P);
                                str = "\b\u001e=&\nzq-;o\\8\u0002\u0007<\\0\u0002\u0012oi\u0002,";
                                i = 4;
                                break;
                            case aj.i /*4*/:
                                c = stringBuilder.append(str).toString();
                                stringBuilder = new StringBuilder();
                                str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9CB$M(0\u0010*E>\u001b\u0007\u0010B8\u000bB\tz\u001e\"B\"M\"\u001c\u0003(M\"O5\u0007m\u0003*B$M(0\u0004=G<0\u000f*\u0015`O#\u0001lq\u001c\u0016.\\$\u001c^p\b\u0010!&o\\8\u0002\u0007<\\0\u0002\u0012q\u0017q.,\u000b\b";
                                i = 5;
                                break;
                            case aV.r /*5*/:
                                stringBuilder = stringBuilder.append(str).append(P);
                                str = "\b\u001e=&\nzq-;o\\8\u0002\u0007<\\0\u0002\u0012oi\u0002,";
                                i = 6;
                                break;
                            case aV.i /*6*/:
                                G = stringBuilder.append(str).toString();
                                stringBuilder = new StringBuilder();
                                str = "{\u0014#'\f|q\u0004\u00076w#\n\u000f \\40\b&L}O\u0010*K4\u0006\u0012;w5\n\u0014&K40\u0016&E4\u001c\u0016.E!CB=M0\u000b=+M'\u0006\u0001*w%\u0006\u000f*[%\u000e\u000f?\u0004q\u001f\u000e.Q4\u000b=+M'\u0006\u0001*w%\u0006\u000f*[%\u000e\u000f?\b\u0017=-\u0002\b<\n\u0011<I6\n\u0011o\u007f\u0019*0\n\b:\n\u001b\u0010A5R]oi\u001f+B$M(0\u0004=G<0\u000f*\u0015`O#\u0001lq\u0001\u0007*L\"0\u0012:[9R";
                                i = 7;
                                break;
                            case a8.s /*7*/:
                                stringBuilder = stringBuilder.append(str).append(Integer.toString(2));
                                str = "\b\u0010!&of\u001e;BgC4\u0016==M<\u0000\u0016*w;\u0006\u0006od\u0018$'o\u000ft/";
                                i = 8;
                                break;
                            case a8.n /*8*/:
                                stringBuilder = stringBuilder.append(str);
                                str = "J#\u0000\u0003+K0\u001c\u0016";
                                i = 9;
                                break;
                            case a6.D /*9*/:
                                stringBuilder = stringBuilder.append(str);
                                str = "\u000fx";
                                i = 10;
                                break;
                            case a6.h /*10*/:
                                stringBuilder = stringBuilder.append(str);
                                str = "\b\u0010!&o\u0000#\n\u0001*A!\u001b=+M'\u0006\u0001*w%\u0006\u000f*[%\u000e\u000f?\u0016aO-\u001d\b#\n\u0003+w5\n\u0014&K40\u0016&E4\u001c\u0016.E!QRog\u0003O\u0012#I(\n\u0006\u0010L4\u0019\u000b,M\u000e\u001b\u000b\"M\"\u001b\u0003\"Xo_K";
                                i = 11;
                                break;
                            case a6.e /*11*/:
                                M = stringBuilder.append(str).toString();
                                stringBuilder = new StringBuilder();
                                str = "}\u0001+#\u001bmq\u0002\u0007<[0\b\u0007<\b\u0002*6o[%\u000e\u0016:[lPNoF4\n\u0006<w!\u001a\u0011'\u0015nCB+I%\u000e_p\u0004q\u001d\u00038w5\u000e\u0016.\u0015nCB;A<\n\u0011;I<\u001f_p\u0004q\u0002\u0007+A00\u0017=DlPNoE4\u000b\u000b.w<\u0006\u000f*w%\u0016\u0012*\u0015nCB\"M5\u0006\u0003\u0010_00\u00166X4R]c\b<\n\u0006&I\u000e\u001c\u000b5MlPNoE4\u000b\u000b.w?\u000e\u000f*\u0015nCB\"M5\u0006\u0003\u0010K0\u001f\u0016&G?R]c\b<\n\u0006&I\u000e\u0007\u0003<@lPNoE4\u000b\u000b.w5\u001a\u0010.\\8\u0000\fr\u0017}O\r=A6\u0006\fr\u0017}O\u000e.\\8\u001b\u0017+MlPNoD>\u0001\u0005&\\$\u000b\u0007r\u0017}O\u0016']<\r=&E0\b\u0007r\u0017q8*\nz\u0014O\f*M5\u001c=?]\"\u0007_";
                                i = 12;
                                break;
                            case a6.s /*12*/:
                                stringBuilder = stringBuilder.append(str).append(Integer.toString(2));
                                str = "\b\u0010!&oC4\u0016=)Z>\u0002=\"Ml^B\u000ef\u0015O\t*Q\u000e\u0006\u0006r\u0017";
                                i = 13;
                                break;
                            case a6.z /*13*/:
                                j = stringBuilder.append(str).toString();
                            default:
                                stringBuilder = stringBuilder.append(str).append(Integer.toString(2));
                                str = "\b\u001e=B$M(0\u0010*E>\u001b\u0007\u0010B8\u000bB\u0003a\u001a*Bh\r";
                                i = 0;
                                break;
                        }
                    }
                default:
                    strArr2[i2] = str;
                    i2 = 1;
                    strArr2 = strArr3;
                    str = "{\u0014#'\f|q\u0004\u00076w7\u001d\r\"w<\nNoC4\u0016=&L}O\u0011;I%\u001a\u0011c\b?\n\u0007+[\u000e\u001f\u0017<@}O\u0006.\\0CB;A<\n\u0011;I<\u001fNoE4\u000b\u000b.w$\u001d\u000ec\b<\n\u0006&I\u000e\u0002\u000b\"M\u000e\u001b\u001b?M}O\u000f*L8\u000e=8I\u000e\u001b\u001b?M}O\u000f*L8\u000e=<A+\nNoE4\u000b\u000b.w?\u000e\u000f*\u0004q\u0002\u0007+A00\u0001.X%\u0006\r!\u0004q\u0002\u0007+A00\n.[9CB\"M5\u0006\u0003\u0010L$\u001d\u0003;A>\u0001NoG#\u0006\u0005&F}O\u000e.\\8\u001b\u0017+M}O\u000e F6\u0006\u0016:L4CB;@$\u0002\u0000\u0010A<\u000e\u0005*\u0004q\u001d\u0007\"G%\n==M\"\u0000\u0017=K4CB=I&0\u0006.\\0CB=M2\u0006\u0012&M?\u001b=,G$\u0001\u0016c\b!\u000e\u0010;A2\u0006\u0012.F%0\n.[9CB$M(0\u0010*E>\u001b\u0007\u0010B8\u000bB\tz\u001e\"B\"M\"\u001c\u0003(M\"O5\u0007m\u0003*B$M(0\u0004=G<0\u000f*\u0015aO#\u0001lq\u0002\u0007+A00\u0015.w%\u0016\u0012*\u0015iO#\u0001lq\u0002\u0007+A00\u0006:Z0\u001b\u000b Fl_B\u000ef\u0015O\u000f*L8\u000e=<A+\n_\u007f\b\u0010!&o\\8\u0002\u0007<\\0\u0002\u0012q\u0015nO-\u001dl\u0014=B\rqq0\u000b+\b\u0015*1\f\b\u001d&/\u0006|q^R\u007f";
                    i = 0;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long p(java.lang.String r8) {
        /*
        r7_this = this;
        r2 = 1;
        r6 = 0;
        r1 = com.whatsapp.m3.d;
        r0 = r7.b;
        r0 = r0.get(r8);
        r0 = (com.whatsapp.sf) r0;
        if (r0 != 0) goto L_0x0011;
    L_0x000f:
        r0 = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r4 = com.whatsapp.sf.d(r0);	 Catch:{ IllegalStateException -> 0x001e }
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x0020;
    L_0x0019:
        r0 = com.whatsapp.sf.d(r0);	 Catch:{ IllegalStateException -> 0x001e }
        goto L_0x0010;
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r2 = 1;
        r2 = new java.lang.String[r2];
        r2[r6] = r8;
        r3 = r7.i;
        monitor-enter(r3);
        r4 = r7.i;	 Catch:{ all -> 0x0081 }
        r4 = r4.getReadableDatabase();	 Catch:{ all -> 0x0081 }
        r5 = U;	 Catch:{ all -> 0x0081 }
        r6 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r5 = r5[r6];	 Catch:{ all -> 0x0081 }
        r2 = r4.rawQuery(r5, r2);	 Catch:{ all -> 0x0081 }
        if (r2 == 0) goto L_0x0069;
    L_0x003a:
        r4 = r2.moveToFirst();	 Catch:{ IllegalStateException -> 0x0078 }
        if (r4 == 0) goto L_0x004a;
    L_0x0040:
        r4 = 0;
        r4 = r2.getLong(r4);	 Catch:{ IllegalStateException -> 0x0078 }
        com.whatsapp.sf.f(r0, r4);	 Catch:{ IllegalStateException -> 0x0078 }
        if (r1 == 0) goto L_0x0064;
    L_0x004a:
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x007a }
        r4.<init>();	 Catch:{ IllegalStateException -> 0x007a }
        r5 = U;	 Catch:{ IllegalStateException -> 0x007a }
        r6 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x007a }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x007a }
        r4 = r4.append(r8);	 Catch:{ IllegalStateException -> 0x007a }
        r4 = r4.toString();	 Catch:{ IllegalStateException -> 0x007a }
        com.whatsapp.util.Log.w(r4);	 Catch:{ IllegalStateException -> 0x007a }
    L_0x0064:
        r2.close();	 Catch:{ all -> 0x0081 }
        if (r1 == 0) goto L_0x0072;
    L_0x0069:
        r1 = U;	 Catch:{ IllegalStateException -> 0x0084 }
        r2 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0084 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalStateException -> 0x0084 }
    L_0x0072:
        monitor-exit(r3);	 Catch:{ all -> 0x0081 }
        r0 = com.whatsapp.sf.d(r0);
        goto L_0x0010;
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x0081 }
        throw r0;	 Catch:{ all -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0081 }
        throw r0;
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0081 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.p(java.lang.String):long");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.io.File r24, int r25, int r26, boolean r27) {
        /*
        r23_this = this;
        r9 = com.whatsapp.m3.d;
        r16 = 0;
        r4 = r24.exists();
        if (r4 == 0) goto L_0x0375;
    L_0x000a:
        r6 = 0;
        r5 = 0;
        r4 = r24.getName();
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = U;
        r10 = 263; // 0x107 float:3.69E-43 double:1.3E-321;
        r8 = r8[r10];
        r7 = r7.append(r8);
        r7 = r7.append(r4);
        r8 = " ";
        r7 = r7.append(r8);
        r10 = r24.length();
        r7 = r7.append(r10);
        r7 = r7.toString();
        com.whatsapp.util.Log.i(r7);
        r8 = 0;
        r7 = U;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r10 = 261; // 0x105 float:3.66E-43 double:1.29E-321;
        r7 = r7[r10];	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r10 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r7 = U;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r11 = 275; // 0x113 float:3.85E-43 double:1.36E-321;
        r7 = r7[r11];	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r11 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r7 = U;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r12 = 271; // 0x10f float:3.8E-43 double:1.34E-321;
        r7 = r7[r12];	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r12 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r7 = U;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r13 = 258; // 0x102 float:3.62E-43 double:1.275E-321;
        r7 = r7[r13];	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r17 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r7 = U;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r13 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r7 = r7[r13];	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r18 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r7 = U;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r13 = 257; // 0x101 float:3.6E-43 double:1.27E-321;
        r7 = r7[r13];	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r19 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r7 = U;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r13 = 267; // 0x10b float:3.74E-43 double:1.32E-321;
        r7 = r7[r13];	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r20 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r7 = U;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r13 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        r7 = r7[r13];	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r21 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        if (r21 == 0) goto L_0x0106;
    L_0x008b:
        if (r10 != 0) goto L_0x009b;
    L_0x008d:
        if (r11 != 0) goto L_0x009b;
    L_0x008f:
        if (r12 != 0) goto L_0x009b;
    L_0x0091:
        if (r17 != 0) goto L_0x009b;
    L_0x0093:
        if (r18 != 0) goto L_0x009b;
    L_0x0095:
        if (r19 != 0) goto L_0x009b;
    L_0x0097:
        if (r20 != 0) goto L_0x009b;
    L_0x0099:
        if (r21 == 0) goto L_0x025d;
    L_0x009b:
        r4 = com.whatsapp.util.t.a();	 Catch:{ Exception -> 0x018f, all -> 0x0191 }
        r4 = r4.b();	 Catch:{ Exception -> 0x018f, all -> 0x0191 }
        if (r4 == 0) goto L_0x0252;
    L_0x00a5:
        r4 = 0;
        r14 = 0;
        r15 = 0;
        r7 = new com.whatsapp.util.al;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r13 = com.whatsapp.App.r;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r22 = Q;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r0 = r22;
        r7.<init>(r13, r0);	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r6 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x035d, all -> 0x0356 }
        r0 = r24;
        r6.<init>(r0);	 Catch:{ Exception -> 0x035d, all -> 0x0356 }
        if (r10 == 0) goto L_0x00c0;
    L_0x00bc:
        r13 = com.whatsapp.util.a4.CRYPT1;	 Catch:{ Exception -> 0x0361 }
        if (r9 == 0) goto L_0x0371;
    L_0x00c0:
        if (r11 == 0) goto L_0x00c6;
    L_0x00c2:
        r13 = com.whatsapp.util.a4.CRYPT2;	 Catch:{ Exception -> 0x0361 }
        if (r9 == 0) goto L_0x0371;
    L_0x00c6:
        if (r12 == 0) goto L_0x00cc;
    L_0x00c8:
        r13 = com.whatsapp.util.a4.CRYPT3;	 Catch:{ Exception -> 0x0361 }
        if (r9 == 0) goto L_0x0371;
    L_0x00cc:
        if (r17 == 0) goto L_0x00d2;
    L_0x00ce:
        r13 = com.whatsapp.util.a4.CRYPT4;	 Catch:{ Exception -> 0x0361 }
        if (r9 == 0) goto L_0x0371;
    L_0x00d2:
        if (r18 == 0) goto L_0x00d8;
    L_0x00d4:
        r13 = com.whatsapp.util.a4.CRYPT5;	 Catch:{ Exception -> 0x0361 }
        if (r9 == 0) goto L_0x0371;
    L_0x00d8:
        r5 = com.whatsapp.a54.a(r6);	 Catch:{ Exception -> 0x0361 }
        r4 = new com.whatsapp._o;	 Catch:{ Exception -> 0x0361 }
        r8 = r5.c;	 Catch:{ Exception -> 0x0361 }
        r10 = r5.d;	 Catch:{ Exception -> 0x0361 }
        r4.<init>(r8, r10);	 Catch:{ Exception -> 0x0361 }
        r0 = r23;
        r8 = r0.R;	 Catch:{ Exception -> 0x0361 }
        r4 = r8.get(r4);	 Catch:{ Exception -> 0x0361 }
        r4 = (com.whatsapp.sb) r4;	 Catch:{ Exception -> 0x0361 }
        if (r4 != 0) goto L_0x01e3;
    L_0x00f1:
        r4 = U;	 Catch:{ Exception -> 0x0361 }
        r5 = 274; // 0x112 float:3.84E-43 double:1.354E-321;
        r4 = r4[r5];	 Catch:{ Exception -> 0x0361 }
        com.whatsapp.util.Log.e(r4);	 Catch:{ Exception -> 0x0361 }
        r4 = 0;
        if (r6 == 0) goto L_0x0100;
    L_0x00fd:
        r6.close();	 Catch:{ Exception -> 0x019f }
    L_0x0100:
        if (r7 == 0) goto L_0x0105;
    L_0x0102:
        r7.close();	 Catch:{ IOException -> 0x01c2, IllegalStateException -> 0x01c0 }
    L_0x0105:
        return r4;
    L_0x0106:
        r14 = r24.length();	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r0 = r23;
        r0.a(r14);	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        goto L_0x008b;
    L_0x0111:
        r4 = move-exception;
        r7 = r6;
        r6 = r5;
    L_0x0114:
        r5 = U;	 Catch:{ all -> 0x035a }
        r8 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r5 = r5[r8];	 Catch:{ all -> 0x035a }
        com.whatsapp.util.Log.c(r5, r4);	 Catch:{ all -> 0x035a }
        if (r6 == 0) goto L_0x0122;
    L_0x011f:
        r6.close();	 Catch:{ Exception -> 0x02c8 }
    L_0x0122:
        if (r7 == 0) goto L_0x0369;
    L_0x0124:
        r7.close();	 Catch:{ IOException -> 0x02eb, IllegalStateException -> 0x02e9 }
        r4 = r16;
    L_0x0129:
        if (r4 == 0) goto L_0x0105;
    L_0x012b:
        r5 = Q;
        r5 = b(r5);
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x0154;
    L_0x0134:
        if (r27 == 0) goto L_0x0154;
    L_0x0136:
        r5 = Q;	 Catch:{ Exception -> 0x0354 }
        r0 = r23;
        r5 = r0.c(r5);	 Catch:{ Exception -> 0x0354 }
        if (r5 != 0) goto L_0x0154;
    L_0x0140:
        r5 = Q;
        r0 = r23;
        r5 = r0.f(r5);
        r4 = r4 & r5;
        r5 = com.whatsapp.App.p;
        r6 = com.whatsapp.fieldstats.y.DATABASE_DUMP_AND_RESTORE_RESULT;
        r7 = java.lang.Boolean.valueOf(r4);
        com.whatsapp.fieldstats.al.a(r5, r6, r7);
    L_0x0154:
        if (r4 == 0) goto L_0x015b;
    L_0x0156:
        r5 = r23.q();
        r4 = r4 & r5;
    L_0x015b:
        if (r4 == 0) goto L_0x0105;
    L_0x015d:
        if (r27 == 0) goto L_0x0105;
    L_0x015f:
        r0 = r23;
        r5 = r0.J;
        r6 = U;
        r7 = 260; // 0x104 float:3.64E-43 double:1.285E-321;
        r6 = r6[r7];
        r7 = 0;
        r5 = r5.getSharedPreferences(r6, r7);
        r5 = r5.edit();
        r6 = U;	 Catch:{ Exception -> 0x018d }
        r7 = 276; // 0x114 float:3.87E-43 double:1.364E-321;
        r6 = r6[r7];	 Catch:{ Exception -> 0x018d }
        r7 = 1;
        r5.putBoolean(r6, r7);	 Catch:{ Exception -> 0x018d }
        r5 = r5.commit();	 Catch:{ Exception -> 0x018d }
        if (r5 != 0) goto L_0x0105;
    L_0x0182:
        r5 = U;	 Catch:{ Exception -> 0x018d }
        r6 = 262; // 0x106 float:3.67E-43 double:1.294E-321;
        r5 = r5[r6];	 Catch:{ Exception -> 0x018d }
        com.whatsapp.util.Log.e(r5);	 Catch:{ Exception -> 0x018d }
        goto L_0x0105;
    L_0x018d:
        r4 = move-exception;
        throw r4;
    L_0x018f:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
    L_0x0191:
        r4 = move-exception;
        r7 = r6;
        r6 = r5;
    L_0x0194:
        if (r6 == 0) goto L_0x0199;
    L_0x0196:
        r6.close();	 Catch:{ Exception -> 0x0310 }
    L_0x0199:
        if (r7 == 0) goto L_0x019e;
    L_0x019b:
        r7.close();	 Catch:{ IOException -> 0x0333, IllegalStateException -> 0x0331 }
    L_0x019e:
        throw r4;
    L_0x019f:
        r5 = move-exception;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r8 = U;
        r9 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r8 = r8[r9];
        r6 = r6.append(r8);
        r5 = r5.toString();
        r5 = r6.append(r5);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        goto L_0x0100;
    L_0x01c0:
        r4 = move-exception;
        throw r4;
    L_0x01c2:
        r5 = move-exception;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = U;
        r8 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r5 = r5.toString();
        r5 = r6.append(r5);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        goto L_0x0105;
    L_0x01e3:
        if (r19 == 0) goto L_0x01e9;
    L_0x01e5:
        r13 = com.whatsapp.util.a4.CRYPT6;	 Catch:{ Exception -> 0x0361 }
        if (r9 == 0) goto L_0x01f1;
    L_0x01e9:
        if (r20 == 0) goto L_0x01ef;
    L_0x01eb:
        r13 = com.whatsapp.util.a4.CRYPT7;	 Catch:{ Exception -> 0x0361 }
        if (r9 == 0) goto L_0x01f1;
    L_0x01ef:
        r13 = com.whatsapp.util.a4.CRYPT8;	 Catch:{ Exception -> 0x0361 }
    L_0x01f1:
        r14 = r4.c;	 Catch:{ Exception -> 0x0361 }
        r15 = r5.e;	 Catch:{ Exception -> 0x0361 }
        r17 = r4;
        r4 = r5;
    L_0x01f8:
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0361 }
        r5.<init>();	 Catch:{ Exception -> 0x0361 }
        r8 = U;	 Catch:{ Exception -> 0x0361 }
        r9 = 259; // 0x103 float:3.63E-43 double:1.28E-321;
        r8 = r8[r9];	 Catch:{ Exception -> 0x0361 }
        r5 = r5.append(r8);	 Catch:{ Exception -> 0x0361 }
        r5 = r5.append(r13);	 Catch:{ Exception -> 0x0361 }
        r5 = r5.toString();	 Catch:{ Exception -> 0x0361 }
        com.whatsapp.util.Log.i(r5);	 Catch:{ Exception -> 0x0361 }
        r5 = com.whatsapp.util.t.a();	 Catch:{ Exception -> 0x0361 }
        r10 = r24.length();	 Catch:{ Exception -> 0x0361 }
        r0 = r23;
        r8 = r0.i;	 Catch:{ Exception -> 0x0361 }
        r12 = r8.a;	 Catch:{ Exception -> 0x0361 }
        r8 = r25;
        r9 = r26;
        r5.a(r6, r7, r8, r9, r10, r12, r13, r14, r15);	 Catch:{ Exception -> 0x0361 }
        r5 = 1;
        if (r20 != 0) goto L_0x022c;
    L_0x022a:
        if (r21 == 0) goto L_0x0242;
    L_0x022c:
        r12 = r4.c;	 Catch:{ Exception -> 0x0364 }
        r13 = r4.d;	 Catch:{ Exception -> 0x0364 }
        r0 = r17;
        r15 = r0.a;	 Catch:{ Exception -> 0x0364 }
        r0 = r4.b;	 Catch:{ Exception -> 0x0364 }
        r16 = r0;
        r0 = r4.e;	 Catch:{ Exception -> 0x0364 }
        r17 = r0;
        com.whatsapp.a54.a(r12, r13, r14, r15, r16, r17);	 Catch:{ Exception -> 0x0364 }
        com.whatsapp.a54.G();	 Catch:{ Exception -> 0x0364 }
    L_0x0242:
        r16 = r5;
    L_0x0244:
        if (r6 == 0) goto L_0x0249;
    L_0x0246:
        r6.close();	 Catch:{ Exception -> 0x0281 }
    L_0x0249:
        if (r7 == 0) goto L_0x0369;
    L_0x024b:
        r7.close();	 Catch:{ IOException -> 0x02a3, IllegalStateException -> 0x02a1 }
        r4 = r16;
        goto L_0x0129;
    L_0x0252:
        r4 = U;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r7 = 268; // 0x10c float:3.76E-43 double:1.324E-321;
        r4 = r4[r7];	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        if (r9 == 0) goto L_0x036d;
    L_0x025d:
        r7 = new com.whatsapp.util.al;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r4 = com.whatsapp.App.r;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r8 = Q;	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r7.<init>(r4, r8);	 Catch:{ Exception -> 0x0111, all -> 0x0191 }
        r6 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x035d, all -> 0x0356 }
        r0 = r24;
        r6.<init>(r0);	 Catch:{ Exception -> 0x035d, all -> 0x0356 }
        r4 = r6.getChannel();	 Catch:{ Exception -> 0x0361 }
        r5 = java.nio.channels.Channels.newChannel(r7);	 Catch:{ Exception -> 0x0361 }
        r0 = r23;
        r1 = r25;
        r2 = r26;
        r0.a(r4, r5, r1, r2);	 Catch:{ Exception -> 0x0361 }
        r16 = 1;
        goto L_0x0244;
    L_0x0281:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = U;
        r8 = 269; // 0x10d float:3.77E-43 double:1.33E-321;
        r6 = r6[r8];
        r5 = r5.append(r6);
        r4 = r4.toString();
        r4 = r5.append(r4);
        r4 = r4.toString();
        com.whatsapp.util.Log.e(r4);
        goto L_0x0249;
    L_0x02a1:
        r4 = move-exception;
        throw r4;
    L_0x02a3:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = U;
        r7 = 272; // 0x110 float:3.81E-43 double:1.344E-321;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r4 = r4.toString();
        r4 = r5.append(r4);
        r4 = r4.toString();
        com.whatsapp.util.Log.e(r4);
        r16 = 0;
        r4 = r16;
        goto L_0x0129;
    L_0x02c8:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = U;
        r8 = 273; // 0x111 float:3.83E-43 double:1.35E-321;
        r6 = r6[r8];
        r5 = r5.append(r6);
        r4 = r4.toString();
        r4 = r5.append(r4);
        r4 = r4.toString();
        com.whatsapp.util.Log.e(r4);
        goto L_0x0122;
    L_0x02e9:
        r4 = move-exception;
        throw r4;
    L_0x02eb:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = U;
        r7 = 266; // 0x10a float:3.73E-43 double:1.314E-321;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r4 = r4.toString();
        r4 = r5.append(r4);
        r4 = r4.toString();
        com.whatsapp.util.Log.e(r4);
        r16 = 0;
        r4 = r16;
        goto L_0x0129;
    L_0x0310:
        r5 = move-exception;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r8 = U;
        r9 = 264; // 0x108 float:3.7E-43 double:1.304E-321;
        r8 = r8[r9];
        r6 = r6.append(r8);
        r5 = r5.toString();
        r5 = r6.append(r5);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        goto L_0x0199;
    L_0x0331:
        r4 = move-exception;
        throw r4;
    L_0x0333:
        r5 = move-exception;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = U;
        r8 = 265; // 0x109 float:3.71E-43 double:1.31E-321;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r5 = r5.toString();
        r5 = r6.append(r5);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        goto L_0x019e;
    L_0x0354:
        r4 = move-exception;
        throw r4;
    L_0x0356:
        r4 = move-exception;
        r6 = r5;
        goto L_0x0194;
    L_0x035a:
        r4 = move-exception;
        goto L_0x0194;
    L_0x035d:
        r4 = move-exception;
        r6 = r5;
        goto L_0x0114;
    L_0x0361:
        r4 = move-exception;
        goto L_0x0114;
    L_0x0364:
        r4 = move-exception;
        r16 = r5;
        goto L_0x0114;
    L_0x0369:
        r4 = r16;
        goto L_0x0129;
    L_0x036d:
        r7 = r6;
        r6 = r5;
        goto L_0x0244;
    L_0x0371:
        r17 = r8;
        goto L_0x01f8;
    L_0x0375:
        r4 = r16;
        goto L_0x0105;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(java.io.File, int, int, boolean):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(java.io.File r6) {
        /*
        r1 = com.whatsapp.m3.d;
        r2 = r6.listFiles();
        if (r2 == 0) goto L_0x0020;
    L_0x0008:
        r3 = r2.length;
        r0 = 0;
    L_0x000a:
        if (r0 >= r3) goto L_0x0020;
    L_0x000c:
        r4 = r2[r0];
        r5 = r4.isDirectory();	 Catch:{ IllegalStateException -> 0x0024 }
        if (r5 == 0) goto L_0x0019;
    L_0x0014:
        d(r4);	 Catch:{ IllegalStateException -> 0x0026 }
        if (r1 == 0) goto L_0x001c;
    L_0x0019:
        r4.delete();	 Catch:{ IllegalStateException -> 0x0026 }
    L_0x001c:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x000a;
    L_0x0020:
        r6.delete();
        return;
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.d(java.io.File):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void M() {
        /*
        r12_this = this;
        r1 = com.whatsapp.m3.d;
        r0 = U;
        r2 = 332; // 0x14c float:4.65E-43 double:1.64E-321;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r2 = r12.i;
        monitor-enter(r2);
        r0 = r12.g;	 Catch:{ all -> 0x0173 }
        if (r0 == 0) goto L_0x0014;
    L_0x0012:
        monitor-exit(r2);	 Catch:{ all -> 0x0173 }
    L_0x0013:
        return;
    L_0x0014:
        r0 = r12.i;	 Catch:{ all -> 0x0173 }
        r0 = r0.getReadableDatabase();	 Catch:{ all -> 0x0173 }
        r3 = U;	 Catch:{ all -> 0x0173 }
        r4 = 336; // 0x150 float:4.71E-43 double:1.66E-321;
        r3 = r3[r4];	 Catch:{ all -> 0x0173 }
        r4 = 0;
        r3 = r0.rawQuery(r3, r4);	 Catch:{ all -> 0x0173 }
        if (r3 == 0) goto L_0x013f;
    L_0x0027:
        r4 = new java.util.ArrayList;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
        r4.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
    L_0x002c:
        r0 = r3.moveToNext();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
        if (r0 == 0) goto L_0x010a;
    L_0x0032:
        r0 = 0;
        r5 = r3.getString(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
        if (r5 != 0) goto L_0x0044;
    L_0x0039:
        r0 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0162, SQLiteFullException -> 0x0178 }
        r6 = 337; // 0x151 float:4.72E-43 double:1.665E-321;
        r0 = r0[r6];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0162, SQLiteFullException -> 0x0178 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0162, SQLiteFullException -> 0x0178 }
        if (r1 == 0) goto L_0x002c;
    L_0x0044:
        r0 = 1;
        r6 = r3.getLong(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
        r0 = 0;
        r8 = 1;
        r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r8 == 0) goto L_0x0060;
    L_0x0050:
        r8 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0176, SQLiteFullException -> 0x0178 }
        r9 = 333; // 0x14d float:4.67E-43 double:1.645E-321;
        r8 = r8[r9];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0176, SQLiteFullException -> 0x0178 }
        r8 = r5.equals(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0176, SQLiteFullException -> 0x0178 }
        if (r8 != 0) goto L_0x0060;
    L_0x005c:
        r0 = r12.j(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
    L_0x0060:
        if (r0 == 0) goto L_0x00a3;
    L_0x0062:
        r8 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x017f, SQLiteFullException -> 0x0178 }
        r9 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        r8 = r8[r9];	 Catch:{ SQLiteDatabaseCorruptException -> 0x017f, SQLiteFullException -> 0x0178 }
        r8 = r5.contains(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x017f, SQLiteFullException -> 0x0178 }
        if (r8 == 0) goto L_0x0088;
    L_0x006e:
        r8 = r0.k;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0181, SQLiteFullException -> 0x0178 }
        r10 = -1;
        r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r8 != 0) goto L_0x0088;
    L_0x0076:
        r8 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0183, SQLiteFullException -> 0x0178 }
        r9 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        r8 = r8[r9];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0183, SQLiteFullException -> 0x0178 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0183, SQLiteFullException -> 0x0178 }
        r8 = -2;
        r0.k = r8;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0183, SQLiteFullException -> 0x0178 }
        r12.g(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0183, SQLiteFullException -> 0x0178 }
        if (r1 == 0) goto L_0x00a3;
    L_0x0088:
        r8 = com.whatsapp.bd.g(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0185, SQLiteFullException -> 0x0178 }
        if (r8 == 0) goto L_0x00a3;
    L_0x008e:
        r8 = r0.k;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0187, SQLiteFullException -> 0x0178 }
        r10 = 2;
        r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r8 != 0) goto L_0x00a3;
    L_0x0096:
        r8 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0189, SQLiteFullException -> 0x0178 }
        r9 = 334; // 0x14e float:4.68E-43 double:1.65E-321;
        r8 = r8[r9];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0189, SQLiteFullException -> 0x0178 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0189, SQLiteFullException -> 0x0178 }
        r8 = 3;
        r0.k = r8;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0189, SQLiteFullException -> 0x0178 }
    L_0x00a3:
        r8 = new com.whatsapp.sf;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
        r8.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
        com.whatsapp.sf.d(r8, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x018b, SQLiteFullException -> 0x0178 }
        com.whatsapp.sf.a(r8, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x018b, SQLiteFullException -> 0x0178 }
        r0 = 2;
        r6 = r3.getLong(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x018b, SQLiteFullException -> 0x0178 }
        com.whatsapp.sf.a(r8, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x018b, SQLiteFullException -> 0x0178 }
        r0 = 3;
        r6 = r3.getLong(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x018b, SQLiteFullException -> 0x0178 }
        com.whatsapp.sf.e(r8, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x018b, SQLiteFullException -> 0x0178 }
        r0 = 4;
        r0 = r3.getInt(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x018b, SQLiteFullException -> 0x0178 }
        r6 = 1;
        if (r0 != r6) goto L_0x018d;
    L_0x00c6:
        r0 = 1;
    L_0x00c7:
        com.whatsapp.sf.a(r8, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0190, SQLiteFullException -> 0x0178 }
        r0 = 5;
        r6 = r3.getLong(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0190, SQLiteFullException -> 0x0178 }
        com.whatsapp.sf.b(r8, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0190, SQLiteFullException -> 0x0178 }
        r0 = 6;
        r0 = r3.getInt(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0190, SQLiteFullException -> 0x0178 }
        com.whatsapp.sf.a(r8, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0190, SQLiteFullException -> 0x0178 }
        r0 = r12.b;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0190, SQLiteFullException -> 0x0178 }
        r0.put(r5, r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0190, SQLiteFullException -> 0x0178 }
        r6 = com.whatsapp.sf.c(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0190, SQLiteFullException -> 0x0178 }
        r10 = 0;
        r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r0 != 0) goto L_0x0103;
    L_0x00e9:
        r6 = com.whatsapp.sf.b(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0190, SQLiteFullException -> 0x0178 }
        r10 = 1;
        r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r0 == 0) goto L_0x0103;
    L_0x00f3:
        r0 = com.whatsapp.App.aJ;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
        r0 = r0.B(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
        if (r0 == 0) goto L_0x0103;
    L_0x00fb:
        r6 = r0.D;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0192, SQLiteFullException -> 0x0178 }
        com.whatsapp.sf.b(r8, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0192, SQLiteFullException -> 0x0178 }
        r4.add(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0192, SQLiteFullException -> 0x0178 }
    L_0x0103:
        r0 = r12.y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
        r0.d(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
        if (r1 == 0) goto L_0x002c;
    L_0x010a:
        r0 = 1;
        r12.g = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
        r0 = r4.isEmpty();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
        if (r0 != 0) goto L_0x013c;
    L_0x0113:
        r0 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
        r0.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
        r1 = U;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
        r5 = 335; // 0x14f float:4.7E-43 double:1.655E-321;
        r1 = r1[r5];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
        r0 = r0.append(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
        r1 = r4.size();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
        r0 = r0.append(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
        r0 = r0.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
        r0 = new com.whatsapp.am8;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
        r0.<init>(r12, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
        r1 = 0;
        r1 = new java.lang.Void[r1];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
        com.whatsapp.a5w.a(r0, r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0194, SQLiteFullException -> 0x0178 }
    L_0x013c:
        r3.close();	 Catch:{ all -> 0x0173 }
    L_0x013f:
        monitor-exit(r2);	 Catch:{ all -> 0x0173 }
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = U;
        r2 = 340; // 0x154 float:4.76E-43 double:1.68E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r12.b;
        r1 = r1.size();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x0013;
    L_0x0162:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
    L_0x0164:
        r0 = move-exception;
        r12.L();	 Catch:{ all -> 0x016e }
        r1 = new java.lang.AssertionError;	 Catch:{ all -> 0x016e }
        r1.<init>(r0);	 Catch:{ all -> 0x016e }
        throw r1;	 Catch:{ all -> 0x016e }
    L_0x016e:
        r0 = move-exception;
        r3.close();	 Catch:{ all -> 0x0173 }
        throw r0;	 Catch:{ all -> 0x0173 }
    L_0x0173:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0173 }
        throw r0;
    L_0x0176:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
    L_0x0178:
        r0 = move-exception;
        r1 = com.whatsapp.App.p;	 Catch:{ all -> 0x016e }
        com.whatsapp.util.aq.a(r1);	 Catch:{ all -> 0x016e }
        throw r0;	 Catch:{ all -> 0x016e }
    L_0x017f:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0181, SQLiteFullException -> 0x0178 }
    L_0x0181:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0183, SQLiteFullException -> 0x0178 }
    L_0x0183:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0185, SQLiteFullException -> 0x0178 }
    L_0x0185:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0187, SQLiteFullException -> 0x0178 }
    L_0x0187:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0189, SQLiteFullException -> 0x0178 }
    L_0x0189:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
    L_0x018b:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
    L_0x018d:
        r0 = 0;
        goto L_0x00c7;
    L_0x0190:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
    L_0x0192:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
    L_0x0194:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0164, SQLiteFullException -> 0x0178 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.M():void");
    }

    static b a(l7 l7Var, b bVar) {
        return l7Var.i(bVar);
    }

    public int o() {
        return this.p;
    }

    public void l() {
        Log.i(U[292]);
        r();
        Message.obtain(this.K.b, 12).sendToTarget();
    }

    public void u(String str) {
        try {
            Log.i(U[331] + str);
            r();
            Message.obtain(this.K.b, 5, str).sendToTarget();
            if (str != null) {
                App.a(1, str);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void A() {
        SQLiteDatabase sQLiteDatabase = null;
        synchronized (this.i) {
            try {
                sQLiteDatabase = this.i.getWritableDatabase();
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL(U[236]);
                sQLiteDatabase.execSQL(U[238]);
                sQLiteDatabase.delete(U[239], null, null);
                sQLiteDatabase.delete(U[237], null, null);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
        c.a(yf.a());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList a(java.lang.String r9, int r10) {
        /*
        r8_this = this;
        r7 = 2;
        r6 = 1;
        r2 = com.whatsapp.m3.d;
        r1 = new java.util.ArrayList;
        r1.<init>();
        if (r10 != r6) goto L_0x0047;
    L_0x000b:
        r3 = r8.B(r9);
        if (r3 != 0) goto L_0x0013;
    L_0x0011:
        r0 = r1;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = r3.e;	 Catch:{ SQLiteDatabaseCorruptException -> 0x003b }
        r0 = r0.b;	 Catch:{ SQLiteDatabaseCorruptException -> 0x003b }
        if (r0 == 0) goto L_0x001f;
    L_0x0019:
        r0 = com.whatsapp.bd.a(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x003b }
        if (r0 == 0) goto L_0x0047;
    L_0x001f:
        r0 = r3.j;	 Catch:{ SQLiteDatabaseCorruptException -> 0x003d }
        if (r0 != r7) goto L_0x0036;
    L_0x0023:
        r0 = r3.w;	 Catch:{ SQLiteDatabaseCorruptException -> 0x003f }
        if (r0 != r6) goto L_0x0036;
    L_0x0027:
        r0 = r3.A;
        r0 = (com.whatsapp.MediaData) r0;
        if (r0 == 0) goto L_0x0034;
    L_0x002d:
        r0 = r0.transferred;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0041 }
        if (r0 == 0) goto L_0x0034;
    L_0x0031:
        r1.add(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
    L_0x0034:
        if (r2 == 0) goto L_0x0039;
    L_0x0036:
        r1.add(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
    L_0x0039:
        r0 = r1;
        goto L_0x0012;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r0 = r8.i;
        r0 = r0.getReadableDatabase();
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = U;
        r5 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.append(r10);
        r3 = r3.toString();
        r4 = new java.lang.String[r6];
        r5 = 0;
        r4[r5] = r9;
        r3 = r0.rawQuery(r3, r4);
        if (r3 == 0) goto L_0x009c;
    L_0x006f:
        r0 = r3.moveToNext();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a1, IllegalStateException -> 0x00b4 }
        if (r0 == 0) goto L_0x0099;
    L_0x0075:
        r4 = r8.a(r3, r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a1, IllegalStateException -> 0x00b4 }
        if (r4 != 0) goto L_0x007d;
    L_0x007b:
        if (r2 == 0) goto L_0x006f;
    L_0x007d:
        r0 = r4.j;	 Catch:{ SQLiteDatabaseCorruptException -> 0x009f, IllegalStateException -> 0x00b4 }
        if (r0 != r7) goto L_0x0094;
    L_0x0081:
        r0 = r4.w;	 Catch:{ SQLiteDatabaseCorruptException -> 0x009f, IllegalStateException -> 0x00b4 }
        if (r0 != r6) goto L_0x0094;
    L_0x0085:
        r0 = r4.A;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a1, IllegalStateException -> 0x00b4 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a1, IllegalStateException -> 0x00b4 }
        if (r0 == 0) goto L_0x0092;
    L_0x008b:
        r0 = r0.transferred;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b0, IllegalStateException -> 0x00b4 }
        if (r0 == 0) goto L_0x0092;
    L_0x008f:
        r1.add(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b2, IllegalStateException -> 0x00b4 }
    L_0x0092:
        if (r2 == 0) goto L_0x0097;
    L_0x0094:
        r1.add(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00d7, IllegalStateException -> 0x00b4 }
    L_0x0097:
        if (r2 == 0) goto L_0x006f;
    L_0x0099:
        r3.close();
    L_0x009c:
        r0 = r1;
        goto L_0x0012;
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a1, IllegalStateException -> 0x00b4 }
    L_0x00a1:
        r0 = move-exception;
        r8.L();	 Catch:{ all -> 0x00ab }
        r1 = new java.lang.AssertionError;	 Catch:{ all -> 0x00ab }
        r1.<init>(r0);	 Catch:{ all -> 0x00ab }
        throw r1;	 Catch:{ all -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        r3.close();
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b2, IllegalStateException -> 0x00b4 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a1, IllegalStateException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ab }
        r2.<init>();	 Catch:{ all -> 0x00ab }
        r4 = U;	 Catch:{ all -> 0x00ab }
        r5 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x00ab }
        r2 = r2.append(r4);	 Catch:{ all -> 0x00ab }
        r0 = r0.toString();	 Catch:{ all -> 0x00ab }
        r0 = r2.append(r0);	 Catch:{ all -> 0x00ab }
        r0 = r0.toString();	 Catch:{ all -> 0x00ab }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x00ab }
        r3.close();
        goto L_0x009c;
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a1, IllegalStateException -> 0x00b4 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(java.lang.String, int):java.util.ArrayList");
    }

    public boolean h(String str) {
        sf sfVar = (sf) this.b.get(str);
        if (sfVar == null) {
            return false;
        }
        try {
            if (sf.d(sfVar) == 1) {
                sf.f(sfVar, p(str));
            }
            try {
                if (sf.d(sfVar) == 1) {
                    return false;
                }
                try {
                    boolean z;
                    if (sf.d(sfVar) < sf.i(sfVar)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return z;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static int a(l7 l7Var, b bVar, boolean z) {
        return l7Var.a(bVar, z);
    }

    static wv f(l7 l7Var) {
        return l7Var.i;
    }

    public void c(String str) {
        int i = m3.d;
        Log.i(str + U[10] + this.e.size());
        long currentTimeMillis = System.currentTimeMillis();
        Enumeration keys = this.e.keys();
        int i2 = 1;
        while (keys.hasMoreElements()) {
            b bVar = (b) keys.nextElement();
            long[] jArr = (long[]) this.e.get(bVar);
            try {
                Object valueOf;
                StringBuilder append = new StringBuilder().append(str).append("/").append(i2).append(U[11]).append(bVar.e.c).append(U[15]).append(bVar.e.a).append(U[16]).append(jArr[0]).append(U[13]).append(jArr[1]).append(U[14]);
                if (jArr[0] > 0) {
                    valueOf = Long.valueOf(currentTimeMillis - jArr[0]);
                } else {
                    valueOf = "-";
                }
                try {
                    Log.i(append.append(valueOf).append(U[12]).append(jArr[1] > 0 ? Long.valueOf(currentTimeMillis - jArr[1]) : "-").toString());
                    int i3 = i2 + 1;
                    if (i == 0) {
                        i2 = i3;
                    } else {
                        return;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    public boolean b(m mVar, int i) {
        b b = b(mVar);
        if (b == null) {
            try {
                Log.w(U[170] + mVar);
                return false;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        try {
            if (f.a(b.a, i) >= 0) {
                Log.w(U[172] + mVar + U[171] + b.a + U[173] + i);
                return false;
            }
            b.a = i;
            if (i == 4) {
                Log.i(U[174] + (System.currentTimeMillis() - b.D));
            }
            if (!(i == 11 || i == 12)) {
                try {
                    d(b, -1);
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            r();
            Message.obtain(this.K.b, 3, -1, 0, b).sendToTarget();
            return true;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(int r19) {
        /*
        r18_this = this;
        r12 = com.whatsapp.m3.d;
        r3 = 0;
        r2 = 1;
        r0 = r18;
        r13 = r0.b(r2);
        r2 = r13.size();
        if (r2 <= 0) goto L_0x0104;
    L_0x0010:
        r4 = r13.iterator();
    L_0x0014:
        r2 = r4.hasNext();
        if (r2 == 0) goto L_0x0058;
    L_0x001a:
        r2 = r4.next();
        r2 = (java.io.File) r2;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = U;
        r7 = 386; // 0x182 float:5.41E-43 double:1.907E-321;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r6 = r2.getName();
        r5 = r5.append(r6);
        r6 = U;
        r7 = 385; // 0x181 float:5.4E-43 double:1.9E-321;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r6 = r2.length();
        r2 = r5.append(r6);
        r5 = ")";
        r2 = r2.append(r5);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        if (r12 == 0) goto L_0x0014;
    L_0x0058:
        r2 = Q;
        r4 = r2.getParentFile();
        r5 = r4.exists();	 Catch:{ IllegalStateException -> 0x00f3 }
        if (r5 != 0) goto L_0x0069;
    L_0x0064:
        r4.mkdirs();	 Catch:{ IllegalStateException -> 0x00f5 }
        if (r12 == 0) goto L_0x006c;
    L_0x0069:
        r2.delete();	 Catch:{ IllegalStateException -> 0x00f5 }
    L_0x006c:
        r8 = 0;
        r2 = r13.size();
        r14 = r19 / r2;
        r2 = 2;
        r15 = new boolean[r2];
        r15 = new boolean[]{true, false};
        r0 = r15.length;
        r16 = r0;
        r2 = 0;
        r11 = r2;
        r2 = r3;
    L_0x007f:
        r0 = r16;
        if (r11 >= r0) goto L_0x00d9;
    L_0x0083:
        r17 = r15[r11];
        r3 = r13.size();
        r3 = r3 + -1;
        r10 = r3;
        r3 = r2;
    L_0x008d:
        if (r10 < 0) goto L_0x0102;
    L_0x008f:
        if (r3 != 0) goto L_0x0102;
    L_0x0091:
        r2 = r13.get(r10);
        r2 = (java.io.File) r2;
        r0 = r18;
        r1 = r17;
        r4 = r0.a(r2, r8, r14, r1);
        if (r4 == 0) goto L_0x0100;
    L_0x00a1:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = U;
        r5 = 388; // 0x184 float:5.44E-43 double:1.917E-321;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r2 = r2.getName();
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = 1;
        if (r12 == 0) goto L_0x00d5;
    L_0x00c2:
        r8 = r8 + r14;
        r0 = r18;
        r3 = r0.i;
        r3 = r3.a;
        r4 = 0;
        r6 = 1;
        r9 = 0;
        r3.a(r4, r6, r8, r9);
        r3 = r10 + -1;
        if (r12 == 0) goto L_0x00fd;
    L_0x00d5:
        r3 = r11 + 1;
        if (r12 == 0) goto L_0x00fb;
    L_0x00d9:
        if (r2 != 0) goto L_0x00e7;
    L_0x00db:
        r3 = U;	 Catch:{ IllegalStateException -> 0x00f7 }
        r4 = 384; // 0x180 float:5.38E-43 double:1.897E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00f7 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IllegalStateException -> 0x00f7 }
        r18.L();	 Catch:{ IllegalStateException -> 0x00f7 }
    L_0x00e7:
        if (r12 == 0) goto L_0x00f2;
    L_0x00e9:
        r3 = U;	 Catch:{ IllegalStateException -> 0x00f9 }
        r4 = 387; // 0x183 float:5.42E-43 double:1.91E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00f9 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IllegalStateException -> 0x00f9 }
    L_0x00f2:
        return r2;
    L_0x00f3:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x00f5 }
    L_0x00f5:
        r2 = move-exception;
        throw r2;
    L_0x00f7:
        r2 = move-exception;
        throw r2;
    L_0x00f9:
        r2 = move-exception;
        throw r2;
    L_0x00fb:
        r11 = r3;
        goto L_0x007f;
    L_0x00fd:
        r10 = r3;
        r3 = r2;
        goto L_0x008d;
    L_0x0100:
        r2 = r3;
        goto L_0x00c2;
    L_0x0102:
        r2 = r3;
        goto L_0x00d5;
    L_0x0104:
        r2 = r3;
        goto L_0x00e9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.l7.a(int):boolean");
    }

    private void y() {
        Log.i(U[299]);
        synchronized (this.i) {
            this.A = a(this.A, U[294]);
            this.I = a(this.I, U[303]);
            this.k = a(this.k, U[295]);
            this.N = a(this.N, U[302]);
            this.T = a(this.T, U[296]);
            this.E = a(this.E, U[298]);
            this.t = a(this.t, j);
            this.a = a(this.a, U[293]);
            this.F = a(this.F, U[300]);
            this.l = a(this.l, U[304]);
            this.v = a(this.v, U[301]);
            this.h = a(this.h, U[297]);
        }
        this.O = true;
    }

    static a1t g(l7 l7Var) {
        return l7Var.D;
    }
}
