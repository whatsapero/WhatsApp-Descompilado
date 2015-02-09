package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class AccountInfoActivity extends DialogToastActivity {
    private static final String[] A;
    private String j;
    private RadioButton k;
    private OnClickListener l;
    private Handler m;
    private OnClickListener n;
    private OnClickListener o;
    private OnClickListener p;
    private RadioButton q;
    private OnClickListener r;
    private RadioButton s;
    private boolean t;
    private Runnable u;
    private xg v;
    private boolean w;
    private a3a x;
    private final fk y;
    private OnClickListener z;

    static {
        String[] strArr = new String[55];
        String str = "\tD#yp[\u001fx~t\u0016\u001e ab\u0015C6ysOS8d,\u0011Q.df\u000fD$&b\u000fT%fj\u0005\u001e'as";
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
                        i3 = 97;
                        break;
                    case ay.f /*1*/:
                        i3 = 48;
                        break;
                    case ay.n /*2*/:
                        i3 = 87;
                        break;
                    case ay.p /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 3;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0000^3{l\bTy`m\u0015U9}-\u0000S#`l\u000f\u001e\u0001@F6";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0000S4fv\u000fDz`m\u0007_x{f\u0012E:l#";
                    obj = 2;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "!Cy~k\u0000D$hs\u0011\u001e9lw";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0000S4fv\u000fDz`m\u0007_xzw\u0000B#)";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0000S4fv\u000fDz`m\u0007_xmf\u0012D%fz";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "G\\44";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0000R4";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    str = "GS<zv\f\r";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = "GC<|>";
                    obj = 9;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "^@?fm\u0004\r";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "GV%fn\\";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "G\\04";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0000S4fv\u000fDz`m\u0007_xmj\u0000\\8n#\u0012U%\u007fj\u0002Uzl{\u0015U9zj\u000e^zej\u0007U#`n\u0004";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0000S4fv\u000fDz`m\u0007_xmj\u0000\\8n#\u0012U%\u007fj\u0002Uzl{\u0015U9zj\u000e^zl{\u0011Y%lg";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0000S4fv\u000fDz`m\u0007_xmj\u0000\\8n#\u0012U%\u007fj\u0002Uzl{\u0015U9zj\u000e^z{l\r\\5h`\n";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0000S4fv\u000fDz`m\u0007_xmj\u0000\\8n#\u0012U%\u007fj\u0002Uzl{\u0015U9zj\u000e^zyb\u0018]2gw";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0000S4fv\u000fDz`m\u0007_xmj\u0000\\8n#\u0012U%\u007fj\u0002Uzl{\u0015U9zj\u000e^zh`\u0015Y!l";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\rY$}>DCqyv\u0013S?hp\u0004Bj,pGC2ee\\\u0015$";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0000S4fv\u000fDz`m\u0007_xmb\u0015Qw";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0007Q;zf";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0015B\"l";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0000^3{l\bTy`m\u0015U9}-\u0004H#{bOd\u0012QW";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0000^3{l\bTy`m\u0015U9}-\u0000S#`l\u000f\u001e\u0004LM%";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "!Cy~k\u0000D$hs\u0011\u001e9lw";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0015U/},\u0011\\6`m";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0000^3{l\bTy`m\u0015U9}-\u0004H#{bOc\u0002KI$s\u0003";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\tD#yp[\u001fx~t\u0016\u001e ab\u0015C6ysOS8d,\u0011Q.df\u000fD$&`\nC\"d\\\u0011Q.'s\t@";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0000S4fv\u000fDz`m\u0007_xkj\r\\>gdN]6{h\u0004Dxyv\u0013S?hp\u0004\u0010$bvA";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "!Cy~k\u0000D$hs\u0011\u001e9lw";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "AT6}b\\";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0002_9}b\u0002D";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0000S4fv\u000fDz`m\u0007_xh`\u0015Y!`w\u0018\u001d%lp\u0014\\#&f\u0019S2yw\b_9";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0000S4fv\u000fDz`m\u0007_xh`\u0015Y!`w\u0018\u001d%lp\u0014\\#)q\u0004A\"lp\u0015\r";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "AB2zv\rDj";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "!Cy~k\u0000D$hs\u0011\u001e9lw";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "!Cy~k\u0000D$hs\u0011\u001e9lw";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0000^3{l\bTy`m\u0015U9}-\u0000S#`l\u000f\u001e\u0001@F6";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\tD#yp[\u001fx~t\u0016\u001e ab\u0015C6ysOS8d,\u0011Q.df\u000fD$&d\u000e_0efO@?y";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0000S4fv\u000fDz`m\u0007_xkj\r\\>gdNG2kp\bD2&s\u0014B4ab\u0012Uw|q\r\u0010";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0004H'`q\u0000D>fm>T6}f";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u0000S4fv\u000fDz`m\u0007_xzw\u000e@w";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u0000S4fv\u000fDz`m\u0007_xyb\u0014C2)";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0002_9}b\u0002D";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0000S4fv\u000fDz`m\u0007_xfmLS%lb\u0015Uxyf\u0013V8{nLS;``\n";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "!Cy~k\u0000D$hs\u0011\u001e9lw";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u000bY3";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    str = "\u0000S4fv\u000fDz`m\u0007_xjq\u0004Q#l,\u000bY3)j\u000fS8{q\u0004S#)e\u000eB:hwA";
                    obj = 47;
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    strArr2 = strArr3;
                    str = "\u0000S4fv\u000fDz`m\u0007_xjq\u0004Q#l#\u0003E9mo\u0004\r";
                    obj = 48;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "!Cy~k\u0000D$hs\u0011\u001e9lw";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u0003E.";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "AY9}f\u000fDj";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0000S4fv\u000fDz`m\u0007_xjq\u0004Q#l,\u0013U4fm\u000fU4},\u000eF2{q\bT2$f\u0019@>{f\u0005";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0002_9}b\u0002D";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    A = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0000S4fv\u000fDz`m\u0007_xkj\r\\>gdNG2kp\bD2&s\u0014B4ab\u0012Uw|q\r\u0010";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static RadioButton b(AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.q;
    }

    static OnClickListener k(AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.n;
    }

    private String h() {
        int i;
        long a = ac.a() - System.currentTimeMillis();
        long j = a % 31536000000L;
        int i2 = (int) (((double) a) / 3.1536E10d);
        if (i2 == 0) {
            j = 0;
            i = 1;
        } else {
            i = i2;
        }
        return String.format(App.aX.a(j < 86400000 ? R.plurals.account_info_inform_have_n_years : R.plurals.account_info_inform_have_more_than_n_years, i), new Object[]{Integer.valueOf(i)}) + " " + getString(R.string.account_info_confirm_continue_with_purchase);
    }

    static Handler h(AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.m;
    }

    public AccountInfoActivity() {
        this.t = false;
        this.y = new fk();
        this.x = new a3p(this);
        this.v = new as8(this);
        this.o = new a8n(this);
        this.p = new ja(this);
        this.l = new asq(this);
        this.n = new amq(this);
        this.r = new all(this);
        this.z = new ij(this);
        this.m = new c5(this);
    }

    private void a(String str) {
        boolean z = false;
        findViewById(R.id.choose_friend_panel).setVisibility(8);
        findViewById(R.id.user_details_panel).setVisibility(0);
        m8 a = App.P.a(str + A[4]);
        if (a != null) {
            z = true;
        }
        Log.b(z);
        ((TextView) findViewById(R.id.account_info_row1_value)).setText(a.a((Context) this));
        ((TextView) findViewById(R.id.account_info_row2_value)).setText(m3.a(str));
        this.y.b(a, (ImageView) findViewById(R.id.friend_photo));
    }

    protected void onPause() {
        super.onPause();
        Log.i(A[43] + getIntent());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m() {
        /*
        r8_this = this;
        r1 = 1;
        r2 = 0;
        r3 = r8.j();
        r0 = 2131623963; // 0x7f0e001b float:1.8875092E38 double:1.05316217E-314;
        r4 = r8.getString(r0);
        r0 = r8.w;
        if (r0 == 0) goto L_0x0049;
    L_0x0011:
        r0 = com.whatsapp.App.P;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = r8.j;
        r5 = r5.append(r6);
        r6 = A;
        r7 = 25;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.toString();
        r5 = r0.a(r5);
        if (r5 == 0) goto L_0x00a5;
    L_0x0032:
        r0 = r1;
    L_0x0033:
        com.whatsapp.util.Log.b(r0);
        r0 = 2131624646; // 0x7f0e02c6 float:1.8876478E38 double:1.0531625074E-314;
        r1 = new java.lang.Object[r1];
        r5 = r5.a(r8);
        r1[r2] = r5;
        r0 = r8.getString(r0, r1);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0050;
    L_0x0049:
        r0 = 2131623962; // 0x7f0e001a float:1.887509E38 double:1.0531621695E-314;
        r0 = r8.getString(r0);
    L_0x0050:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = " ";
        r0 = r0.append(r1);
        r1 = A;
        r5 = 28;
        r1 = r1[r5];
        r1 = r8.a(r1, r3, r2);
        r0 = r0.append(r1);
        r0 = r0.toString();
        r1 = new android.content.Intent;
        r2 = A;
        r3 = 24;
        r2 = r2[r3];
        r1.<init>(r2);
        r2 = A;
        r3 = 26;
        r2 = r2[r3];
        r1 = r1.setType(r2);
        r2 = A;
        r3 = 27;
        r2 = r2[r3];
        r1 = r1.putExtra(r2, r4);
        r2 = A;
        r3 = 23;
        r2 = r2[r3];
        r0 = r1.putExtra(r2, r0);
        r1 = 2131624822; // 0x7f0e0376 float:1.8876835E38 double:1.0531625944E-314;
        r1 = r8.getString(r1);
        com.whatsapp.or.a(r0, r8, r8, r1);
        return;
    L_0x00a5:
        r0 = r2;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AccountInfoActivity.m():void");
    }

    private boolean k() {
        long a = ac.a();
        if (a != 0) {
            try {
                if (a - System.currentTimeMillis() >= 31104000000L) {
                    return false;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return true;
    }

    static void f(AccountInfoActivity accountInfoActivity) {
        accountInfoActivity.i();
    }

    static void a(AccountInfoActivity accountInfoActivity, String str, Runnable runnable) {
        accountInfoActivity.a(str, runnable);
    }

    private Dialog a(int i, Runnable runnable) {
        return new Builder(this).setMessage(h()).setPositiveButton(R.string.purchase, new av9(this, i, runnable)).setNegativeButton(R.string.cancel, new yq(this, i)).create();
    }

    static String l(AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.j;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            if (!this.w) {
                menu.add(0, 1, 0, (int) R.string.pay_for_a_friend).setIcon((int) R.drawable.ic_menu_pay);
            }
            return super.onCreateOptionsMenu(menu);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case ay.f /*1*/:
                Intent intent = new Intent(this, AccountInfoActivity.class);
                intent.putExtra(A[44], true);
                startActivity(intent);
                return true;
            case 16908332:
                finish();
                return true;
            default:
                return false;
        }
    }

    static boolean g(AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.f();
    }

    static boolean i(AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.k();
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(A[6]);
        this.m.removeMessages(0);
        this.m.removeMessages(8);
        this.y.a();
    }

    protected void onStart() {
        try {
            super.onStart();
            Log.i(A[5] + getIntent());
            ac.a(this.x);
            App.k.b(this.v);
            if (App.an.jabber_id.equals(this.j)) {
                b();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static boolean p(AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.b();
    }

    static RadioButton n(AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.k;
    }

    private boolean f() {
        try {
            if (this.j == null) {
                f(getString(R.string.pay_for_a_friend_choose_contact_first, new Object[]{getString(R.string.pay_for_a_friend_choose_contact)}));
            }
            try {
                return this.j == null;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private String j() {
        try {
            if (this.k.isChecked()) {
                return "5";
            }
            try {
                return this.s.isChecked() ? "3" : "1";
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void i() {
        MessageService.a((Context) this, true, true);
        String a = a(A[0], j(), this.w);
        Log.i(A[1] + a);
        Intent intent = new Intent(A[2]);
        intent.setData(Uri.parse(a));
        startActivity(intent);
    }

    private boolean b() {
        return a(ac.b(A[41]));
    }

    protected void onResume() {
        super.onResume();
        Log.i(A[3] + getIntent());
    }

    private void l() {
        findViewById(R.id.choose_friend_panel).setVisibility(0);
        findViewById(R.id.user_details_panel).setVisibility(8);
        this.j = null;
    }

    private boolean a(long j) {
        CharSequence string;
        TextView textView = (TextView) findViewById(R.id.account_info_row2_value);
        textView.setTextColor(getResources().getColor(R.color.section_text));
        boolean z = false;
        if (j == 0) {
            string = getString(R.string.account_info_status_unknown);
        } else if (j >= 4444444444000L) {
            string = getString(R.string.lifetime);
            z = true;
        } else if (j - System.currentTimeMillis() < 0) {
            textView.setTextColor(getResources().getColor(R.color.red));
            string = getString(R.string.account_info_status_expired);
        } else {
            string = SimpleDateFormat.getDateInstance().format(new Date(j));
        }
        textView.setText(string);
        return z;
    }

    static void b(AccountInfoActivity accountInfoActivity, String str) {
        accountInfoActivity.a(str);
    }

    static Runnable e(AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.u;
    }

    private void g() {
        MessageService.a((Context) this, true, true);
        String a = a(A[39], j(), this.w);
        Log.i(A[40] + a);
        Intent intent = new Intent(A[38]);
        intent.setData(Uri.parse(a));
        startActivity(intent);
    }

    private void a(String str, Runnable runnable) {
        b(R.string.account_info_check_eligibility);
        this.m.sendEmptyMessageDelayed(10, 32000);
        String[] strArr = new String[1];
        try {
            strArr[0] = str + A[30];
            if (!App.c(strArr)) {
                this.m.removeMessages(10);
                c();
                f(getString(R.string.register_check_connectivity, new Object[]{getString(R.string.connectivity_self_help_instructions)}));
                this.u = null;
                try {
                    if (App.az == 0) {
                        return;
                    }
                }
            }
            this.u = runnable;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static boolean m(AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.w;
    }

    static void a(AccountInfoActivity accountInfoActivity) {
        accountInfoActivity.l();
    }

    static RadioButton o(AccountInfoActivity accountInfoActivity) {
        return accountInfoActivity.s;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r12) {
        /*
        r11_this = this;
        r10 = 3;
        r9 = 8;
        r6 = 1;
        r3 = 0;
        r4 = com.whatsapp.App.az;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = A;
        r2 = 49;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r12);
        r1 = A;
        r2 = 52;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r11.getIntent();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r12);
        r0 = r11.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r6);
        r0 = 2130903064; // 0x7f030018 float:1.7412935E38 double:1.0528059985E-314;
        r11.setContentView(r0);
        r0 = 2131427432; // 0x7f0b0068 float:1.847648E38 double:1.053065071E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.RadioButton) r0;
        r11.q = r0;
        r0 = 2131427440; // 0x7f0b0070 float:1.8476496E38 double:1.0530650747E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.RadioButton) r0;
        r11.s = r0;
        r0 = 2131427445; // 0x7f0b0075 float:1.8476506E38 double:1.053065077E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.RadioButton) r0;
        r11.k = r0;
        r0 = r11.q;
        r0.setChecked(r6);
        r0 = new com.whatsapp.h0;
        r0.<init>(r11);
        r1 = r11.q;
        r1.setOnCheckedChangeListener(r0);
        r1 = r11.s;
        r1.setOnCheckedChangeListener(r0);
        r1 = r11.k;
        r1.setOnCheckedChangeListener(r0);
        r0 = 2131427433; // 0x7f0b0069 float:1.8476482E38 double:1.0530650712E-314;
        r0 = r11.findViewById(r0);
        r1 = 2131427437; // 0x7f0b006d float:1.847649E38 double:1.053065073E-314;
        r1 = r11.findViewById(r1);
        r2 = 2131427442; // 0x7f0b0072 float:1.84765E38 double:1.0530650757E-314;
        r2 = r11.findViewById(r2);
        r5 = new com.whatsapp.asn;
        r5.<init>(r11, r0, r1, r2);
        r0.setOnClickListener(r5);
        r1.setOnClickListener(r5);
        r2.setOnClickListener(r5);
        r0 = 2131427434; // 0x7f0b006a float:1.8476484E38 double:1.0530650717E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = com.whatsapp.App.aX;
        r2 = 2131558445; // 0x7f0d002d float:1.8742206E38 double:1.0531298E-314;
        r1 = r1.a(r2, r6);
        r2 = new java.lang.Object[r6];
        r5 = java.lang.Integer.valueOf(r6);
        r2[r3] = r5;
        r1 = java.lang.String.format(r1, r2);
        r0.setText(r1);
        r0 = 2131427438; // 0x7f0b006e float:1.8476492E38 double:1.0530650737E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = com.whatsapp.App.aX;
        r2 = 2131558445; // 0x7f0d002d float:1.8742206E38 double:1.0531298E-314;
        r1 = r1.a(r2, r10);
        r2 = new java.lang.Object[r6];
        r5 = java.lang.Integer.valueOf(r10);
        r2[r3] = r5;
        r1 = java.lang.String.format(r1, r2);
        r0.setText(r1);
        r0 = 2131427443; // 0x7f0b0073 float:1.8476502E38 double:1.053065076E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = com.whatsapp.App.aX;
        r2 = 2131558445; // 0x7f0d002d float:1.8742206E38 double:1.0531298E-314;
        r5 = 5;
        r1 = r1.a(r2, r5);
        r2 = new java.lang.Object[r6];
        r5 = 5;
        r5 = java.lang.Integer.valueOf(r5);
        r2[r3] = r5;
        r1 = java.lang.String.format(r1, r2);
        r0.setText(r1);
        r0 = 2131427435; // 0x7f0b006b float:1.8476486E38 double:1.053065072E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = com.whatsapp.App.k;
        r2 = "1";
        r1 = r1.a(r2);
        r0.setText(r1);
        r0 = 2131427439; // 0x7f0b006f float:1.8476494E38 double:1.053065074E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = com.whatsapp.App.k;
        r2 = "3";
        r1 = r1.a(r2);
        r0.setText(r1);
        r0 = 2131427444; // 0x7f0b0074 float:1.8476504E38 double:1.0530650767E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = com.whatsapp.App.k;
        r2 = "5";
        r1 = r1.a(r2);
        r0.setText(r1);
        r0 = r11.getIntent();
        r1 = A;
        r2 = 47;
        r1 = r1[r2];
        r0 = r0.getStringExtra(r1);
        r1 = r11.getIntent();	 Catch:{ IllegalStateException -> 0x0349 }
        r2 = A;	 Catch:{ IllegalStateException -> 0x0349 }
        r5 = 54;
        r2 = r2[r5];	 Catch:{ IllegalStateException -> 0x0349 }
        r5 = 0;
        r1 = r1.getBooleanExtra(r2, r5);	 Catch:{ IllegalStateException -> 0x0349 }
        r11.w = r1;	 Catch:{ IllegalStateException -> 0x0349 }
        if (r0 == 0) goto L_0x01a3;
    L_0x0162:
        r1 = 1;
        r11.w = r1;	 Catch:{ IllegalStateException -> 0x034b }
        r1 = A;	 Catch:{ IllegalStateException -> 0x034b }
        r2 = 50;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x034b }
        r1 = r0.endsWith(r1);	 Catch:{ IllegalStateException -> 0x034b }
        if (r1 == 0) goto L_0x0189;
    L_0x0171:
        r1 = 0;
        r2 = r0.length();	 Catch:{ IllegalStateException -> 0x034d }
        r5 = A;	 Catch:{ IllegalStateException -> 0x034d }
        r6 = 46;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x034d }
        r5 = r5.length();	 Catch:{ IllegalStateException -> 0x034d }
        r2 = r2 - r5;
        r1 = r0.substring(r1, r2);	 Catch:{ IllegalStateException -> 0x034d }
        r11.j = r1;	 Catch:{ IllegalStateException -> 0x034d }
        if (r4 == 0) goto L_0x01a3;
    L_0x0189:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x034d }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x034d }
        r2 = A;	 Catch:{ IllegalStateException -> 0x034d }
        r5 = 48;
        r2 = r2[r5];	 Catch:{ IllegalStateException -> 0x034d }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x034d }
        r0 = r1.append(r0);	 Catch:{ IllegalStateException -> 0x034d }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x034d }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x034d }
    L_0x01a3:
        r0 = r11.w;
        if (r0 == 0) goto L_0x0218;
    L_0x01a7:
        r0 = r11.getSupportActionBar();
        r1 = 2131624642; // 0x7f0e02c2 float:1.887647E38 double:1.0531625054E-314;
        r0.setTitle(r1);
        r0 = 2131427425; // 0x7f0b0061 float:1.8476466E38 double:1.0530650673E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = "";
        r0.setText(r1);
        r0 = 2131427427; // 0x7f0b0063 float:1.847647E38 double:1.0530650683E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = "";
        r0.setText(r1);	 Catch:{ IllegalStateException -> 0x034f }
        r0 = 2131427423; // 0x7f0b005f float:1.8476462E38 double:1.0530650663E-314;
        r0 = r11.findViewById(r0);	 Catch:{ IllegalStateException -> 0x034f }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x034f }
        r0 = 2131427421; // 0x7f0b005d float:1.8476458E38 double:1.0530650653E-314;
        r0 = r11.findViewById(r0);	 Catch:{ IllegalStateException -> 0x034f }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x034f }
        r0 = r11.j;	 Catch:{ IllegalStateException -> 0x034f }
        if (r0 == 0) goto L_0x01ee;
    L_0x01e8:
        r0 = r11.j;	 Catch:{ IllegalStateException -> 0x034f }
        r1 = 0;
        r11.a(r0, r1);	 Catch:{ IllegalStateException -> 0x034f }
    L_0x01ee:
        r0 = 2131427422; // 0x7f0b005e float:1.847646E38 double:1.053065066E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = r11.o;
        r0.setOnClickListener(r1);
        r0 = 2131427429; // 0x7f0b0065 float:1.8476474E38 double:1.0530650693E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r1 = r11.p;	 Catch:{ IllegalStateException -> 0x0351 }
        r0.setOnClickListener(r1);	 Catch:{ IllegalStateException -> 0x0351 }
        r0 = 2131427451; // 0x7f0b007b float:1.8476519E38 double:1.05306508E-314;
        r0 = r11.findViewById(r0);	 Catch:{ IllegalStateException -> 0x0351 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x0351 }
        if (r4 == 0) goto L_0x0248;
    L_0x0218:
        r0 = com.whatsapp.App.an;	 Catch:{ IllegalStateException -> 0x0351 }
        r0 = r0.jabber_id;	 Catch:{ IllegalStateException -> 0x0351 }
        r11.j = r0;	 Catch:{ IllegalStateException -> 0x0351 }
        r0 = 2131427426; // 0x7f0b0062 float:1.8476468E38 double:1.053065068E-314;
        r0 = r11.findViewById(r0);	 Catch:{ IllegalStateException -> 0x0351 }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x0351 }
        r1 = r11.j;	 Catch:{ IllegalStateException -> 0x0351 }
        r1 = com.whatsapp.m3.a(r1);	 Catch:{ IllegalStateException -> 0x0351 }
        r0.setText(r1);	 Catch:{ IllegalStateException -> 0x0351 }
        r0 = 2131427424; // 0x7f0b0060 float:1.8476464E38 double:1.053065067E-314;
        r0 = r11.findViewById(r0);	 Catch:{ IllegalStateException -> 0x0351 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x0351 }
        r0 = 2131427429; // 0x7f0b0065 float:1.8476474E38 double:1.0530650693E-314;
        r0 = r11.findViewById(r0);	 Catch:{ IllegalStateException -> 0x0351 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x0351 }
    L_0x0248:
        r0 = 2131427449; // 0x7f0b0079 float:1.8476515E38 double:1.053065079E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = 2131427447; // 0x7f0b0077 float:1.847651E38 double:1.053065078E-314;
        r1 = r11.findViewById(r1);
        r1 = (android.widget.Button) r1;
        r2 = 2131427448; // 0x7f0b0078 float:1.8476513E38 double:1.0530650787E-314;
        r2 = r11.findViewById(r2);
        r2 = (android.widget.Button) r2;
        r5 = com.whatsapp.App.as();	 Catch:{ IllegalStateException -> 0x0353 }
        if (r5 != 0) goto L_0x0284;
    L_0x0269:
        r5 = 0;
        r6 = 0;
        r7 = 2130839136; // 0x7f020660 float:1.7283274E38 double:1.052774414E-314;
        r8 = 0;
        r0.setCompoundDrawablesWithIntrinsicBounds(r5, r6, r7, r8);	 Catch:{ IllegalStateException -> 0x0353 }
        r5 = 0;
        r6 = 0;
        r7 = 2130839135; // 0x7f02065f float:1.7283272E38 double:1.0527744134E-314;
        r8 = 0;
        r1.setCompoundDrawablesWithIntrinsicBounds(r5, r6, r7, r8);	 Catch:{ IllegalStateException -> 0x0353 }
        r5 = 0;
        r6 = 0;
        r7 = 2130838365; // 0x7f02035d float:1.728171E38 double:1.052774033E-314;
        r8 = 0;
        r2.setCompoundDrawablesWithIntrinsicBounds(r5, r6, r7, r8);	 Catch:{ IllegalStateException -> 0x0353 }
    L_0x0284:
        r5 = com.whatsapp.App.ag();	 Catch:{ IllegalStateException -> 0x0355 }
        if (r5 == 0) goto L_0x028f;
    L_0x028a:
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ IllegalStateException -> 0x0355 }
    L_0x028f:
        r5 = r11.w;
        if (r5 != 0) goto L_0x02a5;
    L_0x0293:
        r3 = r11.b();
        if (r3 == 0) goto L_0x02a5;
    L_0x0299:
        r5 = 2131427430; // 0x7f0b0066 float:1.8476476E38 double:1.05306507E-314;
        r5 = r11.findViewById(r5);	 Catch:{ IllegalStateException -> 0x0357 }
        r6 = 8;
        r5.setVisibility(r6);	 Catch:{ IllegalStateException -> 0x0357 }
    L_0x02a5:
        r5 = r11.w;	 Catch:{ IllegalStateException -> 0x0359 }
        if (r5 != 0) goto L_0x02ab;
    L_0x02a9:
        if (r3 != 0) goto L_0x02dd;
    L_0x02ab:
        r5 = r11.z;	 Catch:{ IllegalStateException -> 0x035d }
        r0.setOnClickListener(r5);	 Catch:{ IllegalStateException -> 0x035d }
        r0 = r11.r;	 Catch:{ IllegalStateException -> 0x035d }
        r2.setOnClickListener(r0);	 Catch:{ IllegalStateException -> 0x035d }
        r0 = com.whatsapp.App.k;	 Catch:{ IllegalStateException -> 0x035d }
        r0 = r0.e();	 Catch:{ IllegalStateException -> 0x035d }
        if (r0 == 0) goto L_0x02d8;
    L_0x02bd:
        r0 = com.whatsapp.App.G;	 Catch:{ IllegalStateException -> 0x035f }
        if (r0 != 0) goto L_0x02d8;
    L_0x02c1:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0361 }
        if (r0 < r9) goto L_0x02d8;
    L_0x02c5:
        r0 = r11.l;	 Catch:{ IllegalStateException -> 0x0363 }
        r1.setOnClickListener(r0);	 Catch:{ IllegalStateException -> 0x0363 }
        r0 = com.whatsapp.App.aa;	 Catch:{ IllegalStateException -> 0x0363 }
        if (r0 != r10) goto L_0x02dd;
    L_0x02ce:
        r0 = new com.whatsapp.afv;	 Catch:{ IllegalStateException -> 0x0365 }
        r0.<init>(r11);	 Catch:{ IllegalStateException -> 0x0365 }
        r1.setOnLongClickListener(r0);	 Catch:{ IllegalStateException -> 0x0365 }
        if (r4 == 0) goto L_0x02dd;
    L_0x02d8:
        r0 = r11.n;	 Catch:{ IllegalStateException -> 0x0365 }
        r1.setOnClickListener(r0);	 Catch:{ IllegalStateException -> 0x0365 }
    L_0x02dd:
        r0 = 2131427450; // 0x7f0b007a float:1.8476517E38 double:1.0530650796E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r2 = r0.getPaintFlags();	 Catch:{ IllegalStateException -> 0x0367 }
        r2 = r2 | 8;
        r0.setPaintFlags(r2);	 Catch:{ IllegalStateException -> 0x0367 }
        r2 = new com.whatsapp.j6;	 Catch:{ IllegalStateException -> 0x0367 }
        r2.<init>(r11);	 Catch:{ IllegalStateException -> 0x0367 }
        r0.setOnClickListener(r2);	 Catch:{ IllegalStateException -> 0x0367 }
        r2 = new com.whatsapp.akk;	 Catch:{ IllegalStateException -> 0x0367 }
        r2.<init>(r11);	 Catch:{ IllegalStateException -> 0x0367 }
        r0.setOnTouchListener(r2);	 Catch:{ IllegalStateException -> 0x0367 }
        if (r3 != 0) goto L_0x032b;
    L_0x0301:
        if (r12 != 0) goto L_0x032b;
    L_0x0303:
        r0 = r11.getIntent();
        if (r0 == 0) goto L_0x032b;
    L_0x0309:
        r2 = A;	 Catch:{ IllegalStateException -> 0x0369 }
        r3 = 51;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0369 }
        r3 = 0;
        r0 = r0.getBooleanExtra(r2, r3);	 Catch:{ IllegalStateException -> 0x0369 }
        if (r0 == 0) goto L_0x032b;
    L_0x0316:
        if (r1 == 0) goto L_0x032b;
    L_0x0318:
        r0 = A;	 Catch:{ IllegalStateException -> 0x036b }
        r2 = 45;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x036b }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x036b }
        r0 = 1;
        r11.t = r0;	 Catch:{ IllegalStateException -> 0x036b }
        r0 = 0;
        r11.setIntent(r0);	 Catch:{ IllegalStateException -> 0x036b }
        r1.performClick();	 Catch:{ IllegalStateException -> 0x036b }
    L_0x032b:
        r0 = com.whatsapp.ac.c;	 Catch:{ IllegalStateException -> 0x036d }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x036d }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x0348;
    L_0x0335:
        r0 = A;	 Catch:{ IllegalStateException -> 0x036d }
        r1 = 53;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x036d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x036d }
        r1 = 1;
        r2 = 1;
        r3 = 1;
        r4 = 0;
        r5 = 0;
        r6 = 1;
        r0 = r11;
        com.whatsapp.messaging.MessageService.a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ IllegalStateException -> 0x036d }
    L_0x0348:
        return;
    L_0x0349:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x034b }
    L_0x034b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x034d }
    L_0x034d:
        r0 = move-exception;
        throw r0;
    L_0x034f:
        r0 = move-exception;
        throw r0;
    L_0x0351:
        r0 = move-exception;
        throw r0;
    L_0x0353:
        r0 = move-exception;
        throw r0;
    L_0x0355:
        r0 = move-exception;
        throw r0;
    L_0x0357:
        r0 = move-exception;
        throw r0;
    L_0x0359:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x035b }
    L_0x035b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x035d }
    L_0x035d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x035f }
    L_0x035f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0361 }
    L_0x0361:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0363 }
    L_0x0363:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0365 }
    L_0x0365:
        r0 = move-exception;
        throw r0;
    L_0x0367:
        r0 = move-exception;
        throw r0;
    L_0x0369:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x036b }
    L_0x036b:
        r0 = move-exception;
        throw r0;
    L_0x036d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AccountInfoActivity.onCreate(android.os.Bundle):void");
    }

    protected void onStop() {
        super.onStop();
        Log.i(A[42] + getIntent());
        App.k.a(this.v);
        ac.b(this.x);
    }

    static void j(AccountInfoActivity accountInfoActivity) {
        accountInfoActivity.m();
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case ay.n /*2*/:
                return new Builder(this).setMessage(R.string.failed_redeem).setPositiveButton(R.string.ok, null).create();
            case aj.i /*4*/:
                return new Builder(this).setMessage(R.string.failed_launch).setPositiveButton(R.string.ok, null).create();
            case aV.r /*5*/:
                return new Builder(this).setMessage(R.string.launch_owned).setPositiveButton(R.string.ok, null).create();
            case aV.i /*6*/:
                try {
                    return new Builder(this).setMessage(R.string.google_play_error).setPositiveButton(R.string.ok, null).create();
                } catch (IllegalStateException e) {
                    throw e;
                }
            case a8.s /*7*/:
                DialogInterface.OnClickListener pwVar = new pw(this);
                return new Builder(this).setMessage(R.string.payment_wifi_enabled).setPositiveButton(R.string.yes, pwVar).setNegativeButton(R.string.no, pwVar).create();
            case a8.n /*8*/:
                return a(8, new avm(this));
            case a6.D /*9*/:
                return a(9, new i4(this));
            case a6.e /*11*/:
                return a(11, new cf(this));
            case 117:
                Log.w(A[18]);
                return a_3.b(this);
            case 118:
                Log.w(A[15]);
                return a_3.f(this);
            case 119:
                Log.w(A[17]);
                return a_3.a((Activity) this, this.t);
            case 120:
                Log.w(A[14]);
                return a_3.d(this);
            case 121:
                Log.w(A[16]);
                return a_3.c(this);
            default:
                return super.onCreateDialog(i);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = App.az;
        Log.i(A[34] + i + A[35] + i2 + A[31] + intent);
        if (i == 10001) {
            try {
                App.k.a(i2, intent);
                return;
            } catch (Throwable e) {
                try {
                    Log.b(A[33], e);
                    showDialog(6);
                    if (i3 == 0) {
                        return;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                } catch (IllegalStateException e22) {
                    throw e22;
                }
            }
        }
        try {
            if (i == 10002) {
                if (i2 == -1) {
                    String stringExtra = intent.getStringExtra(A[32]);
                    Log.b(stringExtra.endsWith(A[37]));
                    this.j = stringExtra.substring(0, stringExtra.length() - A[36].length());
                    a(this.j, null);
                    if (i3 == 0) {
                        return;
                    }
                }
                return;
            }
            super.onActivityResult(i, i2, intent);
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    static Runnable a(AccountInfoActivity accountInfoActivity, Runnable runnable) {
        accountInfoActivity.u = runnable;
        return runnable;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onPrepareDialog(int r4, android.app.Dialog r5) {
        /*
        r3_this = this;
        r1 = com.whatsapp.App.az;
        switch(r4) {
            case 117: goto L_0x0015;
            case 118: goto L_0x0021;
            case 119: goto L_0x002d;
            case 120: goto L_0x0005;
            case 121: goto L_0x0009;
            default: goto L_0x0005;
        };
    L_0x0005:
        super.onPrepareDialog(r4, r5);	 Catch:{ IllegalStateException -> 0x003f }
    L_0x0008:
        return;
    L_0x0009:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.a();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0008;
    L_0x0015:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.b();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0008;
    L_0x0021:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.c();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0008;
    L_0x002d:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.d();	 Catch:{ IllegalStateException -> 0x003f }
        r0.setMessage(r2);	 Catch:{ IllegalStateException -> 0x003f }
        r2 = r3.t;	 Catch:{ IllegalStateException -> 0x003f }
        com.whatsapp.a_3.a(r3, r0, r2);	 Catch:{ IllegalStateException -> 0x003f }
        if (r1 == 0) goto L_0x0008;
    L_0x003e:
        goto L_0x0005;
    L_0x003f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AccountInfoActivity.onPrepareDialog(int, android.app.Dialog):void");
    }

    private String a(String str, String str2, boolean z) {
        String str3 = this.j + A[8];
        try {
            return str + A[11] + this.j + A[9] + a54.b(str3) + A[10] + str2 + A[13] + azl.a() + A[7] + azl.b() + (z ? A[12] + App.an.jabber_id : "");
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private String b(String str, String str2, boolean z) {
        try {
            String str3;
            String str4 = A[19];
            Object[] objArr = new Object[3];
            objArr[0] = str2;
            objArr[1] = str;
            if (z) {
                str3 = A[21];
            } else {
                str3 = A[22];
            }
            objArr[2] = str3;
            str3 = String.format(str4, objArr);
            Log.i(A[20] + str3);
            return str3;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static void c(AccountInfoActivity accountInfoActivity) {
        accountInfoActivity.g();
    }

    static String a(AccountInfoActivity accountInfoActivity, String str) {
        accountInfoActivity.j = str;
        return str;
    }

    private void d() {
        String j = j();
        Log.i(A[29] + j);
        b(R.string.redeem_wait);
        this.m.sendEmptyMessageDelayed(8, 32000);
        App.k.a(j, b(App.an.jabber_id, this.j, this.w));
    }

    static void d(AccountInfoActivity accountInfoActivity) {
        accountInfoActivity.d();
    }
}
