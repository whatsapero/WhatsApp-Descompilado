package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.util.SparseArray;

public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    private static final SparseArray mActiveWakeLocks;
    private static int mNextId;

    static {
        mActiveWakeLocks = new SparseArray();
        mNextId = 1;
    }
}
