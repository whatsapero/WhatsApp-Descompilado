package com.whatsapp;

import android.content.Context;
import android.os.AsyncTask;
import com.amazon.device.home.GroupedListHeroWidget;
import com.amazon.device.home.HomeManager;

public class at4 {
    public static boolean b;
    private AsyncTask a;
    private GroupedListHeroWidget c;
    private HomeManager d;
    private Context e;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String[] b(java.lang.String r4, int r5) {
        /*
        r3 = 1;
        r2 = 0;
        r0 = 2;
        r1 = new java.lang.String[r0];
        r0 = r4.length();
        if (r0 > r5) goto L_0x0015;
    L_0x000b:
        r1[r2] = r4;
        r0 = "";
        r1[r3] = r0;
        r0 = b;
        if (r0 == 0) goto L_0x002e;
    L_0x0015:
        r0 = java.text.BreakIterator.getWordInstance();
        r0.setText(r4);
        r0 = r0.preceding(r5);
        if (r0 != 0) goto L_0x002f;
    L_0x0022:
        r0 = r4.substring(r2, r5);
        r1[r2] = r0;
        r0 = r4.substring(r5);
        r1[r3] = r0;
    L_0x002e:
        return r1;
    L_0x002f:
        r5 = r0;
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.at4.b(java.lang.String, int):java.lang.String[]");
    }

    public at4(Context context) {
        this.e = context;
        this.d = HomeManager.getInstance(context);
    }

    static String[] a(String str, int i) {
        return b(str, i);
    }

    static GroupedListHeroWidget b(at4 com_whatsapp_at4) {
        return com_whatsapp_at4.c;
    }

    static GroupedListHeroWidget a(at4 com_whatsapp_at4, GroupedListHeroWidget groupedListHeroWidget) {
        com_whatsapp_at4.c = groupedListHeroWidget;
        return groupedListHeroWidget;
    }

    static Context c(at4 com_whatsapp_at4) {
        return com_whatsapp_at4.e;
    }

    static HomeManager a(at4 com_whatsapp_at4) {
        return com_whatsapp_at4.d;
    }

    public void a() {
        boolean z = false;
        boolean z2 = b;
        if (this.a != null) {
            this.a.cancel(true);
        }
        this.a = new aku(this);
        a5w.a(this.a, new Void[0]);
        if (DialogToastActivity.i) {
            if (!z2) {
                z = true;
            }
            b = z;
        }
    }
}
