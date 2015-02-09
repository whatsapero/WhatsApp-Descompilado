package com.whatsapp;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Application;
import android.backport.util.Base64;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Environment;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.util.b9;
import dalvik.system.DexFile;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class a54 {
    private static File a;
    private static boolean b;
    private static boolean c;
    private static final byte[] d;
    private static int e;
    private static File f;
    private static final String[] g;
    private static volatile boolean h;
    private static File i;
    private static final byte[] j;
    private static File k;
    private static File l;
    private static String m;
    private static final byte[] n;
    private static final byte[] o;
    private static String p;
    private static boolean q;
    private static final byte[] r;
    private static boolean s;
    private static boolean t;
    private static boolean u;
    private static final String[] z;

    public static byte[] a(byte[] bArr) {
        byte[] digest;
        int i = App.az;
        try {
            digest = MessageDigest.getInstance(z[140]).digest(f().getBytes(z[139]));
        } catch (NoSuchAlgorithmException e) {
            digest = null;
        } catch (UnsupportedEncodingException e2) {
            digest = null;
        }
        if (digest != null) {
            try {
                if (digest.length > 0) {
                    int i2 = 0;
                    while (i2 < bArr.length) {
                        bArr[i2] = (byte) (bArr[i2] ^ digest[i2 % digest.length]);
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                }
            } catch (NoSuchAlgorithmException e3) {
                throw e3;
            }
        }
        return bArr;
    }

    public static byte[] e() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance(z[5]);
            instance.init(160, SecureRandom.getInstance(z[4]));
            return instance.generateKey().getEncoded();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    static boolean w() {
        try {
            Class.forName(z[100]);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public static boolean c(byte[] bArr, String str) {
        File v = v();
        boolean a = a(v, bArr, ce.k + str + f(), o);
        File u = u();
        try {
            if (u.exists() || u.mkdirs()) {
                u = k();
                byte[] b = b(v);
                try {
                    a(b, u);
                    Log.i(z[134] + Arrays.equals(b, b(u)));
                } catch (Exception e) {
                    Log.e(z[133]);
                }
            }
            return a;
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r10, byte[] r11, byte[] r12, byte[] r13, byte[] r14, byte[] r15) {
        /*
        r7 = 1;
        r0 = 0;
        r3 = com.whatsapp.App.az;
        r4 = new java.io.File;
        r1 = com.whatsapp.App.p;
        r1 = r1.getFilesDir();
        r2 = z;
        r5 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r2 = r2[r5];
        r4.<init>(r1, r2);
        if (r15 != 0) goto L_0x001b;
    L_0x0017:
        r15 = F();	 Catch:{ Exception -> 0x006c }
    L_0x001b:
        r1 = new byte[r7];
        r2 = java.lang.Byte.parseByte(r10);
        r1[r0] = r2;
        r2 = r;
        r2 = r2.length;
        r5 = r1.length;
        r2 = r2 + r5;
        r5 = r11.length;
        r2 = r2 + r5;
        r5 = r14.length;
        r2 = r2 + r5;
        r5 = r13.length;
        r2 = r2 + r5;
        r5 = r15.length;
        r2 = r2 + r5;
        r5 = r12.length;
        r2 = r2 + r5;
        r5 = new byte[r2];
        r2 = 7;
        r6 = new byte[r2][];
        r2 = r;
        r6[r0] = r2;
        r6[r7] = r1;
        r1 = 2;
        r6[r1] = r11;
        r1 = 3;
        r6[r1] = r14;
        r1 = 4;
        r6[r1] = r13;
        r1 = 5;
        r6[r1] = r15;
        r1 = 6;
        r6[r1] = r12;
        r7 = r6.length;
        r1 = r0;
        r2 = r0;
    L_0x004f:
        if (r1 >= r7) goto L_0x005d;
    L_0x0051:
        r8 = r6[r1];
        r9 = r8.length;
        java.lang.System.arraycopy(r8, r0, r5, r2, r9);
        r8 = r8.length;
        r2 = r2 + r8;
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x004f;
    L_0x005d:
        a(r5, r4);	 Catch:{ Exception -> 0x006e }
        r1 = b(r4);	 Catch:{ Exception -> 0x006e }
        G();	 Catch:{ Exception -> 0x006e }
        r0 = java.util.Arrays.equals(r5, r1);	 Catch:{ Exception -> 0x006e }
    L_0x006b:
        return r0;
    L_0x006c:
        r0 = move-exception;
        throw r0;
    L_0x006e:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a54.a(java.lang.String, byte[], byte[], byte[], byte[], byte[]):boolean");
    }

    private static byte[] i() {
        return a(4);
    }

    private static File v() {
        try {
            return h ? i : new File(App.p.getFilesDir(), z[123]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private static File n() {
        try {
            return h ? l : new File(App.p.getFilesDir(), z[15]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static byte[] f(String str) {
        try {
            byte[] a = a(v(), ce.k + str + f(), o);
            if (a == null) {
                File k = k();
                a = a(k, ce.k + str + f(), o);
                if (a != null) {
                    File v = v();
                    try {
                        byte[] b = b(k);
                        a(b, v);
                        Arrays.equals(b, b(v));
                        Log.i(z[109]);
                    } catch (Exception e) {
                        Log.e(z[111]);
                    }
                }
                if (App.az == 0) {
                    return a;
                }
            }
            t();
            return a;
        } catch (Exception e2) {
            throw e2;
        } catch (Throwable e3) {
            Log.c(z[110], e3);
            return null;
        }
    }

    public static void m() {
        J().delete();
    }

    public static boolean a(byte[] bArr, String str) {
        try {
            if (!a(n(), bArr, ce.m + str, n)) {
                return false;
            }
            App.v = bArr;
            return true;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static byte[] a(byte[] bArr, byte[][] bArr2) {
        int i = App.az;
        try {
            Mac instance = Mac.getInstance(z[153]);
            instance.init(new SecretKeySpec(bArr, z[154]));
            int length = bArr2.length;
            int i2 = 0;
            while (i2 < length) {
                instance.update(bArr2[i2]);
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return instance.doFinal();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    static {
        String[] strArr = new String[159];
        String str = "%zlaX\"}\u0010\u0000x4^[*~\nX";
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
                        i3 = 100;
                        break;
                    case ay.f /*1*/:
                        i3 = 63;
                        break;
                    case ay.n /*2*/:
                        i3 = 63;
                        break;
                    case ay.p /*3*/:
                        i3 = 78;
                        break;
                    default:
                        i3 = 23;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "%zlaX\"}\u0010\u0000x4^[*~\nX";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0007PR`p\u000bPX\"r";
                    z = true;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "7w~\u007fG6qx";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "%zl";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0006^\\%b\u0014\\V>\u007f\u0001M\u0010*uKXZ:8\rPZ<e\u000bM\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0006^\\%b\u0014\\V>\u007f\u0001M\u0010*uKXZ:8\u0001MM!eD";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0006^\\%b\u0014\\V>\u007f\u0001M\u0010*uKXZ:8\rPZ<e\u000bM\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0006^\\%b\u0014\\V>\u007f\u0001M\u0010*uKXZ:8\rPZ<e\u000bM\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0006^\\%b\u0014\\V>\u007f\u0001M\u0010*uKXZ:8\rPZ<e\u000bM\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0006^\\%b\u0014\\V>\u007f\u0001M\u0010*uKXZ:8\u0007^QicDYV sD";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0006^\\%b\u0014\\V>\u007f\u0001M\u0010&r\u0005[Z<:\tVL#v\u0010\\W";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0006^\\%b\u0014TZ78\u0000]\u0010)r\u0010O^<v\tL\u0010*x\u0001L\u0012 x\u0010\u0012Z6~\u0017K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0006^\\%b\u0014\\V>\u007f\u0001M\u0010*uKXZ:8\rPZ<e\u000bM\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0014H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0006^\\%b\u0014TZ78\u0003ZK'y\u0002P\u0010*x\u0001L\u0012 x\u0010\u0012Z6~\u0017K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "DLV4rDRV=z\u0005K\\&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0007PR`p\u000bPX\"r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\bPM*z\u000b[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0000Z];p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\"MP7s2VS\"v\rQ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "2VS\"v\rQm\u0001Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0002MP7x\u0014SJ=";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0000Z];p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "Im|\u0003^<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0002^T+d\fRP!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "%Q[<xIv{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0005OOat\u0011LK!zIMP#7";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0000Z];p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "4VS!c\u001cmP#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "4ZM-r\u0014KV!yD}J'{\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0003VQ)r\u0016MZ/{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0000Z];p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "(VK+0\nVQ)76PR";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0002MP7s\u0012VS\"v\rQ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0016\\R'o";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0014ZM-r\u0014KV!y";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0000Z];p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = " ^R'v\nxk\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0002PS'x\tP[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\"MP7x4SJ=";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u0000^M%n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u0002^T+D\fRP!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = ")vj\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\bZZ*e\u000bV[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\rKY;y\u001e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u0003VQ)r\u0016IV\"{\r^Q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "3VS*G\u0011EE\"r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u0006VP ~\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\"MZ+OU\u000f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = ")P{/T\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "<{~ s\u0016PV*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0016JM\u007f.V\u000f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\tP[/t\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = " ZG:r\u0016\u0018LnQ\u000bSV!Z\u000b[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0000Z];p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u0002JX;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "#VQ)r\u0016mZ/{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "2VS\"v\rQm\u0001Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "'MV=|\u0001SP\u001cX)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "-ky\u001bY>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\bVK+y\rQX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    str = "\u0013VS*g\u0011EE\"r";
                    z = true;
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    strArr2 = strArr3;
                    str = "\u0014VS!c\u001c";
                    z = true;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "6\u0011j`EJ\u000e\u0006|'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "%\\W!c\u000e^Q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u001c[^ s\u0016PV*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u0007MV=|\u0001SP<x\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 69;
                    str = "\u0007F^ x\u0003ZQ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 70;
                    str = "\u0007F^ x\u0003ZQ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 71;
                    str = "\tVJ'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 72;
                    str = "&VP ~\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 73;
                    str = "\u0000^R'v\nXK!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 74;
                    str = "\u0005Q[<xIV[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 75;
                    str = "\"JX;Z\u000b[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 76;
                    str = "\u0012VS\"v\rQM!z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 77;
                    str = "#vq\tR6iV\"{\u0005VQ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 78;
                    str = "\u0005\\W!c\u000e^Q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u0000Z];p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 80;
                    str = " Z];d6pr";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 81;
                    str = "\u0000Z];p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 82;
                    str = "(ZZ\ne+V{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 83;
                    str = "\u0000Z];p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 84;
                    str = " ^M%n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 85;
                    str = "(PM\nz\u000b[q\rC\u0001^R";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 86;
                    str = "\u0000Z];p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 87;
                    str = "\u0002MZ+oU\u000f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u0000Z];d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 89;
                    str = "J\u000f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u0005OOas\bF\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 91;
                    str = "J\u000f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 92;
                    str = "KLF=c\u0001R\u00106u\rQ\u0010=b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 93;
                    str = "\u0005OOat\fZ\\%8\nPR+c\fP[n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 94;
                    str = "\u0005OOas\bF\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 95;
                    str = "KLF=c\u0001R\u0010,~\n\u0010L;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 96;
                    str = "\u000bS[\u0011g\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 97;
                    str = "\u0003ZKnu\u001dKZnv\u0016M^7";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 98;
                    str = "T\u000f\u000f~'T\u000f\u000f~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 99;
                    str = "4}t\nQVhV:\u007f,R^-D,~\u000e\u000fy\u0000\u0007}\u0007C";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 100;
                    str = "\u000bMX`v\u0007M^`V'm~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 101;
                    str = "\u0014^L=`\u000bM[n\u007f\u0001^[+eDRV=z\u0005K\\&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 102;
                    str = "\tPJ c\u0001[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 103;
                    str = "\u0017[T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 104;
                    str = "\u0005Q[<x\r[`'s";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 105;
                    str = "\u0017[T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 106;
                    str = "\u0017[T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 107;
                    str = "\u0005Q[<x\r[`'s";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 108;
                    str = "7w~\u007fG6qx";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 109;
                    str = "\u0003ZKaeKZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 110;
                    str = "\u0016Z\\!a\u0001MFnc\u000bTZ 7\fZ^*r\u0016\u001fR'd\t^K-\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 111;
                    str = "\u0011Q^,{\u0001\u001fK!7\u0013MV:rDV";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 112;
                    str = "\u0005OOaz\u0000\n\u0010,n\u0010ZLar\u0016MP<7";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 113;
                    str = "\nJS\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 114;
                    str = "\u0007S^=d\u0001L\u0011*r\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 115;
                    str = "){\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 116;
                    str = "1kyc/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 117;
                    str = "7w~c%Q\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 118;
                    str = "\u0017FQ-eKJQ/u\bZ\u001f:xDHM'c\u0001\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 119;
                    str = "\u0017FQ-eKZ\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 120;
                    str = "\tPJ c\u0001[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 121;
                    str = "\u0017FQ-eKZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 122;
                    str = "\u0017FQ-eKV";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 123;
                    str = "\u0016\\";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 124;
                    str = "\u0016Z\\!a\u0001MFnc\u000bTZ 7\fZ^*r\u0016\u001fR'd\t^K-\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 125;
                    str = "JQP#r\u0000V^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 126;
                    str = "%zl";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 127;
                    str = "KLF=c\u0001R\u0010\"~\u0006\u0010S'u\u0007`R/{\bP\\\u0011s\u0001]J)H\u0015ZR;9\u0017P";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 128;
                    str = "\nJS\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 129;
                    str = "\u0007S^=d\u0001L\u0011*r\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 130;
                    str = "\u0005OOaz\u0000\n\u0010+e\u0016PMn";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 131;
                    str = "){\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 132;
                    str = "\u0005WI/{\r[V:nKZM<x\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 133;
                    str = "\u0017ZKab\n^]\"rDKPn`\u0016VK+7\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 134;
                    str = "\u0016\u0010Za";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 135;
                    str = "\u0014L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 136;
                    str = "\u0007PR`v\n[M!~\u0000\u0011\\!z\t^Q*dJRP |\u0001F";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 137;
                    str = "\u0006^\\%b\u0014TZ78\u0017ZKab\n^]\"rIKPc`\u0016VK+7";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 138;
                    str = "\u000fZF";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 139;
                    str = "1kyc/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 140;
                    str = "){\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 141;
                    str = "\u0007^S-b\b^K+v\f^L&8\u0000VX+d\u0010ZMn";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 142;
                    str = "\u0007^S-b\b^K+v\f^L&8\u0001Q\\!s\rQXar\u0016MP<7";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 143;
                    str = "7w~c%Q\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 144;
                    str = "\u0007^S-b\b^K+v\f^L&8\u0000VX+d\u0010ZMn~\u0017\u001fQ;{\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 145;
                    str = "1kyc/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 146;
                    str = "){\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 147;
                    str = "\u0007PR``\f^K=v\u0014O";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 148;
                    str = "\u0007PR`p\u0001QF#x\u0010VP 9\u0017JO+e\u0011LZ<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 149;
                    str = "K[Z88\u0007PR`p\u0001QF#x\u0010VP 9\u0017JO+e\u0011LZ<9\u0000^Z#x\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 150;
                    str = "4MP(~\bZ\u001f\u001e~\u0007KJ<r\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 151;
                    str = "KRQ:8\u0017[\\/e\u0000\u0010]=c\u0002PS*r\u0016\u0010v g\u0011Kr/g\u0014ZMat\u000bR\u0011,{\u0011ZL:v\u0007TL`v\u0014OR/e\u0010\u0011\\(p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 152;
                    str = "\u000b]Yag\u0013\u0010P\"sKWZ/s\u0001M\u0012#~\u0017R^:t\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 153;
                    str = ",R^-D,~\u000e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 154;
                    str = ",R^-D,~\u000e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 155;
                    str = "%zlaX\"}\u0010\u0000x4^[*~\nX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 156;
                    str = "%zlaX\"}\u0010\u0000x4^[*~\nX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 157;
                    str = "\u0011Q^,{\u0001\u001fK!7\u0013MV:rD";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 158;
                    str = "\u000fZF";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    z = strArr3;
                    strArr = new String[11];
                    str = "\u0007PR`u\bJZ=c\u0005\\T=9\u0017Z^<t\f^O>";
                    z = true;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i = 0;
                    break;
                case true:
                    strArr2[i] = str;
                    str = "\u0007PR`u\bJZ=c\u0005\\T=9\fPR+";
                    z = true;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    str = "\u0007PR`u\bJZ=c\u0005\\T=9\u0017ZK;g";
                    z = true;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0007PR`u\bJZ=c\u0005\\T=9\u0005OO(~\n[Z<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u0007PR`u\bJZ=c\u0005\\T=9\u0017ZK:~\nXL";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0007PR`u\bJZ=c\u0005\\T=9\u0006LK(x\b[Z<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0007PR`u\bJZ=c\u0005\\T=9\u0005OO=r\u0010KV p\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0007PR`u\bJZ=c\u0005\\T=9\u0005OO#v\u0016K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0007PR`u\bJZ=c\u0005\\T=9\u0005\\\\+{\u0001MP#r\u0010ZM;~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0007PR`u\bJZ=c\u0005\\T=9&LK\rx\tR^ s4MP-r\u0017LP<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0007PR`u\bJZ=c\u0005\\T=9\u0017\rO";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    g = strArr3;
                    n = new byte[]{(byte) 0, (byte) 1};
                    o = new byte[]{(byte) 0, (byte) 2};
                    j = new byte[]{(byte) 0, (byte) 1};
                    d = new byte[]{(byte) 0, (byte) 2};
                    r = new byte[]{(byte) 0, (byte) 1};
                    m = null;
                    p = null;
                    q = false;
                    c = false;
                    t = false;
                    u = false;
                    b = false;
                    s = false;
                    a = null;
                    i = null;
                    k = null;
                    l = null;
                    f = null;
                    e = 0;
                    h = false;
                default:
                    strArr2[i] = str;
                    str = "DLV4rDRV=z\u0005K\\&";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    static void b(Application application) {
        h = false;
        p = z();
        q = p();
        c = B();
        t = D();
        u = d();
        b = y();
        s = a(application);
        m = f();
        k = u();
        a = k();
        i = v();
        l = n();
        f = J();
        h = true;
    }

    public static String a() {
        int i = App.az;
        StringBuilder stringBuilder = new StringBuilder();
        int i2 = 15;
        try {
            Enumeration entries = new DexFile(App.p.getApplicationInfo().sourceDir).entries();
            while (entries.hasMoreElements()) {
                int i3 = i2 - 1;
                if (i3 < 0 && i == 0) {
                    break;
                }
                stringBuilder.append((String) entries.nextElement());
                stringBuilder.append(";");
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
        } catch (Throwable e) {
            Log.c(e);
        }
        return stringBuilder.toString();
    }

    private static byte[] a(File file, String str, byte[] bArr) {
        byte[] bArr2 = null;
        Object b = b(file);
        if (b != null) {
            try {
                if (b.length < ((bArr.length + 4) + 16) + 20) {
                    throw new InvalidParameterException(file.toString() + z[1]);
                }
                Object obj = new Object[bArr.length];
                System.arraycopy(b, 0, obj, 0, bArr.length);
                int length = bArr.length + 0;
                if (Arrays.equals(obj, bArr)) {
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(b, length, bArr3, 0, 4);
                    length += 4;
                    Object obj2 = new Object[16];
                    System.arraycopy(b, length, obj2, 0, 16);
                    length += 16;
                    Key secretKeySpec = new SecretKeySpec(a(str, bArr3), z[2]);
                    Cipher instance = Cipher.getInstance(z[0]);
                    instance.init(2, secretKeySpec, new IvParameterSpec(obj2));
                    bArr2 = instance.doFinal(b, length, b.length - length);
                } else {
                    throw new z4(null);
                }
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            } catch (Throwable e3) {
                try {
                    file.delete();
                    if (e3 instanceof z4) {
                        throw ((z4) e3);
                    }
                    throw new RuntimeException(e3);
                } catch (Exception e22) {
                    throw e22;
                }
            }
        }
        return bArr2;
    }

    private static File k() {
        try {
            return h ? a : new File(u(), z[125]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static byte[] e(String str) {
        try {
            return a(J(), ce.m + str, n);
        } catch (z4 e) {
            Log.w(z[152]);
            return null;
        }
    }

    private static void a(byte[] bArr, File file) {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(bArr);
        objectOutputStream.close();
    }

    static boolean B() {
        try {
            return h ? c : Debug.isDebuggerConnected();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static String z() {
        try {
            if (h) {
                return p;
            }
            try {
                String str = Build.MANUFACTURER == null ? "" : Build.MANUFACTURER;
                try {
                    String str2 = VERSION.RELEASE == null ? "" : VERSION.RELEASE;
                    try {
                        String str3 = Build.DISPLAY == null ? "" : Build.DISPLAY;
                        try {
                            String str4;
                            if (Build.MODEL == null) {
                                str4 = "";
                            } else {
                                str4 = Build.MODEL;
                            }
                            String b = or.b();
                            if (b.toLowerCase(Locale.US).contains(z[70])) {
                                str = z[69];
                            } else if (str.toLowerCase(Locale.US).contains(z[86])) {
                                str = z[20];
                            } else if (str2.toLowerCase(Locale.US).contains(z[56])) {
                                str = z[38];
                            } else if (str3.toLowerCase(Locale.US).contains(z[24])) {
                                str = z[33];
                            } else if (str4.toLowerCase(Locale.US).contains(z[81])) {
                                str = z[83];
                            } else if (b.toLowerCase(Locale.US).contains(z[79])) {
                                str = z[29];
                            } else if (str3.startsWith(z[84])) {
                                str = z[42];
                            } else if (str.startsWith(z[52])) {
                                str = z[67];
                            } else if (str2.startsWith(z[21])) {
                                str = z[35];
                            } else {
                                try {
                                    str = (str2.startsWith(z[59]) || str3.startsWith(z[22])) ? z[76] : str2.startsWith(z[48]) ? z[63] : str3.startsWith(z[44]) ? z[71] : str3.startsWith(z[61]) ? z[46] : str3.startsWith(z[80]) ? z[88] : str3.startsWith(z[50]) ? z[87] : str3.startsWith(z[31]) ? z[37] : str3.startsWith(z[72]) ? z[49] : str3.startsWith(z[34]) ? z[62] : str3.startsWith(z[77]) ? z[47] : str3.startsWith(z[58]) ? z[32] : str3.startsWith(z[65]) ? z[53] : str4.startsWith(z[51]) ? z[54] : str3.startsWith(z[60]) ? z[68] : str3.startsWith(z[82]) ? z[45] : str3.startsWith(z[55]) ? z[40] : str3.startsWith(z[27]) ? z[74] : str3.startsWith(z[41]) ? z[23] : str3.startsWith(z[30]) ? z[64] : str3.startsWith(z[66]) ? z[78] : b.contains(z[75]) ? z[57] : b.contains(z[43]) ? z[26] : b.contains(z[85]) ? z[19] : b.contains(z[25]) ? z[36] : str3.contains(z[39]) ? z[73] : null;
                                } catch (NullPointerException e) {
                                    throw e;
                                }
                            }
                            Log.i(z[28] + str);
                            return str;
                        } catch (NullPointerException e2) {
                            throw e2;
                        }
                    } catch (NullPointerException e22) {
                        throw e22;
                    }
                } catch (NullPointerException e222) {
                    throw e222;
                }
            } catch (NullPointerException e2222) {
                throw e2222;
            }
        } catch (NullPointerException e22222) {
            throw e22222;
        }
    }

    private static byte[] F() {
        return a(16);
    }

    private static String r() {
        try {
            if (App.aa != 3) {
                if (App.G != 3) {
                    try {
                        return ce.b;
                    }
                }
            }
            return ce.h;
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    private static File q() {
        return new File(App.p.getFilesDir(), z[158]);
    }

    static String d(String str) {
        Object decode = Base64.decode(ce.o, 0);
        Object bytes = c(App.p).getBytes();
        int length = decode.length;
        int length2 = bytes.length;
        byte[] bArr = new byte[(length + length2)];
        System.arraycopy(decode, 0, bArr, 0, length);
        System.arraycopy(bytes, 0, bArr, length, length2);
        byte[][] bArr2 = new byte[][]{str.getBytes()};
        return new String(Base64.encode(a(bArr, new byte[][]{a(bArr, bArr2)}), 2));
    }

    private static boolean a(File file, byte[] bArr, String str, byte[] bArr2) {
        boolean z = false;
        int i = App.az;
        try {
            byte[] i2 = i();
            byte[] F = F();
            Key secretKeySpec = new SecretKeySpec(a(str, i2), z[155]);
            Cipher instance = Cipher.getInstance(z[156]);
            instance.init(1, secretKeySpec, new IvParameterSpec(F));
            byte[] bArr3 = new byte[(((bArr2.length + i2.length) + F.length) + instance.doFinal(bArr).length)];
            byte[][] bArr4 = new byte[][]{bArr2, i2, F, instance.doFinal(bArr)};
            int length = bArr4.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                Object obj = bArr4[i3];
                System.arraycopy(obj, 0, bArr3, i4, obj.length);
                i4 += obj.length;
                i3++;
                if (i != 0) {
                    break;
                }
            }
            a(bArr3, file);
            z = Arrays.equals(bArr3, b(file));
        } catch (Throwable e) {
            Log.b(z[157] + file.toString(), e);
        }
        return z;
    }

    public static SecretKey a(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = App.az;
        char[] cArr = new char[bArr.length];
        int i4 = 0;
        while (i4 < bArr.length) {
            cArr[i4] = (char) bArr[i4];
            i4++;
            if (i3 != 0) {
                break;
            }
        }
        try {
            try {
                return SecretKeyFactory.getInstance(z[99]).generateSecret(new PBEKeySpec(cArr, bArr2, i, i2));
            } catch (InvalidKeySpecException e) {
                throw new AssertionError(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    private static String f() {
        try {
            return h ? m : x();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static Boolean o() {
        try {
            return Boolean.valueOf(Environment.getExternalStorageState().equals(z[102]));
        } catch (Exception e) {
            return null;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, boolean z) {
        MessageDigest instance;
        int length;
        UnsupportedEncodingException unsupportedEncodingException;
        Object obj;
        Object obj2 = null;
        try {
            instance = MessageDigest.getInstance(z[143]);
        } catch (NoSuchAlgorithmException e) {
            Log.e(z[141] + e.toString());
            instance = null;
        }
        if (instance == null) {
            try {
                Log.e(z[144]);
                return null;
            } catch (NoSuchAlgorithmException e2) {
                throw e2;
            }
        }
        Object bytes;
        String str = "";
        if (z) {
            str = a(Arrays.equals(bArr2, j));
        }
        if (str != null) {
            try {
                bytes = str.getBytes(z[145]);
                try {
                    length = bytes.length;
                } catch (UnsupportedEncodingException e3) {
                    UnsupportedEncodingException unsupportedEncodingException2 = e3;
                    obj2 = bytes;
                    unsupportedEncodingException = unsupportedEncodingException2;
                    Log.e(z[142] + unsupportedEncodingException.toString());
                    bytes = obj2;
                    length = 0;
                    obj = new Object[(bArr.length + length)];
                    if (length > 0) {
                        length = 0;
                    } else {
                        System.arraycopy(bytes, 0, obj, 0, bytes.length);
                        length += 0;
                    }
                    System.arraycopy(bArr, 0, obj, length, bArr.length);
                    instance.reset();
                    instance.update(obj);
                    return instance.digest();
                }
            } catch (UnsupportedEncodingException e4) {
                unsupportedEncodingException = e4;
                Log.e(z[142] + unsupportedEncodingException.toString());
                bytes = obj2;
                length = 0;
                obj = new Object[(bArr.length + length)];
                if (length > 0) {
                    System.arraycopy(bytes, 0, obj, 0, bytes.length);
                    length += 0;
                } else {
                    length = 0;
                }
                System.arraycopy(bArr, 0, obj, length, bArr.length);
                instance.reset();
                instance.update(obj);
                return instance.digest();
            }
        }
        bytes = null;
        length = 0;
        obj = new Object[(bArr.length + length)];
        if (length > 0) {
            System.arraycopy(bytes, 0, obj, 0, bytes.length);
            length += 0;
        } else {
            length = 0;
        }
        System.arraycopy(bArr, 0, obj, length, bArr.length);
        instance.reset();
        instance.update(obj);
        return instance.digest();
    }

    public static a19 a(InputStream inputStream) {
        int i = App.az;
        Object obj = new Object[r.length];
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        Object obj2 = new Object[((((obj.length + 1) + bArr.length) + bArr2.length) + bArr3.length)];
        inputStream.read(obj2);
        System.arraycopy(obj2, 0, obj, 0, r.length);
        int length = 0 + r.length;
        try {
            if (!Arrays.equals(obj, d)) {
                if (!Arrays.equals(obj, j)) {
                    throw new z4(null);
                }
            }
            int i2 = length + 1;
            String valueOf = String.valueOf(obj2[length]);
            byte[][] bArr4 = new byte[][]{bArr, bArr2, bArr3};
            int length2 = bArr4.length;
            int i3 = i2;
            i2 = 0;
            while (i2 < length2) {
                Object obj3 = bArr4[i2];
                System.arraycopy(obj2, i3, obj3, 0, obj3.length);
                i3 += obj3.length;
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return new a19(obj, valueOf, bArr, bArr2, bArr3);
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    static boolean a(Application application) {
        try {
            return h ? s : a(application, r());
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static void t() {
        String str;
        try {
            if (Environment.getExternalStorageState().equals(z[120])) {
                File k = k();
                File v = v();
                byte[] b = b(v);
                byte[] b2 = b(k);
                boolean exists = k.exists();
                try {
                    Object valueOf;
                    StringBuilder append = new StringBuilder().append(z[119]).append(exists).append(" ");
                    if (exists) {
                        valueOf = Long.valueOf(k.lastModified());
                    } else {
                        valueOf = "";
                    }
                    try {
                        Log.i(append.append(valueOf).toString());
                        if (b != null || b2 != null) {
                            if (!Arrays.equals(b, b2)) {
                                byte[] bArr;
                                if (b != null) {
                                    str = "e";
                                    Log.i(z[121]);
                                    if (App.az == 0) {
                                        bArr = b;
                                        a(bArr, k);
                                        Arrays.equals(bArr, b(k));
                                    }
                                }
                                str = "i";
                                Log.i(z[122]);
                                k = v;
                                bArr = b2;
                                try {
                                    a(bArr, k);
                                    Arrays.equals(bArr, b(k));
                                } catch (Exception e) {
                                    Log.e(z[118] + str);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        throw e2;
                    } catch (Exception e22) {
                        try {
                            throw e22;
                        } catch (Exception e222) {
                            throw e222;
                        }
                    }
                } catch (Exception e2222) {
                    throw e2222;
                }
            }
        } catch (Exception e22222) {
            throw e22222;
        }
    }

    public static void a(OutputStream outputStream, u5 u5Var) {
        int i = 0;
        int i2 = App.az;
        byte[] bArr = new byte[]{Byte.parseByte(u5Var.b.c)};
        byte[][] bArr2 = new byte[][]{r, bArr, u5Var.b.d, u5Var.b.b, u5Var.b.e};
        int length = bArr2.length;
        while (i < length) {
            outputStream.write(bArr2[i]);
            i++;
            if (i2 != 0) {
                return;
            }
        }
    }

    private static String x() {
        return a(true);
    }

    public static void E() {
        n().delete();
    }

    public static int l() {
        int i = App.az;
        try {
            if (e != 0) {
                return e;
            }
            try {
                Enumeration entries = new DexFile(App.p.getApplicationInfo().sourceDir).entries();
                while (entries.hasMoreElements()) {
                    entries.nextElement();
                    e++;
                    if (i != 0) {
                        break;
                    }
                }
            } catch (Throwable e) {
                Log.c(e);
            }
            return e;
        } catch (IOException e2) {
            throw e2;
        }
    }

    public static boolean g() {
        try {
            Process exec = Runtime.getRuntime().exec(z[135]);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(exec.getInputStream());
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(exec.getErrorStream());
            exec.waitFor();
            int available = bufferedInputStream2.available();
            bufferedInputStream2.read(new byte[available], 0, available);
            available = bufferedInputStream.available();
            byte[] bArr = new byte[available];
            bufferedInputStream.read(bArr, 0, available);
            return new String(bArr).contains(z[136]);
        } catch (Throwable e) {
            Log.c(e);
            return false;
        }
    }

    public static String b(Context context) {
        int i = App.az;
        Signature[] a = b9.a(context);
        if (a == null) {
            return null;
        }
        try {
            if (a.length == 0) {
                return null;
            }
            try {
                MessageDigest instance = MessageDigest.getInstance(z[117]);
                instance.reset();
                int length = a.length;
                int i2 = 0;
                while (i2 < length) {
                    instance.update(a[i2].toByteArray());
                    i2++;
                    if (i != 0) {
                        break;
                    }
                }
                return Base64.encodeToString(instance.digest(), 2);
            } catch (Throwable e) {
                Log.c(e);
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            throw e2;
        } catch (NoSuchAlgorithmException e22) {
            throw e22;
        }
    }

    static boolean c() {
        Object subscriberId = App.a3.getSubscriberId();
        try {
            if (TextUtils.isEmpty(subscriberId)) {
                return true;
            }
            try {
                return subscriberId.contains(z[98]);
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    static boolean A() {
        return h;
    }

    private static boolean a(Application application, String str) {
        int i = App.az;
        try {
            if (h) {
                return s;
            }
            String packageName = application.getPackageName();
            if (packageName == null) {
                return false;
            }
            try {
                if (!packageName.equals(z[147])) {
                    return false;
                }
                PackageManager packageManager = application.getPackageManager();
                if (packageManager == null) {
                    return false;
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 64);
                    if (packageInfo == null) {
                        return false;
                    }
                    try {
                        if (packageInfo.signatures == null) {
                            return false;
                        }
                        Signature[] signatureArr = packageInfo.signatures;
                        int length = signatureArr.length;
                        int i2 = 0;
                        while (i2 < length) {
                            Signature signature = signatureArr[i2];
                            if (signature != null) {
                                try {
                                    if (signature.toCharsString().equals(str)) {
                                        return true;
                                    }
                                } catch (NameNotFoundException e) {
                                    throw e;
                                }
                            }
                            i2++;
                            if (i != 0) {
                                return false;
                            }
                        }
                        return false;
                    } catch (NameNotFoundException e2) {
                        throw e2;
                    }
                } catch (NameNotFoundException e3) {
                    return false;
                }
            } catch (NameNotFoundException e22) {
                throw e22;
            }
        } catch (NameNotFoundException e222) {
            throw e222;
        }
    }

    public static byte[] g(String str) {
        try {
            return a(v(), ce.k + str + f(), o);
        } catch (Throwable e) {
            Log.c(z[124], e);
            return null;
        }
    }

    public static String b(String str) {
        int i = App.az;
        try {
            MessageDigest instance = MessageDigest.getInstance(z[146]);
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder stringBuilder = new StringBuilder();
            int length = digest.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = digest[i2];
                if (i3 < 0) {
                    i3 += 256;
                }
                stringBuilder.append(Character.forDigit(i3 >> 4, 16));
                stringBuilder.append(Character.forDigit(i3 % 16, 16));
                i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static boolean I() {
        try {
            u5 G = G();
            if (G == null) {
                return false;
            }
            try {
                if (G.b.b != null) {
                    return G.a == null ? false : Arrays.equals(b(G.b.b), G.a);
                } else {
                    return false;
                }
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Throwable e3) {
            Log.c(z[132], e3);
            return false;
        }
    }

    static boolean y() {
        try {
            if (h) {
                return b;
            }
            try {
                if (new File(z[149]).exists()) {
                    b = true;
                }
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
            }
            try {
                App.p.getPackageManager().getPackageInfo(z[148], 128);
                b = true;
            } catch (NameNotFoundException e3) {
            }
            return b;
        } catch (Exception e4) {
            throw e4;
        }
    }

    private static String a(boolean z) {
        int i = App.az;
        AccountManager accountManager = AccountManager.get(App.p.getApplicationContext());
        try {
            if (accountManager != null) {
                Account[] accountsByType = accountManager.getAccountsByType(z[3]);
                if (accountsByType != null) {
                    int length = accountsByType.length;
                    int i2 = 0;
                    while (i2 < length) {
                        Account account = accountsByType[i2];
                        try {
                            if (account.name == null) {
                                i2++;
                                if (i != 0) {
                                    break;
                                }
                            } else if (z) {
                                return account.name;
                            } else {
                                i2 = account.name.indexOf(64);
                                return i2 > 0 ? account.name.substring(0, i2) : account.name;
                            }
                        } catch (NullPointerException e) {
                            throw e;
                        } catch (NullPointerException e2) {
                            throw e2;
                        }
                    }
                }
            }
            return "";
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.a19 a(java.io.File r7) {
        /*
        r0 = 0;
        r1 = r7.exists();	 Catch:{ Exception -> 0x0011 }
        if (r1 != 0) goto L_0x0013;
    L_0x0007:
        r1 = z;	 Catch:{ Exception -> 0x0011 }
        r2 = 13;
        r1 = r1[r2];	 Catch:{ Exception -> 0x0011 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ Exception -> 0x0011 }
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r1 = new java.io.FileInputStream;	 Catch:{ z4 -> 0x0042, FileNotFoundException -> 0x0073, IOException -> 0x00ba, all -> 0x0101 }
        r1.<init>(r7);	 Catch:{ z4 -> 0x0042, FileNotFoundException -> 0x0073, IOException -> 0x00ba, all -> 0x0101 }
        r0 = a(r1);	 Catch:{ z4 -> 0x0138, FileNotFoundException -> 0x0135, IOException -> 0x0130 }
        if (r1 == 0) goto L_0x0010;
    L_0x001e:
        r1.close();	 Catch:{ Exception -> 0x0022 }
        goto L_0x0010;
    L_0x0022:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0010;
    L_0x0042:
        r1 = move-exception;
        r1 = r0;
    L_0x0044:
        r2 = z;	 Catch:{ all -> 0x012b }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ all -> 0x012b }
        com.whatsapp.util.Log.w(r2);	 Catch:{ all -> 0x012b }
        if (r1 == 0) goto L_0x0010;
    L_0x004f:
        r1.close();	 Catch:{ Exception -> 0x0053 }
        goto L_0x0010;
    L_0x0053:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 14;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0010;
    L_0x0073:
        r1 = move-exception;
        r1 = r0;
    L_0x0075:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012b }
        r2.<init>();	 Catch:{ all -> 0x012b }
        r3 = z;	 Catch:{ all -> 0x012b }
        r4 = 11;
        r3 = r3[r4];	 Catch:{ all -> 0x012b }
        r2 = r2.append(r3);	 Catch:{ all -> 0x012b }
        r3 = r7.getAbsolutePath();	 Catch:{ all -> 0x012b }
        r2 = r2.append(r3);	 Catch:{ all -> 0x012b }
        r2 = r2.toString();	 Catch:{ all -> 0x012b }
        com.whatsapp.util.Log.e(r2);	 Catch:{ all -> 0x012b }
        if (r1 == 0) goto L_0x0010;
    L_0x0095:
        r1.close();	 Catch:{ Exception -> 0x009a }
        goto L_0x0010;
    L_0x009a:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0010;
    L_0x00ba:
        r1 = move-exception;
        r2 = r0;
    L_0x00bc:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012d }
        r3.<init>();	 Catch:{ all -> 0x012d }
        r4 = z;	 Catch:{ all -> 0x012d }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ all -> 0x012d }
        r3 = r3.append(r4);	 Catch:{ all -> 0x012d }
        r1 = r1.toString();	 Catch:{ all -> 0x012d }
        r1 = r3.append(r1);	 Catch:{ all -> 0x012d }
        r1 = r1.toString();	 Catch:{ all -> 0x012d }
        com.whatsapp.util.Log.e(r1);	 Catch:{ all -> 0x012d }
        if (r2 == 0) goto L_0x0010;
    L_0x00db:
        r2.close();	 Catch:{ Exception -> 0x00e0 }
        goto L_0x0010;
    L_0x00e0:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 10;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0010;
    L_0x0101:
        r1 = move-exception;
        r6 = r1;
        r1 = r0;
        r0 = r6;
    L_0x0105:
        if (r1 == 0) goto L_0x010a;
    L_0x0107:
        r1.close();	 Catch:{ Exception -> 0x010b }
    L_0x010a:
        throw r0;
    L_0x010b:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 8;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x010a;
    L_0x012b:
        r0 = move-exception;
        goto L_0x0105;
    L_0x012d:
        r0 = move-exception;
        r1 = r2;
        goto L_0x0105;
    L_0x0130:
        r2 = move-exception;
        r6 = r2;
        r2 = r1;
        r1 = r6;
        goto L_0x00bc;
    L_0x0135:
        r2 = move-exception;
        goto L_0x0075;
    L_0x0138:
        r2 = move-exception;
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a54.a(java.io.File):com.whatsapp.a19");
    }

    public static boolean s() {
        try {
            return !q().exists();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static byte[] a(String str) {
        try {
            return a(n(), ce.m + str, n);
        } catch (Throwable e) {
            Log.c(z[101], e);
            return null;
        }
    }

    static boolean p() {
        int i;
        boolean h;
        boolean c;
        StringBuilder append;
        StringBuilder append2;
        String str;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        int i2 = 2;
        try {
            if (h) {
                return q;
            }
            File file = new File(z[95]);
            File file2 = new File(z[92]);
            try {
                if (VERSION.SDK_INT >= 9) {
                    if (file.canExecute()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    try {
                        i2 = file2.canExecute();
                        i2 = i2 != 0 ? 1 : 0;
                    } catch (Exception e) {
                        throw e;
                    } catch (NoSuchMethodError e2) {
                        Log.i(z[93] + VERSION.SDK_INT);
                    } catch (Exception e3) {
                    }
                } else {
                    i = 2;
                }
            } catch (Exception e4) {
                throw e4;
            } catch (NoSuchMethodError e5) {
                i = 2;
                Log.i(z[93] + VERSION.SDK_INT);
                h = h();
                c = c();
                try {
                    try {
                        try {
                            Log.i(z[90] + (file.exists() ? 1 : 0) + (file.canRead() ? 1 : 0) + (file.canWrite() ? 1 : 0) + i + (h ? z[91] : "") + (c ? "3" : ""));
                            append = new StringBuilder().append(z[94]);
                            if (file2.exists()) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            try {
                                append = append.append(i);
                                if (file2.canRead()) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                try {
                                    append = append.append(i);
                                    if (file2.canWrite()) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    try {
                                        append2 = append.append(i).append(i2);
                                        if (h) {
                                            str = z[89];
                                        } else {
                                            str = "";
                                        }
                                        try {
                                            append2 = append2.append(str);
                                            if (c) {
                                                str = "3";
                                            } else {
                                                str = "";
                                            }
                                            try {
                                                Log.i(append2.append(str).toString());
                                                if (!file.exists()) {
                                                    return true;
                                                }
                                                try {
                                                    if (!file2.exists()) {
                                                        return true;
                                                    }
                                                    try {
                                                        fileInputStream = new FileInputStream(file);
                                                        try {
                                                            fileInputStream.close();
                                                            fileInputStream2 = fileInputStream;
                                                        } catch (Exception e6) {
                                                            fileInputStream2 = fileInputStream;
                                                            if (fileInputStream2 != null) {
                                                                return true;
                                                            }
                                                            try {
                                                                fileInputStream = new FileInputStream(file2);
                                                                try {
                                                                    fileInputStream.close();
                                                                } catch (Exception e7) {
                                                                }
                                                            } catch (Exception e8) {
                                                                fileInputStream = fileInputStream2;
                                                            }
                                                            return fileInputStream != null;
                                                        }
                                                    } catch (Exception e9) {
                                                        fileInputStream = null;
                                                        fileInputStream2 = fileInputStream;
                                                        if (fileInputStream2 != null) {
                                                            return true;
                                                        }
                                                        fileInputStream = new FileInputStream(file2);
                                                        fileInputStream.close();
                                                        if (fileInputStream != null) {
                                                        }
                                                    }
                                                    if (fileInputStream2 != null) {
                                                        return true;
                                                    }
                                                    fileInputStream = new FileInputStream(file2);
                                                    fileInputStream.close();
                                                    if (fileInputStream != null) {
                                                    }
                                                } catch (Exception e42) {
                                                    throw e42;
                                                }
                                            } catch (Exception e422) {
                                                throw e422;
                                            }
                                        } catch (Exception e4222) {
                                            throw e4222;
                                        }
                                    } catch (Exception e42222) {
                                        throw e42222;
                                    }
                                } catch (Exception e422222) {
                                    throw e422222;
                                }
                            } catch (Exception e4222222) {
                                throw e4222222;
                            }
                        } catch (Exception e42222222) {
                            throw e42222222;
                        }
                    } catch (Exception e422222222) {
                        throw e422222222;
                    }
                } catch (Exception e4222222222) {
                    throw e4222222222;
                }
            } catch (Exception e42222222222) {
                try {
                    throw e42222222222;
                } catch (Exception e10) {
                    i = 2;
                } catch (NoSuchMethodError e52) {
                    i = 2;
                    Log.i(z[93] + VERSION.SDK_INT);
                    h = h();
                    c = c();
                    try {
                        try {
                            try {
                                Log.i(z[90] + (file.exists() ? 1 : 0) + (file.canRead() ? 1 : 0) + (file.canWrite() ? 1 : 0) + i + (h ? z[91] : "") + (c ? "3" : ""));
                                append = new StringBuilder().append(z[94]);
                                if (file2.exists()) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                try {
                                    append = append.append(i);
                                    if (file2.canRead()) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    try {
                                        append = append.append(i);
                                        if (file2.canWrite()) {
                                            i = 1;
                                        } else {
                                            i = 0;
                                        }
                                        try {
                                            append2 = append.append(i).append(i2);
                                            if (h) {
                                                str = z[89];
                                            } else {
                                                str = "";
                                            }
                                            try {
                                                append2 = append2.append(str);
                                                if (c) {
                                                    str = "3";
                                                } else {
                                                    str = "";
                                                }
                                                try {
                                                    Log.i(append2.append(str).toString());
                                                    if (!file.exists()) {
                                                        return true;
                                                    }
                                                    try {
                                                        if (!file2.exists()) {
                                                            return true;
                                                        }
                                                        try {
                                                            fileInputStream = new FileInputStream(file);
                                                            try {
                                                                fileInputStream.close();
                                                                fileInputStream2 = fileInputStream;
                                                            } catch (Exception e62) {
                                                                fileInputStream2 = fileInputStream;
                                                                if (fileInputStream2 != null) {
                                                                    return true;
                                                                }
                                                                try {
                                                                    fileInputStream = new FileInputStream(file2);
                                                                    try {
                                                                        fileInputStream.close();
                                                                    } catch (Exception e72) {
                                                                    }
                                                                } catch (Exception e82) {
                                                                    fileInputStream = fileInputStream2;
                                                                }
                                                                return fileInputStream != null;
                                                            }
                                                        } catch (Exception e92) {
                                                            fileInputStream = null;
                                                            fileInputStream2 = fileInputStream;
                                                            if (fileInputStream2 != null) {
                                                                return true;
                                                            }
                                                            fileInputStream = new FileInputStream(file2);
                                                            fileInputStream.close();
                                                            if (fileInputStream != null) {
                                                            }
                                                        }
                                                        if (fileInputStream2 != null) {
                                                            return true;
                                                        }
                                                        fileInputStream = new FileInputStream(file2);
                                                        fileInputStream.close();
                                                        if (fileInputStream != null) {
                                                        }
                                                    } catch (Exception e422222222222) {
                                                        throw e422222222222;
                                                    }
                                                } catch (Exception e4222222222222) {
                                                    throw e4222222222222;
                                                }
                                            } catch (Exception e42222222222222) {
                                                throw e42222222222222;
                                            }
                                        } catch (Exception e422222222222222) {
                                            throw e422222222222222;
                                        }
                                    } catch (Exception e4222222222222222) {
                                        throw e4222222222222222;
                                    }
                                } catch (Exception e42222222222222222) {
                                    throw e42222222222222222;
                                }
                            } catch (Exception e422222222222222222) {
                                throw e422222222222222222;
                            }
                        } catch (Exception e4222222222222222222) {
                            throw e4222222222222222222;
                        }
                    } catch (Exception e42222222222222222222) {
                        throw e42222222222222222222;
                    }
                }
            }
            h = h();
            c = c();
            try {
                if (file.exists()) {
                }
                try {
                    if (file.canRead()) {
                    }
                    try {
                        if (file.canWrite()) {
                        }
                        if (h) {
                        }
                        if (c) {
                        }
                        Log.i(z[90] + (file.exists() ? 1 : 0) + (file.canRead() ? 1 : 0) + (file.canWrite() ? 1 : 0) + i + (h ? z[91] : "") + (c ? "3" : ""));
                        append = new StringBuilder().append(z[94]);
                        if (file2.exists()) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        append = append.append(i);
                        if (file2.canRead()) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        append = append.append(i);
                        if (file2.canWrite()) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        append2 = append.append(i).append(i2);
                        if (h) {
                            str = z[89];
                        } else {
                            str = "";
                        }
                        append2 = append2.append(str);
                        if (c) {
                            str = "3";
                        } else {
                            str = "";
                        }
                        Log.i(append2.append(str).toString());
                        if (!file.exists()) {
                            return true;
                        }
                        if (!file2.exists()) {
                            return true;
                        }
                        fileInputStream = new FileInputStream(file);
                        fileInputStream.close();
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            return true;
                        }
                        fileInputStream = new FileInputStream(file2);
                        fileInputStream.close();
                        if (fileInputStream != null) {
                        }
                    } catch (Exception e422222222222222222222) {
                        throw e422222222222222222222;
                    }
                } catch (Exception e4222222222222222222222) {
                    throw e4222222222222222222222;
                }
            } catch (Exception e42222222222222222222222) {
                throw e42222222222222222222222;
            }
        } catch (Exception e422222222222222222222222) {
            throw e422222222222222222222222;
        }
    }

    static boolean d() {
        int i = App.az;
        try {
            if (h) {
                return u;
            }
            try {
                if (new File(z[151]).exists()) {
                    u = true;
                }
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
            }
            String[] strArr = g;
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                try {
                    App.p.getPackageManager().getPackageInfo(strArr[i2], 128);
                    u = true;
                } catch (NameNotFoundException e3) {
                }
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return u;
        } catch (Exception e4) {
            throw e4;
        }
    }

    public static byte[] a(Context context) {
        byte[] digest;
        int i = App.az;
        try {
            ZipFile zipFile = new ZipFile(new ContextWrapper(context).getPackageCodePath());
            InputStream inputStream = zipFile.getInputStream(zipFile.getEntry(z[114]));
            MessageDigest instance = MessageDigest.getInstance(z[115]);
            byte[] bArr = new byte[8192];
            do {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                instance.update(bArr, 0, read);
            } while (i == 0);
            digest = instance.digest();
        } catch (Exception e) {
            Log.e(z[112] + e.toString());
            try {
                digest = z[113].getBytes(z[116]);
            } catch (Throwable e2) {
                throw new Error(e2);
            }
        }
        return digest;
    }

    public static boolean b() {
        return q().delete();
    }

    public static void C() {
        v().delete();
        k().delete();
    }

    static int H() {
        AccountManager accountManager = AccountManager.get(App.p.getApplicationContext());
        if (accountManager == null) {
            return -1;
        }
        try {
            return accountManager.getAccountsByType(z[18]).length;
        } catch (Exception e) {
            return -1;
        }
    }

    public static byte[] j() {
        return F();
    }

    private static File u() {
        try {
            return h ? k : new File(App.ao, z[150]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static byte[] b(byte[] bArr) {
        return a(bArr, r, false);
    }

    private static byte[] a(String str, byte[] bArr) {
        return new SecretKeySpec(a(str.getBytes(), bArr, 16, 128).getEncoded(), z[126]).getEncoded();
    }

    private static byte[] a(int i) {
        try {
            byte[] bArr = new byte[i];
            SecureRandom.getInstance(z[108]).nextBytes(bArr);
            return bArr;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean b(byte[] bArr, String str) {
        try {
            if (!a(J(), bArr, ce.m + str, n)) {
                return false;
            }
            App.v = bArr;
            return true;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static boolean c(String str) {
        File v = v();
        try {
            if (!v.exists()) {
                return false;
            }
            try {
                return v.length() > 0 && g(str) != null;
            }
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    private static byte[] b(File file) {
        ObjectInputStream objectInputStream;
        Throwable e;
        try {
            if (file.exists() && file.length() > 0) {
                try {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    try {
                        byte[] bArr = (byte[]) objectInputStream.readObject();
                        if (objectInputStream == null) {
                            return bArr;
                        }
                        try {
                            objectInputStream.close();
                            return bArr;
                        } catch (NullPointerException e2) {
                            throw e2;
                        } catch (Throwable e3) {
                            Log.c(e3);
                            return bArr;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        try {
                            Log.b(z[97], e);
                            if (objectInputStream != null) {
                                try {
                                    objectInputStream.close();
                                } catch (Throwable e5) {
                                    Log.c(e5);
                                }
                            }
                        } catch (Throwable th) {
                            e5 = th;
                            if (objectInputStream != null) {
                                try {
                                    objectInputStream.close();
                                } catch (NullPointerException e22) {
                                    throw e22;
                                } catch (Throwable e32) {
                                    Log.c(e32);
                                }
                            }
                            throw e5;
                        }
                        return null;
                    }
                } catch (Exception e6) {
                    e5 = e6;
                    objectInputStream = null;
                    Log.b(z[97], e5);
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    e5 = th2;
                    objectInputStream = null;
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    throw e5;
                }
            }
            return null;
        } catch (IOException e7) {
            throw e7;
        }
    }

    static boolean h() {
        Object obj = Build.PRODUCT;
        try {
            if (TextUtils.isEmpty(obj)) {
                return true;
            }
            try {
                if (obj.toLowerCase(Locale.US).contains(z[106])) {
                    return true;
                }
                obj = Build.MODEL;
                try {
                    if (TextUtils.isEmpty(obj)) {
                        return true;
                    }
                    try {
                        if (obj.toLowerCase(Locale.US).contains(z[105])) {
                            return true;
                        }
                        obj = Build.MANUFACTURER;
                        try {
                            if (TextUtils.isEmpty(obj)) {
                                return true;
                            }
                            try {
                                if (obj.toLowerCase(Locale.US).contains(z[103])) {
                                    return true;
                                }
                                try {
                                    if (App.e == null) {
                                        return true;
                                    }
                                    try {
                                        if (z[104] == null) {
                                            return true;
                                        }
                                        try {
                                            try {
                                                if (TextUtils.isEmpty(Secure.getString(App.e, z[107]))) {
                                                    return true;
                                                }
                                                try {
                                                    return App.a3 == null;
                                                } catch (NullPointerException e) {
                                                    throw e;
                                                }
                                            } catch (NullPointerException e2) {
                                                throw e2;
                                            }
                                        } catch (NullPointerException e3) {
                                            return true;
                                        }
                                    } catch (NullPointerException e22) {
                                        throw e22;
                                    }
                                } catch (NullPointerException e222) {
                                    throw e222;
                                }
                            } catch (NullPointerException e2222) {
                                throw e2222;
                            }
                        } catch (NullPointerException e22222) {
                            throw e22222;
                        }
                    } catch (NullPointerException e222222) {
                        throw e222222;
                    }
                } catch (NullPointerException e2222222) {
                    throw e2222222;
                }
            } catch (NullPointerException e22222222) {
                throw e22222222;
            }
        } catch (NullPointerException e222222222) {
            throw e222222222;
        }
    }

    private static File J() {
        try {
            return h ? f : new File(App.p.getFilesDir(), z[96]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static u5 G() {
        File q = q();
        try {
            if (q.exists()) {
                Object b = b(q);
                if (b == null) {
                    return null;
                }
                try {
                    if (b.length < (((((r.length + 1) + 32) + 16) + 32) + 16) + 32) {
                        throw new InvalidParameterException(q.toString() + z[17]);
                    }
                    Object obj = new Object[r.length];
                    System.arraycopy(b, 0, obj, 0, r.length);
                    int length = r.length + 0;
                    try {
                        if (Arrays.equals(obj, r)) {
                            int i = length + 1;
                            String valueOf = String.valueOf(b[length]);
                            Object obj2 = new Object[32];
                            System.arraycopy(b, i, obj2, 0, 32);
                            length = i + 32;
                            Object obj3 = new Object[16];
                            System.arraycopy(b, length, obj3, 0, 16);
                            length += 16;
                            Object obj4 = new Object[32];
                            System.arraycopy(b, length, obj4, 0, 32);
                            length += 32;
                            Object obj5 = new Object[16];
                            System.arraycopy(b, length, obj5, 0, 16);
                            Object obj6 = new Object[32];
                            System.arraycopy(b, length + 16, obj6, 0, 32);
                            return new u5(obj, valueOf, obj2, obj3, obj4, obj5, obj6);
                        }
                        throw new z4(null);
                    } catch (NullPointerException e) {
                        throw e;
                    }
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
            Log.w(z[16]);
            return null;
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    public static String c(Application application) {
        int i = App.az;
        try {
            int read;
            ZipFile zipFile = new ZipFile(application.getPackageCodePath());
            InputStream inputStream = zipFile.getInputStream(zipFile.getEntry(z[129]));
            MessageDigest instance = MessageDigest.getInstance(z[131]);
            byte[] bArr = new byte[8192];
            do {
                read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                instance.update(bArr, 0, read);
            } while (i == 0);
            byte[] digest = instance.digest();
            StringBuilder stringBuilder = new StringBuilder();
            read = digest.length;
            int i2 = 0;
            while (i2 < read) {
                int i3 = digest[i2];
                if (i3 < 0) {
                    i3 += 256;
                }
                stringBuilder.append(Character.forDigit(i3 >> 4, 16));
                stringBuilder.append(Character.forDigit(i3 % 16, 16));
                i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            Log.e(z[130] + e.toString());
            return z[128];
        }
    }

    static boolean D() {
        try {
            if (h) {
                return t;
            }
            try {
                return new File(z[127]).exists();
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
