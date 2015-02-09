package com.whatsapp.util;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;
import android.view.ViewGroup;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class bk implements Factory {
    private static final String z;
    final Activity a;

    static {
        char[] toCharArray = "+%WbN&.H#F,dS\"[-8T-Cf<S)Xf'_\"Zf\u0006S?[\u0005/T9f</W\u001aF-=".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 72;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 58;
                    break;
                case ay.p /*3*/:
                    i2 = 76;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        if (str.equalsIgnoreCase(z)) {
            try {
                ViewGroup viewGroup = (ViewGroup) context.getClassLoader().loadClass(str).asSubclass(ViewGroup.class).getConstructor(new Class[]{Context.class, AttributeSet.class}).newInstance(new Object[]{context, attributeSet});
                new Handler().post(new b2(this, viewGroup));
                return viewGroup;
            } catch (Exception e) {
            }
        }
        return null;
    }

    bk(Activity activity) {
        this.a = activity;
    }
}
