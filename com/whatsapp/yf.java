package com.whatsapp;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class yf {
    private static File a;
    public static String b;
    private static String c;
    private static File d;
    private static File e;
    private static String f;
    private static String g;
    private static File h;
    private static String i;
    private static File j;
    private static String k;
    public static String l;
    private static String m;
    private static File n;
    private static SimpleDateFormat o;
    private static File p;
    private static boolean q;
    private static String r;
    private static File s;
    private static File t;
    private static File u;
    private static File v;
    private static String w;
    public static String x;
    private static final String[] z;

    private static File b(File file) {
        return a(file, false);
    }

    static {
        String[] strArr = new String[15];
        String str = "L\u0016\u0001g6K\u001c\u0001}*\u0005\u000b\u0016q5K\t\u0001R*F\u001f\u0001fe";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            int i2;
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 42;
                        break;
                    case ay.f /*1*/:
                        i2 = 123;
                        break;
                    case ay.n /*2*/:
                        i2 = 100;
                        break;
                    case ay.p /*3*/:
                        i2 = 20;
                        break;
                    default:
                        i2 = 69;
                        break;
                }
                cArr[i3] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\n\u001f\u0001x ^\u001e\u00004";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\n\u001f\u000bq6\n\u0015\u000b`eO\u0003\rg1";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "L\u0016\u0001g6K\u001c\u0001}*\u0005\u0018\bq$X=\u000bx!O\tD";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\n\u0018\u0005zeD\u0014\u00104)C\b\u00104#C\u0017\u0001g";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\n\u001e\u0016f*X[\u0013| D[\u0000q)O\u000f\rz\"\n";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "L\u0016\u0001g6K\u001c\u0001}*\u0005\u0018\bq$X=\u000bx!O\tD";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "L\u0016\u0001g6K\u001c\u0001}*\u0005\u0018\bq$X=\u000bx!O\tD";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\n\b\u0001w*D\u001f\u00178eN\u0012\u001646C\u0001\u00014)C\u0016\r`e";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\n\u001d\rx \n\u0016\u0005meF\u0012\u0012qeL\u0014\u00164";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "L\u0016\u0001g6K\u001c\u0001}*\u0005\u0018\bq$X=\u000bx!O\tD";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "L\u0016\u0001g6K\u001c\u0001}*\u0005\u0018\bq$X=\u000bx!O\tD";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "L\u0016\u0001g6K\u001c\u0001}*\u0005\u0018\bq$X=\u000bx!O\tD";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "S\u0002\u001dm2]";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    z = strArr3;
                    str = "g\u001e\u0000}$";
                    obj = -1;
                    while (true) {
                        toCharArray = str.toCharArray();
                        int length2 = toCharArray.length;
                        char[] cArr2 = toCharArray;
                        for (int i4 = 0; length2 > i4; i4++) {
                            char c2 = cArr2[i4];
                            switch (i4 % 5) {
                                case PBE.MD5 /*0*/:
                                    i2 = 42;
                                    break;
                                case ay.f /*1*/:
                                    i2 = 123;
                                    break;
                                case ay.n /*2*/:
                                    i2 = 100;
                                    break;
                                case ay.p /*3*/:
                                    i2 = 20;
                                    break;
                                default:
                                    i2 = 69;
                                    break;
                            }
                            cArr2[i4] = (char) (i2 ^ c2);
                        }
                        str = new String(cArr2).intern();
                        switch (obj) {
                            case PBE.MD5 /*0*/:
                                r = str;
                                str = "}\u0013\u0005`6k\u000b\u00144\u0004_\u001f\r{";
                                obj = 1;
                                break;
                            case ay.f /*1*/:
                                f = str;
                                str = "}\u0013\u0005`6k\u000b\u00144\u0013E\u0012\u0007qed\u0014\u0010q6";
                                obj = 2;
                                break;
                            case ay.n /*2*/:
                                c = str;
                                str = "}\u0013\u0005`6k\u000b\u00144\u0013C\u001f\u0001{";
                                obj = 3;
                                break;
                            case ay.p /*3*/:
                                b = str;
                                str = "}\u0013\u0005`6k\u000b\u00144\fG\u001a\u0003q6";
                                obj = 4;
                                break;
                            case aj.i /*4*/:
                                x = str;
                                str = "\u0004(\fu7O\u001f";
                                obj = 5;
                                break;
                            case aV.r /*5*/:
                                k = str;
                                str = "}\u001a\bx\u0015K\u000b\u0001f";
                                obj = 6;
                                break;
                            case aV.i /*6*/:
                                l = str;
                                str = "}\u0013\u0005`6k\u000b\u00144\u0015X\u0014\u0002})O[4|*^\u0014\u0017";
                                obj = 7;
                                break;
                            case a8.s /*7*/:
                                m = str;
                                str = "}\u0013\u0005`6k\u000b\u00144\u0006K\u0017\bg";
                                obj = 8;
                                break;
                            case a8.n /*8*/:
                                g = str;
                                str = "\u0004\u0015\u000by N\u0012\u0005";
                                obj = 9;
                                break;
                            case a6.D /*9*/:
                                i = str;
                                o = new SimpleDateFormat(z[14], Locale.US);
                            default:
                                w = str;
                                str = "y\u001e\n`";
                                obj = null;
                                break;
                        }
                    }
                default:
                    strArr2[i] = str;
                    str = "\n\u0012\u00174+E\u000fDueN\u0012\u0016";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File a(byte r6, int r7, boolean r8) {
        /*
        r5 = 1;
        r1 = com.whatsapp.App.az;
        r0 = q;
        if (r0 != 0) goto L_0x000a;
    L_0x0007:
        e();
    L_0x000a:
        r0 = 2;
        if (r6 != r0) goto L_0x0029;
    L_0x000d:
        if (r7 != r5) goto L_0x0023;
    L_0x000f:
        r0 = new java.io.File;
        r2 = e;
        r3 = o;
        r4 = new java.util.Date;
        r4.<init>();
        r3 = r3.format(r4);
        r0.<init>(r2, r3);
        if (r1 == 0) goto L_0x0043;
    L_0x0023:
        if (r8 == 0) goto L_0x0048;
    L_0x0025:
        r0 = j;
    L_0x0027:
        if (r1 == 0) goto L_0x0043;
    L_0x0029:
        if (r6 != r5) goto L_0x0031;
    L_0x002b:
        if (r8 == 0) goto L_0x004b;
    L_0x002d:
        r0 = t;
    L_0x002f:
        if (r1 == 0) goto L_0x0043;
    L_0x0031:
        r0 = 3;
        if (r6 != r0) goto L_0x003a;
    L_0x0034:
        if (r8 == 0) goto L_0x004e;
    L_0x0036:
        r0 = h;
    L_0x0038:
        if (r1 == 0) goto L_0x0043;
    L_0x003a:
        r0 = new java.io.File;
        r1 = com.whatsapp.App.ao;
        r2 = w;
        r0.<init>(r1, r2);
    L_0x0043:
        r0 = a(r0, r8);
        return r0;
    L_0x0048:
        r0 = a;
        goto L_0x0027;
    L_0x004b:
        r0 = s;
        goto L_0x002f;
    L_0x004e:
        r0 = d;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.yf.a(byte, int, boolean):java.io.File");
    }

    public static File f() {
        return new File(App.ao, k);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.io.File r17, long r18, long r20) {
        /*
        r5 = com.whatsapp.App.az;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 8;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r17;
        r2 = r2.append(r0);
        r3 = z;
        r4 = 10;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r18 / r6;
        r2 = r2.append(r6);
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r20;
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        if (r17 == 0) goto L_0x0048;
    L_0x0042:
        r2 = r17.exists();
        if (r2 != 0) goto L_0x006f;
    L_0x0048:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 11;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r17;
        r2 = r2.append(r0);
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        r2 = 0;
    L_0x006e:
        return r2;
    L_0x006f:
        r2 = r17.isDirectory();
        if (r2 != 0) goto L_0x009c;
    L_0x0075:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 13;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r17;
        r2 = r2.append(r0);
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        r2 = 0;
        goto L_0x006e;
    L_0x009c:
        r6 = r17.listFiles();
        if (r6 != 0) goto L_0x00c9;
    L_0x00a2:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 12;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r17;
        r2 = r2.append(r0);
        r3 = z;
        r4 = 5;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        r2 = 0;
        goto L_0x006e;
    L_0x00c9:
        r2 = new com.whatsapp.t5;
        r2.<init>();
        java.util.Arrays.sort(r6, r2);
        r2 = java.lang.System.currentTimeMillis();
        r8 = r2 - r18;
        r7 = r6.length;
        r2 = 0;
        r4 = r2;
        r2 = r20;
    L_0x00dc:
        if (r4 >= r7) goto L_0x015d;
    L_0x00de:
        r10 = r6[r4];
        r12 = r10.length();
        r11 = r10.getName();
        r14 = i;
        r11 = r11.equals(r14);
        if (r11 == 0) goto L_0x00f2;
    L_0x00f0:
        if (r5 == 0) goto L_0x0159;
    L_0x00f2:
        r14 = r10.lastModified();
        r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1));
        if (r11 < 0) goto L_0x0101;
    L_0x00fa:
        r11 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r11 > 0) goto L_0x0101;
    L_0x00fe:
        r2 = r2 - r12;
        if (r5 == 0) goto L_0x0159;
    L_0x0101:
        r11 = r10.delete();
        if (r11 == 0) goto L_0x0131;
    L_0x0107:
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r12 = z;
        r13 = 4;
        r12 = r12[r13];
        r11 = r11.append(r12);
        r0 = r17;
        r11 = r11.append(r0);
        r12 = z;
        r13 = 2;
        r12 = r12[r13];
        r11 = r11.append(r12);
        r11 = r11.append(r10);
        r11 = r11.toString();
        com.whatsapp.util.Log.i(r11);
        if (r5 == 0) goto L_0x0159;
    L_0x0131:
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r12 = z;
        r13 = 7;
        r12 = r12[r13];
        r11 = r11.append(r12);
        r0 = r17;
        r11 = r11.append(r0);
        r12 = z;
        r13 = 6;
        r12 = r12[r13];
        r11 = r11.append(r12);
        r10 = r11.append(r10);
        r10 = r10.toString();
        com.whatsapp.util.Log.e(r10);
    L_0x0159:
        r4 = r4 + 1;
        if (r5 == 0) goto L_0x00dc;
    L_0x015d:
        r2 = 1;
        goto L_0x006e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.yf.a(java.io.File, long, long):boolean");
    }

    public static File d() {
        if (!q) {
            e();
        }
        return b(n);
    }

    public static File b() {
        if (!q) {
            e();
        }
        return u;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File a(java.io.File r4, boolean r5) {
        /*
        r1 = 0;
        r0 = r4.exists();	 Catch:{ IOException -> 0x0033 }
        if (r0 == 0) goto L_0x0063;
    L_0x0007:
        r0 = r4.isFile();	 Catch:{ IOException -> 0x0033 }
        if (r0 == 0) goto L_0x0014;
    L_0x000d:
        r4.delete();	 Catch:{ IOException -> 0x0035 }
        r0 = com.whatsapp.App.az;	 Catch:{ IOException -> 0x0035 }
        if (r0 == 0) goto L_0x0063;
    L_0x0014:
        r0 = r4.isDirectory();	 Catch:{ IOException -> 0x0037 }
        if (r0 == 0) goto L_0x0063;
    L_0x001a:
        r0 = 1;
    L_0x001b:
        if (r0 != 0) goto L_0x0020;
    L_0x001d:
        r4.mkdirs();	 Catch:{ IOException -> 0x0039 }
    L_0x0020:
        if (r5 == 0) goto L_0x0032;
    L_0x0022:
        r0 = new java.io.File;
        r2 = i;
        r0.<init>(r4, r2);
        r2 = r0.exists();
        if (r2 != 0) goto L_0x0032;
    L_0x002f:
        r0.createNewFile();	 Catch:{ IOException -> 0x003b }
    L_0x0032:
        return r4;
    L_0x0033:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0035 }
    L_0x0035:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0037 }
    L_0x0037:
        r0 = move-exception;
        throw r0;
    L_0x0039:
        r0 = move-exception;
        throw r0;
    L_0x003b:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r1 = r3[r1];
        r1 = r2.append(r1);
        r1 = r1.append(r4);
        r2 = " ";
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0032;
    L_0x0063:
        r0 = r1;
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.yf.a(java.io.File, boolean):java.io.File");
    }

    public static File c() {
        if (!q) {
            e();
        }
        return b(p);
    }

    public static void e() {
        v = b(new File(App.ao, w));
        a = b(new File(v, f));
        e = a(new File(v, c), true);
        d = b(new File(v, b));
        s = b(new File(v, x));
        n = b(new File(v, l));
        p = b(new File(v, m));
        u = a(new File(v, g), true);
        j = a(new File(a, r), true);
        h = a(new File(d, r), true);
        t = a(new File(s, r), true);
        q = true;
    }

    public static File a() {
        if (!q) {
            e();
        }
        return e;
    }

    public static boolean a(boolean z) {
        if (z) {
            return a(b(), 0, 0);
        }
        return App.aa == 3 ? a(b(), 86400000, 524288000) : a(b(), 86400000, 52428800);
    }

    public static boolean a(File file) {
        if (!q) {
            e();
        }
        return file != null && file.getAbsolutePath().startsWith(v.getAbsolutePath());
    }
}
