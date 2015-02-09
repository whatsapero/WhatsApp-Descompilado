package com.whatsapp;

import android.app.Notification;
import android.content.Intent;
import android.os.Handler.Callback;
import android.os.Message;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class aky implements Callback {
    private static final String z;
    final VoiceService a;

    static {
        char[] toCharArray = "]/\u0011\u0016_H/\u0015\u000b\u001fE\b\u0019\b\u0014G%\nI8j\u000e<*5y\u001f/.1\u007f\u001f+21y\u0014''3\u007f\t./$r\u001f>)\"t\t6%?f\t6!/h\u00014*PE/X\u0007\u0013_)\u000e\u0003PH!\u0014\n".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 43;
                    break;
                case ay.f /*1*/:
                    i2 = 64;
                    break;
                case ay.n /*2*/:
                    i2 = 120;
                    break;
                case ay.p /*3*/:
                    i2 = 102;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case PBE.MD5 /*0*/:
                VoiceService.g(this.a);
                return true;
            case ay.f /*1*/:
                if (Voip.f()) {
                    Intent intent = new Intent(this.a, VoipActivity.class);
                    intent.setFlags(268435456);
                    this.a.startActivity(intent);
                    VoiceService.c(this.a, false);
                    Notification n = VoiceService.n(this.a);
                    if (n == null) {
                        return true;
                    }
                    this.a.startForeground(R.id.notification_voice_service, n);
                    return true;
                }
                Log.e(z);
                return true;
            default:
                return false;
        }
    }

    aky(VoiceService voiceService) {
        this.a = voiceService;
    }
}
