package com.whatsapp;

import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.Menu;

class fp implements Callback {
    private static final String[] z;
    final MediaGallery a;

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
        r2 = "wRi";
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
        r0 = "<\u0013'=94\u0019m&8)\u0018-;x8\u00057=7s.\u0017\u001d\u0013\u001c0";
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
        r2 = 86;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 93;
        goto L_0x0038;
    L_0x0043:
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        goto L_0x0038;
    L_0x0046:
        r2 = 67;
        goto L_0x0038;
    L_0x0049:
        r2 = 79;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fp.<clinit>():void");
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    fp(MediaGallery mediaGallery) {
        this.a = mediaGallery;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        MediaGallery.n(this.a).clear();
        MediaGallery.a(this.a, null);
        MediaGallery.f(this.a).notifyDataSetChanged();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onActionItemClicked(com.actionbarsherlock.view.ActionMode r9, com.actionbarsherlock.view.MenuItem r10) {
        /*
        r8_this = this;
        r7 = 1;
        r6 = 0;
        r3 = com.whatsapp.App.az;
        r0 = r10.getItemId();
        switch(r0) {
            case 0: goto L_0x000c;
            case 1: goto L_0x0079;
            default: goto L_0x000b;
        };
    L_0x000b:
        return r6;
    L_0x000c:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r2 = 0;
        r0 = r8.a;
        r0 = com.whatsapp.MediaGallery.n(r0);
        r0 = r0.values();
        r5 = r0.iterator();
    L_0x0020:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0056;
    L_0x0026:
        r0 = r5.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r1 = r0.A;
        r1 = (com.whatsapp.MediaData) r1;
        r1 = r1.file;
        r1 = android.net.Uri.fromFile(r1);
        r4.add(r1);
        if (r2 != 0) goto L_0x0081;
    L_0x003b:
        r1 = r0.j;
        r1 = com.whatsapp.App.a(r1);
        if (r3 == 0) goto L_0x007f;
    L_0x0043:
        r0 = r0.j;
        r0 = com.whatsapp.App.a(r0);
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x007f;
    L_0x004f:
        r0 = z;
        r1 = r0[r6];
        r2 = r1;
    L_0x0054:
        if (r3 == 0) goto L_0x0020;
    L_0x0056:
        r0 = new android.content.Intent;
        r1 = r8.a;
        r5 = com.whatsapp.ContactPicker.class;
        r0.<init>(r1, r5);
        r0.setType(r2);
        r1 = z;
        r1 = r1[r7];
        r0.putParcelableArrayListExtra(r1, r4);
        r1 = r8.a;
        r1.startActivity(r0);
        r0 = r8.a;
        r0 = com.whatsapp.MediaGallery.e(r0);
        r0.finish();
        if (r3 == 0) goto L_0x000b;
    L_0x0079:
        r0 = r8.a;
        r0.showDialog(r7);
        goto L_0x000b;
    L_0x007f:
        r2 = r1;
        goto L_0x0054;
    L_0x0081:
        r1 = r2;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fp.onActionItemClicked(com.actionbarsherlock.view.ActionMode, com.actionbarsherlock.view.MenuItem):boolean");
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        MediaGallery.a(this.a, new TextView(this.a.getSupportActionBar().getThemedContext(), null, R.style.Theme.ActionBar.TitleTextStyle));
        actionMode.setCustomView(MediaGallery.d(this.a));
        menu.add(0, 1, 0, (int) R.string.delete).setIcon((int) R.drawable.ic_action_delete).setShowAsAction(2);
        MediaGallery.a(this.a, menu.add(0, 0, 0, (int) R.string.conversation_menu_forward).setIcon((int) R.drawable.ic_action_forward));
        MediaGallery.i(this.a).setShowAsAction(2);
        return true;
    }
}
