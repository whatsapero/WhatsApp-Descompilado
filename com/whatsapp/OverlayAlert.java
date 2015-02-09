package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.actionbarsherlock.R;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class OverlayAlert extends Activity {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "\u007f_qlukBg";
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
                        i3 = 12;
                        break;
                    case ay.f /*1*/:
                        i3 = 43;
                        break;
                    case ay.n /*2*/:
                        i3 = 3;
                        break;
                    case ay.p /*3*/:
                        i3 = 5;
                        break;
                    default:
                        i3 = 27;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "oDn+ldJwvz|[-W~kBpq~~{kjui\u0005q`hi_pqzxN";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "oDn+ldJwvz|[-W~kBpq~~{kjui\u0005`i~mY\\uscEfZuyFa`i";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "aN";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (VERSION.SDK_INT >= 11) {
            setFinishOnTouchOutside(false);
        }
        setContentView(b7.a(getLayoutInflater(), R.layout.overlay_alert, null, false));
        Button button = (Button) findViewById(R.id.cancel_btn);
        button.setText(R.string.close);
        button.setOnClickListener(new w3(this));
        button = (Button) findViewById(R.id.ok_btn);
        button.setText(R.string.overlay_reregister);
        button.setOnClickListener(new an5(this));
        int intExtra = getIntent().getIntExtra(z[0], -1);
        if (intExtra == -1) {
            finish();
            if (App.az == 0) {
                return;
            }
        }
        ((TextView) findViewById(R.id.overlay_tv)).setText(getString(intExtra));
    }

    public static void a(Activity activity) {
        DeleteAccountConfirmation.d();
        App.aY = false;
        App.a0();
        App.ah();
        m8 d = App.P.d();
        if (d != null) {
            d.v();
            d.a(0, 0);
        }
        File file = new File(App.p.getFilesDir(), z[1]);
        if (file.exists()) {
            file.delete();
        }
        App.an = null;
        App.f(App.p, null);
        App.aJ.g();
        a54.E();
        ac.e();
        ac.d();
        Intent intent = new Intent(activity, RegisterPhone.class);
        intent.putExtra(z[2], true);
        intent.putExtra(z[3], true);
        intent.addFlags(32768);
        App.d((Context) activity, 1);
        App.S = false;
        App.aJ();
        a54.b();
        App.ai();
        activity.startActivity(intent);
        activity.finish();
        App.e(false);
        b1.e();
        Conversation.m();
    }
}
