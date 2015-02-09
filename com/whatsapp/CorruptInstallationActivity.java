package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class CorruptInstallationActivity extends DialogToastActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "JT/\u000e\u0014JOl\t\u0000YK.\b\u0001";
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
                        i3 = 41;
                        break;
                    case ay.f /*1*/:
                        i3 = 59;
                        break;
                    case ay.n /*2*/:
                        i3 = 65;
                        break;
                    case ay.p /*3*/:
                        i3 = 122;
                        break;
                    default:
                        i3 = 117;
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
                    str = "AO5\n\u0006\u0013\u0014n\r\u0002^\u00156\u0012\u0014]H \n\u0005\u0007X.\u0017";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "JT/\u000e\u0014JOl\t\u0000YK.\b\u0001\tW(\u0014\u001e\t].\u000f\u001bM";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        int i = App.az;
        super.onCreate(bundle);
        setContentView(R.layout.activity_corrupt_installation);
        TextView textView = (TextView) findViewById(R.id.corrupt_installation_contact_support_textview);
        Spanned fromHtml = Html.fromHtml(getString(R.string.corrupt_installation_contact_support_prompt));
        CharSequence spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int length = uRLSpanArr.length;
            int i2 = 0;
            while (i2 < length) {
                URLSpan uRLSpan = uRLSpanArr[i2];
                if (z[0].equals(uRLSpan.getURL())) {
                    Log.i(z[1]);
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new u3(new Intent(null, null, this, DescribeProblemActivity.class)), spanStart, spanEnd, spanFlags);
                }
                i2++;
                if (i != 0) {
                    break;
                }
            }
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        ((Button) findViewById(R.id.btn_play_store)).setOnClickListener(new jj(this));
        ((Button) findViewById(R.id.btn_uninstall)).setOnClickListener(new atu(this));
        View findViewById = findViewById(R.id.play_store_div);
        View findViewById2 = findViewById(R.id.website_div);
        switch (App.G) {
            case ay.f /*1*/:
                textView = (TextView) findViewById(R.id.corrupt_installation_description_website_distribution_textview);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(Html.fromHtml(String.format(getString(R.string.corrupt_installation_description_website_distribution), new Object[]{z[2]})));
                findViewById.setVisibility(8);
                if (i != 0) {
                    break;
                }
                return;
        }
        findViewById2.setVisibility(8);
    }
}
