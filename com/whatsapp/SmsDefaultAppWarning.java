package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class SmsDefaultAppWarning extends DialogToastActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "\u0018MQ(V\u0013CHu@\u000bR";
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
                        i3 = 123;
                        break;
                    case ay.f /*1*/:
                        i3 = 34;
                        break;
                    case ay.n /*2*/:
                        i3 = 60;
                        break;
                    case ay.p /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 33;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u001aLXtN\u0012F\u0012oO\u000fGRr\u000f\u001aAHoN\u0015\foCo?vs";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0013VHvRA\r\u0013qI\u001aVOgQ\u000b\f_iLTFP)";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\bOObD\u001dCIjU\u001aRLq@\tLUhFTANc@\u000fG";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i(z[1]);
        Intent intent = new Intent(z[2]);
        intent.setData(getIntent().getData());
        ResolveInfo resolveActivity = getPackageManager().resolveActivity(intent, 0);
        if (!(resolveActivity == null || resolveActivity.activityInfo == null || !z[0].equals(resolveActivity.activityInfo.packageName))) {
            showDialog(0);
            if (App.az == 0) {
                return;
            }
        }
        showDialog(1);
    }

    static void a(SmsDefaultAppWarning smsDefaultAppWarning) {
        smsDefaultAppWarning.a();
    }

    private void b() {
        App.a((Activity) this, getIntent().getData(), getString(R.string.tell_a_friend_sms, new Object[]{z[3]}));
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                return new Builder(this).setMessage(R.string.warning_sms_default_app).setNeutralButton(R.string.sms_invite, new as6(this)).setNegativeButton(R.string.sms_reset, new sz(this)).setPositiveButton(R.string.sms_sms, new oj(this)).setOnCancelListener(new rf(this)).create();
            case ay.f /*1*/:
                return new Builder(this).setMessage(R.string.warning_sms).setNeutralButton(R.string.sms_invite, new a32(this)).setPositiveButton(R.string.sms_sms, new w2(this)).setOnCancelListener(new q3(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    private void a() {
        App.a((Activity) this, getIntent().getData(), null);
    }

    static void b(SmsDefaultAppWarning smsDefaultAppWarning) {
        smsDefaultAppWarning.b();
    }
}
