package com.whatsapp;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class xf {
    private static final String[] z;
    private String a;
    private String b;
    private String c;

    static {
        String[] strArr = new String[4];
        String str = "DoG3\u001c";
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
                        i3 = 52;
                        break;
                    case ay.f /*1*/:
                        i3 = 29;
                        break;
                    case ay.n /*2*/:
                        i3 = 46;
                        break;
                    case ay.p /*3*/:
                        i3 = 80;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "DoA4\fWig4";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "Gv[}\u001dQiO9\u0015G ";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Gv[}\u001dQiO9\u0015G2D#\u0016Z0K(\u001aQmZ9\u0016Z=D#\u0016Z ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String toString() {
        return z[3] + this.c;
    }

    public xf(String str) {
        boolean z = false;
        boolean z2 = atm.b;
        try {
            this.c = str;
            JSONObject jSONObject = new JSONObject(this.c);
            this.b = jSONObject.optString(z[2]);
            this.a = jSONObject.optString(z[0]);
            try {
                if (DialogToastActivity.i) {
                    if (!z2) {
                        z = true;
                    }
                    atm.b = z;
                }
            } catch (JSONException e) {
                throw e;
            } catch (JSONException e2) {
                throw e2;
            }
        } catch (Throwable e3) {
            Log.e(z[1] + str);
            throw new RuntimeException(e3);
        }
    }
}
