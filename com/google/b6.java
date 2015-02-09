package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;

public enum b6 implements eU {
    ;
    public static final b6 TYPE_BOOL;
    public static final int TYPE_BOOL_VALUE = 8;
    public static final b6 TYPE_BYTES;
    public static final int TYPE_BYTES_VALUE = 12;
    public static final b6 TYPE_DOUBLE;
    public static final int TYPE_DOUBLE_VALUE = 1;
    public static final b6 TYPE_ENUM;
    public static final int TYPE_ENUM_VALUE = 14;
    public static final b6 TYPE_FIXED32;
    public static final int TYPE_FIXED32_VALUE = 7;
    public static final b6 TYPE_FIXED64;
    public static final int TYPE_FIXED64_VALUE = 6;
    public static final b6 TYPE_FLOAT;
    public static final int TYPE_FLOAT_VALUE = 2;
    public static final b6 TYPE_GROUP;
    public static final int TYPE_GROUP_VALUE = 10;
    public static final b6 TYPE_INT32;
    public static final int TYPE_INT32_VALUE = 5;
    public static final b6 TYPE_INT64;
    public static final int TYPE_INT64_VALUE = 3;
    public static final b6 TYPE_MESSAGE;
    public static final int TYPE_MESSAGE_VALUE = 11;
    public static final b6 TYPE_SFIXED32;
    public static final int TYPE_SFIXED32_VALUE = 15;
    public static final b6 TYPE_SFIXED64;
    public static final int TYPE_SFIXED64_VALUE = 16;
    public static final b6 TYPE_SINT32;
    public static final int TYPE_SINT32_VALUE = 17;
    public static final b6 TYPE_SINT64;
    public static final int TYPE_SINT64_VALUE = 18;
    public static final b6 TYPE_STRING;
    public static final int TYPE_STRING_VALUE = 9;
    public static final b6 TYPE_UINT32;
    public static final int TYPE_UINT32_VALUE = 13;
    public static final b6 TYPE_UINT64;
    public static final int TYPE_UINT64_VALUE = 4;
    private static gJ a;
    private static final b6[] c;
    private static final b6[] e;
    private static final String[] z;
    private final int b;
    private final int d;

    public final int getNumber() {
        return this.b;
    }

    public final aa getDescriptorForType() {
        return getDescriptor();
    }

