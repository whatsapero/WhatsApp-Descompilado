package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video;
import java.io.FileDescriptor;
import java.util.WeakHashMap;

public class bw {
    private static bw a;
    private final WeakHashMap b;

    public Bitmap a(FileDescriptor fileDescriptor, Options options) {
        if (options.mCancel) {
            return null;
        }
        Thread currentThread = Thread.currentThread();
        if (!c(currentThread)) {
            return null;
        }
        a(currentThread, options);
        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        b(currentThread);
        return decodeFileDescriptor;
    }

    public synchronized void d(Thread thread) {
        a(thread).a = ALLOW;
    }

    static {
        a = null;
    }

    public synchronized void a(Thread thread, ContentResolver contentResolver) {
        try {
            r a = a(thread);
            a.a = CANCEL;
            if (a.c != null) {
                a.c.requestCancelDecode();
            }
            notifyAll();
            synchronized (a) {
                if (a.b && VERSION.SDK_INT >= 8) {
                    Thumbnails.cancelThumbnailRequest(contentResolver, -1, thread.getId());
                    Video.Thumbnails.cancelThumbnailRequest(contentResolver, -1, thread.getId());
                }
            }
        } catch (Throwable th) {
        }
    }

    private synchronized r a(Thread thread) {
        r rVar;
        rVar = (r) this.b.get(thread);
        if (rVar == null) {
            rVar = new r(null);
            this.b.put(thread, rVar);
        }
        return rVar;
    }

    public static synchronized bw a() {
        bw bwVar;
        synchronized (bw.class) {
            if (a == null) {
                a = new bw();
            }
            bwVar = a;
        }
        return bwVar;
    }

    private bw() {
        this.b = new WeakHashMap();
    }

    synchronized void b(Thread thread) {
        ((r) this.b.get(thread)).c = null;
    }

    public Bitmap a(ContentResolver contentResolver, long j, int i, Options options, boolean z) {
        Bitmap currentThread = Thread.currentThread();
        r a = a(currentThread);
        if (c(currentThread)) {
            boolean z2;
            try {
                synchronized (a) {
                    a.b = true;
                }
                if (!z) {
                    z2 = VERSION.SDK_INT;
                    if (z2 >= true) {
                        currentThread = Thumbnails.getThumbnail(contentResolver, j, currentThread.getId(), i, options);
                        synchronized (a) {
                            a.b = false;
                            a.notifyAll();
                        }
                        return currentThread;
                    }
                    currentThread = Thumbnails.getThumbnail(contentResolver, j, i, options);
                    a.b = z2;
                    a.notifyAll();
                    return currentThread;
                } else if (VERSION.SDK_INT >= 8) {
                    currentThread = Video.Thumbnails.getThumbnail(contentResolver, j, currentThread.getId(), i, options);
                    synchronized (a) {
                        a.b = false;
                        a.notifyAll();
                    }
                    return currentThread;
                } else {
                    currentThread = Video.Thumbnails.getThumbnail(contentResolver, j, i, options);
                    synchronized (a) {
                        a.b = false;
                        a.notifyAll();
                    }
                    return currentThread;
                }
            } finally {
                synchronized (a) {
                    z2 = false;
                }
                try {
                    a.b = false;
                    a.notifyAll();
                } catch (Throwable th) {
                    while (true) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    public synchronized boolean c(Thread thread) {
        boolean z = true;
        synchronized (this) {
            r rVar = (r) this.b.get(thread);
            if (rVar != null) {
                boolean z2;
                if (rVar.a != CANCEL) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2;
            }
        }
        return z;
    }

    private synchronized void a(Thread thread, Options options) {
        a(thread).c = options;
    }
}
