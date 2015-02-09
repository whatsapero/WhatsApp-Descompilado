package com.whatsapp;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import com.actionbarsherlock.R;
import com.whatsapp.preference.WaDialogPreference;
import java.text.SimpleDateFormat;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class SettingsNetworkUsage extends DialogToastPreferenceActivity {
    private static final SimpleDateFormat h;
    private static final String[] z;

    static {
        String[] strArr = new String[20];
        String str = "c=Ogk\u007f3dewl?^Orb1KOgl4WOft,^c[~=Ud";
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
                        i3 = 13;
                        break;
                    case ay.f /*1*/:
                        i3 = 88;
                        break;
                    case ay.n /*2*/:
                        i3 = 59;
                        break;
                    case ay.p /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 4;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "c=Ogk\u007f3dewl?^Ovh+^d";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "c=Ogk\u007f3dewl?^Oih+Hqch\u0007Yiph+dcac,";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "c=Ogk\u007f3dewl?^Oih+Hqch+dcac,";
                    obj = 3;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "c=Ogk\u007f3dewl?^Opb,Z|[o!OuwR*^sad.^t";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "c=Ogk\u007f3dewl?^Orb1KOgl4Wc[\u007f=Xum{=_";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "c=Ogk\u007f3dewl?^Oih+Hqch\u0007Yiph+dban=Rfai";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "c=Ogk\u007f3dewl?^Orb1KOgl4WOft,^c[\u007f=Xum{=_";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "c=Ogk\u007f3dewl?^Orb1KOgl4Wc[~=Ud";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "c=Ogk\u007f3dewl?^Orb1KOgl4Wc[\u007f=Xum{=_";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "c=Ogk\u007f3dewl?^Opb,Z|[o!OuwR+^~p";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "c=Ogk\u007f3dewl?^Ovh+^d";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    str = "c=Ogk\u007f3dewl?^Orb1KOgl4WOft,^c[~=Ud";
                    obj = 12;
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    strArr2 = strArr3;
                    str = "c=Ogk\u007f3dewl?^Orb1KOgl4WOft,^c[\u007f=Xum{=_";
                    obj = 13;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "c=Ogk\u007f3dewl?^Oih<Rq[o!OuwR+^~p";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    str = "c=Ogk\u007f3dewl?^Oih+Hqch+dban=Rfai";
                    obj = 15;
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    strArr2 = strArr3;
                    str = "c=Ogk\u007f3dewl?^Oih<Rq[o!OuwR*^sad.^t";
                    obj = 16;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "c=Ogk\u007f3dewl?^Ovh+^d";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "t!Bi)@\u0015v=`ixsX>`5\u0001cw";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    z = strArr3;
                    h = new SimpleDateFormat(z[19]);
                default:
                    strArr2[i] = str;
                    str = "c=Ogk\u007f3dewl?^Orb1KOgl4Wc[~=Ud";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onResume() {
        super.onResume();
        a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r11_this = this;
        r10 = 2131624589; // 0x7f0e028d float:1.8876362E38 double:1.0531624793E-314;
        r9 = 2131558434; // 0x7f0d0022 float:1.8742184E38 double:1.0531297943E-314;
        r6 = 2131558433; // 0x7f0d0021 float:1.8742182E38 double:1.053129794E-314;
        r8 = 1;
        r7 = 0;
        r0 = com.whatsapp.App.az;
        r1 = com.whatsapp.d7.b;
        if (r1 == 0) goto L_0x010b;
    L_0x0011:
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r4 = r1.getTotalMessagesSent();
        r11.a(r2, r6, r4);
        r2 = z;
        r3 = 16;
        r2 = r2[r3];
        r4 = r1.getTotalMessagesReceived();
        r11.a(r2, r6, r4);
        r2 = z;
        r3 = 15;
        r2 = r2[r3];
        r4 = r1.getMediaBytesSent();
        r11.a(r2, r4);
        r2 = z;
        r3 = 17;
        r2 = r2[r3];
        r4 = r1.getMediaBytesReceived();
        r11.a(r2, r4);
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r4 = r1.getMessageBytesSent();
        r11.a(r2, r4);
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r4 = r1.getMessageBytesReceived();
        r11.a(r2, r4);
        r2 = com.whatsapp.App.aR();
        if (r2 == 0) goto L_0x0095;
    L_0x0062:
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r4 = r1.getOutgoingVoipCalls();
        r11.a(r2, r9, r4);
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r4 = r1.getIncomingVoipCalls();
        r11.a(r2, r9, r4);
        r2 = z;
        r2 = r2[r7];
        r4 = r1.getVoipBytesSent();
        r11.a(r2, r4);
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r4 = r1.getVoipBytesReceived();
        r11.a(r2, r4);
        if (r0 == 0) goto L_0x00bb;
    L_0x0095:
        r2 = r11.getPreferenceScreen();
        r3 = z;
        r3 = r3[r8];
        r11.a(r2, r3);
        r3 = z;
        r4 = 10;
        r3 = r3[r4];
        r11.a(r2, r3);
        r3 = z;
        r4 = 13;
        r3 = r3[r4];
        r11.a(r2, r3);
        r3 = z;
        r4 = 14;
        r3 = r3[r4];
        r11.a(r2, r3);
    L_0x00bb:
        r2 = z;
        r3 = 11;
        r2 = r2[r3];
        r4 = r1.getTotalBytesSent();
        r11.a(r2, r4);
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r4 = r1.getTotalBytesReceived();
        r11.a(r2, r4);
        r2 = r1.getLastReset();
        r4 = -9223372036854775808;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 == 0) goto L_0x00f8;
    L_0x00de:
        r1 = z;
        r4 = 12;
        r1 = r1[r4];
        r4 = new java.lang.Object[r8];
        r5 = h;
        r6 = new java.util.Date;
        r6.<init>(r2);
        r2 = r5.format(r6);
        r4[r7] = r2;
        r11.a(r1, r10, r4);
        if (r0 == 0) goto L_0x010b;
    L_0x00f8:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        r1 = new java.lang.Object[r8];
        r2 = 2131624603; // 0x7f0e029b float:1.887639E38 double:1.053162486E-314;
        r2 = r11.getString(r2);
        r1[r7] = r2;
        r11.a(r0, r10, r1);
    L_0x010b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsNetworkUsage.a():void");
    }

    private void a(String str, int i, Object[] objArr) {
        Preference findPreference = findPreference(str);
        if (findPreference != null) {
            findPreference.setSummary(String.format(getString(i), objArr));
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences_network_usage);
        ((WaDialogPreference) findPreference(z[18])).a(new hv(this));
    }

    private void a(String str, int i, long j) {
        Preference findPreference = findPreference(str);
        if (findPreference != null) {
            findPreference.setSummary(String.format(App.aX.a(i, (int) j), new Object[]{Long.valueOf(j)}));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r9, long r10) {
        /*
        r8_this = this;
        r6 = 4652218415073722368; // 0x4090000000000000 float:0.0 double:1024.0;
        r1 = 0;
        r4 = com.whatsapp.App.az;
        r2 = (double) r10;
        r0 = r1;
    L_0x0007:
        r5 = 3;
        if (r0 >= r5) goto L_0x0013;
    L_0x000a:
        r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x0013;
    L_0x000e:
        r2 = r2 / r6;
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x0007;
    L_0x0013:
        switch(r0) {
            case 0: goto L_0x0024;
            case 1: goto L_0x002b;
            case 2: goto L_0x0030;
            case 3: goto L_0x0035;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r1;
    L_0x0017:
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r2 = java.lang.Double.valueOf(r2);
        r4[r1] = r2;
        r8.a(r9, r0, r4);
    L_0x0023:
        return;
    L_0x0024:
        r0 = 2131558432; // 0x7f0d0020 float:1.874218E38 double:1.0531297934E-314;
        r8.a(r9, r0, r10);
        goto L_0x0023;
    L_0x002b:
        r0 = 2131624587; // 0x7f0e028b float:1.8876358E38 double:1.0531624783E-314;
        if (r4 == 0) goto L_0x0017;
    L_0x0030:
        r0 = 2131624588; // 0x7f0e028c float:1.887636E38 double:1.053162479E-314;
        if (r4 == 0) goto L_0x0017;
    L_0x0035:
        r0 = 2131624586; // 0x7f0e028a float:1.8876356E38 double:1.053162478E-314;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsNetworkUsage.a(java.lang.String, long):void");
    }

    static void a(SettingsNetworkUsage settingsNetworkUsage) {
        settingsNetworkUsage.a();
    }

    private void a(PreferenceScreen preferenceScreen, String str) {
        if (preferenceScreen != null && str != null) {
            Preference findPreference = findPreference(str);
            if (findPreference != null) {
                preferenceScreen.removePreference(findPreference);
            }
        }
    }
}
