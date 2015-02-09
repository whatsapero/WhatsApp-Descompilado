package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.FragmentManager.OnBackStackChangedListener;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import com.whatsapp.vk;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class FragmentManagerImpl extends FragmentManager implements Factory {
    static final Interpolator ACCELERATE_CUBIC;
    static final Interpolator ACCELERATE_QUINT;
    static boolean DEBUG;
    static final Interpolator DECELERATE_CUBIC;
    static final Interpolator DECELERATE_QUINT;
    static final boolean HONEYCOMB;
    private static final String[] z;
    ArrayList mActive;
    FragmentActivity mActivity;
    ArrayList mAdded;
    ArrayList mAvailBackStackIndices;
    ArrayList mAvailIndices;
    ArrayList mBackStack;
    ArrayList mBackStackChangeListeners;
    ArrayList mBackStackIndices;
    FragmentContainer mContainer;
    ArrayList mCreatedMenus;
    int mCurState;
    boolean mDestroyed;
    Runnable mExecCommit;
    boolean mExecutingActions;
    boolean mHavePendingDeferredStart;
    boolean mNeedMenuInvalidate;
    String mNoTransactionsBecause;
    Fragment mParent;
    ArrayList mPendingActions;
    SparseArray mStateArray;
    Bundle mStateBundle;
    boolean mStateSaved;
    Runnable[] mTmpActions;

    class AnonymousClass_4 implements Runnable {
        final FragmentManagerImpl this$0;
        final int val$flags;
        final int val$id;

        AnonymousClass_4(FragmentManagerImpl fragmentManagerImpl, int i, int i2) {
            this.this$0 = fragmentManagerImpl;
            this.val$id = i;
            this.val$flags = i2;
        }

        public void run() {
            this.this$0.popBackStackState(this.this$0.mActivity.mHandler, null, this.val$id, this.val$flags);
        }
    }

    class AnonymousClass_5 implements AnimationListener {
        final FragmentManagerImpl this$0;
        final Fragment val$fragment;

        public void onAnimationEnd(Animation animation) {
            if (this.val$fragment.mAnimatingAway != null) {
                this.val$fragment.mAnimatingAway = null;
                this.this$0.moveToState(this.val$fragment, this.val$fragment.mStateAfterAnimating, 0, 0, false);
            }
        }

        AnonymousClass_5(FragmentManagerImpl fragmentManagerImpl, Fragment fragment) {
            this.this$0 = fragmentManagerImpl;
            this.val$fragment = fragment;
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }

    class FragmentTag {
        public static final int[] Fragment;

        static {
            Fragment = new int[]{16842755, 16842960, 16842961};
        }
    }

    void reportBackStackChanged() {
        boolean z = FragmentActivity.a;
        if (this.mBackStackChangeListeners != null) {
            int i = 0;
            while (i < this.mBackStackChangeListeners.size()) {
                ((OnBackStackChangedListener) this.mBackStackChangeListeners.get(i)).onBackStackChanged();
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public static int transitToStyleIndex(int i, boolean z) {
        int i2;
        boolean z2 = FragmentActivity.a;
        switch (i) {
            case 4097:
                if (z) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                if (!z2) {
                    return i2;
                }
                break;
            case 4099:
                break;
            case 8194:
                break;
            default:
                return -1;
        }
        if (z) {
            i2 = 3;
        } else {
            i2 = 4;
        }
        if (!z2) {
            return i2;
        }
        return z ? 5 : 6;
    }

    public void enqueueAction(Runnable runnable, boolean z) {
        if (!z) {
            try {
                checkStateLoss();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        synchronized (this) {
            try {
                if (!this.mDestroyed) {
                    if (this.mActivity != null) {
                        if (this.mPendingActions == null) {
                            this.mPendingActions = new ArrayList();
                        }
                        this.mPendingActions.add(runnable);
                        if (this.mPendingActions.size() == 1) {
                            this.mActivity.mHandler.removeCallbacks(this.mExecCommit);
                            this.mActivity.mHandler.post(this.mExecCommit);
                        }
                    }
                }
                throw new IllegalStateException(z[107]);
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            } catch (Throwable th) {
            }
        }
    }

    void moveToState(int i, boolean z) {
        moveToState(i, 0, 0, z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void moveToState(android.support.v4.app.Fragment r9, int r10, int r11, int r12, boolean r13) {
        /*
        r8_this = this;
        r7 = android.support.v4.app.FragmentActivity.a;
        r0 = r9.mAdded;	 Catch:{ IllegalArgumentException -> 0x0033 }
        if (r0 == 0) goto L_0x000a;
    L_0x0006:
        r0 = r9.mDetached;	 Catch:{ IllegalArgumentException -> 0x0035 }
        if (r0 == 0) goto L_0x04a5;
    L_0x000a:
        r0 = 1;
        if (r10 <= r0) goto L_0x04a5;
    L_0x000d:
        r10 = 1;
        r6 = r10;
    L_0x000f:
        r0 = r9.mRemoving;	 Catch:{ IllegalArgumentException -> 0x0037 }
        if (r0 == 0) goto L_0x0019;
    L_0x0013:
        r0 = r9.mState;	 Catch:{ IllegalArgumentException -> 0x0037 }
        if (r6 <= r0) goto L_0x0019;
    L_0x0017:
        r6 = r9.mState;
    L_0x0019:
        r0 = r9.mDeferStart;	 Catch:{ IllegalArgumentException -> 0x0039 }
        if (r0 == 0) goto L_0x0026;
    L_0x001d:
        r0 = r9.mState;	 Catch:{ IllegalArgumentException -> 0x003b }
        r1 = 4;
        if (r0 >= r1) goto L_0x0026;
    L_0x0022:
        r0 = 3;
        if (r6 <= r0) goto L_0x0026;
    L_0x0025:
        r6 = 3;
    L_0x0026:
        r0 = r9.mState;	 Catch:{ IllegalArgumentException -> 0x003d }
        if (r0 >= r6) goto L_0x04a2;
    L_0x002a:
        r0 = r9.mFromLayout;	 Catch:{ IllegalArgumentException -> 0x003f }
        if (r0 == 0) goto L_0x0043;
    L_0x002e:
        r0 = r9.mInLayout;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r0 != 0) goto L_0x0043;
    L_0x0032:
        return;
    L_0x0033:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x0035:
        r0 = move-exception;
        throw r0;
    L_0x0037:
        r0 = move-exception;
        throw r0;
    L_0x0039:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r0 = move-exception;
        throw r0;
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = r9.mAnimatingAway;	 Catch:{ IllegalArgumentException -> 0x0068 }
        if (r0 == 0) goto L_0x0054;
    L_0x0047:
        r0 = 0;
        r9.mAnimatingAway = r0;	 Catch:{ IllegalArgumentException -> 0x0068 }
        r2 = r9.mStateAfterAnimating;	 Catch:{ IllegalArgumentException -> 0x0068 }
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r8;
        r1 = r9;
        r0.moveToState(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0068 }
    L_0x0054:
        r0 = r9.mState;	 Catch:{ IllegalArgumentException -> 0x012d }
        switch(r0) {
            case 0: goto L_0x006a;
            case 1: goto L_0x018d;
            case 2: goto L_0x0273;
            case 3: goto L_0x0273;
            case 4: goto L_0x049f;
            default: goto L_0x0059;
        };
    L_0x0059:
        r0 = r6;
    L_0x005a:
        if (r7 == 0) goto L_0x0065;
    L_0x005c:
        r1 = r9.mState;	 Catch:{ IllegalArgumentException -> 0x02f1 }
        if (r1 <= r0) goto L_0x0065;
    L_0x0060:
        r1 = r9.mState;	 Catch:{ IllegalArgumentException -> 0x02f3 }
        switch(r1) {
            case 1: goto L_0x03f2;
            case 2: goto L_0x037a;
            case 3: goto L_0x0350;
            case 4: goto L_0x0326;
            case 5: goto L_0x02f9;
            default: goto L_0x0065;
        };
    L_0x0065:
        r9.mState = r0;
        goto L_0x0032;
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x012f }
        if (r0 == 0) goto L_0x008e;
    L_0x006e:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x012f }
        r1 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x012f }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x012f }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x012f }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x012f }
        r3 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x012f }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x012f }
        r1 = r1.append(r9);	 Catch:{ IllegalArgumentException -> 0x012f }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x012f }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x012f }
    L_0x008e:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0131 }
        if (r0 == 0) goto L_0x00e6;
    L_0x0092:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r1 = r8.mActivity;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r1 = r1.getClassLoader();	 Catch:{ IllegalArgumentException -> 0x0133 }
        r0.setClassLoader(r1);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r2 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0133 }
        r0 = r0.getSparseParcelableArray(r1);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r9.mSavedViewState = r0;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r2 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0133 }
        r0 = r8.getFragment(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r9.mTarget = r0;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r0 = r9.mTarget;	 Catch:{ IllegalArgumentException -> 0x0133 }
        if (r0 == 0) goto L_0x00cc;
    L_0x00bd:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r2 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0133 }
        r2 = 0;
        r0 = r0.getInt(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r9.mTargetRequestCode = r0;	 Catch:{ IllegalArgumentException -> 0x0133 }
    L_0x00cc:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r2 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0135 }
        r2 = 1;
        r0 = r0.getBoolean(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0135 }
        r9.mUserVisibleHint = r0;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r0 = r9.mUserVisibleHint;	 Catch:{ IllegalArgumentException -> 0x0135 }
        if (r0 != 0) goto L_0x00e6;
    L_0x00df:
        r0 = 1;
        r9.mDeferStart = r0;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r0 = 3;
        if (r6 <= r0) goto L_0x00e6;
    L_0x00e5:
        r6 = 3;
    L_0x00e6:
        r0 = r8.mActivity;	 Catch:{ IllegalArgumentException -> 0x0137 }
        r9.mActivity = r0;	 Catch:{ IllegalArgumentException -> 0x0137 }
        r0 = r8.mParent;	 Catch:{ IllegalArgumentException -> 0x0137 }
        r9.mParentFragment = r0;	 Catch:{ IllegalArgumentException -> 0x0137 }
        r0 = r8.mParent;	 Catch:{ IllegalArgumentException -> 0x0137 }
        if (r0 == 0) goto L_0x0139;
    L_0x00f2:
        r0 = r8.mParent;	 Catch:{ IllegalArgumentException -> 0x0137 }
        r0 = r0.mChildFragmentManager;	 Catch:{ IllegalArgumentException -> 0x0137 }
    L_0x00f6:
        r9.mFragmentManager = r0;	 Catch:{ IllegalArgumentException -> 0x012b }
        r0 = 0;
        r9.mCalled = r0;	 Catch:{ IllegalArgumentException -> 0x012b }
        r0 = r8.mActivity;	 Catch:{ IllegalArgumentException -> 0x012b }
        r9.onAttach(r0);	 Catch:{ IllegalArgumentException -> 0x012b }
        r0 = r9.mCalled;	 Catch:{ IllegalArgumentException -> 0x012b }
        if (r0 != 0) goto L_0x013e;
    L_0x0104:
        r0 = new android.support.v4.app.SuperNotCalledException;	 Catch:{ IllegalArgumentException -> 0x012b }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x012b }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x012b }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x012b }
        r3 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x012b }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x012b }
        r1 = r1.append(r9);	 Catch:{ IllegalArgumentException -> 0x012b }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x012b }
        r3 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x012b }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x012b }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x012b }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x012b }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x012b }
    L_0x012b:
        r0 = move-exception;
        throw r0;
    L_0x012d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x012f }
    L_0x012f:
        r0 = move-exception;
        throw r0;
    L_0x0131:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0133 }
    L_0x0133:
        r0 = move-exception;
        throw r0;
    L_0x0135:
        r0 = move-exception;
        throw r0;
    L_0x0137:
        r0 = move-exception;
        throw r0;
    L_0x0139:
        r0 = r8.mActivity;
        r0 = r0.mFragments;
        goto L_0x00f6;
    L_0x013e:
        r0 = r9.mParentFragment;	 Catch:{ IllegalArgumentException -> 0x02d3 }
        if (r0 != 0) goto L_0x0147;
    L_0x0142:
        r0 = r8.mActivity;	 Catch:{ IllegalArgumentException -> 0x02d3 }
        r0.onAttachFragment(r9);	 Catch:{ IllegalArgumentException -> 0x02d3 }
    L_0x0147:
        r0 = r9.mRetaining;	 Catch:{ IllegalArgumentException -> 0x02d5 }
        if (r0 != 0) goto L_0x0150;
    L_0x014b:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x02d5 }
        r9.performCreate(r0);	 Catch:{ IllegalArgumentException -> 0x02d5 }
    L_0x0150:
        r0 = 0;
        r9.mRetaining = r0;	 Catch:{ IllegalArgumentException -> 0x02d7 }
        r0 = r9.mFromLayout;	 Catch:{ IllegalArgumentException -> 0x02d7 }
        if (r0 == 0) goto L_0x018d;
    L_0x0157:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x02d9 }
        r0 = r9.getLayoutInflater(r0);	 Catch:{ IllegalArgumentException -> 0x02d9 }
        r1 = 0;
        r2 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x02d9 }
        r0 = r9.performCreateView(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x02d9 }
        r9.mView = r0;	 Catch:{ IllegalArgumentException -> 0x02d9 }
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x02d9 }
        if (r0 == 0) goto L_0x018a;
    L_0x016a:
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x02db }
        r9.mInnerView = r0;	 Catch:{ IllegalArgumentException -> 0x02db }
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x02db }
        r0 = android.support.v4.app.NoSaveStateFrameLayout.wrap(r0);	 Catch:{ IllegalArgumentException -> 0x02db }
        r9.mView = r0;	 Catch:{ IllegalArgumentException -> 0x02db }
        r0 = r9.mHidden;	 Catch:{ IllegalArgumentException -> 0x02db }
        if (r0 == 0) goto L_0x0181;
    L_0x017a:
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x02db }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x02db }
    L_0x0181:
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x02dd }
        r1 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x02dd }
        r9.onViewCreated(r0, r1);	 Catch:{ IllegalArgumentException -> 0x02dd }
        if (r7 == 0) goto L_0x018d;
    L_0x018a:
        r0 = 0;
        r9.mInnerView = r0;	 Catch:{ IllegalArgumentException -> 0x02dd }
    L_0x018d:
        r0 = 1;
        if (r6 <= r0) goto L_0x0273;
    L_0x0190:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x02df }
        if (r0 == 0) goto L_0x01b4;
    L_0x0194:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x02df }
        r1 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x02df }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x02df }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x02df }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x02df }
        r3 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x02df }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x02df }
        r1 = r1.append(r9);	 Catch:{ IllegalArgumentException -> 0x02df }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x02df }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x02df }
    L_0x01b4:
        r0 = r9.mFromLayout;
        if (r0 != 0) goto L_0x0262;
    L_0x01b8:
        r0 = 0;
        r1 = r9.mContainerId;
        if (r1 == 0) goto L_0x0218;
    L_0x01bd:
        r0 = r8.mContainer;
        r1 = r9.mContainerId;
        r0 = r0.findViewById(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x0218;
    L_0x01c9:
        r1 = r9.mRestored;	 Catch:{ IllegalArgumentException -> 0x02e1 }
        if (r1 != 0) goto L_0x0218;
    L_0x01cd:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r4 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r3 = r9.mContainerId;	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r3 = java.lang.Integer.toHexString(r3);	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r4 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r3 = r9.getResources();	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r4 = r9.mContainerId;	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r3 = r3.getResourceName(r4);	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r4 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r1.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x02e1 }
        r8.throwException(r1);	 Catch:{ IllegalArgumentException -> 0x02e1 }
    L_0x0218:
        r9.mContainer = r0;	 Catch:{ IllegalArgumentException -> 0x02e3 }
        r1 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x02e3 }
        r1 = r9.getLayoutInflater(r1);	 Catch:{ IllegalArgumentException -> 0x02e3 }
        r2 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x02e3 }
        r1 = r9.performCreateView(r1, r0, r2);	 Catch:{ IllegalArgumentException -> 0x02e3 }
        r9.mView = r1;	 Catch:{ IllegalArgumentException -> 0x02e3 }
        r1 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x02e3 }
        if (r1 == 0) goto L_0x025f;
    L_0x022c:
        r1 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x02e3 }
        r9.mInnerView = r1;	 Catch:{ IllegalArgumentException -> 0x02e3 }
        r1 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x02e3 }
        r1 = android.support.v4.app.NoSaveStateFrameLayout.wrap(r1);	 Catch:{ IllegalArgumentException -> 0x02e3 }
        r9.mView = r1;	 Catch:{ IllegalArgumentException -> 0x02e3 }
        if (r0 == 0) goto L_0x024b;
    L_0x023a:
        r1 = 1;
        r1 = r8.loadAnimation(r9, r11, r1, r12);
        if (r1 == 0) goto L_0x0246;
    L_0x0241:
        r2 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x02e5 }
        r2.startAnimation(r1);	 Catch:{ IllegalArgumentException -> 0x02e5 }
    L_0x0246:
        r1 = r9.mView;
        r0.addView(r1);
    L_0x024b:
        r0 = r9.mHidden;	 Catch:{ IllegalArgumentException -> 0x02e7 }
        if (r0 == 0) goto L_0x0256;
    L_0x024f:
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x02e7 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x02e7 }
    L_0x0256:
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x02e9 }
        r1 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x02e9 }
        r9.onViewCreated(r0, r1);	 Catch:{ IllegalArgumentException -> 0x02e9 }
        if (r7 == 0) goto L_0x0262;
    L_0x025f:
        r0 = 0;
        r9.mInnerView = r0;	 Catch:{ IllegalArgumentException -> 0x02e9 }
    L_0x0262:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x02eb }
        r9.performActivityCreated(r0);	 Catch:{ IllegalArgumentException -> 0x02eb }
        r0 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x02eb }
        if (r0 == 0) goto L_0x0270;
    L_0x026b:
        r0 = r9.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x02eb }
        r9.restoreViewState(r0);	 Catch:{ IllegalArgumentException -> 0x02eb }
    L_0x0270:
        r0 = 0;
        r9.mSavedFragmentState = r0;
    L_0x0273:
        r0 = r6;
        r1 = 3;
        if (r0 <= r1) goto L_0x029e;
    L_0x0277:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x02ed }
        if (r1 == 0) goto L_0x029b;
    L_0x027b:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02ed }
        r2 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x02ed }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x02ed }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x02ed }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02ed }
        r4 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x02ed }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x02ed }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x02ed }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x02ed }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x02ed }
    L_0x029b:
        r9.performStart();
    L_0x029e:
        r1 = 4;
        if (r0 <= r1) goto L_0x005a;
    L_0x02a1:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x02ef }
        if (r1 == 0) goto L_0x02c5;
    L_0x02a5:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02ef }
        r2 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x02ef }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x02ef }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x02ef }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02ef }
        r4 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x02ef }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x02ef }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x02ef }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x02ef }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x02ef }
    L_0x02c5:
        r1 = 1;
        r9.mResumed = r1;
        r9.performResume();
        r1 = 0;
        r9.mSavedFragmentState = r1;
        r1 = 0;
        r9.mSavedViewState = r1;
        goto L_0x005a;
    L_0x02d3:
        r0 = move-exception;
        throw r0;
    L_0x02d5:
        r0 = move-exception;
        throw r0;
    L_0x02d7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02d9 }
    L_0x02d9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02db }
    L_0x02db:
        r0 = move-exception;
        throw r0;
    L_0x02dd:
        r0 = move-exception;
        throw r0;
    L_0x02df:
        r0 = move-exception;
        throw r0;
    L_0x02e1:
        r0 = move-exception;
        throw r0;
    L_0x02e3:
        r0 = move-exception;
        throw r0;
    L_0x02e5:
        r0 = move-exception;
        throw r0;
    L_0x02e7:
        r0 = move-exception;
        throw r0;
    L_0x02e9:
        r0 = move-exception;
        throw r0;
    L_0x02eb:
        r0 = move-exception;
        throw r0;
    L_0x02ed:
        r0 = move-exception;
        throw r0;
    L_0x02ef:
        r0 = move-exception;
        throw r0;
    L_0x02f1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02f3 }
    L_0x02f3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02f5 }
    L_0x02f5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x02f7 }
    L_0x02f7:
        r0 = move-exception;
        throw r0;
    L_0x02f9:
        r1 = 5;
        if (r0 >= r1) goto L_0x0326;
    L_0x02fc:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x02f7 }
        if (r1 == 0) goto L_0x0320;
    L_0x0300:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x02f7 }
        r2 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x02f7 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x02f7 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x02f7 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02f7 }
        r4 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x02f7 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x02f7 }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x02f7 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x02f7 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x02f7 }
    L_0x0320:
        r9.performPause();
        r1 = 0;
        r9.mResumed = r1;
    L_0x0326:
        r1 = 4;
        if (r0 >= r1) goto L_0x0350;
    L_0x0329:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x046c }
        if (r1 == 0) goto L_0x034d;
    L_0x032d:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x046c }
        r2 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x046c }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x046c }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x046c }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x046c }
        r4 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x046c }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x046c }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x046c }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x046c }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x046c }
    L_0x034d:
        r9.performStop();
    L_0x0350:
        r1 = 3;
        if (r0 >= r1) goto L_0x037a;
    L_0x0353:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x046e }
        if (r1 == 0) goto L_0x0377;
    L_0x0357:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x046e }
        r2 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x046e }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x046e }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x046e }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x046e }
        r4 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x046e }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x046e }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x046e }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x046e }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x046e }
    L_0x0377:
        r9.performReallyStop();
    L_0x037a:
        r1 = 2;
        if (r0 >= r1) goto L_0x03f2;
    L_0x037d:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0470 }
        if (r1 == 0) goto L_0x03a1;
    L_0x0381:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0470 }
        r2 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0470 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0470 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0470 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0470 }
        r4 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0470 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0470 }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x0470 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0470 }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0470 }
    L_0x03a1:
        r1 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x0472 }
        if (r1 == 0) goto L_0x03b4;
    L_0x03a5:
        r1 = r8.mActivity;	 Catch:{ IllegalArgumentException -> 0x0474 }
        r1 = r1.isFinishing();	 Catch:{ IllegalArgumentException -> 0x0474 }
        if (r1 != 0) goto L_0x03b4;
    L_0x03ad:
        r1 = r9.mSavedViewState;	 Catch:{ IllegalArgumentException -> 0x0476 }
        if (r1 != 0) goto L_0x03b4;
    L_0x03b1:
        r8.saveFragmentViewState(r9);	 Catch:{ IllegalArgumentException -> 0x0476 }
    L_0x03b4:
        r9.performDestroyView();	 Catch:{ IllegalArgumentException -> 0x0478 }
        r1 = r9.mView;	 Catch:{ IllegalArgumentException -> 0x0478 }
        if (r1 == 0) goto L_0x03e9;
    L_0x03bb:
        r1 = r9.mContainer;	 Catch:{ IllegalArgumentException -> 0x0478 }
        if (r1 == 0) goto L_0x03e9;
    L_0x03bf:
        r1 = 0;
        r2 = r8.mCurState;	 Catch:{ IllegalArgumentException -> 0x047a }
        if (r2 <= 0) goto L_0x03cd;
    L_0x03c4:
        r2 = r8.mDestroyed;	 Catch:{ IllegalArgumentException -> 0x047a }
        if (r2 != 0) goto L_0x03cd;
    L_0x03c8:
        r1 = 0;
        r1 = r8.loadAnimation(r9, r11, r1, r12);
    L_0x03cd:
        if (r1 == 0) goto L_0x03e2;
    L_0x03cf:
        r2 = r9.mView;
        r9.mAnimatingAway = r2;
        r9.mStateAfterAnimating = r0;
        r2 = new android.support.v4.app.FragmentManagerImpl$5;
        r2.<init>(r8, r9);
        r1.setAnimationListener(r2);
        r2 = r9.mView;
        r2.startAnimation(r1);
    L_0x03e2:
        r1 = r9.mContainer;
        r2 = r9.mView;
        r1.removeView(r2);
    L_0x03e9:
        r1 = 0;
        r9.mContainer = r1;
        r1 = 0;
        r9.mView = r1;
        r1 = 0;
        r9.mInnerView = r1;
    L_0x03f2:
        r1 = 1;
        if (r0 >= r1) goto L_0x0065;
    L_0x03f5:
        r1 = r8.mDestroyed;	 Catch:{ IllegalArgumentException -> 0x047c }
        if (r1 == 0) goto L_0x0405;
    L_0x03f9:
        r1 = r9.mAnimatingAway;	 Catch:{ IllegalArgumentException -> 0x047c }
        if (r1 == 0) goto L_0x0405;
    L_0x03fd:
        r1 = r9.mAnimatingAway;
        r2 = 0;
        r9.mAnimatingAway = r2;
        r1.clearAnimation();
    L_0x0405:
        r1 = r9.mAnimatingAway;
        if (r1 == 0) goto L_0x040e;
    L_0x0409:
        r9.mStateAfterAnimating = r0;
        r0 = 1;
        if (r7 == 0) goto L_0x0065;
    L_0x040e:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x047e }
        if (r1 == 0) goto L_0x0432;
    L_0x0412:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x047e }
        r2 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x047e }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x047e }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x047e }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x047e }
        r4 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x047e }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x047e }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x047e }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x047e }
        android.util.Log.v(r1, r2);	 Catch:{ IllegalArgumentException -> 0x047e }
    L_0x0432:
        r1 = r9.mRetaining;	 Catch:{ IllegalArgumentException -> 0x0480 }
        if (r1 != 0) goto L_0x0439;
    L_0x0436:
        r9.performDestroy();	 Catch:{ IllegalArgumentException -> 0x0480 }
    L_0x0439:
        r1 = 0;
        r9.mCalled = r1;	 Catch:{ IllegalArgumentException -> 0x046a }
        r9.onDetach();	 Catch:{ IllegalArgumentException -> 0x046a }
        r1 = r9.mCalled;	 Catch:{ IllegalArgumentException -> 0x046a }
        if (r1 != 0) goto L_0x0482;
    L_0x0443:
        r0 = new android.support.v4.app.SuperNotCalledException;	 Catch:{ IllegalArgumentException -> 0x046a }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x046a }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x046a }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x046a }
        r3 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x046a }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x046a }
        r1 = r1.append(r9);	 Catch:{ IllegalArgumentException -> 0x046a }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x046a }
        r3 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x046a }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x046a }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x046a }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x046a }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x046a }
    L_0x046a:
        r0 = move-exception;
        throw r0;
    L_0x046c:
        r0 = move-exception;
        throw r0;
    L_0x046e:
        r0 = move-exception;
        throw r0;
    L_0x0470:
        r0 = move-exception;
        throw r0;
    L_0x0472:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0474 }
    L_0x0474:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0476 }
    L_0x0476:
        r0 = move-exception;
        throw r0;
    L_0x0478:
        r0 = move-exception;
        throw r0;
    L_0x047a:
        r0 = move-exception;
        throw r0;
    L_0x047c:
        r0 = move-exception;
        throw r0;
    L_0x047e:
        r0 = move-exception;
        throw r0;
    L_0x0480:
        r0 = move-exception;
        throw r0;
    L_0x0482:
        if (r13 != 0) goto L_0x0065;
    L_0x0484:
        r1 = r9.mRetaining;	 Catch:{ IllegalArgumentException -> 0x049d }
        if (r1 != 0) goto L_0x048d;
    L_0x0488:
        r8.makeInactive(r9);	 Catch:{ IllegalArgumentException -> 0x049b }
        if (r7 == 0) goto L_0x0065;
    L_0x048d:
        r1 = 0;
        r9.mActivity = r1;	 Catch:{ IllegalArgumentException -> 0x049b }
        r1 = 0;
        r9.mParentFragment = r1;	 Catch:{ IllegalArgumentException -> 0x049b }
        r1 = 0;
        r9.mFragmentManager = r1;	 Catch:{ IllegalArgumentException -> 0x049b }
        r1 = 0;
        r9.mChildFragmentManager = r1;	 Catch:{ IllegalArgumentException -> 0x049b }
        goto L_0x0065;
    L_0x049b:
        r0 = move-exception;
        throw r0;
    L_0x049d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x049b }
    L_0x049f:
        r0 = r6;
        goto L_0x029e;
    L_0x04a2:
        r0 = r6;
        goto L_0x005c;
    L_0x04a5:
        r6 = r10;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.moveToState(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    public List getFragments() {
        return this.mActive;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean popBackStackState(android.os.Handler r12, java.lang.String r13, int r14, int r15) {
        /*
        r11_this = this;
        r4 = android.support.v4.app.FragmentActivity.a;
        r0 = r11.mBackStack;	 Catch:{ IllegalArgumentException -> 0x0008 }
        if (r0 != 0) goto L_0x000a;
    L_0x0006:
        r0 = 0;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        if (r13 != 0) goto L_0x003d;
    L_0x000c:
        if (r14 >= 0) goto L_0x003d;
    L_0x000e:
        r0 = r15 & 1;
        if (r0 != 0) goto L_0x003d;
    L_0x0012:
        r0 = r11.mBackStack;
        r0 = r0.size();
        r0 = r0 + -1;
        if (r0 >= 0) goto L_0x001e;
    L_0x001c:
        r0 = 0;
        goto L_0x0007;
    L_0x001e:
        r1 = r11.mBackStack;
        r0 = r1.remove(r0);
        r0 = (android.support.v4.app.BackStackRecord) r0;
        r1 = new android.util.SparseArray;
        r1.<init>();
        r2 = new android.util.SparseArray;
        r2.<init>();
        r0.calculateBackFragments(r1, r2);
        r3 = 1;
        r5 = 0;
        r0.popFromBackStack(r3, r5, r1, r2);
        r11.reportBackStackChanged();
        if (r4 == 0) goto L_0x0137;
    L_0x003d:
        r0 = -1;
        if (r13 != 0) goto L_0x0042;
    L_0x0040:
        if (r14 < 0) goto L_0x0148;
    L_0x0042:
        r0 = r11.mBackStack;
        r0 = r0.size();
        r1 = r0 + -1;
    L_0x004a:
        if (r1 < 0) goto L_0x014e;
    L_0x004c:
        r0 = r11.mBackStack;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.BackStackRecord) r0;
        if (r13 == 0) goto L_0x0062;
    L_0x0056:
        r2 = r0.getName();	 Catch:{ IllegalArgumentException -> 0x0072 }
        r2 = r13.equals(r2);	 Catch:{ IllegalArgumentException -> 0x0072 }
        if (r2 == 0) goto L_0x0062;
    L_0x0060:
        if (r4 == 0) goto L_0x014e;
    L_0x0062:
        if (r14 < 0) goto L_0x006a;
    L_0x0064:
        r0 = r0.mIndex;	 Catch:{ IllegalArgumentException -> 0x0078 }
        if (r14 != r0) goto L_0x006a;
    L_0x0068:
        if (r4 == 0) goto L_0x014e;
    L_0x006a:
        r0 = r1 + -1;
        if (r4 == 0) goto L_0x014b;
    L_0x006e:
        if (r0 >= 0) goto L_0x007c;
    L_0x0070:
        r0 = 0;
        goto L_0x0007;
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        r1 = r15 & 1;
        if (r1 == 0) goto L_0x0148;
    L_0x0080:
        r1 = r0 + -1;
    L_0x0082:
        if (r1 < 0) goto L_0x00a3;
    L_0x0084:
        r0 = r11.mBackStack;
        r0 = r0.get(r1);
        r0 = (android.support.v4.app.BackStackRecord) r0;
        if (r13 == 0) goto L_0x0098;
    L_0x008e:
        r2 = r0.getName();	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r2 = r13.equals(r2);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        if (r2 != 0) goto L_0x009e;
    L_0x0098:
        if (r14 < 0) goto L_0x00a3;
    L_0x009a:
        r0 = r0.mIndex;	 Catch:{ IllegalArgumentException -> 0x00b4 }
        if (r14 != r0) goto L_0x00a3;
    L_0x009e:
        r0 = r1 + -1;
        if (r4 == 0) goto L_0x0145;
    L_0x00a2:
        r1 = r0;
    L_0x00a3:
        r0 = r11.mBackStack;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r0 = r0 + -1;
        if (r1 != r0) goto L_0x00b8;
    L_0x00ad:
        r0 = 0;
        goto L_0x0007;
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b2 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;
    L_0x00b6:
        r0 = move-exception;
        throw r0;
    L_0x00b8:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r0 = r11.mBackStack;
        r0 = r0.size();
        r0 = r0 + -1;
    L_0x00c5:
        if (r0 <= r1) goto L_0x00d4;
    L_0x00c7:
        r2 = r11.mBackStack;
        r2 = r2.remove(r0);
        r5.add(r2);
        r0 = r0 + -1;
        if (r4 == 0) goto L_0x00c5;
    L_0x00d4:
        r0 = r5.size();
        r6 = r0 + -1;
        r7 = new android.util.SparseArray;
        r7.<init>();
        r8 = new android.util.SparseArray;
        r8.<init>();
        r0 = 0;
        r1 = r0;
    L_0x00e6:
        if (r1 > r6) goto L_0x00f5;
    L_0x00e8:
        r0 = r5.get(r1);
        r0 = (android.support.v4.app.BackStackRecord) r0;
        r0.calculateBackFragments(r7, r8);
        r0 = r1 + 1;
        if (r4 == 0) goto L_0x0143;
    L_0x00f5:
        r1 = 0;
        r0 = 0;
        r2 = r0;
        r3 = r1;
    L_0x00f9:
        if (r2 > r6) goto L_0x0134;
    L_0x00fb:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x013a }
        if (r0 == 0) goto L_0x0123;
    L_0x00ff:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = 58;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x013a }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x013a }
        r9 = z;	 Catch:{ IllegalArgumentException -> 0x013a }
        r10 = 59;
        r9 = r9[r10];	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = r1.append(r9);	 Catch:{ IllegalArgumentException -> 0x013a }
        r9 = r5.get(r2);	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = r1.append(r9);	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x013a }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x013a }
    L_0x0123:
        r0 = r5.get(r2);	 Catch:{ IllegalArgumentException -> 0x013c }
        r0 = (android.support.v4.app.BackStackRecord) r0;	 Catch:{ IllegalArgumentException -> 0x013c }
        if (r2 != r6) goto L_0x013e;
    L_0x012b:
        r1 = 1;
    L_0x012c:
        r1 = r0.popFromBackStack(r1, r3, r7, r8);
        r0 = r2 + 1;
        if (r4 == 0) goto L_0x0140;
    L_0x0134:
        r11.reportBackStackChanged();
    L_0x0137:
        r0 = 1;
        goto L_0x0007;
    L_0x013a:
        r0 = move-exception;
        throw r0;
    L_0x013c:
        r0 = move-exception;
        throw r0;
    L_0x013e:
        r1 = 0;
        goto L_0x012c;
    L_0x0140:
        r2 = r0;
        r3 = r1;
        goto L_0x00f9;
    L_0x0143:
        r1 = r0;
        goto L_0x00e6;
    L_0x0145:
        r1 = r0;
        goto L_0x0082;
    L_0x0148:
        r1 = r0;
        goto L_0x00a3;
    L_0x014b:
        r1 = r0;
        goto L_0x004a;
    L_0x014e:
        r0 = r1;
        goto L_0x006e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.popBackStackState(android.os.Handler, java.lang.String, int, int):boolean");
    }

    public void dispatchReallyStop() {
        moveToState(2, false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void removeFragment(android.support.v4.app.Fragment r7, int r8, int r9) {
        /*
        r6_this = this;
        r1 = 1;
        r5 = 0;
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0065 }
        if (r0 == 0) goto L_0x0033;
    L_0x0006:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = 2;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0065 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r2.append(r7);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r3 = r7.mBackStackNesting;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0065 }
        android.util.Log.v(r0, r2);	 Catch:{ IllegalArgumentException -> 0x0065 }
    L_0x0033:
        r0 = r7.isInBackStack();	 Catch:{ IllegalArgumentException -> 0x0067 }
        if (r0 != 0) goto L_0x0069;
    L_0x0039:
        r0 = r1;
    L_0x003a:
        r2 = r7.mDetached;	 Catch:{ IllegalArgumentException -> 0x006b }
        if (r2 == 0) goto L_0x0040;
    L_0x003e:
        if (r0 == 0) goto L_0x0064;
    L_0x0040:
        r2 = r6.mAdded;	 Catch:{ IllegalArgumentException -> 0x006f }
        if (r2 == 0) goto L_0x0049;
    L_0x0044:
        r2 = r6.mAdded;	 Catch:{ IllegalArgumentException -> 0x006f }
        r2.remove(r7);	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x0049:
        r2 = r7.mHasMenu;	 Catch:{ IllegalArgumentException -> 0x0071 }
        if (r2 == 0) goto L_0x0054;
    L_0x004d:
        r2 = r7.mMenuVisible;	 Catch:{ IllegalArgumentException -> 0x0073 }
        if (r2 == 0) goto L_0x0054;
    L_0x0051:
        r2 = 1;
        r6.mNeedMenuInvalidate = r2;	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0054:
        r2 = 0;
        r7.mAdded = r2;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = 1;
        r7.mRemoving = r2;	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r0 == 0) goto L_0x0077;
    L_0x005c:
        r2 = r5;
    L_0x005d:
        r0 = r6;
        r1 = r7;
        r3 = r8;
        r4 = r9;
        r0.moveToState(r1, r2, r3, r4, r5);
    L_0x0064:
        return;
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r0 = r5;
        goto L_0x003a;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r2 = r1;
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.removeFragment(android.support.v4.app.Fragment, int, int):void");
    }

    void addBackStackState(BackStackRecord backStackRecord) {
        try {
            if (this.mBackStack == null) {
                this.mBackStack = new ArrayList();
            }
            this.mBackStack.add(backStackRecord);
            reportBackStackChanged();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void attachFragment(android.support.v4.app.Fragment r7, int r8, int r9) {
        /*
        r6_this = this;
        r5 = 0;
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0062 }
        if (r0 == 0) goto L_0x0025;
    L_0x0005:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0062 }
        r1 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0062 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0062 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0062 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0062 }
        r3 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0062 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0062 }
        r1 = r1.append(r7);	 Catch:{ IllegalArgumentException -> 0x0062 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0062 }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0062 }
    L_0x0025:
        r0 = r7.mDetached;	 Catch:{ IllegalArgumentException -> 0x0064 }
        if (r0 == 0) goto L_0x00aa;
    L_0x0029:
        r0 = 0;
        r7.mDetached = r0;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r0 = r7.mAdded;	 Catch:{ IllegalArgumentException -> 0x0066 }
        if (r0 != 0) goto L_0x00aa;
    L_0x0030:
        r0 = r6.mAdded;	 Catch:{ IllegalArgumentException -> 0x0068 }
        if (r0 != 0) goto L_0x003b;
    L_0x0034:
        r0 = new java.util.ArrayList;	 Catch:{ IllegalArgumentException -> 0x0068 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0068 }
        r6.mAdded = r0;	 Catch:{ IllegalArgumentException -> 0x0068 }
    L_0x003b:
        r0 = r6.mAdded;	 Catch:{ IllegalArgumentException -> 0x0060 }
        r0 = r0.contains(r7);	 Catch:{ IllegalArgumentException -> 0x0060 }
        if (r0 == 0) goto L_0x006a;
    L_0x0043:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0060 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0060 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0060 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0060 }
        r3 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0060 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0060 }
        r1 = r1.append(r7);	 Catch:{ IllegalArgumentException -> 0x0060 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0060 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0060 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0068 }
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x00ab }
        if (r0 == 0) goto L_0x008e;
    L_0x006e:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r3 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1 = r1.append(r7);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x00ab }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x00ab }
    L_0x008e:
        r0 = r6.mAdded;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0.add(r7);	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0 = 1;
        r7.mAdded = r0;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0 = r7.mHasMenu;	 Catch:{ IllegalArgumentException -> 0x00ad }
        if (r0 == 0) goto L_0x00a1;
    L_0x009a:
        r0 = r7.mMenuVisible;	 Catch:{ IllegalArgumentException -> 0x00af }
        if (r0 == 0) goto L_0x00a1;
    L_0x009e:
        r0 = 1;
        r6.mNeedMenuInvalidate = r0;	 Catch:{ IllegalArgumentException -> 0x00af }
    L_0x00a1:
        r2 = r6.mCurState;
        r0 = r6;
        r1 = r7;
        r3 = r8;
        r4 = r9;
        r0.moveToState(r1, r2, r3, r4, r5);
    L_0x00aa:
        return;
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.attachFragment(android.support.v4.app.Fragment, int, int):void");
    }

    static {
        boolean z = true;
        String[] strArr = new String[187];
        String str = "N5pt\tYj=";
        boolean z2 = true;
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
                        i3 = 60;
                        break;
                    case ay.f /*1*/:
                        i3 = 80;
                        break;
                    case ay.n /*2*/:
                        i3 = 29;
                        break;
                    case ay.p /*3*/:
                        i3 = 27;
                        break;
                    default:
                        i3 = 127;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z2) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u001cppU\u001aY4P~\u0011I\u0019sm\u001eP9yz\u000bYm";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "l5s\u007f\u0016R7=Z\u001cH9ru\f\u0006";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001cp>";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001cp>";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001cppU\u0010h\"|u\f]3ir\u0010R#_~\u001c]%n~B";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r\u001c=th\u001c\u001c#iz\u000bYj";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "Q\u0011kz\u0016P\u0012|x\u0014o$|x\u0014u>yr\u001cY#';";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    str = "~1~p_o$|x\u0014\u001c\u0019s\u007f\u0016_5n!";
                    z2 = true;
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    strArr2 = strArr3;
                    str = "\u001cppZ\t]9qR\u0011X9~~\f\u0006p";
                    z2 = true;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001cppZ\u001cH9kr\u000bEm";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "}3ir\tYp[i\u001e[=xu\u000bOptu_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "~1~p_o$|x\u0014\u0006";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u001cppX\u0010R$|r\u0011Y\" ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u001cp>";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u001cppX\nN\u0003iz\u000bYm";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u001cppK\u001eN5soB";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u001c=Y~\fH\"rb\u001aXm";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "}4y~\u001b\u001c\u0016oz\u0018Q5so\f\u0006";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u001cp>";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    str = "\u001cp>";
                    z2 = true;
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    strArr2 = strArr3;
                    str = "\u001cp>";
                    z2 = true;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    str = "z\"||\u0012Y>ih_\u007f\"xz\u000bY4=V\u001aR%n!";
                    z2 = true;
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    strArr2 = strArr3;
                    str = "\u001c=No\u001eH5Nz\tY4 ";
                    z2 = true;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u001cp=;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u001c9s;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "z\"||\u0012Y>iV\u001eR1z~\rG";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "A-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "r?=z\u001cH9kr\u000bE";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "z\"x~\u0016R7=}\r]7p~\u0011Hptu\u001bY(=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "z1tw\nN5=h\u001eJ9s|_O$|o\u001a\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "O1k~>P<No\u001eH5';\u0011Sp{i\u001e[=xu\u000bOq";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "]>yi\u0010U4'o\u001eN7xo N5lD\fH1i~";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u001c8|h__<xz\rY4=r\u0011X5e!_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u001c8|h_H1o|\u001aHpst\u000b\u001c9s;\u0019N1zv\u001aR$=v\u001eR1z~\r\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u001c8|h__<xz\rY4=r\u0011X5e!_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "z1tw\nN5=h\u001eJ9s|_O$|o\u001a\u0006p|x\u000bU&x;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "]>yi\u0010U4'o\u001eN7xo O$|o\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "z1tw\nN5=h\u001eJ9s|_O$|o\u001a\u0006p|x\u000bU&x;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "O1k~>P<No\u001eH5';\u001eX4tu\u0018\u001c2|x\u0014\u001c#iz\u001cWp>";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "o1k~\u001b\u001c#iz\u000bYpr}_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "O1k~>P<No\u001eH5';\u001eX4tu\u0018\u001c6oz\u0018Q5so_\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "l?mk\u0016R7=y\u001e_;=h\u000b]3v;\fH1i~E\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "~1y;\u0016Xj=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "z1tw\u001aXpyn\u0012L9s|_O$|o\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "z1tw\u001aXpyn\u0012L9s|_O$|o\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u001cp";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u001cp";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 69;
                    str = "}3ir\tU$d;\fH1i~E";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 70;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u007f1s;\u0011S$=k\u001aN6ri\u0012\u001c$ur\f\u001c1~o\u0016S>=z\u0019H5o;\u0010R\u0003|m\u001au>no\u001eR3xH\u000b]$x";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 72;
                    str = "\u007f1s;\u0011S$=k\u001aN6ri\u0012\u001c$ur\f\u001c1~o\u0016S>=r\u0011O9y~_S6=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 73;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 74;
                    str = "T9y~E\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 75;
                    str = "z\"||\u0012Y>i;\u0011Spqt\u0011[5o;\u001aD9no\f\u001c6ri_W5d;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 76;
                    str = "\u0006ptu\u001bY(=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 77;
                    str = "\u0006ptu\u001bY(=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 78;
                    str = "z\"||\u0012Y>i;\u0011Spqt\u0011[5o;\u001aD9no\f\u001c6ri_W5d;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 79;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 80;
                    str = "O8rlE\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 81;
                    str = "N5iz\u0016R\u001eru<S>{r\u0018\u0006pv~\u001aL9s|_N5iz\u0016R5y;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 82;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 83;
                    str = "}<o~\u001eX)=z\u000bH1~s\u001aX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 84;
                    str = "q%no_^5=x\u001eP<x\u007f_Z\"rv_Q1tu_H8o~\u001eXpr}_L\"rx\u001aO#";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 85;
                    str = "n5~n\rO9k~_Y>ii\u0006\u001c$r;\u001aD5~n\u000bY\u0000xu\u001bU>zO\r]>nz\u001cH9ru\f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 86;
                    str = "\u001c$r;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 87;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 88;
                    str = "}4yr\u0011[p\u007fz\u001cWpno\u001e_;=r\u0011X5e;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 89;
                    str = "\u001c'to\u0017\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 90;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 91;
                    str = "o5io\u0016R7=y\u001e_;=h\u000b]3v;\u0016R4xc_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 92;
                    str = "]>yi\u0010U4'n\fY\"Bm\u0016O9\u007fw\u001ac8tu\u000b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 93;
                    str = "]>yi\u0010U4'm\u0016Y'Bh\u000b]$x";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 94;
                    str = "}<qt\u001c]$x\u007f_Z\"||\u0012Y>i;\u0016R4xc_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 95;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 96;
                    str = "z\"||\u0012Y>i;\u001eP\"xz\u001bEp|\u007f\u001bY4';";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 97;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 98;
                    str = "]4y!_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 99;
                    str = "\u001c'to\u0017\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 100;
                    str = "}4yr\u0011[p\u007fz\u001cWpno\u001e_;=r\u0011X5e;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 101;
                    str = "o5io\u0016R7=y\u001e_;=h\u000b]3v;\u0016R4xc_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 102;
                    str = "}4yr\u0011[p|m\u001eU<|y\u0013Yp\u007fz\u001cWpno\u001e_;=r\u0011X5e;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 103;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 104;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 105;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 106;
                    str = "\u001c$r;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 107;
                    str = "}3ir\tU$d;\u0017]#=y\u001aY>=\u007f\u001aO$ot\u0006Y4";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 108;
                    str = "\u001c9n;\u0011S$=x\nN\"xu\u000bP)=r\u0011\u001c$u~_z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 109;
                    str = "z\"||\u0012Y>i;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 110;
                    str = "z\"||\u0012Y>i;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 111;
                    str = "\u001c9n;\u0011S$=x\nN\"xu\u000bP)=r\u0011\u001c$u~_z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 112;
                    str = "S>^i\u001a]$xM\u0016Y'';\u0016Xm-c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 113;
                    str = "_<|h\f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 114;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 115;
                    str = "\u001c6sz\u0012Ym";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 116;
                    str = "\u001c5er\fH9s|B";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 117;
                    str = "\u0010pri_L1o~\u0011Hpt\u007f_\f(";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 118;
                    str = "Z\"||\u0012Y>i";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 119;
                    str = "\u001c4t\u007f_R?i;\u001cN5|o\u001a\u001c1=m\u0016Y'3";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 120;
                    str = "z\"||\u0012Y>i;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 121;
                    str = "\u0006pPn\fHpnk\u001a_9{b_I>tj\nYp|u\u001bN?t\u007fEU41;\u001eR4ot\u0016Xjiz\u0018\u0010pri_T1k~_]pmz\rY>i;\bU$u;\u001eRpt\u007f_Z?o;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 122;
                    str = "\u001c'to\u0017\u001c1st\u000bT5o;\u0019N1zv\u001aR$=}\u0010Np";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 123;
                    str = "\u0006pYn\u000fP9~z\u000bYpt\u007f_\f(";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 124;
                    str = "\u0010piz\u0018\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 125;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 126;
                    str = "z\"x~\u0016R7=y\u001e_;=h\u000b]3v;\u0016R4xc_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 127;
                    str = "r?=r\u0011O$|u\u000bU1i~\u001b\u001c6oz\u0018Q5so_Z?o;\u0016R4xc_\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 128;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 129;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 130;
                    str = "}<o~\u001eX)=z\u001bX5y:";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 131;
                    str = "\u001cxtu\u001bY(=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 132;
                    str = "\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 133;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 134;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 135;
                    str = "N5no\u0010N5\\w\u0013o$|o\u001a\u0006p|m\u001eU<=8";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 136;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 137;
                    str = "]>yi\u0010U4'm\u0016Y'Bh\u000b]$x";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 138;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 139;
                    str = "\u0015j=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 140;
                    str = "\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 141;
                    str = "N5no\u0010N5\\w\u0013o$|o\u001a\u0006po~R]$iz\u001cT9s|_N5iz\u0016R5y;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 142;
                    str = "N5no\u0010N5\\w\u0013o$|o\u001a\u0006p|\u007f\u001bY4=8";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 143;
                    str = "N5no\u0010N5\\w\u0013o$|o\u001a\u0006p\u007fz\u001cWpno\u001e_;=8";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 144;
                    str = "N5no\u0010N5\\w\u0013o$|o\u001a\u0006p|x\u000bU&x;\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 145;
                    str = "\u001c$|i\u0018Y$=u\u0010\u001c<ru\u0018Y\"=~\u0007U#ihE\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 146;
                    str = "n50z\u000bH1~s\u0016R7=i\u001aH1tu\u001aXp{i\u001e[=xu\u000b\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 147;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 148;
                    str = "\u001cp";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 149;
                    str = "]$iz\u001cTj=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 150;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 151;
                    str = "z\"||\u0012Y>i;\u001eP\"xz\u001bEp|\u007f\u001bY4';";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 152;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 153;
                    str = "]4y;\u0019N?p;\u001eH$|x\u0017\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 154;
                    str = "Q?k~\u0019N?p;>\u007f\u0004TM6h\tBX-y\u0011I^;\u0006p";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 155;
                    str = "\u001cx";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 156;
                    str = "\u0015p{t\r\u001c6oz\u0018Q5so_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 157;
                    str = "z\"||\u0012Y>i;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 158;
                    str = "Q?k~\u0019N?p;,h\u001fMK:xj=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 159;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 160;
                    str = "z\"||\u0012Y>i;";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 161;
                    str = "]>yi\u0010U4'm\u0016Y'Bh\u000b]$x";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 162;
                    str = "r?=m\u0016Y'=}\u0010I>y;\u0019S\"=r\u001b\u001c`e";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 163;
                    str = "Q?k~\u0019N?p;<n\u0015\\O:xj=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 164;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 165;
                    str = "]>yi\u0010U4'o\u001eN7xo O$|o\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 166;
                    str = "\u001c4t\u007f_R?i;\u001c]<q;\u000bT\"rn\u0018Tpit_O%m~\r\u0012?sZ\u000bH1~sW\u0015";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 167;
                    str = "\u001c4t\u007f_R?i;\u001c]<q;\u000bT\"rn\u0018Tpit_O%m~\r\u0012?s_\u001aH1~sW\u0015";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 168;
                    str = "Q?k~\u000bSp\\X+u\u0006TO&c\u0013O^>h\u0015Y!_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 169;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 170;
                    str = "Q?k~\u000bSpNO>n\u0004X_E\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 171;
                    str = "]>yi\u0010U4'o\u001eN7xo N5lD\fH1i~";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 172;
                    str = "Q?k~\u0019N?p;-y\u0003HV:xj=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 173;
                    str = "Q?k~\u000bSp^I:}\u0004X_E\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 174;
                    str = "]>yi\u0010U4'n\fY\"Bm\u0016O9\u007fw\u001ac8tu\u000b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 175;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 176;
                    str = "Q?k~\u000bSpO^,i\u001dX_E\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 177;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 178;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 179;
                    str = "Q?k~\u0019N?p;,h\u0011OO:xj=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 180;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 181;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 182;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 183;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 184;
                    str = "N5pt\tYp{i\u0010Qpy~\u000b]3u!_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 185;
                    str = "X5iz\u001cTj=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 186;
                    str = "z\"||\u0012Y>iV\u001eR1z~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        DEBUG = false;
                        if (VERSION.SDK_INT < 11) {
                            z = false;
                        }
                        HONEYCOMB = z;
                        DECELERATE_QUINT = new DecelerateInterpolator(2.5f);
                        DECELERATE_CUBIC = new DecelerateInterpolator(1.5f);
                        ACCELERATE_QUINT = new AccelerateInterpolator(2.5f);
                        ACCELERATE_CUBIC = new AccelerateInterpolator(1.5f);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                default:
                    strArr2[i] = str;
                    str = "\u001c>xh\u000bU>z&";
                    i = 1;
                    strArr2 = strArr3;
                    z2 = false;
                    break;
            }
        }
    }

    public void dispatchLowMemory() {
        boolean z = FragmentActivity.a;
        if (this.mAdded != null) {
            int i = 0;
            while (i < this.mAdded.size()) {
                Fragment fragment = (Fragment) this.mAdded.get(i);
                if (fragment != null) {
                    try {
                        fragment.performLowMemory();
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void detachFragment(android.support.v4.app.Fragment r7, int r8, int r9) {
        /*
        r6_this = this;
        r5 = 0;
        r2 = 1;
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0073 }
        if (r0 == 0) goto L_0x0026;
    L_0x0006:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r1 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0073 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0073 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r4 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0073 }
        r1 = r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r1 = r1.append(r7);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0073 }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0026:
        r0 = r7.mDetached;	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r0 != 0) goto L_0x0072;
    L_0x002a:
        r0 = 1;
        r7.mDetached = r0;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0 = r7.mAdded;	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r0 == 0) goto L_0x0072;
    L_0x0031:
        r0 = r6.mAdded;	 Catch:{ IllegalArgumentException -> 0x0079 }
        if (r0 == 0) goto L_0x005e;
    L_0x0035:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x007b }
        if (r0 == 0) goto L_0x0059;
    L_0x0039:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x007b }
        r1 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x007b }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007b }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x007b }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x007b }
        r4 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x007b }
        r1 = r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x007b }
        r1 = r1.append(r7);	 Catch:{ IllegalArgumentException -> 0x007b }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x007b }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x0059:
        r0 = r6.mAdded;
        r0.remove(r7);
    L_0x005e:
        r0 = r7.mHasMenu;	 Catch:{ IllegalArgumentException -> 0x007d }
        if (r0 == 0) goto L_0x0069;
    L_0x0062:
        r0 = r7.mMenuVisible;	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r0 == 0) goto L_0x0069;
    L_0x0066:
        r0 = 1;
        r6.mNeedMenuInvalidate = r0;	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x0069:
        r7.mAdded = r5;
        r0 = r6;
        r1 = r7;
        r3 = r8;
        r4 = r9;
        r0.moveToState(r1, r2, r3, r4, r5);
    L_0x0072:
        return;
    L_0x0073:
        r0 = move-exception;
        throw r0;
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.detachFragment(android.support.v4.app.Fragment, int, int):void");
    }

    public void dispatchActivityCreated() {
        this.mStateSaved = false;
        moveToState(2, false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(java.lang.String r12, android.content.Context r13, android.util.AttributeSet r14) {
        /*
        r11_this = this;
        r2 = 0;
        r1 = 0;
        r4 = -1;
        r10 = 1;
        r8 = android.support.v4.app.FragmentActivity.a;
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0013 }
        r3 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x0013 }
        r0 = r0.equals(r12);	 Catch:{ IllegalArgumentException -> 0x0013 }
        if (r0 != 0) goto L_0x0015;
    L_0x0012:
        return r2;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r0 = z;
        r3 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r0 = r0[r3];
        r0 = r14.getAttributeValue(r2, r0);
        r3 = android.support.v4.app.FragmentManagerImpl.FragmentTag.Fragment;
        r3 = r13.obtainStyledAttributes(r14, r3);
        if (r0 != 0) goto L_0x01d6;
    L_0x0027:
        r0 = r3.getString(r1);
        r6 = r0;
    L_0x002c:
        r7 = r3.getResourceId(r10, r4);
        r0 = 2;
        r9 = r3.getString(r0);
        r3.recycle();	 Catch:{ IllegalArgumentException -> 0x0074 }
        r0 = r11.mActivity;	 Catch:{ IllegalArgumentException -> 0x0074 }
        r0 = android.support.v4.app.Fragment.isSupportFragmentClass(r0, r6);	 Catch:{ IllegalArgumentException -> 0x0074 }
        if (r0 == 0) goto L_0x0012;
    L_0x0040:
        r0 = 0;
        if (r2 == 0) goto L_0x0078;
    L_0x0043:
        r0 = r0.getId();	 Catch:{ IllegalArgumentException -> 0x0076 }
    L_0x0047:
        if (r0 != r4) goto L_0x007a;
    L_0x0049:
        if (r7 != r4) goto L_0x007a;
    L_0x004b:
        if (r9 != 0) goto L_0x007a;
    L_0x004d:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0072 }
        r2 = r14.getPositionDescription();	 Catch:{ IllegalArgumentException -> 0x0072 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0072 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r3 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0072 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0072 }
        r1 = r1.append(r6);	 Catch:{ IllegalArgumentException -> 0x0072 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0072 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0072 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r0 = r1;
        goto L_0x0047;
    L_0x007a:
        if (r7 == r4) goto L_0x0157;
    L_0x007c:
        r1 = r11.findFragmentById(r7);	 Catch:{ IllegalArgumentException -> 0x0155 }
    L_0x0080:
        if (r1 != 0) goto L_0x0088;
    L_0x0082:
        if (r9 == 0) goto L_0x0088;
    L_0x0084:
        r1 = r11.findFragmentByTag(r9);
    L_0x0088:
        if (r1 != 0) goto L_0x0090;
    L_0x008a:
        if (r0 == r4) goto L_0x0090;
    L_0x008c:
        r1 = r11.findFragmentById(r0);
    L_0x0090:
        r2 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x015a }
        if (r2 == 0) goto L_0x00d4;
    L_0x0094:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x015a }
        r3 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x015a }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x015a }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x015a }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x015a }
        r5 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x015a }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x015a }
        r4 = java.lang.Integer.toHexString(r7);	 Catch:{ IllegalArgumentException -> 0x015a }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x015a }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x015a }
        r5 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x015a }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x015a }
        r3 = r3.append(r6);	 Catch:{ IllegalArgumentException -> 0x015a }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x015a }
        r5 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x015a }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x015a }
        r3 = r3.append(r1);	 Catch:{ IllegalArgumentException -> 0x015a }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x015a }
        android.util.Log.v(r2, r3);	 Catch:{ IllegalArgumentException -> 0x015a }
    L_0x00d4:
        if (r1 != 0) goto L_0x00f8;
    L_0x00d6:
        r1 = android.support.v4.app.Fragment.instantiate(r13, r6);
        r2 = 1;
        r1.mFromLayout = r2;	 Catch:{ IllegalArgumentException -> 0x015c }
        if (r7 == 0) goto L_0x015e;
    L_0x00df:
        r2 = r7;
    L_0x00e0:
        r1.mFragmentId = r2;	 Catch:{ IllegalArgumentException -> 0x0160 }
        r1.mContainerId = r0;	 Catch:{ IllegalArgumentException -> 0x0160 }
        r1.mTag = r9;	 Catch:{ IllegalArgumentException -> 0x0160 }
        r2 = 1;
        r1.mInLayout = r2;	 Catch:{ IllegalArgumentException -> 0x0160 }
        r1.mFragmentManager = r11;	 Catch:{ IllegalArgumentException -> 0x0160 }
        r2 = r11.mActivity;	 Catch:{ IllegalArgumentException -> 0x0160 }
        r3 = r1.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0160 }
        r1.onInflate(r2, r14, r3);	 Catch:{ IllegalArgumentException -> 0x0160 }
        r2 = 1;
        r11.addFragment(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0160 }
        if (r8 == 0) goto L_0x0170;
    L_0x00f8:
        r2 = r1.mInLayout;	 Catch:{ IllegalArgumentException -> 0x0153 }
        if (r2 == 0) goto L_0x0162;
    L_0x00fc:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0153 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0153 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0153 }
        r3 = r14.getPositionDescription();	 Catch:{ IllegalArgumentException -> 0x0153 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0153 }
        r4 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0153 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r3 = java.lang.Integer.toHexString(r7);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0153 }
        r4 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0153 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r2 = r2.append(r9);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0153 }
        r4 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0153 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r0 = java.lang.Integer.toHexString(r0);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r0 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0153 }
        r3 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0153 }
        r0 = r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r0 = r0.append(r6);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x0153 }
        r1.<init>(r0);	 Catch:{ IllegalArgumentException -> 0x0153 }
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0153 }
    L_0x0153:
        r0 = move-exception;
        throw r0;
    L_0x0155:
        r0 = move-exception;
        throw r0;
    L_0x0157:
        r1 = r2;
        goto L_0x0080;
    L_0x015a:
        r0 = move-exception;
        throw r0;
    L_0x015c:
        r0 = move-exception;
        throw r0;
    L_0x015e:
        r2 = r0;
        goto L_0x00e0;
    L_0x0160:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0153 }
    L_0x0162:
        r0 = 1;
        r1.mInLayout = r0;	 Catch:{ IllegalArgumentException -> 0x01b2 }
        r0 = r1.mRetaining;	 Catch:{ IllegalArgumentException -> 0x01b2 }
        if (r0 != 0) goto L_0x0170;
    L_0x0169:
        r0 = r11.mActivity;	 Catch:{ IllegalArgumentException -> 0x01b2 }
        r2 = r1.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x01b2 }
        r1.onInflate(r0, r14, r2);	 Catch:{ IllegalArgumentException -> 0x01b2 }
    L_0x0170:
        r0 = r11.mCurState;	 Catch:{ IllegalArgumentException -> 0x01b4 }
        if (r0 >= r10) goto L_0x0182;
    L_0x0174:
        r0 = r1.mFromLayout;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        if (r0 == 0) goto L_0x0182;
    L_0x0178:
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r0 = r11;
        r0.moveToState(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x01b8 }
        if (r8 == 0) goto L_0x0185;
    L_0x0182:
        r11.moveToState(r1);	 Catch:{ IllegalArgumentException -> 0x01b8 }
    L_0x0185:
        r0 = r1.mView;	 Catch:{ IllegalArgumentException -> 0x01b0 }
        if (r0 != 0) goto L_0x01ba;
    L_0x0189:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x01b0 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01b0 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x01b0 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x01b0 }
        r3 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x01b0 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x01b0 }
        r1 = r1.append(r6);	 Catch:{ IllegalArgumentException -> 0x01b0 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x01b0 }
        r3 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x01b0 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x01b0 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x01b0 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x01b0 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01b0 }
    L_0x01b0:
        r0 = move-exception;
        throw r0;
    L_0x01b2:
        r0 = move-exception;
        throw r0;
    L_0x01b4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01b6 }
    L_0x01b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01b8 }
    L_0x01b8:
        r0 = move-exception;
        throw r0;
    L_0x01ba:
        if (r7 == 0) goto L_0x01c1;
    L_0x01bc:
        r0 = r1.mView;	 Catch:{ IllegalArgumentException -> 0x01d2 }
        r0.setId(r7);	 Catch:{ IllegalArgumentException -> 0x01d2 }
    L_0x01c1:
        r0 = r1.mView;	 Catch:{ IllegalArgumentException -> 0x01d4 }
        r0 = r0.getTag();	 Catch:{ IllegalArgumentException -> 0x01d4 }
        if (r0 != 0) goto L_0x01ce;
    L_0x01c9:
        r0 = r1.mView;	 Catch:{ IllegalArgumentException -> 0x01d4 }
        r0.setTag(r9);	 Catch:{ IllegalArgumentException -> 0x01d4 }
    L_0x01ce:
        r2 = r1.mView;
        goto L_0x0012;
    L_0x01d2:
        r0 = move-exception;
        throw r0;
    L_0x01d4:
        r0 = move-exception;
        throw r0;
    L_0x01d6:
        r6 = r0;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.onCreateView(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public boolean popBackStackImmediate() {
        checkStateLoss();
        executePendingTransactions();
        return popBackStackState(this.mActivity.mHandler, null, -1, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void restoreAllState(android.os.Parcelable r10, java.util.ArrayList r11) {
        /*
        r9_this = this;
        r2 = 0;
        r4 = android.support.v4.app.FragmentActivity.a;
        if (r10 != 0) goto L_0x0006;
    L_0x0005:
        return;
    L_0x0006:
        r10 = (android.support.v4.app.FragmentManagerState) r10;
        r0 = r10.mActive;	 Catch:{ IllegalArgumentException -> 0x0212 }
        if (r0 == 0) goto L_0x0005;
    L_0x000c:
        if (r11 == 0) goto L_0x007b;
    L_0x000e:
        r1 = r2;
    L_0x000f:
        r0 = r11.size();
        if (r1 >= r0) goto L_0x007b;
    L_0x0015:
        r0 = r11.get(r1);
        r0 = (android.support.v4.app.Fragment) r0;
        r3 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0214 }
        if (r3 == 0) goto L_0x003f;
    L_0x001f:
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0214 }
        r5 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x0214 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0214 }
        r5.<init>();	 Catch:{ IllegalArgumentException -> 0x0214 }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x0214 }
        r7 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x0214 }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x0214 }
        r5 = r5.append(r0);	 Catch:{ IllegalArgumentException -> 0x0214 }
        r5 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0214 }
        android.util.Log.v(r3, r5);	 Catch:{ IllegalArgumentException -> 0x0214 }
    L_0x003f:
        r3 = r10.mActive;
        r5 = r0.mIndex;
        r3 = r3[r5];
        r3.mInstance = r0;	 Catch:{ IllegalArgumentException -> 0x0216 }
        r5 = 0;
        r0.mSavedViewState = r5;	 Catch:{ IllegalArgumentException -> 0x0216 }
        r5 = 0;
        r0.mBackStackNesting = r5;	 Catch:{ IllegalArgumentException -> 0x0216 }
        r5 = 0;
        r0.mInLayout = r5;	 Catch:{ IllegalArgumentException -> 0x0216 }
        r5 = 0;
        r0.mAdded = r5;	 Catch:{ IllegalArgumentException -> 0x0216 }
        r5 = 0;
        r0.mTarget = r5;	 Catch:{ IllegalArgumentException -> 0x0216 }
        r5 = r3.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0216 }
        if (r5 == 0) goto L_0x0077;
    L_0x005a:
        r5 = r3.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0216 }
        r6 = r9.mActivity;	 Catch:{ IllegalArgumentException -> 0x0216 }
        r6 = r6.getClassLoader();	 Catch:{ IllegalArgumentException -> 0x0216 }
        r5.setClassLoader(r6);	 Catch:{ IllegalArgumentException -> 0x0216 }
        r5 = r3.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0216 }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x0216 }
        r7 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x0216 }
        r5 = r5.getSparseParcelableArray(r6);	 Catch:{ IllegalArgumentException -> 0x0216 }
        r0.mSavedViewState = r5;	 Catch:{ IllegalArgumentException -> 0x0216 }
        r3 = r3.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0216 }
        r0.mSavedFragmentState = r3;	 Catch:{ IllegalArgumentException -> 0x0216 }
    L_0x0077:
        r0 = r1 + 1;
        if (r4 == 0) goto L_0x02d6;
    L_0x007b:
        r0 = new java.util.ArrayList;	 Catch:{ IllegalArgumentException -> 0x0218 }
        r1 = r10.mActive;	 Catch:{ IllegalArgumentException -> 0x0218 }
        r1 = r1.length;	 Catch:{ IllegalArgumentException -> 0x0218 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0218 }
        r9.mActive = r0;	 Catch:{ IllegalArgumentException -> 0x0218 }
        r0 = r9.mAvailIndices;	 Catch:{ IllegalArgumentException -> 0x0218 }
        if (r0 == 0) goto L_0x008e;
    L_0x0089:
        r0 = r9.mAvailIndices;	 Catch:{ IllegalArgumentException -> 0x0218 }
        r0.clear();	 Catch:{ IllegalArgumentException -> 0x0218 }
    L_0x008e:
        r0 = r2;
    L_0x008f:
        r1 = r10.mActive;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x0120;
    L_0x0094:
        r1 = r10.mActive;
        r1 = r1[r0];
        if (r1 == 0) goto L_0x00de;
    L_0x009a:
        r3 = r9.mActivity;
        r5 = r9.mParent;
        r3 = r1.instantiate(r3, r5);
        r5 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x021a }
        if (r5 == 0) goto L_0x00d4;
    L_0x00a6:
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x021a }
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r5 = r5[r6];	 Catch:{ IllegalArgumentException -> 0x021a }
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x021a }
        r6.<init>();	 Catch:{ IllegalArgumentException -> 0x021a }
        r7 = z;	 Catch:{ IllegalArgumentException -> 0x021a }
        r8 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r7 = r7[r8];	 Catch:{ IllegalArgumentException -> 0x021a }
        r6 = r6.append(r7);	 Catch:{ IllegalArgumentException -> 0x021a }
        r6 = r6.append(r0);	 Catch:{ IllegalArgumentException -> 0x021a }
        r7 = z;	 Catch:{ IllegalArgumentException -> 0x021a }
        r8 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r7 = r7[r8];	 Catch:{ IllegalArgumentException -> 0x021a }
        r6 = r6.append(r7);	 Catch:{ IllegalArgumentException -> 0x021a }
        r6 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x021a }
        r6 = r6.toString();	 Catch:{ IllegalArgumentException -> 0x021a }
        android.util.Log.v(r5, r6);	 Catch:{ IllegalArgumentException -> 0x021a }
    L_0x00d4:
        r5 = r9.mActive;	 Catch:{ IllegalArgumentException -> 0x021c }
        r5.add(r3);	 Catch:{ IllegalArgumentException -> 0x021c }
        r3 = 0;
        r1.mInstance = r3;	 Catch:{ IllegalArgumentException -> 0x021c }
        if (r4 == 0) goto L_0x011c;
    L_0x00de:
        r1 = r9.mActive;	 Catch:{ IllegalArgumentException -> 0x021e }
        r3 = 0;
        r1.add(r3);	 Catch:{ IllegalArgumentException -> 0x021e }
        r1 = r9.mAvailIndices;	 Catch:{ IllegalArgumentException -> 0x021e }
        if (r1 != 0) goto L_0x00ef;
    L_0x00e8:
        r1 = new java.util.ArrayList;	 Catch:{ IllegalArgumentException -> 0x021e }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x021e }
        r9.mAvailIndices = r1;	 Catch:{ IllegalArgumentException -> 0x021e }
    L_0x00ef:
        r1 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0220 }
        if (r1 == 0) goto L_0x0113;
    L_0x00f3:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0220 }
        r3 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x0220 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0220 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x0220 }
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x0220 }
        r6 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r5 = r5[r6];	 Catch:{ IllegalArgumentException -> 0x0220 }
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0220 }
        r3 = r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x0220 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0220 }
        android.util.Log.v(r1, r3);	 Catch:{ IllegalArgumentException -> 0x0220 }
    L_0x0113:
        r1 = r9.mAvailIndices;
        r3 = java.lang.Integer.valueOf(r0);
        r1.add(r3);
    L_0x011c:
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x008f;
    L_0x0120:
        if (r11 == 0) goto L_0x0182;
    L_0x0122:
        r3 = r2;
    L_0x0123:
        r0 = r11.size();
        if (r3 >= r0) goto L_0x0182;
    L_0x0129:
        r0 = r11.get(r3);
        r0 = (android.support.v4.app.Fragment) r0;
        r1 = r0.mTargetIndex;	 Catch:{ IllegalArgumentException -> 0x0222 }
        if (r1 < 0) goto L_0x017e;
    L_0x0133:
        r1 = r0.mTargetIndex;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r5 = r9.mActive;	 Catch:{ IllegalArgumentException -> 0x0224 }
        r5 = r5.size();	 Catch:{ IllegalArgumentException -> 0x0224 }
        if (r1 >= r5) goto L_0x014b;
    L_0x013d:
        r1 = r9.mActive;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r5 = r0.mTargetIndex;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r1 = r1.get(r5);	 Catch:{ IllegalArgumentException -> 0x0226 }
        r1 = (android.support.v4.app.Fragment) r1;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r0.mTarget = r1;	 Catch:{ IllegalArgumentException -> 0x0226 }
        if (r4 == 0) goto L_0x017e;
    L_0x014b:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r5 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r1 = r1[r5];	 Catch:{ IllegalArgumentException -> 0x0226 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r5.<init>();	 Catch:{ IllegalArgumentException -> 0x0226 }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r7 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x0226 }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x0226 }
        r5 = r5.append(r0);	 Catch:{ IllegalArgumentException -> 0x0226 }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r7 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x0226 }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x0226 }
        r6 = r0.mTargetIndex;	 Catch:{ IllegalArgumentException -> 0x0226 }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x0226 }
        r5 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0226 }
        android.util.Log.w(r1, r5);	 Catch:{ IllegalArgumentException -> 0x0226 }
        r1 = 0;
        r0.mTarget = r1;	 Catch:{ IllegalArgumentException -> 0x0226 }
    L_0x017e:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x02d3;
    L_0x0182:
        r0 = r10.mAdded;
        if (r0 == 0) goto L_0x0237;
    L_0x0186:
        r0 = new java.util.ArrayList;
        r1 = r10.mAdded;
        r1 = r1.length;
        r0.<init>(r1);
        r9.mAdded = r0;
        r1 = r2;
    L_0x0191:
        r0 = r10.mAdded;
        r0 = r0.length;
        if (r1 >= r0) goto L_0x0235;
    L_0x0196:
        r0 = r9.mActive;
        r3 = r10.mAdded;
        r3 = r3[r1];
        r0 = r0.get(r3);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r0 != 0) goto L_0x01c7;
    L_0x01a4:
        r3 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r5.<init>();	 Catch:{ IllegalArgumentException -> 0x0228 }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r7 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x0228 }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x0228 }
        r6 = r10.mAdded;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r6 = r6[r1];	 Catch:{ IllegalArgumentException -> 0x0228 }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x0228 }
        r5 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0228 }
        r3.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0228 }
        r9.throwException(r3);	 Catch:{ IllegalArgumentException -> 0x0228 }
    L_0x01c7:
        r3 = 1;
        r0.mAdded = r3;	 Catch:{ IllegalArgumentException -> 0x022a }
        r3 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x022a }
        if (r3 == 0) goto L_0x01fc;
    L_0x01ce:
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r3 = r3[r5];	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x022a }
        r5.<init>();	 Catch:{ IllegalArgumentException -> 0x022a }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x022a }
        r7 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = r5.append(r1);	 Catch:{ IllegalArgumentException -> 0x022a }
        r6 = z;	 Catch:{ IllegalArgumentException -> 0x022a }
        r7 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r6 = r6[r7];	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = r5.append(r6);	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = r5.append(r0);	 Catch:{ IllegalArgumentException -> 0x022a }
        r5 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x022a }
        android.util.Log.v(r3, r5);	 Catch:{ IllegalArgumentException -> 0x022a }
    L_0x01fc:
        r3 = r9.mAdded;	 Catch:{ IllegalArgumentException -> 0x0210 }
        r3 = r3.contains(r0);	 Catch:{ IllegalArgumentException -> 0x0210 }
        if (r3 == 0) goto L_0x022c;
    L_0x0204:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0210 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0210 }
        r2 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0210 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0210 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0210 }
    L_0x0210:
        r0 = move-exception;
        throw r0;
    L_0x0212:
        r0 = move-exception;
        throw r0;
    L_0x0214:
        r0 = move-exception;
        throw r0;
    L_0x0216:
        r0 = move-exception;
        throw r0;
    L_0x0218:
        r0 = move-exception;
        throw r0;
    L_0x021a:
        r0 = move-exception;
        throw r0;
    L_0x021c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x021e }
    L_0x021e:
        r0 = move-exception;
        throw r0;
    L_0x0220:
        r0 = move-exception;
        throw r0;
    L_0x0222:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0224 }
    L_0x0224:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0226 }
    L_0x0226:
        r0 = move-exception;
        throw r0;
    L_0x0228:
        r0 = move-exception;
        throw r0;
    L_0x022a:
        r0 = move-exception;
        throw r0;
    L_0x022c:
        r3 = r9.mAdded;
        r3.add(r0);
        r0 = r1 + 1;
        if (r4 == 0) goto L_0x02d0;
    L_0x0235:
        if (r4 == 0) goto L_0x023a;
    L_0x0237:
        r0 = 0;
        r9.mAdded = r0;	 Catch:{ IllegalArgumentException -> 0x02cc }
    L_0x023a:
        r0 = r10.mBackStack;
        if (r0 == 0) goto L_0x02c5;
    L_0x023e:
        r0 = new java.util.ArrayList;
        r1 = r10.mBackStack;
        r1 = r1.length;
        r0.<init>(r1);
        r9.mBackStack = r0;
        r0 = r2;
    L_0x0249:
        r1 = r10.mBackStack;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x02c3;
    L_0x024e:
        r1 = r10.mBackStack;
        r1 = r1[r0];
        r1 = r1.instantiate(r9);
        r3 = DEBUG;
        if (r3 == 0) goto L_0x02b1;
    L_0x025a:
        r3 = z;
        r5 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r3 = r3[r5];
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r0);
        r6 = z;
        r7 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r6 = r1.mIndex;
        r5 = r5.append(r6);
        r6 = z;
        r7 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r1);
        r5 = r5.toString();
        android.util.Log.v(r3, r5);
        r3 = new android.support.v4.util.LogWriter;
        r5 = z;
        r6 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r5 = r5[r6];
        r3.<init>(r5);
        r5 = new java.io.PrintWriter;
        r5.<init>(r3);
        r3 = z;
        r6 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r3 = r3[r6];
        r1.dump(r3, r5, r2);
    L_0x02b1:
        r3 = r9.mBackStack;	 Catch:{ IllegalArgumentException -> 0x02ce }
        r3.add(r1);	 Catch:{ IllegalArgumentException -> 0x02ce }
        r3 = r1.mIndex;	 Catch:{ IllegalArgumentException -> 0x02ce }
        if (r3 < 0) goto L_0x02bf;
    L_0x02ba:
        r3 = r1.mIndex;	 Catch:{ IllegalArgumentException -> 0x02ce }
        r9.setBackStackIndex(r3, r1);	 Catch:{ IllegalArgumentException -> 0x02ce }
    L_0x02bf:
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x0249;
    L_0x02c3:
        if (r4 == 0) goto L_0x0005;
    L_0x02c5:
        r0 = 0;
        r9.mBackStack = r0;	 Catch:{ IllegalArgumentException -> 0x02ca }
        goto L_0x0005;
    L_0x02ca:
        r0 = move-exception;
        throw r0;
    L_0x02cc:
        r0 = move-exception;
        throw r0;
    L_0x02ce:
        r0 = move-exception;
        throw r0;
    L_0x02d0:
        r1 = r0;
        goto L_0x0191;
    L_0x02d3:
        r3 = r0;
        goto L_0x0123;
    L_0x02d6:
        r1 = r0;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.restoreAllState(android.os.Parcelable, java.util.ArrayList):void");
    }

    void startPendingDeferredFragments() {
        boolean z = FragmentActivity.a;
        try {
            if (this.mActive != null) {
                int i = 0;
                while (i < this.mActive.size()) {
                    Fragment fragment = (Fragment) this.mActive.get(i);
                    if (fragment != null) {
                        try {
                            performPendingDeferredStart(fragment);
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    int i2 = i + 1;
                    if (!z) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void freeBackStackIndex(int i) {
        synchronized (this) {
            try {
                this.mBackStackIndices.set(i, null);
                if (this.mAvailBackStackIndices == null) {
                    this.mAvailBackStackIndices = new ArrayList();
                }
                if (DEBUG) {
                    Log.v(z[125], z[126] + i);
                }
                this.mAvailBackStackIndices.add(Integer.valueOf(i));
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
    }

    Bundle saveFragmentBasicState(Fragment fragment) {
        try {
            Bundle bundle;
            if (this.mStateBundle == null) {
                this.mStateBundle = new Bundle();
            }
            fragment.performSaveInstanceState(this.mStateBundle);
            if (this.mStateBundle.isEmpty()) {
                bundle = null;
            } else {
                bundle = this.mStateBundle;
                this.mStateBundle = null;
            }
            try {
                if (fragment.mView != null) {
                    saveFragmentViewState(fragment);
                }
                try {
                    if (fragment.mSavedViewState != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray(z[93], fragment.mSavedViewState);
                    }
                    try {
                        if (!fragment.mUserVisibleHint) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putBoolean(z[92], fragment.mUserVisibleHint);
                        }
                        return bundle;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public void dispatchCreate() {
        this.mStateSaved = false;
        moveToState(1, false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void makeActive(android.support.v4.app.Fragment r5) {
        /*
        r4_this = this;
        r0 = r5.mIndex;	 Catch:{ IllegalArgumentException -> 0x0005 }
        if (r0 < 0) goto L_0x0007;
    L_0x0004:
        return;
    L_0x0005:
        r0 = move-exception;
        throw r0;
    L_0x0007:
        r0 = r4.mAvailIndices;	 Catch:{ IllegalArgumentException -> 0x0079 }
        if (r0 == 0) goto L_0x0013;
    L_0x000b:
        r0 = r4.mAvailIndices;	 Catch:{ IllegalArgumentException -> 0x007b }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x007b }
        if (r0 > 0) goto L_0x0032;
    L_0x0013:
        r0 = r4.mActive;	 Catch:{ IllegalArgumentException -> 0x007d }
        if (r0 != 0) goto L_0x001e;
    L_0x0017:
        r0 = new java.util.ArrayList;	 Catch:{ IllegalArgumentException -> 0x007d }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x007d }
        r4.mActive = r0;	 Catch:{ IllegalArgumentException -> 0x007d }
    L_0x001e:
        r0 = r4.mActive;	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x007f }
        r1 = r4.mParent;	 Catch:{ IllegalArgumentException -> 0x007f }
        r5.setIndex(r0, r1);	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = r4.mActive;	 Catch:{ IllegalArgumentException -> 0x007f }
        r0.add(r5);	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = android.support.v4.app.FragmentActivity.a;	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r0 == 0) goto L_0x0052;
    L_0x0032:
        r0 = r4.mAvailIndices;	 Catch:{ IllegalArgumentException -> 0x007f }
        r1 = r4.mAvailIndices;	 Catch:{ IllegalArgumentException -> 0x007f }
        r1 = r1.size();	 Catch:{ IllegalArgumentException -> 0x007f }
        r1 = r1 + -1;
        r0 = r0.remove(r1);	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = r0.intValue();	 Catch:{ IllegalArgumentException -> 0x007f }
        r1 = r4.mParent;	 Catch:{ IllegalArgumentException -> 0x007f }
        r5.setIndex(r0, r1);	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = r4.mActive;	 Catch:{ IllegalArgumentException -> 0x007f }
        r1 = r5.mIndex;	 Catch:{ IllegalArgumentException -> 0x007f }
        r0.set(r1, r5);	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x0052:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r0 == 0) goto L_0x0004;
    L_0x0056:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = 95;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r3 = 94;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0077 }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0077 }
        goto L_0x0004;
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.makeActive(android.support.v4.app.Fragment):void");
    }

    public void dispatchStop() {
        this.mStateSaved = true;
        moveToState(3, false);
    }

    Animation loadAnimation(Fragment fragment, int i, boolean z, int i2) {
        Animation onCreateAnimation = fragment.onCreateAnimation(i, z, fragment.mNextAnim);
        if (onCreateAnimation != null) {
            return onCreateAnimation;
        }
        if (fragment.mNextAnim != 0) {
            onCreateAnimation = AnimationUtils.loadAnimation(this.mActivity, fragment.mNextAnim);
            if (onCreateAnimation != null) {
                return onCreateAnimation;
            }
        }
        if (i == 0) {
            return null;
        }
        int transitToStyleIndex = transitToStyleIndex(i, z);
        if (transitToStyleIndex < 0) {
            return null;
        }
        switch (transitToStyleIndex) {
            case ay.f /*1*/:
                try {
                    return makeOpenCloseAnimation(this.mActivity, 1.125f, 1.0f, 0.0f, 1.0f);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case ay.n /*2*/:
                return makeOpenCloseAnimation(this.mActivity, 1.0f, 0.975f, 1.0f, 0.0f);
            case ay.p /*3*/:
                return makeOpenCloseAnimation(this.mActivity, 0.975f, 1.0f, 0.0f, 1.0f);
            case aj.i /*4*/:
                return makeOpenCloseAnimation(this.mActivity, 1.0f, 1.075f, 1.0f, 0.0f);
            case aV.r /*5*/:
                return makeFadeAnimation(this.mActivity, 0.0f, 1.0f);
            case aV.i /*6*/:
                return makeFadeAnimation(this.mActivity, 1.0f, 0.0f);
            default:
                if (i2 == 0) {
                    try {
                        if (this.mActivity.getWindow() != null) {
                            i2 = this.mActivity.getWindow().getAttributes().windowAnimations;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                return i2 == 0 ? null : null;
        }
    }

    public boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        boolean z = FragmentActivity.a;
        if (this.mAdded == null) {
            return false;
        }
        int i = 0;
        while (i < this.mAdded.size()) {
            Fragment fragment = (Fragment) this.mAdded.get(i);
            if (fragment != null) {
                try {
                    if (fragment.performOptionsItemSelected(menuItem)) {
                        return true;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            int i2 = i + 1;
            if (z) {
                return false;
            }
            i = i2;
        }
        return false;
    }

    public boolean dispatchCreateOptionsMenu(android.view.Menu r8, android.view.MenuInflater r9) {
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
        r7_this = this;
        r3 = 0;
        r5 = android.support.v4.app.FragmentActivity.a;
        r1 = 0;
        r0 = r7.mAdded;
        if (r0 == 0) goto L_0x005d;
    L_0x0008:
        r2 = r3;
        r4 = r3;
    L_0x000a:
        r0 = r7.mAdded;
        r0 = r0.size();
        if (r2 >= r0) goto L_0x0031;
    L_0x0012:
        r0 = r7.mAdded;
        r0 = r0.get(r2);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r0 == 0) goto L_0x002d;
    L_0x001c:
        r6 = r0.performCreateOptionsMenu(r8, r9);	 Catch:{ IllegalArgumentException -> 0x0057 }
        if (r6 == 0) goto L_0x002d;
    L_0x0022:
        r4 = 1;
        if (r1 != 0) goto L_0x002a;
    L_0x0025:
        r1 = new java.util.ArrayList;
        r1.<init>();
    L_0x002a:
        r1.add(r0);
    L_0x002d:
        r0 = r2 + 1;
        if (r5 == 0) goto L_0x005b;
    L_0x0031:
        r0 = r7.mCreatedMenus;
        if (r0 == 0) goto L_0x0054;
    L_0x0035:
        r0 = r7.mCreatedMenus;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x0054;
    L_0x003d:
        r0 = r7.mCreatedMenus;
        r0 = r0.get(r3);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r1 == 0) goto L_0x004d;
    L_0x0047:
        r2 = r1.contains(r0);	 Catch:{ IllegalArgumentException -> 0x0059 }
        if (r2 != 0) goto L_0x0050;	 Catch:{ IllegalArgumentException -> 0x0059 }
    L_0x004d:
        r0.onDestroyOptionsMenu();	 Catch:{ IllegalArgumentException -> 0x0059 }
    L_0x0050:
        r3 = r3 + 1;
        if (r5 == 0) goto L_0x0035;
    L_0x0054:
        r7.mCreatedMenus = r1;
        return r4;
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r2 = r0;
        goto L_0x000a;
    L_0x005d:
        r4 = r3;
        goto L_0x0031;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.dispatchCreateOptionsMenu(android.view.Menu, android.view.MenuInflater):boolean");
    }

    public Fragment findFragmentByTag(String str) {
        boolean z = FragmentActivity.a;
        try {
            int size;
            Fragment fragment;
            int i;
            if (!(this.mAdded == null || str == null)) {
                size = this.mAdded.size() - 1;
                while (size >= 0) {
                    fragment = (Fragment) this.mAdded.get(size);
                    if (fragment != null) {
                        try {
                            if (str.equals(fragment.mTag)) {
                                return fragment;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    i = size - 1;
                    if (!z) {
                        size = i;
                    }
                }
            }
            try {
                break;
                if (!(this.mActive == null || str == null)) {
                    size = this.mActive.size() - 1;
                    while (size >= 0) {
                        fragment = (Fragment) this.mActive.get(size);
                        if (fragment != null) {
                            try {
                                if (str.equals(fragment.mTag)) {
                                    return fragment;
                                }
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        }
                        i = size - 1;
                        if (z) {
                            break;
                        }
                        size = i;
                    }
                }
                return null;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public void dispatchDestroyView() {
        moveToState(1, false);
    }

    public void dispatchPause() {
        moveToState(4, false);
    }

    FragmentManagerImpl() {
        this.mCurState = 0;
        this.mStateBundle = null;
        this.mStateArray = null;
        this.mExecCommit = new Runnable() {
            final FragmentManagerImpl this$0;

            public void run() {
                this.this$0.execPendingActions();
            }

            {
                this.this$0 = r1;
            }
        };
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void hideFragment(android.support.v4.app.Fragment r6, int r7, int r8) {
        /*
        r5_this = this;
        r4 = 1;
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0056 }
        if (r0 == 0) goto L_0x0025;
    L_0x0005:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0056 }
        r1 = 73;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0056 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0056 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0056 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0056 }
        r3 = 74;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0056 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0056 }
        r1 = r1.append(r6);	 Catch:{ IllegalArgumentException -> 0x0056 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0056 }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0056 }
    L_0x0025:
        r0 = r6.mHidden;	 Catch:{ IllegalArgumentException -> 0x0058 }
        if (r0 != 0) goto L_0x0055;
    L_0x0029:
        r0 = 1;
        r6.mHidden = r0;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r0 = r6.mView;	 Catch:{ IllegalArgumentException -> 0x0058 }
        if (r0 == 0) goto L_0x0043;
    L_0x0030:
        r0 = 0;
        r0 = r5.loadAnimation(r6, r7, r0, r8);
        if (r0 == 0) goto L_0x003c;
    L_0x0037:
        r1 = r6.mView;	 Catch:{ IllegalArgumentException -> 0x005a }
        r1.startAnimation(r0);	 Catch:{ IllegalArgumentException -> 0x005a }
    L_0x003c:
        r0 = r6.mView;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0043:
        r0 = r6.mAdded;	 Catch:{ IllegalArgumentException -> 0x005c }
        if (r0 == 0) goto L_0x0052;
    L_0x0047:
        r0 = r6.mHasMenu;	 Catch:{ IllegalArgumentException -> 0x005e }
        if (r0 == 0) goto L_0x0052;
    L_0x004b:
        r0 = r6.mMenuVisible;	 Catch:{ IllegalArgumentException -> 0x0060 }
        if (r0 == 0) goto L_0x0052;
    L_0x004f:
        r0 = 1;
        r5.mNeedMenuInvalidate = r0;	 Catch:{ IllegalArgumentException -> 0x0060 }
    L_0x0052:
        r6.onHiddenChanged(r4);
    L_0x0055:
        return;
    L_0x0056:
        r0 = move-exception;
        throw r0;
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r0 = move-exception;
        throw r0;
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.hideFragment(android.support.v4.app.Fragment, int, int):void");
    }

    public void dispatchConfigurationChanged(Configuration configuration) {
        boolean z = FragmentActivity.a;
        if (this.mAdded != null) {
            int i = 0;
            while (i < this.mAdded.size()) {
                Fragment fragment = (Fragment) this.mAdded.get(i);
                if (fragment != null) {
                    try {
                        fragment.performConfigurationChanged(configuration);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public void dispatchStart() {
        this.mStateSaved = false;
        moveToState(4, false);
    }

    public boolean executePendingTransactions() {
        return execPendingActions();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setBackStackIndex(int r7, android.support.v4.app.BackStackRecord r8) {
        /*
        r6_this = this;
        r1 = android.support.v4.app.FragmentActivity.a;
        monitor-enter(r6);
        r0 = r6.mBackStackIndices;	 Catch:{ all -> 0x00d0 }
        if (r0 != 0) goto L_0x000e;
    L_0x0007:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x00d0 }
        r0.<init>();	 Catch:{ all -> 0x00d0 }
        r6.mBackStackIndices = r0;	 Catch:{ all -> 0x00d0 }
    L_0x000e:
        r0 = r6.mBackStackIndices;	 Catch:{ all -> 0x00d0 }
        r0 = r0.size();	 Catch:{ all -> 0x00d0 }
        if (r7 >= r0) goto L_0x004f;
    L_0x0016:
        r2 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x00cc }
        if (r2 == 0) goto L_0x0048;
    L_0x001a:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x00ce }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r5 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = r3.append(r7);	 Catch:{ IllegalArgumentException -> 0x00ce }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r5 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = r3.append(r8);	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00ce }
        android.util.Log.v(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00ce }
    L_0x0048:
        r2 = r6.mBackStackIndices;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r2.set(r7, r8);	 Catch:{ IllegalArgumentException -> 0x00d3 }
        if (r1 == 0) goto L_0x00ca;
    L_0x004f:
        if (r0 >= r7) goto L_0x0093;
    L_0x0051:
        r2 = r6.mBackStackIndices;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r3 = 0;
        r2.add(r3);	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r2 = r6.mAvailBackStackIndices;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        if (r2 != 0) goto L_0x0062;
    L_0x005b:
        r2 = new java.util.ArrayList;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r6.mAvailBackStackIndices = r2;	 Catch:{ IllegalArgumentException -> 0x00d5 }
    L_0x0062:
        r2 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        if (r2 == 0) goto L_0x0086;
    L_0x0066:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r3 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r5 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r3 = r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00d7 }
        android.util.Log.v(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00d7 }
    L_0x0086:
        r2 = r6.mAvailBackStackIndices;	 Catch:{ all -> 0x00d0 }
        r3 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x00d0 }
        r2.add(r3);	 Catch:{ all -> 0x00d0 }
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x004f;
    L_0x0093:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        if (r0 == 0) goto L_0x00c5;
    L_0x0097:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r3 = 100;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = r1.append(r7);	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r3 = 99;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = r1.append(r8);	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x00d9 }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x00d9 }
    L_0x00c5:
        r0 = r6.mBackStackIndices;	 Catch:{ all -> 0x00d0 }
        r0.add(r8);	 Catch:{ all -> 0x00d0 }
    L_0x00ca:
        monitor-exit(r6);	 Catch:{ all -> 0x00d0 }
        return;
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ce }
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x00d0 }
        throw r0;
    L_0x00d3:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00d0 }
    L_0x00d5:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00d0 }
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00d0 }
    L_0x00d9:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00d0 }
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.setBackStackIndex(int, android.support.v4.app.BackStackRecord):void");
    }

    public SavedState saveFragmentInstanceState(Fragment fragment) {
        try {
            if (fragment.mIndex < 0) {
                throwException(new IllegalStateException(z[110] + fragment + z[111]));
            }
            if (fragment.mState <= 0) {
                return null;
            }
            Bundle saveFragmentBasicState = saveFragmentBasicState(fragment);
            if (saveFragmentBasicState == null) {
                return null;
            }
            try {
                return new SavedState(saveFragmentBasicState);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public Fragment findFragmentById(int i) {
        int size;
        Fragment fragment;
        int i2;
        boolean z = FragmentActivity.a;
        if (this.mAdded != null) {
            size = this.mAdded.size() - 1;
            while (size >= 0) {
                fragment = (Fragment) this.mAdded.get(size);
                if (fragment != null) {
                    try {
                        if (fragment.mFragmentId == i) {
                            return fragment;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                i2 = size - 1;
                if (z) {
                    break;
                }
                size = i2;
            }
        }
        if (this.mActive != null) {
            size = this.mActive.size() - 1;
            while (size >= 0) {
                fragment = (Fragment) this.mActive.get(size);
                if (fragment != null) {
                    try {
                        if (fragment.mFragmentId == i) {
                            return fragment;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                i2 = size - 1;
                if (z) {
                    break;
                }
                size = i2;
            }
        }
        return null;
    }

    void moveToState(Fragment fragment) {
        moveToState(fragment, this.mCurState, 0, 0, false);
    }

    static Animation makeOpenCloseAnimation(Context context, float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(DECELERATE_QUINT);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        scaleAnimation = new AlphaAnimation(f3, f4);
        scaleAnimation.setInterpolator(DECELERATE_CUBIC);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void showFragment(android.support.v4.app.Fragment r7, int r8, int r9) {
        /*
        r6_this = this;
        r5 = 1;
        r4 = 0;
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0054 }
        if (r0 == 0) goto L_0x0026;
    L_0x0006:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r1 = 79;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0054 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r3 = 80;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0054 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r1 = r1.append(r7);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0054 }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0026:
        r0 = r7.mHidden;	 Catch:{ IllegalArgumentException -> 0x0056 }
        if (r0 == 0) goto L_0x0053;
    L_0x002a:
        r0 = 0;
        r7.mHidden = r0;	 Catch:{ IllegalArgumentException -> 0x0056 }
        r0 = r7.mView;	 Catch:{ IllegalArgumentException -> 0x0056 }
        if (r0 == 0) goto L_0x0041;
    L_0x0031:
        r0 = r6.loadAnimation(r7, r8, r5, r9);
        if (r0 == 0) goto L_0x003c;
    L_0x0037:
        r1 = r7.mView;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r1.startAnimation(r0);	 Catch:{ IllegalArgumentException -> 0x0058 }
    L_0x003c:
        r0 = r7.mView;
        r0.setVisibility(r4);
    L_0x0041:
        r0 = r7.mAdded;	 Catch:{ IllegalArgumentException -> 0x005a }
        if (r0 == 0) goto L_0x0050;
    L_0x0045:
        r0 = r7.mHasMenu;	 Catch:{ IllegalArgumentException -> 0x005c }
        if (r0 == 0) goto L_0x0050;
    L_0x0049:
        r0 = r7.mMenuVisible;	 Catch:{ IllegalArgumentException -> 0x005e }
        if (r0 == 0) goto L_0x0050;
    L_0x004d:
        r0 = 1;
        r6.mNeedMenuInvalidate = r0;	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x0050:
        r7.onHiddenChanged(r4);
    L_0x0053:
        return;
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r0 = move-exception;
        throw r0;
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.showFragment(android.support.v4.app.Fragment, int, int):void");
    }

    Factory getLayoutInflaterFactory() {
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void throwException(java.lang.RuntimeException r6) {
        /*
        r5_this = this;
        r0 = z;
        r1 = 65;
        r0 = r0[r1];
        r1 = r6.getMessage();
        android.util.Log.e(r0, r1);
        r0 = z;
        r1 = 61;
        r0 = r0[r1];
        r1 = z;
        r2 = 69;
        r1 = r1[r2];
        android.util.Log.e(r0, r1);
        r0 = new android.support.v4.util.LogWriter;
        r1 = z;
        r2 = 66;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = new java.io.PrintWriter;
        r1.<init>(r0);
        r0 = r5.mActivity;
        if (r0 == 0) goto L_0x0054;
    L_0x0030:
        r0 = r5.mActivity;	 Catch:{ Exception -> 0x0040 }
        r2 = z;	 Catch:{ Exception -> 0x0040 }
        r3 = 68;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0040 }
        r3 = 0;
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ Exception -> 0x0040 }
        r0.dump(r2, r3, r1, r4);	 Catch:{ Exception -> 0x0040 }
    L_0x003f:
        throw r6;
    L_0x0040:
        r0 = move-exception;
        r2 = z;
        r3 = 62;
        r2 = r2[r3];
        r3 = z;
        r4 = 63;
        r3 = r3[r4];
        android.util.Log.e(r2, r3, r0);
        r0 = android.support.v4.app.FragmentActivity.a;
        if (r0 == 0) goto L_0x003f;
    L_0x0054:
        r0 = z;	 Catch:{ Exception -> 0x0062 }
        r2 = 67;
        r0 = r0[r2];	 Catch:{ Exception -> 0x0062 }
        r2 = 0;
        r3 = 0;
        r3 = new java.lang.String[r3];	 Catch:{ Exception -> 0x0062 }
        r5.dump(r0, r2, r1, r3);	 Catch:{ Exception -> 0x0062 }
        goto L_0x003f;
    L_0x0062:
        r0 = move-exception;
        r1 = z;
        r2 = 70;
        r1 = r1[r2];
        r2 = z;
        r3 = 64;
        r2 = r2[r3];
        android.util.Log.e(r1, r2, r0);
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.throwException(java.lang.RuntimeException):void");
    }

    ArrayList retainNonConfig() {
        boolean z = FragmentActivity.a;
        if (this.mActive == null) {
            return null;
        }
        ArrayList arrayList = null;
        int i = 0;
        while (i < this.mActive.size()) {
            Fragment fragment = (Fragment) this.mActive.get(i);
            if (fragment != null) {
                try {
                    if (fragment.mRetainInstance) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        try {
                            arrayList.add(fragment);
                            fragment.mRetaining = true;
                            try {
                                fragment.mTargetIndex = fragment.mTarget != null ? fragment.mTarget.mIndex : -1;
                                if (DEBUG) {
                                    Log.v(z[82], z[81] + fragment);
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            int i2 = i + 1;
            if (z) {
                return arrayList;
            }
            i = i2;
        }
        return arrayList;
    }

    public Fragment getFragment(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        try {
            if (i >= this.mActive.size()) {
                throwException(new IllegalStateException(z[75] + str + z[76] + i));
            }
            Fragment fragment = (Fragment) this.mActive.get(i);
            if (fragment != null) {
                return fragment;
            }
            try {
                throwException(new IllegalStateException(z[78] + str + z[77] + i));
                return fragment;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void attachActivity(FragmentActivity fragmentActivity, FragmentContainer fragmentContainer, Fragment fragment) {
        try {
            if (this.mActivity != null) {
                throw new IllegalStateException(z[83]);
            }
            this.mActivity = fragmentActivity;
            this.mContainer = fragmentContainer;
            this.mParent = fragment;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean dispatchPrepareOptionsMenu(Menu menu) {
        boolean z = FragmentActivity.a;
        if (this.mAdded == null) {
            return false;
        }
        int i = 0;
        boolean z2 = false;
        while (i < this.mAdded.size()) {
            Fragment fragment = (Fragment) this.mAdded.get(i);
            if (fragment != null) {
                try {
                    if (fragment.performPrepareOptionsMenu(menu)) {
                        z2 = true;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            int i2 = i + 1;
            if (z) {
                return z2;
            }
            i = i2;
        }
        return z2;
    }

    public int allocBackStackIndex(BackStackRecord backStackRecord) {
        int intValue;
        synchronized (this) {
            try {
                try {
                    if (this.mAvailBackStackIndices != null) {
                        if (this.mAvailBackStackIndices.size() > 0) {
                            intValue = ((Integer) this.mAvailBackStackIndices.remove(this.mAvailBackStackIndices.size() - 1)).intValue();
                            if (DEBUG) {
                                Log.v(z[87], z[88] + intValue + z[89] + backStackRecord);
                            }
                            this.mBackStackIndices.set(intValue, backStackRecord);
                        }
                    }
                    if (this.mBackStackIndices == null) {
                        this.mBackStackIndices = new ArrayList();
                    }
                    intValue = this.mBackStackIndices.size();
                    if (DEBUG) {
                        Log.v(z[90], z[91] + intValue + z[86] + backStackRecord);
                    }
                    this.mBackStackIndices.add(backStackRecord);
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            } catch (Throwable th) {
            }
        }
        return intValue;
    }

    public void addFragment(Fragment fragment, boolean z) {
        try {
            if (this.mAdded == null) {
                this.mAdded = new ArrayList();
            }
            try {
                if (DEBUG) {
                    Log.v(z[97], z[98] + fragment);
                }
                try {
                    makeActive(fragment);
                    if (!fragment.mDetached) {
                        if (this.mAdded.contains(fragment)) {
                            throw new IllegalStateException(z[96] + fragment);
                        }
                        try {
                            this.mAdded.add(fragment);
                            fragment.mAdded = true;
                            fragment.mRemoving = false;
                            if (fragment.mHasMenu) {
                                if (fragment.mMenuVisible) {
                                    this.mNeedMenuInvalidate = true;
                                }
                            }
                            if (z) {
                                try {
                                    moveToState(fragment);
                                } catch (IllegalArgumentException e) {
                                    throw e;
                                }
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        } catch (IllegalArgumentException e222222) {
            throw e222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    android.os.Parcelable saveAllState() {
        /*
        r13_this = this;
        r4 = 1;
        r2 = 0;
        r3 = 0;
        r6 = android.support.v4.app.FragmentActivity.a;
        r13.execPendingActions();	 Catch:{ IllegalArgumentException -> 0x001c }
        r0 = HONEYCOMB;	 Catch:{ IllegalArgumentException -> 0x001c }
        if (r0 == 0) goto L_0x000f;
    L_0x000c:
        r0 = 1;
        r13.mStateSaved = r0;	 Catch:{ IllegalArgumentException -> 0x001c }
    L_0x000f:
        r0 = r13.mActive;	 Catch:{ IllegalArgumentException -> 0x001e }
        if (r0 == 0) goto L_0x001b;
    L_0x0013:
        r0 = r13.mActive;	 Catch:{ IllegalArgumentException -> 0x0020 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x0020 }
        if (r0 > 0) goto L_0x0022;
    L_0x001b:
        return r2;
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r0 = r13.mActive;
        r7 = r0.size();
        r8 = new android.support.v4.app.FragmentState[r7];
        r5 = r3;
        r1 = r3;
    L_0x002c:
        if (r5 >= r7) goto L_0x025e;
    L_0x002e:
        r0 = r13.mActive;
        r0 = r0.get(r5);
        r0 = (android.support.v4.app.Fragment) r0;
        if (r0 == 0) goto L_0x025b;
    L_0x0038:
        r1 = r0.mIndex;	 Catch:{ IllegalArgumentException -> 0x013a }
        if (r1 >= 0) goto L_0x006b;
    L_0x003c:
        r1 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x013a }
        r9 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x013a }
        r9.<init>();	 Catch:{ IllegalArgumentException -> 0x013a }
        r10 = z;	 Catch:{ IllegalArgumentException -> 0x013a }
        r11 = 50;
        r10 = r10[r11];	 Catch:{ IllegalArgumentException -> 0x013a }
        r9 = r9.append(r10);	 Catch:{ IllegalArgumentException -> 0x013a }
        r9 = r9.append(r0);	 Catch:{ IllegalArgumentException -> 0x013a }
        r10 = z;	 Catch:{ IllegalArgumentException -> 0x013a }
        r11 = 46;
        r10 = r10[r11];	 Catch:{ IllegalArgumentException -> 0x013a }
        r9 = r9.append(r10);	 Catch:{ IllegalArgumentException -> 0x013a }
        r10 = r0.mIndex;	 Catch:{ IllegalArgumentException -> 0x013a }
        r9 = r9.append(r10);	 Catch:{ IllegalArgumentException -> 0x013a }
        r9 = r9.toString();	 Catch:{ IllegalArgumentException -> 0x013a }
        r1.<init>(r9);	 Catch:{ IllegalArgumentException -> 0x013a }
        r13.throwException(r1);	 Catch:{ IllegalArgumentException -> 0x013a }
    L_0x006b:
        r1 = new android.support.v4.app.FragmentState;
        r1.<init>(r0);
        r8[r5] = r1;	 Catch:{ IllegalArgumentException -> 0x013c }
        r9 = r0.mState;	 Catch:{ IllegalArgumentException -> 0x013c }
        if (r9 <= 0) goto L_0x00e4;
    L_0x0076:
        r9 = r1.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x013e }
        if (r9 != 0) goto L_0x00e4;
    L_0x007a:
        r9 = r13.saveFragmentBasicState(r0);	 Catch:{ IllegalArgumentException -> 0x0140 }
        r1.mSavedFragmentState = r9;	 Catch:{ IllegalArgumentException -> 0x0140 }
        r9 = r0.mTarget;	 Catch:{ IllegalArgumentException -> 0x0140 }
        if (r9 == 0) goto L_0x00e8;
    L_0x0084:
        r9 = r0.mTarget;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r9 = r9.mIndex;	 Catch:{ IllegalArgumentException -> 0x0142 }
        if (r9 >= 0) goto L_0x00b9;
    L_0x008a:
        r9 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r10 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r10.<init>();	 Catch:{ IllegalArgumentException -> 0x0142 }
        r11 = z;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r12 = 41;
        r11 = r11[r12];	 Catch:{ IllegalArgumentException -> 0x0142 }
        r10 = r10.append(r11);	 Catch:{ IllegalArgumentException -> 0x0142 }
        r10 = r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x0142 }
        r11 = z;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r12 = 47;
        r11 = r11[r12];	 Catch:{ IllegalArgumentException -> 0x0142 }
        r10 = r10.append(r11);	 Catch:{ IllegalArgumentException -> 0x0142 }
        r11 = r0.mTarget;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r10 = r10.append(r11);	 Catch:{ IllegalArgumentException -> 0x0142 }
        r10 = r10.toString();	 Catch:{ IllegalArgumentException -> 0x0142 }
        r9.<init>(r10);	 Catch:{ IllegalArgumentException -> 0x0142 }
        r13.throwException(r9);	 Catch:{ IllegalArgumentException -> 0x0142 }
    L_0x00b9:
        r9 = r1.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0144 }
        if (r9 != 0) goto L_0x00c4;
    L_0x00bd:
        r9 = new android.os.Bundle;	 Catch:{ IllegalArgumentException -> 0x0144 }
        r9.<init>();	 Catch:{ IllegalArgumentException -> 0x0144 }
        r1.mSavedFragmentState = r9;	 Catch:{ IllegalArgumentException -> 0x0144 }
    L_0x00c4:
        r9 = r1.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0146 }
        r10 = z;	 Catch:{ IllegalArgumentException -> 0x0146 }
        r11 = 53;
        r10 = r10[r11];	 Catch:{ IllegalArgumentException -> 0x0146 }
        r11 = r0.mTarget;	 Catch:{ IllegalArgumentException -> 0x0146 }
        r13.putFragment(r9, r10, r11);	 Catch:{ IllegalArgumentException -> 0x0146 }
        r9 = r0.mTargetRequestCode;	 Catch:{ IllegalArgumentException -> 0x0146 }
        if (r9 == 0) goto L_0x00e8;
    L_0x00d5:
        r9 = r1.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0148 }
        r10 = z;	 Catch:{ IllegalArgumentException -> 0x0148 }
        r11 = 44;
        r10 = r10[r11];	 Catch:{ IllegalArgumentException -> 0x0148 }
        r11 = r0.mTargetRequestCode;	 Catch:{ IllegalArgumentException -> 0x0148 }
        r9.putInt(r10, r11);	 Catch:{ IllegalArgumentException -> 0x0148 }
        if (r6 == 0) goto L_0x00e8;
    L_0x00e4:
        r9 = r0.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x0148 }
        r1.mSavedFragmentState = r9;	 Catch:{ IllegalArgumentException -> 0x0148 }
    L_0x00e8:
        r9 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x014a }
        if (r9 == 0) goto L_0x0258;
    L_0x00ec:
        r9 = z;	 Catch:{ IllegalArgumentException -> 0x014a }
        r10 = 51;
        r9 = r9[r10];	 Catch:{ IllegalArgumentException -> 0x014a }
        r10 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x014a }
        r10.<init>();	 Catch:{ IllegalArgumentException -> 0x014a }
        r11 = z;	 Catch:{ IllegalArgumentException -> 0x014a }
        r12 = 56;
        r11 = r11[r12];	 Catch:{ IllegalArgumentException -> 0x014a }
        r10 = r10.append(r11);	 Catch:{ IllegalArgumentException -> 0x014a }
        r0 = r10.append(r0);	 Catch:{ IllegalArgumentException -> 0x014a }
        r10 = z;	 Catch:{ IllegalArgumentException -> 0x014a }
        r11 = 48;
        r10 = r10[r11];	 Catch:{ IllegalArgumentException -> 0x014a }
        r0 = r0.append(r10);	 Catch:{ IllegalArgumentException -> 0x014a }
        r1 = r1.mSavedFragmentState;	 Catch:{ IllegalArgumentException -> 0x014a }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x014a }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x014a }
        android.util.Log.v(r9, r0);	 Catch:{ IllegalArgumentException -> 0x014a }
        r0 = r4;
    L_0x011d:
        r1 = r5 + 1;
        if (r6 == 0) goto L_0x0254;
    L_0x0121:
        if (r0 != 0) goto L_0x014c;
    L_0x0123:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0138 }
        if (r0 == 0) goto L_0x001b;
    L_0x0127:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0138 }
        r1 = 45;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0138 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0138 }
        r3 = 43;
        r1 = r1[r3];	 Catch:{ IllegalArgumentException -> 0x0138 }
        android.util.Log.v(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0138 }
        goto L_0x001b;
    L_0x0138:
        r0 = move-exception;
        throw r0;
    L_0x013a:
        r0 = move-exception;
        throw r0;
    L_0x013c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x013e }
    L_0x013e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0140 }
    L_0x0140:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0142 }
    L_0x0142:
        r0 = move-exception;
        throw r0;
    L_0x0144:
        r0 = move-exception;
        throw r0;
    L_0x0146:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0148 }
    L_0x0148:
        r0 = move-exception;
        throw r0;
    L_0x014a:
        r0 = move-exception;
        throw r0;
    L_0x014c:
        r0 = r13.mAdded;
        if (r0 == 0) goto L_0x0252;
    L_0x0150:
        r0 = r13.mAdded;
        r5 = r0.size();
        if (r5 <= 0) goto L_0x0252;
    L_0x0158:
        r1 = new int[r5];
        r4 = r3;
    L_0x015b:
        if (r4 >= r5) goto L_0x01de;
    L_0x015d:
        r0 = r13.mAdded;	 Catch:{ IllegalArgumentException -> 0x0247 }
        r0 = r0.get(r4);	 Catch:{ IllegalArgumentException -> 0x0247 }
        r0 = (android.support.v4.app.Fragment) r0;	 Catch:{ IllegalArgumentException -> 0x0247 }
        r0 = r0.mIndex;	 Catch:{ IllegalArgumentException -> 0x0247 }
        r1[r4] = r0;	 Catch:{ IllegalArgumentException -> 0x0247 }
        r0 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x0247 }
        if (r0 >= 0) goto L_0x01a2;
    L_0x016d:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0247 }
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0247 }
        r7.<init>();	 Catch:{ IllegalArgumentException -> 0x0247 }
        r9 = z;	 Catch:{ IllegalArgumentException -> 0x0247 }
        r10 = 54;
        r9 = r9[r10];	 Catch:{ IllegalArgumentException -> 0x0247 }
        r7 = r7.append(r9);	 Catch:{ IllegalArgumentException -> 0x0247 }
        r9 = r13.mAdded;	 Catch:{ IllegalArgumentException -> 0x0247 }
        r9 = r9.get(r4);	 Catch:{ IllegalArgumentException -> 0x0247 }
        r7 = r7.append(r9);	 Catch:{ IllegalArgumentException -> 0x0247 }
        r9 = z;	 Catch:{ IllegalArgumentException -> 0x0247 }
        r10 = 49;
        r9 = r9[r10];	 Catch:{ IllegalArgumentException -> 0x0247 }
        r7 = r7.append(r9);	 Catch:{ IllegalArgumentException -> 0x0247 }
        r9 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x0247 }
        r7 = r7.append(r9);	 Catch:{ IllegalArgumentException -> 0x0247 }
        r7 = r7.toString();	 Catch:{ IllegalArgumentException -> 0x0247 }
        r0.<init>(r7);	 Catch:{ IllegalArgumentException -> 0x0247 }
        r13.throwException(r0);	 Catch:{ IllegalArgumentException -> 0x0247 }
    L_0x01a2:
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x0249 }
        if (r0 == 0) goto L_0x01da;
    L_0x01a6:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0249 }
        r7 = 42;
        r0 = r0[r7];	 Catch:{ IllegalArgumentException -> 0x0249 }
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0249 }
        r7.<init>();	 Catch:{ IllegalArgumentException -> 0x0249 }
        r9 = z;	 Catch:{ IllegalArgumentException -> 0x0249 }
        r10 = 57;
        r9 = r9[r10];	 Catch:{ IllegalArgumentException -> 0x0249 }
        r7 = r7.append(r9);	 Catch:{ IllegalArgumentException -> 0x0249 }
        r7 = r7.append(r4);	 Catch:{ IllegalArgumentException -> 0x0249 }
        r9 = z;	 Catch:{ IllegalArgumentException -> 0x0249 }
        r10 = 40;
        r9 = r9[r10];	 Catch:{ IllegalArgumentException -> 0x0249 }
        r7 = r7.append(r9);	 Catch:{ IllegalArgumentException -> 0x0249 }
        r9 = r13.mAdded;	 Catch:{ IllegalArgumentException -> 0x0249 }
        r9 = r9.get(r4);	 Catch:{ IllegalArgumentException -> 0x0249 }
        r7 = r7.append(r9);	 Catch:{ IllegalArgumentException -> 0x0249 }
        r7 = r7.toString();	 Catch:{ IllegalArgumentException -> 0x0249 }
        android.util.Log.v(r0, r7);	 Catch:{ IllegalArgumentException -> 0x0249 }
    L_0x01da:
        r0 = r4 + 1;
        if (r6 == 0) goto L_0x024f;
    L_0x01de:
        r0 = r13.mBackStack;
        if (r0 == 0) goto L_0x0239;
    L_0x01e2:
        r0 = r13.mBackStack;
        r4 = r0.size();
        if (r4 <= 0) goto L_0x0239;
    L_0x01ea:
        r2 = new android.support.v4.app.BackStackState[r4];
    L_0x01ec:
        if (r3 >= r4) goto L_0x0239;
    L_0x01ee:
        r5 = new android.support.v4.app.BackStackState;	 Catch:{ IllegalArgumentException -> 0x024b }
        r0 = r13.mBackStack;	 Catch:{ IllegalArgumentException -> 0x024b }
        r0 = r0.get(r3);	 Catch:{ IllegalArgumentException -> 0x024b }
        r0 = (android.support.v4.app.BackStackRecord) r0;	 Catch:{ IllegalArgumentException -> 0x024b }
        r5.<init>(r13, r0);	 Catch:{ IllegalArgumentException -> 0x024b }
        r2[r3] = r5;	 Catch:{ IllegalArgumentException -> 0x024b }
        r0 = DEBUG;	 Catch:{ IllegalArgumentException -> 0x024b }
        if (r0 == 0) goto L_0x0235;
    L_0x0201:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x024b }
        r5 = 52;
        r0 = r0[r5];	 Catch:{ IllegalArgumentException -> 0x024b }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x024b }
        r5.<init>();	 Catch:{ IllegalArgumentException -> 0x024b }
        r7 = z;	 Catch:{ IllegalArgumentException -> 0x024b }
        r9 = 55;
        r7 = r7[r9];	 Catch:{ IllegalArgumentException -> 0x024b }
        r5 = r5.append(r7);	 Catch:{ IllegalArgumentException -> 0x024b }
        r5 = r5.append(r3);	 Catch:{ IllegalArgumentException -> 0x024b }
        r7 = z;	 Catch:{ IllegalArgumentException -> 0x024b }
        r9 = 39;
        r7 = r7[r9];	 Catch:{ IllegalArgumentException -> 0x024b }
        r5 = r5.append(r7);	 Catch:{ IllegalArgumentException -> 0x024b }
        r7 = r13.mBackStack;	 Catch:{ IllegalArgumentException -> 0x024b }
        r7 = r7.get(r3);	 Catch:{ IllegalArgumentException -> 0x024b }
        r5 = r5.append(r7);	 Catch:{ IllegalArgumentException -> 0x024b }
        r5 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x024b }
        android.util.Log.v(r0, r5);	 Catch:{ IllegalArgumentException -> 0x024b }
    L_0x0235:
        r0 = r3 + 1;
        if (r6 == 0) goto L_0x024d;
    L_0x0239:
        r0 = new android.support.v4.app.FragmentManagerState;
        r0.<init>();
        r0.mActive = r8;
        r0.mAdded = r1;
        r0.mBackStack = r2;
        r2 = r0;
        goto L_0x001b;
    L_0x0247:
        r0 = move-exception;
        throw r0;
    L_0x0249:
        r0 = move-exception;
        throw r0;
    L_0x024b:
        r0 = move-exception;
        throw r0;
    L_0x024d:
        r3 = r0;
        goto L_0x01ec;
    L_0x024f:
        r4 = r0;
        goto L_0x015b;
    L_0x0252:
        r1 = r2;
        goto L_0x01de;
    L_0x0254:
        r5 = r1;
        r1 = r0;
        goto L_0x002c;
    L_0x0258:
        r0 = r4;
        goto L_0x011d;
    L_0x025b:
        r0 = r1;
        goto L_0x011d;
    L_0x025e:
        r0 = r1;
        goto L_0x0121;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.saveAllState():android.os.Parcelable");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r3_this = this;
        r0 = new java.lang.StringBuilder;
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0.<init>(r1);
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0044 }
        r2 = 34;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0044 }
        r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r1 = java.lang.System.identityHashCode(r3);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r1 = java.lang.Integer.toHexString(r1);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0044 }
        r2 = 33;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0044 }
        r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r1 = r3.mParent;	 Catch:{ IllegalArgumentException -> 0x0044 }
        if (r1 == 0) goto L_0x0031;
    L_0x0028:
        r1 = r3.mParent;	 Catch:{ IllegalArgumentException -> 0x0046 }
        android.support.v4.util.DebugUtils.buildShortClassTag(r1, r0);	 Catch:{ IllegalArgumentException -> 0x0046 }
        r1 = android.support.v4.app.FragmentActivity.a;	 Catch:{ IllegalArgumentException -> 0x0046 }
        if (r1 == 0) goto L_0x0036;
    L_0x0031:
        r1 = r3.mActivity;	 Catch:{ IllegalArgumentException -> 0x0046 }
        android.support.v4.util.DebugUtils.buildShortClassTag(r1, r0);	 Catch:{ IllegalArgumentException -> 0x0046 }
    L_0x0036:
        r1 = z;
        r2 = 35;
        r1 = r1[r2];
        r0.append(r1);
        r0 = r0.toString();
        return r0;
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.toString():java.lang.String");
    }

    public void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions();
        moveToState(0, false);
        this.mActivity = null;
        this.mContainer = null;
        this.mParent = null;
    }

    void makeInactive(Fragment fragment) {
        try {
            if (fragment.mIndex >= 0) {
                try {
                    if (DEBUG) {
                        Log.v(z[38], z[37] + fragment);
                    }
                    try {
                        this.mActive.set(fragment.mIndex, null);
                        if (this.mAvailIndices == null) {
                            this.mAvailIndices = new ArrayList();
                        }
                        this.mAvailIndices.add(Integer.valueOf(fragment.mIndex));
                        this.mActivity.invalidateSupportFragment(fragment.mWho);
                        fragment.initState();
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        Fragment fragment;
        int i2;
        int i3 = 0;
        boolean z = FragmentActivity.a;
        String str2 = str + z[31];
        if (this.mActive != null) {
            size = this.mActive.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print(z[14]);
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                i = 0;
                while (i < size) {
                    fragment = (Fragment) this.mActive.get(i);
                    try {
                        printWriter.print(str);
                        printWriter.print(z[6]);
                        printWriter.print(i);
                        printWriter.print(z[32]);
                        printWriter.println(fragment);
                        if (fragment != null) {
                            fragment.dump(str2, fileDescriptor, printWriter, strArr);
                        }
                        i2 = i + 1;
                        if (z) {
                            break;
                        }
                        i = i2;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
        }
        if (this.mAdded != null) {
            size = this.mAdded.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println(z[24]);
                i = 0;
                while (i < size) {
                    fragment = (Fragment) this.mAdded.get(i);
                    printWriter.print(str);
                    printWriter.print(z[18]);
                    printWriter.print(i);
                    printWriter.print(z[20]);
                    printWriter.println(fragment.toString());
                    i2 = i + 1;
                    if (z) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        if (this.mCreatedMenus != null) {
            size = this.mCreatedMenus.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println(z[29]);
                i = 0;
                while (i < size) {
                    fragment = (Fragment) this.mCreatedMenus.get(i);
                    printWriter.print(str);
                    printWriter.print(z[7]);
                    printWriter.print(i);
                    printWriter.print(z[19]);
                    printWriter.println(fragment.toString());
                    i2 = i + 1;
                    if (z) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        if (this.mBackStack != null) {
            size = this.mBackStack.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println(z[16]);
                i = 0;
                while (i < size) {
                    BackStackRecord backStackRecord = (BackStackRecord) this.mBackStack.get(i);
                    printWriter.print(str);
                    printWriter.print(z[25]);
                    printWriter.print(i);
                    printWriter.print(z[15]);
                    printWriter.println(backStackRecord.toString());
                    backStackRecord.dump(str2, fileDescriptor, printWriter, strArr);
                    i2 = i + 1;
                    if (z) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        synchronized (this) {
            if (this.mBackStackIndices != null) {
                int size2 = this.mBackStackIndices.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println(z[11]);
                    i = 0;
                    while (i < size2) {
                        backStackRecord = (BackStackRecord) this.mBackStackIndices.get(i);
                        printWriter.print(str);
                        printWriter.print(z[27]);
                        printWriter.print(i);
                        printWriter.print(z[26]);
                        printWriter.println(backStackRecord);
                        i2 = i + 1;
                        if (!z) {
                            i = i2;
                        }
                    }
                }
            }
            try {
                break;
                if (this.mAvailBackStackIndices != null && this.mAvailBackStackIndices.size() > 0) {
                    printWriter.print(str);
                    printWriter.print(z[10]);
                    printWriter.println(Arrays.toString(this.mAvailBackStackIndices.toArray()));
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        if (this.mPendingActions != null) {
            i = this.mPendingActions.size();
            if (i > 0) {
                printWriter.print(str);
                printWriter.println(z[4]);
                while (i3 < i) {
                    Runnable runnable = (Runnable) this.mPendingActions.get(i3);
                    printWriter.print(str);
                    printWriter.print(z[28]);
                    printWriter.print(i3);
                    printWriter.print(z[5]);
                    printWriter.println(runnable);
                    i2 = i3 + 1;
                    if (!z) {
                        i3 = i2;
                    }
                }
            }
        }
        try {
            break;
            printWriter.print(str);
            printWriter.println(z[9]);
            printWriter.print(str);
            printWriter.print(z[13]);
            printWriter.println(this.mActivity);
            printWriter.print(str);
            printWriter.print(z[17]);
            printWriter.println(this.mContainer);
            if (this.mParent != null) {
                printWriter.print(str);
                printWriter.print(z[22]);
                printWriter.println(this.mParent);
            }
            try {
                printWriter.print(str);
                printWriter.print(z[21]);
                printWriter.print(this.mCurState);
                printWriter.print(z[30]);
                printWriter.print(this.mStateSaved);
                printWriter.print(z[23]);
                printWriter.println(this.mDestroyed);
                if (this.mNeedMenuInvalidate) {
                    printWriter.print(str);
                    printWriter.print(z[3]);
                    printWriter.println(this.mNeedMenuInvalidate);
                }
                try {
                    if (this.mNoTransactionsBecause != null) {
                        printWriter.print(str);
                        printWriter.print(z[8]);
                        printWriter.println(this.mNoTransactionsBecause);
                    }
                    try {
                        if (this.mAvailIndices == null) {
                            return;
                        }
                        if (this.mAvailIndices.size() > 0) {
                            printWriter.print(str);
                            printWriter.print(z[12]);
                            printWriter.println(Arrays.toString(this.mAvailIndices.toArray()));
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    } catch (IllegalArgumentException e2222) {
                        throw e2222;
                    }
                } catch (IllegalArgumentException e22222) {
                    throw e22222;
                }
            } catch (IllegalArgumentException e222222) {
                throw e222222;
            }
        } catch (IllegalArgumentException e2222222) {
            throw e2222222;
        }
    }

    public void noteStateNotSaved() {
        this.mStateSaved = false;
    }

    public void popBackStack(int i, int i2) {
        if (i < 0) {
            try {
                throw new IllegalArgumentException(z[60] + i);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        enqueueAction(new AnonymousClass_4(this, i, i2), false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void saveFragmentViewState(android.support.v4.app.Fragment r3) {
        /*
        r2_this = this;
        r0 = r3.mInnerView;	 Catch:{ IllegalArgumentException -> 0x0005 }
        if (r0 != 0) goto L_0x0007;
    L_0x0004:
        return;
    L_0x0005:
        r0 = move-exception;
        throw r0;
    L_0x0007:
        r0 = r2.mStateArray;	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r0 != 0) goto L_0x0016;
    L_0x000b:
        r0 = new android.util.SparseArray;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0036 }
        r2.mStateArray = r0;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r0 = android.support.v4.app.FragmentActivity.a;	 Catch:{ IllegalArgumentException -> 0x0036 }
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r2.mStateArray;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r0.clear();	 Catch:{ IllegalArgumentException -> 0x0036 }
    L_0x001b:
        r0 = r3.mInnerView;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r1 = r2.mStateArray;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0.saveHierarchyState(r1);	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0 = r2.mStateArray;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x0032 }
        if (r0 <= 0) goto L_0x0004;
    L_0x002a:
        r0 = r2.mStateArray;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r3.mSavedViewState = r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0 = 0;
        r2.mStateArray = r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
        goto L_0x0004;
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.saveFragmentViewState(android.support.v4.app.Fragment):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void moveToState(int r10, int r11, int r12, boolean r13) {
        /*
        r9_this = this;
        r0 = 0;
        r8 = android.support.v4.app.FragmentActivity.a;
        r1 = r9.mActivity;	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r1 != 0) goto L_0x0019;
    L_0x0007:
        if (r10 == 0) goto L_0x0019;
    L_0x0009:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalArgumentException -> 0x0015 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0015 }
        r2 = 36;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0015 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0015 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0015 }
    L_0x0019:
        if (r13 != 0) goto L_0x0022;
    L_0x001b:
        r1 = r9.mCurState;	 Catch:{ IllegalArgumentException -> 0x0020 }
        if (r1 != r10) goto L_0x0022;
    L_0x001f:
        return;
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r9.mCurState = r10;
        r1 = r9.mActive;
        if (r1 == 0) goto L_0x001f;
    L_0x0028:
        r6 = r0;
        r7 = r0;
    L_0x002a:
        r0 = r9.mActive;
        r0 = r0.size();
        if (r6 >= r0) goto L_0x007e;
    L_0x0032:
        r0 = r9.mActive;
        r1 = r0.get(r6);
        r1 = (android.support.v4.app.Fragment) r1;
        if (r1 == 0) goto L_0x007c;
    L_0x003c:
        r5 = 0;
        r0 = r9;
        r2 = r10;
        r3 = r11;
        r4 = r12;
        r0.moveToState(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0071 }
        r0 = r1.mLoaderManager;	 Catch:{ IllegalArgumentException -> 0x0071 }
        if (r0 == 0) goto L_0x007c;
    L_0x0048:
        r0 = r1.mLoaderManager;
        r0 = r0.hasRunningLoaders();
        r7 = r7 | r0;
        r1 = r7;
    L_0x0050:
        r0 = r6 + 1;
        if (r8 == 0) goto L_0x0079;
    L_0x0054:
        if (r1 != 0) goto L_0x0059;
    L_0x0056:
        r9.startPendingDeferredFragments();	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0059:
        r0 = r9.mNeedMenuInvalidate;	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r0 == 0) goto L_0x001f;
    L_0x005d:
        r0 = r9.mActivity;	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r0 == 0) goto L_0x001f;
    L_0x0061:
        r0 = r9.mCurState;	 Catch:{ IllegalArgumentException -> 0x006f }
        r1 = 5;
        if (r0 != r1) goto L_0x001f;
    L_0x0066:
        r0 = r9.mActivity;	 Catch:{ IllegalArgumentException -> 0x006f }
        r0.supportInvalidateOptionsMenu();	 Catch:{ IllegalArgumentException -> 0x006f }
        r0 = 0;
        r9.mNeedMenuInvalidate = r0;	 Catch:{ IllegalArgumentException -> 0x006f }
        goto L_0x001f;
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r0 = move-exception;
        throw r0;
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x0079:
        r6 = r0;
        r7 = r1;
        goto L_0x002a;
    L_0x007c:
        r1 = r7;
        goto L_0x0050;
    L_0x007e:
        r1 = r7;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.moveToState(int, int, int, boolean):void");
    }

    public boolean execPendingActions() {
        boolean z = FragmentActivity.a;
        try {
            if (this.mExecutingActions) {
                throw new IllegalStateException(z[85]);
            }
            try {
                if (Looper.myLooper() != this.mActivity.mHandler.getLooper()) {
                    throw new IllegalStateException(z[84]);
                }
                int size;
                boolean z2 = false;
                while (true) {
                    synchronized (this) {
                        if (this.mPendingActions == null || this.mPendingActions.size() == 0) {
                            if (!z) {
                                break;
                            }
                        }
                        size = this.mPendingActions.size();
                        try {
                            if (this.mTmpActions == null || this.mTmpActions.length < size) {
                                this.mTmpActions = new Runnable[size];
                            }
                            this.mPendingActions.toArray(this.mTmpActions);
                            this.mPendingActions.clear();
                            this.mActivity.mHandler.removeCallbacks(this.mExecCommit);
                        } catch (IllegalArgumentException e) {
                            throw e;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    this.mExecutingActions = true;
                    int i = 0;
                    while (i < size) {
                        this.mTmpActions[i].run();
                        this.mTmpActions[i] = null;
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    this.mExecutingActions = false;
                    z2 = true;
                }
                if (this.mHavePendingDeferredStart) {
                    int i2 = 0;
                    size = 0;
                    while (i2 < this.mActive.size()) {
                        Fragment fragment = (Fragment) this.mActive.get(i2);
                        if (fragment != null) {
                            try {
                                if (fragment.mLoaderManager != null) {
                                    size |= fragment.mLoaderManager.hasRunningLoaders();
                                }
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        }
                        int i3 = i2 + 1;
                        if (z) {
                            break;
                        }
                        i2 = i3;
                    }
                    if (size == 0) {
                        try {
                            this.mHavePendingDeferredStart = false;
                            startPendingDeferredFragments();
                        } catch (IllegalArgumentException e222) {
                            throw e222;
                        }
                    }
                }
                return z2;
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        } catch (IllegalArgumentException e22222) {
            throw e22222;
        }
    }

    private void checkStateLoss() {
        try {
            if (this.mStateSaved) {
                throw new IllegalStateException(z[71]);
            }
            try {
                if (this.mNoTransactionsBecause != null) {
                    throw new IllegalStateException(z[72] + this.mNoTransactionsBecause);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public FragmentTransaction beginTransaction() {
        return new BackStackRecord(this);
    }

    public void putFragment(Bundle bundle, String str, Fragment fragment) {
        try {
            if (fragment.mIndex < 0) {
                throwException(new IllegalStateException(z[109] + fragment + z[108]));
            }
            bundle.putInt(str, fragment.mIndex);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static int reverseTransit(int i) {
        boolean z = FragmentActivity.a;
        switch (i) {
            case 4097:
                if (!z) {
                    return 8194;
                }
                break;
            case 4099:
                break;
            case 8194:
                break;
            default:
                return 0;
        }
        if (!z) {
            return 4097;
        }
        return 4099;
    }

    static Animation makeFadeAnimation(Context context, float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(DECELERATE_CUBIC);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    public void performPendingDeferredStart(Fragment fragment) {
        try {
            try {
                if (!fragment.mDeferStart) {
                    return;
                }
                if (this.mExecutingActions) {
                    this.mHavePendingDeferredStart = true;
                    return;
                }
                fragment.mDeferStart = false;
                moveToState(fragment, this.mCurState, 0, 0, false);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void dispatchResume() {
        this.mStateSaved = false;
        moveToState(5, false);
    }

    public boolean dispatchContextItemSelected(MenuItem menuItem) {
        boolean z = FragmentActivity.a;
        if (this.mAdded == null) {
            return false;
        }
        int i = 0;
        while (i < this.mAdded.size()) {
            Fragment fragment = (Fragment) this.mAdded.get(i);
            if (fragment != null) {
                try {
                    if (fragment.performContextItemSelected(menuItem)) {
                        return true;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            int i2 = i + 1;
            if (z) {
                return false;
            }
            i = i2;
        }
        return false;
    }

    public void dispatchOptionsMenuClosed(Menu menu) {
        boolean z = FragmentActivity.a;
        if (this.mAdded != null) {
            int i = 0;
            while (i < this.mAdded.size()) {
                Fragment fragment = (Fragment) this.mAdded.get(i);
                if (fragment != null) {
                    try {
                        fragment.performOptionsMenuClosed(menu);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }
}
