package defpackage;

import com.whatsapp.util.Log;
import com.whatsapp.vk;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class c {
    private static final String[] A;
    static String b;
    private static final HashSet g;
    private static final HashSet i;
    static boolean j;
    private static final HashSet k;
    private static final HashSet s;
    private long a;
    private long c;
    protected e d;
    private long e;
    protected BufferedReader f;
    private int h;
    private String l;
    protected HashSet m;
    private long n;
    protected String o;
    private long p;
    protected final String q;
    private long r;
    private boolean t;
    private long u;
    private long v;
    private long w;
    private long x;
    private long y;
    private long z;

    public boolean a(InputStream inputStream, String str, e eVar) {
        this.f = new r(new InputStreamReader(inputStream, str));
        this.d = eVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.d != null) {
            this.d.a();
        }
        b();
        if (this.d != null) {
            this.d.e();
        }
        this.y = (System.currentTimeMillis() - currentTimeMillis) + this.y;
        return true;
    }

    protected boolean k(String str) {
        if (!(i.contains(str.toUpperCase()) || str.startsWith(A[68]) || this.m.contains(str))) {
            this.m.add(str);
            Log.w(A[67] + str);
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String i(java.lang.String r7) {
        /*
        r6_this = this;
        r2 = defpackage.o.a;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r1 = 64;
        r0 = ".";
        r0 = r7.indexOf(r0);
        r0 = r0 + 1;
    L_0x0011:
        r4 = r7.length();
        if (r0 >= r4) goto L_0x004b;
    L_0x0017:
        r4 = r7.charAt(r0);
        r5 = 65;
        if (r4 < r5) goto L_0x0034;
    L_0x001f:
        r4 = r7.charAt(r0);
        r5 = 90;
        if (r4 > r5) goto L_0x0034;
    L_0x0027:
        r1 = r7.charAt(r0);
        r3.append(r1);
        r1 = r7.charAt(r0);
        if (r2 == 0) goto L_0x0047;
    L_0x0034:
        r4 = r7.charAt(r0);
        r5 = 45;
        if (r4 != r5) goto L_0x004b;
    L_0x003c:
        r4 = 88;
        if (r1 != r4) goto L_0x004b;
    L_0x0040:
        r4 = r7.charAt(r0);
        r3.append(r4);
    L_0x0047:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0011;
    L_0x004b:
        r0 = r3.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.i(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean b(boolean r9) {
        /*
        r8_this = this;
        r7 = 2;
        r1 = 1;
        r0 = 0;
    L_0x0003:
        r2 = r8.a();
        if (r2 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r3 = r2.trim();
        r3 = r3.length();
        if (r3 <= 0) goto L_0x0003;
    L_0x0014:
        r3 = ":";
        r3 = r2.split(r3, r7);
        r4 = r3.length;
        if (r4 != r7) goto L_0x0043;
    L_0x001d:
        r4 = r3[r0];
        r4 = r4.trim();
        r5 = A;
        r6 = 32;
        r5 = r5[r6];
        r4 = r4.equalsIgnoreCase(r5);
        if (r4 == 0) goto L_0x0043;
    L_0x002f:
        r3 = r3[r1];
        r3 = r3.trim();
        r4 = A;
        r5 = 30;
        r4 = r4[r5];
        r3 = r3.equalsIgnoreCase(r4);
        if (r3 == 0) goto L_0x0043;
    L_0x0041:
        r0 = r1;
        goto L_0x0009;
    L_0x0043:
        if (r9 != 0) goto L_0x0073;
    L_0x0045:
        r1 = r8.h;
        if (r1 <= 0) goto L_0x004c;
    L_0x0049:
        r8.l = r2;
        goto L_0x0009;
    L_0x004c:
        r0 = new g;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = A;
        r4 = 31;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r2);
        r2 = A;
        r3 = 34;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0073:
        if (r9 != 0) goto L_0x0003;
    L_0x0075:
        r0 = new g;
        r1 = A;
        r2 = 33;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.b(boolean):boolean");
    }

    public c() {
        this.d = null;
        this.o = null;
        this.q = A[29];
        this.m = new HashSet();
    }

    static {
        String[] strArr = new String[151];
        String str = ")C+";
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
                        i3 = 102;
                        break;
                    case ay.f /*1*/:
                        i3 = 17;
                        break;
                    case ay.n /*2*/:
                        i3 = 108;
                        break;
                    case ay.p /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 126;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "^S%]";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "'V)G*";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "$T+@0";
                    i = 4;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "0T>Z7)_";
                    z = true;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "/\u007f\u001ah\u0012\u000fuLe\u0017\btL+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "'U>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "3\u007f\u0007g\u0011\u0011\u007fLK;!X\")\n\u001fa\t3^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "3\u007f\u0007g\u0011\u0011\u007fLy\f\ta\t{\n\u001f1\u0002h\u0013\u0003+L+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "/\u007f\u000ff\u0013\u0016p\u0018`\u001c\ntL\u007f\u001b\u0014b\u0005f\u0010\\1";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "0R-[:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "F0Q)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "7D#];\"<<[7(E-K2#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "'U>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "0R-[:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "#i\u001cl\u001d\u0012t\b);(UV_='C()\t\u0007bLg\u0011\u00121\nf\u000b\buB";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "0R-[:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "#_(3(%P>M^G,L+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "#_(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "4t\rj\u0016\u0003uLl\u0010\u00021\u0003o^\u0004d\no\u001b\u0014?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "$P?LHR";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "2y\t)\u001b\br\u0003m\u0017\bvL|\u0010\u0015d\u001cy\u0011\u0014e\tm^\u0004hL\u007f=\u0007c\b)\r\u0016t\u000f3^D";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0010r\r{\u001a\u0016p\u001ez\u001b\u0014>\u0003|\nK~\n$\u0013\u0003|\u0003{\u0007F";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "D?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "QS%]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "^S%]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "><";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "7D#];\"<<[7(E-K2#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "^S%]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "0R-[:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "#i\u001cl\u001d\u0012t\b)-\u0012c\u0005g\u0019F3.L9/_V_='C(+^\u0002x\b)\u0010\teLj\u0011\u000btL!7\bb\u0018l\u001f\u0002=L+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "$T+@0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "4t\rj\u0016\u0003uL~\u0016\u0003c\t)\u0013\u0013b\u0018)\u0010\teLk\u001bFc\th\u001d\u000et\b'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "D1\u000fh\u0013\u00038";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "2H<L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "0P \\;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "><";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "#_/F:/_+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "%Y-[-#E";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "*P\"N+'V)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "3\u007f\u0007g\u0011\u0011\u007fL}\u0007\u0016tL+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "><-K?\"C";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "#_(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "/\u007f\u001ah\u0012\u000fuLe\u0017\btV)\\";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u000fe\td";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "#_(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "'U>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0012h\u001cl";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "N\u001cfus\u001a\u001b\u0010\u0003sO";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "T?]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "'V)G*FA\u001ef\u000e\u0003c\u0018p^\u000fbLg\u0011\u00121\u001f|\u000e\u0016~\u001e}\u001b\u0002?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "*P\"N+'V)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "/\u007f\u001ah\u0012\u000fuLE\u001f\bv\u0019h\u0019\u0003+L+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "/\u007f\u001ah\u0012\u000fuLE\u001f\bv\u0019h\u0019\u0003+L+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "/\u007f\u001ah\u0012\u000fuLE\u001f\bv\u0019h\u0019\u0003+L+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "><";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "3\u007f\u0007g\u0011\u0011\u007fL\u007f\u001f\nd\t)\\";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "0P \\;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = " x\u0000l^\u0003\u007f\bl\u001aFu\u0019{\u0017\bvLy\u001f\u0014b\u0005g\u0019FS-Z;P%Lk\u0017\bp\u001ep";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "%Y-[-#E";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "#_/F:/_+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "><";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "3\u007f\u0007g\u0011\u0011\u007fLl\u0010\u0005~\b`\u0010\u00011N";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "2h\u001cl^\u0013\u007f\u001f|\u000e\u0016~\u001e}\u001b\u00021\u000ep^\u0010R\r{\u001aF#B8DF";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "><";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "2H<L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "6c\u0003y\u001b\u0014e\u0015)\u0010\u0007|\t)\u000b\bb\u0019y\u000e\tc\u0018l\u001aFs\u0015)\b%p\u001em^T?]3^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "><";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 69;
                    str = "k\u001b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 70;
                    str = "k\u001b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 71;
                    str = " x\u0000l^\u0003\u007f\bl\u001aFu\u0019{\u0017\bvLy\u001f\u0014b\u0005g\u0019F`\u0019f\n\u0003uAy\f\u000f\u007f\u0018h\u001c\ntLZ\n\u0014x\u0002n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 72;
                    str = "4t\rj\u0016\u0003uLl\u0010\u00021\u0003o^\u0004d\no\u001b\u0014?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 73;
                    str = "1\\*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 74;
                    str = "$\\<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 75;
                    str = "2X*O";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 76;
                    str = "QS%]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 77;
                    str = "/S!D?/]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 78;
                    str = "6\\.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 79;
                    str = "6U*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 80;
                    str = "+B+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 81;
                    str = "%V!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 82;
                    str = "^S%]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 83;
                    str = "6P>J;*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 84;
                    str = "4^ L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 85;
                    str = "'A<E;*X\"B";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 86;
                    str = "+R%D?/]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 87;
                    str = "3C ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 88;
                    str = "2X8E;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 89;
                    str = "$S?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 90;
                    str = "6^;L,5Y-[;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 91;
                    str = ">%\\9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 92;
                    str = "!X*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 93;
                    str = "$T+@0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 94;
                    str = "1^>B";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 95;
                    str = "2T ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 96;
                    str = "!T#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 97;
                    str = "7E%D;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 98;
                    str = "5^9G:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 99;
                    str = " P4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 100;
                    str = "0^%J;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 101;
                    str = "%^\"];(EA@:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 102;
                    str = "%X(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 103;
                    str = "\"^!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 104;
                    str = "6P+L,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 105;
                    str = ">$\\0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 106;
                    str = "-T5";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 107;
                    str = "$P?LHR";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 108;
                    str = "#\\-@2";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 109;
                    str = "0X(L1";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 110;
                    str = "/_8L,(T8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 111;
                    str = "%X?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 112;
                    str = "(^8L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 113;
                    str = "\"X.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 114;
                    str = "/_ @0#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 115;
                    str = ".^!L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 116;
                    str = "6R!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 117;
                    str = "'E8D?/]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 118;
                    str = "6Y#]1";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 119;
                    str = "0T>Z7)_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 120;
                    str = "3X(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 121;
                    str = "/_8E";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 122;
                    str = "'G%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 123;
                    str = "%T E";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 124;
                    str = "/B(G";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 125;
                    str = "2K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 126;
                    str = "6B";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 127;
                    str = "+A)NL";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 128;
                    str = "'^ ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 129;
                    str = "4T:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 130;
                    str = "1P:L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 131;
                    str = "+^(L3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 132;
                    str = "2]4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 133;
                    str = "+T8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 134;
                    str = ",A)N";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 135;
                    str = "*^+F";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 136;
                    str = "3C ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 137;
                    str = "%P>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 138;
                    str = "+A)N";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 139;
                    str = "*P.L2";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 140;
                    str = "6C)O";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 141;
                    str = "$U-P";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 142;
                    str = "6X/]";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 143;
                    str = "6V<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 144;
                    str = "#F#[2\"";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 145;
                    str = "'X*O";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 146;
                    str = "+P%E;4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 147;
                    str = "6^?]?*";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 148;
                    str = " _";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 149;
                    str = "6C#M7!H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 150;
                    str = "7D#];\"<<[7(E-K2#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    A = strArr3;
                    k = new HashSet(Arrays.asList(new String[]{A[103], A[121], A[147], A[83], A[115], A[94], A[140], A[100], A[99], A[80], A[123], A[104], A[89], A[131], A[137], A[124], A[109], A[128], A[85], A[117], A[111], A[144], A[110], A[77], A[86], A[90], A[149], A[132], A[91], A[92], A[81], A[73], A[74], A[133], A[78], A[113], A[142], A[75], A[79], A[126], A[134], A[97], A[138], A[127], A[122], A[130], A[145], A[116], A[105], A[143]}));
                    g = new HashSet(Arrays.asList(new String[]{A[114], A[87], A[101], A[102]}));
                    i = new HashSet(Arrays.asList(new String[]{A[93], A[135], A[118], A[139], A[148], A[88], A[98], A[119], A[95], A[108], A[125], A[96], A[112], A[136], A[141], A[84], A[129], A[120], A[106], A[146]}));
                    s = new HashSet(Arrays.asList(new String[]{A[76], A[82], A[150], A[107], "B"}));
                    j = false;
                default:
                    strArr2[i] = str;
                    str = "2y\u0005z^\u0010R\r{\u001aFy\rz^\bt\u001f}\u001b\u00021\u001aJ\u001f\u0014uLm\u001f\u0012pL`\u0010Fx\u0018'";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void b() {
        /*
        r6_this = this;
        r1 = 1;
        r2 = 0;
        r4 = defpackage.o.a;
        r0 = r1;
    L_0x0005:
        r3 = r6.t;
        if (r3 == 0) goto L_0x000b;
    L_0x0009:
        if (r4 == 0) goto L_0x0015;
    L_0x000b:
        r0 = r6.a(r0);
        if (r0 != 0) goto L_0x0013;
    L_0x0011:
        if (r4 == 0) goto L_0x0015;
    L_0x0013:
        if (r4 == 0) goto L_0x0029;
    L_0x0015:
        r0 = r6.h;
        if (r0 <= 0) goto L_0x0026;
    L_0x0019:
        r0 = r2;
        r3 = r1;
    L_0x001b:
        r5 = r6.h;
        if (r0 >= r5) goto L_0x0026;
    L_0x001f:
        r6.a(r3, r1);
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x0027;
    L_0x0026:
        return;
    L_0x0027:
        r3 = r2;
        goto L_0x001b;
    L_0x0029:
        r0 = r2;
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.b():void");
    }

    protected String e() {
        if (j) {
            j = false;
            return b;
        }
        String a = a();
        if (a != null) {
            return a.trim().length() <= 0 ? null : a;
        } else {
            throw new g(A[20]);
        }
    }

    protected void a(String str) {
        int i = 0;
        int i2 = o.a;
        String[] split = str.split("-");
        if (split.length > 2) {
            throw new g(A[53] + str + "\"");
        }
        String str2 = split[0];
        int length = str2.length();
        int i3 = 0;
        while (i3 < length) {
            if (a(str2.charAt(i3))) {
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            throw new g(A[55] + str + "\"");
        }
        if (split.length > 1) {
            String str3 = split[1];
            int length2 = str3.length();
            while (i < length2) {
                if (a(str3.charAt(i))) {
                    i++;
                    if (i2 != 0) {
                        break;
                    }
                }
                throw new g(A[54] + str + "\"");
            }
        }
        if (this.d != null) {
            this.d.d(A[52]);
            this.d.c(str);
        }
    }

    protected void d() {
        int i = o.a;
        if (this.d != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.d.c();
            this.r = (System.currentTimeMillis() - currentTimeMillis) + this.r;
        }
        boolean g = g();
        if (!(this.d == null || g)) {
            currentTimeMillis = System.currentTimeMillis();
            this.d.b();
            this.u = (System.currentTimeMillis() - currentTimeMillis) + this.u;
        }
        while (!g) {
            if (this.d != null) {
                currentTimeMillis = System.currentTimeMillis();
                this.d.c();
                this.r = (System.currentTimeMillis() - currentTimeMillis) + this.r;
            }
            g = g();
            if (!(this.d == null || g)) {
                currentTimeMillis = System.currentTimeMillis();
                this.d.b();
                this.u = (System.currentTimeMillis() - currentTimeMillis) + this.u;
                if (i != 0) {
                    return;
                }
            }
        }
    }

    private boolean a(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    protected String j(String str) {
        return str;
    }

    protected void e(String str) {
        if (m(str) || str.startsWith(A[62])) {
            if (this.d != null) {
                this.d.d(A[61]);
                this.d.c(str);
            }
            this.o = str;
            if (o.a == 0) {
                return;
            }
        }
        throw new g(A[63] + str + "\"");
    }

    protected String b(char c) {
        return (c == '\\' || c == ';' || c == ':' || c == ',') ? String.valueOf(c) : null;
    }

    protected String n(String str) {
        int i = o.a;
        if (!str.trim().endsWith("=")) {
            return str;
        }
        String a;
        int length = str.length() - 1;
        do {
        } while (str.charAt(length) != '=');
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.substring(0, length + 1));
        stringBuilder.append(A[70]);
        do {
            a = a();
            if (a != null) {
                if (!a.trim().endsWith("=")) {
                    break;
                }
                int length2 = a.length() - 1;
                do {
                } while (a.charAt(length2) != '=');
                stringBuilder.append(a.substring(0, length2 + 1));
                stringBuilder.append(A[69]);
            } else {
                throw new g(A[71]);
            }
        } while (i == 0);
        stringBuilder.append(a);
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void b(java.lang.String r9, java.lang.String r10) {
        /*
        r8_this = this;
        r1 = defpackage.o.a;
        r0 = r8.o;
        r2 = A;
        r3 = 28;
        r2 = r2[r3];
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 == 0) goto L_0x0036;
    L_0x0010:
        r2 = java.lang.System.currentTimeMillis();
        r0 = r8.n(r10);
        r4 = r8.d;
        if (r4 == 0) goto L_0x0029;
    L_0x001c:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r4.add(r0);
        r0 = r8.d;
        r0.a(r4);
    L_0x0029:
        r4 = r8.z;	 Catch:{ OutOfMemoryError -> 0x00f1 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ OutOfMemoryError -> 0x00f1 }
        r2 = r6 - r2;
        r2 = r2 + r4;
        r8.z = r2;	 Catch:{ OutOfMemoryError -> 0x00f1 }
        if (r1 == 0) goto L_0x00f0;
    L_0x0036:
        r0 = r8.o;	 Catch:{ OutOfMemoryError -> 0x00f1 }
        r2 = A;	 Catch:{ OutOfMemoryError -> 0x00f1 }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ OutOfMemoryError -> 0x00f1 }
        r0 = r0.equalsIgnoreCase(r2);	 Catch:{ OutOfMemoryError -> 0x00f1 }
        if (r0 != 0) goto L_0x004e;
    L_0x0044:
        r0 = r8.o;	 Catch:{ OutOfMemoryError -> 0x00f3 }
        r2 = "B";
        r0 = r0.equalsIgnoreCase(r2);	 Catch:{ OutOfMemoryError -> 0x00f3 }
        if (r0 == 0) goto L_0x0074;
    L_0x004e:
        r2 = java.lang.System.currentTimeMillis();
        r0 = r8.c(r10);	 Catch:{ OutOfMemoryError -> 0x00f5 }
        r4 = r8.d;	 Catch:{ OutOfMemoryError -> 0x00f5 }
        if (r4 == 0) goto L_0x0067;
    L_0x005a:
        r4 = new java.util.ArrayList;	 Catch:{ OutOfMemoryError -> 0x00f5 }
        r4.<init>();	 Catch:{ OutOfMemoryError -> 0x00f5 }
        r4.add(r0);	 Catch:{ OutOfMemoryError -> 0x00f5 }
        r0 = r8.d;	 Catch:{ OutOfMemoryError -> 0x00f5 }
        r0.a(r4);	 Catch:{ OutOfMemoryError -> 0x00f5 }
    L_0x0067:
        r4 = r8.c;	 Catch:{ OutOfMemoryError -> 0x0122 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ OutOfMemoryError -> 0x0122 }
        r2 = r6 - r2;
        r2 = r2 + r4;
        r8.c = r2;	 Catch:{ OutOfMemoryError -> 0x0122 }
        if (r1 == 0) goto L_0x00f0;
    L_0x0074:
        r0 = r8.o;	 Catch:{ OutOfMemoryError -> 0x0124 }
        if (r0 == 0) goto L_0x00cc;
    L_0x0078:
        r0 = r8.o;	 Catch:{ OutOfMemoryError -> 0x0126 }
        r1 = A;	 Catch:{ OutOfMemoryError -> 0x0126 }
        r2 = 25;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x0126 }
        r0 = r0.equalsIgnoreCase(r1);	 Catch:{ OutOfMemoryError -> 0x0126 }
        if (r0 != 0) goto L_0x00cc;
    L_0x0086:
        r0 = r8.o;	 Catch:{ OutOfMemoryError -> 0x0128 }
        r1 = A;	 Catch:{ OutOfMemoryError -> 0x0128 }
        r2 = 26;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x0128 }
        r0 = r0.equalsIgnoreCase(r1);	 Catch:{ OutOfMemoryError -> 0x0128 }
        if (r0 != 0) goto L_0x00cc;
    L_0x0094:
        r0 = r8.o;	 Catch:{ OutOfMemoryError -> 0x012a }
        r0 = r0.toUpperCase();	 Catch:{ OutOfMemoryError -> 0x012a }
        r1 = A;	 Catch:{ OutOfMemoryError -> 0x012a }
        r2 = 27;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x012a }
        r0 = r0.startsWith(r1);	 Catch:{ OutOfMemoryError -> 0x012a }
        if (r0 != 0) goto L_0x00cc;
    L_0x00a6:
        r0 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x012a }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x012a }
        r1 = A;	 Catch:{ OutOfMemoryError -> 0x012a }
        r2 = 22;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x012a }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x012a }
        r1 = r8.o;	 Catch:{ OutOfMemoryError -> 0x012a }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x012a }
        r1 = A;	 Catch:{ OutOfMemoryError -> 0x012a }
        r2 = 24;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x012a }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x012a }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x012a }
        com.whatsapp.util.Log.w(r0);	 Catch:{ OutOfMemoryError -> 0x012a }
    L_0x00cc:
        r0 = java.lang.System.currentTimeMillis();
        r2 = r8.d;
        if (r2 == 0) goto L_0x00e5;
    L_0x00d4:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.j(r10);
        r2.add(r3);
        r3 = r8.d;
        r3.a(r2);
    L_0x00e5:
        r2 = r8.p;
        r4 = java.lang.System.currentTimeMillis();
        r0 = r4 - r0;
        r0 = r0 + r2;
        r8.p = r0;
    L_0x00f0:
        return;
    L_0x00f1:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x00f3 }
    L_0x00f3:
        r0 = move-exception;
        throw r0;
    L_0x00f5:
        r0 = move-exception;
        r4 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x0120 }
        r4.<init>();	 Catch:{ OutOfMemoryError -> 0x0120 }
        r5 = A;	 Catch:{ OutOfMemoryError -> 0x0120 }
        r6 = 23;
        r5 = r5[r6];	 Catch:{ OutOfMemoryError -> 0x0120 }
        r4 = r4.append(r5);	 Catch:{ OutOfMemoryError -> 0x0120 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x0120 }
        r0 = r4.append(r0);	 Catch:{ OutOfMemoryError -> 0x0120 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x0120 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ OutOfMemoryError -> 0x0120 }
        r0 = r8.d;	 Catch:{ OutOfMemoryError -> 0x0120 }
        if (r0 == 0) goto L_0x0067;
    L_0x0118:
        r0 = r8.d;	 Catch:{ OutOfMemoryError -> 0x0120 }
        r4 = 0;
        r0.a(r4);	 Catch:{ OutOfMemoryError -> 0x0120 }
        goto L_0x0067;
    L_0x0120:
        r0 = move-exception;
        throw r0;
    L_0x0122:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0124 }
    L_0x0124:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0126 }
    L_0x0126:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0128 }
    L_0x0128:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x012a }
    L_0x012a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.b(java.lang.String, java.lang.String):void");
    }

    protected void b(String str) {
        if (this.d != null) {
            this.d.d(A[60]);
            this.d.c(str);
        }
    }

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
                stringBuilder.append(a);
            } else {
                throw new g(A[59]);
            }
        } while (i == 0);
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.String[] g(java.lang.String r14) {
        /*
        r13_this = this;
        r12 = 34;
        r0 = 0;
        r3 = 2;
        r1 = 0;
        r2 = 1;
        r8 = defpackage.o.a;
        r9 = r14.length();
        r4 = new java.lang.String[r3];
        r5 = A;
        r6 = 45;
        r5 = r5[r6];
        r5 = r14.startsWith(r5);
        if (r5 == 0) goto L_0x00ff;
    L_0x001a:
        r5 = ":";
        r5 = r14.split(r5);
        r6 = r5.length;
        if (r6 >= r3) goto L_0x0024;
    L_0x0023:
        return r0;
    L_0x0024:
        r0 = r5[r1];
        r0 = r13.i(r0);
        r4[r1] = r0;
        r0 = r5[r2];
        r6 = A;
        r7 = 49;
        r6 = r6[r7];
        r7 = "";
        r0 = r0.replaceAll(r6, r7);
        r4[r2] = r0;
        r0 = r4[r1];
        r6 = A;
        r7 = 47;
        r6 = r6[r7];
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x00be;
    L_0x004a:
        r0 = A;
        r6 = 48;
        r0 = r0[r6];
        r0 = r14.contains(r0);
        if (r0 == 0) goto L_0x00fc;
    L_0x0056:
        r0 = "=";
        r0 = r14.indexOf(r0);
        r0 = r0 + 1;
        r6 = ":";
        r6 = r14.indexOf(r6);
        r0 = r14.substring(r0, r6);
        r13.d(r0);
        r0 = r1;
    L_0x006c:
        r6 = r13.f();
        if (r6 == 0) goto L_0x00a7;
    L_0x0072:
        r7 = A;
        r9 = 42;
        r7 = r7[r9];
        r7 = r6.contains(r7);
        if (r7 == 0) goto L_0x00a7;
    L_0x007e:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r9 = r4[r2];
        r7 = r7.append(r9);
        r9 = ";";
        r7 = r7.append(r9);
        r9 = ":";
        r9 = r6.lastIndexOf(r9);
        r9 = r9 + 1;
        r6 = r6.substring(r9);
        r6 = r7.append(r6);
        r6 = r6.toString();
        r4[r2] = r6;
        j = r1;
    L_0x00a7:
        if (r0 == 0) goto L_0x00bc;
    L_0x00a9:
        r0 = r13.e();
        r1 = ":";
        r1 = r0.lastIndexOf(r1);
        r1 = r1 + 1;
        r0 = r0.substring(r1);
        r13.d(r0);
    L_0x00bc:
        if (r8 == 0) goto L_0x00f9;
    L_0x00be:
        r0 = r5.length;
        if (r0 <= r3) goto L_0x00e6;
    L_0x00c1:
        r0 = r3;
    L_0x00c2:
        r1 = r5.length;
        if (r0 >= r1) goto L_0x00e6;
    L_0x00c5:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r4[r2];
        r1 = r1.append(r3);
        r3 = ":";
        r1 = r1.append(r3);
        r3 = r5[r0];
        r1 = r1.append(r3);
        r1 = r1.toString();
        r4[r2] = r1;
        r0 = r0 + 1;
        if (r8 == 0) goto L_0x00c2;
    L_0x00e6:
        r0 = r13.e();
        r1 = ":";
        r1 = r0.lastIndexOf(r1);
        r1 = r1 + 1;
        r0 = r0.substring(r1);
        r13.d(r0);
    L_0x00f9:
        r0 = r4;
        goto L_0x0023;
    L_0x00fc:
        r0 = r2;
        goto L_0x006c;
    L_0x00ff:
        r7 = r1;
        r5 = r1;
        r6 = r1;
    L_0x0102:
        if (r7 >= r9) goto L_0x010f;
    L_0x0104:
        r10 = r14.charAt(r7);
        switch(r6) {
            case 0: goto L_0x0132;
            case 1: goto L_0x0195;
            case 2: goto L_0x01c9;
            default: goto L_0x010b;
        };
    L_0x010b:
        r7 = r7 + 1;
        if (r8 == 0) goto L_0x0102;
    L_0x010f:
        r0 = new g;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = A;
        r3 = 44;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r14);
        r2 = "\"";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0132:
        r11 = 58;
        if (r10 != r11) goto L_0x0161;
    L_0x0136:
        r3 = r14.substring(r5, r7);
        r5 = A;
        r6 = 46;
        r5 = r5[r6];
        r5 = r3.equalsIgnoreCase(r5);
        if (r5 == 0) goto L_0x014a;
    L_0x0146:
        r13.l = r14;
        goto L_0x0023;
    L_0x014a:
        r4[r1] = r3;
        r0 = r9 + -1;
        if (r7 >= r0) goto L_0x015a;
    L_0x0150:
        r0 = r7 + 1;
        r0 = r14.substring(r0);
        r4[r2] = r0;
        if (r8 == 0) goto L_0x015e;
    L_0x015a:
        r0 = "";
        r4[r2] = r0;
    L_0x015e:
        r0 = r4;
        goto L_0x0023;
    L_0x0161:
        r11 = 46;
        if (r10 != r11) goto L_0x0176;
    L_0x0165:
        r5 = r14.substring(r5, r7);
        r11 = r13.d;
        if (r11 == 0) goto L_0x0172;
    L_0x016d:
        r11 = r13.d;
        r11.e(r5);
    L_0x0172:
        r5 = r7 + 1;
        if (r8 == 0) goto L_0x010b;
    L_0x0176:
        r11 = 59;
        if (r10 != r11) goto L_0x010b;
    L_0x017a:
        r5 = r14.substring(r5, r7);
        r6 = A;
        r11 = 43;
        r6 = r6[r11];
        r6 = r5.equalsIgnoreCase(r6);
        if (r6 == 0) goto L_0x018e;
    L_0x018a:
        r13.l = r14;
        goto L_0x0023;
    L_0x018e:
        r4[r1] = r5;
        r5 = r7 + 1;
        if (r8 == 0) goto L_0x01d1;
    L_0x0194:
        r6 = r2;
    L_0x0195:
        if (r10 != r12) goto L_0x019a;
    L_0x0197:
        if (r8 == 0) goto L_0x01ce;
    L_0x0199:
        r6 = r3;
    L_0x019a:
        r11 = 59;
        if (r10 != r11) goto L_0x01a9;
    L_0x019e:
        r5 = r14.substring(r5, r7);
        r13.h(r5);
        r5 = r7 + 1;
        if (r8 == 0) goto L_0x010b;
    L_0x01a9:
        r11 = 58;
        if (r10 != r11) goto L_0x010b;
    L_0x01ad:
        r0 = r14.substring(r5, r7);
        r13.h(r0);
        r0 = r9 + -1;
        if (r7 >= r0) goto L_0x01c2;
    L_0x01b8:
        r0 = r7 + 1;
        r0 = r14.substring(r0);
        r4[r2] = r0;
        if (r8 == 0) goto L_0x01c6;
    L_0x01c2:
        r0 = "";
        r4[r2] = r0;
    L_0x01c6:
        r0 = r4;
        goto L_0x0023;
    L_0x01c9:
        if (r10 != r12) goto L_0x010b;
    L_0x01cb:
        r6 = r2;
        goto L_0x010b;
    L_0x01ce:
        r6 = r3;
        goto L_0x010b;
    L_0x01d1:
        r6 = r2;
        goto L_0x010b;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.g(java.lang.String):java.lang.String[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void h(java.lang.String r8) {
        /*
        r7_this = this;
        r3 = 2;
        r6 = 0;
        r0 = defpackage.o.a;
        r1 = "=";
        r1 = r8.split(r1, r3);
        r2 = r1.length;
        if (r2 != r3) goto L_0x00a5;
    L_0x000d:
        r2 = r1[r6];
        r2 = r2.trim();
        r3 = 1;
        r3 = r1[r3];
        r3 = r3.trim();
        r4 = A;
        r5 = 35;
        r4 = r4[r5];
        r4 = r2.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x002b;
    L_0x0026:
        r7.d(r3);
        if (r0 == 0) goto L_0x00a3;
    L_0x002b:
        r4 = A;
        r5 = 36;
        r4 = r4[r5];
        r4 = r2.equals(r4);
        if (r4 == 0) goto L_0x003c;
    L_0x0037:
        r7.f(r3);
        if (r0 == 0) goto L_0x00a3;
    L_0x003c:
        r4 = A;
        r5 = 38;
        r4 = r4[r5];
        r4 = r2.equals(r4);
        if (r4 == 0) goto L_0x004d;
    L_0x0048:
        r7.e(r3);
        if (r0 == 0) goto L_0x00a3;
    L_0x004d:
        r4 = A;
        r5 = 39;
        r4 = r4[r5];
        r4 = r2.equals(r4);
        if (r4 == 0) goto L_0x005e;
    L_0x0059:
        r7.b(r3);
        if (r0 == 0) goto L_0x00a3;
    L_0x005e:
        r4 = A;
        r5 = 40;
        r4 = r4[r5];
        r4 = r2.equals(r4);
        if (r4 == 0) goto L_0x006f;
    L_0x006a:
        r7.a(r3);
        if (r0 == 0) goto L_0x00a3;
    L_0x006f:
        r4 = A;
        r5 = 37;
        r4 = r4[r5];
        r4 = r2.startsWith(r4);
        if (r4 == 0) goto L_0x0080;
    L_0x007b:
        r7.c(r2, r3);
        if (r0 == 0) goto L_0x00a3;
    L_0x0080:
        r0 = new g;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = A;
        r4 = 41;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r2);
        r2 = "\"";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00a3:
        if (r0 == 0) goto L_0x00aa;
    L_0x00a5:
        r0 = r1[r6];
        r7.d(r0);
    L_0x00aa:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.h(java.lang.String):void");
    }

    private boolean a(boolean z) {
        boolean z2;
        int i = o.a;
        if (!z || this.h <= 0) {
            z2 = false;
        } else {
            int i2 = 0;
            z2 = false;
            while (i2 < this.h) {
                if (!b(z2)) {
                    return false;
                }
                i2++;
                if (i != 0) {
                    z2 = true;
                    break;
                }
                z2 = true;
            }
        }
        if (!b(z2)) {
            return false;
        }
        long currentTimeMillis;
        if (this.d != null) {
            currentTimeMillis = System.currentTimeMillis();
            this.d.a(A[15]);
            this.e = (System.currentTimeMillis() - currentTimeMillis) + this.e;
        }
        currentTimeMillis = System.currentTimeMillis();
        d();
        this.v = (System.currentTimeMillis() - currentTimeMillis) + this.v;
        a(true, false);
        if (this.d != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            this.d.d();
            this.n = (System.currentTimeMillis() - currentTimeMillis2) + this.n;
        }
        return true;
    }

    protected void d(String str) {
        if (!(k.contains(str) || str.startsWith(A[65]) || this.m.contains(str))) {
            this.m.add(str);
            Log.w(A[64] + str);
        }
        if (this.d != null) {
            this.d.d(A[66]);
            this.d.c(str);
        }
    }

    protected void l(String str) {
        throw new g(A[51]);
    }

    protected void f(String str) {
        if (g.contains(str.toUpperCase()) || str.startsWith(A[56])) {
            if (this.d != null) {
                this.d.d(A[58]);
                this.d.c(str);
                if (o.a == 0) {
                    return;
                }
            }
            return;
        }
        throw new g(A[57] + str + "\"");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(boolean r8, boolean r9) {
        /*
        r7_this = this;
        r6 = 2;
        r1 = 0;
        r2 = defpackage.o.a;
    L_0x0004:
        if (r8 == 0) goto L_0x000a;
    L_0x0006:
        r0 = r7.l;
        if (r2 == 0) goto L_0x0026;
    L_0x000a:
        r0 = r7.a();
        if (r0 != 0) goto L_0x001c;
    L_0x0010:
        r0 = new g;
        r1 = A;
        r2 = 16;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x001c:
        r3 = r0.trim();
        r3 = r3.length();
        if (r3 <= 0) goto L_0x000a;
    L_0x0026:
        r3 = ":";
        r0 = r0.split(r3, r6);
        r3 = r0.length;
        if (r3 != r6) goto L_0x0055;
    L_0x002f:
        r3 = r0[r1];
        r3 = r3.trim();
        r4 = A;
        r5 = 19;
        r4 = r4[r5];
        r3 = r3.equalsIgnoreCase(r4);
        if (r3 == 0) goto L_0x0055;
    L_0x0041:
        r3 = 1;
        r0 = r0[r3];
        r0 = r0.trim();
        r3 = A;
        r4 = 17;
        r3 = r3[r4];
        r0 = r0.equalsIgnoreCase(r3);
        if (r0 == 0) goto L_0x0055;
    L_0x0054:
        return;
    L_0x0055:
        if (r9 != 0) goto L_0x007c;
    L_0x0057:
        r0 = new g;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = A;
        r3 = 18;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r7.l;
        r1 = r1.append(r2);
        r2 = "\"";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x007c:
        if (r9 == 0) goto L_0x0054;
    L_0x007e:
        r8 = r1;
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.a(boolean, boolean):void");
    }

    protected String a() {
        return this.f.readLine();
    }

    protected boolean g() {
        this.o = A[2];
        String e = e();
        long currentTimeMillis = System.currentTimeMillis();
        String[] g = g(e);
        if (g == null) {
            return true;
        }
        if (g.length != 2) {
            throw new g(A[6] + e + "\"");
        }
        e = g[0].toUpperCase();
        String str = g[1];
        this.x = (System.currentTimeMillis() - currentTimeMillis) + this.x;
        if (this.d != null) {
            this.d.b(e);
        }
        if (e.equals(A[7]) || e.equals(A[0]) || e.equals("N")) {
            currentTimeMillis = System.currentTimeMillis();
            a(e, str);
            this.w += System.currentTimeMillis() - currentTimeMillis;
            return false;
        } else if (e.equals(A[3])) {
            l(str);
            return false;
        } else if (!k(e)) {
            throw new g(A[9] + e + "\"");
        } else if (e.equals(A[4])) {
            if (str.equals(A[11])) {
                throw new h(A[1]);
            }
            throw new g(A[8] + str);
        } else if (!e.equals(A[5]) || str.equals(c())) {
            currentTimeMillis = System.currentTimeMillis();
            b(e, str);
            this.a += System.currentTimeMillis() - currentTimeMillis;
            return false;
        } else {
            throw new i(A[10] + str + A[12] + c());
        }
    }

    protected void c(String str, String str2) {
        if (this.d != null) {
            this.d.d(str);
            this.d.c(str2);
        }
    }

    protected String f() {
        b = null;
        b = a();
        if (b == null) {
            throw new g(A[72]);
        } else if (b.trim().length() <= 0) {
            return null;
        } else {
            j = true;
            return b;
        }
    }

    protected boolean m(String str) {
        return s.contains(str.toUpperCase());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.lang.String r9, java.lang.String r10) {
        /*
        r8_this = this;
        r3 = defpackage.o.a;
        r0 = r8.o;
        r1 = A;
        r2 = 13;
        r1 = r1[r2];
        r0 = r0.equalsIgnoreCase(r1);
        if (r0 == 0) goto L_0x0014;
    L_0x0010:
        r10 = r8.n(r10);
    L_0x0014:
        r0 = r8.d;
        if (r0 == 0) goto L_0x0081;
    L_0x0018:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = r10.length();
        r0 = 0;
    L_0x0027:
        if (r0 >= r5) goto L_0x0075;
    L_0x0029:
        r6 = r10.charAt(r0);
        r2 = 92;
        if (r6 != r2) goto L_0x0059;
    L_0x0031:
        r2 = r5 + -1;
        if (r0 >= r2) goto L_0x0059;
    L_0x0035:
        r2 = A;
        r7 = 14;
        r2 = r2[r7];
        r2 = r9.equals(r2);
        if (r2 != 0) goto L_0x0059;
    L_0x0041:
        r2 = r0 + 1;
        r2 = r10.charAt(r2);
        r2 = r8.b(r2);
        if (r2 == 0) goto L_0x0054;
    L_0x004d:
        r1.append(r2);
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0057;
    L_0x0054:
        r1.append(r6);
    L_0x0057:
        if (r3 == 0) goto L_0x0071;
    L_0x0059:
        r2 = r0;
        r0 = 59;
        if (r6 != r0) goto L_0x0085;
    L_0x005e:
        r0 = r1.toString();
        r4.add(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        if (r3 == 0) goto L_0x0082;
    L_0x006c:
        r0.append(r6);
        r1 = r0;
        r0 = r2;
    L_0x0071:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0027;
    L_0x0075:
        r0 = r1.toString();
        r4.add(r0);
        r0 = r8.d;
        r0.a(r4);
    L_0x0081:
        return;
    L_0x0082:
        r1 = r0;
        r0 = r2;
        goto L_0x0071;
    L_0x0085:
        r0 = r1;
        goto L_0x006c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.a(java.lang.String, java.lang.String):void");
    }

    protected String c() {
        return A[50];
    }
}
