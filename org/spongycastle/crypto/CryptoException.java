package org.spongycastle.crypto;

public class CryptoException extends Exception {
    private Throwable cause;

    public Throwable getCause() {
        return this.cause;
    }

    public CryptoException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public CryptoException(String str) {
        super(str);
    }
}
