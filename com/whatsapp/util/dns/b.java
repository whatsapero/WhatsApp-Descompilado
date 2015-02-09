package com.whatsapp.util.dns;

import android.content.Context;
import com.whatsapp.d8;
import com.whatsapp.ju;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class b {
    public static boolean c;
    private static final String[] z;
    private final HashMap a;
    @Deprecated
    private final File b;

    static {
        String[] strArr = new String[6];
        String str = "2\u0002\u0005+\u0013.\tF,\u00169\t\u0005*\u0002/MC,\u00072\t\u0005%\u001d.M";
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
                        i3 = 92;
                        break;
                    case ay.f /*1*/:
                        i3 = 109;
                        break;
                    case ay.n /*2*/:
                        i3 = 37;
                        break;
                    case ay.p /*3*/:
                        i3 = 67;
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
                    str = ".\bV,\u001e*\u0004K$R";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = ",\u001fL.\u0013.\u0014\u0005'\u001c/MW&\u00013\u0001P7\u001b3\u0003\u0005%\u00135\u0001@'R:\u0002Wc";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "/\bF,\u001c8\fW:R8\u0003Vc\u00009\u001eJ/\u0007(\u0004J-R:\fL/\u00178MC,\u0000|";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "8\u0003V\u001c\u0011=\u000eM&";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "4\fW'\u00113\t@'R5\u001d\u00051\u0017/\u0002I6\u00065\u0002Kc\u0014=\u0004I&\u0016|\u000bJ1R";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private List e(String str) {
        Object asList = Arrays.asList(InetAddress.getAllByName(str));
        a(str, asList);
        return asList;
    }

    public synchronized void a() {
        this.a.clear();
        this.b.delete();
    }

    private synchronized List a(String str) {
        List list;
        boolean z = c;
        List<DnsCacheEntrySerializable> list2 = (List) this.a.get(str);
        if (list2 == null) {
            list = null;
        } else {
            List arrayList = new ArrayList();
            Collection hashSet = new HashSet();
            for (DnsCacheEntrySerializable dnsCacheEntrySerializable : list2) {
                if (dnsCacheEntrySerializable.isExpired()) {
                    hashSet.add(dnsCacheEntrySerializable);
                    if (!z) {
                        continue;
                        if (z) {
                            break;
                        }
                    }
                }
                arrayList.add(dnsCacheEntrySerializable.getInetAddress());
                continue;
                if (z) {
                    break;
                }
            }
            list2.removeAll(hashSet);
            if (list2.isEmpty()) {
                this.a.remove(str);
            }
            list = arrayList;
        }
        return list;
    }

    public b(Context context) {
        this.b = new File(context.getCacheDir(), z[5]);
        this.a = new HashMap();
    }

    public void onEvent(ju juVar) {
        a();
    }

    private List c(String str) {
        List list = (List) d8.a.get(str);
        if (list == null || list.isEmpty()) {
            throw new UnknownHostException(z[0] + str);
        }
        a(str, list);
        return list;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List b(java.lang.String r7) {
        /*
        r6_this = this;
        r5 = 32;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r7);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r6.a(r7);
        if (r0 == 0) goto L_0x002c;
    L_0x0021:
        r1 = r0.isEmpty();	 Catch:{ UnknownHostException -> 0x0028 }
        if (r1 != 0) goto L_0x002c;
    L_0x0027:
        return r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ UnknownHostException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = r6.e(r7);	 Catch:{ UnknownHostException -> 0x0031 }
        goto L_0x0027;
    L_0x0031:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r7);
        r1 = r1.append(r5);
        r1 = r1.append(r0);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        r0 = r6.d(r7);	 Catch:{ UnknownHostException -> 0x0058 }
        goto L_0x0027;
    L_0x0058:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r7);
        r2 = r2.append(r5);
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        r0 = r6.c(r7);	 Catch:{ UnknownHostException -> 0x007f }
        goto L_0x0027;
    L_0x007f:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r7);
        r2 = r2.append(r5);
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.dns.b.b(java.lang.String):java.util.List");
    }

    private void a(String str, Iterable iterable) {
        boolean z = c;
        long currentTimeMillis = System.currentTimeMillis() + 3600000;
        ArrayList arrayList = new ArrayList();
        for (InetAddress inetAddress : iterable) {
            arrayList.add(new DnsCacheEntrySerializable(Long.valueOf(currentTimeMillis), inetAddress));
            if (z) {
                break;
            }
        }
        synchronized (this) {
            this.a.put(str, arrayList);
        }
    }

    private List d(String str) {
        boolean z = c;
        g[] a = e.a(str, 20000);
        InetAddress[] inetAddressArr = new InetAddress[a.length];
        int i = 0;
        while (i < a.length) {
            inetAddressArr[i] = a[i].b;
            i++;
            if (z) {
                break;
            }
        }
        Object asList = Arrays.asList(inetAddressArr);
        a(str, asList);
        return asList;
    }
}
