package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public class AEADParameters implements CipherParameters {
    private byte[] associatedText;
    private KeyParameter key;
    private int macSize;
    private byte[] nonce;

    public AEADParameters(KeyParameter keyParameter, int i, byte[] bArr) {
        this(keyParameter, i, bArr, null);
    }

    public int getMacSize() {
        return this.macSize;
    }

    public byte[] getAssociatedText() {
        return this.associatedText;
    }

    public AEADParameters(KeyParameter keyParameter, int i, byte[] bArr, byte[] bArr2) {
        int i2 = ParametersWithIV.a;
        this.key = keyParameter;
        this.nonce = bArr;
        this.macSize = i;
        this.associatedText = bArr2;
        if (BaseKeyGenerator.a) {
            ParametersWithIV.a = i2 + 1;
        }
    }

    public KeyParameter getKey() {
        return this.key;
    }

    public byte[] getNonce() {
        return this.nonce;
    }
}
