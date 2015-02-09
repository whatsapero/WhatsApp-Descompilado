package com.whatsapp;

import com.whatsapp.protocol.b;
import com.whatsapp.protocol.c5;
import com.whatsapp.util.Log;
import java.net.URL;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class avg extends avq {
    private static final String[] z;
    private b s;
    private String t;

    static {
        String[] strArr = new String[8];
        String str = "x\t^\u0010g4\u000f\u0001";
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
                        i3 = 88;
                        break;
                    case ay.f /*1*/:
                        i3 = 123;
                        break;
                    case ay.n /*2*/:
                        i3 = 59;
                        break;
                    case ay.p /*3*/:
                        i3 = 99;
                        break;
                    default:
                        i3 = 18;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "/\u001eY\u000ew<\u0012Z\u0011w-\u000bW\fs<TI\u0006a-\u0017O\u0010=5\u0012H\u0010{6\u001c\u001b\bw!\b\u001b\n|x\u000eK\u000f}9\u001f\u001b\u0011w+\u000eW\u0017";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "/\u001eY\u000ew<\u0012Z\u0011w-\u000bW\fs<T^\rvx";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "/\u001eY\u000ew<\u0012Z\u0011w-\u000bW\fs<TH\u0016q;\u001eH\u00102";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ";\u000eI\u0011w6\u000f\u0001";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "/\u001eY\u000ew<\u0012Z\u0011w-\u000bW\fs<TN\u0011~w\u001eI\u0011}*[";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "x\u000b^\rv1\u0015\\Y";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "/\u001eY\u000ew<\u0012Z\u0011w-\u000bW\fs<TN\u0011~w\u0015TNz7\bO";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public avg(b bVar, b bVar2, String str) {
        super(bVar2, 0, true);
        this.t = str;
        this.s = bVar;
    }

    public void a(rk rkVar) {
        Log.i(z[3] + this.k.e + z[5] + m.size() + z[7] + l.size() + z[0] + rkVar);
        super.a(rkVar);
        c5 c5Var = new c5();
        try {
            try {
                if (rkVar == rk.SUCCESS && this.d) {
                    try {
                        URL url = new URL(this.n.a);
                        if (url.getHost() == null || url.getHost().length() == 0) {
                            Log.e(z[1]);
                            c5Var.k = 502;
                            App.a(this.t, c5Var, 5);
                            return;
                        }
                    } catch (Exception e) {
                        throw e;
                    } catch (Exception e2) {
                        Log.w(z[6] + e2.toString());
                    }
                    try {
                        if (this.n.a == null) {
                            Log.e(z[2]);
                            c5Var.k = 502;
                            App.a(this.t, c5Var, 5);
                            return;
                        }
                        Log.i(z[4] + this.k.e + " " + this.n.a);
                        c5Var.k = 200;
                        c5Var.c = this.n.a;
                        App.a(this.t, c5Var, 5);
                        this.s.t = this.n.a;
                        App.aJ.a(this.s, true, -1);
                        if (App.az == 0) {
                            return;
                        }
                    } catch (Exception e22) {
                        throw e22;
                    }
                }
                c5Var.k = 502;
                App.a(this.t, c5Var, 5);
            } catch (Exception e222) {
                throw e222;
            }
        } catch (Exception e2222) {
            throw e2222;
        }
    }

    public void onPostExecute(Object obj) {
        a((rk) obj);
    }
}
