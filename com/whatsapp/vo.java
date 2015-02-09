package com.whatsapp;

import android.os.AsyncTask;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class vo extends AsyncTask {
    private static final String[] z;
    private String a;
    private int b;
    private String c;
    private String d;
    private Runnable e;
    private byte[] f;
    private int g;
    final EnterPhoneNumber h;
    private long i;
    private Runnable j;

    static {
        String[] strArr = new String[21];
        String str = "|Vqp\u0000iPj{\u00176V`b_pVva\u0013uTda\u001bvV";
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
                        i3 = 25;
                        break;
                    case ay.f /*1*/:
                        i3 = 56;
                        break;
                    case ay.n /*2*/:
                        i3 = 5;
                        break;
                    case ay.p /*3*/:
                        i3 = 21;
                        break;
                    default:
                        i3 = 114;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "|Vqp\u0000iPj{\u00176]wg\u001dk\u0015fz\u001cw]fa\u001boQql";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "|Vqp\u0000iPj{\u00176L`x\u0002vJdg\u001buA(`\u001cxNd|\u001exZip";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "|Vqp\u0000iPj{\u00176]wg\u001dk\u0015p{\u0001i]f|\u0014p]a";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    str = "qLqe\u0001#\u0017*b\u001axLvt\u0002i\u0016fz\u001f6Ykq\u0000vQa";
                    obj = 4;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "|Vqp\u0000iPj{\u00176Ziz\u0011r]a";
                    obj = 5;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "|Vqp\u0000iPj{\u00176Hmz\u001c|\u0015k`\u001f{]w8\u0006vW(y\u001dw_";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "|Vqp\u0000iPj{\u00176^d|\u001e|\\(a\u001d4Muq\u0013m](p\niQwt\u0006pWk";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "|Vqp\u0000iPj{\u00176J`|\u001cjLdy\u001e|\\";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "|Vqp\u0000iPj{\u00176Hmz\u001c|\u0015k`\u001f{]w8\u0010x\\(s\u001dkUda";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "|Vqp\u0000iPj{\u00176Zdq_mWnp\u001c";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "|Vqp\u0000iPj{\u00176Wiq_o]wf\u001bvV";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "|Vqp\u0000iPj{\u00176Ljz_k]fp\u001cm\u0017q|\u001f|\u0015kz\u00064Qka";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "|Vqp\u0000iPj{\u00176^d|\u001e|\\(a\u001d4Muq\u0013m](p\niQwt\u0006pWk";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "|Vqp\u0000iPj{\u00176]}e\u001bk]a";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "|Vqp\u0000iPj{\u00176Ljz_k]fp\u001cm";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "|Vqp\u0000iPj{\u00176Ljz_k]fp\u001cm\u0017q|\u001f|\u0015kz\u00064Qka";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "|Vqp\u0000iPj{\u00176[mp\u0011rJ`|\u001cjLdy\u001e|\\*|\u001d|Jwz\u00009";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "|Vqp\u0000iPj{\u00176[mp\u0011rJ`|\u001cjLdy\u001e|\\*p\u0000kWw";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "9J`s\u0007j]a";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "|Vqp\u0000iPj{\u00176Hmz\u001c|\u0015k`\u001f{]w8\u0006vW(f\u001avJq";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected vo(EnterPhoneNumber enterPhoneNumber, Runnable runnable, Runnable runnable2) {
        this.h = enterPhoneNumber;
        this.j = runnable2;
        this.e = runnable;
    }

    protected void onPreExecute() {
        this.h.showDialog(9);
    }

    protected Integer a(byte[][] bArr) {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime < EnterPhoneNumber.s) {
                this.d = ((EnterPhoneNumber.s - elapsedRealtime) / 1000) + "";
                return Integer.valueOf(11);
            }
            zp a = fm.a(bArr[0], bArr[1], bArr[2], fz.a(App.p, new String(bArr[1])).toString());
            if (a.d == y2.OK) {
                this.a = a.k;
                this.f = a.c;
                this.i = a.a;
                this.c = a.j;
                return Integer.valueOf(1);
            } else if (a.d == y2.FAIL) {
                this.g = a.g;
                this.b = a.i;
                if (a.h == null) {
                    return Integer.valueOf(4);
                }
                if (a.h == ak7.BLOCKED) {
                    return Integer.valueOf(5);
                }
                if (a.h == ak7.LENGTH_LONG) {
                    return Integer.valueOf(6);
                }
                if (a.h == ak7.LENGTH_SHORT) {
                    return Integer.valueOf(7);
                }
                if (a.h == ak7.FORMAT_WRONG) {
                    return Integer.valueOf(8);
                }
                if (a.h == ak7.TEMPORARILY_UNAVAILABLE) {
                    this.d = a.l;
                    return Integer.valueOf(9);
                } else if (a.h == ak7.OLD_VERSION) {
                    return Integer.valueOf(12);
                } else {
                    return a.h == ak7.ERROR_BAD_TOKEN ? Integer.valueOf(14) : Integer.valueOf(2);
                }
            } else {
                if (a.d == y2.EXPIRED) {
                    this.a = a.k;
                    this.f = a.c;
                    this.i = a.a;
                    this.c = a.j;
                    return Integer.valueOf(10);
                }
                return Integer.valueOf(4);
            }
        } catch (IOException e) {
            throw e;
        } catch (Throwable e2) {
            Log.b(z[19], e2);
        } catch (IOException e3) {
            String toString = e3.toString();
            try {
                Log.e(z[18] + toString);
                if (toString != null) {
                    if (toString.contains(z[20])) {
                        return Integer.valueOf(4);
                    }
                }
                return Integer.valueOf(3);
            } catch (IOException e32) {
                throw e32;
            } catch (IOException e322) {
                throw e322;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.lang.Integer r15) {
        /*
        r14_this = this;
        r5 = 3;
        r12 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r11 = 2;
        r10 = 1;
        r9 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r14.g;	 Catch:{ NumberFormatException -> 0x02f2 }
        if (r0 == 0) goto L_0x0013;
    L_0x000c:
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x02f2 }
        r2 = r14.g;	 Catch:{ NumberFormatException -> 0x02f2 }
        com.whatsapp.App.e(r0, r2);	 Catch:{ NumberFormatException -> 0x02f2 }
    L_0x0013:
        r0 = r14.b;	 Catch:{ NumberFormatException -> 0x02f4 }
        if (r0 == 0) goto L_0x001e;
    L_0x0017:
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x02f4 }
        r2 = r14.b;	 Catch:{ NumberFormatException -> 0x02f4 }
        com.whatsapp.App.a(r0, r2);	 Catch:{ NumberFormatException -> 0x02f4 }
    L_0x001e:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x02f6 }
        r2 = 4;
        if (r0 == r2) goto L_0x0030;
    L_0x0025:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x02f6 }
        if (r0 == r5) goto L_0x0030;
    L_0x002b:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x02f8 }
        r2 = 0;
        r0.z = r2;	 Catch:{ NumberFormatException -> 0x02f8 }
    L_0x0030:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x02fa }
        if (r0 != r10) goto L_0x0077;
    L_0x0036:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x02fa }
        r0.d();	 Catch:{ NumberFormatException -> 0x02fa }
        r0 = z;	 Catch:{ NumberFormatException -> 0x02fa }
        r2 = 9;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x02fa }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x02fa }
        r0 = r14.e;	 Catch:{ NumberFormatException -> 0x02fa }
        if (r0 == 0) goto L_0x004d;
    L_0x0048:
        r0 = r14.e;	 Catch:{ NumberFormatException -> 0x02fc }
        r0.run();	 Catch:{ NumberFormatException -> 0x02fc }
    L_0x004d:
        r0 = com.whatsapp.App.p;
        r2 = r14.a;
        com.whatsapp.App.f(r0, r2);
        r0 = com.whatsapp.App.p;
        com.whatsapp.App.b(r0, r10);
        r0 = com.whatsapp.App.p;
        r2 = r14.c;
        com.whatsapp.App.b(r0, r2);
        r0 = r14.f;
        r2 = r14.a;
        com.whatsapp.a54.a(r0, r2);
        r0 = com.whatsapp.atf.WHATSAPP_INITIATED;	 Catch:{ NumberFormatException -> 0x02fe }
        r2 = r14.i;	 Catch:{ NumberFormatException -> 0x02fe }
        r2 = r2 * r12;
        com.whatsapp.ac.a(r0, r2);	 Catch:{ NumberFormatException -> 0x02fe }
    L_0x006f:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x030a }
        r2 = 0;
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x030a }
        if (r1 == 0) goto L_0x02f1;
    L_0x0077:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x030a }
        r2 = 10;
        if (r0 != r2) goto L_0x00c0;
    L_0x007f:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x030c }
        r0.d();	 Catch:{ NumberFormatException -> 0x030c }
        r0 = z;	 Catch:{ NumberFormatException -> 0x030c }
        r2 = 15;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x030c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x030c }
        r0 = r14.e;	 Catch:{ NumberFormatException -> 0x030c }
        if (r0 == 0) goto L_0x0096;
    L_0x0091:
        r0 = r14.e;	 Catch:{ NumberFormatException -> 0x030e }
        r0.run();	 Catch:{ NumberFormatException -> 0x030e }
    L_0x0096:
        r0 = com.whatsapp.App.p;
        r2 = r14.a;
        com.whatsapp.App.f(r0, r2);
        r0 = com.whatsapp.App.p;
        com.whatsapp.App.b(r0, r11);
        r0 = com.whatsapp.App.p;
        r2 = r14.c;
        com.whatsapp.App.b(r0, r2);
        r0 = r14.f;
        r2 = r14.a;
        com.whatsapp.a54.a(r0, r2);
        r0 = com.whatsapp.atf.WHATSAPP_INITIATED;	 Catch:{ NumberFormatException -> 0x0310 }
        r2 = r14.i;	 Catch:{ NumberFormatException -> 0x0310 }
        r2 = r2 * r12;
        com.whatsapp.ac.a(r0, r2);	 Catch:{ NumberFormatException -> 0x0310 }
    L_0x00b8:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x031c }
        r2 = 0;
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x031c }
        if (r1 == 0) goto L_0x02f1;
    L_0x00c0:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x031c }
        if (r0 != r11) goto L_0x0118;
    L_0x00c6:
        r0 = z;	 Catch:{ NumberFormatException -> 0x031e }
        r2 = 0;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x031e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x031e }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x031e }
        r2 = 0;
        com.whatsapp.App.b(r0, r2);	 Catch:{ NumberFormatException -> 0x031e }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x031e }
        r2 = com.whatsapp.VerifyNumber.k;	 Catch:{ NumberFormatException -> 0x031e }
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x031e }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x031e }
        r0 = r0.b();	 Catch:{ NumberFormatException -> 0x031e }
        if (r0 == 0) goto L_0x00f6;
    L_0x00e3:
        r0 = new com.whatsapp.h_;	 Catch:{ NumberFormatException -> 0x0320 }
        r2 = r14.h;	 Catch:{ NumberFormatException -> 0x0320 }
        r3 = r14.e;	 Catch:{ NumberFormatException -> 0x0320 }
        r4 = r14.j;	 Catch:{ NumberFormatException -> 0x0320 }
        r0.<init>(r2, r3, r4);	 Catch:{ NumberFormatException -> 0x0320 }
        r2 = 0;
        r2 = new java.lang.String[r2];	 Catch:{ NumberFormatException -> 0x0320 }
        com.whatsapp.a5w.a(r0, r2);	 Catch:{ NumberFormatException -> 0x0320 }
        if (r1 == 0) goto L_0x02f1;
    L_0x00f6:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0322 }
        r0.d();	 Catch:{ NumberFormatException -> 0x0322 }
        r0 = 15;
        com.whatsapp.EnterPhoneNumber.w = r0;	 Catch:{ NumberFormatException -> 0x0322 }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0322 }
        r0.b();	 Catch:{ NumberFormatException -> 0x0322 }
        r0 = r14.e;	 Catch:{ NumberFormatException -> 0x0322 }
        if (r0 == 0) goto L_0x010d;
    L_0x0108:
        r0 = r14.e;	 Catch:{ NumberFormatException -> 0x0324 }
        r0.run();	 Catch:{ NumberFormatException -> 0x0324 }
    L_0x010d:
        r0 = r14.j;	 Catch:{ NumberFormatException -> 0x0326 }
        if (r0 == 0) goto L_0x02f1;
    L_0x0111:
        r0 = r14.j;	 Catch:{ NumberFormatException -> 0x0326 }
        r0.run();	 Catch:{ NumberFormatException -> 0x0326 }
        if (r1 == 0) goto L_0x02f1;
    L_0x0118:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x0328 }
        r2 = 5;
        if (r0 != r2) goto L_0x0148;
    L_0x011f:
        r0 = z;	 Catch:{ NumberFormatException -> 0x032a }
        r2 = 6;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x032a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x032a }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x032a }
        r2 = 1;
        r0.z = r2;	 Catch:{ NumberFormatException -> 0x032a }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x032a }
        r0.d();	 Catch:{ NumberFormatException -> 0x032a }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x032a }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x032a }
        if (r0 != 0) goto L_0x02f1;
    L_0x0137:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x032c }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x032c }
        if (r0 != 0) goto L_0x02f1;
    L_0x013f:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x032e }
        r2 = 23;
        r0.showDialog(r2);	 Catch:{ NumberFormatException -> 0x032e }
        if (r1 == 0) goto L_0x02f1;
    L_0x0148:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x0330 }
        r2 = 4;
        if (r0 != r2) goto L_0x0173;
    L_0x014f:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0332 }
        r0.d();	 Catch:{ NumberFormatException -> 0x0332 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x0332 }
        r2 = 4;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x0332 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0332 }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0332 }
        r0 = r0.m;	 Catch:{ NumberFormatException -> 0x0332 }
        if (r0 != 0) goto L_0x02f1;
    L_0x0162:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0334 }
        r0 = r0.isFinishing();	 Catch:{ NumberFormatException -> 0x0334 }
        if (r0 != 0) goto L_0x02f1;
    L_0x016a:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0336 }
        r2 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0.showDialog(r2);	 Catch:{ NumberFormatException -> 0x0336 }
        if (r1 == 0) goto L_0x02f1;
    L_0x0173:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x0338 }
        if (r0 != r5) goto L_0x01a5;
    L_0x0179:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x033a }
        r0.d();	 Catch:{ NumberFormatException -> 0x033a }
        r0 = z;	 Catch:{ NumberFormatException -> 0x033a }
        r2 = 2;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x033a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x033a }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x033a }
        r2 = r14.h;	 Catch:{ NumberFormatException -> 0x033a }
        r3 = 2131624725; // 0x7f0e0315 float:1.8876638E38 double:1.0531625464E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x033a }
        r5 = 0;
        r6 = r14.h;	 Catch:{ NumberFormatException -> 0x033a }
        r7 = 2131624132; // 0x7f0e00c4 float:1.8875435E38 double:1.0531622535E-314;
        r6 = r6.getString(r7);	 Catch:{ NumberFormatException -> 0x033a }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x033a }
        r2 = r2.getString(r3, r4);	 Catch:{ NumberFormatException -> 0x033a }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x033a }
        if (r1 == 0) goto L_0x02f1;
    L_0x01a5:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x033c }
        r2 = 6;
        if (r0 != r2) goto L_0x01dd;
    L_0x01ac:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x033e }
        r0.d();	 Catch:{ NumberFormatException -> 0x033e }
        r0 = z;	 Catch:{ NumberFormatException -> 0x033e }
        r2 = 7;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x033e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x033e }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x033e }
        r0 = r0.r;	 Catch:{ NumberFormatException -> 0x033e }
        r0 = r0.f;	 Catch:{ NumberFormatException -> 0x033e }
        if (r0 != 0) goto L_0x0342;
    L_0x01c1:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0340 }
        r0 = r0.r;	 Catch:{ NumberFormatException -> 0x0340 }
        r0 = r0.a;	 Catch:{ NumberFormatException -> 0x0340 }
    L_0x01c7:
        r2 = r14.h;	 Catch:{ NumberFormatException -> 0x0352 }
        r3 = r14.h;	 Catch:{ NumberFormatException -> 0x0352 }
        r4 = 2131624722; // 0x7f0e0312 float:1.8876632E38 double:1.053162545E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x0352 }
        r6 = 0;
        r5[r6] = r0;	 Catch:{ NumberFormatException -> 0x0352 }
        r0 = r3.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x0352 }
        r2.g(r0);	 Catch:{ NumberFormatException -> 0x0352 }
        if (r1 == 0) goto L_0x02f1;
    L_0x01dd:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x0352 }
        r2 = 7;
        if (r0 != r2) goto L_0x0215;
    L_0x01e4:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0354 }
        r0.d();	 Catch:{ NumberFormatException -> 0x0354 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x0354 }
        r2 = 1;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x0354 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0354 }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0354 }
        r0 = r0.r;	 Catch:{ NumberFormatException -> 0x0354 }
        r0 = r0.f;	 Catch:{ NumberFormatException -> 0x0354 }
        if (r0 != 0) goto L_0x0358;
    L_0x01f9:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0356 }
        r0 = r0.r;	 Catch:{ NumberFormatException -> 0x0356 }
        r0 = r0.a;	 Catch:{ NumberFormatException -> 0x0356 }
    L_0x01ff:
        r2 = r14.h;	 Catch:{ NumberFormatException -> 0x0368 }
        r3 = r14.h;	 Catch:{ NumberFormatException -> 0x0368 }
        r4 = 2131624723; // 0x7f0e0313 float:1.8876634E38 double:1.0531625455E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x0368 }
        r6 = 0;
        r5[r6] = r0;	 Catch:{ NumberFormatException -> 0x0368 }
        r0 = r3.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x0368 }
        r2.g(r0);	 Catch:{ NumberFormatException -> 0x0368 }
        if (r1 == 0) goto L_0x02f1;
    L_0x0215:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x0368 }
        r2 = 8;
        if (r0 != r2) goto L_0x029b;
    L_0x021d:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x036a }
        r0.d();	 Catch:{ NumberFormatException -> 0x036a }
        r0 = z;	 Catch:{ NumberFormatException -> 0x036a }
        r2 = 10;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x036a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x036a }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x036a }
        r0 = r0.r;	 Catch:{ NumberFormatException -> 0x036a }
        r0 = r0.f;	 Catch:{ NumberFormatException -> 0x036a }
        if (r0 != 0) goto L_0x036e;
    L_0x0233:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x036c }
        r0 = r0.r;	 Catch:{ NumberFormatException -> 0x036c }
        r0 = r0.a;	 Catch:{ NumberFormatException -> 0x036c }
    L_0x0239:
        r2 = r14.h;	 Catch:{ NumberFormatException -> 0x037e }
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x037e }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x037e }
        r4 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x037e }
        r4.<init>();	 Catch:{ NumberFormatException -> 0x037e }
        r5 = "+";
        r4 = r4.append(r5);	 Catch:{ NumberFormatException -> 0x037e }
        r5 = r14.h;	 Catch:{ NumberFormatException -> 0x037e }
        r5 = r5.r;	 Catch:{ NumberFormatException -> 0x037e }
        r5 = r5.e;	 Catch:{ NumberFormatException -> 0x037e }
        r5 = r5.getText();	 Catch:{ NumberFormatException -> 0x037e }
        r4 = r4.append(r5);	 Catch:{ NumberFormatException -> 0x037e }
        r5 = " ";
        r4 = r4.append(r5);	 Catch:{ NumberFormatException -> 0x037e }
        r5 = r14.h;	 Catch:{ NumberFormatException -> 0x037e }
        r5 = r5.r;	 Catch:{ NumberFormatException -> 0x037e }
        r5 = r5.c;	 Catch:{ NumberFormatException -> 0x037e }
        r5 = r5.getText();	 Catch:{ NumberFormatException -> 0x037e }
        r4 = r4.append(r5);	 Catch:{ NumberFormatException -> 0x037e }
        r4 = r4.toString();	 Catch:{ NumberFormatException -> 0x037e }
        r4 = com.whatsapp.b7.a(r4);	 Catch:{ NumberFormatException -> 0x037e }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x037e }
        r4 = "\n";
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x037e }
        r4 = r14.h;	 Catch:{ NumberFormatException -> 0x037e }
        r5 = 2131624720; // 0x7f0e0310 float:1.8876628E38 double:1.053162544E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x037e }
        r7 = 0;
        r6[r7] = r0;	 Catch:{ NumberFormatException -> 0x037e }
        r0 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x037e }
        r0 = r3.append(r0);	 Catch:{ NumberFormatException -> 0x037e }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x037e }
        r2.g(r0);	 Catch:{ NumberFormatException -> 0x037e }
        if (r1 == 0) goto L_0x02f1;
    L_0x029b:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x037e }
        r2 = 9;
        if (r0 != r2) goto L_0x0395;
    L_0x02a3:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0380 }
        r0.d();	 Catch:{ NumberFormatException -> 0x0380 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x0380 }
        r2 = 3;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x0380 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0380 }
        r0 = r14.d;	 Catch:{ NumberFormatException -> 0x0380 }
        if (r0 != 0) goto L_0x02c4;
    L_0x02b4:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0382 }
        r2 = r14.h;	 Catch:{ NumberFormatException -> 0x0382 }
        r3 = 2131624760; // 0x7f0e0338 float:1.8876709E38 double:1.0531625637E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x0382 }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x0382 }
        if (r1 == 0) goto L_0x02f1;
    L_0x02c4:
        r0 = r14.d;	 Catch:{ NumberFormatException -> 0x0384 }
        r2 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0384 }
        r2 = r2 * r12;
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ NumberFormatException -> 0x0384 }
        r4 = r4 + r2;
        com.whatsapp.EnterPhoneNumber.s = r4;	 Catch:{ NumberFormatException -> 0x0384 }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0384 }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x0384 }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0384 }
        r4 = r14.h;	 Catch:{ NumberFormatException -> 0x0384 }
        r5 = 2131624761; // 0x7f0e0339 float:1.887671E38 double:1.053162564E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x0384 }
        r7 = 0;
        r8 = r14.h;	 Catch:{ NumberFormatException -> 0x0384 }
        r2 = com.whatsapp.util.bm.g(r8, r2);	 Catch:{ NumberFormatException -> 0x0384 }
        r6[r7] = r2;	 Catch:{ NumberFormatException -> 0x0384 }
        r2 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x0384 }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x0384 }
    L_0x02f1:
        return;
    L_0x02f2:
        r0 = move-exception;
        throw r0;
    L_0x02f4:
        r0 = move-exception;
        throw r0;
    L_0x02f6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02f8 }
    L_0x02f8:
        r0 = move-exception;
        throw r0;
    L_0x02fa:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x02fc }
    L_0x02fc:
        r0 = move-exception;
        throw r0;
    L_0x02fe:
        r0 = move-exception;
        r2 = z;
        r3 = 14;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        goto L_0x006f;
    L_0x030a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x030c }
    L_0x030c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x030e }
    L_0x030e:
        r0 = move-exception;
        throw r0;
    L_0x0310:
        r0 = move-exception;
        r0 = z;
        r2 = 8;
        r0 = r0[r2];
        com.whatsapp.util.Log.e(r0);
        goto L_0x00b8;
    L_0x031c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x031e }
    L_0x031e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0320 }
    L_0x0320:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0322 }
    L_0x0322:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0324 }
    L_0x0324:
        r0 = move-exception;
        throw r0;
    L_0x0326:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0328 }
    L_0x0328:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x032a }
    L_0x032a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x032c }
    L_0x032c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x032e }
    L_0x032e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0330 }
    L_0x0330:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0332 }
    L_0x0332:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0334 }
    L_0x0334:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0336 }
    L_0x0336:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0338 }
    L_0x0338:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x033a }
    L_0x033a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x033c }
    L_0x033c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x033e }
    L_0x033e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0340 }
    L_0x0340:
        r0 = move-exception;
        throw r0;
    L_0x0342:
        r0 = r14.h;
        r0 = r0.r;
        r0 = r0.f;
        r0 = r0.getText();
        r0 = r0.toString();
        goto L_0x01c7;
    L_0x0352:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0354 }
    L_0x0354:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0356 }
    L_0x0356:
        r0 = move-exception;
        throw r0;
    L_0x0358:
        r0 = r14.h;
        r0 = r0.r;
        r0 = r0.f;
        r0 = r0.getText();
        r0 = r0.toString();
        goto L_0x01ff;
    L_0x0368:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x036a }
    L_0x036a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x036c }
    L_0x036c:
        r0 = move-exception;
        throw r0;
    L_0x036e:
        r0 = r14.h;
        r0 = r0.r;
        r0 = r0.f;
        r0 = r0.getText();
        r0 = r0.toString();
        goto L_0x0239;
    L_0x037e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0380 }
    L_0x0380:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0382 }
    L_0x0382:
        r0 = move-exception;
        throw r0;
    L_0x0384:
        r0 = move-exception;
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0482 }
        r2 = r14.h;	 Catch:{ NumberFormatException -> 0x0482 }
        r3 = 2131624760; // 0x7f0e0338 float:1.8876709E38 double:1.0531625637E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x0482 }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x0482 }
        if (r1 == 0) goto L_0x02f1;
    L_0x0395:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x0482 }
        r2 = 12;
        if (r0 != r2) goto L_0x03b7;
    L_0x039d:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0484 }
        r0.d();	 Catch:{ NumberFormatException -> 0x0484 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x0484 }
        r2 = 12;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x0484 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0484 }
        r0 = 1;
        com.whatsapp.App.T = r0;	 Catch:{ NumberFormatException -> 0x0484 }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0484 }
        r2 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r0.e(r2);	 Catch:{ NumberFormatException -> 0x0484 }
        if (r1 == 0) goto L_0x02f1;
    L_0x03b7:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x0486 }
        r2 = 14;
        if (r0 != r2) goto L_0x0404;
    L_0x03bf:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0488 }
        r0.d();	 Catch:{ NumberFormatException -> 0x0488 }
        r0 = z;	 Catch:{ NumberFormatException -> 0x0488 }
        r2 = 11;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x0488 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0488 }
        r0 = com.whatsapp.App.G;	 Catch:{ NumberFormatException -> 0x0488 }
        if (r0 != r11) goto L_0x03dc;
    L_0x03d1:
        r0 = r14.h;
        r2 = 2131624748; // 0x7f0e032c float:1.8876684E38 double:1.053162558E-314;
        r0 = r0.getString(r2);
        if (r1 == 0) goto L_0x03fd;
    L_0x03dc:
        r0 = com.whatsapp.App.G;	 Catch:{ NumberFormatException -> 0x048a }
        if (r0 != 0) goto L_0x03eb;
    L_0x03e0:
        r0 = r14.h;
        r2 = 2131624749; // 0x7f0e032d float:1.8876687E38 double:1.0531625583E-314;
        r0 = r0.getString(r2);
        if (r1 == 0) goto L_0x03fd;
    L_0x03eb:
        r0 = r14.h;
        r2 = 2131624750; // 0x7f0e032e float:1.8876689E38 double:1.053162559E-314;
        r3 = new java.lang.Object[r10];
        r4 = z;
        r5 = 5;
        r4 = r4[r5];
        r3[r9] = r4;
        r0 = r0.getString(r2, r3);
    L_0x03fd:
        r2 = r14.h;	 Catch:{ NumberFormatException -> 0x048c }
        r2.g(r0);	 Catch:{ NumberFormatException -> 0x048c }
        if (r1 == 0) goto L_0x02f1;
    L_0x0404:
        r0 = r15.intValue();	 Catch:{ NumberFormatException -> 0x048c }
        r2 = 11;
        if (r0 != r2) goto L_0x02f1;
    L_0x040c:
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x048e }
        r0.d();	 Catch:{ NumberFormatException -> 0x048e }
        r0 = z;	 Catch:{ NumberFormatException -> 0x048e }
        r2 = 16;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x048e }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x048e }
        r0 = r14.d;	 Catch:{ NumberFormatException -> 0x048e }
        if (r0 == 0) goto L_0x0467;
    L_0x041e:
        r0 = r14.d;	 Catch:{ NumberFormatException -> 0x044d }
        r2 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x044d }
        r2 = r2 * r12;
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ NumberFormatException -> 0x044d }
        r4 = r4 + r2;
        com.whatsapp.EnterPhoneNumber.s = r4;	 Catch:{ NumberFormatException -> 0x044d }
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x044d }
        r0.a(r2);	 Catch:{ NumberFormatException -> 0x044d }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x044d }
        r4 = r14.h;	 Catch:{ NumberFormatException -> 0x044d }
        r5 = 2131624764; // 0x7f0e033c float:1.8876717E38 double:1.0531625657E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x044d }
        r7 = 0;
        r8 = r14.h;	 Catch:{ NumberFormatException -> 0x044d }
        r2 = com.whatsapp.util.bm.g(r8, r2);	 Catch:{ NumberFormatException -> 0x044d }
        r6[r7] = r2;	 Catch:{ NumberFormatException -> 0x044d }
        r2 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x044d }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x044d }
        goto L_0x02f1;
    L_0x044d:
        r0 = move-exception;
        r0 = z;	 Catch:{ NumberFormatException -> 0x0480 }
        r2 = 13;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x0480 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0480 }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0480 }
        r2 = r14.h;	 Catch:{ NumberFormatException -> 0x0480 }
        r3 = 2131624765; // 0x7f0e033d float:1.8876719E38 double:1.053162566E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x0480 }
        r0.g(r2);	 Catch:{ NumberFormatException -> 0x0480 }
        if (r1 == 0) goto L_0x02f1;
    L_0x0467:
        r0 = z;	 Catch:{ NumberFormatException -> 0x0480 }
        r1 = 17;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0480 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0480 }
        r0 = r14.h;	 Catch:{ NumberFormatException -> 0x0480 }
        r1 = r14.h;	 Catch:{ NumberFormatException -> 0x0480 }
        r2 = 2131624765; // 0x7f0e033d float:1.8876719E38 double:1.053162566E-314;
        r1 = r1.getString(r2);	 Catch:{ NumberFormatException -> 0x0480 }
        r0.g(r1);	 Catch:{ NumberFormatException -> 0x0480 }
        goto L_0x02f1;
    L_0x0480:
        r0 = move-exception;
        throw r0;
    L_0x0482:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0484 }
    L_0x0484:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0486 }
    L_0x0486:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0488 }
    L_0x0488:
        r0 = move-exception;
        throw r0;
    L_0x048a:
        r0 = move-exception;
        throw r0;
    L_0x048c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x048e }
    L_0x048e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.vo.a(java.lang.Integer):void");
    }

    protected Object doInBackground(Object[] objArr) {
        return a((byte[][]) objArr);
    }

    protected void onPostExecute(Object obj) {
        a((Integer) obj);
    }
}
