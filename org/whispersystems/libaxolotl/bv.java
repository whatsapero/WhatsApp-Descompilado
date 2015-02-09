package org.whispersystems.libaxolotl;

import com.google.M;
import com.google.ap;
import com.google.cn;
import com.google.er;
import com.google.gI;
import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;

final class bv implements gI {
    private static final String[] z;

    static {
        String[] strArr = new String[22];
        String str = "Kbf]X|wY[I";
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
                        i3 = 25;
                        break;
                    case ay.f /*1*/:
                        i3 = 3;
                        break;
                    case ay.n /*2*/:
                        i3 = 18;
                        break;
                    case ay.p /*3*/:
                        i3 = 62;
                        break;
                    default:
                        i3 = 48;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "IqwuU`Jv";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "[ba[{|z";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "PgwPDpwkuU`";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "ZjbVUkwwFD";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Pg";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "PwwLQmj}P";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "JjuPYwdY[I";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "ZksW^Rfk";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "Kbf]X|wY[I";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "IqwHYvva}_lmf[B";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "[ba[{|zAWWwbfKB|";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "PwwLQmj}P";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "TfaMQ~f";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "[ba[{|z";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "Pg";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "ZjbVUkwwFD";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    str = "Pg";
                    obj = 17;
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    strArr2 = strArr3;
                    str = "ZlgPD|q";
                    obj = 18;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "KfuWCmqsJYvm[Z";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "PgwPDpwkuU`";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "JjuPU}S`[{|z[Z";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public ap a(cn cnVar) {
        int i = aI.d;
        aI.a(cnVar);
        aI.c((M) aI.h().c().get(0));
        aI.a(new er(aI.f(), new String[]{z[0], z[19], z[11], z[17]}));
        aI.e((M) aI.h().c().get(1));
        aI.c(new er(aI.k(), new String[]{z[20], z[2], z[1], z[3], z[4], z[14]}));
        aI.b((M) aI.h().c().get(2));
        aI.b(new er(aI.a(), new String[]{z[18], z[15], z[10], z[21], z[12]}));
        aI.a((M) aI.h().c().get(3));
        aI.d(new er(aI.d(), new String[]{z[16], z[7], z[5]}));
        aI.d((M) aI.h().c().get(4));
        aI.e(new er(aI.e(), new String[]{z[6], z[13], z[9], z[8]}));
        if (i != 0) {
            bD.m = !bD.m;
        }
        return null;
    }

    bv() {
    }
}
