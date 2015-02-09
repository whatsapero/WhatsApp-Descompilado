package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.internal.jx;

public class SupportErrorDialogFragment extends DialogFragment {
    private OnCancelListener Iw;
    private Dialog mDialog;

    public SupportErrorDialogFragment() {
        this.mDialog = null;
        this.Iw = null;
    }

    public static SupportErrorDialogFragment newInstance(Dialog dialog, OnCancelListener onCancelListener) {
        int i = GooglePlayServicesUtil.a;
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) jx.b((Object) dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.mDialog = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.Iw = onCancelListener;
        }
        if (jx.a != 0) {
            GooglePlayServicesUtil.a = i + 1;
        }
        return supportErrorDialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.Iw != null) {
            this.Iw.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.mDialog == null) {
            setShowsDialog(false);
        }
        return this.mDialog;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
