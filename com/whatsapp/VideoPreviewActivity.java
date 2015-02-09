package com.whatsapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.a6;
import com.whatsapp.util.bj;
import com.whatsapp.util.f;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class VideoPreviewActivity extends DialogToastActivity {
    private static final String[] J;
    private boolean A;
    private float B;
    private ImageButton C;
    private int D;
    private ee E;
    private ImageView F;
    private bj G;
    private ue H;
    private RangeSeekBar I;
    private boolean j;
    private ImageView k;
    private ConversationTextEntry l;
    private View m;
    private TextView n;
    private OnGlobalLayoutListener o;
    private long p;
    private TextView q;
    private FrameLayout r;
    private long s;
    private SeekBar t;
    private FrameLayout u;
    private File v;
    private VideoTimelineView w;
    private VideoView x;
    private long y;
    private TextView z;

    static {
        String[] strArr = new String[10];
        String str = "nZ@<8xRX1";
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
                        i3 = 8;
                        break;
                    case ay.f /*1*/:
                        i3 = 51;
                        break;
                    case ay.n /*2*/:
                        i3 = 44;
                        break;
                    case ay.p /*3*/:
                        i3 = 89;
                        break;
                    default:
                        i3 = 103;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "nZ@<8xRX1";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "|ZX5\u0002";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "~ZH<\bxAI/\u000emD\u0003:\u0015mRX<";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "~ZH<\bxAI/\u000emD\u0003=\u0002{G^6\u001e";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "~ZH<\bxAI/\u000emD\u0003>\u0002|EE=\u0002gGD,\nj";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "~ZH<\bxAI/\u000emD\u0003>\u0002|EE=\u0002gGD,\nj";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    str = "|ZX5\u0002";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "nZ@<8xRX1";
                    obj = 8;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    J = strArr3;
                default:
                    strArr2[i] = str;
                    str = "~ZH<\bxAI/\u000emD\u0003;\u0006l\u0013Z0\u0003m\\";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static long b(VideoPreviewActivity videoPreviewActivity, long j) {
        videoPreviewActivity.y = j;
        return j;
    }

    static ee f(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.E;
    }

    static File m(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.v;
    }

    private void a() {
        Intent intent = new Intent();
        intent.putExtra(J[0], this.v.getAbsolutePath());
        setResult(1, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        Log.i(J[4]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.m = b7.a(getLayoutInflater(), R.layout.video_preview, null, false);
        setContentView(this.m);
        this.v = new File(getIntent().getStringExtra(J[2]));
        Object stringExtra = getIntent().getStringExtra(J[3]);
        try {
            if (!TextUtils.isEmpty(stringExtra)) {
                getSupportActionBar().setTitle(a5.d(stringExtra, getBaseContext()));
            }
            try {
                this.G = new bj(this.v);
                this.F = (ImageView) findViewById(R.id.thumb);
                this.q = (TextView) findViewById(R.id.trim_info);
                this.n = (TextView) findViewById(R.id.size);
                this.z = (TextView) findViewById(R.id.duration);
                this.p = 0;
                this.y = this.G.c();
                this.D = Math.min(640, Math.max(this.G.e(), this.G.d()));
                this.s = this.G.c();
                long a = a(this.p, this.y);
                try {
                    if (a > ((long) ge.k) * 1048576) {
                        this.s = ((this.G.c() * ((long) ge.k)) * 1048576) / a;
                    }
                    try {
                        this.u = (FrameLayout) findViewById(R.id.range_bar_holder);
                        this.I = new RangeSeekBar(Long.valueOf(0), Long.valueOf(this.G.c()), Long.valueOf(this.s < this.G.c() ? this.s : 0), this);
                        if (this.s < this.G.c()) {
                            this.y = this.s;
                            this.I.setSelectedMaxValue(Long.valueOf(this.y));
                            a(this.p, this.y);
                        }
                        this.I.setSlowScrubStep(getResources().getDisplayMetrics().density * 72.0f);
                        this.I.setTopExtension((int) (getResources().getDisplayMetrics().density * 38.0f));
                        this.I.setOnRangeSeekBarChangeListener(new dk(this));
                        this.I.setNotifyWhileDragging(true);
                        this.u.addView(this.I);
                        this.r = (FrameLayout) findViewById(R.id.timeline_holder);
                        this.w = new VideoTimelineView(this);
                        this.w.setVideoFile(this.v);
                        this.r.addView(this.w);
                        Button button = (Button) findViewById(R.id.ok_btn);
                        button.setText(R.string.send_button);
                        button.setOnClickListener(new an_(this));
                        ((Button) findViewById(R.id.cancel_btn)).setOnClickListener(new am2(this));
                        this.x = (VideoView) findViewById(R.id.video);
                        findViewById(R.id.loading).setVisibility(0);
                        this.x.setOnPreparedListener(new a_v(this));
                        this.x.setVideoPath(this.v.getAbsolutePath());
                        this.x.requestFocus();
                        this.x.seekTo(1);
                        this.H = new ue(this);
                        this.H.setPriority(4);
                        this.H.start();
                        this.H.a(0);
                        this.t = (SeekBar) findViewById(R.id.seekbar);
                        this.t.setMax((int) this.G.c());
                        this.t.setOnSeekBarChangeListener(new tc(this));
                        this.k = (ImageView) findViewById(R.id.video_control);
                        OnClickListener com_whatsapp_amm = new amm(this);
                        findViewById(R.id.video_holder).setOnClickListener(com_whatsapp_amm);
                        this.k.setOnClickListener(com_whatsapp_amm);
                        this.C = (ImageButton) findViewById(R.id.emoji_picker_btn);
                        this.C.setOnClickListener(new wo(this));
                        this.l = (ConversationTextEntry) findViewById(R.id.caption);
                        this.l.setInputEnterDone(true);
                        this.l.setFilters(new InputFilter[]{new alk(160)});
                        this.l.setOnEditorActionListener(new f5(this));
                        this.l.addTextChangedListener(new uh(this, (TextView) findViewById(R.id.counter)));
                        this.E = new eo(this, this);
                        this.E.a(new xo(this));
                        this.m.getViewTreeObserver().addOnGlobalLayoutListener(this.o);
                    } catch (a6 e) {
                        throw e;
                    }
                } catch (a6 e2) {
                    throw e2;
                }
            } catch (a6 e3) {
                Log.e(J[1]);
                a();
            }
        } catch (a6 e22) {
            throw e22;
        }
    }

    static ue e(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.H;
    }

    static RangeSeekBar g(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.I;
    }

    static VideoView h(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.x;
    }

    static ImageView o(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.k;
    }

    static boolean b(VideoPreviewActivity videoPreviewActivity, boolean z) {
        videoPreviewActivity.j = z;
        return z;
    }

    static long n(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.y;
    }

    static ConversationTextEntry l(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.l;
    }

    static long a(VideoPreviewActivity videoPreviewActivity, long j, long j2) {
        return videoPreviewActivity.a(j, j2);
    }

    static boolean a(VideoPreviewActivity videoPreviewActivity, boolean z) {
        videoPreviewActivity.A = z;
        return z;
    }

    private void a(boolean z) {
        if (z && this.k.getVisibility() != 0) {
            this.k.setVisibility(0);
            this.n.setVisibility(0);
            this.z.setVisibility(0);
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            this.k.startAnimation(alphaAnimation);
            this.n.startAnimation(alphaAnimation);
            this.z.startAnimation(alphaAnimation);
            if (App.az == 0) {
                return;
            }
        }
        if (!z && this.k.getVisibility() != 8) {
            this.k.setVisibility(8);
            this.n.setVisibility(8);
            this.z.setVisibility(8);
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300);
            this.k.startAnimation(alphaAnimation);
            this.n.startAnimation(alphaAnimation);
            this.z.startAnimation(alphaAnimation);
        }
    }

    static boolean b(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.j;
    }

    static void c(VideoPreviewActivity videoPreviewActivity, boolean z) {
        videoPreviewActivity.a(z);
    }

    static long a(VideoPreviewActivity videoPreviewActivity, long j) {
        videoPreviewActivity.p = j;
        return j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r6, com.whatsapp.m8 r7, java.io.File r8) {
        /*
        r5 = 1;
        r4 = 0;
        r1 = new android.content.Intent;
        r0 = com.whatsapp.VideoPreviewActivity.class;
        r1.<init>(r6, r0);
        r0 = J;
        r2 = 9;
        r0 = r0[r2];
        r2 = r8.getAbsolutePath();
        r1.putExtra(r0, r2);
        r0 = r7.w();
        if (r0 == 0) goto L_0x002f;
    L_0x001c:
        r0 = 2131624364; // 0x7f0e01ac float:1.8875906E38 double:1.053162368E-314;
        r2 = new java.lang.Object[r5];
        r3 = r7.a(r6);
        r2[r4] = r3;
        r0 = r6.getString(r0, r2);
        r2 = com.whatsapp.App.az;
        if (r2 == 0) goto L_0x003e;
    L_0x002f:
        r0 = 2131624827; // 0x7f0e037b float:1.8876845E38 double:1.053162597E-314;
        r2 = new java.lang.Object[r5];
        r3 = r7.a(r6);
        r2[r4] = r3;
        r0 = r6.getString(r0, r2);
    L_0x003e:
        r2 = J;
        r3 = 8;
        r2 = r2[r3];
        r1.putExtra(r2, r0);
        r0 = 24;
        r6.startActivityForResult(r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoPreviewActivity.a(android.app.Activity, com.whatsapp.m8, java.io.File):void");
    }

    static ImageButton j(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.C;
    }

    public void onDestroy() {
        Log.i(J[5]);
        super.onDestroy();
        if (this.H != null) {
            this.H.interrupt();
            this.H = null;
        }
        if (this.m != null) {
            this.m.getViewTreeObserver().removeGlobalOnLayoutListener(this.o);
        }
    }

    static long c(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.p;
    }

    static boolean d(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.A;
    }

    static bj i(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.G;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long a(long r12, long r14) {
        /*
        r11_this = this;
        r4 = com.whatsapp.App.az;
        r0 = r14 - r12;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x00c0;
    L_0x000a:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r0;
    L_0x000d:
        r0 = 0;
        r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x0036;
    L_0x0013:
        r0 = r11.G;
        r0 = r0.c();
        r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x0036;
    L_0x001d:
        r0 = r11.v;
        r0 = r0.length();
        r5 = com.whatsapp.ge.k;
        r6 = (long) r5;
        r8 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r6 = r6 * r8;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 > 0) goto L_0x0036;
    L_0x002e:
        r0 = r11.v;
        r0 = r0.length();
        if (r4 == 0) goto L_0x00aa;
    L_0x0036:
        r0 = r11.v;
        r0 = com.whatsapp.id.c(r0);
        if (r0 == 0) goto L_0x009c;
    L_0x003e:
        r0 = r11.G;
        r0 = r0.f();
        if (r0 != 0) goto L_0x005e;
    L_0x0046:
        r0 = r11.v;
        r0 = com.whatsapp.id.b(r0);
        if (r0 == 0) goto L_0x005e;
    L_0x004e:
        r0 = r11.v;
        r0 = r0.length();
        r0 = r0 * r2;
        r5 = r11.G;
        r6 = r5.c();
        r0 = r0 / r6;
        if (r4 == 0) goto L_0x00aa;
    L_0x005e:
        r0 = r11.G;
        r5 = r0.e();
        r0 = r11.G;
        r6 = r0.d();
        if (r5 < r6) goto L_0x0073;
    L_0x006c:
        r1 = r11.D;
        r0 = r6 * r1;
        r0 = r0 / r5;
        if (r4 == 0) goto L_0x0078;
    L_0x0073:
        r0 = r11.D;
        r1 = r5 * r0;
        r1 = r1 / r6;
    L_0x0078:
        r5 = com.whatsapp.util.f.a(r1, r0, r2);
        r11.B = r5;
        r0 = r0 * r1;
        r0 = (float) r0;
        r1 = r11.B;
        r0 = r0 * r1;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r2 / r6;
        r1 = (float) r6;
        r0 = r0 * r1;
        r1 = 1090519040; // 0x41000000 float:8.0 double:5.38787994E-315;
        r0 = r0 / r1;
        r6 = 96000; // 0x17700 float:1.34525E-40 double:4.74303E-319;
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r2 / r8;
        r6 = r6 * r8;
        r8 = 8;
        r6 = r6 / r8;
        r1 = (float) r6;
        r0 = r0 + r1;
        r0 = (long) r0;
        if (r4 == 0) goto L_0x00aa;
    L_0x009c:
        r0 = r11.v;
        r0 = r0.length();
        r0 = r0 * r2;
        r4 = r11.G;
        r4 = r4.c();
        r0 = r0 / r4;
    L_0x00aa:
        r4 = r11.n;
        r5 = android.text.format.Formatter.formatShortFileSize(r11, r0);
        r4.setText(r5);
        r4 = r11.z;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 / r6;
        r2 = android.text.format.DateUtils.formatElapsedTime(r2);
        r4.setText(r2);
        return r0;
    L_0x00c0:
        r2 = r0;
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoPreviewActivity.a(long, long):long");
    }

    static TextView a(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.q;
    }

    public VideoPreviewActivity() {
        this.D = 640;
        this.B = 3.0f;
        this.o = new as2(this);
    }

    static SeekBar k(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.t;
    }

    static View p(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.m;
    }

    public Bitmap a(long j) {
        Bitmap frameAtTime;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(this.v.getAbsolutePath());
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(j);
        } catch (Exception e) {
            Log.e(J[6] + e.toString());
            frameAtTime = f.b(this.v.getAbsolutePath());
        } catch (NoSuchMethodError e2) {
            Log.e(J[7] + e2.toString());
            frameAtTime = f.b(this.v.getAbsolutePath());
        }
        mediaMetadataRetriever.release();
        return frameAtTime;
    }
}
