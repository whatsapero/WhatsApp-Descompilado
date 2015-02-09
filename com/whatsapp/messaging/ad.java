package com.whatsapp.messaging;

import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public final class ad extends a7 {
    private static final X509Certificate[] c;
    private static final TrustManager[] d;
    private static ad e;
    private static final String[] z;

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return super.createSocket(socket, str, i, z);
    }

    public Socket createSocket(String str, int i) {
        return super.createSocket(str, i);
    }

    static X509Certificate[] a() {
        return c;
    }

    public static ad b() {
        return e;
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return super.createSocket(inetAddress, i, inetAddress2, i2);
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        return super.createSocket(inetAddress, i);
    }

    public Socket createSocket() {
        return super.createSocket();
    }

    public String[] getDefaultCipherSuites() {
        return super.getDefaultCipherSuites();
    }

    protected SSLSocketFactory a(SSLContext sSLContext) {
        try {
            sSLContext.init(null, d, null);
            return sSLContext.getSocketFactory();
        } catch (Throwable e) {
            Log.c(e);
            throw new RuntimeException(e);
        }
    }

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r9 = 35;
        r7 = 34;
        r8 = 14;
        r4 = 1;
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "wZ<B\u001b";
        r0 = -1;
        r5 = r3;
        r6 = r3;
        r3 = r1;
    L_0x0011:
        r2 = r2.toCharArray();
        r10 = r2.length;
        r11 = r10;
        r12 = r1;
        r10 = r2;
    L_0x0019:
        if (r11 > r12) goto L_0x0085;
    L_0x001b:
        r2 = new java.lang.String;
        r2.<init>(r10);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x0030;
            default: goto L_0x0027;
        };
    L_0x0027:
        r5[r3] = r2;
        r0 = "\u000f#WB\u000e`K=&m\u0002M?=wkH3,bvKWB\u000e\u000f#p\"jkMO\u0015`aO\u0016.`c_?\u0018gsW0$LxG\u0012\u0019@lO+*e`_;\u0018D@}\u0002%gcg8\bmtL;\fwe? \u0007Aeb>5{h>p&exf\u0018(OIW\"=S@<N\bwOXJ\u000b\u0011\u001bw\u001b\u0015fzC8:dc?/*`JC59Nd}\u001b:mNm\u0014>PkK\u0016\u001az[:\u0002!wctp-DlX8.PvB<5K@I\u0016+yzDJ&fl}#7mXG>&DwIC\u001cBu@O&exf\u0018(OIW\"=S@<N\brzXJ\u000ed\u001bwp\u000e{p;7<fUF\r6gt_++fZf\u0015\u000bkpy5\u0006\u001bTjI\u000b\u0010n` \u0007Aeb\u00105{h>6\u0002mTl)W[kJ;\naEe\u000b\u0007HKIpVT\u0012L9>fuK-\u0003VxcC.GOH\t\u000etlb\u0019\u0001rWWHVWoLN7gveO\"g{w4\u0005bUC.\u0004\u0012lH\u00157gvKO\"g{wp!Icy7;H\u0013@<\u0000TEl\t\u0017ifO\u0013-DlX8.@vIK5K@I\u0016+yzDJ&exf\u0018(OIW\"=S@<N\bwOXJ\u000b\u0011\u001bwp\u000eYgV7-veOK:faf7 uOH\t\u000evlb\u0019\u0001rQG?\u0003V{wN\u0017mvO\u0000-DlX8.PvB<5K@I\u0016+yzDJ&fl}p6{lt3+jE[=VPCY4ZjdT\u0012\rdNe#7qRlH[DsV,_Be7\u0003\u000e{p;7<fUF\r6gt_++fZf\u0015\u000bkpyp J\u001ax\u001e\\G\u0011B\u00145K@I\u0016\u0005yzDJ#Nlx\u0018<\u001bZG>.F`i\u0011\u001eKIg=VT\u0012L9>fuK-\u0003VxcC.GOH\t\u000etlbp\fMs{#]\u001aVC3(EoOJ(`q\u007f=<j@=>>f`O+:bc:=!bfM8\u0006riL\u001d>gmA\u0014'h\u0017o\f&txD,^\u0015TWp\u000bb\u0015;M\u001bM\u0010X/\u000byx[\u0019 atV\u0019Y\u0016E<*)[vV\u001e\"TXt\u0010\u001cUwI0XptM9<qPM\u0016YYD@K<owt\u0017^mx7p8OO~ \u000bqhK\u0003_Hv\\\u0002>A\u0015V8\u0007us9U\u0001kI>K\u0017`\tW>\bHpa18YI< @n\rX\"\u0018Ar9(\tyjCJ[\u0014s]p\u0019\u0017FeQ!Lq!\u0000\fMUl4+V\t7M\rJ\u0017~C\u0018jfO+.aoOJ(`q\u007f=<j@=>>f`L+:bc:=-bfzU:d\u001bxp:iqT)8j\u0016A8Vo\tE\"&sSk9\bE{|\u0002DIdt\u000f\b\u0015gG6#dcM5;A\u0010a-'\bJk+,\u0012W%\u0017!Q\u0012F +Yv{p&zgT\u0015+ihE*;fHb\u00189vH^C:mt%\u00178Tf;7\u0003n\rC\u000e\u001cR\u0010o\u0000<JeCO\rvoC\u0010[rQ}\u0002\u001cLFw\u001b\u0002fUMp8\frA\u000f5\u0015Nm\u001dZhVtBW\u0016JT\u0015Do\u0015z\u001e*Z\u001aYC9Jj>*\u000b)\u000f#WB\u000eg@>O`g\\.&ekM;;f\u000f#WB\u000e";
        r2 = r0;
        r3 = r4;
        r5 = r6;
        r0 = r1;
        goto L_0x0011;
    L_0x0030:
        r5[r3] = r2;
        z = r6;
        r0 = "z O_\u001a";	 Catch:{ CertificateException -> 0x00b9 }
        r0 = r0.toCharArray();
        r2 = r0.length;
        r3 = r2;
        r5 = r1;
        r2 = r0;
    L_0x003e:
        if (r3 > r5) goto L_0x009f;
    L_0x0040:
        r0 = new java.lang.String;
        r0.<init>(r2);
        r0 = r0.intern();
        r0 = java.security.cert.CertificateFactory.getInstance(r0);	 Catch:{ CertificateException -> 0x00b9 }
        r2 = new java.io.ByteArrayInputStream;	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        r3 = z;	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        r5 = 1;	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        r3 = r3[r5];	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        r5 = z;	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        r6 = 0;	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        r5 = r5[r6];	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        r3 = r3.getBytes(r5);	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        r2.<init>(r3);	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        r0 = r0.generateCertificates(r2);	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        r2 = r0.size();	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        r2 = new java.security.cert.X509Certificate[r2];	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        r0 = r0.toArray(r2);	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        r0 = (java.security.cert.X509Certificate[]) r0;	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        c = r0;	 Catch:{ CertificateException -> 0x00c0, UnsupportedEncodingException -> 0x00c7 }
        r0 = new javax.net.ssl.TrustManager[r4];
        r2 = new com.whatsapp.messaging.y;
        r2.<init>();
        r0[r1] = r2;
        d = r0;
        r0 = new com.whatsapp.messaging.ad;
        r0.<init>();
        e = r0;
        return;
    L_0x0085:
        r13 = r10[r12];
        r2 = r12 % 5;
        switch(r2) {
            case 0: goto L_0x0095;
            case 1: goto L_0x0097;
            case 2: goto L_0x0099;
            case 3: goto L_0x009c;
            default: goto L_0x008c;
        };
    L_0x008c:
        r2 = r9;
    L_0x008d:
        r2 = r2 ^ r13;
        r2 = (char) r2;
        r10[r12] = r2;
        r2 = r12 + 1;
        r12 = r2;
        goto L_0x0019;
    L_0x0095:
        r2 = r7;
        goto L_0x008d;
    L_0x0097:
        r2 = r8;
        goto L_0x008d;
    L_0x0099:
        r2 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        goto L_0x008d;
    L_0x009c:
        r2 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        goto L_0x008d;
    L_0x009f:
        r6 = r2[r5];
        r0 = r5 % 5;
        switch(r0) {
            case 0: goto L_0x00af;
            case 1: goto L_0x00b1;
            case 2: goto L_0x00b3;
            case 3: goto L_0x00b6;
            default: goto L_0x00a6;
        };
    L_0x00a6:
        r0 = r9;
    L_0x00a7:
        r0 = r0 ^ r6;
        r0 = (char) r0;
        r2[r5] = r0;
        r0 = r5 + 1;
        r5 = r0;
        goto L_0x003e;
    L_0x00af:
        r0 = r7;
        goto L_0x00a7;
    L_0x00b1:
        r0 = r8;
        goto L_0x00a7;
    L_0x00b3:
        r0 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        goto L_0x00a7;
    L_0x00b6:
        r0 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        goto L_0x00a7;
    L_0x00b9:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x00c0:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x00c7:
        r0 = move-exception;
        r1 = new java.lang.Error;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ad.<clinit>():void");
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return super.createSocket(str, i, inetAddress, i2);
    }

    public String[] getSupportedCipherSuites() {
        return super.getSupportedCipherSuites();
    }
}
