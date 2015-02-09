package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class dk implements bw {
    private static final String z;
    final VideoPreviewActivity a;

    static {
        char[] toCharArray = "\u000e_B".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 46;
                    break;
                case ay.f /*1*/:
                    i2 = 114;
                    break;
                case ay.n /*2*/:
                    i2 = 98;
                    break;
                case ay.p /*3*/:
                    i2 = 37;
                    break;
                default:
                    i2 = 106;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.RangeSeekBar r9, java.lang.Long r10, java.lang.Long r11, boolean r12) {
        /*
        r8_this = this;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = 1;
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.h(r0);
        r0 = r0.isPlaying();
        if (r0 == 0) goto L_0x001d;
    L_0x000f:
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.h(r0);
        r0.pause();
        r0 = r8.a;
        com.whatsapp.VideoPreviewActivity.c(r0, r4);
    L_0x001d:
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.c(r0);
        r2 = r10.longValue();
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x004e;
    L_0x002b:
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.e(r0);
        r2 = r10.longValue();
        r0.a(r2);
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.h(r0);
        r1 = r10.intValue();
        r0.seekTo(r1);
        r0 = r8.a;
        com.whatsapp.VideoPreviewActivity.b(r0, r4);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x008e;
    L_0x004e:
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.n(r0);
        r2 = r11.longValue();
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x008e;
    L_0x005c:
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.e(r0);
        r2 = r11.longValue();
        r0.a(r2);
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.h(r0);
        r1 = r11.intValue();
        r0.seekTo(r1);
        r0 = r11.longValue();
        r2 = r8.a;
        r2 = com.whatsapp.VideoPreviewActivity.k(r2);
        r2 = r2.getProgress();
        r2 = (long) r2;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 > 0) goto L_0x008e;
    L_0x0089:
        r0 = r8.a;
        com.whatsapp.VideoPreviewActivity.b(r0, r4);
    L_0x008e:
        r0 = r8.a;
        r2 = r10.longValue();
        com.whatsapp.VideoPreviewActivity.a(r0, r2);
        r0 = r8.a;
        r2 = r11.longValue();
        com.whatsapp.VideoPreviewActivity.b(r0, r2);
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.a(r0);
        r0 = r0.getVisibility();
        if (r0 == 0) goto L_0x00cc;
    L_0x00ac:
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.a(r0);
        r1 = 0;
        r0.setVisibility(r1);
        r0 = new android.view.animation.AlphaAnimation;
        r1 = 0;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.<init>(r1, r2);
        r2 = 100;
        r0.setDuration(r2);
        r1 = r8.a;
        r1 = com.whatsapp.VideoPreviewActivity.a(r1);
        r1.startAnimation(r0);
    L_0x00cc:
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.a(r0);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r8.a;
        r2 = com.whatsapp.VideoPreviewActivity.c(r2);
        r2 = r2 / r6;
        r2 = android.text.format.DateUtils.formatElapsedTime(r2);
        r1 = r1.append(r2);
        r2 = z;
        r1 = r1.append(r2);
        r2 = r8.a;
        r2 = com.whatsapp.VideoPreviewActivity.n(r2);
        r2 = r2 / r6;
        r2 = android.text.format.DateUtils.formatElapsedTime(r2);
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.setText(r1);
        r0 = r8.a;
        r1 = r8.a;
        r2 = com.whatsapp.VideoPreviewActivity.c(r1);
        r1 = r8.a;
        r4 = com.whatsapp.VideoPreviewActivity.n(r1);
        com.whatsapp.VideoPreviewActivity.a(r0, r2, r4);
        if (r12 != 0) goto L_0x0123;
    L_0x0115:
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.g(r0);
        r1 = new com.whatsapp.dd;
        r1.<init>(r8);
        r0.postDelayed(r1, r6);
    L_0x0123:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dk.a(com.whatsapp.RangeSeekBar, java.lang.Long, java.lang.Long, boolean):void");
    }

    dk(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }

    public void a(RangeSeekBar rangeSeekBar, Object obj, Object obj2, boolean z) {
        a(rangeSeekBar, (Long) obj, (Long) obj2, z);
    }
}
