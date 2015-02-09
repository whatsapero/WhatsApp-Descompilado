package com.whatsapp.camera;

import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.App;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.PhotoView;
import com.whatsapp.VideoView;
import com.whatsapp.ee;
import com.whatsapp.m8;
import com.whatsapp.util.Log;
import com.whatsapp.util.bx;
import com.whatsapp.util.f;
import com.whatsapp.vk;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class CameraActivity extends DialogToastActivity {
    private static final String[] O;
    public static int l;
    private View A;
    private File B;
    private Rect C;
    private ShutterOverlay D;
    private int E;
    private long F;
    private ImageView G;
    private TextView H;
    private ConversationTextEntry I;
    private ee J;
    private View K;
    private View L;
    private OnGlobalLayoutListener M;
    private TextView N;
    private AutofocusOverlay j;
    private CameraView k;
    private Uri m;
    private ZoomOverlay n;
    private ImageButton o;
    private PhotoView p;
    private boolean q;
    private ProgressBar r;
    private Handler s;
    private View t;
    private View u;
    private File v;
    private ImageButton w;
    private View x;
    private ViewGroup y;
    private m8 z;

    static {
        String[] strArr = new String[38];
        String str = "w\u0002\u0003";
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
                        i3 = 24;
                        break;
                    case ay.f /*1*/:
                        i3 = 100;
                        break;
                    case ay.n /*2*/:
                        i3 = 101;
                        break;
                    case ay.p /*3*/:
                        i3 = 85;
                        break;
                    default:
                        i3 = 7;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "y\n\u0001'hq\u0000K<il\u0001\u000b!)}\u001c\u0011'f6\u0017\r:ul\u0007\u0010!)Q*1\u0010IL";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "y\n\u0001'hq\u0000K<il\u0001\u000b!)}\u001c\u0011'f6\u0017\r:ul\u0007\u0010!)Q'*\u001bXJ!6\u001aRJ' ";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "y\n\u0001'hq\u0000K<il\u0001\u000b!)}\u001c\u0011'f6\u0017\r:ul\u0007\u0010!)V%(\u0010";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,(k\u0001\u0011 wh\f\n!hh\u0016\u0000#n}\u0013";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,(k\u0001\u0011 wh\u0016\u0000#n}\u0013";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,(k\u0001\u0011 wh\u0016\u0000#n}\u0013K;rt\b\u0007<su\u0005\u0015";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,(k\u0001\u0011 wn\r\u00010hh\u0016\u0000#n}\u0013";
                    obj = 7;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "n\r\u00010hh\u0016\u0000#n}\u0013J2bl\u0012\f1bw\u0010\r jz";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "n\r\u00010hh\u0016\u0000#n}\u0013J2bl\u0012\f1bw\u0010\r jz";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "n\r\u00010h7N";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "p\u0005\u0015!n{;\u00030b|\u0006\u00046lG\u0001\u000b4et\u0001\u0001";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,(k\u0010\n%qq\u0000\u0000:dy\u0014\u0011 u}D";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "y\n\u0001'hq\u0000K<il\u0001\u000b!)}\u001c\u0011'f671\u0007BY)";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "k\u000f\f%Xh\u0016\u0000#n}\u0013";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "V\u000bE&wy\u0007\u0000";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "n\r\u0007'fl\u000b\u0017";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,(k\u0010\n%qq\u0000\u0000:dy\u0014\u0011 u}D";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,(k\u0010\n%qq\u0000\u0000:dy\u0014\u0011 u}";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,(l\u0005\u000e0fv\u0000\u00160i|\u0014\f6sm\u0016\u0000";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,(j\u0001\u0016!fj\u0010";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "~\b\f%*p";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "j\u0001\u0006!";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,(k\u0001\u0011 wh\u0016\u0000#n}\u0013K;rt\b\u0007<su\u0005\u0015";
                    obj = 23;
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    strArr2 = strArr3;
                    str = "{\u0005\b0uy";
                    obj = 24;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "~\b\f%*p";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,(k\u0001\u0011 wh\u0016\u0000#n}\u0013";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,({\u0016\u00004s}";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "y\n\u0001'hq\u0000K<il\u0001\u000b!)y\u0007\u0011<hvJ&\u0007BY0 \nTP+7\u0001DM0";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "h\u0016\u0000#n}\u0013";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,({\u0016\u00004s}K\u000b:*u\u0001H:u5\t\u00162tl\u000b\u00170*|\u0006";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "r\r\u0001";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,'z\u000b\u0010;d}D\u0011:'u\u0005\f;";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "y\u0006\n'sq\n\u0002ucm\u0001E!h8\n\u0004!nn\u0001E9nz\u0016\u0004'n}\u0017E8nk\u0017\f;`";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "6\t\u0015a";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,(k\u0010\u0004'sn\r\u00010h{\u0005\u0015!rj\u0001";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "{\u0005\b0uy\u0005\u0006!nn\r\u0011,(|\u0001\u0016!uw\u001d";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    O = strArr3;
                default:
                    strArr2[i] = str;
                    str = "w\n";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static ImageView x(CameraActivity cameraActivity) {
        return cameraActivity.G;
    }

    static m8 w(CameraActivity cameraActivity) {
        return cameraActivity.z;
    }

    static AutofocusOverlay s(CameraActivity cameraActivity) {
        return cameraActivity.j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r6_this = this;
        r5 = 0;
        r4 = 1;
        r3 = 0;
        r2 = 8;
        r0 = O;
        r1 = 21;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r6.z;
        if (r0 != 0) goto L_0x001a;
    L_0x0012:
        r0 = r6.H;
        r1 = 2131624055; // 0x7f0e0077 float:1.8875279E38 double:1.0531622154E-314;
        r0.setText(r1);
    L_0x001a:
        r0 = r6.G;
        r1 = 2130837730; // 0x7f0200e2 float:1.7280422E38 double:1.0527737193E-314;
        r0.setImageResource(r1);
        r0 = r6.A;
        r0.setVisibility(r3);
        r0 = r6.t;
        r0.setVisibility(r2);
        r0 = r6.K;
        r0.setVisibility(r2);
        r0 = r6.x;
        r0.setVisibility(r2);
        r0 = r6.y;
        r1 = r6.k;
        r0.addView(r1, r3);
        r0 = r6.G;
        r0.setEnabled(r4);
        r0 = r6.u;
        r0.setEnabled(r4);
        r0 = r6.w;
        r0.setEnabled(r4);
        r0 = r6.N;
        r0.setVisibility(r2);
        r0 = r6.r;
        r0.setVisibility(r2);
        r0 = r6.L;
        r0.setVisibility(r2);
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 9;
        if (r0 < r1) goto L_0x0067;
    L_0x0061:
        r0 = android.hardware.Camera.getNumberOfCameras();
        if (r0 > r4) goto L_0x0070;
    L_0x0067:
        r0 = r6.u;
        r0.setVisibility(r2);
        r0 = l;
        if (r0 == 0) goto L_0x0075;
    L_0x0070:
        r0 = r6.u;
        r0.setVisibility(r3);
    L_0x0075:
        r0 = r6.w;
        r0.setVisibility(r3);
        r0 = r6.L;
        r0.setVisibility(r2);
        r0 = 2131427561; // 0x7f0b00e9 float:1.8476742E38 double:1.0530651345E-314;
        r0 = r6.findViewById(r0);
        r0 = (com.whatsapp.VideoView) r0;
        r0.setVisibility(r2);
        r0 = r6.B;
        if (r0 == 0) goto L_0x0096;
    L_0x008f:
        r0 = r6.B;
        r0.delete();
        r6.B = r5;
    L_0x0096:
        r0 = r6.v;
        if (r0 == 0) goto L_0x00a1;
    L_0x009a:
        r0 = r6.v;
        r0.delete();
        r6.v = r5;
    L_0x00a1:
        r6.E = r3;
        r6.C = r5;
        r0 = r6.p;
        r1 = 0;
        r0.setRotation(r1, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraActivity.a():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
        r7_this = this;
        r6 = 8;
        r5 = 1;
        r4 = 0;
        r0 = l;
        r1 = O;
        r2 = 36;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = 3;
        r2 = O;
        r3 = 35;
        r2 = r2[r3];
        r1 = com.whatsapp.util.f.a(r7, r1, r2);
        r7.B = r1;
        r1 = r7.getWindowManager();
        r1 = r1.getDefaultDisplay();
        r1 = r1.getOrientation();
        r2 = r7.getResources();
        r2 = r2.getConfiguration();
        r2 = r2.orientation;
        switch(r2) {
            case 1: goto L_0x0079;
            case 2: goto L_0x0089;
            default: goto L_0x0035;
        };
    L_0x0035:
        r0 = r7.k;
        r0.setKeepScreenOn(r5);
        r0 = r7.k;
        r1 = r7.B;
        r0.b(r1);
        r0 = r7.s;
        r0.sendEmptyMessage(r4);
        r0 = r7.N;
        r0.setVisibility(r4);
        r0 = r7.r;
        r0.setVisibility(r4);
        r0 = r7.q;
        if (r0 != 0) goto L_0x0059;
    L_0x0054:
        r0 = r7.L;
        r0.setVisibility(r4);
    L_0x0059:
        r0 = r7.u;
        r0.setVisibility(r6);
        r0 = r7.w;
        r0.setVisibility(r6);
        r0 = java.lang.System.currentTimeMillis();
        r7.F = r0;
        r0 = r7.q;
        if (r0 == 0) goto L_0x0078;
    L_0x006d:
        r0 = r7.z;
        if (r0 != 0) goto L_0x0078;
    L_0x0071:
        r0 = r7.H;
        r1 = "";
        r0.setText(r1);
    L_0x0078:
        return;
    L_0x0079:
        if (r1 == 0) goto L_0x007d;
    L_0x007b:
        if (r1 != r5) goto L_0x0082;
    L_0x007d:
        r7.setRequestedOrientation(r5);
        if (r0 == 0) goto L_0x0035;
    L_0x0082:
        r2 = 9;
        r7.setRequestedOrientation(r2);
        if (r0 == 0) goto L_0x0035;
    L_0x0089:
        if (r1 == 0) goto L_0x008d;
    L_0x008b:
        if (r1 != r5) goto L_0x0092;
    L_0x008d:
        r7.setRequestedOrientation(r4);
        if (r0 == 0) goto L_0x0035;
    L_0x0092:
        r7.setRequestedOrientation(r6);
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraActivity.d():void");
    }

    static View h(CameraActivity cameraActivity) {
        return cameraActivity.t;
    }

    static void b(CameraActivity cameraActivity) {
        cameraActivity.a();
    }

    static int i(CameraActivity cameraActivity) {
        return cameraActivity.E;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r6) {
        /*
        r5_this = this;
        r1 = l;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = O;
        r3 = 13;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r6);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r5.k;
        r0.e();
        r0 = -1;
        r5.setRequestedOrientation(r0);
        r0 = r5.getContentResolver();	 Catch:{ SettingNotFoundException -> 0x00b5 }
        r2 = O;	 Catch:{ SettingNotFoundException -> 0x00b5 }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ SettingNotFoundException -> 0x00b5 }
        r0 = android.provider.Settings.System.getInt(r0, r2);	 Catch:{ SettingNotFoundException -> 0x00b5 }
        if (r0 == 0) goto L_0x0046;
    L_0x0035:
        r0 = O;	 Catch:{ SettingNotFoundException -> 0x00b5 }
        r2 = 17;
        r0 = r0[r2];	 Catch:{ SettingNotFoundException -> 0x00b5 }
        r0 = r5.getSystemService(r0);	 Catch:{ SettingNotFoundException -> 0x00b5 }
        r0 = (android.os.Vibrator) r0;	 Catch:{ SettingNotFoundException -> 0x00b5 }
        r2 = 75;
        r0.vibrate(r2);	 Catch:{ SettingNotFoundException -> 0x00b5 }
    L_0x0046:
        if (r6 == 0) goto L_0x00ac;
    L_0x0048:
        r0 = r5.q;	 Catch:{ SettingNotFoundException -> 0x00c0 }
        if (r0 == 0) goto L_0x0051;
    L_0x004c:
        r5.e();	 Catch:{ SettingNotFoundException -> 0x00c2 }
        if (r1 == 0) goto L_0x00b4;
    L_0x0051:
        r0 = r5.z;	 Catch:{ SettingNotFoundException -> 0x00c4 }
        if (r0 == 0) goto L_0x006e;
    L_0x0055:
        r0 = r5.z;	 Catch:{ IOException -> 0x00c8 }
        r0 = r0.e;	 Catch:{ IOException -> 0x00c8 }
        r2 = r5.B;	 Catch:{ IOException -> 0x00c8 }
        r3 = 3;
        r4 = 0;
        com.whatsapp.util.f.a(r5, r0, r2, r3, r4);	 Catch:{ IOException -> 0x00c8 }
    L_0x0060:
        r0 = r5.B;
        r0 = android.net.Uri.fromFile(r0);
        com.whatsapp.util.f.a(r5, r0);
        r5.finish();
        if (r1 == 0) goto L_0x00b4;
    L_0x006e:
        r0 = new android.content.Intent;
        r2 = r5.getBaseContext();
        r3 = com.whatsapp.ContactPicker.class;
        r0.<init>(r2, r3);
        r2 = O;	 Catch:{ SettingNotFoundException -> 0x011c }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ SettingNotFoundException -> 0x011c }
        r0.setType(r2);	 Catch:{ SettingNotFoundException -> 0x011c }
        r2 = O;	 Catch:{ SettingNotFoundException -> 0x011c }
        r3 = 14;
        r2 = r2[r3];	 Catch:{ SettingNotFoundException -> 0x011c }
        r3 = r5.B;	 Catch:{ SettingNotFoundException -> 0x011c }
        r3 = android.net.Uri.fromFile(r3);	 Catch:{ SettingNotFoundException -> 0x011c }
        r0.putExtra(r2, r3);	 Catch:{ SettingNotFoundException -> 0x011c }
        r2 = O;	 Catch:{ SettingNotFoundException -> 0x011c }
        r3 = 15;
        r2 = r2[r3];	 Catch:{ SettingNotFoundException -> 0x011c }
        r3 = 1;
        r0.putExtra(r2, r3);	 Catch:{ SettingNotFoundException -> 0x011c }
        r5.startActivity(r0);	 Catch:{ SettingNotFoundException -> 0x011c }
        r0 = r5.B;	 Catch:{ SettingNotFoundException -> 0x011c }
        r0 = android.net.Uri.fromFile(r0);	 Catch:{ SettingNotFoundException -> 0x011c }
        com.whatsapp.util.f.a(r5, r0);	 Catch:{ SettingNotFoundException -> 0x011c }
        r5.finish();	 Catch:{ SettingNotFoundException -> 0x011c }
        if (r1 == 0) goto L_0x00b4;
    L_0x00ac:
        r0 = r5.B;	 Catch:{ SettingNotFoundException -> 0x011c }
        r0.delete();	 Catch:{ SettingNotFoundException -> 0x011c }
        r5.finish();	 Catch:{ SettingNotFoundException -> 0x011c }
    L_0x00b4:
        return;
    L_0x00b5:
        r0 = move-exception;
        r2 = O;
        r3 = 19;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        goto L_0x0046;
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x00c4 }
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r0 = move-exception;
        r2 = r0.getMessage();	 Catch:{ SettingNotFoundException -> 0x0116 }
        if (r2 == 0) goto L_0x00eb;
    L_0x00cf:
        r2 = r0.getMessage();	 Catch:{ SettingNotFoundException -> 0x0118 }
        r3 = O;	 Catch:{ SettingNotFoundException -> 0x0118 }
        r4 = 16;
        r3 = r3[r4];	 Catch:{ SettingNotFoundException -> 0x0118 }
        r2 = r2.contains(r3);	 Catch:{ SettingNotFoundException -> 0x0118 }
        if (r2 == 0) goto L_0x00eb;
    L_0x00df:
        r2 = 2131624285; // 0x7f0e015d float:1.8875745E38 double:1.053162329E-314;
        r2 = r5.getString(r2);	 Catch:{ SettingNotFoundException -> 0x011a }
        com.whatsapp.App.a(r5, r2);	 Catch:{ SettingNotFoundException -> 0x011a }
        if (r1 == 0) goto L_0x00f6;
    L_0x00eb:
        r2 = r5.getBaseContext();	 Catch:{ SettingNotFoundException -> 0x011a }
        r3 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r4 = 0;
        com.whatsapp.App.b(r2, r3, r4);	 Catch:{ SettingNotFoundException -> 0x011a }
    L_0x00f6:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = O;
        r4 = 18;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r0.toString();
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0060;
    L_0x0116:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x0118 }
    L_0x0118:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x011a }
    L_0x011a:
        r0 = move-exception;
        throw r0;
    L_0x011c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraActivity.a(boolean):void");
    }

    public void onBackPressed() {
        if (this.t.getVisibility() == 0) {
            a();
        } else {
            super.onBackPressed();
        }
    }

    static File t(CameraActivity cameraActivity) {
        return cameraActivity.B;
    }

    static Handler u(CameraActivity cameraActivity) {
        return cameraActivity.s;
    }

    static int a(CameraActivity cameraActivity, int i) {
        cameraActivity.E = i;
        return i;
    }

    static CameraView d(CameraActivity cameraActivity) {
        return cameraActivity.k;
    }

    private Intent c() {
        Parcelable intent = new Intent(this, CameraActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.addFlags(8388608);
        intent.addFlags(1073741824);
        Intent intent2 = new Intent();
        intent2.putExtra(O[2], intent);
        intent2.putExtra(O[4], getString(R.string.camera_shortcut));
        intent2.putExtra(O[3], ShortcutIconResource.fromContext(this, R.drawable.launcher_camera));
        return intent2;
    }

    static boolean v(CameraActivity cameraActivity) {
        return cameraActivity.q;
    }

    static ee k(CameraActivity cameraActivity) {
        return cameraActivity.J;
    }

    static View j(CameraActivity cameraActivity) {
        return cameraActivity.L;
    }

    private void a(boolean z, View view) {
        if (z && view.getVisibility() != 0) {
            view.setVisibility(0);
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            view.startAnimation(alphaAnimation);
            if (l == 0) {
                return;
            }
        }
        if (!z && view.getVisibility() != 8) {
            view.setVisibility(8);
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300);
            view.startAnimation(alphaAnimation);
        }
    }

    private void e() {
        try {
            Bitmap frameAtTime;
            long j;
            Log.i(O[8]);
            if (this.z == null) {
                this.H.setText(R.string.camera_video_preview_title);
            }
            this.y.removeView(this.k);
            this.A.setVisibility(8);
            this.t.setVisibility(0);
            this.K.setVisibility(8);
            this.x.setVisibility(8);
            this.p.setVisibility(8);
            View findViewById = findViewById(R.id.video_holder);
            findViewById.setVisibility(0);
            VideoView videoView = (VideoView) findViewById(R.id.video);
            videoView.setVisibility(0);
            videoView.setVideoPath(this.B.getAbsolutePath());
            videoView.requestFocus();
            videoView.seekTo(1);
            long currentTimeMillis = System.currentTimeMillis() - this.F;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(this.B.getAbsolutePath());
                currentTimeMillis = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(0);
                j = currentTimeMillis;
            } catch (Exception e) {
                Log.e(O[9] + e.toString());
                frameAtTime = f.b(this.B.getAbsolutePath());
                j = currentTimeMillis;
            } catch (NoSuchMethodError e2) {
                Log.e(O[10] + e2.toString());
                frameAtTime = f.b(this.B.getAbsolutePath());
                j = currentTimeMillis;
            }
            if (frameAtTime != null) {
                try {
                    videoView.setBackgroundDrawable(new BitmapDrawable(getResources(), frameAtTime));
                } catch (Exception e3) {
                    throw e3;
                }
            }
            mediaMetadataRetriever.release();
            View findViewById2 = findViewById(R.id.video_control);
            findViewById(R.id.ok).setOnClickListener(new o(this));
            findViewById(R.id.cancel).setOnClickListener(new p(this));
            SeekBar seekBar = (SeekBar) findViewById(R.id.seekbar);
            seekBar.setProgress(0);
            seekBar.setMax((int) j);
            seekBar.setVisibility(0);
            TextView textView = (TextView) findViewById(R.id.timer_current);
            TextView textView2 = (TextView) findViewById(R.id.timer_total);
            textView.setText(DateUtils.formatElapsedTime(0));
            textView2.setText(DateUtils.formatElapsedTime(j / 1000));
            seekBar.setOnSeekBarChangeListener(new s(this, videoView, textView));
            OnClickListener asVar = new as(this, videoView, findViewById2, new k(this, videoView, seekBar, findViewById2));
            findViewById.setOnClickListener(asVar);
            findViewById2.setOnClickListener(asVar);
        } catch (Exception e32) {
            throw e32;
        }
    }

    static void a(CameraActivity cameraActivity, String str) {
        cameraActivity.a(str);
    }

    private void b() {
        Log.i(O[20]);
        this.G.setEnabled(false);
        this.u.setEnabled(false);
        this.w.setEnabled(false);
        this.k.a(new r(this));
    }

    static Rect c(CameraActivity cameraActivity) {
        return cameraActivity.C;
    }

    protected void onPause() {
        super.onPause();
        if (this.k.m()) {
            boolean z;
            if (System.currentTimeMillis() - this.F > 1000) {
                z = true;
            } else {
                z = false;
            }
            a(z);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        Throwable e;
        switch (i) {
            case ay.f /*1*/:
                if (i2 == -1) {
                    Uri fromFile = Uri.fromFile(App.t(O[25]));
                    if (this.m.getQueryParameter(O[26]) != null) {
                        fromFile = fromFile.buildUpon().appendQueryParameter(O[22], "1").build();
                    }
                    try {
                        Bitmap g = f.g(fromFile);
                        if (g == null) {
                            try {
                                Log.e(O[24]);
                                App.b((Context) this, (int) R.string.camera_failed, 1);
                                return;
                            } catch (OutOfMemoryError e2) {
                                throw e2;
                            }
                        }
                        this.C = (Rect) intent.getParcelableExtra(O[23]);
                        this.p.a(g);
                    } catch (OutOfMemoryError e3) {
                        e = e3;
                        Log.b(O[27], e);
                        App.b((Context) this, (int) R.string.camera_failed, 1);
                    } catch (IOException e4) {
                        e = e4;
                        Log.b(O[27], e);
                        App.b((Context) this, (int) R.string.camera_failed, 1);
                    } catch (bx e5) {
                        e = e5;
                        Log.b(O[27], e);
                        App.b((Context) this, (int) R.string.camera_failed, 1);
                    }
                }
            default:
        }
    }

    static TextView r(CameraActivity cameraActivity) {
        return cameraActivity.N;
    }

    static void q(CameraActivity cameraActivity) {
        cameraActivity.b();
    }

    private void a(String str) {
        int i = l;
        if (O[0].equals(str)) {
            this.w.setImageResource(R.drawable.btn_flash_off);
            if (i == 0) {
                return;
            }
        }
        if (O[1].equals(str)) {
            this.w.setImageResource(R.drawable.btn_flash_on);
            if (i == 0) {
                return;
            }
        }
        this.w.setImageResource(R.drawable.btn_flash_auto);
    }

    static long f(CameraActivity cameraActivity) {
        return cameraActivity.F;
    }

    private void f() {
        List l = this.k.l();
        if (l == null || l.size() <= 1) {
            this.w.setVisibility(8);
            if (l == 0) {
                return;
            }
        }
        this.w.setVisibility(0);
        a(this.k.i());
    }

    static void e(CameraActivity cameraActivity) {
        cameraActivity.f();
    }

    static PhotoView l(CameraActivity cameraActivity) {
        return cameraActivity.p;
    }

    protected void onDestroy() {
        Log.i(O[37]);
        super.onDestroy();
        if (this.t != null) {
            this.t.getViewTreeObserver().removeGlobalOnLayoutListener(this.M);
        }
    }

    static ProgressBar m(CameraActivity cameraActivity) {
        return cameraActivity.r;
    }

    static void n(CameraActivity cameraActivity) {
        cameraActivity.d();
    }

    static ImageButton p(CameraActivity cameraActivity) {
        return cameraActivity.o;
    }

    static ConversationTextEntry a(CameraActivity cameraActivity) {
        return cameraActivity.I;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r12) {
        /*
        r11_this = this;
        r10 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r9 = 0;
        r8 = 8;
        r7 = -1;
        r6 = 1;
        r2 = l;
        super.onCreate(r12);
        r0 = O;
        r1 = 28;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.an;
        if (r0 == 0) goto L_0x0028;
    L_0x0019:
        r0 = com.whatsapp.App.aJ;
        r0 = r0.e();
        if (r0 == 0) goto L_0x0028;
    L_0x0021:
        r0 = com.whatsapp.App.e(r11);
        r1 = 3;
        if (r0 == r1) goto L_0x0048;
    L_0x0028:
        r0 = O;
        r1 = 31;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = O;
        r1 = 33;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r11, r1);
        r11.startActivity(r0);
        r11.finish();
    L_0x0047:
        return;
    L_0x0048:
        r0 = 0;
        r0 = com.whatsapp.util.WhatsAppLibLoader.a(r0);
        if (r0 != 0) goto L_0x005c;
    L_0x004f:
        r0 = O;
        r1 = 34;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r11.finish();
        goto L_0x0047;
    L_0x005c:
        r0 = O;
        r1 = 29;
        r0 = r0[r1];
        r1 = r11.getIntent();
        r1 = r1.getAction();
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x007b;
    L_0x0070:
        r0 = r11.c();
        r11.setResult(r7, r0);
        r11.finish();
        goto L_0x0047;
    L_0x007b:
        r0 = com.whatsapp.App.aP();
        r3 = com.whatsapp.ge.k;
        r3 = r3 * 1024;
        r3 = r3 * 1024;
        r4 = (long) r3;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x009a;
    L_0x008a:
        r0 = com.whatsapp.App.p;
        r0 = r11.getApplicationContext();
        r1 = 2131624285; // 0x7f0e015d float:1.8875745E38 double:1.053162329E-314;
        com.whatsapp.App.a(r0, r1, r6);
        r11.finish();
        goto L_0x0047;
    L_0x009a:
        r0 = r11.getWindow();
        r0.setFlags(r10, r10);
        r0 = r11.getWindow();
        r1 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r0.clearFlags(r1);
        r0 = r11.getWindow();
        r1 = new android.graphics.drawable.ColorDrawable;
        r3 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1.<init>(r3);
        r0.setBackgroundDrawable(r1);
        r0 = new com.whatsapp.camera.CameraLayout;
        r0.<init>(r11);
        r1 = r11.getWindow();
        r1 = r1.getLayoutInflater();
        r3 = 2130903082; // 0x7f03002a float:1.7412972E38 double:1.0528060074E-314;
        com.whatsapp.b7.a(r1, r3, r0, r6);
        r11.setContentView(r0);
        r0 = r11.getIntent();
        r1 = O;
        r3 = 30;
        r1 = r1[r3];
        r0 = r0.getBooleanExtra(r1, r6);
        r11.q = r0;
        r0 = r11.getIntent();
        r1 = O;
        r3 = 32;
        r1 = r1[r3];
        r0 = r0.getStringExtra(r1);
        if (r0 == 0) goto L_0x0134;
    L_0x00ee:
        r1 = com.whatsapp.App.P;
        r0 = r1.a(r0);
        r11.z = r0;
        r0 = r11.z;
        r0 = r0.w();
        if (r0 != 0) goto L_0x0106;
    L_0x00fe:
        r0 = r11.z;
        r0 = r0.l();
        if (r0 == 0) goto L_0x0121;
    L_0x0106:
        r0 = 2131624826; // 0x7f0e037a float:1.8876843E38 double:1.0531625963E-314;
        r1 = new java.lang.Object[r6];
        r3 = r11.z;
        r3 = r3.a(r11);
        r1[r9] = r3;
        r0 = r11.getString(r0, r1);
        r1 = r11.getBaseContext();
        r0 = com.whatsapp.util.a5.d(r0, r1);
        if (r2 == 0) goto L_0x02d0;
    L_0x0121:
        r0 = 2131624827; // 0x7f0e037b float:1.8876845E38 double:1.053162597E-314;
        r1 = new java.lang.Object[r6];
        r3 = r11.z;
        r3 = r3.a(r11);
        r1[r9] = r3;
        r0 = r11.getString(r0, r1);
        if (r2 == 0) goto L_0x02cd;
    L_0x0134:
        r0 = 2131624055; // 0x7f0e0077 float:1.8875279E38 double:1.0531622154E-314;
        r0 = r11.getString(r0);
        r1 = r0;
    L_0x013c:
        r0 = 2131427571; // 0x7f0b00f3 float:1.8476762E38 double:1.0530651394E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r11.H = r0;
        r0 = r11.H;
        r0.setText(r1);
        r0 = 2131427558; // 0x7f0b00e6 float:1.8476736E38 double:1.053065133E-314;
        r0 = r11.findViewById(r0);
        r11.t = r0;
        r0 = 2131427552; // 0x7f0b00e0 float:1.8476723E38 double:1.05306513E-314;
        r0 = r11.findViewById(r0);
        r11.A = r0;
        r0 = 2131427559; // 0x7f0b00e7 float:1.8476738E38 double:1.0530651335E-314;
        r0 = r11.findViewById(r0);
        r0 = (com.whatsapp.PhotoView) r0;
        r11.p = r0;
        r0 = 2131427554; // 0x7f0b00e2 float:1.8476728E38 double:1.053065131E-314;
        r0 = r11.findViewById(r0);
        r0 = (com.whatsapp.camera.CameraView) r0;
        r11.k = r0;
        r0 = r11.k;
        r1 = new com.whatsapp.camera.at;
        r1.<init>(r11);
        r0.setCameraCallback(r1);
        r0 = 2131427553; // 0x7f0b00e1 float:1.8476725E38 double:1.0530651305E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r11.y = r0;
        r0 = new com.whatsapp.camera.AutofocusOverlay;
        r0.<init>(r11);
        r11.j = r0;
        r0 = r11.j;
        r0.setVisibility(r8);
        r0 = r11.y;
        r1 = r11.j;
        r0.addView(r1, r7, r7);
        r0 = new com.whatsapp.camera.ZoomOverlay;
        r0.<init>(r11);
        r11.n = r0;
        r0 = r11.n;
        r0.setVisibility(r8);
        r0 = r11.y;
        r1 = r11.n;
        r0.addView(r1, r7, r7);
        r0 = new com.whatsapp.camera.ShutterOverlay;
        r0.<init>(r11);
        r11.D = r0;
        r0 = r11.y;
        r1 = r11.D;
        r0.addView(r1, r7, r7);
        r0 = 2131427574; // 0x7f0b00f6 float:1.8476768E38 double:1.053065141E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r11.N = r0;
        r0 = 2131427575; // 0x7f0b00f7 float:1.847677E38 double:1.0530651414E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ProgressBar) r0;
        r11.r = r0;
        r0 = r11.r;
        r1 = 100;
        r0.setMax(r1);
        r0 = 2131427576; // 0x7f0b00f8 float:1.8476772E38 double:1.053065142E-314;
        r0 = r11.findViewById(r0);
        r11.L = r0;
        r0 = 2131427556; // 0x7f0b00e4 float:1.8476732E38 double:1.053065132E-314;
        r0 = r11.findViewById(r0);
        r11.u = r0;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 9;
        if (r0 < r1) goto L_0x01f8;
    L_0x01f2:
        r0 = android.hardware.Camera.getNumberOfCameras();
        if (r0 > r6) goto L_0x01ff;
    L_0x01f8:
        r0 = r11.u;
        r0.setVisibility(r8);
        if (r2 == 0) goto L_0x0209;
    L_0x01ff:
        r0 = r11.u;
        r1 = new com.whatsapp.camera.w;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
    L_0x0209:
        r0 = 2131427557; // 0x7f0b00e5 float:1.8476734E38 double:1.0530651325E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r11.w = r0;
        r0 = r11.w;
        r1 = new com.whatsapp.camera.b;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
        r0 = 2131427555; // 0x7f0b00e3 float:1.847673E38 double:1.0530651315E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r11.G = r0;
        r0 = r11.G;
        r1 = new com.whatsapp.camera.q;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < r8) goto L_0x0241;
    L_0x0237:
        r0 = r11.G;
        r1 = new com.whatsapp.camera.g;
        r1.<init>(r11);
        r0.setOnLongClickListener(r1);
    L_0x0241:
        r0 = r11.G;
        r1 = new com.whatsapp.camera.t;
        r1.<init>(r11);
        r0.setOnTouchListener(r1);
        r0 = 2131427687; // 0x7f0b0167 float:1.8476997E38 double:1.0530651967E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r11.o = r0;
        r0 = r11.o;
        r1 = new com.whatsapp.camera.f;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
        r0 = 2131427715; // 0x7f0b0183 float:1.8477054E38 double:1.0530652106E-314;
        r0 = r11.findViewById(r0);
        r0 = (com.whatsapp.ConversationTextEntry) r0;
        r11.I = r0;
        r0 = r11.I;
        r0.setInputEnterDone(r6);
        r0 = r11.I;
        r1 = new android.text.InputFilter[r6];
        r2 = new com.whatsapp.alk;
        r3 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r2.<init>(r3);
        r1[r9] = r2;
        r0.setFilters(r1);
        r0 = r11.I;
        r1 = new com.whatsapp.camera.h;
        r1.<init>(r11);
        r0.setOnEditorActionListener(r1);
        r0 = 2131427884; // 0x7f0b022c float:1.8477397E38 double:1.053065294E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = r11.I;
        r2 = new com.whatsapp.camera.av;
        r2.<init>(r11, r0);
        r1.addTextChangedListener(r2);
        r0 = new com.whatsapp.camera.c;
        r0.<init>(r11, r11);
        r11.J = r0;
        r0 = r11.J;
        r1 = new com.whatsapp.camera.ak;
        r1.<init>(r11);
        r0.a(r1);
        r0 = 2131427572; // 0x7f0b00f4 float:1.8476764E38 double:1.05306514E-314;
        r0 = r11.findViewById(r0);
        r11.K = r0;
        r0 = 2131427573; // 0x7f0b00f5 float:1.8476766E38 double:1.0530651404E-314;
        r0 = r11.findViewById(r0);
        r11.x = r0;
        r0 = r11.t;
        r0 = r0.getViewTreeObserver();
        r1 = r11.M;
        r0.addOnGlobalLayoutListener(r1);
        goto L_0x0047;
    L_0x02cd:
        r1 = r0;
        goto L_0x013c;
    L_0x02d0:
        r1 = r0;
        goto L_0x013c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraActivity.onCreate(android.os.Bundle):void");
    }

    static void a(CameraActivity cameraActivity, boolean z, View view) {
        cameraActivity.a(z, view);
    }

    public CameraActivity() {
        this.q = true;
        this.s = new a(this);
        this.M = new e(this);
    }

    static void a(CameraActivity cameraActivity, boolean z) {
        cameraActivity.a(z);
    }

    static ShutterOverlay o(CameraActivity cameraActivity) {
        return cameraActivity.D;
    }

    static ZoomOverlay g(CameraActivity cameraActivity) {
        return cameraActivity.n;
    }

    static void a(CameraActivity cameraActivity, Uri uri) {
        cameraActivity.a(uri);
    }

    private void a(Uri uri) {
        Bitmap g;
        Throwable e;
        try {
            Log.i(O[5]);
            if (this.z == null) {
                this.H.setText(R.string.camera_photo_preview_title);
            }
            this.m = uri;
            this.v = new File(uri.getPath());
            try {
                g = f.g(uri);
            } catch (OutOfMemoryError e2) {
                e = e2;
                Log.b(O[6], e);
                App.b((Context) this, (int) R.string.camera_failed, 1);
                finish();
                g = null;
                if (g == null) {
                    try {
                        Log.e(O[7]);
                        App.b((Context) this, (int) R.string.camera_failed, 1);
                        finish();
                    } catch (OutOfMemoryError e3) {
                        throw e3;
                    }
                }
                this.y.removeView(this.k);
                this.t.setVisibility(0);
                this.K.setVisibility(0);
                this.x.setVisibility(0);
                this.A.setVisibility(8);
                findViewById(R.id.video_holder).setVisibility(8);
                this.p.setVisibility(0);
                this.p.b(true);
                this.p.a(g);
                this.K.setOnClickListener(new l(this, uri));
                this.x.setOnClickListener(new a5(this));
                findViewById(R.id.ok).setOnClickListener(new m(this, uri));
                findViewById(R.id.cancel).setOnClickListener(new n(this));
            } catch (IOException e4) {
                e = e4;
                Log.b(O[6], e);
                App.b((Context) this, (int) R.string.camera_failed, 1);
                finish();
                g = null;
                if (g == null) {
                    Log.e(O[7]);
                    App.b((Context) this, (int) R.string.camera_failed, 1);
                    finish();
                }
                this.y.removeView(this.k);
                this.t.setVisibility(0);
                this.K.setVisibility(0);
                this.x.setVisibility(0);
                this.A.setVisibility(8);
                findViewById(R.id.video_holder).setVisibility(8);
                this.p.setVisibility(0);
                this.p.b(true);
                this.p.a(g);
                this.K.setOnClickListener(new l(this, uri));
                this.x.setOnClickListener(new a5(this));
                findViewById(R.id.ok).setOnClickListener(new m(this, uri));
                findViewById(R.id.cancel).setOnClickListener(new n(this));
            } catch (bx e5) {
                e = e5;
                Log.b(O[6], e);
                App.b((Context) this, (int) R.string.camera_failed, 1);
                finish();
                g = null;
                if (g == null) {
                    Log.e(O[7]);
                    App.b((Context) this, (int) R.string.camera_failed, 1);
                    finish();
                }
                this.y.removeView(this.k);
                this.t.setVisibility(0);
                this.K.setVisibility(0);
                this.x.setVisibility(0);
                this.A.setVisibility(8);
                findViewById(R.id.video_holder).setVisibility(8);
                this.p.setVisibility(0);
                this.p.b(true);
                this.p.a(g);
                this.K.setOnClickListener(new l(this, uri));
                this.x.setOnClickListener(new a5(this));
                findViewById(R.id.ok).setOnClickListener(new m(this, uri));
                findViewById(R.id.cancel).setOnClickListener(new n(this));
            }
            if (g == null) {
                Log.e(O[7]);
                App.b((Context) this, (int) R.string.camera_failed, 1);
                finish();
            }
            this.y.removeView(this.k);
            this.t.setVisibility(0);
            this.K.setVisibility(0);
            this.x.setVisibility(0);
            this.A.setVisibility(8);
            findViewById(R.id.video_holder).setVisibility(8);
            this.p.setVisibility(0);
            this.p.b(true);
            this.p.a(g);
            this.K.setOnClickListener(new l(this, uri));
            this.x.setOnClickListener(new a5(this));
            findViewById(R.id.ok).setOnClickListener(new m(this, uri));
            findViewById(R.id.cancel).setOnClickListener(new n(this));
        } catch (OutOfMemoryError e32) {
            throw e32;
        }
    }
}
