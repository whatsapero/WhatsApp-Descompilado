package com.google;

import java.util.Iterator;
import java.util.Map.Entry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class dB implements Iterator {
    private static final String z;
    private int a;
    private boolean b;
    final dk c;
    private Iterator d;

    static {
        char[] toCharArray = "g-[\u001a\u001cp`\u001fU\u001dt;\u0016\u0016\u000by$S\u0011Jw-P\u001a\u0018phX\u0010\u0012a`\u001f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 21;
                    break;
                case ay.f /*1*/:
                    i2 = 72;
                    break;
                case ay.n /*2*/:
                    i2 = 54;
                    break;
                case ay.p /*3*/:
                    i2 = 117;
                    break;
                default:
                    i2 = 106;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    dB(dk dkVar, dO dOVar) {
        this(dkVar);
    }

    public Entry a() {
        try {
            this.b = true;
            int i = this.a + 1;
            this.a = i;
            return i < dk.c(this.c).size() ? (Entry) dk.c(this.c).get(this.a) : (Entry) b().next();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private Iterator b() {
        try {
            if (this.d == null) {
                this.d = dk.a(this.c).entrySet().iterator();
            }
            return this.d;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean hasNext() {
        try {
            if (this.a + 1 >= dk.c(this.c).size()) {
                if (!b().hasNext()) {
                    try {
                        return false;
                    }
                }
            }
            return true;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void remove() {
        try {
            if (this.b) {
                try {
                    this.b = false;
                    dk.b(this.c);
                    if (this.a < dk.c(this.c).size()) {
                        dk dkVar = this.c;
                        int i = this.a;
                        this.a = i - 1;
                        dk.a(dkVar, i);
                        try {
                            if (!dy.b) {
                                return;
                            }
                        }
                    }
                    b().remove();
                    return;
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            throw new IllegalStateException(z);
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public Object next() {
        return a();
    }

    private dB(dk dkVar) {
        this.c = dkVar;
        this.a = -1;
    }
}
