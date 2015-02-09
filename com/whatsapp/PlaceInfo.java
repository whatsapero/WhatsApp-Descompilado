package com.whatsapp;

import android.location.Location;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
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

public class PlaceInfo implements Serializable {
    public static final int SOURCE_FOURSQUARE = 2;
    public static final int SOURCE_GOOGLE = 1;
    private static final long serialVersionUID = 1;
    private static final String[] z;
    public String address;
    public double dist;
    public boolean hasDetails;
    public String icon;
    public double lat;
    private transient Location location;
    public double lon;
    public String name;
    public String phone;
    public String placeId;
    public String rating;
    public int source;
    public transient Object tag;
    public Set types;
    public String url;
    public String vicinity;

    static {
        String[] strArr = new String[36];
        String str = ":<i\to:";
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
                        i3 = 73;
                        break;
                    case SOURCE_GOOGLE /*1*/:
                        i3 = 72;
                        break;
                    case SOURCE_FOURSQUARE /*2*/:
                        i3 = 8;
                        break;
                    case ay.p /*3*/:
                        i3 = 125;
                        break;
                    default:
                        i3 = 26;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0006\u0003";
                    i = SOURCE_FOURSQUARE;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case SOURCE_GOOGLE /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "o$i\u0013}<)o\u0018'";
                    obj = 2;
                    break;
                case SOURCE_FOURSQUARE /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = " +g\u0013";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "*!|\u0004";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ":<i\t\u007f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "9:m\u001bs1";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    str = "eh";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "%'k\u001cn 'f";
                    obj = 8;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "9'{\t{%\u000bg\u0019\u007f";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "%&o";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "eh";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "+/WK.g8f\u001a";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "9:a\u0010{;1";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "%)|";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = " ,";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "*)|\u0018}&:a\u0018i";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "<:d";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "')e\u0018";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "!<|\risg'\u001bu<:{\fo(:mSy&%'\u000b5";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "(,l\u000f\u007f:;";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "9$i\u001e\u007f\u0016!l";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "%&o";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "')e\u0018";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = ".-g\u0010\u007f=:q";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    str = "eh]\u0013s=-l]I=)|\u0018i";
                    obj = 25;
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    strArr2 = strArr3;
                    str = "%)|";
                    obj = 26;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "%'k\u001cn 'f";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "/'z\u0010{=<m\u0019E(,l\u000f\u007f:;";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "=1x\u0018i";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = ";)|\u0014t.";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "?!k\u0014t <q";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "<:d";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "/'z\u0010{=<m\u0019E9 g\u0013\u007f\u0016&}\u0010x,:";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = " +g\u0013";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ";-{\bv=";
                    i = SOURCE_GOOGLE;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void fromJsonGoogle(JSONObject jSONObject, boolean z) {
        int i = App.az;
        this.source = SOURCE_GOOGLE;
        this.name = jSONObject.getString(z[24]);
        this.placeId = jSONObject.optString(z[22]);
        this.vicinity = jSONObject.optString(z[32]);
        this.types = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(z[30]);
        if (optJSONArray != null) {
            int i2 = 0;
            while (i2 < optJSONArray.length()) {
                this.types.add(optJSONArray.getString(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(z[25]);
        if (jSONObject2 != null) {
            jSONObject2 = jSONObject2.getJSONObject(z[28]);
            if (jSONObject2 != null) {
                this.lat = jSONObject2.getDouble(z[27]);
                this.lon = jSONObject2.getDouble(z[23]);
            }
        }
        this.icon = jSONObject.optString(z[35]);
        if (z) {
            this.url = jSONObject.optString(z[33]);
            this.phone = jSONObject.optString(z[34]);
            this.address = jSONObject.optString(z[29]);
            this.rating = jSONObject.optString(z[31]);
            if (this.address != null) {
                this.address = this.address.replace(z[26], "");
            }
            this.hasDetails = true;
        }
    }

    public void fromJsonFoursquare(JSONObject jSONObject, boolean z) {
        int i = 0;
        int i2 = App.az;
        this.source = SOURCE_FOURSQUARE;
        this.name = jSONObject.getString(z[19]);
        this.url = jSONObject.optString(z[18]);
        this.placeId = jSONObject.optString(z[16]);
        if (this.url == null || "".equals(this.url)) {
            this.url = z[20] + this.placeId;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(z[9]);
        if (jSONObject2 != null) {
            this.lat = jSONObject2.optDouble(z[15]);
            this.lon = jSONObject2.optDouble(z[11]);
            this.address = jSONObject2.optString(z[21]);
            this.vicinity = this.address;
            String optString = jSONObject2.optString(z[5]);
            if (!(optString == null || "".equals(optString))) {
                if (!(this.address == null || "".equals(this.address))) {
                    this.address += z[12];
                }
                this.address += optString;
            }
            optString = jSONObject2.optString(z[6]);
            if (!(optString == null || "".equals(optString))) {
                if (!(this.address == null || "".equals(this.address))) {
                    this.address += z[8];
                }
                this.address += optString;
            }
            String optString2 = jSONObject2.optString(z[10]);
            if (!(optString2 == null || "".equals(optString2))) {
                if (!(this.address == null || "".equals(this.address))) {
                    this.address += " ";
                }
                this.address += optString2;
            }
            this.hasDetails = true;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(z[17]);
        if (optJSONArray != null) {
            jSONObject2 = optJSONArray.optJSONObject(0);
            while (i < optJSONArray.length()) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && optJSONObject.optBoolean(z[14])) {
                    if (i2 == 0) {
                        jSONObject2 = optJSONObject;
                        break;
                    }
                    jSONObject2 = optJSONObject;
                }
                i++;
                if (i2 != 0) {
                    break;
                }
            }
            if (jSONObject2 != null) {
                JSONObject optJSONObject2 = jSONObject2.optJSONObject(z[4]);
                if (optJSONObject2 != null) {
                    this.icon = optJSONObject2.optString(z[7]);
                    if (this.icon != null) {
                        this.icon += z[13];
                    }
                }
            }
        }
    }

    public synchronized void downloadDetails() {
        try {
            if (!this.hasDetails) {
                if (this.source == SOURCE_GOOGLE) {
                    HttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
                    HttpProtocolParams.setUserAgent(basicHttpParams, ak9.a());
                    DefaultHttpClient defaultHttpClient = new DefaultHttpClient(basicHttpParams);
                    String str = ce.j + this.placeId;
                    Locale locale = App.p.getResources().getConfiguration().locale;
                    if (locale != null) {
                        str = str + z[3] + locale.getLanguage();
                    }
                    try {
                        HttpResponse execute = defaultHttpClient.execute(new HttpGet(str));
                        if (execute.getStatusLine().getStatusCode() == 200) {
                            JSONObject jSONObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                            if (z[SOURCE_FOURSQUARE].equals(jSONObject.getString(z[0]))) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject(z[SOURCE_GOOGLE]);
                                if (jSONObject2 != null) {
                                    fromJsonGoogle(jSONObject2, true);
                                    this.hasDetails = true;
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw e;
                    } catch (Throwable e2) {
                        Log.c(e2);
                    } catch (Throwable e22) {
                        Log.c(e22);
                    }
                }
            }
        } catch (IOException e3) {
            throw e3;
        } catch (IOException e32) {
            throw e32;
        } catch (Throwable th) {
        }
    }

    public Location getLocation() {
        if (this.location == null) {
            this.location = new Location("");
            this.location.setLatitude(this.lat);
            this.location.setLongitude(this.lon);
        }
        return this.location;
    }
}
