package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.al;
import java.io.File;
import java.io.ObjectOutputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class d7 {
    private static File a;
    public static Statistics$Data b;
    private static final String[] z;

    static {
        String[] strArr = new String[6];
        String str = "wUD\u001f`wUL\bz$S@\u0018lp\u0001A\u001el$UJK`+N\u0005\u000eqgDU\u001f`kO\u001fK";
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
                        i3 = 4;
                        break;
                    case ay.f /*1*/:
                        i3 = 33;
                        break;
                    case ay.n /*2*/:
                        i3 = 37;
                        break;
                    case ay.p /*3*/:
                        i3 = 107;
                        break;
                    default:
                        i3 = 9;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "wUD\u001f`wUL\bz$S@\u0018lp\u0001A\u001el$UJKzaSL\nem[D\u001f`kO\u0005\baeOB\u000e3$";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "wUD\u001f`wUL\bz";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "wUD\u001f`wUL\bz$";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "aSW\u0004{$RD\u001d`jF\u0005\u0018}eUL\u0018}mBVKomM@";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "wUD\u001f`wUL\bz$S@\u0018lp\u0001A\u001el$UJKdmRV\u0002gc\u0001F\u0007hwR\u001fK";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void b(long j, int i) {
        Statistics$Data statistics$Data;
        int i2 = App.az;
        switch (i) {
            case PBE.MD5 /*0*/:
                statistics$Data = b;
                statistics$Data.rx_media_bytes += j;
                if (i2 == 0) {
                    return;
                }
                break;
            case ay.f /*1*/:
                break;
            case ay.n /*2*/:
                break;
            default:
                return;
        }
        statistics$Data = b;
        statistics$Data.rx_message_service_bytes += j;
        if (i2 == 0) {
            return;
        }
        Statistics$Data statistics$Data2 = b;
        statistics$Data2.rx_voip_bytes += j;
    }

    public static void a(b bVar) {
        Statistics$Data statistics$Data;
        long currentTimeMillis = System.currentTimeMillis() - bVar.D;
        if (currentTimeMillis > 1000) {
            Statistics$Data statistics$Data2 = b;
            currentTimeMillis += b.rx_offline_delay * b.rx_offline_msgs;
            Statistics$Data statistics$Data3 = b;
            long j = statistics$Data3.rx_offline_msgs + 1;
            statistics$Data3.rx_offline_msgs = j;
            statistics$Data2.rx_offline_delay = currentTimeMillis / j;
        }
        if (bVar.j == null) {
            statistics$Data = b;
            statistics$Data.rx_text_msgs++;
            if (App.az == 0) {
                return;
            }
        }
        statistics$Data = b;
        statistics$Data.rx_media_msgs++;
    }

    public static void b(b bVar) {
        if (bVar.j == 8) {
            Statistics$Data statistics$Data;
            if (bVar.e.b) {
                statistics$Data = b;
                statistics$Data.tx_voip_calls++;
                if (App.az == 0) {
                    return;
                }
            }
            statistics$Data = b;
            statistics$Data.rx_voip_calls++;
        }
    }

    public static void a(long j, int i) {
        Statistics$Data statistics$Data;
        int i2 = App.az;
        switch (i) {
            case PBE.MD5 /*0*/:
                statistics$Data = b;
                statistics$Data.tx_media_bytes += j;
                if (i2 == 0) {
                    return;
                }
                break;
            case ay.f /*1*/:
                break;
            case ay.n /*2*/:
                break;
            default:
                return;
        }
        statistics$Data = b;
        statistics$Data.tx_message_service_bytes += j;
        if (i2 == 0) {
            return;
        }
        Statistics$Data statistics$Data2 = b;
        statistics$Data2.tx_voip_bytes += j;
    }

    public static void a(File file) {
        a = new File(file, z[3]);
        boolean b = b();
        Handler handler = new Handler();
        handler.postDelayed(new ana(handler), 900000);
        if (!b) {
            b = new Statistics$Data(false);
        }
        Log.i(z[4] + b.toString());
    }

    public static void c(b bVar) {
        Statistics$Data statistics$Data;
        if (bVar.j == null) {
            statistics$Data = b;
            statistics$Data.tx_text_msgs++;
            if (App.az == 0) {
                return;
            }
        }
        statistics$Data = b;
        statistics$Data.tx_media_msgs++;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b() {
        /*
        r0 = 0;
        r1 = 1;
        r2 = a;
        r2 = r2.exists();
        if (r2 == 0) goto L_0x0025;
    L_0x000a:
        r3 = 0;
        r2 = new java.io.ObjectInputStream;	 Catch:{ ClassNotFoundException -> 0x0026, InvalidClassException -> 0x0052, IOException -> 0x007d }
        r0 = new java.io.FileInputStream;	 Catch:{ ClassNotFoundException -> 0x0026, InvalidClassException -> 0x0052, IOException -> 0x007d }
        r4 = a;	 Catch:{ ClassNotFoundException -> 0x0026, InvalidClassException -> 0x0052, IOException -> 0x007d }
        r0.<init>(r4);	 Catch:{ ClassNotFoundException -> 0x0026, InvalidClassException -> 0x0052, IOException -> 0x007d }
        r2.<init>(r0);	 Catch:{ ClassNotFoundException -> 0x0026, InvalidClassException -> 0x0052, IOException -> 0x007d }
        r0 = r2.readObject();	 Catch:{ ClassNotFoundException -> 0x00c5, InvalidClassException -> 0x00c2, IOException -> 0x00bf }
        r0 = (com.whatsapp.Statistics$Data) r0;	 Catch:{ ClassNotFoundException -> 0x00c5, InvalidClassException -> 0x00c2, IOException -> 0x00bf }
        b = r0;	 Catch:{ ClassNotFoundException -> 0x00c5, InvalidClassException -> 0x00c2, IOException -> 0x00bf }
        if (r2 == 0) goto L_0x0024;
    L_0x0021:
        r2.close();	 Catch:{ IOException -> 0x00b1 }
    L_0x0024:
        r0 = r1;
    L_0x0025:
        return r0;
    L_0x0026:
        r0 = move-exception;
        r2 = r3;
    L_0x0028:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00bc }
        r3.<init>();	 Catch:{ all -> 0x00bc }
        r4 = z;	 Catch:{ all -> 0x00bc }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ all -> 0x00bc }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00bc }
        r0 = r3.append(r0);	 Catch:{ all -> 0x00bc }
        r0 = r0.toString();	 Catch:{ all -> 0x00bc }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x00bc }
        r0 = new com.whatsapp.Statistics$Data;	 Catch:{ all -> 0x00bc }
        r3 = 1;
        r0.<init>(r3);	 Catch:{ all -> 0x00bc }
        b = r0;	 Catch:{ all -> 0x00bc }
        if (r2 == 0) goto L_0x004e;
    L_0x004b:
        r2.close();	 Catch:{ IOException -> 0x00b4, ClassNotFoundException -> 0x0050 }
    L_0x004e:
        r0 = r1;
        goto L_0x0025;
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r0 = move-exception;
    L_0x0053:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a8 }
        r2.<init>();	 Catch:{ all -> 0x00a8 }
        r4 = z;	 Catch:{ all -> 0x00a8 }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ all -> 0x00a8 }
        r2 = r2.append(r4);	 Catch:{ all -> 0x00a8 }
        r0 = r2.append(r0);	 Catch:{ all -> 0x00a8 }
        r0 = r0.toString();	 Catch:{ all -> 0x00a8 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x00a8 }
        r0 = new com.whatsapp.Statistics$Data;	 Catch:{ all -> 0x00a8 }
        r2 = 1;
        r0.<init>(r2);	 Catch:{ all -> 0x00a8 }
        b = r0;	 Catch:{ all -> 0x00a8 }
        if (r3 == 0) goto L_0x0079;
    L_0x0076:
        r3.close();	 Catch:{ IOException -> 0x00b6, ClassNotFoundException -> 0x007b }
    L_0x0079:
        r0 = r1;
        goto L_0x0025;
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = move-exception;
    L_0x007e:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a8 }
        r2.<init>();	 Catch:{ all -> 0x00a8 }
        r4 = z;	 Catch:{ all -> 0x00a8 }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ all -> 0x00a8 }
        r2 = r2.append(r4);	 Catch:{ all -> 0x00a8 }
        r0 = r2.append(r0);	 Catch:{ all -> 0x00a8 }
        r0 = r0.toString();	 Catch:{ all -> 0x00a8 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x00a8 }
        r0 = new com.whatsapp.Statistics$Data;	 Catch:{ all -> 0x00a8 }
        r2 = 1;
        r0.<init>(r2);	 Catch:{ all -> 0x00a8 }
        b = r0;	 Catch:{ all -> 0x00a8 }
        if (r3 == 0) goto L_0x00a4;
    L_0x00a1:
        r3.close();	 Catch:{ IOException -> 0x00b8, ClassNotFoundException -> 0x00a6 }
    L_0x00a4:
        r0 = r1;
        goto L_0x0025;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r0 = move-exception;
    L_0x00a9:
        if (r3 == 0) goto L_0x00ae;
    L_0x00ab:
        r3.close();	 Catch:{ IOException -> 0x00ba, ClassNotFoundException -> 0x00af }
    L_0x00ae:
        throw r0;
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        r0 = move-exception;
        goto L_0x0024;
    L_0x00b4:
        r0 = move-exception;
        goto L_0x004e;
    L_0x00b6:
        r0 = move-exception;
        goto L_0x0079;
    L_0x00b8:
        r0 = move-exception;
        goto L_0x00a4;
    L_0x00ba:
        r1 = move-exception;
        goto L_0x00ae;
    L_0x00bc:
        r0 = move-exception;
        r3 = r2;
        goto L_0x00a9;
    L_0x00bf:
        r0 = move-exception;
        r3 = r2;
        goto L_0x007e;
    L_0x00c2:
        r0 = move-exception;
        r3 = r2;
        goto L_0x0053;
    L_0x00c5:
        r0 = move-exception;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.d7.b():boolean");
    }

    public static void c() {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        try {
            objectOutputStream = new ObjectOutputStream(new al(App.r, a));
            try {
                objectOutputStream.writeObject(b);
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            throw th;
        }
    }

    public static void a() {
        b = new Statistics$Data(true);
        try {
            c();
        } catch (Throwable e) {
            Log.b(z[5], e);
        }
    }
}
