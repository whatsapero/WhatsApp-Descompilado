package com.whatsapp.messaging;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class a4 implements X509TrustManager {
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    a4() {
    }

    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }
}
