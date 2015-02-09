package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Pair;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import com.whatsapp.util.bm;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ac {
    private static final a3x a;
    private static final int[] b;
    static long c;
    static long d;
    static int e;
    static long f;
    static boolean g;
    private static final int[] h;
    private static final String[] z;

    public static void a(int i) {
        b(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r7, long r8, long r10) {
        /*
        r4 = 4444444444000; // 0x40acd884560 float:-2.85780992E8 double:2.1958473146304E-311;
        r0 = com.whatsapp.App.az;
        r2 = java.lang.System.currentTimeMillis();
        r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r1 == 0) goto L_0x0043;
    L_0x000f:
        r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r1 < 0) goto L_0x0017;
    L_0x0013:
        r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x0043;
    L_0x0017:
        r1 = com.whatsapp.ChangeNumber.g();	 Catch:{ NumberFormatException -> 0x0044 }
        if (r1 != 0) goto L_0x0043;
    L_0x001d:
        r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r1 >= 0) goto L_0x0028;
    L_0x0021:
        r1 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r7.showDialog(r1);	 Catch:{ NumberFormatException -> 0x0048 }
        if (r0 == 0) goto L_0x0043;
    L_0x0028:
        r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r1 < 0) goto L_0x0033;
    L_0x002c:
        r1 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r7.showDialog(r1);	 Catch:{ NumberFormatException -> 0x004c }
        if (r0 == 0) goto L_0x0043;
    L_0x0033:
        r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r1 > 0) goto L_0x003e;
    L_0x0037:
        r1 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r7.showDialog(r1);	 Catch:{ NumberFormatException -> 0x0050 }
        if (r0 == 0) goto L_0x0043;
    L_0x003e:
        r0 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r7.showDialog(r0);	 Catch:{ NumberFormatException -> 0x0050 }
    L_0x0043:
        return;
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ac.a(android.app.Activity, long, long):void");
    }

    static void b(long j) {
        Log.i(z[35] + new Date(j));
        d = j;
        a(j);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(boolean r10, boolean r11) {
        /*
        r9 = 3;
        r8 = 0;
        r0 = com.whatsapp.App.az;
        r1 = z;
        r2 = 29;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = new android.support.v4.app.NotificationCompat$Builder;
        r2 = com.whatsapp.App.p;
        r1.<init>(r2);
        r2 = 2130838997; // 0x7f0205d5 float:1.7282992E38 double:1.052774345E-314;
        r1.setSmallIcon(r2);	 Catch:{ NumberFormatException -> 0x00b8 }
        if (r10 == 0) goto L_0x002a;
    L_0x001c:
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x00ba }
        r3 = 2131624836; // 0x7f0e0384 float:1.8876863E38 double:1.0531626013E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x00ba }
        r1.setTicker(r2);	 Catch:{ NumberFormatException -> 0x00ba }
        if (r0 == 0) goto L_0x0036;
    L_0x002a:
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x00ba }
        r3 = 2131624834; // 0x7f0e0382 float:1.8876859E38 double:1.0531626003E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x00ba }
        r1.setTicker(r2);	 Catch:{ NumberFormatException -> 0x00ba }
    L_0x0036:
        if (r10 == 0) goto L_0x0046;
    L_0x0038:
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x00bc }
        r3 = 2131624835; // 0x7f0e0383 float:1.887686E38 double:1.053162601E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x00bc }
        r1.setContentTitle(r2);	 Catch:{ NumberFormatException -> 0x00bc }
        if (r0 == 0) goto L_0x0052;
    L_0x0046:
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x00bc }
        r3 = 2131624833; // 0x7f0e0381 float:1.8876857E38 double:1.0531626E-314;
        r2 = r2.getString(r3);	 Catch:{ NumberFormatException -> 0x00bc }
        r1.setContentTitle(r2);	 Catch:{ NumberFormatException -> 0x00bc }
    L_0x0052:
        if (r11 == 0) goto L_0x0071;
    L_0x0054:
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x00be }
        r3 = 2131624830; // 0x7f0e037e float:1.887685E38 double:1.0531625983E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x00be }
        r5 = 0;
        r6 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x00be }
        r7 = 2131624471; // 0x7f0e0217 float:1.8876123E38 double:1.053162421E-314;
        r6 = r6.getString(r7);	 Catch:{ NumberFormatException -> 0x00be }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x00be }
        r2 = r2.getString(r3, r4);	 Catch:{ NumberFormatException -> 0x00be }
        r1.setContentText(r2);	 Catch:{ NumberFormatException -> 0x00be }
        if (r0 == 0) goto L_0x008b;
    L_0x0071:
        r0 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x00be }
        r2 = 2131624830; // 0x7f0e037e float:1.887685E38 double:1.0531625983E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ NumberFormatException -> 0x00be }
        r4 = 0;
        r5 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x00be }
        r6 = f;	 Catch:{ NumberFormatException -> 0x00be }
        r5 = com.whatsapp.util.bm.c(r5, r6);	 Catch:{ NumberFormatException -> 0x00be }
        r3[r4] = r5;	 Catch:{ NumberFormatException -> 0x00be }
        r0 = r0.getString(r2, r3);	 Catch:{ NumberFormatException -> 0x00be }
        r1.setContentText(r0);	 Catch:{ NumberFormatException -> 0x00be }
    L_0x008b:
        r0 = new android.content.Intent;
        r2 = com.whatsapp.App.p;
        r3 = com.whatsapp.Main.b();
        r0.<init>(r2, r3);
        r2 = com.whatsapp.App.p;
        r3 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = android.app.PendingIntent.getActivity(r2, r8, r0, r3);
        r1.setContentIntent(r0);
        r1.setDefaults(r9);
        r0 = r1.build();
        r1 = r0.flags;
        r1 = r1 | 16;
        r0.flags = r1;
        r1 = com.whatsapp.App.p;
        r1 = android.support.v4.app.NotificationManagerCompat.from(r1);
        r1.notify(r9, r0);
        return;
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = move-exception;
        throw r0;
    L_0x00be:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ac.a(boolean, boolean):void");
    }

    public static int a(boolean z) {
        int i = App.az;
        long b = b(z[22]);
        if (b == 0) {
            return -1;
        }
        b -= System.currentTimeMillis();
        long b2 = b(z[23]);
        if (b < 0) {
            if (!z) {
                try {
                    if (bm.a(b2)) {
                        return -1;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            return 0;
        }
        int i2 = ((int) (b / 86400000)) + 1;
        int[] iArr = b;
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = iArr[i3];
            if (i2 == i4) {
                try {
                    if (!bm.a(b2)) {
                        return i4;
                    }
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
            i4 = i3 + 1;
            if (i != 0) {
                return -1;
            }
            i3 = i4;
        }
        return -1;
    }

    public static void a(atf com_whatsapp_atf, long j, boolean z) {
        a(com_whatsapp_atf, j, z, null);
    }

    private static int a(long j, Date date) {
        return ((int) ((date.getTime() - j) / 86400000)) + 1;
    }

    public static int a(Context context) {
        int i = 0;
        int i2 = App.az;
        SharedPreferences sharedPreferences = context.getSharedPreferences(z[8], 0);
        long j = sharedPreferences.getLong(z[9], 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (86400000 + j > currentTimeMillis) {
            try {
                Log.i(z[7]);
                return -1;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        Date aN = App.aN();
        int a = a(currentTimeMillis, aN);
        int a2 = a(j, aN);
        int[] iArr = h;
        int length = iArr.length;
        while (i < length) {
            int i3 = iArr[i];
            if (a > i3 || a2 <= i3) {
                i++;
                if (i2 != 0) {
                    return -1;
                }
            }
            Editor edit = sharedPreferences.edit();
            try {
                edit.putLong(z[10], currentTimeMillis);
                if (!edit.commit()) {
                    Log.e(z[6]);
                }
                return a;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        return -1;
    }

    private static void a(long j) {
        synchronized (z[14]) {
            try {
                Log.i(z[16] + new Date(j));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(App.p.getFilesDir(), z[15])));
                objectOutputStream.writeLong(j);
                objectOutputStream.close();
            } catch (Throwable e) {
                Log.c(e);
            } catch (Throwable th) {
            }
        }
    }

    public static void d() {
        synchronized (z[4]) {
            new File(App.p.getFilesDir(), z[5]).delete();
            d = 0;
        }
    }

    public static void b(a3a com_whatsapp_a3a) {
        a.unregisterObserver(com_whatsapp_a3a);
    }

    public static String a(Activity activity, ArrayList arrayList) {
        String str;
        int i = App.az;
        Iterator it = arrayList.iterator();
        String str2 = "";
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                if (z[12].equalsIgnoreCase((String) pair.first) && i == 0) {
                    str = str2;
                } else {
                    str = str2 + a(activity, (String) pair.first, (String) pair.second, false) + " ";
                }
                if (i == 0) {
                    str2 = str;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
            break;
        }
        str = str2;
        try {
            break;
            if (str.equals("")) {
                if (e == 0) {
                    if (c >= 4444444444000L) {
                        str = activity.getString(R.string.extension_lifetime);
                        if (i == 0) {
                            return str;
                        }
                    }
                    str = activity.getString(R.string.extension_active, new Object[]{bm.c(activity, c)});
                    if (i == 0) {
                        return str;
                    }
                }
                try {
                    if (c >= 4444444444000L) {
                        str = activity.getString(R.string.received_lifetime_service);
                        if (i == 0) {
                            return str;
                        }
                    }
                    str = activity.getString(R.string.extended_service_expiration, new Object[]{bm.c(activity, c)});
                    if (i == 0) {
                        return str;
                    }
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
            try {
                if (c >= 4444444444000L) {
                    str = str + z[11] + activity.getString(R.string.received_lifetime_service);
                    if (i == 0) {
                        return str;
                    }
                }
                return str + (z[13] + activity.getString(R.string.extended_service_expiration, new Object[]{bm.c(activity, c)}));
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } catch (NumberFormatException e222) {
            throw e222;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    private static void c(long j) {
        synchronized (z[25]) {
            try {
                c = j;
                Log.i(z[27] + new Date(j));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(App.p.getFilesDir(), z[26])));
                objectOutputStream.writeLong(j);
                objectOutputStream.close();
            } catch (Throwable e) {
                Log.c(e);
            } catch (Throwable th) {
            }
        }
    }

    static {
        String[] strArr = new String[38];
        String str = "\u007f!8w>p6\u0004l2n'";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 30;
                        break;
                    case ay.f /*1*/:
                        i4 = 66;
                        break;
                    case ay.n /*2*/:
                        i4 = 91;
                        break;
                    case ay.p /*3*/:
                        i4 = 24;
                        break;
                    default:
                        i4 = 75;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    str = "{:+q9\u007f62w%A&:l.";
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u007f!8w>p6tj.\u007f&t~*w.{";
                    i = 2;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "r#(l\u0014i#)v\"p%";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    str = "r#(l\u0014i#)v\"p%";
                    i2 = 5;
                    strArr2 = strArr3;
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    str = "m-=l<\u007f0>7.f22j*j+4vdx#2t.z\u001d(y={\u001d7y8j\u001d,y9p";
                    i2 = 6;
                    strArr2 = strArr3;
                    i = 5;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    strArr2 = strArr3;
                    str = "m-=l<\u007f0>7.f22j*j+4vdm7+h9{1(7y**";
                    i = 6;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "}-66<v#/k*n2\u0004h9{$>j.p!>k";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "m-=l<\u007f0>G.f22j*j+4v\u0014r#(l\u0014i#)v.z";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "m-=l<\u007f0>G.f22j*j+4v\u0014r#(l\u0014i#)v.z";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u0014H";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "I*:l8_2+X8053y?m#+hep'/";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "\u0014H";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "r#(l\u0014i#)v\"p%";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "r#(l\u0014i#)v\"p%";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "\u007f!8w>p6tt*m6\u0004o*l,\u0004l\"s'{";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "{:+q9\u007f62w%A&:l.";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "{:+q9\u007f62w%A&:l.";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\u0014H";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "^1uo#\u007f6(y;nl5}?";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "p-5}";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "{:+q9\u007f62w%A&:l.";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "r#(l\u0014i#)v\"p%";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "\u007f!8w>p6\u0004l2n'";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "{:+q9\u007f62w%A&:l.";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "{:+q9\u007f62w%A&:l.";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "\u007f!8w>p6t}3n+)y?w-58";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "{:+q9\u007f62w%A&:l.";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "p-/q-g\u0011>j=w!>]3j'5|.zbv8>m')8%q62~\"}#/q$p";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "\u007f!8w>p6t}3n+)y?w-57.f6>v/{&{w'z\u007f";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "{:+q9\u007f62w%A&:l.";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = ">,>ov";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "\u007f!8w>p6t}3n+)y?w-579q.7z*}){w'z\u007f";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = ">,>ov";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "\u007f!8w>p6tt*m6\u0004o*l,\u0004l\"s'{";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "{:+q9\u007f62w%A&:l.";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "\u007f!8w>p6tv$j+=afn#2|fx-)5(q,/y(j1tu.m1:\u007f.>";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    try {
                        b = new int[]{1, 2, 3, 5, 14};
                        switch (App.aa) {
                            case PBE.MD5 /*0*/:
                                h = new int[]{1, 2, 3, 5, 14, 30};
                                break;
                            case ay.f /*1*/:
                                h = new int[]{1, 2, 3, 7};
                                break;
                            default:
                                h = new int[]{1, 2, 3};
                                break;
                        }
                        e = -1;
                        a = new a3x(null);
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                default:
                    strArr2[i2] = str;
                    i2 = 1;
                    strArr2 = strArr3;
                    str = "{:+q9\u007f62w%A&:l.";
                    i = 0;
                    break;
            }
        }
    }

    public static void e() {
        synchronized (z[17]) {
            new File(App.p.getFilesDir(), z[18]).delete();
            c = 0;
        }
    }

    public static String a(long j, long j2, boolean z) {
        boolean z2 = true;
        boolean z3 = false;
        if (j == j2 || (j2 >= 4444444444000L && j >= 4444444444000L)) {
            return null;
        }
        String a;
        if (j2 < j) {
            a = a_3.a();
            if (z) {
                if (j2 >= 4444444444000L) {
                    z3 = true;
                }
                a(true, z3);
                return a;
            }
        } else if (j2 >= 4444444444000L) {
            return App.p.getString(R.string.extension_lifetime);
        } else {
            if (j <= System.currentTimeMillis()) {
                return a_3.c();
            }
            a = a_3.b();
            if (z) {
                if (j2 < 4444444444000L) {
                    z2 = false;
                }
                a(false, z2);
            }
        }
        return a;
    }

    private static void b(int i) {
        if (i != -1) {
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(App.p.getFilesDir(), z[0])));
                objectOutputStream.writeInt(i);
                objectOutputStream.close();
            } catch (Throwable e) {
                Log.c(e);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.whatsapp.atf r7, long r8, boolean r10, java.util.ArrayList r11) {
        /*
        r6 = com.whatsapp.App.az;
        r0 = z;
        r1 = 31;
        r0 = r0[r1];
        r2 = b(r0);
        c(r8);	 Catch:{ NumberFormatException -> 0x00ef }
        if (r10 != 0) goto L_0x00ee;
    L_0x0011:
        r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x0015;
    L_0x0015:
        r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r0 >= 0) goto L_0x007d;
    L_0x0019:
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x00f3 }
        r4 = 2592000000; // 0x9a7ec800 float:-5.2687528E-23 double:1.280618154E-314;
        r0 = r0 + r4;
        r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x007d;
    L_0x0027:
        r0 = 0;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 == 0) goto L_0x007d;
    L_0x002d:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00f7 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x00f7 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x00f7 }
        r4 = 30;
        r1 = r1[r4];	 Catch:{ NumberFormatException -> 0x00f7 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00f7 }
        r1 = new java.util.Date;	 Catch:{ NumberFormatException -> 0x00f7 }
        r1.<init>(r2);	 Catch:{ NumberFormatException -> 0x00f7 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00f7 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x00f7 }
        r4 = 32;
        r1 = r1[r4];	 Catch:{ NumberFormatException -> 0x00f7 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00f7 }
        r1 = new java.util.Date;	 Catch:{ NumberFormatException -> 0x00f7 }
        r1.<init>(r8);	 Catch:{ NumberFormatException -> 0x00f7 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00f7 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x00f7 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x00f7 }
        f = r8;	 Catch:{ NumberFormatException -> 0x00f7 }
        r0 = com.whatsapp.ChangeNumber.g();	 Catch:{ NumberFormatException -> 0x00f7 }
        if (r0 != 0) goto L_0x0078;
    L_0x0067:
        r1 = 0;
        r4 = 4444444444000; // 0x40acd884560 float:-2.85780992E8 double:2.1958473146304E-311;
        r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r0 < 0) goto L_0x00fb;
    L_0x0071:
        r0 = 1;
    L_0x0072:
        a(r1, r0);
        com.whatsapp.App.V();
    L_0x0078:
        r0 = 0;
        g = r0;	 Catch:{ NumberFormatException -> 0x00fe }
        if (r6 == 0) goto L_0x00c9;
    L_0x007d:
        r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x00c9;
    L_0x0081:
        f = r8;	 Catch:{ NumberFormatException -> 0x0102 }
        r0 = com.whatsapp.ChangeNumber.g();	 Catch:{ NumberFormatException -> 0x0102 }
        if (r0 != 0) goto L_0x0097;
    L_0x0089:
        r1 = 1;
        r4 = 4444444444000; // 0x40acd884560 float:-2.85780992E8 double:2.1958473146304E-311;
        r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r0 < 0) goto L_0x0106;
    L_0x0093:
        r0 = 1;
    L_0x0094:
        a(r1, r0);
    L_0x0097:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r4 = 33;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r1 = new java.util.Date;
        r1.<init>(r2);
        r0 = r0.append(r1);
        r1 = z;
        r4 = 34;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r1 = new java.util.Date;
        r1.<init>(r8);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x00c9:
        r0 = com.whatsapp.atf.GIFT_RECEIVED;	 Catch:{ NumberFormatException -> 0x0108 }
        if (r7 == r0) goto L_0x00d6;
    L_0x00cd:
        r0 = a;	 Catch:{ NumberFormatException -> 0x010a }
        r1 = r7;
        r4 = r8;
        r0.a(r1, r2, r4);	 Catch:{ NumberFormatException -> 0x010a }
        if (r6 == 0) goto L_0x00ee;
    L_0x00d6:
        if (r11 == 0) goto L_0x010e;
    L_0x00d8:
        r0 = 1;
    L_0x00d9:
        com.whatsapp.util.Log.b(r0);	 Catch:{ NumberFormatException -> 0x0110 }
        r0 = r11.size();	 Catch:{ NumberFormatException -> 0x0110 }
        if (r0 <= 0) goto L_0x0112;
    L_0x00e2:
        r0 = 1;
    L_0x00e3:
        com.whatsapp.util.Log.b(r0);
        r0 = a;
        r1 = r7;
        r4 = r8;
        r6 = r11;
        r0.a(r1, r2, r4, r6);
    L_0x00ee:
        return;
    L_0x00ef:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f1 }
    L_0x00f1:
        r0 = move-exception;
        throw r0;
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f5 }
    L_0x00f5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f7 }
    L_0x00f7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f9 }
    L_0x00f9:
        r0 = move-exception;
        throw r0;
    L_0x00fb:
        r0 = 0;
        goto L_0x0072;
    L_0x00fe:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0100 }
    L_0x0100:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0102 }
    L_0x0102:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0104 }
    L_0x0104:
        r0 = move-exception;
        throw r0;
    L_0x0106:
        r0 = 0;
        goto L_0x0094;
    L_0x0108:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x010a }
    L_0x010a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x010c }
    L_0x010c:
        r0 = move-exception;
        throw r0;
    L_0x010e:
        r0 = 0;
        goto L_0x00d9;
    L_0x0110:
        r0 = move-exception;
        throw r0;
    L_0x0112:
        r0 = 0;
        goto L_0x00e3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ac.a(com.whatsapp.atf, long, boolean, java.util.ArrayList):void");
    }

    public static String a(Activity activity, String str, String str2, boolean z) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str2);
        } catch (NumberFormatException e) {
            parseInt = 0;
        }
        int floor = (int) Math.floor((double) (((float) parseInt) / 365.0f));
        try {
            String a;
            if (!z[21].equals(str)) {
                Log.b(str.endsWith(z[20]));
                m8 a2 = App.P.a(str);
                if (a2 == null) {
                    try {
                        a = m3.a(str);
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
                a = a2.a((Context) activity);
                if (floor > 0) {
                    a = String.format(App.aX.a(R.plurals.account_info_received_n_years_of_service_from_friend, floor), new Object[]{a, Integer.valueOf(floor)});
                } else {
                    a = activity.getString(R.string.account_info_received_service_from_friend, new Object[]{a});
                }
            } else if (floor > 0) {
                a = String.format(App.aX.a(R.plurals.account_info_received_n_years_of_service_from_unknown, floor), new Object[]{Integer.valueOf(floor)});
            } else {
                a = activity.getString(R.string.account_info_received_service_from_unknown);
            }
            if (!z) {
                return a;
            }
            return a + (z[19] + activity.getString(R.string.extended_service_expiration, new Object[]{bm.c(activity, c)}));
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static String a(Activity activity, boolean z) {
        if (g) {
            String string = activity.getString(R.string.account_expired_alert, new Object[]{"+" + App.an.jabber_id, bm.c(activity, b(z[36]))});
            g = false;
            return string;
        }
        int a = a(z);
        if (a <= 0) {
            return a == 0 ? activity.getString(R.string.login_failure_expired) : null;
        } else {
            return String.format(App.aX.a(R.plurals.service_expire_days, a), new Object[]{Integer.valueOf(a)});
        }
    }

    public static Dialog a(Activity activity) {
        return new Builder(activity).setTitle(R.string.software_about_to_expire_title).setMessage(String.format(App.aX.a(R.plurals.software_about_to_expire, App.aC), new Object[]{Integer.valueOf(App.aC)})).setPositiveButton(R.string.upgrade, new c3(activity)).setNegativeButton(R.string.cancel, new alx(activity)).create();
    }

    static long b(String str) {
        IOException e;
        Throwable th;
        long j = 0;
        synchronized (str) {
            File file = new File(App.p.getFilesDir(), str);
            if (file.exists()) {
                ObjectInputStream objectInputStream = null;
                try {
                    ObjectInputStream objectInputStream2;
                    if (z[2].equals(str)) {
                        if (c != 0) {
                            j = c;
                            if (objectInputStream != null) {
                                try {
                                    objectInputStream.close();
                                } catch (NumberFormatException e2) {
                                    throw e2;
                                } catch (IOException e3) {
                                }
                            }
                        } else {
                            objectInputStream2 = new ObjectInputStream(new FileInputStream(file));
                            try {
                                c = objectInputStream2.readLong();
                                objectInputStream2.close();
                                j = c;
                                if (objectInputStream2 != null) {
                                    try {
                                        objectInputStream2.close();
                                    } catch (NumberFormatException e22) {
                                        throw e22;
                                    } catch (IOException e4) {
                                    }
                                }
                            } catch (IOException e5) {
                                e = e5;
                                objectInputStream = objectInputStream2;
                                try {
                                    Log.e(z[3] + e.toString());
                                    if (objectInputStream != null) {
                                        try {
                                            objectInputStream.close();
                                        } catch (IOException e6) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (objectInputStream != null) {
                                        try {
                                            objectInputStream.close();
                                        } catch (NumberFormatException e7) {
                                            throw e7;
                                        } catch (IOException e8) {
                                        }
                                    }
                                    throw th;
                                }
                                return j;
                            } catch (Throwable th3) {
                                th = th3;
                                objectInputStream = objectInputStream2;
                                if (objectInputStream != null) {
                                    objectInputStream.close();
                                }
                                throw th;
                            }
                        }
                    } else if (d != 0) {
                        j = d;
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (NumberFormatException e222) {
                                throw e222;
                            } catch (IOException e9) {
                            }
                        }
                    } else {
                        objectInputStream2 = new ObjectInputStream(new FileInputStream(file));
                        try {
                            d = objectInputStream2.readLong();
                            objectInputStream2.close();
                            j = d;
                            if (objectInputStream2 != null) {
                                try {
                                    objectInputStream2.close();
                                } catch (NumberFormatException e2222) {
                                    throw e2222;
                                } catch (IOException e10) {
                                }
                            }
                        } catch (IOException e11) {
                            e = e11;
                            objectInputStream = objectInputStream2;
                            Log.e(z[3] + e.toString());
                            if (objectInputStream != null) {
                                objectInputStream.close();
                            }
                            return j;
                        } catch (Throwable th4) {
                            th = th4;
                            objectInputStream = objectInputStream2;
                            if (objectInputStream != null) {
                                objectInputStream.close();
                            }
                            throw th;
                        }
                    }
                } catch (IOException e12) {
                    throw e12;
                } catch (IOException e13) {
                    e12 = e13;
                }
            }
        }
        return j;
    }

    public static long a() {
        return b(z[1]);
    }

    public static String a(Context context, String[] strArr, String str) {
        int i = App.az;
        try {
            boolean z;
            int parseInt;
            if (strArr.length > 0) {
                z = true;
            } else {
                z = false;
            }
            Log.b(z);
            try {
                parseInt = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                parseInt = 0;
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            int i2 = 0;
            while (i2 < strArr.length) {
                Object a;
                m8 a2 = App.P.a(strArr[i2]);
                if (a2 == null) {
                    try {
                        a = m3.a(strArr[i2]);
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
                a = a2.a(context);
                arrayList.add(a);
                i2++;
                if (i != 0) {
                    break;
                }
            }
            String a3 = bd.a(arrayList);
            parseInt = (int) Math.floor(((double) parseInt) / 365.0d);
            if (parseInt > 0) {
                return String.format(App.aX.a(R.plurals.account_info_gave_n_years_of_service, parseInt), new Object[]{Integer.valueOf(parseInt), a3});
            }
            return context.getString(R.string.account_info_gave_service, new Object[]{a3});
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    private static void a(String str) {
        Log.i(z[37] + str);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(App.p);
        builder.setSmallIcon(R.drawable.notifybar);
        builder.setTicker(App.p.getString(R.string.pay_for_a_friend_notification_ticker));
        builder.setContentTitle(App.p.getString(R.string.pay_for_a_friend_notification_ticker));
        builder.setContentText(str);
        builder.setContentIntent(PendingIntent.getActivity(App.p, 0, new Intent(App.p, Main.b()), 268435456));
        builder.setDefaults(3);
        Notification build = builder.build();
        build.flags |= 16;
        NotificationManagerCompat.from(App.p).notify(5, build);
    }

    public static void a(ArrayList arrayList) {
        String str;
        int i = App.az;
        Iterator it = arrayList.iterator();
        String str2 = "";
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            str = str2 + a(App.p, (String[]) pair.first, (String) pair.second) + " ";
            if (i != 0) {
                break;
            }
            str2 = str;
        }
        str = str2;
        a(str);
    }

    static int b() {
        ObjectInputStream objectInputStream;
        Throwable e;
        File file = new File(App.p.getFilesDir(), z[24]);
        if (file.exists()) {
            ObjectInputStream objectInputStream2 = null;
            try {
                objectInputStream = new ObjectInputStream(new FileInputStream(file));
                try {
                    int readInt = objectInputStream.readInt();
                    objectInputStream.close();
                    if (objectInputStream == null) {
                        return readInt;
                    }
                    try {
                        objectInputStream.close();
                        return readInt;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    } catch (IOException e3) {
                        return readInt;
                    }
                } catch (IOException e4) {
                    e = e4;
                    try {
                        Log.c(e);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e5) {
                            }
                        }
                    } catch (Throwable th) {
                        e = th;
                        objectInputStream2 = objectInputStream;
                        if (objectInputStream2 != null) {
                            try {
                                objectInputStream2.close();
                            } catch (NumberFormatException e22) {
                                throw e22;
                            } catch (IOException e6) {
                            }
                        }
                        throw e;
                    }
                    return -1;
                }
            } catch (IOException e7) {
                e = e7;
                objectInputStream = null;
                Log.c(e);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                return -1;
            } catch (Throwable th2) {
                e = th2;
                if (objectInputStream2 != null) {
                    objectInputStream2.close();
                }
                throw e;
            }
        }
        return -1;
    }

    public static void c(int i) {
        e = i;
    }

    public static boolean c() {
        long b = b(z[28]);
        if (b != 0) {
            try {
                if (b < System.currentTimeMillis()) {
                    return true;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return false;
    }

    public static void a(a3a com_whatsapp_a3a) {
        a.registerObserver(com_whatsapp_a3a);
    }

    public static void a(atf com_whatsapp_atf, long j) {
        a(com_whatsapp_atf, j, false);
    }
}
