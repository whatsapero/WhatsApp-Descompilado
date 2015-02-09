package com.whatsapp;

import com.actionbarsherlock.R;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.Menu;

class bb implements Callback {
    private static final String[] z;
    final ContactsFragment a;

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "F\t:a";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r6 = r2.length;
        r7 = r6;
        r8 = r1;
        r6 = r2;
    L_0x0012:
        if (r7 > r8) goto L_0x002f;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "F\t:a";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x002f:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0046;
            case 3: goto L_0x0049;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 11;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 44;
        goto L_0x0038;
    L_0x0043:
        r2 = 96;
        goto L_0x0038;
    L_0x0046:
        r2 = 94;
        goto L_0x0038;
    L_0x0049:
        r2 = 18;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bb.<clinit>():void");
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        menu.add(0, (int) R.id.menuitem_new_broadcast, 0, (int) R.string.new_broadcast).setShowAsAction(6);
        menu.add(0, (int) R.id.menuitem_new_group, 0, (int) R.string.menuitem_groupchat).setShowAsAction(6);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        ContactsFragment.a(this.a, null);
        ContactsFragment.c(this.a).notifyDataSetChanged();
        ContactsFragment.a(this.a, null);
    }

    bb(ContactsFragment contactsFragment) {
        this.a = contactsFragment;
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onActionItemClicked(com.actionbarsherlock.view.ActionMode r7, com.actionbarsherlock.view.MenuItem r8) {
        /*
        r6_this = this;
        r5 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r8.getItemId();
        switch(r0) {
            case 2131427346: goto L_0x000b;
            case 2131427350: goto L_0x0059;
            default: goto L_0x000a;
        };
    L_0x000a:
        return r5;
    L_0x000b:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r6.a;
        r0 = com.whatsapp.ContactsFragment.k(r0);
        r0 = r0.keySet();
        r3 = r0.iterator();
    L_0x001e:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x003a;
    L_0x0024:
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        r4 = r2.length();
        if (r4 == 0) goto L_0x0035;
    L_0x0030:
        r4 = ",";
        r2.append(r4);
    L_0x0035:
        r2.append(r0);
        if (r1 == 0) goto L_0x001e;
    L_0x003a:
        r0 = new android.content.Intent;
        r3 = r6.a;
        r3 = r3.getActivity();
        r4 = com.whatsapp.ListMembersSelector.class;
        r0.<init>(r3, r4);
        r3 = z;
        r3 = r3[r5];
        r2 = r2.toString();
        r0.putExtra(r3, r2);
        r2 = r6.a;
        r2.startActivity(r0);
        if (r1 == 0) goto L_0x000a;
    L_0x0059:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r6.a;
        r0 = com.whatsapp.ContactsFragment.k(r0);
        r0 = r0.keySet();
        r3 = r0.iterator();
    L_0x006c:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0088;
    L_0x0072:
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        r4 = r2.length();
        if (r4 == 0) goto L_0x0083;
    L_0x007e:
        r4 = ",";
        r2.append(r4);
    L_0x0083:
        r2.append(r0);
        if (r1 == 0) goto L_0x006c;
    L_0x0088:
        r0 = new android.content.Intent;
        r1 = r6.a;
        r1 = r1.getActivity();
        r3 = com.whatsapp.NewGroup.class;
        r0.<init>(r1, r3);
        r1 = z;
        r3 = 1;
        r1 = r1[r3];
        r2 = r2.toString();
        r0.putExtra(r1, r2);
        r1 = r6.a;
        r1.startActivity(r0);
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bb.onActionItemClicked(com.actionbarsherlock.view.ActionMode, com.actionbarsherlock.view.MenuItem):boolean");
    }
}
