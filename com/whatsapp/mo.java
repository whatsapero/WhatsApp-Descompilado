package com.whatsapp;

import com.whatsapp.messaging.bl;
import com.whatsapp.protocol.bj;
import com.whatsapp.protocol.cz;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class mo implements bl {
    private static final String[] z;
    private final App a;

    static {
        String[] strArr = new String[14];
        String str = "@\u001ef:\u0014\u0005\u001c'$\u0011\u0014\u0010'6\n\u0012\u0017us\u001b\u000f\u001cbs";
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
                        i3 = 96;
                        break;
                    case ay.f /*1*/:
                        i3 = 120;
                        break;
                    case ay.n /*2*/:
                        i3 = 7;
                        break;
                    case ay.p /*3*/:
                        i3 = 83;
                        break;
                    default:
                        i3 = 120;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0001\u0000h?\u0017\u0014\u0014'#\n\u0005Xl6\u0001@\u000br0\u001b\u0005\u000bt5\r\f\u0014~s\u000b\u0005\f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0001\u0000h?\u0017\u0014\u0014'#\n\u0005Xl6\u0001@\u001bh&\u0016\u0014Xc<\u000f\u000eXs<X";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "@\u000ff X\u0013\rd0\u001d\u0013\u000ba&\u0014[Xn=\u0011\u0014\u0011f'\u0011\u000e\u001f'2\u0000\u000f\u0014h'\u0014@\u000bb \u000b\t\u0017i";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0001\u0000h?\u0017\u0014\u0014'#\n\u0005Xl6\u0001@\nb\"\r\u0005\u000bss\u001e\u000f\n'";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "@\u000ff X\u000e\u0017i6";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    str = "\u0001\u0000h?\u0017\u0014\u0014'#\n\u0005Xl6\u0001@\nb\"\r\u0005\u000bss\u001e\u000f\n'";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = "\u0001\u0000h?\u0017\u0014\u0014'#\n\u0005Xl6\u0001@\u001bh&\u0016\u0014Xu&\u0016\u000e\u0011i4X\f\u0017piX";
                    obj = 7;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "IC'$\u0011\f\u0014''\n\u0019Xf4\u0019\t\u0016'<\u0016@\u0016b+\f@\u0000j#\b@\u001bh=\u0016\u0005\u001bs";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0001\u0000h?\u0017\u0014\u0014'5\u0019\t\u0014b7X\u0014\u0017' \u001d\u0014Xw!\u001d@\u0013b*XH\u001du!\u0017\u0012;h7\u001d]";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0001\u0000h?\u0017\u0014\u0014''\n\t\u001dcs\f\u000fXt6\f@\ri2\u001b\u0003\u001dw'\u0019\u0002\u0014bs\b\u0012\u001d'8\u001d\u0019\u000b'{\u001d\u0012\nh!;\u000f\u001cbn";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "IC'!\u001d\u0007\u001di6\n\u0001\fn=\u001f@\u0013b*\u000b";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = " \u000b)$\u0010\u0001\ft2\b\u0010Vi6\f";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0001\u0000h?\u0017\u0014\u0014'#\n\u0005Xl6\u0001@\nb\"\r\u0005\u000bss\u001e\u000f\n'";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static App a(mo moVar) {
        return moVar.a;
    }

    public void a(String str) {
        Log.i(z[7] + str + z[6]);
        this.a.c(new _5(this, str));
    }

    public void a(bj bjVar, int i) {
        Log.i(z[8] + i);
        a(bjVar);
    }

    public void b(int i) {
        if (i == 406) {
            Log.e(z[11] + i + z[12]);
            this.a.c(new anm(this));
            if (App.az == 0) {
                return;
            }
        }
        Log.e(z[10] + i + z[9]);
        this.a.f.remove(App.af() + z[13]);
    }

    public void a() {
        Log.i(z[2]);
        this.a.c(new vj(this));
    }

    private void a(bj bjVar) {
        this.a.c(new asv(this, bjVar));
    }

    public void a(int i) {
        Log.i(z[3] + i);
        if (i < 32) {
            a(null);
        }
    }

    public void a(String str, int i) {
        Log.i(z[1] + str + z[0] + i);
        this.a.f.remove(str);
    }

    public void a(String str, byte[] bArr, byte[] bArr2, byte b, cz czVar, cz czVar2) {
        Log.i(z[5] + str + z[4]);
        this.a.c(new jl(this, str, bArr, b, czVar, czVar2, bArr2));
    }

    public mo(App app) {
        this.a = app;
    }
}
