package com.whatsapp.protocol;

import java.io.InputStream;

public class i {
    public static boolean b(int i) {
        return (4194304 & i) > 0;
    }

    public static int a(InputStream inputStream) {
        return ((inputStream.read() << 16) + (inputStream.read() << 8)) + inputStream.read();
    }

    public static int a(int i) {
        return 1048575 & i;
    }

    public static void a(byte[] bArr, int i, int i2, int i3) {
        int i4 = (1048575 & i3) | (i2 << 20);
        bArr[i] = (byte) ((16711680 & i4) >> 16);
        bArr[i + 1] = (byte) ((65280 & i4) >> 8);
        bArr[i + 2] = (byte) ((i4 & 255) >> 0);
    }

    public static boolean d(int i) {
        return (1048576 & i) > 0;
    }

    public static boolean c(int i) {
        return (8388608 & i) > 0;
    }
}
