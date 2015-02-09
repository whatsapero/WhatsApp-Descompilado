package com.whatsapp.accountsync;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class c extends AbstractAccountAuthenticator {
    private static final String[] z;
    private final Context a;

    static {
        String[] strArr = new String[9];
        String str = "bgx>rmp4\"~mg4$wgeo4Dqa\u007f4iwmz=t";
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
                        i3 = 3;
                        break;
                    case ay.f /*1*/:
                        i3 = 4;
                        break;
                    case ay.n /*2*/:
                        i3 = 27;
                        break;
                    case ay.p /*3*/:
                        i3 = 81;
                        break;
                    default:
                        i3 = 7;
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
                    str = "bgx>rmp4\"~mg42hmbr#j@v~5bmpr0kp";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "bgx>rmp4\"~mg46bwEn%oWkp4i";
                    obj = 2;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "bgx>rmp4\"~mg40cgEx2hvjo";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "bgx>rmpZ$skau%n`eo>uQah!hmw~";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "jjo4iw";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    str = "bgx>rmp4\"~mg46bwEn%oWkp4iOey4k";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = "bgx>rmp4\"~mg49fpB~0svv~\"=#";
                    obj = 7;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "bgx>rmp4\"~mg44cjpK#hsai%nfw";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Log.i(z[4]);
        Bundle bundle2 = new Bundle();
        Parcelable intent = new Intent(this.a, LoginActivity.class);
        intent.putExtra(z[5], accountAuthenticatorResponse);
        bundle2.putParcelable(z[6], intent);
        return bundle2;
    }

    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Log.i(z[3]);
        return null;
    }

    public c(Context context) {
        super(context);
        this.a = context;
    }

    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        Log.i(z[1]);
        return null;
    }

    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        Log.i(z[8] + Arrays.toString(strArr));
        return null;
    }

    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Log.i(z[0]);
        return null;
    }

    public String getAuthTokenLabel(String str) {
        Log.i(z[7]);
        return null;
    }

    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        Log.i(z[2]);
        return null;
    }
}
