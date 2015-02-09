package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public enum fd implements eU {
    ;
    public static final fd CORD;
    public static final int CORD_VALUE = 1;
    public static final fd STRING;
    public static final fd STRING_PIECE;
    public static final int STRING_PIECE_VALUE = 2;
    public static final int STRING_VALUE = 0;
    private static gJ a;
    private static final fd[] b;
    private static final fd[] c;
    private static final String[] z;
    private final int d;
    private final int e;

    public final aa getDescriptorForType() {
        return getDescriptor();
    }

    public static final aa getDescriptor() {
        return (aa) eJ.a().a().get(0);
    }

    public final bv getValueDescriptor() {
        return (bv) getDescriptor().a().get(this.d);
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[4];
        char[] toCharArray = "w\u0011n/\u001aS\u0013n'\bW\fx0%B\u000bt0l[\f;,#F_}->\u0012\u000bs+?\u0012\u000bb2)\u001c".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 50;
                    break;
                case CORD_VALUE:
                    i2 = 127;
                    break;
                case STRING_PIECE_VALUE:
                    i2 = 27;
                    break;
                case ay.p /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "a+I\u000b\u0002u".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 50;
                    break;
                case CORD_VALUE:
                    i2 = 127;
                    break;
                case STRING_PIECE_VALUE:
                    i2 = 27;
                    break;
                case ay.p /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[CORD_VALUE] = new String(cArr).intern();
        toCharArray = "q0I\u0006".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 50;
                    break;
                case CORD_VALUE:
                    i2 = 127;
                    break;
                case STRING_PIECE_VALUE:
                    i2 = 27;
                    break;
                case ay.p /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[STRING_PIECE_VALUE] = new String(cArr).intern();
        toCharArray = "a+I\u000b\u0002u K\u000b\tq:".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 50;
                    break;
                case CORD_VALUE:
                    i2 = 127;
                    break;
                case STRING_PIECE_VALUE:
                    i2 = 27;
                    break;
                case ay.p /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        z = strArr;
        STRING = new fd(z[CORD_VALUE], 0, 0, 0);
        CORD = new fd(z[STRING_PIECE_VALUE], CORD_VALUE, CORD_VALUE, CORD_VALUE);
        STRING_PIECE = new fd(z[3], STRING_PIECE_VALUE, STRING_PIECE_VALUE, STRING_PIECE_VALUE);
        c = new fd[]{STRING, CORD, STRING_PIECE};
        a = new b();
        b = values();
    }

    public static gJ internalGetValueMap() {
        return a;
    }

    public static fd valueOf(bv bvVar) {
        try {
            if (bvVar.a() == getDescriptor()) {
                return b[bvVar.c()];
            }
            throw new IllegalArgumentException(z[0]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static fd valueOf(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                try {
                    return STRING;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case CORD_VALUE:
                return CORD;
            case STRING_PIECE_VALUE:
                return STRING_PIECE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.e;
    }

    private fd(int i, int i2) {
        this.d = i;
        this.e = i2;
    }
}
