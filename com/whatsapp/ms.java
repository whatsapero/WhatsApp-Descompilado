package com.whatsapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.bd;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ms implements Callback {
    private static final String z;
    final Conversation a;

    static {
        char[] toCharArray = "\u001a\u0010<T7\u0002.,U$\u001a\u00101^0".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 118;
                    break;
                case ay.f /*1*/:
                    i2 = 113;
                    break;
                case ay.n /*2*/:
                    i2 = 69;
                    break;
                case ay.p /*3*/:
                    i2 = 59;
                    break;
                default:
                    i2 = 66;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    ms(Conversation conversation) {
        this.a = conversation;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        ViewGroup viewGroup = (ViewGroup) b7.a((LayoutInflater) this.a.getSupportActionBar().getThemedContext().getSystemService(z), R.layout.conversation_search_view, null, false);
        viewGroup.findViewById(R.id.abs__submit_area).setBackgroundDrawable(new bd(this.a.getResources().getDrawable(R.drawable.abs__textfield_search_right_selected_holo_dark)));
        actionMode.setCustomView(viewGroup);
        EditText editText = (EditText) viewGroup.findViewById(R.id.abs__search_src_text);
        editText.addTextChangedListener(new a1i(this, editText));
        editText.setOnEditorActionListener(new k3(this));
        viewGroup.findViewById(R.id.search_up).setOnClickListener(new a8f(this));
        this.a.findViewById(R.id.search_down).setOnClickListener(new ga(this));
        editText.setText(Conversation.N(this.a));
        editText.selectAll();
        editText.requestFocus();
        editText.setSelected(true);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        Conversation.a(this.a, null);
        Conversation.a8 = null;
        if (!Conversation.H(this.a) || bd.f(this.a.r.e)) {
            Conversation.ag(this.a).setVisibility(0);
        }
        Conversation.ab(this.a).setVisibility(0);
        Conversation.C(this.a);
        this.a.aS.notifyDataSetChanged();
        Conversation.A(this.a).requestFocus();
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }
}
