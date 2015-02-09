package com.whatsapp.gallerypicker;

import com.actionbarsherlock.R;
import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class at {
    private static final String[] z;
    public final String a;
    public final int b;
    public final aw c;
    public final String d;
    final GalleryPicker e;
    public final int f;

    static {
        String[] strArr = new String[16];
        String str = "\u0006)i]2\u0002,tm\u001b\u0018!kg";
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
                        i3 = 107;
                        break;
                    case ay.f /*1*/:
                        i3 = 72;
                        break;
                    case ay.n /*2*/:
                        i3 = 17;
                        break;
                    case ay.p /*3*/:
                        i3 = 2;
                        break;
                    default:
                        i3 = 68;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0019-rk4\u0002-\u007fv";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0006)i]2\u0002,tm\u001b\u0018!kg";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0006)i]-\u001f-|q";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001c!\u007ff+\u001c\u001cxv(\u000e";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0006)i]-\u001f-|q";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001b:tt-\u000e?";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0002&rn1\u000f-No!\u000f!p";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001b:tt-\u000e?";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0006)i]-\u001f-|q";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001d-c`";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\t=ri!\u001f\u0001u";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001d-c`";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\t=ri!\u001f\u0001u";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\n&up+\u0002,?k*\u001f-\u007fvj\n+ek+\u0005fGK\u0001<";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0019-rk4\u0002-\u007fv";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int c() {
        switch (this.b) {
            case PBE.MD5 /*0*/:
            case ay.n /*2*/:
                return R.drawable.frame_overlay_gallery_camera;
            case ay.f /*1*/:
            case ay.p /*3*/:
            case aj.i /*4*/:
                return R.drawable.frame_overlay_gallery_video;
            case aV.i /*6*/:
                return R.drawable.frame_overlay_gallery_whatsapp;
            default:
                return R.drawable.frame_overlay_gallery_folder;
        }
    }

    public int a() {
        switch (this.b) {
            case PBE.MD5 /*0*/:
            case ay.n /*2*/:
                return 1;
            case ay.f /*1*/:
            case ay.p /*3*/:
                return 4;
            default:
                return 5;
        }
    }

    public boolean b() {
        return this.b >= 2;
    }

    public String d() {
        return this.b + "-" + this.a + "-" + GalleryPicker.f(this.e);
    }

    public at(GalleryPicker galleryPicker, int i, int i2, String str, String str2, aw awVar, int i3) {
        this.e = galleryPicker;
        this.b = i;
        this.a = str;
        this.d = str2;
        this.c = awVar;
        this.f = i3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.app.Activity r12) {
        /*
        r11_this = this;
        r10 = 6;
        r9 = 0;
        r8 = 1;
        r1 = com.whatsapp.gallerypicker.ImagePreview.y;
        r0 = r11.b;
        if (r0 == r10) goto L_0x0027;
    L_0x0009:
        r0 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI;
        r2 = r11.b();
        if (r2 == 0) goto L_0x003d;
    L_0x0011:
        r0 = r0.buildUpon();
        r2 = z;
        r3 = 12;
        r2 = r2[r3];
        r3 = r11.a;
        r0 = r0.appendQueryParameter(r2, r3);
        r0 = r0.build();
        if (r1 == 0) goto L_0x003d;
    L_0x0027:
        r0 = com.whatsapp.gallerypicker.ag.i;
        r0 = r0.buildUpon();
        r2 = z;
        r3 = 14;
        r2 = r2[r3];
        r3 = r11.a;
        r0 = r0.appendQueryParameter(r2, r3);
        r0 = r0.build();
    L_0x003d:
        r2 = new android.content.Intent;
        r3 = z;
        r4 = 15;
        r3 = r3[r4];
        r2.<init>(r3, r0);
        r0 = z;
        r3 = 5;
        r0 = r0[r3];
        r3 = r11.d;
        r2.putExtra(r0, r3);
        r0 = z;
        r3 = 8;
        r0 = r0[r3];
        r3 = r11.a();
        r4 = r11.e;
        r4 = com.whatsapp.gallerypicker.GalleryPicker.f(r4);
        r3 = r3 & r4;
        r2.putExtra(r0, r3);
        r0 = z;
        r3 = 9;
        r0 = r0[r3];
        r3 = r11.e;
        r3 = r3.getIntent();
        r4 = z;
        r5 = 7;
        r4 = r4[r5];
        r3 = r3.getStringExtra(r4);
        r2.putExtra(r0, r3);
        r0 = z;
        r3 = 13;
        r0 = r0[r3];
        r3 = r11.e;
        r3 = r3.getIntent();
        r4 = z;
        r5 = 11;
        r4 = r4[r5];
        r3 = r3.getStringExtra(r4);
        r2.putExtra(r0, r3);
        r0 = z;
        r3 = 2;
        r0 = r0[r3];
        r3 = r11.e;
        r3 = r3.getIntent();
        r4 = z;
        r4 = r4[r8];
        r3 = r3.getStringExtra(r4);
        r2.putExtra(r0, r3);
        r0 = z;
        r3 = 3;
        r0 = r0[r3];
        r3 = r11.e;
        r3 = r3.getIntent();
        r4 = z;
        r4 = r4[r9];
        r6 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r4 = r3.getLongExtra(r4, r6);
        r2.putExtra(r0, r4);
        r0 = r11.a();
        r3 = r11.e;
        r3 = com.whatsapp.gallerypicker.GalleryPicker.f(r3);
        r0 = r0 & r3;
        if (r0 != r8) goto L_0x00f2;
    L_0x00d5:
        r0 = z;
        r3 = 4;
        r0 = r0[r3];
        r3 = r11.e;
        r3 = r3.getIntent();
        r4 = z;
        r5 = 10;
        r4 = r4[r5];
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r3 = r3.getIntExtra(r4, r5);
        r2.putExtra(r0, r3);
        if (r1 == 0) goto L_0x00f9;
    L_0x00f2:
        r0 = z;
        r0 = r0[r10];
        r2.putExtra(r0, r8);
    L_0x00f9:
        r0 = com.whatsapp.gallerypicker.ImageGallery.class;
        r2.setClass(r12, r0);
        r12.startActivityForResult(r2, r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.at.a(android.app.Activity):void");
    }
}
