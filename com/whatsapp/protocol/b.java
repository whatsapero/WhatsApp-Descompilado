package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class b {
    private static final String[] P;
    private static final String c;
    public static final int[] d;
    private static final Object f;
    private static int h;
    public static boolean n;
    public Object A;
    private boolean B;
    public String[] C;
    public long D;
    private int E;
    public String F;
    public double G;
    public String H;
    public int I;
    public String J;
    public double K;
    private byte[] L;
    public long M;
    public boolean N;
    public int O;
    public int a;
    private byte[] b;
    public m e;
    public String g;
    public boolean i;
    public byte j;
    public long k;
    public boolean l;
    public String m;
    public String o;
    public int p;
    public String q;
    public Integer r;
    public String s;
    public String t;
    public String u;
    public String v;
    public int w;
    private String x;
    public int y;
    public String z;

    public b(m mVar) {
        this.i = true;
        this.r = null;
        this.e = mVar;
    }

    public b(String str, byte[] bArr, Object obj) {
        this(str, true);
        this.b = bArr;
        this.A = obj;
        this.D = System.currentTimeMillis();
    }

    public String f() {
        try {
            if (this.O == 1) {
                throw new RuntimeException(P[0]);
            }
            try {
                if (this.x == null) {
                    if (this.b != null) {
                        this.x = f.a(this.b);
                    }
                }
                return this.x;
            } catch (RuntimeException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    public void a(int i) {
        if (i < 0 || i > 1) {
            try {
                throw new IllegalArgumentException();
            } catch (RuntimeException e) {
                throw e;
            }
        }
        this.E = i;
    }

    public b(b bVar) {
        this(bVar.e);
        this.F = bVar.F;
        this.m = bVar.m;
        this.x = bVar.x;
        this.b = bVar.b;
        this.L = bVar.L;
        this.E = bVar.E;
        this.O = bVar.O;
        this.D = bVar.D;
        this.w = bVar.w;
        this.t = bVar.t;
        this.o = bVar.o;
        this.s = bVar.s;
        this.j = bVar.j;
        this.k = bVar.k;
        this.z = bVar.z;
        this.p = bVar.p;
        this.H = bVar.H;
        this.v = bVar.v;
        this.N = bVar.N;
        this.K = bVar.K;
        this.G = bVar.G;
        this.J = bVar.J;
        this.l = bVar.l;
        this.y = bVar.y;
        this.M = bVar.M;
        this.g = bVar.g;
        this.u = bVar.u;
        this.A = bVar.A;
        this.i = bVar.i;
        this.r = bVar.r;
    }

    public byte[] c() {
        try {
            if (this.b == null) {
                if (this.x != null) {
                    this.b = f.a(this.x);
                }
            }
            return this.b;
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public static byte a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    try {
                        if (str.equalsIgnoreCase(P[3])) {
                            return (byte) 7;
                        }
                        try {
                            if (str.equalsIgnoreCase(P[4])) {
                                return (byte) 1;
                            }
                            try {
                                if (str.equalsIgnoreCase(P[5])) {
                                    return (byte) 2;
                                }
                                try {
                                    if (str.equalsIgnoreCase(P[1])) {
                                        return (byte) 3;
                                    }
                                    try {
                                        if (str.equalsIgnoreCase(P[2])) {
                                            return (byte) 4;
                                        }
                                        try {
                                            return str.equalsIgnoreCase(P[6]) ? (byte) 5 : (byte) 0;
                                        } catch (RuntimeException e) {
                                            throw e;
                                        }
                                    } catch (RuntimeException e2) {
                                        throw e2;
                                    }
                                } catch (RuntimeException e22) {
                                    throw e22;
                                }
                            } catch (RuntimeException e222) {
                                throw e222;
                            }
                        } catch (RuntimeException e2222) {
                            throw e2222;
                        }
                    } catch (RuntimeException e22222) {
                        throw e22222;
                    }
                }
            } catch (RuntimeException e222222) {
                throw e222222;
            }
        }
        return (byte) 0;
    }

    public b(String str, String str2, Object obj) {
        this(str, true);
        this.x = str2;
        this.A = obj;
        this.D = System.currentTimeMillis();
    }

    public byte[] d() {
        return this.L;
    }

    public boolean b() {
        return this.B;
    }

    public void b(byte[] bArr) {
        this.b = bArr;
        this.x = null;
    }

    public static String a(byte b) {
        String str = null;
        if (b != null) {
            if (b == 7) {
                try {
                    str = P[10];
                } catch (RuntimeException e) {
                    throw e;
                }
            } else if (b == 1) {
                try {
                    str = P[9];
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } else if (b == 2) {
                try {
                    str = P[7];
                } catch (RuntimeException e22) {
                    throw e22;
                }
            } else if (b == 3) {
                try {
                    str = P[8];
                } catch (RuntimeException e222) {
                    throw e222;
                }
            } else if (b == 4) {
                try {
                    str = P[12];
                } catch (RuntimeException e2222) {
                    throw e2222;
                }
            } else if (b == 5) {
                try {
                    str = P[11];
                } catch (RuntimeException e22222) {
                    throw e22222;
                }
            }
        }
        return str;
    }

    public void b(String str) {
        this.x = str;
        this.b = null;
    }

    private b(String str, boolean z) {
        this.i = true;
        this.r = null;
        this.e = a(str, z);
    }

    public static m a(String str, boolean z) {
        m mVar;
        synchronized (f) {
            h++;
            mVar = new m(str, z, c + Integer.toString(h));
        }
        return mVar;
    }

    public void a(byte[] bArr) {
        this.L = bArr;
    }

    static {
        String[] strArr = new String[13];
        String str = "I\u000fU]WZ]X[\u0019Z\u0018X\u0014]\\\tM\u0014XN]XQAI]CZ\u0019O\u001c[\u0014TX\u000e_U^X";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 61;
                        break;
                    case ay.f /*1*/:
                        i4 = 125;
                        break;
                    case ay.n /*2*/:
                        i4 = 44;
                        break;
                    case ay.p /*3*/:
                        i4 = 52;
                        break;
                    default:
                        i4 = 57;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "K\u001eMF]";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "N\u0004_@\\P";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "T\u0010MS\\";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\\\bH]V";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "Q\u0012OUMT\u0012B";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\\\bH]V";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "K\u0014HQV";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "T\u0010MS\\";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "N\u0004_@\\P";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "Q\u0012OUMT\u0012B";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "K\u001eMF]";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    P = strArr3;
                    d = new int[]{14, 0, 1, 2, 3, 4, 5, 11, 12, 13, 8, 9, 10, 7, 6};
                    c = (System.currentTimeMillis() / 1000) + "-";
                    h = 0;
                    f = new Object();
                default:
                    strArr2[i2] = str;
                    str = "K\u0014HQV";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public void a(boolean z) {
        this.B = z;
    }

    public int a() {
        return this.E;
    }

    public boolean e() {
        try {
            if (this.x == null) {
                if (this.b == null) {
                    try {
                        return false;
                    }
                }
            }
            return true;
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }
}
