package com.whatsapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.bb;
import com.whatsapp.protocol.bj;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class bd implements bb {
    private static final int[] a;
    private static final ConcurrentHashMap b;
    public static boolean c;
    private static ConcurrentHashMap d;
    public static boolean e;
    public static Handler f;
    private static final String[] z;

    public void a(bj bjVar, String str) {
        int i = App.az;
        Log.i(z[25] + bjVar);
        if (b.containsKey(bjVar.a)) {
            cs i2 = i(bjVar.a);
            i2.a(App.P.d().e);
            for (l6 l6Var : i2.b()) {
                l6Var.c = false;
                if (i != 0) {
                    break;
                }
            }
            a(1, a(17, bjVar, bjVar.a, bjVar.d));
            if (i == 0) {
                return;
            }
        }
        App.a(bjVar);
    }

    public void a(Vector vector) {
        int i = App.az;
        Log.i(z[40] + Arrays.deepToString(vector.toArray()));
        Iterator it = v.b().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (b(str) && !vector.contains(str)) {
                i(str).a(App.P.d().e);
                App.aJ.c(str, App.P.d().e);
                if (App.P.f(str) == null) {
                    App.P.n(new m8(str));
                }
                l8 x = App.aJ.x(str);
                if (!(x.b == null || x.a == null)) {
                    App.P.a(str, null, x.b, x.a.longValue());
                    continue;
                }
            }
            if (i != 0) {
                break;
            }
        }
        e = false;
        a(false);
        App.aJ.f(g());
        if (c) {
            c = false;
            App.ad();
        }
        App.aH.sendEmptyMessage(0);
    }

    public void a(bj bjVar) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.bj r10, java.util.Vector r11, java.lang.String r12) {
        /*
        r9_this = this;
        r2 = 0;
        r4 = 1;
        r5 = com.whatsapp.App.az;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 13;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r0 = r0.append(r10);
        r1 = "/";
        r0 = r0.append(r1);
        r1 = r11.toArray();
        r1 = java.util.Arrays.deepToString(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r6 = r10.a;
        r7 = i(r6);
        r8 = r11.iterator();
        r1 = r2;
    L_0x003b:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x0081;
    L_0x0041:
        r0 = r8.next();
        r0 = (java.lang.String) r0;
        r3 = r7.b(r0);
        if (r3 != 0) goto L_0x007f;
    L_0x004d:
        r0 = r7.a(r0, r4, r2);
        if (r5 == 0) goto L_0x0055;
    L_0x0053:
        r0.c = r4;
    L_0x0055:
        r3 = r0;
        r0 = r3.a();
        if (r0 == 0) goto L_0x007d;
    L_0x005c:
        r0 = r4;
    L_0x005d:
        r1 = com.whatsapp.App.aJ;
        r1.a(r6, r3);
        if (r5 == 0) goto L_0x007b;
    L_0x0064:
        if (r0 == 0) goto L_0x0073;
    L_0x0066:
        r0 = 15;
        r1 = r10.d;
        r0 = b(r0, r10, r6, r1, r11);
        a(r4, r0);
        if (r5 == 0) goto L_0x007a;
    L_0x0073:
        com.whatsapp.App.a(r10);
        r0 = 4;
        a(r0, r6);
    L_0x007a:
        return;
    L_0x007b:
        r1 = r0;
        goto L_0x003b;
    L_0x007d:
        r0 = r1;
        goto L_0x005d;
    L_0x007f:
        r0 = r3;
        goto L_0x0053;
    L_0x0081:
        r0 = r1;
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bd.a(com.whatsapp.protocol.bj, java.util.Vector, java.lang.String):void");
    }

    public static String g() {
        return App.af() + "-" + z[79];
    }

    public void a(String str, String str2, long j, String str3, long j2, String str4, String str5, long j3, Hashtable hashtable) {
        Log.i(z[68] + str + z[69] + str2 + z[72] + j + z[65] + str4 + z[70] + str3 + z[71] + j2 + z[67] + str5 + z[73] + j3);
        Log.i(z[66] + Arrays.deepToString(Collections.list(hashtable.keys()).toArray()) + "/" + Arrays.deepToString(hashtable.values().toArray()));
        c(str, str2, j, str3, j2, str4, str5, j3, hashtable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.util.Vector r7) {
        /*
        r2 = com.whatsapp.App.az;
        r0 = 0;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = r7.iterator();
        r1 = r0;
    L_0x000d:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0037;
    L_0x0013:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r5 = com.whatsapp.App.P;
        r5 = r5.h(r0);
        if (r5 == 0) goto L_0x0024;
    L_0x0021:
        r1 = 1;
        if (r2 == 0) goto L_0x0033;
    L_0x0024:
        r5 = com.whatsapp.App.P;
        r0 = r5.a(r0);
        r5 = r3.contains(r0);
        if (r5 != 0) goto L_0x0033;
    L_0x0030:
        r3.add(r0);
    L_0x0033:
        r0 = r1;
        if (r2 == 0) goto L_0x0087;
    L_0x0036:
        r1 = r0;
    L_0x0037:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = new java.util.ArrayList;
        r5.<init>();
        r3 = r3.iterator();
    L_0x0045:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x006b;
    L_0x004b:
        r0 = r3.next();
        r0 = (com.whatsapp.m8) r0;
        r6 = r0.o();
        if (r6 == 0) goto L_0x0069;
    L_0x0057:
        r0 = r0.a();
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0066;
    L_0x0061:
        r5.add(r6);
        if (r2 == 0) goto L_0x0069;
    L_0x0066:
        r4.add(r6);
    L_0x0069:
        if (r2 == 0) goto L_0x0045;
    L_0x006b:
        java.util.Collections.sort(r4);
        java.util.Collections.sort(r5);
        r4.addAll(r5);
        if (r1 == 0) goto L_0x0082;
    L_0x0076:
        r0 = com.whatsapp.App.p;
        r1 = 2131625135; // 0x7f0e04af float:1.887747E38 double:1.053162749E-314;
        r0 = r0.getString(r1);
        r4.add(r0);
    L_0x0082:
        r0 = a(r4);
        return r0;
    L_0x0087:
        r1 = r0;
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bd.a(java.util.Vector):java.lang.String");
    }

    public void b(Vector vector) {
        int i = App.az;
        Log.i(z[34] + Arrays.deepToString(vector.toArray()));
        String str = App.P.d().e;
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            d.remove(str2);
            i(str2).a(str);
            lh.b.b(str2);
            a(1, a(5, null, str2, str));
            if (i != 0) {
                return;
            }
        }
    }

    private static b a(String str, String str2, String str3) {
        b bVar = new b(str, (byte[]) null, null);
        bVar.a = 6;
        bVar.k = 10;
        bVar.F = str2;
        bVar.A = str3;
        bVar.D = App.a2();
        return bVar;
    }

    public static void a(String str, String str2) {
        i(str).a(str2);
        d.remove(str);
        a(1, a(7, null, str, str2));
    }

    public void d(String str, Hashtable hashtable, Hashtable hashtable2) {
        Log.i(z[35] + str + "/" + Arrays.deepToString(hashtable.keySet().toArray()) + "/" + Arrays.deepToString(hashtable2.keySet().toArray()));
        if (hashtable2 != null && hashtable2.size() > 0) {
            a(38, (Object) hashtable2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.bj r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, long r23, java.lang.String r25, long r26, java.lang.String r28, java.lang.String r29, java.util.Hashtable r30, java.lang.String r31) {
        /*
        r17_this = this;
        r13 = com.whatsapp.App.az;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 8;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r18;
        r4 = r4.append(r0);
        r5 = "/";
        r4 = r4.append(r5);
        r0 = r22;
        r4 = r4.append(r0);
        r5 = "/";
        r4 = r4.append(r5);
        r0 = r23;
        r4 = r4.append(r0);
        r5 = "/";
        r4 = r4.append(r5);
        r0 = r25;
        r4 = r4.append(r0);
        r5 = "/";
        r4 = r4.append(r5);
        r0 = r28;
        r4 = r4.append(r0);
        r5 = "/";
        r4 = r4.append(r5);
        r0 = r26;
        r4 = r4.append(r0);
        r5 = "/";
        r4 = r4.append(r5);
        r0 = r29;
        r4 = r4.append(r0);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 10;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = r30.keys();
        r5 = java.util.Collections.list(r5);
        r5 = r5.toArray();
        r5 = java.util.Arrays.deepToString(r5);
        r4 = r4.append(r5);
        r5 = "/";
        r4 = r4.append(r5);
        r5 = r30.values();
        r5 = r5.toArray();
        r5 = java.util.Arrays.deepToString(r5);
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = com.whatsapp.App.aJ;
        r0 = r19;
        r4 = r4.z(r0);
        if (r4 != 0) goto L_0x0214;
    L_0x00b0:
        r4 = 1;
        r10 = r4;
    L_0x00b2:
        r4 = com.whatsapp.App.P;
        r0 = r22;
        r4 = r4.h(r0);
        if (r4 == 0) goto L_0x0218;
    L_0x00bc:
        r4 = com.whatsapp.App.P;
        r0 = r18;
        r5 = r0.d;
        r4 = r4.h(r5);
        if (r4 == 0) goto L_0x0218;
    L_0x00c8:
        r4 = 1;
        r11 = r4;
    L_0x00ca:
        r0 = r18;
        r4 = r0.d;
        r0 = r30;
        r4 = r0.containsKey(r4);
        if (r4 != 0) goto L_0x021c;
    L_0x00d6:
        r4 = 1;
        r12 = r4;
    L_0x00d8:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 5;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r10);
        r5 = z;
        r6 = 6;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r11);
        r5 = z;
        r6 = 7;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r12);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        if (r11 == 0) goto L_0x013f;
    L_0x010d:
        r14 = c(r25);
        r4 = com.whatsapp.App.aJ;
        r4 = r4.z(r14);
        if (r4 == 0) goto L_0x013d;
    L_0x0119:
        r4 = b;
        r4.remove(r14);
        r4 = com.whatsapp.App.aJ;
        r0 = r19;
        r4.d(r14, r0);
        r4 = com.whatsapp.App.P;
        r5 = com.whatsapp.App.P;
        r5 = r5.a(r14);
        r6 = r19;
        r7 = r25;
        r8 = r26;
        r4.a(r5, r6, r7, r8);
        r0 = r19;
        r1 = r25;
        com.whatsapp.v.a(r14, r0, r1);
    L_0x013d:
        if (r13 == 0) goto L_0x015c;
    L_0x013f:
        r4 = com.whatsapp.App.P;
        r0 = r19;
        r4 = r4.d(r0);
        if (r4 != 0) goto L_0x0154;
    L_0x0149:
        r0 = r19;
        r1 = r25;
        r2 = r26;
        com.whatsapp.v.a(r0, r1, r2);
        if (r13 == 0) goto L_0x015c;
    L_0x0154:
        r4 = r4.A;
        r5 = 2;
        r0 = r19;
        com.whatsapp.App.a(r0, r4, r5);
    L_0x015c:
        r4 = i(r19);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 9;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r6 = new java.util.ArrayList;
        r7 = r4.j();
        r6.<init>(r7);
        r6 = r6.toArray();
        r6 = java.util.Arrays.deepToString(r6);
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.whatsapp.util.Log.i(r5);
        r14 = r4.i();
        r5 = 0;
        r0 = r30;
        r4.a(r0, r5);
        r4 = d;
        r0 = r19;
        r4.remove(r0);
        if (r10 == 0) goto L_0x01b0;
    L_0x019e:
        r15 = 0;
        r4 = r18;
        r5 = r19;
        r6 = r25;
        r7 = r22;
        r8 = r26;
        r4 = b(r4, r5, r6, r7, r8);
        a(r15, r4);
    L_0x01b0:
        r4 = com.whatsapp.App.P;
        r4 = r4.d();
        r4 = r4.e;
        r0 = r30;
        r4 = r0.containsKey(r4);
        if (r4 == 0) goto L_0x020e;
    L_0x01c0:
        if (r11 != 0) goto L_0x020e;
    L_0x01c2:
        if (r14 != 0) goto L_0x020e;
    L_0x01c4:
        if (r12 != 0) goto L_0x020e;
    L_0x01c6:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 11;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = com.whatsapp.App.P;
        r5 = r5.d();
        r5 = r5.e;
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r5 = new java.util.Vector;
        r4 = 1;
        r5.<init>(r4);
        r4 = com.whatsapp.App.P;
        r4 = r4.d();
        r4 = r4.e;
        r5.add(r4);
        r6 = 1;
        r7 = 12;
        if (r10 == 0) goto L_0x0220;
    L_0x01fe:
        r4 = 0;
    L_0x01ff:
        r0 = r18;
        r8 = r0.d;
        r0 = r19;
        r4 = b(r7, r4, r0, r8, r5);
        a(r6, r4);
        if (r13 == 0) goto L_0x0213;
    L_0x020e:
        if (r10 != 0) goto L_0x0213;
    L_0x0210:
        com.whatsapp.App.a(r18);
    L_0x0213:
        return;
    L_0x0214:
        r4 = 0;
        r10 = r4;
        goto L_0x00b2;
    L_0x0218:
        r4 = 0;
        r11 = r4;
        goto L_0x00ca;
    L_0x021c:
        r4 = 0;
        r12 = r4;
        goto L_0x00d8;
    L_0x0220:
        r4 = r18;
        goto L_0x01ff;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bd.a(com.whatsapp.protocol.bj, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, long, java.lang.String, java.lang.String, java.util.Hashtable, java.lang.String):void");
    }

    static b a(int i, bj bjVar, String str, String str2, Vector vector) {
        return b(i, bjVar, str, str2, vector);
    }

    public static b a(String str, String str2, Vector vector, int i) {
        b bVar = new b(str, str2, null);
        bVar.D = App.a2();
        bVar.a = 6;
        bVar.k = (long) i;
        bVar.A = vector;
        return bVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.bj r11, java.util.Vector r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
        r10_this = this;
        r0 = 0;
        r9 = 1;
        r1 = com.whatsapp.App.az;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 31;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r11);
        r3 = z;
        r4 = 29;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r12.toArray();
        r3 = java.util.Arrays.deepToString(r3);
        r2 = r2.append(r3);
        r3 = z;
        r4 = 28;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r13);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = r11.a;
        r3 = d;
        r3.remove(r2);
        r3 = com.whatsapp.App.P;
        r3 = r3.d();
        r3 = r3.e;
        r4 = com.whatsapp.App.P;
        r4 = r4.f(r2);
        if (r13 == 0) goto L_0x005f;
    L_0x0059:
        r5 = r13.equals(r3);
        if (r5 == 0) goto L_0x007d;
    L_0x005f:
        r5 = r12.size();
        if (r5 != r9) goto L_0x007d;
    L_0x0065:
        r5 = r12.get(r0);
        r5 = r5.equals(r3);
        if (r5 == 0) goto L_0x007d;
    L_0x006f:
        r5 = z;
        r6 = 27;
        r5 = r5[r6];
        com.whatsapp.util.Log.i(r5);
        com.whatsapp.App.a(r11);
        if (r1 == 0) goto L_0x00f9;
    L_0x007d:
        if (r4 == 0) goto L_0x0089;
    L_0x007f:
        r5 = i(r2);
        r5 = r5.i();
        if (r5 != 0) goto L_0x00a0;
    L_0x0089:
        r5 = z;
        r6 = 32;
        r5 = r5[r6];
        com.whatsapp.util.Log.i(r5);
        com.whatsapp.App.D(r2);
        if (r4 != 0) goto L_0x011e;
    L_0x0097:
        r5 = 2;
        com.whatsapp.App.a(r2, r0, r5);
        com.whatsapp.App.a(r11);
        if (r1 == 0) goto L_0x00f9;
    L_0x00a0:
        r5 = i(r2);
        r6 = new java.util.Vector;
        r0 = r12.size();
        r6.<init>(r0);
        r7 = r12.iterator();
    L_0x00b1:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x00d5;
    L_0x00b7:
        r0 = r7.next();
        r0 = (java.lang.String) r0;
        r8 = r5.a(r0);
        if (r8 == 0) goto L_0x00c6;
    L_0x00c3:
        r6.add(r0);
    L_0x00c6:
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x00d3;
    L_0x00cc:
        r0 = com.whatsapp.lh.b;
        r8 = r4.e;
        r0.b(r8);
    L_0x00d3:
        if (r1 == 0) goto L_0x00b1;
    L_0x00d5:
        if (r13 == 0) goto L_0x00e8;
    L_0x00d7:
        r0 = r6.contains(r13);
        if (r0 == 0) goto L_0x00e8;
    L_0x00dd:
        r6.remove(r13);
        r0 = 5;
        r0 = a(r0, r11, r2, r13);
        a(r9, r0);
    L_0x00e8:
        r0 = r6.isEmpty();
        if (r0 != 0) goto L_0x00f9;
    L_0x00ee:
        if (r13 != 0) goto L_0x0122;
    L_0x00f0:
        r0 = 13;
    L_0x00f2:
        r0 = b(r0, r11, r2, r13, r6);
        a(r9, r0);
    L_0x00f9:
        if (r4 == 0) goto L_0x011d;
    L_0x00fb:
        r0 = android.text.TextUtils.isEmpty(r14);
        if (r0 != 0) goto L_0x011d;
    L_0x0101:
        r0 = r4.N;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x011d;
    L_0x0109:
        r0 = z;
        r1 = 30;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.P;
        r1 = 0;
        r0.a(r2, r1, r14);
        r0 = com.whatsapp.App.aJ;
        r0.a(r2, r14);
    L_0x011d:
        return;
    L_0x011e:
        r0 = r4.A;
        goto L_0x0097;
    L_0x0122:
        r0 = 14;
        goto L_0x00f2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bd.a(com.whatsapp.protocol.bj, java.util.Vector, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void a(int i, Object obj) {
        f.sendMessage(f.obtainMessage(i, obj));
    }

    public static String a(ArrayList arrayList) {
        char c;
        int i = App.az;
        StringBuilder stringBuilder = new StringBuilder();
        String language = Locale.getDefault().getLanguage();
        if (z[47].equals(language) || z[45].equals(language) || z[46].equals(language)) {
            c = '\u060c';
        } else {
            c = ',';
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (stringBuilder.length() > 0) {
                stringBuilder.append(c);
                stringBuilder.append(' ');
            }
            stringBuilder.append(str);
            if (i != 0) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    public static void c() {
        int i = App.az;
        m8 d = App.P.d();
        if (d != null) {
            SharedPreferences sharedPreferences = App.p.getSharedPreferences(z[52], 0);
            ArrayList arrayList = new ArrayList();
            Iterator it = v.b().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if ((b(str) || m8.b(str)) && (sharedPreferences.contains(z[53] + str) || sharedPreferences.contains(z[50] + str))) {
                    Object obj;
                    String string = sharedPreferences.getString(z[51] + str, "");
                    String string2 = sharedPreferences.getString(z[49] + str, "");
                    Log.i(z[54] + str);
                    m8 d2 = App.P.d(str);
                    if (d2 == null) {
                        obj = null;
                    } else {
                        obj = d2.i();
                    }
                    String[] split = string.split(",");
                    cs csVar = new cs(str);
                    int length = split.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String str2 = split[i2];
                        if (str2.length() > 0) {
                            csVar.a(str2, str2.equals(obj), false);
                        }
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    String[] split2 = string2.split(",");
                    int length2 = split2.length;
                    i2 = 0;
                    while (i2 < length2) {
                        String str3 = split2[i2];
                        if (str3.length() > 0) {
                            csVar.a(str3, false, true);
                        }
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    if (b(str) && d2 != null && d2.q) {
                        csVar.a(d.e, d.e.equals(obj), false);
                    }
                    arrayList.add(csVar);
                    if (csVar.h() > 0) {
                        b.put(str, csVar);
                        continue;
                    } else {
                        continue;
                    }
                }
                if (i != 0) {
                    break;
                }
            }
            if (!arrayList.isEmpty()) {
                a5w.a(new a58(arrayList, sharedPreferences), new Void[0]);
            }
        }
    }

    public static void a(boolean z) {
        Log.i(z[36] + z);
        Editor edit = App.p.getSharedPreferences(z[39], 0).edit();
        edit.putBoolean(z[38], z);
        if (!edit.commit()) {
            Log.e(z[37]);
        }
    }

    public void a(String str, String str2, long j, String str3, long j2, String str4, String str5, Hashtable hashtable, Hashtable hashtable2) {
        Log.i(z[0] + str + "/" + str2 + "/" + j + "/" + str3 + "/" + str4 + "/" + j2 + "/" + str5 + "/" + Arrays.deepToString(hashtable.keySet().toArray()));
        if (hashtable2 != null && hashtable2.size() > 0) {
            a(35, (Object) hashtable2);
        }
    }

    public void a(bj bjVar, String str, String str2, String str3) {
        boolean z;
        int i = 0;
        Log.i(z[44] + bjVar + z[43] + str + z[41] + str2);
        String str4 = bjVar.a;
        m8 f = App.P.f(str4);
        cs i2 = i(str4);
        l6 b = i2.b(str);
        i2.a(str);
        if (b == null) {
            z = false;
        } else {
            z = b.c;
        }
        i2.a(str2, z, false);
        if (f == null || !i2.i() || b == null) {
            StringBuilder append = new StringBuilder().append(z[42]);
            if (f == null) {
                z = true;
            } else {
                z = false;
            }
            append = append.append(z).append("/");
            if (i2.i()) {
                z = false;
            } else {
                z = true;
            }
            StringBuilder append2 = append.append(z).append("/");
            if (b == null) {
                z = true;
            } else {
                z = false;
            }
            Log.i(append2.append(z).toString());
            App.D(str4);
            if (f != null) {
                i = f.A;
            }
            App.a(str4, i, 2);
        }
        a(1, a(bjVar.a, str, str2));
        App.a(bjVar);
    }

    public static boolean e(String str) {
        return i(str).a();
    }

    static int[] e() {
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String h(java.lang.String r7) {
        /*
        r2 = com.whatsapp.App.az;
        r0 = d;
        r0 = r0.get(r7);
        r0 = (java.lang.String) r0;
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        return r0;
    L_0x000d:
        r0 = 0;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r1 = i(r7);
        r1 = r1.b();
        r4 = r1.iterator();
        r1 = r0;
    L_0x0020:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x004e;
    L_0x0026:
        r0 = r4.next();
        r0 = (com.whatsapp.l6) r0;
        r5 = com.whatsapp.App.P;
        r6 = r0.d;
        r5 = r5.h(r6);
        if (r5 == 0) goto L_0x0039;
    L_0x0036:
        r1 = 1;
        if (r2 == 0) goto L_0x004a;
    L_0x0039:
        r5 = com.whatsapp.App.P;
        r0 = r0.d;
        r0 = r5.a(r0);
        r5 = r3.contains(r0);
        if (r5 != 0) goto L_0x004a;
    L_0x0047:
        r3.add(r0);
    L_0x004a:
        r0 = r1;
        if (r2 == 0) goto L_0x00a4;
    L_0x004d:
        r1 = r0;
    L_0x004e:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = new java.util.ArrayList;
        r5.<init>();
        r3 = r3.iterator();
    L_0x005c:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0082;
    L_0x0062:
        r0 = r3.next();
        r0 = (com.whatsapp.m8) r0;
        r6 = r0.o();
        if (r6 == 0) goto L_0x0080;
    L_0x006e:
        r0 = r0.a();
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x007d;
    L_0x0078:
        r5.add(r6);
        if (r2 == 0) goto L_0x0080;
    L_0x007d:
        r4.add(r6);
    L_0x0080:
        if (r2 == 0) goto L_0x005c;
    L_0x0082:
        java.util.Collections.sort(r4);
        java.util.Collections.sort(r5);
        r4.addAll(r5);
        if (r1 == 0) goto L_0x0099;
    L_0x008d:
        r0 = com.whatsapp.App.p;
        r1 = 2131625135; // 0x7f0e04af float:1.887747E38 double:1.053162749E-314;
        r0 = r0.getString(r1);
        r4.add(r0);
    L_0x0099:
        r0 = a(r4);
        r1 = d;
        r1.put(r7, r0);
        goto L_0x000c;
    L_0x00a4:
        r1 = r0;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bd.h(java.lang.String):java.lang.String");
    }

    public void a(String str, String str2, String[] strArr) {
        Log.i(z[4] + str + z[2] + str2 + z[3] + Arrays.deepToString(strArr));
        if (!v.d(str)) {
            Vector vector = new Vector(strArr.length);
            vector.addAll(Arrays.asList(strArr));
            b bVar = new b(str, str2, null);
            bVar.D = App.a2();
            bVar.a = 6;
            bVar.k = 9;
            bVar.A = vector;
            bVar.F = App.P.d().e;
            App.aJ.f(bVar);
            a(str, vector);
        }
        if (App.P.d(str) == null) {
            v.a(str, str2, System.currentTimeMillis());
        }
    }

    static {
        String[] strArr = new String[80];
        String str = "#)PZe)<M\u0000z*\u001cM@`4\u0018MJt0>[\u0000";
        boolean z = true;
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
                        i3 = 68;
                        break;
                    case ay.f /*1*/:
                        i3 = 91;
                        break;
                    case ay.n /*2*/:
                        i3 = 63;
                        break;
                    case ay.p /*3*/:
                        i3 = 47;
                        break;
                    default:
                        i3 = 21;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "k5^Bp~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "k)ZL|42ZAa7a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "#)PZe)<M\u0000z*\u000b^]a-8V_t02QHY-(K\u0000\u007f-?\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u0015ZXR64J_:d5ZX/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "d6ZLg!:K@g~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "d5JBw!)\\Gt*<Z\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u0015ZXR64J_:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u0015ZXR64J_5+7[_t6/VL|4:Q[f~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u0015ZXR64J_:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u0015ZXR64J_:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "#)PZe)<M\u0000z*\u000b^]a-8V_t02QHY-(K\u0000z*\u000b^]a-8V_t02QHY-(K\\V+6OCp0>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u000bM@x+/Zzf!)L\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u001fZBz0>j\\p6(\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "#)PZe)<M\u0000z*\tZBz2>x]z1+oNg02\\Fe%5K\\:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "k7PLt02PA/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "k(JM\u007f!8K\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "k(JM\u007f!8Kpa-6Z\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u0012QIzk<UFq~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    str = "k/F_p~";
                    z = true;
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    str = "k8MJt02PA/";
                    i = 21;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    strArr2 = strArr3;
                    str = "k(JM\u007f!8K\u000fz35Z]/";
                    z = true;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "k8MJt04M\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u0012QIzk";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u001fZCp0>\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "#)PZe)<M\u0000z*\bZ[F19UJv0t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\tZBz2>j\\p6(\u0010Bpd7ZNc-5X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "k)ZBz2>[pw=a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = ".2[\\/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\tZBz2>j\\p6(\u0010\\`&1ZLa'3^Ar!?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\tZBz2>j\\p6(\u0010";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\tZBz2>j\\p6(\u0010]p5.Z]l#)PZe-5Y@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "#)PZe)<M\u0000t ?x]z1+lV{'2QHP*/MV";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "#)PZe)<M\u0000z*\u0017ZNc!\u001cM@`4t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "#)PZe)<M\u0000z*\u001fZBz0>x]z1+oNg02\\Fe%5K\\:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "#)PZe)<M\u0000f!/LGz17[Hp0<M@`4(\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "#)PZe)<M\u0000f!/LGz17[Hp0<M@`4(\u0010It-7ZK";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "*>ZKJ04`Hp0\u0004X]z1+L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "'4R\u0001b,:K\\t4+`_g!=Z]p*8Z\\";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "#)PZe)<M\u0000z*+^]a-8V_t02QHr64J_fk";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "k5ZX\u007f-?\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u000eLJg\u00073^Ar!?qZx&>M\u0000f!5[Hp0<M@`42QIzk";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "k4SK\u007f-?\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u000eLJg\u00073^Ar!?qZx&>M\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\":";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "1)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    str = "%)";
                    z = true;
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    strArr2 = strArr3;
                    str = "#)PZe)<M\u0000z*\u001a[KR64J_E%)KFv-+^Aa7t";
                    z = true;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\"+^\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\"+^\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "4:\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "'4R\u0001b,:K\\t4+`_g!=Z]p*8Z\\";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "4:\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "#)PZe)<M\u0000x-<MNa!=M@x4)ZIfk";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "#)PZe)<M\u0000r64J_F=5\\it-7ZKZ6\u000fVBp+.K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0004/ZBe";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u0015ZXF19UJv0t[Fqd5P[5'3^Ar!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u0015ZXF19UJv0t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u0015ZXF19UJv0t\\Gt*<ZK";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0004(\u0011X}%/LNe4uQJa";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u0015ZXF19UJv0tQJbd<M@`4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "#)PZe)<M\u0000r!/oNg02\\Fe%5K|a%/J\\X!(LNr!t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    str = "\u0004/ZBe";
                    z = true;
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    strArr2 = strArr3;
                    str = "#)PZe)<M\u0000r!/oNg02\\Fe%5K\\F0:KZf\t>L\\t#>\u0010";
                    z = true;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "k(JM\u007f!8K\u000fz35Z]/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u0012QIz\u0002)PBY-(K\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "k/F_p~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u0012QIz\u0002)PBY-(K\u0000r.2[\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 69;
                    str = "k8MJt04M\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 70;
                    str = "k(JM\u007f!8K\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 71;
                    str = "k(JM\u007f!8Kpa-6Z\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 72;
                    str = "k8MJt02PA/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 73;
                    str = "k7PLt02PA/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 74;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u001a[K@7>M\\:6>NZp6\"X]z1+VAs+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 75;
                    str = "#)PZe)<M\u0000z*\u001cM@`4\u001a[K@7>M\\:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 76;
                    str = "%?RF{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 77;
                    str = "*>ZKJ04`Hp0\u0004X]z1+L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 78;
                    str = "'4R\u0001b,:K\\t4+`_g!=Z]p*8Z\\";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 79;
                    str = "#)PZe\u001b5P[|'>\u007f[p)+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    z = strArr3;
                    c = false;
                    e = false;
                    b = new ConcurrentHashMap();
                    d = new ConcurrentHashMap();
                    f = new _u();
                    a = new int[]{-4929717, -8154166, -36820, -11617349, -2116080, -14714132, -1011271, -16605952, -8885824, -4946066, -99201, -10890392, -22150, -8544527, -3603591, -6036789, -5881812, -1752413, -6197331, -1094833};
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "#)PZe)<M\u0000z*\u000bM@x+/Zhg+.O\u007ft6/VL|4:Q[fk";
                    z = false;
                    break;
            }
        }
    }

    public void b(bj bjVar) {
    }

    public void a(Vector vector, Hashtable hashtable) {
    }

    public void b() {
        d.clear();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.whatsapp.protocol.bj r8, java.util.Vector r9, java.lang.String r10) {
        /*
        r7_this = this;
        r6 = 0;
        r2 = com.whatsapp.App.az;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 14;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r1 = "/";
        r0 = r0.append(r1);
        r1 = r9.toArray();
        r1 = java.util.Arrays.deepToString(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r3 = r8.a;
        r4 = i(r3);
        r5 = r9.iterator();
    L_0x0039:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x005a;
    L_0x003f:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r1 = r4.b(r0);
        if (r1 != 0) goto L_0x0062;
    L_0x004b:
        r0 = r4.a(r0, r6, r6);
        if (r2 == 0) goto L_0x0053;
    L_0x0051:
        r0.c = r6;
    L_0x0053:
        r1 = com.whatsapp.App.aJ;
        r1.a(r3, r0);
        if (r2 == 0) goto L_0x0039;
    L_0x005a:
        com.whatsapp.App.a(r8);
        r0 = 4;
        a(r0, r3);
        return;
    L_0x0062:
        r0 = r1;
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bd.b(com.whatsapp.protocol.bj, java.util.Vector, java.lang.String):void");
    }

    public static void a(String str, Vector vector) {
        int i = App.az;
        cs i2 = i(str);
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            i2.a((String) it.next(), false, true);
            if (i != 0) {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.whatsapp.protocol.b b(int r4, com.whatsapp.protocol.bj r5, java.lang.String r6, java.lang.String r7, java.util.Vector r8) {
        /*
        r1 = 0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 64;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r4);
        r2 = "/";
        r0 = r0.append(r2);
        r0 = r0.append(r5);
        r2 = "/";
        r0 = r0.append(r2);
        r0 = r0.append(r6);
        r2 = "/";
        r0 = r0.append(r2);
        r0 = r0.append(r7);
        r2 = "/";
        r0 = r0.append(r2);
        r2 = r8.toArray();
        r2 = java.util.Arrays.deepToString(r2);
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r5 == 0) goto L_0x0056;
    L_0x004d:
        r0 = new com.whatsapp.at;
        r0.<init>(r5);
        r2 = com.whatsapp.App.az;
        if (r2 == 0) goto L_0x005f;
    L_0x0056:
        r2 = new com.whatsapp.protocol.b;
        r0 = r1;
        r0 = (byte[]) r0;
        r2.<init>(r6, r0, r1);
        r0 = r2;
    L_0x005f:
        r2 = 6;
        r0.a = r2;
        r2 = (long) r4;
        r0.k = r2;
        r2 = android.text.TextUtils.isEmpty(r7);
        if (r2 == 0) goto L_0x008d;
    L_0x006b:
        r0.F = r1;
        r0.A = r8;
        r2 = com.whatsapp.App.a2();
        r0.D = r2;
        r1 = 12;
        if (r4 != r1) goto L_0x008c;
    L_0x0079:
        if (r8 == 0) goto L_0x008c;
    L_0x007b:
        r1 = com.whatsapp.App.P;
        r1 = r1.d();
        r1 = r1.e;
        r1 = r8.contains(r1);
        if (r1 == 0) goto L_0x008c;
    L_0x0089:
        r1 = 1;
        r0.p = r1;
    L_0x008c:
        return r0;
    L_0x008d:
        r1 = r7;
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bd.b(int, com.whatsapp.protocol.bj, java.lang.String, java.lang.String, java.util.Vector):com.whatsapp.protocol.b");
    }

    public static boolean a(String str) {
        int i = App.az;
        Iterator it = i(str).e().iterator();
        while (it.hasNext()) {
            l6 l6Var = (l6) it.next();
            if (!l6Var.a()) {
                m8 d = App.P.d(l6Var.d);
                if (!(d == null || d.h == null)) {
                    return true;
                }
            }
            if (i != 0) {
                break;
            }
        }
        return false;
    }

    public static void h() {
        App.aJ.f(a(g(), null, null, -2));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.whatsapp.protocol.b a(com.whatsapp.protocol.bj r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8) {
        /*
        r1 = 0;
        if (r4 == 0) goto L_0x000c;
    L_0x0003:
        r0 = new com.whatsapp.at;
        r0.<init>(r4);
        r2 = com.whatsapp.App.az;
        if (r2 == 0) goto L_0x0015;
    L_0x000c:
        r2 = new com.whatsapp.protocol.b;
        r0 = r1;
        r0 = (byte[]) r0;
        r2.<init>(r5, r0, r1);
        r0 = r2;
    L_0x0015:
        r0.b(r6);
        r1 = 6;
        r0.a = r1;
        r2 = 1;
        r0.k = r2;
        r0.F = r7;
        r0.D = r8;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bd.a(com.whatsapp.protocol.bj, java.lang.String, java.lang.String, java.lang.String, long):com.whatsapp.protocol.b");
    }

    public static cs i(String str) {
        cs csVar;
        synchronized (b) {
            csVar = (cs) b.get(str);
            if (csVar == null) {
                csVar = new cs(str);
                csVar.g();
                b.put(str, csVar);
            }
        }
        return csVar;
    }

    public static boolean a() {
        return App.p.getSharedPreferences(z[78], 0).getBoolean(z[77], true);
    }

    public static boolean b(String str) {
        return str.contains("-");
    }

    public void a() {
        Log.i(z[12]);
        App.a(App.p, false);
    }

    public static boolean f(String str) {
        return i(str).i();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.whatsapp.protocol.b a(int r4, com.whatsapp.protocol.bj r5, java.lang.String r6, java.lang.String r7) {
        /*
        r1 = 0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 62;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r4);
        r2 = "/";
        r0 = r0.append(r2);
        r0 = r0.append(r5);
        r2 = "/";
        r0 = r0.append(r2);
        r0 = r0.append(r6);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r5 == 0) goto L_0x003a;
    L_0x0031:
        r0 = new com.whatsapp.at;
        r0.<init>(r5);
        r2 = com.whatsapp.App.az;
        if (r2 == 0) goto L_0x0043;
    L_0x003a:
        r2 = new com.whatsapp.protocol.b;
        r0 = r1;
        r0 = (byte[]) r0;
        r2.<init>(r6, r0, r1);
        r0 = r2;
    L_0x0043:
        r1 = 6;
        r0.a = r1;
        r2 = (long) r4;
        r0.k = r2;
        r0.F = r7;
        r2 = com.whatsapp.App.a2();
        r0.D = r2;
        r1 = 4;
        if (r4 != r1) goto L_0x0067;
    L_0x0054:
        if (r7 == 0) goto L_0x0067;
    L_0x0056:
        r1 = com.whatsapp.App.P;
        r1 = r1.d();
        r1 = r1.e;
        r1 = r7.equals(r1);
        if (r1 == 0) goto L_0x0067;
    L_0x0064:
        r1 = 1;
        r0.p = r1;
    L_0x0067:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bd.a(int, com.whatsapp.protocol.bj, java.lang.String, java.lang.String):com.whatsapp.protocol.b");
    }

    public static void f() {
        Log.i(z[33]);
        App.aJ.f(a(g(), null, null, -1));
    }

    public void b(String str, Hashtable hashtable, Hashtable hashtable2) {
        Log.i(z[48] + str + "/" + Arrays.deepToString(hashtable.keySet().toArray()) + "/" + Arrays.deepToString(hashtable2.keySet().toArray()));
        if (hashtable2 != null && hashtable2.size() > 0) {
            a(35, (Object) hashtable2);
        }
    }

    public static boolean a(b bVar) {
        if (bVar.a == 6) {
            if (bVar.k == 1 && !bVar.F.contains(App.af())) {
                return true;
            }
            if (bVar.k == 4 && bVar.p == 1) {
                return true;
            }
            if (bVar.k == 12 && bVar.p == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.protocol.c5 b(com.whatsapp.protocol.b r10) {
        /*
        r2 = 0;
        r9 = 7;
        r8 = 6;
        r7 = 4;
        r6 = 3;
        r3 = com.whatsapp.App.az;
        r0 = r10.a;
        if (r0 == r8) goto L_0x000c;
    L_0x000b:
        return r2;
    L_0x000c:
        r1 = new com.whatsapp.protocol.c5;
        r1.<init>();
        r0 = r10.e;
        r0 = r0.a;
        r1.n = r0;
        r4 = r10.D;
        r1.l = r4;
        r0 = r10.e;
        r0 = r0.c;
        r1.i = r0;
        r4 = r10.k;
        r0 = (int) r4;
        switch(r0) {
            case 1: goto L_0x0042;
            case 2: goto L_0x0027;
            case 3: goto L_0x0027;
            case 4: goto L_0x0052;
            case 5: goto L_0x00b6;
            case 6: goto L_0x00f3;
            case 7: goto L_0x0084;
            case 8: goto L_0x0027;
            case 9: goto L_0x011d;
            case 10: goto L_0x0103;
            case 11: goto L_0x002a;
            case 12: goto L_0x0076;
            case 13: goto L_0x00c8;
            case 14: goto L_0x00a8;
            case 15: goto L_0x00d6;
            case 16: goto L_0x00e5;
            case 17: goto L_0x0039;
            default: goto L_0x0027;
        };
    L_0x0027:
        r0 = r2;
    L_0x0028:
        r2 = r0;
        goto L_0x000b;
    L_0x002a:
        r0 = 1;
        r1.k = r0;
        r0 = r10.f();
        r1.s = r0;
        r0 = r10.F;
        r1.b = r0;
        if (r3 == 0) goto L_0x0131;
    L_0x0039:
        r0 = 2;
        r1.k = r0;
        r0 = r10.F;
        r1.b = r0;
        if (r3 == 0) goto L_0x0131;
    L_0x0042:
        r0 = 10;
        r1.k = r0;
        r0 = r10.f();
        r1.s = r0;
        r0 = r10.F;
        r1.b = r0;
        if (r3 == 0) goto L_0x0131;
    L_0x0052:
        r0 = r1.i;
        r0 = com.whatsapp.m8.b(r0);
        if (r0 == 0) goto L_0x0064;
    L_0x005a:
        r0 = 12;
        r1.k = r0;
        r0 = r10.F;
        r1.b = r0;
        if (r3 == 0) goto L_0x0131;
    L_0x0064:
        r1.k = r6;
        r0 = new java.util.Vector;
        r0.<init>();
        r1.j = r0;
        r0 = r1.j;
        r4 = r10.F;
        r0.add(r4);
        if (r3 == 0) goto L_0x0131;
    L_0x0076:
        r1.k = r6;
        r0 = r10.F;
        r1.b = r0;
        r0 = r10.A;
        r0 = (java.util.Vector) r0;
        r1.j = r0;
        if (r3 == 0) goto L_0x0131;
    L_0x0084:
        r0 = r1.i;
        r0 = com.whatsapp.m8.b(r0);
        if (r0 == 0) goto L_0x0096;
    L_0x008c:
        r0 = 13;
        r1.k = r0;
        r0 = r10.F;
        r1.b = r0;
        if (r3 == 0) goto L_0x0131;
    L_0x0096:
        r1.k = r7;
        r0 = new java.util.Vector;
        r0.<init>();
        r1.j = r0;
        r0 = r1.j;
        r4 = r10.F;
        r0.add(r4);
        if (r3 == 0) goto L_0x0131;
    L_0x00a8:
        r1.k = r7;
        r0 = r10.F;
        r1.b = r0;
        r0 = r10.A;
        r0 = (java.util.Vector) r0;
        r1.j = r0;
        if (r3 == 0) goto L_0x0131;
    L_0x00b6:
        r1.k = r9;
        r0 = new java.util.Vector;
        r0.<init>();
        r1.j = r0;
        r0 = r1.j;
        r4 = r10.F;
        r0.add(r4);
        if (r3 == 0) goto L_0x0131;
    L_0x00c8:
        r1.k = r9;
        r0 = r10.F;
        r1.b = r0;
        r0 = r10.A;
        r0 = (java.util.Vector) r0;
        r1.j = r0;
        if (r3 == 0) goto L_0x0131;
    L_0x00d6:
        r0 = 5;
        r1.k = r0;
        r0 = r10.F;
        r1.b = r0;
        r0 = r10.A;
        r0 = (java.util.Vector) r0;
        r1.j = r0;
        if (r3 == 0) goto L_0x0131;
    L_0x00e5:
        r1.k = r8;
        r0 = r10.F;
        r1.b = r0;
        r0 = r10.A;
        r0 = (java.util.Vector) r0;
        r1.j = r0;
        if (r3 == 0) goto L_0x0131;
    L_0x00f3:
        r0 = 8;
        r1.k = r0;
        r0 = r10.f();
        r1.s = r0;
        r0 = r10.F;
        r1.b = r0;
        if (r3 == 0) goto L_0x0131;
    L_0x0103:
        r0 = 9;
        r1.k = r0;
        r0 = r10.F;
        r1.b = r0;
        r0 = new java.util.Vector;
        r0.<init>();
        r1.j = r0;
        r4 = r1.j;
        r0 = r10.A;
        r0 = (java.lang.String) r0;
        r4.add(r0);
        if (r3 == 0) goto L_0x0131;
    L_0x011d:
        r0 = 11;
        r1.k = r0;
        r0 = r10.A;
        r0 = (java.util.Vector) r0;
        r0 = r0.size();
        r1.e = r0;
        r0 = r10.F;
        r1.b = r0;
        if (r3 != 0) goto L_0x0027;
    L_0x0131:
        r0 = r1;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bd.b(com.whatsapp.protocol.b):com.whatsapp.protocol.c5");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(java.lang.String r11, java.lang.String r12, long r13, java.lang.String r15, long r16, java.lang.String r18, java.lang.String r19, long r20, java.util.Hashtable r22) {
        /*
        r10_this = this;
        r8 = com.whatsapp.App.az;
        r2 = com.whatsapp.App.aJ;
        r2 = r2.z(r11);
        if (r2 != 0) goto L_0x00a4;
    L_0x000a:
        r2 = 1;
    L_0x000b:
        if (r2 == 0) goto L_0x0047;
    L_0x000d:
        r9 = 0;
        r2 = 0;
        r3 = r11;
        r4 = r15;
        r5 = r12;
        r6 = r16;
        r2 = b(r2, r3, r4, r5, r6);
        a(r9, r2);
        r2 = com.whatsapp.App.P;
        r2 = r2.h(r12);
        if (r2 != 0) goto L_0x004c;
    L_0x0023:
        r3 = new com.whatsapp.protocol.b;
        r2 = 0;
        r2 = (byte[]) r2;
        r4 = 0;
        r3.<init>(r11, r2, r4);
        r2 = 6;
        r3.a = r2;
        r4 = 4;
        r3.k = r4;
        r2 = com.whatsapp.App.P;
        r2 = r2.d();
        r2 = r2.e;
        r3.F = r2;
        r0 = r16;
        r3.D = r0;
        r2 = 1;
        a(r2, r3);
        if (r8 == 0) goto L_0x004c;
    L_0x0047:
        r2 = com.whatsapp.App.aJ;
        r2.a(r11, r15, r13);
    L_0x004c:
        r2 = i(r11);
        r3 = 0;
        r0 = r22;
        r2 = r2.a(r0, r3);
        if (r2 == 0) goto L_0x005e;
    L_0x0059:
        r2 = d;
        r2.remove(r11);
    L_0x005e:
        r2 = com.whatsapp.App.P;
        r2 = r2.a(r11);
        r2.N = r15;
        r3 = java.lang.Long.toString(r13);
        r2.s = r3;
        r2.E = r12;
        r3 = com.whatsapp.App.P;
        r3.o(r2);
        r2 = b;
        r2 = r2.containsKey(r11);
        if (r2 != 0) goto L_0x0080;
    L_0x007b:
        r2 = 0;
        r3 = 2;
        com.whatsapp.App.a(r11, r2, r3);
    L_0x0080:
        r2 = 0;
        r2 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x008d;
    L_0x0086:
        r2 = com.whatsapp.lh.b;
        r2.b(r11);
        if (r8 == 0) goto L_0x00a3;
    L_0x008d:
        r2 = -1;
        r2 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x009c;
    L_0x0093:
        r2 = com.whatsapp.lh.b;
        r4 = 0;
        r2.a(r11, r4);
        if (r8 == 0) goto L_0x00a3;
    L_0x009c:
        r2 = com.whatsapp.lh.b;
        r0 = r20;
        r2.a(r11, r0);
    L_0x00a3:
        return;
    L_0x00a4:
        r2 = 0;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bd.c(java.lang.String, java.lang.String, long, java.lang.String, long, java.lang.String, java.lang.String, long, java.util.Hashtable):void");
    }

    public static l6 d(String str, String str2) {
        return i(str).b(str2);
    }

    public static b d(String str) {
        b bVar = new b(str, (byte[]) null, null);
        bVar.D = App.a2();
        bVar.a = 6;
        bVar.k = 8;
        return bVar;
    }

    public void b(String str, String str2, long j, String str3, long j2, String str4, String str5, long j3, Hashtable hashtable) {
        Log.i(z[19] + str + z[23] + str2 + z[21] + j + z[22] + str4 + z[17] + str3 + z[18] + j2 + z[20] + str5 + z[16] + j3);
        Log.i(z[24] + Arrays.deepToString(Collections.list(hashtable.keys()).toArray()) + "/" + Arrays.deepToString(hashtable.values().toArray()));
        c(str, str2, j, str3, j2, str4, str5, j3, hashtable);
        App.i.a(str);
    }

    public static void b(String str, String str2) {
        i(str).a(str2, false, false);
        d.remove(str);
        a(1, a(4, null, str, str2));
    }

    public static boolean c(String str, String str2) {
        l6 d = d(str, str2);
        return d != null && d.c;
    }

    public void c(String str, Hashtable hashtable, Hashtable hashtable2) {
        Log.i(z[15] + str + "/" + Arrays.deepToString(hashtable.keySet().toArray()) + "/" + Arrays.deepToString(hashtable2.keySet().toArray()));
        if (hashtable2 != null && hashtable2.size() > 0) {
            a(36, (Object) hashtable2);
        }
    }

    public static boolean g(String str) {
        return str.endsWith(z[63]);
    }

    public void a(bj bjVar, String str, String str2, int i) {
        int i2 = App.az;
        Log.i(z[58] + bjVar + "/" + str + "/" + str2 + "/" + (((long) i) * 1000));
        String str3 = bjVar.a;
        m8 f = App.P.f(str3);
        if (f != null) {
            if (!f.a(App.p).equals(str)) {
                Log.i(z[59]);
                App.P.a(str3, str2, str);
                a(3, a(bjVar, str3, str, str2, ((long) i) * 1000));
                if (i2 == 0) {
                    return;
                }
            }
            Log.i(z[57]);
            App.a(bjVar);
            if (i2 == 0) {
                return;
            }
        }
        Log.i(z[61]);
        cs csVar = new cs(str3);
        v.a(str3, str, ((long) i) * 1000);
        csVar.a(str3.substring(0, str3.indexOf("-")) + z[60], true, false);
        b.put(str3, csVar);
        a(0, b(bjVar, str3, str, str2, ((long) i) * 1000));
        App.D(str3);
    }

    public void a(bj bjVar, Hashtable hashtable, String str) {
        int i = App.az;
        Log.i(z[75] + bjVar + "/" + Arrays.deepToString(hashtable.values().toArray()));
        String str2 = bjVar.a;
        d.remove(str2);
        String str3 = App.P.d().e;
        m8 f = App.P.f(str2);
        cs i2 = i(str2);
        if (f == null || !(i2.i() || hashtable.containsKey(str3))) {
            int i3;
            Log.i(z[74]);
            App.D(str2);
            if (f == null) {
                i3 = 0;
            } else {
                i3 = f.A;
            }
            App.a(str2, i3, 2);
            App.a(bjVar);
            if (i == 0) {
                return;
            }
        }
        Vector vector = new Vector();
        for (Entry entry : hashtable.entrySet()) {
            String str4 = (String) entry.getKey();
            str3 = (String) entry.getValue();
            vector.add(str4);
            i2.a(str4, z[76].equals(str3), false);
            if (i != 0) {
                break;
            }
        }
        str3 = bjVar.d;
        if (TextUtils.isEmpty(str3)) {
            ArrayList e = i2.e();
            if (e.size() == 1) {
                str3 = ((l6) e.get(0)).d;
            }
        }
        a(1, b(12, bjVar, str2, str3, vector));
    }

    public static String c(String str) {
        return App.af() + "-" + str + z[56];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.whatsapp.protocol.b b(com.whatsapp.protocol.bj r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8) {
        /*
        r1 = 0;
        if (r4 == 0) goto L_0x000c;
    L_0x0003:
        r0 = new com.whatsapp.at;
        r0.<init>(r4);
        r2 = com.whatsapp.App.az;
        if (r2 == 0) goto L_0x0015;
    L_0x000c:
        r2 = new com.whatsapp.protocol.b;
        r0 = r1;
        r0 = (byte[]) r0;
        r2.<init>(r5, r0, r1);
        r0 = r2;
    L_0x0015:
        r0.b(r6);
        r1 = 6;
        r0.a = r1;
        r2 = 11;
        r0.k = r2;
        r0.F = r7;
        r0.D = r8;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bd.b(com.whatsapp.protocol.bj, java.lang.String, java.lang.String, java.lang.String, long):com.whatsapp.protocol.b");
    }

    public void a(String str, Hashtable hashtable, Hashtable hashtable2) {
        Log.i(z[1] + str + "/" + Arrays.deepToString(hashtable.keySet().toArray()) + "/" + Arrays.deepToString(hashtable2.keySet().toArray()));
        if (hashtable2 != null && hashtable2.size() > 0) {
            a(37, (Object) hashtable2);
        }
    }

    public void a(String str) {
        Log.i(z[26] + str);
    }

    public static void d() {
        Log.i(z[55]);
        e = false;
        h();
    }
}
