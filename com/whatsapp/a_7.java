package com.whatsapp;

import android.content.Context;
import android.view.View;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.internal.ActionBarSherlockCompat;
import com.actionbarsherlock.widget.SearchView;

public class a_7 {
    public static void a(View view, String str, boolean z) {
        if (view instanceof SearchView) {
            ((SearchView) view).setQuery(str, z);
            if (App.az == 0) {
                return;
            }
        }
        ((android.widget.SearchView) view).setQuery(str, z);
    }

    public static View a(Context context, ActionBarSherlock actionBarSherlock, aq aqVar) {
        if (actionBarSherlock instanceof ActionBarSherlockCompat) {
            View searchView = new SearchView(actionBarSherlock.getActionBar().getThemedContext());
            searchView.setOnQueryTextListener(new ry(aqVar));
            return searchView;
        }
        searchView = new android.widget.SearchView(actionBarSherlock.getActionBar().getThemedContext());
        searchView.setOnQueryTextListener(new sn(aqVar));
        return searchView;
    }
}
