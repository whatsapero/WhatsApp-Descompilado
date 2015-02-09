package android.support.v4.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.v4.app.INotificationSideChannel.Stub;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class NotificationCompatSideChannelService extends Service {
    private static final String[] z;

    class NotificationSideChannelStub extends Stub {
        final NotificationCompatSideChannelService this$0;

        public void cancelAll(String str) {
            NotificationCompatSideChannelService.access$100(this.this$0, getCallingUid(), str);
            long clearCallingIdentity = clearCallingIdentity();
            try {
                this.this$0.cancelAll(str);
            } finally {
                restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void notify(String str, int i, String str2, Notification notification) {
            NotificationCompatSideChannelService.access$100(this.this$0, getCallingUid(), str);
            long clearCallingIdentity = clearCallingIdentity();
            try {
                this.this$0.notify(str, i, str2, notification);
            } finally {
                restoreCallingIdentity(clearCallingIdentity);
            }
        }

        NotificationSideChannelStub(NotificationCompatSideChannelService notificationCompatSideChannelService, AnonymousClass_1 anonymousClass_1) {
            this(notificationCompatSideChannelService);
        }

        private NotificationSideChannelStub(NotificationCompatSideChannelService notificationCompatSideChannelService) {
            this.this$0 = notificationCompatSideChannelService;
        }

        public void cancel(String str, int i, String str2) {
            NotificationCompatSideChannelService.access$100(this.this$0, getCallingUid(), str);
            long clearCallingIdentity = clearCallingIdentity();
            try {
                this.this$0.cancel(str, i, str2);
            } finally {
                restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    static {
        String[] strArr = new String[3];
        String str = "gk.WtoadVnvu%Wo(G\u0003k_YK\u0005qR@L\tdOOJ\u0004zHOA\u000fzXND\u0004k^J";
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
                        i3 = 6;
                        break;
                    case ay.f /*1*/:
                        i3 = 5;
                        break;
                    case ay.n /*2*/:
                        i3 = 74;
                        break;
                    case ay.p /*3*/:
                        i3 = 37;
                        break;
                    default:
                        i3 = 27;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "Hj>L}of+Qrik\u0019L\u007fcF\"Duh`&v~ts#F~<%\u001fL\u007f&";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "&l9\u0005uiqjDnrm%Wr|`.\u0005}iwjUzen+B~&";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public abstract void cancel(String str, int i, String str2);

    public abstract void cancelAll(String str);

    public abstract void notify(String str, int i, String str2, Notification notification);

    public IBinder onBind(Intent intent) {
        try {
            if (!intent.getAction().equals(z[0])) {
                return null;
            }
            try {
                return VERSION.SDK_INT > 19 ? null : new NotificationSideChannelStub(this, null);
            }
        } catch (SecurityException e) {
            throw e;
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    private void checkPermission(int i, String str) {
        boolean z = FragmentActivity.a;
        String[] packagesForUid = getPackageManager().getPackagesForUid(i);
        int length = packagesForUid.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                if (!packagesForUid[i2].equals(str)) {
                    i2++;
                    if (z) {
                        break;
                    }
                }
                return;
            } catch (SecurityException e) {
                throw e;
            }
        }
        throw new SecurityException(z[2] + i + z[1] + str);
    }

    static void access$100(NotificationCompatSideChannelService notificationCompatSideChannelService, int i, String str) {
        notificationCompatSideChannelService.checkPermission(i, str);
    }
}
