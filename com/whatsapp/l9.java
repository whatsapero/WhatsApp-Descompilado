package com.whatsapp;

import java.util.Arrays;

public class l9 {
    private byte[] a;
    private byte[] b;
    private String c;

    static String b(l9 l9Var) {
        return l9Var.c;
    }

    static byte[] c(l9 l9Var) {
        return l9Var.a;
    }

    static byte[] a(l9 l9Var) {
        return l9Var.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        l9 l9Var = (l9) obj;
        if (!Arrays.equals(this.a, l9Var.a)) {
            return false;
        }
        if (Arrays.equals(this.b, l9Var.b)) {
            return this.c == null ? l9Var.c == null : this.c.equals(l9Var.c);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (this.c == null ? 0 : this.c.hashCode()) + ((((Arrays.hashCode(this.a) + 31) * 31) + Arrays.hashCode(this.b)) * 31);
    }

    public l9(String str, byte[] bArr, byte[] bArr2) {
        this.c = str;
        this.b = bArr;
        this.a = bArr2;
    }
}
