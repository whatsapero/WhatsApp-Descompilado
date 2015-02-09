package com.whatsapp;

import java.io.Serializable;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class Statistics$Data implements Serializable {
    private static final long serialVersionUID = 1;
    private static final String[] z;
    final long last_reset;
    long rx_media_bytes;
    long rx_media_msgs;
    long rx_message_service_bytes;
    long rx_offline_delay;
    long rx_offline_msgs;
    long rx_text_msgs;
    long rx_voip_bytes;
    long rx_voip_calls;
    long tx_media_bytes;
    long tx_media_msgs;
    long tx_message_service_bytes;
    long tx_text_msgs;
    long tx_voip_bytes;
    long tx_voip_calls;

    static {
        String[] strArr = new String[22];
        String str = "\u007f6t*6,t\u007f;0:={;7";
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
                        i3 = 95;
                        break;
                    case ay.f /*1*/:
                        i3 = 84;
                        break;
                    case ay.n /*2*/:
                        i3 = 13;
                        break;
                    case ay.p /*3*/:
                        i3 = 94;
                        break;
                    default:
                        i3 = 83;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u007f9~;0\u007f5{;!>3h~7:8l'z";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u007f6t*6,t\u007f;0:={;7";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u007f6t*6,t~;=+x-";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u007f{-\n<+5a~\u0017> lds";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u007f&h=66\"h:";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u007f6t*6,t~;=+x-";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u007f{-\u0011598d06\u007f\u0019h- >3h-i\u007f";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u007f'h0'st";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u007f6t*6,}!~";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u007f&h=66\"h:sw";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u007f;x*40=c9s<5a2 st";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    str = "\u007f6t*6,}";
                    obj = 12;
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    strArr2 = strArr3;
                    str = "\u007f6t*6,t~;=+x-";
                    obj = 13;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u007f{-\u00136,'l96\u007f\u0007h,%67hds";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u007f{-\b<6$-\u001d238~ds";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u007f'h0'\u007f|";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u007f6t*6,t\u007f;0:={;7";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u007f&h=66\"h:sw";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u007f=c=<2=c9s<5a2 st";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u000b1u*s\u00121~-281~ds";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u007f{-\u00136;=l~\u001e:'~?4:'7~";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public long getMediaBytesReceived() {
        return this.rx_media_bytes;
    }

    public long getVoipBytesSent() {
        return this.tx_voip_bytes;
    }

    public long getTotalVoipBytes() {
        return this.rx_voip_bytes + this.tx_voip_bytes;
    }

    Statistics$Data(boolean z) {
        this.rx_text_msgs = 0;
        this.tx_text_msgs = 0;
        this.rx_media_msgs = 0;
        this.tx_media_msgs = 0;
        this.rx_offline_msgs = 0;
        this.rx_offline_delay = 0;
        this.rx_media_bytes = 0;
        this.tx_media_bytes = 0;
        this.rx_message_service_bytes = 0;
        this.tx_message_service_bytes = 0;
        this.rx_voip_calls = 0;
        this.tx_voip_calls = 0;
        this.rx_voip_bytes = 0;
        this.tx_voip_bytes = 0;
        if (z) {
            this.last_reset = System.currentTimeMillis();
            if (App.az == 0) {
                return;
            }
        }
        this.last_reset = Long.MIN_VALUE;
    }

    public long getMediaBytesSent() {
        return this.tx_media_bytes;
    }

    public long getOutgoingVoipCalls() {
        return this.tx_voip_calls;
    }

    public long getMessageBytesReceived() {
        return this.rx_message_service_bytes;
    }

    public long getTotalVoipCalls() {
        return this.tx_voip_calls + this.rx_voip_calls;
    }

    public long getTotalMessagesReceived() {
        return this.rx_text_msgs + this.rx_media_msgs;
    }

    public long getTotalMessagesSent() {
        return this.tx_text_msgs + this.tx_media_msgs;
    }

    public String toString() {
        return z[21] + this.tx_text_msgs + z[9] + this.rx_text_msgs + z[6] + z[1] + this.tx_media_msgs + z[17] + this.tx_media_bytes + z[10] + this.rx_media_msgs + z[11] + this.rx_media_bytes + z[13] + z[8] + this.rx_offline_msgs + z[19] + this.rx_offline_delay + z[2] + z[15] + this.tx_message_service_bytes + z[14] + this.rx_message_service_bytes + z[0] + z[16] + this.tx_voip_calls + z[12] + this.rx_voip_calls + z[20] + this.tx_voip_bytes + z[7] + this.rx_voip_bytes + z[18] + z[5] + getTotalBytesSent() + z[4] + getTotalBytesReceived() + z[3];
    }

    public long getTotalBytesReceived() {
        return (this.rx_media_bytes + this.rx_message_service_bytes) + this.rx_voip_bytes;
    }

    public long getVoipBytesReceived() {
        return this.rx_voip_bytes;
    }

    public long getTotalBytesSent() {
        return (this.tx_media_bytes + this.tx_message_service_bytes) + this.tx_voip_bytes;
    }

    public long getLastReset() {
        return this.last_reset;
    }

    public long getIncomingVoipCalls() {
        return this.rx_voip_calls;
    }

    public long getMessageBytesSent() {
        return this.tx_message_service_bytes;
    }
}
