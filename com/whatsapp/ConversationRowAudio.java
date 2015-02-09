package com.whatsapp;

import android.content.Context;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import com.whatsapp.util.bd;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class ConversationRowAudio extends ConversationRowMedia {
    private static final String[] ab;
    private final Button N;
    private OnClickListener O;
    private final ImageView P;
    private final TextView Q;
    private final TextView R;
    private final int S;
    private final int T;
    private cb U;
    private WaveformVisualizerView V;
    private final ProgressBar W;

    static {
        String[] strArr = new String[17];
        String str = "s{.";
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
                        i3 = 3;
                        break;
                    case ay.f /*1*/:
                        i3 = 20;
                        break;
                    case ay.n /*2*/:
                        i3 = 93;
                        break;
                    case ay.p /*3*/:
                        i3 = 56;
                        break;
                    default:
                        i3 = 95;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "n{(V+fp\u0002J0";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "#r4T:P}']e";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "#y8\\6bK.Q%f.";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "#`/Y1pr8J-jz:\u0002";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "#`4U:p`<U/9";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "hq$";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "#r4T:9";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "i}9";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "#z<U:9";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "u}8O2fg.Y8f;}^-ly\u0002U:9";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "#`/Y1pr8J-fpg";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "bx8J+";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "#`$H:9";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "#a/Te";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "n{(V+fp";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    ab = strArr3;
                default:
                    strArr2[i] = str;
                    str = "#d/W8qq.Ke";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static ImageView c(ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.P;
    }

    protected int d() {
        return R.layout.conversation_row_media_left;
    }

    public void g() {
        c(this.w);
        super.g();
    }

    static TextView d(ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.Q;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(com.whatsapp.protocol.b r15) {
        /*
        r14_this = this;
        r13 = 2131624711; // 0x7f0e0307 float:1.887661E38 double:1.0531625395E-314;
        r12 = -1;
        r11 = 8;
        r10 = 0;
        r2 = 0;
        r3 = com.whatsapp.App.az;
        r0 = r15.A;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r14.R;
        r1.setVisibility(r11);
        r1 = r0.transferring;
        if (r1 == 0) goto L_0x0057;
    L_0x0017:
        r1 = r14.W;
        r1.setVisibility(r2);
        r1 = r14.Q;
        r4 = 2131624059; // 0x7f0e007b float:1.8875287E38 double:1.0531622174E-314;
        r1.setText(r4);
        r1 = r15.e;
        r1 = r1.b;
        if (r1 == 0) goto L_0x0033;
    L_0x002a:
        r1 = r14.N;
        r4 = r14.O;
        r1.setOnClickListener(r4);
        if (r3 == 0) goto L_0x0038;
    L_0x0033:
        r1 = r14.N;
        r1.setOnClickListener(r10);
    L_0x0038:
        r1 = r14.Q;
        r4 = r14.M;
        r1.setOnClickListener(r4);
        r4 = r14.W;
        r6 = r0.progress;
        r8 = 0;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 != 0) goto L_0x0271;
    L_0x0049:
        r1 = 1;
    L_0x004a:
        r4.setIndeterminate(r1);
        r1 = r14.W;
        r4 = r0.progress;
        r4 = (int) r4;
        r1.setProgress(r4);
        if (r3 == 0) goto L_0x0127;
    L_0x0057:
        r1 = r0.transferred;
        if (r1 != 0) goto L_0x006f;
    L_0x005b:
        r1 = r15.l;
        if (r1 == 0) goto L_0x00a0;
    L_0x005f:
        r1 = r15.e;
        r1 = r1.b;
        if (r1 == 0) goto L_0x00a0;
    L_0x0065:
        r1 = r15.e;
        r1 = r1.c;
        r1 = com.whatsapp.m8.b(r1);
        if (r1 != 0) goto L_0x00a0;
    L_0x006f:
        r1 = com.whatsapp.cb.a(r15);
        if (r1 == 0) goto L_0x007c;
    L_0x0075:
        r1 = r14.Q;
        r1.setText(r13);
        if (r3 == 0) goto L_0x0084;
    L_0x007c:
        r1 = r14.Q;
        r4 = 2131624681; // 0x7f0e02e9 float:1.8876549E38 double:1.0531625247E-314;
        r1.setText(r4);
    L_0x0084:
        r1 = r14.N;
        r4 = r14.H;
        r1.setOnLongClickListener(r4);
        r1 = r14.W;
        r1.setVisibility(r11);
        r1 = r14.Q;
        r4 = r14.O;
        r1.setOnClickListener(r4);
        r1 = r14.N;
        r4 = r14.O;
        r1.setOnClickListener(r4);
        if (r3 == 0) goto L_0x0127;
    L_0x00a0:
        r1 = r15.e;
        r1 = r1.b;
        if (r1 != 0) goto L_0x00d5;
    L_0x00a6:
        r1 = r14.Q;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = r14.getContext();
        r6 = 2131624174; // 0x7f0e00ee float:1.887552E38 double:1.053162274E-314;
        r5 = r5.getString(r6);
        r4 = r4.append(r5);
        r5 = " ";
        r4 = r4.append(r5);
        r5 = com.whatsapp.App.p;
        r6 = r15.k;
        r5 = android.text.format.Formatter.formatShortFileSize(r5, r6);
        r4 = r4.append(r5);
        r4 = r4.toString();
        r1.setText(r4);
    L_0x00d5:
        r1 = r14.W;
        r1.setVisibility(r11);
        r1 = r14.N;
        r4 = r14.H;
        r1.setOnLongClickListener(r4);
        r1 = r15.e;
        r1 = r1.b;
        if (r1 == 0) goto L_0x0119;
    L_0x00e7:
        if (r0 == 0) goto L_0x0119;
    L_0x00e9:
        r1 = r0.file;
        if (r1 == 0) goto L_0x0119;
    L_0x00ed:
        r1 = com.whatsapp.cb.a(r15);
        if (r1 == 0) goto L_0x0101;
    L_0x00f3:
        r1 = r14.Q;
        r1.setText(r13);
        r1 = r14.Q;
        r4 = r14.O;
        r1.setOnClickListener(r4);
        if (r3 == 0) goto L_0x0110;
    L_0x0101:
        r1 = r14.Q;
        r4 = 2131624799; // 0x7f0e035f float:1.8876788E38 double:1.053162583E-314;
        r1.setText(r4);
        r1 = r14.Q;
        r4 = r14.J;
        r1.setOnClickListener(r4);
    L_0x0110:
        r1 = r14.N;
        r4 = r14.O;
        r1.setOnClickListener(r4);
        if (r3 == 0) goto L_0x0127;
    L_0x0119:
        r1 = r14.Q;
        r4 = r14.K;
        r1.setOnClickListener(r4);
        r1 = r14.N;
        r4 = r14.K;
        r1.setOnClickListener(r4);
    L_0x0127:
        r14.setOnClickListener(r10);
        r1 = com.whatsapp.cb.a(r15);
        if (r1 == 0) goto L_0x015c;
    L_0x0130:
        r1 = r14.P;
        r4 = new com.whatsapp.ex;
        r5 = r14.getContext();
        r6 = r14.getContext();
        r6 = com.whatsapp.util.b0.e(r6);
        r7 = r15.e;
        r7 = r7.b;
        r4.<init>(r5, r6, r7);
        r1.setImageDrawable(r4);
        r1 = r14.R;
        r4 = -9801869; // 0xffffffffff6a6f73 float:-3.1161803E38 double:NaN;
        r1.setTextColor(r4);
        r1 = r14.R;
        r4 = 2130838937; // 0x7f020599 float:1.728287E38 double:1.0527743156E-314;
        r1.setCompoundDrawablesWithIntrinsicBounds(r4, r2, r2, r2);
        if (r3 == 0) goto L_0x019d;
    L_0x015c:
        r1 = com.whatsapp.util.bo.b(r15);
        if (r1 == 0) goto L_0x0176;
    L_0x0162:
        r4 = r14.P;
        r5 = new com.whatsapp.ex;
        r6 = r14.getContext();
        r7 = r15.e;
        r7 = r7.b;
        r5.<init>(r6, r1, r7);
        r4.setImageDrawable(r5);
        if (r3 == 0) goto L_0x0190;
    L_0x0176:
        r1 = r14.P;
        r4 = new com.whatsapp.ex;
        r5 = r14.getContext();
        r6 = r14.getContext();
        r6 = com.whatsapp.util.b0.c(r6);
        r7 = r15.e;
        r7 = r7.b;
        r4.<init>(r5, r6, r7);
        r1.setImageDrawable(r4);
    L_0x0190:
        r1 = r14.R;
        r1.setTextColor(r12);
        r1 = r14.R;
        r4 = 2130838936; // 0x7f020598 float:1.7282868E38 double:1.052774315E-314;
        r1.setCompoundDrawablesWithIntrinsicBounds(r4, r2, r2, r2);
    L_0x019d:
        r1 = r15.p;
        if (r1 != 0) goto L_0x01ab;
    L_0x01a1:
        if (r0 == 0) goto L_0x01ab;
    L_0x01a3:
        r1 = r0.file;
        r1 = com.whatsapp.util.f.b(r1);
        r15.p = r1;
    L_0x01ab:
        r1 = r15.p;
        if (r1 == 0) goto L_0x01b8;
    L_0x01af:
        r1 = r15.p;
        r4 = (long) r1;
        r1 = android.text.format.DateUtils.formatElapsedTime(r4);
        if (r3 == 0) goto L_0x01c0;
    L_0x01b8:
        r1 = com.whatsapp.App.p;
        r4 = r15.k;
        r1 = android.text.format.Formatter.formatShortFileSize(r1, r4);
    L_0x01c0:
        r4 = r14.R;
        r4.setText(r1);
        r1 = r14.R;
        r1.setVisibility(r2);
        r1 = r15.e;
        r1 = r1.b;
        if (r1 != 0) goto L_0x01d4;
    L_0x01d0:
        r0 = r0.transferred;
        if (r0 == 0) goto L_0x025d;
    L_0x01d4:
        r0 = r14.V;
        if (r0 != 0) goto L_0x0204;
    L_0x01d8:
        r0 = 2131427718; // 0x7f0b0186 float:1.847706E38 double:1.053065212E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r1 = new com.whatsapp.WaveformVisualizerView;
        r4 = r14.getContext();
        r1.<init>(r4);
        r14.V = r1;
        r1 = r14.V;
        r4 = r14.R;
        r4 = r4.getTextSize();
        r4 = (int) r4;
        r5 = r14.R;
        r5 = r5.getTextSize();
        r5 = (int) r5;
        r1.setPadding(r2, r4, r2, r5);
        r1 = r14.V;
        r0.addView(r1, r12, r12);
    L_0x0204:
        r0 = com.whatsapp.cb.a(r15);
        if (r0 != 0) goto L_0x0240;
    L_0x020a:
        r0 = r14.U;
        if (r0 != 0) goto L_0x021d;
    L_0x020e:
        r1 = new com.whatsapp.cb;
        r0 = r14.getContext();
        r0 = (android.app.Activity) r0;
        r1.<init>(r0);
        r14.U = r1;
        if (r3 == 0) goto L_0x0234;
    L_0x021d:
        r0 = r14.U;
        r0.a(r10);
        r0 = r14.U;
        r0.a(r10);
        r1 = new com.whatsapp.cb;
        r0 = r14.getContext();
        r0 = (android.app.Activity) r0;
        r1.<init>(r0);
        r14.U = r1;
    L_0x0234:
        r0 = r14.U;
        r0.b(r15);
        r0 = r14.V;
        r0.setVisibility(r11);
        if (r3 == 0) goto L_0x0249;
    L_0x0240:
        r0 = com.whatsapp.cb.n;
        r14.U = r0;
        r0 = r14.V;
        r0.setVisibility(r2);
    L_0x0249:
        r0 = r14.U;
        r1 = new com.whatsapp.my;
        r1.<init>(r14);
        r0.a(r1);
        r0 = r14.U;
        r1 = new com.whatsapp.ud;
        r1.<init>(r14, r15);
        r0.a(r1);
    L_0x025d:
        r0 = aU;
        if (r0 == 0) goto L_0x0270;
    L_0x0261:
        r0 = aU;
        r1 = r15.e;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0270;
    L_0x026b:
        aU = r10;
        r14.b(r15);
    L_0x0270:
        return;
    L_0x0271:
        r1 = r2;
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowAudio.c(com.whatsapp.protocol.b):void");
    }

    public void a(b bVar, boolean z) {
        if (bVar != this.w || z) {
            c(bVar);
        }
        super.a(bVar, z);
    }

    public ConversationRowAudio(Context context, b bVar) {
        super(context, bVar);
        this.T = -1;
        this.S = -9801869;
        this.O = new rz(this);
        this.Q = (TextView) findViewById(R.id.control_btn);
        this.P = (ImageView) findViewById(R.id.thumb);
        this.N = (Button) findViewById(R.id.thumb_button);
        this.W = (ProgressBar) findViewById(R.id.progress_bar);
        this.R = (TextView) findViewById(R.id.title);
        this.N.setBackgroundDrawable(new bd(context.getResources().getDrawable(bVar.e.b ? R.drawable.media_overlay_outgoing : R.drawable.media_overlay_incoming)));
        this.W.setMax(100);
        c(bVar);
    }

    static cb f(ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.U;
    }

    static WaveformVisualizerView e(ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.V;
    }

    static TextView a(ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.R;
    }

    static OnClickListener b(ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.O;
    }

    protected int l() {
        return R.layout.conversation_row_media_right;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void b(com.whatsapp.protocol.b r8) {
        /*
        r7_this = this;
        r6 = 1;
        r2 = 0;
        r3 = com.whatsapp.App.az;
        r0 = r8.A;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r8.e;
        r1 = r1.b;
        if (r1 != 0) goto L_0x0013;
    L_0x000e:
        r1 = r0.transferred;
        if (r1 != 0) goto L_0x0013;
    L_0x0012:
        return;
    L_0x0013:
        r1 = r0.file;
        if (r1 == 0) goto L_0x017b;
    L_0x0017:
        r1 = r0.file;
        r1 = android.net.Uri.fromFile(r1);
        r4 = new java.io.File;
        r1 = r1.getPath();
        r4.<init>(r1);
        r1 = r4.exists();
    L_0x002a:
        if (r1 != 0) goto L_0x00af;
    L_0x002c:
        r0 = r7.getContext();
        r0 = r0 instanceof com.whatsapp.ho;
        if (r0 == 0) goto L_0x006b;
    L_0x0034:
        r0 = r7.getContext();
        r0 = (com.whatsapp.ho) r0;
        r1 = android.os.Environment.getExternalStorageState();
        r4 = ab;
        r5 = 16;
        r4 = r4[r5];
        r4 = r1.equals(r4);
        if (r4 != 0) goto L_0x0063;
    L_0x004a:
        r4 = ab;
        r5 = 2;
        r4 = r4[r5];
        r1 = r1.equals(r4);
        if (r1 != 0) goto L_0x0063;
    L_0x0055:
        r1 = com.whatsapp.App.aT();
        if (r1 == 0) goto L_0x00ab;
    L_0x005b:
        r1 = 2131624582; // 0x7f0e0286 float:1.8876348E38 double:1.053162476E-314;
    L_0x005e:
        r0.a(r1);
        if (r3 == 0) goto L_0x0069;
    L_0x0063:
        r1 = 2131624348; // 0x7f0e019c float:1.8875873E38 double:1.05316236E-314;
        r0.a(r1);
    L_0x0069:
        if (r3 == 0) goto L_0x0012;
    L_0x006b:
        r0 = new android.content.Intent;
        r1 = r7.getContext();
        r3 = com.whatsapp.MediaGallery.class;
        r0.<init>(r1, r3);
        r1 = ab;
        r1 = r1[r2];
        r2 = -1;
        r0.putExtra(r1, r2);
        r1 = ab;
        r2 = 13;
        r1 = r1[r2];
        r0.putExtra(r1, r6);
        r1 = ab;
        r2 = 9;
        r1 = r1[r2];
        r2 = r8.e;
        r2 = r2.c;
        r0.putExtra(r1, r2);
        r1 = ab;
        r2 = 7;
        r1 = r1[r2];
        r2 = r8.e;
        r2 = r2.hashCode();
        r0.putExtra(r1, r2);
        r1 = r7.getContext();
        r1.startActivity(r0);
        goto L_0x0012;
    L_0x00ab:
        r1 = 2131624583; // 0x7f0e0287 float:1.887635E38 double:1.0531624763E-314;
        goto L_0x005e;
    L_0x00af:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = ab;
        r4 = 11;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = r8.e;
        r2 = r2.b;
        r1 = r1.append(r2);
        r2 = ab;
        r4 = 14;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = r8.j;
        r1 = r1.append(r2);
        r2 = ab;
        r4 = 10;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = r8.H;
        r1 = r1.append(r2);
        r2 = ab;
        r4 = 15;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = r8.t;
        r1 = r1.append(r2);
        r2 = ab;
        r4 = 8;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = r0.file;
        r1 = r1.append(r2);
        r2 = ab;
        r2 = r2[r6];
        r1 = r1.append(r2);
        r4 = r0.progress;
        r1 = r1.append(r4);
        r2 = ab;
        r4 = 12;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = r0.transferred;
        r1 = r1.append(r2);
        r2 = ab;
        r4 = 5;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r2 = r0.transferring;
        r1 = r1.append(r2);
        r2 = ab;
        r4 = 3;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r4 = r0.fileSize;
        r0 = r1.append(r4);
        r1 = ab;
        r2 = 4;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r4 = r8.k;
        r0 = r0.append(r4);
        r1 = ab;
        r2 = 6;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r4 = r8.D;
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.cb.a(r8);
        if (r0 == 0) goto L_0x0174;
    L_0x016d:
        r0 = r7.U;
        r0.o();
        if (r3 == 0) goto L_0x0012;
    L_0x0174:
        r0 = r7.U;
        r0.r();
        goto L_0x0012;
    L_0x017b:
        r1 = r2;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowAudio.b(com.whatsapp.protocol.b):void");
    }
}
