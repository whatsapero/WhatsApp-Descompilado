package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: ParcelableCompatHoneycombMR2.java */
class ParcelableCompatCreatorHoneycombMR2 implements ClassLoaderCreator {
    private final ParcelableCompatCreatorCallbacks mCallbacks;

    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.mCallbacks.createFromParcel(parcel, classLoader);
    }

    public Object[] newArray(int i) {
        return this.mCallbacks.newArray(i);
    }

    public Object createFromParcel(Parcel parcel) {
        return this.mCallbacks.createFromParcel(parcel, null);
    }

    public ParcelableCompatCreatorHoneycombMR2(ParcelableCompatCreatorCallbacks parcelableCompatCreatorCallbacks) {
        this.mCallbacks = parcelableCompatCreatorCallbacks;
    }
}
