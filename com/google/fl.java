package com.google;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class fl implements Iterator {
    private static final Pattern a;
    private static final Pattern b;
    private static final Pattern c;
    private static final Pattern g;
    private static final Pattern h;
    private static final Pattern j;
    private static final Pattern k;
    private static final Pattern o;
    private static final String z;
    private f_ d;
    private ak e;
    private final c8 f;
    private int i;
    private final String l;
    private final a3 m;
    private final CharSequence n;
    private long p;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 124;
                    break;
                case ay.f /*1*/:
                    i2 = 118;
                    break;
                case ay.n /*2*/:
                    i2 = 23;
                    break;
                case ay.p /*3*/:
                    i2 = 21;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 9);
        }
        return toCharArray;
    }

    static boolean b(c8 c8Var, ft ftVar, StringBuilder stringBuilder, String[] strArr) {
        int i = c8.b;
        String[] split = c8.k.split(stringBuilder.toString());
        try {
            int length;
            if (ftVar.s()) {
                length = split.length - 2;
            } else {
                length = split.length - 1;
            }
            try {
                if (split.length != 1) {
                    if (!split[length].contains(c8Var.d(ftVar))) {
                        boolean z;
                        int length2 = strArr.length - 1;
                        while (length2 > 0 && length >= 0) {
                            try {
                                if (split[length].equals(strArr[length2])) {
                                    length2--;
                                    length--;
                                    if (i != 0) {
                                        break;
                                    }
                                }
                                return false;
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        if (length >= 0) {
                            try {
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                            if (split[length].endsWith(strArr[0])) {
                                z = true;
                                return z;
                            }
                        }
                        z = false;
                        return z;
                    }
                }
                return true;
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    private f_ a(String str, int i) {
        int i2 = c8.b;
        Matcher matcher = o.matcher(str);
        if (matcher.find()) {
            CharSequence a = a(c8.i, str.substring(0, matcher.start()));
            f_ b = b(a.toString(), i);
            if (b != null) {
                return b;
            }
            this.p--;
            int end = matcher.end();
            f_ b2 = b(a(c8.i, str.substring(end)).toString(), i + end);
            if (b2 != null) {
                return b2;
            }
            this.p--;
            if (this.p > 0) {
                while (matcher.find()) {
                    end = matcher.start();
                    if (i2 != 0) {
                        break;
                    }
                }
                CharSequence a2 = a(c8.i, str.substring(0, end));
                try {
                    if (a2.equals(a)) {
                        return null;
                    }
                    b = b(a2.toString(), i);
                    if (b != null) {
                        return b;
                    }
                    this.p--;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    static boolean a(ft ftVar, String str, c8 c8Var) {
        int i = c8.b;
        int i2 = 0;
        while (i2 < str.length() - 1) {
            char charAt = str.charAt(i2);
            if (charAt == 'x' || charAt == 'X') {
                charAt = str.charAt(i2 + 1);
                if (charAt == 'x' || charAt == 'X') {
                    i2++;
                    try {
                        if (c8Var.a(ftVar, str.substring(i2)) != e8.NSN_MATCH) {
                            return false;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                try {
                    if (!c8.c(str.substring(i2)).equals(ftVar.i())) {
                        return false;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            i2++;
            if (i != 0) {
                break;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean b(char r3) {
        /*
        r0 = 0;
        r1 = java.lang.Character.isLetter(r3);	 Catch:{ IllegalArgumentException -> 0x000f }
        if (r1 != 0) goto L_0x0013;
    L_0x0007:
        r1 = java.lang.Character.getType(r3);	 Catch:{ IllegalArgumentException -> 0x0011 }
        r2 = 6;
        if (r1 == r2) goto L_0x0013;
    L_0x000e:
        return r0;
    L_0x000f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0011 }
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r1 = java.lang.Character.UnicodeBlock.of(r3);
        r2 = java.lang.Character.UnicodeBlock.BASIC_LATIN;	 Catch:{ IllegalArgumentException -> 0x0049 }
        r2 = r1.equals(r2);	 Catch:{ IllegalArgumentException -> 0x0049 }
        if (r2 != 0) goto L_0x0047;
    L_0x001f:
        r2 = java.lang.Character.UnicodeBlock.LATIN_1_SUPPLEMENT;	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = r1.equals(r2);	 Catch:{ IllegalArgumentException -> 0x004b }
        if (r2 != 0) goto L_0x0047;
    L_0x0027:
        r2 = java.lang.Character.UnicodeBlock.LATIN_EXTENDED_A;	 Catch:{ IllegalArgumentException -> 0x004d }
        r2 = r1.equals(r2);	 Catch:{ IllegalArgumentException -> 0x004d }
        if (r2 != 0) goto L_0x0047;
    L_0x002f:
        r2 = java.lang.Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL;	 Catch:{ IllegalArgumentException -> 0x004f }
        r2 = r1.equals(r2);	 Catch:{ IllegalArgumentException -> 0x004f }
        if (r2 != 0) goto L_0x0047;
    L_0x0037:
        r2 = java.lang.Character.UnicodeBlock.LATIN_EXTENDED_B;	 Catch:{ IllegalArgumentException -> 0x0051 }
        r2 = r1.equals(r2);	 Catch:{ IllegalArgumentException -> 0x0051 }
        if (r2 != 0) goto L_0x0047;
    L_0x003f:
        r2 = java.lang.Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS;	 Catch:{ IllegalArgumentException -> 0x0053 }
        r1 = r1.equals(r2);	 Catch:{ IllegalArgumentException -> 0x0053 }
        if (r1 == 0) goto L_0x000e;
    L_0x0047:
        r0 = 1;
        goto L_0x000e;
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fl.b(char):boolean");
    }

    private static String a(int i, int i2) {
        if (i >= 0 && i2 > 0 && i2 >= i) {
            return "{" + i + "," + i2 + "}";
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static String[] a(c8 c8Var, ft ftVar, e5 e5Var) {
        if (e5Var != null) {
            return c8Var.a(c8Var.d(ftVar), e5Var, c5.RFC3966).split("-");
        }
        String a = c8Var.a(ftVar, c5.RFC3966);
        int indexOf = a.indexOf(59);
        if (indexOf < 0) {
            indexOf = a.length();
        }
        return a.substring(a.indexOf(45) + 1, indexOf).split("-");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.f_ b(java.lang.String r5, int r6) {
        /*
        r4_this = this;
        r0 = 0;
        r1 = j;	 Catch:{ IllegalArgumentException -> 0x000e }
        r1 = r1.matcher(r5);	 Catch:{ IllegalArgumentException -> 0x000e }
        r1 = r1.matches();	 Catch:{ IllegalArgumentException -> 0x000e }
        if (r1 != 0) goto L_0x0010;
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        r1 = r4.m;	 Catch:{ b5 -> 0x007d }
        r2 = com.google.a3.VALID;	 Catch:{ b5 -> 0x007d }
        r1 = r1.compareTo(r2);	 Catch:{ b5 -> 0x007d }
        if (r1 < 0) goto L_0x005b;
    L_0x001a:
        if (r6 <= 0) goto L_0x003c;
    L_0x001c:
        r1 = h;	 Catch:{ b5 -> 0x007f }
        r1 = r1.matcher(r5);	 Catch:{ b5 -> 0x007f }
        r1 = r1.lookingAt();	 Catch:{ b5 -> 0x007f }
        if (r1 != 0) goto L_0x003c;
    L_0x0028:
        r1 = r4.n;	 Catch:{ b5 -> 0x0081 }
        r2 = r6 + -1;
        r1 = r1.charAt(r2);	 Catch:{ b5 -> 0x0081 }
        r2 = a(r1);	 Catch:{ b5 -> 0x0083 }
        if (r2 != 0) goto L_0x000d;
    L_0x0036:
        r1 = b(r1);	 Catch:{ b5 -> 0x0083 }
        if (r1 != 0) goto L_0x000d;
    L_0x003c:
        r1 = r5.length();	 Catch:{ b5 -> 0x0081 }
        r1 = r1 + r6;
        r2 = r4.n;	 Catch:{ b5 -> 0x0081 }
        r2 = r2.length();	 Catch:{ b5 -> 0x0081 }
        if (r1 >= r2) goto L_0x005b;
    L_0x0049:
        r2 = r4.n;	 Catch:{ b5 -> 0x0081 }
        r1 = r2.charAt(r1);	 Catch:{ b5 -> 0x0081 }
        r2 = a(r1);	 Catch:{ b5 -> 0x0085 }
        if (r2 != 0) goto L_0x000d;
    L_0x0055:
        r1 = b(r1);	 Catch:{ b5 -> 0x0085 }
        if (r1 != 0) goto L_0x000d;
    L_0x005b:
        r1 = r4.f;	 Catch:{ b5 -> 0x0081 }
        r2 = r4.l;	 Catch:{ b5 -> 0x0081 }
        r2 = r1.a(r5, r2);	 Catch:{ b5 -> 0x0081 }
        r1 = r4.m;	 Catch:{ b5 -> 0x0081 }
        r3 = r4.f;	 Catch:{ b5 -> 0x0081 }
        r1 = r1.a(r2, r5, r3);	 Catch:{ b5 -> 0x0081 }
        if (r1 == 0) goto L_0x000d;
    L_0x006d:
        r2.e();	 Catch:{ b5 -> 0x0081 }
        r2.p();	 Catch:{ b5 -> 0x0081 }
        r2.u();	 Catch:{ b5 -> 0x0081 }
        r1 = new com.google.f_;	 Catch:{ b5 -> 0x0081 }
        r1.<init>(r6, r5, r2);	 Catch:{ b5 -> 0x0081 }
        r0 = r1;
        goto L_0x000d;
    L_0x007d:
        r1 = move-exception;
        throw r1;	 Catch:{ b5 -> 0x007f }
    L_0x007f:
        r1 = move-exception;
        throw r1;	 Catch:{ b5 -> 0x0081 }
    L_0x0081:
        r1 = move-exception;
        goto L_0x000d;
    L_0x0083:
        r1 = move-exception;
        throw r1;	 Catch:{ b5 -> 0x0081 }
    L_0x0085:
        r1 = move-exception;
        throw r1;	 Catch:{ b5 -> 0x0081 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fl.b(java.lang.String, int):com.google.f_");
    }

    static boolean a(String str) {
        int indexOf = str.indexOf(47);
        if (indexOf > 0) {
            try {
                if (str.substring(indexOf + 1).contains("/")) {
                    return true;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return false;
    }

    private static CharSequence a(Pattern pattern, CharSequence charSequence) {
        Matcher matcher = pattern.matcher(charSequence);
        return matcher.find() ? charSequence.subSequence(0, matcher.start()) : charSequence;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    static {
        String str = "XG";
        int i = -1;
        while (true) {
            String z = z(z(str));
            switch (i) {
                case PBE.MD5 /*0*/:
                    g = Pattern.compile(z);
                    str = "TI-=6F-'8:!IKq&'F&H6 \u0012>i!CLL%8!IKq&'F:&TC*s< S^(/RMDJImUIKqrN\u000b";
                    i = 1;
                    break;
                case ay.f /*1*/:
                    k = Pattern.compile(z);
                    str = "'G%HU\u0018\r$hRQYJ*RLGJIm'[8H6'F:&T \u00127N9QDJImX";
                    i = 2;
                    break;
                case ay.n /*2*/:
                    b = Pattern.compile(z);
                    str = "F-'8<!*s";
                    i = 3;
                    break;
                case ay.p /*3*/:
                    a = Pattern.compile(z);
                    str = "T*L\uff1d\uff32";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    String z2 = z(z("U*J\uff1c\uff34"));
                    String str2 = z(z("'(")) + z + z2 + "]";
                    String a = a(0, 3);
                    StringBuilder stringBuilder = new StringBuilder();
                    str = "TI-N";
                    i = -1;
                    while (true) {
                        str = z(z(str));
                        switch (i) {
                            case PBE.MD5 /*0*/:
                                stringBuilder = stringBuilder.append(str);
                                str = "TI-";
                                i = 1;
                                break;
                            case ay.f /*1*/:
                                stringBuilder = stringBuilder.append(str).append(str2).append("+").append("[").append(z2);
                                str = "!_(";
                                i = 2;
                                break;
                            case ay.n /*2*/:
                                stringBuilder = stringBuilder.append(str).append(str2).append("+");
                                str = "TI-N";
                                i = 3;
                                break;
                            case ay.p /*3*/:
                                stringBuilder = stringBuilder.append(str).append(z).append("]").append(str2);
                                str = "W-";
                                i = 4;
                                break;
                            case aj.i /*4*/:
                                stringBuilder = stringBuilder.append(str).append(z2);
                                str = "!_";
                                i = 5;
                                break;
                            case aV.r /*5*/:
                                j = Pattern.compile(stringBuilder.append(str).append(a).append(str2).append("*").toString());
                                z2 = a(0, 2);
                                String a2 = a(0, 4);
                                str2 = a(0, 19);
                                a = z(z("'[o\u2005$\u2069\u2264\u30eb\uff18$\uff73V\u00b7\u00b8\u2002\u201c\u3076?<\uff01\uff75\uff4d\uff2a;U'*J:w\u202f\u224a\uff49H")) + a2;
                                String str3 = z(z(" \u0006l[m\u0001")) + a(1, 19);
                                z = z + z(z("W\uff7d"));
                                String str4 = "[" + z + "]";
                                h = Pattern.compile(str4);
                                stringBuilder = new StringBuilder();
                                str = " \u0006lOt'(";
                                i = -1;
                                while (true) {
                                    str = z(z(str));
                                    switch (i) {
                                        case PBE.MD5 /*0*/:
                                            o = Pattern.compile(stringBuilder.append(str).toString());
                                            stringBuilder = new StringBuilder();
                                            str = "TI-";
                                            i = 1;
                                            break;
                                        case ay.f /*1*/:
                                            stringBuilder = stringBuilder.append(str).append(str4).append(a).append(")").append(z2).append(str3);
                                            str = "TI-";
                                            i = 2;
                                            break;
                                        case ay.n /*2*/:
                                            stringBuilder = stringBuilder.append(str).append(a).append(str3).append(")").append(str2);
                                            str = "TI-";
                                            i = 3;
                                            break;
                                        case ay.p /*3*/:
                                            stringBuilder = stringBuilder.append(str).append(c8.j);
                                            str = "UI";
                                            i = 4;
                                            break;
                                        case aj.i /*4*/:
                                            c = Pattern.compile(stringBuilder.append(str).toString(), 66);
                                        default:
                                            stringBuilder = stringBuilder.append(str).append(z);
                                            str = " \u0006l[m\u0001+=";
                                            i = 0;
                                            break;
                                    }
                                }
                            default:
                                stringBuilder = stringBuilder.append(str).append(z);
                                str = "!_(";
                                i = 0;
                                break;
                        }
                    }
                default:
                    z = z;
                    str = " \u0012l$%I\u000b:>U\u0018\r&9<\u0001*dn9PBjI! \u0012l$%H\u000b";
                    i = 0;
                    break;
            }
        }
    }

    private f_ a(int i) {
        int i2 = c8.b;
        Matcher matcher = c.matcher(this.n);
        while (this.p > 0 && matcher.find(r9)) {
            int start = matcher.start();
            CharSequence a = a(c8.v, this.n.subSequence(start, matcher.end()));
            f_ a2 = a(a, start);
            if (a2 == null) {
                i = start + a.length();
                this.p--;
                if (i2 != 0) {
                    break;
                }
            }
            return a2;
        }
        return null;
    }

    static boolean a(ft ftVar, c8 c8Var) {
        try {
            if (ftVar.v() != df.FROM_DEFAULT_COUNTRY) {
                return true;
            }
            f8 i = c8Var.i(c8Var.c(ftVar.a()));
            if (i == null) {
                return true;
            }
            e5 a = c8Var.a(i.Q(), c8Var.d(ftVar));
            if (a == null) {
                return true;
            }
            try {
                if (a.e().length() <= 0) {
                    return true;
                }
                if (a.g()) {
                    return true;
                }
                String e = a.e();
                try {
                    return c8.c(e.substring(0, e.indexOf(z))).length() != 0 ? c8Var.a(new StringBuilder(c8.c(ftVar.b())), i, null) : true;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasNext() {
        /*
        r2_this = this;
        r0 = r2.e;	 Catch:{ IllegalArgumentException -> 0x002e }
        r1 = com.google.ak.NOT_READY;	 Catch:{ IllegalArgumentException -> 0x002e }
        if (r0 != r1) goto L_0x0026;
    L_0x0006:
        r0 = r2.i;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r0 = r2.a(r0);	 Catch:{ IllegalArgumentException -> 0x0030 }
        r2.d = r0;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r0 = r2.d;	 Catch:{ IllegalArgumentException -> 0x0030 }
        if (r0 != 0) goto L_0x001a;
    L_0x0012:
        r0 = com.google.ak.DONE;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r2.e = r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0 = com.google.c8.b;	 Catch:{ IllegalArgumentException -> 0x0032 }
        if (r0 == 0) goto L_0x0026;
    L_0x001a:
        r0 = r2.d;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0 = r0.b();	 Catch:{ IllegalArgumentException -> 0x0032 }
        r2.i = r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0 = com.google.ak.READY;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r2.e = r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
    L_0x0026:
        r0 = r2.e;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r1 = com.google.ak.READY;	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r0 != r1) goto L_0x0036;
    L_0x002c:
        r0 = 1;
    L_0x002d:
        return r0;
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r0 = 0;
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fl.hasNext():boolean");
    }

    fl(c8 c8Var, CharSequence charSequence, String str, a3 a3Var, long j) {
        this.e = ak.NOT_READY;
        this.d = null;
        this.i = 0;
        if (c8Var == null || a3Var == null) {
            try {
                throw new NullPointerException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (j < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            try {
                this.f = c8Var;
                if (charSequence == null) {
                    charSequence = "";
                }
                this.n = charSequence;
                this.l = str;
                this.m = a3Var;
                this.p = j;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }

    static boolean a(ft ftVar, String str, c8 c8Var, e6 e6Var) {
        int i = c8.b;
        StringBuilder a = c8.a(str, true);
        try {
            if (e6Var.a(c8Var, ftVar, a, a(c8Var, ftVar, null))) {
                return true;
            }
            f8 b = f5.b(ftVar.a());
            if (b != null) {
                for (e5 e5Var : b.Q()) {
                    try {
                        if (!e6Var.a(c8Var, ftVar, a, a(c8Var, ftVar, e5Var))) {
                            if (i != 0) {
                                break;
                            }
                        }
                        return true;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            return false;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public Object next() {
        return a();
    }

    private static boolean a(char c) {
        if (c != '%') {
            try {
                if (Character.getType(c) != 26) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return true;
    }

    public f_ a() {
        try {
            if (hasNext()) {
                f_ f_Var = this.d;
                this.d = null;
                this.e = ak.NOT_READY;
                return f_Var;
            }
            throw new NoSuchElementException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private f_ a(CharSequence charSequence, int i) {
        try {
            if (g.matcher(charSequence).find()) {
                return null;
            }
            try {
                if (k.matcher(charSequence).find()) {
                    return null;
                }
                if (b.matcher(charSequence).find()) {
                    try {
                        if (a.matcher(this.n.toString().substring(charSequence.length() + i)).lookingAt()) {
                            return null;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                String toString = charSequence.toString();
                f_ b = b(toString, i);
                return b == null ? a(toString, i) : b;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    static boolean a(c8 c8Var, ft ftVar, StringBuilder stringBuilder, String[] strArr) {
        int i = c8.b;
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArr.length) {
            i3 = stringBuilder.indexOf(strArr[i2], i3);
            if (i3 >= 0) {
                i3 += strArr[i2].length();
                if (i2 == 0) {
                    try {
                        if (i3 < stringBuilder.length() && Character.isDigit(stringBuilder.charAt(i3))) {
                            return stringBuilder.substring(i3 - strArr[i2].length()).startsWith(c8Var.d(ftVar));
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return false;
        }
        return stringBuilder.substring(i3).contains(ftVar.i());
    }
}
