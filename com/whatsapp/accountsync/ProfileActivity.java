package com.whatsapp.accountsync;

import android.os.AsyncTask.Status;
import com.whatsapp.VerifyMessageStoreActivity;
import com.whatsapp.a5w;
import com.whatsapp.bd;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ProfileActivity extends VerifyMessageStoreActivity {
    private static final String[] z;
    b k;

    static {
        String[] strArr = new String[7];
        String str = "}3xR.a$vW3d7~@>\"\"eQ&y$";
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
                        i3 = 65;
                        break;
                    case ay.n /*2*/:
                        i3 = 23;
                        break;
                    case ay.p /*3*/:
                        i3 = 52;
                        break;
                    default:
                        i3 = 71;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "`.bZ3h%HF(";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "}3xR.a$vW3d7~@>\"\"eQ&y$8V&n*bD!d-rG!b4yPg";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "`.bZ3h%";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "I\u0000Cuv";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "^8yW\"iat[)y t@`~a}]#-,~G4d/p\u000b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "l#xF3d/p\u0014#x$7@(-/v@.{$7X.o3vF.h27Y.~2~Z ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void d() {
        if (bd.e) {
            if (this.k == null || this.k.getStatus() != Status.RUNNING) {
                this.k = new b(this);
                a5w.a(this.k, new Void[0]);
                if (PerformSyncManager.a == 0) {
                    return;
                }
            }
            return;
        }
        a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r7_this = this;
        r2 = 0;
        r6 = com.whatsapp.accountsync.PerformSyncManager.a;
        r0 = r7.getIntent();
        r0 = r0.getData();
        if (r0 == 0) goto L_0x0063;
    L_0x000d:
        r0 = r7.getIntent();
        r1 = r0.getData();
        r0 = r7;
        r3 = r2;
        r4 = r2;
        r5 = r2;
        r0 = r0.managedQuery(r1, r2, r3, r4, r5);
        if (r0 == 0) goto L_0x0061;
    L_0x001f:
        r1 = r0.moveToNext();
        if (r1 == 0) goto L_0x005e;
    L_0x0025:
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r1 = r0.getColumnIndex(r1);
        r1 = r0.getString(r1);
        r2 = com.whatsapp.App.P;
        r1 = r2.a(r1);
        if (r1 == 0) goto L_0x0049;
    L_0x003a:
        r2 = r7.isFinishing();
        if (r2 != 0) goto L_0x005b;
    L_0x0040:
        r1 = com.whatsapp.Conversation.a(r1);
        r7.startActivity(r1);
        if (r6 == 0) goto L_0x005b;
    L_0x0049:
        r1 = r7.isFinishing();
        if (r1 != 0) goto L_0x005b;
    L_0x004f:
        r1 = new android.content.Intent;
        r2 = com.whatsapp.Main.b();
        r1.<init>(r7, r2);
        r7.startActivity(r1);
    L_0x005b:
        r7.finish();
    L_0x005e:
        r0.close();
    L_0x0061:
        if (r6 == 0) goto L_0x006e;
    L_0x0063:
        r0 = z;
        r1 = 6;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r7.finish();
    L_0x006e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.ProfileActivity.a():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
        r6_this = this;
        r5 = 3;
        r2 = 1;
        r4 = 0;
        r0 = com.whatsapp.accountsync.PerformSyncManager.a;
        super.onCreate(r7);
        r1 = z;
        r1 = r1[r4];
        com.whatsapp.util.Log.i(r1);
        r1 = 0;
        r1 = com.whatsapp.util.WhatsAppLibLoader.a(r1);
        if (r1 != 0) goto L_0x0021;
    L_0x0016:
        r0 = z;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r6.finish();
    L_0x0020:
        return;
    L_0x0021:
        r1 = com.whatsapp.App.an;
        if (r1 == 0) goto L_0x002b;
    L_0x0025:
        r1 = com.whatsapp.App.e(r6);
        if (r1 == r5) goto L_0x0035;
    L_0x002b:
        r0 = 2131624335; // 0x7f0e018f float:1.8875847E38 double:1.053162354E-314;
        com.whatsapp.App.b(r6, r0, r2);
        r6.finish();
        goto L_0x0020;
    L_0x0035:
        r1 = com.whatsapp.App.aJ;
        r1 = r1.e();
        if (r1 != 0) goto L_0x008a;
    L_0x003d:
        r1 = android.os.Environment.getExternalStorageState();
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r2 = r1.equals(r2);
        if (r2 != 0) goto L_0x005e;
    L_0x004c:
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x005e;
    L_0x0057:
        r1 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r6.showDialog(r1);
        if (r0 == 0) goto L_0x0088;
    L_0x005e:
        r1 = com.whatsapp.App.aJ;
        r1 = r1.w();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        if (r1 <= 0) goto L_0x0085;
    L_0x007e:
        r1 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r6.showDialog(r1);
        if (r0 == 0) goto L_0x0088;
    L_0x0085:
        r6.a(r4);
    L_0x0088:
        if (r0 == 0) goto L_0x0020;
    L_0x008a:
        r6.d();
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.ProfileActivity.onCreate(android.os.Bundle):void");
    }

    public ProfileActivity() {
        this.k = null;
    }

    static void a(ProfileActivity profileActivity) {
        profileActivity.a();
    }
}
