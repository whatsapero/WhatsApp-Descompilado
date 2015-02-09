package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements OnTabChangeListener {
    private static final String[] z;
    private boolean mAttached;
    private int mContainerId;
    private Context mContext;
    private FragmentManager mFragmentManager;
    private TabInfo mLastTab;
    private OnTabChangeListener mOnTabChangeListener;
    private final ArrayList mTabs;

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        private static final String[] z;
        String curTab;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.curTab = parcel.readString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.curTab);
        }

        public String toString() {
            return z[0] + Integer.toHexString(System.identityHashCode(this)) + z[1] + this.curTab + "}";
        }

        SavedState(Parcel parcel, AnonymousClass_1 anonymousClass_1) {
            this(parcel);
        }

        static {
            /* JADX: method processing error */
/*
            Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
            /*
            r1 = 0;
            r0 = 2;
            r3 = new java.lang.String[r0];
            r2 = "K\u001ej=2h\u0002\u007f\u000e>o$d)+#?j,:i?\u007f;+h\u0017";
            r0 = -1;
            r4 = r3;
            r5 = r3;
            r3 = r1;
        L_0x000a:
            r2 = r2.toCharArray();
            r6 = r2.length;
            r7 = r6;
            r8 = r1;
            r6 = r2;
        L_0x0012:
            if (r7 > r8) goto L_0x0036;
        L_0x0014:
            r2 = new java.lang.String;
            r2.<init>(r6);
            r2 = r2.intern();
            switch(r0) {
                case 0: goto L_0x002a;
                default: goto L_0x0020;
            };
        L_0x0020:
            r4[r3] = r2;
            r2 = 1;
            r0 = "-\u000f~(\u000bl\u000e6";
            r3 = r2;
            r4 = r5;
            r2 = r0;
            r0 = r1;
            goto L_0x000a;
        L_0x002a:
            r4[r3] = r2;
            z = r5;
            r0 = new android.support.v4.app.FragmentTabHost$SavedState$1;
            r0.<init>();
            CREATOR = r0;
            return;
        L_0x0036:
            r9 = r6[r8];
            r2 = r8 % 5;
            switch(r2) {
                case 0: goto L_0x0047;
                case 1: goto L_0x004a;
                case 2: goto L_0x004d;
                case 3: goto L_0x0050;
                default: goto L_0x003d;
            };
        L_0x003d:
            r2 = 95;
        L_0x003f:
            r2 = r2 ^ r9;
            r2 = (char) r2;
            r6[r8] = r2;
            r2 = r8 + 1;
            r8 = r2;
            goto L_0x0012;
        L_0x0047:
            r2 = 13;
            goto L_0x003f;
        L_0x004a:
            r2 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
            goto L_0x003f;
        L_0x004d:
            r2 = 11;
            goto L_0x003f;
        L_0x0050:
            r2 = 90;
            goto L_0x003f;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentTabHost.SavedState.<clinit>():void");
        }
    }

    final class TabInfo {
        private final Bundle args;
        private final Class clss;
        private Fragment fragment;
        private final String tag;

        static Fragment access$100(TabInfo tabInfo) {
            return tabInfo.fragment;
        }

        static Class access$300(TabInfo tabInfo) {
            return tabInfo.clss;
        }

        static Bundle access$400(TabInfo tabInfo) {
            return tabInfo.args;
        }

        static String access$200(TabInfo tabInfo) {
            return tabInfo.tag;
        }

        static Fragment access$102(TabInfo tabInfo, Fragment fragment) {
            tabInfo.fragment = fragment;
            return fragment;
        }
    }

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
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
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "SH^?/\u007f\u0007\u0015%!jI^-!o\u0007\n*)=";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r6 = r2.length;
        r7 = r6;
        r8 = r1;
        r6 = r2;
    L_0x0012:
        if (r7 > r8) goto L_0x002f;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "PR\r?n~F\u0012'nnB\n>>5\u000e^?&|S^?/vB\rk/=d\u0011%:x_\nk/sC^\r<|@\u0013. ij\u001f%/zB\f";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x002f:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0046;
            case 3: goto L_0x0049;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 78;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 29;
        goto L_0x0038;
    L_0x0043:
        r2 = 39;
        goto L_0x0038;
    L_0x0046:
        r2 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        goto L_0x0038;
    L_0x0049:
        r2 = 75;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentTabHost.<clinit>():void");
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.mOnTabChangeListener = onTabChangeListener;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.v4.app.FragmentTransaction doTabChanged(java.lang.String r6, android.support.v4.app.FragmentTransaction r7) {
        /*
        r5_this = this;
        r0 = 0;
        r3 = android.support.v4.app.FragmentActivity.a;
        r1 = 0;
        r2 = r1;
        r1 = r0;
    L_0x0006:
        r0 = r5.mTabs;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x0025;
    L_0x000e:
        r0 = r5.mTabs;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.FragmentTabHost.TabInfo) r0;
        r4 = android.support.v4.app.FragmentTabHost.TabInfo.access$200(r0);
        r4 = r4.equals(r6);
        if (r4 == 0) goto L_0x0021;
    L_0x0020:
        r2 = r0;
    L_0x0021:
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x00a6;
    L_0x0025:
        if (r2 != 0) goto L_0x0045;
    L_0x0027:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0043 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0043 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0043 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0043 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0043 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0043 }
        r1 = r1.append(r6);	 Catch:{ IllegalStateException -> 0x0043 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0043 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0043 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r0 = r5.mLastTab;	 Catch:{ IllegalStateException -> 0x009c }
        if (r0 == r2) goto L_0x009b;
    L_0x0049:
        if (r7 != 0) goto L_0x0051;
    L_0x004b:
        r0 = r5.mFragmentManager;
        r7 = r0.beginTransaction();
    L_0x0051:
        r0 = r5.mLastTab;	 Catch:{ IllegalStateException -> 0x009e }
        if (r0 == 0) goto L_0x0066;
    L_0x0055:
        r0 = r5.mLastTab;	 Catch:{ IllegalStateException -> 0x00a0 }
        r0 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r0);	 Catch:{ IllegalStateException -> 0x00a0 }
        if (r0 == 0) goto L_0x0066;
    L_0x005d:
        r0 = r5.mLastTab;	 Catch:{ IllegalStateException -> 0x00a0 }
        r0 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r0);	 Catch:{ IllegalStateException -> 0x00a0 }
        r7.detach(r0);	 Catch:{ IllegalStateException -> 0x00a0 }
    L_0x0066:
        if (r2 == 0) goto L_0x0099;
    L_0x0068:
        r0 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r2);	 Catch:{ IllegalStateException -> 0x00a2 }
        if (r0 != 0) goto L_0x0092;
    L_0x006e:
        r0 = r5.mContext;	 Catch:{ IllegalStateException -> 0x00a4 }
        r1 = android.support.v4.app.FragmentTabHost.TabInfo.access$300(r2);	 Catch:{ IllegalStateException -> 0x00a4 }
        r1 = r1.getName();	 Catch:{ IllegalStateException -> 0x00a4 }
        r4 = android.support.v4.app.FragmentTabHost.TabInfo.access$400(r2);	 Catch:{ IllegalStateException -> 0x00a4 }
        r0 = android.support.v4.app.Fragment.instantiate(r0, r1, r4);	 Catch:{ IllegalStateException -> 0x00a4 }
        android.support.v4.app.FragmentTabHost.TabInfo.access$102(r2, r0);	 Catch:{ IllegalStateException -> 0x00a4 }
        r0 = r5.mContainerId;	 Catch:{ IllegalStateException -> 0x00a4 }
        r1 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r2);	 Catch:{ IllegalStateException -> 0x00a4 }
        r4 = android.support.v4.app.FragmentTabHost.TabInfo.access$200(r2);	 Catch:{ IllegalStateException -> 0x00a4 }
        r7.add(r0, r1, r4);	 Catch:{ IllegalStateException -> 0x00a4 }
        if (r3 == 0) goto L_0x0099;
    L_0x0092:
        r0 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r2);	 Catch:{ IllegalStateException -> 0x00a4 }
        r7.attach(r0);	 Catch:{ IllegalStateException -> 0x00a4 }
    L_0x0099:
        r5.mLastTab = r2;
    L_0x009b:
        return r7;
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a4 }
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r1 = r0;
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentTabHost.doTabChanged(java.lang.String, android.support.v4.app.FragmentTransaction):android.support.v4.app.FragmentTransaction");
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        this.mTabs = new ArrayList();
        initFragmentTabHost(context, null);
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTabs = new ArrayList();
        initFragmentTabHost(context, attributeSet);
    }

    public void onTabChanged(String str) {
        if (this.mAttached) {
            FragmentTransaction doTabChanged = doTabChanged(str, null);
            if (doTabChanged != null) {
                try {
                    doTabChanged.commit();
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        }
        try {
            if (this.mOnTabChangeListener != null) {
                this.mOnTabChangeListener.onTabChanged(str);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.curTab = getCurrentTabTag();
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.curTab);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onAttachedToWindow() {
        /*
        r7_this = this;
        r3 = android.support.v4.app.FragmentActivity.a;
        super.onAttachedToWindow();
        r4 = r7.getCurrentTabTag();
        r1 = 0;
        r0 = 0;
        r2 = r0;
    L_0x000c:
        r0 = r7.mTabs;
        r0 = r0.size();
        if (r2 >= r0) goto L_0x005a;
    L_0x0014:
        r0 = r7.mTabs;
        r0 = r0.get(r2);
        r0 = (android.support.v4.app.FragmentTabHost.TabInfo) r0;
        r5 = r7.mFragmentManager;	 Catch:{ IllegalStateException -> 0x006c }
        r6 = android.support.v4.app.FragmentTabHost.TabInfo.access$200(r0);	 Catch:{ IllegalStateException -> 0x006c }
        r5 = r5.findFragmentByTag(r6);	 Catch:{ IllegalStateException -> 0x006c }
        android.support.v4.app.FragmentTabHost.TabInfo.access$102(r0, r5);	 Catch:{ IllegalStateException -> 0x006c }
        r5 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r0);	 Catch:{ IllegalStateException -> 0x006c }
        if (r5 == 0) goto L_0x0056;
    L_0x002f:
        r5 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r0);	 Catch:{ IllegalStateException -> 0x006e }
        r5 = r5.isDetached();	 Catch:{ IllegalStateException -> 0x006e }
        if (r5 != 0) goto L_0x0056;
    L_0x0039:
        r5 = android.support.v4.app.FragmentTabHost.TabInfo.access$200(r0);	 Catch:{ IllegalStateException -> 0x0070 }
        r5 = r5.equals(r4);	 Catch:{ IllegalStateException -> 0x0070 }
        if (r5 == 0) goto L_0x0047;
    L_0x0043:
        r7.mLastTab = r0;	 Catch:{ IllegalStateException -> 0x0072 }
        if (r3 == 0) goto L_0x0056;
    L_0x0047:
        if (r1 != 0) goto L_0x004f;
    L_0x0049:
        r1 = r7.mFragmentManager;
        r1 = r1.beginTransaction();
    L_0x004f:
        r0 = android.support.v4.app.FragmentTabHost.TabInfo.access$100(r0);
        r1.detach(r0);
    L_0x0056:
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x0076;
    L_0x005a:
        r0 = 1;
        r7.mAttached = r0;
        r0 = r7.doTabChanged(r4, r1);
        if (r0 == 0) goto L_0x006b;
    L_0x0063:
        r0.commit();	 Catch:{ IllegalStateException -> 0x0074 }
        r0 = r7.mFragmentManager;	 Catch:{ IllegalStateException -> 0x0074 }
        r0.executePendingTransactions();	 Catch:{ IllegalStateException -> 0x0074 }
    L_0x006b:
        return;
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r2 = r0;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentTabHost.onAttachedToWindow():void");
    }

    private void initFragmentTabHost(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.mContainerId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException(z[1]);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mAttached = false;
    }
}
