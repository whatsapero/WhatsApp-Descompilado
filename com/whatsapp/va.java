package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class va {
    private static final String[] z;
    final anx a;
    final int b;
    int c;
    final w1 d;
    final int e;
    LinkedList f;
    final URL g;

    static {
        String[] strArr = new String[20];
        String str = "S\u0014\u007fz";
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
                        i3 = 94;
                        break;
                    case ay.f /*1*/:
                        i3 = 30;
                        break;
                    case ay.n /*2*/:
                        i3 = 82;
                        break;
                    case ay.p /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 63;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "S\u0014\u007fz";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "s3*\u000eE\u0004G_]";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "&G(\rf";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "&G(\rf";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001dq<#Z0j\u007f\u0003F.{hw^.n>>\\?j;8Qqq1#Z*3!#M;\u007f?Z5";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001dq<#Z0j\u007f\u0005^0y7m\u001f<g&2L~";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "s3_]";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "|\u0013X";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "|\u0013XZ5";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "S\u0014\u00118Q*{<#\u0012\u001aw!'P-w&>P0$r1P,s\u007f3^*\u007fiwQ?s7j\u001d";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u001dq<#Z0j\u007f\u0003F.{";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "S\u0014";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "S\u0014";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "s4}}2T";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u001dq<#Z0j\u007f\u0013V-n=$V*w=9\u0005~x=%Rsz3#^e><6R;#p1V2{plY7r79^3{ou";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "S\u0014";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "S\u0014";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "8w>2J.r=6[qp=%Z-n=9L;";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "3k>#V.\u007f #\u00108q :\u0012:\u007f&6\u0004<q'9[?l+jG\u0007d\b\u000e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public va(URL url, File file, int i, int i2, anx com_whatsapp_anx) {
        this(url, new s6(file), 0, i2, com_whatsapp_anx);
    }

    static void a(OutputStream outputStream, String str) {
        int i = App.az;
        StringReader stringReader = new StringReader(str);
        do {
            try {
                int read = stringReader.read();
                if (read == -1) {
                    break;
                }
                outputStream.write((char) read);
            } catch (Throwable e) {
                Log.c(e);
            }
        } while (i == 0);
        outputStream.flush();
    }

    public va(URL url, File file, int i, anx com_whatsapp_anx) {
        this(url, file, 0, i, com_whatsapp_anx);
    }

    public boolean b() {
        int i = App.az;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(z[3]).append(z[16]).append(this.d.a().replace(z[17], "")).append(z[9]).append(z[6]);
            if (this.b != 0) {
                stringBuilder.append(z[7] + this.b + z[15]);
            }
            stringBuilder.append(z[14]);
            String toString = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                jm jmVar = (jm) it.next();
                String replace = jmVar.c.replace(z[13], "");
                stringBuilder2.append(z[0]).append(z[5]).append(z[11]).append(replace).append(z[10]).append(jmVar.b.replace(z[18], ""));
                if (i != 0) {
                    break;
                }
            }
            stringBuilder2.append(z[2]).append(z[4]).append(z[8]);
            String toString2 = stringBuilder2.toString();
            try {
                long length;
                if (this.d.c() >= 0) {
                    length = ((((long) toString.length()) + this.d.c()) + ((long) toString2.length())) - ((long) this.b);
                } else {
                    length = -1;
                }
                HttpEntity x1Var = new x1(this, new em(this, toString, toString2), length);
                alo a = alo.a(this.g.toString());
                a.a(x1Var);
                a.a(z[12], z[1]);
                try {
                    HttpResponse a2 = a.a();
                    if (a2 == null) {
                        try {
                            Log.w(z[19]);
                            return false;
                        } catch (SocketTimeoutException e) {
                            throw e;
                        }
                    }
                    try {
                        this.c = a2.getStatusLine().getStatusCode();
                        if (Thread.currentThread().isInterrupted()) {
                            return false;
                        }
                        try {
                            if (this.a == null) {
                                return true;
                            }
                            this.a.a(EntityUtils.toString(a2.getEntity()));
                            return true;
                        } catch (SocketTimeoutException e2) {
                            throw e2;
                        }
                    } catch (SocketTimeoutException e22) {
                        throw e22;
                    }
                } catch (SocketTimeoutException e3) {
                    return false;
                }
            } catch (SocketTimeoutException e222) {
                throw e222;
            }
        } catch (SocketTimeoutException e2222) {
            throw e2222;
        }
    }

    public int a() {
        return this.c;
    }

    public void a(String str, String str2) {
        this.f.add(new jm(this, str, str2));
    }

    public va(URL url, w1 w1Var, int i, int i2, anx com_whatsapp_anx) {
        this.f = new LinkedList();
        this.g = url;
        this.d = w1Var;
        this.b = i;
        this.e = i2;
        this.a = com_whatsapp_anx;
    }
}
