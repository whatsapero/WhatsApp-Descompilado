package android.support.v4.app;

import android.support.v4.app.BackStackRecord.TransitionState;
import android.support.v4.app.FragmentManager.BackStackEntry;
import android.support.v4.app.FragmentTransitionCompat21.EpicenterView;
import android.support.v4.app.FragmentTransitionCompat21.ViewRetriever;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.whatsapp.vk;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class BackStackRecord extends FragmentTransaction implements BackStackEntry, Runnable {
    private static final String[] z;
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack;
    int mBreadCrumbShortTitleRes;
    CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    CharSequence mBreadCrumbTitleText;
    boolean mCommitted;
    int mEnterAnim;
    int mExitAnim;
    Op mHead;
    int mIndex;
    final FragmentManagerImpl mManager;
    String mName;
    int mNumOp;
    int mPopEnterAnim;
    int mPopExitAnim;
    ArrayList mSharedElementSourceNames;
    ArrayList mSharedElementTargetNames;
    Op mTail;
    int mTransition;
    int mTransitionStyle;

    class AnonymousClass_1 implements ViewRetriever {
        final BackStackRecord this$0;
        final Fragment val$inFragment;

        public View getView() {
            return this.val$inFragment.getView();
        }

        AnonymousClass_1(BackStackRecord backStackRecord, Fragment fragment) {
            this.this$0 = backStackRecord;
            this.val$inFragment = fragment;
        }
    }

    class AnonymousClass_2 implements OnPreDrawListener {
        final BackStackRecord this$0;
        final Fragment val$inFragment;
        final boolean val$isBack;
        final Fragment val$outFragment;
        final View val$sceneRoot;
        final ArrayList val$sharedElementTargets;
        final Object val$sharedElementTransition;
        final TransitionState val$state;

        AnonymousClass_2(BackStackRecord backStackRecord, View view, Object obj, ArrayList arrayList, TransitionState transitionState, boolean z, Fragment fragment, Fragment fragment2) {
            this.this$0 = backStackRecord;
            this.val$sceneRoot = view;
            this.val$sharedElementTransition = obj;
            this.val$sharedElementTargets = arrayList;
            this.val$state = transitionState;
            this.val$isBack = z;
            this.val$inFragment = fragment;
            this.val$outFragment = fragment2;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPreDraw() {
            /*
            r6_this = this;
            r0 = r6.val$sceneRoot;
            r0 = r0.getViewTreeObserver();
            r0.removeOnPreDrawListener(r6);
            r0 = r6.val$sharedElementTransition;
            if (r0 == 0) goto L_0x005c;
        L_0x000d:
            r0 = r6.val$sharedElementTransition;
            r1 = r6.val$sharedElementTargets;
            android.support.v4.app.FragmentTransitionCompat21.removeTargets(r0, r1);
            r0 = r6.val$sharedElementTargets;
            r0.clear();
            r0 = r6.this$0;
            r1 = r6.val$state;
            r2 = r6.val$isBack;
            r3 = r6.val$inFragment;
            r5 = android.support.v4.app.BackStackRecord.access$000(r0, r1, r2, r3);
            r0 = r5.isEmpty();
            if (r0 == 0) goto L_0x0038;
        L_0x002b:
            r0 = r6.val$sharedElementTargets;
            r1 = r6.val$state;
            r1 = r1.nonExistentView;
            r0.add(r1);
            r0 = android.support.v4.app.FragmentActivity.a;
            if (r0 == 0) goto L_0x0041;
        L_0x0038:
            r0 = r6.val$sharedElementTargets;
            r1 = r5.values();
            r0.addAll(r1);
        L_0x0041:
            r0 = r6.val$sharedElementTransition;
            r1 = r6.val$sharedElementTargets;
            android.support.v4.app.FragmentTransitionCompat21.addTargets(r0, r1);
            r0 = r6.this$0;
            r1 = r6.val$state;
            android.support.v4.app.BackStackRecord.access$100(r0, r5, r1);
            r0 = r6.this$0;
            r1 = r6.val$state;
            r2 = r6.val$inFragment;
            r3 = r6.val$outFragment;
            r4 = r6.val$isBack;
            android.support.v4.app.BackStackRecord.access$200(r0, r1, r2, r3, r4, r5);
        L_0x005c:
            r0 = 1;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.AnonymousClass_2.onPreDraw():boolean");
        }
    }

    class AnonymousClass_3 implements OnPreDrawListener {
        final BackStackRecord this$0;
        final int val$containerId;
        final View val$sceneRoot;
        final TransitionState val$state;
        final Object val$transition;

        AnonymousClass_3(BackStackRecord backStackRecord, View view, TransitionState transitionState, int i, Object obj) {
            this.this$0 = backStackRecord;
            this.val$sceneRoot = view;
            this.val$state = transitionState;
            this.val$containerId = i;
            this.val$transition = obj;
        }

        public boolean onPreDraw() {
            this.val$sceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
            BackStackRecord.access$300(this.this$0, this.val$state, this.val$containerId, this.val$transition);
            return true;
        }
    }

    final class Op {
        int cmd;
        int enterAnim;
        int exitAnim;
        Fragment fragment;
        Op next;
        int popEnterAnim;
        int popExitAnim;
        Op prev;
        ArrayList removed;

        Op() {
        }
    }

    public class TransitionState {
        public EpicenterView enteringEpicenterView;
        public ArrayList hiddenFragmentViews;
        public ArrayMap nameOverrides;
        public View nonExistentView;
        final BackStackRecord this$0;

        public TransitionState(BackStackRecord backStackRecord) {
            this.this$0 = backStackRecord;
            this.nameOverrides = new ArrayMap();
            this.hiddenFragmentViews = new ArrayList();
            this.enteringEpicenterView = new EpicenterView();
        }
    }

    static {
        String[] strArr = new String[72];
        String str = "\u0007\u001a";
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
                        i3 = 39;
                        break;
                    case ay.f /*1*/:
                        i3 = 57;
                        break;
                    case ay.n /*2*/:
                        i3 = 88;
                        break;
                    case ay.p /*3*/:
                        i3 = 65;
                        break;
                    default:
                        i3 = 62;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "eL51\u001eI\\+5WI^x.X\u0007";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0007M7a";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "eL51\u001eI\\+5WI^x(P\u0007";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0007[!a";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "aK9&SBW,\f_IX?$L";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "eL51\u001eI\\+5WI^x.X\u0007";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0007M7a";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "aK9&SBW,\f_IX?$L";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "aK9&SBW,\f_IX?$L";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0007M7a";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "F]<\u0015QeX;*mSX;*\u0016\u000e\u0019; RK\\<a_AM=3\u001eDV5,WS\u0011q";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "aK9&SBW,\f_IX?$L";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "eL51\u001eI\\+5WI^x.X\u0007";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "rW3/QPWx\"SC\u0003x";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "aK9&SBW,\f_IX?$L";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "uL6{\u001e";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "aK9&SBW,\f_IX?$L";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "hi\u0007\u0013{wu\u0019\u0002{\u001d\u00199%ZNW?|";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0007V4%\u0003";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u001d\u0019";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0007T\u0011/ZBAe";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "Jm* PTP,(QI\u0004{";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u001d\u0019";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0007T\u001a3[F]\u001b3KJ[\f(JK\\\f$FS\u0004";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0007T\u001a3[F]\u001b3KJ[\u000b)QUM\f(JK\\\f$FS\u0004";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "Jw9,[\u001a";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "il\u0014\r";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "Ji71{IM=3\u007fIP5|\u001d";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "J{*$_Cz*4SEm15RBk=2\u0003\u0004";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0007\\ (JfW1,\u0003\u0004";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0007T\f3_IJ15WHW\u000b5GK\\eb";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "tq\u0017\u0016";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "u|\b\r\u007fd|";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "u|\u0015\u000ehb";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "op\u001c\u0004";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0007\u0019\u00171\u001e\u0004";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "J|65[Ux6(S\u001a\u001a";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    str = "fm\f\u0000}o";
                    obj = 38;
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    strArr2 = strArr3;
                    str = "\u0007\u0019{";
                    obj = 39;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0007T\b.NbA15\u007fIP5|\u001d";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "u\\5.HB]b";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "J{*$_Cz*4SEj0.LSm15RBk=2\u0003\u0004";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0007T\u001d9WSx6(S\u001a\u001a";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0007\u0019xa";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u0007T\u001b.SJP,5[C\u0004";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "c|\f\u0000}o";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "DT<|";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "f}\u001c";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "u\\5.HB]ba";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "hI=3_SP7/M\u001d";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "BW,$LfW1,\u0003\u0004";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "WV(\u0004PS\\*\u0000PNTeb";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0007I71{_P,\u0000PNTeb";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "dX6fJ\u0007Z0 P@\\x5_@\u00197'\u001eAK9&SBW,a";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0007W76\u001e";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    str = "dX6fJ\u0007Z0 P@\\x\"QIM9(PBKx\bz\u0007V>aXUX?,[IMx";
                    obj = 56;
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    strArr2 = strArr3;
                    str = "\u001d\u0019/ M\u0007";
                    obj = 57;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\u001d\u0019/ M\u0007";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0007W76\u001e";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u0007\u0019";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    str = "rW3/QPWx\"SC\u0003x";
                    obj = 61;
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    strArr2 = strArr3;
                    str = "aK9&SBW,\f_IX?$L";
                    obj = 62;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "WV(\u0007LHT\u001a ]Lj, ]L\u0003x";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    str = "aK9&SBW,\f_IX?$L";
                    obj = 64;
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    strArr2 = strArr3;
                    str = "DV5,WS\u00199-LBX<8\u001eDX4-[C";
                    obj = 65;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "aK9&SBW,\f_IX?$L";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "dV5,WS\u0003x";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    i = 69;
                    str = "\u0007\u0019";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i] = str;
                    i = 70;
                    str = "aK9&SBW,\f_IX?$L";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i] = str;
                    i = 71;
                    str = "sQ12\u001eSK9/MFZ,(QI\u001912\u001eFU*$_C@x#[NW?a_C]=%\u001eSVx5VB\u0019: ]L\u0019+5_DR";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "eX;*mSX;*{IM*8E";
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v4.app.BackStackRecord.TransitionState popFromBackStack(boolean r12, android.support.v4.app.BackStackRecord.TransitionState r13, android.util.SparseArray r14, android.util.SparseArray r15) {
        /*
        r11_this = this;
        r8 = android.support.v4.app.FragmentActivity.a;
        r0 = android.support.v4.app.FragmentManagerImpl.DEBUG;
        if (r0 == 0) goto L_0x0041;
    L_0x0006:
        r0 = z;
        r1 = 65;
        r0 = r0[r1];
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 64;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
        r0 = new android.support.v4.util.LogWriter;
        r1 = z;
        r2 = 63;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = new java.io.PrintWriter;
        r1.<init>(r0);
        r0 = z;
        r2 = 61;
        r0 = r0[r2];
        r2 = 0;
        r3 = 0;
        r11.dump(r0, r2, r1, r3);
    L_0x0041:
        if (r13 != 0) goto L_0x0171;
    L_0x0043:
        r0 = r14.size();	 Catch:{ IllegalStateException -> 0x009e }
        if (r0 != 0) goto L_0x004f;
    L_0x0049:
        r0 = r15.size();	 Catch:{ IllegalStateException -> 0x009e }
        if (r0 == 0) goto L_0x016e;
    L_0x004f:
        r0 = 1;
        r6 = r11.beginTransition(r14, r15, r0);
        if (r8 == 0) goto L_0x005f;
    L_0x0056:
        if (r12 != 0) goto L_0x005f;
    L_0x0058:
        r0 = r11.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x00a0 }
        r1 = r11.mSharedElementSourceNames;	 Catch:{ IllegalStateException -> 0x00a0 }
        setNameOverrides(r6, r0, r1);	 Catch:{ IllegalStateException -> 0x00a0 }
    L_0x005f:
        r0 = -1;
        r11.bumpBackStackNesting(r0);	 Catch:{ IllegalStateException -> 0x00a2 }
        if (r6 == 0) goto L_0x00a4;
    L_0x0065:
        r0 = 0;
        r1 = r0;
    L_0x0067:
        if (r6 == 0) goto L_0x00a8;
    L_0x0069:
        r0 = 0;
        r2 = r0;
    L_0x006b:
        r0 = r11.mTail;
        r7 = r0;
    L_0x006e:
        if (r7 == 0) goto L_0x0142;
    L_0x0070:
        if (r6 == 0) goto L_0x00ac;
    L_0x0072:
        r0 = 0;
        r3 = r0;
    L_0x0074:
        if (r6 == 0) goto L_0x00b0;
    L_0x0076:
        r0 = 0;
        r4 = r0;
    L_0x0078:
        r0 = r7.cmd;
        switch(r0) {
            case 1: goto L_0x00b4;
            case 2: goto L_0x00c3;
            case 3: goto L_0x00f6;
            case 4: goto L_0x0102;
            case 5: goto L_0x0111;
            case 6: goto L_0x0120;
            case 7: goto L_0x012f;
            default: goto L_0x007d;
        };
    L_0x007d:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x009c }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x009c }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x009c }
        r2 = z;	 Catch:{ IllegalStateException -> 0x009c }
        r3 = 62;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x009c }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x009c }
        r2 = r7.cmd;	 Catch:{ IllegalStateException -> 0x009c }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x009c }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x009c }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x009c }
        throw r0;	 Catch:{ IllegalStateException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r0 = move-exception;
        throw r0;
    L_0x00a0:
        r0 = move-exception;
        throw r0;
    L_0x00a2:
        r0 = move-exception;
        throw r0;
    L_0x00a4:
        r0 = r11.mTransitionStyle;
        r1 = r0;
        goto L_0x0067;
    L_0x00a8:
        r0 = r11.mTransition;
        r2 = r0;
        goto L_0x006b;
    L_0x00ac:
        r0 = r7.popEnterAnim;
        r3 = r0;
        goto L_0x0074;
    L_0x00b0:
        r0 = r7.popExitAnim;
        r4 = r0;
        goto L_0x0078;
    L_0x00b4:
        r0 = r7.fragment;
        r0.mNextAnim = r4;
        r5 = r11.mManager;
        r9 = android.support.v4.app.FragmentManagerImpl.reverseTransit(r2);
        r5.removeFragment(r0, r9, r1);
        if (r8 == 0) goto L_0x013e;
    L_0x00c3:
        r0 = r7.fragment;
        if (r0 == 0) goto L_0x00d2;
    L_0x00c7:
        r0.mNextAnim = r4;	 Catch:{ IllegalStateException -> 0x0162 }
        r5 = r11.mManager;	 Catch:{ IllegalStateException -> 0x0162 }
        r9 = android.support.v4.app.FragmentManagerImpl.reverseTransit(r2);	 Catch:{ IllegalStateException -> 0x0162 }
        r5.removeFragment(r0, r9, r1);	 Catch:{ IllegalStateException -> 0x0162 }
    L_0x00d2:
        r0 = r7.removed;
        if (r0 == 0) goto L_0x00f4;
    L_0x00d6:
        r0 = 0;
        r5 = r0;
    L_0x00d8:
        r0 = r7.removed;
        r0 = r0.size();
        if (r5 >= r0) goto L_0x00f4;
    L_0x00e0:
        r0 = r7.removed;
        r0 = r0.get(r5);
        r0 = (android.support.v4.app.Fragment) r0;
        r0.mNextAnim = r3;
        r9 = r11.mManager;
        r10 = 0;
        r9.addFragment(r0, r10);
        r0 = r5 + 1;
        if (r8 == 0) goto L_0x016b;
    L_0x00f4:
        if (r8 == 0) goto L_0x013e;
    L_0x00f6:
        r0 = r7.fragment;
        r0.mNextAnim = r3;
        r5 = r11.mManager;
        r9 = 0;
        r5.addFragment(r0, r9);
        if (r8 == 0) goto L_0x013e;
    L_0x0102:
        r0 = r7.fragment;
        r0.mNextAnim = r3;
        r5 = r11.mManager;
        r9 = android.support.v4.app.FragmentManagerImpl.reverseTransit(r2);
        r5.showFragment(r0, r9, r1);
        if (r8 == 0) goto L_0x013e;
    L_0x0111:
        r0 = r7.fragment;
        r0.mNextAnim = r4;
        r4 = r11.mManager;
        r5 = android.support.v4.app.FragmentManagerImpl.reverseTransit(r2);
        r4.hideFragment(r0, r5, r1);
        if (r8 == 0) goto L_0x013e;
    L_0x0120:
        r0 = r7.fragment;
        r0.mNextAnim = r3;
        r4 = r11.mManager;
        r5 = android.support.v4.app.FragmentManagerImpl.reverseTransit(r2);
        r4.attachFragment(r0, r5, r1);
        if (r8 == 0) goto L_0x013e;
    L_0x012f:
        r0 = r7.fragment;
        r0.mNextAnim = r3;	 Catch:{ IllegalStateException -> 0x009c }
        r3 = r11.mManager;	 Catch:{ IllegalStateException -> 0x009c }
        r4 = android.support.v4.app.FragmentManagerImpl.reverseTransit(r2);	 Catch:{ IllegalStateException -> 0x009c }
        r3.detachFragment(r0, r4, r1);	 Catch:{ IllegalStateException -> 0x009c }
        if (r8 != 0) goto L_0x007d;
    L_0x013e:
        r0 = r7.prev;
        if (r8 == 0) goto L_0x0168;
    L_0x0142:
        if (r12 == 0) goto L_0x0166;
    L_0x0144:
        r0 = r11.mManager;
        r3 = r11.mManager;
        r3 = r3.mCurState;
        r2 = android.support.v4.app.FragmentManagerImpl.reverseTransit(r2);
        r4 = 1;
        r0.moveToState(r3, r2, r1, r4);
        r0 = 0;
    L_0x0153:
        r1 = r11.mIndex;	 Catch:{ IllegalStateException -> 0x0164 }
        if (r1 < 0) goto L_0x0161;
    L_0x0157:
        r1 = r11.mManager;	 Catch:{ IllegalStateException -> 0x0164 }
        r2 = r11.mIndex;	 Catch:{ IllegalStateException -> 0x0164 }
        r1.freeBackStackIndex(r2);	 Catch:{ IllegalStateException -> 0x0164 }
        r1 = -1;
        r11.mIndex = r1;	 Catch:{ IllegalStateException -> 0x0164 }
    L_0x0161:
        return r0;
    L_0x0162:
        r0 = move-exception;
        throw r0;
    L_0x0164:
        r0 = move-exception;
        throw r0;
    L_0x0166:
        r0 = r6;
        goto L_0x0153;
    L_0x0168:
        r7 = r0;
        goto L_0x006e;
    L_0x016b:
        r5 = r0;
        goto L_0x00d8;
    L_0x016e:
        r6 = r13;
        goto L_0x005f;
    L_0x0171:
        r6 = r13;
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.popFromBackStack(boolean, android.support.v4.app.BackStackRecord$TransitionState, android.util.SparseArray, android.util.SparseArray):android.support.v4.app.BackStackRecord$TransitionState");
    }

    private static Object getExitTransition(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        Object returnTransition;
        if (z) {
            try {
                returnTransition = fragment.getReturnTransition();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        returnTransition = fragment.getExitTransition();
        return FragmentTransitionCompat21.cloneTransition(returnTransition);
    }

    private TransitionState beginTransition(SparseArray sparseArray, SparseArray sparseArray2, boolean z) {
        int i;
        int i2 = 0;
        boolean z2 = FragmentActivity.a;
        TransitionState transitionState = new TransitionState(this);
        transitionState.nonExistentView = new View(this.mManager.mActivity);
        int i3 = 0;
        int i4 = 0;
        while (i3 < sparseArray.size()) {
            if (configureTransitions(sparseArray.keyAt(i3), transitionState, z, sparseArray, sparseArray2)) {
                i = 1;
            } else {
                i = i4;
            }
            int i5 = i3 + 1;
            if (z2) {
                break;
            }
            i3 = i5;
            i4 = i;
        }
        i = i4;
        i3 = i;
        while (i2 < sparseArray2.size()) {
            i = sparseArray2.keyAt(i2);
            try {
                if (sparseArray.get(i) == null && configureTransitions(i, transitionState, z, sparseArray, sparseArray2)) {
                    i = 1;
                } else {
                    i = i3;
                }
                i2++;
                if (z2) {
                    break;
                }
                i3 = i;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        i = i3;
        return i == 0 ? null : transitionState;
    }

    private void callSharedElementEnd(TransitionState transitionState, Fragment fragment, Fragment fragment2, boolean z, ArrayMap arrayMap) {
        if (z) {
            try {
                SharedElementCallback sharedElementCallback = fragment2.mEnterTransitionCallback;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        sharedElementCallback = fragment.mEnterTransitionCallback;
        if (sharedElementCallback != null) {
            sharedElementCallback.onSharedElementEnd(new ArrayList(arrayMap.keySet()), new ArrayList(arrayMap.values()), null);
        }
    }

    static ArrayMap access$000(BackStackRecord backStackRecord, TransitionState transitionState, boolean z, Fragment fragment) {
        return backStackRecord.mapSharedElementsIn(transitionState, z, fragment);
    }

    private static void setNameOverrides(TransitionState transitionState, ArrayList arrayList, ArrayList arrayList2) {
        boolean z = FragmentActivity.a;
        if (arrayList != null) {
            int i = 0;
            while (i < arrayList.size()) {
                setNameOverride(transitionState.nameOverrides, (String) arrayList.get(i), (String) arrayList2.get(i));
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public FragmentTransaction add(Fragment fragment, String str) {
        doAddOp(0, fragment, str, 1);
        return this;
    }

    public int commitAllowingStateLoss() {
        return commitInternal(true);
    }

    private static ArrayMap remapNames(ArrayList arrayList, ArrayList arrayList2, ArrayMap arrayMap) {
        boolean z = FragmentActivity.a;
        try {
            if (arrayMap.isEmpty()) {
                return arrayMap;
            }
            ArrayMap arrayMap2 = new ArrayMap();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                View view = (View) arrayMap.get(arrayList.get(i));
                if (view != null) {
                    try {
                        arrayMap2.put(arrayList2.get(i), view);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
            return arrayMap2;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void prepareSharedElementTransition(TransitionState transitionState, View view, Object obj, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList) {
        view.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass_2(this, view, obj, arrayList, transitionState, z, fragment, fragment2));
    }

    private void setLastIn(SparseArray sparseArray, Fragment fragment) {
        if (fragment != null) {
            int i = fragment.mContainerId;
            if (i != 0) {
                try {
                    sparseArray.put(i, fragment);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean configureTransitions(int r33, android.support.v4.app.BackStackRecord.TransitionState r34, boolean r35, android.util.SparseArray r36, android.util.SparseArray r37) {
        /*
        r32_this = this;
        r0 = r32;
        r4 = r0.mManager;
        r4 = r4.mContainer;
        r0 = r33;
        r6 = r4.findViewById(r0);
        r6 = (android.view.ViewGroup) r6;
        if (r6 != 0) goto L_0x0012;
    L_0x0010:
        r4 = 0;
    L_0x0011:
        return r4;
    L_0x0012:
        r0 = r37;
        r1 = r33;
        r8 = r0.get(r1);
        r8 = (android.support.v4.app.Fragment) r8;
        r0 = r36;
        r1 = r33;
        r9 = r0.get(r1);
        r9 = (android.support.v4.app.Fragment) r9;
        r0 = r35;
        r12 = getEnterTransition(r8, r0);
        r0 = r35;
        r7 = getSharedElementTransition(r8, r9, r0);
        r0 = r35;
        r10 = getExitTransition(r9, r0);
        if (r12 != 0) goto L_0x0040;
    L_0x003a:
        if (r7 != 0) goto L_0x0040;
    L_0x003c:
        if (r10 != 0) goto L_0x0040;
    L_0x003e:
        r4 = 0;
        goto L_0x0011;
    L_0x0040:
        r4 = 0;
        r11 = new java.util.ArrayList;
        r11.<init>();
        if (r7 == 0) goto L_0x0086;
    L_0x0048:
        r0 = r32;
        r1 = r34;
        r2 = r35;
        r4 = r0.remapSharedElements(r1, r9, r2);
        r5 = r4.isEmpty();	 Catch:{ IllegalStateException -> 0x013e }
        if (r5 == 0) goto L_0x0063;
    L_0x0058:
        r0 = r34;
        r5 = r0.nonExistentView;	 Catch:{ IllegalStateException -> 0x0140 }
        r11.add(r5);	 Catch:{ IllegalStateException -> 0x0140 }
        r5 = android.support.v4.app.FragmentActivity.a;	 Catch:{ IllegalStateException -> 0x0140 }
        if (r5 == 0) goto L_0x006a;
    L_0x0063:
        r5 = r4.values();	 Catch:{ IllegalStateException -> 0x0140 }
        r11.addAll(r5);	 Catch:{ IllegalStateException -> 0x0140 }
    L_0x006a:
        if (r35 == 0) goto L_0x0144;
    L_0x006c:
        r5 = r9.mEnterTransitionCallback;	 Catch:{ IllegalStateException -> 0x0142 }
    L_0x006e:
        if (r5 == 0) goto L_0x0086;
    L_0x0070:
        r13 = new java.util.ArrayList;
        r14 = r4.keySet();
        r13.<init>(r14);
        r14 = new java.util.ArrayList;
        r15 = r4.values();
        r14.<init>(r15);
        r15 = 0;
        r5.onSharedElementStart(r13, r14, r15);
    L_0x0086:
        r26 = new java.util.ArrayList;
        r26.<init>();
        r0 = r26;
        r25 = captureExitingViews(r10, r9, r0, r4);
        r0 = r32;
        r5 = r0.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x0148 }
        if (r5 == 0) goto L_0x00b6;
    L_0x0097:
        if (r4 == 0) goto L_0x00b6;
    L_0x0099:
        r0 = r32;
        r5 = r0.mSharedElementTargetNames;
        r10 = 0;
        r5 = r5.get(r10);
        r4 = r4.get(r5);
        r4 = (android.view.View) r4;
        if (r4 == 0) goto L_0x00b6;
    L_0x00aa:
        if (r25 == 0) goto L_0x00b1;
    L_0x00ac:
        r0 = r25;
        android.support.v4.app.FragmentTransitionCompat21.setEpicenter(r0, r4);	 Catch:{ IllegalStateException -> 0x014a }
    L_0x00b1:
        if (r7 == 0) goto L_0x00b6;
    L_0x00b3:
        android.support.v4.app.FragmentTransitionCompat21.setEpicenter(r7, r4);	 Catch:{ IllegalStateException -> 0x014c }
    L_0x00b6:
        r15 = new android.support.v4.app.BackStackRecord$1;
        r0 = r32;
        r15.<init>(r0, r8);
        if (r7 == 0) goto L_0x00c8;
    L_0x00bf:
        r4 = r32;
        r5 = r34;
        r10 = r35;
        r4.prepareSharedElementTransition(r5, r6, r7, r8, r9, r10, r11);	 Catch:{ IllegalStateException -> 0x014e }
    L_0x00c8:
        r19 = new java.util.ArrayList;
        r19.<init>();
        r20 = new android.support.v4.util.ArrayMap;
        r20.<init>();
        if (r35 == 0) goto L_0x0152;
    L_0x00d4:
        r4 = r8.getAllowReturnTransitionOverlap();	 Catch:{ IllegalStateException -> 0x0150 }
    L_0x00d8:
        r0 = r25;
        r29 = android.support.v4.app.FragmentTransitionCompat21.mergeTransitions(r12, r0, r7, r4);
        if (r29 == 0) goto L_0x0139;
    L_0x00e0:
        r0 = r34;
        r0 = r0.nonExistentView;	 Catch:{ IllegalStateException -> 0x0157 }
        r16 = r0;
        r0 = r34;
        r0 = r0.enteringEpicenterView;	 Catch:{ IllegalStateException -> 0x0157 }
        r17 = r0;
        r0 = r34;
        r0 = r0.nameOverrides;	 Catch:{ IllegalStateException -> 0x0157 }
        r18 = r0;
        r13 = r7;
        r14 = r6;
        r21 = r11;
        android.support.v4.app.FragmentTransitionCompat21.addTransitionTargets(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);	 Catch:{ IllegalStateException -> 0x0157 }
        r0 = r32;
        r1 = r34;
        r2 = r33;
        r3 = r29;
        r0.excludeHiddenFragmentsAfterEnter(r6, r1, r2, r3);	 Catch:{ IllegalStateException -> 0x0157 }
        r0 = r34;
        r4 = r0.nonExistentView;	 Catch:{ IllegalStateException -> 0x0157 }
        r5 = 1;
        r0 = r29;
        android.support.v4.app.FragmentTransitionCompat21.excludeTarget(r0, r4, r5);	 Catch:{ IllegalStateException -> 0x0157 }
        r0 = r32;
        r1 = r34;
        r2 = r33;
        r3 = r29;
        r0.excludeHiddenFragments(r1, r2, r3);	 Catch:{ IllegalStateException -> 0x0157 }
        r0 = r29;
        android.support.v4.app.FragmentTransitionCompat21.beginDelayedTransition(r6, r0);	 Catch:{ IllegalStateException -> 0x0157 }
        r0 = r34;
        r0 = r0.nonExistentView;	 Catch:{ IllegalStateException -> 0x0157 }
        r22 = r0;
        r0 = r34;
        r0 = r0.hiddenFragmentViews;	 Catch:{ IllegalStateException -> 0x0157 }
        r30 = r0;
        r21 = r6;
        r23 = r12;
        r24 = r19;
        r27 = r7;
        r28 = r11;
        r31 = r20;
        android.support.v4.app.FragmentTransitionCompat21.cleanupTransitions(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);	 Catch:{ IllegalStateException -> 0x0157 }
    L_0x0139:
        if (r29 == 0) goto L_0x0159;
    L_0x013b:
        r4 = 1;
        goto L_0x0011;
    L_0x013e:
        r4 = move-exception;
        throw r4;	 Catch:{ IllegalStateException -> 0x0140 }
    L_0x0140:
        r4 = move-exception;
        throw r4;
    L_0x0142:
        r4 = move-exception;
        throw r4;
    L_0x0144:
        r5 = r8.mEnterTransitionCallback;
        goto L_0x006e;
    L_0x0148:
        r4 = move-exception;
        throw r4;
    L_0x014a:
        r4 = move-exception;
        throw r4;
    L_0x014c:
        r4 = move-exception;
        throw r4;
    L_0x014e:
        r4 = move-exception;
        throw r4;
    L_0x0150:
        r4 = move-exception;
        throw r4;
    L_0x0152:
        r4 = r8.getAllowEnterTransitionOverlap();
        goto L_0x00d8;
    L_0x0157:
        r4 = move-exception;
        throw r4;
    L_0x0159:
        r4 = 0;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.configureTransitions(int, android.support.v4.app.BackStackRecord$TransitionState, boolean, android.util.SparseArray, android.util.SparseArray):boolean");
    }

    static void access$300(BackStackRecord backStackRecord, TransitionState transitionState, int i, Object obj) {
        backStackRecord.excludeHiddenFragments(transitionState, i, obj);
    }

    public FragmentTransaction add(int i, Fragment fragment, String str) {
        doAddOp(i, fragment, str, 1);
        return this;
    }

    void bumpBackStackNesting(int i) {
        boolean z = FragmentActivity.a;
        try {
            if (this.mAddToBackStack) {
                try {
                    if (FragmentManagerImpl.DEBUG) {
                        Log.v(z[9], z[4] + this + z[5] + i);
                    }
                    Op op = this.mHead;
                    while (op != null) {
                        try {
                            Fragment fragment;
                            if (op.fragment != null) {
                                fragment = op.fragment;
                                fragment.mBackStackNesting += i;
                                if (FragmentManagerImpl.DEBUG) {
                                    Log.v(z[6], z[2] + op.fragment + z[3] + op.fragment.mBackStackNesting);
                                }
                            }
                            if (op.removed != null) {
                                int size = op.removed.size() - 1;
                                while (size >= 0) {
                                    fragment = (Fragment) op.removed.get(size);
                                    try {
                                        fragment.mBackStackNesting += i;
                                        if (FragmentManagerImpl.DEBUG) {
                                            Log.v(z[10], z[7] + fragment + z[8] + fragment.mBackStackNesting);
                                        }
                                        int i2 = size - 1;
                                        if (z) {
                                            break;
                                        }
                                        size = i2;
                                    } catch (IllegalStateException e) {
                                        throw e;
                                    }
                                }
                            }
                            Op op2 = op.next;
                            if (!z) {
                                op = op2;
                            } else {
                                return;
                            }
                        } catch (IllegalStateException e2) {
                            throw e2;
                        } catch (IllegalStateException e22) {
                            throw e22;
                        }
                    }
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.v4.util.ArrayMap mapSharedElementsIn(android.support.v4.app.BackStackRecord.TransitionState r5, boolean r6, android.support.v4.app.Fragment r7) {
        /*
        r4_this = this;
        r3 = 1;
        r0 = r4.mapEnteringSharedElements(r5, r7, r6);
        if (r6 == 0) goto L_0x001a;
    L_0x0007:
        r1 = r7.mExitTransitionCallback;	 Catch:{ IllegalStateException -> 0x0029 }
        if (r1 == 0) goto L_0x0012;
    L_0x000b:
        r1 = r7.mExitTransitionCallback;	 Catch:{ IllegalStateException -> 0x0029 }
        r2 = r4.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x0029 }
        r1.onMapSharedElements(r2, r0);	 Catch:{ IllegalStateException -> 0x0029 }
    L_0x0012:
        r1 = 1;
        r4.setBackNameOverrides(r5, r0, r1);	 Catch:{ IllegalStateException -> 0x002b }
        r1 = android.support.v4.app.FragmentActivity.a;	 Catch:{ IllegalStateException -> 0x002b }
        if (r1 == 0) goto L_0x0028;
    L_0x001a:
        r1 = r7.mEnterTransitionCallback;	 Catch:{ IllegalStateException -> 0x002d }
        if (r1 == 0) goto L_0x0025;
    L_0x001e:
        r1 = r7.mEnterTransitionCallback;	 Catch:{ IllegalStateException -> 0x002d }
        r2 = r4.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x002d }
        r1.onMapSharedElements(r2, r0);	 Catch:{ IllegalStateException -> 0x002d }
    L_0x0025:
        r4.setNameOverrides(r5, r0, r3);
    L_0x0028:
        return r0;
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.mapSharedElementsIn(android.support.v4.app.BackStackRecord$TransitionState, boolean, android.support.v4.app.Fragment):android.support.v4.util.ArrayMap");
    }

    static void access$100(BackStackRecord backStackRecord, ArrayMap arrayMap, TransitionState transitionState) {
        backStackRecord.setEpicenterIn(arrayMap, transitionState);
    }

    public String getName() {
        return this.mName;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void setFirstOut(android.util.SparseArray r2, android.support.v4.app.Fragment r3) {
        /*
        if (r3 == 0) goto L_0x0021;
    L_0x0002:
        r0 = r3.mContainerId;
        if (r0 == 0) goto L_0x0021;
    L_0x0006:
        r1 = r3.isHidden();	 Catch:{ IllegalStateException -> 0x0022 }
        if (r1 != 0) goto L_0x0021;
    L_0x000c:
        r1 = r3.isAdded();	 Catch:{ IllegalStateException -> 0x0024 }
        if (r1 == 0) goto L_0x0021;
    L_0x0012:
        r1 = r3.getView();	 Catch:{ IllegalStateException -> 0x0026 }
        if (r1 == 0) goto L_0x0021;
    L_0x0018:
        r1 = r2.get(r0);	 Catch:{ IllegalStateException -> 0x0028 }
        if (r1 != 0) goto L_0x0021;
    L_0x001e:
        r2.put(r0, r3);	 Catch:{ IllegalStateException -> 0x0028 }
    L_0x0021:
        return;
    L_0x0022:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.setFirstOut(android.util.SparseArray, android.support.v4.app.Fragment):void");
    }

    private static Object getSharedElementTransition(Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object sharedElementReturnTransition;
        if (z) {
            try {
                sharedElementReturnTransition = fragment2.getSharedElementReturnTransition();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        sharedElementReturnTransition = fragment.getSharedElementEnterTransition();
        return FragmentTransitionCompat21.cloneTransition(sharedElementReturnTransition);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r14_this = this;
        r9 = android.support.v4.app.FragmentActivity.a;
        r0 = android.support.v4.app.FragmentManagerImpl.DEBUG;	 Catch:{ IllegalStateException -> 0x003c }
        if (r0 == 0) goto L_0x0026;
    L_0x0006:
        r0 = z;	 Catch:{ IllegalStateException -> 0x003c }
        r1 = 16;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x003c }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x003c }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x003c }
        r2 = z;	 Catch:{ IllegalStateException -> 0x003c }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x003c }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x003c }
        r1 = r1.append(r14);	 Catch:{ IllegalStateException -> 0x003c }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x003c }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalStateException -> 0x003c }
    L_0x0026:
        r0 = r14.mAddToBackStack;	 Catch:{ IllegalStateException -> 0x003e }
        if (r0 == 0) goto L_0x0040;
    L_0x002a:
        r0 = r14.mIndex;	 Catch:{ IllegalStateException -> 0x003a }
        if (r0 >= 0) goto L_0x0040;
    L_0x002e:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x003a }
        r1 = z;	 Catch:{ IllegalStateException -> 0x003a }
        r2 = 12;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x003a }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x003a }
        throw r0;	 Catch:{ IllegalStateException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003a }
    L_0x0040:
        r0 = 1;
        r14.bumpBackStackNesting(r0);
        r0 = 0;
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        if (r1 < r2) goto L_0x01e0;
    L_0x004b:
        r0 = new android.util.SparseArray;
        r0.<init>();
        r1 = new android.util.SparseArray;
        r1.<init>();
        r14.calculateFragments(r0, r1);
        r2 = 0;
        r0 = r14.beginTransition(r0, r1, r2);
        r8 = r0;
    L_0x005e:
        if (r8 == 0) goto L_0x0099;
    L_0x0060:
        r0 = 0;
        r1 = r0;
    L_0x0062:
        if (r8 == 0) goto L_0x009d;
    L_0x0064:
        r0 = 0;
        r2 = r0;
    L_0x0066:
        r0 = r14.mHead;
        r7 = r0;
    L_0x0069:
        if (r7 == 0) goto L_0x015e;
    L_0x006b:
        if (r8 == 0) goto L_0x00a1;
    L_0x006d:
        r0 = 0;
        r3 = r0;
    L_0x006f:
        if (r8 == 0) goto L_0x00a5;
    L_0x0071:
        r0 = 0;
        r4 = r0;
    L_0x0073:
        r0 = r7.cmd;
        switch(r0) {
            case 1: goto L_0x00a9;
            case 2: goto L_0x00b5;
            case 3: goto L_0x0123;
            case 4: goto L_0x012e;
            case 5: goto L_0x0139;
            case 6: goto L_0x0144;
            case 7: goto L_0x014f;
            default: goto L_0x0078;
        };
    L_0x0078:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x0097 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0097 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0097 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0097 }
        r3 = 15;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0097 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0097 }
        r2 = r7.cmd;	 Catch:{ IllegalStateException -> 0x0097 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0097 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0097 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0097 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0097 }
    L_0x0097:
        r0 = move-exception;
        throw r0;
    L_0x0099:
        r0 = r14.mTransitionStyle;
        r1 = r0;
        goto L_0x0062;
    L_0x009d:
        r0 = r14.mTransition;
        r2 = r0;
        goto L_0x0066;
    L_0x00a1:
        r0 = r7.enterAnim;
        r3 = r0;
        goto L_0x006f;
    L_0x00a5:
        r0 = r7.exitAnim;
        r4 = r0;
        goto L_0x0073;
    L_0x00a9:
        r0 = r7.fragment;
        r0.mNextAnim = r3;
        r5 = r14.mManager;
        r6 = 0;
        r5.addFragment(r0, r6);
        if (r9 == 0) goto L_0x015a;
    L_0x00b5:
        r5 = r7.fragment;
        r0 = r14.mManager;
        r0 = r0.mAdded;
        if (r0 == 0) goto L_0x01dd;
    L_0x00bd:
        r0 = 0;
        r6 = r5;
        r5 = r0;
    L_0x00c0:
        r0 = r14.mManager;
        r0 = r0.mAdded;
        r0 = r0.size();
        if (r5 >= r0) goto L_0x0117;
    L_0x00ca:
        r0 = r14.mManager;
        r0 = r0.mAdded;
        r0 = r0.get(r5);
        r0 = (android.support.v4.app.Fragment) r0;
        r10 = android.support.v4.app.FragmentManagerImpl.DEBUG;	 Catch:{ IllegalStateException -> 0x0172 }
        if (r10 == 0) goto L_0x0106;
    L_0x00d8:
        r10 = z;	 Catch:{ IllegalStateException -> 0x0172 }
        r11 = 13;
        r10 = r10[r11];	 Catch:{ IllegalStateException -> 0x0172 }
        r11 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0172 }
        r11.<init>();	 Catch:{ IllegalStateException -> 0x0172 }
        r12 = z;	 Catch:{ IllegalStateException -> 0x0172 }
        r13 = 19;
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x0172 }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x0172 }
        r11 = r11.append(r6);	 Catch:{ IllegalStateException -> 0x0172 }
        r12 = z;	 Catch:{ IllegalStateException -> 0x0172 }
        r13 = 20;
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x0172 }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x0172 }
        r11 = r11.append(r0);	 Catch:{ IllegalStateException -> 0x0172 }
        r11 = r11.toString();	 Catch:{ IllegalStateException -> 0x0172 }
        android.util.Log.v(r10, r11);	 Catch:{ IllegalStateException -> 0x0172 }
    L_0x0106:
        if (r6 == 0) goto L_0x010e;
    L_0x0108:
        r10 = r0.mContainerId;	 Catch:{ IllegalStateException -> 0x0174 }
        r11 = r6.mContainerId;	 Catch:{ IllegalStateException -> 0x0174 }
        if (r10 != r11) goto L_0x0113;
    L_0x010e:
        if (r0 != r6) goto L_0x0176;
    L_0x0110:
        r6 = 0;
        r7.fragment = r6;
    L_0x0113:
        r0 = r5 + 1;
        if (r9 == 0) goto L_0x01da;
    L_0x0117:
        if (r6 == 0) goto L_0x0121;
    L_0x0119:
        r6.mNextAnim = r3;	 Catch:{ IllegalStateException -> 0x01d3 }
        r0 = r14.mManager;	 Catch:{ IllegalStateException -> 0x01d3 }
        r5 = 0;
        r0.addFragment(r6, r5);	 Catch:{ IllegalStateException -> 0x01d3 }
    L_0x0121:
        if (r9 == 0) goto L_0x015a;
    L_0x0123:
        r0 = r7.fragment;
        r0.mNextAnim = r4;
        r5 = r14.mManager;
        r5.removeFragment(r0, r2, r1);
        if (r9 == 0) goto L_0x015a;
    L_0x012e:
        r0 = r7.fragment;
        r0.mNextAnim = r4;
        r5 = r14.mManager;
        r5.hideFragment(r0, r2, r1);
        if (r9 == 0) goto L_0x015a;
    L_0x0139:
        r0 = r7.fragment;
        r0.mNextAnim = r3;
        r5 = r14.mManager;
        r5.showFragment(r0, r2, r1);
        if (r9 == 0) goto L_0x015a;
    L_0x0144:
        r0 = r7.fragment;
        r0.mNextAnim = r4;
        r4 = r14.mManager;
        r4.detachFragment(r0, r2, r1);
        if (r9 == 0) goto L_0x015a;
    L_0x014f:
        r0 = r7.fragment;
        r0.mNextAnim = r3;	 Catch:{ IllegalStateException -> 0x0097 }
        r3 = r14.mManager;	 Catch:{ IllegalStateException -> 0x0097 }
        r3.attachFragment(r0, r2, r1);	 Catch:{ IllegalStateException -> 0x0097 }
        if (r9 != 0) goto L_0x0078;
    L_0x015a:
        r0 = r7.next;
        if (r9 == 0) goto L_0x01d7;
    L_0x015e:
        r0 = r14.mManager;	 Catch:{ IllegalStateException -> 0x01d5 }
        r3 = r14.mManager;	 Catch:{ IllegalStateException -> 0x01d5 }
        r3 = r3.mCurState;	 Catch:{ IllegalStateException -> 0x01d5 }
        r4 = 1;
        r0.moveToState(r3, r2, r1, r4);	 Catch:{ IllegalStateException -> 0x01d5 }
        r0 = r14.mAddToBackStack;	 Catch:{ IllegalStateException -> 0x01d5 }
        if (r0 == 0) goto L_0x0171;
    L_0x016c:
        r0 = r14.mManager;	 Catch:{ IllegalStateException -> 0x01d5 }
        r0.addBackStackState(r14);	 Catch:{ IllegalStateException -> 0x01d5 }
    L_0x0171:
        return;
    L_0x0172:
        r0 = move-exception;
        throw r0;
    L_0x0174:
        r0 = move-exception;
        throw r0;
    L_0x0176:
        r10 = r7.removed;	 Catch:{ IllegalStateException -> 0x01cd }
        if (r10 != 0) goto L_0x0181;
    L_0x017a:
        r10 = new java.util.ArrayList;	 Catch:{ IllegalStateException -> 0x01cd }
        r10.<init>();	 Catch:{ IllegalStateException -> 0x01cd }
        r7.removed = r10;	 Catch:{ IllegalStateException -> 0x01cd }
    L_0x0181:
        r10 = r7.removed;	 Catch:{ IllegalStateException -> 0x01cf }
        r10.add(r0);	 Catch:{ IllegalStateException -> 0x01cf }
        r0.mNextAnim = r4;	 Catch:{ IllegalStateException -> 0x01cf }
        r10 = r14.mAddToBackStack;	 Catch:{ IllegalStateException -> 0x01cf }
        if (r10 == 0) goto L_0x01c6;
    L_0x018c:
        r10 = r0.mBackStackNesting;	 Catch:{ IllegalStateException -> 0x01d1 }
        r10 = r10 + 1;
        r0.mBackStackNesting = r10;	 Catch:{ IllegalStateException -> 0x01d1 }
        r10 = android.support.v4.app.FragmentManagerImpl.DEBUG;	 Catch:{ IllegalStateException -> 0x01d1 }
        if (r10 == 0) goto L_0x01c6;
    L_0x0196:
        r10 = z;	 Catch:{ IllegalStateException -> 0x01d1 }
        r11 = 18;
        r10 = r10[r11];	 Catch:{ IllegalStateException -> 0x01d1 }
        r11 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x01d1 }
        r11.<init>();	 Catch:{ IllegalStateException -> 0x01d1 }
        r12 = z;	 Catch:{ IllegalStateException -> 0x01d1 }
        r13 = 14;
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x01d1 }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x01d1 }
        r11 = r11.append(r0);	 Catch:{ IllegalStateException -> 0x01d1 }
        r12 = z;	 Catch:{ IllegalStateException -> 0x01d1 }
        r13 = 11;
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x01d1 }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x01d1 }
        r12 = r0.mBackStackNesting;	 Catch:{ IllegalStateException -> 0x01d1 }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x01d1 }
        r11 = r11.toString();	 Catch:{ IllegalStateException -> 0x01d1 }
        android.util.Log.v(r10, r11);	 Catch:{ IllegalStateException -> 0x01d1 }
    L_0x01c6:
        r10 = r14.mManager;
        r10.removeFragment(r0, r2, r1);
        goto L_0x0113;
    L_0x01cd:
        r0 = move-exception;
        throw r0;
    L_0x01cf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01d1 }
    L_0x01d1:
        r0 = move-exception;
        throw r0;
    L_0x01d3:
        r0 = move-exception;
        throw r0;
    L_0x01d5:
        r0 = move-exception;
        throw r0;
    L_0x01d7:
        r7 = r0;
        goto L_0x0069;
    L_0x01da:
        r5 = r0;
        goto L_0x00c0;
    L_0x01dd:
        r6 = r5;
        goto L_0x0117;
    L_0x01e0:
        r8 = r0;
        goto L_0x005e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.run():void");
    }

    public FragmentTransaction add(int i, Fragment fragment) {
        doAddOp(i, fragment, null, 1);
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void calculateBackFragments(android.util.SparseArray r5, android.util.SparseArray r6) {
        /*
        r4_this = this;
        r3 = android.support.v4.app.FragmentActivity.a;
        r0 = r4.mManager;	 Catch:{ IllegalStateException -> 0x000d }
        r0 = r0.mContainer;	 Catch:{ IllegalStateException -> 0x000d }
        r0 = r0.hasView();	 Catch:{ IllegalStateException -> 0x000d }
        if (r0 != 0) goto L_0x000f;
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = r4.mHead;
        r2 = r0;
    L_0x0012:
        if (r2 == 0) goto L_0x000c;
    L_0x0014:
        r0 = r2.cmd;	 Catch:{ IllegalStateException -> 0x006f }
        switch(r0) {
            case 1: goto L_0x001f;
            case 2: goto L_0x0026;
            case 3: goto L_0x004b;
            case 4: goto L_0x0052;
            case 5: goto L_0x0059;
            case 6: goto L_0x0060;
            case 7: goto L_0x0067;
            default: goto L_0x0019;
        };
    L_0x0019:
        r0 = r2.next;
        if (r3 != 0) goto L_0x000c;
    L_0x001d:
        r2 = r0;
        goto L_0x0012;
    L_0x001f:
        r0 = r2.fragment;	 Catch:{ IllegalStateException -> 0x0071 }
        setFirstOut(r5, r0);	 Catch:{ IllegalStateException -> 0x0071 }
        if (r3 == 0) goto L_0x0019;
    L_0x0026:
        r0 = r2.removed;	 Catch:{ IllegalStateException -> 0x0071 }
        if (r0 == 0) goto L_0x0044;
    L_0x002a:
        r0 = r2.removed;
        r0 = r0.size();
        r0 = r0 + -1;
        r1 = r0;
    L_0x0033:
        if (r1 < 0) goto L_0x0044;
    L_0x0035:
        r0 = r2.removed;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.Fragment) r0;
        r4.setLastIn(r6, r0);
        r0 = r1 + -1;
        if (r3 == 0) goto L_0x007b;
    L_0x0044:
        r0 = r2.fragment;	 Catch:{ IllegalStateException -> 0x0073 }
        setFirstOut(r5, r0);	 Catch:{ IllegalStateException -> 0x0073 }
        if (r3 == 0) goto L_0x0019;
    L_0x004b:
        r0 = r2.fragment;	 Catch:{ IllegalStateException -> 0x0075 }
        r4.setLastIn(r6, r0);	 Catch:{ IllegalStateException -> 0x0075 }
        if (r3 == 0) goto L_0x0019;
    L_0x0052:
        r0 = r2.fragment;	 Catch:{ IllegalStateException -> 0x0077 }
        r4.setLastIn(r6, r0);	 Catch:{ IllegalStateException -> 0x0077 }
        if (r3 == 0) goto L_0x0019;
    L_0x0059:
        r0 = r2.fragment;	 Catch:{ IllegalStateException -> 0x0079 }
        setFirstOut(r5, r0);	 Catch:{ IllegalStateException -> 0x0079 }
        if (r3 == 0) goto L_0x0019;
    L_0x0060:
        r0 = r2.fragment;	 Catch:{ IllegalStateException -> 0x006d }
        r4.setLastIn(r6, r0);	 Catch:{ IllegalStateException -> 0x006d }
        if (r3 == 0) goto L_0x0019;
    L_0x0067:
        r0 = r2.fragment;	 Catch:{ IllegalStateException -> 0x006d }
        setFirstOut(r5, r0);	 Catch:{ IllegalStateException -> 0x006d }
        goto L_0x0019;
    L_0x006d:
        r0 = move-exception;
        throw r0;
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006d }
    L_0x007b:
        r1 = r0;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.calculateBackFragments(android.util.SparseArray, android.util.SparseArray):void");
    }

    public int commit() {
        return commitInternal(false);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        dump(str, printWriter, true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.v4.util.ArrayMap remapSharedElements(android.support.v4.app.BackStackRecord.TransitionState r6, android.support.v4.app.Fragment r7, boolean r8) {
        /*
        r5_this = this;
        r4 = 0;
        r1 = android.support.v4.app.FragmentActivity.a;
        r0 = new android.support.v4.util.ArrayMap;
        r0.<init>();
        r2 = r5.mSharedElementSourceNames;	 Catch:{ IllegalStateException -> 0x0046 }
        if (r2 == 0) goto L_0x0024;
    L_0x000c:
        r2 = r7.getView();	 Catch:{ IllegalStateException -> 0x0048 }
        android.support.v4.app.FragmentTransitionCompat21.findNamedViews(r0, r2);	 Catch:{ IllegalStateException -> 0x0048 }
        if (r8 == 0) goto L_0x001c;
    L_0x0015:
        r2 = r5.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x0048 }
        r0.retainAll(r2);	 Catch:{ IllegalStateException -> 0x0048 }
        if (r1 == 0) goto L_0x0024;
    L_0x001c:
        r2 = r5.mSharedElementSourceNames;
        r3 = r5.mSharedElementTargetNames;
        r0 = remapNames(r2, r3, r0);
    L_0x0024:
        if (r8 == 0) goto L_0x0037;
    L_0x0026:
        r2 = r7.mEnterTransitionCallback;	 Catch:{ IllegalStateException -> 0x004a }
        if (r2 == 0) goto L_0x0031;
    L_0x002a:
        r2 = r7.mEnterTransitionCallback;	 Catch:{ IllegalStateException -> 0x004a }
        r3 = r5.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x004a }
        r2.onMapSharedElements(r3, r0);	 Catch:{ IllegalStateException -> 0x004a }
    L_0x0031:
        r2 = 0;
        r5.setBackNameOverrides(r6, r0, r2);	 Catch:{ IllegalStateException -> 0x004c }
        if (r1 == 0) goto L_0x0045;
    L_0x0037:
        r1 = r7.mExitTransitionCallback;	 Catch:{ IllegalStateException -> 0x004e }
        if (r1 == 0) goto L_0x0042;
    L_0x003b:
        r1 = r7.mExitTransitionCallback;	 Catch:{ IllegalStateException -> 0x004e }
        r2 = r5.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x004e }
        r1.onMapSharedElements(r2, r0);	 Catch:{ IllegalStateException -> 0x004e }
    L_0x0042:
        r5.setNameOverrides(r6, r0, r4);
    L_0x0045:
        return r0;
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.remapSharedElements(android.support.v4.app.BackStackRecord$TransitionState, android.support.v4.app.Fragment, boolean):android.support.v4.util.ArrayMap");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int commitInternal(boolean r6) {
        /*
        r5_this = this;
        r4 = 0;
        r0 = r5.mCommitted;	 Catch:{ IllegalStateException -> 0x0011 }
        if (r0 == 0) goto L_0x0013;
    L_0x0005:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0011 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0011 }
        r2 = 66;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0011 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0011 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0011 }
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r0 = android.support.v4.app.FragmentManagerImpl.DEBUG;
        if (r0 == 0) goto L_0x0050;
    L_0x0017:
        r0 = z;
        r1 = 70;
        r0 = r0[r1];
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 68;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r5);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
        r0 = new android.support.v4.util.LogWriter;
        r1 = z;
        r2 = 67;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = new java.io.PrintWriter;
        r1.<init>(r0);
        r0 = z;
        r2 = 69;
        r0 = r0[r2];
        r5.dump(r0, r4, r1, r4);
    L_0x0050:
        r0 = 1;
        r5.mCommitted = r0;	 Catch:{ IllegalStateException -> 0x006e }
        r0 = r5.mAddToBackStack;	 Catch:{ IllegalStateException -> 0x006e }
        if (r0 == 0) goto L_0x0063;
    L_0x0057:
        r0 = r5.mManager;	 Catch:{ IllegalStateException -> 0x0070 }
        r0 = r0.allocBackStackIndex(r5);	 Catch:{ IllegalStateException -> 0x0070 }
        r5.mIndex = r0;	 Catch:{ IllegalStateException -> 0x0070 }
        r0 = android.support.v4.app.FragmentActivity.a;	 Catch:{ IllegalStateException -> 0x0070 }
        if (r0 == 0) goto L_0x0066;
    L_0x0063:
        r0 = -1;
        r5.mIndex = r0;	 Catch:{ IllegalStateException -> 0x0070 }
    L_0x0066:
        r0 = r5.mManager;
        r0.enqueueAction(r5, r6);
        r0 = r5.mIndex;
        return r0;
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.commitInternal(boolean):int");
    }

    private static Object captureExitingViews(Object obj, Fragment fragment, ArrayList arrayList, ArrayMap arrayMap) {
        return obj != null ? FragmentTransitionCompat21.captureExitingViews(obj, fragment.getView(), arrayList, arrayMap) : obj;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.v4.util.ArrayMap mapEnteringSharedElements(android.support.v4.app.BackStackRecord.TransitionState r4, android.support.v4.app.Fragment r5, boolean r6) {
        /*
        r3_this = this;
        r0 = new android.support.v4.util.ArrayMap;
        r0.<init>();
        r1 = r5.getView();
        if (r1 == 0) goto L_0x0025;
    L_0x000b:
        r2 = r3.mSharedElementSourceNames;	 Catch:{ IllegalStateException -> 0x0026 }
        if (r2 == 0) goto L_0x0025;
    L_0x000f:
        android.support.v4.app.FragmentTransitionCompat21.findNamedViews(r0, r1);	 Catch:{ IllegalStateException -> 0x0026 }
        if (r6 == 0) goto L_0x0020;
    L_0x0014:
        r1 = r3.mSharedElementSourceNames;
        r2 = r3.mSharedElementTargetNames;
        r0 = remapNames(r1, r2, r0);
        r1 = android.support.v4.app.FragmentActivity.a;	 Catch:{ IllegalStateException -> 0x0028 }
        if (r1 == 0) goto L_0x0025;
    L_0x0020:
        r1 = r3.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x0028 }
        r0.retainAll(r1);	 Catch:{ IllegalStateException -> 0x0028 }
    L_0x0025:
        return r0;
    L_0x0026:
        r0 = move-exception;
        throw r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.mapEnteringSharedElements(android.support.v4.app.BackStackRecord$TransitionState, android.support.v4.app.Fragment, boolean):android.support.v4.util.ArrayMap");
    }

    public boolean isEmpty() {
        try {
            return this.mNumOp == 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static void access$200(BackStackRecord backStackRecord, TransitionState transitionState, Fragment fragment, Fragment fragment2, boolean z, ArrayMap arrayMap) {
        backStackRecord.callSharedElementEnd(transitionState, fragment, fragment2, z, arrayMap);
    }

    private void setEpicenterIn(ArrayMap arrayMap, TransitionState transitionState) {
        try {
            if (this.mSharedElementTargetNames != null && !arrayMap.isEmpty()) {
                View view = (View) arrayMap.get(this.mSharedElementTargetNames.get(0));
                if (view != null) {
                    try {
                        transitionState.enteringEpicenterView.epicenter = view;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dump(java.lang.String r9, java.io.PrintWriter r10, boolean r11) {
        /*
        r8_this = this;
        r1 = 0;
        r4 = android.support.v4.app.FragmentActivity.a;
        if (r11 == 0) goto L_0x0111;
    L_0x0005:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x0244 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0244 }
        r2 = 27;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0244 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0244 }
        r0 = r8.mName;	 Catch:{ IllegalStateException -> 0x0244 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0244 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0244 }
        r2 = 22;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0244 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0244 }
        r0 = r8.mIndex;	 Catch:{ IllegalStateException -> 0x0244 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0244 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0244 }
        r2 = 46;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0244 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0244 }
        r0 = r8.mCommitted;	 Catch:{ IllegalStateException -> 0x0244 }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x0244 }
        r0 = r8.mTransition;	 Catch:{ IllegalStateException -> 0x0244 }
        if (r0 == 0) goto L_0x005d;
    L_0x0036:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x0244 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0244 }
        r2 = 23;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0244 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0244 }
        r0 = r8.mTransition;	 Catch:{ IllegalStateException -> 0x0244 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x0244 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0244 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0244 }
        r2 = 32;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0244 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0244 }
        r0 = r8.mTransitionStyle;	 Catch:{ IllegalStateException -> 0x0244 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x0244 }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x0244 }
    L_0x005d:
        r0 = r8.mEnterAnim;	 Catch:{ IllegalStateException -> 0x0246 }
        if (r0 != 0) goto L_0x0065;
    L_0x0061:
        r0 = r8.mExitAnim;	 Catch:{ IllegalStateException -> 0x0248 }
        if (r0 == 0) goto L_0x008c;
    L_0x0065:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x0248 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0248 }
        r2 = 38;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0248 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0248 }
        r0 = r8.mEnterAnim;	 Catch:{ IllegalStateException -> 0x0248 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x0248 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0248 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0248 }
        r2 = 44;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0248 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0248 }
        r0 = r8.mExitAnim;	 Catch:{ IllegalStateException -> 0x0248 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x0248 }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x0248 }
    L_0x008c:
        r0 = r8.mPopEnterAnim;	 Catch:{ IllegalStateException -> 0x024a }
        if (r0 != 0) goto L_0x0094;
    L_0x0090:
        r0 = r8.mPopExitAnim;	 Catch:{ IllegalStateException -> 0x024c }
        if (r0 == 0) goto L_0x00bb;
    L_0x0094:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x024c }
        r0 = z;	 Catch:{ IllegalStateException -> 0x024c }
        r2 = 29;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x024c }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x024c }
        r0 = r8.mPopEnterAnim;	 Catch:{ IllegalStateException -> 0x024c }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x024c }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x024c }
        r0 = z;	 Catch:{ IllegalStateException -> 0x024c }
        r2 = 41;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x024c }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x024c }
        r0 = r8.mPopExitAnim;	 Catch:{ IllegalStateException -> 0x024c }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x024c }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x024c }
    L_0x00bb:
        r0 = r8.mBreadCrumbTitleRes;	 Catch:{ IllegalStateException -> 0x024e }
        if (r0 != 0) goto L_0x00c3;
    L_0x00bf:
        r0 = r8.mBreadCrumbTitleText;	 Catch:{ IllegalStateException -> 0x0250 }
        if (r0 == 0) goto L_0x00e6;
    L_0x00c3:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x0250 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0250 }
        r2 = 30;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0250 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0250 }
        r0 = r8.mBreadCrumbTitleRes;	 Catch:{ IllegalStateException -> 0x0250 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x0250 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0250 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0250 }
        r2 = 25;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0250 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0250 }
        r0 = r8.mBreadCrumbTitleText;	 Catch:{ IllegalStateException -> 0x0250 }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x0250 }
    L_0x00e6:
        r0 = r8.mBreadCrumbShortTitleRes;	 Catch:{ IllegalStateException -> 0x0252 }
        if (r0 != 0) goto L_0x00ee;
    L_0x00ea:
        r0 = r8.mBreadCrumbShortTitleText;	 Catch:{ IllegalStateException -> 0x0254 }
        if (r0 == 0) goto L_0x0111;
    L_0x00ee:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x0254 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0254 }
        r2 = 43;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0254 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0254 }
        r0 = r8.mBreadCrumbShortTitleRes;	 Catch:{ IllegalStateException -> 0x0254 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x0254 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0254 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0254 }
        r2 = 26;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0254 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0254 }
        r0 = r8.mBreadCrumbShortTitleText;	 Catch:{ IllegalStateException -> 0x0254 }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x0254 }
    L_0x0111:
        r0 = r8.mHead;
        if (r0 == 0) goto L_0x0243;
    L_0x0115:
        r10.print(r9);
        r0 = z;
        r2 = 51;
        r0 = r0[r2];
        r10.println(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0 = r0.append(r9);
        r2 = z;
        r3 = 45;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r5 = r0.toString();
        r0 = r8.mHead;
        r2 = r1;
        r3 = r0;
    L_0x013c:
        if (r3 == 0) goto L_0x0243;
    L_0x013e:
        r0 = r3.cmd;
        switch(r0) {
            case 0: goto L_0x0256;
            case 1: goto L_0x025e;
            case 2: goto L_0x0266;
            case 3: goto L_0x026e;
            case 4: goto L_0x0276;
            case 5: goto L_0x027e;
            case 6: goto L_0x0286;
            case 7: goto L_0x028e;
            default: goto L_0x0143;
        };
    L_0x0143:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r6 = z;
        r7 = 48;
        r6 = r6[r7];
        r0 = r0.append(r6);
        r6 = r3.cmd;
        r0 = r0.append(r6);
        r0 = r0.toString();
    L_0x015c:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x0298 }
        r6 = z;	 Catch:{ IllegalStateException -> 0x0298 }
        r7 = 37;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x0298 }
        r10.print(r6);	 Catch:{ IllegalStateException -> 0x0298 }
        r10.print(r2);	 Catch:{ IllegalStateException -> 0x0298 }
        r6 = z;	 Catch:{ IllegalStateException -> 0x0298 }
        r7 = 24;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x0298 }
        r10.print(r6);	 Catch:{ IllegalStateException -> 0x0298 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0298 }
        r0 = " ";
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x0298 }
        r0 = r3.fragment;	 Catch:{ IllegalStateException -> 0x0298 }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x0298 }
        if (r11 == 0) goto L_0x01e1;
    L_0x0183:
        r0 = r3.enterAnim;	 Catch:{ IllegalStateException -> 0x029a }
        if (r0 != 0) goto L_0x018b;
    L_0x0187:
        r0 = r3.exitAnim;	 Catch:{ IllegalStateException -> 0x029c }
        if (r0 == 0) goto L_0x01b2;
    L_0x018b:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x029c }
        r0 = z;	 Catch:{ IllegalStateException -> 0x029c }
        r6 = 52;
        r0 = r0[r6];	 Catch:{ IllegalStateException -> 0x029c }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x029c }
        r0 = r3.enterAnim;	 Catch:{ IllegalStateException -> 0x029c }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x029c }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x029c }
        r0 = z;	 Catch:{ IllegalStateException -> 0x029c }
        r6 = 31;
        r0 = r0[r6];	 Catch:{ IllegalStateException -> 0x029c }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x029c }
        r0 = r3.exitAnim;	 Catch:{ IllegalStateException -> 0x029c }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x029c }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x029c }
    L_0x01b2:
        r0 = r3.popEnterAnim;	 Catch:{ IllegalStateException -> 0x029e }
        if (r0 != 0) goto L_0x01ba;
    L_0x01b6:
        r0 = r3.popExitAnim;	 Catch:{ IllegalStateException -> 0x02a0 }
        if (r0 == 0) goto L_0x01e1;
    L_0x01ba:
        r10.print(r9);	 Catch:{ IllegalStateException -> 0x02a0 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x02a0 }
        r6 = 53;
        r0 = r0[r6];	 Catch:{ IllegalStateException -> 0x02a0 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x02a0 }
        r0 = r3.popEnterAnim;	 Catch:{ IllegalStateException -> 0x02a0 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x02a0 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x02a0 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x02a0 }
        r6 = 54;
        r0 = r0[r6];	 Catch:{ IllegalStateException -> 0x02a0 }
        r10.print(r0);	 Catch:{ IllegalStateException -> 0x02a0 }
        r0 = r3.popExitAnim;	 Catch:{ IllegalStateException -> 0x02a0 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalStateException -> 0x02a0 }
        r10.println(r0);	 Catch:{ IllegalStateException -> 0x02a0 }
    L_0x01e1:
        r0 = r3.removed;	 Catch:{ IllegalStateException -> 0x02a2 }
        if (r0 == 0) goto L_0x023d;
    L_0x01e5:
        r0 = r3.removed;	 Catch:{ IllegalStateException -> 0x02a2 }
        r0 = r0.size();	 Catch:{ IllegalStateException -> 0x02a2 }
        if (r0 <= 0) goto L_0x023d;
    L_0x01ed:
        r0 = r1;
    L_0x01ee:
        r6 = r3.removed;
        r6 = r6.size();
        if (r0 >= r6) goto L_0x023d;
    L_0x01f6:
        r10.print(r5);	 Catch:{ IllegalStateException -> 0x02a4 }
        r6 = r3.removed;	 Catch:{ IllegalStateException -> 0x02a4 }
        r6 = r6.size();	 Catch:{ IllegalStateException -> 0x02a4 }
        r7 = 1;
        if (r6 != r7) goto L_0x020d;
    L_0x0202:
        r6 = z;	 Catch:{ IllegalStateException -> 0x02a6 }
        r7 = 50;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x02a6 }
        r10.print(r6);	 Catch:{ IllegalStateException -> 0x02a6 }
        if (r4 == 0) goto L_0x0230;
    L_0x020d:
        if (r0 != 0) goto L_0x0218;
    L_0x020f:
        r6 = z;	 Catch:{ IllegalStateException -> 0x02a8 }
        r7 = 42;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x02a8 }
        r10.println(r6);	 Catch:{ IllegalStateException -> 0x02a8 }
    L_0x0218:
        r10.print(r5);
        r6 = z;
        r7 = 40;
        r6 = r6[r7];
        r10.print(r6);
        r10.print(r0);
        r6 = z;
        r7 = 21;
        r6 = r6[r7];
        r10.print(r6);
    L_0x0230:
        r6 = r3.removed;
        r6 = r6.get(r0);
        r10.println(r6);
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x01ee;
    L_0x023d:
        r3 = r3.next;
        r0 = r2 + 1;
        if (r4 == 0) goto L_0x02aa;
    L_0x0243:
        return;
    L_0x0244:
        r0 = move-exception;
        throw r0;
    L_0x0246:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0248 }
    L_0x0248:
        r0 = move-exception;
        throw r0;
    L_0x024a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x024c }
    L_0x024c:
        r0 = move-exception;
        throw r0;
    L_0x024e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0250 }
    L_0x0250:
        r0 = move-exception;
        throw r0;
    L_0x0252:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0254 }
    L_0x0254:
        r0 = move-exception;
        throw r0;
    L_0x0256:
        r0 = z;
        r6 = 28;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x025e:
        r0 = z;
        r6 = 49;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x0266:
        r0 = z;
        r6 = 34;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x026e:
        r0 = z;
        r6 = 35;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x0276:
        r0 = z;
        r6 = 36;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x027e:
        r0 = z;
        r6 = 33;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x0286:
        r0 = z;
        r6 = 47;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x028e:
        r0 = z;
        r6 = 39;
        r0 = r0[r6];
        if (r4 == 0) goto L_0x015c;
    L_0x0296:
        goto L_0x0143;
    L_0x0298:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x029a }
    L_0x029a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x029c }
    L_0x029c:
        r0 = move-exception;
        throw r0;
    L_0x029e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02a0 }
    L_0x02a0:
        r0 = move-exception;
        throw r0;
    L_0x02a2:
        r0 = move-exception;
        throw r0;
    L_0x02a4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02a6 }
    L_0x02a6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02a8 }
    L_0x02a8:
        r0 = move-exception;
        throw r0;
    L_0x02aa:
        r2 = r0;
        goto L_0x013c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.dump(java.lang.String, java.io.PrintWriter, boolean):void");
    }

    public BackStackRecord(FragmentManagerImpl fragmentManagerImpl) {
        this.mAllowAddToBackStack = true;
        this.mIndex = -1;
        this.mManager = fragmentManagerImpl;
    }

    public FragmentTransaction remove(Fragment fragment) {
        Op op = new Op();
        op.cmd = 3;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    private void excludeHiddenFragmentsAfterEnter(View view, TransitionState transitionState, int i, Object obj) {
        view.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass_3(this, view, transitionState, i, obj));
    }

    private static Object getEnterTransition(Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        Object reenterTransition;
        if (z) {
            try {
                reenterTransition = fragment.getReenterTransition();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        reenterTransition = fragment.getEnterTransition();
        return FragmentTransitionCompat21.cloneTransition(reenterTransition);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setNameOverrides(android.support.v4.app.BackStackRecord.TransitionState r7, android.support.v4.util.ArrayMap r8, boolean r9) {
        /*
        r6_this = this;
        r3 = android.support.v4.app.FragmentActivity.a;
        r4 = r8.size();
        r0 = 0;
        r2 = r0;
    L_0x0008:
        if (r2 >= r4) goto L_0x002c;
    L_0x000a:
        r0 = r8.keyAt(r2);
        r0 = (java.lang.String) r0;
        r1 = r8.valueAt(r2);
        r1 = (android.view.View) r1;
        r1 = android.support.v4.app.FragmentTransitionCompat21.getTransitionName(r1);
        if (r9 == 0) goto L_0x0023;
    L_0x001c:
        r5 = r7.nameOverrides;	 Catch:{ IllegalStateException -> 0x002d }
        setNameOverride(r5, r0, r1);	 Catch:{ IllegalStateException -> 0x002d }
        if (r3 == 0) goto L_0x0028;
    L_0x0023:
        r5 = r7.nameOverrides;	 Catch:{ IllegalStateException -> 0x002d }
        setNameOverride(r5, r1, r0);	 Catch:{ IllegalStateException -> 0x002d }
    L_0x0028:
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x002f;
    L_0x002c:
        return;
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r2 = r0;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.setNameOverrides(android.support.v4.app.BackStackRecord$TransitionState, android.support.v4.util.ArrayMap, boolean):void");
    }

    public FragmentTransaction disallowAddToBackStack() {
        try {
            if (this.mAddToBackStack) {
                throw new IllegalStateException(z[71]);
            }
            this.mAllowAddToBackStack = false;
            return this;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public FragmentTransaction detach(Fragment fragment) {
        Op op = new Op();
        op.cmd = 6;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void calculateFragments(android.util.SparseArray r8, android.util.SparseArray r9) {
        /*
        r7_this = this;
        r4 = android.support.v4.app.FragmentActivity.a;
        r0 = r7.mManager;	 Catch:{ IllegalStateException -> 0x000d }
        r0 = r0.mContainer;	 Catch:{ IllegalStateException -> 0x000d }
        r0 = r0.hasView();	 Catch:{ IllegalStateException -> 0x000d }
        if (r0 != 0) goto L_0x000f;
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = r7.mHead;
        r3 = r0;
    L_0x0012:
        if (r3 == 0) goto L_0x000c;
    L_0x0014:
        r0 = r3.cmd;	 Catch:{ IllegalStateException -> 0x007d }
        switch(r0) {
            case 1: goto L_0x001f;
            case 2: goto L_0x0026;
            case 3: goto L_0x0059;
            case 4: goto L_0x0060;
            case 5: goto L_0x0067;
            case 6: goto L_0x006e;
            case 7: goto L_0x0075;
            default: goto L_0x0019;
        };
    L_0x0019:
        r0 = r3.next;
        if (r4 != 0) goto L_0x000c;
    L_0x001d:
        r3 = r0;
        goto L_0x0012;
    L_0x001f:
        r0 = r3.fragment;	 Catch:{ IllegalStateException -> 0x007d }
        r7.setLastIn(r9, r0);	 Catch:{ IllegalStateException -> 0x007d }
        if (r4 == 0) goto L_0x0019;
    L_0x0026:
        r1 = r3.fragment;
        r0 = r7.mManager;
        r0 = r0.mAdded;
        if (r0 == 0) goto L_0x008f;
    L_0x002e:
        r0 = 0;
        r2 = r1;
        r1 = r0;
    L_0x0031:
        r0 = r7.mManager;
        r0 = r0.mAdded;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x0054;
    L_0x003b:
        r0 = r7.mManager;
        r0 = r0.mAdded;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r2 == 0) goto L_0x004d;
    L_0x0047:
        r5 = r0.mContainerId;	 Catch:{ IllegalStateException -> 0x007f }
        r6 = r2.mContainerId;	 Catch:{ IllegalStateException -> 0x007f }
        if (r5 != r6) goto L_0x0050;
    L_0x004d:
        if (r0 != r2) goto L_0x0081;
    L_0x004f:
        r2 = 0;
    L_0x0050:
        r0 = r1 + 1;
        if (r4 == 0) goto L_0x008d;
    L_0x0054:
        r7.setLastIn(r9, r2);	 Catch:{ IllegalStateException -> 0x0085 }
        if (r4 == 0) goto L_0x0019;
    L_0x0059:
        r0 = r3.fragment;	 Catch:{ IllegalStateException -> 0x0087 }
        setFirstOut(r8, r0);	 Catch:{ IllegalStateException -> 0x0087 }
        if (r4 == 0) goto L_0x0019;
    L_0x0060:
        r0 = r3.fragment;	 Catch:{ IllegalStateException -> 0x0089 }
        setFirstOut(r8, r0);	 Catch:{ IllegalStateException -> 0x0089 }
        if (r4 == 0) goto L_0x0019;
    L_0x0067:
        r0 = r3.fragment;	 Catch:{ IllegalStateException -> 0x008b }
        r7.setLastIn(r9, r0);	 Catch:{ IllegalStateException -> 0x008b }
        if (r4 == 0) goto L_0x0019;
    L_0x006e:
        r0 = r3.fragment;	 Catch:{ IllegalStateException -> 0x007b }
        setFirstOut(r8, r0);	 Catch:{ IllegalStateException -> 0x007b }
        if (r4 == 0) goto L_0x0019;
    L_0x0075:
        r0 = r3.fragment;	 Catch:{ IllegalStateException -> 0x007b }
        r7.setLastIn(r9, r0);	 Catch:{ IllegalStateException -> 0x007b }
        goto L_0x0019;
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        setFirstOut(r8, r0);
        goto L_0x0050;
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0089 }
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008b }
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007b }
    L_0x008d:
        r1 = r0;
        goto L_0x0031;
    L_0x008f:
        r2 = r1;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.calculateFragments(android.util.SparseArray, android.util.SparseArray):void");
    }

    public FragmentTransaction attach(Fragment fragment) {
        Op op = new Op();
        op.cmd = 7;
        op.fragment = fragment;
        addOp(op);
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setBackNameOverrides(android.support.v4.app.BackStackRecord.TransitionState r7, android.support.v4.util.ArrayMap r8, boolean r9) {
        /*
        r6_this = this;
        r0 = 0;
        r4 = android.support.v4.app.FragmentActivity.a;
        r1 = r6.mSharedElementTargetNames;	 Catch:{ IllegalStateException -> 0x003a }
        if (r1 != 0) goto L_0x003c;
    L_0x0007:
        r2 = r0;
    L_0x0008:
        r3 = r0;
    L_0x0009:
        if (r3 >= r2) goto L_0x0039;
    L_0x000b:
        r0 = r6.mSharedElementSourceNames;
        r0 = r0.get(r3);
        r0 = (java.lang.String) r0;
        r1 = r6.mSharedElementTargetNames;
        r1 = r1.get(r3);
        r1 = (java.lang.String) r1;
        r1 = r8.get(r1);
        r1 = (android.view.View) r1;
        if (r1 == 0) goto L_0x0035;
    L_0x0023:
        r1 = android.support.v4.app.FragmentTransitionCompat21.getTransitionName(r1);
        if (r9 == 0) goto L_0x0030;
    L_0x0029:
        r5 = r7.nameOverrides;	 Catch:{ IllegalStateException -> 0x0044 }
        setNameOverride(r5, r0, r1);	 Catch:{ IllegalStateException -> 0x0044 }
        if (r4 == 0) goto L_0x0035;
    L_0x0030:
        r5 = r7.nameOverrides;	 Catch:{ IllegalStateException -> 0x0044 }
        setNameOverride(r5, r1, r0);	 Catch:{ IllegalStateException -> 0x0044 }
    L_0x0035:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x0046;
    L_0x0039:
        return;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r1 = r6.mSharedElementTargetNames;
        r1 = r1.size();
        r2 = r1;
        goto L_0x0008;
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r3 = r0;
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.setBackNameOverrides(android.support.v4.app.BackStackRecord$TransitionState, android.support.v4.util.ArrayMap, boolean):void");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        try {
            stringBuilder.append(z[1]);
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            if (this.mIndex >= 0) {
                stringBuilder.append(z[0]);
                stringBuilder.append(this.mIndex);
            }
            try {
                if (this.mName != null) {
                    stringBuilder.append(" ");
                    stringBuilder.append(this.mName);
                }
                stringBuilder.append("}");
                return stringBuilder.toString();
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void doAddOp(int r5, android.support.v4.app.Fragment r6, java.lang.String r7, int r8) {
        /*
        r4_this = this;
        r0 = r4.mManager;	 Catch:{ IllegalStateException -> 0x004f }
        r6.mFragmentManager = r0;	 Catch:{ IllegalStateException -> 0x004f }
        if (r7 == 0) goto L_0x0055;
    L_0x0006:
        r0 = r6.mTag;	 Catch:{ IllegalStateException -> 0x0051 }
        if (r0 == 0) goto L_0x0053;
    L_0x000a:
        r0 = r6.mTag;	 Catch:{ IllegalStateException -> 0x004d }
        r0 = r7.equals(r0);	 Catch:{ IllegalStateException -> 0x004d }
        if (r0 != 0) goto L_0x0053;
    L_0x0012:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x004d }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x004d }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x004d }
        r2 = z;	 Catch:{ IllegalStateException -> 0x004d }
        r3 = 55;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x004d }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x004d }
        r1 = r1.append(r6);	 Catch:{ IllegalStateException -> 0x004d }
        r2 = z;	 Catch:{ IllegalStateException -> 0x004d }
        r3 = 59;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x004d }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x004d }
        r2 = r6.mTag;	 Catch:{ IllegalStateException -> 0x004d }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x004d }
        r2 = z;	 Catch:{ IllegalStateException -> 0x004d }
        r3 = 56;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x004d }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x004d }
        r1 = r1.append(r7);	 Catch:{ IllegalStateException -> 0x004d }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x004d }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x004d }
        throw r0;	 Catch:{ IllegalStateException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004d }
    L_0x0053:
        r6.mTag = r7;
    L_0x0055:
        if (r5 == 0) goto L_0x00a2;
    L_0x0057:
        r0 = r6.mFragmentId;	 Catch:{ IllegalStateException -> 0x009c }
        if (r0 == 0) goto L_0x009e;
    L_0x005b:
        r0 = r6.mFragmentId;	 Catch:{ IllegalStateException -> 0x009a }
        if (r0 == r5) goto L_0x009e;
    L_0x005f:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x009a }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x009a }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x009a }
        r2 = z;	 Catch:{ IllegalStateException -> 0x009a }
        r3 = 57;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x009a }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x009a }
        r1 = r1.append(r6);	 Catch:{ IllegalStateException -> 0x009a }
        r2 = z;	 Catch:{ IllegalStateException -> 0x009a }
        r3 = 58;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x009a }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x009a }
        r2 = r6.mFragmentId;	 Catch:{ IllegalStateException -> 0x009a }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x009a }
        r2 = z;	 Catch:{ IllegalStateException -> 0x009a }
        r3 = 60;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x009a }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x009a }
        r1 = r1.append(r5);	 Catch:{ IllegalStateException -> 0x009a }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x009a }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x009a }
        throw r0;	 Catch:{ IllegalStateException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009a }
    L_0x009e:
        r6.mFragmentId = r5;
        r6.mContainerId = r5;
    L_0x00a2:
        r0 = new android.support.v4.app.BackStackRecord$Op;
        r0.<init>();
        r0.cmd = r8;
        r0.fragment = r6;
        r4.addOp(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.doAddOp(int, android.support.v4.app.Fragment, java.lang.String, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void excludeHiddenFragments(android.support.v4.app.BackStackRecord.TransitionState r6, int r7, java.lang.Object r8) {
        /*
        r5_this = this;
        r0 = 0;
        r2 = android.support.v4.app.FragmentActivity.a;
        r1 = r5.mManager;
        r1 = r1.mAdded;
        if (r1 == 0) goto L_0x0058;
    L_0x0009:
        r1 = r0;
    L_0x000a:
        r0 = r5.mManager;
        r0 = r0.mAdded;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x0058;
    L_0x0014:
        r0 = r5.mManager;
        r0 = r0.mAdded;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.Fragment) r0;
        r3 = r0.mView;	 Catch:{ IllegalStateException -> 0x0059 }
        if (r3 == 0) goto L_0x0054;
    L_0x0022:
        r3 = r0.mContainer;	 Catch:{ IllegalStateException -> 0x005b }
        if (r3 == 0) goto L_0x0054;
    L_0x0026:
        r3 = r0.mContainerId;	 Catch:{ IllegalStateException -> 0x005d }
        if (r3 != r7) goto L_0x0054;
    L_0x002a:
        r3 = r0.mHidden;	 Catch:{ IllegalStateException -> 0x005f }
        if (r3 == 0) goto L_0x0047;
    L_0x002e:
        r3 = r6.hiddenFragmentViews;	 Catch:{ IllegalStateException -> 0x0061 }
        r4 = r0.mView;	 Catch:{ IllegalStateException -> 0x0061 }
        r3 = r3.contains(r4);	 Catch:{ IllegalStateException -> 0x0061 }
        if (r3 != 0) goto L_0x0054;
    L_0x0038:
        r3 = r0.mView;	 Catch:{ IllegalStateException -> 0x0063 }
        r4 = 1;
        android.support.v4.app.FragmentTransitionCompat21.excludeTarget(r8, r3, r4);	 Catch:{ IllegalStateException -> 0x0063 }
        r3 = r6.hiddenFragmentViews;	 Catch:{ IllegalStateException -> 0x0063 }
        r4 = r0.mView;	 Catch:{ IllegalStateException -> 0x0063 }
        r3.add(r4);	 Catch:{ IllegalStateException -> 0x0063 }
        if (r2 == 0) goto L_0x0054;
    L_0x0047:
        r3 = r0.mView;	 Catch:{ IllegalStateException -> 0x0063 }
        r4 = 0;
        android.support.v4.app.FragmentTransitionCompat21.excludeTarget(r8, r3, r4);	 Catch:{ IllegalStateException -> 0x0063 }
        r3 = r6.hiddenFragmentViews;	 Catch:{ IllegalStateException -> 0x0063 }
        r0 = r0.mView;	 Catch:{ IllegalStateException -> 0x0063 }
        r3.remove(r0);	 Catch:{ IllegalStateException -> 0x0063 }
    L_0x0054:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x0065;
    L_0x0058:
        return;
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r1 = r0;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.excludeHiddenFragments(android.support.v4.app.BackStackRecord$TransitionState, int, java.lang.Object):void");
    }

    private static void setNameOverride(ArrayMap arrayMap, String str, String str2) {
        boolean z = FragmentActivity.a;
        if (str != null && str2 != null) {
            try {
                if (!str.equals(str2)) {
                    int i = 0;
                    while (i < arrayMap.size()) {
                        try {
                            if (!str.equals(arrayMap.valueAt(i))) {
                                i++;
                                if (z) {
                                    break;
                                }
                            }
                            arrayMap.setValueAt(i, str2);
                            return;
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    arrayMap.put(str, str2);
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void addOp(android.support.v4.app.BackStackRecord.Op r2) {
        /*
        r1_this = this;
        r0 = r1.mHead;	 Catch:{ IllegalStateException -> 0x002d }
        if (r0 != 0) goto L_0x000c;
    L_0x0004:
        r1.mTail = r2;	 Catch:{ IllegalStateException -> 0x002f }
        r1.mHead = r2;	 Catch:{ IllegalStateException -> 0x002f }
        r0 = android.support.v4.app.FragmentActivity.a;	 Catch:{ IllegalStateException -> 0x002f }
        if (r0 == 0) goto L_0x0016;
    L_0x000c:
        r0 = r1.mTail;	 Catch:{ IllegalStateException -> 0x002f }
        r2.prev = r0;	 Catch:{ IllegalStateException -> 0x002f }
        r0 = r1.mTail;	 Catch:{ IllegalStateException -> 0x002f }
        r0.next = r2;	 Catch:{ IllegalStateException -> 0x002f }
        r1.mTail = r2;	 Catch:{ IllegalStateException -> 0x002f }
    L_0x0016:
        r0 = r1.mEnterAnim;
        r2.enterAnim = r0;
        r0 = r1.mExitAnim;
        r2.exitAnim = r0;
        r0 = r1.mPopEnterAnim;
        r2.popEnterAnim = r0;
        r0 = r1.mPopExitAnim;
        r2.popExitAnim = r0;
        r0 = r1.mNumOp;
        r0 = r0 + 1;
        r1.mNumOp = r0;
        return;
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002f }
    L_0x002f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackRecord.addOp(android.support.v4.app.BackStackRecord$Op):void");
    }
}
