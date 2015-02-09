package com.whatsapp;

import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;

class a3s extends BaseAdapter implements Filterable {
    private static final String[] z;
    private Filter a;
    final MultipleContactsSelector b;
    private ArrayList c;

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
        r2 = "m_";
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
        r0 = "m_";
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
        r2 = 8;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 77;
        goto L_0x0038;
    L_0x0043:
        r2 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        goto L_0x0038;
    L_0x0046:
        r2 = 95;
        goto L_0x0038;
    L_0x0049:
        r2 = 43;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a3s.<clinit>():void");
    }

    public a3s(MultipleContactsSelector multipleContactsSelector) {
        this.b = multipleContactsSelector;
        this.a = new q4(this, null);
    }

    public boolean hasStableIds() {
        return true;
    }

    public long getItemId(int i) {
        return 0;
    }

    public m8 a(int i) {
        m8 m8Var;
        synchronized (this.c) {
            m8Var = (m8) this.c.get(i);
        }
        return m8Var;
    }

    public Object getItem(int i) {
        return a(i);
    }

    static ArrayList a(a3s com_whatsapp_a3s, ArrayList arrayList) {
        com_whatsapp_a3s.c = arrayList;
        return arrayList;
    }

    public int getCount() {
        return this.c != null ? this.c.size() : 0;
    }

    public Filter getFilter() {
        return this.a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
        r12_this = this;
        r11 = 2131296306; // 0x7f090032 float:1.8210525E38 double:1.053000286E-314;
        r10 = 33;
        r9 = 1;
        r8 = 0;
        r2 = com.whatsapp.App.az;
        r3 = r12.a(r13);
        if (r14 != 0) goto L_0x001d;
    L_0x000f:
        r0 = r12.b;
        r0 = r0.getLayoutInflater();
        r1 = 2130903073; // 0x7f030021 float:1.7412954E38 double:1.052806003E-314;
        r4 = 0;
        r14 = com.whatsapp.b7.a(r0, r1, r4);
    L_0x001d:
        r0 = 2131427508; // 0x7f0b00b4 float:1.8476634E38 double:1.0530651083E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = r12.b;
        r1 = com.whatsapp.MultipleContactsSelector.c(r1);
        r1.b(r3, r0);
        r0 = 2131427510; // 0x7f0b00b6 float:1.8476638E38 double:1.0530651093E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.am1.a(r0);
        r1 = r12.b;
        r1 = r3.a(r1);
        r4 = r12.b;
        r4 = r4.r;
        r4 = r4.getText();
        r4 = r4.toString();
        r4 = r4.toLowerCase();
        r5 = new android.text.SpannableStringBuilder;
        r5.<init>(r1);
        r6 = r1.toLowerCase();
        r6 = r6.startsWith(r4);
        if (r6 == 0) goto L_0x0078;
    L_0x0060:
        r6 = new android.text.style.ForegroundColorSpan;
        r7 = r12.b;
        r7 = r7.getResources();
        r7 = r7.getColor(r11);
        r6.<init>(r7);
        r7 = r4.length();
        r5.setSpan(r6, r8, r7, r10);
        if (r2 == 0) goto L_0x00b0;
    L_0x0078:
        r1 = r1.toLowerCase();
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = " ";
        r6 = r6.append(r7);
        r6 = r6.append(r4);
        r6 = r6.toString();
        r1 = r1.indexOf(r6);
        if (r1 <= 0) goto L_0x00b0;
    L_0x0095:
        r6 = new android.text.style.ForegroundColorSpan;
        r7 = r12.b;
        r7 = r7.getResources();
        r7 = r7.getColor(r11);
        r6.<init>(r7);
        r7 = r1 + 1;
        r1 = r1 + 1;
        r4 = r4.length();
        r1 = r1 + r4;
        r5.setSpan(r6, r7, r1, r10);
    L_0x00b0:
        r0.setText(r5);
        r1 = 2131427512; // 0x7f0b00b8 float:1.8476642E38 double:1.0530651103E-314;
        r1 = r14.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r4 = r3.e;
        r4 = com.whatsapp.App.c(r4);
        if (r4 == 0) goto L_0x00d5;
    L_0x00c4:
        r4 = 2131625035; // 0x7f0e044b float:1.8877267E38 double:1.0531626996E-314;
        r1.setText(r4);
        r4 = -7829368; // 0xffffffffff888888 float:NaN double:NaN;
        r0.setTextColor(r4);
        r14.setLongClickable(r9);
        if (r2 == 0) goto L_0x0105;
    L_0x00d5:
        r2 = r3.b;
        if (r2 == 0) goto L_0x0121;
    L_0x00d9:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = r3.b;
        r2 = r2.append(r4);
        r4 = z;
        r4 = r4[r9];
        r2 = r2.append(r4);
        r2 = r2.toString();
    L_0x00f0:
        r4 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0.setTextColor(r4);
        r0 = r12.b;
        r0 = r0.getBaseContext();
        r0 = com.whatsapp.util.a5.c(r2, r0);
        r1.setText(r0);
        r14.setLongClickable(r8);
    L_0x0105:
        r0 = r12.b;
        r0 = r0.getResources();
        r1 = r3.a(r0);
        if (r1 == 0) goto L_0x011d;
    L_0x0111:
        r0 = 2131427511; // 0x7f0b00b7 float:1.847664E38 double:1.05306511E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0.setText(r1);
    L_0x011d:
        r14.setTag(r3);
        return r14;
    L_0x0121:
        r2 = z;
        r2 = r2[r8];
        goto L_0x00f0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a3s.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
