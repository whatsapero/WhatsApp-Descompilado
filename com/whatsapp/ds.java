package com.whatsapp;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ds {
    private static final File c;
    private static final String[] z;
    public ArrayList a;
    private int b;
    public int d;
    private String e;
    public int f;

    public ds(int i, String str) {
        this.f = i;
        this.e = str;
        c.mkdirs();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(org.json.JSONObject r9) {
        /*
        r8_this = this;
        r7 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r1 = 0;
        r3 = com.whatsapp.App.az;
        r0 = 0;
        r2 = z;	 Catch:{ JSONException -> 0x0036 }
        r4 = 7;
        r2 = r2[r4];	 Catch:{ JSONException -> 0x0036 }
        r2 = r9.getJSONObject(r2);	 Catch:{ JSONException -> 0x0036 }
        if (r2 == 0) goto L_0x0032;
    L_0x0011:
        r4 = z;	 Catch:{ JSONException -> 0x0036 }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ JSONException -> 0x0036 }
        r2 = r2.getJSONObject(r4);	 Catch:{ JSONException -> 0x0036 }
        if (r2 == 0) goto L_0x0032;
    L_0x001c:
        r4 = z;	 Catch:{ JSONException -> 0x0036 }
        r5 = 12;
        r4 = r4[r5];	 Catch:{ JSONException -> 0x0036 }
        r0 = r2.getJSONArray(r4);	 Catch:{ JSONException -> 0x0036 }
        r4 = z;	 Catch:{ JSONException -> 0x0036 }
        r5 = 9;
        r4 = r4[r5];	 Catch:{ JSONException -> 0x0036 }
        r2 = r2.getInt(r4);	 Catch:{ JSONException -> 0x0036 }
        r8.d = r2;	 Catch:{ JSONException -> 0x0036 }
    L_0x0032:
        r2 = r0;
    L_0x0033:
        if (r2 != 0) goto L_0x003b;
    L_0x0035:
        return;
    L_0x0036:
        r2 = move-exception;
        r8.d = r1;
        r2 = r0;
        goto L_0x0033;
    L_0x003b:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r5 = 10;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r2.length();
        r0 = r0.append(r4);
        r4 = z;
        r5 = 8;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r8.d;
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r1;
    L_0x006a:
        r1 = r2.length();
        if (r0 >= r1) goto L_0x00d4;
    L_0x0070:
        r1 = new com.whatsapp.d6;	 Catch:{ JSONException -> 0x0100 }
        r1.<init>();	 Catch:{ JSONException -> 0x0100 }
        r4 = r2.getJSONObject(r0);	 Catch:{ JSONException -> 0x0100 }
        r5 = z;	 Catch:{ JSONException -> 0x0100 }
        r6 = 5;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x0100 }
        r5 = r4.getString(r5);	 Catch:{ JSONException -> 0x0100 }
        r1.b = r5;	 Catch:{ JSONException -> 0x0100 }
        r5 = z;	 Catch:{ JSONException -> 0x0100 }
        r6 = 4;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x0100 }
        r5 = r4.getInt(r5);	 Catch:{ JSONException -> 0x0100 }
        r1.a = r5;	 Catch:{ JSONException -> 0x0100 }
        r5 = z;	 Catch:{ JSONException -> 0x0100 }
        r6 = 6;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x0100 }
        r5 = r4.getInt(r5);	 Catch:{ JSONException -> 0x0100 }
        r1.c = r5;	 Catch:{ JSONException -> 0x0100 }
        r5 = z;	 Catch:{ JSONException -> 0x0100 }
        r6 = 0;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x0100 }
        r5 = r4.getInt(r5);	 Catch:{ JSONException -> 0x0100 }
        r1.e = r5;	 Catch:{ JSONException -> 0x0100 }
        r5 = z;	 Catch:{ JSONException -> 0x0100 }
        r6 = 1;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x0100 }
        r4 = r4.getJSONObject(r5);	 Catch:{ JSONException -> 0x0100 }
        if (r4 == 0) goto L_0x00bc;
    L_0x00b0:
        r5 = z;	 Catch:{ JSONException -> 0x00fe }
        r6 = 11;
        r5 = r5[r6];	 Catch:{ JSONException -> 0x00fe }
        r4 = r4.getString(r5);	 Catch:{ JSONException -> 0x00fe }
        r1.d = r4;	 Catch:{ JSONException -> 0x00fe }
    L_0x00bc:
        r4 = r1.c;	 Catch:{ JSONException -> 0x0102 }
        if (r4 < r7) goto L_0x00d0;
    L_0x00c0:
        r4 = r1.e;	 Catch:{ JSONException -> 0x0102 }
        if (r4 < r7) goto L_0x00d0;
    L_0x00c4:
        r4 = r1.a;	 Catch:{ JSONException -> 0x0104 }
        r5 = 512000; // 0x7d000 float:7.17465E-40 double:2.529616E-318;
        if (r4 > r5) goto L_0x00d0;
    L_0x00cb:
        r4 = r8.a;	 Catch:{ JSONException -> 0x0106 }
        r4.add(r1);	 Catch:{ JSONException -> 0x0106 }
    L_0x00d0:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x006a;
    L_0x00d4:
        r0 = r8.b;
        r1 = r2.length();
        r0 = r0 + r1;
        r8.b = r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r8.a;
        r1 = r1.size();
        r0 = r0.append(r1);
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x0035;
    L_0x00fe:
        r1 = move-exception;
        throw r1;	 Catch:{ JSONException -> 0x0100 }
    L_0x0100:
        r1 = move-exception;
        goto L_0x00d0;
    L_0x0102:
        r1 = move-exception;
        throw r1;	 Catch:{ JSONException -> 0x0104 }
    L_0x0104:
        r1 = move-exception;
        throw r1;	 Catch:{ JSONException -> 0x0106 }
    L_0x0106:
        r1 = move-exception;
        throw r1;	 Catch:{ JSONException -> 0x0100 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ds.a(org.json.JSONObject):void");
    }

    public ds(String str) {
        this(50, str);
    }

    public static void a() {
        int i = App.az;
        File[] listFiles = c.listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles, new y3());
            int i2 = 0;
            while (i2 < listFiles.length) {
                File file = listFiles[i2];
                if (i2 <= listFiles.length - 16 || file.lastModified() + 86400000 <= System.currentTimeMillis()) {
                    file.delete();
                }
                i2++;
                if (i != 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List b() {
        /*
        r8_this = this;
        r1 = 0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r8.a = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r2 = new org.apache.http.message.BasicNameValuePair;
        r3 = z;
        r4 = 17;
        r3 = r3[r4];
        r4 = r8.e;
        r4 = r4.trim();
        r2.<init>(r3, r4);
        r0.add(r2);
        r2 = new org.apache.http.message.BasicNameValuePair;
        r3 = z;
        r4 = 16;
        r3 = r3[r4];
        r4 = r8.b;
        r4 = java.lang.Integer.toString(r4);
        r2.<init>(r3, r4);
        r0.add(r2);
        r2 = new org.apache.http.message.BasicNameValuePair;
        r3 = z;
        r4 = 15;
        r3 = r3[r4];
        r4 = r8.f;
        r4 = java.lang.Integer.toString(r4);
        r2.<init>(r3, r4);
        r0.add(r2);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = com.whatsapp.ce.d;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 13;
        r3 = r3[r4];
        r0 = org.apache.http.client.utils.URLEncodedUtils.format(r0, r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r2 = com.whatsapp.a54.b(r0);
        r4 = new java.io.File;
        r3 = c;
        r2 = r2.toString();
        r4.<init>(r3, r2);
        r2 = r4.exists();	 Catch:{ IOException -> 0x00ad }
        if (r2 == 0) goto L_0x00d9;
    L_0x007b:
        r2 = r4.lastModified();	 Catch:{ IOException -> 0x00ad }
        r6 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r2 = r2 + r6;
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x00ad }
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r2 <= 0) goto L_0x00d9;
    L_0x008b:
        r2 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x00b1, ClassNotFoundException -> 0x00c0, all -> 0x00cf }
        r0 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x00b1, ClassNotFoundException -> 0x00c0, all -> 0x00cf }
        r0.<init>(r4);	 Catch:{ IOException -> 0x00b1, ClassNotFoundException -> 0x00c0, all -> 0x00cf }
        r2.<init>(r0);	 Catch:{ IOException -> 0x00b1, ClassNotFoundException -> 0x00c0, all -> 0x00cf }
        r0 = r2.readObject();	 Catch:{ IOException -> 0x0180, ClassNotFoundException -> 0x017d }
        r0 = (java.lang.String) r0;	 Catch:{ IOException -> 0x0180, ClassNotFoundException -> 0x017d }
        if (r2 == 0) goto L_0x00a0;
    L_0x009d:
        r2.close();	 Catch:{ IOException -> 0x0167, ClassNotFoundException -> 0x00af }
    L_0x00a0:
        if (r0 == 0) goto L_0x00aa;
    L_0x00a2:
        r1 = new org.json.JSONObject;
        r1.<init>(r0);
        r8.a(r1);
    L_0x00aa:
        r0 = r8.a;
        return r0;
    L_0x00ad:
        r0 = move-exception;
        throw r0;
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        r0 = move-exception;
        r2 = r1;
    L_0x00b3:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x017a }
        if (r2 == 0) goto L_0x0183;
    L_0x00b8:
        r2.close();	 Catch:{ IOException -> 0x00bd }
        r0 = r1;
        goto L_0x00a0;
    L_0x00bd:
        r0 = move-exception;
        r0 = r1;
        goto L_0x00a0;
    L_0x00c0:
        r0 = move-exception;
        r2 = r1;
    L_0x00c2:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x017a }
        if (r2 == 0) goto L_0x0183;
    L_0x00c7:
        r2.close();	 Catch:{ IOException -> 0x00cc }
        r0 = r1;
        goto L_0x00a0;
    L_0x00cc:
        r0 = move-exception;
        r0 = r1;
        goto L_0x00a0;
    L_0x00cf:
        r0 = move-exception;
        r2 = r1;
    L_0x00d1:
        if (r2 == 0) goto L_0x00d6;
    L_0x00d3:
        r2.close();	 Catch:{ IOException -> 0x016a, ClassNotFoundException -> 0x00d7 }
    L_0x00d6:
        throw r0;
    L_0x00d7:
        r0 = move-exception;
        throw r0;
    L_0x00d9:
        r4.delete();
        r2 = new org.apache.http.client.methods.HttpGet;
        r2.<init>(r0);
        r0 = new org.apache.http.params.BasicHttpParams;
        r0.<init>();
        r3 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r0, r3);
        r3 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        org.apache.http.params.HttpConnectionParams.setSoTimeout(r0, r3);
        r3 = com.whatsapp.ak9.a();
        org.apache.http.params.HttpProtocolParams.setUserAgent(r0, r3);
        r3 = new org.apache.http.impl.client.DefaultHttpClient;
        r3.<init>(r0);
        r0 = r3.execute(r2);
        r2 = r0.getStatusLine();
        r2 = r2.getStatusCode();
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r2 != r3) goto L_0x014a;
    L_0x010c:
        r0 = r0.getEntity();
        r3 = org.apache.http.util.EntityUtils.toString(r0);
        r2 = new java.io.ObjectOutputStream;	 Catch:{ FileNotFoundException -> 0x0129, IOException -> 0x0135 }
        r0 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0129, IOException -> 0x0135 }
        r0.<init>(r4);	 Catch:{ FileNotFoundException -> 0x0129, IOException -> 0x0135 }
        r2.<init>(r0);	 Catch:{ FileNotFoundException -> 0x0129, IOException -> 0x0135 }
        r2.writeObject(r3);	 Catch:{ FileNotFoundException -> 0x0177, IOException -> 0x0174, all -> 0x0171 }
        if (r2 == 0) goto L_0x0126;
    L_0x0123:
        r2.close();	 Catch:{ IOException -> 0x016d }
    L_0x0126:
        r0 = r3;
        goto L_0x00a0;
    L_0x0129:
        r0 = move-exception;
    L_0x012a:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0141 }
        if (r1 == 0) goto L_0x0126;
    L_0x012f:
        r1.close();	 Catch:{ IOException -> 0x0133 }
        goto L_0x0126;
    L_0x0133:
        r0 = move-exception;
        goto L_0x0126;
    L_0x0135:
        r0 = move-exception;
    L_0x0136:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0141 }
        if (r1 == 0) goto L_0x0126;
    L_0x013b:
        r1.close();	 Catch:{ IOException -> 0x013f }
        goto L_0x0126;
    L_0x013f:
        r0 = move-exception;
        goto L_0x0126;
    L_0x0141:
        r0 = move-exception;
    L_0x0142:
        if (r1 == 0) goto L_0x0147;
    L_0x0144:
        r1.close();	 Catch:{ IOException -> 0x016f, ClassNotFoundException -> 0x0148 }
    L_0x0147:
        throw r0;
    L_0x0148:
        r0 = move-exception;
        throw r0;
    L_0x014a:
        r0 = new java.io.IOException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 14;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0167:
        r1 = move-exception;
        goto L_0x00a0;
    L_0x016a:
        r1 = move-exception;
        goto L_0x00d6;
    L_0x016d:
        r0 = move-exception;
        goto L_0x0126;
    L_0x016f:
        r1 = move-exception;
        goto L_0x0147;
    L_0x0171:
        r0 = move-exception;
        r1 = r2;
        goto L_0x0142;
    L_0x0174:
        r0 = move-exception;
        r1 = r2;
        goto L_0x0136;
    L_0x0177:
        r0 = move-exception;
        r1 = r2;
        goto L_0x012a;
    L_0x017a:
        r0 = move-exception;
        goto L_0x00d1;
    L_0x017d:
        r0 = move-exception;
        goto L_0x00c2;
    L_0x0180:
        r0 = move-exception;
        goto L_0x00b3;
    L_0x0183:
        r0 = r1;
        goto L_0x00a0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ds.b():java.util.List");
    }

    static {
        String[] strArr = new String[19];
        String str = "_:\t\u0002^c";
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
                        i3 = 23;
                        break;
                    case ay.f /*1*/:
                        i3 = 95;
                        break;
                    case ay.n /*2*/:
                        i3 = 96;
                        break;
                    case ay.p /*3*/:
                        i3 = 101;
                        break;
                    default:
                        i3 = 54;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "76\r\u0004Qr,";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "^2\u0001\u0002S";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "Q6\f\u0000e~%\u0005";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Z:\u0004\fWB-\f";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "@6\u0004\u0011^";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "D:\u0001\u0017U\u007f\r\u0005\u0016Fx1\u0013\u0000";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ";\u007f\u0014\nBv3Z";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "C0\u0014\u0004Z";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "e:\u0013\u0010Zc,N\tSy8\u0014\r\u001e>\u007f]E";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "B-\f";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "E:\u0013\u0010Zc,";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "B\u000b&H\u000e";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "T0\r\bCy6\u0003\u0004B~0\u000eEPv6\f\u0000R;\u007f\u0013\u0011Wc*\u0013X";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "^2\u0001\u0002S9\u001c\u000f\u0010Xc";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "^2\u0001\u0002S9\u0010\u0006\u0003Er+";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "F*\u0005\u0017O";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "U6\u000e\u0002";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = new File(App.p.getCacheDir(), z[18]);
                default:
                    strArr2[i] = str;
                    str = "C7\u0015\bTy>\t\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean c() {
        return this.d > this.b;
    }

    public String d() {
        return this.e;
    }
}
