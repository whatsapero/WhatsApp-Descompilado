package com.whatsapp;

import com.whatsapp.VoiceService.VoiceServiceEventCallback;
import com.whatsapp.Voip.DebugTapType;
import com.whatsapp.Voip.RecordingInfo;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class y8 implements Runnable {
    private static final String z;
    final RecordingInfo[] a;
    final int b;
    final DebugTapType c;
    final VoiceServiceEventCallback d;
    final byte[] e;

    static {
        char[] toCharArray = "v\u007fg~;tn\u007fg\np\\~t\u001eplM{\u0014y{o2\u000baq{2\np}d`\u001c|pl2\u001c`{+f\u00175{sq\u001dpzx2\u001e|rn2\u000b|dn2\u0014|sbf".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 21;
                    break;
                case ay.f /*1*/:
                    i2 = 30;
                    break;
                case ay.n /*2*/:
                    i2 = 11;
                    break;
                case ay.p /*3*/:
                    i2 = 18;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    y8(VoiceServiceEventCallback voiceServiceEventCallback, RecordingInfo[] recordingInfoArr, DebugTapType debugTapType, byte[] bArr, int i) {
        this.d = voiceServiceEventCallback;
        this.a = recordingInfoArr;
        this.c = debugTapType;
        this.e = bArr;
        this.b = i;
    }

    public void run() {
        RecordingInfo recordingInfo;
        RecordingInfo recordingInfo2 = this.a[this.c.ordinal()];
        if (recordingInfo2 == null) {
            this.a[this.c.ordinal()] = new RecordingInfo(this.c);
            recordingInfo = this.a[this.c.ordinal()];
        } else {
            recordingInfo = recordingInfo2;
        }
        try {
            recordingInfo.b().write(this.e, 0, this.b);
        } catch (Throwable e) {
            Log.c(e);
        }
        try {
            this.d.bufferQueue.a(this.e);
            if (recordingInfo.a().length() >= 52428800) {
                Log.i(z);
                Voip.stopCallRecording();
            }
        } catch (IOException e2) {
            throw e2;
        }
    }
}
