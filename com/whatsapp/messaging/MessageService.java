package com.whatsapp.messaging;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.Voip;
import com.whatsapp.ak4;
import com.whatsapp.protocol.c3;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class MessageService extends Service {
    private static final String[] G;
    private static final String c;
    private static final String i;
    private static final String m;
    private static final AtomicBoolean p;
    private static CountDownLatch w;
    private k A;
    private Handler B;
    private final BroadcastReceiver C;
    private int D;
    private ak E;
    private String F;
    private boolean a;
    private boolean b;
    private bt d;
    private Messenger e;
    private boolean f;
    private boolean g;
    private final BroadcastReceiver h;
    private boolean j;
    private final Handler k;
    private final c l;
    private final Messenger n;
    private HandlerThread o;
    private boolean q;
    private boolean r;
    private final BroadcastReceiver s;
    private long t;
    private k u;
    private final b_ v;
    private byte[] x;
    private long y;
    private k z;

    static void a(MessageService messageService, Message message) {
        messageService.a(message);
    }

    static boolean j(MessageService messageService) {
        return messageService.b;
    }

    private void j() {
        this.u.a(!App.f((Context) this));
    }

    static void g(MessageService messageService) {
        messageService.r();
    }

    static void c(MessageService messageService) {
        messageService.e();
    }

    private void l() {
        Log.i(G[9]);
        AlarmManager alarmManager = (AlarmManager) getSystemService(G[8]);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(c), 0);
        alarmManager.cancel(broadcast);
        alarmManager.setInexactRepeating(2, SystemClock.elapsedRealtime() + 15000, 240000, broadcast);
    }

    static void e(MessageService messageService) {
        messageService.s();
    }

    public static void a(Context context, boolean z) {
        a(context, z, false, false, null, null);
    }

    static String v() {
        return i;
    }

    private void y() {
        Log.i(G[53]);
        this.t = 10000;
        this.y = 20000;
    }

    private void u() {
        if (!this.g) {
            Log.i(G[49]);
            c(true);
            this.E = new ak(this, this.n);
            this.E.start();
        }
    }

    private void r() {
        Log.i(G[5]);
        if (this.a) {
            AlarmManager alarmManager = (AlarmManager) getSystemService(G[4]);
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(m), 0);
            alarmManager.cancel(broadcast);
            if (VERSION.SDK_INT >= 19) {
                alarmManager.setExact(2, SystemClock.elapsedRealtime() + 600000, broadcast);
                if (!au.a) {
                    return;
                }
            }
            alarmManager.set(2, SystemClock.elapsedRealtime() + 600000, broadcast);
        }
    }

    private void f() {
        Log.i(G[23]);
        if (!this.a) {
            registerReceiver(this.s, new IntentFilter(m));
            this.a = true;
        }
        AlarmManager alarmManager = (AlarmManager) getSystemService(G[22]);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(m), 0);
        alarmManager.cancel(broadcast);
        if (VERSION.SDK_INT >= 19) {
            alarmManager.setExact(2, SystemClock.elapsedRealtime() + 600000, broadcast);
            if (!au.a) {
                return;
            }
        }
        alarmManager.set(2, SystemClock.elapsedRealtime() + 600000, broadcast);
    }

    private void q() {
        try {
            Log.i(G[51]);
            if (this.g) {
                try {
                    c(false);
                    if (!this.A.a()) {
                        this.d.f();
                    }
                    this.A.a(true);
                    try {
                        if (this.b) {
                            unregisterReceiver(this.C);
                            this.o.quit();
                            try {
                                this.o.join();
                            } catch (InterruptedException e) {
                                Log.w(G[52]);
                                Thread.currentThread().interrupt();
                            }
                            this.o = null;
                            this.B = null;
                            w = new CountDownLatch(1);
                            p.set(false);
                            ba.d(this.e);
                            this.b = false;
                            if (!au.a) {
                                return;
                            }
                        }
                        this.E.quit();
                    } catch (InterruptedException e2) {
                        throw e2;
                    }
                } catch (InterruptedException e22) {
                    throw e22;
                }
            }
        } catch (InterruptedException e222) {
            throw e222;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(G[50]);
        if (this.g) {
            q();
        }
    }

    public static void a(Context context) {
        context.startService(new Intent(context, MessageService.class).setAction(G[33]));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r13_this = this;
        r12 = 2;
        r11 = 1;
        r10 = 0;
        r1 = com.whatsapp.messaging.au.a;
        r0 = r13.r;
        if (r0 != 0) goto L_0x007d;
    L_0x0009:
        r2 = android.os.SystemClock.elapsedRealtime();
        r4 = r13.i();
        r6 = 2;
        r6 = r4 / r6;
        r6 = r6 + r4;
        r0 = new java.util.Random;
        r0.<init>();
        r8 = r0.nextLong();
        r4 = r8 % r4;
        r4 = r6 - r4;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r6 = G;
        r7 = 12;
        r6 = r6[r7];
        r0 = r0.append(r6);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = new android.content.Intent;
        r6 = com.whatsapp.messaging.MessageService.class;
        r0.<init>(r13, r6);
        r6 = G;
        r7 = 15;
        r6 = r6[r7];
        r0 = r0.setAction(r6);
        r6 = G;
        r7 = 13;
        r6 = r6[r7];
        r6 = r0.putExtra(r6, r11);
        r0 = G;
        r7 = 11;
        r0 = r0[r7];
        r0 = r13.getSystemService(r0);
        r0 = (android.app.AlarmManager) r0;
        r6 = android.app.PendingIntent.getService(r13, r10, r6, r10);
        r7 = android.os.Build.VERSION.SDK_INT;
        r8 = 19;
        if (r7 < r8) goto L_0x0075;
    L_0x006e:
        r8 = r2 + r4;
        r0.setExact(r12, r8, r6);
        if (r1 == 0) goto L_0x0079;
    L_0x0075:
        r2 = r2 + r4;
        r0.set(r12, r2, r6);
    L_0x0079:
        r13.r = r11;
        if (r1 == 0) goto L_0x0086;
    L_0x007d:
        r0 = G;
        r1 = 14;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
    L_0x0086:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.a():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(boolean r4) {
        /*
        r3_this = this;
        r2 = 1;
        r0 = r3.A;
        r0.a(r2);
        r0 = r3.d;
        r0.f();
        r3.h();
        r3.s();
        if (r4 == 0) goto L_0x0036;
    L_0x0013:
        r0 = G;
        r1 = 3;
        r0 = r0[r1];
        r0 = r3.getSystemService(r0);
        r0 = (android.net.ConnectivityManager) r0;
        r0 = r0.getActiveNetworkInfo();
        if (r0 == 0) goto L_0x0031;
    L_0x0024:
        r0 = r0.isConnected();
        if (r0 == 0) goto L_0x0031;
    L_0x002a:
        r3.a();
        r0 = com.whatsapp.messaging.au.a;
        if (r0 == 0) goto L_0x0036;
    L_0x0031:
        r0 = r3.u;
        r0.a(r2);
    L_0x0036:
        r0 = com.whatsapp.App.k;
        r0 = r0.f();
        if (r0 == 0) goto L_0x0043;
    L_0x003e:
        r0 = r3.u;
        r0.a(r2);
    L_0x0043:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.d(boolean):void");
    }

    static void b(MessageService messageService) {
        messageService.n();
    }

    public static void a(Context context, boolean z, boolean z2, boolean z3, String str, String[] strArr) {
        a(context, z, z2, z3, str, strArr, false);
    }

    private boolean g() {
        return this.a;
    }

    public static void b(Context context, boolean z) {
        context.startService(new Intent(context, MessageService.class).setAction(G[39]).putExtra(G[38], z));
    }

    static void c(MessageService messageService, boolean z) {
        messageService.d(z);
    }

    static boolean x() {
        Log.i(G[48]);
        w.await();
        boolean z = p.get();
        Log.i(G[47] + z);
        return z;
    }

    private void a(Messenger messenger) {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(G[17]);
        this.e = messenger;
        this.b = true;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            this.D = activeNetworkInfo.getType();
        }
        this.o = new HandlerThread(G[18]);
        this.o.start();
        this.B = new Handler(this.o.getLooper());
        registerReceiver(this.C, new IntentFilter(i), null, this.B);
        if (registerReceiver(this.C, new IntentFilter(G[16]), null, this.B) == null) {
            this.B.post(new ah(this));
        }
        a(true);
        if (this.f) {
            this.d.c();
        }
        ak4.a((Context) this);
    }

    static {
        String[] strArr = new String[70];
        String str = "`\u0003bW\bk\u000b`QN{\u000b=IBl\u0019}UL7\n}PI";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            int i3;
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i4 = 0; length > i4; i4++) {
                char c = cArr[i4];
                switch (i4 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 24;
                        break;
                    case ay.f /*1*/:
                        i3 = 110;
                        break;
                    case ay.n /*2*/:
                        i3 = 18;
                        break;
                    case ay.p /*3*/:
                        i3 = 39;
                        break;
                    default:
                        i3 = 39;
                        break;
                }
                cArr[i4] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    strArr2 = strArr3;
                    str = "k\u000baTNw\u00002FDl\u0007dB";
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "{\u0001|IB{\u001a{QNl\u0017";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "y\u0002sUJ";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=KH\u007f\u0001gS\nl\u0007\u007fBU7\u001cwTBl";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=IBl\u0019}UL7\u001deNS{\u00062HK|S";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "8\u0000wP\u001a";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "y\u0002sUJ";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=DKq\u000b|S\nh\u0007|@BjCfNJ}\u001c=TSy\u001cf";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "k\u000baTNw\u00002NIy\rfNQ}";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "y\u0002sUJ";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=UBl\u001ck\b";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "~\u0001`DB";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=UBl\u001ck\bW}\u0000vNI\u007f";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "{\u0001\u007f\tPp\u000ffTFh\u001e<jBk\u001ds@BK\u000b`QN{\u000b<ub[!\\ib[:";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "y\u0000vUHq\n<IBl@qHIv@QhiV+QsnN'F~x[&Si`]";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "{\u0001|IB{\u001a{QNl\u0017";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    str = "U\u000baTF\u007f\u000bABUn\u0007qB\u0007[\u0001|IB{\u001a{QNl\u00172oFv\n~BU";
                    i = 17;
                    i2 = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    strArr2 = strArr3;
                    str = "u\u000baTF\u007f\u000bMTBj\u0018{DB7\u0002}@@}\nMAKy\t=JRk\u001aMN@v\u0001`Bxv\u000bfPHj\u0005MHI{\u000b";
                    i = 18;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "u\u000baTF\u007f\u000bMTBj\u0018{DB7\u0002}@@}\nMAKy\t=JRk\u001aMUB{\u0001|IB{\u001a";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "u\u000baTF\u007f\u000bMTBj\u0018{DB7\u0002}@@}\nMAKy\t=CNk\r}II}\rfBC";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "y\u0002sUJ";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=KH\u007f\u0001gS\nl\u0007\u007fBU7\u000b|FEt\u000b";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=KH\u007f\u0001gS\nl\u0007\u007fBU7\u001dfFUl\u0007tIB{\u000baTFj\u0017";
                    i = 23;
                    i2 = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    strArr2 = strArr3;
                    str = "y\u0002sUJ";
                    i = 24;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "{\u0001\u007f\tPp\u000ffTFh\u001e<jBk\u001ds@BK\u000b`QN{\u000b<ub[!\\ib[:";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "w\u0018wUUq\nwxB`\u001e{UB|";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "~\u000f~KEy\ryxNh\u001d";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "j\u000baBS";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "{\u0006wDLG\r}II}\rfNHv";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "~\u0001`DB";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "q\u001eMFC|\u001cwTT";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "{\u0001\u007f\tPp\u000ffTFh\u001e<jBk\u001ds@BK\u000b`QN{\u000b<tsY<F";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "{\u0001\u007f\tPp\u000ffTFh\u001e<jBk\u001ds@BK\u000b`QN{\u000b<tsW>MihG<WtsY<F";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "y\u0002sUJ";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=DKq\u000b|S\nh\u0007|@BjCfNJ}\u001c=TSw\u001e";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=DU}\u000ffB";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "t\u0001|@x{\u0001|IB{\u001a";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    str = "{\u0001\u007f\tPp\u000ffTFh\u001e<jBk\u001ds@BK\u000b`QN{\u000b<tbL1QhiV+QsnW Ms~H+";
                    i = 38;
                    i2 = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    strArr2 = strArr3;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=IBl\u0019}UL7\u000fqSNn\u000b2";
                    i = 39;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "{\u0001|IB{\u001a{QNl\u0017";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "8\u0007auBl\u001ck\u001a";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "y\u0002sUJ";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "{\u0001|IB{\u001a{QNl\u00172UBl\u001ck\u0007Ft\u000f`J\u0007{\u000f|DBt\u000bv";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "{\u0001|IB{\u001a{QNl\u00172UBl\u001ck\u0007Ft\u000f`J\u0007k\u000bf\u0007Aw\u001c2\u0011\u0017(^\"JT8\b`HJ8\u0000}P";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "y\u0002sUJ";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "{\u000fbSNn\u000b2PN~\u00072TSy\u001agT\u0007q\u001d2";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "y\u0019sNSq\u0000u\u0007Dy\u001efNQ}NeNAqNaSFl\u001ba";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=TSy\u001cf";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=CBk\u001a`H^";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=TSw\u001e";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "q\u0000fBUj\u001bbSB|NeONt\u000b2PFq\u001a{I@8\u0001|\u0007Dw\u0000|BDl\u0007dNSaNzFI|\u0002wU\u0007l\u0006`BF|NfH\u0007}\u0016{S";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=EF{\u0005MHA~A`BT}\u001a";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=KH\u007f\u0001gS\nl\u0007\u007fBU7\n{TFz\u0002w";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "y\u0002sUJ";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "~\u0001`DB";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "{\u0001\u007f\tPp\u000ffTFh\u001e<jBk\u001ds@BK\u000b`QN{\u000b<tsY<F";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "{\u0001\u007f\tPp\u000ffTFh\u001e<jBk\u001ds@BK\u000b`QN{\u000b<tbL1QhiV+QsnW Ms~H+";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "w\u0018wUUq\nwxB`\u001e{UB|";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "t\u0001|@x{\u0001|IB{\u001a";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "~\u000f~KEy\ryxNh\u001d";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "{\u0001\u007f\tPp\u000ffTFh\u001e<jBk\u001ds@BK\u000b`QN{\u000b<tsW>MihG<WtsY<F";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "q\u001eMFC|\u001cwTT";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "j\u000baBS";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "{\u0006wDLG\r}II}\rfNHv";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "{\u0001\u007f\tPp\u000ffTFh\u001e<jBk\u001ds@BK\u000b`QN{\u000b<ub[!\\ib[:";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=UB{\u0001|IB{\u001a=IBl\u0019}ULG\u001b|FQy\u0007~FEt\u000b";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=UB{\u0001|IB{\u001a=IHl1vNT{\u0001|IB{\u001awC\b{\u0006wDLG\r}II}\rfNQq\u001ak";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=IBl\u0019}UL7\u0007uIHj\u000b2\u000f";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i2] = str;
                    G = strArr3;
                    StringBuilder append = new StringBuilder().append(MessageService.class.getCanonicalName());
                    str = "6-]ii]-FnqQ:Kxu]:@~xY-FnhV";
                    i = -1;
                    while (true) {
                        toCharArray = str.toCharArray();
                        int length2 = toCharArray.length;
                        char[] cArr2 = toCharArray;
                        for (int i5 = 0; length2 > i5; i5++) {
                            char c2 = cArr2[i5];
                            switch (i5 % 5) {
                                case PBE.MD5 /*0*/:
                                    i3 = 24;
                                    break;
                                case ay.f /*1*/:
                                    i3 = 110;
                                    break;
                                case ay.n /*2*/:
                                    i3 = 18;
                                    break;
                                case ay.p /*3*/:
                                    i3 = 39;
                                    break;
                                default:
                                    i3 = 39;
                                    break;
                            }
                            cArr2[i5] = (char) (i3 ^ c2);
                        }
                        str = new String(cArr2).intern();
                        switch (i) {
                            case PBE.MD5 /*0*/:
                                m = append.append(str).toString();
                                append = new StringBuilder().append(MessageService.class.getCanonicalName());
                                str = "6-^nbV:MwnV)WuxY-FnhV";
                                i = 1;
                                break;
                            case ay.f /*1*/:
                                c = append.append(str).toString();
                                p = new AtomicBoolean();
                                w = new CountDownLatch(1);
                            default:
                                i = append.append(str).toString();
                                append = new StringBuilder().append(MessageService.class.getCanonicalName());
                                str = "6\"]`hM:MfdL']i";
                                i = 0;
                                break;
                        }
                    }
                default:
                    strArr2[i2] = str;
                    str = "`\u0003bW\bk\u000b`QN{\u000b=IBl\u0019}UL7\u001bb";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private long i() {
        if (this.t > 172800000) {
            return 172800000;
        }
        this.y += this.t;
        this.t = this.y - this.t;
        return this.y - this.t;
    }

    static void a(MessageService messageService, Messenger messenger) {
        messageService.a(messenger);
    }

    private void a(boolean z) {
        a(z, false, null, null, false);
    }

    public void c() {
        App.v(G[2]);
        ba.c(this.e);
        r();
        y();
        a(true);
        ba.a(this.e);
    }

    public static void a(Context context, boolean z, boolean z2) {
        a(context, z, z2, false, null, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.os.Message r5) {
        /*
        r4_this = this;
        r3 = 1;
        r0 = com.whatsapp.messaging.au.a;
        r1 = com.whatsapp.messaging.au.a(r5);
        switch(r1) {
            case 2: goto L_0x003a;
            case 3: goto L_0x000a;
            case 4: goto L_0x0028;
            case 5: goto L_0x000a;
            case 6: goto L_0x0014;
            case 7: goto L_0x0014;
            case 8: goto L_0x000a;
            case 9: goto L_0x000a;
            case 10: goto L_0x003d;
            case 11: goto L_0x000a;
            case 12: goto L_0x003a;
            case 13: goto L_0x003a;
            case 14: goto L_0x003a;
            case 15: goto L_0x003a;
            case 16: goto L_0x000a;
            case 17: goto L_0x003a;
            case 18: goto L_0x003a;
            case 19: goto L_0x000a;
            case 20: goto L_0x003a;
            case 21: goto L_0x000a;
            case 22: goto L_0x000a;
            case 23: goto L_0x003a;
            case 24: goto L_0x003a;
            case 25: goto L_0x003a;
            case 26: goto L_0x000a;
            case 27: goto L_0x000a;
            case 28: goto L_0x003a;
            case 29: goto L_0x003a;
            case 30: goto L_0x003a;
            case 31: goto L_0x0014;
            case 32: goto L_0x0014;
            case 33: goto L_0x003a;
            case 34: goto L_0x003a;
            case 35: goto L_0x000a;
            case 36: goto L_0x000a;
            case 37: goto L_0x0014;
            case 38: goto L_0x000a;
            case 39: goto L_0x000a;
            case 40: goto L_0x000a;
            case 41: goto L_0x000a;
            case 42: goto L_0x000a;
            case 43: goto L_0x000a;
            case 44: goto L_0x000a;
            case 45: goto L_0x000a;
            case 46: goto L_0x000a;
            case 47: goto L_0x000a;
            case 48: goto L_0x000a;
            case 49: goto L_0x000a;
            case 50: goto L_0x000a;
            case 51: goto L_0x000a;
            case 52: goto L_0x000a;
            case 53: goto L_0x000a;
            case 54: goto L_0x000a;
            case 55: goto L_0x000a;
            case 56: goto L_0x003a;
            case 57: goto L_0x003a;
            case 58: goto L_0x000a;
            case 59: goto L_0x003a;
            case 60: goto L_0x003a;
            case 61: goto L_0x003a;
            case 62: goto L_0x003a;
            case 63: goto L_0x003a;
            case 64: goto L_0x003a;
            case 65: goto L_0x003a;
            case 66: goto L_0x000a;
            case 67: goto L_0x003a;
            case 68: goto L_0x003a;
            case 69: goto L_0x003a;
            case 70: goto L_0x003a;
            case 71: goto L_0x003a;
            case 72: goto L_0x000a;
            case 73: goto L_0x000a;
            case 74: goto L_0x000a;
            case 75: goto L_0x0014;
            case 76: goto L_0x003a;
            case 77: goto L_0x003a;
            case 78: goto L_0x003a;
            case 79: goto L_0x003a;
            case 80: goto L_0x003a;
            case 81: goto L_0x003a;
            case 82: goto L_0x003a;
            case 83: goto L_0x000a;
            case 84: goto L_0x000a;
            case 85: goto L_0x000a;
            case 86: goto L_0x0014;
            case 87: goto L_0x000a;
            case 88: goto L_0x003a;
            case 89: goto L_0x003a;
            case 90: goto L_0x003a;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = r4.e;
        r1 = android.os.Message.obtain(r5);
        com.whatsapp.messaging.ba.a(r0, r1);
    L_0x0013:
        return;
    L_0x0014:
        r1 = r4.e;
        r2 = android.os.Message.obtain(r5);
        com.whatsapp.messaging.ba.a(r1, r2);
        r4.r();
        r4.y();
        r4.a(r3);
        if (r0 == 0) goto L_0x0013;
    L_0x0028:
        r4.r();
        r1 = r5.obj;
        if (r1 == 0) goto L_0x0013;
    L_0x002f:
        r1 = r4.e;
        r2 = android.os.Message.obtain(r5);
        com.whatsapp.messaging.ba.a(r1, r2);
        if (r0 == 0) goto L_0x0013;
    L_0x003a:
        r4.r();
    L_0x003d:
        r4.y();
        r4.a(r3);
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.b(android.os.Message):void");
    }

    static void a(MessageService messageService, boolean z) {
        messageService.e(z);
    }

    public static void b(Context context) {
        context.startService(new Intent(context, MessageService.class).setAction(G[34]));
    }

    private void k() {
        j();
    }

    static Handler f(MessageService messageService) {
        return messageService.B;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean d() {
        /*
        r10_this = this;
        r8 = 600000; // 0x927c0 float:8.40779E-40 double:2.964394E-318;
        r6 = 2;
        r0 = 1;
        r2 = 0;
        r1 = G;
        r3 = 24;
        r1 = r1[r3];
        com.whatsapp.util.Log.i(r1);
        r1 = r10.a;
        if (r1 != 0) goto L_0x0056;
    L_0x0013:
        r1 = r10.s;
        r3 = new android.content.IntentFilter;
        r4 = m;
        r3.<init>(r4);
        r10.registerReceiver(r1, r3);
        r10.a = r0;
        r1 = r0;
    L_0x0022:
        if (r1 == 0) goto L_0x0055;
    L_0x0024:
        r0 = G;
        r3 = 25;
        r0 = r0[r3];
        r0 = r10.getSystemService(r0);
        r0 = (android.app.AlarmManager) r0;
        r3 = new android.content.Intent;
        r4 = m;
        r3.<init>(r4);
        r2 = android.app.PendingIntent.getBroadcast(r10, r2, r3, r2);
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 19;
        if (r3 < r4) goto L_0x004d;
    L_0x0041:
        r4 = android.os.SystemClock.elapsedRealtime();
        r4 = r4 + r8;
        r0.setExact(r6, r4, r2);
        r3 = com.whatsapp.messaging.au.a;
        if (r3 == 0) goto L_0x0055;
    L_0x004d:
        r4 = android.os.SystemClock.elapsedRealtime();
        r4 = r4 + r8;
        r0.set(r6, r4, r2);
    L_0x0055:
        return r1;
    L_0x0056:
        r1 = r2;
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.d():boolean");
    }

    public void onCreate() {
        super.onCreate();
        Log.i(G[37]);
        registerReceiver(this.h, new IntentFilter(c));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(boolean r13) {
        /*
        r12_this = this;
        r10 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r9 = 2;
        r3 = 1;
        r2 = 0;
        r5 = com.whatsapp.messaging.au.a;
        r0 = G;
        r1 = 41;
        r0 = r0[r1];
        r0 = r12.getSystemService(r0);
        r0 = (android.net.ConnectivityManager) r0;
        r6 = r0.getActiveNetworkInfo();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = G;
        r4 = 40;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r0 = r0.append(r6);
        r1 = G;
        r4 = 42;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r0 = r0.append(r13);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        com.whatsapp.App.C();
        if (r6 != 0) goto L_0x0053;
    L_0x0045:
        r0 = r12.k;
        r1 = r12.k;
        r4 = -1;
        r1 = android.os.Message.obtain(r1, r2, r4, r2);
        r0.sendMessage(r1);
        if (r5 == 0) goto L_0x00f7;
    L_0x0053:
        r0 = r6.getState();
        r1 = android.net.NetworkInfo.State.CONNECTED;
        if (r0 != r1) goto L_0x00ba;
    L_0x005b:
        r4 = r3;
    L_0x005c:
        if (r4 == 0) goto L_0x00f4;
    L_0x005e:
        r0 = com.whatsapp.messaging.CaptivePortalActivity.a(r6);
        r1 = r0;
    L_0x0063:
        r7 = r12.k;
        r8 = r12.k;
        r6 = r6.getType();
        if (r4 == 0) goto L_0x00bc;
    L_0x006d:
        if (r1 != 0) goto L_0x00bc;
    L_0x006f:
        r0 = r3;
    L_0x0070:
        r0 = android.os.Message.obtain(r8, r2, r6, r0);
        r7.sendMessage(r0);
        if (r4 == 0) goto L_0x00be;
    L_0x0079:
        if (r1 == 0) goto L_0x00be;
    L_0x007b:
        if (r13 != 0) goto L_0x00e9;
    L_0x007d:
        r0 = new android.content.Intent;
        r1 = i;
        r0.<init>(r1);
        r1 = r12.getApplicationContext();
        r1 = android.app.PendingIntent.getBroadcast(r1, r2, r0, r2);
        r0 = G;
        r2 = 43;
        r0 = r0[r2];
        r0 = r12.getSystemService(r0);
        r0 = (android.app.AlarmManager) r0;
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 19;
        if (r2 < r3) goto L_0x00a8;
    L_0x009e:
        r2 = android.os.SystemClock.elapsedRealtime();
        r2 = r2 + r10;
        r0.setExact(r9, r2, r1);
        if (r5 == 0) goto L_0x00b0;
    L_0x00a8:
        r2 = android.os.SystemClock.elapsedRealtime();
        r2 = r2 + r10;
        r0.set(r9, r2, r1);
    L_0x00b0:
        r0 = G;
        r1 = 45;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
    L_0x00b9:
        return;
    L_0x00ba:
        r4 = r2;
        goto L_0x005c;
    L_0x00bc:
        r0 = r2;
        goto L_0x0070;
    L_0x00be:
        r0 = new android.content.Intent;
        r3 = i;
        r0.<init>(r3);
        r3 = r12.getApplicationContext();
        r4 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r2 = android.app.PendingIntent.getBroadcast(r3, r2, r0, r4);
        if (r2 == 0) goto L_0x00e9;
    L_0x00d1:
        r0 = G;
        r3 = 44;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r0 = G;
        r3 = 46;
        r0 = r0[r3];
        r0 = r12.getSystemService(r0);
        r0 = (android.app.AlarmManager) r0;
        r0.cancel(r2);
    L_0x00e9:
        r0 = p;
        r0.set(r1);
        r0 = w;
        r0.countDown();
        goto L_0x00b9;
    L_0x00f4:
        r1 = r2;
        goto L_0x0063;
    L_0x00f7:
        r1 = r2;
        goto L_0x00e9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.b(boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(boolean r4) {
        /*
        r3_this = this;
        r2 = 1;
        r0 = r3.q;
        if (r0 == r4) goto L_0x0028;
    L_0x0005:
        if (r4 == 0) goto L_0x0015;
    L_0x0007:
        r0 = G;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r3.a(r2);
        r0 = com.whatsapp.messaging.au.a;
        if (r0 == 0) goto L_0x0026;
    L_0x0015:
        r0 = G;
        r1 = 0;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r3.b;
        if (r0 == 0) goto L_0x0026;
    L_0x0021:
        r0 = r3.e;
        com.whatsapp.messaging.ba.a(r0, r2);
    L_0x0026:
        r3.q = r4;
    L_0x0028:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.e(boolean):void");
    }

    public IBinder onBind(Intent intent) {
        return this.l;
    }

    static void a(MessageService messageService, int i) {
        messageService.a(i);
    }

    static Messenger i(MessageService messageService) {
        return messageService.e;
    }

    static String w() {
        return c;
    }

    static void b(MessageService messageService, boolean z) {
        messageService.b(z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r12, int r13, int r14) {
        /*
        r11_this = this;
        r10 = 1;
        r9 = 0;
        r7 = com.whatsapp.messaging.au.a;
        if (r12 == 0) goto L_0x00b2;
    L_0x0006:
        r0 = r12.getAction();
        r6 = r0;
    L_0x000b:
        if (r6 != 0) goto L_0x0012;
    L_0x000d:
        r11.u();
        if (r7 == 0) goto L_0x00b1;
    L_0x0012:
        r0 = G;
        r1 = 62;
        r0 = r0[r1];
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0028;
    L_0x001e:
        r11.q();
        r11.j = r10;
        r11.stopSelf();
        if (r7 == 0) goto L_0x00b1;
    L_0x0028:
        r0 = G;
        r1 = 57;
        r0 = r0[r1];
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x003b;
    L_0x0034:
        r11.j = r9;
        r11.u();
        if (r7 == 0) goto L_0x00b1;
    L_0x003b:
        r0 = G;
        r1 = 66;
        r0 = r0[r1];
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x0093;
    L_0x0047:
        r11.r = r9;
        r11.u();
        r0 = G;
        r1 = 64;
        r0 = r0[r1];
        r0 = r12.getBooleanExtra(r0, r9);
        r1 = G;
        r2 = 56;
        r1 = r1[r2];
        r1 = r12.getBooleanExtra(r1, r9);
        r2 = G;
        r3 = 65;
        r2 = r2[r3];
        r2 = r12.getBooleanExtra(r2, r9);
        r3 = G;
        r4 = 63;
        r3 = r3[r4];
        r3 = r12.getStringExtra(r3);
        r4 = G;
        r5 = 61;
        r4 = r4[r5];
        r4 = r12.getStringArrayExtra(r4);
        r5 = G;
        r8 = 59;
        r5 = r5[r8];
        r5 = r12.getBooleanExtra(r5, r9);
        if (r0 == 0) goto L_0x008d;
    L_0x008a:
        r11.y();
    L_0x008d:
        r0 = r11;
        r0.a(r1, r2, r3, r4, r5);
        if (r7 == 0) goto L_0x00b1;
    L_0x0093:
        r0 = G;
        r1 = 58;
        r0 = r0[r1];
        r0 = r6.equals(r0);
        if (r0 == 0) goto L_0x00b1;
    L_0x009f:
        r11.u();
        r0 = G;
        r1 = 60;
        r0 = r0[r1];
        r0 = r12.getBooleanExtra(r0, r9);
        if (r0 == 0) goto L_0x00b1;
    L_0x00ae:
        r11.k();
    L_0x00b1:
        return r10;
    L_0x00b2:
        r0 = 0;
        r6 = r0;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.onStartCommand(android.content.Intent, int, int):int");
    }

    public void a(String str, byte[] bArr, bt btVar) {
        this.F = str;
        this.x = bArr;
        this.d = btVar;
        this.f = true;
        a(true);
        if (this.b) {
            btVar.c();
        }
    }

    private void n() {
        this.d.a();
    }

    private void a(c3 c3Var) {
        this.d.a(c3Var);
        this.A.a(true);
    }

    private void e() {
        this.A.a(false);
        this.d.b();
        if (App.f((Context) this)) {
            f();
        }
        y();
        j();
        l();
    }

    private void o() {
        this.d.e();
    }

    static void a(MessageService messageService, c3 c3Var) {
        messageService.a(c3Var);
    }

    public void t() {
        ba.e(this.e);
    }

    static void h(MessageService messageService) {
        messageService.o();
    }

    private void a(int i) {
        if (i != this.D) {
            Log.i(G[6] + this.D + G[7] + i);
            if (this.b) {
                ba.a(this.e, true);
            }
            this.D = i;
            ak4.a((Context) this);
        }
    }

    public void a(String str, byte[] bArr) {
        this.F = str;
        this.x = bArr;
    }

    private void b() {
        this.d.d();
    }

    static String m() {
        return m;
    }

    static void a(MessageService messageService) {
        messageService.b();
    }

    private void a(Message message) {
        this.d.a(message);
    }

    public MessageService() {
        boolean z = false;
        boolean z2 = au.a;
        this.l = new c(this);
        this.v = new b_(this);
        this.b = false;
        this.n = new Messenger(new d(this));
        this.f = false;
        this.q = false;
        this.D = -1;
        this.t = 10000;
        this.y = 20000;
        this.u = new k(3, G[20], true);
        this.z = new k(3, G[19], false);
        this.A = new k(3, G[21], true);
        this.r = false;
        this.j = false;
        this.C = new BroadcastReceiver() {
            private static final String[] z;
            final MessageService a;

            static {
                String[] strArr = new String[4];
                String str = "S7d!AQvy\"\u0004E9~9\u0004V>h.O{3y:KG=^9EA3-?Q[8l/HPl-";
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
                                i3 = 53;
                                break;
                            case ay.f /*1*/:
                                i3 = 86;
                                break;
                            case ay.n /*2*/:
                                i3 = 13;
                                break;
                            case ay.p /*3*/:
                                i3 = 77;
                                break;
                            default:
                                i3 = 36;
                                break;
                        }
                        cArr[i2] = (char) (i3 ^ c);
                    }
                    str = new String(cArr).intern();
                    switch (obj) {
                        case PBE.MD5 /*0*/:
                            strArr2[i] = str;
                            str = "S7d!AQvy\"\u0004E9~9\u0004V>h.O{3y:KG=^9EA3-?Q[8l/HPl-";
                            i = 2;
                            strArr2 = strArr3;
                            obj = 1;
                            break;
                        case ay.f /*1*/:
                            strArr2[i] = str;
                            i = 3;
                            strArr2 = strArr3;
                            str = "T8i?K\\2##AAxn\"J[xN\u0002j{\u0013N\u0019mc\u001fY\u0014{v\u001eL\u0003cp";
                            obj = 2;
                            break;
                        case ay.n /*2*/:
                            strArr2[i] = str;
                            z = strArr3;
                        default:
                            strArr2[i] = str;
                            str = "@8f#KB8-$JA3c9\u0004G3n(MC3imM[vn\"J[3n9MC?y4\u0004G3n(MC3\u007fm";
                            i = 1;
                            strArr2 = strArr3;
                            obj = null;
                            break;
                    }
                }
            }

            {
                this.a = r1;
            }

            public void onReceive(Context context, Intent intent) {
                boolean z = au.a;
                if (z[3].equals(intent.getAction())) {
                    if (!MessageService.f(this.a).post(new bu(this))) {
                        Log.w(z[2] + intent);
                    }
                    if (!z) {
                        return;
                    }
                }
                if (MessageService.v().equals(intent.getAction())) {
                    if (!MessageService.f(this.a).post(new aa(this))) {
                        Log.w(z[0] + intent);
                    }
                    if (!z) {
                        return;
                    }
                }
                Log.w(z[1] + intent);
            }
        };
        this.k = new Handler(new u(this));
        this.s = new BroadcastReceiver() {
            private static final String[] z;
            final MessageService a;

            static {
                /* JADX: method processing error */
/*
                Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
                /*
                r1 = 0;
                r0 = 2;
                r3 = new java.lang.String[r0];
                r2 = "!u~z\u0016#u5}\u0017 ~{`Y&~vq\u0010\"~q4\u0010:;y{\u001e;na4\u000b1xp}\u000f1i5";
                r0 = -1;
                r4 = r3;
                r5 = r3;
                r3 = r1;
            L_0x000a:
                r2 = r2.toCharArray();
                r6 = r2.length;
                r7 = r6;
                r8 = r1;
                r6 = r2;
            L_0x0012:
                if (r7 > r8) goto L_0x002f;
            L_0x0014:
                r2 = new java.lang.String;
                r2.<init>(r6);
                r2 = r2.intern();
                switch(r0) {
                    case 0: goto L_0x002a;
                    default: goto L_0x0020;
                };
            L_0x0020:
                r4[r3] = r2;
                r2 = 1;
                r0 = ",vedV'~gb\u00107~:x\u00163t``T rxq\u000b{o|y\u001c;na";
                r3 = r2;
                r4 = r5;
                r2 = r0;
                r0 = r1;
                goto L_0x000a;
            L_0x002a:
                r4[r3] = r2;
                z = r5;
                return;
            L_0x002f:
                r9 = r6[r8];
                r2 = r8 % 5;
                switch(r2) {
                    case 0: goto L_0x0040;
                    case 1: goto L_0x0043;
                    case 2: goto L_0x0046;
                    case 3: goto L_0x0049;
                    default: goto L_0x0036;
                };
            L_0x0036:
                r2 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
            L_0x0038:
                r2 = r2 ^ r9;
                r2 = (char) r2;
                r6[r8] = r2;
                r2 = r8 + 1;
                r8 = r2;
                goto L_0x0012;
            L_0x0040:
                r2 = 84;
                goto L_0x0038;
            L_0x0043:
                r2 = 27;
                goto L_0x0038;
            L_0x0046:
                r2 = 21;
                goto L_0x0038;
            L_0x0049:
                r2 = 20;
                goto L_0x0038;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.AnonymousClass_3.<clinit>():void");
            }

            {
                this.a = r1;
            }

            public void onReceive(Context context, Intent intent) {
                boolean z = au.a;
                if (MessageService.m().equals(intent.getAction())) {
                    Log.i(z[1]);
                    if (!App.f(this.a)) {
                        MessageService.e(this.a);
                        MessageService.d(this.a);
                        if (!z) {
                            return;
                        }
                    }
                    if (Voip.f()) {
                        MessageService.g(this.a);
                        ba.a(MessageService.i(this.a));
                        if (!z) {
                            return;
                        }
                    }
                    ba.a(MessageService.i(this.a), false);
                    if (!z) {
                        return;
                    }
                }
                Log.w(z[0] + intent);
            }
        };
        this.h = new BroadcastReceiver() {
            private static final String[] z;
            final MessageService a;

            static {
                /* JADX: method processing error */
/*
                Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
                /*
                r1 = 0;
                r0 = 2;
                r3 = new java.lang.String[r0];
                r2 = "\u0001TZd\t\u0003T\u0011c\b\u0000__~F\u0006_Ro\u000f\u0002_U*\u000f\u001a\u001aRf\u000f\u0011TE*\u0016\u001dTVo\u0014THTi\u0003\u001dLTxF";
                r0 = -1;
                r4 = r3;
                r5 = r3;
                r3 = r1;
            L_0x000a:
                r2 = r2.toCharArray();
                r6 = r2.length;
                r7 = r6;
                r8 = r1;
                r6 = r2;
            L_0x0012:
                if (r7 > r8) goto L_0x002f;
            L_0x0014:
                r2 = new java.lang.String;
                r2.<init>(r6);
                r2 = r2.intern();
                switch(r0) {
                    case 0: goto L_0x002a;
                    default: goto L_0x0020;
                };
            L_0x0020:
                r4[r3] = r2;
                r2 = 1;
                r0 = "\fWAzI\u0007_C|\u000f\u0017_\u001ei\n\u001d__~K\u0004S_m\u0003\u0006\u0017Ec\u000b\u0011H\u001el\u000f\u0006_\u0011i\t\u001aTTi\u0012\u001dU_^\u000e\u0006_Pn4\u0011[Us\\";
                r3 = r2;
                r4 = r5;
                r2 = r0;
                r0 = r1;
                goto L_0x000a;
            L_0x002a:
                r4[r3] = r2;
                z = r5;
                return;
            L_0x002f:
                r9 = r6[r8];
                r2 = r8 % 5;
                switch(r2) {
                    case 0: goto L_0x0040;
                    case 1: goto L_0x0043;
                    case 2: goto L_0x0046;
                    case 3: goto L_0x0049;
                    default: goto L_0x0036;
                };
            L_0x0036:
                r2 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
            L_0x0038:
                r2 = r2 ^ r9;
                r2 = (char) r2;
                r6[r8] = r2;
                r2 = r8 + 1;
                r8 = r2;
                goto L_0x0012;
            L_0x0040:
                r2 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
                goto L_0x0038;
            L_0x0043:
                r2 = 58;
                goto L_0x0038;
            L_0x0046:
                r2 = 49;
                goto L_0x0038;
            L_0x0049:
                r2 = 10;
                goto L_0x0038;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.AnonymousClass_4.<clinit>():void");
            }

            public void onReceive(Context context, Intent intent) {
                if (MessageService.w().equals(intent.getAction())) {
                    Log.i(z[1] + MessageService.j(this.a));
                    if (MessageService.j(this.a)) {
                        ba.a(MessageService.i(this.a));
                        if (!au.a) {
                            return;
                        }
                    }
                    return;
                }
                Log.w(z[0] + intent);
            }

            {
                this.a = r1;
            }
        };
        if (DialogToastActivity.i) {
            if (!z2) {
                z = true;
            }
            au.a = z;
        }
    }

    public void p() {
        App.v(G[10]);
        ba.b(this.e);
    }

    private void s() {
        Log.i(G[54]);
        if (this.a) {
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(m), 536870912);
            if (broadcast != null) {
                ((AlarmManager) getSystemService(G[55])).cancel(broadcast);
                broadcast.cancel();
            }
            unregisterReceiver(this.s);
            this.a = false;
        }
    }

    private void h() {
        Log.i(G[36]);
        AlarmManager alarmManager = (AlarmManager) getSystemService(G[35]);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(c), 536870912);
        if (broadcast != null) {
            alarmManager.cancel(broadcast);
        }
    }

    private void c(boolean z) {
        this.g = z;
    }

    static void d(MessageService messageService) {
        messageService.k();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r9, boolean r10, java.lang.String r11, java.lang.String[] r12, boolean r13) {
        /*
        r8_this = this;
        r4 = 0;
        r0 = 1;
        r1 = com.whatsapp.messaging.au.a;
        r2 = r8.v;
        r6 = r2.a(r12);
        r2 = r8.A;
        r2 = r2.a();
        if (r2 != 0) goto L_0x0035;
    L_0x0012:
        if (r10 == 0) goto L_0x0022;
    L_0x0014:
        r0 = G;
        r1 = 68;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r8.e;
        com.whatsapp.messaging.ba.a(r0);
    L_0x0022:
        r0 = com.whatsapp.App.f(r8);
        if (r0 == 0) goto L_0x0034;
    L_0x0028:
        r0 = r8.g();
        if (r0 != 0) goto L_0x0034;
    L_0x002e:
        r0 = r8.d();
        if (r0 == 0) goto L_0x0034;
    L_0x0034:
        return;
    L_0x0035:
        if (r9 == 0) goto L_0x0043;
    L_0x0037:
        r2 = r8.u;
        r2.a(r0);
        r2 = r8.z;
        r2.a(r0);
        if (r1 == 0) goto L_0x004b;
    L_0x0043:
        r2 = r8.u;
        r2 = r2.a();
        if (r2 == 0) goto L_0x0034;
    L_0x004b:
        r2 = r8.q;
        if (r2 == 0) goto L_0x0054;
    L_0x004f:
        r2 = r8.D;
        r3 = -1;
        if (r2 != r3) goto L_0x00a6;
    L_0x0054:
        r2 = r8.u;
        r2 = r2.a();
        if (r2 == 0) goto L_0x009c;
    L_0x005c:
        r2 = r8.z;
        r2 = r2.a();
        if (r2 == 0) goto L_0x009c;
    L_0x0064:
        r2 = r8.z;
        r2.a(r4);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = G;
        r5 = 69;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r3 = r8.q;
        r2 = r2.append(r3);
        r3 = 44;
        r2 = r2.append(r3);
        r3 = r8.D;
        r2 = r2.append(r3);
        r3 = 41;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        com.whatsapp.App.C();
        if (r1 == 0) goto L_0x00a6;
    L_0x009c:
        r0 = G;
        r1 = 67;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        goto L_0x0034;
    L_0x00a6:
        r1 = r8.g;
        if (r1 == 0) goto L_0x0034;
    L_0x00aa:
        r1 = r8.f;
        if (r1 == 0) goto L_0x0034;
    L_0x00ae:
        r1 = r8.b;
        if (r1 == 0) goto L_0x0034;
    L_0x00b2:
        r1 = r8.j;
        if (r1 != 0) goto L_0x0034;
    L_0x00b6:
        r1 = com.whatsapp.App.aX();
        if (r1 != 0) goto L_0x00c2;
    L_0x00bc:
        r1 = com.whatsapp.a12.a();
        if (r1 == 0) goto L_0x00c3;
    L_0x00c2:
        r4 = r0;
    L_0x00c3:
        com.whatsapp.App.g(r4);
        r0 = r8.e;
        r1 = r8.F;
        r2 = r8.x;
        r5 = com.whatsapp.App.a7;
        r3 = r11;
        r7 = r13;
        com.whatsapp.messaging.ba.a(r0, r1, r2, r3, r4, r5, r6, r7);
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.MessageService.a(boolean, boolean, java.lang.String, java.lang.String[], boolean):void");
    }

    public static void a(Context context, boolean z, boolean z2, boolean z3, String str, String[] strArr, boolean z4) {
        context.startService(new Intent(context, MessageService.class).setAction(G[26]).putExtra(G[31], z).putExtra(G[29], z2).putExtra(G[30], z3).putExtra(G[32], str).putExtra(G[28], strArr).putExtra(G[27], z4));
    }

    public void c(Message message) {
        b(message);
    }
}
