package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.InboxStyle;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.NotificationCompatBase.Action;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class NotificationCompatJellybean {
    private static final Object sActionsLock;
    private static Field sExtrasField;
    private static boolean sExtrasFieldAccessFailed;
    private static final Object sExtrasLock;
    private static final String[] z;

    public class Builder implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions {
        public static boolean a;
        private static final String[] z;
        private android.app.Notification.Builder b;
        private List mActionExtrasList;
        private final Bundle mExtras;

        static {
            String[] strArr = new String[6];
            String str = "}\u0004'iEu\u000emh_l\u001a,i^2\u0019,i^W\u000f:";
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
                            i3 = 28;
                            break;
                        case ay.f /*1*/:
                            i3 = 106;
                            break;
                        case ay.n /*2*/:
                            i3 = 67;
                            break;
                        case ay.p /*3*/:
                            i3 = 27;
                            break;
                        default:
                            i3 = 42;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "}\u0004'iEu\u000emh_l\u001a,i^2\u001f0~yu\u000e&XB}\u0004-~F";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "}\u0004'iEu\u000emh_l\u001a,i^2\u0006,xKp%-wS";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        str = "}\u0004'iEu\u000emh_l\u001a,i^2\r1t_l!&b";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "}\u0004'iEu\u000emh_l\u001a,i^2\u000b oCs\u0004\u0006c^n\u000b0";
                        obj = 4;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "}\u0004'iEu\u000emh_l\u001a,i^2\u00030\\Xs\u001f3H_q\u0007\"iS";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public Notification build() {
            int i = Action.a;
            Notification build = this.b.build();
            Bundle extras = NotificationCompatJellybean.getExtras(build);
            Bundle bundle = new Bundle(this.mExtras);
            for (String str : this.mExtras.keySet()) {
                if (extras.containsKey(str)) {
                    bundle.remove(str);
                    continue;
                }
                if (i != 0) {
                    break;
                }
            }
            extras.putAll(bundle);
            SparseArray buildActionExtrasMap = NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if (buildActionExtrasMap != null) {
                NotificationCompatJellybean.getExtras(build).putSparseParcelableArray(z[5], buildActionExtrasMap);
            }
            return build;
        }

        public void addAction(Action action) {
            this.mActionExtrasList.add(NotificationCompatJellybean.writeActionAndGetExtras(this.b, action));
        }

        public android.app.Notification.Builder getBuilder() {
            return this.b;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(android.content.Context r9, android.app.Notification r10, java.lang.CharSequence r11, java.lang.CharSequence r12, java.lang.CharSequence r13, android.widget.RemoteViews r14, int r15, android.app.PendingIntent r16, android.app.PendingIntent r17, android.graphics.Bitmap r18, int r19, int r20, boolean r21, boolean r22, int r23, java.lang.CharSequence r24, boolean r25, android.os.Bundle r26, java.lang.String r27, boolean r28, java.lang.String r29) {
            /*
            r8_this = this;
            r8.<init>();
            r4 = new java.util.ArrayList;
            r4.<init>();
            r8.mActionExtrasList = r4;
            r4 = new android.app.Notification$Builder;
            r4.<init>(r9);
            r6 = r10.when;
            r4 = r4.setWhen(r6);
            r5 = r10.icon;
            r6 = r10.iconLevel;
            r4 = r4.setSmallIcon(r5, r6);
            r5 = r10.contentView;
            r4 = r4.setContent(r5);
            r5 = r10.tickerText;
            r4 = r4.setTicker(r5, r14);
            r5 = r10.sound;
            r6 = r10.audioStreamType;
            r4 = r4.setSound(r5, r6);
            r5 = r10.vibrate;
            r4 = r4.setVibrate(r5);
            r5 = r10.ledARGB;
            r6 = r10.ledOnMS;
            r7 = r10.ledOffMS;
            r5 = r4.setLights(r5, r6, r7);
            r4 = r10.flags;
            r4 = r4 & 2;
            if (r4 == 0) goto L_0x010b;
        L_0x0047:
            r4 = 1;
        L_0x0048:
            r5 = r5.setOngoing(r4);
            r4 = r10.flags;
            r4 = r4 & 8;
            if (r4 == 0) goto L_0x010e;
        L_0x0052:
            r4 = 1;
        L_0x0053:
            r5 = r5.setOnlyAlertOnce(r4);
            r4 = r10.flags;
            r4 = r4 & 16;
            if (r4 == 0) goto L_0x0111;
        L_0x005d:
            r4 = 1;
        L_0x005e:
            r4 = r5.setAutoCancel(r4);
            r5 = r10.defaults;
            r4 = r4.setDefaults(r5);
            r4 = r4.setContentTitle(r11);
            r4 = r4.setContentText(r12);
            r0 = r24;
            r4 = r4.setSubText(r0);
            r4 = r4.setContentInfo(r13);
            r0 = r16;
            r4 = r4.setContentIntent(r0);
            r5 = r10.deleteIntent;
            r5 = r4.setDeleteIntent(r5);
            r4 = r10.flags;
            r4 = r4 & 128;
            if (r4 == 0) goto L_0x0114;
        L_0x008c:
            r4 = 1;
        L_0x008d:
            r0 = r17;
            r4 = r5.setFullScreenIntent(r0, r4);
            r0 = r18;
            r4 = r4.setLargeIcon(r0);
            r4 = r4.setNumber(r15);
            r0 = r22;
            r4 = r4.setUsesChronometer(r0);
            r0 = r23;
            r4 = r4.setPriority(r0);
            r0 = r19;
            r1 = r20;
            r2 = r21;
            r4 = r4.setProgress(r0, r1, r2);
            r8.b = r4;
            r4 = new android.os.Bundle;
            r4.<init>();
            r8.mExtras = r4;
            if (r26 == 0) goto L_0x00c5;
        L_0x00be:
            r4 = r8.mExtras;
            r0 = r26;
            r4.putAll(r0);
        L_0x00c5:
            if (r25 == 0) goto L_0x00d2;
        L_0x00c7:
            r4 = r8.mExtras;
            r5 = z;
            r6 = 3;
            r5 = r5[r6];
            r6 = 1;
            r4.putBoolean(r5, r6);
        L_0x00d2:
            if (r27 == 0) goto L_0x00fc;
        L_0x00d4:
            r4 = r8.mExtras;
            r5 = z;
            r6 = 4;
            r5 = r5[r6];
            r0 = r27;
            r4.putString(r5, r0);
            if (r28 == 0) goto L_0x00f1;
        L_0x00e2:
            r4 = r8.mExtras;
            r5 = z;
            r6 = 1;
            r5 = r5[r6];
            r6 = 1;
            r4.putBoolean(r5, r6);
            r4 = android.support.v4.app.NotificationCompatBase.Action.a;
            if (r4 == 0) goto L_0x00fc;
        L_0x00f1:
            r4 = r8.mExtras;
            r5 = z;
            r6 = 2;
            r5 = r5[r6];
            r6 = 1;
            r4.putBoolean(r5, r6);
        L_0x00fc:
            if (r29 == 0) goto L_0x010a;
        L_0x00fe:
            r4 = r8.mExtras;
            r5 = z;
            r6 = 0;
            r5 = r5[r6];
            r0 = r29;
            r4.putString(r5, r0);
        L_0x010a:
            return;
        L_0x010b:
            r4 = 0;
            goto L_0x0048;
        L_0x010e:
            r4 = 0;
            goto L_0x0053;
        L_0x0111:
            r4 = 0;
            goto L_0x005e;
        L_0x0114:
            r4 = 0;
            goto L_0x008d;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.NotificationCompatJellybean.Builder.<init>(android.content.Context, android.app.Notification, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, int, java.lang.CharSequence, boolean, android.os.Bundle, java.lang.String, boolean, java.lang.String):void");
        }
    }

    public static void addBigTextStyle(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3) {
        BigTextStyle bigText = new BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(charSequence).bigText(charSequence3);
        if (z) {
            bigText.setSummaryText(charSequence2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle getExtras(android.app.Notification r6) {
        /*
        r1 = 0;
        r2 = sExtrasLock;
        monitor-enter(r2);
        r0 = sExtrasFieldAccessFailed;	 Catch:{ all -> 0x0057 }
        if (r0 == 0) goto L_0x000b;
    L_0x0008:
        monitor-exit(r2);	 Catch:{ all -> 0x0057 }
        r0 = r1;
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = sExtrasField;	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        if (r0 != 0) goto L_0x0041;
    L_0x000f:
        r0 = android.app.Notification.class;
        r3 = z;	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        r4 = 7;
        r3 = r3[r4];	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        r0 = r0.getDeclaredField(r3);	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        r3 = android.os.Bundle.class;
        r4 = r0.getType();	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        r3 = r3.isAssignableFrom(r4);	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        if (r3 != 0) goto L_0x003b;
    L_0x0026:
        r0 = z;	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        r3 = 11;
        r0 = r0[r3];	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        r3 = z;	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        r4 = 8;
        r3 = r3[r4];	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        android.util.Log.e(r0, r3);	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        r0 = 1;
        sExtrasFieldAccessFailed = r0;	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        monitor-exit(r2);	 Catch:{ all -> 0x0057 }
        r0 = r1;
        goto L_0x000a;
    L_0x003b:
        r3 = 1;
        r0.setAccessible(r3);	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        sExtrasField = r0;	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
    L_0x0041:
        r0 = sExtrasField;	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        r0 = r0.get(r6);	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        r0 = (android.os.Bundle) r0;	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        if (r0 != 0) goto L_0x0055;
    L_0x004b:
        r0 = new android.os.Bundle;	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        r0.<init>();	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        r3 = sExtrasField;	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
        r3.set(r6, r0);	 Catch:{ IllegalAccessException -> 0x005a, NoSuchFieldException -> 0x0070 }
    L_0x0055:
        monitor-exit(r2);	 Catch:{ all -> 0x0057 }
        goto L_0x000a;
    L_0x0057:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0057 }
        throw r0;
    L_0x005a:
        r0 = move-exception;
        r3 = z;	 Catch:{ all -> 0x0057 }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ all -> 0x0057 }
        r4 = z;	 Catch:{ all -> 0x0057 }
        r5 = 12;
        r4 = r4[r5];	 Catch:{ all -> 0x0057 }
        android.util.Log.e(r3, r4, r0);	 Catch:{ all -> 0x0057 }
    L_0x006a:
        r0 = 1;
        sExtrasFieldAccessFailed = r0;	 Catch:{ all -> 0x0057 }
        monitor-exit(r2);	 Catch:{ all -> 0x0057 }
        r0 = r1;
        goto L_0x000a;
    L_0x0070:
        r0 = move-exception;
        r3 = z;	 Catch:{ all -> 0x0057 }
        r4 = 9;
        r3 = r3[r4];	 Catch:{ all -> 0x0057 }
        r4 = z;	 Catch:{ all -> 0x0057 }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ all -> 0x0057 }
        android.util.Log.e(r3, r4, r0);	 Catch:{ all -> 0x0057 }
        goto L_0x006a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.NotificationCompatJellybean.getExtras(android.app.Notification):android.os.Bundle");
    }

    static {
        String[] strArr = new String[13];
        String str = "\u000f0\u0015H";
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
                        i3 = 102;
                        break;
                    case ay.f /*1*/:
                        i3 = 83;
                        break;
                    case ay.n /*2*/:
                        i3 = 122;
                        break;
                    case ay.p /*3*/:
                        i3 = 38;
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
                    str = "\u00146\u0017Io\u0003\u001a\u0014Vn\u0012 ";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u00070\u000eOt\b\u001a\u0014R~\b'";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0003+\u000eTz\u0015";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0007=\u001eTt\u000f7TUn\u0016#\u0015ToH!\u001fKt\u001263Hk\u0013'\t";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "3=\u001bDw\u0003s\u000eI;\u00070\u0019Ch\u0015s\u0014Io\u000f5\u0013Ez\u0012:\u0015H;\u0003+\u000eTz\u0015";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0003+\u000eTz\u0015";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "(<\u000eO}\u000f0\u001bRr\t=TCc\u0012!\u001bU;\u0000:\u001fJ\u007fF:\t\u0006u\t'ZI}F'\u0003V~F\u0011\u000fH\u007f\n6";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "(<\u000eO}\u000f0\u001bRr\t=9Iv\u00162\u000e";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "(<\u000eO}\u000f0\u001bRr\t=9Iv\u00162\u000e";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "(<\u000eO}\u000f0\u001bRr\t=9Iv\u00162\u000e";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "3=\u001bDw\u0003s\u000eI;\u00070\u0019Ch\u0015s\u0014Io\u000f5\u0013Ez\u0012:\u0015H;\u0003+\u000eTz\u0015";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    sExtrasLock = new Object();
                    sActionsLock = new Object();
                default:
                    strArr2[i] = str;
                    str = "\u0012:\u000eJ~";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void addInboxStyle(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, CharSequence charSequence, boolean z, CharSequence charSequence2, ArrayList arrayList) {
        int i = Action.a;
        InboxStyle bigContentTitle = new InboxStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(charSequence);
        if (z) {
            bigContentTitle.setSummaryText(charSequence2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine((CharSequence) it.next());
            if (i != 0) {
                return;
            }
        }
    }

    public static void addBigPictureStyle(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, CharSequence charSequence, boolean z, CharSequence charSequence2, Bitmap bitmap, Bitmap bitmap2, boolean z2) {
        BigPictureStyle bigPicture = new BigPictureStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(charSequence).bigPicture(bitmap);
        if (z2) {
            bigPicture.bigLargeIcon(bitmap2);
        }
        if (z) {
            bigPicture.setSummaryText(charSequence2);
        }
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
            arrayList.add(getBundleForAction(actionArr[i2]));
            i2++;
            if (i != 0) {
                return arrayList;
            }
        }
        return arrayList;
    }

    public static Bundle writeActionAndGetExtras(android.app.Notification.Builder builder, Action action) {
        builder.addAction(action.getIcon(), action.getTitle(), action.getActionIntent());
        Bundle bundle = new Bundle(action.getExtras());
        if (action.getRemoteInputs() != null) {
            bundle.putParcelableArray(z[5], RemoteInputCompatJellybean.toBundleArray(action.getRemoteInputs()));
        }
        return bundle;
    }

    public static SparseArray buildActionExtrasMap(List list) {
        int i = Action.a;
        SparseArray sparseArray = null;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Bundle bundle = (Bundle) list.get(i2);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i2, bundle);
            }
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        return sparseArray;
    }

    private static Bundle getBundleForAction(Action action) {
        Bundle bundle = new Bundle();
        bundle.putInt(z[0], action.getIcon());
        bundle.putCharSequence(z[1], action.getTitle());
        bundle.putParcelable(z[3], action.getActionIntent());
        bundle.putBundle(z[4], action.getExtras());
        bundle.putParcelableArray(z[2], RemoteInputCompatJellybean.toBundleArray(action.getRemoteInputs()));
        return bundle;
    }
}
