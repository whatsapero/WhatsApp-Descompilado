package com.actionbarsherlock.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.ActionBarSherlock.Implementation;
import com.actionbarsherlock.ActionBarSherlock.OnActionModeFinishedListener;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.internal.app.ActionBarImpl;
import com.actionbarsherlock.internal.view.menu.ActionMenuPresenter;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.internal.view.menu.MenuBuilder.Callback;
import com.actionbarsherlock.internal.view.menu.MenuPresenter;
import com.actionbarsherlock.internal.widget.ActionBarContextView;
import com.actionbarsherlock.internal.widget.ActionBarView;
import com.actionbarsherlock.internal.widget.IcsProgressBar;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.Window;
import com.whatsapp.vk;
import java.util.HashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

@Implementation(api = 7)
public class ActionBarSherlockCompat extends ActionBarSherlock implements Callback, Window.Callback, MenuPresenter.Callback, OnMenuItemClickListener {
    private static final String[] z;
    private ActionBarImpl aActionBar;
    private ActionMode mActionMode;
    private ActionBarContextView mActionModeView;
    private IcsProgressBar mCircularProgressBar;
    private boolean mClosingActionMenu;
    private ViewGroup mContentParent;
    private ViewGroup mDecor;
    private int mFeatures;
    private IcsProgressBar mHorizontalProgressBar;
    private boolean mIsDestroyed;
    private boolean mIsFloating;
    private boolean mIsTitleReady;
    private MenuBuilder mMenu;
    private Bundle mMenuFrozenActionViewState;
    private boolean mMenuIsPrepared;
    private boolean mMenuRefreshContent;
    protected HashMap mNativeItemMap;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private CharSequence mTitle;
    private TextView mTitleView;
    private int mUiOptions;
    private ActionBarView wActionBar;

    class ActionModeCallbackWrapper implements ActionMode.Callback {
        private final ActionMode.Callback mWrapped;
        final ActionBarSherlockCompat this$0;

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.mWrapped.onPrepareActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.mWrapped.onDestroyActionMode(actionMode);
            if (ActionBarSherlockCompat.access$300(this.this$0) != null) {
                ActionBarSherlockCompat.access$300(this.this$0).setVisibility(8);
                ActionBarSherlockCompat.access$300(this.this$0).removeAllViews();
            }
            if (ActionBarSherlockCompat.access$400(this.this$0) instanceof OnActionModeFinishedListener) {
                ((OnActionModeFinishedListener) ActionBarSherlockCompat.access$600(this.this$0)).onActionModeFinished(ActionBarSherlockCompat.access$500(this.this$0));
            }
            ActionBarSherlockCompat.access$502(this.this$0, null);
        }

