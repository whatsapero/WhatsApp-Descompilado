package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class uc extends AsyncTask {
    private static final String[] z;
    s a;
    final VerifySms b;

    static {
        String[] strArr = new String[28];
        String str = ".H\u00072I/\u0000\u0006!B9\u0000\u00106^2_X7X<A\u0010";
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
                        i3 = 93;
                        break;
                    case ay.f /*1*/:
                        i3 = 45;
                        break;
                    case ay.n /*2*/:
                        i3 = 117;
                        break;
                    case ay.p /*3*/:
                        i3 = 68;
                        break;
                    default:
                        i3 = 44;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u0003+H\u0007-J4H\u0011";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u00038_\u0007+^rY\u001a+\u0001;L\u00060\u0003.L\u0003!HpN\u001a IpD\u0006iB(A\u0019";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = ".H\u00072I/\u0000\u0006!B9\u0000\u0018-_0L\u0001'D";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u00030D\u00067E3J";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ".H\u00072I/\u0000\u0006!B9\u0000\u0017(C>F\u0010 ";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u0003(C\u00141X5B\u0007-V8I";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ".H\u00072I/\u0000\u0006!B9\u0000\u00106^2_X0I0]\u001a6M/D\u0019=\u0001(C\u00142M4A\u0014&@8";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ".H\u00072I/\u0000\u0006!B9\u0000\u00106^2_X1B.]\u0010'E;D\u0010 ";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u00038_\u0007+^";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u0003?A\u001a'G8I";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u00038_\u0007+^rY\u0010)\\pX\u001b%Z<D\u0019k_<[\u0010 \u0001>B\u0011!\u00014^X*Y1A";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ".H\u00072I/\u0000\u0006!B9\u0000\u0001+Cp@\u0014*UpJ\u0000!_.H\u0006";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u0003:X\u00107_8IX0C2\u0000\u0013%_)";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ".H\u00072I/\u0000\u0006!B9\u0000\u00121I.^\u0010 \u0001)B\u001aiJ<^\u0001";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u0003)B\u001aiA<C\fiK(H\u00067I.";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u0003.Y\u0014(I";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u00038_\u0007+^pY\u0010)\\2_\u00146E1TX1B<[\u0014-@<O\u0019!";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u00038_\u0007+^rN\u001a*B8N\u0001-Z4Y\fk_<[\u0010 \u0001>B\u0011!\u00014^X*Y1A";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "/H\u0012-_)H\u0007k\\5B\u001b!\u0003;L\u001c(I9\u0000\u0001+\u0001(]\u0011%X8\u0000\u0010<\\4_\u00140E2C";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u0003>B\u001b*I>Y\u001c2E)T";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u0003>B\u0011!\u0003";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u00034B\u00106^2_U";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u00038_\u0007+^}";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "/H\u00016E8I";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = ")L\u00054I9";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "+H\u0007-J$^\u00187\u0003+H\u0007-J$^\u00187\u0003.N\u001d!H(A\u0010i^8Y\u0007=\u0003";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ".H\u00072I/\u0000\u0006!B9\u0000\u0018-_.D\u001b#";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.x0 r7) {
        /*
        r6_this = this;
        r0 = com.whatsapp.App.az;
        r1 = com.whatsapp.x0.YES;
        if (r7 != r1) goto L_0x0037;
    L_0x0006:
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = r6.a;
        r1 = r1.d;
        r2 = r6.a;
        r2 = r2.b;
        com.whatsapp.a54.a(r1, r2);
        r1 = com.whatsapp.atf.WHATSAPP_INITIATED;	 Catch:{ NumberFormatException -> 0x01a8 }
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r6.a;	 Catch:{ NumberFormatException -> 0x01a8 }
        r4 = r4.e;	 Catch:{ NumberFormatException -> 0x01a8 }
        r2 = r2 * r4;
        com.whatsapp.ac.a(r1, r2);	 Catch:{ NumberFormatException -> 0x01a8 }
    L_0x0025:
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01b4 }
        com.whatsapp.VerifySms.j(r1);	 Catch:{ NumberFormatException -> 0x01b4 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01b4 }
        com.whatsapp.VerifySms.y(r1);	 Catch:{ NumberFormatException -> 0x01b4 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01b4 }
        r2 = 1;
        com.whatsapp.VerifySms.a(r1, r2);	 Catch:{ NumberFormatException -> 0x01b4 }
        if (r0 == 0) goto L_0x01a7;
    L_0x0037:
        r1 = com.whatsapp.x0.FAIL_MISMATCH;	 Catch:{ NumberFormatException -> 0x01b6 }
        if (r7 != r1) goto L_0x0069;
    L_0x003b:
        r1 = z;	 Catch:{ NumberFormatException -> 0x01b6 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x01b6 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x01b6 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01b6 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x01b6 }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x01b6 }
        r1.b(r2);	 Catch:{ NumberFormatException -> 0x01b6 }
        r1 = 3;
        com.whatsapp.VerifySms.a(r1);	 Catch:{ NumberFormatException -> 0x01b6 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01b6 }
        com.whatsapp.VerifySms.t(r1);	 Catch:{ NumberFormatException -> 0x01b6 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01b6 }
        com.whatsapp.VerifySms.j(r1);	 Catch:{ NumberFormatException -> 0x01b6 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01b6 }
        com.whatsapp.VerifySms.y(r1);	 Catch:{ NumberFormatException -> 0x01b6 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01b6 }
        r2 = 34;
        r1.c(r2);	 Catch:{ NumberFormatException -> 0x01b6 }
        if (r0 == 0) goto L_0x01a7;
    L_0x0069:
        r1 = r6.b;
        r1 = com.whatsapp.VerifySms.c(r1);
        r2 = com.whatsapp.x0.ERROR_CONNECTIVITY;	 Catch:{ NumberFormatException -> 0x01b8 }
        if (r7 != r2) goto L_0x00a3;
    L_0x0073:
        r2 = z;	 Catch:{ NumberFormatException -> 0x01ba }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x01ba }
        com.whatsapp.util.Log.w(r2);	 Catch:{ NumberFormatException -> 0x01ba }
        if (r1 != 0) goto L_0x009e;
    L_0x007e:
        r2 = z;	 Catch:{ NumberFormatException -> 0x01bc }
        r3 = 19;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x01bc }
        com.whatsapp.util.Log.e(r2);	 Catch:{ NumberFormatException -> 0x01bc }
        r2 = r6.b;	 Catch:{ NumberFormatException -> 0x01bc }
        com.whatsapp.VerifySms.j(r2);	 Catch:{ NumberFormatException -> 0x01bc }
        r2 = 4;
        com.whatsapp.VerifySms.a(r2);	 Catch:{ NumberFormatException -> 0x01bc }
        r2 = r6.b;	 Catch:{ NumberFormatException -> 0x01bc }
        com.whatsapp.VerifySms.t(r2);	 Catch:{ NumberFormatException -> 0x01bc }
        r2 = r6.b;	 Catch:{ NumberFormatException -> 0x01bc }
        r3 = 21;
        r2.c(r3);	 Catch:{ NumberFormatException -> 0x01bc }
        if (r0 == 0) goto L_0x01a7;
    L_0x009e:
        r6.b(r1);	 Catch:{ NumberFormatException -> 0x01be }
        if (r0 == 0) goto L_0x01a7;
    L_0x00a3:
        r2 = com.whatsapp.x0.FAIL_GUESSED_TOO_FAST;	 Catch:{ NumberFormatException -> 0x01c0 }
        if (r7 != r2) goto L_0x00cf;
    L_0x00a7:
        r2 = z;	 Catch:{ NumberFormatException -> 0x01c2 }
        r3 = 14;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x01c2 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ NumberFormatException -> 0x01c2 }
        r2 = r6.b;	 Catch:{ NumberFormatException -> 0x01c2 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x01c2 }
        r4 = 15;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x01c2 }
        r2.b(r3);	 Catch:{ NumberFormatException -> 0x01c2 }
        if (r1 != 0) goto L_0x00ca;
    L_0x00bd:
        r2 = z;	 Catch:{ NumberFormatException -> 0x01c4 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x01c4 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ NumberFormatException -> 0x01c4 }
        r6.a();	 Catch:{ NumberFormatException -> 0x01c4 }
        if (r0 == 0) goto L_0x01a7;
    L_0x00ca:
        r6.b(r1);	 Catch:{ NumberFormatException -> 0x01c6 }
        if (r0 == 0) goto L_0x01a7;
    L_0x00cf:
        r2 = com.whatsapp.x0.FAIL_TEMPORARILY_UNAVAILABLE;	 Catch:{ NumberFormatException -> 0x01c8 }
        if (r7 != r2) goto L_0x00fc;
    L_0x00d3:
        r2 = z;	 Catch:{ NumberFormatException -> 0x01ca }
        r3 = 18;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x01ca }
        com.whatsapp.util.Log.e(r2);	 Catch:{ NumberFormatException -> 0x01ca }
        r2 = r6.b;	 Catch:{ NumberFormatException -> 0x01ca }
        r3 = z;	 Catch:{ NumberFormatException -> 0x01ca }
        r4 = 8;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x01ca }
        r2.b(r3);	 Catch:{ NumberFormatException -> 0x01ca }
        if (r1 != 0) goto L_0x00f7;
    L_0x00e9:
        r2 = z;	 Catch:{ NumberFormatException -> 0x01cc }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x01cc }
        com.whatsapp.util.Log.e(r2);	 Catch:{ NumberFormatException -> 0x01cc }
        r6.a();	 Catch:{ NumberFormatException -> 0x01cc }
        if (r0 == 0) goto L_0x01a7;
    L_0x00f7:
        r6.b(r1);	 Catch:{ NumberFormatException -> 0x01ce }
        if (r0 == 0) goto L_0x01a7;
    L_0x00fc:
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01d0 }
        com.whatsapp.VerifySms.j(r1);	 Catch:{ NumberFormatException -> 0x01d0 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01d0 }
        com.whatsapp.VerifySms.y(r1);	 Catch:{ NumberFormatException -> 0x01d0 }
        r1 = com.whatsapp.x0.FAIL_MISSING;	 Catch:{ NumberFormatException -> 0x01d0 }
        if (r7 != r1) goto L_0x011e;
    L_0x010a:
        r1 = z;	 Catch:{ NumberFormatException -> 0x01d2 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x01d2 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ NumberFormatException -> 0x01d2 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01d2 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x01d2 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x01d2 }
        r1.b(r2);	 Catch:{ NumberFormatException -> 0x01d2 }
        if (r0 == 0) goto L_0x0169;
    L_0x011e:
        r1 = com.whatsapp.x0.FAIL_TOO_MANY_GUESSES;	 Catch:{ NumberFormatException -> 0x01d4 }
        if (r7 != r1) goto L_0x0138;
    L_0x0122:
        r1 = z;	 Catch:{ NumberFormatException -> 0x01d6 }
        r2 = 16;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x01d6 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ NumberFormatException -> 0x01d6 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01d6 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x01d6 }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x01d6 }
        r1.b(r2);	 Catch:{ NumberFormatException -> 0x01d6 }
        if (r0 == 0) goto L_0x0169;
    L_0x0138:
        r1 = com.whatsapp.x0.ERROR_UNSPECIFIED;	 Catch:{ NumberFormatException -> 0x01d8 }
        if (r7 != r1) goto L_0x0152;
    L_0x013c:
        r1 = z;	 Catch:{ NumberFormatException -> 0x01da }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x01da }
        com.whatsapp.util.Log.e(r1);	 Catch:{ NumberFormatException -> 0x01da }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01da }
        r2 = z;	 Catch:{ NumberFormatException -> 0x01da }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x01da }
        r1.b(r2);	 Catch:{ NumberFormatException -> 0x01da }
        if (r0 == 0) goto L_0x0169;
    L_0x0152:
        r1 = com.whatsapp.x0.FAIL_STALE;	 Catch:{ NumberFormatException -> 0x01dc }
        if (r7 != r1) goto L_0x0169;
    L_0x0156:
        r1 = z;	 Catch:{ NumberFormatException -> 0x01dc }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x01dc }
        com.whatsapp.util.Log.e(r1);	 Catch:{ NumberFormatException -> 0x01dc }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01dc }
        r2 = z;	 Catch:{ NumberFormatException -> 0x01dc }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x01dc }
        r1.b(r2);	 Catch:{ NumberFormatException -> 0x01dc }
    L_0x0169:
        r1 = com.whatsapp.x0.FAIL_BLOCKED;	 Catch:{ NumberFormatException -> 0x01de }
        if (r7 != r1) goto L_0x01a4;
    L_0x016d:
        r1 = z;	 Catch:{ NumberFormatException -> 0x01e0 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x01e0 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ NumberFormatException -> 0x01e0 }
        r1 = 12;
        com.whatsapp.VerifySms.a(r1);	 Catch:{ NumberFormatException -> 0x01e0 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01e0 }
        com.whatsapp.VerifySms.t(r1);	 Catch:{ NumberFormatException -> 0x01e0 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01e0 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x01e0 }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x01e0 }
        r1.b(r2);	 Catch:{ NumberFormatException -> 0x01e0 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01e0 }
        com.whatsapp.VerifySms.u(r1);	 Catch:{ NumberFormatException -> 0x01e0 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01e0 }
        r1 = r1.m;	 Catch:{ NumberFormatException -> 0x01e0 }
        if (r1 != 0) goto L_0x019d;
    L_0x0195:
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01e2 }
        r1 = r1.isFinishing();	 Catch:{ NumberFormatException -> 0x01e2 }
        if (r1 == 0) goto L_0x01a7;
    L_0x019d:
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x01e4 }
        r1.a();	 Catch:{ NumberFormatException -> 0x01e4 }
        if (r0 == 0) goto L_0x01a7;
    L_0x01a4:
        r6.a();	 Catch:{ NumberFormatException -> 0x01e4 }
    L_0x01a7:
        return;
    L_0x01a8:
        r1 = move-exception;
        r1 = z;
        r2 = 20;
        r1 = r1[r2];
        com.whatsapp.util.Log.e(r1);
        goto L_0x0025;
    L_0x01b4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01b6 }
    L_0x01b6:
        r0 = move-exception;
        throw r0;
    L_0x01b8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01ba }
    L_0x01ba:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01bc }
    L_0x01bc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01be }
    L_0x01be:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01c0 }
    L_0x01c0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01c2 }
    L_0x01c2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01c4 }
    L_0x01c4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01c6 }
    L_0x01c6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01c8 }
    L_0x01c8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01ca }
    L_0x01ca:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01cc }
    L_0x01cc:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01ce }
    L_0x01ce:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01d0 }
    L_0x01d0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01d2 }
    L_0x01d2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01d4 }
    L_0x01d4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01d6 }
    L_0x01d6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01d8 }
    L_0x01d8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01da }
    L_0x01da:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01dc }
    L_0x01dc:
        r0 = move-exception;
        throw r0;
    L_0x01de:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01e0 }
    L_0x01e0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01e2 }
    L_0x01e2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01e4 }
    L_0x01e4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.uc.a(com.whatsapp.x0):void");
    }

    private ui a(String str) {
        try {
            if (z[26].equals(str)) {
                return ui.TAPPED_LINK;
            }
            try {
                return z[25].equals(str) ? ui.RETRIED : ui.AUTO_DETECTED;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    private void b(String str) {
        int d = VerifySms.d(this.b);
        Log.i(z[27] + d);
        VerifySms.r(this.b).sendMessageDelayed(VerifySms.r(this.b).obtainMessage(1, str), (long) d);
    }

    protected void onPostExecute(Object obj) {
        a((x0) obj);
    }

    private void a() {
        try {
            VerifySms.a(3);
            VerifySms.t(this.b);
            VerifySms.l(this.b);
            if (!this.b.m) {
                try {
                    if (!this.b.isFinishing()) {
                        return;
                    }
                }
            }
            this.b.a();
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    protected x0 a(String[] strArr) {
        Log.i(z[22] + strArr[0]);
        x0 x0Var = x0.ERROR_UNSPECIFIED;
        try {
            this.a = fm.a(VerifySms.A(this.b), VerifySms.a(this.b), strArr[0], a(strArr[1]));
            switch (g7.a[this.a.f.ordinal()]) {
                case ay.f /*1*/:
                case ay.n /*2*/:
                    App.b(App.p, this.a.g);
                    break;
            }
            App.f(App.p, this.a.b);
            return this.a.f;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            Log.e(z[24] + e2.toString());
            return x0.ERROR_UNSPECIFIED;
        } catch (IOException e3) {
            Log.e(z[23] + e3.toString());
            return x0.ERROR_CONNECTIVITY;
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((String[]) objArr);
    }

    protected uc(VerifySms verifySms) {
        this.b = verifySms;
    }
}
