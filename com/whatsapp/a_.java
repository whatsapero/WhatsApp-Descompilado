package com.whatsapp;

import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a_ implements Runnable {
    private static final String[] z;
    final int a;
    final jg b;
    final int c;
    final long d;
    final m e;

    static {
        String[] strArr = new String[5];
        String str = "\u00112fml\u0004&)lb\u0002!le#\u0003%dd#\u00008ljf\t9)qq\u0015<`nv\u0003&p!p\u0015$}!b\u0003j|op\u0015$};#";
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
                        i3 = 112;
                        break;
                    case ay.f /*1*/:
                        i3 = 74;
                        break;
                    case ay.n /*2*/:
                        i3 = 9;
                        break;
                    case ay.p /*3*/:
                        i3 = 1;
                        break;
                    default:
                        i3 = 3;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "P'hu`\u0018/m!p\u00158\u007fdqP8lfj\u0003>{`w\u0019%g!j\u0014j";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "P#g!q\u0015 lbw\u0015.)sf\u00048p";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u00112fml\u0004&)ml\u0013+e!q\u0015-`rw\u0002+}hl\u001ej`e#";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u00112fml\u0004&)gl\u0005$m!m\u001fjysf\u001b/pr#\u0011<hho\u0011(ed#\u0004%)rf\u001e.)ulP>ad#\u0003/{wf\u0002";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a_(jg jgVar, int i, m mVar, long j, int i2) {
        this.b = jgVar;
        this.a = i;
        this.e = mVar;
        this.d = j;
        this.c = i2;
    }

    public void run() {
        int b = jg.a(this.b).a6.b();
        if (b == this.c) {
            Log.i(z[4] + b + z[2] + this.c + z[3]);
            jg.a(this.b).U().post(new ato(this, jg.a(this.b).a6.a(), b, jg.a(this.b).a6.f(), jg.a(this.b).a6.c().a(), false));
            return;
        }
        Log.i(z[0] + jg.a(this.b).a6.g());
        if (!jg.a(this.b).a6.d()) {
            Log.i(z[1]);
            jg.a(this.b).a6.b();
        }
        jg.a(this.b).U().post(new ato(this, jg.a(this.b).a6.a(), b, jg.a(this.b).a6.f(), jg.a(this.b).a6.c().a(), true));
    }
}