    private b6(int i, int i2) {
        this.d = i;
        this.b = i2;
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[19];
        char[] toCharArray = "=EzOF\u0019GzGT\u001dXlPy\b_`P0\u0011X/L\u007f\f\u000biMbX_gKcX_vRuV".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = ",r_gO-bAv#J".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_DOUBLE_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO?y@w@".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_FLOAT_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO1e[\u0014$".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_INT64_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO>bWgTK\u0019".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_UINT64_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO+mFzU<\u001d;".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_INT32_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO>bWgTN\u001f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_FIXED64_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO5n\\qQ?n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_FIXED32_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO+bAv&L".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_BOOL_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO-bAv&L".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_STRING_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO<dZ`\\=".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_GROUP_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO:r[gC".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_MESSAGE_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO+\u007f]k^?".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_BYTES_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO1e[\u0011\"".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_UINT32_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO+mFzU<\u0018=".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_ENUM_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO>g@cD".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[TYPE_SFIXED32_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO=eZo".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[TYPE_SFIXED64_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO+bAv#J".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_SINT32_VALUE] = new String(cArr).intern();
        toCharArray = ",r_gO:d@n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 120;
                    break;
                case TYPE_DOUBLE_VALUE:
                    i2 = 43;
                    break;
                case TYPE_FLOAT_VALUE:
                    i2 = TYPE_SFIXED32_VALUE;
                    break;
                case TYPE_INT64_VALUE:
                    i2 = 34;
                    break;
                default:
                    i2 = TYPE_SFIXED64_VALUE;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[TYPE_SINT64_VALUE] = new String(cArr).intern();
        z = strArr;
        TYPE_DOUBLE = new b6(z[TYPE_GROUP_VALUE], 0, 0, TYPE_DOUBLE_VALUE);
        TYPE_FLOAT = new b6(z[TYPE_SFIXED32_VALUE], TYPE_DOUBLE_VALUE, TYPE_DOUBLE_VALUE, TYPE_FLOAT_VALUE);
        TYPE_INT64 = new b6(z[TYPE_INT64_VALUE], TYPE_FLOAT_VALUE, TYPE_FLOAT_VALUE, TYPE_INT64_VALUE);
        TYPE_UINT64 = new b6(z[TYPE_STRING_VALUE], TYPE_INT64_VALUE, TYPE_INT64_VALUE, TYPE_UINT64_VALUE);
        TYPE_INT32 = new b6(z[TYPE_UINT32_VALUE], TYPE_UINT64_VALUE, TYPE_UINT64_VALUE, TYPE_INT32_VALUE);
        TYPE_FIXED64 = new b6(z[TYPE_FIXED64_VALUE], TYPE_INT32_VALUE, TYPE_INT32_VALUE, TYPE_FIXED64_VALUE);
        TYPE_FIXED32 = new b6(z[TYPE_UINT64_VALUE], TYPE_FIXED64_VALUE, TYPE_FIXED64_VALUE, TYPE_FIXED32_VALUE);
        TYPE_BOOL = new b6(z[TYPE_SINT64_VALUE], TYPE_FIXED32_VALUE, TYPE_FIXED32_VALUE, TYPE_BOOL_VALUE);
        TYPE_STRING = new b6(z[TYPE_BYTES_VALUE], TYPE_BOOL_VALUE, TYPE_BOOL_VALUE, TYPE_STRING_VALUE);
        TYPE_GROUP = new b6(z[TYPE_FLOAT_VALUE], TYPE_STRING_VALUE, TYPE_STRING_VALUE, TYPE_GROUP_VALUE);
        TYPE_MESSAGE = new b6(z[TYPE_FIXED32_VALUE], TYPE_GROUP_VALUE, TYPE_GROUP_VALUE, TYPE_MESSAGE_VALUE);
        TYPE_BYTES = new b6(z[TYPE_MESSAGE_VALUE], TYPE_MESSAGE_VALUE, TYPE_MESSAGE_VALUE, TYPE_BYTES_VALUE);
        TYPE_UINT32 = new b6(z[TYPE_DOUBLE_VALUE], TYPE_BYTES_VALUE, TYPE_BYTES_VALUE, TYPE_UINT32_VALUE);
        TYPE_ENUM = new b6(z[TYPE_SFIXED64_VALUE], TYPE_UINT32_VALUE, TYPE_UINT32_VALUE, TYPE_ENUM_VALUE);
        TYPE_SFIXED32 = new b6(z[TYPE_ENUM_VALUE], TYPE_ENUM_VALUE, TYPE_ENUM_VALUE, TYPE_SFIXED32_VALUE);
        TYPE_SFIXED64 = new b6(z[TYPE_INT32_VALUE], TYPE_SFIXED32_VALUE, TYPE_SFIXED32_VALUE, TYPE_SFIXED64_VALUE);
        TYPE_SINT32 = new b6(z[TYPE_SINT32_VALUE], TYPE_SFIXED64_VALUE, TYPE_SFIXED64_VALUE, TYPE_SINT32_VALUE);
        TYPE_SINT64 = new b6(z[TYPE_BOOL_VALUE], TYPE_SINT32_VALUE, TYPE_SINT32_VALUE, TYPE_SINT64_VALUE);
        b6[] b6VarArr = new b6[TYPE_SINT64_VALUE];
        b6VarArr[0] = TYPE_DOUBLE;
        b6VarArr[TYPE_DOUBLE_VALUE] = TYPE_FLOAT;
        b6VarArr[TYPE_FLOAT_VALUE] = TYPE_INT64;
        b6VarArr[TYPE_INT64_VALUE] = TYPE_UINT64;
        b6VarArr[TYPE_UINT64_VALUE] = TYPE_INT32;
        b6VarArr[TYPE_INT32_VALUE] = TYPE_FIXED64;
        b6VarArr[TYPE_FIXED64_VALUE] = TYPE_FIXED32;
        b6VarArr[TYPE_FIXED32_VALUE] = TYPE_BOOL;
        b6VarArr[TYPE_BOOL_VALUE] = TYPE_STRING;
        b6VarArr[TYPE_STRING_VALUE] = TYPE_GROUP;
        b6VarArr[TYPE_GROUP_VALUE] = TYPE_MESSAGE;
        b6VarArr[TYPE_MESSAGE_VALUE] = TYPE_BYTES;
        b6VarArr[TYPE_BYTES_VALUE] = TYPE_UINT32;
        b6VarArr[TYPE_UINT32_VALUE] = TYPE_ENUM;
        b6VarArr[TYPE_ENUM_VALUE] = TYPE_SFIXED32;
        b6VarArr[TYPE_SFIXED32_VALUE] = TYPE_SFIXED64;
        b6VarArr[TYPE_SFIXED64_VALUE] = TYPE_SINT32;
        b6VarArr[TYPE_SINT32_VALUE] = TYPE_SINT64;
        c = b6VarArr;
        a = new fQ();
        e = values();
    }

    public final bv getValueDescriptor() {
        return (bv) getDescriptor().a().get(this.d);
    }

    public static b6 valueOf(int i) {
        switch (i) {
            case TYPE_DOUBLE_VALUE:
                try {
                    return TYPE_DOUBLE;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case TYPE_FLOAT_VALUE:
                return TYPE_FLOAT;
            case TYPE_INT64_VALUE:
                return TYPE_INT64;
            case TYPE_UINT64_VALUE:
                return TYPE_UINT64;
            case TYPE_INT32_VALUE:
                return TYPE_INT32;
            case TYPE_FIXED64_VALUE:
                return TYPE_FIXED64;
            case TYPE_FIXED32_VALUE:
                return TYPE_FIXED32;
            case TYPE_BOOL_VALUE:
                return TYPE_BOOL;
            case TYPE_STRING_VALUE:
                return TYPE_STRING;
            case TYPE_GROUP_VALUE:
                return TYPE_GROUP;
            case TYPE_MESSAGE_VALUE:
                return TYPE_MESSAGE;
            case TYPE_BYTES_VALUE:
                return TYPE_BYTES;
            case TYPE_UINT32_VALUE:
                return TYPE_UINT32;
            case TYPE_ENUM_VALUE:
                return TYPE_ENUM;
            case TYPE_SFIXED32_VALUE:
                return TYPE_SFIXED32;
            case TYPE_SFIXED64_VALUE:
                return TYPE_SFIXED64;
            case TYPE_SINT32_VALUE:
                return TYPE_SINT32;
            case TYPE_SINT64_VALUE:
                return TYPE_SINT64;
            default:
                return null;
        }
    }

    public static final aa getDescriptor() {
        return (aa) d6.d().a().get(0);
    }

    public static b6 valueOf(bv bvVar) {
        try {
            if (bvVar.a() == getDescriptor()) {
                return e[bvVar.c()];
            }
            throw new IllegalArgumentException(z[0]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static gJ internalGetValueMap() {
        return a;
    }
}
