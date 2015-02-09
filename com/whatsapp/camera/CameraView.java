package com.whatsapp.camera;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.Size;
import android.media.MediaRecorder;
import android.os.Build.VERSION;
import android.support.v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class CameraView extends SurfaceView implements Callback, OnGestureListener, OnScaleGestureListener {
    private static String[] f;
    private static String[] p;
    private static final String[] z;
    private Size a;
    private Camera b;
    private int c;
    private MediaRecorder d;
    private boolean e;
    private boolean g;
    private boolean h;
    private ScaleGestureDetector i;
    private z j;
    private boolean k;
    private int l;
    private GestureDetectorCompat m;
    private String n;
    private List o;
    private SurfaceHolder q;
    private float r;
    private Size s;

    private void a() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: com.whatsapp.camera.CameraView.a():void
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
        r2 = 0;
        r1 = com.whatsapp.camera.CameraActivity.l;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4.r = r0;
        r0 = 0;
        r4.c = r0;
        r4.o = r2;
        r0 = r4.b;
        if (r0 != 0) goto L_0x0060;
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 9;
        if (r0 < r2) goto L_0x0030;
        r0 = r4.l;
        r2 = android.hardware.Camera.getNumberOfCameras();
        if (r0 < r2) goto L_0x0026;
        r0 = android.hardware.Camera.getNumberOfCameras();
        r0 = r0 + -1;
        r4.l = r0;
        r0 = r4.l;
        r0 = android.hardware.Camera.open(r0);
        r4.b = r0;
        if (r1 == 0) goto L_0x0036;
        r0 = android.hardware.Camera.open();
        r4.b = r0;
        r0 = r4.b;
        r2 = new com.whatsapp.camera.j;
        r2.<init>(r4);
        r0.setErrorCallback(r2);
        return;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        r2 = r4.b;
        if (r2 == 0) goto L_0x004f;
        r2 = r4.b;
        r2.release();
        r2 = 0;
        r4.b = r2;
        r2 = z;
        r3 = 87;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r4.k();
        if (r1 == 0) goto L_0x0040;
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 8;
        if (r0 < r2) goto L_0x0083;
        r0 = r4.b;
        r0.reconnect();
        goto L_0x0040;
        r0 = move-exception;
        r2 = r4.b;
        r2.release();
        r2 = 0;
        r4.b = r2;
        r2 = z;
        r3 = 88;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        r4.k();
        if (r1 == 0) goto L_0x0040;
        r0 = r4.b;
        r0.release();
        r0 = 0;
        r4.b = r0;
        r4.a();
        goto L_0x0040;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraView.a():void");
    }

    static void k(CameraView cameraView) {
        cameraView.d();
    }

    static boolean b(CameraView cameraView) {
        return cameraView.h;
    }

    static {
        String[] strArr = new String[108];
        String str = "\u00183";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 119;
                        break;
                    case ay.f /*1*/:
                        i4 = 93;
                        break;
                    case ay.n /*2*/:
                        i4 = 114;
                        break;
                    case ay.p /*3*/:
                        i4 = 39;
                        break;
                    default:
                        i4 = 73;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0016(\u0006H";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u0018;\u0014";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u0016(\u0006H";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u00183";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "W/\u001dS(\u00038H";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u00004\u001cC&\u0000";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X2\u0000N,\u0019)\u0013S \u00183RC \u0004-\u001eF0M";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "W>\u0013J,\u0005<H";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003-\u0000B?\u001e8\u0005\u0007*\u00160\u0017U(W4\u0001\u0007'\u00021\u001e";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003-\u0000B?\u001e8\u0005\u0007:\u0002-\u0002H;\u00038\u0016\u0007/\u001b<\u0001Os\u0019(\u001eK";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "W;\u0000H'\u0003g";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003-\u0000B?\u001e8\u0005\u0007'\u0018}\bH&\u001a";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "\u00004\u001cC&\u0000";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003-\u0000B?\u001e8\u0005\u0007:\u0012)RA%\u0016.\u001a\u0007$\u00189\u0017\u001d";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "\u0018/\u001bB'\u0003<\u0006N&\u0019";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003-\u0000B?\u001e8\u0005\u0007$\u0016%-]&\u00180H";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003-\u0000B?\u001e8\u0005\u00073\u00182\u001f\u0007;\u0016)\u001bH:M";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003-\u0000B?\u001e8\u0005\b:\u0012)\u0016N:\u00071\u0013^&\u00054\u0017I=\u0016)\u001bH'W";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "\u00072\u0000S;\u00164\u0006";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003-\u0000B?\u001e8\u0005\u0007&\u0007)\u001bJ(\u001b}\u0002U,\u00014\u0017Pi\u00044\bBs";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "\u0004<\u001fT<\u0019:";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "W-\u0000B?\u001e8\u0005\u001d";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "\u00142\u001cS \u0019(\u001dR:Z-\u001bD=\u0002/\u0017";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003-\u0000B?\u001e8\u0005\u0007:\u0002-\u0002H;\u00038\u0016\u0007/\u001b<\u0001Os";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "W>\u0013J,\u0005<H";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003-\u0000B?\u001e8\u0005\u00079\u001e>\u0006R;\u0012}\u0001N3\u0012}";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003-\u0000B?\u001e8\u0005\u0007:\u0002-\u0002H;\u00038\u0016\u0007/\u0018>\u0007Ts\u0019(\u001eK";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003-\u0000B?\u001e8\u0005\u0007:\u0002-\u0002H;\u00038\u0016\u0007/\u0018>\u0007Ts";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "\u001b<\u001cC:\u0014<\u0002B";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "\u00142\u001cS \u0019(\u001dR:Z-\u001bD=\u0002/\u0017";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003-\u0000B?\u001e8\u0005\u00079\u001e>\u0006R;\u0012.\u001b],\u0004g";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "\u00052\u0006F=\u001e2\u001c";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003-\u0000B?\u001e8\u0005\u0007-\u001e.\u0002K(\u000eg";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X0\u0017F:\u0002/\u0017\u0007&\u0007)\u001bJ(\u001b-\u0000B?\u001e8\u0005T \r8RT*\u00161\u0017x$\u001e3H";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "W0\u0017F:\u0002/\u0017Cs";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "W.\u0011F%\u0012\u0002\u001fF1M";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X0\u0017F:\u0002/\u0017\b9\u00058\u0004N,\u0000.\u001b],\u0004}";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X0\u0017F:\u0002/\u0017\u0007&\u0007)\u001bJ(\u001b-\u0000B?\u001e8\u0005T \r8RT*\u00161\u0017x$\u001e3H";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X0\u0017F:\u0002/\u0017\u0007;\u0012.\u0007K=M";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "\u00004\u001cC&\u0000";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X0\u0017F:\u0002/\u0017\u0007&\u0007)\u001bJ(\u001b-\u0000B?\u001e8\u0005T \r8H";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "W<\u0001W,\u0014)RC \u0011;H";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "W.\u0011F%\u0012\u0002\u001fF1M";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X;\u0013K%\u0015<\u0011L:\u0002-\u0002H;\u00038\u0016W;\u0012+\u001bB>\u00044\bB:";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "[}";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "\u00142\u001f\t>\u001f<\u0006T(\u0007--W;\u0012;\u0017U,\u0019>\u0017T";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X3\u0017_=\u0014<\u001fB;\u0016}\u0017U;\u0018/RT,\u0003)\u001bI.W-\u0000B?\u001e8\u0005\u0007-\u001e.\u0002K(\u000e";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "\u0014<\u001fB;\u0016\u0002\u001bI-\u0012%";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X3\u0017_=\u0014<\u001fB;\u0016}";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X3\u0017_=\u0014<\u001fB;\u0016";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "\u00142\u001f\t>\u001f<\u0006T(\u0007--W;\u0012;\u0017U,\u0019>\u0017T";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X3\u0017_=W;\u001eF:\u001f}\u001fH-\u0012g";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "\u00111\u0013T!(0\u001dC,";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u0007T,W-\u0000H/\u001e1\u0017\u001d";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X-\u0000B9\u0016/\u0017Q \u00138\u001d\u0007/\u00052\u001cSs";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u0011F'\u00192\u0006\u0007/\u001e3\u0016\u00079\u00058\u0004N,\u0000}\u0001N3\u0012";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u0001R9\u00072\u0000S,\u0013}\u0014H*\u0002.H\u0007'\u00021\u001e";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u0002U&\u00114\u001eBs";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u0001R9\u00072\u0000S,\u0013}\u0002U,\u00014\u0017Pi\u00044\bB:M";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "\u0014<\u001fx$\u00189\u0017";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u0007T,W-\u0000B/\u0012/\u0000B-W+\u001bC,\u0018}\u0001N3\u0012";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "W+\u001bC,\u0018\u001f\u001bS\u001b\u0016)\u0017\u001d";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "\u0004<\u001fT<\u0019:";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u0002U,\u00118\u0000U,\u0013}\u0004N-\u00122RW;\u0012+\u001bB>W.\u001b],W4\u0001\u0007'\u00021\u001e";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}RB;\u00052\u0000\u0007:\u0012)\u0006N'\u0010}\u0002U,\u00014\u0017Pi\u00134\u0001W%\u0016$";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u0002U,\u00118\u0000U,\u0013}\u0004N-\u00122RW;\u0012+\u001bB>W.\u001b],M";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "\u001e3\u0014N'\u001e)\u000b";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u0001R9\u00072\u0000S,\u0013}\u0014H*\u0002.H";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u0000B:\u0003<\u0000Si\u0007/\u0017Q \u0012*";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "W+\u001bC,\u0018\u001b\u0000F$\u0012\u000f\u0013S,M";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i2] = str;
                    i2 = 72;
                    str = "\u00142\u001cS \u0019(\u001dR:Z+\u001bC,\u0018";
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i2] = str;
                    i2 = 73;
                    str = "W-\u0000B?\u001e8\u0005\u001d";
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u0001R9\u00072\u0000S,\u0013}\u0004N-\u00122RT \r8\u0001\u001d";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u0011F'\u00192\u0006\u0007/\u001e3\u0016\u00079\u00058\u0004N,\u0000}\u0001N3\u0012}\u0006O(\u0003}\u001bTi\u001b<\u0000@,\u0005}\u0006O(\u0019}\u0004N-\u00122";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = "W<\u0007C \u0018\u001e\u001dC,\u0014g";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u0011F'\u00192\u0006\u0007/\u001e3\u0016\u0007?\u001e9\u0017Hi\u00044\bB";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i2] = str;
                    i2 = 78;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u001cHi\u0007/\u001dA \u001b8";
                    i = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i2] = str;
                    i2 = 79;
                    str = "\u00142\u001cS \u0019(\u001dR:Z+\u001bC,\u0018";
                    i = 78;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i2] = str;
                    i2 = 80;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X}\u001cHi\u0004(\u0002W&\u0005)\u0017Ci\u00014\u0016B&W.\u001b],\u0004";
                    i = 79;
                    strArr2 = strArr3;
                    break;
                case 79:
                    strArr2[i2] = str;
                    i2 = 81;
                    str = "W;\u001bK,12\u0000J(\u0003g";
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case 80:
                    strArr2[i2] = str;
                    i2 = 82;
                    str = "W+\u001bC,\u0018\u001e\u001dC,\u0014g";
                    i = 81;
                    strArr2 = strArr3;
                    break;
                case 81:
                    strArr2[i2] = str;
                    i2 = 83;
                    str = "W+\u001bC,\u0018\u001f\u001bS\u001b\u0016)\u0017\u001d";
                    i = 82;
                    strArr2 = strArr3;
                    break;
                case 82:
                    strArr2[i2] = str;
                    i2 = 84;
                    str = "\u001e3\u0014N'\u001e)\u000b";
                    i = 83;
                    strArr2 = strArr3;
                    break;
                case 83:
                    strArr2[i2] = str;
                    i2 = 85;
                    str = "?\t1";
                    i = 84;
                    strArr2 = strArr3;
                    break;
                case 84:
                    strArr2[i2] = str;
                    i2 = 86;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006H9\u00014\u0016B&\u0014<\u0002S<\u00058R";
                    i = 85;
                    strArr2 = strArr3;
                    break;
                case 85:
                    strArr2[i2] = str;
                    i2 = 87;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003>\u0013J,\u0005<RB;\u00052\u0000\u0007&\u00078\u001cN'\u0010}\u0011F$\u0012/\u0013";
                    i = 86;
                    strArr2 = strArr3;
                    break;
                case 86:
                    strArr2[i2] = str;
                    i2 = 88;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003>\u0013J,\u0005<RB;\u00052\u0000\u0007;\u0012>\u001dI'\u0012>\u0006N'\u0010}\u0011F$\u0012/\u0013";
                    i = 87;
                    strArr2 = strArr3;
                    break;
                case 87:
                    strArr2[i2] = str;
                    i2 = 89;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0007U/\u0016>\u0017D!\u00163\u0015B-M}\u001cHi\u0004(\u0000A(\u00148";
                    i = 88;
                    strArr2 = strArr3;
                    break;
                case 88:
                    strArr2[i2] = str;
                    i2 = 90;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0007U/\u0016>\u0017D!\u00163\u0015B-M}\u0017U;\u0018/RT,\u0003)\u001bI.W-\u0000B?\u001e8\u0005\u0007-\u001e.\u0002K(\u000e";
                    i = 89;
                    strArr2 = strArr3;
                    break;
                case 89:
                    strArr2[i2] = str;
                    i2 = 91;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0007U/\u0016>\u0017D!\u00163\u0015B-W";
                    i = 90;
                    strArr2 = strArr3;
                    break;
                case 90:
                    strArr2[i2] = str;
                    i2 = 92;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0007U/\u0016>\u0017D!\u00163\u0015B-M}\u001cHi\u0014<\u001fB;\u0016";
                    i = 91;
                    strArr2 = strArr3;
                    break;
                case 91:
                    strArr2[i2] = str;
                    i2 = 93;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003+\u001bC,\u0018>\u0013W=\u0002/\u0017\u0007/\u00164\u001eB-";
                    i = 92;
                    strArr2 = strArr3;
                    break;
                case 92:
                    strArr2[i2] = str;
                    i2 = 94;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003+\u001bC,\u0018>\u0013W=\u0002/\u0017\u0007/\u00164\u001eB-";
                    i = 93;
                    strArr2 = strArr3;
                    break;
                case 93:
                    strArr2[i2] = str;
                    i2 = 95;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006F;\u0003}\u0004N-\u00122";
                    i = 94;
                    strArr2 = strArr3;
                    break;
                case 94:
                    strArr2[i2] = str;
                    i2 = 96;
                    str = "\u00142\u001f\t>\u001f<\u0006T(\u0007--W;\u0012;\u0017U,\u0019>\u0017T";
                    i = 95;
                    strArr2 = strArr3;
                    break;
                case 95:
                    strArr2[i2] = str;
                    i2 = 97;
                    str = "\u0014<\u001fB;\u0016\u0002\u001bI-\u0012%";
                    i = 96;
                    strArr2 = strArr3;
                    break;
                case 96:
                    strArr2[i2] = str;
                    i2 = 98;
                    str = "\u00111\u0013T!(0\u001dC,";
                    i = 97;
                    strArr2 = strArr3;
                    break;
                case 97:
                    strArr2[i2] = str;
                    i2 = 99;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006H9\u0014<\u001fB;\u0016}\u0017U;\u0018/RT=\u0018-\u0002N'\u0010}\u0011F$\u0012/\u0013\u00079\u00058\u0004N,\u0000";
                    i = 98;
                    strArr2 = strArr3;
                    break;
                case 98:
                    strArr2[i2] = str;
                    i2 = 100;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006H9\u0014<\u001fB;\u0016";
                    i = 99;
                    strArr2 = strArr3;
                    break;
                case 99:
                    strArr2[i2] = str;
                    i2 = 101;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X.\u0006H9\u0014<\u001fB;\u0016}\u0017U;\u0018/RU,\u001b8\u0013T,\u001e3\u0015\u0007*\u00160\u0017U(";
                    i = 100;
                    strArr2 = strArr3;
                    break;
                case 100:
                    strArr2[i2] = str;
                    i2 = 102;
                    str = "\u0016(\u0006H";
                    i = 101;
                    strArr2 = strArr3;
                    break;
                case 101:
                    strArr2[i2] = str;
                    i2 = 103;
                    str = "\u0016(\u0006H";
                    i = 102;
                    strArr2 = strArr3;
                    break;
                case 102:
                    strArr2[i2] = str;
                    i2 = 104;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X)\u0013L,\u00074\u0011S<\u00058]T=\u0016/\u0006";
                    i = 103;
                    strArr2 = strArr3;
                    break;
                case 103:
                    strArr2[i2] = str;
                    i2 = 105;
                    str = "\u00074\u0011S<\u00058-D(\u001b1\u0010F*\u001c}\u001bTi\u0019(\u001eK";
                    i = 104;
                    strArr2 = strArr3;
                    break;
                case 104:
                    strArr2[i2] = str;
                    i2 = 106;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X)\u0013L,\u00074\u0011S<\u00058RD(\u001a8\u0000Fi\u001e.RI<\u001b1";
                    i = 105;
                    strArr2 = strArr3;
                    break;
                case 105:
                    strArr2[i2] = str;
                    i2 = 107;
                    str = "\u0014<\u001fB;\u0016+\u001bB>X)\u0013L,\u00074\u0011S<\u00058RA(\u001e1\u0017C";
                    i = 106;
                    strArr2 = strArr3;
                    break;
                case 106:
                    strArr2[i2] = str;
                    z = strArr3;
                    strArr = new String[11];
                    str = "0\t_npBmG";
                    i = 107;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 107:
                    strArr2[i2] = str;
                    str = "0\t_npBmD";
                    i = 108;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case 108:
                    strArr2[i2] = str;
                    str = "0\t_npBmG`";
                    i = 109;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case 109:
                    strArr2[i2] = str;
                    str = "$\u001a:\n\u0000DnE";
                    i = 110;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i2] = str;
                    str = "$\u001a:\n\u0004NlK";
                    i = 111;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "$\u001e:\n\u0000BiG";
                    i = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "$\r:\n\u0005@oB";
                    i = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "$\u001e:\n\u001bNjB";
                    i = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "0\t_npBmJ";
                    i = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "$\u001a:\n\u0007GiG";
                    i = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "$\u001e_\u0017}2";
                    i = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i2] = str;
                    p = strArr3;
                    strArr = new String[3];
                    str = "0\t_npFdG";
                    i = 118;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 118:
                    strArr2[i2] = str;
                    str = "0\t_npFdB";
                    i = 119;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i2] = str;
                    str = "0\t_npFd@";
                    i = 120;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i2] = str;
                    f = strArr3;
                default:
                    strArr2[i2] = str;
                    str = "\u0018;\u0014";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private void k() {
        try {
            if (this.j != null) {
                this.j.a();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
        r14_this = this;
        r13 = 8;
        r12 = 2;
        r5 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r2 = 1;
        r1 = 0;
        r8 = com.whatsapp.camera.CameraActivity.l;
        r3 = r14.getWidth();
        r4 = r14.getHeight();
        r0 = r14.b;	 Catch:{ RuntimeException -> 0x0023 }
        if (r0 != 0) goto L_0x0025;
    L_0x0016:
        r0 = z;	 Catch:{ RuntimeException -> 0x0023 }
        r1 = 10;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0023 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x0023 }
        r14.k();	 Catch:{ RuntimeException -> 0x0023 }
    L_0x0022:
        return;
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        r0 = r14.getContext();
        r6 = z;
        r7 = 14;
        r6 = r6[r7];
        r0 = r0.getSystemService(r6);
        r0 = (android.view.WindowManager) r0;
        r9 = r0.getDefaultDisplay();
        r10 = r9.getOrientation();
        if (r10 == 0) goto L_0x0041;
    L_0x003f:
        if (r10 != r12) goto L_0x03a0;
    L_0x0041:
        r0 = r2;
    L_0x0042:
        r6 = r14.b;
        r11 = r6.getParameters();
        r6 = r11.getSupportedPreviewSizes();
        if (r6 != 0) goto L_0x0451;
    L_0x004e:
        r6 = r14.g();
        r7 = r6;
    L_0x0053:
        if (r0 == 0) goto L_0x03a3;
    L_0x0055:
        r6 = r4;
    L_0x0056:
        if (r0 == 0) goto L_0x03a6;
    L_0x0058:
        r3 = a(r7, r6, r3);	 Catch:{ RuntimeException -> 0x03a9 }
        r14.s = r3;	 Catch:{ RuntimeException -> 0x03a9 }
        r3 = r14.n;	 Catch:{ RuntimeException -> 0x03a9 }
        if (r3 != 0) goto L_0x0068;
    L_0x0062:
        r3 = r11.getFlashMode();	 Catch:{ RuntimeException -> 0x03a9 }
        r14.n = r3;	 Catch:{ RuntimeException -> 0x03a9 }
    L_0x0068:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r6 = 21;
        r4 = r4[r6];
        r3 = r3.append(r4);
        r4 = r14.s;
        r4 = r4.width;
        r3 = r3.append(r4);
        r4 = "x";
        r3 = r3.append(r4);
        r4 = r14.s;
        r4 = r4.height;
        r3 = r3.append(r4);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r14.e = r1;
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 9;
        if (r3 < r4) goto L_0x00b1;
    L_0x009c:
        r4 = new android.hardware.Camera$CameraInfo;
        r4.<init>();
        r3 = r14.l;	 Catch:{ RuntimeException -> 0x03ab }
        android.hardware.Camera.getCameraInfo(r3, r4);	 Catch:{ RuntimeException -> 0x03ab }
        r3 = r4.facing;	 Catch:{ RuntimeException -> 0x03ab }
        if (r3 != r2) goto L_0x03ad;
    L_0x00aa:
        r3 = r2;
    L_0x00ab:
        r14.e = r3;
        r3 = r4.orientation;
        if (r8 == 0) goto L_0x044e;
    L_0x00b1:
        if (r10 == 0) goto L_0x00b5;
    L_0x00b3:
        if (r10 != r12) goto L_0x00bf;
    L_0x00b5:
        r4 = r9.getWidth();
        r3 = r9.getHeight();
        if (r8 == 0) goto L_0x00c7;
    L_0x00bf:
        r4 = r9.getHeight();
        r3 = r9.getWidth();
    L_0x00c7:
        if (r4 <= r3) goto L_0x00cb;
    L_0x00c9:
        if (r8 == 0) goto L_0x044b;
    L_0x00cb:
        r3 = 90;
        r6 = r3;
    L_0x00ce:
        switch(r10) {
            case 0: goto L_0x03b0;
            case 1: goto L_0x03b2;
            case 2: goto L_0x03b6;
            case 3: goto L_0x03ba;
            default: goto L_0x00d1;
        };
    L_0x00d1:
        r3 = r1;
    L_0x00d2:
        r4 = r14.e;
        if (r4 == 0) goto L_0x00e0;
    L_0x00d6:
        r4 = r6 + r3;
        r4 = r4 % 360;
        r4 = 360 - r4;
        r4 = r4 % 360;
        if (r8 == 0) goto L_0x00e6;
    L_0x00e0:
        r4 = r6 - r3;
        r4 = r4 + 360;
        r4 = r4 % 360;
    L_0x00e6:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r9 = z;
        r10 = 34;
        r9 = r9[r10];
        r7 = r7.append(r9);
        r3 = r7.append(r3);
        r7 = z;
        r9 = 26;
        r7 = r7[r9];
        r3 = r3.append(r7);
        r3 = r3.append(r6);
        r6 = z;
        r7 = 23;
        r6 = r6[r7];
        r3 = r3.append(r6);
        r3 = r3.append(r4);
        r6 = z;
        r7 = 12;
        r6 = r6[r7];
        r3 = r3.append(r6);
        r6 = r14.e;
        r3 = r3.append(r6);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r3 = android.os.Build.VERSION.SDK_INT;
        if (r3 < r13) goto L_0x03df;
    L_0x0130:
        r3 = r14.b;	 Catch:{ RuntimeException -> 0x03be }
        r3.setDisplayOrientation(r4);	 Catch:{ RuntimeException -> 0x03be }
    L_0x0135:
        r0 = r14.s;
        r0 = r0.width;
        r3 = r14.s;
        r3 = r3.height;
        r11.setPreviewSize(r0, r3);
        r0 = r11.getSupportedFocusModes();
        if (r0 == 0) goto L_0x0448;
    L_0x0146:
        r3 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0406 }
        r3.<init>();	 Catch:{ RuntimeException -> 0x0406 }
        r4 = z;	 Catch:{ RuntimeException -> 0x0406 }
        r6 = 29;
        r4 = r4[r6];	 Catch:{ RuntimeException -> 0x0406 }
        r3 = r3.append(r4);	 Catch:{ RuntimeException -> 0x0406 }
        r4 = r0.toArray();	 Catch:{ RuntimeException -> 0x0406 }
        r4 = java.util.Arrays.deepToString(r4);	 Catch:{ RuntimeException -> 0x0406 }
        r3 = r3.append(r4);	 Catch:{ RuntimeException -> 0x0406 }
        r3 = r3.toString();	 Catch:{ RuntimeException -> 0x0406 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ RuntimeException -> 0x0406 }
        r3 = z;	 Catch:{ RuntimeException -> 0x0406 }
        r4 = 24;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x0406 }
        r0 = r0.contains(r3);	 Catch:{ RuntimeException -> 0x0406 }
        if (r0 == 0) goto L_0x0445;
    L_0x0174:
        r0 = z;
        r1 = 31;
        r0 = r0[r1];
        r11.setFocusMode(r0);
        if (r8 == 0) goto L_0x0188;
    L_0x017f:
        r0 = z;	 Catch:{ RuntimeException -> 0x0408 }
        r1 = 28;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0408 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0408 }
    L_0x0188:
        r0 = r11.getSupportedFlashModes();
        if (r0 == 0) goto L_0x01b2;
    L_0x018e:
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x040a }
        r1.<init>();	 Catch:{ RuntimeException -> 0x040a }
        r3 = z;	 Catch:{ RuntimeException -> 0x040a }
        r4 = 25;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x040a }
        r1 = r1.append(r3);	 Catch:{ RuntimeException -> 0x040a }
        r3 = r0.toArray();	 Catch:{ RuntimeException -> 0x040a }
        r3 = java.util.Arrays.deepToString(r3);	 Catch:{ RuntimeException -> 0x040a }
        r1 = r1.append(r3);	 Catch:{ RuntimeException -> 0x040a }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x040a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x040a }
        if (r8 == 0) goto L_0x01bb;
    L_0x01b2:
        r1 = z;	 Catch:{ RuntimeException -> 0x040a }
        r3 = 11;
        r1 = r1[r3];	 Catch:{ RuntimeException -> 0x040a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x040a }
    L_0x01bb:
        r1 = r14.n;	 Catch:{ RuntimeException -> 0x040c }
        if (r1 == 0) goto L_0x01ea;
    L_0x01bf:
        if (r0 == 0) goto L_0x01ea;
    L_0x01c1:
        r1 = r14.n;	 Catch:{ RuntimeException -> 0x0410 }
        r0 = r0.contains(r1);	 Catch:{ RuntimeException -> 0x0410 }
        if (r0 == 0) goto L_0x01ea;
    L_0x01c9:
        r0 = r14.n;	 Catch:{ RuntimeException -> 0x0410 }
        r11.setFlashMode(r0);	 Catch:{ RuntimeException -> 0x0410 }
        r0 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0410 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x0410 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0410 }
        r3 = 15;
        r1 = r1[r3];	 Catch:{ RuntimeException -> 0x0410 }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0410 }
        r1 = r14.n;	 Catch:{ RuntimeException -> 0x0410 }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0410 }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x0410 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0410 }
    L_0x01ea:
        r7 = r11.getSupportedPictureSizes();
        r0 = new com.whatsapp.camera.am;
        r0.<init>(r14);
        java.util.Collections.sort(r7, r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 32;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = a(r7);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r1 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        r0 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r3 = r14.s;
        if (r3 == 0) goto L_0x027c;
    L_0x021c:
        r3 = r14.s;
        r3 = r3.height;
        r3 = (float) r3;
        r4 = r14.s;
        r4 = r4.width;
        r4 = (float) r4;
        r9 = r3 / r4;
        r10 = r7.iterator();
        r3 = r0;
        r4 = r1;
        r1 = r5;
    L_0x022f:
        r0 = r10.hasNext();
        if (r0 == 0) goto L_0x0437;
    L_0x0235:
        r0 = r10.next();
        r0 = (android.hardware.Camera.Size) r0;
        r6 = r0.width;	 Catch:{ RuntimeException -> 0x0412 }
        r12 = r0.height;	 Catch:{ RuntimeException -> 0x0412 }
        r6 = r6 * r12;
        r12 = 10000000; // 0x989680 float:1.4012985E-38 double:4.9406565E-317;
        if (r6 >= r12) goto L_0x0440;
    L_0x0245:
        r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r6 == 0) goto L_0x0256;
    L_0x0249:
        r6 = r0.width;	 Catch:{ RuntimeException -> 0x0416 }
        r12 = r0.height;	 Catch:{ RuntimeException -> 0x0416 }
        r6 = r6 * r12;
        r6 = r6 * 2;
        r12 = r4 * r3;
        if (r6 >= r12) goto L_0x0256;
    L_0x0254:
        if (r8 == 0) goto L_0x0437;
    L_0x0256:
        r6 = r0.height;
        r6 = (float) r6;
        r12 = r0.width;
        r12 = (float) r12;
        r6 = r6 / r12;
        r6 = r6 - r9;
        r6 = java.lang.Math.abs(r6);
        r12 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r12 >= 0) goto L_0x0440;
    L_0x0266:
        r3 = r0.height;
        r4 = r0.width;
        r0 = 1028443341; // 0x3d4ccccd float:0.05 double:5.081185235E-315;
        r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x043b;
    L_0x0271:
        if (r8 == 0) goto L_0x0437;
    L_0x0273:
        r0 = r6;
        r1 = r3;
        r3 = r4;
    L_0x0276:
        if (r8 == 0) goto L_0x0432;
    L_0x0278:
        r0 = r1;
        r1 = r3;
    L_0x027a:
        if (r8 == 0) goto L_0x02a9;
    L_0x027c:
        r4 = r7.iterator();
        r3 = r1;
        r1 = r0;
    L_0x0282:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x042e;
    L_0x0288:
        r0 = r4.next();
        r0 = (android.hardware.Camera.Size) r0;
        r5 = r0.width;	 Catch:{ RuntimeException -> 0x0418 }
        r6 = r0.height;	 Catch:{ RuntimeException -> 0x0418 }
        r5 = r5 * r6;
        r6 = r3 * r1;
        if (r5 <= r6) goto L_0x042a;
    L_0x0297:
        r5 = r0.width;	 Catch:{ RuntimeException -> 0x0418 }
        r6 = r0.height;	 Catch:{ RuntimeException -> 0x0418 }
        r5 = r5 * r6;
        r6 = 10000000; // 0x989680 float:1.4012985E-38 double:4.9406565E-317;
        if (r5 >= r6) goto L_0x042a;
    L_0x02a1:
        r1 = r0.height;
        r3 = r0.width;
        r0 = r1;
        r1 = r3;
    L_0x02a7:
        if (r8 == 0) goto L_0x0426;
    L_0x02a9:
        r3 = r14.e;	 Catch:{ RuntimeException -> 0x041a }
        if (r3 == 0) goto L_0x02dd;
    L_0x02ad:
        r3 = z;	 Catch:{ RuntimeException -> 0x041c }
        r4 = 22;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x041c }
        r4 = android.os.Build.MANUFACTURER;	 Catch:{ RuntimeException -> 0x041c }
        r3 = r3.equals(r4);	 Catch:{ RuntimeException -> 0x041c }
        if (r3 == 0) goto L_0x02dd;
    L_0x02bb:
        r3 = f;	 Catch:{ RuntimeException -> 0x041c }
        r4 = android.os.Build.MODEL;	 Catch:{ RuntimeException -> 0x041c }
        r3 = com.whatsapp.util.au.a(r3, r4);	 Catch:{ RuntimeException -> 0x041c }
        if (r3 == 0) goto L_0x02dd;
    L_0x02c5:
        r3 = new android.hardware.Camera$Size;
        r4 = r14.b;
        r4.getClass();
        r5 = 1280; // 0x500 float:1.794E-42 double:6.324E-321;
        r6 = 720; // 0x2d0 float:1.009E-42 double:3.557E-321;
        r3.<init>(r4, r5, r6);
        r4 = r7.contains(r3);
        if (r4 == 0) goto L_0x02dd;
    L_0x02d9:
        r1 = r3.width;
        r0 = r3.height;
    L_0x02dd:
        r3 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x041e }
        r3.<init>();	 Catch:{ RuntimeException -> 0x041e }
        r4 = z;	 Catch:{ RuntimeException -> 0x041e }
        r5 = 27;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x041e }
        r3 = r3.append(r4);	 Catch:{ RuntimeException -> 0x041e }
        r3 = r3.append(r1);	 Catch:{ RuntimeException -> 0x041e }
        r4 = "x";
        r3 = r3.append(r4);	 Catch:{ RuntimeException -> 0x041e }
        r3 = r3.append(r0);	 Catch:{ RuntimeException -> 0x041e }
        r3 = r3.toString();	 Catch:{ RuntimeException -> 0x041e }
        com.whatsapp.util.Log.i(r3);	 Catch:{ RuntimeException -> 0x041e }
        r11.setPictureSize(r1, r0);	 Catch:{ RuntimeException -> 0x041e }
        r0 = r14.b;	 Catch:{ RuntimeException -> 0x041e }
        r0.setParameters(r11);	 Catch:{ RuntimeException -> 0x041e }
        r0 = r14.b;	 Catch:{ RuntimeException -> 0x041e }
        r0.startPreview();	 Catch:{ RuntimeException -> 0x041e }
        if (r2 != 0) goto L_0x031a;
    L_0x0310:
        r0 = r14.b;	 Catch:{ RuntimeException -> 0x041e }
        r1 = new com.whatsapp.camera.al;	 Catch:{ RuntimeException -> 0x041e }
        r1.<init>(r14);	 Catch:{ RuntimeException -> 0x041e }
        r0.autoFocus(r1);	 Catch:{ RuntimeException -> 0x041e }
    L_0x031a:
        r0 = 0;
        r14.c = r0;	 Catch:{ RuntimeException -> 0x0420 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x0420 }
        if (r0 < r13) goto L_0x0390;
    L_0x0321:
        r0 = r14.b;	 Catch:{ RuntimeException -> 0x0422 }
        r0 = r0.getParameters();	 Catch:{ RuntimeException -> 0x0422 }
        r0 = r0.isZoomSupported();	 Catch:{ RuntimeException -> 0x0422 }
        if (r0 == 0) goto L_0x0387;
    L_0x032d:
        r0 = r14.b;	 Catch:{ RuntimeException -> 0x0424 }
        r0 = r0.getParameters();	 Catch:{ RuntimeException -> 0x0424 }
        r0 = r0.getMaxZoom();	 Catch:{ RuntimeException -> 0x0424 }
        r14.c = r0;	 Catch:{ RuntimeException -> 0x0424 }
        r0 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0424 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x0424 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0424 }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0424 }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0424 }
        r1 = r14.c;	 Catch:{ RuntimeException -> 0x0424 }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0424 }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x0424 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0424 }
        r0 = r14.b;	 Catch:{ RuntimeException -> 0x0424 }
        r0 = r0.getParameters();	 Catch:{ RuntimeException -> 0x0424 }
        r0 = r0.getZoomRatios();	 Catch:{ RuntimeException -> 0x0424 }
        r14.o = r0;	 Catch:{ RuntimeException -> 0x0424 }
        r0 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0424 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x0424 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0424 }
        r2 = 18;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0424 }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0424 }
        r1 = r14.o;	 Catch:{ RuntimeException -> 0x0424 }
        r1 = r1.toArray();	 Catch:{ RuntimeException -> 0x0424 }
        r1 = java.util.Arrays.deepToString(r1);	 Catch:{ RuntimeException -> 0x0424 }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0424 }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x0424 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0424 }
        if (r8 == 0) goto L_0x0390;
    L_0x0387:
        r0 = z;	 Catch:{ RuntimeException -> 0x0424 }
        r1 = 13;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0424 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0424 }
    L_0x0390:
        r0 = 1;
        r14.k = r0;	 Catch:{ RuntimeException -> 0x039e }
        r0 = r14.j;	 Catch:{ RuntimeException -> 0x039e }
        if (r0 == 0) goto L_0x0022;
    L_0x0397:
        r0 = r14.j;	 Catch:{ RuntimeException -> 0x039e }
        r0.b();	 Catch:{ RuntimeException -> 0x039e }
        goto L_0x0022;
    L_0x039e:
        r0 = move-exception;
        throw r0;
    L_0x03a0:
        r0 = r1;
        goto L_0x0042;
    L_0x03a3:
        r6 = r3;
        goto L_0x0056;
    L_0x03a6:
        r3 = r4;
        goto L_0x0058;
    L_0x03a9:
        r0 = move-exception;
        throw r0;
    L_0x03ab:
        r0 = move-exception;
        throw r0;
    L_0x03ad:
        r3 = r1;
        goto L_0x00ab;
    L_0x03b0:
        if (r8 == 0) goto L_0x00d1;
    L_0x03b2:
        r3 = 90;
        if (r8 == 0) goto L_0x00d2;
    L_0x03b6:
        r3 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        if (r8 == 0) goto L_0x00d2;
    L_0x03ba:
        r3 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        goto L_0x00d2;
    L_0x03be:
        r3 = move-exception;
        r6 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x03fb }
        r6.<init>();	 Catch:{ RuntimeException -> 0x03fb }
        r7 = z;	 Catch:{ RuntimeException -> 0x03fb }
        r9 = 19;
        r7 = r7[r9];	 Catch:{ RuntimeException -> 0x03fb }
        r6 = r6.append(r7);	 Catch:{ RuntimeException -> 0x03fb }
        r3 = r3.toString();	 Catch:{ RuntimeException -> 0x03fb }
        r3 = r6.append(r3);	 Catch:{ RuntimeException -> 0x03fb }
        r3 = r3.toString();	 Catch:{ RuntimeException -> 0x03fb }
        com.whatsapp.util.Log.e(r3);	 Catch:{ RuntimeException -> 0x03fb }
        if (r8 == 0) goto L_0x0135;
    L_0x03df:
        r3 = z;	 Catch:{ RuntimeException -> 0x03fd }
        r6 = 33;
        r3 = r3[r6];	 Catch:{ RuntimeException -> 0x03fd }
        r11.set(r3, r4);	 Catch:{ RuntimeException -> 0x03fd }
        r3 = z;	 Catch:{ RuntimeException -> 0x03fd }
        r4 = 16;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x03fd }
        if (r0 == 0) goto L_0x03ff;
    L_0x03f0:
        r0 = z;	 Catch:{ RuntimeException -> 0x03fd }
        r4 = 20;
        r0 = r0[r4];	 Catch:{ RuntimeException -> 0x03fd }
    L_0x03f6:
        r11.set(r3, r0);
        goto L_0x0135;
    L_0x03fb:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03fd }
    L_0x03fd:
        r0 = move-exception;
        throw r0;
    L_0x03ff:
        r0 = z;
        r4 = 30;
        r0 = r0[r4];
        goto L_0x03f6;
    L_0x0406:
        r0 = move-exception;
        throw r0;
    L_0x0408:
        r0 = move-exception;
        throw r0;
    L_0x040a:
        r0 = move-exception;
        throw r0;
    L_0x040c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x040e }
    L_0x040e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0410 }
    L_0x0410:
        r0 = move-exception;
        throw r0;
    L_0x0412:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0414 }
    L_0x0414:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0416 }
    L_0x0416:
        r0 = move-exception;
        throw r0;
    L_0x0418:
        r0 = move-exception;
        throw r0;
    L_0x041a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x041c }
    L_0x041c:
        r0 = move-exception;
        throw r0;
    L_0x041e:
        r0 = move-exception;
        throw r0;
    L_0x0420:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0422 }
    L_0x0422:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0424 }
    L_0x0424:
        r0 = move-exception;
        throw r0;
    L_0x0426:
        r3 = r1;
        r1 = r0;
        goto L_0x0282;
    L_0x042a:
        r0 = r1;
        r1 = r3;
        goto L_0x02a7;
    L_0x042e:
        r0 = r1;
        r1 = r3;
        goto L_0x02a9;
    L_0x0432:
        r4 = r3;
        r3 = r1;
        r1 = r0;
        goto L_0x022f;
    L_0x0437:
        r0 = r3;
        r1 = r4;
        goto L_0x027a;
    L_0x043b:
        r0 = r6;
        r1 = r3;
        r3 = r4;
        goto L_0x0276;
    L_0x0440:
        r0 = r1;
        r1 = r3;
        r3 = r4;
        goto L_0x0276;
    L_0x0445:
        r2 = r1;
        goto L_0x0188;
    L_0x0448:
        r2 = r1;
        goto L_0x017f;
    L_0x044b:
        r6 = r1;
        goto L_0x00ce;
    L_0x044e:
        r6 = r3;
        goto L_0x00ce;
    L_0x0451:
        r7 = r6;
        goto L_0x0053;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraView.d():void");
    }

    public String j() {
        try {
            if (this.b == null) {
                return null;
            }
            List l = l();
            if (l == null) {
                return null;
            }
            try {
                if (l.isEmpty()) {
                    return null;
                }
                try {
                    if (this.n == null) {
                        this.n = this.b.getParameters().getFlashMode();
                    }
                    int indexOf = l.indexOf(this.n);
                    if (indexOf < 0) {
                        return null;
                    }
                    this.n = (String) l.get((indexOf + 1) % l.size());
                    Log.i(z[53] + this.n);
                    Parameters parameters = this.b.getParameters();
                    parameters.setFlashMode(this.n);
                    this.b.setParameters(parameters);
                    getContext().getSharedPreferences(z[52], 0).edit().putString(z[54], this.n).commit();
                    return this.n;
                } catch (RuntimeException e) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        try {
            if (this.b == null) {
                Log.e(z[92]);
                k();
                return;
            }
            try {
                if (this.q.getSurface() == null) {
                    Log.e(z[89]);
                    k();
                } else if (!this.h) {
                    try {
                        if (!surfaceHolder.isCreating()) {
                            this.b.stopPreview();
                        }
                        this.b.setPreviewDisplay(surfaceHolder);
                        d();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Throwable e2) {
                        this.b.release();
                        this.b = null;
                        Log.b(z[90], e2);
                        k();
                    } catch (Throwable e22) {
                        this.b.release();
                        this.b = null;
                        Log.b(z[91], e22);
                        k();
                    }
                }
            } catch (RuntimeException e3) {
                throw e3;
            }
        } catch (RuntimeException e32) {
            throw e32;
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        try {
            if (this.k && this.b != null) {
                this.b.cancelAutoFocus();
                boolean z = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (VERSION.SDK_INT >= 14) {
                    Rect rect = new Rect((int) (x - (100.0f / 2.0f)), (int) (y - (100.0f / 2.0f)), (int) ((100.0f / 2.0f) + x), (int) ((100.0f / 2.0f) + y));
                    Rect rect2 = new Rect();
                    try {
                        rect2.set(((rect.left * 2000) / getWidth()) - 1000, ((rect.top * 2000) / getHeight()) - 1000, ((rect.right * 2000) / getWidth()) - 1000, ((rect.bottom * 2000) / getHeight()) - 1000);
                        if (rect2.left < -1000) {
                            rect2.left = -1000;
                        }
                        try {
                            if (rect2.top < -1000) {
                                rect2.top = -1000;
                            }
                            try {
                                if (rect2.right > 1000) {
                                    rect2.right = 1000;
                                }
                                try {
                                    if (rect2.bottom > 1000) {
                                        rect2.bottom = 1000;
                                    }
                                    try {
                                        if (Math.abs(rect2.top - rect2.bottom) < 10) {
                                            rect2.top -= 5;
                                            rect2.bottom += 5;
                                            if (rect2.top < -1000) {
                                                rect2.top = -1000;
                                            }
                                            try {
                                                if (rect2.top > 1000) {
                                                    rect2.top = 1000;
                                                }
                                            } catch (RuntimeException e) {
                                                throw e;
                                            }
                                        }
                                        try {
                                            if (Math.abs(rect2.left - rect2.right) < 10) {
                                                rect2.left -= 5;
                                                rect2.right += 5;
                                                if (rect2.left < -1000) {
                                                    rect2.left = -1000;
                                                }
                                                try {
                                                    if (rect2.right < 1000) {
                                                        rect2.right = 1000;
                                                    }
                                                } catch (RuntimeException e2) {
                                                    throw e2;
                                                }
                                            }
                                            Parameters parameters = this.b.getParameters();
                                            if (parameters.getMaxNumFocusAreas() > 0) {
                                                List arrayList = new ArrayList();
                                                arrayList.add(new Area(rect2, 1000));
                                                parameters.setFocusAreas(arrayList);
                                                arrayList = parameters.getSupportedFocusModes();
                                                if (arrayList != null) {
                                                    try {
                                                        if (arrayList.contains(z[103])) {
                                                            parameters.setFocusMode(z[102]);
                                                        }
                                                    } catch (RuntimeException e22) {
                                                        throw e22;
                                                    }
                                                }
                                                this.b.setParameters(parameters);
                                                z = true;
                                            }
                                        } catch (RuntimeException e222) {
                                            throw e222;
                                        } catch (RuntimeException e2222) {
                                            throw e2222;
                                        }
                                    } catch (RuntimeException e22222) {
                                        throw e22222;
                                    } catch (RuntimeException e222222) {
                                        throw e222222;
                                    }
                                } catch (RuntimeException e2222222) {
                                    throw e2222222;
                                }
                            } catch (RuntimeException e22222222) {
                                throw e22222222;
                            }
                        } catch (RuntimeException e222222222) {
                            throw e222222222;
                        }
                    } catch (RuntimeException e2222222222) {
                        throw e2222222222;
                    }
                }
                if (z) {
                    try {
                        this.j.a(x, y);
                    } catch (RuntimeException e22222222222) {
                        throw e22222222222;
                    }
                }
                this.b.autoFocus(new d(this));
            }
            return true;
        } catch (RuntimeException e222222222222) {
            throw e222222222222;
        }
    }

    public int setZoomLevel(int i) {
        try {
            if (i > this.c) {
                return 0;
            }
            try {
                if (VERSION.SDK_INT < 8) {
                    return 0;
                }
                Parameters parameters = this.b.getParameters();
                try {
                    parameters.setZoom(i);
                    this.b.setParameters(parameters);
                    if (this.o != null) {
                        return this.o.size() >= i ? ((Integer) this.o.get(i)).intValue() : 0;
                    } else {
                        return 0;
                    }
                } catch (RuntimeException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (RuntimeException e22) {
                throw e22;
            }
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    public void e() {
        try {
            this.d.stop();
        } catch (RuntimeException e) {
            Log.w(z[86] + e.toString());
        }
        f();
        this.b.lock();
        this.h = false;
        this.a = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r15, int r16) {
        /*
        r14_this = this;
        r8 = com.whatsapp.camera.CameraActivity.l;
        super.onMeasure(r15, r16);	 Catch:{ RuntimeException -> 0x0011 }
        r0 = r14.b;	 Catch:{ RuntimeException -> 0x0011 }
        if (r0 != 0) goto L_0x000c;
    L_0x0009:
        r14.a();	 Catch:{ RuntimeException -> 0x0011 }
    L_0x000c:
        r0 = r14.b;	 Catch:{ RuntimeException -> 0x0013 }
        if (r0 != 0) goto L_0x0015;
    L_0x0010:
        return;
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r2 = r14.getMeasuredWidth();
        r3 = r14.getMeasuredHeight();
        r0 = r14.a;
        if (r0 == 0) goto L_0x0025;
    L_0x0021:
        r0 = r14.a;
        if (r8 == 0) goto L_0x007c;
    L_0x0025:
        r0 = r14.b;
        r0 = r0.getParameters();
        r0 = r0.getSupportedPreviewSizes();
        if (r0 != 0) goto L_0x0210;
    L_0x0031:
        r0 = r14.g();
        r1 = r0;
    L_0x0036:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r5 = 38;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = a(r1);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r14.getContext();
        r4 = z;
        r5 = 41;
        r4 = r4[r5];
        r0 = r0.getSystemService(r4);
        r0 = (android.view.WindowManager) r0;
        r0 = r0.getDefaultDisplay();
        r0 = r0.getOrientation();
        if (r0 == 0) goto L_0x0071;
    L_0x006e:
        r4 = 2;
        if (r0 != r4) goto L_0x01ec;
    L_0x0071:
        r0 = 1;
    L_0x0072:
        if (r0 == 0) goto L_0x01ef;
    L_0x0074:
        r4 = r3;
    L_0x0075:
        if (r0 == 0) goto L_0x01f2;
    L_0x0077:
        r0 = r2;
    L_0x0078:
        r0 = a(r1, r4, r0);
    L_0x007c:
        r4 = (double) r2;
        r6 = (double) r3;
        r4 = r4 / r6;
        r1 = r0.width;
        r6 = (double) r1;
        r1 = r0.height;
        r10 = (double) r1;
        r6 = r6 / r10;
        r4 = r4 - r6;
        r4 = java.lang.Math.abs(r4);
        r6 = (double) r3;
        r10 = (double) r2;
        r6 = r6 / r10;
        r1 = r0.width;
        r10 = (double) r1;
        r1 = r0.height;
        r12 = (double) r1;
        r10 = r10 / r12;
        r6 = r6 - r10;
        r6 = java.lang.Math.abs(r6);
        r4 = java.lang.Math.min(r4, r6);
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x01f5 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x01f5 }
        r6 = z;	 Catch:{ RuntimeException -> 0x01f5 }
        r7 = 42;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x01f5 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x01f5 }
        r6 = r0.width;	 Catch:{ RuntimeException -> 0x01f5 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x01f5 }
        r6 = "x";
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x01f5 }
        r6 = r0.height;	 Catch:{ RuntimeException -> 0x01f5 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x01f5 }
        r6 = z;	 Catch:{ RuntimeException -> 0x01f5 }
        r7 = 36;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x01f5 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x01f5 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x01f5 }
        r6 = "x";
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x01f5 }
        r1 = r1.append(r3);	 Catch:{ RuntimeException -> 0x01f5 }
        r6 = z;	 Catch:{ RuntimeException -> 0x01f5 }
        r7 = 43;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x01f5 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x01f5 }
        r1 = r1.append(r4);	 Catch:{ RuntimeException -> 0x01f5 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x01f5 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x01f5 }
        r6 = 4591870180066957722; // 0x3fb999999999999a float:-1.5881868E-23 double:0.1;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x0010;
    L_0x00f5:
        if (r2 <= r3) goto L_0x01f9;
    L_0x00f7:
        r1 = 1;
        r4 = r1;
    L_0x00f9:
        r1 = r0.width;	 Catch:{ RuntimeException -> 0x01fd }
        r5 = r0.height;	 Catch:{ RuntimeException -> 0x01fd }
        if (r1 <= r5) goto L_0x01ff;
    L_0x00ff:
        r1 = 1;
    L_0x0100:
        if (r4 != r1) goto L_0x0163;
    L_0x0102:
        r4 = (double) r2;
        r1 = r0.width;
        r6 = (double) r1;
        r4 = r4 / r6;
        r6 = (double) r3;
        r1 = r0.height;
        r10 = (double) r1;
        r6 = r6 / r10;
        r4 = java.lang.Math.min(r4, r6);
        r6 = (double) r2;
        r1 = r0.width;
        r10 = (double) r1;
        r6 = r6 / r10;
        r10 = (double) r3;
        r1 = r0.height;
        r12 = (double) r1;
        r10 = r10 / r12;
        r6 = java.lang.Math.max(r6, r10);
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0202 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0202 }
        r9 = z;	 Catch:{ RuntimeException -> 0x0202 }
        r10 = 39;
        r9 = r9[r10];	 Catch:{ RuntimeException -> 0x0202 }
        r1 = r1.append(r9);	 Catch:{ RuntimeException -> 0x0202 }
        r1 = r1.append(r4);	 Catch:{ RuntimeException -> 0x0202 }
        r9 = z;	 Catch:{ RuntimeException -> 0x0202 }
        r10 = 37;
        r9 = r9[r10];	 Catch:{ RuntimeException -> 0x0202 }
        r1 = r1.append(r9);	 Catch:{ RuntimeException -> 0x0202 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x0202 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0202 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0202 }
        r10 = r6 / r4;
        r12 = 4607632778762754458; // 0x3ff199999999999a float:-1.5881868E-23 double:1.1;
        r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r1 <= 0) goto L_0x0206;
    L_0x0151:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x0204 }
        r9 = 9;
        if (r1 < r9) goto L_0x0206;
    L_0x0157:
        r1 = r0.width;
        r6 = (double) r1;
        r6 = r6 * r4;
        r6 = (int) r6;
        r1 = r0.height;
        r10 = (double) r1;
        r4 = r4 * r10;
        r1 = (int) r4;
        if (r8 == 0) goto L_0x020d;
    L_0x0163:
        r4 = (double) r2;
        r1 = r0.height;
        r6 = (double) r1;
        r4 = r4 / r6;
        r6 = (double) r3;
        r1 = r0.width;
        r8 = (double) r1;
        r6 = r6 / r8;
        r4 = java.lang.Math.min(r4, r6);
        r6 = (double) r2;
        r1 = r0.height;
        r8 = (double) r1;
        r6 = r6 / r8;
        r2 = (double) r3;
        r1 = r0.width;
        r8 = (double) r1;
        r2 = r2 / r8;
        r2 = java.lang.Math.max(r6, r2);
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0209 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0209 }
        r6 = z;	 Catch:{ RuntimeException -> 0x0209 }
        r7 = 35;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x0209 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x0209 }
        r1 = r1.append(r4);	 Catch:{ RuntimeException -> 0x0209 }
        r6 = z;	 Catch:{ RuntimeException -> 0x0209 }
        r7 = 44;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x0209 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x0209 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0209 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0209 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0209 }
        r6 = r2 / r4;
        r8 = 4607632778762754458; // 0x3ff199999999999a float:-1.5881868E-23 double:1.1;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 <= 0) goto L_0x01b9;
    L_0x01b2:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x020b }
        r6 = 9;
        if (r1 < r6) goto L_0x01b9;
    L_0x01b8:
        r2 = r4;
    L_0x01b9:
        r1 = r0.height;
        r4 = (double) r1;
        r4 = r4 * r2;
        r1 = (int) r4;
        r0 = r0.width;
        r4 = (double) r0;
        r2 = r2 * r4;
        r0 = (int) r2;
    L_0x01c3:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 40;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r3 = "x";
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r14.setMeasuredDimension(r1, r0);
        goto L_0x0010;
    L_0x01ec:
        r0 = 0;
        goto L_0x0072;
    L_0x01ef:
        r4 = r2;
        goto L_0x0075;
    L_0x01f2:
        r0 = r3;
        goto L_0x0078;
    L_0x01f5:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01f7 }
    L_0x01f7:
        r0 = move-exception;
        throw r0;
    L_0x01f9:
        r1 = 0;
        r4 = r1;
        goto L_0x00f9;
    L_0x01fd:
        r0 = move-exception;
        throw r0;
    L_0x01ff:
        r1 = 0;
        goto L_0x0100;
    L_0x0202:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0204 }
    L_0x0204:
        r0 = move-exception;
        throw r0;
    L_0x0206:
        r4 = r6;
        goto L_0x0157;
    L_0x0209:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x020b }
    L_0x020b:
        r0 = move-exception;
        throw r0;
    L_0x020d:
        r0 = r1;
        r1 = r6;
        goto L_0x01c3;
    L_0x0210:
        r1 = r0;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraView.onMeasure(int, int):void");
    }

    public boolean m() {
        return this.h;
    }

    public void b(File file) {
        try {
            if (a(file)) {
                try {
                    Log.i(z[95]);
                    this.d.start();
                    this.h = true;
                    return;
                } catch (Throwable e) {
                    Log.b(z[94], e);
                    f();
                    k();
                    if (CameraActivity.l == 0) {
                        return;
                    }
                }
            }
            Log.e(z[93]);
            f();
            k();
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    static Camera a(CameraView cameraView, Camera camera) {
        cameraView.b = camera;
        return camera;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    private List g() {
        Log.i(z[45]);
        List arrayList = new ArrayList();
        Camera camera = this.b;
        camera.getClass();
        arrayList.add(new Size(camera, 640, 480));
        return arrayList;
    }

    static Camera j(CameraView cameraView) {
        return cameraView.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.util.List r6) {
        /*
        r1 = com.whatsapp.camera.CameraActivity.l;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r6.iterator();
    L_0x000b:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0034;
    L_0x0011:
        r0 = r3.next();
        r0 = (android.hardware.Camera.Size) r0;
        r4 = r0.width;
        r4 = r2.append(r4);
        r5 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r4 = r4.append(r5);
        r0 = r0.height;
        r0 = r4.append(r0);
        r4 = z;
        r5 = 46;
        r4 = r4[r5];
        r0.append(r4);
        if (r1 == 0) goto L_0x000b;
    L_0x0034:
        r0 = r2.length();	 Catch:{ RuntimeException -> 0x0049 }
        r1 = 1;
        if (r0 <= r1) goto L_0x0044;
    L_0x003b:
        r0 = r2.length();	 Catch:{ RuntimeException -> 0x0049 }
        r0 = r0 + -2;
        r2.deleteCharAt(r0);	 Catch:{ RuntimeException -> 0x0049 }
    L_0x0044:
        r0 = r2.toString();
        return r0;
    L_0x0049:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraView.a(java.util.List):java.lang.String");
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        b();
        f();
    }

    static void e(CameraView cameraView) {
        cameraView.k();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int n() {
        /*
        r9_this = this;
        r3 = 90;
        r8 = 9;
        r1 = 1;
        r2 = 0;
        r4 = com.whatsapp.camera.CameraActivity.l;
        r0 = r9.getContext();
        r5 = z;
        r6 = 7;
        r5 = r5[r6];
        r0 = r0.getSystemService(r5);
        r0 = (android.view.WindowManager) r0;
        r5 = r0.getDefaultDisplay();
        r6 = r5.getOrientation();
        r9.e = r2;
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < r8) goto L_0x003a;
    L_0x0025:
        r7 = new android.hardware.Camera$CameraInfo;
        r7.<init>();
        r0 = r9.l;	 Catch:{ RuntimeException -> 0x009f }
        android.hardware.Camera.getCameraInfo(r0, r7);	 Catch:{ RuntimeException -> 0x009f }
        r0 = r7.facing;	 Catch:{ RuntimeException -> 0x009f }
        if (r0 != r1) goto L_0x00a1;
    L_0x0033:
        r0 = r1;
    L_0x0034:
        r9.e = r0;
        r0 = r7.orientation;
        if (r4 == 0) goto L_0x00b2;
    L_0x003a:
        if (r6 == 0) goto L_0x003f;
    L_0x003c:
        r0 = 2;
        if (r6 != r0) goto L_0x0049;
    L_0x003f:
        r1 = r5.getWidth();
        r0 = r5.getHeight();
        if (r4 == 0) goto L_0x0051;
    L_0x0049:
        r1 = r5.getHeight();
        r0 = r5.getWidth();
    L_0x0051:
        if (r1 <= r0) goto L_0x0055;
    L_0x0053:
        if (r4 == 0) goto L_0x00b0;
    L_0x0055:
        r1 = r3;
    L_0x0056:
        switch(r6) {
            case 0: goto L_0x00a3;
            case 1: goto L_0x00a5;
            case 2: goto L_0x00a7;
            case 3: goto L_0x00ab;
            default: goto L_0x0059;
        };
    L_0x0059:
        r0 = r9.e;
        if (r0 == 0) goto L_0x0065;
    L_0x005d:
        r0 = r1 + r2;
        r0 = r0 + 360;
        r0 = r0 % 360;
        if (r4 == 0) goto L_0x006b;
    L_0x0065:
        r0 = r1 - r2;
        r0 = r0 + 360;
        r0 = r0 % 360;
    L_0x006b:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 8;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r2 = r3.append(r2);
        r3 = z;
        r3 = r3[r8];
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r0);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        return r0;
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r0 = r2;
        goto L_0x0034;
    L_0x00a3:
        if (r4 == 0) goto L_0x0059;
    L_0x00a5:
        if (r4 == 0) goto L_0x00ae;
    L_0x00a7:
        r2 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        if (r4 == 0) goto L_0x0059;
    L_0x00ab:
        r2 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        goto L_0x0059;
    L_0x00ae:
        r2 = r3;
        goto L_0x0059;
    L_0x00b0:
        r1 = r2;
        goto L_0x0056;
    L_0x00b2:
        r1 = r0;
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraView.n():int");
    }

    public String i() {
        return this.n;
    }

    private void b() {
        Log.i(z[100]);
        if (this.b != null) {
            try {
                this.b.stopPreview();
            } catch (Throwable e) {
                Log.c(z[99], e);
            }
            try {
                this.b.release();
            } catch (Throwable e2) {
                Log.c(z[101], e2);
            }
            this.b = null;
        }
    }

    static void d(CameraView cameraView) {
        cameraView.a();
    }

    static z g(CameraView cameraView) {
        return cameraView.j;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            this.m.onTouchEvent(motionEvent);
            if (this.i != null) {
                this.i.onTouchEvent(motionEvent);
            }
            return true;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static SurfaceHolder c(CameraView cameraView) {
        return cameraView.q;
    }

    public CameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = 1.0f;
        SharedPreferences sharedPreferences = context.getSharedPreferences(z[96], 0);
        try {
            this.l = sharedPreferences.getInt(z[97], 0);
            this.n = sharedPreferences.getString(z[98], null);
            this.q = getHolder();
            this.q.addCallback(this);
            this.q.setType(3);
            this.m = new GestureDetectorCompat(context, this, null);
            if (VERSION.SDK_INT >= 8) {
                this.i = new ScaleGestureDetector(context, this);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public CameraView(Context context) {
        this(context, null);
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        try {
            if (this.b != null) {
                if (this.c != 0) {
                    this.j.a(this.r);
                }
            }
            return true;
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public void c() {
        try {
            Log.i(z[51]);
            if (VERSION.SDK_INT >= 9 && Camera.getNumberOfCameras() > 1) {
                this.l = (this.l + 1) % Camera.getNumberOfCameras();
                b();
                a();
                requestLayout();
                try {
                    this.b.setPreviewDisplay(this.q);
                    d();
                    getContext().getSharedPreferences(z[47], 0).edit().putInt(z[49], this.l).commit();
                } catch (Throwable e) {
                    this.b.release();
                    this.b = null;
                    Log.b(z[50], e);
                    k();
                } catch (Throwable e2) {
                    this.b.release();
                    this.b = null;
                    Log.b(z[48], e2);
                    k();
                }
            }
        } catch (RuntimeException e3) {
            throw e3;
        }
    }

    static boolean i(CameraView cameraView) {
        return cameraView.e;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        try {
            if (this.b != null) {
                if (this.c != 0) {
                    float scaleFactor = scaleGestureDetector.getScaleFactor();
                    try {
                        this.r = scaleFactor * (this.r * scaleFactor);
                        if (this.r < 1.0f) {
                            this.r = 1.0f;
                        }
                        this.j.c(this.r);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
            }
            return true;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.io.File r25) {
        /*
        r24_this = this;
        r13 = com.whatsapp.camera.CameraActivity.l;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 56;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r24;
        r3 = r0.e;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = new android.media.MediaRecorder;
        r2.<init>();
        r0 = r24;
        r0.d = r2;
        r2 = 0;
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0057 }
        r4 = 8;
        if (r3 < r4) goto L_0x0486;
    L_0x0030:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0057 }
        r3 = 11;
        if (r2 < r3) goto L_0x007a;
    L_0x0036:
        r0 = r24;
        r2 = r0.l;	 Catch:{ IOException -> 0x0059 }
        r3 = 4;
        r2 = android.media.CamcorderProfile.hasProfile(r2, r3);	 Catch:{ IOException -> 0x0059 }
        if (r2 == 0) goto L_0x005b;
    L_0x0041:
        r0 = r24;
        r2 = r0.l;
        r3 = 4;
        r9 = android.media.CamcorderProfile.get(r2, r3);
    L_0x004a:
        if (r9 != 0) goto L_0x0092;
    L_0x004c:
        r2 = z;	 Catch:{ IOException -> 0x0090 }
        r3 = 78;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0090 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0090 }
        r2 = 0;
    L_0x0056:
        return r2;
    L_0x0057:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0059 }
    L_0x0059:
        r2 = move-exception;
        throw r2;
    L_0x005b:
        r0 = r24;
        r2 = r0.l;
        r3 = 5;
        r2 = android.media.CamcorderProfile.hasProfile(r2, r3);
        if (r2 == 0) goto L_0x0070;
    L_0x0066:
        r0 = r24;
        r2 = r0.l;
        r3 = 5;
        r9 = android.media.CamcorderProfile.get(r2, r3);
        goto L_0x004a;
    L_0x0070:
        r0 = r24;
        r2 = r0.l;
        r3 = 1;
        r9 = android.media.CamcorderProfile.get(r2, r3);
        goto L_0x004a;
    L_0x007a:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 9;
        if (r2 < r3) goto L_0x008a;
    L_0x0080:
        r0 = r24;
        r2 = r0.l;
        r3 = 1;
        r9 = android.media.CamcorderProfile.get(r2, r3);
        goto L_0x004a;
    L_0x008a:
        r2 = 1;
        r9 = android.media.CamcorderProfile.get(r2);
        goto L_0x004a;
    L_0x0090:
        r2 = move-exception;
        throw r2;
    L_0x0092:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 59;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.videoFrameWidth;
        r2 = r2.append(r3);
        r3 = "x";
        r2 = r2.append(r3);
        r3 = r9.videoFrameHeight;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 82;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.videoCodec;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 76;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.audioCodec;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 81;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.fileFormat;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 71;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.videoFrameRate;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 83;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.videoBitRate;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r0 = r24;
        r2 = r0.b;
        r14 = r2.getParameters();
        r2 = r14.getSupportedPreviewSizes();
        if (r2 != 0) goto L_0x05a0;
    L_0x0118:
        r2 = r24.g();
        r3 = r2;
    L_0x011d:
        r2 = 0;
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 11;
        if (r4 < r5) goto L_0x0128;
    L_0x0124:
        r2 = r14.getSupportedVideoSizes();
    L_0x0128:
        if (r2 != 0) goto L_0x059d;
    L_0x012a:
        r6 = r3;
    L_0x012b:
        if (r6 == 0) goto L_0x0133;
    L_0x012d:
        r2 = r6.isEmpty();	 Catch:{ IOException -> 0x013f }
        if (r2 == 0) goto L_0x0143;
    L_0x0133:
        r2 = z;	 Catch:{ IOException -> 0x0141 }
        r3 = 80;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0141 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0141 }
        r2 = 0;
        goto L_0x0056;
    L_0x013f:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0141 }
    L_0x0141:
        r2 = move-exception;
        throw r2;
    L_0x0143:
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r2 = 0;
        r5 = android.os.Build.VERSION.SDK_INT;
        r7 = 11;
        if (r5 < r7) goto L_0x0599;
    L_0x014d:
        r2 = r14.getPreferredPreviewSizeForVideo();
        if (r2 == 0) goto L_0x018e;
    L_0x0153:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x022a }
        r5.<init>();	 Catch:{ IOException -> 0x022a }
        r7 = z;	 Catch:{ IOException -> 0x022a }
        r8 = 67;
        r7 = r7[r8];	 Catch:{ IOException -> 0x022a }
        r5 = r5.append(r7);	 Catch:{ IOException -> 0x022a }
        r7 = r2.width;	 Catch:{ IOException -> 0x022a }
        r5 = r5.append(r7);	 Catch:{ IOException -> 0x022a }
        r7 = "x";
        r5 = r5.append(r7);	 Catch:{ IOException -> 0x022a }
        r7 = r2.height;	 Catch:{ IOException -> 0x022a }
        r5 = r5.append(r7);	 Catch:{ IOException -> 0x022a }
        r5 = r5.toString();	 Catch:{ IOException -> 0x022a }
        com.whatsapp.util.Log.i(r5);	 Catch:{ IOException -> 0x022a }
        r5 = r2.width;	 Catch:{ IOException -> 0x022a }
        r7 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        if (r5 != r7) goto L_0x0187;
    L_0x0181:
        r5 = r2.height;	 Catch:{ IOException -> 0x022c }
        r7 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        if (r5 == r7) goto L_0x0595;
    L_0x0187:
        r4 = r2.width;
        r5 = r2.height;
        r4 = r4 * r5;
        if (r13 == 0) goto L_0x0595;
    L_0x018e:
        r5 = z;	 Catch:{ IOException -> 0x022e }
        r7 = 65;
        r5 = r5[r7];	 Catch:{ IOException -> 0x022e }
        com.whatsapp.util.Log.w(r5);	 Catch:{ IOException -> 0x022e }
        r5 = r4;
        r4 = r2;
    L_0x0199:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r7 = z;
        r8 = 74;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r7 = a(r6);
        r2 = r2.append(r7);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r7 = z;
        r8 = 60;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r7 = a(r3);
        r2 = r2.append(r7);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        r7 = r6.iterator();
        r6 = r2;
    L_0x01db:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x021c;
    L_0x01e1:
        r2 = r7.next();
        r2 = (android.hardware.Camera.Size) r2;
        r8 = r2.height;	 Catch:{ IOException -> 0x0230 }
        r10 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        if (r8 > r10) goto L_0x058f;
    L_0x01ed:
        r8 = r2.width;	 Catch:{ IOException -> 0x0230 }
        r10 = 720; // 0x2d0 float:1.009E-42 double:3.557E-321;
        if (r8 > r10) goto L_0x058f;
    L_0x01f3:
        r8 = r2.height;	 Catch:{ IOException -> 0x0232 }
        r10 = r9.videoFrameHeight;	 Catch:{ IOException -> 0x0232 }
        if (r8 > r10) goto L_0x058f;
    L_0x01f9:
        r8 = r2.width;	 Catch:{ IOException -> 0x0234 }
        r10 = r9.videoFrameWidth;	 Catch:{ IOException -> 0x0234 }
        if (r8 > r10) goto L_0x058f;
    L_0x01ff:
        if (r6 != 0) goto L_0x0204;
    L_0x0201:
        if (r13 == 0) goto L_0x0219;
    L_0x0203:
        r6 = r2;
    L_0x0204:
        r8 = r2.height;	 Catch:{ IOException -> 0x0238 }
        r10 = r6.height;	 Catch:{ IOException -> 0x0238 }
        if (r8 <= r10) goto L_0x020d;
    L_0x020a:
        if (r13 == 0) goto L_0x0219;
    L_0x020c:
        r6 = r2;
    L_0x020d:
        r8 = r2.height;	 Catch:{ IOException -> 0x023a }
        r10 = r6.height;	 Catch:{ IOException -> 0x023a }
        if (r8 != r10) goto L_0x058f;
    L_0x0213:
        r8 = r2.width;	 Catch:{ IOException -> 0x023c }
        r10 = r6.width;	 Catch:{ IOException -> 0x023c }
        if (r8 <= r10) goto L_0x058f;
    L_0x0219:
        if (r13 == 0) goto L_0x0592;
    L_0x021b:
        r6 = r2;
    L_0x021c:
        if (r6 != 0) goto L_0x0240;
    L_0x021e:
        r2 = z;	 Catch:{ IOException -> 0x023e }
        r3 = 77;
        r2 = r2[r3];	 Catch:{ IOException -> 0x023e }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x023e }
        r2 = 0;
        goto L_0x0056;
    L_0x022a:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x022c }
    L_0x022c:
        r2 = move-exception;
        throw r2;
    L_0x022e:
        r2 = move-exception;
        throw r2;
    L_0x0230:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0232 }
    L_0x0232:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0234 }
    L_0x0234:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0236 }
    L_0x0236:
        r2 = move-exception;
        throw r2;
    L_0x0238:
        r2 = move-exception;
        throw r2;
    L_0x023a:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x023c }
    L_0x023c:
        r2 = move-exception;
        throw r2;
    L_0x023e:
        r2 = move-exception;
        throw r2;
    L_0x0240:
        r7 = 0;
        r8 = r3.iterator();
    L_0x0245:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x058c;
    L_0x024b:
        r2 = r8.next();
        r2 = (android.hardware.Camera.Size) r2;
        r10 = r6.equals(r2);
        if (r10 == 0) goto L_0x0245;
    L_0x0257:
        r0 = r24;
        r7 = r0.e;	 Catch:{ IOException -> 0x035f }
        if (r7 == 0) goto L_0x0589;
    L_0x025d:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x035f }
        r8 = 17;
        if (r7 < r8) goto L_0x0589;
    L_0x0263:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0361 }
        r8 = 19;
        if (r7 > r8) goto L_0x0589;
    L_0x0269:
        r7 = z;	 Catch:{ IOException -> 0x0363 }
        r8 = 64;
        r7 = r7[r8];	 Catch:{ IOException -> 0x0363 }
        r8 = android.os.Build.MANUFACTURER;	 Catch:{ IOException -> 0x0363 }
        r7 = r7.equals(r8);	 Catch:{ IOException -> 0x0363 }
        if (r7 == 0) goto L_0x0589;
    L_0x0277:
        r7 = p;	 Catch:{ IOException -> 0x0365 }
        r8 = android.os.Build.MODEL;	 Catch:{ IOException -> 0x0365 }
        r7 = com.whatsapp.util.au.a(r7, r8);	 Catch:{ IOException -> 0x0365 }
        if (r7 == 0) goto L_0x0589;
    L_0x0281:
        r2 = new android.hardware.Camera$Size;
        r0 = r24;
        r6 = r0.b;
        r6.getClass();
        r7 = 1440; // 0x5a0 float:2.018E-42 double:7.115E-321;
        r8 = 1080; // 0x438 float:1.513E-42 double:5.336E-321;
        r2.<init>(r6, r7, r8);
        r6 = new android.hardware.Camera$Size;
        r0 = r24;
        r7 = r0.b;
        r7.getClass();
        r8 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        r10 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r6.<init>(r7, r8, r10);
        r12 = r6;
    L_0x02a2:
        if (r2 != 0) goto L_0x0565;
    L_0x02a4:
        r6 = 9218868437227405311; // 0x7fefffffffffffff float:NaN double:1.7976931348623157E308;
        r8 = r12.width;
        r10 = (double) r8;
        r8 = r12.height;
        r0 = (double) r8;
        r16 = r0;
        r16 = r10 / r16;
        r15 = r3.iterator();
        r8 = r2;
    L_0x02b8:
        r2 = r15.hasNext();
        if (r2 == 0) goto L_0x0586;
    L_0x02be:
        r2 = r15.next();
        r2 = (android.hardware.Camera.Size) r2;
        r10 = r2.width;	 Catch:{ IOException -> 0x0367 }
        r11 = r12.width;	 Catch:{ IOException -> 0x0367 }
        if (r10 < r11) goto L_0x0580;
    L_0x02ca:
        r10 = r2.height;	 Catch:{ IOException -> 0x0367 }
        r11 = r12.height;	 Catch:{ IOException -> 0x0367 }
        if (r10 < r11) goto L_0x0580;
    L_0x02d0:
        r10 = r2.height;	 Catch:{ IOException -> 0x0369 }
        r11 = r2.width;	 Catch:{ IOException -> 0x0369 }
        r10 = r10 * r11;
        if (r10 > r5) goto L_0x0580;
    L_0x02d7:
        r10 = r2.width;
        r10 = (double) r10;
        r0 = r2.height;
        r18 = r0;
        r0 = r18;
        r0 = (double) r0;
        r18 = r0;
        r10 = r10 / r18;
        if (r8 != 0) goto L_0x02eb;
    L_0x02e7:
        if (r13 == 0) goto L_0x0583;
    L_0x02e9:
        r6 = r10;
        r8 = r2;
    L_0x02eb:
        r18 = r16 - r10;
        r18 = java.lang.Math.abs(r18);	 Catch:{ IOException -> 0x036b }
        r20 = r16 - r6;
        r20 = java.lang.Math.abs(r20);	 Catch:{ IOException -> 0x036b }
        r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1));
        if (r18 >= 0) goto L_0x0580;
    L_0x02fb:
        r6 = r10;
    L_0x02fc:
        if (r13 == 0) goto L_0x057d;
    L_0x02fe:
        if (r2 != 0) goto L_0x0346;
    L_0x0300:
        r8 = z;
        r10 = 75;
        r8 = r8[r10];
        com.whatsapp.util.Log.i(r8);
        r8 = r3.iterator();
        r3 = r2;
    L_0x030e:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x057a;
    L_0x0314:
        r2 = r8.next();
        r2 = (android.hardware.Camera.Size) r2;
        r10 = r2.height;
        r11 = r2.width;
        r10 = r10 * r11;
        if (r10 > r5) goto L_0x056f;
    L_0x0321:
        r10 = r2.width;
        r10 = (double) r10;
        r15 = r2.height;
        r0 = (double) r15;
        r18 = r0;
        r10 = r10 / r18;
        if (r3 != 0) goto L_0x0331;
    L_0x032d:
        if (r13 == 0) goto L_0x0576;
    L_0x032f:
        r6 = r10;
        r3 = r2;
    L_0x0331:
        r18 = r16 - r10;
        r18 = java.lang.Math.abs(r18);	 Catch:{ IOException -> 0x036d }
        r20 = r16 - r6;
        r20 = java.lang.Math.abs(r20);	 Catch:{ IOException -> 0x036d }
        r15 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1));
        if (r15 >= 0) goto L_0x056f;
    L_0x0341:
        r6 = r2;
        r2 = r10;
    L_0x0343:
        if (r13 == 0) goto L_0x0568;
    L_0x0345:
        r2 = r6;
    L_0x0346:
        if (r2 != 0) goto L_0x0565;
    L_0x0348:
        r2 = z;
        r3 = 62;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
    L_0x0351:
        if (r4 != 0) goto L_0x0371;
    L_0x0353:
        r2 = z;	 Catch:{ IOException -> 0x036f }
        r3 = 57;
        r2 = r2[r3];	 Catch:{ IOException -> 0x036f }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x036f }
        r2 = 0;
        goto L_0x0056;
    L_0x035f:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0361 }
    L_0x0361:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0363 }
    L_0x0363:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0365 }
    L_0x0365:
        r2 = move-exception;
        throw r2;
    L_0x0367:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0369 }
    L_0x0369:
        r2 = move-exception;
        throw r2;
    L_0x036b:
        r2 = move-exception;
        throw r2;
    L_0x036d:
        r2 = move-exception;
        throw r2;
    L_0x036f:
        r2 = move-exception;
        throw r2;
    L_0x0371:
        r2 = r12.width;
        r9.videoFrameWidth = r2;
        r2 = r12.height;
        r9.videoFrameHeight = r2;
        r2 = r9.videoFrameWidth;
        r3 = r9.videoFrameHeight;
        r2 = r2 * r3;
        r2 = r2 * 4;
        r9.videoBitRate = r2;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r5 = 55;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r3 = r9.videoFrameWidth;
        r2 = r2.append(r3);
        r3 = "x";
        r2 = r2.append(r3);
        r3 = r9.videoFrameHeight;
        r2 = r2.append(r3);
        r3 = z;
        r5 = 63;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r3 = r9.videoBitRate;
        r2 = r2.append(r3);
        r3 = z;
        r5 = 73;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r3 = r4.width;
        r2 = r2.append(r3);
        r3 = "x";
        r2 = r2.append(r3);
        r3 = r4.height;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = z;
        r3 = 61;
        r2 = r2[r3];
        r3 = 1;
        r14.set(r2, r3);
        r2 = r14.getSupportedFocusModes();
        if (r2 == 0) goto L_0x0436;
    L_0x03e6:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0528 }
        r3.<init>();	 Catch:{ IOException -> 0x0528 }
        r5 = z;	 Catch:{ IOException -> 0x0528 }
        r6 = 69;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0528 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x0528 }
        r5 = r2.toArray();	 Catch:{ IOException -> 0x0528 }
        r5 = java.util.Arrays.deepToString(r5);	 Catch:{ IOException -> 0x0528 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x0528 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0528 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IOException -> 0x0528 }
        r3 = z;	 Catch:{ IOException -> 0x0528 }
        r5 = 72;
        r3 = r3[r5];	 Catch:{ IOException -> 0x0528 }
        r3 = r2.contains(r3);	 Catch:{ IOException -> 0x0528 }
        if (r3 == 0) goto L_0x041f;
    L_0x0414:
        r3 = z;	 Catch:{ IOException -> 0x052a }
        r5 = 79;
        r3 = r3[r5];	 Catch:{ IOException -> 0x052a }
        r14.setFocusMode(r3);	 Catch:{ IOException -> 0x052a }
        if (r13 == 0) goto L_0x043f;
    L_0x041f:
        r3 = z;	 Catch:{ IOException -> 0x052c }
        r5 = 68;
        r3 = r3[r5];	 Catch:{ IOException -> 0x052c }
        r2 = r2.contains(r3);	 Catch:{ IOException -> 0x052c }
        if (r2 == 0) goto L_0x043f;
    L_0x042b:
        r2 = z;	 Catch:{ IOException -> 0x052e }
        r3 = 84;
        r2 = r2[r3];	 Catch:{ IOException -> 0x052e }
        r14.setFocusMode(r2);	 Catch:{ IOException -> 0x052e }
        if (r13 == 0) goto L_0x043f;
    L_0x0436:
        r2 = z;	 Catch:{ IOException -> 0x0530 }
        r3 = 58;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0530 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x0530 }
    L_0x043f:
        r0 = r24;
        r0.a = r4;	 Catch:{ IOException -> 0x0532 }
        r2 = r4.width;	 Catch:{ IOException -> 0x0532 }
        r3 = r4.height;	 Catch:{ IOException -> 0x0532 }
        r14.setPreviewSize(r2, r3);	 Catch:{ IOException -> 0x0532 }
        r0 = r24;
        r2 = r0.s;	 Catch:{ IOException -> 0x0532 }
        r2 = r4.equals(r2);	 Catch:{ IOException -> 0x0532 }
        if (r2 != 0) goto L_0x0534;
    L_0x0454:
        r2 = 1;
    L_0x0455:
        if (r2 == 0) goto L_0x045e;
    L_0x0457:
        r0 = r24;
        r3 = r0.b;	 Catch:{ IOException -> 0x0537 }
        r3.stopPreview();	 Catch:{ IOException -> 0x0537 }
    L_0x045e:
        r0 = r24;
        r3 = r0.b;	 Catch:{ IllegalStateException -> 0x0539 }
        r3.setParameters(r14);	 Catch:{ IllegalStateException -> 0x0539 }
        if (r2 == 0) goto L_0x0485;
    L_0x0467:
        r2 = z;	 Catch:{ IllegalStateException -> 0x0539 }
        r3 = 70;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0539 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0539 }
        r0 = r24;
        r2 = r0.b;	 Catch:{ IOException -> 0x053b }
        r0 = r24;
        r3 = r0.q;	 Catch:{ IOException -> 0x053b }
        r2.setPreviewDisplay(r3);	 Catch:{ IOException -> 0x053b }
    L_0x047b:
        r0 = r24;
        r2 = r0.b;
        r2.startPreview();
        r24.requestLayout();
    L_0x0485:
        r2 = r9;
    L_0x0486:
        r0 = r24;
        r3 = r0.b;	 Catch:{ IOException -> 0x0547 }
        r3.unlock();	 Catch:{ IOException -> 0x0547 }
        r0 = r24;
        r3 = r0.d;	 Catch:{ IOException -> 0x0547 }
        r0 = r24;
        r4 = r0.b;	 Catch:{ IOException -> 0x0547 }
        r3.setCamera(r4);	 Catch:{ IOException -> 0x0547 }
        r0 = r24;
        r3 = r0.d;	 Catch:{ IOException -> 0x0547 }
        r4 = 5;
        r3.setAudioSource(r4);	 Catch:{ IOException -> 0x0547 }
        r0 = r24;
        r3 = r0.d;	 Catch:{ IOException -> 0x0547 }
        r4 = 1;
        r3.setVideoSource(r4);	 Catch:{ IOException -> 0x0547 }
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0547 }
        r4 = 8;
        if (r3 < r4) goto L_0x04b7;
    L_0x04ae:
        r0 = r24;
        r3 = r0.d;	 Catch:{ IOException -> 0x0547 }
        r3.setProfile(r2);	 Catch:{ IOException -> 0x0547 }
        if (r13 == 0) goto L_0x04cf;
    L_0x04b7:
        r0 = r24;
        r2 = r0.d;	 Catch:{ IOException -> 0x0549 }
        r3 = 2;
        r2.setOutputFormat(r3);	 Catch:{ IOException -> 0x0549 }
        r0 = r24;
        r2 = r0.d;	 Catch:{ IOException -> 0x0549 }
        r3 = 0;
        r2.setAudioEncoder(r3);	 Catch:{ IOException -> 0x0549 }
        r0 = r24;
        r2 = r0.d;	 Catch:{ IOException -> 0x0549 }
        r3 = 0;
        r2.setVideoEncoder(r3);	 Catch:{ IOException -> 0x0549 }
    L_0x04cf:
        r0 = r24;
        r2 = r0.d;
        r3 = r25.getAbsolutePath();
        r2.setOutputFile(r3);
        r0 = r24;
        r2 = r0.d;
        r3 = r24.getHolder();
        r3 = r3.getSurface();
        r2.setPreviewDisplay(r3);
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 9;
        if (r2 < r3) goto L_0x051e;
    L_0x04ef:
        r2 = r24.n();
        r0 = r24;
        r3 = r0.e;	 Catch:{ IOException -> 0x054b }
        if (r3 == 0) goto L_0x0517;
    L_0x04f9:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x054b }
        r4 = 14;
        if (r3 == r4) goto L_0x0505;
    L_0x04ff:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x054d }
        r4 = 15;
        if (r3 != r4) goto L_0x0517;
    L_0x0505:
        r3 = android.os.Build.MANUFACTURER;	 Catch:{ IOException -> 0x054f }
        r4 = z;	 Catch:{ IOException -> 0x054f }
        r5 = 85;
        r4 = r4[r5];	 Catch:{ IOException -> 0x054f }
        r3 = r3.equals(r4);	 Catch:{ IOException -> 0x054f }
        if (r3 == 0) goto L_0x0517;
    L_0x0513:
        r2 = 360 - r2;
        r2 = r2 % 360;
    L_0x0517:
        r0 = r24;
        r3 = r0.d;
        r3.setOrientationHint(r2);
    L_0x051e:
        r0 = r24;
        r2 = r0.d;	 Catch:{ IllegalStateException -> 0x0551, IOException -> 0x055b }
        r2.prepare();	 Catch:{ IllegalStateException -> 0x0551, IOException -> 0x055b }
        r2 = 1;
        goto L_0x0056;
    L_0x0528:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x052a }
    L_0x052a:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x052c }
    L_0x052c:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x052e }
    L_0x052e:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0530 }
    L_0x0530:
        r2 = move-exception;
        throw r2;
    L_0x0532:
        r2 = move-exception;
        throw r2;
    L_0x0534:
        r2 = 0;
        goto L_0x0455;
    L_0x0537:
        r2 = move-exception;
        throw r2;
    L_0x0539:
        r2 = move-exception;
        throw r2;
    L_0x053b:
        r2 = move-exception;
        r3 = z;
        r4 = 66;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x047b;
    L_0x0547:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0549 }
    L_0x0549:
        r2 = move-exception;
        throw r2;
    L_0x054b:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x054d }
    L_0x054d:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x054f }
    L_0x054f:
        r2 = move-exception;
        throw r2;
    L_0x0551:
        r2 = move-exception;
        r24.f();
        r24.k();
        r2 = 0;
        goto L_0x0056;
    L_0x055b:
        r2 = move-exception;
        r24.f();
        r24.k();
        r2 = 0;
        goto L_0x0056;
    L_0x0565:
        r4 = r2;
        goto L_0x0351;
    L_0x0568:
        r22 = r2;
        r3 = r6;
        r6 = r22;
        goto L_0x030e;
    L_0x056f:
        r22 = r6;
        r6 = r3;
        r2 = r22;
        goto L_0x0343;
    L_0x0576:
        r6 = r2;
        r2 = r10;
        goto L_0x0343;
    L_0x057a:
        r2 = r3;
        goto L_0x0346;
    L_0x057d:
        r8 = r2;
        goto L_0x02b8;
    L_0x0580:
        r2 = r8;
        goto L_0x02fc;
    L_0x0583:
        r6 = r10;
        goto L_0x02fc;
    L_0x0586:
        r2 = r8;
        goto L_0x02fe;
    L_0x0589:
        r12 = r6;
        goto L_0x02a2;
    L_0x058c:
        r2 = r7;
        goto L_0x0257;
    L_0x058f:
        r2 = r6;
        goto L_0x0219;
    L_0x0592:
        r6 = r2;
        goto L_0x01db;
    L_0x0595:
        r5 = r4;
        r4 = r2;
        goto L_0x0199;
    L_0x0599:
        r5 = r4;
        r4 = r2;
        goto L_0x0199;
    L_0x059d:
        r6 = r2;
        goto L_0x012b;
    L_0x05a0:
        r3 = r2;
        goto L_0x011d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraView.a(java.io.File):boolean");
    }

    public void setCameraCallback(z zVar) {
        this.j = zVar;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    static boolean f(CameraView cameraView) {
        return cameraView.k;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        try {
            if (this.b != null) {
                try {
                    if (this.c != 0) {
                        this.j.b(this.r);
                    }
                }
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public List l() {
        List list = null;
        try {
            if (this.b != null) {
                List supportedFlashModes = this.b.getParameters().getSupportedFlashModes();
                if (supportedFlashModes != null) {
                    list = new ArrayList();
                    try {
                        if (supportedFlashModes.contains(z[3])) {
                            list.add(z[1]);
                        }
                        try {
                            if (supportedFlashModes.contains(z[5])) {
                                list.add(z[0]);
                            }
                            try {
                                if (supportedFlashModes.contains(z[4])) {
                                    list.add(z[2]);
                                }
                            } catch (RuntimeException e) {
                                throw e;
                            }
                        } catch (RuntimeException e2) {
                            throw e2;
                        }
                    } catch (RuntimeException e22) {
                        throw e22;
                    }
                }
            }
            return list;
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    public void a(u uVar) {
        if (uVar == null) {
            try {
                throw new IllegalArgumentException(z[105]);
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            if (this.b == null) {
                Log.e(z[106]);
                k();
                return;
            }
            this.k = false;
            this.g = true;
            Log.i(z[104]);
            Parameters parameters = this.b.getParameters();
            parameters.setRotation(n());
            parameters.setJpegQuality(80);
            this.b.setParameters(parameters);
            try {
                PictureCallback iVar = new i(this, uVar);
                this.b.takePicture(new x(this, uVar), null, iVar);
            } catch (Throwable e2) {
                Log.b(z[107], e2);
                k();
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        a();
    }

    static boolean a(CameraView cameraView) {
        return cameraView.g;
    }

    static boolean a(CameraView cameraView, boolean z) {
        cameraView.g = z;
        return z;
    }

    static void h(CameraView cameraView) {
        cameraView.b();
    }

    public static Size a(List list, int i, int i2) {
        int i3 = CameraActivity.l;
        double d = ((double) i) / ((double) i2);
        if (list == null) {
            return null;
        }
        Size size;
        Size size2 = null;
        double d2 = Double.MAX_VALUE;
        for (Size size3 : list) {
            double abs;
            double d3 = ((double) size3.width) / ((double) size3.height);
            double d4 = ((double) size3.width) / ((double) i);
            try {
                if ((size3.width * size3.height >= 153600 || i3 != 0) && (d4 <= 1.5d || i3 != 0)) {
                    try {
                        if (Math.abs(d3 - d) <= 0.1d || i3 != 0) {
                            if (((double) Math.abs(size3.height - i2)) < d2) {
                                size = size3;
                                abs = (double) Math.abs(size3.height - i2);
                            } else {
                                double d5 = d2;
                                size = size2;
                                abs = d5;
                            }
                            if (i3 != 0) {
                                break;
                            }
                            size2 = size;
                            d2 = abs;
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        size = size2;
        if (size == null) {
            size2 = size;
            d2 = Double.MAX_VALUE;
            for (Size size32 : list) {
                if (((double) size32.width) / ((double) i) <= 1.5d || i3 != 0) {
                    if (((double) Math.abs(size32.height - i2)) < d2) {
                        size = size32;
                        abs = (double) Math.abs(size32.height - i2);
                    } else {
                        d5 = d2;
                        size = size2;
                        abs = d5;
                    }
                    if (i3 != 0) {
                        break;
                    }
                    size2 = size;
                    d2 = abs;
                }
            }
            size = size2;
        }
        if (size != null) {
            return size;
        }
        size2 = size;
        d2 = Double.MAX_VALUE;
        for (Size size322 : list) {
            if (((double) Math.abs(size322.height - i2)) < d2) {
                size = size322;
                abs = (double) Math.abs(size322.height - i2);
            } else {
                d5 = d2;
                size = size2;
                abs = d5;
            }
            if (i3 != 0) {
                return size;
            }
            size2 = size;
            d2 = abs;
        }
        return size2;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public CameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void f() {
        try {
            if (this.d != null) {
                this.d.reset();
                this.d.release();
                this.d = null;
                this.b.lock();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public int h() {
        return this.c;
    }
}
