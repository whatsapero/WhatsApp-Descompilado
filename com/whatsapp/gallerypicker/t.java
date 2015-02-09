package com.whatsapp.gallerypicker;

import com.actionbarsherlock.R;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;

class t implements Callback {
    final ImageGallery a;

    t(ImageGallery imageGallery) {
        this.a = imageGallery;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        ImageGallery.a(this.a, menu.add(0, 0, 0, (int) R.string.ok));
        ImageGallery.h(this.a).setShowAsAction(2);
        return true;
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        actionMode.setTitle(String.format(this.a.getResources().getQuantityString(R.plurals.n_selected, ImageGallery.a(this.a).size()), new Object[]{Integer.valueOf(ImageGallery.a(this.a).size())}));
        return true;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case PBE.MD5 /*0*/:
                ImageGallery.a(this.a, ImageGallery.a(this.a));
                break;
        }
        return false;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        ImageGallery.a(this.a).clear();
        ImageGallery.a(this.a, null);
        ImageGallery.d(this.a).notifyDataSetChanged();
    }
}
