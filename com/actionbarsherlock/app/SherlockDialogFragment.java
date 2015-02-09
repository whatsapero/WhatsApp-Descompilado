package com.actionbarsherlock.app;

import android.app.Activity;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Watson.OnCreateOptionsMenuListener;
import android.support.v4.app.Watson.OnOptionsItemSelectedListener;
import android.support.v4.app.Watson.OnPrepareOptionsMenuListener;
import android.view.Menu;
import android.view.MenuInflater;
import com.actionbarsherlock.internal.view.menu.MenuItemWrapper;
import com.actionbarsherlock.internal.view.menu.MenuWrapper;
import com.actionbarsherlock.view.MenuItem;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class SherlockDialogFragment extends DialogFragment implements OnCreateOptionsMenuListener, OnPrepareOptionsMenuListener, OnOptionsItemSelectedListener {
    private static final String z;
    private SherlockFragmentActivity mActivity;

    static {
        char[] toCharArray = "Q8U\u001b\u001bQ7EH\u000e\u0005!A\u000b\u0007\u00141\u0000\u001c\u0000Q4\u0000;\u0007\u0014'L\u0007\f\u001a\u0013R\t\b\u001c0N\u001c.\u0012!I\u001e\u0006\u0005,\u000e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 113;
                    break;
                case ay.f /*1*/:
                    i2 = 85;
                    break;
                case ay.n /*2*/:
                    i2 = 32;
                    break;
                case ay.p /*3*/:
                    i2 = 104;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        onPrepareOptionsMenu(new MenuWrapper(menu));
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        onCreateOptionsMenu(new MenuWrapper(menu), this.mActivity.getSupportMenuInflater());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onDetach() {
        this.mActivity = null;
        super.onDetach();
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

    public void onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu, com.actionbarsherlock.view.MenuInflater menuInflater) {
    }

    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        return onOptionsItemSelected(new MenuItemWrapper(menuItem));
    }

    public void onPrepareOptionsMenu(com.actionbarsherlock.view.Menu menu) {
    }
}
