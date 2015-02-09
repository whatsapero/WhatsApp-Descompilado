package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class RC4Engine implements StreamCipher {
    private static final int STATE_LENGTH = 256;
    public static boolean a;
    private static final String[] z;
    private byte[] engineState;
    private byte[] workingKey;
    private int x;
    private int y;

    static {
        int i;
        int i2;
        String[] strArr = new String[4];
        char[] toCharArray = "/\u0018Xo(/\u0012\u000e~%4\u0017Ck0#\u0004\u000e~%5\u0005Kjd2\u0019\u000e\\\u0007rVG`-2V\u0003.".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 118;
                    break;
                case ay.n /*2*/:
                    i2 = 46;
                    break;
                case ay.p /*3*/:
                    i2 = 14;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u00145\u001a".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 118;
                    break;
                case ay.n /*2*/:
                    i2 = 46;
                    break;
                case ay.p /*3*/:
                    i2 = 14;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = ")\u0003Z~12VL{\" \u0013\\.0)\u0019\u000e},)\u0004Z".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 118;
                    break;
                case ay.n /*2*/:
                    i2 = 46;
                    break;
                case ay.p /*3*/:
                    i2 = 14;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "/\u0018^{0f\u0014[h\"#\u0004\u000ez+)V]f+4\u0002".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 118;
                    break;
                case ay.n /*2*/:
                    i2 = 46;
                    break;
                case ay.p /*3*/:
                    i2 = 14;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[3] = new String(cArr).intern();
        z = strArr;
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        boolean z = a;
        try {
            if (i + i2 > bArr.length) {
                throw new DataLengthException(z[3]);
            }
            try {
                if (i3 + i2 > bArr2.length) {
                    throw new OutputLengthException(z[2]);
                }
                int i4 = 0;
                while (i4 < i2) {
                    this.x = (this.x + 1) & 255;
                    this.y = (this.engineState[this.x] + this.y) & 255;
                    byte b = this.engineState[this.x];
                    this.engineState[this.x] = this.engineState[this.y];
                    this.engineState[this.y] = b;
                    bArr2[i4 + i3] = (byte) (bArr[i4 + i] ^ this.engineState[(this.engineState[this.x] + this.engineState[this.y]) & 255]);
                    i4++;
                    if (z) {
                        break;
                    }
                }
                return i2;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public RC4Engine() {
        this.engineState = null;
        this.x = 0;
        this.y = 0;
        this.workingKey = null;
    }

    public byte returnByte(byte b) {
        boolean z = a;
        this.x = (this.x + 1) & 255;
        this.y = (this.engineState[this.x] + this.y) & 255;
        byte b2 = this.engineState[this.x];
        try {
            this.engineState[this.x] = this.engineState[this.y];
            this.engineState[this.y] = b2;
            b2 = (byte) (this.engineState[(this.engineState[this.x] + this.engineState[this.y]) & 255] ^ b);
            if (z) {
                BaseKeyGenerator.a = !BaseKeyGenerator.a;
            }
            return b2;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private void setKey(byte[] bArr) {
        int i = 0;
        boolean z = a;
        try {
            this.workingKey = bArr;
            this.x = 0;
            this.y = 0;
            if (this.engineState == null) {
                this.engineState = new byte[STATE_LENGTH];
            }
            int i2 = 0;
            while (i2 < STATE_LENGTH) {
                this.engineState[i2] = (byte) i2;
                i2++;
                if (z) {
                    break;
                }
            }
            i2 = 0;
            int i3 = 0;
            while (i < STATE_LENGTH) {
                i2 = (i2 + ((bArr[i3] & 255) + this.engineState[i])) & 255;
                byte b = this.engineState[i];
                this.engineState[i] = this.engineState[i2];
                this.engineState[i2] = b;
                i3 = (i3 + 1) % bArr.length;
                i++;
                if (z) {
                    return;
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void reset() {
        setKey(this.workingKey);
    }

    public String getAlgorithmName() {
        return z[1];
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        try {
            if (cipherParameters instanceof KeyParameter) {
                this.workingKey = ((KeyParameter) cipherParameters).getKey();
                setKey(this.workingKey);
                return;
            }
            throw new IllegalArgumentException(z[0] + cipherParameters.getClass().getName());
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
