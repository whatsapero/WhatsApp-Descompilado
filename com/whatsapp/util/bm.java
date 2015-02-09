package com.whatsapp.util;

import android.content.Context;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.actionbarsherlock.R;
import com.whatsapp.App;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class bm {
    private static final String[] z;

    static {
        String[] strArr = new String[9];
        String str = "f\u0014";
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
                        i3 = 3;
                        break;
                    case ay.f /*1*/:
                        i3 = 103;
                        break;
                    case ay.n /*2*/:
                        i3 = 126;
                        break;
                    case ay.p /*3*/:
                        i3 = 86;
                        break;
                    default:
                        i3 = 107;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "/G";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "/G";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "/G";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "/G";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "f\u0014";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "#\u0006^:\n#";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "#\u0006^:\npG";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "z\u001e\u0007/&N\u0003\u001a";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static CharSequence a(Context context, long j, boolean z) {
        int b = b(System.currentTimeMillis(), j);
        if (z) {
            return context.getString(R.string.web_session_active);
        }
        if (b == 0) {
            return context.getString(R.string.web_session_last_today_at, new Object[]{DateUtils.formatDateTime(context, j, 1)});
        } else if (b == 1) {
            return context.getString(R.string.web_session_last_yesterday_at, new Object[]{DateUtils.formatDateTime(context, j, 1)});
        } else {
            return context.getString(R.string.web_session_last_date, new Object[]{DateUtils.getRelativeDateTimeString(context, j, 86400000, 86400000, 0)});
        }
    }

    public static int b(long j, long j2) {
        Time time = new Time();
        time.set(j);
        int i = (int) (((time.gmtoff * 1000) + j) / 86400000);
        time.set(j2);
        return i - ((int) (((time.gmtoff * 1000) + j2) / 86400000));
    }

    public static String a() {
        return new SimpleDateFormat(z[1], Locale.US).format(new Date());
    }

    public static String b(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 20);
    }

    public static String k(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 131093);
    }

    public static String c(Context context, long j) {
        return SimpleDateFormat.getDateInstance().format(new Date(j));
    }

    public static boolean a(long j) {
        return b(System.currentTimeMillis(), j) == 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String d(android.content.Context r3, long r4) {
        /*
        r0 = java.lang.System.currentTimeMillis();
        r1 = b(r0, r4);
        r0 = 524289; // 0x80001 float:7.34685E-40 double:2.59033E-318;
        if (r1 <= 0) goto L_0x0019;
    L_0x000d:
        r2 = 7;
        if (r1 >= r2) goto L_0x0017;
    L_0x0010:
        r0 = 524291; // 0x80003 float:7.34688E-40 double:2.59034E-318;
        r1 = com.whatsapp.util.Log.e;
        if (r1 == 0) goto L_0x0019;
    L_0x0017:
        r0 = r0 | 16;
    L_0x0019:
        r0 = android.text.format.DateUtils.formatDateTime(r3, r4, r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bm.d(android.content.Context, long):java.lang.String");
    }

    public static String l(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 524305);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String f(android.content.Context r7, long r8) {
        /*
        r6 = 0;
        r5 = 1;
        r1 = com.whatsapp.util.Log.e;
        r2 = java.lang.System.currentTimeMillis();
        r2 = b(r2, r8);
        if (r2 != 0) goto L_0x001f;
    L_0x000e:
        r0 = 2131625024; // 0x7f0e0440 float:1.8877244E38 double:1.053162694E-314;
        r3 = new java.lang.Object[r5];
        r4 = i(r7, r8);
        r3[r6] = r4;
        r0 = r7.getString(r0, r3);
        if (r1 == 0) goto L_0x0040;
    L_0x001f:
        if (r2 != r5) goto L_0x0032;
    L_0x0021:
        r0 = 2131625134; // 0x7f0e04ae float:1.8877467E38 double:1.0531627485E-314;
        r3 = new java.lang.Object[r5];
        r4 = i(r7, r8);
        r3[r6] = r4;
        r0 = r7.getString(r0, r3);
        if (r1 == 0) goto L_0x0040;
    L_0x0032:
        r0 = 30;
        if (r2 > r0) goto L_0x003c;
    L_0x0036:
        r0 = k(r7, r8);
        if (r1 == 0) goto L_0x0040;
    L_0x003c:
        r0 = j(r7, r8);
    L_0x0040:
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r2 = java.util.Locale.getDefault();
        r2 = r2.getLanguage();
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0057;
    L_0x0053:
        r0 = a(r0, r8);
    L_0x0057:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bm.f(android.content.Context, long):java.lang.String");
    }

    public static boolean a(long j, long j2) {
        Calendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        Calendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(j2);
        return gregorianCalendar.get(1) == gregorianCalendar2.get(1) && gregorianCalendar.get(2) == gregorianCalendar2.get(2) && gregorianCalendar.get(5) == gregorianCalendar2.get(5);
    }

    public static CharSequence a(Context context, long j) {
        int b = b(System.currentTimeMillis(), j);
        if (b != 0) {
            return b == 1 ? context.getString(R.string.yesterday) + z[3] + DateUtils.formatDateTime(context, j, 1) : DateUtils.getRelativeDateTimeString(context, j, 86400000, 86400000, 0);
        } else {
            b = (int) ((System.currentTimeMillis() - j) / 60000);
            if (b < 1) {
                return context.getString(R.string.just_now) + z[2] + DateUtils.formatDateTime(context, j, 1);
            }
            if (b >= 60) {
                return context.getString(R.string.today) + z[5] + DateUtils.formatDateTime(context, j, 1);
            }
            return String.format(App.aX.a(R.plurals.minutes_ago, b), new Object[]{Integer.valueOf(b)}) + z[4] + DateUtils.formatDateTime(context, j, 1);
        }
    }

    public static String j(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 131092);
    }

    public static String i(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 9);
    }

    public static String g(Context context, long j) {
        long j2 = j / 3600000;
        long j3 = (j - (3600000 * j2)) / 60000;
        if (j2 == 0) {
            if (j3 == 0) {
                j3 = 1;
            }
            return String.format(App.aX.a(R.plurals.minutes, (int) j3), new Object[]{Integer.valueOf((int) j3)});
        } else if (j3 == 0) {
            return String.format(App.aX.a(R.plurals.hours, (int) j2), new Object[]{Integer.valueOf((int) j2)});
        } else {
            String format = String.format(App.aX.a(R.plurals.minutes, (int) j3), new Object[]{Integer.valueOf((int) j3)});
            String a = App.aX.a(R.plurals.hours, (int) j2);
            Object[] objArr = new Object[]{Integer.valueOf((int) j2)};
            return context.getString(R.string.hours_minutes, new Object[]{String.format(a, objArr), format});
        }
    }

    public static String h(Context context, long j) {
        int b = b(System.currentTimeMillis(), j);
        if (b == 0) {
            return i(context, j);
        }
        return b == 1 ? context.getString(R.string.yesterday) : j(context, j);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(android.content.Context r7, long r8) {
        /*
        r6 = 1;
        r5 = 0;
        r1 = com.whatsapp.util.Log.e;
        r2 = java.lang.System.currentTimeMillis();
        r2 = b(r2, r8);
        if (r2 != 0) goto L_0x001f;
    L_0x000e:
        r0 = 2131625024; // 0x7f0e0440 float:1.8877244E38 double:1.053162694E-314;
        r3 = new java.lang.Object[r6];
        r4 = i(r7, r8);
        r3[r5] = r4;
        r0 = r7.getString(r0, r3);
        if (r1 == 0) goto L_0x0036;
    L_0x001f:
        if (r2 != r6) goto L_0x0032;
    L_0x0021:
        r0 = 2131625134; // 0x7f0e04ae float:1.8877467E38 double:1.0531627485E-314;
        r2 = new java.lang.Object[r6];
        r3 = i(r7, r8);
        r2[r5] = r3;
        r0 = r7.getString(r0, r2);
        if (r1 == 0) goto L_0x0036;
    L_0x0032:
        r0 = k(r7, r8);
    L_0x0036:
        r1 = z;
        r1 = r1[r5];
        r2 = java.util.Locale.getDefault();
        r2 = r2.getLanguage();
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x004c;
    L_0x0048:
        r0 = a(r0, r8);
    L_0x004c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bm.e(android.content.Context, long):java.lang.String");
    }

    private static String a(String str, long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return instance.get(10) == 1 ? str.replace(z[8], z[7]) : str;
    }

    public static String m(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 524289);
    }
}
