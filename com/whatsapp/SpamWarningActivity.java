package com.whatsapp;

import android.content.Intent;
import android.os.ConditionVariable;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class SpamWarningActivity extends DialogToastActivity {
    private static ConditionVariable k;
    private static final String[] z;
    private int j;

    static {
        String[] strArr = new String[4];
        String str = "IuF?VMdU<`Tbx l[vH<VQ`^";
        boolean z = true;
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
                        i3 = 58;
                        break;
                    case ay.f /*1*/:
                        i3 = 5;
                        break;
                    case ay.n /*2*/:
                        i3 = 39;
                        break;
                    case ay.p /*3*/:
                        i3 = 82;
                        break;
                    default:
                        i3 = 9;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "[kC fSa\t;gN`I&'YdS7nUw^|AuHb";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "[kC fSa\t;gN`I&'[fS;fT+j\u0013@t";
                    z = true;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    k = new ConditionVariable(false);
                default:
                    strArr2[i] = str;
                    str = "_}W;{CZN<VI`D=g^v";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    private void d() {
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.progress_bar);
        circularProgressBar.setVisibility(0);
        circularProgressBar.setProgressBarBackgroundColor(-65536);
        circularProgressBar.setProgressBarColor(-2039584);
        circularProgressBar.setPaintStrokeFactor(30);
        circularProgressBar.setKnobEnabled(true);
        circularProgressBar.setMax(this.j * 1000);
        new oa(this, (long) (this.j * 1000), 10, circularProgressBar).start();
    }

    public static void a(boolean z) {
        if (z) {
            k.open();
            if (App.az == 0) {
                return;
            }
        }
        k.close();
    }

    static ConditionVariable a() {
        return k;
    }

    public void onBackPressed() {
        Intent intent = new Intent(z[3]);
        intent.addCategory(z[2]);
        intent.setFlags(268435456);
        startActivity(intent);
    }

    private void b() {
        new im(this).start();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r8) {
        /*
        r7_this = this;
        r6 = 8;
        r5 = -1;
        r2 = com.whatsapp.App.az;
        super.onCreate(r8);
        r0 = 2130903069; // 0x7f03001d float:1.7412946E38 double:1.052806001E-314;
        r7.setContentView(r0);
        r0 = 2131624936; // 0x7f0e03e8 float:1.8877066E38 double:1.0531626507E-314;
        r7.setTitle(r0);
        r0 = r7.getIntent();
        r1 = z;
        r3 = 0;
        r1 = r1[r3];
        r3 = 100;
        r3 = r0.getIntExtra(r1, r3);
        r0 = r7.getIntent();
        r1 = z;
        r4 = 1;
        r1 = r1[r4];
        r0 = r0.getIntExtra(r1, r5);
        r7.j = r0;
        switch(r3) {
            case 101: goto L_0x0080;
            case 102: goto L_0x0085;
            case 103: goto L_0x008a;
            case 104: goto L_0x008f;
            default: goto L_0x0035;
        };
    L_0x0035:
        r0 = r7.j;
        if (r0 != r5) goto L_0x003e;
    L_0x0039:
        r0 = 2131624934; // 0x7f0e03e6 float:1.8877062E38 double:1.0531626497E-314;
        if (r2 == 0) goto L_0x0094;
    L_0x003e:
        r0 = 2131624932; // 0x7f0e03e4 float:1.8877058E38 double:1.0531626487E-314;
        r1 = r0;
    L_0x0042:
        r0 = 2131427465; // 0x7f0b0089 float:1.8476547E38 double:1.053065087E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r4 = new com.whatsapp.asf;
        r4.<init>(r7, r3);
        r0.setOnClickListener(r4);
        r0 = 2131427463; // 0x7f0b0087 float:1.8476543E38 double:1.053065086E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0.setText(r1);
        r0 = r7.j;
        if (r0 != r5) goto L_0x0072;
    L_0x0063:
        r0 = 2131427464; // 0x7f0b0088 float:1.8476545E38 double:1.0530650866E-314;
        r0 = r7.findViewById(r0);
        r0.setVisibility(r6);
        r7.b();
        if (r2 == 0) goto L_0x007f;
    L_0x0072:
        r0 = 2131427466; // 0x7f0b008a float:1.847655E38 double:1.0530650876E-314;
        r0 = r7.findViewById(r0);
        r0.setVisibility(r6);
        r7.d();
    L_0x007f:
        return;
    L_0x0080:
        r0 = 2131624939; // 0x7f0e03eb float:1.8877072E38 double:1.053162652E-314;
        if (r2 == 0) goto L_0x0094;
    L_0x0085:
        r0 = 2131624937; // 0x7f0e03e9 float:1.8877068E38 double:1.053162651E-314;
        if (r2 == 0) goto L_0x0094;
    L_0x008a:
        r0 = 2131624938; // 0x7f0e03ea float:1.887707E38 double:1.0531626517E-314;
        if (r2 == 0) goto L_0x0094;
    L_0x008f:
        r0 = 2131624940; // 0x7f0e03ec float:1.8877074E38 double:1.0531626527E-314;
        if (r2 != 0) goto L_0x0035;
    L_0x0094:
        r1 = r0;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SpamWarningActivity.onCreate(android.os.Bundle):void");
    }
}
