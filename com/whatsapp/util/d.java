package com.whatsapp.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.whatsapp.vk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class d implements Future, Runnable {
    private static final String[] d;
    private static final String[] e;
    private static final String[] z;
    private final AtomicReference a;
    private final Context b;
    private final CountDownLatch c;

    public d(Context context) {
        this.c = new CountDownLatch(1);
        this.a = new AtomicReference(new ap(null, null));
        this.b = context;
    }

    public ap a(long j, TimeUnit timeUnit) {
        try {
            if (this.c.await(j, timeUnit)) {
                return (ap) this.a.get();
            }
            throw new TimeoutException();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public Object get() {
        return a();
    }

    public void run() {
        Set set = null;
        Set a = a(this.b, d, z[1]);
        Set a2 = a(this.b, e, z[2]);
        try {
            AtomicReference atomicReference = this.a;
            a = a != null ? Collections.unmodifiableSet(a) : null;
            if (a2 != null) {
                set = Collections.unmodifiableSet(a2);
            }
            atomicReference.set(new ap(a, set));
            this.c.countDown();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public boolean isDone() {
        try {
            return this.c.getCount() == 0;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public boolean isCancelled() {
        return false;
    }

    static {
        String[] strArr = new String[3];
        String str = "k)Z\u007fMz8Vt\u001dj$KsSiqM{Ne|RsQb4K:So<\\:Qa>RoM4q";
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
                        i4 = 14;
                        break;
                    case ay.f /*1*/:
                        i4 = 81;
                        break;
                    case ay.n /*2*/:
                        i4 = 57;
                        break;
                    case ay.p /*3*/:
                        i4 = 26;
                        break;
                    default:
                        i4 = 61;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "}4ZuSj0Kc\u0010z0Jq\u0010e8UvX|";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    String[] strArr4 = new String[46];
                    i2 = 0;
                    strArr2 = strArr4;
                    strArr3 = strArr4;
                    str = "l8C4Nz0ZrTl0W{\u0013Z0Jqvg=U\u007fO";
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "m?\u0017yRc\u007fXtY|>P~\u0013a!]{\u0013z0JqPo?";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    str = "m>T4\\|#Vt\u0013z0Jqpo?X}X|";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    str = "m>T4\\|#Vt\u0013z0Jqpo?X}X|\u0017K\u007fX";
                    i = 5;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    str = "m>T4_|8^rI %XiVm=\\{Sk#\u0017{^z8OsIw";
                    i = 6;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "m>T4^a>U4Io\"RqTb=\\h";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "m>T4Xb?N{Ok\u007fxyIg'\\[M~\"x~N";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "m>T4X}%KuSi\"\u0017{Sj#VsY %XiVc0W{Zk#";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "m>T4Zo$\u0017}R =XoSm9\\hXv\u007f^uJg5^\u007fI %XiVc0W{Zk#\\b";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "m>T4Td8WiUo?\u0017q_o%M\u007fOw5VyIa#";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "m>T4Td8WiUo?\u0017q_o%M\u007fOw5VyIa#f\u007fS";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "m>T4Ta3Pn\u0013c>[sQk2XhX";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "m>T4Wo<\\i\u0013]<XhIZ0Jqpo?X}X|";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "m>T4Wo<\\i\u0013]<XhIZ0Jqpo?X}X|\u001dPnX";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "m>T4Wo<\\i\u0013]<XhIZ0Jqpo?X}X|\u0001Ku";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "m>T4Qo%\\~Oa8]4W{8Z\u007fYk7\\tYk#";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "m>T4Qo%\\~Oa8]4W{8Z\u007fYk7\\tYk#\u0017xXz0";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "m>T4Qo%\\~Oa8]4W{8Z\u007fYk7\\tYk#\u0017jQ{\"";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "m>T4Qo%\\~Oa8]4Hb%Pw\\z4SoTm4";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "m>T4Qo%\\~Oa8]4Hb%Pw\\z4SoTm4\u0017hRa%";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "m>T4Qa>RuHz\u007fC{M~4K";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "m>T4Pa3V4Io\"R4Vg=U\u007fO";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "m>T4Sk%HsS 0VnVg=U\u007fO";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "m>T4Sk%HsS <VxTb4^o\\|5";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "m>T4Ok2QsQj\u007fX~Ko?Z\u007fYz0JqVg=U\u007fO";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "m>T4Ok2QsQj\u007fX~Ko?Z\u007fYz0JqVg=U\u007fOh#VcR";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "m>T4Ok2QsQj\u007fX~Ko?Z\u007fYz0JqVg=U\u007fO~#V";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "m>T4Ok2QsQj\u007fZvXo?\\h";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "m>T4Of(MrP 9\\bT}4\u0017n\\}:";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "m>T4No?]4Io\"Rw\\`0^\u007fO";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "m>T4Nz0fxXk#J4\\{%VEIo\"R";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "m>T4Nw<XtIk2\u0017wR`8MuO";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "m>T4Io\"R4Vg=U\u007fO";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "m>T4I`8\u0017N\\}\u001aPvQk#";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "m>T4Gj&VhV}\u007fXtY|>P~\u0013z>Vv_a)";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "m>T4Ga<Ln\u0013y0MyUj>^";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "m>T4Ga<Ln\u0013y0MyUj>^vTz4";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "i!Z4Pw&\\x\u0013f8W\u007fI ?\\n\u0013Z0Jqpo?X}X|";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "g<VxQg7\\4Pk<VhDl>ViIk#\u0017vTz4";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "d!\u0017yR 0IvTa\u007fJsP~=\\n\\}:RsQb4K";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "d!\u0017yR 0IvTa\u007fJsP~=\\n\\}:RsQb4K|Ok4";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "d!\u0017iPo!Qu\u0013\u007f$PyVz0JqVg=U\u007fO";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "c>[s\u0013g?_uQg7\\4Io\"Rw\\`0^\u007fO";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "c>[s\u0013g?_uQg7\\4Io\"Rw\\`0^\u007fO~#V";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "`4M4Qk!\\tZ 3XnIk#@~Rm%Vh";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "`4M4Qk!\\tZ \"LjX|3VbN}";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    d = strArr3;
                    strArr = new String[11];
                    str = "m>T4\\i8U\u007fNa7MhX}>Lh^k";
                    i = 48;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    str = "m>T4\\`%PlT|$J";
                    i = 49;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    str = "m>T4^b4XtPo\"M\u007fO <^o\\|5";
                    i = 50;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    str = "m>T4Xb4ZnOg2JrXk!\u0017{Ng";
                    i = 51;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i2] = str;
                    str = "m>T4X}%KuSi\"\u0017{Sj#VsY !Vj";
                    i = 52;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "m>T4X}%KuSi\"\u0017{Sj#VsY !Vj\u0013m$Iy\\e4";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "m>T4Pk%X}R 0JnOa";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "m>T4Nc0KnJf>\u0017IPo#M\\Tb4t{So6\\h";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "m>T4Nc0KnJf>\u0017IPo#M\\Tb4t{So6\\hm|>";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "`4An\\~!\u0017iD}%\\wMo?\\v";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "`4An\\~!\u0017iD}%\\wMo?\\v\u0013|`";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i2] = str;
                    e = strArr3;
                default:
                    strArr2[i2] = str;
                    str = "~#Pw\\|(\u0014n\\}:\u0014qTb=\\h";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public ap a() {
        this.c.await();
        return (ap) this.a.get();
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public Object get(long j, TimeUnit timeUnit) {
        return a(j, timeUnit);
    }

    private static Set a(Context context, String[] strArr, String str) {
        int i = Log.e;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        Set hashSet = new HashSet();
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            CharSequence charSequence = strArr[i2];
            try {
                CharSequence loadLabel;
                try {
                    loadLabel = packageManager.getApplicationInfo(charSequence, 0).loadLabel(packageManager);
                } catch (Exception e) {
                    Log.e(z[0] + e);
                    loadLabel = charSequence;
                }
                Log.w(str + ' ' + charSequence);
                hashSet.add(new a9(loadLabel, charSequence));
            } catch (NameNotFoundException e2) {
            } catch (RuntimeException e3) {
                Log.e(str + ' ' + e3.getMessage());
            }
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            }
        }
        try {
            break;
            return !hashSet.isEmpty() ? hashSet : null;
        } catch (Exception e4) {
            throw e4;
        }
    }
}