        public ActionModeCallbackWrapper(ActionBarSherlockCompat actionBarSherlockCompat, ActionMode.Callback callback) {
            this.this$0 = actionBarSherlockCompat;
            this.mWrapped = callback;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.mWrapped.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.mWrapped.onCreateActionMode(actionMode, menu);
        }
    }

    static {
        String[] strArr = new String[17];
        String str = "G\u0000m'\u0002F\u0011Z7\u0006A\u0010n7O\u001cEq'\u0014AE~7GV\u0004p>\u0002QE~7\u0001Z\u0017yr\u0006Q\u0001u<\u0000\u0015\u0006s<\u0013P\u000bh";
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
                        i3 = 53;
                        break;
                    case ay.f /*1*/:
                        i3 = 101;
                        break;
                    case ay.n /*2*/:
                        i3 = 28;
                        break;
                    case ay.p /*3*/:
                        i3 = 82;
                        break;
                    default:
                        i3 = 103;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "F\ry \u000bZ\u0006wh7T\u000by>\u0014";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "l\nir\n@\u0016hr\u0012F\u0000<\u0006\u000fP\by|4]\u0000n>\bV\u000e0r3]\u0000q7If\ry \u000bZ\u0006w|+\\\u0002t&K\u00151t7\nPKO:\u0002G\ts1\f\u001b)u5\u000fAKX3\u0015^$\u007f&\u000eZ\u000b^3\u0015\u0019Es GTEx7\u0015\\\u0013}&\u000eC\u00002";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "v\ni>\u0003[Bhr\u0001\\\u000bxr\u0004Z\u000bh7\tAE\u007f=\tA\u0004u<\u0002GEj;\u0002B";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "@\fS\"\u0013\\\nr!";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "[\u0004q7";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "T\u0015l>\u000eV\u0004h;\b[";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "t\u000bx \b\\\u0001Q3\t\\\u0003y!\u0013\u001b\u001dq>";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "T\u0006h;\u0011\\\u0011e";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "@\fS\"\u0013\\\nr!";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "t\u0006h;\b['} 4]\u0000n>\bV\u000e";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0017Er=\u0013\u0015\u0003s'\tQEu<GX\u0004l\"\u000e[\u0002";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "z\u0015h;\b[\u0016<;\u0013P\b<p";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "{\u0004h;\u0011PE\u007f3\u000bY\u0007}1\f\u0015\fr$\b^\u0000x|Gv\u0017y3\u0013PE}r\u0013P\u0016hr\u0004T\u0016yr\u0006[\u0001< \u0002E\nn&F";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "g\u0000m'\u0002F\u0011y6GF\u0015p;\u0013\u0015\u0004\u007f&\u000eZ\u000b<0\u0006GEk;\u0013]Eu<\u0004Z\bl3\u0013\\\u0007p7GB\fr6\bBEx7\u0004Z\u0017=r.R\u000bs \u000e[\u0002< \u0002D\u0010y!\u0013\u001b";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "t\u0006h;\b['} 4]\u0000n>\bV\u000e";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "F\ry \u000bZ\u0006wh7T\u000by>\u0014";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setContentView(int r4) {
        /*
        r3_this = this;
        r0 = com.actionbarsherlock.internal.ResourcesCompat.a;
        r1 = r3.mContentParent;	 Catch:{ IllegalStateException -> 0x0036 }
        if (r1 != 0) goto L_0x000b;
    L_0x0006:
        r3.installDecor();	 Catch:{ IllegalStateException -> 0x0038 }
        if (r0 == 0) goto L_0x0010;
    L_0x000b:
        r1 = r3.mContentParent;	 Catch:{ IllegalStateException -> 0x0038 }
        r1.removeAllViews();	 Catch:{ IllegalStateException -> 0x0038 }
    L_0x0010:
        r1 = r3.mActivity;
        r1 = r1.getLayoutInflater();
        r2 = r3.mContentParent;
        r1.inflate(r4, r2);
        r1 = r3.mActivity;
        r1 = r1.getWindow();
        r1 = r1.getCallback();
        if (r1 == 0) goto L_0x002a;
    L_0x0027:
        r1.onContentChanged();	 Catch:{ IllegalStateException -> 0x003a }
    L_0x002a:
        r3.initActionBar();	 Catch:{ IllegalStateException -> 0x003c }
        r1 = com.actionbarsherlock.app.SherlockActivity.a;	 Catch:{ IllegalStateException -> 0x003c }
        if (r1 == 0) goto L_0x0035;
    L_0x0031:
        r0 = r0 + 1;
        com.actionbarsherlock.internal.ResourcesCompat.a = r0;	 Catch:{ IllegalStateException -> 0x003c }
    L_0x0035:
        return;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ActionBarSherlockCompat.setContentView(int):void");
    }

    public void dispatchStop() {
        try {
            if (this.aActionBar != null) {
                this.aActionBar.setShowHideAnimationEnabled(false);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private static int loadUiOptionsFromManifest(android.app.Activity r13) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r6 = com.actionbarsherlock.internal.ResourcesCompat.a;
        r1 = 0;
        r0 = r13.getClass();	 Catch:{ Exception -> 0x00d7 }
        r7 = r0.getName();	 Catch:{ Exception -> 0x00d7 }
        r0 = r13.getApplicationInfo();	 Catch:{ Exception -> 0x00d7 }
        r8 = r0.packageName;	 Catch:{ Exception -> 0x00d7 }
        r0 = 0;	 Catch:{ Exception -> 0x00d7 }
        r0 = r13.createPackageContext(r8, r0);	 Catch:{ Exception -> 0x00d7 }
        r0 = r0.getAssets();	 Catch:{ Exception -> 0x00d7 }
        r2 = z;	 Catch:{ Exception -> 0x00d7 }
        r3 = 8;	 Catch:{ Exception -> 0x00d7 }
        r2 = r2[r3];	 Catch:{ Exception -> 0x00d7 }
        r9 = r0.openXmlResourceParser(r2);	 Catch:{ Exception -> 0x00d7 }
        r0 = r9.getEventType();	 Catch:{ Exception -> 0x00d7 }
        r12 = r0;
        r0 = r1;
        r1 = r12;
    L_0x002b:
        r2 = 1;
        if (r1 == r2) goto L_0x00d4;
    L_0x002e:
        r2 = 2;
        if (r1 != r2) goto L_0x00ce;
    L_0x0031:
        r3 = r9.getName();	 Catch:{ Exception -> 0x00e3 }
        r1 = z;	 Catch:{ Exception -> 0x00e3 }
        r2 = 7;	 Catch:{ Exception -> 0x00e3 }
        r1 = r1[r2];	 Catch:{ Exception -> 0x00e3 }
        r1 = r1.equals(r3);	 Catch:{ Exception -> 0x00e3 }
        if (r1 == 0) goto L_0x0066;	 Catch:{ Exception -> 0x00e3 }
    L_0x0040:
        r1 = r9.getAttributeCount();	 Catch:{ Exception -> 0x00e3 }
        r1 = r1 + -1;
        r2 = r1;
        r1 = r0;
    L_0x0048:
        if (r2 < 0) goto L_0x00f3;
    L_0x004a:
        r0 = z;	 Catch:{ Exception -> 0x00d7 }
        r4 = 5;	 Catch:{ Exception -> 0x00d7 }
        r0 = r0[r4];	 Catch:{ Exception -> 0x00d7 }
        r4 = r9.getAttributeName(r2);	 Catch:{ Exception -> 0x00d7 }
        r0 = r0.equals(r4);	 Catch:{ Exception -> 0x00d7 }
        if (r0 == 0) goto L_0x00f0;	 Catch:{ Exception -> 0x00d7 }
    L_0x0059:
        r0 = 0;	 Catch:{ Exception -> 0x00d7 }
        r0 = r9.getAttributeIntValue(r2, r0);	 Catch:{ Exception -> 0x00d7 }
        if (r6 == 0) goto L_0x0064;
    L_0x0060:
        r1 = r2 + -1;
        if (r6 == 0) goto L_0x00ec;
    L_0x0064:
        if (r6 == 0) goto L_0x00ce;
    L_0x0066:
        r1 = r0;
        r0 = z;	 Catch:{ Exception -> 0x00d5 }
        r2 = 9;	 Catch:{ Exception -> 0x00d5 }
        r0 = r0[r2];	 Catch:{ Exception -> 0x00d5 }
        r0 = r0.equals(r3);	 Catch:{ Exception -> 0x00d5 }
        if (r0 == 0) goto L_0x00ea;
    L_0x0073:
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r0 = r9.getAttributeCount();	 Catch:{ Exception -> 0x00d7 }
        r0 = r0 + -1;	 Catch:{ Exception -> 0x00d7 }
        r12 = r0;	 Catch:{ Exception -> 0x00d7 }
        r0 = r2;	 Catch:{ Exception -> 0x00d7 }
        r2 = r4;	 Catch:{ Exception -> 0x00d7 }
        r4 = r3;	 Catch:{ Exception -> 0x00d7 }
        r3 = r12;	 Catch:{ Exception -> 0x00d7 }
    L_0x0081:
        if (r3 < 0) goto L_0x00c7;	 Catch:{ Exception -> 0x00d7 }
    L_0x0083:
        r5 = r9.getAttributeName(r3);	 Catch:{ Exception -> 0x00d7 }
        r10 = z;	 Catch:{ Exception -> 0x00d7 }
        r11 = 10;	 Catch:{ Exception -> 0x00d7 }
        r10 = r10[r11];	 Catch:{ Exception -> 0x00d7 }
        r10 = r10.equals(r5);	 Catch:{ Exception -> 0x00d7 }
        if (r10 == 0) goto L_0x009e;	 Catch:{ Exception -> 0x00d7 }
    L_0x0093:
        r2 = 0;	 Catch:{ Exception -> 0x00d7 }
        r2 = r9.getAttributeIntValue(r3, r2);	 Catch:{ Exception -> 0x00d7 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x00d7 }
        if (r6 == 0) goto L_0x00e5;
    L_0x009e:
        r10 = z;	 Catch:{ Exception -> 0x00df }
        r11 = 6;	 Catch:{ Exception -> 0x00df }
        r10 = r10[r11];	 Catch:{ Exception -> 0x00df }
        r5 = r10.equals(r5);	 Catch:{ Exception -> 0x00df }
        if (r5 == 0) goto L_0x00e5;
    L_0x00a9:
        r4 = r9.getAttributeValue(r3);	 Catch:{ Exception -> 0x00d7 }
        r4 = cleanActivityName(r8, r4);	 Catch:{ Exception -> 0x00d7 }
        r5 = r7.equals(r4);	 Catch:{ Exception -> 0x00e1 }
        if (r5 != 0) goto L_0x00b9;
    L_0x00b7:
        if (r6 == 0) goto L_0x00c7;
    L_0x00b9:
        r0 = 1;
        r5 = r2;
    L_0x00bb:
        if (r5 == 0) goto L_0x00c3;
    L_0x00bd:
        if (r4 == 0) goto L_0x00c3;
    L_0x00bf:
        r1 = r5.intValue();	 Catch:{ Exception -> 0x00d7 }
    L_0x00c3:
        r2 = r3 + -1;
        if (r6 == 0) goto L_0x00e7;
    L_0x00c7:
        r12 = r0;
        r0 = r1;
        r1 = r12;
        if (r1 == 0) goto L_0x00ce;
    L_0x00cc:
        if (r6 == 0) goto L_0x00d4;
    L_0x00ce:
        r1 = r9.nextToken();	 Catch:{ Exception -> 0x00e3 }
        if (r6 == 0) goto L_0x002b;
    L_0x00d4:
        return r0;
    L_0x00d5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00d7 }
    L_0x00d7:
        r0 = move-exception;
        r12 = r0;
        r0 = r1;
        r1 = r12;
    L_0x00db:
        r1.printStackTrace();
        goto L_0x00d4;
    L_0x00df:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00d7 }
    L_0x00e1:
        r0 = move-exception;	 Catch:{ Exception -> 0x00d7 }
        throw r0;	 Catch:{ Exception -> 0x00d7 }
    L_0x00e3:
        r1 = move-exception;
        goto L_0x00db;
    L_0x00e5:
        r5 = r2;
        goto L_0x00bb;
    L_0x00e7:
        r3 = r2;
        r2 = r5;
        goto L_0x0081;
    L_0x00ea:
        r0 = r1;
        goto L_0x00ce;
    L_0x00ec:
        r2 = r1;
        r1 = r0;
        goto L_0x0048;
    L_0x00f0:
        r0 = r1;
        goto L_0x0060;
    L_0x00f3:
        r0 = r1;
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ActionBarSherlockCompat.loadUiOptionsFromManifest(android.app.Activity):int");
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return callbackOptionsItemSelected(menuItem);
    }

    private void updateInt(int i, int i2, boolean z) {
        try {
            if (this.mContentParent != null) {
                try {
                    if (((1 << i) & getFeatures()) != 0 || z) {
                        onIntChanged(i, i2);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public boolean dispatchCloseOptionsMenu() {
        boolean z = false;
        try {
            if (isReservingOverflow()) {
                try {
                    if (this.wActionBar != null) {
                        z = this.wActionBar.hideOverflowMenu();
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            return z;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    protected Context getThemedContext() {
        return this.aActionBar.getThemedContext();
    }

    public boolean dispatchOptionsItemSelected(android.view.MenuItem menuItem) {
        throw new IllegalStateException(z[14]);
    }

    static MenuBuilder access$200(ActionBarSherlockCompat actionBarSherlockCompat) {
        return actionBarSherlockCompat.mMenu;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchTitleChanged(java.lang.CharSequence r2, int r3) {
        /*
        r1_this = this;
        r0 = r1.mIsDelegate;	 Catch:{ IllegalStateException -> 0x0021 }
        if (r0 == 0) goto L_0x0008;
    L_0x0004:
        r0 = r1.mIsTitleReady;	 Catch:{ IllegalStateException -> 0x0023 }
        if (r0 == 0) goto L_0x001e;
    L_0x0008:
        r0 = r1.mTitleView;	 Catch:{ IllegalStateException -> 0x0025 }
        if (r0 == 0) goto L_0x0015;
    L_0x000c:
        r0 = r1.mTitleView;	 Catch:{ IllegalStateException -> 0x0027 }
        r0.setText(r2);	 Catch:{ IllegalStateException -> 0x0027 }
        r0 = com.actionbarsherlock.internal.ResourcesCompat.a;	 Catch:{ IllegalStateException -> 0x0027 }
        if (r0 == 0) goto L_0x001e;
    L_0x0015:
        r0 = r1.wActionBar;	 Catch:{ IllegalStateException -> 0x0029 }
        if (r0 == 0) goto L_0x001e;
    L_0x0019:
        r0 = r1.wActionBar;	 Catch:{ IllegalStateException -> 0x0029 }
        r0.setWindowTitle(r2);	 Catch:{ IllegalStateException -> 0x0029 }
    L_0x001e:
        r1.mTitle = r2;
        return;
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ActionBarSherlockCompat.dispatchTitleChanged(java.lang.CharSequence, int):void");
    }

    private boolean isReservingOverflow() {
        try {
            if (!this.mReserveOverflowSet) {
                this.mReserveOverflow = ActionMenuPresenter.reserveOverflow(this.mActivity);
                this.mReserveOverflowSet = true;
            }
            return this.mReserveOverflow;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void onMenuModeChange(MenuBuilder menuBuilder) {
        reopenMenu(true);
    }

    static Activity access$600(ActionBarSherlockCompat actionBarSherlockCompat) {
        return actionBarSherlockCompat.mActivity;
    }

    public void dispatchRestoreInstanceState(Bundle bundle) {
        this.mMenuFrozenActionViewState = (Bundle) bundle.getParcelable(z[2]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.ViewGroup generateLayout() {
        /*
        r6_this = this;
        r5 = -1;
        r4 = 0;
        r1 = com.actionbarsherlock.internal.ResourcesCompat.a;
        r0 = r6.mActivity;
        r0 = r0.getTheme();
        r2 = com.actionbarsherlock.R.styleable.SherlockTheme;
        r0 = r0.obtainStyledAttributes(r2);
        r2 = com.actionbarsherlock.R.styleable.SherlockTheme_android_windowIsFloating;	 Catch:{ IllegalStateException -> 0x002c }
        r3 = 0;
        r2 = r0.getBoolean(r2, r3);	 Catch:{ IllegalStateException -> 0x002c }
        r6.mIsFloating = r2;	 Catch:{ IllegalStateException -> 0x002c }
        r2 = com.actionbarsherlock.R.styleable.SherlockTheme_windowActionBar;	 Catch:{ IllegalStateException -> 0x002c }
        r2 = r0.hasValue(r2);	 Catch:{ IllegalStateException -> 0x002c }
        if (r2 != 0) goto L_0x002e;
    L_0x0021:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x002c }
        r1 = z;	 Catch:{ IllegalStateException -> 0x002c }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x002c }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x002c }
        throw r0;	 Catch:{ IllegalStateException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r2 = com.actionbarsherlock.R.styleable.SherlockTheme_windowNoTitle;	 Catch:{ IllegalStateException -> 0x00db }
        r3 = 0;
        r2 = r0.getBoolean(r2, r3);	 Catch:{ IllegalStateException -> 0x00db }
        if (r2 == 0) goto L_0x003d;
    L_0x0037:
        r2 = 1;
        r6.requestFeature(r2);	 Catch:{ IllegalStateException -> 0x00dd }
        if (r1 == 0) goto L_0x004b;
    L_0x003d:
        r2 = com.actionbarsherlock.R.styleable.SherlockTheme_windowActionBar;	 Catch:{ IllegalStateException -> 0x00df }
        r3 = 0;
        r2 = r0.getBoolean(r2, r3);	 Catch:{ IllegalStateException -> 0x00df }
        if (r2 == 0) goto L_0x004b;
    L_0x0046:
        r2 = 8;
        r6.requestFeature(r2);	 Catch:{ IllegalStateException -> 0x00df }
    L_0x004b:
        r2 = com.actionbarsherlock.R.styleable.SherlockTheme_windowActionBarOverlay;	 Catch:{ IllegalStateException -> 0x00e1 }
        r3 = 0;
        r2 = r0.getBoolean(r2, r3);	 Catch:{ IllegalStateException -> 0x00e1 }
        if (r2 == 0) goto L_0x0059;
    L_0x0054:
        r2 = 9;
        r6.requestFeature(r2);	 Catch:{ IllegalStateException -> 0x00e1 }
    L_0x0059:
        r2 = com.actionbarsherlock.R.styleable.SherlockTheme_windowActionModeOverlay;	 Catch:{ IllegalStateException -> 0x00e3 }
        r3 = 0;
        r2 = r0.getBoolean(r2, r3);	 Catch:{ IllegalStateException -> 0x00e3 }
        if (r2 == 0) goto L_0x0067;
    L_0x0062:
        r2 = 10;
        r6.requestFeature(r2);	 Catch:{ IllegalStateException -> 0x00e3 }
    L_0x0067:
        r0.recycle();	 Catch:{ IllegalStateException -> 0x00e5 }
        r0 = 1;
        r0 = r6.hasFeature(r0);	 Catch:{ IllegalStateException -> 0x00e5 }
        if (r0 != 0) goto L_0x0098;
    L_0x0071:
        r0 = r6.mIsFloating;	 Catch:{ IllegalStateException -> 0x00e5 }
        if (r0 == 0) goto L_0x0088;
    L_0x0075:
        r0 = r6.mDecor;
        r0 = r0.getParent();
        r0 = (android.view.ViewGroup) r0;
        r6.mDecor = r0;
        r0 = r6.mDecor;
        r0.removeAllViews();
        r0 = com.actionbarsherlock.R.layout.abs__dialog_title_holo;
        if (r1 == 0) goto L_0x00ad;
    L_0x0088:
        r0 = 9;
        r0 = r6.hasFeature(r0);	 Catch:{ IllegalStateException -> 0x00e7 }
        if (r0 == 0) goto L_0x0094;
    L_0x0090:
        r0 = com.actionbarsherlock.R.layout.abs__screen_action_bar_overlay;
        if (r1 == 0) goto L_0x00ad;
    L_0x0094:
        r0 = com.actionbarsherlock.R.layout.abs__screen_action_bar;
        if (r1 == 0) goto L_0x00ad;
    L_0x0098:
        r0 = 10;
        r0 = r6.hasFeature(r0);	 Catch:{ IllegalStateException -> 0x00e9 }
        if (r0 == 0) goto L_0x00ab;
    L_0x00a0:
        r0 = 1;
        r0 = r6.hasFeature(r0);	 Catch:{ IllegalStateException -> 0x00e9 }
        if (r0 != 0) goto L_0x00ab;
    L_0x00a7:
        r0 = com.actionbarsherlock.R.layout.abs__screen_simple_overlay_action_mode;
        if (r1 == 0) goto L_0x00ad;
    L_0x00ab:
        r0 = com.actionbarsherlock.R.layout.abs__screen_simple;
    L_0x00ad:
        r1 = r6.mActivity;
        r1 = r1.getLayoutInflater();
        r2 = 0;
        r0 = r1.inflate(r0, r2);
        r1 = r6.mDecor;
        r2 = new android.view.ViewGroup$LayoutParams;
        r2.<init>(r5, r5);
        r1.addView(r0, r2);
        r0 = r6.mDecor;
        r1 = com.actionbarsherlock.R.id.abs__content;
        r0 = r0.findViewById(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x00eb;
    L_0x00ce:
        r0 = new java.lang.RuntimeException;	 Catch:{ IllegalStateException -> 0x00d9 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x00d9 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00d9 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x00d9 }
        throw r0;	 Catch:{ IllegalStateException -> 0x00d9 }
    L_0x00d9:
        r0 = move-exception;
        throw r0;
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00dd }
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00df }
    L_0x00df:
        r0 = move-exception;
        throw r0;
    L_0x00e1:
        r0 = move-exception;
        throw r0;
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        throw r0;
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r1 = r6.mDecor;
        r1.setId(r5);
        r1 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;
        r0.setId(r1);
        r1 = 5;
        r1 = r6.hasFeature(r1);
        if (r1 == 0) goto L_0x0107;
    L_0x00fd:
        r1 = r6.getCircularProgressBar(r4);
        if (r1 == 0) goto L_0x0107;
    L_0x0103:
        r2 = 1;
        r1.setIndeterminate(r2);	 Catch:{ IllegalStateException -> 0x0108 }
    L_0x0107:
        return r0;
    L_0x0108:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ActionBarSherlockCompat.generateLayout():android.view.ViewGroup");
    }

    private void onIntChanged(int i, int i2) {
        if (i == 2 || i == 5) {
            try {
                updateProgressBars(i2);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initActionBar() {
        /*
        r3_this = this;
        r0 = r3.mDecor;	 Catch:{ IllegalStateException -> 0x0023 }
        if (r0 != 0) goto L_0x0007;
    L_0x0004:
        r3.installDecor();	 Catch:{ IllegalStateException -> 0x0023 }
    L_0x0007:
        r0 = r3.aActionBar;	 Catch:{ IllegalStateException -> 0x0025 }
        if (r0 != 0) goto L_0x0022;
    L_0x000b:
        r0 = 8;
        r0 = r3.hasFeature(r0);	 Catch:{ IllegalStateException -> 0x0027 }
        if (r0 == 0) goto L_0x0022;
    L_0x0013:
        r0 = 1;
        r0 = r3.hasFeature(r0);	 Catch:{ IllegalStateException -> 0x0029 }
        if (r0 != 0) goto L_0x0022;
    L_0x001a:
        r0 = r3.mActivity;	 Catch:{ IllegalStateException -> 0x002b }
        r0 = r0.isChild();	 Catch:{ IllegalStateException -> 0x002b }
        if (r0 == 0) goto L_0x002d;
    L_0x0022:
        return;
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;
    L_0x002d:
        r0 = new com.actionbarsherlock.internal.app.ActionBarImpl;	 Catch:{ IllegalStateException -> 0x0048 }
        r1 = r3.mActivity;	 Catch:{ IllegalStateException -> 0x0048 }
        r2 = r3.mFeatures;	 Catch:{ IllegalStateException -> 0x0048 }
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0048 }
        r3.aActionBar = r0;	 Catch:{ IllegalStateException -> 0x0048 }
        r0 = r3.mIsDelegate;	 Catch:{ IllegalStateException -> 0x0048 }
        if (r0 != 0) goto L_0x0022;
    L_0x003c:
        r0 = r3.wActionBar;	 Catch:{ IllegalStateException -> 0x0048 }
        r1 = r3.mActivity;	 Catch:{ IllegalStateException -> 0x0048 }
        r1 = r1.getTitle();	 Catch:{ IllegalStateException -> 0x0048 }
        r0.setWindowTitle(r1);	 Catch:{ IllegalStateException -> 0x0048 }
        goto L_0x0022;
    L_0x0048:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ActionBarSherlockCompat.initActionBar():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void reopenMenu(boolean r3) {
        /*
        r2_this = this;
        r0 = r2.wActionBar;	 Catch:{ IllegalStateException -> 0x0049 }
        if (r0 == 0) goto L_0x0048;
    L_0x0004:
        r0 = r2.wActionBar;	 Catch:{ IllegalStateException -> 0x004b }
        r0 = r0.isOverflowReserved();	 Catch:{ IllegalStateException -> 0x004b }
        if (r0 == 0) goto L_0x0048;
    L_0x000c:
        r0 = r2.wActionBar;	 Catch:{ IllegalStateException -> 0x004d }
        r0 = r0.isOverflowMenuShowing();	 Catch:{ IllegalStateException -> 0x004d }
        if (r0 == 0) goto L_0x0016;
    L_0x0014:
        if (r3 != 0) goto L_0x0039;
    L_0x0016:
        r0 = r2.wActionBar;	 Catch:{ IllegalStateException -> 0x0051 }
        r0 = r0.getVisibility();	 Catch:{ IllegalStateException -> 0x0051 }
        if (r0 != 0) goto L_0x0048;
    L_0x001e:
        r0 = r2.mMenu;	 Catch:{ IllegalStateException -> 0x0053 }
        r0 = r2.callbackPrepareOptionsMenu(r0);	 Catch:{ IllegalStateException -> 0x0053 }
        if (r0 == 0) goto L_0x0048;
    L_0x0026:
        r0 = r2.wActionBar;	 Catch:{ IllegalStateException -> 0x0055 }
        r0.showOverflowMenu();	 Catch:{ IllegalStateException -> 0x0055 }
        r0 = r2.aActionBar;	 Catch:{ IllegalStateException -> 0x0055 }
        if (r0 == 0) goto L_0x0048;
    L_0x002f:
        r0 = r2.aActionBar;	 Catch:{ IllegalStateException -> 0x0057 }
        r1 = 1;
        r0.dispatchMenuVisibilityChanged(r1);	 Catch:{ IllegalStateException -> 0x0057 }
        r0 = com.actionbarsherlock.internal.ResourcesCompat.a;	 Catch:{ IllegalStateException -> 0x0057 }
        if (r0 == 0) goto L_0x0048;
    L_0x0039:
        r0 = r2.wActionBar;	 Catch:{ IllegalStateException -> 0x0059 }
        r0.hideOverflowMenu();	 Catch:{ IllegalStateException -> 0x0059 }
        r0 = r2.aActionBar;	 Catch:{ IllegalStateException -> 0x0059 }
        if (r0 == 0) goto L_0x0048;
    L_0x0042:
        r0 = r2.aActionBar;	 Catch:{ IllegalStateException -> 0x0059 }
        r1 = 0;
        r0.dispatchMenuVisibilityChanged(r1);	 Catch:{ IllegalStateException -> 0x0059 }
    L_0x0048:
        return;
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ActionBarSherlockCompat.reopenMenu(boolean):void");
    }

    public ActionBar getActionBar() {
        initActionBar();
        return this.aActionBar;
    }

    public void dispatchPause() {
        try {
            try {
                if (this.wActionBar == null) {
                    return;
                }
                if (this.wActionBar.isOverflowMenuShowing()) {
                    this.wActionBar.hideOverflowMenu();
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.actionbarsherlock.view.ActionMode startActionMode(com.actionbarsherlock.view.ActionMode.Callback r7) {
        /*
        r6_this = this;
        r2 = 0;
        r1 = 1;
        r0 = 0;
        r3 = com.actionbarsherlock.internal.ResourcesCompat.a;
        r4 = r6.mActionMode;	 Catch:{ IllegalStateException -> 0x0092 }
        if (r4 == 0) goto L_0x000e;
    L_0x0009:
        r4 = r6.mActionMode;	 Catch:{ IllegalStateException -> 0x0092 }
        r4.finish();	 Catch:{ IllegalStateException -> 0x0092 }
    L_0x000e:
        r4 = new com.actionbarsherlock.internal.ActionBarSherlockCompat$ActionModeCallbackWrapper;
        r4.<init>(r6, r7);
        r6.initActionBar();
        r5 = r6.aActionBar;
        if (r5 == 0) goto L_0x0020;
    L_0x001a:
        r2 = r6.aActionBar;
        r2 = r2.startActionMode(r4);
    L_0x0020:
        if (r2 == 0) goto L_0x002c;
    L_0x0022:
        r6.mActionMode = r2;	 Catch:{ IllegalStateException -> 0x0094 }
        if (r3 == 0) goto L_0x007c;
    L_0x0026:
        r2 = com.actionbarsherlock.app.SherlockActivity.a;	 Catch:{ IllegalStateException -> 0x0096 }
        if (r2 == 0) goto L_0x0098;
    L_0x002a:
        com.actionbarsherlock.app.SherlockActivity.a = r0;
    L_0x002c:
        r0 = r6.mActionModeView;
        if (r0 != 0) goto L_0x0044;
    L_0x0030:
        r0 = r6.mDecor;
        r2 = com.actionbarsherlock.R.id.abs__action_mode_bar_stub;
        r0 = r0.findViewById(r2);
        r0 = (android.view.ViewStub) r0;
        if (r0 == 0) goto L_0x0044;
    L_0x003c:
        r0 = r0.inflate();	 Catch:{ IllegalStateException -> 0x009a }
        r0 = (com.actionbarsherlock.internal.widget.ActionBarContextView) r0;	 Catch:{ IllegalStateException -> 0x009a }
        r6.mActionModeView = r0;	 Catch:{ IllegalStateException -> 0x009a }
    L_0x0044:
        r0 = r6.mActionModeView;
        if (r0 == 0) goto L_0x007c;
    L_0x0048:
        r0 = r6.mActionModeView;
        r0.killMode();
        r0 = new com.actionbarsherlock.internal.view.StandaloneActionMode;
        r2 = r6.mActivity;
        r5 = r6.mActionModeView;
        r0.<init>(r2, r5, r4, r1);
        r1 = r0.getMenu();	 Catch:{ IllegalStateException -> 0x009c }
        r1 = r7.onCreateActionMode(r0, r1);	 Catch:{ IllegalStateException -> 0x009c }
        if (r1 == 0) goto L_0x0079;
    L_0x0060:
        r0.invalidate();	 Catch:{ IllegalStateException -> 0x009e }
        r1 = r6.mActionModeView;	 Catch:{ IllegalStateException -> 0x009e }
        r1.initForMode(r0);	 Catch:{ IllegalStateException -> 0x009e }
        r1 = r6.mActionModeView;	 Catch:{ IllegalStateException -> 0x009e }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ IllegalStateException -> 0x009e }
        r6.mActionMode = r0;	 Catch:{ IllegalStateException -> 0x009e }
        r0 = r6.mActionModeView;	 Catch:{ IllegalStateException -> 0x009e }
        r1 = 32;
        r0.sendAccessibilityEvent(r1);	 Catch:{ IllegalStateException -> 0x009e }
        if (r3 == 0) goto L_0x007c;
    L_0x0079:
        r0 = 0;
        r6.mActionMode = r0;	 Catch:{ IllegalStateException -> 0x009e }
    L_0x007c:
        r0 = r6.mActionMode;	 Catch:{ IllegalStateException -> 0x00a0 }
        if (r0 == 0) goto L_0x008f;
    L_0x0080:
        r0 = r6.mActivity;	 Catch:{ IllegalStateException -> 0x00a2 }
        r0 = r0 instanceof com.actionbarsherlock.ActionBarSherlock.OnActionModeStartedListener;	 Catch:{ IllegalStateException -> 0x00a2 }
        if (r0 == 0) goto L_0x008f;
    L_0x0086:
        r0 = r6.mActivity;	 Catch:{ IllegalStateException -> 0x00a2 }
        r0 = (com.actionbarsherlock.ActionBarSherlock.OnActionModeStartedListener) r0;	 Catch:{ IllegalStateException -> 0x00a2 }
        r1 = r6.mActionMode;	 Catch:{ IllegalStateException -> 0x00a2 }
        r0.onActionModeStarted(r1);	 Catch:{ IllegalStateException -> 0x00a2 }
    L_0x008f:
        r0 = r6.mActionMode;
        return r0;
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;
    L_0x0098:
        r0 = r1;
        goto L_0x002a;
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009e }
    L_0x009e:
        r0 = move-exception;
        throw r0;
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ActionBarSherlockCompat.startActionMode(com.actionbarsherlock.view.ActionMode$Callback):com.actionbarsherlock.view.ActionMode");
    }

    void checkCloseActionMenu(Menu menu) {
        try {
            if (!this.mClosingActionMenu) {
                this.mClosingActionMenu = true;
                this.wActionBar.dismissPopupMenus();
                this.mClosingActionMenu = false;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
        /*
        r3_this = this;
        r0 = 1;
        r1 = r4.getKeyCode();
        r2 = 4;
        if (r1 != r2) goto L_0x0036;
    L_0x0008:
        r1 = r4.getAction();
        r2 = r3.mActionMode;	 Catch:{ IllegalStateException -> 0x0018 }
        if (r2 == 0) goto L_0x001c;
    L_0x0010:
        if (r1 != r0) goto L_0x0017;
    L_0x0012:
        r1 = r3.mActionMode;	 Catch:{ IllegalStateException -> 0x001a }
        r1.finish();	 Catch:{ IllegalStateException -> 0x001a }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        r2 = r3.wActionBar;	 Catch:{ IllegalStateException -> 0x0032 }
        if (r2 == 0) goto L_0x0036;
    L_0x0020:
        r2 = r3.wActionBar;	 Catch:{ IllegalStateException -> 0x0034 }
        r2 = r2.hasExpandedActionView();	 Catch:{ IllegalStateException -> 0x0034 }
        if (r2 == 0) goto L_0x0036;
    L_0x0028:
        if (r1 != r0) goto L_0x0017;
    L_0x002a:
        r1 = r3.wActionBar;	 Catch:{ IllegalStateException -> 0x0030 }
        r1.collapseActionView();	 Catch:{ IllegalStateException -> 0x0030 }
        goto L_0x0017;
    L_0x0030:
        r0 = move-exception;
        throw r0;
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0030 }
    L_0x0036:
        r0 = 0;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ActionBarSherlockCompat.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    private void hideProgressBars(IcsProgressBar icsProgressBar, IcsProgressBar icsProgressBar2) {
        int i = this.mFeatures;
        Animation loadAnimation = AnimationUtils.loadAnimation(this.mActivity, 17432577);
        try {
            loadAnimation.setDuration(1000);
            if ((i & 32) != 0) {
                if (icsProgressBar2.getVisibility() == 0) {
                    icsProgressBar2.startAnimation(loadAnimation);
                    icsProgressBar2.setVisibility(4);
                }
            }
            if ((i & 4) != 0) {
                try {
                    if (icsProgressBar.getVisibility() == 0) {
                        icsProgressBar.startAnimation(loadAnimation);
                        icsProgressBar.setVisibility(4);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static Activity access$400(ActionBarSherlockCompat actionBarSherlockCompat) {
        return actionBarSherlockCompat.mActivity;
    }

    public boolean dispatchOpenOptionsMenu() {
        try {
            return !isReservingOverflow() ? false : this.wActionBar.showOverflowMenu();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void setFeatureInt(int i, int i2) {
        updateInt(i, i2, false);
    }

    public void dispatchPanelClosed(int i, android.view.Menu menu) {
        if (i == 8 || i == 0) {
            try {
                if (this.aActionBar != null) {
                    this.aActionBar.dispatchMenuVisibilityChanged(false);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onMenuItemClick(android.view.MenuItem r5) {
        /*
        r4_this = this;
        r0 = r4.mNativeItemMap;
        r0 = r0.get(r5);
        r0 = (com.actionbarsherlock.internal.view.menu.MenuItemImpl) r0;
        if (r0 == 0) goto L_0x0011;
    L_0x000a:
        r0.invoke();	 Catch:{ IllegalStateException -> 0x003d }
        r0 = com.actionbarsherlock.internal.ResourcesCompat.a;	 Catch:{ IllegalStateException -> 0x003d }
        if (r0 == 0) goto L_0x003b;
    L_0x0011:
        r0 = z;	 Catch:{ IllegalStateException -> 0x003d }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x003d }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x003d }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x003d }
        r2 = z;	 Catch:{ IllegalStateException -> 0x003d }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x003d }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x003d }
        r1 = r1.append(r5);	 Catch:{ IllegalStateException -> 0x003d }
        r2 = z;	 Catch:{ IllegalStateException -> 0x003d }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x003d }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x003d }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x003d }
        android.util.Log.e(r0, r1);	 Catch:{ IllegalStateException -> 0x003d }
    L_0x003b:
        r0 = 1;
        return r0;
    L_0x003d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ActionBarSherlockCompat.onMenuItemClick(android.view.MenuItem):boolean");
    }

    public boolean dispatchCreateOptionsMenu(android.view.Menu menu) {
        return true;
    }

    static ActionBarContextView access$300(ActionBarSherlockCompat actionBarSherlockCompat) {
        return actionBarSherlockCompat.mActionModeView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean preparePanel() {
        /*
        r4_this = this;
        r1 = 1;
        r0 = 0;
        r2 = r4.mMenuIsPrepared;	 Catch:{ IllegalStateException -> 0x0008 }
        if (r2 == 0) goto L_0x000a;
    L_0x0006:
        r0 = r1;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r2 = r4.mMenu;	 Catch:{ IllegalStateException -> 0x0048 }
        if (r2 == 0) goto L_0x0012;
    L_0x000e:
        r2 = r4.mMenuRefreshContent;	 Catch:{ IllegalStateException -> 0x004a }
        if (r2 == 0) goto L_0x0058;
    L_0x0012:
        r2 = r4.mMenu;	 Catch:{ IllegalStateException -> 0x004c }
        if (r2 != 0) goto L_0x0020;
    L_0x0016:
        r2 = r4.initializePanelMenu();	 Catch:{ IllegalStateException -> 0x004e }
        if (r2 == 0) goto L_0x0007;
    L_0x001c:
        r2 = r4.mMenu;	 Catch:{ IllegalStateException -> 0x0050 }
        if (r2 == 0) goto L_0x0007;
    L_0x0020:
        r2 = r4.wActionBar;	 Catch:{ IllegalStateException -> 0x0052 }
        if (r2 == 0) goto L_0x002b;
    L_0x0024:
        r2 = r4.wActionBar;	 Catch:{ IllegalStateException -> 0x0052 }
        r3 = r4.mMenu;	 Catch:{ IllegalStateException -> 0x0052 }
        r2.setMenu(r3, r4);	 Catch:{ IllegalStateException -> 0x0052 }
    L_0x002b:
        r2 = r4.mMenu;	 Catch:{ IllegalStateException -> 0x0054 }
        r2.stopDispatchingItemsChanged();	 Catch:{ IllegalStateException -> 0x0054 }
        r2 = r4.mMenu;	 Catch:{ IllegalStateException -> 0x0054 }
        r2 = r4.callbackCreateOptionsMenu(r2);	 Catch:{ IllegalStateException -> 0x0054 }
        if (r2 != 0) goto L_0x0056;
    L_0x0038:
        r1 = 0;
        r4.mMenu = r1;	 Catch:{ IllegalStateException -> 0x0046 }
        r1 = r4.wActionBar;	 Catch:{ IllegalStateException -> 0x0046 }
        if (r1 == 0) goto L_0x0007;
    L_0x003f:
        r1 = r4.wActionBar;	 Catch:{ IllegalStateException -> 0x0046 }
        r2 = 0;
        r1.setMenu(r2, r4);	 Catch:{ IllegalStateException -> 0x0046 }
        goto L_0x0007;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004a }
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
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0046 }
    L_0x0056:
        r4.mMenuRefreshContent = r0;
    L_0x0058:
        r2 = r4.mMenu;	 Catch:{ IllegalStateException -> 0x0083 }
        r2.stopDispatchingItemsChanged();	 Catch:{ IllegalStateException -> 0x0083 }
        r2 = r4.mMenuFrozenActionViewState;	 Catch:{ IllegalStateException -> 0x0083 }
        if (r2 == 0) goto L_0x006b;
    L_0x0061:
        r2 = r4.mMenu;	 Catch:{ IllegalStateException -> 0x0083 }
        r3 = r4.mMenuFrozenActionViewState;	 Catch:{ IllegalStateException -> 0x0083 }
        r2.restoreActionViewStates(r3);	 Catch:{ IllegalStateException -> 0x0083 }
        r2 = 0;
        r4.mMenuFrozenActionViewState = r2;	 Catch:{ IllegalStateException -> 0x0083 }
    L_0x006b:
        r2 = r4.mMenu;	 Catch:{ IllegalStateException -> 0x0085 }
        r2 = r4.callbackPrepareOptionsMenu(r2);	 Catch:{ IllegalStateException -> 0x0085 }
        if (r2 != 0) goto L_0x0089;
    L_0x0073:
        r1 = r4.wActionBar;	 Catch:{ IllegalStateException -> 0x0087 }
        if (r1 == 0) goto L_0x007d;
    L_0x0077:
        r1 = r4.wActionBar;	 Catch:{ IllegalStateException -> 0x0087 }
        r2 = 0;
        r1.setMenu(r2, r4);	 Catch:{ IllegalStateException -> 0x0087 }
    L_0x007d:
        r1 = r4.mMenu;
        r1.startDispatchingItemsChanged();
        goto L_0x0007;
    L_0x0083:
        r0 = move-exception;
        throw r0;
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r2 = -1;
        r2 = android.view.KeyCharacterMap.load(r2);
        r3 = r4.mMenu;	 Catch:{ IllegalStateException -> 0x00a4 }
        r2 = r2.getKeyboardType();	 Catch:{ IllegalStateException -> 0x00a4 }
        if (r2 == r1) goto L_0x0097;
    L_0x0096:
        r0 = r1;
    L_0x0097:
        r3.setQwertyMode(r0);
        r0 = r4.mMenu;
        r0.startDispatchingItemsChanged();
        r4.mMenuIsPrepared = r1;
        r0 = r1;
        goto L_0x0007;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ActionBarSherlockCompat.preparePanel():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
        /*
        r1_this = this;
        r0 = r1.mContentParent;	 Catch:{ IllegalStateException -> 0x0028 }
        if (r0 != 0) goto L_0x000b;
    L_0x0004:
        r1.installDecor();	 Catch:{ IllegalStateException -> 0x002a }
        r0 = com.actionbarsherlock.internal.ResourcesCompat.a;	 Catch:{ IllegalStateException -> 0x002a }
        if (r0 == 0) goto L_0x0010;
    L_0x000b:
        r0 = r1.mContentParent;	 Catch:{ IllegalStateException -> 0x002a }
        r0.removeAllViews();	 Catch:{ IllegalStateException -> 0x002a }
    L_0x0010:
        r0 = r1.mContentParent;
        r0.addView(r2, r3);
        r0 = r1.mActivity;
        r0 = r0.getWindow();
        r0 = r0.getCallback();
        if (r0 == 0) goto L_0x0024;
    L_0x0021:
        r0.onContentChanged();	 Catch:{ IllegalStateException -> 0x002c }
    L_0x0024:
        r1.initActionBar();
        return;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ActionBarSherlockCompat.setContentView(android.view.View, android.view.ViewGroup$LayoutParams):void");
    }

    public boolean dispatchMenuOpened(int i, android.view.Menu menu) {
        if (i != 8 && i != 0) {
            return false;
        }
        try {
            if (this.aActionBar == null) {
                return true;
            }
            this.aActionBar.dispatchMenuVisibilityChanged(true);
            return true;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateProgressBars(int r9) {
        /*
        r8_this = this;
        r7 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r3 = 1;
        r0 = 0;
        r1 = com.actionbarsherlock.internal.ResourcesCompat.a;
        r2 = r8.getCircularProgressBar(r3);
        r3 = r8.getHorizontalProgressBar(r3);
        r4 = r8.mFeatures;
        r5 = -1;
        if (r9 != r5) goto L_0x0030;
    L_0x0013:
        r5 = r4 & 4;
        if (r5 == 0) goto L_0x0026;
    L_0x0017:
        r5 = r3.getProgress();
        r6 = r3.isIndeterminate();	 Catch:{ IllegalStateException -> 0x007f }
        if (r6 != 0) goto L_0x0023;
    L_0x0021:
        if (r5 >= r7) goto L_0x0083;
    L_0x0023:
        r3.setVisibility(r0);
    L_0x0026:
        r0 = r4 & 32;
        if (r0 == 0) goto L_0x007e;
    L_0x002a:
        r0 = 0;
        r2.setVisibility(r0);	 Catch:{ IllegalStateException -> 0x0085 }
        if (r1 == 0) goto L_0x007e;
    L_0x0030:
        r0 = -2;
        if (r9 != r0) goto L_0x0047;
    L_0x0033:
        r0 = r4 & 4;
        if (r0 == 0) goto L_0x003c;
    L_0x0037:
        r0 = 8;
        r3.setVisibility(r0);	 Catch:{ IllegalStateException -> 0x0089 }
    L_0x003c:
        r0 = r4 & 32;
        if (r0 == 0) goto L_0x007e;
    L_0x0040:
        r0 = 8;
        r2.setVisibility(r0);	 Catch:{ IllegalStateException -> 0x008b }
        if (r1 == 0) goto L_0x007e;
    L_0x0047:
        r0 = -3;
        if (r9 != r0) goto L_0x0050;
    L_0x004a:
        r0 = 1;
        r3.setIndeterminate(r0);	 Catch:{ IllegalStateException -> 0x008f }
        if (r1 == 0) goto L_0x007e;
    L_0x0050:
        r0 = -4;
        if (r9 != r0) goto L_0x0059;
    L_0x0053:
        r0 = 0;
        r3.setIndeterminate(r0);	 Catch:{ IllegalStateException -> 0x0093 }
        if (r1 == 0) goto L_0x007e;
    L_0x0059:
        if (r9 < 0) goto L_0x006e;
    L_0x005b:
        if (r9 > r7) goto L_0x006e;
    L_0x005d:
        r0 = r9 + 0;
        r3.setProgress(r0);	 Catch:{ IllegalStateException -> 0x0099 }
        if (r9 >= r7) goto L_0x0069;
    L_0x0064:
        r8.showProgressBars(r3, r2);	 Catch:{ IllegalStateException -> 0x009b }
        if (r1 == 0) goto L_0x007e;
    L_0x0069:
        r8.hideProgressBars(r3, r2);	 Catch:{ IllegalStateException -> 0x009d }
        if (r1 == 0) goto L_0x007e;
    L_0x006e:
        r0 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        if (r0 > r9) goto L_0x007e;
    L_0x0072:
        r0 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        if (r9 > r0) goto L_0x007e;
    L_0x0076:
        r0 = r9 + -20000;
        r3.setSecondaryProgress(r0);	 Catch:{ IllegalStateException -> 0x00a1 }
        r8.showProgressBars(r3, r2);	 Catch:{ IllegalStateException -> 0x00a1 }
    L_0x007e:
        return;
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r0 = 4;
        goto L_0x0023;
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0089 }
    L_0x0089:
        r0 = move-exception;
        throw r0;
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0093 }
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0095 }
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0097 }
    L_0x0097:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0099 }
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ActionBarSherlockCompat.updateProgressBars(int):void");
    }

    public void dispatchSaveInstanceState(Bundle bundle) {
        try {
            if (this.mMenu != null) {
                this.mMenuFrozenActionViewState = new Bundle();
                this.mMenu.saveActionViewStates(this.mMenuFrozenActionViewState);
            }
            bundle.putParcelable(z[1], this.mMenuFrozenActionViewState);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static String cleanActivityName(String str, String str2) {
        try {
            if (str2.charAt(0) == '.') {
                str2 = str + str2;
            } else {
                try {
                    if (str2.indexOf(46, 1) == -1) {
                        str2 = str + "." + str2;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            return str2;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private int getFeatures() {
        return this.mFeatures;
    }

    static boolean access$000(ActionBarSherlockCompat actionBarSherlockCompat) {
        return actionBarSherlockCompat.mIsDestroyed;
    }

    static Activity access$100(ActionBarSherlockCompat actionBarSherlockCompat) {
        return actionBarSherlockCompat.mActivity;
    }

    private void showProgressBars(IcsProgressBar icsProgressBar, IcsProgressBar icsProgressBar2) {
        int i = this.mFeatures;
        if ((i & 32) != 0) {
            try {
                if (icsProgressBar2.getVisibility() == 4) {
                    icsProgressBar2.setVisibility(0);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        if ((i & 4) != 0) {
            try {
                if (icsProgressBar.getProgress() < 10000) {
                    icsProgressBar.setVisibility(0);
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    public void dispatchPostCreate(Bundle bundle) {
        try {
            if (this.mIsDelegate) {
                this.mIsTitleReady = true;
            }
            try {
                if (this.mDecor == null) {
                    initActionBar();
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void dispatchInvalidateOptionsMenu() {
        if (this.mMenu != null) {
            Bundle bundle = new Bundle();
            try {
                this.mMenu.saveActionViewStates(bundle);
                if (bundle.size() > 0) {
                    this.mMenuFrozenActionViewState = bundle;
                }
                this.mMenu.stopDispatchingItemsChanged();
                this.mMenu.clear();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        try {
            this.mMenuRefreshContent = true;
            if (this.wActionBar != null) {
                this.mMenuIsPrepared = false;
                preparePanel();
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void installDecor() {
        /*
        r8_this = this;
        r1 = 0;
        r2 = 1;
        r4 = 0;
        r5 = com.actionbarsherlock.internal.ResourcesCompat.a;
        r0 = r8.mDecor;	 Catch:{ IllegalStateException -> 0x0165 }
        if (r0 != 0) goto L_0x001e;
    L_0x0009:
        r0 = r8.mActivity;	 Catch:{ IllegalStateException -> 0x0165 }
        r0 = r0.getWindow();	 Catch:{ IllegalStateException -> 0x0165 }
        r0 = r0.getDecorView();	 Catch:{ IllegalStateException -> 0x0165 }
        r3 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;
        r0 = r0.findViewById(r3);	 Catch:{ IllegalStateException -> 0x0165 }
        r0 = (android.view.ViewGroup) r0;	 Catch:{ IllegalStateException -> 0x0165 }
        r8.mDecor = r0;	 Catch:{ IllegalStateException -> 0x0165 }
    L_0x001e:
        r0 = r8.mContentParent;
        if (r0 != 0) goto L_0x0164;
    L_0x0022:
        r0 = r8.mDecor;
        r0 = r0.getChildCount();
        if (r0 <= 0) goto L_0x0186;
    L_0x002a:
        r0 = new java.util.ArrayList;
        r0.<init>(r2);
        r1 = r8.mDecor;
        r3 = r1.getChildCount();
        r1 = r4;
    L_0x0036:
        if (r1 >= r3) goto L_0x004a;
    L_0x0038:
        r6 = r8.mDecor;
        r6 = r6.getChildAt(r4);
        r7 = r8.mDecor;
        r7.removeView(r6);
        r0.add(r6);
        r1 = r1 + 1;
        if (r5 == 0) goto L_0x0036;
    L_0x004a:
        r1 = r8.generateLayout();
        r8.mContentParent = r1;
        if (r0 == 0) goto L_0x0069;
    L_0x0052:
        r1 = r0.iterator();
    L_0x0056:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0069;
    L_0x005c:
        r0 = r1.next();
        r0 = (android.view.View) r0;
        r3 = r8.mContentParent;
        r3.addView(r0);
        if (r5 == 0) goto L_0x0056;
    L_0x0069:
        r0 = r8.mDecor;	 Catch:{ IllegalStateException -> 0x0167 }
        r1 = 16908310; // 0x1020016 float:2.387729E-38 double:8.353815E-317;
        r0 = r0.findViewById(r1);	 Catch:{ IllegalStateException -> 0x0167 }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x0167 }
        r8.mTitleView = r0;	 Catch:{ IllegalStateException -> 0x0167 }
        r0 = r8.mTitleView;	 Catch:{ IllegalStateException -> 0x0167 }
        if (r0 == 0) goto L_0x00a1;
    L_0x007a:
        r0 = 1;
        r0 = r8.hasFeature(r0);	 Catch:{ IllegalStateException -> 0x0169 }
        if (r0 == 0) goto L_0x0098;
    L_0x0081:
        r0 = r8.mTitleView;	 Catch:{ IllegalStateException -> 0x016b }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x016b }
        r0 = r8.mContentParent;	 Catch:{ IllegalStateException -> 0x016b }
        r0 = r0 instanceof android.widget.FrameLayout;	 Catch:{ IllegalStateException -> 0x016b }
        if (r0 == 0) goto L_0x0164;
    L_0x008e:
        r0 = r8.mContentParent;	 Catch:{ IllegalStateException -> 0x016d }
        r0 = (android.widget.FrameLayout) r0;	 Catch:{ IllegalStateException -> 0x016d }
        r1 = 0;
        r0.setForeground(r1);	 Catch:{ IllegalStateException -> 0x016d }
        if (r5 == 0) goto L_0x0164;
    L_0x0098:
        r0 = r8.mTitleView;	 Catch:{ IllegalStateException -> 0x016f }
        r1 = r8.mTitle;	 Catch:{ IllegalStateException -> 0x016f }
        r0.setText(r1);	 Catch:{ IllegalStateException -> 0x016f }
        if (r5 == 0) goto L_0x0164;
    L_0x00a1:
        r0 = r8.mDecor;	 Catch:{ IllegalStateException -> 0x0171 }
        r1 = com.actionbarsherlock.R.id.abs__action_bar;	 Catch:{ IllegalStateException -> 0x0171 }
        r0 = r0.findViewById(r1);	 Catch:{ IllegalStateException -> 0x0171 }
        r0 = (com.actionbarsherlock.internal.widget.ActionBarView) r0;	 Catch:{ IllegalStateException -> 0x0171 }
        r8.wActionBar = r0;	 Catch:{ IllegalStateException -> 0x0171 }
        r0 = r8.wActionBar;	 Catch:{ IllegalStateException -> 0x0171 }
        if (r0 == 0) goto L_0x0164;
    L_0x00b1:
        r0 = r8.wActionBar;	 Catch:{ IllegalStateException -> 0x0173 }
        r0.setWindowCallback(r8);	 Catch:{ IllegalStateException -> 0x0173 }
        r0 = r8.wActionBar;	 Catch:{ IllegalStateException -> 0x0173 }
        r0 = r0.getTitle();	 Catch:{ IllegalStateException -> 0x0173 }
        if (r0 != 0) goto L_0x00c9;
    L_0x00be:
        r0 = r8.wActionBar;	 Catch:{ IllegalStateException -> 0x0173 }
        r1 = r8.mActivity;	 Catch:{ IllegalStateException -> 0x0173 }
        r1 = r1.getTitle();	 Catch:{ IllegalStateException -> 0x0173 }
        r0.setWindowTitle(r1);	 Catch:{ IllegalStateException -> 0x0173 }
    L_0x00c9:
        r0 = 2;
        r0 = r8.hasFeature(r0);	 Catch:{ IllegalStateException -> 0x0175 }
        if (r0 == 0) goto L_0x00d5;
    L_0x00d0:
        r0 = r8.wActionBar;	 Catch:{ IllegalStateException -> 0x0175 }
        r0.initProgress();	 Catch:{ IllegalStateException -> 0x0175 }
    L_0x00d5:
        r0 = 5;
        r0 = r8.hasFeature(r0);	 Catch:{ IllegalStateException -> 0x0177 }
        if (r0 == 0) goto L_0x00e1;
    L_0x00dc:
        r0 = r8.wActionBar;	 Catch:{ IllegalStateException -> 0x0177 }
        r0.initIndeterminateProgress();	 Catch:{ IllegalStateException -> 0x0177 }
    L_0x00e1:
        r0 = r8.mActivity;
        r0 = loadUiOptionsFromManifest(r0);
        if (r0 == 0) goto L_0x00eb;
    L_0x00e9:
        r8.mUiOptions = r0;	 Catch:{ IllegalStateException -> 0x0179 }
    L_0x00eb:
        r0 = r8.mUiOptions;	 Catch:{ IllegalStateException -> 0x017b }
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x017d;
    L_0x00f1:
        r3 = r2;
    L_0x00f2:
        if (r3 == 0) goto L_0x00fe;
    L_0x00f4:
        r0 = r8.mActivity;
        r1 = com.actionbarsherlock.R.bool.abs__split_action_bar_is_narrow;
        r0 = com.actionbarsherlock.internal.ResourcesCompat.getResources_getBoolean(r0, r1);
        if (r5 == 0) goto L_0x0184;
    L_0x00fe:
        r0 = r8.mActivity;
        r0 = r0.getTheme();
        r1 = com.actionbarsherlock.R.styleable.SherlockTheme;
        r0 = r0.obtainStyledAttributes(r1);
        r1 = com.actionbarsherlock.R.styleable.SherlockTheme_windowSplitActionBar;
        r0 = r0.getBoolean(r1, r4);
        r2 = r0;
    L_0x0111:
        r0 = r8.mDecor;
        r1 = com.actionbarsherlock.R.id.abs__split_action_bar;
        r0 = r0.findViewById(r1);
        r0 = (com.actionbarsherlock.internal.widget.ActionBarContainer) r0;
        if (r0 == 0) goto L_0x0149;
    L_0x011d:
        r1 = r8.wActionBar;	 Catch:{ IllegalStateException -> 0x0180 }
        r1.setSplitView(r0);	 Catch:{ IllegalStateException -> 0x0180 }
        r1 = r8.wActionBar;	 Catch:{ IllegalStateException -> 0x0180 }
        r1.setSplitActionBar(r2);	 Catch:{ IllegalStateException -> 0x0180 }
        r1 = r8.wActionBar;	 Catch:{ IllegalStateException -> 0x0180 }
        r1.setSplitWhenNarrow(r3);	 Catch:{ IllegalStateException -> 0x0180 }
        r1 = r8.mDecor;	 Catch:{ IllegalStateException -> 0x0180 }
        r4 = com.actionbarsherlock.R.id.abs__action_context_bar;	 Catch:{ IllegalStateException -> 0x0180 }
        r1 = r1.findViewById(r4);	 Catch:{ IllegalStateException -> 0x0180 }
        r1 = (com.actionbarsherlock.internal.widget.ActionBarContextView) r1;	 Catch:{ IllegalStateException -> 0x0180 }
        r8.mActionModeView = r1;	 Catch:{ IllegalStateException -> 0x0180 }
        r1 = r8.mActionModeView;	 Catch:{ IllegalStateException -> 0x0180 }
        r1.setSplitView(r0);	 Catch:{ IllegalStateException -> 0x0180 }
        r0 = r8.mActionModeView;	 Catch:{ IllegalStateException -> 0x0180 }
        r0.setSplitActionBar(r2);	 Catch:{ IllegalStateException -> 0x0180 }
        r0 = r8.mActionModeView;	 Catch:{ IllegalStateException -> 0x0180 }
        r0.setSplitWhenNarrow(r3);	 Catch:{ IllegalStateException -> 0x0180 }
        if (r5 == 0) goto L_0x015a;
    L_0x0149:
        if (r2 == 0) goto L_0x015a;
    L_0x014b:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0182 }
        r1 = 16;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0182 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0182 }
        r2 = 15;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0182 }
        android.util.Log.e(r0, r1);	 Catch:{ IllegalStateException -> 0x0182 }
    L_0x015a:
        r0 = r8.mDecor;
        r1 = new com.actionbarsherlock.internal.ActionBarSherlockCompat$1;
        r1.<init>(r8);
        r0.post(r1);
    L_0x0164:
        return;
    L_0x0165:
        r0 = move-exception;
        throw r0;
    L_0x0167:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0169 }
    L_0x0169:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x016b }
    L_0x016b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x016d }
    L_0x016d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x016f }
    L_0x016f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0171 }
    L_0x0171:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0173 }
    L_0x0173:
        r0 = move-exception;
        throw r0;
    L_0x0175:
        r0 = move-exception;
        throw r0;
    L_0x0177:
        r0 = move-exception;
        throw r0;
    L_0x0179:
        r0 = move-exception;
        throw r0;
    L_0x017b:
        r0 = move-exception;
        throw r0;
    L_0x017d:
        r3 = r4;
        goto L_0x00f2;
    L_0x0180:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0182 }
    L_0x0182:
        r0 = move-exception;
        throw r0;
    L_0x0184:
        r2 = r0;
        goto L_0x0111;
    L_0x0186:
        r0 = r1;
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ActionBarSherlockCompat.installDecor():void");
    }

    private IcsProgressBar getHorizontalProgressBar(boolean z) {
        try {
            if (this.mHorizontalProgressBar != null) {
                return this.mHorizontalProgressBar;
            }
            try {
                if (this.mContentParent == null && z) {
                    installDecor();
                }
                try {
                    this.mHorizontalProgressBar = (IcsProgressBar) this.mDecor.findViewById(R.id.abs__progress_horizontal);
                    if (this.mHorizontalProgressBar != null) {
                        this.mHorizontalProgressBar.setVisibility(4);
                    }
                    return this.mHorizontalProgressBar;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    public void dispatchConfigurationChanged(Configuration configuration) {
        try {
            if (this.aActionBar != null) {
                this.aActionBar.onConfigurationChanged(configuration);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        return true;
    }

    public void setProgressBarIndeterminateVisibility(boolean z) {
        int i;
        if (z) {
            i = -1;
        } else {
            i = -2;
        }
        setFeatureInt(5, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchPrepareOptionsMenu(android.view.Menu r3) {
        /*
        r2_this = this;
        r0 = 0;
        r1 = r2.mActionMode;	 Catch:{ IllegalStateException -> 0x0006 }
        if (r1 == 0) goto L_0x0008;
    L_0x0005:
        return r0;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        r1 = 0;
        r2.mMenuIsPrepared = r1;	 Catch:{ IllegalStateException -> 0x0038 }
        r1 = r2.preparePanel();	 Catch:{ IllegalStateException -> 0x0038 }
        if (r1 == 0) goto L_0x0005;
    L_0x0011:
        r1 = r2.isReservingOverflow();	 Catch:{ IllegalStateException -> 0x003a }
        if (r1 != 0) goto L_0x0005;
    L_0x0017:
        r1 = r2.mNativeItemMap;	 Catch:{ IllegalStateException -> 0x003c }
        if (r1 != 0) goto L_0x0026;
    L_0x001b:
        r1 = new java.util.HashMap;	 Catch:{ IllegalStateException -> 0x003e }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x003e }
        r2.mNativeItemMap = r1;	 Catch:{ IllegalStateException -> 0x003e }
        r1 = com.actionbarsherlock.internal.ResourcesCompat.a;	 Catch:{ IllegalStateException -> 0x003e }
        if (r1 == 0) goto L_0x002b;
    L_0x0026:
        r1 = r2.mNativeItemMap;	 Catch:{ IllegalStateException -> 0x003e }
        r1.clear();	 Catch:{ IllegalStateException -> 0x003e }
    L_0x002b:
        r1 = r2.mMenu;	 Catch:{ IllegalStateException -> 0x0040 }
        if (r1 == 0) goto L_0x0005;
    L_0x002f:
        r0 = r2.mMenu;
        r1 = r2.mNativeItemMap;
        r0 = r0.bindNativeOverflow(r3, r2, r1);
        goto L_0x0005;
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ActionBarSherlockCompat.dispatchPrepareOptionsMenu(android.view.Menu):boolean");
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        checkCloseActionMenu(menuBuilder);
    }

    private IcsProgressBar getCircularProgressBar(boolean z) {
        try {
            if (this.mCircularProgressBar != null) {
                return this.mCircularProgressBar;
            }
            try {
                if (this.mContentParent == null && z) {
                    installDecor();
                }
                try {
                    this.mCircularProgressBar = (IcsProgressBar) this.mDecor.findViewById(R.id.abs__progress_circular);
                    if (this.mCircularProgressBar != null) {
                        this.mCircularProgressBar.setVisibility(4);
                    }
                    return this.mCircularProgressBar;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    public boolean requestFeature(int i) {
        try {
            if (this.mContentParent != null) {
                throw new AndroidRuntimeException(z[0]);
            }
            switch (i) {
                case ay.f /*1*/:
                case ay.n /*2*/:
                case aV.r /*5*/:
                case a8.n /*8*/:
                case a6.D /*9*/:
                case a6.h /*10*/:
                    try {
                        this.mFeatures |= 1 << i;
                        return true;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                default:
                    return false;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static ActionMode access$502(ActionBarSherlockCompat actionBarSherlockCompat, ActionMode actionMode) {
        actionBarSherlockCompat.mActionMode = actionMode;
        return actionMode;
    }

    public ActionBarSherlockCompat(Activity activity, int i) {
        super(activity, i);
        this.mReserveOverflowSet = false;
        this.mIsTitleReady = false;
        this.mIsDestroyed = false;
        this.mFeatures = 0;
        this.mUiOptions = 0;
        this.mTitle = null;
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        try {
            if (this.mContentParent == null) {
                installDecor();
            }
            this.mContentParent.addView(view, layoutParams);
            initActionBar();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static ActionMode access$500(ActionBarSherlockCompat actionBarSherlockCompat) {
        return actionBarSherlockCompat.mActionMode;
    }

    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        return callbackOptionsItemSelected(menuItem);
    }

    public boolean hasFeature(int i) {
        try {
            return (this.mFeatures & (1 << i)) != 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void dispatchDestroy() {
        this.mIsDestroyed = true;
    }

    public void dispatchPostResume() {
        try {
            if (this.aActionBar != null) {
                this.aActionBar.setShowHideAnimationEnabled(true);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private boolean initializePanelMenu() {
        Context contextThemeWrapper;
        Context context = this.mActivity;
        if (this.wActionBar != null) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                contextThemeWrapper = new ContextThemeWrapper(context, i);
                this.mMenu = new MenuBuilder(contextThemeWrapper);
                this.mMenu.setCallback(this);
                return true;
            }
        }
        contextThemeWrapper = context;
        this.mMenu = new MenuBuilder(contextThemeWrapper);
        this.mMenu.setCallback(this);
        return true;
    }
}
