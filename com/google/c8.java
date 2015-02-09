package com.google;

import com.whatsapp.vk;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class c8 {
    private static final Pattern A;
    private static final Pattern B;
    private static c8 C;
    private static final String D;
    private static final Pattern F;
    private static final Logger G;
    private static final Pattern I;
    private static final String[] J;
    public static int b;
    private static final Map c;
    static final Pattern g;
    private static final Pattern h;
    static final Pattern i;
    static final String j;
    static final Pattern k;
    private static final Pattern l;
    private static final Pattern m;
    private static final Pattern n;
    private static final Map o;
    private static final String p;
    private static final Pattern q;
    private static final Pattern s;
    private static final String t;
    static final Pattern v;
    private static final Pattern w;
    private static final Pattern x;
    private static final Map y;
    private static final Map z;
    private final Set E;
    private final Map H;
    private final Map a;
    private final Set d;
    private final Set e;
    private ef f;
    private String r;
    private Map u;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 38;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 82;
                    break;
                case ay.p /*3*/:
                    i2 = 59;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 97);
        }
        return toCharArray;
    }

    private boolean a(Pattern pattern, StringBuilder stringBuilder) {
        Matcher matcher = pattern.matcher(stringBuilder);
        if (!matcher.lookingAt()) {
            return false;
        }
        int end = matcher.end();
        Matcher matcher2 = w.matcher(stringBuilder.substring(end));
        if (matcher2.find()) {
            try {
                if (c(matcher2.group(1)).equals("0")) {
                    return false;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        stringBuilder.delete(0, end);
        return true;
    }

    private static java.lang.String a(java.lang.String r5, java.util.Map r6, boolean r7) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
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
        r2 = b;
        r3 = new java.lang.StringBuilder;
        r0 = r5.length();
        r3.<init>(r0);
        r0 = 0;
        r1 = r0;
    L_0x000d:
        r0 = r5.length();
        if (r1 >= r0) goto L_0x0035;
    L_0x0013:
        r4 = r5.charAt(r1);
        r0 = java.lang.Character.toUpperCase(r4);
        r0 = java.lang.Character.valueOf(r0);
        r0 = r6.get(r0);
        r0 = (java.lang.Character) r0;
        if (r0 == 0) goto L_0x002c;
    L_0x0027:
        r3.append(r0);	 Catch:{ RuntimeException -> 0x003a }
        if (r2 == 0) goto L_0x0031;
    L_0x002c:
        if (r7 != 0) goto L_0x0031;
    L_0x002e:
        r3.append(r4);	 Catch:{ RuntimeException -> 0x003c }
    L_0x0031:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x003e;
    L_0x0035:
        r0 = r3.toString();
        return r0;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r1 = r0;
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c8.a(java.lang.String, java.util.Map, boolean):java.lang.String");
    }

    public boolean b(ft ftVar) {
        try {
            return e(ftVar) == ff.IS_POSSIBLE;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    df a(StringBuilder stringBuilder, String str) {
        try {
            if (stringBuilder.length() == 0) {
                return df.FROM_DEFAULT_COUNTRY;
            }
            Matcher matcher = g.matcher(stringBuilder);
            try {
                if (matcher.lookingAt()) {
                    stringBuilder.delete(0, matcher.end());
                    b(stringBuilder);
                    return df.FROM_NUMBER_WITH_PLUS_SIGN;
                }
                Pattern a = this.f.a(str);
                try {
                    b(stringBuilder);
                    return a(a, stringBuilder) ? df.FROM_NUMBER_WITH_IDD : df.FROM_DEFAULT_COUNTRY;
                } catch (RuntimeException e) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    static {
        Object obj = -1;
        String[] strArr = new String[50];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "\u000f+\"I\u000ePb6^\u0005\b";
        char c = '\uffff';
        while (true) {
            str = z(z(str));
            switch (c) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "oe$Z\rOorT\u0013\u0006f;H\u0012Oe5\u001b\u0013Cl;T\u000f\u0006h=_\u0004\u0006#";
                    c = '\u0001';
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "u\u007f R\u0011Vn6\u001b\u0015Tj;W\bHlrX\tGy3X\u0015Cy!\u0001A";
                    c = '\u0002';
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "Rn>\u0001";
                    c = '\u0003';
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "Cf\"O\u0018\u0006f7O\u0000Bj&Z[\u0006";
                    c = '\u0004';
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Cf\"O\u0018\u0006f7O\u0000Bj&Z[\u0006";
                    c = '\u0005';
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "h$\u0013";
                    c = '\u0006';
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0016;c";
                    c = '\u0007';
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\th=VNAd=\\\rC$;\nYH$\"S\u000eHn<N\fDn HNBj&ZNvc=U\u0004h~?Y\u0004TF7O\u0000Bj&Z1Td&T";
                    c = '\b';
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\th=VNAd=\\\rC$;\nYH$\"S\u000eHn<N\fDn HNBj&ZNvc=U\u0004h~?Y\u0004TF7O\u0000Bj&Z1Td&T";
                    c = '\t';
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "|Q";
                    c = '\n';
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "|Q";
                    c = '\u000b';
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "|Q";
                    c = '\f';
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0016;c";
                    c = '\r';
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "ec7X\nOe5\u001b\b@+<N\fDn \u001b\bU+\"T\u0012Ub0W\u0004\u0006|;O\t\u0006b<X\u000eK{>^\u0015C+?^\u0015Go3O\u0000\b";
                    c = '\u000e';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0016;c";
                    c = '\u000f';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u000f+4T\u0013\u0006e'V\u0003Cyr";
                    c = '\u0010';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "kb!H\bHl}R\u000fPj>R\u0005\u0006h=N\u000fRy+d\u0002Io7\u001bI";
                    c = '\u0011';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "ed'U\u0015TrrX\u0000Jg;U\u0006\u0006h=_\u0004\u0006x'K\u0011Jb7_AQj!\u001b\u000fI\u007frI\u0004Ed5U\bUn6\u0015";
                    c = '\u0012';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "vc=U\u0004\u0006e'V\u0003CyrS\u0000B+3UAoO\u0016\u0017AD~&\u001b\u0000@\u007f7IARc;HAQj!\u001b\u000fI\u007frW\u000eHlr^\u000fI~5SARdrY\u0004\u0006jrM\bGi>^AVc=U\u0004\u0006e'V\u0003Cy|";
                    c = '\u0013';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "hd<v\u0000Rh:";
                    c = '\u0014';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "{w;U\u0015Zj<^\u0019Iw\uff1b\uff75\uff35\u000f";
                    c = '\u0015';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u00054.";
                    c = '\u0016';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "z{)u\u0005[";
                    c = '\u0017';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u000eW\"@/Bv)\nM\u0011v{";
                    c = '\u0018';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "}&rfJ\u000e";
                    c = '\u0019';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u001dn*O\\\u000eW\"@/Bv)\nM\u0011v{G:\u0006\u00ab\u000eOM{!z\u0004[C4*OI\u001917U\u0012O#m\u0001\u000e\u03274.\u00c8H\u000f4<\u0004\u001d\uff634\uff0a\uff6f\uff2f\u0019w\t";
                    c = '\u001a';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "}1\u000e\u0015\uff6f{4\t\u001b\u00c1z\u007f~\u0016<\f";
                    c = '\u001b';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "]:~\u000e\u001c\u000f(";
                    c = '\u001c';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u001dn*O\\";
                    c = '\u001d';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0006n*OO\u0006";
                    c = '\u001e';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    str = "rc7\u001b\u0011Nd<^AH~?Y\u0004T+!N\u0011Vg;^\u0005\u0006|3HAH~>WO";
                    c = '\u001f';
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    strArr2 = strArr3;
                    str = "kb!H\bHlrT\u0013\u0006b<M\u0000Jb6\u001b\u0005Cm3N\rR+ ^\u0006Od<\u0015";
                    c = ' ';
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "ed'W\u0005\u0006e=OAOe&^\u0013Vy7OAH~?Y\u0004TxrZ\u0007Rn \u001b\u0011J~!\u0016\u0012Ol<\u0015";
                    c = '!';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "rc7\u001b\u0012Ry;U\u0006\u0006x'K\u0011Jb7_AQj!\u001b\u0015IdrW\u000eHlrO\u000e\u0006{3I\u0012C%";
                    c = '\"';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "rc7\u001b\u0012Ry;U\u0006\u0006x'K\u0011Jb7_ABb6\u001b\u000fI\u007frH\u0004CfrO\u000e\u0006i7\u001b\u0000\u0006{:T\u000fC+<N\fDn \u0015";
                    c = '#';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "rc7\u001b\u0012Ry;U\u0006\u0006x'K\u0011Jb7_AOxrO\u000eI+>T\u000fA+&TADnrZAVc=U\u0004\u0006e'V\u0003Cy|";
                    c = '$';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "rc7\u001b\u0012Ry;U\u0006\u0006x'K\u0011Jb7_AOxrO\u000eI+!S\u000eT\u007frO\u000e\u0006i7\u001b\u0000\u0006{:T\u000fC+<N\fDn \u0015";
                    c = '%';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "rc7\u001b\u0012Ry;U\u0006\u0006x'K\u0011Jb7_AOxrO\u000eI+!S\u000eT\u007frO\u000e\u0006i7\u001b\u0000\u0006{:T\u000fC+<N\fDn \u0015";
                    c = '&';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0016;c";
                    c = '\'';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "Oe$Z\rOorV\u0004Rj6Z\u0015G+zX\u000eSe&I\u0018\u0006h3W\rOe5\u001b\u0002Io7\u001b\u0016GxrV\u0000V{7_ARdrO\tC+<T\u000f\u000bl7TACe&R\u0015_+3HAQn>WAGxrH\u0011Ch;]\bE+ ^\u0006Od<\u0013\u0012\u000f\"";
                    c = '(';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u0016;c";
                    c = ')';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u001db!N\u0003\u001b";
                    c = '*';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u001d{:T\u000fC&1T\u000fRn*O\\";
                    c = '+';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    str = "\u001d{:T\u000fC&1T\u000fRn*O\\";
                    c = ',';
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    strArr2 = strArr3;
                    str = "Rn>\u0001";
                    c = '-';
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "Rn>\u0001";
                    c = '.';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0016;c";
                    c = '/';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "oe$Z\rOorI\u0004Ab=UAEd6^[\u0006";
                    c = '0';
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    J = strArr3;
                    G = Logger.getLogger(c8.class.getName());
                    Map hashMap = new HashMap();
                    hashMap.put(Character.valueOf('0'), Character.valueOf('0'));
                    hashMap.put(Character.valueOf('1'), Character.valueOf('1'));
                    hashMap.put(Character.valueOf('2'), Character.valueOf('2'));
                    hashMap.put(Character.valueOf('3'), Character.valueOf('3'));
                    hashMap.put(Character.valueOf('4'), Character.valueOf('4'));
                    hashMap.put(Character.valueOf('5'), Character.valueOf('5'));
                    hashMap.put(Character.valueOf('6'), Character.valueOf('6'));
                    hashMap.put(Character.valueOf('7'), Character.valueOf('7'));
                    hashMap.put(Character.valueOf('8'), Character.valueOf('8'));
                    hashMap.put(Character.valueOf('9'), Character.valueOf('9'));
                    Map hashMap2 = new HashMap(40);
                    hashMap2.put(Character.valueOf('A'), Character.valueOf('2'));
                    hashMap2.put(Character.valueOf('B'), Character.valueOf('2'));
                    hashMap2.put(Character.valueOf('C'), Character.valueOf('2'));
                    hashMap2.put(Character.valueOf('D'), Character.valueOf('3'));
                    hashMap2.put(Character.valueOf('E'), Character.valueOf('3'));
                    hashMap2.put(Character.valueOf('F'), Character.valueOf('3'));
                    hashMap2.put(Character.valueOf('G'), Character.valueOf('4'));
                    hashMap2.put(Character.valueOf('H'), Character.valueOf('4'));
                    hashMap2.put(Character.valueOf('I'), Character.valueOf('4'));
                    hashMap2.put(Character.valueOf('J'), Character.valueOf('5'));
                    hashMap2.put(Character.valueOf('K'), Character.valueOf('5'));
                    hashMap2.put(Character.valueOf('L'), Character.valueOf('5'));
                    hashMap2.put(Character.valueOf('M'), Character.valueOf('6'));
                    hashMap2.put(Character.valueOf('N'), Character.valueOf('6'));
                    hashMap2.put(Character.valueOf('O'), Character.valueOf('6'));
                    hashMap2.put(Character.valueOf('P'), Character.valueOf('7'));
                    hashMap2.put(Character.valueOf('Q'), Character.valueOf('7'));
                    hashMap2.put(Character.valueOf('R'), Character.valueOf('7'));
                    hashMap2.put(Character.valueOf('S'), Character.valueOf('7'));
                    hashMap2.put(Character.valueOf('T'), Character.valueOf('8'));
                    hashMap2.put(Character.valueOf('U'), Character.valueOf('8'));
                    hashMap2.put(Character.valueOf('V'), Character.valueOf('8'));
                    hashMap2.put(Character.valueOf('W'), Character.valueOf('9'));
                    hashMap2.put(Character.valueOf('X'), Character.valueOf('9'));
                    hashMap2.put(Character.valueOf('Y'), Character.valueOf('9'));
                    hashMap2.put(Character.valueOf('Z'), Character.valueOf('9'));
                    y = Collections.unmodifiableMap(hashMap2);
                    hashMap2 = new HashMap(100);
                    hashMap2.putAll(y);
                    hashMap2.putAll(hashMap);
                    z = Collections.unmodifiableMap(hashMap2);
                    hashMap2 = new HashMap();
                    hashMap2.putAll(hashMap);
                    hashMap2.put(Character.valueOf('+'), Character.valueOf('+'));
                    hashMap2.put(Character.valueOf('*'), Character.valueOf('*'));
                    c = Collections.unmodifiableMap(hashMap2);
                    Map hashMap3 = new HashMap();
                    for (Character ch : y.keySet()) {
                        c = ch.charValue();
                        hashMap3.put(Character.valueOf(Character.toLowerCase(c)), Character.valueOf(c));
                        hashMap3.put(Character.valueOf(c), Character.valueOf(c));
                    }
                    hashMap3.putAll(hashMap);
                    hashMap3.put(Character.valueOf('-'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\uff0d'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\u2010'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\u2011'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\u2012'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\u2013'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\u2014'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\u2015'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('\u2212'), Character.valueOf('-'));
                    hashMap3.put(Character.valueOf('/'), Character.valueOf('/'));
                    hashMap3.put(Character.valueOf('\uff0f'), Character.valueOf('/'));
                    hashMap3.put(Character.valueOf(' '), Character.valueOf(' '));
                    hashMap3.put(Character.valueOf('\u3000'), Character.valueOf(' '));
                    hashMap3.put(Character.valueOf('\u2060'), Character.valueOf(' '));
                    hashMap3.put(Character.valueOf('.'), Character.valueOf('.'));
                    hashMap3.put(Character.valueOf('\uff0e'), Character.valueOf('.'));
                    o = Collections.unmodifiableMap(hashMap3);
                    String str2 = "}W6fJ\u000e4h`\u001f\u2075\u2237\uff0cf:zo\u000f\u0010H\u0019";
                    Object obj2 = -1;
                    while (true) {
                        str2 = z(z(str2));
                        StringBuilder stringBuilder;
                        switch (obj2) {
                            case PBE.MD5 /*0*/:
                                g = Pattern.compile(str2);
                                str2 = "}&*\u202bL\u2033\u2219\u30ae\uff36L\uff29+\u00f2\u0096\u206a\u2046\u300bz\u0012\uff69\uff2f\uff30\uff6f\u0015=}W\u000f\u0014\u001f\u2075\u2237\uff0cfJ";
                                obj2 = 1;
                                break;
                            case ay.f /*1*/:
                                q = Pattern.compile(str2);
                                str2 = "\u000eW\"@/Bv{";
                                obj2 = 2;
                                break;
                            case ay.n /*2*/:
                                w = Pattern.compile(str2);
                                str2 = "} \uff59g\u0011]E6F<";
                                obj2 = 3;
                                break;
                            case ay.p /*3*/:
                                n = Pattern.compile(str2);
                                str2 = "}W\u000e\u0014<\u0006!*";
                                obj2 = 4;
                                break;
                            case aj.i /*4*/:
                                v = Pattern.compile(str2);
                                str2 = "}P\u000ek\u001ahvt\u001d=vp\u001eF<\u0000-\teB{Vy\u001f";
                                obj2 = 5;
                                break;
                            case aV.r /*5*/:
                                i = Pattern.compile(str2);
                                str2 = "\u000e4h\u0015K\u0019P\u0013\u0016;G&(fH]8/\u0015K";
                                obj2 = 6;
                                break;
                            case aV.i /*6*/:
                                x = Pattern.compile(str2);
                                stringBuilder = new StringBuilder();
                                str2 = "z{)u\u0005[p`F\u001d} \uff59fK\r#m\u0001:\u000bs\u2042\u0016\u2074\u2234\u30f7\uff5f\u0016\uff6e\u0006\u00ab\u00ff\u2030\u2001\u3026#{\uff33\uff68\uff1d\uff36|g:zV}E\u2032\u221a\uff55xfKz{)u\u0005[\")\bM[P\u007fC\u2071\u000b\u201e\u2240\u30c7\uff6c\u000b\uff04r\u009b\u00cc\u202d\u206b\u3052\u0013H\uff2e\uff02\uff69\uff06OzP\u000efNX\u2058\u226e\uff65K";
                                obj2 = -1;
                                while (true) {
                                    str2 = z(z(str2));
                                    switch (obj2) {
                                        case PBE.MD5 /*0*/:
                                            stringBuilder = stringBuilder.append(str2);
                                            str2 = "{!";
                                            obj2 = 1;
                                            break;
                                        case ay.f /*1*/:
                                            D = stringBuilder.append(str2).toString();
                                            str2 = "^\uff53q\uff38\u001f\uff78";
                                            obj2 = 7;
                                            continue;
                                        default:
                                            stringBuilder = stringBuilder.append(str2).append(p);
                                            str2 = "z{)u\u0005[";
                                            obj2 = null;
                                            break;
                                    }
                                }
                            case a8.s /*7*/:
                                t = l("," + str2);
                                j = l(str2);
                                stringBuilder = new StringBuilder();
                                str2 = "\u000e4h";
                                obj2 = -1;
                                while (true) {
                                    str2 = z(z(str2));
                                    switch (obj2) {
                                        case PBE.MD5 /*0*/:
                                            l = Pattern.compile(stringBuilder.append(str2).toString(), 66);
                                            stringBuilder = new StringBuilder().append(D);
                                            str2 = "\u000e4h";
                                            obj2 = 1;
                                            break;
                                        case ay.f /*1*/:
                                            stringBuilder = stringBuilder.append(str2).append(t);
                                            str2 = "\u000f4";
                                            obj2 = 2;
                                            break;
                                        case ay.n /*2*/:
                                            s = Pattern.compile(stringBuilder.append(str2).toString(), 66);
                                            String str3 = "\u000eW\u0016\u0010H";
                                            while (true) {
                                                str3 = z(z(str3));
                                                switch (obj) {
                                                    case PBE.MD5 /*0*/:
                                                        F = Pattern.compile(str3);
                                                        str3 = "z/\u001ck";
                                                        obj = 1;
                                                        break;
                                                    case ay.f /*1*/:
                                                        m = Pattern.compile(str3);
                                                        str3 = "z/\u0014|";
                                                        obj = 2;
                                                        break;
                                                    case ay.n /*2*/:
                                                        h = Pattern.compile(str3);
                                                        str3 = "z/\u0011x";
                                                        obj = 3;
                                                        break;
                                                    case ay.p /*3*/:
                                                        A = Pattern.compile(str3);
                                                        str3 = "z#mgE\u0017W{\u0004";
                                                        obj = 4;
                                                        break;
                                                    case aj.i /*4*/:
                                                        I = Pattern.compile(str3);
                                                        C = null;
                                                    default:
                                                        k = Pattern.compile(str3);
                                                        str3 = "\u000eWvg\u0005\u000f";
                                                        obj = null;
                                                        break;
                                                }
                                            }
                                        default:
                                            stringBuilder = stringBuilder.append(str2).append(t);
                                            str2 = "\u000f/";
                                            obj2 = null;
                                            break;
                                    }
                                }
                            default:
                                B = Pattern.compile(str2);
                                stringBuilder = new StringBuilder();
                                StringBuilder stringBuilder2 = stringBuilder;
                                String toString = Arrays.toString(y.keySet().toArray());
                                str2 = "}'rg:zV\u000f";
                                obj2 = -1;
                                while (true) {
                                    str2 = z(z(str2));
                                    switch (obj2) {
                                        case PBE.MD5 /*0*/:
                                            p = stringBuilder2.append(toString.replaceAll(str2, "")).toString();
                                            str2 = "} \uff59fJ";
                                            obj2 = null;
                                            break;
                                        default:
                                            stringBuilder = stringBuilder2.append(toString.replaceAll(str2, ""));
                                            stringBuilder2 = stringBuilder;
                                            toString = Arrays.toString(y.keySet().toArray()).toLowerCase();
                                            str2 = "}'rg:zV\u000f";
                                            obj2 = null;
                                    }
                                }
                        }
                    }
                default:
                    strArr2[i] = str;
                    str = "H~>W";
                    i = 1;
                    strArr2 = strArr3;
                    c = '\u0000';
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.google.ft r4, com.google.f8 r5, com.google.c5 r6, java.lang.StringBuilder r7) {
        /*
        r3_this = this;
        r0 = b;
        r1 = r4.s();	 Catch:{ RuntimeException -> 0x0052 }
        if (r1 == 0) goto L_0x0051;
    L_0x0008:
        r1 = r4.i();	 Catch:{ RuntimeException -> 0x0054 }
        r1 = r1.length();	 Catch:{ RuntimeException -> 0x0054 }
        if (r1 <= 0) goto L_0x0051;
    L_0x0012:
        r1 = com.google.c5.RFC3966;	 Catch:{ RuntimeException -> 0x0056 }
        if (r6 != r1) goto L_0x0029;
    L_0x0016:
        r1 = J;	 Catch:{ RuntimeException -> 0x0058 }
        r2 = 30;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0058 }
        r1 = r7.append(r1);	 Catch:{ RuntimeException -> 0x0058 }
        r2 = r4.i();	 Catch:{ RuntimeException -> 0x0058 }
        r1.append(r2);	 Catch:{ RuntimeException -> 0x0058 }
        if (r0 == 0) goto L_0x0051;
    L_0x0029:
        r1 = r5.p();	 Catch:{ RuntimeException -> 0x005a }
        if (r1 == 0) goto L_0x0040;
    L_0x002f:
        r1 = r5.x();	 Catch:{ RuntimeException -> 0x005c }
        r1 = r7.append(r1);	 Catch:{ RuntimeException -> 0x005c }
        r2 = r4.i();	 Catch:{ RuntimeException -> 0x005c }
        r1.append(r2);	 Catch:{ RuntimeException -> 0x005c }
        if (r0 == 0) goto L_0x0051;
    L_0x0040:
        r0 = J;	 Catch:{ RuntimeException -> 0x005c }
        r1 = 31;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x005c }
        r0 = r7.append(r0);	 Catch:{ RuntimeException -> 0x005c }
        r1 = r4.i();	 Catch:{ RuntimeException -> 0x005c }
        r0.append(r1);	 Catch:{ RuntimeException -> 0x005c }
    L_0x0051:
        return;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c8.a(com.google.ft, com.google.f8, com.google.c5, java.lang.StringBuilder):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r7, java.lang.StringBuilder r8) {
        /*
        r6_this = this;
        r5 = 43;
        r0 = b;
        r1 = J;
        r2 = 45;
        r1 = r1[r2];
        r1 = r7.indexOf(r1);
        if (r1 <= 0) goto L_0x0057;
    L_0x0010:
        r2 = J;
        r3 = 44;
        r2 = r2[r3];
        r2 = r2.length();
        r2 = r2 + r1;
        r3 = r7.charAt(r2);
        if (r3 != r5) goto L_0x0039;
    L_0x0021:
        r3 = 59;
        r3 = r7.indexOf(r3, r2);
        if (r3 <= 0) goto L_0x0032;
    L_0x0029:
        r3 = r7.substring(r2, r3);	 Catch:{ RuntimeException -> 0x0070 }
        r8.append(r3);	 Catch:{ RuntimeException -> 0x0070 }
        if (r0 == 0) goto L_0x0039;
    L_0x0032:
        r2 = r7.substring(r2);	 Catch:{ RuntimeException -> 0x0070 }
        r8.append(r2);	 Catch:{ RuntimeException -> 0x0070 }
    L_0x0039:
        r2 = J;	 Catch:{ RuntimeException -> 0x0072 }
        r3 = 46;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0072 }
        r2 = r7.indexOf(r2);	 Catch:{ RuntimeException -> 0x0072 }
        r3 = J;	 Catch:{ RuntimeException -> 0x0072 }
        r4 = 47;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x0072 }
        r3 = r3.length();	 Catch:{ RuntimeException -> 0x0072 }
        r2 = r2 + r3;
        r1 = r7.substring(r2, r1);	 Catch:{ RuntimeException -> 0x0072 }
        r8.append(r1);	 Catch:{ RuntimeException -> 0x0072 }
        if (r0 == 0) goto L_0x005e;
    L_0x0057:
        r0 = b(r7);	 Catch:{ RuntimeException -> 0x0072 }
        r8.append(r0);	 Catch:{ RuntimeException -> 0x0072 }
    L_0x005e:
        r0 = J;
        r0 = r0[r5];
        r0 = r8.indexOf(r0);
        if (r0 <= 0) goto L_0x006f;
    L_0x0068:
        r1 = r8.length();	 Catch:{ RuntimeException -> 0x0074 }
        r8.delete(r0, r1);	 Catch:{ RuntimeException -> 0x0074 }
    L_0x006f:
        return;
    L_0x0070:
        r0 = move-exception;
        throw r0;
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c8.a(java.lang.String, java.lang.StringBuilder):void");
    }

    static synchronized c8 a(String str, Map map) {
        c8 c8Var;
        synchronized (c8.class) {
            try {
                if (C == null) {
                    C = new c8();
                    C.u = map;
                    C.a(str);
                }
                c8Var = C;
            } catch (RuntimeException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
        return c8Var;
    }

    private c8() {
        this.r = J[9];
        this.u = null;
        this.e = new HashSet(320);
        this.d = new HashSet(35);
        this.H = Collections.synchronizedMap(new HashMap());
        this.a = Collections.synchronizedMap(new HashMap());
        this.E = new HashSet();
        this.f = new ef(100);
    }

    public boolean c(ft ftVar) {
        return b(ftVar, a(ftVar));
    }

    private av a(String str, f8 f8Var) {
        dt A = f8Var.A();
        try {
            if (A.e()) {
                if (a(str, A)) {
                    try {
                        try {
                            if (a(str, f8Var.v())) {
                                return av.PREMIUM_RATE;
                            }
                            try {
                                if (a(str, f8Var.r())) {
                                    return av.TOLL_FREE;
                                }
                                try {
                                    if (a(str, f8Var.X())) {
                                        return av.SHARED_COST;
                                    }
                                    try {
                                        if (a(str, f8Var.z())) {
                                            return av.VOIP;
                                        }
                                        try {
                                            if (a(str, f8Var.c())) {
                                                return av.PERSONAL_NUMBER;
                                            }
                                            try {
                                                if (a(str, f8Var.L())) {
                                                    return av.PAGER;
                                                }
                                                try {
                                                    if (a(str, f8Var.E())) {
                                                        return av.UAN;
                                                    }
                                                    try {
                                                        if (a(str, f8Var.w())) {
                                                            return av.VOICEMAIL;
                                                        }
                                                        if (a(str, f8Var.C())) {
                                                            try {
                                                                if (f8Var.ac()) {
                                                                    return av.FIXED_LINE_OR_MOBILE;
                                                                }
                                                                try {
                                                                    return a(str, f8Var.F()) ? av.FIXED_LINE_OR_MOBILE : av.FIXED_LINE;
                                                                } catch (RuntimeException e) {
                                                                    throw e;
                                                                }
                                                            } catch (RuntimeException e2) {
                                                                throw e2;
                                                            }
                                                        }
                                                        try {
                                                            if (!f8Var.ac()) {
                                                                if (a(str, f8Var.F())) {
                                                                    return av.MOBILE;
                                                                }
                                                            }
                                                            return av.UNKNOWN;
                                                        } catch (RuntimeException e22) {
                                                            throw e22;
                                                        } catch (RuntimeException e222) {
                                                            throw e222;
                                                        }
                                                    } catch (RuntimeException e2222) {
                                                        throw e2222;
                                                    }
                                                } catch (RuntimeException e22222) {
                                                    throw e22222;
                                                }
                                            } catch (RuntimeException e222222) {
                                                throw e222222;
                                            }
                                        } catch (RuntimeException e2222222) {
                                            throw e2222222;
                                        }
                                    } catch (RuntimeException e22222222) {
                                        throw e22222222;
                                    }
                                } catch (RuntimeException e222222222) {
                                    throw e222222222;
                                }
                            } catch (RuntimeException e2222222222) {
                                throw e2222222222;
                            }
                        }
                    } catch (RuntimeException e22222222222) {
                        throw e22222222222;
                    }
                }
            }
            return av.UNKNOWN;
        } catch (RuntimeException e222222222222) {
            throw e222222222222;
        } catch (RuntimeException e2222222222222) {
            throw e2222222222222;
        }
    }

    private void a(int i, c5 c5Var, StringBuilder stringBuilder) {
        try {
            switch (fv.a[c5Var.ordinal()]) {
                case ay.f /*1*/:
                    stringBuilder.insert(0, i).insert(0, '+');
                case ay.n /*2*/:
                    stringBuilder.insert(0, " ").insert(0, i).insert(0, '+');
                case ay.p /*3*/:
                    stringBuilder.insert(0, "-").insert(0, i).insert(0, '+').insert(0, J[4]);
                default:
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public as j(String str) {
        return new as(str);
    }

    public static synchronized c8 a() {
        c8 a;
        synchronized (c8.class) {
            try {
                if (C == null) {
                    a = a(J[10], ev.a());
                } else {
                    a = C;
                }
            } catch (RuntimeException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
        return a;
    }

    static String f(String str) {
        try {
            return x.matcher(str).matches() ? a(str, z, true) : c(str);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public String d(ft ftVar) {
        try {
            String str;
            if (ftVar.q()) {
                str = "0";
            } else {
                str = "";
            }
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append(ftVar.t());
            return stringBuilder.toString();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void a(ft ftVar, c5 c5Var, StringBuilder stringBuilder) {
        stringBuilder.setLength(0);
        int a = ftVar.a();
        String d = d(ftVar);
        try {
            if (c5Var == c5.E164) {
                stringBuilder.append(d);
                a(a, c5.E164, stringBuilder);
                return;
            }
            try {
                if (b(a)) {
                    f8 a2 = a(a, c(a));
                    stringBuilder.append(a(d, a2, c5Var));
                    a(ftVar, a2, c5Var, stringBuilder);
                    a(a, c5Var, stringBuilder);
                    return;
                }
                stringBuilder.append(d);
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    private ff a(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (matcher.matches()) {
                return ff.IS_POSSIBLE;
            }
            try {
                return matcher.lookingAt() ? ff.TOO_LONG : ff.TOO_SHORT;
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    private boolean a(String str, dt dtVar) {
        Matcher matcher = this.f.a(dtVar.b()).matcher(str);
        Matcher matcher2 = this.f.a(dtVar.d()).matcher(str);
        try {
            if (matcher.matches()) {
                if (matcher2.matches()) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public String c(int i) {
        List list = (List) this.u.get(Integer.valueOf(i));
        if (list != null) {
            return (String) list.get(0);
        }
        try {
            return J[13];
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public static String c(String str) {
        return a(str, false).toString();
    }

    private boolean b(ft ftVar, ft ftVar2) {
        String valueOf = String.valueOf(ftVar.t());
        String valueOf2 = String.valueOf(ftVar2.t());
        try {
            if (!valueOf.endsWith(valueOf2)) {
                if (!valueOf2.endsWith(valueOf)) {
                    try {
                        return false;
                    }
                }
            }
            return true;
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    e5 a(List list, String str) {
        int i = b;
        for (e5 e5Var : list) {
            int f = e5Var.f();
            if (f != 0) {
                try {
                } catch (RuntimeException e) {
                    throw e;
                }
                if (!this.f.a(e5Var.a(f - 1)).matcher(str).lookingAt()) {
                    continue;
                    if (i != 0) {
                        break;
                    }
                }
            }
            try {
            } catch (RuntimeException e2) {
                throw e2;
            }
            if (!this.f.a(e5Var.j()).matcher(str).matches()) {
                if (i != 0) {
                    break;
                }
            }
            return e5Var;
        }
        return null;
    }

    public String a(ft ftVar) {
        int a = ftVar.a();
        List list = (List) this.u.get(Integer.valueOf(a));
        if (list == null) {
            G.log(Level.WARNING, J[18] + a + J[17] + d(ftVar));
            return null;
        }
        try {
            return list.size() == 1 ? (String) list.get(0) : a(ftVar, list);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private static String l(String str) {
        return J[27] + str + J[22] + J[28] + J[25] + J[23] + J[26] + J[24] + J[29];
    }

    String a(StringBuilder stringBuilder) {
        int i = b;
        Matcher matcher = l.matcher(stringBuilder);
        try {
            if (matcher.find() && k(stringBuilder.substring(0, matcher.start()))) {
                int i2 = 1;
                int groupCount = matcher.groupCount();
                while (i2 <= groupCount) {
                    if (matcher.group(i2) == null) {
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    String group = matcher.group(i2);
                    stringBuilder.delete(matcher.start(), stringBuilder.length());
                    return group;
                }
            }
            return "";
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r8) {
        /*
        r7_this = this;
        r6 = 1;
        r2 = b;
        r7.r = r8;
        r0 = r7.u;
        r0 = r0.entrySet();
        r3 = r0.iterator();
    L_0x000f:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x004a;
    L_0x0015:
        r0 = r3.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getValue();
        r1 = (java.util.List) r1;
        r4 = r1.size();	 Catch:{ RuntimeException -> 0x0077 }
        if (r4 != r6) goto L_0x0043;
    L_0x0027:
        r4 = J;	 Catch:{ RuntimeException -> 0x0079 }
        r5 = 42;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x0079 }
        r5 = 0;
        r5 = r1.get(r5);	 Catch:{ RuntimeException -> 0x0079 }
        r4 = r4.equals(r5);	 Catch:{ RuntimeException -> 0x0079 }
        if (r4 == 0) goto L_0x0043;
    L_0x0038:
        r4 = r7.E;	 Catch:{ RuntimeException -> 0x007b }
        r0 = r0.getKey();	 Catch:{ RuntimeException -> 0x007b }
        r4.add(r0);	 Catch:{ RuntimeException -> 0x007b }
        if (r2 == 0) goto L_0x0048;
    L_0x0043:
        r0 = r7.e;	 Catch:{ RuntimeException -> 0x007b }
        r0.addAll(r1);	 Catch:{ RuntimeException -> 0x007b }
    L_0x0048:
        if (r2 == 0) goto L_0x000f;
    L_0x004a:
        r0 = r7.e;	 Catch:{ RuntimeException -> 0x007d }
        r1 = J;	 Catch:{ RuntimeException -> 0x007d }
        r2 = 40;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x007d }
        r0 = r0.remove(r1);	 Catch:{ RuntimeException -> 0x007d }
        if (r0 == 0) goto L_0x0065;
    L_0x0058:
        r0 = G;	 Catch:{ RuntimeException -> 0x007d }
        r1 = java.util.logging.Level.WARNING;	 Catch:{ RuntimeException -> 0x007d }
        r2 = J;	 Catch:{ RuntimeException -> 0x007d }
        r3 = 41;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x007d }
        r0.log(r1, r2);	 Catch:{ RuntimeException -> 0x007d }
    L_0x0065:
        r1 = r7.d;
        r0 = r7.u;
        r2 = java.lang.Integer.valueOf(r6);
        r0 = r0.get(r2);
        r0 = (java.util.Collection) r0;
        r1.addAll(r0);
        return;
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c8.a(java.lang.String):void");
    }

    boolean a(StringBuilder stringBuilder, f8 f8Var, StringBuilder stringBuilder2) {
        int length = stringBuilder.length();
        String q = f8Var.q();
        if (length == 0) {
            return false;
        }
        try {
            if (q.length() == 0) {
                return false;
            }
            Matcher matcher = this.f.a(q).matcher(stringBuilder);
            if (!matcher.lookingAt()) {
                return false;
            }
            Pattern a = this.f.a(f8Var.A().d());
            boolean matches = a.matcher(stringBuilder).matches();
            int groupCount = matcher.groupCount();
            String R = f8Var.R();
            try {
                if (R != null) {
                    try {
                        if (R.length() != 0) {
                            if (matcher.group(groupCount) != null) {
                                StringBuilder stringBuilder3 = new StringBuilder(stringBuilder);
                                try {
                                    stringBuilder3.replace(0, length, matcher.replaceFirst(R));
                                    if (matches) {
                                        if (!a.matcher(stringBuilder3.toString()).matches()) {
                                            return false;
                                        }
                                    }
                                    if (stringBuilder2 != null && groupCount > 1) {
                                        try {
                                            stringBuilder2.append(matcher.group(1));
                                        } catch (RuntimeException e) {
                                            throw e;
                                        }
                                    }
                                    stringBuilder.replace(0, stringBuilder.length(), stringBuilder3.toString());
                                    return true;
                                } catch (RuntimeException e2) {
                                    throw e2;
                                } catch (RuntimeException e22) {
                                    throw e22;
                                }
                            }
                        }
                    } catch (RuntimeException e222) {
                        throw e222;
                    } catch (RuntimeException e2222) {
                        try {
                            throw e2222;
                        } catch (RuntimeException e22222) {
                            throw e22222;
                        }
                    }
                }
                if (matches) {
                    if (!a.matcher(stringBuilder.substring(matcher.end())).matches()) {
                        return false;
                    }
                }
                if (stringBuilder2 != null && groupCount > 0) {
                    try {
                        if (matcher.group(groupCount) != null) {
                            stringBuilder2.append(matcher.group(1));
                        }
                    } catch (RuntimeException e222222) {
                        throw e222222;
                    }
                }
                stringBuilder.delete(0, matcher.end());
                return true;
            } catch (RuntimeException e2222222) {
                throw e2222222;
            }
        } catch (RuntimeException e22222222) {
            throw e22222222;
        }
    }

    public void a(String str, String str2, ft ftVar) {
        a(str, str2, false, true, ftVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(java.lang.String r2, java.lang.String r3) {
        /*
        r1_this = this;
        r0 = r1.g(r3);	 Catch:{ RuntimeException -> 0x001c }
        if (r0 != 0) goto L_0x0024;
    L_0x0006:
        if (r2 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r2.length();	 Catch:{ RuntimeException -> 0x0020 }
        if (r0 == 0) goto L_0x001a;
    L_0x000e:
        r0 = g;	 Catch:{ RuntimeException -> 0x0022 }
        r0 = r0.matcher(r2);	 Catch:{ RuntimeException -> 0x0022 }
        r0 = r0.lookingAt();	 Catch:{ RuntimeException -> 0x0022 }
        if (r0 != 0) goto L_0x0024;
    L_0x001a:
        r0 = 0;
    L_0x001b:
        return r0;
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r0 = 1;
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c8.b(java.lang.String, java.lang.String):boolean");
    }

    f8 a(int i) {
        synchronized (this.a) {
            try {
                if (this.u.containsKey(Integer.valueOf(i))) {
                    if (!this.a.containsKey(Integer.valueOf(i))) {
                        a(this.r, J[48], i);
                    }
                    return (f8) this.a.get(Integer.valueOf(i));
                }
                return null;
            } catch (RuntimeException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
    }

    public ft c(String str, String str2) {
        ft ftVar = new ft();
        a(str, str2, ftVar);
        return ftVar;
    }

    private f8 a(int i, String str) {
        try {
            return J[16].equals(str) ? a(i) : i(str);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int a(java.lang.String r8, com.google.f8 r9, java.lang.StringBuilder r10, boolean r11, com.google.ft r12) {
        /*
        r7_this = this;
        r1 = 0;
        r0 = r8.length();	 Catch:{ RuntimeException -> 0x0009 }
        if (r0 != 0) goto L_0x000b;
    L_0x0007:
        r0 = r1;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r2 = new java.lang.StringBuilder;
        r2.<init>(r8);
        r0 = J;
        r3 = 21;
        r0 = r0[r3];
        if (r9 == 0) goto L_0x001c;
    L_0x0018:
        r0 = r9.M();
    L_0x001c:
        r0 = r7.a(r2, r0);
        if (r11 == 0) goto L_0x0025;
    L_0x0022:
        r12.a(r0);	 Catch:{ RuntimeException -> 0x0040 }
    L_0x0025:
        r3 = com.google.df.FROM_DEFAULT_COUNTRY;	 Catch:{ RuntimeException -> 0x0042 }
        if (r0 == r3) goto L_0x005e;
    L_0x0029:
        r0 = r2.length();	 Catch:{ RuntimeException -> 0x003e }
        r1 = 2;
        if (r0 > r1) goto L_0x0044;
    L_0x0030:
        r0 = new com.google.b5;	 Catch:{ RuntimeException -> 0x003e }
        r1 = com.google.et.TOO_SHORT_AFTER_IDD;	 Catch:{ RuntimeException -> 0x003e }
        r2 = J;	 Catch:{ RuntimeException -> 0x003e }
        r3 = 20;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x003e }
        r0.<init>(r1, r2);	 Catch:{ RuntimeException -> 0x003e }
        throw r0;	 Catch:{ RuntimeException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0044:
        r0 = r7.a(r2, r10);
        if (r0 == 0) goto L_0x0050;
    L_0x004a:
        r12.a(r0);	 Catch:{ RuntimeException -> 0x004e }
        goto L_0x0008;
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r0 = new com.google.b5;
        r1 = com.google.et.INVALID_COUNTRY_CODE;
        r2 = J;
        r3 = 19;
        r2 = r2[r3];
        r0.<init>(r1, r2);
        throw r0;
    L_0x005e:
        if (r9 == 0) goto L_0x00d2;
    L_0x0060:
        r0 = r9.N();
        r3 = java.lang.String.valueOf(r0);
        r4 = r2.toString();
        r5 = r4.startsWith(r3);
        if (r5 == 0) goto L_0x00d2;
    L_0x0072:
        r5 = new java.lang.StringBuilder;
        r3 = r3.length();
        r3 = r4.substring(r3);
        r5.<init>(r3);
        r3 = r9.A();
        r4 = r7.f;
        r6 = r3.d();
        r4 = r4.a(r6);
        r6 = 0;
        r7.a(r5, r9, r6);
        r6 = r7.f;
        r3 = r3.b();
        r3 = r6.a(r3);
        r6 = r4.matcher(r2);	 Catch:{ RuntimeException -> 0x00ca }
        r6 = r6.matches();	 Catch:{ RuntimeException -> 0x00ca }
        if (r6 != 0) goto L_0x00af;
    L_0x00a5:
        r4 = r4.matcher(r5);	 Catch:{ RuntimeException -> 0x00cc }
        r4 = r4.matches();	 Catch:{ RuntimeException -> 0x00cc }
        if (r4 != 0) goto L_0x00bb;
    L_0x00af:
        r2 = r2.toString();	 Catch:{ RuntimeException -> 0x00ce }
        r2 = r7.a(r3, r2);	 Catch:{ RuntimeException -> 0x00ce }
        r3 = com.google.ff.TOO_LONG;	 Catch:{ RuntimeException -> 0x00ce }
        if (r2 != r3) goto L_0x00d2;
    L_0x00bb:
        r10.append(r5);	 Catch:{ RuntimeException -> 0x00d0 }
        if (r11 == 0) goto L_0x00c5;
    L_0x00c0:
        r1 = com.google.df.FROM_NUMBER_WITHOUT_PLUS_SIGN;	 Catch:{ RuntimeException -> 0x00d0 }
        r12.a(r1);	 Catch:{ RuntimeException -> 0x00d0 }
    L_0x00c5:
        r12.a(r0);
        goto L_0x0008;
    L_0x00ca:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00cc }
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00ce }
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        throw r0;
    L_0x00d2:
        r12.a(r1);
        r0 = r1;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c8.a(java.lang.String, com.google.f8, java.lang.StringBuilder, boolean, com.google.ft):int");
    }

    public void b(String str, String str2, ft ftVar) {
        a(str, str2, true, true, ftVar);
    }

    private boolean b(int i) {
        return this.u.containsKey(Integer.valueOf(i));
    }

    static void b(StringBuilder stringBuilder) {
        stringBuilder.replace(0, stringBuilder.length(), f(stringBuilder.toString()));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(com.google.ft r7, java.lang.String r8) {
        /*
        r6_this = this;
        r0 = 1;
        r1 = 0;
        r2 = r7.a();
        r3 = r6.a(r2, r8);
        if (r3 == 0) goto L_0x001e;
    L_0x000c:
        r4 = J;	 Catch:{ RuntimeException -> 0x0020 }
        r5 = 14;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x0020 }
        r4 = r4.equals(r8);	 Catch:{ RuntimeException -> 0x0020 }
        if (r4 != 0) goto L_0x0024;
    L_0x0018:
        r4 = r6.d(r8);	 Catch:{ RuntimeException -> 0x0022 }
        if (r2 == r4) goto L_0x0024;
    L_0x001e:
        r0 = r1;
    L_0x001f:
        return r0;
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r2 = r3.A();
        r4 = r6.d(r7);
        r2 = r2.e();
        if (r2 != 0) goto L_0x003f;
    L_0x0032:
        r2 = r4.length();
        r3 = 2;
        if (r2 <= r3) goto L_0x003d;
    L_0x0039:
        r3 = 16;
        if (r2 <= r3) goto L_0x001f;
    L_0x003d:
        r0 = r1;
        goto L_0x001f;
    L_0x003f:
        r2 = r6.a(r4, r3);	 Catch:{ RuntimeException -> 0x0049 }
        r3 = com.google.av.UNKNOWN;	 Catch:{ RuntimeException -> 0x0049 }
        if (r2 != r3) goto L_0x001f;
    L_0x0047:
        r0 = r1;
        goto L_0x001f;
    L_0x0049:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c8.b(com.google.ft, java.lang.String):boolean");
    }

    private String a(ft ftVar, List list) {
        int i = b;
        String d = d(ftVar);
        for (String str : list) {
            try {
                f8 i2 = i(str);
                try {
                    if (!i2.W()) {
                        try {
                            if (a(d, i2) != av.UNKNOWN) {
                                return str;
                            }
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    } else if (this.f.a(i2.G()).matcher(d).lookingAt()) {
                        return str;
                    }
                    if (i != 0) {
                        break;
                    }
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (RuntimeException e22) {
                throw e22;
            }
        }
        return null;
    }

    public int h(String str) {
        try {
            if (g(str)) {
                return d(str);
            }
            Logger logger = G;
            Level level = Level.WARNING;
            StringBuilder append = new StringBuilder().append(J[2]);
            if (str == null) {
                str = J[1];
            }
            logger.log(level, append.append(str).append(J[0]).toString());
            return 0;
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    private int d(String str) {
        f8 i = i(str);
        if (i != null) {
            return i.N();
        }
        try {
            throw new IllegalArgumentException(J[49] + str);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    int a(StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        int i = b;
        try {
            if (stringBuilder.length() != 0) {
                if (stringBuilder.charAt(0) != '0') {
                    int length = stringBuilder.length();
                    int i2 = 1;
                    while (i2 <= 3 && i2 <= length) {
                        try {
                            int parseInt = Integer.parseInt(stringBuilder.substring(0, i2));
                            try {
                                if (this.u.containsKey(Integer.valueOf(parseInt))) {
                                    stringBuilder2.append(stringBuilder.substring(i2));
                                    return parseInt;
                                }
                                parseInt = i2 + 1;
                                if (i != 0) {
                                    break;
                                }
                                i2 = parseInt;
                            } catch (RuntimeException e) {
                                throw e;
                            }
                        }
                    }
                    return 0;
                }
            }
            return 0;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.StringBuilder a(java.lang.String r8, boolean r9) {
        /*
        r1 = b;
        r2 = new java.lang.StringBuilder;
        r0 = r8.length();
        r2.<init>(r0);
        r3 = r8.toCharArray();
        r4 = r3.length;
        r0 = 0;
    L_0x0011:
        if (r0 >= r4) goto L_0x002c;
    L_0x0013:
        r5 = r3[r0];
        r6 = 10;
        r6 = java.lang.Character.digit(r5, r6);
        r7 = -1;
        if (r6 == r7) goto L_0x0023;
    L_0x001e:
        r2.append(r6);	 Catch:{ RuntimeException -> 0x002d }
        if (r1 == 0) goto L_0x0028;
    L_0x0023:
        if (r9 == 0) goto L_0x0028;
    L_0x0025:
        r2.append(r5);	 Catch:{ RuntimeException -> 0x002f }
    L_0x0028:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0011;
    L_0x002c:
        return r2;
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x002f }
    L_0x002f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c8.a(java.lang.String, boolean):java.lang.StringBuilder");
    }

    public ff e(ft ftVar) {
        String d = d(ftVar);
        int a = ftVar.a();
        try {
            if (!b(a)) {
                return ff.INVALID_COUNTRY_CODE;
            }
            dt A = a(a, c(a)).A();
            if (A.e()) {
                return a(this.f.a(A.b()), d);
            }
            G.log(Level.FINER, J[15]);
            int length = d.length();
            if (length < 2) {
                try {
                    return ff.TOO_SHORT;
                } catch (RuntimeException e) {
                    throw e;
                }
            } else if (length <= 16) {
                return ff.IS_POSSIBLE;
            } else {
                try {
                    return ff.TOO_LONG;
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    private String a(String str, f8 f8Var, c5 c5Var) {
        return a(str, f8Var, c5Var, null);
    }

    static String b(String str) {
        Matcher matcher = n.matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String substring = str.substring(matcher.start());
        Matcher matcher2 = i.matcher(substring);
        if (matcher2.find()) {
            substring = substring.substring(0, matcher2.start());
            G.log(Level.FINER, J[3] + substring);
        }
        matcher2 = v.matcher(substring);
        return matcher2.find() ? substring.substring(0, matcher2.start()) : substring;
    }

    public String a(ft ftVar, c5 c5Var) {
        try {
            if (ftVar.t() == 0 && ftVar.o()) {
                String b = ftVar.b();
                try {
                    if (b.length() > 0) {
                        return b;
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            StringBuilder stringBuilder = new StringBuilder(20);
            a(ftVar, c5Var, stringBuilder);
            return stringBuilder.toString();
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    static boolean e(String str) {
        return I.matcher(str).matches();
    }

    public ft a(String str, String str2) {
        ft ftVar = new ft();
        b(str, str2, ftVar);
        return ftVar;
    }

    public e8 a(ft ftVar, String str) {
        try {
            return a(ftVar, c(str, J[12]));
        } catch (b5 e) {
            if (e.a() == et.INVALID_COUNTRY_CODE) {
                String c = c(ftVar.a());
                try {
                    if (c.equals(J[11])) {
                        ft ftVar2 = new ft();
                        a(str, null, false, false, ftVar2);
                        return a(ftVar, ftVar2);
                    }
                    e8 a = a(ftVar, c(str, c));
                    return a == e8.EXACT_MATCH ? e8.NSN_MATCH : a;
                } catch (b5 e2) {
                    return e8.NOT_A_NUMBER;
                }
            }
            return e8.NOT_A_NUMBER;
        }
    }

    private boolean g(String str) {
        if (str != null) {
            try {
                if (this.e.contains(str)) {
                    return true;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return false;
    }

    static boolean k(String str) {
        try {
            return str.length() < 2 ? false : s.matcher(str).matches();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(java.lang.String r12, java.lang.String r13, int r14) {
        /*
        r11_this = this;
        r1 = 0;
        r3 = b;
        r0 = J;
        r2 = 8;
        r0 = r0[r2];
        r4 = r0.equals(r13);
        r5 = com.whatsapp.ats.a(r13);	 Catch:{ IOException -> 0x0031 }
        if (r5 != 0) goto L_0x004e;
    L_0x0013:
        r0 = new java.lang.RuntimeException;	 Catch:{ IOException -> 0x002f }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x002f }
        r1.<init>();	 Catch:{ IOException -> 0x002f }
        r2 = J;	 Catch:{ IOException -> 0x002f }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ IOException -> 0x002f }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x002f }
        r1 = r1.append(r13);	 Catch:{ IOException -> 0x002f }
        r1 = r1.toString();	 Catch:{ IOException -> 0x002f }
        r0.<init>(r1);	 Catch:{ IOException -> 0x002f }
        throw r0;	 Catch:{ IOException -> 0x002f }
    L_0x002f:
        r0 = move-exception;
        throw r0;
    L_0x0031:
        r0 = move-exception;
        r0 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = J;
        r3 = 5;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r13);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x004e:
        r6 = new com.google.f8;
        r6.<init>();
        r0 = r5.f;
        r6.c(r0);
        r0 = r5.c;
        r6.c(r0);
        r0 = r5.e;
        r6.b(r0);
        r0 = r5.j;
        if (r0 == 0) goto L_0x00be;
    L_0x0066:
        r0 = r1;
    L_0x0067:
        r2 = r5.j;
        r2 = r2.length;
        if (r0 >= r2) goto L_0x00be;
    L_0x006c:
        r7 = new com.google.e5;
        r7.<init>();
        r2 = r5.j;	 Catch:{ IOException -> 0x00d1 }
        r2 = r2[r0];	 Catch:{ IOException -> 0x00d1 }
        r7.b(r2);	 Catch:{ IOException -> 0x00d1 }
        r2 = r5.a;	 Catch:{ IOException -> 0x00d1 }
        r2 = r2[r0];	 Catch:{ IOException -> 0x00d1 }
        r7.a(r2);	 Catch:{ IOException -> 0x00d1 }
        r2 = r5.k;	 Catch:{ IOException -> 0x00d1 }
        if (r2 == 0) goto L_0x00b4;
    L_0x0083:
        r2 = r5.k;	 Catch:{ IOException -> 0x00d3 }
        r2 = r2.length;	 Catch:{ IOException -> 0x00d3 }
        if (r0 >= r2) goto L_0x00b4;
    L_0x0088:
        r2 = r5.k;	 Catch:{ IOException -> 0x00d5 }
        r2 = r2[r0];	 Catch:{ IOException -> 0x00d5 }
        if (r2 == 0) goto L_0x00b4;
    L_0x008e:
        r2 = r5.k;	 Catch:{ IOException -> 0x00d5 }
        r2 = r2[r0];	 Catch:{ IOException -> 0x00d5 }
        r8 = J;	 Catch:{ IOException -> 0x00d5 }
        r9 = 7;
        r8 = r8[r9];	 Catch:{ IOException -> 0x00d5 }
        r2 = r2.equals(r8);	 Catch:{ IOException -> 0x00d5 }
        if (r2 != 0) goto L_0x00b4;
    L_0x009d:
        r2 = r5.k;
        r2 = r2[r0];
        r8 = "#";
        r8 = android.text.TextUtils.split(r2, r8);
        r9 = r8.length;
        r2 = r1;
    L_0x00a9:
        if (r2 >= r9) goto L_0x00b4;
    L_0x00ab:
        r10 = r8[r2];
        r7.d(r10);
        r2 = r2 + 1;
        if (r3 == 0) goto L_0x00a9;
    L_0x00b4:
        r6.a(r7);
        r6.b(r7);
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0067;
    L_0x00be:
        if (r4 == 0) goto L_0x00cb;
    L_0x00c0:
        r0 = r11.a;	 Catch:{ IOException -> 0x00d7 }
        r1 = java.lang.Integer.valueOf(r14);	 Catch:{ IOException -> 0x00d7 }
        r0.put(r1, r6);	 Catch:{ IOException -> 0x00d7 }
        if (r3 == 0) goto L_0x00d0;
    L_0x00cb:
        r0 = r11.H;	 Catch:{ IOException -> 0x00d7 }
        r0.put(r13, r6);	 Catch:{ IOException -> 0x00d7 }
    L_0x00d0:
        return;
    L_0x00d1:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d3 }
    L_0x00d3:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d5 }
    L_0x00d5:
        r0 = move-exception;
        throw r0;
    L_0x00d7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c8.a(java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r6, com.google.e5 r7, com.google.c5 r8, java.lang.String r9) {
        /*
        r5_this = this;
        r2 = b;
        r0 = r7.a();
        r1 = r5.f;
        r3 = r7.j();
        r1 = r1.a(r3);
        r3 = r1.matcher(r6);
        r1 = "";
        r1 = com.google.c5.NATIONAL;	 Catch:{ RuntimeException -> 0x008f }
        if (r8 != r1) goto L_0x004a;
    L_0x001a:
        if (r9 == 0) goto L_0x004a;
    L_0x001c:
        r1 = r9.length();	 Catch:{ RuntimeException -> 0x0093 }
        if (r1 <= 0) goto L_0x004a;
    L_0x0022:
        r1 = r7.i();	 Catch:{ RuntimeException -> 0x0093 }
        r1 = r1.length();	 Catch:{ RuntimeException -> 0x0093 }
        if (r1 <= 0) goto L_0x004a;
    L_0x002c:
        r1 = r7.i();
        r4 = A;
        r1 = r4.matcher(r1);
        r1 = r1.replaceFirst(r9);
        r4 = F;
        r0 = r4.matcher(r0);
        r0 = r0.replaceFirst(r1);
        r1 = r3.replaceAll(r0);
        if (r2 == 0) goto L_0x0099;
    L_0x004a:
        r1 = r7.e();
        r4 = com.google.c5.NATIONAL;	 Catch:{ RuntimeException -> 0x0095 }
        if (r8 != r4) goto L_0x006a;
    L_0x0052:
        if (r1 == 0) goto L_0x006a;
    L_0x0054:
        r4 = r1.length();	 Catch:{ RuntimeException -> 0x0097 }
        if (r4 <= 0) goto L_0x006a;
    L_0x005a:
        r4 = F;
        r4 = r4.matcher(r0);
        r1 = r4.replaceFirst(r1);
        r1 = r3.replaceAll(r1);
        if (r2 == 0) goto L_0x0099;
    L_0x006a:
        r0 = r3.replaceAll(r0);
    L_0x006e:
        r1 = com.google.c5.RFC3966;
        if (r8 != r1) goto L_0x008e;
    L_0x0072:
        r1 = q;
        r1 = r1.matcher(r0);
        r2 = r1.lookingAt();
        if (r2 == 0) goto L_0x0084;
    L_0x007e:
        r0 = "";
        r0 = r1.replaceFirst(r0);
    L_0x0084:
        r0 = r1.reset(r0);
        r1 = "-";
        r0 = r0.replaceAll(r1);
    L_0x008e:
        return r0;
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0093 }
    L_0x0093:
        r0 = move-exception;
        throw r0;
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0097 }
    L_0x0097:
        r0 = move-exception;
        throw r0;
    L_0x0099:
        r0 = r1;
        goto L_0x006e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c8.a(java.lang.String, com.google.e5, com.google.c5, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.e8 a(com.google.ft r6, com.google.ft r7) {
        /*
        r5_this = this;
        r0 = new com.google.ft;
        r0.<init>();
        r0.a(r6);
        r1 = new com.google.ft;
        r1.<init>();
        r1.a(r7);	 Catch:{ RuntimeException -> 0x0065 }
        r0.p();	 Catch:{ RuntimeException -> 0x0065 }
        r0.e();	 Catch:{ RuntimeException -> 0x0065 }
        r0.u();	 Catch:{ RuntimeException -> 0x0065 }
        r1.p();	 Catch:{ RuntimeException -> 0x0065 }
        r1.e();	 Catch:{ RuntimeException -> 0x0065 }
        r1.u();	 Catch:{ RuntimeException -> 0x0065 }
        r2 = r0.s();	 Catch:{ RuntimeException -> 0x0065 }
        if (r2 == 0) goto L_0x0035;
    L_0x0028:
        r2 = r0.i();	 Catch:{ RuntimeException -> 0x0067 }
        r2 = r2.length();	 Catch:{ RuntimeException -> 0x0067 }
        if (r2 != 0) goto L_0x0035;
    L_0x0032:
        r0.j();	 Catch:{ RuntimeException -> 0x0067 }
    L_0x0035:
        r2 = r1.s();	 Catch:{ RuntimeException -> 0x0069 }
        if (r2 == 0) goto L_0x0048;
    L_0x003b:
        r2 = r1.i();	 Catch:{ RuntimeException -> 0x006b }
        r2 = r2.length();	 Catch:{ RuntimeException -> 0x006b }
        if (r2 != 0) goto L_0x0048;
    L_0x0045:
        r1.j();	 Catch:{ RuntimeException -> 0x006b }
    L_0x0048:
        r2 = r0.s();	 Catch:{ RuntimeException -> 0x006d }
        if (r2 == 0) goto L_0x0073;
    L_0x004e:
        r2 = r1.s();	 Catch:{ RuntimeException -> 0x006f }
        if (r2 == 0) goto L_0x0073;
    L_0x0054:
        r2 = r0.i();	 Catch:{ RuntimeException -> 0x0071 }
        r3 = r1.i();	 Catch:{ RuntimeException -> 0x0071 }
        r2 = r2.equals(r3);	 Catch:{ RuntimeException -> 0x0071 }
        if (r2 != 0) goto L_0x0073;
    L_0x0062:
        r0 = com.google.e8.NO_MATCH;	 Catch:{ RuntimeException -> 0x0071 }
    L_0x0064:
        return r0;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r2 = r0.a();
        r3 = r1.a();
        if (r2 == 0) goto L_0x009a;
    L_0x007d:
        if (r3 == 0) goto L_0x009a;
    L_0x007f:
        r4 = r0.b(r1);	 Catch:{ RuntimeException -> 0x0088 }
        if (r4 == 0) goto L_0x008a;
    L_0x0085:
        r0 = com.google.e8.EXACT_MATCH;	 Catch:{ RuntimeException -> 0x0088 }
        goto L_0x0064;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        if (r2 != r3) goto L_0x0097;
    L_0x008c:
        r0 = r5.b(r0, r1);	 Catch:{ RuntimeException -> 0x0095 }
        if (r0 == 0) goto L_0x0097;
    L_0x0092:
        r0 = com.google.e8.SHORT_NSN_MATCH;	 Catch:{ RuntimeException -> 0x0095 }
        goto L_0x0064;
    L_0x0095:
        r0 = move-exception;
        throw r0;
    L_0x0097:
        r0 = com.google.e8.NO_MATCH;
        goto L_0x0064;
    L_0x009a:
        r0.a(r3);	 Catch:{ RuntimeException -> 0x00a6 }
        r2 = r0.b(r1);	 Catch:{ RuntimeException -> 0x00a6 }
        if (r2 == 0) goto L_0x00a8;
    L_0x00a3:
        r0 = com.google.e8.NSN_MATCH;	 Catch:{ RuntimeException -> 0x00a6 }
        goto L_0x0064;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r0 = r5.b(r0, r1);	 Catch:{ RuntimeException -> 0x00b1 }
        if (r0 == 0) goto L_0x00b3;
    L_0x00ae:
        r0 = com.google.e8.SHORT_NSN_MATCH;	 Catch:{ RuntimeException -> 0x00b1 }
        goto L_0x0064;
    L_0x00b1:
        r0 = move-exception;
        throw r0;
    L_0x00b3:
        r0 = com.google.e8.NO_MATCH;
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c8.a(com.google.ft, com.google.ft):com.google.e8");
    }

    String a(String str, e5 e5Var, c5 c5Var) {
        return a(str, e5Var, c5Var, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r10, java.lang.String r11, boolean r12, boolean r13, com.google.ft r14) {
        /*
        r9_this = this;
        r8 = 2;
        r6 = b;
        if (r10 != 0) goto L_0x0015;
    L_0x0005:
        r0 = new com.google.b5;	 Catch:{ b5 -> 0x0013 }
        r1 = com.google.et.NOT_A_NUMBER;	 Catch:{ b5 -> 0x0013 }
        r2 = J;	 Catch:{ b5 -> 0x0013 }
        r3 = 32;
        r2 = r2[r3];	 Catch:{ b5 -> 0x0013 }
        r0.<init>(r1, r2);	 Catch:{ b5 -> 0x0013 }
        throw r0;	 Catch:{ b5 -> 0x0013 }
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r0 = r10.length();	 Catch:{ b5 -> 0x002b }
        r1 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        if (r0 <= r1) goto L_0x002d;
    L_0x001d:
        r0 = new com.google.b5;	 Catch:{ b5 -> 0x002b }
        r1 = com.google.et.TOO_LONG;	 Catch:{ b5 -> 0x002b }
        r2 = J;	 Catch:{ b5 -> 0x002b }
        r3 = 35;
        r2 = r2[r3];	 Catch:{ b5 -> 0x002b }
        r0.<init>(r1, r2);	 Catch:{ b5 -> 0x002b }
        throw r0;	 Catch:{ b5 -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;
    L_0x002d:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r9.a(r10, r7);	 Catch:{ b5 -> 0x004d }
        r0 = r7.toString();	 Catch:{ b5 -> 0x004d }
        r0 = k(r0);	 Catch:{ b5 -> 0x004d }
        if (r0 != 0) goto L_0x004f;
    L_0x003f:
        r0 = new com.google.b5;	 Catch:{ b5 -> 0x004d }
        r1 = com.google.et.NOT_A_NUMBER;	 Catch:{ b5 -> 0x004d }
        r2 = J;	 Catch:{ b5 -> 0x004d }
        r3 = 36;
        r2 = r2[r3];	 Catch:{ b5 -> 0x004d }
        r0.<init>(r1, r2);	 Catch:{ b5 -> 0x004d }
        throw r0;	 Catch:{ b5 -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        if (r13 == 0) goto L_0x006d;
    L_0x0051:
        r0 = r7.toString();	 Catch:{ b5 -> 0x006b }
        r0 = r9.b(r0, r11);	 Catch:{ b5 -> 0x006b }
        if (r0 != 0) goto L_0x006d;
    L_0x005b:
        r0 = new com.google.b5;	 Catch:{ b5 -> 0x0069 }
        r1 = com.google.et.INVALID_COUNTRY_CODE;	 Catch:{ b5 -> 0x0069 }
        r2 = J;	 Catch:{ b5 -> 0x0069 }
        r3 = 33;
        r2 = r2[r3];	 Catch:{ b5 -> 0x0069 }
        r0.<init>(r1, r2);	 Catch:{ b5 -> 0x0069 }
        throw r0;	 Catch:{ b5 -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ b5 -> 0x0069 }
    L_0x006d:
        if (r12 == 0) goto L_0x0072;
    L_0x006f:
        r14.a(r10);	 Catch:{ b5 -> 0x00d1 }
    L_0x0072:
        r0 = r9.a(r7);
        r1 = r0.length();	 Catch:{ b5 -> 0x00d3 }
        if (r1 <= 0) goto L_0x007f;
    L_0x007c:
        r14.c(r0);	 Catch:{ b5 -> 0x00d3 }
    L_0x007f:
        r2 = r9.i(r11);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r1 = r7.toString();	 Catch:{ b5 -> 0x00d5 }
        r0 = r9;
        r4 = r12;
        r5 = r14;
        r0 = r0.a(r1, r2, r3, r4, r5);	 Catch:{ b5 -> 0x00d5 }
    L_0x0093:
        if (r0 == 0) goto L_0x0182;
    L_0x0095:
        r1 = r9.c(r0);
        r4 = r1.equals(r11);
        if (r4 != 0) goto L_0x017f;
    L_0x009f:
        r0 = r9.a(r0, r1);
    L_0x00a3:
        if (r6 == 0) goto L_0x00bb;
    L_0x00a5:
        b(r7);	 Catch:{ b5 -> 0x011f }
        r3.append(r7);	 Catch:{ b5 -> 0x011f }
        if (r11 == 0) goto L_0x00b6;
    L_0x00ad:
        r1 = r0.N();
        r14.a(r1);	 Catch:{ b5 -> 0x0121 }
        if (r6 == 0) goto L_0x00bb;
    L_0x00b6:
        if (r12 == 0) goto L_0x00bb;
    L_0x00b8:
        r14.e();	 Catch:{ b5 -> 0x0123 }
    L_0x00bb:
        r1 = r3.length();	 Catch:{ b5 -> 0x00cf }
        if (r1 >= r8) goto L_0x0125;
    L_0x00c1:
        r0 = new com.google.b5;	 Catch:{ b5 -> 0x00cf }
        r1 = com.google.et.TOO_SHORT_NSN;	 Catch:{ b5 -> 0x00cf }
        r2 = J;	 Catch:{ b5 -> 0x00cf }
        r3 = 38;
        r2 = r2[r3];	 Catch:{ b5 -> 0x00cf }
        r0.<init>(r1, r2);	 Catch:{ b5 -> 0x00cf }
        throw r0;	 Catch:{ b5 -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r0 = move-exception;
        throw r0;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r0 = move-exception;
        r1 = g;
        r4 = r7.toString();
        r1 = r1.matcher(r4);
        r4 = r0.a();	 Catch:{ b5 -> 0x010f }
        r5 = com.google.et.INVALID_COUNTRY_CODE;	 Catch:{ b5 -> 0x010f }
        if (r4 != r5) goto L_0x0111;
    L_0x00e8:
        r4 = r1.lookingAt();	 Catch:{ b5 -> 0x010f }
        if (r4 == 0) goto L_0x0111;
    L_0x00ee:
        r0 = r1.end();
        r1 = r7.substring(r0);
        r0 = r9;
        r4 = r12;
        r5 = r14;
        r0 = r0.a(r1, r2, r3, r4, r5);
        if (r0 != 0) goto L_0x0093;
    L_0x00ff:
        r0 = new com.google.b5;	 Catch:{ b5 -> 0x010d }
        r1 = com.google.et.INVALID_COUNTRY_CODE;	 Catch:{ b5 -> 0x010d }
        r2 = J;	 Catch:{ b5 -> 0x010d }
        r3 = 34;
        r2 = r2[r3];	 Catch:{ b5 -> 0x010d }
        r0.<init>(r1, r2);	 Catch:{ b5 -> 0x010d }
        throw r0;	 Catch:{ b5 -> 0x010d }
    L_0x010d:
        r0 = move-exception;
        throw r0;
    L_0x010f:
        r0 = move-exception;
        throw r0;
    L_0x0111:
        r1 = new com.google.b5;
        r2 = r0.a();
        r0 = r0.getMessage();
        r1.<init>(r2, r0);
        throw r1;
    L_0x011f:
        r0 = move-exception;
        throw r0;
    L_0x0121:
        r0 = move-exception;
        throw r0;	 Catch:{ b5 -> 0x0123 }
    L_0x0123:
        r0 = move-exception;
        throw r0;
    L_0x0125:
        if (r0 == 0) goto L_0x0138;
    L_0x0127:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r9.a(r3, r0, r1);	 Catch:{ b5 -> 0x014e }
        if (r12 == 0) goto L_0x0138;
    L_0x0131:
        r0 = r1.toString();	 Catch:{ b5 -> 0x014e }
        r14.b(r0);	 Catch:{ b5 -> 0x014e }
    L_0x0138:
        r0 = r3.length();
        if (r0 >= r8) goto L_0x0150;
    L_0x013e:
        r0 = new com.google.b5;	 Catch:{ b5 -> 0x014c }
        r1 = com.google.et.TOO_SHORT_NSN;	 Catch:{ b5 -> 0x014c }
        r2 = J;	 Catch:{ b5 -> 0x014c }
        r3 = 39;
        r2 = r2[r3];	 Catch:{ b5 -> 0x014c }
        r0.<init>(r1, r2);	 Catch:{ b5 -> 0x014c }
        throw r0;	 Catch:{ b5 -> 0x014c }
    L_0x014c:
        r0 = move-exception;
        throw r0;
    L_0x014e:
        r0 = move-exception;
        throw r0;
    L_0x0150:
        r1 = 16;
        if (r0 <= r1) goto L_0x0164;
    L_0x0154:
        r0 = new com.google.b5;	 Catch:{ b5 -> 0x0162 }
        r1 = com.google.et.TOO_LONG;	 Catch:{ b5 -> 0x0162 }
        r2 = J;	 Catch:{ b5 -> 0x0162 }
        r3 = 37;
        r2 = r2[r3];	 Catch:{ b5 -> 0x0162 }
        r0.<init>(r1, r2);	 Catch:{ b5 -> 0x0162 }
        throw r0;	 Catch:{ b5 -> 0x0162 }
    L_0x0162:
        r0 = move-exception;
        throw r0;
    L_0x0164:
        r0 = 0;
        r0 = r3.charAt(r0);	 Catch:{ b5 -> 0x017d }
        r1 = 48;
        if (r0 != r1) goto L_0x0171;
    L_0x016d:
        r0 = 1;
        r14.a(r0);	 Catch:{ b5 -> 0x017d }
    L_0x0171:
        r0 = r3.toString();
        r0 = java.lang.Long.parseLong(r0);
        r14.a(r0);
        return;
    L_0x017d:
        r0 = move-exception;
        throw r0;
    L_0x017f:
        r0 = r2;
        goto L_0x00a3;
    L_0x0182:
        r0 = r2;
        goto L_0x00a5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c8.a(java.lang.String, java.lang.String, boolean, boolean, com.google.ft):void");
    }

    private String a(String str, f8 f8Var, c5 c5Var, String str2) {
        try {
            List S;
            e5 a;
            if (f8Var.S().size() != 0) {
                if (c5Var != c5.NATIONAL) {
                    S = f8Var.S();
                    a = a(S, str);
                    return a != null ? str : a(str, a, c5Var, str2);
                }
            }
            S = f8Var.Q();
            a = a(S, str);
            if (a != null) {
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    f8 i(String str) {
        try {
            if (!g(str)) {
                return null;
            }
            synchronized (this.H) {
                if (!this.H.containsKey(str)) {
                    a(this.r, str, 0);
                }
            }
            return (f8) this.H.get(str);
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
