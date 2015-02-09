package android.support.v4.app;

import android.support.annotation.Nullable;

public abstract class FragmentTransaction {
    public abstract FragmentTransaction add(int i, Fragment fragment);

    public abstract FragmentTransaction add(int i, Fragment fragment, @Nullable String str);

    public abstract FragmentTransaction add(Fragment fragment, String str);

    public abstract FragmentTransaction attach(Fragment fragment);

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract FragmentTransaction detach(Fragment fragment);

    public abstract FragmentTransaction disallowAddToBackStack();

    public abstract boolean isEmpty();

    public abstract FragmentTransaction remove(Fragment fragment);
}
