package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Arrays;

public class BasicGCMMultiplier implements GCMMultiplier {
    private byte[] H;

    public void init(byte[] bArr) {
        this.H = Arrays.clone(bArr);
    }

    public void multiplyH(byte[] bArr) {
        GCMUtil.multiply(bArr, this.H);
    }
}
