package com.whatsapp.wallpaper;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.whatsapp.App;
import com.whatsapp.a54;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class p {
    public static boolean a;
    private static Drawable b;
    private static final String[] z;

    static {
        String[] strArr = new String[51];
        String str = ",\u0000\u0010j::\u0011\u0019te<\u0004\b&";
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
                        i3 = 91;
                        break;
                    case ay.f /*1*/:
                        i3 = 97;
                        break;
                    case ay.n /*2*/:
                        i3 = 124;
                        break;
                    case ay.p /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 74;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ",\u0000\u0010j::\u0011\u0019te8\u0000\u0012h%/A\u0018c)4\u0005\u0019&.>\u0007\u001ds&/A\u000bg&7\u0011\u001dv/)";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = ",\u0000\u0010j::\u0011\u0019td1\u0011\u001b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ",\u0000\u0010j::\u0011\u0019td1\u0011\u001b";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ",\u0000\u0010j::\u0011\u0019te)\u0004\u000fc>";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    str = ",\u0000\u0010j::\u0011\u0019td1\u0011\u001b";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "{\u001d\\";
                    obj = 6;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "{\u001d\\";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "k!";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "j!";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ",\u0000\u0010j::\u0011\u0019te(\u0004\bQ+7\r,g:>\u0013F]";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ",\u0000\u0010j::\u0011\u0019tg";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "8\u000e\u0011(=3\u0000\bu++\u0011#v8>\u0007\u0019t/5\u0002\u0019u";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ",\u0000\u0010j::\u0011\u0019td1\u0011\u001b";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ",\u0000\u0010j::\u0011\u0019te?\u0004\u001ag?7\u0015";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = ",\u0000\u0010j::\u0011\u0019td9\n\tv";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = ",\u0000\u0010j::\u0011\u0019te)\u0004\u000fr%)\u0004Si?/N\u0015i/)\u0013\u0013tj";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = ",\u0000\u0010j::\u0011\u0019te)\u0004\u000fr%)\u0004\\e%6\u0011\u0010c>>";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = ",\u0000\u0010j::\u0011\u0019td9\n\tv";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = ",\u0000\u0010j::\u0011\u0019te)\u0004\u000fr%)\u0004So$t\b\u0013c8)\u000e\u000e&";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = ",\u0000\u0010j::\u0011\u0019te)\u0004\u000fr%)\u0004Si?/N\u0015i/)\u0013\u0013tj";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = ",\u0000\u0010j::\u0011\u0019te)\u0004\u000fr%)\u0004Se%+\u0018\\";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = ",\u0000\u0010j::\u0011\u0019te)\u0004\u000fr%)\u0004So$t\b\u0013c8)\u000e\u000e&";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = ",\b\u0012b%,";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0019\u0000\u001fm?+\u0012";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = ",\u0000\u0010j::\u0011\u0019te)\u0004\u000fr%)\u0004So%>\u0013\u000ei8{";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = ",\u0000\u0010j::\u0011\u0019te)\u0004\u000fr%)\u0004\\u!2\u0011\fo$<A\u001ao$:\r\\t/5\u0000\u0011cj?\u0014\u0019&>4A\u000fo0>A\u0011o96\u0000\be\"";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = ",\u0000\u0010j::\u0011\u0019te)\u0004\u000fr%)\u0004\\e%.\r\u0018&$4\u0015\\t/5\u0000\u0011cj/\f\f&,2\r\u0019";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = ",\u0000\u0010j::\u0011\u0019te)\u0004\u000fr%)\u0004So$t\b\u0013c8)\u000e\u000e&";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = ",\u0000\u0010j::\u0011\u0019td1\u0011\u001b";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = ",\u0000\u0010j::\u0011\u0019te)\u0004\u000fr%)\u0004Si?/N\u0015i/)\u0013\u0013tj";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "u\u000b\fa";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "8\u000e\u0011(=3\u0000\bu++\u0011Rq+7\r\fg:>\u0013";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "8\u000e\u0011(=3\u0000\bu++\u0011#v8>\u0007\u0019t/5\u0002\u0019u";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = ",\u0000\u0010j::\u0011\u0019tg";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = ",\u0000\u0010j::\u0011\u0019te<\u0004\bQ+7\r,g:>\u0013F]";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = ",\u0000\u0010j::\u0011\u0019td1\u0011\u001b";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = ",\u0000\u0010j::\u0011\u0019te4\u000e\u0011";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = ",\u0000\u0010j::\u0011\u0019te(\u0004\b&";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = ",\u0000\u0010j::\u0011\u0019te5\u0000\u0011c$4\u0015\u001ai?5\u0005\u0019~)>\u0011\bo%5";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "8\u000e\u0011(=3\u0000\bu++\u0011Rq+7\r\fg:>\u0013";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = ",\u0000\u0010j::\u0011\u0019te)\u0014\u0012r#6\u0004\u0019~)>\u0011\bo%5";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = ",\u0000\u0010j::\u0011\u0019te9\u0000\u001fm?+N\u000fo0>A";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "6\u000e\th>>\u0005";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0019\u0000\u001fm?+\u0012";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = ",\u0000\u0010j::\u0011\u0019td1\u0011\u001b";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = ",\u0000\u0010j::\u0011\u0019td9\n\tv";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = ",\u0000\u0010j::\u0011\u0019te9\u0000\u001fm?+N\u000fb):\u0013\u0018Y?5\u0000\ng#7\u0000\u001ej/{";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = ",\u0000\u0010j::\u0011\u0019te9\u0000\u001fm?+N\u0019t84\u0013\\";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = ",\b\u0012b%,";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ",\u0000\u0010j::\u0011\u0019te<\u0004\b&$.\r\u0010";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable a(android.content.Context r7, boolean r8, int r9, android.net.Uri r10, int r11, int r12) {
        /*
        r6 = 2131624282; // 0x7f0e015a float:1.887574E38 double:1.0531623276E-314;
        r5 = 0;
        r1 = com.whatsapp.wallpaper.ImageViewTouchBase.e;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 39;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r8);
        r2 = " ";
        r0 = r0.append(r2);
        r0 = r0.append(r11);
        r2 = "x";
        r0 = r0.append(r2);
        r0 = r0.append(r12);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = 0;
        b = r0;
        if (r8 == 0) goto L_0x0107;
    L_0x0039:
        r0 = r7.getPackageManager();	 Catch:{ NameNotFoundException -> 0x009d, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
        r2 = z;	 Catch:{ NameNotFoundException -> 0x009d, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
        r3 = 41;
        r2 = r2[r3];	 Catch:{ NameNotFoundException -> 0x009d, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
        r0 = r0.getResourcesForApplication(r2);	 Catch:{ NameNotFoundException -> 0x009d, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
        r0 = r0.getDrawable(r9);	 Catch:{ NameNotFoundException -> 0x009d, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
        b = r0;	 Catch:{ NameNotFoundException -> 0x009d, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
        r0 = b;	 Catch:{ NameNotFoundException -> 0x009d, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
        r0 = (android.graphics.drawable.BitmapDrawable) r0;	 Catch:{ NameNotFoundException -> 0x009d, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
        r0 = r0.getBitmap();	 Catch:{ NameNotFoundException -> 0x009d, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
        r0 = a(r0, r11, r12);	 Catch:{ NameNotFoundException -> 0x009d, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
        if (r0 == 0) goto L_0x0064;
    L_0x005b:
        r2 = new android.graphics.drawable.BitmapDrawable;	 Catch:{ NameNotFoundException -> 0x0099, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
        r2.<init>(r0);	 Catch:{ NameNotFoundException -> 0x0099, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
        b = r2;	 Catch:{ NameNotFoundException -> 0x0099, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
        if (r1 == 0) goto L_0x006f;
    L_0x0064:
        r0 = 2131624282; // 0x7f0e015a float:1.887574E38 double:1.0531623276E-314;
        r0 = r7.getString(r0);	 Catch:{ NameNotFoundException -> 0x009b, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
        r2 = 0;
        com.whatsapp.App.b(r7, r0, r2);	 Catch:{ NameNotFoundException -> 0x009b, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
    L_0x006f:
        r0 = b;
        if (r0 == 0) goto L_0x0096;
    L_0x0073:
        r0 = z;	 Catch:{ IOException -> 0x013e }
        r1 = 37;
        r0 = r0[r1];	 Catch:{ IOException -> 0x013e }
        r1 = 0;
        r1 = r7.openFileOutput(r0, r1);	 Catch:{ IOException -> 0x013e }
        r0 = b;	 Catch:{ IOException -> 0x013e }
        r0 = (android.graphics.drawable.BitmapDrawable) r0;	 Catch:{ IOException -> 0x013e }
        r0 = r0.getBitmap();	 Catch:{ IOException -> 0x013e }
        r2 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ IOException -> 0x013e }
        r3 = 90;
        r0.compress(r2, r3, r1);	 Catch:{ IOException -> 0x013e }
        r1.flush();	 Catch:{ IOException -> 0x013e }
        r1.close();	 Catch:{ IOException -> 0x013e }
    L_0x0093:
        b(r7);
    L_0x0096:
        r0 = b;
        return r0;
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x009b, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x009d, RuntimeException -> 0x00c0, OutOfMemoryError -> 0x00e3 }
    L_0x009d:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 40;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r7.getString(r6);
        com.whatsapp.App.b(r7, r0, r5);
        goto L_0x006f;
    L_0x00c0:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 42;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r7.getString(r6);
        com.whatsapp.App.b(r7, r0, r5);
        goto L_0x006f;
    L_0x00e3:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 38;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r7.getString(r6);
        com.whatsapp.App.b(r7, r0, r5);
        if (r1 == 0) goto L_0x006f;
    L_0x0107:
        r0 = com.whatsapp.App.e;	 Catch:{ FileNotFoundException -> 0x0130 }
        r0 = r0.openInputStream(r10);	 Catch:{ FileNotFoundException -> 0x0130 }
        r0 = android.graphics.BitmapFactory.decodeStream(r0);	 Catch:{ FileNotFoundException -> 0x0130 }
        if (r0 == 0) goto L_0x0120;
    L_0x0113:
        r2 = new android.graphics.drawable.BitmapDrawable;	 Catch:{ NameNotFoundException -> 0x013a }
        r3 = r7.getResources();	 Catch:{ NameNotFoundException -> 0x013a }
        r2.<init>(r3, r0);	 Catch:{ NameNotFoundException -> 0x013a }
        b = r2;	 Catch:{ NameNotFoundException -> 0x013a }
        if (r1 == 0) goto L_0x012b;
    L_0x0120:
        r0 = 2131624282; // 0x7f0e015a float:1.887574E38 double:1.0531623276E-314;
        r0 = r7.getString(r0);	 Catch:{ NameNotFoundException -> 0x013c }
        r1 = 0;
        com.whatsapp.App.b(r7, r0, r1);	 Catch:{ NameNotFoundException -> 0x013c }
    L_0x012b:
        r0 = 1;
        a = r0;	 Catch:{ FileNotFoundException -> 0x0130 }
        goto L_0x006f;
    L_0x0130:
        r0 = move-exception;
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x006f;
    L_0x013a:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x013c }
    L_0x013c:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0130 }
    L_0x013e:
        r0 = move-exception;
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0093;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.p.a(android.content.Context, boolean, int, android.net.Uri, int, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(android.content.Context r11) {
        /*
        r10 = 1;
        r1 = 0;
        r4 = com.whatsapp.wallpaper.ImageViewTouchBase.e;
        r0 = new java.io.File;
        r2 = new java.io.File;
        r3 = com.whatsapp.App.ao;
        r5 = z;
        r6 = 25;
        r5 = r5[r6];
        r2.<init>(r3, r5);
        r3 = z;
        r5 = 19;
        r3 = r3[r5];
        r0.<init>(r2, r3);
        r5 = new java.io.File;
        r2 = r11.getFilesDir();
        r3 = z;
        r6 = 30;
        r3 = r3[r6];
        r5.<init>(r2, r3);
        r2 = r0.exists();	 Catch:{ IOException -> 0x0032 }
        if (r2 != 0) goto L_0x0034;
    L_0x0031:
        return;
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r6 = new java.io.File;
        r2 = r11.getFilesDir();
        r3 = z;
        r7 = 16;
        r3 = r3[r7];
        r6.<init>(r2, r3);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r7 = 22;
        r3 = r3[r7];
        r2 = r2.append(r3);
        r3 = r0.getName();
        r2 = r2.append(r3);
        r3 = " ";
        r2 = r2.append(r3);
        r8 = r0.length();
        r2 = r2.append(r8);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r3 = 0;
        r2.<init>(r6, r3);	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r3 = java.nio.channels.Channels.newChannel(r2);	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r2 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x020e, all -> 0x0205 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x020e, all -> 0x0205 }
        r2 = r2.getChannel();	 Catch:{ IOException -> 0x020e, all -> 0x0205 }
        com.whatsapp.util.at.a(r2, r3);	 Catch:{ IOException -> 0x0212, all -> 0x0208 }
        r2.close();	 Catch:{ IOException -> 0x0212, all -> 0x0208 }
        r2 = 0;
        r3.close();	 Catch:{ IOException -> 0x020e, all -> 0x0205 }
        r3 = 0;
        r0 = new android.graphics.BitmapFactory$Options;	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r0.<init>();	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r7 = 1;
        r0.inJustDecodeBounds = r7;	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r7 = r6.getAbsolutePath();	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        android.graphics.BitmapFactory.decodeFile(r7, r0);	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r7 = r0.outWidth;	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r0 = z;	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r8 = 24;
        r0 = r0[r8];	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r0 = r11.getSystemService(r0);	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r0 = (android.view.WindowManager) r0;	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r8 = r0.getDefaultDisplay();	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r0 = r11.getResources();	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r0 = r0.getConfiguration();	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        r0 = r0.orientation;	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        if (r0 != r10) goto L_0x00c0;
    L_0x00ba:
        r0 = r8.getWidth();	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
        if (r4 == 0) goto L_0x00c4;
    L_0x00c0:
        r0 = r8.getHeight();	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
    L_0x00c4:
        if (r0 == r7) goto L_0x00d1;
    L_0x00c6:
        r0 = z;	 Catch:{ IOException -> 0x0118, all -> 0x01b4 }
        r7 = 27;
        r0 = r0[r7];	 Catch:{ IOException -> 0x0118, all -> 0x01b4 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0118, all -> 0x01b4 }
        if (r4 == 0) goto L_0x00eb;
    L_0x00d1:
        r0 = r6.renameTo(r5);	 Catch:{ IOException -> 0x011a, all -> 0x01b4 }
        if (r0 != 0) goto L_0x00e2;
    L_0x00d7:
        r0 = z;	 Catch:{ IOException -> 0x011c, all -> 0x01b4 }
        r5 = 28;
        r0 = r0[r5];	 Catch:{ IOException -> 0x011c, all -> 0x01b4 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x011c, all -> 0x01b4 }
        if (r4 == 0) goto L_0x00eb;
    L_0x00e2:
        r0 = z;	 Catch:{ IOException -> 0x011e, all -> 0x01b4 }
        r4 = 18;
        r0 = r0[r4];	 Catch:{ IOException -> 0x011e, all -> 0x01b4 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x011e, all -> 0x01b4 }
    L_0x00eb:
        if (r1 == 0) goto L_0x00f0;
    L_0x00ed:
        r2.close();	 Catch:{ IOException -> 0x016f, RuntimeException -> 0x016d }
    L_0x00f0:
        if (r1 == 0) goto L_0x0031;
    L_0x00f2:
        r3.close();	 Catch:{ IOException -> 0x00f7, RuntimeException -> 0x0190 }
        goto L_0x0031;
    L_0x00f7:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 31;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x0031;
    L_0x0118:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x011a, all -> 0x01b4 }
    L_0x011a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x011c, all -> 0x01b4 }
    L_0x011c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x011e, all -> 0x01b4 }
    L_0x011e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0120, all -> 0x01b4 }
    L_0x0120:
        r0 = move-exception;
        r2 = r1;
    L_0x0122:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x020c }
        r3.<init>();	 Catch:{ all -> 0x020c }
        r4 = z;	 Catch:{ all -> 0x020c }
        r5 = 26;
        r4 = r4[r5];	 Catch:{ all -> 0x020c }
        r3 = r3.append(r4);	 Catch:{ all -> 0x020c }
        r0 = r0.toString();	 Catch:{ all -> 0x020c }
        r0 = r3.append(r0);	 Catch:{ all -> 0x020c }
        r0 = r0.toString();	 Catch:{ all -> 0x020c }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x020c }
        if (r1 == 0) goto L_0x0145;
    L_0x0142:
        r1.close();	 Catch:{ IOException -> 0x0192 }
    L_0x0145:
        if (r2 == 0) goto L_0x0031;
    L_0x0147:
        r2.close();	 Catch:{ IOException -> 0x014c, RuntimeException -> 0x01b2 }
        goto L_0x0031;
    L_0x014c:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 17;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x0031;
    L_0x016d:
        r0 = move-exception;
        throw r0;
    L_0x016f:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 29;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r0 = r0.toString();
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x00f0;
    L_0x0190:
        r0 = move-exception;
        throw r0;
    L_0x0192:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 20;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x0145;
    L_0x01b2:
        r0 = move-exception;
        throw r0;
    L_0x01b4:
        r0 = move-exception;
        r2 = r1;
    L_0x01b6:
        if (r1 == 0) goto L_0x01bb;
    L_0x01b8:
        r1.close();	 Catch:{ IOException -> 0x01c3, RuntimeException -> 0x01c1 }
    L_0x01bb:
        if (r2 == 0) goto L_0x01c0;
    L_0x01bd:
        r2.close();	 Catch:{ IOException -> 0x01e5, RuntimeException -> 0x01e3 }
    L_0x01c0:
        throw r0;
    L_0x01c1:
        r0 = move-exception;
        throw r0;
    L_0x01c3:
        r1 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 23;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r1 = r1.toString();
        r1 = r3.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x01bb;
    L_0x01e3:
        r0 = move-exception;
        throw r0;
    L_0x01e5:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 21;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x01c0;
    L_0x0205:
        r0 = move-exception;
        r2 = r3;
        goto L_0x01b6;
    L_0x0208:
        r0 = move-exception;
        r1 = r2;
        r2 = r3;
        goto L_0x01b6;
    L_0x020c:
        r0 = move-exception;
        goto L_0x01b6;
    L_0x020e:
        r0 = move-exception;
        r2 = r3;
        goto L_0x0122;
    L_0x0212:
        r0 = move-exception;
        r1 = r2;
        r2 = r3;
        goto L_0x0122;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.p.d(android.content.Context):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap a(android.graphics.Bitmap r6, int r7, int r8) {
        /*
        r5 = 1;
        r4 = 0;
        r1 = com.whatsapp.wallpaper.ImageViewTouchBase.e;
        if (r6 != 0) goto L_0x0008;
    L_0x0006:
        r6 = 0;
    L_0x0007:
        return r6;
    L_0x0008:
        r0 = r6.getWidth();
        r0 = (float) r0;
        r2 = (float) r7;
        r0 = r0 / r2;
        r2 = r6.getHeight();
        r2 = (float) r2;
        r3 = (float) r8;
        r2 = r2 / r3;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0040;
    L_0x001a:
        r0 = r6.getWidth();
        r0 = (float) r0;
        r0 = r0 / r2;
        r0 = (int) r0;
        if (r0 <= 0) goto L_0x003d;
    L_0x0023:
        if (r8 <= 0) goto L_0x003d;
    L_0x0025:
        if (r7 <= 0) goto L_0x003d;
    L_0x0027:
        r2 = android.graphics.Bitmap.createScaledBitmap(r6, r0, r8, r5);
        r0 = r2.getWidth();
        r0 = r0 - r7;
        r0 = r0 / 2;
        r0 = android.graphics.Bitmap.createBitmap(r2, r0, r4, r7, r8);
        if (r0 == r2) goto L_0x003b;
    L_0x0038:
        r2.recycle();	 Catch:{ RuntimeException -> 0x006c }
    L_0x003b:
        if (r1 == 0) goto L_0x003e;
    L_0x003d:
        r0 = r6;
    L_0x003e:
        if (r1 == 0) goto L_0x006a;
    L_0x0040:
        r0 = r6.getHeight();
        r0 = (float) r0;
        r2 = (float) r7;
        r0 = r0 * r2;
        r2 = r6.getWidth();
        r2 = (float) r2;
        r0 = r0 / r2;
        r0 = (int) r0;
        if (r0 <= 0) goto L_0x0007;
    L_0x0050:
        if (r8 <= 0) goto L_0x0007;
    L_0x0052:
        if (r7 <= 0) goto L_0x0007;
    L_0x0054:
        r2 = android.graphics.Bitmap.createScaledBitmap(r6, r7, r0, r5);
        r0 = r2.getHeight();
        r0 = r0 - r8;
        r0 = r0 / 2;
        r0 = android.graphics.Bitmap.createBitmap(r2, r4, r0, r7, r8);
        if (r0 == r2) goto L_0x0068;
    L_0x0065:
        r2.recycle();	 Catch:{ RuntimeException -> 0x006e }
    L_0x0068:
        if (r1 != 0) goto L_0x0007;
    L_0x006a:
        r6 = r0;
        goto L_0x0007;
    L_0x006c:
        r0 = move-exception;
        throw r0;
    L_0x006e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.p.a(android.graphics.Bitmap, int, int):android.graphics.Bitmap");
    }

    public static void e(Context context) {
        FileOutputStream fileOutputStream = null;
        Log.i(z[15]);
        b = null;
        try {
            fileOutputStream = context.openFileOutput(z[14], 0);
            fileOutputStream.write(2);
            fileOutputStream.flush();
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    Log.e(e.toString());
                }
            }
        } catch (IOException e2) {
            Log.e(e2.toString());
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e22) {
                    Log.e(e22.toString());
                }
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e3) {
                    Log.e(e3.toString());
                } catch (RuntimeException e4) {
                    throw e4;
                }
            }
        }
        b = f(context);
        b(context);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r5, java.lang.String r6, boolean r7, int r8, android.net.Uri r9) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 11;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r6);
        r1 = z;
        r2 = 7;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r9);
        r1 = "]";
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r7 == 0) goto L_0x0058;
    L_0x003d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 9;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r0 = r0.toString();
        r1 = com.whatsapp.wallpaper.ImageViewTouchBase.e;
        if (r1 == 0) goto L_0x006f;
    L_0x0058:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 10;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r9);
        r0 = r0.toString();
    L_0x006f:
        r1 = z;
        r2 = 13;
        r1 = r1[r2];
        r2 = 0;
        r1 = r5.getSharedPreferences(r1, r2);
        r1 = r1.edit();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 12;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r6);
        r2 = r2.toString();
        r1.putString(r2, r0);
        r1.commit();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.p.a(android.content.Context, java.lang.String, boolean, int, android.net.Uri):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point c(android.content.Context r4) {
        /*
        r1 = new android.graphics.Point;
        r1.<init>();
        r0 = z;
        r2 = 50;
        r0 = r0[r2];
        r0 = r4.getSystemService(r0);
        r0 = (android.view.WindowManager) r0;
        r0 = r0.getDefaultDisplay();
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x005d }
        r3 = 13;
        if (r2 < r3) goto L_0x0022;
    L_0x001b:
        r0.getSize(r1);	 Catch:{ RuntimeException -> 0x005f }
        r2 = com.whatsapp.wallpaper.ImageViewTouchBase.e;	 Catch:{ RuntimeException -> 0x005f }
        if (r2 == 0) goto L_0x002e;
    L_0x0022:
        r2 = r0.getWidth();	 Catch:{ RuntimeException -> 0x005f }
        r1.x = r2;	 Catch:{ RuntimeException -> 0x005f }
        r0 = r0.getHeight();	 Catch:{ RuntimeException -> 0x005f }
        r1.y = r0;	 Catch:{ RuntimeException -> 0x005f }
    L_0x002e:
        r0 = r4.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.orientation;
        r2 = 2;
        if (r0 != r2) goto L_0x0043;
    L_0x003b:
        r0 = r1.y;
        r2 = r1.x;
        r1.y = r2;
        r1.x = r0;
    L_0x0043:
        r0 = r1.y;
        r2 = r4.getResources();
        r3 = 2131361792; // 0x7f0a0000 float:1.8343346E38 double:1.0530326403E-314;
        r2 = r2.getDimension(r3);
        r2 = (int) r2;
        r3 = com.whatsapp.am1.a();
        r3 = r3.b();
        r2 = r2 + r3;
        r0 = r0 - r2;
        r1.y = r0;
        return r1;
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.p.c(android.content.Context):android.graphics.Point");
    }

    public static void a(Context context) {
        FileOutputStream fileOutputStream = null;
        Log.i(z[5]);
        b = null;
        try {
            fileOutputStream = context.openFileOutput(z[6], 0);
            fileOutputStream.write(3);
            fileOutputStream.flush();
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    Log.e(e.toString());
                }
            }
        } catch (IOException e2) {
            Log.e(e2.toString());
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e22) {
                    Log.e(e22.toString());
                }
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e3) {
                    Log.e(e3.toString());
                } catch (RuntimeException e4) {
                    throw e4;
                }
            }
        }
        b(context);
    }

    public static Drawable a(Context context, String str) {
        String string = context.getSharedPreferences(z[34], 0).getString(z[35] + str, "");
        Log.i(z[36] + str + "]");
        String[] split = string.split("@");
        try {
            if (split.length < 2) {
                return null;
            }
            if (split[0].equalsIgnoreCase("0")) {
                try {
                    return context.getPackageManager().getResourcesForApplication(z[33]).getDrawable(Integer.parseInt(split[1]));
                } catch (NameNotFoundException e) {
                    Log.e(e.toString());
                    return null;
                }
            }
            try {
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(App.e.openInputStream(Uri.parse(split[1]))));
            } catch (FileNotFoundException e2) {
                Log.e(e2.toString());
                return null;
            }
        } catch (NameNotFoundException e3) {
            throw e3;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r6) {
        /*
        r1 = 0;
        r0 = new java.io.File;
        r2 = new java.io.File;
        r3 = com.whatsapp.App.ao;
        r4 = z;
        r5 = 45;
        r4 = r4[r5];
        r2.<init>(r3, r4);
        r3 = z;
        r4 = 47;
        r3 = r3[r4];
        r0.<init>(r2, r3);
        r3 = new java.io.File;
        r2 = r6.getFilesDir();
        r4 = z;
        r5 = 46;
        r4 = r4[r5];
        r3.<init>(r2, r4);
        r2 = r3.exists();	 Catch:{ Exception -> 0x002f }
        if (r2 != 0) goto L_0x0031;
    L_0x002e:
        return;
    L_0x002f:
        r0 = move-exception;
        throw r0;
    L_0x0031:
        r2 = r0.getParentFile();	 Catch:{ Exception -> 0x00b5 }
        r2 = r2.exists();	 Catch:{ Exception -> 0x00b5 }
        if (r2 != 0) goto L_0x0042;
    L_0x003b:
        r2 = r0.getParentFile();	 Catch:{ Exception -> 0x00b5 }
        r2.mkdirs();	 Catch:{ Exception -> 0x00b5 }
    L_0x0042:
        r2 = android.os.Environment.getExternalStorageState();
        r4 = z;
        r5 = 44;
        r4 = r4[r5];
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c8;
    L_0x0052:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b7 }
        r2.<init>();	 Catch:{ all -> 0x00b7 }
        r4 = z;	 Catch:{ all -> 0x00b7 }
        r5 = 43;
        r4 = r4[r5];	 Catch:{ all -> 0x00b7 }
        r2 = r2.append(r4);	 Catch:{ all -> 0x00b7 }
        r4 = r3.length();	 Catch:{ all -> 0x00b7 }
        r2 = r2.append(r4);	 Catch:{ all -> 0x00b7 }
        r2 = r2.toString();	 Catch:{ all -> 0x00b7 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ all -> 0x00b7 }
        r2 = new com.whatsapp.util.al;	 Catch:{ all -> 0x00b7 }
        r4 = com.whatsapp.App.aB;	 Catch:{ all -> 0x00b7 }
        r2.<init>(r4, r0);	 Catch:{ all -> 0x00b7 }
        r2 = java.nio.channels.Channels.newChannel(r2);	 Catch:{ all -> 0x00b7 }
        r0 = new java.io.FileInputStream;	 Catch:{ all -> 0x00e8 }
        r0.<init>(r3);	 Catch:{ all -> 0x00e8 }
        r1 = r0.getChannel();	 Catch:{ all -> 0x00e8 }
        com.whatsapp.util.at.a(r1, r2);	 Catch:{ all -> 0x00e8 }
        if (r1 == 0) goto L_0x008c;
    L_0x0089:
        r1.close();	 Catch:{ Exception -> 0x0094 }
    L_0x008c:
        if (r2 == 0) goto L_0x002e;
    L_0x008e:
        r2.close();	 Catch:{ Exception -> 0x0092 }
        goto L_0x002e;
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 49;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x002e;
    L_0x00b5:
        r0 = move-exception;
        throw r0;
    L_0x00b7:
        r0 = move-exception;
        r2 = r1;
    L_0x00b9:
        if (r1 == 0) goto L_0x00be;
    L_0x00bb:
        r1.close();	 Catch:{ Exception -> 0x00c4 }
    L_0x00be:
        if (r2 == 0) goto L_0x00c3;
    L_0x00c0:
        r2.close();	 Catch:{ Exception -> 0x00c6 }
    L_0x00c3:
        throw r0;	 Catch:{ Exception -> 0x0094 }
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0094 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0094 }
    L_0x00c8:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 48;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = android.os.Environment.getExternalStorageState();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x002e;
    L_0x00e8:
        r0 = move-exception;
        goto L_0x00b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.p.b(android.content.Context):void");
    }

    public static Uri a() {
        return Uri.fromFile(App.m(a54.b(App.an.jabber_id + Long.toString(System.currentTimeMillis())) + z[32]));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable f(android.content.Context r14) {
        /*
        r13 = 2130837820; // 0x7f02013c float:1.7280605E38 double:1.0527737637E-314;
        r2 = 0;
        r3 = 2;
        r7 = 1;
        r12 = 0;
        r4 = com.whatsapp.wallpaper.ImageViewTouchBase.e;
        r0 = b;
        if (r0 != 0) goto L_0x0110;
    L_0x000d:
        r0 = z;	 Catch:{ IOException -> 0x01b6, OutOfMemoryError -> 0x0138, all -> 0x014e }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ IOException -> 0x01b6, OutOfMemoryError -> 0x0138, all -> 0x014e }
        r1 = r14.openFileInput(r0);	 Catch:{ IOException -> 0x01b6, OutOfMemoryError -> 0x0138, all -> 0x014e }
        r0 = android.graphics.BitmapFactory.decodeStream(r1);	 Catch:{ IOException -> 0x0117, OutOfMemoryError -> 0x01b4 }
        if (r0 == 0) goto L_0x0029;
    L_0x001c:
        r5 = new android.graphics.drawable.BitmapDrawable;	 Catch:{ IOException -> 0x0113, OutOfMemoryError -> 0x01b4 }
        r6 = r14.getResources();	 Catch:{ IOException -> 0x0113, OutOfMemoryError -> 0x01b4 }
        r5.<init>(r6, r0);	 Catch:{ IOException -> 0x0113, OutOfMemoryError -> 0x01b4 }
        b = r5;	 Catch:{ IOException -> 0x0113, OutOfMemoryError -> 0x01b4 }
        if (r4 == 0) goto L_0x002c;
    L_0x0029:
        r0 = 0;
        b = r0;	 Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x01b4 }
    L_0x002c:
        if (r1 == 0) goto L_0x0031;
    L_0x002e:
        r1.close();	 Catch:{ IOException -> 0x012c, OutOfMemoryError -> 0x012a }
    L_0x0031:
        r0 = b;
        if (r0 != 0) goto L_0x00bd;
    L_0x0035:
        r0 = z;	 Catch:{ IOException -> 0x016d, OutOfMemoryError -> 0x0183 }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ IOException -> 0x016d, OutOfMemoryError -> 0x0183 }
        r2 = r14.openFileInput(r0);	 Catch:{ IOException -> 0x016d, OutOfMemoryError -> 0x0183 }
        r0 = r2.read();	 Catch:{ IOException -> 0x016d, OutOfMemoryError -> 0x0183 }
        if (r2 == 0) goto L_0x0047;
    L_0x0044:
        r2.close();	 Catch:{ IOException -> 0x0163, OutOfMemoryError -> 0x0161 }
    L_0x0047:
        if (r0 == r3) goto L_0x004b;
    L_0x0049:
        if (r0 != r7) goto L_0x00bd;
    L_0x004b:
        r2 = c(r14);
        r3 = new android.graphics.BitmapFactory$Options;
        r3.<init>();
        r3.inScaled = r12;
        r3.inJustDecodeBounds = r7;
        r0 = r14.getResources();
        android.graphics.BitmapFactory.decodeResource(r0, r13, r3);
        r3.inSampleSize = r7;
        r1 = r3.outWidth;
        r0 = r3.outHeight;
    L_0x0065:
        r5 = r2.x;
        r5 = r5 * 2;
        if (r1 <= r5) goto L_0x0077;
    L_0x006b:
        r1 = r1 / 2;
        r0 = r0 / 2;
        r5 = r3.inSampleSize;
        r5 = r5 * 2;
        r3.inSampleSize = r5;
        if (r4 == 0) goto L_0x0065;
    L_0x0077:
        r2 = java.lang.Runtime.getRuntime();
        r6 = r2.maxMemory();
    L_0x007f:
        r2 = r1 * r0;
        r2 = r2 * 4;
        r8 = (long) r2;
        r10 = 8;
        r10 = r6 / r10;
        r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r2 <= 0) goto L_0x0098;
    L_0x008c:
        r1 = r1 / 2;
        r0 = r0 / 2;
        r2 = r3.inSampleSize;
        r2 = r2 * 2;
        r3.inSampleSize = r2;
        if (r4 == 0) goto L_0x007f;
    L_0x0098:
        r3.inJustDecodeBounds = r12;
        r0 = r14.getResources();
        r0 = android.graphics.BitmapFactory.decodeResource(r0, r13, r3);
        if (r0 == 0) goto L_0x00b5;
    L_0x00a4:
        r1 = 0;
        r0.setDensity(r1);	 Catch:{ IOException -> 0x01ac }
        r1 = new android.graphics.drawable.BitmapDrawable;	 Catch:{ IOException -> 0x01ac }
        r2 = r14.getResources();	 Catch:{ IOException -> 0x01ac }
        r1.<init>(r2, r0);	 Catch:{ IOException -> 0x01ac }
        b = r1;	 Catch:{ IOException -> 0x01ac }
        if (r4 == 0) goto L_0x00bd;
    L_0x00b5:
        r0 = z;	 Catch:{ IOException -> 0x01ac }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ IOException -> 0x01ac }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x01ac }
    L_0x00bd:
        r0 = b;	 Catch:{ IOException -> 0x01ae }
        if (r0 == 0) goto L_0x0108;
    L_0x00c1:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01b0 }
        r0.<init>();	 Catch:{ IOException -> 0x01b0 }
        r1 = z;	 Catch:{ IOException -> 0x01b0 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ IOException -> 0x01b0 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01b0 }
        r1 = b;	 Catch:{ IOException -> 0x01b0 }
        r1 = r1.getIntrinsicWidth();	 Catch:{ IOException -> 0x01b0 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01b0 }
        r1 = "x";
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01b0 }
        r1 = b;	 Catch:{ IOException -> 0x01b0 }
        r1 = r1.getIntrinsicHeight();	 Catch:{ IOException -> 0x01b0 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01b0 }
        r1 = " ";
        r1 = r0.append(r1);	 Catch:{ IOException -> 0x01b0 }
        r0 = b;	 Catch:{ IOException -> 0x01b0 }
        r0 = (android.graphics.drawable.BitmapDrawable) r0;	 Catch:{ IOException -> 0x01b0 }
        r0 = r0.getBitmap();	 Catch:{ IOException -> 0x01b0 }
        r0 = com.whatsapp.util.b0.a(r0);	 Catch:{ IOException -> 0x01b0 }
        r0 = r1.append(r0);	 Catch:{ IOException -> 0x01b0 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x01b0 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x01b0 }
        if (r4 == 0) goto L_0x0110;
    L_0x0108:
        r0 = z;	 Catch:{ IOException -> 0x01b0 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ IOException -> 0x01b0 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x01b0 }
    L_0x0110:
        r0 = b;
        return r0;
    L_0x0113:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0115, OutOfMemoryError -> 0x01b4 }
    L_0x0115:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0117, OutOfMemoryError -> 0x01b4 }
    L_0x0117:
        r0 = move-exception;
        r0 = r1;
    L_0x0119:
        if (r0 == 0) goto L_0x0031;
    L_0x011b:
        r0.close();	 Catch:{ IOException -> 0x0120, OutOfMemoryError -> 0x0136 }
        goto L_0x0031;
    L_0x0120:
        r0 = move-exception;
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0031;
    L_0x012a:
        r0 = move-exception;
        throw r0;
    L_0x012c:
        r0 = move-exception;
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0031;
    L_0x0136:
        r0 = move-exception;
        throw r0;
    L_0x0138:
        r0 = move-exception;
        r1 = r2;
    L_0x013a:
        com.whatsapp.util.Log.a(r0);	 Catch:{ all -> 0x01b2 }
        if (r1 == 0) goto L_0x0031;
    L_0x013f:
        r1.close();	 Catch:{ IOException -> 0x0144 }
        goto L_0x0031;
    L_0x0144:
        r0 = move-exception;
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0031;
    L_0x014e:
        r0 = move-exception;
        r1 = r2;
    L_0x0150:
        if (r1 == 0) goto L_0x0155;
    L_0x0152:
        r1.close();	 Catch:{ IOException -> 0x0158, OutOfMemoryError -> 0x0156 }
    L_0x0155:
        throw r0;
    L_0x0156:
        r0 = move-exception;
        throw r0;
    L_0x0158:
        r1 = move-exception;
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0155;
    L_0x0161:
        r0 = move-exception;
        throw r0;
    L_0x0163:
        r1 = move-exception;
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0047;
    L_0x016d:
        r0 = move-exception;
        if (r2 == 0) goto L_0x01ba;
    L_0x0170:
        r2.close();	 Catch:{ IOException -> 0x0178, OutOfMemoryError -> 0x0176 }
        r0 = r3;
        goto L_0x0047;
    L_0x0176:
        r0 = move-exception;
        throw r0;
    L_0x0178:
        r0 = move-exception;
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r3;
        goto L_0x0047;
    L_0x0183:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);	 Catch:{ all -> 0x019a }
        if (r2 == 0) goto L_0x01ba;
    L_0x0189:
        r2.close();	 Catch:{ IOException -> 0x018f }
        r0 = r3;
        goto L_0x0047;
    L_0x018f:
        r0 = move-exception;
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r3;
        goto L_0x0047;
    L_0x019a:
        r0 = move-exception;
        if (r2 == 0) goto L_0x01a0;
    L_0x019d:
        r2.close();	 Catch:{ IOException -> 0x01a3, OutOfMemoryError -> 0x01a1 }
    L_0x01a0:
        throw r0;
    L_0x01a1:
        r0 = move-exception;
        throw r0;
    L_0x01a3:
        r1 = move-exception;
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x01a0;
    L_0x01ac:
        r0 = move-exception;
        throw r0;
    L_0x01ae:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01b0 }
    L_0x01b0:
        r0 = move-exception;
        throw r0;
    L_0x01b2:
        r0 = move-exception;
        goto L_0x0150;
    L_0x01b4:
        r0 = move-exception;
        goto L_0x013a;
    L_0x01b6:
        r0 = move-exception;
        r0 = r2;
        goto L_0x0119;
    L_0x01ba:
        r0 = r3;
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.p.f(android.content.Context):android.graphics.drawable.Drawable");
    }
}
