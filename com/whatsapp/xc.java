package com.whatsapp;

import com.whatsapp.accountsync.PerformSyncManager;
import com.whatsapp.contact.i;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class xc extends Thread {
    private static final String[] z;
    final ok a;
    private final m8 b;

    static {
        String[] strArr = new String[3];
        String str = "@\u0006\u007fVA@\u001dNOAM\bvGR\f\nyGCH6pLD|\buF\u007f@\u0006\u007fVA@\u001dNVHQ\fpF\u000fP\u0010\u007fA\u007fB\u0005cGAG\u0010NGNG\fu";
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
                        i3 = 35;
                        break;
                    case ay.f /*1*/:
                        i3 = 105;
                        break;
                    case ay.n /*2*/:
                        i3 = 17;
                        break;
                    case ay.p /*3*/:
                        i3 = 34;
                        break;
                    default:
                        i3 = 32;
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
                    str = "@\u0006\u007fVA@\u001dNOAM\bvGR\f\nyGCH6pLD|\buF\u007f@\u0006\u007fVA@\u001dNVHQ\fpF\u000fP\u0010\u007fA\u007fB\u0005cGAG\u0010NGNG\fu";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "@\u0006\u007fVA@\u001dNOAM\bvGR\f\nyGCH6pLD|\buF\u007f@\u0006\u007fVA@\u001dNVHQ\fpF\u000fP\u0010\u007fA\u007fB\u0005cGAG\u0010NGNG\fu";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        try {
            i.a(this.b);
            Collection arrayList = new ArrayList();
            try {
                arrayList.add(this.b);
                if (!(this.b.e == null || ok.a(this.a).c(this.b.e))) {
                    ok.a(this.a).c(arrayList);
                }
                if (this.b.q) {
                    PerformSyncManager.a(App.p, this.b);
                    App.aH.sendEmptyMessage(1);
                    Conversation.i(this.b.e);
                }
                try {
                    if (!i.b()) {
                        Log.w(z[2]);
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            } catch (Exception e22) {
                throw e22;
            }
        } catch (Exception e222) {
            throw e222;
        } catch (Throwable e3) {
            try {
                Log.c(e3);
                if (!i.b()) {
                    Log.w(z[0]);
                }
            } catch (Throwable th) {
                try {
                    if (!i.b()) {
                        Log.w(z[1]);
                    }
                } catch (Exception e2222) {
                    throw e2222;
                }
            }
        }
    }

    public xc(ok okVar, m8 m8Var) {
        this.a = okVar;
        this.b = m8Var;
        setPriority(1);
    }
}
