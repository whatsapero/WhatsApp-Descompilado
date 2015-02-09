package com.whatsapp.util;

import android.text.TextUtils;

public final class a9 {
    public final CharSequence a;
    public final CharSequence b;

    public int hashCode() {
        int hashCode;
        int i = 0;
        if (this.b != null) {
            hashCode = this.b.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + 0) * 31;
        if (this.a != null) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a9 a9Var = (a9) obj;
        return TextUtils.equals(this.b, a9Var.b) && TextUtils.equals(this.a, a9Var.a);
    }

    public a9(CharSequence charSequence, CharSequence charSequence2) {
        this.b = charSequence;
        this.a = charSequence2;
    }
}
