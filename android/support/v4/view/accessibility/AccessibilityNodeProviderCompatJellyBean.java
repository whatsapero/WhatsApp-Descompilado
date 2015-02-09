package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

class AccessibilityNodeProviderCompatJellyBean {

    interface AccessibilityNodeInfoBridge {
        Object createAccessibilityNodeInfo(int i);

        List findAccessibilityNodeInfosByText(String str, int i);

        boolean performAction(int i, int i2, Bundle bundle);
    }

    final class AnonymousClass_1 extends AccessibilityNodeProvider {
        final AccessibilityNodeInfoBridge val$bridge;

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return (AccessibilityNodeInfo) this.val$bridge.createAccessibilityNodeInfo(i);
        }

        public List findAccessibilityNodeInfosByText(String str, int i) {
            return this.val$bridge.findAccessibilityNodeInfosByText(str, i);
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.val$bridge.performAction(i, i2, bundle);
        }

        AnonymousClass_1(AccessibilityNodeInfoBridge accessibilityNodeInfoBridge) {
            this.val$bridge = accessibilityNodeInfoBridge;
        }
    }

    public static Object newAccessibilityNodeProviderBridge(AccessibilityNodeInfoBridge accessibilityNodeInfoBridge) {
        return new AnonymousClass_1(accessibilityNodeInfoBridge);
    }
}
