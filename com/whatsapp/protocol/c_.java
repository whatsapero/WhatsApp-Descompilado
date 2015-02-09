package com.whatsapp.protocol;

import com.whatsapp.vk;
import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class c_ extends cf {
    private static final String[] z;
    public byte[] l;

    static {
        String[] strArr = new String[51];
        String str = "2c\"@\u000f!h";
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
                        i3 = 66;
                        break;
                    case ay.f /*1*/:
                        i3 = 17;
                        break;
                    case ay.n /*2*/:
                        i3 = 75;
                        break;
                    case ay.p /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = 110;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "0t*R\u001c'r._\u001e6b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "1e9S\u000f/+-S\u000f6d9S\u001d";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "2c.E\u000b,r.";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "0t8F\u0001,b.";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "7b.D";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0015P\u001eb&o#";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "6c>S";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "#d?^";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "/t(^\u000f,x8[";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "/t(^\u000f,x8[";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0015P\u001eb&o#";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "7b.D";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "2p8E\u00074t";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "+\u007f=W\u0002+ukE\u000b0g.DN6x&STb";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "+\u007f=W\u0002+ukF\u001c-a8\u0016\u0018'c8_\u0001,+k";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    str = "2c$F\u001d";
                    obj = 16;
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    strArr2 = strArr3;
                    str = "1e*B\u001b1";
                    obj = 17;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = ")x%R";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "2p\"R";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "#r?_\u0018'";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "+\u007f=W\u0002+ukS\u00162x9SN&p?STb";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "1d(U\u000b1b";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "$c.S";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "#r?_\u0018'1*U\r-d%BN5x?^N,~kS\u00162x9W\u001a+~%";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "'i;_\u001c'u";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "'i;_\u001c#e\"Y\u0000";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "$p\"Z\u001b0t";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "'i;S\r6t/\u0016\u0019'skD\u000b2}2\u001aN d?\u0016\u0003+b8_\u0000%=k_\u0000bc.W\n\u0015t)";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "5t)";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "!y*Z\u0002'\u007f,S";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "1d(U\u000b1b";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "$p\"Z\u001b0t";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "$t'ZN-d?\u0016\u0001$1'Y\u000121\"XN0t*R('p?C\u001c'b\nX\n\u0001y*Z\u0002'\u007f,S";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "5t)";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "'i;S\r6t/\u0016\u0019'skD\u000b2}2\u001aN d?\u0016\u0003+b8_\u0000%=k_\u0000bc.W\n\u0004t*B\u001b0t8w\u0000&R#W\u0002.t%Q\u000b";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "$p\"Z\u001b0t";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "!~/S";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "0t?D\u0017";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "+\u007f=W\u0002+ukS\u00162x9SN6x&SN-d?\fN";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "+\u007f=W\u0002+ukD\u000b6c2\fN";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "'i;_\u001c'";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "+\u007f=W\u0002+ukU\u0001&tq\u0016";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = ",~?\u001b\u000f7e#Y\u001c+k.R";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "4t9E\u0007-\u007f";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "r?x";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "5t)";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "5t)";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "'c9Y\u001c";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "!~/S";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "%c$C\u001e1N=\u0004";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void b(bi biVar) {
        bi.b(biVar, z[48]);
        bi d = biVar.d(z[49]);
        if (d != null) {
            String b = d.b(z[50]);
            int i = 500;
            if (b != null) {
                i = Integer.parseInt(b);
            }
            this.h.n.c(this.h.G, i);
        }
    }

    private void a(byte[] bArr) {
        this.d.a(new bi(z[5], null, a(bArr)));
    }

    public void a(boolean z) {
        try {
            if (this.h.J == null) {
                throw new c3(0);
            }
            this.d.a(this.h.M, this.h.l);
            e();
            c();
            b(z);
            this.b.c();
            byte[] d = d();
            if (d != null) {
                try {
                    c(d);
                    a(d);
                    a();
                    b();
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            this.b.d();
            this.d.a(this.h.d);
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    private void c(byte[] bArr) {
        this.h.d = this.h.s.a(this.h.J, bArr);
        this.b.a(this.h.d);
    }

    private void c() {
        try {
            if (this.h.G != null) {
                this.d.a(new bi(z[47], new k[]{new k(z[45], z[46])}, this.h.G), false);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private void b() {
        bi b = this.b.b();
        try {
            if (bi.a(b, z[37])) {
                c(b);
            }
            a(b);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] d() {
        /*
        r7_this = this;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.protocol.b.n;
        r0 = r7.h;	 Catch:{ NumberFormatException -> 0x0022 }
        r0 = r0.G;	 Catch:{ NumberFormatException -> 0x0022 }
        if (r0 == 0) goto L_0x0024;
    L_0x000a:
        r0 = r1;
    L_0x000b:
        r4 = r7.b;
        r4 = r4.b();
        if (r4 == 0) goto L_0x0078;
    L_0x0013:
        r5 = z;	 Catch:{ NumberFormatException -> 0x0026 }
        r6 = 31;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x0026 }
        r5 = com.whatsapp.protocol.bi.a(r4, r5);	 Catch:{ NumberFormatException -> 0x0026 }
        if (r5 == 0) goto L_0x0028;
    L_0x001f:
        r0 = r4.b;	 Catch:{ NumberFormatException -> 0x0026 }
    L_0x0021:
        return r0;
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r0 = r2;
        goto L_0x000b;
    L_0x0026:
        r0 = move-exception;
        throw r0;
    L_0x0028:
        r5 = z;
        r6 = 35;
        r5 = r5[r6];
        r5 = com.whatsapp.protocol.bi.a(r4, r5);
        if (r5 == 0) goto L_0x003a;
    L_0x0034:
        r7.b(r4);
        if (r3 == 0) goto L_0x008a;
    L_0x0039:
        r2 = r1;
    L_0x003a:
        r5 = z;	 Catch:{ NumberFormatException -> 0x005e }
        r6 = 32;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x005e }
        r5 = com.whatsapp.protocol.bi.a(r4, r5);	 Catch:{ NumberFormatException -> 0x005e }
        if (r5 == 0) goto L_0x0067;
    L_0x0046:
        if (r0 == 0) goto L_0x0062;
    L_0x0048:
        if (r2 != 0) goto L_0x0062;
    L_0x004a:
        r0 = new com.whatsapp.protocol.l;	 Catch:{ NumberFormatException -> 0x005c }
        r1 = z;	 Catch:{ NumberFormatException -> 0x005c }
        r2 = 36;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x005c }
        r2 = r7.b;	 Catch:{ NumberFormatException -> 0x005c }
        r2 = r2.a();	 Catch:{ NumberFormatException -> 0x005c }
        r0.<init>(r1, r2);	 Catch:{ NumberFormatException -> 0x005c }
        throw r0;	 Catch:{ NumberFormatException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x005c }
    L_0x0062:
        r7.a(r4);
        r0 = 0;
        goto L_0x0021;
    L_0x0067:
        r5 = z;
        r6 = 33;
        r5 = r5[r6];
        r5 = com.whatsapp.protocol.bi.a(r4, r5);
        if (r5 == 0) goto L_0x000b;
    L_0x0073:
        r7.c(r4);
        if (r3 == 0) goto L_0x000b;
    L_0x0078:
        r0 = new com.whatsapp.protocol.l;
        r1 = z;
        r2 = 34;
        r1 = r1[r2];
        r2 = r7.b;
        r2 = r2.a();
        r0.<init>(r1, r2);
        throw r0;
    L_0x008a:
        r2 = r1;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.c_.d():byte[]");
    }

    private void b(boolean z) {
        byte[] a;
        if (this.l != null) {
            c(this.l);
            a = a(this.l);
        } else {
            a = null;
        }
        try {
            this.d.a(new bi(z[9], z ? new k[]{new k(z[13], this.h.h), new k(z[11], z[12])} : new k[]{new k(z[6], this.h.h), new k(z[14], z[8]), new k(z[10], z[7])}, a));
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(com.whatsapp.protocol.bi r6) {
        /*
        r5_this = this;
        r0 = z;
        r1 = 44;
        r0 = r0[r1];
        r1 = r6.d(r0);
        r0 = z;
        r2 = 42;
        r0 = r0[r2];
        r2 = r1.b(r0);
        if (r2 != 0) goto L_0x0020;
    L_0x0016:
        r0 = new com.whatsapp.protocol.c3;
        r3 = 0;
        r0.<init>(r3);
        r3 = com.whatsapp.protocol.b.n;
        if (r3 == 0) goto L_0x004e;
    L_0x0020:
        r0 = new com.whatsapp.protocol.c3;
        r3 = 2;
        r0.<init>(r3);
        r3 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x004f }
        r0.e = r3;	 Catch:{ NumberFormatException -> 0x004f }
        r3 = z;
        r4 = 38;
        r3 = r3[r4];
        r3 = r1.b(r3);
        r4 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x006d }
        r0.g = r4;	 Catch:{ NumberFormatException -> 0x006d }
        r3 = z;
        r4 = 39;
        r3 = r3[r4];
        r1 = r1.b(r3);
        if (r1 == 0) goto L_0x004e;
    L_0x0048:
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x008b }
        r0.c = r1;	 Catch:{ NumberFormatException -> 0x008b }
    L_0x004e:
        throw r0;
    L_0x004f:
        r0 = move-exception;
        r0 = new java.io.IOException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 40;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x006d:
        r0 = move-exception;
        r0 = new java.io.IOException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r4 = 43;
        r2 = r2[r4];
        r1 = r1.append(r2);
        r1 = r1.append(r3);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x008b:
        r0 = move-exception;
        r0 = new java.io.IOException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 41;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.c_.c(com.whatsapp.protocol.bi):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.bi r10) {
        /*
        r9_this = this;
        r8 = -1;
        r0 = com.whatsapp.protocol.b.n;
        r1 = z;
        r2 = 23;
        r1 = r1[r2];
        com.whatsapp.protocol.bi.b(r10, r1);
        r1 = "t";
        r1 = r10.b(r1);
        if (r1 == 0) goto L_0x0027;
    L_0x0014:
        r2 = r9.h;	 Catch:{ NumberFormatException -> 0x00c7 }
        r4 = java.lang.Long.parseLong(r1);	 Catch:{ NumberFormatException -> 0x00c7 }
        r2.a = r4;	 Catch:{ NumberFormatException -> 0x00c7 }
        r2 = r9.h;	 Catch:{ NumberFormatException -> 0x00c7 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x00c7 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 / r6;
        r2.j = r4;	 Catch:{ NumberFormatException -> 0x00c7 }
    L_0x0027:
        r1 = z;
        r2 = 27;
        r1 = r1[r2];
        r1 = r10.b(r1);
        if (r1 == 0) goto L_0x003b;
    L_0x0033:
        r2 = r9.h;	 Catch:{ NumberFormatException -> 0x00e5 }
        r4 = java.lang.Long.parseLong(r1);	 Catch:{ NumberFormatException -> 0x00e5 }
        r2.m = r4;	 Catch:{ NumberFormatException -> 0x00e5 }
    L_0x003b:
        r2 = z;
        r3 = 17;
        r2 = r2[r3];
        r2 = r10.b(r2);
        if (r2 == 0) goto L_0x0054;
    L_0x0047:
        r3 = r9.h;	 Catch:{ NumberFormatException -> 0x0103 }
        r4 = new java.lang.Integer;	 Catch:{ NumberFormatException -> 0x0103 }
        r5 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x0103 }
        r4.<init>(r5);	 Catch:{ NumberFormatException -> 0x0103 }
        r3.L = r4;	 Catch:{ NumberFormatException -> 0x0103 }
    L_0x0054:
        r2 = z;
        r3 = 19;
        r2 = r2[r3];
        r2 = r10.b(r2);
        r3 = z;	 Catch:{ NumberFormatException -> 0x0121 }
        r4 = 20;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0121 }
        r3 = r3.equals(r2);	 Catch:{ NumberFormatException -> 0x0121 }
        if (r3 == 0) goto L_0x0071;
    L_0x006a:
        r3 = r9.h;	 Catch:{ NumberFormatException -> 0x0123 }
        r4 = 1;
        r3.I = r4;	 Catch:{ NumberFormatException -> 0x0123 }
        if (r0 == 0) goto L_0x0089;
    L_0x0071:
        r3 = z;	 Catch:{ NumberFormatException -> 0x0125 }
        r4 = 24;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0125 }
        r2 = r3.equals(r2);	 Catch:{ NumberFormatException -> 0x0125 }
        if (r2 == 0) goto L_0x0084;
    L_0x007d:
        r2 = r9.h;	 Catch:{ NumberFormatException -> 0x0127 }
        r3 = 0;
        r2.I = r3;	 Catch:{ NumberFormatException -> 0x0127 }
        if (r0 == 0) goto L_0x0089;
    L_0x0084:
        r2 = r9.h;	 Catch:{ NumberFormatException -> 0x0127 }
        r3 = -1;
        r2.I = r3;	 Catch:{ NumberFormatException -> 0x0127 }
    L_0x0089:
        r2 = z;
        r3 = 18;
        r2 = r2[r3];
        r2 = r10.b(r2);
        r3 = z;	 Catch:{ NumberFormatException -> 0x0129 }
        r4 = 26;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0129 }
        r3 = r3.equals(r2);	 Catch:{ NumberFormatException -> 0x0129 }
        if (r3 == 0) goto L_0x00a6;
    L_0x009f:
        r3 = r9.h;	 Catch:{ NumberFormatException -> 0x012b }
        r4 = 1;
        r3.q = r4;	 Catch:{ NumberFormatException -> 0x012b }
        if (r0 == 0) goto L_0x0133;
    L_0x00a6:
        r0 = z;	 Catch:{ NumberFormatException -> 0x012d }
        r3 = 21;
        r0 = r0[r3];	 Catch:{ NumberFormatException -> 0x012d }
        r0 = r0.equals(r2);	 Catch:{ NumberFormatException -> 0x012d }
        if (r0 == 0) goto L_0x012f;
    L_0x00b2:
        r0 = r9.h;	 Catch:{ NumberFormatException -> 0x00c5 }
        r2 = 0;
        r0.q = r2;	 Catch:{ NumberFormatException -> 0x00c5 }
        if (r1 != 0) goto L_0x0133;
    L_0x00b9:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x00c5 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x00c5 }
        r2 = 25;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00c5 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x00c5 }
        throw r0;	 Catch:{ NumberFormatException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;
    L_0x00c7:
        r0 = move-exception;
        r0 = new java.io.IOException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 15;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        r0 = new java.io.IOException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 22;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0103:
        r0 = move-exception;
        r0 = new java.io.IOException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 16;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0121:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0123 }
    L_0x0123:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0125 }
    L_0x0125:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0127 }
    L_0x0127:
        r0 = move-exception;
        throw r0;
    L_0x0129:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x012b }
    L_0x012b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x012d }
    L_0x012d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00c5 }
    L_0x012f:
        r0 = r9.h;
        r0.I = r8;
    L_0x0133:
        r0 = r10.b;
        r9.l = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.c_.a(com.whatsapp.protocol.bi):void");
    }

    private void e() {
        Vector vector = new Vector();
        try {
            if (this.h.p) {
                vector.addElement(new bi(z[0], null));
            }
            try {
                if (this.h.b) {
                    vector.addElement(new bi(z[2], null));
                }
                try {
                    if (this.h.f) {
                        vector.addElement(new bi(z[1], null));
                    }
                    try {
                        if (this.h.i) {
                            vector.addElement(new bi(z[4], null));
                        }
                        bi[] biVarArr = new bi[vector.size()];
                        try {
                            vector.copyInto(biVarArr);
                            cw cwVar = this.d;
                            String str = z[3];
                            if (biVarArr.length == 0) {
                                biVarArr = null;
                            }
                            cwVar.a(new bi(str, null, biVarArr), false);
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            } catch (NumberFormatException e222) {
                throw e222;
            }
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r3_this = this;
        r0 = r3.h;
        r0 = r0.G;
        if (r0 == 0) goto L_0x0046;
    L_0x0006:
        r0 = r3.b;
        r0 = r0.b();
        r1 = z;	 Catch:{ NumberFormatException -> 0x003f }
        r2 = 28;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x003f }
        r1 = com.whatsapp.protocol.bi.a(r0, r1);	 Catch:{ NumberFormatException -> 0x003f }
        if (r1 == 0) goto L_0x001f;
    L_0x0018:
        r3.c(r0);	 Catch:{ NumberFormatException -> 0x0041 }
        r1 = com.whatsapp.protocol.b.n;	 Catch:{ NumberFormatException -> 0x0041 }
        if (r1 == 0) goto L_0x0046;
    L_0x001f:
        r1 = z;	 Catch:{ NumberFormatException -> 0x003d }
        r2 = 30;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x003d }
        r1 = com.whatsapp.protocol.bi.a(r0, r1);	 Catch:{ NumberFormatException -> 0x003d }
        if (r1 != 0) goto L_0x0043;
    L_0x002b:
        r0 = new com.whatsapp.protocol.l;	 Catch:{ NumberFormatException -> 0x003d }
        r1 = z;	 Catch:{ NumberFormatException -> 0x003d }
        r2 = 29;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x003d }
        r2 = r3.b;	 Catch:{ NumberFormatException -> 0x003d }
        r2 = r2.a();	 Catch:{ NumberFormatException -> 0x003d }
        r0.<init>(r1, r2);	 Catch:{ NumberFormatException -> 0x003d }
        throw r0;	 Catch:{ NumberFormatException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003d }
    L_0x0043:
        r3.b(r0);
    L_0x0046:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.c_.a():void");
    }

    public c_(c8 c8Var, cw cwVar, bp bpVar, byte[] bArr) {
        super(bpVar, c8Var, cwVar);
        this.l = bArr;
    }
}
