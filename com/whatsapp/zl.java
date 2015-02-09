package com.whatsapp;

import com.whatsapp.protocol.cm;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class zl implements anx {
    private static final String[] z;
    final b6 a;

    static {
        String[] strArr = new String[6];
        String str = "B5\u000b)qV,\u0003";
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
                        i3 = 47;
                        break;
                    case ay.f /*1*/:
                        i3 = 92;
                        break;
                    case ay.n /*2*/:
                        i3 = 102;
                        break;
                    case ay.p /*3*/:
                        i3 = 76;
                        break;
                    default:
                        i3 = 5;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "K)\u0014-qF3\b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "B9\u0002%dZ,\n#dKs\f?jA9\u001e/`_(\u000f#k\u000f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "I5\n)mN/\u000e";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\\5\u001c)";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Z.\n";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a.c.n = new cm();
            this.a.c.n.e = jSONObject.optString(z[0]);
            this.a.c.n.a = jSONObject.optString(z[1]);
            this.a.c.n.d = jSONObject.optLong(z[5]);
            this.a.c.n.c = jSONObject.optInt(z[2]);
            this.a.c.n.b = jSONObject.optString(z[4]);
            this.a.c.d = true;
        } catch (JSONException e) {
            Log.e(z[3] + e.toString());
        }
    }

    public void a(int i) {
        avq.a(this.a.c, new Object[]{Integer.valueOf(i)});
    }

    zl(b6 b6Var) {
        this.a = b6Var;
    }
}
