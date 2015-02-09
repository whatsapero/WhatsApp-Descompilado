package com.whatsapp;

import com.actionbarsherlock.R;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import java.util.Map.Entry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class as3 implements Callback {
    private static final String z;
    private MenuItem a;
    private MenuItem b;
    private MenuItem c;
    private MenuItem d;
    final Conversation e;
    private MenuItem f;
    private MenuItem g;
    private MenuItem h;

    static {
        char[] toCharArray = "?1<\u001d\u001e.-3\u001f\u001230}\u0018\u001e0;1\u001f\u0012307\u0005\u001f9:".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 92;
                    break;
                case ay.f /*1*/:
                    i2 = 94;
                    break;
                case ay.n /*2*/:
                    i2 = 82;
                    break;
                case ay.p /*3*/:
                    i2 = 107;
                    break;
                default:
                    i2 = 123;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareActionMode(com.actionbarsherlock.view.ActionMode r9, com.actionbarsherlock.view.Menu r10) {
        /*
        r8_this = this;
        r2 = 1;
        r3 = 0;
        r4 = com.whatsapp.App.az;
        r0 = r8.h;
        r0.setVisible(r2);
        r0 = r8.d;
        r0.setVisible(r2);
        r0 = r8.g;
        r0.setVisible(r3);
        r0 = r8.f;
        r0.setVisible(r3);
        r0 = r8.b;
        r0.setVisible(r3);
        r0 = r8.c;
        r0.setVisible(r3);
        r0 = r8.e;
        r0 = r0.a_;
        r0 = r0.values();
        r5 = r0.iterator();
        r1 = r2;
    L_0x002f:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x00f6;
    L_0x0035:
        r0 = r5.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r0 = r0.j;
        if (r0 == 0) goto L_0x00f3;
    L_0x003f:
        if (r4 == 0) goto L_0x00f0;
    L_0x0041:
        r0 = r3;
    L_0x0042:
        if (r4 == 0) goto L_0x00ed;
    L_0x0044:
        r1 = r8.a;
        r1.setVisible(r0);
        r0 = r8.e;
        r0 = r0.a_;
        r0 = r0.size();
        if (r0 != r2) goto L_0x0095;
    L_0x0053:
        r0 = r8.e;
        r0 = r0.a_;
        r0 = r0.entrySet();
        r0 = r0.iterator();
        r0 = r0.next();
        r0 = (java.util.Map.Entry) r0;
        r0 = r0.getValue();
        r0 = (com.whatsapp.protocol.b) r0;
        r1 = r0.j;
        switch(r1) {
            case 0: goto L_0x00a5;
            case 1: goto L_0x00a9;
            case 2: goto L_0x00a9;
            case 3: goto L_0x00a9;
            case 4: goto L_0x0070;
            case 5: goto L_0x00a7;
            default: goto L_0x0070;
        };
    L_0x0070:
        r1 = r8.c;
        r4 = r0.e;
        r4 = r4.b;
        if (r4 == 0) goto L_0x0092;
    L_0x0078:
        r0 = r0.a;
        r4 = 4;
        r0 = com.whatsapp.protocol.f.a(r0, r4);
        if (r0 < 0) goto L_0x0092;
    L_0x0081:
        r4 = com.whatsapp.App.av;
        r6 = com.whatsapp.ge.p;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0092;
    L_0x0089:
        r4 = com.whatsapp.ge.p;
        r6 = 0;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0092;
    L_0x0091:
        r3 = r2;
    L_0x0092:
        r1.setVisible(r3);
    L_0x0095:
        r0 = r8.e;
        r0 = r0.a_;
        r0 = r0.size();
        r0 = java.lang.String.valueOf(r0);
        r9.setTitle(r0);
        return r2;
    L_0x00a5:
        if (r4 == 0) goto L_0x0070;
    L_0x00a7:
        if (r4 == 0) goto L_0x0070;
    L_0x00a9:
        r1 = r0.A;
        r1 = (com.whatsapp.MediaData) r1;
        r5 = r0.e;
        r5 = r5.b;
        if (r5 != 0) goto L_0x00bd;
    L_0x00b3:
        r5 = r0.e;
        r5 = r5.b;
        if (r5 != 0) goto L_0x00c2;
    L_0x00b9:
        r5 = r1.transferred;
        if (r5 == 0) goto L_0x00c2;
    L_0x00bd:
        r5 = r8.g;
        r5.setVisible(r2);
    L_0x00c2:
        r1 = r1.transferring;
        if (r1 == 0) goto L_0x0070;
    L_0x00c6:
        r1 = r0.e;
        r1 = r1.b;
        if (r1 == 0) goto L_0x00dd;
    L_0x00cc:
        r1 = r8.f;
        r1.setVisible(r2);
        r1 = r8.h;
        r1.setVisible(r3);
        r1 = r8.d;
        r1.setVisible(r3);
        if (r4 == 0) goto L_0x0070;
    L_0x00dd:
        r1 = r8.b;
        r1.setVisible(r2);
        r1 = r8.h;
        r1.setVisible(r3);
        r1 = r8.d;
        r1.setVisible(r3);
        goto L_0x0070;
    L_0x00ed:
        r1 = r0;
        goto L_0x002f;
    L_0x00f0:
        r0 = r3;
        goto L_0x0044;
    L_0x00f3:
        r0 = r1;
        goto L_0x0042;
    L_0x00f6:
        r0 = r1;
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.as3.onPrepareActionMode(com.actionbarsherlock.view.ActionMode, com.actionbarsherlock.view.Menu):boolean");
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.c = this.e.a(menu, 15, (int) R.string.info, (int) R.drawable.ic_action_info);
        this.h = this.e.a(menu, 0, (int) R.string.delete, (int) R.drawable.ic_action_delete);
        this.a = this.e.a(menu, 2, (int) R.string.copy, (int) R.drawable.ic_action_copy);
        this.g = this.e.a(menu, 6, (int) R.string.share, (int) R.drawable.ic_action_share);
        this.f = this.e.a(menu, 4, (int) R.string.cancel, (int) R.drawable.ic_action_cancel);
        this.b = this.e.a(menu, 5, (int) R.string.cancel, (int) R.drawable.ic_action_cancel);
        this.d = this.e.a(menu, 1, (int) R.string.conversation_menu_forward, (int) R.drawable.ic_action_forward);
        this.d.setShowAsAction(2);
        this.h.setShowAsAction(2);
        this.a.setShowAsAction(2);
        this.g.setShowAsAction(2);
        this.f.setShowAsAction(2);
        this.b.setShowAsAction(2);
        this.c.setShowAsAction(2);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        Log.i(z);
        this.e.a_ = null;
        this.e.aS.notifyDataSetChanged();
        Conversation.b(this.e, null);
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case PBE.MD5 /*0*/:
                Conversation.R(this.e);
                return true;
            case ay.f /*1*/:
                Conversation.h(this.e);
                return true;
            case ay.n /*2*/:
                Conversation.j(this.e);
                Conversation.i(this.e);
                return true;
            case aj.i /*4*/:
                Conversation.a(this.e, (b) ((Entry) this.e.a_.entrySet().iterator().next()).getValue());
                Conversation.i(this.e);
                return true;
            case aV.r /*5*/:
                Conversation.e(this.e, (b) ((Entry) this.e.a_.entrySet().iterator().next()).getValue());
                Conversation.i(this.e);
                return true;
            case aV.i /*6*/:
                Conversation.b(this.e, (b) ((Entry) this.e.a_.entrySet().iterator().next()).getValue());
                Conversation.i(this.e);
                return true;
            case vk.SherlockTheme_actionModeBackground /*15*/:
                Conversation.d(this.e, (b) ((Entry) this.e.a_.entrySet().iterator().next()).getValue());
                Conversation.i(this.e);
                return true;
            default:
                return false;
        }
    }

    as3(Conversation conversation) {
        this.e = conversation;
    }
}
