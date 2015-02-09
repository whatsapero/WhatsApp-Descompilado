package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ce {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;

    static {
        String str = ";:Ew\u0007|aRkT6 Et\u000e})^hZ?+\u001fdR>aVbS6<PsX\f|\u00013";
        Object obj = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 65;
                        break;
                    case ay.f /*1*/:
                        i2 = 92;
                        break;
                    case ay.n /*2*/:
                        i2 = 35;
                        break;
                    case ay.p /*3*/:
                        i2 = 21;
                        break;
                    default:
                        i2 = 47;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    r = a(str);
                    str = ";:EwNia\u001eq\u0013$&PsN2>A)S6:\u001eq\u000f|+InN'";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    f = a(str);
                    str = ";:EwNia\u001eq\u0013$&PsN2>A)S6:\u001eq\u000f|-^cX";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    l = a(str);
                    str = ";:EwNia\u001eq\u0013$&PsN2>A)S6:\u001eq\u000f|<T`T :Tu";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    n = a(str);
                    str = ";:EwNia\u001epJ$`Fo\\'=PwM}-^j\u0012 :PsH `AoMl8\f5";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    c = a(str);
                    str = "g$\u0012b\u0017\u0015w\u001aJNv2V6Cf`\u0002uur9T+";
                    obj = 5;
                    break;
                case aV.r /*5*/:
                    p = a(str);
                    str = "`~\t5\ra/\t4\rk|\u00015\u000be/\u00017\u000ec|\u00016\ra~\u00037\tg*\u00052X`\u007fS4\rc,\u00011\rd|P?\u000bgvRb\u000ek~\u00057\u000ec{\u00017\u000ec}\u00064\fc,\u00027\rj~\u00077\u000ef{\u00013\re\u007f\u00027\u000ff{\u00044\u000eb\u007f\u00014\rc+\u00011\r`{\u00047\tc/\u00004\rdz\u00001Xez\u00065\u000b5x\b1\t`\u007f\u00001\u000ec\u007f\u00057\u000bc}\u00042\rg~\u00026\u000ec*\u00056\u000b6x\u00050\u000fe(\u0007>\u000bg|\u00013\te{\u00075\nfx\u00064\rb+\u00000\r7}\u00004\f`~\u00026\u000e`}\u00014\u000f`|\u00026\u000ef}\u00044\bf/\u00000\r7}\u00034\f`~\u00026\u000ea}\u00064\u000f`|\u00026\u000ef}\u00044\bf/\u00027\u000ed}\u00007_`~\u0001>\re~\u00022\bcz\u00011\f`~\u00032\bf}\u00026\fc}\u00017Xcx\u00014\bf~\u00057\\b}\u00010\tbxT1\td|\u0007a\u000bjx\u00054\fbx\u00027\fg~\u00077\u000ef{\u00013\r`\u007f\u00027Yg\u007f\u0007b\u000bgy\u00031[ew\u00073\u000fcz\u00051\be|\u00062\u000bd}\u0001?\u000fc\u007fS?\u000ecv\u00037\fa-\u00011\rd|P?\u000bgvRb\u000ek~\u00057\f`~\t5\rb\u007fW7\u000fk\u007f\t6\rc(U0[f}\t6\f7y\u00046\u000faw\u00045Y5zP>^a+TdXg+\u0006a\u000bb\u007fS0\ba}Rb[gz\u00017^`\u007fT4[k~S1\bb|\u00071\u0004g{\u0004c\tc|\u00032\f5,\u0004>\u000e7vU2\u00055/Sa^f(\u0004e\\`~W1^1wS2\be-U0\u0005b}S?\rb*\u00023\u000b5(\u00031\u000be~S0\u000b1w\b2\r2{P3\u00045wWb\u0005cz\u0006e\fc|\u0003d\u000fg(Se\\j*\u0006aX1yR1\f1(\t4_fyT0^e/\tf\u000bb{\u0001a\rg(S?\u000e5xU4^f\u007fTd\u000ec|\u00022\bg\u007f\u00022\\bx\b6\u000ea(\u00070\b5}Pb\u000f1x\u0000c\na/Ta[a|\u00037\u000ebw\bcYbz\t7\f0y\u00015\ff~\u0001>\ne~\u00047\u00055\u007f\u00045\u000ec,Rd_aw\u0003e\u0004k|P5X1v\u00057_5~\u0004?\f0(\u00047\u000fk\u007f\t6\rc(\u0006b\f2~\t2YewS4Y7+Re_0/S2^`xS?\bd,\b0\u0004jzPa_1(P4\\6/\t5[j{\u00063^c,\u0002c\rdv\u00031\nf\u007f\u0004>\bdvTe\\7z\u0004>\t5+\u00070\fcy\u00007\u0005bv\u0001e\tgw\u00001\nb|\u0002b\u0005g-\u0003?\fe\u007f\u0002e\n0(\u0001>\u000eavRd\u00052xT6\u000e0\u007f\u00070\\k,\u00043\n0vU5\u00056~P4\\6\u007fT5_1}P1\nfw\u00001X2}\u0006a\r1(P5\f`{\u00075[b(S1\u000fd/\u00016\u000fg}Sd^2zW6_6/\t2\fj~\t>\\kv\u0002c[6\u007f\u0004fXfwW7\u000bj|\te\u000be{T?\rd,\u00042\u000ffx\u00057\fg-\u0002e[6-W3\u0004a/\u00014\u0005bv\u00047\rc|\t6\u0005b~\u0001d_d*\td\f7\u007f\u00041\u000bb*W2Ye~\be[a(T3_1}W3\bd*\u00000\r1zTb_c,P1\u000b2(R0\n`,\u00023[bz\t?_6}T>\n1-\tc\nc}W2\u0005j|Rc\\bv\u00013\u0005d+S2Yc}U3\tb\u007f\u00000\tj(\u0003a\t1,\u00007_7w\b0\\c|\b6\bbwT7^a}S3[j(\u0000a\n5wR7\f5{Wf\u000ba/\u0004bY6z\u0001c\u00050*U3\u000b5/P0\u00045{\u00030^5,\u0005>\na~\ta\u0005k|U4X`+\bf\u0005`(R6^g/\u00003_ky\u00010^j}W5\\g{\u00064\td{S7\bb,T6\u000ekzR0\u0004`|Pf\nk-T4\ng,R4\n6vR0\f`}\u00042\u000ec~S7\u000bcy\u0003f\u0005ez\tdX`v\u00013\r`~\u00047\rc}\u0003a\rc}\u00015^c|\u00003\n6z\u00002X0{\u0000>\\b/Se^f(\u00042\\`(S2\ra*Pb\u000b7*Wa\f5zU7\ra\u007f\u00057\\7(\u0004d\\1yWd\r5}\u0006b\u00052,W?Yb}W5[a/\b2\u00040(T3\\cz\u0003";
                    obj = 6;
                    break;
                case aV.i /*6*/:
                    h = a(str);
                    str = "`~\t5\r`}\u00034\rk|\u00015[c/\u00017\u000ec|\u00016\ra~\u00037\tg-\u00032\u000ee/\u00054\rc,\u00011\rd|P?\u000bgvRb\u000ek~\u00057\u000ec{\u00017\u000ecyR4\fc,\u00027\rj~\u00077\u000ef{\u00013\re\u007f\u00027\u000ff{\u00044\u000eb\u007f\u00024\rb\u007f\u00011\r`{\u00047\tcv\u00004\r2z\u00021\fe-\u0007>\u000bexW0\u000fe+\u0007>\u000bb}\u00006\t`~\u00005\re~\u00022\bcz\u00010\f`~S2\u000ee\u007f\u0007b\ngx\u00005\rg}\u0007d\u000bby\u00031\f`\u007f\u00001\u000ec\u007f\u00057\u000bc}\u00042\rg~P6\u000ec*\u00040\u000bkx\u00000\td}\u00056\ncy\u00015\rgw\u0007b\u000b`|T4\fbz\u00027\fa~\u00077\u000ef{\u00013\r1\u007f\u00027_g{\u0007b\u000bdx\b1Xe{\u00072\nax\b1Xey\u00026\fg}\u00016\u000fcx\u00014\bf~\u00057\u000eb}\u0001e\tay\u00031\u0004e\u007f\u0007b\u000fcz\u00001\u000edz\u0007a\u000b6}\u00016Xby\u0001c\u000eb}\u00014\r`x\u00025\u000ef}\u00034\u000e`~\u00020\u000eb}\u00072\\by\u0001c\u000eg}\u00054\r`|\u00026\u000ef}\u00034\u000e`~\u00020\u000eb}\u00072\\`~\u0006d\u000eb~S4\rcw\u00011\r`{\u00047\tcx\u00004\ra{\u00042\u000e`\u007f\u00004\u000ec\u007f\u00007\u000bc}\u00042\rg~\t6\u000ec/\u00054\u000bbxR1\u0004ex\u0007a\naxT1\u0004e\u007f\u00026\fg}\u00016\u000fcx\u00014\bf~\u00057\nb}\u0001e\b`x\u00001Xdz\u00076\u000fcz\u00021^e\u007f\u00065\u000bb}\u00006\u000b`~\u00003\re~\u00022\bcz\u0001f\f`~U2\nev\u00076\ngy\u00023\fd~\u00067\u000fcz\b1Xe}\u0003b\u000eb\u007f\u00054\rb|\u00011\r`{\u00047\tc,\u00004\r1z\u00041Xey\u0007>\u000b6x\u00041\bd|\u0007>\u000b6x\u00064\fbz\u00027\fa~\u00077\u000ef{\u00013\r`\u007f\u00027_g|\u00065\u000bjx\u00001Xa~\u00056\u000b`y\u00051[e+\u00027\u0005a~\u0000e\u0005`~\t5\rb|R7\u000bcy\u0003f\u0005ez\tdX`v\u00013\rb}\u0001?\u000fc\u007f\u0000a\rav\u0000?\fc~Wc\n5{\u0002?\fb*\u00062\fa|\b2\u000f7(\u0005f\u00040|Tb^6zT0[e\u007f\u0000e\nf|\u0002dX5z\u00057\r0}\u0000b\u000e5v\u0001e\u000bf\u007f\u00031\u000bjz\u00042Yg~\u00035\bb(S2\u0004`*\tc\bk(Pe[0{W2_2}\u0001a\u000b0,\be\bfxRc\nk\u007f\u0002e\u0005c\u007fU4\te(W5\u000bex\u0001e\ne,\b>\bc/\u0004f\tj(\baXk~\u00050_b~\u00035^azWe_2wU0[6,\u0006d\u000bb,W?\u000e1{\u0006b\n0xP?\\e\u007f\u00047[czWe\u0005`(\u0007c\u000e0{\u0000b^`~\u00034\bfz\u00004\b2\u007f\u0007>\f`|W1\nf(\u0002fXa,\u00076Yd|Pb[5|\u00035\r`\u007f\b>Y7\u007f\u0005?\rb-\u00067\u000fb{\u00017\u0004dx\u00012\rk(\u00002\u000f`~Sd^1|\b5_jv\u0003f\u000f6,\t3\r1(\u00012\u0005b-W2\rav\u0000?\fc~W0Xb/\u0001?\b7x\be\u000e7*Td_1-Pe\b0}\u0007e\u0005fyS>\njw\u0005f[1,Wf\u000e2+P?\u000f5w\u00040\t0~S4Ycy\t5\u000bd{\u00002\u0004fy\tb_2*\u00052\u0004g(T1\nb~\u00066\rk\u007f\t7_gz\b6\u000bd\u007f\u00034XkzR5\u0005bx\u00004_d-W7\u0004`|\td^k/\u0007b\f`-\u00001\n2vS2\td-\tc\u000fk+\u0001f\u000e2+\u0000b\u000f1,\u0002f\u000bd{\b6\u000b6/\u00020[c,Wf\u000fb}\u00041\u000f5\u007fWe\u000bayP7\faz\u0002e^0/\u0005a\f1+P?\bbw\u0001?\u00042v\t4Y5+\u00002\\6{\ba\rew\u0003?_ex\u0004b\u0005cyS2\ba{\u00073\rbzR4_5+Ra\tj|P7\u000ek\u007f\t2\rc~\u0003?\fk\u007f\u00017Yb\u007f\b?_g,\t6\u000bkySd[az\u0007c\tb/\tf\na{W7\\jv\bf\bb,Rb\u000eaxT?\t0v\u0003?Xb(\u00042\u000bez\teYd\u007fUf\tky\u00012\t7xUb\nc(Wa\t1z\b3\u000ea,\u0007?\u000ba/P3\u00055-\u0003f\u0004`\u007f\u00076_a-\u00002\\a(W2Xey\u00001\na*We\bdxT>Yb|Pf[5y\u00021\u00041wP>\u00047~\u0005a_awU5_1,S5\\f~\u0002bXg\u007fS6[5}\u0006?\u0005d~\u00073[g\u007fWb\u000fk~\u00041\rj~\u00074\bc~P?Xfz\u00064\tj|\t5Yb{\b?\f0*S2\u00052~\teX7+\u00046Y7yT>\u0005ey\u0003>\b1}Ua_g{Wa^e,\u00032\u0004`~\u0001e\re~\u00065\\kx\u0005?^6}\t7\tc}\u00012\rc~\u00025[c~\u00027\u000f0~\u00036\tc~P1\ra/\u00063\nd/Ra\u0005g\u007f\u00010\na}\u0006eXcw\u0001c[g}\u00072\u0005a-P5[c|\u00003\u000ef~Rb\rax\tc\rd+\u00066Xf{\u00060\t2,\u0005b\\0*\u0005c\rd\u007fRc\f6(Pc";
                    obj = 7;
                    break;
                case a8.s /*7*/:
                    b = a(str);
                    str = ";:EwNia\u001efM:`WhH!=@r\\!+\u001fdR>aG5\u0012%+_rX aBb\\!-Y8\u001b0\"XbS'\u0011Bb^!+E:m\u0015\u001b{^\u000f\u0015\u0002t_d\u001f\fr_u\u0016\u001cvAg\u001a\u001fgP\bc\u007fxQe\u0010\u0016|_n\u001b\u0016\u007fCj\u0017\u0007iRl\u0012\u001a\u0017dQ:+_sb:*\f_l\u0019\u000f\u0001Oja\u0017\u0000Ot\n\u001e\u007f5y\u0011\u0003fU\u000e\u0017\u001eaCi\u001b\u0019\u0003B\f\u0005}\u0002Wq\u0012\bgUw\u0015\u000b|MnbhG:\u000fc\u007f\u00057\u000bc\u007f\u0017";
                    obj = 8;
                    break;
                case a8.n /*8*/:
                    g = a(str);
                    str = ";:EwNia\u001ej\\#=\u001f`R<)]b\\#'B)^<#\u001ej\\#=\u001efM:aAk\\0+\u001etX2<Ro\u00129=^i\u0002 +_tR!sEuH6hZbDn\u000fx}\\\u00007rn[c\f\u0000k\u0005\u001b9\u0002fn0\n}nd:<awN2>G6Y\u0006\u001fYV|u";
                    obj = 9;
                    break;
                case a6.D /*9*/:
                    q = a(str);
                    str = ";:EwNia\u001ej\\#=\u001f`R<)]b\\#'B)^<#\u001ej\\#=\u001efM:aAk\\0+\u001ecX'/XkN|$BhSl=TiN<<\fsO&+\u0017lX*spNG2\u001dHDT5~s6Qk\u0006F4\\\u0000-uKT\n'CWM /Aq\f7\u001b`ol\u0012hAk\\0+Xc\u0000";
                    obj = 10;
                    break;
                case a6.h /*10*/:
                    j = a(str);
                    str = ";:Ew\u0007|aPwT},XiZ} Ts\u00129=^i\u00132=A\u007f\u0002\u0012>ANYn\n\u00056yk\ru>\u0005\u0015~\u0001E\u000fczt>\u0005c~\b>\u0005\u0016\rw?\tayt7\u0004\u0011\bw3|khgbO '^i\u0000a`\u0001!n<;CdX sxj\\4+\u0017FY&\"E:n'<XdIu\u0007\\fZ6`wnQ'+Ct\u0000\u0012=Ab^'tbvH2<T!";
                    obj = 11;
                    break;
                case a6.e /*11*/:
                    d = a(str);
                    str = "\u0012>_Kt\u001a\u0007KqW0\u001cr*[k\u0006GB\r?\u0016s~Ke\u0017i?y\u0016:rL\u000b`\u0014`jh\"\u0019AMH%-bWi&wCcI#?\u007fRu\n\t\u0002C";
                    obj = 12;
                    break;
                case a6.s /*12*/:
                    e = a(str);
                    str = "\u00caP\u00aa\u001a1\u00eb\u00b9dce\u00cb\u00dc2\u008cx\u00c4pI\u00c1\u00e8";
                    obj = 13;
                    break;
                case a6.z /*13*/:
                    m = a(str);
                    str = "\u0000X>U>Y\n\u00b2\u0017\u00bf\u00c9\u00c3\u00bdA\u0007r'\u0018P|";
                    obj = 14;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    k = a(str);
                    str = "\u001e\u0007xEt9\u000f\u007fEZ8?YlT\u0014wF7\u007f\u0012\u001ftA|\u0012\u0001rFlk\u000f|Nt\u0011\rVL~\u0012\u001ftFL8\u0000\\?M \"\u0005NU7&~,X\u0007)EkP6\u0002Sw\te\u0016c>E\u001d(\u0001oD\u001d)huO?\"bo\u0005\t\"\u001aDhd*i4R\u001e\u001dz2\\c\u001e\u0003Uo\u0000\buSP4&b\u007f\u0005d\u0004IQV'\bZcQ\t:smK\u0017+T\u007f\b+\u0000sLv)4CTN\u001d\u0007I3[\u0000z_r\f1<V`^&;\boOjwRup\u0000zvFQe)Swi;\"V1e\u0002|YWL'\t{\u007f\u007f!-TtV|<uQ\u007f>;\u0006wS\u0011\u0018\u0006OD\u0017\u0000idrd#ymXj<\u001aBw#\u0001\u0007>mc=`kL\u0007&\u007fo\u0012\u0016!sT\u000b8w^Po>\bP]J\u001e\u0000\u001aPI#9zr\u000bg~\u0006k_e\nai\u000ejx|QM\u001d!rM|+\u000fe}jfvuVG7\nrRe%|{Ah\u0011&fV\u000f)\rB0Q*>\u001aIN\u001d\"H7\u007f\u0016+\t2n\u0004?ssz=\u0017k1\r2\"Z5\\ +b2j\u0016\u0018hoY;=\u001eW[)\u0014_HN\u001d\u0003ih\fdxi,\u000f$\u0007uFl\u0012\f";
                    obj = 15;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    a = a(str);
                    str = "\u001c\u001e\u0005qI\u0018\u0014gF\u0016\t9GJE`\u0002yWP`\u0016a_Z|z\f";
                    obj = 16;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    o = a(str);
                default:
                    i = a(str);
                    str = ";:EwNia\u001efS7<^nY~-CfN;\"^`\u0013$&PsN2>A)S6:\u001erM?!Pc\u0013#&A";
                    obj = null;
                    break;
            }
        }
    }

    private static String a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append((char) (str.charAt(i) ^ 18));
        }
        return stringBuilder.toString();
    }
}
