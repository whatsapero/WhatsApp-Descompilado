package com.whatsapp;

import android.text.TextUtils;

public class g9 {
    final long a;
    final String b;

    public String toString() {
        return this.a + ":" + this.b;
    }

    public int hashCode() {
        int hashCode;
        int i = ((int) (this.a ^ (this.a >>> 32))) * 31;
        if (this.b != null) {
            hashCode = this.b.hashCode();
        } else {
            hashCode = 0;
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        g9 g9Var = (g9) obj;
        return this.a == g9Var.a && TextUtils.equals(this.b, g9Var.b);
    }

    public String a() {
        return this.b;
    }

    public g9(long j, String str) {
        this.a = j;
        this.b = str;
    }
}
