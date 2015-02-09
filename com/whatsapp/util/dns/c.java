package com.whatsapp.util.dns;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicInteger;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class c {
    private static final AtomicInteger a;
    private static final String z;
    private final int b;
    private int c;
    private final f d;
    private final d[] e;
    private byte[] f;
    private final i[] g;

    static c a(String str) {
        String[] split = str.split(z);
        f fVar = new f((short) a.getAndIncrement(), false, (byte) 0, false, false, true, false, (short) 0, (short) 1, (short) 0, (short) 0, (short) 0);
        d[] dVarArr = new d[]{d.a(h.a(split, (short) 0), (short) 1, (short) 1)};
        return new c(fVar, dVarArr, new i[0], dVarArr[0].a() + fVar.d());
    }

    f a() {
        return this.d;
    }

    static c a(byte[] bArr) {
        return a(bArr, 0);
    }

    static c a(byte[] bArr, int i) {
        int i2 = 0;
        boolean z = b.c;
        f b = f.b(bArr, i);
        d[] dVarArr = new d[b.e()];
        int d = b.d() + i;
        int i3 = 0;
        while (i3 < dVarArr.length) {
            dVarArr[i3] = d.a(bArr, d);
            d += dVarArr[i3].a();
            i3++;
            if (z) {
                break;
            }
        }
        i[] iVarArr = new i[b.h()];
        while (i2 < iVarArr.length) {
            iVarArr[i2] = i.a(bArr, d);
            d += iVarArr[i2].b();
            i2++;
            if (z) {
                break;
            }
        }
        c cVar = new c(b, dVarArr, iVarArr, -1);
        cVar.f = bArr;
        cVar.c = i;
        return cVar;
    }

    i[] c() {
        return this.g;
    }

    byte[] b() {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            return null;
        }
    }

    String a(h hVar) {
        int i = 0;
        boolean z = b.c;
        StringBuilder stringBuilder = new StringBuilder();
        String[] a = hVar.a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            stringBuilder.append(a[i2]).append('.');
            i2++;
            if (z) {
                break;
            }
        }
        if (hVar.b() != (short) 0) {
            String[] a2 = h.a(this.f, this.c + hVar.b()).a();
            int length2 = a2.length;
            while (i < length2) {
                stringBuilder.append(a2[i]).append('.');
                i++;
                if (z) {
                    break;
                }
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    void a(OutputStream outputStream) {
        int i = 0;
        boolean z = b.c;
        this.d.a(outputStream);
        d[] dVarArr = this.e;
        int length = dVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            dVarArr[i2].a(outputStream);
            i2++;
            if (z) {
                break;
            }
        }
        i[] iVarArr = this.g;
        int length2 = iVarArr.length;
        while (i < length2) {
            iVarArr[i].a(outputStream);
            i++;
            if (z) {
                return;
            }
        }
    }

    private c(f fVar, d[] dVarArr, i[] iVarArr, int i) {
        this.d = fVar;
        this.e = dVarArr;
        this.g = iVarArr;
        this.b = i;
    }

    static {
        char[] toCharArray = "HO".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 20;
                    break;
                case ay.f /*1*/:
                    i2 = 97;
                    break;
                case ay.n /*2*/:
                    i2 = 6;
                    break;
                case ay.p /*3*/:
                    i2 = 84;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        a = new AtomicInteger();
    }
}
