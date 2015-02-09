package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

final class FragmentState implements Parcelable {
    public static final Creator CREATOR;
    private static final String[] z;
    final Bundle mArguments;
    final String mClassName;
    final int mContainerId;
    final boolean mDetached;
    final int mFragmentId;
    final boolean mFromLayout;
    final int mIndex;
    Fragment mInstance;
    final boolean mRetainInstance;
    Bundle mSavedFragmentState;
    final String mTag;

    public FragmentState(Fragment fragment) {
        this.mClassName = fragment.getClass().getName();
        this.mIndex = fragment.mIndex;
        this.mFromLayout = fragment.mFromLayout;
        this.mFragmentId = fragment.mFragmentId;
        this.mContainerId = fragment.mContainerId;
        this.mTag = fragment.mTag;
        this.mRetainInstance = fragment.mRetainInstance;
        this.mDetached = fragment.mDetached;
        this.mArguments = fragment.mArguments;
    }

    public Fragment instantiate(FragmentActivity fragmentActivity, Fragment fragment) {
        if (this.mInstance != null) {
            return this.mInstance;
        }
        if (this.mArguments != null) {
            this.mArguments.setClassLoader(fragmentActivity.getClassLoader());
        }
        this.mInstance = Fragment.instantiate(fragmentActivity, this.mClassName, this.mArguments);
        if (this.mSavedFragmentState != null) {
            this.mSavedFragmentState.setClassLoader(fragmentActivity.getClassLoader());
            this.mInstance.mSavedFragmentState = this.mSavedFragmentState;
        }
        this.mInstance.setIndex(this.mIndex, fragment);
        this.mInstance.mFromLayout = this.mFromLayout;
        this.mInstance.mRestored = true;
        this.mInstance.mFragmentId = this.mFragmentId;
        this.mInstance.mContainerId = this.mContainerId;
        this.mInstance.mTag = this.mTag;
        this.mInstance.mRetainInstance = this.mRetainInstance;
        this.mInstance.mDetached = this.mDetached;
        this.mInstance.mFragmentManager = fragmentActivity.mFragments;
        if (FragmentManagerImpl.DEBUG) {
            Log.v(z[0], z[1] + this.mInstance);
        }
        return this.mInstance;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3 = 1;
        parcel.writeString(this.mClassName);
        parcel.writeInt(this.mIndex);
        if (this.mFromLayout) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.mFragmentId);
        parcel.writeInt(this.mContainerId);
        parcel.writeString(this.mTag);
        if (this.mRetainInstance) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (!this.mDetached) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeBundle(this.mArguments);
        parcel.writeBundle(this.mSavedFragmentState);
    }

    public FragmentState(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.mClassName = parcel.readString();
        this.mIndex = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mFromLayout = z;
        this.mFragmentId = parcel.readInt();
        this.mContainerId = parcel.readInt();
        this.mTag = parcel.readString();
        this.mRetainInstance = parcel.readInt() != 0;
        if (parcel.readInt() == 0) {
            z2 = false;
        }
        this.mDetached = z2;
        this.mArguments = parcel.readBundle();
        this.mSavedFragmentState = parcel.readBundle();
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
        r2 = "\u001f\u0001v4}<\u001dc\u001eq7\u0012p6b";
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
        r0 = "\u0010\u001dd'q7\u0007~2d<\u001775b8\u0014z6~-S";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        r0 = new android.support.v4.app.FragmentState$1;
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
        r2 = 16;
    L_0x003f:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0047:
        r2 = 89;
        goto L_0x003f;
    L_0x004a:
        r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x003f;
    L_0x004d:
        r2 = 23;
        goto L_0x003f;
    L_0x0050:
        r2 = 83;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentState.<clinit>():void");
    }

    public int describeContents() {
        return 0;
    }
}
