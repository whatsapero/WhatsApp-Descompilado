package org.spongycastle.crypto;

public class InvalidCipherTextException extends CryptoException {
    public InvalidCipherTextException(String str, Throwable th) {
        super(str, th);
    }

    public InvalidCipherTextException(String str) {
        super(str);
    }
}
