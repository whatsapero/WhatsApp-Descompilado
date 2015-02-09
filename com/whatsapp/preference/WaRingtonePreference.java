package com.whatsapp.preference;

import android.content.Context;
import android.content.Intent;
import android.preference.RingtonePreference;
import android.provider.Settings.System;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class WaRingtonePreference extends RingtonePreference {
    private static final String z;

    static {
        char[] toCharArray = "\u0001>>RC\t4tIB\u001454T\u0002\u0005(.RMN\"3NK\u0014?4E\u0002$\u0015\u001cay,\u0004\u0005u~)".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 96;
                    break;
                case ay.f /*1*/:
                    i2 = 80;
                    break;
                case ay.n /*2*/:
                    i2 = 90;
                    break;
                case ay.p /*3*/:
                    i2 = 32;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected View onCreateView(ViewGroup viewGroup) {
        return WaPreference.a(super.onCreateView(viewGroup));
    }

    public WaRingtonePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WaRingtonePreference(Context context) {
        super(context);
    }

    protected void onPrepareRingtonePickerIntent(Intent intent) {
        super.onPrepareRingtonePickerIntent(intent);
        if (getShowDefault() && (getRingtoneType() & 1) != 0 && (getRingtoneType() & 2) != 0) {
            intent.putExtra(z, System.DEFAULT_NOTIFICATION_URI);
        }
    }

    public WaRingtonePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
