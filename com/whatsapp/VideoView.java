package com.whatsapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController.MediaPlayerControl;
import java.util.Map;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class VideoView extends SurfaceView implements MediaPlayerControl {
    private static final String[] B;
    private OnErrorListener A;
    private MediaPlayer a;
    private Uri b;
    private OnBufferingUpdateListener c;
    private String d;
    private OnErrorListener e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private boolean j;
    private OnCompletionListener k;
    private SurfaceHolder l;
    OnPreparedListener m;
    private int n;
    private Map o;
    private OnInfoListener p;
    private boolean q;
    private int r;
    private int s;
    OnVideoSizeChangedListener t;
    private int u;
    private int v;
    Callback w;
    private int x;
    private OnCompletionListener y;
    private OnPreparedListener z;

    static {
        String[] strArr = new String[7];
        String str = "\u0016\u0003dcf\u001b\b{\"n\u0011Bd8t\u001c\u000f' r\u0006\u0005j>b\u0007\u001a`.b\u0016\u0003d f\u001b\b";
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
                        i3 = 117;
                        break;
                    case ay.f /*1*/:
                        i3 = 108;
                        break;
                    case ay.n /*2*/:
                        i3 = 9;
                        break;
                    case ay.p /*3*/:
                        i3 = 77;
                        break;
                    default:
                        i3 = 7;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0003\u0005m(h\u0003\u0005l:(U9g,e\u0019\t)9hU\u0003y(iU\u000ff#s\u0010\u0002}w'";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0003\u0005m(h\u0003\u0005l:(U9g,e\u0019\t)9hU\u0003y(iU\u000ff#s\u0010\u0002}w'";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0016\u0003d f\u001b\b";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "#\u0005m(h#\u0005l:";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "#\u0005m(h#\u0005l:";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    B = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0005\r|>b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        b();
    }

    public boolean canSeekForward() {
        return this.q;
    }

    static SurfaceHolder a(VideoView videoView, SurfaceHolder surfaceHolder) {
        videoView.l = surfaceHolder;
        return surfaceHolder;
    }

    static int d(VideoView videoView) {
        return videoView.x;
    }

    static OnPreparedListener g(VideoView videoView) {
        return videoView.z;
    }

    static int c(VideoView videoView, int i) {
        videoView.f = i;
        return i;
    }

    static int g(VideoView videoView, int i) {
        videoView.s = i;
        return i;
    }

    public int getAudioSessionId() {
        if (this.g == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.g = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.g;
    }

    static int h(VideoView videoView) {
        return videoView.i;
    }

    static void b(VideoView videoView) {
        videoView.c();
    }

    public boolean canPause() {
        return this.h;
    }

    static int c(VideoView videoView) {
        return videoView.v;
    }

    static int k(VideoView videoView) {
        return videoView.s;
    }

    static boolean a(VideoView videoView, boolean z) {
        videoView.h = z;
        return z;
    }

    static int a(VideoView videoView) {
        return videoView.u;
    }

    static int d(VideoView videoView, int i) {
        videoView.x = i;
        return i;
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = B[5];
        this.f = 0;
        this.v = 0;
        this.l = null;
        this.a = null;
        this.t = new atk(this);
        this.m = new g1(this);
        this.y = new a_9(this);
        this.e = new af2(this);
        this.c = new s8(this);
        this.w = new xd(this);
        b();
    }

    static int a(VideoView videoView, int i) {
        videoView.v = i;
        return i;
    }

    public int getBufferPercentage() {
        try {
            return this.a != null ? this.n : 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(VideoView.class.getName());
    }

    public void d() {
        a(false);
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.z = onPreparedListener;
    }

    static OnCompletionListener i(VideoView videoView) {
        return videoView.k;
    }

    public VideoView(Context context) {
        super(context);
        this.d = B[6];
        this.f = 0;
        this.v = 0;
        this.l = null;
        this.a = null;
        this.t = new atk(this);
        this.m = new g1(this);
        this.y = new a_9(this);
        this.e = new af2(this);
        this.c = new s8(this);
        this.w = new xd(this);
        b();
    }

    static MediaPlayer e(VideoView videoView) {
        return videoView.a;
    }

    public int getCurrentPosition() {
        try {
            return a() ? this.a.getCurrentPosition() : 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static int f(VideoView videoView, int i) {
        videoView.u = i;
        return i;
    }

    static int e(VideoView videoView, int i) {
        videoView.i = i;
        return i;
    }

    public void setVideoURI(Uri uri, Map map) {
        this.b = uri;
        this.o = map;
        this.r = 0;
        c();
        requestLayout();
        invalidate();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r8_this = this;
        r7 = 3;
        r6 = -1;
        r5 = 1;
        r4 = 0;
        r0 = r8.b;	 Catch:{ IOException -> 0x000d }
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r0 = r8.l;	 Catch:{ IOException -> 0x000d }
        if (r0 != 0) goto L_0x0011;
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x000f }
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r0 = new android.content.Intent;
        r1 = B;
        r1 = r1[r4];
        r0.<init>(r1);
        r1 = B;
        r2 = 4;
        r1 = r1[r2];
        r2 = B;
        r2 = r2[r5];
        r0.putExtra(r1, r2);
        r1 = r8.getContext();
        r1.sendBroadcast(r0);
        r8.a(r4);
        r0 = new android.media.MediaPlayer;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0.<init>();	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r8.a = r0;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0 = r8.g;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        if (r0 == 0) goto L_0x0046;
    L_0x003b:
        r0 = r8.a;	 Catch:{ IOException -> 0x00d3, IllegalArgumentException -> 0x00d7 }
        r1 = r8.g;	 Catch:{ IOException -> 0x00d3, IllegalArgumentException -> 0x00d7 }
        r0.setAudioSessionId(r1);	 Catch:{ IOException -> 0x00d3, IllegalArgumentException -> 0x00d7 }
        r0 = com.whatsapp.App.az;	 Catch:{ IOException -> 0x00d3, IllegalArgumentException -> 0x00d7 }
        if (r0 == 0) goto L_0x0054;
    L_0x0046:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x00d3, IllegalArgumentException -> 0x00d7 }
        r1 = 9;
        if (r0 < r1) goto L_0x0054;
    L_0x004c:
        r0 = r8.a;	 Catch:{ IOException -> 0x00d5, IllegalArgumentException -> 0x00d7 }
        r0 = r0.getAudioSessionId();	 Catch:{ IOException -> 0x00d5, IllegalArgumentException -> 0x00d7 }
        r8.g = r0;	 Catch:{ IOException -> 0x00d5, IllegalArgumentException -> 0x00d7 }
    L_0x0054:
        r0 = r8.a;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r1 = r8.m;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0.setOnPreparedListener(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0 = r8.a;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r1 = r8.t;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0.setOnVideoSizeChangedListener(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0 = r8.a;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r1 = r8.y;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0.setOnCompletionListener(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0 = r8.a;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r1 = r8.e;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0.setOnErrorListener(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0 = r8.a;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r1 = r8.p;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0.setOnInfoListener(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0 = r8.a;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r1 = r8.c;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0.setOnBufferingUpdateListener(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0 = 0;
        r8.n = r0;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0 = r8.a;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r1 = r8.getContext();	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r2 = r8.b;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r3 = r8.o;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0.setDataSource(r1, r2, r3);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0 = r8.a;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r1 = r8.l;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0.setDisplay(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0 = r8.a;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r1 = 3;
        r0.setAudioStreamType(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0 = r8.a;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r1 = 1;
        r0.setScreenOnWhilePlaying(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0 = r8.a;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0.prepareAsync();	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        r0 = 1;
        r8.f = r0;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
        goto L_0x000c;
    L_0x00ab:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = B;
        r2 = r2[r7];
        r1 = r1.append(r2);
        r2 = r8.b;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.c(r1, r0);
        r8.f = r6;
        r8.v = r6;
        r0 = r8.e;
        r1 = r8.a;
        r0.onError(r1, r5, r4);
        goto L_0x000c;
    L_0x00d3:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d5, IllegalArgumentException -> 0x00d7 }
    L_0x00d5:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d7 }
    L_0x00d7:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = B;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r8.b;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.c(r1, r0);
        r8.f = r6;
        r8.v = r6;
        r0 = r8.e;
        r1 = r8.a;
        r0.onError(r1, r5, r4);
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoView.c():void");
    }

    public void setVideoURI(Uri uri) {
        setVideoURI(uri, null);
    }

    public boolean canSeekBackward() {
        return this.j;
    }

    static boolean b(VideoView videoView, boolean z) {
        videoView.q = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a() {
        /*
        r3_this = this;
        r0 = 1;
        r1 = r3.a;	 Catch:{ IllegalArgumentException -> 0x0013 }
        if (r1 == 0) goto L_0x001b;
    L_0x0005:
        r1 = r3.f;	 Catch:{ IllegalArgumentException -> 0x0015 }
        r2 = -1;
        if (r1 == r2) goto L_0x001b;
    L_0x000a:
        r1 = r3.f;	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r1 == 0) goto L_0x001b;
    L_0x000e:
        r1 = r3.f;	 Catch:{ IllegalArgumentException -> 0x0019 }
        if (r1 == r0) goto L_0x001b;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;
    L_0x001b:
        r0 = 0;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoView.a():boolean");
    }

    private void b() {
        this.x = 0;
        this.i = 0;
        getHolder().addCallback(this.w);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f = 0;
        this.v = 0;
    }

    static void c(VideoView videoView, boolean z) {
        videoView.a(z);
    }

    static boolean d(VideoView videoView, boolean z) {
        videoView.j = z;
        return z;
    }

    public int getDuration() {
        try {
            return a() ? this.a.getDuration() : -1;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void a(boolean z) {
        try {
            try {
                if (this.a != null) {
                    this.a.reset();
                    this.a.release();
                    this.a = null;
                    this.f = 0;
                    if (z) {
                        this.v = 0;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public boolean isPlaying() {
        try {
            if (a()) {
                if (this.a.isPlaying()) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void seekTo(int i) {
        try {
            if (a()) {
                this.a.seekTo(i);
                this.r = 0;
                try {
                    if (App.az == 0) {
                        return;
                    }
                }
            }
            this.r = i;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r11, int r12) {
        /*
        r10_this = this;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = com.whatsapp.App.az;
        r0 = r10.x;
        r1 = getDefaultSize(r0, r11);
        r0 = r10.i;
        r0 = getDefaultSize(r0, r12);
        r2 = r10.x;	 Catch:{ IllegalArgumentException -> 0x0088 }
        if (r2 <= 0) goto L_0x0084;
    L_0x0016:
        r2 = r10.i;	 Catch:{ IllegalArgumentException -> 0x0088 }
        if (r2 <= 0) goto L_0x0084;
    L_0x001a:
        r5 = android.view.View.MeasureSpec.getMode(r11);
        r3 = android.view.View.MeasureSpec.getSize(r11);
        r6 = android.view.View.MeasureSpec.getMode(r12);
        r0 = android.view.View.MeasureSpec.getSize(r12);
        if (r5 != r9) goto L_0x004f;
    L_0x002c:
        if (r6 != r9) goto L_0x004f;
    L_0x002e:
        r1 = r10.x;
        r1 = r1 * r0;
        r2 = r10.i;
        r2 = r2 * r3;
        if (r1 >= r2) goto L_0x0099;
    L_0x0036:
        r1 = r10.x;
        r1 = r1 * r0;
        r2 = r10.i;
        r1 = r1 / r2;
        if (r4 == 0) goto L_0x0084;
    L_0x003e:
        r2 = r1;
    L_0x003f:
        r1 = r10.x;	 Catch:{ IllegalArgumentException -> 0x008a }
        r1 = r1 * r0;
        r7 = r10.i;	 Catch:{ IllegalArgumentException -> 0x008a }
        r7 = r7 * r2;
        if (r1 <= r7) goto L_0x0097;
    L_0x0047:
        r1 = r10.i;
        r1 = r1 * r2;
        r7 = r10.x;
        r1 = r1 / r7;
        if (r4 == 0) goto L_0x0094;
    L_0x004f:
        if (r5 != r9) goto L_0x005d;
    L_0x0051:
        r1 = r10.i;
        r1 = r1 * r3;
        r2 = r10.x;
        r1 = r1 / r2;
        if (r6 != r8) goto L_0x0091;
    L_0x0059:
        if (r1 <= r0) goto L_0x0091;
    L_0x005b:
        if (r4 == 0) goto L_0x008f;
    L_0x005d:
        if (r6 != r9) goto L_0x006b;
    L_0x005f:
        r1 = r10.x;
        r1 = r1 * r0;
        r2 = r10.i;
        r1 = r1 / r2;
        if (r5 != r8) goto L_0x0084;
    L_0x0067:
        if (r1 <= r3) goto L_0x0084;
    L_0x0069:
        if (r4 == 0) goto L_0x008f;
    L_0x006b:
        r2 = r10.x;
        r1 = r10.i;
        if (r6 != r8) goto L_0x008c;
    L_0x0071:
        if (r1 <= r0) goto L_0x008c;
    L_0x0073:
        r1 = r10.x;
        r1 = r1 * r0;
        r2 = r10.i;
        r1 = r1 / r2;
    L_0x0079:
        if (r5 != r8) goto L_0x0084;
    L_0x007b:
        if (r1 <= r3) goto L_0x0084;
    L_0x007d:
        r0 = r10.i;
        r0 = r0 * r3;
        r1 = r10.x;
        r0 = r0 / r1;
        r1 = r3;
    L_0x0084:
        r10.setMeasuredDimension(r1, r0);
        return;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = r1;
        r1 = r2;
        goto L_0x0079;
    L_0x008f:
        r1 = r3;
        goto L_0x0084;
    L_0x0091:
        r0 = r1;
        r1 = r3;
        goto L_0x0084;
    L_0x0094:
        r0 = r1;
        r1 = r2;
        goto L_0x0084;
    L_0x0097:
        r1 = r2;
        goto L_0x0084;
    L_0x0099:
        r2 = r3;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoView.onMeasure(int, int):void");
    }

    static OnErrorListener j(VideoView videoView) {
        return videoView.A;
    }

    public void pause() {
        try {
            if (a()) {
                if (this.a.isPlaying()) {
                    this.a.pause();
                    this.f = 4;
                }
            }
            this.v = 4;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(VideoView.class.getName());
    }

    static int b(VideoView videoView, int i) {
        videoView.n = i;
        return i;
    }

    static int f(VideoView videoView) {
        return videoView.r;
    }

    public void start() {
        try {
            if (a()) {
                this.a.start();
                this.f = 3;
            }
            this.v = 3;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
