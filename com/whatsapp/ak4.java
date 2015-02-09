package com.whatsapp;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.fieldstats.Events$Call;
import com.whatsapp.fieldstats.a6;
import com.whatsapp.fieldstats.a7;
import com.whatsapp.fieldstats.ae;
import com.whatsapp.fieldstats.af;
import com.whatsapp.fieldstats.ah;
import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.am;
import com.whatsapp.fieldstats.an;
import com.whatsapp.fieldstats.ap;
import com.whatsapp.fieldstats.at;
import com.whatsapp.fieldstats.au;
import com.whatsapp.fieldstats.d;
import com.whatsapp.fieldstats.i;
import com.whatsapp.fieldstats.j;
import com.whatsapp.fieldstats.k;
import com.whatsapp.fieldstats.l;
import com.whatsapp.fieldstats.m;
import com.whatsapp.fieldstats.n;
import com.whatsapp.fieldstats.p;
import com.whatsapp.fieldstats.q;
import com.whatsapp.fieldstats.r;
import com.whatsapp.fieldstats.x;
import com.whatsapp.fieldstats.y;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ak4 {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "ksq4z~nu,vhvd=l~5a(zlnq5{isu>qa~q*xd\u007fx<my{`+1hhf7l\"i`9}fub=lkv{/";
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
                        i3 = 13;
                        break;
                    case ay.f /*1*/:
                        i3 = 26;
                        break;
                    case ay.n /*2*/:
                        i3 = 20;
                        break;
                    case ay.p /*3*/:
                        i3 = 88;
                        break;
                    default:
                        i3 = 30;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "}r{6{";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "nuz6{nn}.wyc";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "`\u007fp1\u007fkux<{\u007fi}\"{-v}+jh~R1rhi41m-ta4r-|{*>kux<{\u007f:";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "ksq4z~nu,vhvd=l~5a(zlnq5{isu>qa~q*xd\u007fx<my{`+1hhf7l\"ua,qkwq5q\u007fc";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void a(Context context, b bVar, ah ahVar, long j, long j2) {
        c kVar = new k();
        kVar.c = Double.valueOf(c(bVar));
        kVar.e = Double.valueOf((double) ahVar.getCode());
        kVar.a = Double.valueOf((double) j);
        kVar.d = Double.valueOf((double) j2);
        al.a(context, kVar);
    }

    public static void a(Context context, Events$Call events$Call) {
        al.a(context, (c) events$Call);
    }

    static void a(au auVar) {
        a(auVar, null);
    }

    public static void a(Context context, boolean z, com.whatsapp.contact.k kVar, long j) {
        double d;
        c dVar = new d();
        if (z) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        dVar.c = Double.valueOf(d);
        int a = a(kVar);
        if (a != 0) {
            dVar.b = Double.valueOf((double) a);
        }
        dVar.a = Double.valueOf((double) j);
        al.a(context, dVar);
    }

    static void b(b bVar) {
        double d = 1.0d;
        if (bVar != null) {
            c mVar = new m();
            mVar.f = Double.valueOf(c(bVar));
            mVar.b = Double.valueOf(d(bVar));
            if (mVar.b.doubleValue() == ((double) an.INDIVIDUAL.getCode()) || mVar.b.doubleValue() == ((double) an.BROADCAST.getCode())) {
                Boolean a = a(bVar);
                if (a != null) {
                    double d2;
                    if (a.booleanValue()) {
                        d2 = 1.0d;
                    } else {
                        d2 = 0.0d;
                    }
                    mVar.g = Double.valueOf(d2);
                }
            }
            if (bVar.r == null) {
                d = 0.0d;
            }
            mVar.d = Double.valueOf(d);
            al.a(App.p.getApplicationContext(), mVar);
        }
    }

    private static double c(b bVar) {
        switch (bVar.j) {
            case ay.f /*1*/:
                return (double) am.PHOTO.getCode();
            case ay.n /*2*/:
                return bVar.w == 1 ? (double) am.PTT.getCode() : (double) am.AUDIO.getCode();
            case ay.p /*3*/:
                return (double) am.VIDEO.getCode();
            case aj.i /*4*/:
                return (double) am.CONTACT.getCode();
            case aV.r /*5*/:
                return (double) am.LOCATION.getCode();
            default:
                return (double) am.NONE.getCode();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long[] a(java.io.File r13) {
        /*
        r12 = 1;
        r2 = 0;
        r3 = com.whatsapp.App.az;
        r0 = 2;
        r0 = new long[r0];
        r0 = new long[]{0, 0};
        if (r13 != 0) goto L_0x000d;
    L_0x000c:
        return r0;
    L_0x000d:
        r4 = r13.listFiles();
        if (r4 == 0) goto L_0x004f;
    L_0x0013:
        r5 = r4.length;
        r1 = r2;
    L_0x0015:
        if (r1 >= r5) goto L_0x004d;
    L_0x0017:
        r6 = r4[r1];
        r7 = r6.isFile();
        if (r7 == 0) goto L_0x0031;
    L_0x001f:
        r8 = r0[r2];
        r10 = r6.length();
        r8 = r8 + r10;
        r0[r2] = r8;
        r8 = r0[r12];
        r10 = 1;
        r8 = r8 + r10;
        r0[r12] = r8;
        if (r3 == 0) goto L_0x0049;
    L_0x0031:
        r7 = r6.isDirectory();
        if (r7 == 0) goto L_0x0049;
    L_0x0037:
        r6 = a(r6);
        r8 = r0[r2];
        r10 = r6[r2];
        r8 = r8 + r10;
        r0[r2] = r8;
        r8 = r0[r12];
        r6 = r6[r12];
        r6 = r6 + r8;
        r0[r12] = r6;
    L_0x0049:
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0015;
    L_0x004d:
        if (r3 == 0) goto L_0x000c;
    L_0x004f:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r13);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ak4.a(java.io.File):long[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a() {
        /*
        r0 = 0;
        r5 = com.whatsapp.App.az;
        r6 = com.whatsapp.v.e();
        r1 = r0;
        r2 = r0;
        r3 = r0;
        r4 = r0;
    L_0x000b:
        r0 = r6.size();
        if (r1 >= r0) goto L_0x0033;
    L_0x0011:
        r0 = r6.get(r1);
        r0 = (java.lang.String) r0;
        if (r0 == 0) goto L_0x002f;
    L_0x0019:
        r7 = com.whatsapp.bd.b(r0);
        if (r7 == 0) goto L_0x0023;
    L_0x001f:
        r3 = r3 + 1;
        if (r5 == 0) goto L_0x002f;
    L_0x0023:
        r0 = com.whatsapp.m8.d(r0);
        if (r0 == 0) goto L_0x002d;
    L_0x0029:
        r2 = r2 + 1;
        if (r5 == 0) goto L_0x002f;
    L_0x002d:
        r4 = r4 + 1;
    L_0x002f:
        r0 = r1 + 1;
        if (r5 == 0) goto L_0x0055;
    L_0x0033:
        r0 = com.whatsapp.App.p;
        r1 = com.whatsapp.fieldstats.y.INDIVIDUAL_CHAT_COUNT;
        r4 = java.lang.Integer.valueOf(r4);
        com.whatsapp.fieldstats.al.a(r0, r1, r4);
        r0 = com.whatsapp.App.p;
        r1 = com.whatsapp.fieldstats.y.GROUP_CHAT_COUNT;
        r3 = java.lang.Integer.valueOf(r3);
        com.whatsapp.fieldstats.al.a(r0, r1, r3);
        r0 = com.whatsapp.App.p;
        r1 = com.whatsapp.fieldstats.y.BROADCAST_CHAT_COUNT;
        r2 = java.lang.Integer.valueOf(r2);
        com.whatsapp.fieldstats.al.a(r0, r1, r2);
        return;
    L_0x0055:
        r1 = r0;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ak4.a():void");
    }

    public static void a(Context context) {
        Integer num;
        boolean z = true;
        int aY = App.aY();
        al.a(context, y.NETWORK_IS_WIFI, Boolean.valueOf(aY == 1));
        y yVar = y.NETWORK_IS_ROAMING;
        if (aY != 3) {
            z = false;
        }
        al.a(context, yVar, Boolean.valueOf(z));
        int c = c();
        y yVar2 = y.NETWORK_RADIO_TYPE;
        if (c == -1) {
            num = null;
        } else {
            num = Integer.valueOf(c);
        }
        al.a(context, yVar2, num);
    }

    private static Boolean a(b bVar) {
        if (App.an == null || App.an.cc == null || bVar.e == null || bVar.e.c == null) {
            return null;
        }
        boolean z;
        if (bVar.e.c.startsWith(App.an.cc)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static void a(b bVar, long j) {
        double d = 0.0d;
        if (bVar != null) {
            c nVar = new n();
            nVar.d = Double.valueOf((double) j);
            nVar.b = Double.valueOf(c(bVar));
            nVar.g = Double.valueOf(d(bVar));
            if (nVar.g.doubleValue() == ((double) an.INDIVIDUAL.getCode())) {
                Boolean a = a(bVar);
                if (a != null) {
                    double d2;
                    if (a.booleanValue()) {
                        d2 = 1.0d;
                    } else {
                        d2 = 0.0d;
                    }
                    nVar.a = Double.valueOf(d2);
                }
            }
            if (!TextUtils.isEmpty(bVar.v)) {
                d = 1.0d;
            }
            nVar.h = Double.valueOf(d);
            al.a(App.p.getApplicationContext(), nVar);
        }
    }

    static void a(Context context, am amVar, boolean z, r rVar, long j, long j2) {
        double d;
        c lVar = new l();
        lVar.c = Double.valueOf((double) amVar.getCode());
        if (z) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        lVar.d = Double.valueOf(d);
        lVar.e = Double.valueOf((double) rVar.getCode());
        lVar.f = Double.valueOf((double) j);
        lVar.b = Double.valueOf((double) j2);
        al.a(context, lVar);
    }

    static void a(Context context, at atVar, long j) {
        c pVar = new p();
        pVar.a = Double.valueOf((double) atVar.getCode());
        pVar.b = Double.valueOf((double) j);
        al.a(context, pVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c() {
        /*
        r2 = com.whatsapp.App.az;
        r1 = -1;
        r0 = com.whatsapp.App.p;
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r0 = r0.getSystemService(r3);
        r0 = (android.net.ConnectivityManager) r0;
        if (r0 == 0) goto L_0x00ba;
    L_0x0012:
        r0 = r0.getActiveNetworkInfo();
        if (r0 == 0) goto L_0x00ba;
    L_0x0018:
        r3 = r0.getType();
        if (r3 != 0) goto L_0x00b8;
    L_0x001e:
        r0 = com.whatsapp.App.p;
        r1 = z;
        r4 = 2;
        r1 = r1[r4];
        r0 = r0.getSystemService(r1);
        r0 = (android.telephony.TelephonyManager) r0;
        if (r0 == 0) goto L_0x003c;
    L_0x002d:
        r0 = r0.getNetworkType();
        switch(r0) {
            case 1: goto L_0x0056;
            case 2: goto L_0x004e;
            case 3: goto L_0x005e;
            case 4: goto L_0x007e;
            case 5: goto L_0x0086;
            case 6: goto L_0x0086;
            case 7: goto L_0x008e;
            case 8: goto L_0x0066;
            case 9: goto L_0x006e;
            case 10: goto L_0x0076;
            case 11: goto L_0x00a6;
            case 12: goto L_0x0086;
            case 13: goto L_0x0096;
            case 14: goto L_0x009e;
            case 15: goto L_0x00ae;
            default: goto L_0x0034;
        };
    L_0x0034:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_UNKNOWN;
        r0 = r0.getCode();
    L_0x003a:
        if (r2 == 0) goto L_0x0042;
    L_0x003c:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_UNKNOWN;
        r0 = r0.getCode();
    L_0x0042:
        if (r2 == 0) goto L_0x004d;
    L_0x0044:
        r1 = 1;
        if (r3 != r1) goto L_0x004d;
    L_0x0047:
        r0 = com.whatsapp.fieldstats.ab.WIFI_UNKNOWN;
        r0 = r0.getCode();
    L_0x004d:
        return r0;
    L_0x004e:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_EDGE;
        r0 = r0.getCode();
        if (r2 == 0) goto L_0x003a;
    L_0x0056:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_GPRS;
        r0 = r0.getCode();
        if (r2 == 0) goto L_0x003a;
    L_0x005e:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_UMTS;
        r0 = r0.getCode();
        if (r2 == 0) goto L_0x003a;
    L_0x0066:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_HSDPA;
        r0 = r0.getCode();
        if (r2 == 0) goto L_0x003a;
    L_0x006e:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_HSUPA;
        r0 = r0.getCode();
        if (r2 == 0) goto L_0x003a;
    L_0x0076:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_HSPA;
        r0 = r0.getCode();
        if (r2 == 0) goto L_0x003a;
    L_0x007e:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_CDMA;
        r0 = r0.getCode();
        if (r2 == 0) goto L_0x003a;
    L_0x0086:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_EVDO;
        r0 = r0.getCode();
        if (r2 == 0) goto L_0x003a;
    L_0x008e:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_1XRTT;
        r0 = r0.getCode();
        if (r2 == 0) goto L_0x003a;
    L_0x0096:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_LTE;
        r0 = r0.getCode();
        if (r2 == 0) goto L_0x003a;
    L_0x009e:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_EHRPD;
        r0 = r0.getCode();
        if (r2 == 0) goto L_0x003a;
    L_0x00a6:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_IDEN;
        r0 = r0.getCode();
        if (r2 == 0) goto L_0x003a;
    L_0x00ae:
        r0 = com.whatsapp.fieldstats.ab.CELLULAR_HSPAP;
        r0 = r0.getCode();
        if (r2 == 0) goto L_0x003a;
    L_0x00b6:
        goto L_0x0034;
    L_0x00b8:
        r0 = r1;
        goto L_0x0044;
    L_0x00ba:
        r0 = r1;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ak4.c():int");
    }

    static void b() {
        File a = yf.a((byte) 0, 0, false);
        try {
            if (a.exists() && a.isDirectory()) {
                try {
                    long[] a2 = a(a);
                    al.a(App.p, y.MEDIA_FOLDER_SIZE, Double.valueOf((double) a2[0]));
                    al.a(App.p, y.MEDIA_FOLDER_FILE_COUNT, Double.valueOf((double) a2[1]));
                } catch (StackOverflowError e) {
                    Log.e(z[0]);
                } catch (OutOfMemoryError e2) {
                    Log.e(z[1]);
                }
            }
        } catch (StackOverflowError e3) {
            throw e3;
        } catch (StackOverflowError e32) {
            throw e32;
        }
    }

    static void a(au auVar, a7 a7Var) {
        c qVar = new q();
        qVar.b = Double.valueOf((double) auVar.getCode());
        if (a7Var != null) {
            qVar.a = Double.valueOf((double) a7Var.getCode());
        }
        al.a(App.p, qVar);
    }

    private static double d(b bVar) {
        if (bVar.l) {
            return (double) an.BROADCAST.getCode();
        }
        return bd.b(bVar.e.c) ? (double) an.GROUP.getCode() : (double) an.INDIVIDUAL.getCode();
    }

    public static void a(Context context, ap apVar, a6 a6Var, af afVar, boolean z, boolean z2, int i, int i2, long j) {
        double d;
        c iVar = new i();
        iVar.e = Double.valueOf((double) apVar.getCode());
        iVar.b = Double.valueOf((double) a6Var.getCode());
        iVar.c = Double.valueOf((double) afVar.getCode());
        if (z) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        iVar.g = Double.valueOf(d);
        if (z2) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        iVar.f = Double.valueOf(d);
        iVar.d = Double.valueOf((double) i);
        iVar.a = Double.valueOf((double) i2);
        iVar.h = Double.valueOf((double) j);
        al.a(context, iVar);
    }

    public static void a(Context context, boolean z, int i, long j) {
        int code;
        c jVar = new j();
        if (z) {
            code = ae.OK.getCode();
        } else {
            code = ae.ERROR_UNKNOWN.getCode();
        }
        jVar.c = Double.valueOf((double) code);
        jVar.a = Double.valueOf((double) i);
        jVar.b = Double.valueOf((double) j);
        al.a(context, jVar);
    }

    private static int a(com.whatsapp.contact.k kVar) {
        if (kVar == com.whatsapp.contact.k.NETWORK_UNAVAILABLE) {
            return x.NETWORK_UNAVAILABLE.getCode();
        }
        if (kVar == com.whatsapp.contact.k.IN_PROGRESS) {
            return x.IN_PROGRESS.getCode();
        }
        if (kVar == com.whatsapp.contact.k.UP_TO_DATE) {
            return x.UP_TO_DATE.getCode();
        }
        if (kVar == com.whatsapp.contact.k.FAILED) {
            return x.FAILED.getCode();
        }
        if (kVar == com.whatsapp.contact.k.DELAYED) {
            return x.DELAYED.getCode();
        }
        return kVar == com.whatsapp.contact.k.USER_IS_EXPIRED ? x.USER_IS_EXPIRED.getCode() : 0;
    }
}
