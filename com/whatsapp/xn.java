package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.CallsFragment.ClearCallLogDialogFragment;
import com.whatsapp.DialogToastFragmentActivity.ProgressDialogFragment;
import com.whatsapp.util.br;

class xn implements OnClickListener {
    final ClearCallLogDialogFragment a;

    xn(ClearCallLogDialogFragment clearCallLogDialogFragment) {
        this.a = clearCallLogDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        progressDialogFragment.show(this.a.getFragmentManager(), null);
        br.a(new f9(this, progressDialogFragment));
    }
}
