package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.bf;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class ConversationRowVideo extends ConversationRowMedia {
    private static Handler S;
    private static final String[] ab;
    private final TextView N;
    private final CircularProgressBar O;
    private final TextView P;
    private bf Q;
    private final View R;
    private cl T;
    private final TextView U;
    private final View V;
    private final ImageView W;

    public class RowVideoView extends ImageView {
        private Shader a;
        private Paint b;
        private Shader c;
        private Shader d;
        private Shader e;
        private RectF f;

        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            float f = am1.a().g * 24.0f;
            this.c = new LinearGradient(0.0f, ((float) i2) - (2.0f * f), 0.0f, ((float) i2) - ((3.0f * f) / 4.0f), -16777216, 0, TileMode.CLAMP);
            this.a = new LinearGradient(0.0f, ((float) i2) - (2.0f * f), 0.0f, ((float) i2) - ((3.0f * f) / 4.0f), -1712062488, 0, TileMode.CLAMP);
            this.d = new LinearGradient(0.0f, ((float) i2) - (2.0f * f), 0.0f, ((float) i2) - ((3.0f * f) / 4.0f), -1724697805, 0, TileMode.CLAMP);
            this.e = new LinearGradient(0.0f, ((float) i2) - ((4.0f * f) / 3.0f), 0.0f, (float) i2, 0, -16777216, TileMode.CLAMP);
        }

        public void onDraw(Canvas canvas) {
            int i = App.az;
            super.onDraw(canvas);
            float f = 24.0f * am1.a().g;
            float height = ((float) getHeight()) - f;
            int width = getWidth();
            float f2 = am1.a().g * 30.0f;
            int i2 = (int) (height / f2);
            float f3 = height / ((float) i2);
            this.f.set(0.0f, 0.0f, f2, (float) getHeight());
            this.b.setColor(1711276032);
            this.b.setStyle(Style.FILL);
            this.b.setShader(this.c);
            canvas.drawRect(this.f, this.b);
            this.f.set(((float) width) - f2, 0.0f, (float) width, (float) getHeight());
            canvas.drawRect(this.f, this.b);
            this.b.setShader(this.a);
            height = 0.0f;
            while (height < ((float) i2)) {
                float f4 = height * f3;
                this.f.set(f2 / 4.0f, ((f3 / 2.0f) + f4) - (f2 / 4.0f), (3.0f * f2) / 4.0f, (f4 + (f3 / 2.0f)) + (f2 / 4.0f));
                this.b.setColor(-1712062488);
                this.b.setStyle(Style.FILL);
                canvas.drawRoundRect(this.f, f2 / 12.0f, f2 / 12.0f, this.b);
                this.f.offset(((float) width) - f2, 0.0f);
                this.b.setColor(-1712062488);
                this.b.setStyle(Style.FILL);
                canvas.drawRoundRect(this.f, f2 / 12.0f, f2 / 12.0f, this.b);
                height += 1.0f;
                if (i != 0) {
                    break;
                }
            }
            this.b.setShader(this.d);
            height = 0.0f;
            while (height < ((float) i2)) {
                f4 = height * f3;
                this.f.set(f2 / 4.0f, ((f3 / 2.0f) + f4) - (f2 / 4.0f), (3.0f * f2) / 4.0f, (f4 + (f3 / 2.0f)) + (f2 / 4.0f));
                this.b.setColor(-1724697805);
                this.b.setStyle(Style.STROKE);
                this.b.setStrokeWidth(f2 / 32.0f);
                canvas.drawRoundRect(this.f, f2 / 12.0f, f2 / 12.0f, this.b);
                this.f.offset(((float) width) - f2, 0.0f);
                this.b.setColor(-1724697805);
                this.b.setStyle(Style.STROKE);
                this.b.setStrokeWidth(f2 / 32.0f);
                canvas.drawRoundRect(this.f, f2 / 12.0f, f2 / 12.0f, this.b);
                height += 1.0f;
                if (i != 0) {
                    break;
                }
            }
            this.b.setColor(1711276032);
            this.b.setShader(this.e);
            this.b.setStyle(Style.FILL);
            this.f.set(0.0f, ((float) getHeight()) - ((f * 4.0f) / 3.0f), (float) width, (float) getHeight());
            canvas.drawRect(this.f, this.b);
        }

        public RowVideoView(Context context) {
            super(context);
            this.b = new Paint(1);
            this.f = new RectF();
        }

        protected void onMeasure(int i, int i2) {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int min = (Math.min(decorView.getWidth(), decorView.getHeight()) * 70) / 100;
            super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), MeasureSpec.makeMeasureSpec(min, 1073741824));
        }

        public RowVideoView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Paint(1);
            this.f = new RectF();
        }

        public RowVideoView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.b = new Paint(1);
            this.f = new RectF();
        }
    }

    static {
        String[] strArr = new String[15];
        String str = ")5\u001aT:z'\rG&l%R";
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
                        i3 = 9;
                        break;
                    case ay.f /*1*/:
                        i3 = 65;
                        break;
                    case ay.n /*2*/:
                        i3 = 104;
                        break;
                    case ay.p /*3*/:
                        i3 = 53;
                        break;
                    default:
                        i3 = 84;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ")4\u001aYn";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = ")5\u0001X1z5\tX$3";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "c(\f";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "b$\u0011";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ")'\u0001Y13";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u007f(\rB9l2\u001bT3lnHS&f,7X13";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "),\rQ=h\u001e\u001b\\.l{";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    str = "y.\u001b";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = ")5\u001aT:z'\rG&`/\u000f\u000f";
                    obj = 9;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ")1\u001aZ3{$\u001bFn";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ")5\u0011E13";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ")/\tX13";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ")'\u0001Y1Z(\u0012Pn";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    ab = strArr3;
                default:
                    strArr2[i] = str;
                    str = "h-\rG ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (S != null && this.T == null) {
            this.T = new cl(this, (MediaData) this.w.A);
            S.postDelayed(this.T, 2000);
        }
    }

    protected int l() {
        return R.layout.conversation_row_video_right;
    }

    static ImageView a(ConversationRowVideo conversationRowVideo) {
        return conversationRowVideo.W;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(com.whatsapp.protocol.b r12) {
        /*
        r11_this = this;
        r10 = 2130838938; // 0x7f02059a float:1.7282872E38 double:1.052774316E-314;
        r9 = 0;
        r8 = 8;
        r3 = 0;
        r4 = com.whatsapp.App.az;
        r0 = r12.A;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r11.N;
        r1.setVisibility(r8);
        r1 = r0.transferring;
        if (r1 == 0) goto L_0x0079;
    L_0x0016:
        r1 = r11.V;
        r1.setVisibility(r3);
        r1 = r11.O;
        r1.setVisibility(r3);
        r1 = r11.R;
        r1.setVisibility(r3);
        r1 = r11.P;
        r2 = "";
        r1.setText(r2);
        r1 = r11.P;
        r1.setVisibility(r8);
        r1 = r12.e;
        r1 = r1.b;
        if (r1 == 0) goto L_0x003e;
    L_0x0037:
        r1 = r11.L;
        r11.setOnClickListener(r1);
        if (r4 == 0) goto L_0x0041;
    L_0x003e:
        r11.setOnClickListener(r9);
    L_0x0041:
        r1 = r11.P;
        r2 = r11.M;
        r1.setOnClickListener(r2);
        r1 = r11.O;
        r2 = r11.M;
        r1.setOnClickListener(r2);
        r6 = r0.progress;
        r1 = (int) r6;
        r2 = r0.transcoder;
        if (r2 == 0) goto L_0x006a;
    L_0x0056:
        r2 = r0.transcoder;
        r2 = r2.b();
        if (r2 == 0) goto L_0x006a;
    L_0x005e:
        r2 = r0.uploader;
        if (r2 != 0) goto L_0x0066;
    L_0x0062:
        r1 = r1 / 2;
        if (r4 == 0) goto L_0x006a;
    L_0x0066:
        r1 = r1 / 2;
        r1 = r1 + 50;
    L_0x006a:
        r5 = r11.O;
        if (r1 != 0) goto L_0x01f3;
    L_0x006e:
        r2 = 1;
    L_0x006f:
        r5.setIndeterminate(r2);
        r2 = r11.O;
        r2.setProgress(r1);
        if (r4 == 0) goto L_0x0122;
    L_0x0079:
        r1 = r0.transferred;
        if (r1 != 0) goto L_0x0091;
    L_0x007d:
        r1 = r12.l;
        if (r1 == 0) goto L_0x00c0;
    L_0x0081:
        r1 = r12.e;
        r1 = r1.b;
        if (r1 == 0) goto L_0x00c0;
    L_0x0087:
        r1 = r12.e;
        r1 = r1.c;
        r1 = com.whatsapp.m8.b(r1);
        if (r1 != 0) goto L_0x00c0;
    L_0x0091:
        r1 = r11.V;
        r1.setVisibility(r8);
        r1 = r11.P;
        r2 = 2131624681; // 0x7f0e02e9 float:1.8876549E38 double:1.0531625247E-314;
        r1.setText(r2);
        r1 = r11.P;
        r1.setVisibility(r8);
        r1 = r11.O;
        r1.setVisibility(r8);
        r1 = r11.R;
        r1.setVisibility(r8);
        r1 = r11.H;
        r11.setOnLongClickListener(r1);
        r1 = r11.P;
        r2 = r11.L;
        r1.setOnClickListener(r2);
        r1 = r11.L;
        r11.setOnClickListener(r1);
        if (r4 == 0) goto L_0x0122;
    L_0x00c0:
        r1 = r11.V;
        r1.setVisibility(r3);
        r1 = r11.O;
        r1.setVisibility(r8);
        r1 = r11.R;
        r1.setVisibility(r8);
        r1 = r11.P;
        r1.setVisibility(r3);
        r1 = r11.H;
        r11.setOnLongClickListener(r1);
        r1 = r12.e;
        r1 = r1.b;
        if (r1 == 0) goto L_0x0101;
    L_0x00df:
        r1 = r0.file;
        if (r1 == 0) goto L_0x0101;
    L_0x00e3:
        r1 = r11.P;
        r2 = 2131624799; // 0x7f0e035f float:1.8876788E38 double:1.053162583E-314;
        r1.setText(r2);
        r1 = r11.P;
        r2 = 2130837739; // 0x7f0200eb float:1.728044E38 double:1.0527737237E-314;
        r1.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r3, r3);
        r1 = r11.P;
        r2 = r11.J;
        r1.setOnClickListener(r2);
        r1 = r11.L;
        r11.setOnClickListener(r1);
        if (r4 == 0) goto L_0x0122;
    L_0x0101:
        r1 = r11.P;
        r2 = com.whatsapp.App.p;
        r6 = r12.k;
        r2 = android.text.format.Formatter.formatShortFileSize(r2, r6);
        r1.setText(r2);
        r1 = r11.P;
        r2 = 2130837695; // 0x7f0200bf float:1.7280351E38 double:1.052773702E-314;
        r1.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r3, r3);
        r1 = r11.P;
        r2 = r11.K;
        r1.setOnClickListener(r2);
        r1 = r11.K;
        r11.setOnClickListener(r1);
    L_0x0122:
        r1 = r11.W;
        r2 = r11.Q;
        com.whatsapp.util.bo.a(r12, r1, r2);
        r1 = S;
        if (r1 == 0) goto L_0x014d;
    L_0x012d:
        r1 = r11.T;
        if (r1 == 0) goto L_0x013d;
    L_0x0131:
        r1 = S;
        r2 = r11.T;
        r1.removeCallbacks(r2);
        r1 = r11.T;
        r1.a();
    L_0x013d:
        r1 = new com.whatsapp.cl;
        r1.<init>(r11, r0);
        r11.T = r1;
        r1 = S;
        r2 = r11.T;
        r6 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r1.postDelayed(r2, r6);
    L_0x014d:
        r1 = r12.p;
        if (r1 != 0) goto L_0x0159;
    L_0x0151:
        r0 = r0.file;
        r0 = com.whatsapp.util.f.b(r0);
        r12.p = r0;
    L_0x0159:
        r0 = r12.p;
        if (r0 == 0) goto L_0x0166;
    L_0x015d:
        r0 = r12.p;
        r0 = (long) r0;
        r0 = android.text.format.DateUtils.formatElapsedTime(r0);
        if (r4 == 0) goto L_0x016e;
    L_0x0166:
        r0 = com.whatsapp.App.p;
        r6 = r12.k;
        r0 = android.text.format.Formatter.formatShortFileSize(r0, r6);
    L_0x016e:
        r1 = r11.N;
        r1.setText(r0);
        r0 = r11.N;
        r0.setVisibility(r3);
        r0 = com.whatsapp.App.as();
        if (r0 == 0) goto L_0x0185;
    L_0x017e:
        r0 = r11.N;
        r0.setCompoundDrawablesWithIntrinsicBounds(r10, r3, r3, r3);
        if (r4 == 0) goto L_0x019b;
    L_0x0185:
        r0 = r11.N;
        r1 = new com.whatsapp.util.bd;
        r2 = r11.getContext();
        r2 = r2.getResources();
        r2 = r2.getDrawable(r10);
        r1.<init>(r2);
        r0.setCompoundDrawablesWithIntrinsicBounds(r9, r9, r1, r9);
    L_0x019b:
        r0 = r11.y;
        if (r0 == 0) goto L_0x01c2;
    L_0x019f:
        r0 = r12.l;
        if (r0 == 0) goto L_0x01bd;
    L_0x01a3:
        r0 = r12.e;
        r0 = r0.b;
        if (r0 == 0) goto L_0x01bd;
    L_0x01a9:
        r0 = r12.e;
        r0 = r0.c;
        r0 = com.whatsapp.m8.d(r0);
        if (r0 != 0) goto L_0x01bd;
    L_0x01b3:
        r0 = r11.y;
        r1 = 2130837687; // 0x7f0200b7 float:1.7280335E38 double:1.052773698E-314;
        r0.setCompoundDrawablesWithIntrinsicBounds(r1, r3, r3, r3);
        if (r4 == 0) goto L_0x01c2;
    L_0x01bd:
        r0 = r11.y;
        r0.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r3, r3);
    L_0x01c2:
        r0 = r12.v;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x01da;
    L_0x01ca:
        r0 = r11.U;
        r0.setVisibility(r3);
        r1 = r12.v;
        r0 = r11.U;
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        com.whatsapp.ConversationRowText.setMessageText(r1, r0, r3, r12);
        if (r4 == 0) goto L_0x01df;
    L_0x01da:
        r0 = r11.U;
        r0.setVisibility(r8);
    L_0x01df:
        r0 = aU;
        if (r0 == 0) goto L_0x01f2;
    L_0x01e3:
        r0 = aU;
        r1 = r12.e;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x01f2;
    L_0x01ed:
        aU = r9;
        r11.b(r12);
    L_0x01f2:
        return;
    L_0x01f3:
        r2 = r3;
        goto L_0x006f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowVideo.c(com.whatsapp.protocol.b):void");
    }

    static cl b(ConversationRowVideo conversationRowVideo) {
        return conversationRowVideo.T;
    }

    static cl a(ConversationRowVideo conversationRowVideo, cl clVar) {
        conversationRowVideo.T = clVar;
        return clVar;
    }

    static Handler a() {
        return S;
    }

    public ConversationRowVideo(Context context, b bVar) {
        super(context, bVar);
        this.Q = new ano(this);
        this.P = (TextView) findViewById(R.id.control_btn);
        this.W = (ImageView) findViewById(R.id.thumb);
        this.O = (CircularProgressBar) findViewById(R.id.progress_bar);
        this.N = (TextView) findViewById(R.id.info);
        this.R = findViewById(R.id.cancel_download);
        this.V = findViewById(R.id.control_frame);
        this.U = (TextView) findViewById(R.id.caption);
        this.O.setMax(100);
        if (S != null || VERSION.SDK_INT >= 11) {
            c(bVar);
        } else {
            c(bVar);
        }
    }

    protected void b(b bVar) {
        MediaData mediaData = (MediaData) bVar.A;
        if (bVar.e.b || mediaData.transferred) {
            boolean exists;
            if (mediaData.file != null) {
                exists = new File(Uri.fromFile(mediaData.file).getPath()).exists();
            } else {
                exists = false;
            }
            if (exists) {
                Log.i(ab[7] + bVar.e.b + ab[12] + bVar.j + ab[13] + bVar.H + ab[2] + bVar.t + ab[6] + mediaData.file + ab[11] + mediaData.progress + ab[0] + mediaData.transferred + ab[10] + mediaData.transferring + ab[14] + mediaData.fileSize + ab[8] + bVar.k + ab[3] + bVar.D);
                cb.j();
                getContext().startActivity(MediaView.a(bVar, bVar.e.c, getContext()));
                return;
            }
            Intent intent = new Intent(getContext(), MediaGallery.class);
            intent.putExtra(ab[9], -1);
            intent.putExtra(ab[1], true);
            intent.putExtra(ab[4], bVar.e.c);
            intent.putExtra(ab[5], bVar.e.hashCode());
            getContext().startActivity(intent);
        }
    }

    public void a(b bVar, boolean z) {
        if (bVar != this.w || z) {
            c(bVar);
        }
        super.a(bVar, z);
    }

    protected int d() {
        return R.layout.conversation_row_video_left;
    }

    public void g() {
        c(this.w);
        super.g();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected int a(int r5) {
        /*
        r4_this = this;
        r1 = 2130838964; // 0x7f0205b4 float:1.7282925E38 double:1.052774329E-314;
        r2 = com.whatsapp.App.az;
        r0 = 13;
        r0 = com.whatsapp.protocol.f.a(r5, r0);
        if (r0 < 0) goto L_0x0012;
    L_0x000d:
        r0 = 2130838958; // 0x7f0205ae float:1.7282913E38 double:1.052774326E-314;
        if (r2 == 0) goto L_0x002b;
    L_0x0012:
        r0 = 5;
        r0 = com.whatsapp.protocol.f.a(r5, r0);
        if (r0 < 0) goto L_0x001e;
    L_0x0019:
        r0 = 2130838962; // 0x7f0205b2 float:1.7282921E38 double:1.052774328E-314;
        if (r2 == 0) goto L_0x002b;
    L_0x001e:
        r0 = 4;
        r0 = com.whatsapp.protocol.f.a(r5, r0);
        if (r0 != 0) goto L_0x002a;
    L_0x0025:
        r0 = 2130838960; // 0x7f0205b0 float:1.7282917E38 double:1.052774327E-314;
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowVideo.a(int):int");
    }
}
