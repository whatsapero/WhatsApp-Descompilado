package com.whatsapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import com.whatsapp.util.bm;
import java.util.Date;
import java.util.TimeZone;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class l5 extends k4 {
    private static final String z;
    final Activity c;

    static {
        char[] toCharArray = "\u0014\u0015p*$\u0005\t\u007f((\u0018\u0014ms\"\u001b\u0015}7l\u0000\bq2&Z\u000ew1$W".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 119;
                    break;
                case ay.f /*1*/:
                    i2 = 122;
                    break;
                case ay.n /*2*/:
                    i2 = 30;
                    break;
                case ay.p /*3*/:
                    i2 = 92;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Date date = new Date();
        Log.w(z + date.toString());
        long time = App.X == null ? date.getTime() : App.X.getTime();
        ((TextView) findViewById(R.id.clock_wrong_date)).setText(this.c.getString(R.string.clock_wrong_report_current_date_time, new Object[]{bm.k(App.p, time), TimeZone.getDefault().getDisplayName()}));
        findViewById(R.id.close).setOnClickListener(new akw(this));
    }

    l5(Activity activity, int i, Activity activity2) {
        this.c = activity2;
        super(activity, i);
    }
}
