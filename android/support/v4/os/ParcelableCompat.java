package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class ParcelableCompat {
    public static boolean a;

    class CompatCreator implements Creator {
        final ParcelableCompatCreatorCallbacks mCallbacks;

        public Object createFromParcel(Parcel parcel) {
            return this.mCallbacks.createFromParcel(parcel, null);
        }

        public Object[] newArray(int i) {
            return this.mCallbacks.newArray(i);
        }

        public CompatCreator(ParcelableCompatCreatorCallbacks parcelableCompatCreatorCallbacks) {
            this.mCallbacks = parcelableCompatCreatorCallbacks;
        }
    }

    public static Creator newCreator(ParcelableCompatCreatorCallbacks parcelableCompatCreatorCallbacks) {
        if (VERSION.SDK_INT >= 13) {
            ParcelableCompatCreatorHoneycombMR2Stub.instantiate(parcelableCompatCreatorCallbacks);
        }
        return new CompatCreator(parcelableCompatCreatorCallbacks);
    }
}
