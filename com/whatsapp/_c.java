package com.whatsapp;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Parcelable;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class _c implements OnPreferenceClickListener {
    private static final String[] z;
    final SettingsChat a;

    static {
        String[] strArr = new String[12];
        String str = "\n1L";
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
                        i3 = 42;
                        break;
                    case ay.f /*1*/:
                        i3 = 77;
                        break;
                    case ay.n /*2*/:
                        i3 = 108;
                        break;
                    case ay.p /*3*/:
                        i3 = 10;
                        break;
                    default:
                        i3 = 88;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "I\"\u0001$/B,\u0018y9Z=Bc6^(\u0002~vK.\u0018c7Dc>O\u000bo\u00193]\u0019f\u0001<K\bo\u001f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "I\"\u0003f1X$\u001f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "E?\u0005o6^,\u0018c7D";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "I\"\u0001$/B,\u0018y9Z=Bc6^(\u0002~vK.\u0018c7Dc(O\u001ek\u0018 ^\u0007}\f F\bk\u001d)X";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "I\"\u0001$/B,\u0018y9Z=Bc6^(\u0002~vK.\u0018c7Dc?O\fu\u001a-F\u0014z\f<O\n";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "K#\bx7C)Bc6^(\u0002~vO5\u0018x9\u0004\u0004\"C\fc\f U\u0011d\u0019)D\fy";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "K#\bx7C)Bc6^(\u0002~vK.\u0018c7Dc+O\fu\u000e#D\fo\u00038";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "I\"\u0001$0^.Bk4H8\u0001";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    str = "E?\u0005o6^,\u0018c7D";
                    obj = 9;
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    strArr2 = strArr3;
                    str = "C \rm=\u0005g";
                    obj = 10;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "m,\u0000f=X4";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    _c(SettingsChat settingsChat) {
        this.a = settingsChat;
    }

    public boolean onPreferenceClick(Preference preference) {
        int i = App.az;
        Intent intent = new Intent(z[8], null);
        intent.setType(z[11]);
        List queryIntentActivities = this.a.getPackageManager().queryIntentActivities(intent, 0);
        int size = queryIntentActivities.size();
        int i2 = 0;
        while (i2 < size) {
            ActivityInfo activityInfo = ((ResolveInfo) queryIntentActivities.get(i2)).activityInfo;
            Log.i(activityInfo.applicationInfo.packageName + z[0] + activityInfo.name);
            if ((activityInfo.name.contains(z[3]) && activityInfo.name.contains(z[1])) || activityInfo.name.contains(z[9])) {
                intent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
                intent.putExtra(z[10], this.a.getResources().getConfiguration().orientation);
                if (i == 0) {
                    break;
                }
            }
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        new Intent(z[6], null).putExtra(z[4], this.a.getResources().getConfiguration().orientation);
        Intent intent2 = new Intent(z[5], null);
        Parcelable[] parcelableArr = new Parcelable[]{intent, createChooser, intent2};
        Intent createChooser = Intent.createChooser(new Intent(z[2], null), this.a.getString(R.string.pick_wallpaper_title));
        createChooser.putExtra(z[7], parcelableArr);
        this.a.startActivityForResult(createChooser, 17);
        return true;
    }
}
