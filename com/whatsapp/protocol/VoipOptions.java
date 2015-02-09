package com.whatsapp.protocol;

import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class VoipOptions {
    private static final String[] z;
    public final Aec aec;
    public final Agc agc;
    public final AudioRestrict audioRestrict;
    public final Decode decode;
    public final Encode encode;
    public final Miscellaneous miscellaneous;
    public final NoiseSuppression noiseSuppression;

    public final class Aec {
        private static final String[] z;
        public final String algorithm;
        public final Integer length;
        public final Short mode;
        public final Integer offset;

        static {
            String[] strArr = new String[11];
            String str = "\u007f0j_:{";
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
                            i3 = 19;
                            break;
                        case ay.f /*1*/:
                            i3 = 85;
                            break;
                        case ay.n /*2*/:
                            i3 = 4;
                            break;
                        case ay.p /*3*/:
                            i3 = 56;
                            break;
                        default:
                            i3 = 78;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "|3bK+g";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "~:`]";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        str = "\u007f0j_:{";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "~:`]";
                        obj = 4;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "|3bK+g";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case aV.r /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "?uk^(`0p\u0005";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case aV.i /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "R0gC/\u007f2kJ'g=i\u0005i";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case a8.s /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "?uh] t!l\u0005";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case a8.n /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "?uiW*vh";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case a6.D /*9*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "r9cW<z!lU";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public Aec(String str, Integer num, Integer num2, Short sh) {
            this.algorithm = str;
            this.offset = num;
            this.length = num2;
            this.mode = sh;
        }

        public static com.whatsapp.protocol.VoipOptions.Aec fromProtocolTreeNode(bi biVar) {
            if (biVar == null) {
                return null;
            }
            return new com.whatsapp.protocol.VoipOptions.Aec(biVar.b(z[1]), VoipOptions.access$000(biVar.b(z[6]), z[2]), VoipOptions.access$000(biVar.b(z[4]), z[0]), VoipOptions.access$100(biVar.b(z[5]), z[3], 0, 2));
        }

        public String toString() {
            return z[8] + this.algorithm + '\'' + z[7] + this.offset + z[9] + this.length + z[10] + this.mode + '}';
        }
    }

    public final class Agc {
        private static final String[] z;
        public final Short compressionGain;
        public final Boolean enableLimiter;
        public final Short mode;
        public final Short targetLevel;

        static {
            String[] strArr = new String[11];
            String str = "\u0001t\f\u001d";
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
                            i3 = 108;
                            break;
                        case ay.f /*1*/:
                            i3 = 27;
                            break;
                        case ay.n /*2*/:
                            i3 = 104;
                            break;
                        case ay.p /*3*/:
                            i3 = 120;
                            break;
                        default:
                            i3 = 18;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "\u0018z\u001a\u001fw\u0018w\r\u000ew\u0000";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "\u0001t\f\u001d";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        str = "\u0000r\u0005\u0011f\ti\r\u0016s\u000ew\r";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "\u0018z\u001a\u001fw\u0018;\u0004\u001dd\tw";
                        obj = 4;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "\u000ft\u0005\b`\th\u001b\u0011}\u0002|\t\u0011|";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case aV.r /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "@;\u000b\u0017\u007f\u001ci\r\u000ba\u0005t\u0006?s\u0005uU";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case aV.i /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "@;\u0005\u0017v\t&";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case a8.s /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "@;\r\u0016s\u000ew\r4{\u0001r\u001c\u001d`Q";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case a8.n /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "-|\u000b\u0003f\ri\u000f\u001df ~\u001e\u001d~Q";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case a6.D /*9*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "\u000ft\u0005\b`\th\u001b\u0011}\u0002;\u000f\u0019{\u0002";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public String toString() {
            return z[10] + this.targetLevel + z[7] + this.compressionGain + z[9] + this.enableLimiter + z[8] + this.mode + '}';
        }

        public Agc(Short sh, Short sh2, Boolean bool, Short sh3) {
            this.targetLevel = sh;
            this.compressionGain = sh2;
            this.enableLimiter = bool;
            this.mode = sh3;
        }

        public static com.whatsapp.protocol.VoipOptions.Agc fromProtocolTreeNode(bi biVar) {
            if (biVar == null) {
                return null;
            }
            return new com.whatsapp.protocol.VoipOptions.Agc(VoipOptions.access$100(biVar.b(z[2]), z[5], 0, 31), VoipOptions.access$100(biVar.b(z[6]), z[1], 0, 90), VoipOptions.access$200(biVar.b(z[4])), VoipOptions.access$100(biVar.b(z[0]), z[3], 0, 2));
        }
    }

    public final class AudioRestrict {
        private static final String[] z;
        public final String encoding;
        public final Integer rate;

        static {
            String[] strArr = new String[5];
            String str = "9Bdi";
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
                            i3 = 75;
                            break;
                        case ay.f /*1*/:
                            i3 = 35;
                            break;
                        case ay.n /*2*/:
                            i3 = 16;
                            break;
                        case ay.p /*3*/:
                            i3 = 12;
                            break;
                        default:
                            i3 = 21;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "9Bdi";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "g\u0003bma.\u001e";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "\nVtez\u0019Fcxg\"@dwp%@\u007fh|%D-+";
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = ".Ms";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public String toString() {
            return z[4] + this.encoding + '\'' + z[3] + this.rate + '}';
        }

        public AudioRestrict(String str, Integer num) {
            this.encoding = str;
            this.rate = num;
        }

        public static com.whatsapp.protocol.VoipOptions.AudioRestrict fromProtocolTreeNode(bi biVar) {
            return biVar == null ? null : new com.whatsapp.protocol.VoipOptions.AudioRestrict(biVar.b(z[1]), VoipOptions.access$000(biVar.b(z[0]), z[2]));
        }
    }

    public final class Decode {
        private static final String[] z;
        public final Boolean forwardErrorCorrection;
        public final Short gain;

        static {
            String[] strArr = new String[5];
            String str = "\u0011r\u0005A";
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
                            i3 = 118;
                            break;
                        case ay.f /*1*/:
                            i3 = 19;
                            break;
                        case ay.n /*2*/:
                            i3 = 108;
                            break;
                        case ay.p /*3*/:
                            i3 = 47;
                            break;
                        default:
                            i3 = 47;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "\u0011r\u0005A";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "2v\u000f@K\u0013h\u000bNF\u0018.";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "\u0010|\u001eXN\u0004w)]]\u0019a/@]\u0004v\u000f[F\u0019}Q";
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "\u0010v\u000f";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public String toString() {
            return z[3] + this.gain + z[4] + this.forwardErrorCorrection + '}';
        }

        public Decode(Short sh, Boolean bool) {
            this.gain = sh;
            this.forwardErrorCorrection = bool;
        }

        public static com.whatsapp.protocol.VoipOptions.Decode fromProtocolTreeNode(bi biVar) {
            return biVar == null ? null : new com.whatsapp.protocol.VoipOptions.Decode(VoipOptions.access$400(biVar.b(z[0]), z[2]), VoipOptions.access$200(biVar.b(z[1])));
        }
    }

    public final class Encode {
        private static final String[] z;
        public final Short complexity;
        public final Boolean enableConstantBitrate;
        public final Boolean enableDiscontinuousTransmission;
        public final Boolean forwardErrorCorrection;
        public final Integer targetBitrate;

        static {
            String[] strArr = new String[13];
            String str = "k0\u001f\ni u\u001f)r3b\n\u001f~z";
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
                            i3 = 71;
                            break;
                        case ay.f /*1*/:
                            i3 = 16;
                            break;
                        case ay.n /*2*/:
                            i3 = 107;
                            break;
                        case ay.p /*3*/:
                            i3 = 107;
                            break;
                        default:
                            i3 = 27;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "\u0002~\b\u0004\u007f\"k\b\u0004v7|\u000e\u0013r3iV";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "k0\r\u0004i0q\u0019\u000f^5b\u0004\u0019X(b\u0019\u000ex3y\u0004\u0005&";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        str = "k0\u000e\u0005z%|\u000e/r4s\u0004\u0005o.~\u001e\u0004n4D\u0019\nu4}\u0002\u0018h.\u007f\u0005V";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "#d\u0013";
                        obj = 4;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "%y\u001f\u0019z3u";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case aV.r /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "$\u007f\u0006\u001bw\"h\u0002\u001fb";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case aV.i /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "$\u007f\u0006\u001bw\"h\u0002\u001fb";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case a8.s /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "&e\u001f\u0004";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case a8.n /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "$r\u0019";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case a6.D /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "%y\u001f\u0019z3u";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case a6.h /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "!u\b";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case a6.e /*11*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "k0\u000e\u0005z%|\u000e(t)c\u001f\nu3R\u0002\u001fi&d\u000eV";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public static com.whatsapp.protocol.VoipOptions.Encode fromProtocolTreeNode(bi biVar) {
            Integer num = null;
            if (biVar == null) {
                return null;
            }
            String b = biVar.b(z[8]);
            String b2 = biVar.b(z[10]);
            String b3 = biVar.b(z[5]);
            String b4 = biVar.b(z[6]);
            String b5 = biVar.b(z[12]);
            Short access$100 = VoipOptions.access$100(b, z[7], 1, 10);
            Boolean access$200 = VoipOptions.access$200(b2);
            Boolean access$2002 = VoipOptions.access$200(b3);
            if (!z[9].equals(b4)) {
                num = VoipOptions.access$300(b4, z[11], 6000, 51000);
            }
            return new com.whatsapp.protocol.VoipOptions.Encode(access$100, access$200, access$2002, num, VoipOptions.access$200(b5));
        }

        public String toString() {
            return z[2] + this.complexity + z[1] + this.enableConstantBitrate + z[4] + this.enableDiscontinuousTransmission + z[0] + this.targetBitrate + z[3] + this.forwardErrorCorrection + '}';
        }

        public Encode(Short sh, Boolean bool, Boolean bool2, Integer num, Boolean bool3) {
            this.complexity = sh;
            this.enableConstantBitrate = bool;
            this.enableDiscontinuousTransmission = bool2;
            this.targetBitrate = num;
            this.forwardErrorCorrection = bool3;
        }
    }

    public final class Miscellaneous {
        private static final String[] z;
        public final Boolean enableComfortNoiseGeneration;
        public final Boolean enableHighPassFiltering;

        static {
            String[] strArr = new String[4];
            String str = "U_\u000ej\u0010\u001b\u0013\u000eL\u0018\u001e\u0017;e\u0002\n9\u0002h\u0005\u001c\r\u0002j\u0016D";
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
                            i3 = 121;
                            break;
                        case ay.f /*1*/:
                            i3 = 127;
                            break;
                        case ay.n /*2*/:
                            i3 = 107;
                            break;
                        case ay.p /*3*/:
                            i3 = 4;
                            break;
                        default:
                            i3 = 113;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "\u001a\u0011\f";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "\u0011\u000f\r";
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "4\u0016\u0018g\u0014\u0015\u0013\nj\u0014\u0016\n\u0018\u007f\u0014\u0017\u001e\th\u0014:\u0010\u0006b\u001e\u000b\u000b%k\u0018\n\u001a,a\u001f\u001c\r\np\u0018\u0016\u0011V";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public static com.whatsapp.protocol.VoipOptions.Miscellaneous fromProtocolTreeNode(bi biVar) {
            return biVar == null ? null : new com.whatsapp.protocol.VoipOptions.Miscellaneous(VoipOptions.access$200(biVar.b(z[2])), VoipOptions.access$200(biVar.b(z[3])));
        }

        public Miscellaneous(Boolean bool, Boolean bool2) {
            this.enableComfortNoiseGeneration = bool;
            this.enableHighPassFiltering = bool2;
        }

        public String toString() {
            return z[1] + this.enableComfortNoiseGeneration + z[0] + this.enableHighPassFiltering + '}';
        }
    }

    public final class NoiseSuppression {
        private static final String[] z;
        public final Short mode;

        static {
            String[] strArr = new String[3];
            String str = "z\r59sg\u0017,:dQ\u0011/#yZ\u00191%rQ_";
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
                            i3 = 52;
                            break;
                        case ay.f /*1*/:
                            i3 = 98;
                            break;
                        case ay.n /*2*/:
                            i3 = 92;
                            break;
                        case ay.p /*3*/:
                            i3 = 74;
                            break;
                        default:
                            i3 = 22;
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
                        str = "Y\r8/";
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "Y\r8/";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public static com.whatsapp.protocol.VoipOptions.NoiseSuppression fromProtocolTreeNode(bi biVar) {
            return biVar == null ? null : new com.whatsapp.protocol.VoipOptions.NoiseSuppression(VoipOptions.access$100(biVar.b(z[1]), z[2], 0, 3));
        }

        public String toString() {
            return z[0] + this.mode + '}';
        }

        public NoiseSuppression(Short sh) {
            this.mode = sh;
        }
    }

    static {
        String[] strArr = new String[23];
        String str = "qg\u001cEg";
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
                        i3 = 23;
                        break;
                    case ay.f /*1*/:
                        i3 = 6;
                        break;
                    case ay.n /*2*/:
                        i3 = 112;
                        break;
                    case ay.p /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = 2;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "7.";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "Ai\u0019FMgr\u0019Yld}\u0011Sa*";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ";&\u0011Cf~i\"Sqct\u0019Uv*";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ";&\u0011Qa*";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    str = ";&\u001d_qtc\u001cZcyc\u001fCq*";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = ";&\u0015Xaxb\u0015\u000b";
                    obj = 6;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ";&\u0014Saxb\u0015\u000b";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ";&\u001eYkdc#Crgt\u0015Eq~i\u001e\u000b";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "~h\u0006Wn~bP\u001d\"";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "-&";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "~h\u0006Wn~bP\u001d\"";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "-&";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "va\u0013";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "yu";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "sc\u0013Yfr";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "rh\u0013Yfr";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "xv\u0004_myu";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "vs\u0014_m";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "vc\u0013";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "7.";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = ">&\u001fCvdo\u0014S\"x`P@c{o\u0014\u0016pvh\u0017S\"L";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ">&\u001fCvdo\u0014S\"x`P@c{o\u0014\u0016pvh\u0017S\"L";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static Short access$100(String str, String str2, int i, int i2) {
        return convertAttributeToShort(str, str2, i, i2);
    }

    public static VoipOptions fromProtocolTreeNode(bi biVar, boolean z) {
        try {
            return new VoipOptions(Aec.fromProtocolTreeNode(biVar.d(z[20])), Encode.fromProtocolTreeNode(biVar.d(z[17])), Decode.fromProtocolTreeNode(biVar.d(z[16])), Miscellaneous.fromProtocolTreeNode(biVar.d(z[18])), Agc.fromProtocolTreeNode(biVar.d(z[14])), z ? AudioRestrict.fromProtocolTreeNode(biVar.d(z[19])) : null, NoiseSuppression.fromProtocolTreeNode(biVar.d(z[15])));
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public String toString() {
        return z[3] + this.aec + z[7] + this.encode + z[8] + this.decode + z[6] + this.miscellaneous + z[5] + this.agc + z[4] + this.audioRestrict + z[9] + this.noiseSuppression + '}';
    }

    static Integer access$300(String str, String str2, int i, int i2) {
        return convertAttributeToInteger(str, str2, i, i2);
    }

    public VoipOptions(Aec aec, Encode encode, Decode decode, Miscellaneous miscellaneous, Agc agc, AudioRestrict audioRestrict, NoiseSuppression noiseSuppression) {
        this.aec = aec;
        this.encode = encode;
        this.decode = decode;
        this.miscellaneous = miscellaneous;
        this.agc = agc;
        this.audioRestrict = audioRestrict;
        this.noiseSuppression = noiseSuppression;
    }

    private static Integer convertAttributeToInteger(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            throw new l(z[10] + str2 + z[11] + str);
        }
    }

    private static Short convertAttributeToShort(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return new Short(Short.parseShort(str));
        } catch (NumberFormatException e) {
            throw new l(z[12] + str2 + z[13] + str);
        }
    }

    static Integer access$000(String str, String str2) {
        return convertAttributeToInteger(str, str2);
    }

    public VoipOptions() {
        this(null, null, null, null, null, null, null);
    }

    static Boolean access$200(String str) {
        return convertAttributeToBoolean(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Integer convertAttributeToInteger(java.lang.String r5, java.lang.String r6, int r7, int r8) {
        /*
        r0 = convertAttributeToInteger(r5, r6);
        if (r0 == 0) goto L_0x0055;
    L_0x0006:
        r1 = r0.intValue();	 Catch:{ NumberFormatException -> 0x0053 }
        if (r1 < r7) goto L_0x0012;
    L_0x000c:
        r1 = r0.intValue();	 Catch:{ NumberFormatException -> 0x0051 }
        if (r1 <= r8) goto L_0x0055;
    L_0x0012:
        r1 = new com.whatsapp.protocol.l;	 Catch:{ NumberFormatException -> 0x0051 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0051 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0051 }
        r2 = r2.append(r6);	 Catch:{ NumberFormatException -> 0x0051 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x0051 }
        r4 = 21;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0051 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0051 }
        r0 = r2.append(r0);	 Catch:{ NumberFormatException -> 0x0051 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0051 }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0051 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0051 }
        r0 = r0.append(r7);	 Catch:{ NumberFormatException -> 0x0051 }
        r2 = ",";
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0051 }
        r0 = r0.append(r8);	 Catch:{ NumberFormatException -> 0x0051 }
        r2 = "]";
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0051 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0051 }
        r1.<init>(r0);	 Catch:{ NumberFormatException -> 0x0051 }
        throw r1;	 Catch:{ NumberFormatException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0051 }
    L_0x0055:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.VoipOptions.convertAttributeToInteger(java.lang.String, java.lang.String, int, int):java.lang.Integer");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Short convertAttributeToShort(java.lang.String r5, java.lang.String r6, int r7, int r8) {
        /*
        r0 = convertAttributeToShort(r5, r6);
        if (r0 == 0) goto L_0x0053;
    L_0x0006:
        r1 = r0.shortValue();	 Catch:{ NumberFormatException -> 0x0051 }
        if (r1 < r7) goto L_0x0012;
    L_0x000c:
        r1 = r0.shortValue();	 Catch:{ NumberFormatException -> 0x004f }
        if (r1 <= r8) goto L_0x0053;
    L_0x0012:
        r1 = new com.whatsapp.protocol.l;	 Catch:{ NumberFormatException -> 0x004f }
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x004f }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x004f }
        r2 = r2.append(r6);	 Catch:{ NumberFormatException -> 0x004f }
        r3 = z;	 Catch:{ NumberFormatException -> 0x004f }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x004f }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x004f }
        r0 = r2.append(r0);	 Catch:{ NumberFormatException -> 0x004f }
        r2 = z;	 Catch:{ NumberFormatException -> 0x004f }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x004f }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x004f }
        r0 = r0.append(r7);	 Catch:{ NumberFormatException -> 0x004f }
        r2 = ",";
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x004f }
        r0 = r0.append(r8);	 Catch:{ NumberFormatException -> 0x004f }
        r2 = "]";
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x004f }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x004f }
        r1.<init>(r0);	 Catch:{ NumberFormatException -> 0x004f }
        throw r1;	 Catch:{ NumberFormatException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x004f }
    L_0x0053:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.VoipOptions.convertAttributeToShort(java.lang.String, java.lang.String, int, int):java.lang.Short");
    }

    private static Boolean convertAttributeToBoolean(String str) {
        try {
            if (!"0".equals(str)) {
                if (!z[0].equals(str)) {
                    try {
                        if (str == null) {
                            return null;
                        }
                        try {
                            return Boolean.TRUE;
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                }
            }
            return Boolean.FALSE;
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    static Short access$400(String str, String str2) {
        return convertAttributeToShort(str, str2);
    }
}
