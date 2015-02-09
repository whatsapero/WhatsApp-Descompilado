package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class VoipNotAllowedActivity extends DialogToastFragmentActivity {
    private static final String[] z;

    public class VoipNotAllowedDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            /* JADX: method processing error */
/*
            Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
            /*
            r1 = 0;
            r0 = 2;
            r3 = new java.lang.String[r0];
            r2 = "qj!";
            r0 = -1;
            r4 = r3;
            r5 = r3;
            r3 = r1;
        L_0x000a:
            r2 = r2.toCharArray();
            r6 = r2.length;
            r7 = r6;
            r8 = r1;
            r6 = r2;
        L_0x0012:
            if (r7 > r8) goto L_0x002f;
        L_0x0014:
            r2 = new java.lang.String;
            r2.<init>(r6);
            r2 = r2.intern();
            switch(r0) {
                case 0: goto L_0x002a;
                default: goto L_0x0020;
            };
        L_0x0020:
            r4[r3] = r2;
            r2 = 1;
            r0 = "qj!";
            r3 = r2;
            r4 = r5;
            r2 = r0;
            r0 = r1;
            goto L_0x000a;
        L_0x002a:
            r4[r3] = r2;
            z = r5;
            return;
        L_0x002f:
            r9 = r6[r8];
            r2 = r8 % 5;
            switch(r2) {
                case 0: goto L_0x0040;
                case 1: goto L_0x0043;
                case 2: goto L_0x0045;
                case 3: goto L_0x0048;
                default: goto L_0x0036;
            };
        L_0x0036:
            r2 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        L_0x0038:
            r2 = r2 ^ r9;
            r2 = (char) r2;
            r6[r8] = r2;
            r2 = r8 + 1;
            r8 = r2;
            goto L_0x0012;
        L_0x0040:
            r2 = 27;
            goto L_0x0038;
        L_0x0043:
            r2 = 3;
            goto L_0x0038;
        L_0x0045:
            r2 = 69;
            goto L_0x0038;
        L_0x0048:
            r2 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
            goto L_0x0038;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoipNotAllowedActivity.VoipNotAllowedDialogFragment.<clinit>():void");
        }

        private static DialogFragment b(String str) {
            DialogFragment voipNotAllowedDialogFragment = new com.whatsapp.VoipNotAllowedActivity.VoipNotAllowedDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[1], str);
            voipNotAllowedDialogFragment.setArguments(bundle);
            return voipNotAllowedDialogFragment;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            Activity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.app.Dialog onCreateDialog(android.os.Bundle r8) {
            /*
            r7_this = this;
            r6 = 1;
            r5 = 0;
            r1 = com.whatsapp.App.az;
            r0 = r7.getArguments();
            r2 = z;
            r2 = r2[r5];
            r0 = r0.getString(r2);
            r2 = com.whatsapp.App.P;
            r2 = r2.a(r0);
            r0 = r2.C;
            r3 = com.whatsapp.ar.FORWARD;
            if (r0 == r3) goto L_0x0026;
        L_0x001c:
            r0 = com.whatsapp.ge.l;
            r3 = r2.e;
            r0 = r0.a(r3);
            if (r0 != 0) goto L_0x002b;
        L_0x0026:
            r0 = 2131625103; // 0x7f0e048f float:1.8877404E38 double:1.053162733E-314;
            if (r1 == 0) goto L_0x0039;
        L_0x002b:
            r0 = r2.C;
            r3 = com.whatsapp.ar.UPGRADE;
            if (r0 != r3) goto L_0x0036;
        L_0x0031:
            r0 = 2131625104; // 0x7f0e0490 float:1.8877407E38 double:1.0531627337E-314;
            if (r1 == 0) goto L_0x0039;
        L_0x0036:
            r0 = 2131625105; // 0x7f0e0491 float:1.8877409E38 double:1.053162734E-314;
        L_0x0039:
            r1 = new android.app.AlertDialog$Builder;
            r3 = r7.getActivity();
            r1.<init>(r3);
            r3 = new java.lang.Object[r6];
            r4 = r7.getActivity();
            r2 = r2.a(r4);
            r3[r5] = r2;
            r0 = r7.getString(r0, r3);
            r0 = r1.setMessage(r0);
            r0 = r0.setCancelable(r6);
            r1 = 2131624632; // 0x7f0e02b8 float:1.887645E38 double:1.0531625005E-314;
            r2 = new com.whatsapp.afo;
            r2.<init>(r7);
            r0 = r0.setNeutralButton(r1, r2);
            r0 = r0.create();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoipNotAllowedActivity.VoipNotAllowedDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
        }

        static DialogFragment a(String str) {
            return b(str);
        }
    }

    static {
        String[] strArr = new String[3];
        String str = "J)\u0014!PS2\u001c=RS1\u00185__2\u0014'WH?R2LY'\t4";
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
                        i3 = 60;
                        break;
                    case ay.f /*1*/:
                        i3 = 70;
                        break;
                    case ay.n /*2*/:
                        i3 = 125;
                        break;
                    case ay.p /*3*/:
                        i3 = 81;
                        break;
                    default:
                        i3 = 62;
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
                    str = "J)\u0014!PS2\u001c=RS1\u00185__2\u0014'WH?R5[O2\u000f>G";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "V/\u0019";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i(z[0]);
        VoipNotAllowedDialogFragment.a(getIntent().getStringExtra(z[1])).show(getSupportFragmentManager(), null);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(z[2]);
    }
}
