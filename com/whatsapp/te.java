package com.whatsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.Z;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.a9;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;
import org.whispersystems.libaxolotl.az;
import org.whispersystems.libaxolotl.bX;
import org.whispersystems.libaxolotl.v;

final class te extends SQLiteOpenHelper {
    private static final String[] z;

    static {
        String[] strArr = new String[51];
        String str = "\fmtoK\u0019y5gF";
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
                        i3 = 109;
                        break;
                    case ay.f /*1*/:
                        i3 = 21;
                        break;
                    case ay.n /*2*/:
                        i3 = 27;
                        break;
                    case ay.p /*3*/:
                        i3 = 3;
                        break;
                    default:
                        i3 = 36;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = ".G^Bp(5NMm<@^#m#Q^[\u0004\u0000phpE\npDaE\u001epDhA\u0014Jrg\\MZU#I\bfhbC\bJybW\bJpf]M=vpC2~~z{\u001fpvlP\bJqj@A5vpC2~~z{\u000bgtn{\u0000p7#I\u001erDhA\u0014Jrg\r";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = ",YOFvMAZAh(5hfW\u001e|tmWMT_G\u0004.ZWVi#5ojI\bfobI\u001d5RMp(R^Q";
                    obj = 2;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u001ephpM\u0002{h";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0019|vfW\u0019tvs";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Mat#";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\fmtoK\u0019y;vT\ngzgA\t5hvG\u000ephpB\u0018ywz";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\fmtoK\u0019y;vT\ngzgM\u0003r;gFMsilIM";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "M8%#";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "Mat#";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "8{pmK\u001a{;vT\ngzgAMsilIM";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "8{pmK\u001a{;vT\ngzgAMq~pP\u0004{zwM\u0002{;uA\u001ffrlJW5";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ".G^Bp(5OBf!P;pA\u0003q~q{\u0006pbp\u0004EJrg\u0004$[OFc(G;Sv$XZQ}M^^Z\u0004,@OLm#VIFi([O/\u0004\u001epugA\u001fJpf]2|\u007f#p(MO#q#\\JVaM[TW\u0004#@WO\bMf~m@\bgDhA\u0014JifG\u0002g\u007f#f!ZY#j\"A;Mq!Y2";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ".G^Bp(5OBf!P;pA\u0003q~q{\u0006pbp\u0004EJrg\u0004$[OFc(G;Sv$XZQ}M^^Z\u0004,@OLm#VIFi([O/\u0004\u001epugA\u001fJpf]2|\u007f#p(MO#q#\\JVaM[TW\u0004#@WO\bMf~m@\bgDhA\u0014JifG\u0002g\u007f#f!ZY#j\"A;Mq!Y2";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u001dgruE\u0019pDhA\u0014";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u001e||mA\tJkqA\u0006pbp";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = ".G^Bp(5NMm<@^#m#Q^[\u0004\u0000phpE\npDaE\u001epDhA\u0014Jrg\\MZU#I\bfhbC\bJybW\bJpf]M=vpC2~~z{\u001fpvlP\bJqj@A5vpC2~~z{\u000bgtn{\u0000p7#I\u001erDhA\u0014Jrg\r";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u001fp|jW\u0019gzwM\u0002{Dj@";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = ".G^Bp(5OBf!P;j@\b{ojP\u0004ph#\f2|\u007f#m#A^Da?5KQm TIZ\u0004&PB#e8ATJj.G^Na#A7#V\bvrsM\b{o\\M\t5RMp(R^Q\u00048[RRq(9;qA\n|hwV\farlJ2|\u007f#m#A^Da?9;sQ\u000fyr`{\u0006pb#f!ZY/\u0004\u001dgruE\u0019pDhA\u00145YOk/9;mA\u0015aDsV\b~~z{\u0004q;Jj9P\\FvA5ojI\bfobI\u001d5RMp(R^Q\r";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = ".G^Bp(5OBf!P;pA\u001efrlJ\u001e53\\M\t5RMp(R^Q\u0004=GRNe?L;Ha45ZVp\"\\U@v(X^MpA5ifG\u0004erfJ\u0019Jrg\u0004$[OFc(G;Vj$DNF\bMg~`K\u001fq;Ah\"W7#P\u0004x~pP\fxk#m#A^Da?<";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    str = "\u000eg~bP\u0004{|#E\u0015zwlP\u00015\u007fbP\fwzpAMc~qW\u0004zu#\u0010";
                    obj = 20;
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    strArr2 = strArr3;
                    str = ".G^Bp(5OBf!P;nA\u001efzdA2wzpA2~~z\u0004EJrg\u0004$[OFc(G;Sv$XZQ}M^^Z\u0004,@OLm#VIFi([O/\u0004\u0000f|\\O\blDqA\u0000zof{\u0007|\u007f#p(MO#j\"A;Mq!Y7#I\u001erDhA\u0014J}qK\u0000Jvf\u0004/ZTOa,[;Mk95UVh!9;nW\nJpf]2|\u007f#p(MO#j\"A;Mq!Y7#H\ffo\\E\u0001|xf{\u000fthf{\u0006pb#f!ZY#j\"A;Mq!Y7#P\u0004x~pP\fxk#m#A^Da?<";
                    obj = 21;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\fmtoK\u0019y;dA\u0003pibP\bq;1\u0014]5kqAM~~zW";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = ".G^Bp(5OBf!P;pM\n{~g{\u001dg~hA\u0014f;+{\u0004q;Jj9P\\FvMEIJi,GB#o(L;Bq9ZRMg?PVFj99;sV\b~~z{\u0004q;Jj9P\\FvM@UJu8P7#P\u0004x~pP\fxk#m#A^Da?9;qA\u000ezig\u0004/YTA\r";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u001fpxlV\t";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0004q~mP\u0004arfW";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    str = "\u001fpxjT\u0004puw{\u0004q";
                    obj = 26;
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    strArr2 = strArr3;
                    str = "\u001d`yoM\u000eJpf]";
                    obj = 27;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0003pcw{\u001dg~hA\u0014Jrg";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\fmtoK\u0019y;jJ\u001epiwA\t5rgA\u0003arw]M~~z\u0004\u001dtrq";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\fmtoK\u0019y;jJ\u001epiwA\t5hjC\u0003p\u007f#T\u001fppf]";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0019|vfW\u0019tvs";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u000eg~bP\bq;b\\\u0002ytwHMqzwE\u000fthf\u0004\u001bpipM\u0002{;7";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u001dg~hA\u0014Jrg";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0019|vfW\u0019tvs";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    str = ".G^Bp(5OBf!P;sV\b~~zWM=Dj@M\\UWa*PI#t?\\VBv45PF}MTNWk$[XQa PUW\bMeifO\blDj@M\\UWa*PI#q#\\JVaA5hfJ\u0019Jol{\u001epiuA\u001f5YLk!PZM\bMg~`K\u001fq;Ah\"W2";
                    obj = 35;
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    strArr2 = strArr3;
                    str = "\u001dg~hA\u0014Jrg";
                    obj = 36;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0004q~mP\u0004arfW";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u001dg~hA\u0014f";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0004q~mP\u0004arfW";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\fmtoK\u0019y;dA\u0003pibP\u0004{|#\u0016]%;mA\u001a5kqA\u0006pbp\u0004\f{\u007f#V\bvtq@\bq;wL\bx;jJMasf\u0004\tw";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u0003pcw{\u001dg~hA\u0014Jrg";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u001fpxjT\u0004puw{\u0004q;>\u0004R";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0003pcw{\u001dg~hA\u0014Jrg";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u001epuw{\u0019zDpA\u001fc~q";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\fmtoK\u0019y;dA\u0003pibP\u0004{|#T\u001fppf]MwzwG\u00055hwE\u001farmCMsilIM";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = " |hpM\u0003r;fJ\u0019gb#B\u0002g;pA\u0001s;jJM|\u007ffJ\u0019|ojA\u001e5obF\u0001p";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u001fpxlV\t";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\fmtoK\u0019y;dA\u0003pibP\bq;1\u0014]5ufSMeifO\blh#E\u0003q;qA\u000ezigA\t5okA\u00005rm\u0004\u0019}~#@\u000f";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u001fpxjT\u0004puw{\u0004q;>\u0004R";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = ".G^Bp(5OBf!P;nA\u001efzdA2wzpA2~~z\u0004EJrg\u0004$[OFc(G;Sv$XZQ}M^^Z\u0004,@OLm#VIFi([O/\u0004\u0000f|\\O\blDqA\u0000zof{\u0007|\u007f#p(MO#j\"A;Mq!Y7#I\u001erDhA\u0014J}qK\u0000Jvf\u0004/ZTOa,[;Mk95UVh!9;nW\nJpf]2|\u007f#p(MO#j\"A;Mq!Y7#H\ffo\\E\u0001|xf{\u000fthf{\u0006pb#f!ZY#j\"A;Mq!Y7#P\u0004x~pP\fxk#m#A^Da?<";
                    obj = null;
                    break;
            }
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase, long j) {
        sQLiteDatabase.execSQL(z[3]);
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[5], Long.valueOf(j));
        sQLiteDatabase.update(z[4], contentValues, null, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r5, int r6, int r7) {
        /*
        r4_this = this;
        r0 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0056 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x0056 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0056 }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0056 }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0056 }
        r0 = r0.append(r6);	 Catch:{ RuntimeException -> 0x0056 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0056 }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0056 }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0056 }
        r0 = r0.append(r7);	 Catch:{ RuntimeException -> 0x0056 }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x0056 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0056 }
        r0 = 4;
        if (r7 == r0) goto L_0x0058;
    L_0x002b:
        r0 = new android.database.sqlite.SQLiteException;	 Catch:{ RuntimeException -> 0x0056 }
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0056 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0056 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0056 }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x0056 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0056 }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1.append(r7);	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0056 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0056 }
        throw r0;	 Catch:{ RuntimeException -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        throw r0;
    L_0x0058:
        r0 = java.lang.System.currentTimeMillis();
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 / r2;
        switch(r6) {
            case 1: goto L_0x008e;
            case 2: goto L_0x0091;
            case 3: goto L_0x0094;
            default: goto L_0x0062;
        };
    L_0x0062:
        r0 = new android.database.sqlite.SQLiteException;	 Catch:{ RuntimeException -> 0x008c }
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x008c }
        r1.<init>();	 Catch:{ RuntimeException -> 0x008c }
        r2 = z;	 Catch:{ RuntimeException -> 0x008c }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x008c }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x008c }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x008c }
        r2 = z;	 Catch:{ RuntimeException -> 0x008c }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x008c }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x008c }
        r1 = r1.append(r7);	 Catch:{ RuntimeException -> 0x008c }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x008c }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x008c }
        throw r0;	 Catch:{ RuntimeException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        throw r0;
    L_0x008e:
        r4.a(r5, r0);	 Catch:{ RuntimeException -> 0x00a4 }
    L_0x0091:
        r4.b(r5);
    L_0x0094:
        r4.a(r5);	 Catch:{ RuntimeException -> 0x008c }
        r0 = com.whatsapp.f_.c;	 Catch:{ RuntimeException -> 0x008c }
        if (r0 != 0) goto L_0x0062;
    L_0x009b:
        r0 = z;
        r1 = 7;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        return;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.te.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(z[1]);
        sQLiteDatabase.execSQL(z[2]);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(z[13]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.database.sqlite.SQLiteDatabase r12) {
        /*
        r11_this = this;
        r10 = 0;
        r9 = 0;
        r8 = com.whatsapp.f_.c;
        r12.beginTransaction();
        r0 = z;	 Catch:{ all -> 0x0049 }
        r1 = 40;
        r1 = r0[r1];	 Catch:{ all -> 0x0049 }
        r0 = 1;
        r2 = new java.lang.String[r0];	 Catch:{ all -> 0x0049 }
        r0 = 0;
        r3 = z;	 Catch:{ all -> 0x0049 }
        r4 = 42;
        r3 = r3[r4];	 Catch:{ all -> 0x0049 }
        r2[r0] = r3;	 Catch:{ all -> 0x0049 }
        r0 = z;	 Catch:{ all -> 0x0049 }
        r3 = 43;
        r3 = r0[r3];	 Catch:{ all -> 0x0049 }
        r0 = 1;
        r4 = new java.lang.String[r0];	 Catch:{ all -> 0x0049 }
        r0 = 0;
        r5 = -1;
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x0049 }
        r4[r0] = r5;	 Catch:{ all -> 0x0049 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r0 = r12;
        r0 = r0.query(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0049 }
        r1 = r0.moveToNext();	 Catch:{ RuntimeException -> 0x0047 }
        if (r1 != 0) goto L_0x004e;
    L_0x0038:
        r0.close();	 Catch:{ RuntimeException -> 0x0047 }
        r0 = new android.database.sqlite.SQLiteException;	 Catch:{ RuntimeException -> 0x0047 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0047 }
        r2 = 47;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0047 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0047 }
        throw r0;	 Catch:{ RuntimeException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        r12.endTransaction();
        throw r0;
    L_0x004e:
        r1 = 0;
        r1 = r0.getInt(r1);	 Catch:{ all -> 0x0049 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0049 }
        r2.<init>();	 Catch:{ all -> 0x0049 }
        r3 = z;	 Catch:{ all -> 0x0049 }
        r4 = 46;
        r3 = r3[r4];	 Catch:{ all -> 0x0049 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0049 }
        r2 = r2.append(r1);	 Catch:{ all -> 0x0049 }
        r2 = r2.toString();	 Catch:{ all -> 0x0049 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ all -> 0x0049 }
        r0.close();	 Catch:{ all -> 0x0049 }
        r0 = new android.content.ContentValues;	 Catch:{ all -> 0x0049 }
        r0.<init>();	 Catch:{ all -> 0x0049 }
        r2 = z;	 Catch:{ all -> 0x0049 }
        r3 = 44;
        r2 = r2[r3];	 Catch:{ all -> 0x0049 }
        r3 = r1 + 200;
        r4 = org.whispersystems.libaxolotl.a9.a;	 Catch:{ all -> 0x0049 }
        r4 = r4 + -1;
        r3 = r3 % r4;
        r3 = r3 + 1;
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x0049 }
        r0.put(r2, r3);	 Catch:{ all -> 0x0049 }
        r2 = z;	 Catch:{ all -> 0x0049 }
        r3 = 38;
        r2 = r2[r3];	 Catch:{ all -> 0x0049 }
        r3 = z;	 Catch:{ all -> 0x0049 }
        r4 = 50;
        r3 = r3[r4];	 Catch:{ all -> 0x0049 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x0049 }
        r5 = 0;
        r6 = -1;
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x0049 }
        r4[r5] = r6;	 Catch:{ all -> 0x0049 }
        r12.update(r2, r0, r3, r4);	 Catch:{ all -> 0x0049 }
        r12.setTransactionSuccessful();	 Catch:{ all -> 0x0049 }
        r12.endTransaction();
        r0 = z;
        r2 = 41;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r0 = org.whispersystems.libaxolotl.v.a(r1, r0);
        r1 = new android.content.ContentValues;
        r1.<init>();
        r2 = r0.iterator();
    L_0x00c3:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0108;
    L_0x00c9:
        r0 = r2.next();
        r0 = (org.whispersystems.libaxolotl.bo) r0;
        r1.clear();
        r3 = z;
        r4 = 37;
        r3 = r3[r4];
        r4 = r0.a();
        r4 = java.lang.Integer.valueOf(r4);
        r1.put(r3, r4);
        r3 = z;
        r4 = 48;
        r3 = r3[r4];
        r0 = r0.c();
        r1.put(r3, r0);
        r0 = z;
        r3 = 45;
        r0 = r0[r3];
        r3 = java.lang.Boolean.valueOf(r9);
        r1.put(r0, r3);
        r0 = z;
        r3 = 39;
        r0 = r0[r3];
        r12.insertOrThrow(r0, r10, r1);
        if (r8 == 0) goto L_0x00c3;
    L_0x0108:
        r0 = z;	 Catch:{ RuntimeException -> 0x011a }
        r1 = 49;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x011a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x011a }
        r0 = com.whatsapp.DialogToastActivity.i;	 Catch:{ RuntimeException -> 0x011a }
        if (r0 == 0) goto L_0x0119;
    L_0x0115:
        r0 = r8 + 1;
        com.whatsapp.f_.c = r0;	 Catch:{ RuntimeException -> 0x011a }
    L_0x0119:
        return;
    L_0x011a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.te.c(android.database.sqlite.SQLiteDatabase):void");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        boolean z = false;
        int i = f_.c;
        Log.i(z[21]);
        sQLiteDatabase.execSQL(z[19]);
        sQLiteDatabase.execSQL(z[36]);
        sQLiteDatabase.execSQL(z[20]);
        sQLiteDatabase.execSQL(z[24]);
        sQLiteDatabase.execSQL(z[22]);
        sQLiteDatabase.execSQL(z[17]);
        sQLiteDatabase.execSQL(z[14]);
        Log.i(z[33]);
        az a = v.a();
        ContentValues contentValues = new ContentValues();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        contentValues.put(z[27], Integer.valueOf(-1));
        contentValues.put(z[18], Integer.valueOf(v.a(true)));
        contentValues.put(z[28], a.b().b());
        contentValues.put(z[15], a.a().b());
        contentValues.put(z[29], Integer.valueOf(v.a(a9.a - 1) + 1));
        contentValues.put(z[32], Long.valueOf(currentTimeMillis));
        sQLiteDatabase.insertOrThrow(z[26], null, contentValues);
        Log.i(z[30]);
        try {
            bX a2 = v.a(a, 0);
            contentValues = new ContentValues();
            try {
                contentValues.put(z[34], Integer.valueOf(0));
                contentValues.put(z[35], Long.valueOf(currentTimeMillis));
                contentValues.put(z[25], a2.a());
                sQLiteDatabase.insertOrThrow(z[16], null, contentValues);
                Log.i(z[31]);
                c(sQLiteDatabase);
                Log.i(z[23]);
                if (i != 0) {
                    if (!DialogToastActivity.i) {
                        z = true;
                    }
                    DialogToastActivity.i = z;
                }
            } catch (Z e) {
                throw e;
            } catch (Z e2) {
                throw e2;
            }
        } catch (Throwable e3) {
            throw new RuntimeException(e3);
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        try {
            super.onOpen(sQLiteDatabase);
            if (VERSION.SDK_INT >= 11) {
                sQLiteDatabase.enableWriteAheadLogging();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public te(Context context) {
        super(context, z[0], null, 4);
    }
}
