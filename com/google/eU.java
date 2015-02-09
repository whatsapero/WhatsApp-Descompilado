package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;

public enum eu implements eU {
    ;
    public static final eu CODE_SIZE;
    public static final int CODE_SIZE_VALUE = 2;
    public static final eu LITE_RUNTIME;
    public static final int LITE_RUNTIME_VALUE = 3;
    public static final eu SPEED;
    public static final int SPEED_VALUE = 1;
    private static final eu[] a;
    private static gJ b;
    private static final eu[] c;
    private static final String[] z;
    private final int d;
    private final int e;

    public final int getNumber() {
        return this.d;
    }

    private eu(int i, int i2) {
        this.e = i;
        this.d = i2;
    }

    public static final aa getDescriptor() {
        return (aa) eg.u().a().get(0);
    }

    public static gJ internalGetValueMap() {
        return b;
    }

    public static eu valueOf(int i) {
        switch (i) {
            case SPEED_VALUE:
                try {
                    return SPEED;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case CODE_SIZE_VALUE:
                return CODE_SIZE;
            case LITE_RUNTIME_VALUE:
                return LITE_RUNTIME;
            default:
                return null;
        }
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[4];
        char[] toCharArray = "\u000eR\u0004=9*P\u00045+.O\u0012\"\u0006;H\u001e\"O\"OQ>\u0000?\u001c\u0017?\u001dkH\u00199\u001ckH\b \ne".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 75;
                    break;
                case SPEED_VALUE:
                    i2 = 60;
                    break;
                case CODE_SIZE_VALUE:
                    i2 = 113;
                    break;
                case LITE_RUNTIME_VALUE:
                    i2 = 80;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0007u%\u00150\u0019i?\u0004&\u0006y".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 75;
                    break;
                case SPEED_VALUE:
                    i2 = 60;
                    break;
                case CODE_SIZE_VALUE:
                    i2 = 113;
                    break;
                case LITE_RUNTIME_VALUE:
                    i2 = 80;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[SPEED_VALUE] = new String(cArr).intern();
        toCharArray = "\u0018l4\u0015+".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 75;
                    break;
                case SPEED_VALUE:
                    i2 = 60;
                    break;
                case CODE_SIZE_VALUE:
                    i2 = 113;
                    break;
                case LITE_RUNTIME_VALUE:
                    i2 = 80;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[CODE_SIZE_VALUE] = new String(cArr).intern();
        toCharArray = "\bs5\u00150\u0018u+\u0015".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 75;
                    break;
                case SPEED_VALUE:
                    i2 = 60;
                    break;
                case CODE_SIZE_VALUE:
                    i2 = 113;
                    break;
                case LITE_RUNTIME_VALUE:
                    i2 = 80;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[LITE_RUNTIME_VALUE] = new String(cArr).intern();
        z = strArr;
        SPEED = new eu(z[CODE_SIZE_VALUE], 0, 0, SPEED_VALUE);
        CODE_SIZE = new eu(z[LITE_RUNTIME_VALUE], SPEED_VALUE, SPEED_VALUE, CODE_SIZE_VALUE);
        LITE_RUNTIME = new eu(z[SPEED_VALUE], CODE_SIZE_VALUE, CODE_SIZE_VALUE, LITE_RUNTIME_VALUE);
        eu[] euVarArr = new eu[LITE_RUNTIME_VALUE];
        euVarArr[0] = SPEED;
        euVarArr[SPEED_VALUE] = CODE_SIZE;
        euVarArr[CODE_SIZE_VALUE] = LITE_RUNTIME;
        c = euVarArr;
        b = new cz();
        a = values();
    }

    public final aa getDescriptorForType() {
        return getDescriptor();
    }

    public static eu valueOf(bv bvVar) {
        try {
            if (bvVar.a() == getDescriptor()) {
                return a[bvVar.c()];
            }
            throw new IllegalArgumentException(z[0]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public final bv getValueDescriptor() {
        return (bv) getDescriptor().a().get(this.e);
    }
}
