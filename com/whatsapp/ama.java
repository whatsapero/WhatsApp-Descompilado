package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ama {
    private static final String[] z;

    static {
        String[] strArr = new String[19];
        String str = "pk!B:y{1@:vpxZzkk";
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
                        i3 = 24;
                        break;
                    case ay.f /*1*/:
                        i3 = 31;
                        break;
                    case ay.n /*2*/:
                        i3 = 85;
                        break;
                    case ay.p /*3*/:
                        i3 = 50;
                        break;
                    default:
                        i3 = 21;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "1?";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "1?";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "pk!Br}kz\\z5~1Vg}l&Wf";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "MK\u0013\u001f-";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "1?";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "{s:Ap";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "pk!Br}kz[z}m']g87";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "[p;\\p{k<]{";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "pk!Br}kzZalo0@gwmu\u001a";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "pk!Bewl!\u001dwy{xAayk Avw{0\u0012";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "pk!Br}kzWgjp'\u0012=";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "pk!B:z~1Ggt";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "pk!Bf";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "pk!B:z~1\u001fejp!]vws";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "_Z\u0001";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "pk!B:vpxFtjx0F";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "pk!B;{p;\\p{k<]{";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "87";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static List b(String str) {
        if (str != null) {
            return App.C.b(str);
        }
        Log.e(z[0]);
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.apache.http.HttpResponse a(java.lang.String r22) {
        /*
        r7 = com.whatsapp.m3.d;
        r2 = android.text.TextUtils.isEmpty(r22);	 Catch:{ MalformedURLException -> 0x0013 }
        if (r2 == 0) goto L_0x0015;
    L_0x0008:
        r2 = z;	 Catch:{ MalformedURLException -> 0x0013 }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ MalformedURLException -> 0x0013 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ MalformedURLException -> 0x0013 }
        r2 = 0;
    L_0x0012:
        return r2;
    L_0x0013:
        r2 = move-exception;
        throw r2;
    L_0x0015:
        r8 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x0037 }
        r0 = r22;
        r8.<init>(r0);	 Catch:{ MalformedURLException -> 0x0037 }
        r2 = r8.getProtocol();	 Catch:{ MalformedURLException -> 0x0043 }
        r3 = z;	 Catch:{ MalformedURLException -> 0x0043 }
        r4 = 14;
        r3 = r3[r4];	 Catch:{ MalformedURLException -> 0x0043 }
        r2 = r2.equals(r3);	 Catch:{ MalformedURLException -> 0x0043 }
        if (r2 != 0) goto L_0x0045;
    L_0x002c:
        r2 = z;	 Catch:{ MalformedURLException -> 0x0043 }
        r3 = 15;
        r2 = r2[r3];	 Catch:{ MalformedURLException -> 0x0043 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ MalformedURLException -> 0x0043 }
        r2 = 0;
        goto L_0x0012;
    L_0x0037:
        r2 = move-exception;
        r2 = z;
        r3 = 13;
        r2 = r2[r3];
        com.whatsapp.util.Log.e(r2);
        r2 = 0;
        goto L_0x0012;
    L_0x0043:
        r2 = move-exception;
        throw r2;
    L_0x0045:
        r2 = r8.getHost();
        r9 = b(r2);
        if (r9 != 0) goto L_0x005b;
    L_0x004f:
        r2 = z;	 Catch:{ MalformedURLException -> 0x0059 }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ MalformedURLException -> 0x0059 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ MalformedURLException -> 0x0059 }
        r2 = 0;
        goto L_0x0012;
    L_0x0059:
        r2 = move-exception;
        throw r2;
    L_0x005b:
        r2 = r8.getPort();
        r3 = -1;
        if (r2 != r3) goto L_0x02b2;
    L_0x0062:
        r2 = r8.getDefaultPort();
        r6 = r2;
    L_0x0067:
        java.util.Collections.shuffle(r9);	 Catch:{ MalformedURLException -> 0x01d3 }
        r2 = r9.size();	 Catch:{ MalformedURLException -> 0x01d3 }
        r3 = 4;
        if (r2 <= r3) goto L_0x01d5;
    L_0x0071:
        r2 = 4;
        r3 = r2;
    L_0x0073:
        r10 = new org.apache.http.protocol.BasicHttpProcessor;
        r10.<init>();
        r2 = new org.apache.http.protocol.RequestContent;
        r2.<init>();
        r10.addInterceptor(r2);
        r2 = new org.apache.http.protocol.RequestTargetHost;
        r2.<init>();
        r10.addInterceptor(r2);
        r2 = new org.apache.http.protocol.RequestUserAgent;
        r2.<init>();
        r10.addInterceptor(r2);
        r2 = org.apache.http.protocol.RequestExpectContinue.class;
        r10.removeRequestInterceptorByClass(r2);
        r4 = 0;
        r2 = 0;
        r5 = r2;
    L_0x0098:
        if (r5 >= r3) goto L_0x01d0;
    L_0x009a:
        r11 = new org.apache.http.params.BasicHttpParams;
        r11.<init>();
        r2 = org.apache.http.HttpVersion.HTTP_1_1;
        org.apache.http.params.HttpProtocolParams.setVersion(r11, r2);
        r2 = z;
        r12 = 5;
        r2 = r2[r12];
        org.apache.http.params.HttpProtocolParams.setContentCharset(r11, r2);
        r2 = com.whatsapp.ak9.a();
        org.apache.http.params.HttpProtocolParams.setUserAgent(r11, r2);
        r12 = new org.apache.http.protocol.HttpRequestExecutor;
        r12.<init>();
        r13 = new org.apache.http.protocol.BasicHttpContext;
        r2 = 0;
        r13.<init>(r2);
        r14 = new org.apache.http.impl.DefaultHttpClientConnection;
        r14.<init>();
        r2 = r9.get(r5);
        r2 = (java.net.InetAddress) r2;
        r16 = java.lang.Math.random();	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r18 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r0 = (double) r5;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r20 = r0;
        r18 = java.lang.Math.pow(r18, r20);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r20 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r18 = r18 - r20;
        r20 = 4661014508095930368; // 0x40af400000000000 float:0.0 double:4000.0;
        r18 = r18 * r20;
        r16 = r16 * r18;
        r0 = r16;
        r15 = (int) r0;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r0 = (long) r15;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r16 = r0;
        java.lang.Thread.sleep(r16);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r15 = new java.net.Socket;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r15.<init>();	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r16 = new java.net.InetSocketAddress;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r0 = r16;
        r0.<init>(r2, r6);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r2 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r0 = r16;
        r15.connect(r0, r2);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r2 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r15.setSoTimeout(r2);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r2 = com.whatsapp.messaging.ad.b();	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r16 = r8.getHost();	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r17 = 1;
        r0 = r16;
        r1 = r17;
        r2 = r2.createSocket(r15, r0, r6, r1);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r15 = z;	 Catch:{ MalformedURLException -> 0x01dc }
        r16 = 18;
        r15 = r15[r16];	 Catch:{ MalformedURLException -> 0x01dc }
        r13.setAttribute(r15, r14);	 Catch:{ MalformedURLException -> 0x01dc }
        r15 = r14.isOpen();	 Catch:{ MalformedURLException -> 0x01dc }
        if (r15 != 0) goto L_0x012a;
    L_0x0127:
        r14.bind(r2, r11);	 Catch:{ MalformedURLException -> 0x01dc }
    L_0x012a:
        r2 = r8.getPath();	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r15 = r8.getQuery();	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        if (r15 == 0) goto L_0x014f;
    L_0x0134:
        r15 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r15.<init>();	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r2 = r15.append(r2);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r15 = "?";
        r2 = r2.append(r15);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r15 = r8.getQuery();	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r2 = r2.append(r15);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r2 = r2.toString();	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
    L_0x014f:
        r15 = new org.apache.http.message.BasicHttpRequest;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r16 = z;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r17 = 16;
        r16 = r16[r17];	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r0 = r16;
        r15.<init>(r0, r2);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r2 = z;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r16 = 9;
        r2 = r2[r16];	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r16 = z;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r17 = 7;
        r16 = r16[r17];	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r0 = r16;
        r15.addHeader(r2, r0);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r15.setParams(r11);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r12.preProcess(r15, r10, r13);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r2 = r12.execute(r15, r14, r13);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r2.setParams(r11);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r12.postProcess(r2, r10, r13);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r11 = r2.getStatusLine();	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r11 = r11.getStatusCode();	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r12 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r11 < r12) goto L_0x0012;
    L_0x0189:
        r12 = r3 + -1;
        if (r5 == r12) goto L_0x0012;
    L_0x018d:
        r12 = com.whatsapp.App.a();	 Catch:{ MalformedURLException -> 0x0221 }
        if (r12 == 0) goto L_0x0012;
    L_0x0193:
        r12 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r12.<init>();	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r13 = z;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r14 = 11;
        r13 = r13[r14];	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r12 = r12.append(r13);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r11 = r12.append(r11);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r12 = z;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r13 = 1;
        r12 = r12[r13];	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r11 = r11.append(r12);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r11 = r11.append(r5);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r12 = "/";
        r11 = r11.append(r12);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r11 = r11.append(r3);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r12 = ")";
        r11 = r11.append(r12);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        r11 = r11.toString();	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        com.whatsapp.util.Log.w(r11);	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
        if (r7 != 0) goto L_0x0012;
    L_0x01cc:
        r2 = r5 + 1;
        if (r7 == 0) goto L_0x02af;
    L_0x01d0:
        r2 = r4;
        goto L_0x0012;
    L_0x01d3:
        r2 = move-exception;
        throw r2;
    L_0x01d5:
        r2 = r9.size();
        r3 = r2;
        goto L_0x0073;
    L_0x01dc:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
    L_0x01de:
        r2 = move-exception;
        r11 = new java.lang.StringBuilder;	 Catch:{ MalformedURLException -> 0x0266 }
        r11.<init>();	 Catch:{ MalformedURLException -> 0x0266 }
        r12 = z;	 Catch:{ MalformedURLException -> 0x0266 }
        r13 = 8;
        r12 = r12[r13];	 Catch:{ MalformedURLException -> 0x0266 }
        r11 = r11.append(r12);	 Catch:{ MalformedURLException -> 0x0266 }
        r11 = r11.append(r5);	 Catch:{ MalformedURLException -> 0x0266 }
        r12 = "/";
        r11 = r11.append(r12);	 Catch:{ MalformedURLException -> 0x0266 }
        r11 = r11.append(r3);	 Catch:{ MalformedURLException -> 0x0266 }
        r12 = z;	 Catch:{ MalformedURLException -> 0x0266 }
        r13 = 2;
        r12 = r12[r13];	 Catch:{ MalformedURLException -> 0x0266 }
        r11 = r11.append(r12);	 Catch:{ MalformedURLException -> 0x0266 }
        r12 = r2.toString();	 Catch:{ MalformedURLException -> 0x0266 }
        r11 = r11.append(r12);	 Catch:{ MalformedURLException -> 0x0266 }
        r11 = r11.toString();	 Catch:{ MalformedURLException -> 0x0266 }
        com.whatsapp.util.Log.w(r11);	 Catch:{ MalformedURLException -> 0x0266 }
        r11 = r3 + -1;
        if (r5 == r11) goto L_0x021e;
    L_0x0218:
        r11 = com.whatsapp.App.a();	 Catch:{ MalformedURLException -> 0x021f }
        if (r11 != 0) goto L_0x01cc;
    L_0x021e:
        throw r2;	 Catch:{ MalformedURLException -> 0x021f }
    L_0x021f:
        r2 = move-exception;
        throw r2;
    L_0x0221:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x01de, HttpException -> 0x0223, Exception -> 0x026a }
    L_0x0223:
        r2 = move-exception;
        r11 = new java.lang.StringBuilder;	 Catch:{ MalformedURLException -> 0x0268 }
        r11.<init>();	 Catch:{ MalformedURLException -> 0x0268 }
        r12 = z;	 Catch:{ MalformedURLException -> 0x0268 }
        r13 = 10;
        r12 = r12[r13];	 Catch:{ MalformedURLException -> 0x0268 }
        r11 = r11.append(r12);	 Catch:{ MalformedURLException -> 0x0268 }
        r11 = r11.append(r5);	 Catch:{ MalformedURLException -> 0x0268 }
        r12 = "/";
        r11 = r11.append(r12);	 Catch:{ MalformedURLException -> 0x0268 }
        r11 = r11.append(r3);	 Catch:{ MalformedURLException -> 0x0268 }
        r12 = z;	 Catch:{ MalformedURLException -> 0x0268 }
        r13 = 3;
        r12 = r12[r13];	 Catch:{ MalformedURLException -> 0x0268 }
        r11 = r11.append(r12);	 Catch:{ MalformedURLException -> 0x0268 }
        r12 = r2.toString();	 Catch:{ MalformedURLException -> 0x0268 }
        r11 = r11.append(r12);	 Catch:{ MalformedURLException -> 0x0268 }
        r11 = r11.toString();	 Catch:{ MalformedURLException -> 0x0268 }
        com.whatsapp.util.Log.w(r11);	 Catch:{ MalformedURLException -> 0x0268 }
        r11 = r3 + -1;
        if (r5 == r11) goto L_0x0263;
    L_0x025d:
        r11 = com.whatsapp.App.a();	 Catch:{ MalformedURLException -> 0x0264 }
        if (r11 != 0) goto L_0x01cc;
    L_0x0263:
        throw r2;	 Catch:{ MalformedURLException -> 0x0264 }
    L_0x0264:
        r2 = move-exception;
        throw r2;
    L_0x0266:
        r2 = move-exception;
        throw r2;	 Catch:{ MalformedURLException -> 0x021f }
    L_0x0268:
        r2 = move-exception;
        throw r2;	 Catch:{ MalformedURLException -> 0x0264 }
    L_0x026a:
        r2 = move-exception;
        r11 = new java.lang.StringBuilder;	 Catch:{ MalformedURLException -> 0x02ad }
        r11.<init>();	 Catch:{ MalformedURLException -> 0x02ad }
        r12 = z;	 Catch:{ MalformedURLException -> 0x02ad }
        r13 = 12;
        r12 = r12[r13];	 Catch:{ MalformedURLException -> 0x02ad }
        r11 = r11.append(r12);	 Catch:{ MalformedURLException -> 0x02ad }
        r11 = r11.append(r5);	 Catch:{ MalformedURLException -> 0x02ad }
        r12 = "/";
        r11 = r11.append(r12);	 Catch:{ MalformedURLException -> 0x02ad }
        r11 = r11.append(r3);	 Catch:{ MalformedURLException -> 0x02ad }
        r12 = z;	 Catch:{ MalformedURLException -> 0x02ad }
        r13 = 6;
        r12 = r12[r13];	 Catch:{ MalformedURLException -> 0x02ad }
        r11 = r11.append(r12);	 Catch:{ MalformedURLException -> 0x02ad }
        r12 = r2.toString();	 Catch:{ MalformedURLException -> 0x02ad }
        r11 = r11.append(r12);	 Catch:{ MalformedURLException -> 0x02ad }
        r11 = r11.toString();	 Catch:{ MalformedURLException -> 0x02ad }
        com.whatsapp.util.Log.w(r11);	 Catch:{ MalformedURLException -> 0x02ad }
        r11 = r3 + -1;
        if (r5 == r11) goto L_0x02aa;
    L_0x02a4:
        r11 = com.whatsapp.App.a();	 Catch:{ MalformedURLException -> 0x02ab }
        if (r11 != 0) goto L_0x01cc;
    L_0x02aa:
        throw r2;	 Catch:{ MalformedURLException -> 0x02ab }
    L_0x02ab:
        r2 = move-exception;
        throw r2;
    L_0x02ad:
        r2 = move-exception;
        throw r2;	 Catch:{ MalformedURLException -> 0x02ab }
    L_0x02af:
        r5 = r2;
        goto L_0x0098;
    L_0x02b2:
        r6 = r2;
        goto L_0x0067;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ama.a(java.lang.String):org.apache.http.HttpResponse");
    }
}
