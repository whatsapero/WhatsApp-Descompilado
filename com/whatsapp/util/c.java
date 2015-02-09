package com.whatsapp.util;

import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class c {
    private static final String[] z;
    private boolean a;
    private File b;
    private final Lock c;
    private final File d;

    static {
        String[] strArr = new String[4];
        String str = "\u0010/i\u0018A\u0018:cQV\u000enc]R\u001e&t\\\u0013\n&xTV]-c]R\t'\u007f_\u0013\t+|H\u0013\u0019'c";
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
                        i3 = 125;
                        break;
                    case ay.f /*1*/:
                        i3 = 78;
                        break;
                    case ay.n /*2*/:
                        i3 = 17;
                        break;
                    case ay.p /*3*/:
                        i3 = 56;
                        break;
                    default:
                        i3 = 51;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\t<pK[R*tTV\t+<JV\u001e;cKZ\u000b+>WF\tc~^\u001e\u0010+|WA\u0004n";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\t<pK[R+|HG\u0004ceJR\u000e&>WF\tc~^\u001e\u0010+|WA\u0004n";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0010/i\u0018A\u0018:cQV\u000enc]R\u001e&t\\\u0013\n&xTV]-c]R\t'\u007f_\u0013\t+|H\u0013\u001b'}]";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public File b() {
        d();
        return this.d;
    }

    private void d() {
        if (!this.d.exists()) {
            this.d.mkdirs();
            if (!this.d.exists()) {
                this.d.mkdir();
            }
        }
    }

    public c(File file) {
        this.b = null;
        this.a = false;
        this.c = new ReentrantLock();
        this.d = file;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void f() {
        /*
        r6_this = this;
        r5 = 10;
        r0 = 0;
        monitor-enter(r6);
        r2 = com.whatsapp.util.Log.e;	 Catch:{ all -> 0x0052 }
        r6.d();	 Catch:{ all -> 0x0052 }
        r1 = r6.b;	 Catch:{ all -> 0x0052 }
        if (r1 == 0) goto L_0x0015;
    L_0x000d:
        r1 = r6.b;	 Catch:{ all -> 0x0052 }
        r1 = r1.exists();	 Catch:{ all -> 0x0052 }
        if (r1 != 0) goto L_0x0055;
    L_0x0015:
        r1 = new java.io.File;	 Catch:{ all -> 0x0052 }
        r3 = r6.d;	 Catch:{ all -> 0x0052 }
        r4 = java.util.UUID.randomUUID();	 Catch:{ all -> 0x0052 }
        r4 = r4.toString();	 Catch:{ all -> 0x0052 }
        r1.<init>(r3, r4);	 Catch:{ all -> 0x0052 }
        r6.b = r1;	 Catch:{ all -> 0x0052 }
    L_0x0026:
        r1 = r0 + 1;
        if (r0 >= r5) goto L_0x0045;
    L_0x002a:
        r0 = r6.b;	 Catch:{ all -> 0x0052 }
        r0 = r0.mkdir();	 Catch:{ all -> 0x0052 }
        if (r0 != 0) goto L_0x0045;
    L_0x0032:
        r0 = new java.io.File;	 Catch:{ all -> 0x0052 }
        r3 = r6.d;	 Catch:{ all -> 0x0052 }
        r4 = java.util.UUID.randomUUID();	 Catch:{ all -> 0x0052 }
        r4 = r4.toString();	 Catch:{ all -> 0x0052 }
        r0.<init>(r3, r4);	 Catch:{ all -> 0x0052 }
        r6.b = r0;	 Catch:{ all -> 0x0052 }
        if (r2 == 0) goto L_0x0057;
    L_0x0045:
        if (r1 <= r5) goto L_0x0055;
    L_0x0047:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0052 }
        r1 = z;	 Catch:{ all -> 0x0052 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ all -> 0x0052 }
        r0.<init>(r1);	 Catch:{ all -> 0x0052 }
        throw r0;	 Catch:{ all -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x0055:
        monitor-exit(r6);
        return;
    L_0x0057:
        r0 = r1;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.c.f():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File e() {
        /*
        r6_this = this;
        r5 = 10;
        r3 = com.whatsapp.util.Log.e;
        r6.f();
        r1 = 0;
        r0 = new java.io.File;
        r2 = r6.b;
        r4 = java.util.UUID.randomUUID();
        r4 = r4.toString();
        r0.<init>(r2, r4);
    L_0x0017:
        r2 = r1 + 1;
        if (r1 >= r5) goto L_0x0032;
    L_0x001b:
        r1 = r0.createNewFile();
        if (r1 != 0) goto L_0x0032;
    L_0x0021:
        r0 = new java.io.File;
        r1 = r6.b;
        r4 = java.util.UUID.randomUUID();
        r4 = r4.toString();
        r0.<init>(r1, r4);
        if (r3 == 0) goto L_0x0040;
    L_0x0032:
        if (r2 <= r5) goto L_0x003f;
    L_0x0034:
        r0 = new java.io.IOException;
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x003f:
        return r0;
    L_0x0040:
        r1 = r2;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.c.e():java.io.File");
    }

    public static boolean a(File file) {
        int i = Log.e;
        if (file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i2 = 0;
                    while (i2 < length) {
                        if (a(listFiles[i2])) {
                            i2++;
                            if (i != 0) {
                                break;
                            }
                        }
                        return false;
                    }
                }
            } catch (OutOfMemoryError e) {
                Log.e(z[2] + file.getAbsolutePath());
                return false;
            }
        }
        return file.delete();
    }

    public void a() {
        this.c.lock();
        if (!this.a) {
            this.c.unlock();
            br.a(new bu(this));
            if (Log.e == 0) {
                return;
            }
        }
        this.c.unlock();
    }

    public void c() {
        File[] fileArr;
        int i = Log.e;
        if (this.d.exists()) {
            File[] listFiles;
            this.c.lock();
            this.a = true;
            try {
                fileArr = new File[0];
                listFiles = this.d.listFiles();
            } catch (OutOfMemoryError e) {
                Log.e(z[3] + this.d.getAbsolutePath());
                listFiles = fileArr;
            } catch (Throwable th) {
                this.a = false;
                this.c.unlock();
            }
            if (listFiles != null) {
                int length = listFiles.length;
                int i2 = 0;
                while (i2 < length) {
                    File file = listFiles[i2];
                    try {
                        if (!(this.b != null && file.getName().equals(this.b.getName()) && i == 0)) {
                            this.c.unlock();
                            a(file);
                            this.c.lock();
                        }
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    } catch (OutOfMemoryError e2) {
                        throw e2;
                    } catch (OutOfMemoryError e22) {
                        throw e22;
                    }
                }
            }
            this.a = false;
            this.c.unlock();
        }
    }
}
