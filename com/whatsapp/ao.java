package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.fieldstats.as;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ao extends ArrayAdapter {
    private static final String z;
    final SearchFAQ a;

    static {
        char[] toCharArray = "@AN9rX\u007f^8a@AC3u".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 44;
                    break;
                case ay.f /*1*/:
                    i2 = 32;
                    break;
                case ay.n /*2*/:
                    i2 = 55;
                    break;
                case ay.p /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 7;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        q qVar;
        TextView textView;
        if (view == null) {
            View linearLayout = new LinearLayout(getContext());
            b7.a((LayoutInflater) getContext().getSystemService(z), R.layout.search_faq_row, linearLayout, true);
            if (App.az == 0) {
                view = linearLayout;
                if (i % 2 != 0) {
                    i2 = -1;
                } else {
                    i2 = -1184275;
                }
                view.setBackgroundColor(i2);
                qVar = (q) getItem(i);
                textView = (TextView) view.findViewById(R.id.search_faq_row_button);
                textView.setText(qVar.b);
                textView.setOnClickListener(new at6(this, qVar));
                SearchFAQ.a(this.a).n = Double.valueOf((double) as.SUGGESTED_FAQ.getCode());
                return view;
            }
        }
        view = (LinearLayout) view;
        if (i % 2 != 0) {
            i2 = -1184275;
        } else {
            i2 = -1;
        }
        view.setBackgroundColor(i2);
        qVar = (q) getItem(i);
        textView = (TextView) view.findViewById(R.id.search_faq_row_button);
        textView.setText(qVar.b);
        textView.setOnClickListener(new at6(this, qVar));
        SearchFAQ.a(this.a).n = Double.valueOf((double) as.SUGGESTED_FAQ.getCode());
        return view;
    }

    public ao(SearchFAQ searchFAQ, Context context, int i, List list) {
        this.a = searchFAQ;
        super(context, i, list);
    }
}
