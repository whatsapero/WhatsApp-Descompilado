package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class UserFeedbackActivity extends DialogToastActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "e\u0004xAhn\na\u001c~v\u001b;+zu\bg\u0006}c;g\u0000}j\u000ex.|r\u0002c\u0006k\u007fEf\nmp\u000eg\u001ckg\u001f`\u001c";
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
                        i3 = 6;
                        break;
                    case ay.f /*1*/:
                        i3 = 107;
                        break;
                    case ay.n /*2*/:
                        i3 = 21;
                        break;
                    case ay.p /*3*/:
                        i3 = 111;
                        break;
                    default:
                        i3 = 31;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "e\u0004xAhn\na\u001c~v\u001b;+zu\bg\u0006}c;g\u0000}j\u000ex.|r\u0002c\u0006k\u007fEa\u0016oc";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "e\u0004xAhn\na\u001c~v\u001b;+zu\bg\u0006}c;g\u0000}j\u000ex.|r\u0002c\u0006k\u007fEs\u001dpk";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void a(Context context, String str, String str2, Integer num) {
        Intent intent = new Intent(context, DescribeProblemActivity.class);
        intent.putExtra(z[1], str);
        intent.putExtra(z[0], str2);
        if (num != null) {
            intent.putExtra(z[2], num);
        }
        context.startActivity(intent);
    }

    protected void e(String str) {
        a5w.a(new o6(this, this, false, false, str), new String[0]);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 122:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.register_connecting));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case 123:
                return new Builder(this).setMessage(R.string.settings_network_service_unknown).setPositiveButton(R.string.yes, new p0(this)).setNegativeButton(R.string.cancel, new k1(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }
}
