package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.util.SimpleArrayMap;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
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

public class FragmentActivity extends Activity {
    public static boolean a;
    private static final String[] z;
    SimpleArrayMap mAllLoaderManagers;
    boolean mCheckedForLoaderManager;
    final FragmentContainer mContainer;
    boolean mCreated;
    final FragmentManagerImpl mFragments;
    final Handler mHandler;
    LoaderManagerImpl mLoaderManager;
    boolean mLoadersStarted;
    boolean mOptionsMenuInvalidated;
    boolean mReallyStopped;
    boolean mResumed;
    boolean mRetaining;
    boolean mStopped;

    final class NonConfigurationInstances {
        Object activity;
        SimpleArrayMap children;
        Object custom;
        ArrayList fragments;
        SimpleArrayMap loaders;

        NonConfigurationInstances() {
        }
    }

    static {
        String[] strArr = new String[28];
        String str = "H\u000fB%X@\u0005\u001c$BY\u0011I%C\u0013\u0007T6PD\u0004H#D";
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
                        i3 = 41;
                        break;
                    case ay.f /*1*/:
                        i3 = 97;
                        break;
                    case ay.n /*2*/:
                        i3 = 38;
                        break;
                    case ay.p /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 55;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "H\u000fB%X@\u0005\u001c$BY\u0011I%C\u0013\u0007T6PD\u0004H#D";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0001\u0013I8C\u0000";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0001\u0013I8C\u0000";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\tA";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "G\u0014J;";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "o\u0013G0ZL\u000fR\u0016T]\bP>CP";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "h\u0002R>A@\u0015_wEL\u0012S;C\t\u0007T6PD\u0004H#\u0017@\u000fB2O\t\u000eS#\u0017F\u0007\u0006%VG\u0006Cm\u0017\u0019\u0019";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "h\u0002R>A@\u0015_wEL\u0012S;C\t\u000fIwQ[\u0000A:RG\u0015\u00062O@\u0012R$\u0017O\u000eTw^G\u0005C/\r\tQ^";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "o\u0013G0ZL\u000fR\u0016T]\bP>CP";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\t\fu#XY\u0011C3\n";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "D\"T2V]\u0004Bj";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\tA";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\t\ft2VE\r_\u0004CF\u0011V2S\u0014";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "D-I6SL\u0013U\u0004CH\u0013R2S\u0014";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\tA";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u007f\bC \u0017a\bC%V[\u0002N.\r";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\tA";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "e\u000eE6[\t'T6PD\u0004H#vJ\u0015O!^]\u0018\u0006";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "D3C$BD\u0004Bj";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "e\u000eG3R[Ak6YH\u0006C%\u0017";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\t2R6CL[";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "j\u0000HwXG\r_wBZ\u0004\u0006;X^\u0004Tw\u0006\u001fAD>CZA@8E\t\u0013C&BL\u0012R\u0014XM\u0004";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "H\u000fB%X@\u0005";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\tB";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "H\u0011V";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "O\u0013G0ZL\u000fR";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "j\u0000HwXG\r_wBZ\u0004\u0006;X^\u0004Tw\u0006\u001fAD>CZA@8E\t\u0013C&BL\u0012R\u0014XM\u0004";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void dumpViewHierarchy(String str, PrintWriter printWriter, View view) {
        boolean z = a;
        try {
            printWriter.print(str);
            if (view == null) {
                printWriter.println(z[6]);
                return;
            }
            try {
                printWriter.println(viewToString(view));
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    if (childCount > 0) {
                        String str2 = str + z[5];
                        int i = 0;
                        while (i < childCount) {
                            dumpViewHierarchy(str2, printWriter, viewGroup.getChildAt(i));
                            i++;
                            if (z) {
                                return;
                            }
                        }
                    }
                }
            } catch (NotFoundException e) {
                throw e;
            }
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        if (VERSION.SDK_INT >= 11) {
            printWriter.print(str);
            printWriter.print(z[19]);
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(z[22]);
            str2 = str + z[18];
        } else {
            printWriter.print(str);
            printWriter.print(z[19]);
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(z[22]);
            str2 = str + z[18];
        }
        try {
            printWriter.print(str2);
            printWriter.print(z[12]);
            printWriter.print(this.mCreated);
            printWriter.print(z[20]);
            printWriter.print(this.mResumed);
            printWriter.print(z[11]);
            printWriter.print(this.mStopped);
            printWriter.print(z[14]);
            printWriter.println(this.mReallyStopped);
            printWriter.print(str2);
            printWriter.print(z[15]);
            printWriter.println(this.mLoadersStarted);
            if (this.mLoaderManager != null) {
                printWriter.print(str);
                printWriter.print(z[21]);
                printWriter.print(Integer.toHexString(System.identityHashCode(this.mLoaderManager)));
                printWriter.println(":");
                this.mLoaderManager.dump(str + z[13], fileDescriptor, printWriter, strArr);
            }
            this.mFragments.dump(str, fileDescriptor, printWriter, strArr);
            printWriter.print(str);
            printWriter.println(z[17]);
            dumpViewHierarchy(str + z[16], printWriter, getWindow().getDecorView());
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable saveAllState = this.mFragments.saveAllState();
        if (saveAllState != null) {
            try {
                bundle.putParcelable(z[2], saveAllState);
            } catch (NotFoundException e) {
                throw e;
            }
        }
    }

