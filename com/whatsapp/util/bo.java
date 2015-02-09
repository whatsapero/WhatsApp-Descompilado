package com.whatsapp.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.Handler;
import android.support.v4.util.LruCache;
import android.widget.ImageView;
import com.whatsapp.MediaData;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.m;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class bo {
    public static Options d;
    private static final HashMap f;
    private static bf h;
    private static final bo i;
    private static long j;
    private static final String[] z;
    private HashMap a;
    private ab b;
    private Handler c;
    private a8 e;
    private LruCache g;
    private HashSet k;

    public static void a(b bVar, ImageView imageView, bf bfVar) {
        if (imageView != null) {
            try {
                imageView.setTag(bVar.e);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        try {
            bo boVar = i;
            if (bfVar == null) {
                bfVar = h;
            }
            boVar.c(bVar, imageView, bfVar);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    static boolean a() {
        return b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(java.lang.String r4) {
        /*
        r1 = i;
        monitor-enter(r1);
        r0 = f;	 Catch:{ all -> 0x0030 }
        r0 = r0.get(r4);	 Catch:{ all -> 0x0030 }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x0030 }
        if (r0 != 0) goto L_0x001b;
    L_0x000d:
        r2 = f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002c }
        r3 = 1;
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002c }
        r2.put(r4, r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002c }
        r2 = com.whatsapp.util.Log.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002c }
        if (r2 == 0) goto L_0x002a;
    L_0x001b:
        r2 = f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002e }
        r0 = r0.intValue();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002e }
        r0 = r0 + 1;
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002e }
        r2.put(r4, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002e }
    L_0x002a:
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        return;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bo.c(java.lang.String):void");
    }

    static a8 e(bo boVar) {
        return boVar.e;
    }

    private static boolean b() {
        try {
            return System.currentTimeMillis() - j < 1000;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r4) {
        /*
        r1 = i;
        monitor-enter(r1);
        r0 = f;	 Catch:{ all -> 0x0039 }
        r0 = r0.get(r4);	 Catch:{ all -> 0x0039 }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x0039 }
        if (r0 == 0) goto L_0x0031;
    L_0x000d:
        r2 = r0.intValue();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0033 }
        r3 = 1;
        if (r2 != r3) goto L_0x0022;
    L_0x0014:
        r2 = f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0035 }
        r2.remove(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0035 }
        r2 = i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0035 }
        r2.b(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0035 }
        r2 = com.whatsapp.util.Log.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0035 }
        if (r2 == 0) goto L_0x0031;
    L_0x0022:
        r2 = f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
        r0 = r0.intValue();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
        r0 = r0 + -1;
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
        r2.put(r4, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
    L_0x0031:
        monitor-exit(r1);	 Catch:{ all -> 0x0039 }
        return;
    L_0x0033:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0035 }
    L_0x0035:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0037 }
    L_0x0037:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0039 }
    L_0x0039:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0039 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bo.a(java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.Bitmap c(com.whatsapp.protocol.b r10, android.widget.ImageView r11, com.whatsapp.util.bf r12) {
        /*
        r9_this = this;
        r2 = 0;
        monitor-enter(r9);
        r3 = com.whatsapp.util.Log.e;	 Catch:{ all -> 0x000f }
        r0 = r10.e();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x000d }
        if (r0 != 0) goto L_0x0012;
    L_0x000a:
        r0 = r2;
    L_0x000b:
        monitor-exit(r9);
        return r0;
    L_0x000d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x000f:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
    L_0x0012:
        r0 = r9.g;	 Catch:{ all -> 0x000f }
        r1 = r10.e;	 Catch:{ all -> 0x000f }
        r0 = r0.get(r1);	 Catch:{ all -> 0x000f }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ all -> 0x000f }
        if (r0 == 0) goto L_0x0024;
    L_0x001e:
        r1 = r0.isRecycled();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00f1 }
        if (r1 == 0) goto L_0x00ce;
    L_0x0024:
        if (r0 == 0) goto L_0x0034;
    L_0x0026:
        r0 = r0.isRecycled();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00f5 }
        if (r0 == 0) goto L_0x0034;
    L_0x002c:
        r0 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00f7 }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00f7 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00f7 }
    L_0x0034:
        r0 = r9.a;	 Catch:{ all -> 0x000f }
        r1 = r10.e;	 Catch:{ all -> 0x000f }
        r0 = r0.get(r1);	 Catch:{ all -> 0x000f }
        r0 = (java.lang.ref.SoftReference) r0;	 Catch:{ all -> 0x000f }
        if (r0 == 0) goto L_0x01a2;
    L_0x0040:
        r1 = r0.get();	 Catch:{ all -> 0x000f }
        r1 = (android.graphics.Bitmap) r1;	 Catch:{ all -> 0x000f }
    L_0x0046:
        if (r1 == 0) goto L_0x004e;
    L_0x0048:
        r4 = r1.isRecycled();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00f9 }
        if (r4 == 0) goto L_0x019f;
    L_0x004e:
        if (r0 == 0) goto L_0x0057;
    L_0x0050:
        r0 = r9.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00fd }
        r1 = r10.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00fd }
        r0.remove(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00fd }
    L_0x0057:
        r0 = r10.O;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ff, StringIndexOutOfBoundsException -> 0x0189, IllegalArgumentException -> 0x017e }
        if (r0 != 0) goto L_0x0165;
    L_0x005b:
        r0 = r10.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ff, StringIndexOutOfBoundsException -> 0x0189, IllegalArgumentException -> 0x017e }
        if (r0 == 0) goto L_0x019c;
    L_0x0061:
        r0 = r10.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0101, StringIndexOutOfBoundsException -> 0x0189, IllegalArgumentException -> 0x017e }
        r0 = r0.length();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0101, StringIndexOutOfBoundsException -> 0x0189, IllegalArgumentException -> 0x017e }
        if (r0 <= 0) goto L_0x019c;
    L_0x006b:
        r0 = r10.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0103, StringIndexOutOfBoundsException -> 0x0189, IllegalArgumentException -> 0x017e }
        r1 = 0;
        r0 = android.backport.util.Base64.decode(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0103, StringIndexOutOfBoundsException -> 0x0189, IllegalArgumentException -> 0x017e }
    L_0x0074:
        if (r0 == 0) goto L_0x0199;
    L_0x0076:
        r1 = 0;
        r4 = r0.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0103, StringIndexOutOfBoundsException -> 0x0189, IllegalArgumentException -> 0x017e }
        r5 = d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0103, StringIndexOutOfBoundsException -> 0x0189, IllegalArgumentException -> 0x017e }
        r1 = android.graphics.BitmapFactory.decodeByteArray(r0, r1, r4, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0103, StringIndexOutOfBoundsException -> 0x0189, IllegalArgumentException -> 0x017e }
    L_0x007e:
        if (r1 == 0) goto L_0x0162;
    L_0x0080:
        if (r12 == 0) goto L_0x0196;
    L_0x0082:
        r0 = r10.A;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016d, StringIndexOutOfBoundsException -> 0x018d, IllegalArgumentException -> 0x0181 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016d, StringIndexOutOfBoundsException -> 0x018d, IllegalArgumentException -> 0x0181 }
        r2 = r0.file;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016b, StringIndexOutOfBoundsException -> 0x018d, IllegalArgumentException -> 0x0181 }
        if (r2 == 0) goto L_0x0092;
    L_0x008a:
        r0 = r0.file;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016b, StringIndexOutOfBoundsException -> 0x018d, IllegalArgumentException -> 0x0181 }
        r0 = r0.exists();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016b, StringIndexOutOfBoundsException -> 0x018d, IllegalArgumentException -> 0x0181 }
        if (r0 != 0) goto L_0x0196;
    L_0x0092:
        r0 = 1;
        r2 = 2;
        r0 = com.whatsapp.util.o.a(r1, r0, r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016d, StringIndexOutOfBoundsException -> 0x018d, IllegalArgumentException -> 0x0181 }
        r1.recycle();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016d, StringIndexOutOfBoundsException -> 0x018d, IllegalArgumentException -> 0x0181 }
    L_0x009b:
        r1 = r9.g;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179, StringIndexOutOfBoundsException -> 0x0190, IllegalArgumentException -> 0x0183 }
        r2 = r10.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179, StringIndexOutOfBoundsException -> 0x0190, IllegalArgumentException -> 0x0183 }
        r1.put(r2, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179, StringIndexOutOfBoundsException -> 0x0190, IllegalArgumentException -> 0x0183 }
        r1 = r9.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179, StringIndexOutOfBoundsException -> 0x0190, IllegalArgumentException -> 0x0183 }
        r2 = r10.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179, StringIndexOutOfBoundsException -> 0x0190, IllegalArgumentException -> 0x0183 }
        r1.add(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179, StringIndexOutOfBoundsException -> 0x0190, IllegalArgumentException -> 0x0183 }
    L_0x00a9:
        if (r0 == 0) goto L_0x00cc;
    L_0x00ab:
        if (r12 == 0) goto L_0x00cc;
    L_0x00ad:
        r9.b(r10, r11, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0173 }
        if (r3 == 0) goto L_0x00cc;
    L_0x00b2:
        if (r12 == 0) goto L_0x00cc;
    L_0x00b4:
        r1 = r12.a();	 Catch:{ all -> 0x000f }
        r1 = (float) r1;	 Catch:{ all -> 0x000f }
        r2 = com.whatsapp.am1.a();	 Catch:{ all -> 0x000f }
        r2 = r2.g;	 Catch:{ all -> 0x000f }
        r1 = r1 / r2;
        r1 = (int) r1;
        r2 = r0.getWidth();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0175 }
        r2 = r2 * 2;
        if (r1 <= r2) goto L_0x00cc;
    L_0x00c9:
        r9.b(r10, r11, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0175 }
    L_0x00cc:
        if (r3 == 0) goto L_0x00e8;
    L_0x00ce:
        if (r12 == 0) goto L_0x00e8;
    L_0x00d0:
        r1 = r12.a();	 Catch:{ all -> 0x000f }
        r1 = (float) r1;	 Catch:{ all -> 0x000f }
        r2 = com.whatsapp.am1.a();	 Catch:{ all -> 0x000f }
        r2 = r2.g;	 Catch:{ all -> 0x000f }
        r1 = r1 / r2;
        r1 = (int) r1;
        r2 = r0.getWidth();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0177 }
        r2 = r2 * 2;
        if (r1 <= r2) goto L_0x00e8;
    L_0x00e5:
        r9.b(r10, r11, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0177 }
    L_0x00e8:
        if (r12 == 0) goto L_0x000b;
    L_0x00ea:
        r12.a(r11, r0, r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ef }
        goto L_0x000b;
    L_0x00ef:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x00f1:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00f3 }
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00f5 }
    L_0x00f5:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00f7 }
    L_0x00f7:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x00f9:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00fb }
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00fd }
    L_0x00fd:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x00ff:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0101, StringIndexOutOfBoundsException -> 0x0189, IllegalArgumentException -> 0x017e }
    L_0x0101:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0103, StringIndexOutOfBoundsException -> 0x0189, IllegalArgumentException -> 0x017e }
    L_0x0103:
        r0 = move-exception;
        r1 = r2;
    L_0x0105:
        r2 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016f }
        r2.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016f }
        r4 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016f }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016f }
        r2 = r2.append(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016f }
        r4 = r10.O;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016f }
        r2 = r2.append(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016f }
        r2 = r2.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016f }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016f }
        r2 = r10.O;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016f }
        if (r2 != 0) goto L_0x015a;
    L_0x0124:
        r2 = r10.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
        if (r2 == 0) goto L_0x015a;
    L_0x012a:
        r2 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
        r2.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
        r4 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
        r2 = r2.append(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
        r4 = r10.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
        r5 = 0;
        r6 = 100;
        r7 = r10.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
        r7 = r7.length();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
        r6 = java.lang.Math.min(r6, r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
        r4 = r4.substring(r5, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
        r2 = r2.append(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
        r2 = r2.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
    L_0x015a:
        r2 = z;	 Catch:{ all -> 0x000f }
        r4 = 0;
        r2 = r2[r4];	 Catch:{ all -> 0x000f }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ all -> 0x000f }
    L_0x0162:
        r0 = r1;
        goto L_0x00a9;
    L_0x0165:
        r0 = r10.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0103, StringIndexOutOfBoundsException -> 0x0189, IllegalArgumentException -> 0x017e }
        goto L_0x0074;
    L_0x016b:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x016d, StringIndexOutOfBoundsException -> 0x018d, IllegalArgumentException -> 0x0181 }
    L_0x016d:
        r0 = move-exception;
        goto L_0x0105;
    L_0x016f:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171 }
    L_0x0171:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x0173:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x0175:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x0177:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x0179:
        r1 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x0105;
    L_0x017e:
        r0 = move-exception;
        r1 = r2;
        goto L_0x0105;
    L_0x0181:
        r0 = move-exception;
        goto L_0x0105;
    L_0x0183:
        r1 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x0105;
    L_0x0189:
        r0 = move-exception;
        r1 = r2;
        goto L_0x0105;
    L_0x018d:
        r0 = move-exception;
        goto L_0x0105;
    L_0x0190:
        r1 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x0105;
    L_0x0196:
        r0 = r1;
        goto L_0x009b;
    L_0x0199:
        r1 = r2;
        goto L_0x007e;
    L_0x019c:
        r0 = r2;
        goto L_0x0074;
    L_0x019f:
        r0 = r1;
        goto L_0x00b2;
    L_0x01a2:
        r1 = r2;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bo.c(com.whatsapp.protocol.b, android.widget.ImageView, com.whatsapp.util.bf):android.graphics.Bitmap");
    }

    private synchronized void c(b bVar) {
        this.g.remove(bVar.e);
        this.k.remove(bVar.e);
        this.a.remove(bVar.e);
    }

    public static Bitmap b(b bVar) {
        return i.c(bVar, null, null);
    }

    static HashMap a(bo boVar) {
        return boVar.a;
    }

    static {
        String[] strArr = new String[5];
        String str = "MO\fO'\tV\u0005]/F\r\u000fI1A\u0014Y\u0005&AA\u0002L'\u000bG\u001fZ-V";
        boolean z = true;
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
                        i3 = 36;
                        break;
                    case ay.f /*1*/:
                        i3 = 34;
                        break;
                    case ay.n /*2*/:
                        i3 = 109;
                        break;
                    case ay.p /*3*/:
                        i3 = 40;
                        break;
                    default:
                        i3 = 66;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0005\u0003MZ'G[\u000eD'@\u0002\u0000M1WC\nMbMLM@#VFMK#GJ\b";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "MO\fO'\tV\u0005]/F\r\u000fI1A\u0014Y\u0005&AA\u0002L'\u000bO\b[1EE\b\u0006'JA\u0002L+JEW";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "IG\u001e[#CG\u0019@7I@\u000eI!LGBK-JQ\u0019Z7GVM";
                    z = true;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    f = new HashMap();
                    i = new bo();
                    d = new Options();
                    d.inDither = true;
                    h = new ba();
                default:
                    strArr2[i] = str;
                    str = "MO\fO'\tV\u0005]/F\r\u000fI1A\u0014Y\u0005&AA\u0002L'\u000bO\b[1EE\b\u0006&EV\f\u0012";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    private synchronized void b(String str) {
        try {
            int i = Log.e;
            if (str != null) {
                Collection hashSet = new HashSet();
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    m mVar = (m) it.next();
                    if (str.equals(mVar.c)) {
                        Bitmap bitmap = (Bitmap) this.g.get(mVar);
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        this.g.remove(mVar);
                        hashSet.add(mVar);
                        continue;
                    }
                    if (i != 0) {
                        break;
                    }
                }
                this.k.removeAll(hashSet);
                Iterator it2 = this.a.entrySet().iterator();
                while (it2.hasNext()) {
                    Entry entry = (Entry) it2.next();
                    if (str.equals(((m) entry.getKey()).c)) {
                        Bitmap bitmap2 = (Bitmap) ((SoftReference) entry.getValue()).get();
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        it2.remove();
                        continue;
                    }
                    if (i != 0) {
                        break;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        } catch (Throwable th) {
        }
    }

    public static void a(boolean z) {
        try {
            if (z) {
                j = System.currentTimeMillis();
                if (Log.e == 0) {
                    return;
                }
            }
            j = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    static LruCache b(bo boVar) {
        return boVar.g;
    }

    public static void a(b bVar) {
        i.c(bVar);
    }

    static Handler d(bo boVar) {
        return boVar.c;
    }

    static HashSet c(bo boVar) {
        return boVar.k;
    }

    private bo() {
        this.a = new HashMap();
        this.k = new HashSet();
        this.b = null;
        this.e = new a8(this);
        int maxMemory = (int) ((Runtime.getRuntime().maxMemory() / 1024) / 8);
        Log.i(z[4] + maxMemory);
        this.g = new ao(this, maxMemory);
    }

    private void b(b bVar, ImageView imageView, bf bfVar) {
        try {
            if (this.c == null) {
                this.c = new Handler();
            }
            synchronized (a8.a(this.e)) {
                this.e.a(imageView);
                if (this.e.a(bVar)) {
                    return;
                }
                MediaData mediaData = (MediaData) bVar.A;
                if (mediaData != null) {
                    try {
                        if (mediaData.file == null) {
                            return;
                        }
                        if (mediaData.file.exists()) {
                            av avVar = new av(this, bVar, imageView, bfVar);
                            synchronized (a8.a(this.e)) {
                                a8.a(this.e).add(0, avVar);
                                a8.a(this.e).notifyAll();
                            }
                            try {
                                if (this.b == null) {
                                    this.b = new ab(this);
                                    this.b.setPriority(4);
                                    this.b.start();
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw e;
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw e2;
                    } catch (ArrayIndexOutOfBoundsException e22) {
                        try {
                            throw e22;
                        } catch (ArrayIndexOutOfBoundsException e222) {
                            throw e222;
                        }
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e2222) {
            throw e2222;
        }
    }
}
