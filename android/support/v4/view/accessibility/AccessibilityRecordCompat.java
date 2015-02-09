package android.support.v4.view.accessibility;

import android.os.Build.VERSION;

public class AccessibilityRecordCompat {
    private static final AccessibilityRecordImpl IMPL;
    private final Object mRecord;

    interface AccessibilityRecordImpl {
        Object obtain();

        void setFromIndex(Object obj, int i);

        void setItemCount(Object obj, int i);

        void setScrollable(Object obj, boolean z);

        void setToIndex(Object obj, int i);
    }

    class AccessibilityRecordStubImpl implements AccessibilityRecordImpl {
        public Object obtain() {
            return null;
        }

        public void setFromIndex(Object obj, int i) {
        }

        public void setScrollable(Object obj, boolean z) {
        }

        public void setToIndex(Object obj, int i) {
        }

        AccessibilityRecordStubImpl() {
        }

        public void setItemCount(Object obj, int i) {
        }
    }

    class AccessibilityRecordIcsImpl extends AccessibilityRecordStubImpl {
        AccessibilityRecordIcsImpl() {
        }

        public void setItemCount(Object obj, int i) {
            AccessibilityRecordCompatIcs.setItemCount(obj, i);
        }

        public void setToIndex(Object obj, int i) {
            AccessibilityRecordCompatIcs.setToIndex(obj, i);
        }

        public void setFromIndex(Object obj, int i) {
            AccessibilityRecordCompatIcs.setFromIndex(obj, i);
        }

        public Object obtain() {
            return AccessibilityRecordCompatIcs.obtain();
        }

        public void setScrollable(Object obj, boolean z) {
            AccessibilityRecordCompatIcs.setScrollable(obj, z);
        }
    }

    class AccessibilityRecordIcsMr1Impl extends AccessibilityRecordIcsImpl {
        AccessibilityRecordIcsMr1Impl() {
        }
    }

    class AccessibilityRecordJellyBeanImpl extends AccessibilityRecordIcsMr1Impl {
        AccessibilityRecordJellyBeanImpl() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            IMPL = new AccessibilityRecordJellyBeanImpl();
        } else if (VERSION.SDK_INT >= 15) {
            IMPL = new AccessibilityRecordIcsMr1Impl();
        } else if (VERSION.SDK_INT >= 14) {
            IMPL = new AccessibilityRecordIcsImpl();
        } else {
            IMPL = new AccessibilityRecordStubImpl();
        }
    }

    public void setToIndex(int i) {
        IMPL.setToIndex(this.mRecord, i);
    }

    public AccessibilityRecordCompat(Object obj) {
        this.mRecord = obj;
    }

    public int hashCode() {
        return this.mRecord == null ? 0 : this.mRecord.hashCode();
    }

    public void setFromIndex(int i) {
        IMPL.setFromIndex(this.mRecord, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AccessibilityRecordCompat accessibilityRecordCompat = (AccessibilityRecordCompat) obj;
        return this.mRecord == null ? accessibilityRecordCompat.mRecord == null : this.mRecord.equals(accessibilityRecordCompat.mRecord);
    }

    public void setScrollable(boolean z) {
        IMPL.setScrollable(this.mRecord, z);
    }

    public static AccessibilityRecordCompat obtain() {
        return new AccessibilityRecordCompat(IMPL.obtain());
    }

    public void setItemCount(int i) {
        IMPL.setItemCount(this.mRecord, i);
    }
}
