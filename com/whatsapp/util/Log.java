package com.whatsapp.util;

import android.content.Context;
import com.whatsapp.App;
import com.whatsapp.protocol.b;
import com.whatsapp.vk;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class Log {
    private static File a;
    private static boolean b;
    private static AtomicReference c;
    private static File d;
    public static int e;
    private static final int f;
    private static int g;
    private static AtomicReference h;
    private static FileChannel i;
    private static final Object j;
    private static int k;
    private static final SimpleDateFormat l;
    private static final int m;
    private static final Object n;
    private static final Object o;
    private static final String[] z;

    private static String d(Throwable th) {
        if (th == null) {
            try {
                return "";
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        Writer stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            if (z[52] != null) {
                printWriter.println(f());
            }
            th.printStackTrace(printWriter);
            printWriter.println(a());
            return stringWriter.toString();
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.Throwable r4) {
        /*
        r3 = 3;
        r0 = g;	 Catch:{ IllegalStateException -> 0x002c }
        r1 = 5;
        if (r0 != r1) goto L_0x001b;
    L_0x0006:
        r0 = 3;
        r1 = z;	 Catch:{ IllegalStateException -> 0x002e }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x002e }
        r2 = d(r4);	 Catch:{ IllegalStateException -> 0x002e }
        r1 = b(r1, r2);	 Catch:{ IllegalStateException -> 0x002e }
        b(r0, r1);	 Catch:{ IllegalStateException -> 0x002e }
        r0 = e;	 Catch:{ IllegalStateException -> 0x002e }
        if (r0 == 0) goto L_0x002b;
    L_0x001b:
        r0 = g;	 Catch:{ IllegalStateException -> 0x0030 }
        if (r0 < r3) goto L_0x002b;
    L_0x001f:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0030 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0030 }
        r1 = d(r4);	 Catch:{ IllegalStateException -> 0x0030 }
        b(r0, r1);	 Catch:{ IllegalStateException -> 0x0030 }
    L_0x002b:
        return;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.a(java.lang.Throwable):void");
    }

    public static String a() {
        return z[22];
    }

    private static String b(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                try {
                    return z[46];
                } catch (IllegalStateException e) {
                    throw e;
                }
            case ay.f /*1*/:
                return z[42];
            case ay.n /*2*/:
                return z[48];
            case ay.p /*3*/:
                return z[44];
            case aj.i /*4*/:
                return z[47];
            case aV.r /*5*/:
                return z[45];
            default:
                throw new IllegalArgumentException(z[43] + i);
        }
    }

    private static ArrayList k() {
        return at.c(a, d);
    }

    private static StringBuilder a(String str, StringBuilder stringBuilder) {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        String str2 = str + ((String) c.get()) + " ";
        if (g < 5) {
            return new StringBuilder((((str2.length() + 20) + name.length()) + stringBuilder.length()) + 4).append(str2).append('[').append(id).append(':').append(name).append(z[49]).append(stringBuilder);
        }
        String str3 = "";
        String str4 = "";
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = 5;
        while (i < stackTrace.length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            try {
                if (!stackTraceElement.isNativeMethod()) {
                    str3 = stackTraceElement.getFileName();
                    str4 = String.valueOf(stackTraceElement.getLineNumber());
                    break;
                }
                if (i == 5) {
                    str3 = stackTraceElement.getFileName();
                    str4 = z[50];
                }
                i++;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return new StringBuilder((((((((((str2.length() + 1) + 20) + 1) + name.length()) + 1) + str3.length()) + 1) + str4.length()) + 1) + stringBuilder.length()).append(str2).append('[').append(id).append(':').append(name).append(']').append(str3).append(':').append(str4).append(' ').append(stringBuilder);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean e() {
        /*
        r2 = 0;
        r1 = 1;
        r0 = b;	 Catch:{ FileNotFoundException -> 0x0028 }
        if (r0 == 0) goto L_0x0012;
    L_0x0006:
        r0 = i;	 Catch:{ FileNotFoundException -> 0x0028 }
        if (r0 == 0) goto L_0x0012;
    L_0x000a:
        r0 = i;	 Catch:{ FileNotFoundException -> 0x002a }
        r0 = r0.isOpen();	 Catch:{ FileNotFoundException -> 0x002a }
        if (r0 != 0) goto L_0x00f6;
    L_0x0012:
        r3 = j;
        monitor-enter(r3);
        r0 = b;	 Catch:{ all -> 0x002e }
        if (r0 == 0) goto L_0x0031;
    L_0x0019:
        r0 = i;	 Catch:{ FileNotFoundException -> 0x002c }
        if (r0 == 0) goto L_0x0031;
    L_0x001d:
        r0 = i;	 Catch:{ FileNotFoundException -> 0x002c }
        r0 = r0.isOpen();	 Catch:{ FileNotFoundException -> 0x002c }
        if (r0 == 0) goto L_0x0031;
    L_0x0025:
        monitor-exit(r3);	 Catch:{ all -> 0x002e }
        r0 = r1;
    L_0x0027:
        return r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002e }
        throw r0;
    L_0x0031:
        r0 = h;	 Catch:{ all -> 0x002e }
        r0 = r0.get();	 Catch:{ all -> 0x002e }
        r0 = (android.content.Context) r0;	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x003e;
    L_0x003b:
        monitor-exit(r3);	 Catch:{ all -> 0x002e }
        r0 = r2;
        goto L_0x0027;
    L_0x003e:
        r4 = new java.io.File;	 Catch:{ all -> 0x002e }
        r0 = r0.getFilesDir();	 Catch:{ all -> 0x002e }
        r5 = z;	 Catch:{ all -> 0x002e }
        r6 = 38;
        r5 = r5[r6];	 Catch:{ all -> 0x002e }
        r4.<init>(r0, r5);	 Catch:{ all -> 0x002e }
        r0 = r4.exists();	 Catch:{ FileNotFoundException -> 0x005f }
        if (r0 != 0) goto L_0x0061;
    L_0x0053:
        r4.mkdirs();	 Catch:{ FileNotFoundException -> 0x005f }
        r0 = r4.exists();	 Catch:{ FileNotFoundException -> 0x005f }
        if (r0 != 0) goto L_0x0061;
    L_0x005c:
        monitor-exit(r3);	 Catch:{ all -> 0x002e }
        r0 = r2;
        goto L_0x0027;
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002e }
    L_0x0061:
        r0 = new java.io.File;	 Catch:{ all -> 0x002e }
        r5 = z;	 Catch:{ all -> 0x002e }
        r6 = 40;
        r5 = r5[r6];	 Catch:{ all -> 0x002e }
        r0.<init>(r4, r5);	 Catch:{ all -> 0x002e }
        a = r0;	 Catch:{ all -> 0x002e }
        r0 = new java.io.File;	 Catch:{ all -> 0x002e }
        r5 = z;	 Catch:{ all -> 0x002e }
        r6 = 39;
        r5 = r5[r6];	 Catch:{ all -> 0x002e }
        r0.<init>(r4, r5);	 Catch:{ all -> 0x002e }
        d = r0;	 Catch:{ all -> 0x002e }
        r0 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x00f9 }
        r4 = a;	 Catch:{ FileNotFoundException -> 0x00f9 }
        r5 = 1;
        r0.<init>(r4, r5);	 Catch:{ FileNotFoundException -> 0x00f9 }
        r0 = r0.getChannel();	 Catch:{ FileNotFoundException -> 0x00f9 }
        i = r0;	 Catch:{ FileNotFoundException -> 0x00f9 }
        r0 = new java.io.PrintStream;	 Catch:{ all -> 0x002e }
        r2 = new com.whatsapp.util.bq;	 Catch:{ all -> 0x002e }
        r4 = java.lang.System.err;	 Catch:{ all -> 0x002e }
        r5 = i;	 Catch:{ all -> 0x002e }
        r5 = java.nio.channels.Channels.newOutputStream(r5);	 Catch:{ all -> 0x002e }
        r2.<init>(r4, r5);	 Catch:{ all -> 0x002e }
        r4 = 1;
        r0.<init>(r2, r4);	 Catch:{ all -> 0x002e }
        java.lang.System.setErr(r0);	 Catch:{ all -> 0x002e }
        r0 = 1;
        b = r0;	 Catch:{ all -> 0x002e }
        r0 = java.util.Calendar.getInstance();	 Catch:{ all -> 0x002e }
        r2 = 15;
        r2 = r0.get(r2);	 Catch:{ all -> 0x002e }
        r4 = 16;
        r0 = r0.get(r4);	 Catch:{ all -> 0x002e }
        r0 = r0 + r2;
        r2 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r0 = r0 / r2;
        k = r0;	 Catch:{ all -> 0x002e }
        r0 = z;	 Catch:{ all -> 0x002e }
        r2 = 36;
        r0 = r0[r2];	 Catch:{ all -> 0x002e }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002e }
        r2.<init>();	 Catch:{ all -> 0x002e }
        r4 = z;	 Catch:{ all -> 0x002e }
        r5 = 37;
        r4 = r4[r5];	 Catch:{ all -> 0x002e }
        r2 = r2.append(r4);	 Catch:{ all -> 0x002e }
        r4 = g;	 Catch:{ all -> 0x002e }
        r2 = r2.append(r4);	 Catch:{ all -> 0x002e }
        r4 = z;	 Catch:{ all -> 0x002e }
        r5 = 41;
        r4 = r4[r5];	 Catch:{ all -> 0x002e }
        r2 = r2.append(r4);	 Catch:{ all -> 0x002e }
        r4 = k;	 Catch:{ all -> 0x002e }
        r2 = r2.append(r4);	 Catch:{ all -> 0x002e }
        r4 = z;	 Catch:{ all -> 0x002e }
        r5 = 35;
        r4 = r4[r5];	 Catch:{ all -> 0x002e }
        r2 = r2.append(r4);	 Catch:{ all -> 0x002e }
        r2 = r2.toString();	 Catch:{ all -> 0x002e }
        b(r0, r2);	 Catch:{ all -> 0x002e }
        monitor-exit(r3);	 Catch:{ all -> 0x002e }
    L_0x00f6:
        r0 = r1;
        goto L_0x0027;
    L_0x00f9:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002e }
        r0 = r2;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.e():boolean");
    }

    public static void d(int i, String str) {
        if (i <= g) {
            String b = b(b(i), str);
            try {
                if (g == 5) {
                    b(i, b);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    public static void b(boolean z) {
        if (!z) {
            try {
                b(z[16], z[17]);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r6, java.lang.Throwable r7, java.lang.Object[] r8) {
        /*
        r5 = 3;
        r0 = e;
        r1 = g;	 Catch:{ IllegalStateException -> 0x0065 }
        r2 = 5;
        if (r1 != r2) goto L_0x003a;
    L_0x0008:
        if (r7 == 0) goto L_0x0024;
    L_0x000a:
        r1 = 3;
        r2 = z;	 Catch:{ IllegalStateException -> 0x0069 }
        r3 = 19;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0069 }
        r3 = java.util.Locale.US;	 Catch:{ IllegalStateException -> 0x0069 }
        r3 = java.lang.String.format(r3, r6, r8);	 Catch:{ IllegalStateException -> 0x0069 }
        r4 = d(r7);	 Catch:{ IllegalStateException -> 0x0069 }
        r2 = a(r2, r3, r4);	 Catch:{ IllegalStateException -> 0x0069 }
        b(r1, r2);	 Catch:{ IllegalStateException -> 0x0069 }
        if (r0 == 0) goto L_0x0064;
    L_0x0024:
        r1 = 3;
        r2 = z;	 Catch:{ IllegalStateException -> 0x006b }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x006b }
        r3 = java.util.Locale.US;	 Catch:{ IllegalStateException -> 0x006b }
        r3 = java.lang.String.format(r3, r6, r8);	 Catch:{ IllegalStateException -> 0x006b }
        r2 = b(r2, r3);	 Catch:{ IllegalStateException -> 0x006b }
        b(r1, r2);	 Catch:{ IllegalStateException -> 0x006b }
        if (r0 == 0) goto L_0x0064;
    L_0x003a:
        r1 = g;	 Catch:{ IllegalStateException -> 0x006d }
        if (r1 < r5) goto L_0x0064;
    L_0x003e:
        if (r7 == 0) goto L_0x0055;
    L_0x0040:
        r1 = z;	 Catch:{ IllegalStateException -> 0x0071 }
        r2 = 20;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0071 }
        r2 = java.util.Locale.US;	 Catch:{ IllegalStateException -> 0x0071 }
        r2 = java.lang.String.format(r2, r6, r8);	 Catch:{ IllegalStateException -> 0x0071 }
        r3 = d(r7);	 Catch:{ IllegalStateException -> 0x0071 }
        a(r1, r2, r3);	 Catch:{ IllegalStateException -> 0x0071 }
        if (r0 == 0) goto L_0x0064;
    L_0x0055:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0071 }
        r1 = 18;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0071 }
        r1 = java.util.Locale.US;	 Catch:{ IllegalStateException -> 0x0071 }
        r1 = java.lang.String.format(r1, r6, r8);	 Catch:{ IllegalStateException -> 0x0071 }
        b(r0, r1);	 Catch:{ IllegalStateException -> 0x0071 }
    L_0x0064:
        return;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.a(java.lang.String, java.lang.Throwable, java.lang.Object[]):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.lang.String r6, java.lang.Throwable r7, java.lang.Object[] r8) {
        /*
        r5 = 1;
        r0 = e;
        r1 = g;	 Catch:{ IllegalStateException -> 0x0065 }
        r2 = 5;
        if (r1 != r2) goto L_0x003a;
    L_0x0008:
        if (r7 == 0) goto L_0x0024;
    L_0x000a:
        r1 = 1;
        r2 = z;	 Catch:{ IllegalStateException -> 0x0069 }
        r3 = 60;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0069 }
        r3 = java.util.Locale.US;	 Catch:{ IllegalStateException -> 0x0069 }
        r3 = java.lang.String.format(r3, r6, r8);	 Catch:{ IllegalStateException -> 0x0069 }
        r4 = d(r7);	 Catch:{ IllegalStateException -> 0x0069 }
        r2 = a(r2, r3, r4);	 Catch:{ IllegalStateException -> 0x0069 }
        b(r1, r2);	 Catch:{ IllegalStateException -> 0x0069 }
        if (r0 == 0) goto L_0x0064;
    L_0x0024:
        r1 = 1;
        r2 = z;	 Catch:{ IllegalStateException -> 0x006b }
        r3 = 58;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x006b }
        r3 = java.util.Locale.US;	 Catch:{ IllegalStateException -> 0x006b }
        r3 = java.lang.String.format(r3, r6, r8);	 Catch:{ IllegalStateException -> 0x006b }
        r2 = b(r2, r3);	 Catch:{ IllegalStateException -> 0x006b }
        b(r1, r2);	 Catch:{ IllegalStateException -> 0x006b }
        if (r0 == 0) goto L_0x0064;
    L_0x003a:
        r1 = g;	 Catch:{ IllegalStateException -> 0x006d }
        if (r1 < r5) goto L_0x0064;
    L_0x003e:
        if (r7 == 0) goto L_0x0055;
    L_0x0040:
        r1 = z;	 Catch:{ IllegalStateException -> 0x0071 }
        r2 = 61;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0071 }
        r2 = java.util.Locale.US;	 Catch:{ IllegalStateException -> 0x0071 }
        r2 = java.lang.String.format(r2, r6, r8);	 Catch:{ IllegalStateException -> 0x0071 }
        r3 = d(r7);	 Catch:{ IllegalStateException -> 0x0071 }
        a(r1, r2, r3);	 Catch:{ IllegalStateException -> 0x0071 }
        if (r0 == 0) goto L_0x0064;
    L_0x0055:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0071 }
        r1 = 59;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0071 }
        r1 = java.util.Locale.US;	 Catch:{ IllegalStateException -> 0x0071 }
        r1 = java.lang.String.format(r1, r6, r8);	 Catch:{ IllegalStateException -> 0x0071 }
        b(r0, r1);	 Catch:{ IllegalStateException -> 0x0071 }
    L_0x0064:
        return;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.b(java.lang.String, java.lang.Throwable, java.lang.Object[]):void");
    }

    public static void w(String str) {
        try {
            if (g == 5) {
                b(2, b(z[74], str));
                return;
            }
            try {
                if (g >= 2) {
                    b(z[73], str);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public static File g() {
        File file;
        Throwable e;
        Throwable th;
        int i = e;
        File file2 = null;
        if (e()) {
            synchronized (n) {
                synchronized (o) {
                    try {
                        Iterator it = k().iterator();
                        file = null;
                        do {
                            try {
                                if (!it.hasNext()) {
                                    break;
                                }
                                file2 = (File) it.next();
                                file = a2.a(a, file2);
                                file2.delete();
                            } catch (IOException e2) {
                                e = e2;
                            } catch (SecurityException e3) {
                                e = e3;
                            }
                        } while (i == 0);
                    } catch (Throwable e4) {
                        th = e4;
                        file = null;
                        e = th;
                        c(e);
                        file2 = file;
                        return file2;
                    } catch (Throwable e42) {
                        th = e42;
                        file = null;
                        e = th;
                        c(e);
                        file2 = file;
                        return file2;
                    } catch (Throwable th2) {
                    }
                    file2 = file;
                }
            }
        }
        return file2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(java.lang.String r4, java.lang.Throwable r5) {
        /*
        r3 = 2;
        r0 = g;	 Catch:{ IllegalStateException -> 0x002c }
        r1 = 5;
        if (r0 != r1) goto L_0x001b;
    L_0x0006:
        r0 = 2;
        r1 = z;	 Catch:{ IllegalStateException -> 0x002e }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x002e }
        r2 = d(r5);	 Catch:{ IllegalStateException -> 0x002e }
        r1 = a(r1, r4, r2);	 Catch:{ IllegalStateException -> 0x002e }
        b(r0, r1);	 Catch:{ IllegalStateException -> 0x002e }
        r0 = e;	 Catch:{ IllegalStateException -> 0x002e }
        if (r0 == 0) goto L_0x002b;
    L_0x001b:
        r0 = g;	 Catch:{ IllegalStateException -> 0x0030 }
        if (r0 < r3) goto L_0x002b;
    L_0x001f:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0030 }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0030 }
        r1 = d(r5);	 Catch:{ IllegalStateException -> 0x0030 }
        a(r0, r4, r1);	 Catch:{ IllegalStateException -> 0x0030 }
    L_0x002b:
        return;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.c(java.lang.String, java.lang.Throwable):void");
    }

    public static String d() {
        return z[64];
    }

    public static ArrayList c(int i) {
        return a2.a(a, i);
    }

    public static void v(String str) {
        try {
            if (g >= 5) {
                b(5, b(z[51], str));
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[76];
        String str = "02T2^";
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
                        i3 = 124;
                        break;
                    case ay.f /*1*/:
                        i3 = 126;
                        break;
                    case ay.n /*2*/:
                        i3 = 11;
                        break;
                    case ay.p /*3*/:
                        i3 = 123;
                        break;
                    default:
                        i3 = 126;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "_]([\u001c\u0019\u0019b\u0015^\u000f\nj\u0018\u0015\\\ny\u001a\u001d\u0019^";
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "02T,^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "02T,^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    str = "\u0010\u0011l[\u001f\f\u000eg\u0012\u001d\u001d\nb\u0014\u0010\\\u001dd\u0015\n\u0019\u0006\u007f[\u001f\u0010\fn\u001a\u001a\u0005^j\b\r\u0015\u0019e\u001e\u001a";
                    z = true;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "02T,^";
                    z = true;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "02T,^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "02T2^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "02T2^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "02T,^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    str = "02T,^";
                    z = true;
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    strArr2 = strArr3;
                    str = "02T,^";
                    z = true;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "02T,^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "02T?^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "02T?^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "02T:^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "=\rx\u001e\f\b\u0017d\u0015^:\u001fb\u0017\u001b\u0018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "02T2^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "02T2^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "02T2^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "02T2^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "_]([\u001b\u0012\u001a+\b\n\u001d\u001d`[\n\u000e\u001fh\u001e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "02T>^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "02T>^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "S\nr\u000b\u001bF";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "S\u0019y\u000b!\u001d\u001d\u007f\u0012\u0011\u0012D";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "S\ff\u000fS\u000f\fhA";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u001a\u0013x\u001cQ\u000f\nj\u000f\u000b\u000fD";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "02T>^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "02T>^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "AC6F^\u0010\u0011l\u001d\u0017\u0010\u001b+\r\u001b\u000e\rb\u0014\u0010AL%JORK;N^\u0010\u001b}\u001e\u0012A";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\\\nqF";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "02T2^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\\C6FC";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\\C6FC";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "02T2^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "AC6F^\u0010\u0011l\u001d\u0017\u0010\u001b+\u0017\u001b\n\u001bgF";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "0\u0011l\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u000b\u0016j\u000f\r\u001d\u000e{U\n\u0011\u000e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u000b\u0016j\u000f\r\u001d\u000e{U\u0012\u0013\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\\\nqF";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "02T>^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "5\u0010}\u001a\u0012\u0015\u001a+\u0017\u0011\u001b^g\u001e\b\u0019\u0012+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "02T2^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "02T-^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "02T:^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "02T?^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "02T,^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "!^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0012\u001f\u007f\u0012\b\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "02T-^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "NP:JPIN>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "51N\u0003\u001d\u0019\u000e\u007f\u0012\u0011\u0012^d\u0015^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "LN";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "+\u0016j\u000f\r=\u000e{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "02T2^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "02T2^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "02T>^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "02T>^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "02T>^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "02T>^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "RP%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "RP%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "NP:JPIN>V\u001f\u000e\u0013<V\u000e\u0010\u001frV\f\u0019\u0012n\u001a\r\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "02T>^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "02T>^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "+\u0016j\u000f\r=\u000e{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "9\fy\u0014\fF^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 69;
                    str = "+\u0016j\u000f\r=\u000e{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 70;
                    str = "+\u0016j\u000f\r=\u000e{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 71;
                    str = "+\u0016j\u000f\r=\u000e{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 72;
                    str = "+\u0016j\u000f\r=\u000e{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 73;
                    str = "02T,^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 74;
                    str = "02T,^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 75;
                    str = "\u0005\u0007r\u0002S13&\u001f\u001a\\6CA\u0013\u0011Dx\bP/-X[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    z = strArr3;
                    m = "\n".length();
                    l = new SimpleDateFormat(z[75], Locale.US);
                    f = l.toPattern().length();
                    h = new AtomicReference();
                    c = new ac("D");
                    a = null;
                    d = null;
                    g = 5;
                    k = 0;
                    b = false;
                    i = null;
                    j = new Object();
                    o = new Object();
                    n = new Object();
                default:
                    strArr2[i] = str;
                    str = "02T2^";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    public static void c(Throwable th) {
        try {
            if (g == 5) {
                b(1, b(z[23], d(th)));
                return;
            }
            try {
                if (g >= 1) {
                    b(z[24], d(th));
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(java.lang.String r4) {
        /*
        r3 = 1;
        r0 = g;	 Catch:{ IllegalStateException -> 0x0026 }
        r1 = 5;
        if (r0 != r1) goto L_0x0018;
    L_0x0006:
        r0 = 1;
        r1 = z;	 Catch:{ IllegalStateException -> 0x0028 }
        r2 = 66;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0028 }
        r1 = b(r1, r4);	 Catch:{ IllegalStateException -> 0x0028 }
        b(r0, r1);	 Catch:{ IllegalStateException -> 0x0028 }
        r0 = e;	 Catch:{ IllegalStateException -> 0x0028 }
        if (r0 == 0) goto L_0x0025;
    L_0x0018:
        r0 = g;	 Catch:{ IllegalStateException -> 0x002a }
        if (r0 < r3) goto L_0x0025;
    L_0x001c:
        r0 = z;	 Catch:{ IllegalStateException -> 0x002a }
        r1 = 65;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x002a }
        b(r0, r4);	 Catch:{ IllegalStateException -> 0x002a }
    L_0x0025:
        return;
    L_0x0026:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.e(java.lang.String):void");
    }

    static int b() {
        return g;
    }

    public static void b(String str, Throwable th) {
        try {
            if (g == 5) {
                b(1, a(z[30], str, d(th)));
                return;
            }
            try {
                if (g >= 1) {
                    a(z[29], str, d(th));
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public static void a(Context context) {
        try {
            if (!h.compareAndSet(null, context)) {
                throw new IllegalStateException(z[5]);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static void c(int i, String str) {
        b(i, str);
    }

    static String a(String str, String str2) {
        return b(str, str2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r4, java.lang.Throwable r5) {
        /*
        r3 = 3;
        r0 = g;	 Catch:{ IllegalStateException -> 0x002e }
        r1 = 5;
        if (r0 != r1) goto L_0x001c;
    L_0x0006:
        r0 = 3;
        r1 = z;	 Catch:{ IllegalStateException -> 0x0030 }
        r2 = 57;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0030 }
        r2 = d(r5);	 Catch:{ IllegalStateException -> 0x0030 }
        r1 = a(r1, r4, r2);	 Catch:{ IllegalStateException -> 0x0030 }
        b(r0, r1);	 Catch:{ IllegalStateException -> 0x0030 }
        r0 = e;	 Catch:{ IllegalStateException -> 0x0030 }
        if (r0 == 0) goto L_0x002d;
    L_0x001c:
        r0 = g;	 Catch:{ IllegalStateException -> 0x0032 }
        if (r0 < r3) goto L_0x002d;
    L_0x0020:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0032 }
        r1 = 56;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0032 }
        r1 = d(r5);	 Catch:{ IllegalStateException -> 0x0032 }
        a(r0, r4, r1);	 Catch:{ IllegalStateException -> 0x0032 }
    L_0x002d:
        return;
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.a(java.lang.String, java.lang.Throwable):void");
    }

    public static boolean h() {
        boolean z = false;
        if (e()) {
            synchronized (o) {
                try {
                    synchronized (j) {
                        try {
                            i.close();
                            z = a2.b(a, d);
                            b = false;
                            e();
                        } catch (IOException e) {
                        }
                    }
                } catch (Throwable th) {
                }
            }
        }
        return z;
    }

    public static void c() {
        a2.b(a, 3);
    }

    public static String a(b bVar) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(z[28]).append(bVar.a).append(z[25]).append(bVar.j);
            if (bVar.e.c.contains("-")) {
                stringBuilder.append(z[26]).append(bVar.k);
            }
            stringBuilder.append(z[27]).append(bVar.F).append(" ").append(bVar.e.toString());
            return stringBuilder.toString();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(java.lang.String r6, java.lang.Throwable r7, java.lang.Object[] r8) {
        /*
        r5 = 2;
        r0 = e;
        r1 = g;	 Catch:{ IllegalStateException -> 0x0065 }
        r2 = 5;
        if (r1 != r2) goto L_0x003a;
    L_0x0008:
        if (r7 == 0) goto L_0x0024;
    L_0x000a:
        r1 = 2;
        r2 = z;	 Catch:{ IllegalStateException -> 0x0069 }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0069 }
        r3 = java.util.Locale.US;	 Catch:{ IllegalStateException -> 0x0069 }
        r3 = java.lang.String.format(r3, r6, r8);	 Catch:{ IllegalStateException -> 0x0069 }
        r4 = d(r7);	 Catch:{ IllegalStateException -> 0x0069 }
        r2 = a(r2, r3, r4);	 Catch:{ IllegalStateException -> 0x0069 }
        b(r1, r2);	 Catch:{ IllegalStateException -> 0x0069 }
        if (r0 == 0) goto L_0x0064;
    L_0x0024:
        r1 = 2;
        r2 = z;	 Catch:{ IllegalStateException -> 0x006b }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x006b }
        r3 = java.util.Locale.US;	 Catch:{ IllegalStateException -> 0x006b }
        r3 = java.lang.String.format(r3, r6, r8);	 Catch:{ IllegalStateException -> 0x006b }
        r2 = b(r2, r3);	 Catch:{ IllegalStateException -> 0x006b }
        b(r1, r2);	 Catch:{ IllegalStateException -> 0x006b }
        if (r0 == 0) goto L_0x0064;
    L_0x003a:
        r1 = g;	 Catch:{ IllegalStateException -> 0x006d }
        if (r1 < r5) goto L_0x0064;
    L_0x003e:
        if (r7 == 0) goto L_0x0055;
    L_0x0040:
        r1 = z;	 Catch:{ IllegalStateException -> 0x0071 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0071 }
        r2 = java.util.Locale.US;	 Catch:{ IllegalStateException -> 0x0071 }
        r2 = java.lang.String.format(r2, r6, r8);	 Catch:{ IllegalStateException -> 0x0071 }
        r3 = d(r7);	 Catch:{ IllegalStateException -> 0x0071 }
        a(r1, r2, r3);	 Catch:{ IllegalStateException -> 0x0071 }
        if (r0 == 0) goto L_0x0064;
    L_0x0055:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0071 }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0071 }
        r1 = java.util.Locale.US;	 Catch:{ IllegalStateException -> 0x0071 }
        r1 = java.lang.String.format(r1, r6, r8);	 Catch:{ IllegalStateException -> 0x0071 }
        b(r0, r1);	 Catch:{ IllegalStateException -> 0x0071 }
    L_0x0064:
        return;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.c(java.lang.String, java.lang.Throwable, java.lang.Object[]):void");
    }

    public static File j() {
        return a2.a(a);
    }

    private static void a(int i, String str) {
        if (i == 0 || i == 5) {
            try {
                android.util.Log.v(z[72], str);
            } catch (IllegalStateException e) {
                throw e;
            }
        } else if (i == 4) {
            try {
                android.util.Log.d(z[69], str);
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } else if (i == 3) {
            try {
                android.util.Log.i(z[70], str);
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } else if (i == 2) {
            try {
                android.util.Log.w(z[67], str);
            } catch (IllegalStateException e222) {
                throw e222;
            }
        } else if (i == 1) {
            try {
                android.util.Log.e(z[71], str);
                if (App.aa == 3) {
                    StringBuilder append = new StringBuilder().append(z[68]);
                    if (str.length() > 50) {
                        str = str.substring(0, 47) + "\u2026";
                    }
                    App.v(append.append(str).toString());
                }
            } catch (IllegalStateException e2222) {
                throw e2222;
            } catch (IllegalStateException e22222) {
                throw e22222;
            }
        }
    }

    public static void a(int i) {
        g = i;
        b(z[33], z[31] + g + z[32] + k + z[34]);
    }

    public static void i(String str) {
        try {
            if (g == 5) {
                b(3, b(z[9], str));
                return;
            }
            try {
                if (g >= 3) {
                    b(z[8], str);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(java.lang.String r4) {
        /*
        r3 = 4;
        r0 = g;	 Catch:{ IllegalStateException -> 0x0026 }
        r1 = 5;
        if (r0 != r1) goto L_0x0018;
    L_0x0006:
        r0 = 4;
        r1 = z;	 Catch:{ IllegalStateException -> 0x0028 }
        r2 = 15;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0028 }
        r1 = b(r1, r4);	 Catch:{ IllegalStateException -> 0x0028 }
        b(r0, r1);	 Catch:{ IllegalStateException -> 0x0028 }
        r0 = e;	 Catch:{ IllegalStateException -> 0x0028 }
        if (r0 == 0) goto L_0x0025;
    L_0x0018:
        r0 = g;	 Catch:{ IllegalStateException -> 0x002a }
        if (r0 < r3) goto L_0x0025;
    L_0x001c:
        r0 = z;	 Catch:{ IllegalStateException -> 0x002a }
        r1 = 14;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x002a }
        b(r0, r4);	 Catch:{ IllegalStateException -> 0x002a }
    L_0x0025:
        return;
    L_0x0026:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.d(java.lang.String):void");
    }

    private static void b(int i, String str) {
        while (str.length() > 4000) {
            String substring = str.substring(0, 3997);
            str = z[63] + str.substring(3997);
            a(i, substring + z[62]);
        }
        a(i, str);
    }

    private static StringBuilder a(StringBuilder stringBuilder) {
        if (e()) {
            StringBuilder stringBuilder2 = new StringBuilder((f + stringBuilder.length()) + m);
            Calendar instance = Calendar.getInstance();
            try {
                stringBuilder2.append(instance.get(1)).append('-');
                if (instance.get(2) < 9) {
                    stringBuilder2.append('0');
                }
                try {
                    stringBuilder2.append(instance.get(2) + 1).append('-');
                    if (instance.get(5) < 10) {
                        stringBuilder2.append('0');
                    }
                    try {
                        stringBuilder2.append(instance.get(5)).append(' ');
                        if (instance.get(11) < 10) {
                            stringBuilder2.append('0');
                        }
                        try {
                            stringBuilder2.append(instance.get(11)).append(':');
                            if (instance.get(12) < 10) {
                                stringBuilder2.append('0');
                            }
                            try {
                                stringBuilder2.append(instance.get(12)).append(':');
                                if (instance.get(13) < 10) {
                                    stringBuilder2.append('0');
                                }
                                try {
                                    stringBuilder2.append(instance.get(13)).append('.');
                                    if (instance.get(14) < 10) {
                                        stringBuilder2.append(z[54]);
                                    } else {
                                        try {
                                            if (instance.get(14) < 100) {
                                                stringBuilder2.append('0');
                                            }
                                        } catch (IOException e) {
                                            throw e;
                                        }
                                    }
                                    stringBuilder2.append(instance.get(14)).append(' ');
                                    stringBuilder2.append(stringBuilder).append("\n");
                                    ByteBuffer wrap = ByteBuffer.wrap(stringBuilder2.toString().getBytes());
                                    try {
                                        synchronized (j) {
                                            FileLock fileLock = null;
                                            try {
                                                fileLock = i.lock();
                                                i.position(i.size());
                                                i.write(wrap);
                                                if (fileLock != null) {
                                                    fileLock.release();
                                                }
                                            } catch (IOException e2) {
                                                throw e2;
                                            } catch (Throwable th) {
                                            }
                                        }
                                    } catch (Throwable e3) {
                                        android.util.Log.e(z[55], z[53] + stringBuilder, e3);
                                    }
                                } catch (IOException e22) {
                                    throw e22;
                                }
                            } catch (IOException e222) {
                                throw e222;
                            }
                        } catch (IOException e2222) {
                            throw e2222;
                        }
                    } catch (IOException e22222) {
                        throw e22222;
                    }
                } catch (IOException e222222) {
                    throw e222222;
                }
            } catch (IOException e2222222) {
                throw e2222222;
            }
        }
        return stringBuilder;
    }

    public static boolean i() {
        try {
            return g >= 5;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private static String b(String str, String str2) {
        return a(a(str, new StringBuilder(str2))).toString();
    }

    public static String f() {
        return z[2] + d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.lang.Throwable r4) {
        /*
        r3 = 2;
        r0 = g;	 Catch:{ IllegalStateException -> 0x002c }
        r1 = 5;
        if (r0 != r1) goto L_0x001b;
    L_0x0006:
        r0 = 2;
        r1 = z;	 Catch:{ IllegalStateException -> 0x002e }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x002e }
        r2 = d(r4);	 Catch:{ IllegalStateException -> 0x002e }
        r1 = b(r1, r2);	 Catch:{ IllegalStateException -> 0x002e }
        b(r0, r1);	 Catch:{ IllegalStateException -> 0x002e }
        r0 = e;	 Catch:{ IllegalStateException -> 0x002e }
        if (r0 == 0) goto L_0x002b;
    L_0x001b:
        r0 = g;	 Catch:{ IllegalStateException -> 0x0030 }
        if (r0 < r3) goto L_0x002b;
    L_0x001f:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0030 }
        r1 = 6;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0030 }
        r1 = d(r4);	 Catch:{ IllegalStateException -> 0x0030 }
        b(r0, r1);	 Catch:{ IllegalStateException -> 0x0030 }
    L_0x002b:
        return;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.b(java.lang.Throwable):void");
    }

    private static String a(String str, String str2, String str3) {
        return a(a(str, new StringBuilder((str2.length() + m) + str3.length()).append(str2).append("\n").append(str3))).toString();
    }
}
