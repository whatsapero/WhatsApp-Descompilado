package com.whatsapp.qrcode;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Size;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class QrCodeView extends SurfaceView implements Callback {
    private static final String[] z;
    private n a;
    final AutoFocusCallback b;
    private Size c;
    private SurfaceHolder d;
    private Camera e;

    static {
        String[] strArr = new String[34];
        String str = "*\u0016e@I,K`]C+\u0007rDI)\u0005";
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
                        i3 = 91;
                        break;
                    case ay.f /*1*/:
                        i3 = 100;
                        break;
                    case ay.n /*2*/:
                        i3 = 19;
                        break;
                    case ay.p /*3*/:
                        i3 = 41;
                        break;
                    default:
                        i3 = 44;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "*\u0016e@I,K`]C+\u0007rDI)\u00053L^)\u000ba\t_/\u000bcYE5\u00033JM6\u0001aH\f+\u0016v_E>\u0013";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "4\u0002u";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "*\u0016e@I,K`]M)\u0010c[I-\rv^\f(\u0011cYC)\u0010vM\f=\u000bp\\_a";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "+\u000ba]^:\rg";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "*\u0016e@I,K`]M)\u0010c[I-\rv^\u0003(\u0001gME(\u0014\u007fHU4\u0016zLB/\u0005g@C5D";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ">\u0000|O";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "{\u0007rDI)\u0005)";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "*\u0016e@I,K`]M)\u0010c[I-\rv^\f?\r`Y@:\u001d)";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "*\u0016e@I,K`]M)\u0010c[I-\rv^\f8\u0005~L^:DzZ\f5\u0011\u007fE";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "*\u0016e@I,K`]M)\u0010c[I-\rv^\f(\u0011cYC)\u0010vM\f=\brZDa\nfE@";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ",\r}MC,";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "*\u0016e@I,K`]M)\u0010c[I-\rv^\f(\u0011cYC)\u0010vM\f=\brZDa";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "{\u0014aLZ2\u0001d\u0013";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ":\u0011gF";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "4\u0002u";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = ")\u000bgHX2\u000b}";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = ">\u0000|O";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    str = "4\u0016zLB/\u0005g@C5";
                    obj = 18;
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    strArr2 = strArr3;
                    str = ":\u0011gF";
                    obj = 19;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "7\u0005}M_8\u0005cL";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "6\u0005p[C";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "6\u0005p[C";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "*\u0016e@I,K`]M)\u0010c[I-\rv^\f4\u0014g@A:\b3Y^>\u0012zL[{\u0017zSIa";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "*\u0016e@I,K`]M)\u0010c[I-\rv^\f(\u0011cYC)\u0010vM\f=\u000bp\\_a\nfE@";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "*\u0016e@I,KuH@7\u0006rJG(\u0011cYC)\u0010vM\\)\u0001e@I,\u0017zSI(";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "{\u0002aFB/^";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "*\u0016e@I,K`\\^=\u0005pLO3\u0005}NI?^3L^)\u000ba\t_>\u0010g@B<Dc[I-\rv^\f?\r`Y@:\u001d";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "*\u0016e@I,K`\\^=\u0005pLO3\u0005}NI?^3GC{\u0017f[J:\u0007v";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "*\u0016e@I,K`\\^=\u0005pLO3\u0005}NI?D";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "*\u0016e@I,K`\\^=\u0005pLO3\u0005}NI?^3GC{\u0007rDI)\u0005";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "*\u0016e@I,K`]M)\u0010pHA>\u0016r\tI)\u0016|[\f)\u0001pFB5\u0001p]E5\u00033JM6\u0001aH";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "*\u0016e@I,K`]M)\u0010pHA>\u0016r\tI)\u0016|[\f4\u0014vGE5\u00033JM6\u0001aH";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "*\u0016e@I,K`]C+\u0007rDI)\u00053L^)\u000ba\t^>\bvH_>\r}N\f8\u0005~L^:";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void b() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: com.whatsapp.qrcode.QrCodeView.b():void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:113)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:223)
	at jadx.core.ProcessClass.process(ProcessClass.java:20)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
