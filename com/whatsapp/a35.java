package com.whatsapp;

import android.content.Context;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.bm;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class a35 extends CursorAdapter {
    private static final String[] z;
    final Conversation a;
    private int b;
    private Object c;

    static {
        String[] strArr = new String[20];
        String str = "\"t";
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
                        i3 = 2;
                        break;
                    case ay.f /*1*/:
                        i3 = 92;
                        break;
                    case ay.n /*2*/:
                        i3 = 127;
                        break;
                    case ay.p /*3*/:
                        i3 = 85;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "f)\u00128\u0000\"1\f2X";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "a3\u0011#\u001cp/\u001e!\u0010m2\u001e1\u0018r(\u001a'Ve9\u000b<\rg1P%\u0016q5\u000b<\u0016ls\u0016;\u000fc0\u00161Y";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "a3\u0011#\u001cp/\u001e!\u0010m2\u001e1\u0018r(\u001a'Vl9\bu\tc.\u001e8Yk/_;\fn0^";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "n3\u001e1Yd.\u00108Yo5\u001b1\u0015gf";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "a3\u00139\u0018r/\u001a\n\u0014g/\f4\u001egs\u000f'\u001cts\u0012<\nq5\u00112Tp1\u000bx\np?E";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\" _";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "A)\r&\u0016p\u0015\u00111\u001cz\u0013\n!6d\u001e\u0010 \u0017f/:-\u001ag,\u000b<\u0016lf";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\" _";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "A)\r&\u0016p\u0015\u00111\u001cz\u0013\n!6d\u001e\u0010 \u0017f/:-\u001ag,\u000b<\u0016lf";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\" _";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "v4\u001a;Yn3\u001e1Yd.\u00108Yv3\u000fuC";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "A)\r&\u0016p\u0015\u00111\u001cz\u0013\n!6d\u001e\u0010 \u0017f/:-\u001ag,\u000b<\u0016lf";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "a3\u00139\u0018r/\u001a\n\u0014g/\f4\u001egs\u00110\u0001vs\u0012<\nq5\u00112Tp1\u000bx\np?E";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "A)\r&\u0016p\u0015\u00111\u001cz\u0013\n!6d\u001e\u0010 \u0017f/:-\u001ag,\u000b<\u0016lf";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\" _";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "a3\u0011#\u001cp/\u001e!\u0010m2P4\u001dh)\f!\u001ac?\u00170Vc,\u000f0\u0017f9\u001b";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "a3\u0011#\u001cp/\u001e!\u0010m2P2\u001cv*\u00160\u000e-.\u0010\"Yk/_;\fn0^u\u0014q;B";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "n=\u0006:\fv\u0003\u0016;\u001fn=\u000b0\u000b";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "+|_&\u0010x9E";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int getCount() {
        int i = 0;
        try {
            if (!Conversation.v(this.a)) {
                return 0;
            }
            try {
                if (getCursor() == null) {
                    return 0;
                }
                try {
                    int count = getCursor().getCount() + Conversation.e(this.a).size();
                    if (Conversation.p(this.a) > 0) {
                        i = 1;
                    }
                    return i + count;
                } catch (CursorIndexOutOfBoundsException e) {
                    throw e;
                }
            }
        } catch (CursorIndexOutOfBoundsException e2) {
            throw e2;
        } catch (CursorIndexOutOfBoundsException e22) {
            throw e22;
        }
    }

    public a35(Conversation conversation, Context context, Cursor cursor, boolean z) {
        this.a = conversation;
        super(context, cursor, z);
    }

    private int a(b bVar, boolean z, w_ w_Var) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(this.a.getResources().getDimension(R.dimen.conversation_date_size));
        int a = 0 + a(bm.m(this.a.getBaseContext(), App.f(bVar)) + " ", textPaint);
        textPaint.setTextSize(this.a.getResources().getDimension(R.dimen.conversation_text_row_tv));
        int a2 = a(bVar.f(), textPaint) + a;
        if (z) {
            textPaint.setTextSize(this.a.getResources().getDimension(R.dimen.conversation_participant_name_tv));
            a = a(App.P.a(bVar.F).a(this.a), textPaint);
            try {
                w_Var.f = ((float) a) + Conversation.L(this.a).i;
                if (a <= a2) {
                    a = a2;
                }
            } catch (CursorIndexOutOfBoundsException e) {
                throw e;
            }
        }
        a = a2;
        return a + Conversation.L(this.a).u;
    }

    public boolean hasStableIds() {
        return true;
    }

    private int a() {
        return getCursor().getCount() - Conversation.p(this.a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getItem(int r8) {
        /*
        r7_this = this;
        r2 = 1;
        r0 = 0;
        r3 = 0;
        r1 = r7.getCursor();
        r4 = r1.getCount();
        r1 = r7.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x004d }
        r1 = com.whatsapp.Conversation.p(r1);	 Catch:{ CursorIndexOutOfBoundsException -> 0x004d }
        if (r1 <= 0) goto L_0x004f;
    L_0x0013:
        r1 = r2;
    L_0x0014:
        r1 = r8 - r1;
        if (r1 >= r4) goto L_0x00dc;
    L_0x0018:
        r0 = r7.a;
        r0 = com.whatsapp.Conversation.y(r0);
        r1 = java.lang.Integer.valueOf(r8);
        r0 = r0.get(r1);
        r0 = (com.whatsapp.protocol.b) r0;
        if (r0 != 0) goto L_0x004c;
    L_0x002a:
        r0 = r7.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0051 }
        r0 = com.whatsapp.Conversation.p(r0);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0051 }
        if (r0 <= 0) goto L_0x0057;
    L_0x0032:
        r0 = r7.a();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0053 }
        if (r8 != r0) goto L_0x0057;
    L_0x0038:
        r0 = r7.c;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0055 }
        if (r0 != 0) goto L_0x004a;
    L_0x003c:
        r0 = new com.whatsapp.protocol.b;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0055 }
        r1 = 0;
        r2 = z;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0055 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ CursorIndexOutOfBoundsException -> 0x0055 }
        r3 = 0;
        r0.<init>(r1, r2, r3);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0055 }
        r7.c = r0;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0055 }
    L_0x004a:
        r0 = r7.c;
    L_0x004c:
        return r0;
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r1 = r3;
        goto L_0x0014;
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        throw r0;
    L_0x0057:
        r0 = r7.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x00d6 }
        r0 = com.whatsapp.Conversation.p(r0);	 Catch:{ CursorIndexOutOfBoundsException -> 0x00d6 }
        if (r0 <= 0) goto L_0x006b;
    L_0x005f:
        r0 = r7.a();	 Catch:{ CursorIndexOutOfBoundsException -> 0x00d6 }
        if (r8 <= r0) goto L_0x006b;
    L_0x0065:
        r0 = r8 + -1;
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x006c;
    L_0x006b:
        r0 = r8;
    L_0x006c:
        r1 = r7.a;
        r1 = r1.aS;
        r1 = r1.getCursor();
        r1 = r1.getPosition();
        r2 = r7.a;
        r2 = r2.aS;
        r2 = r2.getCursor();
        r3 = r4 + -1;
        r0 = r3 - r0;
        r2.moveToPosition(r0);
        r0 = r7.a;
        r0 = r0.aS;
        r0 = r0.getCursor();
        r2 = r0.getPosition();
        r0 = com.whatsapp.App.aJ;
        r3 = r7.a;
        r3 = r3.aS;
        r3 = r3.getCursor();
        r4 = r7.a;
        r4 = r4.u;
        r0 = r0.a(r3, r4);
        if (r2 >= r1) goto L_0x00c7;
    L_0x00a7:
        r1 = r7.b;	 Catch:{ CursorIndexOutOfBoundsException -> 0x00d8 }
        if (r2 <= r1) goto L_0x00b1;
    L_0x00ab:
        r1 = r7.b;	 Catch:{ CursorIndexOutOfBoundsException -> 0x00da }
        r1 = r1 + 50;
        if (r2 <= r1) goto L_0x00c7;
    L_0x00b1:
        r1 = 0;
        r2 = r2 + -50;
        r1 = java.lang.Math.max(r1, r2);	 Catch:{ CursorIndexOutOfBoundsException -> 0x00da }
        r7.b = r1;	 Catch:{ CursorIndexOutOfBoundsException -> 0x00da }
        r1 = r7.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x00da }
        r1 = r1.aS;	 Catch:{ CursorIndexOutOfBoundsException -> 0x00da }
        r1 = r1.getCursor();	 Catch:{ CursorIndexOutOfBoundsException -> 0x00da }
        r2 = r7.b;	 Catch:{ CursorIndexOutOfBoundsException -> 0x00da }
        r1.moveToPosition(r2);	 Catch:{ CursorIndexOutOfBoundsException -> 0x00da }
    L_0x00c7:
        r1 = r7.a;
        r1 = com.whatsapp.Conversation.y(r1);
        r2 = java.lang.Integer.valueOf(r8);
        r1.put(r2, r0);
        goto L_0x004c;
    L_0x00d6:
        r0 = move-exception;
        throw r0;
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ CursorIndexOutOfBoundsException -> 0x00da }
    L_0x00da:
        r0 = move-exception;
        throw r0;
    L_0x00dc:
        r1 = r8 - r4;
        r5 = r7.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0104 }
        r5 = com.whatsapp.Conversation.p(r5);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0104 }
        if (r5 <= 0) goto L_0x00e8;
    L_0x00e6:
        r1 = r1 + -1;
    L_0x00e8:
        if (r1 < 0) goto L_0x0108;
    L_0x00ea:
        r5 = r7.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0106 }
        r5 = com.whatsapp.Conversation.e(r5);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0106 }
        r5 = r5.size();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0106 }
        if (r1 >= r5) goto L_0x0108;
    L_0x00f6:
        r0 = r7.a;
        r0 = com.whatsapp.Conversation.e(r0);
        r0 = r0.get(r1);
        r0 = (com.whatsapp.protocol.b) r0;
        goto L_0x004c;
    L_0x0104:
        r0 = move-exception;
        throw r0;
    L_0x0106:
        r0 = move-exception;
        throw r0;
    L_0x0108:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r5 = z;
        r6 = 3;
        r5 = r5[r6];
        r1 = r1.append(r5);
        r1 = r1.append(r8);
        r5 = z;
        r3 = r5[r3];
        r1 = r1.append(r3);
        r1 = r1.append(r4);
        r3 = z;
        r2 = r3[r2];
        r1 = r1.append(r2);
        r2 = r7.a;
        r2 = com.whatsapp.Conversation.e(r2);
        r2 = r2.size();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a35.getItem(int):java.lang.Object");
    }

    public int getItemViewType(int i) {
        try {
            if (!Conversation.v(this.a)) {
                return -1;
            }
            try {
                if (Conversation.p(this.a) > 0) {
                    if (i == a()) {
                        return 18;
                    }
                }
                return Conversation.a((b) getItem(i));
            } catch (CursorIndexOutOfBoundsException e) {
                throw e;
            } catch (CursorIndexOutOfBoundsException e2) {
                throw e2;
            }
        } catch (CursorIndexOutOfBoundsException e22) {
            throw e22;
        }
    }

    private int a(String str, TextPaint textPaint) {
        int i = 0;
        int i2 = App.az;
        if (str == null) {
            return 0;
        }
        float f = 0.0f;
        float[] fArr = new float[str.length()];
        textPaint.getTextWidths(str, 0, str.length(), fArr);
        while (i < fArr.length) {
            f += fArr[i];
            i++;
            if (i2 != 0) {
                break;
            }
        }
        return (int) f;
    }

    static void a(a35 com_whatsapp_a35, int i) {
        com_whatsapp_a35.a(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void notifyDataSetChanged() {
        /*
        r2_this = this;
        r0 = r2.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0029 }
        r0 = com.whatsapp.Conversation.E(r0);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0029 }
        if (r0 != 0) goto L_0x0014;
    L_0x0008:
        r0 = com.whatsapp.Conversation.t;	 Catch:{ CursorIndexOutOfBoundsException -> 0x002b }
        r0.clear();	 Catch:{ CursorIndexOutOfBoundsException -> 0x002b }
        super.notifyDataSetChanged();	 Catch:{ CursorIndexOutOfBoundsException -> 0x002b }
        r0 = com.whatsapp.App.az;	 Catch:{ CursorIndexOutOfBoundsException -> 0x002b }
        if (r0 == 0) goto L_0x0028;
    L_0x0014:
        r0 = r2.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x002d }
        r0 = com.whatsapp.Conversation.aa(r0);	 Catch:{ CursorIndexOutOfBoundsException -> 0x002d }
        if (r0 == 0) goto L_0x0028;
    L_0x001c:
        r0 = r2.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x002d }
        r1 = 0;
        com.whatsapp.Conversation.j(r0, r1);	 Catch:{ CursorIndexOutOfBoundsException -> 0x002d }
        r0 = r2.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x002d }
        r1 = 0;
        com.whatsapp.Conversation.f(r0, r1);	 Catch:{ CursorIndexOutOfBoundsException -> 0x002d }
    L_0x0028:
        return;
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ CursorIndexOutOfBoundsException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ CursorIndexOutOfBoundsException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a35.notifyDataSetChanged():void");
    }

    protected void onContentChanged() {
    }

    static int a(a35 com_whatsapp_a35) {
        return com_whatsapp_a35.a();
    }

    private void a(w_ w_Var, int i, boolean z) {
        int i2 = App.az;
        while (w_Var != null) {
            try {
                w_ w_Var2;
                w_Var.a(i);
                if (z) {
                    w_Var2 = w_Var.c;
                } else {
                    w_Var2 = w_Var.d;
                }
                if (i2 == 0) {
                    w_Var = w_Var2;
                } else {
                    return;
                }
            } catch (CursorIndexOutOfBoundsException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
        r10_this = this;
        r1 = 1;
        r2 = 0;
        r5 = com.whatsapp.App.az;
        r3 = r10.getItem(r11);
        r3 = (com.whatsapp.protocol.b) r3;
        r0 = r10.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x005c }
        r0 = com.whatsapp.Conversation.p(r0);	 Catch:{ CursorIndexOutOfBoundsException -> 0x005c }
        if (r0 <= 0) goto L_0x005e;
    L_0x0012:
        r0 = r10.a();	 Catch:{ CursorIndexOutOfBoundsException -> 0x005c }
        if (r11 != r0) goto L_0x005e;
    L_0x0018:
        r0 = r10.a;
        r3 = z;
        r4 = 19;
        r3 = r3[r4];
        r0 = r0.getSystemService(r3);
        r0 = (android.view.LayoutInflater) r0;
        r3 = 2130903121; // 0x7f030051 float:1.7413051E38 double:1.0528060267E-314;
        r3 = com.whatsapp.b7.a(r0, r3, r13, r2);
        r0 = 2131427725; // 0x7f0b018d float:1.8477074E38 double:1.0530652155E-314;
        r0 = r3.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r4 = com.whatsapp.App.aX;
        r5 = 2131558444; // 0x7f0d002c float:1.8742204E38 double:1.0531297993E-314;
        r6 = r10.a;
        r6 = com.whatsapp.Conversation.w(r6);
        r4 = r4.a(r5, r6);
        r1 = new java.lang.Object[r1];
        r5 = r10.a;
        r5 = com.whatsapp.Conversation.w(r5);
        r5 = java.lang.Integer.valueOf(r5);
        r1[r2] = r5;
        r1 = java.lang.String.format(r4, r1);
        r0.setText(r1);
        r1 = r3;
    L_0x005b:
        return r1;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        if (r12 == 0) goto L_0x010f;
    L_0x0060:
        r0 = r12.getTag();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0103 }
        if (r0 == 0) goto L_0x010f;
    L_0x0066:
        r4 = com.whatsapp.Conversation.a(r3);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0105 }
        r0 = r12.getTag();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0105 }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0105 }
        r0 = com.whatsapp.Conversation.a(r0);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0105 }
        if (r4 != r0) goto L_0x010f;
    L_0x0076:
        r0 = r10.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0107 }
        r0 = com.whatsapp.Conversation.a(r0);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0107 }
        r0 = r0.contains(r3);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0107 }
        if (r0 != 0) goto L_0x0092;
    L_0x0082:
        r0 = r10.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0109 }
        r0 = com.whatsapp.Conversation.u(r0);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0109 }
        if (r0 != 0) goto L_0x0092;
    L_0x008a:
        r0 = r10.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x010b }
        r0 = com.whatsapp.Conversation.z(r0);	 Catch:{ CursorIndexOutOfBoundsException -> 0x010b }
        if (r0 == 0) goto L_0x010d;
    L_0x0092:
        r0 = r1;
    L_0x0093:
        r12 = (com.whatsapp.ConversationRow) r12;
        r12.a(r3, r0);
        r0 = r10.a;
        r0 = com.whatsapp.Conversation.a(r0);
        r0.remove(r3);
        r1 = r12;
    L_0x00a2:
        r0 = 0;
        if (r11 != 0) goto L_0x00ab;
    L_0x00a5:
        r4 = 1;
        r1.a(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0139 }
        if (r5 == 0) goto L_0x0143;
    L_0x00ab:
        r0 = r11 + -1;
        r0 = r10.getItem(r0);
        r0 = (com.whatsapp.protocol.b) r0;
        r6 = r0.D;
        r8 = r3.D;
        r6 = com.whatsapp.util.bm.a(r6, r8);
        if (r6 != 0) goto L_0x00c3;
    L_0x00bd:
        r2 = 1;
        r1.a(r2);	 Catch:{ CursorIndexOutOfBoundsException -> 0x013b }
        if (r5 == 0) goto L_0x0141;
    L_0x00c3:
        r2 = 0;
        r1.a(r2);	 Catch:{ CursorIndexOutOfBoundsException -> 0x013b }
        r4 = r0;
    L_0x00c8:
        r0 = r10.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x013d }
        r0 = com.whatsapp.Conversation.H(r0);	 Catch:{ CursorIndexOutOfBoundsException -> 0x013d }
        if (r0 == 0) goto L_0x005b;
    L_0x00d0:
        r0 = r3.e;	 Catch:{ CursorIndexOutOfBoundsException -> 0x013f }
        r0 = r0.b;	 Catch:{ CursorIndexOutOfBoundsException -> 0x013f }
        if (r0 != 0) goto L_0x005b;
    L_0x00d6:
        r1.o();	 Catch:{ CursorIndexOutOfBoundsException -> 0x013f }
        r0 = r3.j;	 Catch:{ CursorIndexOutOfBoundsException -> 0x013f }
        if (r0 != 0) goto L_0x005b;
    L_0x00dd:
        r0 = com.whatsapp.Conversation.t;
        r2 = r3.e;
        r0 = r0.get(r2);
        r0 = (com.whatsapp.w_) r0;
        if (r0 == 0) goto L_0x00f2;
    L_0x00e9:
        r0 = r0.b;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0101 }
        r1.d = r0;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0101 }
        r1.p();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0101 }
        if (r5 == 0) goto L_0x005b;
    L_0x00f2:
        r0 = r11 + 1;
        r5 = r10.getItem(r0);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0101 }
        r5 = (com.whatsapp.protocol.b) r5;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0101 }
        r0 = r10;
        r2 = r11;
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0101 }
        goto L_0x005b;
    L_0x0101:
        r0 = move-exception;
        throw r0;
    L_0x0103:
        r0 = move-exception;
        throw r0;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0105 }
    L_0x0105:
        r0 = move-exception;
        throw r0;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0107 }
    L_0x0107:
        r0 = move-exception;
        throw r0;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0109 }
    L_0x0109:
        r0 = move-exception;
        throw r0;	 Catch:{ CursorIndexOutOfBoundsException -> 0x010b }
    L_0x010b:
        r0 = move-exception;
        throw r0;
    L_0x010d:
        r0 = r2;
        goto L_0x0093;
    L_0x010f:
        r0 = r10.a;
        r1 = com.whatsapp.Conversation.a(r0, r3);
        if (r1 != 0) goto L_0x00a2;
    L_0x0117:
        r0 = new java.lang.StringBuilder;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0137 }
        r0.<init>();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0137 }
        r4 = z;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0137 }
        r6 = 18;
        r4 = r4[r6];	 Catch:{ CursorIndexOutOfBoundsException -> 0x0137 }
        r0 = r0.append(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0137 }
        r4 = com.whatsapp.util.Log.a(r3);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0137 }
        r0 = r0.append(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0137 }
        r0 = r0.toString();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0137 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0137 }
        goto L_0x00a2;
    L_0x0137:
        r0 = move-exception;
        throw r0;
    L_0x0139:
        r0 = move-exception;
        throw r0;
    L_0x013b:
        r0 = move-exception;
        throw r0;
    L_0x013d:
        r0 = move-exception;
        throw r0;	 Catch:{ CursorIndexOutOfBoundsException -> 0x013f }
    L_0x013f:
        r0 = move-exception;
        throw r0;
    L_0x0141:
        r4 = r0;
        goto L_0x00c8;
    L_0x0143:
        r6 = r2;
        r4 = r0;
        goto L_0x00c8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a35.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        try {
            return (Conversation.p(this.a) > 0 ? 1 : 0) + 19;
        } catch (CursorIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View view = null;
        if (context == null || cursor == null) {
            try {
                Log.w(z[4]);
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            view = Conversation.a(this.a, App.aJ.a(cursor, this.a.u));
        } catch (Throwable e2) {
            Log.c(e2);
        }
        return view;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.ConversationRow r21, int r22, com.whatsapp.protocol.b r23, com.whatsapp.protocol.b r24, com.whatsapp.protocol.b r25, boolean r26) {
        /*
        r20_this = this;
        r11 = com.whatsapp.App.az;
        r3 = 0;
        r7 = 0;
        if (r24 == 0) goto L_0x004a;
    L_0x0006:
        r0 = r24;
        r2 = r0.j;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0306 }
        if (r2 != 0) goto L_0x004a;
    L_0x000c:
        r0 = r24;
        r2 = r0.e;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0308 }
        r2 = r2.b;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0308 }
        if (r2 != 0) goto L_0x004a;
    L_0x0014:
        if (r26 == 0) goto L_0x004a;
    L_0x0016:
        r0 = r24;
        r2 = r0.F;	 Catch:{ CursorIndexOutOfBoundsException -> 0x030c }
        if (r2 == 0) goto L_0x002d;
    L_0x001c:
        r0 = r24;
        r2 = r0.F;	 Catch:{ CursorIndexOutOfBoundsException -> 0x030e }
        r0 = r23;
        r4 = r0.F;	 Catch:{ CursorIndexOutOfBoundsException -> 0x030e }
        r2 = r2.equals(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x030e }
        if (r2 == 0) goto L_0x004a;
    L_0x002a:
        r3 = 1;
        if (r11 == 0) goto L_0x004a;
    L_0x002d:
        r2 = new java.lang.StringBuilder;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0310 }
        r2.<init>();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0310 }
        r4 = z;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0310 }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ CursorIndexOutOfBoundsException -> 0x0310 }
        r2 = r2.append(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0310 }
        r4 = com.whatsapp.util.Log.a(r24);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0310 }
        r2 = r2.append(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0310 }
        r2 = r2.toString();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0310 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0310 }
    L_0x004a:
        if (r25 == 0) goto L_0x0314;
    L_0x004c:
        r0 = r25;
        r4 = r0.D;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0312 }
        r0 = r23;
        r8 = r0.D;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0312 }
        r2 = com.whatsapp.util.bm.a(r4, r8);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0312 }
    L_0x0058:
        if (r25 == 0) goto L_0x009f;
    L_0x005a:
        r0 = r25;
        r4 = r0.j;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0317 }
        if (r4 != 0) goto L_0x009f;
    L_0x0060:
        r0 = r25;
        r4 = r0.e;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0319 }
        r4 = r4.b;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0319 }
        if (r4 != 0) goto L_0x009f;
    L_0x0068:
        if (r2 == 0) goto L_0x009f;
    L_0x006a:
        r0 = r25;
        r2 = r0.F;	 Catch:{ CursorIndexOutOfBoundsException -> 0x031d }
        if (r2 == 0) goto L_0x0081;
    L_0x0070:
        r0 = r25;
        r2 = r0.F;	 Catch:{ CursorIndexOutOfBoundsException -> 0x031f }
        r0 = r23;
        r4 = r0.F;	 Catch:{ CursorIndexOutOfBoundsException -> 0x031f }
        r2 = r2.equals(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x031f }
        if (r2 == 0) goto L_0x009f;
    L_0x007e:
        r7 = 1;
        if (r11 == 0) goto L_0x009f;
    L_0x0081:
        r2 = new java.lang.StringBuilder;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0321 }
        r2.<init>();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0321 }
        r4 = z;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0321 }
        r5 = 14;
        r4 = r4[r5];	 Catch:{ CursorIndexOutOfBoundsException -> 0x0321 }
        r2 = r2.append(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0321 }
        r4 = com.whatsapp.util.Log.a(r25);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0321 }
        r2 = r2.append(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0321 }
        r2 = r2.toString();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0321 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0321 }
    L_0x009f:
        if (r3 == 0) goto L_0x04db;
    L_0x00a1:
        if (r7 == 0) goto L_0x04db;
    L_0x00a3:
        r2 = new java.lang.StringBuilder;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0323 }
        r2.<init>();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0323 }
        r4 = z;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0323 }
        r5 = 5;
        r4 = r4[r5];	 Catch:{ CursorIndexOutOfBoundsException -> 0x0323 }
        r2 = r2.append(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0323 }
        r0 = r22;
        r2 = r2.append(r0);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0323 }
        r2 = r2.toString();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0323 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0323 }
        r5 = r22 + -1;
        r4 = r25;
        r6 = r23;
        r2 = r5;
        r5 = r3;
        r3 = r24;
    L_0x00c8:
        if (r5 == 0) goto L_0x04d2;
    L_0x00ca:
        if (r2 < 0) goto L_0x04ce;
    L_0x00cc:
        r4 = r2 + -1;
        r0 = r20;
        r2 = r0.getItem(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0325 }
        r2 = (com.whatsapp.protocol.b) r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0325 }
    L_0x00d6:
        r5 = r4;
        r4 = r2;
    L_0x00d8:
        if (r4 == 0) goto L_0x0362;
    L_0x00da:
        r8 = r4.D;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0360 }
        r12 = r3.D;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0360 }
        r2 = com.whatsapp.util.bm.a(r8, r12);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0360 }
    L_0x00e2:
        if (r4 == 0) goto L_0x00fd;
    L_0x00e4:
        r8 = r4.j;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0365 }
        if (r8 != 0) goto L_0x00fd;
    L_0x00e8:
        r8 = r4.e;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0367 }
        r8 = r8.b;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0367 }
        if (r8 != 0) goto L_0x00fd;
    L_0x00ee:
        if (r2 == 0) goto L_0x00fd;
    L_0x00f0:
        r2 = r4.F;	 Catch:{ CursorIndexOutOfBoundsException -> 0x036b }
        r8 = r3.F;	 Catch:{ CursorIndexOutOfBoundsException -> 0x036b }
        r2 = r2.equals(r8);	 Catch:{ CursorIndexOutOfBoundsException -> 0x036b }
        if (r2 == 0) goto L_0x00fd;
    L_0x00fa:
        r2 = 1;
        if (r11 == 0) goto L_0x04b7;
    L_0x00fd:
        r2 = 0;
        if (r11 == 0) goto L_0x04b7;
    L_0x0100:
        r18 = r2;
        r2 = r6;
        r6 = r3;
        r3 = r18;
    L_0x0106:
        r10 = r5 + 1;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r8 = z;
        r9 = 12;
        r8 = r8[r9];
        r5 = r5.append(r8);
        r5 = r5.append(r10);
        r5 = r5.toString();
        com.whatsapp.util.Log.i(r5);
        r12 = new com.whatsapp.w_;
        r5 = 1;
        r12.<init>(r5, r6);
        r5 = 1;
        r0 = r20;
        r8 = r0.a(r6, r5, r12);
        r5 = new com.whatsapp.w_;
        r9 = 1;
        r5.<init>(r12, r9, r2);
        r12.d = r5;
        r9 = com.whatsapp.Conversation.t;
        r13 = r6.e;
        r9.put(r13, r12);
        r9 = 0;
        r22 = r10 + 1;
        r25 = r2;
        r23 = r6;
        r6 = r8;
        r2 = r22;
        r8 = r7;
        r7 = r5;
    L_0x014a:
        if (r8 == 0) goto L_0x0496;
    L_0x014c:
        if (r25 != 0) goto L_0x0150;
    L_0x014e:
        if (r11 == 0) goto L_0x0496;
    L_0x0150:
        r5 = 0;
        r10 = 0;
        r0 = r20;
        r1 = r25;
        r5 = r0.a(r1, r5, r10);
        if (r9 == 0) goto L_0x0493;
    L_0x015c:
        r7 = new com.whatsapp.w_;
        r10 = 1;
        r0 = r25;
        r7.<init>(r9, r10, r0);
        r9.d = r7;
        r9 = r7;
    L_0x0167:
        if (r5 <= r6) goto L_0x036d;
    L_0x0169:
        r7 = r5;
    L_0x016a:
        r5 = com.whatsapp.Conversation.t;
        r0 = r25;
        r6 = r0.e;
        r5.put(r6, r9);
        r5 = 0;
        if (r2 < 0) goto L_0x04b0;
    L_0x0176:
        r6 = r2 + 1;
        r0 = r20;
        r2 = r0.getItem(r6);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0370 }
        r2 = (com.whatsapp.protocol.b) r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0370 }
        r5 = r6;
    L_0x0181:
        r6 = r2;
        r22 = r5;
    L_0x0184:
        if (r6 == 0) goto L_0x03b1;
    L_0x0186:
        r14 = r6.D;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03af }
        r0 = r25;
        r0 = r0.D;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03af }
        r16 = r0;
        r2 = com.whatsapp.util.bm.a(r14, r16);	 Catch:{ CursorIndexOutOfBoundsException -> 0x03af }
    L_0x0192:
        if (r6 == 0) goto L_0x01af;
    L_0x0194:
        r5 = r6.j;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03b4 }
        if (r5 != 0) goto L_0x01af;
    L_0x0198:
        r5 = r6.e;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03b6 }
        r5 = r5.b;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03b6 }
        if (r5 != 0) goto L_0x01af;
    L_0x019e:
        if (r2 == 0) goto L_0x01af;
    L_0x01a0:
        r2 = r6.F;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ba }
        r0 = r25;
        r5 = r0.F;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ba }
        r2 = r2.equals(r5);	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ba }
        if (r2 == 0) goto L_0x01af;
    L_0x01ac:
        r5 = 1;
        if (r11 == 0) goto L_0x01b0;
    L_0x01af:
        r5 = 0;
    L_0x01b0:
        if (r5 == 0) goto L_0x03bc;
    L_0x01b2:
        r2 = 2;
    L_0x01b3:
        r9.b = r2;
        if (r11 == 0) goto L_0x049b;
    L_0x01b7:
        r23 = r25;
        r25 = r6;
        r6 = r7;
        r7 = r5;
    L_0x01bd:
        r2 = 2;
        r0 = r21;
        r0.d = r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03bf }
        r21.p();	 Catch:{ CursorIndexOutOfBoundsException -> 0x03bf }
        r2 = 0;
        r0 = r20;
        r0.a(r12, r6, r2);	 Catch:{ CursorIndexOutOfBoundsException -> 0x03bf }
        if (r11 == 0) goto L_0x0305;
    L_0x01cd:
        r2 = r3;
        r8 = r25;
        r9 = r4;
        r3 = r23;
        r4 = r22;
    L_0x01d5:
        if (r2 == 0) goto L_0x0270;
    L_0x01d7:
        if (r7 != 0) goto L_0x0270;
    L_0x01d9:
        r12 = new com.whatsapp.w_;
        r5 = 3;
        r12.<init>(r5, r3);
        r5 = 1;
        r0 = r20;
        r6 = r0.a(r3, r5, r12);
        r5 = new com.whatsapp.w_;
        r10 = 0;
        r5.<init>(r12, r10, r9);
        r12.c = r5;
        r10 = com.whatsapp.Conversation.t;
        r13 = r3.e;
        r10.put(r13, r12);
        r10 = 0;
        r4 = r4 + -1;
        r18 = r6;
        r6 = r2;
        r2 = r4;
        r4 = r18;
    L_0x01fe:
        if (r6 == 0) goto L_0x0478;
    L_0x0200:
        if (r9 != 0) goto L_0x0204;
    L_0x0202:
        if (r11 == 0) goto L_0x0478;
    L_0x0204:
        r3 = 0;
        r13 = 0;
        r0 = r20;
        r3 = r0.a(r9, r3, r13);
        if (r10 == 0) goto L_0x0475;
    L_0x020e:
        r5 = new com.whatsapp.w_;
        r13 = 0;
        r5.<init>(r10, r13, r9);
        r10.c = r5;
        r10 = r5;
    L_0x0217:
        if (r3 <= r4) goto L_0x03c3;
    L_0x0219:
        r5 = r3;
    L_0x021a:
        r3 = com.whatsapp.Conversation.t;
        r4 = r9.e;
        r3.put(r4, r10);
        r3 = 0;
        if (r2 < 0) goto L_0x048c;
    L_0x0224:
        r4 = r2 + -1;
        r0 = r20;
        r2 = r0.getItem(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x03c6 }
        r2 = (com.whatsapp.protocol.b) r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03c6 }
        r3 = r4;
    L_0x022f:
        r6 = r2;
        r4 = r3;
    L_0x0231:
        if (r6 == 0) goto L_0x0405;
    L_0x0233:
        r2 = r6.D;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0403 }
        r14 = r9.D;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0403 }
        r2 = com.whatsapp.util.bm.a(r2, r14);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0403 }
    L_0x023b:
        if (r6 == 0) goto L_0x0256;
    L_0x023d:
        r3 = r6.j;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0408 }
        if (r3 != 0) goto L_0x0256;
    L_0x0241:
        r3 = r6.e;	 Catch:{ CursorIndexOutOfBoundsException -> 0x040a }
        r3 = r3.b;	 Catch:{ CursorIndexOutOfBoundsException -> 0x040a }
        if (r3 != 0) goto L_0x0256;
    L_0x0247:
        if (r2 == 0) goto L_0x0256;
    L_0x0249:
        r2 = r6.F;	 Catch:{ CursorIndexOutOfBoundsException -> 0x040e }
        r3 = r9.F;	 Catch:{ CursorIndexOutOfBoundsException -> 0x040e }
        r2 = r2.equals(r3);	 Catch:{ CursorIndexOutOfBoundsException -> 0x040e }
        if (r2 == 0) goto L_0x0256;
    L_0x0253:
        r3 = 1;
        if (r11 == 0) goto L_0x0257;
    L_0x0256:
        r3 = 0;
    L_0x0257:
        if (r3 == 0) goto L_0x0410;
    L_0x0259:
        r2 = 2;
    L_0x025a:
        r10.b = r2;
        if (r11 == 0) goto L_0x047d;
    L_0x025e:
        r2 = r3;
        r3 = r9;
    L_0x0260:
        r6 = 3;
        r0 = r21;
        r0.d = r6;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0413 }
        r21.p();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0413 }
        r6 = 1;
        r0 = r20;
        r0.a(r12, r5, r6);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0413 }
        if (r11 == 0) goto L_0x0305;
    L_0x0270:
        r9 = r4;
        if (r2 != 0) goto L_0x0305;
    L_0x0273:
        if (r7 == 0) goto L_0x0305;
    L_0x0275:
        r10 = new com.whatsapp.w_;
        r2 = 1;
        r10.<init>(r2, r3);
        r2 = 1;
        r0 = r20;
        r4 = r0.a(r3, r2, r10);
        r5 = new com.whatsapp.w_;
        r2 = 1;
        r5.<init>(r10, r2, r8);
        r10.d = r5;
        r2 = com.whatsapp.Conversation.t;
        r3 = r3.e;
        r2.put(r3, r10);
        r6 = 0;
        r2 = r9 + 1;
        r3 = r7;
        r7 = r8;
    L_0x0296:
        if (r3 == 0) goto L_0x02f7;
    L_0x0298:
        if (r7 != 0) goto L_0x029c;
    L_0x029a:
        if (r11 == 0) goto L_0x02f7;
    L_0x029c:
        r3 = 0;
        r8 = 0;
        r0 = r20;
        r3 = r0.a(r7, r3, r8);
        if (r6 == 0) goto L_0x0465;
    L_0x02a6:
        r5 = new com.whatsapp.w_;
        r8 = 1;
        r5.<init>(r6, r8, r7);
        r6.d = r5;
        r6 = r5;
    L_0x02af:
        if (r3 <= r4) goto L_0x0417;
    L_0x02b1:
        r5 = r3;
    L_0x02b2:
        r3 = com.whatsapp.Conversation.t;
        r4 = r7.e;
        r3.put(r4, r6);
        r3 = 0;
        if (r2 < 0) goto L_0x046e;
    L_0x02bc:
        r4 = r2 + 1;
        r0 = r20;
        r2 = r0.getItem(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x041a }
        r2 = (com.whatsapp.protocol.b) r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x041a }
        r3 = r4;
    L_0x02c7:
        r4 = r2;
        r8 = r3;
    L_0x02c9:
        if (r4 == 0) goto L_0x0459;
    L_0x02cb:
        r2 = r4.D;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0457 }
        r12 = r7.D;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0457 }
        r2 = com.whatsapp.util.bm.a(r2, r12);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0457 }
    L_0x02d3:
        if (r4 == 0) goto L_0x02ee;
    L_0x02d5:
        r3 = r4.j;	 Catch:{ CursorIndexOutOfBoundsException -> 0x045c }
        if (r3 != 0) goto L_0x02ee;
    L_0x02d9:
        r3 = r4.e;	 Catch:{ CursorIndexOutOfBoundsException -> 0x045e }
        r3 = r3.b;	 Catch:{ CursorIndexOutOfBoundsException -> 0x045e }
        if (r3 != 0) goto L_0x02ee;
    L_0x02df:
        if (r2 == 0) goto L_0x02ee;
    L_0x02e1:
        r2 = r4.F;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0460 }
        r3 = r7.F;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0460 }
        r2 = r2.equals(r3);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0460 }
        if (r2 == 0) goto L_0x02ee;
    L_0x02eb:
        r3 = 1;
        if (r11 == 0) goto L_0x02ef;
    L_0x02ee:
        r3 = 0;
    L_0x02ef:
        if (r3 == 0) goto L_0x0462;
    L_0x02f1:
        r2 = 2;
    L_0x02f2:
        r6.b = r2;
        if (r11 == 0) goto L_0x0468;
    L_0x02f6:
        r4 = r5;
    L_0x02f7:
        r2 = 1;
        r0 = r21;
        r0.d = r2;
        r21.p();
        r2 = 0;
        r0 = r20;
        r0.a(r10, r4, r2);
    L_0x0305:
        return;
    L_0x0306:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0308 }
    L_0x0308:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x030a }
    L_0x030a:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x030c }
    L_0x030c:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x030e }
    L_0x030e:
        r2 = move-exception;
        throw r2;
    L_0x0310:
        r2 = move-exception;
        throw r2;
    L_0x0312:
        r2 = move-exception;
        throw r2;
    L_0x0314:
        r2 = 0;
        goto L_0x0058;
    L_0x0317:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0319 }
    L_0x0319:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x031b }
    L_0x031b:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x031d }
    L_0x031d:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x031f }
    L_0x031f:
        r2 = move-exception;
        throw r2;
    L_0x0321:
        r2 = move-exception;
        throw r2;
    L_0x0323:
        r2 = move-exception;
        throw r2;
    L_0x0325:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        r2.<init>();	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        r8 = z;	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        r9 = 8;
        r8 = r8[r9];	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        r2 = r2.append(r8);	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        r0 = r20;
        r8 = r0.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        r8 = r8.aS;	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        r8 = r8.getCount();	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        r2 = r2.append(r8);	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        r8 = z;	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        r9 = 16;
        r8 = r8[r9];	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        r2 = r2.append(r8);	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        r2 = r2.append(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        r2 = r2.toString();	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        com.whatsapp.util.Log.e(r2);	 Catch:{ CursorIndexOutOfBoundsException -> 0x035e }
        if (r11 == 0) goto L_0x04c4;
    L_0x035a:
        r5 = r4;
        r4 = r3;
        goto L_0x00d8;
    L_0x035e:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0360 }
    L_0x0360:
        r2 = move-exception;
        throw r2;
    L_0x0362:
        r2 = 0;
        goto L_0x00e2;
    L_0x0365:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0367 }
    L_0x0367:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0369 }
    L_0x0369:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x036b }
    L_0x036b:
        r2 = move-exception;
        throw r2;
    L_0x036d:
        r7 = r6;
        goto L_0x016a;
    L_0x0370:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        r2.<init>();	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        r10 = z;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        r13 = 10;
        r10 = r10[r13];	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        r2 = r2.append(r10);	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        r0 = r20;
        r10 = r0.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        r10 = r10.aS;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        r10 = r10.getCount();	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        r2 = r2.append(r10);	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        r10 = z;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        r13 = 11;
        r10 = r10[r13];	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        r2 = r2.append(r10);	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        r2 = r2.append(r6);	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        r2 = r2.toString();	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        com.whatsapp.util.Log.e(r2);	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        r2 = 3;
        r9.b = r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ad }
        if (r11 == 0) goto L_0x04a6;
    L_0x03a8:
        r22 = r6;
        r6 = r5;
        goto L_0x0184;
    L_0x03ad:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03af }
    L_0x03af:
        r2 = move-exception;
        throw r2;
    L_0x03b1:
        r2 = 0;
        goto L_0x0192;
    L_0x03b4:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03b6 }
    L_0x03b6:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03b8 }
    L_0x03b8:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03ba }
    L_0x03ba:
        r2 = move-exception;
        throw r2;
    L_0x03bc:
        r2 = 3;
        goto L_0x01b3;
    L_0x03bf:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x03c1 }
    L_0x03c1:
        r2 = move-exception;
        throw r2;
    L_0x03c3:
        r5 = r4;
        goto L_0x021a;
    L_0x03c6:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        r2.<init>();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        r13 = z;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        r14 = 15;
        r13 = r13[r14];	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        r2 = r2.append(r13);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        r0 = r20;
        r13 = r0.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        r13 = r13.aS;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        r13 = r13.getCount();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        r2 = r2.append(r13);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        r13 = z;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        r14 = 9;
        r13 = r13[r14];	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        r2 = r2.append(r13);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        r2 = r2.append(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        r2 = r2.toString();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        r2 = 1;
        r10.b = r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0401 }
        if (r11 == 0) goto L_0x0488;
    L_0x03fe:
        r6 = r3;
        goto L_0x0231;
    L_0x0401:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0403 }
    L_0x0403:
        r2 = move-exception;
        throw r2;
    L_0x0405:
        r2 = 0;
        goto L_0x023b;
    L_0x0408:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x040a }
    L_0x040a:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x040c }
    L_0x040c:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x040e }
    L_0x040e:
        r2 = move-exception;
        throw r2;
    L_0x0410:
        r2 = 1;
        goto L_0x025a;
    L_0x0413:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0415 }
    L_0x0415:
        r2 = move-exception;
        throw r2;
    L_0x0417:
        r5 = r4;
        goto L_0x02b2;
    L_0x041a:
        r2 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        r2.<init>();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        r8 = z;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        r9 = 13;
        r8 = r8[r9];	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        r2 = r2.append(r8);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        r0 = r20;
        r8 = r0.a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        r8 = r8.aS;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        r8 = r8.getCount();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        r2 = r2.append(r8);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        r8 = z;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        r9 = 7;
        r8 = r8[r9];	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        r2 = r2.append(r8);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        r2 = r2.append(r4);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        r2 = r2.toString();	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        r2 = 3;
        r6.b = r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0455 }
        if (r11 == 0) goto L_0x02f6;
    L_0x0451:
        r8 = r4;
        r4 = r3;
        goto L_0x02c9;
    L_0x0455:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0457 }
    L_0x0457:
        r2 = move-exception;
        throw r2;
    L_0x0459:
        r2 = 0;
        goto L_0x02d3;
    L_0x045c:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x045e }
    L_0x045e:
        r2 = move-exception;
        throw r2;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0460 }
    L_0x0460:
        r2 = move-exception;
        throw r2;
    L_0x0462:
        r2 = 3;
        goto L_0x02f2;
    L_0x0465:
        r6 = r5;
        goto L_0x02af;
    L_0x0468:
        r7 = r4;
        r2 = r8;
        r4 = r5;
        r5 = r6;
        goto L_0x0296;
    L_0x046e:
        r18 = r3;
        r3 = r2;
        r2 = r18;
        goto L_0x02c7;
    L_0x0475:
        r10 = r5;
        goto L_0x0217;
    L_0x0478:
        r5 = r4;
        r4 = r2;
        r2 = r6;
        goto L_0x0260;
    L_0x047d:
        r2 = r4;
        r4 = r5;
        r5 = r10;
        r18 = r6;
        r6 = r3;
        r3 = r9;
        r9 = r18;
        goto L_0x01fe;
    L_0x0488:
        r2 = r6;
        r3 = r9;
        goto L_0x0260;
    L_0x048c:
        r18 = r3;
        r3 = r2;
        r2 = r18;
        goto L_0x022f;
    L_0x0493:
        r9 = r7;
        goto L_0x0167;
    L_0x0496:
        r7 = r8;
        r22 = r2;
        goto L_0x01bd;
    L_0x049b:
        r8 = r5;
        r23 = r25;
        r2 = r22;
        r25 = r6;
        r6 = r7;
        r7 = r9;
        goto L_0x014a;
    L_0x04a6:
        r23 = r25;
        r22 = r6;
        r25 = r5;
        r6 = r7;
        r7 = r8;
        goto L_0x01bd;
    L_0x04b0:
        r18 = r5;
        r5 = r2;
        r2 = r18;
        goto L_0x0181;
    L_0x04b7:
        r18 = r2;
        r2 = r5;
        r5 = r18;
        r19 = r4;
        r4 = r6;
        r6 = r3;
        r3 = r19;
        goto L_0x00c8;
    L_0x04c4:
        r2 = r6;
        r6 = r3;
        r18 = r3;
        r3 = r5;
        r5 = r4;
        r4 = r18;
        goto L_0x0106;
    L_0x04ce:
        r4 = r2;
        r2 = r3;
        goto L_0x00d6;
    L_0x04d2:
        r18 = r5;
        r5 = r2;
        r2 = r4;
        r4 = r3;
        r3 = r18;
        goto L_0x0106;
    L_0x04db:
        r2 = r3;
        r8 = r25;
        r9 = r24;
        r4 = r22;
        r3 = r23;
        goto L_0x01d5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a35.a(com.whatsapp.ConversationRow, int, com.whatsapp.protocol.b, com.whatsapp.protocol.b, com.whatsapp.protocol.b, boolean):void");
    }

    public void bindView(View view, Context context, Cursor cursor) {
    }

    public long getItemId(int i) {
        return (long) i;
    }

    private void a(int i) {
        int i2 = App.az;
        int count = getCursor().getCount();
        if (i < count) {
            int i3 = i;
            while (i3 < count) {
                if (((b) Conversation.y(this.a).get(Integer.valueOf(i3))) != null) {
                    try {
                        Conversation.y(this.a).remove(Integer.valueOf(i3));
                    } catch (CursorIndexOutOfBoundsException e) {
                        throw e;
                    }
                }
                int i4 = i3 + 1;
                if (i2 != 0) {
                    break;
                }
                i3 = i4;
            }
            if (i2 == 0) {
                return;
            }
        }
        Log.w(z[17]);
        Conversation.e(this.a).remove(i - count);
    }
}
