package com.whatsapp;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract.Data;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;
import com.whatsapp.util.bl;
import com.whatsapp.util.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class MediaView extends DialogToastActivity {
    private static final String[] N;
    private int A;
    private TextView B;
    private anq C;
    private float D;
    private ye E;
    private String F;
    private String G;
    private int H;
    private int I;
    private b J;
    private SeekBar K;
    private Drawable L;
    private int M;
    private float j;
    private int k;
    private ArrayList l;
    private int m;
    private OnClickListener n;
    private boolean o;
    private Uri p;
    private boolean q;
    private ImageButton r;
    private MediaViewPager s;
    private b t;
    private is u;
    private Handler v;
    private int w;
    private bl x;
    private m y;
    private p6 z;

    class AnonymousClass_15 extends PhotoView {
        final MediaView Q;

        public boolean onDoubleTap(MotionEvent motionEvent) {
            MediaView.b(this.Q, h() != b());
            return super.onDoubleTap(motionEvent);
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            super.onScaleEnd(scaleGestureDetector);
            MediaView.b(this.Q, h() == b());
        }

        AnonymousClass_15(MediaView mediaView, Context context) {
            this.Q = mediaView;
            super(context);
        }

        public boolean b(float f, float f2) {
            return super.b(f, f2);
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            MediaView.b(this.Q, false);
            return super.onScaleBegin(scaleGestureDetector);
        }

        public boolean c(float f, float f2) {
            return super.c(f, f2);
        }
    }

    class MediaViewPager extends PhotoViewPager {
        final MediaView g;

        public MediaViewPager(MediaView mediaView, Context context, AttributeSet attributeSet) {
            this.g = mediaView;
            super(context, attributeSet);
            setOnPageChangeListener(new ob(this, mediaView));
            setOnInterceptTouchListener(new dl(this, mediaView));
        }
    }

    static {
        String[] strArr = new String[94];
        String str = "\u001e ,\f9\u0005,-\u0012w\u00001)\u0017,";
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
                        i3 = 115;
                        break;
                    case ay.f /*1*/:
                        i3 = 69;
                        break;
                    case ay.n /*2*/:
                        i3 = 72;
                        break;
                    case ay.p /*3*/:
                        i3 = 101;
                        break;
                    default:
                        i3 = 88;
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
                    str = "\u0012+,\u00177\u001a!f\f6\u0007 &\u0011v\u0012&<\f7\u001dk\u001b \u00167";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0005,,\u00007\\o";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u00120,\f7\\o";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u001a()\u0002=\\o";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0012+,\u00177\u001a!f\f6\u0007 &\u0011v\u0016=<\u00179]\u0016\u001c7\u001d2\b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001b$;:9\u001d,%\u0004,\u001a*&";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001e ,\f9\u0005,-\u0012w\u00107-\u0004,\u0016";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001e ,\f9\u0005,-\u0012w\u001c++\u0017=\u00121-J7\u001c(g\r=\u00125h\u00161\t r";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "S.\n";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0010*&\u00119\u00101\u0017\u0010*\u001a";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0019,,";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0018 1";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "S(-_";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u001b !\u00020\u0007";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0004,,\u00110";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u001e ,\f9\u0005,-\u0012w\u0005,-\u0012x\u001e ;\u00169\u0014 r";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0014,,";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u001e ,\f9\u0005,-\u0012w\u0015*=\u000b<^.-\u001cx";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "S,,_";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0019,,";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0018 1";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0004,,\u00110";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0019,,";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u001b$;:9\u001d,%\u0004,\u001a*&";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0018 1";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u001b !\u00020\u0007";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0005+,K9\u001d!:\n1\u0017k+\u0010*\u0000*:K1\u0007 %J(\u001b*<\n";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0005+,K9\u001d!:\n1\u0017k+\u0010*\u0000*:K1\u0007 %J(\u001b*<\n";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0001$?:;\u001c+<\u0004;\u0007\u001a!\u0001xNe";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0001$?:;\u001c+<\u0004;\u0007\u001a!\u0001";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = ",,,";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u001a6\u0017\u0016-\u0003 ::(\u0001,%\u0004*\n";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = ",,,EeS";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u001e,%\u0000,\n5-";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u001e,%\u0000,\n5-";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "S\u0004\u0006!x";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "Nxo";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u0017$<\u0004iF";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0005,,\u00007\\o";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0012+,\u00177\u001a!f\f6\u0007 &\u0011v\u0012&<\f7\u001dk\u001e,\u001d$";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u0010*%K+\u001c+1\u0000*\u001a&;\u00167\u001dk/\u00044\u001f :\u001c";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u0010*%K+\u001c+1\u0000*\u001a&;\u00167\u001dk/\u00044\u001f :\u001cv>*>\f=%,-\u0012";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "S9h";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = " *&\u001c";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u0010*%K+\u001c+1\u0000*\u001a&;\u00167\u001dk/\u00044\u001f :\u001cv>*>\f=%,-\u0012";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = " *&\u001c";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u001e ,\f9\u0005,-\u0012w\u00120,\f7S!=\u00179\u0007,'\u000bb";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u001e ,\f9\u0005,-\u0012w\u00037-\u00159\u0001 )\u0010<\u001a*8\t9\n')\u00063\\";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u001e ,\f9\u0005,-\u0012w\u0017 ;\u0011*\u001c<";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u0010*&\u00119\u00101\u0017\u0010*\u001a";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u0014,,";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0012)8\r9";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0000&)\t=";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u001c0<\u0015-\u0007";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0010*&\u00119\u00101";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u0010*&\u00119\u00101\u0017\f<Nz";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u001e ,\f9\u0005,-\u0012w\u0001$?:;\u001c+<\u0004;\u0007\u001a!\u0001b";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\u001c0<\u0015-\u0007\u001c";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0017$<\u0004";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "S9h";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\u0001 <\u0010*\u001dh,\u0004,\u0012";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u0003-'\u00117";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\u0000&)\t=&5\u0001\u0003\u0016\u0016 ,\u0000<";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\u001e ,\f9\u0005,-\u0012w\u0015*:\u00129\u0001!g\u00039\u001a)-\u0001";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u001c0<\u0015-\u0007\u0003'\u00175\u00121";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0010*&\u00119\u00101";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u0017$<\u0004";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    str = ",,,";
                    obj = 68;
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i] = str;
                    i = 70;
                    strArr2 = strArr3;
                    str = "\u001c0<\u0015-\u0007\u001d";
                    obj = 69;
                    break;
                case 69:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u001e ,\f9\u0005,-\u0012w\u00123)\u00119\u0001\u001a?\f<\u0007-r";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i] = str;
                    str = "\u00107'\u0015\u001a\n\n=\u0011(\u00061\u001b\f\"\u0016";
                    obj = 71;
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i] = str;
                    i = 73;
                    strArr2 = strArr3;
                    str = "\u001e ,\f9\u0005,-\u0012w\u0015*:\u00129\u0001!g\f6\u0005$$\f<^(-\u0016+\u0012\"-";
                    obj = 72;
                    break;
                case 72:
                    strArr2[i] = str;
                    i = 74;
                    str = "<7!\u00006\u0007$<\f7\u001d";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i] = str;
                    i = 75;
                    str = "\u001e ,\f9\u0005,-\u0012w\u0001*<\u0004,\u0016";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i] = str;
                    i = 76;
                    str = "\u001e ,\f9\u0005,-\u0012w\u0001*<\u0004,\u0016j:\u0000;\u0001 )\u0011=\u0007-=\b:";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i] = str;
                    i = 77;
                    str = "\u001e ,\f9\u0005,-\u0012w\u0001*<\u0004,\u0016j:\u0000;\u0001 )\u0011=\u0007-=\b:";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i] = str;
                    i = 78;
                    str = "<7!\u00006\u0007$<\f7\u001d";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u0012)8\r9";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i] = str;
                    i = 80;
                    str = "\u0012+,\u00177\u001a!f\f6\u0007 &\u0011v\u0012&<\f7\u001dk\u001e,\u001d$";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case 79:
                    strArr2[i] = str;
                    i = 81;
                    str = "\u001c0<\u0015-\u0007";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case 80:
                    strArr2[i] = str;
                    i = 82;
                    str = "\u0000&)\t=";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case 81:
                    strArr2[i] = str;
                    i = 83;
                    str = "\u0012+,\u00177\u001a!f\f6\u0007 &\u0011v\u0012&<\f7\u001dk\u0018,\u001b8";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case 82:
                    strArr2[i] = str;
                    i = 84;
                    str = "\u001e ,\f9\u0005,-\u0012w\u0004$$\t(\u00125-\u0017w\u00107'\u0015w\u001b !\u00020\u0007\u007f";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case 83:
                    strArr2[i] = str;
                    i = 85;
                    str = "\u0000 <:?\u0001*=\u0015\u0007\u001a&'\u000b";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case 84:
                    strArr2[i] = str;
                    i = 86;
                    str = "\u00107'\u0015\u001a\n\n=\u0011(\u00061\u001b\f\"\u0016";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case 85:
                    strArr2[i] = str;
                    i = 87;
                    str = "\u001c0<\u0015-\u0007\u0003'\u00175\u00121";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case 86:
                    strArr2[i] = str;
                    str = "\u0019,,";
                    obj = 87;
                    i = 88;
                    strArr2 = strArr3;
                    break;
                case 87:
                    strArr2[i] = str;
                    i = 89;
                    strArr2 = strArr3;
                    str = "\u0000&)\t=&5\u0001\u0003\u0016\u0016 ,\u0000<";
                    obj = 88;
                    break;
                case 88:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u001c0<\u0015-\u0007\u001d";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case 89:
                    strArr2[i] = str;
                    i = 91;
                    str = "\u001a()\u0002=\\o";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case 90:
                    strArr2[i] = str;
                    i = 92;
                    str = "\u0015*:\u00129\u0001!";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case 91:
                    strArr2[i] = str;
                    i = 93;
                    str = "\u001c0<\u0015-\u0007\u001c";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case 92:
                    strArr2[i] = str;
                    N = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u001e ,\f9\u0005,-\u0012w\u00001'\u0015";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static bl q(MediaView mediaView) {
        return mediaView.x;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
        r11_this = this;
        r10 = 2131427888; // 0x7f0b0230 float:1.8477405E38 double:1.053065296E-314;
        r9 = 11;
        r8 = 1;
        r1 = 0;
        r7 = 0;
        r0 = N;
        r2 = 8;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r12);
        com.whatsapp.App.a5();
        r2 = 5;
        r11.requestWindowFeature(r2);
        r0 = r11.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r8);
        r0 = r11.getSupportActionBar();
        r2 = new com.whatsapp.wk;
        r2.<init>(r11);
        r0.setIcon(r2);
        r0 = r11.getLayoutInflater();	 Catch:{ OutOfMemoryError -> 0x0049 }
        r2 = 2130903167; // 0x7f03007f float:1.7413144E38 double:1.0528060494E-314;
        r3 = 0;
        r4 = 0;
        r0 = r0.inflate(r2, r3, r4);	 Catch:{ OutOfMemoryError -> 0x0049 }
        r11.setContentView(r0);	 Catch:{ OutOfMemoryError -> 0x0049 }
        r6 = r11.getIntent();
        if (r6 != 0) goto L_0x0086;
    L_0x0045:
        r11.finish();	 Catch:{ OutOfMemoryError -> 0x0084 }
    L_0x0048:
        return;
    L_0x0049:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = N;
        r2 = 9;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r2 = android.os.Debug.getNativeHeapAllocatedSize();
        r4 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r2 = r2 / r4;
        r0 = r0.append(r2);
        r1 = N;
        r2 = 10;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        com.whatsapp.util.f.a();
        r0 = 2131624283; // 0x7f0e015b float:1.8875741E38 double:1.053162328E-314;
        r1 = new com.whatsapp.a_e;
        r1.<init>(r11);
        r11.a(r0, r1);
        goto L_0x0048;
    L_0x0084:
        r0 = move-exception;
        throw r0;
    L_0x0086:
        r0 = new com.whatsapp.ye;
        r0.<init>(r11, r1);
        r11.E = r0;
        r0 = r11.E;
        r0.start();
        r0 = N;
        r2 = 12;
        r0 = r0[r2];
        r0 = r6.getStringExtra(r0);
        r11.F = r0;
        r0 = r11.F;
        com.whatsapp.util.bo.c(r0);
        r0 = N;
        r2 = 13;
        r0 = r0[r2];
        r0 = r6.getParcelableExtra(r0);
        r0 = (com.whatsapp.w4) r0;
        if (r0 == 0) goto L_0x0235;
    L_0x00b1:
        r0 = r0.a;
        r11.y = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r11.l = r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = N;
        r3 = 19;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r11.y;
        r2 = r2.c;
        r0 = r0.append(r2);
        r2 = N;
        r3 = 14;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r11.y;
        r2 = r2.b;
        r0 = r0.append(r2);
        r2 = N;
        r3 = 20;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r11.y;
        r2 = r2.a;
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.aJ;
        r2 = r11.y;
        r2 = r0.b(r2);
        if (r2 != 0) goto L_0x010f;
    L_0x0108:
        r11.finish();	 Catch:{ OutOfMemoryError -> 0x010d }
        goto L_0x0048;
    L_0x010d:
        r0 = move-exception;
        throw r0;
    L_0x010f:
        r0 = r11.l;	 Catch:{ OutOfMemoryError -> 0x0233 }
        r0.add(r2);	 Catch:{ OutOfMemoryError -> 0x0233 }
        r0 = r2.j;	 Catch:{ OutOfMemoryError -> 0x0233 }
        r3 = 2;
        if (r0 == r3) goto L_0x011e;
    L_0x0119:
        r0 = r2.j;	 Catch:{ OutOfMemoryError -> 0x0233 }
        r3 = 3;
        if (r0 != r3) goto L_0x0252;
    L_0x011e:
        r0 = r2;
    L_0x011f:
        r3 = r11.getSupportActionBar();
        r3.setDisplayShowTitleEnabled(r7);
        r11.setSupportProgressBarIndeterminateVisibility(r8);
        r3 = new com.whatsapp.p6;
        r3.<init>(r11);
        r11.z = r3;
        r3 = r11.z;
        r4 = new java.lang.Void[r7];
        com.whatsapp.a5w.a(r3, r4);
        r3 = r0;
    L_0x0138:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = N;
        r5 = 17;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r11.y;
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r11.H = r7;
        r0 = r11.getResources();
        r4 = 2130838992; // 0x7f0205d0 float:1.7282982E38 double:1.052774343E-314;
        r0 = r0.getDrawable(r4);
        r0 = (android.graphics.drawable.BitmapDrawable) r0;
        r0 = r0.getBitmap();
        com.whatsapp.PhotoView.w = r0;
        r0 = new com.whatsapp.a3h;
        r0.<init>(r11);
        r11.v = r0;
        if (r12 == 0) goto L_0x024f;
    L_0x0172:
        r11.t = r1;	 Catch:{ OutOfMemoryError -> 0x0243 }
        r0 = new com.whatsapp.is;	 Catch:{ OutOfMemoryError -> 0x0243 }
        r0.<init>(r11, r1);	 Catch:{ OutOfMemoryError -> 0x0243 }
        r11.u = r0;	 Catch:{ OutOfMemoryError -> 0x0243 }
        r0 = new com.whatsapp.MediaView$MediaViewPager;	 Catch:{ OutOfMemoryError -> 0x0243 }
        r1 = 0;
        r0.<init>(r11, r11, r1);	 Catch:{ OutOfMemoryError -> 0x0243 }
        r11.s = r0;	 Catch:{ OutOfMemoryError -> 0x0243 }
        r0 = 2131427888; // 0x7f0b0230 float:1.8477405E38 double:1.053065296E-314;
        r0 = r11.findViewById(r0);	 Catch:{ OutOfMemoryError -> 0x0243 }
        r0 = (android.view.ViewGroup) r0;	 Catch:{ OutOfMemoryError -> 0x0243 }
        r1 = r11.s;	 Catch:{ OutOfMemoryError -> 0x0243 }
        r0.addView(r1);	 Catch:{ OutOfMemoryError -> 0x0243 }
        r0 = r11.s;	 Catch:{ OutOfMemoryError -> 0x0243 }
        r1 = r11.u;	 Catch:{ OutOfMemoryError -> 0x0243 }
        r0.setAdapter(r1);	 Catch:{ OutOfMemoryError -> 0x0243 }
        r0 = r11.H;	 Catch:{ OutOfMemoryError -> 0x0243 }
        r11.e(r0);	 Catch:{ OutOfMemoryError -> 0x0243 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ OutOfMemoryError -> 0x0243 }
        if (r0 < r9) goto L_0x01a8;
    L_0x01a1:
        r0 = r11.s;	 Catch:{ OutOfMemoryError -> 0x0243 }
        r1 = r11.m;	 Catch:{ OutOfMemoryError -> 0x0243 }
        r0.setSystemUiVisibility(r1);	 Catch:{ OutOfMemoryError -> 0x0243 }
    L_0x01a8:
        r0 = r11.findViewById(r10);
        r1 = new android.graphics.drawable.ColorDrawable;	 Catch:{ OutOfMemoryError -> 0x0245 }
        r3 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1.<init>(r3);	 Catch:{ OutOfMemoryError -> 0x0245 }
        r11.L = r1;	 Catch:{ OutOfMemoryError -> 0x0245 }
        r1 = r11.L;	 Catch:{ OutOfMemoryError -> 0x0245 }
        r0.setBackgroundDrawable(r1);	 Catch:{ OutOfMemoryError -> 0x0245 }
        if (r12 != 0) goto L_0x0210;
    L_0x01bc:
        if (r2 == 0) goto L_0x0210;
    L_0x01be:
        r0 = r2.j;	 Catch:{ OutOfMemoryError -> 0x0249 }
        if (r0 != r8) goto L_0x0210;
    L_0x01c2:
        r0 = f();	 Catch:{ OutOfMemoryError -> 0x024b }
        if (r0 == 0) goto L_0x0210;
    L_0x01c8:
        r0 = N;	 Catch:{ OutOfMemoryError -> 0x024b }
        r1 = 7;
        r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x024b }
        r1 = 0;
        r0 = r6.getBooleanExtra(r0, r1);	 Catch:{ OutOfMemoryError -> 0x024b }
        if (r0 == 0) goto L_0x0210;
    L_0x01d4:
        r11.J = r2;
        r11.q = r8;
        r2 = r11.s;
        r0 = "x";
        r3 = r6.getIntExtra(r0, r7);
        r0 = "y";
        r4 = r6.getIntExtra(r0, r7);
        r0 = N;
        r1 = 16;
        r0 = r0[r1];
        r5 = r6.getIntExtra(r0, r7);
        r0 = N;
        r1 = 15;
        r0 = r0[r1];
        r6 = r6.getIntExtra(r0, r7);
        r0 = r11.getSupportActionBar();
        r0.hide();
        r11.o = r7;
        r7 = r2.getViewTreeObserver();
        r0 = new com.whatsapp.asp;
        r1 = r11;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r7.addOnPreDrawListener(r0);
    L_0x0210:
        if (r12 == 0) goto L_0x022c;
    L_0x0212:
        r0 = N;	 Catch:{ OutOfMemoryError -> 0x024d }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x024d }
        r0 = r12.getParcelable(r0);	 Catch:{ OutOfMemoryError -> 0x024d }
        r0 = (android.net.Uri) r0;	 Catch:{ OutOfMemoryError -> 0x024d }
        r11.p = r0;	 Catch:{ OutOfMemoryError -> 0x024d }
        r0 = N;	 Catch:{ OutOfMemoryError -> 0x024d }
        r1 = 18;
        r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x024d }
        r0 = r12.getString(r0);	 Catch:{ OutOfMemoryError -> 0x024d }
        r11.G = r0;	 Catch:{ OutOfMemoryError -> 0x024d }
    L_0x022c:
        r0 = r11.C;
        com.whatsapp.App.b(r0);
        goto L_0x0048;
    L_0x0233:
        r0 = move-exception;
        throw r0;
    L_0x0235:
        r0 = com.whatsapp.App.aJ;
        r2 = r11.F;
        r0 = r0.e(r2);
        r11.l = r0;
        r2 = r1;
        r3 = r1;
        goto L_0x0138;
    L_0x0243:
        r0 = move-exception;
        throw r0;
    L_0x0245:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0247 }
    L_0x0247:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0249 }
    L_0x0249:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x024b }
    L_0x024b:
        r0 = move-exception;
        throw r0;
    L_0x024d:
        r0 = move-exception;
        throw r0;
    L_0x024f:
        r1 = r3;
        goto L_0x0172;
    L_0x0252:
        r0 = r1;
        goto L_0x011f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.onCreate(android.os.Bundle):void");
    }

    private void a(b bVar, int i) {
        int i2 = App.az;
        String str = N[45];
        cb.e();
        MediaData mediaData = (MediaData) bVar.A;
        if (bVar.j == 3) {
            Intent intent = new Intent(N[41]);
            intent.setDataAndType(Uri.fromFile(mediaData.file), N[40]);
            if (Build.MANUFACTURER.startsWith(N[47])) {
                List<ResolveInfo> queryIntentActivities = App.p.getPackageManager().queryIntentActivities(intent, 0);
                if (queryIntentActivities != null) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        Log.i(resolveInfo.activityInfo.packageName + N[44] + resolveInfo.activityInfo.name);
                        if (resolveInfo.activityInfo.name.equals(N[46])) {
                            intent.setClassName(N[42], N[43]);
                            continue;
                        }
                        if (i2 != 0) {
                            break;
                        }
                    }
                }
            }
            App.a((Context) this, intent);
            if (i2 == 0) {
                return;
            }
        }
        if (bVar.j == 2) {
            a(bVar);
            if (this.x != null) {
                this.A = 4;
                this.v.sendEmptyMessage(0);
                this.r.setImageResource(R.drawable.mviewer_pause);
                App.c((Context) this);
                this.x.d();
                if (i > 0) {
                    this.x.b(i);
                    this.K.setProgress(this.x.f());
                }
            }
        }
    }

    static ImageButton p(MediaView mediaView) {
        return mediaView.r;
    }

    private void a(Runnable runnable) {
        if (f()) {
            View view = this.s;
            b d = d(this.s.getCurrentItem());
            if (!(getResources().getConfiguration().orientation == this.w && d != null && d.e.equals(this.y))) {
                view.setPivotX((float) (view.getWidth() / 2));
                view.setPivotY((float) (view.getHeight() / 2));
                this.M = 0;
                this.k = 0;
            }
            view.animate().setDuration(240).scaleX(this.j).scaleY(this.D).translationX((float) this.M).translationY((float) this.k).alpha(0.0f).setListener(new jh(this, runnable));
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.L, N[79], new int[]{255, 0});
            ofInt.setDuration(240);
            ofInt.setInterpolator(new DecelerateInterpolator());
            ofInt.start();
        }
    }

    public static Intent a(b bVar, String str, Context context, View view) {
        Intent intent = new Intent(context, MediaView.class);
        intent.putExtra(N[24], str);
        intent.putExtra(N[26], new w4(bVar.e));
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        intent.putExtra("x", iArr[0]);
        intent.putExtra("y", iArr[1]);
        intent.putExtra(N[23], view.getWidth());
        intent.putExtra(N[27], view.getHeight());
        intent.putExtra(N[25], true);
        return intent;
    }

    static boolean a(MediaView mediaView, boolean z) {
        mediaView.q = z;
        return z;
    }

    private PhotoView c(b bVar) {
        View findViewWithTag = this.s.findViewWithTag(bVar.e);
        if (findViewWithTag != null && (findViewWithTag instanceof ViewGroup)) {
            findViewWithTag = ((ViewGroup) findViewWithTag).getChildAt(0);
            if (findViewWithTag != null && (findViewWithTag instanceof PhotoView)) {
                return (PhotoView) findViewWithTag;
            }
        }
        return null;
    }

    static TextView a(MediaView mediaView) {
        return mediaView.B;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(boolean r11) {
        /*
        r10_this = this;
        r2 = 0;
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r8 = 0;
        r3 = com.whatsapp.App.az;
        r0 = r10.q;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r0 = r10.o;
        if (r0 == r11) goto L_0x000a;
    L_0x000f:
        r10.o = r11;
        r0 = r10.s;
        r4 = r0.getChildCount();
        r1 = r2;
    L_0x0018:
        if (r1 >= r4) goto L_0x003d;
    L_0x001a:
        r0 = r10.s;
        r0 = r0.getChildAt(r1);
        r5 = 2131427656; // 0x7f0b0148 float:1.8476934E38 double:1.0530651814E-314;
        r5 = r0.findViewById(r5);
        if (r11 == 0) goto L_0x0061;
    L_0x0029:
        r0 = new android.view.animation.AlphaAnimation;
        r0.<init>(r8, r9);
        r5.setVisibility(r2);
    L_0x0031:
        r6 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r0.setDuration(r6);
        r5.setAnimation(r0);
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x006b;
    L_0x003d:
        if (r11 == 0) goto L_0x0048;
    L_0x003f:
        r0 = r10.getSupportActionBar();
        r0.show();
        if (r3 == 0) goto L_0x004f;
    L_0x0048:
        r0 = r10.getSupportActionBar();
        r0.hide();
    L_0x004f:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 < r1) goto L_0x000a;
    L_0x0055:
        r0 = r10.m;
        if (r11 != 0) goto L_0x005b;
    L_0x0059:
        r0 = r0 | 5;
    L_0x005b:
        r1 = r10.s;
        r1.setSystemUiVisibility(r0);
        goto L_0x000a;
    L_0x0061:
        r0 = new android.view.animation.AlphaAnimation;
        r0.<init>(r9, r8);
        r6 = 4;
        r5.setVisibility(r6);
        goto L_0x0031;
    L_0x006b:
        r1 = r0;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.b(boolean):void");
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.p != null) {
            bundle.putParcelable(N[51], this.p);
        }
        if (this.G != null) {
            bundle.putString(N[52], this.G);
        }
    }

    static String o(MediaView mediaView) {
        return mediaView.F;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.b r6) {
        /*
        r5_this = this;
        r4 = 0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = N;
        r2 = 49;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r6.e;
        r1 = r1.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r5.s;
        r1 = r6.e;
        r1 = r0.findViewWithTag(r1);
        r0 = 2131427890; // 0x7f0b0232 float:1.847741E38 double:1.053065297E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r5.B = r0;
        r0 = 2131427727; // 0x7f0b018f float:1.8477078E38 double:1.0530652165E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.SeekBar) r0;
        r5.K = r0;
        r0 = r5.K;
        r2 = new com.whatsapp.v5;
        r2.<init>(r5, r4);
        r0.setOnSeekBarChangeListener(r2);
        r0 = 2131427889; // 0x7f0b0231 float:1.8477407E38 double:1.0530652965E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r5.r = r0;
        r0 = new com.whatsapp.kl;
        r2 = r5.K;
        r3 = r5.r;
        r0.<init>(r5, r2, r3);
        r2 = r5.r;
        r2.setOnClickListener(r0);
        r2 = 2131427891; // 0x7f0b0233 float:1.8477411E38 double:1.0530652975E-314;
        r1 = r1.findViewById(r2);
        r2 = r5.o;	 Catch:{ IOException -> 0x0100 }
        if (r2 == 0) goto L_0x0072;
    L_0x006b:
        r1.setOnClickListener(r0);	 Catch:{ IOException -> 0x0100 }
        r2 = com.whatsapp.App.az;	 Catch:{ IOException -> 0x0100 }
        if (r2 == 0) goto L_0x007a;
    L_0x0072:
        r2 = new com.whatsapp.gp;	 Catch:{ IOException -> 0x0102 }
        r2.<init>(r5, r0);	 Catch:{ IOException -> 0x0102 }
        r1.setOnClickListener(r2);	 Catch:{ IOException -> 0x0102 }
    L_0x007a:
        r0 = r5.x;	 Catch:{ IOException -> 0x0104 }
        if (r0 == 0) goto L_0x0092;
    L_0x007e:
        r0 = r5.x;	 Catch:{ IOException -> 0x0104 }
        r0 = r0.c();	 Catch:{ IOException -> 0x0104 }
        if (r0 == 0) goto L_0x008b;
    L_0x0086:
        r0 = r5.x;	 Catch:{ IOException -> 0x0106 }
        r0.g();	 Catch:{ IOException -> 0x0106 }
    L_0x008b:
        r0 = r5.x;
        r0.a();
        r5.x = r4;
    L_0x0092:
        r0 = r6.A;	 Catch:{ IOException -> 0x0108 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IOException -> 0x0108 }
        r0 = r0.file;	 Catch:{ IOException -> 0x0108 }
        r0 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x0108 }
        r0 = com.whatsapp.util.bl.a(r0);	 Catch:{ IOException -> 0x0108 }
        r5.x = r0;	 Catch:{ IOException -> 0x0108 }
        r0 = r5.x;	 Catch:{ IOException -> 0x0108 }
        r1 = new com.whatsapp.afj;	 Catch:{ IOException -> 0x0108 }
        r1.<init>(r5);	 Catch:{ IOException -> 0x0108 }
        r0.a(r1);	 Catch:{ IOException -> 0x0108 }
        r0 = r5.x;	 Catch:{ IOException -> 0x0108 }
        r0.h();	 Catch:{ IOException -> 0x0108 }
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0108 }
        r0.<init>();	 Catch:{ IOException -> 0x0108 }
        r1 = N;	 Catch:{ IOException -> 0x0108 }
        r2 = 48;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0108 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0108 }
        r1 = r5.x;	 Catch:{ IOException -> 0x0108 }
        r1 = r1.e();	 Catch:{ IOException -> 0x0108 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0108 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0108 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0108 }
        r0 = 5;
        r5.A = r0;	 Catch:{ IOException -> 0x0108 }
        r0 = r5.B;	 Catch:{ IOException -> 0x0108 }
        r1 = r5.x;	 Catch:{ IOException -> 0x0108 }
        r1 = r1.e();	 Catch:{ IOException -> 0x0108 }
        r1 = r1 / 1000;
        r2 = (long) r1;	 Catch:{ IOException -> 0x0108 }
        r1 = android.text.format.DateUtils.formatElapsedTime(r2);	 Catch:{ IOException -> 0x0108 }
        r0.setText(r1);	 Catch:{ IOException -> 0x0108 }
        r0 = r5.K;	 Catch:{ IOException -> 0x0108 }
        r1 = r5.x;	 Catch:{ IOException -> 0x0108 }
        r1 = r1.e();	 Catch:{ IOException -> 0x0108 }
        r0.setMax(r1);	 Catch:{ IOException -> 0x0108 }
    L_0x00f1:
        r0 = r5.K;
        r1 = 0;
        r0.setProgress(r1);
        r0 = r5.r;
        r1 = 2130838990; // 0x7f0205ce float:1.7282978E38 double:1.052774342E-314;
        r0.setImageResource(r1);
        return;
    L_0x0100:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0102 }
    L_0x0102:
        r0 = move-exception;
        throw r0;
    L_0x0104:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0106 }
    L_0x0106:
        r0 = move-exception;
        throw r0;
    L_0x0108:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        r0 = 2131624340; // 0x7f0e0194 float:1.8875857E38 double:1.053162356E-314;
        r1 = new com.whatsapp.gc;
        r1.<init>(r5);
        r5.a(r0, r1);
        goto L_0x00f1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.a(com.whatsapp.protocol.b):void");
    }

    static int e(MediaView mediaView, int i) {
        mediaView.A = i;
        return i;
    }

    protected void onStart() {
        super.onStart();
        Log.i(N[0]);
    }

    private void e() {
        if (this.x != null) {
            if (this.x.c()) {
                this.x.g();
            }
            this.x.a();
            this.x = null;
            this.A = 0;
        }
        if (this.K != null) {
            this.K.setProgress(0);
        }
        if (this.r != null) {
            this.r.setImageResource(R.drawable.mviewer_play);
        }
        if (this.B != null) {
            this.B.setText(DateUtils.formatElapsedTime(0));
        }
    }

    static void h(MediaView mediaView, int i) {
        mediaView.f(i);
    }

    static int b(MediaView mediaView) {
        return mediaView.A;
    }

    public static int g(int i) {
        switch (i) {
            case ay.f /*1*/:
                return R.string.gallery_image_notready_warning;
            case ay.n /*2*/:
                return R.string.gallery_audio_notready_warning;
            case ay.p /*3*/:
                return R.string.gallery_video_notready_warning;
            default:
                return R.string.gallery_notready_warning;
        }
    }

    static is h(MediaView mediaView) {
        return mediaView.u;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b(true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem r11) {
        /*
        r10_this = this;
        r2 = 2131361853; // 0x7f0a003d float:1.834347E38 double:1.0530326704E-314;
        r9 = 2;
        r8 = 0;
        r7 = 1;
        r3 = com.whatsapp.App.az;
        r0 = r11.getItemId();
        switch(r0) {
            case 0: goto L_0x00fa;
            case 1: goto L_0x0010;
            case 2: goto L_0x0146;
            case 3: goto L_0x016b;
            case 4: goto L_0x0170;
            case 5: goto L_0x010c;
            case 6: goto L_0x0130;
            case 7: goto L_0x0175;
            case 8: goto L_0x0195;
            case 9: goto L_0x017a;
            case 10: goto L_0x017f;
            case 16908332: goto L_0x01af;
            default: goto L_0x000f;
        };
    L_0x000f:
        return r7;
    L_0x0010:
        r0 = r10.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.orientation;
        if (r0 != r7) goto L_0x004a;
    L_0x001c:
        r0 = r10.getWindow();
        r0 = r0.getDecorView();
        r0 = r0.getHeight();
        r1 = r10.getResources();
        r1 = r1.getDimension(r2);
        r1 = (int) r1;
        r0 = r0 - r1;
        r1 = com.whatsapp.am1.a();
        r1 = r1.b();
        r1 = r0 - r1;
        r0 = r10.getWindow();
        r0 = r0.getDecorView();
        r0 = r0.getWidth();
        if (r3 == 0) goto L_0x01d2;
    L_0x004a:
        r0 = r10.getWindow();
        r0 = r0.getDecorView();
        r0 = r0.getWidth();
        r1 = r10.getResources();
        r1 = r1.getDimension(r2);
        r1 = (int) r1;
        r0 = r0 - r1;
        r1 = com.whatsapp.am1.a();
        r1 = r1.b();
        r1 = r0 - r1;
        r0 = r10.getWindow();
        r0 = r0.getDecorView();
        r0 = r0.getHeight();
        r2 = r1;
        r1 = r0;
    L_0x0078:
        r0 = r10.H;
        r0 = r10.d(r0);
        r0 = r0.A;
        r0 = (com.whatsapp.MediaData) r0;
        r0 = r0.file;
        r0 = android.net.Uri.fromFile(r0);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = N;
        r6 = 84;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r2);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = new android.content.Intent;
        r5 = com.whatsapp.wallpaper.CropImage.class;
        r4.<init>(r10, r5);
        r5 = N;
        r6 = 90;
        r5 = r5[r6];
        r4.putExtra(r5, r1);
        r1 = N;
        r5 = 93;
        r1 = r1[r5];
        r4.putExtra(r1, r2);
        r1 = N;
        r2 = 82;
        r1 = r1[r2];
        r4.putExtra(r1, r7);
        r1 = N;
        r2 = 89;
        r1 = r1[r2];
        r4.putExtra(r1, r7);
        r1 = N;
        r2 = 86;
        r1 = r1[r2];
        r4.putExtra(r1, r7);
        r4.setData(r0);
        r0 = N;
        r1 = 81;
        r0 = r0[r1];
        r1 = com.whatsapp.wallpaper.p.a();
        r4.putExtra(r0, r1);
        r0 = N;
        r1 = 87;
        r0 = r0[r1];
        r1 = android.graphics.Bitmap.CompressFormat.JPEG;
        r1 = r1.toString();
        r4.putExtra(r0, r1);
        r10.startActivityForResult(r4, r8);
        if (r3 == 0) goto L_0x000f;
    L_0x00fa:
        r0 = new android.content.Intent;
        r1 = N;
        r2 = 83;
        r1 = r1[r2];
        r2 = android.provider.ContactsContract.Contacts.CONTENT_URI;
        r0.<init>(r1, r2);
        r10.startActivityForResult(r0, r9);
        if (r3 == 0) goto L_0x000f;
    L_0x010c:
        r1 = new android.content.Intent;
        r1.<init>();
        r0 = r10.H;
        r0 = r10.d(r0);
        r0 = r0.A;
        r0 = (com.whatsapp.MediaData) r0;
        r0 = r0.file;
        r0 = android.net.Uri.fromFile(r0);
        r1.setData(r0);
        r0 = com.whatsapp.App.P;
        r0 = r0.d();
        r2 = 3;
        com.whatsapp.zv.a(r1, r0, r10, r2, r10);
        if (r3 == 0) goto L_0x000f;
    L_0x0130:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.ContactPicker.class;
        r0.<init>(r10, r1);
        r1 = N;
        r2 = 85;
        r1 = r1[r2];
        r0.putExtra(r1, r7);
        r1 = 4;
        r10.startActivityForResult(r0, r1);
        if (r3 == 0) goto L_0x000f;
    L_0x0146:
        r0 = r10.H;
        r1 = r10.d(r0);
        r0 = r1.A;
        r0 = (com.whatsapp.MediaData) r0;
        r0 = r0.file;
        r0 = android.net.Uri.fromFile(r0);
        r2 = new android.content.Intent;
        r4 = N;
        r5 = 80;
        r4 = r4[r5];
        r2.<init>(r4);
        r1 = r1.j;
        switch(r1) {
            case 1: goto L_0x01c8;
            default: goto L_0x0166;
        };
    L_0x0166:
        com.whatsapp.App.a(r10, r2);
        if (r3 == 0) goto L_0x000f;
    L_0x016b:
        r10.a(r8);
        if (r3 == 0) goto L_0x000f;
    L_0x0170:
        r10.a(r7);
        if (r3 == 0) goto L_0x000f;
    L_0x0175:
        r10.showDialog(r9);
        if (r3 == 0) goto L_0x000f;
    L_0x017a:
        r10.b();
        if (r3 == 0) goto L_0x000f;
    L_0x017f:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.ContactPicker.class;
        r0.<init>(r10, r1);
        r1 = N;
        r2 = 92;
        r1 = r1[r2];
        r0.putExtra(r1, r7);
        r1 = 6;
        r10.startActivityForResult(r0, r1);
        if (r3 == 0) goto L_0x000f;
    L_0x0195:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.MediaGallery.class;
        r0.<init>(r10, r1);
        r1 = N;
        r2 = 88;
        r1 = r1[r2];
        r2 = r10.F;
        r0.putExtra(r1, r2);
        r10.startActivity(r0);
        r10.finish();
        if (r3 == 0) goto L_0x000f;
    L_0x01af:
        r0 = f();
        if (r0 == 0) goto L_0x01c3;
    L_0x01b5:
        r0 = r10.J;
        if (r0 == 0) goto L_0x01c3;
    L_0x01b9:
        r0 = new com.whatsapp.a8c;
        r0.<init>(r10);
        r10.a(r0);
        if (r3 == 0) goto L_0x000f;
    L_0x01c3:
        r10.finish();
        goto L_0x000f;
    L_0x01c8:
        r1 = N;
        r4 = 91;
        r1 = r1[r4];
        r2.setDataAndType(r0, r1);
        goto L_0x0166;
    L_0x01d2:
        r2 = r1;
        r1 = r0;
        goto L_0x0078;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.onOptionsItemSelected(com.actionbarsherlock.view.MenuItem):boolean");
    }

    static ArrayList a(MediaView mediaView, ArrayList arrayList) {
        mediaView.l = arrayList;
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.net.Uri r8, int r9, int r10, int r11) {
        /*
        r7_this = this;
        r6 = 0;
        if (r8 != 0) goto L_0x0010;
    L_0x0003:
        r1 = 1;
        r3 = 0;
        r0 = r7;
        r2 = r9;
        r4 = r10;
        r5 = r11;
        com.whatsapp.wallpaper.p.a(r0, r1, r2, r3, r4, r5);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0019;
    L_0x0010:
        r2 = -1;
        r0 = r7;
        r1 = r6;
        r3 = r8;
        r4 = r6;
        r5 = r6;
        com.whatsapp.wallpaper.p.a(r0, r1, r2, r3, r4, r5);
    L_0x0019:
        com.whatsapp.util.f.a(r7, r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.a(android.net.Uri, int, int, int):void");
    }

    static int g(MediaView mediaView, int i) {
        mediaView.k = i;
        return i;
    }

    static boolean c(MediaView mediaView) {
        return mediaView.o;
    }

    public void a() {
        App.a5();
        System.gc();
        App.a5();
    }

    static float l(MediaView mediaView) {
        return mediaView.D;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
        r10_this = this;
        r6 = com.whatsapp.App.az;
        switch(r11) {
            case 0: goto L_0x0006;
            case 1: goto L_0x003b;
            case 2: goto L_0x0106;
            case 3: goto L_0x001d;
            case 4: goto L_0x0195;
            case 5: goto L_0x01cc;
            case 6: goto L_0x01f0;
            default: goto L_0x0005;
        };
    L_0x0005:
        return;
    L_0x0006:
        r0 = -1;
        if (r12 != r0) goto L_0x0005;
    L_0x0009:
        if (r13 == 0) goto L_0x0005;
    L_0x000b:
        r0 = r13.getData();
        if (r0 == 0) goto L_0x0005;
    L_0x0011:
        r0 = r13.getData();
        r1 = -1;
        r2 = 0;
        r3 = 0;
        r10.a(r0, r1, r2, r3);
        if (r6 == 0) goto L_0x0005;
    L_0x001d:
        r0 = -1;
        if (r12 != r0) goto L_0x0032;
    L_0x0020:
        r0 = com.whatsapp.App.P;
        r0 = r0.d();
        r0 = com.whatsapp.zv.b(r0, r10);
        if (r0 == 0) goto L_0x0005;
    L_0x002c:
        r0 = 0;
        r10.showDialog(r0);
        if (r6 == 0) goto L_0x0005;
    L_0x0032:
        if (r12 != 0) goto L_0x0005;
    L_0x0034:
        if (r13 == 0) goto L_0x0005;
    L_0x0036:
        com.whatsapp.zv.a(r13, r10);
        if (r6 == 0) goto L_0x0005;
    L_0x003b:
        r0 = -1;
        if (r12 != r0) goto L_0x0005;
    L_0x003e:
        if (r13 == 0) goto L_0x0005;
    L_0x0040:
        r0 = N;
        r1 = 60;
        r0 = r0[r1];
        r0 = r13.hasExtra(r0);
        if (r0 == 0) goto L_0x0005;
    L_0x004c:
        r0 = N;
        r1 = 68;
        r0 = r0[r1];
        r0 = r13.getParcelableExtra(r0);
        r0 = (android.graphics.Bitmap) r0;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = N;
        r3 = 71;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r0.getWidth();
        r1 = r1.append(r2);
        r2 = N;
        r3 = 61;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r10.p;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r10.p;
        r2 = N;
        r3 = 63;
        r2 = r2[r3];
        r1 = android.net.Uri.withAppendedPath(r1, r2);
        if (r1 == 0) goto L_0x0005;
    L_0x0094:
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r2 = android.graphics.Bitmap.CompressFormat.JPEG;
        r3 = 100;
        r0.compress(r2, r3, r1);
        r7 = r1.toByteArray();
        r0 = r10.p;
        r8 = android.content.ContentUris.parseId(r0);
        r0 = r10.getContentResolver();
        r1 = android.provider.ContactsContract.RawContacts.CONTENT_URI;
        r2 = 1;
        r2 = new java.lang.String[r2];
        r3 = 0;
        r4 = N;
        r5 = 69;
        r4 = r4[r5];
        r2[r3] = r4;
        r3 = N;
        r4 = 57;
        r3 = r3[r4];
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r8 = java.lang.String.valueOf(r8);
        r4[r5] = r8;
        r5 = 0;
        r1 = r0.query(r1, r2, r3, r4, r5);
        r0 = 0;
    L_0x00d2:
        r2 = r1.moveToNext();
        if (r2 == 0) goto L_0x0101;
    L_0x00d8:
        r2 = 0;
        r2 = r1.getLong(r2);
        if (r0 != 0) goto L_0x00e5;
    L_0x00df:
        r0 = com.whatsapp.App.e;
        a(r0, r7, r2);
        r0 = 1;
    L_0x00e5:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = N;
        r8 = 58;
        r5 = r5[r8];
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        if (r6 == 0) goto L_0x00d2;
    L_0x0101:
        r1.close();
        if (r6 == 0) goto L_0x0005;
    L_0x0106:
        r0 = -1;
        if (r12 != r0) goto L_0x0005;
    L_0x0109:
        if (r13 == 0) goto L_0x0005;
    L_0x010b:
        r0 = r13.getData();
        r10.p = r0;
        r0 = r10.H;
        r0 = r10.d(r0);
        r0 = r0.A;
        r0 = (com.whatsapp.MediaData) r0;
        r0 = r0.file;
        r0 = android.net.Uri.fromFile(r0);
        r1 = com.whatsapp.App.p;
        r1 = r1.getResources();
        r2 = 2131361881; // 0x7f0a0059 float:1.8343527E38 double:1.0530326843E-314;
        r1 = r1.getDimension(r2);
        r1 = (int) r1;
        r2 = new android.content.Intent;
        r3 = com.whatsapp.wallpaper.CropImage.class;
        r2.<init>(r10, r3);
        r3 = N;
        r4 = 70;
        r3 = r3[r4];
        r2.putExtra(r3, r1);
        r3 = N;
        r4 = 59;
        r3 = r3[r4];
        r2.putExtra(r3, r1);
        r1 = N;
        r3 = 54;
        r1 = r1[r3];
        r3 = 1;
        r2.putExtra(r1, r3);
        r1 = N;
        r3 = 64;
        r1 = r1[r3];
        r3 = 1;
        r2.putExtra(r1, r3);
        r1 = N;
        r3 = 72;
        r1 = r1[r3];
        r3 = 1;
        r2.putExtra(r1, r3);
        r1 = N;
        r3 = 62;
        r1 = r1[r3];
        r3 = 1;
        r2.putExtra(r1, r3);
        r2.setData(r0);
        r0 = N;
        r1 = 55;
        r0 = r0[r1];
        r1 = com.whatsapp.wallpaper.p.a();
        r2.putExtra(r0, r1);
        r0 = N;
        r1 = 66;
        r0 = r0[r1];
        r1 = android.graphics.Bitmap.CompressFormat.JPEG;
        r1 = r1.toString();
        r2.putExtra(r0, r1);
        r0 = 1;
        r10.startActivityForResult(r2, r0);
        if (r6 == 0) goto L_0x0005;
    L_0x0195:
        r0 = -1;
        if (r12 != r0) goto L_0x0005;
    L_0x0198:
        if (r13 == 0) goto L_0x0005;
    L_0x019a:
        r0 = N;
        r1 = 67;
        r0 = r0[r1];
        r0 = r13.getStringExtra(r0);
        r10.G = r0;
        r1 = new android.content.Intent;
        r1.<init>();
        r0 = r10.H;
        r0 = r10.d(r0);
        r0 = r0.A;
        r0 = (com.whatsapp.MediaData) r0;
        r0 = r0.file;
        r0 = android.net.Uri.fromFile(r0);
        r1.setData(r0);
        r0 = com.whatsapp.App.P;
        r2 = r10.G;
        r0 = r0.f(r2);
        r2 = 5;
        com.whatsapp.zv.a(r1, r0, r10, r2, r10);
        if (r6 == 0) goto L_0x0005;
    L_0x01cc:
        r0 = -1;
        if (r12 != r0) goto L_0x01e7;
    L_0x01cf:
        r0 = r10.G;
        if (r0 == 0) goto L_0x01e7;
    L_0x01d3:
        r0 = com.whatsapp.App.P;
        r1 = r10.G;
        r0 = r0.f(r1);
        r0 = com.whatsapp.zv.b(r0, r10);
        if (r0 == 0) goto L_0x0005;
    L_0x01e1:
        r0 = 1;
        r10.showDialog(r0);
        if (r6 == 0) goto L_0x0005;
    L_0x01e7:
        if (r12 != 0) goto L_0x0005;
    L_0x01e9:
        if (r13 == 0) goto L_0x0005;
    L_0x01eb:
        com.whatsapp.zv.a(r13, r10);
        if (r6 == 0) goto L_0x0005;
    L_0x01f0:
        r0 = -1;
        if (r12 != r0) goto L_0x0005;
    L_0x01f3:
        if (r13 == 0) goto L_0x0005;
    L_0x01f5:
        r0 = r10.H;
        r0 = r10.d(r0);
        if (r0 == 0) goto L_0x022d;
    L_0x01fd:
        r1 = com.whatsapp.App.P;
        r2 = N;
        r3 = 56;
        r2 = r2[r3];
        r2 = r13.getStringExtra(r2);
        r1 = r1.a(r2);
        if (r1 == 0) goto L_0x021b;
    L_0x020f:
        com.whatsapp.App.b(r0, r1);
        r0 = com.whatsapp.Conversation.a(r1);
        r10.startActivity(r0);
        if (r6 == 0) goto L_0x022b;
    L_0x021b:
        r0 = N;
        r1 = 73;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r0 = 2131624462; // 0x7f0e020e float:1.8876104E38 double:1.0531624165E-314;
        r1 = 0;
        com.whatsapp.App.b(r10, r0, r1);
    L_0x022b:
        if (r6 == 0) goto L_0x0005;
    L_0x022d:
        r0 = N;
        r1 = 65;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r0 = 2131624531; // 0x7f0e0253 float:1.8876244E38 double:1.0531624506E-314;
        r1 = 0;
        com.whatsapp.App.b(r10, r0, r1);
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.onActivityResult(int, int, android.content.Intent):void");
    }

    static void b(MediaView mediaView, boolean z) {
        mediaView.b(z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r5_this = this;
        r0 = com.whatsapp.App.az;
        r1 = r5.H;
        r1 = r5.d(r1);
        r2 = new android.content.Intent;
        r3 = N;
        r4 = 2;
        r3 = r3[r4];
        r2.<init>(r3);
        r3 = r1.j;
        switch(r3) {
            case 1: goto L_0x0046;
            case 2: goto L_0x0032;
            case 3: goto L_0x003c;
            default: goto L_0x0017;
        };
    L_0x0017:
        r0 = r1.A;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = N;
        r3 = 6;
        r1 = r1[r3];
        r0 = r0.file;
        r0 = android.net.Uri.fromFile(r0);
        r2.putExtra(r1, r0);
        r0 = 0;
        r0 = android.content.Intent.createChooser(r2, r0);
        r5.startActivity(r0);
        return;
    L_0x0032:
        r3 = N;
        r4 = 4;
        r3 = r3[r4];
        r2.setType(r3);
        if (r0 == 0) goto L_0x0017;
    L_0x003c:
        r3 = N;
        r4 = 3;
        r3 = r3[r4];
        r2.setType(r3);
        if (r0 == 0) goto L_0x0017;
    L_0x0046:
        r0 = N;
        r3 = 5;
        r0 = r0[r3];
        r2.setType(r0);
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.b():void");
    }

    static void d(MediaView mediaView, int i) {
        mediaView.h(i);
    }

    static void c(MediaView mediaView, int i) {
        mediaView.c(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View b(com.whatsapp.protocol.b r13) {
        /*
        r12_this = this;
        r11 = 2131625020; // 0x7f0e043c float:1.8877236E38 double:1.053162692E-314;
        r4 = 8;
        r10 = 2;
        r2 = 1;
        r3 = 0;
        r5 = com.whatsapp.App.az;
        r0 = r13.j;
        if (r0 != r10) goto L_0x001e;
    L_0x000e:
        r0 = r12.getLayoutInflater();
        r1 = 2130903168; // 0x7f030080 float:1.7413146E38 double:1.05280605E-314;
        r6 = 0;
        r0 = r0.inflate(r1, r6);
        r0 = (android.view.ViewGroup) r0;
        if (r5 == 0) goto L_0x00bd;
    L_0x001e:
        r0 = r12.getLayoutInflater();
        r1 = 2130903170; // 0x7f030082 float:1.741315E38 double:1.052806051E-314;
        r6 = 0;
        r0 = r0.inflate(r1, r6);
        r0 = (android.view.ViewGroup) r0;
        r6 = new com.whatsapp.MediaView$15;
        r6.<init>(r12, r12);
        r0.addView(r6, r3);
        r1 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r6.setInitialFitTolerance(r1);
        r1 = r13.j;
        if (r1 != r2) goto L_0x01bd;
    L_0x003e:
        r1 = r2;
    L_0x003f:
        r6.b(r1);
        r1 = r13.j;
        r7 = 3;
        if (r1 != r7) goto L_0x01c0;
    L_0x0047:
        r1 = r2;
    L_0x0048:
        r6.setIsVideo(r1);
        r1 = r13.A;
        r1 = (com.whatsapp.MediaData) r1;
        r7 = r13.e;
        r7 = r7.b;
        if (r7 != 0) goto L_0x0066;
    L_0x0055:
        r1 = r1.transferred;
        if (r1 != 0) goto L_0x0066;
    L_0x0059:
        r1 = r13.j;
        r1 = g(r1);
        r1 = r12.getString(r1);
        com.whatsapp.App.a(r12, r1);
    L_0x0066:
        r7 = com.whatsapp.util.bo.b(r13);
        r6.a(r7);
        r1 = r12.E;
        if (r1 == 0) goto L_0x0076;
    L_0x0071:
        r1 = r12.E;
        r1.a(r13, r6);
    L_0x0076:
        r1 = r13.j;
        if (r1 != r2) goto L_0x009a;
    L_0x007a:
        if (r7 != 0) goto L_0x0090;
    L_0x007c:
        r1 = r12.getResources();
        r8 = 2130837636; // 0x7f020084 float:1.7280232E38 double:1.052773673E-314;
        r1 = r1.getDrawable(r8);
        r1 = (android.graphics.drawable.BitmapDrawable) r1;
        r1 = r1.getBitmap();
        r6.a(r1);
    L_0x0090:
        r1 = new com.whatsapp.hf;
        r1.<init>(r12);
        r6.setOnClickListener(r1);
        if (r5 == 0) goto L_0x00bd;
    L_0x009a:
        r1 = r13.j;
        r8 = 3;
        if (r1 != r8) goto L_0x00bd;
    L_0x009f:
        if (r7 != 0) goto L_0x00b5;
    L_0x00a1:
        r1 = r12.getResources();
        r7 = 2130837639; // 0x7f020087 float:1.7280238E38 double:1.0527736743E-314;
        r1 = r1.getDrawable(r7);
        r1 = (android.graphics.drawable.BitmapDrawable) r1;
        r1 = r1.getBitmap();
        r6.a(r1);
    L_0x00b5:
        r1 = new com.whatsapp.akd;
        r1.<init>(r12, r13);
        r6.setOnClickListener(r1);
    L_0x00bd:
        r1 = r0;
        r0 = 2131427715; // 0x7f0b0183 float:1.8477054E38 double:1.0530652106E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.am1.b(r0);
        r6 = r13.v;
        r6 = android.text.TextUtils.isEmpty(r6);
        if (r6 == 0) goto L_0x00d7;
    L_0x00d2:
        r0.setVisibility(r4);
        if (r5 == 0) goto L_0x00eb;
    L_0x00d7:
        r6 = r13.v;
        r7 = r12.getBaseContext();
        r8 = r0.getPaint();
        r6 = com.whatsapp.util.a5.b(r6, r7, r8);
        r0.setText(r6);
        r0.setVisibility(r3);
    L_0x00eb:
        r0 = 2131427892; // 0x7f0b0234 float:1.8477413E38 double:1.053065298E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r6 = r13.e;
        r6 = r6.b;
        if (r6 == 0) goto L_0x0118;
    L_0x00fa:
        r6 = new java.lang.Object[r10];
        r7 = 2131625135; // 0x7f0e04af float:1.887747E38 double:1.053162749E-314;
        r7 = r12.getString(r7);
        r6[r3] = r7;
        r8 = com.whatsapp.App.f(r13);
        r7 = com.whatsapp.util.bm.d(r12, r8);
        r6[r2] = r7;
        r6 = r12.getString(r11, r6);
        r0.setText(r6);
        if (r5 == 0) goto L_0x017a;
    L_0x0118:
        r6 = r13.e;
        r6 = r6.c;
        r6 = com.whatsapp.bd.b(r6);
        if (r6 == 0) goto L_0x0151;
    L_0x0122:
        r6 = r13.F;
        if (r6 == 0) goto L_0x0151;
    L_0x0126:
        r6 = com.whatsapp.App.P;
        r7 = r13.F;
        r6 = r6.a(r7);
        r6 = r6.a(r12);
        r7 = new java.lang.Object[r10];
        r8 = r12.getBaseContext();
        r6 = com.whatsapp.util.a5.d(r6, r8);
        r7[r3] = r6;
        r8 = com.whatsapp.App.f(r13);
        r6 = com.whatsapp.util.bm.d(r12, r8);
        r7[r2] = r6;
        r6 = r12.getString(r11, r7);
        r0.setText(r6);
        if (r5 == 0) goto L_0x017a;
    L_0x0151:
        r6 = com.whatsapp.App.P;
        r7 = r12.F;
        r6 = r6.a(r7);
        r6 = r6.a(r12);
        r7 = new java.lang.Object[r10];
        r8 = r12.getBaseContext();
        r6 = com.whatsapp.util.a5.d(r6, r8);
        r7[r3] = r6;
        r8 = com.whatsapp.App.f(r13);
        r6 = com.whatsapp.util.bm.d(r12, r8);
        r7[r2] = r6;
        r2 = r12.getString(r11, r7);
        r0.setText(r2);
    L_0x017a:
        r0 = 2131427893; // 0x7f0b0235 float:1.8477415E38 double:1.0530652985E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r2 = r12.F;
        r2 = com.whatsapp.bd.b(r2);
        if (r2 == 0) goto L_0x01ab;
    L_0x018b:
        r0.setVisibility(r3);
        r2 = com.whatsapp.App.P;
        r6 = r12.F;
        r2 = r2.a(r6);
        r2 = r2.a(r12);
        r6 = r12.getBaseContext();
        r7 = r0.getPaint();
        r2 = com.whatsapp.util.a5.b(r2, r6, r7);
        r0.setText(r2);
        if (r5 == 0) goto L_0x01ae;
    L_0x01ab:
        r0.setVisibility(r4);
    L_0x01ae:
        r0 = 2131427656; // 0x7f0b0148 float:1.8476934E38 double:1.0530651814E-314;
        r0 = r1.findViewById(r0);
        r2 = r12.o;
        if (r2 == 0) goto L_0x01c3;
    L_0x01b9:
        r0.setVisibility(r3);
        return r1;
    L_0x01bd:
        r1 = r3;
        goto L_0x003f;
    L_0x01c0:
        r1 = r3;
        goto L_0x0048;
    L_0x01c3:
        r3 = r4;
        goto L_0x01b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.b(com.whatsapp.protocol.b):android.view.View");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h(int r4) {
        /*
        r3_this = this;
        r0 = r3.d(r4);
        if (r0 == 0) goto L_0x0022;
    L_0x0006:
        r1 = r0.j;
        r2 = 2;
        if (r1 != r2) goto L_0x0022;
    L_0x000b:
        r1 = r3.t;
        if (r1 == 0) goto L_0x001b;
    L_0x000f:
        r1 = r3.t;
        r1 = r1.e;
        r2 = r0.e;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0025;
    L_0x001b:
        r3.a(r0);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0025;
    L_0x0022:
        r3.e();
    L_0x0025:
        r1 = r3.H;
        if (r1 == r4) goto L_0x003c;
    L_0x0029:
        r1 = r3.t;
        if (r1 == 0) goto L_0x003c;
    L_0x002d:
        r1 = r3.t;
        r1 = r1.e;
        if (r1 == 0) goto L_0x003c;
    L_0x0033:
        r1 = r3.c(r0);
        if (r1 == 0) goto L_0x003c;
    L_0x0039:
        r1.e();
    L_0x003c:
        r3.t = r0;
        r3.H = r4;
        r3.e(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.h(int):void");
    }

    static int t(MediaView mediaView) {
        return mediaView.I;
    }

    public static boolean f() {
        return VERSION.SDK_INT >= 12;
    }

    public static Intent a(b bVar, String str, Context context) {
        Intent intent = new Intent(context, MediaView.class);
        intent.putExtra(N[21], str);
        intent.putExtra(N[22], new w4(bVar.e));
        return intent;
    }

    public void finish() {
        super.finish();
        if (f() && this.J != null) {
            overridePendingTransition(0, 0);
        }
    }

    static float a(MediaView mediaView, float f) {
        mediaView.j = f;
        return f;
    }

    static MediaViewPager e(MediaView mediaView) {
        return mediaView.s;
    }

    static void b(MediaView mediaView, b bVar) {
        mediaView.a(bVar);
    }

    public static void a(ContentResolver contentResolver, byte[] bArr, long j) {
        ContentValues contentValues = new ContentValues();
        String str = N[30] + j + N[37] + N[36] + N[38] + N[29] + "'";
        Cursor query = contentResolver.query(Data.CONTENT_URI, null, str, null, null);
        int columnIndexOrThrow = query.getColumnIndexOrThrow(N[32]);
        if (query.moveToFirst()) {
            columnIndexOrThrow = query.getInt(columnIndexOrThrow);
        } else {
            columnIndexOrThrow = -1;
        }
        query.close();
        contentValues.put(N[31], Long.valueOf(j));
        contentValues.put(N[33], Integer.valueOf(1));
        contentValues.put(N[39], bArr);
        contentValues.put(N[35], N[28]);
        if (columnIndexOrThrow >= 0) {
            contentResolver.update(Data.CONTENT_URI, contentValues, N[34] + columnIndexOrThrow, null);
            if (App.az == 0) {
                return;
            }
        }
        contentResolver.insert(Data.CONTENT_URI, contentValues);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 8, 0, (int) R.string.all_media).setIcon((int) R.drawable.mviewer_button_allmedia).setShowAsAction(2);
        menu.add(0, 10, 0, (int) R.string.conversation_menu_forward).setIcon((int) R.drawable.ic_action_forward).setShowAsAction(2);
        menu.add(0, 9, 0, (int) R.string.share).setIcon((int) R.drawable.ic_action_share);
        menu.add(1, 5, 0, (int) R.string.set_as_profile_photo_wa_gallery).setIcon((int) R.drawable.ic_menu_contact);
        menu.add(1, 6, 0, (int) R.string.set_as_group_icon_wa_gallery).setIcon((int) R.drawable.ic_menu_group);
        menu.add(1, 0, 0, (int) R.string.assign_to_contact).setIcon((int) R.drawable.ic_menu_contact);
        menu.add(1, 1, 0, (int) R.string.use_as_wallpaper).setIcon((int) R.drawable.ic_menu_wallpaper);
        menu.add(1, 2, 0, (int) R.string.view_in_gallery).setIcon((int) R.drawable.ic_menu_media);
        menu.add(1, 3, 0, (int) R.string.rotate_left).setIcon((int) R.drawable.ic_menu_rotate_left);
        menu.add(1, 4, 0, (int) R.string.rotate_right).setIcon((int) R.drawable.ic_menu_rotate_right);
        menu.add(0, 7, 0, (int) R.string.delete).setIcon((int) R.drawable.ic_menu_delete);
        return true;
    }

    static m f(MediaView mediaView) {
        return mediaView.y;
    }

    public void onResume() {
        super.onResume();
        b(true);
    }

    static View c(MediaView mediaView, b bVar) {
        return mediaView.b(bVar);
    }

    static int g(MediaView mediaView) {
        return mediaView.k;
    }

    public MediaView() {
        this.A = 0;
        this.o = true;
        this.m = 1280;
        this.C = new a_c(this);
        this.n = new a8y(this);
    }

    protected void onStop() {
        super.onStop();
        e();
        b(true);
        Log.i(N[1]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r11) {
        /*
        r10_this = this;
        r3 = 8;
        r2 = 6;
        r4 = 3;
        r5 = 1;
        r6 = com.whatsapp.App.az;
        r0 = r10.H;	 Catch:{ IOException -> 0x00b0 }
        r7 = r10.d(r0);	 Catch:{ IOException -> 0x00b0 }
        r0 = r7.A;	 Catch:{ IOException -> 0x00b0 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IOException -> 0x00b0 }
        r8 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x00b0 }
        r1 = r0.file;	 Catch:{ IOException -> 0x00b0 }
        r1 = r1.getAbsolutePath();	 Catch:{ IOException -> 0x00b0 }
        r8.<init>(r1);	 Catch:{ IOException -> 0x00b0 }
        r1 = N;	 Catch:{ IOException -> 0x00b0 }
        r9 = 78;
        r1 = r1[r9];	 Catch:{ IOException -> 0x00b0 }
        r9 = 1;
        r1 = r8.getAttributeInt(r1, r9);	 Catch:{ IOException -> 0x00b0 }
        switch(r1) {
            case 0: goto L_0x008b;
            case 1: goto L_0x008b;
            case 2: goto L_0x002a;
            case 3: goto L_0x0095;
            case 4: goto L_0x002a;
            case 5: goto L_0x002a;
            case 6: goto L_0x0090;
            case 7: goto L_0x002a;
            case 8: goto L_0x0099;
            default: goto L_0x002a;
        };	 Catch:{ IOException -> 0x00b0 }
    L_0x002a:
        r2 = N;	 Catch:{ IOException -> 0x00b0 }
        r3 = 74;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00b0 }
        r1 = java.lang.Integer.toString(r1);	 Catch:{ IOException -> 0x00b0 }
        r8.setAttribute(r2, r1);	 Catch:{ IOException -> 0x00b0 }
        r8.saveAttributes();	 Catch:{ IOException -> 0x00b0 }
        r1 = r0.file;	 Catch:{ OutOfMemoryError -> 0x00a5, bx -> 0x00bb }
        r1 = android.net.Uri.fromFile(r1);	 Catch:{ OutOfMemoryError -> 0x00a5, bx -> 0x00bb }
        r2 = 100;
        r3 = 100;
        r1 = com.whatsapp.util.f.a(r1, r2, r3);	 Catch:{ OutOfMemoryError -> 0x00a5, bx -> 0x00bb }
        r2 = new java.io.ByteArrayOutputStream;	 Catch:{ OutOfMemoryError -> 0x00a5, bx -> 0x00bb }
        r2.<init>();	 Catch:{ OutOfMemoryError -> 0x00a5, bx -> 0x00bb }
        r3 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ OutOfMemoryError -> 0x00a5, bx -> 0x00bb }
        r4 = 80;
        r1.compress(r3, r4, r2);	 Catch:{ OutOfMemoryError -> 0x00a5, bx -> 0x00bb }
        r2 = r2.toByteArray();	 Catch:{ OutOfMemoryError -> 0x00a5, bx -> 0x00bb }
        r7.b(r2);	 Catch:{ OutOfMemoryError -> 0x00a5, bx -> 0x00bb }
        r1.recycle();	 Catch:{ OutOfMemoryError -> 0x00a5, bx -> 0x00bb }
    L_0x005e:
        r1 = r0.file;	 Catch:{ IOException -> 0x00b0 }
        r2 = r1.length();	 Catch:{ IOException -> 0x00b0 }
        r0.fileSize = r2;	 Catch:{ IOException -> 0x00b0 }
        r1 = 0;
        r0.faceX = r1;	 Catch:{ IOException -> 0x00b0 }
        r1 = 0;
        r0.faceY = r1;	 Catch:{ IOException -> 0x00b0 }
        com.whatsapp.util.bo.a(r7);	 Catch:{ IOException -> 0x00b0 }
        r0 = com.whatsapp.App.aJ;	 Catch:{ IOException -> 0x00b0 }
        r0.a(r7);	 Catch:{ IOException -> 0x00b0 }
        r0 = r10.c(r7);	 Catch:{ IOException -> 0x00b0 }
        if (r0 == 0) goto L_0x008a;
    L_0x007a:
        if (r11 == 0) goto L_0x0081;
    L_0x007c:
        r0.d();	 Catch:{ OutOfMemoryError -> 0x00c6 }
        if (r6 == 0) goto L_0x0084;
    L_0x0081:
        r0.c();	 Catch:{ OutOfMemoryError -> 0x00c8 }
    L_0x0084:
        r0.requestLayout();	 Catch:{ IOException -> 0x00b0 }
        r0.invalidate();	 Catch:{ IOException -> 0x00b0 }
    L_0x008a:
        return;
    L_0x008b:
        if (r11 == 0) goto L_0x009d;
    L_0x008d:
        r1 = r2;
    L_0x008e:
        if (r6 == 0) goto L_0x002a;
    L_0x0090:
        if (r11 == 0) goto L_0x009f;
    L_0x0092:
        r1 = r4;
    L_0x0093:
        if (r6 == 0) goto L_0x002a;
    L_0x0095:
        if (r11 == 0) goto L_0x00a1;
    L_0x0097:
        if (r6 == 0) goto L_0x00ca;
    L_0x0099:
        if (r11 == 0) goto L_0x00a3;
    L_0x009b:
        r1 = r5;
        goto L_0x002a;
    L_0x009d:
        r1 = r3;
        goto L_0x008e;
    L_0x009f:
        r1 = r5;
        goto L_0x0093;
    L_0x00a1:
        r3 = r2;
        goto L_0x0097;
    L_0x00a3:
        r5 = r4;
        goto L_0x009b;
    L_0x00a5:
        r1 = move-exception;
        r2 = N;	 Catch:{ IOException -> 0x00b0 }
        r3 = 77;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00b0 }
        com.whatsapp.util.Log.b(r2, r1);	 Catch:{ IOException -> 0x00b0 }
        goto L_0x005e;
    L_0x00b0:
        r0 = move-exception;
        r1 = N;
        r2 = 75;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x008a;
    L_0x00bb:
        r1 = move-exception;
        r2 = N;	 Catch:{ IOException -> 0x00b0 }
        r3 = 76;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00b0 }
        com.whatsapp.util.Log.b(r2, r1);	 Catch:{ IOException -> 0x00b0 }
        goto L_0x005e;
    L_0x00c6:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x00c8 }
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00b0 }
    L_0x00ca:
        r1 = r3;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaView.a(boolean):void");
    }

    protected Dialog onCreateDialog(int i) {
        boolean z = true;
        Dialog progressDialog;
        switch (i) {
            case PBE.MD5 /*0*/:
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.updating_profile_photo_dialog_title));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case ay.f /*1*/:
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.updating_group_icon_dialog_title));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case ay.n /*2*/:
                b d = d(this.H);
                Collection arrayList = new ArrayList();
                arrayList.add(d);
                if (this.H != this.l.size() - 1) {
                    z = false;
                }
                return uw.a(this, arrayList, this.F, 2, new akn(this, d, z));
            default:
                return super.onCreateDialog(i);
        }
    }

    static void a(MediaView mediaView, b bVar, int i) {
        mediaView.a(bVar, i);
    }

    protected void onPause() {
        super.onPause();
        if (isFinishing() && this.z != null) {
            this.z.a();
            this.z = null;
        }
    }

    static int b(MediaView mediaView, int i) {
        mediaView.M = i;
        return i;
    }

    private void c(int i) {
        e();
        if (i == 1) {
            if (this.H > 0) {
                this.H--;
                this.s.setCurrentItem(this.H);
                if (App.az == 0) {
                    return;
                }
            }
            return;
        }
        if (this.H < this.l.size() - 1) {
            this.H++;
            this.s.setCurrentItem(this.H);
        }
    }

    static void i(MediaView mediaView) {
        mediaView.d();
    }

    static float b(MediaView mediaView, float f) {
        mediaView.D = f;
        return f;
    }

    static String r(MediaView mediaView) {
        return mediaView.G;
    }

    static b i(MediaView mediaView, int i) {
        return mediaView.d(i);
    }

    static int j(MediaView mediaView) {
        return mediaView.H;
    }

    static PhotoView a(MediaView mediaView, b bVar) {
        return mediaView.c(bVar);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean z;
        MenuItem findItem;
        MenuItem findItem2;
        boolean z2 = false;
        if (this.s != null) {
            b d = d(this.s.getCurrentItem());
            if (d != null && d.j == (byte) 1) {
                z = true;
                menu.setGroupVisible(1, z);
                findItem = menu.findItem(7);
                if (this.s == null) {
                    z = true;
                } else {
                    z = false;
                }
                findItem.setVisible(z);
                findItem = menu.findItem(9);
                if (this.s == null) {
                    z = true;
                } else {
                    z = false;
                }
                findItem.setVisible(z);
                findItem = menu.findItem(10);
                if (this.s == null) {
                    z = true;
                } else {
                    z = false;
                }
                findItem.setVisible(z);
                findItem2 = menu.findItem(8);
                if (this.s != null) {
                    z2 = true;
                }
                findItem2.setVisible(z2);
                return true;
            }
        }
        z = false;
        menu.setGroupVisible(1, z);
        findItem = menu.findItem(7);
        if (this.s == null) {
            z = false;
        } else {
            z = true;
        }
        findItem.setVisible(z);
        findItem = menu.findItem(9);
        if (this.s == null) {
            z = false;
        } else {
            z = true;
        }
        findItem.setVisible(z);
        findItem = menu.findItem(10);
        if (this.s == null) {
            z = false;
        } else {
            z = true;
        }
        findItem.setVisible(z);
        findItem2 = menu.findItem(8);
        if (this.s != null) {
            z2 = true;
        }
        findItem2.setVisible(z2);
        return true;
    }

    public void onDestroy() {
        int i = App.az;
        Log.i(N[50]);
        if (this.s != null) {
            int i2 = 0;
            while (i2 < this.s.getChildCount()) {
                View childAt = this.s.getChildAt(i2);
                if (childAt instanceof PhotoView) {
                    ((PhotoView) childAt).f();
                }
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
        }
        if (this.E != null) {
            this.E.interrupt();
            this.E = null;
        }
        if (this.z != null) {
            this.z.a();
            this.z = null;
        }
        this.t = null;
        if (this.F != null) {
            bo.a(this.F);
        }
        App.a(this.C);
        App.a5();
        super.onDestroy();
    }

    static int f(MediaView mediaView, int i) {
        mediaView.H = i;
        return i;
    }

    private void d() {
        if (f()) {
            this.w = getResources().getConfiguration().orientation;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.L, N[53], new int[]{0, 255});
            ofInt.setDuration(240);
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.start();
            View view = this.s;
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(this.j);
            view.setScaleY(this.D);
            view.setTranslationX((float) this.M);
            view.setTranslationY((float) this.k);
            View findViewWithTag = this.s.findViewWithTag(this.J.e);
            if (findViewWithTag != null) {
                findViewWithTag.setAlpha(0.0f);
                findViewWithTag.animate().setDuration(120).alpha(1.0f).setInterpolator(new DecelerateInterpolator(2.0f));
            }
            view.animate().setDuration(240).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setListener(new yx(this));
        }
    }

    static float n(MediaView mediaView) {
        return mediaView.j;
    }

    static void d(MediaView mediaView) {
        mediaView.e();
    }

    private void f(int i) {
        b d = d(this.H);
        if (d != null) {
            a(d, i);
        }
    }

    static int a(MediaView mediaView, int i) {
        mediaView.I = i;
        return i;
    }

    private void e(int i) {
        if (d(i) != null) {
            getSupportActionBar().setTitle(getString(R.string.media_view_x_of_y, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(this.l.size())}));
            invalidateOptionsMenu();
        }
    }

    static SeekBar k(MediaView mediaView) {
        return mediaView.K;
    }

    static int s(MediaView mediaView) {
        return mediaView.M;
    }

    static Handler m(MediaView mediaView) {
        return mediaView.v;
    }

    private b d(int i) {
        int size = this.l.size();
        return i < size ? (b) this.l.get((size - i) - 1) : null;
    }

    public void onBackPressed() {
        if (f() && this.J != null) {
            if (this.E != null) {
                this.E.interrupt();
                this.E = null;
            }
            if (this.z != null) {
                this.z.a();
                this.z = null;
            }
            a(new as9(this));
            if (App.az == 0) {
                return;
            }
        }
        super.onBackPressed();
    }

    static ArrayList u(MediaView mediaView) {
        return mediaView.l;
    }
}
