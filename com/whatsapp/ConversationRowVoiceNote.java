package com.whatsapp;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.u;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ConversationRowVoiceNote extends ConversationRow {
    private static fk P;
    private static u U;
    private static final String[] ab;
    private final SeekBar J;
    private final TextView K;
    private final TextView L;
    private OnClickListener M;
    private final ImageView N;
    private OnClickListener O;
    private OnClickListener Q;
    private final ImageButton R;
    private final ProgressBar S;
    private final ImageView T;
    private OnClickListener V;
    private final ImageView W;
    private cb X;

    ConversationRowVoiceNote(Context context, b bVar) {
        super(context, bVar);
        this.M = new pz(this);
        this.Q = new amy(this);
        this.V = new afn(this);
        this.O = new ah(this);
        this.R = (ImageButton) findViewById(R.id.control_btn);
        this.W = (ImageView) findViewById(R.id.picture);
        this.T = (ImageView) findViewById(R.id.picture_in_group);
        this.S = (ProgressBar) findViewById(R.id.progress_bar);
        this.J = (SeekBar) findViewById(R.id.audio_seekbar);
        this.L = (TextView) findViewById(R.id.description);
        this.K = (TextView) findViewById(R.id.duration);
        this.N = (ImageView) findViewById(R.id.mic_overlay);
        this.S.setMax(100);
        this.J.setOnSeekBarChangeListener(new fh(this));
        b(bVar);
    }

    protected int d() {
        return R.layout.conversation_voice_note_row_left;
    }

    protected int l() {
        return R.layout.conversation_voice_note_row_right;
    }

    static u b() {
        return U;
    }

    static TextView c(ConversationRowVoiceNote conversationRowVoiceNote) {
        return conversationRowVoiceNote.K;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.whatsapp.protocol.b r15) {
        /*
        r14_this = this;
        r13 = 0;
        r12 = 2130838972; // 0x7f0205bc float:1.7282941E38 double:1.052774333E-314;
        r11 = 2130838914; // 0x7f020582 float:1.7282824E38 double:1.052774304E-314;
        r10 = 8;
        r3 = 0;
        r4 = com.whatsapp.App.az;
        r0 = r15.A;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r14.W;
        r2 = r15.e;
        r2 = r2.b;
        if (r2 != 0) goto L_0x023f;
    L_0x0018:
        r1 = r14.k;
        if (r1 == 0) goto L_0x002a;
    L_0x001c:
        r1 = r14.T;
        r1.setVisibility(r3);
        r1 = r14.W;
        r1.setVisibility(r10);
        r1 = r14.T;
        if (r4 == 0) goto L_0x023f;
    L_0x002a:
        r1 = r14.T;
        r1.setVisibility(r10);
        r1 = r14.W;
        r1.setVisibility(r3);
        r1 = r14.W;
        r2 = r1;
    L_0x0037:
        r1 = r14.L;
        r1.setVisibility(r10);
        r1 = r14.J;
        r1.setVisibility(r10);
        r1 = r14.S;
        r1.setVisibility(r10);
        r1 = r14.k;
        if (r1 != 0) goto L_0x005a;
    L_0x004a:
        r1 = r15.e;
        r1 = r1.b;
        if (r1 != 0) goto L_0x005a;
    L_0x0050:
        r1 = 2131427726; // 0x7f0b018e float:1.8477076E38 double:1.053065216E-314;
        r1 = r14.findViewById(r1);
        r1.setPadding(r3, r3, r3, r3);
    L_0x005a:
        r1 = r15.p;
        if (r1 != 0) goto L_0x0066;
    L_0x005e:
        r1 = r0.file;
        r1 = com.whatsapp.util.f.b(r1);
        r15.p = r1;
    L_0x0066:
        r1 = r0.transferring;
        if (r1 == 0) goto L_0x009e;
    L_0x006a:
        r1 = r14.S;
        r1.setVisibility(r3);
        r5 = r14.S;
        r6 = r0.progress;
        r8 = 0;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 == 0) goto L_0x0081;
    L_0x0079:
        r6 = r0.progress;
        r8 = 100;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 != 0) goto L_0x022f;
    L_0x0081:
        r1 = 1;
    L_0x0082:
        r5.setIndeterminate(r1);
        r1 = r14.S;
        r6 = r0.progress;
        r5 = (int) r6;
        r1.setProgress(r5);
        r1 = r14.R;
        r5 = 2130838905; // 0x7f020579 float:1.7282806E38 double:1.0527743E-314;
        r1.setImageResource(r5);
        r1 = r14.R;
        r5 = r14.M;
        r1.setOnClickListener(r5);
        if (r4 == 0) goto L_0x01a7;
    L_0x009e:
        r1 = r0.transferred;
        if (r1 != 0) goto L_0x00b6;
    L_0x00a2:
        r1 = r15.l;
        if (r1 == 0) goto L_0x0169;
    L_0x00a6:
        r1 = r15.e;
        r1 = r1.b;
        if (r1 == 0) goto L_0x0169;
    L_0x00ac:
        r1 = r15.e;
        r1 = r1.c;
        r1 = com.whatsapp.m8.b(r1);
        if (r1 != 0) goto L_0x0169;
    L_0x00b6:
        r1 = r14.J;
        r1.setVisibility(r3);
        r1 = com.whatsapp.cb.a(r15);
        if (r1 != 0) goto L_0x0110;
    L_0x00c1:
        r1 = r14.R;
        r1.setImageResource(r11);
        r1 = r14.J;
        r5 = r15.p;
        r5 = r5 * 1000;
        r1.setMax(r5);
        r1 = U;
        r5 = r15.e;
        r1 = r1.get(r5);
        r1 = (java.lang.Integer) r1;
        r5 = r14.J;
        if (r1 == 0) goto L_0x0232;
    L_0x00dd:
        r1 = r1.intValue();
    L_0x00e1:
        r5.setProgress(r1);
        r1 = r14.X;
        if (r1 != 0) goto L_0x00f7;
    L_0x00e8:
        r5 = new com.whatsapp.cb;
        r1 = r14.getContext();
        r1 = (android.app.Activity) r1;
        r5.<init>(r1);
        r14.X = r5;
        if (r4 == 0) goto L_0x0109;
    L_0x00f7:
        r1 = r14.X;
        r1.a(r13);
        r5 = new com.whatsapp.cb;
        r1 = r14.getContext();
        r1 = (android.app.Activity) r1;
        r5.<init>(r1);
        r14.X = r5;
    L_0x0109:
        r1 = r14.X;
        r1.b(r15);
        if (r4 == 0) goto L_0x0156;
    L_0x0110:
        r1 = com.whatsapp.cb.n;
        r14.X = r1;
        r1 = r14.X;
        r1 = r1.k();
        if (r1 != 0) goto L_0x0138;
    L_0x011c:
        r1 = r14.R;
        r1.setImageResource(r11);
        r1 = U;
        r5 = r15.e;
        r1 = r1.get(r5);
        r1 = (java.lang.Integer) r1;
        r5 = r14.J;
        if (r1 == 0) goto L_0x0235;
    L_0x012f:
        r1 = r1.intValue();
    L_0x0133:
        r5.setProgress(r1);
        if (r4 == 0) goto L_0x014b;
    L_0x0138:
        r1 = r14.R;
        r5 = 2130838911; // 0x7f02057f float:1.7282818E38 double:1.0527743027E-314;
        r1.setImageResource(r5);
        r1 = r14.J;
        r5 = r14.X;
        r5 = r5.c();
        r1.setProgress(r5);
    L_0x014b:
        r1 = r14.J;
        r5 = r14.X;
        r5 = r5.f();
        r1.setMax(r5);
    L_0x0156:
        r1 = r14.X;
        r5 = new com.whatsapp.oc;
        r5.<init>(r14);
        r1.a(r5);
        r1 = r14.R;
        r5 = r14.Q;
        r1.setOnClickListener(r5);
        if (r4 == 0) goto L_0x01a7;
    L_0x0169:
        r1 = r14.L;
        r1.setVisibility(r3);
        r1 = r14.L;
        r3 = com.whatsapp.App.p;
        r6 = r15.k;
        r3 = android.text.format.Formatter.formatShortFileSize(r3, r6);
        r1.setText(r3);
        r1 = r15.e;
        r1 = r1.b;
        if (r1 == 0) goto L_0x0198;
    L_0x0181:
        if (r0 == 0) goto L_0x0198;
    L_0x0183:
        r0 = r0.file;
        if (r0 == 0) goto L_0x0198;
    L_0x0187:
        r0 = r14.R;
        r1 = 2130838917; // 0x7f020585 float:1.728283E38 double:1.0527743057E-314;
        r0.setImageResource(r1);
        r0 = r14.R;
        r1 = r14.O;
        r0.setOnClickListener(r1);
        if (r4 == 0) goto L_0x01a7;
    L_0x0198:
        r0 = r14.R;
        r1 = 2130838908; // 0x7f02057c float:1.7282812E38 double:1.0527743013E-314;
        r0.setImageResource(r1);
        r0 = r14.R;
        r1 = r14.V;
        r0.setOnClickListener(r1);
    L_0x01a7:
        r0 = r15.e;
        r0 = r0.b;
        if (r0 == 0) goto L_0x01c2;
    L_0x01ad:
        r0 = r15.a;
        if (r0 != r10) goto L_0x01b8;
    L_0x01b1:
        r0 = r14.N;
        r0.setImageResource(r12);
        if (r4 == 0) goto L_0x01dd;
    L_0x01b8:
        r0 = r14.N;
        r1 = 2130838965; // 0x7f0205b5 float:1.7282927E38 double:1.0527743294E-314;
        r0.setImageResource(r1);
        if (r4 == 0) goto L_0x01dd;
    L_0x01c2:
        r0 = r15.a;
        r1 = 9;
        if (r0 == r1) goto L_0x01ce;
    L_0x01c8:
        r0 = r15.a;
        r1 = 10;
        if (r0 != r1) goto L_0x01d5;
    L_0x01ce:
        r0 = r14.N;
        r0.setImageResource(r12);
        if (r4 == 0) goto L_0x01dd;
    L_0x01d5:
        r0 = r14.N;
        r1 = 2130838971; // 0x7f0205bb float:1.728294E38 double:1.0527743324E-314;
        r0.setImageResource(r1);
    L_0x01dd:
        r0 = r15.p;
        if (r0 == 0) goto L_0x01ea;
    L_0x01e1:
        r0 = r15.p;
        r0 = (long) r0;
        r0 = android.text.format.DateUtils.formatElapsedTime(r0);
        if (r4 == 0) goto L_0x01f2;
    L_0x01ea:
        r0 = com.whatsapp.App.p;
        r6 = r15.k;
        r0 = android.text.format.Formatter.formatShortFileSize(r0, r6);
    L_0x01f2:
        r1 = r14.K;
        r1.setText(r0);
        r0 = r15.e;
        r0 = r0.b;
        if (r0 == 0) goto L_0x020a;
    L_0x01fd:
        r0 = P;
        r1 = com.whatsapp.App.P;
        r1 = r1.d();
        r0.b(r1, r2);
        if (r4 == 0) goto L_0x021b;
    L_0x020a:
        r0 = r14.k;
        if (r0 == 0) goto L_0x0238;
    L_0x020e:
        r0 = r15.F;
    L_0x0210:
        r1 = P;
        r3 = com.whatsapp.App.P;
        r0 = r3.a(r0);
        r1.b(r0, r2);
    L_0x021b:
        r0 = aU;
        if (r0 == 0) goto L_0x022e;
    L_0x021f:
        r0 = aU;
        r1 = r15.e;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x022e;
    L_0x0229:
        aU = r13;
        r14.c(r15);
    L_0x022e:
        return;
    L_0x022f:
        r1 = r3;
        goto L_0x0082;
    L_0x0232:
        r1 = r3;
        goto L_0x00e1;
    L_0x0235:
        r1 = r3;
        goto L_0x0133;
    L_0x0238:
        r0 = r14.h;
        r0 = r0.e;
        r0 = r0.c;
        goto L_0x0210;
    L_0x023f:
        r2 = r1;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowVoiceNote.b(com.whatsapp.protocol.b):void");
    }

    public static void a() {
        U.clear();
    }

    public void g() {
        b(this.w);
        super.g();
    }

    public void a(String str) {
        int i = App.az;
        if (this.w.e.b) {
            if (str.equals(App.P.d().e)) {
                n();
                if (i == 0) {
                    return;
                }
            }
            return;
        }
        if (this.k) {
            if (str.equals(this.w.F)) {
                n();
                if (i == 0) {
                    return;
                }
            }
            return;
        }
        if (str.equals(this.w.e.c)) {
            n();
        }
    }

    static void a(ConversationRowVoiceNote conversationRowVoiceNote, b bVar) {
        conversationRowVoiceNote.c(bVar);
    }

    public void a(b bVar, boolean z) {
        if (bVar != this.w || z) {
            b(bVar);
        }
        super.a(bVar, z);
    }

    private void c(b bVar) {
        Log.i(ab[2] + bVar.e);
        MediaData mediaData = (MediaData) bVar.A;
        if (!mediaData.transferring) {
            if (!mediaData.transferred || mediaData.file == null || new File(Uri.fromFile(mediaData.file).getPath()).exists()) {
                Integer num = (Integer) U.get(bVar.e);
                if (num != null) {
                    this.X.b(num.intValue());
                }
                this.X.n();
                b(bVar);
            } else if (getContext() instanceof ho) {
                ho hoVar = (ho) getContext();
                String externalStorageState = Environment.getExternalStorageState();
                if (!(externalStorageState.equals(ab[1]) || externalStorageState.equals(ab[0]))) {
                    hoVar.a(App.aT() ? R.string.need_sd_card : R.string.need_sd_card_shared_storage);
                    if (App.az == 0) {
                        return;
                    }
                }
                hoVar.a(R.string.gallery_media_not_exist);
            }
        }
    }

    static {
        String[] strArr = new String[3];
        String str = "p ,\u007fHx+\u0006cS";
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
                        i3 = 29;
                        break;
                    case ay.f /*1*/:
                        i3 = 79;
                        break;
                    case ay.n /*2*/:
                        i3 = 89;
                        break;
                    case ay.p /*3*/:
                        i3 = 17;
                        break;
                    default:
                        i3 = 60;
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
                    str = "~ 7gYo<8eUr!+~Kk 0rYs -t\u0013k&<fQx<*p[xo";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    ab = strArr3;
                    U = new u(250);
                    P = new fk(App.p.getResources().getDimensionPixelSize(R.dimen.voice_note_avatar_size), App.p.getResources().getDimension(R.dimen.voice_note_avatar_radius));
                default:
                    strArr2[i] = str;
                    str = "p ,\u007fHx+";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static SeekBar b(ConversationRowVoiceNote conversationRowVoiceNote) {
        return conversationRowVoiceNote.J;
    }

    static cb a(ConversationRowVoiceNote conversationRowVoiceNote) {
        return conversationRowVoiceNote.X;
    }

    static ImageButton d(ConversationRowVoiceNote conversationRowVoiceNote) {
        return conversationRowVoiceNote.R;
    }
}
