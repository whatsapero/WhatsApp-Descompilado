package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class GroupMembersSelector extends MultipleContactsSelector {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "BPl2;HGn%.WQp\"'@Aw(9\nFf4?WMz";
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
                        i3 = 37;
                        break;
                    case ay.f /*1*/:
                        i3 = 34;
                        break;
                    case ay.n /*2*/:
                        i3 = 3;
                        break;
                    case ay.p /*3*/:
                        i3 = 71;
                        break;
                    default:
                        i3 = 75;
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
                    str = "BPl2;HGn%.WQp\"'@Aw(9\nAq\"*QG";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "OKg4";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onDestroy() {
        Log.i(z[0]);
        super.onDestroy();
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[2]);
        super.onCreate(bundle);
    }

    protected int e() {
        return R.string.create;
    }

    protected int f() {
        return ge.e;
    }

    protected int g() {
        return R.string.groupchat_reach_limit;
    }

    protected String a() {
        return getString(R.string.add_group_participants).toUpperCase();
    }

    protected int j() {
        return 1;
    }

    protected void h() {
        Object k = k();
        if (TextUtils.isEmpty(k)) {
            App.a((Context) this, getString(R.string.no_valid_participant), 0);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(z[1], k);
        setResult(-1, intent);
        finish();
    }

    protected String b() {
        return getString(R.string.new_group);
    }
}
