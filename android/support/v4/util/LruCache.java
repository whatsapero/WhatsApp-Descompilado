package android.support.v4.util;

import android.support.v4.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class LruCache {
    public static int a;
    private static final String[] z;
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    static {
        String[] strArr = new String[7];
        String str = "!\u001e\u0005\u0010Zw[\u0012E\u000b&";
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
                        i3 = 74;
                        break;
                    case ay.f /*1*/:
                        i3 = 123;
                        break;
                    case ay.n /*2*/:
                        i3 = 124;
                        break;
                    case ay.p /*3*/:
                        i3 = 48;
                        break;
                    default:
                        i3 = 103;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0004\u001e\u001bQ\u0013#\r\u0019\u0010\u0014#\u0001\u0019\nG";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "!\u001e\u0005\u0010Zw[\u0012E\u000b&";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "!\u001e\u0005\u0010Zw[\u0012E\u000b&[\u0000LG<\u001a\u0010E\u0002jFA\u0010\t?\u0017\u0010";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "d\b\u0015J\u0002\u0005\u001dT\u0019G#\b\\B\u0002:\u0014\u000eD\u000e$\u001c\\Y\t)\u0014\u0012C\u000e9\u000f\u0019^\u0013j\t\u0019C\u0012&\u000f\u000f\u0011";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "'\u001a\u0004c\u000e0\u001e\\\fZjK";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0006\t\ts\u0006)\u0013\u0019k\n+\u0003/Y\u001d/FYTK\"\u0012\bCZo\u001fP]\u000e9\b\u0019CZo\u001fPX\u000e>)\u001dD\u0002w^\u0018\u0015B\u0017";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public LruCache(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(z[6]);
        }
        this.maxSize = i;
        this.map = new LinkedHashMap(0, 0.75f, true);
    }

    private int safeSizeOf(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        try {
            throw new IllegalStateException(z[2] + obj + "=" + obj2);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final Object remove(Object obj) {
        if (obj == null) {
            try {
                throw new NullPointerException(z[0]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        Object remove;
        synchronized (this) {
            try {
                remove = this.map.remove(obj);
                if (remove != null) {
                    this.size -= safeSizeOf(obj, remove);
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (Throwable th) {
            }
        }
        if (remove != null) {
            try {
                entryRemoved(false, obj, remove, null);
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        return remove;
    }

    protected int sizeOf(Object obj, Object obj2) {
        return 1;
    }

    public final synchronized int size() {
        return this.size;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
        r4_this = this;
        if (r5 != 0) goto L_0x000f;
    L_0x0002:
        r0 = new java.lang.NullPointerException;	 Catch:{ IllegalArgumentException -> 0x000d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x000d }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x000d }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x000d }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x000d }
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        monitor-enter(r4);
        r0 = r4.map;	 Catch:{ all -> 0x002f }
        r0 = r0.get(r5);	 Catch:{ all -> 0x002f }
        if (r0 == 0) goto L_0x0020;
    L_0x0018:
        r1 = r4.hitCount;	 Catch:{ all -> 0x002f }
        r1 = r1 + 1;
        r4.hitCount = r1;	 Catch:{ all -> 0x002f }
        monitor-exit(r4);	 Catch:{ all -> 0x002f }
    L_0x001f:
        return r0;
    L_0x0020:
        r0 = r4.missCount;	 Catch:{ all -> 0x002f }
        r0 = r0 + 1;
        r4.missCount = r0;	 Catch:{ all -> 0x002f }
        monitor-exit(r4);	 Catch:{ all -> 0x002f }
        r1 = r4.create(r5);
        if (r1 != 0) goto L_0x0032;
    L_0x002d:
        r0 = 0;
        goto L_0x001f;
    L_0x002f:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x002f }
        throw r0;
    L_0x0032:
        monitor-enter(r4);
        r0 = r4.createCount;	 Catch:{ all -> 0x0061 }
        r0 = r0 + 1;
        r4.createCount = r0;	 Catch:{ all -> 0x0061 }
        r0 = r4.map;	 Catch:{ all -> 0x0061 }
        r0 = r0.put(r5, r1);	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x004a;
    L_0x0041:
        r2 = r4.map;	 Catch:{ IllegalArgumentException -> 0x005d }
        r2.put(r5, r0);	 Catch:{ IllegalArgumentException -> 0x005d }
        r2 = a;	 Catch:{ IllegalArgumentException -> 0x005d }
        if (r2 == 0) goto L_0x0053;
    L_0x004a:
        r2 = r4.size;	 Catch:{ IllegalArgumentException -> 0x005f }
        r3 = r4.safeSizeOf(r5, r1);	 Catch:{ IllegalArgumentException -> 0x005f }
        r2 = r2 + r3;
        r4.size = r2;	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x0053:
        monitor-exit(r4);	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0064;
    L_0x0056:
        r2 = 0;
        r4.entryRemoved(r2, r5, r1, r0);	 Catch:{ IllegalArgumentException -> 0x005b }
        goto L_0x001f;
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0061 }
        throw r0;
    L_0x0064:
        r0 = r4.maxSize;
        r4.trimToSize(r0);
        r0 = r1;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.LruCache.get(java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        String format;
        int i = 0;
        synchronized (this) {
            try {
                int i2 = a;
                int i3 = this.hitCount + this.missCount;
                if (i3 != 0) {
                    i = (this.hitCount * 100) / i3;
                }
                format = String.format(z[1], new Object[]{Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i)});
                if (Fragment.a != 0) {
                    a = i2 + 1;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (Throwable th) {
            }
        }
        return format;
    }

    public final synchronized Map snapshot() {
        return new LinkedHashMap(this.map);
    }

    public final Object put(Object obj, Object obj2) {
        int i = a;
        if (obj == null || obj2 == null) {
            try {
                throw new NullPointerException(z[4]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        Object put;
        synchronized (this) {
            try {
                this.putCount++;
                this.size += safeSizeOf(obj, obj2);
                put = this.map.put(obj, obj2);
                if (put != null) {
                    this.size -= safeSizeOf(obj, put);
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (Throwable th) {
            }
        }
        if (put != null) {
            try {
                entryRemoved(false, obj, put, obj2);
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        trimToSize(this.maxSize);
        if (i != 0) {
            Fragment.a++;
        }
        return put;
    }

    public void trimToSize(int i) {
        int i2 = a;
        do {
            Object key;
            Object value;
            synchronized (this) {
                try {
                    if (this.size >= 0) {
                        if (!this.map.isEmpty() || this.size == 0) {
                            if (this.size <= i || this.map.isEmpty()) {
                                if (i2 == 0) {
                                    return;
                                }
                            }
                            Entry entry = (Entry) this.map.entrySet().iterator().next();
                            key = entry.getKey();
                            value = entry.getValue();
                            this.map.remove(key);
                            this.size -= safeSizeOf(key, value);
                            this.evictionCount++;
                        }
                    }
                    throw new IllegalStateException(getClass().getName() + z[5]);
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                } catch (Throwable th) {
                }
            }
            entryRemoved(true, key, value, null);
        } while (i2 == 0);
    }

    protected Object create(Object obj) {
        return null;
    }

    protected void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
    }
}
