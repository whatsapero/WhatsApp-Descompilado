package com.whatsapp;

import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;

public class gy {
    public ConcurrentHashMap a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(int r7) {
        /*
        r6_this = this;
        r0 = 0;
        r4 = com.whatsapp.m3.d;
        r1 = r6.a;
        r1 = r1.values();
        r5 = r1.iterator();
        r1 = r0;
        r2 = r0;
        r3 = r0;
    L_0x0010:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0046;
    L_0x0016:
        r0 = r5.next();
        r0 = (com.whatsapp.pj) r0;
        r0 = r0.a();
        switch(r0) {
            case 5: goto L_0x0031;
            case 8: goto L_0x002d;
            case 13: goto L_0x002f;
            default: goto L_0x0023;
        };
    L_0x0023:
        r0 = r1;
        r1 = r2;
        r2 = r3;
    L_0x0026:
        if (r4 == 0) goto L_0x0042;
    L_0x0028:
        if (r0 < r7) goto L_0x0037;
    L_0x002a:
        r0 = 8;
    L_0x002c:
        return r0;
    L_0x002d:
        r1 = r1 + 1;
    L_0x002f:
        r2 = r2 + 1;
    L_0x0031:
        r3 = r3 + 1;
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0026;
    L_0x0037:
        if (r1 < r7) goto L_0x003c;
    L_0x0039:
        r0 = 13;
        goto L_0x002c;
    L_0x003c:
        if (r2 < r7) goto L_0x0040;
    L_0x003e:
        r0 = 5;
        goto L_0x002c;
    L_0x0040:
        r0 = 4;
        goto L_0x002c;
    L_0x0042:
        r3 = r2;
        r2 = r1;
        r1 = r0;
        goto L_0x0010;
    L_0x0046:
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gy.a(int):int");
    }

    public void a(String str, int i, long j) {
        int i2 = m3.d;
        pj pjVar = (pj) this.a.get(str);
        if (pjVar == null) {
            pjVar = new pj();
            this.a.put(str, pjVar);
        }
        switch (i) {
            case aV.r /*5*/:
                break;
            case a8.n /*8*/:
                pjVar.d = j;
                if (i2 == 0) {
                    return;
                }
                break;
            case a6.z /*13*/:
                break;
            default:
                return;
        }
        pjVar.a = j;
        if (i2 == 0) {
            return;
        }
        pjVar.b = j;
    }

    public gy() {
        this.a = new ConcurrentHashMap();
    }
}
