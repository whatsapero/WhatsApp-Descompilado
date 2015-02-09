package com.actionbarsherlock.app;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.Watson.OnCreateOptionsMenuListener;
import android.support.v4.app.Watson.OnOptionsItemSelectedListener;
import android.support.v4.app.Watson.OnPrepareOptionsMenuListener;
import android.view.MenuItem;
import com.actionbarsherlock.internal.view.menu.MenuItemWrapper;
import com.actionbarsherlock.internal.view.menu.MenuWrapper;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class SherlockFragment extends Fragment implements OnCreateOptionsMenuListener, OnPrepareOptionsMenuListener, OnOptionsItemSelectedListener {
    private static final String z;
    private SherlockFragmentActivity mActivity;

    static {
        char[] toCharArray = "L)K?BL&[lW\u00180_/^\t \u001e8YL%\u001e\u001f^\t6R#U\u0007\u0002L-Q\u0001!P8w\u000f0W:_\u0018=\u0010".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 108;
                    break;
                case ay.f /*1*/:
                    i2 = 68;
                    break;
                case ay.n /*2*/:
                    i2 = 62;
                    break;
                case ay.p /*3*/:
                    i2 = 76;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onDetach() {
        this.mActivity = null;
        super.onDetach();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return onOptionsItemSelected(new MenuItemWrapper(menuItem));
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onAttach(Activity activity) {
        try {
            if (activity instanceof SherlockFragmentActivity) {
                this.mActivity = (SherlockFragmentActivity) activity;
                super.onAttach(activity);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + z);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public final void onPrepareOptionsMenu(android.view.Menu menu) {
        onPrepareOptionsMenu(new MenuWrapper(menu));
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuItem) {
        return false;
    }

    public final void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        onCreateOptionsMenu(new MenuWrapper(menu), this.mActivity.getSupportMenuInflater());
    }
}
