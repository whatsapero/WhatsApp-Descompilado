package com.whatsapp;

import android.util.Pair;
import android.util.SparseArray;
import android.widget.BaseAdapter;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Map.Entry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class avt extends BaseAdapter {
    private static final String z;
    final MediaGallery a;
    private SparseArray b;
    private int c;

    static {
        char[] toCharArray = "}t\u001asJwp\u0012vNbhQhDg1\u001du^~eD".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 16;
                    break;
                case ay.f /*1*/:
                    i2 = 17;
                    break;
                case ay.n /*2*/:
                    i2 = 126;
                    break;
                case ay.p /*3*/:
                    i2 = 26;
                    break;
                default:
                    i2 = 43;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public avt(MediaGallery mediaGallery) {
        this.a = mediaGallery;
        this.c = 0;
        this.b = new SparseArray();
    }

    private Pair a(int i) {
        int i2 = App.az;
        Object obj = null;
        for (Entry entry : MediaGallery.b(this.a).entrySet()) {
            obj = (ArrayList) entry.getValue();
            int size = (((obj.size() + MediaGallery.h(this.a)) - 1) / MediaGallery.h(this.a)) + 1;
            if (i <= size && i2 == 0) {
                break;
            }
            i -= size;
            if (i2 != 0) {
                break;
            }
        }
        return Pair.create(Integer.valueOf(i - 1), obj);
    }

    public Object getItem(int i) {
        return null;
    }

    public void a() {
        int i = App.az;
        this.c = 0;
        this.b.clear();
        for (Entry entry : MediaGallery.b(this.a).entrySet()) {
            ni niVar = (ni) entry.getKey();
            ArrayList arrayList = (ArrayList) entry.getValue();
            this.b.put(this.c, niVar);
            this.c = ((((arrayList.size() + MediaGallery.h(this.a)) - 1) / MediaGallery.h(this.a)) + 1) + this.c;
            if (i != 0) {
                break;
            }
        }
        Log.i(z + this.c);
    }

    static SparseArray a(avt com_whatsapp_avt) {
        return com_whatsapp_avt.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
        r12_this = this;
        r5 = com.whatsapp.App.az;
        r0 = r12.getItemViewType(r13);
        r1 = 1;
        if (r0 != r1) goto L_0x004d;
    L_0x0009:
        if (r14 == 0) goto L_0x002b;
    L_0x000b:
        r14 = (android.view.ViewGroup) r14;
        r0 = 0;
        r0 = r14.getChildAt(r0);
        r0 = (android.widget.TextView) r0;
        r1 = r0;
    L_0x0015:
        if (r13 != 0) goto L_0x004b;
    L_0x0017:
        r0 = 4;
    L_0x0018:
        r14.setVisibility(r0);
        r0 = r12.b;
        r0 = r0.get(r13);
        r0 = (com.whatsapp.ni) r0;
        r0 = r0.toString();
        r1.setText(r0);
    L_0x002a:
        return r14;
    L_0x002b:
        r0 = r12.a;
        r0 = r0.getLayoutInflater();
        r1 = 2130903166; // 0x7f03007e float:1.7413142E38 double:1.052806049E-314;
        r2 = 0;
        r3 = 1;
        r0 = r0.inflate(r1, r2, r3);
        r0 = (android.view.ViewGroup) r0;
        r1 = 0;
        r0.setClickable(r1);
        r1 = 2131427887; // 0x7f0b022f float:1.8477403E38 double:1.0530652956E-314;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r14 = r0;
        goto L_0x0015;
    L_0x004b:
        r0 = 0;
        goto L_0x0018;
    L_0x004d:
        if (r14 == 0) goto L_0x0195;
    L_0x004f:
        r14 = (android.view.ViewGroup) r14;
    L_0x0051:
        r0 = java.lang.Integer.valueOf(r13);
        r14.setTag(r0);
        r6 = r14.getChildCount();
        r1 = r12.a(r13);
        r0 = r1.second;
        r0 = (java.util.ArrayList) r0;
        r1 = r1.first;
        r1 = (java.lang.Integer) r1;
        r7 = r1.intValue();
        r1 = r12.a;
        r1 = com.whatsapp.MediaGallery.h(r1);
        r1 = r1 * r7;
        r3 = r1;
    L_0x0074:
        r1 = r7 + 1;
        r2 = r12.a;
        r2 = com.whatsapp.MediaGallery.h(r2);
        r1 = r1 * r2;
        if (r3 >= r1) goto L_0x0170;
    L_0x007f:
        r1 = r12.a;
        r1 = com.whatsapp.MediaGallery.h(r1);
        r1 = r1 * r7;
        r8 = r3 - r1;
        r1 = r0.size();
        if (r3 >= r1) goto L_0x0154;
    L_0x008e:
        r1 = r0.size();
        r1 = r1 - r3;
        r1 = r1 + -1;
        r1 = r0.get(r1);
        r1 = (com.whatsapp.protocol.b) r1;
        if (r6 > r8) goto L_0x01b8;
    L_0x009d:
        r2 = new com.whatsapp.MediaGalleryImageView;
        r4 = r12.a;
        r2.<init>(r4);
        r4 = android.widget.ImageView.ScaleType.CENTER_CROP;
        r2.setScaleType(r4);
        r4 = r12.a;
        r4 = com.whatsapp.MediaGallery.g(r4);
        r4 = (float) r4;
        r9 = 1088421888; // 0x40e00000 float:7.0 double:5.37751863E-315;
        r4 = r4 / r9;
        r2.setTextSize(r4);
        r4 = 5;
        r2.setTextGravity(r4);
        r4 = new android.widget.LinearLayout$LayoutParams;
        r9 = r12.a;
        r9 = com.whatsapp.MediaGallery.g(r9);
        r10 = r12.a;
        r10 = com.whatsapp.MediaGallery.g(r10);
        r4.<init>(r9, r10);
        r2.setLayoutParams(r4);
        r9 = com.whatsapp.MediaGallery.a();
        r9 = r9.o;
        r9 = (int) r9;
        r4.rightMargin = r9;
        r14.addView(r2);
    L_0x00da:
        r4 = r1.j;
        r9 = 3;
        if (r4 == r9) goto L_0x00e4;
    L_0x00df:
        r4 = r1.j;
        r9 = 2;
        if (r4 != r9) goto L_0x0119;
    L_0x00e4:
        r4 = r1.p;
        if (r4 == 0) goto L_0x00f1;
    L_0x00e8:
        r4 = r1.p;
        r10 = (long) r4;
        r4 = android.text.format.DateUtils.formatElapsedTime(r10);
        if (r5 == 0) goto L_0x00f9;
    L_0x00f1:
        r4 = com.whatsapp.App.p;
        r10 = r1.k;
        r4 = android.text.format.Formatter.formatShortFileSize(r4, r10);
    L_0x00f9:
        r2.setText(r4);
        r4 = r1.j;
        r9 = 3;
        if (r4 != r9) goto L_0x0113;
    L_0x0101:
        r4 = r12.a;
        r4 = r4.getResources();
        r9 = 2130838938; // 0x7f02059a float:1.7282872E38 double:1.052774316E-314;
        r4 = r4.getDrawable(r9);
        r2.setIcon(r4);
        if (r5 == 0) goto L_0x0117;
    L_0x0113:
        r4 = 0;
        r2.setIcon(r4);
    L_0x0117:
        if (r5 == 0) goto L_0x0121;
    L_0x0119:
        r4 = 0;
        r2.setText(r4);
        r4 = 0;
        r2.setIcon(r4);
    L_0x0121:
        r4 = r12.a;
        r4 = com.whatsapp.MediaGallery.k(r4);
        r2.setOnClickListener(r4);
        r4 = r12.a;
        r4 = com.whatsapp.MediaGallery.l(r4);
        r2.setOnLongClickListener(r4);
        r4 = r12.a;
        r4 = com.whatsapp.MediaGallery.n(r4);
        r9 = r1.e;
        r4 = r4.containsKey(r9);
        r2.setSelected(r4);
        r4 = r12.a;
        com.whatsapp.MediaGallery.a(r4, r1, r13, r2);
        r4 = r1.e;
        r2.setTag(r4);
        r4 = 2131427766; // 0x7f0b01b6 float:1.8477158E38 double:1.053065236E-314;
        r2.setTag(r4, r1);
        if (r5 == 0) goto L_0x016c;
    L_0x0154:
        if (r6 <= r8) goto L_0x016c;
    L_0x0156:
        r1 = r14.getChildAt(r8);
        r1 = (com.whatsapp.MediaGalleryImageView) r1;
        r2 = 4;
        r1.setVisibility(r2);
        r2 = 0;
        r1.setImageResource(r2);
        r2 = 0;
        r1.setOnClickListener(r2);
        r2 = 0;
        r1.setOnLongClickListener(r2);
    L_0x016c:
        r1 = r3 + 1;
        if (r5 == 0) goto L_0x01c4;
    L_0x0170:
        r0 = r12.a;
        r0 = com.whatsapp.MediaGallery.h(r0);
        r1 = r0;
    L_0x0177:
        if (r1 >= r6) goto L_0x002a;
    L_0x0179:
        r0 = r14.getChildAt(r1);
        r0 = (com.whatsapp.MediaGalleryImageView) r0;
        r2 = 4;
        r0.setVisibility(r2);
        r2 = 0;
        r0.setImageResource(r2);
        r2 = 0;
        r0.setOnClickListener(r2);
        r2 = 0;
        r0.setOnLongClickListener(r2);
        r0 = r1 + 1;
        if (r5 != 0) goto L_0x002a;
    L_0x0193:
        r1 = r0;
        goto L_0x0177;
    L_0x0195:
        r14 = new android.widget.LinearLayout;
        r0 = r12.a;
        r14.<init>(r0);
        r0 = com.whatsapp.MediaGallery.a();
        r0 = r0.a;
        r1 = com.whatsapp.MediaGallery.a();
        r1 = r1.d;
        r2 = 0;
        r3 = com.whatsapp.MediaGallery.a();
        r3 = r3.d;
        r14.setPadding(r0, r1, r2, r3);
        r0 = 0;
        r14.setClickable(r0);
        goto L_0x0051;
    L_0x01b8:
        r2 = r14.getChildAt(r8);
        r2 = (com.whatsapp.MediaGalleryImageView) r2;
        r4 = 0;
        r2.setVisibility(r4);
        goto L_0x00da;
    L_0x01c4:
        r3 = r1;
        goto L_0x0074;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avt.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public long getItemId(int i) {
        return 0;
    }

    public int getCount() {
        if (this.c == 0) {
            a();
        }
        return this.c;
    }

    public int getViewTypeCount() {
        return 2;
    }

    public int getItemViewType(int i) {
        return this.b.get(i, null) != null ? 1 : 0;
    }
}
