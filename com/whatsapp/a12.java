package com.whatsapp;

import android.backport.util.Base64;
import android.content.SharedPreferences.Editor;
import android.location.Location;
import android.location.LocationListener;
import com.whatsapp.util.Log;
import com.whatsapp.util.br;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aZ;
import org.whispersystems.libaxolotl.ay;
import org.whispersystems.libaxolotl.ecc.a;
import org.whispersystems.libaxolotl.ecc.b;
import org.whispersystems.libaxolotl.ecc.d;

public final class a12 {
    public static byte[] a;
    public static final List b;
    public static String c;
    public static byte[] d;
    public static a_8 e;
    private static AtomicReference f;
    public static String g;
    private static zd h;
    private static boolean i;
    private static final SecureRandom j;
    public static String k;
    private static Map l;
    public static byte[] m;
    private static final List n;
    private static final String[] z;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 127;
                    break;
                case ay.f /*1*/:
                    i2 = 112;
                    break;
                case ay.n /*2*/:
                    i2 = 74;
                    break;
                case ay.p /*3*/:
                    i2 = 1;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 71);
        }
        return toCharArray;
    }

    static boolean l() {
        return t();
    }

    private static Map d() {
        int i = App.az;
        if (l == null) {
            l = new LinkedHashMap();
            for (avu com_whatsapp_avu : f().b()) {
                l.put(com_whatsapp_avu.b, com_whatsapp_avu);
                if (i != 0) {
                    break;
                }
            }
        }
        return l;
    }

    public static a_8 c() {
        a_8 com_whatsapp_a_8 = e;
        e = null;
        return com_whatsapp_a_8;
    }

    static SecureRandom e() {
        return j;
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        if (!h(str)) {
            Log.e(z[8]);
        }
        if (!m(str4)) {
            Log.e(z[6]);
        }
        if (!(str2 == null || a(str2))) {
            Log.e(z[7]);
        }
        if (!(str3 == null || e(str3))) {
            Log.e(z[10]);
        }
        if (!a(str3, str2, str4, str5, str6, z)) {
            Log.e(z[9]);
        }
    }

    public static String a(String str, byte[] bArr) {
        a a = d.a();
        try {
            Object a2 = aZ.a(3).a(d.a(d.a(a8g.b(new byte[]{(byte) 5}, Base64.decode(str, 0)), 0), a.a()), null, 80);
            Object obj = new Object[32];
            System.arraycopy(a2, 0, obj, 0, 32);
            Object obj2 = new Object[32];
            System.arraycopy(a2, 32, obj2, 0, 32);
            Object obj3 = new Object[16];
            System.arraycopy(a2, 64, obj3, 0, 16);
            byte[] a3 = a8g.a(obj, obj3, bArr);
            byte[] a4 = ((b) a.b()).a();
            byte[] a5 = a8g.a(obj2, a8g.b(a4, a3));
            if (a5 != null && a3 != null) {
                return Base64.encodeToString(a8g.b(a4, a8g.b(a5, a3)), 2);
            }
            try {
                boolean z;
                String str2 = z[23];
                Object[] objArr = new Object[2];
                if (a3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    objArr[0] = Boolean.valueOf(z);
                    if (a5 == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objArr[1] = Boolean.valueOf(z);
                    Log.b(str2, null, objArr);
                    return null;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e22) {
            Log.e(z[22] + e22);
            return null;
        }
    }

    public static void a(long j) {
        i = false;
        a(j, g);
    }

    private static boolean a(String str, boolean z) {
        d = Base64.decode(str, 0);
        if (d.length == 64) {
            a = new byte[32];
            m = new byte[32];
            System.arraycopy(d, 0, a, 0, 32);
            System.arraycopy(d, 32, m, 0, 32);
        }
        return !z || a(z[26], z[25], str);
    }

    public static void a(String str, String str2) {
        boolean z;
        if (str2 == null || !str2.equals(k)) {
            z = false;
        } else {
            z = true;
        }
        App.a(str, str2, z);
    }

    static void j() {
        k();
    }

    public static boolean i(String str) {
        return d().containsKey(str);
    }

    public static void a(a5y com_whatsapp_a5y) {
        n.remove(com_whatsapp_a5y);
    }

    public static void i() {
        i = true;
        k();
    }

    public static String o() {
        byte[] bArr = new byte[32];
        j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 2);
    }

    static zd b() {
        return f();
    }

    public static List g() {
        int i = App.az;
        Iterator it = new ArrayList(d().values()).iterator();
        while (it.hasNext()) {
            a((avu) it.next());
            if (i != 0) {
                break;
            }
        }
        return new ArrayList(d().values());
    }

    private static boolean e(String str) {
        g = str;
        return a(z[12], z[11], str);
    }

    public static boolean s() {
        return c != null;
    }

    public static n2 a(int i, boolean z, boolean z2) {
        n2 n2Var = new n2(i, z, z2, null);
        return n2Var.equals((n2) f.getAndSet(n2Var)) ? null : n2Var;
    }

    public static void b(a5y com_whatsapp_a5y) {
        if (!n.contains(com_whatsapp_a5y)) {
            n.add(com_whatsapp_a5y);
        }
    }

    public static boolean c(String str) {
        return (str == null && g == null) || (g != null && g.equals(str));
    }

    private static boolean a(String str, String str2, String str3) {
        Editor edit = App.p.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        return edit.commit();
    }

    public static void h() {
        if (b.size() > 0) {
            br.a(new _g());
        }
    }

    private static boolean a(String str, String str2, String str3, String str4, String str5, boolean z) {
        if (str != null) {
            avu com_whatsapp_avu;
            Log.a(z[0], null, new Object[]{str, str3, str4, str5});
            avu com_whatsapp_avu2 = (avu) d().get(str);
            if (com_whatsapp_avu2 == null) {
                com_whatsapp_avu2 = new avu(str, str2, str3, str4, str5, z);
                d().put(str, com_whatsapp_avu2);
                if (App.az == 0) {
                    com_whatsapp_avu = com_whatsapp_avu2;
                    com_whatsapp_avu.i = System.currentTimeMillis();
                    f().a(str, str2, str3, str4, str5, z);
                    k();
                    b(com_whatsapp_avu);
                }
            }
            com_whatsapp_avu2.g = str2;
            com_whatsapp_avu2.f = str3;
            com_whatsapp_avu2.c = str4;
            com_whatsapp_avu2.j = str5;
            com_whatsapp_avu2.e = z;
            com_whatsapp_avu2.d = 0;
            com_whatsapp_avu = com_whatsapp_avu2;
            com_whatsapp_avu.i = System.currentTimeMillis();
            f().a(str, str2, str3, str4, str5, z);
            k();
            b(com_whatsapp_avu);
        }
        return true;
    }

    public static boolean d(String str) {
        return str != null && str.equals(g) && a();
    }

    public static boolean a() {
        return n() && i;
    }

    public static void b(String str) {
        d().remove(str);
        f().a(str);
    }

    private static boolean a(String str) {
        return a(str, true);
    }

    public static void c(String str, String str2) {
        avu com_whatsapp_avu = (avu) d().get(str);
        if (com_whatsapp_avu != null) {
            Object decode = Base64.decode(com_whatsapp_avu.g, 0);
            Object obj = new Object[32];
            System.arraycopy(decode, 0, obj, 0, 32);
            Object obj2 = new Object[32];
            System.arraycopy(decode, 32, obj2, 0, 32);
            byte[] a = a8g.a(obj2, obj);
            if (a != null && Base64.encodeToString(a, 2).equals(str2)) {
                b(str);
                k();
            }
        }
    }

    private static boolean m(String str) {
        c = str;
        return a(z[29], z[30], str);
    }

    private static void b(avu com_whatsapp_avu) {
        b8 b8Var = new b8(App.p);
        Location a = b8Var.a(2);
        if (a != null && a.getTime() + 120000 > System.currentTimeMillis()) {
            Log.i(z[24] + a.getTime());
            br.a(new ql(com_whatsapp_avu, a));
            if (App.az == 0) {
                return;
            }
        }
        LocationListener cqVar = new cq(com_whatsapp_avu, b8Var);
        b8Var.a(2, 0, 0.0f, cqVar);
        App.p.U().postDelayed(new sl(b8Var, cqVar), 60000);
    }

    public static boolean m() {
        return !d().isEmpty();
    }

    public static void q() {
        App.p.getSharedPreferences(z[21], 0).edit().clear().commit();
        d().clear();
        f().a();
        d = null;
        a = null;
        m = null;
        c = null;
        g = null;
        k();
    }

    private static boolean h(String str) {
        k = str;
        return a(z[20], z[19], str);
    }

    private static boolean t() {
        return a(false);
    }

    private static zd f() {
        if (h == null) {
            h = zd.a(App.p);
        }
        return h;
    }

    public static void a(String str, int i) {
        if (k == null || k.equals(str)) {
            if (!t()) {
                Log.e(z[18]);
            }
            a(i);
        }
    }

    public static void b(boolean z) {
        if (!a(z)) {
            Log.e(z[4]);
        }
    }

    public static void g(String str) {
        if (i(str)) {
            b(str);
            k();
        }
    }

    public static void f(String str) {
        if (!a(str, false)) {
            Log.e(z[5]);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(boolean r7) {
        /*
        r6 = 0;
        r0 = com.whatsapp.App.p;
        r1 = z;
        r2 = 13;
        r1 = r1[r2];
        r2 = 0;
        r0 = r0.getSharedPreferences(r1, r2);
        r1 = r0.edit();
        k = r6;
        r0 = z;
        r2 = 15;
        r0 = r0[r2];
        r1.remove(r0);
        if (r7 == 0) goto L_0x0050;
    L_0x001f:
        r0 = g;
        b(r0);
        d = r6;
        a = r6;
        m = r6;
        c = r6;
        g = r6;
        r0 = z;
        r2 = 14;
        r0 = r0[r2];
        r1.remove(r0);
        r0 = z;
        r2 = 16;
        r0 = r0[r2];
        r1.remove(r0);
        r0 = z;
        r2 = 17;
        r0 = r0[r2];
        r1.remove(r0);
        k();
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0077;
    L_0x0050:
        r0 = d();
        r2 = g;
        r0 = r0.get(r2);
        r0 = (com.whatsapp.avu) r0;
        if (r0 == 0) goto L_0x0077;
    L_0x005e:
        r2 = r0.e;
        if (r2 == 0) goto L_0x0077;
    L_0x0062:
        r2 = java.lang.System.currentTimeMillis();
        r4 = 600000; // 0x927c0 float:8.40779E-40 double:2.964394E-318;
        r2 = r2 + r4;
        r0.d = r2;
        r2 = f();
        r3 = g;
        r4 = r0.d;
        r2.a(r3, r4);
    L_0x0077:
        r0 = b;
        r0.clear();
        e = r6;
        r0 = r1.commit();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a12.a(boolean):boolean");
    }

    public static void p() {
        if (!t()) {
            Log.e(z[27]);
        }
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
        r3 = 1;
        r1 = -1;
        r9 = 32;
        r2 = 0;
        r8 = 0;
        r4 = new java.lang.String[r9];
        r0 = "\u000e\u00029d4\f\u0019%oh\f\u0015>^%\r\u001f=r\"\rPorgZ\u0003j$4_U9";
        r5 = r2;
        r6 = r4;
        r7 = r4;
        r4 = r0;
        r0 = r1;
    L_0x000f:
        r4 = z(r4);
        r4 = z(r4);
        switch(r0) {
            case 0: goto L_0x0023;
            case 1: goto L_0x002d;
            case 2: goto L_0x0035;
            case 3: goto L_0x003d;
            case 4: goto L_0x0045;
            case 5: goto L_0x004d;
            case 6: goto L_0x0055;
            case 7: goto L_0x005e;
            case 8: goto L_0x0068;
            case 9: goto L_0x0072;
            case 10: goto L_0x007c;
            case 11: goto L_0x0086;
            case 12: goto L_0x0090;
            case 13: goto L_0x009b;
            case 14: goto L_0x00a6;
            case 15: goto L_0x00b1;
            case 16: goto L_0x00bc;
            case 17: goto L_0x00c7;
            case 18: goto L_0x00d2;
            case 19: goto L_0x00dd;
            case 20: goto L_0x00e8;
            case 21: goto L_0x00f3;
            case 22: goto L_0x00fe;
            case 23: goto L_0x0109;
            case 24: goto L_0x0114;
            case 25: goto L_0x011f;
            case 26: goto L_0x012a;
            case 27: goto L_0x0135;
            case 28: goto L_0x0140;
            case 29: goto L_0x014b;
            case 30: goto L_0x0156;
            default: goto L_0x001a;
        };
    L_0x001a:
        r6[r5] = r4;
        r0 = "\u000b\u001f!d)";
        r4 = r0;
        r5 = r3;
        r6 = r7;
        r0 = r2;
        goto L_0x000f;
    L_0x0023:
        r6[r5] = r4;
        r4 = 2;
        r0 = "\u000e\u00029d4\f\u0019%oh\u001c\u001c/`53\u001f-h)+\u001f!d)P\u00158s(\r_)n*\u0012\u0019>^!\u001e\u0019&d#";
        r5 = r4;
        r6 = r7;
        r4 = r0;
        r0 = r3;
        goto L_0x000f;
    L_0x002d:
        r6[r5] = r4;
        r5 = 3;
        r4 = "\u000e\u0002\u0015e&\u000b\u0011";
        r0 = 2;
        r6 = r7;
        goto L_0x000f;
    L_0x0035:
        r6[r5] = r4;
        r5 = 4;
        r4 = "\u000e\u00029d4\f\u0019%oh\u0010\u001e\u001bs\u0013\u001a\u0002'h)\u001e\u0004/.\"\r\u0002%sh\u001c\u001f'l.\u000b/,`.\u0013\u0015.";
        r0 = 3;
        r6 = r7;
        goto L_0x000f;
    L_0x003d:
        r6[r5] = r4;
        r5 = 5;
        r4 = "\u000e\u00029d4\f\u0019%oh\u001d\u0015,n5\u001a!\u0018R>\u0011\u0013eb(\u0012\u001d#u\u0018\u0019\u0011#m\"\u001b/9d$\r\u0015>";
        r0 = 4;
        r6 = r7;
        goto L_0x000f;
    L_0x0045:
        r6[r5] = r4;
        r5 = 6;
        r4 = "\u000e\u00029d4\f\u0019%oh\u0010\u001e\u001bs\u0014\u0006\u001e).4\n\u0013)d4\f_)n*\u0012\u0019>^!\u001e\u0019&d# \u0004%j\"\u0011";
        r0 = 5;
        r6 = r7;
        goto L_0x000f;
    L_0x004d:
        r6[r5] = r4;
        r5 = 7;
        r4 = "\u000e\u00029d4\f\u0019%oh\u0010\u001e\u001bS\u0014\u0006\u001e).4\n\u0013)d4\f_)n*\u0012\u0019>^!\u001e\u0019&d# \u0003/b5\u001a\u0004";
        r0 = 6;
        r6 = r7;
        goto L_0x000f;
    L_0x0055:
        r6[r5] = r4;
        r5 = 8;
        r4 = "\u000e\u00029d4\f\u0019%oh\u0010\u001e\u001bs\u0014\u0006\u001e).4\n\u0013)d4\f_)n*\u0012\u0019>^!\u001e\u0019&d# \u0002/g";
        r0 = 7;
        r6 = r7;
        goto L_0x000f;
    L_0x005e:
        r6[r5] = r4;
        r5 = 9;
        r4 = "\u000e\u00029d4\f\u0019%oh\u0010\u001e\u001bS\u0014\u0006\u001e).4\n\u0013)d4\f_)n*\u0012\u0019>^!\u001e\u0019&d# \u00128n0\f\u00158^.\u0011\u0016%";
        r0 = 8;
        r6 = r7;
        goto L_0x000f;
    L_0x0068:
        r6[r5] = r4;
        r5 = 10;
        r4 = "\u000e\u00029d4\f\u0019%oh\u0010\u001e\u001bS\u0014\u0006\u001e).4\n\u0013)d4\f_)n*\u0012\u0019>^!\u001e\u0019&d# \u0013?s5 \u00128n0\f\u00158";
        r0 = 9;
        r6 = r7;
        goto L_0x000f;
    L_0x0072:
        r6[r5] = r4;
        r5 = 11;
        r4 = "\u001d\u0002%v4\u001a\u0002";
        r0 = 10;
        r6 = r7;
        goto L_0x000f;
    L_0x007c:
        r6[r5] = r4;
        r5 = 12;
        r4 = "\u000e\u0002\u0015e&\u000b\u0011";
        r0 = 11;
        r6 = r7;
        goto L_0x000f;
    L_0x0086:
        r6[r5] = r4;
        r5 = 13;
        r4 = "\u000e\u0002\u0015e&\u000b\u0011";
        r0 = 12;
        r6 = r7;
        goto L_0x000f;
    L_0x0090:
        r6[r5] = r4;
        r5 = 14;
        r4 = "\u0014\u00153";
        r0 = 13;
        r6 = r7;
        goto L_0x000f;
    L_0x009b:
        r6[r5] = r4;
        r5 = 15;
        r4 = "\r\u0015,";
        r0 = 14;
        r6 = r7;
        goto L_0x000f;
    L_0x00a6:
        r6[r5] = r4;
        r5 = 16;
        r4 = "\u000b\u001f!d)";
        r0 = 15;
        r6 = r7;
        goto L_0x000f;
    L_0x00b1:
        r6[r5] = r4;
        r5 = 17;
        r4 = "\u001d\u0002%v4\u001a\u0002";
        r0 = 16;
        r6 = r7;
        goto L_0x000f;
    L_0x00bc:
        r6[r5] = r4;
        r5 = 18;
        r4 = "\u000e\u00029d4\f\u0019%oh\u0010\u001e\u001bs\u0014\u0006\u001e).\"\r\u0002%sh\u001c\u001f'l.\u000b/,`.\u0013\u0015.";
        r0 = 17;
        r6 = r7;
        goto L_0x000f;
    L_0x00c7:
        r6[r5] = r4;
        r5 = 19;
        r4 = "\r\u0015,";
        r0 = 18;
        r6 = r7;
        goto L_0x000f;
    L_0x00d2:
        r6[r5] = r4;
        r5 = 20;
        r4 = "\u000e\u0002\u0015e&\u000b\u0011";
        r0 = 19;
        r6 = r7;
        goto L_0x000f;
    L_0x00dd:
        r6[r5] = r4;
        r5 = 21;
        r4 = "\u000e\u0002\u0015e&\u000b\u0011";
        r0 = 20;
        r6 = r7;
        goto L_0x000f;
    L_0x00e8:
        r6[r5] = r4;
        r5 = 22;
        r4 = "\u000e\u00029d4\f\u0019%oh\u001a\u001e)s>\u000f\u0004\u0019d$\r\u0015>.$\n\u0002<dg\u001a\u00028n5_";
        r0 = 21;
        r6 = r7;
        goto L_0x000f;
    L_0x00f3:
        r6[r5] = r4;
        r5 = 23;
        r4 = "\u000e\u00029d4\f\u0019%oh\u001a\u001e)s>\u000f\u0004\u0019d$\r\u0015>!!\u001e\u0019&!)\n\u001c&!\"\u0011\u0013p!b\u001dP\"l&\u001cJj$%";
        r0 = 22;
        r6 = r7;
        goto L_0x000f;
    L_0x00fe:
        r6[r5] = r4;
        r5 = 24;
        r4 = "\u000e\u00029d4\f\u0019%oh\u0013\u001f)`3\u0016\u001f$.+\u001e\u0003>!";
        r0 = 23;
        r6 = r7;
        goto L_0x000f;
    L_0x0109:
        r6[r5] = r4;
        r5 = 25;
        r4 = "\u0014\u00153";
        r0 = 24;
        r6 = r7;
        goto L_0x000f;
    L_0x0114:
        r6[r5] = r4;
        r5 = 26;
        r4 = "\u000e\u0002\u0015e&\u000b\u0011";
        r0 = 25;
        r6 = r7;
        goto L_0x000f;
    L_0x011f:
        r6[r5] = r4;
        r5 = 27;
        r4 = "\u000e\u00029d4\f\u0019%oh\r\u00159d3,\u0004+u\"P\u00158s(\r_)n*\u0012\u0019>^!\u001e\u0019&d#";
        r0 = 26;
        r6 = r7;
        goto L_0x000f;
    L_0x012a:
        r6[r5] = r4;
        r5 = 28;
        r4 = "\b\u0015(R\"\f\u0003#n)P\u0017/u\u0012\u0011\u00152q.\r\u0015.R\"\f\u0003#n)_\u00128n0\f\u00158!3\u0016\u001d/eg\u0010\u0005>!b\f";
        r0 = 27;
        r6 = r7;
        goto L_0x000f;
    L_0x0135:
        r6[r5] = r4;
        r5 = 29;
        r4 = "\u000e\u0002\u0015e&\u000b\u0011";
        r0 = 28;
        r6 = r7;
        goto L_0x000f;
    L_0x0140:
        r6[r5] = r4;
        r5 = 30;
        r4 = "\u000b\u001f!d)";
        r0 = 29;
        r6 = r7;
        goto L_0x000f;
    L_0x014b:
        r6[r5] = r4;
        r5 = 31;
        r4 = "\u000e\u00029d4\f\u0019%oh\u000f\u0002%b\"\f\u0003\u001bSh\u001a\u00028n5P\u0019$w&\u0013\u0019.^$\u0010\u0014/!7\u001e\u0002>r";
        r0 = 30;
        r6 = r7;
        goto L_0x000f;
    L_0x0156:
        r6[r5] = r4;
        z = r7;
        r0 = new java.security.SecureRandom;
        r0.<init>();
        j = r0;
        r0 = new java.util.concurrent.atomic.AtomicReference;
        r0.<init>();
        f = r0;
        i = r2;
        k = r8;
        d = r8;
        a = r8;
        m = r8;
        c = r8;
        g = r8;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = java.util.Collections.synchronizedList(r0);
        b = r0;
        e = r8;
        r0 = com.whatsapp.App.p;
        r3 = "\u000e\u0002\u0015e&\u000b\u0011";
        r3 = z(r3);
        r3 = z(r3);
        r5 = r0.getSharedPreferences(r3, r2);
        r0 = "\r\u0015,";
        r3 = r0;
        r4 = r5;
        r0 = r1;
    L_0x0198:
        r3 = z(r3);
        r3 = z(r3);
        switch(r0) {
            case 0: goto L_0x01af;
            default: goto L_0x01a3;
        };
    L_0x01a3:
        r0 = r4.getString(r3, r8);
        k = r0;
        r0 = "\u0014\u00153";
        r3 = r0;
        r4 = r5;
        r0 = r2;
        goto L_0x0198;
    L_0x01af:
        r0 = r4.getString(r3, r8);
        if (r0 != 0) goto L_0x01ef;
    L_0x01b5:
        r0 = r8;
    L_0x01b6:
        d = r0;
        a = r8;
        m = r8;
        r0 = d;
        if (r0 == 0) goto L_0x01d6;
    L_0x01c0:
        r0 = new byte[r9];
        a = r0;
        r0 = new byte[r9];
        m = r0;
        r0 = d;
        r3 = a;
        java.lang.System.arraycopy(r0, r2, r3, r2, r9);
        r0 = d;
        r3 = m;
        java.lang.System.arraycopy(r0, r9, r3, r2, r9);
    L_0x01d6:
        r0 = "\u000b\u001f!d)";
        r3 = r5;
    L_0x01d9:
        r0 = z(r0);
        r0 = z(r0);
        switch(r1) {
            case 0: goto L_0x01f4;
            default: goto L_0x01e4;
        };
    L_0x01e4:
        r0 = r3.getString(r0, r8);
        c = r0;
        r0 = "\u001d\u0002%v4\u001a\u0002";
        r1 = r2;
        r3 = r5;
        goto L_0x01d9;
    L_0x01ef:
        r0 = android.backport.util.Base64.decode(r0, r2);
        goto L_0x01b6;
    L_0x01f4:
        r0 = r3.getString(r0, r8);
        g = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        n = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a12.<clinit>():void");
    }

    public static String b(String str, String str2) {
        avu l = l(str);
        return (l == null || !l.f.equals(str2)) ? null : l.g;
    }

    private static void k() {
        int i = App.az;
        for (a5y com_whatsapp_a5y : n) {
            com_whatsapp_a5y.a();
            if (i != 0) {
                return;
            }
        }
    }

    public static boolean n() {
        return k != null;
    }

    public static void r() {
        Editor edit = App.p.getSharedPreferences(z[3], 0).edit();
        c = null;
        edit.remove(z[1]);
        if (!edit.commit()) {
            Log.e(z[2]);
        }
    }

    private static avu a(avu com_whatsapp_avu) {
        if (com_whatsapp_avu == null) {
            return null;
        }
        if (!com_whatsapp_avu.e || com_whatsapp_avu.d == 0 || com_whatsapp_avu.d >= System.currentTimeMillis()) {
            return com_whatsapp_avu;
        }
        Log.a(z[28], null, new Object[]{com_whatsapp_avu.b});
        b(com_whatsapp_avu.b);
        k();
        return null;
    }

    public static void a(long j, String str) {
        if (str != null && j > 0) {
            avu com_whatsapp_avu = (avu) d().get(str);
            if (com_whatsapp_avu != null) {
                com_whatsapp_avu.i = j;
                f().b(str, com_whatsapp_avu.i);
                k();
            }
        }
    }

    public static String k(String str) {
        String o = o();
        e = new a_8(o, str);
        return o;
    }

    public static and j(String str) {
        String str2 = null;
        String[] split = str.split(",");
        if (split.length < 2) {
            Log.e(z[31]);
            return null;
        }
        String str3 = split[0];
        String str4 = split[1];
        if (split.length >= 3) {
            str2 = split[2];
        }
        return new and(str3, str4, str2);
    }

    public static String b(String str, String str2, String str3) {
        avu com_whatsapp_avu = (avu) d().get(str);
        if (com_whatsapp_avu == null) {
            return null;
        }
        Object obj = new Object[32];
        System.arraycopy(Base64.decode(com_whatsapp_avu.g, 0), 32, obj, 0, 32);
        byte[] a = a8g.a(obj, Base64.decode(str3, 0));
        if (a == null) {
            return null;
        }
        return Base64.encodeToString(a, 2).equals(str2) ? com_whatsapp_avu.g : null;
    }

    private static avu l(String str) {
        return a((avu) d().get(str));
    }

    private static void a(int i) {
        int i2 = App.az;
        for (a5y com_whatsapp_a5y : n) {
            com_whatsapp_a5y.a(i);
            if (i2 != 0) {
                return;
            }
        }
    }
}
