package com.whatsapp;

import android.database.Cursor;
import com.whatsapp.protocol.cz;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a7;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;
import org.whispersystems.libaxolotl.bX;
import org.whispersystems.libaxolotl.u;

public final class y7 implements u {
    private static final String[] z;
    private final te a;

    static {
        String[] strArr = new String[13];
        String str = "L\u0019\u0006\u0010kL\u0011\u0006\u00058|586";
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
                        i3 = 56;
                        break;
                    case ay.f /*1*/:
                        i3 = 112;
                        break;
                    case ay.n /*2*/:
                        i3 = 107;
                        break;
                    case ay.p /*3*/:
                        i3 = 117;
                        break;
                    default:
                        i3 = 24;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "Y\b\u0004\u0019wL\u001cK\u0007}L\u0002\u0002\u0010n]\u0014K\u0019yL\u0015\u0018\u00018K\u0019\f\u001b}\\P\u001b\u0007}S\u0015\u0012Uj]\u0013\u0004\u0007|\u0018\u0003\u001e\u0016{]\u0003\u0018\u0013mT\u001c\u0012";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "K\u0019\f\u001b}\\/\u001b\u0007}S\u0015\u0012\u0006";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "J\u0015\b\u001aj\\";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "V\u001fK\u0006q_\u001e\u000e\u00118H\u0002\u000e\u001e}AP\n\u0003yQ\u001c\n\u0017t]P\u001c\u001clPP\u0002\u00118";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Q\u001e\u001d\u0014tQ\u0014K\u0005j]\u001b\u000e\f8J\u0015\b\u001aj\\P\u001c\u001clPP\u0002\u00118";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "K\u0019\f\u001b}\\/\u001b\u0007}S\u0015\u0012\u0006";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "J\u0015\b\u001aj\\";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "H\u0002\u000e\u001e}A/\u0002\u00118\u0005PT";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "Y\b\u0004\u0019wL\u001cK\u0019wY\u0014\u000e\u00118YP\u0018\u001c\u007fV\u0015\u000fUhJ\u0015K\u001e}AP\u001c\u001clPP\u0002\u00118";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "^\u0011\u0002\u0019}\\P\u001f\u001a8H\u0011\u0019\u0006}\u0018\u0003\u0002\u0012v]\u0014K\u0005j]P\u0000\u0010a\u0018\u0002\u000e\u0016wJ\u0014K\u0011mJ\u0019\u0005\u00128T\u001f\n\u00118^\u001f\u0019Uq\\P";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "Y\b\u0004\u0019wL\u001cK\u0019wY\u0014\u000e\u00118L\u0018\u000eUtY\u0004\u000e\u0006l\u0018\u0003\u0002\u0012v]\u0014K\u0005j]P\u0000\u0010a\u0018\u0016\u0004\u00078K\u0015\u0005\u0011qV\u0017";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "^\u0011\u0002\u0019}\\P\u001f\u001a8H\u0011\u0019\u0006}\u0018\u0004\u0003\u00108T\u0011\u001f\u0010kLP\u0018\u001c\u007fV\u0015\u000fUhJ\u0015\u0000\u0010a\u0018\u0002\u000e\u0016wJ\u0014";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private bX b() {
        Cursor query = this.a.getWritableDatabase().query(z[3], new String[]{z[4]}, null, null, null, null, z[0], "1");
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                query.close();
                try {
                    bX bXVar = new bX(blob);
                    Log.i(z[2]);
                    return bXVar;
                } catch (Throwable e) {
                    Log.b(z[1], e);
                    return null;
                }
            }
            query.close();
            return null;
        } catch (IOException e2) {
            throw e2;
        }
    }

    public cz a() {
        bX b = b();
        Object b2 = b.b().b().b();
        Object obj = new Object[(b2.length - 1)];
        System.arraycopy(b2, 1, obj, 0, obj.length);
        cz czVar = new cz(aE.b(b.d()), obj, b.c());
        Log.i(z[12]);
        return czVar;
    }

    y7(te teVar) {
        this.a = teVar;
    }

    public bX a(int i) {
        Cursor query = this.a.getWritableDatabase().query(z[7], new String[]{z[8]}, z[9], new String[]{String.valueOf(i)}, null, null, null);
        try {
            if (query.moveToNext()) {
                try {
                    bX bXVar = new bX(query.getBlob(0));
                    query.close();
                    Log.i(z[10] + i);
                    return bXVar;
                } catch (Throwable e) {
                    Log.b(z[11] + i, e);
                    throw new a7(z[6] + i);
                }
            }
            query.close();
            throw new a7(z[5] + i);
        } catch (IOException e2) {
            throw e2;
        }
    }
}
