package com.whatsapp;

import android.os.AsyncTask;
import org.json.JSONArray;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ro extends AsyncTask {
    private static final String[] z;
    JSONArray a;
    final DescribeProblemActivity b;

    static {
        String[] strArr = new String[12];
        String str = "r\u0002|z\u0012";
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
                        i3 = 6;
                        break;
                    case ay.f /*1*/:
                        i3 = 107;
                        break;
                    case ay.n /*2*/:
                        i3 = 8;
                        break;
                    case ay.p /*3*/:
                        i3 = 22;
                        break;
                    default:
                        i3 = 119;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "s\u0019d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "]6";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "v\u0007ib\u0011i\u0019e";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "g\u0005ld\u0018o\u000f";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    str = "b\u000e{u\u0007t\u0004j9\u0004c\nzu\u001f&";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "j\b";
                    obj = 6;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    str = "n\u001f|f\u0004<D'a\u0000qE\u007f~\u0016r\u0018if\u0007(\bg{X`\ny9\u0014j\u0002mx\u0003Y\u0018mw\u0005e\u0003&f\u001fvT";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "j\f";
                    obj = 8;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "w\u001emd\u000e";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "S?N;O";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "b\u000e{u\u0005o\u001b|\u007f\u0018h";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.lang.Void r12) {
        /*
        r11_this = this;
        r2 = 2;
        r9 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r11.b;
        r0.removeDialog(r2);
        r0 = r11.a;	 Catch:{ Exception -> 0x009a }
        if (r0 == 0) goto L_0x009e;
    L_0x000d:
        r0 = r11.a;	 Catch:{ Exception -> 0x009a }
        r5 = r0.length();	 Catch:{ Exception -> 0x009a }
        if (r5 <= 0) goto L_0x009e;
    L_0x0015:
        r6 = new java.util.ArrayList;	 Catch:{ Exception -> 0x009a }
        r6.<init>(r5);	 Catch:{ Exception -> 0x009a }
        r7 = new java.util.ArrayList;	 Catch:{ Exception -> 0x009a }
        r7.<init>(r5);	 Catch:{ Exception -> 0x009a }
        r8 = new java.util.ArrayList;	 Catch:{ Exception -> 0x009a }
        r8.<init>(r5);	 Catch:{ Exception -> 0x009a }
        r0 = r9;
    L_0x0025:
        if (r0 >= r5) goto L_0x0055;
    L_0x0027:
        r2 = r11.a;	 Catch:{ Exception -> 0x009a }
        r2 = r2.optJSONObject(r0);	 Catch:{ Exception -> 0x009a }
        r3 = z;	 Catch:{ Exception -> 0x009a }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ Exception -> 0x009a }
        r3 = r2.getString(r3);	 Catch:{ Exception -> 0x009a }
        r6.add(r3);	 Catch:{ Exception -> 0x009a }
        r3 = z;	 Catch:{ Exception -> 0x009a }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ Exception -> 0x009a }
        r3 = r2.getString(r3);	 Catch:{ Exception -> 0x009a }
        r7.add(r3);	 Catch:{ Exception -> 0x009a }
        r3 = z;	 Catch:{ Exception -> 0x009a }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ Exception -> 0x009a }
        r2 = r2.getString(r3);	 Catch:{ Exception -> 0x009a }
        r8.add(r2);	 Catch:{ Exception -> 0x009a }
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0025;
    L_0x0055:
        r3 = new java.util.ArrayList;	 Catch:{ Exception -> 0x009a }
        r3.<init>();	 Catch:{ Exception -> 0x009a }
        r0 = r11.b;	 Catch:{ Exception -> 0x009a }
        r2 = com.whatsapp.DescribeProblemActivity.e(r0);	 Catch:{ Exception -> 0x009a }
        r4 = r2.length;	 Catch:{ Exception -> 0x009a }
        r0 = r9;
    L_0x0062:
        if (r0 >= r4) goto L_0x006f;
    L_0x0064:
        r10 = r2[r0];	 Catch:{ Exception -> 0x009a }
        if (r10 == 0) goto L_0x006b;
    L_0x0068:
        r3.add(r10);	 Catch:{ Exception -> 0x0098 }
    L_0x006b:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0062;
    L_0x006f:
        r0 = r11.b;	 Catch:{ Exception -> 0x009a }
        r1 = r11.b;	 Catch:{ Exception -> 0x009a }
        r1 = com.whatsapp.DescribeProblemActivity.a(r1);	 Catch:{ Exception -> 0x009a }
        r2 = r11.b;	 Catch:{ Exception -> 0x009a }
        r2 = com.whatsapp.DescribeProblemActivity.b(r2);	 Catch:{ Exception -> 0x009a }
        r2 = r2.getText();	 Catch:{ Exception -> 0x009a }
        r2 = r2.toString();	 Catch:{ Exception -> 0x009a }
        r2 = r2.trim();	 Catch:{ Exception -> 0x009a }
        r4 = r11.b;	 Catch:{ Exception -> 0x009a }
        r4 = com.whatsapp.DescribeProblemActivity.d(r4);	 Catch:{ Exception -> 0x009a }
        com.whatsapp.SearchFAQ.a(r0, r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ Exception -> 0x009a }
        r0 = r11.b;	 Catch:{ Exception -> 0x009a }
        r0.finish();	 Catch:{ Exception -> 0x009a }
    L_0x0097:
        return;
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
    L_0x009e:
        r0 = r11.b;
        r1 = 0;
        com.whatsapp.DescribeProblemActivity.a(r0, r1);
        r0 = r11.b;
        r0 = com.whatsapp.DescribeProblemActivity.c(r0);
        r1 = new java.lang.Void[r9];
        com.whatsapp.a5w.a(r0, r1);
        goto L_0x0097;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ro.a(java.lang.Void):void");
    }

    protected ro(DescribeProblemActivity describeProblemActivity) {
        this.b = describeProblemActivity;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.Void a(java.lang.Void[] r8) {
        /*
        r7_this = this;
        r1 = com.whatsapp.App.az;
        r0 = r7.b;	 Catch:{ Exception -> 0x00d1 }
        r0 = com.whatsapp.DescribeProblemActivity.b(r0);	 Catch:{ Exception -> 0x00d1 }
        r0 = r0.getText();	 Catch:{ Exception -> 0x00d1 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x00d1 }
        r0 = r0.trim();	 Catch:{ Exception -> 0x00d1 }
        r2 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00d1 }
        r2.<init>();	 Catch:{ Exception -> 0x00d1 }
        r3 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ Exception -> 0x00d1 }
        r4 = z;	 Catch:{ Exception -> 0x00d1 }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ Exception -> 0x00d1 }
        r5 = z;	 Catch:{ Exception -> 0x00d1 }
        r6 = 5;
        r5 = r5[r6];	 Catch:{ Exception -> 0x00d1 }
        r3.<init>(r4, r5);	 Catch:{ Exception -> 0x00d1 }
        r2.add(r3);	 Catch:{ Exception -> 0x00d1 }
        r3 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ Exception -> 0x00d1 }
        r4 = z;	 Catch:{ Exception -> 0x00d1 }
        r5 = 9;
        r4 = r4[r5];	 Catch:{ Exception -> 0x00d1 }
        r5 = com.whatsapp.azl.a();	 Catch:{ Exception -> 0x00d1 }
        r3.<init>(r4, r5);	 Catch:{ Exception -> 0x00d1 }
        r2.add(r3);	 Catch:{ Exception -> 0x00d1 }
        r3 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ Exception -> 0x00d1 }
        r4 = z;	 Catch:{ Exception -> 0x00d1 }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ Exception -> 0x00d1 }
        r5 = com.whatsapp.azl.b();	 Catch:{ Exception -> 0x00d1 }
        r3.<init>(r4, r5);	 Catch:{ Exception -> 0x00d1 }
        r2.add(r3);	 Catch:{ Exception -> 0x00d1 }
        r3 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ Exception -> 0x00d1 }
        r4 = z;	 Catch:{ Exception -> 0x00d1 }
        r5 = 10;
        r4 = r4[r5];	 Catch:{ Exception -> 0x00d1 }
        r3.<init>(r4, r0);	 Catch:{ Exception -> 0x00d1 }
        r2.add(r3);	 Catch:{ Exception -> 0x00d1 }
        r0 = new java.net.URL;	 Catch:{ Exception -> 0x00d1 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00d1 }
        r3.<init>();	 Catch:{ Exception -> 0x00d1 }
        r4 = z;	 Catch:{ Exception -> 0x00d1 }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ Exception -> 0x00d1 }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x00d1 }
        r4 = z;	 Catch:{ Exception -> 0x00d1 }
        r5 = 11;
        r4 = r4[r5];	 Catch:{ Exception -> 0x00d1 }
        r2 = org.apache.http.client.utils.URLEncodedUtils.format(r2, r4);	 Catch:{ Exception -> 0x00d1 }
        r2 = r3.append(r2);	 Catch:{ Exception -> 0x00d1 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x00d1 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x00d1 }
        r0 = r0.openConnection();	 Catch:{ Exception -> 0x00d1 }
        r2 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.setConnectTimeout(r2);	 Catch:{ Exception -> 0x00d1 }
        r2 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.setReadTimeout(r2);	 Catch:{ Exception -> 0x00d1 }
        r0 = r0.getInputStream();	 Catch:{ Exception -> 0x00d1 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00d1 }
        r2.<init>();	 Catch:{ Exception -> 0x00d1 }
        r3 = new java.io.BufferedReader;	 Catch:{ Exception -> 0x00d1 }
        r4 = new java.io.InputStreamReader;	 Catch:{ Exception -> 0x00d1 }
        r4.<init>(r0);	 Catch:{ Exception -> 0x00d1 }
        r3.<init>(r4);	 Catch:{ Exception -> 0x00d1 }
        r0 = r3.readLine();	 Catch:{ Exception -> 0x00d1 }
    L_0x00a7:
        if (r0 == 0) goto L_0x00b2;
    L_0x00a9:
        r2.append(r0);	 Catch:{ Exception -> 0x00d1 }
        r0 = r3.readLine();	 Catch:{ Exception -> 0x00d1 }
        if (r1 == 0) goto L_0x00a7;
    L_0x00b2:
        r3.close();	 Catch:{ Exception -> 0x00d1 }
        r0 = r2.toString();	 Catch:{ Exception -> 0x00d1 }
        if (r0 == 0) goto L_0x00c1;
    L_0x00bb:
        r1 = r0.length();	 Catch:{ Exception -> 0x00cf }
        if (r1 != 0) goto L_0x00c6;
    L_0x00c1:
        r0 = z;	 Catch:{ Exception -> 0x00d1 }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ Exception -> 0x00d1 }
    L_0x00c6:
        r1 = new org.json.JSONArray;	 Catch:{ Exception -> 0x00d1 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x00d1 }
        r7.a = r1;	 Catch:{ Exception -> 0x00d1 }
    L_0x00cd:
        r0 = 0;
        return r0;
    L_0x00cf:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00d1 }
    L_0x00d1:
        r0 = move-exception;
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x00cd;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ro.a(java.lang.Void[]):java.lang.Void");
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void onPreExecute() {
        this.b.showDialog(2);
    }
}
