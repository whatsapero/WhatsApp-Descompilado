package android.support.v4.app;

import android.view.View;
import com.actionbarsherlock.ActionBarSherlock.OnCreatePanelMenuListener;
import com.actionbarsherlock.ActionBarSherlock.OnMenuItemSelectedListener;
import com.actionbarsherlock.ActionBarSherlock.OnPreparePanelListener;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import java.util.ArrayList;

public abstract class Watson extends FragmentActivity implements OnCreatePanelMenuListener, OnPreparePanelListener, OnMenuItemSelectedListener {
    public static boolean b;
    private ArrayList mCreatedMenus;

    public interface OnCreateOptionsMenuListener {
        void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater);
    }

    public interface OnOptionsItemSelectedListener {
        boolean onOptionsItemSelected(MenuItem menuItem);
    }

    public interface OnPrepareOptionsMenuListener {
        void onPrepareOptionsMenu(Menu menu);
    }

    public abstract MenuInflater getSupportMenuInflater();

    public abstract boolean onCreateOptionsMenu(Menu menu);

    public abstract boolean onOptionsItemSelected(MenuItem menuItem);

    public abstract boolean onPrepareOptionsMenu(Menu menu);

    public boolean onCreatePanelMenu(int i, Menu menu) {
        int i2 = 0;
        boolean z = b;
        if (i != 0) {
            return false;
        }
        int i3;
        Fragment fragment;
        boolean onCreateOptionsMenu = onCreateOptionsMenu(menu);
        MenuInflater supportMenuInflater = getSupportMenuInflater();
        ArrayList arrayList = null;
        if (this.mFragments.mAdded != null) {
            int i4 = 0;
            i3 = 0;
            while (i4 < this.mFragments.mAdded.size()) {
                fragment = (Fragment) this.mFragments.mAdded.get(i4);
                if (fragment != null && !fragment.mHidden && fragment.mHasMenu && fragment.mMenuVisible && (fragment instanceof OnCreateOptionsMenuListener)) {
                    ArrayList arrayList2;
                    ((OnCreateOptionsMenuListener) fragment).onCreateOptionsMenu(menu, supportMenuInflater);
                    if (arrayList == null) {
                        arrayList2 = new ArrayList();
                    } else {
                        arrayList2 = arrayList;
                    }
                    arrayList2.add(fragment);
                    arrayList = arrayList2;
                    i3 = 1;
                }
                int i5 = i4 + 1;
                if (z) {
                    break;
                }
                i4 = i5;
            }
        } else {
            i3 = 0;
        }
        if (this.mCreatedMenus != null) {
            while (i2 < this.mCreatedMenus.size()) {
                fragment = (Fragment) this.mCreatedMenus.get(i2);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
                i2++;
                if (z) {
                    break;
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return onCreateOptionsMenu | i3;
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        boolean z = b;
        if (i != 0) {
            return false;
        }
        int i2;
        boolean onPrepareOptionsMenu = onPrepareOptionsMenu(menu);
        if (this.mFragments.mAdded != null) {
            int i3 = 0;
            i2 = false;
            while (i3 < this.mFragments.mAdded.size()) {
                Fragment fragment = (Fragment) this.mFragments.mAdded.get(i3);
                if (fragment != null && !fragment.mHidden && fragment.mHasMenu && fragment.mMenuVisible && (fragment instanceof OnPrepareOptionsMenuListener)) {
                    i2 = 1;
                    ((OnPrepareOptionsMenuListener) fragment).onPrepareOptionsMenu(menu);
                }
                int i4 = i3 + 1;
                if (z) {
                    break;
                }
                i3 = i4;
            }
        } else {
            i2 = 0;
        }
        return (onPrepareOptionsMenu | i2) & menu.hasVisibleItems();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        boolean z = b;
        if (i != 0) {
            return false;
        }
        if (onOptionsItemSelected(menuItem)) {
            return true;
        }
        if (this.mFragments.mAdded == null) {
            return false;
        }
        int i2 = 0;
        while (i2 < this.mFragments.mAdded.size()) {
            Fragment fragment = (Fragment) this.mFragments.mAdded.get(i2);
            if (fragment != null && !fragment.mHidden && fragment.mHasMenu && fragment.mMenuVisible && (fragment instanceof OnOptionsItemSelectedListener) && ((OnOptionsItemSelectedListener) fragment).onOptionsItemSelected(menuItem)) {
                return true;
            }
            int i3 = i2 + 1;
            if (z) {
                return false;
            }
            i2 = i3;
        }
        return false;
    }
}
