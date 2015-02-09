package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.preference.WaFontListPreference;
import com.whatsapp.protocol.b;
import com.whatsapp.util.bm;
import java.util.HashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public abstract class ConversationRow extends BubbleRelativeLayout {
    private static float A;
    private static float B;
    private static final String[] J;
    private static Paint v;
    static int x;
    private boolean C;
    private final Runnable D;
    private long E;
    private Drawable F;
    private View G;
    protected OnLongClickListener H;
    protected final ImageView I;
    private TextView s;
    private View t;
    OnClickListener u;
    protected b w;
    protected final TextView y;
    private int z;

    class AnonymousClass_3 extends View {
        private final Rect a;
        final ConversationRow b;

        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (isSelected()) {
                getDrawingRect(this.a);
                this.a.top = this.b.g.top - ((int) (1.5f * am1.a().g));
                this.a.bottom = this.b.g.bottom + Math.max(1, (int) (0.5f * am1.a().g));
                canvas.drawRect(this.a, ConversationRow.q());
            }
        }

        AnonymousClass_3(ConversationRow conversationRow, Context context) {
            this.b = conversationRow;
            super(context);
            this.a = new Rect();
        }
    }

    protected abstract int d();

    protected abstract int l();

    protected void h() {
        Conversation b = b();
        if (b != null) {
            b.a_ = new HashMap();
            b.a_.put(this.h.e, this.h);
            b.u();
            b.x();
        }
    }

    void m() {
        if (this.G != null) {
            this.G.setVisibility(0);
            return;
        }
        this.G = new AnonymousClass_3(this, getContext());
        this.G.setClickable(true);
        this.G.setOnClickListener(new _7(this));
        setClipToPadding(false);
        addView(this.G, new LayoutParams(-1, -1));
    }

    public static float b(Resources resources) {
        return a(resources, WaFontListPreference.b);
    }

    static View b(ConversationRow conversationRow) {
        return conversationRow.G;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConversationRow(android.content.Context r12, com.whatsapp.protocol.b r13) {
        /*
        r11_this = this;
        r1 = 5;
        r2 = 3;
        r10 = 1;
        r3 = 0;
        r5 = com.whatsapp.App.az;
        r11.<init>(r12, r13);
        r11.C = r3;
        r0 = new com.whatsapp.al;
        r0.<init>(r11);
        r11.F = r0;
        r0 = new com.whatsapp.d_;
        r0.<init>(r11);
        r11.H = r0;
        r0 = new com.whatsapp.su;
        r0.<init>(r11);
        r11.D = r0;
        r0 = new com.whatsapp.a31;
        r0.<init>(r11);
        r11.u = r0;
        r6 = com.whatsapp.am1.a();
        r0 = r13.e;
        r0 = r0.b;
        if (r0 == 0) goto L_0x0037;
    L_0x0031:
        r0 = r11.l();
        if (r5 == 0) goto L_0x003b;
    L_0x0037:
        r0 = r11.d();
    L_0x003b:
        r4 = r13.e;
        r4 = r4.c;
        r4 = com.whatsapp.bd.b(r4);
        r11.k = r4;
        r4 = r11.getContext();
        r4 = android.view.LayoutInflater.from(r4);
        com.whatsapp.b7.a(r4, r0, r11, r10);
        r0 = r6.g;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r0 * r4;
        r0 = (int) r0;
        x = r0;
        r0 = r13.a;
        r4 = 6;
        if (r0 != r4) goto L_0x007b;
    L_0x005d:
        r0 = r13.j;
        r4 = 8;
        if (r0 == r4) goto L_0x007b;
    L_0x0063:
        r0 = 17;
        r11.setGravity(r0);
        r0 = x;
        r4 = x;
        r7 = r6.h;
        r4 = r4 + r7;
        r7 = x;
        r8 = x;
        r9 = r6.h;
        r8 = r8 + r9;
        r11.setPadding(r0, r4, r7, r8);
        if (r5 == 0) goto L_0x00e5;
    L_0x007b:
        r0 = r13.e;
        r0 = r0.b;
        if (r0 == 0) goto L_0x00a9;
    L_0x0081:
        r0 = com.whatsapp.App.as();
        if (r0 == 0) goto L_0x015a;
    L_0x0087:
        r0 = r1;
    L_0x0088:
        r11.setGravity(r0);
        r0 = com.whatsapp.App.as();
        if (r0 == 0) goto L_0x015d;
    L_0x0091:
        r0 = x;
    L_0x0093:
        r4 = x;
        r7 = r6.h;
        r7 = r7 + r4;
        r4 = com.whatsapp.App.as();
        if (r4 == 0) goto L_0x0160;
    L_0x009e:
        r4 = r3;
    L_0x009f:
        r8 = x;
        r9 = r6.h;
        r8 = r8 + r9;
        r11.setPadding(r0, r7, r4, r8);
        if (r5 == 0) goto L_0x00ce;
    L_0x00a9:
        r0 = com.whatsapp.App.as();
        if (r0 == 0) goto L_0x0164;
    L_0x00af:
        r11.setGravity(r2);
        r0 = com.whatsapp.App.as();
        if (r0 == 0) goto L_0x0167;
    L_0x00b8:
        r0 = r3;
    L_0x00b9:
        r1 = x;
        r2 = r6.h;
        r2 = r2 + r1;
        r1 = com.whatsapp.App.as();
        if (r1 == 0) goto L_0x016b;
    L_0x00c4:
        r1 = x;
    L_0x00c6:
        r4 = x;
        r6 = r6.h;
        r4 = r4 + r6;
        r11.setPadding(r0, r2, r1, r4);
    L_0x00ce:
        r0 = r11.F;
        r11.setBackgroundDrawable(r0);
        r0 = r11.getResources();
        r1 = 2131361839; // 0x7f0a002f float:1.8343442E38 double:1.0530326635E-314;
        r0 = r0.getDimension(r1);
        r0 = (int) r0;
        r11.setMinimumHeight(r0);
        r11.setLongClickable(r10);
    L_0x00e5:
        r0 = 2131427674; // 0x7f0b015a float:1.847697E38 double:1.0530651903E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r11.y = r0;
        r0 = 2131427535; // 0x7f0b00cf float:1.847669E38 double:1.0530651216E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r11.I = r0;
        r0 = com.whatsapp.App.ax;
        if (r0 == 0) goto L_0x0115;
    L_0x00ff:
        r0 = 2131427673; // 0x7f0b0159 float:1.8476969E38 double:1.05306519E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        if (r0 == 0) goto L_0x0115;
    L_0x010a:
        r1 = new android.widget.LinearLayout$LayoutParams;
        r2 = -2;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1.<init>(r3, r2, r4);
        r0.setLayoutParams(r1);
    L_0x0115:
        r11.a(r13);
        r0 = r11.H;
        r11.setOnLongClickListener(r0);
        r0 = v;
        if (r0 != 0) goto L_0x013c;
    L_0x0121:
        r0 = new android.graphics.Paint;
        r0.<init>();
        v = r0;
        r0 = v;
        r1 = 1295234533; // 0x4d33b5e5 float:1.88440144E8 double:6.39930886E-315;
        r0.setColor(r1);
        r0 = v;
        r1 = android.graphics.Paint.Style.FILL;
        r0.setStyle(r1);
        r0 = v;
        r0.setAntiAlias(r10);
    L_0x013c:
        r0 = r11.j();
        if (r0 == 0) goto L_0x0156;
    L_0x0142:
        r11.m();
        r0 = r11.G;
        r1 = r11.j();
        r2 = r13.e;
        r1 = r1.containsKey(r2);
        r0.setSelected(r1);
        if (r5 == 0) goto L_0x0159;
    L_0x0156:
        r11.i();
    L_0x0159:
        return;
    L_0x015a:
        r0 = r2;
        goto L_0x0088;
    L_0x015d:
        r0 = r3;
        goto L_0x0093;
    L_0x0160:
        r4 = x;
        goto L_0x009f;
    L_0x0164:
        r2 = r1;
        goto L_0x00af;
    L_0x0167:
        r0 = x;
        goto L_0x00b9;
    L_0x016b:
        r1 = r3;
        goto L_0x00c6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.<init>(android.content.Context, com.whatsapp.protocol.b):void");
    }

    public int a() {
        if (this.s == null) {
            this.s = (TextView) findViewById(R.id.date_divider);
        }
        return Math.round(getResources().getDimension(R.dimen.conversation_date_divider_marginbottom)) + this.s.getMeasuredHeight();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float a(android.content.res.Resources r5, int r6) {
        /*
        r4 = 1;
        r1 = 0;
        r0 = A;
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x001a;
    L_0x0009:
        r0 = r5.getDisplayMetrics();
        r0 = r0.scaledDensity;
        r2 = 2131361844; // 0x7f0a0034 float:1.8343452E38 double:1.053032666E-314;
        r2 = r5.getDimension(r2);
        r0 = r2 / r0;
        A = r0;
    L_0x001a:
        r0 = -1;
        if (r6 != r0) goto L_0x0050;
    L_0x001d:
        r0 = -2;
        r2 = com.whatsapp.App.az;
        if (r2 == 0) goto L_0x0025;
    L_0x0022:
        if (r6 != r4) goto L_0x0025;
    L_0x0024:
        r0 = 4;
    L_0x0025:
        r2 = java.util.Locale.getDefault();
        r2 = r2.getLanguage();
        r3 = J;
        r3 = r3[r4];
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0049;
    L_0x0037:
        r2 = java.util.Locale.getDefault();
        r2 = r2.getLanguage();
        r3 = J;
        r1 = r3[r1];
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x004b;
    L_0x0049:
        r0 = r0 + 1;
    L_0x004b:
        r1 = A;
        r0 = (float) r0;
        r0 = r0 + r1;
        return r0;
    L_0x0050:
        r0 = r1;
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.a(android.content.res.Resources, int):float");
    }

    public void p() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = App.az;
        if (this.d > 1 && this.t != null) {
            this.t.setVisibility(8);
        }
        switch (this.d) {
            case ay.f /*1*/:
                if (App.as()) {
                    i = 0;
                } else {
                    i = x;
                }
                i2 = am1.a().h + x;
                if (App.as()) {
                    i3 = x;
                } else {
                    i3 = 0;
                }
                setPadding(i, i2, i3, x / 2);
                if (i5 == 0) {
                    return;
                }
                break;
            case ay.n /*2*/:
                break;
            case ay.p /*3*/:
                break;
            default:
                return;
        }
        if (App.as()) {
            i = 0;
        } else {
            i = x;
        }
        i2 = x / 2;
        if (App.as()) {
            i3 = x;
        } else {
            i3 = 0;
        }
        setPadding(i, i2, i3, x / 2);
        setMinimumHeight((int) getResources().getDimension(R.dimen.conversation_row_min_height_collapse_body));
        if (i5 == 0) {
            return;
        }
        if (App.as()) {
            i = 0;
        } else {
            i = x;
        }
        i3 = x / 2;
        if (App.as()) {
            i4 = x;
        }
        setPadding(i, i3, i4, (x / 2) + am1.a().h);
        setMinimumHeight((int) getResources().getDimension(R.dimen.conversation_row_min_height_collapse_bottom));
    }

    void i() {
        if (this.G != null) {
            this.G.setVisibility(8);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.b r12) {
        /*
        r11_this = this;
        r10 = 2;
        r1 = 1;
        r2 = 0;
        r4 = com.whatsapp.App.az;
        r0 = r11.w;
        if (r12 == r0) goto L_0x01ad;
    L_0x0009:
        r0 = r1;
    L_0x000a:
        r11.w = r12;
        r11.h = r12;
        r11.setTag(r12);
        r3 = r11.y;
        if (r3 == 0) goto L_0x007e;
    L_0x0015:
        r3 = r11.C;
        if (r3 == 0) goto L_0x0021;
    L_0x0019:
        r6 = r12.D;
        r8 = r11.E;
        r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r3 == 0) goto L_0x005b;
    L_0x0021:
        r5 = r11.y;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r3 = com.whatsapp.App.as();
        if (r3 == 0) goto L_0x01b0;
    L_0x002e:
        r3 = "";
    L_0x0030:
        r6 = r6.append(r3);
        r3 = r11.getContext();
        r8 = com.whatsapp.App.f(r12);
        r7 = com.whatsapp.util.bm.m(r3, r8);
        r3 = com.whatsapp.App.as();
        if (r3 == 0) goto L_0x01b4;
    L_0x0046:
        r3 = " ";
    L_0x0048:
        r3 = r7.concat(r3);
        r3 = r6.append(r3);
        r3 = r3.toString();
        r5.setText(r3);
        r6 = r12.D;
        r11.E = r6;
    L_0x005b:
        r3 = r12.l;
        if (r3 == 0) goto L_0x0079;
    L_0x005f:
        r3 = r12.e;
        r3 = r3.b;
        if (r3 == 0) goto L_0x0079;
    L_0x0065:
        r3 = r12.e;
        r3 = r3.c;
        r3 = com.whatsapp.m8.d(r3);
        if (r3 != 0) goto L_0x0079;
    L_0x006f:
        r3 = r11.y;
        r5 = 2130837686; // 0x7f0200b6 float:1.7280333E38 double:1.0527736975E-314;
        r3.setCompoundDrawablesWithIntrinsicBounds(r5, r2, r2, r2);
        if (r4 == 0) goto L_0x007e;
    L_0x0079:
        r3 = r11.y;
        r3.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r2, r2);
    L_0x007e:
        r3 = r11.I;
        if (r3 == 0) goto L_0x00d0;
    L_0x0082:
        r3 = r12.e;
        r3 = r3.b;
        if (r3 == 0) goto L_0x00d0;
    L_0x0088:
        r3 = r11.C;
        if (r3 == 0) goto L_0x0094;
    L_0x008c:
        r3 = r12.a;
        r5 = r11.z;
        if (r3 != r5) goto L_0x0094;
    L_0x0092:
        if (r0 == 0) goto L_0x00d0;
    L_0x0094:
        if (r0 != 0) goto L_0x00c1;
    L_0x0096:
        r0 = r12.a;
        r3 = 13;
        r0 = com.whatsapp.protocol.f.a(r0, r3);
        if (r0 < 0) goto L_0x00c1;
    L_0x00a0:
        r0 = new com.whatsapp.lu;
        r3 = r11.I;
        r5 = r12.a;
        r5 = r11.a(r5);
        r0.<init>(r3, r5);
        r6 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r0.setDuration(r6);
        r3 = new android.view.animation.DecelerateInterpolator;
        r3.<init>();
        r0.setInterpolator(r3);
        r3 = r11.I;
        r3.startAnimation(r0);
        if (r4 == 0) goto L_0x00cc;
    L_0x00c1:
        r0 = r11.I;
        r3 = r12.a;
        r3 = r11.a(r3);
        r0.setImageResource(r3);
    L_0x00cc:
        r0 = r12.a;
        r11.z = r0;
    L_0x00d0:
        r0 = 2131427671; // 0x7f0b0157 float:1.8476965E38 double:1.053065189E-314;
        r0 = r11.findViewById(r0);
        r11.t = r0;
        r0 = r12.e;
        r0 = r0.b;
        if (r0 != 0) goto L_0x01aa;
    L_0x00df:
        r0 = r12.e;
        r0 = r0.c;
        r0 = com.whatsapp.bd.b(r0);
        if (r0 == 0) goto L_0x01aa;
    L_0x00e9:
        r0 = r12.F;
        if (r0 == 0) goto L_0x0176;
    L_0x00ed:
        r0 = 2131427672; // 0x7f0b0158 float:1.8476967E38 double:1.0530651893E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r3 = com.whatsapp.App.Z;
        r3 = r12.e;
        r3 = r3.c;
        r5 = r12.F;
        r3 = com.whatsapp.bd.d(r3, r5);
        if (r3 == 0) goto L_0x010b;
    L_0x0104:
        r3 = r3.b;
        r0.setTextColor(r3);
        if (r4 == 0) goto L_0x0110;
    L_0x010b:
        r3 = -1728053248; // 0xffffffff99000000 float:-6.617445E-24 double:NaN;
        r0.setTextColor(r3);
    L_0x0110:
        r3 = r11.getResources();
        r3 = b(r3);
        r0.setTextSize(r3);
        com.whatsapp.am1.a(r0);
        r3 = com.whatsapp.App.P;
        r5 = r12.F;
        r3 = r3.a(r5);
        r5 = r11.getContext();
        r5 = r3.a(r5);
        r0.setText(r5);
        r0 = 2131427673; // 0x7f0b0159 float:1.8476969E38 double:1.05306519E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r5 = r3.N;
        r5 = android.text.TextUtils.isEmpty(r5);
        if (r5 == 0) goto L_0x016f;
    L_0x0142:
        r5 = r3.t;
        r5 = android.text.TextUtils.isEmpty(r5);
        if (r5 != 0) goto L_0x016f;
    L_0x014a:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "~";
        r5 = r5.append(r6);
        r3 = r3.t;
        r3 = r5.append(r3);
        r3 = r3.toString();
        r5 = r11.getContext();
        r3 = com.whatsapp.util.a5.c(r3, r5);
        r0.setText(r3);
        r0.setVisibility(r2);
        if (r4 == 0) goto L_0x0174;
    L_0x016f:
        r3 = 8;
        r0.setVisibility(r3);
    L_0x0174:
        if (r4 == 0) goto L_0x0192;
    L_0x0176:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = J;
        r3 = r3[r10];
        r0 = r0.append(r3);
        r3 = com.whatsapp.util.Log.a(r12);
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x0192:
        r0 = r11.d;
        if (r0 >= r10) goto L_0x019b;
    L_0x0196:
        r0 = r11.t;
        r0.setVisibility(r2);
    L_0x019b:
        r0 = r11.t;
        r2 = r11.u;
        r0.setOnClickListener(r2);
        r0 = r11.t;
        r2 = 2130839096; // 0x7f020638 float:1.7283193E38 double:1.052774394E-314;
        r0.setBackgroundResource(r2);
    L_0x01aa:
        r11.C = r1;
        return;
    L_0x01ad:
        r0 = r2;
        goto L_0x000a;
    L_0x01b0:
        r3 = " ";
        goto L_0x0030;
    L_0x01b4:
        r3 = "";
        goto L_0x0048;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.a(com.whatsapp.protocol.b):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected int a(int r5) {
        /*
        r4_this = this;
        r1 = 2130838963; // 0x7f0205b3 float:1.7282923E38 double:1.0527743284E-314;
        r2 = com.whatsapp.App.az;
        r0 = 13;
        r0 = com.whatsapp.protocol.f.a(r5, r0);
        if (r0 < 0) goto L_0x0012;
    L_0x000d:
        r0 = 2130838957; // 0x7f0205ad float:1.728291E38 double:1.0527743255E-314;
        if (r2 == 0) goto L_0x002b;
    L_0x0012:
        r0 = 5;
        r0 = com.whatsapp.protocol.f.a(r5, r0);
        if (r0 < 0) goto L_0x001e;
    L_0x0019:
        r0 = 2130838961; // 0x7f0205b1 float:1.728292E38 double:1.0527743275E-314;
        if (r2 == 0) goto L_0x002b;
    L_0x001e:
        r0 = 4;
        r0 = com.whatsapp.protocol.f.a(r5, r0);
        if (r0 != 0) goto L_0x002a;
    L_0x0025:
        r0 = 2130838959; // 0x7f0205af float:1.7282915E38 double:1.0527743265E-314;
        if (r2 == 0) goto L_0x002b;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r2 = com.whatsapp.App.aa;
        r3 = 3;
        if (r2 != r3) goto L_0x0034;
    L_0x0030:
        r2 = 7;
        if (r5 != r2) goto L_0x0034;
    L_0x0033:
        r0 = r1;
    L_0x0034:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.a(int):int");
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.G != null) {
            this.G.layout(0, 0, getWidth(), getHeight());
        }
    }

    static {
        String[] strArr = new String[6];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "%\u0001";
        int i2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 67;
                        break;
                    case ay.f /*1*/:
                        i4 = 96;
                        break;
                    case ay.n /*2*/:
                        i4 = 87;
                        break;
                    case ay.p /*3*/:
                        i4 = 20;
                        break;
                    default:
                        i4 = 86;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = " \u000f9b31\u00136`?,\u000e\bf94O:}%0\t9s\t1\r#K%1\u0003m";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "cH";
                    i2 = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = " \u000f9b31\u00136`?,\u000exs37\u0004>u:,\u0007>`3.\u0013xf3.\u000f#q\t1\u0005${#1\u000324?0@9a:/Aw";
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "c\u00046`7~";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    J = strArr3;
                    B = 0.0f;
                    A = 0.0f;
                    x = -1;
                default:
                    strArr2[i] = str;
                    str = "\"\u0012";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    public void f() {
        this.f = true;
        setOnLongClickListener(null);
        this.y.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    b k() {
        return (b) getTag();
    }

    protected Conversation b() {
        return getContext() instanceof Conversation ? (Conversation) getContext() : null;
    }

    public void a(b bVar, boolean z) {
        if (this.w != bVar || z) {
            a(bVar);
        }
        if (j() != null) {
            m();
            this.G.setSelected(j().containsKey(this.w.e));
            if (App.az == 0) {
                return;
            }
        }
        i();
    }

    public void g() {
        a(this.w);
    }

    public void a(boolean z) {
        if (z) {
            this.s = (TextView) findViewById(R.id.date_divider);
            this.s.setText(bm.b(getContext(), this.w.D));
            this.s.setTextSize(a(getResources()));
            this.s.setVisibility(0);
            this.n = true;
            if (App.az == 0) {
                return;
            }
        }
        findViewById(R.id.date_divider).setVisibility(8);
        this.n = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void c() {
        /*
        r8_this = this;
        r0 = r8.getContext();
        r0 = r0 instanceof com.whatsapp.Conversation;
        if (r0 == 0) goto L_0x0159;
    L_0x0008:
        r2 = r8.getContext();
        r2 = (com.whatsapp.Conversation) r2;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r0 = r8.w;
        r0 = r0.e;
        r0 = r0.c;
        r0 = com.whatsapp.bd.b(r0);
        if (r0 == 0) goto L_0x00eb;
    L_0x001f:
        r0 = r8.w;
        r0 = r0.e;
        r0 = r0.b;
        if (r0 == 0) goto L_0x0036;
    L_0x0027:
        r0 = r8.w;
        r0 = r0.e;
        r0 = r0.b;
        if (r0 == 0) goto L_0x00eb;
    L_0x002f:
        r0 = r8.w;
        r0 = r0.a;
        r1 = 6;
        if (r0 != r1) goto L_0x00eb;
    L_0x0036:
        r0 = r8.w;
        r0 = r0.F;
        if (r0 == 0) goto L_0x00a1;
    L_0x003c:
        r0 = com.whatsapp.App.P;
        r1 = r8.w;
        r1 = r1.F;
        r0 = r0.a(r1);
        r0 = r0.h;
        if (r0 != 0) goto L_0x0073;
    L_0x004a:
        r0 = new com.whatsapp.asr;
        r1 = r8.getResources();
        r4 = 2131623974; // 0x7f0e0026 float:1.8875115E38 double:1.0531621754E-314;
        r1 = r1.getString(r4);
        r4 = 7;
        r0.<init>(r1, r4);
        r3.add(r0);
        r0 = new com.whatsapp.asr;
        r1 = r8.getResources();
        r4 = 2131623977; // 0x7f0e0029 float:1.887512E38 double:1.053162177E-314;
        r1 = r1.getString(r4);
        r4 = 8;
        r0.<init>(r1, r4);
        r3.add(r0);
    L_0x0073:
        r0 = new com.whatsapp.asr;
        r1 = r8.getResources();
        r4 = 2131624524; // 0x7f0e024c float:1.887623E38 double:1.053162447E-314;
        r1 = r1.getString(r4);
        r4 = 14;
        r0.<init>(r1, r4);
        r3.add(r0);
        r0 = new com.whatsapp.asr;
        r1 = r8.getResources();
        r4 = 2131624047; // 0x7f0e006f float:1.8875263E38 double:1.0531622115E-314;
        r1 = r1.getString(r4);
        r4 = 16;
        r0.<init>(r1, r4);
        r3.add(r0);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x00eb;
    L_0x00a1:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = J;
        r4 = 4;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r1 = r8.w;
        r1 = com.whatsapp.util.Log.a(r1);
        r1 = r0.append(r1);
        r0 = com.whatsapp.App.aa;
        r4 = 1;
        if (r0 < r4) goto L_0x015a;
    L_0x00be:
        r0 = r8.w;
        r0 = r0.O;
        if (r0 != 0) goto L_0x015a;
    L_0x00c4:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = J;
        r5 = 5;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r8.w;
        r4 = r4.f();
        r0 = r0.append(r4);
        r0 = r0.toString();
    L_0x00e0:
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x00eb:
        r0 = r3.isEmpty();
        if (r0 != 0) goto L_0x0159;
    L_0x00f1:
        r6 = new android.app.AlertDialog$Builder;
        r0 = r8.getContext();
        r6.<init>(r0);
        r0 = com.whatsapp.App.P;
        r1 = r8.w;
        r1 = r1.F;
        r4 = r0.a(r1);
        r0 = r4.d();
        r1 = r4.h;
        if (r1 != 0) goto L_0x0136;
    L_0x010c:
        r1 = r4.t;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0136;
    L_0x0114:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = J;
        r5 = 3;
        r1 = r1[r5];
        r0 = r0.append(r1);
        r1 = r4.t;
        r0 = r0.append(r1);
        r1 = ")";
        r0 = r0.append(r1);
        r0 = r0.toString();
    L_0x0136:
        r6.setTitle(r0);
        r5 = r8.k();
        r7 = new android.widget.ArrayAdapter;
        r0 = r8.getContext();
        r1 = 17367057; // 0x1090011 float:2.5162974E-38 double:8.580466E-317;
        r7.<init>(r0, r1, r3);
        r0 = new com.whatsapp.ra;
        r1 = r8;
        r0.<init>(r1, r2, r3, r4, r5);
        r6.setAdapter(r7, r0);
        r0 = r6.create();
        r2.a(r0);
    L_0x0159:
        return;
    L_0x015a:
        r0 = "";
        goto L_0x00e0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.c():void");
    }

    public void a(String str) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static float a(android.content.res.Resources r3) {
        /*
        r0 = B;
        r1 = 0;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 != 0) goto L_0x0018;
    L_0x0007:
        r0 = r3.getDisplayMetrics();
        r0 = r0.scaledDensity;
        r1 = 2131361828; // 0x7f0a0024 float:1.834342E38 double:1.053032658E-314;
        r1 = r3.getDimension(r1);
        r0 = r1 / r0;
        B = r0;
    L_0x0018:
        r0 = 0;
        r1 = com.whatsapp.preference.WaFontListPreference.b;
        r2 = -1;
        if (r1 != r2) goto L_0x0023;
    L_0x001e:
        r0 = -2;
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0029;
    L_0x0023:
        r1 = com.whatsapp.preference.WaFontListPreference.b;
        r2 = 1;
        if (r1 != r2) goto L_0x0029;
    L_0x0028:
        r0 = 4;
    L_0x0029:
        r1 = B;
        r0 = (float) r0;
        r0 = r0 + r1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRow.a(android.content.res.Resources):float");
    }

    public int e() {
        return this.t != null ? this.t.getMeasuredHeight() : 0;
    }

    static HashMap a(ConversationRow conversationRow) {
        return conversationRow.j();
    }

    public void o() {
        int i = 0;
        this.t = findViewById(R.id.name_in_group);
        if (this.t != null) {
            int i2;
            this.t.setVisibility(0);
            this.d = -1;
            setMinimumHeight((int) getResources().getDimension(R.dimen.conversation_row_min_height));
            if (App.as()) {
                i2 = 0;
            } else {
                i2 = x;
            }
            int i3 = x + am1.a().h;
            if (App.as()) {
                i = x;
            }
            setPadding(i2, i3, i, x + am1.a().h);
        }
    }

    private HashMap j() {
        Conversation b = b();
        return b != null ? b.a_ : null;
    }

    static Paint q() {
        return v;
    }

    public final void n() {
        Handler handler = getHandler();
        if (handler == null) {
            removeCallbacks(this.D);
            post(this.D);
            if (App.az == 0) {
                return;
            }
        }
        if (!handler.hasMessages(0, this.D)) {
            Message obtain = Message.obtain(handler, this.D);
            obtain.what = 0;
            obtain.obj = this.D;
            obtain.sendToTarget();
        }
    }
}
