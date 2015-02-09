package com.whatsapp;

import android.content.Context;
import android.support.v4.app.NotificationManagerCompat;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import java.util.LinkedList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class a5n implements asm {
    private static a5n a;
    private static final String[] z;
    private LinkedList b;

    public void a(b bVar) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void d() {
        /*
        r6_this = this;
        r4 = 0;
        monitor-enter(r6);
        r0 = r6.b;	 Catch:{ all -> 0x006a }
        if (r0 != 0) goto L_0x0066;
    L_0x0007:
        r0 = com.whatsapp.App.p;	 Catch:{ all -> 0x006a }
        r1 = z;	 Catch:{ all -> 0x006a }
        r2 = 19;
        r1 = r1[r2];	 Catch:{ all -> 0x006a }
        r2 = 0;
        r0 = r0.getSharedPreferences(r1, r2);	 Catch:{ all -> 0x006a }
        r1 = z;	 Catch:{ all -> 0x006a }
        r2 = 18;
        r1 = r1[r2];	 Catch:{ all -> 0x006a }
        r2 = 0;
        r0 = r0.getLong(r1, r2);	 Catch:{ all -> 0x006a }
        r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0031;
    L_0x0024:
        r2 = com.whatsapp.App.aJ;	 Catch:{ SecurityException -> 0x0068 }
        r3 = 0;
        r2 = r2.a(r0, r3);	 Catch:{ SecurityException -> 0x0068 }
        r6.b = r2;	 Catch:{ SecurityException -> 0x0068 }
        r2 = com.whatsapp.App.az;	 Catch:{ SecurityException -> 0x0068 }
        if (r2 == 0) goto L_0x0038;
    L_0x0031:
        r2 = new java.util.LinkedList;	 Catch:{ SecurityException -> 0x0068 }
        r2.<init>();	 Catch:{ SecurityException -> 0x0068 }
        r6.b = r2;	 Catch:{ SecurityException -> 0x0068 }
    L_0x0038:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x006a }
        r2.<init>();	 Catch:{ all -> 0x006a }
        r3 = z;	 Catch:{ all -> 0x006a }
        r4 = 17;
        r3 = r3[r4];	 Catch:{ all -> 0x006a }
        r2 = r2.append(r3);	 Catch:{ all -> 0x006a }
        r3 = r6.b;	 Catch:{ all -> 0x006a }
        r3 = r3.size();	 Catch:{ all -> 0x006a }
        r2 = r2.append(r3);	 Catch:{ all -> 0x006a }
        r3 = z;	 Catch:{ all -> 0x006a }
        r4 = 20;
        r3 = r3[r4];	 Catch:{ all -> 0x006a }
        r2 = r2.append(r3);	 Catch:{ all -> 0x006a }
        r0 = r2.append(r0);	 Catch:{ all -> 0x006a }
        r0 = r0.toString();	 Catch:{ all -> 0x006a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x006a }
    L_0x0066:
        monitor-exit(r6);
        return;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5n.d():void");
    }

    public synchronized void b() {
        try {
            if (!(this.b == null || this.b.isEmpty())) {
                Log.i(z[0] + this.b.size());
                App.p.getSharedPreferences(z[2], 0).edit().remove(z[1]).commit();
                this.b = new LinkedList();
                NotificationManagerCompat.from(App.p).cancel(7);
                App.p.U().post(new a8u(this));
            }
        } catch (SecurityException e) {
            throw e;
        } catch (Throwable th) {
        }
    }

    public void a(Context context, b bVar) {
        d();
        if (this.b.isEmpty()) {
            App.p.getSharedPreferences(z[16], 0).edit().putLong(z[15], bVar.D).commit();
        }
        this.b.add(0, bVar);
        a(context, false);
        App.p.U().post(new a3w(this));
    }

    public a5n() {
        App.a((asm) this);
    }

    public static a5n c() {
        return a;
    }

    public void b(b bVar) {
        try {
            if (Voip.a(bVar)) {
                a(App.p, bVar);
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    public void a(String str, long j) {
    }

    public void c(b bVar) {
        a(App.p, bVar);
    }

    public LinkedList a() {
        d();
        return this.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r13, boolean r14) {
        /*
        r12_this = this;
        r6 = 4;
        r11 = 7;
        r10 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r9 = 0;
        r8 = 1;
        r2 = com.whatsapp.App.az;
        r12.d();	 Catch:{ SecurityException -> 0x0247 }
        r0 = r12.b;	 Catch:{ SecurityException -> 0x0247 }
        r0 = r0.isEmpty();	 Catch:{ SecurityException -> 0x0247 }
        if (r0 == 0) goto L_0x0039;
    L_0x0013:
        r0 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x0247 }
        r0.<init>();	 Catch:{ SecurityException -> 0x0247 }
        r1 = z;	 Catch:{ SecurityException -> 0x0247 }
        r3 = 11;
        r1 = r1[r3];	 Catch:{ SecurityException -> 0x0247 }
        r0 = r0.append(r1);	 Catch:{ SecurityException -> 0x0247 }
        r0 = r0.append(r14);	 Catch:{ SecurityException -> 0x0247 }
        r0 = r0.toString();	 Catch:{ SecurityException -> 0x0247 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SecurityException -> 0x0247 }
        r0 = com.whatsapp.App.p;	 Catch:{ SecurityException -> 0x0247 }
        r0 = android.support.v4.app.NotificationManagerCompat.from(r0);	 Catch:{ SecurityException -> 0x0247 }
        r1 = 7;
        r0.cancel(r1);	 Catch:{ SecurityException -> 0x0247 }
        if (r2 == 0) goto L_0x0246;
    L_0x0039:
        r1 = new java.util.HashSet;
        r1.<init>();
        r0 = r12.b;
        r3 = r0.iterator();
    L_0x0044:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0059;
    L_0x004a:
        r0 = r3.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r0 = r0.e;
        r0 = r0.c;
        r1.add(r0);
        if (r2 == 0) goto L_0x0044;
    L_0x0059:
        r3 = new android.support.v4.app.NotificationCompat$Builder;
        r0 = com.whatsapp.App.p;
        r3.<init>(r0);
        r0 = z;	 Catch:{ SecurityException -> 0x0249 }
        r4 = 3;
        r0 = r0[r4];	 Catch:{ SecurityException -> 0x0249 }
        r3.setCategory(r0);	 Catch:{ SecurityException -> 0x0249 }
        r0 = 1;
        r3.setPriority(r0);	 Catch:{ SecurityException -> 0x0249 }
        r0 = 2130838996; // 0x7f0205d4 float:1.728299E38 double:1.0527743447E-314;
        r3.setSmallIcon(r0);	 Catch:{ SecurityException -> 0x0249 }
        if (r14 != 0) goto L_0x007a;
    L_0x0074:
        r0 = -1;
        r3.setDefaults(r0);	 Catch:{ SecurityException -> 0x0249 }
        if (r2 == 0) goto L_0x007e;
    L_0x007a:
        r0 = 4;
        r3.setDefaults(r0);	 Catch:{ SecurityException -> 0x024b }
    L_0x007e:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r5 = 13;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r12.b;
        r4 = r4.size();
        r0 = r0.append(r4);
        r4 = z;
        r4 = r4[r6];
        r0 = r0.append(r4);
        r4 = r1.size();
        r0 = r0.append(r4);
        r4 = " ";
        r0 = r0.append(r4);
        r0 = r0.append(r14);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r1.size();
        if (r0 != r8) goto L_0x0179;
    L_0x00be:
        r0 = r1.iterator();
        r0 = r0.next();
        r0 = (java.lang.String) r0;
        r1 = com.whatsapp.App.P;
        r1 = r1.a(r0);
        r4 = r12.b;	 Catch:{ SecurityException -> 0x024d }
        r4 = r4.size();	 Catch:{ SecurityException -> 0x024d }
        if (r4 != r8) goto L_0x00e4;
    L_0x00d6:
        r4 = com.whatsapp.App.p;	 Catch:{ SecurityException -> 0x024d }
        r5 = 2131624540; // 0x7f0e025c float:1.8876263E38 double:1.053162455E-314;
        r4 = r4.getString(r5);	 Catch:{ SecurityException -> 0x024d }
        r3.setContentTitle(r4);	 Catch:{ SecurityException -> 0x024d }
        if (r2 == 0) goto L_0x010a;
    L_0x00e4:
        r4 = com.whatsapp.App.aX;	 Catch:{ SecurityException -> 0x024f }
        r5 = 2131558424; // 0x7f0d0018 float:1.8742163E38 double:1.0531297894E-314;
        r6 = r12.b;	 Catch:{ SecurityException -> 0x024f }
        r6 = r6.size();	 Catch:{ SecurityException -> 0x024f }
        r4 = r4.a(r5, r6);	 Catch:{ SecurityException -> 0x024f }
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ SecurityException -> 0x024f }
        r6 = 0;
        r7 = r12.b;	 Catch:{ SecurityException -> 0x024f }
        r7 = r7.size();	 Catch:{ SecurityException -> 0x024f }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ SecurityException -> 0x024f }
        r5[r6] = r7;	 Catch:{ SecurityException -> 0x024f }
        r4 = java.lang.String.format(r4, r5);	 Catch:{ SecurityException -> 0x024f }
        r3.setContentTitle(r4);	 Catch:{ SecurityException -> 0x024f }
    L_0x010a:
        r4 = com.whatsapp.App.p;
        r5 = 2131624542; // 0x7f0e025e float:1.8876267E38 double:1.053162456E-314;
        r6 = new java.lang.Object[r8];
        r7 = r1.a(r13);
        r6[r9] = r7;
        r4 = r4.getString(r5, r6);
        r3.setTicker(r4);
        r4 = r1.a(r13);
        r3.setContentText(r4);
        r4 = new android.content.Intent;
        r5 = com.whatsapp.App.p;
        r6 = com.whatsapp.VoipActivity.class;
        r4.<init>(r5, r6);
        r4.setFlags(r10);
        r5 = z;
        r5 = r5[r11];
        r4.putExtra(r5, r0);
        r0 = z;
        r5 = 12;
        r0 = r0[r5];
        r4.putExtra(r0, r8);
        r0 = com.whatsapp.App.p;
        r0 = android.app.PendingIntent.getActivity(r0, r9, r4, r10);
        r4 = 2130838780; // 0x7f0204fc float:1.7282552E38 double:1.052774238E-314;
        r5 = com.whatsapp.App.p;
        r6 = 2131624541; // 0x7f0e025d float:1.8876265E38 double:1.0531624555E-314;
        r5 = r5.getText(r6);
        r3.addAction(r4, r5, r0);
        r0 = com.whatsapp.Conversation.a(r1);
        r1 = z;
        r4 = 5;
        r1 = r1[r4];
        r0.putExtra(r1, r8);
        r1 = com.whatsapp.App.p;
        r0 = android.app.PendingIntent.getActivity(r1, r9, r0, r10);
        r1 = 2130838796; // 0x7f02050c float:1.7282584E38 double:1.052774246E-314;
        r4 = com.whatsapp.App.p;
        r5 = 2131624543; // 0x7f0e025f float:1.8876269E38 double:1.0531624565E-314;
        r4 = r4.getText(r5);
        r3.addAction(r1, r4, r0);
        if (r2 == 0) goto L_0x021c;
    L_0x0179:
        r0 = com.whatsapp.App.aX;
        r1 = 2131558424; // 0x7f0d0018 float:1.8742163E38 double:1.0531297894E-314;
        r4 = r12.b;
        r4 = r4.size();
        r0 = r0.a(r1, r4);
        r1 = new java.lang.Object[r8];
        r4 = r12.b;
        r4 = r4.size();
        r4 = java.lang.Integer.valueOf(r4);
        r1[r9] = r4;
        r0 = java.lang.String.format(r0, r1);
        r3.setContentTitle(r0);
        r4 = new java.util.HashSet;
        r4.<init>();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r0 = 44;
        r1 = java.util.Locale.getDefault();
        r1 = r1.getLanguage();
        r6 = z;	 Catch:{ SecurityException -> 0x0251 }
        r7 = 8;
        r6 = r6[r7];	 Catch:{ SecurityException -> 0x0251 }
        r6 = r6.equals(r1);	 Catch:{ SecurityException -> 0x0251 }
        if (r6 != 0) goto L_0x01d5;
    L_0x01bd:
        r6 = z;	 Catch:{ SecurityException -> 0x0251 }
        r7 = 10;
        r6 = r6[r7];	 Catch:{ SecurityException -> 0x0251 }
        r6 = r6.equals(r1);	 Catch:{ SecurityException -> 0x0251 }
        if (r6 != 0) goto L_0x01d5;
    L_0x01c9:
        r6 = z;	 Catch:{ SecurityException -> 0x0253 }
        r7 = 14;
        r6 = r6[r7];	 Catch:{ SecurityException -> 0x0253 }
        r1 = r6.equals(r1);	 Catch:{ SecurityException -> 0x0253 }
        if (r1 == 0) goto L_0x026d;
    L_0x01d5:
        r0 = 1548; // 0x60c float:2.169E-42 double:7.65E-321;
        r1 = r0;
    L_0x01d8:
        r0 = r12.b;
        r6 = r0.iterator();
    L_0x01de:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0215;
    L_0x01e4:
        r0 = r6.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r7 = r0.e;	 Catch:{ SecurityException -> 0x0255 }
        r7 = r7.c;	 Catch:{ SecurityException -> 0x0255 }
        r7 = r4.add(r7);	 Catch:{ SecurityException -> 0x0255 }
        if (r7 == 0) goto L_0x0213;
    L_0x01f4:
        r7 = r5.length();	 Catch:{ SecurityException -> 0x0255 }
        if (r7 <= 0) goto L_0x0202;
    L_0x01fa:
        r5.append(r1);	 Catch:{ SecurityException -> 0x0257 }
        r7 = 32;
        r5.append(r7);	 Catch:{ SecurityException -> 0x0257 }
    L_0x0202:
        r7 = com.whatsapp.App.P;
        r0 = r0.e;
        r0 = r0.c;
        r0 = r7.a(r0);
        r0 = r0.d();
        r5.append(r0);
    L_0x0213:
        if (r2 == 0) goto L_0x01de;
    L_0x0215:
        r0 = r5.toString();
        r3.setContentText(r0);
    L_0x021c:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.App.p;
        r2 = com.whatsapp.Main.b();
        r0.<init>(r1, r2);
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r0.setAction(r1);
        r1 = com.whatsapp.App.p;
        r0 = android.app.PendingIntent.getActivity(r1, r9, r0, r10);
        r3.setContentIntent(r0);
        r0 = r3.build();
        r1 = com.whatsapp.App.p;	 Catch:{ SecurityException -> 0x0259 }
        r1 = android.support.v4.app.NotificationManagerCompat.from(r1);	 Catch:{ SecurityException -> 0x0259 }
        r2 = 7;
        r1.notify(r2, r0);	 Catch:{ SecurityException -> 0x0259 }
    L_0x0246:
        return;
    L_0x0247:
        r0 = move-exception;
        throw r0;
    L_0x0249:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x024b }
    L_0x024b:
        r0 = move-exception;
        throw r0;
    L_0x024d:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x024f }
    L_0x024f:
        r0 = move-exception;
        throw r0;
    L_0x0251:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0253 }
    L_0x0253:
        r0 = move-exception;
        throw r0;
    L_0x0255:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0257 }
    L_0x0257:
        r0 = move-exception;
        throw r0;
    L_0x0259:
        r0 = move-exception;
        r1 = r0.toString();	 Catch:{ SecurityException -> 0x026b }
        r2 = z;	 Catch:{ SecurityException -> 0x026b }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ SecurityException -> 0x026b }
        r1 = r1.contains(r2);	 Catch:{ SecurityException -> 0x026b }
        if (r1 != 0) goto L_0x0246;
    L_0x026a:
        throw r0;	 Catch:{ SecurityException -> 0x026b }
    L_0x026b:
        r0 = move-exception;
        throw r0;
    L_0x026d:
        r1 = r0;
        goto L_0x01d8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5n.a(android.content.Context, boolean):void");
    }

    static {
        String[] strArr = new String[21];
        String str = "\rQ\u0017ET\u0004[\u0005Z]\u000eW\u0010_W\t[\u0005BX\u000fVKU]\u0005Y\u0016\u0016";
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
                        i3 = 96;
                        break;
                    case ay.f /*1*/:
                        i3 = 56;
                        break;
                    case ay.n /*2*/:
                        i3 = 100;
                        break;
                    case ay.p /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = 49;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0003W\t\u0018F\bY\u0010EP\u0010H;FC\u0005^\u0001DT\u000e[\u0001E";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0003Y\bZ";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "@[\u000bXE\u0005[\u0010E\u000b";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0006J\u000b[r\u0001T\bx^\u0014Q\u0002_R\u0001L\rY_";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0003W\t\u0018F\bY\u0010EP\u0010HJ__\u0014]\nB\u001f\u0001[\u0010_^\u000e\u0016'w},k";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\nQ\u0000";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0001J";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0001V\u0000D^\t\\JFT\u0012U\rEB\tW\n\u0018d0|%bt?y4fn/h7ib4y0e";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0006Y";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\rQ\u0017ET\u0004[\u0005Z]\u000eW\u0010_W\t[\u0005BX\u000fVKCA\u0004Y\u0010S\u0011\u0003Y\nUT\f\u0018";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0006J\u000b[r\u0001T\bx^\u0014Q\u0002_R\u0001L\rY_";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\rQ\u0017ET\u0004[\u0005Z]\u000eW\u0010_W\t[\u0005BX\u000fVKCA\u0004Y\u0010S\u0011\u0003W\u0011XEZ";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0015J";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0006Q\u0016EE?U\rEB\u0005\\;UP\fT";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0003W\t\u0018F\bY\u0010EP\u0010H;FC\u0005^\u0001DT\u000e[\u0001E";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\rQ\u0017ET\u0004[\u0005Z]\u000eW\u0010_W\t[\u0005BX\u000fVK__\tLDU^\u0015V\u0010\f";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0006Q\u0016EE?U\rEB\u0005\\;UP\fT";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0003W\t\u0018F\bY\u0010EP\u0010H;FC\u0005^\u0001DT\u000e[\u0001E";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "@L\r[T\u0013L\u0005[AZ";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new a5n();
                default:
                    strArr2[i] = str;
                    str = "\u0006Q\u0016EE?U\rEB\u0005\\;UP\fT";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
