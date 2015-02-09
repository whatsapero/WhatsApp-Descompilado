package com.whatsapp;

import android.content.Intent;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class akv implements Callback {
    private static final String z;
    final ContactPicker a;

    static {
        char[] toCharArray = "0~\u0005=".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 90;
                    break;
                case ay.f /*1*/:
                    i2 = 23;
                    break;
                case ay.n /*2*/:
                    i2 = 97;
                    break;
                case ay.p /*3*/:
                    i2 = 78;
                    break;
                default:
                    i2 = 80;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    akv(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        MenuItem add = menu.add(0, 0, 0, (int) R.string.broadcast_msg);
        add.setIcon((int) R.drawable.ic_action_broadcast);
        add.setShowAsAction(2);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        ContactPicker.a(this.a, null);
        ContactPicker.a(this.a);
        ContactPicker.a(this.a, null);
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        int i = App.az;
        switch (menuItem.getItemId()) {
            case PBE.MD5 /*0*/:
                Intent intent;
                StringBuilder stringBuilder = new StringBuilder();
                for (String str : ContactPicker.e(this.a).keySet()) {
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append(str);
                    if (i != 0) {
                        intent = new Intent(this.a, ListMembersSelector.class);
                        intent.putExtra(z, stringBuilder.toString());
                        this.a.startActivity(intent);
                        this.a.finish();
                        break;
                    }
                }
                intent = new Intent(this.a, ListMembersSelector.class);
                intent.putExtra(z, stringBuilder.toString());
                this.a.startActivity(intent);
                this.a.finish();
        }
        return false;
    }
}
