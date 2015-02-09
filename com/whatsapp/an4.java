package com.whatsapp;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class an4 extends AsyncTask {
    final ContactsFragment a;

    protected void onPostExecute(Object obj) {
        a((ArrayList) obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.util.ArrayList r4) {
        /*
        r3_this = this;
        r2 = 8;
        r0 = r3.a;
        r0 = com.whatsapp.ContactsFragment.i(r0);
        r0.clear();
        r0 = r3.a;
        r0 = com.whatsapp.ContactsFragment.i(r0);
        r0.addAll(r4);
        r0 = r3.a;
        r0 = com.whatsapp.ContactsFragment.d(r0);
        r0.clear();
        r0 = r4.isEmpty();
        if (r0 != 0) goto L_0x007a;
    L_0x0023:
        r0 = r3.a;
        r0 = com.whatsapp.ContactsFragment.e(r0);
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x006f;
    L_0x002f:
        r0 = r3.a;
        r0 = com.whatsapp.ContactsFragment.d(r0);
        r0.addAll(r4);
        r0 = r3.a;
        r0 = com.whatsapp.ContactsFragment.d(r0);
        r0 = r0.size();
        if (r0 != 0) goto L_0x0051;
    L_0x0044:
        r0 = r3.a;
        r0 = com.whatsapp.ContactsFragment.d(r0);
        r1 = com.whatsapp.ContactsFragment.d();
        r0.add(r1);
    L_0x0051:
        r0 = r3.a;
        r0 = com.whatsapp.ContactsFragment.d(r0);
        r1 = com.whatsapp.ContactsFragment.a();
        r0.add(r1);
        r0 = r3.a;
        r0 = com.whatsapp.ContactsFragment.d(r0);
        r1 = com.whatsapp.ContactsFragment.c();
        r0.add(r1);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x007a;
    L_0x006f:
        r0 = r3.a;
        r1 = r3.a;
        r1 = com.whatsapp.ContactsFragment.e(r1);
        r0.a(r1);
    L_0x007a:
        r0 = r3.a;
        r0 = r0.getView();
        r1 = 2131427640; // 0x7f0b0138 float:1.8476902E38 double:1.0530651735E-314;
        r0 = r0.findViewById(r1);
        r0.setVisibility(r2);
        r0 = r3.a;
        r0 = r0.getView();
        r1 = 2131427639; // 0x7f0b0137 float:1.84769E38 double:1.053065173E-314;
        r0 = r0.findViewById(r1);
        r0.setVisibility(r2);
        r1 = r3.a;
        r1 = r1.getListView();
        r1.setEmptyView(r0);
        r0 = r3.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r0.notifyDataSetChanged();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.an4.a(java.util.ArrayList):void");
    }

    protected ArrayList a(Void[] voidArr) {
        int i = App.az;
        ArrayList arrayList = new ArrayList();
        App.P.d(arrayList);
        Set hashSet = new HashSet(arrayList.size(), 1.0f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((m8) it.next()).N);
            if (i != 0) {
                break;
            }
        }
        App.P.a(arrayList, hashSet);
        Collections.sort(arrayList, new k_(this, this.a.getActivity().getApplicationContext()));
        return arrayList;
    }

    private an4(ContactsFragment contactsFragment) {
        this.a = contactsFragment;
    }

    an4(ContactsFragment contactsFragment, qq qqVar) {
        this(contactsFragment);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
