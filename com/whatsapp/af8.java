package com.whatsapp;

import com.whatsapp.DialogToastFragmentActivity.ProgressDialogFragment;

class af8 implements Runnable {
    final ProgressDialogFragment a;
    final ep b;

    af8(ep epVar, ProgressDialogFragment progressDialogFragment) {
        this.b = epVar;
        this.a = progressDialogFragment;
    }

    public void run() {
        App.a(this.b.a.getActivity());
        this.a.getActivity().runOnUiThread(new afx(this));
    }
}
