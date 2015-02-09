package com.whatsapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.Preference.OnPreferenceChangeListener;
import com.actionbarsherlock.R;
import com.whatsapp.preference.WaPrivacyPreference;
import com.whatsapp.util.Log;
import java.util.HashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class SettingsPrivacy extends DialogToastPreferenceActivity {
    private static Handler i;
    private static HashMap j;
    private static SettingsPrivacy k;
    private static Runnable l;
    private static final String[] z;
    private OnPreferenceChangeListener h;

    static void a(SettingsPrivacy settingsPrivacy) {
        settingsPrivacy.e();
    }

    private void e() {
        boolean z;
        int i;
        boolean z2 = true;
        SharedPreferences sharedPreferences = getSharedPreferences(z[27], 0);
        String[] stringArray = getResources().getStringArray(R.array.privacy_levels);
        WaPrivacyPreference waPrivacyPreference = (WaPrivacyPreference) findPreference(z[24]);
        uy uyVar = (uy) j.get(z[25]);
        if (uyVar == null) {
            z = true;
        } else {
            z = false;
        }
        waPrivacyPreference.setEnabled(z);
        if (uyVar != null) {
            z = true;
        } else {
            z = false;
        }
        waPrivacyPreference.a(z);
        if (uyVar == null) {
            i = sharedPreferences.getInt(z[28], 0);
        } else {
            i = a(uyVar.b);
        }
        i = Math.max(0, i);
        waPrivacyPreference.setValueIndex(i);
        waPrivacyPreference.setSummary(stringArray[i]);
        waPrivacyPreference = (WaPrivacyPreference) findPreference(z[32]);
        uyVar = (uy) j.get(z[29]);
        if (uyVar == null) {
            z = true;
        } else {
            z = false;
        }
        waPrivacyPreference.setEnabled(z);
        if (uyVar != null) {
            z = true;
        } else {
            z = false;
        }
        waPrivacyPreference.a(z);
        if (uyVar == null) {
            i = sharedPreferences.getInt(z[30], 0);
        } else {
            i = a(uyVar.b);
        }
        i = Math.max(0, i);
        waPrivacyPreference.setValueIndex(i);
        waPrivacyPreference.setSummary(stringArray[i]);
        waPrivacyPreference = (WaPrivacyPreference) findPreference(z[31]);
        uyVar = (uy) j.get(z[26]);
        if (uyVar == null) {
            z = true;
        } else {
            z = false;
        }
        waPrivacyPreference.setEnabled(z);
        if (uyVar == null) {
            z2 = false;
        }
        waPrivacyPreference.a(z2);
        if (uyVar == null) {
            i = sharedPreferences.getInt(z[33], 0);
        } else {
            i = a(uyVar.b);
        }
        i = Math.max(0, i);
        waPrivacyPreference.setValueIndex(i);
        waPrivacyPreference.setSummary(stringArray[i]);
    }

    static SettingsPrivacy a() {
        return k;
    }

    static Runnable b() {
        return l;
    }

    static {
        String[] strArr = new String[34];
        String str = "LjJZ\u0007_a|\\\u0014S~J@\u0003chKC\u0012S";
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
                        i3 = 60;
                        break;
                    case ay.f /*1*/:
                        i3 = 24;
                        break;
                    case ay.n /*2*/:
                        i3 = 35;
                        break;
                    case ay.p /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = 102;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "O}WX\u000fR\u007fP\\\u0014UnBO\u001f\u0013{QI\u0007H}";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "LjJZ\u0007_a|@\u0007Ol|_\u0003Yv";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "^tLO\rctJ_\u0012";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "LjJZ\u0007_a|_\u0012]lV_";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "RwMI";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "_wMX\u0007_lP";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "]tO";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "]tO";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "^tLO\rctJ_\u0012";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "LjJZ\u0007_a|@\u0007Ol|_\u0003Yv";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "LjLJ\u000fP}";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "LjJZ\u0007_a|\\\u0014S~J@\u0003chKC\u0012S";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "OlBX\u0013O";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "LjJZ\u0007_a|_\u0012]lV_";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "O}WX\u000fR\u007fP\\\u0014UnBO\u001f\u0013jFO\u0003UnFHF";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "_wN\u0002\u0011TyW_\u0007Lh|\\\u0014Y~F^\u0003R{F_";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "LjJZ\u0007_a|@\u0007Ol|_\u0003Yv";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "PyPX";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "RwMI";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "]tO";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "_wMX\u0007_lP";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "O}WX\u000fR\u007fP\\\u0014UnBO\u001f\u0013|F_\u0012NwZ";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    str = "LjJZ\u0007_a|@\u0007Ol|_\u0003Yv";
                    obj = 23;
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    strArr2 = strArr3;
                    str = "PyPX";
                    obj = 24;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "OlBX\u0013O";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "_wN\u0002\u0011TyW_\u0007Lh|\\\u0014Y~F^\u0003R{F_";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "LjJZ\u0007_a|@\u0007Ol|_\u0003Yv";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "LjLJ\u000fP}";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "LjJZ\u0007_a|\\\u0014S~J@\u0003chKC\u0012S";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "LjJZ\u0007_a|_\u0012]lV_";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "LjJZ\u0007_a|\\\u0014S~J@\u0003chKC\u0012S";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "LjJZ\u0007_a|_\u0012]lV_";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    z = strArr3;
                    j = new HashMap();
                    i = new Handler();
                    l = new sk();
                default:
                    strArr2[i] = str;
                    str = "N}BH9N}@I\u000fLlPs\u0003RyA@\u0003X";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static HashMap c() {
        return j;
    }

    public void onDestroy() {
        Log.i(z[23]);
        super.onDestroy();
        k = null;
    }

    public SettingsPrivacy() {
        this.h = new ya(this);
    }

    private static int a(String str) {
        if (z[21].equals(str)) {
            return 0;
        }
        if (z[22].equals(str)) {
            return 1;
        }
        return z[20].equals(str) ? 2 : -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onResume() {
        /*
        r6_this = this;
        r5 = 2131624853; // 0x7f0e0395 float:1.8876897E38 double:1.0531626097E-314;
        r4 = 1;
        r3 = 0;
        super.onResume();
        r0 = z;
        r1 = 10;
        r0 = r0[r1];
        r1 = r6.findPreference(r0);
        r0 = com.whatsapp.App.at;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x002a;
    L_0x001a:
        r2 = new java.lang.Object[r4];
        r0 = java.lang.Integer.valueOf(r0);
        r2[r3] = r0;
        r0 = r6.getString(r5, r2);
        r2 = com.whatsapp.App.az;
        if (r2 == 0) goto L_0x0039;
    L_0x002a:
        r0 = new java.lang.Object[r4];
        r2 = 2131624854; // 0x7f0e0396 float:1.88769E38 double:1.05316261E-314;
        r2 = r6.getString(r2);
        r0[r3] = r2;
        r0 = r6.getString(r5, r0);
    L_0x0039:
        r1.setTitle(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsPrivacy.onResume():void");
    }

    protected static String a(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                return z[8];
            case ay.f /*1*/:
                return z[7];
            case ay.n /*2*/:
                return z[6];
            default:
                return z[9];
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.util.Hashtable r12) {
        /*
        r5 = 1;
        r3 = 0;
        r6 = com.whatsapp.App.az;
        r0 = com.whatsapp.App.p;
        r1 = z;
        r2 = 17;
        r1 = r1[r2];
        r7 = r0.getSharedPreferences(r1, r3);
        r8 = r7.edit();
        r9 = r12.keys();
        r2 = r3;
    L_0x0019:
        r0 = r9.hasMoreElements();
        if (r0 == 0) goto L_0x00e9;
    L_0x001f:
        r0 = r9.nextElement();
        r0 = (java.lang.String) r0;
        r1 = r12.get(r0);
        r1 = (java.lang.String) r1;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r10 = z;
        r11 = 16;
        r10 = r10[r11];
        r4 = r4.append(r10);
        r4 = r4.append(r0);
        r10 = ":";
        r4 = r4.append(r10);
        r4 = r4.append(r1);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r10 = a(r1);
        if (r10 >= 0) goto L_0x00e6;
    L_0x0055:
        if (r6 == 0) goto L_0x00e4;
    L_0x0057:
        r4 = r5;
    L_0x0058:
        r2 = j;
        r2 = r2.get(r0);
        r2 = (com.whatsapp.uy) r2;
        if (r2 == 0) goto L_0x006a;
    L_0x0062:
        r2 = r2.b;
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x00c3;
    L_0x006a:
        r1 = j;
        r1.remove(r0);
        r1 = z;
        r2 = 19;
        r1 = r1[r2];
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0097;
    L_0x007b:
        r1 = z;
        r2 = 18;
        r1 = r1[r2];
        r1 = r7.getInt(r1, r3);
        r2 = z;
        r11 = 11;
        r2 = r2[r11];
        r8.putInt(r2, r10);
        if (r1 == r10) goto L_0x0095;
    L_0x0090:
        r1 = com.whatsapp.App.aT;
        r1.a();
    L_0x0095:
        if (r6 == 0) goto L_0x00c3;
    L_0x0097:
        r1 = z;
        r2 = 12;
        r1 = r1[r2];
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00ae;
    L_0x00a3:
        r1 = z;
        r2 = 13;
        r1 = r1[r2];
        r8.putInt(r1, r10);
        if (r6 == 0) goto L_0x00c3;
    L_0x00ae:
        r1 = z;
        r2 = 14;
        r1 = r1[r2];
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00c3;
    L_0x00ba:
        r0 = z;
        r1 = 15;
        r0 = r0[r1];
        r8.putInt(r0, r10);
    L_0x00c3:
        r0 = r4;
    L_0x00c4:
        if (r6 == 0) goto L_0x00e1;
    L_0x00c6:
        r8.commit();
        if (r0 == 0) goto L_0x00d7;
    L_0x00cb:
        r0 = com.whatsapp.App.p;
        r0 = r0.getApplicationContext();
        r1 = 2131624325; // 0x7f0e0185 float:1.8875827E38 double:1.053162349E-314;
        com.whatsapp.App.b(r0, r1, r5);
    L_0x00d7:
        r0 = k;
        if (r0 == 0) goto L_0x00e0;
    L_0x00db:
        r0 = k;
        r0.e();
    L_0x00e0:
        return;
    L_0x00e1:
        r2 = r0;
        goto L_0x0019;
    L_0x00e4:
        r0 = r5;
        goto L_0x00c4;
    L_0x00e6:
        r4 = r2;
        goto L_0x0058;
    L_0x00e9:
        r0 = r2;
        goto L_0x00c6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsPrivacy.a(java.util.Hashtable):void");
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i(z[2]);
        k = this;
        addPreferencesFromResource(R.xml.preferences_privacy);
        ((WaPrivacyPreference) findPreference(z[3])).setOnPreferenceChangeListener(this.h);
        ((WaPrivacyPreference) findPreference(z[0])).setOnPreferenceChangeListener(this.h);
        ((WaPrivacyPreference) findPreference(z[5])).setOnPreferenceChangeListener(this.h);
        findPreference(z[1]).setOnPreferenceChangeListener(new amx(this));
        findPreference(z[4]).setOnPreferenceClickListener(new ow(this));
        e();
        App.aw();
    }

    static Handler d() {
        return i;
    }
}
