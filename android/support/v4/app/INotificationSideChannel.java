package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public interface INotificationSideChannel extends IInterface {

    public abstract class Stub extends Binder implements INotificationSideChannel {
        private static final String[] z;

        class Proxy implements INotificationSideChannel {
            private static final String[] z;
            private IBinder mRemote;

            static {
                String[] strArr = new String[3];
                String str = "*u\u0015\u0017\u000f\"\u007f_\u0016\u0015;k\u001e\u0017\u0014emEK\u0001;k_,.$o\u0018\u0003\t(z\u0005\f\u000f%H\u0018\u0001\u0005\bs\u0010\u000b\u000e.w";
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
                                i3 = 75;
                                break;
                            case ay.f /*1*/:
                                i3 = 27;
                                break;
                            case ay.n /*2*/:
                                i3 = 113;
                                break;
                            case ay.p /*3*/:
                                i3 = 101;
                                break;
                            default:
                                i3 = 96;
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
                            str = "*u\u0015\u0017\u000f\"\u007f_\u0016\u0015;k\u001e\u0017\u0014emEK\u0001;k_,.$o\u0018\u0003\t(z\u0005\f\u000f%H\u0018\u0001\u0005\bs\u0010\u000b\u000e.w";
                            obj = 1;
                            break;
                        case ay.f /*1*/:
                            strArr2[i] = str;
                            z = strArr3;
                        default:
                            strArr2[i] = str;
                            str = "*u\u0015\u0017\u000f\"\u007f_\u0016\u0015;k\u001e\u0017\u0014emEK\u0001;k_,.$o\u0018\u0003\t(z\u0005\f\u000f%H\u0018\u0001\u0005\bs\u0010\u000b\u000e.w";
                            i = 1;
                            strArr2 = strArr3;
                            obj = null;
                            break;
                    }
                }
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void cancelAll(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(z[0]);
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void notify(java.lang.String r6, int r7, java.lang.String r8, android.app.Notification r9) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r0 = z;	 Catch:{ all -> 0x0033 }
                r2 = 2;
                r0 = r0[r2];	 Catch:{ all -> 0x0033 }
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0033 }
                r1.writeString(r6);	 Catch:{ all -> 0x0033 }
                r1.writeInt(r7);	 Catch:{ all -> 0x0033 }
                r1.writeString(r8);	 Catch:{ all -> 0x0033 }
                if (r9 == 0) goto L_0x0023;
            L_0x0017:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0033 }
                r0 = 0;
                r9.writeToParcel(r1, r0);	 Catch:{ all -> 0x0033 }
                r0 = android.support.v4.app.FragmentActivity.a;	 Catch:{ all -> 0x0033 }
                if (r0 == 0) goto L_0x0027;
            L_0x0023:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0033 }
            L_0x0027:
                r0 = r5.mRemote;	 Catch:{ all -> 0x0033 }
                r2 = 1;
                r3 = 0;
                r4 = 1;
                r0.transact(r2, r1, r3, r4);	 Catch:{ all -> 0x0033 }
                r1.recycle();
                return;
            L_0x0033:
                r0 = move-exception;
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.INotificationSideChannel.Stub.Proxy.notify(java.lang.String, int, java.lang.String, android.app.Notification):void");
            }

            public void cancel(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(z[1]);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        static {
            String[] strArr = new String[6];
            String str = "_-\\l*W'\u0016m0N3Wl1\u00105\f0$N3\u0016W\u000bQ7Qx,]\"Lw*P\u0010Qz }+Yp+[/";
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
                            i3 = 67;
                            break;
                        case ay.n /*2*/:
                            i3 = 56;
                            break;
                        case ay.p /*3*/:
                            i3 = 30;
                            break;
                        default:
                            i3 = 69;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "_-\\l*W'\u0016m0N3Wl1\u00105\f0$N3\u0016W\u000bQ7Qx,]\"Lw*P\u0010Qz }+Yp+[/";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "_-\\l*W'\u0016m0N3Wl1\u00105\f0$N3\u0016W\u000bQ7Qx,]\"Lw*P\u0010Qz }+Yp+[/";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        str = "_-\\l*W'\u0016m0N3Wl1\u00105\f0$N3\u0016W\u000bQ7Qx,]\"Lw*P\u0010Qz }+Yp+[/";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "_-\\l*W'\u0016m0N3Wl1\u00105\f0$N3\u0016W\u000bQ7Qx,]\"Lw*P\u0010Qz }+Yp+[/";
                        obj = 4;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "_-\\l*W'\u0016m0N3Wl1\u00105\f0$N3\u0016W\u000bQ7Qx,]\"Lw*P\u0010Qz }+Yp+[/";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
            /*
            r6_this = this;
            r1 = 1;
            switch(r7) {
                case 1: goto L_0x0013;
                case 2: goto L_0x003f;
                case 3: goto L_0x0057;
                case 1598968902: goto L_0x0009;
                default: goto L_0x0004;
            };
        L_0x0004:
            r0 = super.onTransact(r7, r8, r9, r10);
        L_0x0008:
            return r0;
        L_0x0009:
            r0 = z;
            r2 = 3;
            r0 = r0[r2];
            r9.writeString(r0);
            r0 = r1;
            goto L_0x0008;
        L_0x0013:
            r0 = z;
            r2 = 4;
            r0 = r0[r2];
            r8.enforceInterface(r0);
            r2 = r8.readString();
            r3 = r8.readInt();
            r4 = r8.readString();
            r0 = r8.readInt();
            if (r0 == 0) goto L_0x0039;
        L_0x002d:
            r0 = android.app.Notification.CREATOR;
            r0 = r0.createFromParcel(r8);
            r0 = (android.app.Notification) r0;
            r5 = android.support.v4.app.FragmentActivity.a;
            if (r5 == 0) goto L_0x003a;
        L_0x0039:
            r0 = 0;
        L_0x003a:
            r6.notify(r2, r3, r4, r0);
            r0 = r1;
            goto L_0x0008;
        L_0x003f:
            r0 = z;
            r0 = r0[r1];
            r8.enforceInterface(r0);
            r0 = r8.readString();
            r2 = r8.readInt();
            r3 = r8.readString();
            r6.cancel(r0, r2, r3);
            r0 = r1;
            goto L_0x0008;
        L_0x0057:
            r0 = z;
            r2 = 2;
            r0 = r0[r2];
            r8.enforceInterface(r0);
            r0 = r8.readString();
            r6.cancelAll(r0);
            r0 = r1;
            goto L_0x0008;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.INotificationSideChannel.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public static INotificationSideChannel asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(z[5]);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) ? new Proxy(iBinder) : (INotificationSideChannel) queryLocalInterface;
        }

        public Stub() {
            attachInterface(this, z[0]);
        }
    }

    void cancel(String str, int i, String str2);

    void cancelAll(String str);

    void notify(String str, int i, String str2, Notification notification);
}
