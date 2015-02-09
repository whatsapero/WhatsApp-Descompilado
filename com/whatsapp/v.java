package com.whatsapp;

import android.database.sqlite.SQLiteDiskIOException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class v {
    private static final ase a;
    private static final ArrayList b;
    private static final Comparator c;
    private static final String[] z;

    public static int a() {
        int size;
        synchronized (b) {
            size = b.size();
        }
        return size;
    }

    public static boolean d(String str) {
        try {
            return a(str) != null;
        } catch (SQLiteDiskIOException e) {
            throw e;
        }
    }

    public static void f() {
        App.aJ.a(a);
    }

    public static void a(String str, String str2, String str3) {
        Log.i(z[9] + str + z[10] + str2);
        synchronized (b) {
            az8 a = a(str);
            if (a == null) {
                a = new az8(null);
                a.a = str2;
            }
            b.remove(a);
            a.a = str2;
            b.add(0, a);
        }
    }

    public static void i() {
        App.aT.a();
    }

    static boolean c(String str) {
        return e(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList g() {
        /*
        r1 = com.whatsapp.App.az;
        r2 = new java.util.ArrayList;
        r0 = b;
        r0 = r0.size();
        r2.<init>(r0);
        r3 = b;
        monitor-enter(r3);
        r0 = b;	 Catch:{ all -> 0x0037 }
        r4 = r0.iterator();	 Catch:{ all -> 0x0037 }
    L_0x0016:
        r0 = r4.hasNext();	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0033;
    L_0x001c:
        r0 = r4.next();	 Catch:{ all -> 0x0037 }
        r0 = (com.whatsapp.az8) r0;	 Catch:{ all -> 0x0037 }
        r5 = com.whatsapp.App.aJ;	 Catch:{ SQLiteDiskIOException -> 0x0035 }
        r6 = r0.a;	 Catch:{ SQLiteDiskIOException -> 0x0035 }
        r5 = r5.q(r6);	 Catch:{ SQLiteDiskIOException -> 0x0035 }
        if (r5 == 0) goto L_0x0031;
    L_0x002c:
        r0 = r0.a;	 Catch:{ SQLiteDiskIOException -> 0x0035 }
        r2.add(r0);	 Catch:{ SQLiteDiskIOException -> 0x0035 }
    L_0x0031:
        if (r1 == 0) goto L_0x0016;
    L_0x0033:
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        return r2;
    L_0x0035:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0037 }
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.v.g():java.util.ArrayList");
    }

    static {
        String[] strArr = new String[11];
        String str = ".`\u001bYa?|\u0014[m\"aZ\\a#k\u0012Jp\n}\u001aZt\u0004a\u0013@>m";
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
                        i3 = 77;
                        break;
                    case ay.f /*1*/:
                        i3 = 15;
                        break;
                    case ay.n /*2*/:
                        i3 = 117;
                        break;
                    case ay.p /*3*/:
                        i3 = 47;
                        break;
                    default:
                        i3 = 4;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ".`\u001bYi*}ZHa9l\u001aAr(}\u0006Np$`\u001bLk#{\u0014Lpbh\u0007@q=l\u001dNpbl\u0007Je9jXLk#{\u0014Lpm";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "a/";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "a/";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ".`\u001bYi*}ZHa9l\u001aAr(}\u0006Np$`\u001bLk#{\u0014Lpbe\u001cK$ f\u0006Be9l\u001d\u000f,";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\rm\u0007@e)l\u0014\\p";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\rm\u0007@e)l\u0014\\p";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ",k\u0011hv\"z\u0005ll,{6@j9n\u0016[";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ".`\u001bYa?|\u0014[m\"a\u0006Bc? \u0007Jt!n\u0016Jg\"a\u0001Ng95";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "m\"K\u000f";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = new ArrayList();
                    a = new aso();
                    c = new kr();
                default:
                    strArr2[i] = str;
                    str = ".`\u001bYi*}ZHa9l\u001aAr(}\u0006Np$`\u001bLk#{\u0014Lpbh\u0007@q=l\u001dNpbe\u001cK$ f\u0006Be9l\u001d\u000f,";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static String c() {
        int i = App.az;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        synchronized (b) {
            do {
                if (!d(Long.toString(currentTimeMillis) + z[7])) {
                    break;
                }
                currentTimeMillis++;
            } while (i == 0);
        }
        return Long.toString(currentTimeMillis) + z[6];
    }

    private static az8 a(String str) {
        int i = App.az;
        synchronized (b) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                az8 com_whatsapp_az8 = (az8) it.next();
                if (!com_whatsapp_az8.a.equals(str)) {
                    if (i != 0) {
                        break;
                    }
                }
                return com_whatsapp_az8;
            }
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList e() {
        /*
        r1 = com.whatsapp.App.az;
        r2 = new java.util.ArrayList;
        r0 = b;
        r0 = r0.size();
        r2.<init>(r0);
        r3 = b;
        monitor-enter(r3);
        r0 = b;	 Catch:{ all -> 0x0037 }
        r4 = r0.iterator();	 Catch:{ all -> 0x0037 }
    L_0x0016:
        r0 = r4.hasNext();	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0033;
    L_0x001c:
        r0 = r4.next();	 Catch:{ all -> 0x0037 }
        r0 = (com.whatsapp.az8) r0;	 Catch:{ all -> 0x0037 }
        r5 = com.whatsapp.App.aJ;	 Catch:{ SQLiteDiskIOException -> 0x0035 }
        r6 = r0.a;	 Catch:{ SQLiteDiskIOException -> 0x0035 }
        r5 = r5.q(r6);	 Catch:{ SQLiteDiskIOException -> 0x0035 }
        if (r5 != 0) goto L_0x0031;
    L_0x002c:
        r0 = r0.a;	 Catch:{ SQLiteDiskIOException -> 0x0035 }
        r2.add(r0);	 Catch:{ SQLiteDiskIOException -> 0x0035 }
    L_0x0031:
        if (r1 == 0) goto L_0x0016;
    L_0x0033:
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        return r2;
    L_0x0035:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0037 }
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.v.e():java.util.ArrayList");
    }

    static int f(String str) {
        return g(str);
    }

    public static void h() {
        synchronized (b) {
            b.clear();
        }
    }

    public static ArrayList b() {
        ArrayList arrayList;
        int i = App.az;
        synchronized (b) {
            arrayList = new ArrayList(b.size());
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(((az8) it.next()).a);
                if (i != 0) {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.m8 b(java.lang.String r4) {
        /*
        r0 = com.whatsapp.bd.b(r4);	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        if (r0 != 0) goto L_0x004f;
    L_0x0006:
        r0 = com.whatsapp.App.P;	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        r0 = r0.a(r4);	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        r1 = r0.e;	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        r1 = r1.equals(r4);	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        if (r1 != 0) goto L_0x0042;
    L_0x0014:
        r1 = new java.lang.StringBuilder;	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        r1.<init>();	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        r2 = z;	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        r1 = r1.append(r2);	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        r1 = r1.append(r4);	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        r2 = z;	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        r1 = r1.append(r2);	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        r2 = r0.e;	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        r1 = r1.append(r2);	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        r2 = ")";
        r1 = r1.append(r2);	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        r1 = r1.toString();	 Catch:{ SQLiteDiskIOException -> 0x0043 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ SQLiteDiskIOException -> 0x0043 }
    L_0x0042:
        return r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        r1 = com.whatsapp.App.p;
        r2 = 2131624278; // 0x7f0e0156 float:1.8875731E38 double:1.0531623256E-314;
        com.whatsapp.util.aq.a(r1, r2);
        throw r0;
    L_0x004f:
        r0 = com.whatsapp.App.P;	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        r0 = r0.f(r4);	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        if (r0 == 0) goto L_0x00d1;
    L_0x0057:
        r1 = r0.h();	 Catch:{ SQLiteDiskIOException -> 0x00c7 }
        if (r1 != 0) goto L_0x0069;
    L_0x005d:
        r1 = r0.s;	 Catch:{ SQLiteDiskIOException -> 0x00c9 }
        if (r1 == 0) goto L_0x0069;
    L_0x0061:
        r1 = r0.s;	 Catch:{ SQLiteDiskIOException -> 0x00cb }
        r1 = r1.length();	 Catch:{ SQLiteDiskIOException -> 0x00cb }
        if (r1 != 0) goto L_0x008d;
    L_0x0069:
        r1 = r0.b();	 Catch:{ SQLiteDiskIOException -> 0x00cd }
        if (r1 != 0) goto L_0x008d;
    L_0x006f:
        r1 = new java.lang.StringBuilder;	 Catch:{ SQLiteDiskIOException -> 0x00cf }
        r1.<init>();	 Catch:{ SQLiteDiskIOException -> 0x00cf }
        r2 = z;	 Catch:{ SQLiteDiskIOException -> 0x00cf }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ SQLiteDiskIOException -> 0x00cf }
        r1 = r1.append(r2);	 Catch:{ SQLiteDiskIOException -> 0x00cf }
        r2 = r0.e;	 Catch:{ SQLiteDiskIOException -> 0x00cf }
        r1 = r1.append(r2);	 Catch:{ SQLiteDiskIOException -> 0x00cf }
        r1 = r1.toString();	 Catch:{ SQLiteDiskIOException -> 0x00cf }
        com.whatsapp.util.Log.e(r1);	 Catch:{ SQLiteDiskIOException -> 0x00cf }
        com.whatsapp.App.D(r4);	 Catch:{ SQLiteDiskIOException -> 0x00cf }
    L_0x008d:
        r1 = r0.e;	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        r1 = r1.equals(r4);	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        if (r1 != 0) goto L_0x0042;
    L_0x0095:
        r1 = new java.lang.StringBuilder;	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        r1.<init>();	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        r2 = z;	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        r1 = r1.append(r2);	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        r1 = r1.append(r4);	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        r2 = z;	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        r1 = r1.append(r2);	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        r2 = r0.e;	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        r1 = r1.append(r2);	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        r2 = ")";
        r1 = r1.append(r2);	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        r1 = r1.toString();	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ SQLiteDiskIOException -> 0x00c5 }
        goto L_0x0042;
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0045 }
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00cb }
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0045 }
    L_0x00d1:
        r0 = new java.lang.StringBuilder;	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        r0.<init>();	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        r1 = z;	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        r0 = r0.append(r1);	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        r0 = r0.append(r4);	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        r0 = r0.toString();	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        r0 = new com.whatsapp.m8;	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        r0.<init>(r4);	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        r1 = com.whatsapp.App.P;	 Catch:{ SQLiteDiskIOException -> 0x00ff }
        r1.n(r0);	 Catch:{ SQLiteDiskIOException -> 0x00ff }
        r1 = com.whatsapp.m8.e(r4);	 Catch:{ SQLiteDiskIOException -> 0x00ff }
        if (r1 != 0) goto L_0x0042;
    L_0x00fa:
        com.whatsapp.App.D(r4);	 Catch:{ SQLiteDiskIOException -> 0x00ff }
        goto L_0x0042;
    L_0x00ff:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0045 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.v.b(java.lang.String):com.whatsapp.m8");
    }

    public static int d() {
        int i;
        int i2 = App.az;
        int i3 = 0;
        synchronized (b) {
            try {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    if (App.aJ.q(((az8) it.next()).a)) {
                        i = i3;
                    } else {
                        i = i3 + 1;
                    }
                    if (i2 == 0) {
                        i3 = i;
                    }
                    break;
                }
                i = i3;
                break;
            } catch (SQLiteDiskIOException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
        return i;
    }

    private static int g(String str) {
        int i;
        int i2 = App.az;
        int i3 = -1;
        synchronized (b) {
            int i4 = 0;
            while (i4 < b.size()) {
                if (((az8) b.get(i4)).a.equals(str)) {
                    b.remove(i4);
                    i = i4;
                } else {
                    i = i3;
                }
                i4++;
                if (i2 != 0) {
                    break;
                }
                i3 = i;
            }
            i = i3;
        }
        return i;
    }

    public static int j() {
        int i;
        int i2 = App.az;
        int i3 = 0;
        synchronized (b) {
            try {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    if (App.aJ.q(((az8) it.next()).a)) {
                        i = i3 + 1;
                    } else {
                        i = i3;
                    }
                    if (i2 == 0) {
                        i3 = i;
                    }
                    break;
                }
                i = i3;
                break;
            } catch (SQLiteDiskIOException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
        return i;
    }

    private static int a(az8 com_whatsapp_az8) {
        return Collections.binarySearch(b, com_whatsapp_az8, c);
    }

    private static boolean e(String str) {
        boolean z;
        synchronized (b) {
            try {
                az8 a = a(str);
                if (a == null) {
                    a = new az8(null);
                    a.a = str;
                }
                a.b = App.aJ.i(str);
                int g = g(str);
                int a2 = a(a);
                b.add((-a2) - 1, a);
                if ((-a2) - 1 != g) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (SQLiteDiskIOException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
        return z;
    }

    public static m8 a(String str, String str2, long j) {
        Log.i(z[8]);
        m8 m8Var = new m8(str);
        m8Var.N = str2;
        m8Var.s = Long.toString(j);
        App.P.l(m8Var);
        return m8Var;
    }
}
