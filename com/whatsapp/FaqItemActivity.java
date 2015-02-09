package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.MenuItem;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class FaqItemActivity extends DialogToastActivity {
    private static final String[] z;
    private long j;
    private long k;
    private long l;

    static {
        String[] strArr = new String[7];
        String str = "\u000bDv\u0018r";
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
                        i3 = 94;
                        break;
                    case ay.f /*1*/:
                        i3 = 16;
                        break;
                    case ay.n /*2*/:
                        i3 = 48;
                        break;
                    case ay.p /*3*/:
                        i3 = 53;
                        break;
                    default:
                        i3 = 74;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "=\u007f^A/0d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "*uHAe6d]Y";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "*yDY/";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "*\u007fDT&\u0001dYX/\u0001c@P$*";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "*\u007fDT&\u0001dYX/\u0001c@P$*";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "+b\\";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.faq_item);
        getSupportActionBar().setTitle(getIntent().getStringExtra(z[4]));
        String stringExtra = getIntent().getStringExtra(z[2]);
        ((WebView) findViewById(R.id.web_view)).loadDataWithBaseURL(getIntent().getStringExtra(z[1]), stringExtra, z[3], z[0], null);
        this.j = 0;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.l = System.currentTimeMillis();
        this.j += this.l - this.k;
        this.k = System.currentTimeMillis();
    }

    public void onResume() {
        super.onResume();
        this.k = System.currentTimeMillis();
    }

    public void onBackPressed() {
        this.l = System.currentTimeMillis();
        this.j += this.l - this.k;
        this.k = System.currentTimeMillis();
        setResult(-1, new Intent().putExtra(z[6], this.j));
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void onStop() {
        super.onStop();
        this.l = System.currentTimeMillis();
        this.j += this.l - this.k;
        this.k = System.currentTimeMillis();
        setResult(-1, new Intent().putExtra(z[5], this.j));
    }
}
