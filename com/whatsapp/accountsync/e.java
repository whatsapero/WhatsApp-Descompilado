package com.whatsapp.accountsync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class e extends AbstractThreadedSyncAdapter {
    private static final String z;
    final ContactsSyncAdapterService a;

    static {
        char[] toCharArray = "|\u0005\u000epVw\u000b\u0017-@o\u001aM?B|\u0005\u00160Ul\u0013\r=\u000fv\u0004\u0017;OkD3\u001bsY%1\u0013~L3-\u001d".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 31;
                    break;
                case ay.f /*1*/:
                    i2 = 106;
                    break;
                case ay.n /*2*/:
                    i2 = 99;
                    break;
                case ay.p /*3*/:
                    i2 = 94;
                    break;
                default:
                    i2 = 33;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    e(ContactsSyncAdapterService contactsSyncAdapterService, Context context, boolean z) {
        this.a = contactsSyncAdapterService;
        super(context, z);
    }

    public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        getContext().sendBroadcast(new Intent(z));
    }
}
