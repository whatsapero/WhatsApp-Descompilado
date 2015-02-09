package com.whatsapp.protocol;

import java.io.InputStream;
import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class bi {
    private static final String[] z;
    public InputStream a;
    public final byte[] b;
    public final k[] c;
    public int d;
    public final bi[] e;
    public final String f;

    static {
        String[] strArr = new String[9];
        String str = "\u000e-USX\flNZL\u001d%NZ\u0013H\"S[XH%O\u001fS\u001d P";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 104;
                        break;
                    case ay.f /*1*/:
                        i3 = 76;
                        break;
                    case ay.n /*2*/:
                        i3 = 60;
                        break;
                    case ay.p /*3*/:
                        i3 = 63;
                        break;
                    default:
                        i3 = 61;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\t8HMT\n9HZ\u001d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u000e-USX\flNZL\u001d%NZ\u0013H\"S[XRl";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "H?HMT\u0006+\u0006\u001f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "H%O\u001fS\u00078\u001cVS\u001c)[M\\\u0004v\u001c";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\t8HMT\n9HZ\u001d";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "OlQVN\u001b%RX";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001a)MJT\u001a)X\u001f\\\u001c8NV_\u001d8Y\u001f\u001a";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "H%O\u001fS\u00078\u001cVS\u001c)[M\\\u0004v\u001c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public bi(String str, k[] kVarArr, byte[] bArr) {
        this.a = null;
        this.f = str;
        this.c = kVarArr;
        this.e = null;
        this.b = bArr;
    }

    public String e(String str) {
        String a = a(str, null);
        if (a != null) {
            return a;
        }
        try {
            throw new l(z[8] + str + z[7]);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static bi a(bi biVar) {
        if (biVar != null) {
            return biVar;
        }
        try {
            throw new l(z[0]);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public String a(String str, String str2) {
        boolean z = n;
        try {
            if (this.c != null) {
                int i = 0;
                while (i < this.c.length) {
                    k kVar = this.c[i];
                    try {
                        if (!str.equals(kVar.b)) {
                            i++;
                            if (z) {
                                break;
                            }
                        }
                        str2 = kVar.a;
                        break;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
            return str2;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public int c(String str) {
        String e = e(str);
        try {
            return Integer.parseInt(e);
        } catch (NumberFormatException e2) {
            throw new l(z[6] + str + z[5] + e);
        }
    }

    public bi(String str, k[] kVarArr, String str2) {
        this.a = null;
        this.f = str;
        this.c = kVarArr;
        this.e = null;
        try {
            if (str2 != null) {
                this.b = f.a(str2);
                if (!n) {
                    return;
                }
            }
            this.b = null;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public bi(String str, k[] kVarArr, bi biVar) {
        this.a = null;
        this.f = str;
        this.c = kVarArr;
        this.e = new bi[]{biVar};
        this.b = null;
    }

    public static void b(bi biVar, String str) {
        try {
            if (!a(biVar, str)) {
                throw new l(z[3] + biVar + z[4] + str);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public String a() {
        try {
            return this.b == null ? null : f.a(this.b);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public bi a(int i) {
        try {
            if (this.e != null) {
                if (this.e.length > i) {
                    try {
                        return this.e[i];
                    }
                }
            }
            return null;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public long a(String str) {
        String e = e(str);
        try {
            return Long.parseLong(e);
        } catch (NumberFormatException e2) {
            throw new l(z[2] + str + z[1] + e);
        }
    }

    public bi d(String str) {
        boolean z = n;
        try {
            if (this.e == null) {
                return null;
            }
            int i = 0;
            while (i < this.e.length) {
                try {
                    if (!str.equals(this.e[i].f)) {
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    return this.e[i];
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            return null;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public bi(String str, k[] kVarArr) {
        this.a = null;
        this.f = str;
        this.c = kVarArr;
        this.e = null;
        this.b = null;
    }

    public Vector f(String str) {
        boolean z = n;
        Vector vector = new Vector();
        try {
            if (this.e == null) {
                return vector;
            }
            int i = 0;
            while (i < this.e.length) {
                try {
                    if (str.equals(this.e[i].f)) {
                        vector.addElement(this.e[i]);
                    }
                    i++;
                    if (z) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            return vector;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public String b(String str) {
        return a(str, null);
    }

    public bi(String str, k[] kVarArr, bi[] biVarArr) {
        this.a = null;
        this.f = str;
        this.c = kVarArr;
        this.e = biVarArr;
        this.b = null;
    }

    public bi(String str, k[] kVarArr, InputStream inputStream, int i) {
        this.a = null;
        this.f = str;
        this.c = kVarArr;
        this.e = null;
        this.b = null;
        this.a = inputStream;
        this.d = i;
    }

    public static boolean a(bi biVar, String str) {
        if (biVar != null) {
            try {
                if (biVar.f != null) {
                    if (biVar.f.equals(str)) {
                        return true;
                    }
                }
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        try {
            return false;
        }
    }
}
