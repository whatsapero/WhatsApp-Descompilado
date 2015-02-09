package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public class ViewGroupCompat {
    static final ViewGroupCompatImpl IMPL;

    interface ViewGroupCompatImpl {
        void setMotionEventSplittingEnabled(ViewGroup viewGroup, boolean z);
    }

    class ViewGroupCompatStubImpl implements ViewGroupCompatImpl {
        ViewGroupCompatStubImpl() {
        }

        public void setMotionEventSplittingEnabled(ViewGroup viewGroup, boolean z) {
        }
    }

    class ViewGroupCompatHCImpl extends ViewGroupCompatStubImpl {
        ViewGroupCompatHCImpl() {
        }

        public void setMotionEventSplittingEnabled(ViewGroup viewGroup, boolean z) {
            ViewGroupCompatHC.setMotionEventSplittingEnabled(viewGroup, z);
        }
    }

    class ViewGroupCompatIcsImpl extends ViewGroupCompatHCImpl {
        ViewGroupCompatIcsImpl() {
        }
    }

    class ViewGroupCompatJellybeanMR2Impl extends ViewGroupCompatIcsImpl {
        ViewGroupCompatJellybeanMR2Impl() {
        }
    }

    class ViewGroupCompatApi21Impl extends ViewGroupCompatJellybeanMR2Impl {
        ViewGroupCompatApi21Impl() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            IMPL = new ViewGroupCompatApi21Impl();
        } else if (i >= 18) {
            IMPL = new ViewGroupCompatJellybeanMR2Impl();
        } else if (i >= 14) {
            IMPL = new ViewGroupCompatIcsImpl();
        } else if (i >= 11) {
            IMPL = new ViewGroupCompatHCImpl();
        } else {
            IMPL = new ViewGroupCompatStubImpl();
        }
    }

    public static void setMotionEventSplittingEnabled(ViewGroup viewGroup, boolean z) {
        IMPL.setMotionEventSplittingEnabled(viewGroup, z);
    }
}
