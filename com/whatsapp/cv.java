package com.whatsapp;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.as;
import com.whatsapp.notification.q;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class cv extends AsyncTask {
    private static final String[] z;
    final DescribeProblemActivity a;

    static {
        String[] strArr = new String[31];
        String str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005X\u0004\u001e\u001buU\u0004\u0004\u0004LBV";
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
                        i3 = 107;
                        break;
                    case ay.f /*1*/:
                        i3 = 112;
                        break;
                    case ay.n /*2*/:
                        i3 = 109;
                        break;
                    case ay.p /*3*/:
                        i3 = 42;
                        break;
                    default:
                        i3 = 59;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u001b\u0002\u0004\\Z\b\t2YO\n\u0004\u0018Y";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005\\\u0019\u001f\u0018Zd\u001b\u001f\u001d_KV";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005X\u0004\u001e\u001buW\u0002\u0017\u0005^\u0006";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005V\u001e\u0004\b\u0017";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\f\u0002\u0002_K4\u001e\u0002^R\r\t2^T\u0005\u0015";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005K\u0019\u0019\u001b\u0005H\u001f\u0011\u0019_HV";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\f\u0002\u0002_K4\u001e\u0002^R\r\t2FR\f\u0018\u0019uX\u0004\u001c\u0002X";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0005\u001f\u0019C]\u0012/\u0001C\\\u0003\u00042IT\u0007\u001f\u001f";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0019\u0015\fNd\u0019\u0015\u000eOR\u001b\u0004\u001eu^\u0005\u0011\u000fF^\u000f";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005K\u0019\u0019\u001b\u0005K\u0002\u0013P";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005X\u0004\u001e\u001buK\u0004\u0000\u0018Z\u0006";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001b\u0002\u0004\\Z\b\t2ZI\u0004\u0016\u0004F^4\u0000\u0005EO\u0004";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0006\u0005\u0019Od\u0002\u001e\u000bE";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005X\u0004\u001e\u001buM\u0002\u0012\u001fKO\u000e/\u0001OU\f\u0004\u0005\u0017";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005\\\u0019\u001f\u0018Zd\u0005\u001f\u0019C]\u0012M";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0005\u001f\u0019C]\u0012/\u0001C\\\u0003\u0004";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005\\\u0019\u001f\u0018Zd\u0007\u0019\nBO4\u0013\u0002FT\u0019M";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0005\u001f\u0019C]\u0012/\u001fCU\f\u0004\u0002D^";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005\\\u0019\u001f\u0018Zd\u001d\u0019\u000fXZ\u001f\u00152F^\u0005\u0017\u0019B\u0006";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\f\u0002\u0002_K4\u001e\u0002^R\r\t2FR\f\u0018\u0019";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005K\u0019\u0019\u001b\u0005W\n\u0003\u0019\u0017";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\b\u001f\u0000\u0004L\u0003\u0011\u0019YZ\u001b\u00002ZI\u000e\u0016\bX^\u0005\u0013\bY";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005\\\u0019\u001f\u0018Zd\u0007\u0019\nBOV";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005X\u0004\u001e\u001buW\u0002\u0017\u0005^d\b\u001f\u0001EIV";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "-6+l}-";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u001b\u0002\u0004\\Z\b\t2FZ\u0018\u00042Y^\u000e\u001e";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "-6+l}-";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0005\u001f\u0019C]\u0012/\u001bCY\u0019\u0011\u0019Od\u0007\u0015\u0003MO\u0003";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u000f\u0015\u001eIK\u0019\u001f\u000f\u0005K\u0019\u0019\u001b\u0005I\u000e\u0011\tX^\b\u0015\u0004ZO\u0018M";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\f\u0002\u0002_K4\u001e\u0002^R\r\t2\\R\t\u0002\f^^4\u001c\bD\\\u001f\u0018";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void a(Void voidR) {
        int i = App.az;
        this.a.removeDialog(1);
        ArrayList arrayList = new ArrayList();
        Uri[] e = DescribeProblemActivity.e(this.a);
        int length = e.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = e[i2];
            if (obj != null) {
                arrayList.add(obj);
            }
            i2++;
            if (i != 0) {
                break;
            }
        }
        DescribeProblemActivity.f(this.a).n = Double.valueOf((double) as.EMAIL_SEND.getCode());
        al.a(this.a, DescribeProblemActivity.f(this.a));
        or.a(this.a, DescribeProblemActivity.a(this.a), DescribeProblemActivity.b(this.a).getText().toString().trim(), arrayList, DescribeProblemActivity.d(this.a));
        DescribeProblemActivity.a(this.a, null);
        this.a.finish();
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected Void a(Void[] voidArr) {
        Log.h();
        Log.g();
        return null;
    }

    protected void onPreExecute() {
        this.a.showDialog(1);
        SharedPreferences sharedPreferences = this.a.getSharedPreferences(z[23], 0);
        Log.i(z[3] + q.c().a(sg.GROUP));
        Log.i(z[12] + q.c().a(sg.INDIVIDUAL));
        Log.i(z[16] + sharedPreferences.getString(z[6], null));
        Log.i(z[0] + sharedPreferences.getString(z[19], null));
        Log.i(z[24] + sharedPreferences.getBoolean(z[21], true));
        Log.i(z[4] + sharedPreferences.getBoolean(z[17], true));
        Log.i(z[18] + sharedPreferences.getString(z[8], z[28]));
        Log.i(z[25] + sharedPreferences.getString(z[9], z[26]));
        Log.i(z[20] + sharedPreferences.getString(z[1], "1"));
        Log.i(z[15] + sharedPreferences.getString(z[29], "1"));
        Log.i(z[22] + SettingsPrivacy.a(sharedPreferences.getInt(z[27], 0)));
        Log.i(z[11] + SettingsPrivacy.a(sharedPreferences.getInt(z[13], 0)));
        Log.i(z[7] + SettingsPrivacy.a(sharedPreferences.getInt(z[2], 0)));
        Log.i(z[30] + sharedPreferences.getBoolean(z[10], true));
        Log.i(z[5] + sharedPreferences.getString(z[14], ""));
    }

    protected cv(DescribeProblemActivity describeProblemActivity) {
        this.a = describeProblemActivity;
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }
}
