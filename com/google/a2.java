package com.google;

import java.util.Collections;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class a2 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private static final String[] z;
    private final List a;

    static {
        int i;
        String[] strArr = new String[3];
        char[] toCharArray = "N0fh|d05vtp&|uz#'pjhj'p\u007f=e<pwypo5".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 3;
                    break;
                case ay.f /*1*/:
                    i2 = 85;
                    break;
                case ay.n /*2*/:
                    i2 = 21;
                    break;
                case ay.p /*3*/:
                    i2 = 27;
                    break;
                default:
                    i2 = 29;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "/u".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 3;
                    break;
                case ay.f /*1*/:
                    i2 = 85;
                    break;
                case ay.n /*2*/:
                    i2 = 21;
                    break;
                case ay.p /*3*/:
                    i2 = 27;
                    break;
                default:
                    i2 = 29;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "N0fh|d05l|puxrnp<{|=q0dntq0q;{j0y\u007fn-u53Qj!p;ov;arpfuvtho15urwuq~if'xrsfubst`=5}tf9qh=t0g~=n<fhtm2<5".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 3;
                    break;
                case ay.f /*1*/:
                    i2 = 85;
                    break;
                case ay.n /*2*/:
                    i2 = 21;
                    break;
                case ay.p /*3*/:
                    i2 = 27;
                    break;
                default:
                    i2 = 29;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
    }

    private static String a(List list) {
        boolean z = dy.b;
        StringBuilder stringBuilder = new StringBuilder(z[0]);
        int i = 1;
        for (String str : list) {
            if (i != 0) {
                if (!z) {
                    i = 0;
                    stringBuilder.append(str);
                    if (z) {
                        break;
                    }
                }
                i = 0;
            }
            try {
                stringBuilder.append(z[1]);
            } catch (a2 e) {
                throw e;
            }
            stringBuilder.append(str);
            if (z) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    public List a() {
        return Collections.unmodifiableList(this.a);
    }

    public gc b() {
        return new gc(getMessage());
    }

    public a2(a1 a1Var) {
        super(z[2]);
        this.a = null;
    }

    public a2(List list) {
        super(a(list));
        this.a = list;
    }
}
