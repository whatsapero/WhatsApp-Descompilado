package com.whatsapp;

import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.SeekBar;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class kl implements OnClickListener {
    private static final String[] z;
    private ImageButton a;
    final MediaView b;
    private SeekBar c;

    static {
        String[] strArr = new String[4];
        String str = "\nuA";
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
                        i3 = 42;
                        break;
                    case ay.f /*1*/:
                        i3 = 88;
                        break;
                    case ay.n /*2*/:
                        i3 = 97;
                        break;
                    case ay.p /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 49;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "G=\u0005yP\\1\u0004g\u001eK-\u0005y^I4\bsZ\n";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\n$A";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\n$A";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public kl(MediaView mediaView, SeekBar seekBar, ImageButton imageButton) {
        this.b = mediaView;
        this.c = seekBar;
        this.a = imageButton;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
        r7_this = this;
        r6 = 5;
        r5 = 4;
        r4 = 0;
        r1 = com.whatsapp.App.az;
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0174 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0174 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0174 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0174 }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0174 }
        r2 = r7.c;	 Catch:{ IllegalStateException -> 0x0174 }
        r2 = r2.getProgress();	 Catch:{ IllegalStateException -> 0x0174 }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0174 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0174 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0174 }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0174 }
        r2 = r7.c;	 Catch:{ IllegalStateException -> 0x0174 }
        r2 = r2.getMax();	 Catch:{ IllegalStateException -> 0x0174 }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0174 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0174 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0174 }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0174 }
        r2 = r7.b;	 Catch:{ IllegalStateException -> 0x0174 }
        r2 = com.whatsapp.MediaView.b(r2);	 Catch:{ IllegalStateException -> 0x0174 }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0174 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0174 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0174 }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0174 }
        r2 = 5;
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0174 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0174 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0174 }
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x0174 }
        r0 = com.whatsapp.MediaView.b(r0);	 Catch:{ IllegalStateException -> 0x0174 }
        if (r0 != r6) goto L_0x00a1;
    L_0x0060:
        r0 = r7.c;	 Catch:{ IllegalStateException -> 0x0174 }
        r0 = r0.getProgress();	 Catch:{ IllegalStateException -> 0x0174 }
        if (r0 <= 0) goto L_0x00a1;
    L_0x0068:
        r0 = r7.c;	 Catch:{ IllegalStateException -> 0x0176 }
        r0 = r0.getProgress();	 Catch:{ IllegalStateException -> 0x0176 }
        r2 = r7.c;	 Catch:{ IllegalStateException -> 0x0176 }
        r2 = r2.getMax();	 Catch:{ IllegalStateException -> 0x0176 }
        if (r0 >= r2) goto L_0x00a1;
    L_0x0076:
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x0178 }
        r2 = 4;
        com.whatsapp.MediaView.e(r0, r2);	 Catch:{ IllegalStateException -> 0x0178 }
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x0178 }
        com.whatsapp.App.c(r0);	 Catch:{ IllegalStateException -> 0x0178 }
        com.whatsapp.cb.e();	 Catch:{ IllegalStateException -> 0x0178 }
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x0178 }
        r0 = com.whatsapp.MediaView.q(r0);	 Catch:{ IllegalStateException -> 0x0178 }
        r0.d();	 Catch:{ IllegalStateException -> 0x0178 }
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x0178 }
        r0 = com.whatsapp.MediaView.m(r0);	 Catch:{ IllegalStateException -> 0x0178 }
        r2 = 0;
        r0.sendEmptyMessage(r2);	 Catch:{ IllegalStateException -> 0x0178 }
        r0 = r7.a;	 Catch:{ IllegalStateException -> 0x0178 }
        r2 = 2130838989; // 0x7f0205cd float:1.7282976E38 double:1.0527743413E-314;
        r0.setImageResource(r2);	 Catch:{ IllegalStateException -> 0x0178 }
        if (r1 == 0) goto L_0x0173;
    L_0x00a1:
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x017a }
        r0 = com.whatsapp.MediaView.b(r0);	 Catch:{ IllegalStateException -> 0x017a }
        if (r0 != r6) goto L_0x0110;
    L_0x00a9:
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x017c }
        r0 = com.whatsapp.MediaView.q(r0);	 Catch:{ IllegalStateException -> 0x017c }
        r0 = r0.f();	 Catch:{ IllegalStateException -> 0x017c }
        r2 = r7.b;	 Catch:{ IllegalStateException -> 0x017c }
        r2 = com.whatsapp.MediaView.q(r2);	 Catch:{ IllegalStateException -> 0x017c }
        r2 = r2.e();	 Catch:{ IllegalStateException -> 0x017c }
        if (r0 < r2) goto L_0x00db;
    L_0x00bf:
        r0 = r7.c;	 Catch:{ IllegalStateException -> 0x017e }
        r0 = r0.getProgress();	 Catch:{ IllegalStateException -> 0x017e }
        r2 = r7.c;	 Catch:{ IllegalStateException -> 0x017e }
        r2 = r2.getMax();	 Catch:{ IllegalStateException -> 0x017e }
        if (r0 != r2) goto L_0x00db;
    L_0x00cd:
        r0 = r7.c;
        r0.setProgress(r4);
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x0180, IOException -> 0x0186 }
        r0 = com.whatsapp.MediaView.q(r0);	 Catch:{ IllegalStateException -> 0x0180, IOException -> 0x0186 }
        r0.h();	 Catch:{ IllegalStateException -> 0x0180, IOException -> 0x0186 }
    L_0x00db:
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x018c }
        com.whatsapp.App.c(r0);	 Catch:{ IllegalStateException -> 0x018c }
        com.whatsapp.cb.e();	 Catch:{ IllegalStateException -> 0x018c }
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x018c }
        r0 = com.whatsapp.MediaView.q(r0);	 Catch:{ IllegalStateException -> 0x018c }
        r0.d();	 Catch:{ IllegalStateException -> 0x018c }
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x018c }
        r0 = com.whatsapp.MediaView.m(r0);	 Catch:{ IllegalStateException -> 0x018c }
        r2 = 0;
        r0.removeMessages(r2);	 Catch:{ IllegalStateException -> 0x018c }
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x018c }
        r0 = com.whatsapp.MediaView.m(r0);	 Catch:{ IllegalStateException -> 0x018c }
        r2 = 0;
        r0.sendEmptyMessage(r2);	 Catch:{ IllegalStateException -> 0x018c }
        r0 = r7.a;	 Catch:{ IllegalStateException -> 0x018c }
        r2 = 2130838989; // 0x7f0205cd float:1.7282976E38 double:1.0527743413E-314;
        r0.setImageResource(r2);	 Catch:{ IllegalStateException -> 0x018c }
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x018c }
        r2 = 4;
        com.whatsapp.MediaView.e(r0, r2);	 Catch:{ IllegalStateException -> 0x018c }
        if (r1 == 0) goto L_0x0173;
    L_0x0110:
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x018e }
        r0 = com.whatsapp.MediaView.b(r0);	 Catch:{ IllegalStateException -> 0x018e }
        if (r0 != r5) goto L_0x0131;
    L_0x0118:
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x0190 }
        r0 = com.whatsapp.MediaView.q(r0);	 Catch:{ IllegalStateException -> 0x0190 }
        r0.b();	 Catch:{ IllegalStateException -> 0x0190 }
        r0 = r7.a;	 Catch:{ IllegalStateException -> 0x0190 }
        r2 = 2130838990; // 0x7f0205ce float:1.7282978E38 double:1.052774342E-314;
        r0.setImageResource(r2);	 Catch:{ IllegalStateException -> 0x0190 }
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x0190 }
        r2 = 5;
        com.whatsapp.MediaView.e(r0, r2);	 Catch:{ IllegalStateException -> 0x0190 }
        if (r1 == 0) goto L_0x0173;
    L_0x0131:
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x0192 }
        r1 = r7.b;	 Catch:{ IllegalStateException -> 0x0192 }
        r2 = r7.b;	 Catch:{ IllegalStateException -> 0x0192 }
        r2 = com.whatsapp.MediaView.j(r2);	 Catch:{ IllegalStateException -> 0x0192 }
        r1 = com.whatsapp.MediaView.i(r1, r2);	 Catch:{ IllegalStateException -> 0x0192 }
        com.whatsapp.MediaView.b(r0, r1);	 Catch:{ IllegalStateException -> 0x0192 }
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x0192 }
        r0 = com.whatsapp.MediaView.q(r0);	 Catch:{ IllegalStateException -> 0x0192 }
        if (r0 == 0) goto L_0x0173;
    L_0x014a:
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x0192 }
        r1 = 4;
        com.whatsapp.MediaView.e(r0, r1);	 Catch:{ IllegalStateException -> 0x0192 }
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x0192 }
        r0 = com.whatsapp.MediaView.m(r0);	 Catch:{ IllegalStateException -> 0x0192 }
        r1 = 0;
        r0.sendEmptyMessage(r1);	 Catch:{ IllegalStateException -> 0x0192 }
        r0 = r7.a;	 Catch:{ IllegalStateException -> 0x0192 }
        r1 = 2130838989; // 0x7f0205cd float:1.7282976E38 double:1.0527743413E-314;
        r0.setImageResource(r1);	 Catch:{ IllegalStateException -> 0x0192 }
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x0192 }
        com.whatsapp.App.c(r0);	 Catch:{ IllegalStateException -> 0x0192 }
        com.whatsapp.cb.e();	 Catch:{ IllegalStateException -> 0x0192 }
        r0 = r7.b;	 Catch:{ IllegalStateException -> 0x0192 }
        r0 = com.whatsapp.MediaView.q(r0);	 Catch:{ IllegalStateException -> 0x0192 }
        r0.d();	 Catch:{ IllegalStateException -> 0x0192 }
    L_0x0173:
        return;
    L_0x0174:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0176 }
    L_0x0176:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0178 }
    L_0x0178:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x017a }
    L_0x017a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x017c }
    L_0x017c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x017e }
    L_0x017e:
        r0 = move-exception;
        throw r0;
    L_0x0180:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        goto L_0x00db;
    L_0x0186:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        goto L_0x00db;
    L_0x018c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x018e }
    L_0x018e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0190 }
    L_0x0190:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0192 }
    L_0x0192:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kl.onClick(android.view.View):void");
    }
}
