package com.google;

import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public abstract class f4 {
    public static int a;
    private static final String[] z;
    private final da b;
    private final ds c;

    static {
        String[] strArr = new String[17];
        String str = "\u0018\fp";
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
                        i3 = 43;
                        break;
                    case ay.f /*1*/:
                        i3 = 62;
                        break;
                    case ay.n /*2*/:
                        i3 = 64;
                        break;
                    case ay.p /*3*/:
                        i3 = 49;
                        break;
                    default:
                        i3 = 25;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0018\fp";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u001a\u000b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0018\u000fp";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0018\fp";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001a\u000b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0018\fp";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001a\r";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001a\r";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u001a\t";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0018\u000fp";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0018\u000fp";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001a\t";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u001a\u000f";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0018\u000fp";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "^P+_v\\P`U|HQ$Tk\u0011\u001e";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u001a\u000f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public abstract String c();

    protected final da b() {
        return this.b;
    }

    public static f4 a(da daVar) {
        try {
            if (daVar.c(1)) {
                return new fS(daVar);
            }
            try {
                if (!daVar.c(2)) {
                    return new g9(daVar);
                }
                switch (ds.a(daVar, 1, 4)) {
                    case aj.i /*4*/:
                        try {
                            return new ge(daVar);
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    case aV.r /*5*/:
                        return new gD(daVar);
                    default:
                        switch (ds.a(daVar, 1, 5)) {
                            case a6.s /*12*/:
                                try {
                                    return new f6(daVar);
                                } catch (IllegalStateException e2) {
                                    throw e2;
                                }
                            case a6.z /*13*/:
                                return new fj(daVar);
                            default:
                                switch (ds.a(daVar, 1, 7)) {
                                    case vk.SherlockTheme_popupMenuStyle /*56*/:
                                        try {
                                            return new f7(daVar, z[15], z[1]);
                                        } catch (IllegalStateException e22) {
                                            throw e22;
                                        }
                                    case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                                        return new f7(daVar, z[0], z[14]);
                                    case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                                        return new f7(daVar, z[12], z[8]);
                                    case vk.SherlockTheme_windowNoTitle /*59*/:
                                        return new f7(daVar, z[7], z[9]);
                                    case vk.SherlockTheme_windowActionBar /*60*/:
                                        return new f7(daVar, z[11], z[3]);
                                    case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                                        return new f7(daVar, z[5], z[6]);
                                    case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                                        return new f7(daVar, z[4], z[10]);
                                    case vk.SherlockTheme_windowSplitActionBar /*63*/:
                                        return new f7(daVar, z[2], z[13]);
                                    default:
                                        throw new IllegalStateException(z[16] + daVar);
                                }
                        }
                }
            } catch (IllegalStateException e222) {
                throw e222;
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    f4(da daVar) {
        this.b = daVar;
        this.c = new ds(daVar);
    }

    protected final ds a() {
        return this.c;
    }
}
