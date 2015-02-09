package com.whatsapp.preference;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListAdapter;
import com.whatsapp.DialogToastActivity;

public class WaFontListPreference extends WaListPreference {
    public static int b;
    private int c;

    protected void onPrepareDialogBuilder(Builder builder) {
        int i = WaListPreference.a;
        super.onPrepareDialogBuilder(builder);
        ListAdapter bVar = new b(this, getEntries(), getEntryValues());
        this.c = findIndexOfValue(getValue());
        builder.setSingleChoiceItems(bVar, this.c, new a(this));
        builder.setPositiveButton(null, null);
        if (i != 0) {
            DialogToastActivity.i = !DialogToastActivity.i;
        }
    }

    public boolean persistString(String str) {
        b = Integer.parseInt(str);
        return super.persistString(str);
    }

    static {
        b = 0;
    }

    public WaFontListPreference(Context context) {
        super(context);
    }

    static int a(WaFontListPreference waFontListPreference, int i) {
        waFontListPreference.c = i;
        return i;
    }

    protected void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        CharSequence[] entryValues = getEntryValues();
        if (z && this.c >= 0 && entryValues != null) {
            String toString = entryValues[this.c].toString();
            if (callChangeListener(toString)) {
                setValue(toString);
            }
        }
    }

    public WaFontListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
