package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.NotificationCompatBase.Action;
import android.widget.RemoteViews;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class NotificationCompatApi20 {

    public class Builder implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions {
        public static int a;
        private static final String z;
        private android.app.Notification.Builder b;
        private Bundle mExtras;

        static {
            char[] toCharArray = "tf?7\u0013|lu5\u0019zx7 ".toCharArray();
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
                        i2 = 8;
                        break;
                    case ay.n /*2*/:
                        i2 = 91;
                        break;
                    case ay.p /*3*/:
                        i2 = 69;
                        break;
                    default:
                        i2 = 124;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public android.app.Notification.Builder getBuilder() {
            return this.b;
        }

        public Notification build() {
            this.b.setExtras(this.mExtras);
            return this.b.build();
        }

        public void addAction(Action action) {
            NotificationCompatApi20.addAction(this.b, action);
        }

        public Builder(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList arrayList, Bundle bundle, String str, boolean z5, String str2) {
            this.b = new android.app.Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str).setGroupSummary(z5).setSortKey(str2);
            this.mExtras = new Bundle();
            if (bundle != null) {
                this.mExtras.putAll(bundle);
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                this.mExtras.putStringArray(z, (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        }
    }

    public static void addAction(android.app.Notification.Builder builder, Action action) {
        int i = Action.a;
        android.app.Notification.Action.Builder builder2 = new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
        if (action.getRemoteInputs() != null) {
            RemoteInput[] fromCompat = RemoteInputCompatApi20.fromCompat(action.getRemoteInputs());
            int length = fromCompat.length;
            int i2 = 0;
            while (i2 < length) {
                builder2.addRemoteInput(fromCompat[i2]);
                i2++;
                if (i != 0) {
                    break;
                }
            }
        }
        if (action.getExtras() != null) {
            builder2.addExtras(action.getExtras());
        }
        builder.addAction(builder2.build());
    }

    private static Notification.Action getActionFromActionCompat(Action action) {
        int i = Action.a;
        android.app.Notification.Action.Builder addExtras = new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent()).addExtras(action.getExtras());
        RemoteInputCompatBase.RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs != null) {
            RemoteInput[] fromCompat = RemoteInputCompatApi20.fromCompat(remoteInputs);
            int length = fromCompat.length;
            int i2 = 0;
            while (i2 < length) {
                addExtras.addRemoteInput(fromCompat[i2]);
                i2++;
                if (i != 0) {
                    break;
                }
            }
        }
        return addExtras.build();
    }

    public static ArrayList getParcelableArrayListForActions(Action[] actionArr) {
        int i = Action.a;
        if (actionArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(actionArr.length);
        int length = actionArr.length;
        int i2 = 0;
        while (i2 < length) {
            arrayList.add(getActionFromActionCompat(actionArr[i2]));
            i2++;
            if (i != 0) {
                return arrayList;
            }
        }
        return arrayList;
    }
}
