package com.whatsapp;

import android.content.Intent;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class IncorrectAppReleaseVersionActivity extends DialogToastActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[7];
        String str = "<\u0019i;\u0002r[r%H.[r;\\/\u001bz1\u0007-Ip:Us\u0003{4L.\u0015c%";
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
                        i3 = 93;
                        break;
                    case ay.f /*1*/:
                        i3 = 116;
                        break;
                    case ay.n /*2*/:
                        i3 = 19;
                        break;
                    case ay.p /*3*/:
                        i3 = 85;
                        break;
                    default:
                        i3 = 56;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\b\u001ax;W*\u001a3#Y1\u0001vu^2\u000630@)\u0006ruL$\u0004vu\u0002}";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "5\u0000g%Kg[<\"O*Zd=Y)\u0007r%Hs\u0017|8\u0017<\u001aw'W4\u0010";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "0\u0015a>])N<z\\8\u0000r<T.Kz1\u0005>\u001b~{O5\u0015g&Y-\u0004";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "<\u001aw'W4\u0010=<V)\u0011}!\u0016>\u0015g0_2\u0006j{p\u00129V";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "<\u001aw'W4\u0010=<V)\u0011}!\u0016<\u0017g<W3Z^\u0014q\u0013";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ")\rc0";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r10) {
        /*
        r9_this = this;
        r4 = 2;
        r8 = 1;
        r7 = 0;
        r1 = com.whatsapp.App.az;
        super.onCreate(r10);
        r0 = 2130903067; // 0x7f03001b float:1.7412942E38 double:1.052806E-314;
        r9.setContentView(r0);
        r0 = 2131427460; // 0x7f0b0084 float:1.8476537E38 double:1.0530650846E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r2 = r9.getIntent();
        r2 = r2.getExtras();
        r3 = z;
        r3 = r3[r8];
        r2 = r2.getInt(r3);
        r3 = android.text.method.LinkMovementMethod.getInstance();
        r0.setMovementMethod(r3);
        switch(r2) {
            case 1: goto L_0x004f;
            case 2: goto L_0x0073;
            default: goto L_0x0031;
        };
    L_0x0031:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004d }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004d }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x004d }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x004d }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x004d }
        r1 = r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x004d }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x004d }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x004d }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x004d }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r3 = 2131623991; // 0x7f0e0037 float:1.887515E38 double:1.053162184E-314;
        r3 = r9.getString(r3);
        r4 = new java.lang.Object[r4];
        r5 = z;
        r6 = 4;
        r5 = r5[r6];
        r4[r7] = r5;
        r5 = z;
        r6 = 3;
        r5 = r5[r6];
        r4[r8] = r5;
        r3 = java.lang.String.format(r3, r4);
        r3 = android.text.Html.fromHtml(r3);
        r0.setText(r3);
        if (r1 == 0) goto L_0x008f;
    L_0x0073:
        r3 = 2131624357; // 0x7f0e01a5 float:1.8875891E38 double:1.0531623646E-314;
        r3 = r9.getString(r3);
        r4 = new java.lang.Object[r8];
        r5 = z;
        r5 = r5[r7];
        r4[r7] = r5;
        r3 = java.lang.String.format(r3, r4);
        r3 = android.text.Html.fromHtml(r3);	 Catch:{ IllegalArgumentException -> 0x004d }
        r0.setText(r3);	 Catch:{ IllegalArgumentException -> 0x004d }
        if (r1 != 0) goto L_0x0031;
    L_0x008f:
        r0 = 2131427458; // 0x7f0b0082 float:1.8476533E38 double:1.0530650836E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = new com.whatsapp.alg;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.IncorrectAppReleaseVersionActivity.onCreate(android.os.Bundle):void");
    }

    public void onBackPressed() {
        Intent intent = new Intent(z[6]);
        intent.addCategory(z[5]);
        intent.setFlags(268435456);
        startActivity(intent);
    }
}
