package com.whatsapp;

import android.content.DialogInterface.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class dn implements OnClickListener {
    private static final String[] z;
    final GroupChatRecentLocationsActivity a;

    static {
        String[] strArr = new String[7];
        String str = "Q\u0002c6<Y\b)-=D\ti0}Q\u000fs-<^BN\n\u0000u>S\u001b\u001cb3B\u0000\u001ad";
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
                        i3 = 48;
                        break;
                    case ay.f /*1*/:
                        i3 = 108;
                        break;
                    case ay.n /*2*/:
                        i3 = 7;
                        break;
                    case ay.p /*3*/:
                        i3 = 68;
                        break;
                    default:
                        i3 = 83;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "@\u0004h*6o\u0018~46";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "F\u0002cj2^\bu+:TBd1!C\u0003uj:D\tjk0_\u0002s%0D";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "@\u0004h*6";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "W\u001eh1#S\u0004f0!U\u000fb*'\\\u0003d%'Y\u0003i7|S\u0003i06H\u0018'7*C\u0018b)sS\u0003i02S\u0018'(:C\u0018''<E\u0000cd=_\u0018'\"<E\u0002c";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "@\u0004h*6";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Q\u0002c6<Y\b)-=D\ti0}Q\u000fs-<^BN\n\u0000u>S";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r7, int r8) {
        /*
        r6_this = this;
        r5 = 2;
        r0 = com.whatsapp.App.az;
        switch(r8) {
            case 0: goto L_0x000a;
            case 1: goto L_0x001b;
            case 2: goto L_0x0028;
            case 3: goto L_0x0086;
            default: goto L_0x0006;
        };
    L_0x0006:
        r7.dismiss();
        return;
    L_0x000a:
        r1 = r6.a;
        r2 = r6.a;
        r2 = com.whatsapp.GroupChatRecentLocationsActivity.e(r2);
        r2 = com.whatsapp.Conversation.a(r2);
        r1.startActivity(r2);
        if (r0 == 0) goto L_0x0006;
    L_0x001b:
        r1 = r6.a;
        r1 = com.whatsapp.GroupChatRecentLocationsActivity.e(r1);
        r2 = r6.a;
        com.whatsapp.App.b(r1, r2);
        if (r0 == 0) goto L_0x0006;
    L_0x0028:
        r1 = r6.a;
        r1 = com.whatsapp.GroupChatRecentLocationsActivity.e(r1);
        r1 = r1.h;
        if (r1 == 0) goto L_0x003f;
    L_0x0032:
        r1 = r6.a;
        r1 = com.whatsapp.GroupChatRecentLocationsActivity.e(r1);
        r2 = r6.a;
        com.whatsapp.ContactInfo.a(r1, r2);
        if (r0 == 0) goto L_0x0006;
    L_0x003f:
        r1 = r6.a;
        r1 = com.whatsapp.GroupChatRecentLocationsActivity.e(r1);
        r1 = r1.a();
        r2 = new android.content.Intent;
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        r4 = android.provider.ContactsContract.Contacts.CONTENT_URI;
        r2.<init>(r3, r4);
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r2.putExtra(r3, r1);
        r1 = r6.a;
        r1 = r1.getPackageManager();
        r1 = r2.resolveActivity(r1);
        r2.setComponent(r1);
        r1 = r2.getComponent();
        if (r1 == 0) goto L_0x0079;
    L_0x0070:
        r1 = r6.a;
        r3 = 10;
        r1.startActivityForResult(r2, r3);
        if (r0 == 0) goto L_0x0084;
    L_0x0079:
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        com.whatsapp.App.q();
    L_0x0084:
        if (r0 == 0) goto L_0x0006;
    L_0x0086:
        r0 = new android.content.Intent;
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r0.setType(r1);
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        r2 = r6.a;
        r2 = com.whatsapp.GroupChatRecentLocationsActivity.e(r2);
        r3 = r6.a;
        r2 = r2.a(r3);
        r0.putExtra(r1, r2);
        r1 = z;
        r1 = r1[r5];
        r0.putExtra(r1, r5);
        r1 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0.setFlags(r1);
        r1 = r6.a;
        r2 = 11;
        r1.startActivityForResult(r0, r2);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dn.onClick(android.content.DialogInterface, int):void");
    }

    dn(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }
}
