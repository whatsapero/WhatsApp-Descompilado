package com.whatsapp;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.audiofx.Visualizer;
import android.os.Build.VERSION;
import android.os.Handler;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.bl;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class cb {
    private static byte[] b;
    public static cb n;
    private static AudioManager q;
    private static String[] s;
    private static final String[] z;
    private SensorEventListener a;
    private int c;
    private int d;
    private long e;
    private MediaPlayer f;
    private SensorManager g;
    private OnAudioFocusChangeListener h;
    private float i;
    private Activity j;
    private Sensor k;
    private ul l;
    private boolean m;
    private Handler o;
    private boolean p;
    private Visualizer r;
    private d2 t;
    private int u;
    private b v;
    private bl w;

    public void a(ul ulVar) {
        this.l = ulVar;
    }

    private void m() {
        try {
            if (this.l != null) {
                this.l.d();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void b() {
        try {
            if (this.g != null) {
                this.g.unregisterListener(this.a, this.k);
                this.g = null;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static void j() {
        try {
            if (n != null) {
                n.o();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void l() {
        try {
            if (this.l != null) {
                this.l.c();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public int c() {
        try {
            return this.w == null ? 0 : Math.max(this.c, this.w.f());
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static boolean b(cb cbVar) {
        return cbVar.p;
    }

    public int f() {
        return this.u;
    }

    public void b(b bVar) {
        this.v = bVar;
    }

    public void a(d2 d2Var) {
        this.t = d2Var;
    }

    static void a(cb cbVar, int i) {
        cbVar.a(i);
    }

    public void o() {
        try {
            Log.i(z[8]);
            if (this.w != null) {
                if (this.w.c()) {
                    this.w.g();
                }
                this.w.a();
                this.w = null;
            }
            try {
                if (this.f != null) {
                    this.f.release();
                    this.f = null;
                }
                try {
                    if (this.r != null) {
                        this.r.setEnabled(false);
                        this.r = null;
                    }
                    try {
                        if (!this.m) {
                            b();
                        }
                        d();
                        this.j.setVolumeControlStream(Integer.MIN_VALUE);
                        this.c = 0;
                        this.p = false;
                        this.o.removeMessages(0);
                        n = null;
                        p();
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    static bl a(cb cbVar) {
        return cbVar.w;
    }

    static void d(cb cbVar) {
        cbVar.b();
    }

    private OnAudioFocusChangeListener a() {
        try {
            if (this.h == null) {
                this.h = new cn(this);
            }
            return this.h;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void a(int i) {
        int i2 = 0;
        int i3 = App.az;
        try {
            this.c = i;
            if (this.l != null) {
                this.l.a(i);
            }
            try {
                if (this.t == null) {
                    return;
                }
                if (this.r == null) {
                    this.d++;
                    if (b == null) {
                        b = new byte[128];
                        int i4 = 0;
                        while (i4 < b.length) {
                            b[i4] = (byte) ((int) ((((Math.sin(((((double) i4) * 3.141592653589793d) * 32.0d) / ((double) b.length)) * Math.abs(Math.sin(((((double) i4) * 3.141592653589793d) * 4.0d) / ((double) b.length)))) * Math.abs(Math.sin(((((double) i4) * 3.141592653589793d) * 1.0d) / ((double) b.length)))) * 64.0d) + 128.0d));
                            i4++;
                            if (i3 != 0) {
                                break;
                            }
                        }
                    }
                    if (this.d % 4 == 0) {
                        while (i2 < b.length) {
                            b[i2] = (byte) (256 - b[i2]);
                            i2++;
                            if (i3 != 0) {
                                break;
                            }
                        }
                    }
                    this.t.a(b);
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
        r1_this = this;
        r0 = n;	 Catch:{ IllegalStateException -> 0x0024 }
        if (r0 == r1) goto L_0x000d;
    L_0x0004:
        r0 = n;	 Catch:{ IllegalStateException -> 0x0026 }
        if (r0 == 0) goto L_0x000d;
    L_0x0008:
        r0 = n;	 Catch:{ IllegalStateException -> 0x0026 }
        r0.o();	 Catch:{ IllegalStateException -> 0x0026 }
    L_0x000d:
        r0 = r1.w;	 Catch:{ IllegalStateException -> 0x0028 }
        if (r0 == 0) goto L_0x0019;
    L_0x0011:
        r0 = r1.w;	 Catch:{ IllegalStateException -> 0x002a }
        r0 = r0.c();	 Catch:{ IllegalStateException -> 0x002a }
        if (r0 != 0) goto L_0x0020;
    L_0x0019:
        r1.r();	 Catch:{ IllegalStateException -> 0x002c }
        r0 = com.whatsapp.App.az;	 Catch:{ IllegalStateException -> 0x002c }
        if (r0 == 0) goto L_0x0023;
    L_0x0020:
        r1.g();	 Catch:{ IllegalStateException -> 0x002c }
    L_0x0023:
        return;
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.cb.n():void");
    }

    static {
        String[] strArr = new String[9];
        String str = "T9C\\]N=UMUC \\HEG\"\u001fZHC\"D\t";
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
                        i3 = 34;
                        break;
                    case ay.f /*1*/:
                        i3 = 80;
                        break;
                    case ay.n /*2*/:
                        i3 = 48;
                        break;
                    case ay.p /*3*/:
                        i3 = 41;
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
                    str = "Q1]ZIL7";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "O5CZ]E5Q\\XK?@E][5B\u0006NG#EDY";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "O5CZ]E5Q\\XK?@E][5B\u0006SL5Q[LP?H@QK$I\t";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "C%T@S";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Q5^ZSP";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "C%T@S";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "O5CZ]E5Q\\XK?@E][5B\u0006OV?@";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    strArr = new String[11];
                    str = "e\u0004\u001d`\u0005\u0017`\u0005";
                    obj = 8;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i = 0;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    str = "e\u0004\u001d`\u0005\u0017`\u0006";
                    obj = 9;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    str = "e\u0004\u001d`\u0005\u0017`\u0005n";
                    obj = 10;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    str = "q\u0017x\u0004u\u0011c\u0007";
                    obj = 11;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    str = "q\u0017x\u0004q\u001ba\t";
                    obj = 12;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "q\u0013x\u0004u\u0017d\u0005";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "q\u0000x\u0004p\u0015b\u0000";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "q\u0013x\u0004n\u001bg\u0000";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "e\u0004\u001d`\u0005\u0017`\b";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "q\u0017x\u0004r\u0012d\u0005";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "q\u0013\u001d\u0019\bg";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    s = strArr3;
                default:
                    strArr2[i] = str;
                    str = "O5CZ]E5Q\\XK?@E][5B\u0006OV1B]";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static d2 c(cb cbVar) {
        return cbVar.t;
    }

    public cb(Activity activity) {
        this.o = new wg(this);
        this.j = activity;
        if (q == null) {
            q = (AudioManager) this.j.getSystemService(z[7]);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r() {
        /*
        r7_this = this;
        r6 = 9;
        r2 = 0;
        r1 = 1;
        r3 = com.whatsapp.App.az;
        r0 = n;	 Catch:{ IOException -> 0x0157 }
        if (r0 == r7) goto L_0x0013;
    L_0x000a:
        r0 = n;	 Catch:{ IOException -> 0x0157 }
        if (r0 == 0) goto L_0x0013;
    L_0x000e:
        r0 = n;	 Catch:{ IOException -> 0x0159 }
        r0.o();	 Catch:{ IOException -> 0x0159 }
    L_0x0013:
        r0 = com.whatsapp.App.V;	 Catch:{ IOException -> 0x015b }
        r0.stop();	 Catch:{ IOException -> 0x015b }
        r0 = r7.j;	 Catch:{ IOException -> 0x015b }
        r0 = com.whatsapp.App.c(r0);	 Catch:{ IOException -> 0x015b }
        if (r0 != 0) goto L_0x0026;
    L_0x0020:
        r0 = r7.j;	 Catch:{ IOException -> 0x015b }
        r4 = 3;
        r0.setVolumeControlStream(r4);	 Catch:{ IOException -> 0x015b }
    L_0x0026:
        r7.q();	 Catch:{ IOException -> 0x015d }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x015d }
        r7.e = r4;	 Catch:{ IOException -> 0x015d }
        r0 = r7.w;	 Catch:{ IOException -> 0x015d }
        if (r0 != 0) goto L_0x0133;
    L_0x0033:
        r0 = z;	 Catch:{ IOException -> 0x015d }
        r4 = 1;
        r0 = r0[r4];	 Catch:{ IOException -> 0x015d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x015d }
        r0 = r7.t;	 Catch:{ IOException -> 0x015d }
        if (r0 == 0) goto L_0x0085;
    L_0x003f:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x015f }
        r4 = 17;
        if (r0 < r4) goto L_0x0085;
    L_0x0045:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0161 }
        r4 = 18;
        if (r0 > r4) goto L_0x0085;
    L_0x004b:
        r0 = z;	 Catch:{ IOException -> 0x0163 }
        r4 = 2;
        r0 = r0[r4];	 Catch:{ IOException -> 0x0163 }
        r4 = android.os.Build.MANUFACTURER;	 Catch:{ IOException -> 0x0163 }
        r0 = r0.equals(r4);	 Catch:{ IOException -> 0x0163 }
        if (r0 == 0) goto L_0x0085;
    L_0x0058:
        r0 = s;	 Catch:{ IOException -> 0x0165 }
        r4 = android.os.Build.MODEL;	 Catch:{ IOException -> 0x0165 }
        r0 = com.whatsapp.util.au.a(r0, r4);	 Catch:{ IOException -> 0x0165 }
        if (r0 == 0) goto L_0x0085;
    L_0x0062:
        r0 = r7.v;	 Catch:{ IOException -> 0x0167 }
        r0 = r0.A;	 Catch:{ IOException -> 0x0167 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IOException -> 0x0167 }
        r4 = new android.media.MediaPlayer;	 Catch:{ IOException -> 0x0167 }
        r4.<init>();	 Catch:{ IOException -> 0x0167 }
        r7.f = r4;	 Catch:{ IOException -> 0x0167 }
        r4 = r7.f;	 Catch:{ IOException -> 0x0167 }
        r0 = r0.file;	 Catch:{ IOException -> 0x0167 }
        r0 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x0167 }
        r4.setDataSource(r0);	 Catch:{ IOException -> 0x0167 }
        r0 = r7.f;	 Catch:{ IOException -> 0x0167 }
        r4 = 3;
        r0.setAudioStreamType(r4);	 Catch:{ IOException -> 0x0167 }
        r0 = r7.f;	 Catch:{ IOException -> 0x0167 }
        r0.prepare();	 Catch:{ IOException -> 0x0167 }
    L_0x0085:
        r0 = r7.v;	 Catch:{ IOException -> 0x0175 }
        r0 = r0.A;	 Catch:{ IOException -> 0x0175 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IOException -> 0x0175 }
        r0 = r0.file;	 Catch:{ IOException -> 0x016d }
        r0 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x016d }
        r0 = com.whatsapp.util.bl.a(r0);	 Catch:{ IOException -> 0x016d }
        r7.w = r0;	 Catch:{ IOException -> 0x016d }
        r0 = r7.w;	 Catch:{ IOException -> 0x016d }
        r4 = 3;
        r0.a(r4);	 Catch:{ IOException -> 0x016d }
        r0 = r7.w;	 Catch:{ IOException -> 0x016d }
        r0.h();	 Catch:{ IOException -> 0x016d }
        r0 = r7.w;	 Catch:{ IOException -> 0x016d }
        r4 = r7.c;	 Catch:{ IOException -> 0x016d }
        r0.b(r4);	 Catch:{ IOException -> 0x016d }
        r0 = r7.w;	 Catch:{ IOException -> 0x016d }
        r0.d();	 Catch:{ IOException -> 0x016d }
        r0 = r7.w;	 Catch:{ IOException -> 0x016d }
        r0 = r0.e();	 Catch:{ IOException -> 0x016d }
        r7.u = r0;	 Catch:{ IOException -> 0x016d }
        r0 = r7.o;	 Catch:{ IOException -> 0x016d }
        r4 = 0;
        r0.sendEmptyMessage(r4);	 Catch:{ IOException -> 0x016d }
        r0 = r7.v;	 Catch:{ IOException -> 0x016d }
        r0 = r0.e;	 Catch:{ IOException -> 0x016d }
        r0 = r0.b;	 Catch:{ IOException -> 0x016d }
        if (r0 != 0) goto L_0x00e8;
    L_0x00c4:
        r0 = r7.v;	 Catch:{ IOException -> 0x016d }
        r0 = r0.w;	 Catch:{ IOException -> 0x016d }
        if (r0 != r1) goto L_0x00e8;
    L_0x00ca:
        r0 = r7.v;	 Catch:{ IOException -> 0x016f }
        r0 = r0.a;	 Catch:{ IOException -> 0x016f }
        if (r0 == r6) goto L_0x00e8;
    L_0x00d0:
        r0 = r7.v;	 Catch:{ IOException -> 0x0171 }
        r0 = r0.a;	 Catch:{ IOException -> 0x0171 }
        r4 = 10;
        if (r0 == r4) goto L_0x00e8;
    L_0x00d8:
        r0 = com.whatsapp.App.aJ;	 Catch:{ IOException -> 0x0173 }
        r4 = r7.v;	 Catch:{ IOException -> 0x0173 }
        r4 = r4.e;	 Catch:{ IOException -> 0x0173 }
        r5 = 9;
        r0.b(r4, r5);	 Catch:{ IOException -> 0x0173 }
        r0 = r7.v;	 Catch:{ IOException -> 0x0173 }
        com.whatsapp.App.l(r0);	 Catch:{ IOException -> 0x0173 }
    L_0x00e8:
        r0 = r1;
    L_0x00e9:
        if (r0 == 0) goto L_0x012e;
    L_0x00eb:
        r0 = r7.t;	 Catch:{ IOException -> 0x0188 }
        if (r0 == 0) goto L_0x0124;
    L_0x00ef:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x018a }
        if (r0 < r6) goto L_0x0124;
    L_0x00f3:
        r0 = new android.media.audiofx.Visualizer;	 Catch:{ Exception -> 0x018c }
        r1 = r7.w;	 Catch:{ Exception -> 0x018c }
        r1 = r1.i();	 Catch:{ Exception -> 0x018c }
        r0.<init>(r1);	 Catch:{ Exception -> 0x018c }
        r7.r = r0;	 Catch:{ Exception -> 0x018c }
        r0 = r7.r;	 Catch:{ Exception -> 0x018c }
        r1 = android.media.audiofx.Visualizer.getCaptureSizeRange();	 Catch:{ Exception -> 0x018c }
        r4 = 1;
        r1 = r1[r4];	 Catch:{ Exception -> 0x018c }
        r0.setCaptureSize(r1);	 Catch:{ Exception -> 0x018c }
        r0 = r7.r;	 Catch:{ Exception -> 0x018c }
        r1 = new com.whatsapp.akg;	 Catch:{ Exception -> 0x018c }
        r1.<init>(r7);	 Catch:{ Exception -> 0x018c }
        r4 = android.media.audiofx.Visualizer.getMaxCaptureRate();	 Catch:{ Exception -> 0x018c }
        r4 = r4 / 2;
        r5 = 1;
        r6 = 1;
        r0.setDataCaptureListener(r1, r4, r5, r6);	 Catch:{ Exception -> 0x018c }
        r0 = r7.r;	 Catch:{ Exception -> 0x018c }
        r1 = 1;
        r0.setEnabled(r1);	 Catch:{ Exception -> 0x018c }
    L_0x0124:
        r7.l();	 Catch:{ IOException -> 0x01ab }
        r7.t();	 Catch:{ IOException -> 0x01ab }
        n = r7;	 Catch:{ IOException -> 0x01ab }
        if (r3 == 0) goto L_0x0131;
    L_0x012e:
        r7.o();	 Catch:{ IOException -> 0x01ab }
    L_0x0131:
        if (r3 == 0) goto L_0x0156;
    L_0x0133:
        r0 = z;	 Catch:{ IOException -> 0x01ad }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ IOException -> 0x01ad }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x01ad }
        r0 = r7.w;	 Catch:{ IOException -> 0x01ad }
        r1 = r7.c;	 Catch:{ IOException -> 0x01ad }
        r0.b(r1);	 Catch:{ IOException -> 0x01ad }
        r0 = r7.w;	 Catch:{ IOException -> 0x01ad }
        r0.d();	 Catch:{ IOException -> 0x01ad }
        r0 = 0;
        r7.p = r0;	 Catch:{ IOException -> 0x01ad }
        r0 = r7.o;	 Catch:{ IOException -> 0x01ad }
        r1 = 0;
        r0.sendEmptyMessage(r1);	 Catch:{ IOException -> 0x01ad }
        r7.i();	 Catch:{ IOException -> 0x01ad }
        r7.t();	 Catch:{ IOException -> 0x01ad }
    L_0x0156:
        return;
    L_0x0157:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0159 }
    L_0x0159:
        r0 = move-exception;
        throw r0;
    L_0x015b:
        r0 = move-exception;
        throw r0;
    L_0x015d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x015f }
    L_0x015f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0161 }
    L_0x0161:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0163 }
    L_0x0163:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0165 }
    L_0x0165:
        r0 = move-exception;
        throw r0;
    L_0x0167:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        goto L_0x0085;
    L_0x016d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x016f }
    L_0x016f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0171 }
    L_0x0171:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0173 }
    L_0x0173:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0175 }
    L_0x0175:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        r0 = r7.j;
        r0 = r0.getApplicationContext();
        r1 = 2131624340; // 0x7f0e0194 float:1.8875857E38 double:1.053162356E-314;
        com.whatsapp.App.b(r0, r1, r2);
        r0 = r2;
        goto L_0x00e9;
    L_0x0188:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x018a }
    L_0x018a:
        r0 = move-exception;
        throw r0;
    L_0x018c:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = z;
        r2 = r4[r2];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0124;
    L_0x01ab:
        r0 = move-exception;
        throw r0;
    L_0x01ad:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.cb.r():void");
    }

    public boolean k() {
        try {
            if (this.w != null) {
                if (this.w.c()) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public static void e() {
        try {
            if (n != null) {
                n.g();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static boolean s() {
        try {
            if (n != null) {
                if (n.m) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void q() {
        int i = 1;
        try {
            if (VERSION.SDK_INT > 7) {
                AudioManager audioManager = q;
                OnAudioFocusChangeListener a = a();
                if (this.v.w == 1) {
                    i = 3;
                }
                audioManager.requestAudioFocus(a, 3, i);
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void b(int i) {
        try {
            this.c = i;
            if (this.w != null) {
                this.w.b(i);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void i() {
        try {
            if (this.l != null) {
                this.l.b();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void g() {
        try {
            if (this.w != null) {
                if (this.w.c()) {
                    this.w.b();
                    this.p = true;
                    m();
                }
            }
            d();
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(boolean r10) {
        /*
        r9_this = this;
        r8 = 2131624340; // 0x7f0e0194 float:1.8875857E38 double:1.053162356E-314;
        r1 = 0;
        r2 = com.whatsapp.App.az;
        r0 = com.whatsapp.App.ae;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        r10 = r1;
    L_0x000b:
        r0 = r9.m;	 Catch:{ IllegalStateException -> 0x0010 }
        if (r0 != r10) goto L_0x0012;
    L_0x000f:
        return;
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        if (r10 == 0) goto L_0x0020;
    L_0x0014:
        r0 = r9.w;	 Catch:{ IllegalStateException -> 0x0104 }
        if (r0 == 0) goto L_0x000f;
    L_0x0018:
        r0 = r9.w;	 Catch:{ IllegalStateException -> 0x0106 }
        r0 = r0.c();	 Catch:{ IllegalStateException -> 0x0106 }
        if (r0 == 0) goto L_0x000f;
    L_0x0020:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r0 = r0.append(r10);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r9.m = r10;
        r0 = r9.j;
        r0 = r0.getWindow();
        r3 = r0.getAttributes();
        if (r10 == 0) goto L_0x0052;
    L_0x0047:
        r4 = r3.screenBrightness;	 Catch:{ IllegalStateException -> 0x010a }
        r9.i = r4;	 Catch:{ IllegalStateException -> 0x010a }
        r4 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r3.screenBrightness = r4;	 Catch:{ IllegalStateException -> 0x010a }
        if (r2 == 0) goto L_0x0056;
    L_0x0052:
        r4 = r9.i;	 Catch:{ IllegalStateException -> 0x010c }
        r3.screenBrightness = r4;	 Catch:{ IllegalStateException -> 0x010c }
    L_0x0056:
        r0.setAttributes(r3);	 Catch:{ IllegalStateException -> 0x010e }
        r0 = r9.l;	 Catch:{ IllegalStateException -> 0x010e }
        if (r0 == 0) goto L_0x0062;
    L_0x005d:
        r0 = r9.l;	 Catch:{ IllegalStateException -> 0x010e }
        r0.a(r10);	 Catch:{ IllegalStateException -> 0x010e }
    L_0x0062:
        r0 = r9.w;	 Catch:{ IllegalStateException -> 0x0110 }
        if (r0 == 0) goto L_0x000f;
    L_0x0066:
        r0 = r9.w;	 Catch:{ IllegalStateException -> 0x0110 }
        r0 = r0.c();	 Catch:{ IllegalStateException -> 0x0110 }
        if (r0 == 0) goto L_0x000f;
    L_0x006e:
        r0 = r9.w;
        r3 = r0.f();
        r0 = r9.w;
        r0.g();
        r0 = r9.w;
        r0.a();
        r0 = 0;
        r9.w = r0;
        r0 = r9.v;
        r0 = r0.A;
        r0 = (com.whatsapp.MediaData) r0;
        r0 = r0.file;	 Catch:{ IllegalStateException -> 0x00f8, IOException -> 0x0114 }
        r0 = r0.getAbsolutePath();	 Catch:{ IllegalStateException -> 0x00f8, IOException -> 0x0114 }
        r0 = com.whatsapp.util.bl.a(r0);	 Catch:{ IllegalStateException -> 0x00f8, IOException -> 0x0114 }
        r9.w = r0;	 Catch:{ IllegalStateException -> 0x00f8, IOException -> 0x0114 }
        if (r10 == 0) goto L_0x00b4;
    L_0x0095:
        r0 = r9.j;	 Catch:{ IllegalStateException -> 0x00f8, IOException -> 0x0114 }
        r4 = z;	 Catch:{ IllegalStateException -> 0x00f8, IOException -> 0x0114 }
        r5 = 5;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00f8, IOException -> 0x0114 }
        r0 = r0.getSystemService(r4);	 Catch:{ IllegalStateException -> 0x00f8, IOException -> 0x0114 }
        r0 = (android.media.AudioManager) r0;	 Catch:{ IllegalStateException -> 0x00f8, IOException -> 0x0114 }
        r4 = 0;
        r0.setSpeakerphoneOn(r4);	 Catch:{ IllegalStateException -> 0x0112, IOException -> 0x0114 }
        r0 = r9.w;	 Catch:{ IllegalStateException -> 0x0112, IOException -> 0x0114 }
        r4 = 0;
        r0.a(r4);	 Catch:{ IllegalStateException -> 0x0112, IOException -> 0x0114 }
        r0 = r9.j;	 Catch:{ IllegalStateException -> 0x0112, IOException -> 0x0114 }
        r4 = 0;
        r0.setVolumeControlStream(r4);	 Catch:{ IllegalStateException -> 0x0112, IOException -> 0x0114 }
        if (r2 == 0) goto L_0x00c0;
    L_0x00b4:
        r0 = r9.w;	 Catch:{ IllegalStateException -> 0x0112, IOException -> 0x0114 }
        r4 = 3;
        r0.a(r4);	 Catch:{ IllegalStateException -> 0x0112, IOException -> 0x0114 }
        r0 = r9.j;	 Catch:{ IllegalStateException -> 0x0112, IOException -> 0x0114 }
        r4 = 3;
        r0.setVolumeControlStream(r4);	 Catch:{ IllegalStateException -> 0x0112, IOException -> 0x0114 }
    L_0x00c0:
        r0 = r9.w;	 Catch:{ IllegalStateException -> 0x0120, IOException -> 0x0114 }
        r0.h();	 Catch:{ IllegalStateException -> 0x0120, IOException -> 0x0114 }
        r0 = 0;
        r3 = r3 + -1000;
        r0 = java.lang.Math.max(r0, r3);	 Catch:{ IllegalStateException -> 0x0120, IOException -> 0x0114 }
        r9.c = r0;	 Catch:{ IllegalStateException -> 0x0120, IOException -> 0x0114 }
        r0 = r9.w;	 Catch:{ IllegalStateException -> 0x0120, IOException -> 0x0114 }
        r3 = r9.c;	 Catch:{ IllegalStateException -> 0x0120, IOException -> 0x0114 }
        r0.b(r3);	 Catch:{ IllegalStateException -> 0x0120, IOException -> 0x0114 }
        if (r10 != 0) goto L_0x00e4;
    L_0x00d7:
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x0120, IOException -> 0x0114 }
        r6 = r9.e;	 Catch:{ IllegalStateException -> 0x0120, IOException -> 0x0114 }
        r4 = r4 - r6;
        r6 = 1500; // 0x5dc float:2.102E-42 double:7.41E-321;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x00eb;
    L_0x00e4:
        r0 = r9.w;	 Catch:{ IllegalStateException -> 0x0122, IOException -> 0x0114 }
        r0.d();	 Catch:{ IllegalStateException -> 0x0122, IOException -> 0x0114 }
        if (r2 == 0) goto L_0x000f;
    L_0x00eb:
        r0 = 1;
        r9.p = r0;	 Catch:{ IllegalStateException -> 0x00f6, IOException -> 0x0114 }
        r9.m();	 Catch:{ IllegalStateException -> 0x00f6, IOException -> 0x0114 }
        r9.d();	 Catch:{ IllegalStateException -> 0x00f6, IOException -> 0x0114 }
        goto L_0x000f;
    L_0x00f6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00f8, IOException -> 0x0114 }
    L_0x00f8:
        r0 = move-exception;
        r0 = r9.j;
        r0 = r0.getApplicationContext();
        com.whatsapp.App.b(r0, r8, r1);
        goto L_0x000f;
    L_0x0104:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0106 }
    L_0x0106:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0108 }
    L_0x0108:
        r0 = move-exception;
        throw r0;
    L_0x010a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x010c }
    L_0x010c:
        r0 = move-exception;
        throw r0;
    L_0x010e:
        r0 = move-exception;
        throw r0;
    L_0x0110:
        r0 = move-exception;
        throw r0;
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00f8, IOException -> 0x0114 }
    L_0x0114:
        r0 = move-exception;
        r0 = r9.j;
        r0 = r0.getApplicationContext();
        com.whatsapp.App.b(r0, r8, r1);
        goto L_0x000f;
    L_0x0120:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0122, IOException -> 0x0114 }
    L_0x0122:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00f6, IOException -> 0x0114 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.cb.a(boolean):void");
    }

    static Sensor e(cb cbVar) {
        return cbVar.k;
    }

    public static boolean a(b bVar) {
        try {
            return n == null ? false : bVar.e.equals(n.v.e);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static boolean h() {
        try {
            if (n != null) {
                if (n.k()) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void d() {
        try {
            if (VERSION.SDK_INT > 7) {
                q.abandonAudioFocus(a());
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void t() {
        try {
            if (this.g == null) {
                this.g = (SensorManager) this.j.getSystemService(z[6]);
                this.k = this.g.getDefaultSensor(8);
                this.a = new t(this);
                this.g.registerListener(this.a, this.k, 2);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void p() {
        try {
            if (this.l != null) {
                this.l.a();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
