package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;

public enum bt implements eU {
    ;
    public static final bt LABEL_OPTIONAL;
    public static final int LABEL_OPTIONAL_VALUE = 1;
    public static final bt LABEL_REPEATED;
    public static final int LABEL_REPEATED_VALUE = 3;
    public static final bt LABEL_REQUIRED;
    public static final int LABEL_REQUIRED_VALUE = 2;
    private static final bt[] a;
    private static final bt[] c;
    private static gJ e;
    private static final String[] z;
    private final int b;
    private final int d;

    public static final aa getDescriptor() {
        return (aa) d6.d().a().get(LABEL_OPTIONAL_VALUE);
    }

    public static gJ internalGetValueMap() {
        return e;
    }

    public final bv getValueDescriptor() {
        return (bv) getDescriptor().a().get(this.b);
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[4];
        char[] toCharArray = "(5/4\u0017\f7/<\u0005\b(9+(\u001d/5+a\u0004(z7.\u0019{<63M/202M/#)$C".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 109;
                    break;
                case LABEL_OPTIONAL_VALUE:
                    i2 = 91;
                    break;
                case LABEL_REQUIRED_VALUE:
                    i2 = 90;
                    break;
                case LABEL_REPEATED_VALUE:
                    i2 = 89;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "!\u001a\u0018\u001c\r2\u0014\n\r\b\"\u0015\u001b\u0015".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 109;
                    break;
                case LABEL_OPTIONAL_VALUE:
                    i2 = 91;
                    break;
                case LABEL_REQUIRED_VALUE:
                    i2 = 90;
                    break;
                case LABEL_REPEATED_VALUE:
                    i2 = 89;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[LABEL_OPTIONAL_VALUE] = new String(cArr).intern();
        toCharArray = "!\u001a\u0018\u001c\r2\t\u001f\t\u0004,\u000f\u001f\u001d".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 109;
                    break;
                case LABEL_OPTIONAL_VALUE:
                    i2 = 91;
                    break;
                case LABEL_REQUIRED_VALUE:
                    i2 = 90;
                    break;
                case LABEL_REPEATED_VALUE:
                    i2 = 89;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[LABEL_REQUIRED_VALUE] = new String(cArr).intern();
        toCharArray = "!\u001a\u0018\u001c\r2\t\u001f\b\u0014$\t\u001f\u001d".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 109;
                    break;
                case LABEL_OPTIONAL_VALUE:
                    i2 = 91;
                    break;
                case LABEL_REQUIRED_VALUE:
                    i2 = 90;
                    break;
                case LABEL_REPEATED_VALUE:
                    i2 = 89;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[LABEL_REPEATED_VALUE] = new String(cArr).intern();
        z = strArr;
        LABEL_OPTIONAL = new bt(z[LABEL_OPTIONAL_VALUE], 0, 0, LABEL_OPTIONAL_VALUE);
        LABEL_REQUIRED = new bt(z[LABEL_REPEATED_VALUE], LABEL_OPTIONAL_VALUE, LABEL_OPTIONAL_VALUE, LABEL_REQUIRED_VALUE);
        LABEL_REPEATED = new bt(z[LABEL_REQUIRED_VALUE], LABEL_REQUIRED_VALUE, LABEL_REQUIRED_VALUE, LABEL_REPEATED_VALUE);
        bt[] btVarArr = new bt[LABEL_REPEATED_VALUE];
        btVarArr[0] = LABEL_OPTIONAL;
        btVarArr[LABEL_OPTIONAL_VALUE] = LABEL_REQUIRED;
        btVarArr[LABEL_REQUIRED_VALUE] = LABEL_REPEATED;
        c = btVarArr;
        e = new N();
        a = values();
    }

    public static bt valueOf(bv bvVar) {
        try {
            if (bvVar.a() == getDescriptor()) {
                return a[bvVar.c()];
            }
            throw new IllegalArgumentException(z[0]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private bt(int i, int i2) {
        this.b = i;
        this.d = i2;
    }

    public final int getNumber() {
        return this.d;
    }

    public final aa getDescriptorForType() {
        return getDescriptor();
    }

    public static bt valueOf(int i) {
        switch (i) {
            case LABEL_OPTIONAL_VALUE:
                try {
                    return LABEL_OPTIONAL;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case LABEL_REQUIRED_VALUE:
                return LABEL_REQUIRED;
            case LABEL_REPEATED_VALUE:
                return LABEL_REPEATED;
            default:
                return null;
        }
    }
}
