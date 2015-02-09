package com.whatsapp;

import android.app.Activity;
import android.os.AsyncTask;
import com.whatsapp.fieldstats.ah;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class t7 extends AsyncTask {
    public static HashMap h;
    public static HashMap i;
    private static final String[] z;
    private boolean a;
    private Activity b;
    private long c;
    private final MediaData d;
    private String e;
    private t7 f;
    private File g;
    private final b j;

    public boolean b() {
        return this.a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private t7(com.whatsapp.protocol.b r5, boolean r6, android.app.Activity r7) {
        /*
        r4_this = this;
        r4.<init>();
        r0 = com.whatsapp.App.q(r5);
        r4.g = r0;
        r4.j = r5;
        r4.a = r6;
        r0 = r5.A;
        r0 = (com.whatsapp.MediaData) r0;
        r4.d = r0;
        r0 = new java.net.URL;	 Catch:{ Exception -> 0x0094 }
        r1 = r5.t;	 Catch:{ Exception -> 0x0094 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0094 }
        r1 = r0.getHost();	 Catch:{ Exception -> 0x008e }
        if (r1 == 0) goto L_0x002a;
    L_0x0020:
        r0 = r0.getHost();	 Catch:{ Exception -> 0x008e }
        r0 = r0.length();	 Catch:{ Exception -> 0x008e }
        if (r0 != 0) goto L_0x004a;
    L_0x002a:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0090 }
        r0.<init>();	 Catch:{ Exception -> 0x0090 }
        r1 = z;	 Catch:{ Exception -> 0x0090 }
        r2 = 70;
        r1 = r1[r2];	 Catch:{ Exception -> 0x0090 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x0090 }
        r1 = r5.t;	 Catch:{ Exception -> 0x0090 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x0090 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0090 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x0090 }
        r0 = com.whatsapp.App.az;	 Catch:{ Exception -> 0x0090 }
        if (r0 == 0) goto L_0x0050;
    L_0x004a:
        r0 = a(r5);	 Catch:{ Exception -> 0x0092 }
        r4.e = r0;	 Catch:{ Exception -> 0x0092 }
    L_0x0050:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00c0 }
        r0.<init>();	 Catch:{ Exception -> 0x00c0 }
        r1 = z;	 Catch:{ Exception -> 0x00c0 }
        r2 = 73;
        r1 = r1[r2];	 Catch:{ Exception -> 0x00c0 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00c0 }
        r1 = r4.e;	 Catch:{ Exception -> 0x00c0 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00c0 }
        r1 = z;	 Catch:{ Exception -> 0x00c0 }
        r2 = 74;
        r1 = r1[r2];	 Catch:{ Exception -> 0x00c0 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00c0 }
        r0 = r0.append(r6);	 Catch:{ Exception -> 0x00c0 }
        r1 = z;	 Catch:{ Exception -> 0x00c0 }
        r2 = 72;
        r1 = r1[r2];	 Catch:{ Exception -> 0x00c0 }
        r1 = r0.append(r1);	 Catch:{ Exception -> 0x00c0 }
        if (r7 == 0) goto L_0x00c2;
    L_0x007f:
        r0 = 1;
    L_0x0080:
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r4.b = r7;
        return;
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 71;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.t;
        r1 = r1.append(r2);
        r2 = " ";
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x0050;
    L_0x00c0:
        r0 = move-exception;
        throw r0;
    L_0x00c2:
        r0 = 0;
        goto L_0x0080;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.t7.<init>(com.whatsapp.protocol.b, boolean, android.app.Activity):void");
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.a1n r13) {
        /*
        r12_this = this;
        r11 = 3;
        r10 = 1;
        r9 = 0;
        r4 = com.whatsapp.App.az;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 10;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r12.e;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 12;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r13);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r12.d;
        r0.transferring = r9;
        r0 = r12.d;
        r1 = r13.a();
        r0.transferred = r1;
        r0 = "";
        r1 = r13.a();	 Catch:{ FileNotFoundException -> 0x0266 }
        if (r1 == 0) goto L_0x00d8;
    L_0x0043:
        r1 = r12.d;	 Catch:{ FileNotFoundException -> 0x0266 }
        r2 = r12.g;	 Catch:{ FileNotFoundException -> 0x0266 }
        r1.file = r2;	 Catch:{ FileNotFoundException -> 0x0266 }
        r1 = r12.d;	 Catch:{ FileNotFoundException -> 0x0266 }
        r2 = r12.d;	 Catch:{ FileNotFoundException -> 0x0266 }
        r2 = r2.file;	 Catch:{ FileNotFoundException -> 0x0266 }
        r2 = r2.length();	 Catch:{ FileNotFoundException -> 0x0266 }
        r1.fileSize = r2;	 Catch:{ FileNotFoundException -> 0x0266 }
        r1 = r13.a;	 Catch:{ FileNotFoundException -> 0x0266 }
        if (r1 == 0) goto L_0x005d;
    L_0x0059:
        r0 = r13.a;
        if (r4 == 0) goto L_0x007e;
    L_0x005d:
        r1 = r12.j;	 Catch:{ FileNotFoundException -> 0x0268 }
        r1 = r1.t;	 Catch:{ FileNotFoundException -> 0x0268 }
        if (r1 == 0) goto L_0x007e;
    L_0x0063:
        r1 = new java.io.File;
        r2 = r12.j;
        r2 = r2.t;
        r1.<init>(r2);
        r1 = r1.getName();
        r2 = 46;
        r2 = r1.lastIndexOf(r2);
        if (r2 <= 0) goto L_0x007e;
    L_0x0078:
        r0 = r2 + 1;
        r0 = r1.substring(r0);
    L_0x007e:
        r1 = r12.d;	 Catch:{ FileNotFoundException -> 0x026a }
        r2 = com.whatsapp.App.p;	 Catch:{ FileNotFoundException -> 0x026a }
        r3 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x026a }
        r3.<init>();	 Catch:{ FileNotFoundException -> 0x026a }
        r5 = ".";
        r3 = r3.append(r5);	 Catch:{ FileNotFoundException -> 0x026a }
        r3 = r3.append(r0);	 Catch:{ FileNotFoundException -> 0x026a }
        r3 = r3.toString();	 Catch:{ FileNotFoundException -> 0x026a }
        r5 = r12.j;	 Catch:{ FileNotFoundException -> 0x026a }
        r5 = r5.j;	 Catch:{ FileNotFoundException -> 0x026a }
        r6 = r12.j;	 Catch:{ FileNotFoundException -> 0x026a }
        r6 = r6.w;	 Catch:{ FileNotFoundException -> 0x026a }
        r7 = 0;
        r2 = com.whatsapp.util.f.a(r2, r3, r5, r6, r7);	 Catch:{ FileNotFoundException -> 0x026a }
        r1.file = r2;	 Catch:{ FileNotFoundException -> 0x026a }
        r1 = r12.g;	 Catch:{ FileNotFoundException -> 0x026a }
        r2 = r12.d;	 Catch:{ FileNotFoundException -> 0x026a }
        r2 = r2.file;	 Catch:{ FileNotFoundException -> 0x026a }
        r1.renameTo(r2);	 Catch:{ FileNotFoundException -> 0x026a }
        r1 = r12.g;	 Catch:{ FileNotFoundException -> 0x026a }
        r1.delete();	 Catch:{ FileNotFoundException -> 0x026a }
        r1 = r12.j;	 Catch:{ FileNotFoundException -> 0x026a }
        r1 = r1.j;	 Catch:{ FileNotFoundException -> 0x026a }
        if (r1 != r11) goto L_0x02ba;
    L_0x00b8:
        r1 = r12.j;	 Catch:{ FileNotFoundException -> 0x026a }
        r1 = r1.e();	 Catch:{ FileNotFoundException -> 0x026a }
        if (r1 != 0) goto L_0x02ba;
    L_0x00c0:
        r1 = r12.j;	 Catch:{ FileNotFoundException -> 0x026c }
        r2 = r12.d;	 Catch:{ FileNotFoundException -> 0x026c }
        r2 = r2.file;	 Catch:{ FileNotFoundException -> 0x026c }
        r2 = r2.getAbsolutePath();	 Catch:{ FileNotFoundException -> 0x026c }
        r2 = com.whatsapp.util.f.a(r2);	 Catch:{ FileNotFoundException -> 0x026c }
        r1.b(r2);	 Catch:{ FileNotFoundException -> 0x026c }
        r1 = r12.j;	 Catch:{ FileNotFoundException -> 0x026c }
        r2 = 1;
        r1.O = r2;	 Catch:{ FileNotFoundException -> 0x026c }
        if (r4 == 0) goto L_0x02ba;
    L_0x00d8:
        r1 = r12.g;	 Catch:{ FileNotFoundException -> 0x026e }
        r2 = r1.length();	 Catch:{ FileNotFoundException -> 0x026e }
        r6 = 0;
        r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r1 != 0) goto L_0x02ba;
    L_0x00e4:
        r1 = r12.g;	 Catch:{ FileNotFoundException -> 0x0270 }
        r1.delete();	 Catch:{ FileNotFoundException -> 0x0270 }
        r2 = r0;
    L_0x00ea:
        r0 = r12.j;
        com.whatsapp.util.bo.a(r0);
        r0 = com.whatsapp.App.aJ;
        r1 = r12.j;
        r0.a(r1, r10, r11);
        r0 = h;
        r1 = r12.j;
        r1 = r1.z;
        r0 = r0.remove(r1);
        r0 = (java.util.ArrayList) r0;
        if (r0 == 0) goto L_0x017e;
    L_0x0104:
        r5 = r0.iterator();
    L_0x0108:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x017c;
    L_0x010e:
        r0 = r5.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r1 = r12.j;
        if (r0 == r1) goto L_0x017a;
    L_0x0118:
        r1 = r0.A;
        r1 = (com.whatsapp.MediaData) r1;
        r3 = 0;
        r1.transferring = r3;	 Catch:{ FileNotFoundException -> 0x0272 }
        r3 = r12.d;	 Catch:{ FileNotFoundException -> 0x0272 }
        r3 = r3.transferred;	 Catch:{ FileNotFoundException -> 0x0272 }
        r1.transferred = r3;	 Catch:{ FileNotFoundException -> 0x0272 }
        r3 = r12.d;	 Catch:{ FileNotFoundException -> 0x0272 }
        r3 = r3.dedupeDownload;	 Catch:{ FileNotFoundException -> 0x0272 }
        r1.dedupeDownload = r3;	 Catch:{ FileNotFoundException -> 0x0272 }
        r3 = r13.a();	 Catch:{ FileNotFoundException -> 0x0272 }
        if (r3 == 0) goto L_0x0175;
    L_0x0131:
        r3 = r12.d;	 Catch:{ FileNotFoundException -> 0x0272 }
        r6 = r3.fileSize;	 Catch:{ FileNotFoundException -> 0x0272 }
        r1.fileSize = r6;	 Catch:{ FileNotFoundException -> 0x0272 }
        r3 = r0.j;	 Catch:{ FileNotFoundException -> 0x0272 }
        if (r3 != r11) goto L_0x014d;
    L_0x013b:
        r3 = r0.e();	 Catch:{ FileNotFoundException -> 0x0274 }
        if (r3 != 0) goto L_0x014d;
    L_0x0141:
        r3 = r12.j;	 Catch:{ FileNotFoundException -> 0x0276 }
        r3 = r3.c();	 Catch:{ FileNotFoundException -> 0x0276 }
        r0.b(r3);	 Catch:{ FileNotFoundException -> 0x0276 }
        r3 = 1;
        r0.O = r3;	 Catch:{ FileNotFoundException -> 0x0276 }
    L_0x014d:
        r3 = com.whatsapp.App.p;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = ".";
        r6 = r6.append(r7);
        r6 = r6.append(r2);
        r6 = r6.toString();
        r7 = r0.j;
        r8 = r0.w;
        r3 = com.whatsapp.util.f.a(r3, r6, r7, r8, r9);
        r1.file = r3;
        r3 = r12.d;	 Catch:{ FileNotFoundException -> 0x0278, IOException -> 0x0286 }
        r3 = r3.file;	 Catch:{ FileNotFoundException -> 0x0278, IOException -> 0x0286 }
        r6 = r1.file;	 Catch:{ FileNotFoundException -> 0x0278, IOException -> 0x0286 }
        com.whatsapp.util.f.a(r3, r6);	 Catch:{ FileNotFoundException -> 0x0278, IOException -> 0x0286 }
    L_0x0175:
        r1 = com.whatsapp.App.aJ;
        r1.a(r0, r10, r11);
    L_0x017a:
        if (r4 == 0) goto L_0x0108;
    L_0x017c:
        if (r4 == 0) goto L_0x0187;
    L_0x017e:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x0294 }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x0294 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ FileNotFoundException -> 0x0294 }
    L_0x0187:
        r0 = r12.b;	 Catch:{ FileNotFoundException -> 0x0296 }
        if (r0 == 0) goto L_0x024a;
    L_0x018b:
        r0 = r12.b;	 Catch:{ FileNotFoundException -> 0x0298 }
        r0 = r0.isFinishing();	 Catch:{ FileNotFoundException -> 0x0298 }
        if (r0 != 0) goto L_0x024a;
    L_0x0193:
        r0 = r13.b;	 Catch:{ FileNotFoundException -> 0x029a }
        r1 = com.whatsapp.x2.FAILED_GENERIC;	 Catch:{ FileNotFoundException -> 0x029a }
        if (r0 != r1) goto L_0x01a2;
    L_0x0199:
        r0 = r12.b;	 Catch:{ FileNotFoundException -> 0x029c }
        r1 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r0.showDialog(r1);	 Catch:{ FileNotFoundException -> 0x029c }
        if (r4 == 0) goto L_0x024a;
    L_0x01a2:
        r0 = r13.b;	 Catch:{ FileNotFoundException -> 0x029c }
        r1 = com.whatsapp.x2.FAILED_OUTPUT_STREAM;	 Catch:{ FileNotFoundException -> 0x029c }
        if (r0 != r1) goto L_0x01e7;
    L_0x01a8:
        r0 = android.os.Environment.getExternalStorageState();
        r1 = z;	 Catch:{ FileNotFoundException -> 0x029e }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ FileNotFoundException -> 0x029e }
        r1 = r0.equals(r1);	 Catch:{ FileNotFoundException -> 0x029e }
        if (r1 == 0) goto L_0x01c0;
    L_0x01b7:
        r1 = r12.b;	 Catch:{ FileNotFoundException -> 0x02a0 }
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r1.showDialog(r2);	 Catch:{ FileNotFoundException -> 0x02a0 }
        if (r4 == 0) goto L_0x01e5;
    L_0x01c0:
        r1 = z;	 Catch:{ FileNotFoundException -> 0x02a2 }
        r2 = 14;
        r1 = r1[r2];	 Catch:{ FileNotFoundException -> 0x02a2 }
        r0 = r0.equals(r1);	 Catch:{ FileNotFoundException -> 0x02a2 }
        if (r0 != 0) goto L_0x01d5;
    L_0x01cc:
        r0 = r12.b;	 Catch:{ FileNotFoundException -> 0x02a4 }
        r1 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r0.showDialog(r1);	 Catch:{ FileNotFoundException -> 0x02a4 }
        if (r4 == 0) goto L_0x01e5;
    L_0x01d5:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x02a4 }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x02a4 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ FileNotFoundException -> 0x02a4 }
        r0 = r12.b;	 Catch:{ FileNotFoundException -> 0x02a4 }
        r1 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r0.showDialog(r1);	 Catch:{ FileNotFoundException -> 0x02a4 }
    L_0x01e5:
        if (r4 == 0) goto L_0x024a;
    L_0x01e7:
        r0 = r13.b;	 Catch:{ FileNotFoundException -> 0x02a6 }
        r1 = com.whatsapp.x2.FAILED_INSUFFICIENT_SPACE;	 Catch:{ FileNotFoundException -> 0x02a6 }
        if (r0 != r1) goto L_0x01f6;
    L_0x01ed:
        r0 = r12.b;	 Catch:{ FileNotFoundException -> 0x02a8 }
        r1 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r0.showDialog(r1);	 Catch:{ FileNotFoundException -> 0x02a8 }
        if (r4 == 0) goto L_0x024a;
    L_0x01f6:
        r0 = r13.b;	 Catch:{ FileNotFoundException -> 0x02aa }
        r1 = com.whatsapp.x2.FAILED_TOO_OLD;	 Catch:{ FileNotFoundException -> 0x02aa }
        if (r0 != r1) goto L_0x023d;
    L_0x01fc:
        r0 = r12.b;	 Catch:{ FileNotFoundException -> 0x02aa }
        r0 = r0 instanceof com.whatsapp.ho;	 Catch:{ FileNotFoundException -> 0x02aa }
        if (r0 == 0) goto L_0x0234;
    L_0x0202:
        r0 = r12.b;
        r0 = (com.whatsapp.ho) r0;
        r1 = r12.j;	 Catch:{ FileNotFoundException -> 0x02ac }
        r1 = r1.e;	 Catch:{ FileNotFoundException -> 0x02ac }
        r1 = r1.c;	 Catch:{ FileNotFoundException -> 0x02ac }
        r1 = com.whatsapp.bd.b(r1);	 Catch:{ FileNotFoundException -> 0x02ac }
        if (r1 == 0) goto L_0x02ae;
    L_0x0212:
        r1 = r12.j;	 Catch:{ FileNotFoundException -> 0x02ac }
        r1 = r1.F;	 Catch:{ FileNotFoundException -> 0x02ac }
    L_0x0216:
        if (r1 == 0) goto L_0x0232;
    L_0x0218:
        r1 = com.whatsapp.v.b(r1);
        r2 = r12.b;
        r3 = 2131625025; // 0x7f0e0441 float:1.8877246E38 double:1.0531626947E-314;
        r5 = new java.lang.Object[r10];
        r6 = r12.b;
        r1 = r1.a(r6);
        r5[r9] = r1;
        r1 = r2.getString(r3, r5);
        r0.f(r1);
    L_0x0232:
        if (r4 == 0) goto L_0x024a;
    L_0x0234:
        r0 = r12.b;	 Catch:{ FileNotFoundException -> 0x02b6 }
        r1 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r0.showDialog(r1);	 Catch:{ FileNotFoundException -> 0x02b6 }
        if (r4 == 0) goto L_0x024a;
    L_0x023d:
        r0 = r13.b;	 Catch:{ FileNotFoundException -> 0x02b8 }
        r1 = com.whatsapp.x2.FAILED_INVALID_URL;	 Catch:{ FileNotFoundException -> 0x02b8 }
        if (r0 != r1) goto L_0x024a;
    L_0x0243:
        r0 = r12.b;	 Catch:{ FileNotFoundException -> 0x02b8 }
        r1 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r0.showDialog(r1);	 Catch:{ FileNotFoundException -> 0x02b8 }
    L_0x024a:
        r1 = com.whatsapp.App.p;
        r2 = r12.j;
        r0 = r13.b;
        r3 = r12.a(r0);
        r0 = r12.j;
        r4 = r0.k;
        r6 = java.lang.System.currentTimeMillis();
        r8 = r12.c;
        r6 = r6 - r8;
        com.whatsapp.ak4.a(r1, r2, r3, r4, r6);
        r0 = 0;
        r12.b = r0;
        return;
    L_0x0266:
        r0 = move-exception;
        throw r0;
    L_0x0268:
        r0 = move-exception;
        throw r0;
    L_0x026a:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x026c }
    L_0x026c:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x026e }
    L_0x026e:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0270 }
    L_0x0270:
        r0 = move-exception;
        throw r0;
    L_0x0272:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0274 }
    L_0x0274:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0276 }
    L_0x0276:
        r0 = move-exception;
        throw r0;
    L_0x0278:
        r3 = move-exception;
        r1.transferred = r9;
        r1 = z;
        r6 = 13;
        r1 = r1[r6];
        com.whatsapp.util.Log.b(r1, r3);
        goto L_0x0175;
    L_0x0286:
        r3 = move-exception;
        r1.transferred = r9;
        r1 = z;
        r6 = 8;
        r1 = r1[r6];
        com.whatsapp.util.Log.b(r1, r3);
        goto L_0x0175;
    L_0x0294:
        r0 = move-exception;
        throw r0;
    L_0x0296:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0298 }
    L_0x0298:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x029a }
    L_0x029a:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x029c }
    L_0x029c:
        r0 = move-exception;
        throw r0;
    L_0x029e:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x02a0 }
    L_0x02a0:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x02a2 }
    L_0x02a2:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x02a4 }
    L_0x02a4:
        r0 = move-exception;
        throw r0;
    L_0x02a6:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x02a8 }
    L_0x02a8:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x02aa }
    L_0x02aa:
        r0 = move-exception;
        throw r0;
    L_0x02ac:
        r0 = move-exception;
        throw r0;
    L_0x02ae:
        r1 = r12.j;
        r1 = r1.e;
        r1 = r1.c;
        goto L_0x0216;
    L_0x02b6:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x02b8 }
    L_0x02b8:
        r0 = move-exception;
        throw r0;
    L_0x02ba:
        r2 = r0;
        goto L_0x00ea;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.t7.a(com.whatsapp.a1n):void");
    }

    public static b a(m mVar) {
        b bVar;
        synchronized (i) {
            bVar = (b) i.get(mVar);
        }
        return bVar;
    }

    static {
        String[] strArr = new String[75];
        String str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u00070^J\"\u001doZ\n?\u0006";
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
                        i3 = 50;
                        break;
                    case ay.n /*2*/:
                        i3 = 101;
                        break;
                    case ay.p /*3*/:
                        i3 = 76;
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
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u00070^J)\u00000]\u0017l";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u00070^E>\u00172^\u0004/\u0017&\u001eE;\u001b.^E>\u00176@\u001c";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u0011#\\\u000b#\u0006bV\u0000 \u00176WE";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u0001'\\\u0001l\u001f'V\f-R'@\u0017#\u0000b";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u0014+^\u0000l\u0017:[\u00168\u0001x";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "/]\u0010\"\u0006'V:>\u001d";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u00170@\n>]";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001f+A\u0016%\u001c%\u0012\u00019\u0002.[\u0006-\u0006'\u0012\t%\u00016";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001d,B\n?\u0006'J\u0000/\u00076WE";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u00170@\n>],]\u0011\u0013\u0006*W:?\u0016\u001dQ\u0004>\u0016\u001d_\n9\u001c6m\u00168\u00136W";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "bA\u0011-\u00067A_";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u00170@\n>]";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "/]\u0010\"\u0006'V";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001d,Q\u0004\"\u0011'^\t)\u0016b";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u0011#\\\u0006)\u001eb";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "bC\u0010)\u0007'\u0012\u0016%\b'\b";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u0013.@\u0000-\u0016;\u0012\u0010<\u001e-S\u0001%\u001c%\u0012\u0016-\u001f'\u0012\b)\u0016+SIl\u0005+^\tl\u00037W\u0010)R";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u0013.@\u0000-\u0016;\u0012\f\"R2@\n+\u0000'A\u0016l";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u0013.@\u0000-\u0016;\u0012\u0011>\u0013,A\u0003)\u0000'VE";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001f'V\f--&S\u0011-R+AE\"\u0007.^E";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u0013.@\u0000-\u0016;\u0012\u0011>\u0013,A\u0003)\u00000[\u000b+R";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u00060S\u000b?\u0011-V\u0000l\u0005+V\u0011$H";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "bZ\u0000%\u0015*F_";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "dZ\u0000%\u0015*FX";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "}JX~";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "5[\u000b(\u001d5";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "dE\f(\u0006*\u000f";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "$[\t)\u001a#A\rq";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001d7FJ)\u00000]\u0017l";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001d7F\u00168\u0000'S\bc\u00170@\n>R";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "$[\t)\u0006;B\u0000q";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001b,\u001d\u0000>\u0000-@E";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u001a\u001f2\r_\u000fW\u0011-\u0016#F\u0004";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001b,\u001d\u0000>\u0000-@E";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001b,\u001d\u0000>\u0000-@E";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "bG\u0017 O";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u0000'A\u0010!\u0017mT\u0004%\u001e'VExCt\u0012";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001d7FJ)\u00000]\u0017l";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001d7FJ)\u00000]\u0017l";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "*F\u0011<R1F\u00048\u00071\u000f";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001b,A\u0010*\u0014+Q\f)\u001c6m\u0016<\u0013!WJ";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "$[\t)\u001a#A\rq";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001b,\u001d\u0000>\u0000-@E";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u00170@\n>R";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001d7FJ)\u00000]\u0017l";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001b,\u001d\u0000>\u0000-@E";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0010S\u000b+\u0017";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001d7FJ)\u00000]\u0017l";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001d7FJ)\u00000]\u0017l";
                    obj = 49;
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    strArr2 = strArr3;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001d7FJ)\u00000]\u0017l";
                    obj = 50;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u0014#[\t)\u0016bF\nl\u0011#^\u00069\u001e#F\u0000l\u001a#A\rv";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001b,\u001d\u0000>\u0000-@E";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = " K\u0011)\u0001\u007f";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001b,\u001d\u0000>\u0000-@E";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u0014#[\t)\u0016bZ\u0004?\u001ab_\f?\u001f#F\u0006$R1W\u0017:\u00170\b";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001b,\u001d\u0000>\u0000-@E";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "$[\t)\u0006;B\u0000q";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001b,\u001d\u0000>\u0000-@E";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001b,\u001d\u0000>\u0000-@E";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "$[\t)\u001a#A\rq";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "b^\n/\u0013.\b";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "$[\t)\u0006;B\u0000q";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001d7FJ)\u00000]\u0017l";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001d7FJ)\u00000]\u0017l";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u0000'A\u0010!\u0017mT\u0017#\u001fb";
                    obj = 65;
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    strArr2 = strArr3;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001d7FJ)\u00000]\u0017l";
                    obj = 66;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001d7FJ)\u00000]\u0017l";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    i = 69;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001b,\u001d\u0000>\u0000-@E";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i] = str;
                    i = 70;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u00070^J\"\u001doZ\n?\u0006";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i] = str;
                    i = 71;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u00070^J)\u00000]\u0017l";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i] = str;
                    i = 72;
                    str = "bS\u00068H";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i] = str;
                    i = 73;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u001b,[\u0011l\u00070^_";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i] = str;
                    i = 74;
                    str = "bS\u00108\u001dx";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i] = str;
                    z = strArr3;
                    i = new HashMap();
                    h = new HashMap();
                default:
                    strArr2[i] = str;
                    str = "/W\u0001%\u0013&]\u0012\"\u001e-S\u0001c\u0011*W\u0006'\u0017:[\u00168\u0001";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a() {
        int i = App.az;
        Log.i(z[16] + this.e);
        if (this.f != null) {
            this.f.a();
            if (i == 0) {
                return;
            }
        }
        cancel(true);
        s3.a().b(this.j);
        synchronized (i) {
            i.remove(this.j.e);
            if (!this.d.transferred) {
                this.d.transferring = false;
                this.d.transferred = false;
                this.d.autodownloadRetryEnabled = false;
                App.aJ.a(this.j);
            }
        }
        ArrayList arrayList = (ArrayList) h.remove(this.j.z);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar != this.j) {
                    s3.a().b(bVar);
                    MediaData mediaData = (MediaData) bVar.A;
                    mediaData.transferring = false;
                    mediaData.transferred = this.d.transferred;
                    mediaData.autodownloadRetryEnabled = false;
                    if (mediaData.downloader != null) {
                        mediaData.downloader.b = null;
                        mediaData.downloader.f = null;
                    }
                    App.aJ.a(bVar);
                    i.remove(bVar.e);
                    continue;
                }
                if (i != 0) {
                    break;
                }
            }
        }
        this.b = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.a1n c() {
        /*
        r18_this = this;
        r10 = com.whatsapp.App.az;
        r4 = 0;
        r3 = 0;
        r2 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r11 = new byte[r2];	 Catch:{ IOException -> 0x00b4 }
        r5 = new org.apache.http.params.BasicHttpParams;	 Catch:{ IOException -> 0x00b4 }
        r5.<init>();	 Catch:{ IOException -> 0x00b4 }
        r2 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r5, r2);	 Catch:{ IOException -> 0x00b2 }
        r0 = r18;
        r2 = r0.j;	 Catch:{ IOException -> 0x00b2 }
        r2 = r2.j;	 Catch:{ IOException -> 0x00b2 }
        r6 = 3;
        if (r2 != r6) goto L_0x011e;
    L_0x001b:
        r2 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
    L_0x001e:
        org.apache.http.params.HttpConnectionParams.setSoTimeout(r5, r2);	 Catch:{ IOException -> 0x00b4 }
        r2 = com.whatsapp.ak9.a();	 Catch:{ IOException -> 0x00b4 }
        org.apache.http.params.HttpProtocolParams.setUserAgent(r5, r2);	 Catch:{ IOException -> 0x00b4 }
        r2 = new org.apache.http.impl.client.DefaultHttpClient;	 Catch:{ IOException -> 0x00b4 }
        r2.<init>(r5);	 Catch:{ IOException -> 0x00b4 }
        r5 = new org.apache.http.client.methods.HttpGet;	 Catch:{ IOException -> 0x00b4 }
        r0 = r18;
        r6 = r0.e;	 Catch:{ IOException -> 0x00b4 }
        r5.<init>(r6);	 Catch:{ IOException -> 0x00b4 }
        r0 = r18;
        r6 = r0.g;	 Catch:{ IOException -> 0x00b4 }
        r6 = r6.length();	 Catch:{ IOException -> 0x00b4 }
        r8 = 0;
        r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r8 <= 0) goto L_0x0084;
    L_0x0044:
        r8 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0122 }
        r8.<init>();	 Catch:{ IOException -> 0x0122 }
        r9 = z;	 Catch:{ IOException -> 0x0122 }
        r12 = 66;
        r9 = r9[r12];	 Catch:{ IOException -> 0x0122 }
        r8 = r8.append(r9);	 Catch:{ IOException -> 0x0122 }
        r8 = r8.append(r6);	 Catch:{ IOException -> 0x0122 }
        r8 = r8.toString();	 Catch:{ IOException -> 0x0122 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ IOException -> 0x0122 }
        r8 = z;	 Catch:{ IOException -> 0x0122 }
        r9 = 48;
        r8 = r8[r9];	 Catch:{ IOException -> 0x0122 }
        r9 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0122 }
        r9.<init>();	 Catch:{ IOException -> 0x0122 }
        r12 = z;	 Catch:{ IOException -> 0x0122 }
        r13 = 54;
        r12 = r12[r13];	 Catch:{ IOException -> 0x0122 }
        r9 = r9.append(r12);	 Catch:{ IOException -> 0x0122 }
        r9 = r9.append(r6);	 Catch:{ IOException -> 0x0122 }
        r12 = "-";
        r9 = r9.append(r12);	 Catch:{ IOException -> 0x0122 }
        r9 = r9.toString();	 Catch:{ IOException -> 0x0122 }
        r5.addHeader(r8, r9);	 Catch:{ IOException -> 0x0122 }
    L_0x0084:
        r12 = r2.execute(r5);	 Catch:{ IOException -> 0x00b4 }
        r2 = r12.getStatusLine();	 Catch:{ IOException -> 0x00b4 }
        r2 = r2.getStatusCode();	 Catch:{ IOException -> 0x00b4 }
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r2 == r5) goto L_0x0221;
    L_0x0094:
        r5 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        if (r2 == r5) goto L_0x0221;
    L_0x0098:
        r5 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        if (r2 == r5) goto L_0x00a0;
    L_0x009c:
        r5 = 410; // 0x19a float:5.75E-43 double:2.026E-321;
        if (r2 != r5) goto L_0x0180;
    L_0x00a0:
        r2 = new com.whatsapp.a1n;	 Catch:{ IOException -> 0x00b4 }
        r5 = com.whatsapp.x2.FAILED_TOO_OLD;	 Catch:{ IOException -> 0x00b4 }
        r2.<init>(r5);	 Catch:{ IOException -> 0x00b4 }
        if (r3 == 0) goto L_0x00ac;
    L_0x00a9:
        r3.close();	 Catch:{ IOException -> 0x0130 }
    L_0x00ac:
        if (r4 == 0) goto L_0x00b1;
    L_0x00ae:
        r4.close();	 Catch:{ IOException -> 0x0158 }
    L_0x00b1:
        return r2;
    L_0x00b2:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x00b4 }
    L_0x00b4:
        r2 = move-exception;
    L_0x00b5:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0124 }
        r5.<init>();	 Catch:{ all -> 0x0124 }
        r6 = z;	 Catch:{ all -> 0x0124 }
        r7 = 45;
        r6 = r6[r7];	 Catch:{ all -> 0x0124 }
        r5 = r5.append(r6);	 Catch:{ all -> 0x0124 }
        r2 = r2.toString();	 Catch:{ all -> 0x0124 }
        r2 = r5.append(r2);	 Catch:{ all -> 0x0124 }
        r5 = z;	 Catch:{ all -> 0x0124 }
        r6 = 37;
        r5 = r5[r6];	 Catch:{ all -> 0x0124 }
        r2 = r2.append(r5);	 Catch:{ all -> 0x0124 }
        r0 = r18;
        r5 = r0.e;	 Catch:{ all -> 0x0124 }
        r2 = r2.append(r5);	 Catch:{ all -> 0x0124 }
        r2 = r2.toString();	 Catch:{ all -> 0x0124 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ all -> 0x0124 }
        r2 = new com.whatsapp.a1n;	 Catch:{ all -> 0x0124 }
        r5 = com.whatsapp.x2.FAILED_GENERIC;	 Catch:{ all -> 0x0124 }
        r2.<init>(r5);	 Catch:{ all -> 0x0124 }
        if (r3 == 0) goto L_0x00f1;
    L_0x00ee:
        r3.close();	 Catch:{ IOException -> 0x06a8 }
    L_0x00f1:
        if (r4 == 0) goto L_0x00b1;
    L_0x00f3:
        r4.close();	 Catch:{ IOException -> 0x00f7 }
        goto L_0x00b1;
    L_0x00f7:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 50;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r2 = r2.toString();
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        r2 = new com.whatsapp.a1n;
        r3 = com.whatsapp.x2.FAILED_GENERIC;
        r2.<init>(r3);
        goto L_0x00b1;
    L_0x011e:
        r2 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        goto L_0x001e;
    L_0x0122:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x00b4 }
    L_0x0124:
        r2 = move-exception;
    L_0x0125:
        if (r3 == 0) goto L_0x012a;
    L_0x0127:
        r3.close();	 Catch:{ IOException -> 0x06d0 }
    L_0x012a:
        if (r4 == 0) goto L_0x012f;
    L_0x012c:
        r4.close();	 Catch:{ IOException -> 0x06f8 }
    L_0x012f:
        throw r2;
    L_0x0130:
        r3 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 60;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r3 = r3.toString();
        r3 = r5.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r5 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r5);
        goto L_0x00ac;
    L_0x0158:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 40;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r3 = r3.toString();
        r3 = r4.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r4 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r4);
        goto L_0x00b1;
    L_0x0180:
        r5 = 416; // 0x1a0 float:5.83E-43 double:2.055E-321;
        if (r2 != r5) goto L_0x0204;
    L_0x0184:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00b4 }
        r2.<init>();	 Catch:{ IOException -> 0x00b4 }
        r5 = z;	 Catch:{ IOException -> 0x00b4 }
        r6 = 38;
        r5 = r5[r6];	 Catch:{ IOException -> 0x00b4 }
        r2 = r2.append(r5);	 Catch:{ IOException -> 0x00b4 }
        r0 = r18;
        r5 = r0.e;	 Catch:{ IOException -> 0x00b4 }
        r2 = r2.append(r5);	 Catch:{ IOException -> 0x00b4 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x00b4 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ IOException -> 0x00b4 }
        r2 = new com.whatsapp.a1n;	 Catch:{ IOException -> 0x00b4 }
        r5 = com.whatsapp.x2.FAILED_CANNOT_RESUME;	 Catch:{ IOException -> 0x00b4 }
        r2.<init>(r5);	 Catch:{ IOException -> 0x00b4 }
        if (r3 == 0) goto L_0x01ae;
    L_0x01ab:
        r3.close();	 Catch:{ IOException -> 0x01dd }
    L_0x01ae:
        if (r4 == 0) goto L_0x00b1;
    L_0x01b0:
        r4.close();	 Catch:{ IOException -> 0x01b5 }
        goto L_0x00b1;
    L_0x01b5:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 30;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r3 = r3.toString();
        r3 = r4.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r4 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r4);
        goto L_0x00b1;
    L_0x01dd:
        r3 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 33;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r3 = r3.toString();
        r3 = r5.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r5 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r5);
        goto L_0x01ae;
    L_0x0204:
        r5 = new java.io.IOException;	 Catch:{ IOException -> 0x00b4 }
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00b4 }
        r6.<init>();	 Catch:{ IOException -> 0x00b4 }
        r7 = z;	 Catch:{ IOException -> 0x00b4 }
        r8 = 41;
        r7 = r7[r8];	 Catch:{ IOException -> 0x00b4 }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x00b4 }
        r2 = r6.append(r2);	 Catch:{ IOException -> 0x00b4 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x00b4 }
        r5.<init>(r2);	 Catch:{ IOException -> 0x00b4 }
        throw r5;	 Catch:{ IOException -> 0x00b4 }
    L_0x0221:
        r0 = r18;
        r2 = r0.a;	 Catch:{ IOException -> 0x026c }
        if (r2 == 0) goto L_0x0295;
    L_0x0227:
        r0 = r18;
        r2 = r0.j;	 Catch:{ IOException -> 0x026c }
        r2 = com.whatsapp.App.b(r2);	 Catch:{ IOException -> 0x026c }
        if (r2 != 0) goto L_0x0295;
    L_0x0231:
        r2 = new com.whatsapp.a1n;	 Catch:{ IOException -> 0x00b4 }
        r5 = com.whatsapp.x2.CANCEL;	 Catch:{ IOException -> 0x00b4 }
        r2.<init>(r5);	 Catch:{ IOException -> 0x00b4 }
        if (r3 == 0) goto L_0x023d;
    L_0x023a:
        r3.close();	 Catch:{ IOException -> 0x026e }
    L_0x023d:
        if (r4 == 0) goto L_0x00b1;
    L_0x023f:
        r4.close();	 Catch:{ IOException -> 0x0244 }
        goto L_0x00b1;
    L_0x0244:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 64;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r3 = r3.toString();
        r3 = r4.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r4 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r4);
        goto L_0x00b1;
    L_0x026c:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x00b4 }
    L_0x026e:
        r3 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 69;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r3 = r3.toString();
        r3 = r5.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r5 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r5);
        goto L_0x023d;
    L_0x0295:
        r2 = r18.isCancelled();	 Catch:{ IOException -> 0x00b4 }
        if (r2 == 0) goto L_0x02fd;
    L_0x029b:
        r2 = new com.whatsapp.a1n;	 Catch:{ IOException -> 0x00b4 }
        r5 = com.whatsapp.x2.CANCEL;	 Catch:{ IOException -> 0x00b4 }
        r2.<init>(r5);	 Catch:{ IOException -> 0x00b4 }
        if (r3 == 0) goto L_0x02a7;
    L_0x02a4:
        r3.close();	 Catch:{ IOException -> 0x02d6 }
    L_0x02a7:
        if (r4 == 0) goto L_0x00b1;
    L_0x02a9:
        r4.close();	 Catch:{ IOException -> 0x02ae }
        goto L_0x00b1;
    L_0x02ae:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 67;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r3 = r3.toString();
        r3 = r4.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r4 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r4);
        goto L_0x00b1;
    L_0x02d6:
        r3 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 55;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r3 = r3.toString();
        r3 = r5.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r5 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r5);
        goto L_0x02a7;
    L_0x02fd:
        r5 = 0;
        r2 = 0;
        r8 = z;	 Catch:{ IOException -> 0x00b4 }
        r9 = 34;
        r8 = r8[r9];	 Catch:{ IOException -> 0x00b4 }
        r8 = r12.getFirstHeader(r8);	 Catch:{ IOException -> 0x00b4 }
        if (r8 == 0) goto L_0x0731;
    L_0x030b:
        r8 = r8.getValue();	 Catch:{ IOException -> 0x00b4 }
        if (r8 == 0) goto L_0x0731;
    L_0x0311:
        r9 = z;	 Catch:{ IOException -> 0x00b4 }
        r13 = 63;
        r9 = r9[r13];	 Catch:{ IOException -> 0x00b4 }
        r9 = z;	 Catch:{ IOException -> 0x00b4 }
        r13 = 58;
        r9 = r9[r13];	 Catch:{ IOException -> 0x00b4 }
        r9 = r8.indexOf(r9);	 Catch:{ IOException -> 0x00b4 }
        if (r9 < 0) goto L_0x033a;
    L_0x0323:
        r5 = z;	 Catch:{ IOException -> 0x00b4 }
        r13 = 32;
        r5 = r5[r13];	 Catch:{ IOException -> 0x00b4 }
        r5 = r5.length();	 Catch:{ IOException -> 0x00b4 }
        r5 = r5 + r9;
        r9 = 59;
        r9 = r8.indexOf(r9, r5);	 Catch:{ IOException -> 0x00b4 }
        if (r9 < 0) goto L_0x03a8;
    L_0x0336:
        r5 = r8.substring(r5, r9);	 Catch:{ IOException -> 0x00b4 }
    L_0x033a:
        r9 = z;	 Catch:{ IOException -> 0x00b4 }
        r13 = 43;
        r9 = r9[r13];	 Catch:{ IOException -> 0x00b4 }
        r9 = z;	 Catch:{ IOException -> 0x00b4 }
        r13 = 29;
        r9 = r9[r13];	 Catch:{ IOException -> 0x00b4 }
        r9 = r8.indexOf(r9);	 Catch:{ IOException -> 0x00b4 }
        if (r9 < 0) goto L_0x072d;
    L_0x034c:
        r2 = z;	 Catch:{ IOException -> 0x00b4 }
        r13 = 61;
        r2 = r2[r13];	 Catch:{ IOException -> 0x00b4 }
        r2 = r2.length();	 Catch:{ IOException -> 0x00b4 }
        r2 = r2 + r9;
        r9 = 59;
        r9 = r8.indexOf(r9, r2);	 Catch:{ IOException -> 0x00b4 }
        if (r9 < 0) goto L_0x03ad;
    L_0x035f:
        r2 = r8.substring(r2, r9);	 Catch:{ IOException -> 0x00b4 }
        r8 = r2;
        r9 = r5;
    L_0x0365:
        monitor-enter(r18);	 Catch:{ IOException -> 0x00b4 }
        r2 = r18.isCancelled();	 Catch:{ all -> 0x0725 }
        if (r2 == 0) goto L_0x03db;
    L_0x036c:
        r2 = new com.whatsapp.a1n;	 Catch:{ all -> 0x0725 }
        r5 = com.whatsapp.x2.CANCEL;	 Catch:{ all -> 0x0725 }
        r2.<init>(r5);	 Catch:{ all -> 0x0725 }
        monitor-exit(r18);	 Catch:{ all -> 0x0725 }
        if (r3 == 0) goto L_0x0379;
    L_0x0376:
        r3.close();	 Catch:{ IOException -> 0x03b4 }
    L_0x0379:
        if (r4 == 0) goto L_0x00b1;
    L_0x037b:
        r4.close();	 Catch:{ IOException -> 0x0380 }
        goto L_0x00b1;
    L_0x0380:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 68;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r3 = r3.toString();
        r3 = r4.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r4 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r4);
        goto L_0x00b1;
    L_0x03a8:
        r5 = r8.substring(r5);	 Catch:{ IOException -> 0x00b4 }
        goto L_0x033a;
    L_0x03ad:
        r2 = r8.substring(r2);	 Catch:{ IOException -> 0x00b4 }
        r8 = r2;
        r9 = r5;
        goto L_0x0365;
    L_0x03b4:
        r3 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 57;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r3 = r3.toString();
        r3 = r5.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r5 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r5);
        goto L_0x0379;
    L_0x03db:
        r5 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x046d }
        r0 = r18;
        r2 = r0.g;	 Catch:{ IOException -> 0x046d }
        r13 = 1;
        r5.<init>(r2, r13);	 Catch:{ IOException -> 0x046d }
        r2 = r12.getEntity();	 Catch:{ all -> 0x04dc }
        r12 = r2.getContentLength();	 Catch:{ all -> 0x04dc }
        r12 = r12 + r6;
        r14 = 0;
        r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1));
        if (r4 <= 0) goto L_0x0409;
    L_0x03f4:
        r4 = 1;
        r4 = new java.lang.Long[r4];	 Catch:{ IOException -> 0x04da }
        r14 = 0;
        r16 = 100;
        r16 = r16 * r6;
        r16 = r16 / r12;
        r15 = java.lang.Long.valueOf(r16);	 Catch:{ IOException -> 0x04da }
        r4[r14] = r15;	 Catch:{ IOException -> 0x04da }
        r0 = r18;
        r0.publishProgress(r4);	 Catch:{ IOException -> 0x04da }
    L_0x0409:
        r14 = com.whatsapp.App.aP();	 Catch:{ all -> 0x04dc }
        r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
        if (r4 >= 0) goto L_0x0508;
    L_0x0411:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x04dc }
        r2.<init>();	 Catch:{ all -> 0x04dc }
        r4 = z;	 Catch:{ all -> 0x04dc }
        r6 = 42;
        r4 = r4[r6];	 Catch:{ all -> 0x04dc }
        r2 = r2.append(r4);	 Catch:{ all -> 0x04dc }
        r4 = com.whatsapp.App.p;	 Catch:{ all -> 0x04dc }
        r4 = android.text.format.Formatter.formatFileSize(r4, r14);	 Catch:{ all -> 0x04dc }
        r2 = r2.append(r4);	 Catch:{ all -> 0x04dc }
        r2 = r2.toString();	 Catch:{ all -> 0x04dc }
        com.whatsapp.util.Log.i(r2);	 Catch:{ all -> 0x04dc }
        r2 = new com.whatsapp.a1n;	 Catch:{ all -> 0x04dc }
        r4 = com.whatsapp.x2.FAILED_INSUFFICIENT_SPACE;	 Catch:{ all -> 0x04dc }
        r2.<init>(r4);	 Catch:{ all -> 0x04dc }
        monitor-exit(r18);	 Catch:{ all -> 0x04dc }
        if (r3 == 0) goto L_0x043e;
    L_0x043b:
        r3.close();	 Catch:{ IOException -> 0x04e0 }
    L_0x043e:
        if (r5 == 0) goto L_0x00b1;
    L_0x0440:
        r5.close();	 Catch:{ IOException -> 0x0445 }
        goto L_0x00b1;
    L_0x0445:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 51;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r3 = r3.toString();
        r3 = r4.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r4 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r4);
        goto L_0x00b1;
    L_0x046d:
        r2 = move-exception;
        r5 = z;	 Catch:{ all -> 0x0725 }
        r6 = 31;
        r5 = r5[r6];	 Catch:{ all -> 0x0725 }
        com.whatsapp.util.Log.c(r5, r2);	 Catch:{ all -> 0x0725 }
        r2 = new com.whatsapp.a1n;	 Catch:{ all -> 0x0725 }
        r5 = com.whatsapp.x2.FAILED_OUTPUT_STREAM;	 Catch:{ all -> 0x0725 }
        r2.<init>(r5);	 Catch:{ all -> 0x0725 }
        monitor-exit(r18);	 Catch:{ all -> 0x0725 }
        if (r3 == 0) goto L_0x0484;
    L_0x0481:
        r3.close();	 Catch:{ IOException -> 0x04b3 }
    L_0x0484:
        if (r4 == 0) goto L_0x00b1;
    L_0x0486:
        r4.close();	 Catch:{ IOException -> 0x048b }
        goto L_0x00b1;
    L_0x048b:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 46;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r3 = r3.toString();
        r3 = r4.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r4 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r4);
        goto L_0x00b1;
    L_0x04b3:
        r3 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 53;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r3 = r3.toString();
        r3 = r5.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r5 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r5);
        goto L_0x0484;
    L_0x04da:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x04dc }
    L_0x04dc:
        r2 = move-exception;
        r4 = r5;
    L_0x04de:
        monitor-exit(r18);	 Catch:{ all -> 0x0725 }
        throw r2;	 Catch:{ IOException -> 0x00b4 }
    L_0x04e0:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r6 = z;
        r7 = 59;
        r6 = r6[r7];
        r4 = r4.append(r6);
        r3 = r3.toString();
        r3 = r4.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r4 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r4);
        goto L_0x043e;
    L_0x0508:
        r4 = new com.whatsapp.yl;	 Catch:{ all -> 0x04dc }
        r2 = r2.getContent();	 Catch:{ all -> 0x04dc }
        r14 = 0;
        r4.<init>(r2, r14);	 Catch:{ all -> 0x04dc }
        r2 = r6;
    L_0x0513:
        r6 = 0;
        r7 = r11.length;	 Catch:{ all -> 0x0728 }
        r6 = r4.read(r11, r6, r7);	 Catch:{ all -> 0x0728 }
        if (r6 < 0) goto L_0x059d;
    L_0x051b:
        r7 = 0;
        r5.write(r11, r7, r6);	 Catch:{ all -> 0x0728 }
        r6 = (long) r6;	 Catch:{ all -> 0x0728 }
        r2 = r2 + r6;
        r6 = 1;
        r6 = new java.lang.Long[r6];	 Catch:{ all -> 0x0728 }
        r7 = 0;
        r14 = 100;
        r14 = r14 * r2;
        r14 = r14 / r12;
        r14 = java.lang.Long.valueOf(r14);	 Catch:{ all -> 0x0728 }
        r6[r7] = r14;	 Catch:{ all -> 0x0728 }
        r0 = r18;
        r0.publishProgress(r6);	 Catch:{ all -> 0x0728 }
        r6 = r18.isCancelled();	 Catch:{ all -> 0x0728 }
        if (r6 == 0) goto L_0x0513;
    L_0x053a:
        r2 = new com.whatsapp.a1n;	 Catch:{ all -> 0x0728 }
        r3 = com.whatsapp.x2.CANCEL;	 Catch:{ all -> 0x0728 }
        r2.<init>(r3);	 Catch:{ all -> 0x0728 }
        monitor-exit(r18);	 Catch:{ all -> 0x0728 }
        if (r4 == 0) goto L_0x0547;
    L_0x0544:
        r4.close();	 Catch:{ IOException -> 0x0576 }
    L_0x0547:
        if (r5 == 0) goto L_0x00b1;
    L_0x0549:
        r5.close();	 Catch:{ IOException -> 0x054e }
        goto L_0x00b1;
    L_0x054e:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 65;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r3 = r3.toString();
        r3 = r4.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r4 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r4);
        goto L_0x00b1;
    L_0x0576:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r6 = z;
        r7 = 47;
        r6 = r6[r7];
        r4 = r4.append(r6);
        r3 = r3.toString();
        r3 = r4.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r4 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r4);
        goto L_0x0547;
    L_0x059d:
        monitor-exit(r18);	 Catch:{ all -> 0x0728 }
        r0 = r18;
        r2 = r0.g;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r3 = com.whatsapp.util.f.a(r2);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        if (r3 != 0) goto L_0x05fa;
    L_0x05a8:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2.<init>();	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r6 = z;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r7 = 52;
        r6 = r6[r7];	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2 = r2.append(r6);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r0 = r18;
        r6 = r0.g;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r6 = r6.getAbsolutePath();	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2 = r2.append(r6);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r6 = " ";
        r2 = r2.append(r6);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r0 = r18;
        r6 = r0.g;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r6 = r6.exists();	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2 = r2.append(r6);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r6 = " ";
        r2 = r2.append(r6);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r0 = r18;
        r6 = r0.e;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2 = r2.append(r6);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r0 = r18;
        r2 = r0.g;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2.delete();	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2 = new com.whatsapp.a1n;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r6 = com.whatsapp.x2.FAILED_GENERIC;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2.<init>(r6);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        if (r10 == 0) goto L_0x0646;
    L_0x05fa:
        r2 = r3.equals(r8);	 Catch:{ IOException -> 0x067a, all -> 0x0720 }
        if (r2 != 0) goto L_0x063f;
    L_0x0600:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2.<init>();	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r6 = z;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r7 = 56;
        r6 = r6[r7];	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2 = r2.append(r6);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2 = r2.append(r8);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r6 = z;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r7 = 62;
        r6 = r6[r7];	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2 = r2.append(r6);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r3 = " ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r0 = r18;
        r3 = r0.e;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2 = new com.whatsapp.a1n;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r3 = com.whatsapp.x2.FAILED_HASH_MISMATCH;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        if (r10 == 0) goto L_0x0646;
    L_0x063f:
        r2 = new com.whatsapp.a1n;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r3 = com.whatsapp.x2.SUCCESS;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
        r2.<init>(r3, r9);	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
    L_0x0646:
        if (r4 == 0) goto L_0x064b;
    L_0x0648:
        r4.close();	 Catch:{ IOException -> 0x0681 }
    L_0x064b:
        if (r5 == 0) goto L_0x00b1;
    L_0x064d:
        r5.close();	 Catch:{ IOException -> 0x0652 }
        goto L_0x00b1;
    L_0x0652:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 49;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r2 = r2.toString();
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        r2 = new com.whatsapp.a1n;
        r3 = com.whatsapp.x2.FAILED_GENERIC;
        r2.<init>(r3);
        goto L_0x00b1;
    L_0x067a:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x067c, all -> 0x0720 }
    L_0x067c:
        r2 = move-exception;
        r3 = r4;
        r4 = r5;
        goto L_0x00b5;
    L_0x0681:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r6 = 35;
        r4 = r4[r6];
        r3 = r3.append(r4);
        r2 = r2.toString();
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        r2 = new com.whatsapp.a1n;
        r3 = com.whatsapp.x2.FAILED_GENERIC;
        r2.<init>(r3);
        goto L_0x064b;
    L_0x06a8:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = z;
        r6 = 36;
        r5 = r5[r6];
        r3 = r3.append(r5);
        r2 = r2.toString();
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        r2 = new com.whatsapp.a1n;
        r3 = com.whatsapp.x2.FAILED_GENERIC;
        r2.<init>(r3);
        goto L_0x00f1;
    L_0x06d0:
        r3 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 44;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r3 = r3.toString();
        r3 = r5.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r5 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r5);
        goto L_0x012a;
    L_0x06f8:
        r3 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 39;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r3 = r3.toString();
        r3 = r4.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
        r3 = new com.whatsapp.a1n;
        r4 = com.whatsapp.x2.FAILED_GENERIC;
        r3.<init>(r4);
        goto L_0x012f;
    L_0x0720:
        r2 = move-exception;
        r3 = r4;
        r4 = r5;
        goto L_0x0125;
    L_0x0725:
        r2 = move-exception;
        goto L_0x04de;
    L_0x0728:
        r2 = move-exception;
        r3 = r4;
        r4 = r5;
        goto L_0x04de;
    L_0x072d:
        r8 = r2;
        r9 = r5;
        goto L_0x0365;
    L_0x0731:
        r8 = r2;
        r9 = r5;
        goto L_0x0365;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.t7.c():com.whatsapp.a1n");
    }

    private ah a(x2 x2Var) {
        switch (fl.a[x2Var.ordinal()]) {
            case ay.f /*1*/:
                return this.d.dedupeDownload ? ah.DEDUPED : ah.OK;
            case ay.n /*2*/:
                return ah.ERROR_INSUFFICIENT_SPACE;
            case ay.p /*3*/:
                return ah.ERROR_TOO_OLD;
            case aj.i /*4*/:
                return ah.ERROR_CANNOT_RESUME;
            case aV.r /*5*/:
                return ah.ERROR_HASH_MISMATCH;
            case aV.i /*6*/:
                return ah.ERROR_INVALID_URL;
            case a8.s /*7*/:
                return ah.ERROR_OUTPUT_STREAM;
            case a8.n /*8*/:
                return ah.ERROR_CANCEL;
            default:
                return ah.ERROR_UNKNOWN;
        }
    }

    public void a(Long[] lArr) {
        this.d.progress = lArr[0].longValue();
        App.aJ.a(this.j, false, -1);
    }

    public void onProgressUpdate(Object[] objArr) {
        a((Long[]) objArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(com.whatsapp.protocol.b r10) {
        /*
        r2 = 1;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r10.t;
        r0 = r0.append(r1);
        r1 = z;
        r3 = 26;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r5 = r0.toString();
        r0 = r10.j;
        r1 = 3;
        if (r0 != r1) goto L_0x00da;
    L_0x001f:
        r1 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        r0 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 8;
        if (r3 < r4) goto L_0x00d5;
    L_0x0029:
        r3 = android.media.CamcorderProfile.get(r2);
        if (r3 == 0) goto L_0x003f;
    L_0x002f:
        r4 = r3.videoFrameWidth;
        r1 = java.lang.Math.max(r1, r4);
        r3 = r3.videoFrameHeight;
        r0 = java.lang.Math.max(r0, r3);
        r3 = com.whatsapp.App.az;
        if (r3 == 0) goto L_0x00d5;
    L_0x003f:
        r2 = 0;
        r3 = r1;
        r1 = r2;
        r2 = r0;
    L_0x0043:
        r0 = com.whatsapp.App.p;
        r4 = z;
        r6 = 27;
        r4 = r4[r6];
        r0 = r0.getSystemService(r4);
        r0 = (android.view.WindowManager) r0;
        r6 = r0.getDefaultDisplay();
        r0 = r6.getWidth();
        r4 = r6.getHeight();
        r7 = android.os.Build.VERSION.SDK_INT;
        r8 = 14;
        if (r7 < r8) goto L_0x006f;
    L_0x0063:
        r7 = new android.graphics.Point;	 Catch:{ NoSuchMethodError -> 0x00cf }
        r7.<init>();	 Catch:{ NoSuchMethodError -> 0x00cf }
        r6.getRealSize(r7);	 Catch:{ NoSuchMethodError -> 0x00cf }
        r0 = r7.x;	 Catch:{ NoSuchMethodError -> 0x00cf }
        r4 = r7.y;	 Catch:{ NoSuchMethodError -> 0x00cf }
    L_0x006f:
        if (r0 >= r4) goto L_0x00d1;
    L_0x0071:
        if (r1 == 0) goto L_0x0077;
    L_0x0073:
        if (r3 <= r4) goto L_0x0079;
    L_0x0075:
        if (r2 <= r0) goto L_0x0079;
    L_0x0077:
        r2 = r0;
        r3 = r4;
    L_0x0079:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0 = r0.append(r5);
        r1 = z;
        r4 = 28;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r0 = r0.append(r3);
        r1 = z;
        r4 = 25;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r0 = r0.append(r2);
        r0 = r0.toString();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = z;
        r5 = 23;
        r4 = r4[r5];
        r1 = r1.append(r4);
        r1 = r1.append(r3);
        r3 = z;
        r4 = 24;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
    L_0x00ca:
        r0 = com.whatsapp.App.w(r0);
        return r0;
    L_0x00cf:
        r6 = move-exception;
        goto L_0x006f;
    L_0x00d1:
        r9 = r4;
        r4 = r0;
        r0 = r9;
        goto L_0x0071;
    L_0x00d5:
        r3 = r1;
        r1 = r2;
        r2 = r0;
        goto L_0x0043;
    L_0x00da:
        r0 = r5;
        goto L_0x00ca;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.t7.a(com.whatsapp.protocol.b):java.lang.String");
    }

    public void onPostExecute(Object obj) {
        a((a1n) obj);
    }

    public static t7 a(b bVar, boolean z, Activity activity) {
        synchronized (i) {
            MediaData mediaData = (MediaData) bVar.A;
            if (mediaData == null) {
                Log.e(z[21] + bVar.e.a);
                return null;
            } else if (mediaData.transferred) {
                Log.e(z[20] + bVar.e.a);
                return null;
            } else if (mediaData.transferring) {
                Log.e(z[22] + bVar.e.a);
                return null;
            } else {
                t7 t7Var;
                t7 t7Var2;
                if (i.containsKey(bVar.e)) {
                    Log.w(z[19] + bVar.e.a);
                    t7Var = null;
                } else {
                    i.put(bVar.e, bVar);
                    t7Var = new t7(bVar, z, activity);
                    mediaData.downloader = t7Var;
                    mediaData.transferring = true;
                    mediaData.progress = 0;
                    mediaData.autodownloadRetryEnabled = true;
                }
                if (t7Var != null) {
                    ArrayList arrayList;
                    ArrayList arrayList2 = (ArrayList) h.get(bVar.z);
                    if (arrayList2 != null) {
                        t7Var.f = ((MediaData) ((b) arrayList2.get(0)).A).downloader;
                        Log.i(z[18] + bVar.e.a + z[17] + arrayList2.size());
                        arrayList = arrayList2;
                        t7Var2 = null;
                    } else {
                        arrayList2 = new ArrayList();
                        h.put(bVar.z, arrayList2);
                        arrayList = arrayList2;
                        t7Var2 = t7Var;
                    }
                    arrayList.add(bVar);
                } else {
                    t7Var2 = t7Var;
                }
                App.aJ.a(bVar, false, -1);
                return t7Var2;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.a1n a(java.lang.Void[] r12) {
        /*
        r11_this = this;
        r9 = 12;
        r3 = 0;
        r2 = 1;
        r4 = com.whatsapp.App.az;
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0018 }
        r11.c = r0;	 Catch:{ Exception -> 0x0018 }
        r0 = r11.e;	 Catch:{ Exception -> 0x0018 }
        if (r0 != 0) goto L_0x001a;
    L_0x0010:
        r0 = new com.whatsapp.a1n;	 Catch:{ Exception -> 0x0018 }
        r1 = com.whatsapp.x2.FAILED_INVALID_URL;	 Catch:{ Exception -> 0x0018 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0018 }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = move-exception;
        throw r0;
    L_0x001a:
        r0 = com.whatsapp.App.p;
        com.whatsapp.util.f.a(r0);
        r1 = 0;
        r0 = com.whatsapp.App.aJ;	 Catch:{ Exception -> 0x0184 }
        r5 = r11.j;	 Catch:{ Exception -> 0x0184 }
        r5 = r5.z;	 Catch:{ Exception -> 0x0184 }
        r0 = r0.v(r5);	 Catch:{ Exception -> 0x0184 }
        if (r0 == 0) goto L_0x01ef;
    L_0x002c:
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0184 }
        r5.<init>();	 Catch:{ Exception -> 0x0184 }
        r6 = z;	 Catch:{ Exception -> 0x0184 }
        r7 = 6;
        r6 = r6[r7];	 Catch:{ Exception -> 0x0184 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x0184 }
        r6 = r11.j;	 Catch:{ Exception -> 0x0184 }
        r6 = r6.z;	 Catch:{ Exception -> 0x0184 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x0184 }
        r6 = " ";
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x0184 }
        r6 = r0.getAbsolutePath();	 Catch:{ Exception -> 0x0184 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x0184 }
        r5 = r5.toString();	 Catch:{ Exception -> 0x0184 }
        com.whatsapp.util.Log.i(r5);	 Catch:{ Exception -> 0x0184 }
        r5 = r11.g;	 Catch:{ Exception -> 0x0184 }
        com.whatsapp.util.f.a(r0, r5);	 Catch:{ Exception -> 0x0184 }
        r0 = new com.whatsapp.a1n;	 Catch:{ Exception -> 0x0184 }
        r5 = com.whatsapp.x2.SUCCESS;	 Catch:{ Exception -> 0x0184 }
        r0.<init>(r5);	 Catch:{ Exception -> 0x0184 }
        r1 = r11.d;	 Catch:{ Exception -> 0x01ea }
        r5 = 1;
        r1.dedupeDownload = r5;	 Catch:{ Exception -> 0x01ea }
    L_0x0068:
        if (r0 != 0) goto L_0x0151;
    L_0x006a:
        r0 = r11.g;	 Catch:{ Exception -> 0x018f }
        r0 = r0.length();	 Catch:{ Exception -> 0x018f }
        r6 = 0;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0193;
    L_0x0076:
        r0 = r2;
    L_0x0077:
        r1 = r11.c();
        r5 = r1.b;	 Catch:{ Exception -> 0x0196 }
        r6 = com.whatsapp.x2.FAILED_CANNOT_RESUME;	 Catch:{ Exception -> 0x0196 }
        if (r5 == r6) goto L_0x0087;
    L_0x0081:
        r5 = r1.b;	 Catch:{ Exception -> 0x0196 }
        r6 = com.whatsapp.x2.FAILED_HASH_MISMATCH;	 Catch:{ Exception -> 0x0196 }
        if (r5 != r6) goto L_0x00b7;
    L_0x0087:
        r5 = r11.g;	 Catch:{ Exception -> 0x0198 }
        r5 = r5.delete();	 Catch:{ Exception -> 0x0198 }
        if (r5 != 0) goto L_0x00ae;
    L_0x008f:
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019a }
        r5.<init>();	 Catch:{ Exception -> 0x019a }
        r6 = z;	 Catch:{ Exception -> 0x019a }
        r7 = 4;
        r6 = r6[r7];	 Catch:{ Exception -> 0x019a }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x019a }
        r6 = r11.g;	 Catch:{ Exception -> 0x019a }
        r6 = r6.getAbsolutePath();	 Catch:{ Exception -> 0x019a }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x019a }
        r5 = r5.toString();	 Catch:{ Exception -> 0x019a }
        com.whatsapp.util.Log.e(r5);	 Catch:{ Exception -> 0x019a }
    L_0x00ae:
        if (r0 == 0) goto L_0x01a3;
    L_0x00b0:
        r0 = r11.c();
        if (r4 == 0) goto L_0x0151;
    L_0x00b6:
        r1 = r0;
    L_0x00b7:
        r0 = r1.b;	 Catch:{ Exception -> 0x019c }
        r5 = com.whatsapp.x2.FAILED_TOO_OLD;	 Catch:{ Exception -> 0x019c }
        if (r0 != r5) goto L_0x01a3;
    L_0x00bd:
        r0 = r11.j;	 Catch:{ Exception -> 0x019e }
        r0 = r0.a;	 Catch:{ Exception -> 0x019e }
        if (r0 == r9) goto L_0x01a3;
    L_0x00c3:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = z;
        r6 = 5;
        r5 = r5[r6];
        r0 = r0.append(r5);
        r5 = r11.j;
        r5 = r5.e;
        r0 = r0.append(r5);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.aJ;
        r5 = r11.j;
        r5 = r5.e;
        r6 = 11;
        r0.b(r5, r6);
        r0 = r11.j;
        com.whatsapp.App.i(r0);
        r0 = r11.j;
        r5 = r0.t;
    L_0x00f4:
        if (r3 > r9) goto L_0x01a3;
    L_0x00f6:
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        java.lang.Thread.sleep(r6);	 Catch:{ InterruptedException -> 0x01a0 }
    L_0x00fb:
        r0 = r11.j;	 Catch:{ Exception -> 0x01a5 }
        r0 = r0.t;	 Catch:{ Exception -> 0x01a5 }
        r0 = r5.equals(r0);	 Catch:{ Exception -> 0x01a5 }
        if (r0 != 0) goto L_0x01db;
    L_0x0105:
        r0 = z;
        r6 = 3;
        r0 = r0[r6];
        com.whatsapp.util.Log.i(r0);
        r0 = new java.net.URL;	 Catch:{ Exception -> 0x01ad }
        r6 = r11.j;	 Catch:{ Exception -> 0x01ad }
        r6 = r6.t;	 Catch:{ Exception -> 0x01ad }
        r0.<init>(r6);	 Catch:{ Exception -> 0x01ad }
        r6 = r0.getHost();	 Catch:{ Exception -> 0x01a7 }
        if (r6 == 0) goto L_0x0126;
    L_0x011c:
        r0 = r0.getHost();	 Catch:{ Exception -> 0x01a7 }
        r0 = r0.length();	 Catch:{ Exception -> 0x01a7 }
        if (r0 != 0) goto L_0x0145;
    L_0x0126:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01a9 }
        r0.<init>();	 Catch:{ Exception -> 0x01a9 }
        r6 = z;	 Catch:{ Exception -> 0x01a9 }
        r7 = 0;
        r6 = r6[r7];	 Catch:{ Exception -> 0x01a9 }
        r0 = r0.append(r6);	 Catch:{ Exception -> 0x01a9 }
        r6 = r11.j;	 Catch:{ Exception -> 0x01a9 }
        r6 = r6.t;	 Catch:{ Exception -> 0x01a9 }
        r0 = r0.append(r6);	 Catch:{ Exception -> 0x01a9 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x01a9 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x01a9 }
        if (r4 == 0) goto L_0x014d;
    L_0x0145:
        r0 = r11.j;	 Catch:{ Exception -> 0x01ab }
        r0 = a(r0);	 Catch:{ Exception -> 0x01ab }
        r11.e = r0;	 Catch:{ Exception -> 0x01ab }
    L_0x014d:
        r0 = r11.c();	 Catch:{ Exception -> 0x01ad }
    L_0x0151:
        r1 = r11.j;	 Catch:{ Exception -> 0x01e4 }
        r1 = r1.j;	 Catch:{ Exception -> 0x01e4 }
        if (r1 != r2) goto L_0x0172;
    L_0x0157:
        r1 = r0.a();	 Catch:{ Exception -> 0x01e4 }
        if (r1 == 0) goto L_0x0172;
    L_0x015d:
        r1 = r11.j;	 Catch:{ Exception -> 0x01e8 }
        r1 = com.whatsapp.util.bo.b(r1);	 Catch:{ Exception -> 0x01e8 }
        r2 = r1.getHeight();	 Catch:{ Exception -> 0x01e6 }
        r1 = r1.getWidth();	 Catch:{ Exception -> 0x01e6 }
        if (r2 <= r1) goto L_0x0172;
    L_0x016d:
        r1 = r11.d;	 Catch:{ Exception -> 0x01e6 }
        com.whatsapp.util.f.a(r1);	 Catch:{ Exception -> 0x01e6 }
    L_0x0172:
        r1 = i;
        monitor-enter(r1);
        r2 = i;	 Catch:{ all -> 0x0181 }
        r3 = r11.j;	 Catch:{ all -> 0x0181 }
        r3 = r3.e;	 Catch:{ all -> 0x0181 }
        r2.remove(r3);	 Catch:{ all -> 0x0181 }
        monitor-exit(r1);	 Catch:{ all -> 0x0181 }
        goto L_0x0017;
    L_0x0181:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0181 }
        throw r0;
    L_0x0184:
        r0 = move-exception;
    L_0x0185:
        r5 = z;
        r5 = r5[r2];
        com.whatsapp.util.Log.b(r5, r0);
        r0 = r1;
        goto L_0x0068;
    L_0x018f:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0191 }
    L_0x0191:
        r0 = move-exception;
        throw r0;
    L_0x0193:
        r0 = r3;
        goto L_0x0077;
    L_0x0196:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0198 }
    L_0x0198:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x019a }
    L_0x019a:
        r0 = move-exception;
        throw r0;
    L_0x019c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x019e }
    L_0x019e:
        r0 = move-exception;
        throw r0;
    L_0x01a0:
        r0 = move-exception;
        if (r4 != 0) goto L_0x00fb;
    L_0x01a3:
        r0 = r1;
        goto L_0x0151;
    L_0x01a5:
        r0 = move-exception;
        throw r0;
    L_0x01a7:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01a9 }
    L_0x01a9:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01ab }
    L_0x01ab:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01ad }
    L_0x01ad:
        r0 = move-exception;
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01e2 }
        r6.<init>();	 Catch:{ Exception -> 0x01e2 }
        r7 = z;	 Catch:{ Exception -> 0x01e2 }
        r8 = 2;
        r7 = r7[r8];	 Catch:{ Exception -> 0x01e2 }
        r6 = r6.append(r7);	 Catch:{ Exception -> 0x01e2 }
        r7 = r11.j;	 Catch:{ Exception -> 0x01e2 }
        r7 = r7.t;	 Catch:{ Exception -> 0x01e2 }
        r6 = r6.append(r7);	 Catch:{ Exception -> 0x01e2 }
        r7 = " ";
        r6 = r6.append(r7);	 Catch:{ Exception -> 0x01e2 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x01e2 }
        r0 = r6.append(r0);	 Catch:{ Exception -> 0x01e2 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x01e2 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x01e2 }
        if (r4 == 0) goto L_0x01a3;
    L_0x01db:
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x00f4;
    L_0x01df:
        r0 = r1;
        goto L_0x0151;
    L_0x01e2:
        r0 = move-exception;
        throw r0;
    L_0x01e4:
        r0 = move-exception;
        throw r0;
    L_0x01e6:
        r1 = move-exception;
        throw r1;	 Catch:{ Exception -> 0x01e8 }
    L_0x01e8:
        r1 = move-exception;
        goto L_0x0172;
    L_0x01ea:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
        goto L_0x0185;
    L_0x01ef:
        r0 = r1;
        goto L_0x0068;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.t7.a(java.lang.Void[]):com.whatsapp.a1n");
    }

    protected void onCancelled() {
        Log.i(z[15] + this.e);
    }
}
