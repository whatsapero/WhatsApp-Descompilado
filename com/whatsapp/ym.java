package com.whatsapp;

import android.content.Context;
import android.widget.BaseAdapter;
import com.actionbarsherlock.R;
import com.whatsapp.util.bw;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ym extends BaseAdapter {
    private static final String z;
    private boolean a;
    final WebImagePicker b;
    private vc c;

    static {
        char[] toCharArray = "iU1~".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 71;
                    break;
                case ay.f /*1*/:
                    i2 = 63;
                    break;
                case ay.n /*2*/:
                    i2 = 65;
                    break;
                case ay.p /*3*/:
                    i2 = 25;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    static boolean a(ym ymVar, boolean z) {
        ymVar.a = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
        r12_this = this;
        r11 = 0;
        r4 = 0;
        r5 = com.whatsapp.App.az;
        r0 = r12.getItemViewType(r13);
        r1 = 1;
        if (r0 != r1) goto L_0x0069;
    L_0x000b:
        r0 = r12.c;
        if (r0 != 0) goto L_0x0016;
    L_0x000f:
        r0 = r12.a;
        if (r0 == 0) goto L_0x0016;
    L_0x0013:
        r12.a(r11);
    L_0x0016:
        if (r14 == 0) goto L_0x0019;
    L_0x0018:
        return r14;
    L_0x0019:
        r14 = new android.widget.LinearLayout;
        r0 = r12.b;
        r14.<init>(r0);
        r0 = r12.b;
        r0 = com.whatsapp.WebImagePicker.k(r0);
        r0 = r0.a;
        r1 = r12.b;
        r1 = com.whatsapp.WebImagePicker.k(r1);
        r1 = r1.d;
        r2 = r12.b;
        r2 = com.whatsapp.WebImagePicker.k(r2);
        r2 = r2.d;
        r3 = r12.b;
        r3 = com.whatsapp.WebImagePicker.k(r3);
        r3 = r3.d;
        r14.setPadding(r0, r1, r2, r3);
        r14.setClickable(r4);
        r0 = new android.widget.ProgressBar;
        r1 = com.whatsapp.App.p;
        r2 = 16842873; // 0x1010079 float:2.3693897E-38 double:8.321485E-317;
        r0.<init>(r1, r11, r2);
        r14.addView(r0);
        r0 = 17;
        r14.setGravity(r0);
        r0 = new android.widget.TextView;
        r1 = com.whatsapp.App.p;
        r0.<init>(r1);
        r1 = 2131624663; // 0x7f0e02d7 float:1.8876512E38 double:1.053162516E-314;
        r0.setText(r1);
        r14.addView(r0);
        goto L_0x0018;
    L_0x0069:
        if (r14 == 0) goto L_0x007a;
    L_0x006b:
        r0 = r14;
        r0 = (android.widget.LinearLayout) r0;
        r0 = r0.getChildCount();
        r1 = r12.b;
        r1 = com.whatsapp.WebImagePicker.b(r1);
        if (r0 == r1) goto L_0x0184;
    L_0x007a:
        r14 = new android.widget.LinearLayout;
        r0 = r12.b;
        r14.<init>(r0);
        r0 = r12.b;
        r0 = com.whatsapp.WebImagePicker.k(r0);
        r0 = r0.a;
        r1 = r12.b;
        r1 = com.whatsapp.WebImagePicker.k(r1);
        r1 = r1.d;
        r2 = r12.b;
        r2 = com.whatsapp.WebImagePicker.k(r2);
        r2 = r2.d;
        r14.setPadding(r0, r1, r4, r2);
        r14.setClickable(r4);
    L_0x009f:
        r6 = r14.getChildCount();
        r0 = r12.b;
        r0 = com.whatsapp.WebImagePicker.b(r0);
        r0 = r0 * r13;
        r2 = r0;
        r3 = r4;
    L_0x00ac:
        r0 = r13 + 1;
        r1 = r12.b;
        r1 = com.whatsapp.WebImagePicker.b(r1);
        r0 = r0 * r1;
        if (r2 >= r0) goto L_0x0196;
    L_0x00b7:
        r0 = r12.b;
        r0 = com.whatsapp.WebImagePicker.c(r0);
        r0 = r0.size();
        if (r2 >= r0) goto L_0x0155;
    L_0x00c3:
        r0 = r12.b;
        r0 = com.whatsapp.WebImagePicker.c(r0);
        r0 = r0.get(r2);
        r0 = (com.whatsapp.d6) r0;
        if (r6 > r3) goto L_0x0188;
    L_0x00d1:
        r1 = new android.widget.ImageView;
        r7 = r12.b;
        r1.<init>(r7);
        r7 = android.widget.ImageView.ScaleType.CENTER_CROP;
        r1.setScaleType(r7);
        r7 = new android.widget.LinearLayout$LayoutParams;
        r8 = r12.b;
        r8 = com.whatsapp.WebImagePicker.j(r8);
        r9 = r12.b;
        r9 = com.whatsapp.WebImagePicker.j(r9);
        r7.<init>(r8, r9);
        r1.setLayoutParams(r7);
        r8 = r12.b;
        r8 = com.whatsapp.WebImagePicker.k(r8);
        r8 = r8.o;
        r8 = (int) r8;
        r7.rightMargin = r8;
        r7 = 2130839096; // 0x7f020638 float:1.7283193E38 double:1.052774394E-314;
        r1.setBackgroundResource(r7);
        r7 = r12.b;
        r7 = com.whatsapp.WebImagePicker.k(r7);
        r7 = r7.l;
        r8 = r12.b;
        r8 = com.whatsapp.WebImagePicker.k(r8);
        r8 = r8.l;
        r9 = r12.b;
        r9 = com.whatsapp.WebImagePicker.k(r9);
        r9 = r9.l;
        r10 = r12.b;
        r10 = com.whatsapp.WebImagePicker.k(r10);
        r10 = r10.l;
        r1.setPadding(r7, r8, r9, r10);
        r7 = r12.b;
        r7 = com.whatsapp.WebImagePicker.d(r7);
        r1.setOnClickListener(r7);
        r14.addView(r1);
    L_0x0131:
        r7 = r12.b;
        r7 = com.whatsapp.WebImagePicker.h(r7);
        r0 = r0.d;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r8 = r8.append(r2);
        r9 = z;
        r8 = r8.append(r9);
        r8 = r8.toString();
        r9 = r12.b;
        r7.a(r0, r8, r9, r1);
        r3 = r3 + 1;
        if (r5 == 0) goto L_0x016a;
    L_0x0155:
        r0 = r12.b;
        r0 = com.whatsapp.WebImagePicker.b(r0);
        r0 = r0 * r13;
        r0 = r2 - r0;
        if (r6 <= r0) goto L_0x016a;
    L_0x0160:
        r0 = r14.getChildAt(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = 4;
        r0.setVisibility(r1);
    L_0x016a:
        r1 = r3;
        r0 = r2 + 1;
        if (r5 == 0) goto L_0x0192;
    L_0x016f:
        r0 = r12.c;
        if (r0 != 0) goto L_0x0018;
    L_0x0173:
        r0 = r12.a;
        if (r0 == 0) goto L_0x0018;
    L_0x0177:
        r0 = r12.b;
        r0 = com.whatsapp.WebImagePicker.b(r0);
        if (r1 >= r0) goto L_0x0018;
    L_0x017f:
        r12.a(r11);
        goto L_0x0018;
    L_0x0184:
        r14 = (android.widget.LinearLayout) r14;
        goto L_0x009f;
    L_0x0188:
        r1 = r14.getChildAt(r3);
        r1 = (android.widget.ImageView) r1;
        r1.setVisibility(r4);
        goto L_0x0131;
    L_0x0192:
        r2 = r0;
        r3 = r1;
        goto L_0x00ac;
    L_0x0196:
        r1 = r3;
        goto L_0x016f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ym.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    static vc a(ym ymVar, vc vcVar) {
        ymVar.c = vcVar;
        return vcVar;
    }

    static void a(ym ymVar) {
        ymVar.a();
    }

    private void a() {
        if (this.c != null) {
            this.c.cancel(false);
        }
    }

    public Object getItem(int i) {
        return null;
    }

    private void a(String str) {
        if (str != null) {
            if (this.c != null) {
                this.c.cancel(false);
            }
            this.a = true;
            WebImagePicker.a(this.b, new ds(str));
            WebImagePicker.c(this.b).clear();
            WebImagePicker.h(this.b).a();
            WebImagePicker.h(this.b).b();
            WebImagePicker.a(this.b, new bw(R.drawable.ic_menu_block, R.drawable.picture_loading, WebImagePicker.j(this.b), WebImagePicker.f(this.b)));
        }
        this.c = new vc(this);
        a5w.a(this.c, new Void[0]);
        if (str != null) {
            notifyDataSetChanged();
        }
    }

    public int getViewTypeCount() {
        return 2;
    }

    public int getItemViewType(int i) {
        return (i == getCount() + -1 && this.a) ? 1 : 0;
    }

    static void a(ym ymVar, String str) {
        ymVar.a(str);
    }

    public long getItemId(int i) {
        return 0;
    }

    public ym(WebImagePicker webImagePicker, Context context) {
        this.b = webImagePicker;
    }

    public int getCount() {
        int i;
        int size = ((WebImagePicker.c(this.b).size() + WebImagePicker.b(this.b)) - 1) / WebImagePicker.b(this.b);
        if (this.a) {
            i = 1;
        } else {
            i = 0;
        }
        return i + size;
    }
}
