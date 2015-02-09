package com.whatsapp.util;

import com.whatsapp.vk;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.HashSet;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class r {
    public static final HashSet b;
    public static final String[] c;
    private static final String[] z;
    private am[] a;

    public static Date a(long j) {
        return new Date((j - 2082844800) * 1000);
    }

    public static long a(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[4];
        randomAccessFile.read(bArr, 0, 4);
        return (long) ((bArr[3] & 255) | (((((bArr[0] << 24) & -16777216) | 0) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)));
    }

    public static int e(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[3];
        randomAccessFile.read(bArr, 0, 3);
        return (bArr[2] & 255) | ((((bArr[0] << 16) & 16711680) | 0) | ((bArr[1] << 8) & 65280));
    }

    private static af a(long j, String str, RandomAccessFile randomAccessFile) {
        if (z[2].equals(str)) {
            return new a_(j, str, randomAccessFile);
        }
        if (z[1].equals(str)) {
            return new a1(j, str, randomAccessFile);
        }
        return z[0].equals(str) ? new az(j, str, randomAccessFile) : new af(j, str, randomAccessFile);
    }

    public void a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.a = a(randomAccessFile, 0, randomAccessFile.length());
        randomAccessFile.close();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.whatsapp.util.b1 a(com.whatsapp.util.am[] r6) {
        /*
        r3 = com.whatsapp.util.am.b;
        r0 = 0;
        r2 = r0;
    L_0x0004:
        r0 = r6.length;
        if (r2 >= r0) goto L_0x0041;
    L_0x0007:
        r1 = r6[r2];
        r0 = r1 instanceof com.whatsapp.util.an;
        if (r0 == 0) goto L_0x001d;
    L_0x000d:
        r0 = r1;
        r0 = (com.whatsapp.util.an) r0;
        r0 = r0.a();
        r0 = a(r0);
        if (r0 == 0) goto L_0x001b;
    L_0x001a:
        return r0;
    L_0x001b:
        if (r3 == 0) goto L_0x003d;
    L_0x001d:
        r0 = r1 instanceof com.whatsapp.util.az;
        if (r0 == 0) goto L_0x003d;
    L_0x0021:
        r0 = com.whatsapp.util.a_.class;
        r0 = a(r6, r0);
        r0 = (com.whatsapp.util.a_) r0;
        if (r0 == 0) goto L_0x003d;
    L_0x002b:
        r4 = z;
        r5 = 3;
        r4 = r4[r5];
        r0 = r0.d;
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x003d;
    L_0x0038:
        r1 = (com.whatsapp.util.az) r1;
        r0 = r1.i;
        goto L_0x001a;
    L_0x003d:
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x0043;
    L_0x0041:
        r0 = 0;
        goto L_0x001a;
    L_0x0043:
        r2 = r0;
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.r.a(com.whatsapp.util.am[]):com.whatsapp.util.b1");
    }

    public static int b(RandomAccessFile randomAccessFile) {
        return randomAccessFile.readByte();
    }

    public static String a(RandomAccessFile randomAccessFile, int i) {
        byte[] bArr = new byte[i];
        randomAccessFile.read(bArr, 0, i);
        return new String(bArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static com.whatsapp.util.am[] a(java.io.RandomAccessFile r13, long r14, long r16) {
        /*
        r6 = com.whatsapp.util.am.b;
        r7 = new java.util.ArrayList;
        r7.<init>();
        r2 = r14;
    L_0x0008:
        r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1));
        if (r0 >= 0) goto L_0x0099;
    L_0x000c:
        r13.seek(r2);
        r0 = a(r13);
        r4 = r13.getFilePointer();
        r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1));
        if (r4 != 0) goto L_0x001d;
    L_0x001b:
        if (r6 == 0) goto L_0x0099;
    L_0x001d:
        r4 = 4;
        r4 = new byte[r4];
        r5 = 0;
        r8 = r4.length;
        r5 = r13.read(r4, r5, r8);
        r8 = r4.length;
        if (r5 == r8) goto L_0x0034;
    L_0x0029:
        r0 = new java.io.IOException;
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0034:
        r8 = new java.lang.String;
        r8.<init>(r4);
        r4 = 1;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 != 0) goto L_0x00ad;
    L_0x003f:
        r0 = c(r13);
        r4 = r0;
    L_0x0044:
        r0 = 0;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x0054;
    L_0x004a:
        r0 = r2 + r4;
        r10 = r13.length();
        r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r0 <= 0) goto L_0x0070;
    L_0x0054:
        r0 = new java.io.IOException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r4);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0070:
        r0 = b;
        r0 = r0.contains(r8);
        if (r0 == 0) goto L_0x00a3;
    L_0x0078:
        r0 = r13.getFilePointer();
        r10 = r2 + r4;
        r1 = a(r13, r0, r10);
        r0 = new com.whatsapp.util.an;
        r0.<init>(r4, r8, r1);
    L_0x0087:
        r7.add(r0);
        r0 = 0;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x00ab;
    L_0x0090:
        r0 = r13.length();
        if (r6 == 0) goto L_0x0097;
    L_0x0096:
        r0 = r0 + r4;
    L_0x0097:
        if (r6 == 0) goto L_0x00a8;
    L_0x0099:
        r0 = r7.size();
        r0 = new com.whatsapp.util.am[r0];
        r7.toArray(r0);
        return r0;
    L_0x00a3:
        r0 = a(r4, r8, r13);
        goto L_0x0087;
    L_0x00a8:
        r2 = r0;
        goto L_0x0008;
    L_0x00ab:
        r0 = r2;
        goto L_0x0096;
    L_0x00ad:
        r4 = r0;
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.r.a(java.io.RandomAccessFile, long, long):com.whatsapp.util.am[]");
    }

    public static long c(RandomAccessFile randomAccessFile) {
        return (0 + (a(randomAccessFile) << 32)) + a(randomAccessFile);
    }

    public static int d(RandomAccessFile randomAccessFile) {
        return (randomAccessFile.readByte() << 8) | randomAccessFile.readByte();
    }

    public b1 a() {
        return a(this.a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.whatsapp.util.am a(com.whatsapp.util.am[] r4, java.lang.Class r5) {
        /*
        r3 = com.whatsapp.util.am.b;
        r0 = 0;
        r2 = r0;
    L_0x0004:
        r0 = r4.length;
        if (r2 >= r0) goto L_0x0028;
    L_0x0007:
        r1 = r4[r2];
        r0 = r1 instanceof com.whatsapp.util.an;
        if (r0 == 0) goto L_0x001e;
    L_0x000d:
        r0 = r1;
        r0 = (com.whatsapp.util.an) r0;
        r0 = r0.a();
        r0 = a(r0, r5);
        if (r0 == 0) goto L_0x001c;
    L_0x001a:
        r1 = r0;
    L_0x001b:
        return r1;
    L_0x001c:
        if (r3 == 0) goto L_0x0024;
    L_0x001e:
        r0 = r1.getClass();
        if (r0 == r5) goto L_0x001b;
    L_0x0024:
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x002a;
    L_0x0028:
        r1 = 0;
        goto L_0x001b;
    L_0x002a:
        r2 = r0;
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.r.a(com.whatsapp.util.am[], java.lang.Class):com.whatsapp.util.am");
    }

    static {
        int i = 0;
        String[] strArr = new String[6];
        String str = "~\u000f9I";
        int i2 = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i3 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i4 = 0; length > i4; i4++) {
                int i5;
                char c = cArr[i4];
                switch (i4 % 5) {
                    case PBE.MD5 /*0*/:
                        i5 = 10;
                        break;
                    case ay.f /*1*/:
                        i5 = 100;
                        break;
                    case ay.n /*2*/:
                        i5 = 81;
                        break;
                    case ay.p /*3*/:
                        i5 = 45;
                        break;
                    default:
                        i5 = 111;
                        break;
                }
                cArr[i4] = (char) (i5 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case PBE.MD5 /*0*/:
                    strArr2[i3] = str;
                    str = "b\u0000=_";
                    i3 = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i3] = str;
                    str = "|\r5H";
                    i3 = 3;
                    strArr2 = strArr3;
                    i2 = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i3] = str;
                    str = "I\u000b$A\u000bdC%\r\u001do\u00055\r\u000e~\u000b<\r\u001bs\u00144";
                    i3 = 4;
                    strArr2 = strArr3;
                    i2 = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i3] = str;
                    i3 = 5;
                    strArr2 = strArr3;
                    str = "k\u0010>@Ob\u0005\"\r\u0006d\u00120A\u0006nD\"D\u0015o^q";
                    i2 = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i3] = str;
                    z = strArr3;
                    strArr = new String[14];
                    str = "g\u000b>[";
                    i2 = 5;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i3 = 0;
                    break;
                case aV.r /*5*/:
                    strArr2[i3] = str;
                    str = "~\u00160F";
                    i2 = 6;
                    i3 = 1;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i3] = str;
                    str = "\u007f\u0000%L";
                    i2 = 7;
                    i3 = 2;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i3] = str;
                    str = "~\u00164K";
                    i2 = 8;
                    i3 = 3;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i3] = str;
                    str = "c\t0]";
                    i2 = 9;
                    i3 = 4;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i3] = str;
                    i3 = 5;
                    str = "g\u00008L";
                    i2 = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i3] = str;
                    i3 = 6;
                    str = "g\r?K";
                    i2 = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i3] = str;
                    i3 = 7;
                    str = "y\u00103A";
                    i2 = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i3] = str;
                    i3 = 8;
                    str = "o\u0000%^";
                    i2 = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i3] = str;
                    i3 = 9;
                    str = "g\u0000#L";
                    i2 = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i3] = str;
                    i3 = 10;
                    str = "x\t#L";
                    i2 = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i3] = str;
                    i3 = 11;
                    str = "c\t0J";
                    i2 = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i3] = str;
                    i3 = 12;
                    str = "|\n#]";
                    i2 = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i3] = str;
                    i3 = 13;
                    str = "n\r?K";
                    i2 = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i3] = str;
                    c = strArr3;
                    b = new HashSet();
                    while (i < c.length) {
                        b.add(c[i]);
                        i++;
                    }
                default:
                    strArr2[i3] = str;
                    str = "g\u00129I";
                    i3 = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    public static double f(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[4];
        randomAccessFile.read(bArr, 0, 4);
        return ((double) ((bArr[3] & 255) | (((((bArr[0] << 24) & -16777216) | 0) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)))) / 65536.0d;
    }

    public static double g(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[4];
        randomAccessFile.read(bArr, 0, 4);
        return ((double) ((bArr[3] & 255) | (((((bArr[0] << 24) & -16777216) | 0) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)))) / 1.073741824E9d;
    }
}