    protected void onDestroy() {
        try {
            super.onDestroy();
            doReallyStop(false);
            this.mFragments.dispatchDestroy();
            if (this.mLoaderManager != null) {
                this.mLoaderManager.doDestroy();
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        try {
            if (super.onMenuItemSelected(i, menuItem)) {
                return true;
            }
            switch (i) {
                case PBE.MD5 /*0*/:
                    try {
                        return this.mFragments.dispatchOptionsItemSelected(menuItem);
                    } catch (NotFoundException e) {
                        throw e;
                    }
                case aV.i /*6*/:
                    return this.mFragments.dispatchContextItemSelected(menuItem);
                default:
                    return false;
            }
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onStart() {
        /*
        r6_this = this;
        r5 = 1;
        r1 = 0;
        r3 = a;
        super.onStart();	 Catch:{ NotFoundException -> 0x0092 }
        r0 = 0;
        r6.mStopped = r0;	 Catch:{ NotFoundException -> 0x0092 }
        r0 = 0;
        r6.mReallyStopped = r0;	 Catch:{ NotFoundException -> 0x0092 }
        r0 = r6.mHandler;	 Catch:{ NotFoundException -> 0x0092 }
        r2 = 1;
        r0.removeMessages(r2);	 Catch:{ NotFoundException -> 0x0092 }
        r0 = r6.mCreated;	 Catch:{ NotFoundException -> 0x0092 }
        if (r0 != 0) goto L_0x001f;
    L_0x0017:
        r0 = 1;
        r6.mCreated = r0;	 Catch:{ NotFoundException -> 0x0092 }
        r0 = r6.mFragments;	 Catch:{ NotFoundException -> 0x0092 }
        r0.dispatchActivityCreated();	 Catch:{ NotFoundException -> 0x0092 }
    L_0x001f:
        r0 = r6.mFragments;	 Catch:{ NotFoundException -> 0x0094 }
        r0.noteStateNotSaved();	 Catch:{ NotFoundException -> 0x0094 }
        r0 = r6.mFragments;	 Catch:{ NotFoundException -> 0x0094 }
        r0.execPendingActions();	 Catch:{ NotFoundException -> 0x0094 }
        r0 = r6.mLoadersStarted;	 Catch:{ NotFoundException -> 0x0094 }
        if (r0 != 0) goto L_0x005e;
    L_0x002d:
        r0 = 1;
        r6.mLoadersStarted = r0;	 Catch:{ NotFoundException -> 0x0096 }
        r0 = r6.mLoaderManager;	 Catch:{ NotFoundException -> 0x0096 }
        if (r0 == 0) goto L_0x003b;
    L_0x0034:
        r0 = r6.mLoaderManager;	 Catch:{ NotFoundException -> 0x0098 }
        r0.doStart();	 Catch:{ NotFoundException -> 0x0098 }
        if (r3 == 0) goto L_0x005c;
    L_0x003b:
        r0 = r6.mCheckedForLoaderManager;	 Catch:{ NotFoundException -> 0x009a }
        if (r0 != 0) goto L_0x005c;
    L_0x003f:
        r0 = z;	 Catch:{ NotFoundException -> 0x009c }
        r2 = 4;
        r0 = r0[r2];	 Catch:{ NotFoundException -> 0x009c }
        r2 = r6.mLoadersStarted;	 Catch:{ NotFoundException -> 0x009c }
        r4 = 0;
        r0 = r6.getLoaderManager(r0, r2, r4);	 Catch:{ NotFoundException -> 0x009c }
        r6.mLoaderManager = r0;	 Catch:{ NotFoundException -> 0x009c }
        r0 = r6.mLoaderManager;	 Catch:{ NotFoundException -> 0x009c }
        if (r0 == 0) goto L_0x005c;
    L_0x0051:
        r0 = r6.mLoaderManager;	 Catch:{ NotFoundException -> 0x009e }
        r0 = r0.mStarted;	 Catch:{ NotFoundException -> 0x009e }
        if (r0 != 0) goto L_0x005c;
    L_0x0057:
        r0 = r6.mLoaderManager;	 Catch:{ NotFoundException -> 0x009e }
        r0.doStart();	 Catch:{ NotFoundException -> 0x009e }
    L_0x005c:
        r6.mCheckedForLoaderManager = r5;
    L_0x005e:
        r0 = r6.mFragments;
        r0.dispatchStart();
        r0 = r6.mAllLoaderManagers;
        if (r0 == 0) goto L_0x0091;
    L_0x0067:
        r0 = r6.mAllLoaderManagers;
        r4 = r0.size();
        r5 = new android.support.v4.app.LoaderManagerImpl[r4];
        r0 = r4 + -1;
        r2 = r0;
    L_0x0072:
        if (r2 < 0) goto L_0x0082;
    L_0x0074:
        r0 = r6.mAllLoaderManagers;
        r0 = r0.valueAt(r2);
        r0 = (android.support.v4.app.LoaderManagerImpl) r0;
        r5[r2] = r0;
        r0 = r2 + -1;
        if (r3 == 0) goto L_0x00a0;
    L_0x0082:
        r0 = r1;
    L_0x0083:
        if (r0 >= r4) goto L_0x0091;
    L_0x0085:
        r1 = r5[r0];
        r1.finishRetain();
        r1.doReportStart();
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0083;
    L_0x0091:
        return;
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0098 }
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x009e }
    L_0x009e:
        r0 = move-exception;
        throw r0;
    L_0x00a0:
        r2 = r0;
        goto L_0x0072;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentActivity.onStart():void");
    }

    protected void onPostResume() {
        super.onPostResume();
        this.mHandler.removeMessages(2);
        onResumeFragments();
        this.mFragments.execPendingActions();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
        r5_this = this;
        r0 = r5.mFragments;
        r0.noteStateNotSaved();
        r0 = r6 >> 16;
        if (r0 == 0) goto L_0x0085;
    L_0x0009:
        r0 = r0 + -1;
        r1 = r5.mFragments;	 Catch:{ NotFoundException -> 0x0042 }
        r1 = r1.mActive;	 Catch:{ NotFoundException -> 0x0042 }
        if (r1 == 0) goto L_0x001d;
    L_0x0011:
        if (r0 < 0) goto L_0x001d;
    L_0x0013:
        r1 = r5.mFragments;	 Catch:{ NotFoundException -> 0x0046 }
        r1 = r1.mActive;	 Catch:{ NotFoundException -> 0x0046 }
        r1 = r1.size();	 Catch:{ NotFoundException -> 0x0046 }
        if (r0 < r1) goto L_0x0048;
    L_0x001d:
        r0 = z;	 Catch:{ NotFoundException -> 0x0046 }
        r1 = 10;
        r0 = r0[r1];	 Catch:{ NotFoundException -> 0x0046 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x0046 }
        r1.<init>();	 Catch:{ NotFoundException -> 0x0046 }
        r2 = z;	 Catch:{ NotFoundException -> 0x0046 }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ NotFoundException -> 0x0046 }
        r1 = r1.append(r2);	 Catch:{ NotFoundException -> 0x0046 }
        r2 = java.lang.Integer.toHexString(r6);	 Catch:{ NotFoundException -> 0x0046 }
        r1 = r1.append(r2);	 Catch:{ NotFoundException -> 0x0046 }
        r1 = r1.toString();	 Catch:{ NotFoundException -> 0x0046 }
        android.util.Log.w(r0, r1);	 Catch:{ NotFoundException -> 0x0046 }
    L_0x0041:
        return;
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r1 = r5.mFragments;
        r1 = r1.mActive;
        r0 = r1.get(r0);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r0 != 0) goto L_0x007b;
    L_0x0054:
        r1 = z;	 Catch:{ NotFoundException -> 0x0083 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ NotFoundException -> 0x0083 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x0083 }
        r2.<init>();	 Catch:{ NotFoundException -> 0x0083 }
        r3 = z;	 Catch:{ NotFoundException -> 0x0083 }
        r4 = 9;
        r3 = r3[r4];	 Catch:{ NotFoundException -> 0x0083 }
        r2 = r2.append(r3);	 Catch:{ NotFoundException -> 0x0083 }
        r3 = java.lang.Integer.toHexString(r6);	 Catch:{ NotFoundException -> 0x0083 }
        r2 = r2.append(r3);	 Catch:{ NotFoundException -> 0x0083 }
        r2 = r2.toString();	 Catch:{ NotFoundException -> 0x0083 }
        android.util.Log.w(r1, r2);	 Catch:{ NotFoundException -> 0x0083 }
        r1 = a;	 Catch:{ NotFoundException -> 0x0083 }
        if (r1 == 0) goto L_0x0041;
    L_0x007b:
        r1 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r1 = r1 & r6;
        r0.onActivityResult(r1, r7, r8);	 Catch:{ NotFoundException -> 0x0083 }
        goto L_0x0041;
    L_0x0083:
        r0 = move-exception;
        throw r0;
    L_0x0085:
        super.onActivityResult(r6, r7, r8);
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    protected void onResumeFragments() {
        this.mFragments.dispatchResume();
    }

    void doReallyStop(boolean z) {
        try {
            if (!this.mReallyStopped) {
                this.mReallyStopped = true;
                this.mRetaining = z;
                this.mHandler.removeMessages(1);
                onReallyStop();
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    protected void onPause() {
        try {
            super.onPause();
            this.mResumed = false;
            if (this.mHandler.hasMessages(2)) {
                this.mHandler.removeMessages(2);
                onResumeFragments();
            }
            this.mFragments.dispatchPause();
        } catch (NotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void onReallyStop() {
        /*
        r1_this = this;
        r0 = r1.mLoadersStarted;	 Catch:{ NotFoundException -> 0x0023 }
        if (r0 == 0) goto L_0x001d;
    L_0x0004:
        r0 = 0;
        r1.mLoadersStarted = r0;	 Catch:{ NotFoundException -> 0x0025 }
        r0 = r1.mLoaderManager;	 Catch:{ NotFoundException -> 0x0025 }
        if (r0 == 0) goto L_0x001d;
    L_0x000b:
        r0 = r1.mRetaining;	 Catch:{ NotFoundException -> 0x0027 }
        if (r0 != 0) goto L_0x0018;
    L_0x000f:
        r0 = r1.mLoaderManager;	 Catch:{ NotFoundException -> 0x0029 }
        r0.doStop();	 Catch:{ NotFoundException -> 0x0029 }
        r0 = a;	 Catch:{ NotFoundException -> 0x0029 }
        if (r0 == 0) goto L_0x001d;
    L_0x0018:
        r0 = r1.mLoaderManager;	 Catch:{ NotFoundException -> 0x0029 }
        r0.doRetain();	 Catch:{ NotFoundException -> 0x0029 }
    L_0x001d:
        r0 = r1.mFragments;
        r0.dispatchReallyStop();
        return;
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentActivity.onReallyStop():void");
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        if (i == -1) {
            try {
                super.startActivityForResult(intent, -1);
            } catch (NotFoundException e) {
                throw e;
            }
        } else if ((-65536 & i) != 0) {
            try {
                throw new IllegalArgumentException(z[1]);
            } catch (NotFoundException e2) {
                throw e2;
            }
        } else {
            super.startActivityForResult(intent, ((fragment.mIndex + 1) << 16) + (65535 & i));
        }
    }

    public LoaderManager getSupportLoaderManager() {
        try {
            if (this.mLoaderManager != null) {
                return this.mLoaderManager;
            }
            this.mCheckedForLoaderManager = true;
            this.mLoaderManager = getLoaderManager(z[3], this.mLoadersStarted, true);
            return this.mLoaderManager;
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        int i = 0;
        boolean z = a;
        try {
            if (this.mStopped) {
                doReallyStop(true);
            }
            Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
            ArrayList retainNonConfig = this.mFragments.retainNonConfig();
            int i2;
            if (this.mAllLoaderManagers != null) {
                int size = this.mAllLoaderManagers.size();
                LoaderManagerImpl[] loaderManagerImplArr = new LoaderManagerImpl[size];
                int i3 = size - 1;
                while (i3 >= 0) {
                    loaderManagerImplArr[i3] = (LoaderManagerImpl) this.mAllLoaderManagers.valueAt(i3);
                    i2 = i3 - 1;
                    if (z) {
                        break;
                    }
                    i3 = i2;
                }
                i2 = 0;
                while (i < size) {
                    LoaderManagerImpl loaderManagerImpl = loaderManagerImplArr[i];
                    if (loaderManagerImpl.mRetaining) {
                        if (!z) {
                            i2 = 1;
                            i++;
                            if (z) {
                                break;
                            }
                        }
                        i2 = 1;
                    }
                    try {
                        loaderManagerImpl.doDestroy();
                        this.mAllLoaderManagers.remove(loaderManagerImpl.mWho);
                    } catch (NotFoundException e) {
                        throw e;
                    }
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
            i2 = 0;
            if (retainNonConfig == null && r0 == 0 && onRetainCustomNonConfigurationInstance == null) {
                return null;
            }
            Object nonConfigurationInstances = new NonConfigurationInstances();
            nonConfigurationInstances.activity = null;
            nonConfigurationInstances.custom = onRetainCustomNonConfigurationInstance;
            nonConfigurationInstances.children = null;
            nonConfigurationInstances.fragments = retainNonConfig;
            nonConfigurationInstances.loaders = this.mAllLoaderManagers;
            return nonConfigurationInstances;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String viewToString(android.view.View r8) {
        /*
        r2 = 86;
        r1 = 70;
        r7 = 44;
        r6 = 32;
        r0 = 46;
        r4 = a;
        r5 = new java.lang.StringBuilder;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r5.<init>(r3);
        r3 = r8.getClass();	 Catch:{ NotFoundException -> 0x0140 }
        r3 = r3.getName();	 Catch:{ NotFoundException -> 0x0140 }
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0140 }
        r3 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0140 }
        r3 = java.lang.System.identityHashCode(r8);	 Catch:{ NotFoundException -> 0x0140 }
        r3 = java.lang.Integer.toHexString(r3);	 Catch:{ NotFoundException -> 0x0140 }
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0140 }
        r3 = 32;
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0140 }
        r3 = r8.getVisibility();	 Catch:{ NotFoundException -> 0x0140 }
        switch(r3) {
            case 0: goto L_0x0129;
            case 4: goto L_0x0130;
            case 8: goto L_0x0137;
            default: goto L_0x003a;
        };
    L_0x003a:
        r3 = 46;
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0146 }
    L_0x003f:
        r3 = r8.isFocusable();	 Catch:{ NotFoundException -> 0x0148 }
        if (r3 == 0) goto L_0x014a;
    L_0x0045:
        r3 = r1;
    L_0x0046:
        r5.append(r3);	 Catch:{ NotFoundException -> 0x014d }
        r3 = r8.isEnabled();	 Catch:{ NotFoundException -> 0x014d }
        if (r3 == 0) goto L_0x014f;
    L_0x004f:
        r3 = 69;
    L_0x0051:
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0152 }
        r3 = r8.willNotDraw();	 Catch:{ NotFoundException -> 0x0152 }
        if (r3 == 0) goto L_0x0154;
    L_0x005a:
        r3 = r0;
    L_0x005b:
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0158 }
        r3 = r8.isHorizontalScrollBarEnabled();	 Catch:{ NotFoundException -> 0x0158 }
        if (r3 == 0) goto L_0x015a;
    L_0x0064:
        r3 = 72;
    L_0x0066:
        r5.append(r3);	 Catch:{ NotFoundException -> 0x015d }
        r3 = r8.isVerticalScrollBarEnabled();	 Catch:{ NotFoundException -> 0x015d }
        if (r3 == 0) goto L_0x015f;
    L_0x006f:
        r5.append(r2);	 Catch:{ NotFoundException -> 0x0162 }
        r2 = r8.isClickable();	 Catch:{ NotFoundException -> 0x0162 }
        if (r2 == 0) goto L_0x0164;
    L_0x0078:
        r2 = 67;
    L_0x007a:
        r5.append(r2);	 Catch:{ NotFoundException -> 0x0167 }
        r2 = r8.isLongClickable();	 Catch:{ NotFoundException -> 0x0167 }
        if (r2 == 0) goto L_0x0169;
    L_0x0083:
        r2 = 76;
    L_0x0085:
        r5.append(r2);	 Catch:{ NotFoundException -> 0x016c }
        r2 = 32;
        r5.append(r2);	 Catch:{ NotFoundException -> 0x016c }
        r2 = r8.isFocused();	 Catch:{ NotFoundException -> 0x016c }
        if (r2 == 0) goto L_0x016e;
    L_0x0093:
        r5.append(r1);	 Catch:{ NotFoundException -> 0x0171 }
        r1 = r8.isSelected();	 Catch:{ NotFoundException -> 0x0171 }
        if (r1 == 0) goto L_0x0173;
    L_0x009c:
        r1 = 83;
    L_0x009e:
        r5.append(r1);	 Catch:{ NotFoundException -> 0x0176 }
        r1 = r8.isPressed();	 Catch:{ NotFoundException -> 0x0176 }
        if (r1 == 0) goto L_0x00a9;
    L_0x00a7:
        r0 = 80;
    L_0x00a9:
        r5.append(r0);
        r5.append(r6);
        r0 = r8.getLeft();
        r5.append(r0);
        r5.append(r7);
        r0 = r8.getTop();
        r5.append(r0);
        r0 = 45;
        r5.append(r0);
        r0 = r8.getRight();
        r5.append(r0);
        r5.append(r7);
        r0 = r8.getBottom();
        r5.append(r0);
        r1 = r8.getId();
        r0 = -1;
        if (r1 == r0) goto L_0x011f;
    L_0x00dd:
        r0 = z;
        r2 = 25;
        r0 = r0[r2];
        r5.append(r0);
        r0 = java.lang.Integer.toHexString(r1);
        r5.append(r0);
        r2 = r8.getResources();
        if (r1 == 0) goto L_0x011f;
    L_0x00f3:
        if (r2 == 0) goto L_0x011f;
    L_0x00f5:
        r0 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0 = r0 & r1;
        switch(r0) {
            case 16777216: goto L_0x0180;
            case 2130706432: goto L_0x0178;
            default: goto L_0x00fb;
        };
    L_0x00fb:
        r0 = r2.getResourcePackageName(r1);	 Catch:{ NotFoundException -> 0x018a }
    L_0x00ff:
        r3 = r2.getResourceTypeName(r1);	 Catch:{ NotFoundException -> 0x018a }
        r1 = r2.getResourceEntryName(r1);	 Catch:{ NotFoundException -> 0x018a }
        r2 = " ";
        r5.append(r2);	 Catch:{ NotFoundException -> 0x018a }
        r5.append(r0);	 Catch:{ NotFoundException -> 0x018a }
        r0 = ":";
        r5.append(r0);	 Catch:{ NotFoundException -> 0x018a }
        r5.append(r3);	 Catch:{ NotFoundException -> 0x018a }
        r0 = "/";
        r5.append(r0);	 Catch:{ NotFoundException -> 0x018a }
        r5.append(r1);	 Catch:{ NotFoundException -> 0x018a }
    L_0x011f:
        r0 = "}";
        r5.append(r0);
        r0 = r5.toString();
        return r0;
    L_0x0129:
        r3 = 86;
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0140 }
        if (r4 == 0) goto L_0x003f;
    L_0x0130:
        r3 = 73;
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0142 }
        if (r4 == 0) goto L_0x003f;
    L_0x0137:
        r3 = 71;
        r5.append(r3);	 Catch:{ NotFoundException -> 0x0144 }
        if (r4 == 0) goto L_0x003f;
    L_0x013e:
        goto L_0x003a;
    L_0x0140:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0142 }
    L_0x0142:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0144 }
    L_0x0144:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0146 }
    L_0x0146:
        r0 = move-exception;
        throw r0;
    L_0x0148:
        r0 = move-exception;
        throw r0;
    L_0x014a:
        r3 = r0;
        goto L_0x0046;
    L_0x014d:
        r0 = move-exception;
        throw r0;
    L_0x014f:
        r3 = r0;
        goto L_0x0051;
    L_0x0152:
        r0 = move-exception;
        throw r0;
    L_0x0154:
        r3 = 68;
        goto L_0x005b;
    L_0x0158:
        r0 = move-exception;
        throw r0;
    L_0x015a:
        r3 = r0;
        goto L_0x0066;
    L_0x015d:
        r0 = move-exception;
        throw r0;
    L_0x015f:
        r2 = r0;
        goto L_0x006f;
    L_0x0162:
        r0 = move-exception;
        throw r0;
    L_0x0164:
        r2 = r0;
        goto L_0x007a;
    L_0x0167:
        r0 = move-exception;
        throw r0;
    L_0x0169:
        r2 = r0;
        goto L_0x0085;
    L_0x016c:
        r0 = move-exception;
        throw r0;
    L_0x016e:
        r1 = r0;
        goto L_0x0093;
    L_0x0171:
        r0 = move-exception;
        throw r0;
    L_0x0173:
        r1 = r0;
        goto L_0x009e;
    L_0x0176:
        r0 = move-exception;
        throw r0;
    L_0x0178:
        r0 = z;	 Catch:{ NotFoundException -> 0x018a }
        r3 = 26;
        r0 = r0[r3];	 Catch:{ NotFoundException -> 0x018a }
        if (r4 == 0) goto L_0x00ff;
    L_0x0180:
        r0 = z;	 Catch:{ NotFoundException -> 0x018a }
        r3 = 24;
        r0 = r0[r3];	 Catch:{ NotFoundException -> 0x018a }
        if (r4 == 0) goto L_0x00ff;
    L_0x0188:
        goto L_0x00fb;
    L_0x018a:
        r0 = move-exception;
        goto L_0x011f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentActivity.viewToString(android.view.View):java.lang.String");
    }

    protected void onResume() {
        super.onResume();
        this.mHandler.sendEmptyMessage(2);
        this.mResumed = true;
        this.mFragments.execPendingActions();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        try {
            return VERSION.SDK_INT >= 11 ? super.onCreatePanelMenu(i, menu) | this.mFragments.dispatchCreateOptionsMenu(menu, getMenuInflater()) : true;
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.dispatchLowMemory();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (i == -1 || (-65536 & i) == 0) {
            super.startActivityForResult(intent, i);
            return;
        }
        try {
            throw new IllegalArgumentException(z[23]);
        } catch (NotFoundException e) {
            throw e;
        }
    }

    void invalidateSupportFragment(String str) {
        if (this.mAllLoaderManagers != null) {
            LoaderManagerImpl loaderManagerImpl = (LoaderManagerImpl) this.mAllLoaderManagers.get(str);
            if (loaderManagerImpl != null) {
                try {
                    if (!loaderManagerImpl.mRetaining) {
                        loaderManagerImpl.doDestroy();
                        this.mAllLoaderManagers.remove(str);
                    }
                } catch (NotFoundException e) {
                    throw e;
                }
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.dispatchConfigurationChanged(configuration);
    }

    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case PBE.MD5 /*0*/:
                try {
                    this.mFragments.dispatchOptionsMenuClosed(menu);
                    break;
                } catch (NotFoundException e) {
                    throw e;
                }
        }
        super.onPanelClosed(i, menu);
    }

    public FragmentActivity() {
        this.mHandler = new Handler() {
            final FragmentActivity this$0;

            public void handleMessage(Message message) {
                boolean z = a;
                switch (message.what) {
                    case ay.f /*1*/:
                        if (this.this$0.mStopped) {
                            this.this$0.doReallyStop(false);
                            if (!z) {
                                return;
                            }
                        }
                        return;
                        break;
                    case ay.n /*2*/:
                        break;
                }
                this.this$0.onResumeFragments();
                this.this$0.mFragments.execPendingActions();
                if (z) {
                    super.handleMessage(message);
                }
            }

            {
                this.this$0 = r1;
            }
        };
        this.mFragments = new FragmentManagerImpl();
        this.mContainer = new FragmentContainer() {
            final FragmentActivity this$0;

            {
                this.this$0 = r1;
            }

            public View findViewById(int i) {
                return this.this$0.findViewById(i);
            }

            public boolean hasView() {
                Window window = this.this$0.getWindow();
                return (window == null || window.peekDecorView() == null) ? false : true;
            }
        };
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r3, android.view.KeyEvent r4) {
        /*
        r2_this = this;
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NotFoundException -> 0x0013 }
        r1 = 5;
        if (r0 >= r1) goto L_0x0019;
    L_0x0005:
        r0 = 4;
        if (r3 != r0) goto L_0x0019;
    L_0x0008:
        r0 = r4.getRepeatCount();	 Catch:{ NotFoundException -> 0x0017 }
        if (r0 != 0) goto L_0x0019;
    L_0x000e:
        r2.onBackPressed();	 Catch:{ NotFoundException -> 0x0017 }
        r0 = 1;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r0 = super.onKeyDown(r3, r4);
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.finishAfterTransition(this);
    }

    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        this.mHandler.sendEmptyMessage(1);
        this.mFragments.dispatchStop();
    }

    protected void onCreate(Bundle bundle) {
        try {
            this.mFragments.attachActivity(this, this.mContainer, null);
            if (getLayoutInflater().getFactory() == null) {
                getLayoutInflater().setFactory(this);
            }
            super.onCreate(bundle);
            NonConfigurationInstances nonConfigurationInstances = (NonConfigurationInstances) getLastNonConfigurationInstance();
            if (nonConfigurationInstances != null) {
                try {
                    this.mAllLoaderManagers = nonConfigurationInstances.loaders;
                } catch (NotFoundException e) {
                    throw e;
                }
            }
            if (bundle != null) {
                Parcelable parcelable = bundle.getParcelable(z[0]);
                try {
                    ArrayList arrayList;
                    FragmentManagerImpl fragmentManagerImpl = this.mFragments;
                    if (nonConfigurationInstances != null) {
                        arrayList = nonConfigurationInstances.fragments;
                    } else {
                        arrayList = null;
                    }
                    fragmentManagerImpl.restoreAllState(parcelable, arrayList);
                } catch (NotFoundException e2) {
                    throw e2;
                }
            }
            this.mFragments.dispatchCreate();
        } catch (NotFoundException e22) {
            throw e22;
        }
    }

    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void supportInvalidateOptionsMenu() {
        try {
            if (VERSION.SDK_INT >= 11) {
                ActivityCompatHoneycomb.invalidateOptionsMenu(this);
            } else {
                this.mOptionsMenuInvalidated = true;
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public View onCreateView(String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        try {
            View onCreateView;
            if (z[27].equals(str)) {
                onCreateView = this.mFragments.onCreateView(str, context, attributeSet);
                if (onCreateView == null) {
                    try {
                        onCreateView = super.onCreateView(str, context, attributeSet);
                    } catch (NotFoundException e) {
                        throw e;
                    }
                }
            }
            onCreateView = super.onCreateView(str, context, attributeSet);
            return onCreateView;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.noteStateNotSaved();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    android.support.v4.app.LoaderManagerImpl getLoaderManager(java.lang.String r3, boolean r4, boolean r5) {
        /*
        r2_this = this;
        r0 = r2.mAllLoaderManagers;	 Catch:{ NotFoundException -> 0x0029 }
        if (r0 != 0) goto L_0x000b;
    L_0x0004:
        r0 = new android.support.v4.util.SimpleArrayMap;	 Catch:{ NotFoundException -> 0x0029 }
        r0.<init>();	 Catch:{ NotFoundException -> 0x0029 }
        r2.mAllLoaderManagers = r0;	 Catch:{ NotFoundException -> 0x0029 }
    L_0x000b:
        r0 = r2.mAllLoaderManagers;
        r0 = r0.get(r3);
        r0 = (android.support.v4.app.LoaderManagerImpl) r0;
        if (r0 != 0) goto L_0x0025;
    L_0x0015:
        if (r5 == 0) goto L_0x0028;
    L_0x0017:
        r0 = new android.support.v4.app.LoaderManagerImpl;
        r0.<init>(r3, r2, r4);
        r1 = r2.mAllLoaderManagers;	 Catch:{ NotFoundException -> 0x002b }
        r1.put(r3, r0);	 Catch:{ NotFoundException -> 0x002b }
        r1 = a;	 Catch:{ NotFoundException -> 0x002b }
        if (r1 == 0) goto L_0x0028;
    L_0x0025:
        r0.updateActivity(r2);	 Catch:{ NotFoundException -> 0x002b }
    L_0x0028:
        return r0;
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentActivity.getLoaderManager(java.lang.String, boolean, boolean):android.support.v4.app.LoaderManagerImpl");
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        try {
            if (this.mOptionsMenuInvalidated) {
                this.mOptionsMenuInvalidated = false;
                menu.clear();
                onCreatePanelMenu(i, menu);
            }
            return onPrepareOptionsPanel(view, menu) | this.mFragments.dispatchPrepareOptionsMenu(menu);
        } catch (NotFoundException e) {
            throw e;
        }
    }

    public void onBackPressed() {
        try {
            if (!this.mFragments.popBackStackImmediate()) {
                supportFinishAfterTransition();
            }
        } catch (NotFoundException e) {
            throw e;
        }
    }
}
