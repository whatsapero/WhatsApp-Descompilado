package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.util.LruCache;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public abstract class aq implements v {
    private static final Pattern a;
    private static final String[] z;
    protected ContentResolver b;
    protected int c;
    protected Uri d;
    protected Cursor e;
    protected String f;
    private final LruCache g;
    protected boolean h;

    protected abstract aw a(Cursor cursor);

    protected abstract Cursor c();

    public void e() {
        try {
            b();
        } catch (Throwable e) {
            Log.b(z[4], e);
        }
        try {
            this.b = null;
            if (this.e != null) {
                this.e.close();
                this.e = null;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static {
        String[] strArr = new String[7];
        String str = "\u001f\u0004\u001dh";
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
                        i3 = 63;
                        break;
                    case ay.f /*1*/:
                        i3 = 69;
                        break;
                    case ay.n /*2*/:
                        i3 = 78;
                        break;
                    case ay.p /*3*/:
                        i3 = 43;
                        break;
                    default:
                        i3 = 115;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\\$=NSV# ^\u001fSm*J\u0007Z1/@\u0016Qi~\u0002SH-+ES\u000fe:C\u0016Qe*J\u0007Z\u001a#D\u0017V#'N\u0017\u0015t~\u001bC\u001f \"X\u0016\u001f!/_\u0016K$%N\u001d\u001f  O";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0013e\u0011B\u0017";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "]$=N\u001aR$)N\u001fV6:\u0004\u0016G&+[\u0007V* \u000b\u0004W,\"NS[ /H\u0007V3/_\u001aQ\"nH\u0006M6!Y";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "]$=N\u001aR$)N\u001fV6:\u0004\u0010M /_\u0016|0<X\u001cMe<N\u0007J7 XSQ0\"G";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "]$=N\u001aR$)N\u001fV6:\u0004\u001a[e#B\u0000R$:H\u001b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    char[] toCharArray2 = "\u0017kd\u0002\\c!e".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i4 = 0; length2 > i4; i4++) {
                        int i5;
                        char c2 = cArr2[i4];
                        switch (i4 % 5) {
                            case PBE.MD5 /*0*/:
                                i5 = 63;
                                break;
                            case ay.f /*1*/:
                                i5 = 69;
                                break;
                            case ay.n /*2*/:
                                i5 = 78;
                                break;
                            case ay.p /*3*/:
                                i5 = 43;
                                break;
                            default:
                                i5 = 115;
                                break;
                        }
                        cArr2[i4] = (char) (i5 ^ c2);
                    }
                    a = Pattern.compile(new String(cArr2).intern());
                default:
                    strArr2[i] = str;
                    str = "\u001f\u0001\u000bx0";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Uri a(long j) {
        try {
            if (ContentUris.parseId(this.d) != j) {
                Log.e(z[6]);
            }
            return this.d;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            try {
                return ContentUris.withAppendedId(this.d, j);
            }
        }
    }

    public aw a(int i) {
        aw awVar = (aw) this.g.get(Integer.valueOf(i));
        try {
            if (awVar == null) {
                Cursor d = d();
                if (d == null) {
                    return null;
                }
                synchronized (this) {
                    awVar = d.moveToPosition(i) ? a(d) : null;
                    if (awVar != null) {
                        this.g.put(Integer.valueOf(i), awVar);
                    }
                }
            }
            return awVar;
        } catch (IllegalStateException e) {
            throw e;
        } catch (Throwable th) {
        }
    }

    private Cursor d() {
        Cursor cursor;
        synchronized (this) {
            try {
                if (this.e == null) {
                    cursor = null;
                } else {
                    if (this.h) {
                        this.e.requery();
                        this.h = false;
                    }
                    cursor = this.e;
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
        return cursor;
    }

    public int b() {
        Cursor d = d();
        if (d == null) {
            return 0;
        }
        int count;
        synchronized (this) {
            count = d.getCount();
        }
        return count;
    }

    public void b(ContentObserver contentObserver) {
    }

    public aq(ContentResolver contentResolver, Uri uri, int i, String str) {
        this.g = new LruCache(512);
        this.h = false;
        this.c = i;
        this.d = uri;
        this.f = str;
        this.b = contentResolver;
        this.e = c();
        if (this.e == null) {
            Log.w(z[5]);
        }
        this.g.trimToSize(0);
    }

    public void b() {
        try {
            if (this.e != null) {
                this.e.deactivate();
                this.h = true;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected String a() {
        try {
            String str;
            if (this.c == 1) {
                str = z[0];
            } else {
                str = z[1];
            }
            return z[2] + str + z[3] + str;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void d() {
    }

    public boolean a() {
        try {
            return b() == 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void a(ContentObserver contentObserver) {
    }
}
