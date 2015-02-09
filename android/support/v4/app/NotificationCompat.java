package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.NotificationCompat.Action;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v4.app.NotificationCompat.Extender;
import android.support.v4.app.NotificationCompat.Style;
import android.support.v4.app.NotificationCompatBase.Action.Factory;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class NotificationCompat {
    private static final NotificationCompatImpl IMPL;

    public class Action extends android.support.v4.app.NotificationCompatBase.Action {
        public static final Factory FACTORY;
        public PendingIntent actionIntent;
        public int icon;
        private final Bundle mExtras;
        private final RemoteInput[] mRemoteInputs;
        public CharSequence title;

        public final class Builder {
            private final Bundle mExtras;
            private final int mIcon;
            private final PendingIntent mIntent;
            private ArrayList mRemoteInputs;
            private final CharSequence mTitle;

            public android.support.v4.app.NotificationCompat.Action.Builder addRemoteInput(RemoteInput remoteInput) {
                if (this.mRemoteInputs == null) {
                    this.mRemoteInputs = new ArrayList();
                }
                this.mRemoteInputs.add(remoteInput);
                return this;
            }

            public Builder(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i, charSequence, pendingIntent, new Bundle());
            }

            public android.support.v4.app.NotificationCompat.Action build() {
                RemoteInput[] remoteInputArr;
                if (this.mRemoteInputs != null) {
                    remoteInputArr = (RemoteInput[]) this.mRemoteInputs.toArray(new RemoteInput[this.mRemoteInputs.size()]);
                } else {
                    remoteInputArr = null;
                }
                return new android.support.v4.app.NotificationCompat.Action(this.mIcon, this.mTitle, this.mIntent, this.mExtras, remoteInputArr, null);
            }

            private Builder(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
                this.mIcon = i;
                this.mTitle = android.support.v4.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
                this.mIntent = pendingIntent;
                this.mExtras = bundle;
            }
        }

        public RemoteInput[] getRemoteInputs() {
            return getRemoteInputs();
        }

        protected PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        private Action(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr) {
            this.icon = i;
            this.title = android.support.v4.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            this.actionIntent = pendingIntent;
            if (bundle == null) {
                bundle = new Bundle();
            }
            this.mExtras = bundle;
            this.mRemoteInputs = remoteInputArr;
        }

        protected CharSequence getTitle() {
            return this.title;
        }

        Action(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, AnonymousClass_1 anonymousClass_1) {
            this(i, charSequence, pendingIntent, bundle, remoteInputArr);
        }

        static {
            FACTORY = new Factory() {
            };
        }

        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null);
        }

        public RemoteInput[] getRemoteInputs() {
            return this.mRemoteInputs;
        }

        public Bundle getExtras() {
            return this.mExtras;
        }

        protected int getIcon() {
            return this.icon;
        }
    }

    public abstract class Style {
        CharSequence mBigContentTitle;
        Builder mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet;

        public void setBuilder(Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (this.mBuilder != null) {
                    this.mBuilder.setStyle(this);
                }
            }
        }

        public Style() {
            this.mSummaryTextSet = false;
        }
    }

    public class BigPictureStyle extends Style {
        Bitmap mBigLargeIcon;
        boolean mBigLargeIconSet;
        Bitmap mPicture;

        public android.support.v4.app.NotificationCompat.BigPictureStyle bigPicture(Bitmap bitmap) {
            this.mPicture = bitmap;
            return this;
        }

        public android.support.v4.app.NotificationCompat.BigPictureStyle setSummaryText(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }
    }

    public class BigTextStyle extends Style {
        CharSequence mBigText;

        public android.support.v4.app.NotificationCompat.BigTextStyle setSummaryText(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public android.support.v4.app.NotificationCompat.BigTextStyle bigText(CharSequence charSequence) {
            this.mBigText = Builder.limitCharSequenceLength(charSequence);
            return this;
        }
    }

    public class Builder {
        ArrayList mActions;
        String mCategory;
        int mColor;
        CharSequence mContentInfo;
        PendingIntent mContentIntent;
        CharSequence mContentText;
        CharSequence mContentTitle;
        Context mContext;
        Bundle mExtras;
        PendingIntent mFullScreenIntent;
        String mGroupKey;
        boolean mGroupSummary;
        Bitmap mLargeIcon;
        boolean mLocalOnly;
        Notification mNotification;
        int mNumber;
        public ArrayList mPeople;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        Notification mPublicVersion;
        boolean mShowWhen;
        String mSortKey;
        Style mStyle;
        CharSequence mSubText;
        RemoteViews mTickerView;
        boolean mUseChronometer;
        int mVisibility;

        public android.support.v4.app.NotificationCompat.Builder setContentTitle(CharSequence charSequence) {
            this.mContentTitle = limitCharSequenceLength(charSequence);
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setSmallIcon(int i) {
            this.mNotification.icon = i;
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setDeleteIntent(PendingIntent pendingIntent) {
            this.mNotification.deleteIntent = pendingIntent;
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setLargeIcon(Bitmap bitmap) {
            this.mLargeIcon = bitmap;
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setDefaults(int i) {
            this.mNotification.defaults = i;
            if ((i & 4) != 0) {
                Notification notification = this.mNotification;
                notification.flags |= 1;
            }
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setColor(int i) {
            this.mColor = i;
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setWhen(long j) {
            this.mNotification.when = j;
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.mActions.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setOnlyAlertOnce(boolean z) {
            setFlag(8, z);
            return this;
        }

        @Deprecated
        public Notification getNotification() {
            return NotificationCompat.access$200().build(this);
        }

        public android.support.v4.app.NotificationCompat.Builder setLights(int i, int i2, int i3) {
            int i4;
            int i5 = 1;
            this.mNotification.ledARGB = i;
            this.mNotification.ledOnMS = i2;
            this.mNotification.ledOffMS = i3;
            if (this.mNotification.ledOnMS == 0 || this.mNotification.ledOffMS == 0) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            Notification notification = this.mNotification;
            int i6 = this.mNotification.flags & -2;
            if (i4 == 0) {
                i5 = 0;
            }
            notification.flags = i6 | i5;
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder addPerson(String str) {
            this.mPeople.add(str);
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setGroupSummary(boolean z) {
            this.mGroupSummary = z;
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setVibrate(long[] jArr) {
            this.mNotification.vibrate = jArr;
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setContentIntent(PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setSound(Uri uri) {
            this.mNotification.sound = uri;
            this.mNotification.audioStreamType = -1;
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setContentText(CharSequence charSequence) {
            this.mContentText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Bundle getExtras() {
            if (this.mExtras == null) {
                this.mExtras = new Bundle();
            }
            return this.mExtras;
        }

        public android.support.v4.app.NotificationCompat.Builder setTicker(CharSequence charSequence) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder extend(Extender extender) {
            extender.extend(this);
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setStyle(Style style) {
            if (this.mStyle != style) {
                this.mStyle = style;
                if (this.mStyle != null) {
                    this.mStyle.setBuilder(this);
                }
            }
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setUsesChronometer(boolean z) {
            this.mUseChronometer = z;
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setOngoing(boolean z) {
            setFlag(2, z);
            return this;
        }

        public Builder(Context context) {
            this.mShowWhen = true;
            this.mActions = new ArrayList();
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mNotification = new Notification();
            this.mContext = context;
            this.mNotification.when = System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList();
        }

        public android.support.v4.app.NotificationCompat.Builder setCategory(String str) {
            this.mCategory = str;
            return this;
        }

        private void setFlag(int i, boolean z) {
            Notification notification;
            if (z) {
                notification = this.mNotification;
                notification.flags |= i;
                if (!FragmentActivity.a) {
                    return;
                }
            }
            notification = this.mNotification;
            notification.flags &= i ^ -1;
        }

        public Notification build() {
            return NotificationCompat.access$200().build(this);
        }

        protected static CharSequence limitCharSequenceLength(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public android.support.v4.app.NotificationCompat.Builder setProgress(int i, int i2, boolean z) {
            this.mProgressMax = i;
            this.mProgress = i2;
            this.mProgressIndeterminate = z;
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setPriority(int i) {
            this.mPriority = i;
            return this;
        }

        public android.support.v4.app.NotificationCompat.Builder setGroup(String str) {
            this.mGroupKey = str;
            return this;
        }
    }

    public interface Extender {
        Builder extend(Builder builder);
    }

    public class InboxStyle extends Style {
        ArrayList mTexts;

        public android.support.v4.app.NotificationCompat.InboxStyle addLine(CharSequence charSequence) {
            this.mTexts.add(Builder.limitCharSequenceLength(charSequence));
            return this;
        }

        public InboxStyle() {
            this.mTexts = new ArrayList();
        }

        public android.support.v4.app.NotificationCompat.InboxStyle setSummaryText(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }
    }

    interface NotificationCompatImpl {
        Notification build(Builder builder);

        Bundle getExtras(Notification notification);

        ArrayList getParcelableArrayListForActions(Action[] actionArr);
    }

    class NotificationCompatImplBase implements NotificationCompatImpl {
        public ArrayList getParcelableArrayListForActions(Action[] actionArr) {
            return null;
        }

        public Notification build(Builder builder) {
            Notification notification = builder.mNotification;
            notification.setLatestEventInfo(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent);
            if (builder.mPriority > 0) {
                notification.flags |= 128;
            }
            return notification;
        }

        NotificationCompatImplBase() {
        }

        public Bundle getExtras(Notification notification) {
            return null;
        }
    }

    class NotificationCompatImplJellybean extends NotificationCompatImplBase {
        public Bundle getExtras(Notification notification) {
            return NotificationCompatJellybean.getExtras(notification);
        }

        public ArrayList getParcelableArrayListForActions(Action[] actionArr) {
            return NotificationCompatJellybean.getParcelableArrayListForActions(actionArr);
        }

        public Notification build(Builder builder) {
            android.support.v4.app.NotificationCompatJellybean.Builder builder2 = new android.support.v4.app.NotificationCompatJellybean.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
            NotificationCompat.access$000(builder2, builder.mActions);
            NotificationCompat.access$100(builder2, builder.mStyle);
            return builder2.build();
        }

        NotificationCompatImplJellybean() {
        }
    }

    class NotificationCompatImplKitKat extends NotificationCompatImplJellybean {
        NotificationCompatImplKitKat() {
        }

        public Bundle getExtras(Notification notification) {
            return NotificationCompatKitKat.getExtras(notification);
        }

        public Notification build(Builder builder) {
            android.support.v4.app.NotificationCompatKitKat.Builder builder2 = new android.support.v4.app.NotificationCompatKitKat.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mPeople, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
            NotificationCompat.access$000(builder2, builder.mActions);
            NotificationCompat.access$100(builder2, builder.mStyle);
            return builder2.build();
        }
    }

    class NotificationCompatImplApi20 extends NotificationCompatImplKitKat {
        public Notification build(Builder builder) {
            android.support.v4.app.NotificationCompatApi20.Builder builder2 = new android.support.v4.app.NotificationCompatApi20.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mPeople, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
            NotificationCompat.access$000(builder2, builder.mActions);
            NotificationCompat.access$100(builder2, builder.mStyle);
            return builder2.build();
        }

        NotificationCompatImplApi20() {
        }

        public ArrayList getParcelableArrayListForActions(Action[] actionArr) {
            return NotificationCompatApi20.getParcelableArrayListForActions(actionArr);
        }
    }

    class NotificationCompatImplApi21 extends NotificationCompatImplApi20 {
        NotificationCompatImplApi21() {
        }

        public Notification build(Builder builder) {
            android.support.v4.app.NotificationCompatApi21.Builder builder2 = new android.support.v4.app.NotificationCompatApi21.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mCategory, builder.mPeople, builder.mExtras, builder.mColor, builder.mVisibility, builder.mPublicVersion, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
            NotificationCompat.access$000(builder2, builder.mActions);
            NotificationCompat.access$100(builder2, builder.mStyle);
            return builder2.build();
        }
    }

    class NotificationCompatImplGingerbread extends NotificationCompatImplBase {
        public Notification build(Builder builder) {
            Notification notification = builder.mNotification;
            notification.setLatestEventInfo(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent);
            notification = NotificationCompatGingerbread.add(notification, builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent, builder.mFullScreenIntent);
            if (builder.mPriority > 0) {
                notification.flags |= 128;
            }
            return notification;
        }

        NotificationCompatImplGingerbread() {
        }
    }

    class NotificationCompatImplHoneycomb extends NotificationCompatImplBase {
        NotificationCompatImplHoneycomb() {
        }

        public Notification build(Builder builder) {
            return NotificationCompatHoneycomb.add(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon);
        }
    }

    class NotificationCompatImplIceCreamSandwich extends NotificationCompatImplBase {
        NotificationCompatImplIceCreamSandwich() {
        }

        public Notification build(Builder builder) {
            return NotificationCompatIceCreamSandwich.add(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        }
    }

    public final class WearableExtender implements Extender {
        private static final String[] z;
        private ArrayList mActions;
        private Bitmap mBackground;
        private int mContentActionIndex;
        private int mContentIcon;
        private int mContentIconGravity;
        private int mCustomContentHeight;
        private int mCustomSizePreset;
        private PendingIntent mDisplayIntent;
        private int mFlags;
        private int mGravity;
        private int mHintScreenTimeout;
        private ArrayList mPages;

        static {
            String[] strArr = new String[13];
            String str = "X1'\u001b4";
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
                            i3 = 62;
                            break;
                        case ay.f /*1*/:
                            i3 = 93;
                            break;
                        case ay.n /*2*/:
                            i3 = 70;
                            break;
                        case ay.p /*3*/:
                            i3 = 124;
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
                        str = "_>2\u0015(P.";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "V4(\b\u0014]/#\u0019)j4+\u0019(K)";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        str = "Y/'\n.J$";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "\\<%\u0017 L23\u0012#";
                        obj = 4;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "N<!\u00194";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case aV.r /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "Z45\f+_$\u000f\u00123[32";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case aV.i /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "]2(\b\"P)\u000f\u001f(P";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case a8.s /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "](5\b(S\u000e/\u0006\"n/#\u000f\"J";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case a8.n /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "](5\b(S\u001e)\u00123[324\"W:.\b";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case a6.D /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "]2(\b\"P)\u000f\u001f(P\u001a4\u001d1W)?";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case a6.h /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "_3\"\u000e(W9h\u000b\"_/'\u001e+[s\u0003$\u0013{\u0013\u00155\bp\u000e";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case a6.e /*11*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "]2(\b\"P)\u0007\u001f3W2(5)Z8>";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public android.support.v4.app.NotificationCompat.WearableExtender setStartScrollBottom(boolean z) {
            setFlag(8, z);
            return this;
        }

        public android.support.v4.app.NotificationCompat.WearableExtender setBackground(Bitmap bitmap) {
            this.mBackground = bitmap;
            return this;
        }

        private void setFlag(int i, boolean z) {
            if (z) {
                this.mFlags |= i;
                if (!FragmentActivity.a) {
                    return;
                }
            }
            this.mFlags &= i ^ -1;
        }

        public android.support.v4.app.NotificationCompat.WearableExtender setHintShowBackgroundOnly(boolean z) {
            setFlag(4, z);
            return this;
        }

        public Builder extend(Builder builder) {
            Bundle bundle = new Bundle();
            if (!this.mActions.isEmpty()) {
                bundle.putParcelableArrayList(z[2], NotificationCompat.access$200().getParcelableArrayListForActions((Action[]) this.mActions.toArray(new Action[this.mActions.size()])));
            }
            if (this.mFlags != 1) {
                bundle.putInt(z[0], this.mFlags);
            }
            if (this.mDisplayIntent != null) {
                bundle.putParcelable(z[7], this.mDisplayIntent);
            }
            if (!this.mPages.isEmpty()) {
                bundle.putParcelableArray(z[6], (Parcelable[]) this.mPages.toArray(new Notification[this.mPages.size()]));
            }
            if (this.mBackground != null) {
                bundle.putParcelable(z[5], this.mBackground);
            }
            if (this.mContentIcon != 0) {
                bundle.putInt(z[8], this.mContentIcon);
            }
            if (this.mContentIconGravity != 8388613) {
                bundle.putInt(z[11], this.mContentIconGravity);
            }
            if (this.mContentActionIndex != -1) {
                bundle.putInt(z[1], this.mContentActionIndex);
            }
            if (this.mCustomSizePreset != 0) {
                bundle.putInt(z[9], this.mCustomSizePreset);
            }
            if (this.mCustomContentHeight != 0) {
                bundle.putInt(z[10], this.mCustomContentHeight);
            }
            if (this.mGravity != 80) {
                bundle.putInt(z[4], this.mGravity);
            }
            if (this.mHintScreenTimeout != 0) {
                bundle.putInt(z[3], this.mHintScreenTimeout);
            }
            builder.getExtras().putBundle(z[12], bundle);
            return builder;
        }

        public Object clone() {
            return clone();
        }

        public android.support.v4.app.NotificationCompat.WearableExtender addPage(Notification notification) {
            this.mPages.add(notification);
            return this;
        }

        public android.support.v4.app.NotificationCompat.WearableExtender addAction(Action action) {
            this.mActions.add(action);
            return this;
        }

        public WearableExtender() {
            this.mActions = new ArrayList();
            this.mFlags = 1;
            this.mPages = new ArrayList();
            this.mContentIconGravity = 8388613;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = 80;
        }

        public android.support.v4.app.NotificationCompat.WearableExtender clone() {
            android.support.v4.app.NotificationCompat.WearableExtender wearableExtender = new android.support.v4.app.NotificationCompat.WearableExtender();
            wearableExtender.mActions = new ArrayList(this.mActions);
            wearableExtender.mFlags = this.mFlags;
            wearableExtender.mDisplayIntent = this.mDisplayIntent;
            wearableExtender.mPages = new ArrayList(this.mPages);
            wearableExtender.mBackground = this.mBackground;
            wearableExtender.mContentIcon = this.mContentIcon;
            wearableExtender.mContentIconGravity = this.mContentIconGravity;
            wearableExtender.mContentActionIndex = this.mContentActionIndex;
            wearableExtender.mCustomSizePreset = this.mCustomSizePreset;
            wearableExtender.mCustomContentHeight = this.mCustomContentHeight;
            wearableExtender.mGravity = this.mGravity;
            wearableExtender.mHintScreenTimeout = this.mHintScreenTimeout;
            return wearableExtender;
        }
    }

    private static void addStyleToBuilderJellybean(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, Style style) {
        boolean z = FragmentActivity.a;
        if (style != null) {
            if (style instanceof BigTextStyle) {
                BigTextStyle bigTextStyle = (BigTextStyle) style;
                NotificationCompatJellybean.addBigTextStyle(notificationBuilderWithBuilderAccessor, bigTextStyle.mBigContentTitle, bigTextStyle.mSummaryTextSet, bigTextStyle.mSummaryText, bigTextStyle.mBigText);
                if (!z) {
                    return;
                }
            }
            if (style instanceof InboxStyle) {
                InboxStyle inboxStyle = (InboxStyle) style;
                NotificationCompatJellybean.addInboxStyle(notificationBuilderWithBuilderAccessor, inboxStyle.mBigContentTitle, inboxStyle.mSummaryTextSet, inboxStyle.mSummaryText, inboxStyle.mTexts);
                if (!z) {
                    return;
                }
            }
            if (style instanceof BigPictureStyle) {
                BigPictureStyle bigPictureStyle = (BigPictureStyle) style;
                NotificationCompatJellybean.addBigPictureStyle(notificationBuilderWithBuilderAccessor, bigPictureStyle.mBigContentTitle, bigPictureStyle.mSummaryTextSet, bigPictureStyle.mSummaryText, bigPictureStyle.mPicture, bigPictureStyle.mBigLargeIcon, bigPictureStyle.mBigLargeIconSet);
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            IMPL = new NotificationCompatImplApi21();
        } else if (VERSION.SDK_INT >= 20) {
            IMPL = new NotificationCompatImplApi20();
        } else if (VERSION.SDK_INT >= 19) {
            IMPL = new NotificationCompatImplKitKat();
        } else if (VERSION.SDK_INT >= 16) {
            IMPL = new NotificationCompatImplJellybean();
        } else if (VERSION.SDK_INT >= 14) {
            IMPL = new NotificationCompatImplIceCreamSandwich();
        } else if (VERSION.SDK_INT >= 11) {
            IMPL = new NotificationCompatImplHoneycomb();
        } else if (VERSION.SDK_INT >= 9) {
            IMPL = new NotificationCompatImplGingerbread();
        } else {
            IMPL = new NotificationCompatImplBase();
        }
    }

    private static void addActionsToBuilder(NotificationBuilderWithActions notificationBuilderWithActions, ArrayList arrayList) {
        boolean z = FragmentActivity.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            notificationBuilderWithActions.addAction((Action) it.next());
            if (z) {
                return;
            }
        }
    }

    static void access$100(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor, Style style) {
        addStyleToBuilderJellybean(notificationBuilderWithBuilderAccessor, style);
    }

    static NotificationCompatImpl access$200() {
        return IMPL;
    }

    static void access$000(NotificationBuilderWithActions notificationBuilderWithActions, ArrayList arrayList) {
        addActionsToBuilder(notificationBuilderWithActions, arrayList);
    }

    public static Bundle getExtras(Notification notification) {
        return IMPL.getExtras(notification);
    }
}
