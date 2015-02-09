package com.whatsapp;

import java.util.Arrays;

final class _o {
    private final byte[] a;
    private final String b;

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
        _o _oVar = (_o) obj;
        if (Arrays.equals(this.a, _oVar.a)) {
            return this.b == null ? _oVar.b == null : this.b.equals(_oVar.b);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (this.b == null ? 0 : this.b.hashCode()) + ((Arrays.hashCode(this.a) + 31) * 31);
    }

    public _o(String str, byte[] bArr) {
        this.b = str;
        this.a = bArr;
    }
}
