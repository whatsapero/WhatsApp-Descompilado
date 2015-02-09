package com.google;

import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class gc extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private static final String[] z;
    private a1 a;

    static {
        int i;
        String[] strArr = new String[8];
        char[] toCharArray = "\u000f\u001dj`\u001f<\u0000i4\u001d:\u001cvu\u0017:Oqu\u0017\u007f\u0007dpP6\u0001su\u001c6\u000b%c\u0019-\n%`\t/\n+".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 95;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 5;
                    break;
                case ay.p /*3*/:
                    i2 = 20;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u000f\u001dj`\u001f<\u0000i4\u001d:\u001cvu\u0017:Of{\u001e+\u000elz\u0015;OdzP6\u0001su\u001c6\u000b%`\u00118O-n\u0015-\u0000,:".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 95;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 5;
                    break;
                case ay.p /*3*/:
                    i2 = 20;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u000f\u001dj`\u001f<\u0000i4\u001d:\u001cvu\u0017:Oru\u0003\u007f\u001bj{P3\u000ews\u0015qO%Y\u0011&OgqP2\u000ei}\u00136\u0000pg^\u007fOPg\u0015\u007f,jp\u0015;&kd\u0005+<qf\u0015>\u0002+g\u0015+<ln\u0015\u0013\u0006h}\u0004wF%`\u001f\u007f\u0006kw\u0002:\u000evqP+\u0007`4\u00036\u0015`4\u001c6\u0002l`^".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 95;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 5;
                    break;
                case ay.p /*3*/:
                    i2 = 20;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u001c\u0000aq\u0014\u0016\u0001ua\u0004\f\u001bwq\u00112O`z\u00130\u001ak`\u0015-\na4\u00111O`y\u0012:\u000baq\u0014\u007f\u001cqf\u00191\b%{\u0002\u007f\u0002`g\u0003>\b`4\u00077\u0006f|P<\u0003d}\u001d:\u000b%`\u001f\u007f\u0007db\u0015\u007f\u0001`s\u0011+\u0006sqP,\u0006\u007fq^".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 95;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 5;
                    break;
                case ay.p /*3*/:
                    i2 = 20;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u000f\u001dj`\u001f<\u0000i4\u001d:\u001cvu\u0017:Omu\u0014\u007f\u001bj{P2\u000ekmP3\nsq\u001c,OjrP1\nv`\u00191\b+4P\u0012\u000e|4\u0012:Ohu\u001c6\fl{\u0005,A%4%,\n%W\u001f;\na]\u001e/\u001aqG\u0004-\ndy^,\nqF\u0015<\u001awg\u00190\u0001I}\u001d6\u001b-=P+\u0000%}\u001e<\u001d`u\u0003:Oq|\u0015\u007f\u000b`d\u00047Oi}\u001d6\u001b+".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 95;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 5;
                    break;
                case ay.p /*3*/:
                    i2 = 20;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "\u001c\u0000aq\u0014\u0016\u0001ua\u0004\f\u001bwq\u00112O`z\u00130\u001ak`\u0015-\na4\u0011\u007f\u0002dx\u00160\u001dhq\u0014\u007f\u0019df\u00191\u001b+".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 95;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 5;
                    break;
                case ay.p /*3*/:
                    i2 = 20;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "\b\u0007lx\u0015\u007f\u001fdf\u00036\u0001b4\u0011\u007f\u001fw{\u00040\fjxP2\nvg\u00118\n)4\u00047\n%}\u001e/\u001aq4\u00151\u000b`pP*\u0001`l\u0000:\fqq\u00143\u0016%}\u001e\u007f\u001bmqP2\u0006ap\u001c:OjrP>Oc}\u00153\u000b+4P\u000b\u0007lgP<\u0000px\u0014\u007f\u0002`u\u001e\u007f\nl`\u0018:\u001d%`\u0018>\u0001%`\u0018:Olz\u0000*\u001b%|\u0011,Ogq\u00151Oqf\u00051\fd`\u0015;OjfP+\u0007d`P>\u0001%q\u001d=\nap\u0015;Ohq\u0003,\u000ebqP2\u0006vf\u0015/\u0000w`\u0015;Ol`\u0003\u007f\u0000rzP3\nks\u00047A".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 95;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 5;
                    break;
                case ay.p /*3*/:
                    i2 = 20;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "\u000f\u001dj`\u001f<\u0000i4\u001d:\u001cvu\u0017:O`z\u0014r\bw{\u0005/Oqu\u0017\u007f\u000blpP1\u0000q4\u001d>\u001bf|P:\u0017uq\u0013+\na4\u0004>\b+".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 95;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 5;
                    break;
                case ay.p /*3*/:
                    i2 = 20;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[7] = new String(cArr).intern();
        z = strArr;
    }

    static gc e() {
        return new gc(z[2]);
    }

    public gc a(a1 a1Var) {
        this.a = a1Var;
        return this;
    }

    static gc h() {
        return new gc(z[3]);
    }

    static gc a() {
        return new gc(z[4]);
    }

    public a1 c() {
        return this.a;
    }

    static gc d() {
        return new gc(z[1]);
    }

    static gc g() {
        return new gc(z[7]);
    }

    static gc f() {
        return new gc(z[5]);
    }

    public gc(String str) {
        super(str);
        this.a = null;
    }

    static gc i() {
        return new gc(z[6]);
    }

    static gc b() {
        return new gc(z[0]);
    }
}
