package com.whatsapp.notification;

import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.App;
import com.whatsapp.vk;
import java.util.HashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class y implements Runnable {
    private static final String[] a;
    private static final HashMap g;
    private static final String[] z;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final q f;

    public y(q qVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f = qVar;
        this.d = z;
        this.b = z2;
        this.c = z3;
        this.e = z4;
    }

    public int hashCode() {
        int i = 1;
        try {
            try {
                try {
                    int hashCode = ((this.c ? 1 : 0) + (((this.b ? 1 : 0) + (((this.d ? 1 : 0) + (this.f.hashCode() * 31)) * 31)) * 31)) * 31;
                    try {
                        if (!this.e) {
                            i = 0;
                        }
                        return hashCode + i;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    static {
        String[] strArr = new String[57];
        String str = "5ADi\u00135";
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
                        i4 = 5;
                        break;
                    case ay.f /*1*/:
                        i4 = 113;
                        break;
                    case ay.n /*2*/:
                        i4 = 116;
                        break;
                    case ay.p /*3*/:
                        i4 = 89;
                        break;
                    default:
                        i4 = 35;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "b\u0003\u001b,SZ\u001f\u001b-Jc\b+5Jb\u0019\u0000\u0006@j\u001d\u001b+";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "5ADi\u00135";
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "C72\u001feC";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    str = "b\u0003\u001b,SZ\u001f\u001b-Jc\b+-Lk\u0014";
                    i = 4;
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    strArr2 = strArr3;
                    str = "k\u001e\u00000E|.\u00020Aw\u0010\u0000<|i\u0014\u001a>Wm";
                    i = 5;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "C72\u001feC";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "k\u001e\u00000E|.\u00060Mb\u0005\u001b7F";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "k\u001e\u00000E|.\u00180Dm\u0005+:Li\u001e\u0006";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "k\u001e\u00000El\u0012\u0015-Jj\u001f+1Bv\u0019";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "%\u0002\u0017+F`\u001f+5Lf\u001aI";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "%\u0012\u001b,MqL";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "k\u001e\u00000El\u0012\u0015-Jj\u001fT*Vu\u0001\u0006<Pv\u0014\u0010c\u0003k\u001e\u0000yJkQ\u0002<Ql\u0017\u001d<G%\u0003\u0011>Jv\u0005\u00068Wl\u001e\u001ayPq\u0010\u0000<";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "%\u001d\u001d>KqL";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "b\u0003\u001b,SZ\u001a\u0011 |h\u0014\u0007*Bb\u0014\u0007";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "f\u001e\u0019wTm\u0010\u0000*Bu\u0001Z0Mq\u0014\u001a-\rd\u0012\u00000Lk_$\u0015b\\";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "k\u001e\u00000E|.\u00180Dm\u0005+:Li\u001e\u0006";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "k\u001e\u00000E|.\u00060Mb\u0005\u001b7F";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "h\u0014\u0007*Bb\u0014\u001a6Wl\u0017\u001d:Bq\u0018\u001b7\fv\u0010\u0019<\u0003";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "%\u001d\u0015+D`\u0018\u00176M";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "%\u0019\u0015*K8";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "C72\u001feC";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "%\u0012\u001b5LwL";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "%\u0000\u00010FqL";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "%\u0012\u0001*Wj\u001c";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "%\u001c\u0011*Pd\u0016\u0011d";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "%\u0007\u001d;Qd\u0005\u0011d";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "d\u001f\u0010+Ll\u0015Z)Fw\u001c\u001d*Pl\u001e\u001awvU55\rfZ0$\t|J!'\u0006pQ0 \n";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "%\u0013\u001d>Sl\u0012\u0000,Q`";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "%\u0002\u001b,MaL";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "k\u001e\u00000El\u0012\u0015-Jj\u001f\u0007yGl\u0002\u0015;O`\u0015";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "%\u0013\u001d>W`\t\u0000c";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "%\u0005\u001b7F8\u001f\u001b-Jc\u0018\u00178Wl\u001e\u001a";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "h\u0002\u0013";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    str = "b\u0003\u001b,SZ\u001f\u001b-Jc\b+5Jb\u0019\u0000\u0006@j\u001d\u001b+";
                    i = 34;
                    i2 = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    strArr2 = strArr3;
                    str = "k\u001e\u00000E|.\u00180Dm\u0005";
                    i = 35;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "k\u001e\u00000El\u0012\u0015-Jj\u001f+1Bv\u0019";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "b\u0003\u001b,SZ\u001a\u0011 |h\u0014\u0007*Bb\u0014\u0007";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "b\u0003\u001b,SZ\u001f\u001b-Jc\b+/Jg\u0003\u0015-FZ\u001d\u00117Dq\u0019";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "b\u0003\u001b,SZ\u001f\u001b-Jc\b+-Lk\u0014";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "%\u0005\u001b7F8\u0012\u001b7U`\u0003\u00078Wl\u001e\u001a";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "f\u001e\u0019wTm\u0010\u0000*Bu\u0001+)Q`\u0017\u0011+Fk\u0012\u0011*";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "n\u0014\r";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "C72\u001feC";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "%\u0018\u001a;L}K";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "h\u0014\u0007*Bb\u0014\u001a6Wl\u0017\u001d:Bq\u0018\u001b7\ff\u0004\u00064Pb^\u001a,OiQ";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "b\u0003\u001b,SZ\u001f\u001b-Jc\b+5Jb\u0019\u0000";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "h\u0014\u0007*Bb\u0014\u001a6Wl\u0017\u001d:Bq\u0018\u001b7\f%\u001f\u0011.\u001e";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "k\u001e\u00000E|.\u00020Aw\u0010\u0000<|i\u0014\u001a>Wm";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "u\u0019\u001b7F";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "h\u0014\u0007*Bb\u0014\u001a6Wl\u0017\u001d:Bq\u0018\u001b7\fk\u001e\u00000E|";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "%\u001d\u001d7F?";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "%\u0012\u001b5LwL\u001a,Oi";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "d\u001f\u0010+Ll\u0015Z+Fv\u001e\u0001+@`K[v@j\u001cZ.Kd\u0005\u00078Su^Fh\u00104AM`\u00150@";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "l\u0002+7Lq\u0018\u00120@d\u0005\u001d6M8@";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "q\u0018\u00005FZ\u001a\u0011 ";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    strArr = new String[1];
                    str = "Z\u0018\u0010";
                    i = 56;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i2] = str;
                    a = strArr3;
                    g = new HashMap();
                default:
                    strArr2[i2] = str;
                    str = "b\u0003\u001b,SZ\u001f\u001b-Jc\b+/Jg\u0003\u0015-FZ\u001d\u00117Dq\u0019";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private static boolean a(Uri uri) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2 = null;
        Boolean bool = (Boolean) g.get(uri);
        if (bool != null) {
            try {
                return bool.booleanValue();
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            Cursor query = App.e.query(uri, a, z[55], null, z[56]);
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        g.put(uri, Boolean.TRUE);
                        if (query == null) {
                            return true;
                        }
                        try {
                            query.close();
                            return true;
                        } catch (Exception e2) {
                            throw e2;
                        }
                    }
                } catch (Exception e22) {
                    throw e22;
                } catch (Exception e3) {
                    cursor = query;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = query;
                    if (cursor2 != null) {
                        try {
                            cursor2.close();
                        } catch (Exception e222) {
                            throw e222;
                        }
                    }
                    throw th;
                }
            }
            if (query != null) {
                try {
                    query.close();
                } catch (Exception e2222) {
                    throw e2222;
                }
            }
        } catch (Exception e4) {
            cursor = null;
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception e22222) {
                    throw e22222;
                }
            }
            g.put(uri, Boolean.FALSE);
            return false;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        g.put(uri, Boolean.FALSE);
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r27_this = this;
        r17 = com.whatsapp.notification.PopupNotification.H;
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0015 }
        r2 = com.whatsapp.App.e(r2);	 Catch:{ NumberFormatException -> 0x0015 }
        r3 = 3;
        if (r2 == r3) goto L_0x0017;
    L_0x000b:
        r2 = z;	 Catch:{ NumberFormatException -> 0x0015 }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0015 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x0015 }
    L_0x0014:
        return;
    L_0x0015:
        r2 = move-exception;
        throw r2;
    L_0x0017:
        r2 = com.whatsapp.App.p;
        r3 = z;
        r4 = 42;
        r3 = r3[r4];
        r4 = 0;
        r18 = r2.getSharedPreferences(r3, r4);
        r0 = r27;
        r1 = r18;
        r2 = r0.a(r1);	 Catch:{ NumberFormatException -> 0x0038 }
        if (r2 == 0) goto L_0x003a;
    L_0x002e:
        r2 = z;	 Catch:{ NumberFormatException -> 0x0038 }
        r3 = 31;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0038 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x0038 }
        goto L_0x0014;
    L_0x0038:
        r2 = move-exception;
        throw r2;
    L_0x003a:
        r2 = com.whatsapp.App.p;
        r3 = z;
        r4 = 50;
        r3 = r3[r4];
        r2 = r2.getSystemService(r3);
        r8 = r2;
        r8 = (android.telephony.TelephonyManager) r8;
        r2 = com.whatsapp.App.p;
        r19 = android.support.v4.app.NotificationManagerCompat.from(r2);
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r20 = new java.lang.StringBuilder;
        r20.<init>();
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r14 = com.whatsapp.v.b();
        r10 = r14.iterator();
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
    L_0x0069:
        r2 = r10.hasNext();
        if (r2 == 0) goto L_0x0a70;
    L_0x006f:
        r2 = r10.next();
        r2 = (java.lang.String) r2;
        r7 = com.whatsapp.App.P;
        r9 = r7.a(r2);
        r2 = r9.a;
        if (r2 <= 0) goto L_0x0a6a;
    L_0x007f:
        r2 = r9.a;
        r5 = r5 + r2;
        r6 = r6 + 1;
        r2 = com.whatsapp.App.aJ;
        r7 = r9.e;
        r7 = r2.d(r7);
        if (r7 == 0) goto L_0x0a66;
    L_0x008e:
        if (r3 == 0) goto L_0x009c;
    L_0x0090:
        r0 = r3.D;	 Catch:{ NumberFormatException -> 0x0124 }
        r22 = r0;
        r0 = r7.D;	 Catch:{ NumberFormatException -> 0x0124 }
        r24 = r0;
        r2 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1));
        if (r2 >= 0) goto L_0x0a62;
    L_0x009c:
        r2 = r7;
        r3 = r9;
    L_0x009e:
        r4 = r7.e;	 Catch:{ NumberFormatException -> 0x0126 }
        r4 = r4.a;	 Catch:{ NumberFormatException -> 0x0126 }
        r4 = r13.append(r4);	 Catch:{ NumberFormatException -> 0x0126 }
        r11 = r7.e;	 Catch:{ NumberFormatException -> 0x0126 }
        r11 = r11.b;	 Catch:{ NumberFormatException -> 0x0126 }
        r4 = r4.append(r11);	 Catch:{ NumberFormatException -> 0x0126 }
        r7 = r7.e;	 Catch:{ NumberFormatException -> 0x0126 }
        r7 = r7.c;	 Catch:{ NumberFormatException -> 0x0126 }
        r4.append(r7);	 Catch:{ NumberFormatException -> 0x0126 }
        if (r17 == 0) goto L_0x0a7c;
    L_0x00b7:
        r4 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0126 }
        r4.<init>();	 Catch:{ NumberFormatException -> 0x0126 }
        r7 = z;	 Catch:{ NumberFormatException -> 0x0126 }
        r11 = 46;
        r7 = r7[r11];	 Catch:{ NumberFormatException -> 0x0126 }
        r4 = r4.append(r7);	 Catch:{ NumberFormatException -> 0x0126 }
        r7 = r9.e;	 Catch:{ NumberFormatException -> 0x0126 }
        r4 = r4.append(r7);	 Catch:{ NumberFormatException -> 0x0126 }
        r7 = " ";
        r4 = r4.append(r7);	 Catch:{ NumberFormatException -> 0x0126 }
        r7 = r9.a;	 Catch:{ NumberFormatException -> 0x0126 }
        r4 = r4.append(r7);	 Catch:{ NumberFormatException -> 0x0126 }
        r4 = r4.toString();	 Catch:{ NumberFormatException -> 0x0126 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ NumberFormatException -> 0x0126 }
        r4 = r5;
        r5 = r6;
    L_0x00e1:
        if (r17 == 0) goto L_0x0a76;
    L_0x00e3:
        r9 = r2;
        r10 = r3;
        r11 = r4;
        r12 = r5;
    L_0x00e7:
        r2 = r13.toString();
        r21 = com.whatsapp.a54.b(r2);
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        r3 = 0;
        r0 = r18;
        r2 = r0.getString(r2, r3);
        r0 = r21;
        r2 = r0.equals(r2);	 Catch:{ NumberFormatException -> 0x0122 }
        if (r2 == 0) goto L_0x0128;
    L_0x0104:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0122 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0122 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x0122 }
        r4 = 19;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0122 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0122 }
        r0 = r21;
        r2 = r2.append(r0);	 Catch:{ NumberFormatException -> 0x0122 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0122 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x0122 }
        goto L_0x0014;
    L_0x0122:
        r2 = move-exception;
        throw r2;
    L_0x0124:
        r2 = move-exception;
        throw r2;
    L_0x0126:
        r2 = move-exception;
        throw r2;
    L_0x0128:
        if (r12 == 0) goto L_0x012c;
    L_0x012a:
        if (r10 != 0) goto L_0x0136;
    L_0x012c:
        r2 = 1;
        r0 = r19;
        r0.cancel(r2);	 Catch:{ NumberFormatException -> 0x0134 }
        goto L_0x0014;
    L_0x0134:
        r2 = move-exception;
        throw r2;
    L_0x0136:
        r2 = r10.w();	 Catch:{ NumberFormatException -> 0x0158 }
        if (r2 == 0) goto L_0x015c;
    L_0x013c:
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0158 }
        r3 = r10.e;	 Catch:{ NumberFormatException -> 0x0158 }
        r2 = com.whatsapp.notification.t.b(r2, r3);	 Catch:{ NumberFormatException -> 0x0158 }
        if (r2 != 0) goto L_0x015c;
    L_0x0146:
        r0 = r27;
        r2 = r0.d;	 Catch:{ NumberFormatException -> 0x015a }
        if (r2 == 0) goto L_0x0014;
    L_0x014c:
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0156 }
        com.whatsapp.appwidget.WidgetProvider.a(r2);	 Catch:{ NumberFormatException -> 0x0156 }
        com.whatsapp.App.w();	 Catch:{ NumberFormatException -> 0x0156 }
        goto L_0x0014;
    L_0x0156:
        r2 = move-exception;
        throw r2;
    L_0x0158:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x015a }
    L_0x015a:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0156 }
    L_0x015c:
        if (r10 != 0) goto L_0x0161;
    L_0x015e:
        r2 = 0;
        if (r17 == 0) goto L_0x0a5f;
    L_0x0161:
        r0 = r27;
        r3 = r0.f;	 Catch:{ NumberFormatException -> 0x08ca }
        r2 = r10.w();	 Catch:{ NumberFormatException -> 0x08ca }
        if (r2 == 0) goto L_0x08ce;
    L_0x016b:
        r2 = com.whatsapp.sg.GROUP;	 Catch:{ NumberFormatException -> 0x08cc }
    L_0x016d:
        r0 = r18;
        r2 = r3.a(r0, r2);
        r13 = r2;
    L_0x0174:
        r22 = new java.lang.StringBuilder;
        r22.<init>();
        r2 = 1;
        if (r12 != r2) goto L_0x01ba;
    L_0x017c:
        r2 = com.whatsapp.App.p;
        r2 = r10.a(r2);
        r2 = com.whatsapp.util.a5.a(r2);
        r3 = 1;
        if (r11 != r3) goto L_0x019c;
    L_0x0189:
        r3 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x08d2 }
        r4 = 0;
        r5 = 0;
        r3 = com.whatsapp.notification.t.a(r3, r9, r10, r4, r5);	 Catch:{ NumberFormatException -> 0x08d2 }
        r3 = com.whatsapp.util.a5.a(r3);	 Catch:{ NumberFormatException -> 0x08d2 }
        r0 = r22;
        r0.append(r3);	 Catch:{ NumberFormatException -> 0x08d2 }
        if (r17 == 0) goto L_0x01f9;
    L_0x019c:
        r3 = com.whatsapp.App.aX;	 Catch:{ NumberFormatException -> 0x08d4 }
        r4 = 2131558435; // 0x7f0d0023 float:1.8742186E38 double:1.053129795E-314;
        r3 = r3.a(r4, r11);	 Catch:{ NumberFormatException -> 0x08d4 }
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x08d4 }
        r5 = 0;
        r6 = java.lang.Integer.valueOf(r11);	 Catch:{ NumberFormatException -> 0x08d4 }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x08d4 }
        r3 = java.lang.String.format(r3, r4);	 Catch:{ NumberFormatException -> 0x08d4 }
        r0 = r22;
        r0.append(r3);	 Catch:{ NumberFormatException -> 0x08d4 }
        if (r17 == 0) goto L_0x01f9;
    L_0x01ba:
        r2 = com.whatsapp.App.p;
        r3 = 2131624007; // 0x7f0e0047 float:1.8875182E38 double:1.0531621917E-314;
        r2 = r2.getString(r3);
        r3 = com.whatsapp.App.aX;
        r4 = 2131558436; // 0x7f0d0024 float:1.8742188E38 double:1.0531297953E-314;
        r3 = r3.a(r4, r11);
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r6 = java.lang.Integer.valueOf(r11);
        r4[r5] = r6;
        r3 = java.lang.String.format(r3, r4);
        r4 = com.whatsapp.App.aX;
        r5 = 2131558437; // 0x7f0d0025 float:1.874219E38 double:1.053129796E-314;
        r4 = r4.a(r5, r12);
        r5 = 2;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r5[r6] = r3;
        r3 = 1;
        r6 = java.lang.Integer.valueOf(r12);
        r5[r3] = r6;
        r3 = java.lang.String.format(r4, r5);
        r0 = r22;
        r0.append(r3);
    L_0x01f9:
        r16 = r2;
        r0 = r27;
        r2 = r0.d;	 Catch:{ NumberFormatException -> 0x08d6 }
        if (r2 != 0) goto L_0x0207;
    L_0x0201:
        r0 = r27;
        r2 = r0.e;	 Catch:{ NumberFormatException -> 0x08d6 }
        if (r2 == 0) goto L_0x0014;
    L_0x0207:
        r23 = new android.support.v4.app.NotificationCompat$Builder;
        r2 = com.whatsapp.App.p;
        r0 = r23;
        r0.<init>(r2);
        r2 = z;
        r3 = 34;
        r2 = r2[r3];
        r0 = r23;
        r0.setCategory(r2);
        r2 = r10.w();
        if (r2 != 0) goto L_0x0232;
    L_0x0221:
        r2 = com.whatsapp.App.e;
        r2 = r10.a(r2);
        if (r2 == 0) goto L_0x0232;
    L_0x0229:
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x08da }
        r0 = r23;
        r0.addPerson(r2);	 Catch:{ NumberFormatException -> 0x08da }
    L_0x0232:
        r2 = z;
        r3 = 15;
        r2 = r2[r3];
        r0 = r23;
        r0.setGroup(r2);
        r2 = 1;
        r0 = r23;
        r0.setGroupSummary(r2);
        r3 = 0;
        r2 = 0;
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x08dc }
        r5 = 16;
        if (r4 < r5) goto L_0x0a5c;
    L_0x024b:
        r4 = 1;
        if (r12 != r4) goto L_0x0a5c;
    L_0x024e:
        r4 = r9.j;	 Catch:{ NumberFormatException -> 0x08de }
        r5 = 1;
        if (r4 != r5) goto L_0x0a5c;
    L_0x0253:
        r4 = r9.A;	 Catch:{ NumberFormatException -> 0x08e0 }
        if (r4 == 0) goto L_0x0a5c;
    L_0x0257:
        r2 = com.whatsapp.App.k(r9);
        r15 = r2;
        r3 = r2;
    L_0x025d:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x08e2 }
        r4 = 11;
        if (r2 < r4) goto L_0x0a59;
    L_0x0263:
        if (r10 == 0) goto L_0x0a59;
    L_0x0265:
        r2 = 1;
        if (r12 != r2) goto L_0x0a59;
    L_0x0268:
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r4 = 17104901; // 0x1050005 float:2.4428256E-38 double:8.450944E-317;
        r2 = r2.getDimensionPixelSize(r4);
        r4 = com.whatsapp.App.p;
        r4 = r4.getResources();
        r5 = 17104902; // 0x1050006 float:2.442826E-38 double:8.4509445E-317;
        r4 = r4.getDimensionPixelSize(r5);
        r4 = java.lang.Math.min(r2, r4);
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x08e6 }
        r5 = 21;
        if (r2 < r5) goto L_0x08e8;
    L_0x028c:
        r2 = -1;
    L_0x028d:
        r5 = (float) r2;
        r7 = r10.b(r4, r5);
        if (r7 != 0) goto L_0x02a0;
    L_0x0294:
        r5 = r10.B;	 Catch:{ NumberFormatException -> 0x08eb }
        if (r5 == 0) goto L_0x02a0;
    L_0x0298:
        if (r4 <= 0) goto L_0x02a0;
    L_0x029a:
        r2 = (float) r2;
        r5 = 1;
        r7 = r10.a(r4, r2, r5);
    L_0x02a0:
        if (r7 == 0) goto L_0x0a59;
    L_0x02a2:
        r2 = z;	 Catch:{ NumberFormatException -> 0x08ef }
        r4 = 20;
        r2 = r2[r4];	 Catch:{ NumberFormatException -> 0x08ef }
        r0 = r20;
        r0.append(r2);	 Catch:{ NumberFormatException -> 0x08ef }
        r0 = r23;
        r0.setLargeIcon(r7);	 Catch:{ NumberFormatException -> 0x08ef }
        r2 = com.whatsapp.notification.AndroidWear.b();	 Catch:{ NumberFormatException -> 0x08ef }
        if (r2 == 0) goto L_0x0a59;
    L_0x02b8:
        if (r3 != 0) goto L_0x0a59;
    L_0x02ba:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x08f3 }
        r3 = 16;
        if (r2 < r3) goto L_0x0543;
    L_0x02c0:
        r2 = 1;
        if (r11 <= r2) goto L_0x046b;
    L_0x02c3:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r24 = new java.util.ArrayList;
        r24.<init>();
        r3 = r14.iterator();
    L_0x02d1:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x02fa;
    L_0x02d7:
        r2 = r3.next();
        r2 = (java.lang.String) r2;
        r0 = r27;
        r4 = r0.f;
        r2 = r4.b(r2);
        r4 = r2.size();	 Catch:{ NumberFormatException -> 0x08f5 }
        if (r4 <= 0) goto L_0x02f5;
    L_0x02eb:
        r4 = 0;
        r4 = r2.get(r4);	 Catch:{ NumberFormatException -> 0x08f5 }
        r0 = r24;
        r0.add(r4);	 Catch:{ NumberFormatException -> 0x08f5 }
    L_0x02f5:
        r5.addAll(r2);
        if (r17 == 0) goto L_0x02d1;
    L_0x02fa:
        r2 = new com.whatsapp.notification.j;
        r0 = r27;
        r2.<init>(r0);
        java.util.Collections.sort(r5, r2);
        r2 = r5.size();
        r3 = 1;
        if (r2 <= r3) goto L_0x0393;
    L_0x030b:
        r6 = new android.support.v4.app.NotificationCompat$InboxStyle;
        r6.<init>();
        r2 = 0;
        r3 = r5.size();
        r3 = r3 + -7;
        r2 = java.lang.Math.max(r2, r3);
        r3 = r2;
    L_0x031c:
        r2 = r5.size();
        if (r3 >= r2) goto L_0x0370;
    L_0x0322:
        r2 = r5.get(r3);
        r2 = (com.whatsapp.protocol.b) r2;
        r4 = com.whatsapp.App.P;
        r14 = r2.e;
        r14 = r14.c;
        r14 = r4.a(r14);
        r25 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x08f7 }
        r4 = 1;
        if (r12 <= r4) goto L_0x08f9;
    L_0x0337:
        r4 = 1;
    L_0x0338:
        r26 = 0;
        r0 = r25;
        r1 = r26;
        r2 = com.whatsapp.notification.t.a(r0, r2, r14, r4, r1);
        r2 = com.whatsapp.util.a5.a(r2);
        r6.addLine(r2);
        r4 = z;
        r14 = 52;
        r4 = r4[r14];
        r0 = r20;
        r4 = r0.append(r4);
        r4 = r4.append(r3);
        r14 = "(";
        r4 = r4.append(r14);
        r2 = r2.length();
        r2 = r4.append(r2);
        r4 = ")";
        r2.append(r4);
        r2 = r3 + 1;
        if (r17 == 0) goto L_0x0a56;
    L_0x0370:
        r0 = r22;
        r6.setSummaryText(r0);
        r0 = r23;
        r0.setStyle(r6);
        r2 = z;
        r3 = 45;
        r2 = r2[r3];
        r0 = r20;
        r2 = r0.append(r2);
        r3 = 8;
        r4 = r5.size();
        r3 = java.lang.Math.min(r3, r4);
        r2.append(r3);
    L_0x0393:
        r2 = com.whatsapp.notification.AndroidWear.b();	 Catch:{ NumberFormatException -> 0x08fc }
        if (r2 == 0) goto L_0x0469;
    L_0x0399:
        r0 = r27;
        r2 = r0.e;	 Catch:{ NumberFormatException -> 0x08fc }
        if (r2 == 0) goto L_0x03a2;
    L_0x039f:
        r2 = 1;
        if (r12 > r2) goto L_0x0469;
    L_0x03a2:
        r2 = new com.whatsapp.notification.j;
        r0 = r27;
        r2.<init>(r0);
        r0 = r24;
        java.util.Collections.sort(r0, r2);
        r25 = new android.support.v4.app.NotificationCompat$Builder;
        r2 = com.whatsapp.App.p;
        r0 = r25;
        r0.<init>(r2);
        r2 = z;
        r3 = 38;
        r2 = r2[r3];
        r0 = r25;
        r0.setGroup(r2);
        r2 = 2130838997; // 0x7f0205d5 float:1.7282992E38 double:1.052774345E-314;
        r0 = r25;
        r0.setSmallIcon(r2);
        r2 = 1;
        r0 = r25;
        r0.setOnlyAlertOnce(r2);
        r2 = 0;
        r3 = r2;
    L_0x03d2:
        r2 = 0;
        r4 = r24.size();
        r4 = r4 + -7;
        r2 = java.lang.Math.max(r2, r4);
        if (r3 >= r2) goto L_0x0a53;
    L_0x03df:
        r0 = r24;
        r2 = r0.get(r3);
        r2 = (com.whatsapp.protocol.b) r2;
        r2 = r2.e;
        r2 = r2.c;
        r4 = 1;
        r0 = r19;
        r0.cancel(r2, r4);
        r2 = r3 + 1;
        if (r17 == 0) goto L_0x0a50;
    L_0x03f5:
        r14 = r2;
    L_0x03f6:
        r2 = r24.size();
        if (r14 >= r2) goto L_0x0469;
    L_0x03fc:
        r0 = r24;
        r2 = r0.get(r14);
        r2 = (com.whatsapp.protocol.b) r2;
        r3 = com.whatsapp.App.P;
        r4 = r2.e;
        r4 = r4.c;
        r3 = r3.a(r4);
        r4 = r2.D;
        r0 = r25;
        r0.setWhen(r4);
        r4 = com.whatsapp.App.p;
        r2 = com.whatsapp.notification.t.a(r4, r2, r3);
        r4 = r2.a();	 Catch:{ NumberFormatException -> 0x0900 }
        r4 = com.whatsapp.util.a5.a(r4);	 Catch:{ NumberFormatException -> 0x0900 }
        r0 = r25;
        r0.setContentTitle(r4);	 Catch:{ NumberFormatException -> 0x0900 }
        r2 = r2.b();	 Catch:{ NumberFormatException -> 0x0900 }
        r2 = com.whatsapp.util.a5.a(r2);	 Catch:{ NumberFormatException -> 0x0900 }
        r0 = r25;
        r0.setContentText(r2);	 Catch:{ NumberFormatException -> 0x0900 }
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0900 }
        r4 = 0;
        r5 = 0;
        r6 = 1;
        if (r12 != r6) goto L_0x0902;
    L_0x043c:
        r6 = 1;
    L_0x043d:
        r2 = com.whatsapp.notification.AndroidWear.a(r2, r3, r4, r5, r6, r7);
        r0 = r25;
        r0.extend(r2);
        r2 = com.whatsapp.App.p;
        r2 = com.whatsapp.Conversation.a(r2, r3);
        r4 = com.whatsapp.App.p;
        r5 = 0;
        r6 = 0;
        r2 = android.app.PendingIntent.getActivity(r4, r5, r2, r6);
        r0 = r25;
        r0.setContentIntent(r2);
        r2 = r3.e;
        r3 = 1;
        r4 = r25.build();
        r0 = r19;
        r0.notify(r2, r3, r4);
        r2 = r14 + 1;
        if (r17 == 0) goto L_0x03f5;
    L_0x0469:
        if (r17 == 0) goto L_0x0543;
    L_0x046b:
        r2 = com.whatsapp.notification.AndroidWear.b();	 Catch:{ NumberFormatException -> 0x0905 }
        if (r2 == 0) goto L_0x0480;
    L_0x0471:
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0907 }
        r4 = 1;
        r6 = 1;
        r3 = r10;
        r5 = r9;
        r2 = com.whatsapp.notification.AndroidWear.a(r2, r3, r4, r5, r6, r7);	 Catch:{ NumberFormatException -> 0x0907 }
        r0 = r23;
        r0.extend(r2);	 Catch:{ NumberFormatException -> 0x0907 }
    L_0x0480:
        r2 = 0;
        if (r15 == 0) goto L_0x04a1;
    L_0x0483:
        r2 = new android.support.v4.app.NotificationCompat$BigPictureStyle;
        r2.<init>();
        r0 = r22;
        r2.setSummaryText(r0);
        r2.bigPicture(r15);
        r0 = r23;
        r0.setStyle(r2);
        r2 = 1;
        r3 = z;
        r4 = 29;
        r3 = r3[r4];
        r0 = r20;
        r0.append(r3);
    L_0x04a1:
        if (r2 != 0) goto L_0x04df;
    L_0x04a3:
        r2 = new android.support.v4.app.NotificationCompat$BigTextStyle;
        r2.<init>();
        r0 = r22;
        r2.bigText(r0);
        r3 = com.whatsapp.App.aX;
        r4 = 2131558435; // 0x7f0d0023 float:1.8742186E38 double:1.053129795E-314;
        r3 = r3.a(r4, r11);
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r6 = java.lang.Integer.valueOf(r11);
        r4[r5] = r6;
        r3 = java.lang.String.format(r3, r4);
        r2.setSummaryText(r3);
        r0 = r23;
        r0.setStyle(r2);
        r2 = z;
        r3 = 32;
        r2 = r2[r3];
        r0 = r20;
        r2 = r0.append(r2);
        r3 = r22.length();
        r2.append(r3);
    L_0x04df:
        r2 = r9.j;	 Catch:{ NumberFormatException -> 0x0909 }
        r3 = 2;
        if (r2 == r3) goto L_0x04e9;
    L_0x04e4:
        r2 = r9.j;	 Catch:{ NumberFormatException -> 0x0909 }
        r3 = 1;
        if (r2 != r3) goto L_0x0543;
    L_0x04e9:
        r2 = r9.A;	 Catch:{ NumberFormatException -> 0x090b }
        if (r2 == 0) goto L_0x0543;
    L_0x04ed:
        r2 = r9.A;
        r2 = (com.whatsapp.MediaData) r2;
        r3 = r2.transferred;	 Catch:{ NumberFormatException -> 0x090d }
        if (r3 == 0) goto L_0x0543;
    L_0x04f5:
        r3 = r2.file;	 Catch:{ NumberFormatException -> 0x090d }
        if (r3 == 0) goto L_0x0543;
    L_0x04f9:
        r2 = r2.file;	 Catch:{ NumberFormatException -> 0x090f }
        r2 = r2.exists();	 Catch:{ NumberFormatException -> 0x090f }
        if (r2 == 0) goto L_0x0543;
    L_0x0501:
        r2 = com.whatsapp.Conversation.a(r10);
        r3 = z;
        r4 = 16;
        r3 = r3[r4];
        r2.setAction(r3);
        r3 = z;
        r4 = 43;
        r3 = r3[r4];
        r4 = new com.whatsapp.w4;
        r5 = r9.e;
        r4.<init>(r5);
        r2.putExtra(r3, r4);
        r3 = com.whatsapp.App.p;
        r4 = 0;
        r5 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r4 = android.app.PendingIntent.getActivity(r3, r4, r2, r5);
        r2 = r9.j;	 Catch:{ NumberFormatException -> 0x0911 }
        r3 = 1;
        if (r2 != r3) goto L_0x0913;
    L_0x052c:
        r2 = 2130838995; // 0x7f0205d3 float:1.7282988E38 double:1.0527743442E-314;
        r3 = r2;
    L_0x0530:
        r5 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0919 }
        r2 = r9.j;	 Catch:{ NumberFormatException -> 0x0919 }
        r6 = 1;
        if (r2 != r6) goto L_0x091b;
    L_0x0537:
        r2 = 2131625073; // 0x7f0e0471 float:1.8877344E38 double:1.0531627184E-314;
    L_0x053a:
        r2 = r5.getString(r2);
        r0 = r23;
        r0.addAction(r3, r2, r4);
    L_0x0543:
        r2 = java.lang.System.currentTimeMillis();
        r0 = r27;
        r4 = r0.f;
        r4 = r4.b;
        r4 = r2 - r4;
        r6 = 2130838997; // 0x7f0205d5 float:1.7282992E38 double:1.052774345E-314;
        r0 = r23;
        r0.setSmallIcon(r6);	 Catch:{ NumberFormatException -> 0x0920 }
        r0 = r27;
        r6 = r0.e;	 Catch:{ NumberFormatException -> 0x0920 }
        if (r6 != 0) goto L_0x0568;
    L_0x055d:
        r6 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0920 }
        r6 = com.whatsapp.notification.t.b(r6, r9, r10);	 Catch:{ NumberFormatException -> 0x0920 }
        r0 = r23;
        r0.setTicker(r6);	 Catch:{ NumberFormatException -> 0x0920 }
    L_0x0568:
        r0 = r23;
        r0.setWhen(r2);	 Catch:{ NumberFormatException -> 0x0922 }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x0738;
    L_0x0573:
        r0 = r27;
        r2 = r0.b;	 Catch:{ NumberFormatException -> 0x0922 }
        if (r2 != 0) goto L_0x0738;
    L_0x0579:
        r2 = "0";
        if (r10 == 0) goto L_0x05b1;
    L_0x057d:
        r3 = r10.w();	 Catch:{ NumberFormatException -> 0x0924 }
        if (r3 == 0) goto L_0x058d;
    L_0x0583:
        r3 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0926 }
        r4 = r10.e;	 Catch:{ NumberFormatException -> 0x0926 }
        r3 = com.whatsapp.notification.t.a(r3, r4);	 Catch:{ NumberFormatException -> 0x0926 }
        if (r3 != 0) goto L_0x05b1;
    L_0x058d:
        r2 = r10.w();	 Catch:{ NumberFormatException -> 0x0928 }
        if (r2 == 0) goto L_0x05a3;
    L_0x0593:
        r2 = z;
        r3 = 39;
        r2 = r2[r3];
        r3 = "1";
        r0 = r18;
        r2 = r0.getString(r2, r3);
        if (r17 == 0) goto L_0x05b1;
    L_0x05a3:
        r2 = z;
        r3 = 49;
        r2 = r2[r3];
        r3 = "1";
        r0 = r18;
        r2 = r0.getString(r2, r3);
    L_0x05b1:
        r3 = z;
        r4 = 27;
        r3 = r3[r4];
        r0 = r20;
        r3 = r0.append(r3);
        r3.append(r2);
        r3 = -1;
        r4 = r2.hashCode();	 Catch:{ NumberFormatException -> 0x094b }
        switch(r4) {
            case 49: goto L_0x092a;
            case 50: goto L_0x0935;
            case 51: goto L_0x0940;
            default: goto L_0x05c8;
        };
    L_0x05c8:
        r2 = r3;
    L_0x05c9:
        switch(r2) {
            case 0: goto L_0x0951;
            case 1: goto L_0x0959;
            case 2: goto L_0x0966;
            default: goto L_0x05cc;
        };
    L_0x05cc:
        r2 = r8.getCallState();	 Catch:{ NumberFormatException -> 0x0979 }
        if (r2 != 0) goto L_0x0671;
    L_0x05d2:
        r2 = com.whatsapp.Voip.f();	 Catch:{ NumberFormatException -> 0x0979 }
        if (r2 != 0) goto L_0x0671;
    L_0x05d8:
        if (r10 == 0) goto L_0x0671;
    L_0x05da:
        r3 = 0;
        r2 = de.greenrobot.event.g.b();
        r4 = com.whatsapp.bz.class;
        r2 = r2.b(r4);
        r2 = (com.whatsapp.bz) r2;
        r2 = r2.a();	 Catch:{ NumberFormatException -> 0x097d }
        if (r2 != 0) goto L_0x0985;
    L_0x05ed:
        r2 = com.whatsapp.App.at();	 Catch:{ NumberFormatException -> 0x097d }
        if (r2 == 0) goto L_0x0985;
    L_0x05f3:
        r2 = com.whatsapp.Conversation.r();	 Catch:{ NumberFormatException -> 0x097f }
        if (r2 == 0) goto L_0x0985;
    L_0x05f9:
        r2 = com.whatsapp.Conversation.t();	 Catch:{ NumberFormatException -> 0x0981 }
        r2 = r2.u;	 Catch:{ NumberFormatException -> 0x0981 }
        r4 = r10.e;	 Catch:{ NumberFormatException -> 0x0981 }
        r2 = r2.equals(r4);	 Catch:{ NumberFormatException -> 0x0981 }
        if (r2 == 0) goto L_0x0985;
    L_0x0607:
        r2 = com.whatsapp.Conversation.k;	 Catch:{ NumberFormatException -> 0x0983 }
        if (r2 == 0) goto L_0x0a4d;
    L_0x060b:
        r2 = z;
        r3 = 41;
        r2 = r2[r3];
        r0 = r20;
        r0.append(r2);
        r2 = z;
        r3 = 54;
        r2 = r2[r3];
    L_0x061c:
        if (r2 == 0) goto L_0x0671;
    L_0x061e:
        r2 = android.net.Uri.parse(r2);
        r3 = z;	 Catch:{ NumberFormatException -> 0x09ce }
        r4 = 30;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x09ce }
        r0 = r20;
        r3 = r0.append(r3);	 Catch:{ NumberFormatException -> 0x09ce }
        r3.append(r2);	 Catch:{ NumberFormatException -> 0x09ce }
        if (r2 == 0) goto L_0x0671;
    L_0x0633:
        r3 = r10.w();	 Catch:{ NumberFormatException -> 0x09ce }
        if (r3 == 0) goto L_0x0643;
    L_0x0639:
        r3 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x09d0 }
        r4 = r10.e;	 Catch:{ NumberFormatException -> 0x09d0 }
        r3 = com.whatsapp.notification.t.a(r3, r4);	 Catch:{ NumberFormatException -> 0x09d0 }
        if (r3 != 0) goto L_0x0671;
    L_0x0643:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x09d2 }
        r4 = 21;
        if (r3 < r4) goto L_0x066e;
    L_0x0649:
        r3 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;	 Catch:{ NumberFormatException -> 0x09d4 }
        r3 = r3.equals(r2);	 Catch:{ NumberFormatException -> 0x09d4 }
        if (r3 != 0) goto L_0x0657;
    L_0x0651:
        r3 = a(r2);	 Catch:{ NumberFormatException -> 0x09d6 }
        if (r3 == 0) goto L_0x066e;
    L_0x0657:
        r3 = com.whatsapp.Conversation.r();	 Catch:{ NumberFormatException -> 0x09d8 }
        if (r3 == 0) goto L_0x0667;
    L_0x065d:
        r3 = com.whatsapp.Conversation.t();	 Catch:{ NumberFormatException -> 0x09da }
        r3 = r3.s();	 Catch:{ NumberFormatException -> 0x09da }
        if (r3 != 0) goto L_0x0671;
    L_0x0667:
        r0 = r23;
        r0.setSound(r2);	 Catch:{ NumberFormatException -> 0x09dc }
        if (r17 == 0) goto L_0x0671;
    L_0x066e:
        com.whatsapp.App.a(r2);	 Catch:{ NumberFormatException -> 0x09de }
    L_0x0671:
        r2 = 0;
        if (r10 == 0) goto L_0x0a47;
    L_0x0674:
        r2 = r10.w();	 Catch:{ NumberFormatException -> 0x09e0 }
        if (r2 == 0) goto L_0x0689;
    L_0x067a:
        r2 = z;
        r3 = 47;
        r2 = r2[r3];
        r3 = 1;
        r0 = r18;
        r2 = r0.getBoolean(r2, r3);
        if (r17 == 0) goto L_0x0a44;
    L_0x0689:
        r2 = z;
        r3 = 36;
        r2 = r2[r3];
        r3 = 1;
        r0 = r18;
        r2 = r0.getBoolean(r2, r3);
        r3 = r2;
    L_0x0697:
        r2 = de.greenrobot.event.g.b();
        r4 = com.whatsapp.bz.class;
        r2 = r2.b(r4);
        r2 = (com.whatsapp.bz) r2;
        if (r3 == 0) goto L_0x071b;
    L_0x06a5:
        r4 = r2.a();	 Catch:{ NumberFormatException -> 0x09e2 }
        if (r4 != 0) goto L_0x06b5;
    L_0x06ab:
        r4 = com.whatsapp.notification.PopupNotification.u;	 Catch:{ NumberFormatException -> 0x09e4 }
        if (r4 == 0) goto L_0x071b;
    L_0x06af:
        r4 = com.whatsapp.notification.PopupNotification.u;	 Catch:{ NumberFormatException -> 0x09e6 }
        r4 = r4 instanceof com.whatsapp.notification.PopupNotificationLocked;	 Catch:{ NumberFormatException -> 0x09e6 }
        if (r4 == 0) goto L_0x071b;
    L_0x06b5:
        r4 = r10.w();	 Catch:{ NumberFormatException -> 0x09e8 }
        if (r4 == 0) goto L_0x06cf;
    L_0x06bb:
        r4 = z;
        r5 = 35;
        r4 = r4[r5];
        r5 = z;
        r6 = 44;
        r5 = r5[r6];
        r0 = r18;
        r4 = r0.getString(r4, r5);
        if (r17 == 0) goto L_0x06e1;
    L_0x06cf:
        r4 = z;
        r5 = 17;
        r4 = r4[r5];
        r5 = z;
        r6 = 22;
        r5 = r5[r6];
        r0 = r18;
        r4 = r0.getString(r4, r5);
    L_0x06e1:
        if (r4 == 0) goto L_0x070e;
    L_0x06e3:
        r5 = 16;
        r4 = java.lang.Integer.parseInt(r4, r5);	 Catch:{ NumberFormatException -> 0x09ea }
    L_0x06e9:
        r5 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r4 = r4 | r5;
        r5 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        if (r4 == r5) goto L_0x070c;
    L_0x06f0:
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = 4000; // 0xfa0 float:5.605E-42 double:1.9763E-320;
        r0 = r23;
        r0.setLights(r4, r5, r6);	 Catch:{ NumberFormatException -> 0x09f0 }
        r5 = z;	 Catch:{ NumberFormatException -> 0x09f0 }
        r6 = 23;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x09f0 }
        r0 = r20;
        r5 = r0.append(r5);	 Catch:{ NumberFormatException -> 0x09f0 }
        r4 = java.lang.Integer.toHexString(r4);	 Catch:{ NumberFormatException -> 0x09f0 }
        r5.append(r4);	 Catch:{ NumberFormatException -> 0x09f0 }
    L_0x070c:
        if (r17 == 0) goto L_0x0719;
    L_0x070e:
        r4 = z;	 Catch:{ NumberFormatException -> 0x09f2 }
        r5 = 53;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x09f2 }
        r0 = r20;
        r0.append(r4);	 Catch:{ NumberFormatException -> 0x09f2 }
    L_0x0719:
        if (r17 == 0) goto L_0x0738;
    L_0x071b:
        r4 = z;	 Catch:{ NumberFormatException -> 0x09f4 }
        r5 = 14;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x09f4 }
        r0 = r20;
        r4 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x09f4 }
        r3 = r4.append(r3);	 Catch:{ NumberFormatException -> 0x09f4 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x09f4 }
        r5 = 11;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x09f4 }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x09f4 }
        r3.append(r2);	 Catch:{ NumberFormatException -> 0x09f4 }
    L_0x0738:
        r2 = 1;
        if (r12 != r2) goto L_0x09f8;
    L_0x073b:
        r2 = com.whatsapp.Conversation.a(r10);	 Catch:{ NumberFormatException -> 0x09f6 }
    L_0x073f:
        r3 = com.whatsapp.App.p;
        r4 = 0;
        r5 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r2 = android.app.PendingIntent.getActivity(r3, r4, r2, r5);
        r0 = r23;
        r0.setContentIntent(r2);	 Catch:{ NumberFormatException -> 0x0a05 }
        r0 = r23;
        r1 = r16;
        r0.setContentTitle(r1);	 Catch:{ NumberFormatException -> 0x0a05 }
        r0 = r23;
        r1 = r22;
        r0.setContentText(r1);	 Catch:{ NumberFormatException -> 0x0a05 }
        r2 = com.whatsapp.App.aa;	 Catch:{ NumberFormatException -> 0x0a05 }
        r3 = 1;
        if (r2 < r3) goto L_0x0771;
    L_0x0760:
        r2 = z;	 Catch:{ NumberFormatException -> 0x0a05 }
        r3 = 26;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0a05 }
        r0 = r20;
        r2 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0a05 }
        r0 = r22;
        r2.append(r0);	 Catch:{ NumberFormatException -> 0x0a05 }
    L_0x0771:
        r2 = z;	 Catch:{ NumberFormatException -> 0x0a07 }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0a07 }
        r0 = r20;
        r2 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0a07 }
        r0 = r21;
        r2.append(r0);	 Catch:{ NumberFormatException -> 0x0a07 }
        r0 = r27;
        r2 = r0.f;	 Catch:{ NumberFormatException -> 0x0a07 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x0a07 }
        r2.b = r4;	 Catch:{ NumberFormatException -> 0x0a07 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0a07 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0a07 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x0a07 }
        r4 = 51;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0a07 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0a07 }
        r3 = r20.toString();	 Catch:{ NumberFormatException -> 0x0a07 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0a07 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0a07 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x0a07 }
        r0 = r27;
        r2 = r0.d;	 Catch:{ NumberFormatException -> 0x0a07 }
        if (r2 != 0) goto L_0x07f4;
    L_0x07b0:
        r0 = r27;
        r2 = r0.b;	 Catch:{ NumberFormatException -> 0x0a07 }
        if (r2 != 0) goto L_0x07f4;
    L_0x07b6:
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0a09 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0a09 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x0a09 }
        r4 = 48;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0a09 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0a09 }
        r0 = r27;
        r3 = r0.d;	 Catch:{ NumberFormatException -> 0x0a09 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0a09 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x0a09 }
        r4 = 24;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0a09 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0a09 }
        r0 = r27;
        r3 = r0.b;	 Catch:{ NumberFormatException -> 0x0a09 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0a09 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x0a09 }
        r4 = 12;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0a09 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0a09 }
        r2 = r2.append(r12);	 Catch:{ NumberFormatException -> 0x0a09 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0a09 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ NumberFormatException -> 0x0a09 }
    L_0x07f4:
        r2 = r8.getCallState();	 Catch:{ NumberFormatException -> 0x0a0b }
        if (r2 != 0) goto L_0x0a19;
    L_0x07fa:
        r2 = com.whatsapp.Voip.f();	 Catch:{ NumberFormatException -> 0x0a0b }
        if (r2 != 0) goto L_0x0a19;
    L_0x0800:
        if (r10 == 0) goto L_0x0a19;
    L_0x0802:
        if (r13 == 0) goto L_0x0a19;
    L_0x0804:
        r0 = r27;
        r2 = r0.c;	 Catch:{ NumberFormatException -> 0x0a11 }
        if (r2 != 0) goto L_0x0a19;
    L_0x080a:
        r2 = r10.w();	 Catch:{ NumberFormatException -> 0x0a13 }
        if (r2 == 0) goto L_0x081a;
    L_0x0810:
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0a15 }
        r3 = r10.e;	 Catch:{ NumberFormatException -> 0x0a15 }
        r2 = com.whatsapp.notification.t.e(r2, r3);	 Catch:{ NumberFormatException -> 0x0a15 }
        if (r2 != 0) goto L_0x0a19;
    L_0x081a:
        r2 = 1;
    L_0x081b:
        if (r2 != 0) goto L_0x0829;
    L_0x081d:
        r0 = r27;
        r3 = r0.e;	 Catch:{ NumberFormatException -> 0x0a1c }
        if (r3 != 0) goto L_0x0829;
    L_0x0823:
        r3 = 1;
        r0 = r23;
        r0.setPriority(r3);	 Catch:{ NumberFormatException -> 0x0a1e }
    L_0x0829:
        r3 = new android.content.Intent;
        r4 = com.whatsapp.App.p;
        r5 = com.whatsapp.notification.MessageNotificationDismissedReceiver.class;
        r3.<init>(r4, r5);
        r4 = z;
        r5 = 37;
        r4 = r4[r5];
        r0 = r21;
        r3.putExtra(r4, r0);
        r4 = com.whatsapp.App.p;
        r5 = 1;
        r6 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r3 = android.app.PendingIntent.getBroadcast(r4, r5, r3, r6);
        r0 = r23;
        r0.setDeleteIntent(r3);
        r3 = com.whatsapp.App.p;
        r3 = r3.getResources();
        r4 = 2131296301; // 0x7f09002d float:1.8210515E38 double:1.0530002834E-314;
        r3 = r3.getColor(r4);
        r0 = r23;
        r0.setColor(r3);
        r3 = r23.getNotification();
        r0 = r27;
        r4 = r0.e;	 Catch:{ NumberFormatException -> 0x0a20 }
        if (r4 == 0) goto L_0x0870;
    L_0x0867:
        r4 = 1;
        if (r11 != r4) goto L_0x0870;
    L_0x086a:
        r4 = 1;
        r0 = r19;
        r0.cancel(r4);	 Catch:{ NumberFormatException -> 0x0a22 }
    L_0x0870:
        r4 = 1;
        r0 = r19;
        r0.notify(r4, r3);	 Catch:{ SecurityException -> 0x0a24 }
    L_0x0876:
        r0 = r27;
        r3 = r0.e;	 Catch:{ NumberFormatException -> 0x0a38 }
        if (r3 != 0) goto L_0x0014;
    L_0x087c:
        r3 = com.whatsapp.Conversation.r();
        if (r3 == 0) goto L_0x0890;
    L_0x0882:
        r3 = 0;
        if (r10 == 0) goto L_0x0887;
    L_0x0885:
        r3 = r10.e;
    L_0x0887:
        r4 = com.whatsapp.Conversation.t();	 Catch:{ NumberFormatException -> 0x0a3a }
        r4.j(r3);	 Catch:{ NumberFormatException -> 0x0a3a }
        if (r17 == 0) goto L_0x0893;
    L_0x0890:
        com.whatsapp.Conversation.y();	 Catch:{ NumberFormatException -> 0x0a3a }
    L_0x0893:
        if (r2 == 0) goto L_0x08a5;
    L_0x0895:
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0a3c }
        r2 = r2.U();	 Catch:{ NumberFormatException -> 0x0a3c }
        r3 = new com.whatsapp.notification.b;	 Catch:{ NumberFormatException -> 0x0a3c }
        r4 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0a3c }
        r3.<init>(r4, r13);	 Catch:{ NumberFormatException -> 0x0a3c }
        r2.post(r3);	 Catch:{ NumberFormatException -> 0x0a3c }
    L_0x08a5:
        r0 = r27;
        r2 = r0.d;	 Catch:{ NumberFormatException -> 0x0a3e }
        if (r2 == 0) goto L_0x08b8;
    L_0x08ab:
        if (r10 == 0) goto L_0x08b8;
    L_0x08ad:
        r2 = r10.w();	 Catch:{ NumberFormatException -> 0x0a42 }
        if (r2 == 0) goto L_0x08b8;
    L_0x08b3:
        r2 = r10.e;	 Catch:{ NumberFormatException -> 0x0a42 }
        com.whatsapp.notification.t.a(r2);	 Catch:{ NumberFormatException -> 0x0a42 }
    L_0x08b8:
        r0 = r27;
        r2 = r0.d;	 Catch:{ NumberFormatException -> 0x08c8 }
        if (r2 == 0) goto L_0x0014;
    L_0x08be:
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x08c8 }
        com.whatsapp.appwidget.WidgetProvider.a(r2);	 Catch:{ NumberFormatException -> 0x08c8 }
        com.whatsapp.App.w();	 Catch:{ NumberFormatException -> 0x08c8 }
        goto L_0x0014;
    L_0x08c8:
        r2 = move-exception;
        throw r2;
    L_0x08ca:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x08cc }
    L_0x08cc:
        r2 = move-exception;
        throw r2;
    L_0x08ce:
        r2 = com.whatsapp.sg.INDIVIDUAL;
        goto L_0x016d;
    L_0x08d2:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x08d4 }
    L_0x08d4:
        r2 = move-exception;
        throw r2;
    L_0x08d6:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x08d8 }
    L_0x08d8:
        r2 = move-exception;
        throw r2;
    L_0x08da:
        r2 = move-exception;
        throw r2;
    L_0x08dc:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x08de }
    L_0x08de:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x08e0 }
    L_0x08e0:
        r2 = move-exception;
        throw r2;
    L_0x08e2:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x08e4 }
    L_0x08e4:
        r2 = move-exception;
        throw r2;
    L_0x08e6:
        r2 = move-exception;
        throw r2;
    L_0x08e8:
        r2 = 0;
        goto L_0x028d;
    L_0x08eb:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x08ed }
    L_0x08ed:
        r2 = move-exception;
        throw r2;
    L_0x08ef:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x08f1 }
    L_0x08f1:
        r2 = move-exception;
        throw r2;
    L_0x08f3:
        r2 = move-exception;
        throw r2;
    L_0x08f5:
        r2 = move-exception;
        throw r2;
    L_0x08f7:
        r2 = move-exception;
        throw r2;
    L_0x08f9:
        r4 = 0;
        goto L_0x0338;
    L_0x08fc:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x08fe }
    L_0x08fe:
        r2 = move-exception;
        throw r2;
    L_0x0900:
        r2 = move-exception;
        throw r2;
    L_0x0902:
        r6 = 0;
        goto L_0x043d;
    L_0x0905:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0907 }
    L_0x0907:
        r2 = move-exception;
        throw r2;
    L_0x0909:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x090b }
    L_0x090b:
        r2 = move-exception;
        throw r2;
    L_0x090d:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x090f }
    L_0x090f:
        r2 = move-exception;
        throw r2;
    L_0x0911:
        r2 = move-exception;
        throw r2;
    L_0x0913:
        r2 = 2130838994; // 0x7f0205d2 float:1.7282986E38 double:1.052774344E-314;
        r3 = r2;
        goto L_0x0530;
    L_0x0919:
        r2 = move-exception;
        throw r2;
    L_0x091b:
        r2 = 2131624681; // 0x7f0e02e9 float:1.8876549E38 double:1.0531625247E-314;
        goto L_0x053a;
    L_0x0920:
        r2 = move-exception;
        throw r2;
    L_0x0922:
        r2 = move-exception;
        throw r2;
    L_0x0924:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0926 }
    L_0x0926:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0928 }
    L_0x0928:
        r2 = move-exception;
        throw r2;
    L_0x092a:
        r4 = "1";
        r4 = r2.equals(r4);	 Catch:{ NumberFormatException -> 0x094b }
        if (r4 == 0) goto L_0x05c8;
    L_0x0932:
        r3 = 0;
        if (r17 == 0) goto L_0x05c8;
    L_0x0935:
        r4 = "2";
        r4 = r2.equals(r4);	 Catch:{ NumberFormatException -> 0x094d }
        if (r4 == 0) goto L_0x05c8;
    L_0x093d:
        r3 = 1;
        if (r17 == 0) goto L_0x05c8;
    L_0x0940:
        r4 = "3";
        r2 = r2.equals(r4);	 Catch:{ NumberFormatException -> 0x094f }
        if (r2 == 0) goto L_0x05c8;
    L_0x0948:
        r2 = 2;
        goto L_0x05c9;
    L_0x094b:
        r2 = move-exception;
        throw r2;
    L_0x094d:
        r2 = move-exception;
        throw r2;
    L_0x094f:
        r2 = move-exception;
        throw r2;
    L_0x0951:
        r2 = 2;
        r0 = r23;
        r0.setDefaults(r2);	 Catch:{ NumberFormatException -> 0x0975 }
        if (r17 == 0) goto L_0x05cc;
    L_0x0959:
        r2 = 5;
        r2 = new long[r2];	 Catch:{ NumberFormatException -> 0x0977 }
        r2 = new long[]{0, 300, 200, 300, 200};	 Catch:{ NumberFormatException -> 0x0977 }
        r0 = r23;
        r0.setVibrate(r2);	 Catch:{ NumberFormatException -> 0x0977 }
        if (r17 == 0) goto L_0x05cc;
    L_0x0966:
        r2 = 5;
        r2 = new long[r2];	 Catch:{ NumberFormatException -> 0x0973 }
        r2 = new long[]{0, 750, 250, 750, 250};	 Catch:{ NumberFormatException -> 0x0973 }
        r0 = r23;
        r0.setVibrate(r2);	 Catch:{ NumberFormatException -> 0x0973 }
        goto L_0x05cc;
    L_0x0973:
        r2 = move-exception;
        throw r2;
    L_0x0975:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0977 }
    L_0x0977:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0973 }
    L_0x0979:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x097b }
    L_0x097b:
        r2 = move-exception;
        throw r2;
    L_0x097d:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x097f }
    L_0x097f:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0981 }
    L_0x0981:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0983 }
    L_0x0983:
        r2 = move-exception;
        throw r2;
    L_0x0985:
        r2 = z;
        r3 = 33;
        r2 = r2[r3];
        r0 = r20;
        r0.append(r2);
        r2 = r10.w();
        if (r2 == 0) goto L_0x09ad;
    L_0x0996:
        r2 = z;
        r3 = 40;
        r2 = r2[r3];
        r3 = 0;
        r0 = r18;
        r2 = r0.getString(r2, r3);
    L_0x09a3:
        if (r2 != 0) goto L_0x061c;
    L_0x09a5:
        r2 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
        r2 = r2.toString();
        goto L_0x061c;
    L_0x09ad:
        r2 = z;
        r3 = 18;
        r2 = r2[r3];
        r3 = 0;
        r0 = r18;
        r3 = r0.getString(r2, r3);
        r0 = r18;
        r2 = r10.a(r0);
        if (r2 == 0) goto L_0x0a4a;
    L_0x09c2:
        r3 = z;
        r4 = 25;
        r3 = r3[r4];
        r0 = r20;
        r0.append(r3);
        goto L_0x09a3;
    L_0x09ce:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x09d0 }
    L_0x09d0:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x09d2 }
    L_0x09d2:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x09d4 }
    L_0x09d4:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x09d6 }
    L_0x09d6:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x09d8 }
    L_0x09d8:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x09da }
    L_0x09da:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x09dc }
    L_0x09dc:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x09de }
    L_0x09de:
        r2 = move-exception;
        throw r2;
    L_0x09e0:
        r2 = move-exception;
        throw r2;
    L_0x09e2:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x09e4 }
    L_0x09e4:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x09e6 }
    L_0x09e6:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x09e8 }
    L_0x09e8:
        r2 = move-exception;
        throw r2;
    L_0x09ea:
        r4 = move-exception;
        r4 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        goto L_0x06e9;
    L_0x09f0:
        r2 = move-exception;
        throw r2;
    L_0x09f2:
        r2 = move-exception;
        throw r2;
    L_0x09f4:
        r2 = move-exception;
        throw r2;
    L_0x09f6:
        r2 = move-exception;
        throw r2;
    L_0x09f8:
        r2 = new android.content.Intent;
        r3 = com.whatsapp.App.p;
        r4 = com.whatsapp.Main.b();
        r2.<init>(r3, r4);
        goto L_0x073f;
    L_0x0a05:
        r2 = move-exception;
        throw r2;
    L_0x0a07:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a09 }
    L_0x0a09:
        r2 = move-exception;
        throw r2;
    L_0x0a0b:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a0d }
    L_0x0a0d:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a0f }
    L_0x0a0f:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a11 }
    L_0x0a11:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a13 }
    L_0x0a13:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a15 }
    L_0x0a15:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a17 }
    L_0x0a17:
        r2 = move-exception;
        throw r2;
    L_0x0a19:
        r2 = 0;
        goto L_0x081b;
    L_0x0a1c:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a1e }
    L_0x0a1e:
        r2 = move-exception;
        throw r2;
    L_0x0a20:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a22 }
    L_0x0a22:
        r2 = move-exception;
        throw r2;
    L_0x0a24:
        r3 = move-exception;
        r4 = r3.toString();	 Catch:{ NumberFormatException -> 0x0a36 }
        r5 = z;	 Catch:{ NumberFormatException -> 0x0a36 }
        r6 = 28;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x0a36 }
        r4 = r4.contains(r5);	 Catch:{ NumberFormatException -> 0x0a36 }
        if (r4 != 0) goto L_0x0876;
    L_0x0a35:
        throw r3;	 Catch:{ NumberFormatException -> 0x0a36 }
    L_0x0a36:
        r2 = move-exception;
        throw r2;
    L_0x0a38:
        r2 = move-exception;
        throw r2;
    L_0x0a3a:
        r2 = move-exception;
        throw r2;
    L_0x0a3c:
        r2 = move-exception;
        throw r2;
    L_0x0a3e:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a40 }
    L_0x0a40:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0a42 }
    L_0x0a42:
        r2 = move-exception;
        throw r2;
    L_0x0a44:
        r3 = r2;
        goto L_0x0697;
    L_0x0a47:
        r3 = r2;
        goto L_0x0697;
    L_0x0a4a:
        r2 = r3;
        goto L_0x09a3;
    L_0x0a4d:
        r2 = r3;
        goto L_0x061c;
    L_0x0a50:
        r3 = r2;
        goto L_0x03d2;
    L_0x0a53:
        r14 = r3;
        goto L_0x03f6;
    L_0x0a56:
        r3 = r2;
        goto L_0x031c;
    L_0x0a59:
        r7 = r3;
        goto L_0x02ba;
    L_0x0a5c:
        r15 = r2;
        goto L_0x025d;
    L_0x0a5f:
        r13 = r2;
        goto L_0x0174;
    L_0x0a62:
        r2 = r3;
        r3 = r4;
        goto L_0x009e;
    L_0x0a66:
        r2 = r3;
        r3 = r4;
        goto L_0x00b7;
    L_0x0a6a:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        goto L_0x00e1;
    L_0x0a70:
        r9 = r3;
        r10 = r4;
        r11 = r5;
        r12 = r6;
        goto L_0x00e7;
    L_0x0a76:
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        goto L_0x0069;
    L_0x0a7c:
        r4 = r5;
        r5 = r6;
        goto L_0x00e1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.y.run():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.content.SharedPreferences r12) {
        /*
        r11_this = this;
        r7 = 0;
        r0 = 1;
        r1 = 0;
        r2 = com.whatsapp.notification.q.c();
        r3 = com.whatsapp.sg.GROUP;
        r3 = r2.a(r12, r3);
        r4 = com.whatsapp.sg.INDIVIDUAL;
        r2 = r2.a(r12, r4);
        r4 = z;
        r5 = 5;
        r4 = r4[r5];
        r4 = r12.getString(r4, r7);
        r5 = z;
        r6 = 8;
        r5 = r5[r6];
        r5 = r12.getString(r5, r7);
        r6 = z;
        r7 = 2;
        r6 = r6[r7];
        r7 = z;
        r8 = 7;
        r7 = r7[r8];
        r6 = r12.getString(r6, r7);
        r7 = z;
        r8 = 9;
        r7 = r7[r8];
        r8 = z;
        r9 = 4;
        r8 = r8[r9];
        r7 = r12.getString(r7, r8);
        r8 = z;
        r8 = r8[r0];
        r9 = "1";
        r8 = r12.getString(r8, r9);
        r9 = z;
        r10 = 6;
        r9 = r9[r10];
        r10 = "1";
        r9 = r12.getString(r9, r10);
        if (r3 != 0) goto L_0x009b;
    L_0x005a:
        if (r2 != 0) goto L_0x009b;
    L_0x005c:
        r2 = android.text.TextUtils.isEmpty(r4);	 Catch:{ NumberFormatException -> 0x008f }
        if (r2 == 0) goto L_0x009b;
    L_0x0062:
        r2 = android.text.TextUtils.isEmpty(r5);	 Catch:{ NumberFormatException -> 0x0091 }
        if (r2 == 0) goto L_0x009b;
    L_0x0068:
        r2 = z;	 Catch:{ NumberFormatException -> 0x0093 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0093 }
        r2 = android.text.TextUtils.equals(r2, r6);	 Catch:{ NumberFormatException -> 0x0093 }
        if (r2 == 0) goto L_0x009b;
    L_0x0073:
        r2 = z;	 Catch:{ NumberFormatException -> 0x0095 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0095 }
        r2 = android.text.TextUtils.equals(r2, r7);	 Catch:{ NumberFormatException -> 0x0095 }
        if (r2 == 0) goto L_0x009b;
    L_0x007e:
        r2 = "0";
        r2 = android.text.TextUtils.equals(r2, r8);	 Catch:{ NumberFormatException -> 0x0097 }
        if (r2 == 0) goto L_0x009b;
    L_0x0086:
        r2 = "0";
        r2 = android.text.TextUtils.equals(r2, r9);	 Catch:{ NumberFormatException -> 0x0099 }
        if (r2 == 0) goto L_0x009b;
    L_0x008e:
        return r0;
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0093 }
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0095 }
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0097 }
    L_0x0097:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0099 }
    L_0x0099:
        r0 = move-exception;
        throw r0;
    L_0x009b:
        r0 = r1;
        goto L_0x008e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.y.a(android.content.SharedPreferences):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4_this = this;
        r0 = 1;
        r1 = 0;
        if (r4 != r5) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        if (r5 == 0) goto L_0x0011;
    L_0x0007:
        r2 = r4.getClass();	 Catch:{ NumberFormatException -> 0x0013 }
        r3 = r5.getClass();	 Catch:{ NumberFormatException -> 0x0013 }
        if (r2 == r3) goto L_0x0015;
    L_0x0011:
        r0 = r1;
        goto L_0x0004;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r5 = (com.whatsapp.notification.y) r5;
        r2 = r4.e;	 Catch:{ NumberFormatException -> 0x003b }
        r3 = r5.e;	 Catch:{ NumberFormatException -> 0x003b }
        if (r2 != r3) goto L_0x0039;
    L_0x001d:
        r2 = r4.d;	 Catch:{ NumberFormatException -> 0x003d }
        r3 = r5.d;	 Catch:{ NumberFormatException -> 0x003d }
        if (r2 != r3) goto L_0x0039;
    L_0x0023:
        r2 = r4.c;	 Catch:{ NumberFormatException -> 0x003f }
        r3 = r5.c;	 Catch:{ NumberFormatException -> 0x003f }
        if (r2 != r3) goto L_0x0039;
    L_0x0029:
        r2 = r4.b;	 Catch:{ NumberFormatException -> 0x0041 }
        r3 = r5.b;	 Catch:{ NumberFormatException -> 0x0041 }
        if (r2 != r3) goto L_0x0039;
    L_0x002f:
        r2 = r4.f;	 Catch:{ NumberFormatException -> 0x0043 }
        r3 = r5.f;	 Catch:{ NumberFormatException -> 0x0043 }
        r2 = r2.equals(r3);	 Catch:{ NumberFormatException -> 0x0043 }
        if (r2 != 0) goto L_0x0004;
    L_0x0039:
        r0 = r1;
        goto L_0x0004;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.y.equals(java.lang.Object):boolean");
    }
}
