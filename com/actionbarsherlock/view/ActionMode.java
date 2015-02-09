package com.actionbarsherlock.view;

import android.view.View;

public abstract class ActionMode {
    public static boolean a;

    public interface Callback {
        boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem);

        boolean onCreateActionMode(ActionMode actionMode, Menu menu);

        void onDestroyActionMode(ActionMode actionMode);

        boolean onPrepareActionMode(ActionMode actionMode, Menu menu);
    }

    public abstract void finish();

    public abstract Menu getMenu();

    public abstract void invalidate();

    public abstract void setCustomView(View view);

    public abstract void setTitle(CharSequence charSequence);
}
