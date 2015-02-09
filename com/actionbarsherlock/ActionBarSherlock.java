package com.actionbarsherlock;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.ActionBarSherlockCompat;
import com.actionbarsherlock.internal.ActionBarSherlockNative;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class ActionBarSherlock {
    private static final Class[] CONSTRUCTOR_ARGS;
    private static final HashMap IMPLEMENTATIONS;
    public static boolean a;
    public static boolean isRtl;
    private static final String[] z;
    protected final Activity mActivity;
    protected final boolean mIsDelegate;
    protected MenuInflater mMenuInflater;

    public interface OnCreatePanelMenuListener {
        boolean onCreatePanelMenu(int i, Menu menu);
    }

    public interface OnPreparePanelListener {
        boolean onPreparePanel(int i, View view, Menu menu);
    }

    public interface OnMenuItemSelectedListener {
        boolean onMenuItemSelected(int i, MenuItem menuItem);
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Implementation {
        int api() default -1;

        int dpi() default -1;
    }

    public interface OnActionModeFinishedListener {
        void onActionModeFinished(ActionMode actionMode);
    }

    public interface OnActionModeStartedListener {
        void onActionModeStarted(ActionMode actionMode);
    }

    public interface OnCreateOptionsMenuListener {
        boolean onCreateOptionsMenu(Menu menu);
    }

    public interface OnOptionsItemSelectedListener {
        boolean onOptionsItemSelected(MenuItem menuItem);
    }

    public interface OnPrepareOptionsMenuListener {
        boolean onPrepareOptionsMenu(Menu menu);
    }

    public abstract void addContentView(View view, LayoutParams layoutParams);

    public abstract boolean dispatchCreateOptionsMenu(android.view.Menu menu);

    public abstract void dispatchInvalidateOptionsMenu();

    public abstract boolean dispatchOptionsItemSelected(android.view.MenuItem menuItem);

    public abstract boolean dispatchPrepareOptionsMenu(android.view.Menu menu);

    public abstract ActionBar getActionBar();

    protected abstract Context getThemedContext();

    public abstract boolean requestFeature(int i);

    public abstract void setContentView(int i);

    public abstract void setContentView(View view, LayoutParams layoutParams);

    public abstract void setProgressBarIndeterminateVisibility(boolean z);

    public abstract ActionMode startActionMode(Callback callback);

    public void dispatchRestoreInstanceState(Bundle bundle) {
    }

    public void setContentView(View view) {
        setContentView(view, new LayoutParams(-1, -1));
    }

    public void dispatchPanelClosed(int i, android.view.Menu menu) {
    }

    public static void registerImplementation(Class cls) {
        try {
            if (cls.isAnnotationPresent(Implementation.class)) {
                try {
                    if (!IMPLEMENTATIONS.containsValue(cls)) {
                        IMPLEMENTATIONS.put((Implementation) cls.getAnnotation(Implementation.class), cls);
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            throw new IllegalArgumentException(z[1] + cls.getSimpleName() + z[0]);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static {
        String[] strArr = new String[4];
        String str = "S% \u001c8\u001c8s]8\u001d#']\"\u0016(sK?\u0007$s|\u001f\u001e<?Y;\u0016\"']\"\u001a#=";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 115;
                        break;
                    case ay.f /*1*/:
                        i4 = 76;
                        break;
                    case ay.n /*2*/:
                        i4 = 83;
                        break;
                    case ay.p /*3*/:
                        i4 = 60;
                        break;
                    default:
                        i4 = 86;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "=#sU;\u0003 6Q3\u001d82H?\u001c\" \u001c;\u001280Tv\u0010#=Z?\u00149!]\"\u001a#=\u0012";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = ">#!Yv\u0007$2Rv\u001c\"6\u001c?\u001e<?Y;\u0016\"']\"\u001a#=\u001c;\u001280T3\u0000l0S8\u0015%4I$\u00128:S8]";
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CONSTRUCTOR_ARGS = new Class[]{Activity.class, Integer.TYPE};
                    IMPLEMENTATIONS = new HashMap();
                    isRtl = true;
                    registerImplementation(ActionBarSherlockCompat.class);
                    registerImplementation(ActionBarSherlockNative.class);
                default:
                    strArr2[i2] = str;
                    str = "0 2O%S";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public boolean dispatchOpenOptionsMenu() {
        return false;
    }

    protected final boolean callbackPrepareOptionsMenu(Menu menu) {
        boolean z = true;
        try {
            if (this.mActivity instanceof OnPreparePanelListener) {
                z = ((OnPreparePanelListener) this.mActivity).onPreparePanel(0, null, menu);
                if (!a) {
                    return z;
                }
            }
            return this.mActivity instanceof OnPrepareOptionsMenuListener ? ((OnPrepareOptionsMenuListener) this.mActivity).onPrepareOptionsMenu(menu) : z;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean dispatchCloseOptionsMenu() {
        return false;
    }

    public void dispatchConfigurationChanged(Configuration configuration) {
    }

    public boolean dispatchMenuOpened(int i, android.view.Menu menu) {
        return false;
    }

    public void dispatchSaveInstanceState(Bundle bundle) {
    }

    protected ActionBarSherlock(Activity activity, int i) {
        boolean z;
        boolean z2 = false;
        boolean z3 = a;
        this.mActivity = activity;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            this.mIsDelegate = z;
            if (SherlockActivity.a) {
                if (!z3) {
                    z2 = true;
                }
                a = z2;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void dispatchPostCreate(Bundle bundle) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    public void dispatchDestroy() {
    }

    protected final boolean callbackCreateOptionsMenu(Menu menu) {
        boolean z = true;
        try {
            if (this.mActivity instanceof OnCreatePanelMenuListener) {
                z = ((OnCreatePanelMenuListener) this.mActivity).onCreatePanelMenu(0, menu);
                if (!a) {
                    return z;
                }
            }
            return this.mActivity instanceof OnCreateOptionsMenuListener ? ((OnCreateOptionsMenuListener) this.mActivity).onCreateOptionsMenu(menu) : z;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void dispatchPostResume() {
    }

    public void dispatchPause() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.actionbarsherlock.view.MenuInflater getMenuInflater() {
        /*
        r3_this = this;
        r0 = r3.mMenuInflater;	 Catch:{ IllegalArgumentException -> 0x0027 }
        if (r0 != 0) goto L_0x0024;
    L_0x0004:
        r0 = r3.getActionBar();	 Catch:{ IllegalArgumentException -> 0x0029 }
        if (r0 == 0) goto L_0x001b;
    L_0x000a:
        r0 = new com.actionbarsherlock.view.MenuInflater;	 Catch:{ IllegalArgumentException -> 0x002b }
        r1 = r3.getThemedContext();	 Catch:{ IllegalArgumentException -> 0x002b }
        r2 = r3.mActivity;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0.<init>(r1, r2);	 Catch:{ IllegalArgumentException -> 0x002b }
        r3.mMenuInflater = r0;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = a;	 Catch:{ IllegalArgumentException -> 0x002b }
        if (r0 == 0) goto L_0x0024;
    L_0x001b:
        r0 = new com.actionbarsherlock.view.MenuInflater;	 Catch:{ IllegalArgumentException -> 0x002b }
        r1 = r3.mActivity;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x002b }
        r3.mMenuInflater = r0;	 Catch:{ IllegalArgumentException -> 0x002b }
    L_0x0024:
        r0 = r3.mMenuInflater;
        return r0;
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.ActionBarSherlock.getMenuInflater():com.actionbarsherlock.view.MenuInflater");
    }

    public void dispatchStop() {
    }

    protected final boolean callbackOptionsItemSelected(MenuItem menuItem) {
        try {
            boolean onMenuItemSelected;
            if (this.mActivity instanceof OnMenuItemSelectedListener) {
                onMenuItemSelected = ((OnMenuItemSelectedListener) this.mActivity).onMenuItemSelected(0, menuItem);
                if (!a) {
                    return onMenuItemSelected;
                }
            }
            onMenuItemSelected = false;
            return this.mActivity instanceof OnOptionsItemSelectedListener ? ((OnOptionsItemSelectedListener) this.mActivity).onOptionsItemSelected(menuItem) : onMenuItemSelected;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static ActionBarSherlock wrap(Activity activity, int i) {
        Iterator it;
        Object obj;
        int i2 = 0;
        boolean z = a;
        HashMap hashMap = new HashMap(IMPLEMENTATIONS);
        Object obj2 = null;
        for (Implementation implementation : hashMap.keySet()) {
            if (implementation.dpi() == 213) {
                if (!z) {
                    int i3 = 1;
                    break;
                }
                try {
                    boolean z2;
                    if (SherlockActivity.a) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    SherlockActivity.a = z2;
                    obj = 1;
                } catch (NoSuchMethodException e) {
                    throw e;
                } catch (NoSuchMethodException e2) {
                    throw e2;
                }
            }
            obj = obj2;
            if (z) {
                break;
            }
            obj2 = obj;
        }
        obj = obj2;
        if (obj != null) {
            try {
                if (activity.getResources().getDisplayMetrics().densityDpi == 213) {
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                it = hashMap.keySet().iterator();
                while (it.hasNext()) {
                    i3 = ((Implementation) it.next()).dpi();
                    if (!(obj2 == null || i3 == 213) || (obj2 == null && i3 == 213)) {
                        try {
                            it.remove();
                        } catch (NoSuchMethodException e22) {
                            throw e22;
                        }
                    }
                    if (z) {
                        break;
                    }
                }
            } catch (NoSuchMethodException e222) {
                throw e222;
            } catch (NoSuchMethodException e2222) {
                throw e2222;
            }
        }
        obj2 = null;
        for (Implementation implementation2 : hashMap.keySet()) {
            if (implementation2.api() != -1) {
                if (!z) {
                    i3 = 1;
                    break;
                }
                obj = 1;
            } else {
                obj = obj2;
            }
            if (z) {
                break;
            }
            obj2 = obj;
        }
        obj = obj2;
        if (obj != null) {
            try {
                int i4;
                if (isRtl) {
                    i4 = 7;
                } else {
                    i4 = VERSION.SDK_INT;
                }
                it = hashMap.keySet().iterator();
                while (it.hasNext()) {
                    i3 = ((Implementation) it.next()).api();
                    if (i3 > i4) {
                        try {
                            it.remove();
                        } catch (NoSuchMethodException e22222) {
                            throw e22222;
                        } catch (NoSuchMethodException e222222) {
                            throw e222222;
                        }
                        if (!z) {
                            continue;
                            if (z) {
                                break;
                            }
                        }
                    }
                    if (i3 > i2) {
                        i2 = i3;
                        continue;
                    } else {
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                Iterator it2 = hashMap.keySet().iterator();
                while (it2.hasNext()) {
                    if (((Implementation) it2.next()).api() != i2) {
                        it2.remove();
                        if (!z) {
                        }
                    }
                }
            } catch (NoSuchMethodException e2222222) {
                throw e2222222;
            } catch (NoSuchMethodException e22222222) {
                throw e22222222;
            }
        }
        try {
            break;
            if (hashMap.size() > 1) {
                throw new IllegalStateException(z[3]);
            }
            try {
                if (hashMap.isEmpty()) {
                    throw new IllegalStateException(z[2]);
                }
                try {
                    return (ActionBarSherlock) ((Class) hashMap.values().iterator().next()).getConstructor(CONSTRUCTOR_ARGS).newInstance(new Object[]{activity, Integer.valueOf(i)});
                } catch (Throwable e3) {
                    throw new RuntimeException(e3);
                } catch (Throwable e32) {
                    throw new RuntimeException(e32);
                } catch (Throwable e322) {
                    throw new RuntimeException(e322);
                } catch (Throwable e3222) {
                    throw new RuntimeException(e3222);
                } catch (Throwable e32222) {
                    throw new RuntimeException(e32222);
                }
            } catch (NoSuchMethodException e222222222) {
                throw e222222222;
            }
        } catch (NoSuchMethodException e2222222222) {
            throw e2222222222;
        }
    }

    public void dispatchTitleChanged(CharSequence charSequence, int i) {
    }
}
