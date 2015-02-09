package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.Voip.CallInfo;
import com.whatsapp.Voip.CallState;
import com.whatsapp.util.Log;
import java.util.Collection;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class VoipActivity extends DialogToastFragmentActivity implements anq, s1 {
    private static final String[] z;
    private boolean f;
    private TextView g;
    private ServiceConnection h;
    private String i;
    private String j;
    private TextView k;
    private VoiceService l;
    private final Runnable m;

    public class ReplyWithMessageDialogFragment extends DialogFragment {
        public Dialog onCreateDialog(Bundle bundle) {
            Builder builder = new Builder(getActivity());
            CharSequence[] stringArray = getResources().getStringArray(R.array.incoming_call_reply_messages);
            builder.setItems(stringArray, new d5(this, stringArray));
            Dialog create = builder.create();
            create.setCanceledOnTouchOutside(true);
            return create;
        }
    }

    static {
        String[] strArr = new String[32];
        String str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\b##=\u0005\b21~\u0018F'7d\u0005\u0010/ iL\u000f5tv\u0005\b/'x\u0005\b!x0\b\tf:\u007f\u0018\u000e/:w";
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
                        i3 = 84;
                        break;
                    case ay.f /*1*/:
                        i3 = 16;
                        break;
                    case ay.n /*2*/:
                        i3 = 108;
                        break;
                    case ay.p /*3*/:
                        i3 = 102;
                        break;
                    default:
                        i3 = 70;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ">y\b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "7\u007f\u0001H1<q\u0018\u0015'$`B\u000f( u\u0002\u0012h5s\u0018\u000f):>-%\u0005\u0011@89\u0005\u0015\\ ";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "x0\r\u00052=\u007f\u0002F";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\t(\u001au\u001b/( u\u0002\u0012f";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\u0005'8|C\u0003(0";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "'d\r\u00142\u000bs\r\n*";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "2b\u0003\u000b\u00055|\u0000() y\n\u000f%5d\u0005\t(";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\t(\u0017b\t\u000721";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\u000541q\u0018\u0003i7q\u0000\n\u0019:\u007f\u00189'7d\u0005\u0010#";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ">y\b";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ">y\b";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ">y\b";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\u001360q\u0018\u0003\u00055|\u0000525d\u0019\u0015\u00045bC\b38|";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\t(\u0007d\u0003\u0016";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\u001360q\u0018\u0003\u0013=C\u0018\u0007210\n\u000f(=c\u0004\u000f(30\b\tf:\u007f\u0018F3$t\r\u0012#";
                    obj = 15;
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    strArr2 = strArr3;
                    str = "\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iL\u0014#%e\t\u00152=~\u000bF6&\u007f\n\u000f*10\u0005\u000b'3uL\t tc\u0005\u001c#n0";
                    obj = 16;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\u0005'8|C\u0014#>u\u000f\u0012";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\u0005'8|C\u0007%7u\u001c\u0012";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\u001360q\u0018\u0003\u0004!d\u0018\t(\u0007d\r\u0012#'";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\u001360q\u0018\u0003\u0004!d\u0018\t(\u0007d\r\u0012#'?\r\b5#u\u001e%'8|:\u000f##?\u001a\u000f5=r\u0000\u0003";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\u001360q\u0018\u0003\u0004!d\u0018\t(\u0007d\r\u0012#'?\u0002\u0013*8";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\t(\u0004q\u0019\u0015#";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\t(\u0007d\r\u00142ts\r\n*\u000b~\u0003\u0012\u00195s\u0018\u000f01<L\u0000/:y\u001f\u000e/:w";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\t(\u0007d\r\u00142";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "7q\u0000\n'6y\u0000\u000f2-0\u000f\u000e':w\t\u0002f2\u007f\u001eF";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "tg\u0004\u000f*10\u001a\u000f##y\u0002\u0001f\"\u007f\u0005\u0016f5s\u0018\u000f0=d\u0015";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\u0005'8|?\u0012' u/\u000e':w\t\u0002f=~\n\tfi-L(\u0013\u0018\\L\u0000/:y\u001f\u000e/:wL\u00053&b\t\b2tq\u000f\u0012/\"y\u0018\u001f";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\t(\u0010u\u001f\u00124;i";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\t(\u001fu\u0015\")#~";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\"\u007f\u0005\u0016i\u0002\u007f\u0005\u0016\u00077d\u0005\u0010/ iC\t(\u0006u\u001f\u0013+1";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "x0\u0005\u0015f2y\u0002\u000f5<y\u0002\u0001f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void b(String str) {
    }

    static void e(VoipActivity voipActivity) {
        voipActivity.g();
    }

    private void h() {
        Log.i(z[19]);
        if (this.l != null) {
            this.l.x();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r5, long r6, boolean r8) {
        /*
        r4_this = this;
        if (r5 == 0) goto L_0x0013;
    L_0x0002:
        r0 = r4.g;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r6 / r2;
        r1 = android.text.format.DateUtils.formatElapsedTime(r2);
        r0.setText(r1);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x001d;
    L_0x0013:
        if (r8 == 0) goto L_0x001d;
    L_0x0015:
        r0 = r4.g;
        r1 = 2131624656; // 0x7f0e02d0 float:1.8876498E38 double:1.0531625124E-314;
        r0.setText(r1);
    L_0x001d:
        r0 = 2131428066; // 0x7f0b02e2 float:1.8477766E38 double:1.053065384E-314;
        r0 = r4.findViewById(r0);
        if (r0 == 0) goto L_0x003e;
    L_0x0026:
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x003e;
    L_0x002c:
        r0 = 2131428067; // 0x7f0b02e3 float:1.8477768E38 double:1.0530653845E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        if (r0 == 0) goto L_0x003e;
    L_0x0037:
        r1 = com.whatsapp.Voip.getStreamStatistics();
        r0.setText(r1);
    L_0x003e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoipActivity.a(boolean, long, boolean):void");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return (this.l == null || this.l.d() || !this.l.w()) ? super.dispatchTouchEvent(motionEvent) : true;
    }

    public void c(String str) {
        if (TextUtils.equals(str, this.j)) {
            Log.w(z[26] + str + z[27]);
        }
    }

    public void b(CallInfo callInfo) {
        int i = 0;
        if (callInfo != null) {
            CallState callState = callInfo.getCallState();
            if (callState != CallState.NONE && callState != CallState.RECEIVED_CALL) {
                int i2;
                View findViewById = findViewById(R.id.speaker_btn_on);
                View findViewById2 = findViewById(R.id.bluetooth_btn_on);
                View findViewById3 = findViewById(R.id.mute_btn_on);
                View findViewById4 = findViewById(R.id.bluetooth_btn_layout);
                if (findViewById != null) {
                    i2 = (this.l == null || !this.l.d()) ? 4 : 0;
                    findViewById.setVisibility(i2);
                }
                if (findViewById3 != null) {
                    if (this.l == null || !this.l.g()) {
                        i2 = 4;
                    } else {
                        i2 = 0;
                    }
                    findViewById3.setVisibility(i2);
                }
                if (findViewById4 != null) {
                    int i3;
                    if (this.l == null || !this.l.A()) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    findViewById4.setVisibility(i2);
                    if (i3 != 0 && findViewById2 != null) {
                        if (this.l == null || !this.l.i()) {
                            i = 4;
                        }
                        findViewById2.setVisibility(i);
                    }
                }
            }
        }
    }

    public Activity a() {
        return this;
    }

    static boolean a(VoipActivity voipActivity, boolean z) {
        voipActivity.f = z;
        return z;
    }

    public void a(CallState callState, CallInfo callInfo) {
        if (callInfo == null) {
            Log.w(z[28]);
            finish();
            return;
        }
        runOnUiThread(new at8(this, callInfo.getCallState()));
    }

    private void d() {
        if (isFinishing()) {
            Log.i(z[16]);
            return;
        }
        this.k.setText(App.P.a(this.j).a((Context) this));
        CallInfo callInfo = Voip.getCallInfo();
        c(callInfo);
        a(callInfo);
        b(callInfo);
    }

    static VoiceService a(VoipActivity voipActivity) {
        return voipActivity.l;
    }

    static String c(VoipActivity voipActivity) {
        return voipActivity.j;
    }

    static String a(VoipActivity voipActivity, String str) {
        voipActivity.j = str;
        return str;
    }

    private void g() {
        Log.i(z[6]);
        if (this.l != null) {
            this.l.v();
        }
        d();
        finish();
    }

    public void a(Collection collection) {
    }

    static Runnable d(VoipActivity voipActivity) {
        return voipActivity.m;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(com.whatsapp.Voip.CallInfo r12) {
        /*
        r11_this = this;
        r3 = 1;
        r6 = 8;
        r4 = 0;
        r7 = com.whatsapp.App.az;
        if (r12 == 0) goto L_0x003f;
    L_0x0008:
        r0 = r12.getCallState();
        r1 = com.whatsapp.Voip.CallState.NONE;
        if (r0 == r1) goto L_0x003f;
    L_0x0010:
        r2 = r3;
    L_0x0011:
        r0 = 2131428045; // 0x7f0b02cd float:1.8477723E38 double:1.0530653736E-314;
        r0 = r11.findViewById(r0);
        r1 = 2131428046; // 0x7f0b02ce float:1.8477725E38 double:1.053065374E-314;
        r1 = r11.findViewById(r1);
        r5 = 2131428048; // 0x7f0b02d0 float:1.847773E38 double:1.053065375E-314;
        r5 = r11.findViewById(r5);
        r8 = 2131428051; // 0x7f0b02d3 float:1.8477736E38 double:1.0530653766E-314;
        r8 = r11.findViewById(r8);
        if (r0 == 0) goto L_0x0035;
    L_0x002f:
        if (r1 == 0) goto L_0x0035;
    L_0x0031:
        if (r5 == 0) goto L_0x0035;
    L_0x0033:
        if (r8 != 0) goto L_0x0041;
    L_0x0035:
        r0 = z;
        r1 = 22;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x003e:
        return;
    L_0x003f:
        r2 = r4;
        goto L_0x0011;
    L_0x0041:
        if (r12 == 0) goto L_0x0062;
    L_0x0043:
        r9 = r12.getCallState();
        r10 = com.whatsapp.Voip.CallState.RECEIVED_CALL;
        if (r9 != r10) goto L_0x0062;
    L_0x004b:
        r9 = z;
        r10 = 21;
        r9 = r9[r10];
        com.whatsapp.util.Log.i(r9);
        r0.setVisibility(r4);
        r1.setVisibility(r4);
        r5.setVisibility(r6);
        r8.setVisibility(r6);
        if (r7 == 0) goto L_0x003e;
    L_0x0062:
        r9 = z;
        r10 = 20;
        r9 = r9[r10];
        com.whatsapp.util.Log.i(r9);
        r0.setVisibility(r6);
        r1.setVisibility(r6);
        r5.setVisibility(r4);
        r8.setVisibility(r4);
        r0 = 2131428050; // 0x7f0b02d2 float:1.8477734E38 double:1.053065376E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r1 = 2131428049; // 0x7f0b02d1 float:1.8477732E38 double:1.0530653756E-314;
        r1 = r11.findViewById(r1);
        r1 = (android.widget.ImageButton) r1;
        if (r2 != 0) goto L_0x00e2;
    L_0x008b:
        r5 = r3;
    L_0x008c:
        r0.setEnabled(r5);
        r1.setEnabled(r2);
        r0.setVisibility(r6);
        r2 = r1.isEnabled();
        if (r2 == 0) goto L_0x00e4;
    L_0x009b:
        r2 = r4;
    L_0x009c:
        r1.setVisibility(r2);
        r2 = r0.getLayoutParams();
        r2 = (android.widget.LinearLayout.LayoutParams) r2;
        r5 = r0.isEnabled();
        if (r5 == 0) goto L_0x00c1;
    L_0x00ab:
        r1 = r1.isEnabled();
        if (r1 == 0) goto L_0x00c1;
    L_0x00b1:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r11.getResources();
        r5 = r5.getDisplayMetrics();
        r1 = android.util.TypedValue.applyDimension(r3, r1, r5);
        if (r7 == 0) goto L_0x00c2;
    L_0x00c1:
        r1 = 0;
    L_0x00c2:
        r3 = com.whatsapp.App.ax;
        if (r3 == 0) goto L_0x00e6;
    L_0x00c6:
        r3 = r4;
    L_0x00c7:
        r5 = com.whatsapp.App.ax;
        if (r5 == 0) goto L_0x00cc;
    L_0x00cb:
        r4 = (int) r1;
    L_0x00cc:
        r1 = r2.topMargin;
        r5 = r2.bottomMargin;
        r2.setMargins(r3, r1, r4, r5);
        r1 = r0.getParent();
        if (r1 == 0) goto L_0x003e;
    L_0x00d9:
        r0 = r0.getParent();
        r0.requestLayout();
        goto L_0x003e;
    L_0x00e2:
        r5 = r4;
        goto L_0x008c;
    L_0x00e4:
        r2 = r6;
        goto L_0x009c;
    L_0x00e6:
        r3 = (int) r1;
        goto L_0x00c7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoipActivity.c(com.whatsapp.Voip$CallInfo):void");
    }

    public void a(String str) {
    }

    public void b() {
        b(Voip.getCallInfo());
    }

    protected void onPause() {
        Log.i(z[23]);
        super.onPause();
        if (this.f) {
            unbindService(this.h);
            this.f = false;
        }
    }

    static void f(VoipActivity voipActivity) {
        voipActivity.d();
    }

    public void a() {
    }

    protected void onStart() {
        Log.i(z[25]);
        super.onStart();
        if (Voip.f()) {
            d();
            e();
            return;
        }
        finish();
        Log.e(z[24]);
    }

    protected void onNewIntent(Intent intent) {
        String action = intent.getAction();
        Log.i(z[5] + intent + z[4] + action + z[1] + isFinishing());
        super.onNewIntent(intent);
        if (z[3].equals(action)) {
            h();
            if (App.az == 0) {
                return;
            }
        }
        if (isFinishing()) {
            Log.e(z[0]);
            return;
        }
        setIntent(intent);
        this.j = intent.getStringExtra(z[2]);
        if (TextUtils.isEmpty(this.j)) {
            this.j = Voip.getPeerJid();
        }
        d();
        e();
    }

    public void e(String str) {
        this.i = str;
    }

    private void e() {
        int width = getWindowManager().getDefaultDisplay().getWidth();
        Log.i(z[17] + width);
        a5w.a(new y_(this, width), new Void[0]);
    }

    static void b(VoipActivity voipActivity) {
        voipActivity.f();
    }

    protected void onCreate(Bundle bundle) {
        int i = 0;
        Log.i(z[9]);
        super.onCreate(bundle);
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null || callInfo.getCallState() == CallState.NONE) {
            finish();
            if (getIntent().getBooleanExtra(z[8], false)) {
                a5n.c().b();
                Intent intent = new Intent(z[7], null, App.p, VoiceService.class);
                intent.putExtra(z[12], getIntent().getStringExtra(z[13]));
                startService(intent);
                if (App.az == 0) {
                    return;
                }
            }
            Log.e(z[10]);
            return;
        }
        a(false);
        getWindow().addFlags(2621440);
        if (!callInfo.isCaller() && callInfo.getCallState() == CallState.RECEIVED_CALL) {
            getWindow().addFlags(128);
        }
        setContentView(b7.a(getLayoutInflater(), R.layout.voip_activity, null));
        this.g = (TextView) findViewById(R.id.call_status);
        this.k = (TextView) findViewById(R.id.name);
        Button button = (Button) findViewById(R.id.debug_btn);
        button.setText(R.string.menuitem_debug);
        button.setOnClickListener(new _8(this));
        if (App.aa < 3) {
            i = 4;
        }
        button.setVisibility(i);
        findViewById(R.id.voip_call_btn).setOnClickListener(new akh(this));
        findViewById(R.id.end_call_btn).setOnClickListener(new a1p(this));
        findViewById(R.id.mute_btn).setOnClickListener(new sp(this));
        findViewById(R.id.chat_btn).setOnClickListener(new rr(this));
        findViewById(R.id.speaker_btn).setOnClickListener(new rx(this));
        findViewById(R.id.bluetooth_btn).setOnClickListener(new ck(this));
        ((AnswerCallView) findViewById(R.id.answer_call_slider)).setAnswerCallListener(new b4(this));
        findViewById(R.id.reject_with_message).setOnClickListener(new u_(this));
        intent = getIntent();
        setIntent(intent);
        this.j = intent.getStringExtra(z[11]);
        if (TextUtils.isEmpty(this.j)) {
            this.j = Voip.getPeerJid();
        }
        App.b((anq) this);
    }

    protected void onStop() {
        Log.i(z[15]);
        super.onStop();
    }

    static void g(VoipActivity voipActivity) {
        voipActivity.h();
    }

    static VoiceService a(VoipActivity voipActivity, VoiceService voiceService) {
        voipActivity.l = voiceService;
        return voiceService;
    }

    protected void onResume() {
        Log.i(z[31]);
        super.onResume();
        bindService(new Intent(this, VoiceService.class), this.h, 1);
    }

    private void a(CallInfo callInfo) {
        int i = App.az;
        if (this.g == null) {
            Log.e(z[14]);
            return;
        }
        if (callInfo != null) {
            if (callInfo.getCallState() == CallState.ACTIVE) {
                this.g.setText(DateUtils.formatElapsedTime((System.currentTimeMillis() - callInfo.getCallActiveTime()) / 1000));
                if (i == 0) {
                    return;
                }
            }
            if (callInfo.isCaller()) {
                if (this.l != null && this.l.u()) {
                    this.g.setText(R.string.peer_in_another_call);
                    if (i == 0) {
                        return;
                    }
                }
                this.g.setText(R.string.voip_call_outgoing);
                if (i == 0) {
                    return;
                }
            }
            this.g.setText(R.string.voip_call_incoming);
            if (i == 0) {
                return;
            }
        }
        this.g.setText(null);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Log.i(z[30]);
        if (this.l != null) {
            this.l.t();
        }
        return false;
    }

    public VoipActivity() {
        this.m = new fn(this);
        this.h = new am_(this);
    }

    private void f() {
        Log.i(z[18]);
        if (this.l != null) {
            this.l.a();
        }
        d();
        finish();
    }

    public void d(String str) {
        if (TextUtils.equals(str, this.j)) {
            e();
        }
    }

    protected void onDestroy() {
        Log.i(z[29]);
        super.onDestroy();
        App.a((anq) this);
        if (isFinishing() && this.i != null) {
            App.b(App.p, this.i, 1);
        }
    }
}
