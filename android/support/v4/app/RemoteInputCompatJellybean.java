package android.support.v4.app;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompatBase.Action;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class RemoteInputCompatJellybean {
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = "yz\u001f9h{q\u0003c&c{\u0015\".i1\u000e#3hq\u0013";
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
                        i3 = 13;
                        break;
                    case ay.f /*1*/:
                        i3 = 31;
                        break;
                    case ay.n /*2*/:
                        i3 = 103;
                        break;
                    case ay.p /*3*/:
                        i3 = 77;
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
                    str = "lq\u0003?(d{I?\"`p\u0013(.co\u00129i\u007fz\u00148+yl#,3l";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "nw\b$$hl";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "ls\u000b\"0Km\u0002(\u0001bm\n\u0004)}j\u0013";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "a~\u0005(+";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "hg\u0013?&~";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u007fz\u00148+yT\u00024";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "lq\u0003?(d{I?\"`p\u0013(.co\u00129i\u007fz\u00148+yl";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static Bundle[] toBundleArray(RemoteInput[] remoteInputArr) {
        int i = Action.a;
        if (remoteInputArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[remoteInputArr.length];
        int i2 = 0;
        while (i2 < remoteInputArr.length) {
            bundleArr[i2] = toBundle(remoteInputArr[i2]);
            i2++;
            if (i != 0) {
                break;
            }
        }
        return bundleArr;
    }

    static Bundle toBundle(RemoteInput remoteInput) {
        Bundle bundle = new Bundle();
        bundle.putString(z[7], remoteInput.getResultKey());
        bundle.putCharSequence(z[5], remoteInput.getLabel());
        bundle.putCharSequenceArray(z[3], remoteInput.getChoices());
        bundle.putBoolean(z[4], remoteInput.getAllowFreeFormInput());
        bundle.putBundle(z[6], remoteInput.getExtras());
        return bundle;
    }

    static Bundle getResultsFromIntent(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        return (description.hasMimeType(z[0]) && description.getLabel().equals(z[1])) ? (Bundle) clipData.getItemAt(0).getIntent().getExtras().getParcelable(z[2]) : null;
    }
}
