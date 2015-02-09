package com.whatsapp.c2dm;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import java.util.Random;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class C2DMRegistrar extends IntentService {
    private static final String a;
    private static final String b;
    public static int c;
    private static final String[] z;
    private final Random d;
    private final a e;

    public static boolean b(Context context) {
        return new a(context).e();
    }

    public static void a(Context context) {
        Log.i(z[25]);
        Intent intent = new Intent(z[28]);
        intent.putExtra(z[27], z[26]);
        a(context, intent);
    }

    public C2DMRegistrar() {
        super(b);
        this.d = new Random();
        this.e = new a(this);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        if (intent != null) {
            try {
            } catch (SecurityException e) {
                throw e;
            }
            if (z[21].equals(intent.getAction())) {
                z = true;
                setIntentRedelivery(z);
                return super.onStartCommand(intent, i, i2);
            }
        }
        z = false;
        setIntentRedelivery(z);
        return super.onStartCommand(intent, i, i2);
    }

    private void c(String str) {
        int b = this.e.b();
        try {
            Log.a(z[23], null, new Object[]{str, Integer.valueOf(b)});
            this.e.i();
            if (this.e.c() == null) {
                Log.i(z[22]);
                App.c((Context) this, 0);
            }
            try {
                this.e.a(str);
                if (b > 0) {
                    this.e.a(b);
                }
                a(str);
            } catch (SecurityException e) {
                throw e;
            }
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r11) {
        /*
        r10_this = this;
        r5 = 1;
        r3 = 0;
        r0 = c;
        if (r11 != 0) goto L_0x0010;
    L_0x0006:
        r1 = z;	 Catch:{ SecurityException -> 0x00c8 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x00c8 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ SecurityException -> 0x00c8 }
        if (r0 == 0) goto L_0x00c7;
    L_0x0010:
        r1 = z;	 Catch:{ SecurityException -> 0x00c8 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x00c8 }
        r2 = r11.getAction();	 Catch:{ SecurityException -> 0x00c8 }
        r1 = r1.equals(r2);	 Catch:{ SecurityException -> 0x00c8 }
        if (r1 == 0) goto L_0x0060;
    L_0x001f:
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r1 = r11.getStringExtra(r1);
        r2 = z;
        r2 = r2[r3];
        r2 = r11.getStringExtra(r2);
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r3 = r11.getStringExtra(r3);
        if (r1 == 0) goto L_0x0041;
    L_0x003c:
        r10.b(r1);	 Catch:{ SecurityException -> 0x00ca }
        if (r0 == 0) goto L_0x005e;
    L_0x0041:
        if (r2 == 0) goto L_0x0048;
    L_0x0043:
        r10.b();	 Catch:{ SecurityException -> 0x00ce }
        if (r0 == 0) goto L_0x005e;
    L_0x0048:
        if (r3 == 0) goto L_0x004f;
    L_0x004a:
        r10.c(r3);	 Catch:{ SecurityException -> 0x00d2 }
        if (r0 == 0) goto L_0x005e;
    L_0x004f:
        r1 = z;	 Catch:{ SecurityException -> 0x00d2 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x00d2 }
        r2 = 0;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ SecurityException -> 0x00d2 }
        r4 = 0;
        r3[r4] = r11;	 Catch:{ SecurityException -> 0x00d2 }
        com.whatsapp.util.Log.c(r1, r2, r3);	 Catch:{ SecurityException -> 0x00d2 }
    L_0x005e:
        if (r0 == 0) goto L_0x00c7;
    L_0x0060:
        r1 = a;	 Catch:{ SecurityException -> 0x00d4 }
        r2 = r11.getAction();	 Catch:{ SecurityException -> 0x00d4 }
        r1 = r1.equals(r2);	 Catch:{ SecurityException -> 0x00d4 }
        if (r1 == 0) goto L_0x00b8;
    L_0x006c:
        r1 = z;
        r1 = r1[r5];
        r1 = r11.getStringExtra(r1);
        r2 = r10.e;
        r2 = r2.c();
        r3 = r10.e;
        r3 = r3.b();
        r4 = r10.e;
        r4 = r4.f();
        r5 = z;	 Catch:{ SecurityException -> 0x00d6 }
        r6 = 4;
        r5 = r5[r6];	 Catch:{ SecurityException -> 0x00d6 }
        r6 = 0;
        r7 = 4;
        r7 = new java.lang.Object[r7];	 Catch:{ SecurityException -> 0x00d6 }
        r8 = 0;
        r7[r8] = r2;	 Catch:{ SecurityException -> 0x00d6 }
        r8 = 1;
        r7[r8] = r1;	 Catch:{ SecurityException -> 0x00d6 }
        r8 = 2;
        r9 = java.lang.Integer.valueOf(r3);	 Catch:{ SecurityException -> 0x00d6 }
        r7[r8] = r9;	 Catch:{ SecurityException -> 0x00d6 }
        r8 = 3;
        r9 = java.lang.Integer.valueOf(r4);	 Catch:{ SecurityException -> 0x00d6 }
        r7[r8] = r9;	 Catch:{ SecurityException -> 0x00d6 }
        com.whatsapp.util.Log.a(r5, r6, r7);	 Catch:{ SecurityException -> 0x00d6 }
        if (r2 == 0) goto L_0x00b2;
    L_0x00a8:
        if (r1 == 0) goto L_0x00b2;
    L_0x00aa:
        r1 = r1.equals(r2);	 Catch:{ SecurityException -> 0x00da }
        if (r1 == 0) goto L_0x00b2;
    L_0x00b0:
        if (r3 == r4) goto L_0x00b6;
    L_0x00b2:
        r1 = 0;
        r10.a(r1);	 Catch:{ SecurityException -> 0x00dc }
    L_0x00b6:
        if (r0 == 0) goto L_0x00c7;
    L_0x00b8:
        r0 = z;	 Catch:{ SecurityException -> 0x00de }
        r1 = 7;
        r0 = r0[r1];	 Catch:{ SecurityException -> 0x00de }
        r1 = 0;
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ SecurityException -> 0x00de }
        r3 = 0;
        r2[r3] = r11;	 Catch:{ SecurityException -> 0x00de }
        com.whatsapp.util.Log.c(r0, r1, r2);	 Catch:{ SecurityException -> 0x00de }
    L_0x00c7:
        return;
    L_0x00c8:
        r0 = move-exception;
        throw r0;
    L_0x00ca:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x00cc }
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x00ce }
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x00d2 }
    L_0x00d2:
        r0 = move-exception;
        throw r0;
    L_0x00d4:
        r0 = move-exception;
        throw r0;
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x00da }
    L_0x00da:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x00dc }
    L_0x00dc:
        r0 = move-exception;
        throw r0;
    L_0x00de:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.c2dm.C2DMRegistrar.onHandleIntent(android.content.Intent):void");
    }

    private void a(String str) {
        App.a(str, z[29]);
    }

    static {
        String[] strArr = new String[33];
        String str = "Fw\u000f9\u0018Gz";
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
                        i3 = 52;
                        break;
                    case ay.f /*1*/:
                        i3 = 18;
                        break;
                    case ay.n /*2*/:
                        i3 = 105;
                        break;
                    case ay.p /*3*/:
                        i3 = 75;
                        break;
                    default:
                        i3 = 125;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "W}\u0004e\u001a[}\u000e'\u0018\u001as\u0007/\u000f[{\re\u001e\u0006v\u0004e\u0014Zf\f%\t\u001a@,\f4gF;\n)}]'";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "sQ$d\u0012ZZ\b%\u0019Xw %\tQ|\u001dk\u0014Zf\f%\t\t:\u0007>\u0011X;I";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "sQ$d\u000fQu\u00008\tFs\u001d\"\u0012Z=\u001a?\u001cFfI8\u001cBw\rvXG2\u001a.\u000fBw\u001bvXG2\b;\rbw\u001b8\u0014[|Tn\u0019\u0014a\b=\u0018PS\u0019;+Q`\u001a\"\u0012Z/L/";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "sQ$d\u000fQu\u00008\tFs\u001d\"\u0012Z=\u001c%\u0016Z}\u001e%4Zf\f%\t\u000e2L8";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Fw\u000e\"\u000e@`\b?\u0014[|6\"\u0019";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "sQ$d\u0012ZZ\b%\u0019Xw %\tQ|\u001dd\u001f[u\u001c8G\u00147\u001a";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "Q`\u001b$\u000f";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0006+ZrH\u0001&]zE\u0007&";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "sQ$d\u000fQu\u00008\tFs\u001d\"\u0012Z=\u001a.\u001eA`\u0000?\u0004qj\n.\r@{\u0006%";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "U~\b9\u0010";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "W}\u0004e\u001a[}\u000e'\u0018\u001as\u0007/\u000f[{\re\u001e\u0006v\u0004e\u0014Zf\f%\t\u001a@,\f4gF,\u0019";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "W}\u0004e\u001a[}\u000e'\u0018\u001as\u0007/\u000f[{\re\u001aYa";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "Gw\u0007/\u0018F";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "sQ$d\u000fQu\u00008\tFs\u001d\"\u0012Z=\u001b.\fAw\u001a?";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "Ub\u0019";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "sQ$d\u000fQc\u001c.\u000e@`\f,\u0014Gf\u001b*\t]}\u0007";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    str = "sQ$d\u000fQu\u00008\tFs\u001d\"\u0012Z=\u001e*\u0014@{\u0007,";
                    obj = 17;
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    strArr2 = strArr3;
                    str = "sQ$d\u000fQu\u00008\tFs\u001d\"\u0012Z=\u000b*\u001e_}\u000f-]\u0011v\u00048";
                    obj = 18;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "Fw\u000e\"\u000e@`\b?\u0014[|6\"\u0019";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "W}\u0004e\u001a[}\u000e'\u0018\u001as\u0007/\u000f[{\re\u001e\u0006v\u0004e\u0014Zf\f%\t\u001a@,\f4gF;\n)}]'";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "sQ$d\u000fQu\u00008\tQ`\f/RZw\u001e";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "sQ$d\u000fQu\u00008\tQ`\f/R\u0011aI*\rDD\f9\u000e]}\u0007vXP";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "sQ$d\u000fQt\u001b.\u000e\\";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "sQ$d\u000fQu\u00008\tFs\u001d\"\u0012Z=\u001b.\u001bFw\u001a#";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "Fw\u000f9\u0018Gz";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "Fw\u000f9\u0018Gz";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "W}\u0004e\u001a[}\u000e'\u0018\u001as\u0007/\u000f[{\re\u001e\u0006v\u0004e\u0014Zf\f%\t\u001a@,\f4gF;\n)}]'";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "Sq\u0004";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "sQ$d\u000fQu\u00008\tFs\u001d\"\u0012Z=\f9\u000f[`Fn\u000e";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "gW;\u001d4wW6\u00052`M(\u001d<}^(\t1q";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "sQ$d\u000fQu\u00008\tFs\u001d\"\u0012Z=\f9\u000f[`Fn\u000e";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = C2DMRegistrar.class.getCanonicalName();
                    StringBuilder append = new StringBuilder().append(b);
                    char[] toCharArray2 = "\u001aA=\n/`".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i4 = 0; length2 > i4; i4++) {
                        int i5;
                        char c2 = cArr2[i4];
                        switch (i4 % 5) {
                            case PBE.MD5 /*0*/:
                                i5 = 52;
                                break;
                            case ay.f /*1*/:
                                i5 = 18;
                                break;
                            case ay.n /*2*/:
                                i5 = 105;
                                break;
                            case ay.p /*3*/:
                                i5 = 75;
                                break;
                            default:
                                i5 = 125;
                                break;
                        }
                        cArr2[i4] = (char) (i5 ^ c2);
                    }
                    a = append.append(new String(cArr2).intern()).toString();
                default:
                    strArr2[i] = str;
                    str = "Fw\u000e\"\u000e@`\b?\u0014[|6\"\u0019";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent(a);
        if (str != null) {
            try {
                intent.putExtra(z[20], str);
            } catch (SecurityException e) {
                throw e;
            }
        }
        a(context, intent);
    }

    private void b(String str) {
        try {
            if (str.equals(z[31])) {
                Log.a(z[32], null, new Object[]{str});
                this.e.j();
                a(true);
                try {
                    if (c == 0) {
                        return;
                    }
                }
            }
            Log.c(z[30], null, new Object[]{str});
            this.e.a();
            this.e.h();
        } catch (SecurityException e) {
            throw e;
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    private long a() {
        int g = this.e.g();
        if (g == 0) {
            return 0;
        }
        return (long) (((double) ((1 << Math.min(g - 1, 10)) * 15000)) * (this.d.nextDouble() + 0.5d));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r11) {
        /*
        r10_this = this;
        r9 = 19;
        r8 = 0;
        r1 = c;
        r0 = z;
        r2 = 17;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = new android.content.Intent;
        r2 = z;
        r3 = 12;
        r2 = r2[r3];
        r0.<init>(r2);
        r2 = z;
        r3 = 13;
        r2 = r2[r3];
        r0 = r0.setPackage(r2);
        r2 = z;
        r3 = 16;
        r2 = r2[r3];
        r3 = new android.content.Intent;
        r3.<init>();
        r3 = android.app.PendingIntent.getBroadcast(r10, r8, r3, r8);
        r0 = r0.putExtra(r2, r3);
        r2 = z;
        r3 = 14;
        r2 = r2[r3];
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r2 = r0.putExtra(r2, r3);
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r0 = android.app.PendingIntent.getService(r10, r8, r2, r0);
        if (r11 != 0) goto L_0x005c;
    L_0x004e:
        if (r0 == 0) goto L_0x005c;
    L_0x0050:
        r0 = z;	 Catch:{ SecurityException -> 0x005a }
        r1 = 18;
        r0 = r0[r1];	 Catch:{ SecurityException -> 0x005a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SecurityException -> 0x005a }
    L_0x0059:
        return;
    L_0x005a:
        r0 = move-exception;
        throw r0;
    L_0x005c:
        r4 = r10.a();
        r6 = 0;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x00a1;
    L_0x0066:
        r0 = z;
        r0 = r0[r9];
        r3 = 0;
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = java.lang.Long.valueOf(r4);
        r6[r8] = r7;
        com.whatsapp.util.Log.a(r0, r3, r6);
        r3 = android.app.PendingIntent.getService(r10, r8, r2, r8);
        r0 = z;
        r6 = 11;
        r0 = r0[r6];
        r0 = r10.getSystemService(r0);
        r0 = (android.app.AlarmManager) r0;
        r6 = android.os.Build.VERSION.SDK_INT;	 Catch:{ SecurityException -> 0x00b9 }
        if (r6 < r9) goto L_0x0096;
    L_0x008b:
        r6 = 3;
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SecurityException -> 0x00b9 }
        r8 = r8 + r4;
        r0.setExact(r6, r8, r3);	 Catch:{ SecurityException -> 0x00b9 }
        if (r1 == 0) goto L_0x009f;
    L_0x0096:
        r6 = 3;
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SecurityException -> 0x00bb }
        r4 = r4 + r8;
        r0.set(r6, r4, r3);	 Catch:{ SecurityException -> 0x00bb }
    L_0x009f:
        if (r1 == 0) goto L_0x0059;
    L_0x00a1:
        r0 = z;
        r1 = 15;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r10.startService(r2);	 Catch:{ SecurityException -> 0x00ae }
        goto L_0x0059;
    L_0x00ae:
        r0 = move-exception;
        r0 = z;
        r1 = 10;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        goto L_0x0059;
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.c2dm.C2DMRegistrar.a(boolean):void");
    }

    static void a(Context context, Intent intent) {
        intent.setClassName(context, b);
        context.startService(intent);
    }

    private void b() {
        Log.i(z[24]);
        a(false);
    }
}
