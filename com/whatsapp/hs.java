package com.whatsapp;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class hs {
    private static final String[] z;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    static {
        String[] strArr = new String[7];
        String str = "|1U0r=6I%ya";
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
                        i3 = 92;
                        break;
                    case ay.f /*1*/:
                        i3 = 66;
                        break;
                    case ay.n /*2*/:
                        i3 = 60;
                        break;
                    case ay.p /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 28;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ",7N4t=1Yxv/-Rzy$!Y'h5-Rwv/-Rj";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = ",7N4t=1Y\u0003s7'R";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = ",0S3i?6u3";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "(-W2r";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ",7N4t=1Yj";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "8'J2p32Y%L=;P8}8";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public hs(String str, String str2) {
        boolean z = false;
        boolean z2 = atm.b;
        try {
            this.a = str;
            JSONObject jSONObject = new JSONObject(this.a);
            this.d = jSONObject.optString(z[4]);
            this.c = jSONObject.optString(z[5], jSONObject.optString(z[3]));
            this.b = jSONObject.optString(z[1]);
            this.e = str2;
            if (z2) {
                try {
                    if (!DialogToastActivity.i) {
                        z = true;
                    }
                    DialogToastActivity.i = z;
                } catch (JSONException e) {
                    throw e;
                }
            }
        } catch (Throwable e2) {
            Log.e(z[2] + str + z[0] + str2);
            throw new RuntimeException(e2);
        }
    }

    public String c() {
        return this.c;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.d;
    }

    public String toString() {
        return z[6] + this.a;
    }

    public String e() {
        return this.b;
    }

    public String d() {
        return this.e;
    }
}
