package com.whatsapp.util;

import android.backport.util.Base64;
import com.whatsapp.a54;
import com.whatsapp.b3;
import com.whatsapp.ce;
import com.whatsapp.vk;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class t {
    private static t q;
    private static final String[] z;
    private Cipher a;
    private Cipher b;
    private Cipher c;
    private Cipher d;
    private Cipher e;
    private Cipher f;
    private Cipher g;
    private Cipher h;
    private Cipher i;
    private Cipher j;
    private Cipher k;
    private Cipher l;
    private boolean m;
    private Cipher n;
    private Cipher o;
    private Cipher p;
    private Cipher r;
    byte[] s;

    public boolean b() {
        return this.m;
    }

    public static t a() {
        try {
            if (q == null) {
                q = new t();
            }
            return q;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private t() {
        this.s = new byte[131072];
        this.m = false;
        try {
            Key secretKeySpec = new SecretKeySpec(ce.p.getBytes(z[16]), z[3]);
            Key secretKeySpec2 = new SecretKeySpec(Base64.decode(z[18], 0), z[9]);
            Key secretKeySpec3 = new SecretKeySpec(a54.a(Base64.decode(z[5], 0)), z[7]);
            AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(Base64.decode(z[0], 0));
            this.r = Cipher.getInstance(z[20]);
            this.a = Cipher.getInstance(z[24]);
            this.f = Cipher.getInstance(z[25]);
            this.h = Cipher.getInstance(z[13]);
            this.l = Cipher.getInstance(z[21]);
            this.b = Cipher.getInstance(z[8]);
            this.c = Cipher.getInstance(z[19]);
            this.j = Cipher.getInstance(z[14]);
            this.k = Cipher.getInstance(z[6]);
            this.n = Cipher.getInstance(z[1]);
            this.g = Cipher.getInstance(z[17]);
            this.e = Cipher.getInstance(z[15]);
            this.d = Cipher.getInstance(z[2]);
            this.p = Cipher.getInstance(z[27]);
            this.o = Cipher.getInstance(z[10]);
            this.i = Cipher.getInstance(z[22]);
            this.r.init(1, secretKeySpec);
            this.a.init(1, secretKeySpec2);
            this.f.init(1, secretKeySpec3);
            this.h.init(1, secretKeySpec3, ivParameterSpec);
            this.l.init(1, secretKeySpec3, ivParameterSpec);
            this.k.init(2, secretKeySpec);
            this.n.init(2, secretKeySpec2);
            this.g.init(2, secretKeySpec3);
            this.e.init(2, secretKeySpec3, ivParameterSpec);
            this.d.init(2, secretKeySpec3, ivParameterSpec);
            this.m = true;
        } catch (Throwable e) {
            Log.c(z[11], e);
        } catch (Throwable e2) {
            Log.c(z[23], e2);
        } catch (Throwable e22) {
            Log.c(z[4], e22);
        } catch (Throwable e222) {
            Log.c(z[26], e222);
        } catch (Throwable e2222) {
            Log.c(z[12], e2222);
        }
    }

    static {
        String[] strArr = new String[46];
        String str = "Mq\r\u001fm`p-\u0016vtu,U]wnT\u0004{pJ^X";
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
                        i3 = 5;
                        break;
                    case ay.f /*1*/:
                        i3 = 27;
                        break;
                    case ay.n /*2*/:
                        i3 = 99;
                        break;
                    case ay.p /*3*/:
                        i3 = 101;
                        break;
                    default:
                        i3 = 12;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "D^0JOGXL5GFHV5ma\u007f\n\u000bk";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "D^0";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "`u\u0000\u0017uuo\u0006\u0017#kt\u0010\u0010omz\u000f\u0002";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    str = "oN\u00103THuL\u0002i]WZ\u0013|1\\7?}Uh:\r|iA!\u0007B`O";
                    obj = 4;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "D^0";
                    obj = 5;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "D^0";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "D^0JOGXL5GFHV5ma\u007f\n\u000bk";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "D^0";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "D^0JOGXL5GFHV5ma\u007f\n\u000bk";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "`u\u0000\u0017uuo\u0006\u0017#pu\u0010\u0010|ut\u0011\u0011ia~\r\u0006car\r\u0002";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    str = "`u\u0000\u0017uuo\u0006\u0017#lu\u0015\u0004`l\u007f\u0002\tkuz\u0011\u0004a";
                    obj = 11;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "D^0JOQIL+cUz\u0007\u0001ek|";
                    obj = 12;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "D^0JOGXL5GFHV5ma\u007f\n\u000bk";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "D^0JOQIL+cUz\u0007\u0001ek|";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "DH ,E";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "D^0";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "Ok37ZUQU\tT@H%'d4R\u0004\u0003zAw,\u001c\u007fsk67JJW";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "D^0JOGXL5GFHV5ma\u007f\n\u000bk";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "D^0";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "D^0JOGXL5GFHV5ma\u007f\n\u000bk";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "D^0JOGXL5GFHV5ma\u007f\n\u000bk";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "`u\u0000\u0017uuo\u0006\u0017#kt\u0010\u0010omk\u0002\u0001hlu\u0004";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "D^0";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "D^0";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "`u\u0000\u0017uuo\u0006\u0017#lu\u0015\u0004`l\u007f\b\u0000u";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    str = "D^0JOGXL5GFHV5ma\u007f\n\u000bk";
                    obj = 26;
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    strArr2 = strArr3;
                    str = "`u\u0000\u0017uuo\u0006\u0017#a~\u0000\u0017uuoL\fbsz\u000f\fhn~\u001a";
                    obj = 27;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "a~\u0000\u0017uuo\n\nb%u\f\u0011,dm\u0002\f`dy\u000f\u0000";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "D^0";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "D^0";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "`u\u0000\u0017uuo\u0006\u0017#a~\u0000\u0017uuoL\fbsz\u000f\fhdw\u0004\u0015mwz\u000e";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "`u\u0000\u0017uuo\u0006\u0017#a~\u0000\u0017uuoL\fbsz\u000f\fhdw\u0004\u0015mwz\u000e";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "`u\u0000\u0017uuo\u0006\u0017#a~\u0000\u0017uuoL\fbsz\u000f\fhn~\u001a";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "`u\u0000\u0017uuo\u0006\u0017#`u\u0000Jej;";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "`u\u0000\u0017uuo\u0006\u0017#`u\u0000JcpoL\fc%";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "`u\u0000\u0017uuo\n\nb%u\f\u0011,dm\u0002\f`dy\u000f\u0000";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "`u\u0000\u0017uuo\u0006\u0017#`u\u0000\u0017uuoL\fbsz\u000f\fhn~\u001a";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "D^0";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "`u\u0000\u0017uuo\u0006\u0017#`u\u0000JcpoL\fc%";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "`u\u0000\u0017uuo\u0006\u0017#`u\u0000\u0017uuoL\fbsz\u000f\fhn~\u001a";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "`u\u0000\u0017uuo\u0006\u0017#`u\u0000\u0017uuoL\fbsz\u000f\fhdw\u0004\u0015mwz\u000e";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "D^0";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "`u\u0000\u0017uuo\u0006\u0017#`u\u0000\u0017uuoL\fbsz\u000f\fhdw\u0004\u0015mwz\u000e";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "`u\u0000\u0017uuo\u0006\u0017#`u\u0000JcpoL\fc%";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    z = strArr3;
                    q = null;
                default:
                    strArr2[i] = str;
                    str = "D^0";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(InputStream inputStream, OutputStream outputStream, int i, int i2, long j, b3 b3Var, a4 a4Var, byte[] bArr, byte[] bArr2) {
        int i3 = Log.e;
        try {
            if (this.m) {
                InputStream cipherInputStream;
                switch (bi.a[a4Var.ordinal()]) {
                    case ay.f /*1*/:
                        cipherInputStream = new CipherInputStream(inputStream, this.k);
                        if (i3 != 0) {
                            inputStream = cipherInputStream;
                        }
                        break;
                    case ay.n /*2*/:
                        cipherInputStream = new CipherInputStream(inputStream, this.n);
                        if (i3 != 0) {
                            inputStream = cipherInputStream;
                        }
                        break;
                    case ay.p /*3*/:
                        cipherInputStream = new CipherInputStream(inputStream, this.g);
                        if (i3 != 0) {
                            inputStream = cipherInputStream;
                        }
                        break;
                    case aj.i /*4*/:
                        cipherInputStream = new CipherInputStream(inputStream, this.e);
                        if (i3 != 0) {
                            inputStream = cipherInputStream;
                        }
                        break;
                    case aV.r /*5*/:
                        cipherInputStream = new CipherInputStream(inputStream, this.d);
                        if (i3 != 0) {
                            inputStream = cipherInputStream;
                        }
                        break;
                    case aV.i /*6*/:
                    case a8.s /*7*/:
                        Key secretKeySpec = new SecretKeySpec(bArr, z[31]);
                        AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                        try {
                            Cipher cipher;
                            if (a4Var == a4.CRYPT6) {
                                cipher = this.p;
                            } else {
                                cipher = this.o;
                            }
                            cipher.init(2, secretKeySpec, ivParameterSpec);
                            cipherInputStream = new CipherInputStream(inputStream, cipher);
                            break;
                        } catch (InvalidKeyException e) {
                            throw e;
                        } catch (Throwable e2) {
                            Log.c(z[33], e2);
                            if (i3 == 0) {
                                cipherInputStream = inputStream;
                                break;
                            }
                        } catch (Throwable e22) {
                            Log.c(z[28], e22);
                            cipherInputStream = inputStream;
                            break;
                        }
                    case a8.n /*8*/:
                        Key secretKeySpec2 = new SecretKeySpec(bArr, z[30]);
                        AlgorithmParameterSpec ivParameterSpec2 = new IvParameterSpec(bArr2);
                        try {
                            Cipher cipher2 = this.i;
                            cipher2.init(2, secretKeySpec2, ivParameterSpec2);
                            cipherInputStream = new GZIPInputStream(new CipherInputStream(inputStream, cipher2));
                            break;
                        } catch (Throwable e222) {
                            Log.c(z[34], e222);
                            cipherInputStream = inputStream;
                            break;
                        } catch (Throwable e2222) {
                            Log.c(z[32], e2222);
                            cipherInputStream = inputStream;
                            break;
                        }
                    default:
                        cipherInputStream = inputStream;
                        break;
                }
                long j2 = 0;
                while (true) {
                    int read = cipherInputStream.read(this.s);
                    if (read >= 0) {
                        outputStream.write(this.s, 0, read);
                        j2 += (long) read;
                        if (b3Var != null && i2 > 0) {
                            b3Var.a(j2, j, i, i2);
                            if (i3 != 0) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            throw new IllegalStateException(z[29]);
        } catch (InvalidKeyException e3) {
            throw e3;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.io.InputStream r6, java.io.OutputStream r7, com.whatsapp.util.a4 r8, byte[] r9, byte[] r10) {
        /*
        r5_this = this;
        r2 = com.whatsapp.util.Log.e;
        r0 = r5.m;
        if (r0 == 0) goto L_0x0026;
    L_0x0006:
        r0 = com.whatsapp.util.bi.a;	 Catch:{ IOException -> 0x00b9 }
        r1 = r8.ordinal();	 Catch:{ IOException -> 0x00b9 }
        r0 = r0[r1];	 Catch:{ IOException -> 0x00b9 }
        switch(r0) {
            case 1: goto L_0x0034;
            case 2: goto L_0x003e;
            case 3: goto L_0x0048;
            case 4: goto L_0x0052;
            case 5: goto L_0x005c;
            case 6: goto L_0x0066;
            case 7: goto L_0x0066;
            case 8: goto L_0x0089;
            default: goto L_0x0011;
        };	 Catch:{ IOException -> 0x00b9 }
    L_0x0011:
        r0 = r5.s;	 Catch:{ IOException -> 0x00b9 }
        r0 = r6.read(r0);	 Catch:{ IOException -> 0x00b9 }
        if (r0 < 0) goto L_0x0021;
    L_0x0019:
        r1 = r5.s;	 Catch:{ IOException -> 0x00b9 }
        r3 = 0;
        r7.write(r1, r3, r0);	 Catch:{ IOException -> 0x00b9 }
        if (r2 == 0) goto L_0x0011;
    L_0x0021:
        r7.close();	 Catch:{ IOException -> 0x012c }
    L_0x0024:
        if (r2 == 0) goto L_0x016d;
    L_0x0026:
        r0 = new java.lang.IllegalStateException;	 Catch:{ InvalidKeyException -> 0x0032 }
        r1 = z;	 Catch:{ InvalidKeyException -> 0x0032 }
        r2 = 37;
        r1 = r1[r2];	 Catch:{ InvalidKeyException -> 0x0032 }
        r0.<init>(r1);	 Catch:{ InvalidKeyException -> 0x0032 }
        throw r0;	 Catch:{ InvalidKeyException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r0 = new javax.crypto.CipherOutputStream;	 Catch:{ IOException -> 0x00b9 }
        r1 = r5.r;	 Catch:{ IOException -> 0x00b9 }
        r0.<init>(r7, r1);	 Catch:{ IOException -> 0x00b9 }
        if (r2 == 0) goto L_0x017a;
    L_0x003d:
        r7 = r0;
    L_0x003e:
        r0 = new javax.crypto.CipherOutputStream;	 Catch:{ IOException -> 0x00b9 }
        r1 = r5.a;	 Catch:{ IOException -> 0x00b9 }
        r0.<init>(r7, r1);	 Catch:{ IOException -> 0x00b9 }
        if (r2 == 0) goto L_0x0177;
    L_0x0047:
        r7 = r0;
    L_0x0048:
        r0 = new javax.crypto.CipherOutputStream;	 Catch:{ IOException -> 0x00b9 }
        r1 = r5.f;	 Catch:{ IOException -> 0x00b9 }
        r0.<init>(r7, r1);	 Catch:{ IOException -> 0x00b9 }
        if (r2 == 0) goto L_0x0174;
    L_0x0051:
        r7 = r0;
    L_0x0052:
        r0 = new javax.crypto.CipherOutputStream;	 Catch:{ IOException -> 0x00b9 }
        r1 = r5.h;	 Catch:{ IOException -> 0x00b9 }
        r0.<init>(r7, r1);	 Catch:{ IOException -> 0x00b9 }
        if (r2 == 0) goto L_0x0171;
    L_0x005b:
        r7 = r0;
    L_0x005c:
        r0 = new javax.crypto.CipherOutputStream;	 Catch:{ IOException -> 0x00b9 }
        r1 = r5.l;	 Catch:{ IOException -> 0x00b9 }
        r0.<init>(r7, r1);	 Catch:{ IOException -> 0x00b9 }
        if (r2 == 0) goto L_0x016e;
    L_0x0065:
        r7 = r0;
    L_0x0066:
        r3 = new javax.crypto.spec.IvParameterSpec;	 Catch:{ IOException -> 0x00b9 }
        r3.<init>(r10);	 Catch:{ IOException -> 0x00b9 }
        r4 = new javax.crypto.spec.SecretKeySpec;	 Catch:{ IOException -> 0x00b9 }
        r0 = z;	 Catch:{ IOException -> 0x00b9 }
        r1 = 43;
        r0 = r0[r1];	 Catch:{ IOException -> 0x00b9 }
        r4.<init>(r9, r0);	 Catch:{ IOException -> 0x00b9 }
        r0 = com.whatsapp.util.a4.CRYPT6;	 Catch:{ InvalidKeyException -> 0x00ac, InvalidAlgorithmParameterException -> 0x0103 }
        if (r8 != r0) goto L_0x00fe;
    L_0x007a:
        r0 = r5.b;	 Catch:{ InvalidKeyException -> 0x00ac, InvalidAlgorithmParameterException -> 0x0103 }
        r1 = r0;
    L_0x007d:
        r0 = 1;
        r1.init(r0, r4, r3);	 Catch:{ InvalidKeyException -> 0x00ae, InvalidAlgorithmParameterException -> 0x0103 }
        r0 = new javax.crypto.CipherOutputStream;	 Catch:{ InvalidKeyException -> 0x00ae, InvalidAlgorithmParameterException -> 0x0103 }
        r0.<init>(r7, r1);	 Catch:{ InvalidKeyException -> 0x00ae, InvalidAlgorithmParameterException -> 0x0103 }
        r7 = r0;
    L_0x0087:
        if (r2 == 0) goto L_0x0011;
    L_0x0089:
        r0 = new javax.crypto.spec.IvParameterSpec;	 Catch:{ IOException -> 0x00b9 }
        r0.<init>(r10);	 Catch:{ IOException -> 0x00b9 }
        r1 = new javax.crypto.spec.SecretKeySpec;	 Catch:{ IOException -> 0x00b9 }
        r3 = z;	 Catch:{ IOException -> 0x00b9 }
        r4 = 39;
        r3 = r3[r4];	 Catch:{ IOException -> 0x00b9 }
        r1.<init>(r9, r3);	 Catch:{ IOException -> 0x00b9 }
        r3 = r5.j;	 Catch:{ InvalidKeyException -> 0x0114, InvalidAlgorithmParameterException -> 0x0120 }
        r4 = 1;
        r3.init(r4, r1, r0);	 Catch:{ InvalidKeyException -> 0x0114, InvalidAlgorithmParameterException -> 0x0120 }
        r0 = new java.util.zip.GZIPOutputStream;	 Catch:{ InvalidKeyException -> 0x0114, InvalidAlgorithmParameterException -> 0x0120 }
        r1 = new javax.crypto.CipherOutputStream;	 Catch:{ InvalidKeyException -> 0x0114, InvalidAlgorithmParameterException -> 0x0120 }
        r1.<init>(r7, r3);	 Catch:{ InvalidKeyException -> 0x0114, InvalidAlgorithmParameterException -> 0x0120 }
        r0.<init>(r1);	 Catch:{ InvalidKeyException -> 0x0114, InvalidAlgorithmParameterException -> 0x0120 }
        r7 = r0;
        goto L_0x0011;
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ InvalidKeyException -> 0x00ae, InvalidAlgorithmParameterException -> 0x0103 }
    L_0x00ae:
        r0 = move-exception;
        r1 = z;	 Catch:{ IOException -> 0x00b9 }
        r3 = 41;
        r1 = r1[r3];	 Catch:{ IOException -> 0x00b9 }
        com.whatsapp.util.Log.c(r1, r0);	 Catch:{ IOException -> 0x00b9 }
        goto L_0x0087;
    L_0x00b9:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x010f }
        r1.<init>();	 Catch:{ all -> 0x010f }
        r3 = z;	 Catch:{ all -> 0x010f }
        r4 = 35;
        r3 = r3[r4];	 Catch:{ all -> 0x010f }
        r1 = r1.append(r3);	 Catch:{ all -> 0x010f }
        r0 = r0.toString();	 Catch:{ all -> 0x010f }
        r0 = r1.append(r0);	 Catch:{ all -> 0x010f }
        r0 = r0.toString();	 Catch:{ all -> 0x010f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x010f }
        r7.close();	 Catch:{ IOException -> 0x00dd }
        goto L_0x0024;
    L_0x00dd:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 45;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0024;
    L_0x00fe:
        r0 = r5.c;	 Catch:{ InvalidKeyException -> 0x00ae, InvalidAlgorithmParameterException -> 0x0103 }
        r1 = r0;
        goto L_0x007d;
    L_0x0103:
        r0 = move-exception;
        r1 = z;	 Catch:{ IOException -> 0x00b9 }
        r3 = 42;
        r1 = r1[r3];	 Catch:{ IOException -> 0x00b9 }
        com.whatsapp.util.Log.c(r1, r0);	 Catch:{ IOException -> 0x00b9 }
        goto L_0x0087;
    L_0x010f:
        r0 = move-exception;
        r7.close();	 Catch:{ IOException -> 0x014d }
    L_0x0113:
        throw r0;
    L_0x0114:
        r0 = move-exception;
        r1 = z;	 Catch:{ IOException -> 0x00b9 }
        r3 = 38;
        r1 = r1[r3];	 Catch:{ IOException -> 0x00b9 }
        com.whatsapp.util.Log.c(r1, r0);	 Catch:{ IOException -> 0x00b9 }
        goto L_0x0011;
    L_0x0120:
        r0 = move-exception;
        r1 = z;	 Catch:{ IOException -> 0x00b9 }
        r3 = 44;
        r1 = r1[r3];	 Catch:{ IOException -> 0x00b9 }
        com.whatsapp.util.Log.c(r1, r0);	 Catch:{ IOException -> 0x00b9 }
        goto L_0x0011;
    L_0x012c:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 40;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0024;
    L_0x014d:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 36;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0113;
    L_0x016d:
        return;
    L_0x016e:
        r7 = r0;
        goto L_0x0011;
    L_0x0171:
        r7 = r0;
        goto L_0x0011;
    L_0x0174:
        r7 = r0;
        goto L_0x0011;
    L_0x0177:
        r7 = r0;
        goto L_0x0011;
    L_0x017a:
        r7 = r0;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.t.a(java.io.InputStream, java.io.OutputStream, com.whatsapp.util.a4, byte[], byte[]):void");
    }
}
