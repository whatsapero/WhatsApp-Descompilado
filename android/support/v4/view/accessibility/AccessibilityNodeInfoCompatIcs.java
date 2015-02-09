package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatIcs {
    public static boolean isClickable(Object obj) {
        return ((AccessibilityNodeInfo) obj).isClickable();
    }

    public static void setSelected(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setSelected(z);
    }

    public static boolean isPassword(Object obj) {
        return ((AccessibilityNodeInfo) obj).isPassword();
    }

    public static void addAction(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).addAction(i);
    }

    public static void setLongClickable(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setLongClickable(z);
    }

    public static void setScrollable(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setScrollable(z);
    }

    public static boolean isFocused(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocused();
    }

    public static void setBoundsInParent(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInParent(rect);
    }

    public static void setClassName(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setClassName(charSequence);
    }

    public static void setSource(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setSource(view);
    }

    public static void setEnabled(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setEnabled(z);
    }

    public static boolean isCheckable(Object obj) {
        return ((AccessibilityNodeInfo) obj).isCheckable();
    }

    public static CharSequence getPackageName(Object obj) {
        return ((AccessibilityNodeInfo) obj).getPackageName();
    }

    public static boolean isLongClickable(Object obj) {
        return ((AccessibilityNodeInfo) obj).isLongClickable();
    }

    public static void getBoundsInScreen(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInScreen(rect);
    }

    public static boolean isEnabled(Object obj) {
        return ((AccessibilityNodeInfo) obj).isEnabled();
    }

    public static void setPackageName(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setPackageName(charSequence);
    }

    public static void setFocusable(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocusable(z);
    }

    public static void setParent(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setParent(view);
    }

    public static boolean isSelected(Object obj) {
        return ((AccessibilityNodeInfo) obj).isSelected();
    }

    public static void setClickable(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setClickable(z);
    }

    public static int getActions(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActions();
    }

    public static void getBoundsInParent(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInParent(rect);
    }

    public static void setContentDescription(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setContentDescription(charSequence);
    }

    public static CharSequence getContentDescription(Object obj) {
        return ((AccessibilityNodeInfo) obj).getContentDescription();
    }

    public static void setBoundsInScreen(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInScreen(rect);
    }

    public static void recycle(Object obj) {
        ((AccessibilityNodeInfo) obj).recycle();
    }

    public static Object obtain(Object obj) {
        return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo) obj);
    }

    public static boolean isScrollable(Object obj) {
        return ((AccessibilityNodeInfo) obj).isScrollable();
    }

    public static CharSequence getClassName(Object obj) {
        return ((AccessibilityNodeInfo) obj).getClassName();
    }

    public static boolean isFocusable(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocusable();
    }

    public static boolean isChecked(Object obj) {
        return ((AccessibilityNodeInfo) obj).isChecked();
    }

    public static void addChild(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).addChild(view);
    }

    public static void setFocused(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocused(z);
    }

    public static CharSequence getText(Object obj) {
        return ((AccessibilityNodeInfo) obj).getText();
    }
}
