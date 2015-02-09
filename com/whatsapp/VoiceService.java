package com.whatsapp;

import android.app.Notification;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.Ringtone;
import android.media.SoundPool;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Vibrator;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.actionbarsherlock.R;
import com.whatsapp.Voip.CallInfo;
import com.whatsapp.Voip.CallState;
import com.whatsapp.Voip.DebugTapType;
import com.whatsapp.Voip.EventCallback;
import com.whatsapp.Voip.RecordingInfo;
import com.whatsapp.messaging.a_;
import com.whatsapp.protocol.VoipOptions;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.bj;
import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;
import com.whatsapp.util.bn;
import com.whatsapp.util.p;
import de.greenrobot.event.g;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class VoiceService extends Service implements a_ {
    private static final String[] E;
    private static final Object n;
    private static final ThreadPoolExecutor o;
    private WakeLock A;
    private boolean B;
    private BluetoothAdapter C;
    private int D;
    private WakeLock a;
    private bn b;
    private p c;
    private boolean d;
    private boolean e;
    private Handler f;
    private Ringtone g;
    private boolean h;
    private final a36 i;
    private s1 j;
    private BroadcastReceiver k;
    private BroadcastReceiver l;
    private BroadcastReceiver m;
    private boolean p;
    private a37 q;
    private PhoneStateListener r;
    private Handler s;
    private azm t;
    private boolean u;
    private VoiceServiceEventCallback v;
    private Handler w;
    private SoundPool x;
    private long[] y;
    private BroadcastReceiver z;

    public class VoiceServiceEventCallback implements EventCallback {
        private static final String[] z;
        protected i6 bufferQueue;
        final VoiceService this$0;

        static {
            String[] strArr = new String[48];
            String str = "\\+50";
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
                            i3 = 47;
                            break;
                        case ay.f /*1*/:
                            i3 = 95;
                            break;
                        case ay.n /*2*/:
                            i3 = 90;
                            break;
                        case ay.p /*3*/:
                            i3 = 64;
                            break;
                        default:
                            i3 = 58;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "\u0003\u007f";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "L>4`T@+z&SA;z-_\\,;'_\u000f";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        str = "\u0015<;,V|+;4_l7;.]J;r";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "]:<2_\\7\u0005.U[6<)YN+3/T";
                        obj = 4;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "L>4`T@+z&SA;z-_\\,;'_\u000f";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case aV.r /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "\u0015/h0n]>43J@-.\r_K6;\u0003HJ>.%|N66%^";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case aV.i /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "\u0015<;,V`9<%H|:44";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case a8.s /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "\u0015,?.^`9<%Hi>3,_K";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case a8.n /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "\u0015<;,V`9<%Hn<1%^x6.(hJ3;9sA95";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case a6.D /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "\u0015/h0n]>43J@-.\u0013NN-.\u0006[F3?$";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case a6.h /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "\u0015/;#QJ+\b8nF2?/O[";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case a6.e /*11*/:
                        strArr2[i] = str;
                        i = 13;
                        str = "\u001564#UB/;4SM3?\u0013H[/\u0011%Cj'9([A8?";
                        obj = 12;
                        strArr2 = strArr3;
                        break;
                    case a6.s /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        str = "\u0015<;,Vf1.%H]**4_K";
                        obj = 13;
                        strArr2 = strArr3;
                        break;
                    case a6.z /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = "\u0015/h0tJ854SN+3/T|*9#_\\,";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                        strArr2[i] = str;
                        i = 16;
                        str = "\u0015>/$S@\u00164)Nj-(/H";
                        obj = 15;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeBackground /*15*/:
                        strArr2[i] = str;
                        i = 17;
                        str = "\u0015<;,V}:)5WJ;";
                        obj = 16;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                        strArr2[i] = str;
                        i = 18;
                        str = "\u00157;.^C:\u0015&\\J-\u001c!SC:>";
                        obj = 17;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                        strArr2[i] = str;
                        i = 19;
                        str = "\u0015<;,V`9<%H}:9%SY:>";
                        obj = 18;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                        strArr2[i] = str;
                        i = 20;
                        str = "\u0015/;#QJ+\u000e8nF2?/O[";
                        obj = 19;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                        strArr2[i] = str;
                        i = 21;
                        str = "Z19!VC>8,_";
                        obj = 20;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_buttonStyleSmall /*20*/:
                        strArr2[i] = str;
                        i = 22;
                        str = "M*)9";
                        obj = 21;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_selectableItemBackground /*21*/:
                        strArr2[i] = str;
                        i = 23;
                        str = "\u0015<;,V}:0%Y[\r?#_F)?$\u0012";
                        obj = 22;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_windowContentOverlay /*22*/:
                        strArr2[i] = str;
                        i = 24;
                        str = "\u0015/h0n]>43J@-.\u0012_\\+;2N|*9#_\\,";
                        obj = 23;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                        strArr2[i] = str;
                        i = 25;
                        str = "\u0015-?,[V\u001a6%Y[65.iJ1>\u0006[F3?$";
                        obj = 24;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                        strArr2[i] = str;
                        i = 26;
                        str = "\u0015-?,[V\u001c(%[[:\t5YL:)3";
                        obj = 25;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textAppearanceSmall /*25*/:
                        strArr2[i] = str;
                        i = 27;
                        str = "\u0015/h0tJ854SN+3/Ti>3,_K";
                        obj = 26;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textColorPrimary /*26*/:
                        strArr2[i] = str;
                        i = 28;
                        str = "\u0015<;,Vn<9%J[\u0019;)VJ;";
                        obj = 27;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                        strArr2[i] = str;
                        i = 29;
                        str = "\u0015:(2U]\u0018;4RJ-3.]g0)4yN1>)^N+?3";
                        obj = 28;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                        strArr2[i] = str;
                        i = 30;
                        str = "\u0015233IF1=\u0012_C>#\tTI0";
                        obj = 29;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_spinnerItemStyle /*29*/:
                        strArr2[i] = str;
                        i = 31;
                        str = "\u0015(3,Vl-?!NJ\f55TK\u000f52N";
                        obj = 30;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                        strArr2[i] = str;
                        i = 32;
                        str = "\u00152?$SN\f.2_N2\t4[]+\u001f2H@-";
                        obj = 31;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                        strArr2[i] = str;
                        i = 33;
                        str = "\u0015<;,Vn<9%J[\r?#_F)?$";
                        obj = 32;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchDropdownBackground /*32*/:
                        strArr2[i] = str;
                        i = 34;
                        str = "\u0015<;,Vj1>)TH\u007fr$O]>.)UAb";
                        obj = 33;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                        strArr2[i] = str;
                        i = 35;
                        str = "\u0015<;,Vj1>)TH";
                        obj = 34;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewGoIcon /*34*/:
                        strArr2[i] = str;
                        i = 36;
                        str = "L>4`T@+z&SA;z-_\\,;'_\u000f";
                        obj = 35;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                        strArr2[i] = str;
                        i = 37;
                        str = "X:z!HJ\u007f4/N\u000f64`[\u000f>94SY:z#[C3";
                        obj = 36;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                        strArr2[i] = str;
                        i = 38;
                        str = "\u0015<;,Vn<9%J[\f?.N";
                        obj = 37;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewEditQuery /*37*/:
                        strArr2[i] = str;
                        i = 39;
                        str = "\u0015,55TK\u000f52Nl-?!NJ\u0019;)VJ;";
                        obj = 38;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                        strArr2[i] = str;
                        i = 40;
                        str = "\u0015/h0n]>43J@-.\u0003HJ>.%|N66%^";
                        obj = 39;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewTextField /*39*/:
                        strArr2[i] = str;
                        i = 41;
                        str = "\u0015>/$S@\f.2_N2\t4[]+?$";
                        obj = 40;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                        strArr2[i] = str;
                        i = 42;
                        str = "\u00152?$SN\f.2_N2\u001f2H@-";
                        obj = 41;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textColorSearchUrl /*41*/:
                        strArr2[i] = str;
                        i = 43;
                        str = "\u0015<;,V`9<%Ha>9+_K";
                        obj = 42;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                        strArr2[i] = str;
                        i = 44;
                        str = "\u0015+(!T\\/52Nl>4$iJ1>\u0006[F3?$";
                        obj = 43;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                        strArr2[i] = str;
                        i = 45;
                        str = "\u00157;.^C:\u001b#YJ/.\u0006[F3?$";
                        obj = 44;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                        strArr2[i] = str;
                        i = 46;
                        str = "\u0015,?.^n<9%J[\u0019;)VJ;";
                        obj = 45;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                        strArr2[i] = str;
                        i = 47;
                        str = "\u0015-?,[V\u0013;4_A<#\u0013_A;\u001c!SC:>";
                        obj = 46;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "\u0015<;,V{:(-SA>.%hJ<?)LJ;";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public void p2pTransportCreateFailed() {
            Log.i(getClass().getName() + z[40]);
            VoiceService.a(this.this$0, null);
        }

        public void callOfferNacked() {
            Log.i(getClass().getName() + z[43]);
            VoiceService.a(this.this$0, null);
        }

        public void callOfferReceived() {
            Log.i(getClass().getName() + z[19]);
        }

        public void incompatibleSrtpKeyExchange() {
            Log.i(getClass().getName() + z[13]);
        }

        public void p2pTransportMediaCreateFailed() {
            Log.i(getClass().getName() + z[7]);
            VoiceService.a(this.this$0, null);
        }

        public void callAcceptReceived() {
            Log.i(getClass().getName() + z[33]);
        }

        public void mediaStreamStartError() {
            Log.i(getClass().getName() + z[32]);
            VoiceService.a(this.this$0, null);
        }

        public void willCreateSoundPort() {
            Log.i(getClass().getName() + z[31]);
        }

        public void transportCandSendFailed() {
            Log.i(getClass().getName() + z[44]);
        }

        public void handleAcceptFailed() {
            Log.i(getClass().getName() + z[45]);
            VoiceService.a(this.this$0, null);
        }

        public void p2pNegotiationSuccess() {
            Log.i(getClass().getName() + z[15]);
        }

        public void relayCreateSuccess() {
            Log.i(getClass().getName() + z[26]);
        }

        public void sendOfferFailed() {
            Log.i(getClass().getName() + z[9]);
        }

        public void audioInitError() {
            Log.i(getClass().getName() + z[16]);
            VoiceService.a(this.this$0, null);
        }

        public void packetTxTimeout() {
            Log.i(getClass().getName() + z[20]);
            VoiceService.a(this.this$0, null);
        }

        public void relayElectionSendFailed() {
            Log.i(getClass().getName() + z[25]);
        }

        public void soundPortCreateFailed() {
            Log.i(getClass().getName() + z[39]);
            VoiceService.a(this.this$0, null);
        }

        public void callOfferAckedWithRelayInfo() {
            Log.i(getClass().getName() + z[10]);
            VoiceService.j(this.this$0).removeMessages(2);
        }

        public VoiceServiceEventCallback(VoiceService voiceService) {
            this.this$0 = voiceService;
            this.bufferQueue = new i6();
        }

        public void sendAcceptFailed() {
            Log.i(getClass().getName() + z[46]);
            this.this$0.t();
        }

        public void packetRxTimeout() {
            Log.i(getClass().getName() + z[12]);
            VoiceService.a(this.this$0, null);
        }

        public void relayLatencySendFailed() {
            Log.i(getClass().getName() + z[47]);
        }

        public void mediaStreamError() {
            Log.i(getClass().getName() + z[42]);
            VoiceService.a(this.this$0, null);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void callStateChanged(com.whatsapp.Voip.CallState r9, com.whatsapp.Voip.CallInfo r10) {
            /*
            r8_this = this;
            r6 = 2;
            r7 = 0;
            r0 = com.whatsapp.App.az;
            r1 = r10.getCallState();
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = r8.getClass();
            r3 = r3.getName();
            r2 = r2.append(r3);
            r3 = z;
            r4 = 4;
            r3 = r3[r4];
            r2 = r2.append(r3);
            r2 = r2.append(r9);
            r3 = z;
            r3 = r3[r6];
            r2 = r2.append(r3);
            r2 = r2.append(r1);
            r3 = 41;
            r2 = r2.append(r3);
            r2 = r2.toString();
            com.whatsapp.util.Log.i(r2);
            if (r1 != r9) goto L_0x0042;
        L_0x0041:
            return;
        L_0x0042:
            r2 = r8.this$0;
            com.whatsapp.VoiceService.a(r2, r1);
            r2 = com.whatsapp.Voip.CallState.ACTIVE;
            if (r1 != r2) goto L_0x0056;
        L_0x004b:
            r2 = r8.this$0;
            r2 = com.whatsapp.VoiceService.j(r2);
            r2.removeCallbacksAndMessages(r7);
            if (r0 == 0) goto L_0x00af;
        L_0x0056:
            r2 = com.whatsapp.Voip.CallState.ACCEPT_RECEIVED;
            if (r1 == r2) goto L_0x005e;
        L_0x005a:
            r2 = com.whatsapp.Voip.CallState.ACCEPT_SENT;
            if (r1 != r2) goto L_0x0075;
        L_0x005e:
            r2 = r8.this$0;
            r2 = com.whatsapp.VoiceService.j(r2);
            r2.removeCallbacksAndMessages(r7);
            r2 = r8.this$0;
            r2 = com.whatsapp.VoiceService.j(r2);
            r3 = 1;
            r4 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
            r2.sendEmptyMessageDelayed(r3, r4);
            if (r0 == 0) goto L_0x00af;
        L_0x0075:
            r2 = com.whatsapp.Voip.CallState.NONE;
            if (r1 == r2) goto L_0x00a2;
        L_0x0079:
            r2 = r8.this$0;
            r2 = com.whatsapp.VoiceService.j(r2);
            r2.removeCallbacksAndMessages(r7);
            r2 = r8.this$0;
            r2 = com.whatsapp.VoiceService.j(r2);
            r3 = 0;
            r4 = 45000; // 0xafc8 float:6.3058E-41 double:2.2233E-319;
            r2.sendEmptyMessageDelayed(r3, r4);
            r2 = r10.isCaller();
            if (r2 == 0) goto L_0x00af;
        L_0x0095:
            r2 = r8.this$0;
            r2 = com.whatsapp.VoiceService.j(r2);
            r4 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
            r2.sendEmptyMessageDelayed(r6, r4);
            if (r0 == 0) goto L_0x00af;
        L_0x00a2:
            r2 = com.whatsapp.Voip.CallState.NONE;
            if (r1 != r2) goto L_0x00af;
        L_0x00a6:
            r2 = r8.this$0;
            r2 = com.whatsapp.VoiceService.j(r2);
            r2.removeCallbacksAndMessages(r7);
        L_0x00af:
            r2 = com.whatsapp.a3u.a;
            r3 = r1.ordinal();
            r2 = r2[r3];
            switch(r2) {
                case 1: goto L_0x013e;
                default: goto L_0x00ba;
            };
        L_0x00ba:
            r2 = r8.this$0;
            r2 = com.whatsapp.VoiceService.m(r2);
            if (r2 == 0) goto L_0x00cb;
        L_0x00c2:
            r2 = r8.this$0;
            r2 = com.whatsapp.VoiceService.m(r2);
            r2.a(r9, r10);
        L_0x00cb:
            r2 = new com.whatsapp.protocol.m;
            r3 = r10.getPeerId();
            r4 = r10.isCaller();
            r5 = r10.getCallId();
            r5 = com.whatsapp.Voip.a(r5);
            r2.<init>(r3, r4, r5);
            r3 = com.whatsapp.Voip.CallState.NONE;
            if (r1 != r3) goto L_0x010f;
        L_0x00e4:
            com.whatsapp.Voip.b();
            r1 = com.whatsapp.App.aJ;
            r1 = r1.b(r2);
            if (r1 == 0) goto L_0x00f4;
        L_0x00ef:
            com.whatsapp.App.p(r1);
            if (r0 == 0) goto L_0x010d;
        L_0x00f4:
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r3 = z;
            r4 = 6;
            r3 = r3[r4];
            r1 = r1.append(r3);
            r1 = r1.append(r2);
            r1 = r1.toString();
            com.whatsapp.util.Log.e(r1);
        L_0x010d:
            if (r0 == 0) goto L_0x0041;
        L_0x010f:
            com.whatsapp.Voip.d();
            r1 = com.whatsapp.Voip.CallState.NONE;
            if (r9 != r1) goto L_0x0041;
        L_0x0116:
            r1 = com.whatsapp.App.aJ;
            r1 = r1.b(r2);
            if (r1 == 0) goto L_0x0123;
        L_0x011e:
            com.whatsapp.App.g(r1);
            if (r0 == 0) goto L_0x0041;
        L_0x0123:
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = z;
            r3 = 3;
            r1 = r1[r3];
            r0 = r0.append(r1);
            r0 = r0.append(r2);
            r0 = r0.toString();
            com.whatsapp.util.Log.e(r0);
            goto L_0x0041;
        L_0x013e:
            r2 = android.os.Build.VERSION.SDK_INT;
            r3 = 16;
            if (r2 < r3) goto L_0x0157;
        L_0x0144:
            r2 = r8.this$0;
            r3 = new android.content.Intent;
            r4 = z;
            r5 = 5;
            r4 = r4[r5];
            r5 = r8.this$0;
            r6 = com.whatsapp.VoiceService.class;
            r3.<init>(r4, r7, r5, r6);
            r2.startService(r3);
        L_0x0157:
            r2 = com.whatsapp.App.aI();
            if (r2 == 0) goto L_0x00ba;
        L_0x015d:
            r2 = r8.this$0;
            com.whatsapp.VoiceService.h(r2);
            goto L_0x00ba;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.VoiceServiceEventCallback.callStateChanged(com.whatsapp.Voip$CallState, com.whatsapp.Voip$CallInfo):void");
        }

        public void callTerminateReceived() {
            Log.i(getClass().getName() + z[1]);
            this.this$0.startService(new Intent(z[0], null, this.this$0, VoiceService.class));
        }

        public void callAcceptSent() {
            Log.i(getClass().getName() + z[38]);
        }

        public void callRejectReceived(String str) {
            int i = App.az;
            Log.i(getClass().getName() + z[23] + str + ')');
            if (z[22].equals(str)) {
                VoiceService.b(this.this$0, true);
                if (i == 0) {
                    return;
                }
            }
            if (z[21].equals(str)) {
                VoiceService.a(this.this$0, this.this$0.getString(R.string.voip_not_allowed_at_this_time, new Object[]{VoiceService.f(this.this$0)}));
                if (i == 0) {
                    return;
                }
            }
            VoiceService.a(this.this$0, null);
        }

        public void callCaptureEnded(DebugTapType debugTapType, RecordingInfo[] recordingInfoArr) {
            VoiceService.p().execute(new qc(this, recordingInfoArr, debugTapType));
        }

        public void handleOfferFailed() {
            Log.i(getClass().getName() + z[18]);
            VoiceService.a(this.this$0, null);
        }

        public void callOfferSent() {
            Log.i(getClass().getName() + z[8]);
        }

        public void callAcceptFailed() {
            Log.i(getClass().getName() + z[28]);
        }

        public void p2pNegotaitionFailed() {
            Log.i(getClass().getName() + z[27]);
        }

        public void p2pTransportStartFailed() {
            Log.i(getClass().getName() + z[11]);
            VoiceService.a(this.this$0, null);
        }

        public void callInterrupted() {
            Log.i(getClass().getName() + z[14]);
        }

        public void missingRelayInfo() {
            Log.i(getClass().getName() + z[30]);
        }

        public byte[] getByteBuffer(int i) {
            return this.bufferQueue.a(i);
        }

        public void callCaptureBufferFilled(DebugTapType debugTapType, byte[] bArr, int i, RecordingInfo[] recordingInfoArr) {
            if (bArr != null && bArr.length > 0 && i > 0 && recordingInfoArr != null) {
                VoiceService.p().execute(new y8(this, recordingInfoArr, debugTapType, bArr, i));
            }
        }

        public void callResumed() {
            Log.i(getClass().getName() + z[17]);
        }

        public void p2pTransportRestartSuccess() {
            Log.i(getClass().getName() + z[24]);
        }

        public void audioStreamStarted() {
            Log.i(getClass().getName() + z[41]);
        }

        public void errorGatheringHostCandidates() {
            Log.i(getClass().getName() + z[29]);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void callEnding() {
            /*
            r11_this = this;
            r10 = 2;
            r0 = 0;
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = r11.getClass();
            r3 = r3.getName();
            r2 = r2.append(r3);
            r3 = z;
            r4 = 35;
            r3 = r3[r4];
            r2 = r2.append(r3);
            r2 = r2.toString();
            com.whatsapp.util.Log.i(r2);
            com.whatsapp.Voip.checkStreamStatistics();
            r4 = com.whatsapp.Voip.getCallInfo();
            if (r4 != 0) goto L_0x0038;
        L_0x002e:
            r0 = z;
            r1 = 37;
            r0 = r0[r1];
            com.whatsapp.util.Log.e(r0);
        L_0x0037:
            return;
        L_0x0038:
            r5 = new com.whatsapp.protocol.m;
            r2 = r4.getPeerId();
            r3 = r4.isCaller();
            r6 = r4.getCallId();
            r6 = com.whatsapp.Voip.a(r6);
            r5.<init>(r2, r3, r6);
            r2 = com.whatsapp.App.aJ;
            r6 = r2.b(r5);
            r2 = r4.getCallActiveTime();
            r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
            if (r7 <= 0) goto L_0x00f6;
        L_0x005b:
            r8 = java.lang.System.currentTimeMillis();
            r2 = r8 - r2;
            r2 = java.lang.Math.max(r0, r2);
        L_0x0065:
            if (r6 == 0) goto L_0x00ad;
        L_0x0067:
            r2 = (int) r2;
            r2 = r2 / 1000;
            r6.p = r2;
            r2 = r4.isEndedByMe();
            if (r2 == 0) goto L_0x0074;
        L_0x0072:
            r0 = 1;
        L_0x0074:
            r6.k = r0;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = r11.getClass();
            r1 = r1.getName();
            r0 = r0.append(r1);
            r1 = z;
            r2 = 34;
            r1 = r1[r2];
            r0 = r0.append(r1);
            r1 = r6.p;
            r0 = r0.append(r1);
            r1 = ")";
            r0 = r0.append(r1);
            r0 = r0.toString();
            com.whatsapp.util.Log.i(r0);
            r0 = com.whatsapp.App.aJ;
            r0.a(r6);
            r0 = com.whatsapp.App.az;
            if (r0 == 0) goto L_0x00c7;
        L_0x00ad:
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = z;
            r2 = 36;
            r1 = r1[r2];
            r0 = r0.append(r1);
            r0 = r0.append(r5);
            r0 = r0.toString();
            com.whatsapp.util.Log.e(r0);
        L_0x00c7:
            r0 = r4.getBytesSent();
            com.whatsapp.d7.a(r0, r10);
            r0 = r4.getBytesReceived();
            com.whatsapp.d7.b(r0, r10);
            r0 = com.whatsapp.App.p;
            r1 = com.whatsapp.Voip.getCallFieldStats();
            com.whatsapp.ak4.a(r0, r1);
            r0 = com.whatsapp.App.aI();
            if (r0 == 0) goto L_0x00e8;
        L_0x00e4:
            r0 = 0;
            com.whatsapp.yf.a(r0);
        L_0x00e8:
            r0 = com.whatsapp.VoiceService.p();
            r1 = new com.whatsapp.a3t;
            r1.<init>(r11);
            r0.execute(r1);
            goto L_0x0037;
        L_0x00f6:
            r2 = r0;
            goto L_0x0065;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.VoiceServiceEventCallback.callEnding():void");
        }
    }

    private void a(String str) {
        Intent intent = new Intent(E[35], null, this, VoiceService.class);
        if (str != null) {
            intent.putExtra(E[34], str);
        }
        startService(intent);
    }

    private void z() {
        Log.i(E[93]);
        this.d = true;
        if (this.j != null) {
            Window window = this.j.a().getWindow();
            View childAt = ((ViewGroup) window.getDecorView().findViewById(16908290)).getChildAt(0);
            if (childAt.getVisibility() == 0) {
                LayoutParams attributes = window.getAttributes();
                attributes.flags |= 1024;
                attributes.screenBrightness = 0.1f;
                if (VERSION.SDK_INT >= 11) {
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 2);
                }
                childAt.setVisibility(4);
                window.setAttributes(attributes);
            }
        }
    }

    public boolean g() {
        return this.e;
    }

    static void a(VoiceService voiceService, String str) {
        voiceService.a(str);
    }

    public void d(String str, String str2) {
        Log.i(E[90]);
    }

    static void b(VoiceService voiceService) {
        voiceService.z();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.Voip.CallState r6) {
        /*
        r5_this = this;
        r4 = 2;
        r1 = com.whatsapp.App.az;
        r0 = E;
        r2 = 41;
        r0 = r0[r2];
        r0 = r5.getSystemService(r0);
        r0 = (android.media.AudioManager) r0;
        r2 = com.whatsapp.a3u.a;
        r3 = r6.ordinal();
        r2 = r2[r3];
        switch(r2) {
            case 1: goto L_0x001b;
            case 2: goto L_0x001b;
            case 3: goto L_0x001b;
            case 4: goto L_0x001b;
            case 5: goto L_0x003a;
            case 6: goto L_0x004b;
            default: goto L_0x001a;
        };
    L_0x001a:
        return;
    L_0x001b:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 11;
        if (r2 < r3) goto L_0x0027;
    L_0x0021:
        r2 = 3;
        r0.setMode(r2);
        if (r1 == 0) goto L_0x002a;
    L_0x0027:
        r0.setMode(r4);
    L_0x002a:
        r2 = r5.j;
        if (r2 == 0) goto L_0x001a;
    L_0x002e:
        r2 = r5.j;
        r2 = r2.a();
        r3 = 0;
        r2.setVolumeControlStream(r3);
        if (r1 == 0) goto L_0x001a;
    L_0x003a:
        r2 = r5.j;
        if (r2 == 0) goto L_0x001a;
    L_0x003e:
        r2 = r5.j;
        r2 = r2.a();
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r2.setVolumeControlStream(r3);
        if (r1 == 0) goto L_0x001a;
    L_0x004b:
        r1 = 1;
        r0.setMode(r1);
        r0 = r5.j;
        if (r0 == 0) goto L_0x001a;
    L_0x0053:
        r0 = r5.j;
        r0 = r0.a();
        r0.setVolumeControlStream(r4);
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.a(com.whatsapp.Voip$CallState):void");
    }

    static void a(VoiceService voiceService) {
        voiceService.c();
    }

    public void a(String str, String str2) {
        Log.i(E[25]);
    }

    private int m() {
        try {
            return PowerManager.class.getDeclaredField(E[108]).getInt(null);
        } catch (NoSuchFieldException e) {
            Log.w(E[107]);
            return -1;
        } catch (IllegalAccessException e2) {
            Log.w(E[109]);
            return -1;
        }
    }

    static void c(VoiceService voiceService, boolean z) {
        voiceService.a(z);
    }

    public boolean A() {
        if (this.C == null || VERSION.SDK_INT < 8) {
            return false;
        }
        if (this.t == azm.CONNECTED) {
            return true;
        }
        if (this.t == azm.DISCONNECTING || this.t == azm.DISCONNECTED || this.t == azm.CONNECTING) {
            return false;
        }
        AudioManager audioManager = (AudioManager) getSystemService(E[45]);
        boolean z = audioManager.isBluetoothScoAvailableOffCall() && (audioManager.isBluetoothA2dpOn() || audioManager.isBluetoothScoOn());
        return z;
    }

    public void j() {
        boolean z;
        AudioManager audioManager = (AudioManager) getSystemService(E[105]);
        if (this.q != a37.SPEAKER) {
            z = true;
        } else {
            z = false;
        }
        Log.i(E[106] + z);
        audioManager.setSpeakerphoneOn(z);
        q();
    }

    static Handler l(VoiceService voiceService) {
        return voiceService.s;
    }

    public void e(String str, String str2) {
        Log.i(E[111]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void y() {
        /*
        r7_this = this;
        r2 = 1;
        r3 = 0;
        r0 = E;
        r1 = 95;
        r0 = r0[r1];
        r0 = r7.getSystemService(r0);
        r0 = (android.media.AudioManager) r0;
        r1 = r7.q;
        r4 = com.whatsapp.a37.BLUETOOTH;
        if (r1 == r4) goto L_0x0045;
    L_0x0014:
        r1 = r2;
    L_0x0015:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = E;
        r6 = 96;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r1);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        if (r1 == 0) goto L_0x003b;
    L_0x0031:
        r0.setBluetoothScoOn(r2);
        r0.startBluetoothSco();
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0041;
    L_0x003b:
        r0.stopBluetoothSco();
        r0.setBluetoothScoOn(r3);
    L_0x0041:
        r7.q();
        return;
    L_0x0045:
        r1 = r3;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.y():void");
    }

    public IBinder onBind(Intent intent) {
        Log.i(E[94] + intent);
        return this.i;
    }

    public void n() {
        boolean z;
        AudioManager audioManager = (AudioManager) getSystemService(E[13]);
        if (this.e) {
            z = false;
        } else {
            z = true;
        }
        this.e = z;
        Log.i(E[12] + this.e);
        Voip.muteCall(this.e);
        if (this.j != null) {
            this.j.b();
        }
    }

    public void a(s1 s1Var) {
        this.j = s1Var;
        if (s1Var != null) {
            a(Voip.getCurrentCallState());
        }
    }

    public void a(bj bjVar, String str, long j, byte[] bArr, int i) {
        Log.i(E[42]);
        Voip.nativeHandleCallRelayElection(bjVar.a, bjVar.b, str, bArr, i);
        App.a(bjVar);
    }

    private void o() {
        PowerManager powerManager = (PowerManager) getSystemService(E[1]);
        if (!powerManager.isScreenOn()) {
            WakeLock newWakeLock = powerManager.newWakeLock(268435466, E[0]);
            if (newWakeLock != null) {
                newWakeLock.acquire();
                newWakeLock.release();
            }
        }
    }

    static Handler j(VoiceService voiceService) {
        return voiceService.w;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.app.Notification l() {
        /*
        r11_this = this;
        r1 = com.whatsapp.App.az;
        r2 = com.whatsapp.Voip.getCallInfo();
        if (r2 != 0) goto L_0x0015;
    L_0x0008:
        r0 = E;	 Catch:{ Exception -> 0x0013 }
        r1 = 57;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0013 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x0013 }
        r0 = 0;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r4 = r2.getCallActiveTime();
        r3 = new android.support.v4.app.NotificationCompat$Builder;
        r3.<init>(r11);
        r0 = com.whatsapp.App.P;
        r6 = r2.getPeerId();
        r6 = r0.d(r6);
        r0 = android.os.Build.VERSION.SDK_INT;
        r7 = 11;
        if (r0 < r7) goto L_0x0097;
    L_0x002e:
        r0 = r11.getResources();
        r7 = 17104901; // 0x1050005 float:2.4428256E-38 double:8.450944E-317;
        r7 = r0.getDimensionPixelSize(r7);
        r0 = r11.getResources();
        r8 = 17104902; // 0x1050006 float:2.442826E-38 double:8.4509445E-317;
        r8 = r0.getDimensionPixelSize(r8);
        r0 = 0;
        if (r6 == 0) goto L_0x0074;
    L_0x0047:
        r9 = java.lang.Math.min(r7, r8);
        r10 = 0;
        r9 = r6.b(r9, r10);
        if (r9 == 0) goto L_0x0058;
    L_0x0052:
        r3.setLargeIcon(r9);
        r0 = 1;
        if (r1 == 0) goto L_0x0074;
    L_0x0058:
        r9 = r6.B;	 Catch:{ Exception -> 0x01bf }
        if (r9 == 0) goto L_0x0074;
    L_0x005c:
        r9 = E;	 Catch:{ Exception -> 0x01c1 }
        r10 = 49;
        r9 = r9[r10];	 Catch:{ Exception -> 0x01c1 }
        com.whatsapp.util.Log.i(r9);	 Catch:{ Exception -> 0x01c1 }
        r9 = new com.whatsapp.vw;	 Catch:{ Exception -> 0x01c1 }
        r10 = java.lang.Math.min(r7, r8);	 Catch:{ Exception -> 0x01c1 }
        r9.<init>(r11, r6, r10);	 Catch:{ Exception -> 0x01c1 }
        r10 = 0;
        r10 = new java.lang.Void[r10];	 Catch:{ Exception -> 0x01c1 }
        com.whatsapp.a5w.a(r9, r10);	 Catch:{ Exception -> 0x01c1 }
    L_0x0074:
        if (r0 != 0) goto L_0x0097;
    L_0x0076:
        r0 = r11.getResources();
        r9 = 2130837650; // 0x7f020092 float:1.728026E38 double:1.0527736797E-314;
        r0 = r0.getDrawable(r9);
        r0 = (android.graphics.drawable.BitmapDrawable) r0;
        r0 = r0.getBitmap();
        r9 = java.lang.Math.min(r7, r8);
        r7 = java.lang.Math.min(r7, r8);
        r8 = 1;
        r0 = android.graphics.Bitmap.createScaledBitmap(r0, r9, r7, r8);
        r3.setLargeIcon(r0);
    L_0x0097:
        r0 = E;	 Catch:{ Exception -> 0x01c3 }
        r7 = 55;
        r0 = r0[r7];	 Catch:{ Exception -> 0x01c3 }
        r3.setCategory(r0);	 Catch:{ Exception -> 0x01c3 }
        r0 = 1;
        r3.setPriority(r0);	 Catch:{ Exception -> 0x01c3 }
        r0 = 2130838997; // 0x7f0205d5 float:1.7282992E38 double:1.052774345E-314;
        r3.setSmallIcon(r0);	 Catch:{ Exception -> 0x01c3 }
        if (r6 != 0) goto L_0x01c5;
    L_0x00ac:
        r0 = r2.getPeerId();	 Catch:{ Exception -> 0x01c3 }
        r0 = com.whatsapp.m8.b(r0);	 Catch:{ Exception -> 0x01c3 }
    L_0x00b4:
        r3.setContentTitle(r0);
        r6 = r2.isCaller();
        r8 = 0;
        r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x01cf;
    L_0x00c1:
        r0 = 2131624634; // 0x7f0e02ba float:1.8876453E38 double:1.0531625015E-314;
    L_0x00c4:
        r0 = r11.getText(r0);	 Catch:{ Exception -> 0x01db }
        r3.setContentText(r0);	 Catch:{ Exception -> 0x01db }
        r8 = 0;
        r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x00da;
    L_0x00d1:
        r0 = 1;
        r3.setUsesChronometer(r0);	 Catch:{ Exception -> 0x01db }
        r3.setWhen(r4);	 Catch:{ Exception -> 0x01db }
        if (r1 == 0) goto L_0x00e5;
    L_0x00da:
        r0 = 0;
        r3.setUsesChronometer(r0);	 Catch:{ Exception -> 0x01dd }
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x01dd }
        r3.setWhen(r8);	 Catch:{ Exception -> 0x01dd }
    L_0x00e5:
        r0 = 1;
        r3.setOngoing(r0);	 Catch:{ Exception -> 0x01df }
        if (r6 != 0) goto L_0x00f1;
    L_0x00eb:
        r6 = 0;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0117;
    L_0x00f1:
        r0 = new android.content.Intent;
        r6 = com.whatsapp.VoiceService.class;
        r0.<init>(r11, r6);
        r6 = E;
        r7 = 53;
        r6 = r6[r7];
        r0.setAction(r6);
        r6 = 0;
        r7 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = android.app.PendingIntent.getService(r11, r6, r0, r7);
        r6 = 2130838789; // 0x7f020505 float:1.728257E38 double:1.0527742425E-314;
        r7 = 2131624440; // 0x7f0e01f8 float:1.887606E38 double:1.0531624056E-314;
        r7 = r11.getText(r7);
        r3.addAction(r6, r7, r0);
        if (r1 == 0) goto L_0x015f;
    L_0x0117:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.VoiceService.class;
        r0.<init>(r11, r1);
        r1 = E;
        r6 = 54;
        r1 = r1[r6];
        r0.setAction(r1);
        r1 = 0;
        r6 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = android.app.PendingIntent.getService(r11, r1, r0, r6);
        r1 = 2130838789; // 0x7f020505 float:1.728257E38 double:1.0527742425E-314;
        r6 = 2131624788; // 0x7f0e0354 float:1.8876766E38 double:1.0531625776E-314;
        r6 = r11.getText(r6);
        r3.addAction(r1, r6, r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.VoipActivity.class;
        r0.<init>(r11, r1);
        r1 = E;
        r6 = 52;
        r1 = r1[r6];
        r0.setAction(r1);
        r1 = 0;
        r6 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = android.app.PendingIntent.getActivity(r11, r1, r0, r6);
        r1 = 2130838780; // 0x7f0204fc float:1.7282552E38 double:1.052774238E-314;
        r6 = 2131624006; // 0x7f0e0046 float:1.887518E38 double:1.053162191E-314;
        r6 = r11.getText(r6);
        r3.addAction(r1, r6, r0);
    L_0x015f:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.VoipActivity.class;
        r0.<init>(r11, r1);
        r1 = E;
        r6 = 56;
        r1 = r1[r6];
        r2 = r2.getPeerId();
        r0.putExtra(r1, r2);
        r1 = 0;
        r2 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = android.app.PendingIntent.getActivity(r11, r1, r0, r2);
        r3.setContentIntent(r0);
        r0 = r3.build();
        r2 = 0;
        r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r1 <= 0) goto L_0x0012;
    L_0x0187:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x01e1 }
        r2 = 16;
        if (r1 < r2) goto L_0x0012;
    L_0x018d:
        r1 = r0.bigContentView;	 Catch:{ Exception -> 0x01e3 }
        if (r1 == 0) goto L_0x0012;
    L_0x0191:
        r1 = E;	 Catch:{ Exception -> 0x01b3 }
        r2 = 50;
        r1 = r1[r2];	 Catch:{ Exception -> 0x01b3 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x01b3 }
        r2 = E;	 Catch:{ Exception -> 0x01b3 }
        r3 = 51;
        r2 = r2[r3];	 Catch:{ Exception -> 0x01b3 }
        r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x01b3 }
        r2 = 0;
        r1 = r1.getInt(r2);	 Catch:{ Exception -> 0x01b3 }
        r2 = r0.bigContentView;	 Catch:{ Exception -> 0x01b3 }
        r3 = 8;
        r2.setViewVisibility(r1, r3);	 Catch:{ Exception -> 0x01b3 }
        goto L_0x0012;
    L_0x01b3:
        r1 = move-exception;
        r2 = E;
        r3 = 48;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
        goto L_0x0012;
    L_0x01bf:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01c1 }
    L_0x01c1:
        r0 = move-exception;
        throw r0;
    L_0x01c3:
        r0 = move-exception;
        throw r0;
    L_0x01c5:
        r0 = r6.a(r11);
        r0 = com.whatsapp.util.a5.a(r0);
        goto L_0x00b4;
    L_0x01cf:
        if (r6 == 0) goto L_0x01d6;
    L_0x01d1:
        r0 = 2131624635; // 0x7f0e02bb float:1.8876455E38 double:1.053162502E-314;
        goto L_0x00c4;
    L_0x01d6:
        r0 = 2131624444; // 0x7f0e01fc float:1.8876068E38 double:1.0531624076E-314;
        goto L_0x00c4;
    L_0x01db:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01dd }
    L_0x01dd:
        r0 = move-exception;
        throw r0;
    L_0x01df:
        r0 = move-exception;
        throw r0;
    L_0x01e1:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01e3 }
    L_0x01e3:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.l():android.app.Notification");
    }

    public void b(bj bjVar, String str, long j, byte[][] bArr, int[] iArr) {
        Log.i(E[59]);
        Voip.nativeHandleCallTransport(bjVar.a, bjVar.b, str, bArr, iArr);
        App.a(bjVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k() {
        /*
        r3_this = this;
        r1 = com.whatsapp.App.az;
        r2 = com.whatsapp.App.aY();
        if (r2 != 0) goto L_0x0010;
    L_0x0008:
        r0 = com.whatsapp.fieldstats.a_.NONE;
        r0 = r0.getCode();
        if (r1 == 0) goto L_0x0021;
    L_0x0010:
        r0 = 1;
        if (r2 != r0) goto L_0x001b;
    L_0x0013:
        r0 = com.whatsapp.fieldstats.a_.WIFI;
        r0 = r0.getCode();
        if (r1 == 0) goto L_0x0021;
    L_0x001b:
        r0 = com.whatsapp.fieldstats.a_.CELLULAR;
        r0 = r0.getCode();
    L_0x0021:
        com.whatsapp.Voip.setNetworkMedium(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.k():void");
    }

    static boolean d(VoiceService voiceService, boolean z) {
        voiceService.u = z;
        return z;
    }

    static Handler i(VoiceService voiceService) {
        return voiceService.f;
    }

    public void onCreate() {
        Log.i(E[110]);
        super.onCreate();
        g.b().a((Object) this);
        Voip.nativeRegisterEventCallback(this.v);
        this.b = new bn(this);
        this.C = BluetoothAdapter.getDefaultAdapter();
        this.r = new zn(this);
        this.z = new BroadcastReceiver() {
            private static final String z;
            final VoiceService a;

            static {
                char[] toCharArray = "\u001e/oRl\u0016%%Im\u000b$eT-\u001e\"\u007fIl\u0011oXcQ:\u0004E\u007fL9\u0007".toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i = 0; length > i; i++) {
                    int i2;
                    char c = cArr[i];
                    switch (i % 5) {
                        case PBE.MD5 /*0*/:
                            i2 = 127;
                            break;
                        case ay.f /*1*/:
                            i2 = 65;
                            break;
                        case ay.n /*2*/:
                            i2 = 11;
                            break;
                        case ay.p /*3*/:
                            i2 = 32;
                            break;
                        default:
                            i2 = 3;
                            break;
                    }
                    cArr[i] = (char) (i2 ^ c);
                }
                z = new String(cArr).intern();
            }

            {
                this.a = r1;
            }

            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals(z)) {
                    this.a.t();
                }
            }
        };
        this.l = new BroadcastReceiver() {
            private static final String z;
            final VoiceService a;

            static {
                char[] toCharArray = "8\rZl\t".toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i = 0; length > i; i++) {
                    int i2;
                    char c = cArr[i];
                    switch (i % 5) {
                        case PBE.MD5 /*0*/:
                            i2 = 75;
                            break;
                        case ay.f /*1*/:
                            i2 = 121;
                            break;
                        case ay.n /*2*/:
                            i2 = 59;
                            break;
                        case ay.p /*3*/:
                            i2 = 24;
                            break;
                        default:
                            i2 = 108;
                            break;
                    }
                    cArr[i] = (char) (i2 ^ c);
                }
                z = new String(cArr).intern();
            }

            public void onReceive(Context context, Intent intent) {
                if (intent.getIntExtra(z, 0) > 0) {
                    VoiceService.a(this.a, true);
                }
                VoiceService.g(this.a);
                if (VoiceService.m(this.a) != null) {
                    VoiceService.m(this.a).b();
                }
            }

            {
                this.a = r1;
            }
        };
        this.k = new BroadcastReceiver() {
            private static final String[] z;
            final VoiceService a;

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
                r4 = 1;
                r1 = 0;
                r0 = 2;
                r3 = new java.lang.String[r0];
                r2 = "`\u001bw\u0003-h\u0011=\u001c'e\u001cr_'y\u0001a\u0010lR6\\.\u0003T1Z>\u001dR!R%\u0007";
                r0 = -1;
                r5 = r3;
                r6 = r3;
                r3 = r1;
            L_0x000b:
                r2 = r2.toCharArray();
                r7 = r2.length;
                r8 = r7;
                r9 = r1;
                r7 = r2;
            L_0x0013:
                if (r8 > r9) goto L_0x002f;
            L_0x0015:
                r2 = new java.lang.String;
                r2.<init>(r7);
                r2 = r2.intern();
                switch(r0) {
                    case 0: goto L_0x002a;
                    default: goto L_0x0021;
                };
            L_0x0021:
                r5[r3] = r2;
                r0 = "`\u001bw\u0003-h\u0011=\u001c'e\u001cr_\u0011B:L0\u0017E<\\.\u0011U4G4\u001dB=R?\u0005D1";
                r2 = r0;
                r3 = r4;
                r5 = r6;
                r0 = r1;
                goto L_0x000b;
            L_0x002a:
                r5[r3] = r2;
                z = r6;
                return;
            L_0x002f:
                r10 = r7[r9];
                r2 = r9 % 5;
                switch(r2) {
                    case 0: goto L_0x0040;
                    case 1: goto L_0x0042;
                    case 2: goto L_0x0045;
                    case 3: goto L_0x0048;
                    default: goto L_0x0036;
                };
            L_0x0036:
                r2 = 66;
            L_0x0038:
                r2 = r2 ^ r10;
                r2 = (char) r2;
                r7[r9] = r2;
                r2 = r9 + 1;
                r9 = r2;
                goto L_0x0013;
            L_0x0040:
                r2 = r4;
                goto L_0x0038;
            L_0x0042:
                r2 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
                goto L_0x0038;
            L_0x0045:
                r2 = 19;
                goto L_0x0038;
            L_0x0048:
                r2 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
                goto L_0x0038;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.AnonymousClass_5.<clinit>():void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onReceive(android.content.Context r5, android.content.Intent r6) {
                /*
                r4_this = this;
                r2 = 1;
                r3 = 0;
                r0 = z;
                r0 = r0[r2];
                r1 = r6.getAction();
                r0 = r0.equals(r1);
                if (r0 == 0) goto L_0x0038;
            L_0x0010:
                r0 = z;
                r0 = r0[r3];
                r1 = -1;
                r0 = r6.getIntExtra(r0, r1);
                if (r0 != r2) goto L_0x0026;
            L_0x001b:
                r1 = r4.a;
                r2 = com.whatsapp.azm.CONNECTED;
                com.whatsapp.VoiceService.a(r1, r2);
                r1 = com.whatsapp.App.az;
                if (r1 == 0) goto L_0x002f;
            L_0x0026:
                if (r0 != 0) goto L_0x002f;
            L_0x0028:
                r0 = r4.a;
                r1 = com.whatsapp.azm.DISCONNECTED;
                com.whatsapp.VoiceService.a(r0, r1);
            L_0x002f:
                r0 = r4.a;
                r0 = com.whatsapp.VoiceService.i(r0);
                r0.sendEmptyMessage(r3);
            L_0x0038:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.AnonymousClass_5.onReceive(android.content.Context, android.content.Intent):void");
            }

            {
                this.a = r1;
            }
        };
        this.m = new BroadcastReceiver() {
            private static final String[] z;
            final VoiceService a;

            static {
                String[] strArr = new String[4];
                String str = " \u0012\u0018}x";
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
                                i3 = 65;
                                break;
                            case ay.f /*1*/:
                                i3 = 103;
                                break;
                            case ay.n /*2*/:
                                i3 = 124;
                                break;
                            case ay.p /*3*/:
                                i3 = 20;
                                break;
                            default:
                                i3 = 23;
                                break;
                        }
                        cArr[i2] = (char) (i3 ^ c);
                    }
                    str = new String(cArr).intern();
                    switch (obj) {
                        case PBE.MD5 /*0*/:
                            strArr2[i] = str;
                            str = " \t\u0018fx(\u0003Rv{4\u0002\b{x5\u000fR|r \u0003\u000fqco\u0017\u000e{q(\u000b\u0019:v\"\u0013\u0015{yo$3ZY\u0004$(]X\u000f8/@V\u0015\"#W_\u0000);QS";
                            i = 2;
                            strArr2 = strArr3;
                            obj = 1;
                            break;
                        case ay.f /*1*/:
                            strArr2[i] = str;
                            i = 3;
                            strArr2 = strArr3;
                            str = " \t\u0018fx(\u0003Rv{4\u0002\b{x5\u000fRde.\u0001\u0015xro\u0002\u0004`e I,FR\u0017.3AD\u001e4(UC\u0004";
                            obj = 2;
                            break;
                        case ay.n /*2*/:
                            strArr2[i] = str;
                            z = strArr3;
                        default:
                            strArr2[i] = str;
                            str = " \t\u0018fx(\u0003Rv{4\u0002\b{x5\u000fRde.\u0001\u0015xro\u0002\u0004`e I/@V\u0015\"";
                            i = 1;
                            strArr2 = strArr3;
                            obj = null;
                            break;
                    }
                }
            }

            {
                this.a = r1;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onReceive(android.content.Context r9, android.content.Intent r10) {
                /*
                r8_this = this;
                r7 = 3;
                r6 = 2;
                r5 = 0;
                r0 = com.whatsapp.App.az;
                r1 = r10.getAction();
                r2 = z;
                r2 = r2[r6];
                r1 = r2.equals(r1);
                if (r1 == 0) goto L_0x0026;
            L_0x0013:
                r1 = z;
                r2 = 1;
                r1 = r1[r2];
                r1 = r10.getIntExtra(r1, r5);
                r2 = z;
                r2 = r2[r7];
                r2 = r10.getIntExtra(r2, r5);
                if (r1 != r2) goto L_0x0027;
            L_0x0026:
                return;
            L_0x0027:
                r3 = r8.a;
                com.whatsapp.VoiceService.e(r3);
                switch(r1) {
                    case 0: goto L_0x0061;
                    case 1: goto L_0x006a;
                    case 2: goto L_0x0058;
                    case 3: goto L_0x0073;
                    default: goto L_0x002f;
                };
            L_0x002f:
                r0 = r8.a;
                r3 = com.whatsapp.azm.UNKNOWN;
                com.whatsapp.VoiceService.a(r0, r3);
            L_0x0036:
                if (r2 != r6) goto L_0x004e;
            L_0x0038:
                if (r1 == r7) goto L_0x003c;
            L_0x003a:
                if (r1 != 0) goto L_0x004e;
            L_0x003c:
                r0 = r8.a;
                r1 = z;
                r1 = r1[r5];
                r0 = r0.getSystemService(r1);
                r0 = (android.media.AudioManager) r0;
                r0.stopBluetoothSco();
                r0.setBluetoothScoOn(r5);
            L_0x004e:
                r0 = r8.a;
                r0 = com.whatsapp.VoiceService.i(r0);
                r0.sendEmptyMessage(r5);
                goto L_0x0026;
            L_0x0058:
                r3 = r8.a;
                r4 = com.whatsapp.azm.CONNECTED;
                com.whatsapp.VoiceService.a(r3, r4);
                if (r0 == 0) goto L_0x0036;
            L_0x0061:
                r3 = r8.a;
                r4 = com.whatsapp.azm.DISCONNECTED;
                com.whatsapp.VoiceService.a(r3, r4);
                if (r0 == 0) goto L_0x0036;
            L_0x006a:
                r3 = r8.a;
                r4 = com.whatsapp.azm.CONNECTING;
                com.whatsapp.VoiceService.a(r3, r4);
                if (r0 == 0) goto L_0x0036;
            L_0x0073:
                r3 = r8.a;
                r4 = com.whatsapp.azm.DISCONNECTING;
                com.whatsapp.VoiceService.a(r3, r4);
                if (r0 == 0) goto L_0x0036;
            L_0x007c:
                goto L_0x002f;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.AnonymousClass_6.onReceive(android.content.Context, android.content.Intent):void");
            }
        };
        this.s = new Handler(new v1(this));
        this.w = new Handler(new e0(this));
        this.f = new Handler(new aky(this));
        this.c = new cy(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r11) {
        /*
        r10_this = this;
        r9 = 11;
        r8 = 8;
        r3 = 1;
        r4 = 0;
        r5 = com.whatsapp.App.az;
        r0 = E;
        r1 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r10.p;
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return;
    L_0x0016:
        r0 = E;
        r1 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r0 = r0[r1];
        r0 = r10.getSystemService(r0);
        r0 = (android.media.AudioManager) r0;
        r10.d = r4;
        r10.e = r4;
        r10.B = r4;
        r1 = E;
        r2 = 97;
        r1 = r1[r2];
        r1 = r10.getSystemService(r1);
        r1 = (android.telephony.TelephonyManager) r1;
        r2 = r1.getCallState();
        if (r2 == 0) goto L_0x0116;
    L_0x003a:
        r2 = r3;
    L_0x003b:
        r10.u = r2;
        r2 = r10.r;
        r6 = 32;
        r1.listen(r2, r6);
        r1 = r10.z;
        r2 = new android.content.IntentFilter;
        r6 = E;
        r7 = 98;
        r6 = r6[r7];
        r2.<init>(r6);
        r10.registerReceiver(r1, r2);
        r1 = r10.l;
        r2 = new android.content.IntentFilter;
        r6 = E;
        r7 = 100;
        r6 = r6[r7];
        r2.<init>(r6);
        r10.registerReceiver(r1, r2);
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r9) goto L_0x007a;
    L_0x0068:
        r1 = r10.m;
        r2 = new android.content.IntentFilter;
        r6 = E;
        r7 = 99;
        r6 = r6[r7];
        r2.<init>(r6);
        r10.registerReceiver(r1, r2);
        if (r5 == 0) goto L_0x008e;
    L_0x007a:
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r8) goto L_0x008e;
    L_0x007e:
        r1 = r10.k;
        r2 = new android.content.IntentFilter;
        r6 = E;
        r7 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r6 = r6[r7];
        r2.<init>(r6);
        r10.registerReceiver(r1, r2);
    L_0x008e:
        r10.k();
        r10.h = r4;
        r10.D();
        r0.setMicrophoneMute(r4);
        if (r11 != 0) goto L_0x0119;
    L_0x009b:
        r1 = r0.isWiredHeadsetOn();
        if (r1 != 0) goto L_0x0119;
    L_0x00a1:
        r1 = r3;
    L_0x00a2:
        r0.setSpeakerphoneOn(r1);
        r1 = r10.A();
        if (r1 == 0) goto L_0x00ae;
    L_0x00ab:
        r10.y();
    L_0x00ae:
        r10.q();
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r8) goto L_0x00d7;
    L_0x00b5:
        r1 = n;
        r1 = (android.media.AudioManager.OnAudioFocusChangeListener) r1;
        r1 = r0.requestAudioFocus(r1, r4, r3);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r6 = E;
        r7 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r6 = r6[r7];
        r2 = r2.append(r6);
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
    L_0x00d7:
        if (r11 != 0) goto L_0x00de;
    L_0x00d9:
        r10.E();
        if (r5 == 0) goto L_0x00ec;
    L_0x00de:
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r9) goto L_0x00e8;
    L_0x00e2:
        r1 = 3;
        r0.setMode(r1);
        if (r5 == 0) goto L_0x00ec;
    L_0x00e8:
        r1 = 2;
        r0.setMode(r1);
    L_0x00ec:
        r0 = r10.s;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.sendEmptyMessageDelayed(r4, r6);
        r0 = r10.x;
        if (r0 == 0) goto L_0x00fc;
    L_0x00f7:
        r0 = r10.x;
        r0.release();
    L_0x00fc:
        r0 = new android.media.SoundPool;
        r0.<init>(r3, r4, r4);
        r10.x = r0;
        r0 = r10.x;
        r1 = r10.getApplicationContext();
        r2 = 2131099649; // 0x7f060001 float:1.7811657E38 double:1.0529031244E-314;
        r0 = r0.load(r1, r2, r3);
        r10.D = r0;
        r10.p = r3;
        goto L_0x0015;
    L_0x0116:
        r2 = r4;
        goto L_0x003b;
    L_0x0119:
        r1 = r4;
        goto L_0x00a2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.a(boolean):void");
    }

    public void b(String str, String str2) {
        Log.i(E[14]);
    }

    public void a(String str, String str2, String str3, int i, byte[][] bArr, byte[][] bArr2, VoipOptions voipOptions) {
        Log.i(E[24]);
        Voip.nativeHandleCallOfferAck(str, str2, str3, i, bArr, bArr2, voipOptions, Voip.e());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e() {
        /*
        r9_this = this;
        r8 = 8;
        r7 = 0;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 0;
        r0 = E;
        r1 = 27;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r9.p;
        if (r0 != 0) goto L_0x0014;
    L_0x0013:
        return;
    L_0x0014:
        r0 = r9.x;
        if (r0 == 0) goto L_0x0022;
    L_0x0018:
        r0 = r9.x;
        r1 = r9.D;
        r3 = r2;
        r5 = r4;
        r6 = r2;
        r0.play(r1, r2, r3, r4, r5, r6);
    L_0x0022:
        r9.p = r4;
        r9.d = r4;
        r9.e = r4;
        r9.B = r4;
        r0 = E;
        r1 = 29;
        r0 = r0[r1];
        r0 = r9.getSystemService(r0);
        r0 = (android.telephony.TelephonyManager) r0;
        r1 = r9.r;
        r0.listen(r1, r4);
        r0 = r9.z;
        r9.unregisterReceiver(r0);
        r0 = r9.l;
        r9.unregisterReceiver(r0);
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 < r1) goto L_0x0054;
    L_0x004b:
        r0 = r9.m;
        r9.unregisterReceiver(r0);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x005d;
    L_0x0054:
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < r8) goto L_0x005d;
    L_0x0058:
        r0 = r9.k;
        r9.unregisterReceiver(r0);
    L_0x005d:
        r0 = com.whatsapp.azm.UNKNOWN;
        r9.t = r0;
        r0 = r9.b;
        r0.a(r7);
        r9.c();
        r9.f();
        r9.o();
        r9.t();
        r0 = E;
        r1 = 28;
        r0 = r0[r1];
        r0 = r9.getSystemService(r0);
        r0 = (android.media.AudioManager) r0;
        r0.setSpeakerphoneOn(r4);
        r0.setMicrophoneMute(r4);
        r1 = r9.q;
        r2 = com.whatsapp.a37.BLUETOOTH;
        if (r1 != r2) goto L_0x008d;
    L_0x008a:
        r9.y();
    L_0x008d:
        r0.setMode(r4);
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r8) goto L_0x009b;
    L_0x0094:
        r1 = n;
        r1 = (android.media.AudioManager.OnAudioFocusChangeListener) r1;
        r0.abandonAudioFocus(r1);
    L_0x009b:
        r0 = r9.s;
        r0.removeCallbacksAndMessages(r7);
        r0 = r9.w;
        r0.removeCallbacksAndMessages(r7);
        r0 = 1;
        r9.stopForeground(r0);
        r9.stopSelf();
        r0 = E;
        r1 = 26;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.e():void");
    }

    public boolean w() {
        return this.d;
    }

    static void a(VoiceService voiceService, CallState callState) {
        voiceService.a(callState);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r12, int r13, int r14) {
        /*
        r11_this = this;
        r10 = 2131427358; // 0x7f0b001e float:1.847633E38 double:1.053065034E-314;
        r1 = 0;
        r3 = 2;
        r2 = 1;
        r4 = com.whatsapp.App.az;
        r5 = r12.getAction();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r6 = E;
        r7 = 75;
        r6 = r6[r7];
        r0 = r0.append(r6);
        r0 = r0.append(r12);
        r6 = E;
        r7 = 79;
        r6 = r6[r7];
        r0 = r0.append(r6);
        r0 = r0.append(r13);
        r6 = E;
        r7 = 64;
        r6 = r6[r7];
        r0 = r0.append(r6);
        r0 = r0.append(r14);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r5 != 0) goto L_0x004e;
    L_0x0044:
        r0 = E;
        r1 = 61;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
    L_0x004d:
        return r3;
    L_0x004e:
        r0 = r11.p;
        if (r0 != 0) goto L_0x0074;
    L_0x0052:
        r0 = E;
        r6 = 76;
        r0 = r0[r6];
        r0 = r0.equals(r5);
        if (r0 != 0) goto L_0x0074;
    L_0x005e:
        r0 = E;
        r6 = 66;
        r0 = r0[r6];
        r0 = r0.equals(r5);
        if (r0 != 0) goto L_0x0074;
    L_0x006a:
        r0 = E;
        r1 = 69;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        goto L_0x004d;
    L_0x0074:
        r0 = -1;
        r6 = r5.hashCode();
        switch(r6) {
            case -1573659621: goto L_0x0098;
            case 3540994: goto L_0x0089;
            case 1281366991: goto L_0x00d4;
            case 1331833598: goto L_0x00b6;
            case 1444513451: goto L_0x00a7;
            case 2138982608: goto L_0x00c5;
            default: goto L_0x007c;
        };
    L_0x007c:
        switch(r0) {
            case 0: goto L_0x00e2;
            case 1: goto L_0x00e7;
            case 2: goto L_0x0177;
            case 3: goto L_0x0194;
            case 4: goto L_0x0199;
            case 5: goto L_0x01a8;
            default: goto L_0x007f;
        };
    L_0x007f:
        r0 = E;
        r1 = 77;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        goto L_0x004d;
    L_0x0089:
        r6 = E;
        r7 = 65;
        r6 = r6[r7];
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x007c;
    L_0x0095:
        if (r4 == 0) goto L_0x01be;
    L_0x0097:
        r0 = r1;
    L_0x0098:
        r6 = E;
        r7 = 78;
        r6 = r6[r7];
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x007c;
    L_0x00a4:
        if (r4 == 0) goto L_0x01bb;
    L_0x00a6:
        r0 = r2;
    L_0x00a7:
        r6 = E;
        r7 = 68;
        r6 = r6[r7];
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x007c;
    L_0x00b3:
        if (r4 == 0) goto L_0x01b8;
    L_0x00b5:
        r0 = r3;
    L_0x00b6:
        r6 = E;
        r7 = 72;
        r6 = r6[r7];
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x007c;
    L_0x00c2:
        r0 = 3;
        if (r4 == 0) goto L_0x007c;
    L_0x00c5:
        r6 = E;
        r7 = 67;
        r6 = r6[r7];
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x007c;
    L_0x00d1:
        r0 = 4;
        if (r4 == 0) goto L_0x007c;
    L_0x00d4:
        r6 = E;
        r7 = 62;
        r6 = r6[r7];
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x007c;
    L_0x00e0:
        r0 = 5;
        goto L_0x007c;
    L_0x00e2:
        r11.e();
        if (r4 == 0) goto L_0x004d;
    L_0x00e7:
        r0 = E;
        r5 = 63;
        r0 = r0[r5];
        r0 = r11.getSystemService(r0);
        r0 = (android.telephony.TelephonyManager) r0;
        r0 = r0.getCallState();
        if (r0 == 0) goto L_0x01b5;
    L_0x00f9:
        r0 = r2;
    L_0x00fa:
        r11.u = r0;
        r0 = r11.u;
        if (r0 == 0) goto L_0x0108;
    L_0x0100:
        r0 = 2131624058; // 0x7f0e007a float:1.8875285E38 double:1.053162217E-314;
        com.whatsapp.App.a(r11, r0, r2);
        if (r4 == 0) goto L_0x004d;
    L_0x0108:
        r0 = com.whatsapp.App.j(r11);
        if (r0 == 0) goto L_0x0116;
    L_0x010e:
        r0 = 2131624057; // 0x7f0e0079 float:1.8875283E38 double:1.0531622164E-314;
        com.whatsapp.App.a(r11, r0, r2);
        if (r4 == 0) goto L_0x004d;
    L_0x0116:
        r0 = E;
        r5 = 71;
        r0 = r0[r5];
        r0 = r12.getStringExtra(r0);
        r5 = com.whatsapp.protocol.b.a(r0, r2);
        r5 = r5.a;
        r6 = new com.whatsapp.protocol.b;
        r7 = new com.whatsapp.protocol.m;
        r8 = com.whatsapp.Voip.a(r5);
        r7.<init>(r0, r2, r8);
        r6.<init>(r7);
        r8 = com.whatsapp.App.a2();
        r6.D = r8;
        r7 = 8;
        r6.j = r7;
        r6.p = r1;
        r1 = 6;
        r6.a = r1;
        r1 = com.whatsapp.App.aJ;
        r1.f(r6);
        com.whatsapp.d7.b(r6);
        r11.a(r2);
        com.whatsapp.Voip.startCall(r5, r0);
        r11.k();
        r1 = new android.content.Intent;
        r2 = com.whatsapp.VoipActivity.class;
        r1.<init>(r11, r2);
        r2 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r1.setFlags(r2);
        r2 = E;
        r5 = 73;
        r2 = r2[r5];
        r1.putExtra(r2, r0);
        r11.startActivity(r1);
        r0 = r11.l();
        if (r0 == 0) goto L_0x004d;
    L_0x0172:
        r11.startForeground(r10, r0);
        if (r4 == 0) goto L_0x004d;
    L_0x0177:
        r0 = E;
        r1 = 60;
        r0 = r0[r1];
        r0 = r12.getParcelableExtra(r0);
        r0 = (android.os.Message) r0;
        r1 = E;
        r2 = 74;
        r1 = r1[r2];
        r1 = r12.getParcelableExtra(r1);
        r0.obj = r1;
        com.whatsapp.messaging.au.a(r0, r11);
        if (r4 == 0) goto L_0x004d;
    L_0x0194:
        r11.a();
        if (r4 == 0) goto L_0x004d;
    L_0x0199:
        r0 = E;
        r1 = 70;
        r0 = r0[r1];
        r0 = r12.getStringExtra(r0);
        r11.b(r0);
        if (r4 == 0) goto L_0x004d;
    L_0x01a8:
        r0 = r11.l();
        if (r0 == 0) goto L_0x004d;
    L_0x01ae:
        r11.startForeground(r10, r0);
        if (r4 == 0) goto L_0x004d;
    L_0x01b3:
        goto L_0x007f;
    L_0x01b5:
        r0 = r1;
        goto L_0x00fa;
    L_0x01b8:
        r0 = r3;
        goto L_0x007c;
    L_0x01bb:
        r0 = r2;
        goto L_0x007c;
    L_0x01be:
        r0 = r1;
        goto L_0x007c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.onStartCommand(android.content.Intent, int, int):int");
    }

    static boolean d(VoiceService voiceService) {
        return voiceService.u;
    }

    public void a(bj bjVar, String str, long j) {
        Object obj = bjVar.a;
        String str2 = bjVar.b;
        Log.i(E[92] + obj + E[91] + str);
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null && TextUtils.equals(callInfo.getCallId(), str) && TextUtils.equals(callInfo.getPeerId(), obj)) {
            this.f.removeMessages(1);
        }
        Voip.nativeHandleCallTerminate(obj, str2, str);
        App.a(bjVar);
    }

    private void r() {
        if (this.A != null) {
            this.A.release();
            this.A = null;
        }
    }

    static void h(VoiceService voiceService) {
        voiceService.b();
    }

    public void a(bj bjVar, String str, long j, String str2) {
        Log.i(E[37]);
        String str3 = bjVar.a;
        String str4 = bjVar.b;
        App.b(str3, str4, str);
        Voip.nativeHandleCallOfferReject(str3, str4, str, str2);
    }

    public void c(String str, String str2) {
        Log.i(E[23]);
    }

    public void a(bj bjVar, String str, long j, String str2, int i, byte[][] bArr, int[] iArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i2) {
        Log.i(E[33]);
        String str3 = bjVar.a;
        String str4 = bjVar.b;
        App.e(str3, str4, str);
        Voip.nativeHandleCallOfferAccept(str3, str4, str, str2, i, bArr, iArr, bArr2, bArr3, bArr4, i2);
    }

    public void x() {
        Log.i(E[3]);
        t();
        Voip.acceptCall();
        ((AudioManager) getSystemService(E[2])).setSpeakerphoneOn(false);
        q();
    }

    private void D() {
        C();
        PowerManager powerManager = (PowerManager) getSystemService(E[44]);
        if (powerManager != null) {
            this.a = powerManager.newWakeLock(1, E[43]);
            if (this.a != null) {
                this.a.acquire();
            }
        }
    }

    static azm e(VoiceService voiceService) {
        return voiceService.t;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q() {
        /*
        r3_this = this;
        r1 = com.whatsapp.App.az;
        r0 = E;
        r2 = 21;
        r0 = r0[r2];
        r0 = r3.getSystemService(r0);
        r0 = (android.media.AudioManager) r0;
        r2 = r0.isBluetoothScoOn();
        if (r2 == 0) goto L_0x001a;
    L_0x0014:
        r2 = com.whatsapp.a37.BLUETOOTH;
        r3.q = r2;
        if (r1 == 0) goto L_0x003a;
    L_0x001a:
        r2 = r0.isSpeakerphoneOn();
        if (r2 == 0) goto L_0x002a;
    L_0x0020:
        r2 = r3.h;
        if (r2 != 0) goto L_0x002a;
    L_0x0024:
        r2 = com.whatsapp.a37.SPEAKER;
        r3.q = r2;
        if (r1 == 0) goto L_0x003a;
    L_0x002a:
        r0 = r0.isWiredHeadsetOn();
        if (r0 == 0) goto L_0x0036;
    L_0x0030:
        r0 = com.whatsapp.a37.HEADSET;
        r3.q = r0;
        if (r1 == 0) goto L_0x003a;
    L_0x0036:
        r0 = com.whatsapp.a37.EARPIECE;
        r3.q = r0;
    L_0x003a:
        r0 = 0;
        r3.h = r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = E;
        r2 = 22;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r3.q;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r3.j;
        if (r0 == 0) goto L_0x0062;
    L_0x005d:
        r0 = r3.j;
        r0.b();
    L_0x0062:
        r3.F();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.q():void");
    }

    static s1 m(VoiceService voiceService) {
        return voiceService.j;
    }

    private String B() {
        m8 a = App.P.a(Voip.getPeerJid());
        return a != null ? a.a((Context) this) : null;
    }

    private void f() {
        r();
        C();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void E() {
        /*
        r5_this = this;
        r4 = 1;
        r1 = com.whatsapp.App.az;
        r0 = E;
        r2 = 80;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = E;
        r2 = 85;
        r0 = r0[r2];
        r0 = r5.getSystemService(r0);
        r0 = (android.media.AudioManager) r0;
        r2 = r0.getRingerMode();
        switch(r2) {
            case 0: goto L_0x006c;
            case 1: goto L_0x0077;
            case 2: goto L_0x0061;
            default: goto L_0x001f;
        };
    L_0x001f:
        r1 = r5.g;
        if (r1 != 0) goto L_0x0060;
    L_0x0023:
        r1 = android.media.RingtoneManager.getDefaultUri(r4);
        r1 = android.media.RingtoneManager.getRingtone(r5, r1);
        r5.g = r1;
        r1 = r5.g;
        if (r1 == 0) goto L_0x0039;
    L_0x0031:
        r0.setMode(r4);
        r1 = r5.g;
        r1.play();
    L_0x0039:
        r1 = r0.getRingerMode();
        r2 = 2;
        if (r1 == r2) goto L_0x0046;
    L_0x0040:
        r0 = r0.getRingerMode();
        if (r0 != r4) goto L_0x0060;
    L_0x0046:
        r0 = 3;
        r0 = new long[r0];
        r0 = new long[]{0, 750, 1500};
        r5.y = r0;
        r0 = E;
        r1 = 84;
        r0 = r0[r1];
        r0 = r5.getSystemService(r0);
        r0 = (android.os.Vibrator) r0;
        r1 = r5.y;
        r2 = 0;
        r0.vibrate(r1, r2);
    L_0x0060:
        return;
    L_0x0061:
        r2 = E;
        r3 = 83;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        if (r1 == 0) goto L_0x001f;
    L_0x006c:
        r2 = E;
        r3 = 81;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        if (r1 == 0) goto L_0x001f;
    L_0x0077:
        r1 = E;
        r2 = 82;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.E():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r3_this = this;
        r0 = com.whatsapp.Voip.DebugTapType.values();
        r0 = r0.length;
        r0 = new com.whatsapp.Voip.RecordingInfo[r0];
        r0 = com.whatsapp.Voip.startCallRecording(r0);
        if (r0 == 0) goto L_0x0014;
    L_0x000d:
        r0 = 2131625094; // 0x7f0e0486 float:1.8877386E38 double:1.053162729E-314;
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0017;
    L_0x0014:
        r0 = 2131625093; // 0x7f0e0485 float:1.8877384E38 double:1.0531627283E-314;
    L_0x0017:
        r1 = com.whatsapp.App.p;
        r1 = r1.U();
        r2 = new com.whatsapp.lj;
        r2.<init>(r3, r0);
        r1.post(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.b():void");
    }

    static void c(VoiceService voiceService) {
        voiceService.s();
    }

    private void h() {
        r();
        int m = m();
        PowerManager powerManager = (PowerManager) getSystemService(E[88]);
        if (this.A == null && m != -1 && powerManager != null) {
            this.A = powerManager.newWakeLock(m, E[87]);
            if (this.A != null) {
                this.A.acquire();
            }
        }
    }

    static boolean b(VoiceService voiceService, boolean z) {
        voiceService.B = z;
        return z;
    }

    public void f(String str, String str2) {
        Log.i(E[20]);
    }

    public void onDestroy() {
        Log.i(E[47]);
        if (this.x != null) {
            this.x.release();
            this.x = null;
        }
        f();
        Voip.nativeUnregisterEventCallback();
        g.b().d(this);
        super.onDestroy();
    }

    private void F() {
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            Object obj;
            if (callInfo.isCaller() || callInfo.getCallState() != CallState.RECEIVED_CALL) {
                obj = 1;
            } else {
                obj = null;
            }
            if (this.q == a37.EARPIECE && r0 != null) {
                h();
                this.b.a(this.c);
                Log.i(E[32]);
                if (App.az == 0) {
                    return;
                }
            }
            r();
            this.b.a(null);
            Log.i(E[31]);
        }
    }

    public void onEvent(ju juVar) {
        k();
    }

    public boolean u() {
        return this.B;
    }

    public void a(bj bjVar, String str, long j, boolean z) {
        Log.i(E[36]);
        App.a(bjVar);
    }

    public VoiceService() {
        this.i = new a36(this);
        this.v = new VoiceServiceEventCallback(this);
        this.t = azm.UNKNOWN;
    }

    public void a() {
        Log.i(E[38]);
        Voip.rejectCall();
        e();
    }

    static String f(VoiceService voiceService) {
        return voiceService.B();
    }

    static {
        String[] strArr = new String[112];
        String str = "\u001dnCX'\u0018dXM+(d\n^,/!IZ.'";
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
                        i4 = 75;
                        break;
                    case ay.f /*1*/:
                        i4 = 1;
                        break;
                    case ay.n /*2*/:
                        i4 = 42;
                        break;
                    case ay.p /*3*/:
                        i4 = 59;
                        break;
                    default:
                        i4 = 66;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    strArr2 = strArr3;
                    str = "*tNR-";
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "=nCKm(`FWm*bI^2?";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fnL]'9.C\\,$sO_o%nD\u00164$hZ\u0016+%,ZI-,sOH1";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fnL]'9.C\\,$sO_o=nCKo\"o\u0007K0$fX^18";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = ")tYB";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fnL]'9!LI-&!";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    str = ";iEU'";
                    i = 7;
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    strArr2 = strArr3;
                    str = "g!IZ.'!C_b";
                    i = 8;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fnL]'9.C\\,$sO_o?nE\u0016-'e\u0005";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = ")tYB";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "=nCKm?nM\\..L_O'\u0018uKO78!IS#%fCU%kl_O'/!YO#?d\nO-k";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "*tNR-";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fuOI/\"oKO'f`IP";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "=hHI#?nX";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "=nCKm9hD\\6$oO\u00141?nZ";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "=nCKm.`X\u0016$*s";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fhDO'9s_K6\"nD\u001b'%e\u0017";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fnL]'9,X^!.hZO";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fnL]'9,KX!.q^\u0016#(j";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "*tNR-";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "=nCKm*tNR-\u0014sEN6.._K&*uOz7/hEi->uO\u0001b";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fl_O'f`IP";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fnL]'9,KX)";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fsOW#2,FZ6.oIBo*bA";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "=nCKm8dXM+(d\u0005H6$qZ^&";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "=nCKm8dXM+(d\u0005H6$q";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "*tNR-";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = ";iEU'";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fsOW#2,FZ6.oIB";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "=nCKm*e@N1?QXT:\"lCO;\u0018dDH-9;\nT$-";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "=nCKm*e@N1?QXT:\"lCO;\u0018dDH-9;\nT,";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fnL]'9,KX!.q^";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = ".oNd!*mFd1?sCU%";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "#`D\\7;^IZ.'";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fl_O'";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fnL]'9,X^(.b^";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "=nCKm(`FWm9d@^!?";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "=nCKm(`FWm.oN";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fnL]'9,KX!.q^\u00160.bOR2?";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "*tNR-";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fsOW#2,OW'(uCT,";
                    i = 41;
                    i2 = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    strArr2 = strArr3;
                    str = "\u001ciKO1\nqZ\u001b\u0014$hI^\u0011.s\\R!.";
                    i = 42;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = ";n]^0";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "*tNR-";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "=nCKm(dFW7'`X\u0016!*mF\u0016+%,ZI-,sOH1fbBZ,,dN\u0001b";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "=nCKm8dXM+(d\u0005_'8uXT;";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "=nCKm8dXM+(d\u0005U-?hLR!*uCT,duCV'ftC\u0016%$oO";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "=nCKm8dXM+(d\u0005U-?hLR!*uCT,doO^&fuBN/)";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "(nG\u0015#%eXT+//CU6.sDZ.eS\u000eR&";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "?hG^";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "(nG\u00155#`^H#;q\u0004R,?dDOl*b^R-%/kx\u0001\u000eQ~d\u0001\nMf";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "#`D\\7;^IZ.'";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "9d@^!?^IZ.'";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "(`FW";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "!hN";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "/n\nU-?!II'*uO\u001b,$uC]+(`^R-%-\nL'k`X^b%n^\u001b+%!K\u001b#(uCM'kbKW.";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fhDO'9s_K6\"nD\u0016#(j";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i2] = str;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fuXZ,8qEI6";
                    i = 58;
                    i2 = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    strArr2 = strArr3;
                    str = ".y^I#\u0014sOX'\"wOd/.rYZ%.";
                    i = 59;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "=nCKm8dXM+(d\u0005X//.DN.',KX6\"nD";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "9dLI'8iuU-?hLR!*uCT,";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = ";iEU'";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "kr^Z0?HN\u0006";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "8uEK";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "8uKI6\u0014bKW.";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "#`D\\7;^IZ.'";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "9dI^+=duV'8rK\\'";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "=nCKm8dXM+(d\u0005X//.DT6fr^Z0?dN";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = ".oNd!*mFd1?sCU%";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "!hN";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i2] = str;
                    i2 = 72;
                    str = "9d@^!?^IZ.'";
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i2] = str;
                    i2 = 73;
                    str = "!hN";
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = ".y^I#\u0014sOX'\"wOd/.rYZ%.^EY(";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "=nCKm8dXM+(d\u0005X//!CU6.o^\u0006";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = "9dI^+=duV'8rK\\'";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "=nCKm8dXM+(d\u0005X//._U)%n]Uo*b^R-%";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i2] = str;
                    i2 = 78;
                    str = "8uKI6\u0014bKW.";
                    i = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i2] = str;
                    i2 = 79;
                    str = "kgFZ%8<";
                    i = 78;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i2] = str;
                    i2 = 80;
                    str = "=nCKm9hD\\6$oO\u00142'`S";
                    i = 79;
                    strArr2 = strArr3;
                    break;
                case 79:
                    strArr2[i2] = str;
                    i2 = 81;
                    str = "=nCKm9hD\\6$oO\u00140\"oM^0\u0014lE_'drCW'%u";
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case 80:
                    strArr2[i2] = str;
                    i2 = 82;
                    str = "=nCKm9hD\\6$oO\u00140\"oM^0\u0014lE_'dwCY0*uO";
                    i = 81;
                    strArr2 = strArr3;
                    break;
                case 81:
                    strArr2[i2] = str;
                    i2 = 83;
                    str = "=nCKm9hD\\6$oO\u00140\"oM^0\u0014lE_'doEI/*m";
                    i = 82;
                    strArr2 = strArr3;
                    break;
                case 82:
                    strArr2[i2] = str;
                    i2 = 84;
                    str = "=hHI#?nX";
                    i = 83;
                    strArr2 = strArr3;
                    break;
                case 83:
                    strArr2[i2] = str;
                    i2 = 85;
                    str = "*tNR-";
                    i = 84;
                    strArr2 = strArr3;
                    break;
                case 84:
                    strArr2[i2] = str;
                    i2 = 86;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fnL]'9,X^(.b^\u00160.bOR2?";
                    i = 85;
                    strArr2 = strArr3;
                    break;
                case 85:
                    strArr2[i2] = str;
                    i2 = 87;
                    str = "\u001ciKO1\nqZ\u001b\u0014$hI^\u0011.s\\R!.!zI-3hGR62";
                    i = 86;
                    strArr2 = strArr3;
                    break;
                case 86:
                    strArr2[i2] = str;
                    i2 = 88;
                    str = ";n]^0";
                    i = 87;
                    strArr2 = strArr3;
                    break;
                case 87:
                    strArr2[i2] = str;
                    i2 = 89;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fuXZ,8qEI6f`IP";
                    i = 88;
                    strArr2 = strArr3;
                    break;
                case 88:
                    strArr2[i2] = str;
                    i2 = 90;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fsOW#2,OW'(uCT,f`IP";
                    i = 89;
                    strArr2 = strArr3;
                    break;
                case 89:
                    strArr2[i2] = str;
                    i2 = 91;
                    str = "g!IZ.'!C_b";
                    i = 90;
                    strArr2 = strArr3;
                    break;
                case 90:
                    strArr2[i2] = str;
                    i2 = 92;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fuOI/\"oKO'kgXT/k";
                    i = 91;
                    strArr2 = strArr3;
                    break;
                case 91:
                    strArr2[i2] = str;
                    i2 = 93;
                    str = "=nCKm.`X\u0016,.`X";
                    i = 92;
                    strArr2 = strArr3;
                    break;
                case 92:
                    strArr2[i2] = str;
                    i2 = 94;
                    str = "=nCKm8dXM+(d\u0005Y+%e\nR,?dDO\u007f";
                    i = 93;
                    strArr2 = strArr3;
                    break;
                case 93:
                    strArr2[i2] = str;
                    i2 = 95;
                    str = "*tNR-";
                    i = 94;
                    strArr2 = strArr3;
                    break;
                case 94:
                    strArr2[i2] = str;
                    i2 = 96;
                    str = "=nCKm*tNR-\u0014sEN6..^T%,mOy.>d^T-?i\nX**oMR,,!HW7.uET6#!YO#?d\nO-k";
                    i = 95;
                    strArr2 = strArr3;
                    break;
                case 95:
                    strArr2[i2] = str;
                    i2 = 97;
                    str = ";iEU'";
                    i = 96;
                    strArr2 = strArr3;
                    break;
                case 96:
                    strArr2[i2] = str;
                    i2 = 98;
                    str = "*oNI-\"e\u0004R,?dDOl*b^R-%/yx\u0010\u000eDdd\r\rG";
                    i = 97;
                    strArr2 = strArr3;
                    break;
                case 97:
                    strArr2[i2] = str;
                    i2 = 99;
                    str = "*oNI-\"e\u0004Y.>d^T-?i\u0004S'*eY^6eqXT$\"mO\u0015#(uCT,eBeu\f\u000eB~r\r\u0005^yo\u0003\u001fDux\n\nOm~\u0006";
                    i = 98;
                    strArr2 = strArr3;
                    break;
                case 98:
                    strArr2[i2] = str;
                    i2 = 100;
                    str = "*oNI-\"e\u0004R,?dDOl*b^R-%/b~\u0003\u000fRoo\u001d\u001bM\u007f|";
                    i = 99;
                    strArr2 = strArr3;
                    break;
                case 99:
                    strArr2[i2] = str;
                    i2 = 101;
                    str = "*oNI-\"e\u0004V'/hK\u0015\u0011\bNuz\u0017\u000fHed\u0011\u001f@~~\u001d\bIku\u0005\u000eE";
                    i = 100;
                    strArr2 = strArr3;
                    break;
                case 100:
                    strArr2[i2] = str;
                    i2 = 102;
                    str = "*tNR-";
                    i = 101;
                    strArr2 = strArr3;
                    break;
                case 101:
                    strArr2[i2] = str;
                    i2 = 103;
                    str = "9dYN.?!E]b*tNR-kgEX78!LT0kwER!.!IZ.';\n";
                    i = 102;
                    strArr2 = strArr3;
                    break;
                case 102:
                    strArr2[i2] = str;
                    i2 = 104;
                    str = "=nCKm8dXM+(d\u0005H6*s^";
                    i = 103;
                    strArr2 = strArr3;
                    break;
                case 103:
                    strArr2[i2] = str;
                    i2 = 105;
                    str = "*tNR-";
                    i = 104;
                    strArr2 = strArr3;
                    break;
                case 104:
                    strArr2[i2] = str;
                    i2 = 106;
                    str = "=nCKm*tNR-\u0014sEN6..^T-,mOh2.`A^0\u001biEU'kbBZ,,hD\\b8qOZ).s\nH6*uO\u001b6$!";
                    i = 105;
                    strArr2 = strArr3;
                    break;
                case 105:
                    strArr2[i2] = str;
                    i2 = 107;
                    str = "%n\nk\u0010\u0004Ycv\u000b\u001fXuh\u0001\u0019Dou\u001d\u0004Gld\u0015\nJod\u000e\u0004Ba\u001b$\"dF_b\"o\nk-<dXv#%`M^0";
                    i = 106;
                    strArr2 = strArr3;
                    break;
                case 106:
                    strArr2[i2] = str;
                    i2 = 108;
                    str = "\u001bSec\u000b\u0006H~b\u001d\u0018Bx~\u0007\u0005^e}\u0004\u0014Vkp\u0007\u0014Mex\t";
                    i = 107;
                    strArr2 = strArr3;
                    break;
                case 107:
                    strArr2[i2] = str;
                    i2 = 109;
                    str = ">oKY..!^Tb*bI^18!zi\r\u0013Hgr\u0016\u0012^yx\u0010\u000eDdd\r\rGul\u0003\u0000Duw\r\bJ\n]+.mN\u001b+%!zT5.sgZ,*fOI";
                    i = 108;
                    strArr2 = strArr3;
                    break;
                case 108:
                    strArr2[i2] = str;
                    i2 = 110;
                    str = "=nCKm8dXM+(d\u0005X0.`^^";
                    i = 109;
                    strArr2 = strArr3;
                    break;
                case 109:
                    strArr2[i2] = str;
                    i2 = 111;
                    str = "=nCKm9dI^+=duV'8rK\\'dbKW.fnL]'9,X^(.b^\u0016#(j";
                    i = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i2] = str;
                    E = strArr3;
                    if (VERSION.SDK_INT >= 8) {
                        n = new bf();
                    } else {
                        n = null;
                    }
                    o = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
                default:
                    strArr2[i2] = str;
                    str = ";n]^0";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    static boolean k(VoiceService voiceService) {
        return voiceService.B;
    }

    static ThreadPoolExecutor p() {
        return o;
    }

    public void v() {
        b(null);
    }

    public boolean i() {
        return this.q == a37.BLUETOOTH;
    }

    public void a(String str, String str2, String str3) {
        Log.i(E[19]);
    }

    static Notification n(VoiceService voiceService) {
        return voiceService.l();
    }

    public void a(bj bjVar, String str, long j, byte[][] bArr, int[] iArr) {
        Log.i(E[30]);
        Voip.nativeHandleCallRelayLatency(bjVar.a, bjVar.b, str, bArr, iArr);
        App.a(bjVar);
    }

    public boolean d() {
        return this.q == a37.SPEAKER;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.whatsapp.protocol.bj r4, java.lang.String r5, long r6, boolean r8) {
        /*
        r3_this = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = E;
        r2 = 18;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r8 == 0) goto L_0x0029;
    L_0x001c:
        r0 = r3.v;
        r0.callResumed();
        r0 = 0;
        com.whatsapp.Voip.setPeerAudioStreamPause(r0);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0032;
    L_0x0029:
        r0 = r3.v;
        r0.callInterrupted();
        r0 = 1;
        com.whatsapp.Voip.setPeerAudioStreamPause(r0);
    L_0x0032:
        com.whatsapp.App.a(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.b(com.whatsapp.protocol.bj, java.lang.String, long, boolean):void");
    }

    public void h(String str, String str2) {
        Log.i(E[89]);
    }

    static boolean a(VoiceService voiceService, boolean z) {
        voiceService.h = z;
        return z;
    }

    public void b(String str, String str2, String str3) {
        Log.i(E[40]);
    }

    public void g(String str, String str2) {
        Log.i(E[58]);
    }

    public void t() {
        Log.i(E[16]);
        if (this.y != null) {
            ((Vibrator) getSystemService(E[15])).cancel();
            this.y = null;
        }
        if (this.g != null) {
            this.g.stop();
            this.g = null;
        }
    }

    static void g(VoiceService voiceService) {
        voiceService.q();
    }

    public void b(String str) {
        Log.i(E[39]);
        if (!(str == null || this.j == null)) {
            this.j.e(str);
        }
        Voip.endCall();
        e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void s() {
        /*
        r5_this = this;
        r0 = 1;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = E;
        r3 = 46;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r5.u;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = com.whatsapp.Voip.getCallInfo();
        if (r1 == 0) goto L_0x0053;
    L_0x0023:
        r2 = r1.getPeerId();
        r3 = r1.getCallState();
        r4 = com.whatsapp.Voip.CallState.CALLING;
        if (r3 != r4) goto L_0x003b;
    L_0x002f:
        r3 = r5.u;
        if (r3 == 0) goto L_0x003b;
    L_0x0033:
        r3 = 0;
        r5.a(r3);
        r3 = com.whatsapp.App.az;
        if (r3 == 0) goto L_0x004e;
    L_0x003b:
        if (r2 == 0) goto L_0x004e;
    L_0x003d:
        r3 = com.whatsapp.protocol.b.a(r2, r0);
        r3 = r3.a;
        r1 = r1.getCallId();
        r4 = r5.u;
        if (r4 != 0) goto L_0x0054;
    L_0x004b:
        com.whatsapp.App.b(r3, r2, r1, r0);
    L_0x004e:
        r0 = r5.u;
        com.whatsapp.Voip.setAudioStreamPause(r0);
    L_0x0053:
        return;
    L_0x0054:
        r0 = 0;
        goto L_0x004b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceService.s():void");
    }

    private void c() {
        Log.i(E[17]);
        this.d = false;
        if (this.j != null) {
            Window window = this.j.a().getWindow();
            View childAt = ((ViewGroup) window.getDecorView().findViewById(16908290)).getChildAt(0);
            if (childAt.getVisibility() == 4) {
                LayoutParams attributes = window.getAttributes();
                attributes.flags &= -1025;
                attributes.screenBrightness = -1.0f;
                if (VERSION.SDK_INT >= 11) {
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & -3);
                }
                childAt.setVisibility(0);
                window.setAttributes(attributes);
            }
        }
    }

    public void a(bj bjVar, String str, long j, int i, String[] strArr, int[] iArr, byte[][] bArr, int[] iArr2, byte[][] bArr2, byte[][] bArr3, byte[] bArr4, byte[] bArr5, VoipOptions voipOptions) {
        int i2 = App.az;
        String str2 = bjVar.a;
        String str3 = bjVar.b;
        Log.i(E[7] + str2 + E[9] + str);
        b bVar = new b(new m(str2, false, Voip.a(str)));
        bVar.D = j;
        bVar.j = (byte) 8;
        bVar.p = 0;
        bVar.a = 6;
        App.aJ.f(bVar);
        App.c(str2, str3, str);
        d7.b(bVar);
        TelephonyManager telephonyManager = (TelephonyManager) App.p.getSystemService(E[8]);
        if (i >= 45) {
            Log.i(E[10] + i);
            App.d(bVar);
            if (i2 == 0) {
                return;
            }
        }
        if (telephonyManager.getCallState() != 0) {
            Log.i(E[4]);
            App.c(b.a(str2, true).a, str2, str, E[6]);
            App.d(bVar);
            if (i2 == 0) {
                return;
            }
        }
        if (Voip.f()) {
            Log.i(E[5]);
            App.c(b.a(str2, true).a, str2, str, E[11]);
            App.d(bVar);
            if (i2 == 0) {
                return;
            }
        }
        Voip.nativeHandleCallOffer(str2, str3, str, strArr, iArr, bArr, iArr2, bArr2, bArr3, bArr4, bArr5, voipOptions, Voip.e());
        k();
        this.f.removeMessages(1);
        this.f.sendEmptyMessageDelayed(1, 500);
    }

    private void C() {
        if (this.a != null) {
            this.a.release();
            this.a = null;
        }
    }

    public void c(String str, String str2, String str3) {
        Log.i(E[86]);
    }

    static azm a(VoiceService voiceService, azm com_whatsapp_azm) {
        voiceService.t = com_whatsapp_azm;
        return com_whatsapp_azm;
    }
}
