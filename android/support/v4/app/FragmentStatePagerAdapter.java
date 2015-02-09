package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class FragmentStatePagerAdapter extends PagerAdapter {
    private static final String[] z;
    private FragmentTransaction mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private final FragmentManager mFragmentManager;
    private ArrayList mFragments;
    private ArrayList mSavedState;

    static {
        String[] strArr = new String[4];
        String str = "\u001c.\u0015j\\\u001c";
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
                        i3 = 111;
                        break;
                    case ay.f /*1*/:
                        i3 = 90;
                        break;
                    case ay.n /*2*/:
                        i3 = 116;
                        break;
                    case ay.p /*3*/:
                        i3 = 30;
                        break;
                    default:
                        i3 = 57;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ")(\u0015yT\n4\u0000MM\u000e.\u0011NX\b?\u0006_]\u000e*\u0000{K";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u001c.\u0015j\\\u001c";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "-;\u0010>_\u001d;\u0013s\\\u0001.T\u007fMO1\u0011g\u0019";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public abstract Fragment getItem(int i);

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        boolean z = FragmentActivity.a;
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        while (this.mSavedState.size() <= i) {
            this.mSavedState.add(null);
            if (z) {
                break;
            }
        }
        this.mSavedState.set(i, this.mFragmentManager.saveFragmentInstanceState(fragment));
        this.mFragments.set(i, null);
        this.mCurTransaction.remove(fragment);
    }

    public void startUpdate(ViewGroup viewGroup) {
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.mCurTransaction != null) {
            this.mCurTransaction.commitAllowingStateLoss();
            this.mCurTransaction = null;
            this.mFragmentManager.executePendingTransactions();
        }
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.mCurrentPrimaryItem) {
            if (this.mCurrentPrimaryItem != null) {
                this.mCurrentPrimaryItem.setMenuVisibility(false);
                this.mCurrentPrimaryItem.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public FragmentStatePagerAdapter(FragmentManager fragmentManager) {
        this.mCurTransaction = null;
        this.mSavedState = new ArrayList();
        this.mFragments = new ArrayList();
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
    }

    public Parcelable saveState() {
        boolean z = FragmentActivity.a;
        Bundle bundle = null;
        if (this.mSavedState.size() > 0) {
            bundle = new Bundle();
            Parcelable[] parcelableArr = new Parcelable[this.mSavedState.size()];
            this.mSavedState.toArray(parcelableArr);
            bundle.putParcelableArray(z[3], parcelableArr);
        }
        int i = 0;
        Parcelable parcelable = bundle;
        while (i < this.mFragments.size()) {
            Fragment fragment = (Fragment) this.mFragments.get(i);
            if (fragment != null) {
                if (parcelable == null) {
                    parcelable = new Bundle();
                }
                this.mFragmentManager.putFragment(parcelable, "f" + i, fragment);
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return parcelable;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        boolean z = FragmentActivity.a;
        if (this.mFragments.size() > i) {
            Fragment fragment = (Fragment) this.mFragments.get(i);
            if (fragment != null) {
                return fragment;
            }
        }
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        Fragment item = getItem(i);
        if (this.mSavedState.size() > i) {
            SavedState savedState = (SavedState) this.mSavedState.get(i);
            if (savedState != null) {
                item.setInitialSavedState(savedState);
            }
        }
        while (this.mFragments.size() <= i) {
            this.mFragments.add(null);
            if (z) {
                break;
            }
        }
        item.setMenuVisibility(false);
        item.setUserVisibleHint(false);
        this.mFragments.set(i, item);
        this.mCurTransaction.add(viewGroup.getId(), item);
        return item;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        boolean z = FragmentActivity.a;
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray(z[0]);
            this.mSavedState.clear();
            this.mFragments.clear();
            if (parcelableArray != null) {
                int i = 0;
                while (i < parcelableArray.length) {
                    this.mSavedState.add((SavedState) parcelableArray[i]);
                    int i2 = i + 1;
                    if (z) {
                        break;
                    }
                    i = i2;
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment fragment = this.mFragmentManager.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.mFragments.size() <= parseInt) {
                            this.mFragments.add(null);
                            if (z) {
                                break;
                            }
                        }
                        fragment.setMenuVisibility(false);
                        this.mFragments.set(parseInt, fragment);
                        if (!z) {
                            continue;
                        }
                    }
                    Log.w(z[2], z[1] + str);
                    continue;
                }
                if (z) {
                    return;
                }
            }
        }
    }
}
