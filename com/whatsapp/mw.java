package com.whatsapp;

import com.whatsapp.protocol.b9;
import com.whatsapp.util.Log;
import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class mw extends mz {
    private static final String z;
    final le j;

    static {
        char[] toCharArray = "\u000fr(\u001bE\u0003r(\u001bO\u000ba.\u001bL\u001c]9WI\u0007m6kN\u000bv\u0007SO\u0001w(\u0014^\u001cg9@XNe*[H\u001e\"\f{y!\"9PYNr1WI\u001bp=".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 110;
                    break;
                case ay.f /*1*/:
                    i2 = 2;
                    break;
                case ay.n /*2*/:
                    i2 = 88;
                    break;
                case ay.p /*3*/:
                    i2 = 52;
                    break;
                default:
                    i2 = 61;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(String str) {
        Log.i(z);
        super.a(str);
    }

    mw(le leVar, String str, String str2, Vector vector, int i, b9 b9Var) {
        this.j = leVar;
        super(str, str2, vector, i, b9Var);
    }
}
