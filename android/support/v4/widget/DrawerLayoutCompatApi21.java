package android.support.v4.widget;

import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import android.support.v4.widget.SearchViewCompatIcs.MySearchView;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;

class DrawerLayoutCompatApi21 {

    class InsetsListener implements OnApplyWindowInsetsListener {
        InsetsListener() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayoutImpl) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public static void applyMarginInsets(MarginLayoutParams marginLayoutParams, Object obj, int i) {
        WindowInsets replaceSystemWindowInsets;
        int i2 = MySearchView.a;
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i == 3) {
            replaceSystemWindowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
            if (i2 != 0) {
                RemoteInput.a++;
            }
            marginLayoutParams.leftMargin = replaceSystemWindowInsets.getSystemWindowInsetLeft();
            marginLayoutParams.topMargin = replaceSystemWindowInsets.getSystemWindowInsetTop();
            marginLayoutParams.rightMargin = replaceSystemWindowInsets.getSystemWindowInsetRight();
            marginLayoutParams.bottomMargin = replaceSystemWindowInsets.getSystemWindowInsetBottom();
        }
        replaceSystemWindowInsets = windowInsets;
        if (i == 5) {
            replaceSystemWindowInsets = replaceSystemWindowInsets.replaceSystemWindowInsets(0, replaceSystemWindowInsets.getSystemWindowInsetTop(), replaceSystemWindowInsets.getSystemWindowInsetRight(), replaceSystemWindowInsets.getSystemWindowInsetBottom());
        }
        marginLayoutParams.leftMargin = replaceSystemWindowInsets.getSystemWindowInsetLeft();
        marginLayoutParams.topMargin = replaceSystemWindowInsets.getSystemWindowInsetTop();
        marginLayoutParams.rightMargin = replaceSystemWindowInsets.getSystemWindowInsetRight();
        marginLayoutParams.bottomMargin = replaceSystemWindowInsets.getSystemWindowInsetBottom();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void dispatchChildInsets(android.view.View r6, java.lang.Object r7, int r8) {
        /*
        r5 = 0;
        r1 = android.support.v4.widget.SearchViewCompatIcs.MySearchView.a;
        r7 = (android.view.WindowInsets) r7;
        r0 = 3;
        if (r8 != r0) goto L_0x0039;
    L_0x0008:
        r0 = r7.getSystemWindowInsetLeft();
        r2 = r7.getSystemWindowInsetTop();
        r3 = r7.getSystemWindowInsetBottom();
        r0 = r7.replaceSystemWindowInsets(r0, r2, r5, r3);
        if (r1 == 0) goto L_0x002d;
    L_0x001a:
        r2 = 5;
        if (r8 != r2) goto L_0x002d;
    L_0x001d:
        r2 = r0.getSystemWindowInsetTop();
        r3 = r0.getSystemWindowInsetRight();
        r4 = r0.getSystemWindowInsetBottom();
        r0 = r0.replaceSystemWindowInsets(r5, r2, r3, r4);
    L_0x002d:
        r6.dispatchApplyWindowInsets(r0);
        r0 = android.support.v4.app.RemoteInputCompatBase.RemoteInput.a;
        if (r0 == 0) goto L_0x0038;
    L_0x0034:
        r0 = r1 + 1;
        android.support.v4.widget.SearchViewCompatIcs.MySearchView.a = r0;
    L_0x0038:
        return;
    L_0x0039:
        r0 = r7;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayoutCompatApi21.dispatchChildInsets(android.view.View, java.lang.Object, int):void");
    }

    public static int getTopInset(Object obj) {
        return obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
    }

    public static void configureApplyInsets(View view) {
        if (view instanceof DrawerLayoutImpl) {
            view.setOnApplyWindowInsetsListener(new InsetsListener());
            view.setSystemUiVisibility(1280);
        }
    }
}
