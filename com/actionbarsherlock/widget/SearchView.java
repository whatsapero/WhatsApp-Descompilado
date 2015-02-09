package com.actionbarsherlock.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.widget.CursorAdapter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView.OnEditorActionListener;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.CollapsibleActionView;
import com.whatsapp.vk;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class SearchView extends LinearLayout implements CollapsibleActionView {
    public static boolean a;
    private static final String[] z;
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    private ImageView mCloseButton;
    private int mCollapsedImeOptions;
    private View mDropDownAnchor;
    private boolean mExpandedInActionView;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final OnClickListener mOnClickListener;
    private OnCloseListener mOnCloseListener;
    private final OnEditorActionListener mOnEditorActionListener;
    private final OnItemClickListener mOnItemClickListener;
    private final OnItemSelectedListener mOnItemSelectedListener;
    private OnQueryTextListener mOnQueryChangeListener;
    private OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private OnClickListener mOnSearchClickListener;
    private OnSuggestionListener mOnSuggestionListener;
    private final WeakHashMap mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private SearchAutoComplete mQueryTextView;
    private Runnable mReleaseCursorRunnable;
    private View mSearchButton;
    private View mSearchEditFrame;
    private ImageView mSearchHintIcon;
    private View mSearchPlate;
    private SearchableInfo mSearchable;
    private Runnable mShowImeRunnable;
    private View mSubmitArea;
    private View mSubmitButton;
    private boolean mSubmitButtonEnabled;
    private CursorAdapter mSuggestionsAdapter;
    OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    private View mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    public interface OnCloseListener {
        boolean onClose();
    }

    public interface OnQueryTextListener {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface OnSuggestionListener {
        boolean onSuggestionClick(int i);

        boolean onSuggestionSelect(int i);
    }

    public class SearchAutoComplete extends AutoCompleteTextView {
        private static final String z;
        private SearchView mSearchView;
        private int mThreshold;

        static {
            char[] toCharArray = "w\u001ese\u0017A\u001dfd\u000bq\u0014".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 30;
                        break;
                    case ay.f /*1*/:
                        i2 = 112;
                        break;
                    case ay.n /*2*/:
                        i2 = 3;
                        break;
                    case ay.p /*3*/:
                        i2 = 16;
                        break;
                    default:
                        i2 = 99;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mThreshold = getThreshold();
        }

        static boolean access$1700(com.actionbarsherlock.widget.SearchView.SearchAutoComplete searchAutoComplete) {
            return searchAutoComplete.isEmpty();
        }

        public void performCompletion() {
        }

        protected void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.mThreshold = getThreshold();
        }

        void setSearchView(SearchView searchView) {
            this.mSearchView = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.mThreshold = i;
        }

        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.mSearchView.onTextFocusChanged();
        }

        public SearchAutoComplete(Context context) {
            super(context);
            this.mThreshold = getThreshold();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                DispatcherState keyDispatcherState;
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.mSearchView.clearFocus();
                        SearchView.access$2300(this.mSearchView, false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public boolean enoughToFilter() {
            return this.mThreshold <= 0 || super.enoughToFilter();
        }

        private boolean isEmpty() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.mSearchView.hasFocus() && getVisibility() == 0) {
                ((InputMethodManager) getContext().getSystemService(z)).showSoftInput(this, 0);
                if (SearchView.isLandscapeMode(getContext())) {
                    SearchView.access$2200(this, true);
                }
            }
        }
    }

    static {
        String[] strArr = new String[42];
        String str = "n:jJK";
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
                        i3 = 31;
                        break;
                    case ay.f /*1*/:
                        i3 = 79;
                        break;
                    case ay.n /*2*/:
                        i3 = 15;
                        break;
                    case ay.p /*3*/:
                        i3 = 56;
                        break;
                    default:
                        i3 = 50;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "~,{Q]q\u0010bKU";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "v!{]\\k\u0010j@Fm.P\\Sk.PSWf";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "j<jJmn:jJK";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "~,{Q]q\u0010d]K";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "|.cT[q(PHS|$n_W";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "?o/";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "z!|M@z\u0006b]dv<fZ^z";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "l'`Oap){q\\o:{m\\|'j[Yz+";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "l*{lWg;";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "~!kJ]v+!Q\\k*aL\u001c~,{Q]qa\\}sM\fG";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "v!\u007fMF@\"jLZp+";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "L*nJQw\u0019f]E";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\\ zTV?!`L\u0012y&a\\\u0012i f[W?<jY@|'/YQk&yQFf";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    str = "{ N^Fz=[]Jk\fgY\\x*k";
                    obj = 14;
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    strArr2 = strArr3;
                    str = "{ M]Tp=jlWg;LPSq(j\\";
                    obj = 15;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "Y.fTW{ocYGq,g\u0018S|;fN[k65\u0018";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "L*nJQw\u0019f]E";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "h*mgAz.}[Z";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "~!kJ]v+!KBz*lP\u001cz7{JS1\u0003NvuJ\u000eH}mR\u0000K}~";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "~!kJ]v+!KBz*lP\u001c~,{Q]qa]}qP\bAqhZ\u0010\\hwZ\fG";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "~!kJ]v+!KBz*lP\u001c~,{Q]qaX}p@\u001cJy`\\\u0007";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "s.vWGk\u0010fVTs.{]@";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "l:h_Wl;PQ\\k*aLm{.{Ymv+";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "~!kJ]v+!Q\\k*aL\u001c~,{Q]qa\\}sM\fG";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "?=jLGm!j\\\u0012z7l]Bk&`V\u001c";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "l:h_Wl;PQ\\k*aLmn:jJK";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "l:h_Wl;PQ\\k*aLmz7{JS@+nLS";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "l:h_Wl;PQ\\k*aLm{.{Y";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "L*nJQw\u0019f]E";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    str = "l:h_Wl;PQ\\k*aLm~,{Q]q";
                    obj = 30;
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    strArr2 = strArr3;
                    str = "L*nJQwo|MUx*|L[p!|\u0018Qj=|W@?.{\u0018@p8/";
                    obj = 31;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "~!kJ]v+!Q\\k*aL\u001c~,{Q]qa\\}sM\fG";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "~!kJ]v+!KBz*lP\u001cz7{JS1\u0003NvuJ\u000eH}";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "~!kJ]v+!KBz*lP\u001cz7{JS1\u0003NvuJ\u000eH}mR\u0000K}~";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "~!kJ]v+!KBz*lP\u001cz7{JS1\u001dJkgS\u001b\\gbZ\u0001Kq|X\u0006AlwQ\u001b";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "y=j]my }U";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "|.cT[q(PHS|$n_W";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "~!kJ]v+!KBz*lP\u001cz7{JS1\u001f]w\u007fO\u001b";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "~!kJ]v+!KBz*lP\u001cz7{JS1\u001dJkgS\u001b\\gbZ\u0001Kq|X\u0006AlwQ\u001bPzgQ\u000bC}";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "~!kJ]v+!KBz*lP\u001cz7{JS1\u0002N`mM\n\\m~K\u001c";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "~?\u007fgV~;n";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void updateViewsVisibility(boolean z) {
        boolean z2 = true;
        int i = 8;
        try {
            this.mIconified = z;
            int i2 = z ? 0 : 8;
            try {
                boolean z3;
                if (TextUtils.isEmpty(this.mQueryTextView.getText())) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                try {
                    this.mSearchButton.setVisibility(i2);
                    updateSubmitButton(z3);
                    try {
                        this.mSearchEditFrame.setVisibility(z ? 8 : 0);
                        ImageView imageView = this.mSearchHintIcon;
                        if (!this.mIconifiedByDefault) {
                            i = 0;
                        }
                        try {
                            imageView.setVisibility(i);
                            updateCloseButton();
                            if (z3) {
                                z2 = false;
                            }
                            updateVoiceButton(z2);
                            updateSubmitArea();
                        } catch (ActivityNotFoundException e) {
                            throw e;
                        }
                    } catch (ActivityNotFoundException e2) {
                        throw e2;
                    }
                } catch (ActivityNotFoundException e22) {
                    throw e22;
                }
            } catch (ActivityNotFoundException e222) {
                throw e222;
            }
        } catch (ActivityNotFoundException e2222) {
            throw e2222;
        }
    }

    static void access$2200(AutoCompleteTextView autoCompleteTextView, boolean z) {
        ensureImeVisible(autoCompleteTextView, z);
    }

    private void forceSuggestionQuery() {
        try {
            Method method = SearchAutoComplete.class.getMethod(z[16], new Class[0]);
            Method method2 = SearchAutoComplete.class.getMethod(z[15], new Class[0]);
            method.setAccessible(true);
            method2.setAccessible(true);
            method.invoke(this.mQueryTextView, new Object[0]);
            method2.invoke(this.mQueryTextView, new Object[0]);
        } catch (Exception e) {
        }
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        try {
            String str;
            String str2 = z[6];
            if (searchActivity == null) {
                str = null;
            } else {
                str = searchActivity.flattenToShortString();
            }
            intent2.putExtra(str2, str);
            return intent2;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void onSearchClicked() {
        try {
            updateViewsVisibility(false);
            this.mQueryTextView.requestFocus();
            setImeVisibility(true);
            if (this.mOnSearchClickListener != null) {
                this.mOnSearchClickListener.onClick(this);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void access$600(SearchView searchView) {
        searchView.onSearchClicked();
    }

    static void access$800(SearchView searchView) {
        searchView.onCloseClicked();
    }

    static void access$100(SearchView searchView) {
        searchView.updateFocusedState();
    }

    static CursorAdapter access$200(SearchView searchView) {
        return searchView.mSuggestionsAdapter;
    }

    private void updateSubmitArea() {
        int i = 8;
        try {
            if (isSubmitAreaEnabled()) {
                if (this.mSubmitButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0) {
                    i = 0;
                }
            }
            this.mSubmitArea.setVisibility(i);
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public void setIconifiedByDefault(boolean z) {
        try {
            if (this.mIconifiedByDefault != z) {
                this.mIconifiedByDefault = z;
                updateViewsVisibility(z);
                updateQueryHint();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isSubmitAreaEnabled() {
        /*
        r1_this = this;
        r0 = r1.mSubmitButtonEnabled;	 Catch:{ ActivityNotFoundException -> 0x0010 }
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r1.mVoiceButtonEnabled;	 Catch:{ ActivityNotFoundException -> 0x0012 }
        if (r0 == 0) goto L_0x0016;
    L_0x0008:
        r0 = r1.isIconified();	 Catch:{ ActivityNotFoundException -> 0x0014 }
        if (r0 != 0) goto L_0x0016;
    L_0x000e:
        r0 = 1;
    L_0x000f:
        return r0;
    L_0x0010:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0012 }
    L_0x0012:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0014 }
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r0 = 0;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.SearchView.isSubmitAreaEnabled():boolean");
    }

    private boolean launchSuggestion(int i, int i2, String str) {
        Cursor cursor = this.mSuggestionsAdapter.getCursor();
        if (cursor != null) {
            try {
                if (cursor.moveToPosition(i)) {
                    launchIntent(createIntentFromSuggestion(cursor, i2, str));
                    return true;
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        return false;
    }

    private void setQuery(CharSequence charSequence) {
        try {
            int i;
            setText(this.mQueryTextView, charSequence, true);
            SearchAutoComplete searchAutoComplete = this.mQueryTextView;
            if (TextUtils.isEmpty(charSequence)) {
                i = 0;
            } else {
                i = charSequence.length();
            }
            searchAutoComplete.setSelection(i);
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void access$1000(SearchView searchView) {
        searchView.onSubmitQuery();
    }

    private void updateQueryHint() {
        boolean z = a;
        try {
            if (this.mQueryHint != null) {
                this.mQueryTextView.setHint(getDecoratedHint(this.mQueryHint));
                if (!z) {
                    return;
                }
            }
            if (this.mSearchable != null) {
                CharSequence charSequence = null;
                int hintId = this.mSearchable.getHintId();
                if (hintId != 0) {
                    charSequence = getContext().getString(hintId);
                }
                if (charSequence != null) {
                    try {
                        this.mQueryTextView.setHint(getDecoratedHint(charSequence));
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    }
                }
                if (!z) {
                    return;
                }
            }
            try {
                this.mQueryTextView.setHint(getDecoratedHint(""));
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    static View access$500(SearchView searchView) {
        return searchView.mSearchButton;
    }

    private void setImeVisibility(boolean z) {
        if (z) {
            try {
                post(this.mShowImeRunnable);
                if (!a) {
                    return;
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        removeCallbacks(this.mShowImeRunnable);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(z[12]);
        if (inputMethodManager != null) {
            try {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        }
    }

    void onQueryRefine(CharSequence charSequence) {
        setQuery(charSequence);
    }

    private void updateFocusedState() {
        boolean hasFocus = this.mQueryTextView.hasFocus();
        try {
            try {
                int[] iArr;
                this.mSearchPlate.getBackground().setState(hasFocus ? FOCUSED_STATE_SET : EMPTY_STATE_SET);
                Drawable background = this.mSubmitArea.getBackground();
                if (hasFocus) {
                    iArr = FOCUSED_STATE_SET;
                } else {
                    iArr = EMPTY_STATE_SET;
                }
                background.setState(iArr);
                invalidate();
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static View access$900(SearchView searchView) {
        return searchView.mSubmitButton;
    }

    private void updateVoiceButton(boolean z) {
        try {
            int i;
            if (this.mVoiceButtonEnabled) {
                if (!isIconified() && z) {
                    i = 0;
                    this.mSubmitButton.setVisibility(8);
                    this.mVoiceButton.setVisibility(i);
                }
            }
            i = 8;
            this.mVoiceButton.setVisibility(i);
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    private boolean onSuggestionsKey(View view, int i, KeyEvent keyEvent) {
        try {
            if (this.mSearchable == null) {
                return false;
            }
            try {
                if (this.mSuggestionsAdapter == null) {
                    return false;
                }
                try {
                    if (keyEvent.getAction() != 0) {
                        return false;
                    }
                    if (!KeyEventCompat.hasNoModifiers(keyEvent)) {
                        return false;
                    }
                    if (i == 66 || i == 84 || i == 61) {
                        return onItemClicked(this.mQueryTextView.getListSelection(), 0, null);
                    }
                    if (i == 21 || i == 22) {
                        int i2;
                        if (i == 21) {
                            i2 = 0;
                        } else {
                            i2 = this.mQueryTextView.length();
                        }
                        this.mQueryTextView.setSelection(i2);
                        this.mQueryTextView.setListSelection(0);
                        this.mQueryTextView.clearListSelection();
                        ensureImeVisible(this.mQueryTextView, true);
                        return true;
                    } else if (i != 19) {
                        return false;
                    } else {
                        try {
                            return this.mQueryTextView.getListSelection() == 0 ? false : false;
                        } catch (ActivityNotFoundException e) {
                            throw e;
                        }
                    }
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                } catch (ActivityNotFoundException e22) {
                    try {
                        throw e22;
                    } catch (ActivityNotFoundException e222) {
                        try {
                            throw e222;
                        } catch (ActivityNotFoundException e2222) {
                            throw e2222;
                        }
                    }
                }
            } catch (ActivityNotFoundException e22222) {
                throw e22222;
            }
        } catch (ActivityNotFoundException e222222) {
            throw e222222;
        }
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        try {
            this.mQueryTextView.setText(charSequence);
            if (charSequence != null) {
                this.mQueryTextView.setSelection(this.mQueryTextView.length());
                this.mUserQuery = charSequence;
            }
            if (z) {
                try {
                    if (!TextUtils.isEmpty(charSequence)) {
                        onSubmitQuery();
                    }
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public void onActionViewExpanded() {
        try {
            if (!this.mExpandedInActionView) {
                this.mExpandedInActionView = true;
                this.mCollapsedImeOptions = this.mQueryTextView.getImeOptions();
                this.mQueryTextView.setImeOptions(this.mCollapsedImeOptions | 33554432);
                this.mQueryTextView.setText("");
                setIconified(false);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    private Intent createIntent(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        try {
            intent.addFlags(268435456);
            if (uri != null) {
                intent.setData(uri);
            }
            try {
                intent.putExtra(z[4], this.mUserQuery);
                if (str3 != null) {
                    intent.putExtra(z[0], str3);
                }
                if (str2 != null) {
                    try {
                        intent.putExtra(z[3], str2);
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    }
                }
                try {
                    if (this.mAppSearchData != null) {
                        intent.putExtra(z[1], this.mAppSearchData);
                    }
                    if (i != 0) {
                        try {
                            intent.putExtra(z[5], i);
                            intent.putExtra(z[2], str4);
                        } catch (ActivityNotFoundException e2) {
                            throw e2;
                        }
                    }
                    intent.setComponent(this.mSearchable.getSearchActivity());
                    return intent;
                } catch (ActivityNotFoundException e22) {
                    throw e22;
                }
            } catch (ActivityNotFoundException e222) {
                throw e222;
            }
        } catch (ActivityNotFoundException e2222) {
            throw e2222;
        }
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
        this.mOnQueryChangeListener = onQueryTextListener;
    }

    static void access$400(SearchView searchView) {
        searchView.adjustDropDownSizeAndPosition();
    }

    static OnFocusChangeListener access$300(SearchView searchView) {
        return searchView.mOnQueryTextFocusChangeListener;
    }

    private static void showSoftInputUnchecked(View view, InputMethodManager inputMethodManager, int i) {
        try {
            Method method = inputMethodManager.getClass().getMethod(z[9], new Class[]{Integer.TYPE, ResultReceiver.class});
            method.setAccessible(true);
            method.invoke(inputMethodManager, new Object[]{Integer.valueOf(i), null});
        } catch (Exception e) {
            inputMethodManager.showSoftInput(view, i);
        }
    }

    static void access$000(View view, InputMethodManager inputMethodManager, int i) {
        showSoftInputUnchecked(view, inputMethodManager, i);
    }

    private void adjustDropDownSizeAndPosition() {
        if (this.mDropDownAnchor.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            try {
                int dimensionPixelSize;
                if (this.mIconifiedByDefault) {
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abs__dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abs__dropdownitem_icon_width);
                } else {
                    dimensionPixelSize = 0;
                }
                this.mQueryTextView.getDropDownBackground().getPadding(rect);
                this.mQueryTextView.setDropDownHorizontalOffset((-(rect.left + dimensionPixelSize)) + paddingLeft);
                this.mQueryTextView.setDropDownWidth((dimensionPixelSize + (rect.right + (this.mDropDownAnchor.getWidth() + rect.left))) - paddingLeft);
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
    }

    static boolean access$1600(SearchView searchView, View view, int i, KeyEvent keyEvent) {
        return searchView.onSuggestionsKey(view, i, keyEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            return this.mSearchable == null ? false : super.onKeyDown(i, keyEvent);
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void access$1800(SearchView searchView, int i, String str, String str2) {
        searchView.launchQuerySearch(i, str, str2);
    }

    private void dismissSuggestions() {
        this.mQueryTextView.dismissDropDown();
    }

    public void onActionViewCollapsed() {
        clearFocus();
        updateViewsVisibility(true);
        this.mQueryTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    static void access$2100(SearchView searchView, CharSequence charSequence) {
        searchView.onTextChanged(charSequence);
    }

    private boolean onItemClicked(int i, int i2, String str) {
        try {
            if (this.mOnSuggestionListener != null) {
                try {
                    if (this.mOnSuggestionListener.onSuggestionClick(i)) {
                        return false;
                    }
                }
            }
            launchSuggestion(i, 0, null);
            setImeVisibility(false);
            dismissSuggestions();
            return true;
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public boolean requestFocus(int i, Rect rect) {
        try {
            if (this.mClearingFocus) {
                return false;
            }
            try {
                if (!isFocusable()) {
                    return false;
                }
                if (isIconified()) {
                    return super.requestFocus(i, rect);
                }
                boolean requestFocus = this.mQueryTextView.requestFocus(i, rect);
                if (!requestFocus) {
                    return requestFocus;
                }
                try {
                    updateViewsVisibility(false);
                    return requestFocus;
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(SearchView.class.getName());
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public void setInputType(int i) {
        this.mQueryTextView.setInputType(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchView(android.content.Context r8, android.util.AttributeSet r9) {
        /*
        r7_this = this;
        r2 = 1;
        r1 = 0;
        r6 = -1;
        r3 = a;
        r7.<init>(r8, r9);
        r0 = new com.actionbarsherlock.widget.SearchView$1;
        r0.<init>(r7);
        r7.mShowImeRunnable = r0;
        r0 = new com.actionbarsherlock.widget.SearchView$2;
        r0.<init>(r7);
        r7.mUpdateDrawableStateRunnable = r0;
        r0 = new com.actionbarsherlock.widget.SearchView$3;
        r0.<init>(r7);
        r7.mReleaseCursorRunnable = r0;
        r0 = new java.util.WeakHashMap;
        r0.<init>();
        r7.mOutsideDrawablesCache = r0;
        r0 = new com.actionbarsherlock.widget.SearchView$7;
        r0.<init>(r7);
        r7.mOnClickListener = r0;
        r0 = new com.actionbarsherlock.widget.SearchView$8;
        r0.<init>(r7);
        r7.mTextKeyListener = r0;
        r0 = new com.actionbarsherlock.widget.SearchView$9;
        r0.<init>(r7);
        r7.mOnEditorActionListener = r0;
        r0 = new com.actionbarsherlock.widget.SearchView$10;
        r0.<init>(r7);
        r7.mOnItemClickListener = r0;
        r0 = new com.actionbarsherlock.widget.SearchView$11;
        r0.<init>(r7);
        r7.mOnItemSelectedListener = r0;
        r0 = new com.actionbarsherlock.widget.SearchView$12;
        r0.<init>(r7);
        r7.mTextWatcher = r0;
        r0 = android.os.Build.VERSION.SDK_INT;
        r4 = 8;
        if (r0 >= r4) goto L_0x0054;
    L_0x0054:
        r0 = z;
        r4 = 23;
        r0 = r0[r4];
        r0 = r8.getSystemService(r0);
        r0 = (android.view.LayoutInflater) r0;
        r4 = com.actionbarsherlock.R.layout.abs__search_view;
        r0.inflate(r4, r7, r2);
        r0 = com.actionbarsherlock.R.id.abs__search_button;
        r0 = r7.findViewById(r0);
        r7.mSearchButton = r0;
        r0 = com.actionbarsherlock.R.id.abs__search_src_text;
        r0 = r7.findViewById(r0);
        r0 = (com.actionbarsherlock.widget.SearchView.SearchAutoComplete) r0;
        r7.mQueryTextView = r0;
        r0 = r7.mQueryTextView;
        r0.setSearchView(r7);
        r0 = com.actionbarsherlock.R.id.abs__search_edit_frame;
        r0 = r7.findViewById(r0);
        r7.mSearchEditFrame = r0;
        r0 = com.actionbarsherlock.R.id.abs__search_plate;
        r0 = r7.findViewById(r0);
        r7.mSearchPlate = r0;
        r0 = com.actionbarsherlock.R.id.abs__submit_area;
        r0 = r7.findViewById(r0);
        r7.mSubmitArea = r0;
        r0 = com.actionbarsherlock.R.id.abs__search_go_btn;
        r0 = r7.findViewById(r0);
        r7.mSubmitButton = r0;
        r0 = com.actionbarsherlock.R.id.abs__search_close_btn;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r7.mCloseButton = r0;
        r0 = com.actionbarsherlock.R.id.abs__search_voice_btn;
        r0 = r7.findViewById(r0);
        r7.mVoiceButton = r0;
        r0 = com.actionbarsherlock.R.id.abs__search_mag_icon;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r7.mSearchHintIcon = r0;
        r0 = r7.mSearchButton;
        r4 = r7.mOnClickListener;
        r0.setOnClickListener(r4);
        r0 = r7.mCloseButton;
        r4 = r7.mOnClickListener;
        r0.setOnClickListener(r4);
        r0 = r7.mSubmitButton;
        r4 = r7.mOnClickListener;
        r0.setOnClickListener(r4);
        r0 = r7.mVoiceButton;
        r4 = r7.mOnClickListener;
        r0.setOnClickListener(r4);
        r0 = r7.mQueryTextView;
        r4 = r7.mOnClickListener;
        r0.setOnClickListener(r4);
        r0 = r7.mQueryTextView;
        r4 = r7.mTextWatcher;
        r0.addTextChangedListener(r4);
        r0 = r7.mQueryTextView;
        r4 = r7.mOnEditorActionListener;
        r0.setOnEditorActionListener(r4);
        r0 = r7.mQueryTextView;
        r4 = r7.mOnItemClickListener;
        r0.setOnItemClickListener(r4);
        r0 = r7.mQueryTextView;
        r4 = r7.mOnItemSelectedListener;
        r0.setOnItemSelectedListener(r4);
        r0 = r7.mQueryTextView;
        r4 = r7.mTextKeyListener;
        r0.setOnKeyListener(r4);
        r0 = r7.mQueryTextView;
        r4 = new com.actionbarsherlock.widget.SearchView$4;
        r4.<init>(r7);
        r0.setOnFocusChangeListener(r4);
        r0 = com.actionbarsherlock.R.styleable.SherlockSearchView;
        r0 = r8.obtainStyledAttributes(r9, r0, r1, r1);
        r4 = com.actionbarsherlock.R.styleable.SherlockSearchView_iconifiedByDefault;
        r4 = r0.getBoolean(r4, r2);
        r7.setIconifiedByDefault(r4);
        r4 = com.actionbarsherlock.R.styleable.SherlockSearchView_android_maxWidth;
        r4 = r0.getDimensionPixelSize(r4, r6);
        if (r4 == r6) goto L_0x0122;
    L_0x011f:
        r7.setMaxWidth(r4);	 Catch:{ ActivityNotFoundException -> 0x01d5 }
    L_0x0122:
        r4 = com.actionbarsherlock.R.styleable.SherlockSearchView_queryHint;
        r4 = r0.getText(r4);
        r5 = android.text.TextUtils.isEmpty(r4);	 Catch:{ ActivityNotFoundException -> 0x01d7 }
        if (r5 != 0) goto L_0x0131;
    L_0x012e:
        r7.setQueryHint(r4);	 Catch:{ ActivityNotFoundException -> 0x01d7 }
    L_0x0131:
        r4 = com.actionbarsherlock.R.styleable.SherlockSearchView_android_imeOptions;
        r4 = r0.getInt(r4, r6);
        if (r4 == r6) goto L_0x013c;
    L_0x0139:
        r7.setImeOptions(r4);	 Catch:{ ActivityNotFoundException -> 0x01d9 }
    L_0x013c:
        r4 = com.actionbarsherlock.R.styleable.SherlockSearchView_android_inputType;
        r4 = r0.getInt(r4, r6);
        if (r4 == r6) goto L_0x0147;
    L_0x0144:
        r7.setInputType(r4);	 Catch:{ ActivityNotFoundException -> 0x01db }
    L_0x0147:
        r0.recycle();
        r0 = com.actionbarsherlock.R.styleable.SherlockView;
        r0 = r8.obtainStyledAttributes(r9, r0, r1, r1);
        r4 = com.actionbarsherlock.R.styleable.SherlockView_android_focusable;
        r4 = r0.getBoolean(r4, r2);
        r0.recycle();	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r7.setFocusable(r4);	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r4 = z;	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r5 = 22;
        r4 = r4[r5];	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r0.<init>(r4);	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r7.mVoiceWebSearchIntent = r0;	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r0 = r7.mVoiceWebSearchIntent;	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r4 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0.addFlags(r4);	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r0 = r7.mVoiceWebSearchIntent;	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r4 = z;	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r5 = 20;
        r4 = r4[r5];	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r5 = z;	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r6 = 19;
        r5 = r5[r6];	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r0.putExtra(r4, r5);	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r4 = z;	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r5 = 21;
        r4 = r4[r5];	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r0.<init>(r4);	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r7.mVoiceAppSearchIntent = r0;	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r0 = r7.mVoiceAppSearchIntent;	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r4 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0.addFlags(r4);	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r0 = r7.mQueryTextView;	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r0 = r0.getDropDownAnchor();	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r0 = r7.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r7.mDropDownAnchor = r0;	 Catch:{ ActivityNotFoundException -> 0x01dd }
        r0 = r7.mDropDownAnchor;	 Catch:{ ActivityNotFoundException -> 0x01dd }
        if (r0 == 0) goto L_0x01cc;
    L_0x01a5:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ActivityNotFoundException -> 0x01df }
        r4 = 11;
        if (r0 < r4) goto L_0x01be;
    L_0x01ab:
        r0 = r7.mDropDownAnchor;	 Catch:{ ActivityNotFoundException -> 0x01e1 }
        r4 = new com.actionbarsherlock.widget.SearchView$5;	 Catch:{ ActivityNotFoundException -> 0x01e1 }
        r4.<init>(r7);	 Catch:{ ActivityNotFoundException -> 0x01e1 }
        r0.addOnLayoutChangeListener(r4);	 Catch:{ ActivityNotFoundException -> 0x01e1 }
        if (r3 == 0) goto L_0x01cc;
    L_0x01b7:
        r0 = com.actionbarsherlock.app.SherlockActivity.a;	 Catch:{ ActivityNotFoundException -> 0x01e3 }
        if (r0 == 0) goto L_0x01e5;
    L_0x01bb:
        r0 = r1;
    L_0x01bc:
        com.actionbarsherlock.app.SherlockActivity.a = r0;
    L_0x01be:
        r0 = r7.mDropDownAnchor;
        r0 = r0.getViewTreeObserver();
        r1 = new com.actionbarsherlock.widget.SearchView$6;
        r1.<init>(r7);
        r0.addOnGlobalLayoutListener(r1);
    L_0x01cc:
        r0 = r7.mIconifiedByDefault;
        r7.updateViewsVisibility(r0);
        r7.updateQueryHint();
        return;
    L_0x01d5:
        r0 = move-exception;
        throw r0;
    L_0x01d7:
        r0 = move-exception;
        throw r0;
    L_0x01d9:
        r0 = move-exception;
        throw r0;
    L_0x01db:
        r0 = move-exception;
        throw r0;
    L_0x01dd:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01df }
    L_0x01df:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01e1 }
    L_0x01e1:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01e3 }
    L_0x01e3:
        r0 = move-exception;
        throw r0;
    L_0x01e5:
        r0 = r2;
        goto L_0x01bc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.SearchView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    static void access$1400(SearchView searchView) {
        searchView.forceSuggestionQuery();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onSubmitQuery() {
        /*
        r3_this = this;
        r0 = r3.mQueryTextView;
        r0 = r0.getText();
        if (r0 == 0) goto L_0x0032;
    L_0x0008:
        r1 = android.text.TextUtils.getTrimmedLength(r0);	 Catch:{ ActivityNotFoundException -> 0x0033 }
        if (r1 <= 0) goto L_0x0032;
    L_0x000e:
        r1 = r3.mOnQueryChangeListener;	 Catch:{ ActivityNotFoundException -> 0x0035 }
        if (r1 == 0) goto L_0x001e;
    L_0x0012:
        r1 = r3.mOnQueryChangeListener;	 Catch:{ ActivityNotFoundException -> 0x0037 }
        r2 = r0.toString();	 Catch:{ ActivityNotFoundException -> 0x0037 }
        r1 = r1.onQueryTextSubmit(r2);	 Catch:{ ActivityNotFoundException -> 0x0037 }
        if (r1 != 0) goto L_0x0032;
    L_0x001e:
        r1 = r3.mSearchable;	 Catch:{ ActivityNotFoundException -> 0x0039 }
        if (r1 == 0) goto L_0x002f;
    L_0x0022:
        r1 = 0;
        r2 = 0;
        r0 = r0.toString();	 Catch:{ ActivityNotFoundException -> 0x0039 }
        r3.launchQuerySearch(r1, r2, r0);	 Catch:{ ActivityNotFoundException -> 0x0039 }
        r0 = 0;
        r3.setImeVisibility(r0);	 Catch:{ ActivityNotFoundException -> 0x0039 }
    L_0x002f:
        r3.dismissSuggestions();
    L_0x0032:
        return;
    L_0x0033:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0035 }
    L_0x0035:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0037 }
    L_0x0037:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0039 }
    L_0x0039:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.SearchView.onSubmitQuery():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r4, int r5) {
        /*
        r3_this = this;
        r1 = a;
        r0 = r3.isIconified();	 Catch:{ ActivityNotFoundException -> 0x000c }
        if (r0 == 0) goto L_0x000e;
    L_0x0008:
        super.onMeasure(r4, r5);	 Catch:{ ActivityNotFoundException -> 0x000c }
    L_0x000b:
        return;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r2 = android.view.View.MeasureSpec.getMode(r4);
        r0 = android.view.View.MeasureSpec.getSize(r4);
        switch(r2) {
            case -2147483648: goto L_0x0023;
            case 0: goto L_0x0045;
            case 1073741824: goto L_0x0039;
            default: goto L_0x0019;
        };
    L_0x0019:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1);
        super.onMeasure(r0, r5);
        goto L_0x000b;
    L_0x0023:
        r2 = r3.mMaxWidth;	 Catch:{ ActivityNotFoundException -> 0x004c }
        if (r2 <= 0) goto L_0x002f;
    L_0x0027:
        r2 = r3.mMaxWidth;
        r0 = java.lang.Math.min(r2, r0);
        if (r1 == 0) goto L_0x0019;
    L_0x002f:
        r2 = r3.getPreferredWidth();
        r0 = java.lang.Math.min(r2, r0);
        if (r1 == 0) goto L_0x0019;
    L_0x0039:
        r2 = r3.mMaxWidth;	 Catch:{ ActivityNotFoundException -> 0x004e }
        if (r2 <= 0) goto L_0x0019;
    L_0x003d:
        r2 = r3.mMaxWidth;
        r0 = java.lang.Math.min(r2, r0);
        if (r1 == 0) goto L_0x0019;
    L_0x0045:
        r0 = r3.mMaxWidth;	 Catch:{ ActivityNotFoundException -> 0x0050 }
        if (r0 <= 0) goto L_0x0052;
    L_0x0049:
        r0 = r3.mMaxWidth;	 Catch:{ ActivityNotFoundException -> 0x0050 }
        goto L_0x0019;
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r0 = r3.getPreferredWidth();
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.SearchView.onMeasure(int, int):void");
    }

    static boolean access$2000(SearchView searchView, int i) {
        return searchView.onItemSelected(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateSubmitButton(boolean r3) {
        /*
        r2_this = this;
        r0 = 8;
        r1 = r2.mSubmitButtonEnabled;	 Catch:{ ActivityNotFoundException -> 0x001f }
        if (r1 == 0) goto L_0x0019;
    L_0x0006:
        r1 = r2.isSubmitAreaEnabled();	 Catch:{ ActivityNotFoundException -> 0x0021 }
        if (r1 == 0) goto L_0x0019;
    L_0x000c:
        r1 = r2.hasFocus();	 Catch:{ ActivityNotFoundException -> 0x0023 }
        if (r1 == 0) goto L_0x0019;
    L_0x0012:
        if (r3 != 0) goto L_0x0018;
    L_0x0014:
        r1 = r2.mVoiceButtonEnabled;	 Catch:{ ActivityNotFoundException -> 0x0025 }
        if (r1 != 0) goto L_0x0019;
    L_0x0018:
        r0 = 0;
    L_0x0019:
        r1 = r2.mSubmitButton;
        r1.setVisibility(r0);
        return;
    L_0x001f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.SearchView.updateSubmitButton(boolean):void");
    }

    static SearchAutoComplete access$1300(SearchView searchView) {
        return searchView.mQueryTextView;
    }

    private boolean onItemSelected(int i) {
        try {
            if (this.mOnSuggestionListener != null) {
                if (this.mOnSuggestionListener.onSuggestionSelect(i)) {
                    try {
                        return false;
                    }
                }
            }
            rewriteQueryFromSuggestion(i);
            return true;
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static boolean access$1900(SearchView searchView, int i, int i2, String str) {
        return searchView.onItemClicked(i, i2, str);
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        requestLayout();
    }

    static void access$1200(SearchView searchView) {
        searchView.onVoiceClicked();
    }

    static SearchableInfo access$1500(SearchView searchView) {
        return searchView.mSearchable;
    }

    static void access$2300(SearchView searchView, boolean z) {
        searchView.setImeVisibility(z);
    }

    private void launchQuerySearch(int i, String str, String str2) {
        getContext().startActivity(createIntent(z[11], null, null, str2, i, str));
    }

    private void onTextChanged(CharSequence charSequence) {
        boolean z = true;
        CharSequence text = this.mQueryTextView.getText();
        try {
            boolean z2;
            this.mUserQuery = text;
            if (TextUtils.isEmpty(text)) {
                z2 = false;
            } else {
                z2 = true;
            }
            try {
                updateSubmitButton(z2);
                if (z2) {
                    z = false;
                }
                try {
                    updateVoiceButton(z);
                    updateCloseButton();
                    updateSubmitArea();
                    if (this.mOnQueryChangeListener != null) {
                        if (!TextUtils.equals(charSequence, this.mOldQueryText)) {
                            this.mOnQueryChangeListener.onQueryTextChange(charSequence.toString());
                        }
                    }
                    this.mOldQueryText = charSequence.toString();
                } catch (ActivityNotFoundException e) {
                    throw e;
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
            } catch (ActivityNotFoundException e22) {
                throw e22;
            }
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    public void clearFocus() {
        this.mClearingFocus = true;
        setImeVisibility(false);
        super.clearFocus();
        this.mQueryTextView.clearFocus();
        this.mClearingFocus = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateCloseButton() {
        /*
        r4_this = this;
        r1 = 1;
        r2 = 0;
        r0 = r4.mQueryTextView;	 Catch:{ ActivityNotFoundException -> 0x002e }
        r0 = r0.getText();	 Catch:{ ActivityNotFoundException -> 0x002e }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ ActivityNotFoundException -> 0x002e }
        if (r0 != 0) goto L_0x0030;
    L_0x000e:
        r0 = r1;
    L_0x000f:
        if (r0 != 0) goto L_0x0019;
    L_0x0011:
        r3 = r4.mIconifiedByDefault;	 Catch:{ ActivityNotFoundException -> 0x0032 }
        if (r3 == 0) goto L_0x0036;
    L_0x0015:
        r3 = r4.mExpandedInActionView;	 Catch:{ ActivityNotFoundException -> 0x0034 }
        if (r3 != 0) goto L_0x0036;
    L_0x0019:
        r3 = r4.mCloseButton;	 Catch:{ ActivityNotFoundException -> 0x0038 }
        if (r1 == 0) goto L_0x003a;
    L_0x001d:
        r3.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x003d }
        r1 = r4.mCloseButton;	 Catch:{ ActivityNotFoundException -> 0x003d }
        r1 = r1.getDrawable();	 Catch:{ ActivityNotFoundException -> 0x003d }
        if (r0 == 0) goto L_0x003f;
    L_0x0028:
        r0 = ENABLED_STATE_SET;	 Catch:{ ActivityNotFoundException -> 0x003d }
    L_0x002a:
        r1.setState(r0);
        return;
    L_0x002e:
        r0 = move-exception;
        throw r0;
    L_0x0030:
        r0 = r2;
        goto L_0x000f;
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r1 = r2;
        goto L_0x0019;
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r2 = 8;
        goto L_0x001d;
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r0 = EMPTY_STATE_SET;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.SearchView.updateCloseButton():void");
    }

    private static void ensureImeVisible(AutoCompleteTextView autoCompleteTextView, boolean z) {
        try {
            Method method = AutoCompleteTextView.class.getMethod(z[8], new Class[]{Boolean.TYPE});
            method.setAccessible(true);
            method.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
        }
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.mOnCloseListener = onCloseListener;
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        String string;
        String string2;
        String str = null;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent(z[33]);
        intent2.setComponent(searchActivity);
        Parcelable activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Intent intent3 = new Intent(intent);
        String str2 = z[37];
        int i = 1;
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str2 = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        if (searchableInfo.getVoicePromptTextId() != 0) {
            string = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            string = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            string2 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            string2 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        try {
            intent3.putExtra(z[35], str2);
            intent3.putExtra(z[39], string);
            intent3.putExtra(z[34], string2);
            intent3.putExtra(z[41], i);
            str2 = z[38];
            if (searchActivity != null) {
                str = searchActivity.flattenToShortString();
            }
            intent3.putExtra(str2, str);
            intent3.putExtra(z[36], activity);
            intent3.putExtra(z[40], bundle);
            return intent3;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    void onTextFocusChanged() {
        try {
            updateViewsVisibility(isIconified());
            postUpdateFocusedState();
            if (this.mQueryTextView.hasFocus()) {
                forceSuggestionQuery();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public void setIconified(boolean z) {
        try {
            if (z) {
                onCloseClicked();
                if (!a) {
                    return;
                }
            }
            onSearchClicked();
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private CharSequence getDecoratedHint(CharSequence charSequence) {
        try {
            if (!this.mIconifiedByDefault) {
                return charSequence;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z[7]);
            spannableStringBuilder.append(charSequence);
            Drawable drawable = getContext().getResources().getDrawable(getSearchIconId());
            int textSize = (int) (((double) this.mQueryTextView.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            return spannableStringBuilder;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.mQueryHint = charSequence;
        updateQueryHint();
    }

    private void onVoiceClicked() {
        try {
            if (this.mSearchable != null) {
                SearchableInfo searchableInfo = this.mSearchable;
                try {
                    if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        getContext().startActivity(createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, searchableInfo));
                        if (!a) {
                            return;
                        }
                    }
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        getContext().startActivity(createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, searchableInfo));
                    }
                } catch (ActivityNotFoundException e) {
                    throw e;
                } catch (ActivityNotFoundException e2) {
                    Log.w(z[13], z[14]);
                }
            }
        } catch (ActivityNotFoundException e3) {
            throw e3;
        }
    }

    static View access$1100(SearchView searchView) {
        return searchView.mVoiceButton;
    }

    static ImageView access$700(SearchView searchView) {
        return searchView.mCloseButton;
    }

    private void launchIntent(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (Throwable e) {
                Log.e(z[18], z[17] + intent, e);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onCloseClicked() {
        /*
        r2_this = this;
        r0 = r2.mQueryTextView;
        r0 = r0.getText();
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ ActivityNotFoundException -> 0x0038 }
        if (r0 == 0) goto L_0x0027;
    L_0x000c:
        r0 = r2.mIconifiedByDefault;	 Catch:{ ActivityNotFoundException -> 0x003a }
        if (r0 == 0) goto L_0x0037;
    L_0x0010:
        r0 = r2.mOnCloseListener;	 Catch:{ ActivityNotFoundException -> 0x003c }
        if (r0 == 0) goto L_0x001c;
    L_0x0014:
        r0 = r2.mOnCloseListener;	 Catch:{ ActivityNotFoundException -> 0x003e }
        r0 = r0.onClose();	 Catch:{ ActivityNotFoundException -> 0x003e }
        if (r0 != 0) goto L_0x0037;
    L_0x001c:
        r2.clearFocus();	 Catch:{ ActivityNotFoundException -> 0x0040 }
        r0 = 1;
        r2.updateViewsVisibility(r0);	 Catch:{ ActivityNotFoundException -> 0x0040 }
        r0 = a;	 Catch:{ ActivityNotFoundException -> 0x0040 }
        if (r0 == 0) goto L_0x0037;
    L_0x0027:
        r0 = r2.mQueryTextView;	 Catch:{ ActivityNotFoundException -> 0x0040 }
        r1 = "";
        r0.setText(r1);	 Catch:{ ActivityNotFoundException -> 0x0040 }
        r0 = r2.mQueryTextView;	 Catch:{ ActivityNotFoundException -> 0x0040 }
        r0.requestFocus();	 Catch:{ ActivityNotFoundException -> 0x0040 }
        r0 = 1;
        r2.setImeVisibility(r0);	 Catch:{ ActivityNotFoundException -> 0x0040 }
    L_0x0037:
        return;
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.SearchView.onCloseClicked():void");
    }

    private int getSearchIconId() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.searchViewSearchIcon, typedValue, true);
        return typedValue.resourceId;
    }

    public void setImeOptions(int i) {
        this.mQueryTextView.setImeOptions(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void rewriteQueryFromSuggestion(int r5) {
        /*
        r4_this = this;
        r0 = a;
        r1 = r4.mQueryTextView;
        r1 = r1.getText();
        r2 = r4.mSuggestionsAdapter;
        r2 = r2.getCursor();
        if (r2 != 0) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        r3 = r2.moveToPosition(r5);
        if (r3 == 0) goto L_0x0029;
    L_0x0017:
        r3 = r4.mSuggestionsAdapter;
        r2 = r3.convertToString(r2);
        if (r2 == 0) goto L_0x0024;
    L_0x001f:
        r4.setQuery(r2);	 Catch:{ ActivityNotFoundException -> 0x002f }
        if (r0 == 0) goto L_0x0027;
    L_0x0024:
        r4.setQuery(r1);	 Catch:{ ActivityNotFoundException -> 0x002f }
    L_0x0027:
        if (r0 == 0) goto L_0x0010;
    L_0x0029:
        r4.setQuery(r1);	 Catch:{ ActivityNotFoundException -> 0x002d }
        goto L_0x0010;
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.SearchView.rewriteQueryFromSuggestion(int):void");
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abs__search_view_preferred_width);
    }

    private Intent createIntentFromSuggestion(Cursor cursor, int i, String str) {
        try {
            Uri uri;
            String columnString = SuggestionsAdapter.getColumnString(cursor, z[31]);
            if (columnString == null) {
                columnString = this.mSearchable.getSuggestIntentAction();
            }
            if (columnString == null) {
                columnString = z[25];
            }
            String columnString2 = SuggestionsAdapter.getColumnString(cursor, z[29]);
            if (columnString2 == null) {
                columnString2 = this.mSearchable.getSuggestIntentData();
            }
            if (columnString2 != null) {
                String columnString3 = SuggestionsAdapter.getColumnString(cursor, z[24]);
                if (columnString3 != null) {
                    columnString2 = columnString2 + "/" + Uri.encode(columnString3);
                }
            }
            if (columnString2 == null) {
                uri = null;
            } else {
                uri = Uri.parse(columnString2);
            }
            String columnString4 = SuggestionsAdapter.getColumnString(cursor, z[27]);
            return createIntent(columnString, uri, SuggestionsAdapter.getColumnString(cursor, z[28]), columnString4, i, str);
        } catch (Throwable e) {
            int position;
            Throwable th = e;
            try {
                position = cursor.getPosition();
            } catch (RuntimeException e2) {
                position = -1;
            }
            Log.w(z[30], z[32] + position + z[26], th);
            return null;
        }
    }

    private static void setText(AutoCompleteTextView autoCompleteTextView, CharSequence charSequence, boolean z) {
        try {
            Method method = AutoCompleteTextView.class.getMethod(z[10], new Class[]{CharSequence.class, Boolean.TYPE});
            method.setAccessible(true);
            method.invoke(autoCompleteTextView, new Object[]{charSequence, Boolean.valueOf(z)});
        } catch (Exception e) {
            autoCompleteTextView.setText(charSequence);
        }
    }

    static boolean isLandscapeMode(Context context) {
        try {
            return context.getResources().getConfiguration().orientation == 2;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void postUpdateFocusedState() {
        post(this.mUpdateDrawableStateRunnable);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SearchView.class.getName());
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        postUpdateFocusedState();
    }

    public CharSequence getQuery() {
        return this.mQueryTextView.getText();
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.mSubmitButtonEnabled = z;
        updateViewsVisibility(isIconified());
    }
}