Caused by: java.lang.NullPointerException
*/
        /*
        r0_this = this;
        r1 = com.whatsapp.qrcode.QrCodeActivity.t;
        r0 = r4.e;
        if (r0 != 0) goto L_0x0047;
        r0 = android.hardware.Camera.open();
        r4.e = r0;
        r0 = r4.e;
        if (r0 != 0) goto L_0x001d;
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 9;
        if (r0 < r2) goto L_0x001d;
        r0 = 0;
        r0 = android.hardware.Camera.open(r0);
        r4.e = r0;
        r0 = r4.e;
        r2 = new com.whatsapp.qrcode.f;
        r2.<init>(r4);
        r0.setErrorCallback(r2);
        return;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        r2 = r4.e;
        if (r2 == 0) goto L_0x0036;
        r2 = r4.e;
        r2.release();
        r2 = 0;
        r4.e = r2;
        r2 = z;
        r3 = 33;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r4.e();
        if (r1 == 0) goto L_0x0027;
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 8;
        if (r0 < r2) goto L_0x006a;
        r0 = r4.e;
        r0.reconnect();
        goto L_0x0027;
        r0 = move-exception;
        r2 = r4.e;
        r2.release();
        r2 = 0;
        r4.e = r2;
        r2 = z;
        r3 = 32;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r4.e();
        if (r1 == 0) goto L_0x0027;
        r0 = r4.e;
        r0.release();
        r0 = 0;
        r4.e = r0;
        r4.b();
        goto L_0x0027;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.QrCodeView.b():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void f() {
        /*
        r12_this = this;
        r5 = com.whatsapp.qrcode.QrCodeActivity.t;
        r1 = r12.getWidth();
        r2 = r12.getHeight();
        r0 = r12.e;	 Catch:{ RuntimeException -> 0x001b }
        if (r0 != 0) goto L_0x001d;
    L_0x000e:
        r0 = z;	 Catch:{ RuntimeException -> 0x001b }
        r1 = 10;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x001b }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x001b }
        r12.e();	 Catch:{ RuntimeException -> 0x001b }
    L_0x001a:
        return;
    L_0x001b:
        r0 = move-exception;
        throw r0;
    L_0x001d:
        r0 = r12.getContext();
        r3 = z;
        r4 = 12;
        r3 = r3[r4];
        r0 = r0.getSystemService(r3);
        r0 = (android.view.WindowManager) r0;
        r6 = r0.getDefaultDisplay();
        r7 = r6.getOrientation();
        if (r7 == 0) goto L_0x003a;
    L_0x0037:
        r0 = 2;
        if (r7 != r0) goto L_0x0224;
    L_0x003a:
        r0 = 1;
    L_0x003b:
        r3 = r12.e;
        r8 = r3.getParameters();
        r3 = r8.getSupportedPreviewSizes();
        if (r3 != 0) goto L_0x029c;
    L_0x0047:
        r3 = z;
        r4 = 26;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = new android.hardware.Camera$Size;
        r9 = r12.e;
        r9.getClass();
        r10 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        r11 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r4.<init>(r9, r10, r11);
        r3.add(r4);
        r4 = r3;
    L_0x0067:
        if (r0 == 0) goto L_0x0227;
    L_0x0069:
        r3 = r2;
    L_0x006a:
        if (r0 == 0) goto L_0x022a;
    L_0x006c:
        r1 = com.whatsapp.camera.CameraView.a(r4, r3, r1);
        r12.c = r1;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 24;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r12.c;
        r2 = r2.width;
        r1 = r1.append(r2);
        r2 = "x";
        r1 = r1.append(r2);
        r2 = r12.c;
        r2 = r2.height;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = 0;
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 9;
        if (r2 < r3) goto L_0x00b8;
    L_0x00a5:
        r2 = new android.hardware.Camera$CameraInfo;
        r2.<init>();
        r1 = 0;
        android.hardware.Camera.getCameraInfo(r1, r2);	 Catch:{ RuntimeException -> 0x022d }
        r1 = r2.facing;	 Catch:{ RuntimeException -> 0x022d }
        r3 = 1;
        if (r1 != r3) goto L_0x022f;
    L_0x00b3:
        r1 = 1;
    L_0x00b4:
        r2 = r2.orientation;
        if (r5 == 0) goto L_0x0298;
    L_0x00b8:
        if (r7 == 0) goto L_0x00bd;
    L_0x00ba:
        r2 = 2;
        if (r7 != r2) goto L_0x00c7;
    L_0x00bd:
        r3 = r6.getWidth();
        r2 = r6.getHeight();
        if (r5 == 0) goto L_0x00cf;
    L_0x00c7:
        r3 = r6.getHeight();
        r2 = r6.getWidth();
    L_0x00cf:
        if (r3 <= r2) goto L_0x00d4;
    L_0x00d1:
        r2 = 0;
        if (r5 == 0) goto L_0x0298;
    L_0x00d4:
        r2 = 90;
        r3 = r2;
        r4 = r1;
    L_0x00d8:
        r1 = 0;
        switch(r7) {
            case 0: goto L_0x0232;
            case 1: goto L_0x0235;
            case 2: goto L_0x0239;
            case 3: goto L_0x023d;
            default: goto L_0x00dc;
        };
    L_0x00dc:
        r2 = r1;
    L_0x00dd:
        if (r4 == 0) goto L_0x00e9;
    L_0x00df:
        r1 = r3 + r2;
        r1 = r1 % 360;
        r1 = 360 - r1;
        r1 = r1 % 360;
        if (r5 == 0) goto L_0x00ef;
    L_0x00e9:
        r1 = r3 - r2;
        r1 = r1 + 360;
        r1 = r1 % 360;
    L_0x00ef:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r9 = 9;
        r7 = r7[r9];
        r6 = r6.append(r7);
        r2 = r6.append(r2);
        r6 = z;
        r7 = 8;
        r6 = r6[r7];
        r2 = r2.append(r6);
        r2 = r2.append(r3);
        r3 = z;
        r6 = 14;
        r3 = r3[r6];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r3 = z;
        r6 = 27;
        r3 = r3[r6];
        r2 = r2.append(r3);
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 8;
        if (r2 < r3) goto L_0x0262;
    L_0x0139:
        r2 = r12.e;	 Catch:{ RuntimeException -> 0x0242 }
        r2.setDisplayOrientation(r1);	 Catch:{ RuntimeException -> 0x0242 }
    L_0x013e:
        r0 = r12.c;
        r0 = r0.width;
        r1 = r12.c;
        r1 = r1.height;
        r8.setPreviewSize(r0, r1);
        r0 = r8.getSupportedFocusModes();
        if (r0 == 0) goto L_0x01b4;
    L_0x014f:
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0288 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0288 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0288 }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0288 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0288 }
        r2 = r0.toArray();	 Catch:{ RuntimeException -> 0x0288 }
        r2 = java.util.Arrays.deepToString(r2);	 Catch:{ RuntimeException -> 0x0288 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0288 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0288 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0288 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0288 }
        r2 = 15;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0288 }
        r1 = r0.contains(r1);	 Catch:{ RuntimeException -> 0x0288 }
        if (r1 == 0) goto L_0x0187;
    L_0x017c:
        r1 = z;	 Catch:{ RuntimeException -> 0x028a }
        r2 = 20;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x028a }
        r8.setFocusMode(r1);	 Catch:{ RuntimeException -> 0x028a }
        if (r5 == 0) goto L_0x01bd;
    L_0x0187:
        r1 = z;	 Catch:{ RuntimeException -> 0x028c }
        r2 = 23;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x028c }
        r1 = r0.contains(r1);	 Catch:{ RuntimeException -> 0x028c }
        if (r1 == 0) goto L_0x019e;
    L_0x0193:
        r1 = z;	 Catch:{ RuntimeException -> 0x028e }
        r2 = 22;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x028e }
        r8.setFocusMode(r1);	 Catch:{ RuntimeException -> 0x028e }
        if (r5 == 0) goto L_0x01bd;
    L_0x019e:
        r1 = z;	 Catch:{ RuntimeException -> 0x0290 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0290 }
        r0 = r0.contains(r1);	 Catch:{ RuntimeException -> 0x0290 }
        if (r0 == 0) goto L_0x01bd;
    L_0x01a9:
        r0 = z;	 Catch:{ RuntimeException -> 0x0292 }
        r1 = 18;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0292 }
        r8.setFocusMode(r0);	 Catch:{ RuntimeException -> 0x0292 }
        if (r5 == 0) goto L_0x01bd;
    L_0x01b4:
        r0 = z;	 Catch:{ RuntimeException -> 0x0292 }
        r1 = 25;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0292 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0292 }
    L_0x01bd:
        r0 = r8.getSupportedFlashModes();
        if (r0 == 0) goto L_0x01e7;
    L_0x01c3:
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0294 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0294 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0294 }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0294 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0294 }
        r2 = r0.toArray();	 Catch:{ RuntimeException -> 0x0294 }
        r2 = java.util.Arrays.deepToString(r2);	 Catch:{ RuntimeException -> 0x0294 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0294 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0294 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0294 }
        if (r5 == 0) goto L_0x01f0;
    L_0x01e7:
        r1 = z;	 Catch:{ RuntimeException -> 0x0294 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0294 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0294 }
    L_0x01f0:
        if (r0 == 0) goto L_0x0206;
    L_0x01f2:
        r1 = z;	 Catch:{ RuntimeException -> 0x0296 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0296 }
        r0 = r0.contains(r1);	 Catch:{ RuntimeException -> 0x0296 }
        if (r0 == 0) goto L_0x0206;
    L_0x01fd:
        r0 = z;	 Catch:{ RuntimeException -> 0x0296 }
        r1 = 16;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0296 }
        r8.setFlashMode(r0);	 Catch:{ RuntimeException -> 0x0296 }
    L_0x0206:
        r0 = r12.e;	 Catch:{ RuntimeException -> 0x0222 }
        r0.setParameters(r8);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r12.e;	 Catch:{ RuntimeException -> 0x0222 }
        r0.startPreview();	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r12.e;	 Catch:{ RuntimeException -> 0x0222 }
        r1 = r12.b;	 Catch:{ RuntimeException -> 0x0222 }
        r0.autoFocus(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r12.a;	 Catch:{ RuntimeException -> 0x0222 }
        if (r0 == 0) goto L_0x001a;
    L_0x021b:
        r0 = r12.a;	 Catch:{ RuntimeException -> 0x0222 }
        r0.b();	 Catch:{ RuntimeException -> 0x0222 }
        goto L_0x001a;
    L_0x0222:
        r0 = move-exception;
        throw r0;
    L_0x0224:
        r0 = 0;
        goto L_0x003b;
    L_0x0227:
        r3 = r1;
        goto L_0x006a;
    L_0x022a:
        r1 = r2;
        goto L_0x006c;
    L_0x022d:
        r0 = move-exception;
        throw r0;
    L_0x022f:
        r1 = 0;
        goto L_0x00b4;
    L_0x0232:
        r1 = 0;
        if (r5 == 0) goto L_0x00dc;
    L_0x0235:
        r1 = 90;
        if (r5 == 0) goto L_0x00dc;
    L_0x0239:
        r1 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        if (r5 == 0) goto L_0x00dc;
    L_0x023d:
        r1 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r2 = r1;
        goto L_0x00dd;
    L_0x0242:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x027d }
        r3.<init>();	 Catch:{ RuntimeException -> 0x027d }
        r4 = z;	 Catch:{ RuntimeException -> 0x027d }
        r6 = 6;
        r4 = r4[r6];	 Catch:{ RuntimeException -> 0x027d }
        r3 = r3.append(r4);	 Catch:{ RuntimeException -> 0x027d }
        r2 = r2.toString();	 Catch:{ RuntimeException -> 0x027d }
        r2 = r3.append(r2);	 Catch:{ RuntimeException -> 0x027d }
        r2 = r2.toString();	 Catch:{ RuntimeException -> 0x027d }
        com.whatsapp.util.Log.e(r2);	 Catch:{ RuntimeException -> 0x027d }
        if (r5 == 0) goto L_0x013e;
    L_0x0262:
        r2 = z;	 Catch:{ RuntimeException -> 0x027f }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x027f }
        r8.set(r2, r1);	 Catch:{ RuntimeException -> 0x027f }
        r1 = z;	 Catch:{ RuntimeException -> 0x027f }
        r2 = 19;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x027f }
        if (r0 == 0) goto L_0x0281;
    L_0x0273:
        r0 = z;	 Catch:{ RuntimeException -> 0x027f }
        r2 = 5;
        r0 = r0[r2];	 Catch:{ RuntimeException -> 0x027f }
    L_0x0278:
        r8.set(r1, r0);
        goto L_0x013e;
    L_0x027d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x027f }
    L_0x027f:
        r0 = move-exception;
        throw r0;
    L_0x0281:
        r0 = z;
        r2 = 21;
        r0 = r0[r2];
        goto L_0x0278;
    L_0x0288:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x028a }
    L_0x028a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x028c }
    L_0x028c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x028e }
    L_0x028e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0290 }
    L_0x0290:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0292 }
    L_0x0292:
        r0 = move-exception;
        throw r0;
    L_0x0294:
        r0 = move-exception;
        throw r0;
    L_0x0296:
        r0 = move-exception;
        throw r0;
    L_0x0298:
        r3 = r2;
        r4 = r1;
        goto L_0x00d8;
    L_0x029c:
        r4 = r3;
        goto L_0x0067;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.QrCodeView.f():void");
    }

    static void d(QrCodeView qrCodeView) {
        qrCodeView.c();
    }

    private void c() {
        Log.i(z[0]);
        if (this.e != null) {
            try {
                this.e.stopPreview();
            } catch (Throwable e) {
                Log.c(z[2], e);
            }
            try {
                this.e.release();
            } catch (Throwable e2) {
                Log.c(z[1], e2);
            }
            this.e = null;
        }
    }

    static Camera b(QrCodeView qrCodeView) {
        return qrCodeView.e;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        try {
            if (this.e == null) {
                Log.e(z[31]);
                e();
                return;
            }
            try {
                if (this.d.getSurface() == null) {
                    Log.e(z[29]);
                    e();
                    return;
                }
                try {
                    if (!surfaceHolder.isCreating()) {
                        this.e.stopPreview();
                    }
                    this.e.setPreviewDisplay(surfaceHolder);
                    f();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Throwable e2) {
                    this.e.release();
                    this.e = null;
                    Log.b(z[28], e2);
                    e();
                } catch (Throwable e22) {
                    this.e.release();
                    this.e = null;
                    Log.b(z[30], e22);
                    e();
                }
            } catch (RuntimeException e3) {
                throw e3;
            }
        } catch (RuntimeException e32) {
            throw e32;
        }
    }

    private void e() {
        try {
            if (this.a != null) {
                this.a.a();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        c();
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    static void e(QrCodeView qrCodeView) {
        qrCodeView.b();
    }

    static Camera a(QrCodeView qrCodeView, Camera camera) {
        qrCodeView.e = camera;
        return camera;
    }

    public QrCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static void a(QrCodeView qrCodeView) {
        qrCodeView.e();
    }

    public QrCodeView(Context context) {
        this(context, null);
    }

    public QrCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new p(this);
        this.d = getHolder();
        this.d.addCallback(this);
        this.d.setType(3);
    }

    public Camera a() {
        return this.e;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        b();
    }

    public Size d() {
        return this.c;
    }

    public void setCameraCallback(n nVar) {
        this.a = nVar;
    }

    static SurfaceHolder c(QrCodeView qrCodeView) {
        return qrCodeView.d;
    }
}
