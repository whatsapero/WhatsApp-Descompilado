package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class SettingsHelp extends DialogToastPreferenceActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "xNQ\u0013i";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 25;
                        break;
                    case ay.f /*1*/:
                        i3 = 44;
                        break;
                    case ay.n /*2*/:
                        i3 = 62;
                        break;
                    case ay.p /*3*/:
                        i3 = 102;
                        break;
                    default:
                        i3 = 29;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "qIR\u0016";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "jUM\u0012xtsM\u0012|mYM";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "zCP\u0012|zXa\u0013n";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences_help);
        findPreference(z[0]).setOnPreferenceClickListener(new b5(this));
        findPreference(z[2]).setOnPreferenceClickListener(new dw(this));
        findPreference(z[3]).setOnPreferenceClickListener(new jq(this));
        findPreference(z[1]).setOnPreferenceClickListener(new a1g(this));
    }

    protected Dialog onCreateDialog(int i) {
        Dialog cpVar;
        switch (i) {
            case 101:
                cpVar = new cp(this);
                cpVar.setTitle(getString(R.string.register_xmpp_title));
                cpVar.setMessage(getString(R.string.register_wait_message));
                cpVar.setIndeterminate(true);
                cpVar.setCancelable(false);
                return cpVar;
            case 102:
                return new Builder(this).setTitle(R.string.no_internet_title).setMessage(getString(R.string.register_no_internet_connectivity, new Object[]{getString(R.string.connectivity_self_help_instructions)})).setNeutralButton(R.string.ok, new aln(this)).create();
            case 122:
                cpVar = new ProgressDialog(this);
                cpVar.setMessage(getString(R.string.register_connecting));
                cpVar.setIndeterminate(true);
                cpVar.setCancelable(false);
                return cpVar;
            case 123:
                return new Builder(this).setMessage(R.string.settings_network_service_unknown).setPositiveButton(R.string.yes, new zu(this)).setNegativeButton(R.string.cancel, new m1(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }
}
