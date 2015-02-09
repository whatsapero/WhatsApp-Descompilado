package com.whatsapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class wv extends SQLiteOpenHelper {
    private static final String[] z;
    public b3 a;
    private boolean b;
    private SQLiteDatabase c;
    private boolean d;
    private boolean e;

    static {
        String[] strArr = new String[108];
        String str = "\u000bu4it";
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
                        i3 = 52;
                        break;
                    case ay.n /*2*/:
                        i3 = 112;
                        break;
                    case ay.p /*3*/:
                        i3 = 45;
                        break;
                    default:
                        i3 = 84;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "jx$h\u0006\u000b`1o\u0018n\u0014";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "hf5l\u0000n\u00149c\u0010nlP@1O]\u0011r RD\u0015r>BP/D:OQ\b\r;E\u0014\u001dH'XU\u0017H'\u000b\u001c\u001bH-tF\u0015@;_Q/G=O\u0018P@1O]\u0011r#Jk\u0004T$N\u001d";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "hf5l\u0000n\u00149c\u0010nlP@1O]\u0011r RD\u0015r=EP\u0015UtDZP@1XG\u0011J1X\u0014X@1O]\u0011r#Jk\u0004T$N\u001d";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "{f1j\u0019j\u0014\u0003T:H\\\u0002B:DA\u0003\u0010\u001adf=l\u0018\u0010";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "hf5l\u0000n\u00149c\u0010nlP@1O]\u0011r<JG\u0018r=EP\u0015UtDZP@1XG\u0011J1X\u0014X@1O]\u0011r<JG\u0018\u0004";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "FG\u0017^ DF\u0015\u00030I";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "FG\u0017^ DF\u0015\u00027YQ\u0011Y1\u000b";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "hf5l\u0000n\u00149c\u0010nlP@1O]\u0011r RD\u0015r=EP\u0015UtDZP@1XG\u0011J1X\u0014X@1O]\u0011r#Jk\u0004T$N\u001d";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "of?}t\u007fu2a\u0011\u000b}6\r\u0011s}#y\u0007\u000bF\u0015N1BD\u0004^";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "hf5l\u0000n\u00149c\u0010nlP@1O]\u0011r RD\u0015r>BP/D:OQ\b\r;E\u0014\u001dH'XU\u0017H'\u000b\u001c\u001bH-tF\u0015@;_Q/G=O\u0018P@1O]\u0011r#Jk\u0004T$N\u001d";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "hf5l\u0000n\u00149c\u0010nlP@1O]\u0011r<JG\u0018r=EP\u0015UtDZP@1XG\u0011J1X\u0014X@1O]\u0011r<JG\u0018\u0004";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "hf5l\u0000n\u00149c\u0010nlPJ&DA\u0000r$JF\u0004D7BD\u0011C Xk\u0018D'_[\u0002T\u000bBZ\u0014H,\u000b[\u001e\r3Y[\u0005]\u000b[U\u0002Y=H]\u0000L:_G/E=X@\u001f_-\u000b\u001c\u0017G=O\u001d";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "hf5l\u0000n\u0014%c\u001dza5\r\u001dep5utFQ\u0003^5LQ\u0003r?NM/D:OQ\b\r;E\u0014\u001dH'XU\u0017H'\u000b\u001c\u001bH-tF\u0015@;_Q/G=O\u0018PF1Rk\u0016_;Fk\u001dHx\u000b_\u0015T\u000bBPY";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "of?}t\u007fu2a\u0011\u000b}6\r\u0011s}#y\u0007\u000bS\u0002B![k\u0000L&_]\u0013D$JZ\u0004^";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "of?}t\u007fu2a\u0011\u000b}6\r\u0011s}#y\u0007\u000bY\u0015^'JS\u0015^";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "bz#h\u0006\u007f\u00149c\u0000d\u0014\u001dH'XU\u0017H'\u0003k\u0019Ix\u000b_\u0015T\u000bYQ\u001dB Nk\u001aD0\u0007\u0014\u001bH-tR\u0002B9tY\u0015\u0001t@Q\tr=O\u0018P^ J@\u0005^x\u000bZ\u0015H0Xk\u0000X'C\u0018PI5_U\\\r BY\u0015^ JY\u0000\u0001tFQ\u0014D5tA\u0002Ax\u000bY\u0015I=Jk\u001dD9Nk\u0004T$N\u0018P@1O]\u0011r#Jk\u0004T$N\u0018P@1O]\u0011r'BN\u0015\u0001tFQ\u0014D5tZ\u0011@1\u0007\u0014\u001dH0BU/E5X\\\\\r9NP\u0019L\u000bOA\u0002L B[\u001e\u0001tDF\u0019J=E\u0018PA5_]\u0004X0N\u0018PA;ES\u0019Y!OQ\\\r CA\u001dO\u000bBY\u0011J1\u0007\u0014\u0002H7N]\u0006H0t@\u0019@1X@\u0011@$\u0007\u0014\u0003H:Ok\u0004D9NG\u0004L9[\u0018P_1HQ\u0019] tG\u0015_\"NF/Y=FQ\u0003Y5FD\\\r&NW\u0015D$_k\u0014H\"BW\u0015r BY\u0015^ JY\u0000\u0001tYQ\u0011I\u000bOQ\u0006D7Nk\u0004D9NG\u0004L9[\u0018P]8JM\u0015I\u000bOQ\u0006D7Nk\u0004D9NG\u0004L9[\u001dP{\u0015ga5~t\u0003\u0005\\\rs\u0006\u0005W\u0001t\u001b\u0018P\ny\u001a\u0013\\\ry\u001a\u0018P\u001dx\u000bz%a\u0018\u0007\u0014@\u0001tea<ax\u000bz%a\u0018\u0007\u0014]\u001cx\u000b\u0019A\u0001tea<ax\u000bz%a\u0018\u0007\u0014@\u0001t\u001b\u0018P\u001dx\u000b\u0004\\\r\u001a~x<\u0001t\u0006\u0005\\\ry\u001a\u0018P\u0000e\u0007\u0014]\u001cx\u000b\u0019A\u0001t\u0006\u0005Y";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "of?}t\u007fu2a\u0011\u000b}6\r\u0011s}#y\u0007\u000bW\u0018L tX\u0019^ ";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "hf5l\u0000n\u0014$l\u0016gqPN<J@/A=X@P\u0005\u000bBPPd\u001a\u007fq7h\u0006\u000bd\"d\u0019jf)\r\u001fnmPl\u0001\u007f{9c\u0017yq=h\u001a\u007f\u0018PF1Rk\u0002H9D@\u0015r>BPPy\u0011s`Px\u001abe%hx\u000bY\u0015^'JS\u0015r JV\u001cH\u000bBPPd\u001a\u007fq7h\u0006\u0007\u0014\u0003X6AQ\u0013Yt\u007fq(yx\u000bW\u0002H5_]\u001fCtbz$h\u0013nf\\\r8JG\u0004r&NU\u0014r9NG\u0003L3Nk\u0004L6GQ/D0\u000b}>y\u0011lq\"\u0001tGU\u0003Y\u000bYQ\u0011I\u000bYQ\u0013H=[@/^1E@/@1XG\u0011J1t@\u0011O8Nk\u0019Itbz$h\u0013nf\\\r5YW\u0018D\"NPPd\u001a\u007fq7h\u0006\u0007\u0014\u0003B&_k\u0004D9NG\u0004L9[\u00149c\u0000ns5\u007fx\u000bY\u001fI\u000b_U\u0017\r\u001de`5j\u0011y\u001d";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "hf5l\u0000n\u0014$l\u0016gqP_1HQ\u0019] X\u0014Xr=O\u00149c\u0000ns5\u007ft{f9`\u0015ymPf\u0011r\u00141x\u0000d}>n\u0006ny5c\u0000\u0007\u0014\u001bH-tF\u0015@;_Q/G=O\u0014$h\f\u007f\u0014>b\u0000\u000bz%a\u0018\u0007\u0014\u001bH-t]\u0014\r\u0000nl$\r\u001ad`Pc\u0001gx\\\r&NY\u001fY1tF\u0015^;^F\u0013Ht\u007fq(yx\u000bF\u0015N1BD\u0004r0NB\u0019N1t@\u0019@1X@\u0011@$\u000b}>y\u0011lq\"\u0001tYQ\u0011I\u000bOQ\u0006D7Nk\u0004D9NG\u0004L9[\u00149c\u0000ns5\u007fx\u000bD\u001cL-NP/I1]]\u0013H\u000b_]\u001dH'_U\u001d]tbz$h\u0013nfY";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "hf5l\u0000n\u00149c\u0010nlP_1HQ\u0019] Xk\u001bH-t]\u001eI1S\u0014\u001fCtYQ\u0013H=[@\u0003\r|@Q\tr&NY\u001fY1t^\u0019Ix\u000b_\u0015T\u000bBPY";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "hf5l\u0000n\u0014$l\u0016gqP@1O]\u0011r&NR\u0003\r|t]\u0014\r\u001de`5j\u0011y\u0014 \u007f\u001dfu\"tt`q)\r\u0015~`?d\u001ahf5`\u0011e`\\\r$J@\u0018\r\u0000nl$\r\u0001e}!x\u0011\u0007\u0014\u0002H2tW\u001fX:_\u00149c\u0000ns5\u007f}";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "hf5l\u0000n\u0014%c\u001dza5\r\u001dep5utLF\u001fX$tD\u0011_ BW\u0019]5E@\u0003r=EP\u0015UtDZPJ&DA\u0000r$JF\u0004D7BD\u0011C X\u0014XJ>BP\\\r>BPY";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "of?}t\u007fu2a\u0011\u000b}6\r\u0011s}#y\u0007\u000bY\u0015I=Jk\u0002H2X";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "of?}t\u007fu2a\u0011\u000b}6\r\u0011s}#y\u0007\u000bS\u0002B![k\u0000L&_]\u0013D$JZ\u0004^\u000bC]\u0003Y;YM";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "hf5l\u0000n\u0014$l\u0016gqPJ&DA\u0000r$JF\u0004D7BD\u0011C X\u0014Xr=O\u00149c\u0000ns5\u007ft{f9`\u0015ymPf\u0011r\u00141x\u0000d}>n\u0006ny5c\u0000\u0007\u0014\u0017G=O\u0014$h\f\u007f\u0014>b\u0000\u000bz%a\u0018\u0007\u0014\u001aD0\u000b`5u\u0000\u000bz?ytea<ax\u000bU\u0014@=E\u00149c\u0000ns5\u007fx\u000bD\u0015C0BZ\u0017\r\u001de`5j\u0011y\u001d";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "hf5l\u0000n\u0014$l\u0016gqP@1XG\u0011J1X\u0014Xr=O\u00149c\u0000ns5\u007ft{f9`\u0015ymPf\u0011r\u00141x\u0000d}>n\u0006ny5c\u0000\u0007\u0014\u001bH-tF\u0015@;_Q/G=O\u0014$h\f\u007f\u0014>b\u0000\u000bz%a\u0018\u0007\u0014\u001bH-tR\u0002B9tY\u0015\r\u001de`5j\u0011y\u0018PF1Rk\u0019It\u007fq(yte{$\r\u001a~x<\u0001tX@\u0011Y!X\u00149c\u0000ns5\u007fx\u000bZ\u0015H0Xk\u0000X'C\u00149c\u0000ns5\u007fx\u000bP\u0011Y5\u000b`5u\u0000\u0007\u0014\u0004D9NG\u0004L9[\u00149c\u0000ns5\u007fx\u000bY\u0015I=Jk\u0005_8\u000b`5u\u0000\u0007\u0014\u001dH0BU/@=FQ/Y-[QPy\u0011s`\\\r9NP\u0019L\u000b\\U/Y-[QPy\u0011s`\\\r9NP\u0019L\u000bX]\nHtbz$h\u0013nf\\\r9NP\u0019L\u000bEU\u001dHt\u007fq(yx\u000bY\u0015I=Jk\u0013L$_]\u001fCt\u007fq(yx\u000bY\u0015I=Jk\u0018L'C\u0014$h\f\u007f\u0018P@1O]\u0011r0^F\u0011Y=DZPd\u001a\u007fq7h\u0006\u0007\u0014\u001f_=L]\u001e\r\u001de`5j\u0011y\u0018PA5_]\u0004X0N\u0014\"h\u0015g\u0018PA;ES\u0019Y!OQP\u007f\u0011jx\\\r CA\u001dO\u000bBY\u0011J1\u000b`5u\u0000\u0007\u0014\u0002H9D@\u0015r&NG\u001fX&HQPy\u0011s`\\\r&NW\u0015D\"NP/Y=FQ\u0003Y5FDPd\u001a\u007fq7h\u0006\u0007\u0014\u0003H:Ok\u0004D9NG\u0004L9[\u00149c\u0000ns5\u007fx\u000bF\u0015N1BD\u0004r'NF\u0006H&t@\u0019@1X@\u0011@$\u000b}>y\u0011lq\"\u0001tYQ\u0013H=[@/I1]]\u0013H\u000b_]\u001dH'_U\u001d]tbz$h\u0013nf\\\r&NU\u0014r0NB\u0019N1t@\u0019@1X@\u0011@$\u000b}>y\u0011lq\"\u0001t[X\u0011T1Ok\u0014H\"BW\u0015r BY\u0015^ JY\u0000\r\u001de`5j\u0011y\u0018P_5\\k\u0014L J\u00142a\u001bi\u0018P_1H]\u0000D1E@/N;^Z\u0004\r\u001de`5j\u0011y\u0018P]5Y@\u0019N=[U\u001eY\u000bCU\u0003Et\u007fq(y}";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "hf5l\u0000n\u0014$l\u0016gqPJ&DA\u0000r$JF\u0004D7BD\u0011C Xk\u0018D'_[\u0002Tt\u0003k\u0019Itbz$h\u0013nfP}\u0006by1\u007f\r\u000b\u007f5ttja$b\u001dew\"h\u0019nz$\u0001t_]\u001dH'_U\u001d]tou$h\u0000by5\r\u001ad`Pc\u0001gx\\\r3A]\u0014\r\u0000nl$\r\u001ad`Pc\u0001gx\\\r>BPPy\u0011s`Pc\u001b\u007f\u0014>x\u0018g\u0018PL7_]\u001fCtbz$h\u0013nfPc\u001b\u007f\u0014>x\u0018g\u0018PB8Ok\u0000E5X\\Py\u0011s`Pc\u001b\u007f\u0014>x\u0018g\u0018PC1\\k\u0000E5X\\Py\u0011s`Pc\u001b\u007f\u0014>x\u0018g\u001d";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "ix?o";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "YU\u0007r0J@\u0011";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "GU\u0003Y\u000bYQ\u0011I\u000bYQ\u0013H=[@/^1E@/@1XG\u0011J1t@\u0011O8Nk\u0019I";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "FQ\u0014D5tP\u0005_5_]\u001fC";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "hf5l\u0000n\u0014$l\u0016gqPJ&DA\u0000r$JF\u0004D7BD\u0011C X\u0014Xr=O\u00149c\u0000ns5\u007ft{f9`\u0015ymPf\u0011r\u00141x\u0000d}>n\u0006ny5c\u0000\u0007\u0014\u0017G=O\u0014$h\f\u007f\u0014>b\u0000\u000bz%a\u0018\u0007\u0014\u001aD0\u000b`5u\u0000\u000bz?ytea<ax\u000bU\u0014@=E\u00149c\u0000ns5\u007fx\u000bD\u0015C0BZ\u0017\r\u001de`5j\u0011y\u001d";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "bz$h\u0013nf";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "H\\\u0011Y\u000bG]\u0003Y";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "FQ\u0014D5t@\t]1t]\u001eI1S";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "bz$h\u0013nf";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "FG\u0017^ DF\u0015\u00023N@\u0007_=_U\u0012A1OV_I;EQ_A=X@P";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u007fq(y";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "FG\u0017^ DF\u0015\u00023N@\u0007_=_U\u0012A1OV_B:DD\u0015C";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "bz$h\u0013nf";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "FQ\u0003^5LQ\u0003";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    str = "hf5l\u0000n\u00149c\u0010nlPJ&DA\u0000r$JF\u0004D7BD\u0011C Xk\u0018D'_[\u0002T\u000bBZ\u0014H,\u000b[\u001e\r3Y[\u0005]\u000b[U\u0002Y=H]\u0000L:_G/E=X@\u001f_-\u000b\u001c\u0017G=O\u001d";
                    obj = 42;
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    strArr2 = strArr3;
                    str = "FQ\u0003^5LQ\u0003";
                    obj = 43;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    str = "H\\\u0011Y\u000bG]\u0003Y";
                    obj = 44;
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    strArr2 = strArr3;
                    str = "bz$h\u0013nf";
                    obj = 45;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "YQ\u0011I\u000bOQ\u0006D7Nk\u0004D9NG\u0004L9[";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "FG\u0017^ DF\u0015\u00023N@\u0007_=_U\u0012A1OV_H,BG\u0004^";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "FG\u0017^ DF\u0015\u00023N@\u0007_=_U\u0012A1OV_I;EQ_A=X@P";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "FQ\u0003^5LQ\u0003";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "FQ\u0014D5tW\u0011] B[\u001e";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    str = "YQ\u0013H=[@\u0003";
                    obj = 51;
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    strArr2 = strArr3;
                    str = "FG\u0017^ DF\u0015\u00023N@\u0007_=_U\u0012A1OVPD'\u000bF\u0015L0\u000b[\u001eA-";
                    obj = 52;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "XA\u0012G1H@";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "hf5l\u0000n\u0014$l\u0016gqP_1HQ\u0019] X\u0014Xr=O\u00149c\u0000ns5\u007ft{f9`\u0015ymPf\u0011r\u00141x\u0000d}>n\u0006ny5c\u0000\u0007\u0014\u001bH-tF\u0015@;_Q/G=O\u0014$h\f\u007f\u0014>b\u0000\u000bz%a\u0018\u0007\u0014\u001bH-t]\u0014\r\u0000nl$\r\u001ad`Pc\u0001gx\\\r&NY\u001fY1tF\u0015^;^F\u0013Ht\u007fq(yx\u000bF\u0015N1BD\u0004r0NB\u0019N1t@\u0019@1X@\u0011@$\u000b}>y\u0011lq\"\u0001tYQ\u0011I\u000bOQ\u0006D7Nk\u0004D9NG\u0004L9[\u00149c\u0000ns5\u007fx\u000bD\u001cL-NP/I1]]\u0013H\u000b_]\u001dH'_U\u001d]tbz$h\u0013nfY";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "FQ\u0014D5t\\\u0011^<";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "bz$h\u0013nf";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "hf5l\u0000n\u0014$l\u0016gqPJ&DA\u0000r$JF\u0004D7BD\u0011C Xk\u0018D'_[\u0002Tt\u0003k\u0019Itbz$h\u0013nfP}\u0006by1\u007f\r\u000b\u007f5ttja$b\u001dew\"h\u0019nz$\u0001t_]\u001dH'_U\u001d]tou$h\u0000by5\r\u001ad`Pc\u0001gx\\\r3A]\u0014\r\u0000nl$\r\u001ad`Pc\u0001gx\\\r>BPPy\u0011s`Pc\u001b\u007f\u0014>x\u0018g\u0018PL7_]\u001fCtbz$h\u0013nfPc\u001b\u007f\u0014>x\u0018g\u0018PB8Ok\u0000E5X\\Py\u0011s`Pc\u001b\u007f\u0014>x\u0018g\u0018PC1\\k\u0000E5X\\Py\u0011s`Pc\u001b\u007f\u0014>x\u0018g\u001d";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "GU\u0003Y\u000bYQ\u0011I\u000bFQ\u0003^5LQ/Y5IX\u0015r=O";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "YQ\u0013D$BQ\u001eY\u000bH[\u0005C ";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "bz$h\u0013nf";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "[U\u0002Y=H]\u0000L:_k\u0018L'C";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "FG\u0017^ DF\u0015\u00023N@\u0007_=_U\u0012A1OV_A=X@P";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "FQ\u0003^5LQ\u0003";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "LF\u001fX$tD\u0011_ BW\u0019]5E@\u0003";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "FQ\u0003^5LQ\u0003";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "F[\u0014r JS";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "H\\\u0011Y\u000bG]\u0003Y";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    i = 69;
                    str = "hf5l\u0000n\u00149c\u0010nlP_1HQ\u0019] Xk\u001bH-t]\u001eI1S\u0014\u001fCtYQ\u0013H=[@\u0003\r|@Q\tr&NY\u001fY1t^\u0019Ix\u000b_\u0015T\u000bBPY";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i] = str;
                    i = 70;
                    str = "JF\u0013E=]Q\u0014";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i] = str;
                    i = 71;
                    str = "FG\u0017^ DF\u0015\u00023N@\u0007_=_U\u0012A1OVPI;NG\u001e\n \u000bQ\bD'_";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i] = str;
                    i = 72;
                    str = "H\\\u0011Y\u000bG]\u0003Y";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i] = str;
                    i = 73;
                    str = "bz$h\u0013nf";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i] = str;
                    i = 74;
                    str = "FQ\u0003^5LQ\u0003";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i] = str;
                    i = 75;
                    str = "FQ\u0014D5t\\\u0011^<t]\u001eI1S";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i] = str;
                    i = 76;
                    str = "DF\u0019J=E";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i] = str;
                    i = 77;
                    str = "hf5l\u0000n\u0014%c\u001dza5\r\u001dep5utLF\u001fX$tD\u0011_ BW\u0019]5E@\u0003r=EP\u0015UtDZPJ&DA\u0000r$JF\u0004D7BD\u0011C X\u0014XJ>BP\\\r>BPY";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i] = str;
                    i = 78;
                    str = "bz$h\u0013nf";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i] = str;
                    i = 79;
                    str = "H\\\u0011Y\u000bG]\u0003Y";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i] = str;
                    i = 80;
                    str = "bz$h\u0013nf";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case 79:
                    strArr2[i] = str;
                    i = 81;
                    str = "bz$h\u0013nf";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case 80:
                    strArr2[i] = str;
                    i = 82;
                    str = "bz$h\u0013nf";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case 81:
                    strArr2[i] = str;
                    i = 83;
                    str = "FQ\u0003^5LQ\u0003";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case 82:
                    strArr2[i] = str;
                    str = "H\\\u0011Y\u000bG]\u0003Y";
                    obj = 83;
                    i = 84;
                    strArr2 = strArr3;
                    break;
                case 83:
                    strArr2[i] = str;
                    i = 85;
                    strArr2 = strArr3;
                    str = "FQ\u0014D5t@\t]1t^\u0019I\u000bBZ\u0014H,";
                    obj = 84;
                    break;
                case 84:
                    strArr2[i] = str;
                    i = 86;
                    str = "hf5l\u0000n\u0014$l\u0016gqP@1O]\u0011r&NR\u0003\r|t]\u0014\r\u001de`5j\u0011y\u0014 \u007f\u001dfu\"tt`q)\r\u0015~`?d\u001ahf5`\u0011e`\\\r$J@\u0018\r\u0000nl$\r\u0001e}!x\u0011\u0007\u0014\u0002H2tW\u001fX:_\u00149c\u0000ns5\u007f}";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case 85:
                    strArr2[i] = str;
                    i = 87;
                    str = "FQ\u0003^5LQ\u0003";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case 86:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u007fq(y";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case 87:
                    strArr2[i] = str;
                    i = 89;
                    str = "FQ\u0014D5tF\u0015K'";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case 88:
                    strArr2[i] = str;
                    i = 90;
                    str = "H\\\u0011Y\u000bG]\u0003Y";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case 89:
                    strArr2[i] = str;
                    i = 91;
                    str = "H\\\u0011Y\u000bG]\u0003Y";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case 90:
                    strArr2[i] = str;
                    i = 92;
                    str = "LF\u001fX$tD\u0011_ BW\u0019]5E@\u0003r<BG\u0004B&R";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case 91:
                    strArr2[i] = str;
                    i = 93;
                    str = "X[\u0002Y\u000b_]\u001dH'_U\u001d]";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case 92:
                    strArr2[i] = str;
                    i = 94;
                    str = "[X\u0011T1Ok\u0014H\"BW\u0015r BY\u0015^ JY\u0000";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case 93:
                    strArr2[i] = str;
                    i = 95;
                    str = "HF\u0015L B[\u001e";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case 94:
                    strArr2[i] = str;
                    i = 96;
                    str = "\u007fq(y";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case 95:
                    strArr2[i] = str;
                    i = 97;
                    str = "FQ\u0003^5LQ\u0003";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case 96:
                    strArr2[i] = str;
                    i = 98;
                    str = "FQ\u0003^5LQ\u0003";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case 97:
                    strArr2[i] = str;
                    i = 99;
                    str = "\u007fq(y";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case 98:
                    strArr2[i] = str;
                    i = 100;
                    str = "FG\u0017^ DF\u0015\u00023N@\u0007_=_U\u0012A1OV_@1XG\u0011J1X\u0014\u0003N<NY\u0011\r";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case 99:
                    strArr2[i] = str;
                    i = 101;
                    str = "\f\u000f";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case 100:
                    strArr2[i] = str;
                    i = 102;
                    str = "XQ\u001cH7_\u0014\u0003\\8\u000bR\u0002B9\u000bG\u0001A=_Q/@5X@\u0015_t\\\\\u0015_1\u000b@\t]1\u0016\u0013\u0004L6GQW\r5EPPC5FQM\n";
                    obj = 101;
                    strArr2 = strArr3;
                    break;
                case 101:
                    strArr2[i] = str;
                    i = 103;
                    str = "\f\u000f";
                    obj = 102;
                    strArr2 = strArr3;
                    break;
                case 102:
                    strArr2[i] = str;
                    i = 104;
                    str = "FG\u0017^ DF\u0015\u00023N@\u0007_=_U\u0012A1OV_@1O]\u0011Y-[Q\u0019C0NLP";
                    obj = 103;
                    strArr2 = strArr3;
                    break;
                case 103:
                    strArr2[i] = str;
                    i = 105;
                    str = "XQ\u001cH7_\u0014\u0003\\8\u000bR\u0002B9\u000bG\u0001A=_Q/@5X@\u0015_t\\\\\u0015_1\u000b@\t]1\u0016\u0013\u0019C0NLW\r5EPPC5FQM\n";
                    obj = 104;
                    strArr2 = strArr3;
                    break;
                case 104:
                    strArr2[i] = str;
                    i = 106;
                    str = "FG\u0017^ DF\u0015\u0002![S\u0002L0N\u0014\u0006H&X]\u001fCt";
                    obj = 105;
                    strArr2 = strArr3;
                    break;
                case 105:
                    strArr2[i] = str;
                    i = 107;
                    str = "\u000b@\u001f\r";
                    obj = 106;
                    strArr2 = strArr3;
                    break;
                case 106:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "FG\u0017^ DF\u0015\u00025G@\u0015_\u000b_U\u0012A1\u000b";
                    obj = null;
                    break;
            }
        }
    }

    static void a(wv wvVar) {
        wvVar.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void close() {
        /*
        r1_this = this;
        monitor-enter(r1);
        r0 = r1.c;	 Catch:{ SQLiteException -> 0x0017 }
        if (r0 == 0) goto L_0x0012;
    L_0x0005:
        r0 = r1.c;	 Catch:{ SQLiteException -> 0x0019 }
        r0 = r0.isOpen();	 Catch:{ SQLiteException -> 0x0019 }
        if (r0 == 0) goto L_0x0012;
    L_0x000d:
        r0 = r1.c;	 Catch:{ SQLiteException -> 0x0019 }
        r0.close();	 Catch:{ SQLiteException -> 0x0019 }
    L_0x0012:
        r0 = 0;
        r1.c = r0;	 Catch:{ all -> 0x001b }
        monitor-exit(r1);
        return;
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wv.close():void");
    }

    static void c(wv wvVar) {
        wvVar.c();
    }

    wv(Context context) {
        super(context, z[7], null, 1);
        this.c = null;
    }

    public static void a(int i, byte[] bArr, SQLiteStatement sQLiteStatement) {
        try {
            if (bArr == null) {
                sQLiteStatement.bindNull(i);
                if (m3.d == 0) {
                    return;
                }
            }
            sQLiteStatement.bindBlob(i, bArr);
        } catch (SQLiteException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r3_this = this;
        r0 = r3.e;	 Catch:{ SQLiteException -> 0x001e }
        if (r0 != 0) goto L_0x001d;
    L_0x0004:
        r0 = r3.c;	 Catch:{ SQLiteException -> 0x0020 }
        if (r0 == 0) goto L_0x001d;
    L_0x0008:
        r0 = r3.c;	 Catch:{ SQLiteException -> 0x0022 }
        r0 = r0.isOpen();	 Catch:{ SQLiteException -> 0x0022 }
        if (r0 == 0) goto L_0x001d;
    L_0x0010:
        r0 = r3.c;	 Catch:{ SQLiteException -> 0x0022 }
        r1 = z;	 Catch:{ SQLiteException -> 0x0022 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x0022 }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x0022 }
        r0 = 1;
        r3.e = r0;	 Catch:{ SQLiteException -> 0x0022 }
    L_0x001d:
        return;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wv.b():void");
    }

    public static void a(int i, String str, SQLiteStatement sQLiteStatement) {
        try {
            if (str == null) {
                sQLiteStatement.bindNull(i);
                if (m3.d == 0) {
                    return;
                }
            }
            sQLiteStatement.bindString(i, str);
        } catch (SQLiteException e) {
            throw e;
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(z[5]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        /*
        r5_this = this;
        monitor-enter(r5);
        r0 = r5.c;	 Catch:{ SQLiteException -> 0x0011 }
        if (r0 == 0) goto L_0x0018;
    L_0x0005:
        r0 = r5.c;	 Catch:{ SQLiteException -> 0x0011 }
        r0 = r0.isOpen();	 Catch:{ SQLiteException -> 0x0011 }
        if (r0 == 0) goto L_0x0018;
    L_0x000d:
        r0 = r5.c;	 Catch:{ SQLiteException -> 0x0013 }
    L_0x000f:
        monitor-exit(r5);
        return r0;
    L_0x0011:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0013 }
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
    L_0x0018:
        r0 = com.whatsapp.l7.K();	 Catch:{ all -> 0x0015 }
        r0 = com.whatsapp.l7.e(r0);	 Catch:{ all -> 0x0015 }
        if (r0 != 0) goto L_0x00a4;
    L_0x0022:
        r0 = z;	 Catch:{ all -> 0x0015 }
        r1 = 71;
        r0 = r0[r1];	 Catch:{ all -> 0x0015 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x0015 }
        r0 = com.whatsapp.l7.K();	 Catch:{ all -> 0x02f3 }
        r0 = r0.getParentFile();	 Catch:{ all -> 0x02f3 }
        r0 = r0.exists();	 Catch:{ all -> 0x02f3 }
        if (r0 != 0) goto L_0x0044;
    L_0x0039:
        r0 = com.whatsapp.l7.K();	 Catch:{ all -> 0x02f3 }
        r0 = r0.getParentFile();	 Catch:{ all -> 0x02f3 }
        r0.mkdirs();	 Catch:{ all -> 0x02f3 }
    L_0x0044:
        r0 = com.whatsapp.l7.K();	 Catch:{ all -> 0x02f3 }
        r0.delete();	 Catch:{ all -> 0x02f3 }
        r0 = com.whatsapp.l7.K();	 Catch:{ all -> 0x02f3 }
        r1 = z;	 Catch:{ all -> 0x02f3 }
        r2 = 63;
        r1 = r1[r2];	 Catch:{ all -> 0x02f3 }
        com.whatsapp.l7.a(r0, r1);	 Catch:{ all -> 0x02f3 }
        r0 = com.whatsapp.l7.K();	 Catch:{ all -> 0x02f3 }
        r0 = r0.getAbsolutePath();	 Catch:{ all -> 0x02f3 }
        r1 = 0;
        r2 = 268435472; // 0x10000010 float:2.5243597E-29 double:1.32624745E-315;
        r0 = android.database.sqlite.SQLiteDatabase.openDatabase(r0, r1, r2);	 Catch:{ all -> 0x02f3 }
        r5.c = r0;	 Catch:{ all -> 0x02f3 }
        r0 = r5.c;	 Catch:{ all -> 0x02f3 }
        r0.beginTransaction();	 Catch:{ all -> 0x02f3 }
        r0 = r5.c;	 Catch:{ all -> 0x02f3 }
        r5.onCreate(r0);	 Catch:{ all -> 0x02f3 }
        r0 = r5.c;	 Catch:{ all -> 0x02f3 }
        r0.setTransactionSuccessful();	 Catch:{ all -> 0x02f3 }
        r0 = r5.c;	 Catch:{ all -> 0x0015 }
        if (r0 == 0) goto L_0x008a;
    L_0x007d:
        r0 = r5.c;	 Catch:{ SQLiteException -> 0x02f1 }
        r0 = r0.inTransaction();	 Catch:{ SQLiteException -> 0x02f1 }
        if (r0 == 0) goto L_0x008a;
    L_0x0085:
        r0 = r5.c;	 Catch:{ SQLiteException -> 0x02f1 }
        r0.endTransaction();	 Catch:{ SQLiteException -> 0x02f1 }
    L_0x008a:
        r0 = com.whatsapp.l7.K();	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 38;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        com.whatsapp.l7.a(r0, r1);	 Catch:{ all -> 0x0015 }
        r0 = 1;
        r5.d = r0;	 Catch:{ SQLiteException -> 0x0317 }
        r0 = 1;
        r5.b = r0;	 Catch:{ SQLiteException -> 0x0317 }
        r0 = 1;
        r5.e = r0;	 Catch:{ SQLiteException -> 0x0317 }
        r0 = com.whatsapp.m3.d;	 Catch:{ SQLiteException -> 0x0317 }
        if (r0 == 0) goto L_0x02e4;
    L_0x00a4:
        r0 = z;	 Catch:{ SQLiteException -> 0x0317 }
        r1 = 48;
        r0 = r0[r1];	 Catch:{ SQLiteException -> 0x0317 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SQLiteException -> 0x0317 }
        r0 = com.whatsapp.l7.K();	 Catch:{ SQLiteException -> 0x0317 }
        r0 = r0.getAbsolutePath();	 Catch:{ SQLiteException -> 0x0317 }
        r1 = 0;
        r2 = 16;
        r0 = android.database.sqlite.SQLiteDatabase.openDatabase(r0, r1, r2);	 Catch:{ SQLiteException -> 0x0317 }
        r5.c = r0;	 Catch:{ SQLiteException -> 0x0317 }
        r0 = r5.c;	 Catch:{ SQLiteException -> 0x0317 }
        r0 = r0.isReadOnly();	 Catch:{ SQLiteException -> 0x0317 }
        if (r0 == 0) goto L_0x00cf;
    L_0x00c6:
        r0 = z;	 Catch:{ SQLiteException -> 0x0319 }
        r1 = 53;
        r0 = r0[r1];	 Catch:{ SQLiteException -> 0x0319 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ SQLiteException -> 0x0319 }
    L_0x00cf:
        r0 = z;	 Catch:{ all -> 0x0015 }
        r1 = 42;
        r0 = r0[r1];	 Catch:{ all -> 0x0015 }
        r0 = r5.a(r0);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 98;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 30;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 29;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 97;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 56;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 39;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 44;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 32;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 37;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 66;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 76;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 61;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 74;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 60;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 41;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 83;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 47;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 81;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 64;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 94;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 82;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 50;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 51;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 99;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 87;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 62;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 96;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r0 = z;	 Catch:{ all -> 0x0015 }
        r1 = 45;
        r0 = r0[r1];	 Catch:{ all -> 0x0015 }
        r0 = r5.a(r0);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 79;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 54;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 88;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 72;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 95;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 73;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 68;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 59;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 46;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 90;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 31;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 78;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 35;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 70;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 34;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 84;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 93;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 80;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 91;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 67;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        r3 = z;	 Catch:{ all -> 0x0015 }
        r4 = 57;
        r3 = r3[r4];	 Catch:{ all -> 0x0015 }
        r5.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0015 }
        r0 = z;	 Catch:{ all -> 0x0015 }
        r1 = 89;
        r0 = r0[r1];	 Catch:{ all -> 0x0015 }
        r0 = r5.a(r0);	 Catch:{ all -> 0x0015 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ SQLiteException -> 0x031b }
        if (r0 == 0) goto L_0x024e;
    L_0x0243:
        r0 = r5.c;	 Catch:{ SQLiteException -> 0x031b }
        r1 = z;	 Catch:{ SQLiteException -> 0x031b }
        r2 = 86;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x031b }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x031b }
    L_0x024e:
        r0 = z;	 Catch:{ all -> 0x0015 }
        r1 = 52;
        r0 = r0[r1];	 Catch:{ all -> 0x0015 }
        r0 = r5.a(r0);	 Catch:{ all -> 0x0015 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ SQLiteException -> 0x031d }
        if (r0 == 0) goto L_0x0274;
    L_0x025e:
        r0 = r5.c;	 Catch:{ SQLiteException -> 0x031d }
        r1 = z;	 Catch:{ SQLiteException -> 0x031d }
        r2 = 55;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x031d }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x031d }
        r0 = r5.c;	 Catch:{ SQLiteException -> 0x031d }
        r1 = z;	 Catch:{ SQLiteException -> 0x031d }
        r2 = 69;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x031d }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x031d }
    L_0x0274:
        r0 = z;	 Catch:{ all -> 0x0015 }
        r1 = 65;
        r0 = r0[r1];	 Catch:{ all -> 0x0015 }
        r0 = r5.a(r0);	 Catch:{ all -> 0x0015 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ SQLiteException -> 0x031f }
        if (r0 == 0) goto L_0x029a;
    L_0x0284:
        r0 = r5.c;	 Catch:{ SQLiteException -> 0x031f }
        r1 = z;	 Catch:{ SQLiteException -> 0x031f }
        r2 = 33;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x031f }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x031f }
        r0 = r5.c;	 Catch:{ SQLiteException -> 0x031f }
        r1 = z;	 Catch:{ SQLiteException -> 0x031f }
        r2 = 77;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x031f }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x031f }
    L_0x029a:
        r0 = z;	 Catch:{ all -> 0x0015 }
        r1 = 92;
        r0 = r0[r1];	 Catch:{ all -> 0x0015 }
        r0 = r5.a(r0);	 Catch:{ all -> 0x0015 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ SQLiteException -> 0x0321 }
        if (r0 == 0) goto L_0x02c0;
    L_0x02aa:
        r0 = r5.c;	 Catch:{ SQLiteException -> 0x0321 }
        r1 = z;	 Catch:{ SQLiteException -> 0x0321 }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x0321 }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x0321 }
        r0 = r5.c;	 Catch:{ SQLiteException -> 0x0321 }
        r1 = z;	 Catch:{ SQLiteException -> 0x0321 }
        r2 = 43;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x0321 }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x0321 }
    L_0x02c0:
        r0 = z;	 Catch:{ all -> 0x0015 }
        r1 = 75;
        r0 = r0[r1];	 Catch:{ all -> 0x0015 }
        r0 = r5.b(r0);	 Catch:{ all -> 0x0015 }
        r5.d = r0;	 Catch:{ all -> 0x0015 }
        r0 = z;	 Catch:{ all -> 0x0015 }
        r1 = 36;
        r0 = r0[r1];	 Catch:{ all -> 0x0015 }
        r0 = r5.b(r0);	 Catch:{ all -> 0x0015 }
        r5.b = r0;	 Catch:{ all -> 0x0015 }
        r0 = z;	 Catch:{ all -> 0x0015 }
        r1 = 85;
        r0 = r0[r1];	 Catch:{ all -> 0x0015 }
        r0 = r5.b(r0);	 Catch:{ all -> 0x0015 }
        r5.e = r0;	 Catch:{ all -> 0x0015 }
    L_0x02e4:
        r0 = r5.c;	 Catch:{ all -> 0x0015 }
        if (r0 == 0) goto L_0x02ed;
    L_0x02e8:
        r0 = r5.c;	 Catch:{ SQLiteException -> 0x0323 }
        r5.onOpen(r0);	 Catch:{ SQLiteException -> 0x0323 }
    L_0x02ed:
        r0 = r5.c;	 Catch:{ all -> 0x0015 }
        goto L_0x000f;
    L_0x02f1:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x02f3:
        r0 = move-exception;
        r1 = r5.c;	 Catch:{ SQLiteException -> 0x0313 }
        if (r1 == 0) goto L_0x0305;
    L_0x02f8:
        r1 = r5.c;	 Catch:{ SQLiteException -> 0x0313 }
        r1 = r1.inTransaction();	 Catch:{ SQLiteException -> 0x0313 }
        if (r1 == 0) goto L_0x0305;
    L_0x0300:
        r1 = r5.c;	 Catch:{ SQLiteException -> 0x0315 }
        r1.endTransaction();	 Catch:{ SQLiteException -> 0x0315 }
    L_0x0305:
        r1 = com.whatsapp.l7.K();	 Catch:{ all -> 0x0015 }
        r2 = z;	 Catch:{ all -> 0x0015 }
        r3 = 49;
        r2 = r2[r3];	 Catch:{ all -> 0x0015 }
        com.whatsapp.l7.a(r1, r2);	 Catch:{ all -> 0x0015 }
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x0313:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0315 }
    L_0x0315:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x0317:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0319 }
    L_0x0319:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x031b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x031d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x031f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x0321:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x0323:
        r0 = move-exception;
        r1 = z;	 Catch:{ all -> 0x0015 }
        r2 = 40;
        r1 = r1[r2];	 Catch:{ all -> 0x0015 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x0015 }
        goto L_0x02ed;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wv.getWritableDatabase():android.database.sqlite.SQLiteDatabase");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i(z[8]);
        sQLiteDatabase.execSQL(z[16]);
        sQLiteDatabase.execSQL(z[27]);
        sQLiteDatabase.execSQL(z[14]);
        sQLiteDatabase.execSQL(z[12]);
        sQLiteDatabase.execSQL(z[9]);
        sQLiteDatabase.execSQL(z[11]);
        sQLiteDatabase.execSQL(z[17]);
        sQLiteDatabase.execSQL(z[18]);
        sQLiteDatabase.execSQL(z[19]);
        sQLiteDatabase.execSQL(z[10]);
        sQLiteDatabase.execSQL(z[20]);
        sQLiteDatabase.execSQL(z[21]);
        sQLiteDatabase.execSQL(z[15]);
        sQLiteDatabase.execSQL(z[26]);
        sQLiteDatabase.execSQL(z[23]);
        sQLiteDatabase.execSQL(z[25]);
        sQLiteDatabase.execSQL(z[28]);
        sQLiteDatabase.execSQL(z[13]);
        sQLiteDatabase.execSQL(z[24]);
        sQLiteDatabase.execSQL(z[22]);
        sQLiteDatabase.setVersion(1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(java.lang.String r8) {
        /*
        r7_this = this;
        r1 = 0;
        r0 = "";
        r2 = r7.c;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.append(r8);
        r4 = z;
        r5 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.toString();
        r4 = 0;
        r3 = r2.rawQuery(r3, r4);
        if (r3 == 0) goto L_0x003b;
    L_0x002d:
        r2 = r3.moveToNext();	 Catch:{ Exception -> 0x0043 }
        if (r2 == 0) goto L_0x0038;
    L_0x0033:
        r2 = 0;
        r0 = r3.getString(r2);	 Catch:{ Exception -> 0x0043 }
    L_0x0038:
        r3.close();
    L_0x003b:
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Exception -> 0x006b }
        if (r0 != 0) goto L_0x006d;
    L_0x0041:
        r0 = 1;
    L_0x0042:
        return r0;
    L_0x0043:
        r2 = move-exception;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0066 }
        r4.<init>();	 Catch:{ all -> 0x0066 }
        r5 = z;	 Catch:{ all -> 0x0066 }
        r6 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r5 = r5[r6];	 Catch:{ all -> 0x0066 }
        r4 = r4.append(r5);	 Catch:{ all -> 0x0066 }
        r2 = r2.toString();	 Catch:{ all -> 0x0066 }
        r2 = r4.append(r2);	 Catch:{ all -> 0x0066 }
        r2 = r2.toString();	 Catch:{ all -> 0x0066 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ all -> 0x0066 }
        r3.close();
        goto L_0x003b;
    L_0x0066:
        r0 = move-exception;
        r3.close();
        throw r0;
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r0 = r1;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wv.b(java.lang.String):boolean");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.i(z[106] + i + z[107] + i2);
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r3_this = this;
        r0 = r3.b;	 Catch:{ SQLiteException -> 0x001e }
        if (r0 != 0) goto L_0x001d;
    L_0x0004:
        r0 = r3.c;	 Catch:{ SQLiteException -> 0x0020 }
        if (r0 == 0) goto L_0x001d;
    L_0x0008:
        r0 = r3.c;	 Catch:{ SQLiteException -> 0x0022 }
        r0 = r0.isOpen();	 Catch:{ SQLiteException -> 0x0022 }
        if (r0 == 0) goto L_0x001d;
    L_0x0010:
        r0 = r3.c;	 Catch:{ SQLiteException -> 0x0022 }
        r1 = z;	 Catch:{ SQLiteException -> 0x0022 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x0022 }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x0022 }
        r0 = 1;
        r3.b = r0;	 Catch:{ SQLiteException -> 0x0022 }
    L_0x001d:
        return;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wv.c():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r7) {
        /*
        r6_this = this;
        r0 = "";
        r1 = r6.c;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r7);
        r3 = z;
        r4 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = 0;
        r2 = r1.rawQuery(r2, r3);
        if (r2 == 0) goto L_0x003a;
    L_0x002c:
        r1 = r2.moveToNext();	 Catch:{ Exception -> 0x003b }
        if (r1 == 0) goto L_0x0037;
    L_0x0032:
        r1 = 0;
        r0 = r2.getString(r1);	 Catch:{ Exception -> 0x003b }
    L_0x0037:
        r2.close();
    L_0x003a:
        return r0;
    L_0x003b:
        r1 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0068 }
        r3.<init>();	 Catch:{ all -> 0x0068 }
        r4 = z;	 Catch:{ all -> 0x0068 }
        r5 = 100;
        r4 = r4[r5];	 Catch:{ all -> 0x0068 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0068 }
        r3 = r3.append(r7);	 Catch:{ all -> 0x0068 }
        r4 = " ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x0068 }
        r1 = r1.toString();	 Catch:{ all -> 0x0068 }
        r1 = r3.append(r1);	 Catch:{ all -> 0x0068 }
        r1 = r1.toString();	 Catch:{ all -> 0x0068 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ all -> 0x0068 }
        r2.close();
        goto L_0x003a;
    L_0x0068:
        r0 = move-exception;
        r2.close();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wv.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r3_this = this;
        r0 = r3.d;	 Catch:{ SQLiteException -> 0x001e }
        if (r0 != 0) goto L_0x001d;
    L_0x0004:
        r0 = r3.c;	 Catch:{ SQLiteException -> 0x0020 }
        if (r0 == 0) goto L_0x001d;
    L_0x0008:
        r0 = r3.c;	 Catch:{ SQLiteException -> 0x0022 }
        r0 = r0.isOpen();	 Catch:{ SQLiteException -> 0x0022 }
        if (r0 == 0) goto L_0x001d;
    L_0x0010:
        r0 = r3.c;	 Catch:{ SQLiteException -> 0x0022 }
        r1 = z;	 Catch:{ SQLiteException -> 0x0022 }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x0022 }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x0022 }
        r0 = 1;
        r3.d = r0;	 Catch:{ SQLiteException -> 0x0022 }
    L_0x001d:
        return;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wv.a():void");
    }

    public static void a(int i, Object obj, SQLiteStatement sQLiteStatement) {
        if (obj == null) {
            try {
                sQLiteStatement.bindNull(i);
                if (m3.d == 0) {
                    return;
                }
            } catch (SQLiteException e) {
                throw e;
            }
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
        sQLiteStatement.bindBlob(i, byteArrayOutputStream.toByteArray());
    }

    static void b(wv wvVar) {
        wvVar.b();
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        return getWritableDatabase();
    }

    public void a(b3 b3Var) {
        this.a = b3Var;
    }

    private void a(String str, String str2, String str3, String str4) {
        if (!str.contains(str3 + " " + str4)) {
            try {
                this.c.execSQL(z[2] + str2 + z[0] + str3 + " " + str4);
            } catch (SQLiteException e) {
                Log.e(z[1] + str3 + " " + e.toString());
            }
        }
    }
}
