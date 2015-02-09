package com.whatsapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class mf extends m8 {
    private static final String[] R;

    static {
        String[] strArr = new String[10];
        String str = "&\u0019s9c-\u0017jdu5\u0006Agf \u0010{eq+\u0015{d";
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
                        i3 = 69;
                        break;
                    case ay.f /*1*/:
                        i3 = 118;
                        break;
                    case ay.n /*2*/:
                        i3 = 30;
                        break;
                    case ay.p /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 20;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "5\u0004qq})\u0013Ag|*\u0002qH`-\u0003suK,\u0012";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "&\u0019pcu&\u0002svz$\u0011{e;6\u0013jgf*\u0010w{q5\u001eqc{,\u00121qu,\u001a{s";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "(\u00130}d\"";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "(\u0013";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "5\u0004qq})\u0013Ag|*\u0002qH`-\u0003suK,\u0012";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "5\u0004qq})\u0013Ag|*\u0002qHr0\u001arH}!";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "&\u0019s9c-\u0017jdu5\u0006Agf \u0010{eq+\u0015{d";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0005\u00050`|$\u0002mvd5Xpr`";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    R = strArr3;
                default:
                    strArr2[i] = str;
                    str = "5\u0004qq})\u0013Ag|*\u0002qHr0\u001arH}!";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(int i, int i2) {
        this.M = i;
        this.A = i2;
        Editor edit = App.p.getSharedPreferences(R[0], 0).edit();
        edit.putInt(R[2], i2);
        edit.putInt(R[1], i);
        if (!edit.commit()) {
            Log.e(R[3]);
        }
    }

    protected InputStream a(boolean z) {
        return null;
    }

    public boolean b(boolean z) {
        return false;
    }

    public File m() {
        return new File(App.p.getFilesDir(), R[4]);
    }

    public File a() {
        return g(R[5]);
    }

    public mf() {
        super(App.af() + R[9]);
        SharedPreferences sharedPreferences = App.p.getSharedPreferences(R[8], 0);
        this.A = sharedPreferences.getInt(R[6], 0);
        this.M = sharedPreferences.getInt(R[7], 0);
    }
}
