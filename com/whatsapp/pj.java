package com.whatsapp;

import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;

public class pj {
    public long a;
    public long b;
    public long c;
    public long d;

    public long a(int i) {
        switch (i) {
            case aV.r /*5*/:
                if (this.b > 0) {
                    return this.b;
                }
                break;
            case a8.n /*8*/:
                break;
            case a6.z /*13*/:
                break;
            default:
                return 0;
        }
        if (this.a > 0) {
            return this.a;
        }
        return this.d > 0 ? this.d : 0;
    }

    public int a() {
        if (this.d > 0) {
            return 8;
        }
        if (this.a > 0) {
            return 13;
        }
        return this.b > 0 ? 5 : 4;
    }
}
