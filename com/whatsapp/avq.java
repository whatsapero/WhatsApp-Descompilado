package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.cm;
import com.whatsapp.util.Log;
import com.whatsapp.util.f;
import java.util.LinkedHashMap;
import java.util.Timer;
import java.util.TimerTask;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class avq extends AsyncTask {
    private static final Object e;
    protected static final LinkedHashMap l;
    protected static final LinkedHashMap m;
    private static Timer q;
    private static final String[] z;
    private boolean a;
    private va b;
    private boolean c;
    protected boolean d;
    private long f;
    private final MediaData g;
    private final long h;
    private boolean i;
    private long j;
    protected final b k;
    protected cm n;
    private long o;
    protected int p;
    private TimerTask r;

    public void c() {
        this.c = true;
    }

    static MediaData c(avq com_whatsapp_avq) {
        return com_whatsapp_avq.g;
    }

    public void a(boolean z) {
        boolean z2 = true;
        Log.i(z[7] + this.k.e);
        cancel(true);
        if (!this.i) {
            this.k.a = 0;
            this.g.transferring = false;
            this.g.transferred = false;
            MediaData mediaData = this.g;
            if (z) {
                z2 = false;
            }
            mediaData.autodownloadRetryEnabled = z2;
            App.aJ.a(this.k);
        }
        m.remove(this.k.e);
        l.remove(this.k.e);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.rk r13) {
        /*
        r12_this = this;
        r10 = 2;
        r9 = -1;
        r8 = 1;
        r2 = 0;
        r4 = com.whatsapp.App.az;
        r0 = r12.g;	 Catch:{ Exception -> 0x00cc }
        r1 = 0;
        r0.transferring = r1;	 Catch:{ Exception -> 0x00cc }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00cc }
        r0.<init>();	 Catch:{ Exception -> 0x00cc }
        r1 = z;	 Catch:{ Exception -> 0x00cc }
        r3 = 14;
        r1 = r1[r3];	 Catch:{ Exception -> 0x00cc }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00cc }
        r1 = r12.k;	 Catch:{ Exception -> 0x00cc }
        r1 = r1.e;	 Catch:{ Exception -> 0x00cc }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00cc }
        r1 = z;	 Catch:{ Exception -> 0x00cc }
        r3 = 16;
        r1 = r1[r3];	 Catch:{ Exception -> 0x00cc }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00cc }
        r1 = m;	 Catch:{ Exception -> 0x00cc }
        r1 = r1.size();	 Catch:{ Exception -> 0x00cc }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00cc }
        r1 = z;	 Catch:{ Exception -> 0x00cc }
        r3 = 21;
        r1 = r1[r3];	 Catch:{ Exception -> 0x00cc }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00cc }
        r1 = l;	 Catch:{ Exception -> 0x00cc }
        r1 = r1.size();	 Catch:{ Exception -> 0x00cc }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00cc }
        r1 = z;	 Catch:{ Exception -> 0x00cc }
        r3 = 11;
        r1 = r1[r3];	 Catch:{ Exception -> 0x00cc }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00cc }
        r0 = r0.append(r13);	 Catch:{ Exception -> 0x00cc }
        r0 = r0.toString();	 Catch:{ Exception -> 0x00cc }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00cc }
        r0 = r12.r;	 Catch:{ Exception -> 0x00cc }
        if (r0 == 0) goto L_0x0068;
    L_0x0063:
        r0 = r12.r;	 Catch:{ Exception -> 0x00cc }
        r0.cancel();	 Catch:{ Exception -> 0x00cc }
    L_0x0068:
        r0 = m;
        r1 = r12.k;
        r1 = r1.e;
        r0 = r0.remove(r1);
        r0 = (com.whatsapp.avq) r0;
        r1 = l;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x009e;
    L_0x007c:
        r1 = l;
        r1 = r1.entrySet();
        r1 = r1.iterator();
        r1 = r1.next();
        r1 = (java.util.Map.Entry) r1;
        r3 = l;
        r5 = r1.getKey();
        r3.remove(r5);
        r1 = r1.getValue();
        r1 = (com.whatsapp.avq) r1;
        r1.b();
    L_0x009e:
        if (r0 == r12) goto L_0x00d4;
    L_0x00a0:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00ce }
        r1.<init>();	 Catch:{ Exception -> 0x00ce }
        r3 = z;	 Catch:{ Exception -> 0x00ce }
        r4 = 12;
        r3 = r3[r4];	 Catch:{ Exception -> 0x00ce }
        r1 = r1.append(r3);	 Catch:{ Exception -> 0x00ce }
        r3 = r12.k;	 Catch:{ Exception -> 0x00ce }
        r3 = r3.e;	 Catch:{ Exception -> 0x00ce }
        r1 = r1.append(r3);	 Catch:{ Exception -> 0x00ce }
        r3 = " ";
        r1 = r1.append(r3);	 Catch:{ Exception -> 0x00ce }
        if (r0 != 0) goto L_0x00d2;
    L_0x00bf:
        r0 = r8;
    L_0x00c0:
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
    L_0x00cb:
        return;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        throw r0;
    L_0x00d2:
        r0 = r2;
        goto L_0x00c0;
    L_0x00d4:
        r0 = r12.i;	 Catch:{ Exception -> 0x0157 }
        if (r0 != 0) goto L_0x00cb;
    L_0x00d8:
        r0 = com.whatsapp.rk.SUCCESS;	 Catch:{ Exception -> 0x0159 }
        if (r13 != r0) goto L_0x01fe;
    L_0x00dc:
        r0 = r12.d;	 Catch:{ Exception -> 0x0159 }
        if (r0 == 0) goto L_0x01fe;
    L_0x00e0:
        r0 = new java.net.URL;	 Catch:{ Exception -> 0x010c }
        r1 = r12.n;	 Catch:{ Exception -> 0x010c }
        r1 = r1.a;	 Catch:{ Exception -> 0x010c }
        r0.<init>(r1);	 Catch:{ Exception -> 0x010c }
        r1 = r0.getHost();	 Catch:{ Exception -> 0x015b }
        if (r1 == 0) goto L_0x00f9;
    L_0x00ef:
        r0 = r0.getHost();	 Catch:{ Exception -> 0x015b }
        r0 = r0.length();	 Catch:{ Exception -> 0x015b }
        if (r0 != 0) goto L_0x012b;
    L_0x00f9:
        r0 = z;	 Catch:{ Exception -> 0x010c }
        r1 = 15;
        r0 = r0[r1];	 Catch:{ Exception -> 0x010c }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x010c }
        r0 = com.whatsapp.App.aJ;	 Catch:{ Exception -> 0x010c }
        r1 = r12.k;	 Catch:{ Exception -> 0x010c }
        r3 = 0;
        r5 = -1;
        r0.a(r1, r3, r5);	 Catch:{ Exception -> 0x010c }
        goto L_0x00cb;
    L_0x010c:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r5 = 20;
        r3 = r3[r5];
        r1 = r1.append(r3);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x012b:
        r0 = r12.n;	 Catch:{ Exception -> 0x015d }
        r0 = r0.e;	 Catch:{ Exception -> 0x015d }
        if (r0 == 0) goto L_0x0141;
    L_0x0131:
        r0 = r12.n;	 Catch:{ Exception -> 0x015f }
        r0 = r0.a;	 Catch:{ Exception -> 0x015f }
        if (r0 == 0) goto L_0x0141;
    L_0x0137:
        r0 = r12.n;	 Catch:{ Exception -> 0x0155 }
        r0 = r0.d;	 Catch:{ Exception -> 0x0155 }
        r6 = 0;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 != 0) goto L_0x0161;
    L_0x0141:
        r0 = z;	 Catch:{ Exception -> 0x0155 }
        r1 = 13;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0155 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x0155 }
        r0 = com.whatsapp.App.aJ;	 Catch:{ Exception -> 0x0155 }
        r1 = r12.k;	 Catch:{ Exception -> 0x0155 }
        r2 = 0;
        r3 = -1;
        r0.a(r1, r2, r3);	 Catch:{ Exception -> 0x0155 }
        goto L_0x00cb;
    L_0x0155:
        r0 = move-exception;
        throw r0;
    L_0x0157:
        r0 = move-exception;
        throw r0;
    L_0x0159:
        r0 = move-exception;
        throw r0;
    L_0x015b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x010c }
    L_0x015d:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x015f }
    L_0x015f:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0155 }
    L_0x0161:
        r0 = r12.a;	 Catch:{ Exception -> 0x0282 }
        if (r0 != 0) goto L_0x01cc;
    L_0x0165:
        r0 = r12.n;	 Catch:{ Exception -> 0x0284 }
        r0 = r0.b;	 Catch:{ Exception -> 0x0284 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Exception -> 0x0284 }
        if (r0 == 0) goto L_0x017a;
    L_0x016f:
        r0 = z;	 Catch:{ Exception -> 0x0286 }
        r1 = 18;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0286 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x0286 }
        if (r4 == 0) goto L_0x01cc;
    L_0x017a:
        r0 = r12.n;	 Catch:{ Exception -> 0x0288 }
        r0 = r0.b;	 Catch:{ Exception -> 0x0288 }
        r1 = r12.k;	 Catch:{ Exception -> 0x0288 }
        r1 = r1.z;	 Catch:{ Exception -> 0x0288 }
        r0 = r0.equals(r1);	 Catch:{ Exception -> 0x0288 }
        if (r0 != 0) goto L_0x01c4;
    L_0x0188:
        r0 = r12.k;	 Catch:{ Exception -> 0x028a }
        r0 = r0.j;	 Catch:{ Exception -> 0x028a }
        if (r0 != r10) goto L_0x0194;
    L_0x018e:
        r0 = r12.k;	 Catch:{ Exception -> 0x028c }
        r0 = r0.w;	 Catch:{ Exception -> 0x028c }
        if (r0 == r8) goto L_0x01c4;
    L_0x0194:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x028c }
        r0.<init>();	 Catch:{ Exception -> 0x028c }
        r1 = z;	 Catch:{ Exception -> 0x028c }
        r3 = 17;
        r1 = r1[r3];	 Catch:{ Exception -> 0x028c }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x028c }
        r1 = r12.k;	 Catch:{ Exception -> 0x028c }
        r1 = r1.z;	 Catch:{ Exception -> 0x028c }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x028c }
        r1 = z;	 Catch:{ Exception -> 0x028c }
        r3 = 19;
        r1 = r1[r3];	 Catch:{ Exception -> 0x028c }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x028c }
        r1 = r12.n;	 Catch:{ Exception -> 0x028c }
        r1 = r1.b;	 Catch:{ Exception -> 0x028c }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x028c }
        r0 = r0.toString();	 Catch:{ Exception -> 0x028c }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x028c }
    L_0x01c4:
        r0 = r12.k;
        r1 = r12.n;
        r1 = r1.b;
        r0.z = r1;
    L_0x01cc:
        r0 = r12.k;	 Catch:{ Exception -> 0x028e }
        r1 = r12.n;	 Catch:{ Exception -> 0x028e }
        r6 = r1.d;	 Catch:{ Exception -> 0x028e }
        r0.k = r6;	 Catch:{ Exception -> 0x028e }
        r0 = r12.k;	 Catch:{ Exception -> 0x028e }
        r1 = r12.n;	 Catch:{ Exception -> 0x028e }
        r1 = r1.a;	 Catch:{ Exception -> 0x028e }
        r0.t = r1;	 Catch:{ Exception -> 0x028e }
        r0 = r12.k;	 Catch:{ Exception -> 0x028e }
        r1 = r12.n;	 Catch:{ Exception -> 0x028e }
        r1 = r1.e;	 Catch:{ Exception -> 0x028e }
        r0.s = r1;	 Catch:{ Exception -> 0x028e }
        r0 = r12.k;	 Catch:{ Exception -> 0x028e }
        r0 = r0.p;	 Catch:{ Exception -> 0x028e }
        if (r0 != 0) goto L_0x01f2;
    L_0x01ea:
        r0 = r12.k;	 Catch:{ Exception -> 0x028e }
        r1 = r12.n;	 Catch:{ Exception -> 0x028e }
        r1 = r1.c;	 Catch:{ Exception -> 0x028e }
        r0.p = r1;	 Catch:{ Exception -> 0x028e }
    L_0x01f2:
        r0 = r12.k;	 Catch:{ Exception -> 0x0290 }
        r1 = 2;
        r0.a = r1;	 Catch:{ Exception -> 0x0290 }
        r0 = r12.g;	 Catch:{ Exception -> 0x0290 }
        r1 = 1;
        r0.transferred = r1;	 Catch:{ Exception -> 0x0290 }
        if (r4 == 0) goto L_0x0203;
    L_0x01fe:
        r0 = r12.k;	 Catch:{ Exception -> 0x0290 }
        r1 = 0;
        r0.a = r1;	 Catch:{ Exception -> 0x0290 }
    L_0x0203:
        r0 = r12.isCancelled();	 Catch:{ Exception -> 0x0292 }
        if (r0 != 0) goto L_0x0267;
    L_0x0209:
        r0 = com.whatsapp.rk.SUCCESS;	 Catch:{ Exception -> 0x0294 }
        if (r13 == r0) goto L_0x021f;
    L_0x020d:
        r0 = r12.i;	 Catch:{ Exception -> 0x0296 }
        if (r0 != 0) goto L_0x021f;
    L_0x0211:
        r0 = com.whatsapp.App.p;	 Catch:{ Exception -> 0x0296 }
        r0 = r0.U();	 Catch:{ Exception -> 0x0296 }
        r1 = new com.whatsapp.of;	 Catch:{ Exception -> 0x0296 }
        r1.<init>(r12, r13);	 Catch:{ Exception -> 0x0296 }
        r0.post(r1);	 Catch:{ Exception -> 0x0296 }
    L_0x021f:
        r0 = r12.k;
        r0 = r0.j;
        switch(r0) {
            case 1: goto L_0x0298;
            case 2: goto L_0x029c;
            case 3: goto L_0x02a6;
            default: goto L_0x0226;
        };
    L_0x0226:
        r1 = com.whatsapp.fieldstats.am.NONE;
    L_0x0228:
        r0 = com.whatsapp.rk.SUCCESS;	 Catch:{ Exception -> 0x02b1 }
        if (r13 != r0) goto L_0x023c;
    L_0x022c:
        r0 = r12.d;	 Catch:{ Exception -> 0x02b3 }
        if (r0 == 0) goto L_0x023c;
    L_0x0230:
        r0 = r12.b;	 Catch:{ Exception -> 0x02b3 }
        if (r0 == 0) goto L_0x0238;
    L_0x0234:
        r3 = com.whatsapp.fieldstats.r.OK;
        if (r4 == 0) goto L_0x023e;
    L_0x0238:
        r3 = com.whatsapp.fieldstats.r.DUPLICATE;
        if (r4 == 0) goto L_0x023e;
    L_0x023c:
        r3 = com.whatsapp.fieldstats.r.ERROR_UNKNOWN;
    L_0x023e:
        r0 = com.whatsapp.App.p;	 Catch:{ Exception -> 0x02b5 }
        r4 = com.whatsapp.fieldstats.y.RETRY_COUNTER;	 Catch:{ Exception -> 0x02b5 }
        r5 = r12.c;	 Catch:{ Exception -> 0x02b5 }
        if (r5 == 0) goto L_0x0247;
    L_0x0246:
        r2 = r8;
    L_0x0247:
        r2 = java.lang.Integer.valueOf(r2);
        com.whatsapp.fieldstats.al.a(r0, r4, r2);
        r0 = com.whatsapp.App.p;
        r2 = r12.g;
        r2 = r2.forward;
        r4 = r12.h;
        r6 = java.lang.System.currentTimeMillis();
        r10 = r12.o;
        r6 = r6 - r10;
        com.whatsapp.ak4.a(r0, r1, r2, r3, r4, r6);
        r0 = com.whatsapp.App.p;
        r1 = com.whatsapp.fieldstats.y.RETRY_COUNTER;
        com.whatsapp.fieldstats.al.a(r0, r1);
    L_0x0267:
        r0 = com.whatsapp.rk.FAILED_BAD_MEDIA;	 Catch:{ Exception -> 0x02b7 }
        if (r13 != r0) goto L_0x0270;
    L_0x026b:
        r0 = r12.g;	 Catch:{ Exception -> 0x02b7 }
        r1 = 0;
        r0.autodownloadRetryEnabled = r1;	 Catch:{ Exception -> 0x02b7 }
    L_0x0270:
        r1 = com.whatsapp.App.aJ;	 Catch:{ Exception -> 0x02b9 }
        r2 = r12.k;	 Catch:{ Exception -> 0x02b9 }
        r0 = com.whatsapp.rk.SUCCESS;	 Catch:{ Exception -> 0x02b9 }
        if (r13 != r0) goto L_0x02bd;
    L_0x0278:
        r0 = r12.d;	 Catch:{ Exception -> 0x02bb }
        if (r0 == 0) goto L_0x02bd;
    L_0x027c:
        r0 = r8;
    L_0x027d:
        r1.a(r2, r8, r0);
        goto L_0x00cb;
    L_0x0282:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0284 }
    L_0x0284:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0286 }
    L_0x0286:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0288 }
    L_0x0288:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x028a }
    L_0x028a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x028c }
    L_0x028c:
        r0 = move-exception;
        throw r0;
    L_0x028e:
        r0 = move-exception;
        throw r0;
    L_0x0290:
        r0 = move-exception;
        throw r0;
    L_0x0292:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0294 }
    L_0x0294:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0296 }
    L_0x0296:
        r0 = move-exception;
        throw r0;
    L_0x0298:
        r1 = com.whatsapp.fieldstats.am.PHOTO;
        if (r4 == 0) goto L_0x0228;
    L_0x029c:
        r0 = r12.k;	 Catch:{ Exception -> 0x02ac }
        r0 = r0.w;	 Catch:{ Exception -> 0x02ac }
        if (r0 != r8) goto L_0x02ae;
    L_0x02a2:
        r1 = com.whatsapp.fieldstats.am.PTT;	 Catch:{ Exception -> 0x02ac }
    L_0x02a4:
        if (r4 == 0) goto L_0x0228;
    L_0x02a6:
        r1 = com.whatsapp.fieldstats.am.VIDEO;
        if (r4 == 0) goto L_0x0228;
    L_0x02aa:
        goto L_0x0226;
    L_0x02ac:
        r0 = move-exception;
        throw r0;
    L_0x02ae:
        r1 = com.whatsapp.fieldstats.am.AUDIO;
        goto L_0x02a4;
    L_0x02b1:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x02b3 }
    L_0x02b3:
        r0 = move-exception;
        throw r0;
    L_0x02b5:
        r0 = move-exception;
        throw r0;
    L_0x02b7:
        r0 = move-exception;
        throw r0;
    L_0x02b9:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x02bb }
    L_0x02bb:
        r0 = move-exception;
        throw r0;
    L_0x02bd:
        r0 = r9;
        goto L_0x027d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avq.a(com.whatsapp.rk):void");
    }

    public MediaData d() {
        return this.g;
    }

    protected void onCancelled() {
        Log.i(z[22] + this.k.e);
        a(rk.CANCEL);
    }

    public avq(b bVar, long j) {
        this(bVar, 0, false);
    }

    public static boolean a(b bVar) {
        return l.containsKey(bVar.e) || m.containsKey(bVar.e);
    }

    static void a(avq com_whatsapp_avq, String str) {
        com_whatsapp_avq.a(str);
    }

    static va a(avq com_whatsapp_avq, va vaVar) {
        com_whatsapp_avq.b = vaVar;
        return vaVar;
    }

    public void onPostExecute(Object obj) {
        a((rk) obj);
    }

    public void onProgressUpdate(Object[] objArr) {
        a((Integer[]) objArr);
    }

    public static void j() {
        int i = App.az;
        Log.i(z[6] + m.size() + z[5] + l.size());
        avq[] com_whatsapp_avqArr = (avq[]) m.values().toArray(new avq[0]);
        int length = com_whatsapp_avqArr.length;
        int i2 = 0;
        while (i2 < length) {
            com_whatsapp_avqArr[i2].a(false);
            i2++;
            if (i != 0) {
                break;
            }
        }
        m.clear();
        com_whatsapp_avqArr = (avq[]) l.values().toArray(new avq[0]);
        length = com_whatsapp_avqArr.length;
        i2 = 0;
        while (i2 < length) {
            com_whatsapp_avqArr[i2].a(false);
            i2++;
            if (i != 0) {
                break;
            }
        }
        l.clear();
    }

    static TimerTask b(avq com_whatsapp_avq) {
        return com_whatsapp_avq.r;
    }

    public b g() {
        return this.k;
    }

    public void b() {
        Log.i(z[3] + this.k.e + z[4] + m.size() + z[2] + l.size());
        if (m.size() > 10) {
            l.put(this.k.e, this);
            if (App.az == 0) {
                return;
            }
        }
        m.put(this.k.e, this);
        this.o = System.currentTimeMillis();
        a5w.a(new tz(this), new Void[0]);
    }

    protected String f() {
        return f.a(this.g.file);
    }

    static Object h() {
        return e;
    }

    protected long k() {
        return this.g.file.length();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r7) {
        /*
        r6_this = this;
        r4 = 1;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r6.k;
        r1 = r1.e;
        r0 = r0.append(r1);
        r1 = z;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r0 = r0.append(r7);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = new com.whatsapp.b6;
        r0.<init>(r6);
        r1 = r6.k;
        r1 = r1.e;
        r1 = r1.c;
        r0.a = r1;
        r2 = r6.k();
        r0.b = r2;
        r1 = r6.k;
        r1 = r1.j;
        r1 = com.whatsapp.protocol.b.a(r1);
        r0.f = r1;
        r0.d = r7;
        r1 = r6.k;
        r1 = r1.z;
        if (r1 != 0) goto L_0x0057;
    L_0x004f:
        r1 = r6.k;
        r1.z = r7;
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0067;
    L_0x0057:
        r1 = r6.k;
        r1 = r1.z;
        r1 = r1.equals(r7);
        if (r1 != 0) goto L_0x0067;
    L_0x0061:
        r1 = r6.k;
        r1 = r1.z;
        r0.e = r1;
    L_0x0067:
        r1 = r6.k;
        r1 = r1.j;
        r2 = 2;
        if (r1 != r2) goto L_0x0084;
    L_0x006e:
        r1 = r6.k;
        r1 = r1.w;
        if (r1 != r4) goto L_0x0084;
    L_0x0074:
        r1 = r0.d;
        if (r1 == 0) goto L_0x0084;
    L_0x0078:
        r1 = r0.e;
        if (r1 == 0) goto L_0x0084;
    L_0x007c:
        r1 = r0.e;
        r2 = r0.d;
        r0.e = r2;
        r0.d = r1;
    L_0x0084:
        r1 = new com.whatsapp.od;
        r1.<init>(r6);
        r6.r = r1;
        r1 = q;
        r2 = r6.r;
        r4 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r1.schedule(r2, r4);
        com.whatsapp.App.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avq.a(java.lang.String):void");
    }

    public void a() {
        a(true);
    }

    static void a(avq com_whatsapp_avq, Object[] objArr) {
        com_whatsapp_avq.publishProgress(objArr);
    }

    protected int e() {
        return 16384;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Integer[] r11) {
        /*
        r10_this = this;
        r8 = 0;
        r6 = 0;
        r0 = r11[r6];
        r0 = r0.intValue();
        r1 = r10.p;
        r1 = r0 - r1;
        r2 = (long) r1;
        com.whatsapp.d7.a(r2, r6);
        r10.p = r0;
        r1 = r10.i;
        if (r1 != 0) goto L_0x0038;
    L_0x0017:
        r2 = r10.h;
        r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r1 == 0) goto L_0x002c;
    L_0x001d:
        r1 = r10.g;
        r2 = (long) r0;
        r4 = 100;
        r2 = r2 * r4;
        r4 = r10.h;
        r2 = r2 / r4;
        r1.progress = r2;
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0030;
    L_0x002c:
        r0 = r10.g;
        r0.progress = r8;
    L_0x0030:
        r0 = com.whatsapp.App.aJ;
        r1 = r10.k;
        r2 = -1;
        r0.a(r1, r6, r2);
    L_0x0038:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avq.a(java.lang.Integer[]):void");
    }

    static {
        String[] strArr = new String[23];
        String str = "{`Ry\u0014cuZ\u007f\u0014r*Du\u0004c`Ed\u0000fiYq\u00116";
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
                        i3 = 22;
                        break;
                    case ay.f /*1*/:
                        i3 = 5;
                        break;
                    case ay.n /*2*/:
                        i3 = 54;
                        break;
                    case ay.p /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 117;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "6uS~\u0011\u007fkQ*";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "{`Ry\u0014cuZ\u007f\u0014r*Ed\u0014dq\u0016";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "6fCb\u0007skB*";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    str = "6uS~\u0011\u007fkQ*";
                    obj = 4;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "{`Ry\u0014cuZ\u007f\u0014r*Uq\u001bu`Zq\u0019z%Ue\u0007d`XdO";
                    obj = 5;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "{`Ry\u0014cuZ\u007f\u0014r*Uq\u001bu`Z0";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "{`Ry\u0014cuZ\u007f\u0014r*Sb\u0007yw\u0016";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "{`Ry\u0014cuZ\u007f\u0014r*_\u007fXswD\u007f\u00076";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "{`Ry\u0014cuZ\u007f\u0014r*^d\u0001f`Db\u001ad%";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "6wSc\u0000zq\f";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "{`Ry\u0014cuZ\u007f\u0014r*S~\u00119kYdUbm_cU";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "{`Ry\u0014cuZ\u007f\u0014r*[y\u0006elXwU}`OcU\u007fk\u0016e\u0005zjWtUd`Ee\u0019b";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "{`Ry\u0014cuZ\u007f\u0014r*S~\u00116";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "{`Ry\u0014cuZ\u007f\u0014r*Cb\u00199kY=\u001dyvB";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    str = "upDb\u0010xq\f";
                    obj = 15;
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    strArr2 = strArr3;
                    str = "{`Ry\u0014cuZ\u007f\u0014r*\u0016|\u001audZO\u001dwv^*";
                    obj = 16;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "{`Ry\u0014cuZ\u007f\u0014r*\u0016c\u0010dsSb*~dExU{lEc\u001cxb";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "6vSb\u0003swix\u0014em\f";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "{`Ry\u0014cuZ\u007f\u0014r*Cb\u00199`Db\u001ad%";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "6uS~\u0011\u007fkQ*";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "{`Ry\u0014cuZ\u007f\u0014r*Y~\u0016wkUu\u0019z`R0";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    z = strArr3;
                    q = new Timer();
                    m = new LinkedHashMap();
                    l = new LinkedHashMap();
                    e = new Object();
                default:
                    strArr2[i] = str;
                    str = "6mWc\u001d,";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected w1 i() {
        return new s6(this.g.file);
    }

    public avq(b bVar, long j, boolean z) {
        this.d = false;
        this.j = System.currentTimeMillis();
        this.f = j;
        this.k = bVar;
        this.g = (MediaData) bVar.A;
        this.h = bVar.k;
        this.p = 0;
        this.i = z;
        if (!z) {
            bVar.a = 1;
            this.g.transferring = true;
            this.g.progress = 0;
            if (bVar.j == (byte) 1 && this.g.file == null) {
                this.g.autodownloadRetryEnabled = false;
            }
            App.aJ.a(bVar, false, -1);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.rk a(java.lang.Void[] r9) {
        /*
        r8_this = this;
        r0 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x0010 }
        com.whatsapp.util.f.a(r0);	 Catch:{ IOException -> 0x0010 }
        r0 = r8.b;	 Catch:{ IOException -> 0x0010 }
        if (r0 != 0) goto L_0x0017;
    L_0x0009:
        r0 = r8.d;	 Catch:{ IOException -> 0x0010 }
        if (r0 == 0) goto L_0x0014;
    L_0x000d:
        r0 = com.whatsapp.rk.SUCCESS;	 Catch:{ IOException -> 0x0012 }
    L_0x000f:
        return r0;
    L_0x0010:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0012 }
    L_0x0012:
        r0 = move-exception;
        throw r0;
    L_0x0014:
        r0 = com.whatsapp.rk.FAILED_GENERIC;
        goto L_0x000f;
    L_0x0017:
        r0 = r8.b;	 Catch:{ IOException -> 0x0044, HttpException -> 0x0076, Exception -> 0x00a8 }
        r0 = r0.b();	 Catch:{ IOException -> 0x0044, HttpException -> 0x0076, Exception -> 0x00a8 }
        r1 = r8.b;	 Catch:{ IOException -> 0x0044, HttpException -> 0x0076, Exception -> 0x00a8 }
        r1 = r1.a();	 Catch:{ IOException -> 0x0044, HttpException -> 0x0076, Exception -> 0x00a8 }
        r2 = 415; // 0x19f float:5.82E-43 double:2.05E-321;
        if (r1 != r2) goto L_0x002a;
    L_0x0027:
        r0 = com.whatsapp.rk.FAILED_BAD_MEDIA;	 Catch:{ IOException -> 0x0044, HttpException -> 0x0076, Exception -> 0x00a8 }
        goto L_0x000f;
    L_0x002a:
        r2 = r8.f;	 Catch:{ IOException -> 0x0044, HttpException -> 0x0076, Exception -> 0x00a8 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0044, HttpException -> 0x0076, Exception -> 0x00a8 }
        r6 = r8.j;	 Catch:{ IOException -> 0x0044, HttpException -> 0x0076, Exception -> 0x00a8 }
        r4 = r4 - r6;
        r2 = r2 - r4;
        r4 = 0;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x003d;
    L_0x003a:
        java.lang.Thread.sleep(r2);	 Catch:{ IOException -> 0x0042, HttpException -> 0x0076, Exception -> 0x00a8 }
    L_0x003d:
        if (r0 == 0) goto L_0x00a4;
    L_0x003f:
        r0 = com.whatsapp.rk.SUCCESS;	 Catch:{ IOException -> 0x0074, HttpException -> 0x0076, Exception -> 0x00a8 }
        goto L_0x000f;
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0044, HttpException -> 0x0076, Exception -> 0x00a8 }
    L_0x0044:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r8.k;
        r2 = r2.e;
        r1 = r1.append(r2);
        r2 = " ";
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x0071:
        r0 = com.whatsapp.rk.FAILED_GENERIC;
        goto L_0x000f;
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0044, HttpException -> 0x0076, Exception -> 0x00a8 }
    L_0x0076:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r8.k;
        r2 = r2.e;
        r1 = r1.append(r2);
        r2 = " ";
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0071;
    L_0x00a4:
        r0 = com.whatsapp.rk.FAILED_GENERIC;	 Catch:{ IOException -> 0x0044, HttpException -> 0x0076, Exception -> 0x00a8 }
        goto L_0x000f;
    L_0x00a8:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r8.k;
        r2 = r2.e;
        r1 = r1.append(r2);
        r2 = " ";
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0071;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avq.a(java.lang.Void[]):com.whatsapp.rk");
    }

    public avq(b bVar) {
        this(bVar, 0);
    }

    static va a(avq com_whatsapp_avq) {
        return com_whatsapp_avq.b;
    }

    static boolean a(avq com_whatsapp_avq, boolean z) {
        com_whatsapp_avq.a = z;
        return z;
    }
}
