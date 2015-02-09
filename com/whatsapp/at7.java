package com.whatsapp;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

abstract class at7 implements ik {
    private static final String z;
    protected final m8 a;

    static {
        char[] toCharArray = "sJ R\"pJ Icq['\\8aH,S8eH7\u0012%j]\"Q%`".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 4;
                    break;
                case ay.f /*1*/:
                    i2 = 43;
                    break;
                case ay.n /*2*/:
                    i2 = 67;
                    break;
                case ay.p /*3*/:
                    i2 = 61;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected abstract boolean b(m8 m8Var);

    public final boolean a(m8 m8Var) {
        if (m8Var == this.a) {
            return true;
        }
        if (this.a.e != null) {
            return this.a.e.equals(m8Var.e) ? b(m8Var) : false;
        } else {
            Log.e(z);
            return false;
        }
    }

    public at7(m8 m8Var) {
        this.a = m8Var;
    }
}
