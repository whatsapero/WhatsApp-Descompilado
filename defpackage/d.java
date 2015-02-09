package defpackage;

import com.whatsapp.vk;
import java.util.Arrays;
import java.util.HashSet;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class d extends c {
    private static final HashSet A;
    private static final HashSet B;
    private static final HashSet C;
    private static final String[] E;
    private String D;

    protected String c(String str) {
        int i = o.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        do {
            String a = a();
            if (a != null) {
                if (a.length() == 0 && i == 0) {
                    break;
                }
                if (!(a.startsWith(" ") || a.startsWith("\t"))) {
                    this.D = a;
                    if (i == 0) {
                        break;
                    }
                }
                stringBuilder.append(a);
            } else {
                throw new g(E[3]);
            }
        } while (i == 0);
        return stringBuilder.toString();
    }

    protected void l(String str) {
        throw new g(E[10]);
    }

    protected void c(String str, String str2) {
        super.c(str, str2);
    }

    protected boolean b(boolean z) {
        return super.b(z);
    }

    protected String b(char c) {
        return (c == 'n' || c == 'N') ? E[6] : String.valueOf(c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.String j(java.lang.String r9) {
        /*
        r8_this = this;
        r1 = 0;
        r2 = defpackage.o.a;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = r9.length();
        r0 = r1;
    L_0x000d:
        if (r0 >= r4) goto L_0x003e;
    L_0x000f:
        r5 = r9.charAt(r0);
        r6 = 92;
        if (r5 != r6) goto L_0x0037;
    L_0x0017:
        r6 = r4 + -1;
        if (r0 >= r6) goto L_0x0037;
    L_0x001b:
        r0 = r0 + 1;
        r6 = r9.charAt(r0);
        r7 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        if (r6 == r7) goto L_0x0029;
    L_0x0025:
        r7 = 78;
        if (r6 != r7) goto L_0x0032;
    L_0x0029:
        r7 = E;
        r7 = r7[r1];
        r3.append(r7);
        if (r2 == 0) goto L_0x0035;
    L_0x0032:
        r3.append(r6);
    L_0x0035:
        if (r2 == 0) goto L_0x003a;
    L_0x0037:
        r3.append(r5);
    L_0x003a:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x000d;
    L_0x003e:
        r0 = r3.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.j(java.lang.String):java.lang.String");
    }

    protected boolean k(String str) {
        if (!(A.contains(str) || B.contains(str) || str.startsWith(E[4]) || this.m.contains(str))) {
            this.m.add(str);
        }
        return true;
    }

    protected String c() {
        return E[5];
    }

    protected void h(String str) {
        try {
            super.h(str);
        } catch (g e) {
            throw e;
        } catch (g e2) {
            String[] split = str.split("=", 2);
            if (split.length == 2) {
                c(split[0], split[1]);
                if (o.a == 0) {
                    return;
                }
            }
            throw new g(E[9] + str);
        } catch (g e3) {
            throw e3;
        }
    }

    static {
        String[] strArr = new String[42];
        String str = ">\u000b";
        int i = -1;
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
                        i4 = 51;
                        break;
                    case ay.f /*1*/:
                        i4 = 1;
                        break;
                    case ay.n /*2*/:
                        i4 = 120;
                        break;
                    case ay.p /*3*/:
                        i4 = 81;
                        break;
                    default:
                        i4 = 53;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "`q\u00192P\u0013d\u00008FGrX0A\u0013u\u00104\u0015Qd\u001f8[]h\u00166\u0015\\gX%]V!\u00148[V";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "uh\u00144\u0015Vo\u001c4Q\u0013e\r#\\]fX!TAr\u0011?R\u0013C9\u0002p\u00055X3\\]`\n(";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "k,";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u0000/H";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = ">\u000b";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "h^\\p\tO?Yujn";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "gX(\u0014";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "fo\u0013?ZDoX!TA`\u0015\"\u0015E`\u0014$P\t!";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "rF=\u001fa\u0013h\u0016qCp`\n5\u0015\u0000/Hq\\@!\u0016>A\u0013r\r!E\\s\f4Q\u0013x\u001d%\u001b";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u007fN?\u001e";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "q@+\u0014\u0003\u0007";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "pM9\u0002f";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "`N*\u0005\u0018`U*\u0018{t";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "~@1\u001dpa";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "}H;\u001a{rL=";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "`N-\u001fq";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "gD4";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "aD.";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "cI7\u0005z";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "\u000bC1\u0005";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "fS4";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "cS7\u0015|w";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "vL9\u0018y";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "\u0004C1\u0005";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "qD?\u0018{";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "}N,\u0014";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "aN4\u0014";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "}@5\u0014";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "qE9\b";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "gH,\u001dp";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "\u007f@:\u0014y";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "xD!";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "cS7\u0017|\u007fD";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "p@,\u0014r|S1\u0014f";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "uO";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "eD*\u0002||O";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "fH<";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "`N-\u0003vv";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "g[";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "tD7";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    E = strArr3;
                    A = new HashSet(Arrays.asList(new String[]{E[26], E[11], E[20], E[32], E[36], E[31], E[17], E[37], E[18], E[24], E[40], E[41], E[27], E[22], E[30], E[28], E[19], E[38], E[33], E[15], E[29], E[34], E[39], E[16], E[13], E[14], E[35], E[23]}));
                    C = new HashSet(Arrays.asList(new String[]{E[25], E[21], E[12], "B"}));
                    B = new HashSet();
                default:
                    strArr2[i2] = str;
                    str = "ad\u00192]VeX4[W!\u00177\u0015Qt\u001e7PA/";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    protected void a(boolean z, boolean z2) {
        super.a(z, z2);
    }

    protected boolean m(String str) {
        return C.contains(str.toUpperCase());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void d(java.lang.String r9) {
        /*
        r8_this = this;
        r1 = defpackage.o.a;
        r0 = ",";
        r2 = r9.split(r0);
        r0 = r8.d;
        r3 = E;
        r4 = 8;
        r3 = r3[r4];
        r0.d(r3);
        r3 = r2.length;
        r0 = 0;
    L_0x0015:
        if (r0 >= r3) goto L_0x0056;
    L_0x0017:
        r4 = r2[r0];
        r5 = r4.length();
        r6 = 2;
        if (r5 < r6) goto L_0x0042;
    L_0x0020:
        r5 = "\"";
        r5 = r4.startsWith(r5);
        if (r5 == 0) goto L_0x0042;
    L_0x0028:
        r5 = "\"";
        r5 = r4.endsWith(r5);
        if (r5 == 0) goto L_0x0042;
    L_0x0030:
        r5 = r8.d;
        r6 = 1;
        r7 = r4.length();
        r7 = r7 + -1;
        r6 = r4.substring(r6, r7);
        r5.c(r6);
        if (r1 == 0) goto L_0x0052;
    L_0x0042:
        r5 = r8.d;
        r6 = E;
        r7 = 7;
        r6 = r6[r7];
        r7 = "";
        r4 = r4.replaceAll(r6, r7);
        r5.c(r4);
    L_0x0052:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0015;
    L_0x0056:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.d(java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.String e() {
        /*
        r8_this = this;
        r7 = 1;
        r6 = 0;
        r1 = 0;
        r2 = defpackage.o.a;
        r0 = defpackage.c.j;
        if (r0 == 0) goto L_0x000e;
    L_0x0009:
        defpackage.c.j = r6;
        r0 = defpackage.c.b;
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = r1;
    L_0x000f:
        r3 = r8.f;
        r3 = r3.readLine();
        if (r3 != 0) goto L_0x0031;
    L_0x0017:
        if (r0 == 0) goto L_0x001e;
    L_0x0019:
        r0 = r0.toString();
        goto L_0x000d;
    L_0x001e:
        r0 = r8.D;
        if (r0 == 0) goto L_0x0027;
    L_0x0022:
        r0 = r8.D;
        r8.D = r1;
        goto L_0x000d;
    L_0x0027:
        r0 = new g;
        r1 = E;
        r1 = r1[r7];
        r0.<init>(r1);
        throw r0;
    L_0x0031:
        r4 = r3.length();
        if (r4 != 0) goto L_0x0047;
    L_0x0037:
        if (r0 == 0) goto L_0x003e;
    L_0x0039:
        r0 = r0.toString();
        goto L_0x000d;
    L_0x003e:
        r3 = r8.D;
        if (r3 == 0) goto L_0x000f;
    L_0x0042:
        r0 = r8.D;
        r8.D = r1;
        goto L_0x000d;
    L_0x0047:
        r4 = r3.charAt(r6);
        r5 = 32;
        if (r4 == r5) goto L_0x0057;
    L_0x004f:
        r4 = r3.charAt(r6);
        r5 = 9;
        if (r4 != r5) goto L_0x0086;
    L_0x0057:
        if (r0 == 0) goto L_0x0062;
    L_0x0059:
        r4 = r3.substring(r7);
        r0.append(r4);
        if (r2 == 0) goto L_0x000f;
    L_0x0062:
        r0 = r8.D;
        if (r0 == 0) goto L_0x007b;
    L_0x0066:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = r8.D;
        r0.append(r4);
        r8.D = r1;
        r3 = r3.substring(r7);
        r0.append(r3);
        if (r2 == 0) goto L_0x000f;
    L_0x007b:
        r0 = new g;
        r1 = E;
        r2 = 2;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0086:
        r4 = r8.D;
        if (r4 != 0) goto L_0x0094;
    L_0x008a:
        r8.D = r3;
        if (r0 == 0) goto L_0x000f;
    L_0x008e:
        r0 = r0.toString();
        goto L_0x000d;
    L_0x0094:
        r0 = r8.D;
        r8.D = r3;
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.e():java.lang.String");
    }

    protected String a() {
        if (this.D == null) {
            return this.f.readLine();
        }
        String str = this.D;
        this.D = null;
        return str;
    }
}
