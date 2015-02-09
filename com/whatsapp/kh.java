package com.whatsapp;

import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class kh {
    private static final String[] z;

    static {
        String[] strArr = new String[15];
        String str = "\u0004Ou\u0019jV\u0014.\u0000t\u000b\u0015x\u0006l\u0018Nc\f7\u000fTlFo\u0005\u0014";
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
                        i3 = 108;
                        break;
                    case ay.f /*1*/:
                        i3 = 59;
                        break;
                    case ay.n /*2*/:
                        i3 = 1;
                        break;
                    case ay.p /*3*/:
                        i3 = 105;
                        break;
                    default:
                        i3 = 25;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0015Tt\u001dl\u000e^/\nv\u0001";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "C_d\u000fx\u0019WuGs\u001c\\";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0005Ot\u0007|\u001f\u0015`\u0019i\u0000^/\nv\u0001";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0004Ou\u0019jV\u0014.\u0000m\u0019Ud\u001a7\rKq\u0005|BXn\u00046\u0000Tn\u0002l\u001c\u0004h\r$";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001cW`\u00107\u000bTn\u000eu\t\u0015b\u0006t";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001e^r\u001cu\u0018H";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0005V`\u000e|LOn\u00069\u0000Zs\u000e|";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "I\t1";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "C_d\u000fx\u0019WuGs\u001c\\";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "9oGD!";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0005_";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\rIu\u001ev\u001ePT\u001bu]\u000b1";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0015Tt\u001dlBYd";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0004Ou\u0019jV\u0014.\u0000t\u000b\u0015x\u0006l\u0018Nc\f7\u000fTlFo\u0005\u0014";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static byte[] a(String str) {
        byte[] bArr = null;
        int i = App.az;
        try {
            if (!TextUtils.isEmpty(str)) {
                CharSequence spannableString = new SpannableString(str);
                Linkify.addLinks(spannableString, 1);
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
                if (uRLSpanArr != null) {
                    try {
                        if (uRLSpanArr.length > 0) {
                            Uri parse = Uri.parse(uRLSpanArr[0].getURL());
                            try {
                                String str2;
                                InputStream openStream;
                                Object path;
                                if (parse.getHost() == null || !parse.getHost().endsWith(z[2])) {
                                    try {
                                    } catch (Exception e) {
                                        throw e;
                                    }
                                    if (parse.getHost() == null || !parse.getHost().endsWith(z[14])) {
                                        try {
                                        } catch (Exception e2) {
                                            throw e2;
                                        } catch (Exception e22) {
                                            throw e22;
                                        }
                                        if (parse.getHost() == null || !parse.getHost().endsWith(z[6])) {
                                            try {
                                                if (parse.getHost() != null && parse.getHost().endsWith(z[4])) {
                                                    try {
                                                        BufferedReader bufferedReader;
                                                        StringBuilder stringBuilder;
                                                        JSONArray optJSONArray;
                                                        JSONObject optJSONObject;
                                                        List pathSegments = parse.getPathSegments();
                                                        if (pathSegments != null) {
                                                            if (pathSegments.size() > 0) {
                                                                str2 = (String) pathSegments.get(pathSegments.size() - 1);
                                                                if (str2.startsWith(z[12])) {
                                                                    str2 = str2.substring(2);
                                                                    if (str2 != null) {
                                                                        openStream = new URL(z[5] + str2).openStream();
                                                                        bufferedReader = new BufferedReader(new InputStreamReader(openStream, z[11]));
                                                                        stringBuilder = new StringBuilder();
                                                                        str2 = bufferedReader.readLine();
                                                                        while (str2 != null) {
                                                                            stringBuilder.append(str2);
                                                                            str2 = bufferedReader.readLine();
                                                                            if (i != 0) {
                                                                                break;
                                                                            }
                                                                        }
                                                                        openStream.close();
                                                                        optJSONArray = new JSONObject(stringBuilder.toString()).optJSONArray(z[7]);
                                                                        if (optJSONArray != null) {
                                                                            optJSONObject = optJSONArray.optJSONObject(0);
                                                                            if (optJSONObject != null) {
                                                                                str2 = optJSONObject.optString(z[13]);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        str2 = null;
                                                        if (str2 != null) {
                                                            openStream = new URL(z[5] + str2).openStream();
                                                            bufferedReader = new BufferedReader(new InputStreamReader(openStream, z[11]));
                                                            stringBuilder = new StringBuilder();
                                                            str2 = bufferedReader.readLine();
                                                            while (str2 != null) {
                                                                stringBuilder.append(str2);
                                                                str2 = bufferedReader.readLine();
                                                                if (i != 0) {
                                                                    break;
                                                                    openStream.close();
                                                                    optJSONArray = new JSONObject(stringBuilder.toString()).optJSONArray(z[7]);
                                                                    if (optJSONArray != null) {
                                                                        optJSONObject = optJSONArray.optJSONObject(0);
                                                                        if (optJSONObject != null) {
                                                                            str2 = optJSONObject.optString(z[13]);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            openStream.close();
                                                            optJSONArray = new JSONObject(stringBuilder.toString()).optJSONArray(z[7]);
                                                            if (optJSONArray != null) {
                                                                optJSONObject = optJSONArray.optJSONObject(0);
                                                                if (optJSONObject != null) {
                                                                    str2 = optJSONObject.optString(z[13]);
                                                                }
                                                            }
                                                        }
                                                    } catch (Exception e222) {
                                                        throw e222;
                                                    } catch (Throwable e3) {
                                                        Log.b(e3);
                                                    }
                                                }
                                            } catch (Exception e2222) {
                                                throw e2222;
                                            }
                                            str2 = null;
                                        } else {
                                            str2 = null;
                                        }
                                    } else {
                                        path = parse.getPath();
                                        if (!TextUtils.isEmpty(path)) {
                                            str2 = z[1] + path.substring(1) + z[3];
                                        }
                                        str2 = null;
                                    }
                                } else {
                                    path = parse.getQueryParameter("v");
                                    if (!TextUtils.isEmpty(path)) {
                                        str2 = z[0] + path + z[10];
                                    }
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    try {
                                        openStream = new URL(str2.replace(" ", z[9])).openStream();
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        byte[] bArr2 = new byte[1024];
                                        int i2 = 0;
                                        do {
                                            int read = openStream.read(bArr2, 0, 1024);
                                            if (read == -1 && i == 0) {
                                                break;
                                            }
                                            byteArrayOutputStream.write(bArr2, 0, read);
                                            i2 += read;
                                            if (i2 > 204800) {
                                                throw new IOException(z[8]);
                                            }
                                        } while (i == 0);
                                        break;
                                        byteArrayOutputStream.close();
                                        openStream.close();
                                        bArr = byteArrayOutputStream.toByteArray();
                                    } catch (Exception e22222) {
                                        throw e22222;
                                    } catch (Throwable e32) {
                                        Log.b(e32);
                                    }
                                }
                            } catch (Exception e222222) {
                                throw e222222;
                            }
                        }
                    } catch (Exception e2222222) {
                        throw e2222222;
                    }
                }
            }
            return bArr;
        } catch (Exception e22222222) {
            throw e22222222;
        }
    }
}
