package com.whatsapp;

import android.database.AbstractCursor;
import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class a1w extends AbstractCursor {
    private static final String[] d;
    private static final String[] z;
    private String a;
    private Cursor b;
    private int c;

    public int getCount() {
        if (this.c < 0) {
            int count = this.b.getCount();
            if (App.az == 0) {
                return count;
            }
        }
        return this.c;
    }

    public Cursor c() {
        return this.b;
    }

    public short getShort(int i) {
        return (short) 0;
    }

    private boolean a() {
        b a = App.aJ.a(c(), this.a);
        if (a.A != null) {
            MediaData mediaData = (MediaData) a.A;
            if ((a.e.b || mediaData.transferred) && mediaData.file != null) {
                Uri fromFile = Uri.fromFile(mediaData.file);
                if (new File(fromFile.getPath()).exists()) {
                    return true;
                }
                fromFile.getPath();
            }
        }
        return false;
    }

    public void close() {
        super.close();
        this.b.close();
    }

    public boolean onMove(int i, int i2) {
        int i3 = -1;
        int i4 = App.az;
        if (i > i2 * 2) {
            this.b.moveToPosition(-1);
        } else {
            i3 = i;
        }
        while (i2 > i3) {
            if (d()) {
                i3++;
                if (i4 != 0) {
                    break;
                }
            }
            onChange(true);
            return false;
        }
        while (i2 < i3) {
            if (b()) {
                i3--;
                if (i4 != 0) {
                    break;
                }
            }
            onChange(true);
            return false;
        }
        return true;
    }

    private boolean d() {
        int i = 0;
        int i2 = App.az;
        boolean z = false;
        while (this.b.moveToNext()) {
            if (a()) {
                if (i2 == 0) {
                    z = true;
                    break;
                }
                z = true;
            }
            i++;
            if (i2 != 0) {
                break;
            }
        }
        if (i > 0) {
            Log.i(z[1] + i);
        }
        if (!z) {
            this.c = getPosition() + 1;
            this.b.moveToPosition(-1);
            Log.i(z[2] + this.c);
        }
        return z;
    }

    public String[] getColumnNames() {
        return d;
    }

    public boolean isNull(int i) {
        return false;
    }

    public int getType(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
            case ay.n /*2*/:
                return 1;
            case ay.f /*1*/:
                return 3;
            case ay.p /*3*/:
                return 3;
            case aj.i /*4*/:
                return 3;
            default:
                return 3;
        }
    }

    public long getLong(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                return c().getLong(0);
            case ay.n /*2*/:
                return App.aJ.a(c(), this.a).D;
            default:
                return 0;
        }
    }

    public a1w(String str, Cursor cursor) {
        this.c = -1;
        this.b = cursor;
        this.a = str;
        moveToPosition(0);
    }

    public double getDouble(int i) {
        return 0.0d;
    }

    public float getFloat(int i) {
        return 0.0f;
    }

    static {
        String[] strArr = new String[5];
        String str = "R09\u001dE\u00147(\u001fG";
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
                        i3 = 59;
                        break;
                    case ay.f /*1*/:
                        i3 = 93;
                        break;
                    case ay.n /*2*/:
                        i3 = 88;
                        break;
                    case ay.p /*3*/:
                        i3 = 122;
                        break;
                    default:
                        i3 = 32;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "V8<\u0013AX(*\tOIr6\u001fXOr*\u001fAW>7\u000fNO}";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "V8<\u0013AX(*\tOIr(\bEMr+\u0011IK}";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "V8<\u0013AX(*\tOIr(\bEMr6\u0015T]2-\u0014D";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    String[] strArr4 = new String[5];
                    i = 0;
                    strArr2 = strArr4;
                    strArr3 = strArr4;
                    str = "d4<";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    str = "d99\u000eA";
                    obj = 5;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    str = "_<,\u001fTZ6=\u0014";
                    obj = 6;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    str = "O4,\u0016E";
                    obj = 7;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    str = "V45\u001f\u007fO$(\u001f";
                    obj = 8;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    d = strArr3;
                default:
                    strArr2[i] = str;
                    str = "V8<\u0013AX(*\tOIr6\u001fXOr+\u0011IK}";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getString(int r4) {
        /*
        r3_this = this;
        r1 = 0;
        switch(r4) {
            case 0: goto L_0x0007;
            case 1: goto L_0x0014;
            case 2: goto L_0x0037;
            case 3: goto L_0x004c;
            case 4: goto L_0x004f;
            default: goto L_0x0004;
        };
    L_0x0004:
        r0 = "";
    L_0x0006:
        return r0;
    L_0x0007:
        r0 = r3.c();
        r0 = r0.getLong(r1);
        r0 = java.lang.Long.toString(r0);
        goto L_0x0006;
    L_0x0014:
        r0 = com.whatsapp.App.aJ;
        r1 = r3.c();
        r2 = r3.a;
        r0 = r0.a(r1, r2);
        if (r0 == 0) goto L_0x0004;
    L_0x0022:
        r0 = r0.A;
        r0 = (com.whatsapp.MediaData) r0;
        if (r0 == 0) goto L_0x0033;
    L_0x0028:
        r1 = r0.file;
        if (r1 == 0) goto L_0x0033;
    L_0x002c:
        r0 = r0.file;
        r0 = r0.getAbsolutePath();
        goto L_0x0006;
    L_0x0033:
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0004;
    L_0x0037:
        r0 = com.whatsapp.App.aJ;
        r1 = r3.c();
        r2 = r3.a;
        r0 = r0.a(r1, r2);
        if (r0 == 0) goto L_0x0004;
    L_0x0045:
        r0 = r0.D;
        r0 = java.lang.Long.toString(r0);
        goto L_0x0006;
    L_0x004c:
        r0 = "";
        goto L_0x0006;
    L_0x004f:
        r0 = z;
        r0 = r0[r1];
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a1w.getString(int):java.lang.String");
    }

    public int getInt(int i) {
        return 0;
    }

    private boolean b() {
        int i = 0;
        int i2 = App.az;
        boolean z = false;
        while (this.b.moveToPrevious()) {
            if (a()) {
                z = true;
                if (i2 == 0) {
                    break;
                }
            }
            i++;
            if (i2 != 0) {
                break;
            }
        }
        if (i > 0) {
            Log.i(z[3] + i);
        }
        if (!z) {
            this.b.moveToPosition(-1);
            Log.i(z[4]);
        }
        return z;
    }
}
