package com.whatsapp;

import android.content.Intent;
import com.actionbarsherlock.R;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class a_w implements Runnable {
    private static final String[] z;
    final ArrayList a;
    final yp b;

    static {
        String[] strArr = new String[7];
        String str = "l\u001eK\f\u001bd\u0014\u0001\u0017\u001ay\u0015A\nZl\u0013[\u0017\u001bc^|;:I/b+8Y9\u007f21";
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
                        i3 = 13;
                        break;
                    case ay.f /*1*/:
                        i3 = 112;
                        break;
                    case ay.n /*2*/:
                        i3 = 47;
                        break;
                    case ay.p /*3*/:
                        i3 = 126;
                        break;
                    default:
                        i3 = 116;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "l\u001eK\f\u001bd\u0014\u0001\u0017\u001ay\u0015A\nZh\b[\f\u0015#$j& ";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "#\u0004W\n";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "l\u001eK\f\u001bd\u0014\u0001\u0017\u001ay\u0015A\nZh\b[\f\u0015##{,1L=";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "y\u0015W\n['";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "VO\u0015\"['R\u0013@\bP";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "l\u001eK\f\u001bd\u0014\u0001\u0017\u001ay\u0015A\nZh\b[\f\u0015##z<>H3{";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a_w(yp ypVar, ArrayList arrayList) {
        this.b = ypVar;
        this.a = arrayList;
    }

    public void run() {
        this.b.e.c();
        if (this.a != null) {
            String str = App.p.getString(R.string.email_conversation_subject, new Object[]{this.b.a.a(this.b.b)}).replaceAll(z[6], "") + z[3];
            or.a(new Intent(z[0]).setType(z[5]).putExtra(z[1], App.p.getString(R.string.email_conversation_subject, new Object[]{this.b.a.a(this.b.b)})).putExtra(z[2], App.p.getString(R.string.email_conversation_body, new Object[]{str})).putParcelableArrayListExtra(z[4], this.a), this.b.b, this.b.e, this.b.b.getString(R.string.send_conversation_via));
            if (App.az == 0) {
                return;
            }
        }
        this.b.e.a(R.string.email_conversation_failed);
    }
}
