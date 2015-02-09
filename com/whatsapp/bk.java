package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.google.c5;
import com.google.c8;
import com.whatsapp.util.Log;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class bk extends ArrayAdapter {
    private static final String[] z;
    final BlockList a;

    static {
        String[] strArr = new String[3];
        String str = "uXC\n9mfS\u000b*uXN\u0000>";
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
                        i3 = 57;
                        break;
                    case ay.n /*2*/:
                        i3 = 58;
                        break;
                    case ay.p /*3*/:
                        i3 = 101;
                        break;
                    default:
                        i3 = 76;
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
                    str = "{UU\u0006'uPI\u0011c|KH\n>6";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Lj";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        CharSequence a;
        m8 m8Var = (m8) getItem(i);
        if (view == null) {
            View linearLayout = new LinearLayout(getContext());
            b7.a((LayoutInflater) getContext().getSystemService(z[0]), R.layout.contact_picker_row, linearLayout, true);
            linearLayout.findViewById(R.id.contactpicker_row_phone_type).setVisibility(8);
            if (App.az == 0) {
                view = linearLayout;
                BlockList.a(this.a).b(m8Var, (ImageView) view.findViewById(R.id.contactpicker_row_photo));
                textView = (TextView) view.findViewById(R.id.contactpicker_row_name);
                am1.a(textView);
                textView.setText(m8Var.a(getContext()));
                textView = (TextView) view.findViewById(R.id.contactpicker_row_status);
                am1.b(textView);
                a = m8Var.a();
                c8 a2 = c8.a();
                a = a2.a(a2.c(a, z[1]), c5.INTERNATIONAL);
                textView.setText(a);
                return view;
            }
        }
        view = (LinearLayout) view;
        BlockList.a(this.a).b(m8Var, (ImageView) view.findViewById(R.id.contactpicker_row_photo));
        textView = (TextView) view.findViewById(R.id.contactpicker_row_name);
        am1.a(textView);
        textView.setText(m8Var.a(getContext()));
        textView = (TextView) view.findViewById(R.id.contactpicker_row_status);
        am1.b(textView);
        a = m8Var.a();
        try {
            c8 a22 = c8.a();
            a = a22.a(a22.c(a, z[1]), c5.INTERNATIONAL);
        } catch (Throwable e) {
            Log.c(z[2] + a, e);
        }
        textView.setText(a);
        return view;
    }

    public bk(BlockList blockList, Context context, int i, List list) {
        this.a = blockList;
        super(context, i, list);
    }
}
