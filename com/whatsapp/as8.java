package com.whatsapp;

import android.app.PendingIntent;
import android.text.TextUtils;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class as8 implements xg {
    private static final String[] z;
    final AccountInfoActivity a;

    static {
        String[] strArr = new String[5];
        String str = "\u0007WF\"2&P\u001b4*7\n\u00060.";
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
                        i3 = 71;
                        break;
                    case ay.f /*1*/:
                        i3 = 36;
                        break;
                    case ay.n /*2*/:
                        i3 = 104;
                        break;
                    case ay.p /*3*/:
                        i3 = 85;
                        break;
                    default:
                        i3 = 90;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "&G\u000b:/)PE<4!KG%;>I\r;.jK\n&?5R\r'u\"H\u000123%M\u0004<.>\u000b\r'((VH";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "&G\u000b:/)PE<4!KG%;>I\r;.jK\n&?5R\r'u\"H\u000123%M\u0004<.>\u000b\u0001;?+M\u000f<8+AH";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "+M\u001b!go\u007fXxckyC|";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0007WF\"2&P\u001b4*7\n\u00060.";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(int i) {
        AccountInfoActivity.h(this.a).sendMessage(AccountInfoActivity.h(this.a).obtainMessage(7, i, 0));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.hs r8) {
        /*
        r7_this = this;
        r6 = 4;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.App.az;
        r4 = r8.b();
        r0 = "1";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x006f;
    L_0x0011:
        if (r3 == 0) goto L_0x006d;
    L_0x0013:
        r0 = r1;
    L_0x0014:
        r5 = "3";
        r5 = r5.equals(r4);
        if (r5 == 0) goto L_0x001f;
    L_0x001c:
        r0 = 3;
        if (r3 == 0) goto L_0x0028;
    L_0x001f:
        r3 = "5";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0028;
    L_0x0027:
        r0 = 5;
    L_0x0028:
        r3 = r8.e();
        r4 = 0;
        if (r3 == 0) goto L_0x006b;
    L_0x002f:
        r4 = z;
        r4 = r4[r6];
        r4 = java.util.regex.Pattern.compile(r4);
        r4 = r4.matcher(r3);
        r5 = r4.find();
        if (r5 == 0) goto L_0x0069;
    L_0x0041:
        r3 = r4.group(r1);
        r4 = ",";
        r3 = r3.split(r4);
        r4 = r3.length;
        if (r4 != r1) goto L_0x0067;
    L_0x004e:
        com.whatsapp.util.Log.b(r1);
        r1 = r3[r2];
    L_0x0053:
        r3 = r7.a;
        r3 = com.whatsapp.AccountInfoActivity.h(r3);
        r0 = r3.obtainMessage(r6, r0, r2, r1);
        r1 = r7.a;
        r1 = com.whatsapp.AccountInfoActivity.h(r1);
        r1.sendMessage(r0);
        return;
    L_0x0067:
        r1 = r2;
        goto L_0x004e;
    L_0x0069:
        r1 = r3;
        goto L_0x0053;
    L_0x006b:
        r1 = r4;
        goto L_0x0053;
    L_0x006d:
        r0 = r1;
        goto L_0x0028;
    L_0x006f:
        r0 = r2;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.as8.a(com.whatsapp.hs):void");
    }

    public void a(Integer num, String[] strArr) {
        String a;
        int i = App.az;
        AccountInfoActivity.h(this.a).removeMessages(10);
        this.a.c();
        if (num != null) {
            Log.e(z[2] + num);
            this.a.a(R.string.eligibility_check_error);
            AccountInfoActivity.a(this.a, null);
            if (i == 0) {
                return;
            }
        }
        if (strArr.length > 0 && !TextUtils.isEmpty(strArr[0])) {
            String str = strArr[0];
            AccountInfoActivity.a(this.a, str.substring(0, str.length() - z[0].length()));
            AccountInfoActivity.b(this.a, AccountInfoActivity.l(this.a));
            if (AccountInfoActivity.e(this.a) != null) {
                AccountInfoActivity.e(this.a).run();
            }
            if (i == 0) {
                return;
            }
        }
        Log.i(z[3] + AccountInfoActivity.l(this.a));
        m8 a2 = App.P.a(AccountInfoActivity.l(this.a) + z[1]);
        if (a2 == null) {
            a = m3.a(AccountInfoActivity.l(this.a));
        } else {
            a = a2.a(this.a);
        }
        this.a.a(this.a.getString(R.string.eligibility_check_ineligible, new Object[]{a}), new pm(this));
        AccountInfoActivity.a(this.a, null);
    }

    public void a(PendingIntent pendingIntent) {
        AccountInfoActivity.h(this.a).sendMessage(AccountInfoActivity.h(this.a).obtainMessage(6, 0, 0, pendingIntent));
    }

    public void a() {
        AccountInfoActivity.h(this.a).sendEmptyMessage(3);
    }

    as8(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }
}
