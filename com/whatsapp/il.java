package com.whatsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class il extends FragmentStatePagerAdapter implements qt {
    private static final String[] z;
    av0[] a;
    final HomeActivity b;

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
        r6 = 93;
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "\u0005ZA}4%WI}->AM)4>\\\u0004.5>GH9}3W\u000418\"A\u00042/qWU(<=\u0012P2gb";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000c:
        r2 = r2.toCharArray();
        r7 = r2.length;
        r8 = r7;
        r9 = r1;
        r7 = r2;
    L_0x0014:
        if (r8 > r9) goto L_0x0031;
    L_0x0016:
        r2 = new java.lang.String;
        r2.<init>(r7);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002c;
            default: goto L_0x0022;
        };
    L_0x0022:
        r4[r3] = r2;
        r2 = 1;
        r0 = "\u0005ZA}4%WI}->AM)4>\\\u0004.5>GH9}3W\u000418\"A\u00042/qWU(<=\u0012P2gb";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000c;
    L_0x002c:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x0031:
        r10 = r7[r9];
        r2 = r9 % 5;
        switch(r2) {
            case 0: goto L_0x0041;
            case 1: goto L_0x0044;
            case 2: goto L_0x0047;
            case 3: goto L_0x004a;
            default: goto L_0x0038;
        };
    L_0x0038:
        r2 = r6;
    L_0x0039:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0014;
    L_0x0041:
        r2 = 81;
        goto L_0x0039;
    L_0x0044:
        r2 = 50;
        goto L_0x0039;
    L_0x0047:
        r2 = 36;
        goto L_0x0039;
    L_0x004a:
        r2 = r6;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.il.<clinit>():void");
    }

    public il(HomeActivity homeActivity, FragmentManager fragmentManager) {
        this.b = homeActivity;
        super(fragmentManager);
        this.a = new av0[3];
    }

    static av0 a(il ilVar, int i) {
        return ilVar.a(i);
    }

    public CharSequence getPageTitle(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                return this.b.getString(R.string.calls).toUpperCase();
            case ay.f /*1*/:
                try {
                    return this.b.getString(R.string.chats).toUpperCase();
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case ay.n /*2*/:
                return this.b.getString(R.string.contacts).toUpperCase();
            default:
                throw new IllegalArgumentException(z[0]);
        }
    }

    public int getCount() {
        return 3;
    }

    public View a(int i) {
        return a(i).c;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
    }

    private av0 a(int i) {
        if (this.a[i] == null) {
            av0 com_whatsapp_av0 = new av0(null);
            com_whatsapp_av0.c = this.b.getLayoutInflater().inflate(R.layout.home_tab, null, false);
            com_whatsapp_av0.a = (TextView) com_whatsapp_av0.c.findViewById(R.id.tab);
            com_whatsapp_av0.a.setText(getPageTitle(i));
            com_whatsapp_av0.d = (TextView) com_whatsapp_av0.c.findViewById(R.id.badge);
            this.a[i] = com_whatsapp_av0;
        }
        return this.a[i];
    }

    public Fragment getItem(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                return new CallsFragment();
            case ay.f /*1*/:
                try {
                    return new ConversationsFragment();
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case ay.n /*2*/:
                return new ContactsFragment();
            default:
                throw new IllegalArgumentException(z[1]);
        }
    }
}
