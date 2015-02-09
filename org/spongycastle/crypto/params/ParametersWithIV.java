package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public class ParametersWithIV implements CipherParameters {
    public static int a;
    private byte[] iv;
    private CipherParameters parameters;

    public byte[] getIV() {
        return this.iv;
    }

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr) {
        this(cipherParameters, bArr, 0, bArr.length);
    }

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr, int i, int i2) {
        boolean z = false;
        int i3 = a;
        this.iv = new byte[i2];
        this.parameters = cipherParameters;
        System.arraycopy(bArr, i, this.iv, 0, i2);
        if (i3 != 0) {
            if (!BaseKeyGenerator.a) {
                z = true;
            }
            BaseKeyGenerator.a = z;
        }
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }
}
