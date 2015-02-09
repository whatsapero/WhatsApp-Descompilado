package com.google;

import com.whatsapp.vk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class co {
    private static final co d;
    private static final String[] z;
    private final dk a;
    private boolean b;
    private boolean c;

    public int a(eY eYVar) {
        try {
            if (eYVar.a()) {
                Object b = b(eYVar);
                return b == null ? 0 : ((List) b).size();
            } else {
                throw new IllegalArgumentException(z[9]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static void a(bF bFVar, bJ bJVar, int i, Object obj) {
        try {
            if (bJVar == bJ.GROUP) {
                bFVar.c(i, (a1) obj);
                try {
                    if (!dy.b) {
                        return;
                    }
                }
            }
            bFVar.b(i, a(bJVar, false));
            a(bFVar, bJVar, obj);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private void a(Map map, Entry entry) {
        eY eYVar = (eY) entry.getKey();
        Object value = entry.getValue();
        try {
            if (value instanceof f3) {
                map.put(eYVar, ((f3) value).a());
                try {
                    if (!dy.b) {
                        return;
                    }
                }
            }
            map.put(eYVar, value);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static co i() {
        return new co();
    }

    public boolean c(eY eYVar) {
        try {
            if (eYVar.a()) {
                throw new IllegalArgumentException(z[10]);
            }
            try {
                return this.a.get(eYVar) != null;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public boolean c() {
        boolean z = dy.b;
        int i = 0;
        while (i < this.a.e()) {
            try {
                if (a(this.a.c(i))) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                return false;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        for (Entry entry : this.a.f()) {
            try {
                if (a(entry)) {
                    if (z) {
                        break;
                    }
                }
                return false;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return true;
    }

    public static Object a(I i, bJ bJVar) {
        try {
            switch (cE.a[bJVar.ordinal()]) {
                case ay.f /*1*/:
                    return Double.valueOf(i.a());
                case ay.n /*2*/:
                    return Float.valueOf(i.w());
                case ay.p /*3*/:
                    return Long.valueOf(i.j());
                case aj.i /*4*/:
                    return Long.valueOf(i.q());
                case aV.r /*5*/:
                    return Integer.valueOf(i.r());
                case aV.i /*6*/:
                    return Long.valueOf(i.p());
                case a8.s /*7*/:
                    return Integer.valueOf(i.y());
                case a8.n /*8*/:
                    return Boolean.valueOf(i.s());
                case a6.D /*9*/:
                    return i.f();
                case a6.h /*10*/:
                    return i.z();
                case a6.e /*11*/:
                    return Integer.valueOf(i.e());
                case a6.s /*12*/:
                    return Integer.valueOf(i.u());
                case a6.z /*13*/:
                    return Long.valueOf(i.l());
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    return Integer.valueOf(i.x());
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    return Long.valueOf(i.g());
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    throw new IllegalArgumentException(z[2]);
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    throw new IllegalArgumentException(z[3]);
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    throw new IllegalArgumentException(z[0]);
                default:
                    throw new RuntimeException(z[1]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    public int b() {
        int i = 0;
        boolean z = dy.b;
        int i2 = 0;
        while (i < this.a.e()) {
            i2 += c(this.a.c(i));
            i++;
            if (z) {
                break;
            }
        }
        for (Entry entry : this.a.f()) {
            i2 += c(entry);
            if (z) {
                break;
            }
        }
        return i2;
    }

    public Object a(eY eYVar, int i) {
        try {
            if (eYVar.a()) {
                Object b = b(eYVar);
                if (b != null) {
                    return ((List) b).get(i);
                }
                try {
                    throw new IndexOutOfBoundsException();
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            throw new IllegalArgumentException(z[5]);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[12];
        char[] toCharArray = "<\nw\u0000g<\u0006{\rC'\u0019s\"^+\u0003rL\u001en\fw\nY!\u001b6\fV \u000bz\u0001\u0017+\u0001c\tD`".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 22;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u001a\u0007s\u0016Rn\u0006eDY!Oa\u0005Nn\u001byDP+\u001b6\fR<\n:DU;\u001b6\u0010_+Ou\u000bZ>\u0006z\u0001En\u001b~\rY%\u001c6\u000bC&\nd\u0013^=\n8".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 22;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "<\nw\u0000g<\u0006{\rC'\u0019s\"^+\u0003rL\u001en\fw\nY!\u001b6\fV \u000bz\u0001\u0017 \ne\u0010R*Oq\u0016X;\u001feJ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 22;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "<\nw\u0000g<\u0006{\rC'\u0019s\"^+\u0003rL\u001en\fw\nY!\u001b6\fV \u000bz\u0001\u0017+\u0002t\u0001S*\nrDZ+\u001ce\u0005P+\u001c8".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 22;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u001a\u0007s\u0016Rn\u0006eDY!Oa\u0005Nn\u001byDP+\u001b6\fR<\n:DU;\u001b6\u0010_+Ou\u000bZ>\u0006z\u0001En\u001b~\rY%\u001c6\u000bC&\nd\u0013^=\n8".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 22;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = ")\nb6R>\nw\u0010R*)\u007f\u0001[*G?DT/\u00016\u000bY\"\u00166\u0006Rn\fw\b[+\u000b6\u000bYn\u001ds\u0014R/\u001bs\u0000\u0017(\u0006s\bS=A".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 22;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "\u0019\u001dy\nPn\u0000t\u000eR-\u001b6\u0010N>\n6\u0011D+\u000b6\u0013^:\u00076\u0014E!\u001by\u0007X\"O{\u0001D=\u000eq\u0001\u0017<\np\bR-\u001b\u007f\u000bY`".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 22;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "\u0019\u001dy\nPn\u0000t\u000eR-\u001b6\u0010N>\n6\u0011D+\u000b6\u0013^:\u00076\u0014E!\u001by\u0007X\"O{\u0001D=\u000eq\u0001\u0017<\np\bR-\u001b\u007f\u000bY`".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 22;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "/\u000br6R>\nw\u0010R*)\u007f\u0001[*G?DT/\u00016\u000bY\"\u00166\u0006Rn\fw\b[+\u000b6\u000bYn\u001ds\u0014R/\u001bs\u0000\u0017(\u0006s\bS=A".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 22;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = ")\nb6R>\nw\u0010R*)\u007f\u0001[*G?DT/\u00016\u000bY\"\u00166\u0006Rn\fw\b[+\u000b6\u000bYn\u001ds\u0014R/\u001bs\u0000\u0017(\u0006s\bS=A".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 22;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "&\u000ee\"^+\u0003rL\u001en\fw\n\u0017!\u0001z\u001d\u0017,\n6\u0007V\"\u0003s\u0000\u0017!\u00016\nX Bd\u0001G+\u000eb\u0001Sn\t\u007f\u0001[*\u001c8".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 22;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "\u0019\u001dy\nPn\u0000t\u000eR-\u001b6\u0010N>\n6\u0011D+\u000b6\u0013^:\u00076\u0014E!\u001by\u0007X\"O{\u0001D=\u000eq\u0001\u0017<\np\bR-\u001b\u007f\u000bY`".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 111;
                    break;
                case ay.n /*2*/:
                    i2 = 22;
                    break;
                case ay.p /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[11] = new String(cArr).intern();
        z = strArr;
        d = new co(true);
    }

    public Object clone() {
        return g();
    }

    public int j() {
        boolean z = dy.b;
        int i = 0;
        int i2 = 0;
        while (i < this.a.e()) {
            Entry c = this.a.c(i);
            i2 += a((eY) c.getKey(), c.getValue());
            int i3 = i + 1;
            if (z) {
                break;
            }
            i = i3;
        }
        for (Entry entry : this.a.f()) {
            i2 += a((eY) entry.getKey(), entry.getValue());
            if (z) {
                break;
            }
        }
        return i2;
    }

    private co() {
        this.c = false;
        this.a = dk.b(16);
    }

    public void b(eY eYVar, Object obj) {
        try {
            if (eYVar.a()) {
                List list;
                a(eYVar.d(), obj);
                Object b = b(eYVar);
                if (b == null) {
                    List arrayList = new ArrayList();
                    this.a.a((Comparable) eYVar, (Object) arrayList);
                    if (!dy.b) {
                        list = arrayList;
                        list.add(obj);
                        return;
                    }
                }
                list = (List) b;
                list.add(obj);
                return;
            }
            throw new IllegalArgumentException(z[8]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.bF r6, com.google.bJ r7, java.lang.Object r8) {
        /*
        r3 = com.google.dy.b;
        r2 = com.google.cE.a;	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r4 = r7.ordinal();	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x00e8 }
        switch(r2) {
            case 1: goto L_0x000e;
            case 2: goto L_0x001b;
            case 3: goto L_0x0028;
            case 4: goto L_0x0035;
            case 5: goto L_0x0042;
            case 6: goto L_0x004f;
            case 7: goto L_0x005c;
            case 8: goto L_0x0069;
            case 9: goto L_0x0076;
            case 10: goto L_0x0091;
            case 11: goto L_0x009a;
            case 12: goto L_0x00a7;
            case 13: goto L_0x00b4;
            case 14: goto L_0x00c1;
            case 15: goto L_0x00ce;
            case 16: goto L_0x007f;
            case 17: goto L_0x0088;
            case 18: goto L_0x00db;
            default: goto L_0x000d;
        };
    L_0x000d:
        return;
    L_0x000e:
        r0 = r8;
        r0 = (java.lang.Double) r0;	 Catch:{ IllegalArgumentException -> 0x00ea }
        r2 = r0;
        r4 = r2.doubleValue();	 Catch:{ IllegalArgumentException -> 0x00ea }
        r6.b(r4);	 Catch:{ IllegalArgumentException -> 0x00ea }
        if (r3 == 0) goto L_0x000d;
    L_0x001b:
        r0 = r8;
        r0 = (java.lang.Float) r0;	 Catch:{ IllegalArgumentException -> 0x00ec }
        r2 = r0;
        r2 = r2.floatValue();	 Catch:{ IllegalArgumentException -> 0x00ec }
        r6.a(r2);	 Catch:{ IllegalArgumentException -> 0x00ec }
        if (r3 == 0) goto L_0x000d;
    L_0x0028:
        r0 = r8;
        r0 = (java.lang.Long) r0;	 Catch:{ IllegalArgumentException -> 0x00ee }
        r2 = r0;
        r4 = r2.longValue();	 Catch:{ IllegalArgumentException -> 0x00ee }
        r6.c(r4);	 Catch:{ IllegalArgumentException -> 0x00ee }
        if (r3 == 0) goto L_0x000d;
    L_0x0035:
        r0 = r8;
        r0 = (java.lang.Long) r0;	 Catch:{ IllegalArgumentException -> 0x00f0 }
        r2 = r0;
        r4 = r2.longValue();	 Catch:{ IllegalArgumentException -> 0x00f0 }
        r6.d(r4);	 Catch:{ IllegalArgumentException -> 0x00f0 }
        if (r3 == 0) goto L_0x000d;
    L_0x0042:
        r0 = r8;
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r2 = r0;
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r6.j(r2);	 Catch:{ IllegalArgumentException -> 0x00f2 }
        if (r3 == 0) goto L_0x000d;
    L_0x004f:
        r0 = r8;
        r0 = (java.lang.Long) r0;	 Catch:{ IllegalArgumentException -> 0x00f4 }
        r2 = r0;
        r4 = r2.longValue();	 Catch:{ IllegalArgumentException -> 0x00f4 }
        r6.k(r4);	 Catch:{ IllegalArgumentException -> 0x00f4 }
        if (r3 == 0) goto L_0x000d;
    L_0x005c:
        r0 = r8;
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x00f6 }
        r2 = r0;
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x00f6 }
        r6.n(r2);	 Catch:{ IllegalArgumentException -> 0x00f6 }
        if (r3 == 0) goto L_0x000d;
    L_0x0069:
        r0 = r8;
        r0 = (java.lang.Boolean) r0;	 Catch:{ IllegalArgumentException -> 0x00f8 }
        r2 = r0;
        r2 = r2.booleanValue();	 Catch:{ IllegalArgumentException -> 0x00f8 }
        r6.b(r2);	 Catch:{ IllegalArgumentException -> 0x00f8 }
        if (r3 == 0) goto L_0x000d;
    L_0x0076:
        r0 = r8;
        r0 = (java.lang.String) r0;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r2 = r0;
        r6.a(r2);	 Catch:{ IllegalArgumentException -> 0x00fa }
        if (r3 == 0) goto L_0x000d;
    L_0x007f:
        r0 = r8;
        r0 = (com.google.a1) r0;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r2 = r0;
        r6.c(r2);	 Catch:{ IllegalArgumentException -> 0x00fc }
        if (r3 == 0) goto L_0x000d;
    L_0x0088:
        r0 = r8;
        r0 = (com.google.a1) r0;	 Catch:{ IllegalArgumentException -> 0x00fe }
        r2 = r0;
        r6.d(r2);	 Catch:{ IllegalArgumentException -> 0x00fe }
        if (r3 == 0) goto L_0x000d;
    L_0x0091:
        r0 = r8;
        r0 = (com.google.g2) r0;	 Catch:{ IllegalArgumentException -> 0x0100 }
        r2 = r0;
        r6.c(r2);	 Catch:{ IllegalArgumentException -> 0x0100 }
        if (r3 == 0) goto L_0x000d;
    L_0x009a:
        r0 = r8;
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x0102 }
        r2 = r0;
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x0102 }
        r6.l(r2);	 Catch:{ IllegalArgumentException -> 0x0102 }
        if (r3 == 0) goto L_0x000d;
    L_0x00a7:
        r0 = r8;
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x0104 }
        r2 = r0;
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x0104 }
        r6.k(r2);	 Catch:{ IllegalArgumentException -> 0x0104 }
        if (r3 == 0) goto L_0x000d;
    L_0x00b4:
        r0 = r8;
        r0 = (java.lang.Long) r0;	 Catch:{ IllegalArgumentException -> 0x0106 }
        r2 = r0;
        r4 = r2.longValue();	 Catch:{ IllegalArgumentException -> 0x0106 }
        r6.g(r4);	 Catch:{ IllegalArgumentException -> 0x0106 }
        if (r3 == 0) goto L_0x000d;
    L_0x00c1:
        r0 = r8;
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x0108 }
        r2 = r0;
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x0108 }
        r6.r(r2);	 Catch:{ IllegalArgumentException -> 0x0108 }
        if (r3 == 0) goto L_0x000d;
    L_0x00ce:
        r0 = r8;
        r0 = (java.lang.Long) r0;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r2 = r0;
        r4 = r2.longValue();	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r6.m(r4);	 Catch:{ IllegalArgumentException -> 0x00e6 }
        if (r3 == 0) goto L_0x000d;
    L_0x00db:
        r8 = (com.google.bZ) r8;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r2 = r8.getNumber();	 Catch:{ IllegalArgumentException -> 0x00e6 }
        r6.i(r2);	 Catch:{ IllegalArgumentException -> 0x00e6 }
        goto L_0x000d;
    L_0x00e6:
        r2 = move-exception;
        throw r2;
    L_0x00e8:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00ea }
    L_0x00ea:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00ec }
    L_0x00ec:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00ee }
    L_0x00ee:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00f0 }
    L_0x00f0:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00f2 }
    L_0x00f2:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00f4 }
    L_0x00f4:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00f6 }
    L_0x00f6:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00f8 }
    L_0x00f8:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00fa }
    L_0x00fa:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00fc }
    L_0x00fc:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00fe }
    L_0x00fe:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0100 }
    L_0x0100:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0102 }
    L_0x0102:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0104 }
    L_0x0104:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0106 }
    L_0x0106:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0108 }
    L_0x0108:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.co.a(com.google.bF, com.google.bJ, java.lang.Object):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map d() {
        /*
        r4_this = this;
        r2 = com.google.dy.b;
        r0 = r4.c;
        if (r0 == 0) goto L_0x004c;
    L_0x0006:
        r0 = 16;
        r1 = com.google.dk.b(r0);
        r0 = 0;
    L_0x000d:
        r3 = r4.a;
        r3 = r3.e();
        if (r0 >= r3) goto L_0x0022;
    L_0x0015:
        r3 = r4.a;
        r3 = r3.c(r0);
        r4.a(r1, r3);
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x000d;
    L_0x0022:
        r0 = r4.a;
        r0 = r0.f();
        r3 = r0.iterator();
    L_0x002c:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x003d;
    L_0x0032:
        r0 = r3.next();
        r0 = (java.util.Map.Entry) r0;
        r4.a(r1, r0);
        if (r2 == 0) goto L_0x002c;
    L_0x003d:
        r0 = r4.a;	 Catch:{ IllegalArgumentException -> 0x004a }
        r0 = r0.g();	 Catch:{ IllegalArgumentException -> 0x004a }
        if (r0 == 0) goto L_0x0048;
    L_0x0045:
        r1.c();	 Catch:{ IllegalArgumentException -> 0x004a }
    L_0x0048:
        r0 = r1;
    L_0x0049:
        return r0;
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = r4.a;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r0 = r0.g();	 Catch:{ IllegalArgumentException -> 0x0057 }
        if (r0 == 0) goto L_0x0059;
    L_0x0054:
        r0 = r4.a;	 Catch:{ IllegalArgumentException -> 0x0057 }
        goto L_0x0049;
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        r0 = r4.a;
        r0 = java.util.Collections.unmodifiableMap(r0);
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.co.d():java.util.Map");
    }

    static int a(bJ bJVar, boolean z) {
        return z ? 2 : bJVar.getWireType();
    }

    public void b(bF bFVar) {
        boolean z = dy.b;
        int i = 0;
        while (i < this.a.e()) {
            a(this.a.c(i), bFVar);
            i++;
            if (z) {
                break;
            }
        }
        for (Entry entry : this.a.f()) {
            a(entry, bFVar);
            if (z) {
                return;
            }
        }
    }

    private static int a(bJ bJVar, int i, Object obj) {
        int h = bF.h(i);
        if (bJVar == bJ.GROUP) {
            h *= 2;
        }
        return h + b(bJVar, obj);
    }

    public void a(bF bFVar) {
        boolean z = dy.b;
        int i = 0;
        while (i < this.a.e()) {
            Entry c = this.a.c(i);
            a((eY) c.getKey(), c.getValue(), bFVar);
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        for (Entry entry : this.a.f()) {
            a((eY) entry.getKey(), entry.getValue(), bFVar);
            if (z) {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.util.Map.Entry r9) {
        /*
        r8_this = this;
        r5 = com.google.dy.b;
        r1 = r9.getKey();
        r1 = (com.google.eY) r1;
        r2 = r9.getValue();
        r3 = r2 instanceof com.google.f3;
        if (r3 == 0) goto L_0x007b;
    L_0x0010:
        r2 = (com.google.f3) r2;
        r3 = r2.a();
    L_0x0016:
        r2 = r1.a();
        if (r2 == 0) goto L_0x003f;
    L_0x001c:
        r4 = r8.b(r1);
        if (r4 != 0) goto L_0x0032;
    L_0x0022:
        r6 = r8.a;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r7 = new java.util.ArrayList;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r0 = r3;
        r0 = (java.util.List) r0;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r0;
        r7.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r6.a(r1, r7);	 Catch:{ IllegalArgumentException -> 0x0073 }
        if (r5 == 0) goto L_0x003d;
    L_0x0032:
        r0 = r4;
        r0 = (java.util.List) r0;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r0;
        r0 = r3;
        r0 = (java.util.List) r0;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r4 = r0;
        r2.addAll(r4);	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x003d:
        if (r5 == 0) goto L_0x0072;
    L_0x003f:
        r2 = r1.c();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r4 = com.google.cc.MESSAGE;	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r2 != r4) goto L_0x006d;
    L_0x0047:
        r2 = r8.b(r1);
        if (r2 != 0) goto L_0x0054;
    L_0x004d:
        r4 = r8.a;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r4.a(r1, r3);	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r5 == 0) goto L_0x006b;
    L_0x0054:
        r4 = r8.a;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = (com.google.a1) r2;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r6 = r2.a();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0 = r3;
        r0 = (com.google.a1) r0;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r0;
        r2 = r1.a(r6, r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r2.b();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r4.a(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x006b:
        if (r5 == 0) goto L_0x0072;
    L_0x006d:
        r2 = r8.a;	 Catch:{ IllegalArgumentException -> 0x0079 }
        r2.a(r1, r3);	 Catch:{ IllegalArgumentException -> 0x0079 }
    L_0x0072:
        return;
    L_0x0073:
        r1 = move-exception;
        throw r1;
    L_0x0075:
        r1 = move-exception;
        throw r1;
    L_0x0077:
        r1 = move-exception;
        throw r1;
    L_0x0079:
        r1 = move-exception;
        throw r1;
    L_0x007b:
        r3 = r2;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.co.b(java.util.Map$Entry):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int c(java.util.Map.Entry r6) {
        /*
        r5_this = this;
        r1 = r6.getKey();
        r1 = (com.google.eY) r1;
        r2 = r6.getValue();
        r3 = r1.c();	 Catch:{ IllegalArgumentException -> 0x0035 }
        r4 = com.google.cc.MESSAGE;	 Catch:{ IllegalArgumentException -> 0x0035 }
        if (r3 != r4) goto L_0x004e;
    L_0x0012:
        r3 = r1.a();	 Catch:{ IllegalArgumentException -> 0x0037 }
        if (r3 != 0) goto L_0x004e;
    L_0x0018:
        r3 = r1.b();	 Catch:{ IllegalArgumentException -> 0x0039 }
        if (r3 != 0) goto L_0x004e;
    L_0x001e:
        r1 = r2 instanceof com.google.f3;	 Catch:{ IllegalArgumentException -> 0x003b }
        if (r1 == 0) goto L_0x003d;
    L_0x0022:
        r1 = r6.getKey();	 Catch:{ IllegalArgumentException -> 0x003b }
        r1 = (com.google.eY) r1;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r1.e();	 Catch:{ IllegalArgumentException -> 0x003b }
        r0 = r2;
        r0 = (com.google.f3) r0;	 Catch:{ IllegalArgumentException -> 0x003b }
        r1 = r0;
        r1 = com.google.bF.a(r3, r1);	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x0034:
        return r1;
    L_0x0035:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0037 }
    L_0x0037:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0039 }
    L_0x0039:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r1 = move-exception;
        throw r1;
    L_0x003d:
        r1 = r6.getKey();
        r1 = (com.google.eY) r1;
        r1 = r1.e();
        r2 = (com.google.a1) r2;
        r1 = com.google.bF.b(r1, r2);
        goto L_0x0034;
    L_0x004e:
        r1 = a(r1, r2);
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.co.c(java.util.Map$Entry):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.google.eY r8, java.lang.Object r9, com.google.bF r10) {
        /*
        r3 = com.google.dy.b;
        r4 = r8.d();
        r5 = r8.e();
        r1 = r8.a();
        if (r1 == 0) goto L_0x0060;
    L_0x0010:
        r1 = r9;
        r1 = (java.util.List) r1;
        r2 = r8.b();
        if (r2 == 0) goto L_0x004b;
    L_0x0019:
        r2 = 2;
        r10.b(r5, r2);
        r2 = 0;
        r6 = r1.iterator();
    L_0x0022:
        r7 = r6.hasNext();
        if (r7 == 0) goto L_0x0033;
    L_0x0028:
        r7 = r6.next();
        r7 = b(r4, r7);
        r2 = r2 + r7;
        if (r3 == 0) goto L_0x0022;
    L_0x0033:
        r10.b(r2);
        r2 = r1.iterator();
    L_0x003a:
        r6 = r2.hasNext();
        if (r6 == 0) goto L_0x0049;
    L_0x0040:
        r6 = r2.next();
        a(r10, r4, r6);
        if (r3 == 0) goto L_0x003a;
    L_0x0049:
        if (r3 == 0) goto L_0x005e;
    L_0x004b:
        r1 = r1.iterator();
    L_0x004f:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x005e;
    L_0x0055:
        r2 = r1.next();
        a(r10, r4, r5, r2);
        if (r3 == 0) goto L_0x004f;
    L_0x005e:
        if (r3 == 0) goto L_0x0074;
    L_0x0060:
        r1 = r9 instanceof com.google.f3;	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r1 == 0) goto L_0x0071;
    L_0x0064:
        r0 = r9;
        r0 = (com.google.f3) r0;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1 = r0;
        r1 = r1.a();	 Catch:{ IllegalArgumentException -> 0x0077 }
        a(r10, r4, r5, r1);	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r3 == 0) goto L_0x0074;
    L_0x0071:
        a(r10, r4, r5, r9);	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0074:
        return;
    L_0x0075:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0077:
        r1 = move-exception;
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.co.a(com.google.eY, java.lang.Object, com.google.bF):void");
    }

    public void h() {
        try {
            if (!this.b) {
                this.a.c();
                this.b = true;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean a() {
        return this.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.bJ r4, java.lang.Object r5) {
        /*
        r0 = 0;
        r2 = com.google.dy.b;
        if (r5 != 0) goto L_0x000d;
    L_0x0005:
        r0 = new java.lang.NullPointerException;	 Catch:{ IllegalArgumentException -> 0x000b }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x000b }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x000b }
    L_0x000b:
        r0 = move-exception;
        throw r0;
    L_0x000d:
        r1 = com.google.cE.b;
        r3 = r4.getJavaType();
        r3 = r3.ordinal();
        r1 = r1[r3];
        switch(r1) {
            case 1: goto L_0x002c;
            case 2: goto L_0x0030;
            case 3: goto L_0x0034;
            case 4: goto L_0x0038;
            case 5: goto L_0x003c;
            case 6: goto L_0x0040;
            case 7: goto L_0x0044;
            case 8: goto L_0x0048;
            case 9: goto L_0x004c;
            default: goto L_0x001c;
        };
    L_0x001c:
        if (r0 != 0) goto L_0x005a;
    L_0x001e:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x002a }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x002a }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x002a }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x002a }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r1 = r5 instanceof java.lang.Integer;
        if (r2 == 0) goto L_0x005b;
    L_0x0030:
        r1 = r5 instanceof java.lang.Long;
        if (r2 == 0) goto L_0x005b;
    L_0x0034:
        r1 = r5 instanceof java.lang.Float;
        if (r2 == 0) goto L_0x005b;
    L_0x0038:
        r1 = r5 instanceof java.lang.Double;
        if (r2 == 0) goto L_0x005b;
    L_0x003c:
        r1 = r5 instanceof java.lang.Boolean;
        if (r2 == 0) goto L_0x005b;
    L_0x0040:
        r1 = r5 instanceof java.lang.String;
        if (r2 == 0) goto L_0x005b;
    L_0x0044:
        r1 = r5 instanceof com.google.g2;
        if (r2 == 0) goto L_0x005b;
    L_0x0048:
        r1 = r5 instanceof com.google.bZ;
        if (r2 == 0) goto L_0x005b;
    L_0x004c:
        r1 = r5 instanceof com.google.a1;	 Catch:{ IllegalArgumentException -> 0x0056 }
        if (r1 != 0) goto L_0x0054;
    L_0x0050:
        r1 = r5 instanceof com.google.f3;	 Catch:{ IllegalArgumentException -> 0x0058 }
        if (r1 == 0) goto L_0x001c;
    L_0x0054:
        r0 = 1;
        goto L_0x001c;
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        return;
    L_0x005b:
        r0 = r1;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.co.a(com.google.bJ, java.lang.Object):void");
    }

    private static int b(bJ bJVar, Object obj) {
        try {
            switch (cE.a[bJVar.ordinal()]) {
                case ay.f /*1*/:
                    return bF.a(((Double) obj).doubleValue());
                case ay.n /*2*/:
                    return bF.b(((Float) obj).floatValue());
                case ay.p /*3*/:
                    return bF.h(((Long) obj).longValue());
                case aj.i /*4*/:
                    return bF.f(((Long) obj).longValue());
                case aV.r /*5*/:
                    return bF.p(((Integer) obj).intValue());
                case aV.i /*6*/:
                    return bF.a(((Long) obj).longValue());
                case a8.s /*7*/:
                    return bF.a(((Integer) obj).intValue());
                case a8.n /*8*/:
                    return bF.a(((Boolean) obj).booleanValue());
                case a6.D /*9*/:
                    return bF.b((String) obj);
                case a6.h /*10*/:
                    return bF.a((g2) obj);
                case a6.e /*11*/:
                    return bF.m(((Integer) obj).intValue());
                case a6.s /*12*/:
                    return bF.e(((Integer) obj).intValue());
                case a6.z /*13*/:
                    return bF.j(((Long) obj).longValue());
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    return bF.c(((Integer) obj).intValue());
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    return bF.b(((Long) obj).longValue());
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    return bF.a((a1) obj);
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    try {
                        return obj instanceof f3 ? bF.a((f3) obj) : bF.b((a1) obj);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    return bF.f(((bZ) obj).getNumber());
                default:
                    throw new RuntimeException(z[4]);
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
        throw e2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.Map.Entry r4, com.google.bF r5) {
        /*
        r3_this = this;
        r0 = r4.getKey();
        r0 = (com.google.eY) r0;
        r1 = r0.c();	 Catch:{ IllegalArgumentException -> 0x0039 }
        r2 = com.google.cc.MESSAGE;	 Catch:{ IllegalArgumentException -> 0x0039 }
        if (r1 != r2) goto L_0x0031;
    L_0x000e:
        r1 = r0.a();	 Catch:{ IllegalArgumentException -> 0x003b }
        if (r1 != 0) goto L_0x0031;
    L_0x0014:
        r1 = r0.b();	 Catch:{ IllegalArgumentException -> 0x003d }
        if (r1 != 0) goto L_0x0031;
    L_0x001a:
        r1 = r4.getKey();	 Catch:{ IllegalArgumentException -> 0x003f }
        r1 = (com.google.eY) r1;	 Catch:{ IllegalArgumentException -> 0x003f }
        r2 = r1.e();	 Catch:{ IllegalArgumentException -> 0x003f }
        r1 = r4.getValue();	 Catch:{ IllegalArgumentException -> 0x003f }
        r1 = (com.google.a1) r1;	 Catch:{ IllegalArgumentException -> 0x003f }
        r5.f(r2, r1);	 Catch:{ IllegalArgumentException -> 0x003f }
        r1 = com.google.dy.b;	 Catch:{ IllegalArgumentException -> 0x003f }
        if (r1 == 0) goto L_0x0038;
    L_0x0031:
        r1 = r4.getValue();	 Catch:{ IllegalArgumentException -> 0x003f }
        a(r0, r1, r5);	 Catch:{ IllegalArgumentException -> 0x003f }
    L_0x0038:
        return;
    L_0x0039:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.co.a(java.util.Map$Entry, com.google.bF):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(com.google.eY r6, java.lang.Object r7) {
        /*
        r5_this = this;
        r1 = com.google.dy.b;
        r0 = r6.a();	 Catch:{ IllegalArgumentException -> 0x0019 }
        if (r0 == 0) goto L_0x0056;
    L_0x0008:
        r0 = r7 instanceof java.util.List;	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r0 != 0) goto L_0x001b;
    L_0x000c:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0017 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0017 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x001b:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r7 = (java.util.List) r7;
        r0.addAll(r7);
        r2 = r0.iterator();
    L_0x0029:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x003c;
    L_0x002f:
        r3 = r2.next();
        r4 = r6.d();
        a(r4, r3);
        if (r1 == 0) goto L_0x0029;
    L_0x003c:
        if (r1 == 0) goto L_0x0045;
    L_0x003e:
        r1 = r6.d();	 Catch:{ IllegalArgumentException -> 0x0052 }
        a(r1, r0);	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0045:
        r1 = r0 instanceof com.google.f3;	 Catch:{ IllegalArgumentException -> 0x0054 }
        if (r1 == 0) goto L_0x004c;
    L_0x0049:
        r1 = 1;
        r5.c = r1;	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x004c:
        r1 = r5.a;
        r1.a(r6, r0);
        return;
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r0 = r7;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.co.c(com.google.eY, java.lang.Object):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.util.Map.Entry r7) {
        /*
        r6_this = this;
        r2 = 1;
        r1 = 0;
        r3 = com.google.dy.b;
        r0 = r7.getKey();
        r0 = (com.google.eY) r0;
        r4 = r0.c();	 Catch:{ IllegalArgumentException -> 0x0036 }
        r5 = com.google.cc.MESSAGE;	 Catch:{ IllegalArgumentException -> 0x0036 }
        if (r4 != r5) goto L_0x0067;
    L_0x0012:
        r0 = r0.a();	 Catch:{ IllegalArgumentException -> 0x0036 }
        if (r0 == 0) goto L_0x003e;
    L_0x0018:
        r0 = r7.getValue();
        r0 = (java.util.List) r0;
        r4 = r0.iterator();
    L_0x0022:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x003c;
    L_0x0028:
        r0 = r4.next();
        r0 = (com.google.a1) r0;
        r0 = r0.a();	 Catch:{ IllegalArgumentException -> 0x0038 }
        if (r0 != 0) goto L_0x003a;
    L_0x0034:
        r0 = r1;
    L_0x0035:
        return r0;
    L_0x0036:
        r0 = move-exception;
        throw r0;
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        if (r3 == 0) goto L_0x0022;
    L_0x003c:
        if (r3 == 0) goto L_0x0067;
    L_0x003e:
        r0 = r7.getValue();
        r3 = r0 instanceof com.google.a1;	 Catch:{ IllegalArgumentException -> 0x0050 }
        if (r3 == 0) goto L_0x0054;
    L_0x0046:
        r0 = (com.google.a1) r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
        r0 = r0.a();	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r0 != 0) goto L_0x0067;
    L_0x004e:
        r0 = r1;
        goto L_0x0035;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = r0 instanceof com.google.f3;	 Catch:{ IllegalArgumentException -> 0x005a }
        if (r0 == 0) goto L_0x005c;
    L_0x0058:
        r0 = r2;
        goto L_0x0035;
    L_0x005a:
        r0 = move-exception;
        throw r0;
    L_0x005c:
        r0 = new java.lang.IllegalArgumentException;
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0067:
        r0 = r2;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.co.a(java.util.Map$Entry):boolean");
    }

    public Object b(eY eYVar) {
        Object obj = this.a.get(eYVar);
        try {
            if (obj instanceof f3) {
                obj = ((f3) obj).a();
            }
            return obj;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void a(co coVar) {
        boolean z = dy.b;
        int i = 0;
        while (i < coVar.a.e()) {
            b(coVar.a.c(i));
            i++;
            if (z) {
                break;
            }
        }
        for (Entry entry : coVar.a.f()) {
            b(entry);
            if (z) {
                return;
            }
        }
    }

    public Iterator e() {
        try {
            return this.c ? new gZ(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static co f() {
        return d;
    }

    public static int a(eY eYVar, Object obj) {
        int i = 0;
        boolean z = dy.b;
        bJ d = eYVar.d();
        int e = eYVar.e();
        try {
            if (!eYVar.a()) {
                return a(d, e, obj);
            }
            if (eYVar.b()) {
                for (Object obj2 : (List) obj) {
                    i += b(d, obj2);
                    if (z) {
                        break;
                    }
                }
                return bF.o(i) + (bF.h(e) + i);
            }
            for (Object obj22 : (List) obj) {
                i += a(d, e, obj22);
                if (z) {
                    return i;
                }
            }
            return i;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public co g() {
        boolean z = dy.b;
        co i = i();
        int i2 = 0;
        while (i2 < this.a.e()) {
            Entry c = this.a.c(i2);
            i.c((eY) c.getKey(), c.getValue());
            int i3 = i2 + 1;
            if (z) {
                break;
            }
            i2 = i3;
        }
        for (Entry entry : this.a.f()) {
            i.c((eY) entry.getKey(), entry.getValue());
            if (z) {
                break;
            }
        }
        i.c = this.c;
        return i;
    }

    private co(boolean z) {
        this.c = false;
        this.a = dk.b(0);
        h();
    }
}
