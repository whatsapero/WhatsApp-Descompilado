package com.whatsapp;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class pf {
    private static final String[] z;
    private int a;
    private int b;
    private FloatBuffer c;
    private int d;
    private int e;
    private final float[] f;
    private float[] g;
    private int h;
    private float[] i;
    private int j;

    static {
        String[] strArr = new String[39];
        String str = "\u0006S'9F1M\u001d-Q\u0000R";
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
                        i3 = 97;
                        break;
                    case ay.f /*1*/:
                        i3 = 63;
                        break;
                    case ay.n /*2*/:
                        i3 = 114;
                        break;
                    case ay.p /*3*/:
                        i3 = 74;
                        break;
                    default:
                        i3 = 35;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0006S7$B\u0003S\u0017\u001cF\u0013K\u00172b\u0015K\u0000#A M\u0000+ZAR\u0013\u001eF\u0019K\u00078F)^\u001c.O\u0004";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0006S68B\u0016~\u00008B\u0018L";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0006S$/Q\u0015Z\n\u000bW\u0015M\u001b(s\u000eV\u001c>F\u0013\u001f\u001f+s\u000eL\u001b>J\u000eQ";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u000eQ68B\u0016y\u0000+N\u0004\u001f\u0001>B\u0013K";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0006S7$B\u0003S\u0017\u001cF\u0013K\u00172b\u0015K\u0000#A M\u0000+ZAR\u0013\u001aL\u0012V\u0006#L\u000fw\u0013$G\rZ";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "5Z\n>V\u0013Z /M\u0005Z\u0000";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "[\u001f\u0015&f\u0013M\u001d8\u0003";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "[\u001f\u0015&f\u0013M\u001d8\u0003";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\"P\u0007&GAQ\u001d>\u0003\rV\u001c!\u0003\u0011M\u001d-Q\u0000RHj";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "5Z\n>V\u0013Z /M\u0005Z\u0000";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0006S18F\u0000K\u0017\u001aQ\u000eX\u0000+N";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0006S3>W\u0000\\\u001a\u0019K\u0000[\u00178";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\"P\u0007&GAQ\u001d>\u0003\u0002M\u0017+W\u0004\u001f\u00028L\u0006M\u0013'";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0006S3>W\u0000\\\u001a\u0019K\u0000[\u00178";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "5Z\n>V\u0013Z /M\u0005Z\u0000";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "5Z\n>V\u0013Z /M\u0005Z\u0000";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "5Z\n>V\u0013Z /M\u0005Z\u0000";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0006S18F\u0000K\u0017\u0019K\u0000[\u00178\u0003\u0015F\u0002/\u001e";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "5Z\n>V\u0013Z /M\u0005Z\u0000";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\"P\u0007&GAQ\u001d>\u0003\u0002P\u001f:J\rZR9K\u0000[\u00178\u0003";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\"P\u0007&GAQ\u001d>\u0003\u0006Z\u0006jB\u0015K\u0000#AAS\u001d)B\u0015V\u001d$\u0003\u0007P\u0000jV,i\"\u0007B\u0015M\u001b2";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0006S5/W4Q\u001b,L\u0013R>%@\u0000K\u001b%MAJ!\u001en\u0000K\u0000#[";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\"P\u0007&GAQ\u001d>\u0003\u0006Z\u0006jB\u0015K\u0000#AAS\u001d)B\u0015V\u001d$\u0003\u0007P\u0000jB1P\u0001#W\bP\u001c";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "BZ\n>F\u000fL\u001b%MAx>\u0015l$l-\u000fd-`\u001b'B\u0006Z-/[\u0015Z\u0000$B\r\u001fHjQ\u0004N\u0007#Q\u00045\u00028F\u0002V\u0001#L\u000f\u001f\u001f/G\bJ\u001f:\u0003\u0007S\u001d+WZ5\u0004+Q\u0018V\u001c-\u0003\u0017Z\u0011x\u0003\u0017k\u00172W\u0014M\u0017\tL\u000eM\u0016q)\u0014Q\u001b,L\u0013RR9B\fO\u001e/Q$G\u0006/Q\u000f^\u001e\u0005f2\u001f\u0001\u001eF\u0019K\u00078FZ5\u0004%J\u0005\u001f\u001f+J\u000f\u0017[jXk\u001fR-O>y\u0000+D\"P\u001e%QA\u0002R>F\u0019K\u00078FS{Z9w\u0004G\u0006?Q\u0004\u0013R<w\u0004G\u0006?Q\u0004|\u001d%Q\u0005\u0016I@^k";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0006S0#M\u0005k\u00172W\u0014M\u0017jN5Z\n>V\u0013Z;\u000e";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0014Q\u001b,L\u0013RR'B\u0015\u000bR?n7o?+W\u0013V\nq)\u0014Q\u001b,L\u0013RR'B\u0015\u000bR?p5r\u0013>Q\bGI@B\u0015K\u0000#A\u0014K\u0017jU\u0004\\FjB1P\u0001#W\bP\u001cq)\u0000K\u00068J\u0003J\u0006/\u0003\u0017Z\u0011~\u0003\u0000k\u00172W\u0014M\u0017\tL\u000eM\u0016q)\u0017^\u00003J\u000fXR<F\u0002\rR<w\u0004G\u0006?Q\u0004|\u001d%Q\u0005\u0004x<L\b[R'B\bQZc\u0003\u001a5RjD\r`\"%P\bK\u001b%MA\u0002R?n7o?+W\u0013V\nj\tA^\"%P\bK\u001b%MZ5RjU5Z\n>V\u0013Z1%L\u0013[Rw\u0003IJ!\u001en\u0000K\u0000#[A\u0015R+w\u0004G\u0006?Q\u0004|\u001d%Q\u0005\u0016\\2ZZ5\u000f@";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0000o\u001d9J\u0015V\u001d$";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0006S&/[1^\u0000+N\u0004K\u00178";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0006S5/W K\u00068J\u0003s\u001d)B\u0015V\u001d$\u0003\u0000o\u001d9J\u0015V\u001d$";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\"P\u0007&GAQ\u001d>\u0003\u0006Z\u0006jB\u0015K\u0000#AAS\u001d)B\u0015V\u001d$\u0003\u0007P\u0000jB5Z\n>V\u0013Z1%L\u0013[";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0014l&\u0007B\u0015M\u001b2";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0000k\u00172W\u0014M\u0017\tL\u000eM\u0016";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\"P\u0007&GAQ\u001d>\u0003\u0006Z\u0006jB\u0015K\u0000#AAS\u001d)B\u0015V\u001d$\u0003\u0007P\u0000jV2k?+W\u0013V\n";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    str = "\u0007^\u001b&F\u0005\u001f\u00118F\u0000K\u001b$DAO\u0000%D\u0013^\u001f";
                    obj = 34;
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    strArr2 = strArr3;
                    str = "\u0006S5/W K\u00068J\u0003s\u001d)B\u0015V\u001d$\u0003\u0000k\u00172W\u0014M\u0017\tL\u000eM\u0016";
                    obj = 35;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0014r$\u001an\u0000K\u0000#[";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0006S5/W4Q\u001b,L\u0013R>%@\u0000K\u001b%MAJ?\u001cs,^\u00068J\u0019";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0006S$/Q\u0015Z\n\u000bW\u0015M\u001b(s\u000eV\u001c>F\u0013\u001f\u001f+w\u0004G\u0006?Q\u0004w\u0013$G\rZ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        a(z[19] + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e(z[20], z[21] + i + ":");
        Log.e(z[18], " " + GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            try {
                Log.e(z[7], str + z[9] + glGetError);
                throw new RuntimeException(str + z[8] + glGetError);
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    public pf() {
        this.f = new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.g = new float[16];
        this.i = new float[16];
        this.b = -12345;
        this.c = ByteBuffer.allocateDirect(this.f.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.c.put(this.f).position(0);
        Matrix.setIdentityM(this.i, 0);
    }

    public void a(SurfaceTexture surfaceTexture) {
        a(z[5]);
        surfaceTexture.getTransformMatrix(this.i);
        GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.d);
        a(z[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.b);
        this.c.position(0);
        GLES20.glVertexAttribPointer(this.h, 3, 5126, false, 20, this.c);
        a(z[4]);
        GLES20.glEnableVertexAttribArray(this.h);
        a(z[6]);
        this.c.position(3);
        GLES20.glVertexAttribPointer(this.a, 2, 5126, false, 20, this.c);
        a(z[1]);
        GLES20.glEnableVertexAttribArray(this.a);
        a(z[2]);
        Matrix.setIdentityM(this.g, 0);
        GLES20.glUniformMatrix4fv(this.j, 1, false, this.g, 0);
        GLES20.glUniformMatrix4fv(this.e, 1, false, this.i, 0);
        GLES20.glDrawArrays(5, 0, 4);
        a(z[3]);
        GLES20.glFinish();
    }

    public void b() {
        try {
            this.d = a(z[27], z[25]);
            if (this.d == 0) {
                throw new RuntimeException(z[35]);
            }
            try {
                this.h = GLES20.glGetAttribLocation(this.d, z[28]);
                a(z[30]);
                if (this.h == -1) {
                    throw new RuntimeException(z[24]);
                }
                try {
                    this.a = GLES20.glGetAttribLocation(this.d, z[33]);
                    a(z[36]);
                    if (this.a == -1) {
                        throw new RuntimeException(z[31]);
                    }
                    try {
                        this.j = GLES20.glGetUniformLocation(this.d, z[37]);
                        a(z[38]);
                        if (this.j == -1) {
                            throw new RuntimeException(z[22]);
                        }
                        try {
                            this.e = GLES20.glGetUniformLocation(this.d, z[32]);
                            a(z[23]);
                            if (this.e == -1) {
                                throw new RuntimeException(z[34]);
                            }
                            int[] iArr = new int[1];
                            GLES20.glGenTextures(1, iArr, 0);
                            this.b = iArr[0];
                            GLES20.glBindTexture(36197, this.b);
                            a(z[26]);
                            GLES20.glTexParameterf(36197, 10241, 9729.0f);
                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            a(z[29]);
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                } catch (RuntimeException e22) {
                    throw e22;
                }
            } catch (RuntimeException e222) {
                throw e222;
            }
        } catch (RuntimeException e2222) {
            throw e2222;
        }
    }

    private int a(String str, String str2) {
        int a = a(35633, str);
        if (a == 0) {
            return 0;
        }
        int a2 = a(35632, str2);
        if (a2 == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        try {
            a(z[12]);
            if (glCreateProgram == 0) {
                Log.e(z[17], z[14]);
            }
            GLES20.glAttachShader(glCreateProgram, a);
            a(z[13]);
            GLES20.glAttachShader(glCreateProgram, a2);
            a(z[15]);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return glCreateProgram;
            }
            Log.e(z[16], z[10]);
            Log.e(z[11], GLES20.glGetProgramInfoLog(glCreateProgram));
            GLES20.glDeleteProgram(glCreateProgram);
            return 0;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public int a() {
        return this.b;
    }
}
