package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

class ay {
    private static String arH;
    static Map arI;

    static {
        arI = new HashMap();
    }

    ay() {
    }

    static void cH(String str) {
        synchronized (ay.class) {
            arH = str;
        }
    }

    static void d(Context context, String str) {
        cz.a(context, "gtm_install_referrer", "referrer", str);
        f(context, str);
    }

    static void f(Context context, String str) {
        String w = w(str, "conv");
        if (w != null && w.length() > 0) {
            arI.put(w, str);
            cz.a(context, "gtm_click_referrers", w, str);
        }
    }

    static String w(String str, String str2) {
        return str2 == null ? str.length() > 0 ? str : null : Uri.parse("http://hostname/?" + str).getQueryParameter(str2);
    }
}
