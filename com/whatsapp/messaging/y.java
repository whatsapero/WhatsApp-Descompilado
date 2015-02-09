package com.whatsapp.messaging;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class y implements X509TrustManager {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "27\u0002*\u0015\u0015=L=Y\u001f=P=\u0010\u001a1A(\r\u0019xT,\u000b\u0015>K*\u0018\b1M'Y\f*M?\u0010\u0018=F";
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
                        i3 = 124;
                        break;
                    case ay.f /*1*/:
                        i3 = 88;
                        break;
                    case ay.n /*2*/:
                        i3 = 34;
                        break;
                    case ay.p /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "$v\u0017y@";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ",\u0013k\u0011";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    y() {
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException(z[0]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void checkServerTrusted(java.security.cert.X509Certificate[] r13, java.lang.String r14) {
        /*
        r12_this = this;
        r1 = 0;
        r2 = com.whatsapp.messaging.au.a;
        r3 = new java.util.Date;
        r3.<init>();
        r4 = r13.length;
        r0 = r1;
    L_0x000a:
        if (r0 >= r4) goto L_0x0015;
    L_0x000c:
        r5 = r13[r0];
        r5.checkValidity(r3);
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x000a;
    L_0x0015:
        r0 = z;	 Catch:{ NoSuchAlgorithmException -> 0x005b }
        r4 = 1;
        r0 = r0[r4];	 Catch:{ NoSuchAlgorithmException -> 0x005b }
        r4 = java.security.cert.CertPathValidator.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x005b }
        r0 = z;
        r5 = 2;
        r0 = r0[r5];
        r0 = java.security.cert.CertificateFactory.getInstance(r0);
        r5 = java.util.Arrays.asList(r13);
        r5 = r0.generateCertPath(r5);
        r6 = r12.getAcceptedIssuers();
        r7 = new java.util.HashSet;
        r0 = r6.length;
        r7.<init>(r0);
        r8 = r6.length;
        r0 = r1;
    L_0x003b:
        if (r0 >= r8) goto L_0x004c;
    L_0x003d:
        r9 = r6[r0];
        r10 = new java.security.cert.TrustAnchor;
        r11 = 0;
        r10.<init>(r9, r11);
        r7.add(r10);
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x003b;
    L_0x004c:
        r0 = new java.security.cert.PKIXParameters;	 Catch:{ InvalidAlgorithmParameterException -> 0x0062 }
        r0.<init>(r7);	 Catch:{ InvalidAlgorithmParameterException -> 0x0062 }
        r0.setDate(r3);
        r0.setRevocationEnabled(r1);
        r4.validate(r5, r0);	 Catch:{ CertPathValidatorException -> 0x0069, InvalidAlgorithmParameterException -> 0x0070 }
        return;
    L_0x005b:
        r0 = move-exception;
        r1 = new java.security.cert.CertificateException;
        r1.<init>(r0);
        throw r1;
    L_0x0062:
        r0 = move-exception;
        r1 = new java.security.cert.CertificateException;
        r1.<init>(r0);
        throw r1;
    L_0x0069:
        r0 = move-exception;
        r1 = new java.security.cert.CertificateException;
        r1.<init>(r0);
        throw r1;
    L_0x0070:
        r0 = move-exception;
        r1 = new java.security.cert.CertificateException;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.y.checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String):void");
    }

    public X509Certificate[] getAcceptedIssuers() {
        return ad.a();
    }
}
