package com.whatsapp.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class WaDialogPreference extends DialogPreference {
    private OnClickListener a;

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.a != null) {
            this.a.onClick(dialogInterface, i);
        }
        super.onClick(dialogInterface, i);
    }

    public WaDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
    }

    public void a(OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    protected View onCreateView(ViewGroup viewGroup) {
        return WaPreference.a(super.onCreateView(viewGroup));
    }
}
