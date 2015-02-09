package com.whatsapp.wallpaper;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class CropImage extends Activity {
    private static final String[] z;
    private int a;
    private boolean b;
    boolean c;
    private Bitmap d;
    private Uri e;
    private int f;
    private boolean g;
    protected e h;
    private Rect i;
    private int j;
    private int k;
    private boolean l;
    private int m;
    private int n;
    private CompressFormat o;
    protected boolean p;
    private boolean q;
    public boolean r;
    private Matrix s;
    private int t;
    private Matrix u;
    private int v;
    private CropImageView w;
    private int x;

    static {
        String[] strArr = new String[59];
        String str = "X\u007f3\u007fiTc8j5O\u007f3v";
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
                        i3 = 59;
                        break;
                    case ay.f /*1*/:
                        i3 = 13;
                        break;
                    case ay.n /*2*/:
                        i3 = 92;
                        break;
                    case ay.p /*3*/:
                        i3 = 15;
                        break;
                    default:
                        i3 = 70;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "Rbqj4Ib.";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "Tx(\u007f3OU";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "Tx(\u007f3O";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "X\u007f3\u007fiTc?}#Zy9 #Ui";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "X\u007f3\u007fiTc?}#Zy9";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "_l(n";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "Z~,j%OU";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "]a={2^c\u000e`2Zy5`(";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "Ub(\"'\u0016d1n!^";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "^\u007f.`4\u0016b3b";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "X\u007f3\u007f/Vl;jiYd(b'K^(}#Z`|f5\u001bc)c*";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    str = "Xd.l*^N.`6";
                    obj = 12;
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    strArr2 = strArr3;
                    str = "Rbqj4Ib.";
                    obj = 13;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    str = "Tx(\u007f3OT";
                    obj = 14;
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    strArr2 = strArr3;
                    str = "ub||6Zn9";
                    obj = 15;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "Hn=c#n}\u0015i\b^h8j\"";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "Vl$I/Wh\u000ff<^";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "Hn=c#";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "]a5\u007f\u000e";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "Z~,j%OT";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "X\u007f3\u007f/Vl;jiUb(\"'\u0016d1n!^";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "]a5\u007f\u0010";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "X\u007f3\u007f/Vl;jiUb(\"'\u0016d1n!^";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "Rc5{/Za\u000ej%O";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "Ub(\"'\u0016d1n!^";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "Vd2L4T}";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "Tx(\u007f3OK3}+Zy";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "^\u007f.`4\u0016b3b";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "X\u007f3\u007f/Vl;j";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "Vl$L4T}";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "Ib(n2Rb2";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "Ubq|6Zn9";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "X\u007f3\u007f/Vl;jiTb1";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "Ih?{";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "Rbqj4Ib.";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "t\u007f5j(Ol(f)U";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "ub||6Zn9";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "Ih?{";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "X\u007f3\u007f/Vl;ji^u5iiXl2a)O-/n0^7|";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "X\u007f3\u007f/Vl;jiXl2a)O-/n0^7|";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "Ubq|6Zn9";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "X\u007f3\u007f/Vl;jiXl2a)O-?c)Hh|k3Id2hfIh/n+Ka95f";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "X\u007f3\u007f/Vl;jiXl2a)O-?c)Hh|k3Id2hfIh/n+Ka95f";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "_l(n";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "X\u007f3\u007f/Vl;jiXl2a)OR.j5Z`,c#\u0001-";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "Ih(z4U 8n2Z";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "Rc0f(^ 8n2Z";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "X\u007f3\u007f/Vl;jiXl2a)O-?c)Hh|k3Id2hfIh/n+Ka95f";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "X\u007f3\u007f/Vl;jiXl2a)O-?c)Hh|k3Id2hfIh/n+Ka95f";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "X\u007f3\u007f/Vl;jiXl2a)O-?c)Hh|k3Id2hfIh/n+Ka95f";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "X\u007f3\u007f/Vl;jiXl2a)OR.j5Z`,c#\u0001-";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "X\u007f3\u007f/Vl;jiXl2a)O-?c)Hh|k3Id2hfIh/n+Ka95f";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "_l(n";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "X\u007f3\u007f/Vl;jiTb15f";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "X\u007f3\u007f/Vl;jiXl2a)O-?c)Hh|k3Id2hfIh/n+Ka95f";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "X\u007f3\u007f/Vl;jiXl2a)O-?c)Hh|k3Id2hfIh/n+Ka95f";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "X\u007f3\u007f/Vl;jiTb15f";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "X\u007f3\u007f\u0004BB){6Ny\u000ff<^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void a(CropImage cropImage) {
        cropImage.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r12_this = this;
        r7 = com.whatsapp.wallpaper.ImageViewTouchBase.e;
        r0 = r12.h;	 Catch:{ IOException -> 0x0007 }
        if (r0 != 0) goto L_0x0009;
    L_0x0006:
        return;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        r0 = r12.r;	 Catch:{ IOException -> 0x01dc }
        if (r0 != 0) goto L_0x0006;
    L_0x000d:
        r0 = 1;
        r12.r = r0;
        r0 = 0;
        r8 = new android.graphics.Paint;
        r8.<init>();
        r1 = 1;
        r8.setAntiAlias(r1);
        r1 = 1;
        r8.setFilterBitmap(r1);
        r1 = 1;
        r8.setDither(r1);
        r1 = r12.h;
        r9 = r1.d();
        r1 = r12.x;	 Catch:{ IOException -> 0x01de }
        if (r1 == 0) goto L_0x028e;
    L_0x002c:
        r1 = r12.a;	 Catch:{ IOException -> 0x01de }
        if (r1 == 0) goto L_0x028e;
    L_0x0030:
        r0 = r12.k;	 Catch:{ IOException -> 0x01e0 }
        r1 = 1;
        if (r0 <= r1) goto L_0x0051;
    L_0x0035:
        r0 = r9.left;	 Catch:{ IOException -> 0x01e2 }
        r1 = r12.k;	 Catch:{ IOException -> 0x01e2 }
        r0 = r0 * r1;
        r9.left = r0;	 Catch:{ IOException -> 0x01e2 }
        r0 = r9.right;	 Catch:{ IOException -> 0x01e2 }
        r1 = r12.k;	 Catch:{ IOException -> 0x01e2 }
        r0 = r0 * r1;
        r9.right = r0;	 Catch:{ IOException -> 0x01e2 }
        r0 = r9.top;	 Catch:{ IOException -> 0x01e2 }
        r1 = r12.k;	 Catch:{ IOException -> 0x01e2 }
        r0 = r0 * r1;
        r9.top = r0;	 Catch:{ IOException -> 0x01e2 }
        r0 = r9.bottom;	 Catch:{ IOException -> 0x01e2 }
        r1 = r12.k;	 Catch:{ IOException -> 0x01e2 }
        r0 = r0 * r1;
        r9.bottom = r0;	 Catch:{ IOException -> 0x01e2 }
    L_0x0051:
        r1 = r12.x;
        r0 = r12.a;
        r2 = r12.b;	 Catch:{ IOException -> 0x01e4 }
        if (r2 != 0) goto L_0x0069;
    L_0x0059:
        r2 = r9.width();	 Catch:{ IOException -> 0x01e4 }
        r3 = r12.x;	 Catch:{ IOException -> 0x01e4 }
        if (r2 >= r3) goto L_0x0069;
    L_0x0061:
        r1 = r9.width();
        r0 = r9.height();
    L_0x0069:
        r2 = r12.p;
        if (r2 != 0) goto L_0x00e9;
    L_0x006d:
        r2 = 1;
    L_0x006e:
        r3 = r9.width();
        r3 = r3 / 2;
        r4 = r12.x;
        if (r3 > r4) goto L_0x0082;
    L_0x0078:
        r3 = r9.height();
        r3 = r3 / 2;
        r4 = r12.a;
        if (r3 <= r4) goto L_0x009e;
    L_0x0082:
        r2 = r2 * 2;
        r3 = r9.left;
        r3 = r3 / 2;
        r9.left = r3;
        r3 = r9.right;
        r3 = r3 / 2;
        r9.right = r3;
        r3 = r9.top;
        r3 = r3 / 2;
        r9.top = r3;
        r3 = r9.bottom;
        r3 = r3 / 2;
        r9.bottom = r3;
        if (r7 == 0) goto L_0x006e;
    L_0x009e:
        r3 = r2;
        r2 = r12.k;	 Catch:{ IOException -> 0x01e6 }
        r4 = 1;
        if (r2 > r4) goto L_0x00a7;
    L_0x00a4:
        r2 = 1;
        if (r3 <= r2) goto L_0x00e9;
    L_0x00a7:
        r2 = r12.d;
        r2.recycle();
        r2 = r3;
    L_0x00ad:
        r4 = r12.k;
        r4 = java.lang.Math.max(r4, r3);
        if (r2 > r4) goto L_0x00e9;
    L_0x00b5:
        r4 = new android.graphics.BitmapFactory$Options;
        r4.<init>();
        r4.inSampleSize = r2;	 Catch:{ IOException -> 0x01e8 }
        r5 = 1;
        r4.inDither = r5;	 Catch:{ IOException -> 0x01e8 }
        r5 = 0;
        r4.inJustDecodeBounds = r5;	 Catch:{ IOException -> 0x01e8 }
        r5 = 0;
        r4.inScaled = r5;	 Catch:{ IOException -> 0x01e8 }
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x01e8 }
        r6 = 10;
        if (r5 < r6) goto L_0x00ce;
    L_0x00cb:
        r5 = 1;
        r4.inPreferQualityOverSpeed = r5;	 Catch:{ IOException -> 0x01e8 }
    L_0x00ce:
        r5 = 0;
        r6 = com.whatsapp.App.e;	 Catch:{ OutOfMemoryError -> 0x01f6, FileNotFoundException -> 0x0260 }
        r10 = r12.getIntent();	 Catch:{ OutOfMemoryError -> 0x01f6, FileNotFoundException -> 0x0260 }
        r10 = r10.getData();	 Catch:{ OutOfMemoryError -> 0x01f6, FileNotFoundException -> 0x0260 }
        r5 = r6.openInputStream(r10);	 Catch:{ OutOfMemoryError -> 0x01f6, FileNotFoundException -> 0x0260 }
        r6 = 0;
        r4 = android.graphics.BitmapFactory.decodeStream(r5, r6, r4);	 Catch:{ OutOfMemoryError -> 0x01f6, FileNotFoundException -> 0x0260 }
        r12.d = r4;	 Catch:{ OutOfMemoryError -> 0x01f6, FileNotFoundException -> 0x0260 }
        if (r5 == 0) goto L_0x00e9;
    L_0x00e6:
        r5.close();	 Catch:{ IOException -> 0x01ea }
    L_0x00e9:
        r2 = r12.d;
        r2 = r2.getConfig();
        if (r2 != 0) goto L_0x00f3;
    L_0x00f1:
        r2 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ IOException -> 0x028a }
    L_0x00f3:
        r2 = android.graphics.Bitmap.createBitmap(r1, r0, r2);
        r3 = new android.graphics.Canvas;
        r3.<init>(r2);
        r4 = new android.graphics.RectF;
        r5 = 0;
        r6 = 0;
        r1 = (float) r1;
        r0 = (float) r0;
        r4.<init>(r5, r6, r1, r0);
        r0 = r12.g;
        if (r0 != 0) goto L_0x0141;
    L_0x0109:
        r0 = r9.width();
        r0 = (float) r0;
        r1 = r4.width();
        r0 = r0 - r1;
        r0 = (int) r0;
        r0 = r0 / 2;
        r1 = r9.height();
        r1 = (float) r1;
        r5 = r4.height();
        r1 = r1 - r5;
        r1 = (int) r1;
        r1 = r1 / 2;
        r5 = 0;
        r5 = java.lang.Math.max(r5, r0);
        r6 = 0;
        r6 = java.lang.Math.max(r6, r1);
        r9.inset(r5, r6);
        r5 = 0;
        r0 = -r0;
        r0 = java.lang.Math.max(r5, r0);
        r0 = (float) r0;
        r5 = 0;
        r1 = -r1;
        r1 = java.lang.Math.max(r5, r1);
        r1 = (float) r1;
        r4.inset(r0, r1);
    L_0x0141:
        r0 = r12.u;	 Catch:{ IOException -> 0x028c }
        if (r0 == 0) goto L_0x0181;
    L_0x0145:
        r0 = r12.l;	 Catch:{ IOException -> 0x028c }
        if (r0 == 0) goto L_0x0181;
    L_0x0149:
        r0 = new android.graphics.Matrix;
        r0.<init>();
        r1 = r4.left;
        r5 = r4.right;
        r1 = r1 + r5;
        r1 = -r1;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = r1 / r5;
        r5 = r4.top;
        r6 = r4.bottom;
        r5 = r5 + r6;
        r5 = -r5;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r5 / r6;
        r0.preTranslate(r1, r5);
        r1 = r12.u;
        r0.postConcat(r1);
        r1 = r4.left;
        r5 = r4.right;
        r1 = r1 + r5;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = r1 / r5;
        r5 = r4.top;
        r6 = r4.bottom;
        r5 = r5 + r6;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r5 / r6;
        r0.postTranslate(r1, r5);
        r0.mapRect(r4);
        r3.setMatrix(r0);
    L_0x0181:
        r0 = r12.d;
        r3.drawBitmap(r0, r9, r4, r8);
    L_0x0186:
        r0 = r12.w;
        r0.b();
        r0 = r12.d;
        r0.recycle();
        r0 = r12.getIntent();
        r0 = r0.getExtras();
        if (r0 == 0) goto L_0x04c9;
    L_0x019a:
        r1 = z;	 Catch:{ IOException -> 0x04c7 }
        r3 = 45;
        r1 = r1[r3];	 Catch:{ IOException -> 0x04c7 }
        r1 = r0.getParcelable(r1);	 Catch:{ IOException -> 0x04c7 }
        if (r1 != 0) goto L_0x01b2;
    L_0x01a6:
        r1 = z;	 Catch:{ IOException -> 0x04c7 }
        r3 = 47;
        r1 = r1[r3];	 Catch:{ IOException -> 0x04c7 }
        r0 = r0.getBoolean(r1);	 Catch:{ IOException -> 0x04c7 }
        if (r0 == 0) goto L_0x04c9;
    L_0x01b2:
        r0 = new android.os.Bundle;
        r0.<init>();
        r1 = z;
        r3 = 54;
        r1 = r1[r3];
        r0.putParcelable(r1, r2);
        r1 = -1;
        r2 = new android.content.Intent;
        r2.<init>();
        r3 = z;
        r4 = 48;
        r3 = r3[r4];
        r2 = r2.setAction(r3);
        r0 = r2.putExtras(r0);
        r12.setResult(r1, r0);
        r12.finish();
        goto L_0x0006;
    L_0x01dc:
        r0 = move-exception;
        throw r0;
    L_0x01de:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01e0 }
    L_0x01e0:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01e2 }
    L_0x01e2:
        r0 = move-exception;
        throw r0;
    L_0x01e4:
        r0 = move-exception;
        throw r0;
    L_0x01e6:
        r0 = move-exception;
        throw r0;
    L_0x01e8:
        r0 = move-exception;
        throw r0;
    L_0x01ea:
        r2 = move-exception;
        r3 = z;
        r4 = 51;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x00e9;
    L_0x01f6:
        r4 = move-exception;
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0248 }
        r6.<init>();	 Catch:{ IOException -> 0x0248 }
        r10 = z;	 Catch:{ IOException -> 0x0248 }
        r11 = 55;
        r10 = r10[r11];	 Catch:{ IOException -> 0x0248 }
        r6 = r6.append(r10);	 Catch:{ IOException -> 0x0248 }
        r6 = r6.append(r2);	 Catch:{ IOException -> 0x0248 }
        r6 = r6.toString();	 Catch:{ IOException -> 0x0248 }
        com.whatsapp.util.Log.b(r6, r4);	 Catch:{ IOException -> 0x0248 }
        r4 = r12.d;	 Catch:{ IOException -> 0x0248 }
        if (r4 == 0) goto L_0x0225;
    L_0x0215:
        r4 = r12.d;	 Catch:{ IOException -> 0x0248 }
        r4 = r4.isRecycled();	 Catch:{ IOException -> 0x0248 }
        if (r4 != 0) goto L_0x0225;
    L_0x021d:
        r4 = r12.d;	 Catch:{ IOException -> 0x024a }
        r4.recycle();	 Catch:{ IOException -> 0x024a }
        r4 = 0;
        r12.d = r4;	 Catch:{ IOException -> 0x024a }
    L_0x0225:
        if (r5 == 0) goto L_0x022a;
    L_0x0227:
        r5.close();	 Catch:{ IOException -> 0x0255, OutOfMemoryError -> 0x0253 }
    L_0x022a:
        r4 = r9.left;
        r4 = r4 / 2;
        r9.left = r4;
        r4 = r9.right;
        r4 = r4 / 2;
        r9.right = r4;
        r4 = r9.top;
        r4 = r4 / 2;
        r9.top = r4;
        r4 = r9.bottom;
        r4 = r4 / 2;
        r9.bottom = r4;
        r2 = r2 * 2;
        if (r7 == 0) goto L_0x00ad;
    L_0x0246:
        goto L_0x00e9;
    L_0x0248:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x024a }
    L_0x024a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x024c }
    L_0x024c:
        r0 = move-exception;
        if (r5 == 0) goto L_0x0252;
    L_0x024f:
        r5.close();	 Catch:{ IOException -> 0x027f, OutOfMemoryError -> 0x027d }
    L_0x0252:
        throw r0;
    L_0x0253:
        r0 = move-exception;
        throw r0;
    L_0x0255:
        r4 = move-exception;
        r5 = z;
        r6 = 43;
        r5 = r5[r6];
        com.whatsapp.util.Log.b(r5, r4);
        goto L_0x022a;
    L_0x0260:
        r2 = move-exception;
        r3 = z;	 Catch:{ all -> 0x024c }
        r4 = 52;
        r3 = r3[r4];	 Catch:{ all -> 0x024c }
        com.whatsapp.util.Log.b(r3, r2);	 Catch:{ all -> 0x024c }
        if (r5 == 0) goto L_0x00e9;
    L_0x026c:
        r5.close();	 Catch:{ IOException -> 0x0271 }
        goto L_0x00e9;
    L_0x0271:
        r2 = move-exception;
        r3 = z;
        r4 = 56;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x00e9;
    L_0x027d:
        r0 = move-exception;
        throw r0;
    L_0x027f:
        r1 = move-exception;
        r2 = z;
        r3 = 53;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
        goto L_0x0252;
    L_0x028a:
        r0 = move-exception;
        throw r0;
    L_0x028c:
        r0 = move-exception;
        throw r0;
    L_0x028e:
        r1 = r12.k;	 Catch:{ IOException -> 0x03f9 }
        r2 = 1;
        if (r1 <= r2) goto L_0x02af;
    L_0x0293:
        r1 = r9.left;	 Catch:{ IOException -> 0x03f9 }
        r2 = r12.k;	 Catch:{ IOException -> 0x03f9 }
        r1 = r1 * r2;
        r9.left = r1;	 Catch:{ IOException -> 0x03f9 }
        r1 = r9.right;	 Catch:{ IOException -> 0x03f9 }
        r2 = r12.k;	 Catch:{ IOException -> 0x03f9 }
        r1 = r1 * r2;
        r9.right = r1;	 Catch:{ IOException -> 0x03f9 }
        r1 = r9.top;	 Catch:{ IOException -> 0x03f9 }
        r2 = r12.k;	 Catch:{ IOException -> 0x03f9 }
        r1 = r1 * r2;
        r9.top = r1;	 Catch:{ IOException -> 0x03f9 }
        r1 = r9.bottom;	 Catch:{ IOException -> 0x03f9 }
        r2 = r12.k;	 Catch:{ IOException -> 0x03f9 }
        r1 = r1 * r2;
        r9.bottom = r1;	 Catch:{ IOException -> 0x03f9 }
    L_0x02af:
        r1 = 1;
        r2 = r12.t;	 Catch:{ IOException -> 0x03fb }
        if (r2 == 0) goto L_0x02e4;
    L_0x02b4:
        r2 = r9.width();	 Catch:{ IOException -> 0x03fb }
        r2 = r2 / 2;
        r3 = r12.t;	 Catch:{ IOException -> 0x03fb }
        if (r2 > r3) goto L_0x02c8;
    L_0x02be:
        r2 = r9.height();
        r2 = r2 / 2;
        r3 = r12.t;
        if (r2 <= r3) goto L_0x02e4;
    L_0x02c8:
        r1 = r1 * 2;
        r2 = r9.left;
        r2 = r2 / 2;
        r9.left = r2;
        r2 = r9.right;
        r2 = r2 / 2;
        r9.right = r2;
        r2 = r9.top;
        r2 = r2 / 2;
        r9.top = r2;
        r2 = r9.bottom;
        r2 = r2 / 2;
        r9.bottom = r2;
        if (r7 == 0) goto L_0x02b4;
    L_0x02e4:
        r2 = r12.k;	 Catch:{ IOException -> 0x03fd }
        r3 = 1;
        if (r2 > r3) goto L_0x02ec;
    L_0x02e9:
        r2 = 1;
        if (r1 <= r2) goto L_0x04d6;
    L_0x02ec:
        r2 = r12.d;
        r2.recycle();
        r2 = r0;
        r0 = r1;
    L_0x02f3:
        r3 = r12.k;
        r3 = java.lang.Math.max(r3, r1);
        if (r0 > r3) goto L_0x0367;
    L_0x02fb:
        r3 = new android.graphics.BitmapFactory$Options;
        r3.<init>();
        r3.inSampleSize = r0;	 Catch:{ IOException -> 0x03ff }
        r4 = 1;
        r3.inDither = r4;	 Catch:{ IOException -> 0x03ff }
        r4 = 0;
        r3.inJustDecodeBounds = r4;	 Catch:{ IOException -> 0x03ff }
        r4 = 0;
        r3.inScaled = r4;	 Catch:{ IOException -> 0x03ff }
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x03ff }
        r5 = 10;
        if (r4 < r5) goto L_0x0314;
    L_0x0311:
        r4 = 1;
        r3.inPreferQualityOverSpeed = r4;	 Catch:{ IOException -> 0x03ff }
    L_0x0314:
        r4 = 0;
        r5 = com.whatsapp.App.e;	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        r6 = r12.getIntent();	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        r6 = r6.getData();	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        r4 = r5.openInputStream(r6);	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        r5 = 0;
        r3 = android.graphics.BitmapFactory.decodeStream(r4, r5, r3);	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        r12.d = r3;	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        r5 = r9.width();	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        r3 = r9.height();	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        r6 = r12.t;	 Catch:{ IOException -> 0x0401 }
        if (r6 == 0) goto L_0x04d2;
    L_0x0336:
        r6 = r12.t;	 Catch:{ IOException -> 0x0401 }
        if (r5 > r6) goto L_0x033e;
    L_0x033a:
        r6 = r12.t;	 Catch:{ IOException -> 0x0403 }
        if (r3 <= r6) goto L_0x04d2;
    L_0x033e:
        if (r5 <= r3) goto L_0x0348;
    L_0x0340:
        r6 = r12.t;	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        r3 = r3 * r6;
        r3 = r3 / r5;
        r5 = r12.t;	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        if (r7 == 0) goto L_0x04d2;
    L_0x0348:
        r6 = r12.t;	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        r5 = r5 * r6;
        r5 = r5 / r3;
        r3 = r12.t;	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        r6 = r5;
        r5 = r3;
    L_0x0350:
        r3 = r12.d;	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        r3 = r3.getConfig();	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        r10 = r12.q;	 Catch:{ IOException -> 0x0465 }
        if (r10 != 0) goto L_0x035c;
    L_0x035a:
        if (r3 != 0) goto L_0x035e;
    L_0x035c:
        r3 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ IOException -> 0x0467 }
    L_0x035e:
        r2 = android.graphics.Bitmap.createBitmap(r6, r5, r3);	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
        if (r4 == 0) goto L_0x0367;
    L_0x0364:
        r4.close();	 Catch:{ IOException -> 0x0488, OutOfMemoryError -> 0x0486 }
    L_0x0367:
        r1 = r9.width();
        r0 = r9.height();
        r3 = r12.t;	 Catch:{ IOException -> 0x04bb }
        if (r3 == 0) goto L_0x04ce;
    L_0x0373:
        r3 = r12.t;	 Catch:{ IOException -> 0x04bd }
        if (r1 > r3) goto L_0x037b;
    L_0x0377:
        r3 = r12.t;	 Catch:{ IOException -> 0x04bf }
        if (r0 <= r3) goto L_0x04ce;
    L_0x037b:
        if (r1 <= r0) goto L_0x0385;
    L_0x037d:
        r3 = r12.t;
        r0 = r0 * r3;
        r0 = r0 / r1;
        r1 = r12.t;
        if (r7 == 0) goto L_0x04ce;
    L_0x0385:
        r3 = r12.t;
        r1 = r1 * r3;
        r1 = r1 / r0;
        r0 = r12.t;
        r3 = r1;
        r1 = r0;
    L_0x038d:
        if (r2 != 0) goto L_0x03a1;
    L_0x038f:
        r0 = r12.d;
        r0 = r0.getConfig();
        r2 = r12.q;	 Catch:{ IOException -> 0x04c1 }
        if (r2 != 0) goto L_0x039b;
    L_0x0399:
        if (r0 != 0) goto L_0x039d;
    L_0x039b:
        r0 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ IOException -> 0x04c3 }
    L_0x039d:
        r2 = android.graphics.Bitmap.createBitmap(r3, r1, r0);
    L_0x03a1:
        r0 = new android.graphics.Canvas;
        r0.<init>(r2);
        r4 = new android.graphics.Rect;
        r5 = 0;
        r6 = 0;
        r4.<init>(r5, r6, r3, r1);
        r1 = r12.u;	 Catch:{ IOException -> 0x04c5 }
        if (r1 == 0) goto L_0x03f2;
    L_0x03b1:
        r1 = r12.l;	 Catch:{ IOException -> 0x04c5 }
        if (r1 == 0) goto L_0x03f2;
    L_0x03b5:
        r1 = new android.graphics.Matrix;
        r1.<init>();
        r3 = r4.left;
        r5 = r4.right;
        r3 = r3 + r5;
        r3 = -r3;
        r3 = r3 / 2;
        r3 = (float) r3;
        r5 = r4.top;
        r6 = r4.bottom;
        r5 = r5 + r6;
        r5 = -r5;
        r5 = r5 / 2;
        r5 = (float) r5;
        r1.preTranslate(r3, r5);
        r3 = r12.u;
        r1.postConcat(r3);
        r3 = r4.left;
        r5 = r4.right;
        r3 = r3 + r5;
        r3 = r3 / 2;
        r3 = (float) r3;
        r5 = r4.top;
        r6 = r4.bottom;
        r5 = r5 + r6;
        r5 = r5 / 2;
        r5 = (float) r5;
        r1.postTranslate(r3, r5);
        r3 = new android.graphics.RectF;
        r3.<init>(r4);
        r1.mapRect(r3);
        r0.setMatrix(r1);
    L_0x03f2:
        r1 = r12.d;
        r0.drawBitmap(r1, r9, r4, r8);
        goto L_0x0186;
    L_0x03f9:
        r0 = move-exception;
        throw r0;
    L_0x03fb:
        r0 = move-exception;
        throw r0;
    L_0x03fd:
        r0 = move-exception;
        throw r0;
    L_0x03ff:
        r0 = move-exception;
        throw r0;
    L_0x0401:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x0403 }
    L_0x0403:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x0405 }
    L_0x0405:
        r3 = move-exception;
        throw r3;	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
    L_0x0407:
        r3 = move-exception;
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0494 }
        r5.<init>();	 Catch:{ IOException -> 0x0494 }
        r6 = z;	 Catch:{ IOException -> 0x0494 }
        r10 = 58;
        r6 = r6[r10];	 Catch:{ IOException -> 0x0494 }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x0494 }
        r5 = r5.append(r0);	 Catch:{ IOException -> 0x0494 }
        r5 = r5.toString();	 Catch:{ IOException -> 0x0494 }
        com.whatsapp.util.Log.b(r5, r3);	 Catch:{ IOException -> 0x0494 }
        r3 = r12.d;	 Catch:{ IOException -> 0x0494 }
        if (r3 == 0) goto L_0x0436;
    L_0x0426:
        r3 = r12.d;	 Catch:{ IOException -> 0x0494 }
        r3 = r3.isRecycled();	 Catch:{ IOException -> 0x0494 }
        if (r3 != 0) goto L_0x0436;
    L_0x042e:
        r3 = r12.d;	 Catch:{ IOException -> 0x0496 }
        r3.recycle();	 Catch:{ IOException -> 0x0496 }
        r3 = 0;
        r12.d = r3;	 Catch:{ IOException -> 0x0496 }
    L_0x0436:
        if (r2 == 0) goto L_0x0442;
    L_0x0438:
        r3 = r2.isRecycled();	 Catch:{ IOException -> 0x049f }
        if (r3 != 0) goto L_0x0442;
    L_0x043e:
        r2.recycle();	 Catch:{ all -> 0x0498 }
        r2 = 0;
    L_0x0442:
        if (r4 == 0) goto L_0x0447;
    L_0x0444:
        r4.close();	 Catch:{ IOException -> 0x04a3, OutOfMemoryError -> 0x04a1 }
    L_0x0447:
        r3 = r9.left;
        r3 = r3 / 2;
        r9.left = r3;
        r3 = r9.right;
        r3 = r3 / 2;
        r9.right = r3;
        r3 = r9.top;
        r3 = r3 / 2;
        r9.top = r3;
        r3 = r9.bottom;
        r3 = r3 / 2;
        r9.bottom = r3;
        r0 = r0 * 2;
        if (r7 == 0) goto L_0x02f3;
    L_0x0463:
        goto L_0x0367;
    L_0x0465:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x0467 }
    L_0x0467:
        r3 = move-exception;
        throw r3;	 Catch:{ OutOfMemoryError -> 0x0407, FileNotFoundException -> 0x0469 }
    L_0x0469:
        r0 = move-exception;
        r1 = z;	 Catch:{ all -> 0x0498 }
        r3 = 46;
        r1 = r1[r3];	 Catch:{ all -> 0x0498 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x0498 }
        if (r4 == 0) goto L_0x0367;
    L_0x0475:
        r4.close();	 Catch:{ IOException -> 0x047a }
        goto L_0x0367;
    L_0x047a:
        r0 = move-exception;
        r1 = z;
        r3 = 49;
        r1 = r1[r3];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x0367;
    L_0x0486:
        r0 = move-exception;
        throw r0;
    L_0x0488:
        r0 = move-exception;
        r1 = z;
        r3 = 50;
        r1 = r1[r3];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x0367;
    L_0x0494:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0496 }
    L_0x0496:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0498 }
    L_0x0498:
        r0 = move-exception;
        if (r4 == 0) goto L_0x049e;
    L_0x049b:
        r4.close();	 Catch:{ IOException -> 0x04b0, OutOfMemoryError -> 0x04ae }
    L_0x049e:
        throw r0;
    L_0x049f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0498 }
    L_0x04a1:
        r0 = move-exception;
        throw r0;
    L_0x04a3:
        r3 = move-exception;
        r4 = z;
        r5 = 44;
        r4 = r4[r5];
        com.whatsapp.util.Log.b(r4, r3);
        goto L_0x0447;
    L_0x04ae:
        r0 = move-exception;
        throw r0;
    L_0x04b0:
        r1 = move-exception;
        r2 = z;
        r3 = 57;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
        goto L_0x049e;
    L_0x04bb:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x04bd }
    L_0x04bd:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x04bf }
    L_0x04bf:
        r0 = move-exception;
        throw r0;
    L_0x04c1:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x04c3 }
    L_0x04c3:
        r0 = move-exception;
        throw r0;
    L_0x04c5:
        r0 = move-exception;
        throw r0;
    L_0x04c7:
        r0 = move-exception;
        throw r0;
    L_0x04c9:
        r12.a(r2);
        goto L_0x0006;
    L_0x04ce:
        r3 = r1;
        r1 = r0;
        goto L_0x038d;
    L_0x04d2:
        r6 = r5;
        r5 = r3;
        goto L_0x0350;
    L_0x04d6:
        r2 = r0;
        goto L_0x0367;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.CropImage.a():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r11_this = this;
        r5 = 0;
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = com.whatsapp.wallpaper.ImageViewTouchBase.e;
        r0 = new com.whatsapp.wallpaper.e;
        r1 = r11.w;
        r0.<init>(r1);
        r1 = r11.d;
        r7 = r1.getWidth();
        r1 = r11.d;
        r4 = r1.getHeight();
        r2 = new android.graphics.Rect;
        r2.<init>(r5, r5, r7, r4);
        r1 = java.lang.Math.min(r7, r4);
        r1 = r1 * 4;
        r3 = r1 / 5;
        r1 = r11.c;
        if (r1 == 0) goto L_0x0114;
    L_0x0029:
        r1 = r11.x;
        if (r1 >= r3) goto L_0x003d;
    L_0x002d:
        r1 = r11.a;
        if (r1 >= r3) goto L_0x003d;
    L_0x0031:
        r1 = (float) r3;
        r8 = r11.a;
        r8 = (float) r8;
        r1 = r1 * r8;
        r8 = r11.x;
        r8 = (float) r8;
        r1 = r1 / r8;
        r1 = (int) r1;
        if (r6 == 0) goto L_0x0041;
    L_0x003d:
        r3 = r11.x;
        r1 = r11.a;
    L_0x0041:
        r8 = r11.v;
        if (r8 == 0) goto L_0x005d;
    L_0x0045:
        r8 = r11.f;
        if (r8 == 0) goto L_0x005d;
    L_0x0049:
        r8 = r11.v;
        r9 = r11.f;
        if (r8 <= r9) goto L_0x0057;
    L_0x004f:
        r1 = r11.f;
        r1 = r1 * r3;
        r8 = r11.v;
        r1 = r1 / r8;
        if (r6 == 0) goto L_0x005d;
    L_0x0057:
        r3 = r11.v;
        r3 = r3 * r1;
        r6 = r11.f;
        r3 = r3 / r6;
    L_0x005d:
        if (r1 <= r4) goto L_0x0068;
    L_0x005f:
        r1 = (float) r1;
        r6 = (float) r4;
        r1 = r1 / r6;
        r3 = (float) r3;
        r1 = r3 / r1;
        r1 = (int) r1;
        r3 = r1;
        r1 = r4;
    L_0x0068:
        r6 = r11.n;
        if (r6 <= 0) goto L_0x00a0;
    L_0x006c:
        r6 = r11.n;
        r8 = r11.k;
        r6 = r6 / r8;
        if (r3 >= r6) goto L_0x0086;
    L_0x0073:
        r3 = r11.n;
        r6 = r11.k;
        r3 = r3 / r6;
        r6 = r11.v;
        if (r6 == 0) goto L_0x0086;
    L_0x007c:
        r6 = r11.f;
        if (r6 == 0) goto L_0x0086;
    L_0x0080:
        r1 = r11.f;
        r1 = r1 * r3;
        r6 = r11.v;
        r1 = r1 / r6;
    L_0x0086:
        r6 = r11.n;
        r8 = r11.k;
        r6 = r6 / r8;
        if (r1 >= r6) goto L_0x00a0;
    L_0x008d:
        r1 = r11.n;
        r6 = r11.k;
        r1 = r1 / r6;
        r6 = r11.v;
        if (r6 == 0) goto L_0x00a0;
    L_0x0096:
        r6 = r11.f;
        if (r6 == 0) goto L_0x00a0;
    L_0x009a:
        r3 = r11.v;
        r3 = r3 * r1;
        r6 = r11.f;
        r3 = r3 / r6;
    L_0x00a0:
        r6 = r7 - r3;
        r6 = r6 / 2;
        r4 = r4 - r1;
        r7 = r4 / 2;
        r4 = new android.graphics.RectF;
        r8 = (float) r6;
        r9 = (float) r7;
        r3 = r3 + r6;
        r3 = (float) r3;
        r1 = r1 + r7;
        r1 = (float) r1;
        r4.<init>(r8, r9, r3, r1);
        r1 = new android.graphics.Matrix;
        r1.<init>();
        r3 = r4.left;
        r6 = r4.right;
        r3 = r3 + r6;
        r3 = -r3;
        r3 = r3 / r10;
        r6 = r4.top;
        r7 = r4.bottom;
        r6 = r6 + r7;
        r6 = -r6;
        r6 = r6 / r10;
        r1.preTranslate(r3, r6);
        r3 = r11.u;
        r1.postConcat(r3);
        r3 = r11.s;
        r1.postConcat(r3);
        r3 = r4.left;
        r6 = r4.right;
        r3 = r3 + r6;
        r3 = r3 / r10;
        r6 = r4.top;
        r7 = r4.bottom;
        r6 = r6 + r7;
        r6 = r6 / r10;
        r1.postTranslate(r3, r6);
        r1.mapRect(r4);
        r1 = r11.i;
        if (r1 == 0) goto L_0x0112;
    L_0x00e8:
        r3 = new android.graphics.RectF;
        r1 = r11.i;
        r3.<init>(r1);
    L_0x00ef:
        r1 = r11.w;
        r1 = r1.getImageMatrix();
        r4 = r11.q;
        r6 = r11.v;
        if (r6 == 0) goto L_0x0100;
    L_0x00fb:
        r6 = r11.f;
        if (r6 == 0) goto L_0x0100;
    L_0x00ff:
        r5 = 1;
    L_0x0100:
        r6 = r11.c;
        r7 = r11.n;
        r8 = r11.k;
        r7 = r7 / r8;
        r0.a(r1, r2, r3, r4, r5, r6, r7);
        r1 = r11.w;
        r1.c(r0);
        r11.h = r0;
        return;
    L_0x0112:
        r3 = r4;
        goto L_0x00ef;
    L_0x0114:
        r1 = r3;
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.CropImage.b():void");
    }

    protected void onResume() {
        super.onResume();
    }

    public CropImage() {
        this.o = CompressFormat.JPEG;
        this.e = null;
        this.q = false;
        this.b = true;
        this.k = 1;
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onDestroy() {
        super.onDestroy();
        if (!(this.d == null || this.d.isRecycled())) {
            this.w.s = true;
            this.d.recycle();
            this.d = null;
        }
        Log.i(z[0]);
        App.a5();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
        r10_this = this;
        r9 = 9;
        r2 = 0;
        r1 = 1;
        r3 = com.whatsapp.wallpaper.ImageViewTouchBase.e;
        r0 = z;
        r4 = 6;
        r0 = r0[r4];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r11);
        com.whatsapp.App.a5();
        r10.requestWindowFeature(r1);
        r0 = 2130903131; // 0x7f03005b float:1.7413071E38 double:1.0528060316E-314;
        r10.setContentView(r0);
        r0 = 2131427649; // 0x7f0b0141 float:1.847692E38 double:1.053065178E-314;
        r0 = r10.findViewById(r0);
        r0 = (com.whatsapp.wallpaper.CropImageView) r0;
        r10.w = r0;
        r4 = r10.getIntent();
        r5 = r4.getExtras();
        if (r5 == 0) goto L_0x0116;
    L_0x0032:
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x015e }
        r6 = 13;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x015e }
        r0 = r5.getString(r0);	 Catch:{ OutOfMemoryError -> 0x015e }
        if (r0 == 0) goto L_0x0047;
    L_0x003e:
        r0 = 1;
        r10.q = r0;	 Catch:{ OutOfMemoryError -> 0x0160 }
        r0 = 1;
        r10.v = r0;	 Catch:{ OutOfMemoryError -> 0x0160 }
        r0 = 1;
        r10.f = r0;	 Catch:{ OutOfMemoryError -> 0x0160 }
    L_0x0047:
        r0 = z;
        r6 = 4;
        r0 = r0[r6];
        r0 = r5.getParcelable(r0);
        r0 = (android.net.Uri) r0;
        r10.e = r0;
        r0 = r10.e;
        if (r0 == 0) goto L_0x006a;
    L_0x0058:
        r0 = z;
        r6 = 28;
        r0 = r0[r6];
        r0 = r5.getString(r0);
        if (r0 == 0) goto L_0x006a;
    L_0x0064:
        r0 = android.graphics.Bitmap.CompressFormat.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x0162 }
        r10.o = r0;	 Catch:{ OutOfMemoryError -> 0x0162 }
    L_0x006a:
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 7;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = r5.getParcelable(r0);	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r10.d = r0;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 8;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = r5.getInt(r0);	 Catch:{ OutOfMemoryError -> 0x0164 }
        r10.v = r0;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 21;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = r5.getInt(r0);	 Catch:{ OutOfMemoryError -> 0x0164 }
        r10.f = r0;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 3;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = r5.getInt(r0);	 Catch:{ OutOfMemoryError -> 0x0164 }
        r10.x = r0;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 15;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = r5.getInt(r0);	 Catch:{ OutOfMemoryError -> 0x0164 }
        r10.a = r0;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 27;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = r5.getInt(r0);	 Catch:{ OutOfMemoryError -> 0x0164 }
        r10.n = r0;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 31;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = r5.getInt(r0);	 Catch:{ OutOfMemoryError -> 0x0164 }
        r10.t = r0;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 25;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = r5.getParcelable(r0);	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = (android.graphics.Rect) r0;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r10.i = r0;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = r10.w;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = z;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r7 = 1;
        r6 = r6[r7];	 Catch:{ OutOfMemoryError -> 0x0164 }
        r7 = 1;
        r6 = r5.getBoolean(r6, r7);	 Catch:{ OutOfMemoryError -> 0x0164 }
        r10.c = r6;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0.q = r6;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 19;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 1;
        r0 = r5.getBoolean(r0, r6);	 Catch:{ OutOfMemoryError -> 0x0164 }
        r10.g = r0;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 17;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 1;
        r0 = r5.getBoolean(r0, r6);	 Catch:{ OutOfMemoryError -> 0x0164 }
        r10.b = r0;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 18;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = r5.getInt(r0);	 Catch:{ OutOfMemoryError -> 0x0164 }
        r10.m = r0;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 9;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0164 }
        r6 = 1;
        r0 = r5.getBoolean(r0, r6);	 Catch:{ OutOfMemoryError -> 0x0164 }
        r10.l = r0;	 Catch:{ OutOfMemoryError -> 0x0164 }
        r0 = r10.d;	 Catch:{ OutOfMemoryError -> 0x0164 }
        if (r0 == 0) goto L_0x0166;
    L_0x0113:
        r0 = r1;
    L_0x0114:
        r10.p = r0;
    L_0x0116:
        r0 = r10.d;
        if (r0 != 0) goto L_0x0240;
    L_0x011a:
        r5 = r4.getData();
        r0 = com.whatsapp.util.f.f(r5);	 Catch:{ OutOfMemoryError -> 0x0168 }
        r10.j = r0;	 Catch:{ OutOfMemoryError -> 0x0168 }
        r0 = r10.j;	 Catch:{ OutOfMemoryError -> 0x0168 }
        r0 = com.whatsapp.util.f.a(r0);	 Catch:{ OutOfMemoryError -> 0x0168 }
        r10.u = r0;	 Catch:{ OutOfMemoryError -> 0x0168 }
        r0 = r10.u;	 Catch:{ OutOfMemoryError -> 0x0168 }
        if (r0 != 0) goto L_0x0137;
    L_0x0130:
        r0 = new android.graphics.Matrix;	 Catch:{ OutOfMemoryError -> 0x0168 }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x0168 }
        r10.u = r0;	 Catch:{ OutOfMemoryError -> 0x0168 }
    L_0x0137:
        r0 = com.whatsapp.util.f.d(r5);	 Catch:{ IOException -> 0x016a }
        if (r0 != 0) goto L_0x01b7;
    L_0x013d:
        r0 = z;	 Catch:{ IOException -> 0x016a }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ IOException -> 0x016a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x016a }
        r0 = 0;
        r1 = new android.content.Intent;	 Catch:{ IOException -> 0x016a }
        r1.<init>();	 Catch:{ IOException -> 0x016a }
        r2 = z;	 Catch:{ IOException -> 0x016a }
        r4 = 14;
        r2 = r2[r4];	 Catch:{ IOException -> 0x016a }
        r4 = 1;
        r1 = r1.putExtra(r2, r4);	 Catch:{ IOException -> 0x016a }
        r10.setResult(r0, r1);	 Catch:{ IOException -> 0x016a }
        r10.finish();	 Catch:{ IOException -> 0x016a }
    L_0x015d:
        return;
    L_0x015e:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0160 }
    L_0x0160:
        r0 = move-exception;
        throw r0;
    L_0x0162:
        r0 = move-exception;
        throw r0;
    L_0x0164:
        r0 = move-exception;
        throw r0;
    L_0x0166:
        r0 = r2;
        goto L_0x0114;
    L_0x0168:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x016a }
    L_0x016a:
        r0 = move-exception;
        r1 = r0.getMessage();	 Catch:{ OutOfMemoryError -> 0x02a3 }
        if (r1 == 0) goto L_0x0197;
    L_0x0171:
        r1 = r0.getMessage();	 Catch:{ OutOfMemoryError -> 0x02a3 }
        r2 = z;	 Catch:{ OutOfMemoryError -> 0x02a3 }
        r4 = 16;
        r2 = r2[r4];	 Catch:{ OutOfMemoryError -> 0x02a3 }
        r1 = r1.contains(r2);	 Catch:{ OutOfMemoryError -> 0x02a3 }
        if (r1 == 0) goto L_0x0197;
    L_0x0181:
        r1 = 0;
        r2 = new android.content.Intent;	 Catch:{ OutOfMemoryError -> 0x02a5 }
        r2.<init>();	 Catch:{ OutOfMemoryError -> 0x02a5 }
        r4 = z;	 Catch:{ OutOfMemoryError -> 0x02a5 }
        r5 = 33;
        r4 = r4[r5];	 Catch:{ OutOfMemoryError -> 0x02a5 }
        r5 = 1;
        r2 = r2.putExtra(r4, r5);	 Catch:{ OutOfMemoryError -> 0x02a5 }
        r10.setResult(r1, r2);	 Catch:{ OutOfMemoryError -> 0x02a5 }
        if (r3 == 0) goto L_0x01aa;
    L_0x0197:
        r1 = 0;
        r2 = new android.content.Intent;	 Catch:{ OutOfMemoryError -> 0x02a7 }
        r2.<init>();	 Catch:{ OutOfMemoryError -> 0x02a7 }
        r3 = z;	 Catch:{ OutOfMemoryError -> 0x02a7 }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ OutOfMemoryError -> 0x02a7 }
        r4 = 1;
        r2 = r2.putExtra(r3, r4);	 Catch:{ OutOfMemoryError -> 0x02a7 }
        r10.setResult(r1, r2);	 Catch:{ OutOfMemoryError -> 0x02a7 }
    L_0x01aa:
        r1 = z;
        r2 = 30;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r10.finish();
        goto L_0x015d;
    L_0x01b7:
        r6 = new android.graphics.BitmapFactory$Options;	 Catch:{ IOException -> 0x016a }
        r6.<init>();	 Catch:{ IOException -> 0x016a }
        r7 = 1;
        r6.inJustDecodeBounds = r7;	 Catch:{ OutOfMemoryError -> 0x01f0 }
        r7 = 0;
        android.graphics.BitmapFactory.decodeStream(r0, r7, r6);	 Catch:{ OutOfMemoryError -> 0x01f0 }
        r0.close();	 Catch:{ OutOfMemoryError -> 0x01f0 }
        r0 = r6.outWidth;	 Catch:{ OutOfMemoryError -> 0x01f0 }
        if (r0 <= 0) goto L_0x01ce;
    L_0x01ca:
        r0 = r6.outHeight;	 Catch:{ OutOfMemoryError -> 0x01f0 }
        if (r0 > 0) goto L_0x01f2;
    L_0x01ce:
        r0 = z;	 Catch:{ IOException -> 0x016a }
        r1 = 24;
        r0 = r0[r1];	 Catch:{ IOException -> 0x016a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x016a }
        r0 = 0;
        r1 = new android.content.Intent;	 Catch:{ IOException -> 0x016a }
        r1.<init>();	 Catch:{ IOException -> 0x016a }
        r2 = z;	 Catch:{ IOException -> 0x016a }
        r4 = 26;
        r2 = r2[r4];	 Catch:{ IOException -> 0x016a }
        r4 = 1;
        r1 = r1.putExtra(r2, r4);	 Catch:{ IOException -> 0x016a }
        r10.setResult(r0, r1);	 Catch:{ IOException -> 0x016a }
        r10.finish();	 Catch:{ IOException -> 0x016a }
        goto L_0x015d;
    L_0x01f0:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x016a }
    L_0x01f2:
        r0 = 1;
        r6.inSampleSize = r0;	 Catch:{ IOException -> 0x016a }
        r0 = r6.outWidth;	 Catch:{ IOException -> 0x016a }
        r7 = r6.outHeight;	 Catch:{ IOException -> 0x016a }
        r0 = java.lang.Math.max(r0, r7);	 Catch:{ IOException -> 0x016a }
        r7 = r10.getWindowManager();	 Catch:{ IOException -> 0x016a }
        r7 = r7.getDefaultDisplay();	 Catch:{ IOException -> 0x016a }
        r7 = r7.getWidth();	 Catch:{ IOException -> 0x016a }
        r8 = r10.getWindowManager();	 Catch:{ IOException -> 0x016a }
        r8 = r8.getDefaultDisplay();	 Catch:{ IOException -> 0x016a }
        r8 = r8.getHeight();	 Catch:{ IOException -> 0x016a }
        r7 = java.lang.Math.max(r7, r8);	 Catch:{ IOException -> 0x016a }
    L_0x0219:
        if (r0 <= r7) goto L_0x0225;
    L_0x021b:
        r0 = r0 / 2;
        r8 = r6.inSampleSize;	 Catch:{ IOException -> 0x016a }
        r8 = r8 * 2;
        r6.inSampleSize = r8;	 Catch:{ IOException -> 0x016a }
        if (r3 == 0) goto L_0x0219;
    L_0x0225:
        r0 = 1;
        r6.inDither = r0;	 Catch:{ IOException -> 0x016a }
        r0 = 0;
        r6.inJustDecodeBounds = r0;	 Catch:{ IOException -> 0x016a }
        r0 = 0;
        r6.inScaled = r0;	 Catch:{ IOException -> 0x016a }
        r0 = r6.inSampleSize;	 Catch:{ IOException -> 0x016a }
        r10.k = r0;	 Catch:{ IOException -> 0x016a }
        r5 = com.whatsapp.util.f.d(r5);	 Catch:{ IOException -> 0x016a }
        r0 = 0;
        r0 = android.graphics.BitmapFactory.decodeStream(r5, r0, r6);	 Catch:{ OutOfMemoryError -> 0x0278 }
        r10.d = r0;	 Catch:{ OutOfMemoryError -> 0x0278 }
        r5.close();	 Catch:{ IOException -> 0x016a }
    L_0x0240:
        r0 = r10.d;	 Catch:{ OutOfMemoryError -> 0x02a9 }
        if (r0 == 0) goto L_0x0254;
    L_0x0244:
        r0 = r10.d;	 Catch:{ OutOfMemoryError -> 0x02a9 }
        r0 = r0.getWidth();	 Catch:{ OutOfMemoryError -> 0x02a9 }
        if (r0 == 0) goto L_0x0254;
    L_0x024c:
        r0 = r10.d;	 Catch:{ OutOfMemoryError -> 0x02ab }
        r0 = r0.getHeight();	 Catch:{ OutOfMemoryError -> 0x02ab }
        if (r0 != 0) goto L_0x02ad;
    L_0x0254:
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0276 }
        r1 = 22;
        r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x0276 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ OutOfMemoryError -> 0x0276 }
        r0 = 0;
        r1 = new android.content.Intent;	 Catch:{ OutOfMemoryError -> 0x0276 }
        r1.<init>();	 Catch:{ OutOfMemoryError -> 0x0276 }
        r2 = z;	 Catch:{ OutOfMemoryError -> 0x0276 }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ OutOfMemoryError -> 0x0276 }
        r3 = 1;
        r1 = r1.putExtra(r2, r3);	 Catch:{ OutOfMemoryError -> 0x0276 }
        r10.setResult(r0, r1);	 Catch:{ OutOfMemoryError -> 0x0276 }
        r10.finish();	 Catch:{ OutOfMemoryError -> 0x0276 }
        goto L_0x015d;
    L_0x0276:
        r0 = move-exception;
        throw r0;
    L_0x0278:
        r0 = move-exception;
        r0 = z;	 Catch:{ all -> 0x029e }
        r1 = 34;
        r0 = r0[r1];	 Catch:{ all -> 0x029e }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x029e }
        r0 = 0;
        r1 = new android.content.Intent;	 Catch:{ all -> 0x029e }
        r1.<init>();	 Catch:{ all -> 0x029e }
        r2 = z;	 Catch:{ all -> 0x029e }
        r4 = 29;
        r2 = r2[r4];	 Catch:{ all -> 0x029e }
        r4 = 1;
        r1 = r1.putExtra(r2, r4);	 Catch:{ all -> 0x029e }
        r10.setResult(r0, r1);	 Catch:{ all -> 0x029e }
        r10.finish();	 Catch:{ all -> 0x029e }
        r5.close();	 Catch:{ IOException -> 0x016a }
        goto L_0x015d;
    L_0x029e:
        r0 = move-exception;
        r5.close();	 Catch:{ IOException -> 0x016a }
        throw r0;	 Catch:{ IOException -> 0x016a }
    L_0x02a3:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x02a5 }
    L_0x02a5:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x02a7 }
    L_0x02a7:
        r0 = move-exception;
        throw r0;
    L_0x02a9:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x02ab }
    L_0x02ab:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0276 }
    L_0x02ad:
        r0 = z;
        r3 = 32;
        r0 = r0[r3];
        r0 = r4.getIntExtra(r0, r2);
        r3 = z;
        r5 = 20;
        r3 = r3[r5];
        r3 = r4.getBooleanExtra(r3, r2);
        r5 = z;
        r6 = 23;
        r5 = r5[r6];
        r4 = r4.getBooleanExtra(r5, r2);
        r5 = new android.graphics.Matrix;	 Catch:{ OutOfMemoryError -> 0x0357 }
        r5.<init>();	 Catch:{ OutOfMemoryError -> 0x0357 }
        r10.s = r5;	 Catch:{ OutOfMemoryError -> 0x0357 }
        if (r0 == 0) goto L_0x02da;
    L_0x02d4:
        r5 = r10.s;	 Catch:{ OutOfMemoryError -> 0x0357 }
        r0 = (float) r0;	 Catch:{ OutOfMemoryError -> 0x0357 }
        r5.postRotate(r0);	 Catch:{ OutOfMemoryError -> 0x0357 }
    L_0x02da:
        if (r3 == 0) goto L_0x02ee;
    L_0x02dc:
        r0 = new android.graphics.Matrix;
        r0.<init>();
        r3 = new float[r9];
        r3 = new int[]{-1082130432, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216};
        r0.setValues(r3);
        r3 = r10.s;
        r3.postConcat(r0);
    L_0x02ee:
        if (r4 == 0) goto L_0x0302;
    L_0x02f0:
        r0 = new android.graphics.Matrix;
        r0.<init>();
        r3 = new float[r9];
        r3 = new int[]{1065353216, 0, 0, 0, -1082130432, 0, 0, 0, 1065353216};
        r0.setValues(r3);
        r3 = r10.s;
        r3.postConcat(r0);
    L_0x0302:
        r0 = new com.whatsapp.wallpaper.f;
        r3 = r10.d;
        r0.<init>(r3);
        r3 = new android.graphics.Matrix;
        r3.<init>();
        r4 = r10.u;
        r3.set(r4);
        r4 = r10.s;
        r3.postConcat(r4);
        r0.a(r3);
        r3 = r10.w;
        r3.setImageRotateBitmapResetBase(r0, r1);
        r10.b();	 Catch:{ OutOfMemoryError -> 0x0359 }
        r0 = r10.getWindow();
        r1 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r0.addFlags(r1);
        r0 = 2131427775; // 0x7f0b01bf float:1.8477176E38 double:1.05306524E-314;
        r0 = r10.findViewById(r0);
        r1 = new com.whatsapp.wallpaper.j;
        r1.<init>(r10);
        r0.setOnClickListener(r1);
        r0 = 2131427774; // 0x7f0b01be float:1.8477174E38 double:1.0530652397E-314;
        r0 = r10.findViewById(r0);
        r1 = new com.whatsapp.wallpaper.n;
        r1.<init>(r10);
        r0.setOnClickListener(r1);
        r0 = z;
        r1 = 5;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        com.whatsapp.App.a5();
        goto L_0x015d;
    L_0x0357:
        r0 = move-exception;
        throw r0;
    L_0x0359:
        r0 = move-exception;
        r0 = new android.content.Intent;
        r0.<init>();
        r3 = z;
        r4 = 11;
        r3 = r3[r4];
        r0 = r0.putExtra(r3, r1);
        r10.setResult(r2, r0);
        r10.finish();
        goto L_0x015d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.CropImage.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.graphics.Bitmap r12) {
        /*
        r11_this = this;
        r10 = -1;
        r3 = 0;
        r2 = 1;
        r4 = com.whatsapp.wallpaper.ImageViewTouchBase.e;
        r0 = r11.e;
        if (r0 == 0) goto L_0x0094;
    L_0x0009:
        r5 = new java.io.File;
        r0 = r11.e;
        r0 = r0.getPath();
        r5.<init>(r0);
        r0 = 75;
    L_0x0016:
        r1 = 0;
        r6 = com.whatsapp.App.e;	 Catch:{ IOException -> 0x00ba }
        r7 = r11.e;	 Catch:{ IOException -> 0x00ba }
        r1 = r6.openOutputStream(r7);	 Catch:{ IOException -> 0x00ba }
        if (r1 == 0) goto L_0x0026;
    L_0x0021:
        r6 = r11.o;	 Catch:{ IOException -> 0x00ba }
        r12.compress(r6, r0, r1);	 Catch:{ IOException -> 0x00ba }
    L_0x0026:
        r0 = r0 + -10;
        com.whatsapp.util.b0.a(r1);
        r1 = r11.m;	 Catch:{ IOException -> 0x0128 }
        if (r1 == 0) goto L_0x0154;
    L_0x002f:
        if (r0 <= 0) goto L_0x0154;
    L_0x0031:
        r1 = r5.exists();	 Catch:{ IOException -> 0x012a }
        if (r1 == 0) goto L_0x0154;
    L_0x0037:
        r6 = r5.length();	 Catch:{ IOException -> 0x012c }
        r1 = r11.m;	 Catch:{ IOException -> 0x012c }
        r8 = (long) r1;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 > 0) goto L_0x0016;
    L_0x0042:
        r0 = r3;
    L_0x0043:
        if (r0 != 0) goto L_0x006c;
    L_0x0045:
        r1 = r11.l;	 Catch:{ IOException -> 0x012e }
        if (r1 != 0) goto L_0x006c;
    L_0x0049:
        r1 = r11.j;	 Catch:{ IOException -> 0x0130 }
        if (r1 == r2) goto L_0x006c;
    L_0x004d:
        r1 = r11.j;	 Catch:{ IOException -> 0x0132 }
        if (r1 == 0) goto L_0x006c;
    L_0x0051:
        r1 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x0134 }
        r3 = r5.getAbsolutePath();	 Catch:{ IOException -> 0x0134 }
        r1.<init>(r3);	 Catch:{ IOException -> 0x0134 }
        r3 = z;	 Catch:{ IOException -> 0x0134 }
        r5 = 37;
        r3 = r3[r5];	 Catch:{ IOException -> 0x0134 }
        r5 = r11.j;	 Catch:{ IOException -> 0x0134 }
        r5 = java.lang.Integer.toString(r5);	 Catch:{ IOException -> 0x0134 }
        r1.setAttribute(r3, r5);	 Catch:{ IOException -> 0x0134 }
        r1.saveAttributes();	 Catch:{ IOException -> 0x0134 }
    L_0x006c:
        if (r0 != 0) goto L_0x0092;
    L_0x006e:
        r0 = new android.content.Intent;
        r0.<init>();
        r1 = r11.e;
        r0.setData(r1);
        r1 = new android.os.Bundle;
        r1.<init>();
        r2 = z;
        r3 = 35;
        r2 = r2[r3];
        r3 = r11.h;
        r3 = r3.d();
        r1.putParcelable(r2, r3);
        r0.putExtras(r1);
        r11.setResult(r10, r0);
    L_0x0092:
        if (r4 == 0) goto L_0x00b3;
    L_0x0094:
        r0 = new android.os.Bundle;
        r0.<init>();
        r1 = z;
        r2 = 39;
        r1 = r1[r2];
        r2 = r11.h;
        r2 = r2.d();
        r0.putParcelable(r1, r2);
        r1 = new android.content.Intent;
        r1.<init>();
        r1.putExtras(r0);
        r11.setResult(r10, r1);
    L_0x00b3:
        r12.recycle();
        r11.finish();
        return;
    L_0x00ba:
        r0 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x011d }
        r3.<init>();	 Catch:{ IOException -> 0x011d }
        r6 = z;	 Catch:{ IOException -> 0x011d }
        r7 = 41;
        r6 = r6[r7];	 Catch:{ IOException -> 0x011d }
        r3 = r3.append(r6);	 Catch:{ IOException -> 0x011d }
        r6 = r11.e;	 Catch:{ IOException -> 0x011d }
        r3 = r3.append(r6);	 Catch:{ IOException -> 0x011d }
        r3 = r3.toString();	 Catch:{ IOException -> 0x011d }
        com.whatsapp.util.Log.b(r3, r0);	 Catch:{ IOException -> 0x011d }
        r3 = r0.getMessage();	 Catch:{ IOException -> 0x011d }
        if (r3 == 0) goto L_0x0103;
    L_0x00dd:
        r0 = r0.getMessage();	 Catch:{ IOException -> 0x011d }
        r3 = z;	 Catch:{ IOException -> 0x011d }
        r6 = 38;
        r3 = r3[r6];	 Catch:{ IOException -> 0x011d }
        r0 = r0.contains(r3);	 Catch:{ IOException -> 0x011d }
        if (r0 == 0) goto L_0x0103;
    L_0x00ed:
        r0 = 0;
        r3 = new android.content.Intent;	 Catch:{ IOException -> 0x011f }
        r3.<init>();	 Catch:{ IOException -> 0x011f }
        r6 = z;	 Catch:{ IOException -> 0x011f }
        r7 = 42;
        r6 = r6[r7];	 Catch:{ IOException -> 0x011f }
        r7 = 1;
        r3 = r3.putExtra(r6, r7);	 Catch:{ IOException -> 0x011f }
        r11.setResult(r0, r3);	 Catch:{ IOException -> 0x011f }
        if (r4 == 0) goto L_0x0117;
    L_0x0103:
        r0 = 0;
        r3 = new android.content.Intent;	 Catch:{ IOException -> 0x0121 }
        r3.<init>();	 Catch:{ IOException -> 0x0121 }
        r6 = z;	 Catch:{ IOException -> 0x0121 }
        r7 = 36;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0121 }
        r7 = 1;
        r3 = r3.putExtra(r6, r7);	 Catch:{ IOException -> 0x0121 }
        r11.setResult(r0, r3);	 Catch:{ IOException -> 0x0121 }
    L_0x0117:
        com.whatsapp.util.b0.a(r1);
        r0 = r2;
        goto L_0x0043;
    L_0x011d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x011f }
    L_0x011f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0121 }
    L_0x0121:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0123 }
    L_0x0123:
        r0 = move-exception;
        com.whatsapp.util.b0.a(r1);
        throw r0;
    L_0x0128:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x012a }
    L_0x012a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x012c }
    L_0x012c:
        r0 = move-exception;
        throw r0;
    L_0x012e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0130 }
    L_0x0130:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0132 }
    L_0x0132:
        r0 = move-exception;
        throw r0;
    L_0x0134:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r5 = 40;
        r3 = r3[r5];
        r1 = r1.append(r3);
        r3 = r11.e;
        r1 = r1.append(r3);
        r1 = r1.toString();
        com.whatsapp.util.Log.b(r1, r0);
        r0 = r2;
        goto L_0x006c;
    L_0x0154:
        r0 = r3;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.CropImage.a(android.graphics.Bitmap):void");
    }
}
