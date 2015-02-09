package com.whatsapp;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.util.Log;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class v6 implements OnFrameAvailableListener {
    private static final String[] z;
    private Object a;
    private EGLDisplay b;
    private EGL10 c;
    private EGLSurface d;
    private pf e;
    private Surface f;
    private SurfaceTexture g;
    private boolean h;
    private EGLContext i;

    static {
        String[] strArr = new String[15];
        String str = "\u001ba:\u0011]+qh\u0011N)y-WK)}<WH!y-\u0013\u001c'a<";
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
                        i3 = 72;
                        break;
                    case ay.f /*1*/:
                        i3 = 20;
                        break;
                    case ay.n /*2*/:
                        i3 = 72;
                        break;
                    case ay.p /*3*/:
                        i3 = 119;
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
                    str = ";a:\u0011]+qh\u0000];4&\u0002P$";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "-s$4N-u<\u0012\u007f'z<\u0012D<";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "=z)\u0015P-4<\u0018\u001c.}&\u0013\u001c\u001aS\nO\u0004p?8\u0015I.r-\u0005\u001c\rS\u0004W_'z.\u001e[";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "=z)\u0015P-4<\u0018\u001c!z!\u0003U)x!\rYhQ\u000f;\rx";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "&a$\u001b\u001c+{&\u0003Y0`";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "-s$4N-u<\u0012l*a.\u0011Y:G=\u0005Z)w-";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "r4\r0phq:\u0005S:.hGD";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0007a<\u0007I<G=\u0005Z)w-";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\rS\u0004WY:f'\u0005\u001c-z+\u0018I&`-\u0005Y,4`\u0004Y-4$\u0018[a";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "-s$:]#q\u000b\u0002N:q&\u0003\u001c.u!\u001bY,";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "&{<W_'z.\u001e[=f-\u0013\u001c.{:WQ)\u007f-4I:f-\u0019H";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "*q.\u0018N-4%\u0016W-W=\u0005N-z<";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "%R:\u0016Q-U>\u0016U$u*\u001bYhu$\u0005Y)p1WO-`dWZ:u%\u0012\u001c+{=\u001bXhv-WX:{8\u0007Y,";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "*q.\u0018N-4=\u0007X)`-#Y0]%\u0016[-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void b() {
        this.e.a(this.g);
    }

    private void a(String str) {
        int i = App.az;
        Object obj = null;
        do {
            int eglGetError = this.c.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            Log.e(z[9], str + z[8] + Integer.toHexString(eglGetError));
            obj = 1;
        } while (i == 0);
        if (obj != null) {
            try {
                throw new RuntimeException(z[10]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public Surface c() {
        return this.f;
    }

    public v6() {
        this.a = new Object();
        a();
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.a) {
            if (this.h) {
                throw new RuntimeException(z[14]);
            }
            this.h = true;
            this.a.notifyAll();
        }
    }

    public void e() {
        try {
            if (this.c == null) {
                throw new RuntimeException(z[12]);
            }
            try {
                a(z[13]);
                if (!this.c.eglMakeCurrent(this.b, this.d, this.d, this.i)) {
                    throw new RuntimeException(z[11]);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void d() {
        synchronized (this.a) {
            do {
                if (this.h) {
                    this.h = false;
                } else {
                    try {
                        this.a.wait(500);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    } catch (Throwable e2) {
                        throw new RuntimeException(e2);
                    }
                }
            } while (this.h);
            throw new RuntimeException(z[0]);
        }
        this.e.a(z[1]);
        this.g.updateTexImage();
    }

    public v6(int i, int i2) {
        this.a = new Object();
        if (i <= 0 || i2 <= 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        a(i, i2);
        e();
        a();
    }

    private void a() {
        this.e = new pf();
        this.e.b();
        this.g = new SurfaceTexture(this.e.a());
        this.g.setOnFrameAvailableListener(this);
        this.f = new Surface(this.g);
    }

    private void a(int i, int i2) {
        try {
            this.c = (EGL10) EGLContext.getEGL();
            this.b = this.c.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.c.eglInitialize(this.b, null)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                try {
                    if (this.c.eglChooseConfig(this.b, new int[]{12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
                        try {
                            this.i = this.c.eglCreateContext(this.b, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                            a(z[3]);
                            if (this.i == null) {
                                throw new RuntimeException(z[6]);
                            }
                            try {
                                this.d = this.c.eglCreatePbufferSurface(this.b, eGLConfigArr[0], new int[]{12375, i, 12374, i2, 12344});
                                a(z[7]);
                                if (this.d == null) {
                                    throw new RuntimeException(z[2]);
                                }
                                return;
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    throw new RuntimeException(z[4]);
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            throw new RuntimeException(z[5]);
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }
}
