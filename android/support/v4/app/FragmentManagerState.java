package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentManagerState implements Parcelable {
    public static final Creator CREATOR;
    FragmentState[] mActive;
    int[] mAdded;
    BackStackState[] mBackStack;

    public FragmentManagerState(Parcel parcel) {
        this.mActive = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.mAdded = parcel.createIntArray();
        this.mBackStack = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.mActive, i);
        parcel.writeIntArray(this.mAdded);
        parcel.writeTypedArray(this.mBackStack, i);
    }

    public int describeContents() {
        return 0;
    }

    static {
        CREATOR = new Creator() {
            public FragmentManagerState createFromParcel(Parcel parcel) {
                return new FragmentManagerState(parcel);
            }

            public Object createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            public Object[] newArray(int i) {
                return newArray(i);
            }

            public FragmentManagerState[] newArray(int i) {
                return new FragmentManagerState[i];
            }
        };
    }
}
