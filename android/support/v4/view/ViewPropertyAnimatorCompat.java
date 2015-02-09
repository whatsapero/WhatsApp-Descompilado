package android.support.v4.view;

import android.os.Build.VERSION;
import java.util.WeakHashMap;

public class ViewPropertyAnimatorCompat {
    static final ViewPropertyAnimatorCompatImpl IMPL;

    interface ViewPropertyAnimatorCompatImpl {
    }

    class BaseViewPropertyAnimatorCompatImpl implements ViewPropertyAnimatorCompatImpl {
        WeakHashMap mStarterMap;

        BaseViewPropertyAnimatorCompatImpl() {
            this.mStarterMap = null;
        }
    }

    class ICSViewPropertyAnimatorCompatImpl extends BaseViewPropertyAnimatorCompatImpl {
        WeakHashMap mLayerMap;

        ICSViewPropertyAnimatorCompatImpl() {
            this.mLayerMap = null;
        }
    }

    class JBViewPropertyAnimatorCompatImpl extends ICSViewPropertyAnimatorCompatImpl {
        JBViewPropertyAnimatorCompatImpl() {
        }
    }

    class JBMr2ViewPropertyAnimatorCompatImpl extends JBViewPropertyAnimatorCompatImpl {
        JBMr2ViewPropertyAnimatorCompatImpl() {
        }
    }

    class KitKatViewPropertyAnimatorCompatImpl extends JBMr2ViewPropertyAnimatorCompatImpl {
        KitKatViewPropertyAnimatorCompatImpl() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            IMPL = new KitKatViewPropertyAnimatorCompatImpl();
        } else if (i >= 18) {
            IMPL = new JBMr2ViewPropertyAnimatorCompatImpl();
        } else if (i >= 16) {
            IMPL = new JBViewPropertyAnimatorCompatImpl();
        } else if (i >= 14) {
            IMPL = new ICSViewPropertyAnimatorCompatImpl();
        } else {
            IMPL = new BaseViewPropertyAnimatorCompatImpl();
        }
    }
}
