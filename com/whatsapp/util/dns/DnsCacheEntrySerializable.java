package com.whatsapp.util.dns;

import com.whatsapp.util.Log;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class DnsCacheEntrySerializable implements Serializable {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    private final Long expirationTime;
    private final boolean forceOverride;
    private final InetAddress inetAddress;
    private final Short portNumber;
    private final boolean secureSocket;

    static {
        String[] strArr = new String[4];
        String str = "\u0019\u001d,\u001b+\u001c+Nn\u0006n+,\u001ejH\r";
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
                        i3 = 60;
                        break;
                    case ay.f /*1*/:
                        i3 = 110;
                        break;
                    case ay.n /*2*/:
                        i3 = 22;
                        break;
                    case ay.p /*3*/:
                        i3 = 62;
                        break;
                    default:
                        i3 = 79;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "x\u0000e}._\u0006s{!H\u001com*N\u0007wR&F\u000ftR*\u0013\u001ewL<Y(wR#^\u000fuU\u0006L=bL&R\t9\u001b<";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "x\u0000e}._\u0006s{!H\u001com*N\u0007wR&F\u000ftR*\u0013\u001ewL<Y(wR#^\u000fuU\u0006L=bL&R\t9\u001b<";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "`\u0012";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Short getPortNumber() {
        return this.portNumber;
    }

    public static DnsCacheEntrySerializable parseFallbackIpString(String str) {
        Throwable e;
        if (str == null) {
            return null;
        }
        String[] split = str.split(z[1], 6);
        try {
            if (split.length != 6) {
                Log.b(z[2], null, new Object[]{str});
                return null;
            }
            try {
                InetAddress byName = InetAddress.getByName(split[0]);
                short parseShort = Short.parseShort(split[1]);
                long parseLong = Long.parseLong(split[2]);
                long parseLong2 = Long.parseLong(split[3]);
                return new DnsCacheEntrySerializable(Long.valueOf((parseLong + parseLong2) * 1000), byName, Short.valueOf(parseShort), Boolean.parseBoolean(split[4]), Boolean.parseBoolean(split[5]));
            } catch (NumberFormatException e2) {
                e = e2;
                Log.b(z[3], e, new Object[]{str});
                return null;
            } catch (UnknownHostException e3) {
                e = e3;
                Log.b(z[3], e, new Object[]{str});
                return null;
            }
        } catch (NumberFormatException e4) {
            throw e4;
        }
    }

    public InetSocketAddress getInetSocketAddress() {
        try {
            if (this.inetAddress != null) {
                if (this.portNumber != null) {
                    try {
                        return new InetSocketAddress(this.inetAddress, this.portNumber.shortValue());
                    }
                }
            }
            return null;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
        r3_this = this;
        r0 = 0;
        if (r4 == 0) goto L_0x0007;
    L_0x0003:
        r1 = r4 instanceof com.whatsapp.util.dns.DnsCacheEntrySerializable;	 Catch:{ NumberFormatException -> 0x0008 }
        if (r1 != 0) goto L_0x000a;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r4 = (com.whatsapp.util.dns.DnsCacheEntrySerializable) r4;
        r1 = r3.expirationTime;	 Catch:{ NumberFormatException -> 0x004a }
        r2 = r4.expirationTime;	 Catch:{ NumberFormatException -> 0x004a }
        if (r1 == r2) goto L_0x0020;
    L_0x0012:
        r1 = r3.expirationTime;	 Catch:{ NumberFormatException -> 0x004c }
        if (r1 == 0) goto L_0x0007;
    L_0x0016:
        r1 = r3.expirationTime;	 Catch:{ NumberFormatException -> 0x004e }
        r2 = r4.expirationTime;	 Catch:{ NumberFormatException -> 0x004e }
        r1 = r1.equals(r2);	 Catch:{ NumberFormatException -> 0x004e }
        if (r1 == 0) goto L_0x0007;
    L_0x0020:
        r1 = r3.inetAddress;	 Catch:{ NumberFormatException -> 0x0050 }
        r2 = r4.inetAddress;	 Catch:{ NumberFormatException -> 0x0050 }
        if (r1 == r2) goto L_0x0034;
    L_0x0026:
        r1 = r3.inetAddress;	 Catch:{ NumberFormatException -> 0x0052 }
        if (r1 == 0) goto L_0x0007;
    L_0x002a:
        r1 = r3.inetAddress;	 Catch:{ NumberFormatException -> 0x0054 }
        r2 = r4.inetAddress;	 Catch:{ NumberFormatException -> 0x0054 }
        r1 = r1.equals(r2);	 Catch:{ NumberFormatException -> 0x0054 }
        if (r1 == 0) goto L_0x0007;
    L_0x0034:
        r1 = r3.portNumber;	 Catch:{ NumberFormatException -> 0x0056 }
        r2 = r4.portNumber;	 Catch:{ NumberFormatException -> 0x0056 }
        if (r1 == r2) goto L_0x0048;
    L_0x003a:
        r1 = r3.portNumber;	 Catch:{ NumberFormatException -> 0x0058 }
        if (r1 == 0) goto L_0x0007;
    L_0x003e:
        r1 = r3.portNumber;	 Catch:{ NumberFormatException -> 0x005a }
        r2 = r4.portNumber;	 Catch:{ NumberFormatException -> 0x005a }
        r1 = r1.equals(r2);	 Catch:{ NumberFormatException -> 0x005a }
        if (r1 == 0) goto L_0x0007;
    L_0x0048:
        r0 = 1;
        goto L_0x0007;
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.dns.DnsCacheEntrySerializable.equals(java.lang.Object):boolean");
    }

    public boolean isForceOverride() {
        return this.forceOverride;
    }

    public int hashCode() {
        int i = 0;
        try {
            int hashCode = ((this.expirationTime != null ? this.expirationTime.hashCode() : 0) + 41) * 41;
            try {
                int hashCode2;
                if (this.inetAddress != null) {
                    hashCode2 = this.inetAddress.hashCode();
                } else {
                    hashCode2 = 0;
                }
                hashCode2 = (hashCode2 + hashCode) * 41;
                try {
                    if (this.portNumber != null) {
                        i = this.portNumber.hashCode();
                    }
                    return hashCode2 + i;
                } catch (NumberFormatException e) {
                    throw e;
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public boolean isExpired() {
        try {
            if (this.expirationTime != null) {
                if (System.currentTimeMillis() >= this.expirationTime.longValue()) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public Long getExpirationTime() {
        return this.expirationTime;
    }

    public boolean isSecureSocket() {
        return this.secureSocket;
    }

    public DnsCacheEntrySerializable(Long l, InetAddress inetAddress) {
        this(l, inetAddress, null, false, false);
    }

    public InetAddress getInetAddress() {
        return this.inetAddress;
    }

    public DnsCacheEntrySerializable(Long l, InetAddress inetAddress, Short sh, boolean z, boolean z2) {
        this.expirationTime = l;
        this.inetAddress = inetAddress;
        this.portNumber = sh;
        this.secureSocket = z;
        this.forceOverride = z2;
    }

    public String toString() {
        return String.format(z[0], new Object[]{this.inetAddress, this.portNumber, this.expirationTime});
    }
}
