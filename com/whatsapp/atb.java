package com.whatsapp;

import android.location.Location;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class atb extends ArrayList {
    public static final String b;
    public static final String c;
    public static final String h;
    public static final String i;
    public static final String k;
    private static ArrayList l;
    private static final String[] z;
    protected boolean a;
    protected String d;
    protected String e;
    protected int f;
    protected String g;
    public int j;
    protected Location m;

    private static atb a(int i, Location location, int i2, String str, String str2) {
        int i3 = App.az;
        Iterator it = l.iterator();
        while (it.hasNext()) {
            atb com_whatsapp_atb = (atb) it.next();
            try {
                if (com_whatsapp_atb.d.equalsIgnoreCase(str) && com_whatsapp_atb.e.equalsIgnoreCase(str2)) {
                    double d = ((double) ((com_whatsapp_atb.f + i2) / 2)) * 0.2d;
                    if (((double) com_whatsapp_atb.m.distanceTo(location)) < d) {
                        try {
                            if (((double) Math.abs(com_whatsapp_atb.f - i2)) < d) {
                                return com_whatsapp_atb;
                            }
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                    continue;
                }
                if (i3 != 0) {
                    break;
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        return null;
    }

    static {
        String[] strArr = new String[25];
        String str = "\u001c\u0014Fzv\u001c\u001eOi\u007f\u0004\u000fUhn";
        Object obj = 24;
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
                        i3 = 85;
                        break;
                    case ay.f /*1*/:
                        i3 = 90;
                        break;
                    case ay.n /*2*/:
                        i3 = 16;
                        break;
                    case ay.p /*3*/:
                        i3 = 59;
                        break;
                    default:
                        i3 = 58;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "';tRO&";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0000\u000eV\u0016\u0002";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\rwBZN0\u0016yVS!w\\RW<.*\u001b";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "96";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ";50I_&*\u007fUI0";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\rwBZN0\u0016yVS!w\\RW<.";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\rwBZN0\u0016yVS!wB^W43~RT2";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "'?cKU;)u";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "#?~N_&";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ">?iLU'>";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u001a\u0011";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ";50I_&*\u007fUI0";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "9;~\\O4=u";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "';tRO&";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    str = "!#`^I";
                    obj = 15;
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    strArr2 = strArr3;
                    str = "\u001a\fUie\u0004\u000fUic\n\u0016Yvs\u0001";
                    obj = 16;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "95sZN<5~";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0000\u000eV\u0016\u0002";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "&.qOO&";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "2?\u007fXU1?=\f\u000b{*~\\";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "i8b\u001b\u0015k";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "'?cNV!)";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "=.}We4.dIS7/dRU;)";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    z = strArr3;
                    l = new ArrayList();
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    c = str;
                    str = "\u0007\u001fAn\u007f\u0006\u000eO\u007f\u007f\u001b\u0013U\u007f";
                    obj = 25;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    b = str;
                    str = "\u001a\u0011";
                    obj = 26;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    i = str;
                    str = "\u001a\fUie\u0004\u000fUic\n\u0016Yvs\u0001";
                    obj = 27;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    k = str;
                    str = "\u000f\u001fBte\u0007\u001fCnv\u0001\t";
                    obj = 28;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    h = str;
                    str = "\rwBZN0\u0016yVS!wB^W43~RT2`0";
                    obj = -1;
                    break;
                default:
                    strArr2[i] = str;
                    str = "$/uIC";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public atb() {
        this.d = "";
        this.e = "";
    }

    public void a(Location location) {
        int i = App.az;
        Iterator it = iterator();
        while (it.hasNext()) {
            PlaceInfo placeInfo = (PlaceInfo) it.next();
            placeInfo.dist = (double) placeInfo.getLocation().distanceTo(location);
            if (i != 0) {
                break;
            }
        }
        Collections.sort(this, new afm(this));
    }

    public void a(JSONObject jSONObject) {
        int i = 0;
        int i2 = App.az;
        JSONArray jSONArray = jSONObject.getJSONObject(z[9]).getJSONArray(z[10]);
        while (i < jSONArray.length()) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                PlaceInfo placeInfo = new PlaceInfo();
                placeInfo.fromJsonFoursquare(jSONObject2, false);
                add(placeInfo);
            } catch (Throwable e) {
                Log.c(e);
            }
            i++;
            if (i2 != 0) {
                return;
            }
        }
    }

    public PlaceInfo a(String str) {
        int i = App.az;
        Iterator it = iterator();
        while (it.hasNext()) {
            PlaceInfo placeInfo = (PlaceInfo) it.next();
            try {
                if (!str.equalsIgnoreCase(placeInfo.placeId)) {
                    if (i != 0) {
                        break;
                    }
                }
                return placeInfo;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return null;
    }

    public static void a(int i) {
        int i2 = App.az;
        Collection arrayList = new ArrayList();
        Iterator it = l.iterator();
        while (it.hasNext()) {
            atb com_whatsapp_atb = (atb) it.next();
            try {
                if (com_whatsapp_atb.j == i) {
                    arrayList.add(com_whatsapp_atb);
                    continue;
                }
                if (i2 != 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        l.removeAll(arrayList);
    }

    public PlaceInfo b(String str) {
        int i = App.az;
        Iterator it = iterator();
        while (it.hasNext()) {
            PlaceInfo placeInfo = (PlaceInfo) it.next();
            try {
                if (!str.equalsIgnoreCase(placeInfo.name)) {
                    if (i != 0) {
                        break;
                    }
                }
                return placeInfo;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return null;
    }

    public boolean a() {
        return this.a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(org.json.JSONObject r9) {
        /*
        r8_this = this;
        r1 = 0;
        r3 = com.whatsapp.App.az;
        r0 = z;
        r2 = 23;
        r0 = r0[r2];
        r4 = r9.getJSONArray(r0);
        r0 = r1;
    L_0x000e:
        r2 = r4.length();
        if (r0 >= r2) goto L_0x003a;
    L_0x0014:
        r2 = r4.getJSONObject(r0);	 Catch:{ JSONException -> 0x0093 }
        r5 = new com.whatsapp.PlaceInfo;	 Catch:{ JSONException -> 0x0093 }
        r5.<init>();	 Catch:{ JSONException -> 0x0093 }
        r6 = 0;
        r5.fromJsonGoogle(r2, r6);	 Catch:{ JSONException -> 0x008f }
        r2 = r5.icon;	 Catch:{ JSONException -> 0x008f }
        if (r2 == 0) goto L_0x0033;
    L_0x0025:
        r2 = r5.icon;	 Catch:{ JSONException -> 0x008f }
        r6 = z;	 Catch:{ JSONException -> 0x008f }
        r7 = 21;
        r6 = r6[r7];	 Catch:{ JSONException -> 0x008f }
        r2 = r2.endsWith(r6);	 Catch:{ JSONException -> 0x008f }
        if (r2 != 0) goto L_0x0036;
    L_0x0033:
        r8.add(r5);	 Catch:{ JSONException -> 0x0091 }
    L_0x0036:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x000e;
    L_0x003a:
        r0 = z;	 Catch:{ JSONException -> 0x009a }
        r2 = 24;
        r0 = r0[r2];	 Catch:{ JSONException -> 0x009a }
        r0 = r9.getJSONArray(r0);	 Catch:{ JSONException -> 0x009a }
        r2 = r0.length();	 Catch:{ JSONException -> 0x009a }
        if (r2 <= 0) goto L_0x008e;
    L_0x004a:
        r2 = "";
        r8.g = r2;	 Catch:{ JSONException -> 0x009a }
    L_0x004e:
        r2 = r0.length();	 Catch:{ JSONException -> 0x009a }
        if (r1 >= r2) goto L_0x008e;
    L_0x0054:
        if (r1 <= 0) goto L_0x0071;
    L_0x0056:
        r2 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0098 }
        r2.<init>();	 Catch:{ JSONException -> 0x0098 }
        r4 = r8.g;	 Catch:{ JSONException -> 0x0098 }
        r2 = r2.append(r4);	 Catch:{ JSONException -> 0x0098 }
        r4 = z;	 Catch:{ JSONException -> 0x0098 }
        r5 = 22;
        r4 = r4[r5];	 Catch:{ JSONException -> 0x0098 }
        r2 = r2.append(r4);	 Catch:{ JSONException -> 0x0098 }
        r2 = r2.toString();	 Catch:{ JSONException -> 0x0098 }
        r8.g = r2;	 Catch:{ JSONException -> 0x0098 }
    L_0x0071:
        r2 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x009a }
        r2.<init>();	 Catch:{ JSONException -> 0x009a }
        r4 = r8.g;	 Catch:{ JSONException -> 0x009a }
        r2 = r2.append(r4);	 Catch:{ JSONException -> 0x009a }
        r4 = r0.getString(r1);	 Catch:{ JSONException -> 0x009a }
        r2 = r2.append(r4);	 Catch:{ JSONException -> 0x009a }
        r2 = r2.toString();	 Catch:{ JSONException -> 0x009a }
        r8.g = r2;	 Catch:{ JSONException -> 0x009a }
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x004e;
    L_0x008e:
        return;
    L_0x008f:
        r2 = move-exception;
        throw r2;	 Catch:{ JSONException -> 0x0091 }
    L_0x0091:
        r2 = move-exception;
        throw r2;	 Catch:{ JSONException -> 0x0093 }
    L_0x0093:
        r2 = move-exception;
        com.whatsapp.util.Log.c(r2);
        goto L_0x0036;
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        goto L_0x008e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.atb.b(org.json.JSONObject):void");
    }

    public static atb a(Location location, int i, String str, String str2) {
        String str3;
        String str4;
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        if (str2 == null) {
            str4 = "";
        } else {
            str4 = str2;
        }
        atb a = a(2, location, i, str3, str4);
        if (a == null) {
            a = new atb(2, location, i, str3, str4);
            List arrayList = new ArrayList();
            try {
                arrayList.add(new BasicNameValuePair(z[5], location.getLatitude() + "," + location.getLongitude()));
                arrayList.add(new BasicNameValuePair(z[2], Integer.toString(Math.min(i, 99999))));
                if (!(str4 == null || "".equals(str4))) {
                    arrayList.add(new BasicNameValuePair(z[1], str4));
                }
                HttpParams basicHttpParams = new BasicHttpParams();
                HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
                HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
                HttpProtocolParams.setUserAgent(basicHttpParams, ak9.a());
                HttpResponse execute = new DefaultHttpClient(basicHttpParams).execute(new HttpGet(ce.g + URLEncodedUtils.format(arrayList, z[3])));
                if (execute == null) {
                    try {
                        throw new IOException(z[6]);
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                Header firstHeader = execute.getFirstHeader(z[7]);
                if (firstHeader != null) {
                    try {
                        Log.i(z[4] + firstHeader.getValue());
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
                firstHeader = execute.getFirstHeader(z[8]);
                if (firstHeader != null) {
                    Object value = firstHeader.getValue();
                    Log.i(z[0] + value);
                    if (!TextUtils.isEmpty(value)) {
                        try {
                            if (Integer.parseInt(value) == 0) {
                                a.a = true;
                            }
                        } catch (NumberFormatException e3) {
                            throw e3;
                        } catch (NumberFormatException e4) {
                        }
                    }
                }
                if (execute.getStatusLine().getStatusCode() == 200) {
                    try {
                        a.a(new JSONObject(EntityUtils.toString(execute.getEntity())));
                        l.add(a);
                        if (l.size() > 12) {
                            l.remove(0);
                        }
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                }
            } catch (NumberFormatException e222) {
                throw e222;
            } catch (NumberFormatException e2222) {
                throw e2222;
            }
        }
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.atb b(android.location.Location r11, int r12, java.lang.String r13, java.lang.String r14) {
        /*
        r10 = 12;
        r1 = 1;
        if (r13 != 0) goto L_0x0176;
    L_0x0005:
        r4 = "";
    L_0x0007:
        if (r14 != 0) goto L_0x0173;
    L_0x0009:
        r5 = "";
    L_0x000b:
        r2 = (double) r12;
        r2 = java.lang.Math.log(r2);
        r6 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r6 = java.lang.Math.log(r6);
        r2 = r2 / r6;
        r0 = (int) r2;
        r0 = a(r1, r11, r12, r4, r5);
        if (r0 != 0) goto L_0x016a;
    L_0x001e:
        r0 = new com.whatsapp.atb;
        r2 = r11;
        r3 = r12;
        r0.<init>(r1, r2, r3, r4, r5);
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x010a }
        r3 = z;	 Catch:{ NumberFormatException -> 0x010a }
        r6 = 18;
        r3 = r3[r6];	 Catch:{ NumberFormatException -> 0x010a }
        r6 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x010a }
        r6.<init>();	 Catch:{ NumberFormatException -> 0x010a }
        r8 = r11.getLatitude();	 Catch:{ NumberFormatException -> 0x010a }
        r6 = r6.append(r8);	 Catch:{ NumberFormatException -> 0x010a }
        r7 = ",";
        r6 = r6.append(r7);	 Catch:{ NumberFormatException -> 0x010a }
        r8 = r11.getLongitude();	 Catch:{ NumberFormatException -> 0x010a }
        r6 = r6.append(r8);	 Catch:{ NumberFormatException -> 0x010a }
        r6 = r6.toString();	 Catch:{ NumberFormatException -> 0x010a }
        r2.<init>(r3, r6);	 Catch:{ NumberFormatException -> 0x010a }
        r1.add(r2);	 Catch:{ NumberFormatException -> 0x010a }
        r2 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x010a }
        r3 = z;	 Catch:{ NumberFormatException -> 0x010a }
        r6 = 15;
        r3 = r3[r6];	 Catch:{ NumberFormatException -> 0x010a }
        r6 = java.lang.Integer.toString(r12);	 Catch:{ NumberFormatException -> 0x010a }
        r2.<init>(r3, r6);	 Catch:{ NumberFormatException -> 0x010a }
        r1.add(r2);	 Catch:{ NumberFormatException -> 0x010a }
        if (r5 == 0) goto L_0x0081;
    L_0x006b:
        r2 = "";
        r2 = r2.equals(r5);	 Catch:{ NumberFormatException -> 0x010c }
        if (r2 != 0) goto L_0x0081;
    L_0x0073:
        r2 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x010c }
        r3 = z;	 Catch:{ NumberFormatException -> 0x010c }
        r6 = 11;
        r3 = r3[r6];	 Catch:{ NumberFormatException -> 0x010c }
        r2.<init>(r3, r5);	 Catch:{ NumberFormatException -> 0x010c }
        r1.add(r2);	 Catch:{ NumberFormatException -> 0x010c }
    L_0x0081:
        if (r4 == 0) goto L_0x0099;
    L_0x0083:
        r2 = "";
        r2 = r2.equals(r4);	 Catch:{ NumberFormatException -> 0x010e }
        if (r2 != 0) goto L_0x0099;
    L_0x008b:
        r2 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x010e }
        r3 = z;	 Catch:{ NumberFormatException -> 0x010e }
        r5 = 16;
        r3 = r3[r5];	 Catch:{ NumberFormatException -> 0x010e }
        r2.<init>(r3, r4);	 Catch:{ NumberFormatException -> 0x010e }
        r1.add(r2);	 Catch:{ NumberFormatException -> 0x010e }
    L_0x0099:
        r2 = com.whatsapp.App.p;
        r2 = r2.getResources();
        r2 = r2.getConfiguration();
        r2 = r2.locale;
        if (r2 == 0) goto L_0x00b9;
    L_0x00a7:
        r3 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x0110 }
        r4 = z;	 Catch:{ NumberFormatException -> 0x0110 }
        r5 = 14;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0110 }
        r2 = r2.getLanguage();	 Catch:{ NumberFormatException -> 0x0110 }
        r3.<init>(r4, r2);	 Catch:{ NumberFormatException -> 0x0110 }
        r1.add(r3);	 Catch:{ NumberFormatException -> 0x0110 }
    L_0x00b9:
        r2 = new org.apache.http.params.BasicHttpParams;
        r2.<init>();
        r3 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r2, r3);
        r3 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        org.apache.http.params.HttpConnectionParams.setSoTimeout(r2, r3);
        r3 = com.whatsapp.ak9.a();
        org.apache.http.params.HttpProtocolParams.setUserAgent(r2, r3);
        r3 = new org.apache.http.impl.client.DefaultHttpClient;
        r3.<init>(r2);
        r2 = new org.apache.http.client.methods.HttpGet;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = com.whatsapp.ce.q;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 19;
        r5 = r5[r6];
        r1 = org.apache.http.client.utils.URLEncodedUtils.format(r1, r5);
        r1 = r4.append(r1);
        r1 = r1.toString();
        r2.<init>(r1);
        r1 = r3.execute(r2);
        if (r1 != 0) goto L_0x0112;
    L_0x00fc:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x0108 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x0108 }
        r2 = 13;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0108 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x0108 }
        throw r0;	 Catch:{ NumberFormatException -> 0x0108 }
    L_0x0108:
        r0 = move-exception;
        throw r0;
    L_0x010a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x010c }
    L_0x010c:
        r0 = move-exception;
        throw r0;
    L_0x010e:
        r0 = move-exception;
        throw r0;
    L_0x0110:
        r0 = move-exception;
        throw r0;
    L_0x0112:
        r2 = r1.getStatusLine();
        r2 = r2.getStatusCode();
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r2 != r3) goto L_0x016a;
    L_0x011e:
        r1 = r1.getEntity();
        r1 = org.apache.http.util.EntityUtils.toString(r1);
        r2 = new org.json.JSONObject;
        r2.<init>(r1);
        r1 = z;
        r3 = 20;
        r1 = r1[r3];
        r1 = r2.getString(r1);
        r3 = z;	 Catch:{ NumberFormatException -> 0x016b }
        r4 = 17;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x016b }
        r3 = r3.equals(r1);	 Catch:{ NumberFormatException -> 0x016b }
        if (r3 == 0) goto L_0x0148;
    L_0x0141:
        r3 = 1;
        r0.a = r3;	 Catch:{ NumberFormatException -> 0x016d }
        r3 = com.whatsapp.App.az;	 Catch:{ NumberFormatException -> 0x016d }
        if (r3 == 0) goto L_0x016a;
    L_0x0148:
        r3 = z;	 Catch:{ NumberFormatException -> 0x016f }
        r4 = 12;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x016f }
        r1 = r3.equals(r1);	 Catch:{ NumberFormatException -> 0x016f }
        if (r1 == 0) goto L_0x016a;
    L_0x0154:
        r0.b(r2);	 Catch:{ NumberFormatException -> 0x0171 }
        r1 = l;	 Catch:{ NumberFormatException -> 0x0171 }
        r1.add(r0);	 Catch:{ NumberFormatException -> 0x0171 }
        r1 = l;	 Catch:{ NumberFormatException -> 0x0171 }
        r1 = r1.size();	 Catch:{ NumberFormatException -> 0x0171 }
        if (r1 <= r10) goto L_0x016a;
    L_0x0164:
        r1 = l;	 Catch:{ NumberFormatException -> 0x0171 }
        r2 = 0;
        r1.remove(r2);	 Catch:{ NumberFormatException -> 0x0171 }
    L_0x016a:
        return r0;
    L_0x016b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x016d }
    L_0x016d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x016f }
    L_0x016f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0171 }
    L_0x0171:
        r0 = move-exception;
        throw r0;
    L_0x0173:
        r5 = r14;
        goto L_0x000b;
    L_0x0176:
        r4 = r13;
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.atb.b(android.location.Location, int, java.lang.String, java.lang.String):com.whatsapp.atb");
    }

    public atb(int i, Location location, int i2, String str, String str2) {
        this.d = "";
        this.e = "";
        this.j = i;
        this.m = location;
        this.f = i2;
        if (str != null) {
            this.d = str;
        }
        if (str2 != null) {
            try {
                this.e = str2;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
    }
}
