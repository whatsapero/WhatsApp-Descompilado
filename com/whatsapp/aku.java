package com.whatsapp;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class aku extends AsyncTask {
    final at4 a;

    aku(at4 com_whatsapp_at4) {
        this.a = com_whatsapp_at4;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.ArrayList r15) {
        /*
        r14_this = this;
        r13 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r12 = 1;
        r2 = 0;
        r3 = com.whatsapp.at4.b;
        if (r15 == 0) goto L_0x010c;
    L_0x0008:
        r0 = r14.a;
        r1 = new com.amazon.device.home.GroupedListHeroWidget;
        r1.<init>();
        com.whatsapp.at4.a(r0, r1);
        r0 = r14.a;
        r0 = com.whatsapp.at4.a(r0);
        r1 = r15.size();
        r0.updateNumericBadge(r1);
        r4 = new java.util.ArrayList;
        r4.<init>();
        r1 = r2;
    L_0x0025:
        r0 = r15.size();
        if (r1 >= r0) goto L_0x00ce;
    L_0x002b:
        r0 = 49;
        if (r1 >= r0) goto L_0x00ce;
    L_0x002f:
        r5 = new com.amazon.device.home.GroupedListHeroWidget$ListEntry;
        r0 = r14.a;
        r0 = com.whatsapp.at4.c(r0);
        r5.<init>(r0);
        r0 = com.amazon.device.home.GroupedListHeroWidget.VisualStyle.PEEKABLE;
        r5.setVisualStyle(r0);
        r0 = r15.get(r1);
        r0 = (com.whatsapp.protocol.b) r0;
        r6 = com.whatsapp.App.P;
        r7 = r0.e;
        r7 = r7.c;
        r6 = r6.a(r7);
        r7 = r14.a;
        r7 = com.whatsapp.at4.c(r7);
        r7 = r6.a(r7);
        r8 = r14.a;
        r8 = com.whatsapp.at4.c(r8);
        r8 = com.whatsapp.notification.t.a(r8, r0, r6, r2, r2);
        r8 = com.whatsapp.util.a5.a(r8);
        r9 = r14.a;
        r9 = com.whatsapp.at4.c(r9);
        r10 = com.whatsapp.App.f(r0);
        r9 = com.whatsapp.util.bm.h(r9, r10);
        r10 = new com.amazon.device.home.HeroWidgetActivityStarterIntent;
        r11 = com.whatsapp.Conversation.class;
        r11 = r11.getCanonicalName();
        r0 = r0.e;
        r0 = r0.c;
        r10.<init>(r11, r0);
        r5.setContentIntent(r10);
        r0 = com.whatsapp.util.a5.a(r7);
        r5.setPrimaryText(r0);
        r0 = 29;
        r0 = com.whatsapp.at4.a(r8, r0);
        r7 = 0;
        r7 = r0[r7];	 Catch:{ Exception -> 0x010d }
        r5.setSecondaryText(r7);	 Catch:{ Exception -> 0x010d }
        r7 = 1;
        r7 = r0[r7];	 Catch:{ Exception -> 0x010d }
        r7 = r7.length();	 Catch:{ Exception -> 0x010d }
        if (r7 <= r13) goto L_0x00b0;
    L_0x00a3:
        r7 = 1;
        r8 = 1;
        r8 = r0[r8];	 Catch:{ Exception -> 0x010d }
        r10 = 0;
        r11 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r8 = r8.substring(r10, r11);	 Catch:{ Exception -> 0x010d }
        r0[r7] = r8;	 Catch:{ Exception -> 0x010d }
    L_0x00b0:
        r0 = r0[r12];
        r5.setTertiaryText(r0);
        r5.setQuaternaryText(r9);
        r0 = r6.p();
        if (r0 == 0) goto L_0x00c7;
    L_0x00be:
        r0 = android.net.Uri.fromFile(r0);
        if (r0 == 0) goto L_0x00c7;
    L_0x00c4:
        r5.setPrimaryIcon(r0);	 Catch:{ Exception -> 0x010f }
    L_0x00c7:
        r4.add(r5);	 Catch:{ Exception -> 0x0111 }
    L_0x00ca:
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x011f;
    L_0x00ce:
        r0 = new com.amazon.device.home.GroupedListHeroWidget$Group;
        r0.<init>();
        r1 = r15.size();	 Catch:{ Exception -> 0x0116 }
        if (r1 == 0) goto L_0x00eb;
    L_0x00d9:
        r1 = r14.a;	 Catch:{ Exception -> 0x0116 }
        r1 = com.whatsapp.at4.c(r1);	 Catch:{ Exception -> 0x0116 }
        r2 = 2131623992; // 0x7f0e0038 float:1.8875151E38 double:1.0531621843E-314;
        r1 = r1.getString(r2);	 Catch:{ Exception -> 0x0116 }
        r0.setGroupName(r1);	 Catch:{ Exception -> 0x0116 }
        if (r3 == 0) goto L_0x00f0;
    L_0x00eb:
        r1 = "";
        r0.setGroupName(r1);	 Catch:{ Exception -> 0x0118 }
    L_0x00f0:
        r0.setListEntries(r4);
        r1 = r14.a;	 Catch:{ Exception -> 0x011a }
        r1 = com.whatsapp.at4.b(r1);	 Catch:{ Exception -> 0x011a }
        r2 = 0;
        r1.addGroup(r2, r0);	 Catch:{ Exception -> 0x011a }
    L_0x00fd:
        r0 = r14.a;
        r0 = com.whatsapp.at4.a(r0);
        r1 = r14.a;
        r1 = com.whatsapp.at4.b(r1);
        r0.updateWidget(r1);
    L_0x010c:
        return;
    L_0x010d:
        r0 = move-exception;
        throw r0;
    L_0x010f:
        r0 = move-exception;
        throw r0;
    L_0x0111:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        goto L_0x00ca;
    L_0x0116:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0118 }
    L_0x0118:
        r0 = move-exception;
        throw r0;
    L_0x011a:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        goto L_0x00fd;
    L_0x011f:
        r1 = r0;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aku.a(java.util.ArrayList):void");
    }

    public void onPostExecute(Object obj) {
        a((ArrayList) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected ArrayList a(Void[] voidArr) {
        boolean z = at4.b;
        ArrayList b = v.b();
        List arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (isCancelled()) {
                return null;
            }
            m8 a = App.P.a(str);
            if (a.a > 0) {
                Collection a2 = App.aJ.a(str, Math.min(a.a, 100));
                if (a2 != null) {
                    arrayList.addAll(a2);
                    continue;
                } else {
                    continue;
                }
            }
            if (z) {
                boolean z2;
                if (DialogToastActivity.i) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                DialogToastActivity.i = z2;
                Collections.sort(arrayList, new ey(this));
                return arrayList;
            }
        }
        Collections.sort(arrayList, new ey(this));
        return arrayList;
    }
}
