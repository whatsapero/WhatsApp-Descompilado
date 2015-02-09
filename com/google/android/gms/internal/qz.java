package com.google.android.gms.internal;

public final class qz {
    public static final int[] azj;
    public static final long[] azk;
    public static final float[] azl;
    public static final double[] azm;
    public static final boolean[] azn;
    public static final String[] azo;
    public static final byte[][] azp;
    public static final byte[] azq;

    static {
        azj = new int[0];
        azk = new long[0];
        azl = new float[0];
        azm = new double[0];
        azn = new boolean[0];
        azo = new String[0];
        azp = new byte[0][];
        azq = new byte[0];
    }

    public static int hl(int i) {
        return i >>> 3;
    }

    static int y(int i, int i2) {
        return (i << 3) | i2;
    }
}
