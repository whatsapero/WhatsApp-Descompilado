package com.whatsapp;

import com.whatsapp.DialogToastFragmentActivity.ProgressDialogFragment;

class amj implements Runnable {
    final ProgressDialogFragment a;
    final i1 b;

    amj(i1 i1Var, ProgressDialogFragment progressDialogFragment) {
        this.b = i1Var;
        this.a = progressDialogFragment;
    }

    public void run() {
        App.b(this.b.a.getActivity());
        this.a.getActivity().runOnUiThread(new no(this));
    }
}
