package com.whatsapp;

import android.os.ConditionVariable;
import com.whatsapp.Voip.CallInfo;
import com.whatsapp.Voip.CallState;
import com.whatsapp.Voip.CryptoCallback;
import com.whatsapp.Voip.DebugTapType;
import com.whatsapp.Voip.RecordingInfo;
import com.whatsapp.Voip.SignalingCallback;
import com.whatsapp.fieldstats.Events$Call;
import com.whatsapp.messaging.r;
import com.whatsapp.protocol.VoipOptions;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class Voip {
    private static final SimpleDateFormat a;
    private static final ConditionVariable b;
    private static final r c;
    private static final String[] z;

    public interface EventCallback {
        void audioInitError();

        void audioStreamStarted();

        void callAcceptFailed();

        void callAcceptReceived();

        void callAcceptSent();

        void callCaptureBufferFilled(DebugTapType debugTapType, byte[] bArr, int i, RecordingInfo[] recordingInfoArr);

        void callCaptureEnded(DebugTapType debugTapType, RecordingInfo[] recordingInfoArr);

        void callEnding();

        void callInterrupted();

        void callOfferAckedWithRelayInfo();

        void callOfferNacked();

        void callOfferReceived();

        void callOfferSent();

        void callRejectReceived(String str);

        void callResumed();

        void callStateChanged(CallState callState, CallInfo callInfo);

        void callTerminateReceived();

        void errorGatheringHostCandidates();

        void handleAcceptFailed();

        void handleOfferFailed();

        void incompatibleSrtpKeyExchange();

        void mediaStreamError();

        void mediaStreamStartError();

        void missingRelayInfo();

        void p2pNegotaitionFailed();

        void p2pNegotiationSuccess();

        void p2pTransportCreateFailed();

        void p2pTransportMediaCreateFailed();

        void p2pTransportRestartSuccess();

        void p2pTransportStartFailed();

        void packetRxTimeout();

        void packetTxTimeout();

        void relayCreateSuccess();

        void relayElectionSendFailed();

        void relayLatencySendFailed();

        void sendAcceptFailed();

        void sendOfferFailed();

        void soundPortCreateFailed();

        void transportCandSendFailed();

        void willCreateSoundPort();
    }

    public class CallInfo {
        private long bytesReceived;
        private long bytesSent;
        private long callActiveTime;
        private String callId;
        private CallState callState;
        private boolean isCaller;
        private boolean isEndedByMe;
        private String peerId;

        public long getCallActiveTime() {
            return this.callActiveTime;
        }

        public CallState getCallState() {
            return this.callState;
        }

        public String getPeerId() {
            return this.peerId;
        }

        public boolean isCaller() {
            return this.isCaller;
        }

        public CallInfo(CallState callState, String str, String str2, boolean z, boolean z2, long j, long j2, long j3) {
            this.callState = callState;
            this.callId = str;
            this.peerId = str2;
            this.isCaller = z;
            this.isEndedByMe = z2;
            this.callActiveTime = j;
            this.bytesSent = j2;
            this.bytesReceived = j3;
        }

        public long getBytesSent() {
            return this.bytesSent;
        }

        public boolean isEndedByMe() {
            return this.isEndedByMe;
        }

        public long getBytesReceived() {
            return this.bytesReceived;
        }

        public String getCallId() {
            return this.callId;
        }
    }

    public enum CallState {
        ;
        private static final com.whatsapp.Voip.CallState[] $VALUES;
        public static final com.whatsapp.Voip.CallState ACCEPT_RECEIVED;
        public static final com.whatsapp.Voip.CallState ACCEPT_SENT;
        public static final com.whatsapp.Voip.CallState ACTIVE;
        public static final com.whatsapp.Voip.CallState CALLING;
        public static final com.whatsapp.Voip.CallState NONE;
        public static final com.whatsapp.Voip.CallState RECEIVED_CALL;
        private static final String[] z;

        static {
            String[] strArr = new String[6];
            String str = "m/\td";
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
                            i4 = 35;
                            break;
                        case ay.f /*1*/:
                            i4 = 96;
                            break;
                        case ay.n /*2*/:
                            i4 = 71;
                            break;
                        case ay.p /*3*/:
                            i4 = 33;
                            break;
                        default:
                            i4 = 87;
                            break;
                    }
                    cArr[i3] = (char) (i4 ^ c);
                }
                str = new String(cArr).intern();
                switch (i) {
                    case PBE.MD5 /*0*/:
                        strArr2[i2] = str;
                        str = "`!\u000bm\u001em'";
                        i2 = 2;
                        strArr2 = strArr3;
                        i = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i2] = str;
                        str = "b#\u0013h\u0001f";
                        i2 = 3;
                        strArr2 = strArr3;
                        i = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i2] = str;
                        str = "b#\u0004d\u0007w?\u0015d\u0014f)\u0011d\u0013";
                        i2 = 4;
                        strArr2 = strArr3;
                        i = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i2] = str;
                        i2 = 5;
                        strArr2 = strArr3;
                        str = "b#\u0004d\u0007w?\u0014d\u0019w";
                        i = 4;
                        break;
                    case aj.i /*4*/:
                        strArr2[i2] = str;
                        z = strArr3;
                        NONE = new com.whatsapp.Voip.CallState(z[0], 0);
                        CALLING = new com.whatsapp.Voip.CallState(z[2], 1);
                        RECEIVED_CALL = new com.whatsapp.Voip.CallState(z[1], 2);
                        ACCEPT_SENT = new com.whatsapp.Voip.CallState(z[5], 3);
                        ACCEPT_RECEIVED = new com.whatsapp.Voip.CallState(z[4], 4);
                        ACTIVE = new com.whatsapp.Voip.CallState(z[3], 5);
                        $VALUES = new com.whatsapp.Voip.CallState[]{NONE, CALLING, RECEIVED_CALL, ACCEPT_SENT, ACCEPT_RECEIVED, ACTIVE};
                    default:
                        strArr2[i2] = str;
                        str = "q%\u0004d\u001eu%\u0003~\u0014b,\u000b";
                        i2 = 1;
                        strArr2 = strArr3;
                        i = 0;
                        break;
                }
            }
        }
    }

    public interface CryptoCallback {
        BigInteger generateDiffieHellmanSharedPublicKey(byte[] bArr);

        boolean generateDiffieHellmanSymmetricKey(BigInteger bigInteger, byte[] bArr, byte[] bArr2);

        byte[] generateRandomBytes(int i);
    }

    public enum DebugTapType {
        ;
        private static final com.whatsapp.Voip.DebugTapType[] $VALUES;
        public static final com.whatsapp.Voip.DebugTapType CAPTURED_AND_POST_PROCESSED;
        public static final com.whatsapp.Voip.DebugTapType OUTGOING_ENCODED;
        public static final com.whatsapp.Voip.DebugTapType RAW_CAPTURED;
        public static final com.whatsapp.Voip.DebugTapType RECEIVED_AND_DECODED;
        private static final String[] z;

        static {
            String[] strArr = new String[4];
            String str = "\u0012(MJ=\u0003,YA)\u001f-BN'\u0002=BN:\u001e*XM;\u0014-";
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
                            i4 = 81;
                            break;
                        case ay.f /*1*/:
                            i4 = 105;
                            break;
                        case ay.n /*2*/:
                            i4 = 29;
                            break;
                        case ay.p /*3*/:
                            i4 = 30;
                            break;
                        default:
                            i4 = 104;
                            break;
                    }
                    cArr[i3] = (char) (i4 ^ c);
                }
                str = new String(cArr).intern();
                switch (i) {
                    case PBE.MD5 /*0*/:
                        strArr2[i2] = str;
                        str = "\u001e<IY'\u0018'ZA-\u001f*RZ-\u0015";
                        i2 = 2;
                        strArr2 = strArr3;
                        i = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i2] = str;
                        str = "\u0003(JA+\u00109IK:\u0014-";
                        i2 = 3;
                        strArr2 = strArr3;
                        i = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i2] = str;
                        z = strArr3;
                        RECEIVED_AND_DECODED = new com.whatsapp.Voip.DebugTapType(z[1], 0);
                        CAPTURED_AND_POST_PROCESSED = new com.whatsapp.Voip.DebugTapType(z[0], 1);
                        OUTGOING_ENCODED = new com.whatsapp.Voip.DebugTapType(z[2], 2);
                        RAW_CAPTURED = new com.whatsapp.Voip.DebugTapType(z[3], 3);
                        $VALUES = new com.whatsapp.Voip.DebugTapType[]{RECEIVED_AND_DECODED, CAPTURED_AND_POST_PROCESSED, OUTGOING_ENCODED, RAW_CAPTURED};
                    default:
                        strArr2[i2] = str;
                        str = "\u0003,^[!\u0007,YA)\u001f-BZ-\u0012&Y[,";
                        i2 = 1;
                        strArr2 = strArr3;
                        i = 0;
                        break;
                }
            }
        }
    }

    public class DefaultCryptoCallback implements CryptoCallback {
        private static final BigInteger G;
        private static final BigInteger P;
        private static final String[] z;
        private final SecureRandom secureRandom;

        public DefaultCryptoCallback() {
            this.secureRandom = new SecureRandom();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.math.BigInteger generateDiffieHellmanSharedPublicKey(byte[] r9) {
            /*
            r8_this = this;
            r1 = 0;
            r4 = com.whatsapp.App.az;
            r0 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
            r0 = new byte[r0];
            r2 = r8.secureRandom;
            r2.nextBytes(r0);
            r0[r1] = r1;
            r3 = new java.math.BigInteger;
            r3.<init>(r0);
            r0 = G;
            r2 = P;
            r0 = r0.modPow(r3, r2);
            r5 = r0.toByteArray();
            r0 = r5.length;
            r2 = r9.length;
            if (r0 <= r2) goto L_0x0088;
        L_0x0023:
            r0 = r1;
        L_0x0024:
            r2 = r5.length;
            r6 = r9.length;
            r2 = r2 - r6;
            if (r0 >= r2) goto L_0x0061;
        L_0x0029:
            r2 = r5[r0];
            if (r2 == 0) goto L_0x005d;
        L_0x002d:
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = z;
            r2 = 2;
            r1 = r1[r2];
            r0 = r0.append(r1);
            r1 = r5.length;
            r0 = r0.append(r1);
            r1 = z;
            r2 = 3;
            r1 = r1[r2];
            r0 = r0.append(r1);
            r1 = r9.length;
            r0 = r0.append(r1);
            r1 = ")";
            r0 = r0.append(r1);
            r0 = r0.toString();
            com.whatsapp.util.Log.e(r0);
            r0 = 0;
        L_0x005c:
            return r0;
        L_0x005d:
            r0 = r0 + 1;
            if (r4 == 0) goto L_0x0024;
        L_0x0061:
            r0 = r5.length;
            r2 = r9.length;
            r0 = r0 - r2;
            if (r4 == 0) goto L_0x0076;
        L_0x0066:
            r2 = r5.length;
            r6 = r9.length;
            if (r2 >= r6) goto L_0x0076;
        L_0x006a:
            r2 = r1;
        L_0x006b:
            r6 = r9.length;
            r7 = r5.length;
            r6 = r6 - r7;
            if (r2 >= r6) goto L_0x0076;
        L_0x0070:
            r9[r2] = r1;
            r2 = r2 + 1;
            if (r4 == 0) goto L_0x006b;
        L_0x0076:
            r2 = r9.length;
            r4 = r5.length;
            r2 = r2 - r4;
            r1 = java.lang.Math.max(r2, r1);
            r2 = r9.length;
            r4 = r5.length;
            r2 = java.lang.Math.min(r2, r4);
            java.lang.System.arraycopy(r5, r0, r9, r1, r2);
            r0 = r3;
            goto L_0x005c;
        L_0x0088:
            r0 = r1;
            goto L_0x0066;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Voip.DefaultCryptoCallback.generateDiffieHellmanSharedPublicKey(byte[]):java.math.BigInteger");
        }

        public byte[] generateRandomBytes(int i) {
            byte[] bArr = new byte[i];
            this.secureRandom.nextBytes(bArr);
            return bArr;
        }

        static {
            String[] strArr = new String[5];
            String str = "3-b\u0016Gi}u\u0006\u0002:lb\u0004\u000evlv\t\u0002:%";
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
                            i3 = 26;
                            break;
                        case ay.f /*1*/:
                            i3 = 13;
                            break;
                        case ay.n /*2*/:
                            i3 = 20;
                            break;
                        case ay.p /*3*/:
                            i3 = 101;
                            break;
                        default:
                            i3 = 103;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "scg\u0010\u0001|dw\f\u0002ty4\u0016\u0017{nqE\u0001u\u007f4\u0015\u0012xa}\u0006GqhmEJ$-q\u000b\u0004uiq\u0001Gvhz\u0002\u0013r-<";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "3-b\u0016Gi}u\u0006\u0002:lb\u0004\u000evlv\t\u0002:%";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        str = "\\KR#!\\KR#!\\KR#!\\N-U!^LUWU+;,&U)9WQ$,;&]%\"=P&VYI%W^*?  W\"5USPYN#QW(=V'\"[;''V)4VWU/< $W\":-]\")9$Q#^HR\\R+4VV$^>UQT+O'UUX=US#\\?!#V.>#Q!_<'PQ^;PPVY? P\".5!'R-;\"WR_:Q&Q\\9 &S(H-$Q):Q!QX=V#!/NVS!.=\"'P_IQ T\";V#%/L,\\^\\L!$\"#K&QV+:WQ%+KQSS#?,SQ/<Q&\".8VV#Y?$UPYO,$V,>V#W/4,!&.5'SVY8!!T#L\"\\V,>R$_\\I&Q$\\8R]T,8!!U)IW$T[I-SVY;&#T/;&U_/8&'%#HPPU#=#RW#;-SQ^;#U$)8  S[OW\\_*9RTP.;WU_YL&VP)?##!\\KR#!\\KR#!\\KR#";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                        P = new BigInteger(z[4], 16);
                        G = BigInteger.valueOf(2);
                    default:
                        strArr2[i] = str;
                        str = "scg\u0010\u0001|dw\f\u0002ty4\u0016\u0017{nqE\u0001u\u007f4\u0016\u001ew`q\u0011\u0015sn4\u000e\u0002c-9[G\u007fcw\n\u0003\u007fi4\t\u0002tj`\rG2";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean generateDiffieHellmanSymmetricKey(java.math.BigInteger r9, byte[] r10, byte[] r11) {
            /*
            r8_this = this;
            r3 = 1;
            r1 = 0;
            r4 = com.whatsapp.App.az;
            r0 = r10[r1];
            if (r0 == 0) goto L_0x0014;
        L_0x0008:
            r0 = r10.length;
            r0 = r0 + 1;
            r0 = new byte[r0];
            r0[r1] = r1;
            r2 = r10.length;
            java.lang.System.arraycopy(r10, r1, r0, r3, r2);
            r10 = r0;
        L_0x0014:
            r0 = new java.math.BigInteger;
            r0.<init>(r10);
            r2 = P;
            r0 = r0.modPow(r9, r2);
            r5 = r0.toByteArray();
            r0 = r5.length;
            r2 = r11.length;
            if (r0 <= r2) goto L_0x0089;
        L_0x0027:
            r0 = r1;
        L_0x0028:
            r2 = r5.length;
            r6 = r11.length;
            r2 = r2 - r6;
            if (r0 >= r2) goto L_0x0062;
        L_0x002d:
            r2 = r5[r0];
            if (r2 == 0) goto L_0x005e;
        L_0x0031:
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r2 = z;
            r2 = r2[r3];
            r0 = r0.append(r2);
            r2 = r5.length;
            r0 = r0.append(r2);
            r2 = z;
            r2 = r2[r1];
            r0 = r0.append(r2);
            r2 = r11.length;
            r0 = r0.append(r2);
            r2 = ")";
            r0 = r0.append(r2);
            r0 = r0.toString();
            com.whatsapp.util.Log.e(r0);
        L_0x005d:
            return r1;
        L_0x005e:
            r0 = r0 + 1;
            if (r4 == 0) goto L_0x0028;
        L_0x0062:
            r0 = r5.length;
            r2 = r11.length;
            r0 = r0 - r2;
            if (r4 == 0) goto L_0x0077;
        L_0x0067:
            r2 = r5.length;
            r6 = r11.length;
            if (r2 >= r6) goto L_0x0077;
        L_0x006b:
            r2 = r1;
        L_0x006c:
            r6 = r11.length;
            r7 = r5.length;
            r6 = r6 - r7;
            if (r2 >= r6) goto L_0x0077;
        L_0x0071:
            r11[r2] = r1;
            r2 = r2 + 1;
            if (r4 == 0) goto L_0x006c;
        L_0x0077:
            r2 = r11.length;
            r4 = r5.length;
            r2 = r2 - r4;
            r1 = java.lang.Math.max(r2, r1);
            r2 = r11.length;
            r4 = r5.length;
            r2 = java.lang.Math.min(r2, r4);
            java.lang.System.arraycopy(r5, r0, r11, r1, r2);
            r1 = r3;
            goto L_0x005d;
        L_0x0089:
            r0 = r1;
            goto L_0x0067;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Voip.DefaultCryptoCallback.generateDiffieHellmanSymmetricKey(java.math.BigInteger, byte[], byte[]):boolean");
        }
    }

    public interface SignalingCallback {
        void sendAccept(String str, String str2, String str3, int i, byte[][] bArr, int[] iArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i2);

        void sendOffer(String str, String str2, boolean z, byte[][] bArr, int[] iArr, byte[] bArr2, byte[] bArr3);

        void sendReject(String str, String str2, String str3);

        void sendRelayElection(String str, String str2, byte[] bArr, int i);

        void sendRelayLatencies(String str, String str2, byte[][] bArr, int[] iArr);

        void sendTerminate(String str, String str2, String str3);

        void sendTransport(String str, String str2, byte[][] bArr, int[] iArr);
    }

    public class DefaultSignalingCallback implements SignalingCallback {
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
            r2 = "7\u0000YG";
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
            r0 = "7\u0000YG";
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
                case 2: goto L_0x0046;
                case 3: goto L_0x0049;
                default: goto L_0x0036;
            };
        L_0x0036:
            r2 = 34;
        L_0x0038:
            r2 = r2 ^ r9;
            r2 = (char) r2;
            r6[r8] = r2;
            r2 = r8 + 1;
            r8 = r2;
            goto L_0x0012;
        L_0x0040:
            r2 = 88;
            goto L_0x0038;
        L_0x0043:
            r2 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
            goto L_0x0038;
        L_0x0046:
            r2 = 44;
            goto L_0x0038;
        L_0x0049:
            r2 = 52;
            goto L_0x0038;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Voip.DefaultSignalingCallback.<clinit>():void");
        }

        public void sendRelayLatencies(String str, String str2, byte[][] bArr, int[] iArr) {
            App.a(b.a(str2, true).a, str2, str, bArr, iArr);
        }

        public void sendOffer(String str, String str2, boolean z, byte[][] bArr, int[] iArr, byte[] bArr2, byte[] bArr3) {
            String str3 = str2;
            String str4 = str;
            App.a(b.a(str2, true).a, str3, str4, new String[]{z[1], z[0]}, new int[]{8000, 16000}, bArr, iArr, bArr2, bArr3);
        }

        public void sendTransport(String str, String str2, byte[][] bArr, int[] iArr) {
            App.b(b.a(str2, true).a, str2, str, bArr, iArr);
        }

        public void sendAccept(String str, String str2, String str3, int i, byte[][] bArr, int[] iArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i2) {
            App.a(b.a(str2, true).a, str2, str, str3, i, bArr, iArr, bArr2, bArr3, bArr4, i2);
        }

        public void sendTerminate(String str, String str2, String str3) {
            App.a(b.a(str2, true).a, str2, str, str3);
        }

        public void sendRelayElection(String str, String str2, byte[] bArr, int i) {
            App.a(b.a(str2, true).a, str2, str, bArr, i);
        }

        public void sendReject(String str, String str2, String str3) {
            App.c(b.a(str2, true).a, str2, str, str3);
        }
    }

    public class RecordingInfo {
        private static final String[] z;
        private OutputStream a;
        private File b;

        static {
            String[] strArr = new String[6];
            String str = "OC8>0^G,d7MU";
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
                            i3 = 44;
                            break;
                        case ay.f /*1*/:
                            i3 = 34;
                            break;
                        case ay.n /*2*/:
                            i3 = 72;
                            break;
                        case ay.p /*3*/:
                            i3 = 74;
                            break;
                        default:
                            i3 = 69;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "OC8>0^G,d BA'. H";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "OC8>0^G,d5^M+/6_G,";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        str = "^G+/,ZG,";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "\u0002U)<kKX";
                        obj = 4;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "YL#$*[Lh. NW/j1MRh><\\Grj";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public RecordingInfo(com.whatsapp.Voip.DebugTapType r7) {
            /*
            r6_this = this;
            r1 = com.whatsapp.App.az;
            r6.<init>();
            r0 = com.whatsapp.ew.a;
            r2 = r7.ordinal();
            r0 = r0[r2];
            switch(r0) {
                case 1: goto L_0x002e;
                case 2: goto L_0x0035;
                case 3: goto L_0x003c;
                case 4: goto L_0x0043;
                default: goto L_0x0010;
            };
        L_0x0010:
            r0 = new java.lang.IllegalStateException;	 Catch:{ IOException -> 0x002c }
            r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x002c }
            r1.<init>();	 Catch:{ IOException -> 0x002c }
            r2 = z;	 Catch:{ IOException -> 0x002c }
            r3 = 1;
            r2 = r2[r3];	 Catch:{ IOException -> 0x002c }
            r1 = r1.append(r2);	 Catch:{ IOException -> 0x002c }
            r1 = r1.append(r7);	 Catch:{ IOException -> 0x002c }
            r1 = r1.toString();	 Catch:{ IOException -> 0x002c }
            r0.<init>(r1);	 Catch:{ IOException -> 0x002c }
            throw r0;	 Catch:{ IOException -> 0x002c }
        L_0x002c:
            r0 = move-exception;
            throw r0;
        L_0x002e:
            r0 = z;
            r2 = 3;
            r0 = r0[r2];
            if (r1 == 0) goto L_0x004a;
        L_0x0035:
            r0 = z;
            r2 = 2;
            r0 = r0[r2];
            if (r1 == 0) goto L_0x004a;
        L_0x003c:
            r0 = z;
            r2 = 4;
            r0 = r0[r2];
            if (r1 == 0) goto L_0x004a;
        L_0x0043:
            r0 = z;
            r2 = 0;
            r0 = r0[r2];
            if (r1 != 0) goto L_0x0010;
        L_0x004a:
            r1 = com.whatsapp.Voip.c();
            r2 = new java.util.Date;
            r4 = java.lang.System.currentTimeMillis();
            r2.<init>(r4);
            r1 = r1.format(r2);
            r2 = new java.io.File;
            r3 = com.whatsapp.yf.b();
            r4 = new java.lang.StringBuilder;
            r4.<init>();
            r1 = r4.append(r1);
            r4 = ".";
            r1 = r1.append(r4);
            r0 = r1.append(r0);
            r1 = z;
            r4 = 5;
            r1 = r1[r4];
            r0 = r0.append(r1);
            r0 = r0.toString();
            r2.<init>(r3, r0);
            r6.b = r2;
            r0 = new java.util.zip.GZIPOutputStream;	 Catch:{ IOException -> 0x0096 }
            r1 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0096 }
            r2 = r6.b;	 Catch:{ IOException -> 0x0096 }
            r3 = 1;
            r1.<init>(r2, r3);	 Catch:{ IOException -> 0x0096 }
            r0.<init>(r1);	 Catch:{ IOException -> 0x0096 }
            r6.a = r0;	 Catch:{ IOException -> 0x0096 }
        L_0x0095:
            return;
        L_0x0096:
            r0 = move-exception;
            com.whatsapp.util.Log.c(r0);
            r0 = 0;
            r6.a = r0;
            goto L_0x0095;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Voip.RecordingInfo.<init>(com.whatsapp.Voip$DebugTapType):void");
        }

        public OutputStream b() {
            return this.a;
        }

        public File a() {
            return this.b;
        }
    }

    public static native void acceptCall();

    public static native boolean checkStreamStatistics();

    public static native void endCall();

    public static native long getCallActiveTime();

    public static native Events$Call getCallFieldStats();

    public static native CallInfo getCallInfo();

    public static native String getCurrentCallId();

    public static native CallState getCurrentCallState();

    public static native String getPeerJid();

    public static native String getStreamStatistics();

    public static r h() {
        return c;
    }

    public static native boolean isCaller();

    public static native void muteCall(boolean z);

    public static native void nativeHandleCallOffer(String str, String str2, String str3, String[] strArr, int[] iArr, byte[][] bArr, int[] iArr2, byte[][] bArr2, byte[][] bArr3, byte[] bArr4, byte[] bArr5, VoipOptions voipOptions, boolean z);

    public static native void nativeHandleCallOfferAccept(String str, String str2, String str3, String str4, int i, byte[][] bArr, int[] iArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i2);

    public static native void nativeHandleCallOfferAck(String str, String str2, String str3, int i, byte[][] bArr, byte[][] bArr2, VoipOptions voipOptions, boolean z);

    public static native void nativeHandleCallOfferReject(String str, String str2, String str3, String str4);

    public static native void nativeHandleCallRelayElection(String str, String str2, String str3, byte[] bArr, int i);

    public static native void nativeHandleCallRelayLatency(String str, String str2, String str3, byte[][] bArr, int[] iArr);

    public static native void nativeHandleCallTerminate(String str, String str2, String str3);

    public static native void nativeHandleCallTransport(String str, String str2, String str3, byte[][] bArr, int[] iArr);

    public static native void nativeRegisterEventCallback(EventCallback eventCallback);

    public static native void nativeUnregisterEventCallback();

    public static native void onNetworkChange();

    public static native void registerCryptoCallback(CryptoCallback cryptoCallback);

    public static native void registerSignalingCallback(SignalingCallback signalingCallback);

    public static native void rejectCall();

    public static native void setAudioStreamPause(boolean z);

    public static native void setNetworkMedium(int i);

    public static native void setPeerAudioStreamPause(boolean z);

    public static native void setSpeakerOn(boolean z);

    public static native void startCall(String str, String str2);

    public static native boolean startCallRecording(RecordingInfo[] recordingInfoArr);

    public static native boolean stopCallRecording();

    public static native void unregisterCryptoCallback();

    public static native void unregisterSignalingCallback();

    public static boolean a(b bVar) {
        return bVar.j == 8 && !bVar.e.b && bVar.p == 0 && bVar.k == 0;
    }

    static {
        String[] strArr = new String[3];
        String str = "xd`u?h*uxs|\u007fde*-lnesn\u007fse6c~!t2af!d'l~d";
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
                        i3 = 13;
                        break;
                    case ay.f /*1*/:
                        i3 = 10;
                        break;
                    case ay.n /*2*/:
                        i3 = 1;
                        break;
                    case ay.p /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 83;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "tsxn~@G,s7#BIH>`Urd";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new SimpleDateFormat(z[2]);
                    b = new ConditionVariable(true);
                    c = new avn();
                default:
                    strArr2[i] = str;
                    str = "nkm{i";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    public static void d() {
        b.close();
    }

    public static void a() {
        b.block();
    }

    public static m g() {
        CallInfo callInfo = getCallInfo();
        return callInfo == null ? null : new m(callInfo.getPeerId(), callInfo.isCaller(), a(callInfo.getCallId()));
    }

    public static void b() {
        b.open();
    }

    public static boolean e() {
        return false;
    }

    static SimpleDateFormat c() {
        return a;
    }

    public static final String a(String str) {
        return str == null ? null : z[1] + str;
    }

    public static boolean f() {
        try {
            return getCurrentCallState() != CallState.NONE;
        } catch (UnsatisfiedLinkError e) {
            throw e;
        } catch (Throwable e2) {
            Log.b(z[0], e2);
            return false;
        }
    }
}
