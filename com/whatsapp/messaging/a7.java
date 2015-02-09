package com.whatsapp.messaging;

import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

abstract class a7 extends SSLSocketFactory {
    private static final String[] z;
    private final SSLContext a;
    private SSLSocketFactory b;

    static {
        String[] strArr = new String[5];
        String str = "F\u000eu";
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
                        i3 = 18;
                        break;
                    case ay.f /*1*/:
                        i3 = 66;
                        break;
                    case ay.n /*2*/:
                        i3 = 38;
                        break;
                    case ay.p /*3*/:
                        i3 = 58;
                        break;
                    default:
                        i3 = 98;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "A\u0011j";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\\-\u0006Q\f}5H\u001a\u0003~%IH\u000bf*K\u001a\u0003d#OV\u0003p.C\u001a\u0016}bVH\rd+B_BA\u0011j\u001a\u0011}!M_\u0016a";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "2#J]\r`+RR\u000f2,INBs4GS\u000es J_Bt-T\u001a1A\u000eeU\ff'^NX2";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "A\u0011jLQ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static SSLContext a(SSLContext sSLContext, String str) {
        if (sSLContext == null) {
            try {
                sSLContext = SSLContext.getInstance(str);
            } catch (NoSuchAlgorithmException e) {
                Log.w(str + z[4] + e);
            }
        }
        return sSLContext;
    }

    protected abstract SSLSocketFactory a(SSLContext sSLContext);

    public Socket createSocket(String str, int i) {
        return a().createSocket(str, i);
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return a().createSocket(socket, str, i, z);
    }

    private synchronized SSLSocketFactory a() {
        try {
            if (this.b == null) {
                this.b = a(this.a);
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (Throwable th) {
        }
        return this.b;
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a().createSocket(inetAddress, i, inetAddress2, i2);
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        return a().createSocket(inetAddress, i);
    }

    public Socket createSocket() {
        return a().createSocket();
    }

    public String[] getDefaultCipherSuites() {
        return a().getDefaultCipherSuites();
    }

    protected a7() {
        SSLContext a = a(a(a(null, z[0]), z[1]), z[2]);
        if (a == null) {
            Throwable noSuchAlgorithmException = new NoSuchAlgorithmException(z[3]);
            Log.c(noSuchAlgorithmException);
            throw new RuntimeException(noSuchAlgorithmException);
        }
        this.a = a;
    }

    public String[] getSupportedCipherSuites() {
        return a().getSupportedCipherSuites();
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a().createSocket(str, i, inetAddress, i2);
    }
}
