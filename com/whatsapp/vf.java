package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class vf extends ArrayAdapter {
    private static final String[] z;
    protected ArrayList a;
    private LayoutInflater b;
    private Filter c;
    final ContactsFragment d;

    static {
        String[] strArr = new String[3];
        String str = "-'%\nz-<;\u0017x%-9Qr=<.\u0012w/.9\u0017~ ,9\u0011la**\u001aD>'8\u0017o''%^";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 78;
                        break;
                    case ay.f /*1*/:
                        i3 = 72;
                        break;
                    case ay.n /*2*/:
                        i3 = 75;
                        break;
                    case ay.p /*3*/:
                        i3 = 126;
                        break;
                    default:
                        i3 = 27;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "-'%\nz-<;\u0017x%-9Qr= .\u0012k<'<Qy/,\u0014\u000et=!?\u0017t h";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "-'%\nz-<;\u0017x%-9Qu!\u0017(\u0011u:)(\nha**\u001aD>'8\u0017o''%^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int getCount() {
        return this.a.size();
    }

    public boolean hasStableIds() {
        return true;
    }

    public long getItemId(int i) {
        return (long) (i * 1024);
    }

    private boolean c(int i) {
        if (i < this.a.size() && i >= 0) {
            return ContactsFragment.a() == this.a.get(i);
        } else {
            Log.e(z[0] + i);
            return false;
        }
    }

    private boolean d(int i) {
        if (i < this.a.size() && i >= 0) {
            return ContactsFragment.d() == this.a.get(i);
        } else {
            Log.e(z[1] + i);
            return false;
        }
    }

    public Object getItem(int i) {
        return a(i);
    }

    public m8 a(int i) {
        return (m8) this.a.get(i);
    }

    public Filter getFilter() {
        return this.c;
    }

    static boolean b(vf vfVar, int i) {
        return vfVar.c(i);
    }

    private boolean b(int i) {
        if (i < this.a.size() && i >= 0) {
            return ContactsFragment.c() == this.a.get(i);
        } else {
            Log.e(z[2] + i);
            return false;
        }
    }

    public vf(ContactsFragment contactsFragment, Context context, ArrayList arrayList) {
        this.d = contactsFragment;
        super(context, R.layout.contact_picker_row, arrayList);
        this.c = new mb(this, null);
        this.a = arrayList;
        this.b = LayoutInflater.from(context);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
        r12_this = this;
        r6 = com.whatsapp.App.az;
        r7 = r12.a(r13);
        r0 = com.whatsapp.ContactsFragment.c(r7);
        if (r0 == 0) goto L_0x0032;
    L_0x000c:
        r0 = new android.widget.LinearLayout;
        r1 = r12.getContext();
        r0.<init>(r1);
        r1 = r12.b;
        r2 = 2130903178; // 0x7f03008a float:1.7413167E38 double:1.052806055E-314;
        r3 = 1;
        com.whatsapp.b7.a(r1, r2, r0, r3);
        r1 = 3;
        r1 = java.lang.Integer.valueOf(r1);
        r0.setTag(r1);
        r1 = 2131427915; // 0x7f0b024b float:1.847746E38 double:1.0530653094E-314;
        r1 = r0.findViewById(r1);
        r2 = 1;
        r1.setClickable(r2);
    L_0x0031:
        return r0;
    L_0x0032:
        r2 = r12.c(r13);
        r3 = r12.d(r13);
        r4 = r12.b(r13);
        if (r14 != 0) goto L_0x00f2;
    L_0x0040:
        if (r2 != 0) goto L_0x0044;
    L_0x0042:
        if (r4 == 0) goto L_0x008e;
    L_0x0044:
        r0 = r12.b;
        r1 = 2130903098; // 0x7f03003a float:1.7413004E38 double:1.0528060153E-314;
        r5 = 0;
        r14 = com.whatsapp.b7.a(r0, r1, r5);
        if (r2 == 0) goto L_0x005a;
    L_0x0050:
        r0 = 2;
        r0 = java.lang.Integer.valueOf(r0);
        r14.setTag(r0);
        if (r6 == 0) goto L_0x01c3;
    L_0x005a:
        r0 = 2131427648; // 0x7f0b0140 float:1.8476918E38 double:1.0530651775E-314;
        r0 = r14.findViewById(r0);
        r1 = 8;
        r0.setVisibility(r1);
        r0 = 2131427650; // 0x7f0b0142 float:1.8476922E38 double:1.0530651785E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131624152; // 0x7f0e00d8 float:1.8875476E38 double:1.0531622633E-314;
        r0.setText(r1);
        r0 = 2131427649; // 0x7f0b0141 float:1.847692E38 double:1.053065178E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = 2130838829; // 0x7f02052d float:1.7282651E38 double:1.052774262E-314;
        r0.setImageResource(r1);
        r0 = 4;
        r0 = java.lang.Integer.valueOf(r0);
        r14.setTag(r0);
        if (r6 == 0) goto L_0x01c3;
    L_0x008e:
        if (r3 == 0) goto L_0x00de;
    L_0x0090:
        r0 = r12.b;
        r1 = 2130903096; // 0x7f030038 float:1.7413E38 double:1.0528060144E-314;
        r5 = 0;
        r14 = com.whatsapp.b7.a(r0, r1, r5);
        r0 = new android.widget.AbsListView$LayoutParams;
        r1 = -2;
        r5 = r12.d;
        r5 = r5.getResources();
        r8 = 2131361847; // 0x7f0a0037 float:1.8343458E38 double:1.0530326675E-314;
        r5 = r5.getDimension(r8);
        r5 = (int) r5;
        r0.<init>(r1, r5);
        r1 = 2131427641; // 0x7f0b0139 float:1.8476904E38 double:1.053065174E-314;
        r1 = r14.findViewById(r1);
        r1.setLayoutParams(r0);
        r0 = 2131427643; // 0x7f0b013b float:1.8476908E38 double:1.053065175E-314;
        r0 = r14.findViewById(r0);
        r1 = 1;
        r0.setClickable(r1);
        r0 = 2131427643; // 0x7f0b013b float:1.8476908E38 double:1.053065175E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0 = (android.widget.TextView) r0;
        r1 = 2131624145; // 0x7f0e00d1 float:1.8875461E38 double:1.05316226E-314;
        r0.setText(r1);
        r0 = 5;
        r0 = java.lang.Integer.valueOf(r0);
        r14.setTag(r0);
        if (r6 == 0) goto L_0x01c3;
    L_0x00de:
        r0 = r12.b;
        r1 = 2130903097; // 0x7f030039 float:1.7413002E38 double:1.052806015E-314;
        r5 = 0;
        r14 = com.whatsapp.b7.a(r0, r1, r15, r5);
        r0 = 1;
        r0 = java.lang.Integer.valueOf(r0);
        r14.setTag(r0);
        if (r6 == 0) goto L_0x01c3;
    L_0x00f2:
        r0 = r14.getTag();
        r0 = (java.lang.Integer) r0;
        r5 = r0.intValue();
        if (r2 == 0) goto L_0x0115;
    L_0x00fe:
        r0 = 2;
        if (r5 == r0) goto L_0x01c3;
    L_0x0101:
        r0 = r12.b;
        r1 = 2130903098; // 0x7f03003a float:1.7413004E38 double:1.0528060153E-314;
        r8 = 0;
        r14 = com.whatsapp.b7.a(r0, r1, r8);
        r0 = 2;
        r0 = java.lang.Integer.valueOf(r0);
        r14.setTag(r0);
        if (r6 == 0) goto L_0x01c3;
    L_0x0115:
        if (r4 == 0) goto L_0x0158;
    L_0x0117:
        r0 = 4;
        if (r5 == r0) goto L_0x01c3;
    L_0x011a:
        r0 = r12.b;
        r1 = 2130903098; // 0x7f03003a float:1.7413004E38 double:1.0528060153E-314;
        r8 = 0;
        r14 = com.whatsapp.b7.a(r0, r1, r8);
        r0 = 2131427649; // 0x7f0b0141 float:1.847692E38 double:1.053065178E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = 2130838829; // 0x7f02052d float:1.7282651E38 double:1.052774262E-314;
        r0.setImageResource(r1);
        r0 = 2131427648; // 0x7f0b0140 float:1.8476918E38 double:1.0530651775E-314;
        r0 = r14.findViewById(r0);
        r1 = 8;
        r0.setVisibility(r1);
        r0 = 2131427650; // 0x7f0b0142 float:1.8476922E38 double:1.0530651785E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131624152; // 0x7f0e00d8 float:1.8875476E38 double:1.0531622633E-314;
        r0.setText(r1);
        r0 = 4;
        r0 = java.lang.Integer.valueOf(r0);
        r14.setTag(r0);
        if (r6 == 0) goto L_0x01c3;
    L_0x0158:
        r0 = r14;
        if (r3 == 0) goto L_0x044c;
    L_0x015b:
        r1 = 5;
        if (r5 == r1) goto L_0x0199;
    L_0x015e:
        r0 = r12.b;
        r1 = 2130903096; // 0x7f030038 float:1.7413E38 double:1.0528060144E-314;
        r8 = 0;
        r0 = com.whatsapp.b7.a(r0, r1, r8);
        r1 = new android.widget.AbsListView$LayoutParams;
        r8 = -2;
        r9 = r12.d;
        r9 = r9.getResources();
        r10 = 2131361847; // 0x7f0a0037 float:1.8343458E38 double:1.0530326675E-314;
        r9 = r9.getDimension(r10);
        r9 = (int) r9;
        r1.<init>(r8, r9);
        r8 = 2131427641; // 0x7f0b0139 float:1.8476904E38 double:1.053065174E-314;
        r8 = r0.findViewById(r8);
        r8.setLayoutParams(r1);
        r1 = 2131427643; // 0x7f0b013b float:1.8476908E38 double:1.053065175E-314;
        r1 = r0.findViewById(r1);
        r8 = 1;
        r1.setClickable(r8);
        r1 = 5;
        r1 = java.lang.Integer.valueOf(r1);
        r0.setTag(r1);
    L_0x0199:
        r1 = r0;
        r0 = 2131427643; // 0x7f0b013b float:1.8476908E38 double:1.053065175E-314;
        r0 = r1.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0 = (android.widget.TextView) r0;
        r8 = 2131624145; // 0x7f0e00d1 float:1.8875461E38 double:1.05316226E-314;
        r0.setText(r8);
        if (r6 == 0) goto L_0x0449;
    L_0x01ad:
        r14 = r1;
    L_0x01ae:
        r0 = 1;
        if (r5 == r0) goto L_0x01c3;
    L_0x01b1:
        r0 = r12.b;
        r1 = 2130903097; // 0x7f030039 float:1.7413002E38 double:1.052806015E-314;
        r5 = 0;
        r14 = com.whatsapp.b7.a(r0, r1, r15, r5);
        r0 = 1;
        r0 = java.lang.Integer.valueOf(r0);
        r14.setTag(r0);
    L_0x01c3:
        r5 = r14;
    L_0x01c4:
        if (r2 != 0) goto L_0x01ca;
    L_0x01c6:
        if (r4 != 0) goto L_0x01ca;
    L_0x01c8:
        if (r3 == 0) goto L_0x01cd;
    L_0x01ca:
        r0 = r5;
        goto L_0x0031;
    L_0x01cd:
        r0 = 2131427508; // 0x7f0b00b4 float:1.8476634E38 double:1.0530651083E-314;
        r0 = r5.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = 1;
        r0.setEnabled(r1);
        r1 = r12.d;
        r1 = com.whatsapp.ContactsFragment.g(r1);
        r1.b(r7, r0);
        r1 = 2131427548; // 0x7f0b00dc float:1.8476715E38 double:1.053065128E-314;
        r1 = r5.findViewById(r1);
        r2 = new com.whatsapp.q6;
        r2.<init>(r12, r7);
        r1.setOnClickListener(r2);
        r0.setOnClickListener(r2);
        r0 = 2131427645; // 0x7f0b013d float:1.8476912E38 double:1.053065176E-314;
        r0 = r5.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.am1.a(r0);
        r1 = 2131427647; // 0x7f0b013f float:1.8476916E38 double:1.053065177E-314;
        r1 = r5.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        com.whatsapp.am1.b(r1);
        r2 = 2131427646; // 0x7f0b013e float:1.8476914E38 double:1.0530651765E-314;
        r2 = r5.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = r7.w();
        if (r3 == 0) goto L_0x02f4;
    L_0x021c:
        r3 = r12.getContext();
        r4 = r7.a(r3);
        r3 = r12.d;
        r3 = r3.getActivity();
        r3 = com.whatsapp.util.a5.b(r4, r3);
        r8 = r12.d;
        r8 = com.whatsapp.ContactsFragment.e(r8);
        r8 = android.text.TextUtils.isEmpty(r8);
        if (r8 != 0) goto L_0x02d5;
    L_0x023a:
        r8 = r4.toLowerCase();
        r9 = r12.d;
        r9 = com.whatsapp.ContactsFragment.e(r9);
        r9 = r9.toString();
        r9 = r9.toLowerCase();
        r8 = r8.startsWith(r9);
        if (r8 == 0) goto L_0x027d;
    L_0x0252:
        if (r3 != 0) goto L_0x0259;
    L_0x0254:
        r3 = new android.text.SpannableStringBuilder;
        r3.<init>(r4);
    L_0x0259:
        r8 = new android.text.style.ForegroundColorSpan;
        r9 = r12.d;
        r9 = r9.getResources();
        r10 = 2131296306; // 0x7f090032 float:1.8210525E38 double:1.053000286E-314;
        r9 = r9.getColor(r10);
        r8.<init>(r9);
        r9 = 0;
        r10 = r12.d;
        r10 = com.whatsapp.ContactsFragment.e(r10);
        r10 = r10.length();
        r11 = 33;
        r3.setSpan(r8, r9, r10, r11);
        if (r6 == 0) goto L_0x02d5;
    L_0x027d:
        r8 = r4.toLowerCase();
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r10 = " ";
        r9 = r9.append(r10);
        r10 = r12.d;
        r10 = com.whatsapp.ContactsFragment.e(r10);
        r10 = r10.toString();
        r10 = r10.toLowerCase();
        r9 = r9.append(r10);
        r9 = r9.toString();
        r8 = r8.indexOf(r9);
        if (r8 <= 0) goto L_0x02d5;
    L_0x02a8:
        if (r3 != 0) goto L_0x02af;
    L_0x02aa:
        r3 = new android.text.SpannableStringBuilder;
        r3.<init>(r4);
    L_0x02af:
        r9 = new android.text.style.ForegroundColorSpan;
        r10 = r12.d;
        r10 = r10.getResources();
        r11 = 2131296306; // 0x7f090032 float:1.8210525E38 double:1.053000286E-314;
        r10 = r10.getColor(r11);
        r9.<init>(r10);
        r10 = r8 + 1;
        r8 = r8 + 1;
        r11 = r12.d;
        r11 = com.whatsapp.ContactsFragment.e(r11);
        r11 = r11.length();
        r8 = r8 + r11;
        r11 = 33;
        r3.setSpan(r9, r10, r8, r11);
    L_0x02d5:
        if (r3 != 0) goto L_0x02d8;
    L_0x02d7:
        r3 = r4;
    L_0x02d8:
        r0.setText(r3);
        r3 = r7.e;
        r3 = com.whatsapp.bd.h(r3);
        r1.setText(r3);
        r3 = "";
        r2.setText(r3);
        r3 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0.setTextColor(r3);
        r3 = 0;
        r5.setLongClickable(r3);
        if (r6 == 0) goto L_0x03c6;
    L_0x02f4:
        r3 = r12.getContext();
        r3 = r7.a(r3);
        r4 = 0;
        r8 = r12.d;
        r8 = com.whatsapp.ContactsFragment.e(r8);
        r8 = android.text.TextUtils.isEmpty(r8);
        if (r8 != 0) goto L_0x0348;
    L_0x0309:
        r8 = r3.toLowerCase();
        r9 = r12.d;
        r9 = com.whatsapp.ContactsFragment.e(r9);
        r9 = r9.toString();
        r9 = r9.toLowerCase();
        r8 = r8.startsWith(r9);
        if (r8 == 0) goto L_0x03ea;
    L_0x0321:
        r4 = new android.text.SpannableStringBuilder;
        r4.<init>(r3);
        r8 = new android.text.style.ForegroundColorSpan;
        r9 = r12.d;
        r9 = r9.getResources();
        r10 = 2131296306; // 0x7f090032 float:1.8210525E38 double:1.053000286E-314;
        r9 = r9.getColor(r10);
        r8.<init>(r9);
        r9 = 0;
        r10 = r12.d;
        r10 = com.whatsapp.ContactsFragment.e(r10);
        r10 = r10.length();
        r11 = 33;
        r4.setSpan(r8, r9, r10, r11);
    L_0x0348:
        if (r4 != 0) goto L_0x0442;
    L_0x034a:
        r0.setText(r3);
        r3 = r7.e;
        r3 = com.whatsapp.App.c(r3);
        if (r3 == 0) goto L_0x0367;
    L_0x0355:
        r3 = 2131625010; // 0x7f0e0432 float:1.8877216E38 double:1.0531626873E-314;
        r1.setText(r3);
        r3 = -7829368; // 0xffffffffff888888 float:NaN double:NaN;
        r0.setTextColor(r3);
        r3 = 1;
        r5.setLongClickable(r3);
        if (r6 == 0) goto L_0x03b7;
    L_0x0367:
        r3 = 0;
        r5.setLongClickable(r3);
        r3 = 2131427644; // 0x7f0b013c float:1.847691E38 double:1.0530651755E-314;
        r4 = r5.findViewById(r3);
        r3 = r7.q;
        if (r3 == 0) goto L_0x0399;
    L_0x0376:
        r3 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0.setTextColor(r3);
        r3 = r7.b;
        if (r3 == 0) goto L_0x0445;
    L_0x037f:
        r3 = r7.b;
    L_0x0381:
        r8 = r12.d;
        r8 = r8.getActivity();
        r3 = com.whatsapp.util.a5.c(r3, r8);
        r1.setText(r3);
        r3 = 8;
        r4.setVisibility(r3);
        r3 = 0;
        r2.setVisibility(r3);
        if (r6 == 0) goto L_0x03b7;
    L_0x0399:
        r3 = -13679548; // 0xffffffffff2f4444 float:-2.3296935E38 double:NaN;
        r0.setTextColor(r3);
        r0 = 0;
        r4.setVisibility(r0);
        r0 = 8;
        r2.setVisibility(r0);
        r0 = r7.a();
        r1.setText(r0);
        r0 = new com.whatsapp.qr;
        r0.<init>(r12, r7);
        r4.setOnClickListener(r0);
    L_0x03b7:
        r0 = r12.d;
        r0 = r0.getResources();
        r0 = r7.a(r0);
        if (r0 == 0) goto L_0x03c6;
    L_0x03c3:
        r2.setText(r0);
    L_0x03c6:
        r0 = r12.d;
        r0 = com.whatsapp.ContactsFragment.k(r0);
        if (r0 == 0) goto L_0x03e4;
    L_0x03ce:
        r0 = r12.d;
        r0 = com.whatsapp.ContactsFragment.k(r0);
        r1 = r7.e;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x03e4;
    L_0x03dc:
        r0 = 2130837815; // 0x7f020137 float:1.7280595E38 double:1.0527737613E-314;
        r5.setBackgroundResource(r0);
        if (r6 == 0) goto L_0x01ca;
    L_0x03e4:
        r0 = 0;
        r5.setBackgroundResource(r0);
        goto L_0x01ca;
    L_0x03ea:
        r8 = r3.toLowerCase();
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r10 = " ";
        r9 = r9.append(r10);
        r10 = r12.d;
        r10 = com.whatsapp.ContactsFragment.e(r10);
        r10 = r10.toString();
        r10 = r10.toLowerCase();
        r9 = r9.append(r10);
        r9 = r9.toString();
        r8 = r8.indexOf(r9);
        if (r8 <= 0) goto L_0x0348;
    L_0x0415:
        r4 = new android.text.SpannableStringBuilder;
        r4.<init>(r3);
        r9 = new android.text.style.ForegroundColorSpan;
        r10 = r12.d;
        r10 = r10.getResources();
        r11 = 2131296306; // 0x7f090032 float:1.8210525E38 double:1.053000286E-314;
        r10 = r10.getColor(r11);
        r9.<init>(r10);
        r10 = r8 + 1;
        r8 = r8 + 1;
        r11 = r12.d;
        r11 = com.whatsapp.ContactsFragment.e(r11);
        r11 = r11.length();
        r8 = r8 + r11;
        r11 = 33;
        r4.setSpan(r9, r10, r8, r11);
        goto L_0x0348;
    L_0x0442:
        r3 = r4;
        goto L_0x034a;
    L_0x0445:
        r3 = "";
        goto L_0x0381;
    L_0x0449:
        r5 = r1;
        goto L_0x01c4;
    L_0x044c:
        r14 = r0;
        goto L_0x01ae;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.vf.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    static boolean a(vf vfVar, int i) {
        return vfVar.d(i);
    }

    static boolean c(vf vfVar, int i) {
        return vfVar.b(i);
    }
}
