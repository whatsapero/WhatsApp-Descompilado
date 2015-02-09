package com.whatsapp.messaging;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ba extends Handler {
    private static final String[] z;
    private final ak a;

    static {
        String[] strArr = new String[16];
        String str = "9J%Z@=v2\\X6L2G_7G";
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
                        i3 = 88;
                        break;
                    case ay.f /*1*/:
                        i3 = 41;
                        break;
                    case ay.n /*2*/:
                        i3 = 81;
                        break;
                    case ay.p /*3*/:
                        i3 = 51;
                        break;
                    default:
                        i3 = 54;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "1Y0WR*L\"@";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = ">H=_T9J:@";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "9_0ZZ9K=V";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "2@5";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "7_4AD1M4lS Y8AS<";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = " D!C\u0019;F?]S;]8\\XwZ4]RwY8]Q,@<VY-]~@]1Y";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "9_0ZZ9K=V";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "9J%Z@=v2\\X6L2G_7G";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = ">H=_T9J:@";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "(^";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "2@5";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = " D!C\u0019;F?]S;]8\\Xw[4P@wJ>]X=J%";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "7_4AD1M4lS Y8AS<";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "1Y0WR*L\"@";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "(^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void a(Messenger messenger, String str, byte[] bArr, String str2, boolean z, boolean z2, ArrayList arrayList, boolean z3) {
        Bundle bundle = new Bundle(6);
        bundle.putString(z[5], str);
        bundle.putByteArray(z[1], bArr);
        bundle.putString(z[2], str2);
        bundle.putBoolean(z[4], z);
        bundle.putBoolean(z[0], z2);
        bundle.putSerializable(z[3], arrayList);
        bundle.putBoolean(z[6], z3);
        try {
            messenger.send(Message.obtain(null, 0, bundle));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public ba(ak akVar) {
        super(akVar.getLooper());
        this.a = akVar;
    }

    public static void a(Messenger messenger) {
        try {
            messenger.send(Message.obtain(null, 4));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void a(Messenger messenger, boolean z) {
        int i = 1;
        if (!z || au.a) {
            i = 0;
        }
        try {
            messenger.send(Message.obtain(null, 1, i, 0));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r13) {
        /*
        r12_this = this;
        r8 = 1;
        r9 = com.whatsapp.messaging.au.a;
        r0 = r13.what;
        switch(r0) {
            case 0: goto L_0x0009;
            case 1: goto L_0x0066;
            case 2: goto L_0x0080;
            case 3: goto L_0x0087;
            case 4: goto L_0x008e;
            case 5: goto L_0x0072;
            case 6: goto L_0x0079;
            case 7: goto L_0x0095;
            default: goto L_0x0008;
        };
    L_0x0008:
        return;
    L_0x0009:
        r0 = z;
        r1 = 13;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r13.obj;
        r7 = r0;
        r7 = (android.os.Bundle) r7;
        r0 = r12.a;	 Catch:{ RuntimeException -> 0x009e }
        r1 = z;	 Catch:{ RuntimeException -> 0x009e }
        r2 = 12;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x009e }
        r1 = r7.getString(r1);	 Catch:{ RuntimeException -> 0x009e }
        r2 = z;	 Catch:{ RuntimeException -> 0x009e }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x009e }
        r2 = r7.getByteArray(r2);	 Catch:{ RuntimeException -> 0x009e }
        r3 = z;	 Catch:{ RuntimeException -> 0x009e }
        r4 = 15;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x009e }
        r3 = r7.getString(r3);	 Catch:{ RuntimeException -> 0x009e }
        r4 = z;	 Catch:{ RuntimeException -> 0x009e }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x009e }
        r4 = r7.getBoolean(r4);	 Catch:{ RuntimeException -> 0x009e }
        r5 = z;	 Catch:{ RuntimeException -> 0x009e }
        r6 = 9;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x009e }
        r5 = r7.getBoolean(r5);	 Catch:{ RuntimeException -> 0x009e }
        r6 = z;	 Catch:{ RuntimeException -> 0x009e }
        r10 = 10;
        r6 = r6[r10];	 Catch:{ RuntimeException -> 0x009e }
        r6 = r7.getSerializable(r6);	 Catch:{ RuntimeException -> 0x009e }
        r6 = (java.util.ArrayList) r6;	 Catch:{ RuntimeException -> 0x009e }
        r10 = z;	 Catch:{ RuntimeException -> 0x009e }
        r11 = 14;
        r10 = r10[r11];	 Catch:{ RuntimeException -> 0x009e }
        r7 = r7.getBoolean(r10);	 Catch:{ RuntimeException -> 0x009e }
        com.whatsapp.messaging.ak.a(r0, r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x009e }
        if (r9 == 0) goto L_0x0008;
    L_0x0066:
        r1 = r12.a;	 Catch:{ RuntimeException -> 0x00a0 }
        r0 = r13.arg1;	 Catch:{ RuntimeException -> 0x00a0 }
        if (r0 != r8) goto L_0x00a2;
    L_0x006c:
        r0 = r8;
    L_0x006d:
        com.whatsapp.messaging.ak.a(r1, r0);	 Catch:{ RuntimeException -> 0x00a4 }
        if (r9 == 0) goto L_0x0008;
    L_0x0072:
        r0 = r12.a;	 Catch:{ RuntimeException -> 0x00a6 }
        com.whatsapp.messaging.ak.d(r0);	 Catch:{ RuntimeException -> 0x00a6 }
        if (r9 == 0) goto L_0x0008;
    L_0x0079:
        r0 = r12.a;	 Catch:{ RuntimeException -> 0x00a8 }
        com.whatsapp.messaging.ak.f(r0);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r9 == 0) goto L_0x0008;
    L_0x0080:
        r0 = r12.a;	 Catch:{ RuntimeException -> 0x00aa }
        com.whatsapp.messaging.ak.g(r0);	 Catch:{ RuntimeException -> 0x00aa }
        if (r9 == 0) goto L_0x0008;
    L_0x0087:
        r0 = r12.a;	 Catch:{ RuntimeException -> 0x00ac }
        com.whatsapp.messaging.ak.a(r0, r13);	 Catch:{ RuntimeException -> 0x00ac }
        if (r9 == 0) goto L_0x0008;
    L_0x008e:
        r0 = r12.a;	 Catch:{ RuntimeException -> 0x009c }
        com.whatsapp.messaging.ak.a(r0);	 Catch:{ RuntimeException -> 0x009c }
        if (r9 == 0) goto L_0x0008;
    L_0x0095:
        r0 = r12.a;	 Catch:{ RuntimeException -> 0x009c }
        com.whatsapp.messaging.ak.i(r0);	 Catch:{ RuntimeException -> 0x009c }
        goto L_0x0008;
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;
    L_0x00a2:
        r0 = 0;
        goto L_0x006d;
    L_0x00a4:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00a6 }
    L_0x00a6:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x00a8:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00aa }
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00ac }
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009c }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ba.handleMessage(android.os.Message):void");
    }

    public static void c(Messenger messenger) {
        try {
            messenger.send(Message.obtain(null, 6));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void e(Messenger messenger) {
        if (messenger == null) {
            try {
                Log.i(z[7]);
                return;
            } catch (RemoteException e) {
                throw e;
            }
        }
        try {
            messenger.send(Message.obtain(null, 7));
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void a(Messenger messenger, Message message) {
        message.what = 3;
        try {
            messenger.send(message);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(Messenger messenger) {
        try {
            messenger.send(Message.obtain(null, 5));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void d(Messenger messenger) {
        try {
            messenger.send(Message.obtain(null, 2));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
