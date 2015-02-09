package android.support.v4.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.provider.Settings.Secure;
import android.support.v4.app.INotificationSideChannel.Stub;
import android.util.Log;
import com.whatsapp.vk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class NotificationManagerCompat {
    private static final Impl IMPL;
    private static final int SIDE_CHANNEL_BIND_FLAGS;
    private static Set sEnabledNotificationListenerPackages;
    private static String sEnabledNotificationListeners;
    private static final Object sEnabledNotificationListenersLock;
    private static final Object sLock;
    private static SideChannelManager sSideChannelManager;
    private static final String[] z;
    private final Context mContext;
    private final NotificationManager mNotificationManager;

    interface Task {
        void send(INotificationSideChannel iNotificationSideChannel);
    }

    class CancelTask implements Task {
        private static final String[] z;
        final boolean all;
        final int id;
        final String packageName;
        final String tag;

        static {
            String[] strArr = new String[5];
            String str = "\u0007PvK\t";
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
                            i3 = 43;
                            break;
                        case ay.f /*1*/:
                            i3 = 112;
                            break;
                        case ay.n /*2*/:
                            i3 = 31;
                            break;
                        case ay.p /*3*/:
                            i3 = 47;
                            break;
                        default:
                            i3 = 51;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "[\u0011|DRL\u0015QN^NJ";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "h\u0011qLVG$~\\Xp";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "\u0007P~C_\u0011";
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "\u0007PkNT\u0011";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public void send(INotificationSideChannel iNotificationSideChannel) {
            if (this.all) {
                iNotificationSideChannel.cancelAll(this.packageName);
                if (!FragmentActivity.a) {
                    return;
                }
            }
            iNotificationSideChannel.cancel(this.packageName, this.id, this.tag);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(z[3]);
            stringBuilder.append(z[2]).append(this.packageName);
            stringBuilder.append(z[0]).append(this.id);
            stringBuilder.append(z[1]).append(this.tag);
            stringBuilder.append(z[4]).append(this.all);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }

        public CancelTask(String str, int i, String str2) {
            this.packageName = str;
            this.id = i;
            this.tag = str2;
            this.all = false;
        }
    }

    interface Impl {
        void cancelNotification(NotificationManager notificationManager, String str, int i);

        int getSideChannelBindFlags();

        void postNotification(NotificationManager notificationManager, String str, int i, Notification notification);
    }

    class ImplBase implements Impl {
        ImplBase() {
        }

        public void postNotification(NotificationManager notificationManager, String str, int i, Notification notification) {
            notificationManager.notify(i, notification);
        }

        public void cancelNotification(NotificationManager notificationManager, String str, int i) {
            notificationManager.cancel(i);
        }

        public int getSideChannelBindFlags() {
            return 1;
        }
    }

    class ImplEclair extends ImplBase {
        public void cancelNotification(NotificationManager notificationManager, String str, int i) {
            NotificationManagerCompatEclair.cancelNotification(notificationManager, str, i);
        }

        public void postNotification(NotificationManager notificationManager, String str, int i, Notification notification) {
            NotificationManagerCompatEclair.postNotification(notificationManager, str, i, notification);
        }

        ImplEclair() {
        }
    }

    class ImplIceCreamSandwich extends ImplEclair {
        public int getSideChannelBindFlags() {
            return 33;
        }

        ImplIceCreamSandwich() {
        }
    }

    class NotifyTask implements Task {
        private static final String[] z;
        final int id;
        final Notification notif;
        final String packageName;
        final String tag;

        static {
            String[] strArr = new String[4];
            String str = "\u0003\u007f E\t\u0014{\rO\u0005\u0016$";
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
                            i3 = 115;
                            break;
                        case ay.f /*1*/:
                            i3 = 30;
                            break;
                        case ay.n /*2*/:
                            i3 = 67;
                            break;
                        case ay.p /*3*/:
                            i3 = 46;
                            break;
                        default:
                            i3 = 104;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "_>*JR";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "_>7O\u000fI";
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "=q7G\u000e\nJ\"]\u0003(";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public NotifyTask(String str, int i, String str2, Notification notification) {
            this.packageName = str;
            this.id = i;
            this.tag = str2;
            this.notif = notification;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(z[1]);
            stringBuilder.append(z[0]).append(this.packageName);
            stringBuilder.append(z[2]).append(this.id);
            stringBuilder.append(z[3]).append(this.tag);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }

        public void send(INotificationSideChannel iNotificationSideChannel) {
            iNotificationSideChannel.notify(this.packageName, this.id, this.tag, this.notif);
        }
    }

    class ServiceConnectedEvent {
        final ComponentName componentName;
        final IBinder iBinder;

        public ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.componentName = componentName;
            this.iBinder = iBinder;
        }
    }

    class SideChannelManager implements Callback, ServiceConnection {
        private static final String[] z;
        private Set mCachedEnabledPackages;
        private final Context mContext;
        private final Handler mHandler;
        private final HandlerThread mHandlerThread;
        private final Map mRecordMap;

        class ListenerRecord {
            public boolean bound;
            public final ComponentName componentName;
            public int retryCount;
            public INotificationSideChannel service;
            public LinkedList taskQueue;

            public ListenerRecord(ComponentName componentName) {
                this.bound = false;
                this.taskQueue = new LinkedList();
                this.retryCount = 0;
                this.componentName = componentName;
            }
        }

        static {
            String[] strArr = new String[42];
            String str = "gb4W\b@n!J\u0007Fc\r_\u0000Hj%L-F`0_\u001a";
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
                            i3 = 41;
                            break;
                        case ay.f /*1*/:
                            i3 = 13;
                            break;
                        case ay.n /*2*/:
                            i3 = 64;
                            break;
                        case ay.p /*3*/:
                            i3 = 62;
                            break;
                        default:
                            i3 = 110;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "\ty!M\u0005Z-4QN";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "nd6W\u0000N-5NNFc`Z\u000bEd6[\u001c@c'\u001e";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        str = "\tl&J\u000b[-";
                        obj = 4;
                        strArr2 = strArr3;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "zn([\n\\a)P\t\t\u007f%J\u001cP-&Q\u001c\t";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case aV.r /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "\t`3";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case aV.i /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case a8.s /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case a8.n /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case a6.D /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case a6.h /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "jb.P\u000bJy%ZN]b`M\u000b[{)]\u000b\t";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case a6.e /*11*/:
                        strArr2[i] = str;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 12;
                        i = 13;
                        strArr2 = strArr3;
                        break;
                    case a6.s /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        strArr2 = strArr3;
                        str = "Hc$L\u0001@inM\u001bY}/L\u001a\u0007O\tp*vC\u000fj'oD\u0003\u007f:`B\u000ea=`I\u0005a-aL\u000ep+e";
                        obj = 13;
                        break;
                    case a6.z /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = "|c!\\\u0002L-4QNKd.ZN]b`R\u0007Zy%P\u000b[-";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                        strArr2[i] = str;
                        i = 16;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 15;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeBackground /*15*/:
                        strArr2[i] = str;
                        i = 17;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 16;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                        strArr2[i] = str;
                        i = 18;
                        str = "md3]\u0001Gc%]\u001aLi`X\u001cF``M\u000b[{)]\u000b\t";
                        obj = 17;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                        strArr2[i] = str;
                        i = 19;
                        str = "y\u007f/]\u000bZ~)P\t\tn/S\u001eFc%P\u001a\t";
                        obj = 18;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                        strArr2[i] = str;
                        i = 20;
                        str = "zh.Z\u0007Gj`J\u000fZf`";
                        obj = 19;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                        strArr2[i] = str;
                        i = 21;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 20;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_buttonStyleSmall /*20*/:
                        strArr2[i] = str;
                        i = 22;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 21;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_selectableItemBackground /*21*/:
                        strArr2[i] = str;
                        i = 23;
                        str = "{h-Q\u001aLH8]\u000bYy)Q\u0000\tn/S\u0003\\c)]\u000f]d.YN^d4VN";
                        obj = 22;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_windowContentOverlay /*22*/:
                        strArr2[i] = str;
                        i = 24;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 23;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                        strArr2[i] = str;
                        i = 25;
                        str = "\t|5[\u001bLi`J\u000fZf3";
                        obj = 24;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                        strArr2[i] = str;
                        i = 26;
                        str = "{h-Q\u001aL-3[\u001c_d#[NAl3\u001e\n@h$\u0004N";
                        obj = 25;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textAppearanceSmall /*25*/:
                        strArr2[i] = str;
                        i = 27;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 26;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textColorPrimary /*26*/:
                        strArr2[i] = str;
                        i = 28;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 27;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                        strArr2[i] = str;
                        i = 29;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 28;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                        strArr2[i] = str;
                        i = 30;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 29;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_spinnerItemStyle /*29*/:
                        strArr2[i] = str;
                        i = 31;
                        str = "\u0005-";
                        obj = 30;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                        strArr2[i] = str;
                        i = 32;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 31;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                        strArr2[i] = str;
                        i = 33;
                        str = "hi$W\u0000N-,W\u001d]h.[\u001c\t\u007f%]\u0001[i`X\u0001[-";
                        obj = 32;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchDropdownBackground /*32*/:
                        strArr2[i] = str;
                        i = 34;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 33;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                        strArr2[i] = str;
                        i = 35;
                        str = "\u0005-.Q\u001a\tl$Z\u0007Gj`R\u0007Zy%P\u000b[-2[\rF\u007f$\u0010";
                        obj = 34;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewGoIcon /*34*/:
                        strArr2[i] = str;
                        i = 36;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 35;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                        strArr2[i] = str;
                        i = 37;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 36;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                        strArr2[i] = str;
                        i = 38;
                        str = "gb4W\bdl.}\u0001D}!J";
                        obj = 37;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewEditQuery /*37*/:
                        strArr2[i] = str;
                        i = 39;
                        str = "Hc$L\u0001@inM\u001bY}/L\u001a\u0007O\tp*vC\u000fj'oD\u0003\u007f:`B\u000ea=`I\u0005a-aL\u000ep+e";
                        obj = 38;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                        strArr2[i] = str;
                        i = 40;
                        str = "yh2S\u0007Z~)Q\u0000\t}2[\u001dLc4\u001e\u0001G-#Q\u0003Yb.[\u0000]-";
                        obj = 39;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewTextField /*39*/:
                        strArr2[i] = str;
                        i = 41;
                        str = "{h-Q\u0018@c'\u001e\u0002@~4[\u0000L\u007f`L\u000bJb2ZNOb2\u001e";
                        obj = 40;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "\t\u007f%J\u001c@h3";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        private void ensureServiceUnbound(ListenerRecord listenerRecord) {
            if (listenerRecord.bound) {
                this.mContext.unbindService(this);
                listenerRecord.bound = false;
            }
            listenerRecord.service = null;
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case PBE.MD5 /*0*/:
                    handleQueueTask((Task) message.obj);
                    return true;
                case ay.f /*1*/:
                    ServiceConnectedEvent serviceConnectedEvent = (ServiceConnectedEvent) message.obj;
                    handleServiceConnected(serviceConnectedEvent.componentName, serviceConnectedEvent.iBinder);
                    return true;
                case ay.n /*2*/:
                    handleServiceDisconnected((ComponentName) message.obj);
                    return true;
                case ay.p /*3*/:
                    handleRetryListenerQueue((ComponentName) message.obj);
                    return true;
                default:
                    return false;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(z[10], 3)) {
                Log.d(z[11], z[12] + componentName);
            }
            this.mHandler.obtainMessage(1, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        private void handleServiceDisconnected(ComponentName componentName) {
            ListenerRecord listenerRecord = (ListenerRecord) this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                ensureServiceUnbound(listenerRecord);
            }
        }

        private void updateListenerMap() {
            boolean z = FragmentActivity.a;
            Set enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.mContext);
            if (!enabledListenerPackages.equals(this.mCachedEnabledPackages)) {
                this.mCachedEnabledPackages = enabledListenerPackages;
                List<ResolveInfo> queryIntentServices = this.mContext.getPackageManager().queryIntentServices(new Intent().setAction(z[39]), 4);
                Set<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName) || z) {
                        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w(z[34], z[40] + componentName + z[35]);
                            if (!z) {
                                continue;
                            }
                        }
                        hashSet.add(componentName);
                        if (z) {
                            break;
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.mRecordMap.containsKey(componentName2)) {
                        if (Log.isLoggable(z[38], 3)) {
                            Log.d(z[37], z[33] + componentName2);
                        }
                        this.mRecordMap.put(componentName2, new ListenerRecord(componentName2));
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                Iterator it = this.mRecordMap.entrySet().iterator();
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable(z[32], 3)) {
                            Log.d(z[36], z[41] + entry.getKey());
                        }
                        ensureServiceUnbound((ListenerRecord) entry.getValue());
                        it.remove();
                        continue;
                    }
                    if (z) {
                        return;
                    }
                }
            }
        }

        public SideChannelManager(Context context) {
            this.mRecordMap = new HashMap();
            this.mCachedEnabledPackages = new HashSet();
            this.mContext = context;
            this.mHandlerThread = new HandlerThread(z[0]);
            this.mHandlerThread.start();
            this.mHandler = new Handler(this.mHandlerThread.getLooper(), this);
        }

        private void handleQueueTask(Task task) {
            boolean z = FragmentActivity.a;
            updateListenerMap();
            for (ListenerRecord listenerRecord : this.mRecordMap.values()) {
                listenerRecord.taskQueue.add(task);
                processListenerQueue(listenerRecord);
                if (z) {
                    return;
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean ensureServiceBound(android.support.v4.app.NotificationManagerCompat.SideChannelManager.ListenerRecord r5) {
            /*
            r4_this = this;
            r0 = r5.bound;
            if (r0 == 0) goto L_0x0006;
        L_0x0004:
            r0 = 1;
        L_0x0005:
            return r0;
        L_0x0006:
            r0 = new android.content.Intent;
            r1 = z;
            r2 = 14;
            r1 = r1[r2];
            r0.<init>(r1);
            r1 = r5.componentName;
            r0 = r0.setComponent(r1);
            r1 = r4.mContext;
            r2 = android.support.v4.app.NotificationManagerCompat.access$000();
            r0 = r1.bindService(r0, r4, r2);
            r5.bound = r0;
            r0 = r5.bound;
            if (r0 == 0) goto L_0x002e;
        L_0x0027:
            r0 = 0;
            r5.retryCount = r0;
            r0 = android.support.v4.app.FragmentActivity.a;
            if (r0 == 0) goto L_0x0055;
        L_0x002e:
            r0 = z;
            r1 = 13;
            r0 = r0[r1];
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r2 = z;
            r3 = 15;
            r2 = r2[r3];
            r1 = r1.append(r2);
            r2 = r5.componentName;
            r1 = r1.append(r2);
            r1 = r1.toString();
            android.util.Log.w(r0, r1);
            r0 = r4.mContext;
            r0.unbindService(r4);
        L_0x0055:
            r0 = r5.bound;
            goto L_0x0005;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.NotificationManagerCompat.SideChannelManager.ensureServiceBound(android.support.v4.app.NotificationManagerCompat$SideChannelManager$ListenerRecord):boolean");
        }

        private void processListenerQueue(ListenerRecord listenerRecord) {
            boolean z = FragmentActivity.a;
            try {
                if (Log.isLoggable(z[28], 3)) {
                    Log.d(z[21], z[19] + listenerRecord.componentName + z[31] + listenerRecord.taskQueue.size() + z[25]);
                }
                try {
                    if (!listenerRecord.taskQueue.isEmpty()) {
                        try {
                            if (!ensureServiceBound(listenerRecord) || listenerRecord.service == null) {
                                scheduleListenerRetry(listenerRecord);
                                return;
                            }
                            do {
                                Task task = (Task) listenerRecord.taskQueue.peek();
                                if (task != null || z) {
                                    try {
                                        if (Log.isLoggable(z[27], 3)) {
                                            Log.d(z[29], z[20] + task);
                                        }
                                        task.send(listenerRecord.service);
                                        listenerRecord.taskQueue.remove();
                                    } catch (DeadObjectException e) {
                                        throw e;
                                    } catch (Throwable e2) {
                                        try {
                                            Log.w(z[30], z[23] + listenerRecord.componentName, e2);
                                            if (z) {
                                                continue;
                                            }
                                        } catch (DeadObjectException e3) {
                                            throw e3;
                                        }
                                    } catch (DeadObjectException e4) {
                                        try {
                                            if (Log.isLoggable(z[24], 3)) {
                                                Log.d(z[22], z[26] + listenerRecord.componentName);
                                            }
                                        } catch (DeadObjectException e32) {
                                            throw e32;
                                        }
                                    }
                                }
                                break;
                            } while (!z);
                            try {
                                break;
                                if (!listenerRecord.taskQueue.isEmpty()) {
                                    scheduleListenerRetry(listenerRecord);
                                }
                            } catch (DeadObjectException e322) {
                                throw e322;
                            }
                        } catch (DeadObjectException e3222) {
                            throw e3222;
                        } catch (DeadObjectException e32222) {
                            throw e32222;
                        }
                    }
                } catch (DeadObjectException e322222) {
                    throw e322222;
                }
            } catch (DeadObjectException e3222222) {
                throw e3222222;
            }
        }

        private void handleServiceConnected(ComponentName componentName, IBinder iBinder) {
            ListenerRecord listenerRecord = (ListenerRecord) this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                listenerRecord.service = Stub.asInterface(iBinder);
                listenerRecord.retryCount = 0;
                processListenerQueue(listenerRecord);
            }
        }

        private void handleRetryListenerQueue(ComponentName componentName) {
            ListenerRecord listenerRecord = (ListenerRecord) this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                processListenerQueue(listenerRecord);
            }
        }

        private void scheduleListenerRetry(ListenerRecord listenerRecord) {
            if (!this.mHandler.hasMessages(3, listenerRecord.componentName)) {
                listenerRecord.retryCount++;
                if (listenerRecord.retryCount > 6) {
                    Log.w(z[8], z[3] + listenerRecord.taskQueue.size() + z[2] + listenerRecord.componentName + z[5] + listenerRecord.retryCount + z[1]);
                    listenerRecord.taskQueue.clear();
                    return;
                }
                int i = (1 << (listenerRecord.retryCount - 1)) * 1000;
                if (Log.isLoggable(z[4], 3)) {
                    Log.d(z[9], z[6] + i + z[7]);
                }
                this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(3, listenerRecord.componentName), (long) i);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(z[16], 3)) {
                Log.d(z[17], z[18] + componentName);
            }
            this.mHandler.obtainMessage(2, componentName).sendToTarget();
        }

        public void queueTask(Task task) {
            this.mHandler.obtainMessage(0, task).sendToTarget();
        }
    }

    private void pushSideChannelQueue(Task task) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                sSideChannelManager = new SideChannelManager(this.mContext.getApplicationContext());
            }
        }
        sSideChannelManager.queueTask(task);
    }

    public static Set getEnabledListenerPackages(Context context) {
        int i = 0;
        boolean z = FragmentActivity.a;
        String string = Secure.getString(context.getContentResolver(), z[0]);
        if (!(string == null || string.equals(sEnabledNotificationListeners))) {
            String[] split = string.split(":");
            Set hashSet = new HashSet(split.length);
            int length = split.length;
            while (i < length) {
                ComponentName unflattenFromString = ComponentName.unflattenFromString(split[i]);
                if (unflattenFromString != null) {
                    hashSet.add(unflattenFromString.getPackageName());
                }
                i++;
                if (z) {
                    break;
                }
            }
            synchronized (sEnabledNotificationListenersLock) {
                sEnabledNotificationListenerPackages = hashSet;
                sEnabledNotificationListeners = string;
            }
        }
        return sEnabledNotificationListenerPackages;
    }

    static {
        String[] strArr = new String[3];
        String str = "^y%h&^s\u001bd%O~\"c)Zc-e$d{-y>^y!x9";
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
                        i3 = 59;
                        break;
                    case ay.f /*1*/:
                        i3 = 23;
                        break;
                    case ay.n /*2*/:
                        i3 = 68;
                        break;
                    case ay.p /*3*/:
                        i3 = 10;
                        break;
                    default:
                        i3 = 74;
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
                    str = "Zy x%Rsjy?Kg+x>\u0015b7o\u0019Rs!I\"Zy*o&";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    sEnabledNotificationListenersLock = new Object();
                    sEnabledNotificationListenerPackages = new HashSet();
                    sLock = new Object();
                    if (VERSION.SDK_INT >= 14) {
                        IMPL = new ImplIceCreamSandwich();
                    } else if (VERSION.SDK_INT >= 5) {
                        IMPL = new ImplEclair();
                    } else {
                        IMPL = new ImplBase();
                    }
                    SIDE_CHANNEL_BIND_FLAGS = IMPL.getSideChannelBindFlags();
                default:
                    strArr2[i] = str;
                    str = "Ux0c,Rt%~#Ty";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void cancel(String str, int i) {
        IMPL.cancelNotification(this.mNotificationManager, str, i);
        if (VERSION.SDK_INT <= 19) {
            pushSideChannelQueue(new CancelTask(this.mContext.getPackageName(), i, str));
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        return extras != null && extras.getBoolean(z[2]);
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) this.mContext.getSystemService(z[1]);
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    static int access$000() {
        return SIDE_CHANNEL_BIND_FLAGS;
    }

    public void notify(int i, Notification notification) {
        notify(null, i, notification);
    }

    public void cancel(int i) {
        cancel(null, i);
    }

    public void notify(String str, int i, Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new NotifyTask(this.mContext.getPackageName(), i, str, notification));
            IMPL.cancelNotification(this.mNotificationManager, str, i);
            if (!FragmentActivity.a) {
                return;
            }
        }
        IMPL.postNotification(this.mNotificationManager, str, i, notification);
    }
}
