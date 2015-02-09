package com.whatsapp;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.RequestContent;
import org.apache.http.protocol.RequestExpectContinue;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class alo {
    private static final String[] z;
    private BasicHttpProcessor a;
    private URL b;
    private List c;
    private HttpEntity d;

    static {
        String[] strArr = new String[19];
        String str = "\u0002;\t\u0011/\u0005<\tN1\u0005b\u001c\u0005;\u0018*\u000e\u0012:\u0019";
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
                        i3 = 106;
                        break;
                    case ay.f /*1*/:
                        i3 = 79;
                        break;
                    case ay.n /*2*/:
                        i3 = 125;
                        break;
                    case ay.p /*3*/:
                        i3 = 97;
                        break;
                    default:
                        i3 = 95;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0002;\t\u0011/\u0005<\tN6\u0005*\u000f\u00130\u0018oU";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = ") \u0013\u000f:\t;\u0014\u000e1";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = ":\u0000.5";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0002;\t\u0011q\t \u0013\u000f:\t;\u0014\u000e1";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0002;\t\u0011/\u0005<\tN=\u000b+P\u0012+\u000b;\b\u0012<\u0005+\u0018A";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "Co";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "?\u001b;Lg";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\t#\u0012\u0012:";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0002;\t\u0011/\u0005<\tN7\u001e;\r\u0004-\u0018 \u000fAw";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0002;\t\u0011/\u0005<\tN:\u0018=\u0012\u0013\u007fB";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "Co";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "Jg";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0002;\t\u0011p\b.\u0019L/\u0018 \t\u000e<\u0005#";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0002;\t\u0011p\b.\u0019\u0014-\u0006";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0002;\t\u0011,";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0002;\t\u0011p\u0004 P\u0015>\u0018(\u0018\u0015";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0002;\t\u0011p\u000b+\u0019\u0013p\u0004 P\t0\u0019;";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Co";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static alo a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                Log.e(z[17]);
                return null;
            }
            try {
                URL url = new URL(str);
                if (url.getProtocol().equals(z[16])) {
                    return new alo(url);
                }
                Log.e(z[14]);
                return null;
            } catch (MalformedURLException e) {
                Log.e(z[15]);
                return null;
            }
        } catch (MalformedURLException e2) {
            throw e2;
        }
    }

    private alo(URL url) {
        this.b = url;
        this.c = new ArrayList();
        this.a = new BasicHttpProcessor();
        this.a.addInterceptor(new RequestContent());
        this.a.addInterceptor(new RequestTargetHost());
        this.a.addInterceptor(new RequestUserAgent());
        this.a.removeRequestInterceptorByClass(RequestExpectContinue.class);
    }

    public void a(HttpEntity httpEntity) {
        this.d = httpEntity;
    }

    public void a(String str, String str2) {
        this.c.add(new BasicNameValuePair(str, str2));
    }

    private static List b(String str) {
        if (str != null) {
            return App.C.b(str);
        }
        Log.e(z[18]);
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.HttpResponse a() {
        /*
        r14_this = this;
        r3 = 0;
        r0 = 4;
        r2 = 0;
        r5 = com.whatsapp.m3.d;
        r1 = r14.b;
        r1 = r1.getHost();
        r6 = b(r1);
        if (r6 != 0) goto L_0x001c;
    L_0x0011:
        r0 = z;	 Catch:{ IOException -> 0x001a }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ IOException -> 0x001a }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x001a }
    L_0x0019:
        return r2;
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        r1 = r14.b;
        r1 = r1.getPort();
        r4 = -1;
        if (r1 != r4) goto L_0x0264;
    L_0x0025:
        r1 = r14.b;
        r1 = r1.getDefaultPort();
        r4 = r1;
    L_0x002c:
        java.util.Collections.shuffle(r6);	 Catch:{ IOException -> 0x017c }
        r1 = r6.size();	 Catch:{ IOException -> 0x017c }
        if (r1 <= r0) goto L_0x017e;
    L_0x0035:
        r1 = r0;
    L_0x0036:
        if (r3 >= r1) goto L_0x025e;
    L_0x0038:
        r8 = java.lang.Math.random();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r10 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r12 = (double) r3;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r10 = java.lang.Math.pow(r10, r12);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r12 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r10 = r10 - r12;
        r12 = 4661014508095930368; // 0x40af400000000000 float:0.0 double:4000.0;
        r10 = r10 * r12;
        r8 = r8 * r10;
        r0 = (int) r8;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r8 = (long) r0;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        java.lang.Thread.sleep(r8);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r7 = new org.apache.http.params.BasicHttpParams;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r7.<init>();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = org.apache.http.HttpVersion.HTTP_1_1;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        org.apache.http.params.HttpProtocolParams.setVersion(r7, r0);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = z;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r8 = 8;
        r0 = r0[r8];	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        org.apache.http.params.HttpProtocolParams.setContentCharset(r7, r0);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = com.whatsapp.ak9.a();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        org.apache.http.params.HttpProtocolParams.setUserAgent(r7, r0);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r8 = new org.apache.http.protocol.BasicHttpContext;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = 0;
        r8.<init>(r0);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r9 = new org.apache.http.impl.DefaultHttpClientConnection;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r9.<init>();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r10 = new org.apache.http.protocol.HttpRequestExecutor;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r10.<init>();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = r6.get(r3);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = (java.net.InetAddress) r0;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r11 = new java.net.Socket;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r11.<init>();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r12 = new java.net.InetSocketAddress;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r12.<init>(r0, r4);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r11.connect(r12, r0);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r11.setSoTimeout(r0);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r12 = 8;
        if (r0 >= r12) goto L_0x00a6;
    L_0x009e:
        r0 = javax.net.ssl.SSLSocketFactory.getDefault();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = (javax.net.ssl.SSLSocketFactory) r0;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        if (r5 == 0) goto L_0x00ae;
    L_0x00a6:
        r0 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r12 = 0;
        r0 = android.net.SSLCertificateSocketFactory.getDefault(r0, r12);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
    L_0x00ae:
        r12 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r11.setSoTimeout(r12);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r12 = r14.b;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r12 = r12.getHost();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r13 = 1;
        r0 = r0.createSocket(r11, r12, r4, r13);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r11 = z;	 Catch:{ IOException -> 0x0185, HttpException -> 0x01cb, Exception -> 0x0210 }
        r12 = 5;
        r11 = r11[r12];	 Catch:{ IOException -> 0x0185, HttpException -> 0x01cb, Exception -> 0x0210 }
        r8.setAttribute(r11, r9);	 Catch:{ IOException -> 0x0185, HttpException -> 0x01cb, Exception -> 0x0210 }
        r11 = r9.isOpen();	 Catch:{ IOException -> 0x0185, HttpException -> 0x01cb, Exception -> 0x0210 }
        if (r11 != 0) goto L_0x00d0;
    L_0x00cd:
        r9.bind(r0, r7);	 Catch:{ IOException -> 0x0185, HttpException -> 0x01cb, Exception -> 0x0210 }
    L_0x00d0:
        r11 = new org.apache.http.message.BasicHttpEntityEnclosingRequest;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = z;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r12 = 4;
        r0 = r0[r12];	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r12 = r14.b;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r12 = r12.getPath();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r11.<init>(r0, r12);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = r14.d;	 Catch:{ IOException -> 0x01c9, HttpException -> 0x01cb, Exception -> 0x0210 }
        if (r0 == 0) goto L_0x00e9;
    L_0x00e4:
        r0 = r14.d;	 Catch:{ IOException -> 0x01c9, HttpException -> 0x01cb, Exception -> 0x0210 }
        r11.setEntity(r0);	 Catch:{ IOException -> 0x01c9, HttpException -> 0x01cb, Exception -> 0x0210 }
    L_0x00e9:
        r0 = z;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r12 = 3;
        r0 = r0[r12];	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r12 = z;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r13 = 9;
        r12 = r12[r13];	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r11.addHeader(r0, r12);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = r14.c;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r12 = r0.iterator();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
    L_0x00fd:
        r0 = r12.hasNext();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        if (r0 == 0) goto L_0x0116;
    L_0x0103:
        r0 = r12.next();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = (org.apache.http.NameValuePair) r0;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r13 = r0.getName();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = r0.getValue();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r11.addHeader(r13, r0);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        if (r5 == 0) goto L_0x00fd;
    L_0x0116:
        r11.setParams(r7);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = r14.a;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r10.preProcess(r11, r0, r8);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0 = r10.execute(r11, r9, r8);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r0.setParams(r7);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r7 = r14.a;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r10.postProcess(r0, r7, r8);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r7 = r0.getStatusLine();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r7 = r7.getStatusCode();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r8 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r7 < r8) goto L_0x0179;
    L_0x0136:
        r8 = r1 + -1;
        if (r3 == r8) goto L_0x0179;
    L_0x013a:
        r8 = com.whatsapp.App.a();	 Catch:{ IOException -> 0x020e, HttpException -> 0x01cb, Exception -> 0x0210 }
        if (r8 == 0) goto L_0x0179;
    L_0x0140:
        r8 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r8.<init>();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r9 = z;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r10 = 6;
        r9 = r9[r10];	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r8 = r8.append(r9);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r7 = r8.append(r7);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r8 = z;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r9 = 13;
        r8 = r8[r9];	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r7 = r7.append(r3);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r8 = "/";
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r7 = r7.append(r1);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r8 = ")";
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        r7 = r7.toString();	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        com.whatsapp.util.Log.w(r7);	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
        if (r5 == 0) goto L_0x025a;
    L_0x0179:
        r2 = r0;
        goto L_0x0019;
    L_0x017c:
        r0 = move-exception;
        throw r0;
    L_0x017e:
        r0 = r6.size();
        r1 = r0;
        goto L_0x0036;
    L_0x0185:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
    L_0x0187:
        r0 = move-exception;
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0254 }
        r7.<init>();	 Catch:{ IOException -> 0x0254 }
        r8 = z;	 Catch:{ IOException -> 0x0254 }
        r9 = 2;
        r8 = r8[r9];	 Catch:{ IOException -> 0x0254 }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0254 }
        r7 = r7.append(r3);	 Catch:{ IOException -> 0x0254 }
        r8 = "/";
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0254 }
        r7 = r7.append(r1);	 Catch:{ IOException -> 0x0254 }
        r8 = z;	 Catch:{ IOException -> 0x0254 }
        r9 = 7;
        r8 = r8[r9];	 Catch:{ IOException -> 0x0254 }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0254 }
        r8 = r0.toString();	 Catch:{ IOException -> 0x0254 }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0254 }
        r7 = r7.toString();	 Catch:{ IOException -> 0x0254 }
        com.whatsapp.util.Log.w(r7);	 Catch:{ IOException -> 0x0254 }
        r7 = r1 + -1;
        if (r3 == r7) goto L_0x01c6;
    L_0x01c0:
        r7 = com.whatsapp.App.a();	 Catch:{ IOException -> 0x01c7 }
        if (r7 != 0) goto L_0x025a;
    L_0x01c6:
        throw r0;	 Catch:{ IOException -> 0x01c7 }
    L_0x01c7:
        r0 = move-exception;
        throw r0;
    L_0x01c9:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
    L_0x01cb:
        r0 = move-exception;
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0256 }
        r7.<init>();	 Catch:{ IOException -> 0x0256 }
        r8 = z;	 Catch:{ IOException -> 0x0256 }
        r9 = 10;
        r8 = r8[r9];	 Catch:{ IOException -> 0x0256 }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0256 }
        r7 = r7.append(r3);	 Catch:{ IOException -> 0x0256 }
        r8 = "/";
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0256 }
        r7 = r7.append(r1);	 Catch:{ IOException -> 0x0256 }
        r8 = z;	 Catch:{ IOException -> 0x0256 }
        r9 = 1;
        r8 = r8[r9];	 Catch:{ IOException -> 0x0256 }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0256 }
        r8 = r0.toString();	 Catch:{ IOException -> 0x0256 }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0256 }
        r7 = r7.toString();	 Catch:{ IOException -> 0x0256 }
        com.whatsapp.util.Log.w(r7);	 Catch:{ IOException -> 0x0256 }
        r7 = r1 + -1;
        if (r3 == r7) goto L_0x020b;
    L_0x0205:
        r7 = com.whatsapp.App.a();	 Catch:{ IOException -> 0x020c }
        if (r7 != 0) goto L_0x025a;
    L_0x020b:
        throw r0;	 Catch:{ IOException -> 0x020c }
    L_0x020c:
        r0 = move-exception;
        throw r0;
    L_0x020e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0187, HttpException -> 0x01cb, Exception -> 0x0210 }
    L_0x0210:
        r0 = move-exception;
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0258 }
        r7.<init>();	 Catch:{ IOException -> 0x0258 }
        r8 = z;	 Catch:{ IOException -> 0x0258 }
        r9 = 11;
        r8 = r8[r9];	 Catch:{ IOException -> 0x0258 }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0258 }
        r7 = r7.append(r3);	 Catch:{ IOException -> 0x0258 }
        r8 = "/";
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0258 }
        r7 = r7.append(r1);	 Catch:{ IOException -> 0x0258 }
        r8 = z;	 Catch:{ IOException -> 0x0258 }
        r9 = 12;
        r8 = r8[r9];	 Catch:{ IOException -> 0x0258 }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0258 }
        r8 = r0.toString();	 Catch:{ IOException -> 0x0258 }
        r7 = r7.append(r8);	 Catch:{ IOException -> 0x0258 }
        r7 = r7.toString();	 Catch:{ IOException -> 0x0258 }
        com.whatsapp.util.Log.w(r7);	 Catch:{ IOException -> 0x0258 }
        r7 = r1 + -1;
        if (r3 == r7) goto L_0x0251;
    L_0x024b:
        r7 = com.whatsapp.App.a();	 Catch:{ IOException -> 0x0252 }
        if (r7 != 0) goto L_0x025a;
    L_0x0251:
        throw r0;	 Catch:{ IOException -> 0x0252 }
    L_0x0252:
        r0 = move-exception;
        throw r0;
    L_0x0254:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01c7 }
    L_0x0256:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x020c }
    L_0x0258:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0252 }
    L_0x025a:
        r0 = r3 + 1;
        if (r5 == 0) goto L_0x0261;
    L_0x025e:
        r0 = r2;
        goto L_0x0179;
    L_0x0261:
        r3 = r0;
        goto L_0x0036;
    L_0x0264:
        r4 = r1;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.alo.a():org.apache.http.HttpResponse");
    }
}
