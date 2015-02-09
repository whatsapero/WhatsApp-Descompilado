package com.whatsapp.accountsync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.BroadcastReceiver;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.AggregationExceptions;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import com.actionbarsherlock.R;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.contact.i;
import com.whatsapp.m8;
import com.whatsapp.ok;
import com.whatsapp.util.Log;
import com.whatsapp.util.br;
import com.whatsapp.vk;
import java.util.ArrayList;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class PerformSyncManager extends BroadcastReceiver {
    public static int a;
    private static final String[] z;

    static {
        String[] strArr = new String[60];
        String str = "A.z& P\u0010\u007f9\u001aQ6x)$F.f> P";
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
                        i3 = 34;
                        break;
                    case ay.f /*1*/:
                        i3 = 79;
                        break;
                    case ay.n /*2*/:
                        i3 = 22;
                        break;
                    case ay.p /*3*/:
                        i3 = 74;
                        break;
                    default:
                        i3 = 69;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "A {d2J.b9$R?";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "C,u%0L;I$$O*6we\u001doW\u0004\u0001\u0002.u)*W!b\u00151[?sjx\u0002p";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "C,u%0L;I$$O*";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "C,u%0L;I><R*";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "A.z& P\u0010\u007f9\u001aQ6x)$F.f> P";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "V=c/";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "A {d2J.b9$R?";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "A {d$L+d%,Fau%+V.u>6";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "A {d2J.b9$R?";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "A {d$L+d%,Fau%+V.u>6";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "R*d,*P\"I9<L,I'$L.q/7\r<o$&}.z8 C+o\u0015 L+s.";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "R*d,*P\"I9<L,I'$L.q/7\r<o$&}.z8 C+o\u0015,L\u0010f8*E=s96";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "Q6x)t";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "P.a\u0015&M!b+&V\u0010\u007f.t";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "F.b+w";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "T!rd$L+d%,Fau?7Q dd,V*{e3L+8)*Oaa\"$V<w:5\f?d%#K#s";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "C,u%0L;I><R*";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "T!rd$L+d%,Fau?7Q dd,V*{e+C\"s";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "F.b+t";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "F.b+t";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    str = "O&{/1[?s";
                    obj = 21;
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    strArr2 = strArr3;
                    str = "O&{/1[?s";
                    obj = 22;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "C,u%0L;I$$O*";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "P.a\u0015&M!b+&V\u0010\u007f.";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "V6f/";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "P.a\u0015&M!b+&V\u0010\u007f.";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "P.a\u0015&M!b+&V\u0010\u007f.w";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "F.b+v";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "R*d,*P\";9<L,;'$L.q/7\r(s>hM=;)7G.b/hC,u%0L;6,$K#s.eV 6+!Fow)&M:x>";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "R*d,*P\";9<L,;'$L.q/7\r(s>hM=;)7G.b/hC,u%0L;6$0N#6 ,F";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "A {d$L+d%,Fau%+V.u>6";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "A {d2J.b9$R?";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    str = "A.z& P\u0010\u007f9\u001aQ6x)$F.f> P";
                    obj = 33;
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    strArr2 = strArr3;
                    str = "}&rjx\u001do";
                    obj = 34;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "C,u%0L;I9<L,9: P)y8(Q6x)\u007f\u0002;o: \u001f";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "q*d< P\u000fed2J.b9$R?8$ V";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "C,u%0L;I><R*";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "C,u%0L;I9<L,9+!F\u0010u%+V.u>j@.b)-}<\u007f0 \u0018";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "}&r";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "Q6x)t";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "C,u%0L;I9<L,9: P)y8(q6x)";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "V=c/";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "C,u%0L;I9<L,9: P)y8(Q6x)jC,u%0L;9$0N#";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "C,u%0L;I$$O*";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "C,u%0L;I><R*";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "}&rjx\u001do";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "C,u%0L;I$$O*";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u000236>,O*695G!bp";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "A {d$L+d%,Fau%+V.u>6";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "C,u%0L;I9<L,9+!F&x-\u001aA x>$A;9";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "C,u%0L;I9<L,9+!F&x-\u001aA x>$A;9#+F*np";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u000236";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "A {d$L+d%,Fau%+V.u>6";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u000236";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "C,u%0L;I9<L,9+!F&x-\u001aA x>$A;,j";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u000236";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "A {d$L+d%,Fau%+V.u>6";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "C,u%0L;I9<L,9+!F\u0010u%+V.u>\u007f\u0002";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "V=c/";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static Uri a() {
        return Data.CONTENT_URI.buildUpon().appendQueryParameter(z[0], z[1]).build();
    }

    private static void a(Context context, ArrayList arrayList, Account account, String str, String str2, Long l, int i) {
        try {
            arrayList.add(ContentProviderOperation.newInsert(RawContacts.CONTENT_URI).withValue(z[24], account.name).withValue(z[18], account.type).withValue(z[14], str2).build());
            arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference(z[25], i).withValue(z[22], z[19]).withValue(z[21], str).build());
            arrayList.add(ContentProviderOperation.newInsert(a()).withValueBackReference(z[27], i).withValue(z[23], z[17]).withValue(z[20], str2).withValue(z[16], context.getString(R.string.account_sync_summary_column)).withValue(z[29], "+" + str2.substring(0, str2.indexOf("@"))).build());
            try {
                if (VERSION.SDK_INT >= 14 && l != null) {
                    arrayList.add(ContentProviderOperation.newUpdate(AggregationExceptions.CONTENT_URI).withValue(z[15], l).withValueBackReference(z[28], i).withValue(z[26], Integer.valueOf(1)).build());
                }
            }
        } catch (SecurityException e) {
            throw e;
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    public static synchronized void a(Context context, m8 m8Var) {
        synchronized (PerformSyncManager.class) {
            App.a0.c(true);
            a(context, d(context), m8Var.N, m8Var.e);
            App.a0.c(false);
        }
    }

    private static Account a(Context context, AccountManager accountManager) {
        try {
            if (App.af() == null) {
                Log.e(z[31]);
                return null;
            }
            Account account = new Account(context.getString(R.string.app_name), z[33]);
            try {
                if (accountManager.addAccountExplicitly(account, null, null)) {
                    ContentResolver.setIsSyncable(account, z[32], 1);
                    if (a == 0) {
                        return account;
                    }
                }
                Log.e(z[30]);
                return null;
            } catch (SecurityException e) {
                throw e;
            } catch (SecurityException e2) {
                throw e2;
            }
        } catch (SecurityException e22) {
            throw e22;
        }
    }

    static void e(Context context) {
        b(context);
    }

    public static void a(Context context) {
        br.a(new a(context));
    }

    public void onReceive(Context context, Intent intent) {
        a(context);
    }

    public static synchronized void c(Context context) {
        synchronized (PerformSyncManager.class) {
            try {
                int i = a;
                Uri build = RawContacts.CONTENT_URI.buildUpon().appendQueryParameter(z[4], context.getString(R.string.app_name)).appendQueryParameter(z[5], z[8]).appendQueryParameter(z[6], z[7]).build();
                App.e.delete(build, z[3], new String[]{context.getString(R.string.app_name), z[2]});
                if (DialogToastActivity.i) {
                    a = i + 1;
                }
            } catch (SecurityException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
    }

    private static void a(Context context, Account account, ArrayList arrayList) {
        ok okVar;
        int i = a;
        ArrayList arrayList2 = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            m8 m8Var = (m8) it.next();
            if (arrayList2.size() + 4 >= 500) {
                try {
                    App.e.applyBatch(z[50], arrayList2);
                    arrayList2.clear();
                    if (i2 > 0) {
                        stringBuilder.delete(0, stringBuilder.length());
                    } else {
                        stringBuilder.delete(0, stringBuilder.length());
                    }
                } catch (Exception e) {
                    Log.e(z[52] + i2 + "/" + e.toString());
                }
            }
            try {
                if (m8Var.e.indexOf("@") <= 0) {
                    arrayList3.add(m8Var);
                    if (i == 0) {
                        continue;
                    }
                }
                int size = arrayList2.size();
                stringBuilder.append(m8Var).append(z[53]);
                a(context, arrayList2, account, m8Var.N, m8Var.e, Long.valueOf(m8Var.e()), size);
                int i3 = i2 + 1;
                if (i == 0) {
                    i2 = i3;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        try {
            break;
            if (!arrayList2.isEmpty()) {
                App.e.applyBatch(z[54], arrayList2);
                arrayList2.clear();
            }
            stringBuilder.delete(0, stringBuilder.length());
            App.P.a(arrayList3);
        } catch (Exception e22) {
            throw e22;
        } catch (Exception e222) {
            try {
                ok okVar2 = z[51] + e222.toString();
                Log.e(okVar2);
                okVar = okVar2;
            } finally {
                okVar.a(arrayList3);
            }
        }
    }

    private static synchronized void b(Context context) {
        synchronized (PerformSyncManager.class) {
            try {
                if (!i.a()) {
                    Log.w(z[13]);
                }
                try {
                    a(context, d(context));
                } catch (Throwable e) {
                    Log.c(e);
                }
                if (!i.b()) {
                    Log.w(z[12]);
                }
            } catch (SecurityException e2) {
                throw e2;
            } catch (SecurityException e22) {
                throw e22;
            } catch (Throwable th) {
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.accounts.Account d(android.content.Context r5) {
        /*
        r0 = 0;
        r2 = android.accounts.AccountManager.get(r5);
        r1 = z;
        r3 = 10;
        r1 = r1[r3];
        r1 = r2.getAccountsByType(r1);
        r3 = r1.length;
        if (r3 != 0) goto L_0x0019;
    L_0x0012:
        r1 = a(r5, r2);
        if (r1 != 0) goto L_0x0034;
    L_0x0018:
        return r0;
    L_0x0019:
        r3 = 0;
        r1 = r1[r3];
        r3 = 2131624007; // 0x7f0e0047 float:1.8875182E38 double:1.0531621917E-314;
        r3 = r5.getString(r3);
        r4 = r1.name;
        r3 = android.text.TextUtils.equals(r3, r4);
        if (r3 != 0) goto L_0x0034;
    L_0x002b:
        r2.removeAccount(r1, r0, r0);
        r1 = a(r5, r2);
        if (r1 == 0) goto L_0x0018;
    L_0x0034:
        r0 = r1;
        r1 = z;	 Catch:{ SecurityException -> 0x004c }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x004c }
        r1 = android.content.ContentResolver.getSyncAutomatically(r0, r1);	 Catch:{ SecurityException -> 0x004c }
        if (r1 != 0) goto L_0x0018;
    L_0x0041:
        r1 = z;	 Catch:{ SecurityException -> 0x004c }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x004c }
        r2 = 1;
        android.content.ContentResolver.setSyncAutomatically(r0, r1, r2);	 Catch:{ SecurityException -> 0x004c }
        goto L_0x0018;
    L_0x004c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.PerformSyncManager.d(android.content.Context):android.accounts.Account");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void a(android.content.Context r22, android.accounts.Account r23) {
        /*
        r8 = com.whatsapp.accountsync.PerformSyncManager.class;
        monitor-enter(r8);
        r9 = a;	 Catch:{ all -> 0x0014 }
        if (r23 != 0) goto L_0x0017;
    L_0x0007:
        r2 = z;	 Catch:{ Exception -> 0x0012 }
        r3 = 44;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0012 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ Exception -> 0x0012 }
    L_0x0010:
        monitor-exit(r8);
        return;
    L_0x0012:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0014 }
    L_0x0014:
        r2 = move-exception;
        monitor-exit(r8);
        throw r2;
    L_0x0017:
        r10 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0014 }
        r2 = com.whatsapp.App.a0;	 Catch:{ all -> 0x0014 }
        r3 = 1;
        r2.c(r3);	 Catch:{ all -> 0x0014 }
        r2 = com.whatsapp.App.P;	 Catch:{ all -> 0x0014 }
        r12 = r2.i();	 Catch:{ all -> 0x0014 }
        if (r12 == 0) goto L_0x002f;
    L_0x0029:
        r2 = r12.size();	 Catch:{ Exception -> 0x0038 }
        if (r2 != 0) goto L_0x003a;
    L_0x002f:
        r2 = com.whatsapp.App.a0;	 Catch:{ Exception -> 0x0036 }
        r3 = 0;
        r2.c(r3);	 Catch:{ Exception -> 0x0036 }
        goto L_0x0010;
    L_0x0036:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0014 }
    L_0x0038:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0036 }
    L_0x003a:
        r2 = com.whatsapp.App.aa;	 Catch:{ Exception -> 0x023b }
        r3 = 1;
        if (r2 < r3) goto L_0x0041;
    L_0x003f:
        if (r9 == 0) goto L_0x005f;
    L_0x0041:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x023d }
        r2.<init>();	 Catch:{ Exception -> 0x023d }
        r3 = z;	 Catch:{ Exception -> 0x023d }
        r4 = 36;
        r3 = r3[r4];	 Catch:{ Exception -> 0x023d }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x023d }
        r0 = r23;
        r3 = r0.type;	 Catch:{ Exception -> 0x023d }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x023d }
        r2 = r2.toString();	 Catch:{ Exception -> 0x023d }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x023d }
    L_0x005f:
        r2 = android.provider.ContactsContract.RawContacts.CONTENT_URI;	 Catch:{ all -> 0x0014 }
        r2 = r2.buildUpon();	 Catch:{ all -> 0x0014 }
        r3 = z;	 Catch:{ all -> 0x0014 }
        r4 = 48;
        r3 = r3[r4];	 Catch:{ all -> 0x0014 }
        r0 = r23;
        r4 = r0.name;	 Catch:{ all -> 0x0014 }
        r2 = r2.appendQueryParameter(r3, r4);	 Catch:{ all -> 0x0014 }
        r3 = z;	 Catch:{ all -> 0x0014 }
        r4 = 46;
        r3 = r3[r4];	 Catch:{ all -> 0x0014 }
        r0 = r23;
        r4 = r0.type;	 Catch:{ all -> 0x0014 }
        r2 = r2.appendQueryParameter(r3, r4);	 Catch:{ all -> 0x0014 }
        r3 = r2.build();	 Catch:{ all -> 0x0014 }
        r2 = android.provider.ContactsContract.RawContacts.CONTENT_URI;	 Catch:{ all -> 0x0014 }
        r2 = r2.buildUpon();	 Catch:{ all -> 0x0014 }
        r4 = z;	 Catch:{ all -> 0x0014 }
        r5 = 45;
        r4 = r4[r5];	 Catch:{ all -> 0x0014 }
        r0 = r23;
        r5 = r0.name;	 Catch:{ all -> 0x0014 }
        r2 = r2.appendQueryParameter(r4, r5);	 Catch:{ all -> 0x0014 }
        r4 = z;	 Catch:{ all -> 0x0014 }
        r5 = 38;
        r4 = r4[r5];	 Catch:{ all -> 0x0014 }
        r0 = r23;
        r5 = r0.type;	 Catch:{ all -> 0x0014 }
        r2 = r2.appendQueryParameter(r4, r5);	 Catch:{ all -> 0x0014 }
        r4 = z;	 Catch:{ all -> 0x0014 }
        r5 = 34;
        r4 = r4[r5];	 Catch:{ all -> 0x0014 }
        r5 = z;	 Catch:{ all -> 0x0014 }
        r6 = 43;
        r5 = r5[r6];	 Catch:{ all -> 0x0014 }
        r2 = r2.appendQueryParameter(r4, r5);	 Catch:{ all -> 0x0014 }
        r13 = r2.build();	 Catch:{ all -> 0x0014 }
        r14 = new java.util.HashMap;	 Catch:{ all -> 0x0014 }
        r14.<init>();	 Catch:{ all -> 0x0014 }
        r2 = com.whatsapp.App.e;	 Catch:{ all -> 0x0014 }
        r4 = 2;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x0014 }
        r5 = 0;
        r6 = z;	 Catch:{ all -> 0x0014 }
        r7 = 40;
        r6 = r6[r7];	 Catch:{ all -> 0x0014 }
        r4[r5] = r6;	 Catch:{ all -> 0x0014 }
        r5 = 1;
        r6 = z;	 Catch:{ all -> 0x0014 }
        r7 = 41;
        r6 = r6[r7];	 Catch:{ all -> 0x0014 }
        r4[r5] = r6;	 Catch:{ all -> 0x0014 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r3 = r2.query(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0014 }
        if (r3 == 0) goto L_0x010d;
    L_0x00e0:
        r2 = r3.moveToNext();	 Catch:{ Exception -> 0x023f }
        if (r2 == 0) goto L_0x010a;
    L_0x00e6:
        r2 = 0;
        r4 = r3.getLong(r2);	 Catch:{ all -> 0x0014 }
        r2 = 1;
        r6 = r3.getString(r2);	 Catch:{ all -> 0x0014 }
        r7 = new com.whatsapp.accountsync.g;	 Catch:{ all -> 0x0014 }
        r7.<init>(r4, r6);	 Catch:{ all -> 0x0014 }
        r2 = r14.get(r6);	 Catch:{ all -> 0x0014 }
        r2 = (java.util.ArrayList) r2;	 Catch:{ all -> 0x0014 }
        if (r2 != 0) goto L_0x0105;
    L_0x00fd:
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0014 }
        r2.<init>();	 Catch:{ all -> 0x0014 }
        r14.put(r6, r2);	 Catch:{ all -> 0x0014 }
    L_0x0105:
        r2.add(r7);	 Catch:{ all -> 0x0014 }
        if (r9 == 0) goto L_0x00e0;
    L_0x010a:
        r3.close();	 Catch:{ all -> 0x0014 }
    L_0x010d:
        r2 = r14.values();	 Catch:{ all -> 0x0014 }
        r5 = r2.iterator();	 Catch:{ all -> 0x0014 }
    L_0x0115:
        r2 = r5.hasNext();	 Catch:{ all -> 0x0014 }
        if (r2 == 0) goto L_0x015b;
    L_0x011b:
        r2 = r5.next();	 Catch:{ all -> 0x0014 }
        r2 = (java.util.ArrayList) r2;	 Catch:{ all -> 0x0014 }
        r6 = r2.size();	 Catch:{ all -> 0x0014 }
        r3 = 1;
        if (r6 <= r3) goto L_0x0159;
    L_0x0128:
        r3 = 0;
        r4 = r3;
    L_0x012a:
        r3 = r6 + -1;
        if (r4 >= r3) goto L_0x0159;
    L_0x012e:
        r3 = r2.get(r4);	 Catch:{ all -> 0x0014 }
        r3 = (com.whatsapp.accountsync.g) r3;	 Catch:{ all -> 0x0014 }
        r7 = com.whatsapp.App.e;	 Catch:{ all -> 0x0014 }
        r15 = z;	 Catch:{ all -> 0x0014 }
        r16 = 47;
        r15 = r15[r16];	 Catch:{ all -> 0x0014 }
        r16 = 1;
        r0 = r16;
        r0 = new java.lang.String[r0];	 Catch:{ all -> 0x0014 }
        r16 = r0;
        r17 = 0;
        r0 = r3.a;	 Catch:{ all -> 0x0014 }
        r18 = r0;
        r3 = java.lang.String.valueOf(r18);	 Catch:{ all -> 0x0014 }
        r16[r17] = r3;	 Catch:{ all -> 0x0014 }
        r0 = r16;
        r7.delete(r13, r15, r0);	 Catch:{ all -> 0x0014 }
        r3 = r4 + 1;
        if (r9 == 0) goto L_0x026e;
    L_0x0159:
        if (r9 == 0) goto L_0x0115;
    L_0x015b:
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0014 }
        r4.<init>();	 Catch:{ all -> 0x0014 }
        r5 = new com.whatsapp.g9;	 Catch:{ all -> 0x0014 }
        r2 = 0;
        r6 = 0;
        r5.<init>(r2, r6);	 Catch:{ all -> 0x0014 }
        r6 = r12.iterator();	 Catch:{ Exception -> 0x0243 }
    L_0x016c:
        r2 = r6.hasNext();	 Catch:{ Exception -> 0x0243 }
        if (r2 == 0) goto L_0x01f2;
    L_0x0172:
        r2 = r6.next();	 Catch:{ Exception -> 0x0243 }
        r2 = (com.whatsapp.m8) r2;	 Catch:{ Exception -> 0x0243 }
        r3 = r2.h;	 Catch:{ Exception -> 0x0241 }
        if (r3 != 0) goto L_0x017e;
    L_0x017c:
        if (r9 == 0) goto L_0x016c;
    L_0x017e:
        r3 = r2.q;	 Catch:{ Exception -> 0x0257 }
        if (r3 == 0) goto L_0x01f0;
    L_0x0182:
        r3 = r2.w();	 Catch:{ Exception -> 0x0257 }
        if (r3 != 0) goto L_0x01f0;
    L_0x0188:
        r3 = r2.l();	 Catch:{ Exception -> 0x0259 }
        if (r3 != 0) goto L_0x01f0;
    L_0x018e:
        r3 = r2.e;	 Catch:{ Exception -> 0x025b }
        r7 = z;	 Catch:{ Exception -> 0x025b }
        r15 = 37;
        r7 = r7[r15];	 Catch:{ Exception -> 0x025b }
        r3 = r3.equals(r7);	 Catch:{ Exception -> 0x025b }
        if (r3 != 0) goto L_0x01f0;
    L_0x019c:
        r3 = r2.h;	 Catch:{ Exception -> 0x025d }
        r3 = r3.equals(r5);	 Catch:{ Exception -> 0x025d }
        if (r3 == 0) goto L_0x01e5;
    L_0x01a4:
        r3 = r2.e;	 Catch:{ Exception -> 0x0243 }
        r3 = r14.get(r3);	 Catch:{ Exception -> 0x0243 }
        r3 = (java.util.ArrayList) r3;	 Catch:{ Exception -> 0x0243 }
        if (r3 == 0) goto L_0x01e3;
    L_0x01ae:
        r7 = r3.iterator();	 Catch:{ Exception -> 0x0243 }
    L_0x01b2:
        r3 = r7.hasNext();	 Catch:{ Exception -> 0x0243 }
        if (r3 == 0) goto L_0x01e3;
    L_0x01b8:
        r3 = r7.next();	 Catch:{ Exception -> 0x0243 }
        r3 = (com.whatsapp.accountsync.g) r3;	 Catch:{ Exception -> 0x0243 }
        r15 = com.whatsapp.App.e;	 Catch:{ Exception -> 0x0243 }
        r16 = z;	 Catch:{ Exception -> 0x0243 }
        r17 = 35;
        r16 = r16[r17];	 Catch:{ Exception -> 0x0243 }
        r17 = 1;
        r0 = r17;
        r0 = new java.lang.String[r0];	 Catch:{ Exception -> 0x0243 }
        r17 = r0;
        r18 = 0;
        r0 = r3.a;	 Catch:{ Exception -> 0x0243 }
        r20 = r0;
        r3 = java.lang.String.valueOf(r20);	 Catch:{ Exception -> 0x0243 }
        r17[r18] = r3;	 Catch:{ Exception -> 0x0243 }
        r0 = r16;
        r1 = r17;
        r15.delete(r13, r0, r1);	 Catch:{ Exception -> 0x0243 }
        if (r9 == 0) goto L_0x01b2;
    L_0x01e3:
        if (r9 == 0) goto L_0x01f0;
    L_0x01e5:
        r3 = r2.e;	 Catch:{ Exception -> 0x026a }
        r3 = r14.containsKey(r3);	 Catch:{ Exception -> 0x026a }
        if (r3 != 0) goto L_0x01f0;
    L_0x01ed:
        r4.add(r2);	 Catch:{ Exception -> 0x026c }
    L_0x01f0:
        if (r9 == 0) goto L_0x016c;
    L_0x01f2:
        r0 = r22;
        r1 = r23;
        a(r0, r1, r4);	 Catch:{ Exception -> 0x0243 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0243 }
        r2.<init>();	 Catch:{ Exception -> 0x0243 }
        r3 = z;	 Catch:{ Exception -> 0x0243 }
        r5 = 39;
        r3 = r3[r5];	 Catch:{ Exception -> 0x0243 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0243 }
        r3 = r4.size();	 Catch:{ Exception -> 0x0243 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0243 }
        r3 = z;	 Catch:{ Exception -> 0x0243 }
        r5 = 49;
        r3 = r3[r5];	 Catch:{ Exception -> 0x0243 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0243 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0243 }
        r6 = r6 - r10;
        r2 = r2.append(r6);	 Catch:{ Exception -> 0x0243 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0243 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0243 }
        r14.clear();	 Catch:{ all -> 0x0014 }
        r12.clear();	 Catch:{ all -> 0x0014 }
        r4.clear();	 Catch:{ all -> 0x0014 }
    L_0x0233:
        r2 = com.whatsapp.App.a0;	 Catch:{ all -> 0x0014 }
        r3 = 0;
        r2.c(r3);	 Catch:{ all -> 0x0014 }
        goto L_0x0010;
    L_0x023b:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x023d }
    L_0x023d:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0014 }
    L_0x023f:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0014 }
    L_0x0241:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0243 }
    L_0x0243:
        r2 = move-exception;
        r3 = z;	 Catch:{ all -> 0x025f }
        r5 = 42;
        r3 = r3[r5];	 Catch:{ all -> 0x025f }
        com.whatsapp.util.Log.b(r3, r2);	 Catch:{ all -> 0x025f }
        r14.clear();	 Catch:{ all -> 0x0014 }
        r12.clear();	 Catch:{ all -> 0x0014 }
        r4.clear();	 Catch:{ all -> 0x0014 }
        goto L_0x0233;
    L_0x0257:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0259 }
    L_0x0259:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x025b }
    L_0x025b:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x025d }
    L_0x025d:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0243 }
    L_0x025f:
        r2 = move-exception;
        r14.clear();	 Catch:{ all -> 0x0014 }
        r12.clear();	 Catch:{ all -> 0x0014 }
        r4.clear();	 Catch:{ all -> 0x0014 }
        throw r2;	 Catch:{ all -> 0x0014 }
    L_0x026a:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x026c }
    L_0x026c:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0243 }
    L_0x026e:
        r4 = r3;
        goto L_0x012a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.PerformSyncManager.a(android.content.Context, android.accounts.Account):void");
    }

    private static void a(Context context, Account account, String str, String str2) {
        Log.i(z[59] + str + z[55] + str2);
        ArrayList arrayList = new ArrayList();
        a(context, arrayList, account, str, str2, null, 0);
        try {
            App.e.applyBatch(z[58], arrayList);
        } catch (Exception e) {
            Log.e(z[56] + str + z[57] + str2 + e.toString());
        }
    }
}
