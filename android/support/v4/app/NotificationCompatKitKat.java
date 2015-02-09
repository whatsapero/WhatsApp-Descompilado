package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.NotificationCompatBase.Action;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class NotificationCompatKitKat {

    public class Builder implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions {
        public static int a;
        private static final String[] z;
        private android.app.Notification.Builder b;
        private List mActionExtrasList;
        private Bundle mExtras;

        static {
            String[] strArr = new String[7];
            String str = "y3w\u0015^q9=\u0014Dh-|\u0015E6<p\u0013Xw3V\u001fEj<`";
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
                            i3 = 93;
                            break;
                        case ay.n /*2*/:
                            i3 = 19;
                            break;
                        case ay.p /*3*/:
                            i3 = 103;
                            break;
                        default:
                            i3 = 49;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "y3w\u0015^q9=\u0014Dh-|\u0015E6(`\u0002bq9v$Yy3}\u0002]";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "y3w\u0015^q9=\u0014Dh-|\u0015E64` Cw(c4Du0r\u0015H";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        str = "y3w\u0015^q9=\u0017Tw-\u007f\u0002";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "y3w\u0015^q9=\u0014Dh-|\u0015E61|\u0004Pt\u0012}\u000bH";
                        obj = 4;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "y3w\u0015^q9=\u0014Dh-|\u0015E6.|\u0015ES8j";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case aV.r /*5*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "y3w\u0015^q9=\u0014Dh-|\u0015E6:a\bDh\u0016v\u001e";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public android.app.Notification.Builder getBuilder() {
            return this.b;
        }

        public void addAction(Action action) {
            this.mActionExtrasList.add(NotificationCompatJellybean.writeActionAndGetExtras(this.b, action));
        }

        public Notification build() {
            SparseArray buildActionExtrasMap = NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if (buildActionExtrasMap != null) {
                this.mExtras.putSparseParcelableArray(z[0], buildActionExtrasMap);
            }
            this.b.setExtras(this.mExtras);
            return this.b.build();
        }

        public Builder(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList arrayList, Bundle bundle, String str, boolean z5, String str2) {
            int i5 = Action.a;
            this.mActionExtrasList = new ArrayList();
            this.b = new android.app.Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z);
            this.mExtras = new Bundle();
            if (bundle != null) {
                this.mExtras.putAll(bundle);
            }
            if (!(arrayList == null || arrayList.isEmpty())) {
                this.mExtras.putStringArray(z[4], (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            if (z4) {
                this.mExtras.putBoolean(z[5], true);
            }
            if (str != null) {
                this.mExtras.putString(z[1], str);
                if (z5) {
                    this.mExtras.putBoolean(z[3], true);
                    if (i5 != 0) {
                        RemoteInput.a++;
                    }
                }
                this.mExtras.putBoolean(z[2], true);
            }
            if (str2 != null) {
                this.mExtras.putString(z[6], str2);
            }
        }
    }

    public static Bundle getExtras(Notification notification) {
        return notification.extras;
    }
}
