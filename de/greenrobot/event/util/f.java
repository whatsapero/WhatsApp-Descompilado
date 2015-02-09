package de.greenrobot.event.util;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.whatsapp.vk;
import de.greenrobot.event.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class f {
    public static h a;
    public static final String b;
    protected static final String c;
    protected static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    private static final String[] z;

    static {
        String[] strArr = new String[11];
        String str = "\u0004\u0013%8\r\u0005\u0013e-\u0010\u0002\u0019\u007fq\u001a\u0016\u0013e+\u001d\u0015\u0005%:\r\u0012\u0019y;\u0016\u0001\u001ad8Q\u0014\u001f\u007f3\u001a";
        int i = 10;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 96;
                        break;
                    case ay.f /*1*/:
                        i4 = 118;
                        break;
                    case ay.n /*2*/:
                        i4 = 11;
                        break;
                    case ay.p /*3*/:
                        i4 = 95;
                        break;
                    default:
                        i4 = 127;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "N%c:\r\f\u0019h4>\u0003\u0002b)\u0016\u0014\u000f";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "N%c:\r\f\u0019h4/\u0012\u0013m:\r\u0005\u0018h:>\u0003\u0002b)\u0016\u0014\u000f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "\u0003\u0019fq\u001e\u0003\u0002b0\u0011\u0002\u0017y,\u0017\u0005\u0004g0\u001c\u000bXj/\u000f";
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = ")\u001ag:\u0018\u0001\u001a+>\u001c\u0014\u001f}6\u000b\u0019V\u007f&\u000f\u0005L+";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0001\u0018o-\u0010\t\u0012%,\n\u0010\u0006d-\u000bN\u0000?q\u001e\u0010\u0006%\u0019\r\u0001\u0011f:\u0011\u00147h+\u0016\u0016\u001f\u007f&";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = ")\u001ag:\u0018\u0001\u001a+>\u001c\u0014\u001f}6\u000b\u0019V|6\u000b\b\u0019~+_\u0006\u0004j8\u0012\u0005\u0018\u007f\u007f\f\u0015\u0006{0\r\u0014X+\u001a\u0016\u0014\u001en-_\u0015\u0005n\u007f>\u000e\u0012y0\u0016\u0004V8qOKVd-_\u0001\u0018o-\u0010\t\u0012%,\n\u0010\u0006d-\u000bN\u0000?q\u001e\u0010\u0006%\u0019\r\u0001\u0011f:\u0011\u00147h+\u0016\u0016\u001f\u007f&Q";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u0001\u0018o-\u0010\t\u0012%>\u000f\u0010XJ<\u000b\t\u0000b+\u0006";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "%\u0004y0\r@\u0012b>\u0013\u000f\u0011+2\u001e\u000e\u0017l:\r@\u0004n<\u001a\t\u0000n;_\u0005\u000eh:\u000f\u0014\u001fd1";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "9\u0019~\u007f\u0012\u0015\u0005\u007f\u007f\f\u0005\u0002++\u0017\u0005Vx+\u001e\u0014\u001fh\u007f\u0019\u0001\u0015\u007f0\r\u0019Vm6\u001a\f\u0012++\u0010@\u0015d1\u0019\t\u0011~-\u001a@\u0013y-\u0010\u0012Vo6\u001e\f\u0019l,_\u0006\u0019y\u007f\u0006\u000f\u0003y\u007f\u001e\u0010\u0006%";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    z = strArr3;
                case a6.h /*10*/:
                    f = str;
                    str = "\u0004\u0013%8\r\u0005\u0013e-\u0010\u0002\u0019\u007fq\u001a\u0016\u0013e+\u001d\u0015\u0005%:\r\u0012\u0019y;\u0016\u0001\u001ad8Q\t\u0015d1 \t\u0012";
                    i = 11;
                    break;
                case a6.e /*11*/:
                    e = str;
                    str = "\u0004\u0013%8\r\u0005\u0013e-\u0010\u0002\u0019\u007fq\u001a\u0016\u0013e+\u001d\u0015\u0005%:\r\u0012\u0019y\u0000\u001b\t\u0017g0\u0018";
                    i = 12;
                    break;
                case a6.s /*12*/:
                    d = str;
                    str = "\u0004\u0013%8\r\u0005\u0013e-\u0010\u0002\u0019\u007fq\u001a\u0016\u0013e+\u001d\u0015\u0005%:\r\u0012\u0019y\u0000\u001b\t\u0017g0\u0018?\u001bj1\u001e\u0007\u0013y";
                    i = 13;
                    break;
                case a6.z /*13*/:
                    c = str;
                    str = "\u0004\u0013%8\r\u0005\u0013e-\u0010\u0002\u0019\u007fq\u001a\u0016\u0013e+\u001d\u0015\u0005%:\r\u0012\u0019y;\u0016\u0001\u001ad8Q\u0006\u001fe6\f\b)j9\u000b\u0005\u0004T;\u0016\u0001\u001ad8";
                    i = 14;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    g = str;
                    str = "\u0004\u0013%8\r\u0005\u0013e-\u0010\u0002\u0019\u007fq\u001a\u0016\u0013e+\u001d\u0015\u0005%:\r\u0012\u0019y;\u0016\u0001\u001ad8Q\u0005\u0000n1\u000b?\u0002r/\u001a?\u0019e\u0000\u001c\f\u0019x:";
                    i = 15;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    h = str;
                    str = "\u0004\u0013%8\r\u0005\u0013e-\u0010\u0002\u0019\u007fq\u001a\u0016\u0013e+\u001d\u0015\u0005%:\r\u0012\u0019y;\u0016\u0001\u001ad8Q\r\u0013x,\u001e\u0007\u0013";
                    i = 16;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    b = str;
                    str = "0\u001an>\f\u0005V~,\u001a@%c:\r\f\u0019h49\u0012\u0017l2\u001a\u000e\u0002J<\u000b\t\u0000b+\u0006NVB3\u0013\u0005\u0011j3_\u0001\u0015\u007f6\t\t\u0002re_";
                    i = -1;
                    break;
                default:
                    strArr2[i2] = str;
                    str = "N%c:\r\f\u0019h43\t\u0005\u007f\u001e\u001c\u0014\u001f}6\u000b\u0019";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static void a(Activity activity, boolean z, Bundle bundle) {
        a(activity, activity.getClass(), z, bundle);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.app.Activity r8) {
        /*
        r0 = 1;
        r2 = 0;
        r3 = de.greenrobot.event.util.h.a;
        r1 = r8.getClass();
        r1 = r1.getSuperclass();
        r7 = r1;
        r1 = r2;
        r2 = r7;
    L_0x000f:
        if (r2 != 0) goto L_0x0031;
    L_0x0011:
        r0 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r8.getClass();
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0031:
        r4 = r2.getName();
        r5 = z;
        r6 = 6;
        r5 = r5[r6];
        r5 = r4.equals(r5);
        if (r5 == 0) goto L_0x0043;
    L_0x0040:
        if (r3 == 0) goto L_0x00bb;
    L_0x0042:
        r1 = r0;
    L_0x0043:
        r5 = z;	 Catch:{ RuntimeException -> 0x008d }
        r6 = 4;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x008d }
        r5 = r4.startsWith(r5);	 Catch:{ RuntimeException -> 0x008d }
        if (r5 == 0) goto L_0x0093;
    L_0x004e:
        r5 = z;	 Catch:{ RuntimeException -> 0x008f }
        r6 = 2;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x008f }
        r5 = r4.endsWith(r5);	 Catch:{ RuntimeException -> 0x008f }
        if (r5 != 0) goto L_0x006f;
    L_0x0059:
        r5 = z;	 Catch:{ RuntimeException -> 0x0091 }
        r6 = 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x0091 }
        r5 = r4.endsWith(r5);	 Catch:{ RuntimeException -> 0x0091 }
        if (r5 != 0) goto L_0x006f;
    L_0x0064:
        r5 = z;	 Catch:{ RuntimeException -> 0x008b }
        r6 = 3;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x008b }
        r5 = r4.endsWith(r5);	 Catch:{ RuntimeException -> 0x008b }
        if (r5 == 0) goto L_0x0093;
    L_0x006f:
        r0 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x008b }
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x008b }
        r1.<init>();	 Catch:{ RuntimeException -> 0x008b }
        r2 = z;	 Catch:{ RuntimeException -> 0x008b }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x008b }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x008b }
        r1 = r1.append(r4);	 Catch:{ RuntimeException -> 0x008b }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x008b }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x008b }
        throw r0;	 Catch:{ RuntimeException -> 0x008b }
    L_0x008b:
        r0 = move-exception;
        throw r0;
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x008b }
    L_0x0093:
        r5 = z;	 Catch:{ RuntimeException -> 0x00b2 }
        r6 = 8;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x00b2 }
        r4 = r4.equals(r5);	 Catch:{ RuntimeException -> 0x00b2 }
        if (r4 == 0) goto L_0x00b4;
    L_0x009f:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x00b0 }
        r2 = 11;
        if (r0 >= r2) goto L_0x00ba;
    L_0x00a5:
        r0 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x00b0 }
        r1 = z;	 Catch:{ RuntimeException -> 0x00b0 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x00b0 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x00b0 }
        throw r0;	 Catch:{ RuntimeException -> 0x00b0 }
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00b0 }
    L_0x00b4:
        r2 = r2.getSuperclass();
        if (r3 == 0) goto L_0x000f;
    L_0x00ba:
        r0 = r1;
    L_0x00bb:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.event.util.f.a(android.app.Activity):boolean");
    }

    public static void a(Activity activity, boolean z) {
        a(activity, z, null);
    }

    protected static void a(b bVar) {
        if (a.b.d) {
            String str = a.b.c;
            if (str == null) {
                str = g.k;
            }
            Log.i(str, z[9], bVar.a);
        }
    }

    public static void b(Activity activity) {
        a(activity, false, null);
    }

    private static boolean b(Object obj, b bVar) {
        if (bVar != null) {
            Object a = bVar.a();
            if (a != null) {
                try {
                    if (!a.equals(obj)) {
                        return false;
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            }
        }
        return true;
    }

    static boolean a(Object obj, b bVar) {
        return b(obj, bVar);
    }

    public static void a(Activity activity, Object obj, boolean z, Bundle bundle) {
        try {
            if (a == null) {
                throw new RuntimeException(z[10]);
            }
            try {
                if (a(activity)) {
                    ErrorDialogManager$SupportManagerFragment.a(activity, obj, z, bundle);
                    try {
                        if (!h.a) {
                            return;
                        }
                    }
                }
                ErrorDialogManager$HoneycombManagerFragment.a(activity, obj, z, bundle);
            } catch (RuntimeException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }
}
