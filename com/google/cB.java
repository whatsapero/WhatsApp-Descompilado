package com.google;

import java.util.Map.Entry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class cb implements Entry {
    private static final String z;
    private Entry a;

    static {
        char[] toCharArray = "E,B'E`(T:#g\"O~lg!A~vz(\\~ef?\u0018\u0013fz>Y9fZ(Lr#h#\\~wa(\u0018(be8]~lomu;pz,_;Pl9\u00183vz9\u0018<f),V~jg>L?mj(\u00181e)\u0000]-ph*]\u0012j}(".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 9;
                    break;
                case ay.f /*1*/:
                    i2 = 77;
                    break;
                case ay.n /*2*/:
                    i2 = 56;
                    break;
                case ay.p /*3*/:
                    i2 = 94;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Object setValue(Object obj) {
        try {
            if (obj instanceof a1) {
                return ((f3) this.a.getValue()).a((a1) obj);
            }
            throw new IllegalArgumentException(z);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public f3 a() {
        return (f3) this.a.getValue();
    }

    private cb(Entry entry) {
        this.a = entry;
    }

    cb(Entry entry, A a) {
        this(entry);
    }

    public Object getKey() {
        return this.a.getKey();
    }

    public Object getValue() {
        f3 f3Var = (f3) this.a.getValue();
        return f3Var == null ? null : f3Var.a();
    }
}
