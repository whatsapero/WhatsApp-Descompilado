package com;

import android.os.Build;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.util.Log;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandomSpi;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class c extends SecureRandomSpi {
    private static final File b;
    private static DataInputStream c;
    private static final Object d;
    private static OutputStream e;
    private static final String[] z;
    private boolean a;

    private OutputStream a() {
        OutputStream outputStream;
        synchronized (d) {
            if (e == null) {
                e = new FileOutputStream(b);
            }
            outputStream = e;
        }
        return outputStream;
    }

    protected byte[] engineGenerateSeed(int i) {
        byte[] bArr = new byte[i];
        engineNextBytes(bArr);
        return bArr;
    }

    private DataInputStream b() {
        DataInputStream dataInputStream;
        synchronized (d) {
            try {
                if (c == null) {
                    c = new DataInputStream(new FileInputStream(b));
                }
                dataInputStream = c;
            } catch (Throwable e) {
                throw new SecurityException(z[2] + b + z[1], e);
            } catch (Throwable th) {
            }
        }
        return dataInputStream;
    }

    static {
        String[] strArr = new String[7];
        String str = "W0=\u001b\u0010uq \u0018Uc45\u0013Uw#;\u001aU";
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
                        i3 = 17;
                        break;
                    case ay.f /*1*/:
                        i3 = 81;
                        break;
                    case ay.n /*2*/:
                        i3 = 84;
                        break;
                    case ay.p /*3*/:
                        i3 = 119;
                        break;
                    default:
                        i3 = 117;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "W0=\u001b\u0010uq \u0018U~!1\u0019U";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "u4\"\u001e\u0016tq=\u0004U|0:\u0002\u0013p2 \u0002\u0007t5t\u0015\f1\u00025\u001a\u0006d?3LUd?5\u0015\u0019tq \u0018Ub41\u0013UA\u0003\u001a0Uw88\u0012U";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "b09\u0004\u0000\u007f6";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "d?5\u0015\u0019tq \u0018Ub41\u0013UA\u0003\u001a0";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ">51\u0001Zd#5\u0019\u0011~<";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = new File(z[6]);
                    d = new Object();
                default:
                    strArr2[i] = str;
                    str = "17;\u0005Uc45\u0013\u001c\u007f6";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void engineNextBytes(byte[] bArr) {
        boolean z = false;
        int i = b.a;
        try {
            if (!this.a) {
                engineSetSeed(b.a());
            }
            try {
                DataInputStream b;
                synchronized (d) {
                    b = b();
                }
                synchronized (b) {
                    b.readFully(bArr);
                }
                if (i != 0) {
                    try {
                        if (!DialogToastActivity.i) {
                            z = true;
                        }
                        DialogToastActivity.i = z;
                    } catch (IOException e) {
                        throw e;
                    }
                }
            } catch (Throwable e2) {
                throw new SecurityException(z[0] + b, e2);
            } catch (Throwable th) {
                while (true) {
                    break;
                }
            }
        } catch (IOException e3) {
            throw e3;
        }
    }

    protected void engineSetSeed(byte[] bArr) {
        try {
            if (z[4].equalsIgnoreCase(Build.MANUFACTURER)) {
                Log.w(z[3] + b);
                this.a = true;
                return;
            }
            try {
                OutputStream a;
                synchronized (d) {
                    a = a();
                }
                a.write(bArr);
                a.flush();
                this.a = true;
            } catch (Throwable e) {
                Log.c(z[5], e);
            }
        } catch (IOException e2) {
            throw e2;
        }
    }
}
