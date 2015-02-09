package android.support.v4.view.accessibility;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import java.util.ArrayList;
import java.util.List;

public class AccessibilityNodeProviderCompat {
    private static final AccessibilityNodeProviderImpl IMPL;
    private final Object mProvider;

    interface AccessibilityNodeProviderImpl {
        Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat);
    }

    class AccessibilityNodeProviderStubImpl implements AccessibilityNodeProviderImpl {
        AccessibilityNodeProviderStubImpl() {
        }

        public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            return null;
        }
    }

    class AccessibilityNodeProviderJellyBeanImpl extends AccessibilityNodeProviderStubImpl {

        class AnonymousClass_1 implements AccessibilityNodeInfoBridge {
            final AccessibilityNodeProviderJellyBeanImpl this$0;
            final AccessibilityNodeProviderCompat val$compat;

            public List findAccessibilityNodeInfosByText(String str, int i) {
                int i2 = AccessibilityNodeInfoCompat.a;
                List findAccessibilityNodeInfosByText = this.val$compat.findAccessibilityNodeInfosByText(str, i);
                List arrayList = new ArrayList();
                int size = findAccessibilityNodeInfosByText.size();
                int i3 = 0;
                while (i3 < size) {
                    arrayList.add(((AccessibilityNodeInfoCompat) findAccessibilityNodeInfosByText.get(i3)).getInfo());
                    int i4 = i3 + 1;
                    if (i2 != 0) {
                        break;
                    }
                    i3 = i4;
                }
                if (Fragment.a != 0) {
                    AccessibilityNodeInfoCompat.a = i2 + 1;
                }
                return arrayList;
            }

            AnonymousClass_1(AccessibilityNodeProviderJellyBeanImpl accessibilityNodeProviderJellyBeanImpl, AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
                this.this$0 = accessibilityNodeProviderJellyBeanImpl;
                this.val$compat = accessibilityNodeProviderCompat;
            }

            public boolean performAction(int i, int i2, Bundle bundle) {
                return this.val$compat.performAction(i, i2, bundle);
            }

            public Object createAccessibilityNodeInfo(int i) {
                AccessibilityNodeInfoCompat createAccessibilityNodeInfo = this.val$compat.createAccessibilityNodeInfo(i);
                return createAccessibilityNodeInfo == null ? null : createAccessibilityNodeInfo.getInfo();
            }
        }

        AccessibilityNodeProviderJellyBeanImpl() {
        }

        public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            return AccessibilityNodeProviderCompatJellyBean.newAccessibilityNodeProviderBridge(new AnonymousClass_1(this, accessibilityNodeProviderCompat));
        }
    }

    class AccessibilityNodeProviderKitKatImpl extends AccessibilityNodeProviderStubImpl {

        class AnonymousClass_1 implements AccessibilityNodeInfoBridge {
            final AccessibilityNodeProviderKitKatImpl this$0;
            final AccessibilityNodeProviderCompat val$compat;

            public List findAccessibilityNodeInfosByText(String str, int i) {
                int i2 = AccessibilityNodeInfoCompat.a;
                List findAccessibilityNodeInfosByText = this.val$compat.findAccessibilityNodeInfosByText(str, i);
                List arrayList = new ArrayList();
                int size = findAccessibilityNodeInfosByText.size();
                int i3 = 0;
                while (i3 < size) {
                    arrayList.add(((AccessibilityNodeInfoCompat) findAccessibilityNodeInfosByText.get(i3)).getInfo());
                    int i4 = i3 + 1;
                    if (i2 != 0) {
                        break;
                    }
                    i3 = i4;
                }
                return arrayList;
            }

            AnonymousClass_1(AccessibilityNodeProviderKitKatImpl accessibilityNodeProviderKitKatImpl, AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
                this.this$0 = accessibilityNodeProviderKitKatImpl;
                this.val$compat = accessibilityNodeProviderCompat;
            }

            public boolean performAction(int i, int i2, Bundle bundle) {
                return this.val$compat.performAction(i, i2, bundle);
            }

            public Object createAccessibilityNodeInfo(int i) {
                AccessibilityNodeInfoCompat createAccessibilityNodeInfo = this.val$compat.createAccessibilityNodeInfo(i);
                return createAccessibilityNodeInfo == null ? null : createAccessibilityNodeInfo.getInfo();
            }

            public Object findFocus(int i) {
                AccessibilityNodeInfoCompat findFocus = this.val$compat.findFocus(i);
                return findFocus == null ? null : findFocus.getInfo();
            }
        }

        AccessibilityNodeProviderKitKatImpl() {
        }

        public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            return AccessibilityNodeProviderCompatKitKat.newAccessibilityNodeProviderBridge(new AnonymousClass_1(this, accessibilityNodeProviderCompat));
        }
    }

    public AccessibilityNodeProviderCompat() {
        this.mProvider = IMPL.newAccessibilityNodeProviderBridge(this);
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            IMPL = new AccessibilityNodeProviderKitKatImpl();
        } else if (VERSION.SDK_INT >= 16) {
            IMPL = new AccessibilityNodeProviderJellyBeanImpl();
        } else {
            IMPL = new AccessibilityNodeProviderStubImpl();
        }
    }

    public AccessibilityNodeProviderCompat(Object obj) {
        this.mProvider = obj;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return false;
    }

    public List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public AccessibilityNodeInfoCompat findFocus(int i) {
        return null;
    }

    public Object getProvider() {
        return this.mProvider;
    }

    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
        return null;
    }
}
