package com.android.vending.billing;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.whatsapp.DialogToastActivity;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public interface IInAppBillingService extends IInterface {

    public abstract class Stub extends Binder implements IInAppBillingService {
        public static boolean a;
        private static final String z;

        class Proxy implements IInAppBillingService {
            private static final String[] z;
            private IBinder a;

            static {
                String[] strArr = new String[5];
                String str = "+A\u0010C\u007f&J\u000f\u0002w,\u0000\u000b\bp,G\u0013\n0*G\u0011\u0001w&IS$W&o\r\u001d\\!B\u0011\u0004p/}\u0018\u001fh!M\u0018";
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
                                i3 = 72;
                                break;
                            case ay.f /*1*/:
                                i3 = 46;
                                break;
                            case ay.n /*2*/:
                                i3 = 125;
                                break;
                            case ay.p /*3*/:
                                i3 = 109;
                                break;
                            default:
                                i3 = 30;
                                break;
                        }
                        cArr[i2] = (char) (i3 ^ c);
                    }
                    str = new String(cArr).intern();
                    switch (obj) {
                        case PBE.MD5 /*0*/:
                            strArr2[i] = str;
                            str = "+A\u0010C\u007f&J\u000f\u0002w,\u0000\u000b\bp,G\u0013\n0*G\u0011\u0001w&IS$W&o\r\u001d\\!B\u0011\u0004p/}\u0018\u001fh!M\u0018";
                            i = 2;
                            strArr2 = strArr3;
                            obj = 1;
                            break;
                        case ay.f /*1*/:
                            strArr2[i] = str;
                            str = "+A\u0010C\u007f&J\u000f\u0002w,\u0000\u000b\bp,G\u0013\n0*G\u0011\u0001w&IS$W&o\r\u001d\\!B\u0011\u0004p/}\u0018\u001fh!M\u0018";
                            i = 3;
                            strArr2 = strArr3;
                            obj = 2;
                            break;
                        case ay.n /*2*/:
                            strArr2[i] = str;
                            i = 4;
                            strArr2 = strArr3;
                            str = "+A\u0010C\u007f&J\u000f\u0002w,\u0000\u000b\bp,G\u0013\n0*G\u0011\u0001w&IS$W&o\r\u001d\\!B\u0011\u0004p/}\u0018\u001fh!M\u0018";
                            obj = 3;
                            break;
                        case ay.p /*3*/:
                            strArr2[i] = str;
                            z = strArr3;
                        default:
                            strArr2[i] = str;
                            str = "+A\u0010C\u007f&J\u000f\u0002w,\u0000\u000b\bp,G\u0013\n0*G\u0011\u0001w&IS$W&o\r\u001d\\!B\u0011\u0004p/}\u0018\u001fh!M\u0018";
                            i = 1;
                            strArr2 = strArr3;
                            obj = null;
                            break;
                    }
                }
            }

            Proxy(IBinder iBinder) {
                this.a = iBinder;
            }

            public int isBillingSupported(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(z[2]);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.os.Bundle getSkuDetails(int r9, java.lang.String r10, java.lang.String r11, android.os.Bundle r12) {
                /*
                r8_this = this;
                r2 = 1;
                r1 = 0;
                r3 = a;
                r4 = android.os.Parcel.obtain();
                r5 = android.os.Parcel.obtain();
                r0 = z;	 Catch:{ all -> 0x0057 }
                r6 = 4;
                r0 = r0[r6];	 Catch:{ all -> 0x0057 }
                r4.writeInterfaceToken(r0);	 Catch:{ all -> 0x0057 }
                r4.writeInt(r9);	 Catch:{ all -> 0x0057 }
                r4.writeString(r10);	 Catch:{ all -> 0x0057 }
                r4.writeString(r11);	 Catch:{ all -> 0x0057 }
                if (r12 == 0) goto L_0x0029;
            L_0x001f:
                r0 = 1;
                r4.writeInt(r0);	 Catch:{ all -> 0x0057 }
                r0 = 0;
                r12.writeToParcel(r4, r0);	 Catch:{ all -> 0x0057 }
                if (r3 == 0) goto L_0x002d;
            L_0x0029:
                r0 = 0;
                r4.writeInt(r0);	 Catch:{ all -> 0x0057 }
            L_0x002d:
                r0 = r8.a;	 Catch:{ all -> 0x0057 }
                r6 = 2;
                r7 = 0;
                r0.transact(r6, r4, r5, r7);	 Catch:{ all -> 0x0057 }
                r5.readException();	 Catch:{ all -> 0x0057 }
                r0 = r5.readInt();	 Catch:{ all -> 0x0057 }
                if (r0 == 0) goto L_0x0047;
            L_0x003d:
                r0 = android.os.Bundle.CREATOR;	 Catch:{ all -> 0x0057 }
                r0 = r0.createFromParcel(r5);	 Catch:{ all -> 0x0057 }
                r0 = (android.os.Bundle) r0;	 Catch:{ all -> 0x0057 }
                if (r3 == 0) goto L_0x0048;
            L_0x0047:
                r0 = 0;
            L_0x0048:
                r5.recycle();
                r4.recycle();
                r4 = com.whatsapp.DialogToastActivity.i;
                if (r4 == 0) goto L_0x0056;
            L_0x0052:
                if (r3 == 0) goto L_0x005f;
            L_0x0054:
                a = r1;
            L_0x0056:
                return r0;
            L_0x0057:
                r0 = move-exception;
                r5.recycle();
                r4.recycle();
                throw r0;
            L_0x005f:
                r1 = r2;
                goto L_0x0054;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.android.vending.billing.IInAppBillingService.Stub.Proxy.getSkuDetails(int, java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
            }

            public int consumePurchase(int i, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(z[0]);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.os.Bundle getPurchases(int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
                /*
                r5_this = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = z;	 Catch:{ all -> 0x0040 }
                r3 = 3;
                r0 = r0[r3];	 Catch:{ all -> 0x0040 }
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0040 }
                r1.writeInt(r6);	 Catch:{ all -> 0x0040 }
                r1.writeString(r7);	 Catch:{ all -> 0x0040 }
                r1.writeString(r8);	 Catch:{ all -> 0x0040 }
                r1.writeString(r9);	 Catch:{ all -> 0x0040 }
                r0 = r5.a;	 Catch:{ all -> 0x0040 }
                r3 = 4;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0040 }
                r2.readException();	 Catch:{ all -> 0x0040 }
                r0 = r2.readInt();	 Catch:{ all -> 0x0040 }
                if (r0 == 0) goto L_0x0038;
            L_0x002c:
                r0 = android.os.Bundle.CREATOR;	 Catch:{ all -> 0x0040 }
                r0 = r0.createFromParcel(r2);	 Catch:{ all -> 0x0040 }
                r0 = (android.os.Bundle) r0;	 Catch:{ all -> 0x0040 }
                r3 = a;	 Catch:{ all -> 0x0040 }
                if (r3 == 0) goto L_0x0039;
            L_0x0038:
                r0 = 0;
            L_0x0039:
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0040:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.android.vending.billing.IInAppBillingService.Stub.Proxy.getPurchases(int, java.lang.String, java.lang.String, java.lang.String):android.os.Bundle");
            }

            public Bundle getBuyIntent(int i, String str, String str2, String str3, String str4) {
                boolean z = a;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    Bundle bundle;
                    obtain.writeInterfaceToken(z[1]);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                        if (z) {
                            boolean z2;
                            if (DialogToastActivity.i) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            DialogToastActivity.i = z2;
                        }
                        obtain2.recycle();
                        obtain.recycle();
                        return bundle;
                    }
                    bundle = null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        static {
            char[] toCharArray = "O&1\u001dsB-.\\{Hg*V|H 2T<N 0_{B.rz[B\b,CPE%0Z|K\u001a9AdE*9".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 44;
                        break;
                    case ay.f /*1*/:
                        i2 = 73;
                        break;
                    case ay.n /*2*/:
                        i2 = 92;
                        break;
                    case ay.p /*3*/:
                        i2 = 51;
                        break;
                    default:
                        i2 = 18;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public static IInAppBillingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(z);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IInAppBillingService)) ? new Proxy(iBinder) : (IInAppBillingService) queryLocalInterface;
        }
    }

    int consumePurchase(int i, String str, String str2);

    Bundle getBuyIntent(int i, String str, String str2, String str3, String str4);

    Bundle getPurchases(int i, String str, String str2, String str3);

    Bundle getSkuDetails(int i, String str, String str2, Bundle bundle);

    int isBillingSupported(int i, String str, String str2);
}
