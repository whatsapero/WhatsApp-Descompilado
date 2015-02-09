package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.util.List;

class vc extends AsyncTask {
    final ym a;

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected List a(Void[] voidArr) {
        try {
            return WebImagePicker.e(this.a.b).b();
        } catch (Throwable e) {
            Log.c(e);
            return null;
        } catch (Throwable e2) {
            Log.c(e2);
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.util.List r7) {
        /*
        r6_this = this;
        r1 = 1;
        r2 = 0;
        r3 = r6.a;
        r0 = r6.a;
        r0 = r0.b;
        r0 = com.whatsapp.WebImagePicker.e(r0);
        r0 = r0.c();
        if (r0 == 0) goto L_0x0090;
    L_0x0012:
        r0 = r6.a;
        r0 = r0.b;
        r0 = com.whatsapp.WebImagePicker.c(r0);
        r0 = r0.size();
        r4 = 100;
        if (r0 >= r4) goto L_0x0090;
    L_0x0022:
        r0 = r1;
    L_0x0023:
        com.whatsapp.ym.a(r3, r0);
        r0 = r6.a;
        r3 = 0;
        com.whatsapp.ym.a(r0, r3);
        if (r7 == 0) goto L_0x0044;
    L_0x002e:
        r0 = r6.a;
        r0 = r0.b;
        r0 = com.whatsapp.WebImagePicker.c(r0);
        r7.removeAll(r0);
        r0 = r6.a;
        r0 = r0.b;
        r0 = com.whatsapp.WebImagePicker.c(r0);
        r0.addAll(r7);
    L_0x0044:
        r0 = r6.a;
        r0 = r0.b;
        r0 = com.whatsapp.WebImagePicker.c(r0);
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x008a;
    L_0x0052:
        r0 = r6.a;
        r0 = r0.b;
        r0 = r0.getListView();
        r0 = r0.getEmptyView();
        r0 = (android.widget.TextView) r0;
        if (r7 != 0) goto L_0x006c;
    L_0x0062:
        r3 = 2131624671; // 0x7f0e02df float:1.8876528E38 double:1.05316252E-314;
        r0.setText(r3);
        r3 = com.whatsapp.App.az;
        if (r3 == 0) goto L_0x008a;
    L_0x006c:
        r3 = r6.a;
        r3 = r3.b;
        r4 = 2131624664; // 0x7f0e02d8 float:1.8876514E38 double:1.0531625163E-314;
        r1 = new java.lang.Object[r1];
        r5 = r6.a;
        r5 = r5.b;
        r5 = com.whatsapp.WebImagePicker.e(r5);
        r5 = r5.d();
        r1[r2] = r5;
        r1 = r3.getString(r4, r1);
        r0.setText(r1);
    L_0x008a:
        r0 = r6.a;
        r0.notifyDataSetChanged();
        return;
    L_0x0090:
        r0 = r2;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.vc.a(java.util.List):void");
    }

    protected void onPostExecute(Object obj) {
        a((List) obj);
    }

    vc(ym ymVar) {
        this.a = ymVar;
    }
}
