package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.support.v4.content.Loader.OnLoadCompleteListener;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import com.whatsapp.vk;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class LoaderManagerImpl extends LoaderManager {
    static boolean DEBUG;
    private static final String[] z;
    FragmentActivity mActivity;
    boolean mCreatingLoader;
    final SparseArrayCompat mInactiveLoaders;
    final SparseArrayCompat mLoaders;
    boolean mRetaining;
    boolean mStarted;
    final String mWho;

    final class LoaderInfo implements OnLoadCompleteListener {
        private static final String[] z;
        final Bundle mArgs;
        LoaderCallbacks mCallbacks;
        Object mData;
        boolean mDeliveredData;
        boolean mDestroyed;
        boolean mHaveData;
        final int mId;
        boolean mListenerRegistered;
        Loader mLoader;
        LoaderInfo mPendingLoader;
        boolean mReportNextStart;
        boolean mRetaining;
        boolean mRetainingStarted;
        boolean mStarted;
        final LoaderManagerImpl this$0;

        static {
            String[] strArr = new String[46];
            String str = "B<m7PI\u0011N5AA7U=\u000b\r";
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
                            i3 = 45;
                            break;
                        case ay.f /*1*/:
                            i3 = 82;
                            break;
                        case ay.n /*2*/:
                            i3 = 33;
                            break;
                        case ay.p /*3*/:
                            i3 = 88;
                            break;
                        default:
                            i3 = 49;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "\rrr/XY1I1_JrU7\u0011]7O<XC5\u00014^L6D*\u000b\r";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "a=@<T_\u001f@6PJ7S";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "\rrh?_B H6V\r>N9U\r1N5AA7U=\u0011\u0000\u007f\u00016^Yr@;ED$D";
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        str = "a=@<T_\u001f@6PJ7S";
                        obj = 4;
                        strArr2 = strArr3;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "a=@<T_\u001f@6PJ7S";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case aV.r /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "a=@<T_\u001f@6PJ7S";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case aV.i /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "\u0017r";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case a8.s /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "a=@<T_\u001f@6PJ7S";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case a8.n /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "\rrN6}B3E\u001eXC;R0TIrH6\u0011";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case a6.D /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "B<m7PI\u0014H6X^:D<";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case a6.h /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "@\u0011@4]O3B3B\u0010";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case a6.e /*11*/:
                        strArr2[i] = str;
                        i = 13;
                        str = "@\u0001U9CY7Ee";
                        obj = 12;
                        strArr2 = strArr3;
                        break;
                    case a6.s /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        str = "\r?e=BY N!TIo";
                        obj = 13;
                        strArr2 = strArr3;
                        break;
                    case a6.z /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = "\r?s=EL;O1_J\u0001U9CY7Ee";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                        strArr2[i] = str;
                        i = 16;
                        str = "\rrL\u001cTA;W=CH6e9ELo";
                        obj = 15;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeBackground /*15*/:
                        strArr2[i] = str;
                        i = 17;
                        str = "\r?`*V^o";
                        obj = 16;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                        strArr2[i] = str;
                        i = 18;
                        str = "@\u001a@.Ti3U9\f";
                        obj = 17;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                        strArr2[i] = str;
                        i = 19;
                        str = "@\u0000D,PD<H6V\u0010";
                        obj = 18;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                        strArr2[i] = str;
                        i = 20;
                        str = "}7O<XC5\u0001\u0014^L6D*\u0011";
                        obj = 19;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                        strArr2[i] = str;
                        i = 21;
                        str = "\r?s=AB U\u0016TU&r,P_&\u001c";
                        obj = 20;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_buttonStyleSmall /*20*/:
                        strArr2[i] = str;
                        i = 22;
                        str = "@\u001eN9UH \u001c";
                        obj = 21;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_selectableItemBackground /*21*/:
                        strArr2[i] = str;
                        i = 23;
                        str = "\rr";
                        obj = 22;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_windowContentOverlay /*22*/:
                        strArr2[i] = str;
                        i = 24;
                        str = "\rr";
                        obj = 23;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                        strArr2[i] = str;
                        i = 25;
                        str = "\r?m1BY7O=C\u007f7F1BY7S=U\u0010";
                        obj = 24;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                        strArr2[i] = str;
                        i = 26;
                        str = "@\u0016@,P\u0010";
                        obj = 25;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textAppearanceSmall /*25*/:
                        strArr2[i] = str;
                        i = 27;
                        str = "@\u001bEe";
                        obj = 26;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textColorPrimary /*26*/:
                        strArr2[i] = str;
                        i = 28;
                        str = "\rh\u0001";
                        obj = 27;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                        strArr2[i] = str;
                        i = 29;
                        str = "a=@<T_\u001bO>^V";
                        obj = 28;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                        strArr2[i] = str;
                        i = 30;
                        str = "P/";
                        obj = 29;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_spinnerItemStyle /*29*/:
                        strArr2[i] = str;
                        i = 31;
                        str = "\rq";
                        obj = 30;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                        strArr2[i] = str;
                        i = 32;
                        str = "\rrg1_D!I=U\r\u0000D,PD<H6V\u0017r";
                        obj = 31;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                        strArr2[i] = str;
                        str = "a=@<T_\u001f@6PJ7S";
                        obj = 32;
                        i = 33;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchDropdownBackground /*32*/:
                        strArr2[i] = str;
                        i = 34;
                        strArr2 = strArr3;
                        str = "a=@<T_\u001f@6PJ7S";
                        obj = 33;
                        break;
                    case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                        strArr2[i] = str;
                        i = 35;
                        str = "\rrr,^]\"H6V\u0017r";
                        obj = 34;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewGoIcon /*34*/:
                        strArr2[i] = str;
                        i = 36;
                        str = "\rre=BY N!XC5\u001bx";
                        obj = 35;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                        strArr2[i] = str;
                        i = 37;
                        str = "a=@<T_\u001f@6PJ7S";
                        obj = 36;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                        strArr2[i] = str;
                        i = 38;
                        str = "a=@<T_\u001f@6PJ7S";
                        obj = 37;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewEditQuery /*37*/:
                        strArr2[i] = str;
                        i = 39;
                        str = "\rrs=BH&H6V\u0017r";
                        obj = 38;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                        strArr2[i] = str;
                        i = 40;
                        str = "B<m7PI7S\nT^7U";
                        obj = 39;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewTextField /*39*/:
                        strArr2[i] = str;
                        i = 41;
                        str = "\rrs=EL;O1_Jh\u0001";
                        obj = 40;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                        strArr2[i] = str;
                        i = 42;
                        str = "a=@<T_\u001f@6PJ7S";
                        obj = 41;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textColorSearchUrl /*41*/:
                        strArr2[i] = str;
                        i = 43;
                        str = "a=@<T_\u001f@6PJ7S";
                        obj = 42;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                        strArr2[i] = str;
                        i = 44;
                        str = "\rrr,P_&H6V\u0017r";
                        obj = 43;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                        strArr2[i] = str;
                        i = 45;
                        str = "b0K=RYrS=EX O=U\r4S7\\\r=O\u001bCH3U=}B3E=C\r?T+E\r<N,\u0011O7\u00019\u0011C=OuBY3U1R\r;O6T_rL=\\O7SxRA3R+\u000b\r";
                        obj = 44;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "\rrh?_B H6V\r>N9U\r1N5AA7U=\u0011\u0000\u007f\u0001<T^&S7HH6";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        void callOnLoadFinished(Loader loader, Object obj) {
            if (this.mCallbacks != null) {
                String str;
                if (this.this$0.mActivity != null) {
                    String str2 = this.this$0.mActivity.mFragments.mNoTransactionsBecause;
                    this.this$0.mActivity.mFragments.mNoTransactionsBecause = z[11];
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    if (DEBUG) {
                        Log.v(z[9], z[10] + loader + z[8] + loader.dataToString(obj));
                    }
                    this.mCallbacks.onLoadFinished(loader, obj);
                    if (this.this$0.mActivity != null) {
                        this.this$0.mActivity.mFragments.mNoTransactionsBecause = str;
                    }
                    this.mDeliveredData = true;
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (Throwable th) {
                    try {
                        if (this.this$0.mActivity != null) {
                            this.this$0.mActivity.mFragments.mNoTransactionsBecause = str;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void reportStart() {
            /*
            r2_this = this;
            r0 = r2.mStarted;	 Catch:{ IllegalArgumentException -> 0x0017 }
            if (r0 == 0) goto L_0x0016;
        L_0x0004:
            r0 = r2.mReportNextStart;	 Catch:{ IllegalArgumentException -> 0x0019 }
            if (r0 == 0) goto L_0x0016;
        L_0x0008:
            r0 = 0;
            r2.mReportNextStart = r0;	 Catch:{ IllegalArgumentException -> 0x001b }
            r0 = r2.mHaveData;	 Catch:{ IllegalArgumentException -> 0x001b }
            if (r0 == 0) goto L_0x0016;
        L_0x000f:
            r0 = r2.mLoader;	 Catch:{ IllegalArgumentException -> 0x001b }
            r1 = r2.mData;	 Catch:{ IllegalArgumentException -> 0x001b }
            r2.callOnLoadFinished(r0, r1);	 Catch:{ IllegalArgumentException -> 0x001b }
        L_0x0016:
            return;
        L_0x0017:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0019 }
        L_0x0019:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x001b }
        L_0x001b:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LoaderManagerImpl.LoaderInfo.reportStart():void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void finishRetain() {
            /*
            r4_this = this;
            r0 = r4.mRetaining;	 Catch:{ IllegalArgumentException -> 0x004c }
            if (r0 == 0) goto L_0x0038;
        L_0x0004:
            r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x004e }
            if (r0 == 0) goto L_0x0028;
        L_0x0008:
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x004e }
            r1 = 33;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x004e }
            r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004e }
            r1.<init>();	 Catch:{ IllegalArgumentException -> 0x004e }
            r2 = z;	 Catch:{ IllegalArgumentException -> 0x004e }
            r3 = 32;
            r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x004e }
            r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x004e }
            r1 = r1.append(r4);	 Catch:{ IllegalArgumentException -> 0x004e }
            r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x004e }
            android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x004e }
        L_0x0028:
            r0 = 0;
            r4.mRetaining = r0;	 Catch:{ IllegalArgumentException -> 0x0050 }
            r0 = r4.mStarted;	 Catch:{ IllegalArgumentException -> 0x0050 }
            r1 = r4.mRetainingStarted;	 Catch:{ IllegalArgumentException -> 0x0050 }
            if (r0 == r1) goto L_0x0038;
        L_0x0031:
            r0 = r4.mStarted;	 Catch:{ IllegalArgumentException -> 0x0052 }
            if (r0 != 0) goto L_0x0038;
        L_0x0035:
            r4.stop();	 Catch:{ IllegalArgumentException -> 0x0052 }
        L_0x0038:
            r0 = r4.mStarted;	 Catch:{ IllegalArgumentException -> 0x0054 }
            if (r0 == 0) goto L_0x004b;
        L_0x003c:
            r0 = r4.mHaveData;	 Catch:{ IllegalArgumentException -> 0x0056 }
            if (r0 == 0) goto L_0x004b;
        L_0x0040:
            r0 = r4.mReportNextStart;	 Catch:{ IllegalArgumentException -> 0x0058 }
            if (r0 != 0) goto L_0x004b;
        L_0x0044:
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x0058 }
            r1 = r4.mData;	 Catch:{ IllegalArgumentException -> 0x0058 }
            r4.callOnLoadFinished(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0058 }
        L_0x004b:
            return;
        L_0x004c:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x004e }
        L_0x004e:
            r0 = move-exception;
            throw r0;
        L_0x0050:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
        L_0x0052:
            r0 = move-exception;
            throw r0;
        L_0x0054:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0056 }
        L_0x0056:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0058 }
        L_0x0058:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LoaderManagerImpl.LoaderInfo.finishRetain():void");
        }

        public LoaderInfo(LoaderManagerImpl loaderManagerImpl, int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
            this.this$0 = loaderManagerImpl;
            this.mId = i;
            this.mArgs = bundle;
            this.mCallbacks = loaderCallbacks;
        }

        void retain() {
            try {
                if (DEBUG) {
                    Log.v(z[42], z[41] + this);
                }
                this.mRetaining = true;
                this.mRetainingStarted = this.mStarted;
                this.mStarted = false;
                this.mCallbacks = null;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
            /*
            r4_this = this;
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x012a }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x012a }
            r1 = 27;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012a }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012a }
            r0 = r4.mId;	 Catch:{ IllegalArgumentException -> 0x012a }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012a }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x012a }
            r1 = 17;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012a }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012a }
            r0 = r4.mArgs;	 Catch:{ IllegalArgumentException -> 0x012a }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x012a }
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x012a }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x012a }
            r1 = 12;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012a }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012a }
            r0 = r4.mCallbacks;	 Catch:{ IllegalArgumentException -> 0x012a }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x012a }
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x012a }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x012a }
            r1 = 22;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012a }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012a }
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x012a }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x012a }
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x012a }
            if (r0 == 0) goto L_0x0061;
        L_0x0045:
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x012a }
            r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x012a }
            r1.<init>();	 Catch:{ IllegalArgumentException -> 0x012a }
            r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x012a }
            r2 = z;	 Catch:{ IllegalArgumentException -> 0x012a }
            r3 = 23;
            r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x012a }
            r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x012a }
            r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x012a }
            r0.dump(r1, r6, r7, r8);	 Catch:{ IllegalArgumentException -> 0x012a }
        L_0x0061:
            r0 = r4.mHaveData;	 Catch:{ IllegalArgumentException -> 0x012c }
            if (r0 != 0) goto L_0x0069;
        L_0x0065:
            r0 = r4.mDeliveredData;	 Catch:{ IllegalArgumentException -> 0x012e }
            if (r0 == 0) goto L_0x0099;
        L_0x0069:
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x012e }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x012e }
            r1 = 18;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012e }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012e }
            r0 = r4.mHaveData;	 Catch:{ IllegalArgumentException -> 0x012e }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012e }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x012e }
            r1 = 16;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012e }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012e }
            r0 = r4.mDeliveredData;	 Catch:{ IllegalArgumentException -> 0x012e }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x012e }
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x012e }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x012e }
            r1 = 26;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012e }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x012e }
            r0 = r4.mData;	 Catch:{ IllegalArgumentException -> 0x012e }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x012e }
        L_0x0099:
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r1 = 13;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = r4.mStarted;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r1 = 21;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = r4.mReportNextStart;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r1 = 14;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = r4.mDestroyed;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r1 = 19;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = r4.mRetaining;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r1 = 15;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = r4.mRetainingStarted;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r1 = 25;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = r4.mListenerRegistered;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = r4.mPendingLoader;	 Catch:{ IllegalArgumentException -> 0x0130 }
            if (r0 == 0) goto L_0x0129;
        L_0x00f7:
            r7.print(r5);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r1 = 20;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = r4.mPendingLoader;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r7.print(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = ":";
            r7.println(r0);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0 = r4.mPendingLoader;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0130 }
            r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r2 = z;	 Catch:{ IllegalArgumentException -> 0x0130 }
            r3 = 24;
            r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0130 }
            r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0130 }
            r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0130 }
            r0.dump(r1, r6, r7, r8);	 Catch:{ IllegalArgumentException -> 0x0130 }
        L_0x0129:
            return;
        L_0x012a:
            r0 = move-exception;
            throw r0;
        L_0x012c:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x012e }
        L_0x012e:
            r0 = move-exception;
            throw r0;
        L_0x0130:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LoaderManagerImpl.LoaderInfo.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append(z[29]);
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(z[31]);
            stringBuilder.append(this.mId);
            stringBuilder.append(z[28]);
            DebugUtils.buildShortClassTag(this.mLoader, stringBuilder);
            stringBuilder.append(z[30]);
            return stringBuilder.toString();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void stop() {
            /*
            r4_this = this;
            r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0041 }
            if (r0 == 0) goto L_0x0024;
        L_0x0004:
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0041 }
            r1 = 34;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0041 }
            r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0041 }
            r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0041 }
            r2 = z;	 Catch:{ IllegalArgumentException -> 0x0041 }
            r3 = 35;
            r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0041 }
            r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0041 }
            r1 = r1.append(r4);	 Catch:{ IllegalArgumentException -> 0x0041 }
            r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0041 }
            android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0041 }
        L_0x0024:
            r0 = 0;
            r4.mStarted = r0;	 Catch:{ IllegalArgumentException -> 0x0043 }
            r0 = r4.mRetaining;	 Catch:{ IllegalArgumentException -> 0x0043 }
            if (r0 != 0) goto L_0x0040;
        L_0x002b:
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x0045 }
            if (r0 == 0) goto L_0x0040;
        L_0x002f:
            r0 = r4.mListenerRegistered;	 Catch:{ IllegalArgumentException -> 0x0047 }
            if (r0 == 0) goto L_0x0040;
        L_0x0033:
            r0 = 0;
            r4.mListenerRegistered = r0;	 Catch:{ IllegalArgumentException -> 0x0047 }
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x0047 }
            r0.unregisterListener(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x0047 }
            r0.stopLoading();	 Catch:{ IllegalArgumentException -> 0x0047 }
        L_0x0040:
            return;
        L_0x0041:
            r0 = move-exception;
            throw r0;
        L_0x0043:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0045 }
        L_0x0045:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0047 }
        L_0x0047:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LoaderManagerImpl.LoaderInfo.stop():void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onLoadComplete(android.support.v4.content.Loader r7, java.lang.Object r8) {
            /*
            r6_this = this;
            r5 = 0;
            r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0039 }
            if (r0 == 0) goto L_0x0023;
        L_0x0005:
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0039 }
            r1 = 6;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0039 }
            r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0039 }
            r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0039 }
            r2 = z;	 Catch:{ IllegalArgumentException -> 0x0039 }
            r3 = 0;
            r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0039 }
            r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0039 }
            r1 = r1.append(r6);	 Catch:{ IllegalArgumentException -> 0x0039 }
            r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0039 }
            android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0039 }
        L_0x0023:
            r0 = r6.mDestroyed;	 Catch:{ IllegalArgumentException -> 0x003b }
            if (r0 == 0) goto L_0x003f;
        L_0x0027:
            r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x003d }
            if (r0 == 0) goto L_0x0038;
        L_0x002b:
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x003d }
            r1 = 3;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x003d }
            r1 = z;	 Catch:{ IllegalArgumentException -> 0x003d }
            r2 = 1;
            r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x003d }
            android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x003d }
        L_0x0038:
            return;
        L_0x0039:
            r0 = move-exception;
            throw r0;
        L_0x003b:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x003d }
        L_0x003d:
            r0 = move-exception;
            throw r0;
        L_0x003f:
            r0 = r6.this$0;	 Catch:{ IllegalArgumentException -> 0x005f }
            r0 = r0.mLoaders;	 Catch:{ IllegalArgumentException -> 0x005f }
            r1 = r6.mId;	 Catch:{ IllegalArgumentException -> 0x005f }
            r0 = r0.get(r1);	 Catch:{ IllegalArgumentException -> 0x005f }
            if (r0 == r6) goto L_0x0061;
        L_0x004b:
            r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x005d }
            if (r0 == 0) goto L_0x0038;
        L_0x004f:
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x005d }
            r1 = 5;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x005d }
            r1 = z;	 Catch:{ IllegalArgumentException -> 0x005d }
            r2 = 4;
            r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x005d }
            android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x005d }
            goto L_0x0038;
        L_0x005d:
            r0 = move-exception;
            throw r0;
        L_0x005f:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x005d }
        L_0x0061:
            r0 = r6.mPendingLoader;
            if (r0 == 0) goto L_0x009d;
        L_0x0065:
            r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x009b }
            if (r1 == 0) goto L_0x0087;
        L_0x0069:
            r1 = z;	 Catch:{ IllegalArgumentException -> 0x009b }
            r2 = 7;
            r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x009b }
            r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x009b }
            r2.<init>();	 Catch:{ IllegalArgumentException -> 0x009b }
            r3 = z;	 Catch:{ IllegalArgumentException -> 0x009b }
            r4 = 2;
            r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x009b }
            r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x009b }
            r2 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x009b }
            r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x009b }
            android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x009b }
        L_0x0087:
            r6.mPendingLoader = r5;
            r1 = r6.this$0;
            r1 = r1.mLoaders;
            r2 = r6.mId;
            r1.put(r2, r5);
            r6.destroy();
            r1 = r6.this$0;
            r1.installLoader(r0);
            goto L_0x0038;
        L_0x009b:
            r0 = move-exception;
            throw r0;
        L_0x009d:
            r0 = r6.mData;	 Catch:{ IllegalArgumentException -> 0x00eb }
            if (r0 != r8) goto L_0x00a5;
        L_0x00a1:
            r0 = r6.mHaveData;	 Catch:{ IllegalArgumentException -> 0x00ed }
            if (r0 != 0) goto L_0x00b1;
        L_0x00a5:
            r6.mData = r8;	 Catch:{ IllegalArgumentException -> 0x00ef }
            r0 = 1;
            r6.mHaveData = r0;	 Catch:{ IllegalArgumentException -> 0x00ef }
            r0 = r6.mStarted;	 Catch:{ IllegalArgumentException -> 0x00ef }
            if (r0 == 0) goto L_0x00b1;
        L_0x00ae:
            r6.callOnLoadFinished(r7, r8);	 Catch:{ IllegalArgumentException -> 0x00ef }
        L_0x00b1:
            r0 = r6.this$0;
            r0 = r0.mInactiveLoaders;
            r1 = r6.mId;
            r0 = r0.get(r1);
            r0 = (android.support.v4.app.LoaderManagerImpl.LoaderInfo) r0;
            if (r0 == 0) goto L_0x00d0;
        L_0x00bf:
            if (r0 == r6) goto L_0x00d0;
        L_0x00c1:
            r1 = 0;
            r0.mDeliveredData = r1;	 Catch:{ IllegalArgumentException -> 0x00f1 }
            r0.destroy();	 Catch:{ IllegalArgumentException -> 0x00f1 }
            r0 = r6.this$0;	 Catch:{ IllegalArgumentException -> 0x00f1 }
            r0 = r0.mInactiveLoaders;	 Catch:{ IllegalArgumentException -> 0x00f1 }
            r1 = r6.mId;	 Catch:{ IllegalArgumentException -> 0x00f1 }
            r0.remove(r1);	 Catch:{ IllegalArgumentException -> 0x00f1 }
        L_0x00d0:
            r0 = r6.this$0;	 Catch:{ IllegalArgumentException -> 0x00f3 }
            r0 = r0.mActivity;	 Catch:{ IllegalArgumentException -> 0x00f3 }
            if (r0 == 0) goto L_0x0038;
        L_0x00d6:
            r0 = r6.this$0;	 Catch:{ IllegalArgumentException -> 0x00e9 }
            r0 = r0.hasRunningLoaders();	 Catch:{ IllegalArgumentException -> 0x00e9 }
            if (r0 != 0) goto L_0x0038;
        L_0x00de:
            r0 = r6.this$0;	 Catch:{ IllegalArgumentException -> 0x00e9 }
            r0 = r0.mActivity;	 Catch:{ IllegalArgumentException -> 0x00e9 }
            r0 = r0.mFragments;	 Catch:{ IllegalArgumentException -> 0x00e9 }
            r0.startPendingDeferredFragments();	 Catch:{ IllegalArgumentException -> 0x00e9 }
            goto L_0x0038;
        L_0x00e9:
            r0 = move-exception;
            throw r0;
        L_0x00eb:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00ed }
        L_0x00ed:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00ef }
        L_0x00ef:
            r0 = move-exception;
            throw r0;
        L_0x00f1:
            r0 = move-exception;
            throw r0;
        L_0x00f3:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00e9 }
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LoaderManagerImpl.LoaderInfo.onLoadComplete(android.support.v4.content.Loader, java.lang.Object):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void start() {
            /*
            r4_this = this;
            r0 = r4.mRetaining;	 Catch:{ IllegalArgumentException -> 0x000c }
            if (r0 == 0) goto L_0x0010;
        L_0x0004:
            r0 = r4.mRetainingStarted;	 Catch:{ IllegalArgumentException -> 0x000e }
            if (r0 == 0) goto L_0x0010;
        L_0x0008:
            r0 = 1;
            r4.mStarted = r0;	 Catch:{ IllegalArgumentException -> 0x000e }
        L_0x000b:
            return;
        L_0x000c:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x000e }
        L_0x000e:
            r0 = move-exception;
            throw r0;
        L_0x0010:
            r0 = r4.mStarted;	 Catch:{ IllegalArgumentException -> 0x0090 }
            if (r0 != 0) goto L_0x000b;
        L_0x0014:
            r0 = 1;
            r4.mStarted = r0;	 Catch:{ IllegalArgumentException -> 0x0092 }
            r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0092 }
            if (r0 == 0) goto L_0x003b;
        L_0x001b:
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x0092 }
            r1 = 43;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0092 }
            r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0092 }
            r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0092 }
            r2 = z;	 Catch:{ IllegalArgumentException -> 0x0092 }
            r3 = 44;
            r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0092 }
            r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0092 }
            r1 = r1.append(r4);	 Catch:{ IllegalArgumentException -> 0x0092 }
            r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0092 }
            android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0092 }
        L_0x003b:
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x0094 }
            if (r0 != 0) goto L_0x004f;
        L_0x003f:
            r0 = r4.mCallbacks;	 Catch:{ IllegalArgumentException -> 0x0096 }
            if (r0 == 0) goto L_0x004f;
        L_0x0043:
            r0 = r4.mCallbacks;	 Catch:{ IllegalArgumentException -> 0x0096 }
            r1 = r4.mId;	 Catch:{ IllegalArgumentException -> 0x0096 }
            r2 = r4.mArgs;	 Catch:{ IllegalArgumentException -> 0x0096 }
            r0 = r0.onCreateLoader(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0096 }
            r4.mLoader = r0;	 Catch:{ IllegalArgumentException -> 0x0096 }
        L_0x004f:
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x0098 }
            if (r0 == 0) goto L_0x000b;
        L_0x0053:
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x009a }
            r0 = r0.getClass();	 Catch:{ IllegalArgumentException -> 0x009a }
            r0 = r0.isMemberClass();	 Catch:{ IllegalArgumentException -> 0x009a }
            if (r0 == 0) goto L_0x009c;
        L_0x005f:
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x008e }
            r0 = r0.getClass();	 Catch:{ IllegalArgumentException -> 0x008e }
            r0 = r0.getModifiers();	 Catch:{ IllegalArgumentException -> 0x008e }
            r0 = java.lang.reflect.Modifier.isStatic(r0);	 Catch:{ IllegalArgumentException -> 0x008e }
            if (r0 != 0) goto L_0x009c;
        L_0x006f:
            r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x008e }
            r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x008e }
            r1.<init>();	 Catch:{ IllegalArgumentException -> 0x008e }
            r2 = z;	 Catch:{ IllegalArgumentException -> 0x008e }
            r3 = 45;
            r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x008e }
            r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x008e }
            r2 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x008e }
            r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x008e }
            r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x008e }
            r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x008e }
            throw r0;	 Catch:{ IllegalArgumentException -> 0x008e }
        L_0x008e:
            r0 = move-exception;
            throw r0;
        L_0x0090:
            r0 = move-exception;
            throw r0;
        L_0x0092:
            r0 = move-exception;
            throw r0;
        L_0x0094:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0096 }
        L_0x0096:
            r0 = move-exception;
            throw r0;
        L_0x0098:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x009a }
        L_0x009a:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x008e }
        L_0x009c:
            r0 = r4.mListenerRegistered;	 Catch:{ IllegalArgumentException -> 0x00b1 }
            if (r0 != 0) goto L_0x00aa;
        L_0x00a0:
            r0 = r4.mLoader;	 Catch:{ IllegalArgumentException -> 0x00b1 }
            r1 = r4.mId;	 Catch:{ IllegalArgumentException -> 0x00b1 }
            r0.registerListener(r1, r4);	 Catch:{ IllegalArgumentException -> 0x00b1 }
            r0 = 1;
            r4.mListenerRegistered = r0;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        L_0x00aa:
            r0 = r4.mLoader;
            r0.startLoading();
            goto L_0x000b;
        L_0x00b1:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LoaderManagerImpl.LoaderInfo.start():void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void destroy() {
            /*
            r5_this = this;
            r0 = 0;
            r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x00b9 }
            if (r1 == 0) goto L_0x0025;
        L_0x0005:
            r1 = z;	 Catch:{ IllegalArgumentException -> 0x00b9 }
            r2 = 38;
            r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00b9 }
            r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00b9 }
            r2.<init>();	 Catch:{ IllegalArgumentException -> 0x00b9 }
            r3 = z;	 Catch:{ IllegalArgumentException -> 0x00b9 }
            r4 = 36;
            r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x00b9 }
            r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x00b9 }
            r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x00b9 }
            r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00b9 }
            android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        L_0x0025:
            r1 = 1;
            r5.mDestroyed = r1;
            r1 = r5.mDeliveredData;
            r2 = 0;
            r5.mDeliveredData = r2;	 Catch:{ IllegalArgumentException -> 0x00bb }
            r2 = r5.mCallbacks;	 Catch:{ IllegalArgumentException -> 0x00bb }
            if (r2 == 0) goto L_0x0091;
        L_0x0031:
            r2 = r5.mLoader;	 Catch:{ IllegalArgumentException -> 0x00bb }
            if (r2 == 0) goto L_0x0091;
        L_0x0035:
            r2 = r5.mHaveData;	 Catch:{ IllegalArgumentException -> 0x00bd }
            if (r2 == 0) goto L_0x0091;
        L_0x0039:
            if (r1 == 0) goto L_0x0091;
        L_0x003b:
            r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x00c1 }
            if (r1 == 0) goto L_0x005f;
        L_0x003f:
            r1 = z;	 Catch:{ IllegalArgumentException -> 0x00c3 }
            r2 = 37;
            r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00c3 }
            r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00c3 }
            r2.<init>();	 Catch:{ IllegalArgumentException -> 0x00c3 }
            r3 = z;	 Catch:{ IllegalArgumentException -> 0x00c3 }
            r4 = 39;
            r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x00c3 }
            r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x00c3 }
            r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x00c3 }
            r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00c3 }
            android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        L_0x005f:
            r1 = r5.this$0;
            r1 = r1.mActivity;
            if (r1 == 0) goto L_0x00dd;
        L_0x0065:
            r0 = r5.this$0;
            r0 = r0.mActivity;
            r0 = r0.mFragments;
            r0 = r0.mNoTransactionsBecause;
            r1 = r5.this$0;
            r1 = r1.mActivity;
            r1 = r1.mFragments;
            r2 = z;
            r3 = 40;
            r2 = r2[r3];
            r1.mNoTransactionsBecause = r2;
            r1 = r0;
        L_0x007c:
            r0 = r5.mCallbacks;	 Catch:{ all -> 0x00c5 }
            r2 = r5.mLoader;	 Catch:{ all -> 0x00c5 }
            r0.onLoaderReset(r2);	 Catch:{ all -> 0x00c5 }
            r0 = r5.this$0;
            r0 = r0.mActivity;
            if (r0 == 0) goto L_0x0091;
        L_0x0089:
            r0 = r5.this$0;
            r0 = r0.mActivity;
            r0 = r0.mFragments;
            r0.mNoTransactionsBecause = r1;
        L_0x0091:
            r0 = 0;
            r5.mCallbacks = r0;	 Catch:{ IllegalArgumentException -> 0x00d7 }
            r0 = 0;
            r5.mData = r0;	 Catch:{ IllegalArgumentException -> 0x00d7 }
            r0 = 0;
            r5.mHaveData = r0;	 Catch:{ IllegalArgumentException -> 0x00d7 }
            r0 = r5.mLoader;	 Catch:{ IllegalArgumentException -> 0x00d7 }
            if (r0 == 0) goto L_0x00af;
        L_0x009e:
            r0 = r5.mListenerRegistered;	 Catch:{ IllegalArgumentException -> 0x00d9 }
            if (r0 == 0) goto L_0x00aa;
        L_0x00a2:
            r0 = 0;
            r5.mListenerRegistered = r0;	 Catch:{ IllegalArgumentException -> 0x00d9 }
            r0 = r5.mLoader;	 Catch:{ IllegalArgumentException -> 0x00d9 }
            r0.unregisterListener(r5);	 Catch:{ IllegalArgumentException -> 0x00d9 }
        L_0x00aa:
            r0 = r5.mLoader;
            r0.reset();
        L_0x00af:
            r0 = r5.mPendingLoader;	 Catch:{ IllegalArgumentException -> 0x00db }
            if (r0 == 0) goto L_0x00b8;
        L_0x00b3:
            r0 = r5.mPendingLoader;	 Catch:{ IllegalArgumentException -> 0x00db }
            r0.destroy();	 Catch:{ IllegalArgumentException -> 0x00db }
        L_0x00b8:
            return;
        L_0x00b9:
            r0 = move-exception;
            throw r0;
        L_0x00bb:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00bd }
        L_0x00bd:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00bf }
        L_0x00bf:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00c1 }
        L_0x00c1:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception;
            throw r0;
        L_0x00c5:
            r0 = move-exception;
            r2 = r5.this$0;	 Catch:{ IllegalArgumentException -> 0x00d5 }
            r2 = r2.mActivity;	 Catch:{ IllegalArgumentException -> 0x00d5 }
            if (r2 == 0) goto L_0x00d4;
        L_0x00cc:
            r2 = r5.this$0;	 Catch:{ IllegalArgumentException -> 0x00d5 }
            r2 = r2.mActivity;	 Catch:{ IllegalArgumentException -> 0x00d5 }
            r2 = r2.mFragments;	 Catch:{ IllegalArgumentException -> 0x00d5 }
            r2.mNoTransactionsBecause = r1;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        L_0x00d4:
            throw r0;
        L_0x00d5:
            r0 = move-exception;
            throw r0;
        L_0x00d7:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception;
            throw r0;
        L_0x00db:
            r0 = move-exception;
            throw r0;
        L_0x00dd:
            r1 = r0;
            goto L_0x007c;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LoaderManagerImpl.LoaderInfo.destroy():void");
        }
    }

    private LoaderInfo createAndInstallLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        LoaderInfo loaderInfo = true;
        try {
            this.mCreatingLoader = true;
            loaderInfo = createLoader(i, bundle, loaderCallbacks);
            installLoader(loaderInfo);
            return loaderInfo;
        } finally {
            this.mCreatingLoader = false;
        }
    }

    static {
        String[] strArr = new String[59];
        String str = "?f`\u001e[\u0003jz\u0018\u0012\u0004m4";
        boolean z = true;
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
                        i3 = 109;
                        break;
                    case ay.f /*1*/:
                        i3 = 3;
                        break;
                    case ay.n /*2*/:
                        i3 = 20;
                        break;
                    case ay.p /*3*/:
                        i3 = 127;
                        break;
                    default:
                        i3 = 50;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0005ff\u001a";
                    z = true;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ".bx\u0013W\t#p\u0010`\bwu\u0016\\Mt|\u001a\\Mm{\u000b\u0012\u001ewu\rF\bg._";
                    z = true;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "Mjz_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "!lu\u001bW\u001fNu\u0011S\nff\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0010~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "+jz\u0016A\u0005fp_`\bwu\u0016\\\u0004ms_[\u0003#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ")fg\u000b@\u0002z}\u0011UMJz\u001eQ\u0019jb\u001a\u0012\u0004m4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ")fg\u000b@\u0002z}\u0011UMBw\u000b[\u001bf4\u0016\\M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "W#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "$mu\u001cF\u0004uq_~\u0002bp\u001a@\u001e9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "M#7";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = ",``\u0016D\b#X\u0010S\tff\f\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "M#4_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "M#7";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    str = "W#";
                    z = true;
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    strArr2 = strArr3;
                    str = "M#4_";
                    z = true;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u001ffg\u000bS\u001fwX\u0010S\tff_[\u0003#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "M#Y\u001eY\u0004ms_^\fp`_^\u0002bp\u001a@Mjz\u001eQ\u0019jb\u001a\bM";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = ".bx\u0013W\t#c\u0017[\u0001f4\u001c@\bb`\u0016\\\n#u_^\u0002bp\u001a@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "M#W\n@\u001ffz\u000b\u0012\u0001lu\u001bW\u001f#}\f\u0012\u001ew{\u000fB\bg/_@\bsx\u001eQ\u0004ms";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "W#u\rU\u001e>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "M#F\u001a_\u0002u}\u0011UMsq\u0011V\u0004ms_^\u0002bp\u001a@W#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "M#Q\u0011C\u0018fa\u0016\\\n#u\f\u0012\u0003fc_B\bmp\u0016\\\n#x\u0010S\tff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "M#F\u001a_\u0002u}\u0011UMou\fFMjz\u001eQ\u0019jb\u001a\u0012\u0001lu\u001bW\u001f94";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "Mlr_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = ".bx\u0013W\t#c\u0017[\u0001f4\u001c@\bb`\u0016\\\n#u_^\u0002bp\u001a@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\tfg\u000b@\u0002zX\u0010S\tff_[\u0003#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0005ff\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = ">w{\u000fB\u0004ms_[\u0003#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = ".bx\u0013W\t#p\u0010a\u0019ld_E\u0005fz_\\\u0002w4\fF\fq`\u001aVW#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = ".bx\u0013W\t#c\u0017[\u0001f4\u001c@\bb`\u0016\\\n#u_^\u0002bp\u001a@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "M#W\rW\fwq\u001b\u0012\u0003fc_^\u0002bp\u001a@M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u0004m}\u000b~\u0002bp\u001a@Mjz_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    str = "M#F\u001a\u001f\u0018p}\u0011UMfl\u0016A\u0019jz\u0018\u0012\u0001lu\u001bW\u001f#";
                    z = true;
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    strArr2 = strArr3;
                    str = ".bx\u0013W\t#c\u0017[\u0001f4\u001c@\bb`\u0016\\\n#u_^\u0002bp\u001a@";
                    z = true;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "W#u\rU\u001e>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = ">wu\rF\u0004ms_[\u0003#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = ".bx\u0013W\t#p\u0010a\u0019bf\u000b\u0012\u001akq\u0011\u0012\fof\u001aS\tz4\fF\fq`\u001aVW#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0005ff\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    z = strArr3;
                    DEBUG = false;
                default:
                    strArr2[i] = str;
                    str = "!lu\u001bW\u001fNu\u0011S\nff";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    void doStart() {
        boolean z = FragmentActivity.a;
        try {
            if (DEBUG) {
                Log.v(z[57], z[54] + this);
            }
            if (this.mStarted) {
                Throwable runtimeException = new RuntimeException(z[56]);
                runtimeException.fillInStackTrace();
                Log.w(z[58], z[55] + this, runtimeException);
                return;
            }
            this.mStarted = true;
            int size = this.mLoaders.size() - 1;
            while (size >= 0) {
                ((LoaderInfo) this.mLoaders.valueAt(size)).start();
                int i = size - 1;
                if (!z) {
                    size = i;
                } else {
                    return;
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    void doReportStart() {
        boolean z = FragmentActivity.a;
        int size = this.mLoaders.size() - 1;
        while (size >= 0) {
            ((LoaderInfo) this.mLoaders.valueAt(size)).reportStart();
            int i = size - 1;
            if (!z) {
                size = i;
            } else {
                return;
            }
        }
    }

    void installLoader(LoaderInfo loaderInfo) {
        try {
            this.mLoaders.put(loaderInfo.mId, loaderInfo);
            if (this.mStarted) {
                loaderInfo.start();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private LoaderInfo createLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        LoaderInfo loaderInfo = new LoaderInfo(this, i, bundle, loaderCallbacks);
        loaderInfo.mLoader = loaderCallbacks.onCreateLoader(i, bundle);
        return loaderInfo;
    }

    void updateActivity(FragmentActivity fragmentActivity) {
        this.mActivity = fragmentActivity;
    }

    public void destroyLoader(int i) {
        try {
            if (this.mCreatingLoader) {
                throw new IllegalStateException(z[37]);
            }
            try {
                LoaderInfo loaderInfo;
                if (DEBUG) {
                    Log.v(z[39], z[38] + this + z[36] + i);
                }
                int indexOfKey = this.mLoaders.indexOfKey(i);
                if (indexOfKey >= 0) {
                    loaderInfo = (LoaderInfo) this.mLoaders.valueAt(indexOfKey);
                    this.mLoaders.removeAt(indexOfKey);
                    loaderInfo.destroy();
                }
                indexOfKey = this.mInactiveLoaders.indexOfKey(i);
                if (indexOfKey >= 0) {
                    loaderInfo = (LoaderInfo) this.mInactiveLoaders.valueAt(indexOfKey);
                    this.mInactiveLoaders.removeAt(indexOfKey);
                    loaderInfo.destroy();
                }
                try {
                    if (this.mActivity == null) {
                        return;
                    }
                    if (!hasRunningLoaders()) {
                        this.mActivity.mFragments.startPendingDeferredFragments();
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    LoaderManagerImpl(String str, FragmentActivity fragmentActivity, boolean z) {
        this.mLoaders = new SparseArrayCompat();
        this.mInactiveLoaders = new SparseArrayCompat();
        this.mWho = str;
        this.mActivity = fragmentActivity;
        this.mStarted = z;
    }

    void doStop() {
        boolean z = FragmentActivity.a;
        try {
            if (DEBUG) {
                Log.v(z[41], z[42] + this);
            }
            if (this.mStarted) {
                int size = this.mLoaders.size() - 1;
                while (size >= 0) {
                    ((LoaderInfo) this.mLoaders.valueAt(size)).stop();
                    int i = size - 1;
                    if (z) {
                        break;
                    }
                    size = i;
                }
                this.mStarted = false;
                return;
            }
            Throwable runtimeException = new RuntimeException(z[40]);
            runtimeException.fillInStackTrace();
            Log.w(z[44], z[43] + this, runtimeException);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    void doDestroy() {
        boolean z = FragmentActivity.a;
        try {
            int size;
            int i;
            if (!this.mRetaining) {
                if (DEBUG) {
                    Log.v(z[10], z[13] + this);
                }
                size = this.mLoaders.size() - 1;
                while (size >= 0) {
                    ((LoaderInfo) this.mLoaders.valueAt(size)).destroy();
                    i = size - 1;
                    if (z) {
                        break;
                    }
                    size = i;
                }
                this.mLoaders.clear();
            }
            try {
                if (DEBUG) {
                    Log.v(z[11], z[12] + this);
                }
                size = this.mInactiveLoaders.size() - 1;
                while (size >= 0) {
                    ((LoaderInfo) this.mInactiveLoaders.valueAt(size)).destroy();
                    i = size - 1;
                    if (z) {
                        break;
                    }
                    size = i;
                }
                this.mInactiveLoaders.clear();
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(z[6]);
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(z[5]);
        DebugUtils.buildShortClassTag(this.mActivity, stringBuilder);
        stringBuilder.append(z[7]);
        return stringBuilder.toString();
    }

    public boolean hasRunningLoaders() {
        boolean z = FragmentActivity.a;
        int size = this.mLoaders.size();
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            try {
                int i2;
                boolean z3;
                int i3;
                LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.valueAt(i);
                if (loaderInfo.mStarted) {
                    if (!loaderInfo.mDeliveredData) {
                        i2 = 1;
                        z3 = i2 | z2;
                        i3 = i + 1;
                        if (!z) {
                            i = i3;
                            z2 = z3;
                        } else {
                            try {
                                return z3;
                            }
                        }
                    }
                }
                i2 = 0;
                z3 = i2 | z2;
                i3 = i + 1;
                if (!z) {
                    return z3;
                }
                i = i3;
                z2 = z3;
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        return z2;
    }

    void doRetain() {
        boolean z = FragmentActivity.a;
        try {
            if (DEBUG) {
                Log.v(z[2], z[0] + this);
            }
            if (this.mStarted) {
                this.mRetaining = true;
                this.mStarted = false;
                int size = this.mLoaders.size() - 1;
                while (size >= 0) {
                    ((LoaderInfo) this.mLoaders.valueAt(size)).retain();
                    int i = size - 1;
                    if (!z) {
                        size = i;
                    } else {
                        return;
                    }
                }
                return;
            }
            Throwable runtimeException = new RuntimeException(z[3]);
            runtimeException.fillInStackTrace();
            Log.w(z[1], z[4] + this, runtimeException);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    void doReportNextStart() {
        boolean z = FragmentActivity.a;
        int size = this.mLoaders.size() - 1;
        while (size >= 0) {
            ((LoaderInfo) this.mLoaders.valueAt(size)).mReportNextStart = true;
            int i = size - 1;
            if (!z) {
                size = i;
            } else {
                return;
            }
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        boolean z = FragmentActivity.a;
        if (this.mLoaders.size() > 0) {
            printWriter.print(str);
            printWriter.println(z[17]);
            String str2 = str + z[18];
            int i2 = 0;
            while (i2 < this.mLoaders.size()) {
                LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.valueAt(i2);
                printWriter.print(str);
                printWriter.print(z[19]);
                printWriter.print(this.mLoaders.keyAt(i2));
                printWriter.print(z[14]);
                printWriter.println(loaderInfo.toString());
                loaderInfo.dump(str2, fileDescriptor, printWriter, strArr);
                int i3 = i2 + 1;
                if (z) {
                    break;
                }
                i2 = i3;
            }
        }
        if (this.mInactiveLoaders.size() > 0) {
            printWriter.print(str);
            printWriter.println(z[15]);
            String str3 = str + z[21];
            while (i < this.mInactiveLoaders.size()) {
                loaderInfo = (LoaderInfo) this.mInactiveLoaders.valueAt(i);
                printWriter.print(str);
                printWriter.print(z[16]);
                printWriter.print(this.mInactiveLoaders.keyAt(i));
                printWriter.print(z[20]);
                printWriter.println(loaderInfo.toString());
                loaderInfo.dump(str3, fileDescriptor, printWriter, strArr);
                i++;
                if (z) {
                    return;
                }
            }
        }
    }

    void finishRetain() {
        boolean z = FragmentActivity.a;
        try {
            if (this.mRetaining) {
                if (DEBUG) {
                    Log.v(z[8], z[9] + this);
                }
                this.mRetaining = false;
                int size = this.mLoaders.size() - 1;
                while (size >= 0) {
                    ((LoaderInfo) this.mLoaders.valueAt(size)).finishRetain();
                    int i = size - 1;
                    if (!z) {
                        size = i;
                    } else {
                        return;
                    }
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
    public android.support.v4.content.Loader initLoader(int r6, android.os.Bundle r7, android.support.v4.app.LoaderManager.LoaderCallbacks r8) {
        /*
        r5_this = this;
        r0 = r5.mCreatingLoader;	 Catch:{ IllegalStateException -> 0x0010 }
        if (r0 == 0) goto L_0x0012;
    L_0x0004:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0010 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0010 }
        r2 = 51;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0010 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0010 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0010 }
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r0 = r5.mLoaders;
        r0 = r0.get(r6);
        r0 = (android.support.v4.app.LoaderManagerImpl.LoaderInfo) r0;
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x00b2 }
        if (r1 == 0) goto L_0x004c;
    L_0x001e:
        r1 = z;	 Catch:{ IllegalStateException -> 0x00b2 }
        r2 = 53;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00b2 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00b2 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x00b2 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x00b2 }
        r4 = 47;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00b2 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00b2 }
        r2 = r2.append(r5);	 Catch:{ IllegalStateException -> 0x00b2 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x00b2 }
        r4 = 52;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00b2 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00b2 }
        r2 = r2.append(r7);	 Catch:{ IllegalStateException -> 0x00b2 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x00b2 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalStateException -> 0x00b2 }
    L_0x004c:
        if (r0 != 0) goto L_0x007a;
    L_0x004e:
        r0 = r5.createAndInstallLoader(r6, r7, r8);
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x00b4 }
        if (r1 == 0) goto L_0x00a0;
    L_0x0056:
        r1 = z;	 Catch:{ IllegalStateException -> 0x00b6 }
        r2 = 48;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00b6 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00b6 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x00b6 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x00b6 }
        r4 = 46;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00b6 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00b6 }
        r2 = r2.append(r0);	 Catch:{ IllegalStateException -> 0x00b6 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x00b6 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalStateException -> 0x00b6 }
        r1 = android.support.v4.app.FragmentActivity.a;	 Catch:{ IllegalStateException -> 0x00b6 }
        if (r1 == 0) goto L_0x00a0;
    L_0x007a:
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x00b8 }
        if (r1 == 0) goto L_0x009e;
    L_0x007e:
        r1 = z;	 Catch:{ IllegalStateException -> 0x00b8 }
        r2 = 49;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00b8 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00b8 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x00b8 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x00b8 }
        r4 = 50;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00b8 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00b8 }
        r2 = r2.append(r0);	 Catch:{ IllegalStateException -> 0x00b8 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x00b8 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalStateException -> 0x00b8 }
    L_0x009e:
        r0.mCallbacks = r8;
    L_0x00a0:
        r1 = r0.mHaveData;	 Catch:{ IllegalStateException -> 0x00ba }
        if (r1 == 0) goto L_0x00af;
    L_0x00a4:
        r1 = r5.mStarted;	 Catch:{ IllegalStateException -> 0x00bc }
        if (r1 == 0) goto L_0x00af;
    L_0x00a8:
        r1 = r0.mLoader;	 Catch:{ IllegalStateException -> 0x00bc }
        r2 = r0.mData;	 Catch:{ IllegalStateException -> 0x00bc }
        r0.callOnLoadFinished(r1, r2);	 Catch:{ IllegalStateException -> 0x00bc }
    L_0x00af:
        r0 = r0.mLoader;
        return r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b8 }
    L_0x00b8:
        r0 = move-exception;
        throw r0;
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LoaderManagerImpl.initLoader(int, android.os.Bundle, android.support.v4.app.LoaderManager$LoaderCallbacks):android.support.v4.content.Loader");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v4.content.Loader restartLoader(int r9, android.os.Bundle r10, android.support.v4.app.LoaderManager.LoaderCallbacks r11) {
        /*
        r8_this = this;
        r7 = 0;
        r2 = android.support.v4.app.FragmentActivity.a;
        r0 = r8.mCreatingLoader;	 Catch:{ IllegalStateException -> 0x0013 }
        if (r0 == 0) goto L_0x0015;
    L_0x0007:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0013 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0013 }
        r2 = 25;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0013 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0013 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0013 }
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r0 = r8.mLoaders;
        r0 = r0.get(r9);
        r0 = (android.support.v4.app.LoaderManagerImpl.LoaderInfo) r0;
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x0106 }
        if (r1 == 0) goto L_0x004f;
    L_0x0021:
        r1 = z;	 Catch:{ IllegalStateException -> 0x0106 }
        r3 = 33;
        r1 = r1[r3];	 Catch:{ IllegalStateException -> 0x0106 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0106 }
        r3.<init>();	 Catch:{ IllegalStateException -> 0x0106 }
        r4 = z;	 Catch:{ IllegalStateException -> 0x0106 }
        r5 = 23;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0106 }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x0106 }
        r3 = r3.append(r8);	 Catch:{ IllegalStateException -> 0x0106 }
        r4 = z;	 Catch:{ IllegalStateException -> 0x0106 }
        r5 = 27;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0106 }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x0106 }
        r3 = r3.append(r10);	 Catch:{ IllegalStateException -> 0x0106 }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x0106 }
        android.util.Log.v(r1, r3);	 Catch:{ IllegalStateException -> 0x0106 }
    L_0x004f:
        if (r0 == 0) goto L_0x0148;
    L_0x0051:
        r1 = r8.mInactiveLoaders;
        r1 = r1.get(r9);
        r1 = (android.support.v4.app.LoaderManagerImpl.LoaderInfo) r1;
        if (r1 == 0) goto L_0x011a;
    L_0x005b:
        r3 = r0.mHaveData;	 Catch:{ IllegalStateException -> 0x0108 }
        if (r3 == 0) goto L_0x0095;
    L_0x005f:
        r3 = DEBUG;	 Catch:{ IllegalStateException -> 0x010a }
        if (r3 == 0) goto L_0x0083;
    L_0x0063:
        r3 = z;	 Catch:{ IllegalStateException -> 0x010a }
        r4 = 30;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x010a }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x010a }
        r4.<init>();	 Catch:{ IllegalStateException -> 0x010a }
        r5 = z;	 Catch:{ IllegalStateException -> 0x010a }
        r6 = 32;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x010a }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x010a }
        r4 = r4.append(r0);	 Catch:{ IllegalStateException -> 0x010a }
        r4 = r4.toString();	 Catch:{ IllegalStateException -> 0x010a }
        android.util.Log.v(r3, r4);	 Catch:{ IllegalStateException -> 0x010a }
    L_0x0083:
        r3 = 0;
        r1.mDeliveredData = r3;	 Catch:{ IllegalStateException -> 0x010c }
        r1.destroy();	 Catch:{ IllegalStateException -> 0x010c }
        r1 = r0.mLoader;	 Catch:{ IllegalStateException -> 0x010c }
        r1.abandon();	 Catch:{ IllegalStateException -> 0x010c }
        r1 = r8.mInactiveLoaders;	 Catch:{ IllegalStateException -> 0x010c }
        r1.put(r9, r0);	 Catch:{ IllegalStateException -> 0x010c }
        if (r2 == 0) goto L_0x0148;
    L_0x0095:
        r1 = r0.mStarted;	 Catch:{ IllegalStateException -> 0x010e }
        if (r1 != 0) goto L_0x00b7;
    L_0x0099:
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x0110 }
        if (r1 == 0) goto L_0x00ac;
    L_0x009d:
        r1 = z;	 Catch:{ IllegalStateException -> 0x0110 }
        r3 = 34;
        r1 = r1[r3];	 Catch:{ IllegalStateException -> 0x0110 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0110 }
        r4 = 26;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0110 }
        android.util.Log.v(r1, r3);	 Catch:{ IllegalStateException -> 0x0110 }
    L_0x00ac:
        r1 = r8.mLoaders;	 Catch:{ IllegalStateException -> 0x0112 }
        r3 = 0;
        r1.put(r9, r3);	 Catch:{ IllegalStateException -> 0x0112 }
        r0.destroy();	 Catch:{ IllegalStateException -> 0x0112 }
        if (r2 == 0) goto L_0x0148;
    L_0x00b7:
        r1 = r0.mPendingLoader;	 Catch:{ IllegalStateException -> 0x0114 }
        if (r1 == 0) goto L_0x00e8;
    L_0x00bb:
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x0116 }
        if (r1 == 0) goto L_0x00e1;
    L_0x00bf:
        r1 = z;	 Catch:{ IllegalStateException -> 0x0116 }
        r2 = 22;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0116 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0116 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0116 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0116 }
        r4 = 28;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0116 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0116 }
        r3 = r0.mPendingLoader;	 Catch:{ IllegalStateException -> 0x0116 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0116 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0116 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalStateException -> 0x0116 }
    L_0x00e1:
        r1 = r0.mPendingLoader;
        r1.destroy();
        r0.mPendingLoader = r7;
    L_0x00e8:
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x0118 }
        if (r1 == 0) goto L_0x00fb;
    L_0x00ec:
        r1 = z;	 Catch:{ IllegalStateException -> 0x0118 }
        r2 = 35;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0118 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0118 }
        r3 = 31;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0118 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalStateException -> 0x0118 }
    L_0x00fb:
        r1 = r8.createLoader(r9, r10, r11);
        r0.mPendingLoader = r1;
        r0 = r0.mPendingLoader;
        r0 = r0.mLoader;
    L_0x0105:
        return r0;
    L_0x0106:
        r0 = move-exception;
        throw r0;
    L_0x0108:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x010a }
    L_0x010a:
        r0 = move-exception;
        throw r0;
    L_0x010c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x010e }
    L_0x010e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0110 }
    L_0x0110:
        r0 = move-exception;
        throw r0;
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0114 }
    L_0x0114:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0116 }
    L_0x0116:
        r0 = move-exception;
        throw r0;
    L_0x0118:
        r0 = move-exception;
        throw r0;
    L_0x011a:
        r1 = DEBUG;	 Catch:{ IllegalStateException -> 0x014f }
        if (r1 == 0) goto L_0x013e;
    L_0x011e:
        r1 = z;	 Catch:{ IllegalStateException -> 0x014f }
        r2 = 29;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x014f }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x014f }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x014f }
        r3 = z;	 Catch:{ IllegalStateException -> 0x014f }
        r4 = 24;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x014f }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x014f }
        r2 = r2.append(r0);	 Catch:{ IllegalStateException -> 0x014f }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x014f }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalStateException -> 0x014f }
    L_0x013e:
        r1 = r0.mLoader;
        r1.abandon();
        r1 = r8.mInactiveLoaders;
        r1.put(r9, r0);
    L_0x0148:
        r0 = r8.createAndInstallLoader(r9, r10, r11);
        r0 = r0.mLoader;
        goto L_0x0105;
    L_0x014f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LoaderManagerImpl.restartLoader(int, android.os.Bundle, android.support.v4.app.LoaderManager$LoaderCallbacks):android.support.v4.content.Loader");
    }

    public Loader getLoader(int i) {
        try {
            if (this.mCreatingLoader) {
                throw new IllegalStateException(z[45]);
            }
            LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.get(i);
            if (loaderInfo == null) {
                return null;
            }
            try {
                return loaderInfo.mPendingLoader != null ? loaderInfo.mPendingLoader.mLoader : loaderInfo.mLoader;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }
}
