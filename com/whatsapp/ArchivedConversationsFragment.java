package com.whatsapp;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

public class ArchivedConversationsFragment extends ConversationsFragment {
    protected void a(View view) {
        super.a(view);
        if (v.j() != 0) {
            getListView().getViewTreeObserver().addOnGlobalLayoutListener(new fg(this, view.getTop()));
        }
    }

    protected ArrayList a() {
        return v.g();
    }

    protected void f() {
        this.b.setVisibility(8);
        this.h.setVisibility(8);
    }

    public void b() {
        super.b();
        if (v.j() == 0) {
            getActivity().finish();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }
}
