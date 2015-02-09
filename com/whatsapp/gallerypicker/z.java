package com.whatsapp.gallerypicker;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v4.util.LruCache;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class z {
    @SuppressLint({"NewApi"})
    private static LruCache f;
    private static final String[] z;
    private ContentResolver a;
    private Handler b;
    private final ArrayList c;
    private Thread d;
    private boolean e;

    static boolean c(z zVar) {
        return zVar.e;
    }

    public void d() {
        synchronized (this.c) {
            this.e = true;
            this.c.notifyAll();
        }
        if (this.d != null) {
            try {
                Thread thread = this.d;
                bw.a().a(thread, this.a);
                thread.join();
                this.d = null;
            } catch (InterruptedException e) {
            }
        }
    }

    static LruCache c() {
        return f;
    }

    private void a() {
        if (this.d == null) {
            this.e = false;
            Thread thread = new Thread(new b1(this, null));
            thread.setName(z[1]);
            this.d = thread;
            thread.start();
        }
    }

    public void a(y yVar, bn bnVar) {
        if (this.d == null) {
            a();
        }
        Bitmap bitmap = (Bitmap) f.get(yVar.b());
        if (bitmap != null) {
            bnVar.a(bitmap, true);
            if (ImagePreview.y == 0) {
                return;
            }
        }
        bnVar.a();
        synchronized (this.c) {
            this.c.add(new a_(yVar, bnVar));
            this.c.notifyAll();
        }
    }

    static ArrayList b(z zVar) {
        return zVar.c;
    }

    static Handler a(z zVar) {
        return zVar.b;
    }

    public boolean a(y yVar) {
        int i = ImagePreview.y;
        if (yVar == null) {
            return false;
        }
        synchronized (this.c) {
            int i2;
            int i3 = -1;
            int i4 = 0;
            while (i4 < this.c.size()) {
                if (((a_) this.c.get(i4)).a == yVar) {
                    if (i == 0) {
                        i2 = i4;
                        break;
                    }
                    i2 = i4;
                } else {
                    i2 = i3;
                }
                i4++;
                if (i != 0) {
                    break;
                }
                i3 = i2;
            }
            i2 = i3;
            if (i2 >= 0) {
                this.c.remove(i2);
                return true;
            }
            return false;
        }
    }

    public static void a(String str) {
        f.remove(str);
    }

    public z(ContentResolver contentResolver, Handler handler) {
        this.c = new ArrayList();
        this.a = contentResolver;
        this.b = handler;
        a();
        Log.i(z[0] + f.maxSize());
    }

    public static void b() {
        f.trimToSize(-1);
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
        r2 = "l;\r8Ki9\r;Kwy\u000f>Mm3\u001f6T`l";
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
        if (r7 > r8) goto L_0x0045;
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
        r0 = "l;\r8K(:\u0003>J`$";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        r0 = new com.whatsapp.gallerypicker.au;
        r1 = java.lang.Runtime.getRuntime();
        r2 = r1.maxMemory();
        r4 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r2 = r2 / r4;
        r4 = 8;
        r2 = r2 / r4;
        r1 = (int) r2;
        r0.<init>(r1);
        f = r0;
        return;
    L_0x0045:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0056;
            case 1: goto L_0x0058;
            case 2: goto L_0x005b;
            case 3: goto L_0x005e;
            default: goto L_0x004c;
        };
    L_0x004c:
        r2 = 46;
    L_0x004e:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0056:
        r2 = 5;
        goto L_0x004e;
    L_0x0058:
        r2 = 86;
        goto L_0x004e;
    L_0x005b:
        r2 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        goto L_0x004e;
    L_0x005e:
        r2 = 95;
        goto L_0x004e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.z.<clinit>():void");
    }
}
