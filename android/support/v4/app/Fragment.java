package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SimpleArrayMap;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.whatsapp.vk;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener {
    static final Object USE_DEFAULT_TRANSITION;
    public static int a;
    private static final SimpleArrayMap sClassMap;
    private static final String[] z;
    FragmentActivity mActivity;
    boolean mAdded;
    Boolean mAllowEnterTransitionOverlap;
    Boolean mAllowReturnTransitionOverlap;
    View mAnimatingAway;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    boolean mCheckedForLoaderManager;
    FragmentManagerImpl mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    Object mEnterTransition;
    SharedElementCallback mEnterTransitionCallback;
    Object mExitTransition;
    SharedElementCallback mExitTransitionCallback;
    int mFragmentId;
    FragmentManagerImpl mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mInLayout;
    int mIndex;
    View mInnerView;
    LoaderManagerImpl mLoaderManager;
    boolean mLoadersStarted;
    boolean mMenuVisible;
    int mNextAnim;
    Fragment mParentFragment;
    Object mReenterTransition;
    boolean mRemoving;
    boolean mRestored;
    boolean mResumed;
    boolean mRetainInstance;
    boolean mRetaining;
    Object mReturnTransition;
    Bundle mSavedFragmentState;
    SparseArray mSavedViewState;
    Object mSharedElementEnterTransition;
    Object mSharedElementReturnTransition;
    int mState;
    int mStateAfterAnimating;
    String mTag;
    Fragment mTarget;
    int mTargetIndex;
    int mTargetRequestCode;
    boolean mUserVisibleHint;
    View mView;
    String mWho;

    public class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exception) {
            super(str, exception);
        }
    }

    public class SavedState implements Parcelable {
        public static final Creator CREATOR;
        final Bundle mState;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.mState = parcel.readBundle();
            if (classLoader != null && this.mState != null) {
                this.mState.setClassLoader(classLoader);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.mState);
        }

        SavedState(Bundle bundle) {
            this.mState = bundle;
        }

        static {
            CREATOR = new Creator() {
                public android.support.v4.app.Fragment.SavedState[] newArray(int i) {
                    return new android.support.v4.app.Fragment.SavedState[i];
                }

                public Object createFromParcel(Parcel parcel) {
                    return createFromParcel(parcel);
                }

                public android.support.v4.app.Fragment.SavedState createFromParcel(Parcel parcel) {
                    return new android.support.v4.app.Fragment.SavedState(parcel, null);
                }

                public Object[] newArray(int i) {
                    return newArray(i);
                }
            };
        }

        public int describeContents() {
            return 0;
        }
    }

    void performLowMemory() {
        try {
            onLowMemory();
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchLowMemory();
            }
        } catch (InstantiationException e) {
            throw e;
        }
    }

    static boolean isSupportFragmentClass(Context context, String str) {
        try {
            Class cls = (Class) sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    final void restoreViewState(Bundle bundle) {
        try {
            if (this.mSavedViewState != null) {
                this.mInnerView.restoreHierarchyState(this.mSavedViewState);
                this.mSavedViewState = null;
            }
            try {
                this.mCalled = false;
                onViewStateRestored(bundle);
                if (!this.mCalled) {
                    throw new SuperNotCalledException(z[77] + this + z[78]);
                }
            } catch (InstantiationException e) {
                throw e;
            }
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    void performConfigurationChanged(Configuration configuration) {
        try {
            onConfigurationChanged(configuration);
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchConfigurationChanged(configuration);
            }
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void setArguments(Bundle bundle) {
        try {
            if (this.mIndex >= 0) {
                throw new IllegalStateException(z[74]);
            }
            this.mArguments = bundle;
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mArguments = bundle;
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            throw e;
        } catch (Exception e2) {
            throw new InstantiationException(z[13] + str + z[10] + z[14], e2);
        } catch (Exception e22) {
            throw new InstantiationException(z[15] + str + z[11] + z[17], e22);
        } catch (Exception e222) {
            throw new InstantiationException(z[16] + str + z[18] + z[12], e222);
        }
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LoaderManager getLoaderManager() {
        try {
            if (this.mLoaderManager != null) {
                return this.mLoaderManager;
            }
            try {
                if (this.mActivity == null) {
                    throw new IllegalStateException(z[58] + this + z[59]);
                }
                this.mCheckedForLoaderManager = true;
                this.mLoaderManager = this.mActivity.getLoaderManager(this.mWho, this.mLoadersStarted, true);
                return this.mLoaderManager;
            } catch (InstantiationException e) {
                throw e;
            }
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    void performResume() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.noteStateNotSaved();
                this.mChildFragmentManager.execPendingActions();
            }
            try {
                this.mCalled = false;
                onResume();
                if (this.mCalled) {
                    try {
                        if (this.mChildFragmentManager != null) {
                            this.mChildFragmentManager.dispatchResume();
                            this.mChildFragmentManager.execPendingActions();
                            return;
                        }
                        return;
                    } catch (InstantiationException e) {
                        throw e;
                    }
                }
                throw new SuperNotCalledException(z[0] + this + z[1]);
            } catch (InstantiationException e2) {
                throw e2;
            }
        } catch (InstantiationException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setUserVisibleHint(boolean r3) {
        /*
        r2_this = this;
        r0 = r2.mUserVisibleHint;	 Catch:{ InstantiationException -> 0x0018 }
        if (r0 != 0) goto L_0x0010;
    L_0x0004:
        if (r3 == 0) goto L_0x0010;
    L_0x0006:
        r0 = r2.mState;	 Catch:{ InstantiationException -> 0x001c }
        r1 = 4;
        if (r0 >= r1) goto L_0x0010;
    L_0x000b:
        r0 = r2.mFragmentManager;	 Catch:{ InstantiationException -> 0x001c }
        r0.performPendingDeferredStart(r2);	 Catch:{ InstantiationException -> 0x001c }
    L_0x0010:
        r2.mUserVisibleHint = r3;	 Catch:{ InstantiationException -> 0x001e }
        if (r3 != 0) goto L_0x0020;
    L_0x0014:
        r0 = 1;
    L_0x0015:
        r2.mDeferStart = r0;
        return;
    L_0x0018:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r0 = 0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.Fragment.setUserVisibleHint(boolean):void");
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
    }

    public Object getReenterTransition() {
        try {
            return this.mReenterTransition == USE_DEFAULT_TRANSITION ? getExitTransition() : this.mReenterTransition;
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public Object getReturnTransition() {
        try {
            return this.mReturnTransition == USE_DEFAULT_TRANSITION ? getEnterTransition() : this.mReturnTransition;
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public void onStart() {
        try {
            this.mCalled = true;
            if (!this.mLoadersStarted) {
                this.mLoadersStarted = true;
                if (!this.mCheckedForLoaderManager) {
                    this.mCheckedForLoaderManager = true;
                    this.mLoaderManager = this.mActivity.getLoaderManager(this.mWho, this.mLoadersStarted, false);
                }
                try {
                    if (this.mLoaderManager != null) {
                        this.mLoaderManager.doStart();
                    }
                } catch (InstantiationException e) {
                    throw e;
                }
            }
        } catch (InstantiationException e2) {
            throw e2;
        } catch (InstantiationException e22) {
            throw e22;
        }
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public final boolean isResumed() {
        return this.mResumed;
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        try {
            if (this.mHidden) {
                return false;
            }
            if (this.mHasMenu && this.mMenuVisible) {
                z = true;
                onCreateOptionsMenu(menu, menuInflater);
            }
            return this.mChildFragmentManager != null ? z | this.mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuInflater) : z;
        } catch (InstantiationException e) {
            throw e;
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.v4.app.FragmentManager getChildFragmentManager() {
        /*
        r3_this = this;
        r0 = android.support.v4.app.FragmentActivity.a;
        r1 = r3.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x003a }
        if (r1 != 0) goto L_0x0037;
    L_0x0006:
        r3.instantiateChildFragmentManager();	 Catch:{ InstantiationException -> 0x003c }
        r1 = r3.mState;	 Catch:{ InstantiationException -> 0x003c }
        r2 = 5;
        if (r1 < r2) goto L_0x0015;
    L_0x000e:
        r1 = r3.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x003e }
        r1.dispatchResume();	 Catch:{ InstantiationException -> 0x003e }
        if (r0 == 0) goto L_0x0037;
    L_0x0015:
        r1 = r3.mState;	 Catch:{ InstantiationException -> 0x0040 }
        r2 = 4;
        if (r1 < r2) goto L_0x0021;
    L_0x001a:
        r1 = r3.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x0042 }
        r1.dispatchStart();	 Catch:{ InstantiationException -> 0x0042 }
        if (r0 == 0) goto L_0x0037;
    L_0x0021:
        r1 = r3.mState;	 Catch:{ InstantiationException -> 0x0044 }
        r2 = 2;
        if (r1 < r2) goto L_0x002d;
    L_0x0026:
        r1 = r3.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x0046 }
        r1.dispatchActivityCreated();	 Catch:{ InstantiationException -> 0x0046 }
        if (r0 == 0) goto L_0x0037;
    L_0x002d:
        r0 = r3.mState;	 Catch:{ InstantiationException -> 0x0048 }
        r1 = 1;
        if (r0 < r1) goto L_0x0037;
    L_0x0032:
        r0 = r3.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x0048 }
        r0.dispatchCreate();	 Catch:{ InstantiationException -> 0x0048 }
    L_0x0037:
        r0 = r3.mChildFragmentManager;
        return r0;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.Fragment.getChildFragmentManager():android.support.v4.app.FragmentManager");
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void startActivityForResult(Intent intent, int i) {
        try {
            if (this.mActivity == null) {
                throw new IllegalStateException(z[66] + this + z[67]);
            }
            this.mActivity.startActivityFromFragment(this, intent, i);
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        try {
            DebugUtils.buildShortClassTag(this, stringBuilder);
            if (this.mIndex >= 0) {
                stringBuilder.append(z[7]);
                stringBuilder.append(this.mIndex);
            }
            try {
                if (this.mFragmentId != 0) {
                    stringBuilder.append(z[6]);
                    stringBuilder.append(Integer.toHexString(this.mFragmentId));
                }
                try {
                    if (this.mTag != null) {
                        stringBuilder.append(" ");
                        stringBuilder.append(this.mTag);
                    }
                    stringBuilder.append('}');
                    return stringBuilder.toString();
                } catch (InstantiationException e) {
                    throw e;
                }
            } catch (InstantiationException e2) {
                throw e2;
            }
        } catch (InstantiationException e22) {
            throw e22;
        }
    }

    void performStart() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.noteStateNotSaved();
                this.mChildFragmentManager.execPendingActions();
            }
            try {
                this.mCalled = false;
                onStart();
                if (this.mCalled) {
                    try {
                        if (this.mChildFragmentManager != null) {
                            this.mChildFragmentManager.dispatchStart();
                        }
                        try {
                            if (this.mLoaderManager != null) {
                                this.mLoaderManager.doReportStart();
                                return;
                            }
                            return;
                        } catch (InstantiationException e) {
                            throw e;
                        }
                    } catch (InstantiationException e2) {
                        throw e2;
                    }
                }
                throw new SuperNotCalledException(z[75] + this + z[76]);
            } catch (InstantiationException e22) {
                throw e22;
            }
        } catch (InstantiationException e222) {
            throw e222;
        }
    }

    void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mResumed = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mActivity = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
        this.mLoaderManager = null;
        this.mLoadersStarted = false;
        this.mCheckedForLoaderManager = false;
    }

    public boolean getAllowEnterTransitionOverlap() {
        try {
            return this.mAllowEnterTransitionOverlap == null ? true : this.mAllowEnterTransitionOverlap.booleanValue();
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public Object getSharedElementReturnTransition() {
        try {
            return this.mSharedElementReturnTransition == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : this.mSharedElementReturnTransition;
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public Object getSharedElementEnterTransition() {
        return this.mSharedElementEnterTransition;
    }

    public void onResume() {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.noteStateNotSaved();
            }
            try {
                this.mCalled = false;
                onActivityCreated(bundle);
                if (this.mCalled) {
                    try {
                        if (this.mChildFragmentManager != null) {
                            this.mChildFragmentManager.dispatchActivityCreated();
                            return;
                        }
                        return;
                    } catch (InstantiationException e) {
                        throw e;
                    }
                }
                throw new SuperNotCalledException(z[63] + this + z[62]);
            } catch (InstantiationException e2) {
                throw e2;
            }
        } catch (InstantiationException e22) {
            throw e22;
        }
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public final String getString(int i, Object[] objArr) {
        return getResources().getString(i, objArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void performOptionsMenuClosed(android.view.Menu r2) {
        /*
        r1_this = this;
        r0 = r1.mHidden;	 Catch:{ InstantiationException -> 0x0019 }
        if (r0 != 0) goto L_0x0018;
    L_0x0004:
        r0 = r1.mHasMenu;	 Catch:{ InstantiationException -> 0x001b }
        if (r0 == 0) goto L_0x000f;
    L_0x0008:
        r0 = r1.mMenuVisible;	 Catch:{ InstantiationException -> 0x001d }
        if (r0 == 0) goto L_0x000f;
    L_0x000c:
        r1.onOptionsMenuClosed(r2);	 Catch:{ InstantiationException -> 0x001d }
    L_0x000f:
        r0 = r1.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x001f }
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        r0 = r1.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x001f }
        r0.dispatchOptionsMenuClosed(r2);	 Catch:{ InstantiationException -> 0x001f }
    L_0x0018:
        return;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;
    L_0x001f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.Fragment.performOptionsMenuClosed(android.view.Menu):void");
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        try {
            if (this.mHidden) {
                return false;
            }
            if (this.mHasMenu && this.mMenuVisible) {
                z = true;
                onPrepareOptionsMenu(menu);
            }
            return this.mChildFragmentManager != null ? z | this.mChildFragmentManager.dispatchPrepareOptionsMenu(menu) : z;
        } catch (InstantiationException e) {
            throw e;
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    public void onDestroy() {
        try {
            this.mCalled = true;
            if (!this.mCheckedForLoaderManager) {
                this.mCheckedForLoaderManager = true;
                this.mLoaderManager = this.mActivity.getLoaderManager(this.mWho, this.mLoadersStarted, false);
            }
            try {
                if (this.mLoaderManager != null) {
                    this.mLoaderManager.doDestroy();
                }
            } catch (InstantiationException e) {
                throw e;
            }
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = this.mActivity.getLayoutInflater().cloneInContext(this.mActivity);
        getChildFragmentManager();
        cloneInContext.setFactory(this.mChildFragmentManager.getLayoutInflaterFactory());
        return cloneInContext;
    }

    public boolean getAllowReturnTransitionOverlap() {
        try {
            return this.mAllowReturnTransitionOverlap == null ? true : this.mAllowReturnTransitionOverlap.booleanValue();
        } catch (InstantiationException e) {
            throw e;
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void performReallyStop() {
        /*
        r4_this = this;
        r0 = r4.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x003d }
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r4.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x003d }
        r0.dispatchReallyStop();	 Catch:{ InstantiationException -> 0x003d }
    L_0x0009:
        r0 = r4.mLoadersStarted;	 Catch:{ InstantiationException -> 0x003f }
        if (r0 == 0) goto L_0x003c;
    L_0x000d:
        r0 = 0;
        r4.mLoadersStarted = r0;	 Catch:{ InstantiationException -> 0x0041 }
        r0 = r4.mCheckedForLoaderManager;	 Catch:{ InstantiationException -> 0x0041 }
        if (r0 != 0) goto L_0x0024;
    L_0x0014:
        r0 = 1;
        r4.mCheckedForLoaderManager = r0;	 Catch:{ InstantiationException -> 0x0041 }
        r0 = r4.mActivity;	 Catch:{ InstantiationException -> 0x0041 }
        r1 = r4.mWho;	 Catch:{ InstantiationException -> 0x0041 }
        r2 = r4.mLoadersStarted;	 Catch:{ InstantiationException -> 0x0041 }
        r3 = 0;
        r0 = r0.getLoaderManager(r1, r2, r3);	 Catch:{ InstantiationException -> 0x0041 }
        r4.mLoaderManager = r0;	 Catch:{ InstantiationException -> 0x0041 }
    L_0x0024:
        r0 = r4.mLoaderManager;	 Catch:{ InstantiationException -> 0x0043 }
        if (r0 == 0) goto L_0x003c;
    L_0x0028:
        r0 = r4.mActivity;	 Catch:{ InstantiationException -> 0x0045 }
        r0 = r0.mRetaining;	 Catch:{ InstantiationException -> 0x0045 }
        if (r0 != 0) goto L_0x0037;
    L_0x002e:
        r0 = r4.mLoaderManager;	 Catch:{ InstantiationException -> 0x0047 }
        r0.doStop();	 Catch:{ InstantiationException -> 0x0047 }
        r0 = android.support.v4.app.FragmentActivity.a;	 Catch:{ InstantiationException -> 0x0047 }
        if (r0 == 0) goto L_0x003c;
    L_0x0037:
        r0 = r4.mLoaderManager;	 Catch:{ InstantiationException -> 0x0047 }
        r0.doRetain();	 Catch:{ InstantiationException -> 0x0047 }
    L_0x003c:
        return;
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.Fragment.performReallyStop():void");
    }

    public void onViewStateRestored(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        try {
            try {
                if (!this.mHidden) {
                    if (onContextItemSelected(menuItem)) {
                        return true;
                    }
                    if (this.mChildFragmentManager != null) {
                        if (this.mChildFragmentManager.dispatchContextItemSelected(menuItem)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (InstantiationException e) {
                throw e;
            } catch (InstantiationException e2) {
                throw e2;
            }
        } catch (InstantiationException e22) {
            throw e22;
        } catch (InstantiationException e222) {
            throw e222;
        }
    }

    final boolean isInBackStack() {
        try {
            return this.mBackStackNesting > 0;
        } catch (InstantiationException e) {
            throw e;
        }
    }

    void performCreate(Bundle bundle) {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.noteStateNotSaved();
            }
            try {
                this.mCalled = false;
                onCreate(bundle);
                if (!this.mCalled) {
                    throw new SuperNotCalledException(z[71] + this + z[72]);
                } else if (bundle != null) {
                    Parcelable parcelable = bundle.getParcelable(z[70]);
                    if (parcelable != null) {
                        try {
                            if (this.mChildFragmentManager == null) {
                                instantiateChildFragmentManager();
                            }
                            this.mChildFragmentManager.restoreAllState(parcelable, null);
                            this.mChildFragmentManager.dispatchCreate();
                        } catch (InstantiationException e) {
                            throw e;
                        }
                    }
                }
            } catch (InstantiationException e2) {
                throw e2;
            }
        } catch (InstantiationException e22) {
            throw e22;
        }
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public void onDestroyOptionsMenu() {
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    void performDestroy() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchDestroy();
            }
            try {
                this.mCalled = false;
                onDestroy();
                if (!this.mCalled) {
                    throw new SuperNotCalledException(z[56] + this + z[57]);
                }
            } catch (InstantiationException e) {
                throw e;
            }
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public void startActivity(Intent intent) {
        try {
            if (this.mActivity == null) {
                throw new IllegalStateException(z[5] + this + z[4]);
            }
            this.mActivity.startActivityFromFragment(this, intent, -1);
        } catch (InstantiationException e) {
            throw e;
        }
    }

    final void setIndex(int i, Fragment fragment) {
        try {
            this.mIndex = i;
            if (fragment != null) {
                this.mWho = fragment.mWho + ":" + this.mIndex;
                try {
                    if (!FragmentActivity.a) {
                        return;
                    }
                }
            }
            this.mWho = z[60] + this.mIndex;
        } catch (InstantiationException e) {
            throw e;
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setHasOptionsMenu(boolean r2) {
        /*
        r1_this = this;
        r0 = r1.mHasMenu;	 Catch:{ InstantiationException -> 0x0018 }
        if (r0 == r2) goto L_0x0017;
    L_0x0004:
        r1.mHasMenu = r2;	 Catch:{ InstantiationException -> 0x001a }
        r0 = r1.isAdded();	 Catch:{ InstantiationException -> 0x001a }
        if (r0 == 0) goto L_0x0017;
    L_0x000c:
        r0 = r1.isHidden();	 Catch:{ InstantiationException -> 0x001c }
        if (r0 != 0) goto L_0x0017;
    L_0x0012:
        r0 = r1.mActivity;	 Catch:{ InstantiationException -> 0x001c }
        r0.supportInvalidateOptionsMenu();	 Catch:{ InstantiationException -> 0x001c }
    L_0x0017:
        return;
    L_0x0018:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.Fragment.setHasOptionsMenu(boolean):void");
    }

    public void onStop() {
        this.mCalled = true;
    }

    public Object getExitTransition() {
        return this.mExitTransition;
    }

    View performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.noteStateNotSaved();
            }
            return onCreateView(layoutInflater, viewGroup, bundle);
        } catch (InstantiationException e) {
            throw e;
        }
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        if (this.mChildFragmentManager != null) {
            Parcelable saveAllState = this.mChildFragmentManager.saveAllState();
            if (saveAllState != null) {
                try {
                    bundle.putParcelable(z[73], saveAllState);
                } catch (InstantiationException e) {
                    throw e;
                }
            }
        }
    }

    public void onPause() {
        this.mCalled = true;
    }

    void performStop() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchStop();
            }
            try {
                this.mCalled = false;
                onStop();
                if (!this.mCalled) {
                    throw new SuperNotCalledException(z[3] + this + z[2]);
                }
            } catch (InstantiationException e) {
                throw e;
            }
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    void performPause() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchPause();
            }
            try {
                this.mCalled = false;
                onPause();
                if (!this.mCalled) {
                    throw new SuperNotCalledException(z[9] + this + z[8]);
                }
            } catch (InstantiationException e) {
                throw e;
            }
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMenuVisibility(boolean r2) {
        /*
        r1_this = this;
        r0 = r1.mMenuVisible;	 Catch:{ InstantiationException -> 0x001c }
        if (r0 == r2) goto L_0x001b;
    L_0x0004:
        r1.mMenuVisible = r2;	 Catch:{ InstantiationException -> 0x001e }
        r0 = r1.mHasMenu;	 Catch:{ InstantiationException -> 0x001e }
        if (r0 == 0) goto L_0x001b;
    L_0x000a:
        r0 = r1.isAdded();	 Catch:{ InstantiationException -> 0x0020 }
        if (r0 == 0) goto L_0x001b;
    L_0x0010:
        r0 = r1.isHidden();	 Catch:{ InstantiationException -> 0x0022 }
        if (r0 != 0) goto L_0x001b;
    L_0x0016:
        r0 = r1.mActivity;	 Catch:{ InstantiationException -> 0x0022 }
        r0.supportInvalidateOptionsMenu();	 Catch:{ InstantiationException -> 0x0022 }
    L_0x001b:
        return;
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.Fragment.setMenuVisibility(boolean):void");
    }

    public final Resources getResources() {
        try {
            if (this.mActivity != null) {
                return this.mActivity.getResources();
            }
            throw new IllegalStateException(z[68] + this + z[69]);
        } catch (InstantiationException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean performOptionsItemSelected(android.view.MenuItem r3) {
        /*
        r2_this = this;
        r0 = 1;
        r1 = r2.mHidden;	 Catch:{ InstantiationException -> 0x0014 }
        if (r1 != 0) goto L_0x0028;
    L_0x0005:
        r1 = r2.mHasMenu;	 Catch:{ InstantiationException -> 0x0016 }
        if (r1 == 0) goto L_0x001c;
    L_0x0009:
        r1 = r2.mMenuVisible;	 Catch:{ InstantiationException -> 0x0018 }
        if (r1 == 0) goto L_0x001c;
    L_0x000d:
        r1 = r2.onOptionsItemSelected(r3);	 Catch:{ InstantiationException -> 0x001a }
        if (r1 == 0) goto L_0x001c;
    L_0x0013:
        return r0;
    L_0x0014:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0016 }
    L_0x0016:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x0018 }
    L_0x0018:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        r1 = r2.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x002a }
        if (r1 == 0) goto L_0x0028;
    L_0x0020:
        r1 = r2.mChildFragmentManager;	 Catch:{ InstantiationException -> 0x002c }
        r1 = r1.dispatchOptionsItemSelected(r3);	 Catch:{ InstantiationException -> 0x002c }
        if (r1 != 0) goto L_0x0013;
    L_0x0028:
        r0 = 0;
        goto L_0x0013;
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ InstantiationException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.Fragment.performOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public final FragmentActivity getActivity() {
        return this.mActivity;
    }

    public final boolean isAdded() {
        try {
            if (this.mActivity != null) {
                if (this.mAdded) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (InstantiationException e) {
            throw e;
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    public void onHiddenChanged(boolean z) {
    }

    public Object getEnterTransition() {
        return this.mEnterTransition;
    }

    void instantiateChildFragmentManager() {
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mChildFragmentManager.attachActivity(this.mActivity, new FragmentContainer() {
            private static final String z;
            final Fragment this$0;

            static {
                char[] toCharArray = "\u0016a2J~5}'\rw?v \r}?gsEr&vsL3&z6Z".toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i = 0; length > i; i++) {
                    int i2;
                    char c = cArr[i];
                    switch (i % 5) {
                        case PBE.MD5 /*0*/:
                            i2 = 80;
                            break;
                        case ay.f /*1*/:
                            i2 = 19;
                            break;
                        case ay.n /*2*/:
                            i2 = 83;
                            break;
                        case ay.p /*3*/:
                            i2 = 45;
                            break;
                        default:
                            i2 = 19;
                            break;
                    }
                    cArr[i] = (char) (i2 ^ c);
                }
                z = new String(cArr).intern();
            }

            public View findViewById(int i) {
                try {
                    if (this.this$0.mView != null) {
                        return this.this$0.mView.findViewById(i);
                    }
                    throw new IllegalStateException(z);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }

            public boolean hasView() {
                try {
                    return this.this$0.mView != null;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }

            {
                this.this$0 = r1;
            }
        }, this);
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    static {
        String[] strArr = new String[79];
        String str = "X;\u0004XM{'\u0011\u001f";
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
                        i3 = 30;
                        break;
                    case ay.f /*1*/:
                        i3 = 73;
                        break;
                    case ay.n /*2*/:
                        i3 = 101;
                        break;
                    case ay.p /*3*/:
                        i3 = 63;
                        break;
                    default:
                        i3 = 32;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = ">-\f[\u0000p&\u0011\u001fC\u007f%\t\u001fTv;\nJGvi\u0011P\u0000m<\u0015ZR0&\u000blTq9M\u0016";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "X;\u0004XM{'\u0011\u001f";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = ">'\nK\u0000\u007f=\u0011^Cv,\u0001\u001fTqi$\\Tw?\fKY";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "X;\u0004XM{'\u0011\u001f";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "> \u0001\u0002\u0010f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ">j";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ">-\f[\u0000p&\u0011\u001fC\u007f%\t\u001fTv;\nJGvi\u0011P\u0000m<\u0015ZR0&\u000boAk:\u0000\u0017\t";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "X;\u0004XM{'\u0011\u001f";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "$i\b^K{i\u0016JR{i\u0006SAm:EQAs,EZXw:\u0011L\f> \u0016\u001fPk+\tVC2i\u0004QD>!\u0004L\u0000\u007f'";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "$i\b^K{i\u0016JR{i\u0006SAm:EQAs,EZXw:\u0011L\f> \u0016\u001fPk+\tVC2i\u0004QD>!\u0004L\u0000\u007f'";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ">,\bOTgi\u0006PNm=\u0017JCj&\u0017\u001fTv(\u0011\u001fImi\u0015JBr \u0006";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "K'\u0004]L{i\u0011P\u0000w'\u0016KAp=\f^T{i\u0003MAy$\u0000QT>";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ">,\bOTgi\u0006PNm=\u0017JCj&\u0017\u001fTv(\u0011\u001fImi\u0015JBr \u0006";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "K'\u0004]L{i\u0011P\u0000w'\u0016KAp=\f^T{i\u0003MAy$\u0000QT>";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "K'\u0004]L{i\u0011P\u0000w'\u0016KAp=\f^T{i\u0003MAy$\u0000QT>";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = ">,\bOTgi\u0006PNm=\u0017JCj&\u0017\u001fTv(\u0011\u001fImi\u0015JBr \u0006";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "$i\b^K{i\u0016JR{i\u0006SAm:EQAs,EZXw:\u0011L\f> \u0016\u001fPk+\tVC2i\u0004QD>!\u0004L\u0000\u007f'";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "s\b\u0017XUs,\u000bKS#";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "s\u001a\u0004IEz\u000f\u0017^Gs,\u000bKsj(\u0011Z\u001d";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "s\u0000\u000bQEl\u001f\fZW#";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = ">$1^Ry,\u0011mEo<\u0000LT]&\u0001Z\u001d";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = ">$&PNj(\fQEl\u0000\u0001\u0002\u0003";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "s\u000f\u0017^Gs,\u000bKm\u007f'\u0004XElt";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = ">$#MOs\u0005\u0004FOk=X";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "s\u0001\f[D{'X";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = ">$!ZT\u007f*\rZD#";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "s\u001d\u0004MG{=X";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = ">$,QD{1X";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    str = ">$'^Cu\u001a\u0011^Cu\u0007\u0000LTw'\u0002\u0002";
                    obj = 29;
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    strArr2 = strArr3;
                    str = ">$0LEl\u001f\fLI|%\u0000wIp=X";
                    obj = 30;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    str = "s\u0007\u0000GT_'\fR\u001d";
                    obj = 31;
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    strArr2 = strArr3;
                    str = "]!\fSD>";
                    obj = 32;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "s\u0019\u0004MEp=#MAy$\u0000QT#";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "R&\u0004[Eli(^N\u007f.\u0000M\u001a";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "s\u001a\u0011^T{t";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = ">$7ZMq?\fQG#";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = ">i";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "s\n\nQT\u007f \u000bZR#";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "s\u001a\u0004IEz\u001f\fZWM=\u0004KE#";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "s\u001b\u0000KAw',QSj(\u000b\\E#";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = ">i";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "s\u000f\u0017^Gs,\u000bKiztF";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "s\b\u0006KIh \u0011F\u001d";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = ">$7ZT\u007f \u000bVNyt";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "s\u001a\u0011^T{\b\u0003KEl\b\u000bVM\u007f=\fQG#";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = ">$(ZNk\u001f\fLI|%\u0000\u0002";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = ">$2WO#";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = ">$7ZSk$\u0000[\u001d";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = ">$,Ql\u007f0\nJT#";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = ">$-^SS,\u000bJ\u001d";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = ">$1^G#";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "s\b\u000bVM\u007f=\fQG_>\u0004F\u001d";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "s\b\u0001[Ezt";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "s\u001f\fZW#";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "X;\u0004XM{'\u0011\u001f";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = ">-\f[\u0000p&\u0011\u001fC\u007f%\t\u001fTv;\nJGvi\u0011P\u0000m<\u0015ZR0&\u000b{Em=\u0017PY6`";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "X;\u0004XM{'\u0011\u001f";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = ">'\nK\u0000\u007f=\u0011^Cv,\u0001\u001fTqi$\\Tw?\fKY";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u007f'\u0001MOw-_YR\u007f.\bZNjs";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "X;\u0004XM{'\u0011\u001fAr;\u0000^Dgi\u0004\\Tw?\u0000";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = ">-\f[\u0000p&\u0011\u001fC\u007f%\t\u001fTv;\nJGvi\u0011P\u0000m<\u0015ZR0&\u000b~Cj \u0013VTg\n\u0017ZAj,\u0001\u0017\t";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    str = "X;\u0004XM{'\u0011\u001f";
                    obj = 62;
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    strArr2 = strArr3;
                    str = ">-\f[\u0000p&\u0011\u001fC\u007f%\t\u001fTv;\nJGvi\u0011P\u0000m<\u0015ZR0&\u000b{Em=\u0017PYH \u0000H\b7";
                    obj = 63;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "X;\u0004XM{'\u0011\u001f";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "X;\u0004XM{'\u0011\u001f";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = ">'\nK\u0000\u007f=\u0011^Cv,\u0001\u001fTqi$\\Tw?\fKY";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "X;\u0004XM{'\u0011\u001f";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    i = 69;
                    str = ">'\nK\u0000\u007f=\u0011^Cv,\u0001\u001fTqi$\\Tw?\fKY";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i] = str;
                    i = 70;
                    str = "\u007f'\u0001MOw-_LUn9\nMT$/\u0017^Gs,\u000bKS";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i] = str;
                    i = 71;
                    str = "X;\u0004XM{'\u0011\u001f";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i] = str;
                    i = 72;
                    str = ">-\f[\u0000p&\u0011\u001fC\u007f%\t\u001fTv;\nJGvi\u0011P\u0000m<\u0015ZR0&\u000b|R{(\u0011Z\b7";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i] = str;
                    str = "\u007f'\u0001MOw-_LUn9\nMT$/\u0017^Gs,\u000bKS";
                    obj = 72;
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i] = str;
                    i = 74;
                    strArr2 = strArr3;
                    str = "X;\u0004XM{'\u0011\u001fAr;\u0000^Dgi\u0004\\Tw?\u0000";
                    obj = 73;
                    break;
                case 73:
                    strArr2[i] = str;
                    i = 75;
                    str = "X;\u0004XM{'\u0011\u001f";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i] = str;
                    i = 76;
                    str = ">-\f[\u0000p&\u0011\u001fC\u007f%\t\u001fTv;\nJGvi\u0011P\u0000m<\u0015ZR0&\u000blT\u007f;\u0011\u0017\t";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i] = str;
                    i = 77;
                    str = "X;\u0004XM{'\u0011\u001f";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i] = str;
                    i = 78;
                    str = ">-\f[\u0000p&\u0011\u001fC\u007f%\t\u001fTv;\nJGvi\u0011P\u0000m<\u0015ZR0&\u000biI{>6KAj,7ZSj&\u0017ZD6`";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i] = str;
                    z = strArr3;
                    sClassMap = new SimpleArrayMap();
                    USE_DEFAULT_TRANSITION = new Object();
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = ">-\f[\u0000p&\u0011\u001fC\u007f%\t\u001fTv;\nJGvi\u0011P\u0000m<\u0015ZR0&\u000bmEm<\bZ\b7";
                    obj = null;
                    break;
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        try {
            if (this.mIndex >= 0) {
                throw new IllegalStateException(z[61]);
            }
            Bundle bundle;
            if (savedState != null) {
                try {
                } catch (InstantiationException e) {
                    throw e;
                }
                if (savedState.mState != null) {
                    bundle = savedState.mState;
                    this.mSavedFragmentState = bundle;
                }
            }
            bundle = null;
            this.mSavedFragmentState = bundle;
        } catch (InstantiationException e2) {
            throw e2;
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public Fragment() {
        this.mState = 0;
        this.mIndex = -1;
        this.mTargetIndex = -1;
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mEnterTransition = null;
        this.mReturnTransition = USE_DEFAULT_TRANSITION;
        this.mExitTransition = null;
        this.mReenterTransition = USE_DEFAULT_TRANSITION;
        this.mSharedElementEnterTransition = null;
        this.mSharedElementReturnTransition = USE_DEFAULT_TRANSITION;
        this.mEnterTransitionCallback = null;
        this.mExitTransitionCallback = null;
    }

    void performDestroyView() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchDestroyView();
            }
            try {
                this.mCalled = false;
                onDestroyView();
                if (this.mCalled) {
                    try {
                        if (this.mLoaderManager != null) {
                            this.mLoaderManager.doReportNextStart();
                            return;
                        }
                        return;
                    } catch (InstantiationException e) {
                        throw e;
                    }
                }
                throw new SuperNotCalledException(z[65] + this + z[64]);
            } catch (InstantiationException e2) {
                throw e2;
            }
        } catch (InstantiationException e22) {
            throw e22;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z = FragmentActivity.a;
        try {
            printWriter.print(str);
            printWriter.print(z[43]);
            printWriter.print(Integer.toHexString(this.mFragmentId));
            printWriter.print(z[23]);
            printWriter.print(Integer.toHexString(this.mContainerId));
            printWriter.print(z[52]);
            printWriter.println(this.mTag);
            printWriter.print(str);
            printWriter.print(z[36]);
            printWriter.print(this.mState);
            printWriter.print(z[29]);
            printWriter.print(this.mIndex);
            printWriter.print(z[48]);
            printWriter.print(this.mWho);
            printWriter.print(z[30]);
            printWriter.println(this.mBackStackNesting);
            printWriter.print(str);
            printWriter.print(z[54]);
            printWriter.print(this.mAdded);
            printWriter.print(z[37]);
            printWriter.print(this.mRemoving);
            printWriter.print(z[49]);
            printWriter.print(this.mResumed);
            printWriter.print(z[25]);
            printWriter.print(this.mFromLayout);
            printWriter.print(z[50]);
            printWriter.println(this.mInLayout);
            printWriter.print(str);
            printWriter.print(z[26]);
            printWriter.print(this.mHidden);
            printWriter.print(z[27]);
            printWriter.print(this.mDetached);
            printWriter.print(z[47]);
            printWriter.print(this.mMenuVisible);
            printWriter.print(z[51]);
            printWriter.println(this.mHasMenu);
            printWriter.print(str);
            printWriter.print(z[41]);
            printWriter.print(this.mRetainInstance);
            printWriter.print(z[45]);
            printWriter.print(this.mRetaining);
            printWriter.print(z[31]);
            printWriter.println(this.mUserVisibleHint);
            if (this.mFragmentManager != null) {
                printWriter.print(str);
                printWriter.print(z[24]);
                printWriter.println(this.mFragmentManager);
            }
            try {
                if (this.mActivity != null) {
                    printWriter.print(str);
                    printWriter.print(z[44]);
                    printWriter.println(this.mActivity);
                }
                try {
                    if (this.mParentFragment != null) {
                        printWriter.print(str);
                        printWriter.print(z[34]);
                        printWriter.println(this.mParentFragment);
                    }
                    try {
                        if (this.mArguments != null) {
                            printWriter.print(str);
                            printWriter.print(z[19]);
                            printWriter.println(this.mArguments);
                        }
                        try {
                            if (this.mSavedFragmentState != null) {
                                printWriter.print(str);
                                printWriter.print(z[20]);
                                printWriter.println(this.mSavedFragmentState);
                            }
                            try {
                                if (this.mSavedViewState != null) {
                                    printWriter.print(str);
                                    printWriter.print(z[40]);
                                    printWriter.println(this.mSavedViewState);
                                }
                                try {
                                    if (this.mTarget != null) {
                                        printWriter.print(str);
                                        printWriter.print(z[28]);
                                        printWriter.print(this.mTarget);
                                        printWriter.print(z[22]);
                                        printWriter.println(this.mTargetRequestCode);
                                    }
                                    try {
                                        if (this.mNextAnim != 0) {
                                            printWriter.print(str);
                                            printWriter.print(z[32]);
                                            printWriter.println(this.mNextAnim);
                                        }
                                        try {
                                            if (this.mContainer != null) {
                                                printWriter.print(str);
                                                printWriter.print(z[39]);
                                                printWriter.println(this.mContainer);
                                            }
                                            try {
                                                if (this.mView != null) {
                                                    printWriter.print(str);
                                                    printWriter.print(z[55]);
                                                    printWriter.println(this.mView);
                                                }
                                                try {
                                                    if (this.mInnerView != null) {
                                                        printWriter.print(str);
                                                        printWriter.print(z[21]);
                                                        printWriter.println(this.mView);
                                                    }
                                                    try {
                                                        if (this.mAnimatingAway != null) {
                                                            printWriter.print(str);
                                                            printWriter.print(z[53]);
                                                            printWriter.println(this.mAnimatingAway);
                                                            printWriter.print(str);
                                                            printWriter.print(z[46]);
                                                            printWriter.println(this.mStateAfterAnimating);
                                                        }
                                                        try {
                                                            if (this.mLoaderManager != null) {
                                                                printWriter.print(str);
                                                                printWriter.println(z[35]);
                                                                this.mLoaderManager.dump(str + z[42], fileDescriptor, printWriter, strArr);
                                                            }
                                                            try {
                                                                if (this.mChildFragmentManager != null) {
                                                                    printWriter.print(str);
                                                                    printWriter.println(z[33] + this.mChildFragmentManager + ":");
                                                                    this.mChildFragmentManager.dump(str + z[38], fileDescriptor, printWriter, strArr);
                                                                }
                                                                if (z) {
                                                                    a++;
                                                                }
                                                            } catch (InstantiationException e) {
                                                                throw e;
                                                            }
                                                        } catch (InstantiationException e2) {
                                                            throw e2;
                                                        }
                                                    } catch (InstantiationException e22) {
                                                        throw e22;
                                                    }
                                                } catch (InstantiationException e222) {
                                                    throw e222;
                                                }
                                            } catch (InstantiationException e2222) {
                                                throw e2222;
                                            }
                                        } catch (InstantiationException e22222) {
                                            throw e22222;
                                        }
                                    } catch (InstantiationException e222222) {
                                        throw e222222;
                                    }
                                } catch (InstantiationException e2222222) {
                                    throw e2222222;
                                }
                            } catch (InstantiationException e22222222) {
                                throw e22222222;
                            }
                        } catch (InstantiationException e222222222) {
                            throw e222222222;
                        }
                    } catch (InstantiationException e2222222222) {
                        throw e2222222222;
                    }
                } catch (InstantiationException e22222222222) {
                    throw e22222222222;
                }
            } catch (InstantiationException e222222222222) {
                throw e222222222222;
            }
        } catch (InstantiationException e2222222222222) {
            throw e2222222222222;
        }
    }
}
