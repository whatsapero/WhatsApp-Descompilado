package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class InsufficientStorageSpaceActivity extends DialogToastActivity {
    private static final String[] z;
    private long j;

    static {
        String[] strArr = new String[7];
        String str = "CRw>\u007f~Gs9\u007fTkx\u001fcDGe";
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
                        i3 = 48;
                        break;
                    case ay.f /*1*/:
                        i3 = 34;
                        break;
                    case ay.n /*2*/:
                        i3 = 22;
                        break;
                    case ay.p /*3*/:
                        i3 = 93;
                        break;
                    default:
                        i3 = 26;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "}Ke.s^E64tDGx):UZb/{\u0010Qf<yUls8~UF_3XIVs.";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0010oT";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0010iT";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "QLr/uYF84tDGx)4QAb4u^\f[\u001cS~";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "QLr/uYF84tDGx)4SCb8}_PosR\u007foS";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0010eT";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent(z[5]);
        intent.addCategory(z[6]);
        intent.setFlags(268435456);
        startActivity(intent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_insufficient_storage_space);
        Button button = (Button) findViewById(R.id.btn_storage_settings);
        TextView textView = (TextView) findViewById(R.id.insufficient_storage_description_textview);
        this.j = getIntent().getLongExtra(z[0], -1);
        String string = getString(R.string.insufficient_internal_storage_space_description);
        String a = a(this.j);
        textView.setText(String.format(string, new Object[]{a}));
        button.setOnClickListener(new fr(this));
    }

    protected void onResume() {
        super.onResume();
        try {
            if (App.B() > this.j) {
                finish();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private String a(long j) {
        int i = App.az;
        if (j == -1) {
            try {
                throw new IllegalArgumentException(z[2]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        String str;
        if (j < 1048576) {
            str = (j / 1024) + z[4];
            if (i == 0) {
                return str;
            }
        }
        if (j < 1073741824) {
            str = (j / 1048576) + z[3];
            if (i == 0) {
                return str;
            }
        }
        return (j / 1073741824) + z[1];
    }
}
