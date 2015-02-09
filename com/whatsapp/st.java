package com.whatsapp;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.util.Log;
import com.whatsapp.util.br;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class st {
    private static String a;
    private static String b;
    private static volatile boolean c;
    private static String d;
    private static String e;
    private static final String[] z;

    public static boolean a() {
        int aY = App.aY();
        if (aY == 1) {
            return true;
        }
        try {
            return (App.c(aY) & 4) != 0;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static void g() {
        File file = App.ao;
        File file2 = new File(file, z[27]);
        File file3 = new File(file, z[21]);
        File file4 = new File(file, z[24]);
        long f = f();
        if (file3.exists()) {
            if (f == a(file3)) {
                try {
                    if (file2.exists()) {
                        if (!file2.delete()) {
                            Log.w(z[20]);
                        }
                    }
                    d();
                    return;
                } catch (NumberFormatException e) {
                    throw e;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
            try {
                if (!file3.delete()) {
                    Log.w(z[22]);
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        }
        if (file2.exists()) {
            if (f == a(file2)) {
                try {
                    if (!file2.renameTo(file3)) {
                        Log.w(z[23]);
                    }
                    d();
                    return;
                } catch (NumberFormatException e222) {
                    throw e222;
                }
            }
            try {
                if (!file2.delete()) {
                    Log.w(z[26]);
                }
            } catch (NumberFormatException e2222) {
                throw e2222;
            }
        }
        try {
            if (a()) {
                a(a, file2);
                if (!file2.exists()) {
                    return;
                }
                if (f == a(file2)) {
                    try {
                        if (!file2.renameTo(file3)) {
                            Log.w(z[19]);
                        }
                        d();
                        return;
                    } catch (NumberFormatException e22222) {
                        throw e22222;
                    }
                }
                try {
                    if (!file2.delete()) {
                        Log.w(z[25]);
                    }
                } catch (NumberFormatException e222222) {
                    throw e222222;
                }
            }
        } catch (NumberFormatException e2222222) {
            throw e2222222;
        }
    }

    public static Uri e() {
        File file = App.ao;
        File file2 = new File(file, z[4]);
        try {
            if (new File(file, z[3]).delete()) {
                if (file2.exists()) {
                    return Uri.fromFile(file2);
                }
            }
            try {
                return null;
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static {
        String[] strArr = new String[28];
        String str = "\u0003LG\t\u001aQ\u0017\u001c\u000e\u001e\u001c\u0016D\u0011\b\u001fKR\t\u0019E[\\\u0014F\nVW\u000b\u0006\u0002\\\u001c\u001a\u001c\u0019JV\u0017\u001dDo[\u0018\u001d\u0018yC\tG\nHX";
        boolean z = true;
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
                        i3 = 107;
                        break;
                    case ay.f /*1*/:
                        i3 = 56;
                        break;
                    case ay.n /*2*/:
                        i3 = 51;
                        break;
                    case ay.p /*3*/:
                        i3 = 121;
                        break;
                    default:
                        i3 = 105;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0006YA\u0012\f\u001f\u0002\u001cV\r\u000eLR\u0010\u0005\u0018\u0007Z\u001dT\bW^W\u001e\u0003YG\n\b\u001bH";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "<PR\r\u001a*HCW\u001c\u001b_A\u0018\r\u000e";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "<PR\r\u001a*HCW\b\u001bS";
                    i = 4;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001eHT\u000b\b\u000f]\u001c\u001d\u0006\u001cV_\u0016\b\u000f\u0015U\u0010\u0005\u000e\u0018";
                    z = true;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "<PR\r\u001a*HCW\u001c\u001b_A\u0018\r\u000e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "<PR\r\u001a*HCW\r\u0004O]\u0015\u0006\n\\";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "<PR\r\u001a*HCW\b\u001bS";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "<PR\r\u001a*HCW\b\u001bS";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "<PR\r\u001a*HCW\u001f\u000eJ@\u0010\u0006\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "<PR\r\u001a*HCW\n\u0000KF\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "<PR\r\u001a*HCW\u0001\u001fU_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001eHT\u000b\b\u000f]\u001c\n\u0006\u001eJP\u001cI";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0003LG\t\u001aQ\u0017\u001c\u000e\u001e\u001c\u0016D\u0011\b\u001fKR\t\u0019E[\\\u0014F\nVW\u000b\u0006\u0002\\\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0007Y@\r6\u001eHT\u000b\b\u000f]l\u001a\u0001\u000e[X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\bW^W\u001e\u0003YG\n\b\u001bHl\t\u001b\u000e^V\u000b\f\u0005[V\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u001eHT\u000b\b\u000f]\u001c\n\f\u0005LZ\u0017\f\u0007\u0017U\u0018\u0000\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "<PR\r\u001a*HCW\u001c\u001b_A\u0018\r\u000e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "A\u0012\u0019\f\u0019\fJR\u001d\fD\\\\\u000e\u0007\u0007WR\u001dF\u000fWD\u0017\u0005\u0004YWY\n\u0004M_\u001d\u0007LL\u0013\u000b\f\u0005Y^\u001cI\u000fWD\u0017\u0005\u0004YWX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "A\u0012\u0019\f\u0019\fJR\u001d\fDQ]\n\u001d\nT_Y\n\u0004M_\u001d\u0007LL\u0013\u001d\f\u0007]G\u001cI\u000fWD\u0017\u0005\u0004YWX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "<PR\r\u001a*HCW\b\u001bS";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "A\u0012\u0019\f\u0019\fJR\u001d\fDQ]\n\u001d\nT_Y\n\u0004M_\u001d\u0007LL\u0013\u001d\f\u0007]G\u001cI\u0002V@\r\b\u0007T\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "A\u0012\u0019\f\u0019\fJR\u001d\fD\\\\\u000e\u0007\u0007WR\u001dI\bWF\u0015\r\u0005\u001fGY\u001b\u000eVR\u0014\fK\\\\\u000e\u0007\u0007WR\u001dH";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "<PR\r\u001a*HCW\u001c\u001b_A\u0018\r\u000e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "A\u0012\u0019\f\u0019\fJR\u001d\fD\\\\\u000e\u0007\u0007WR\u001dF\u000fWD\u0017\u0005\u0004YWY\n\u0004M_\u001d\u0007LL\u0013\u001d\f\u0007]G\u001cI\u000fWD\u0017\u0005\u0004YWX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "A\u0012\u0019\f\u0019\fJR\u001d\fD\\\\\u000e\u0007\u0007WR\u001dI\bWF\u0015\r\u0005\u001fGY\r\u000eTV\r\fK\\\\\u000e\u0007\u0007WR\u001dH";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "<PR\r\u001a*HCW\r\u0004O]\u0015\u0006\n\\";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = false;
                default:
                    strArr2[i] = str;
                    str = "\nUI\u0017SD\u0017R\t\u0019\u0018\u0017R\u0017\r\u0019WZ\u001dV\u001b\u0005P\u0016\u0004EO[\u0018\u001d\u0018YC\t";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    public static Uri h() {
        try {
            try {
                if (App.G == 1) {
                    return a != null ? Uri.parse(a) : Uri.parse(z[0]);
                } else {
                    try {
                        return App.ag() ? Uri.parse(z[1]) : Uri.parse(z[2]);
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static void d() {
        try {
            new File(App.ao, z[18]).createNewFile();
        } catch (IOException e) {
            Log.e(z[17]);
        }
    }

    private static String b(String str) {
        InputStream content;
        String toString;
        Throwable th;
        int i = App.az;
        try {
            HttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
            HttpProtocolParams.setUserAgent(basicHttpParams, ak9.a());
            content = new DefaultHttpClient(basicHttpParams).execute(new HttpGet(str)).getEntity().getContent();
            try {
                StringBuilder stringBuilder = new StringBuilder();
                do {
                    int read = content.read();
                    if (read < 0) {
                        break;
                    }
                    stringBuilder.append((char) read);
                } while (i == 0);
                content.close();
                toString = stringBuilder.toString();
                if (content != null) {
                    try {
                        content.close();
                    } catch (NumberFormatException e) {
                        throw e;
                    } catch (IOException e2) {
                    }
                }
            } catch (IOException e3) {
                try {
                    toString = "";
                    if (content != null) {
                        try {
                            content.close();
                        } catch (NumberFormatException e4) {
                            throw e4;
                        } catch (IOException e5) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (content != null) {
                        try {
                            content.close();
                        } catch (NumberFormatException e42) {
                            throw e42;
                        } catch (IOException e6) {
                        }
                    }
                    throw th;
                }
                return toString;
            }
        } catch (IOException e7) {
            content = null;
            toString = "";
            if (content != null) {
                content.close();
            }
            return toString;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            content = null;
            th = th4;
            if (content != null) {
                content.close();
            }
            throw th;
        }
        return toString;
    }

    public static void a(Context context, String str) {
        try {
            if (c) {
                try {
                    if (a()) {
                        try {
                            if (context.getSharedPreferences(z[16], 0).getLong(z[15], 0) + 21600000 <= System.currentTimeMillis()) {
                                br.a(new m4(str, context));
                            }
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    private static long a(File file) {
        Throwable e;
        long value;
        int i = App.az;
        FileInputStream fileInputStream;
        try {
            byte[] bArr = new byte[4096];
            CRC32 crc32 = new CRC32();
            fileInputStream = new FileInputStream(file);
            do {
                try {
                    int read = fileInputStream.read(bArr, 0, bArr.length);
                    if (read < 0) {
                        break;
                    }
                    crc32.update(bArr, 0, read);
                } catch (IOException e2) {
                    e = e2;
                }
            } while (i == 0);
            value = crc32.getValue();
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (NumberFormatException e3) {
                    throw e3;
                } catch (IOException e4) {
                }
            }
        } catch (IOException e5) {
            e = e5;
            fileInputStream = null;
            try {
                Log.c(e);
                value = 0;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (NumberFormatException e32) {
                        throw e32;
                    } catch (IOException e6) {
                    }
                }
            } catch (Throwable th) {
                e = th;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (NumberFormatException e7) {
                        throw e7;
                    } catch (IOException e8) {
                    }
                }
                throw e;
            }
            return value;
        } catch (Throwable th2) {
            e = th2;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw e;
        }
        return value;
    }

    private static void a(String str, File file) {
        Object e;
        Throwable th;
        OutputStream outputStream = null;
        int i = App.az;
        InputStream content;
        try {
            byte[] bArr = new byte[4096];
            HttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
            HttpProtocolParams.setUserAgent(basicHttpParams, ak9.a());
            content = new DefaultHttpClient(basicHttpParams).execute(new HttpGet(str)).getEntity().getContent();
            try {
                OutputStream fileOutputStream = new FileOutputStream(file);
                do {
                    try {
                        int read = content.read(bArr, 0, bArr.length);
                        if (read < 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException e2) {
                        e = e2;
                        outputStream = fileOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = fileOutputStream;
                    }
                } while (i == 0);
                fileOutputStream.flush();
                OutputStream outputStream2 = null;
                if (null != null) {
                    try {
                        outputStream2.close();
                    } catch (NumberFormatException e3) {
                        throw e3;
                    } catch (IOException e4) {
                    }
                }
                if (content != null) {
                    try {
                        content.close();
                    } catch (NumberFormatException e32) {
                        throw e32;
                    } catch (IOException e5) {
                    }
                }
            } catch (IOException e6) {
                e = e6;
                try {
                    Log.e(z[5] + e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e7) {
                        }
                    }
                    if (content != null) {
                        try {
                            content.close();
                        } catch (NumberFormatException e322) {
                            throw e322;
                        } catch (IOException e8) {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (NumberFormatException e9) {
                            throw e9;
                        } catch (IOException e10) {
                        }
                    }
                    if (content != null) {
                        try {
                            content.close();
                        } catch (NumberFormatException e11) {
                            throw e11;
                        } catch (IOException e12) {
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException e13) {
            e = e13;
            content = null;
            Log.e(z[5] + e);
            if (outputStream != null) {
                outputStream.close();
            }
            if (content != null) {
                content.close();
            }
        } catch (Throwable th4) {
            th = th4;
            content = null;
            if (outputStream != null) {
                outputStream.close();
            }
            if (content != null) {
                content.close();
            }
            throw th;
        }
    }

    static void j() {
        g();
    }

    static String k() {
        return c();
    }

    public static Uri i() {
        try {
            return !c ? null : Uri.parse(e);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static String c() {
        return b(d).trim();
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            if (str.length() < 1) {
                return false;
            }
            try {
                if (c) {
                    return true;
                }
                String str2 = z[14] + str.substring(str.length() - 1) + "/";
                Log.i(z[13] + str2);
                a = str2 + z[9];
                b = str2 + z[11];
                d = str2 + z[10];
                e = str2 + z[12];
                c = true;
                return true;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void b() {
        boolean z = true;
        File file = App.ao;
        File file2 = new File(file, z[7]);
        try {
            if (file2.exists()) {
                boolean z2;
                if (file2.delete()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Log.b(z2);
            }
            try {
                if (!new File(file, z[6]).exists()) {
                    file2 = new File(file, z[8]);
                    try {
                        if (file2.exists()) {
                            if (!file2.delete()) {
                                z = false;
                            }
                            Log.b(z);
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } catch (NumberFormatException e222) {
            throw e222;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    private static long f() {
        String trim = b(b).trim();
        try {
            return Long.parseLong(trim);
        } catch (Throwable e) {
            Log.b(trim, e);
            return -1;
        }
    }
}
