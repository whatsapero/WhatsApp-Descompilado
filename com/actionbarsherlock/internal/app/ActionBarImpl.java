package com.actionbarsherlock.internal.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.View;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.LayoutParams;
import com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.ResourcesCompat;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener;
import com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorListenerAdapter;
import com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet;
import com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Builder;
import com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineFrameLayout;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.internal.widget.ActionBarContainer;
import com.actionbarsherlock.internal.widget.ActionBarContextView;
import com.actionbarsherlock.internal.widget.ActionBarView;
import com.actionbarsherlock.internal.widget.ScrollingTabContainerView;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ActionBarImpl extends ActionBar {
    public static int a;
    private static final String[] z;
    ActionModeImpl mActionMode;
    private ActionBarView mActionView;
    private Activity mActivity;
    private ActionBarContainer mContainerView;
    private NineFrameLayout mContentView;
    private Context mContext;
    private int mContextDisplayMode;
    private ActionBarContextView mContextView;
    private Animator mCurrentModeAnim;
    private Animator mCurrentShowAnim;
    ActionMode mDeferredDestroyActionMode;
    Callback mDeferredModeDestroyCallback;
    final Handler mHandler;
    private boolean mHasEmbeddedTabs;
    final AnimatorListener mHideListener;
    private boolean mLastMenuVisibility;
    private ArrayList mMenuVisibilityListeners;
    private int mSavedTabPosition;
    private TabImpl mSelectedTab;
    private boolean mShowHideAnimationEnabled;
    final AnimatorListener mShowListener;
    private ActionBarContainer mSplitView;
    private ScrollingTabContainerView mTabScrollView;
    private ArrayList mTabs;
    private Context mThemedContext;
    boolean mWasHiddenBeforeMode;

    public class ActionModeImpl extends ActionMode implements MenuBuilder.Callback {
        private Callback mCallback;
        private WeakReference mCustomView;
        private MenuBuilder mMenu;
        final ActionBarImpl this$0;

        public boolean dispatchOnCreate() {
            boolean z = this.mMenu;
            z.stopDispatchingItemsChanged();
            try {
                z = this.mCallback.onCreateActionMode(this, this.mMenu);
                return z;
            } finally {
                this.mMenu.startDispatchingItemsChanged();
            }
        }

        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            return this.mCallback != null ? this.mCallback.onActionItemClicked(this, menuItem) : false;
        }

        public void setTitle(CharSequence charSequence) {
            ActionBarImpl.access$500(this.this$0).setTitle(charSequence);
        }

        public void invalidate() {
            this.mMenu.stopDispatchingItemsChanged();
            try {
                this.mCallback.onPrepareActionMode(this, this.mMenu);
            } finally {
                this.mMenu.startDispatchingItemsChanged();
            }
        }

        public void onMenuModeChange(MenuBuilder menuBuilder) {
            if (this.mCallback != null) {
                invalidate();
                ActionBarImpl.access$500(this.this$0).showOverflowMenu();
            }
        }

        public void setCustomView(View view) {
            ActionBarImpl.access$500(this.this$0).setCustomView(view);
            this.mCustomView = new WeakReference(view);
        }

        public ActionModeImpl(ActionBarImpl actionBarImpl, Callback callback) {
            this.this$0 = actionBarImpl;
            this.mCallback = callback;
            this.mMenu = new MenuBuilder(actionBarImpl.getThemedContext()).setDefaultShowAsAction(1);
            this.mMenu.setCallback(this);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void finish() {
            /*
            r3_this = this;
            r2 = 0;
            r0 = r3.this$0;
            r0 = r0.mActionMode;
            if (r0 == r3) goto L_0x0008;
        L_0x0007:
            return;
        L_0x0008:
            r0 = r3.this$0;
            r0 = r0.mWasHiddenBeforeMode;
            if (r0 == 0) goto L_0x001c;
        L_0x000e:
            r0 = r3.this$0;
            r0.mDeferredDestroyActionMode = r3;
            r0 = r3.this$0;
            r1 = r3.mCallback;
            r0.mDeferredModeDestroyCallback = r1;
            r0 = a;
            if (r0 == 0) goto L_0x0021;
        L_0x001c:
            r0 = r3.mCallback;
            r0.onDestroyActionMode(r3);
        L_0x0021:
            r3.mCallback = r2;
            r0 = r3.this$0;
            r1 = 0;
            r0.animateToMode(r1);
            r0 = r3.this$0;
            r0 = com.actionbarsherlock.internal.app.ActionBarImpl.access$500(r0);
            r0.closeMode();
            r0 = r3.this$0;
            r0 = com.actionbarsherlock.internal.app.ActionBarImpl.access$600(r0);
            r1 = 32;
            r0.sendAccessibilityEvent(r1);
            r0 = r3.this$0;
            r0.mActionMode = r2;
            r0 = r3.this$0;
            r0 = r0.mWasHiddenBeforeMode;
            if (r0 == 0) goto L_0x0007;
        L_0x0047:
            r0 = r3.this$0;
            r0.hide();
            goto L_0x0007;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.app.ActionBarImpl.ActionModeImpl.finish():void");
        }

        public Menu getMenu() {
            return this.mMenu;
        }
    }

    public class TabImpl extends Tab {
        private TabListener mCallback;
        private CharSequence mContentDesc;
        private View mCustomView;
        private Drawable mIcon;
        private int mPosition;
        private CharSequence mText;
        final ActionBarImpl this$0;

        public Drawable getIcon() {
            return this.mIcon;
        }

        public void select() {
            this.this$0.selectTab(this);
        }

        public void setPosition(int i) {
            this.mPosition = i;
        }

        public TabListener getCallback() {
            return this.mCallback;
        }

        public View getCustomView() {
            return this.mCustomView;
        }

        public Tab setTabListener(TabListener tabListener) {
            this.mCallback = tabListener;
            return this;
        }

        public CharSequence getContentDescription() {
            return this.mContentDesc;
        }

        public Tab setIcon(int i) {
            return setIcon(ActionBarImpl.access$700(this.this$0).getResources().getDrawable(i));
        }

        public Tab setIcon(Drawable drawable) {
            this.mIcon = drawable;
            if (this.mPosition >= 0) {
                ActionBarImpl.access$800(this.this$0).updateTab(this.mPosition);
            }
            return this;
        }

        public TabImpl(ActionBarImpl actionBarImpl) {
            this.this$0 = actionBarImpl;
            this.mPosition = -1;
        }

        public int getPosition() {
            return this.mPosition;
        }

        public CharSequence getText() {
            return this.mText;
        }
    }

    static {
        String[] strArr = new String[12];
        String str = "u\"*D#Za\u001cL>\u0014\u0015?OlY4-Yl\\ (HlUa\u001dL X#?N'";
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
                        i3 = 52;
                        break;
                    case ay.f /*1*/:
                        i3 = 65;
                        break;
                    case ay.n /*2*/:
                        i3 = 94;
                        break;
                    case ay.p /*3*/:
                        i3 = 45;
                        break;
                    default:
                        i3 = 76;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "U-.E-";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "U-.E-";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "@3?C?X *D#Z\u0018";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "G$*~)X$=Y)P\u000f?[%S *D#Z\b0I)La0B8\u00147?A%Pa8B>\u0014\"+_>Q/*\r\"U77J-@(1ClY.:H";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "U-.E-";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "@3?C?X *D#Z\u0018";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "U-.E-";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "@3?C?X *D#Z\u0018";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "C(*ElUa=B!D *D.X$~Z%Z%1ZlP$=B>\u0014-?T#A5";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0014\"?Cl[/2TlV$~X?Q%~";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "@3?C?X *D#Z\u0018";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void ensureTabsExist() {
        /*
        r4_this = this;
        r0 = 0;
        r1 = r4.mTabScrollView;	 Catch:{ IllegalStateException -> 0x0006 }
        if (r1 == 0) goto L_0x0008;
    L_0x0005:
        return;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        r1 = new com.actionbarsherlock.internal.widget.ScrollingTabContainerView;
        r2 = r4.mContext;
        r1.<init>(r2);
        r2 = r4.mHasEmbeddedTabs;	 Catch:{ IllegalStateException -> 0x0032 }
        if (r2 == 0) goto L_0x0020;
    L_0x0013:
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ IllegalStateException -> 0x0034 }
        r2 = r4.mActionView;	 Catch:{ IllegalStateException -> 0x0034 }
        r2.setEmbeddedTabView(r1);	 Catch:{ IllegalStateException -> 0x0034 }
        r2 = a;	 Catch:{ IllegalStateException -> 0x0034 }
        if (r2 == 0) goto L_0x002f;
    L_0x0020:
        r2 = r4.getNavigationMode();	 Catch:{ IllegalStateException -> 0x0036 }
        r3 = 2;
        if (r2 != r3) goto L_0x0038;
    L_0x0027:
        r1.setVisibility(r0);
        r0 = r4.mContainerView;
        r0.setTabContainer(r1);
    L_0x002f:
        r4.mTabScrollView = r1;
        goto L_0x0005;
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;
    L_0x0038:
        r0 = 8;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.app.ActionBarImpl.ensureTabsExist():void");
    }

    public void addTab(Tab tab, boolean z) {
        try {
            ensureTabsExist();
            this.mTabScrollView.addTab(tab, z);
            configureTab(tab, this.mTabs.size());
            if (z) {
                selectTab(tab);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void setCustomView(View view) {
        this.mActionView.setCustomNavigationView(view);
    }

    public void removeOnMenuVisibilityListener(OnMenuVisibilityListener onMenuVisibilityListener) {
        this.mMenuVisibilityListeners.remove(onMenuVisibilityListener);
    }

    public void addOnMenuVisibilityListener(OnMenuVisibilityListener onMenuVisibilityListener) {
        this.mMenuVisibilityListeners.add(onMenuVisibilityListener);
    }

    public int getSelectedNavigationIndex() {
        try {
            switch (this.mActionView.getNavigationMode()) {
                case ay.f /*1*/:
                    return this.mActionView.getDropdownSelectedPosition();
                case ay.n /*2*/:
                    return this.mSelectedTab != null ? this.mSelectedTab.getPosition() : -1;
                default:
                    return -1;
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
        throw e2;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mActionView.setSubtitle(charSequence);
    }

    static ActionBarContainer access$200(ActionBarImpl actionBarImpl) {
        return actionBarImpl.mSplitView;
    }

    public int getNavigationMode() {
        return this.mActionView.getNavigationMode();
    }

    private void configureTab(Tab tab, int i) {
        int i2 = a;
        TabImpl tabImpl = (TabImpl) tab;
        if (tabImpl.getCallback() == null) {
            try {
                throw new IllegalStateException(z[0]);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        tabImpl.setPosition(i);
        this.mTabs.add(i, tabImpl);
        int size = this.mTabs.size();
        int i3 = i + 1;
        while (i3 < size) {
            ((TabImpl) this.mTabs.get(i3)).setPosition(i3);
            int i4 = i3 + 1;
            if (i2 == 0) {
                i3 = i4;
            } else {
                return;
            }
        }
    }

    public ActionMode startActionMode(Callback callback) {
        boolean z = false;
        boolean z2;
        if (this.mActionMode != null) {
            z2 = this.mWasHiddenBeforeMode;
            this.mActionMode.finish();
        } else {
            z2 = false;
        }
        this.mContextView.killMode();
        ActionMode actionModeImpl = new ActionModeImpl(this, callback);
        try {
            if (!actionModeImpl.dispatchOnCreate()) {
                return null;
            }
            if (!isShowing() || r0) {
                z = true;
            }
            try {
                this.mWasHiddenBeforeMode = z;
                actionModeImpl.invalidate();
                this.mContextView.initForMode(actionModeImpl);
                animateToMode(true);
                if (this.mSplitView != null) {
                    if (this.mContextDisplayMode == 1) {
                        this.mSplitView.setVisibility(0);
                    }
                }
                this.mContextView.sendAccessibilityEvent(32);
                this.mActionMode = actionModeImpl;
                return actionModeImpl;
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            try {
                throw e222;
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        }
    }

    public void setCustomView(View view, LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.mActionView.setCustomNavigationView(view);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void animateToMode(boolean r5) {
        /*
        r4_this = this;
        r0 = 8;
        r1 = 0;
        if (r5 == 0) goto L_0x0009;
    L_0x0005:
        r2 = 0;
        r4.show(r2);	 Catch:{ IllegalStateException -> 0x003e }
    L_0x0009:
        r2 = r4.mCurrentModeAnim;	 Catch:{ IllegalStateException -> 0x0040 }
        if (r2 == 0) goto L_0x0012;
    L_0x000d:
        r2 = r4.mCurrentModeAnim;	 Catch:{ IllegalStateException -> 0x0040 }
        r2.end();	 Catch:{ IllegalStateException -> 0x0040 }
    L_0x0012:
        r3 = r4.mActionView;	 Catch:{ IllegalStateException -> 0x0042 }
        if (r5 == 0) goto L_0x0044;
    L_0x0016:
        r2 = r0;
    L_0x0017:
        r3.animateToVisibility(r2);	 Catch:{ IllegalStateException -> 0x0046 }
        r3 = r4.mContextView;	 Catch:{ IllegalStateException -> 0x0046 }
        if (r5 == 0) goto L_0x0048;
    L_0x001e:
        r2 = r1;
    L_0x001f:
        r3.animateToVisibility(r2);	 Catch:{ IllegalStateException -> 0x004a }
        r2 = r4.mTabScrollView;	 Catch:{ IllegalStateException -> 0x004a }
        if (r2 == 0) goto L_0x003d;
    L_0x0026:
        r2 = r4.mActionView;	 Catch:{ IllegalStateException -> 0x004c }
        r2 = r2.hasEmbeddedTabs();	 Catch:{ IllegalStateException -> 0x004c }
        if (r2 != 0) goto L_0x003d;
    L_0x002e:
        r2 = r4.mActionView;	 Catch:{ IllegalStateException -> 0x004e }
        r2 = r2.isCollapsed();	 Catch:{ IllegalStateException -> 0x004e }
        if (r2 == 0) goto L_0x003d;
    L_0x0036:
        r2 = r4.mTabScrollView;	 Catch:{ IllegalStateException -> 0x0050 }
        if (r5 == 0) goto L_0x0052;
    L_0x003a:
        r2.animateToVisibility(r0);
    L_0x003d:
        return;
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r2 = r1;
        goto L_0x0017;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r2 = r0;
        goto L_0x001f;
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r0 = r1;
        goto L_0x003a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.app.ActionBarImpl.animateToMode(boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context getThemedContext() {
        /*
        r4_this = this;
        r0 = r4.mThemedContext;
        if (r0 != 0) goto L_0x002a;
    L_0x0004:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r1 = r4.mContext;
        r1 = r1.getTheme();
        r2 = com.actionbarsherlock.R.attr.actionBarWidgetTheme;
        r3 = 1;
        r1.resolveAttribute(r2, r0, r3);
        r0 = r0.resourceId;
        if (r0 == 0) goto L_0x0026;
    L_0x0019:
        r1 = new android.view.ContextThemeWrapper;	 Catch:{ IllegalStateException -> 0x002d }
        r2 = r4.mContext;	 Catch:{ IllegalStateException -> 0x002d }
        r1.<init>(r2, r0);	 Catch:{ IllegalStateException -> 0x002d }
        r4.mThemedContext = r1;	 Catch:{ IllegalStateException -> 0x002d }
        r0 = a;	 Catch:{ IllegalStateException -> 0x002d }
        if (r0 == 0) goto L_0x002a;
    L_0x0026:
        r0 = r4.mContext;	 Catch:{ IllegalStateException -> 0x002d }
        r4.mThemedContext = r0;	 Catch:{ IllegalStateException -> 0x002d }
    L_0x002a:
        r0 = r4.mThemedContext;
        return r0;
    L_0x002d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.app.ActionBarImpl.getThemedContext():android.content.Context");
    }

    static ActionBarContextView access$500(ActionBarImpl actionBarImpl) {
        return actionBarImpl.mContextView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setHasEmbeddedTabs(boolean r6) {
        /*
        r5_this = this;
        r1 = 1;
        r2 = 0;
        r5.mHasEmbeddedTabs = r6;	 Catch:{ IllegalStateException -> 0x0046 }
        r0 = r5.mHasEmbeddedTabs;	 Catch:{ IllegalStateException -> 0x0046 }
        if (r0 != 0) goto L_0x0019;
    L_0x0008:
        r0 = r5.mActionView;	 Catch:{ IllegalStateException -> 0x0048 }
        r3 = 0;
        r0.setEmbeddedTabView(r3);	 Catch:{ IllegalStateException -> 0x0048 }
        r0 = r5.mContainerView;	 Catch:{ IllegalStateException -> 0x0048 }
        r3 = r5.mTabScrollView;	 Catch:{ IllegalStateException -> 0x0048 }
        r0.setTabContainer(r3);	 Catch:{ IllegalStateException -> 0x0048 }
        r0 = a;	 Catch:{ IllegalStateException -> 0x0048 }
        if (r0 == 0) goto L_0x0026;
    L_0x0019:
        r0 = r5.mContainerView;	 Catch:{ IllegalStateException -> 0x0048 }
        r3 = 0;
        r0.setTabContainer(r3);	 Catch:{ IllegalStateException -> 0x0048 }
        r0 = r5.mActionView;	 Catch:{ IllegalStateException -> 0x0048 }
        r3 = r5.mTabScrollView;	 Catch:{ IllegalStateException -> 0x0048 }
        r0.setEmbeddedTabView(r3);	 Catch:{ IllegalStateException -> 0x0048 }
    L_0x0026:
        r0 = r5.getNavigationMode();	 Catch:{ IllegalStateException -> 0x004a }
        r3 = 2;
        if (r0 != r3) goto L_0x004c;
    L_0x002d:
        r0 = r1;
    L_0x002e:
        r3 = r5.mTabScrollView;	 Catch:{ IllegalStateException -> 0x004e }
        if (r3 == 0) goto L_0x003a;
    L_0x0032:
        r4 = r5.mTabScrollView;	 Catch:{ IllegalStateException -> 0x0050 }
        if (r0 == 0) goto L_0x0052;
    L_0x0036:
        r3 = r2;
    L_0x0037:
        r4.setVisibility(r3);
    L_0x003a:
        r3 = r5.mActionView;	 Catch:{ IllegalStateException -> 0x0055 }
        r4 = r5.mHasEmbeddedTabs;	 Catch:{ IllegalStateException -> 0x0055 }
        if (r4 != 0) goto L_0x0059;
    L_0x0040:
        if (r0 == 0) goto L_0x0059;
    L_0x0042:
        r3.setCollapsable(r1);
        return;
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
        r0 = r2;
        goto L_0x002e;
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r3 = 8;
        goto L_0x0037;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        r1 = r2;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.app.ActionBarImpl.setHasEmbeddedTabs(boolean):void");
    }

    public void setTitle(CharSequence charSequence) {
        this.mActionView.setTitle(charSequence);
    }

    public void setDisplayShowTitleEnabled(boolean z) {
        int i;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        setDisplayOptions(i, 8);
    }

    public ActionBarImpl(Activity activity, int i) {
        int i2 = a;
        this.mTabs = new ArrayList();
        this.mSavedTabPosition = -1;
        this.mMenuVisibilityListeners = new ArrayList();
        this.mHandler = new Handler();
        this.mHideListener = new AnimatorListenerAdapter() {
            final ActionBarImpl this$0;

            public void onAnimationEnd(Animator animator) {
                if (ActionBarImpl.access$000(this.this$0) != null) {
                    ActionBarImpl.access$000(this.this$0).setTranslationY(0.0f);
                    ActionBarImpl.access$100(this.this$0).setTranslationY(0.0f);
                }
                if (ActionBarImpl.access$200(this.this$0) != null && ActionBarImpl.access$300(this.this$0) == 1) {
                    ActionBarImpl.access$200(this.this$0).setVisibility(8);
                }
                ActionBarImpl.access$100(this.this$0).setVisibility(8);
                ActionBarImpl.access$100(this.this$0).setTransitioning(false);
                ActionBarImpl.access$402(this.this$0, null);
                this.this$0.completeDeferredDestroyActionMode();
            }

            {
                this.this$0 = r1;
            }
        };
        this.mShowListener = new AnimatorListenerAdapter() {
            final ActionBarImpl this$0;

            {
                this.this$0 = r1;
            }

            public void onAnimationEnd(Animator animator) {
                ActionBarImpl.access$402(this.this$0, null);
                ActionBarImpl.access$100(this.this$0).requestLayout();
            }
        };
        this.mActivity = activity;
        View decorView = activity.getWindow().getDecorView();
        try {
            init(decorView);
            if ((i & 512) == 0) {
                this.mContentView = (NineFrameLayout) decorView.findViewById(16908290);
            }
            if (i2 != 0) {
                try {
                    boolean z;
                    if (SherlockActivity.a) {
                        z = false;
                    } else {
                        z = true;
                    }
                    SherlockActivity.a = z;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static Animator access$402(ActionBarImpl actionBarImpl, Animator animator) {
        actionBarImpl.mCurrentShowAnim = animator;
        return animator;
    }

    void completeDeferredDestroyActionMode() {
        try {
            if (this.mDeferredModeDestroyCallback != null) {
                this.mDeferredModeDestroyCallback.onDestroyActionMode(this.mDeferredDestroyActionMode);
                this.mDeferredDestroyActionMode = null;
                this.mDeferredModeDestroyCallback = null;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public Tab newTab() {
        return new TabImpl(this);
    }

    public boolean isShowing() {
        try {
            return this.mContainerView.getVisibility() == 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void setDisplayShowCustomEnabled(boolean z) {
        int i;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        setDisplayOptions(i, 16);
    }

    void show(boolean z) {
        try {
            if (this.mCurrentShowAnim != null) {
                this.mCurrentShowAnim.end();
            }
            try {
                if (this.mContainerView.getVisibility() != 0) {
                    this.mContainerView.setVisibility(0);
                    try {
                        if (this.mShowHideAnimationEnabled) {
                            this.mContainerView.setAlpha(0.0f);
                            Animator animatorSet = new AnimatorSet();
                            Builder play = animatorSet.play(ObjectAnimator.ofFloat(this.mContainerView, z[2], new float[]{1.0f}));
                            try {
                                if (this.mContentView != null) {
                                    play.with(ObjectAnimator.ofFloat(this.mContentView, z[4], new float[]{(float) (-this.mContainerView.getHeight()), 0.0f}));
                                    this.mContainerView.setTranslationY((float) (-this.mContainerView.getHeight()));
                                    play.with(ObjectAnimator.ofFloat(this.mContainerView, z[1], new float[]{0.0f}));
                                }
                                try {
                                    if (this.mSplitView != null) {
                                        if (this.mContextDisplayMode == 1) {
                                            this.mSplitView.setAlpha(0.0f);
                                            this.mSplitView.setVisibility(0);
                                            play.with(ObjectAnimator.ofFloat(this.mSplitView, z[3], new float[]{1.0f}));
                                        }
                                    }
                                    animatorSet.addListener(this.mShowListener);
                                    this.mCurrentShowAnim = animatorSet;
                                    animatorSet.start();
                                    if (a == 0) {
                                        return;
                                    }
                                } catch (IllegalStateException e) {
                                    throw e;
                                } catch (IllegalStateException e2) {
                                    throw e2;
                                }
                            } catch (IllegalStateException e22) {
                                throw e22;
                            }
                        }
                        this.mContainerView.setAlpha(1.0f);
                        this.mContainerView.setTranslationY(0.0f);
                        this.mShowListener.onAnimationEnd(null);
                    } catch (IllegalStateException e222) {
                        throw e222;
                    }
                } else if (z) {
                    this.mWasHiddenBeforeMode = false;
                }
            } catch (IllegalStateException e2222) {
                throw e2222;
            } catch (IllegalStateException e22222) {
                throw e22222;
            }
        } catch (IllegalStateException e222222) {
            throw e222222;
        }
    }

    public void setIcon(int i) {
        this.mActionView.setIcon(i);
    }

    public void show() {
        show(true);
    }

    static Context access$700(ActionBarImpl actionBarImpl) {
        return actionBarImpl.mContext;
    }

    public void setDisplayOptions(int i) {
        this.mActionView.setDisplayOptions(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void init(android.view.View r5) {
        /*
        r4_this = this;
        r1 = 1;
        r2 = 0;
        r0 = r5.getContext();	 Catch:{ IllegalStateException -> 0x006d }
        r4.mContext = r0;	 Catch:{ IllegalStateException -> 0x006d }
        r0 = com.actionbarsherlock.R.id.abs__action_bar;	 Catch:{ IllegalStateException -> 0x006d }
        r0 = r5.findViewById(r0);	 Catch:{ IllegalStateException -> 0x006d }
        r0 = (com.actionbarsherlock.internal.widget.ActionBarView) r0;	 Catch:{ IllegalStateException -> 0x006d }
        r4.mActionView = r0;	 Catch:{ IllegalStateException -> 0x006d }
        r0 = com.actionbarsherlock.R.id.abs__action_context_bar;	 Catch:{ IllegalStateException -> 0x006d }
        r0 = r5.findViewById(r0);	 Catch:{ IllegalStateException -> 0x006d }
        r0 = (com.actionbarsherlock.internal.widget.ActionBarContextView) r0;	 Catch:{ IllegalStateException -> 0x006d }
        r4.mContextView = r0;	 Catch:{ IllegalStateException -> 0x006d }
        r0 = com.actionbarsherlock.R.id.abs__action_bar_container;	 Catch:{ IllegalStateException -> 0x006d }
        r0 = r5.findViewById(r0);	 Catch:{ IllegalStateException -> 0x006d }
        r0 = (com.actionbarsherlock.internal.widget.ActionBarContainer) r0;	 Catch:{ IllegalStateException -> 0x006d }
        r4.mContainerView = r0;	 Catch:{ IllegalStateException -> 0x006d }
        r0 = com.actionbarsherlock.R.id.abs__split_action_bar;	 Catch:{ IllegalStateException -> 0x006d }
        r0 = r5.findViewById(r0);	 Catch:{ IllegalStateException -> 0x006d }
        r0 = (com.actionbarsherlock.internal.widget.ActionBarContainer) r0;	 Catch:{ IllegalStateException -> 0x006d }
        r4.mSplitView = r0;	 Catch:{ IllegalStateException -> 0x006d }
        r0 = r4.mActionView;	 Catch:{ IllegalStateException -> 0x006d }
        if (r0 == 0) goto L_0x003c;
    L_0x0034:
        r0 = r4.mContextView;	 Catch:{ IllegalStateException -> 0x006f }
        if (r0 == 0) goto L_0x003c;
    L_0x0038:
        r0 = r4.mContainerView;	 Catch:{ IllegalStateException -> 0x006b }
        if (r0 != 0) goto L_0x0071;
    L_0x003c:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x006b }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x006b }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x006b }
        r2 = r4.getClass();	 Catch:{ IllegalStateException -> 0x006b }
        r2 = r2.getSimpleName();	 Catch:{ IllegalStateException -> 0x006b }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x006b }
        r2 = z;	 Catch:{ IllegalStateException -> 0x006b }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x006b }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x006b }
        r2 = z;	 Catch:{ IllegalStateException -> 0x006b }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x006b }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x006b }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x006b }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x006b }
        throw r0;	 Catch:{ IllegalStateException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006b }
    L_0x0071:
        r0 = r4.mActionView;	 Catch:{ IllegalStateException -> 0x009f }
        r3 = r4.mContextView;	 Catch:{ IllegalStateException -> 0x009f }
        r0.setContextView(r3);	 Catch:{ IllegalStateException -> 0x009f }
        r0 = r4.mActionView;	 Catch:{ IllegalStateException -> 0x009f }
        r0 = r0.isSplitActionBar();	 Catch:{ IllegalStateException -> 0x009f }
        if (r0 == 0) goto L_0x00a1;
    L_0x0080:
        r0 = r1;
    L_0x0081:
        r4.mContextDisplayMode = r0;	 Catch:{ IllegalStateException -> 0x00a3 }
        r0 = r4.mContext;	 Catch:{ IllegalStateException -> 0x00a3 }
        r0 = r0.getApplicationInfo();	 Catch:{ IllegalStateException -> 0x00a3 }
        r0 = r0.targetSdkVersion;	 Catch:{ IllegalStateException -> 0x00a3 }
        r3 = 14;
        if (r0 >= r3) goto L_0x00a5;
    L_0x008f:
        r0 = r1;
    L_0x0090:
        r4.setHomeButtonEnabled(r0);
        r0 = r4.mContext;
        r1 = com.actionbarsherlock.R.bool.abs__action_bar_embed_tabs;
        r0 = com.actionbarsherlock.internal.ResourcesCompat.getResources_getBoolean(r0, r1);
        r4.setHasEmbeddedTabs(r0);
        return;
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r0 = r2;
        goto L_0x0081;
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r0 = r2;
        goto L_0x0090;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.app.ActionBarImpl.init(android.view.View):void");
    }

    static ScrollingTabContainerView access$800(ActionBarImpl actionBarImpl) {
        return actionBarImpl.mTabScrollView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSelectedNavigationItem(int r4) {
        /*
        r3_this = this;
        r1 = a;
        r0 = r3.mActionView;	 Catch:{ IllegalStateException -> 0x002d }
        r0 = r0.getNavigationMode();	 Catch:{ IllegalStateException -> 0x002d }
        switch(r0) {
            case 1: goto L_0x0025;
            case 2: goto L_0x0018;
            default: goto L_0x000b;
        };
    L_0x000b:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0016 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0016 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0016 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0016 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0016 }
    L_0x0016:
        r0 = move-exception;
        throw r0;
    L_0x0018:
        r0 = r3.mTabs;	 Catch:{ IllegalStateException -> 0x002f }
        r0 = r0.get(r4);	 Catch:{ IllegalStateException -> 0x002f }
        r0 = (com.actionbarsherlock.app.ActionBar.Tab) r0;	 Catch:{ IllegalStateException -> 0x002f }
        r3.selectTab(r0);	 Catch:{ IllegalStateException -> 0x002f }
        if (r1 == 0) goto L_0x002c;
    L_0x0025:
        r0 = r3.mActionView;	 Catch:{ IllegalStateException -> 0x0016 }
        r0.setDropdownSelectedPosition(r4);	 Catch:{ IllegalStateException -> 0x0016 }
        if (r1 != 0) goto L_0x000b;
    L_0x002c:
        return;
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002f }
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0016 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.app.ActionBarImpl.setSelectedNavigationItem(int):void");
    }

    public void setSubtitle(int i) {
        setSubtitle(this.mContext.getString(i));
    }

    public void setDisplayHomeAsUpEnabled(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        setDisplayOptions(i, 4);
    }

    static NineFrameLayout access$000(ActionBarImpl actionBarImpl) {
        return actionBarImpl.mContentView;
    }

    public void setDisplayOptions(int i, int i2) {
        this.mActionView.setDisplayOptions((this.mActionView.getDisplayOptions() & (i2 ^ -1)) | (i & i2));
    }

    static ActionBarContainer access$100(ActionBarImpl actionBarImpl) {
        return actionBarImpl.mContainerView;
    }

    public void setHomeButtonEnabled(boolean z) {
        this.mActionView.setHomeButtonEnabled(z);
    }

    public void setNavigationMode(int i) {
        boolean z = false;
        switch (this.mActionView.getNavigationMode()) {
            case ay.n /*2*/:
                try {
                    this.mSavedTabPosition = getSelectedNavigationIndex();
                    selectTab(null);
                    this.mTabScrollView.setVisibility(8);
                    break;
                } catch (IllegalStateException e) {
                    throw e;
                }
        }
        try {
            this.mActionView.setNavigationMode(i);
            switch (i) {
                case ay.n /*2*/:
                    ensureTabsExist();
                    this.mTabScrollView.setVisibility(0);
                    if (this.mSavedTabPosition != -1) {
                        setSelectedNavigationItem(this.mSavedTabPosition);
                        this.mSavedTabPosition = -1;
                        break;
                    }
                    break;
            }
            try {
                ActionBarView actionBarView = this.mActionView;
                if (i == 2) {
                    if (!this.mHasEmbeddedTabs) {
                        z = true;
                    }
                }
                actionBarView.setCollapsable(z);
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    public void addTab(Tab tab) {
        addTab(tab, this.mTabs.isEmpty());
    }

    public void setDisplayShowHomeEnabled(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        setDisplayOptions(i, 2);
    }

    public void setIcon(Drawable drawable) {
        this.mActionView.setIcon(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.mContainerView.setPrimaryBackground(drawable);
    }

    static ActionBarView access$600(ActionBarImpl actionBarImpl) {
        return actionBarImpl.mActionView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void selectTab(com.actionbarsherlock.app.ActionBar.Tab r5) {
        /*
        r4_this = this;
        r1 = -1;
        r0 = r4.getNavigationMode();	 Catch:{ IllegalStateException -> 0x0011 }
        r2 = 2;
        if (r0 == r2) goto L_0x0017;
    L_0x0008:
        if (r5 == 0) goto L_0x0015;
    L_0x000a:
        r0 = r5.getPosition();	 Catch:{ IllegalStateException -> 0x0013 }
    L_0x000e:
        r4.mSavedTabPosition = r0;
    L_0x0010:
        return;
    L_0x0011:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0013 }
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r0 = r1;
        goto L_0x000e;
    L_0x0017:
        r0 = 0;
        r2 = r4.mActivity;
        r2 = r2 instanceof android.support.v4.app.FragmentActivity;
        if (r2 == 0) goto L_0x002e;
    L_0x001e:
        r0 = r4.mActivity;
        r0 = (android.support.v4.app.FragmentActivity) r0;
        r0 = r0.getSupportFragmentManager();
        r0 = r0.beginTransaction();
        r0 = r0.disallowAddToBackStack();
    L_0x002e:
        r2 = r4.mSelectedTab;	 Catch:{ IllegalStateException -> 0x0089 }
        if (r2 != r5) goto L_0x004e;
    L_0x0032:
        r2 = r4.mSelectedTab;	 Catch:{ IllegalStateException -> 0x008b }
        if (r2 == 0) goto L_0x007b;
    L_0x0036:
        r2 = r4.mSelectedTab;	 Catch:{ IllegalStateException -> 0x008d }
        r2 = r2.getCallback();	 Catch:{ IllegalStateException -> 0x008d }
        r3 = r4.mSelectedTab;	 Catch:{ IllegalStateException -> 0x008d }
        r2.onTabReselected(r3, r0);	 Catch:{ IllegalStateException -> 0x008d }
        r2 = r4.mTabScrollView;	 Catch:{ IllegalStateException -> 0x008d }
        r3 = r5.getPosition();	 Catch:{ IllegalStateException -> 0x008d }
        r2.animateToTab(r3);	 Catch:{ IllegalStateException -> 0x008d }
        r2 = a;	 Catch:{ IllegalStateException -> 0x008d }
        if (r2 == 0) goto L_0x007b;
    L_0x004e:
        r2 = r4.mTabScrollView;	 Catch:{ IllegalStateException -> 0x008f }
        if (r5 == 0) goto L_0x0056;
    L_0x0052:
        r1 = r5.getPosition();	 Catch:{ IllegalStateException -> 0x008f }
    L_0x0056:
        r2.setTabSelected(r1);	 Catch:{ IllegalStateException -> 0x0091 }
        r1 = r4.mSelectedTab;	 Catch:{ IllegalStateException -> 0x0091 }
        if (r1 == 0) goto L_0x0068;
    L_0x005d:
        r1 = r4.mSelectedTab;	 Catch:{ IllegalStateException -> 0x0091 }
        r1 = r1.getCallback();	 Catch:{ IllegalStateException -> 0x0091 }
        r2 = r4.mSelectedTab;	 Catch:{ IllegalStateException -> 0x0091 }
        r1.onTabUnselected(r2, r0);	 Catch:{ IllegalStateException -> 0x0091 }
    L_0x0068:
        r5 = (com.actionbarsherlock.internal.app.ActionBarImpl.TabImpl) r5;	 Catch:{ IllegalStateException -> 0x0093 }
        r4.mSelectedTab = r5;	 Catch:{ IllegalStateException -> 0x0093 }
        r1 = r4.mSelectedTab;	 Catch:{ IllegalStateException -> 0x0093 }
        if (r1 == 0) goto L_0x007b;
    L_0x0070:
        r1 = r4.mSelectedTab;	 Catch:{ IllegalStateException -> 0x0093 }
        r1 = r1.getCallback();	 Catch:{ IllegalStateException -> 0x0093 }
        r2 = r4.mSelectedTab;	 Catch:{ IllegalStateException -> 0x0093 }
        r1.onTabSelected(r2, r0);	 Catch:{ IllegalStateException -> 0x0093 }
    L_0x007b:
        if (r0 == 0) goto L_0x0010;
    L_0x007d:
        r1 = r0.isEmpty();	 Catch:{ IllegalStateException -> 0x0087 }
        if (r1 != 0) goto L_0x0010;
    L_0x0083:
        r0.commit();	 Catch:{ IllegalStateException -> 0x0087 }
        goto L_0x0010;
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008b }
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        throw r0;
    L_0x0091:
        r0 = move-exception;
        throw r0;
    L_0x0093:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.app.ActionBarImpl.selectTab(com.actionbarsherlock.app.ActionBar$Tab):void");
    }

    public void setTitle(int i) {
        setTitle(this.mContext.getString(i));
    }

    public void dispatchMenuVisibilityChanged(boolean z) {
        int i = a;
        try {
            if (z != this.mLastMenuVisibility) {
                this.mLastMenuVisibility = z;
                int size = this.mMenuVisibilityListeners.size();
                int i2 = 0;
                while (i2 < size) {
                    ((OnMenuVisibilityListener) this.mMenuVisibilityListeners.get(i2)).onMenuVisibilityChanged(z);
                    int i3 = i2 + 1;
                    if (i == 0) {
                        i2 = i3;
                    } else {
                        return;
                    }
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static int access$300(ActionBarImpl actionBarImpl) {
        return actionBarImpl.mContextDisplayMode;
    }

    public void hide() {
        try {
            if (this.mCurrentShowAnim != null) {
                this.mCurrentShowAnim.end();
            }
            try {
                if (this.mContainerView.getVisibility() != 8) {
                    try {
                        if (this.mShowHideAnimationEnabled) {
                            this.mContainerView.setAlpha(1.0f);
                            this.mContainerView.setTransitioning(true);
                            Animator animatorSet = new AnimatorSet();
                            Builder play = animatorSet.play(ObjectAnimator.ofFloat(this.mContainerView, z[6], new float[]{0.0f}));
                            try {
                                if (this.mContentView != null) {
                                    play.with(ObjectAnimator.ofFloat(this.mContentView, z[7], new float[]{0.0f, (float) (-this.mContainerView.getHeight())}));
                                    play.with(ObjectAnimator.ofFloat(this.mContainerView, z[9], new float[]{(float) (-this.mContainerView.getHeight())}));
                                }
                                try {
                                    if (this.mSplitView != null) {
                                        if (this.mSplitView.getVisibility() == 0) {
                                            this.mSplitView.setAlpha(1.0f);
                                            play.with(ObjectAnimator.ofFloat(this.mSplitView, z[8], new float[]{0.0f}));
                                        }
                                    }
                                    animatorSet.addListener(this.mHideListener);
                                    this.mCurrentShowAnim = animatorSet;
                                    animatorSet.start();
                                    if (a == 0) {
                                        return;
                                    }
                                } catch (IllegalStateException e) {
                                    throw e;
                                } catch (IllegalStateException e2) {
                                    throw e2;
                                }
                            } catch (IllegalStateException e22) {
                                throw e22;
                            }
                        }
                        this.mHideListener.onAnimationEnd(null);
                    } catch (IllegalStateException e222) {
                        throw e222;
                    }
                }
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        } catch (IllegalStateException e22222) {
            throw e22222;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        try {
            setHasEmbeddedTabs(ResourcesCompat.getResources_getBoolean(this.mContext, R.bool.abs__action_bar_embed_tabs));
            try {
                if (VERSION.SDK_INT < 8) {
                    this.mActionView.onConfigurationChanged(configuration);
                    if (this.mContextView != null) {
                        this.mContextView.onConfigurationChanged(configuration);
                    }
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void setShowHideAnimationEnabled(boolean z) {
        try {
            this.mShowHideAnimationEnabled = z;
            try {
                if (!z) {
                    if (this.mCurrentShowAnim != null) {
                        this.mCurrentShowAnim.end();
                    }
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }
}
