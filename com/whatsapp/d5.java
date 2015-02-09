package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.whatsapp.VoipActivity.ReplyWithMessageDialogFragment;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class d5 implements OnClickListener {
    private static final String[] z;
    final ReplyWithMessageDialogFragment a;
    final String[] b;

    static {
        String[] strArr = new String[4];
        String str = "\u0005Lu@4\u0005Ltz";
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
                        i3 = 109;
                        break;
                    case ay.f /*1*/:
                        i3 = 45;
                        break;
                    case ay.n /*2*/:
                        i3 = 6;
                        break;
                    case ay.p /*3*/:
                        i3 = 31;
                        break;
                    default:
                        i3 = 71;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0007Db";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u001aLYk>\u001dH";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u001eEgm\"2@ux";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        VoipActivity voipActivity = (VoipActivity) this.a.getActivity();
        Intent intent = new Intent(this.a.getActivity(), Conversation.class);
        intent.putExtra(z[2], VoipActivity.c(voipActivity));
        intent.addFlags(335544320);
        if (i != this.b.length - 1) {
            intent.putExtra(z[3], (byte) 0);
            intent.putExtra(z[1], this.b[i]);
            intent.putExtra(z[0], true);
            Conversation.ah = true;
        }
        this.a.getActivity().startActivity(intent);
        VoipActivity.b(voipActivity);
    }

    d5(ReplyWithMessageDialogFragment replyWithMessageDialogFragment, String[] strArr) {
        this.a = replyWithMessageDialogFragment;
        this.b = strArr;
    }
}
